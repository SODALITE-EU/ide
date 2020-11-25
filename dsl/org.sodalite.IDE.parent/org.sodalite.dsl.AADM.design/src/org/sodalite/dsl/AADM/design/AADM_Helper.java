package org.sodalite.dsl.AADM.design;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ENodeTemplateBody;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.rM.EPREFIX_ID;
import org.sodalite.dsl.rM.EPREFIX_TYPE;

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
			e.printStackTrace();
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

	public static String renderType(EPREFIX_TYPE type) {
		return (type.getModule() != null ? renderModule(type.getModule()) + "/" : "") + type.getType();
	}

	public static String renderPrefixId(EPREFIX_ID id) {
		return (id.getModule() != null ? renderModule(id.getModule()) + "/" : "") + id.getId();
	}

	public static String renderTemplate(ENodeTemplate type) {
		return (getModule(type) != null ? renderModule(getModule(type)) + "/" : "") + type.getName();
	}

	public static String renderModule(String module) {
		String[] split = module.split("/");
		return split[split.length - 1];
	}

	public static ENodeTemplate findNode(ERequirementAssignment req, String nodeName) {
		AADM_Model model = findModel(req);
		if (model != null) {
			for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
				if (node.getName().equals(nodeName)) {
					return node;
				}
			}
		}
		return null;
	}

	public static String getModule(EObject obj) {
		AADM_Model model = findModel(obj);
		return model.getModule();
	}

	public static List<String> getImports(EObject obj) {
		AADM_Model model = findModel(obj);
		return model.getImports();
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

	public static ENodeTemplate findRequirementNodeInTemplate(String requirement, ENodeTemplate template) {
		ENodeTemplate node = null;
		if (template.getNode().getRequirements() == null)
			return node;
		for (ERequirementAssignment req : template.getNode().getRequirements().getRequirements()) {
			if (req.getName().equals(requirement)) {
				AADM_Model model = (AADM_Model) findModel(template);
				String module = model.getModule();
				if (req.getNode().getModule().equals(module)) {
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

	private static ENodeTemplate findNode(AADM_Model model, String nodeName) {
		for (ENodeTemplate node : model.getNodeTemplates().getNodeTemplates()) {
			if (node.getName().equals(nodeName))
				return node;
		}
		return null;
	}

}
