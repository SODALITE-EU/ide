package org.sodalite.ide.ui.wizards.deleteBlueprint;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class DeleteBlueprintWizardMainPage extends WizardPage {
	private Button forceCB = null;

	protected DeleteBlueprintWizardMainPage() {
		super("Delete application blueprint");
		setTitle("Delete application blueprint");
		setDescription("Initiate the process for application blueprint deletion");
	}

	public boolean getForce() {
		return this.forceCB.getSelection();
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.swtDefaults().numColumns(3).create());

		// Force deletion
		Label forceLabel = new Label(container, SWT.NONE);
		forceLabel.setText("Force deletion:");
		forceLabel.setToolTipText(
				"Ask orchestrator to force the application blueprint deletion even if it owns active deployments, which will be undeployed");

		forceCB = new Button(container, SWT.CHECK);
		GridData forceGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		forceCB.setLayoutData(forceGridData);

		setControl(container);
		setPageComplete(false);
	}

}
