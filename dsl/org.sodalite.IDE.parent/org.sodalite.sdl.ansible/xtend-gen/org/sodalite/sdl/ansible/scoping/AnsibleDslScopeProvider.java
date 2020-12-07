/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.scoping;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EDeclaredVariable;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPair;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPairReference;
import org.sodalite.sdl.ansible.ansibleDsl.EValue;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDeclaredVariableImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDictionaryImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EDictionaryPairReferenceImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EFilteredVariableImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EPlayImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EVariableDeclarationImpl;
import org.sodalite.sdl.ansible.scoping.AbstractAnsibleDslScopeProvider;

/**
 * This class contains custom scoping description.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class AnsibleDslScopeProvider extends AbstractAnsibleDslScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if (((context instanceof EFilteredVariableImpl) && Objects.equal(reference, AnsibleDslPackage.Literals.EFILTERED_VARIABLE__VARIABLE))) {
      final EPlayImpl rootPlay = EcoreUtil2.<EPlayImpl>getContainerOfType(context, EPlayImpl.class);
      if ((rootPlay != null)) {
        final List<EDeclaredVariableImpl> candidates = EcoreUtil2.<EDeclaredVariableImpl>getAllContentsOfType(rootPlay, EDeclaredVariableImpl.class);
        return Scopes.scopeFor(candidates);
      }
    }
    if (((context instanceof EDictionaryPairReferenceImpl) && Objects.equal(reference, AnsibleDslPackage.Literals.EDICTIONARY_PAIR_REFERENCE__NAME))) {
      final EFilteredVariableImpl filteredVariable = EcoreUtil2.<EFilteredVariableImpl>getContainerOfType(context, EFilteredVariableImpl.class);
      final EList<EDictionaryPairReference> tail = filteredVariable.getTail();
      final int index = tail.indexOf(context);
      ArrayList<EDictionaryPair> candidatesOfDictionary = new ArrayList<EDictionaryPair>();
      if ((index > 0)) {
        final EDictionaryPair previousDictionaryPair = tail.get((index - 1)).getName();
        EValue _value = previousDictionaryPair.getValue();
        if ((_value instanceof EDictionaryImpl)) {
          EValue _value_1 = previousDictionaryPair.getValue();
          EList<EDictionaryPair> _dictionary_pairs = ((EDictionaryImpl) _value_1).getDictionary_pairs();
          for (final EDictionaryPair dictionaryPair : _dictionary_pairs) {
            candidatesOfDictionary.add(dictionaryPair);
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
              candidatesOfDictionary.add(dictionaryPair_1);
            }
          }
        }
      }
      return Scopes.scopeFor(candidatesOfDictionary);
    }
    return super.getScope(context, reference);
  }
}