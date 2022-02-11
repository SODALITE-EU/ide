package org.sodalite.ide.ui.wizards.resume;

import java.util.Map;

import org.eclipse.jface.wizard.Wizard;

public class ResumeWizard extends Wizard {

	protected ResumeWizardMainPage mainPage;
	private int workers = 0;
	private boolean clean_state = false;
	private Map<String, String> inputs = null;
	private Map<String, String> editedInputs = null;

	public ResumeWizard(Map<String, String> inputs) {
		super();
		this.inputs = inputs;
		setNeedsProgressMonitor(true);
	}

	@Override
	public String getWindowTitle() {
		return "Resume Deployment";
	}

	@Override
	public void addPages() {
		mainPage = new ResumeWizardMainPage(inputs);
		addPage(mainPage);
	}

	@Override
	public boolean canFinish() {
		Map<String, String> inputs = mainPage.getInputs();
		return inputs.keySet().stream().allMatch(key -> isValidInput(key, inputs.get(key)));
	}

	private boolean isValidInput(String input, String value) {
		return value != null && !value.isEmpty();
	}

	@Override
	public boolean performFinish() {

		// Get workers
		this.workers = mainPage.getWorkers();

		// Clean state
		this.clean_state = mainPage.getCleanState();

		// Inputs file
		editedInputs = mainPage.getInputs();

		return true;
	}

	public Map<String, String> getEditedInputs() {
		return this.editedInputs;
	}

	public int getWorkers() {
		return this.workers;
	}

	public boolean getCleanState() {
		return this.clean_state;
	}

}
