package org.sodalite.dsl.AADM.design;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.jface.preference.IPreferenceStore;
import org.sodalite.dsl.aADM.EAttributeAssignment;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ENodeTemplateBody;
import org.sodalite.dsl.aADM.EPropertyAssignment;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNode;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;

/**
 * The services class used by VSM.
 */
public class KBReasonerProxy {

	private static KBReasonerClient getKBReasoner() {
		// Configure KBReasonerClient endpoint from preference page information
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		String kbReasonerURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		String iacURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		String xoperaURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		KBReasonerClient kbclient = new KBReasonerClient(kbReasonerURI, iacURI, xoperaURI);
		System.out.println(
				MessageFormat.format("Sodalite backend configured with [KB Reasoner API: {0}, IaC API: {1}, xOpera {2}",
						kbReasonerURI, iacURI, xoperaURI));
		return kbclient;
	}

	public List<String> getTypes(ENodeTemplate node) {
		List<String> types = new ArrayList<>();
		try {
			List<String> modules = new ArrayList<>();
			modules.add(AADM_Helper.getModule(node));
			modules.addAll(AADM_Helper.getImports(node));
			ReasonerData<Type> nodes = getKBReasoner().getNodeTypes(modules);
			for (Type n : nodes.getElements()) {
				types.add(renderType(n));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return types;
	}

	private String renderType(Type type) {
		return (type.getModule() != null ? renderModule(type.getModule()) + "/" : "") + type.getLabel();
	}

	private String renderModule(String module) {
		String[] split = module.split("/");
		return split[split.length - 1];
	}

	public List<String> getAttributes(EAttributeAssignment attr) {
		List<String> result = new ArrayList<>();
		try {
			String type = AADM_Helper.findContainerType(attr, getKBReasoner());
			if (type == null)
				return result;
			ReasonerData<AttributeDefinition> attributes = getKBReasoner().getTypeAttributes(type);
			for (AttributeDefinition a : attributes.getElements()) {
				String label = a.getUri().toString().substring(a.getUri().toString().lastIndexOf('/') + 1,
						a.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public List<String> getProperties(EPropertyAssignment prop) {
		List<String> result = new ArrayList<>();
		try {
			String type = AADM_Helper.findContainerType(prop, getKBReasoner());
			if (type == null)
				return result;
			ReasonerData<PropertyDefinition> properties = getKBReasoner().getTypeProperties(type);
			for (PropertyDefinition p : properties.getElements()) {
				String label = p.getUri().toString().substring(p.getUri().toString().lastIndexOf('/') + 1,
						p.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public List<String> getCapabilities(ECapabilityAssignment cap) {
		List<String> result = new ArrayList<>();
		try {
			String type = AADM_Helper.findContainerType(cap, getKBReasoner());
			if (type == null)
				return result;
			ReasonerData<CapabilityDefinition> capabilities = getKBReasoner().getTypeCapabilities(type);
			for (CapabilityDefinition c : capabilities.getElements()) {
				String label = c.getUri().toString().substring(c.getUri().toString().lastIndexOf('/') + 1,
						c.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public List<String> getRequirements(ERequirementAssignment req) {
		List<String> result = new ArrayList<>();
		try {
			String type = AADM_Helper.findContainerType(req, getKBReasoner());
			if (type == null)
				return result;
			ReasonerData<RequirementDefinition> requirements = getKBReasoner().getTypeRequirements(type);
			for (RequirementDefinition r : requirements.getElements()) {
				String label = r.getUri().toString().substring(r.getUri().toString().lastIndexOf('/') + 1,
						r.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public SortedSet<String> getRequirementNodes(ERequirementAssignment req) throws Exception {
		SortedSet<String> result = new TreeSet<String>();
		SortedSet<String> types = new TreeSet<String>();
		EPREFIX_TYPE nodeType = ((ENodeTemplateBody) req.eContainer().eContainer()).getType();
		String resourceId = (nodeType.getModule() != null ? nodeType.getModule() + "/" : "") + nodeType.getType();
		List<String> modules = new ArrayList<>();
		modules.add(AADM_Helper.getModule(req));
		modules.addAll(AADM_Helper.getImports(req));
		ValidRequirementNodeData vrnd = getKBReasoner().getValidRequirementNodes(req.getName(), resourceId, modules);
		if (vrnd != null) {
			System.out.println("Valid requirement nodes retrieved from KB for requirement: " + req.getName());
			for (ValidRequirementNode vrn : vrnd.getElements()) {
				types.add(vrn.getType().getLabel());
				System.out.println("Valid requirement node: " + vrn.getLabel());
				result.add(vrn.getLabel());
			}
		}

		// Find local nodes that belongs to suggested types
		List<ENodeTemplate> localnodes = AADM_Helper.findLocalNodesForTypes(types, req);
		for (ENodeTemplate node : localnodes) {
			System.out.println("Valid requirement local node: " + node.getName());
			result.add(node.getName());
		}
		return result;
	}

	public List<String> getDataTypes(EParameterDefinition par) {
		// TODO implement it
		throw new UnsupportedOperationException();
	}

}
