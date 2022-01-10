package org.sodalite.dsl.ui.handlers;

import java.nio.file.Path;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.backend.AADMBackendProxy;
import org.sodalite.dsl.ui.helper.RMHelper;
import org.sodalite.dsl.ui.wizards.modak.ManageModakWizard;
import org.sodalite.dsl.ui.wizards.modak.ManageModakWizardDialog;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class ManageModakHandler implements IHandler {
	private Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	private AADMBackendProxy backendProxy = new AADMBackendProxy();

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			AADMBackendProxy backendProxy = new AADMBackendProxy();
			if (PlatformUI.getWorkbench().saveAllEditors(true)) { // Ask to save model before continue

				// Get JSON model selection
				Path definitionsFilePath = RMHelper.getSelection();

				// Show ManageModak Wizard
				ManageModakWizardDialog dialog = new ManageModakWizardDialog(parent,
						new ManageModakWizard(definitionsFilePath));

				if (dialog.OK == dialog.open()) {
					String type = dialog.getType();
					backendProxy.processManageModakDefinitions(definitionsFilePath, type);
				}
			}
		} catch (Exception ex) {
			SodaliteLogger.log("Error", ex);
			MessageDialog.openError(parent, "Manage MODAK defintions rrror",
					"There were an error reported by MODAK:\n" + ex.getMessage());
		}
		return this;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {

	}

}
