package org.sodalite.dsl.web;

import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.XtextServiceDispatcher.ServiceDescriptor;
import org.eclipse.xtext.web.server.generator.GeneratorResult;
import org.eclipse.xtext.web.server.model.XtextWebDocumentAccess;
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler;
import org.eclipse.xtext.web.server.persistence.ResourcePersistenceService;

import com.google.inject.Inject;

public class AADMServiceDispatcher extends XtextServiceDispatcher {
	@Inject
	private SaveAadmService saveAadmService;
	
	@Inject
	private DeployAadmService deployAadmService;
	
	@Inject
	private IServerResourceHandler resourceHandler;
	
	protected ServiceDescriptor createServiceDescriptor(String serviceType, IServiceContext context) {
		// Process saveAADM, deployAADM services
		if (serviceType != null) {
			switch (serviceType) {
				case "save":
					return getSaveAADMService(context);
				case "deploy":
					// TODO read request parameters
					String inputs_yaml = ""; 
					String imageBuildConf = null; 
					String version_tag = ""; 
					int workers = 1; 
					boolean completeModel = false; 
					String deployment_name = ""; 
					String monitoring_id = ""; 
					String username = "";
					return getDeployAADMService(context, inputs_yaml, imageBuildConf, version_tag, 
							workers, completeModel, deployment_name, monitoring_id, username);
			}
		}
		return super.createServiceDescriptor(serviceType, context);
	}
	
	protected ServiceDescriptor getSaveAADMService(IServiceContext context) throws InvalidRequestException {
		XtextWebDocumentAccess document = getDocumentAccess(context);
		ServiceDescriptor serviceDescriptor = new ServiceDescriptor();
		serviceDescriptor.setService(() -> {
			try {
				// Generate AADM serialization
				GeneratorResult generatorResult = (GeneratorResult) getGeneratorService(context).getService().apply();
				String ttl = generatorResult.getContent();
				// Save AADM into KB
				return saveAadmService.save(document, ttl, resourceHandler, context);
			} catch (Throwable throwable) {
				return handleError(serviceDescriptor, throwable);
			}
		});
		serviceDescriptor.setHasSideEffects(true);
		return serviceDescriptor;
	}
	
	protected ServiceDescriptor getDeployAADMService(IServiceContext context, String inputs_yaml, String imageBuildConf, String version_tag, 
			int workers, boolean completeModel, String deployment_name, String monitoring_id, String username) throws InvalidRequestException {
		XtextWebDocumentAccess document = getDocumentAccess(context);
		ServiceDescriptor serviceDescriptor = new ServiceDescriptor();
		serviceDescriptor.setService(() -> {
			try {
				// Generate AADM serialization
				GeneratorResult generatorResult = (GeneratorResult) getGeneratorService(context).getService().apply();
				String ttl = generatorResult.getContent();
				// Deploy AADM 
				return deployAadmService.deploy(document, ttl, inputs_yaml, imageBuildConf, version_tag, 
					workers, completeModel, deployment_name, monitoring_id, username, resourceHandler, context);
			} catch (Throwable throwable) {
				return handleError(serviceDescriptor, throwable);
			}
		});
		serviceDescriptor.setHasSideEffects(true);
		return serviceDescriptor;
	}
}
