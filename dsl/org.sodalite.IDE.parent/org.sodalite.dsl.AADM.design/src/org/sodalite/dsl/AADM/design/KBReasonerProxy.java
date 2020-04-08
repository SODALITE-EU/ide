package org.sodalite.dsl.AADM.design;

import java.util.ArrayList;
import java.util.List;

import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.kb_reasoner_client.KBReasoner;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.Node;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;

/**
 * The services class used by VSM.
 */
public class KBReasonerProxy {
    
    public List<String> getTypes(ENodeTemplate node){
    	List<String> types = new ArrayList<>();
    	KBReasoner kbclient = new KBReasonerClient();
		try {
			ReasonerData<Node> nodes = kbclient.getNodes();
			for (Node n: nodes.getElements()){
				types.add(n.getLabel());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return types;
    }
    
}
