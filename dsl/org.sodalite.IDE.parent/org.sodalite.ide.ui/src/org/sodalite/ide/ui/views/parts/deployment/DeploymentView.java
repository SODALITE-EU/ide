package org.sodalite.ide.ui.views.parts.deployment;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
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
import org.sodalite.dsl.ui.backend.RMBackendProxy;
import org.sodalite.ide.ui.logger.SodaliteLogger;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class DeploymentView {
	private Label myLabelInView;
	private Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	private TreeViewer viewer = null;
	private static DeploymentView view = null;

	public DeploymentView() {
		DeploymentView.view = this;
	}

	public static DeploymentView getView() {
		return view;
	}

	@PostConstruct
	public void createPartControl(Composite parent) throws Exception {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new DeploymentContentProvider());
		viewer.getTree().setHeaderVisible(true);
		viewer.getTree().setLinesVisible(true);

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
		projectDomainColumn.getColumn().setText("Project Domain");
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
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							MessageDialog.openInformation(shell, "Sodalite Deployment Governance View",
									"Selected deployment: " + node.getData().getDeployment().getDeployment_id());
						}
					});
				}
			}
		});

		viewer.getTree().addListener(SWT.Expand, listener);

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
		// TODO Retrieve user's blueprints and deployments from xOpera
		TreeNode<DeploymentNode> root = new TreeNode<>(new DeploymentNode("Blueprints"));

		// FIXME get IDE user for preferences
		String username = "user_1";

		try {
			BlueprintData blueprintData = RMBackendProxy.getKBReasoner().getBlueprintsForUser(username);
			if (!blueprintData.getElements().isEmpty()) {
				for (Blueprint blueprint : blueprintData.getElements()) {
					TreeNode<DeploymentNode> node = root
							.addChild(new TreeNode<DeploymentNode>(new DeploymentNode(blueprint)));

					DeploymentData deploymentData = RMBackendProxy.getKBReasoner()
							.getDeploymentsForBlueprint(blueprint.getBlueprint_id());
					for (Deployment deployment : deploymentData.getElements()) {
						node.addChild(new TreeNode<DeploymentNode>(new DeploymentNode(deployment)));
					}
				}

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
					}
				}
			}

			private void createGeneralContextualMenu(IMenuManager manager, TreeNode<DeploymentNode> tn) {
				// ACTION: Refresh KB
				// workspace
				Action refreshAction = new Action() {
					public void run() {
						refreshKB();
					}
				};
				refreshAction.setText("Refresh Deployments");
				manager.add(refreshAction);
			}

//			private void createModuleContextualMenu(IMenuManager manager, TreeNode<DeploymentNode> tn) {
////				DeploymentNode node = (DeploymentNode) tn.getData();
//
//				// ACTION: Retrieve all models in a module from KB (upload them into the
//				// workspace)
//				Action retrieveAction = new Action() {
//					public void run() {
//
//					}
//				};
//				retrieveAction.setText("Retrieve module ...");
//				manager.add(retrieveAction);
//
//				// ACTION: Delete all models in a module from KB
//				Action deleteAction = new Action() {
//					public void run() {
//
//					}
//				};
//				deleteAction.setText("Delete module ...");
//				manager.add(deleteAction);
//			}

//			private void createModelContextualMenu(IMenuManager manager, TreeNode<DeploymentNode> tn) {
//				DeploymentNode node = (DeploymentNode) tn.getData();
//
//				// ACTION: Retrieve model from KB (upload it into the workspace)
//				Action retrieveAction = new Action() {
//					public void run() {
//
//					}
//				};
//				retrieveAction.setText("Retrieve model ...");
//				manager.add(retrieveAction);
//
//				// ACTION: Delete model from KB
//				Action deleteAction = new Action() {
//					public void run() {
//
//					}
//				};
//				deleteAction.setText("Delete model ...");
//				manager.add(deleteAction);
//			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getTree());
		viewer.getTree().setMenu(menu);
	}

//	@Focus
//	public void setFocus() {
//		myLabelInView.setFocus();
//	}

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

	public void refreshKB() {
		Job job = Job.create("Refresh KB", (ICoreRunnable) monitor -> {
			try {
				TreeNode<DeploymentNode> root = retrieveDeploymentContent();
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						viewer.setInput(root);
						viewer.refresh();
					}
				});
				showDialog("KB Update", "The KB Browser was refreshed from KB");
			} catch (Exception e) {
				showErrorDialog("KB Update", "The KB Browser could not be refreshed from KB");
				SodaliteLogger.log(e);
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
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
}
