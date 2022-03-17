package org.sodalite.dsl.web;

import java.util.UUID;

import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.generator.GeneratorResult;
import org.eclipse.xtext.web.server.model.XtextWebDocumentAccess;
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler;
import org.sodalite.dsl.ide.backend.SodaliteBackendConfiguration;
import org.sodalite.dsl.ide.backend.SodaliteBackendProxy;
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
					// Read request parameters
					String inputs_yaml = context.getParameter("inputs").replaceAll(";", "\n");
					String imageBuildConf = null;
					if (context.getParameter("ibfilenameContent") != null)
						imageBuildConf = context.getParameter("ibfilenameContent"); 
					String version_tag = context.getParameter("version_tag"); 
					int workers = Integer.valueOf(context.getParameter("workers"));
					boolean completeModel = false; 
					if (context.getParameter("complete") != null)
						completeModel = Boolean.valueOf(context.getParameter("complete"));
					String deployment_name = context.getParameter("deployment_name");
					// Adding additional inputs
					String consul_ip = SodaliteBackendConfiguration.Consul_IP;
					String grafana_uri = SodaliteBackendConfiguration.Grafana_URI;
					String skydive_analyzer_uri = SodaliteBackendConfiguration.SKYDIVE_ANALYZER_URI;
					inputs_yaml += "deployment_label: " + deployment_name + "\n";
					inputs_yaml += "consul_server_address: " + consul_ip + "\n";
					inputs_yaml += "skydive_analyzer: " + skydive_analyzer_uri + "\n";
					String grafana_template = "%1$sd/xfpJB9FGz/sodalite-node-exporters?orgId=1&var-deployment_label={{ %2$s }}";
					String grafana_address = String.format(grafana_template, grafana_uri, deployment_name);
					inputs_yaml += "grafana_address: " + grafana_address + "\n";
					String monitoring_id = UUID.randomUUID().toString();
					inputs_yaml += "monitoring_id: " + monitoring_id + "\n";
					try {
						inputs_yaml += "jwt: " + SodaliteBackendProxy.getKBReasoner().getJWT();
					} catch (Exception e) {
						// FIXME Error should be reported up
						e.printStackTrace();
					} 
					String username = SodaliteBackendConfiguration.KEYCLOAK_USER;
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
