package org.sodalite.dsl.ui.wizards.modak;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

public class ManageModakWizardMainPage extends WizardPage {
	private Composite container;
	private Path definitionsFilePath = null;
	private String definitionType = null;

	protected ManageModakWizardMainPage() {
		super("MODAK");
		setTitle("MODAK");
		setDescription("Manage MODAK definitions");
	}

	public Path getDefinitionsFilePath() {
		return this.definitionsFilePath;
	}

	public String getDefinitionType() {
		return this.definitionType;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		container.setLayout(layout);

		// Definitions File
		Label definitionsFileLabel = new Label(container, SWT.NONE);
		definitionsFileLabel.setText("Select the definitions file:");

		Text definitionsFileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData definitionsFileGridData = new GridData(GridData.FILL_HORIZONTAL);
		definitionsFileText.setLayoutData(definitionsFileGridData);

		definitionsFileText.addModifyListener(new ModifyListener() {
			public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
				getWizard().getContainer().updateButtons();
			};
		});

		Button buttonSelectImageBuildConfFile = new Button(container, SWT.PUSH);
		buttonSelectImageBuildConfFile.setText("Select...");
		buttonSelectImageBuildConfFile.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				FileDialog fileDialog = new FileDialog(shell, SWT.MULTI);
				String fileFilterPath = System.getProperty("user.home");
				fileDialog.setFilterPath(fileFilterPath);
				fileDialog.setFilterExtensions(new String[] { "*.json" });

				String selectedInputFile = fileDialog.open();
				if (selectedInputFile != null) {
					System.out.println("Selected image build conf file: " + selectedInputFile);
					File file = new File(selectedInputFile);
					definitionsFilePath = file.toPath();
					definitionsFileText.setText(selectedInputFile);
				}
			}
		});

		// Definitions type
		Label definitionTypeLabel = new Label(container, SWT.NONE);
		definitionTypeLabel.setText("Definition type:");

		final ComboViewer definitionTypeCombo = new ComboViewer(container, SWT.READ_ONLY);
		definitionTypeCombo.setContentProvider(ArrayContentProvider.getInstance());
		definitionTypeCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return super.getText(element);
			}
		});

		definitionTypeCombo.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = ((ComboViewer) event.getSource()).getSelection();
				if (!selection.isEmpty() && selection instanceof StructuredSelection)
					definitionType = ((StructuredSelection) selection).getFirstElement().toString();
				getWizard().getContainer().updateButtons();
			};
		});

		List<String> platformTypes = Arrays.asList("infrastructure", "scripts", "scaling model");

		definitionTypeCombo.setInput(platformTypes);

		setControl(container);
		setPageComplete(false);
	}

}
