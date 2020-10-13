package org.sodalite.dsl.ui.wizards;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
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

public class DeploymentWizardMainPage extends WizardPage {
	private Composite container;
	private List<String> inputDefs;
	private Map<String, Text> inputWidgets = new HashMap<>();

	protected DeploymentWizardMainPage(List<String> inputDefs) {
		super("AADM Deployment");
		setTitle("AADM Deployment");
		setDescription("Provide inputs for the AADM");
		this.inputDefs = inputDefs;
	}

	public Map<String, String> getInputs() {
		return inputWidgets.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().getText().trim()));
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);

		// Inputs file
		Label fileLabel = new Label(container, SWT.NONE);
		fileLabel.setText("Select an inputs file:");

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
					System.out.println("Selected inputs file: " + selectedInputFile);
					File file = new File(selectedInputFile);
					// Read inputs from file
					try {
						Files.lines(file.toPath()).forEach(
								// Assign inputs values in wizard form
								input -> processInput(input));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}

			private Object processInput(String input) {
				StringTokenizer st = new StringTokenizer(input, ":");
				String input_name = st.nextToken();
				String input_value = st.nextToken();
				while (st.hasMoreTokens())
					input_value += ":" + st.nextToken();
				inputWidgets.get(input_name).setText(input_value);

				return input;
			}
		});

		// Separator
		Label separator = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData data = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
		separator.setLayoutData(data);

		// Inputs
		Label inputsLabel = new Label(container, SWT.NONE);
		inputsLabel.setText("Inputs:");
		FontData fontData = inputsLabel.getFont().getFontData()[0];
		Font font = new Font(container.getDisplay(), new FontData(fontData.getName(), fontData.getHeight(), SWT.BOLD));
		inputsLabel.setFont(font);
		data = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
		inputsLabel.setLayoutData(data);

		for (String input : inputDefs) {
			// Label
			Label label = new Label(container, SWT.NONE);
			label.setText(input);

			// Text
			Text text = new Text(container, SWT.BORDER | SWT.SINGLE);
			text.setText("");
			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			text.setLayoutData(gd);
			text.addModifyListener(new ModifyListener() {
				public void modifyText(org.eclipse.swt.events.ModifyEvent e) {
					getWizard().getContainer().updateButtons();
				};
			});
			
			inputWidgets.put(input, text);
		}

		setControl(container);
		setPageComplete(false);
	}

}
