package org.sodalite.dsl.ui.wizards;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class AlertingRulesWizardDialog extends WizardDialog {
	private String buttonLabel;

	public AlertingRulesWizardDialog(Shell parentShell, IWizard newWizard, String buttonLabel) {
		super(parentShell, newWizard);
		this.buttonLabel = buttonLabel;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);

		Button finishButton = getButton(IDialogConstants.FINISH_ID);
		finishButton.setText(buttonLabel);

	}

	public String getMonitoringId() {
		return ((AlertingRulesWizard) this.getWizard()).getMonitoringId();
	}

}
