package org.sodalite.dsl.AADM.design;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ENodeTemplateBody;
import org.sodalite.dsl.aADM.EPolicyDefinitionBody;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.rM.EDataTypeName;
import org.sodalite.dsl.rM.EInterfaceType;
import org.sodalite.dsl.rM.EOperationDefinition;
import org.sodalite.dsl.rM.EPREFIX_ID;
import org.sodalite.dsl.rM.EPREFIX_REF;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EPRIMITIVE_TYPE;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class AADM_Helper {

	public static String findContainerType(EObject obj, KBReasonerClient reasoner) {
		EObject container = obj.eContainer().eContainer();
		if (container instanceof ENodeTemplateBody) {
			EPREFIX_TYPE type = ((ENodeTemplateBody) container).getType();
			String resourceId = (type.getModule() != null ? type.getModule() + "/" : "") + type.getType();
			return resourceId;
		} else if (container instanceof ECapabilityAssignment) {
			ECapabilityAssignment cap = (ECapabilityAssignment) container;
			return findCapabilityType(cap, reasoner);
		} else if (container instanceof EPolicyDefinitionBody) {
			EPolicyDefinitionBody policy = (EPolicyDefinitionBody) container;
			EPREFIX_TYPE type = policy.getType();
			String resourceId = (type.getModule() != null ? type.getModule() + "/" : "") + type.getType();
			return resourceId;
		} else
			return null;
	}

	public static String findCapabilityType(ECapabilityAssignment cap, KBReasonerClient reasoner) {
		String result = null;
		try {
			String type = findContainerType(cap, reasoner);
			if (type == null)
				return result;
			ReasonerData<CapabilityDefinition> capabilities = reasoner.getTypeCapabilities(type);
			for (CapabilityDefinition c : capabilities.getElements()) {
				String label = c.getUri().toString().substring(c.getUri().toString().lastIndexOf('/') + 1,
						c.getUri().toString().length());
				if (label.equals(cap.getName()))
					return c.getType().getLabel();
			}
		} catch (Exception e) {
			SodaliteLogger.log("Error getting type capabilities", e);
		}

		return result;
	}

	public static AADM_Model findModel(EObject obj) {
		EObject container = obj.eContainer();
		while (container != null) {
			if (container instanceof AADM_Model)
				return (AADM_Model) container;
			container = container.eContainer();
		}
		return null;
	}

	public static List<ENodeTemplate> findLocalNodesForTypes(SortedSet<String> types, EObject reqAssign) {
		List<ENodeTemplate> nodes = new ArrayList<ENodeTemplate>();
		AADM_Model model = (AADM_Model) findModel(reqAssign);
		if (model == null)
			return nodes;
		for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
			if (types.contains(renderType(node.getNode().getType())))
				nodes.add(node);
		}
		return nodes;
	}

	public static String render(EPREFIX_REF ref) {
		String result = null;
		if (ref instanceof EPREFIX_TYPE) {
			result = renderType((EPREFIX_TYPE) ref);
		} else if (ref instanceof EPREFIX_ID) {
			result = renderType((EPREFIX_ID) ref);
		}
		return result;
	}

	public static String renderType(EPREFIX_TYPE type) {
		return (type.getModule() != null ? renderModule(type.getModule()) + "/" : "") + type.getType();
	}

	public static String renderType(EPREFIX_ID type) {
		return (type.getModule() != null ? renderModule(type.getModule()) + "/" : "") + type.getId();
	}

	public static String renderType(EDataTypeName type) {
		if (type instanceof EPREFIX_TYPE)
			return renderType((EPREFIX_TYPE) type);
		else if (type instanceof EPRIMITIVE_TYPE)
			return ((EPRIMITIVE_TYPE) type).getType();
		else
			return null;
	}

	public static String renderPrefixId(EPREFIX_ID id) {
		if (id == null)
			return "";
		else
			return (id.getModule() != null ? renderModule(id.getModule()) + "/" : "") + id.getId();
	}

	public static String renderTemplate(ENodeTemplate type) {
		String module = getModule(type);
		return (module != null ? renderModule(module) + "/" : "") + type.getName();
	}

	public static String renderModule(String module) {
		String[] split = module.split("/");
		return split[split.length - 1];
	}

	public static List<EParameterDefinition> findInputs(AADM_Model model) {
		List<EParameterDefinition> inputs = new ArrayList<>();
		for (EParameterDefinition input : model.getInputs().getInputs()) {
			inputs.add(input);
		}
		return inputs;
	}

	public static ENodeTemplate findNode(EObject object, EPREFIX_REF ref) {
		String nodeName = null;
		if (ref instanceof EPREFIX_ID)
			nodeName = ((EPREFIX_ID) ref).getId();
		else if (ref instanceof EPREFIX_TYPE)
			nodeName = ((EPREFIX_TYPE) ref).getType();
		return findNode(object, nodeName);
	}

	public static ENodeTemplate findNode(EObject object, String nodeName) {
		AADM_Model model = findModel(object);
		if (model != null) {
			for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
				if (node.getName().equals(nodeName)) {
					return node;
				}
			}
		}
		return null;
	}

	public static List<ENodeTemplate> getNodeTemplates(EObject object) {
		AADM_Model model = findModel(object);
		if (model != null) {
			return model.getNodeTemplates().getNodeTemplates();
		}
		return null;
	}

	public static String getModule(EObject obj) {
		AADM_Model model = findModel(obj);
		if (model != null)
			return model.getModule();
		else
			return null;
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

	public static List<String> getImports(EObject obj) {
		AADM_Model model = findModel(obj);
		if (model != null)
			return model.getImports();
		else
			return null;
	}

	public static String renderType(Type type) {
		return (type.getModule() != null ? renderModule(type.getModule()) + "/" : "") + type.getLabel();
	}

	public static EObject getNodeTemplate(EObject object) {
		if (object.eContainer() == null)
			return null;
		else if (object.eContainer() instanceof ENodeTemplate)
			return object.eContainer();
		else
			return getNodeTemplate(object.eContainer());
	}

	public static String getLastSegment(String string, String delimiter) {
		String newString = string;
		if (string.endsWith(delimiter))
			newString = string.substring(0, string.length() - delimiter.length());
		return newString.substring(newString.lastIndexOf(delimiter) + 1);
	}

	public static ENodeTemplate findRequirementNodeInLocalModel(EObject object, EPREFIX_REF reqRef) {
		String nodeRef = AADM_Helper.getNodeFromRequirementRef(reqRef);
		String nodeName = AADM_Helper.getLastSegment(nodeRef, "/");
		String req_name = AADM_Helper.getRequirementNameFromRequirementRef(reqRef);
		// Find node in local model

		ENodeTemplate nodeTemplate = AADM_Helper.findNode(object, nodeName);
		if (nodeTemplate != null) {
			// Get requirement, if found, get node
			return AADM_Helper.findRequirementNodeInTemplate(req_name, nodeTemplate);
		}
		return null;
	}

	public static String getRequirementNameFromRequirementRef(EPREFIX_REF reqRef) {
		String reqName = null;
		if (reqRef instanceof EPREFIX_TYPE) {
			EPREFIX_TYPE req = (EPREFIX_TYPE) reqRef;
			reqName = AADM_Helper.getLastSegment(req.getType(), ".");
		} else if (reqRef instanceof EPREFIX_ID) {
			EPREFIX_ID req = (EPREFIX_ID) reqRef;
			reqName = AADM_Helper.getLastSegment(req.getId(), ".");
		}
		return reqName;
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

	public static ENodeTemplate findRequirementNodeInTemplate(String requirement, ENodeTemplate template) {
		ENodeTemplate node = null;
		if (template.getNode().getRequirements() == null)
			return node;
		for (ERequirementAssignment req : template.getNode().getRequirements().getRequirements()) {
			if (req.getName().equals(requirement)) {
				AADM_Model model = (AADM_Model) findModel(template);
				if (model != null) {
					String module = model.getModule();
					if (module != null) {
						if (req.getNode().getModule().equals(module)) {
							node = findNode(model, req.getNode().getId());
						} else {
							// TODO Find node in KB
						}
					}
				}
			}
		}
		return node;
	}

	public static ERequirementAssignment findRequirementInTemplate(String requirement, ENodeTemplate template) {
		ERequirementAssignment result = null;
		if (template.getNode().getRequirements() == null)
			return result;
		for (ERequirementAssignment req : template.getNode().getRequirements().getRequirements()) {
			if (req.getName().equals(requirement)) {
				result = req;
			}
		}
		return result;
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

	private static ENodeTemplate findNode(AADM_Model model, String nodeName) {
		for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
			if (node.getName().equals(nodeName))
				return node;
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

	private static List<String> getImportedModules(EObject object) {
		List<String> modules = new ArrayList();
		AADM_Model model = (AADM_Model) findModel(object);
		for (String _import : model.getImports())
			modules.add(_import);

		return modules;
	}

	public static String getBetweenLast2Delimiters(String input, String delimiter) {
		int endIndex = input.lastIndexOf(delimiter);
		String subInput = input.substring(0, endIndex);
		int beginIndex = subInput.lastIndexOf(delimiter);
		return input.subSequence(beginIndex + 1, endIndex).toString();
	}

	public static String renderEOperationDefinition(EOperationDefinition op) {
		EInterfaceType _interface = (EInterfaceType) op.eContainer().eContainer().eContainer();
		String module = getModule(op);
		String qOperation = module != null ? module + '/' + _interface.getName() + '.' + op.getName()
				: _interface.getName() + '.' + op.getName();
		return qOperation;
	}

	public static boolean moduleBelongsToModel(EPREFIX_REF ref) {
		boolean result = false;
		String modelModule = AADM_Helper.getModule(ref);
		String refModule = null;
		if (ref instanceof EPREFIX_TYPE)
			refModule = ((EPREFIX_TYPE) ref).getModule();
		else if (ref instanceof EPREFIX_ID)
			refModule = ((EPREFIX_ID) ref).getModule();
		if (modelModule == null && refModule == null)
			result = true;
		else if (modelModule != null)
			result = modelModule.equals(refModule);
		else if (refModule != null)
			result = refModule.equals(modelModule);

		return result;
	}

}
