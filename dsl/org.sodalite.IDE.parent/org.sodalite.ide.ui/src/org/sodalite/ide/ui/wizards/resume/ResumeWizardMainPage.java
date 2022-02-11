package org.sodalite.ide.ui.wizards.resume;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public class ResumeWizardMainPage extends WizardPage {
	private Spinner workersSpinner = null;
	private Button cleanStateCB = null;
	private Map<String, String> inputs = null;
	private Map<String, InputWidget> inputWidgets = new HashMap<>();
	private List<String> filteredInputs = Arrays.asList("skydive_analyzer", "jwt", "hpc_exporter_address",
			"consul_server_address", "deployment_label", "monitoring_id", "grafana_address");

	protected ResumeWizardMainPage(Map<String, String> inputs) {
		super("Deployment resume");
		this.inputs = inputs;
		setTitle("Deployment resume");
		setDescription("Provide inputs to resume the deployment");
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

	public Map<String, String> getInputs() {
		Map<String, String> inputs = new HashMap<>();
		for (String key : inputWidgets.keySet()) {
			String value = inputWidgets.get(key).getInputText().getText();
			inputs.put(key, value);
		}
		return inputs;
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
		containerMain.setLayout(GridLayoutFactory.swtDefaults().numColumns(2).create());

		sc.setContent(containerMain);
		sc.setMinSize(containerMain.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		// Workers
		Label workersLabel = new Label(containerMain, SWT.NONE);
		workersLabel.setText("Number orchestrator workers (optional):");

		workersSpinner = new Spinner(containerMain, SWT.BORDER | SWT.SINGLE);
		GridData workersGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		workersSpinner.setLayoutData(workersGridData);
		workersSpinner.setMinimum(0);
		workersSpinner.setSelection(1);

		// Clean state resume
		Label cleanStateLabel = new Label(containerMain, SWT.NONE);
		cleanStateLabel.setText("Clean state:");
		cleanStateLabel.setToolTipText("Resume the deployment from initial clean state");

		cleanStateCB = new Button(containerMain, SWT.CHECK);
		GridData completeModelGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		cleanStateCB.setLayoutData(completeModelGridData);

		// Inputs
		Label inputsLabel = new Label(containerMain, SWT.NONE);
		inputsLabel.setText("Inputs:");
		FontData fontData = inputsLabel.getFont().getFontData()[0];
		Font font = new Font(containerMain.getDisplay(),
				new FontData(fontData.getName(), fontData.getHeight(), SWT.BOLD));
		inputsLabel.setFont(font);
		GridData data = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
		inputsLabel.setLayoutData(data);

		for (String input : inputs.keySet()) {

			// Filter out automatic inputs
			if (filteredInputs.contains(input))
				continue;

			// Label
			Label label = new Label(containerMain, SWT.NONE);
			label.setText(input);

			// Text
			Text text = null;
			String inputValue = inputs.get(input);
			if (inputValue.contains("{")) {
				int number_lines = 5;
				text = new Text(containerMain, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.H_SCROLL);
				GridData gridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
				gridData.heightHint = number_lines * text.getLineHeight();
				text.setLayoutData(gridData);
				text.setText(asYaml(inputValue));
			} else {
				text = new Text(containerMain, SWT.BORDER | SWT.SINGLE);
				GridData gd = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
				text.setLayoutData(gd);
				text.setText(inputValue);
			}

			inputWidgets.put(input, new InputWidget(text));
		}

		setControl(rootComposite);
		setPageComplete(false);
	}

	public String asYaml(String jsonString) {
		jsonString = jsonString.replaceAll("\'", "\"");
		String jsonAsYaml = jsonString;
		try {
			// parse JSON
			JsonNode jsonNodeTree = new ObjectMapper().readTree(jsonString);
			// save it as YAML
			jsonAsYaml = new YAMLMapper().writeValueAsString(jsonNodeTree);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonAsYaml.substring(jsonAsYaml.indexOf("\n") + 1);
	}

}

class InputWidget {
	Text inputText;

	public InputWidget(Text inputText) {
		this.inputText = inputText;
	}

	public Text getInputText() {
		return inputText;
	}
}
