package org.sodalite.dsl.ui.helper;

import java.io.File;
import java.nio.file.Path;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.ui.PartInitException;
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

import com.google.inject.Injector;

public class AADMHelper extends RMHelper {
	public static SortedMap<String, InputDef> readInputsFromAADM(ExecutionEvent event) throws PartInitException {
		SortedMap<String, InputDef> inputs = new TreeMap<>();
		IFile aadmFile = getSelectedFile();
		if (aadmFile == null)
			return inputs;

		AADM_Model aadmModel = readAADMModel(aadmFile, event);
		AADMHelper helper = new AADMHelper();

		if (aadmModel.getInputs() != null)
			for (EParameterDefinition parameter : aadmModel.getInputs().getInputs()) {
				String type = convertType(parameter.getParameter().getType());
				InputDef inDef = helper.new InputDef(parameter.getName(), type, parameter.getParameter().getDefault());
				inputs.put(parameter.getName(), inDef);
			}

		return inputs;
	}

	public static Path getInputsYamlPath() throws Exception {
//		Bundle bundle = Platform.getBundle("org.sodalite.dsl.AADM.ui");
//		URL fileURL = bundle.getEntry("resources/inputs.yaml");
//		File file = new File(FileLocator.resolve(fileURL).toURI());
		String selectedInputFile = selectFile("Select the inputs file for app deployment");
		File file = new File(selectedInputFile);
		return file.toPath();
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

	public static String getAADMModule(IFile rmFile, ExecutionEvent event) throws PartInitException {
		AADM_Model model = readAADMModel(rmFile, event);
		return model.getModule();
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

}
