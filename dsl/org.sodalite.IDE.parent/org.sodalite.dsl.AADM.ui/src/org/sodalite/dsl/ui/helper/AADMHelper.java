package org.sodalite.dsl.ui.helper;

import java.io.File;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ParserRule;
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
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.EPolicyDefinition;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.aADM.impl.ENodeTemplateBodyImpl;
import org.sodalite.dsl.aADM.impl.ERequirementAssignmentImpl;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException;
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.kb_reasoner_client.types.Template;
import org.sodalite.dsl.kb_reasoner_client.types.TemplateData;
import org.sodalite.dsl.kb_reasoner_client.types.TypeData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;
import org.sodalite.dsl.rM.EEntity;
import org.sodalite.dsl.rM.EEntityReference;
import org.sodalite.dsl.rM.EPREFIX_REF;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.rM.impl.GetPropertyBodyImpl;
import org.sodalite.ide.ui.logger.SodaliteLogger;

import com.google.inject.Injector;

public class AADMHelper extends RMHelper {
	public class InputDef {
		String name;
		String type;
		Object defaultValue;

		public InputDef(String name, String type, Object defaultValue) {
			this.name = name;
			this.type = type;
			this.defaultValue = defaultValue;
		}

		public Object getDefaultValue() {
			return defaultValue;
		}

		public String getName() {
			return name;
		}

		public String getType() {
			return type;
		}
	}

	public static EObject findElement(AADM_Model model, String elementName) {
		// Searching on node templates
		if (model.getNodeTemplates() != null)
			for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates())
				if (node.getName().equals(elementName))
					return node;
		// Searching on policies
		if (model.getPolicies() != null)
			for (EPolicyDefinition policy : model.getPolicies().getPolicies())
				if (policy.getName().equals(elementName))
					return policy;

		return null;
	}

	public static List<ENodeTemplate> findLocalNodesForType(String type, EObject reqAssign) throws SodaliteException {
		List<ENodeTemplate> nodes = new ArrayList<ENodeTemplate>();
		try {
			Map<String, Set<ENodeTemplate>> candidateNodes = new HashMap<String, Set<ENodeTemplate>>();
			AADM_Model model = (AADM_Model) findModel(reqAssign);

			for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
				String node_id = (node.getNode().getType().getModule() != null
						? node.getNode().getType().getModule() + '/'
						: "") + node.getNode().getType().getType();
				if (!candidateNodes.keySet().contains(node_id))
					candidateNodes.put(node_id, new HashSet<ENodeTemplate>());
				candidateNodes.get(node_id).add(node);
			}

			List<String> keys = new ArrayList<String>(candidateNodes.keySet());
			List<String> validSubClasses = BackendHelper.getKBReasoner().getSubClassesOf(keys, type);

			for (String validClass : validSubClasses) {
				if (candidateNodes.containsKey(validClass))
					nodes.addAll(candidateNodes.get(validClass));
			}

		} catch (NotRolePermissionException ex) {
			showReadPermissionErrorDialog();
		} catch (SodaliteException ex) {
			SodaliteLogger.log(ex.getMessage(), ex);
		}
		return nodes;
	}

//	public static EObject findModel(EObject object) {
//		EObject container = object.eContainer();
//		while (container != null) {
//			if (container instanceof AADM_Model)
//				return (AADM_Model) container;
//			container = container.eContainer();
//		}
//		return null;
//	}

	public static String getModule(IFile rmFile, ExecutionEvent event) throws PartInitException {
		AADM_Model model = readAADMModel(rmFile, event);
		return model.getModule();
	}

//	public static List<String> getImportedModules(EObject object) {
//		List<String> modules = new ArrayList<String>();
//		AADM_Model model = (AADM_Model) findModel(object);
//		for (String _import : model.getImports())
//			modules.add(_import);
//
//		return modules;
//	}

	public static Path getInputsYamlPath() throws Exception {
//		Bundle bundle = Platform.getBundle("org.sodalite.dsl.AADM.ui");
//		URL fileURL = bundle.getEntry("resources/inputs.yaml");
//		File file = new File(FileLocator.resolve(fileURL).toURI());
		String selectedInputFile = selectFile("Select the inputs file for app deployment");
		File file = new File(selectedInputFile);
		return file.toPath();
	}

//	public static String getModule(EObject object) {
//		AADM_Model model = (AADM_Model) findModel(object);
//		return model.getModule();
//	}

	public static TypeData getTypeOfValidRequirementNodes(ERequirementAssignmentImpl req)
			throws SodaliteException, Exception {
		String requirementId = req.getName();
		EPREFIX_TYPE nodeType = ((ENodeTemplateBodyImpl) req.eContainer().eContainer()).getType();
		String resourceId = (nodeType.getModule() != null ? nodeType.getModule() + "/" : "") + nodeType.getType();

		// Get valid requirement nodes from KB
		// Get modules from model
		List<String> importedModules = AADMHelper.getImportedModules(req);
		String module = AADMHelper.getModule(req);
		// Add current module to imported ones for searching in the KB
		if (module != null)
			importedModules.add(module);

		return BackendHelper.getKBReasoner().getTypeOfValidRequirementNodes(requirementId, resourceId, importedModules);
	}

	public static ValidRequirementNodeData getValidRequirementNodes(ERequirementAssignmentImpl req)
			throws SodaliteException, Exception {
		String requirementId = req.getName();
		EPREFIX_TYPE nodeType = ((ENodeTemplateBodyImpl) req.eContainer().eContainer()).getType();
		String resourceId = (nodeType.getModule() != null ? nodeType.getModule() + "/" : "") + nodeType.getType();

		// Get valid requirement nodes from KB
		// Get modules from model
		List<String> importedModules = AADMHelper.getImportedModules(req);
		String module = AADMHelper.getModule(req);
		// Add current module to imported ones for searching in the KB
		if (module != null)
			importedModules.add(module);

		return BackendHelper.getKBReasoner().getValidRequirementNodes(requirementId, resourceId, importedModules);
	}

	public static AADM_Model readAADMModel(IFile aadmFile, ExecutionEvent event) throws PartInitException {
		openFileInEditor(aadmFile);
		AADM_Model model = null;
		Injector injector = AADMActivator.getInstance().getInjector(AADMActivator.ORG_SODALITE_DSL_AADM);
		XtextResourceSet resourceSet = (XtextResourceSet) injector.getInstance(XtextResourceSetProvider.class)
				.get(aadmFile.getProject());
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, java.lang.Boolean.TRUE);

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

	public static SortedMap<String, InputDef> readInputsFromAADM(ExecutionEvent event) throws PartInitException {
		SortedMap<String, InputDef> inputs = new TreeMap<>();
		IFile aadmFile = getSelectedFile();
		if (aadmFile == null)
			return inputs;

		AADM_Model aadmModel = readAADMModel(aadmFile, event);
		AADMHelper helper = new AADMHelper();

		if (aadmModel.getInputs() != null)
			for (EParameterDefinition parameter : aadmModel.getInputs().getParameters()) {
				String type = convertType(parameter.getParameter().getType());
				InputDef inDef = helper.new InputDef(parameter.getName(), type, parameter.getParameter().getDefault());
				inputs.put(parameter.getName(), inDef);
			}

		return inputs;
	}

	public static void showReadPermissionErrorDialog() {
		Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		String message = "Your account does not have permissions to read some declared imports or module. \nPlease, check and fix them";
		MessageDialog.openError(parent, "Role Permissions error", message);
	}

	public static ENodeTemplate findRequirementNodeInLocalModel(EObject object, EPREFIX_REF reqRef) {
		String nodeName = AADMHelper.getNodeFromRequirementRef(reqRef);
		String req_name = AADMHelper.getRequirementNameFromRequirementRef(reqRef);
		// Find node in local model
		ENodeTemplate nodeTemplate = findNodeInModel(object, nodeName);
		if (nodeTemplate != null) {
			// Get requirement, if found, get node
			return findRequirementNodeInTemplate(req_name, nodeTemplate);
		}
		return null;
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

	public static String findNodeTemplateInKB(EObject object, String nodeRef) throws SodaliteException {
		// Get modules from model
		List<String> importedModules = AADMHelper.getImportedModules(object);
		String module = AADMHelper.getModule(object);
		// Add current module to imported ones for searching in the KB
		importedModules.add(module);

		TemplateData templates = BackendHelper.getKBReasoner().getTemplates(importedModules);
		for (Template nodeTemplate : templates.getElements()) {
			String nodeTemplateRef = nodeTemplate.getModule() != null
					? nodeTemplate.getModule() + '/' + nodeTemplate.getLabel()
					: nodeTemplate.getLabel();
			if (nodeTemplateRef.equals(nodeRef)) {
				return nodeTemplateRef;
			}
		}
		return null;
	}

	public static String getAADMURI(AADM_Model model) throws IOException {
		// val String filename = model.eResource.URI.lastSegment
		String filepath = model.eResource().getURI().toString().substring("platform:/resource".length());
		IResource resource = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new org.eclipse.core.runtime.Path(filepath));
		IProject project = resource.getProject();
		Path path = getAadmPropertiesFile(resource.toString(), project);
		String uri = null;
		if (Files.exists(path)) {
			Properties props = new Properties();
			try (FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);
					FileLock lock = channel.lock(0L, Long.MAX_VALUE, true)) {
				props.load(Channels.newInputStream(channel));
			}
			uri = props.getProperty("URI");
		}

		return uri;
	}

	public static Path getAadmPropertiesFile(String filepath, IProject project) {
		// val String filepath = aadmFile.toString();
		String filename = filepath.substring(filepath.lastIndexOf("/") + 1);
		String directory = filepath.substring(filepath.indexOf('/', 2) + 1, filepath.lastIndexOf("/"));
		IFile propertiesFile = project.getFile(directory + "/." + filename + ".properties");
		String properties_path = propertiesFile.getLocationURI().toString();
		properties_path = properties_path.substring(properties_path.indexOf(":") + 2);
		if (File.separator.equals("/")) { // Linux
			properties_path = "/" + properties_path;
		}
		Path path = FileSystems.getDefault().getPath(properties_path);
		return path;
	}

	public static List<ENodeTemplate> findLocalNodesForTypes(SortedSet<String> types, EObject reqAssign) {
		List<ENodeTemplate> nodes = new ArrayList<ENodeTemplate>();
		if (types.isEmpty())
			return nodes;
		AADM_Model model = (AADM_Model) findModel(reqAssign);
		for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
			String node_id = (node.getNode().getType().getModule() != null ? node.getNode().getType().getModule() + "/"
					: "") + node.getNode().getType().getType();
			if (types.contains(node_id))
				nodes.add(node);
		}
		return nodes;
	}

	public static List<ENodeTemplate> findLocalNodes(EObject object) {
		AADM_Model model = (AADM_Model) findModel(object);
		if (model != null)
			return model.getNodeTemplates().getNodeTemplates();
		else
			return new ArrayList<ENodeTemplate>();
	}

	public static ENodeTemplate findNodeInModel(EObject object, String nodeName) {
		AADM_Model model = (AADM_Model) findModel(object);
		String module = getModule(object);
		String targetModule = nodeName.substring(0, nodeName.indexOf("/"));
		String targetNode = nodeName.substring(nodeName.lastIndexOf("/") + 1);
		if (!module.equals(targetModule)) {
			return null;
		}
		for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
			if (node.getName().equals(targetNode)) {
				return node;
			}
		}
		return null;
	}

	public static EObject getNodeTemplate(EObject object) {
		if (object.eContainer() == null)
			return null;
		else if (object.eContainer() instanceof ENodeTemplate)
			return object.eContainer();
		else
			return getNodeTemplate(object.eContainer());
	}

	public static ENodeTemplate getEntityNode(GetPropertyBodyImpl body) {
		EEntityReference eEntityReference = body.getEntity();
		ENodeTemplate node = null;
		if (eEntityReference instanceof EEntity) {
			EEntity eEntity = (EEntity) eEntityReference;
			if (eEntity.getEntity().equals("SELF")) {
				node = (ENodeTemplate) getNodeTemplate(body);
			}
		} else {
			// TODO Support other entities: TARGET, HOST, SOURCE, concrete entity
		}
		return node;
	}

	public static ENodeTemplate findRequirementNodeInTemplate(String requirement, ENodeTemplate template) {
		ENodeTemplate node = null;
		if (template.getNode().getRequirements() == null)
			return node;
		for (ERequirementAssignment req : template.getNode().getRequirements().getRequirements()) {
			if (req.getName().equals(requirement)) {
				AADM_Model model = (AADM_Model) findModel(template);
				String module1 = model.getModule();
				if (module1 == null)
					module1 = "";
				String module2 = req.getNode().getModule();
				if (module2 == null)
					module2 = "";
				if (module1.equals(module2)) {
					node = findNode(model, req.getNode().getId());
				} else {
					// TODO Find node in KB
				}
			}
		}
		return node;
	}

	public static ECapabilityAssignment findCapabilityInTemplate(String capabilityName, ENodeTemplate template) {
		ECapabilityAssignment capability = null;
		if (template.getNode().getCapabilities() == null)
			return capability;
		for (ECapabilityAssignment cap : template.getNode().getCapabilities().getCapabilities()) {
			if (cap.getName().equals(capabilityName))
				capability = cap;
		}
		return capability;
	}

	public static ENodeTemplate findNode(AADM_Model model, String nodeName) {
		for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
			if (node.getName().equals(nodeName))
				return node;
		}
		return null;
	}

	public static ParserRule findParserRule(EObject obj) {
		if (obj == null)
			return null;
		else if (obj instanceof ParserRule)
			return (ParserRule) obj;
		else
			return findParserRule(obj.eContainer());
	}

	public static EPolicyDefinition findPolicy(AADM_Model model, String policyName) {
		for (EPolicyDefinition policy : model.getPolicies().getPolicies()) {
			if (policy.getName().equals(policyName))
				return policy;
		}
		return null;
	}
}
