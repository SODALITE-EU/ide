package org.sodalite.dsl.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

public class NewAADMWizard extends BasicNewResourceWizard {
	private WizardNewFileCreationPage mainPage;

	public NewAADMWizard() {
		super();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("Create a new AADM");
		setNeedsProgressMonitor(true);
	}
	
	@Override
	public void addPages() {
		mainPage = new WizardNewAADMCreationPage("newFilePage1", getSelection());//$NON-NLS-1$
		mainPage.setTitle("AADM File");
		mainPage.setDescription("Create a new AADM");
		mainPage.setFileExtension("aadm");
		addPage(mainPage);
	}


	@Override
	public boolean performFinish() {
		IFile file = mainPage.createNewFile();
		if (file == null) {
			return false;
		}

		selectAndReveal(file);

		// Open editor on new file.
		IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
		try {
			if (dw != null) {
				IWorkbenchPage page = dw.getActivePage();
				if (page != null) {
					IDE.openEditor(page, file, true);
				}
			}
		} catch (PartInitException e) {
			MessageDialog.openError(dw.getShell(), "Error in AADM creation wizard",
					e.getMessage());
		}

		return true;
	}
	
	class WizardNewAADMCreationPage extends WizardNewFileCreationPage{
		public WizardNewAADMCreationPage(String pageName, IStructuredSelection selection) {
			super(pageName, selection);
		}

		@Override
		protected InputStream getInitialContents() {
			String content = "node_templates:\n" + 
					"\tmy_node:\n" + 
					"\t\ttype: my.type";
			return new ByteArrayInputStream(content.getBytes(Charset.forName("UTF-8")));
		}
	}

}
