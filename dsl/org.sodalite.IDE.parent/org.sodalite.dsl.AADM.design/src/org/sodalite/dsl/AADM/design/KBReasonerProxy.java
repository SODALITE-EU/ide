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
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.EAttributeAssignment;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.EPolicyDefinition;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.aADM.impl.ERequirementAssignmentImpl;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignment;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.ModuleData;
import org.sodalite.dsl.kb_reasoner_client.types.OperationDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.OperationDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.Template;
import org.sodalite.dsl.kb_reasoner_client.types.TemplateData;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.kb_reasoner_client.types.TypeData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNode;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;
import org.sodalite.dsl.rM.EEvenFilter;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EPropertyAssignment;
import org.sodalite.dsl.rM.ETriggerDefinition;
import org.sodalite.dsl.ui.backend.RMBackendProxy;
import org.sodalite.dsl.ui.helper.AADMHelper;
import org.sodalite.dsl.ui.helper.RMHelper;
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

	public SortedSet<String> getOperations(ETriggerDefinition trigger) {
		SortedSet<String> operations = new TreeSet<String>();
		try {
			List<String> importedModules = AADM_Helper.processListModules(trigger);
			OperationDefinitionData operationsData = RMBackendProxy.getKBReasoner().getOperations(importedModules);

			for (OperationDefinition op : operationsData.getElements()) {
				operations.add(renderOperationDefinition(op));
			}

		} catch (Exception e) {
			SodaliteLogger.log("Error getting operations", e);
		}

		return operations;
	}

	private String renderOperationDefinition(OperationDefinition op) {
		String module = AADM_Helper.getBetweenLast2Delimiters(op.getDefinedIn(), "/");
		String _interface = AADM_Helper.getLastSegment(op.getDefinedIn(), "/");
		String oper_name = AADM_Helper.getLastSegment(op.getUri().toString(), "/");
		String qOperation = module != "tosca" ? module + '/' + _interface + '.' + oper_name
				: _interface + '.' + oper_name;
		return qOperation;
	}

	public SortedSet<String> getImports(AADM_Model model) {
		SortedSet<String> imports = new TreeSet<String>();
		try {

			ModuleData modules = RMBackendProxy.getKBReasoner().getModules();
			for (String module : modules.getElements()) {
				String moduleLabel = module.substring(module.lastIndexOf("/", module.length() - 2) + 1,
						module.length() - 1);
				imports.add(moduleLabel);
			}
		} catch (Exception e) {
			SodaliteLogger.log("Error getting imports", e);
		}

		return imports;
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
			SodaliteLogger.log("Error getting node types", e);
		}

		return types;
	}

	public SortedSet<String> getNodeTemplates(EObject object) {
		SortedSet<String> result = new TreeSet<String>();
		try {
			List<String> modules = new ArrayList<>();
			modules.add(AADM_Helper.getModule(object));
			modules.addAll(AADM_Helper.getImports(object));
			ReasonerData<Template> templates = RMBackendProxy.getKBReasoner().getTemplates(modules);
			for (Template t : templates.getElements()) {
				result.add(renderTemplate(t));
			}
			List<ENodeTemplate> nodeTemplates = AADM_Helper.getNodeTemplates(object);
			for (ENodeTemplate t : nodeTemplates) {
				result.add(AADM_Helper.renderTemplate(t));
			}

		} catch (Exception e) {
			SodaliteLogger.log("Error getting node templates", e);
		}

		return result;
	}

	public SortedSet<String> getPolicyTypes(EPolicyDefinition policy) {
		SortedSet<String> types = new TreeSet<String>();
		try {
			List<String> modules = new ArrayList<>();
			modules.add(AADM_Helper.getModule(policy));
			modules.addAll(AADM_Helper.getImports(policy));
			ReasonerData<Type> policies = RMBackendProxy.getKBReasoner().getPolicyTypes(modules);
			for (Type p : policies.getElements()) {
				types.add(renderType(p));
			}
		} catch (Exception e) {
			SodaliteLogger.log("Error getting policy types", e);
		}

		return types;
	}

	private String renderType(Type type) {
		return (type.getModule() != null ? AADM_Helper.renderModule(type.getModule()) + "/" : "") + type.getLabel();
	}

	private String renderTemplate(Template template) {
		return (template.getModule() != null ? AADM_Helper.renderModule(template.getModule()) + "/" : "")
				+ template.getLabel();
	}

	private String renderNode(ValidRequirementNode node) {
		return (node.getModule() != null ? AADM_Helper.renderModule(node.getModule()) + "/" : "") + node.getLabel();
	}

	private String render(RequirementDefinition req) {
		return (req.getModule() != null ? AADM_Helper.renderModule(req.getModule()) + "/" : "")
				+ AADM_Helper.getLastSegment(req.getUri().toString(), "/");
	}

	private String render(ERequirementAssignment req, ENodeTemplate node) {
		String module = AADM_Helper.getModule(req);
		return (module != null ? AADM_Helper.renderModule(module) + "/" : "") + node.getName() + "." + req.getName();
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

	private List<CapabilityDefinition> findCapabilitiesInNodeType(String nodeRef) throws Exception {
		CapabilityDefinitionData capabilities = RMBackendProxy.getKBReasoner().getTypeCapabilities(nodeRef);
		return capabilities.getElements();
	}

	private String findNodeTemplateInKB(EObject object, String nodeRef) throws Exception {
		// Get modules from model
		List<String> modules = new ArrayList<>();
		modules.add(AADM_Helper.getModule(object));
		modules.addAll(AADM_Helper.getImports(object));

		TemplateData templates = RMBackendProxy.getKBReasoner().getTemplates(modules);

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

	public SortedSet<String> getCapabilitiesOfNode(EPREFIX_TYPE type) throws Exception {
		SortedSet<String> result = new TreeSet<String>();
		EEvenFilter filter = (EEvenFilter) type.eContainer();
		List<CapabilityDefinition> capabilityDefinitions = null;
		List<CapabilityAssignment> capabilityAssignments = null;
		String cap_assign_type = null;
		String cap_def_type = null;

		if (filter.getRequirement() == null) { // If requirement not set
			// Find capabilities defined in filter node template type
			String filter_node_type = null;
			if (AADM_Helper.moduleBelongsToModel(type)) {
				ENodeTemplate filter_node = AADM_Helper.findNode(filter, filter.getNode());
				if (filter_node != null) {
					// A) Node lives in RM
					filter_node_type = AADM_Helper.renderType(filter_node.getNode().getType());
				}
			}

			if (filter_node_type == null) {
				// B) Node lives in KB
				filter_node_type = findNodeTemplateInKB(filter, AADM_Helper.render(filter.getNode()));
			}
			if (filter_node_type != null) {
				// Find capabilities defined in filter node template type
				capabilityDefinitions = findCapabilitiesInNodeType(filter_node_type);
				cap_def_type = filter_node_type; // FIXME take defining type from capability
			}

		} else { // If requirement set
					// Find capabilities defined in filter node requirement node: req_node (if node
					// is template in its type)

			// Find requirement node in local model from requirement ref
			ENodeTemplate req_node = AADM_Helper.findRequirementNodeInLocalModel(filter, filter.getRequirement());
			if (req_node != null) { // A) Node lives in RM
				// Find capabilities defined in req node type
				String node_type = AADM_Helper.render(req_node.getNode().getType());
				CapabilityDefinitionData capabilityData = RMBackendProxy.getKBReasoner().getTypeCapabilities(node_type);
				capabilityDefinitions = capabilityData.getElements();
				cap_def_type = node_type; // FIXME take defining type from capability
			} else { // B) Node lives in KB
				String nodeName = AADM_Helper.getNodeFromRequirementRef(filter.getRequirement());
				String req_name = AADM_Helper.getRequirementNameFromRequirementRef(filter.getRequirement());
				CapabilityAssignmentData capabilityData = RMBackendProxy.getKBReasoner()
						.getCapabilitiesDeclaredInTargetNodeForNodeTemplateRequirement(nodeName, req_name);
				capabilityAssignments = capabilityData.getElements();
				cap_assign_type = nodeName; // FIXME take defining type from capability
			}
		}

		if (capabilityAssignments != null) {
			// Prepare suggestions for capabilities
			for (CapabilityAssignment cap : capabilityAssignments) {
				String proposal = cap_assign_type + '.' + AADM_Helper.getLastSegment(cap.getUri().toString(), "/");
				result.add(proposal);
			}
		}

		if (capabilityDefinitions != null) {
			// Prepare suggestions for capabilities
			// Prepare suggestions for capabilities
			for (CapabilityDefinition cap : capabilityDefinitions) {
				String proposal = cap_def_type + '.' + AADM_Helper.getLastSegment(cap.getUri().toString(), "/");
				result.add(proposal);
			}
		}

		return result;
	}

	public SortedSet<String> getRequirementsOfNode(EPREFIX_TYPE type) throws Exception {
		// Find requirements declared in node (could be local or KB)
		SortedSet<String> result = new TreeSet<String>();
		EEvenFilter filter = (EEvenFilter) type.eContainer();
		if (filter.getNode() != null) {
			if (AADM_Helper.moduleBelongsToModel(type)) {
				ENodeTemplate node = AADM_Helper.findNode(filter, filter.getNode());
				if (node != null) { // Local node
					for (ERequirementAssignment req : node.getNode().getRequirements().getRequirements()) {
						result.add(render(req, node));
					}
				} else { // KB node
					String nodeType = AADM_Helper.renderType(node.getNode().getType());
					RequirementDefinitionData data = RMBackendProxy.getKBReasoner().getTypeRequirements(nodeType);
					if (data != null) {
						for (RequirementDefinition reqDef : data.getElements()) {
							result.add(render(reqDef));
						}
					}
				}
			}
		}
		return result;
	}

	public SortedSet<String> getRequirementNodes(ERequirementAssignment req) throws Exception {
		// Find nodes that satisfy a given requirement
		SortedSet<String> result = new TreeSet<String>();
		SortedSet<String> types = new TreeSet<String>();
		ValidRequirementNodeData vrnd = AADMHelper.getValidRequirementNodes((ERequirementAssignmentImpl) req);
		if (vrnd != null) {
			System.out.println("Valid requirement nodes retrieved from KB for requirement: " + req.getName());
			for (ValidRequirementNode vrn : vrnd.getElements()) {
				types.add(vrn.getType().getLabel());
				System.out.println("Valid requirement node: " + vrn.getLabel());
				result.add(renderNode(vrn));
			}
		}

		// Find local nodes that belongs to suggested types
		TypeData tovrnd = AADMHelper.getTypeOfValidRequirementNodes((ERequirementAssignmentImpl) req);
		if (tovrnd.getElements().isEmpty())
			throw new Exception("Type of valid nodes satisfying the requirement not found");
		Type superType = tovrnd.getElements().get(0);
		String qsuperType = superType.getModule() != null
				? RMHelper.getLastSegment(superType.getModule(), "/") + "/" + superType.getLabel()
				: superType.getLabel();
		List<ENodeTemplate> localnodes = AADMHelper.findLocalNodesForType(qsuperType, req);
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
