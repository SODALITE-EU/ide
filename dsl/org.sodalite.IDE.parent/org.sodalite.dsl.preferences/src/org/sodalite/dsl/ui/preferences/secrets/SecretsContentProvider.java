package org.sodalite.dsl.ui.preferences.secrets;

import java.util.Collection;

import org.eclipse.jface.viewers.IStructuredContentProvider;

public class SecretsContentProvider implements IStructuredContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		Collection<SecretData> coll = (Collection<SecretData>) inputElement;
		return coll.toArray(new SecretData[coll.size()]);
	}

}
