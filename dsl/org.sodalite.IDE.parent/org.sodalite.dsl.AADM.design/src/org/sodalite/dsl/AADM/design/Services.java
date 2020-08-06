package org.sodalite.dsl.AADM.design;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.EAttributeAssignment;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ENodeTemplateBody;
import org.sodalite.dsl.aADM.ENodeTemplates;
import org.sodalite.dsl.aADM.EPropertyAssignment;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.rM.ELIST;
import org.sodalite.dsl.rM.EMAP;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.rM.ESTRING;
import org.sodalite.dsl.rM.GetInput;

/**
 * The services class used by VSM.
 */
public class Services {
    
    public String getPropertyLabel(EPropertyAssignment property) {
    	String result = property.getName();
    	if (property.getValue() instanceof ESTRING) {
    		ESTRING value = (ESTRING) property.getValue();
    		result += ": " + value.getString();
    	} else if (property.getValue() instanceof GetInput){
    		GetInput gInput = (GetInput) property.getValue();
    		result += ": getInput(" + gInput.getInput().getName() + ")";
    	} else if (property.getValue() instanceof ELIST) {
    		ELIST value = (ELIST) property.getValue();
    		EList list = value.getList();
    		result += ": [" + list.get(0);
    		for (int i=1; i<list.size(); i++)
    			result += ", " + list.get(i);
    		result += "]";
    	} else if (property.getValue() instanceof EMAP) {
    		result += ": <Complex Value>";
    	}
    	
    	return result;
    }
    
    public String getAttributeLabel(EAttributeAssignment attribute) {
    	return attribute.getName() +  ": " + attribute.getValue();
    }
    
    public String getRequirementLabel(ERequirementAssignment requirement) {
        return requirement.getName() + ": [ node: " + requirement.getNode().getName() + "]";
    }
    
    public String getTypeLabel(ENodeTemplateBody node) {
    	String type = node.getType();
    	return type.substring(type.lastIndexOf('.') + 1);
    }
    
    public String getTypeDescription(ENodeTemplateBody node) {
    	return "description: " + node.getDescription();
    }
    
    public int getTypeSize(ENodeTemplateBody node) {
    	String type = node.getType();
    	int size = type.substring(type.lastIndexOf('.') + 1).length();
    	return size;
    }
    
    public void addStringToPropertyValueList (EPropertyAssignment prop) {
    	System.out.println ("Requested to add string to property list value. Property: " +
    		prop.getName());
    }
    
    public void addItemToPropertyValueList (ELIST list, String item) {
    	System.out.println ("Requested to add item to property list value. List: " +
    		list + ". Item: " + item);
    	list.getList().add(item);
    }
    
    public void cancelAddItemToPropertyValueList (ELIST list, Integer size) {
    	System.out.println ("Requested to cancel the addition of item to property list value. List: " +
    		list + ". Default size: " + size);
    	if (list.getList().size() != size)
    		list.getList().remove(size);
    }
    
    public void removeItemFromPropertyValueList (EPropertyAssignment prop, String item) {
    	System.out.println ("Requested to remove item from property list value. Property: " +
    		prop.getName() + " Item: " + item);
    	if (prop.getValue() instanceof ELIST) {
    		((ELIST)prop.getValue()).getList().remove(item);
    	}
    }
    
    public void editItemInPropertyValueList (ELIST list, Integer index, String newValue, String oldValue) {
    	System.out.println ("Requested to edit an item in a property list value. List: " + list 
    			+ ". Index: " + index + ". NewValue: " + newValue + ". OldValue: " + oldValue);
    	list.getList().set(index - 1, newValue);
    }
    
    public List<ENodeTemplate> getNodes (ERequirementAssignment req){
    	ENodeTemplates container = (ENodeTemplates) req.eContainer().eContainer().eContainer().eContainer();
    	return container.getNodeTemplates();
    }
    
    public List<String> getInputs(EPropertyAssignment prop){
    	List<String> result = new ArrayList<>();
    	AADM_Model model = findModel(prop);
    	for (EParameterDefinition input: model.getInputs().getInputs()) {
    		result.add(input.getName());
    	}
    	return result;
    }
    
    private AADM_Model findModel(EObject obj) {
    	EObject container = obj.eContainer();
    	while (container != null && !(container instanceof AADM_Model)) {
    		container = container.eContainer();
    	}
    	return (AADM_Model) container;
	}
    
}
