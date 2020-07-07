package org.sodalite.dsl.AADM.design;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.preference.IPreferenceStore;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.types.Node;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return types;
    }
    
}
