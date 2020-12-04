/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ui.contentassist;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.sodalite.sdl.ansible.ansibleDsl.EDeclaredVariable;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPair;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPairReference;
import org.sodalite.sdl.ansible.ansibleDsl.EValue;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDeclaredVariableImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDictionaryImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EFilteredVariableImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EPlayImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EVariableDeclarationImpl;
import org.sodalite.sdl.ansible.ui.contentassist.AbstractAnsibleDslProposalProvider;

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class AnsibleDslProposalProvider extends AbstractAnsibleDslProposalProvider {
  @Override
  public void complete_BOOLEAN(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    acceptor.accept(this.createCompletionProposal("no", context));
    acceptor.accept(this.createCompletionProposal("yes", context));
  }
  
  @Override
  public void complete_NULL(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    acceptor.accept(this.createCompletionProposal("Null", context));
  }
  
  @Override
  public void completeEFilteredVariable_Variable(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final EPlayImpl rootPlay = EcoreUtil2.<EPlayImpl>getContainerOfType(model, EPlayImpl.class);
    if ((rootPlay != null)) {
      final List<EDeclaredVariableImpl> candidates = EcoreUtil2.<EDeclaredVariableImpl>getAllContentsOfType(rootPlay, EDeclaredVariableImpl.class);
      for (final EDeclaredVariableImpl candidate : candidates) {
        acceptor.accept(this.createCompletionProposal(candidate.getName(), context));
      }
    }
  }
  
  @Override
  public void completeEDictionaryPairReference_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final EFilteredVariableImpl filteredVariable = EcoreUtil2.<EFilteredVariableImpl>getContainerOfType(model, EFilteredVariableImpl.class);
    final EList<EDictionaryPairReference> tail = filteredVariable.getTail();
    int _size = tail.size();
    final int index = (_size - 1);
    if ((index > 0)) {
      final EDictionaryPair previousDictionaryPair = tail.get((index - 1)).getName();
      EValue _value = previousDictionaryPair.getValue();
      if ((_value instanceof EDictionaryImpl)) {
        EValue _value_1 = previousDictionaryPair.getValue();
        EList<EDictionaryPair> _dictionary_pairs = ((EDictionaryImpl) _value_1).getDictionary_pairs();
        for (final EDictionaryPair dictionaryPair : _dictionary_pairs) {
          acceptor.accept(this.createCompletionProposal(dictionaryPair.getName(), context));
        }
      }
    } else {
      EDeclaredVariable _variable = filteredVariable.getVariable();
      if ((_variable instanceof EVariableDeclarationImpl)) {
        EDeclaredVariable _variable_1 = filteredVariable.getVariable();
        EValue _value_passed = ((EVariableDeclarationImpl) _variable_1).getValue_passed();
        if ((_value_passed instanceof EDictionaryImpl)) {
          EDeclaredVariable _variable_2 = filteredVariable.getVariable();
          EValue _value_passed_1 = ((EVariableDeclarationImpl) _variable_2).getValue_passed();
          EList<EDictionaryPair> _dictionary_pairs_1 = ((EDictionaryImpl) _value_passed_1).getDictionary_pairs();
          for (final EDictionaryPair dictionaryPair_1 : _dictionary_pairs_1) {
            acceptor.accept(this.createCompletionProposal(dictionaryPair_1.getName(), context));
          }
        }
      }
    }
  }
}
