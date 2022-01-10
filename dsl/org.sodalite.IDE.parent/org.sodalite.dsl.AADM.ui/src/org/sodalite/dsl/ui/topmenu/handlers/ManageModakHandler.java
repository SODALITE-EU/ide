package org.sodalite.dsl.ui.topmenu.handlers;

import java.nio.file.Path;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.backend.AADMBackendProxy;
import org.sodalite.dsl.ui.helper.RMHelper;
import org.sodalite.dsl.ui.wizards.modak.ManageModakWizard;
import org.sodalite.dsl.ui.wizards.modak.ManageModakWizardDialog;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class ManageModakHandler {

	@Execute
	public void execute(Shell shell) {
		try {
			Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			AADMBackendProxy backendProxy = new AADMBackendProxy();
			if (PlatformUI.getWorkbench().saveAllEditors(true)) { // Ask to save model before continue
				// Show ManageModak Wizard
				ManageModakWizardDialog dialog = new ManageModakWizardDialog(shell, new ManageModakWizard(null));

				if (dialog.OK == dialog.open()) {
					Path definitionsFilePath = dialog.getDefinitionsFilePath();
					String type = dialog.getType();
					if (definitionsFilePath == null) {
						// Detect JSON model in selected editor
						definitionsFilePath = RMHelper.getSelection();
						if (definitionsFilePath != null
								&& definitionsFilePath.getFileName().toString().endsWith(".json")) {
							if (MessageDialog.openQuestion(parent, "Manage MODAK definitions",
									"No definitions file was set. Do you want to use the definitions file opened in Eclipse editor: "
											+ definitionsFilePath.getFileName().toString() + "?")) {
								backendProxy.processManageModakDefinitions(definitionsFilePath, type);
							}
						} else {
							MessageDialog.openError(parent, "Manage MODAK definitions",
									"No definitions file was set and no valid one is open in frontend editor"
											+ "\n Select a valid definitions file in the wizard or the selected frontend editor");
						}
					}
				}
			}
		} catch (Exception ex) {
			SodaliteLogger.log("Error", ex);
			MessageDialog.openError(shell, "Manage MODAK defintions rrror",
					"There were an error reported by MODAK:\n" + ex.getMessage());
		}
	}
}
