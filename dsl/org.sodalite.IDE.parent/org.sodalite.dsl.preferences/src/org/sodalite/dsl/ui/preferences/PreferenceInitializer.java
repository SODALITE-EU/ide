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
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.service.prefs.Preferences;

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
			// kb_reasoner_uri = "http://160.40.52.200:8084/reasoner-api/v0.6/"; //CERTH
			kb_reasoner_uri = "http://192.168.2.97:8080/reasoner-api/v0.6/"; // TestBed

		String iac_uri = prop.getProperty(PreferenceConstants.IaC_URI);
		if (iac_uri == null)
			iac_uri = "http://192.168.2.107:8081/";

		String image_builder_uri = prop.getProperty(PreferenceConstants.Image_Builder_URI);
		if (image_builder_uri == null)
			image_builder_uri = "http://192.168.2.70:5000/";

		String xOpera_uri = prop.getProperty(PreferenceConstants.xOPERA_URI);
		if (xOpera_uri == null)
			xOpera_uri = "http://192.168.2.18:5000/";

		String pds_uri = prop.getProperty(PreferenceConstants.PDS_URI);
		if (pds_uri == null)
			pds_uri = "http://192.168.2.178:8089/";

		String refactorer_uri = prop.getProperty(PreferenceConstants.Refactorer_URI);
		if (refactorer_uri == null)
			refactorer_uri = "http://192.168.2.166:8080/";

		String nifi_uri = prop.getProperty(PreferenceConstants.NIFI_URI);
		if (nifi_uri == null)
			nifi_uri = "https://nifi01.nifi.cluster:9543/";

		String consul_ip = prop.getProperty(PreferenceConstants.Consul_IP);
		if (consul_ip == null)
			consul_ip = "192.168.3.74";

		String grafana_registry_uri = prop.getProperty(PreferenceConstants.Grafana_Registry_URI);
		if (grafana_registry_uri == null)
			grafana_registry_uri = "http://192.168.3.74:3001/";

		String grafana_uri = prop.getProperty(PreferenceConstants.Grafana_URI);
		if (grafana_uri == null)
			grafana_uri = "http://192.168.3.74:3000/";

		String rulesServer_uri = prop.getProperty(PreferenceConstants.RulesServer_URI);
		if (rulesServer_uri == null)
			rulesServer_uri = "http://192.168.3.74:9092/";

		String skydive_analyzer_uri = prop.getProperty(PreferenceConstants.SKYDIVE_ANALYZER_URI);
		if (skydive_analyzer_uri == null)
			skydive_analyzer_uri = "192.168.2.11:8088";

		String vault_secret_uploader_uri = prop.getProperty(PreferenceConstants.VAULT_SECRET_UPLOADER_URI);
		if (vault_secret_uploader_uri == null)
			vault_secret_uploader_uri = "http://192.168.3.74:8202";

		String keycloak_uri = prop.getProperty(PreferenceConstants.KEYCLOAK_URI);
		if (keycloak_uri == null)
			keycloak_uri = "http://192.168.2.53:8080/";

		String keycloak_client_id = prop.getProperty(PreferenceConstants.KEYCLOAK_CLIENT_ID);
		if (keycloak_client_id == null)
			keycloak_client_id = "sodalite-ide";

		String keycloak_client_secret = prop.getProperty(PreferenceConstants.KEYCLOAK_CLIENT_SECRET);
		if (keycloak_client_secret == null)
			keycloak_client_secret = "1a1083bc-c183-416a-9192-26076f605cc3";

		Boolean keycloak_enabled = Boolean.valueOf(prop.getProperty(PreferenceConstants.KEYCLOAK_ENABLED));
		if (!keycloak_enabled) {
			keycloak_enabled = true;
		}

		LOGGER.log(new Status(Status.INFO, BUNDLE.getSymbolicName(),
				MessageFormat.format("Default Sodalite backend services configuration read from properties: "
						+ "KB_Reasoner endpoint: {0}, IaC Builder endpoint: {1}, Image Builder endpoint: {2},"
						+ " xOpera endpoint: {3}, Keycloak endpoint: {4}, PDS endpoint: {5}, Refactorer endpoint: {6}, NIFI endpoint: {7}",
						kb_reasoner_uri, iac_uri, image_builder_uri, xOpera_uri, keycloak_uri, pds_uri, refactorer_uri,
						nifi_uri)));

		Preferences defaults = DefaultScope.INSTANCE.getNode(Activator.PLUGIN_ID);
		defaults.put(PreferenceConstants.KB_REASONER_URI, kb_reasoner_uri);
		defaults.put(PreferenceConstants.IaC_URI, iac_uri);
		defaults.put(PreferenceConstants.Image_Builder_URI, image_builder_uri);
		defaults.put(PreferenceConstants.xOPERA_URI, xOpera_uri);
		defaults.put(PreferenceConstants.PDS_URI, pds_uri);
		defaults.put(PreferenceConstants.Refactorer_URI, refactorer_uri);
		defaults.put(PreferenceConstants.NIFI_URI, nifi_uri);
		defaults.put(PreferenceConstants.Consul_IP, consul_ip);
		defaults.put(PreferenceConstants.Grafana_Registry_URI, grafana_registry_uri);
		defaults.put(PreferenceConstants.Grafana_URI, grafana_uri);
		defaults.put(PreferenceConstants.RulesServer_URI, rulesServer_uri);
		defaults.put(PreferenceConstants.SKYDIVE_ANALYZER_URI, skydive_analyzer_uri);
		defaults.put(PreferenceConstants.VAULT_SECRET_UPLOADER_URI, vault_secret_uploader_uri);
		defaults.put(PreferenceConstants.KEYCLOAK_URI, keycloak_uri);
		defaults.put(PreferenceConstants.KEYCLOAK_CLIENT_ID, keycloak_client_id);
		defaults.put(PreferenceConstants.KEYCLOAK_CLIENT_SECRET, keycloak_client_secret);
		defaults.put(PreferenceConstants.KEYCLOAK_ENABLED, Boolean.toString(keycloak_enabled));
	}

	private Properties readDefaultProperties() {
		String eclipseExecutablePath = System.getProperty("eclipse.launcher");
		String propertiesPath = eclipseExecutablePath.substring(0, eclipseExecutablePath.lastIndexOf('/') + 1)
				+ "sodalite.properties";
		Properties prop = new Properties();
		try (InputStream input = new FileInputStream(propertiesPath)) {
			prop.load(input);
		} catch (IOException ex) {
			LOGGER.log(new Status(Status.WARNING, BUNDLE.getSymbolicName(),
					"Could not read configuration for Sodalite backend services", ex));
		}
		return prop;
	}

}