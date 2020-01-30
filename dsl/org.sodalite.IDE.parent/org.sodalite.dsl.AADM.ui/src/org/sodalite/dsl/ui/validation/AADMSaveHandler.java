package org.sodalite.dsl.ui.validation;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

import javax.inject.Inject;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.UISynchronizer;
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
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.ui.handlers.AADMValidationIssue;

import com.google.common.collect.Lists;

public class AADMSaveHandler implements IHandler {
	private MarkerCreator markerCreator;
	private MarkerTypeProvider markerTypeProvider;
	private IssueResolutionProvider issueResolutionProvider;
	private IDiagnosticConverter converter;
	Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	String submissionIRI = null;
	
	//TODO Configure KBReasonerClient endpoint from preference page information
	KBReasonerClient kbclient = new KBReasonerClient();

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			//Return selected resource
			IFile file = getSelectedFile();
			IProject project = getProject (file);
			//Get serialize AADM model in Turtle
			String filename = file.getName().substring(0, file.getName().indexOf("."));
			IFile turtle = project.getFile("src-gen/" + filename + ".ttl");
			String turtle_path = turtle.getLocationURI().toString();
			turtle_path = turtle_path.substring(turtle_path.indexOf("/"));
			//Send turtle to KB
			Path aadm_path = FileSystems.getDefault().getPath(turtle_path);
			String aadmTTL = new String(Files.readAllBytes (aadm_path));
			String submissionId = filename;
			
			//Send model to the KB
			saveAADM (aadmTTL, submissionId, event);
			
		}catch (Exception ex) {
			ex.printStackTrace();
			MessageDialog.openError(parent, "Save AADM Error", "There were an error reported by the KB:\n" + ex.getMessage());
		}
		return null;
	}

	private void saveAADM(String aadmTTL, String submissionId, ExecutionEvent event) {
		Job job = Job.create("Save AADM", (ICoreRunnable) monitor -> {
			try {
				submissionIRI = kbclient.saveAADM(aadmTTL, submissionId);
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						notifyADDMSave (event);
					}
				});
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	protected void notifyADDMSave(ExecutionEvent event) {
		//TODO Manage returned recommendation as validation issues
		List<AADMValidationIssue> issues = readRecommendationsFromKB();
		manageRecommendationIssues(event, issues);
		
		// Upon completion, show dialog
		if (issues.isEmpty()) { //TODO Check there are not warnings (they do not prevent storage in KB)
			MessageDialog.openInformation(parent,
				"Save AADM", "The selected AADM model has been successfully store in the KB with IRI:\n" + submissionIRI);
		}else {
			MessageDialog.openError(parent, "Save AADM", "The selected AADM model has errors and could not be store in the KB");
		}
	}

	private List<AADMValidationIssue> readRecommendationsFromKB() {
		// TODO Read issues from KB recommendations
		List<AADMValidationIssue> issues = new ArrayList<>();
//		issues.add(new AADMValidationIssue("Wrong AADM node template name", "node_templates/hpc-job-torque-1"));
//		issues.add(new AADMValidationIssue("Wrong number of node templates", "node_templates"));
		return issues;
	}

	private void manageRecommendationIssues(ExecutionEvent event, List<AADMValidationIssue> validationIssues) {
		XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor(event);
		if (xtextEditor != null) {
			IValidationIssueProcessor issueProcessor;
			IXtextDocument xtextDocument = xtextEditor.getDocument();
			IResource resource = xtextEditor.getResource();
			
			List<Issue> issues = createIssues(xtextDocument, validationIssues);
			
			if(resource != null)
				issueProcessor = new MarkerIssueProcessor(resource, xtextEditor.getInternalSourceViewer().getAnnotationModel(), markerCreator, markerTypeProvider);
			else
				issueProcessor = new AnnotationIssueProcessor(xtextDocument, xtextEditor.getInternalSourceViewer().getAnnotationModel(), issueResolutionProvider);
			
			// Process Issues
			IProgressMonitor monitor = new NullProgressMonitor();
			issueProcessor.processIssues(issues, monitor);
		}
	}

	private List<Issue> createIssues(IXtextDocument xtextDocument, List<AADMValidationIssue> validationIssues) {
		final List<Issue> issues = xtextDocument
				.tryReadOnly(new CancelableUnitOfWork<List<Issue>, XtextResource>() {
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
		final List<Issue> result = Lists.newArrayListWithExpectedSize(resource.getErrors().size()
				+ resource.getWarnings().size());
		IAcceptor<Issue> acceptor = new ListBasedMarkerAcceptor(result);
		
		//Create Diagnostics from issues
		List<AADMDiagnostic> diagnostics = new ArrayList<AADMDiagnostic>();
		
		for (AADMValidationIssue issue: validationIssues) {
			// Add diagnostic
			EObject eObject = resource.getContents().get(0);
			String location = EcoreUtil.getURI(eObject).toString(); 
			int line = getLine (resource, issue.getPath()); //Compute line based on EObject
			
			diagnostics.add(new AADMDiagnostic(issue.getMessage(), location, line, 1));
		}
		
		
		for (AADMDiagnostic diagnostic: diagnostics) {
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
		//Extract object path to find nodes
		StringTokenizer st = new StringTokenizer (path, "/");
		
		int line = 1;
		
		if (resource.getAllContents().hasNext()) {
			AADM_Model model = (AADM_Model) resource.getAllContents().next();
			if (st.hasMoreTokens()) {
				if ("node_templates".equals(st.nextToken())) {
					line = getNodeLine(model.getNodeTemplates()) - 1; //Correction to point to node-templates correct line
					if (st.hasMoreTokens()) {
						String node_name = st.nextToken();
						for (ENodeTemplate node:model.getNodeTemplates().getNodeTemplates()) {
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
		for (Adapter adapter: node.eAdapters()) {
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
		if (window != null)
		{
		    IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
		    Object firstElement = selection.getFirstElement();
		    if (firstElement instanceof IAdaptable)
		    {
		    	file = (IFile)((IAdaptable)firstElement).getAdapter(IFile.class);
		    }
		}
		return file;
	}

	@Override
	public boolean isEnabled() {
		// TODO Validate AADM before enabling
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

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
