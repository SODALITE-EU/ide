package org.sodalite.dsl.web;

import java.io.IOException;

import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.concurrent.CancelableUnitOfWork;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.model.DocumentStateResult;
import org.eclipse.xtext.web.server.model.IXtextWebDocument;
import org.eclipse.xtext.web.server.model.XtextWebDocumentAccess;
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler;

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
	public DocumentStateResult deploy(XtextWebDocumentAccess document, IServerResourceHandler resourceHandler,
			IServiceContext serviceContext) throws InvalidRequestException {
		return document.readOnly(new CancelableUnitOfWork<DocumentStateResult, IXtextWebDocument>() {
			@Override
			public DocumentStateResult exec(IXtextWebDocument it, CancelIndicator cancelIndicator) throws Exception {
				try {
					resourceHandler.put(it, serviceContext);
					it.setDirty(false);
				} catch (IOException ioe) {
					throw new InvalidRequestException.ResourceNotFoundException(ioe.getMessage(), ioe);
				}
				return new DocumentStateResult(it.getStateId());
			}
		});
	}
}