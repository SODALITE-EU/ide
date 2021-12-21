package org.sodalite.dsl.web;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.concurrent.CancelableUnitOfWork;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.model.DocumentStateResult;
import org.eclipse.xtext.web.server.model.IXtextWebDocument;
import org.eclipse.xtext.web.server.model.XtextWebDocumentAccess;
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler;
import org.sodalite.dsl.ide.backend.SodaliteBackendProxy;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Service class for loading, saving, and reverting documents. The actual work
 * is done by an implementation of {@link IServerResourceHandler}, so if you
 * want to use this service you must provide such an implementation in the Guice
 * bindings.
 */
@Singleton
public class DeployAadmService {
	@Inject
	private XtextWebDocumentAccess.Factory documentAccessFactory;


	/**
	 * Save the content of a document.
	 */
	public DocumentStateResult deploy(XtextWebDocumentAccess document, String ttl, IServerResourceHandler resourceHandler,
			IServiceContext serviceContext) throws InvalidRequestException {
		return document.readOnly(new CancelableUnitOfWork<DocumentStateResult, IXtextWebDocument>() {
			@Override
			public DocumentStateResult exec(IXtextWebDocument it, CancelIndicator cancelIndicator) throws Exception {
				try {
					// Save model in server
					resourceHandler.put(it, serviceContext);
					it.setDirty(false);
					
					// Deploy AADM
					String aadmDSL = it.getText();
					String aadmURI = null;
					String name = it.getResourceId().replace(".aadm", "");
					String namespace = null;
					try {
						Pattern p = Pattern.compile("(?<=module:).*");
					    Matcher m = p.matcher(aadmDSL);
					    if (m.find()) {
					    	namespace = m.group().trim();
					    }
					} catch (Exception e) {
						//namespace not found
					}
					String version = null;
					SodaliteBackendProxy.deployAADM(ttl, aadmDSL, aadmURI, name, namespace, version);
					return new DocumentStateResult(aadmURI);
				} catch (IOException ioe) {
					throw new InvalidRequestException.ResourceNotFoundException(ioe.getMessage(), ioe);
				}
				return new DocumentStateResult(it.getStateId());
			}
		});
	}
}