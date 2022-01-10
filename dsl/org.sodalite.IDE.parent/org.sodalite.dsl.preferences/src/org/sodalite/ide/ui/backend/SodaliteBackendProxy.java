package org.sodalite.ide.ui.backend;

import java.text.MessageFormat;

import org.eclipse.jface.preference.IPreferenceStore;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class SodaliteBackendProxy {
	private static KBReasonerClient kbReasonerClient = null;

	public static KBReasonerClient getKBReasoner() throws Exception {
		if (kbReasonerClient == null) {
			kbReasonerClient = buildKBReasoner();
		}
		return kbReasonerClient;
	}

	public static void resetKBReasoner() throws Exception {
		kbReasonerClient = buildKBReasoner();
	}

	private static KBReasonerClient buildKBReasoner() throws Exception {
		// Configure KBReasonerClient endpoint from preference page information
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		String kbReasonerURI = store.getString(PreferenceConstants.KB_REASONER_URI).trim();
		if (kbReasonerURI.isEmpty())
			raiseConfigurationIssue("KB Reasoner URI user not set");
		if (!kbReasonerURI.endsWith("/"))
			kbReasonerURI = kbReasonerURI.concat("/");

		String iacURI = store.getString(PreferenceConstants.IaC_URI);
		if (iacURI.isEmpty())
			raiseConfigurationIssue("IaC URI user not set");
		if (!iacURI.endsWith("/"))
			iacURI = iacURI.concat("/");

		String image_builder_URI = store.getString(PreferenceConstants.Image_Builder_URI).trim();
		if (image_builder_URI.isEmpty())
			raiseConfigurationIssue("Image Builder URI user not set");
		if (!image_builder_URI.endsWith("/"))
			image_builder_URI = image_builder_URI.concat("/");

		String xoperaURI = store.getString(PreferenceConstants.xOPERA_URI).trim();
		if (xoperaURI.isEmpty())
			raiseConfigurationIssue("xOpera URI user not set");
		if (!xoperaURI.endsWith("/"))
			xoperaURI = xoperaURI.concat("/");

		String keycloakURI = store.getString(PreferenceConstants.KEYCLOAK_URI).trim();
		if (keycloakURI.isEmpty())
			raiseConfigurationIssue("Keycloak URI user not set");
		if (!keycloakURI.endsWith("/"))
			keycloakURI = keycloakURI.concat("/");

		String pdsURI = store.getString(PreferenceConstants.PDS_URI).trim();
		if (pdsURI.isEmpty())
			raiseConfigurationIssue("PDS URI user not set");
		if (!pdsURI.endsWith("/"))
			pdsURI = pdsURI.concat("/");

		String refactorerURI = store.getString(PreferenceConstants.Refactorer_URI).trim();
		if (refactorerURI.isEmpty())
			raiseConfigurationIssue("Refactorer URI user not set");
		if (!refactorerURI.endsWith("/"))
			refactorerURI = refactorerURI.concat("/");

		String nifiURI = store.getString(PreferenceConstants.NIFI_URI).trim();
		if (nifiURI.isEmpty())
			raiseConfigurationIssue("NIFI URI user not set");
		if (!nifiURI.endsWith("/"))
			nifiURI = nifiURI.concat("/");

		String grafanaURI = store.getString(PreferenceConstants.Grafana_Registry_URI).trim();
		if (grafanaURI.isEmpty())
			raiseConfigurationIssue("Grafana URI user not set");
		if (!grafanaURI.endsWith("/"))
			grafanaURI = grafanaURI.concat("/");

		String rulesServerURI = store.getString(PreferenceConstants.RulesServer_URI).trim();
		if (rulesServerURI.isEmpty())
			raiseConfigurationIssue("Rules Server URI user not set");
		if (!rulesServerURI.endsWith("/"))
			rulesServerURI = rulesServerURI.concat("/");

		String vaultSecretUploaderURI = store.getString(PreferenceConstants.VAULT_SECRET_UPLOADER_URI).trim();
		if (vaultSecretUploaderURI.isEmpty())
			raiseConfigurationIssue("VAULT Secret Uploader URI user not set");
		if (!vaultSecretUploaderURI.endsWith("/"))
			vaultSecretUploaderURI = vaultSecretUploaderURI.concat("/");

		String modakURI = store.getString(PreferenceConstants.MODAK_URI).trim();
		if (modakURI.isEmpty())
			raiseConfigurationIssue("MODAK URI user not set");
		if (!modakURI.endsWith("/"))
			modakURI = modakURI.concat("/");

		KBReasonerClient kbclient = new KBReasonerClient(kbReasonerURI, iacURI, image_builder_URI, xoperaURI,
				keycloakURI, pdsURI, refactorerURI, nifiURI, grafanaURI, rulesServerURI, vaultSecretUploaderURI,
				modakURI);

		if (Boolean.valueOf(store.getString(PreferenceConstants.KEYCLOAK_ENABLED))) {
			String keycloak_user = store.getString(PreferenceConstants.KEYCLOAK_USER);
			if (keycloak_user.isEmpty())
				raiseConfigurationIssue("Keycloak user not set");

			String keycloak_password = store.getString(PreferenceConstants.KEYCLOAK_PASSWORD);
			if (keycloak_password.isEmpty())
				raiseConfigurationIssue("Keycloak password not set");

			String keycloak_client_id = store.getString(PreferenceConstants.KEYCLOAK_CLIENT_ID);
			if (keycloak_client_id.isEmpty())
				raiseConfigurationIssue("Keycloak client_id not set");

			String keycloak_client_secret = store.getString(PreferenceConstants.KEYCLOAK_CLIENT_SECRET);
			if (keycloak_client_secret.isEmpty())
				raiseConfigurationIssue("Keycloak client secret not set");

			String token = kbclient.setUserAccount(keycloak_user, keycloak_password, keycloak_client_id,
					keycloak_client_secret);

			if (token == null)
				raiseConfigurationIssue(
						"Security token could not be obtained. Check your IAM configuration in preferences");
			else
				SodaliteLogger.log("Security token: " + token);
		}

		SodaliteLogger.log(MessageFormat.format(
				"Sodalite backend configured with [KB Reasoner API: {0}, IaC API: {1}, xOpera {2}, Keycloak {3}",
				kbReasonerURI, iacURI, xoperaURI, keycloakURI));
		return kbclient;
	}

	public static void raiseConfigurationIssue(String message) throws Exception {
		throw new Exception(message + " in Sodalite preferences pages");
	}
}
