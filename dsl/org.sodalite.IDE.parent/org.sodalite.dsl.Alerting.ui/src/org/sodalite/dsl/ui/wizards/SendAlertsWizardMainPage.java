package org.sodalite.dsl.ui.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.sodalite.dsl.kb_reasoner_client.types.Deployment;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class SendAlertsWizardMainPage extends WizardPage {
	private Composite container;
	private String monitoringId = null;
	List<Deployment> deployments = null;

	protected SendAlertsWizardMainPage(List<Deployment> deployments) {
		super("Send alerting rules");
		setTitle("Sent alerting rules");
		setDescription("Send monitoring alerting rules for a given deployment");
		this.deployments = deployments;
	}

	public String getMonitoringId() {
		return this.monitoringId;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);

		// Selected Deployment
		Label selectedDeploymentLabel = new Label(container, SWT.NONE);
		selectedDeploymentLabel.setText("Select deployment:");

		final ComboViewer existingDeploymentsCombo = new ComboViewer(container, SWT.READ_ONLY);
		existingDeploymentsCombo.setContentProvider(ArrayContentProvider.getInstance());
		existingDeploymentsCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return super.getText(element);
			}
		});

		existingDeploymentsCombo.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = ((ComboViewer) event.getSource()).getSelection();
				if (!selection.isEmpty() && selection instanceof StructuredSelection) {
					String deployment = ((StructuredSelection) selection).getFirstElement().toString();
					getMonitoringIdFromDeployment(deployment);
				}
				getWizard().getContainer().updateButtons();
			}
		});

		// Populate existing deployments
		try {
			List<String> labels = new ArrayList<>();
			for (Deployment deployment : deployments)
				if (deployment.getMonitoringId() != null && !deployment.getMonitoringId().isEmpty())
					labels.add(deployment.getDeployment_label() + "-" + deployment.getDeployment_id());
			existingDeploymentsCombo.setInput(labels);
		} catch (Exception ex) {
			SodaliteLogger.log(ex);
		}

		setControl(container);
		setPageComplete(false);
	}

	private void getMonitoringIdFromDeployment(String deploymentLabel) {
		String deploymentId = deploymentLabel.substring(deploymentLabel.indexOf('-') + 1);
		for (Deployment deployment : deployments) {
			if (deployment.getDeployment_id().equals(deploymentId))
				this.monitoringId = deployment.getMonitoringId();
		}
	};

}
