package org.sodalite.ide.ui.views.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.sodalite.ide.ui.views.model.Node;

public class KBView {
	private Label myLabelInView;

	@PostConstruct
	public void createPartControl(Composite parent) {
		TreeViewer viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL);
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
		// FIXME Retrieve KB tree model (modules, models) from the KB Reasoner

		Node<String> root = new Node<>("KB");
		Node<String> rms = root.addChild(new Node<String>("RMs"));
		Node<String> aadms = root.addChild(new Node<String>("AADMs"));

		// RMs

		Node<String> rm_docker_module = rms.addChild(new Node<String>("docker"));
		Node<String> rm_openstack_module = rms.addChild(new Node<String>("openstack"));
		Node<String> rm_hpc_module = rms.addChild(new Node<String>("hpc"));

		rm_docker_module.addChild(new Node<String>("docker_certificate.rm"));
		rm_docker_module.addChild(new Node<String>("docker_registry.rm"));
		rm_docker_module.addChild(new Node<String>("docker_volume.rm"));

		rm_openstack_module.addChild(new Node<String>("openstack_vm.rm"));
		rm_openstack_module.addChild(new Node<String>("openstack_security_rule.rm"));

		rm_hpc_module.addChild(new Node<String>("data_mover.rm"));
		rm_hpc_module.addChild(new Node<String>("docker_registry.rm"));

		// AADMs
		Node<String> aadm_snow_module = aadms.addChild(new Node<String>("snow"));
		aadm_snow_module.addChild(new Node<String>("snow.aadm"));

		Node<String> aadm_vehicle_module = aadms.addChild(new Node<String>("vehicleiot"));
		aadm_vehicle_module.addChild(new Node<String>("vehicleiot.aadm"));

		viewer.setInput(root);

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
						Node fs = (Node) ts.getFirstElement();
						String data = (String) fs.getData();
						if (data.contains(".rm") || data.contains(".aadm")) {
							createModelContextualMenu(manager);
						} else if (!((data.contains("RMs") || data.contains("AADMs")))) {
							createModuleContextualMenu(manager);
						}
					}
				}
			}

			private void createModuleContextualMenu(IMenuManager manager) {
				Action retrieveAction = new Action() {
					public void run() {
						// the action code
						System.out.println("Retrieve module invoked");
					}
				};
				retrieveAction.setText("Retrieve module ...");
				manager.add(retrieveAction);

				Action deleteAction = new Action() {
					public void run() {
						// the action code
						System.out.println("Delete module invoked");
					}
				};
				deleteAction.setText("Delete module ...");
				manager.add(deleteAction);
			}

			private void createModelContextualMenu(IMenuManager manager) {
				Action retrieveAction = new Action() {
					public void run() {
						// the action code
						System.out.println("Retrieve model invoked");
					}
				};
				retrieveAction.setText("Retrieve model ...");
				manager.add(retrieveAction);

				Action deleteAction = new Action() {
					public void run() {
						// the action code
						System.out.println("Delete model invoked");
					}
				};
				deleteAction.setText("Delete model ...");
				manager.add(deleteAction);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getTree());
		viewer.getTree().setMenu(menu);
	}

	@Focus
	public void setFocus() {
		myLabelInView.setFocus();

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
}
