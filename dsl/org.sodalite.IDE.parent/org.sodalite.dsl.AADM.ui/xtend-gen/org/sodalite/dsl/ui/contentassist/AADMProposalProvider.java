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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Image;
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
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.EAttributeAssignment;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ECapabilityAssignments;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ENodeTemplateBody;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.aADM.ERequirementAssignments;
import org.sodalite.dsl.aADM.impl.EAttributeAssignmentsImpl;
import org.sodalite.dsl.aADM.impl.ECapabilityAssignmentsImpl;
import org.sodalite.dsl.aADM.impl.ENodeTemplateBodyImpl;
import org.sodalite.dsl.aADM.impl.ENodeTemplateImpl;
import org.sodalite.dsl.aADM.impl.EPolicyDefinitionBodyImpl;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException;
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignment;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.Occurrences;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.SuperType;
import org.sodalite.dsl.kb_reasoner_client.types.TemplateData;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.kb_reasoner_client.types.TypeData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNode;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;
import org.sodalite.dsl.rM.EEvenFilter;
import org.sodalite.dsl.rM.EPREFIX_ID;
import org.sodalite.dsl.rM.EPREFIX_REF;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.rM.EPropertyAssignment;
import org.sodalite.dsl.rM.GetAttribute;
import org.sodalite.dsl.rM.GetAttributeBody;
import org.sodalite.dsl.rM.impl.EPropertyAssignmentsImpl;
import org.sodalite.dsl.rM.impl.GetPropertyBodyImpl;
import org.sodalite.dsl.ui.helper.AADMHelper;
import org.sodalite.ide.ui.backend.SodaliteBackendProxy;
import org.sodalite.ide.ui.logger.SodaliteLogger;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class AADMProposalProvider extends AbstractAADMProposalProvider {
  private final Set<Object> keywords = Collections.<Object>unmodifiableSet(CollectionLiterals.<Object>newHashSet());
  
  private final Set<String> assignments = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("nodeTemplates"));
  
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
  
  public void completeAADM_Model_Imports(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeRM_Model_Imports(model, assignment, context, acceptor);
  }
  
  public void completeGetPropertyBody_Entity(final EObject property, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    System.out.println("Invoking content assist for GetPropertyBody::entity property");
    final List<ENodeTemplate> nodes = AADMHelper.findNodes(property);
    this.createNodeProposals(nodes, context, acceptor);
    this.createEntityProposals(context, acceptor);
  }
  
  public void completeGetAttributeBody_Entity(final EObject attribute, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    System.out.println("Invoking content assist for GetAttributeBody::entity property");
    final List<ENodeTemplate> nodes = AADMHelper.findNodes(attribute);
    this.createNodeProposals(nodes, context, acceptor);
    this.createEntityProposals(context, acceptor);
  }
  
  public void completeGetPropertyBody_Req_cap(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    System.out.println("Invoking content assist for GetPropertyBody::req_cap property");
    final String module = AADMHelper.getModule(model);
    final ENodeTemplate node = AADMHelper.getEntityNode(((GetPropertyBodyImpl) model));
    if ((node == null)) {
      return;
    }
    ERequirementAssignments _requirements = node.getNode().getRequirements();
    boolean _tripleNotEquals = (_requirements != null);
    if (_tripleNotEquals) {
      final Image image = this.getImage("icons/requirement.png");
      EList<ERequirementAssignment> _requirements_1 = node.getNode().getRequirements().getRequirements();
      for (final ERequirementAssignment req : _requirements_1) {
        {
          String _name = node.getName();
          String _plus = ((module + "/") + _name);
          String _plus_1 = (_plus + ".");
          String _name_1 = req.getName();
          final String proposal = (_plus_1 + _name_1);
          this.createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
        }
      }
    }
    ECapabilityAssignments _capabilities = node.getNode().getCapabilities();
    boolean _tripleNotEquals_1 = (_capabilities != null);
    if (_tripleNotEquals_1) {
      final Image image_1 = this.getImage("icons/capability.png");
      EList<ECapabilityAssignment> _capabilities_1 = node.getNode().getCapabilities().getCapabilities();
      for (final ECapabilityAssignment cap : _capabilities_1) {
        {
          String _name = node.getName();
          String _plus = ((module + "/") + _name);
          String _plus_1 = (_plus + ".");
          String _name_1 = cap.getName();
          final String proposal = (_plus_1 + _name_1);
          this.createEditableCompletionProposal(proposal, proposal, image_1, context, null, acceptor);
        }
      }
    }
  }
  
  public void completeGetPropertyBody_Property(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for GetPropertyBody::property property");
      final String module = AADMHelper.getModule(model);
      final GetPropertyBodyImpl body = ((GetPropertyBodyImpl) model);
      final ENodeTemplate node = AADMHelper.getEntityNode(body);
      if ((node == null)) {
        return;
      }
      List<String> proposals = new ArrayList<String>();
      EPREFIX_REF _req_cap = body.getReq_cap();
      boolean _tripleNotEquals = (_req_cap != null);
      if (_tripleNotEquals) {
        final String req_cap_name = AADMHelper.getLastSegment(body.getReq_cap(), ".");
        final ENodeTemplate req_node = AADMHelper.findRequirementNodeInTemplate(req_cap_name, node);
        if ((req_node != null)) {
          EList<EPropertyAssignment> _properties = req_node.getNode().getProperties().getProperties();
          for (final EPropertyAssignment prop : _properties) {
            String _name = req_node.getName();
            String _plus = ((module + "/") + _name);
            String _plus_1 = (_plus + ".");
            String _name_1 = prop.getName();
            String _plus_2 = (_plus_1 + _name_1);
            proposals.add(_plus_2);
          }
        }
        final ECapabilityAssignment cap = AADMHelper.findCapabilityInTemplate(req_cap_name, node);
        if ((cap != null)) {
          EList<EPropertyAssignment> _properties_1 = cap.getProperties().getProperties();
          for (final EPropertyAssignment prop_1 : _properties_1) {
            proposals.add(prop_1.getName());
          }
        }
      } else {
        final EPREFIX_TYPE type = node.getNode().getType();
        String _xifexpression = null;
        String _module = type.getModule();
        boolean _tripleNotEquals_1 = (_module != null);
        if (_tripleNotEquals_1) {
          String _module_1 = type.getModule();
          _xifexpression = (_module_1 + "/");
        } else {
          _xifexpression = "";
        }
        String _type = type.getType();
        final String resourceId = (_xifexpression + _type);
        final ReasonerData<PropertyDefinition> properties = SodaliteBackendProxy.getKBReasoner().getTypeProperties(resourceId);
        if ((properties != null)) {
          System.out.println(("Properties retrieved from KB for resource: " + resourceId));
          this.createProposalsForProperties(node, properties, context, acceptor);
        }
      }
      final Image image = this.getImage("icons/property.png");
      for (final String proposal : proposals) {
        this.createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void completeGetAttributeBody_Attribute(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for GetAttributeBody::attribute property");
      final String module = AADMHelper.getModule(model);
      GetAttributeBody body = null;
      if ((model instanceof GetAttributeBody)) {
        body = ((GetAttributeBody) model);
      } else {
        if ((model instanceof GetAttribute)) {
          body = ((GetAttribute) model).getAttribute();
        }
      }
      final ENodeTemplate node = AADMHelper.getEntityNode(body);
      if ((node == null)) {
        return;
      }
      List<String> proposals = new ArrayList<String>();
      EPREFIX_REF _req_cap = body.getReq_cap();
      boolean _tripleNotEquals = (_req_cap != null);
      if (_tripleNotEquals) {
        final String req_cap_name = AADMHelper.getLastSegment(body.getReq_cap(), ".");
        final ENodeTemplate req_node = AADMHelper.findRequirementNodeInTemplate(req_cap_name, node);
        if ((req_node != null)) {
          EList<EAttributeAssignment> _attributes = req_node.getNode().getAttributes().getAttributes();
          for (final EAttributeAssignment attr : _attributes) {
            String _name = req_node.getName();
            String _plus = ((module + "/") + _name);
            String _plus_1 = (_plus + ".");
            String _name_1 = attr.getName();
            String _plus_2 = (_plus_1 + _name_1);
            proposals.add(_plus_2);
          }
        }
      } else {
        final EPREFIX_TYPE type = node.getNode().getType();
        String _xifexpression = null;
        String _module = type.getModule();
        boolean _tripleNotEquals_1 = (_module != null);
        if (_tripleNotEquals_1) {
          String _module_1 = type.getModule();
          _xifexpression = (_module_1 + "/");
        } else {
          _xifexpression = "";
        }
        String _type = type.getType();
        final String resourceId = (_xifexpression + _type);
        final ReasonerData<AttributeDefinition> attributes = SodaliteBackendProxy.getKBReasoner().getTypeAttributes(resourceId);
        if ((attributes != null)) {
          System.out.println(("Attributes retrieved from KB for resource: " + resourceId));
          this.createProposalsForAttributes(node, attributes, context, acceptor);
        }
      }
      final Image image = this.getImage("icons/attribute.png");
      for (final String proposal : proposals) {
        this.createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void createProposalsForAttributes(final ENodeTemplate node, final ReasonerData<AttributeDefinition> attributes, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    String proposalText = "";
    String displayText = "";
    String additionalProposalInfo = "";
    final Image image = this.getImage("icons/attribute.png");
    List<AttributeDefinition> _elements = attributes.getElements();
    for (final AttributeDefinition attribute : _elements) {
      {
        URI _uri = attribute.getUri();
        String _plus = ("\tAttribute: " + _uri);
        System.out.println(_plus);
        String _string = attribute.getUri().toString();
        int _lastIndexOf = attribute.getUri().toString().lastIndexOf("/");
        int _plus_1 = (_lastIndexOf + 1);
        String attribute_label = _string.substring(_plus_1, attribute.getUri().toString().length());
        String module = AADMHelper.getModule(node);
        String _xifexpression = null;
        if ((module != null)) {
          _xifexpression = (module + "/");
        } else {
          _xifexpression = "";
        }
        String _name = node.getName();
        String _plus_2 = (_xifexpression + _name);
        String _plus_3 = (_plus_2 + ".");
        String _plus_4 = (_plus_3 + attribute_label);
        attribute_label = _plus_4;
        proposalText = attribute_label;
        displayText = attribute_label;
        String _xifexpression_1 = null;
        String _label = attribute.getType().getLabel();
        boolean _tripleNotEquals = (_label != null);
        if (_tripleNotEquals) {
          String _label_1 = attribute.getType().getLabel();
          _xifexpression_1 = ("Type: " + _label_1);
        } else {
          _xifexpression_1 = "";
        }
        additionalProposalInfo = _xifexpression_1;
        String _additionalProposalInfo = additionalProposalInfo;
        String _xifexpression_2 = null;
        String _description = attribute.getDescription();
        boolean _tripleNotEquals_1 = (_description != null);
        if (_tripleNotEquals_1) {
          String _description_1 = attribute.getDescription();
          _xifexpression_2 = ("\nDescription: " + _description_1);
        } else {
          _xifexpression_2 = "";
        }
        additionalProposalInfo = (_additionalProposalInfo + _xifexpression_2);
        this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
      }
    }
  }
  
  public void createProposalsForProperties(final ENodeTemplate node, final ReasonerData<PropertyDefinition> properties, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    String proposalText = "";
    String displayText = "";
    String additionalProposalInfo = "";
    final Image image = this.getImage("icons/property.png");
    List<PropertyDefinition> _elements = properties.getElements();
    for (final PropertyDefinition property : _elements) {
      {
        URI _uri = property.getUri();
        String _plus = ("\tProperty: " + _uri);
        System.out.println(_plus);
        String _string = property.getUri().toString();
        int _lastIndexOf = property.getUri().toString().lastIndexOf("/");
        int _plus_1 = (_lastIndexOf + 1);
        String property_label = _string.substring(_plus_1, property.getUri().toString().length());
        String module = AADMHelper.getModule(node);
        String _xifexpression = null;
        if ((module != null)) {
          _xifexpression = (module + "/");
        } else {
          _xifexpression = "";
        }
        String _name = node.getName();
        String _plus_2 = (_xifexpression + _name);
        String _plus_3 = (_plus_2 + ".");
        String _plus_4 = (_plus_3 + property_label);
        property_label = _plus_4;
        proposalText = property_label;
        displayText = property_label;
        String _xifexpression_1 = null;
        String _label = property.getType().getLabel();
        boolean _tripleNotEquals = (_label != null);
        if (_tripleNotEquals) {
          String _label_1 = property.getType().getLabel();
          _xifexpression_1 = ("Type: " + _label_1);
        } else {
          _xifexpression_1 = "";
        }
        additionalProposalInfo = _xifexpression_1;
        String _additionalProposalInfo = additionalProposalInfo;
        String _xifexpression_2 = null;
        String _description = property.getDescription();
        boolean _tripleNotEquals_1 = (_description != null);
        if (_tripleNotEquals_1) {
          String _description_1 = property.getDescription();
          _xifexpression_2 = ("\nDescription: " + _description_1);
        } else {
          _xifexpression_2 = "";
        }
        additionalProposalInfo = (_additionalProposalInfo + _xifexpression_2);
        this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
      }
    }
  }
  
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
  
  public void completeENodeTemplate_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    System.out.println("Invoking content assist for NodeTemplate::name property");
    final String proposalText = "node_template_id";
    final String displayText = "node_template_id";
    final String additionalProposalInfo = "The required id of the node template";
    this.createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
  }
  
  public void completeEPolicyDefinition_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    System.out.println("Invoking content assist for NodeTemplate::name property");
    final String proposalText = "policy_id";
    final String displayText = "policy_id";
    final String additionalProposalInfo = "The required id of the policy definition";
    this.createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
  }
  
  public void completeENodeTemplateBody_Type(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for NodeTemplate::type property");
      try {
        final List<String> importedModules = AADMHelper.getImportedModules(model);
        final String module = AADMHelper.getModule(model);
        importedModules.add(module);
        final ReasonerData<Type> nodes = SodaliteBackendProxy.getKBReasoner().getNodeTypes(importedModules);
        System.out.println("Nodes retrieved from KB:");
        List<Type> _elements = nodes.getElements();
        for (final Type node : _elements) {
          {
            String _label = node.getLabel();
            String _plus = ("\tNode: " + _label);
            System.out.println(_plus);
            String _xifexpression = null;
            String _module = node.getModule();
            boolean _tripleNotEquals = (_module != null);
            if (_tripleNotEquals) {
              String _lastSegment = AADMHelper.getLastSegment(node.getModule(), "/");
              String _plus_1 = (_lastSegment + "/");
              String _label_1 = node.getLabel();
              _xifexpression = (_plus_1 + _label_1);
            } else {
              _xifexpression = node.getLabel();
            }
            final String qnode = _xifexpression;
            final String proposalText = qnode;
            final String displayText = qnode;
            final String additionalProposalInfo = node.getDescription();
            Image image = this.getImage("icons/type.png");
            String _module_1 = node.getModule();
            boolean _tripleNotEquals_1 = (_module_1 != null);
            if (_tripleNotEquals_1) {
              image = this.getImage("icons/primitive_type.png");
            }
            this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
          }
        }
        super.completeENodeTemplateBody_Type(model, assignment, context, acceptor);
      } catch (final Throwable _t) {
        if (_t instanceof NotRolePermissionException) {
          AADMHelper.showReadPermissionErrorDialog();
        } else if (_t instanceof SodaliteException) {
          final SodaliteException ex_1 = (SodaliteException)_t;
          SodaliteLogger.log(ex_1.getMessage(), ex_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void completeEAttributeAssignment_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for EAttributeAssignment::name property");
      try {
        String proposalText = "";
        String displayText = "";
        String additionalProposalInfo = "";
        String resourceId = "";
        EPREFIX_TYPE type = null;
        if ((model instanceof ENodeTemplateBodyImpl)) {
          type = ((ENodeTemplateBodyImpl) model).getType();
        } else {
          if ((model instanceof EAttributeAssignmentsImpl)) {
            EObject _eContainer = ((EAttributeAssignmentsImpl)model).eContainer();
            type = ((ENodeTemplateBodyImpl) _eContainer).getType();
          }
        }
        String _xifexpression = null;
        String _module = type.getModule();
        boolean _tripleNotEquals = (_module != null);
        if (_tripleNotEquals) {
          String _module_1 = type.getModule();
          _xifexpression = (_module_1 + "/");
        } else {
          _xifexpression = "";
        }
        String _type = type.getType();
        String _plus = (_xifexpression + _type);
        resourceId = _plus;
        if ((resourceId != null)) {
          final ReasonerData<AttributeDefinition> attributes = SodaliteBackendProxy.getKBReasoner().getTypeAttributes(resourceId);
          if ((attributes != null)) {
          }
          System.out.println(("Attributes retrieved from KB for resource: " + resourceId));
          final Image image = this.getImage("icons/attribute.png");
          List<AttributeDefinition> _elements = attributes.getElements();
          for (final AttributeDefinition attribute : _elements) {
            {
              URI _uri = attribute.getUri();
              String _plus_1 = ("\tAttribute: " + _uri);
              System.out.println(_plus_1);
              String _string = attribute.getUri().toString();
              int _lastIndexOf = attribute.getUri().toString().lastIndexOf("/");
              int _plus_2 = (_lastIndexOf + 1);
              String attribute_label = _string.substring(_plus_2, attribute.getUri().toString().length());
              proposalText = attribute_label;
              displayText = attribute_label;
              String _xifexpression_1 = null;
              String _label = attribute.getType().getLabel();
              boolean _tripleNotEquals_1 = (_label != null);
              if (_tripleNotEquals_1) {
                String _label_1 = attribute.getType().getLabel();
                _xifexpression_1 = ("Type: " + _label_1);
              } else {
                _xifexpression_1 = "";
              }
              additionalProposalInfo = _xifexpression_1;
              String _additionalProposalInfo = additionalProposalInfo;
              String _xifexpression_2 = null;
              String _description = attribute.getDescription();
              boolean _tripleNotEquals_2 = (_description != null);
              if (_tripleNotEquals_2) {
                String _description_1 = attribute.getDescription();
                _xifexpression_2 = ("\nDescription: " + _description_1);
              } else {
                _xifexpression_2 = "";
              }
              additionalProposalInfo = (_additionalProposalInfo + _xifexpression_2);
              this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
            }
          }
        }
        proposalText = "attribute_name";
        displayText = "attribute_name";
        additionalProposalInfo = "represents the name of an attribute that would be used to select an attribute\ndefinition with the same name within on a TOSCA entity (e.g., Node Template, Relationship\nTemplate, etc.) which is declared (or reflected from a Property definition) in its declared type \n(e.g., a Node Type, Node Template, Capability Type, etc.). ";
        this.createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
      } catch (final Throwable _t) {
        if (_t instanceof NotRolePermissionException) {
          AADMHelper.showReadPermissionErrorDialog();
        } else if (_t instanceof SodaliteException) {
          final SodaliteException ex_1 = (SodaliteException)_t;
          SodaliteLogger.log(ex_1.getMessage(), ex_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void completeEPropertyAssignment_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for EPropertyAssignment::name property");
      try {
        String proposalText = "";
        String displayText = "";
        String additionalProposalInfo = "";
        String resourceId = "";
        EPREFIX_TYPE type = null;
        if ((model instanceof ENodeTemplateBodyImpl)) {
          type = ((ENodeTemplateBodyImpl) model).getType();
        } else {
          if ((model instanceof EPropertyAssignmentsImpl)) {
            EObject _eContainer = ((EPropertyAssignmentsImpl)model).eContainer();
            type = ((ENodeTemplateBodyImpl) _eContainer).getType();
          } else {
            if ((model instanceof ENodeTemplateImpl)) {
              type = ((ENodeTemplateImpl) model).getNode().getType();
            } else {
              if ((model instanceof EPolicyDefinitionBodyImpl)) {
                type = ((EPolicyDefinitionBodyImpl) model).getType();
              } else {
                if ((model instanceof ECapabilityAssignments)) {
                  EObject _eContainer_1 = ((ECapabilityAssignments)model).eContainer();
                  type = ((ENodeTemplateBodyImpl) _eContainer_1).getType();
                }
              }
            }
          }
        }
        String _xifexpression = null;
        String _module = type.getModule();
        boolean _tripleNotEquals = (_module != null);
        if (_tripleNotEquals) {
          String _module_1 = type.getModule();
          _xifexpression = (_module_1 + "/");
        } else {
          _xifexpression = "";
        }
        String _type = type.getType();
        String _plus = (_xifexpression + _type);
        resourceId = _plus;
        if ((resourceId != null)) {
          final ReasonerData<PropertyDefinition> properties = SodaliteBackendProxy.getKBReasoner().getTypeProperties(resourceId);
          if ((properties != null)) {
            System.out.println(("Properties retrieved from KB for resource: " + resourceId));
            final Image image = this.getImage("icons/property.png");
            List<PropertyDefinition> _elements = properties.getElements();
            for (final PropertyDefinition property : _elements) {
              {
                URI _uri = property.getUri();
                String _plus_1 = ("\tProperty: " + _uri);
                System.out.println(_plus_1);
                String _string = property.getUri().toString();
                int _lastIndexOf = property.getUri().toString().lastIndexOf("/");
                int _plus_2 = (_lastIndexOf + 1);
                String property_label = _string.substring(_plus_2, property.getUri().toString().length());
                proposalText = property_label;
                displayText = property_label;
                String _xifexpression_1 = null;
                String _label = property.getType().getLabel();
                boolean _tripleNotEquals_1 = (_label != null);
                if (_tripleNotEquals_1) {
                  String _label_1 = property.getType().getLabel();
                  _xifexpression_1 = ("Type: " + _label_1);
                } else {
                  _xifexpression_1 = "";
                }
                additionalProposalInfo = _xifexpression_1;
                String _additionalProposalInfo = additionalProposalInfo;
                String _xifexpression_2 = null;
                String _description = property.getDescription();
                boolean _tripleNotEquals_2 = (_description != null);
                if (_tripleNotEquals_2) {
                  String _description_1 = property.getDescription();
                  _xifexpression_2 = ("\nDescription: " + _description_1);
                } else {
                  _xifexpression_2 = "";
                }
                additionalProposalInfo = (_additionalProposalInfo + _xifexpression_2);
                this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
              }
            }
          }
        }
        proposalText = "property_name";
        displayText = "property_name";
        additionalProposalInfo = "represents the name of a property that would be used to select a property \ndefinition with the same name within on a TOSCA entity (e.g., Node Template, Relationship \nTemplate, etc.,) which is declared in its declared type (e.g., a Node Type, Node Template, \nCapability Type, etc.). ";
        this.createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
      } catch (final Throwable _t) {
        if (_t instanceof NotRolePermissionException) {
          AADMHelper.showReadPermissionErrorDialog();
        } else if (_t instanceof SodaliteException) {
          final SodaliteException ex_1 = (SodaliteException)_t;
          SodaliteLogger.log(ex_1.getMessage(), ex_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void completeECapabilityAssignment_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for ECapabilityAssignment::name property");
      try {
        String proposalText = "";
        String displayText = "";
        String additionalProposalInfo = "";
        String resourceId = "";
        EPREFIX_TYPE type = null;
        if ((model instanceof ENodeTemplateImpl)) {
          type = ((ENodeTemplateImpl) model).getNode().getType();
        } else {
          if ((model instanceof ENodeTemplateBodyImpl)) {
            EObject _eContainer = ((ENodeTemplateBodyImpl)model).eContainer();
            type = ((ENodeTemplateBodyImpl) _eContainer).getType();
          } else {
            if ((model instanceof ECapabilityAssignmentsImpl)) {
              EObject _eContainer_1 = ((ECapabilityAssignmentsImpl)model).eContainer();
              type = ((ENodeTemplateBodyImpl) _eContainer_1).getType();
            }
          }
        }
        String _xifexpression = null;
        String _module = type.getModule();
        boolean _tripleNotEquals = (_module != null);
        if (_tripleNotEquals) {
          String _module_1 = type.getModule();
          _xifexpression = (_module_1 + "/");
        } else {
          _xifexpression = "";
        }
        String _type = type.getType();
        String _plus = (_xifexpression + _type);
        resourceId = _plus;
        if ((resourceId != null)) {
          final ReasonerData<CapabilityDefinition> capabilities = SodaliteBackendProxy.getKBReasoner().getTypeCapabilities(resourceId);
          if ((capabilities != null)) {
            System.out.println(("Capabilities retrieved from KB for resource: " + resourceId));
            final Image image = this.getImage("icons/capability.png");
            List<CapabilityDefinition> _elements = capabilities.getElements();
            for (final CapabilityDefinition capability : _elements) {
              {
                URI _uri = capability.getUri();
                String _plus_1 = ("\nCapability: " + _uri);
                System.out.println(_plus_1);
                String _string = capability.getUri().toString();
                int _lastIndexOf = capability.getUri().toString().lastIndexOf("/");
                int _plus_2 = (_lastIndexOf + 1);
                String property_label = _string.substring(_plus_2, capability.getUri().toString().length());
                proposalText = property_label;
                displayText = property_label;
                additionalProposalInfo = "";
                SuperType _type_1 = capability.getType();
                boolean _tripleNotEquals_1 = (_type_1 != null);
                if (_tripleNotEquals_1) {
                  String _additionalProposalInfo = additionalProposalInfo;
                  String _label = capability.getType().getLabel();
                  String _plus_3 = ("\nType: " + _label);
                  additionalProposalInfo = (_additionalProposalInfo + _plus_3);
                }
                List<String> _valid_source_types = capability.getValid_source_types();
                boolean _tripleNotEquals_2 = (_valid_source_types != null);
                if (_tripleNotEquals_2) {
                  String _additionalProposalInfo_1 = additionalProposalInfo;
                  List<String> _valid_source_types_1 = capability.getValid_source_types();
                  String _plus_4 = ("\nValid source types:" + _valid_source_types_1);
                  additionalProposalInfo = (_additionalProposalInfo_1 + _plus_4);
                }
                this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
              }
            }
          }
        }
        proposalText = "capability_name";
        displayText = "capability_name";
        additionalProposalInfo = "represents the symbolic name of a capability assignment ";
        this.createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
      } catch (final Throwable _t) {
        if (_t instanceof NotRolePermissionException) {
          AADMHelper.showReadPermissionErrorDialog();
        } else if (_t instanceof SodaliteException) {
          final SodaliteException ex_1 = (SodaliteException)_t;
          SodaliteLogger.log(ex_1.getMessage(), ex_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void completeERequirementAssignment_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for ERequirementAssignment::name property");
      try {
        String proposalText = "";
        String displayText = "";
        String additionalProposalInfo = "";
        String resourceId = "";
        EPREFIX_TYPE type = null;
        if ((model instanceof ENodeTemplate)) {
          type = ((ENodeTemplate) model).getNode().getType();
        } else {
          if ((model instanceof ENodeTemplateBody)) {
            type = ((ENodeTemplateBodyImpl) model).getType();
          } else {
            if ((model instanceof ERequirementAssignments)) {
              EObject _eContainer = ((ERequirementAssignments)model).eContainer();
              type = ((ENodeTemplateBody) _eContainer).getType();
            }
          }
        }
        String _xifexpression = null;
        String _module = type.getModule();
        boolean _tripleNotEquals = (_module != null);
        if (_tripleNotEquals) {
          String _module_1 = type.getModule();
          _xifexpression = (_module_1 + "/");
        } else {
          _xifexpression = "";
        }
        String _type = type.getType();
        String _plus = (_xifexpression + _type);
        resourceId = _plus;
        if ((resourceId != null)) {
          final ReasonerData<RequirementDefinition> requirements = SodaliteBackendProxy.getKBReasoner().getTypeRequirements(resourceId);
          if ((requirements != null)) {
            System.out.println(("Requirements retrieved from KB for resource: " + resourceId));
            final Image image = this.getImage("icons/requirement.png");
            List<RequirementDefinition> _elements = requirements.getElements();
            for (final RequirementDefinition requirement : _elements) {
              {
                URI _uri = requirement.getUri();
                String _plus_1 = ("\tRequirement: " + _uri);
                System.out.println(_plus_1);
                String _string = requirement.getUri().toString();
                int _lastIndexOf = requirement.getUri().toString().lastIndexOf("/");
                int _plus_2 = (_lastIndexOf + 1);
                String property_label = _string.substring(_plus_2, requirement.getUri().toString().length());
                proposalText = property_label;
                displayText = property_label;
                additionalProposalInfo = "";
                SuperType _capability = requirement.getCapability();
                boolean _tripleNotEquals_1 = (_capability != null);
                if (_tripleNotEquals_1) {
                  String _additionalProposalInfo = additionalProposalInfo;
                  String _label = requirement.getCapability().getLabel();
                  String _plus_3 = ("\nCapability: " + _label);
                  additionalProposalInfo = (_additionalProposalInfo + _plus_3);
                }
                SuperType _node = requirement.getNode();
                boolean _tripleNotEquals_2 = (_node != null);
                if (_tripleNotEquals_2) {
                  String _additionalProposalInfo_1 = additionalProposalInfo;
                  String _label_1 = requirement.getNode().getLabel();
                  String _plus_4 = ("\nNode: " + _label_1);
                  additionalProposalInfo = (_additionalProposalInfo_1 + _plus_4);
                }
                Occurrences _occurrences = requirement.getOccurrences();
                boolean _tripleNotEquals_3 = (_occurrences != null);
                if (_tripleNotEquals_3) {
                  String _additionalProposalInfo_2 = additionalProposalInfo;
                  String _min = requirement.getOccurrences().getMin();
                  String _plus_5 = ("\nOccurrences: [" + _min);
                  String _plus_6 = (_plus_5 + ", ");
                  String _max = requirement.getOccurrences().getMax();
                  String _plus_7 = (_plus_6 + _max);
                  String _plus_8 = (_plus_7 + "]");
                  additionalProposalInfo = (_additionalProposalInfo_2 + _plus_8);
                }
                this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
              }
            }
          }
        }
        proposalText = "requirement_name";
        displayText = "requirement_name";
        additionalProposalInfo = "represents the symbolic name of a requirement assignment ";
        this.createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
      } catch (final Throwable _t) {
        if (_t instanceof NotRolePermissionException) {
          AADMHelper.showReadPermissionErrorDialog();
        } else if (_t instanceof SodaliteException) {
          final SodaliteException ex_1 = (SodaliteException)_t;
          SodaliteLogger.log(ex_1.getMessage(), ex_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void completeERequirementAssignment_Node(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for ERequirementAssignment::node property");
      try {
        ERequirementAssignment requirement = null;
        if ((model instanceof ERequirementAssignment)) {
          requirement = ((ERequirementAssignment) model);
        } else {
          EObject _previousModel = context.getPreviousModel();
          requirement = ((ERequirementAssignment) _previousModel);
        }
        final ValidRequirementNodeData vrnd = AADMHelper.getValidRequirementNodes(requirement);
        final TypeData tovrnd = AADMHelper.getTypeOfValidRequirementNodes(requirement);
        boolean _isEmpty = vrnd.getElements().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          final Image image = this.getImage("icons/resource2.png");
          final String additionalProposalInfo = "";
          List<ValidRequirementNode> _elements = vrnd.getElements();
          for (final ValidRequirementNode vrn : _elements) {
            {
              String _xifexpression = null;
              String _module = vrn.getModule();
              boolean _tripleNotEquals = (_module != null);
              if (_tripleNotEquals) {
                String _lastSegment = AADMHelper.getLastSegment(vrn.getModule(), "/");
                String _plus = (_lastSegment + "/");
                String _label = vrn.getLabel();
                _xifexpression = (_plus + _label);
              } else {
                _xifexpression = vrn.getLabel();
              }
              String _xifexpression_1 = null;
              String _version = vrn.getVersion();
              boolean _tripleNotEquals_1 = (_version != null);
              if (_tripleNotEquals_1) {
                String _version_1 = vrn.getVersion();
                _xifexpression_1 = ("@" + _version_1);
              } else {
                _xifexpression_1 = "";
              }
              final String qnode = (_xifexpression + _xifexpression_1);
              System.out.println(("Valid requirement node: " + qnode));
              final String displayText = qnode;
              final String proposalText = qnode;
              this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
            }
          }
        }
        boolean _isEmpty_1 = tovrnd.getElements().isEmpty();
        if (_isEmpty_1) {
          throw new Exception("Type of valid nodes satisfying the requirement not found");
        }
        final Type superType = tovrnd.getElements().get(0);
        String _xifexpression = null;
        String _module = superType.getModule();
        boolean _tripleNotEquals = (_module != null);
        if (_tripleNotEquals) {
          String _lastSegment = AADMHelper.getLastSegment(superType.getModule(), "/");
          String _plus = (_lastSegment + "/");
          String _label = superType.getLabel();
          _xifexpression = (_plus + _label);
        } else {
          _xifexpression = superType.getLabel();
        }
        final String qsuperType = _xifexpression;
        final List<ENodeTemplate> localnodes = AADMHelper.findLocalNodesForType(qsuperType, model);
        final Image image_1 = this.getImage("icons/resource2.png");
        final String module = AADMHelper.getModule(model);
        final String additionalProposalInfo_1 = "";
        for (final ENodeTemplate node : localnodes) {
          if ((node != null)) {
            String _xifexpression_1 = null;
            if ((module != null)) {
              String _name = node.getName();
              _xifexpression_1 = ((module + "/") + _name);
            } else {
              _xifexpression_1 = node.getName();
            }
            final String qnode = _xifexpression_1;
            final String proposalText = qnode;
            final String displayText = qnode;
            this.createNonEditableCompletionProposal(proposalText, displayText, image_1, context, additionalProposalInfo_1, acceptor);
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof NotRolePermissionException) {
          AADMHelper.showReadPermissionErrorDialog();
        } else if (_t instanceof SodaliteException) {
          final SodaliteException ex_1 = (SodaliteException)_t;
          SodaliteLogger.log(ex_1.getMessage(), ex_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void completeEEvenFilter_Node(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeEEvenFilter_Node(model, assignment, context, acceptor);
    final List<ENodeTemplate> localTemplates = AADMHelper.findLocalNodes(model);
    final String module = AADMHelper.getModule(model);
    this.createProposalsForLocalTemplateList(localTemplates, module, "icons/resource2.png", context, acceptor);
  }
  
  public void completeEDataTypeBody_SuperType(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for EDataType::supertype property");
      try {
        final List<String> importedModules = AADMHelper.getImportedModules(model);
        final String module = AADMHelper.getModule(model);
        if ((module != null)) {
          importedModules.add(module);
        }
        final ReasonerData<Type> types = SodaliteBackendProxy.getKBReasoner().getDataTypes(importedModules);
        System.out.println("Data types retrieved from KB:");
        List<Type> _elements = types.getElements();
        for (final Type type : _elements) {
          {
            String _label = type.getLabel();
            String _plus = ("\tData type: " + _label);
            System.out.println(_plus);
            String _xifexpression = null;
            String _module = type.getModule();
            boolean _tripleNotEquals = (_module != null);
            if (_tripleNotEquals) {
              String _lastSegment = AADMHelper.getLastSegment(type.getModule(), "/");
              String _plus_1 = (_lastSegment + "/");
              String _label_1 = type.getLabel();
              _xifexpression = (_plus_1 + _label_1);
            } else {
              _xifexpression = type.getLabel();
            }
            final String qtype = _xifexpression;
            final String proposalText = qtype;
            final String displayText = qtype;
            final String additionalProposalInfo = type.getDescription();
            Image image = this.getImage("icons/data_type.png");
            String _module_1 = type.getModule();
            boolean _tripleNotEquals_1 = (_module_1 != null);
            if (_tripleNotEquals_1) {
              image = this.getImage("icons/primitive_data_type.png");
            }
            this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof NotRolePermissionException) {
          AADMHelper.showReadPermissionErrorDialog();
        } else if (_t instanceof SodaliteException) {
          final SodaliteException ex_1 = (SodaliteException)_t;
          SodaliteLogger.log(ex_1.getMessage(), ex_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void complete_AADM_Model(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String proposalText = "node_templates:";
    final String displayText = "node_templates:";
    final String additionalProposalInfo = "A list of node template definitions for the Topology Template";
    this.createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
  }
  
  public void complete_ID(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    return;
  }
  
  protected void createNonEditableCompletionProposal(final String proposalText, final String displayText, final Image image, final ContentAssistContext context, final String additionalProposalInfo, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal proposal = this.createCompletionProposal(proposalText, displayText, image, context);
    if ((proposal instanceof ConfigurableCompletionProposal)) {
      final ConfigurableCompletionProposal configurable = ((ConfigurableCompletionProposal) proposal);
      configurable.setAdditionalProposalInfo(additionalProposalInfo);
      configurable.setAutoInsertable(false);
    }
    acceptor.accept(proposal);
  }
  
  protected void createEditableCompletionProposal(final String proposalText, final String displayText, final Image image, final ContentAssistContext context, final String additionalProposalInfo, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal proposal = this.createCompletionProposal(proposalText, displayText, image, context);
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
  
  public void completeEPolicyDefinitionBody_Type(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for NodeTemplate::type property");
      try {
        final List<String> importedModules = AADMHelper.getImportedModules(model);
        final String module = AADMHelper.getModule(model);
        importedModules.add(module);
        final ReasonerData<Type> policies = SodaliteBackendProxy.getKBReasoner().getPolicyTypes(importedModules);
        System.out.println("Nodes retrieved from KB:");
        List<Type> _elements = policies.getElements();
        for (final Type policy : _elements) {
          {
            String _label = policy.getLabel();
            String _plus = ("\tNode: " + _label);
            System.out.println(_plus);
            String _xifexpression = null;
            String _module = policy.getModule();
            boolean _tripleNotEquals = (_module != null);
            if (_tripleNotEquals) {
              String _lastSegment = AADMHelper.getLastSegment(policy.getModule(), "/");
              String _plus_1 = (_lastSegment + "/");
              String _label_1 = policy.getLabel();
              _xifexpression = (_plus_1 + _label_1);
            } else {
              _xifexpression = policy.getLabel();
            }
            final String qpolicy = _xifexpression;
            final String proposalText = qpolicy;
            final String displayText = qpolicy;
            final String additionalProposalInfo = policy.getDescription();
            Image image = this.getImage("icons/policy_type.png");
            String _module_1 = policy.getModule();
            boolean _tripleNotEquals_1 = (_module_1 != null);
            if (_tripleNotEquals_1) {
              image = this.getImage("icons/primitive_policy_type.png");
            }
            this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
          }
        }
        super.completeENodeTemplateBody_Type(model, assignment, context, acceptor);
      } catch (final Throwable _t) {
        if (_t instanceof NotRolePermissionException) {
          AADMHelper.showReadPermissionErrorDialog();
        } else if (_t instanceof SodaliteException) {
          final SodaliteException ex_1 = (SodaliteException)_t;
          SodaliteLogger.log(ex_1.getMessage(), ex_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void completeEEvenFilter_Requirement(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final EEvenFilter filter = ((EEvenFilter) model);
    EPREFIX_REF _node = filter.getNode();
    boolean _tripleNotEquals = (_node != null);
    if (_tripleNotEquals) {
      String qnode = AADMHelper.getNodeName(filter.getNode());
      final ENodeTemplate node = AADMHelper.findNodeInModel(model, qnode);
      if ((node != null)) {
        final String module = AADMHelper.getModule(model);
        this.createProposalsForRequirementsList(node.getNode().getRequirements().getRequirements(), module, "icons/requirement.png", context, acceptor);
      } else {
        super.completeEEvenFilter_Requirement(model, assignment, context, acceptor);
      }
    }
  }
  
  public void completeEEvenFilter_Capability(final EObject object, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      final EEvenFilter filter = ((EEvenFilter) object);
      final String module = AADMHelper.getModule(object);
      EObject _findModel = AADMHelper.findModel(object);
      final AADM_Model model = ((AADM_Model) _findModel);
      List<CapabilityDefinition> capabilityDefinitions = null;
      List<CapabilityAssignment> capabilityAssignments = null;
      String cap_assign_type = null;
      String cap_def_type = null;
      EPREFIX_REF _requirement = filter.getRequirement();
      boolean _tripleEquals = (_requirement == null);
      if (_tripleEquals) {
        final String node_module = module;
        String filter_node_type = null;
        boolean _equals = node_module.equals(module);
        if (_equals) {
          final String node_id = AADMHelper.getId(filter.getNode());
          final ENodeTemplate filter_node = AADMHelper.findNode(model, node_id);
          if ((filter_node != null)) {
            filter_node_type = AADMHelper.getReference(filter_node.getNode().getType());
          }
        }
        if ((filter_node_type == null)) {
          filter_node_type = AADMHelper.findNodeTemplateInKB(object, AADMHelper.getReference(filter.getNode()));
        }
        if ((filter_node_type != null)) {
          capabilityDefinitions = AADMHelper.findCapabilitiesInNodeType(filter_node_type);
          cap_def_type = filter_node_type;
        }
      } else {
        final ENodeTemplate req_node = AADMHelper.findRequirementNodeInLocalModel(object, filter.getRequirement());
        if ((req_node != null)) {
          final String node_type = AADMHelper.getReference(req_node.getNode().getType());
          final CapabilityDefinitionData capabilityData = SodaliteBackendProxy.getKBReasoner().getTypeCapabilities(node_type);
          capabilityDefinitions = capabilityData.getElements();
          cap_def_type = node_type;
        } else {
          final String nodeName = AADMHelper.getNodeFromRequirementRef(filter.getRequirement());
          final String req_name = AADMHelper.getRequirementNameFromRequirementRef(filter.getRequirement());
          final CapabilityAssignmentData capabilityData_1 = SodaliteBackendProxy.getKBReasoner().getCapabilitiesDeclaredInTargetNodeForNodeTemplateRequirement(nodeName, req_name);
          capabilityAssignments = capabilityData_1.getElements();
          cap_assign_type = nodeName;
        }
      }
      final Image image = this.getImage("icons/capability.png");
      if ((capabilityAssignments != null)) {
        for (final CapabilityAssignment cap : capabilityAssignments) {
          {
            String _lastSegment = AADMHelper.getLastSegment(cap.getUri().toString(), "/");
            final String proposal = ((cap_assign_type + ".") + _lastSegment);
            this.createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
          }
        }
      }
      if ((capabilityDefinitions != null)) {
        for (final CapabilityDefinition cap_1 : capabilityDefinitions) {
          {
            String _lastSegment = AADMHelper.getLastSegment(cap_1.getUri().toString(), "/");
            final String proposal = ((cap_def_type + ".") + _lastSegment);
            this.createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void completeETarget_Target(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      try {
        final List<String> importedModules = AADMHelper.processListModules(model);
        final TemplateData templates = SodaliteBackendProxy.getKBReasoner().getTemplates(importedModules);
        this.createProposalsForTemplateList(templates, "icons/resource2.png", context, acceptor);
        final List<ENodeTemplate> localNodes = AADMHelper.findLocalNodes(model);
        this.createProposalsForTemplateList(localNodes, "icons/resource2.png", context, acceptor);
      } catch (final Throwable _t) {
        if (_t instanceof NotRolePermissionException) {
          AADMHelper.showReadPermissionErrorDialog();
        } else if (_t instanceof SodaliteException) {
          final SodaliteException ex_1 = (SodaliteException)_t;
          SodaliteLogger.log(ex_1.getMessage(), ex_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void completeGetInput_Input(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    EObject _findModel = AADMHelper.findModel(model);
    final AADM_Model aadm = ((AADM_Model) _findModel);
    if ((aadm != null)) {
      Image image = this.getImage("icons/input.png");
      EList<EParameterDefinition> _parameters = aadm.getInputs().getParameters();
      for (final EParameterDefinition input : _parameters) {
        {
          final String proposalText = input.getName();
          this.createNonEditableCompletionProposal(proposalText, proposalText, image, context, null, acceptor);
        }
      }
    }
  }
  
  public void createProposalsForTemplateList(final List<ENodeTemplate> templates, final String defaultImage, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    for (final ENodeTemplate template : templates) {
      {
        final String module = AADMHelper.getModule(template);
        String _xifexpression = null;
        if ((module != null)) {
          String _name = template.getName();
          _xifexpression = ((module + "/") + _name);
        } else {
          _xifexpression = template.getName();
        }
        final String qtype = _xifexpression;
        final String proposalText = qtype;
        final String displayText = qtype;
        Image image = this.getImage(defaultImage);
        this.createNonEditableCompletionProposal(proposalText, displayText, image, context, null, acceptor);
      }
    }
  }
  
  public void createProposalsForRequirementsList(final List<ERequirementAssignment> reqs, final String module, final String defaultImage, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    for (final ERequirementAssignment req : reqs) {
      this.createProposalForRequirement(req, module, defaultImage, context, acceptor);
    }
  }
  
  public void createProposalForRequirement(final ERequirementAssignment req, final String module, final String defaultImage, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    EObject _eContainer = req.eContainer().eContainer().eContainer();
    String _name = ((ENodeTemplate) _eContainer).getName();
    String _plus = (_name + ".");
    String _name_1 = req.getName();
    final String qreq = (_plus + _name_1);
    String _xifexpression = null;
    if ((module != null)) {
      _xifexpression = ((module + "/") + qreq);
    } else {
      _xifexpression = qreq;
    }
    String property_label = _xifexpression;
    String proposalText = property_label;
    String displayText = property_label;
    String additionalProposalInfo = "";
    EPREFIX_ID _node = req.getNode();
    boolean _tripleNotEquals = (_node != null);
    if (_tripleNotEquals) {
      String _additionalProposalInfo = additionalProposalInfo;
      EPREFIX_ID _node_1 = req.getNode();
      String _plus_1 = ("\nNode: " + _node_1);
      additionalProposalInfo = (_additionalProposalInfo + _plus_1);
    }
    Image image = this.getImage(defaultImage);
    this.createNonEditableCompletionProposal(proposalText, displayText, image, context, null, acceptor);
  }
  
  public void createProposalsForLocalTemplateList(final List<ENodeTemplate> templates, final String module, final String defaultImage, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    for (final ENodeTemplate node : templates) {
      {
        String _xifexpression = null;
        if ((module != null)) {
          String _name = node.getName();
          _xifexpression = ((module + "/") + _name);
        } else {
          _xifexpression = node.getName();
        }
        final String qnode = _xifexpression;
        final String proposalText = qnode;
        final String displayText = qnode;
        Image image = this.getImage(defaultImage);
        this.createNonEditableCompletionProposal(proposalText, displayText, image, context, null, acceptor);
      }
    }
  }
  
  public String getAdditionalProposalInfo(final Keyword keyword) {
    if ((keyword instanceof KeywordImpl)) {
      final KeywordImpl keywordImpl = ((KeywordImpl) keyword);
      final ParserRule rule = AADMHelper.findParserRule(keywordImpl);
      if ((Objects.equal(rule.getName(), "AADM_Model") && Objects.equal(((KeywordImpl)keyword).getValue(), "module:"))) {
        return "The namespace where model entity names will be declared";
      } else {
        if ((Objects.equal(rule.getName(), "AADM_Model") && Objects.equal(((KeywordImpl)keyword).getValue(), "import:"))) {
          return "Imports another namespace declared within \nthe bound KB to retrieve its model entity definitions";
        } else {
          if ((Objects.equal(rule.getName(), "AADM_Model") && Objects.equal(((KeywordImpl)keyword).getValue(), "inputs:"))) {
            return "An optional map of input parameters \n(i.e., as parameter definitions) for the Topology Template.";
          } else {
            if ((Objects.equal(rule.getName(), "AADM_Model") && Objects.equal(((KeywordImpl)keyword).getValue(), "outputs:"))) {
              return "An optional map of output parameters \n(i.e., as parameter definitions) for the Topology Template.";
            } else {
              if ((Objects.equal(rule.getName(), "AADM_Model") && Objects.equal(((KeywordImpl)keyword).getValue(), "node_templates:"))) {
                return "An optional map of node template definitions \nfor the Topology Template.";
              } else {
                if ((Objects.equal(rule.getName(), "AADM_Model") && Objects.equal(((KeywordImpl)keyword).getValue(), "policies:"))) {
                  return "An optional list of Policy definitions \nfor the Topology Template.";
                } else {
                  if ((Objects.equal(rule.getName(), "ENodeTemplateBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "type:"))) {
                    return "The required name of the Node Type the Node Template is based upon";
                  } else {
                    if ((Objects.equal(rule.getName(), "ENodeTemplateBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "description:"))) {
                      return "An optional description for the Node Template.";
                    } else {
                      if ((Objects.equal(rule.getName(), "ENodeTemplateBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "attributes:"))) {
                        return "An optional list of attribute value assignments for the Node Template.";
                      } else {
                        if ((Objects.equal(rule.getName(), "ENodeTemplateBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "properties:"))) {
                          return "An optional list of property value assignments for the Node Template.";
                        } else {
                          if ((Objects.equal(rule.getName(), "ENodeTemplateBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "requirements:"))) {
                            return "An optional sequenced list of requirement assignments for the Node Template.";
                          } else {
                            if ((Objects.equal(rule.getName(), "ENodeTemplateBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "capabilities:"))) {
                              return "An optional map of capability assignments for the Node Template.";
                            } else {
                              if ((Objects.equal(rule.getName(), "ENodeTemplateBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "optimization:"))) {
                                return "An optional reference to an optimization model associated to this Node Template";
                              } else {
                                if ((Objects.equal(rule.getName(), "ERequirementAssignment") && Objects.equal(((KeywordImpl)keyword).getValue(), "node:"))) {
                                  return "The optional reserved keyname used to identify the target node of a relationship.\n specifically, it is used to provide either a: \n\t-Node Template: name that can fulfill the target node requirement.\n\t-Node Type: name that the provider will use to select a type-compatible node template to fulfill the requirement at runtime.";
                                } else {
                                  if ((Objects.equal(rule.getName(), "EPolicyDefinitionBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "type:"))) {
                                    return "The required name of the policy type the policy definition is based upon.";
                                  } else {
                                    if ((Objects.equal(rule.getName(), "EPolicyDefinitionBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "description:"))) {
                                      return "The optional description for the policy definition.";
                                    } else {
                                      if ((Objects.equal(rule.getName(), "EPolicyDefinitionBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "properties:"))) {
                                        return "An optional map of property value assignments for the policy definition.";
                                      } else {
                                        if ((Objects.equal(rule.getName(), "EPolicyDefinitionBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "targets:"))) {
                                          return "An optional list of valid Node Templates or Groups the Policy \n\t\t\t\t\t\tcan be applied to.";
                                        } else {
                                          if ((Objects.equal(rule.getName(), "EPolicyDefinitionBody") && Objects.equal(((KeywordImpl)keyword).getValue(), "triggers:"))) {
                                            return "An optional map of trigger definitions to invoke when the policy \n\t\t\t\t\t\tis applied by an orchestrator against the associated TOSCA entity.";
                                          } else {
                                            return super.getAdditionalProposalInfo(keyword);
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return null;
  }
  
  protected void createNodeProposals(final List<ENodeTemplate> nodes, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    boolean _isEmpty = nodes.isEmpty();
    if (_isEmpty) {
      return;
    }
    final Image image = this.getImage("icons/resource2.png");
    final String module = AADMHelper.getModule(nodes.get(0));
    final String additionalProposalInfo = "";
    for (final ENodeTemplate node : nodes) {
      if ((node != null)) {
        String _xifexpression = null;
        if ((module != null)) {
          String _name = node.getName();
          _xifexpression = ((module + "/") + _name);
        } else {
          _xifexpression = node.getName();
        }
        final String qnode = _xifexpression;
        final String proposalText = qnode;
        final String displayText = qnode;
        this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
      }
    }
  }
}
