package org.sodalite.ide.ui.wizards.deleteDeployment;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class DeleteDeploymentWizardDialog extends WizardDialog {

	public DeleteDeploymentWizardDialog(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);

		Button finishButton = getButton(IDialogConstants.FINISH_ID);
		finishButton.setText("Undeploy");

	}

	public int getWorkers() {
		return ((DeleteDeploymentWizard) this.getWizard()).getWorkers();
	}

}
