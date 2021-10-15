/*
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.web;

import org.eclipse.xtext.web.server.generator.IContentTypeProvider;
import org.eclipse.xtext.web.server.model.IWebResourceSetProvider;
import org.eclipse.xtext.web.server.persistence.FileResourceHandler;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import org.eclipse.xtext.web.server.persistence.IServerResourceHandler;
import org.sodalite.dsl.web.resource.AADMContentTypeProvider;
import org.sodalite.dsl.web.resource.AADMResourceSetProvider;

import com.google.inject.Binder;

/**
 * Use this class to register additional components to be used within the web application.
 */
public class AADMWebModule extends AbstractAADMWebModule {
	private IResourceBaseProvider resourceBaseProvider;

	@Override
	public Class<? extends IContentTypeProvider> bindIContentTypeProvider() {
		return AADMContentTypeProvider.class;
	}

	public Class<? extends IWebResourceSetProvider> bindIWebResourceSetProvider() {
		return AADMResourceSetProvider.class;
	}

	public void configureResourceBaseProvider(Binder binder) {
		if (resourceBaseProvider != null) {
			binder.bind(IResourceBaseProvider.class).toInstance(resourceBaseProvider);
		}
	}

	public Class<? extends IServerResourceHandler> bindIServerResourceHandler() {
		return FileResourceHandler.class;
	}

	public AADMWebModule(IResourceBaseProvider resourceBaseProvider) {
		this.resourceBaseProvider = resourceBaseProvider;
	}
}
