/*
 * generated by Xtext 2.25.0
 */
package org.sodalite.dsl.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.eclipse.xtext.web.server.persistence.IResourceBaseProvider;
import org.sodalite.dsl.AADMRuntimeModule;
import org.sodalite.dsl.AADMStandaloneSetup;
import org.sodalite.dsl.ide.AADMIdeModule;

/**
 * Initialization support for running Xtext languages in web applications.
 */
public class AADMWebSetup extends AADMStandaloneSetup {
	
	private IResourceBaseProvider resourceBaseProvider;

	public AADMWebSetup(IResourceBaseProvider resourceBaseProvider) {
		this.resourceBaseProvider = resourceBaseProvider;
	}
	
	@Override
	public Injector createInjector() {
		AADMWebModule webModule = new AADMWebModule(this.resourceBaseProvider);
		AADMRuntimeModule runtimeModule = new AADMRuntimeModule();
		AADMIdeModule ideModule = new AADMIdeModule();
		return Guice.createInjector(Modules2.mixin(runtimeModule, ideModule, webModule));
//		return Guice.createInjector(Modules2.mixin(new AADMRuntimeModule(), new AADMIdeModule(), new AADMWebModule()));
	}
	
}
