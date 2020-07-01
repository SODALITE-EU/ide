package org.sodalite.dsl.ui.preferences;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {
	private static final Bundle BUNDLE = FrameworkUtil.getBundle(PreferenceInitializer.class);
	private static final ILog LOGGER = Platform.getLog(BUNDLE);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		// Read default values from a properties file located in default Eclipse root
		// installation
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

		LOGGER.log(new Status(Status.INFO, BUNDLE.getSymbolicName(), MessageFormat.format(
				"Default Sodalite backend services configuration read from properties: KB_Reasoner endpoint: {0}, IaC endpoint: {1}, xOpera endpoint: {2}",
				kb_reasoner_uri, iac_uri, xOpera_uri)));

		ScopedPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.sodalite.dsl.preferences");

		store.setDefault(PreferenceConstants.KB_REASONER_URI, kb_reasoner_uri);
		store.setDefault(PreferenceConstants.IaC_URI, iac_uri);
		store.setDefault(PreferenceConstants.xOPERA_URI, xOpera_uri);
	}

	private Properties readDefaultProperties() {
		String eclipseExecutablePath = System.getProperty("eclipse.launcher");
		String propertiesPath = eclipseExecutablePath.substring(0, eclipseExecutablePath.lastIndexOf('/') + 1)
				+ "sodalite.properties";
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream(propertiesPath)) {
			prop.load(input);
		} catch (IOException ex) {
			LOGGER.log(new Status(Status.ERROR, BUNDLE.getSymbolicName(),
					"Could not read configuration for Sodalite backend services", ex));
		}
		return prop;
	}

}