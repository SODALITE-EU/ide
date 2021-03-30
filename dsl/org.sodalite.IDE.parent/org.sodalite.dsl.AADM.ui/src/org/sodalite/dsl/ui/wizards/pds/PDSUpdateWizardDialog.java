package org.sodalite.dsl.ui.wizards.pds;

import java.nio.file.Path;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class PDSUpdateWizardDialog extends WizardDialog {

	public PDSUpdateWizardDialog(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);

		Button finishButton = getButton(IDialogConstants.FINISH_ID);
		finishButton.setText("Update");

	}

	public Path getInputsFilePath() {
		return ((PDSUpdateWizard) this.getWizard()).getInputsFilePath();
	}

	public String getNamespace() {
		return ((PDSUpdateWizard) this.getWizard()).getNamespace();
	}

	public String getPlatformType() {
		return ((PDSUpdateWizard) this.getWizard()).getPlatformType();
	}

}
