package org.sodalite.dsl.ui.wizards;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;
import java.util.SortedMap;

import org.eclipse.jface.wizard.Wizard;
import org.sodalite.dsl.ui.helper.AADMHelper.InputDef;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class DeploymentWizard extends Wizard {

	protected DeploymentWizardMainPage mainPage;
	private SortedMap<String, InputDef> inputDefs;
	private Path inputsFile = null;
	private Path imageBuildConfPath = null;
	private String versionTag = null;
	private int workers = 0;

	public DeploymentWizard(SortedMap<String, InputDef> inputDefs) {
		super();
		this.inputDefs = inputDefs;
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "ADDM Deployment";
	}

	@Override
	public void addPages() {
		mainPage = new DeploymentWizardMainPage(inputDefs);
		addPage(mainPage);
	}

	@Override
	public boolean canFinish() {
		// Check all inputs are filled in
		Map<String, String> inputs = mainPage.getInputs();
		return inputs.keySet().stream().allMatch(key -> isValidInput(key, inputs.get(key)));
	}

	private boolean isValidInput(String input, String value) {
		return value != null && !(value.isEmpty() && !hasDefault(input));
	}

	private boolean hasDefault(String input) {
		return inputDefs.get(input).getDefaultValue() != null;
	}

	@Override
	public boolean performFinish() {
		// Get imageBuildConfPath
		this.imageBuildConfPath = mainPage.getImageBuildConfPath();

		// Get versionTag
		this.versionTag = mainPage.getVersionTag();

		// Get workers
		this.workers = mainPage.getWorkers();

		// Save inputs in temporal file
		Map<String, String> inputs = mainPage.getInputs();
		try {
			this.inputsFile = File.createTempFile("inputs", null, new File(System.getProperty("user.home"))).toPath();
			StringBuilder content = new StringBuilder();
			inputs.keySet().forEach(key -> content.append(key + ": " + inputs.get(key) + "\n"));
			Files.write(this.inputsFile, content.toString().getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			SodaliteLogger.log("Error on closing wizard", e);
			return false;
		}

		return true;
	}

	public Path getInputsFile() {
		return this.inputsFile;
	}

	public Path getImageBuildConfPath() {
		return this.imageBuildConfPath;
	}

	public String getVersionTag() {
		return this.versionTag;
	}

	public int getWorkers() {
		return this.workers;
	}

}
