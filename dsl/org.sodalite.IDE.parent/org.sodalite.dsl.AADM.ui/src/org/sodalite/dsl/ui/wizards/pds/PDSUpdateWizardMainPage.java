package org.sodalite.dsl.ui.wizards.pds;

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

public class PDSUpdateWizardMainPage extends WizardPage {
	private Composite container;
	private Path inputsFilePath = null;
	private String namespace = null;
	private String platformType = null;

	protected PDSUpdateWizardMainPage() {
		super("Platform Discovery Services");
		setTitle("Platform Discovery Services");
		setDescription("Request Platform Discovery Service to update");
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

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		container.setLayout(layout);

		// Inputs File
		Label inputsFileLabel = new Label(container, SWT.NONE);
		inputsFileLabel.setText("Select the inputs file:");

		Text inputsFileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData inputsFileGridData = new GridData(GridData.FILL_HORIZONTAL);
		inputsFileText.setLayoutData(inputsFileGridData);

		inputsFileText.addModifyListener(new ModifyListener() {
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
				fileDialog.setFilterExtensions(new String[] { "*.json", "*.*" });

				String selectedInputFile = fileDialog.open();
				if (selectedInputFile != null) {
					System.out.println("Selected image build conf file: " + selectedInputFile);
					File file = new File(selectedInputFile);
					inputsFilePath = file.toPath();
					inputsFileText.setText(selectedInputFile);
				}
			}
		});

		// Inputs File
		Label namespaceLabel = new Label(container, SWT.NONE);
		namespaceLabel.setText("Namespace:");

		Text namespaceText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData namespaceGridData = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
		namespaceText.setLayoutData(namespaceGridData);

		namespaceText.addModifyListener(new ModifyListener() {
			public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
				namespace = ((Text) e.getSource()).getText();
				getWizard().getContainer().updateButtons();
			};
		});

		// Platform type
		Label platformTypeLabel = new Label(container, SWT.NONE);
		platformTypeLabel.setText("Platform type:");

		final ComboViewer platformTypeCombo = new ComboViewer(container, SWT.READ_ONLY);
		platformTypeCombo.setContentProvider(ArrayContentProvider.getInstance());
		platformTypeCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				return super.getText(element);
			}
		});

		platformTypeCombo.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = ((ComboViewer) event.getSource()).getSelection();
				if (!selection.isEmpty() && selection instanceof StructuredSelection)
					platformType = ((StructuredSelection) selection).getFirstElement().toString();
				getWizard().getContainer().updateButtons();
			};
		});

		List<String> platformTypes = Arrays.asList("aws", "kubernetes", "openstack", "slurm", "torque");

		platformTypeCombo.setInput(platformTypes);

		setControl(container);
		setPageComplete(false);
	}

}
