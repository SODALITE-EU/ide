package org.sodalite.ide.ui.views.parts.deployment;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException;
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.kb_reasoner_client.types.Blueprint;
import org.sodalite.dsl.kb_reasoner_client.types.BlueprintData;
import org.sodalite.dsl.kb_reasoner_client.types.Deployment;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentData;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatusReport;
import org.sodalite.dsl.ui.backend.RMBackendProxy;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;
import org.sodalite.ide.ui.helper.UIHelper;
import org.sodalite.ide.ui.logger.SodaliteLogger;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;
import org.sodalite.ide.ui.wizards.deleteDeployment.DeleteDeploymentWizard;
import org.sodalite.ide.ui.wizards.deleteDeployment.DeleteDeploymentWizardDialog;
import org.sodalite.ide.ui.wizards.resume.ResumeWizard;
import org.sodalite.ide.ui.wizards.resume.ResumeWizardDialog;

public class BlueprintView {
	private Label myLabelInView;
	private Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	private TreeViewer viewer = null;
	private static BlueprintView view = null;
	private IEclipseContext context = null;
	private static Deployment selectedDeployment = null;

	public BlueprintView() {
		BlueprintView.view = this;
	}

	public static BlueprintView getView() {
		return view;
	}

	private static void setSelectedDeployment(Deployment deployment) {
		selectedDeployment = deployment;
	}

	public static Deployment getSelectedDeployment() {
		return selectedDeployment;
	}

	public ISelection getSelection() {
		return viewer.getSelection();
	}

	@PostConstruct
	public void createPartControl(Composite parent, MApplication application) throws Exception {
		context = application.getContext();

		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new BlueprintContentProvider());
		viewer.getTree().setHeaderVisible(true);
		viewer.getTree().setLinesVisible(true);

		// Sort blueprints by timestamp
		viewer.setComparator(new ViewerComparator() {
			public int compare(Viewer viewer, Object e1, Object e2) {
				DeploymentNode dn1 = ((TreeNode<DeploymentNode>) e1).getData();
				DeploymentNode dn2 = ((TreeNode<DeploymentNode>) e2).getData();
				if (dn1.isBlueprint()) {
					return dn1.getBlueprint().getTimestamp().compareTo(dn2.getBlueprint().getTimestamp());
				} else {
					return dn1.getDeployment().getTimestamp().compareTo(dn2.getDeployment().getTimestamp());
				}
			};
		});

		// Blueprint/Deployment Id column
		TreeViewerColumn idColumn = new TreeViewerColumn(viewer, SWT.NONE);
		idColumn.getColumn().setWidth(350);
		idColumn.getColumn().setText("Id");
		idColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new IdLabelProvider()));

		// Blueprint/Deployment Name column
		TreeViewerColumn nameColumn = new TreeViewerColumn(viewer, SWT.NONE);
		nameColumn.getColumn().setWidth(200);
		nameColumn.getColumn().setText("Name");
		nameColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new NameLabelProvider()));

		// AADM column
		TreeViewerColumn aadmColumn = new TreeViewerColumn(viewer, SWT.NONE);
		aadmColumn.getColumn().setWidth(100);
		aadmColumn.getColumn().setText("AADM id");
		aadmColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new AADMLabelProvider()));

		// Project domain column
		TreeViewerColumn projectDomainColumn = new TreeViewerColumn(viewer, SWT.NONE);
		projectDomainColumn.getColumn().setWidth(150);
		projectDomainColumn.getColumn().setText("Module");
		projectDomainColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new ProjectDomainLabelProvider()));

		// URL
		TreeViewerColumn urlColumn = new TreeViewerColumn(viewer, SWT.NONE);
		urlColumn.getColumn().setWidth(300);
		urlColumn.getColumn().setText("URL");
		urlColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new URLLabelProvider()));

		// Timestamp column
		TreeViewerColumn timestampColumn = new TreeViewerColumn(viewer, SWT.NONE);
		timestampColumn.getColumn().setWidth(250);
		timestampColumn.getColumn().setText("Timestamp");
		timestampColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new TimestampLabelProvider()));

		// Timestamp column
		TreeViewerColumn statusColumn = new TreeViewerColumn(viewer, SWT.NONE);
		statusColumn.getColumn().setWidth(250);
		statusColumn.getColumn().setText("State");
		statusColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new StateLabelProvider()));

		// Version id column
		TreeViewerColumn versionColumn = new TreeViewerColumn(viewer, SWT.NONE);
		versionColumn.getColumn().setWidth(150);
		versionColumn.getColumn().setText("Version id");
		versionColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new VersionIdLabelProvider()));

		// Adjust column width automatically
		Listener listener = new Listener() {

			@Override
			public void handleEvent(Event event) {
				TreeItem treeItem = (TreeItem) event.item;
				final TreeColumn[] treeColumns = treeItem.getParent().getColumns();
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						for (TreeColumn treeColumn : treeColumns)
							treeColumn.pack();
					}
				});
			}
		};
		viewer.getTree().addListener(SWT.Expand, listener);

		// Open a dedicated view for a selected deployment
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				TreeViewer viewer = (TreeViewer) event.getViewer();
				IStructuredSelection thisSelection = (IStructuredSelection) event.getSelection();
				Object selectedNode = thisSelection.getFirstElement();
//		        viewer.setExpandedState(selectedNode,
//		                !viewer.getExpandedState(selectedNode));
				TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) selectedNode;
				if (node.getData().isDeployment()) {
					BlueprintView.setSelectedDeployment(node.getData().getDeployment());
					DeploymentDetailsViewOpener detailsView = new DeploymentDetailsViewOpener(
							node.getData().getDeployment());
					ContextInjectionFactory.inject(detailsView, context);
					detailsView.open();
				}

				// Open blueprint url in browser
				if (node.getData().isBlueprint() && node.getData().getBlueprint().getUrl() != null) {
					String url = node.getData().getBlueprint().getUrl();
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							if (MessageDialog.openConfirm(shell, "Open link",
									"Do you want to open the link " + url + " in the external default browser?")) {
								try {
									UIHelper.openURL(url);
								} catch (SodaliteException e) {
									MessageDialog.openError(shell, "Open link",
											"Link could not be opened. Error: " + e.getMessage());
								}
							}
						}
					});
				}
			}
		});

		// Menu
		createContextMenu(viewer);

		// Model
		TreeNode<DeploymentNode> root = null;

		viewer.setInput(root);

		GridLayoutFactory.fillDefaults().generateLayout(parent);

		Job job = Job.create("Gathering deployments", (ICoreRunnable) monitor -> {
			try {
				TreeNode<DeploymentNode> uproot = retrieveDeploymentContent();
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						viewer.setInput(uproot);
						viewer.refresh();
					}
				});
			} catch (Exception e) {
				showErrorDialog("Gathering deployments",
						"The Deployment Governance View could not be refreshed from xOpera");
				SodaliteLogger.log(e);
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	private TreeNode<DeploymentNode> retrieveDeploymentContent() throws Exception {
		// Retrieve user's blueprints and deployments from xOpera
		TreeNode<DeploymentNode> root = new TreeNode<>(new DeploymentNode("Blueprints"));

		// Get IDE user for preferences
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String keycloak_user = store.getString(PreferenceConstants.KEYCLOAK_USER);
		if (keycloak_user.isEmpty())
			RMBackendProxy.raiseConfigurationIssue("Keycloak user not set");

		try {
			BlueprintData blueprintData = RMBackendProxy.getKBReasoner().getBlueprintsForUser(keycloak_user);
			if (!blueprintData.getElements().isEmpty()) {
				for (Blueprint blueprint : blueprintData.getElements()) {
					BlueprintData blueprintDetailsData = RMBackendProxy.getKBReasoner()
							.getBlueprintForId(blueprint.getBlueprint_id());
					TreeNode<DeploymentNode> node = root.addChild(new TreeNode<DeploymentNode>(
							new DeploymentNode(blueprintDetailsData.getElements().get(0))));

					DeploymentData deploymentData = RMBackendProxy.getKBReasoner()
							.getDeploymentsForBlueprint(blueprint.getBlueprint_id());
					for (Deployment deployment : deploymentData.getElements()) {
						node.addChild(new TreeNode<DeploymentNode>(new DeploymentNode(deployment)));
					}
				}
			} else {
				showErrorDialog("Blueprints", "No blueprints were found for registered IDE user");
			}
		} catch (SodaliteException ex) {
			if (!(ex.getCause() instanceof NotRolePermissionException))
				throw ex;
		}

		return root;
	}

//	private void raiseConfigurationIssue(String message) throws Exception {
//		Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//		Display.getDefault().asyncExec(new Runnable() {
//			@Override
//			public void run() {
//				MessageDialog.openError(parent, "Sodalite Preferences Error",
//						message + " in Sodalite preferences pages");
//			}
//		});
//		throw new Exception(message + " in Sodalite preferences pages");
//	}

	private void createContextMenu(TreeViewer viewer) {

		MenuManager menuMgr = new MenuManager();
		menuMgr.addMenuListener(new IMenuListener() {

			@Override
			public void menuAboutToShow(IMenuManager manager) {

				// initialize the action to perform
				manager.removeAll();
				ISelection selection = viewer.getSelection();
				if (!selection.isEmpty()) {
					TreeSelection ts = (TreeSelection) selection;
					if (ts.toList().size() == 1) {
						TreeNode<DeploymentNode> tn = (TreeNode) ts.getFirstElement();
//						DeploymentNode node = (DeploymentNode) tn.getData();
						createGeneralContextualMenu(manager, tn);
						if (tn.getData().isDeployment()) {
							createDeploymentContextualMenu(manager, tn);
						}
					}
				}
			}

			private void createGeneralContextualMenu(IMenuManager manager, TreeNode<DeploymentNode> tn) {
				Action refreshAction = new Action() {
					public void run() {
						refreshBlueprints();
					}
				};
				refreshAction.setText("Refresh blueprints");
				manager.add(refreshAction);

				Action deleteAction = new Action() {
					public void run() {
						delete(tn);
					}
				};
				deleteAction.setText("Delete");
				if (tn.getData().isDeployment())
					deleteAction.setText("Undeploy");
				manager.add(deleteAction);
			}

			private void createDeploymentContextualMenu(IMenuManager manager, TreeNode<DeploymentNode> tn) {
				Action refreshAction = new Action() {
					public void run() {
						resumeDeployment(tn.getData());
					}
				};
				refreshAction.setText("Resume deployment");
				manager.add(refreshAction);
			}

		});
		Menu menu = menuMgr.createContextMenu(viewer.getTree());
		viewer.getTree().setMenu(menu);
	}

	/**
	 * This method is kept for E3 compatiblity. You can remove it if you do not mix
	 * E3 and E4 code. <br/>
	 * With E4 code you will set directly the selection in ESelectionService and you
	 * do not receive a ISelection
	 * 
	 * @param s the selection received from JFace (E3 mode)
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ISelection s) {
		if (s == null || s.isEmpty())
			return;

		if (s instanceof IStructuredSelection) {
			IStructuredSelection iss = (IStructuredSelection) s;
			if (iss.size() == 1)
				setSelection(iss.getFirstElement());
			else
				setSelection(iss.toArray());
		}
	}

	/**
	 * This method manages the selection of your current object. In this example we
	 * listen to a single Object (even the ISelection already captured in E3 mode).
	 * <br/>
	 * You should change the parameter type of your received Object to manage your
	 * specific selection
	 * 
	 * @param o : the current object received
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object o) {

		// Remove the 2 following lines in pure E4 mode, keep them in mixed mode
		if (o instanceof ISelection) // Already captured
			return;

		// Test if label exists (inject methods are called before PostConstruct)
		if (myLabelInView != null)
			myLabelInView.setText("Current single selection class is : " + o.getClass());
	}

	/**
	 * This method manages the multiple selection of your current objects. <br/>
	 * You should change the parameter type of your array of Objects to manage your
	 * specific selection
	 * 
	 * @param o : the current array of objects received in case of multiple
	 *          selection
	 */
	@Inject
	@Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) Object[] selectedObjects) {

		// Test if label exists (inject methods are called before PostConstruct)
		if (myLabelInView != null)
			myLabelInView.setText("This is a multiple selection of " + selectedObjects.length + " objects");
	}

	public void refreshBlueprints() {
		Job job = Job.create("Refresh Blueprints", (ICoreRunnable) monitor -> {
			try {
				TreeNode<DeploymentNode> root = retrieveDeploymentContent();
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						viewer.setInput(root);
						viewer.refresh();
					}
				});
				showDialog("Blueprints Update", "User's blueprints have been updated");
			} catch (Exception e) {
				showErrorDialog("Blueprints Update", "User's blueprints could not be refreshed from Orchestrator");
				SodaliteLogger.log(e);
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	public void refreshView() {
		viewer.refresh();
	}

	public void showDialog(String dialogTitle, String dialogMessage) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openInformation(shell, dialogTitle, dialogMessage);
			}
		});
	}

	public void showErrorDialog(String dialogTitle, String dialogMessage) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openError(shell, dialogTitle, dialogMessage);
			}
		});
	}

	public void delete(TreeNode<DeploymentNode> treeNode) {
		// Show confirmation/wizard dialog depending on node type
		try {
			DeploymentNode node = treeNode.getData();
			if (node.isBlueprint()) {
				if (!treeNode.getChildren().isEmpty()) {
					MessageDialog.openError(shell, "Delete blueprint",
							"Blueprint contains deployments. Delete them before deleting the blueprint");
					return;
				}
				if (MessageDialog.openConfirm(shell, "Delete blueprint",
						"Do you want to delete the blueprint " + node.getBlueprint().getBlueprint_id())) {
					deleteBlueprint(treeNode);
				}
			} else if (node.isDeployment()) {
				DeleteDeploymentWizardDialog dialog = new DeleteDeploymentWizardDialog(shell,
						new DeleteDeploymentWizard());
				if (dialog.OK == dialog.open()) {
					// Read inputs from deployment details and stroe in temporary file
					String deployment_id = treeNode.getData().getDeployment().getDeployment_id();
					DeploymentData deploymentData = RMBackendProxy.getKBReasoner().getDeploymentForId(deployment_id);
					Deployment deploymentDetails = deploymentData.getElements().get(0);
					Map<String, String> inputs = deploymentDetails.getInputs();
					Path inputs_yaml_path = File
							.createTempFile("inputs", null, new File(System.getProperty("user.home"))).toPath();
					StringBuilder content = new StringBuilder();
					inputs.keySet().forEach(key -> content.append(key + ": " + inputs.get(key) + "\n"));
					Files.write(inputs_yaml_path, content.toString().getBytes(), StandardOpenOption.APPEND);
					int workers = dialog.getWorkers();
					deleteDeployment(treeNode, inputs_yaml_path, workers);
				}
			}

		} catch (Exception e) {
			showErrorDialog("Delete error", e.getMessage());
		}
	}

	public void resumeDeployment(DeploymentNode node) {
		// Show resume deployment wizard dialog
		try {
			if (node.isDeployment()) {
				ResumeWizardDialog dialog = new ResumeWizardDialog(shell, new ResumeWizard());
				if (dialog.OK == dialog.open()) {
					// Get inputs from Wizard
					Path inputs_yaml_path = dialog.getInputsFile();
					boolean clean_state = dialog.getCleanState();
					int workers = dialog.getWorkers();
					resumeDeployment(node, inputs_yaml_path, clean_state, workers);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			showErrorDialog("Resume deployment error", e.getMessage());
		}
	}

	private void resumeDeployment(DeploymentNode node, Path inputs_yaml_path, boolean clean_state, int workers) {
		Job job = new Job("Resume deployment") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				int steps = 1;
				int number_steps = 1;
				SubMonitor subMonitor = SubMonitor.convert(monitor, number_steps);
				try {
					subMonitor.setTaskName("Resuming deployment");
					DeploymentReport report = RMBackendProxy.getKBReasoner().resumeDeploymentForId(
							node.getDeployment().getDeployment_id(), inputs_yaml_path, clean_state, workers);
					subMonitor.worked(steps++);
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "The selected deployment has been successfully resumed with: \ndeployment id: "
									+ report.getDeployment_id();
							String infoToPaste = "deployment id: " + report.getDeployment_id();
							showInfoDialog(infoToPaste, "Resume deployment", message);
							SodaliteLogger.log(message);
						}
					});
				} catch (Exception e) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "There were problems to resume the deployment : "
									+ node.getDeployment().getDeployment_id() + " with error: " + e.getMessage();
							String infoToPaste = null;
							showErrorDialog(infoToPaste, "Resume deployment", message);
							SodaliteLogger.log(message, e);
						}
					});
					SodaliteLogger.log("Error resuming a deployment", e);
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;

			}
		};
		job.setPriority(Job.LONG);
		job.schedule();
	}

	private void deleteDeployment(TreeNode<DeploymentNode> treeNode, Path inputs_yaml_path, int workers) {
		Job job = new Job("Delete deployment") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				int steps = 1;
				int number_steps = 2;
				SubMonitor subMonitor = SubMonitor.convert(monitor, number_steps);
				try {
					DeploymentNode node = treeNode.getData();
					subMonitor.setTaskName("Deleting deployment");
					DeploymentReport report = RMBackendProxy.getKBReasoner()
							.deleteDeploymentForId(node.getDeployment().getDeployment_id(), inputs_yaml_path, workers);

					// Ask xOpera deployment deletion status
					subMonitor.setTaskName("Checking deletion status");
					DeploymentStatusReport dsr = RMBackendProxy.getKBReasoner()
							.getAADMDeploymentStatus(node.getDeployment().getDeployment_id());
					while (!dsr.getState().equals("success")) {
						if (dsr.getState().equals("failed"))
							throw new Exception("Deployment deletion failed as reported by xOpera");
						TimeUnit.SECONDS.sleep(5);
						dsr = RMBackendProxy.getKBReasoner()
								.getAADMDeploymentStatus(node.getDeployment().getDeployment_id());
					}

					subMonitor.worked(steps++);

					subMonitor.setTaskName("Deleting deployment monitoring dashboards");
					// Delete monitoring dashboards for deployment
					String monitoring_Id = node.getDeployment().getMonitoringId();
					String deployment_label = node.getDeployment().getLabel();
					if (monitoring_Id != null)
						RMBackendProxy.getKBReasoner().deleteMonitoringDashboard(monitoring_Id, deployment_label);
					subMonitor.worked(steps++);

					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "The selected deployment has been successfully deleted";
							String infoToPaste = null;
							showInfoDialog(infoToPaste, "Delete deployment", message);
							SodaliteLogger.log(message);

							// Remove node from tree
							treeNode.getParent().getChildren().remove(treeNode);
							BlueprintView.getView().refreshView();
						}
					});
				} catch (Exception e) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "There were problems to delete the deployment : "
									+ treeNode.getData().getDeployment().getDeployment_id() + " with error: "
									+ e.getMessage();
							String infoToPaste = null;
							showErrorDialog(infoToPaste, "Delete deployment", message);
							SodaliteLogger.log(message, e);
						}
					});
					SodaliteLogger.log("Error deleting a deployment", e);
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;

			}
		};
		job.setPriority(Job.LONG);
		job.schedule();
	}

	private void deleteBlueprint(TreeNode<DeploymentNode> treeNode) {
		Job job = new Job("Delete blueprint") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				int steps = 1;
				int number_steps = 2;
				SubMonitor subMonitor = SubMonitor.convert(monitor, number_steps);
				try {
					DeploymentNode node = treeNode.getData();
					subMonitor.setTaskName("Deleting blueprint");
					RMBackendProxy.getKBReasoner().deleteBlueprintForId(node.getBlueprint().getBlueprint_id());
					subMonitor.worked(steps++);
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "The selected deployment has been successfully deleted";
							String infoToPaste = null;
							showInfoDialog(infoToPaste, "Delete blueprint", message);
							SodaliteLogger.log(message);
							// Remove node from tree
							treeNode.getParent().getChildren().remove(treeNode);
							BlueprintView.getView().refreshView();
						}
					});
				} catch (Exception e) {
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							String message = "There were problems to delete the blueprint : "
									+ treeNode.getData().getBlueprint().getBlueprint_id() + " with error: "
									+ e.getMessage();
							String infoToPaste = null;
							showErrorDialog(infoToPaste, "Delete blueprint", message);
							SodaliteLogger.log(message, e);
						}
					});
					SodaliteLogger.log("Error deleting a blueprint", e);
					return Status.CANCEL_STATUS;
				}
				return Status.OK_STATUS;
			}
		};
		job.setPriority(Job.LONG);
		job.schedule();

	}

	public void showErrorDialog(String info, String dialogTitle, String dialogMessage) {
		if (info != null)
			RMBackendProxy.pasteInClipboard(info);
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openError(shell, dialogTitle, dialogMessage);
			}
		});
	}

	public void showInfoDialog(String info, String dialogTitle, String dialogMessage) {
		if (info != null)
			RMBackendProxy.pasteInClipboard(info);
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openInformation(shell, dialogTitle, dialogMessage);
			}
		});
	}
}

class DeploymentDetailsViewOpener {
	@Inject
	EPartService partService;

	@Inject
	EModelService modelService;

	private Deployment deployment = null;

	public DeploymentDetailsViewOpener(Deployment deployment) {
		this.deployment = deployment;
	}

	public void open() {
		MPart mPart = partService.createPart("org.eclipse.ui.browser.view");
		mPart.setLabel("Deployment: " + deployment.getDeployment_id());
		mPart.setElementId("deployment.details.view.id");
		mPart.setIconURI("platform:/plugin/org.sodalite.ide.ui/icons/deployment.png");
		mPart.setContributionURI(
				"bundleclass://org.sodalite.ide.ui/org.sodalite.ide.ui.views.parts.deployment.DeploymentView");
//		mPart.getTransientData().put("deployment", deployment);
		partService.showPart(mPart, PartState.ACTIVATE);

	}
}
