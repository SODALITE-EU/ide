package org.sodalite.dsl.ui.preferences.hpc_secrets;

import java.util.Collection;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.sodalite.dsl.kb_reasoner_client.types.HPCSecretData;

public class HPCSecretsContentProvider implements IStructuredContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		Collection<HPCSecretData> coll = (Collection<HPCSecretData>) inputElement;
		return coll.toArray(new HPCSecretData[coll.size()]);
	}

}
