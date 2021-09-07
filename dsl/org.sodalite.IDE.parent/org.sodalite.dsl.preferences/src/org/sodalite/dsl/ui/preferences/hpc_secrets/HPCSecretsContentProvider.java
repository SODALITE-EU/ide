package org.sodalite.dsl.ui.preferences.hpc_secrets;

import java.util.Collection;

import org.eclipse.jface.viewers.IStructuredContentProvider;

public class HPCSecretsContentProvider implements IStructuredContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		Collection<HPCSecretData> coll = (Collection<HPCSecretData>) inputElement;
		return coll.toArray(new HPCSecretData[coll.size()]);
	}

}
