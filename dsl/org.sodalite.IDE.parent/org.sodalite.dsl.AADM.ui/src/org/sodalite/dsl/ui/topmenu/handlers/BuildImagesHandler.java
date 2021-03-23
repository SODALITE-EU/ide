package org.sodalite.dsl.ui.topmenu.handlers;

import java.nio.file.Path;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.ui.backend.AADMBackendProxy;
import org.sodalite.dsl.ui.wizards.buildimages.BuildImagesWizard;
import org.sodalite.dsl.ui.wizards.buildimages.BuildImagesWizardDialog;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class BuildImagesHandler {

	@Execute
	public void execute(Shell shell) {
		try {
			AADMBackendProxy backendProxy = new AADMBackendProxy();
			if (PlatformUI.getWorkbench().saveAllEditors(true)) { // Ask to save model before continue
				// Show Save Images Wizard
				// Wizard should select the images descriptor file
				BuildImagesWizardDialog dialog = new BuildImagesWizardDialog(shell, new BuildImagesWizard());

				if (dialog.OK == dialog.open()) {
					// Get the images descriptor file
					Path imageBuildConfPath = dialog.getImageBuildConfPath();
					backendProxy.processSaveImages(imageBuildConfPath);
				}
			}
		} catch (Exception ex) {
			SodaliteLogger.log("Error", ex);
			MessageDialog.openError(shell, "Build Images Error",
					"There were an error reported by the Image Builder:\n" + ex.getMessage());
		}
	}
}
