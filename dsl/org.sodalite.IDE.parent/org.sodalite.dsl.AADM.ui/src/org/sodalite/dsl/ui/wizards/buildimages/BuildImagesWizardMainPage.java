package org.sodalite.dsl.ui.wizards.buildimages;

import java.io.File;
import java.nio.file.Path;

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

public class BuildImagesWizardMainPage extends WizardPage {
	private Composite container;
	private Path imageBuildConfPath = null;

	protected BuildImagesWizardMainPage() {
		super("Build images");
		setTitle("Build images");
		setDescription("Provide the images description file");
	}

	public Path getImageBuildConfPath() {
		return this.imageBuildConfPath;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		container.setLayout(layout);

		// Image Build Configuration
		Label imageBuildConfLabel = new Label(container, SWT.NONE);
		imageBuildConfLabel.setText("Select a image build configuration:");

		Text imageBuildConfText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData imageBuildConfGridData = new GridData(GridData.FILL_HORIZONTAL);
		imageBuildConfText.setLayoutData(imageBuildConfGridData);

		imageBuildConfText.addModifyListener(new ModifyListener() {
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
					imageBuildConfPath = file.toPath();
					imageBuildConfText.setText(selectedInputFile);
				}
			}
		});

		setControl(container);
		setPageComplete(false);
	}

}
