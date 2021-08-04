package org.sodalite.dsl.ui.backend;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class AlertingBackendProxy {
	public void processSendAlerts(ExecutionEvent event) throws Exception {
		// Return selected resource
		IFile alertFile = getSelectedFile();
		if (alertFile == null)
			throw new Exception("Selected Alerting model could not be found");
		IProject project = alertFile.getProject();
		;
		// Get serialize alerts
		String alertsSerialization = readAlertModel(alertFile, project);

		// TODO Send alerts to the monitoring

	}

	private IFile getSelectedFile() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
			Object firstElement = selection.getFirstElement();
			if (firstElement instanceof IAdaptable) {
				return (IFile) ((IAdaptable) firstElement).getAdapter(IFile.class);
			}
		}
		return null;
	}

	protected String readAlertModel(IFile modelFile, IProject project) throws IOException {
		String filename = modelFile.getFullPath().toOSString()
				.substring(modelFile.getFullPath().toOSString().indexOf(File.separator, 1) + 1)
				.replaceFirst(File.separator, ".");
		IFile file = project.getFile("src-gen" + File.separator + filename + ".rules");
		String file_path = file.getLocationURI().toString();
		file_path = file_path.substring(file_path.indexOf(File.separator));
		Path model_path = FileSystems.getDefault().getPath(file_path);
		return new String(Files.readAllBytes(model_path));
	}
}
