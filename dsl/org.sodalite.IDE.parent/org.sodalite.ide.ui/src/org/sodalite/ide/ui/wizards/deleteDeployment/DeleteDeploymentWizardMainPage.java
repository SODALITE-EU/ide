package org.sodalite.ide.ui.wizards.deleteDeployment;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;

public class DeleteDeploymentWizardMainPage extends WizardPage {
	private Spinner workersSpinner = null;
	private Button forceCB = null;
	private Button deleteCB = null;

	protected DeleteDeploymentWizardMainPage() {
		super("Undeploy application");
		setTitle("Undeploy application");
		setDescription("Initiate the process for application updeployment");
	}

	public int getWorkers() {
		try {
			return Integer.valueOf(this.workersSpinner.getText());
		} catch (Exception ex) {
			return 0;
		}
	}

	public boolean getForce() {
		return this.forceCB.getSelection();
	}

	public boolean getDelete() {
		return this.deleteCB.getSelection();
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.swtDefaults().numColumns(3).create());

		// Workers
		Label workersLabel = new Label(container, SWT.NONE);
		workersLabel.setText("Number orchestrator workers for application undeployment (optional):");

		workersSpinner = new Spinner(container, SWT.BORDER | SWT.SINGLE);
		GridData workersGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		workersSpinner.setLayoutData(workersGridData);
		workersSpinner.setMinimum(0);
		workersSpinner.setSelection(1);

		// Force undeployment
		Label forceLabel = new Label(container, SWT.NONE);
		forceLabel.setText("Force undeployment:");
		forceLabel.setToolTipText(
				"Ask orchestrator to force the application undeployment even if not all allocated resources can be released");

		forceCB = new Button(container, SWT.CHECK);
		GridData forceGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		forceCB.setLayoutData(forceGridData);

		// Delete deployment
		Label deleteLabel = new Label(container, SWT.NONE);
		deleteLabel.setText("Delete deployment:");
		deleteLabel.setToolTipText("Ask orchestrator to delete the deployment after being undeployed");

		deleteCB = new Button(container, SWT.CHECK);
		GridData deleteGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		deleteCB.setLayoutData(deleteGridData);

		setControl(container);
		setPageComplete(false);
	}

}
