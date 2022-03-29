package org.sodalite.dsl.ui.backend;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IGenerator2;
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
import org.sodalite.dsl.RM.ui.internal.RMActivator;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException;
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.kb_reasoner_client.types.KBError;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBWarning;
import org.sodalite.dsl.rM.ENodeType;
import org.sodalite.dsl.rM.EPropertyDefinition;
import org.sodalite.dsl.rM.ERequirementDefinition;
import org.sodalite.dsl.rM.RMPackage;
import org.sodalite.dsl.rM.RM_Model;
import org.sodalite.dsl.ui.helper.RMHelper;
import org.sodalite.dsl.ui.validation.ValidationIssue;
import org.sodalite.ide.ui.backend.SodaliteBackendProxy;
import org.sodalite.ide.ui.logger.SodaliteLogger;

import com.google.common.collect.Lists;
import com.google.inject.Injector;

public class RMBackendProxy extends SodaliteBackendProxy {
	private MarkerCreator markerCreator;
	private MarkerTypeProvider markerTypeProvider;
	private IssueResolutionProvider issueResolutionProvider;
	private IDiagnosticConverter converter;
	private Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

	public void processSaveRM(ExecutionEvent event) throws Exception {
		// Return selected resource
		IFile rmFile = getSelectedFile();
		if (rmFile == null)
			throw new Exception("Selected RM could not be found");
		IProject project = rmFile.getProject();
		;
		// Get serialize AADM model in Turtle
		String rmTTL = readTurtle(rmFile, project);

		// Send model to the KB
		ModelMetadata mm = getModelMetadata(rmFile, project);
		saveRM(rmTTL, rmFile, mm.getUri(), project, event);
	}

	private void generateRMModel(IFile rmFile, IProgressMonitor monitor) {
		try {
			String ANSIBLE_OUTPUT = "ansible_output";
			URI aadmURI = URI.createURI(rmFile.getFullPath().toPortableString());
			Injector injector = RMActivator.getInstance().getInjector(RMActivator.ORG_SODALITE_DSL_RM);
			ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
			Resource r = resourceSet.getResource(aadmURI, true);
			r.load(null);
			IGenerator2 generator = injector.getInstance(IGenerator2.class);
			EclipseResourceFileSystemAccess2 fsa = injector.getInstance(EclipseResourceFileSystemAccess2.class);
			SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
			subMonitor.setTaskName("Converting RM into Turtle");
			fsa.setMonitor(subMonitor);
			IProject project = rmFile.getProject();
			IFile output = project.getFile("src-gen");
			fsa.setOutputPath(output.getLocation().toOSString());
			fsa.setOutputPath(ANSIBLE_OUTPUT, output.getLocation().toOSString());
			generator.doGenerate(r, fsa, new GeneratorContext() {
				@Override
				public CancelIndicator getCancelIndicator() {
					return CancelIndicator.NullImpl;
				}
			});
		} catch (IOException e) {
			SodaliteLogger.log("Error generating model", e);
		}
	}

	protected String readTurtle(IFile modelFile, IProject project) throws IOException {
		String fileSeparatorRegEx = "/";
		if (File.separator.equals("\\"))
			fileSeparatorRegEx = "\\\\";
		String filename = modelFile.getFullPath().toOSString()
				.substring(modelFile.getFullPath().toOSString().indexOf(File.separator, 1) + 1)
				.replaceFirst(fileSeparatorRegEx, ".");
		IFile turtle;
		turtle = project.getFile("src-gen" + File.separator + filename + ".ttl");
		String turtle_path = turtle.getLocationURI().toString();
		if (File.separator.equals("\\"))
			turtle_path = turtle_path.substring(turtle_path.indexOf("/") + 1).replaceAll("%20", " ");
		else
			turtle_path = turtle_path.substring(turtle_path.indexOf("/")).replaceAll("%20", " ");
		Path model_path = FileSystems.getDefault().getPath(turtle_path);
		String modelTTL = new String(Files.readAllBytes(model_path));
		return modelTTL;
	}

	private String readFile(IFile file) throws IOException {
		String path = file.getLocationURI().toString();
		path = path.substring(path.indexOf("/")).replaceAll("%20", " ");
		if (path.matches("^\\/.:\\/.+")) // Windows path
			path = path.substring(1);
		Path file_path = FileSystems.getDefault().getPath(path);
		String content = new String(Files.readAllBytes(file_path));
		return content;
	}

	public static ModelMetadata getSelectedModelMetadata() throws Exception {
		IFile modelFile = RMHelper.getSelectedFile();
		if (modelFile == null)
			throw new SodaliteException("Selected Model could not be found");

		IProject project = modelFile.getProject();
		return getModelMetadata(modelFile, project);
	}

	public static ModelMetadata getModelMetadata(IFile modelfile, IProject project) throws Exception {
		Path path = getModelPropertiesFile(modelfile, project);
		ModelMetadata mm = new ModelMetadata();
		if (Files.exists(path)) {
			Properties props = new Properties();
			try (final FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);
					final InputStream in = Channels.newInputStream(channel);
					final FileLock lock = channel.lock(0L, Long.MAX_VALUE, true)) {
				props.load(in);
			}
			mm.setUri(props.getProperty("URI"));
			mm.setVersion(props.getProperty("Version"));
		}
		return mm;
	}

	static protected Path getModelPropertiesFile(IFile modelfile, IProject project) {
		String filepath = modelfile.toString();
		String filename = filepath.substring(filepath.lastIndexOf("/") + 1);
		int index1 = filepath.indexOf("/", 2) + 1;
		int index2 = filepath.lastIndexOf("/");
		String directory = "";
		if (index2 > index1)
			directory = filepath.substring(index1, index2);
		IFile propertiesFile = project.getFile(directory + File.separator + "." + filename + ".properties");
		String properties_path = propertiesFile.getLocationURI().toString().replaceAll("%20", " ");
		if (File.separator.equals("\\"))
			properties_path = properties_path.substring(properties_path.indexOf("/") + 1).replace("/", File.separator);
		else
			properties_path = properties_path.substring(properties_path.indexOf("/"));
		Path path = FileSystems.getDefault().getPath(properties_path);
		return path;
	}

	public void saveModelMetadata(ModelMetadata mm, IFile modelfile, IProject project) throws IOException {
		Path path = getModelPropertiesFile(modelfile, project);
		Properties props = new Properties();

		// Create properties file if it does not exist
		if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS))
			Files.createFile(path);
		try (final FileChannel inChannel = FileChannel.open(path, StandardOpenOption.READ);
				final InputStream in = Channels.newInputStream(inChannel);
				final FileLock lock = inChannel.lock(0L, Long.MAX_VALUE, true)) {
			props.load(in);
		}
		props.remove("URI");
		props.setProperty("URI", mm.getUri());
		props.remove("Version");
		if (mm.getVersion() != null && !mm.getVersion().isEmpty())
			props.setProperty("Version", mm.getVersion());
		try (final FileChannel outChannel = FileChannel.open(path, StandardOpenOption.TRUNCATE_EXISTING,
				StandardOpenOption.WRITE); final OutputStream out = Channels.newOutputStream(outChannel)) {
			props.store(out, "Sodalite Metadata");
		}
	}

	private void saveRM(String rmTTL, IFile rmFile, String rmURI, IProject project, ExecutionEvent event) {
		Job job = Job.create("Save RM", (ICoreRunnable) monitor -> {
			try {
				// Generate Model
				generateRMModel(rmFile, monitor);

				// Read RM DSL as plain text
				String rmDSL = readFile(rmFile);

				// Get module (namespace) from RM
				String namespace = getRMModule(rmFile, event);
				String name = rmFile.getName();
				KBSaveReportData saveReport = getKBReasoner().saveRM(rmTTL, rmURI, name, namespace, rmDSL);
				processValidationIssues(rmFile, saveReport, event);
				if (saveReport.getURI() == null && saveReport.getErrors() == null) {
					throw new Exception(
							"The RM model could not be saved into the KB. Please, contact your Sodalite administrator");
				}
				ModelMetadata mm = new ModelMetadata();
				mm.setUri(saveReport.getURI());
				saveModelMetadata(mm, rmFile, project);

				showInfoDialog(null, "Save RM",
						"The selected RM model has been successfully store in the KB with URI:\n"
								+ saveReport.getURI());

			} catch (NotRolePermissionException ex) {
				showErrorDialog(null, "Save RM", "You have not permissions to save the model in the declared module. "
						+ "\nPlease, contact the AAI SODALITE administrator");
			} catch (Exception e) {
				showErrorDialog(null, "Save RM", "There were problems to store the RM into the KB: " + e.getMessage());
				SodaliteLogger.log("Error saving model", e);
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	public void processValidationIssues(IFile modelFile, KBSaveReportData saveReport, ExecutionEvent event)
			throws Exception {
		// TODO Check there are not warnings (they do not prevent storage in KB)
		if (saveReport != null && (saveReport.hasErrors() || saveReport.hasWarnings() || saveReport.hasSuggestions())) {
			// Open RM file if not opened to show the errors and warnings
			RMHelper.openFileInEditor(modelFile);
			List<ValidationIssue> issues = readIssuesFromKB(saveReport);
			manageIssues(event, issues);
			if (saveReport.hasErrors()) {
				throw new Exception("There are detected validation issues in the model, please fix them");
			}
		}
	}

	protected List<ValidationIssue> readIssuesFromKB(KBSaveReportData saveReport) {
		List<ValidationIssue> issues = new ArrayList<>();

		if (saveReport.hasErrors()) {
			for (KBError error : saveReport.getErrors()) {
				issues.add(new ValidationIssue(error.getType() + "." + error.getDescription(), error.getContext(), null,
						Severity.ERROR, error.getType(), error.getDescription()));
			}
		}

		if (saveReport.hasWarnings()) {
			for (KBWarning warning : saveReport.getWarnings()) {
				issues.add(new ValidationIssue(warning.getType() + "." + warning.getDescription(),
						warning.getContext() + "/" + warning.getEntity_name(), warning.getElementType(),
						Severity.WARNING, warning.getType(), warning.getDescription()));
			}
		}

		return issues;
	}

	protected void manageIssues(ExecutionEvent event, List<ValidationIssue> validationIssues) {
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

			// TODO keep issues attached to the model until they are fixed (they should not
			// vanish after the model is saved)
		}
	}

	protected List<Issue> createIssues(IXtextDocument xtextDocument, List<ValidationIssue> validationIssues) {
		final List<Issue> issues = xtextDocument.tryReadOnly(new CancelableUnitOfWork<List<Issue>, XtextResource>() {
			@Override
			public List<Issue> exec(XtextResource resource, final CancelIndicator outerIndicator) throws Exception {
				resolvedInjectedXtextObjects(resource);
				return createIssues(resource, validationIssues);
			}
		}, () -> Collections.emptyList());
		return issues;
	}

	protected void resolvedInjectedXtextObjects(XtextResource resource) {
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
			data = (String[]) ((ArrayList<String>) obj).toArray(new String[((ArrayList<String>) obj).size()]);
		} else {
			data = new String[] { obj.toString() };
		}
		return data;
	}

	protected ValidationSourceFeature getIssueFeature(XtextResource resource, String path, String path_type) {
		// Extract object path to find nodes

		ValidationSourceFeature result = null;
		if (resource.getAllContents().hasNext()) {
			EObject eobject = resource.getAllContents().next();
			if (eobject instanceof RM_Model) {
				RM_Model model = (RM_Model) eobject;
				StringTokenizer st = new StringTokenizer(path, "/");
				result = getRMIssueFeature(model, path, path_type, st);
			}
		}
		return result;
	}

	private ValidationSourceFeature getRMIssueFeature(RM_Model model, String path, String path_type,
			StringTokenizer st) {
		ValidationSourceFeature result = null;
		if (st.hasMoreTokens()) {
			String token = st.nextToken();
			if ("node_types".equals(token)) {
				result = getRMIssueFeatureInNodeType(model, path, path_type, st, result);
			}
		}
		return result;
	}

	private ValidationSourceFeature getRMIssueFeatureInNodeType(RM_Model model, String path, String path_type,
			StringTokenizer st, ValidationSourceFeature result) {
		if (st.hasMoreTokens()) {
			String node_name = st.nextToken();
			for (ENodeType node : model.getNodeTypes().getNodeTypes()) {
				if (node.getName().contentEquals(node_name)) {
					result = new ValidationSourceFeature(node, RMPackage.Literals.ENODE_TYPE__NAME);
					if (st.hasMoreElements()) {
						String entity_name = st.nextToken();
						if (path.contains("properties")) {
							if (node.getNode().getProperties() != null) {
								for (EPropertyDefinition property : node.getNode().getProperties().getProperties()) {
									if (property.getName().contentEquals(entity_name)) {
										result = new ValidationSourceFeature(property,
												RMPackage.Literals.EPROPERTY_DEFINITION__NAME);
									}
								}
							}
						} else if (path.contains("requirements")) {
							boolean req_found = false;
							if (node.getNode().getRequirements() != null) {
								for (ERequirementDefinition req : node.getNode().getRequirements().getRequirements()) {
									// Target requirement found
									if (req.getName().contentEquals(getRequirement(path))) {
										req_found = true;
										result = new ValidationSourceFeature(req, RMPackage.Literals.EREQ_OR_CAP__NAME);
										if (path.contains("node")) {
											result = new ValidationSourceFeature(req.getRequirement().getNode(),
													RMPackage.Literals.EDATA_TYPE_NAME__TYPE);
										}
									}
								}
							}
							if (!req_found)
								result = new ValidationSourceFeature(node, RMPackage.Literals.ENODE_TYPE__NAME);

						}
					}
				}
			}
		}
		return result;
	}

	private IFile getSelectedFile() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				return (IFile) ((IAdaptable) firstElement).getAdapter(IFile.class);
			}
		}
		return null;
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

	public void showErrorDialog(String info, String dialogTitle, String dialogMessage) {
		if (info != null)
			RMBackendProxy.pasteInClipboard(info);
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openError(parent, dialogTitle, dialogMessage);
			}
		});
	}

	public void showInfoDialog(String info, String dialogTitle, String dialogMessage) {
		if (info != null)
			RMBackendProxy.pasteInClipboard(info);
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openInformation(parent, dialogTitle, dialogMessage);
			}
		});
	}

	public static void pasteInClipboard(String value) {
		StringSelection stringSelection = new StringSelection(value);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}

	private String getRMModule(IFile rmFile, ExecutionEvent event) throws PartInitException {
		RM_Model model = readRM(rmFile, event);
		return model.getModule();
	}

	private RM_Model readRM(IFile rmFile, ExecutionEvent event) throws PartInitException {
		RMHelper.openFileInEditor(rmFile);
		RM_Model model = null;
		Injector injector = RMActivator.getInstance().getInjector(RMActivator.ORG_SODALITE_DSL_RM);
		XtextResourceSet resourceSet = (XtextResourceSet) injector.getInstance(XtextResourceSetProvider.class)
				.get(rmFile.getProject());
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

		XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		// FIXME Check this behaviour of reading the XTextEditor
		while (xtextEditor == null) {
			xtextEditor = EditorUtils.getActiveXtextEditor(event);
		}
		if (xtextEditor != null) {
			IValidationIssueProcessor issueProcessor;
			IXtextDocument xtextDocument = xtextEditor.getDocument();
			// FIXME Investigate why the model is not always read, returning null
			int attempt = 0;
			while (model == null) {
				model = (RM_Model) xtextDocument.readOnly(new IUnitOfWork() {
					public RM_Model exec(Object resource) {
						RM_Model model = (RM_Model) ((XtextResource) resource).getContents().get(0);
						return model;
					}
				});
			}
		}

		if (model != null)
			EcoreUtil2.resolveAll(model.eResource());
		return model;
	}

	private String getRequirement(String path) {
		String req = null;
		Pattern pattern = Pattern.compile("requirements/(.*?)/");
		Matcher matcher = pattern.matcher(path);
		if (matcher.find())
			req = matcher.group(1);
		return req;
	}

}
