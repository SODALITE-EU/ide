package org.sodalite.dsl.ui.wizards;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.wizard.Wizard;

public class DeploymentWizard extends Wizard {
	
	protected DeploymentWizardMainPage mainPage;
	private List<String> inputDefs;
	private Path inputsFile = null;
	
	public DeploymentWizard(List<String> inputDefs) {
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
		//Check all inputs are filled in
		Map<String, String> inputs = mainPage.getInputs();
		return !inputs.values().contains(null) && !inputs.values().contains(""); 
	}

	@Override
	public boolean performFinish() {
		//Save inputs in temporal file
		Map<String, String> inputs = mainPage.getInputs();
		try {
			this.inputsFile = Files.createTempFile(null, null);
			StringBuilder content = new StringBuilder();
			inputs.keySet().forEach(key-> content.append(key + ": " + inputs.get(key) + "\n"));
			Files.write(this.inputsFile, content.toString().getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public Path getInputsFile(){
		return this.inputsFile;
	}

}
