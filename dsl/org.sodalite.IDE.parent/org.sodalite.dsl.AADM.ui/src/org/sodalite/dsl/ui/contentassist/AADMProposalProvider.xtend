/*******************************************************************************
 * Copyright (c) 2019 Atos Spain S.A.
 * This program and the accompanying materials
 * are made available under the terms of the Apache Public License 2.0 (APL2)
 * which accompanies this distribution, and is available at
 * https://apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Jesús Gorroñogoitia - Design and implementation
 *******************************************************************************/

package org.sodalite.dsl.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.impl.KeywordImpl
import org.eclipse.xtext.ParserRule
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData
import org.sodalite.dsl.kb_reasoner_client.types.Type
import org.sodalite.dsl.aADM.impl.EAttributeAssignmentsImpl
import org.sodalite.dsl.aADM.impl.ERequirementAssignmentsImpl
import org.sodalite.dsl.aADM.impl.ENodeTemplateBodyImpl
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData
import org.sodalite.dsl.aADM.impl.ERequirementAssignmentImpl
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNode
import java.util.SortedSet
import java.util.List
import org.sodalite.dsl.aADM.ENodeTemplate
import java.util.ArrayList
import org.sodalite.dsl.aADM.AADM_Model
import java.nio.file.Path
import java.nio.file.Files
import java.util.Properties
import java.nio.channels.FileChannel
import java.nio.file.StandardOpenOption
import java.nio.channels.FileLock
import java.nio.channels.Channels
import java.nio.file.FileSystems
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IResource
import org.sodalite.dsl.aADM.impl.ECapabilityAssignmentsImpl
import org.sodalite.dsl.rM.EPREFIX_TYPE
import org.sodalite.dsl.kb_reasoner_client.types.TypeData
import java.util.HashMap
import java.util.Map
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinition
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinition
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinition
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinition
import org.sodalite.dsl.rM.impl.GetPropertyBodyImpl
import org.sodalite.dsl.rM.EEntityReference
import org.sodalite.dsl.rM.EEntity
import org.sodalite.dsl.rM.impl.EPropertyAssignmentsImpl
import org.sodalite.dsl.aADM.ECapabilityAssignment
import org.sodalite.dsl.aADM.impl.ENodeTemplateImpl
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException
import org.eclipse.swt.graphics.Image
import org.sodalite.dsl.aADM.impl.EPolicyDefinitionBodyImpl
import org.sodalite.dsl.rM.EEvenFilter
import org.sodalite.dsl.aADM.ERequirementAssignment
import org.sodalite.dsl.kb_reasoner_client.types.TemplateData
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinitionData
import org.sodalite.dsl.rM.EPREFIX_REF
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignmentData
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignment
import org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException
import org.sodalite.ide.ui.logger.SodaliteLogger
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException
import java.io.File

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class AADMProposalProvider extends AbstractAADMProposalProvider {

	//val keywords = #{'node_templates:'}
	val keywords = #{}
	val assignments = #{'nodeTemplates'}

	// this override filters the keywords for which to create content assist proposals
	override void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("keyword: " + keyword.value)
		if (keywords.contains(keyword.value))
			return
		else
			_completeKeyword(keyword, contentAssistContext, acceptor);
	}

	override void _completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		val ICompletionProposal proposal = createCompletionProposal(keyword.getValue(),
			getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
		proposal.additionalProposalInfo = getAdditionalProposalInfo(keyword)
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
	}
	
	override void completeAADM_Model_Imports(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeRM_Model_Imports(model, assignment, context, acceptor);
	}
	
	override void completeGetPropertyBody_Entity(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetPropertyBody::entity property")
		//TODO Populate as well with existing templates in scope (local, KB)
		createEntityProposals (context, acceptor);
	}
	
	override void completeGetPropertyBody_Req_cap(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetPropertyBody::req_cap property")
		val String module = getModule(model)
		//Get entity in this GetProperty body. If null, return
		val node = getEntityNode(model as GetPropertyBodyImpl)
		
		if (node === null){
			return
		}
		
		//Find requirements and capability assignments defined within the entity
		if (node.node.requirements !== null){
			val Image image = getImage("icons/requirement.png")
			for (req: node.node.requirements.requirements){
				val String proposal = module + '/' + node.name + '.' + req.name
				createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
			}
		}
		if (node.node.capabilities !== null){
			val Image image = getImage("icons/capability.png")
			for (cap: node.node.capabilities.capabilities){
				val String proposal = module + '/' + node.name + '.' + cap.name
				createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
			}
		}
	}
	
	override void completeGetPropertyBody_Property(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetPropertyBody::property property")
		val String module = getModule(model)
		//Get entity in this GetProperty body. If null, return
		val body = model as GetPropertyBodyImpl
		val node = getEntityNode(body)
		
		if (node === null)
			return
			
		var List<String> proposals = new ArrayList<String>()
		// Get the properties defined within the selected node requirements or capabilities
		if (body.req_cap !== null){
			val req_cap_name = getLastSegment(body.req_cap.type, '.')
			val ENodeTemplate req_node = findRequirementNodeInTemplate(req_cap_name, node)
			if (req_node !== null)
				for (prop:req_node.node.properties.properties)
					proposals.add(module + '/' + req_node.name + "." + prop.name)
			//else
				//TODO Find requirement node in KB
			val ECapabilityAssignment cap = findCapabilityInTemplate(req_cap_name, node)
			if (cap !== null)
				for (prop:cap.properties.properties)
					proposals.add(prop.name)
		}else{
			//Get the properties defined within the entity
			for (prop:node.node.properties.properties)
					proposals.add(prop.name)
		}
		
		//Create proposals for each found property. Prefix property with req|cap name when applies
		val Image image = getImage("icons/property.png")
		for (proposal: proposals){
			createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
		}
	}
	

	// this override filters the assignments for which to create content assist proposals
	override void completeAssignment(Assignment assignment, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("assignment: " + assignment.feature)
		if (assignments.contains(assignment.feature))
			return
		else
			super.completeAssignment(assignment, contentAssistContext, acceptor);
	}

	// Assignments
	override void completeENodeTemplate_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for NodeTemplate::name property")
		val String proposalText = "node_template_id"
		val String displayText = "node_template_id"
		val String additionalProposalInfo = "The required id of the node template"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEPolicyDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for NodeTemplate::name property")
		val String proposalText = "policy_id"
		val String displayText = "policy_id"
		val String additionalProposalInfo = "The required id of the policy definition"

		createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}

	override void completeENodeTemplateBody_Type(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for NodeTemplate::type property")
		try {
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
				var Image image = getImage("icons/type.png")
				if (node.module !== null) 
					image = getImage("icons/primitive_type.png")
				createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);	
			}
	
			super.completeENodeTemplateBody_Type(model, assignment, context, acceptor)
		}catch(NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	override void completeEAttributeAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EAttributeAssignment::name property")
		try {
			var String proposalText = ""
			var String displayText = ""
			var String additionalProposalInfo = ""
			
			var resourceId = ""
			var EPREFIX_TYPE type = null
			if (model instanceof ENodeTemplateBodyImpl)
				type = (model as ENodeTemplateBodyImpl).type
				 
			else if (model instanceof EAttributeAssignmentsImpl)
				type = (model.eContainer as ENodeTemplateBodyImpl).type
				
			resourceId = (type.module !== null? type.module + '/':'') + type.type
	
			if (resourceId !== null){
				val ReasonerData<AttributeDefinition> attributes = getKBReasoner().getTypeAttributes(resourceId)
				if (attributes !== null){}
					System.out.println ("Attributes retrieved from KB for resource: " + resourceId)
					val Image image = getImage("icons/attribute.png")
					for (attribute: attributes.elements){
						System.out.println ("\tAttribute: " + attribute.uri)
						var attribute_label = attribute.uri.toString.substring(attribute.uri.toString.lastIndexOf('/') + 1, attribute.uri.toString.length)
						proposalText = attribute_label
						displayText = attribute_label
						additionalProposalInfo = attribute.getType.getLabel!==null?"Type: " + attribute.getType.getLabel:""
						additionalProposalInfo += attribute.getDescription!==null?"\nDescription: " + attribute.getDescription:""
						createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
					}
			}
	
			proposalText = "attribute_name"
			displayText = "attribute_name"
			additionalProposalInfo = "represents the name of an attribute that would be used to select an attribute\ndefinition with the same name within on a TOSCA entity (e.g., Node Template, Relationship\nTemplate, etc.) which is declared (or reflected from a Property definition) in its declared type \n(e.g., a Node Type, Node Template, Capability Type, etc.). "
	
			createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
		}catch(NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	override void completeEPropertyAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EPropertyAssignment::name property")

		try {
			var String proposalText = ""
			var String displayText = ""
			var String additionalProposalInfo = ""
			
			var resourceId = ""
			var EPREFIX_TYPE type = null
			
			if (model instanceof ENodeTemplateBodyImpl)
				type = (model as ENodeTemplateBodyImpl).type
			else if (model instanceof EPropertyAssignmentsImpl)
				type = (model.eContainer as ENodeTemplateBodyImpl).type
			else if (model instanceof ENodeTemplateImpl)
				type = (model as ENodeTemplateImpl).node.type
			else if (model instanceof EPolicyDefinitionBodyImpl)
				type = (model as EPolicyDefinitionBodyImpl).type
				
			resourceId = (type.module !== null? type.module + '/':'') + type.type
			
			if (resourceId !== null){
				val ReasonerData<PropertyDefinition> properties = getKBReasoner().getTypeProperties(resourceId)
				if (properties !== null){
					System.out.println ("Properties retrieved from KB for resource: " + resourceId)
					val Image image = getImage("icons/property.png")
					for (property: properties.elements){
					 	System.out.println ("\tProperty: " + property.uri)
					 	var property_label = property.uri.toString.substring(property.uri.toString.lastIndexOf('/') + 1, property.uri.toString.length)
						proposalText = property_label
						displayText = property_label
						additionalProposalInfo = (property.getType.getLabel!==null?"Type: " + property.getType.getLabel:"") 
						additionalProposalInfo += property.getDescription!==null?"\nDescription: " + property.getDescription:""
						createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
					 }
				}
			}
			
			proposalText = "property_name"
			displayText = "property_name"
			additionalProposalInfo = "represents the name of a property that would be used to select a property \ndefinition with the same name within on a TOSCA entity (e.g., Node Template, Relationship \nTemplate, etc.,) which is declared in its declared type (e.g., a Node Type, Node Template, \nCapability Type, etc.). "
	
			createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
		}catch(NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	override void completeECapabilityAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		System.out.println("Invoking content assist for ECapabilityAssignment::name property")
		try{
			var String proposalText = ""
			var String displayText = ""
			var String additionalProposalInfo = ""
			
			var resourceId = ""
			var EPREFIX_TYPE type = null
			
			if (model instanceof ENodeTemplateBodyImpl)
				type = (model as ENodeTemplateBodyImpl).type
			else if (model instanceof ECapabilityAssignmentsImpl)
				type = (model.eContainer as ENodeTemplateBodyImpl).type
				
			resourceId = (type.module !== null? type.module + '/':'') + type.type
			
			if (resourceId !== null){
				val ReasonerData<CapabilityDefinition> capabilities = getKBReasoner().getTypeCapabilities(resourceId)
				if (capabilities !== null){
					System.out.println ("Capabilities retrieved from KB for resource: " + resourceId)
					val Image image = getImage("icons/capability.png")
					for (capability: capabilities.elements){
						System.out.println ("\nCapability: " + capability.uri)
					 	var property_label = capability.uri.toString.substring(capability.uri.toString.lastIndexOf('/') + 1, capability.uri.toString.length)
						proposalText = property_label
						displayText = property_label
						additionalProposalInfo = ""
						if (capability.getType !== null)
							additionalProposalInfo += "\nType: " + capability.getType.getLabel
						if (capability.getValid_source_types !== null)
							additionalProposalInfo += "\nValid source types:" + capability.getValid_source_types
						createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
					}
				}
			}
			proposalText = "capability_name"
			displayText = "capability_name"
			additionalProposalInfo = "represents the symbolic name of a capability assignment "
	
			createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
		}catch(NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	override void completeERequirementAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ERequirementAssignment::name property")
		try{
			var String proposalText = ""
			var String displayText = ""
			var String additionalProposalInfo = ""
			
			var resourceId = ""
			var EPREFIX_TYPE type = null
			
			if (model instanceof ENodeTemplateBodyImpl)
				type = (model as ENodeTemplateBodyImpl).type
			else if (model instanceof ERequirementAssignmentsImpl)
				type = (model.eContainer as ENodeTemplateBodyImpl).type
				
			resourceId = (type.module !== null? type.module + '/':'') + type.type
			
			if (resourceId !== null){
				val ReasonerData<RequirementDefinition> requirements = getKBReasoner().getTypeRequirements(resourceId)
				if (requirements !== null){
					System.out.println ("Requirements retrieved from KB for resource: " + resourceId)
					val Image image = getImage("icons/requirement.png")
					for (requirement: requirements.elements){
						System.out.println ("\tRequirement: " + requirement.uri)
					 	var property_label = requirement.uri.toString.substring(requirement.uri.toString.lastIndexOf('/') + 1, requirement.uri.toString.length)
						proposalText = property_label
						displayText = property_label
						additionalProposalInfo = ""
						if (requirement.getCapability !== null)
							additionalProposalInfo += "\nCapability: " + requirement.getCapability.getLabel
						if (requirement.getNode !== null)
							additionalProposalInfo += "\nNode: " + requirement.getNode.getLabel
						if (requirement.getOccurrences !== null)
							additionalProposalInfo += "\nOccurrences: [" + requirement.getOccurrences.min + ", " + requirement.getOccurrences.max + "]"	
						createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
					}
				}
			}
			proposalText = "requirement_name"
			displayText = "requirement_name"
			additionalProposalInfo = "represents the symbolic name of a requirement assignment "
	
			createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
		}catch(NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	override void completeERequirementAssignment_Node(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ERequirementAssignment::node property")
		try{
			var String proposalText = ""
			var String displayText = ""
			var String additionalProposalInfo = ""
			val requirementId = (model as ERequirementAssignmentImpl).name
			val nodeType = (model.eContainer.eContainer as ENodeTemplateBodyImpl).type
			val resourceId = (nodeType.module !== null? nodeType.module + '/':'') + nodeType.type
			
			// val AADM_Model rootModel = findModel(model) as AADM_Model
			// val String aadmURI = getAADMURI (rootModel); //TODO Use aadmURI to determine if KB suggestion belongs to the local model
			
			//Get valid requirement nodes from KB
			//Get modules from model
			val List<String> importedModules = getImportedModules(model)
			val String module = getModule(model)
			//Add current module to imported ones for searching in the KB
			importedModules.add(module)
			
			val ValidRequirementNodeData vrnd = getKBReasoner().getValidRequirementNodes(requirementId, resourceId, importedModules);
			val TypeData tovrnd = getKBReasoner().getTypeOfValidRequirementNodes(requirementId, resourceId, importedModules);
			if (!vrnd.elements.empty){
				System.out.println ("Valid requirement nodes retrieved from KB for requirement: " + requirementId)
				val Image image = getImage("icons/resource2.png")
				for (ValidRequirementNode vrn: vrnd.elements){
					val qtype = vrn.type.module !== null ?getLastSegment(vrn.type.module, '/') + '/' + vrn.type.label:vrn.type.label
					val qnode = vrn.module !== null ?getLastSegment(vrn.module, '/') + '/' + vrn.label:vrn.label
					System.out.println ("Valid requirement node: " + qnode)
				 	displayText = qnode
					proposalText = qnode
					
					createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
				}
			}
			
			//Find local nodes that belongs to suggested types
			if (tovrnd.elements.isEmpty)
				throw new Exception ("Type of valid nodes satisfying the requirement not found");
			val Type superType = tovrnd.elements.get(0)
			val String qsuperType = superType.module !== null ?getLastSegment(superType.module, '/') + '/' + superType.label:superType.label
			val List<ENodeTemplate> localnodes = findLocalNodesForType(qsuperType, model)
			val Image image = getImage("icons/resource2.png")
			for (ENodeTemplate node: localnodes){
				if (node !== null){
					System.out.println ("Valid requirement local node: " + node.name)
				 	val qnode = module !== null? module + '/' + node.name: node.name
					proposalText = qnode
					displayText = qnode
					createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
				}
			}
		}catch(NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	override void completeEEvenFilter_Node(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeEEvenFilter_Node(model, assignment, context, acceptor)
		//Provide suggestions for local templates
		val List<ENodeTemplate> localTemplates = findLocalNodes(model);	
		val String module = getModule(model)
		createProposalsForLocalTemplateList(localTemplates, module, "icons/resource2.png",  context, acceptor);
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
				var Image image = getImage("icons/data_type.png")
				if (type.module !== null) 
					image = getImage("icons/primitive_data_type.png")
				createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);	
			}
	
			//super.completeENodeTypeBody_SuperType(model, assignment, context, acceptor)
	
		}catch (NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
		

	// Keywords
	override void complete_AADM_Model(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		val String proposalText = "node_templates:"
		val String displayText = "node_templates:"
		val String additionalProposalInfo = "A list of node template definitions for the Topology Template"

		createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
	}

	// Other stuff
	// This override avoid the default content assist proposal for terminals such as ID
	override void complete_ID(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		return
	}

	override protected def void createNonEditableCompletionProposal(String proposalText, String displayText, Image image, 
		ContentAssistContext context, String additionalProposalInfo, ICompletionProposalAcceptor acceptor) {
		var ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, image, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setAdditionalProposalInfo(additionalProposalInfo);
			configurable.setAutoInsertable(false);
		}
		acceptor.accept(proposal)
	}

	override protected def void createEditableCompletionProposal(String proposalText, String displayText, Image image,
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
	
	override void completeEPolicyDefinitionBody_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for NodeTemplate::type property")
		try {
			//Get modules from model
			val List<String> importedModules = getImportedModules(model)
			val String module = getModule(model)
			//Add current module to imported ones for searching in the KB
			importedModules.add(module)
			
			val ReasonerData<Type> policies = getKBReasoner().getPolicyTypes(importedModules)
			System.out.println ("Nodes retrieved from KB:")
			for (policy: policies.elements){
				System.out.println ("\tNode: " + policy.label)
				val qpolicy = policy.module !== null ?getLastSegment(policy.module, '/') + '/' + policy.label:policy.label
				val proposalText = qpolicy
				val displayText = qpolicy
				val additionalProposalInfo = policy.description
				var Image image = getImage("icons/policy_type.png")
				if (policy.module !== null) 
					image = getImage("icons/primitive_policy_type.png")
				createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);	
			}
	
			super.completeENodeTemplateBody_Type(model, assignment, context, acceptor)
		}catch(NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	override void completeEEvenFilter_Requirement(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val EEvenFilter filter = model as EEvenFilter
		if (filter.node !== null){
			var String qnode = getNodeName (filter.node)
			val ENodeTemplate node = findNodeInModel(model, qnode)
			if (node !== null){
				val String module = getModule(model)
				createProposalsForRequirementsList(node.node.requirements.requirements, module, "icons/requirement.png", context, acceptor);
			}else{
				super.completeEEvenFilter_Requirement(model, assignment, context, acceptor)
			}
		}
	}
	
	override void completeEEvenFilter_Capability(EObject object, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val EEvenFilter filter = object as EEvenFilter
		val module = getModule(object)
		val AADM_Model model = findModel(object) as AADM_Model
		var List<CapabilityDefinition> capabilityDefinitions = null
		var List<CapabilityAssignment> capabilityAssignments = null
		var String cap_assign_type = null
		var String cap_def_type = null
		if (filter.requirement === null){ //If requirement not set
			// Find capabilities defined in filter node template type
			val node_module = filter.node.module
			var String filter_node_type = null
			if (node_module.equals(module)){
				val node_id = getId (filter.node)
				val ENodeTemplate filter_node = findNode(model, node_id)
				if (filter_node !== null){
					// A) Node lives in RM
					filter_node_type = getReference(filter_node.node.type)
				} 
			}
			
			if (filter_node_type === null) {
				// B) Node lives in KB
				filter_node_type = findNodeTemplateInKB(object, getReference(filter.node))
			}
			if (filter_node_type !== null){
				// Find capabilities defined in filter node template type
				capabilityDefinitions = findCapabilitiesInNodeType (filter_node_type)
				cap_def_type = filter_node_type // FIXME take defining type from capability
			}
			
		}else{ //If requirement set
			// Find capabilities defined in filter node requirement node: req_node (if node is template in its type)
			
			// Find requirement node in local model from requirement ref
			val ENodeTemplate req_node = findRequirementNodeInLocalModel (object, filter.requirement)
			if (req_node !== null){ // A) Node lives in RM
				// Find capabilities defined in req node type
				val node_type = getReference(req_node.node.type)
				val CapabilityDefinitionData capabilityData = KBReasoner.getTypeCapabilities(node_type)
				capabilityDefinitions = capabilityData.elements
				cap_def_type = node_type // FIXME take defining type from capability
			} else { // B) Node lives in KB
				val nodeName = getNodeFromRequirementRef (filter.requirement)
				val req_name = getRequirementNameFromRequirementRef(filter.requirement)
				val CapabilityAssignmentData capabilityData = 
					KBReasoner.getCapabilitiesDeclaredInTargetNodeForNodeTemplateRequirement(nodeName, req_name)
				capabilityAssignments = capabilityData.elements
				cap_assign_type = nodeName // FIXME take defining type from capability
			}
		}
		val Image image = getImage("icons/capability.png")
		if (capabilityAssignments!==null){
			// Prepare suggestions for capabilities
			for (cap: capabilityAssignments){
				val String proposal = cap_assign_type + '.' + getLastSegment(cap.uri.toString, '/')
				createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
			}
		}
		
		if (capabilityDefinitions!== null){
			// Prepare suggestions for capabilities
			// Prepare suggestions for capabilities
			for (cap: capabilityDefinitions){
				val String proposal = cap_def_type + '.' + getLastSegment(cap.uri.toString, '/')
				createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
			}
		}
	}
	
	override void completeETarget_Target(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		try{
			//Find local and KB node templates
			val List<String> importedModules = processListModules(model)
			val TemplateData templates = getKBReasoner().getTemplates(importedModules)		
			createProposalsForTemplateList(templates, "icons/resource2.png", context, acceptor);
			val List<ENodeTemplate> localNodes = findLocalNodes(model)
			createProposalsForTemplateList(localNodes, "icons/resource2.png", context, acceptor);
		}catch (NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	// Functions
	
	//	def existsInAadm(String nodeUri, String aadmUri) {
//		return nodeUri.substring(0, nodeUri.lastIndexOf('/')).equals(
//			aadmUri.substring(0, aadmUri.lastIndexOf('/'))
//		)
//	}

	def void createProposalsForTemplateList(List<ENodeTemplate> templates, String defaultImage,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		for (template: templates){
			val qtype = template.module !== null ?template.module + '/' + template.name:template.name
			val proposalText = qtype
			val displayText = qtype
			var Image image = getImage(defaultImage)
			createNonEditableCompletionProposal(proposalText, displayText, image, context, null, acceptor);	
		}
	}

	def findRequirementNodeInLocalModel(EObject object, EPREFIX_REF reqRef) {
		val nodeName = getNodeFromRequirementRef (reqRef)
		val req_name = getRequirementNameFromRequirementRef(reqRef)
		//Find node in local model
		val ENodeTemplate nodeTemplate = findNodeInModel (object, nodeName)
		if (nodeTemplate !== null){
			//Get requirement, if found, get node
			return findRequirementNodeInTemplate(req_name, nodeTemplate)
		}
		return null
	}

	def findNodeTemplateInKB(EObject object, String nodeRef){
		//Get modules from model
		val List<String> importedModules = getImportedModules(object)
		val String module = getModule(object)
		//Add current module to imported ones for searching in the KB
		importedModules.add(module)
		
		val TemplateData templates = KBReasoner.getTemplates(importedModules)
		for (nodeTemplate:templates.elements){
			val nodeTemplateRef = nodeTemplate.module !== null?
				nodeTemplate.module + '/' + nodeTemplate.label:
				nodeTemplate.label
			if (nodeTemplateRef.equals(nodeRef)){
				return nodeTemplateRef
			}
		}
		return null
	}

	def void createProposalsForRequirementsList(List<ERequirementAssignment> reqs, String module, String defaultImage,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		for (req: reqs){
			createProposalForRequirement (req, module, defaultImage, context, acceptor)
		}
	}
	
	def createProposalForRequirement(ERequirementAssignment req, String module, String defaultImage,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		val qreq = (req.eContainer.eContainer.eContainer as ENodeTemplate).name + '.' + req.name
		var property_label = (module !== null)? module + "/" + qreq: qreq
		var proposalText = property_label
		var displayText = property_label
		var additionalProposalInfo = ""
		if (req.getNode !== null)
			additionalProposalInfo += "\nNode: " + req.node
		var Image image = getImage(defaultImage)
		createNonEditableCompletionProposal(proposalText, displayText, image, context, null, acceptor);	
	}

	def void createProposalsForLocalTemplateList(List<ENodeTemplate> templates, String module, String defaultImage,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		for (ENodeTemplate node: templates){
			val qnode = module !== null? module + '/' + node.name: node.name
			val proposalText = qnode
			val displayText = qnode
			var Image image = getImage(defaultImage)
			createNonEditableCompletionProposal(proposalText, displayText, image, context, null, acceptor);	
		}
	}
		
	def getAADMURI(AADM_Model model) {
		//val String filename = model.eResource.URI.lastSegment
		val String filepath = model.eResource.URI.toString().substring('platform:/resource'.length)
		val IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(new org.eclipse.core.runtime.Path(filepath));
		val IProject project = resource.project
		val Path path = getAadmPropertiesFile(resource.toString, project);
		var String uri = null;
		if (Files.exists(path)) {
			val Properties props = new Properties();
			try(val FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);
			val FileLock lock = channel.lock(0L, Long.MAX_VALUE, true)) {
				props.load(Channels.newInputStream(channel));
			}
			uri = props.getProperty("URI");
		}
		
		return uri;
	}
		
	def getAadmPropertiesFile(String filepath, IProject project) {
		//val String filepath = aadmFile.toString();
		val String filename = filepath.substring(filepath.lastIndexOf("/") + 1);
		val String directory = filepath.substring(filepath.indexOf('/', 2) + 1, filepath.lastIndexOf("/"));
		val IFile propertiesFile = project.getFile(directory + "/." + filename + ".properties");
		var String properties_path = propertiesFile.getLocationURI().toString();
		properties_path = properties_path.substring(properties_path.indexOf(":") + 2);
		if (File.separator.equals("/")){ //Linux
			properties_path = "/" + properties_path
		}
		val Path path = FileSystems.getDefault().getPath(properties_path);
		return path;
	}
	
	
		
	def findLocalNodesForTypes(SortedSet<String> types, EObject reqAssign) {
		val List<ENodeTemplate> nodes = new ArrayList<ENodeTemplate>()
		if (types.isEmpty)
			return nodes
		val AADM_Model model = findModel(reqAssign) as AADM_Model
		for (ENodeTemplate node: model.nodeTemplates.nodeTemplates){
			val node_id = (node.node.type.module !== null? node.node.type.module + '/') + node.node.type.type
			if (types.contains(node_id))
				nodes.add(node)
		}
		return nodes
	}
	
	def findLocalNodesForType(String type, EObject reqAssign) {
		try{
			val List<ENodeTemplate> nodes = new ArrayList<ENodeTemplate>()
			val Map<String, ENodeTemplate> candidateNodes = new HashMap<String, ENodeTemplate>()
			val AADM_Model model = findModel(reqAssign) as AADM_Model
			
			for (ENodeTemplate node: model.nodeTemplates.nodeTemplates){
				val node_id = (node.node.type.module !== null? node.node.type.module + '/':"") + node.node.type.type
				candidateNodes.put(node_id, node)
			}
			
			val List<String> keys = new ArrayList<String>(candidateNodes.keySet)
			val List<String> validSubClasses = getKBReasoner().getSubClassesOf(keys, type)
			
			for (String validClass: validSubClasses){
				nodes.add (candidateNodes.get(validClass))
			}
			return nodes	
		}catch(NotRolePermissionException ex){
			showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	def List<ENodeTemplate> findLocalNodes(EObject object){
		val AADM_Model model = findModel(object) as AADM_Model
		if (model !== null)
			return model.nodeTemplates.nodeTemplates
		else
			new ArrayList<ENodeTemplate>()
	}
	
	def ENodeTemplate findNodeInModel(EObject object, String nodeName){
		val AADM_Model model = findModel(object) as AADM_Model
		val String module = getModule(object)
		val String targetModule = nodeName.substring(0, nodeName.indexOf("/"))
		val String targetNode = nodeName.substring(nodeName.lastIndexOf("/") + 1)
		if (!module.equals(targetModule)){
			return null
		}
		for (ENodeTemplate node: model.nodeTemplates.nodeTemplates){
			if (node.name.equals(targetNode)){
				return node
			}
		}
		return null
	}
		
	override def findModel(EObject object) {
		if (object.eContainer == null)
			return null
		else if (object.eContainer instanceof AADM_Model)
			return object.eContainer
		else
			return findModel(object.eContainer)
	}
	
	override def String getModule(EObject object) {
		val AADM_Model model = findModel(object) as AADM_Model
		return model.module
	}
		
	override def getImportedModules(EObject object) {
		val List<String> modules = new ArrayList()
		val AADM_Model model = findModel(object) as AADM_Model
		for (import: model.imports)
			modules.add(import)
		
		return modules
	}

	def getNodeTemplate(EObject object) {
		if (object.eContainer === null)
			return null
		else if (object.eContainer instanceof ENodeTemplate)
			return object.eContainer
		else
			return getNodeTemplate(object.eContainer)
	}
	
	def getEntityNode (GetPropertyBodyImpl body){
		val EEntityReference eEntityReference = body.entity
		var ENodeTemplate node = null
		if (eEntityReference instanceof EEntity){
			val EEntity eEntity = eEntityReference as EEntity
			if (eEntity.entity.equals('SELF')){
				node = getNodeTemplate(body) as ENodeTemplate
			}
		} else {
			//TODO Support other entities: TARGET, HOST, SOURCE, concrete entity
		}
		return node
	}
		
	def findRequirementNodeInTemplate(String requirement, ENodeTemplate template) {
		var ENodeTemplate node = null
		if (template.node.requirements === null)
			return node
		for (req: template.node.requirements.requirements){
			if (req.name.equals(requirement)){
				val AADM_Model model = findModel(template) as AADM_Model
				var module1 = model.module
				if (module1 === null)
					module1 = ""
				var module2 = req.node.module
				if (module2 === null)
					module2 = ""
				if (module1.equals(module2)){
					node = findNode(model, req.node.id)						
				}else{
					//TODO Find node in KB
				} 
			}
		}
		return node
	}
	
	def findCapabilityInTemplate(String capabilityName, ENodeTemplate template) {
		var ECapabilityAssignment capability = null
		if (template.node.capabilities === null)
			return capability
		for (cap: template.node.capabilities.capabilities){
			if (cap.name.equals(capabilityName))
				capability = cap
		}
		return capability
	}
		
	def findNode(AADM_Model model, String nodeName) {
		for (node: model.nodeTemplates.nodeTemplates){
			if (node.name.equals(nodeName))
				return node
		}
		return null
	}

	def setAdditionalProposalInfo(ICompletionProposal proposal, String info) {
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setAdditionalProposalInfo(info);
		}
	}

	def String getAdditionalProposalInfo(Keyword keyword) {
		if (keyword instanceof KeywordImpl) {
			val keywordImpl = keyword as KeywordImpl
			val rule = findParserRule (keywordImpl)
			
			//ENodeTemplate
			if (rule.name == "ENodeTemplate" && keyword.value == "type:")
				return "The required name of the Node Type the Node Template is based upon"
			else if (rule.name == "ENodeTemplate" && keyword.value == "attributes:")
				return "An optional list of attribute value assignments for the Node Template."
			else if (rule.name == "ENodeTemplate" && keyword.value == "properties:")
				return "An optional list of property value assignments for the Node Template."
			else if (rule.name == "ENodeTemplate" && keyword.value == "requirements:")
				return "An optional sequenced list of requirement assignments for the Node Template."
			
			//ERequirementAssignment
			else if (rule.name == "ERequirementAssignment" && keyword.value == "node:")
				return "The optional reserved keyname used to identify the target node of a relationship.\n specifically, it is used to provide either a: \n\t-Node Template: name that can fulfill the target node requirement.\n\t-Node Type: name that the provider will use to select a type-compatible node template to fulfill the requirement at runtime."
				
			else
				return ""
		}
	}

	def ParserRule findParserRule (EObject obj){
		if (obj === null)
			return null
		else if (obj instanceof ParserRule)
			return obj as ParserRule
		else
			return findParserRule (obj.eContainer) 
	}
	

}
