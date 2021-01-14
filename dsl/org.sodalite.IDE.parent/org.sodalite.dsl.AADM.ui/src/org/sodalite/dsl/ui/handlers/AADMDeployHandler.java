package org.sodalite.dsl.ui.handlers;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.SortedMap;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.backend.AADMBackendProxy;
import org.sodalite.dsl.ui.helper.AADMHelper;
import org.sodalite.dsl.ui.helper.AADMHelper.InputDef;
import org.sodalite.dsl.ui.wizards.DeploymentWizard;
import org.sodalite.dsl.ui.wizards.DeploymentWizardDialog;

public class AADMDeployHandler implements IHandler {
	private Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	private AADMBackendProxy backendProxy = new AADMBackendProxy();

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			if (PlatformUI.getWorkbench().saveAllEditors(true)) { // Ask to save model before continue
				// Show DeploymentWizard
				// Wizard should select the Inputs file or generate them from the form
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();

				// Read input definitions from AADM
				// Show wizard
				SortedMap<String, InputDef> inputDefs = AADMHelper.readInputsFromAADM(event);
				DeploymentWizardDialog dialog = new DeploymentWizardDialog(shell, new DeploymentWizard(inputDefs));

				if (dialog.OK == dialog.open()) {
					// Get inputs (file) from Wizard and save them in temporal file
					Path inputs_yaml_path = dialog.getInputsFile();
					backendProxy.processDeployAADM(event, inputs_yaml_path);
					// Remove temporary inputs file
					Files.delete(inputs_yaml_path);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			MessageDialog.openError(parent, "Save AADM Error",
					"There were an error reported by the KB:\n" + ex.getMessage());
		}
		return this;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
