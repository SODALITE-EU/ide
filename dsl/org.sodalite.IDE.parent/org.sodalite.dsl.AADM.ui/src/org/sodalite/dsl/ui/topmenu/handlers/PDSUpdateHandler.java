package org.sodalite.dsl.ui.topmenu.handlers;

import java.nio.file.Path;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.backend.AADMBackendProxy;
import org.sodalite.dsl.ui.wizards.pds.PDSUpdateWizard;
import org.sodalite.dsl.ui.wizards.pds.PDSUpdateWizardDialog;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class PDSUpdateHandler {

	@Execute
	public void execute(Shell shell) {
		try {
			AADMBackendProxy backendProxy = new AADMBackendProxy();
			if (PlatformUI.getWorkbench().saveAllEditors(true)) { // Ask to save model before continue
				// Show Platform Discovery Service Update Wizard
				// Wizard should select the images descriptor file

				PDSUpdateWizardDialog dialog = new PDSUpdateWizardDialog(shell, new PDSUpdateWizard());

				if (dialog.OK == dialog.open()) {
					// Get the images descriptor file
					Path inputsFilePath = dialog.getInputsFilePath();
					String namespace = dialog.getNamespace();
					String platformType = dialog.getPlatformType();
					backendProxy.processPDSUpdate(inputsFilePath, namespace, platformType);
				}
			}
		} catch (Exception ex) {
			SodaliteLogger.log("Error", ex);
			MessageDialog.openError(shell, "PDS Update Error",
					"There were an error reported by the Image Builder:\n" + ex.getMessage());
		}
	}
}
