package org.sodalite.dsl.ui.helper;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
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
import org.eclipse.xtext.ParserRule;
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.kb_reasoner_client.types.TypeData;
import org.sodalite.dsl.rM.ECapabilityDefinition;
import org.sodalite.dsl.rM.EDataTypeName;
import org.sodalite.dsl.rM.EEntity;
import org.sodalite.dsl.rM.EEntityReference;
import org.sodalite.dsl.rM.EFunction;
import org.sodalite.dsl.rM.EInterfaceType;
import org.sodalite.dsl.rM.ENodeType;
import org.sodalite.dsl.rM.EOperationDefinition;
import org.sodalite.dsl.rM.EPREFIX_ID;
import org.sodalite.dsl.rM.EPREFIX_REF;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EPolicyType;
import org.sodalite.dsl.rM.ERequirementDefinition;
import org.sodalite.dsl.rM.GetAttribute;
import org.sodalite.dsl.rM.GetProperty;
import org.sodalite.dsl.rM.RM_Model;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class RMHelper {

	static enum Boolean {
		True, False
	}

	public static String convertType(EDataTypeName eDataTypeName) {
		if (eDataTypeName instanceof EPREFIX_TYPE) {
			EPREFIX_TYPE ePrefix_Type = (EPREFIX_TYPE) eDataTypeName;
			return ePrefix_Type.getModule() + '/' + ePrefix_Type.getType();
		} else {
			return eDataTypeName.toString();
		}

	}

	public static String extractModule(String module) {
		return module.substring(module.lastIndexOf("/", module.length() - 2) + 1, module.length() - 1);
	}

	public static List<CapabilityDefinition> findCapabilitiesInNodeType(String nodeRef) throws SodaliteException {
		CapabilityDefinitionData capabilities = BackendHelper.getKBReasoner().getTypeCapabilities(nodeRef);
		return capabilities.getElements();
	}

	public static ECapabilityDefinition findCapabilityInLocalType(String capabilityName, ENodeType nodeType) {
		ECapabilityDefinition capability = null;
		if (nodeType.getNode().getCapabilities() == null)
			return capability;
		for (ECapabilityDefinition cap : nodeType.getNode().getCapabilities().getCapabilities()) {
			if (cap.getName().equals(capabilityName))
				capability = cap;
		}
		return capability;
	}

	public static List<EOperationDefinition> findLocalOperations(EObject object) {
		List<EOperationDefinition> operations = new ArrayList<EOperationDefinition>();
		RM_Model model = (RM_Model) findModel(object);
		for (EInterfaceType _interface : model.getInterfaceTypes().getInterfaceTypes()) {
			for (EOperationDefinition op : _interface.getInterface().getOperations().getOperations()) {
				operations.add(op);
			}
		}
		return operations;
	}

	public static EObject findModel(EObject object) {
		EObject container = object.eContainer();
		while (container != null) {
			if (isModel(container))
				return container;
			container = container.eContainer();
		}
		return null;
	}

	private static boolean isModel(EObject container) {
		List<Method> methods = Arrays.asList(container.getClass().getMethods());
		List<String> names = methods.stream().map(m -> m.getName()).collect(Collectors.toList());
		return names.contains("getModule") && names.contains("getImports");
	}

	public static String findNodeByNameInKB(EPREFIX_TYPE node) throws SodaliteException {
		// Get modules from model
		List<String> importedModules = getImportedModules(node);
		String module = getModule(node);

		// Add current module to imported ones for searching in the KB
		importedModules.add(module);
		TypeData typeData = BackendHelper.getKBReasoner().getNodeTypes(importedModules);
		for (Type type : typeData.getElements()) {
			String name = type.getUri().toString().substring(type.getUri().toString().lastIndexOf('/') + 1);
			if (name.equals(node.getType())) {
				String type_module = null;
				if (type.getModule() != null) {
					type_module = type.getModule().substring(
							type.getModule().lastIndexOf("/", type.getModule().length() - 2) + 1,
							type.getModule().length() - 1);
				}
				return type_module != null ? type_module + '/' + type.getLabel() : type.getLabel();
			}
		}
		return null;
	}

	public static ENodeType findNodeType(RM_Model model, String nodeName) {
		for (ENodeType node : model.getNodeTypes().getNodeTypes()) {
			if (node.getName().equals(nodeName))
				return node;
		}
		return null;
	}

	public static ERequirementDefinition findRequirementInLocalType(String requirement, ENodeType nodeType) {
		if (nodeType.getNode().getRequirements() != null) {
			for (ERequirementDefinition req : nodeType.getNode().getRequirements().getRequirements()) {
				if (req.getName().equals(requirement)) {
					return req;
				}
			}
		}
		return null;
	}

	public static String findRequirementNodeByNameInKB(String type, String reqName) throws SodaliteException {
		RequirementDefinitionData reqData = BackendHelper.getKBReasoner().getTypeRequirements(type);
		for (RequirementDefinition req : reqData.getElements()) {
			String name = req.getUri().toString().substring(req.getUri().toString().lastIndexOf('/') + 1);
			if (name.equals(reqName))
				return req.getNode().getModule() != null ? req.getNode().getModule() + '/' + req.getNode().getLabel()
						: req.getNode().getLabel();
		}
		return null;
	}

	public static ENodeType findRequirementNodeInLocalType(String requirement, ENodeType nodeType) {
		RM_Model model = (RM_Model) findModel(nodeType);
		ENodeType node = null;
		String module1 = model.getModule();
		if (module1 == null)
			module1 = "";
		if (nodeType.getNode().getRequirements() == null)
			return node;
		for (ERequirementDefinition req : nodeType.getNode().getRequirements().getRequirements()) {
			String module2 = req.getRequirement().getNode().getModule();
			if (module2 == null)
				module2 = "";
			if (req.getName().equals(requirement)) {
				if (module1.equals(module2)) {
					node = findNodeType(model, req.getRequirement().getNode().getType());
				}
			}
		}
		return node;
	}

	public static String findRequirementTargetNode(ENodeType node, String req_name) throws SodaliteException {
		// Find requirement in local node
		String nodeRef = null;
		RM_Model model = (RM_Model) findModel(node);
		ERequirementDefinition req = findRequirementInLocalType(req_name, node);
		if (req != null) {
			EPREFIX_TYPE req_node = req.getRequirement().getNode();
			if (req_node != null) {
				// Find requirement target node in local model, or
				if (model.getModule().equals(req_node.getModule())) {
					ENodeType target_node = findNodeType(model, req_node.getType());
					if (target_node != null)
						nodeRef = "local:" + getReference(target_node);
				}
				if (nodeRef == null) {
					// Find requirement target node in KB
					nodeRef = "kb:" + findNodeByNameInKB(req_node);
				}
			}
		} else {
			// Find requirement in KB for node superclass, find node in KB
			nodeRef = "kb:"
					+ RMHelper.findRequirementNodeByNameInKB(getReference(node.getNode().getSuperType()), req_name);
		}
		return nodeRef;
	}

	public static String getBetweenLast2Delimiters(String input, String delimiter) {
		int endIndex = input.lastIndexOf(delimiter);
		String subInput = input.substring(0, endIndex);
		int beginIndex = subInput.lastIndexOf(delimiter);
		return input.substring(beginIndex + 1, endIndex);
	}

	public static EObject getEntityType(EFunction function) {
		EEntityReference eEntityReference = null;
		if (function instanceof GetProperty)
			eEntityReference = ((GetProperty) function).getProperty().getEntity();
		else if (function instanceof GetAttribute)
			eEntityReference = ((GetAttribute) function).getAttribute().getEntity();

		if (eEntityReference == null)
			return null;

		EObject node = null;
		if (eEntityReference instanceof EEntity) {
			EEntity eEntity = (EEntity) eEntityReference;
			if (eEntity.getEntity().equals("SELF")) {
				node = getType(function);
			}
		} else {
			// TODO Support other entities: TARGET, HOST, SOURCE, concrete entity
		}
		return node;
	}

	public static String getId(EPREFIX_REF ref) {
		String id = null;
		if (ref instanceof EPREFIX_TYPE) {
			id = ((EPREFIX_TYPE) ref).getType();
		} else if (ref instanceof EPREFIX_ID) {
			id = ((EPREFIX_ID) ref).getId();
		}
		return id;
	}

	public static List<String> getImportedModules(EObject object) {
		EObject model = findModel(object);
		return invokeGetImports(model);
	}

	private static List<String> invokeGetImports(EObject model) {
		List<String> imports = new ArrayList<>();
		try {
			Class noparams[] = {};
			Method method = model.getClass().getMethod("getImports", noparams);
			List<String> _imports = (List<String>) method.invoke(model, null);
			imports.addAll(_imports);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return imports;
	}

	public static String getLastSegment(String _string, String delimiter) {
		String newString = _string;
		if (_string.endsWith(delimiter))
			newString = _string.substring(0, _string.length() - delimiter.length());
		return newString.substring(newString.lastIndexOf(delimiter) + 1);
	}

	public static String getLastSegment(EPREFIX_REF ref, String delimiter) {
		if (ref instanceof EPREFIX_TYPE) {
			return getLastSegment(((EPREFIX_TYPE) ref).getType(), delimiter);
		} else if (ref instanceof EPREFIX_TYPE) {
			return ((EPREFIX_ID) ref).getId();
		} else {
			return null;
		}
	}

	public static String getModule(EObject object) {
		EObject model = findModel(object);
		return invokeGetModule(model);
	}

	private static String invokeGetModule(EObject model) {
		String module = "";
		try {
			Class noparams[] = {};
			Method method = model.getClass().getMethod("getModule", noparams);
			module = (String) method.invoke(model, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return module;
	}

	public static String getNodeFromRequirementRef(EPREFIX_REF reqRef) {
		String nodeRef = null;
		if (reqRef instanceof EPREFIX_TYPE) {
			EPREFIX_TYPE req = (EPREFIX_TYPE) reqRef;
			String nodeName = req.getType().substring(0, req.getType().lastIndexOf('.'));
			nodeRef = req.getModule() != null ? req.getModule() + '/' + nodeName : nodeName;
		} else if (reqRef instanceof EPREFIX_ID) {
			EPREFIX_ID req = (EPREFIX_ID) reqRef;
			String nodeName = req.getId().substring(0, req.getId().lastIndexOf('.'));
			nodeRef = req.getModule() != null ? req.getModule() + '/' + nodeName : nodeName;
		}
		return nodeRef;
	}

	public static String getNodeName(EPREFIX_REF nodeRef) {
		String qnode = null;
		if (nodeRef instanceof EPREFIX_TYPE) {
			EPREFIX_TYPE node = (EPREFIX_TYPE) nodeRef;
			qnode = node.getModule() != null ? node.getModule() + '/' + node.getType() : node.getType();
		} else if (nodeRef instanceof EPREFIX_ID) {
			EPREFIX_ID node = (EPREFIX_ID) nodeRef;
			qnode = node.getModule() != null ? node.getModule() + '/' + node.getId() : node.getId();
		}
		return qnode;
	}

	public static EObject getNodeType(EObject object) {
		if (object.eContainer() == null)
			return null;
		else if (object.eContainer() instanceof ENodeType)
			return object.eContainer();
		else
			return getNodeType(object.eContainer());
	}

	public static String getReference(ENodeType node) {
		String module = getModule(node);
		return (module != null) ? module + '/' + node.getName() : node.getName();
	}

	public static String getReference(EPREFIX_REF node) {
		String result = "";
		if (node instanceof EPREFIX_TYPE) {
			EPREFIX_TYPE _node = (EPREFIX_TYPE) node;
			result = _node.getModule() != null ? _node.getModule() + '/' + _node.getType() : _node.getType();
		} else if (node instanceof EPREFIX_ID) {
			EPREFIX_ID _node = (EPREFIX_ID) node;
			result = _node.getModule() != null ? _node.getModule() + '/' + _node.getId() : _node.getId();
		}
		return result;
	}

	public static String getReference(EPREFIX_TYPE node) {
		return node.getModule() != null ? node.getModule() + '/' + node.getType() : node.getType();
	}

	public static ERequirementDefinition getRequirementByNameInLocalNode(ENodeType node, String req_name) {
		if (node.getNode().getRequirements() != null) {
			for (ERequirementDefinition req : node.getNode().getRequirements().getRequirements()) {
				if (req.getName().equals(req_name))
					return req;
			}
		}
		return null;
	}

	public static String getRequirementNameFromRequirementRef(EPREFIX_REF reqRef) {
		String reqName = null;
		if (reqRef instanceof EPREFIX_TYPE) {
			EPREFIX_TYPE req = (EPREFIX_TYPE) reqRef;
			reqName = RMHelper.getLastSegment(req.getType(), ".");
		} else if (reqRef instanceof EPREFIX_ID) {
			EPREFIX_ID req = (EPREFIX_ID) reqRef;
			reqName = RMHelper.getLastSegment(req.getId(), ".");
		}
		return reqName;
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

	public static EObject getType(EObject object) {
		if (object.eContainer() == null)
			return null;
		else if (object.eContainer() instanceof ENodeType)
			return object.eContainer();
		else if (object.eContainer() instanceof EPolicyType)
			return object.eContainer();
		else
			return getType(object.eContainer());
	}

	public static IContainer getWorkspaceRoot() {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IContainer root = workspaceRoot.getContainerForLocation(workspaceRoot.getLocation());
		return root;
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
					SodaliteLogger.log("Error open model in editor", e);
				}
			}
		});
	}

	public static List<String> processListModules(EObject model) {
		// Get modules from model
		List<String> importedModules = getImportedModules(model);
		String module = getModule(model);
		// Add current module to imported ones for searching in the KB
		if (module != null)
			importedModules.add(module);
		return importedModules;
	}

	public static String readFile(IFile file) throws IOException {
		String path = file.getLocationURI().toString();
		path = path.substring(path.indexOf(File.separator));
		Path file_path = FileSystems.getDefault().getPath(path);
		String content = new String(Files.readAllBytes(file_path));
		return content;
	}

	public static String readFile(Path path) throws IOException {
		return new String(Files.readAllBytes(path));
	}

	public static void saveContentInFile(String content, IFile targetFile) {
		try {
			byte[] bytes = content.getBytes();
			InputStream source = new ByteArrayInputStream(bytes);
			targetFile.create(source, IResource.NONE, null);
		} catch (CoreException e) {
			SodaliteLogger.log("Error", e);
		}
	}

	public static void saveFileInFolder(String filename, String filecontent, IContainer targetFolder) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		IFile targetFile = null;
		if (targetFolder instanceof IProject)
			targetFile = ((IProject) targetFolder).getFile(filename);
		else if (targetFolder instanceof IFolder)
			targetFile = ((IFolder) targetFolder).getFile(filename);
		if (targetFile == null) {
			MessageDialog.openError(shell, "Folder not found",
					"Folder " + targetFolder.getName() + " could not be found");
		}
		if (!targetFile.exists()) {
			saveContentInFile(filecontent, targetFile);
		} else {
			boolean confirmed = MessageDialog.openConfirm(shell,
					"Target file exists in folder " + targetFolder.getName(),
					"Do you want to override target file " + targetFile.getName());
			if (confirmed) {
				try {
					targetFile.delete(false, null);
					saveContentInFile(filecontent, targetFile);
				} catch (CoreException e) {
					SodaliteLogger.log("Error", e);
				}

			}
		}
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

	public static void showReadPermissionErrorDialog() {
		Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		MessageDialog.openError(parent, "Role Permissions error",
				"Your account does not have permissions to read some declared imports or module. \nPlease, check and fix them");
	}

	public static boolean areModulesIdentical(String module1, String module2) {
		if (module1 == null && module2 == null)
			return true;
		else if (module1 == null && module2 != null || module1 != null && module2 == null)
			return false;
		else
			return module1.equals(module2);
	}

	public static ParserRule findParserRule(EObject obj) {
		if (obj == null)
			return null;
		else if (obj instanceof ParserRule)
			return (ParserRule) obj;
		else
			return findParserRule(obj.eContainer());
	}

}
