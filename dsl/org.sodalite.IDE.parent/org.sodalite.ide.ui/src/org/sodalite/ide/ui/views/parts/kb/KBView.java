package org.sodalite.ide.ui.views.parts.kb;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
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
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.kb_reasoner_client.types.Model;
import org.sodalite.dsl.kb_reasoner_client.types.ModelData;
import org.sodalite.dsl.kb_reasoner_client.types.ModuleData;
import org.sodalite.dsl.ui.backend.RMBackendProxy;
import org.sodalite.dsl.ui.helper.RMHelper;
import org.sodalite.ide.ui.helper.UIHelper;
import org.sodalite.ide.ui.logger.SodaliteLogger;
import org.sodalite.ide.ui.views.model.ModelNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class KBView {
	private Label myLabelInView;
	private Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	private TreeViewer viewer = null;
	private static KBView view = null;

	public KBView() {
		KBView.view = this;
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
		TreeNode<ModelNode> root = null;

		viewer.setInput(root);

		GridLayoutFactory.fillDefaults().generateLayout(parent);

		Job job = Job.create("Refreshing KB", (ICoreRunnable) monitor -> {
			try {
				TreeNode<ModelNode> uproot = populateKBContent();
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

	private TreeNode<ModelNode> populateKBContent() throws Exception {
		// Retrieve KB tree model (modules, models) from the KB Reasoner

		TreeNode<ModelNode> root = new TreeNode<>(new ModelNode("KB"));
		TreeNode<ModelNode> rms = root.addChild(new TreeNode<ModelNode>(new ModelNode("RMs")));
		TreeNode<ModelNode> aadms = root.addChild(new TreeNode<ModelNode>(new ModelNode("AADMs")));

		// RMs

		ModuleData moduleData = RMBackendProxy.getKBReasoner().getModules();
		for (String module : moduleData.getElements()) {
			module = parseModule(module);
			// RMs
			try {
				ModelData rmModelData = RMBackendProxy.getKBReasoner().getRMsInModule(module);
				if (!rmModelData.getElements().isEmpty()) {
					TreeNode<ModelNode> moduleNode = rms
							.addChild(new TreeNode<ModelNode>(new ModelNode(module, module)));
					for (Model model : rmModelData.getElements()) {
						String name = model.getName()
								+ (model.getVersion() != null ? "(version: " + model.getVersion() + ")" : "");
						moduleNode.addChild(new TreeNode<ModelNode>(new ModelNode(name, module, model)));
					}
				}
			} catch (SodaliteException ex) {
				if (!(ex.getCause() instanceof NotRolePermissionException))
					throw ex;
			}

			// AADMs
			try {
				ModelData aadmModelData = RMBackendProxy.getKBReasoner().getAADMsInModule(module);
				if (!aadmModelData.getElements().isEmpty()) {
					TreeNode<ModelNode> moduleNode = aadms
							.addChild(new TreeNode<ModelNode>(new ModelNode(module, module)));
					for (Model model : aadmModelData.getElements()) {
						String name = model.getName()
								+ (model.getVersion() != null ? "(version: " + model.getVersion() + ")" : "");
						moduleNode.addChild(new TreeNode<ModelNode>(new ModelNode(name, module, model)));
					}
				}
			} catch (SodaliteException ex) {
				if (!(ex.getCause() instanceof NotRolePermissionException))
					throw ex;
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
						TreeNode<ModelNode> tn = (TreeNode<ModelNode>) ts.getFirstElement();
						ModelNode node = (ModelNode) tn.getData();
						createGeneralContextualMenu(manager, tn);
						if (node.isModule()) {
							createModuleContextualMenu(manager, tn);
						} else if (node.isModel()) {
							createModelContextualMenu(manager, tn);
						}
					}
				}
			}

			private void createGeneralContextualMenu(IMenuManager manager, TreeNode<ModelNode> tn) {
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

			private void createModuleContextualMenu(IMenuManager manager, TreeNode<ModelNode> tn) {
				ModelNode node = (ModelNode) tn.getData();

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
									IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
									IProject[] projects = wsRoot.getProjects();
									IProject targetProject = null;
									IContainer targetFolder = null;
									for (IProject project : projects) {
										if (project.getFullPath().equals(path)) {
											targetProject = project;
											break;
										}
									}
									if (targetProject != null) {
										targetFolder = targetProject;
									} else {
										targetFolder = root.getFolder(path);
									}
									// For each model in module, copy it into the target module folder
									// Manage different version of a model
									for (Model model : modelData.getElements()) {
										String name = UIHelper.getFileName(model.getName())
												+ (model.getVersion() != null ? "_" + model.getVersion() : "")
												+ UIHelper.getExtension(model.getName());
										RMHelper.saveFileInFolder(name, model.getDsl(), targetFolder);
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
						deleteModelsInModule(tn, node);
					}
				};
				deleteAction.setText("Delete module ...");
				manager.add(deleteAction);
			}

			private void createModelContextualMenu(IMenuManager manager, TreeNode<ModelNode> tn) {
				ModelNode node = (ModelNode) tn.getData();

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
							IWorkspaceRoot wsRoot = ResourcesPlugin.getWorkspace().getRoot();
							IProject[] projects = wsRoot.getProjects();
							IProject targetProject = null;
							IContainer targetFolder = null;
							for (IProject project : projects) {
								if (project.getFullPath().equals(path)) {
									targetProject = project;
									break;
								}
							}
							if (targetProject != null) {
								targetFolder = targetProject;
							} else {
								targetFolder = root.getFolder(path);
							}
							String name = UIHelper.getFileName(node.getModel().getName())
									+ (node.getModel().getVersion() != null ? "_" + node.getModel().getVersion() : "")
									+ UIHelper.getExtension(node.getModel().getName());
							RMHelper.saveFileInFolder(name, node.getModel().getDsl(), targetFolder);
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
						deleteModel(tn, node);
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
				TreeNode<ModelNode> root = populateKBContent();
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

	private void deleteModel(TreeNode<ModelNode> tn, ModelNode node) {
		boolean confirmed = MessageDialog.openConfirm(shell, "Delete model",
				"Do you want to delete model " + node.getModel().getName());
		if (confirmed) {
			Job job = Job.create("Delete model", (ICoreRunnable) monitor -> {
				try {
					RMBackendProxy.getKBReasoner().deleteModel(node.getModel().getUri().toString(),
							node.getModel().getVersion());
					// Refresh KB View
					Display.getDefault().asyncExec(new Runnable() {
						@Override
						public void run() {
							tn.getParent().removeChild(tn);
							viewer.refresh();
						}
					});
					showDialog("Delete model", "Model " + node.getModel().getName() + " successfully deleted");
				} catch (Exception e) {
					showErrorDialog("Delete model", "Model could not be deleted");
					SodaliteLogger.log(e);
				}
			});
			job.setPriority(Job.SHORT);
			job.schedule();
		}
	}

	private void deleteModelsInModule(TreeNode<ModelNode> tn, ModelNode node) {
		try {
			String module = node.getModule();
			final ModelData modelData;
			if (tn.getParent().getData().getLabel().contains("RMs")) {
				modelData = RMBackendProxy.getKBReasoner().getRMsInModule(module);
			} else if (tn.getParent().getData().getLabel().contains("AADMs")) {
				modelData = RMBackendProxy.getKBReasoner().getAADMsInModule(module);
			} else {
				modelData = null;
			}
			if (modelData != null && !modelData.getElements().isEmpty()) {
				boolean confirmed = MessageDialog.openConfirm(shell, "Delete models in module",
						"Do you want to delete all the models in module " + module);
				if (confirmed) {
					Job job = Job.create("Delete models in module", (ICoreRunnable) monitor -> {
						try {
							// For each model in module, delete it
							for (Model model : modelData.getElements()) {
								RMBackendProxy.getKBReasoner().deleteModel(model.getUri().toString(),
										model.getVersion());
							}
							// Refresh KB View
							Display.getDefault().asyncExec(new Runnable() {
								@Override
								public void run() {
									tn.getParent().removeChild(tn);
									viewer.refresh();
								}
							});
							showDialog("Delete models in Module",
									"Models in module " + module + " successfully deleted");
						} catch (Exception e) {
							showErrorDialog("Delete model", "Models in module " + module + " could not be deleted");
							SodaliteLogger.log(e);
						}
					});
					job.setPriority(Job.SHORT);
					job.schedule();
				}
			}
		} catch (Exception ex) {
			SodaliteLogger.log("Error", ex);
		}
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
