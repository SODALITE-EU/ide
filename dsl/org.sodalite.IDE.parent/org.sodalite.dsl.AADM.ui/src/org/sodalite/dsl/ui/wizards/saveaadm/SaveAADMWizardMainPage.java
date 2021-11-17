package org.sodalite.dsl.ui.wizards.saveaadm;

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
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.sodalite.dsl.kb_reasoner_client.types.Model;
import org.sodalite.dsl.kb_reasoner_client.types.ModelData;
import org.sodalite.dsl.ui.backend.AADMBackendProxy;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class SaveAADMWizardMainPage extends WizardPage {
	private Composite container;
	private String version = null;
	private String uri = null;

	protected SaveAADMWizardMainPage(String uri) {
		super("Save AADM");
		this.uri = uri;
		setTitle("Save AADM");
		setDescription("Save AADM into the KB");
	}

	public String getVersion() {
		return this.version;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);

		// Version
		Label versionLabel = new Label(container, SWT.NONE);
		versionLabel.setText("Version:");

		Text versionText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData namespaceGridData = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		versionText.setLayoutData(namespaceGridData);

		versionText.addModifyListener(new ModifyListener() {
			public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
				version = ((Text) e.getSource()).getText();
				getWizard().getContainer().updateButtons();
			};
		});

		// Existing Versions
		Label previousVersionsLabel = new Label(container, SWT.NONE);
		previousVersionsLabel.setText("Previous versions:");

		final ComboViewer previousVersionsCombo = new ComboViewer(container, SWT.READ_ONLY);
		previousVersionsCombo.setContentProvider(ArrayContentProvider.getInstance());
		previousVersionsCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return super.getText(element);
			}
		});

		previousVersionsCombo.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = ((ComboViewer) event.getSource()).getSelection();
				if (!selection.isEmpty() && selection instanceof StructuredSelection) {
					version = ((StructuredSelection) selection).getFirstElement().toString();
					versionText.setText(version);
				}
				getWizard().getContainer().updateButtons();
			};
		});

		// Read existing versions from KB
		try {
			if (uri != null) {
				ModelData modelVersions = AADMBackendProxy.getKBReasoner().getModelVersions(uri);
				List<String> versions = new ArrayList<>();
				if (modelVersions != null && modelVersions.getElements() != null)
					for (Model model : modelVersions.getElements())
						if (model.getVersion() != null)
							versions.add(model.getVersion());
				previousVersionsCombo.setInput(versions);
			}
		} catch (Exception ex) {
			SodaliteLogger.log(ex);
		}

		setControl(container);
		setPageComplete(false);
	}

}
