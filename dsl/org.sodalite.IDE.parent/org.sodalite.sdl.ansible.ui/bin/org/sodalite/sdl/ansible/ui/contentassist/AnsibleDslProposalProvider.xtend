/*
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.sodalite.sdl.ansible.ansibleDsl.impl.EPlayImpl
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.EcoreUtil2
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDeclaredVariableImpl
import org.eclipse.xtext.Assignment
import org.sodalite.sdl.ansible.ansibleDsl.impl.EFilteredVariableImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDictionaryImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EVariableDeclarationImpl
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDeclaredVariableReferenceImpl

/** 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
class AnsibleDslProposalProvider extends AbstractAnsibleDslProposalProvider {
	
	override void complete_BOOLEAN(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("no", context));
		acceptor.accept(createCompletionProposal("yes", context));
	}
	
	override void complete_NULL(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("Null", context));
	}
	
	override void completeEDeclaredVariableReference_Variable(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val rootPlay = EcoreUtil2.getContainerOfType(model, EPlayImpl)
		//if rootPlay is different from null then we are in a play. else, we are in a role
		if (rootPlay !== null){
			val candidates = EcoreUtil2.getAllContentsOfType(rootPlay, EDeclaredVariableImpl)
			//also the variables declared in the imported roles must be scoped
			/*val roleCalls = EcoreUtil2.getAllContentsOfType(rootPlay, ERoleCallsImpl)
			for (roleCall: roleCalls){
				for (role: roleCall.roles){
					val candidatesRole = EcoreUtil2.getAllContentsOfType(role, EDeclaredVariableImpl)
					for (candidateRole: candidatesRole){
						candidates.add(candidateRole)
					}
				}
			}*/
			for (candidate: candidates){
				acceptor.accept(createCompletionProposal(candidate.name, context))
			}
		}
		//this else is entered it we are in a role
		/*else {
			val rootRole = EcoreUtil2.getContainerOfType(model, ERoleImpl)
			val candidates = EcoreUtil2.getAllContentsOfType(rootRole, EDeclaredVariableImpl)
			for (candidate: candidates){
				acceptor.accept(createCompletionProposal(candidate.name, context))
			}
		}*/
	}

	override void completeEDictionaryPairReference_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val declaredVariableReference = EcoreUtil2.getContainerOfType(model, EDeclaredVariableReferenceImpl)
		val tail = declaredVariableReference.tail
		val index = tail.size - 1
		if (index > 0){
			val previousDictionaryPair = tail.get(index - 1).name
			if (previousDictionaryPair.value instanceof EDictionaryImpl){
				for (dictionaryPair : (previousDictionaryPair.value as EDictionaryImpl).dictionary_pairs){
					acceptor.accept(createCompletionProposal(dictionaryPair.name, context))
				}
			}
		}
		else {
			if (declaredVariableReference.variable instanceof EVariableDeclarationImpl){
				if ((declaredVariableReference.variable as EVariableDeclarationImpl).value_passed instanceof EDictionaryImpl){
					for (dictionaryPair : (((declaredVariableReference.variable as EVariableDeclarationImpl).value_passed) as EDictionaryImpl).dictionary_pairs){
						acceptor.accept(createCompletionProposal(dictionaryPair.name, context))
					}
				}
			}
		}
	}
}
