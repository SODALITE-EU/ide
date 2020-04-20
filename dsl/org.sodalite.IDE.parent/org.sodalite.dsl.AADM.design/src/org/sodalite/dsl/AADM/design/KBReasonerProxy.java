package org.sodalite.dsl.AADM.design;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.kb_reasoner_client.KBReasoner;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.Node;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;

/**
 * The services class used by VSM.
 */
public class KBReasonerProxy {
	private KBReasoner kbclient;
	
	public KBReasonerProxy() {
		IPreferenceStore store = 
	        new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.sodalite.dsl.AADM.ui");
		String kbReasonerURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		String iacURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		String xoperaURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		kbclient = new KBReasonerClient(kbReasonerURI, iacURI, xoperaURI);
		System.out.println (
			MessageFormat.format(
				"Sodalite backend configured with [KB Reasoner API: {0}, IaC API: {1}, xOpera {2}", kbReasonerURI, iacURI, xoperaURI)
		);
	}
    
    public List<String> getTypes(ENodeTemplate node){
    	List<String> types = new ArrayList<>();
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
