package org.sodalite.dsl.ide.contentassist

import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider
import com.google.inject.Inject
import org.sodalite.dsl.services.AADMGrammarAccess
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import org.sodalite.dsl.ide.backend.SodaliteBackendProxy
import org.sodalite.dsl.ide.helper.RMHelper

class AADMIdeProposalProvider extends IdeContentProposalProvider {
	@Inject
	AADMGrammarAccess ga;
	
	
	override dispatch createProposals(Assignment assignment, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
        switch(assignment) {
            case ga.AADM_ModelAccess.importsAssignment_2_1: {
                val modules = SodaliteBackendProxy.KBReasoner.modules.elements
                for (module : modules.filter[it.startsWith(context.prefix)]) {
                		val mod = RMHelper.extractModule(module)
                        var proposal = proposalCreator.createProposal(mod, context) [
                            source = mod
                            description = mod + " module registered in KB"
                        ]
                        acceptor.accept(proposal, proposalPriorities.getDefaultPriority(proposal))
                    }
            }
            default : {
            	System.out.println("Content assistance for assignment:" + assignment)
                super._createProposals(assignment, context, acceptor)
            }
        }
    }
}