package org.sodalite.dsl.ui.preferences;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
		//Read default values from a properties file located in default Eclipse root installation
		Properties prop = readDefaultProperties();
		String kb_reasoner_uri = prop.getProperty(PreferenceConstants.KB_REASONER_URI);
		if (kb_reasoner_uri == null)
			kb_reasoner_uri = "http://160.40.52.200:8084/reasoner-api/v0.6/";
		String iac_uri = prop.getProperty(PreferenceConstants.IaC_URI);
		if (iac_uri == null)
			iac_uri = "http://154.48.185.202:8080/";
		String xOpera_uri = prop.getProperty(PreferenceConstants.xOPERA_URI);
		if (xOpera_uri == null)
			xOpera_uri = "http://154.48.185.206:5000/";
		
		ScopedPreferenceStore store = 
	        	new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.sodalite.dsl.preferences");
		
		store.setDefault(PreferenceConstants.KB_REASONER_URI, kb_reasoner_uri);
		store.setDefault(PreferenceConstants.IaC_URI, iac_uri);
		store.setDefault(PreferenceConstants.xOPERA_URI, xOpera_uri);
	}
	
	private Properties readDefaultProperties() {
		String eclipseExecutablePath = System.getProperty("eclipse.launcher");
		String propertiesPath = eclipseExecutablePath.substring(0, eclipseExecutablePath.lastIndexOf('/') + 1) + "sodalite.properties";
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream(propertiesPath)) {
            prop.load(input);
        } catch (IOException ex) {
            System.out.println("sodalite.properties could not be found in Eclipse installation root folder");
        }
		return prop;
	}

}