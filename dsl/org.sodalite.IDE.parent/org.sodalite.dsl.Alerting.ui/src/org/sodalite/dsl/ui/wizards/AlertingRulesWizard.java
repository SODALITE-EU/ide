package org.sodalite.dsl.ui.wizards;

import java.util.List;

import org.eclipse.jface.wizard.Wizard;
import org.sodalite.dsl.kb_reasoner_client.types.Deployment;

public class AlertingRulesWizard extends Wizard {

	protected AlertingRulesWizardMainPage mainPage;
	private String monitoringId = null;
	private List<Deployment> deployments;
	private String windowTitle;
	private String description;

	public AlertingRulesWizard(List<Deployment> deployments, String windowTitle, String description) {
		super();
		setNeedsProgressMonitor(true);
		this.deployments = deployments;
		this.windowTitle = windowTitle;
	}

	@Override
	public String getWindowTitle() {
		return windowTitle;
	}

	@Override
	public void addPages() {
		mainPage = new AlertingRulesWizardMainPage(deployments, windowTitle, description);
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
