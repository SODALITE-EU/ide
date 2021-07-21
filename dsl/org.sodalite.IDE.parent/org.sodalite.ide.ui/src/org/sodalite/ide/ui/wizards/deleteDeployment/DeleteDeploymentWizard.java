package org.sodalite.ide.ui.wizards.deleteDeployment;

import org.eclipse.jface.wizard.Wizard;

public class DeleteDeploymentWizard extends Wizard {

	protected DeleteDeploymentWizardMainPage mainPage;

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
		return true;
	}

	@Override
	public boolean performFinish() {
		// Get workers
		this.workers = mainPage.getWorkers();

		return true;
	}

	public int getWorkers() {
		return this.workers;
	}

}
