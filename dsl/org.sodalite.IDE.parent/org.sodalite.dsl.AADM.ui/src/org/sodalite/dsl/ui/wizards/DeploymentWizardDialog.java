package org.sodalite.dsl.ui.wizards;

import java.nio.file.Path;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class DeploymentWizardDialog extends WizardDialog {

	public DeploymentWizardDialog(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);

		Button finishButton = getButton(IDialogConstants.FINISH_ID);
		finishButton.setText("Deploy");

	}
	
	public Path getInputsFile (){
		return ((DeploymentWizard) this.getWizard()).getInputsFile();
	}

}
