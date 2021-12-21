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
					return getDeployAADMService(context);
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
	
	protected ServiceDescriptor getDeployAADMService(IServiceContext context) throws InvalidRequestException {
		XtextWebDocumentAccess document = getDocumentAccess(context);
		ServiceDescriptor serviceDescriptor = new ServiceDescriptor();
		serviceDescriptor.setService(() -> {
			try {
				// Generate AADM serialization
				GeneratorResult generatorResult = (GeneratorResult) getGeneratorService(context).getService().apply();
				String ttl = generatorResult.getContent();
				// TODO Deploy AADM 
				return deployAadmService.deploy(document, ttl, resourceHandler, context);
			} catch (Throwable throwable) {
				return handleError(serviceDescriptor, throwable);
			}
		});
		serviceDescriptor.setHasSideEffects(true);
		return serviceDescriptor;
	}
}
