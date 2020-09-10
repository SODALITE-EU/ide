package org.sodalite.dsl.ui.backend;

import java.io.File;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.MarkerCreator;
import org.eclipse.xtext.ui.editor.validation.MarkerIssueProcessor;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.eclipse.xtext.ui.validation.MarkerTypeProvider;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.util.concurrent.CancelableUnitOfWork;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.FeatureBasedDiagnostic;
import org.eclipse.xtext.validation.IDiagnosticConverter;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.sodalite.dsl.AADM.ui.internal.AADMActivator;
import org.sodalite.dsl.aADM.AADMPackage;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.EPropertyAssignment;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatus;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.KBError;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimization;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimization.KBIssue;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationError;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSuggestion;
import org.sodalite.dsl.kb_reasoner_client.types.KBWarning;
import org.sodalite.dsl.optimization.optimization.EAITraining;
import org.sodalite.dsl.optimization.optimization.EAITrainingCase;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;
import org.sodalite.dsl.optimization.optimization.Optimization_Model;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;
import org.sodalite.dsl.ui.validation.ValidationIssue;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.inject.Injector;

public class BackendProxy {
	private MarkerCreator markerCreator;
	private MarkerTypeProvider markerTypeProvider;
	private IssueResolutionProvider issueResolutionProvider;
	private IDiagnosticConverter converter;
	private Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	
	private KBReasonerClient getKBReasoner() {
		// Configure KBReasonerClient endpoint from preference page information
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		String kbReasonerURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		String iacURI = store.getString(PreferenceConstants.IaC_URI);
		String xoperaURI = store.getString(PreferenceConstants.xOPERA_URI);
		KBReasonerClient kbclient = new KBReasonerClient(kbReasonerURI, iacURI, xoperaURI);
		System.out.println(
				MessageFormat.format("Sodalite backend configured with [KB Reasoner API: {0}, IaC API: {1}, xOpera {2}",
						kbReasonerURI, iacURI, xoperaURI));
		return kbclient;
	}

	public void processSaveAADM(ExecutionEvent event) throws IOException, PartInitException {
		// Return selected resource
		IFile aadmFile = getSelectedFile();
		IProject project = getProject(aadmFile);
		// Get serialize AADM model in Turtle
		String aadmTTL = readTurtle(aadmFile.getName(), project);

		// Send model to the KB
		String aadmURI = getAadmURI(aadmFile, project);
		saveAADM(aadmTTL, aadmFile, aadmURI, project, event);
	}

	public void processOptimizeAADM(ExecutionEvent event) throws IOException, PartInitException {
		// Return selected resource
		IFile aadmFile = getSelectedFile();
		IProject project = getProject(aadmFile);
		// Get serialize AADM model in Turtle
		String aadmTTL = readTurtle(aadmFile.getName(), project);

		// Send model to the KB
		String aadmURI = getAadmURI(aadmFile, project);
		optimizeAADM(aadmTTL, aadmFile, aadmURI, project, event);
	}

	private void openFileInEditor(IFile file) throws PartInitException {
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
				try {
					page.openEditor(new FileEditorInput(file), desc.getId());
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void processDeployAADM(ExecutionEvent event) throws Exception {
		// Return selected resource
		IFile aadmFile = getSelectedFile();
		IProject project = getProject(aadmFile);
		// Get serialize AADM model in Turtle
		String aadmTTL = readTurtle(aadmFile.getName(), project);

		// Deploy AADM model
		String aadmURI = getAadmURI(aadmFile, project);
		Path inputs_yaml_path = getInputsYamlPath();
		if (inputs_yaml_path == null)
			throw new Exception("Invalid inputs file, please select a correct one");
		
		deployAADM(aadmTTL, aadmFile, aadmURI, inputs_yaml_path, project, event);
	}

	private String readTurtle(String filename, IProject project) throws IOException {
		IFile turtle = project.getFile("src-gen/" + filename + ".ttl");
		String turtle_path = turtle.getLocationURI().toString();
		turtle_path = turtle_path.substring(turtle_path.indexOf("/"));
		Path aadm_path = FileSystems.getDefault().getPath(turtle_path);
		String aadmTTL = new String(Files.readAllBytes(aadm_path));
		return aadmTTL;
	}

	private String getAadmURI(IFile aadmFile, IProject project) throws IOException {
		Path path = getAadmPropertiesFile(aadmFile, project);
		String uri = null;
		if (Files.exists(path)) {
			Properties props = new Properties();
			try (final FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);
					final FileLock lock = channel.lock(0L, Long.MAX_VALUE, true)) {
				props.load(Channels.newInputStream(channel));
			}
			uri = props.getProperty("URI");
		}

		return uri;
	}

	private Path getAadmPropertiesFile(IFile aadmfile, IProject project) {
		String filepath = aadmfile.toString();
		String filename = filepath.substring(filepath.lastIndexOf("/") + 1);
		int index1 = filepath.indexOf('/', 2) + 1;
		int index2 = filepath.lastIndexOf("/");
		String directory = "";
		if (index2 > index1)
			directory = filepath.substring(index1, index2);
		IFile propertiesFile = project.getFile(directory + "/." + filename + ".properties");
		String properties_path = propertiesFile.getLocationURI().toString();
		properties_path = properties_path.substring(properties_path.indexOf("/"));
		Path path = FileSystems.getDefault().getPath(properties_path);
		return path;
	}

	private void saveURI(String uri, IFile aadmFile, IProject project) throws IOException {
		Path path = getAadmPropertiesFile(aadmFile, project);
		Properties props = new Properties();

		// Create properties file if it does not exist
		if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS))
			Files.createFile(path);
		try (final FileChannel inChannel = FileChannel.open(path, StandardOpenOption.READ);
				final FileLock lock = inChannel.lock(0L, Long.MAX_VALUE, true)) {
			props.load(Channels.newInputStream(inChannel));
		}
		props.setProperty("URI", uri);
		try (final FileChannel outChannel = FileChannel.open(path, StandardOpenOption.WRITE)) {
			props.store(Channels.newOutputStream(outChannel), "Sodalite Metadata");
		}
	}

	private void saveAADM(String aadmTTL, IFile aadmFile, String aadmURI, IProject project, ExecutionEvent event) {
		Job job = Job.create("Save AADM", (ICoreRunnable) monitor -> {
			try {
				KBSaveReportData saveReport = getKBReasoner().saveAADM(aadmTTL, aadmURI, false);
				processValidationIssues(aadmFile, saveReport, event);
				if (saveReport.getURI() == null && saveReport.getErrors() == null) {
					throw new Exception(
							"The AADM model could not be saved into the KB. Please, contact your Sodalite administrator");
				}
				saveURI(saveReport.getURI(), aadmFile, project);

				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						MessageDialog.openInformation(parent, "Save AADM",
								"The selected AADM model has been successfully store in the KB with URI:\n"
										+ saveReport.getURI());
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

	private void optimizeAADM(String aadmTTL, IFile aadmFile, String aadmURI, IProject project, ExecutionEvent event) {
		Job job = Job.create("Get AADM optimization recommendations", (ICoreRunnable) monitor -> {
			try {
				KBOptimizationReportData optimizationReport = getKBReasoner().optimizeAADM(aadmTTL, aadmURI);
				processOptimizationIssues(aadmFile, optimizationReport, event);
				if (optimizationReport.getURI() == null && optimizationReport.getErrors() == null) {
					throw new Exception(
							"AADM optimization recommendations could not be retrieved from the KB. Please, contact your Sodalite administrator");
				}
				saveURI(optimizationReport.getURI(), aadmFile, project);
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						MessageDialog.openInformation(parent, "Get AADM optimization recommendations",
								"Optimization recommendations for AADM model has been successfully retrieved from the KB\n. "
										+ "AADM model have been saved with URI:\n" + optimizationReport.getURI());
					}
				});
			} catch (Exception e) {
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						MessageDialog.openError(parent, "Get AADM optimization recommendations",
								"There were problems during the processing of AADM optimization recommendations from the KB: "
										+ e.getMessage());
					}
				});
				e.printStackTrace();
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	private void deployAADM(String aadmTTL, IFile aadmfile, String aadmURI, Path inputs_yaml_path, IProject project, ExecutionEvent event) {
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
					KBSaveReportData saveReport = getKBReasoner().saveAADM(aadmTTL, aadmURI, true);
					processValidationIssues(aadmfile, saveReport, event);

					if (saveReport != null && saveReport.hasErrors())
						throw new Exception("There are detected validation issues in the AADM, please fix them");

					saveURI(saveReport.getURI(), aadmfile, project);
					subMonitor.worked(1);

					// Ask the AADM JSON serialization to the KB Reasoner
					subMonitor.setTaskName("Getting AADM serialization from the KB");
					String aadmJson = getKBReasoner().getAADM(saveReport.getURI());
					if (aadmJson == null)
						throw new Exception("Processed ADDM could not be obtained from the KB");
					// Save json for debugging
					// Files.write(Paths.get(System.getProperty("user.dir") + "/" + submissionId +
					// ".json"), aadmJson.getBytes());

					subMonitor.worked(2);

					// Ask IaC Blueprint Builder to build the AADM blueprint
					subMonitor.setTaskName("Generating AADM blueprint");
					IaCBuilderAADMRegistrationReport iacReport = getKBReasoner()
							.askIaCBuilderToRegisterAADM(aadmfile.getName(), aadmJson);
					if (iacReport == null || iacReport.getToken().isEmpty())
						throw new Exception("AADM could not be parsed by IaC Builder");
					admin_report[0] = iacReport.getToken();
					System.out.println("IaC Builder blueprint token: " + iacReport.getToken());
					subMonitor.worked(3);

					// Ask xOpera to deploy the AADM blueprint
					subMonitor.setTaskName("Deploying AADM");
					DeploymentReport depl_report = getKBReasoner().deployAADM(inputs_yaml_path, iacReport.getToken());
					admin_report[1] = depl_report.getSession_token();
					System.out.println("xOpera session token: " + depl_report.getSession_token());
					subMonitor.worked(4);

					// Ask xOpera deployment status: info/status (session-token): status JSON
					subMonitor.setTaskName("Checking deployment status");
					DeploymentStatus status = getKBReasoner().getAADMDeploymentStatus(depl_report.getSession_token());
					while (status == DeploymentStatus.IN_PROGRESS) {
						status = getKBReasoner().getAADMDeploymentStatus(depl_report.getSession_token());
						TimeUnit.SECONDS.sleep(5);
					}
					if (status == DeploymentStatus.FAILED)
						throw new Exception("Deployment failed as reported by xOpera");

					// Upon completion, show dialog
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							MessageDialog.openInformation(parent, "Deploy AADM",
									"The selected AADM model has been successfully deployed into the Sodalite backend with token: "
											+ admin_report[0]);
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
											+ "blueprint token: " + admin_report[0] + ", session token: "
											+ admin_report[1]);
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
//		Bundle bundle = Platform.getBundle("org.sodalite.dsl.AADM.ui");
//		URL fileURL = bundle.getEntry("resources/inputs.yaml");
//		File file = new File(FileLocator.resolve(fileURL).toURI());
		String selectedInputFile = selectFile("Select the inputs file for app deployment");
		File file = new File (selectedInputFile);
		return file.toPath();
	}
	
	protected String selectFile (String dialogText){
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		// File standard dialog
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText(dialogText);
		//fileDialog.setFilterExtensions(new String[] { "*.txt" });
		// Put in a readable name for the filter
		//fileDialog.setFilterNames(new String[] { "Textfiles(*.txt)" });
		String selected = fileDialog.open();
		System.out.println("Selected inputs file: " + selected);
		return selected;
	}

	private void processValidationIssues(IFile aadmFile, KBSaveReportData saveReport, ExecutionEvent event) throws Exception {
		// Check there are not warnings (they do not prevent storage in KB)
		if (saveReport != null && (saveReport.hasErrors() || saveReport.hasWarnings() || saveReport.hasSuggestions())) {
			//Open AADM file if not opened to show the errors and warnings
			openFileInEditor(aadmFile);
			List<ValidationIssue> issues = readIssuesFromKB(saveReport);
			manageIssues(event, issues);
			if (saveReport.hasErrors()) {
				throw new Exception("There are detected validation issues in the AADM, please fix them");
			}
		}
	}

	private void processOptimizationIssues(IFile aadmFile, KBOptimizationReportData optimizationReport, ExecutionEvent event)
			throws Exception {
		// Check there are not warnings (they do not prevent storage in KB)
		if (optimizationReport != null && (optimizationReport.hasErrors() || optimizationReport.hasWarnings())) {
			//Open AADM file if not opened to show the errors and warnings
			openFileInEditor(aadmFile);
			
			List<ValidationIssue> issues = readIssuesFromKB(optimizationReport);
			manageIssues(event, issues);
			if (optimizationReport.hasErrors()) {
				throw new Exception("There are detected validation issues in the associated optimization models, please fix them");
			}
		}
		
		if (optimizationReport != null && (optimizationReport.hasOptimizationErrors() || optimizationReport.hasOptimizations())) {
			AADM_Model aadmModel = readAADMModel(aadmFile, event);
			// For each optimization model in the list of issues, open the model and process its issues
			for (String node: getOptimizationNodes (optimizationReport)) {
				String nodeName = node.substring(node.lastIndexOf('/') + 1);
				openOptimizationModel(nodeName, aadmModel);
				List<ValidationIssue> issues = readOptimizationIssuesFromKB(getIssuesForModel (optimizationReport, node));
				manageOptimizationIssues(event, issues);
			}
			
			if (optimizationReport.hasOptimizationErrors() ) {
				throw new Exception("There are detected validation issues in the associated optimization models, please fix them");
			}
		}
	}
	
	private KBOptimizationReportData getIssuesForModel(KBOptimizationReportData optimizationReport, String node) {
		KBOptimizationReportData result = new KBOptimizationReportData();
		List<KBError> errors = new ArrayList<>();
		for (KBError error:optimizationReport.getOptimizationErrors()) {
			if (error instanceof KBOptimizationError) {
				if (getNodeFromContext(error.getContext()).equals(node)) {
					errors.add(error);
				}
			}
		}
		result.setErrors(errors);
		List<KBOptimization> optimizations = new ArrayList<>();
		for (KBOptimization opt: optimizationReport.getOptimizations()) {
			if (opt.getNodeTemplate().contains(node)) {
				optimizations.add(opt);
			}
		}
		result.setOptimizations(optimizations);
		return result;
	}

	private String getNodeFromContext(String context) {
		return context.substring(context.lastIndexOf('/') + 1);
	}

	private void openOptimizationModel(String node, AADM_Model aadmModel) throws PartInitException {
		// Find the associated node in the model and read the bound optimization model.
		ENodeTemplate nodeTemplate = null;
		for (ENodeTemplate template: aadmModel.getNodeTemplates().getNodeTemplates()) {
			if (template.getName().equals(node)) {
				nodeTemplate = template;
				break;
			}
		}
		// Find the optimization model location
		Optimization_Model optimizationModel = nodeTemplate.getNode().getOptimization();
		// Open the optimization model
		IFile file = getFileFromModel(optimizationModel);
		openFileInEditor(file);
	}

	private IFile getFileFromModel(Optimization_Model optimizationModel) {
		URI eUri = optimizationModel.eResource().getURI();
		if (eUri.isPlatformResource()) {
			String platformString = eUri.toPlatformString(true);
			return (IFile) ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
		}
		return null;
	}

	private Set<String> getOptimizationNodes(KBOptimizationReportData optimizationReport) {
		Set<String> nodes = new HashSet<>();
		for (KBError error: optimizationReport.getOptimizationErrors()) {
			KBOptimizationError optError = (KBOptimizationError) error;
			nodes.add(optError.getContext().substring(optError.getContext().lastIndexOf('/') + 1));
		}
		for (KBOptimization opt: optimizationReport.getOptimizations()) {
			nodes.add(opt.getNodeTemplate().substring(opt.getNodeTemplate().lastIndexOf('/') + 1));
		}
		return nodes;
	}

	private AADM_Model readAADMModel(IFile aadmFile, ExecutionEvent event) throws PartInitException {
		openFileInEditor(aadmFile);
		AADM_Model model = null;
		Injector injector = AADMActivator.getInstance().getInjector(
				AADMActivator.ORG_SODALITE_DSL_AADM);
		XtextResourceSet resourceSet = (XtextResourceSet) injector
		        .getInstance(XtextResourceSetProvider.class)
		        .get(aadmFile.getProject());
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		//FIXME Check this behaviour of reading the XTextEditor
		while (xtextEditor == null) {
			xtextEditor = EditorUtils.getActiveXtextEditor(event);
		}
		System.out.println ("Reading XTextEditor: " + xtextEditor);
		if (xtextEditor != null) {
			IValidationIssueProcessor issueProcessor;
			IXtextDocument xtextDocument = xtextEditor.getDocument();
			// FIXME Investigate why the model is not always read, returning null
			int attempt = 0;
			while (model == null) {
				System.out.println ("Reading AADM model. Attempt: " + (++attempt));
				model = (AADM_Model) xtextDocument.readOnly(
						new IUnitOfWork(){
						       public AADM_Model exec(Object resource) {
						    	   AADM_Model model = (AADM_Model) ((XtextResource)resource).getContents().get(0);
						             return model;
						       }
						 });
			}
		}
		//TODO Fix that the optimization models are resolvable
		if (model != null)
			EcoreUtil2.resolveAll(model.eResource());
		return model;
	}

	private List<ValidationIssue> readIssuesFromKB(KBOptimizationReportData optimizationReport) {
		List<ValidationIssue> issues = new ArrayList<>();

		if (optimizationReport.hasErrors()) {
			for (KBError error : optimizationReport.getErrors()) {
				issues.add(
						new ValidationIssue(
								error.getType() + "." + error.getDescription() + " error located at: "
										+ error.getEntity_name(),
								"node_templates/" + error.getContext(), null, Severity.ERROR, error.getType(),
								error.getDescription()));
			}
		}

		if (optimizationReport.hasWarnings()) {
			for (KBWarning warning : optimizationReport.getWarnings()) {
				issues.add(new ValidationIssue(
						warning.getType() + "." + warning.getDescription() + " warning located at: "
								+ warning.getEntity_name(),
						"node_templates/" + warning.getContext() + "/" + warning.getEntity_name(),
						warning.getElementType(), Severity.WARNING, warning.getType(), warning.getDescription()));
			}
		}
		return issues;
	}
	
	private List<ValidationIssue> readOptimizationIssuesFromKB(KBOptimizationReportData optimizationReport) {
		List<ValidationIssue> issues = new ArrayList<>();

		if (optimizationReport.hasOptimizationErrors()) {
			for (KBError error : optimizationReport.getOptimizationErrors()) {
				KBOptimizationError optError = (KBOptimizationError) error;
				String message = "Optimization error: " + optError.getDescription();
				String path = optError.getPath();
				String path_type = "Optimization";
				String data = optError.toString();
				issues.add(new ValidationIssue(message, path, path_type, Severity.ERROR,
						ValidationIssue.OPTIMIZATION_MISMATCH, data));
			}
		}

		if (optimizationReport.hasOptimizations()) {
			for (KBOptimization optimization : optimizationReport.getOptimizations()) {
				for (KBIssue issue: optimization.getIssues()) {
					String message = "Suggested optimization recommendation: " + 
							beautifySuggestion(issue.getValue());
					String path = issue.getPath();
					String path_type = "Optimization";
					String data = issue.toString();
					issues.add(new ValidationIssue(message, path, path_type, Severity.WARNING,
							ValidationIssue.OPTIMIZATION, data));
				}
			}
		}
		return issues;
	}

	private String beautifySuggestion(String suggestion) {
		return suggestion.replace(":{", ": ").replace("}", "").replace(",", ", ").replace("{", "").replace("\"", "");
	}

	private List<ValidationIssue> readIssuesFromKB(KBSaveReportData saveReport) {
		// Read issues from KB recommendations
		List<ValidationIssue> issues = new ArrayList<>();

		if (saveReport.hasErrors()) {
			for (KBError error : saveReport.getErrors()) {
				issues.add(
						new ValidationIssue(
								error.getType() + "." + error.getDescription() + " error located at: "
										+ error.getEntity_name(),
								"node_templates/" + error.getContext(), null, Severity.ERROR, error.getType(),
								error.getDescription()));
			}
		}

		if (saveReport.hasWarnings()) {
			for (KBWarning warning : saveReport.getWarnings()) {
				issues.add(new ValidationIssue(
						warning.getType() + "." + warning.getDescription() + " warning located at: "
								+ warning.getEntity_name(),
						"node_templates/" + warning.getContext() + "/" + warning.getEntity_name(),
						warning.getElementType(), Severity.WARNING, warning.getType(), warning.getDescription()));
			}
		}

		//Suggestions are not shown in model
		if (saveReport.hasSuggestions()) {
			for (KBSuggestion suggestion : saveReport.getSuggestions()) {
				String message = MessageFormat.format(
					"The following nodes can satisfy the requirement {0}: {1}", 
					getDependency(suggestion.getHierarchyPath()), getSuggestedNodes(suggestion.getSuggestions()));
				String path = createPath(suggestion.getHierarchyPath());
				String pathType = getPathType(suggestion.getHierarchyPath());
				String code = getCode (suggestion.getHierarchyPath());
				Map<String, SortedSet<String>> data = new HashMap<>();
				data.put(path, suggestion.getSuggestions());
				issues.add(new ValidationIssue(message, path, pathType, Severity.WARNING, code, data));
			}
		}

		return issues;
	}

	private String getCode(List<String> hierarchyPath) {
		// Assigns a suggestion code based in the issue hierarchy path
		String code = "Suggestion";
		if (hierarchyPath.contains("requirements")){
			code = ValidationIssue.REQUIREMENT;
		}
		
		return code;
	}

	private String getDependency (List<String> entityHierarchy) {
		String dependency = null;
		for (String entry: entityHierarchy) {
			if (entry.contains("requirements")) {
				int index = entityHierarchy.indexOf(entry) + 1;
				dependency = entityHierarchy.get(index);
				break;
			}
		}
		return dependency.substring(dependency.lastIndexOf('/') + 1);
	}
	
	private SortedSet<String> getSuggestedNodes(SortedSet<String> suggestions){
		return suggestions.stream().map(s->s.substring(s.lastIndexOf('/') + 1)).collect(Collectors.toCollection(TreeSet::new));
	}

	private String getPathType(List<String> entityHierarchy) {
		if (entityHierarchy.contains("requirements")) {
			return "requirements";
		} else {
			return "";
		}
	}

	private String createPath(List<String> entityHierarchy) {
		StringBuilder sb = new StringBuilder("node_templates");
		for (String entry : entityHierarchy) {
			if (entry.contains("https"))
				entry = entry.substring(entry.lastIndexOf('/') + 1);
			sb.append('/' + entry);
		}

		return sb.toString();
	}
	
	
	//TODO Fix this code
	private void manageOptimizationIssues(ExecutionEvent event, List<ValidationIssue> validationIssues) {
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

	private void manageIssues(ExecutionEvent event, List<ValidationIssue> validationIssues) {
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
				continue; // Reported issue that does not correspond to the AADM
			String[] data = processIssueData(issue.getData());
			diagnostics.add(new FeatureBasedDiagnostic(toDiagnosticSeverity(issue.getType()), issue.getMessage(),
					sourceFeature.getSource(), sourceFeature.getFeature(),
					ValidationMessageAcceptor.INSIGNIFICANT_INDEX, CheckType.NORMAL, issue.getCode(), data));
		}

		for (Diagnostic diagnostic : diagnostics) {
			converter.convertValidatorDiagnostic(diagnostic, acceptor);
		}

		return result;
	}

	private String[] processIssueData(Object obj) {
		String[] data = null;
		if (obj instanceof ArrayList) {
			data = (String[]) ((ArrayList<String>) obj).toArray(new String[((ArrayList) obj).size()]);
		} else {
			data = new String[] { obj.toString() };
		}
		return data;
	}

	private ValidationSourceFeature getIssueFeature(XtextResource resource, String path, String path_type) {
		// Extract object path to find nodes
		StringTokenizer st = new StringTokenizer(path, "/");
		ValidationSourceFeature result = null;
		if (resource.getAllContents().hasNext()) {
			EObject eobject = resource.getAllContents().next();
			if(eobject instanceof AADM_Model) {
				AADM_Model model = (AADM_Model) eobject;
				result = getAADMIssueFeature(model, path, path_type, st);
			}else if (eobject instanceof Optimization_Model) {
				Optimization_Model model = (Optimization_Model) eobject;
				result = getOptimizationIssueFeature(model, path, path_type);
			}
		}
		return result;
	}

	private ValidationSourceFeature getAADMIssueFeature(AADM_Model model, String path, String path_type,
			StringTokenizer st) {
		ValidationSourceFeature result = null;
		if (st.hasMoreTokens()) {
			if ("node_templates".equals(st.nextToken())) {
				if (st.hasMoreTokens()) { // Node_template
					String node_name = st.nextToken();
					for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
						if (node.getName().contentEquals(node_name)) {
							result = new ValidationSourceFeature(node, AADMPackage.Literals.ENODE_TEMPLATE__NAME);
							if (st.hasMoreElements()) { // Node_Template children
								String entity_name = st.nextToken();
								if ("Property".equals(path_type)) {
									for (EPropertyAssignment property : node.getNode().getProperties()
											.getProperties()) {
										if (property.getName().contentEquals(entity_name)) {
											result = new ValidationSourceFeature(property,
													AADMPackage.Literals.EPROPERTY_ASSIGNMENT__NAME);
										}
									}
								}else if ("requirements".equals(path_type)) {
									boolean req_found = false;
									if (node.getNode().getRequirements()!=null) {
										for (ERequirementAssignment req: node.getNode().getRequirements().getRequirements()) {
											//Target requirement found
											if (req.getName().contentEquals(getRequirement(path))) {
												req_found = true;
												result = new ValidationSourceFeature(req,
														AADMPackage.Literals.EREQUIREMENT_ASSIGNMENT__NAME);
											}
										}										}
									if (!req_found)
										result = new ValidationSourceFeature(node, AADMPackage.Literals.ENODE_TEMPLATE__NAME);
									
								}
							}
						}
					}
				}
			}
		}
		return result;
	}
	
	private ValidationSourceFeature getOptimizationIssueFeature(Optimization_Model model, String path, String path_type) {
		ValidationSourceFeature result = null;
		JsonObject pathObject = new Gson().fromJson(path, JsonObject.class);
		if (pathObject.has("app_type-ai_training")) {
			EAITrainingCase aiTrainingCase = (EAITrainingCase) model.getOptimization().getApp_optimization();
			result = new ValidationSourceFeature(aiTrainingCase, OptimizationPackage.Literals.EAI_TRAINING_CASE__AI_TRAINING);
			JsonObject aiTrainingObject = pathObject.get("app_type-ai_training").getAsJsonObject();
			if (aiTrainingObject.has("data")) {
				EAITraining aiTraining = aiTrainingCase.getAi_training();
				result = new ValidationSourceFeature(aiTraining, OptimizationPackage.Literals.EAI_TRAINING__DATA);
			}else if (aiTrainingObject.has("ai_framework-tensorflow")) {
				EAITraining aiTraining = aiTrainingCase.getAi_training();
				result = new ValidationSourceFeature(aiTraining, OptimizationPackage.Literals.EAI_TRAINING__AITRAININGCASE);
			}
		}
		return result;
	}
	
	private String getRequirement(String path) {
		String req = null;
		Pattern pattern = Pattern.compile("requirements/(.*?)/");
		Matcher matcher = pattern.matcher(path);
		if (matcher.find())
			req = matcher.group(1);
		return req;
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

	protected class ValidationSourceFeature {
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

//	public static void main(String[] args) throws IOException {
//		String aadmIri = "0000:1234:1236:4533:6353";
//		Path path = Paths.get("/home/yosu/.aadm.properties");
//		Properties props = new Properties();
//
//		// Create properties file if it does not exist
//		if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS))
//			Files.createFile(path);
//		try (final FileChannel inChannel = FileChannel.open(path, StandardOpenOption.READ);
//				final FileLock lock = inChannel.lock(0L, Long.MAX_VALUE, true)) {
//			props.load(Channels.newInputStream(inChannel));
//		}
//		props.setProperty("aadmIRI", aadmIri);
//		try (final FileChannel outChannel = FileChannel.open(path, StandardOpenOption.WRITE)) {
//			props.store(Channels.newOutputStream(outChannel), "AADM Metadata");
//		}
//	}

}
