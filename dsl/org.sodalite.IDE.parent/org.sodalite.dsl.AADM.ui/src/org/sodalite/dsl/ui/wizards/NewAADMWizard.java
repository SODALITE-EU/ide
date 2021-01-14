package org.sodalite.dsl.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.DefaultLocalSessionCreationOperation;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.common.tools.api.util.EqualityHelper;
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.internal.viewpoint.ViewpointSelectionCallbackWithConfimationAndDependenciesHandling;
import org.eclipse.sirius.ui.tools.api.views.ViewHelper;
import org.eclipse.sirius.ui.tools.internal.actions.creation.CreateRepresentationAction;
import org.eclipse.sirius.ui.tools.internal.viewpoint.ViewpointHelper;
import org.eclipse.sirius.ui.tools.internal.views.common.SessionLabelProvider;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.sirius.viewpoint.provider.Messages;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.progress.IProgressService;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.sodalite.dsl.ui.backend.BackendLogger;

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
		boolean finished = true;
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
			MessageDialog.openError(dw.getShell(), "Error in AADM creation wizard", e.getMessage());
		}

		// Create representation file
		// Create AADMView
		// Code below taken from sirius.org plugins
		URI sessionModelURI = URI
				.createPlatformResourceURI(file.getFullPath().toOSString().replaceFirst(".aadm", ".aird"), true);
		final Collection<URI> semanticResourceURIs = new ArrayList<>();
		semanticResourceURIs.add(URI.createPlatformResourceURI(file.getFullPath().toOSString(), true));

		SessionCreationOperation sessionCreationOperation = new SessionCreationOperation(sessionModelURI,
				semanticResourceURIs);
		try {
			getContainer().run(true, false, sessionCreationOperation);
			final Session session = sessionCreationOperation.getSession();

			getContainer().run(false, false, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					// Select the AADM view point
					final SortedMap<Viewpoint, Boolean> viewpointsMap = NewAADMWizard.getViewpointsWithMonitor(session);
					// viewpointsMap.put(viewpointsMap.lastKey(), true); //Enabling AADMView

					Collection<Viewpoint> selectedViewPoints = new ArrayList<>();
					for (Viewpoint vp : viewpointsMap.keySet())
						selectedViewPoints.add(vp);

					Viewpoint viewpoint = viewpointsMap.firstKey();

					if (!ViewpointHelper.isViewpointEnabledInSession(session, viewpoint)) {
						// if the viewpoint is not enabled in the session we activate it with all its
						// potential dependencies.
						final SortedMap<Viewpoint, Boolean> originalViewpointsMap = new TreeMap<>(
								new ViewpointRegistry.ViewpointComparator());
						Collection<Viewpoint> availableViewpoints = ViewpointHelper.getAvailableViewpoints(session);
						Collection<Viewpoint> selectedViewpoints = session.getSelectedViewpoints(false);
						for (final Viewpoint availableViewpoint : availableViewpoints) {
							boolean selected = false;

							for (Viewpoint selectedViewpoint : selectedViewpoints) {
								if (EqualityHelper.areEquals(selectedViewpoint, availableViewpoint)) {
									selected = true;
									break;
								}
							}
							originalViewpointsMap.put(availableViewpoint, Boolean.valueOf(selected));
						}
						SortedMap<Viewpoint, Boolean> newViewpointToSelectionStateMap = new TreeMap<>(
								new ViewpointRegistry.ViewpointComparator());
						newViewpointToSelectionStateMap.putAll(originalViewpointsMap);
						newViewpointToSelectionStateMap.put(viewpoint, true);

						// we retrieve the viewpoints that are dependencies of the viewpoint to
						// activate to activate these also.
						Map<String, Viewpoint> missingViewpointDependencies = ViewpointHelper
								.getViewpointDependencies(availableViewpoints, selectedViewpoints, viewpoint);
						for (Viewpoint missingViewpointDependency : missingViewpointDependencies.values().stream()
								.filter(vp -> vp != null).collect(Collectors.toSet())) {
							newViewpointToSelectionStateMap.put(missingViewpointDependency, true);
						}
						ViewpointHelper.applyNewViewpointSelection(originalViewpointsMap,
								newViewpointToSelectionStateMap, session, true,
								new ViewpointSelectionCallbackWithConfimationAndDependenciesHandling());
					}

					Optional<Resource> semanticElement = session.getSemanticResources().stream().filter(
							res -> ((LazyLinkingResource) res).getLanguageName().equals("org.sodalite.dsl.AADM"))
							.findFirst();
					if (semanticElement.isPresent()) {
						EObject semanticElementSource = semanticElement.get().getContents().get(0);
						// TODO Fix
						RepresentationDescription loadedInSessionDescription = DialectManager.INSTANCE
								.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false),
										semanticElementSource)
								.iterator().next();
						if (loadedInSessionDescription != null) {
							CreateRepresentationAction action = new CreateRepresentationAction(session,
									semanticElementSource, loadedInSessionDescription,
									new SessionLabelProvider(ViewHelper.INSTANCE.createAdapterFactory()));
							action.run();
						}
					}
				}
			});
		} catch (Exception ex) {
			BackendLogger.log("Error", ex);
		}

		return finished;
	}

	class WizardNewAADMCreationPage extends WizardNewFileCreationPage {
		public WizardNewAADMCreationPage(String pageName, IStructuredSelection selection) {
			super(pageName, selection);
		}

		@Override
		protected InputStream getInitialContents() {
			String content = "node_templates:\n" + "\tmy_node:\n" + "\t\ttype: my.type";
			return new ByteArrayInputStream(content.getBytes(Charset.forName("UTF-8")));
		}
	}

	/**
	 * Class adapted from Sirius.org plugins
	 *
	 */
	private static final class SessionCreationOperation extends WorkspaceModifyOperation {

		private URI sessionModelURI;

		private Collection<URI> semanticResourceURIs;

		private Session session;

		SessionCreationOperation(URI sessionModelURI, Collection<URI> semanticResourceURIs) {
			super();
			this.sessionModelURI = sessionModelURI;
			this.semanticResourceURIs = semanticResourceURIs;
		}

		public Session getSession() {
			return session;
		}

		@Override
		protected void execute(final IProgressMonitor monitor) throws CoreException, InterruptedException {
			try {
				monitor.beginTask("Creating the AADM representation file", 1);

				// Create a Session from the session model URI
				org.eclipse.sirius.business.api.session.SessionCreationOperation sessionCreationOperation = new DefaultLocalSessionCreationOperation(
						sessionModelURI, new SubProgressMonitor(monitor, 1));
				sessionCreationOperation.execute();
				session = sessionCreationOperation.getCreatedSession();

				for (URI semanticResourceURI : semanticResourceURIs) {
					Command addSemanticResourceCmd = (Command) new AddSemanticResourceCommand(session,
							semanticResourceURI, new SubProgressMonitor(monitor, 1));
					session.getTransactionalEditingDomain().getCommandStack().execute(addSemanticResourceCmd);
				}
			} finally {
				monitor.done();
			}
		}

	}

	/**
	 * Below code updated from sirius.org plugins
	 */
	private static SortedMap<Viewpoint, Boolean> getViewpointsWithMonitor(final Session session) {
		final SortedSet<Viewpoint> allViewpoints = new TreeSet<Viewpoint>(new ViewpointRegistry.ViewpointComparator());
		final SortedMap<Viewpoint, Boolean> viewpointsMap = new TreeMap<>(new ViewpointRegistry.ViewpointComparator());
		final IProgressService ps = PlatformUI.getWorkbench().getProgressService();
		try {
			ps.busyCursorWhile(new IRunnableWithProgress() {
				@Override
				public void run(final IProgressMonitor pm) {
					pm.beginTask(Messages.ViewpointSelection_loadingViewpointsTask, 4);

					final Collection<String> semanticFileExtensions = NewAADMWizard.getSemanticFileExtensions(session);
					pm.worked(1);

					final Set<Viewpoint> viewpoints = NewAADMWizard.getViewpoints(semanticFileExtensions);
					pm.worked(1);

					allViewpoints.addAll(viewpoints);
					pm.worked(1);

					Collection<Viewpoint> selectedViewpoints = session.getSelectedViewpoints(false);

					for (final Viewpoint viewpoint : allViewpoints) {
						boolean selected = false;

						for (Viewpoint selectedViewpoint : selectedViewpoints) {
							if (EqualityHelper.areEquals(selectedViewpoint, viewpoint)) {
								selected = true;
								break;
							}
						}

						viewpointsMap.put(viewpoint, Boolean.valueOf(selected));
					}

					pm.done();
				}
			});
			return viewpointsMap;
		} catch (final InvocationTargetException e) {
			if (e.getCause() instanceof RuntimeException) {
				throw (RuntimeException) e.getCause();
			}
			throw new RuntimeException(e.getCause());
		} catch (final InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException(e);
		}
	}

	/**
	 * Below code updated from sirius.org plugins
	 */
	private static Collection<String> getSemanticFileExtensions(final Session session) {
		final Collection<String> fileExtensions = new HashSet<String>();
		for (final Resource resource : session.getSemanticResources()) {
			if (resource != null && resource.getURI() != null) {
				final String currentFileExtension = resource.getURI().fileExtension();
				if (currentFileExtension != null) {
					fileExtensions.add(currentFileExtension);
				}
			}
		}
		return fileExtensions;
	}

	/**
	 * Below code updated from sirius.org plugins
	 */
	private static Set<Viewpoint> getViewpoints(final Collection<String> fileExtensions) {
		final SortedSet<Viewpoint> validViewpoints = new TreeSet<Viewpoint>(
				new ViewpointRegistry.ViewpointComparator());
		for (final String extension : fileExtensions) {
			validViewpoints.addAll(ViewpointSelection.getViewpoints(extension));
		}
		return validViewpoints;
	}

}
