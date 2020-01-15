package org.sodalite.dsl.ui.handlers;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient;

public class AADMSaveHandler implements IHandler {
	//TODO Configure KBReasonerClient endpoint from preference page information
	KBReasonerClient kbclient = new KBReasonerClient();

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell parent = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		try {
			//Return selected resource
			IFile file = getSelectedFile();
			IProject project = getProject (file);
			//Get serialize AADM model in Turtle
			String filename = file.getName().substring(0, file.getName().indexOf("."));
			IFile turtle = project.getFile("src-gen/" + filename + ".ttl");
			String turtle_path = turtle.getLocationURI().toString();
			turtle_path = turtle_path.substring(turtle_path.indexOf("/"));
			//Send turtle to KB
			Path aadm_path = FileSystems.getDefault().getPath(turtle_path);
			String aadmTTL = new String(Files.readAllBytes (aadm_path));
			String submissionId = filename;
			//TODO Manage saving in background reporting progress
			String submissionIRI = kbclient.saveAADM(aadmTTL, submissionId);
			// Upon completion, show dialog
			MessageDialog.openInformation(parent,
					"Save AADM", "The selected AADM model has been succesfully store in the KB with IRI:\n" + submissionIRI);
		}catch (Exception ex) {
			ex.printStackTrace();
			MessageDialog.openError(parent, "Save AADM Error", "There were an error reported by the KB:\n" + ex.getMessage());
		}
		return null;
	}

	private IProject getProject(IResource resource) {
		return resource.getProject();
	}

	private IFile getSelectedFile() {
		IFile file = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null)
		{
		    IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
		    Object firstElement = selection.getFirstElement();
		    if (firstElement instanceof IAdaptable)
		    {
		    	file = (IFile)((IAdaptable)firstElement).getAdapter(IFile.class);
		    }
		}
		return file;
	}

	@Override
	public boolean isEnabled() {
		// TODO Validate AADM before enabling
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
