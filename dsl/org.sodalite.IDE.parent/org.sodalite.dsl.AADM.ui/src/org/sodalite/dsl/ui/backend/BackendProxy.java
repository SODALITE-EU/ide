package org.sodalite.dsl.ui.backend;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.MarkerCreator;
import org.eclipse.xtext.ui.editor.validation.MarkerIssueProcessor;
import org.eclipse.xtext.ui.validation.MarkerTypeProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.concurrent.CancelableUnitOfWork;
import org.eclipse.xtext.validation.IDiagnosticConverter;
import org.eclipse.xtext.validation.Issue;
import org.osgi.framework.Bundle;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatus;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.KBError;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.ui.validation.AADMDiagnostic;
import org.sodalite.dsl.ui.validation.AADMValidationIssue;

import com.google.common.collect.Lists;

public class BackendProxy {
	private MarkerCreator markerCreator;
	private MarkerTypeProvider markerTypeProvider;
	private IssueResolutionProvider issueResolutionProvider;
	private IDiagnosticConverter converter;
	private Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

	// TODO Configure KBReasonerClient endpoint from preference page information
	private KBReasonerClient kbclient = new KBReasonerClient();

	public void processSaveAADM(ExecutionEvent event) throws IOException {
		// Return selected resource
		IFile file = getSelectedFile();
		String filename = file.getName().substring(0, file.getName().indexOf("."));
		IProject project = getProject(file);
		// Get serialize AADM model in Turtle
		String aadmTTL = readTurtle(filename, project);

		// Send model to the KB
		saveAADM(aadmTTL, filename, event);
	}

	public void processDeployAADM(ExecutionEvent event) throws IOException {
		// Return selected resource
		IFile file = getSelectedFile();
		IProject project = getProject(file);
		// Get serialize AADM model in Turtle
		String filename = file.getName().substring(0, file.getName().indexOf("."));
		String aadmTTL = readTurtle(filename, project);

		// Deploy AADM model
		deployAADM(aadmTTL, filename, event);
	}

	private String readTurtle(String filename, IProject project) throws IOException {
		IFile turtle = project.getFile("src-gen/" + filename + ".ttl");
		String turtle_path = turtle.getLocationURI().toString();
		turtle_path = turtle_path.substring(turtle_path.indexOf("/"));
		Path aadm_path = FileSystems.getDefault().getPath(turtle_path);
		String aadmTTL = new String(Files.readAllBytes(aadm_path));
		return aadmTTL;
	}

	private void saveAADM(String aadmTTL, String submissionId, ExecutionEvent event) {
		Job job = Job.create("Save AADM", (ICoreRunnable) monitor -> {
			try {
				KBSaveReportData saveReport = kbclient.saveAADM(aadmTTL, submissionId);
				if (saveReport.getIRI() == null && saveReport.getErrors() == null) {
					throw new Exception("The AADM model could not be saved into the KB. Please, contact your Sodalite administrator");
				}
				processValidationIssues(saveReport, event);
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						MessageDialog.openInformation(parent, "Save AADM",
								"The selected AADM model has been successfully store in the KB with IRI:\n"
										+ saveReport.getIRI());
					}
				});
			} catch (Exception e) {
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						MessageDialog.openError(parent, "Save AADM",
								"There were problems to store the AADM into the KB: " + e.getMessage());
					}
				});
				e.printStackTrace();
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	private void deployAADM(String aadmTTL, String submissionId, ExecutionEvent event) {
		Job job = new Job("Deploy AADM") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Manage job states
				// TODO Inform about percentage of progress
				SubMonitor subMonitor = SubMonitor.convert(monitor, 5);
				String[] admin_report = new String[2];
				
				try {
					// Save the AADM model into the KB
					subMonitor.setTaskName("Saving AADM");
					KBSaveReportData saveReport = kbclient.saveAADM(aadmTTL, submissionId);
					processValidationIssues(saveReport, event);
					subMonitor.worked(1);

					if (saveReport != null && saveReport.hasErrors())
						throw new Exception("There are detected validation issues in the AADM, please fix them");

					// Ask the AADM JSON serialization to the KB Reasoner
					subMonitor.setTaskName("Getting AADM serialization from the KB");
					String aadmJson = kbclient.getAADM(saveReport.getIRI());
					if (aadmJson == null)
						throw new Exception("Processed ADDM could not be obtained from the KB");
					//Save json for debugging
					//Files.write(Paths.get(System.getProperty("user.dir") + "/" + submissionId + ".json"), aadmJson.getBytes());
					
					subMonitor.worked(2);

					// Ask IaC Blueprint Builder to build the AADM blueprint
					subMonitor.setTaskName("Generating AADM blueprint");
					IaCBuilderAADMRegistrationReport iacReport = kbclient.askIaCBuilderToRegisterAADM(submissionId, aadmJson);
					if (iacReport == null || iacReport.getToken().isEmpty())
						throw new Exception("AADM could not be parsed by IaC Builder");
					admin_report[0] = iacReport.getToken();
					System.out.println ("IaC Builder blueprint token: " + iacReport.getToken());
					subMonitor.worked(3);

					// Ask xOpera to deploy the AADM blueprint
					subMonitor.setTaskName("Deploying AADM");
					Path inputs_yaml_path = getInputsYamlPath();
					DeploymentReport depl_report = kbclient.deployAADM(inputs_yaml_path, iacReport.getToken());
					admin_report[1] = depl_report.getSession_token();
					System.out.println ("xOpera session token: " + depl_report.getSession_token());
					subMonitor.worked(4);

					// Ask xOpera deployment status: info/status (session-token): status JSON
					subMonitor.setTaskName("Checking deployment status");
					DeploymentStatus status = kbclient.getAADMDeploymentStatus(depl_report.getSession_token());
					while (status == DeploymentStatus.IN_PROGRESS) {
						status = kbclient.getAADMDeploymentStatus(depl_report.getSession_token());
						TimeUnit.SECONDS.sleep(5);
					}
					if (status == DeploymentStatus.FAILED)
						throw new Exception("Deployment failed as reported by xOpera");

					// Upon completion, show dialog
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							MessageDialog.openInformation(parent, "Deploy AADM",
									"The selected AADM model has been successfully deployed into the Sodalite backend with token: " + admin_report[0]);
						}
					});
					subMonitor.worked(-1);
					subMonitor.done();
				} catch (Exception e) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							MessageDialog.openError(parent, "Deploy AADM",
									"There were problems to deploy the AADM into the infrastructure: " + e.getMessage() 
									+ "\nPlease contact Sodalite administrator and provide her/him this information: "
									+ "blueprint token: " + admin_report[0] + ", session token: " + admin_report[1]);
						}
					});
					e.printStackTrace();
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		job.setPriority(Job.LONG);
		job.schedule();
	}

	private Path getInputsYamlPath() throws Exception {
		Bundle bundle = Platform.getBundle("org.sodalite.dsl.AADM.ui");
		URL fileURL = bundle.getEntry("resources/inputs.yaml");
		File file = new File(FileLocator.resolve(fileURL).toURI());
		return file.toPath();
	}

	private void processValidationIssues(KBSaveReportData saveReport, ExecutionEvent event) throws Exception {
		// TODO Check there are not warnings (they do not prevent storage in KB)
		if (saveReport != null && saveReport.hasErrors()) {
			List<AADMValidationIssue> issues = readRecommendationsFromKB(saveReport);
			manageRecommendationIssues(event, issues);
			throw new Exception("There are detected validation issues in the AADM, please fix them");
		}
	}

	private List<AADMValidationIssue> readRecommendationsFromKB(KBSaveReportData saveReport) {
		// TODO Read issues from KB recommendations
		List<AADMValidationIssue> issues = new ArrayList<>();

		for (KBError error : saveReport.getErrors()) {
			issues.add(new AADMValidationIssue(
					error.getType() + "." + error.getDescription() + ":" + error.getEntity_name(),
					"node_templates/" + error.getContext()));
		}
		return issues;
	}

	private void manageRecommendationIssues(ExecutionEvent event, List<AADMValidationIssue> validationIssues) {
		XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (xtextEditor != null) {
			IValidationIssueProcessor issueProcessor;
			IXtextDocument xtextDocument = xtextEditor.getDocument();
			IResource resource = xtextEditor.getResource();

			List<Issue> issues = createIssues(xtextDocument, validationIssues);

			if (resource != null)
				issueProcessor = new MarkerIssueProcessor(resource,
						xtextEditor.getInternalSourceViewer().getAnnotationModel(), markerCreator, markerTypeProvider);
			else
				issueProcessor = new AnnotationIssueProcessor(xtextDocument,
						xtextEditor.getInternalSourceViewer().getAnnotationModel(), issueResolutionProvider);

			// Process Issues
			IProgressMonitor monitor = new NullProgressMonitor();
			issueProcessor.processIssues(issues, monitor);
		}
	}

	private List<Issue> createIssues(IXtextDocument xtextDocument, List<AADMValidationIssue> validationIssues) {
		final List<Issue> issues = xtextDocument.tryReadOnly(new CancelableUnitOfWork<List<Issue>, XtextResource>() {
			@Override
			public List<Issue> exec(XtextResource resource, final CancelIndicator outerIndicator) throws Exception {
				resolvedInjectedXtextObjects(resource);
				return createIssues(resource, validationIssues);
			}
		}, () -> Collections.emptyList());
		return issues;
	}

	private void resolvedInjectedXtextObjects(XtextResource resource) {
		issueResolutionProvider = resource.getResourceServiceProvider().get(IssueResolutionProvider.class);
		markerTypeProvider = resource.getResourceServiceProvider().get(MarkerTypeProvider.class);
		markerCreator = resource.getResourceServiceProvider().get(MarkerCreator.class);
		converter = resource.getResourceServiceProvider().get(IDiagnosticConverter.class);
	}

	protected List<Issue> createIssues(XtextResource resource, List<AADMValidationIssue> validationIssues) {
		final List<Issue> result = Lists
				.newArrayListWithExpectedSize(resource.getErrors().size() + resource.getWarnings().size());
		IAcceptor<Issue> acceptor = new ListBasedMarkerAcceptor(result);

		// Create Diagnostics from issues
		List<AADMDiagnostic> diagnostics = new ArrayList<AADMDiagnostic>();

		for (AADMValidationIssue issue : validationIssues) {
			// Add diagnostic
			EObject eObject = resource.getContents().get(0);
			String location = EcoreUtil.getURI(eObject).toString();
			int line = getLine(resource, issue.getPath()); // Compute line based on EObject

			diagnostics.add(new AADMDiagnostic(issue.getMessage(), location, line, 1));
		}

		for (AADMDiagnostic diagnostic : diagnostics) {
			if (!resource.getErrors().contains(diagnostic))
				resource.getErrors().add(diagnostic);
		}

		for (int i = 0; i < resource.getErrors().size(); i++) {
			converter.convertResourceDiagnostic(resource.getErrors().get(i), Severity.ERROR, acceptor);
		}

		for (int i = 0; i < resource.getWarnings().size(); i++) {
			converter.convertResourceDiagnostic(resource.getWarnings().get(i), Severity.WARNING, acceptor);
		}

		return result;
	}

	private int getLine(XtextResource resource, String path) {
		// Extract object path to find nodes
		StringTokenizer st = new StringTokenizer(path, "/");

		int line = 1;

		if (resource.getAllContents().hasNext()) {
			AADM_Model model = (AADM_Model) resource.getAllContents().next();
			if (st.hasMoreTokens()) {
				if ("node_templates".equals(st.nextToken())) {
					line = getNodeLine(model.getNodeTemplates()) - 1; // Correction to point to node-templates correct
																		// line
					if (st.hasMoreTokens()) {
						String node_name = st.nextToken();
						for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
							if (node.getName().contentEquals(node_name)) {
								line = getNodeLine(node);
							}
						}
					}
				}
			}
		}
		return line;
	}

	private int getNodeLine(EObject node) {
		int line = 1;
		for (Adapter adapter : node.eAdapters()) {
			if (adapter instanceof INode) {
				AbstractNode aNode = (AbstractNode) adapter;
				line = aNode.getStartLine();
				break;
			}
		}
		return line;
	}

	private IProject getProject(IResource resource) {
		return resource.getProject();
	}

	private IFile getSelectedFile() {
		IFile file = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				file = (IFile) ((IAdaptable) firstElement).getAdapter(IFile.class);
			}
		}
		return file;
	}

	protected static class ListBasedMarkerAcceptor implements IAcceptor<Issue> {
		private final List<Issue> result;

		protected ListBasedMarkerAcceptor(List<Issue> result) {
			this.result = result;
		}

		@Override
		public void accept(Issue issue) {
			if (issue != null)
				result.add(issue);
		}
	}
}
