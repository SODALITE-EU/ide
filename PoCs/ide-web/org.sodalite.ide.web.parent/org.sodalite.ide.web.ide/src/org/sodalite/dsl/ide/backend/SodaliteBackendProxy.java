package org.sodalite.dsl.ide.backend;

import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;

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

		String kbReasonerURI = SodaliteBackendConfiguration.KB_REASONER_URI;
		String iacURI = SodaliteBackendConfiguration.IaC_URI;
		String image_builder_URI = SodaliteBackendConfiguration.Image_Builder_URI;
		String xoperaURI = SodaliteBackendConfiguration.xOPERA_URI;
		String keycloakURI = SodaliteBackendConfiguration.KEYCLOAK_URI;
		String pdsURI = SodaliteBackendConfiguration.PDS_URI;
		String refactorerURI = SodaliteBackendConfiguration.Refactorer_URI;
		String grafanaURI = SodaliteBackendConfiguration.Grafana_Registry_URI;
		String rulesServerURI = SodaliteBackendConfiguration.RulesServer_URI;
		String vaultSecretUploaderURI = SodaliteBackendConfiguration.VAULT_SECRET_UPLOADER_URI;

		KBReasonerClient kbclient = new KBReasonerClient(kbReasonerURI, iacURI, image_builder_URI, xoperaURI,
				keycloakURI, pdsURI, refactorerURI, grafanaURI, rulesServerURI, vaultSecretUploaderURI);

		if (Boolean.valueOf(SodaliteBackendConfiguration.KEYCLOAK_ENABLED)) {
			String keycloak_user = SodaliteBackendConfiguration.KEYCLOAK_USER;
			String keycloak_password = SodaliteBackendConfiguration.KEYCLOAK_PASSWORD;
			String keycloak_client_id = SodaliteBackendConfiguration.KEYCLOAK_CLIENT_ID;
			String keycloak_client_secret = SodaliteBackendConfiguration.KEYCLOAK_CLIENT_SECRET;
			String token = kbclient.setUserAccount(keycloak_user, keycloak_password, keycloak_client_id,
					keycloak_client_secret);
			if (token == null)
				raiseConfigurationIssue(
						"Security token could not be obtained. Check your IAM configuration in preferences");
		}
		return kbclient;
	}

	public static void raiseConfigurationIssue(String message) throws Exception {
		throw new Exception(message + " in Sodalite Web IDE Configuration");
	}
}
