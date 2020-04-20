package org.sodalite.dsl.ui.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.preferences.ScopedPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		ScopedPreferenceStore store = 
	        	new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.sodalite.dsl.AADM.ui");
		
		store.setDefault(PreferenceConstants.KB_REASONER_URI, "http://160.40.52.200:8084/reasoner-api/v0.6/");
		store.setDefault(PreferenceConstants.IaC_URI, "http://154.48.185.202:8080/");
		store.setDefault(PreferenceConstants.xOPERA_URI, "http://154.48.185.206:5000/");
	}

}