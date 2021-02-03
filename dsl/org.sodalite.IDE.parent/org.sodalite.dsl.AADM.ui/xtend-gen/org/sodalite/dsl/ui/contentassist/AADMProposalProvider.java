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
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
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
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ECapabilityAssignments;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.aADM.ERequirementAssignments;
import org.sodalite.dsl.aADM.impl.EAttributeAssigmentsImpl;
import org.sodalite.dsl.aADM.impl.ECapabilityAssignmentsImpl;
import org.sodalite.dsl.aADM.impl.ENodeTemplateBodyImpl;
import org.sodalite.dsl.aADM.impl.ENodeTemplateImpl;
import org.sodalite.dsl.aADM.impl.EPolicyDefinitionBodyImpl;
import org.sodalite.dsl.aADM.impl.ERequirementAssignmentImpl;
import org.sodalite.dsl.aADM.impl.ERequirementAssignmentsImpl;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.Occurrences;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.SuperType;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.kb_reasoner_client.types.TypeData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNode;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;
import org.sodalite.dsl.rM.EEntity;
import org.sodalite.dsl.rM.EEntityReference;
import org.sodalite.dsl.rM.EEvenFilter;
import org.sodalite.dsl.rM.EPREFIX_ID;
import org.sodalite.dsl.rM.EPREFIX_REF;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EPropertyAssignment;
import org.sodalite.dsl.rM.impl.EPropertyAssignmentsImpl;
import org.sodalite.dsl.rM.impl.GetPropertyBodyImpl;
import org.sodalite.dsl.ui.contentassist.AbstractAADMProposalProvider;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class AADMProposalProvider extends AbstractAADMProposalProvider {
  private final Set<Object> keywords = Collections.<Object>unmodifiableSet(CollectionLiterals.<Object>newHashSet());
  
  private final Set<String> assignments = Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet("nodeTemplates"));
  
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
  
  @Override
  public void _completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    final ICompletionProposal proposal = this.createCompletionProposal(keyword.getValue(), 
      this.getKeywordDisplayString(keyword), this.getImage(keyword), contentAssistContext);
    this.setAdditionalProposalInfo(proposal, this.getAdditionalProposalInfo(keyword));
    this.getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
    acceptor.accept(proposal);
  }
  
  @Override
  public void completeAADM_Model_Imports(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeRM_Model_Imports(model, assignment, context, acceptor);
  }
  
  @Override
  public void completeGetPropertyBody_Entity(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    System.out.println("Invoking content assist for GetPropertyBody::entity property");
    this.createEntityProposals(context, acceptor);
  }
  
  @Override
  public void completeGetPropertyBody_Req_cap(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    System.out.println("Invoking content assist for GetPropertyBody::req_cap property");
    final String module = this.getModule(model);
    final ENodeTemplate node = this.getEntityNode(((GetPropertyBodyImpl) model));
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
  
  @Override
  public void completeGetPropertyBody_Property(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    System.out.println("Invoking content assist for GetPropertyBody::property property");
    final String module = this.getModule(model);
    final GetPropertyBodyImpl body = ((GetPropertyBodyImpl) model);
    final ENodeTemplate node = this.getEntityNode(body);
    if ((node == null)) {
      return;
    }
    List<String> proposals = new ArrayList<String>();
    EPREFIX_TYPE _req_cap = body.getReq_cap();
    boolean _tripleNotEquals = (_req_cap != null);
    if (_tripleNotEquals) {
      final String req_cap_name = this.getLastSegment(body.getReq_cap().getType(), ".");
      final ENodeTemplate req_node = this.findRequirementNodeInTemplate(req_cap_name, node);
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
      final ECapabilityAssignment cap = this.findCapabilityInTemplate(req_cap_name, node);
      if ((cap != null)) {
        EList<EPropertyAssignment> _properties_1 = cap.getProperties().getProperties();
        for (final EPropertyAssignment prop_1 : _properties_1) {
          proposals.add(prop_1.getName());
        }
      }
    } else {
      EList<EPropertyAssignment> _properties_2 = node.getNode().getProperties().getProperties();
      for (final EPropertyAssignment prop_2 : _properties_2) {
        proposals.add(prop_2.getName());
      }
    }
    final Image image = this.getImage("icons/property.png");
    for (final String proposal : proposals) {
      this.createEditableCompletionProposal(proposal, proposal, image, context, null, acceptor);
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
    this.createEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
  }
  
  @Override
  public void completeENodeTemplateBody_Type(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for NodeTemplate::type property");
      try {
        final List<String> importedModules = this.getImportedModules(model);
        final String module = this.getModule(model);
        importedModules.add(module);
        final ReasonerData<Type> nodes = this.getKBReasoner().getNodeTypes(importedModules);
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
              String _lastSegment = this.getLastSegment(node.getModule(), "/");
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
          this.showReadPermissionErrorDialog();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
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
          if ((model instanceof EAttributeAssigmentsImpl)) {
            EObject _eContainer = ((EAttributeAssigmentsImpl)model).eContainer();
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
          final ReasonerData<AttributeDefinition> attributes = this.getKBReasoner().getTypeAttributes(resourceId);
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
          this.showReadPermissionErrorDialog();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
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
          final ReasonerData<PropertyDefinition> properties = this.getKBReasoner().getTypeProperties(resourceId);
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
          this.showReadPermissionErrorDialog();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void completeECapabilityAssignment_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for ECapabilityAssignment::name property");
      try {
        String proposalText = "";
        String displayText = "";
        String additionalProposalInfo = "";
        String resourceId = "";
        EPREFIX_TYPE type = null;
        if ((model instanceof ENodeTemplateBodyImpl)) {
          type = ((ENodeTemplateBodyImpl) model).getType();
        } else {
          if ((model instanceof ECapabilityAssignmentsImpl)) {
            EObject _eContainer = ((ECapabilityAssignmentsImpl)model).eContainer();
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
          final ReasonerData<CapabilityDefinition> capabilities = this.getKBReasoner().getTypeCapabilities(resourceId);
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
          this.showReadPermissionErrorDialog();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void completeERequirementAssignment_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for ERequirementAssignment::name property");
      try {
        String proposalText = "";
        String displayText = "";
        String additionalProposalInfo = "";
        String resourceId = "";
        EPREFIX_TYPE type = null;
        if ((model instanceof ENodeTemplateBodyImpl)) {
          type = ((ENodeTemplateBodyImpl) model).getType();
        } else {
          if ((model instanceof ERequirementAssignmentsImpl)) {
            EObject _eContainer = ((ERequirementAssignmentsImpl)model).eContainer();
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
          final ReasonerData<RequirementDefinition> requirements = this.getKBReasoner().getTypeRequirements(resourceId);
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
          this.showReadPermissionErrorDialog();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void completeERequirementAssignment_Node(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for ERequirementAssignment::node property");
      try {
        String proposalText = "";
        String displayText = "";
        String additionalProposalInfo = "";
        final String requirementId = ((ERequirementAssignmentImpl) model).getName();
        EObject _eContainer = model.eContainer().eContainer();
        final EPREFIX_TYPE nodeType = ((ENodeTemplateBodyImpl) _eContainer).getType();
        String _xifexpression = null;
        String _module = nodeType.getModule();
        boolean _tripleNotEquals = (_module != null);
        if (_tripleNotEquals) {
          String _module_1 = nodeType.getModule();
          _xifexpression = (_module_1 + "/");
        } else {
          _xifexpression = "";
        }
        String _type = nodeType.getType();
        final String resourceId = (_xifexpression + _type);
        Object _findModel = this.findModel(model);
        final AADM_Model rootModel = ((AADM_Model) _findModel);
        final String aadmURI = this.getAADMURI(rootModel);
        final List<String> importedModules = this.getImportedModules(model);
        final String module = this.getModule(model);
        importedModules.add(module);
        final ValidRequirementNodeData vrnd = this.getKBReasoner().getValidRequirementNodes(requirementId, resourceId, importedModules);
        final TypeData tovrnd = this.getKBReasoner().getTypeOfValidRequirementNodes(requirementId, resourceId, importedModules);
        boolean _isEmpty = vrnd.getElements().isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          System.out.println(("Valid requirement nodes retrieved from KB for requirement: " + requirementId));
          final Image image = this.getImage("icons/resource2.png");
          List<ValidRequirementNode> _elements = vrnd.getElements();
          for (final ValidRequirementNode vrn : _elements) {
            {
              String _xifexpression_1 = null;
              String _module_2 = vrn.getType().getModule();
              boolean _tripleNotEquals_1 = (_module_2 != null);
              if (_tripleNotEquals_1) {
                String _lastSegment = this.getLastSegment(vrn.getType().getModule(), "/");
                String _plus = (_lastSegment + "/");
                String _label = vrn.getType().getLabel();
                _xifexpression_1 = (_plus + _label);
              } else {
                _xifexpression_1 = vrn.getType().getLabel();
              }
              final String qtype = _xifexpression_1;
              String _xifexpression_2 = null;
              String _module_3 = vrn.getModule();
              boolean _tripleNotEquals_2 = (_module_3 != null);
              if (_tripleNotEquals_2) {
                String _lastSegment_1 = this.getLastSegment(vrn.getModule(), "/");
                String _plus_1 = (_lastSegment_1 + "/");
                String _label_1 = vrn.getLabel();
                _xifexpression_2 = (_plus_1 + _label_1);
              } else {
                _xifexpression_2 = vrn.getLabel();
              }
              final String qnode = _xifexpression_2;
              System.out.println(("Valid requirement node: " + qnode));
              displayText = qnode;
              proposalText = qnode;
              this.createNonEditableCompletionProposal(proposalText, displayText, image, context, additionalProposalInfo, acceptor);
            }
          }
        }
        boolean _isEmpty_1 = tovrnd.getElements().isEmpty();
        if (_isEmpty_1) {
          throw new Exception("Type of valid nodes satisfying the requirement not found");
        }
        final Type superType = tovrnd.getElements().get(0);
        String _xifexpression_1 = null;
        String _module_2 = superType.getModule();
        boolean _tripleNotEquals_1 = (_module_2 != null);
        if (_tripleNotEquals_1) {
          String _lastSegment = this.getLastSegment(superType.getModule(), "/");
          String _plus = (_lastSegment + "/");
          String _label = superType.getLabel();
          _xifexpression_1 = (_plus + _label);
        } else {
          _xifexpression_1 = superType.getLabel();
        }
        final String qsuperType = _xifexpression_1;
        final List<ENodeTemplate> localnodes = this.findLocalNodesForType(qsuperType, model);
        for (final ENodeTemplate node : localnodes) {
          if ((node != null)) {
            String _name = node.getName();
            String _plus_1 = ("Valid requirement local node: " + _name);
            System.out.println(_plus_1);
            String _xifexpression_2 = null;
            if ((module != null)) {
              String _name_1 = node.getName();
              _xifexpression_2 = ((module + "/") + _name_1);
            } else {
              _xifexpression_2 = node.getName();
            }
            final String qnode = _xifexpression_2;
            proposalText = qnode;
            displayText = qnode;
            this.createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof NotRolePermissionException) {
          this.showReadPermissionErrorDialog();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void completeEEvenFilter_Node(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeEEvenFilter_Node(model, assignment, context, acceptor);
    final List<ENodeTemplate> localTemplates = this.findLocalNodes(model);
    final String module = this.getModule(model);
    this.createProposalsForLocalTemplateList(localTemplates, module, "icons/resource2.png", context, acceptor);
  }
  
  @Override
  public void completeEDataTypeBody_SuperType(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for EDataType::supertype property");
      try {
        final List<String> importedModules = this.getImportedModules(model);
        final String module = this.getModule(model);
        if ((module != null)) {
          importedModules.add(module);
        }
        final ReasonerData<Type> types = this.getKBReasoner().getDataTypes(importedModules);
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
              String _lastSegment = this.getLastSegment(type.getModule(), "/");
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
          this.showReadPermissionErrorDialog();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void complete_AADM_Model(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final String proposalText = "node_templates:";
    final String displayText = "node_templates:";
    final String additionalProposalInfo = "A list of node template definitions for the Topology Template";
    this.createNonEditableCompletionProposal(proposalText, displayText, null, context, additionalProposalInfo, acceptor);
  }
  
  @Override
  public void complete_ID(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    return;
  }
  
  @Override
  protected void createNonEditableCompletionProposal(final String proposalText, final String displayText, final Image image, final ContentAssistContext context, final String additionalProposalInfo, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal proposal = this.createCompletionProposal(proposalText, displayText, image, context);
    if ((proposal instanceof ConfigurableCompletionProposal)) {
      final ConfigurableCompletionProposal configurable = ((ConfigurableCompletionProposal) proposal);
      configurable.setAdditionalProposalInfo(additionalProposalInfo);
      configurable.setAutoInsertable(false);
    }
    acceptor.accept(proposal);
  }
  
  @Override
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
  
  @Override
  public void completeEPolicyDefinitionBody_Type(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    try {
      System.out.println("Invoking content assist for NodeTemplate::type property");
      try {
        final List<String> importedModules = this.getImportedModules(model);
        final String module = this.getModule(model);
        importedModules.add(module);
        final ReasonerData<Type> policies = this.getKBReasoner().getPolicyTypes(importedModules);
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
              String _lastSegment = this.getLastSegment(policy.getModule(), "/");
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
          this.showReadPermissionErrorDialog();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public void completeEEvenFilter_Requirement(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final EEvenFilter filter = ((EEvenFilter) model);
    EPREFIX_REF _node = filter.getNode();
    boolean _tripleNotEquals = (_node != null);
    if (_tripleNotEquals) {
      String qnode = this.getNodeName(filter.getNode());
      final ENodeTemplate node = this.findNodeInModel(model, qnode);
      if ((node != null)) {
        final String module = this.getModule(model);
        this.createProposalsForRequirementsList(node.getNode().getRequirements().getRequirements(), module, "icons/requirement.png", context, acceptor);
      } else {
        super.completeEEvenFilter_Requirement(model, assignment, context, acceptor);
      }
    }
  }
  
  @Override
  public void completeEEvenFilter_Capability(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
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
  
  public String getAADMURI(final AADM_Model model) {
    try {
      final String filepath = model.eResource().getURI().toString().substring("platform:/resource".length());
      IWorkspaceRoot _root = ResourcesPlugin.getWorkspace().getRoot();
      Path _path = new Path(filepath);
      final IResource resource = _root.findMember(_path);
      final IProject project = resource.getProject();
      final java.nio.file.Path path = this.getAadmPropertiesFile(resource.toString(), project);
      String uri = null;
      boolean _exists = Files.exists(path);
      if (_exists) {
        final Properties props = new Properties();
        try (final FileChannel channel = new Function0<FileChannel>() {
          @Override
          public FileChannel apply() {
            try {
              return FileChannel.open(path, StandardOpenOption.READ);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        }.apply(); final FileLock lock = new Function0<FileLock>() {
          @Override
          public FileLock apply() {
            try {
              return channel.lock(0L, Long.MAX_VALUE, true);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        }.apply()) {
          props.load(Channels.newInputStream(channel));
        }
        uri = props.getProperty("URI");
      }
      return uri;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public java.nio.file.Path getAadmPropertiesFile(final String filepath, final IProject project) {
    int _lastIndexOf = filepath.lastIndexOf("/");
    int _plus = (_lastIndexOf + 1);
    final String filename = filepath.substring(_plus);
    int _indexOf = filepath.indexOf("/", 2);
    int _plus_1 = (_indexOf + 1);
    final String directory = filepath.substring(_plus_1, filepath.lastIndexOf("/"));
    final IFile propertiesFile = project.getFile((((directory + "/.") + filename) + ".properties"));
    String properties_path = propertiesFile.getLocationURI().toString();
    properties_path = properties_path.substring(properties_path.indexOf("/"));
    final java.nio.file.Path path = FileSystems.getDefault().getPath(properties_path);
    return path;
  }
  
  public List<ENodeTemplate> findLocalNodesForTypes(final SortedSet<String> types, final EObject reqAssign) {
    final List<ENodeTemplate> nodes = new ArrayList<ENodeTemplate>();
    boolean _isEmpty = types.isEmpty();
    if (_isEmpty) {
      return nodes;
    }
    Object _findModel = this.findModel(reqAssign);
    final AADM_Model model = ((AADM_Model) _findModel);
    EList<ENodeTemplate> _nodeTemplates = model.getNodeTemplates().getNodeTemplates();
    for (final ENodeTemplate node : _nodeTemplates) {
      {
        String _xifexpression = null;
        String _module = node.getNode().getType().getModule();
        boolean _tripleNotEquals = (_module != null);
        if (_tripleNotEquals) {
          String _module_1 = node.getNode().getType().getModule();
          _xifexpression = (_module_1 + "/");
        }
        String _type = node.getNode().getType().getType();
        final String node_id = (_xifexpression + _type);
        boolean _contains = types.contains(node_id);
        if (_contains) {
          nodes.add(node);
        }
      }
    }
    return nodes;
  }
  
  public List<ENodeTemplate> findLocalNodesForType(final String type, final EObject reqAssign) {
    try {
      final List<ENodeTemplate> nodes = new ArrayList<ENodeTemplate>();
      final Map<String, ENodeTemplate> candidateNodes = new HashMap<String, ENodeTemplate>();
      Object _findModel = this.findModel(reqAssign);
      final AADM_Model model = ((AADM_Model) _findModel);
      EList<ENodeTemplate> _nodeTemplates = model.getNodeTemplates().getNodeTemplates();
      for (final ENodeTemplate node : _nodeTemplates) {
        {
          String _xifexpression = null;
          String _module = node.getNode().getType().getModule();
          boolean _tripleNotEquals = (_module != null);
          if (_tripleNotEquals) {
            String _module_1 = node.getNode().getType().getModule();
            _xifexpression = (_module_1 + "/");
          }
          String _type = node.getNode().getType().getType();
          final String node_id = (_xifexpression + _type);
          candidateNodes.put(node_id, node);
        }
      }
      Set<String> _keySet = candidateNodes.keySet();
      final List<String> keys = new ArrayList<String>(_keySet);
      final List<String> validSubClasses = this.getKBReasoner().getSubClassesOf(keys, type);
      for (final String validClass : validSubClasses) {
        nodes.add(candidateNodes.get(validClass));
      }
      return nodes;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public List<ENodeTemplate> findLocalNodes(final EObject object) {
    ArrayList<ENodeTemplate> _xblockexpression = null;
    {
      Object _findModel = this.findModel(object);
      final AADM_Model model = ((AADM_Model) _findModel);
      ArrayList<ENodeTemplate> _xifexpression = null;
      if ((model != null)) {
        return model.getNodeTemplates().getNodeTemplates();
      } else {
        _xifexpression = new ArrayList<ENodeTemplate>();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public ENodeTemplate findNodeInModel(final EObject object, final String nodeName) {
    Object _findModel = this.findModel(object);
    final AADM_Model model = ((AADM_Model) _findModel);
    final String module = this.getModule(object);
    final String targetModule = nodeName.substring(0, nodeName.indexOf("/"));
    int _lastIndexOf = nodeName.lastIndexOf("/");
    int _plus = (_lastIndexOf + 1);
    final String targetNode = nodeName.substring(_plus);
    boolean _equals = module.equals(targetModule);
    boolean _not = (!_equals);
    if (_not) {
      return null;
    }
    EList<ENodeTemplate> _nodeTemplates = model.getNodeTemplates().getNodeTemplates();
    for (final ENodeTemplate node : _nodeTemplates) {
      boolean _equals_1 = node.getName().equals(targetNode);
      if (_equals_1) {
        return node;
      }
    }
    return null;
  }
  
  @Override
  public Object findModel(final EObject object) {
    EObject _eContainer = object.eContainer();
    boolean _equals = Objects.equal(_eContainer, null);
    if (_equals) {
      return null;
    } else {
      EObject _eContainer_1 = object.eContainer();
      if ((_eContainer_1 instanceof AADM_Model)) {
        return object.eContainer();
      } else {
        return this.findModel(object.eContainer());
      }
    }
  }
  
  @Override
  public String getModule(final EObject object) {
    Object _findModel = this.findModel(object);
    final AADM_Model model = ((AADM_Model) _findModel);
    return model.getModule();
  }
  
  @Override
  public List<String> getImportedModules(final EObject object) {
    final List<String> modules = new ArrayList<String>();
    Object _findModel = this.findModel(object);
    final AADM_Model model = ((AADM_Model) _findModel);
    EList<String> _imports = model.getImports();
    for (final String import_ : _imports) {
      modules.add(import_);
    }
    return modules;
  }
  
  public Object getNodeTemplate(final EObject object) {
    EObject _eContainer = object.eContainer();
    boolean _tripleEquals = (_eContainer == null);
    if (_tripleEquals) {
      return null;
    } else {
      EObject _eContainer_1 = object.eContainer();
      if ((_eContainer_1 instanceof ENodeTemplate)) {
        return object.eContainer();
      } else {
        return this.getNodeTemplate(object.eContainer());
      }
    }
  }
  
  public ENodeTemplate getEntityNode(final GetPropertyBodyImpl body) {
    final EEntityReference eEntityReference = body.getEntity();
    ENodeTemplate node = null;
    if ((eEntityReference instanceof EEntity)) {
      final EEntity eEntity = ((EEntity) eEntityReference);
      boolean _equals = eEntity.getEntity().equals("SELF");
      if (_equals) {
        Object _nodeTemplate = this.getNodeTemplate(body);
        node = ((ENodeTemplate) _nodeTemplate);
      }
    } else {
    }
    return node;
  }
  
  public ENodeTemplate findRequirementNodeInTemplate(final String requirement, final ENodeTemplate template) {
    ENodeTemplate node = null;
    ERequirementAssignments _requirements = template.getNode().getRequirements();
    boolean _tripleEquals = (_requirements == null);
    if (_tripleEquals) {
      return node;
    }
    EList<ERequirementAssignment> _requirements_1 = template.getNode().getRequirements().getRequirements();
    for (final ERequirementAssignment req : _requirements_1) {
      boolean _equals = req.getName().equals(requirement);
      if (_equals) {
        Object _findModel = this.findModel(template);
        final AADM_Model model = ((AADM_Model) _findModel);
        String module1 = model.getModule();
        if ((module1 == null)) {
          module1 = "";
        }
        String module2 = req.getNode().getModule();
        if ((module2 == null)) {
          module2 = "";
        }
        boolean _equals_1 = module1.equals(module2);
        if (_equals_1) {
          node = this.findNode(model, req.getNode().getId());
        } else {
        }
      }
    }
    return node;
  }
  
  public ECapabilityAssignment findCapabilityInTemplate(final String capabilityName, final ENodeTemplate template) {
    ECapabilityAssignment capability = null;
    ECapabilityAssignments _capabilities = template.getNode().getCapabilities();
    boolean _tripleEquals = (_capabilities == null);
    if (_tripleEquals) {
      return capability;
    }
    EList<ECapabilityAssignment> _capabilities_1 = template.getNode().getCapabilities().getCapabilities();
    for (final ECapabilityAssignment cap : _capabilities_1) {
      boolean _equals = cap.getName().equals(capabilityName);
      if (_equals) {
        capability = cap;
      }
    }
    return capability;
  }
  
  public ENodeTemplate findNode(final AADM_Model model, final String nodeName) {
    EList<ENodeTemplate> _nodeTemplates = model.getNodeTemplates().getNodeTemplates();
    for (final ENodeTemplate node : _nodeTemplates) {
      boolean _equals = node.getName().equals(nodeName);
      if (_equals) {
        return node;
      }
    }
    return null;
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
        if ((Objects.equal(rule.getName(), "ENodeTemplate") && Objects.equal(((KeywordImpl)keyword).getValue(), "attributes:"))) {
          return "An optional list of attribute value assignments for the Node Template.";
        } else {
          if ((Objects.equal(rule.getName(), "ENodeTemplate") && Objects.equal(((KeywordImpl)keyword).getValue(), "properties:"))) {
            return "An optional list of property value assignments for the Node Template.";
          } else {
            if ((Objects.equal(rule.getName(), "ENodeTemplate") && Objects.equal(((KeywordImpl)keyword).getValue(), "requirements:"))) {
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
}
