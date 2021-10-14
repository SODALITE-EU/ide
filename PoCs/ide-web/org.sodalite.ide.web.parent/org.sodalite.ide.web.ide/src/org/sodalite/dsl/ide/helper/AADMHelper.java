package org.sodalite.dsl.ide.helper;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.EEntity;
import org.sodalite.dsl.aADM.EEntityReference;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.EPREFIX_REF;
import org.sodalite.dsl.aADM.EPREFIX_TYPE;
import org.sodalite.dsl.aADM.EPREFIX_ID;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.aADM.impl.ENodeTemplateBodyImpl;
import org.sodalite.dsl.aADM.impl.GetPropertyBodyImpl;
import org.sodalite.dsl.kb_reasoner_client.types.TypeData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;
import org.sodalite.dsl.ide.backend.SodaliteBackendProxy;

public class AADMHelper {

	static enum Boolean {
		True, False
	}

	public static String extractModule(String module) {
		return module.substring(module.lastIndexOf("/", module.length() - 2) + 1, module.length() - 1);
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
	
	public static ValidRequirementNodeData getValidRequirementNodes(ERequirementAssignment req)
			throws Exception {
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

		return SodaliteBackendProxy.getKBReasoner().getValidRequirementNodes(requirementId, resourceId,
				importedModules);
	}
	
	public static TypeData getTypeOfValidRequirementNodes(ERequirementAssignment req)
			throws Exception {
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

		return SodaliteBackendProxy.getKBReasoner().getTypeOfValidRequirementNodes(requirementId, resourceId,
				importedModules);
	}
	
	public static List<ENodeTemplate> findLocalNodesForType(String type, EObject reqAssign) throws Exception {
		List<ENodeTemplate> nodes = new ArrayList<ENodeTemplate>();
		
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
		List<String> validSubClasses = SodaliteBackendProxy.getKBReasoner().getSubClassesOf(keys, type);

		for (String validClass : validSubClasses) {
			if (candidateNodes.containsKey(validClass))
				nodes.addAll(candidateNodes.get(validClass));
		}
		
		return nodes;
	}
	
	public static List<ENodeTemplate> findNodes(EObject object) {
		AADM_Model model = (AADM_Model) findModel(object);
		return model.getNodeTemplates().getNodeTemplates();
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
	
	public static EObject getNodeTemplate(EObject object) {
		if (object.eContainer() == null)
			return null;
		else if (object.eContainer() instanceof ENodeTemplate)
			return object.eContainer();
		else
			return getNodeTemplate(object.eContainer());
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
	
	public static ENodeTemplate findNode(AADM_Model model, String nodeName) {
		for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
			if (node.getName().equals(nodeName))
				return node;
		}
		return null;
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
}
