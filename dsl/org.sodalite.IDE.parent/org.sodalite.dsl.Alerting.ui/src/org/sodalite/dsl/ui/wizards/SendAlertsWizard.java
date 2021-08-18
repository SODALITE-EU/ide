package org.sodalite.dsl.ui.wizards;

import java.util.List;

import org.eclipse.jface.wizard.Wizard;
import org.sodalite.dsl.kb_reasoner_client.types.Deployment;

public class SendAlertsWizard extends Wizard {

	protected SendAlertsWizardMainPage mainPage;
	private String monitoringId = null;
	private List<Deployment> deployments;

	public SendAlertsWizard(List<Deployment> deployments) {
		super();
		setNeedsProgressMonitor(true);
		this.deployments = deployments;
	}

	@Override
	public String getWindowTitle() {
		return "Send alerts";
	}

	@Override
	public void addPages() {
		mainPage = new SendAlertsWizardMainPage(deployments);
		addPage(mainPage);
	}

	@Override
	public boolean canFinish() {
		return mainPage.getMonitoringId() != null;
	}

	@Override
	public boolean performFinish() {
		// Get monitoringId for selected deployment
		this.monitoringId = mainPage.getMonitoringId();

		return true;
	}

	public String getMonitoringId() {
		return this.monitoringId;
	}

}
