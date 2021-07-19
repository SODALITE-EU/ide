package org.sodalite.dsl.ui.handlers;

import java.nio.file.Path;
import java.util.SortedMap;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.backend.AADMBackendProxy;
import org.sodalite.dsl.ui.backend.RMBackendProxy;
import org.sodalite.dsl.ui.helper.AADMHelper;
import org.sodalite.dsl.ui.helper.AADMHelper.InputDef;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;
import org.sodalite.dsl.ui.wizards.deployment.DeploymentWizard;
import org.sodalite.dsl.ui.wizards.deployment.DeploymentWizardDialog;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class AADMDeployHandler implements IHandler {
	private Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	private AADMBackendProxy backendProxy = new AADMBackendProxy();

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			if (PlatformUI.getWorkbench().saveAllEditors(true)) { // Ask to save model before continue
				// Show DeploymentWizard
				// Wizard should select the Inputs file or generate them from the form
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				IFile aadmFile = AADMHelper.getSelectedFile();
				// Read input definitions from AADM
				// Show wizard
				SortedMap<String, InputDef> inputDefs = AADMHelper.readInputsFromAADM(event);
				DeploymentWizardDialog dialog = new DeploymentWizardDialog(shell, new DeploymentWizard(inputDefs));

				IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				String keycloak_user = store.getString(PreferenceConstants.KEYCLOAK_USER);
				if (keycloak_user.isEmpty())
					RMBackendProxy.raiseConfigurationIssue("Keycloak user not set");

				if (dialog.OK == dialog.open()) {
					// Get inputs (file) from Wizard and save them in temporal file
					Path inputs_yaml_path = dialog.getInputsFile();
					Path imageBuildConfPath = dialog.getImageBuildConfPath();
					String version_tag = dialog.getVersionTag();
					int workers = dialog.getWorkers();
					boolean completeModel = dialog.getCompleteModel();
					String deployment_label = dialog.getDeploymentLabel();
					String monitoring_id = dialog.getMonitoringId();
					backendProxy.processDeployAADM(event, aadmFile, inputs_yaml_path, imageBuildConfPath, version_tag,
							workers, deployment_label, monitoring_id, keycloak_user, completeModel);
				}
			}
		} catch (Exception ex) {
			SodaliteLogger.log("Error", ex);
			MessageDialog.openError(parent, "Save AADM Error",
					"There were an error reported by the KB:\n" + ex.getMessage());
		}
		return this;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {

	}

}
