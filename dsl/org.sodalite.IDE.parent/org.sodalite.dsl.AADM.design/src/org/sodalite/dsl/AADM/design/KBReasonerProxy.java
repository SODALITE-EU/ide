package org.sodalite.dsl.AADM.design;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.aADM.EAttributeAssignment;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ENodeTemplateBody;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNode;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EPropertyAssignment;
import org.sodalite.dsl.ui.backend.RMBackendProxy;
import org.sodalite.ide.ui.logger.SodaliteLogger;

/**
 * The services class used by VSM.
 */
public class KBReasonerProxy {

	private static void raiseConfigurationIssue(String message) throws Exception {
		Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openError(parent, "Sodalite Preferences Error",
						message + " in Sodalite preferences pages");
			}
		});
		throw new Exception(message + " in Sodalite preferences pages");
	}

	public SortedSet<String> getTypes(ENodeTemplate node) {
		SortedSet<String> types = new TreeSet<String>();
		try {
			List<String> modules = new ArrayList<>();
			modules.add(AADM_Helper.getModule(node));
			modules.addAll(AADM_Helper.getImports(node));
			ReasonerData<Type> nodes = RMBackendProxy.getKBReasoner().getNodeTypes(modules);
			for (Type n : nodes.getElements()) {
				types.add(renderType(n));
			}
		} catch (Exception e) {
			SodaliteLogger.log("Error getting types", e);
		}

		return types;
	}

	private String renderType(Type type) {
		return (type.getModule() != null ? AADM_Helper.renderModule(type.getModule()) + "/" : "") + type.getLabel();
	}

	private String renderNode(ValidRequirementNode node) {
		return (node.getModule() != null ? AADM_Helper.renderModule(node.getModule()) + "/" : "") + node.getLabel();
	}

	public SortedSet<String> getAttributes(EAttributeAssignment attr) {
		SortedSet<String> result = new TreeSet<String>();
		try {
			String type = AADM_Helper.findContainerType(attr, RMBackendProxy.getKBReasoner());
			if (type == null)
				return result;
			ReasonerData<AttributeDefinition> attributes = RMBackendProxy.getKBReasoner().getTypeAttributes(type);
			for (AttributeDefinition a : attributes.getElements()) {
				String label = a.getUri().toString().substring(a.getUri().toString().lastIndexOf('/') + 1,
						a.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			SodaliteLogger.log("Error getting attributes", e);
		}

		return result;
	}

	public SortedSet<String> getProperties(EPropertyAssignment prop) {
		SortedSet<String> result = new TreeSet<String>();
		try {
			String type = AADM_Helper.findContainerType(prop, RMBackendProxy.getKBReasoner());
			if (type == null)
				return result;
			ReasonerData<PropertyDefinition> properties = RMBackendProxy.getKBReasoner().getTypeProperties(type);
			for (PropertyDefinition p : properties.getElements()) {
				String label = p.getUri().toString().substring(p.getUri().toString().lastIndexOf('/') + 1,
						p.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			SodaliteLogger.log("Error getting properties", e);
		}

		return result;
	}

	public SortedSet<String> getCapabilities(ECapabilityAssignment cap) {
		SortedSet<String> result = new TreeSet<String>();
		try {
			String type = AADM_Helper.findContainerType(cap, RMBackendProxy.getKBReasoner());
			if (type == null)
				return result;
			ReasonerData<CapabilityDefinition> capabilities = RMBackendProxy.getKBReasoner().getTypeCapabilities(type);
			for (CapabilityDefinition c : capabilities.getElements()) {
				String label = c.getUri().toString().substring(c.getUri().toString().lastIndexOf('/') + 1,
						c.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			SodaliteLogger.log("Error getting capabilities", e);
		}

		return result;
	}

	public SortedSet<String> getRequirements(ERequirementAssignment req) {
		SortedSet<String> result = new TreeSet<String>();
		try {
			String type = AADM_Helper.findContainerType(req, RMBackendProxy.getKBReasoner());
			if (type == null)
				return result;
			ReasonerData<RequirementDefinition> requirements = RMBackendProxy.getKBReasoner().getTypeRequirements(type);
			for (RequirementDefinition r : requirements.getElements()) {
				String label = r.getUri().toString().substring(r.getUri().toString().lastIndexOf('/') + 1,
						r.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			SodaliteLogger.log("Error getting requirements", e);
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
		ValidRequirementNodeData vrnd = RMBackendProxy.getKBReasoner().getValidRequirementNodes(req.getName(),
				resourceId, modules);
		if (vrnd != null) {
			System.out.println("Valid requirement nodes retrieved from KB for requirement: " + req.getName());
			for (ValidRequirementNode vrn : vrnd.getElements()) {
				types.add(vrn.getType().getLabel());
				System.out.println("Valid requirement node: " + vrn.getLabel());
				result.add(renderNode(vrn));
			}
		}

		// Find local nodes that belongs to suggested types
		List<ENodeTemplate> localnodes = AADM_Helper.findLocalNodesForTypes(types, req);
		for (ENodeTemplate node : localnodes) {
			System.out.println("Valid requirement local node: " + node.getName());
			result.add(AADM_Helper.renderTemplate(node));
		}
		return result;
	}

	public SortedSet<String> getDataTypes(EObject par) {
		SortedSet<String> types = new TreeSet<String>();
		try {
			List<String> modules = new ArrayList<>();
			modules.add(AADM_Helper.getModule(par));
			modules.addAll(AADM_Helper.getImports(par));
			ReasonerData<Type> dataTypes = RMBackendProxy.getKBReasoner().getDataTypes(modules);
			for (Type dt : dataTypes.getElements()) {
				types.add(renderType(dt));
			}
		} catch (Exception e) {
			SodaliteLogger.log("Error getting data types", e);
		}

		return types;
	}

}
