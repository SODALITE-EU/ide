package org.sodalite.ide.ui.views.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.ICoreRunnable;
import org.eclipse.core.runtime.IPath;
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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException;
import org.sodalite.dsl.kb_reasoner_client.types.Model;
import org.sodalite.dsl.kb_reasoner_client.types.ModelData;
import org.sodalite.dsl.kb_reasoner_client.types.ModuleData;
import org.sodalite.dsl.ui.backend.RMBackendProxy;
import org.sodalite.dsl.ui.helper.RMHelper;
import org.sodalite.ide.ui.logger.SodaliteLogger;
import org.sodalite.ide.ui.views.model.Node;
import org.sodalite.ide.ui.views.model.TreeNode;

public class KBView {
	private Label myLabelInView;
	private Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	private TreeViewer viewer = null;
	private static KBView view = null;

	public KBView() {
		this.view = this;
	}

	public static KBView getView() {
		return view;
	}

	@PostConstruct
	public void createPartControl(Composite parent) throws Exception {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL);
		viewer.setContentProvider(new KBContentProvider());
		viewer.getTree().setHeaderVisible(true);
		viewer.getTree().setLinesVisible(true);

		TreeViewerColumn viewerColumn = new TreeViewerColumn(viewer, SWT.NONE);
		viewerColumn.getColumn().setWidth(300);
		viewerColumn.getColumn().setText("KB Content");
		viewerColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new KBLabelProvider()));

		// Menu
		createContextMenu(viewer);

		// Model
		TreeNode<Node> root = null;

		viewer.setInput(root);

		GridLayoutFactory.fillDefaults().generateLayout(parent);

		Job job = Job.create("Refreshing KB", (ICoreRunnable) monitor -> {
			try {
				TreeNode<Node> uproot = populateKBContent();
				Display.getDefault().asyncExec(new Runnable() {
					@Override
					public void run() {
						viewer.setInput(uproot);
						viewer.refresh();
					}
				});
			} catch (Exception e) {
				showErrorDialog("KB Update", "The KB Browser could not be refreshed from KB");
				SodaliteLogger.log(e);
			}
		});
		job.setPriority(Job.SHORT);
		job.schedule();
	}

	private TreeNode<Node> populateKBContent() throws Exception {
		// Retrieve KB tree model (modules, models) from the KB Reasoner

		TreeNode<Node> root = new TreeNode<>(new Node("KB"));
		TreeNode<Node> rms = root.addChild(new TreeNode<Node>(new Node("RMs")));
		TreeNode<Node> aadms = root.addChild(new TreeNode<Node>(new Node("AADMs")));

		// RMs

		ModuleData moduleData = RMBackendProxy.getKBReasoner().getModules();
		for (String module : moduleData.getElements()) {
			module = parseModule(module);
			// RMs
			try {
				ModelData rmModelData = RMBackendProxy.getKBReasoner().getRMsInModule(module);
				if (!rmModelData.getElements().isEmpty()) {
					TreeNode<Node> moduleNode = rms.addChild(new TreeNode<Node>(new Node(module, module)));
					for (Model model : rmModelData.getElements()) {
						moduleNode.addChild(new TreeNode<Node>(new Node(model.getName(), module, model)));
					}
				}
			} catch (NotRolePermissionException ex) {
				// Ignored
			}

			// AADMs
			try {
				ModelData aadmModelData = RMBackendProxy.getKBReasoner().getAADMsInModule(module);
				if (!aadmModelData.getElements().isEmpty()) {
					TreeNode<Node> moduleNode = aadms.addChild(new TreeNode<Node>(new Node(module, module)));
					for (Model model : aadmModelData.getElements()) {
						moduleNode.addChild(new TreeNode<Node>(new Node(model.getName(), module, model)));
					}
				}
			} catch (NotRolePermissionException ex) {
				// Ignored
			}
		}
		return root;
	}

	private String parseModule(String module) {
		return getLastSegment(module, "/");
	}

	private String getLastSegment(String string, String delimiter) {
		String[] splits = string.split(delimiter);
		return splits[splits.length - 1];
	}

	private void raiseConfigurationIssue(String message) throws Exception {
		Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openError(parent, "Sodalite Preferences Error",
						message + " in Sodalite preferences pages");
			}
		});
		throw new Exception(message + " in Sodalite preferences pages");
	}

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
						TreeNode tn = (TreeNode) ts.getFirstElement();
						Node node = (Node) tn.getData();
						createGeneralContextualMenu(manager, tn);
						if (node.isModule()) {
							createModuleContextualMenu(manager, tn);
						} else if (node.isModel()) {
							createModelContextualMenu(manager, tn);
						}
					}
				}
			}

			private void createGeneralContextualMenu(IMenuManager manager, TreeNode<Node> tn) {
				// ACTION: Refresh KB
				// workspace
				Action refreshAction = new Action() {
					public void run() {
						refreshKB();
					}
				};
				refreshAction.setText("Refresh KB");
				manager.add(refreshAction);
			}

			private void createModuleContextualMenu(IMenuManager manager, TreeNode<Node> tn) {
				Node node = (Node) tn.getData();

				// ACTION: Retrieve all models in a module from KB (upload them into the
				// workspace)
				Action retrieveAction = new Action() {
					public void run() {
						System.out.println("Retrieve module invoked");

						// Get models in module
						try {
							String module = node.getModule();
							ModelData modelData = null;
							if (tn.getParent().getData().getLabel().contains("RMs")) {
								modelData = RMBackendProxy.getKBReasoner().getRMsInModule(module);
							} else if (tn.getParent().getData().getLabel().contains("AADMs")) {
								modelData = RMBackendProxy.getKBReasoner().getAADMsInModule(module);
							}
							if (modelData != null && !modelData.getElements().isEmpty()) {
								// Prompt user to select the target folder
								IContainer root = RMHelper.getWorkspaceRoot();
								String msg = "Select a workspace folder where to upload the models of the selected module";
								ContainerSelectionDialog dialog = new ContainerSelectionDialog(shell, root, false, msg);
								int return_code = dialog.open();
								if (return_code == ContainerSelectionDialog.OK) {
									Object[] result = dialog.getResult();
									// Create a folder with module name in target folder
									if (result.length == 0)
										return;
									IPath path = (IPath) result[0];
									IFolder targetFolder = root.getFolder(path);
									targetFolder = targetFolder.getFolder(module);
									if (!targetFolder.exists()) {
										targetFolder.create(false, false, null);
									}
									// For each model in module, copy it into the target module folder
									for (Model model : modelData.getElements()) {
										RMHelper.saveFileInFolder(model.getName(), model.getDsl(), targetFolder);
									}
									MessageDialog.openInformation(shell, "Retrieve module", "Models in module " + module
											+ " successfully copied into " + targetFolder.getName() + " folder");
								}
							}
						} catch (Exception ex) {
							SodaliteLogger.log("Error", ex);
						}
					}
				};
				retrieveAction.setText("Retrieve module ...");
				manager.add(retrieveAction);

				// ACTION: Delete all models in a module from KB
				Action deleteAction = new Action() {
					public void run() {
						try {
							System.out.println("Delete module invoked");
							String module = node.getModule();
							ModelData modelData = null;
							if (tn.getParent().getData().getLabel().contains("RMs")) {
								modelData = RMBackendProxy.getKBReasoner().getRMsInModule(module);
							} else if (tn.getParent().getData().getLabel().contains("AADMs")) {
								modelData = RMBackendProxy.getKBReasoner().getAADMsInModule(module);
							}
							if (modelData != null && !modelData.getElements().isEmpty()) {
								boolean confirmed = MessageDialog.openConfirm(shell, "Delete models in module",
										"Do you want to delete all the models in module " + module);
								if (confirmed) {
									try {
										// For each model in module, delete it
										for (Model model : modelData.getElements()) {
											RMBackendProxy.getKBReasoner().deleteModel(model.getUri().toString());
										}

										// Refresh KB View
										tn.getParent().removeChild(tn);
										viewer.refresh();

										MessageDialog.openInformation(shell, "Delete model",
												"Models in module " + module + " successfully deleted");
									} catch (Exception e) {
										SodaliteLogger.log("Error", e);
									}
								}
							}
						} catch (Exception ex) {
							SodaliteLogger.log("Error", ex);
						}
					}
				};
				deleteAction.setText("Delete module ...");
				manager.add(deleteAction);
			}

			private void createModelContextualMenu(IMenuManager manager, TreeNode<Node> tn) {
				Node node = (Node) tn.getData();

				// ACTION: Retrieve model from KB (upload it into the workspace)
				Action retrieveAction = new Action() {
					public void run() {
						System.out.println("Retrieve model invoked");
						// Show Dialog to select workspace folder where to copy the model
						IContainer root = RMHelper.getWorkspaceRoot();
						String msg = "Select a workspace folder where to upload the selected model";
						ContainerSelectionDialog dialog = new ContainerSelectionDialog(shell, root, false, msg);
						int return_code = dialog.open();
						if (return_code == ContainerSelectionDialog.OK) {
							Object[] result = dialog.getResult();
							// Copy model content into target folder
							if (result.length == 0)
								return;
							IPath path = (IPath) result[0];
							IFolder targetFolder = root.getFolder(path);
							RMHelper.saveFileInFolder(node.getModel().getName(), node.getModel().getDsl(),
									targetFolder);
							MessageDialog.openInformation(shell, "Retrieve model", "Model " + node.getModel().getName()
									+ " successfully copied into " + targetFolder.getName() + " folder");
						}
					}
				};
				retrieveAction.setText("Retrieve model ...");
				manager.add(retrieveAction);

				// ACTION: Delete model from KB
				Action deleteAction = new Action() {
					public void run() {
						// the action code
						System.out.println("Delete model invoked");

						boolean confirmed = MessageDialog.openConfirm(shell, "Delete model",
								"Do you want to delete model " + node.getModel().getName());
						if (confirmed) {
							try {
								RMBackendProxy.getKBReasoner().deleteModel(node.getModel().getUri().toString());
								// Refresh KB View
								tn.getParent().removeChild(tn);
								viewer.refresh();

								MessageDialog.openInformation(shell, "Delete model",
										"Model " + node.getModel().getName() + " successfully deleted");
							} catch (Exception e) {
								SodaliteLogger.log("Error", e);
							}
						}
					}
				};
				deleteAction.setText("Delete model ...");
				manager.add(deleteAction);
			}
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
				TreeNode<Node> root = populateKBContent();
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
