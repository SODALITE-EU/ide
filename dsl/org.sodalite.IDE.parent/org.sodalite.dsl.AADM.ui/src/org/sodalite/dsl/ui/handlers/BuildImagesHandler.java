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
import org.sodalite.dsl.ui.wizards.buildimages.BuildImagesWizard;
import org.sodalite.dsl.ui.wizards.buildimages.BuildImagesWizardDialog;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class BuildImagesHandler implements IHandler {
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
				// Show Save Images Wizard
				// Wizard should select the images descriptor file
				Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
				// Show wizard
				BuildImagesWizardDialog dialog = new BuildImagesWizardDialog(shell, new BuildImagesWizard());

				if (dialog.OK == dialog.open()) {
					// Get the images descriptor file
					Path imageBuildConfPath = dialog.getImageBuildConfPath();
					backendProxy.processBuildImages(imageBuildConfPath);
				}
			}
		} catch (Exception ex) {
			SodaliteLogger.log("Error", ex);
			MessageDialog.openError(parent, "Build Images Error",
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
