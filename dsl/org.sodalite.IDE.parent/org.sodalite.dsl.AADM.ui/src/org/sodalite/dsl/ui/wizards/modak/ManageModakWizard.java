package org.sodalite.dsl.ui.wizards.modak;

import java.nio.file.Path;

import org.eclipse.jface.wizard.Wizard;

public class ManageModakWizard extends Wizard {

	protected ManageModakWizardMainPage mainPage;
	private Path definitionsFilePath = null;
	private String type = null;

	public ManageModakWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "Manage MODAK definitions";
	}

	@Override
	public void addPages() {
		mainPage = new ManageModakWizardMainPage();
		addPage(mainPage);
	}

	@Override
	public boolean canFinish() {
		return true;
	}

	@Override
	public boolean performFinish() {
		// Get imageBuildConfPath
		this.definitionsFilePath = mainPage.getDefinitionsFilePath();
		this.type = mainPage.getDefinitionType();

		return true;
	}

	public Path getDefinitionsFilePath() {
		return this.definitionsFilePath;
	}

	public String getType() {
		return this.type;
	}

}
