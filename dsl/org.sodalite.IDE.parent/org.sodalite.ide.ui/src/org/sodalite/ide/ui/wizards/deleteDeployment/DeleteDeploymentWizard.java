package org.sodalite.ide.ui.wizards.deleteDeployment;

import org.eclipse.jface.wizard.Wizard;

public class DeleteDeploymentWizard extends Wizard {

	protected DeleteDeploymentWizardMainPage mainPage;

	private int workers = 0;
	private boolean force = false;

	public DeleteDeploymentWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "Undeploy Application";
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
		this.workers = mainPage.getWorkers();
		this.force = mainPage.getForce();

		return true;
	}

	public int getWorkers() {
		return this.workers;
	}

	public boolean getForce() {
		return this.force;
	}

}
