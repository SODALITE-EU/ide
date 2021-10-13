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
        	val description = proposal + " module registered in KB"
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
            default : {
            	System.out.println("Content assistance for assignment:" + assignment)
                super._createProposals(assignment, context, acceptor)
            }
        }
    }
    
    override dispatch createProposals(Keyword keyword, ContentAssistContext context,
		IIdeContentProposalAcceptor acceptor) {
		switch(keyword) {
		        
	        default : {
	        	System.out.println("Content assistance for keyword:" + keyword)
	            super._createProposals(keyword, context, acceptor)
	        }
        }
	}
}