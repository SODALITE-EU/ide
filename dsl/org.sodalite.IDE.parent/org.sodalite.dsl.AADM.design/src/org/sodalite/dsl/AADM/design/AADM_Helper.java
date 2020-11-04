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
import org.sodalite.dsl.kb_reasoner_client.types.Capability;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
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
			ReasonerData<Capability> capabilities = reasoner.getCapabilities(type);
			for (Capability c : capabilities.getElements()) {
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
			if (types.contains(node.getNode().getType()))
				nodes.add(node);
		}
		return nodes;
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
}
