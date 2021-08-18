package org.sodalite.dsl.ui.backend;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException;
import org.sodalite.dsl.kb_reasoner_client.types.Blueprint;
import org.sodalite.dsl.kb_reasoner_client.types.BlueprintData;
import org.sodalite.dsl.kb_reasoner_client.types.Deployment;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentData;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;
import org.sodalite.dsl.ui.wizards.SendAlertsWizard;
import org.sodalite.dsl.ui.wizards.SendAlertsWizardDialog;

public class AlertingBackendProxy extends RMBackendProxy {
	private static Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

	public static void processSendAlerts(String monitoringId, ExecutionEvent event) throws Exception {
		// Return selected resource
		IFile alertFile = getSelectedFile();
		if (alertFile == null)
			throw new Exception("Selected Alerting model could not be found");
		IProject project = alertFile.getProject();

		// Get serialize alerts
		String rules = readAlertModel(alertFile, project);

		// Send alerts to the monitoring
		getKBReasoner().registerAlertingRules(monitoringId, rules);

	}

	public static void startSendAlertsWizard(ExecutionEvent event) {
		Job job = new Job("Getting user's existing deployments") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Manage job states
				// TODO Inform about percentage of progress
				int steps = 1;
				int number_steps = 1;
				SubMonitor subMonitor = SubMonitor.convert(monitor, number_steps);

				List<Deployment> deployments = new ArrayList<Deployment>();

				// Get IDE user for preferences
				IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				String keycloak_user = store.getString(PreferenceConstants.KEYCLOAK_USER);
				if (keycloak_user.isEmpty())
					showErrorDialog("Getting user's existing deployments", "Keycloak user not set");

				try {
					BlueprintData blueprintData = getKBReasoner().getBlueprintsForUser(keycloak_user);
					if (!blueprintData.getElements().isEmpty()) {
						for (Blueprint blueprint : blueprintData.getElements()) {
							DeploymentData deploymentData = getKBReasoner()
									.getDeploymentsForBlueprint(blueprint.getBlueprint_id());
							for (Deployment deployment : deploymentData.getElements()) {
								deployments.add(deployment);
							}
						}
					} else {
						showErrorDialog("Getting user's existing deployments",
								"No deployments were found for registered IDE user");
					}
				} catch (Exception ex) {
					if (!(ex.getCause() instanceof NotRolePermissionException))
						showErrorDialog("Getting user's existing deployments", "Keycloak user has not role permission");
				}

				subMonitor.done();

				// Open send alerts wizard
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						SendAlertsWizardDialog dialog = new SendAlertsWizardDialog(shell,
								new SendAlertsWizard(deployments));

						if (dialog.OK == dialog.open()) {
							String monitoringId = dialog.getMonitoringId();
							try {
								processSendAlerts(monitoringId, event);
							} catch (Exception e) {
								showErrorDialog("Sending alerting rules", e.getMessage());
							}
						}
					}
				});

				return Status.OK_STATUS;
			}
		};
		job.setPriority(Job.LONG);
		job.schedule();
	}

	public static void showErrorDialog(String dialogTitle, String dialogMessage) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openError(shell, dialogTitle, dialogMessage);
			}
		});
	}

	private static IFile getSelectedFile() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				return (IFile) ((IAdaptable) firstElement).getAdapter(IFile.class);
			}
		}
		return null;
	}

	protected static String readAlertModel(IFile modelFile, IProject project) throws IOException {
		String filename = modelFile.getFullPath().toOSString()
				.substring(modelFile.getFullPath().toOSString().indexOf(File.separator, 1) + 1)
				.replaceFirst(File.separator, ".");
		IFile file = project.getFile("src-gen" + File.separator + filename + ".rules");
		String file_path = file.getLocationURI().toString();
		file_path = file_path.substring(file_path.indexOf(File.separator));
		Path model_path = FileSystems.getDefault().getPath(file_path);
		return new String(Files.readAllBytes(model_path));
	}
}
