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
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData
import org.sodalite.dsl.kb_reasoner_client.types.Type
import org.sodalite.dsl.aADM.impl.EAttributeAssignmentsImpl
import org.sodalite.dsl.aADM.impl.ENodeTemplateBodyImpl
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData
import org.sodalite.dsl.aADM.impl.ERequirementAssignmentImpl
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNode
import java.util.List
import org.sodalite.dsl.aADM.ENodeTemplate
import java.util.ArrayList
import org.sodalite.dsl.aADM.AADM_Model
import org.sodalite.dsl.aADM.impl.ECapabilityAssignmentsImpl
import org.sodalite.dsl.rM.EPREFIX_TYPE
import org.sodalite.dsl.kb_reasoner_client.types.TypeData
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinition
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinition
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinition
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinition
import org.sodalite.dsl.rM.impl.GetPropertyBodyImpl
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
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignmentData
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignment
import org.sodalite.ide.ui.logger.SodaliteLogger
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException
import org.sodalite.dsl.rM.EParameterDefinition
import org.sodalite.dsl.aADM.ECapabilityAssignments
import org.sodalite.dsl.ui.helper.AADMHelper
import org.sodalite.dsl.ui.helper.BackendHelper
import org.sodalite.dsl.aADM.ERequirementAssignments
import org.sodalite.dsl.aADM.ENodeTemplateBody
import org.sodalite.dsl.rM.impl.GetAttributeBodyImpl

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
	
	override void completeGetPropertyBody_Entity(EObject property, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetPropertyBody::entity property")
		//TODO Populate as well with existing templates in scope (local, KB)
		val List<ENodeTemplate> nodes = AADMHelper.findNodes(property) //Local nodes
		createNodeProposals(nodes, context, acceptor)
		createEntityProposals (context, acceptor);
	}
	
	override void completeGetAttributeBody_Entity(EObject attribute, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetAttributeBody::entity property")
		//TODO Populate as well with existing templates in scope (local, KB)
		val List<ENodeTemplate> nodes = AADMHelper.findNodes(attribute) //Local nodes
		createNodeProposals(nodes, context, acceptor)
		createEntityProposals (context, acceptor);
	}
	
	override void completeGetPropertyBody_Req_cap(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetPropertyBody::req_cap property")
		val String module = AADMHelper.getModule(model)
		//Get entity in this GetProperty body. If null, return
		val node = AADMHelper.getEntityNode(model as GetPropertyBodyImpl)
		
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
		val String module = AADMHelper.getModule(model)
		//Get entity in this GetProperty body. If null, return
		val body = model as GetPropertyBodyImpl
		val node = AADMHelper.getEntityNode(body)
		
		if (node === null)
			return
			
		var List<String> proposals = new ArrayList<String>()
		// Get the properties defined within the selected node requirements or capabilities
		if (body.req_cap !== null){
			val req_cap_name = AADMHelper.getLastSegment(body.req_cap.type, '.')
			val ENodeTemplate req_node = AADMHelper.findRequirementNodeInTemplate(req_cap_name, node)
			if (req_node !== null)
				for (prop:req_node.node.properties.properties)
					proposals.add(module + '/' + req_node.name + "." + prop.name)
			//else
				//TODO Find requirement node in KB
			val ECapabilityAssignment cap = AADMHelper.findCapabilityInTemplate(req_cap_name, node)
			if (cap !== null)
				for (prop:cap.properties.properties)
					proposals.add(prop.name)
		}else{
			//Get the properties defined within the entity
			val type = node.node.type
			val resourceId = (type.module !== null? type.module + '/':'') + type.type
			val ReasonerData<PropertyDefinition> properties = BackendHelper.KBReasoner.getTypeProperties(resourceId)
			if (properties !== null){
				System.out.println ("Properties retrieved from KB for resource: " + resourceId)
				createProposalsForProperties (node, properties, context, acceptor)
			}
		}
		
		//Create proposals for each found property. Prefix property with req|cap name when applies
		val Image image = getImage("icons/property.png")
		for (proposal: proposals){
			createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
		}
	}
	
	override void completeGetAttributeBody_Attribute(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetAttributeBody::attribute property")
		val String module = AADMHelper.getModule(model)
		//Get entity in this GetAttribute body. If null, return
		val body = model as GetAttributeBodyImpl
		val node = AADMHelper.getEntityNode(body)
		
		if (node === null)
			return
			
		var List<String> proposals = new ArrayList<String>()
		// Get the attributes defined within the selected node requirements or capabilities
		if (body.req_cap !== null){
			val req_cap_name = AADMHelper.getLastSegment(body.req_cap.type, '.')
			val ENodeTemplate req_node = AADMHelper.findRequirementNodeInTemplate(req_cap_name, node)
			if (req_node !== null)
				for (attr:req_node.node.attributes.attributes)
					proposals.add(module + '/' + req_node.name + "." + attr.name)
			//else
				//TODO Find requirement node in KB
		}else{
			//Get the attributes defined within the entity type
			val type = node.node.type
			val resourceId = (type.module !== null? type.module + '/':'') + type.type
			val ReasonerData<AttributeDefinition> attributes = BackendHelper.KBReasoner.getTypeAttributes(resourceId)
			if (attributes !== null){
				System.out.println ("Attributes retrieved from KB for resource: " + resourceId)
				createProposalsForAttributes (node, attributes, context, acceptor)
			}
		}
		
		//Create proposals for each found property. Prefix property with req|cap name when applies
		val Image image = getImage("icons/attribute.png")
		for (proposal: proposals){
			createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
		}
	}
	
	def createProposalsForAttributes(ENodeTemplate node, ReasonerData<AttributeDefinition> attributes, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		var String proposalText = ""
		var String displayText = ""
		var String additionalProposalInfo = ""
		val Image image = getImage("icons/attribute.png")
		for (attribute: attributes.elements){
			System.out.println ("\tAttribute: " + attribute.uri)
		var attribute_label = attribute.uri.toString.substring(attribute.uri.toString.lastIndexOf('/') + 1, attribute.uri.toString.length)
		var module = AADMHelper.getModule(node)
		attribute_label = (module !== null?module + '/':'') + node.name + '.' + attribute_label
		proposalText = attribute_label
		displayText = attribute_label
		additionalProposalInfo = attribute.getType.getLabel!==null?"Type: " + attribute.getType.getLabel:""
		additionalProposalInfo += attribute.getDescription!==null?"\nDescription: " + attribute.getDescription:""
			createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
		}
	}
	
	def createProposalsForProperties(ENodeTemplate node, ReasonerData<PropertyDefinition> properties, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		var String proposalText = ""
		var String displayText = ""
		var String additionalProposalInfo = ""
		val Image image = getImage("icons/property.png")
		for (property: properties.elements){
			System.out.println ("\tProperty: " + property.uri)
		var property_label = property.uri.toString.substring(property.uri.toString.lastIndexOf('/') + 1, property.uri.toString.length)
		var module = AADMHelper.getModule(node)
		property_label = (module !== null?module + '/':'') + node.name + '.' + property_label
		proposalText = property_label
		displayText = property_label
		additionalProposalInfo = property.getType.getLabel!==null?"Type: " + property.getType.getLabel:""
		additionalProposalInfo += property.getDescription!==null?"\nDescription: " + property.getDescription:""
			createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
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
			val List<String> importedModules = AADMHelper.getImportedModules(model)
			val String module = AADMHelper.getModule(model)
			//Add current module to imported ones for searching in the KB
			importedModules.add(module)
			
			val ReasonerData<Type> nodes = BackendHelper.KBReasoner.getNodeTypes(importedModules)
			System.out.println ("Nodes retrieved from KB:")
			for (node: nodes.elements){
				System.out.println ("\tNode: " + node.label)
				val qnode = node.module !== null?AADMHelper.getLastSegment(node.module, '/') + '/' + node.label:node.label
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
			AADMHelper.showReadPermissionErrorDialog
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
				val ReasonerData<AttributeDefinition> attributes = BackendHelper.KBReasoner.getTypeAttributes(resourceId)
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
			AADMHelper.showReadPermissionErrorDialog
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
			else if (model instanceof ECapabilityAssignments)
				type = (model.eContainer as ENodeTemplateBodyImpl).type
				
			resourceId = (type.module !== null? type.module + '/':'') + type.type
			
			if (resourceId !== null){
				val ReasonerData<PropertyDefinition> properties = BackendHelper.KBReasoner.getTypeProperties(resourceId)
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
			AADMHelper.showReadPermissionErrorDialog
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
			
			if (model instanceof ENodeTemplateImpl)
				type = (model as ENodeTemplateImpl).node.type
			else if (model instanceof ENodeTemplateBodyImpl)
				type = (model.eContainer as ENodeTemplateBodyImpl).type
			else if (model instanceof ECapabilityAssignmentsImpl)
				type = (model.eContainer as ENodeTemplateBodyImpl).type
				
			resourceId = (type.module !== null? type.module + '/':'') + type.type
			
			if (resourceId !== null){
				val ReasonerData<CapabilityDefinition> capabilities = BackendHelper.KBReasoner.getTypeCapabilities(resourceId)
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
			AADMHelper.showReadPermissionErrorDialog
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
			
			if (model instanceof ENodeTemplate)
				type = (model as ENodeTemplate).node.type
			else if (model instanceof ENodeTemplateBody)
				type = (model as ENodeTemplateBodyImpl).type
			else if (model instanceof ERequirementAssignments)
				type = (model.eContainer as ENodeTemplateBody).type
				
			resourceId = (type.module !== null? type.module + '/':'') + type.type
			
			if (resourceId !== null){
				val ReasonerData<RequirementDefinition> requirements = BackendHelper.KBReasoner.getTypeRequirements(resourceId)
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
			AADMHelper.showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}

	override void completeERequirementAssignment_Node(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ERequirementAssignment::node property")
		try{	
			var ERequirementAssignment requirement = null;
			if (model instanceof ERequirementAssignment){
				requirement = model as ERequirementAssignment;
			} else { //Workaround
				requirement = context.previousModel as ERequirementAssignment;
			}
			
			//Get valid requirement nodes from KB
			val ValidRequirementNodeData vrnd = AADMHelper.getValidRequirementNodes(requirement);
			val TypeData tovrnd = AADMHelper.getTypeOfValidRequirementNodes(requirement);
			
			if (!vrnd.elements.empty){
				val Image image = getImage("icons/resource2.png")
				val additionalProposalInfo = ""
				for (ValidRequirementNode vrn: vrnd.elements){
					val qnode = vrn.module !== null?AADMHelper.getLastSegment(vrn.module, '/') + '/' + vrn.label:vrn.label
					System.out.println ("Valid requirement node: " + qnode)
				 	val displayText = qnode
					val proposalText = qnode
					
					createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
				}
			}
			
			//Find local nodes that belongs to suggested types
			if (tovrnd.elements.isEmpty)
				throw new Exception ("Type of valid nodes satisfying the requirement not found");
			val Type superType = tovrnd.elements.get(0)
			val String qsuperType = superType.module !== null?AADMHelper.getLastSegment(superType.module, '/') + '/' + superType.label:superType.label
			val List<ENodeTemplate> localnodes = AADMHelper.findLocalNodesForType(qsuperType, model)
			val Image image = getImage("icons/resource2.png")
			val module = AADMHelper.getModule(model)
			val additionalProposalInfo = ""
			for (ENodeTemplate node: localnodes){
				if (node !== null){
				 	val qnode = module !== null? module + '/' + node.name: node.name
					val proposalText = qnode
					val displayText = qnode
					createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
				}
			}
		}catch(NotRolePermissionException ex){
			AADMHelper.showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	override void completeEEvenFilter_Node(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeEEvenFilter_Node(model, assignment, context, acceptor)
		//Provide suggestions for local templates
		val List<ENodeTemplate> localTemplates = AADMHelper.findLocalNodes(model);	
		val String module = AADMHelper.getModule(model)
		createProposalsForLocalTemplateList(localTemplates, module, "icons/resource2.png",  context, acceptor);
	}
	
	override void completeEDataTypeBody_SuperType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EDataType::supertype property")
		try{
			//Get modules from model
			val List<String> importedModules = AADMHelper.getImportedModules(model)
			val String module = AADMHelper.getModule(model)
			//Add current module to imported ones for searching in the KB
			if (module !== null)
				importedModules.add(module)
			val ReasonerData<Type> types = BackendHelper.KBReasoner.getDataTypes(importedModules)
			System.out.println ("Data types retrieved from KB:")
			for (type: types.elements){
				System.out.println ("\tData type: " + type.label)
				val qtype = type.module !== null?AADMHelper.getLastSegment(type.module, '/') + '/' + type.label:type.label
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
			AADMHelper.showReadPermissionErrorDialog
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
			val List<String> importedModules = AADMHelper.getImportedModules(model)
			val String module = AADMHelper.getModule(model)
			//Add current module to imported ones for searching in the KB
			importedModules.add(module)
			
			val ReasonerData<Type> policies = BackendHelper.KBReasoner.getPolicyTypes(importedModules)
			System.out.println ("Nodes retrieved from KB:")
			for (policy: policies.elements){
				System.out.println ("\tNode: " + policy.label)
				val qpolicy = policy.module !== null?AADMHelper.getLastSegment(policy.module, '/') + '/' + policy.label:policy.label
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
			AADMHelper.showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	override void completeEEvenFilter_Requirement(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val EEvenFilter filter = model as EEvenFilter
		if (filter.node !== null){
			var String qnode = AADMHelper.getNodeName (filter.node)
			val ENodeTemplate node = AADMHelper.findNodeInModel(model, qnode)
			if (node !== null){
				val String module = AADMHelper.getModule(model)
				createProposalsForRequirementsList(node.node.requirements.requirements, module, "icons/requirement.png", context, acceptor);
			}else{
				super.completeEEvenFilter_Requirement(model, assignment, context, acceptor)
			}
		}
	}
	
	override void completeEEvenFilter_Capability(EObject object, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val EEvenFilter filter = object as EEvenFilter
		val module = AADMHelper.getModule(object)
		val AADM_Model model = AADMHelper.findModel(object) as AADM_Model
		var List<CapabilityDefinition> capabilityDefinitions = null
		var List<CapabilityAssignment> capabilityAssignments = null
		var String cap_assign_type = null
		var String cap_def_type = null
		if (filter.requirement === null){ //If requirement not set
			// Find capabilities defined in filter node template type
			val node_module = module
			var String filter_node_type = null
			if (node_module.equals(module)){
				val node_id = AADMHelper.getId (filter.node)
				val ENodeTemplate filter_node = AADMHelper.findNode(model, node_id)
				if (filter_node !== null){
					// A) Node lives in RM
					filter_node_type = AADMHelper.getReference(filter_node.node.type)
				} 
			}
			
			if (filter_node_type === null) {
				// B) Node lives in KB
				filter_node_type = AADMHelper.findNodeTemplateInKB(object, AADMHelper.getReference(filter.node))
			}
			if (filter_node_type !== null){
				// Find capabilities defined in filter node template type
				capabilityDefinitions = AADMHelper.findCapabilitiesInNodeType (filter_node_type)
				cap_def_type = filter_node_type // FIXME take defining type from capability
			}
			
		}else{ //If requirement set
			// Find capabilities defined in filter node requirement node: req_node (if node is template in its type)
			
			// Find requirement node in local model from requirement ref
			val ENodeTemplate req_node = AADMHelper.findRequirementNodeInLocalModel (object, filter.requirement)
			if (req_node !== null){ // A) Node lives in RM
				// Find capabilities defined in req node type
				val node_type = AADMHelper.getReference(req_node.node.type)
				val CapabilityDefinitionData capabilityData = BackendHelper.KBReasoner.getTypeCapabilities(node_type)
				capabilityDefinitions = capabilityData.elements
				cap_def_type = node_type // FIXME take defining type from capability
			} else { // B) Node lives in KB
				val nodeName = AADMHelper.getNodeFromRequirementRef (filter.requirement)
				val req_name = AADMHelper.getRequirementNameFromRequirementRef(filter.requirement)
				val CapabilityAssignmentData capabilityData = 
					BackendHelper.KBReasoner.getCapabilitiesDeclaredInTargetNodeForNodeTemplateRequirement(nodeName, req_name)
				capabilityAssignments = capabilityData.elements
				cap_assign_type = nodeName // FIXME take defining type from capability
			}
		}
		val Image image = getImage("icons/capability.png")
		if (capabilityAssignments!==null){
			// Prepare suggestions for capabilities
			for (cap: capabilityAssignments){
				val String proposal = cap_assign_type + '.' + AADMHelper.getLastSegment(cap.uri.toString, '/')
				createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
			}
		}
		
		if (capabilityDefinitions!== null){
			// Prepare suggestions for capabilities
			// Prepare suggestions for capabilities
			for (cap: capabilityDefinitions){
				val String proposal = cap_def_type + '.' + AADMHelper.getLastSegment(cap.uri.toString, '/')
				createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
			}
		}
	}
	
	override void completeETarget_Target(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		try{
			//Find local and KB node templates
			val List<String> importedModules = AADMHelper.processListModules(model)
			val TemplateData templates = BackendHelper.KBReasoner.getTemplates(importedModules)		
			createProposalsForTemplateList(templates, "icons/resource2.png", context, acceptor);
			val List<ENodeTemplate> localNodes = AADMHelper.findLocalNodes(model)
			createProposalsForTemplateList(localNodes, "icons/resource2.png", context, acceptor);
		}catch (NotRolePermissionException ex){
			AADMHelper.showReadPermissionErrorDialog
		}catch(SodaliteException ex){
			SodaliteLogger.log(ex.message, ex);
		}
	}
	
	override void completeGetInput_Input(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		//Find local inputs
		val AADM_Model aadm = AADMHelper.findModel(model) as AADM_Model
		if (aadm !== null){
			var Image image = getImage("icons/input.png")
			for (EParameterDefinition input: aadm.inputs.parameters){
				val proposalText = input.name
				createNonEditableCompletionProposal(proposalText, proposalText, image, context, null, acceptor);
			}
		}
	}
	
	// Functions
	

	def void createProposalsForTemplateList(List<ENodeTemplate> templates, String defaultImage,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		for (template: templates){
			val module = AADMHelper.getModule(template)
			val qtype = module !== null?module + '/' + template.name:template.name
			val proposalText = qtype
			val displayText = qtype
			var Image image = getImage(defaultImage)
			createNonEditableCompletionProposal(proposalText, displayText, image, context, null, acceptor);	
		}
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

	override def String getAdditionalProposalInfo(Keyword keyword) {
		if (keyword instanceof KeywordImpl) {
			val keywordImpl = keyword as KeywordImpl
			val rule = AADMHelper.findParserRule (keywordImpl)
			
			//AADM_Model
			if (rule.name == "AADM_Model" && keyword.value == "module:")
				return "The namespace where model entity names will be declared"
			else if (rule.name == "AADM_Model" && keyword.value == "import:")
				return "Imports another namespace declared within \nthe bound KB to retrieve its model entity definitions"
			else if (rule.name == "AADM_Model" && keyword.value == "inputs:")
				return "An optional map of input parameters \n(i.e., as parameter definitions) for the Topology Template."
			else if (rule.name == "AADM_Model" && keyword.value == "outputs:")
				return "An optional map of output parameters \n(i.e., as parameter definitions) for the Topology Template."
			else if (rule.name == "AADM_Model" && keyword.value == "node_templates:")
				return "An optional map of node template definitions \nfor the Topology Template."
			else if (rule.name == "AADM_Model" && keyword.value == "policies:")
				return "An optional list of Policy definitions \nfor the Topology Template."
				
			//ENodeTemplateBody
			else if (rule.name == "ENodeTemplateBody" && keyword.value == "type:")
				return "The required name of the Node Type the Node Template is based upon"
			else if (rule.name == "ENodeTemplateBody" && keyword.value == "description:")
				return "An optional description for the Node Template."
			else if (rule.name == "ENodeTemplateBody" && keyword.value == "attributes:")
				return "An optional list of attribute value assignments for the Node Template."
			else if (rule.name == "ENodeTemplateBody" && keyword.value == "properties:")
				return "An optional list of property value assignments for the Node Template."
			else if (rule.name == "ENodeTemplateBody" && keyword.value == "requirements:")
				return "An optional sequenced list of requirement assignments for the Node Template."
			else if (rule.name == "ENodeTemplateBody" && keyword.value == "capabilities:")
				return "An optional mapof capability assignments for the Node Template."
			else if (rule.name == "ENodeTemplateBody" && keyword.value == "optimization:")
				return "An optional reference to an optimization model associated to this Node Template"
			
			//ERequirementAssignment
			else if (rule.name == "ERequirementAssignment" && keyword.value == "node:")
				return "The optional reserved keyname used to identify the target node of a relationship.\n specifically, it is used to provide either a: \n\t-Node Template: name that can fulfill the target node requirement.\n\t-Node Type: name that the provider will use to select a type-compatible node template to fulfill the requirement at runtime."
			
			//EPolicyDefinitionBody
			else if (rule.name == "EPolicyDefinitionBody" && keyword.value == "type:")
				return "The required name of the policy type the policy definition is based upon."
			else if (rule.name == "EPolicyDefinitionBody" && keyword.value == "description:")
				return "The optional description for the policy definition."
			else if (rule.name == "EPolicyDefinitionBody" && keyword.value == "properties:")
				return "An optional map of property value assignments for the policy definition."
			else if (rule.name == "EPolicyDefinitionBody" && keyword.value == "targets:")
				return "An optional list of valid Node Templates or Groups the Policy 
						can be applied to."
			else if (rule.name == "EPolicyDefinitionBody" && keyword.value == "triggers:")
				return "An optional mapof trigger definitions to invoke when the policy 
						is applied by an orchestrator against the associated TOSCA entity."
				
			else
				return super.getAdditionalProposalInfo(keyword)
		}
	}
	
	protected def void createNodeProposals (List<ENodeTemplate> nodes, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		if (nodes.empty) return
		val Image image = getImage("icons/resource2.png")
		val module = AADMHelper.getModule(nodes.get(0))
		val additionalProposalInfo = ""
		for (ENodeTemplate node: nodes){
			if (node !== null){
			 	val qnode = module !== null? module + '/' + node.name: node.name
				val proposalText = qnode
				val displayText = qnode
				createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
			}
		}
	}

}
