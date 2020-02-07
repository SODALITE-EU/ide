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

import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.sodalite.dsl.services.AADMGrammarAccess
import org.eclipse.xtext.impl.KeywordImpl
import org.eclipse.xtext.ParserRule
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData
import org.sodalite.dsl.kb_reasoner_client.types.Node
import org.sodalite.dsl.kb_reasoner_client.KBReasoner
import org.sodalite.dsl.kb_reasoner_client.types.Attribute
import org.sodalite.dsl.kb_reasoner_client.types.Property
import org.sodalite.dsl.kb_reasoner_client.types.Requirement
import org.sodalite.dsl.aADM.impl.EPropertyAssigmentsImpl
import org.sodalite.dsl.aADM.impl.EAttributeAssigmentsImpl
import org.sodalite.dsl.aADM.impl.ERequirementAssignmentsImpl
import org.sodalite.dsl.aADM.impl.ENodeTemplateBodyImpl

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class AADMProposalProvider extends AbstractAADMProposalProvider {

	@Inject AADMGrammarAccess grammarAccess

	val keywords = #{'node_templates{'}
	val assignments = #{'nodeTemplates'}
	val kbclient = new KBReasonerClient() as KBReasoner;

	// this override filters the keywords for which to create content assist proposals
	override void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("keyword: " + keyword.value)
		if (keywords.contains(keyword.value))
			return
		else
			_completeKeyword(keyword, contentAssistContext, acceptor);
	}

	def void _completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		val ICompletionProposal proposal = createCompletionProposal(keyword.getValue(),
			getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
		proposal.additionalProposalInfo = getAdditionalProposalInfo(keyword)
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
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
			else if (rule.name == "ENodeTemplate" && keyword.value == "attributes{")
				return "An optional list of attribute value assignments for the Node Template."
			else if (rule.name == "ENodeTemplate" && keyword.value == "properties{")
				return "An optional list of property value assignments for the Node Template."
			else if (rule.name == "ENodeTemplate" && keyword.value == "requirements{")
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

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}

	override void completeENodeTemplateBody_Type(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for NodeTemplate::type property")
		
		val ReasonerData<Node> nodes = kbclient.getNodes()
		System.out.println ("Nodes retrieved from KB:")
		for (node: nodes.elements){
			System.out.println ("\tNode: " + node.label)
			val proposalText = node.label
			val displayText = node.label
			val additionalProposalInfo = node.description
			createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);	
		}

		super.completeENodeTemplateBody_Type(model, assignment, context, acceptor)
	}
	
	override void completeEAttributeAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EAttributeAssignment::name property")
		var String proposalText = ""
		var String displayText = ""
		var String additionalProposalInfo = ""
		
		var resourceId = ""
		if (model instanceof ENodeTemplateBodyImpl)
			resourceId = (model as ENodeTemplateBodyImpl).type
		else if (model instanceof EAttributeAssigmentsImpl)
			resourceId = (model.eContainer as ENodeTemplateBodyImpl).type

		if (resourceId !== null){
			val ReasonerData<Attribute> attributes = kbclient.getAttributes(resourceId)
			if (attributes !== null){}
				System.out.println ("Attributes retrieved from KB for resource: " + resourceId)
				for (attribute: attributes.elements){
					System.out.println ("\tAttribute: " + attribute.uri)
					var attribute_label = attribute.uri.toString.substring(attribute.uri.toString.lastIndexOf('/') + 1, attribute.uri.toString.length)
					proposalText = attribute_label
					displayText = attribute_label
					additionalProposalInfo = "Type: " + attribute.type.label + "\nDescription: " + attribute.description
					createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
				}
		}

		proposalText = "attribute_name"
		displayText = "attribute_name"
		additionalProposalInfo = "represents the name of an attribute that would be used to select an attribute\ndefinition with the same name within on a TOSCA entity (e.g., Node Template, Relationship\nTemplate, etc.) which is declared (or reflected from a Property definition) in its declared type \n(e.g., a Node Type, Node Template, Capability Type, etc.). "

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEPropertyAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EAttributeAssignment::name property")
		var String proposalText = ""
		var String displayText = ""
		var String additionalProposalInfo = ""
		
		var resourceId = ""
		if (model instanceof ENodeTemplateBodyImpl)
			resourceId = (model as ENodeTemplateBodyImpl).type
		else if (model instanceof EPropertyAssigmentsImpl)
			resourceId = (model.eContainer as ENodeTemplateBodyImpl).type
		
		if (resourceId !== null){
			val ReasonerData<Property> properties = kbclient.getProperties(resourceId)
			if (properties !== null){
				System.out.println ("Properties retrieved from KB for resource: " + resourceId)
				for (property: properties.elements){
				 	System.out.println ("\tProperty: " + property.uri)
				 	var property_label = property.uri.toString.substring(property.uri.toString.lastIndexOf('/') + 1, property.uri.toString.length)
					proposalText = property_label
					displayText = property_label
					additionalProposalInfo = "Type: " + property.type.label + "\nDescription: " + property.description
					createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
				 }
			}
		}
		
		proposalText = "property_name"
		displayText = "property_name"
		additionalProposalInfo = "represents the name of a property that would be used to select a property \ndefinition with the same name within on a TOSCA entity (e.g., Node Template, Relationship \nTemplate, etc.,) which is declared in its declared type (e.g., a Node Type, Node Template, \nCapability Type, etc.). "

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeERequirementAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
	System.out.println("Invoking content assist for ERequirementAssignment::name property")
		var String proposalText = ""
		var String displayText = ""
		var String additionalProposalInfo = ""
		
		var resourceId = ""
		if (model instanceof ENodeTemplateBodyImpl)
			resourceId = (model as ENodeTemplateBodyImpl).type
		else if (model instanceof ERequirementAssignmentsImpl)
			resourceId = (model.eContainer as ENodeTemplateBodyImpl).type
		
		if (resourceId !== null){
			val ReasonerData<Requirement> requirements = kbclient.getRequirements(resourceId)
			if (requirements !== null){
				System.out.println ("Requirements retrieved from KB for resource: " + resourceId)
				for (requirement: requirements.elements){
					System.out.println ("\tRequirement: " + requirement.uri)
				 	var property_label = requirement.uri.toString.substring(requirement.uri.toString.lastIndexOf('/') + 1, requirement.uri.toString.length)
					proposalText = property_label
					displayText = property_label
					additionalProposalInfo = ""
					if (requirement.capability !== null)
						additionalProposalInfo += "\nCapability: " + requirement.capability.label
					if (requirement.node !== null)
						additionalProposalInfo += "\nNode: " + requirement.node.label
					if (requirement.occurrences !== null)
						additionalProposalInfo += "\nOccurrences: [" + requirement.occurrences.min + ", " + requirement.occurrences.max + "]"
					createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
				}
			}
		}
		proposalText = "requirement_name"
		displayText = "requirement_name"
		additionalProposalInfo = "represents the symbolic name of a requirement assignment "

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}

	// Keywords
	override void complete_AADM_Model(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		val String proposalText = "node_templates{"
		val String displayText = "node_templates{"
		val String additionalProposalInfo = "A list of node template definitions for the Topology Template"

		createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}

	// Other stuff
	// This override avoid the default content assist proposal for terminals such as ID
	override void complete_ID(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		return
	}

	override protected def void createNonEditableCompletionProposal(String proposalText, String displayText,
		ContentAssistContext context, String additionalProposalInfo, ICompletionProposalAcceptor acceptor) {
		var ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setAdditionalProposalInfo(additionalProposalInfo);
			configurable.setAutoInsertable(false);
		}
		acceptor.accept(proposal)
	}

	override protected def void createEditableCompletionProposal(String proposalText, String displayText,
		ContentAssistContext context, String additionalProposalInfo, ICompletionProposalAcceptor acceptor) {
		var ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, null, context);
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

}
