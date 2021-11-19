package org.sodalite.ide.ui.wizards.deleteBlueprint;

import org.eclipse.jface.wizard.Wizard;

public class DeleteBlueprintWizard extends Wizard {

	protected DeleteBlueprintWizardMainPage mainPage;

	private boolean force = false;

	public DeleteBlueprintWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "Delete Application blueprint";
	}

	@Override
	public void addPages() {
		mainPage = new DeleteBlueprintWizardMainPage();
		addPage(mainPage);
	}

	@Override
	public boolean canFinish() {
		return true;
	}

	@Override
	public boolean performFinish() {
		this.force = mainPage.getForce();
		return true;
	}

	public boolean getForce() {
		return this.force;
	}

}
