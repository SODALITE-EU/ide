/**
 * Copyright (c) 2019 Atos Spain S.A.
 * This program and the accompanying materials
 * are made available under the terms of the Apache Public License 2.0 (APL2)
 * which accompanies this distribution, and is available at
 * https://apache.org/licenses/LICENSE-2.0
 * 
 * Contributors:
 *     Jesús Gorroñogoitia - Design and implementation
 */
package org.sodalite.dsl.ui.contentassist;

import com.google.common.base.Objects;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.impl.KeywordImpl;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.sodalite.dsl.aADM.impl.EAttributesImpl;
import org.sodalite.dsl.aADM.impl.ENodeTemplateBodyImpl;
import org.sodalite.dsl.aADM.impl.EPropertiesImpl;
import org.sodalite.dsl.aADM.impl.ERequirementsImpl;
import org.sodalite.dsl.kb_reasoner_client.KBReasoner;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.Attribute;
import org.sodalite.dsl.kb_reasoner_client.types.Node;
import org.sodalite.dsl.kb_reasoner_client.types.Occurrences;
import org.sodalite.dsl.kb_reasoner_client.types.Property;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.Requirement;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.services.AADMGrammarAccess;
import org.sodalite.dsl.ui.contentassist.AbstractAADMProposalProvider;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class AADMProposalProvider extends AbstractAADMProposalProvider {
  @Inject
  private AADMGrammarAccess grammarAccess;
  
  private final Set<String> keywords = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("node_templates{"));
  
  private final Set<String> assignments = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("nodeTemplates"));
  
  private final KBReasoner kbclient = ((KBReasoner) new KBReasonerClient());
  
  @Override
  public void completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    String _value = keyword.getValue();
    String _plus = ("keyword: " + _value);
    System.out.println(_plus);
    boolean _contains = this.keywords.contains(keyword.getValue());
    if (_contains) {
      return;
    } else {
      this._completeKeyword(keyword, contentAssistContext, acceptor);
    }
  }
  
  public void _completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    final ICompletionProposal proposal = this.createCompletionProposal(keyword.getValue(), 
      this.getKeywordDisplayString(keyword), this.getImage(keyword), contentAssistContext);
    this.setAdditionalProposalInfo(proposal, this.getAdditionalProposalInfo(keyword));
    this.getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
    acceptor.accept(proposal);
  }
  
  public void setAdditionalProposalInfo(final ICompletionProposal proposal, final String info) {
    if ((proposal instanceof ConfigurableCompletionProposal)) {
      final ConfigurableCompletionProposal configurable = ((ConfigurableCompletionProposal) proposal);
      configurable.setAdditionalProposalInfo(info);
    }
  }
  
  public String getAdditionalProposalInfo(final Keyword keyword) {
    if ((keyword instanceof KeywordImpl)) {
      final KeywordImpl keywordImpl = ((KeywordImpl) keyword);
      final ParserRule rule = this.findParserRule(keywordImpl);
      if ((Objects.equal(rule.getName(), "ENodeTemplate") && Objects.equal(((KeywordImpl)keyword).getValue(), "type:"))) {
        return "The required name of the Node Type the Node Template is based upon";
      } else {
        if ((Objects.equal(rule.getName(), "ENodeTemplate") && Objects.equal(((KeywordImpl)keyword).getValue(), "attributes{"))) {
          return "An optional list of attribute value assignments for the Node Template.";
        } else {
          if ((Objects.equal(rule.getName(), "ENodeTemplate") && Objects.equal(((KeywordImpl)keyword).getValue(), "properties{"))) {
            return "An optional list of property value assignments for the Node Template.";
          } else {
            if ((Objects.equal(rule.getName(), "ENodeTemplate") && Objects.equal(((KeywordImpl)keyword).getValue(), "requirements{"))) {
              return "An optional sequenced list of requirement assignments for the Node Template.";
            } else {
              if ((Objects.equal(rule.getName(), "ERequirementAssignment") && Objects.equal(((KeywordImpl)keyword).getValue(), "node:"))) {
                return "The optional reserved keyname used to identify the target node of a relationship.\n specifically, it is used to provide either a: \n\t-Node Template: name that can fulfill the target node requirement.\n\t-Node Type: name that the provider will use to select a type-compatible node template to fulfill the requirement at runtime.";
              } else {
                return "";
              }
            }
          }
        }
      }
    }
    return null;
  }
  
  public ParserRule findParserRule(final EObject obj) {
    if ((obj == null)) {
      return null;
    } else {
      if ((obj instanceof ParserRule)) {
        return ((ParserRule) obj);
      } else {
        return this.findParserRule(obj.eContainer());
      }
    }
  }
  
  @Override
  public void completeAssignment(final Assignment assignment, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    String _feature = assignment.getFeature();
    String _plus = ("assignment: " + _feature);
    System.out.println(_plus);
    boolean _contains = this.assignments.contains(assignment.getFeature());
    if (_contains) {
      return;
    } else {
      super.completeAssignment(assignment, contentAssistContext, acceptor);
    }
  }
  
  @Override
  public void completeENodeTemplate_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    System.out.println("Invoking content assist for NodeTemplate::name property");
    final String proposalText = "node_template_id";
    final String displayText = "node_template_id";
    final String additionalProposalInfo = "The required id of the node template";
    this.createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
  }
  
  @Override
  public void completeENodeTemplateBody_Type(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for NodeTemplate::type property");
      final ReasonerData<Node> nodes = this.kbclient.getNodes();
      System.out.println("Nodes retrieved from KB:");
      List<Node> _elements = nodes.getElements();
      for (final Node node : _elements) {
        {
          String _label = node.getLabel();
          String _plus = ("\tNode: " + _label);
          System.out.println(_plus);
          final String proposalText = node.getLabel();
          final String displayText = node.getLabel();
          final String additionalProposalInfo = node.getDescription();
          this.createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
        }
      }
      super.completeENodeTemplateBody_Type(model, assignment, context, acceptor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void completeEAttributeAssignment_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for EAttributeAssignment::name property");
      String proposalText = "";
      String displayText = "";
      String additionalProposalInfo = "";
      String resourceId = "";
      if ((model instanceof ENodeTemplateBodyImpl)) {
        resourceId = ((ENodeTemplateBodyImpl) model).getType();
      } else {
        if ((model instanceof EAttributesImpl)) {
          EObject _eContainer = ((EAttributesImpl)model).eContainer();
          resourceId = ((ENodeTemplateBodyImpl) _eContainer).getType();
        }
      }
      if ((resourceId != null)) {
        final ReasonerData<Attribute> attributes = this.kbclient.getAttributes(resourceId);
        if ((attributes != null)) {
        }
        System.out.println(("Attributes retrieved from KB for resource: " + resourceId));
        List<Attribute> _elements = attributes.getElements();
        for (final Attribute attribute : _elements) {
          {
            URI _uri = attribute.getUri();
            String _plus = ("\tAttribute: " + _uri);
            System.out.println(_plus);
            String _string = attribute.getUri().toString();
            int _lastIndexOf = attribute.getUri().toString().lastIndexOf("/");
            int _plus_1 = (_lastIndexOf + 1);
            String attribute_label = _string.substring(_plus_1, attribute.getUri().toString().length());
            proposalText = attribute_label;
            displayText = attribute_label;
            String _label = attribute.getType().getLabel();
            String _plus_2 = ("Type: " + _label);
            String _plus_3 = (_plus_2 + "\nDescription: ");
            String _description = attribute.getDescription();
            String _plus_4 = (_plus_3 + _description);
            additionalProposalInfo = _plus_4;
            this.createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
          }
        }
      }
      proposalText = "attribute_name";
      displayText = "attribute_name";
      additionalProposalInfo = "represents the name of an attribute that would be used to select an attribute\ndefinition with the same name within on a TOSCA entity (e.g., Node Template, Relationship\nTemplate, etc.) which is declared (or reflected from a Property definition) in its declared type \n(e.g., a Node Type, Node Template, Capability Type, etc.). ";
      this.createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void completeEPropertyAssignment_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for EAttributeAssignment::name property");
      String proposalText = "";
      String displayText = "";
      String additionalProposalInfo = "";
      String resourceId = "";
      if ((model instanceof ENodeTemplateBodyImpl)) {
        resourceId = ((ENodeTemplateBodyImpl) model).getType();
      } else {
        if ((model instanceof EPropertiesImpl)) {
          EObject _eContainer = ((EPropertiesImpl)model).eContainer();
          resourceId = ((ENodeTemplateBodyImpl) _eContainer).getType();
        }
      }
      if ((resourceId != null)) {
        final ReasonerData<Property> properties = this.kbclient.getProperties(resourceId);
        if ((properties != null)) {
          System.out.println(("Properties retrieved from KB for resource: " + resourceId));
          List<Property> _elements = properties.getElements();
          for (final Property property : _elements) {
            {
              URI _uri = property.getUri();
              String _plus = ("\tProperty: " + _uri);
              System.out.println(_plus);
              String _string = property.getUri().toString();
              int _lastIndexOf = property.getUri().toString().lastIndexOf("/");
              int _plus_1 = (_lastIndexOf + 1);
              String property_label = _string.substring(_plus_1, property.getUri().toString().length());
              proposalText = property_label;
              displayText = property_label;
              String _label = property.getType().getLabel();
              String _plus_2 = ("Type: " + _label);
              String _plus_3 = (_plus_2 + "\nDescription: ");
              String _description = property.getDescription();
              String _plus_4 = (_plus_3 + _description);
              additionalProposalInfo = _plus_4;
              this.createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
            }
          }
        }
      }
      proposalText = "property_name";
      displayText = "property_name";
      additionalProposalInfo = "represents the name of a property that would be used to select a property \ndefinition with the same name within on a TOSCA entity (e.g., Node Template, Relationship \nTemplate, etc.,) which is declared in its declared type (e.g., a Node Type, Node Template, \nCapability Type, etc.). ";
      this.createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void completeERequirementAssignment_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for ERequirementAssignment::name property");
      String proposalText = "";
      String displayText = "";
      String additionalProposalInfo = "";
      String resourceId = "";
      if ((model instanceof ENodeTemplateBodyImpl)) {
        resourceId = ((ENodeTemplateBodyImpl) model).getType();
      } else {
        if ((model instanceof ERequirementsImpl)) {
          EObject _eContainer = ((ERequirementsImpl)model).eContainer();
          resourceId = ((ENodeTemplateBodyImpl) _eContainer).getType();
        }
      }
      if ((resourceId != null)) {
        final ReasonerData<Requirement> requirements = this.kbclient.getRequirements(resourceId);
        if ((requirements != null)) {
          System.out.println(("Requirements retrieved from KB for resource: " + resourceId));
          List<Requirement> _elements = requirements.getElements();
          for (final Requirement requirement : _elements) {
            {
              URI _uri = requirement.getUri();
              String _plus = ("\tRequirement: " + _uri);
              System.out.println(_plus);
              String _string = requirement.getUri().toString();
              int _lastIndexOf = requirement.getUri().toString().lastIndexOf("/");
              int _plus_1 = (_lastIndexOf + 1);
              String property_label = _string.substring(_plus_1, requirement.getUri().toString().length());
              proposalText = property_label;
              displayText = property_label;
              additionalProposalInfo = "";
              Type _capability = requirement.getCapability();
              boolean _tripleNotEquals = (_capability != null);
              if (_tripleNotEquals) {
                String _additionalProposalInfo = additionalProposalInfo;
                String _label = requirement.getCapability().getLabel();
                String _plus_2 = ("\nCapability: " + _label);
                additionalProposalInfo = (_additionalProposalInfo + _plus_2);
              }
              Type _node = requirement.getNode();
              boolean _tripleNotEquals_1 = (_node != null);
              if (_tripleNotEquals_1) {
                String _additionalProposalInfo_1 = additionalProposalInfo;
                String _label_1 = requirement.getNode().getLabel();
                String _plus_3 = ("\nNode: " + _label_1);
                additionalProposalInfo = (_additionalProposalInfo_1 + _plus_3);
              }
              Occurrences _occurrences = requirement.getOccurrences();
              boolean _tripleNotEquals_2 = (_occurrences != null);
              if (_tripleNotEquals_2) {
                String _additionalProposalInfo_2 = additionalProposalInfo;
                String _min = requirement.getOccurrences().getMin();
                String _plus_4 = ("\nOccurrences: [" + _min);
                String _plus_5 = (_plus_4 + ", ");
                String _max = requirement.getOccurrences().getMax();
                String _plus_6 = (_plus_5 + _max);
                String _plus_7 = (_plus_6 + "]");
                additionalProposalInfo = (_additionalProposalInfo_2 + _plus_7);
              }
              this.createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
            }
          }
        }
      }
      proposalText = "requirement_name";
      displayText = "requirement_name";
      additionalProposalInfo = "represents the symbolic name of a requirement assignment ";
      this.createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void complete_AADM_Model(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String proposalText = "node_templates{";
    final String displayText = "node_templates{";
    final String additionalProposalInfo = "A list of node template definitions for the Topology Template";
    this.createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
  }
  
  @Override
  public void complete_ID(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    return;
  }
  
  protected void createNonEditableCompletionProposal(final String proposalText, final String displayText, final ContentAssistContext context, final String additionalProposalInfo, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal proposal = this.createCompletionProposal(proposalText, displayText, null, context);
    if ((proposal instanceof ConfigurableCompletionProposal)) {
      final ConfigurableCompletionProposal configurable = ((ConfigurableCompletionProposal) proposal);
      configurable.setAdditionalProposalInfo(additionalProposalInfo);
      configurable.setAutoInsertable(false);
    }
    acceptor.accept(proposal);
  }
  
  protected void createEditableCompletionProposal(final String proposalText, final String displayText, final ContentAssistContext context, final String additionalProposalInfo, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal proposal = this.createCompletionProposal(proposalText, displayText, null, context);
    if ((proposal instanceof ConfigurableCompletionProposal)) {
      final ConfigurableCompletionProposal configurable = ((ConfigurableCompletionProposal) proposal);
      configurable.setSelectionStart(configurable.getReplacementOffset());
      configurable.setSelectionLength(proposalText.length());
      configurable.setAutoInsertable(false);
      configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
      configurable.setAdditionalProposalInfo(additionalProposalInfo);
    }
    acceptor.accept(proposal);
  }
}
