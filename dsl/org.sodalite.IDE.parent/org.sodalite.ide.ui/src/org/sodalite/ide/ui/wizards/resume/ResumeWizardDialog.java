package org.sodalite.ide.ui.wizards.resume;

import java.nio.file.Path;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class ResumeWizardDialog extends WizardDialog {

	public ResumeWizardDialog(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);

		Button finishButton = getButton(IDialogConstants.FINISH_ID);
		finishButton.setText("Resume");

	}

	public Path getInputsFile() {
		return ((ResumeWizard) this.getWizard()).getInputsFile();
	}

	public int getWorkers() {
		return ((ResumeWizard) this.getWizard()).getWorkers();
	}

	public boolean getCleanState() {
		return ((ResumeWizard) this.getWizard()).getCleanState();
	}

}
