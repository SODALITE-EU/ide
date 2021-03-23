package org.sodalite.dsl.ui.wizards.pds;

import java.nio.file.Path;

import org.eclipse.jface.wizard.Wizard;

public class PDSUpdateWizard extends Wizard {

	protected PDSUpdateWizardMainPage mainPage;
	private Path inputsFilePath = null;
	private String namespace = null;
	private String platformType = null;

	public PDSUpdateWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "Platform Discovery Service - update";
	}

	@Override
	public void addPages() {
		mainPage = new PDSUpdateWizardMainPage();
		addPage(mainPage);
	}

	@Override
	public boolean canFinish() {
		return mainPage.getInputsFilePath() != null && mainPage.getNamespace() != null
				&& mainPage.getPlatformType() != null;
	}

	@Override
	public boolean performFinish() {
		// Get imageBuildConfPath
		this.inputsFilePath = mainPage.getInputsFilePath();
		this.namespace = mainPage.getNamespace();
		this.platformType = mainPage.getPlatformType();

		return true;
	}

	public Path getInputsFilePath() {
		return this.inputsFilePath;
	}

	public String getNamespace() {
		return this.namespace;
	}

	public String getPlatformType() {
		return this.platformType;
	}

}
