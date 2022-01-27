package org.sodalite.dsl.ui.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;


public class GenerationHandler extends AbstractHandler implements IHandler {

	public static final String ANSIBLE_OUTPUT = "ansible_output";
	public static final String TURTLE_OUTPUT = "ttl_output";
	
	@Inject
    private IGenerator2 generator;
 
	@Inject
    private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
     
    @Inject
    IResourceDescriptions resourceDescriptions;
     
    @Inject
    IResourceSetProvider resourceSetProvider;
     
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
    	
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            Object firstElement = structuredSelection.getFirstElement();
            if (firstElement instanceof IFile) {
                IFile file = (IFile) firstElement;
                IProject project = file.getProject();
                IFolder srcGenFolder = project.getFolder("src-gen");
                if (!srcGenFolder.exists()) {
                    try {
                        srcGenFolder.create(true, true,
                                new NullProgressMonitor());
                    } catch (CoreException e) {
                        return null;
                    }
                }
                
                OutputConfiguration defaultOutput = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
        		defaultOutput.setDescription("Output Folder");
        		defaultOutput.setOutputDirectory("./src-gen");
        		defaultOutput.setOverrideExistingResources(true);
        		defaultOutput.setCreateOutputDirectory(true);
        		defaultOutput.setCleanUpDerivedResources(true);
        		defaultOutput.setSetDerivedProperty(true);
        		defaultOutput.setKeepLocalHistory(true);
        		
        		
        		OutputConfiguration ansibleOutput = new OutputConfiguration(ANSIBLE_OUTPUT);
        		ansibleOutput.setDescription("Ansible Output Folder");
        		ansibleOutput.setOutputDirectory("./");
        		ansibleOutput.setOverrideExistingResources(true);
        		ansibleOutput.setCreateOutputDirectory(true);
        		ansibleOutput.setCleanUpDerivedResources(false);
        		ansibleOutput.setSetDerivedProperty(false);
        		ansibleOutput.setKeepLocalHistory(true);
        		ansibleOutput.setInstallDslAsPrimarySource(false);
        		
        		OutputConfiguration turtleOutput = new OutputConfiguration(TURTLE_OUTPUT);
        		turtleOutput.setDescription("Turtle Output Folder");
        		turtleOutput.setOutputDirectory("./");
        		turtleOutput.setOverrideExistingResources(true);
        		turtleOutput.setCreateOutputDirectory(true);
        		turtleOutput.setCleanUpDerivedResources(false);
        		turtleOutput.setSetDerivedProperty(false);
        		turtleOutput.setKeepLocalHistory(true);
        		
        		Map<String,OutputConfiguration> outputs = new HashMap<String,OutputConfiguration>();
        		
        		outputs.put(IFileSystemAccess.DEFAULT_OUTPUT,defaultOutput);
        		outputs.put(ANSIBLE_OUTPUT,ansibleOutput);
        		outputs.put(TURTLE_OUTPUT,turtleOutput);
                
                final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
                
                fsa.setMonitor(new NullProgressMonitor());
                fsa.setProject(project);
                fsa.setOutputConfigurations(outputs);
                 
                URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
                ResourceSet rs = resourceSetProvider.get(project);
                Resource r = rs.getResource(uri, true);
                generator.doGenerate(r, fsa,new GeneratorContext());
                 
            }
        }
        return null;
    }
 
    @Override
    public boolean isEnabled() {
        return true;
    }

}
