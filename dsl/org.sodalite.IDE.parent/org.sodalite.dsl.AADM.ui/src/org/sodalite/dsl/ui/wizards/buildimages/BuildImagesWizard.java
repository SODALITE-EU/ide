package org.sodalite.dsl.ui.wizards.buildimages;

import java.nio.file.Path;

import org.eclipse.jface.wizard.Wizard;

public class BuildImagesWizard extends Wizard {

	protected BuildImagesWizardMainPage mainPage;
	private Path imageBuildConfPath = null;

	public BuildImagesWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "Build images";
	}

	@Override
	public void addPages() {
		mainPage = new BuildImagesWizardMainPage();
		addPage(mainPage);
	}

	@Override
	public boolean canFinish() {
		return mainPage.getImageBuildConfPath() != null;
	}

	@Override
	public boolean performFinish() {
		// Get imageBuildConfPath
		this.imageBuildConfPath = mainPage.getImageBuildConfPath();

		return true;
	}

	public Path getImageBuildConfPath() {
		return this.imageBuildConfPath;
	}

}
