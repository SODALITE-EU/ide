package org.sodalite.ide.ui.wizards.deleteDeployment;

import java.nio.file.Path;

import org.eclipse.jface.wizard.Wizard;

public class DeleteDeploymentWizard extends Wizard {

	protected DeleteDeploymentWizardMainPage mainPage;
	private Path inputsFile = null;
	private int workers = 0;

	public DeleteDeploymentWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "Delete Deployment";
	}

	@Override
	public void addPages() {
		mainPage = new DeleteDeploymentWizardMainPage();
		addPage(mainPage);
	}

	@Override
	public boolean canFinish() {
		return mainPage.getInputsFile() != null;
	}

	@Override
	public boolean performFinish() {

		// Get workers
		this.workers = mainPage.getWorkers();

		// Inputs file
		this.inputsFile = mainPage.getInputsFile();

		return true;
	}

	public Path getInputsFile() {
		return this.inputsFile;
	}

	public int getWorkers() {
		return this.workers;
	}

}
