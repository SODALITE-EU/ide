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
import org.sodalite.dsl.ui.wizards.pds.PDSUpdateWizard;
import org.sodalite.dsl.ui.wizards.pds.PDSUpdateWizardDialog;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class PDSUpdateHandler implements IHandler {
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
			if (PlatformUI.getWorkbench().saveAllEditors(true)) { // Ask to save model before continue
				// Show Platform Discovery Service Update Wizard
				// Wizard should select the images descriptor file
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				// Show wizard
				PDSUpdateWizardDialog dialog = new PDSUpdateWizardDialog(shell, new PDSUpdateWizard());

				if (dialog.OK == dialog.open()) {
					// Get the images descriptor file
					Path inputsFilePath = dialog.getInputsFilePath();
					String namespace = dialog.getNamespace();
					String platformType = dialog.getPlatformType();
					backendProxy.processPDSUpdate(event, inputsFilePath, namespace, platformType);
				}
			}
		} catch (Exception ex) {
			SodaliteLogger.log("Error", ex);
			MessageDialog.openError(parent, "Save Images Error",
					"There were an error reported by the Image Builder:\n" + ex.getMessage());
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
