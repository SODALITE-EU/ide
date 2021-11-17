package org.sodalite.ide.ui.wizards.deleteDeployment;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;

public class DeleteDeploymentWizardMainPage extends WizardPage {
	private Spinner workersSpinner = null;

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

		setControl(container);
		setPageComplete(false);
	}

}
