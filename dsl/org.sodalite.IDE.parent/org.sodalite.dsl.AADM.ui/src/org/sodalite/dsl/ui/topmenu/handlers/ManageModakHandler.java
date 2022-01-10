package org.sodalite.dsl.ui.topmenu.handlers;

import java.nio.file.Path;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.backend.AADMBackendProxy;
import org.sodalite.dsl.ui.wizards.modak.ManageModakWizard;
import org.sodalite.dsl.ui.wizards.modak.ManageModakWizardDialog;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class ManageModakHandler {

	@Execute
	public void execute(Shell shell) {
		try {
			AADMBackendProxy backendProxy = new AADMBackendProxy();
			if (PlatformUI.getWorkbench().saveAllEditors(true)) { // Ask to save model before continue
				// Show ManageModak Wizard

				ManageModakWizardDialog dialog = new ManageModakWizardDialog(shell, new ManageModakWizard());

				if (dialog.OK == dialog.open()) {
					Path definitionsFilePath = dialog.getDefinitionsFilePath();
					String type = dialog.getType();
					backendProxy.processManageModakDefinitions(definitionsFilePath, type);
				}
			}
		} catch (Exception ex) {
			SodaliteLogger.log("Error", ex);
			MessageDialog.openError(shell, "Manage MODAK defintions rrror",
					"There were an error reported by MODAK:\n" + ex.getMessage());
		}
	}
}
