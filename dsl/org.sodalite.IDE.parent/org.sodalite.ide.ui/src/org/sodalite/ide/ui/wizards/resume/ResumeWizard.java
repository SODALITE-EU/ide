package org.sodalite.ide.ui.wizards.resume;

import java.nio.file.Path;

import org.eclipse.jface.wizard.Wizard;

public class ResumeWizard extends Wizard {

	protected ResumeWizardMainPage mainPage;
	private Path inputsFile = null;
	private int workers = 0;
	private boolean clean_state = false;

	public ResumeWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "Resume Deployment";
	}

	@Override
	public void addPages() {
		mainPage = new ResumeWizardMainPage();
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

		// Clean state
		this.clean_state = mainPage.getCleanState();

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

	public boolean getCleanState() {
		return this.clean_state;
	}

}
