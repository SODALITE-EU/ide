package org.sodalite.dsl.ui.backend;

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
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;

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
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IGenerator2;
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
import org.sodalite.dsl.RM.ui.internal.RMActivator;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.KBError;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBWarning;
import org.sodalite.dsl.rM.ENodeType;
import org.sodalite.dsl.rM.EPropertyDefinition;
import org.sodalite.dsl.rM.RMPackage;
import org.sodalite.dsl.rM.RM_Model;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;
import org.sodalite.dsl.ui.validation.ValidationIssue;

import com.google.common.collect.Lists;
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
		String iacURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		String xoperaURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		KBReasonerClient kbclient = new KBReasonerClient(kbReasonerURI, iacURI, xoperaURI);
		System.out.println(
				MessageFormat.format("Sodalite backend configured with [KB Reasoner API: {0}, IaC API: {1}, xOpera {2}",
						kbReasonerURI, iacURI, xoperaURI));
		return kbclient;
	}

	public void processSaveRM(ExecutionEvent event) throws Exception {
		// Return selected resource
		IFile rmFile = getSelectedFile();
		if (rmFile == null)
			throw new Exception("Selected RM could not be found");
		IProject project = rmFile.getProject();;
		// Get serialize AADM model in Turtle
		String rmTTL = readTurtle(rmFile, project);

		// Send model to the KB
		String rmUri = getRmURI (rmFile, project);
		saveRM(rmTTL, rmFile, rmUri, project, event);
	}
	
	private void generateRMModel (IFile rmFile, IProgressMonitor monitor) {
		try {
			URI aadmURI = URI.createURI(rmFile.getFullPath().toPortableString());
			Injector injector = RMActivator.getInstance().getInjector(
					RMActivator.ORG_SODALITE_DSL_RM);
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
			generator.doGenerate(r, fsa, new GeneratorContext() {
				@Override
				public CancelIndicator getCancelIndicator() {
					return CancelIndicator.NullImpl;
				}
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String readTurtle(IFile modelFile, IProject project) throws IOException {
		String filename = modelFile.getFullPath().toOSString().substring(
				modelFile.getFullPath().toOSString().indexOf(File.separator, 1) + 1).replaceFirst(File.separator, ".");
		IFile turtle = project.getFile("src-gen" + File.separator + filename + ".ttl");
		String turtle_path = turtle.getLocationURI().toString();
		turtle_path = turtle_path.substring(turtle_path.indexOf(File.separator));
		Path rm_path = FileSystems.getDefault().getPath(turtle_path);
		String rmTTL = new String(Files.readAllBytes(rm_path));
		return rmTTL;
	}
	
	private String getRmURI(IFile rmfile, IProject project) throws IOException {
		Path path = getRMPropertiesFile(rmfile, project);
		String uri = null;
		if (Files.exists(path)) {
			Properties props = new Properties();
			try(final FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);
					final InputStream in = Channels.newInputStream(channel);
					final FileLock lock = channel.lock(0L, Long.MAX_VALUE, true)
					) {
				props.load(in);
			}
			uri = props.getProperty("URI");
		}
		
		return uri;
	}

	private Path getRMPropertiesFile(IFile rmfile, IProject project) {
		String filepath = rmfile.toString();
		String filename = filepath.substring(filepath.lastIndexOf(File.separator) + 1);
		String directory = filepath.substring(filepath.indexOf(File.separator, 2) + 1, filepath.lastIndexOf(File.separator));
		IFile propertiesFile = project.getFile(directory + File.separator + "." + filename + ".properties");
		String properties_path = propertiesFile.getLocationURI().toString();
		properties_path = properties_path.substring(properties_path.indexOf(File.separator));
		Path path = FileSystems.getDefault().getPath(properties_path);
		return path;
	}
	
	private void saveURI(String uri, IFile rmfile, IProject project) throws IOException {
		Path path = getRMPropertiesFile(rmfile, project);
		Properties props = new Properties();

		//Create properties file if it does not exist
		if (!Files.exists(path, LinkOption.NOFOLLOW_LINKS))
		    Files.createFile(path);
		try(final FileChannel inChannel = FileChannel.open(path, StandardOpenOption.READ);
				final InputStream in = Channels.newInputStream(inChannel);
				final FileLock lock = inChannel.lock(0L, Long.MAX_VALUE, true)) {
				props.load(in);
			}
		props.setProperty("URI", uri);
		try(final FileChannel outChannel = FileChannel.open(path, StandardOpenOption.WRITE);
				final OutputStream out = Channels.newOutputStream(outChannel)) {
				props.store(out, "Sodalite Metadata");
			}
	}

	private void saveRM(String rmTTL, IFile rmFile, String rmURI, IProject project, ExecutionEvent event) {
		Job job = Job.create("Save RM", (ICoreRunnable) monitor -> {
			try {
				//Generate Model
				generateRMModel(rmFile, monitor);
				
				KBSaveReportData saveReport = getKBReasoner().saveRM(rmTTL, rmURI);
				processValidationIssues(rmFile, saveReport, event);
				if (saveReport.getURI() == null && saveReport.getErrors() == null) {
					throw new Exception("The RM model could not be saved into the KB. Please, contact your Sodalite administrator");
				}
				saveURI (saveReport.getURI(), rmFile, project);
				
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						MessageDialog.openInformation(parent, "Save RM",
								"The selected RM model has been successfully store in the KB with URI:\n"
										+ saveReport.getURI());
					}
				});
			} catch (Exception e) {
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						MessageDialog.openError(parent, "Save RM",
								"There were problems to store the RM into the KB: " + e.getMessage());
					}
				});
				e.printStackTrace();
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	private void processValidationIssues(IFile rmFile, KBSaveReportData saveReport, ExecutionEvent event) throws Exception {
		// TODO Check there are not warnings (they do not prevent storage in KB)
		if (saveReport != null && (saveReport.hasErrors() || saveReport.hasWarnings())) {
			//Open RM file if not opened to show the errors and warnings
			openFileInEditor(rmFile);
			List<ValidationIssue> issues = readRecommendationsFromKB(saveReport);
			manageRecommendationIssues(event, issues);
			if (saveReport.hasErrors()) {
				throw new Exception("There are detected validation issues in the AADM, please fix them");
			}
		}
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
			data = (String[]) ((ArrayList<String>)obj).toArray(new String[((ArrayList<String>) obj).size()]);
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
			RM_Model model = (RM_Model) resource.getAllContents().next();
			if (st.hasMoreTokens()) {
				if ("node_templates".equals(st.nextToken()) && model.getNodeTypes()!=null) {
					if (st.hasMoreTokens()) { //Node_template
						String node_name = st.nextToken();
						for (ENodeType node : model.getNodeTypes().getNodeTypes()) {
							if (node.getName().contentEquals(node_name)) {
								result = new ValidationSourceFeature(node, RMPackage.Literals.ENODE_TYPE__NAME);
								if (st.hasMoreElements()) { //Node_Template children
									String entity_name = st.nextToken();
									if ("Property".equals(path_type)) {
										for (EPropertyDefinition property:node.getNode().getProperties().getProperties()) {
											if (property.getName().contentEquals(entity_name)) {
												result = new ValidationSourceFeature(property, RMPackage.Literals.EPROPERTY_DEFINITION__NAME);
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
}
