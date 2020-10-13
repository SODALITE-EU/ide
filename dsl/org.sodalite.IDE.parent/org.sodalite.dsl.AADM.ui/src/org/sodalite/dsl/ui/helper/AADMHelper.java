package org.sodalite.dsl.ui.helper;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
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
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.sodalite.dsl.AADM.ui.internal.AADMActivator;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.ui.backend.BackendLogger;

import com.google.inject.Injector;

public class AADMHelper {
	public static List<String> readInputsFromAADM(ExecutionEvent event) throws PartInitException {
		List<String> inputs = new ArrayList<>();
		IFile aadmFile = getSelectedFile();
		AADM_Model aadmModel = readAADMModel(aadmFile, event);
		for (EParameterDefinition parameter: aadmModel.getInputs().getInputs())
			inputs.add(parameter.getName());
		
		return inputs;
	}
	
	public static IFile getSelectedFile() {
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

	public static Path getInputsYamlPath() throws Exception {
//		Bundle bundle = Platform.getBundle("org.sodalite.dsl.AADM.ui");
//		URL fileURL = bundle.getEntry("resources/inputs.yaml");
//		File file = new File(FileLocator.resolve(fileURL).toURI());
		String selectedInputFile = selectFile("Select the inputs file for app deployment");
		File file = new File (selectedInputFile);
		return file.toPath();
	}
	
	public static String selectFile (String dialogText){
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		// File standard dialog
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText(dialogText);
		//fileDialog.setFilterExtensions(new String[] { "*.txt" });
		// Put in a readable name for the filter
		//fileDialog.setFilterNames(new String[] { "Textfiles(*.txt)" });
		String selected = fileDialog.open();
		return selected;
	}
	
	public static AADM_Model readAADMModel(IFile aadmFile, ExecutionEvent event) throws PartInitException {
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
		if (xtextEditor != null) {
			IValidationIssueProcessor issueProcessor;
			IXtextDocument xtextDocument = xtextEditor.getDocument();
			// FIXME Investigate why the model is not always read, returning null
			int attempt = 0;
			while (model == null) {
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
	
	public static void openFileInEditor(IFile file) throws PartInitException {
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
				try {
					page.openEditor(new FileEditorInput(file), desc.getId());
				} catch (PartInitException e) {
					BackendLogger.log("Error open model in editor", e);
				}
			}
		});
	}
	
	public static void pasteInClipboard(String value) {
		StringSelection stringSelection = new StringSelection(value);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}
}
