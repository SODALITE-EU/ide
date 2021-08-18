package org.sodalite.dsl.ui.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.backend.AlertingBackendProxy;

public class SendAlertsHandler implements IHandler {
	private Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	private AlertingBackendProxy backendProxy = new AlertingBackendProxy();

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
				AlertingBackendProxy.startSendAlertsWizard(event);
			}
		} catch (Exception ex) {
			MessageDialog.openError(parent, "Sent alerts to monitoring",
					"There were an error reported by the monitoring backend:\n" + ex.getMessage());
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
