/*
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.ui.contentassist


import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.Keyword
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData
import org.sodalite.dsl.kb_reasoner_client.KBReasoner
import org.eclipse.jface.preference.IPreferenceStore
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient
import java.text.MessageFormat
import org.sodalite.dsl.ui.preferences.PreferenceConstants
import org.sodalite.dsl.ui.preferences.Activator
import java.util.List
import org.sodalite.dsl.kb_reasoner_client.types.Type
import org.sodalite.dsl.rM.RM_Model
import java.util.ArrayList
import org.eclipse.xtext.RuleCall
import org.eclipse.ui.PlatformUI
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.sodalite.dsl.rM.EPREFIX_TYPE
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.swt.widgets.Shell
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException
import org.eclipse.swt.graphics.Image
import java.net.URL
import org.eclipse.core.runtime.FileLocator
import org.eclipse.jface.resource.ImageDescriptor
import org.osgi.framework.Bundle
import org.eclipse.core.runtime.Path
import java.util.Map
import java.util.HashMap
import org.eclipse.core.runtime.Platform
import org.sodalite.ide.ui.logger.SodaliteLogger

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */

class RMProposalProvider extends AbstractRMProposalProvider {	
	final String SELF_DESCRIPTION = 
	"A TOSCA orchestrator will interpret this keyword as the Node or Relationship\n" + 
	"Template instance that contains the function at the time the function is evaluated"
	final String SOURCE_DESCRIPTION = 
	"A TOSCA orchestrator will interpret this keyword as the Node Template instance that\n" + 
	"is at the source end of the relationship that contains the referencing function."
	final String TARGET_DESCRIPTION = 
	"A TOSCA orchestratorwill interpret this keyword as the Node Template instance that is\n" + 
	"at the target end of the relationship that contains the referencing function"
	final String HOST_DESCRIPTION = "A TOSCA orchestrator will interpret this keyword to refer\n" + 
	"to the all nodes that “host”the node using this reference (i.e., as identified by its HostedOn relationship)."
	
	var Map <String, Image> images = new HashMap<String, Image>();
	
	def KBReasoner getKBReasoner() {
		// Configure KBReasonerClient endpoint from preference page information
		val IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		val String kbReasonerURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		if (kbReasonerURI.isEmpty())
			raiseConfigurationIssue("KB Reasoner URI user not set");

		val String iacURI = store.getString(PreferenceConstants.IaC_URI);
		if (iacURI.isEmpty())
			raiseConfigurationIssue("IaC URI user not set");

		val String xoperaURI = store.getString(PreferenceConstants.xOPERA_URI);
		if (xoperaURI.isEmpty())
			raiseConfigurationIssue("xOpera URI user not set");

		val String keycloakURI = store.getString(PreferenceConstants.KEYCLOAK_URI);
		if (keycloakURI.isEmpty())
			raiseConfigurationIssue("Keycloak URI user not set");

		val KBReasonerClient kbclient = new KBReasonerClient(kbReasonerURI, iacURI, xoperaURI, keycloakURI);

		val String keycloak_enabled = store.getString(PreferenceConstants.KEYCLOAK_ENABLED)
		if (keycloak_enabled.equalsIgnoreCase("true")) {
			val String keycloak_user = store.getString(PreferenceConstants.KEYCLOAK_USER);
			if (keycloak_user.isEmpty())
				raiseConfigurationIssue("Keycloak user not set");
	
			val String keycloak_password = store.getString(PreferenceConstants.KEYCLOAK_PASSWORD);
			if (keycloak_password.isEmpty())
				raiseConfigurationIssue("Keycloak password not set");
	
			val String keycloak_client_id = store.getString(PreferenceConstants.KEYCLOAK_CLIENT_ID);
			if (keycloak_client_id.isEmpty())
				raiseConfigurationIssue("Keycloak client_id not set");
	
			val String keycloak_client_secret = store.getString(PreferenceConstants.KEYCLOAK_CLIENT_SECRET);
			if (keycloak_client_secret.isEmpty())
				raiseConfigurationIssue("Keycloak client secret not set");
	
			kbclient.setUserAccount(keycloak_user, keycloak_password, keycloak_client_id, keycloak_client_secret);	
		}

		SodaliteLogger.log(MessageFormat.format(
				"Sodalite backend configured with [KB Reasoner API: {0}, IaC API: {1}, xOpera {2}, Keycloak {3}",
				kbReasonerURI, iacURI, xoperaURI, keycloakURI));

		return kbclient;
	}
	
	def private void raiseConfigurationIssue(String message) throws Exception {
		val Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		MessageDialog.openError(parent, "Sodalite Preferences Error", message + " in Sodalite preferences pages");
		throw new Exception(message + " in Sodalite preferences pages");
	}
	
	
	// this override filters the keywords for which to create content assist proposals
	override void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		_completeKeyword(keyword, contentAssistContext, acceptor);
	}

	def void _completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		val ICompletionProposal proposal = createCompletionProposal(keyword.getValue(),
			getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
	}
	
	override void completeRM_Model_Imports(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for imports")
		
		val ReasonerData<String> modules = getKBReasoner().modules
			
		System.out.println ("Modules retrieved from KB: " + modules.elements)
		for (module: modules.elements){
			System.out.println ("\tModule: " + module)
			val proposalText = extractModule(module)
			val displayText = proposalText
			val additionalProposalInfo = null
			val Image image = getImage("icons/module2.png");
			createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);	
		}

		super.completeRM_Model_Imports(model, assignment, context, acceptor)
	}
	
	
	def getImage(String path){
		if (!images.containsKey(path)){
			val Bundle bundle = Platform.getBundle("org.sodalite.ide.ui");
			val URL fullPathString = FileLocator.find(bundle, new Path(path), null)
			val ImageDescriptor imageDesc = ImageDescriptor.createFromURL(fullPathString)
			val Image image = imageDesc.createImage()
			if (image !== null)
				images.put(path, image)
		}
		return images.get(path)
	}
	
	def extractModule(String module) {
		return module.substring(module.lastIndexOf("/", module.length - 2) + 1, module.length - 1)
	}
	
	override void completeENodeType_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ENodeType::name property")
		val String proposalText = "tosca.types.id"
		val String displayText = "tosca.types.id"
		val String additionalProposalInfo = "The required id of the node type"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEDataTypeBody_SuperType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EDataType::supertype property")
		try{
			//Get modules from model
			val List<String> importedModules = getImportedModules(model)
			val String module = getModule(model)
			//Add current module to imported ones for searching in the KB
			if (module !== null)
				importedModules.add(module)
			
			val ReasonerData<Type> types = getKBReasoner().getDataTypes(importedModules)
			System.out.println ("Data types retrieved from KB:")
			for (type: types.elements){
				System.out.println ("\tData type: " + type.label)
				val qtype = type.module !== null ?getLastSegment(type.module, '/') + '/' + type.label:type.label
				val proposalText = qtype
				val displayText = qtype
				val additionalProposalInfo = type.description
				var Image image = getImage("icons/type.png")
				if (type.module !== null) 
					image = getImage("icons/primitive_type.png")
				createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);	
			}
			
			//Add other data types defined locally in the model
			val rootModel = findModel(model) as RM_Model
			
			for (dataType: rootModel.dataTypes.dataTypes){
				val EPREFIX_TYPE ePrefixType = dataType.name as EPREFIX_TYPE
				System.out.println ("\tLocal node: " + ePrefixType.type)
				val proposalText = module + "/" + ePrefixType.type 
				val displayText = module + "/" + ePrefixType.type 
				val additionalProposalInfo = dataType.data.description
				var Image image = getImage("icons/type.png")
				if (module !== null) 
					image = getImage("icons/primitive_type.png")
				createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);	
			}		
	
			super.completeENodeTypeBody_SuperType(model, assignment, context, acceptor)
		}catch (NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}
	}
	
	override void completeENodeTypeBody_SuperType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for NodeType::superType property")
		try{
			//Get modules from model
			val List<String> importedModules = getImportedModules(model)
			val String module = getModule(model)
			//Add current module to imported ones for searching in the KB
			importedModules.add(module)
			
			val ReasonerData<Type> nodes = getKBReasoner().getNodeTypes(importedModules)
			System.out.println ("Nodes retrieved from KB:")
			for (node: nodes.elements){
				System.out.println ("\tNode: " + node.label)
				val qnode = node.module !== null ?getLastSegment(node.module, '/') + '/' + node.label:node.label
				val proposalText = qnode
				val displayText = qnode
				val additionalProposalInfo = node.description
				createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);	
			}
			
			//Add other nodes defined locally in the model
			val rootModel = findModel(model) as RM_Model
			
			for (nodeType: rootModel.nodeTypes.nodeTypes){
				System.out.println ("\tLocal node: " + nodeType.name)
				val proposalText = module + "/" + nodeType.name 
				val displayText = module + "/" + nodeType.name 
				val additionalProposalInfo = nodeType.node.description
				createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);	
			}
	
			super.completeENodeTypeBody_SuperType(model, assignment, context, acceptor)
		}catch (NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}
	}
	
	def getLastSegment(String string, String delimiter) {
		return string.split(delimiter).last
	}
	
	override void completeERelationshipTypeBody_SuperType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for RelationshipType::supertype property")
		try{
			//Get modules from model
			val List<String> importedModules = getImportedModules(model)
			val String module = getModule(model)
			//Add current module to imported ones for searching in the KB
			importedModules.add(module)
			
			val ReasonerData<Type> relationships = getKBReasoner().getRelationshipTypes(importedModules)
			System.out.println ("Relationships retrieved from KB:")
			for (relationship: relationships.elements){
				System.out.println ("\tRelationship: " + relationship.label)
				val qrelationship = relationship.module !== null ?getLastSegment(relationship.module, '/') + '/' + relationship.label:relationship.label
				val proposalText = qrelationship
				val displayText = qrelationship
				val additionalProposalInfo = relationship.description
				createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);	
			}
			
			//Add other relationships defined locally in the model
			val rootModel = findModel(model) as RM_Model
			
			for (relationshipType: rootModel.relationshipTypes.relationshipTypes){
				System.out.println ("\tLocal relationship type: " + relationshipType.name)
				val proposalText = module + "/" + relationshipType.name 
				val displayText = module + "/" + relationshipType.name 
				val additionalProposalInfo = relationshipType.relationship.description
				createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);	
			}
	
			super.completeENodeTypeBody_SuperType(model, assignment, context, acceptor)
		}catch (NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}
	}
	
	override void completeECapabilityTypeBody_SuperType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for CapabilityType::supertype property")
		try{
			//Get modules from model
			val List<String> importedModules = getImportedModules(model)
			val String module = getModule(model)
			//Add current module to imported ones for searching in the KB
			importedModules.add(module)
			
			val ReasonerData<Type> capabilitiess = getKBReasoner().getCapabilityTypes(importedModules)
			System.out.println ("Capabilities retrieved from KB:")
			for (cap: capabilitiess.elements){
				System.out.println ("\tCapability: " + cap.label)
				val qcap = cap.module !== null ?getLastSegment(cap.module, '/') + '/' + cap.label:cap.label
				val proposalText = qcap
				val displayText = qcap
				val additionalProposalInfo = cap.description
				createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);	
			}
			
			//Add other capabilities defined locally in the model
			val rootModel = findModel(model) as RM_Model
			
			for (cap: rootModel.capabilityTypes.capabilityTypes){
				System.out.println ("\tLocal capability type: " + cap.name)
				val proposalText = module + "/" + cap.name 
				val displayText = module + "/" + cap.name 
				val additionalProposalInfo = cap.capability.description
				createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);	
			}
	
			super.completeENodeTypeBody_SuperType(model, assignment, context, acceptor)	
		}catch (NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}
	}
	
	override void completeEInterfaceDefinitionBody_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for InterfaceDefinition::type property")
		try{
			//Get modules from model
			val List<String> importedModules = getImportedModules(model)
			val String module = getModule(model)
			//Add current module to imported ones for searching in the KB
			importedModules.add(module)
			
			val ReasonerData<Type> interfaces = getKBReasoner().getInterfaceTypes(importedModules)
			System.out.println ("Interfaces retrieved from KB:")
			for (interface: interfaces.elements){
				System.out.println ("\tCapability: " + interface.label)
				val qinterface = interface.module !== null ?getLastSegment(interface.module, '/') + '/' + interface.label:interface.label
				val proposalText = qinterface
				val displayText = qinterface
				val additionalProposalInfo = interface.description
				createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);	
			}
			
			//Add other interfaces defined locally in the model
			val rootModel = findModel(model) as RM_Model
			
			for (interface: rootModel.interfaceTypes.interfaceTypes){
				System.out.println ("\tLocal interface type: " + interface.name)
				val proposalText = module + "/" + interface.name 
				val displayText = module + "/" + interface.name 
				val additionalProposalInfo = interface.interface.description
				createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);	
			}
	
			super.completeENodeTypeBody_SuperType(model, assignment, context, acceptor)
		}catch (NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}		
	}
	
	override void completeEPropertyDefinitionBody_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeEDataTypeBody_SuperType(model, assignment, context, acceptor)
	}
	
	override void completeERequirementDefinitionBody_Capability(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeECapabilityTypeBody_SuperType(model, assignment, context, acceptor)
	}
	
	override void completeERequirementDefinitionBody_Node(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeENodeTypeBody_SuperType(model, assignment, context, acceptor)
	}
	
	override void completeERequirementDefinitionBody_Relationship(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeERelationshipTypeBody_SuperType(model, assignment, context, acceptor)
	}
	
	override void completeEAttributeDefinitionBody_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeEDataTypeBody_SuperType(model, assignment, context, acceptor)
	}
	
	override void completeEParameterDefinitionBody_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeEDataTypeBody_SuperType(model, assignment, context, acceptor)
	}
	
	override void completeGetAttributeBody_Req_cap(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		//TODO implement body
	
	}
	
	override void completeGetPropertyBody_Req_cap(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		//TODO implement body

	}
	
	def getModule(EObject object) {
		val RM_Model model = findModel(object) as RM_Model
		return model.module
	}
	
	def getImportedModules(EObject object) {
		val List<String> modules = new ArrayList()
		val RM_Model model = findModel(object) as RM_Model
		for (import: model.imports)
			modules.add(import)
		
		return modules
	}
	
	def findModel(EObject object) {
		if (object.eContainer == null)
			return null
		else if (object.eContainer instanceof RM_Model)
			return object.eContainer
		else
			return findModel(object.eContainer)
	}
	
	override void completeEDataType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EDataType::name property")
		val String proposalText = "tosca.datatypes.id"
		val String displayText = "tosca.datatypes.id"
		val String additionalProposalInfo = "The required id of the data type"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEArtifactType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EArtifactType::name property")
		val String proposalText = "tosca.artifacts.id"
		val String displayText = "tosca.artifacts.id"
		val String additionalProposalInfo = "The required id of the artifact type"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeECapabilityType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ECapabilityType::name property")
		val String proposalText = "tosca.capabilities.id"
		val String displayText = "tosca.capabilities.id"
		val String additionalProposalInfo = "The required id of the capability type"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEInterfaceType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		System.out.println("Invoking content assist for EInterfaceType::name property")
		val String proposalText = "tosca.interfaces.id"
		val String displayText = "tosca.interfaces.id"
		val String additionalProposalInfo = "The required id of the interface type"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}

	
	override void completeERelationshipType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		System.out.println("Invoking content assist for ERelationshipType::name property")
		val String proposalText = "tosca.relationships.id"
		val String displayText = "tosca.relationships.id"
		val String additionalProposalInfo = "The required id of the relationship type"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEPolicyType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EPolicyType::name property")
		val String proposalText = "tosca.policies.id"
		val String displayText = "tosca.policies.id"
		val String additionalProposalInfo = "The required id of the policy type"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEPropertyDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		System.out.println("Invoking content assist for EPropertyDefinition::name property")
		val String proposalText = "property_name"
		val String displayText = "property_name"
		val String additionalProposalInfo = "The required id of the property definition"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEAttributeDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		System.out.println("Invoking content assist for EAttributeDefinition::name property")
		val String proposalText = "attribute_name"
		val String displayText = "attribute_name"
		val String additionalProposalInfo = "The required id of the attribute definition"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEInterfaceDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EInterfaceDefinition::name property")
		val String proposalText = "interface_name"
		val String displayText = "interface_name"
		val String additionalProposalInfo = "The required id of the interface definition"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEOperationDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EOperationDefinition::name property")
		val String proposalText = "operation_name"
		val String displayText = "operation_name"
		val String additionalProposalInfo = "The required id of the operation definition"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEParameterDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EParameterDefinition::name property")
		val String proposalText = "parameter_name"
		val String displayText = "parameter_name"
		val String additionalProposalInfo = "The required id of the parameter definition"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeECapabilityDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ECapabilityDefinition::name property")
		val String proposalText = "capability_name"
		val String displayText = "capability_name"
		val String additionalProposalInfo = "The required id of the capability definition"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeERequirementDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ERequirementDefinition::name property")
		val String proposalText = "requirement_name"
		val String displayText = "requirement_name"
		val String additionalProposalInfo = "The required id of the requirement definition"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEPropertyDefinitionBody_Required(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EPropertyDefinitionBody::required property")
		createNonEditableCompletionProposal ("true", "true", null, context, "", acceptor);
		createNonEditableCompletionProposal ("false", "false", null, context, "", acceptor);
	}
	
	override void completeGetAttributeBody_Entity(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetAttributeBody::entity property")
		createEntityProposals (context, acceptor);
	}
	
	override void completeGetPropertyBody_Entity(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetPropertyBody::entity property")
		createEntityProposals (context, acceptor);
	}
	
	override void completeEMapEntry_Key(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EMapEntry::key property")
		createEditableCompletionProposal ("map_key_name", "map_key_name", null, context, "Key name for map entry", acceptor);
	}
	
	override void completeELIST_List(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ELIST::list property")
		createEditableCompletionProposal ("\"value\"", "\"value\"", null, context, "Give a single String value or a comma separate list of String values", acceptor);
	}
	
	override void complete_EMAP(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EMAP::map property")
		createEditableCompletionProposal ("{", "{", null, context, "Start a Map of key=value entries", acceptor);
	}
	
	override void completeEPrimary_File(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// Show file selection dialog to the user. Get path of file selected by the user and provide suggestion
		val input = selectFile ("Select implementation primary file")
		createEditableCompletionProposal (input, input, null, context, "", acceptor);
	}
	
	override void completeEDependencies_Files(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// Show file selection dialog to the user. Get path of file selected by the user and provide suggestion
		val input = selectFile ("Select implementation dependency file")
		createEditableCompletionProposal (input, input, null, context, "", acceptor);
	}
	
	protected def String selectFile (String dialogText){
		var shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
		// File standard dialog
		var fileDialog = new FileDialog(shell);
		fileDialog.setText(dialogText);
		//fileDialog.setFilterExtensions(new String[] { "*.txt" });
		// Put in a readable name for the filter
		//fileDialog.setFilterNames(new String[] { "Textfiles(*.txt)" });
		var selected = fileDialog.open();
		System.out.println(dialogText +": " + selected);
		return "\"" + selected + "\""
	}
	
	protected def void createEntityProposals(ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		val Image image = getImage("icons/resource2.png")
		createNonEditableCompletionProposal ("SELF", "SELF", image, context, SELF_DESCRIPTION, acceptor);
		createNonEditableCompletionProposal ("SOURCE", "SOURCE", image, context, SOURCE_DESCRIPTION, acceptor);
		createNonEditableCompletionProposal ("TARGET", "TARGET", image, context, TARGET_DESCRIPTION, acceptor);
		createNonEditableCompletionProposal ("HOST", "HOST", image, context, HOST_DESCRIPTION, acceptor);
	}

	protected def void createNonEditableCompletionProposal(String proposalText, String displayText, Image image,
		ContentAssistContext context, String additionalProposalInfo, ICompletionProposalAcceptor acceptor) {
		var ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, image, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setAdditionalProposalInfo(additionalProposalInfo);
			configurable.setAutoInsertable(false);
		}
		acceptor.accept(proposal)
	}
	
	protected def void createEditableCompletionProposal(String proposalText, String displayText, Image image,
		ContentAssistContext context, String additionalProposalInfo, ICompletionProposalAcceptor acceptor) {
		var ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, image, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setSelectionStart(configurable.getReplacementOffset());
			configurable.setSelectionLength(proposalText.length());
			configurable.setAutoInsertable(false);
			configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
			configurable.setAdditionalProposalInfo(additionalProposalInfo);
		}
		acceptor.accept(proposal)
	}
	
	protected def showReadPermissionErrorDialog(){
		val Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		MessageDialog.openError(parent, "Role Permissions error", 
			"Your account does not have permissions to read some declared imports or module. \nPlease, check and fix them")
	}
	
	static enum Boolean{
		True, False
	}

}
