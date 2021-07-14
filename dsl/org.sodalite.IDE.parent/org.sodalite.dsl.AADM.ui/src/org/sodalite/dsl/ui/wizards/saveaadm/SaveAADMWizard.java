package org.sodalite.dsl.ui.wizards.saveaadm;

import org.eclipse.jface.wizard.Wizard;

public class SaveAADMWizard extends Wizard {

	protected SaveAADMWizardMainPage mainPage;
	private String version = null;

	public SaveAADMWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "Save AADM";
	}

	@Override
	public void addPages() {
		mainPage = new SaveAADMWizardMainPage();
		addPage(mainPage);
	}

	@Override
	public boolean canFinish() {
		return true;
	}

	@Override
	public boolean performFinish() {
		// Get imageBuildConfPath
		this.version = mainPage.getVersion();

		return true;
	}

	public String getVersion() {
		return this.version;
	}

}
