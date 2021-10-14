package org.sodalite.dsl.ide.contentassist

import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider
import com.google.inject.Inject
import org.sodalite.dsl.services.AADMGrammarAccess
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import org.sodalite.dsl.ide.backend.SodaliteBackendProxy
import java.util.Map
import java.util.HashMap
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData
import java.util.List
import org.sodalite.dsl.ide.helper.AADMHelper
import org.sodalite.dsl.kb_reasoner_client.types.Type
import org.eclipse.xtext.Keyword
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinition
import org.sodalite.dsl.aADM.EPREFIX_TYPE
import org.sodalite.dsl.aADM.impl.ENodeTemplateBodyImpl
import org.sodalite.dsl.aADM.impl.EPropertyAssignmentsImpl
import org.sodalite.dsl.aADM.impl.ENodeTemplateImpl
import org.sodalite.dsl.aADM.impl.EPolicyDefinitionBodyImpl
import org.sodalite.dsl.aADM.ECapabilityAssignments
import org.sodalite.dsl.aADM.ENodeTemplate
import org.sodalite.dsl.aADM.ENodeTemplateBody
import org.sodalite.dsl.aADM.ERequirementAssignments
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinition
import org.sodalite.dsl.aADM.ERequirementAssignment
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData
import org.sodalite.dsl.kb_reasoner_client.types.TypeData
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNode
import org.sodalite.dsl.aADM.impl.GetPropertyBodyImpl
import org.sodalite.dsl.aADM.ECapabilityAssignment

class AADMIdeProposalProvider extends IdeContentProposalProvider {
	@Inject
	AADMGrammarAccess ga;
	
	
	def addProposals(Map<String, String> proposals, ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		for (key : proposals.keySet.filter[it.startsWith(context.prefix)]) {
            var proposal = proposalCreator.createProposal(key, context) [
                source = key
                description = proposals.get(key)
            ]
            acceptor.accept(proposal, proposalPriorities.getDefaultPriority(proposal))
        }
	}
	
	def createProposalsForAADM_Model_Import(ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		val modules = SodaliteBackendProxy.KBReasoner.modules.elements
        val Map<String, String> proposals = new HashMap<String, String>();
        for (module : modules){
        	val proposal = AADMHelper.extractModule(module)
        	val description = "module"
        	proposals.put(proposal, description)
        }
		addProposals(proposals, context, acceptor)
	}
	
	def createProposalForENodeTypes(ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		val model = context.currentModel
		val List<String> importedModules = AADMHelper.getImportedModules(model)
		val String module = AADMHelper.getModule(model)
		importedModules.add(module)
		val ReasonerData<Type> nodes = SodaliteBackendProxy.KBReasoner.getNodeTypes(importedModules)
        val Map<String, String> proposals = new HashMap<String, String>();
        for (node : nodes.elements){
        	val proposal = node.module !== null?AADMHelper.getLastSegment(node.module, '/') + '/' + node.label:node.label
        	val description = node.description
        	proposals.put(proposal, description)
        }
		addProposals(proposals, context, acceptor)
	}
	
	def createProposalForDataTypes(ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		val model = context.currentModel
		val List<String> importedModules = AADMHelper.getImportedModules(model)
		val String module = AADMHelper.getModule(model)
		importedModules.add(module)
		val ReasonerData<Type> nodes = SodaliteBackendProxy.KBReasoner.getDataTypes(importedModules)
        val Map<String, String> proposals = new HashMap<String, String>();
        for (node : nodes.elements){
        	val proposal = node.module !== null?AADMHelper.getLastSegment(node.module, '/') + '/' + node.label:node.label
        	val description = node.description
        	proposals.put(proposal, description)
        }
		addProposals(proposals, context, acceptor)
	}
	
	def createEPropertyAssignment_Name(ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		val model = context.currentModel
		
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
		
		val resourceId = (type.module !== null? type.module + '/':'') + type.type
		if (resourceId !== null){
			val ReasonerData<PropertyDefinition> properties = SodaliteBackendProxy.KBReasoner.getTypeProperties(resourceId)
			if (properties !== null){
		        val Map<String, String> proposals = new HashMap<String, String>();
		        for (property : properties.elements){
		        	val proposal = property.uri.toString.substring(property.uri.toString.lastIndexOf('/') + 1, property.uri.toString.length)
		        	val description = (property.getType.getLabel!==null?"Type: " + property.getType.getLabel:"") 
						+ property.getDescription!==null?"\nDescription: " + property.getDescription:""		        	
		        	proposals.put(proposal, description)
		        }
				addProposals(proposals, context, acceptor)
			}
		}
	}
	
	def createERequirementAssignment_Name(ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		val model = context.currentModel
		
		var EPREFIX_TYPE type = null
		if (model instanceof ENodeTemplate)
				type = (model as ENodeTemplate).node.type
			else if (model instanceof ENodeTemplateBody)
				type = (model as ENodeTemplateBodyImpl).type
			else if (model instanceof ERequirementAssignments)
				type = (model.eContainer as ENodeTemplateBody).type
		
		val resourceId = (type.module !== null? type.module + '/':'') + type.type
		if (resourceId !== null){
			val ReasonerData<RequirementDefinition> requirements = SodaliteBackendProxy.KBReasoner.getTypeRequirements(resourceId)
			if (requirements !== null){
		        val Map<String, String> proposals = new HashMap<String, String>();
		        for (requirement : requirements.elements){
		        	val proposal = requirement.uri.toString.substring(requirement.uri.toString.lastIndexOf('/') + 1, requirement.uri.toString.length)
		        	var description = ""
		        	if (requirement.getCapability !== null)
							description += "Capability: " + requirement.getCapability.getLabel
						if (requirement.getNode !== null)
							description += ", Node: " + requirement.getNode.getLabel
						if (requirement.getOccurrences !== null)
							description += ", Occurrences: [" + requirement.getOccurrences.min + ", " + requirement.getOccurrences.max + "]"	
		        	proposals.put(proposal, description)
		        }
				addProposals(proposals, context, acceptor)
			}
		}
	}
	
	def createERequirementAssignment_Node(ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		val model = context.currentModel
		
		var ERequirementAssignment requirement = null;
		if (model instanceof ERequirementAssignment){
			requirement = model as ERequirementAssignment;
		} else { //Workaround
			requirement = context.previousModel as ERequirementAssignment;
		}
		
		val Map<String, String> proposals = new HashMap<String, String>();
		//Get valid requirement nodes from KB
		val ValidRequirementNodeData vrnd = AADMHelper.getValidRequirementNodes(requirement);
		val TypeData tovrnd = AADMHelper.getTypeOfValidRequirementNodes(requirement);
		
		if (!vrnd.elements.empty){
	        for (ValidRequirementNode vrn: vrnd.elements){
				val proposal = 
					(vrn.module !== null?
					AADMHelper.getLastSegment(vrn.module, '/') + '/' + vrn.label:vrn.label) +
					(vrn.version !== null?'@' + vrn.version : "")
	        	var description = ""
	        	proposals.put(proposal, description)
	        }
			addProposals(proposals, context, acceptor)
		}
		
		//Find local nodes that belongs to suggested types
		if (tovrnd.elements.isEmpty)
			throw new Exception ("Type of valid nodes satisfying the requirement not found");
		val Type superType = tovrnd.elements.get(0)
		val String qsuperType = superType.module !== null?AADMHelper.getLastSegment(superType.module, '/') + '/' + superType.label:superType.label
		val List<ENodeTemplate> localnodes = AADMHelper.findLocalNodesForType(qsuperType, model)
		val module = AADMHelper.getModule(model)
		for (ENodeTemplate node: localnodes){
			if (node !== null){
			 	val proposal = module !== null? module + '/' + node.name: node.name
				val description = ""
	        	proposals.put(proposal, description)			}
		}
	}
	
	def createGetProperty_Entity(ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		val property = context.currentModel
		val List<ENodeTemplate> nodes = AADMHelper.findNodes(property) //Local nodes
		createProposalsForNodes(nodes, context, acceptor)
		createEntityProposals(context, acceptor)
	}
	
	def createGetProperty_Property(ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		//Get entity in this GetProperty body. If null, return
		val body = context.currentModel as GetPropertyBodyImpl
		val String module = AADMHelper.getModule(body)
		val node = AADMHelper.getEntityNode(body)
		
		if (node === null)
			return
			
		val Map<String, String> proposals = new HashMap<String, String>();
		
		if (body.req_cap !== null){
			val req_cap_name = AADMHelper.getLastSegment(body.req_cap, '.')
			val ENodeTemplate req_node = AADMHelper.findRequirementNodeInTemplate(req_cap_name, node)
			if (req_node !== null)
				for (prop:req_node.node.properties.properties){
					val proposal = module + '/' + req_node.name + "." + prop.name
					val description = ""
					proposals.put(proposal, description)	
			}
			//else
				//TODO Find requirement node in KB
			val ECapabilityAssignment cap = AADMHelper.findCapabilityInTemplate(req_cap_name, node)
			if (cap !== null)
				for (prop:cap.properties.properties){
					val proposal = prop.name
					val description = ""
					proposals.put(proposal, description)
				}
		}else{
			//Get the properties defined within the entity
			val type = node.node.type
			val resourceId = (type.module !== null? type.module + '/':'') + type.type
			val ReasonerData<PropertyDefinition> properties = SodaliteBackendProxy.KBReasoner.getTypeProperties(resourceId)
			if (properties !== null){
				createProposalsForProperties (node, properties, context, acceptor)
			}
		}
		
		addProposals(proposals, context, acceptor)
	}
	
	def createGetProperty_Req_Cap(ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		val property = context.currentModel
		val String module = AADMHelper.getModule(property)
		//Get entity in this GetProperty body. If null, return
		val node = AADMHelper.getEntityNode(property as GetPropertyBodyImpl)
		
		if (node === null){
			return
		}
		val Map<String, String> proposals = new HashMap<String, String>();
		//Find requirements and capability assignments defined within the entity
		if (node.node.requirements !== null){
			for (req: node.node.requirements.requirements){
				val String proposal = module + '/' + node.name + '.' + req.name
				val description = ""
				proposals.put(proposal, description)
			}
		}
		if (node.node.capabilities !== null){
			for (cap: node.node.capabilities.capabilities){
				val String proposal = module + '/' + node.name + '.' + cap.name
				val description = ""
				proposals.put(proposal, description)			}
		}
		
		addProposals(proposals, context, acceptor)
	}
	
	def createEntityProposals(ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val Map<String, String> proposals = new HashMap<String, String>();
		proposals.put("SELF", "")
		proposals.put("SOURCE", "")
		proposals.put("TARGET", "")
		proposals.put("HOST", "")
		
		addProposals(proposals, context, acceptor)
	}
	
	def createProposalsForNodes(List<ENodeTemplate> nodes, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		if (nodes.empty) return
		val Map<String, String> proposals = new HashMap<String, String>();
		val module = AADMHelper.getModule(nodes.get(0))
		for (ENodeTemplate node: nodes){
			if (node !== null){
				val proposal = module !== null? module + '/' + node.name: node.name
				val description = ""
				proposals.put(proposal, description)	
			}
		}
		addProposals(proposals, context, acceptor)
	}
	
	def createProposalsForProperties(ENodeTemplate node, ReasonerData<PropertyDefinition> properties, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		val Map<String, String> proposals = new HashMap<String, String>();
		for (property: properties.elements){
			var property_label = property.uri.toString.substring(property.uri.toString.lastIndexOf('/') + 1, property.uri.toString.length)
			var module = AADMHelper.getModule(node)
			val proposal = (module !== null?module + '/':'') + node.name + '.' + property_label
			val description = ""
			proposals.put(proposal, description)		
		}
		addProposals(proposals, context, acceptor)
	}
	
	override dispatch createProposals(Assignment assignment, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
        switch(assignment) {
            case ga.AADM_ModelAccess.importsAssignment_2_1: {
            	createProposalsForAADM_Model_Import(context, acceptor)               
            }
            case ga.ENodeTemplateBodyAccess.typeAssignment_0_1: {
            	createProposalForENodeTypes(context, acceptor)
            }
            case ga.EParameterDefinitionBodyAccess.typeAssignment_1_0_1:{
            	createProposalForDataTypes(context, acceptor)
            }
            case ga.ENodeTemplateBodyAccess.propertiesAssignment_2_2:{
            	createEPropertyAssignment_Name(context, acceptor)
            }
            case ga.ENodeTemplateBodyAccess.requirementsAssignment_4_2:{
            	createERequirementAssignment_Name(context, acceptor)
            }
            case ga.ERequirementAssignmentAccess.nodeAssignment_3_1:{
            	createERequirementAssignment_Node(context, acceptor)
            }
            case ga.getPropertyBodyAccess.entityAssignment_1_1:{
            	createGetProperty_Entity(context, acceptor)
            }
            case ga.getPropertyBodyAccess.propertyAssignment_0_1:{
            	createGetProperty_Property(context, acceptor)
            }
            case ga.getPropertyBodyAccess.req_capAssignment_2_1:{
            	createGetProperty_Req_Cap(context, acceptor)
            }
            default : {
            	System.out.println("Content assistance for assignment:" + assignment)
                super._createProposals(assignment, context, acceptor)
            }
        }
    }
    
//    override dispatch createProposals(Keyword keyword, ContentAssistContext context,
//		IIdeContentProposalAcceptor acceptor) {
//		switch(keyword) {
//		        
//	        default : {
//	        	System.out.println("Content assistance for keyword:" + keyword)
//	            super._createProposals(keyword, context, acceptor)
//	        }
//        }
//	}
}