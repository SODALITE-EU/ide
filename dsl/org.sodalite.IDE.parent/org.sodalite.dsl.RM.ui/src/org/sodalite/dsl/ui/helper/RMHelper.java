package org.sodalite.dsl.ui.helper;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.sodalite.dsl.rM.EDataTypeName;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class RMHelper {
	public static IFile getSelectedFile() {
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

	public static String selectFile(String dialogText) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		// File standard dialog
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText(dialogText);
		// fileDialog.setFilterExtensions(new String[] { "*.txt" });
		// Put in a readable name for the filter
		// fileDialog.setFilterNames(new String[] { "Textfiles(*.txt)" });
		String selected = fileDialog.open();
		return selected;
	}

	public static void openFileInEditor(IFile file) throws PartInitException {
		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
				try {
					page.openEditor(new FileEditorInput(file), desc.getId());
				} catch (PartInitException e) {
					SodaliteLogger.log("Error open model in editor", e);
				}
			}
		});
	}

	public static String readFile(IFile file) throws IOException {
		String path = file.getLocationURI().toString();
		path = path.substring(path.indexOf(File.separator));
		Path file_path = FileSystems.getDefault().getPath(path);
		String content = new String(Files.readAllBytes(file_path));
		return content;
	}

	public static String readFile(Path path) throws IOException {
		return new String(Files.readAllBytes(path));
	}

	public static String convertType(EDataTypeName eDataTypeName) {
		if (eDataTypeName instanceof EPREFIX_TYPE) {
			EPREFIX_TYPE ePrefix_Type = (EPREFIX_TYPE) eDataTypeName;
			return ePrefix_Type.getModule() + '/' + ePrefix_Type.getType();
		} else {
			return eDataTypeName.toString();
		}

	}

	public static void saveFileInFolder(String filename, String filecontent, IContainer targetFolder) {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		IFile targetFile = null;
		if (targetFolder instanceof IProject)
			targetFile = ((IProject) targetFolder).getFile(filename);
		else if (targetFolder instanceof IFolder)
			targetFile = ((IFolder) targetFolder).getFile(filename);
		if (targetFile == null) {
			MessageDialog.openError(shell, "Folder not found",
					"Folder " + targetFolder.getName() + " could not be found");
		}
		if (!targetFile.exists()) {
			saveContentInFile(filecontent, targetFile);
		} else {
			boolean confirmed = MessageDialog.openConfirm(shell,
					"Target file exists in folder " + targetFolder.getName(),
					"Do you want to override target file " + targetFile.getName());
			if (confirmed) {
				try {
					targetFile.delete(false, null);
					saveContentInFile(filecontent, targetFile);
				} catch (CoreException e) {
					SodaliteLogger.log("Error", e);
				}

			}
		}
	}

	public static void saveContentInFile(String content, IFile targetFile) {
		try {
			byte[] bytes = content.getBytes();
			InputStream source = new ByteArrayInputStream(bytes);
			targetFile.create(source, IResource.NONE, null);
		} catch (CoreException e) {
			SodaliteLogger.log("Error", e);
		}
	}

	public static IContainer getWorkspaceRoot() {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IContainer root = workspaceRoot.getContainerForLocation(workspaceRoot.getLocation());
		return root;
	}
}
