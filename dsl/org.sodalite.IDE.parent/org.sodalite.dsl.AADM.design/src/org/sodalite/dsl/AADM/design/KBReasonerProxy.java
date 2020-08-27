package org.sodalite.dsl.AADM.design;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.EAttributeAssignment;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ENodeTemplateBody;
import org.sodalite.dsl.aADM.EPropertyAssignment;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.Attribute;
import org.sodalite.dsl.kb_reasoner_client.types.Capability;
import org.sodalite.dsl.kb_reasoner_client.types.Node;
import org.sodalite.dsl.kb_reasoner_client.types.Property;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.Requirement;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNode;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;

/**
 * The services class used by VSM.
 */
public class KBReasonerProxy {

	private KBReasonerClient getKBReasoner() {
		// Configure KBReasonerClient endpoint from preference page information
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		String kbReasonerURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		String iacURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		String xoperaURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		KBReasonerClient kbclient = new KBReasonerClient(kbReasonerURI, iacURI, xoperaURI);
		System.out.println(
				MessageFormat.format("Sodalite backend configured with [KB Reasoner API: {0}, IaC API: {1}, xOpera {2}",
						kbReasonerURI, iacURI, xoperaURI));
		return kbclient;
	}
    
    public List<String> getTypes(ENodeTemplate node){
    	List<String> types = new ArrayList<>();
		try {
			ReasonerData<Node> nodes = getKBReasoner().getNodes();
			for (Node n: nodes.getElements()){
				types.add(n.getLabel());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    	return types;
    }
    
    public List<String> getAttributes(EAttributeAssignment attr){
    	List<String> result = new ArrayList<>();
		try {
			String type = findContainerType(attr);
			if (type == null)
				return result;
			ReasonerData<Attribute> attributes = getKBReasoner().getAttributes(type);
			for (Attribute a: attributes.getElements()){
				String label = a.getUri().toString().substring(
						a.getUri().toString().lastIndexOf('/') + 1, 
						a.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    	return result;
    }
    
    public List<String> getProperties(EPropertyAssignment prop){
    	List<String> result = new ArrayList<>();
		try {
			String type = findContainerType(prop);
			if (type == null)
				return result;
			ReasonerData<Property> properties = getKBReasoner().getProperties(type);
			for (Property p: properties.getElements()){
				String label = p.getUri().toString().substring(
						p.getUri().toString().lastIndexOf('/') + 1, 
						p.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    	return result;
    }

	public List<String> getCapabilities(ECapabilityAssignment cap){
    	List<String> result = new ArrayList<>();
		try {
			String type = findContainerType(cap);
			if (type == null)
				return result;
			ReasonerData<Capability> capabilities = getKBReasoner().getCapabilities(type);
			for (Capability c: capabilities.getElements()){
				String label = c.getUri().toString().substring(
						c.getUri().toString().lastIndexOf('/') + 1, 
						c.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    	return result;
    }
    
    public List<String> getRequirements(ERequirementAssignment req){
    	List<String> result = new ArrayList<>();
		try {
			String type = findContainerType(req);
			if (type == null)
				return result;
			ReasonerData<Requirement> requirements = getKBReasoner().getRequirements(type);
			for (Requirement r: requirements.getElements()){
				String label = r.getUri().toString().substring(
						r.getUri().toString().lastIndexOf('/') + 1, 
						r.getUri().toString().length());
				result.add(label);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
    	return result;
    }
    
    
    public SortedSet<String> getRequirementNodes(ERequirementAssignment req) throws Exception{
    	SortedSet<String> result = new TreeSet<String>();
    	SortedSet<String> types = new TreeSet<String>();
    	String nodeType = ((ENodeTemplateBody)req.eContainer().eContainer()).getType();
    	ValidRequirementNodeData vrnd = getKBReasoner().getValidRequirementNodes(req.getName(), nodeType);
		if (vrnd != null){
			System.out.println ("Valid requirement nodes retrieved from KB for requirement: " + req.getName());
			for (ValidRequirementNode vrn: vrnd.getElements()){
				types.add(vrn.getType().getLabel());
				System.out.println ("Valid requirement node: " + vrn.getLabel());
				result.add (vrn.getLabel());
			}
		}
		
		//Find local nodes that belongs to suggested types
		List<ENodeTemplate> localnodes = findLocalNodesForTypes(types, req);
		for (ENodeTemplate node: localnodes){
			System.out.println ("Valid requirement local node: " + node.getName());
			result.add(node.getName());
		}
		return result;
    }
    
    public List<String> getDataTypes(EParameterDefinition par){
    	//TODO implement it
    	throw new UnsupportedOperationException();
    }
    
    private String findContainerType(EObject obj) {
    	EObject container = obj.eContainer().eContainer();
    	if (container instanceof ENodeTemplateBody)
    		return ((ENodeTemplateBody) container).getType();
    	else if (container instanceof ECapabilityAssignment) {
    		ECapabilityAssignment cap = (ECapabilityAssignment) container;
    		return findCapabilityType(cap);
    	}else
    		return null;
	}
    
    private String findCapabilityType(ECapabilityAssignment cap){
    	String result = null;
		try {
			String type = findContainerType(cap);
			if (type == null)
				return result;
			ReasonerData<Capability> capabilities = getKBReasoner().getCapabilities(type);
			for (Capability c: capabilities.getElements()){
				String label = c.getUri().toString().substring(
						c.getUri().toString().lastIndexOf('/') + 1, 
						c.getUri().toString().length());
				if (label.equals(cap.getName()))
					return c.getType().getLabel();
			}
		} catch (Exception e) {
			e.printStackTrace();
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
	
	private List<ENodeTemplate> findLocalNodesForTypes(SortedSet<String> types, EObject reqAssign) {
		List<ENodeTemplate> nodes = new ArrayList<ENodeTemplate>();
		AADM_Model model = (AADM_Model) findModel(reqAssign);
		for (ENodeTemplate node: model.getNodeTemplates().getNodeTemplates()){
			if (types.contains(node.getNode().getType()))
				nodes.add(node);
		}
		return nodes;
	}
    
}
