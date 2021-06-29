package org.sodalite.ide.ui.views.parts.deployment;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.IServiceConstants;
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
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.kb_reasoner_client.types.Deployment;
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
	public void createPartControl(Composite parent, MApplication application) throws Exception {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		viewer.setContentProvider(new BlueprintContentProvider());
		viewer.getTree().setHeaderVisible(true);
		viewer.getTree().setLinesVisible(true);

		// Deployment Id column
		TreeViewerColumn idColumn = new TreeViewerColumn(viewer, SWT.NONE);
		idColumn.getColumn().setWidth(350);
		idColumn.getColumn().setText("Id");
		idColumn.setLabelProvider(new DelegatingStyledCellLabelProvider(new IdLabelProvider()));

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

		viewer.getTree().addListener(SWT.Expand, listener);

		// Menu
		createContextMenu(viewer);

		// Model
//		MTrimmedWindow window = (MTrimmedWindow) application.getChildren().get(0);
//		EPartService partService = window.getContext().get(EPartService.class);
//		MPart mPart = partService.findPart("deployment.details.view.id");
//		Deployment deployment = (Deployment) mPart.getTransientData().get("deployment");
		Deployment deployment = BlueprintView.getSelectedDeployment();

		TreeNode<DeploymentNode> root = new TreeNode<>(
				new DeploymentNode("Deployment: " + deployment.getDeployment_id()));
		root.addChild(new TreeNode<DeploymentNode>(new DeploymentNode(deployment)));

		viewer.setInput(root);
		viewer.refresh();

		GridLayoutFactory.fillDefaults().generateLayout(parent);
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
						TreeNode<DeploymentNode> tn = (TreeNode) ts.getFirstElement();
//						DeploymentNode node = (DeploymentNode) tn.getData();
						createGeneralContextualMenu(manager, tn);
					}
				}
			}

			private void createGeneralContextualMenu(IMenuManager manager, TreeNode<DeploymentNode> tn) {
				// ACTION:

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
