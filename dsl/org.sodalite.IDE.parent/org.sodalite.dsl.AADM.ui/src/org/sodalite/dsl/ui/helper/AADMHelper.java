package org.sodalite.dsl.ui.helper;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.SortedMap;
import java.util.TreeMap;

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
import org.sodalite.dsl.rM.EDataTypeName;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.ui.backend.BackendLogger;

import com.google.inject.Injector;

public class AADMHelper {
	public static SortedMap<String, InputDef> readInputsFromAADM(ExecutionEvent event) throws PartInitException {
		SortedMap<String, InputDef> inputs = new TreeMap<>();
		IFile aadmFile = getSelectedFile();
		if (aadmFile == null)
			return inputs;

		AADM_Model aadmModel = readAADMModel(aadmFile, event);
		AADMHelper helper = new AADMHelper();

		for (EParameterDefinition parameter : aadmModel.getInputs().getInputs()) {
			String type = convertType(parameter.getParameter().getType());
			InputDef inDef = helper.new InputDef(parameter.getName(), type, parameter.getParameter().getDefault());
			inputs.put(parameter.getName(), inDef);
		}

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
		File file = new File(selectedInputFile);
		return file.toPath();
	}

	public static String selectFile(String dialogText) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		// File standard dialog
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText(dialogText);
		// fileDialog.setFilterExtensions(new String[] { "*.txt" });
		// Put in a readable name for the filter
		// fileDialog.setFilterNames(new String[] { "Textfiles(*.txt)" });
		String selected = fileDialog.open();
		return selected;
	}

	public static AADM_Model readAADMModel(IFile aadmFile, ExecutionEvent event) throws PartInitException {
		openFileInEditor(aadmFile);
		AADM_Model model = null;
		Injector injector = AADMActivator.getInstance().getInjector(AADMActivator.ORG_SODALITE_DSL_AADM);
		XtextResourceSet resourceSet = (XtextResourceSet) injector.getInstance(XtextResourceSetProvider.class)
				.get(aadmFile.getProject());
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
				model = (AADM_Model) xtextDocument.readOnly(new IUnitOfWork() {
					public AADM_Model exec(Object resource) {
						AADM_Model model = (AADM_Model) ((XtextResource) resource).getContents().get(0);
						return model;
					}
				});
			}
		}
		// TODO Fix that the optimization models are resolvable
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

	public static String readFile(IFile file) throws IOException {
		String path = file.getLocationURI().toString();
		path = path.substring(path.indexOf(File.separator));
		Path file_path = FileSystems.getDefault().getPath(path);
		String content = new String(Files.readAllBytes(file_path));
		return content;
	}

	public static String getAADMModule(IFile rmFile, ExecutionEvent event) throws PartInitException {
		AADM_Model model = readAADMModel(rmFile, event);
		return model.getModule();
	}

	public static void pasteInClipboard(String value) {
		StringSelection stringSelection = new StringSelection(value);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
	}

	public class InputDef {
		String name;
		String type;
		Object defaultValue;

		public InputDef(String name, String type, Object defaultValue) {
			this.name = name;
			this.type = type;
			this.defaultValue = defaultValue;
		}

		public String getName() {
			return name;
		}

		public String getType() {
			return type;
		}

		public Object getDefaultValue() {
			return defaultValue;
		}
	}

	public static String convertType(EDataTypeName eDataTypeName) {
		if (eDataTypeName instanceof EPREFIX_TYPE) {
			EPREFIX_TYPE ePrefix_Type = (EPREFIX_TYPE) eDataTypeName;
			return ePrefix_Type.getModule() + '/' + ePrefix_Type.getType();
		} else {
			return eDataTypeName.toString();
		}

	}
}
