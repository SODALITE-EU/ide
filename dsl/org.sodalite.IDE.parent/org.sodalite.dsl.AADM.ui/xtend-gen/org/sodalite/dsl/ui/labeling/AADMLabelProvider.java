/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.EAttributeAssignment;
import org.sodalite.dsl.aADM.EAttributeAssignments;
import org.sodalite.dsl.aADM.ECapabilityAssignments;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ENodeTemplateBody;
import org.sodalite.dsl.aADM.ENodeTemplates;
import org.sodalite.dsl.aADM.EPolicies;
import org.sodalite.dsl.aADM.EPolicyDefinition;
import org.sodalite.dsl.aADM.EPolicyDefinitionBody;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.aADM.ERequirementAssignments;
import org.sodalite.dsl.aADM.ETarget;
import org.sodalite.dsl.aADM.ETriggerDefinitions;
import org.sodalite.dsl.rM.EInputs;
import org.sodalite.dsl.rM.EOutputs;
import org.sodalite.dsl.rM.EPREFIX_ID;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.rM.EPropertyAssignment;
import org.sodalite.dsl.rM.EPropertyAssignments;
import org.sodalite.dsl.rM.ETriggerDefinition;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class AADMLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public AADMLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public String text(final AADM_Model model) {
    String _xblockexpression = null;
    {
      String name = model.eResource().getURI().lastSegment();
      name = name.substring(0, name.lastIndexOf("."));
      _xblockexpression = ("AADM Model: " + name);
    }
    return _xblockexpression;
  }
  
  public String text(final EInputs entry) {
    return "inputs";
  }
  
  public String image(final EInputs entry) {
    return "inputs.png";
  }
  
  public String text(final EOutputs entry) {
    return "outputs";
  }
  
  public String image(final EOutputs entry) {
    return "outputs.png";
  }
  
  public String image(final EParameterDefinition entry) {
    String _xifexpression = null;
    EObject _eContainer = entry.eContainer();
    if ((_eContainer instanceof EInputs)) {
      _xifexpression = "input.png";
    } else {
      String _xifexpression_1 = null;
      EObject _eContainer_1 = entry.eContainer();
      if ((_eContainer_1 instanceof EOutputs)) {
        _xifexpression_1 = "output.png";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String text(final ENodeTemplates entry) {
    return "node_templates";
  }
  
  public String image(final ENodeTemplates entry) {
    return "templates.png";
  }
  
  public String text(final ETriggerDefinitions entry) {
    return "triggers";
  }
  
  public String image(final ETriggerDefinitions entry) {
    return "triggers.png";
  }
  
  public String text(final ETriggerDefinition entry) {
    return entry.getName();
  }
  
  public String image(final ETriggerDefinition entry) {
    return "trigger.png";
  }
  
  public String text(final ETarget entry) {
    return "targets";
  }
  
  public String image(final ETarget entry) {
    return "targets.png";
  }
  
  public String text(final EPolicies entry) {
    return "policies";
  }
  
  public String image(final EPolicies entry) {
    return "policies.png";
  }
  
  public String image(final ENodeTemplate entry) {
    return "template.png";
  }
  
  public String text(final ENodeTemplate entry) {
    return entry.getName();
  }
  
  public String image(final EPolicyDefinition entry) {
    return "policy.png";
  }
  
  public String text(final EPolicyDefinition entry) {
    return entry.getName();
  }
  
  public String text(final EPREFIX_TYPE type) {
    String _xifexpression = null;
    String _module = type.getModule();
    boolean _tripleNotEquals = (_module != null);
    if (_tripleNotEquals) {
      String _module_1 = type.getModule();
      String _plus = (_module_1 + "/");
      String _type = type.getType();
      _xifexpression = (_plus + _type);
    } else {
      _xifexpression = type.getType();
    }
    return _xifexpression;
  }
  
  public String text(final EPREFIX_ID id) {
    String _xifexpression = null;
    String _module = id.getModule();
    boolean _tripleNotEquals = (_module != null);
    if (_tripleNotEquals) {
      String _module_1 = id.getModule();
      String _plus = (_module_1 + "/");
      String _id = id.getId();
      _xifexpression = (_plus + _id);
    } else {
      _xifexpression = id.getId();
    }
    return _xifexpression;
  }
  
  public String renderType(final EPREFIX_TYPE type) {
    String _xifexpression = null;
    String _module = type.getModule();
    boolean _tripleNotEquals = (_module != null);
    if (_tripleNotEquals) {
      String _module_1 = type.getModule();
      String _plus = (_module_1 + "/");
      String _type = type.getType();
      _xifexpression = (_plus + _type);
    } else {
      _xifexpression = type.getType();
    }
    return _xifexpression;
  }
  
  public String image(final EPropertyAssignments entry) {
    return "properties.png";
  }
  
  public String text(final EPropertyAssignments entry) {
    return "properties";
  }
  
  public String image(final EPropertyAssignment entry) {
    return "property.png";
  }
  
  public String text(final EAttributeAssignments entry) {
    return "attributes";
  }
  
  public String image(final EAttributeAssignments entry) {
    return "attributes.png";
  }
  
  public String image(final EAttributeAssignment entry) {
    return "attribute.png";
  }
  
  public String text(final ERequirementAssignments entry) {
    return "requirements";
  }
  
  public String image(final ERequirementAssignments entry) {
    return "requirements.png";
  }
  
  public String image(final ERequirementAssignment entry) {
    return "requirement.png";
  }
  
  public String text(final ECapabilityAssignments entry) {
    return "capabilities";
  }
  
  public String image(final ECapabilityAssignments entry) {
    return "capabilities.png";
  }
  
  public String image(final EPREFIX_TYPE entry) {
    String _xifexpression = null;
    EObject _eContainer = entry.eContainer();
    if ((_eContainer instanceof ENodeTemplateBody)) {
      _xifexpression = "type.png";
    } else {
      String _xifexpression_1 = null;
      EObject _eContainer_1 = entry.eContainer();
      if ((_eContainer_1 instanceof EPolicyDefinitionBody)) {
        _xifexpression_1 = "type.png";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public String image(final EPREFIX_ID entry) {
    String _xifexpression = null;
    EObject _eContainer = entry.eContainer();
    if ((_eContainer instanceof ERequirementAssignment)) {
      _xifexpression = "template.png";
    } else {
      String _xifexpression_1 = null;
      EObject _eContainer_1 = entry.eContainer();
      if ((_eContainer_1 instanceof ETarget)) {
        _xifexpression_1 = "target.png";
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
