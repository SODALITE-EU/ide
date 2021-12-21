package org.sodalite.dsl.ide.backend;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageReport;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageStatus;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageStatusReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatusReport;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;


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
	
	public static String saveAADM(String aadmTTL, String aadmDSL, String aadmURI, String aadmName, String namespace, String version) throws Exception {
		try {
			boolean complete = false;
			KBSaveReportData saveReport = getKBReasoner().saveAADM(aadmTTL, aadmURI, aadmName, namespace, aadmDSL,
					complete, version);
			
			if (saveReport.getURI() == null && saveReport.getErrors() == null) {
				throw new Exception(
						"The AADM model could not be saved into the KB. Please, contact your Sodalite administrator");
			}
			return saveReport.getURI();
		} catch (NotRolePermissionException ex) {
			//TODO report error to user
			ex.printStackTrace();
			throw ex;
		} catch (Exception e) {
			//TODO report error to user
			e.printStackTrace();
			throw e;
		}
	}
	
	public static String deployAADM(String aadmTTL, String aadmDSL, String aadmURI, String aadmName, String namespace, String version,
			String inputs_yaml, String imageBuildConf, String version_tag, int workers, boolean completeModel, String deployment_name,
			String monitoring_id, String username) throws Exception {
		try {
			// Save the AADM model into the KB
			boolean complete = false;
			KBSaveReportData saveReport = getKBReasoner().saveAADM(aadmTTL, aadmURI, aadmName, namespace, aadmDSL,
					complete, version);
			String aadm_id = saveReport.getURI();
			
			if (aadm_id == null && saveReport.getErrors() == null) {
				throw new Exception(
						"The AADM model could not be saved into the KB. Please, contact your Sodalite administrator");
			}
			
			// Ask the AADM JSON serialization to the KB Reasoner
			String aadmJson = getKBReasoner().getAADM(saveReport.getURI(), version, false);
			if (aadmJson == null)
				throw new Exception("Processed ADDM could not be obtained from the KB");
			// Save json for debugging
			Path aadmJsonPath = Paths.get(System.getProperty("user.dir") + "/" + aadmName + ".json");
			Files.write(aadmJsonPath, aadmJson.getBytes());


			// Ask ImageBuilder to build the images
			if (imageBuildConf != null) {
				// Ask ImageBuilder to build the images

				BuildImageReport biReport = getKBReasoner().buildImage(imageBuildConf);

				// Ask ImageBuilder status
				BuildImageStatusReport statusReport = getKBReasoner()
						.checkBuildImageStatus(biReport.getInvocation_id());
				while (!(statusReport.getStatus() == BuildImageStatus.DONE)) {
					if (statusReport.getStatus() == BuildImageStatus.FAILED)
						throw new Exception("Build image failed as reported by Image Builder");
					TimeUnit.SECONDS.sleep(5);
					statusReport = getKBReasoner().checkBuildImageStatus(biReport.getInvocation_id());
				}
			}

			// Ask IaC Blueprint Builder to build the AADM blueprint
			String[] admin_report = new String[2];
			IaCBuilderAADMRegistrationReport iacReport = getKBReasoner()
					.askIaCBuilderToRegisterAADM(aadmName, aadmName, username, aadmJson);
			if (iacReport == null || iacReport.getBlueprint_id().isEmpty())
				throw new Exception("AADM could not be parsed by IaC Builder");
			admin_report[0] = iacReport.getBlueprint_id();
			
			// Ask xOpera to deploy the AADM blueprint
			// Save inputs in temporary file
			Path inputs_yaml_path = Files.createTempFile(null, ".yaml");
			Files.writeString(inputs_yaml_path, inputs_yaml);
			
			DeploymentReport depl_report = getKBReasoner().deployAADM(inputs_yaml_path,
					iacReport.getBlueprint_id(), version_tag, workers, deployment_name);
			admin_report[1] = depl_report.getDeployment_id();
			
			// Remove temporary inputs file
			Files.delete(inputs_yaml_path);

			// Ask xOpera deployment status: info/status (session-token): status JSON
			DeploymentStatusReport dsr = getKBReasoner()
					.getAADMDeploymentStatus(depl_report.getDeployment_id());
			while (!dsr.getState().equals("success")) {
				if (dsr.getState().equals("failed"))
					throw new Exception("Deployment failed as reported by xOpera");
				TimeUnit.SECONDS.sleep(10);
				dsr = getKBReasoner().getAADMDeploymentStatus(depl_report.getDeployment_id());
			}

			// Report deployment_label, deployment_id to Grafana Registry with IAM -
			getKBReasoner().createMonitoringDashboard(monitoring_id, deployment_name);

			// Report deployment to Refactorer
			String appName = namespace != null && !namespace.isEmpty() ? namespace
					: aadmName.substring(0, aadmName.indexOf(".aadm"));
			getKBReasoner().notifyDeploymentToRefactoring(appName, aadm_id, version,
					depl_report.getBlueprint_id(), depl_report.getDeployment_id(), monitoring_id, inputs_yaml);

			// Upon completion, show dialog
			String message = "The selected AADM model has been successfully deployed into the Sodalite backend with: \nblueprint id: "
							+ admin_report[0] + "\ndeployment id:" + admin_report[1] + "\nmonitoring id:"
							+ monitoring_id;
			return message;
		} catch (NotRolePermissionException ex) {
			//Report error to user
			ex.printStackTrace();
			throw ex;
		} catch (Exception e) {
			//Report error to user
			e.printStackTrace();
			throw e;
		}
	}
}
