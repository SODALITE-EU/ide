package org.sodalite.dsl.ui.wizards.deployment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.stream.Stream;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
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
import org.sodalite.dsl.ui.helper.AADMHelper.InputDef;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class DeploymentWizardMainPage extends WizardPage {
	private SortedMap<String, InputDef> inputDefs;
	private Map<String, InputWidget> inputWidgets = new HashMap<>();
	private Path imageBuildConfPath = null;
	private Spinner workersSpinner = null;
	private Text versionTagText = null;
	private Text deploymentNameText = null;
	private Button completeModelCB = null;
	private Button validateNiFiCertsCB = null;
	private Button useDMCB = null;

	protected DeploymentWizardMainPage(SortedMap<String, InputDef> inputDefs) {
		super("AADM Deployment");
		setTitle("AADM Deployment");
		setDescription("Provide inputs for the AADM");
		this.inputDefs = inputDefs;
	}

	public Path getImageBuildConfPath() {
		return this.imageBuildConfPath;
	}

	public String getVersionTag() {
		return this.versionTagText.getText();
	}

	public String getDeploymentName() {
		return this.deploymentNameText.getText();
	}

	public int getWorkers() {
		try {
			return Integer.valueOf(this.workersSpinner.getText());
		} catch (Exception ex) {
			return 0;
		}
	}

	public Map<String, String> getInputs() {
		Map<String, String> inputs = new HashMap<>();
		for (String key : inputWidgets.keySet()) {
			String type = inputDefs.get(key).getType();
			boolean get_secret_checked = inputWidgets.get(key).getGetSecretCheckBox().getSelection();
			String value = inputWidgets.get(key).getInputText().getText();
			if (get_secret_checked) {
				key = "_get_secret_" + key;
			} else {
				if (type != null && (type.contains("map") || type.contains("list")))
					value = "\n" + value;
			}
			inputs.put(key, value);
		}
		return inputs;
	}

	public boolean getCompleteModel() {
		return this.completeModelCB.getSelection();
	}

	public boolean getValidateNiFiCerts() {
		return this.validateNiFiCertsCB.getSelection();
	}

	public boolean getUseDataManagement() {
		return this.useDMCB.getSelection();
	}

	@Override
	public void createControl(Composite parent) {
		final Composite rootComposite = new Composite(parent, SWT.NONE);
		rootComposite.setLayout(GridLayoutFactory.fillDefaults().create());

		final ScrolledComposite sc = new ScrolledComposite(rootComposite, SWT.BORDER | SWT.V_SCROLL);
		sc.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);

		sc.addListener(SWT.Resize, event -> {
			int width = sc.getClientArea().width;
			sc.setMinSize(parent.computeSize(width, SWT.DEFAULT));
		});

		final Composite containerMain = new Composite(sc, SWT.NULL);
		containerMain.setLayout(GridLayoutFactory.swtDefaults().numColumns(3).create());

		sc.setContent(containerMain);
		sc.setMinSize(containerMain.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		// Deployment Name
		Label deploymentNameLabel = new Label(containerMain, SWT.NONE);
		deploymentNameLabel.setText("Deployment name:");

		deploymentNameText = new Text(containerMain, SWT.BORDER | SWT.SINGLE);
		GridData deploymentNameGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		deploymentNameText.setLayoutData(deploymentNameGridData);

		deploymentNameText.addModifyListener(new ModifyListener() {
			public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
				getWizard().getContainer().updateButtons();
			};
		});

		// Version tag
		Label versionTagLabel = new Label(containerMain, SWT.NONE);
		versionTagLabel.setText("Version tag (optional):");

		versionTagText = new Text(containerMain, SWT.BORDER | SWT.SINGLE);
		GridData versionTagGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		versionTagText.setLayoutData(versionTagGridData);

		// Workers
		Label workersLabel = new Label(containerMain, SWT.NONE);
		workersLabel.setText("Number orchestrator workers (optional):");

		workersSpinner = new Spinner(containerMain, SWT.BORDER | SWT.SINGLE);
		GridData workersGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		workersSpinner.setLayoutData(workersGridData);
		workersSpinner.setMinimum(0);
		workersSpinner.setSelection(1);

		// Image Build Configuration
		Label imageBuildConfLabel = new Label(containerMain, SWT.NONE);
		imageBuildConfLabel.setText("Select a image build configuration (optional):");

		Button buttonSelectImageBuildConfFile = new Button(containerMain, SWT.PUSH);
		buttonSelectImageBuildConfFile.setText("Select...");

		Text imageBuildConfText = new Text(containerMain, SWT.BORDER | SWT.SINGLE);
		GridData imageBuildConfGridData = new GridData(GridData.FILL_HORIZONTAL);
		imageBuildConfText.setLayoutData(imageBuildConfGridData);

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

		// Complete AADM model
		Label completeModelLabel = new Label(containerMain, SWT.NONE);
		completeModelLabel.setText("Complete AADM (optional):");
		completeModelLabel.setToolTipText("Ask KB to complete the AADM model before deployment");

		completeModelCB = new Button(containerMain, SWT.CHECK);
		GridData completeModelGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		completeModelCB.setLayoutData(completeModelGridData);

		// Use data management
		Label useDM = new Label(containerMain, SWT.NONE);
		useDM.setText("Use Data Management (optional):");
		useDM.setToolTipText("Check if your AADM requires data management support with Apache NIFI");

		useDMCB = new Button(containerMain, SWT.CHECK);
		GridData useDMGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		useDMCB.setLayoutData(useDMGridData);

		// Validate NIF Certificates
		Label validateNiFiCerts = new Label(containerMain, SWT.NONE);
		validateNiFiCerts.setText("Validate NIF Certificates (optional):");
		validateNiFiCerts.setToolTipText(
				"Whether SSL certificates for NIFI should be validated. For self-signed certificates it should be unchecked");

		validateNiFiCertsCB = new Button(containerMain, SWT.CHECK);
		GridData validateNiFiCertsGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1);
		validateNiFiCertsCB.setLayoutData(validateNiFiCertsGridData);

		// Inputs file
		if (this.inputDefs != null && !this.inputDefs.isEmpty()) {
			Label inputsFileLabel = new Label(containerMain, SWT.NONE);
			inputsFileLabel.setText("Select an inputs file:");

			Button buttonSelectFile = new Button(containerMain, SWT.PUSH);
			buttonSelectFile.setText("Select...");

			Text inputsFileText = new Text(containerMain, SWT.BORDER | SWT.SINGLE);
			GridData inputsFileGridData = new GridData(GridData.FILL_HORIZONTAL);
			inputsFileText.setLayoutData(inputsFileGridData);

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
						File file = new File(selectedInputFile);
						// Read inputs from file
						try (Stream<String> lines = Files.lines(file.toPath())) {
							// If line ends with : process following lines as map
							Iterator<String> iter = lines.iterator();
							if (iter.hasNext()) {
								processInput(iter.next(), iter);
							}
						} catch (IOException e) {
							SodaliteLogger.log("Error", e);
						}
					}
				}

				private void processInput(String line, Iterator<String> iter) {
					if (!line.trim().endsWith(":")) { // key:value entry
						processSingleInput(line, iter);
					} else { // map entry
						processMapInput(line, iter);
					}
				}

				private void processMapInput(String line, Iterator<String> iter) {
					StringTokenizer st = new StringTokenizer(line, ":");
					String input_name = st.nextToken();
					String input_value = "";
					String childLine = null;
					while (true) {
						childLine = iter.next();
						if (childLine != null && !childLine.startsWith(" ")) {
							break;
						}
						input_value += childLine + "\n";
					}

					if (inputDefs.keySet().contains(input_name)) {
						String input_key = input_name;
						// Remove empty line
						if (input_value.endsWith("\n"))
							input_value = input_value.substring(0, input_value.length() - 1);
						inputWidgets.get(input_key).getInputText().setText(input_value);
					}

					if (childLine != null)
						processInput(childLine, iter);
				}

				private void processSingleInput(String line, Iterator<String> iter) {
					if (line.isEmpty())
						return;
					StringTokenizer st = new StringTokenizer(line, ":");
					String input_name = st.nextToken();
					if (inputDefs.keySet().contains(input_name)) {
						String input_key = input_name;
						String input_value = st.nextToken();
						inputWidgets.get(input_key).getInputText().setText(input_value);
					}

					if (iter.hasNext()) {
						processInput(iter.next(), iter);
					}
				}
			});

			// Separator
			Label separator = new Label(containerMain, SWT.SEPARATOR | SWT.HORIZONTAL);
			GridData data = new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1);
			separator.setLayoutData(data);

			// Inputs
			Label inputsLabel = new Label(containerMain, SWT.NONE);
			inputsLabel.setText("Inputs:");
			FontData fontData = inputsLabel.getFont().getFontData()[0];
			Font font = new Font(containerMain.getDisplay(),
					new FontData(fontData.getName(), fontData.getHeight(), SWT.BOLD));
			inputsLabel.setFont(font);
			data = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
			inputsLabel.setLayoutData(data);

			Label getSecretLabel = new Label(containerMain, SWT.NONE);
			getSecretLabel.setText("Get secret");
			fontData = getSecretLabel.getFont().getFontData()[0];
			font = new Font(containerMain.getDisplay(),
					new FontData(fontData.getName(), fontData.getHeight(), SWT.BOLD));
			getSecretLabel.setFont(font);
			data = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
			getSecretLabel.setLayoutData(data);

			for (String input : inputDefs.keySet()) {
				// Label
				Label label = new Label(containerMain, SWT.NONE);
				label.setText(input);

				// Get Secret checkbox
				Button getSecretCB = new Button(containerMain, SWT.CHECK);
				getSecretCB.setToolTipText(
						"Check if input value should be retrieved by the orchestrator from the secret store for given value");
				GridData getSecretGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
				getSecretCB.setLayoutData(getSecretGridData);

				// Text
				Text text = null;
				String inputType = inputDefs.get(input).getType();
				if (inputType != null && (inputType.contains("map") || inputType.contains("list"))) {
					int number_lines = 5;
					text = new Text(containerMain, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.H_SCROLL);
					GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
					gridData.heightHint = number_lines * text.getLineHeight();
					text.setLayoutData(gridData);
				} else {
					text = new Text(containerMain, SWT.BORDER | SWT.SINGLE);
					GridData gd = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
					text.setLayoutData(gd);
				}
				text.setText("");

				text.addModifyListener(new ModifyListener() {
					public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
						getWizard().getContainer().updateButtons();
					};
				});

				inputWidgets.put(input, new InputWidget(text, getSecretCB));
			}
		}

		setControl(rootComposite);
		setPageComplete(false);
	}

}

class InputWidget {
	Text inputText;
	Button getSecretCheckBox;

	public InputWidget(Text inputText, Button getSecretCheckBox) {
		this.inputText = inputText;
		this.getSecretCheckBox = getSecretCheckBox;
	}

	public Text getInputText() {
		return inputText;
	}

	public Button getGetSecretCheckBox() {
		return getSecretCheckBox;
	}
}
