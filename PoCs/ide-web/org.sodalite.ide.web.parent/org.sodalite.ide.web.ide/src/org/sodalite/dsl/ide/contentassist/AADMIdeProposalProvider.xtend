package org.sodalite.dsl.ide.contentassist

import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider
import com.google.inject.Inject
import org.sodalite.dsl.services.AADMGrammarAccess
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import org.sodalite.dsl.ide.backend.SodaliteBackendProxy
import org.sodalite.dsl.ide.helper.RMHelper
import java.util.Map
import java.util.HashMap

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
	
	def createProposalsForImport(ContentAssistContext context, IIdeContentProposalAcceptor acceptor){
		val modules = SodaliteBackendProxy.KBReasoner.modules.elements
        val Map<String, String> proposals = new HashMap<String, String>();
        for (module : modules){
        	val proposal = RMHelper.extractModule(module)
        	val description = proposal + " module registered in KB"
        	proposals.put(proposal, description)
        }
		addProposals(proposals, context, acceptor)
	}
	
	override dispatch createProposals(Assignment assignment, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
        switch(assignment) {
            case ga.AADM_ModelAccess.importsAssignment_2_1: {
            	createProposalsForImport(context, acceptor)               
            }
            default : {
            	System.out.println("Content assistance for assignment:" + assignment)
                super._createProposals(assignment, context, acceptor)
            }
        }
    }
}