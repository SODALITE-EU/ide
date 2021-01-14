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
import org.sodalite.dsl.rM.ENodeType;
import org.sodalite.dsl.rM.EOperationDefinition;
import org.sodalite.dsl.rM.EProperties;
import org.sodalite.dsl.rM.EPropertyDefinition;
import org.sodalite.dsl.rM.impl.EInterfaceDefinitionBodyImpl;
import org.sodalite.dsl.rM.impl.EOperationDefinitionImpl;
import org.sodalite.dsl.rM.impl.EParameterDefinitionImpl;
import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EParameter;
import org.sodalite.sdl.ansible.ansibleDsl.EUsedByBody;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EHandlerImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EInputInterfaceVariableReferenceImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EInputOperationVariableReferenceImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EModuleCallImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.ENotifiedHandlerImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.ENotifiedTopicImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EParameterImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EPlayImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EPlaybookImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.ERegisterVariableImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.ERegisterVariableReferenceImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.ESetFactVariableReferenceImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EUsedByBodyImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EVariableDeclarationImpl;
import org.sodalite.sdl.ansible.ansibleDsl.impl.EVariableDeclarationVariableReferenceImpl;
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
    if (((context instanceof EVariableDeclarationVariableReferenceImpl) && Objects.equal(reference, AnsibleDslPackage.Literals.EVARIABLE_DECLARATION_VARIABLE_REFERENCE__VARIABLE_DECLARATION_VARIABLE_REFERENCE))) {
      final EPlayImpl rootPlay = EcoreUtil2.<EPlayImpl>getContainerOfType(context, EPlayImpl.class);
      if ((rootPlay != null)) {
        final List<EVariableDeclarationImpl> candidates = EcoreUtil2.<EVariableDeclarationImpl>getAllContentsOfType(rootPlay, EVariableDeclarationImpl.class);
        return Scopes.scopeFor(candidates);
      }
    }
    if (((context instanceof ERegisterVariableReferenceImpl) && Objects.equal(reference, AnsibleDslPackage.Literals.EREGISTER_VARIABLE_REFERENCE__REGISTER_VARIABLE_REFERENCE))) {
      final EPlayImpl rootPlay_1 = EcoreUtil2.<EPlayImpl>getContainerOfType(context, EPlayImpl.class);
      if ((rootPlay_1 != null)) {
        final List<ERegisterVariableImpl> candidates_1 = EcoreUtil2.<ERegisterVariableImpl>getAllContentsOfType(rootPlay_1, ERegisterVariableImpl.class);
        return Scopes.scopeFor(candidates_1);
      }
    }
    if (((context instanceof ESetFactVariableReferenceImpl) && Objects.equal(reference, AnsibleDslPackage.Literals.ESET_FACT_VARIABLE_REFERENCE__NAME))) {
      final EPlaybookImpl rootPlaybook = EcoreUtil2.<EPlaybookImpl>getContainerOfType(context, EPlaybookImpl.class);
      if ((rootPlaybook != null)) {
        final List<EParameterImpl> candidates_2 = EcoreUtil2.<EParameterImpl>getAllContentsOfType(rootPlaybook, EParameterImpl.class);
        ArrayList<EParameter> legitCandidates = new ArrayList<EParameter>();
        for (final EParameterImpl parameter : candidates_2) {
          {
            final EModuleCallImpl moduleCall = EcoreUtil2.<EModuleCallImpl>getContainerOfType(parameter, EModuleCallImpl.class);
            if ((moduleCall != null)) {
              String _name = moduleCall.getName();
              boolean _equals = Objects.equal(_name, "set_fact");
              if (_equals) {
                legitCandidates.add(parameter);
              }
            }
          }
        }
        return Scopes.scopeFor(legitCandidates);
      }
    }
    if (((context instanceof ENotifiedHandlerImpl) && Objects.equal(reference, AnsibleDslPackage.Literals.ENOTIFIED_HANDLER__NAME))) {
      final EPlayImpl rootPlay_2 = EcoreUtil2.<EPlayImpl>getContainerOfType(context, EPlayImpl.class);
      if ((rootPlay_2 != null)) {
        final List<EHandlerImpl> candidates_3 = EcoreUtil2.<EHandlerImpl>getAllContentsOfType(rootPlay_2, EHandlerImpl.class);
        return Scopes.scopeFor(candidates_3);
      }
    }
    if (((context instanceof EUsedByBodyImpl) && Objects.equal(reference, AnsibleDslPackage.Literals.EUSED_BY_BODY__OPERATION))) {
      final ENodeType nodeType = ((EUsedByBodyImpl) context).getNode_type();
      if ((nodeType != null)) {
        final List<EOperationDefinitionImpl> candidates_4 = EcoreUtil2.<EOperationDefinitionImpl>getAllContentsOfType(nodeType, EOperationDefinitionImpl.class);
        return Scopes.scopeFor(candidates_4);
      }
    }
    if (((context instanceof EInputOperationVariableReferenceImpl) && Objects.equal(reference, AnsibleDslPackage.Literals.EINPUT_OPERATION_VARIABLE_REFERENCE__NAME))) {
      final EPlaybookImpl rootPlaybook_1 = EcoreUtil2.<EPlaybookImpl>getContainerOfType(context, EPlaybookImpl.class);
      final EUsedByBody usedByBody = rootPlaybook_1.getUsed_by();
      if ((usedByBody != null)) {
        final EOperationDefinition operation = usedByBody.getOperation();
        if ((operation != null)) {
          final List<EParameterDefinitionImpl> candidates_5 = EcoreUtil2.<EParameterDefinitionImpl>getAllContentsOfType(operation, EParameterDefinitionImpl.class);
          return Scopes.scopeFor(candidates_5);
        }
      }
    }
    if (((context instanceof EInputInterfaceVariableReferenceImpl) && Objects.equal(reference, AnsibleDslPackage.Literals.EINPUT_INTERFACE_VARIABLE_REFERENCE__NAME))) {
      final EPlaybookImpl rootPlaybook_2 = EcoreUtil2.<EPlaybookImpl>getContainerOfType(context, EPlaybookImpl.class);
      final ArrayList<EPropertyDefinition> candidates_6 = new ArrayList<EPropertyDefinition>();
      final EUsedByBody usedByBody_1 = rootPlaybook_2.getUsed_by();
      if ((usedByBody_1 != null)) {
        final EOperationDefinition operation_1 = usedByBody_1.getOperation();
        if ((operation_1 != null)) {
          final EInterfaceDefinitionBodyImpl interfaceDefinitionBody = EcoreUtil2.<EInterfaceDefinitionBodyImpl>getContainerOfType(operation_1, EInterfaceDefinitionBodyImpl.class);
          final EProperties inputsProperties = interfaceDefinitionBody.getInputs();
          EList<EPropertyDefinition> _properties = inputsProperties.getProperties();
          for (final EPropertyDefinition input : _properties) {
            candidates_6.add(input);
          }
          return Scopes.scopeFor(candidates_6);
        }
      }
    }
    if (((context instanceof EHandlerImpl) && Objects.equal(reference, AnsibleDslPackage.Literals.EHANDLER__LISTEN_TO))) {
      final EPlayImpl rootPlay_3 = EcoreUtil2.<EPlayImpl>getContainerOfType(context, EPlayImpl.class);
      if ((rootPlay_3 != null)) {
        final List<ENotifiedTopicImpl> candidates_7 = EcoreUtil2.<ENotifiedTopicImpl>getAllContentsOfType(rootPlay_3, ENotifiedTopicImpl.class);
        return Scopes.scopeFor(candidates_7);
      }
    }
    return super.getScope(context, reference);
  }
}