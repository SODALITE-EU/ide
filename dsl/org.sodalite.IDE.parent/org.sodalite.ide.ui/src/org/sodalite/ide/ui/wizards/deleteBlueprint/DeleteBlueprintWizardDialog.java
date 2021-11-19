package org.sodalite.ide.ui.wizards.deleteBlueprint;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class DeleteBlueprintWizardDialog extends WizardDialog {

	public DeleteBlueprintWizardDialog(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);

		Button finishButton = getButton(IDialogConstants.FINISH_ID);
		finishButton.setText("Delete");

	}

	public boolean getForce() {
		return ((DeleteBlueprintWizard) this.getWizard()).getForce();
	}

}
