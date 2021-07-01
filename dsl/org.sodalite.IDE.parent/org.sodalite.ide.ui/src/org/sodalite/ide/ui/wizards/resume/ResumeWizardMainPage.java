package org.sodalite.ide.ui.wizards.resume;

import java.io.File;
import java.nio.file.Path;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

public class ResumeWizardMainPage extends WizardPage {
	private Spinner workersSpinner = null;
	private Button cleanStateCB = null;
	private Text inputsFileText = null;

	protected ResumeWizardMainPage() {
		super("Deployment resume");
		setTitle("Deployment resume");
		setDescription("Provide inputs for the deployment resubmission");
	}

	public int getWorkers() {
		try {
			return Integer.valueOf(this.workersSpinner.getText());
		} catch (Exception ex) {
			return 0;
		}
	}

	public boolean getCleanState() {
		return this.cleanStateCB.getSelection();
	}

	public Path getInputsFile() {
		if (this.inputsFileText.getText() != null && !this.inputsFileText.getText().isEmpty()) {
			File file = new File(this.inputsFileText.getText());
			return file.toPath();
		} else {
			return null;
		}
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.swtDefaults().numColumns(3).create());

		// Inputs file
		Label inputsFileLabel = new Label(container, SWT.NONE);
		inputsFileLabel.setText("Select an inputs file:");

		inputsFileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData inputsFileGridData = new GridData(GridData.FILL_HORIZONTAL);
		inputsFileText.setLayoutData(inputsFileGridData);

		Button buttonSelectFile = new Button(container, SWT.PUSH);
		buttonSelectFile.setText("Select...");
		buttonSelectFile.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				FileDialog fileDialog = new FileDialog(shell, SWT.MULTI);
				String fileFilterPath = System.getProperty("user.home");
				fileDialog.setFilterPath(fileFilterPath);
				fileDialog.setFilterExtensions(new String[] { "*.yaml", "*.yml", "*.*" });

				String selectedInputFile = fileDialog.open();
				if (selectedInputFile != null) {
					inputsFileText.setText(selectedInputFile);

				}
			}
		});

		inputsFileText.addModifyListener(new ModifyListener() {
			public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
				getWizard().getContainer().updateButtons();
			};
		});

		// Workers
		Label workersLabel = new Label(container, SWT.NONE);
		workersLabel.setText("Number orchestrator workers (optional):");

		workersSpinner = new Spinner(container, SWT.BORDER | SWT.SINGLE);
		GridData workersGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		workersSpinner.setLayoutData(workersGridData);
		workersSpinner.setMinimum(0);
		workersSpinner.setSelection(1);

		// Clean state resume
		Label cleanStateLabel = new Label(container, SWT.NONE);
		cleanStateLabel.setText("Clean state:");
		cleanStateLabel.setToolTipText("Resume the deployment from initial clean state");

		cleanStateCB = new Button(container, SWT.CHECK);
		GridData completeModelGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		cleanStateCB.setLayoutData(completeModelGridData);

		setControl(container);
		setPageComplete(false);
	}

}
