package org.sodalite.dsl.AADM.design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

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
import org.sodalite.dsl.rM.EEntity;
import org.sodalite.dsl.rM.EEntityReference;
import org.sodalite.dsl.rM.EFLOAT;
import org.sodalite.dsl.rM.ELIST;
import org.sodalite.dsl.rM.EMAP;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.rM.ESIGNEDINT;
import org.sodalite.dsl.rM.ESTRING;
import org.sodalite.dsl.rM.GetInput;
import org.sodalite.dsl.rM.GetProperty;
import org.sodalite.dsl.rM.GetPropertyBody;
import org.sodalite.dsl.rM.RMFactory;
import org.sodalite.dsl.scoping.AADMScopeProvider;

/**
 * The services class used by VSM.
 */
public class Services {

	public String getPropertyLabel(EPropertyAssignment property) {
		String result = property.getName();
		if (property.getValue() instanceof ESTRING) {
			ESTRING value = (ESTRING) property.getValue();
			result += ": " + value.getValue();
		} else if (property.getValue() instanceof GetInput) {
			GetInput gInput = (GetInput) property.getValue();
			result += ": getInput(" + gInput.getInput().getName() + ")";
		} else if (property.getValue() instanceof GetProperty) {
			GetProperty gProperty = (GetProperty) property.getValue();
			result += ": getProperty(" + gProperty.getProperty().getProperty().getType() + ")";
		} else if (property.getValue() instanceof ELIST) {
			ELIST value = (ELIST) property.getValue();
			EList list = value.getList();
			result += ": [" + renderValue(list.get(0));
			for (int i = 1; i < list.size(); i++)
				result += ", " + renderValue(list.get(i));
			result += "]";
		} else if (property.getValue() instanceof EMAP) {
			result += ": <Complex Value>";
		}

		return result;
	}

	private String renderValue(Object eanValue) {
		String value = null;
		if (eanValue instanceof ESTRING)
			value = ((ESTRING) eanValue).getValue();
		else if (eanValue instanceof EFLOAT)
			value = String.valueOf(((EFLOAT) eanValue).getValue());
		else if (eanValue instanceof ESIGNEDINT)
			value = String.valueOf(((ESIGNEDINT) eanValue).getValue());
		return value;
	}

	public String getAttributeLabel(EAttributeAssignment attribute) {
		return attribute.getName() + ": " + attribute.getValue();
	}

	public String getRequirementLabel(ERequirementAssignment requirement) {
		return requirement.getName() + ": [ node: " + requirement.getNode() + "]";
	}

	public String getTypeLabel(ENodeTemplateBody node) {
		String type = (node.getType().getModule() != null ? node.getType().getModule() + "/" : "")
				+ node.getType().getType();
		return type.substring(type.lastIndexOf('.') + 1);
	}

	public String getTypeDescription(ENodeTemplateBody node) {
		return "description: " + node.getDescription();
	}

	public int getTypeSize(ENodeTemplateBody node) {
		String type = (node.getType().getModule() != null ? node.getType().getModule() + "/" : "")
				+ node.getType().getType();
		int size = type.substring(type.lastIndexOf('.') + 1).length();
		return size;
	}

	public void addStringToPropertyValueList(EPropertyAssignment prop) {
		System.out.println("Requested to add string to property list value. Property: " + prop.getName());
	}

	public void addItemToPropertyValueList(ELIST list, String item) {
		System.out.println("Requested to add item to property list value. List: " + list + ". Item: " + item);
		ESTRING eString = RMFactory.eINSTANCE.createESTRING();
		eString.setValue(item);
		list.getList().add(eString);
	}

	public void cancelAddItemToPropertyValueList(ELIST list, Integer size) {
		System.out.println("Requested to cancel the addition of item to property list value. List: " + list
				+ ". Default size: " + size);
		if (list.getList().size() != size)
			list.getList().remove(size);
	}

	public void removeItemFromPropertyValueList(EPropertyAssignment prop, String item) {
		System.out.println(
				"Requested to remove item from property list value. Property: " + prop.getName() + " Item: " + item);
		if (prop.getValue() instanceof ELIST) {
			((ELIST) prop.getValue()).getList().remove(item);
		}
	}

	public void editItemInPropertyValueList(ELIST list, Integer index, String newValue, String oldValue) {
		System.out.println("Requested to edit an item in a property list value. List: " + list + ". Index: " + index
				+ ". NewValue: " + newValue + ". OldValue: " + oldValue);
		ESTRING eString = RMFactory.eINSTANCE.createESTRING();
		eString.setValue(newValue);
		list.getList().set(index - 1, eString);
	}

	public List<String> getNodes(ERequirementAssignment req) {
		ENodeTemplates container = (ENodeTemplates) req.eContainer().eContainer().eContainer().eContainer();
		return container.getNodeTemplates().stream().map(ENodeTemplate::getName).collect(Collectors.toList());
	}

	public List<String> getInputs(EPropertyAssignment prop) {
		List<String> result = new ArrayList<>();
		AADM_Model model = AADM_Helper.findModel(prop);
		for (EParameterDefinition input : model.getInputs().getInputs()) {
			result.add(input.getName());
		}
		return result;
	}

	public Set<String> getOptimizations(ENodeTemplate node) {
		return AADMScopeProvider.getOptimizationModels();
	}

	public Set<String> getDataTypes(EParameterDefinition par) {
		return AADMScopeProvider.getDataTypes();
	}

	public ENodeTemplate findNode(ERequirementAssignment req) {
		System.out.println("Invoked findNode with req: " + req);
		return AADM_Helper.findNode(req, req.getNode().getId());
	}

	public String renderRequirementNode(ERequirementAssignment req) throws Exception {
		return AADM_Helper.renderPrefixId(req.getNode());
	}

	public String renderNodeType(ENodeTemplate node) throws Exception {
		return AADM_Helper.renderType(node.getNode().getType());
	}

	public String renderListItem(EObject object, EObject item) throws Exception {
		if (item instanceof ESTRING)
			return ((ESTRING) item).getValue();
		else if (item instanceof ESIGNEDINT)
			return String.valueOf(((ESIGNEDINT) item).getValue());
		else
			return "UNRENDERED_VALUE";
	}

	public SortedSet<String> getPropertyEntities(EPropertyAssignment property) {
		return new TreeSet<String>(Arrays.asList(new String[] { "SELF", "SOURCE", "TARGET", "HOST" }));
	}

	public String renderGetPropertyReq_Cap(EPropertyAssignment property) {
		EPREFIX_TYPE req_cap = ((GetProperty) property.getValue()).getProperty().getReq_cap();
		return AADM_Helper.renderType(req_cap);
	}

	public String renderGetPropertyProperty(EPropertyAssignment property) {
		EPREFIX_TYPE prop = ((GetProperty) property.getValue()).getProperty().getProperty();
		return AADM_Helper.renderType(prop);
	}

	public SortedSet<String> getPropertyReq_Cap(EPropertyAssignment property) {
		SortedSet<String> proposals = new TreeSet<String>();
		String module = AADM_Helper.getModule(property);
		// Get entity in this GetProperty body. If null, return
		ENodeTemplate node = getEntity(property);

		if (node == null)
			return proposals;

		// Find requirements and capability assignments defined within the entity
		if (node.getNode().getRequirements() != null)
			for (ERequirementAssignment req : node.getNode().getRequirements().getRequirements()) {
				proposals.add(module + '/' + node.getName() + '.' + req.getName());
			}

		if (node.getNode().getCapabilities() != null)
			for (ECapabilityAssignment cap : node.getNode().getCapabilities().getCapabilities()) {
				proposals.add(module + '/' + node.getName() + '.' + cap.getName());
			}

		return proposals;
	}

	public SortedSet<String> getPropertyProperty(EPropertyAssignment property) {
		SortedSet<String> proposals = new TreeSet<String>();
		String module = AADM_Helper.getModule(property);
		// Get entity in this GetProperty body. If null, return
		ENodeTemplate node = getEntity(property);
		GetPropertyBody body = ((GetProperty) property.getValue()).getProperty();
		// Get the properties defined within the selected node requirements or
		// capabilities
		if (body.getReq_cap() != null) {
			String req_cap_name = AADM_Helper.getLastSegment(body.getReq_cap().getType(), ".");
			ENodeTemplate req_node = AADM_Helper.findRequirementNodeInTemplate(req_cap_name, node);
			if (req_node != null)
				for (EPropertyAssignment prop : req_node.getNode().getProperties().getProperties())
					proposals.add(module + '/' + req_node.getName() + "." + prop.getName());
			// else
			// TODO Find requirement node in KB
			ECapabilityAssignment cap = AADM_Helper.findCapabilityInTemplate(req_cap_name, node);
			if (cap != null)
				for (EPropertyAssignment prop : cap.getProperties().getProperties())
					proposals.add(prop.getName());
		} else {
			// Get the properties defined within the entity
			for (EPropertyAssignment prop : node.getNode().getProperties().getProperties())
				proposals.add(prop.getName());
		}

		return proposals;
	}

	private ENodeTemplate getEntity(EPropertyAssignment property) {
		GetPropertyBody body = ((GetProperty) property.getValue()).getProperty();
		EEntityReference eEntityReference = body.getEntity();
		ENodeTemplate entity = null;
		if (eEntityReference instanceof EEntity) {
			EEntity eEntity = (EEntity) eEntityReference;
			if (eEntity.getEntity().equals("SELF")) {
				entity = (ENodeTemplate) AADM_Helper.getNodeTemplate(property);
			}
		} else {
			// TODO Support other entities: TARGET, HOST, SOURCE, concrete entity
		}
		return entity;
	}
}
