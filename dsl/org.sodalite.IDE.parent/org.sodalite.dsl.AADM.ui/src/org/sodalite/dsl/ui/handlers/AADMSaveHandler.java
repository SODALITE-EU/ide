package org.sodalite.dsl.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.backend.AADMBackendProxy;
import org.sodalite.dsl.ui.backend.ModelMetadata;
import org.sodalite.dsl.ui.wizards.saveaadm.SaveAADMWizard;
import org.sodalite.dsl.ui.wizards.saveaadm.SaveAADMWizardDialog;

public class AADMSaveHandler implements IHandler {
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
				ModelMetadata mm = AADMBackendProxy.getSelectedModelMetadata();
				SaveAADMWizardDialog dialog = new SaveAADMWizardDialog(parent, new SaveAADMWizard(mm.getUri()));

				if (dialog.OK == dialog.open()) {
					String version = dialog.getVersion();
					backendProxy.processSaveAADM(version, event);
				}
			}
		} catch (Exception ex) {
			MessageDialog.openError(parent, "Save AADM Error",
					"There were an error reported by the KB:\n" + ex.getMessage());
		}
		return this;
	}

	@Override
	public boolean isEnabled() {
		// TODO Validate AADM before enabling
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
