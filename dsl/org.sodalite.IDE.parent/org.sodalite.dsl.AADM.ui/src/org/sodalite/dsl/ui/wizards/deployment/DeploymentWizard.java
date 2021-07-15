package org.sodalite.dsl.ui.wizards.deployment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;

import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.osgi.service.prefs.Preferences;
import org.sodalite.dsl.ui.backend.RMBackendProxy;
import org.sodalite.dsl.ui.helper.AADMHelper.InputDef;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class DeploymentWizard extends Wizard {

	protected DeploymentWizardMainPage mainPage;
	private SortedMap<String, InputDef> inputDefs;
	private Path inputsFile = null;
	private Path imageBuildConfPath = null;
	private String versionTag = null;
	private String deploymentLabel = null;
	private int workers = 0;
	private boolean completeModel = false;
	private String monitoring_id = null;

	public DeploymentWizard(SortedMap<String, InputDef> inputDefs) {
		super();
		this.inputDefs = inputDefs;
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "ADDM Deployment";
	}

	@Override
	public void addPages() {
		mainPage = new DeploymentWizardMainPage(inputDefs);
		addPage(mainPage);
	}

	@Override
	public boolean canFinish() {
		boolean isOk = false;
		// Check deployment name is set
		isOk = mainPage.getDeploymentName().trim() != null && !mainPage.getDeploymentName().trim().isEmpty();

		// Check all inputs are filled in
		Map<String, String> inputs = mainPage.getInputs();
		return isOk && inputs.keySet().stream().allMatch(key -> isValidInput(key, inputs.get(key)));
	}

	private boolean isValidInput(String input, String value) {
		return value != null && !(value.isEmpty() && !hasDefault(input));
	}

	private boolean hasDefault(String input) {
		return inputDefs.get(input).getDefaultValue() != null;
	}

	@Override
	public boolean performFinish() {
		// Get imageBuildConfPath
		this.imageBuildConfPath = mainPage.getImageBuildConfPath();

		// Get deploymentName
		this.deploymentLabel = mainPage.getDeploymentName();

		// Get versionTag
		this.versionTag = mainPage.getVersionTag();

		// Get workers
		this.workers = mainPage.getWorkers();

		// Save inputs in temporal file
		Map<String, String> inputs = mainPage.getInputs();
		try {
			this.inputsFile = File.createTempFile("inputs", null, new File(System.getProperty("user.home"))).toPath();
			StringBuilder content = new StringBuilder();
			inputs.keySet().forEach(key -> content.append(key + ": " + inputs.get(key) + "\n"));
			// Adding additional inputs
			Preferences defaults = DefaultScope.INSTANCE.getNode(Activator.PLUGIN_ID);
			String consul_uri = defaults.get(PreferenceConstants.Consul_URI, "");
			String grafana_uri = defaults.get(PreferenceConstants.Grafana_URI, "");
			if (consul_uri.isEmpty() || grafana_uri.isEmpty()) {
				showErrorDialog(null, "Deploy AADM",
						"Consul or Grafana URIs not set. Please, check your SODALITE preferences");
				return false;
			}
			content.append("deployment_label: " + this.deploymentLabel + "\n");
			content.append("consul_uri: " + consul_uri + "\n");
			// Inject deploymentName in grafana_address template
			// http://192.168.3.74:3000/d/xfpJB9FGz/sodalite-node-exporters?orgId=1&var-deployment_label={{
			// deployment_label }}
			String grafana_template = "%1$sd/xfpJB9FGz/sodalite-node-exporters?orgId=1&var-deployment_label={{ %2$s }}";
			String deployment_label = mainPage.getDeploymentName();
			String grafana_address = String.format(grafana_template, grafana_uri, deployment_label);
			content.append("grafana_address: " + grafana_address + "\n");
			this.monitoring_id = UUID.randomUUID().toString();
			content.append("monitoring_id: " + this.monitoring_id);
			Files.write(this.inputsFile, content.toString().getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			SodaliteLogger.log("Error on closing wizard", e);
			return false;
		}

		// Get completeModel
		this.completeModel = mainPage.getCompleteModel();

		return true;
	}

	public Path getInputsFile() {
		return this.inputsFile;
	}

	public Path getImageBuildConfPath() {
		return this.imageBuildConfPath;
	}

	public String getDeploymentLabel() {
		return this.deploymentLabel;
	}

	public String getVersionTag() {
		return this.versionTag;
	}

	public int getWorkers() {
		return this.workers;
	}

	public boolean getCompleteModel() {
		return this.completeModel;
	}

	public String getMonitoringId() {
		return this.monitoring_id;
	}

	public void showErrorDialog(String info, String dialogTitle, String dialogMessage) {
		Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		if (info != null)
			RMBackendProxy.pasteInClipboard(info);
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openError(parent, dialogTitle, dialogMessage);
			}
		});
	}

}
