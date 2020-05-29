package org.sodalite.dsl.ui.backend;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
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
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.xtext.diagnostics.Severity;
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
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.FeatureBasedDiagnostic;
import org.eclipse.xtext.validation.IDiagnosticConverter;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.osgi.framework.Bundle;
import org.sodalite.dsl.aADM.AADMPackage;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.EPropertyAssignment;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatus;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.KBError;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimization;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBWarning;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;
import org.sodalite.dsl.ui.validation.ValidationIssue;

import com.google.common.collect.Lists;

public class BackendProxy {
	private MarkerCreator markerCreator;
	private MarkerTypeProvider markerTypeProvider;
	private IssueResolutionProvider issueResolutionProvider;
	private IDiagnosticConverter converter;
	private Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	
	// Configure KBReasonerClient endpoint from preference page information
	private KBReasonerClient kbclient;
	
	public BackendProxy() {
		IPreferenceStore store = 
	        	new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.sodalite.dsl.AADM.ui");
		String kbReasonerURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		String iacURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		String xoperaURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		kbclient = new KBReasonerClient(kbReasonerURI, iacURI, xoperaURI);
		System.out.println (
			MessageFormat.format(
				"Sodalite backend configured with [KB Reasoner API: {0}, IaC API: {1}, xOpera {2}", kbReasonerURI, iacURI, xoperaURI)
		);
	}

	public void processSaveAADM(ExecutionEvent event) throws IOException {
		// Return selected resource
		IFile file = getSelectedFile();
		String aadmFilename = file.getName();
		IProject project = getProject(file);
		// Get serialize AADM model in Turtle
		String aadmTTL = readTurtle(aadmFilename, project);

		// Send model to the KB
		String aadmIri = getURI (aadmFilename, project);
		saveAADM(aadmTTL, aadmFilename, aadmIri, project, event);
	}
	
	public void processOptimizeAADM(ExecutionEvent event) throws IOException {
		// Return selected resource
		IFile file = getSelectedFile();
		String aadmFilename = file.getName();
		IProject project = getProject(file);
		// Get serialize AADM model in Turtle
		String aadmTTL = readTurtle(aadmFilename, project);

		// Send model to the KB
		String aadmIri = getURI (aadmFilename, project);
		optimizeAADM(aadmTTL, aadmFilename, aadmIri, project, event);
	}

	
	public void processDeployAADM(ExecutionEvent event) throws IOException {
		// Return selected resource
		IFile file = getSelectedFile();
		IProject project = getProject(file);
		// Get serialize AADM model in Turtle
		String aadmFilename = file.getName();
		String aadmTTL = readTurtle(aadmFilename, project);

		// Deploy AADM model
		String aadmIri = getURI (aadmFilename, project);
		deployAADM(aadmTTL, aadmFilename, aadmIri, project, event);
	}

	private String readTurtle(String filename, IProject project) throws IOException {
		IFile turtle = project.getFile("src-gen/" + filename + ".ttl");
		String turtle_path = turtle.getLocationURI().toString();
		turtle_path = turtle_path.substring(turtle_path.indexOf("/"));
		Path aadm_path = FileSystems.getDefault().getPath(turtle_path);
		String aadmTTL = new String(Files.readAllBytes(aadm_path));
		return aadmTTL;
	}
	
	private String getURI(String filename, IProject project) throws IOException {
		Path path = getAadmPropertiesFile(filename, project);
		String uri = null;
		if (Files.exists(path)) {
			Properties props = new Properties();
			try(final FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);
			final FileLock lock = channel.lock(0L, Long.MAX_VALUE, true)) {
				props.load(Channels.newInputStream(channel));
			}
			uri = props.getProperty("URI");
		}
		
		return uri;
	}

	private Path getAadmPropertiesFile(String aadmFilename, IProject project) {
		IFile propertiesFile = project.getFile("src-gen/." + aadmFilename + ".properties");
		String properties_path = propertiesFile.getLocationURI().toString();
		properties_path = properties_path.substring(properties_path.indexOf("/"));
		Path path = FileSystems.getDefault().getPath(properties_path);
		return path;
	}
	
	private void saveURI(String uri, String fileName, IProject project) throws IOException {
		Path path = getAadmPropertiesFile(fileName, project);
		Properties props = new Properties();

		//Create properties file if it does not exist
		if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS))
		    Files.createFile(path);
		try(final FileChannel inChannel = FileChannel.open(path, StandardOpenOption.READ);
			final FileLock lock = inChannel.lock(0L, Long.MAX_VALUE, true)) {
				props.load(Channels.newInputStream(inChannel));
			}
		props.setProperty("URI", uri);
		try(final FileChannel outChannel = FileChannel.open(path, StandardOpenOption.WRITE)) {
				props.store(Channels.newOutputStream(outChannel), "Sodalite Metadata");
			}
	}

	private void saveAADM(String aadmTTL, String aadmFileName, String aadmIri, IProject project, ExecutionEvent event) {
		Job job = Job.create("Save AADM", (ICoreRunnable) monitor -> {
			try {
				KBSaveReportData saveReport = kbclient.saveAADM(aadmTTL, aadmIri);
				saveURI (saveReport.getIRI(), aadmFileName, project);
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
	
	private void optimizeAADM(String aadmTTL, String aadmFileName, String aadmIri, IProject project, ExecutionEvent event) {
		Job job = Job.create("Get AADM optimization recommendations", (ICoreRunnable) monitor -> {
			try {
				KBOptimizationReportData optimizationReport = kbclient.optimizeAADM(aadmTTL, aadmIri);
				saveURI (optimizationReport.getIRI(), aadmFileName, project);
				if (optimizationReport.getIRI() == null && optimizationReport.getErrors() == null) {
					throw new Exception("AADM optimization recommendations could not be retrieved from the KB. Please, contact your Sodalite administrator");
				}
				processOptimizationIssues(optimizationReport, event);
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						MessageDialog.openInformation(parent, "Get AADM optimization recommendations",
								"Optimization recommendations for AADM model has been successfully retrieved from the KB\n. "
								+ "AADM model have been saved with IRI:\n"
										+ optimizationReport.getIRI());
					}
				});
			} catch (Exception e) {
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						MessageDialog.openError(parent, "Get AADM optimization recommendations",
								"There were problems to retrieve AADM optimization recommendations from the KB: " + e.getMessage());
					}
				});
				e.printStackTrace();
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	private void deployAADM(String aadmTTL, String aadmFileName, String aadmIri, IProject project, ExecutionEvent event) {
		Job job = new Job("Deploy AADM") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Manage job states
				// TODO Inform about percentage of progress
				SubMonitor subMonitor = SubMonitor.convert(monitor, 5);
				String[] admin_report = new String[2];
				
				try {
					// Save the AADM model into the KB
					//TODO use aadmIri in optimizeAADM call
					subMonitor.setTaskName("Saving AADM");
					KBSaveReportData saveReport = kbclient.saveAADM(aadmTTL, aadmIri);
					saveURI (saveReport.getIRI(), aadmFileName, project);
					// TODO save aadmIRI
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
					IaCBuilderAADMRegistrationReport iacReport = kbclient.askIaCBuilderToRegisterAADM(aadmFileName, aadmJson);
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
		if (saveReport != null && (saveReport.hasErrors() || saveReport.hasWarnings())) {
			List<ValidationIssue> issues = readRecommendationsFromKB(saveReport);
			manageRecommendationIssues(event, issues);
			if (saveReport.hasErrors()) {
				throw new Exception("There are detected validation issues in the AADM, please fix them");
			}
		}
	}
	
	private void processOptimizationIssues(KBOptimizationReportData optimizationReport, ExecutionEvent event) throws Exception {
		// TODO Check there are not warnings (they do not prevent storage in KB)
		if (optimizationReport != null && (optimizationReport.hasErrors() || 
				optimizationReport.hasWarnings() || optimizationReport.hasOptimizations())) {
			List<ValidationIssue> issues = readRecommendationsFromKB(optimizationReport);
			manageRecommendationIssues(event, issues);
			if (optimizationReport.hasErrors()) {
				throw new Exception("There are detected validation issues in the AADM, please fix them");
			}
		}
	}

	private List<ValidationIssue> readRecommendationsFromKB(KBSaveReportData saveReport) {
		// TODO Read issues from KB recommendations
		List<ValidationIssue> issues = new ArrayList<>();

		if (saveReport.hasErrors()) {
			for (KBError error : saveReport.getErrors()) {
				issues.add(new ValidationIssue(
						error.getType() + "." + error.getDescription() + " error located at: " + error.getEntity_name(),
						"node_templates/" + error.getContext(), null, Severity.ERROR, error.getType(), error.getDescription()));
			}
		}
		
		if (saveReport.hasWarnings()) {
			for (KBWarning warning : saveReport.getWarnings()) {
				issues.add(new ValidationIssue(
						warning.getType() + "." + warning.getDescription() + " warning located at: " + warning.getEntity_name(),
						"node_templates/" + warning.getContext() + "/" + warning.getEntity_name(), 
						warning.getElementType(), Severity.WARNING, warning.getType(), warning.getDescription()));
			}
		}
		
		return issues;
	}
	
	private List<ValidationIssue> readRecommendationsFromKB(KBOptimizationReportData optimizationReport) {
		// TODO Read issues from KB recommendations
		List<ValidationIssue> issues = new ArrayList<>();

		if (optimizationReport.hasErrors()) {
			for (KBError error : optimizationReport.getErrors()) {
				issues.add(new ValidationIssue(
						error.getType() + "." + error.getDescription() + " error located at: " + error.getEntity_name(),
						"node_templates/" + error.getContext(), null, Severity.ERROR, error.getType(), error.getDescription()));
			}
		}
		
		if (optimizationReport.hasWarnings()) {
			for (KBWarning warning : optimizationReport.getWarnings()) {
				issues.add(new ValidationIssue(
						warning.getType() + "." + warning.getDescription() + " warning located at: " + warning.getEntity_name(),
						"node_templates/" + warning.getContext() + "/" + warning.getEntity_name(), 
						warning.getElementType(), Severity.WARNING, warning.getType(), warning.getDescription()));
			}
		}
		
		if (optimizationReport.hasOptimizations()) {
			for (KBOptimization optimization : optimizationReport.getOptimizations()) {
				issues.add(new ValidationIssue(
						"Suggested optimization recommendations: " + optimization.getOptimizations(),
						"node_templates/" + optimization.getNodeTemplate(), 
						"NodeTemplate", Severity.WARNING, ValidationIssue.OPTIMIZATION, optimization.getOptimizations()));
			}
		}
		
		return issues;
	}


	private void manageRecommendationIssues(ExecutionEvent event, List<ValidationIssue> validationIssues) {
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

	private List<Issue> createIssues(IXtextDocument xtextDocument, List<ValidationIssue> validationIssues) {
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

	protected List<Issue> createIssues(XtextResource resource, List<ValidationIssue> validationIssues) {
		final List<Issue> result = Lists
				.newArrayListWithExpectedSize(resource.getErrors().size() + resource.getWarnings().size());
		IAcceptor<Issue> acceptor = new ListBasedMarkerAcceptor(result);

		// Create Diagnostics from issues
		List<FeatureBasedDiagnostic> diagnostics = new ArrayList<FeatureBasedDiagnostic>();

		for (ValidationIssue issue : validationIssues) {
			// Add diagnostic
			ValidationSourceFeature sourceFeature = getIssueFeature(resource, issue.getPath(), issue.getPathType());
			if (sourceFeature == null)
				continue; //Reported issue that does not correspond to the AADM
			String[] data = processIssueData (issue.getData());
			diagnostics.add(new FeatureBasedDiagnostic(toDiagnosticSeverity(issue.getType()), issue.getMessage(), 
					sourceFeature.getSource(), sourceFeature.getFeature(), ValidationMessageAcceptor.INSIGNIFICANT_INDEX, 
					CheckType.NORMAL, issue.getCode(), data));
		}
		
		for (Diagnostic diagnostic:diagnostics) {
			converter.convertValidatorDiagnostic(diagnostic, acceptor);
		}

		return result;
	}
	
	private String[] processIssueData(Object obj) {
		String[] data = null;
		if (obj instanceof ArrayList) {
			data = (String[]) ((ArrayList<String>)obj).toArray(new String[((ArrayList) obj).size()]);
		}else {
			data = new String[] {obj.toString()};
		}
		return data;
	}

	private ValidationSourceFeature getIssueFeature (XtextResource resource, String path, String path_type) {
		// Extract object path to find nodes
		StringTokenizer st = new StringTokenizer(path, "/");
		ValidationSourceFeature result = null;
		if (resource.getAllContents().hasNext()) {
			AADM_Model model = (AADM_Model) resource.getAllContents().next();
			if (st.hasMoreTokens()) {
				if ("node_templates".equals(st.nextToken())) {
					if (st.hasMoreTokens()) { //Node_template
						String node_name = st.nextToken();
						for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
							if (node.getName().contentEquals(node_name)) {
								result = new ValidationSourceFeature(node, AADMPackage.Literals.ENODE_TEMPLATE__NAME);
								if (st.hasMoreElements()) { //Node_Template children
									String entity_name = st.nextToken();
									if ("Property".equals(path_type)) {
										for (EPropertyAssignment property:node.getNode().getProperties().getProperties()) {
											if (property.getName().contentEquals(entity_name)) {
												result = new ValidationSourceFeature(property, AADMPackage.Literals.EPROPERTY_ASSIGNMENT__NAME);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return result;
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
	
	protected int toDiagnosticSeverity(Severity severity) {
		int diagnosticSeverity = -1;
		switch (severity) {
			case ERROR:
				diagnosticSeverity = Diagnostic.ERROR;
				break;
			case WARNING:
				diagnosticSeverity = Diagnostic.WARNING;
				break;
			default:
				throw new IllegalArgumentException("Unknow severity " + severity);
		}
		return diagnosticSeverity;
	}
	
	protected class ValidationSourceFeature{
		EStructuralFeature feature;
		EObject source;
		
		public ValidationSourceFeature(EObject source, EStructuralFeature feature) {
			this.source = source;
			this.feature = feature;
		}

		public EStructuralFeature getFeature() {
			return feature;
		}

		public EObject getSource() {
			return source;
		}
	}
	
	public static void main (String[] args) throws IOException {
		String aadmIri = "0000:1234:1236:4533:6353";
		Path path = Paths.get("/home/yosu/.aadm.properties");
		Properties props = new Properties();

		//Create properties file if it does not exist
		if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS))
		    Files.createFile(path);
		try(final FileChannel inChannel = FileChannel.open(path, StandardOpenOption.READ);
			final FileLock lock = inChannel.lock(0L, Long.MAX_VALUE, true)) {
				props.load(Channels.newInputStream(inChannel));
			}
		props.setProperty("aadmIRI", aadmIri);
		try(final FileChannel outChannel = FileChannel.open(path, StandardOpenOption.WRITE)) {
				props.store(Channels.newOutputStream(outChannel), "AADM Metadata");
			}
	}

}
