package org.sodalite.dsl.ui.wizards.buildimages;

import java.nio.file.Path;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class BuildImagesWizardDialog extends WizardDialog {

	public BuildImagesWizardDialog(Shell parentShell, IWizard newWizard) {
		super(parentShell, newWizard);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);

		Button finishButton = getButton(IDialogConstants.FINISH_ID);
		finishButton.setText("Build Images");

	}

	public Path getImageBuildConfPath() {
		return ((BuildImagesWizard) this.getWizard()).getImageBuildConfPath();
	}

}
