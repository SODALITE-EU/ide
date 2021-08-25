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
import org.sodalite.dsl.ui.wizards.AlertingRulesWizard;
import org.sodalite.dsl.ui.wizards.AlertingRulesWizardDialog;

public class AlertingBackendProxy extends RMBackendProxy {
	private static Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

	public static void processRegisterAlertingRules(String monitoringId, IFile alertFile) throws Exception {
		if (alertFile == null)
			throw new Exception("Selected Alerting model could not be found");
		IProject project = alertFile.getProject();

		// Get serialize alerting rules
		String rules = readAlertModel(alertFile, project);

		// Insert monitoring_Id in rules
		rules = rules.replaceAll("monitoring_id_value", monitoringId);

		// Send alerting rules to the monitoring
		getKBReasoner().registerAlertingRules(monitoringId, rules);

		showInformationDialog("Sending alerting rules to monitoring",
				"Alerting rules have been successfully updated in monitoring for selected deployment");
	}

	public static void processDeregisterAlertingRules(String monitoringId) throws Exception {
		// Delete alerting rules in monitoring
		getKBReasoner().deregisterAlertingRules(monitoringId);

		showInformationDialog("Deleting alerting rules in monitoring",
				"Alerting rules have been successfully deregistered in monitoring for selected deployment");
	}

	public static void startRegisteringAlertingRulesWizard(ExecutionEvent event) {
		Job job = new Job("Getting user's active deployments") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Manage job states
				SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
				List<Deployment> deployments = getUserDeployments();
				subMonitor.done();

				if (deployments.isEmpty())
					return Status.CANCEL_STATUS;

				// Open send alerts wizard
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						AlertingRulesWizardDialog dialog = new AlertingRulesWizardDialog(shell,
								new AlertingRulesWizard(deployments, "Register alerting rules",
										"Register monitoring alerting rules for a given deployment"),
								"Register");
						if (dialog.OK == dialog.open()) {
							String monitoringId = dialog.getMonitoringId();
							try {
								processRegisterAlertingRules(monitoringId, getSelectedFile());
							} catch (Exception e) {
								showErrorDialog("Register alerting rules", e.getMessage());
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

	public static void startDeregisteringAlertingRulesWizard(ExecutionEvent event) {
		Job job = new Job("Getting user's active deployments") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				// Manage job states
				SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
				List<Deployment> deployments = getUserDeployments();
				subMonitor.done();

				if (deployments.isEmpty())
					return Status.CANCEL_STATUS;

				// Open send alerts wizard
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						AlertingRulesWizardDialog dialog = new AlertingRulesWizardDialog(shell,
								new AlertingRulesWizard(deployments, "Deregister alerting rules",
										"Deregister monitoring alerting rules for a given deployment"),
								"Deregister");
						if (dialog.OK == dialog.open()) {
							String monitoringId = dialog.getMonitoringId();
							try {
								processDeregisterAlertingRules(monitoringId);
							} catch (Exception e) {
								showErrorDialog("Deregister alerting rules", e.getMessage());
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

	private static List<Deployment> getUserDeployments() {
		List<Deployment> deployments = new ArrayList<Deployment>();

		// Get IDE user for preferences
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String keycloak_user = store.getString(PreferenceConstants.KEYCLOAK_USER);
		if (keycloak_user.isEmpty()) {
			showErrorDialog("Getting user's existing deployments", "Keycloak user not set");
		}

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
			else
				showErrorDialog("Getting user's existing deployments", ex.getMessage());
		}
		return deployments;
	}

	public static void showErrorDialog(String dialogTitle, String dialogMessage) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openError(shell, dialogTitle, dialogMessage);
			}
		});
	}

	public static void showInformationDialog(String dialogTitle, String dialogMessage) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openInformation(shell, dialogTitle, dialogMessage);
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