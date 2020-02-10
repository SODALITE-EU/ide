/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.sodalite.dsl.AADM.ui.internal.AADMActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AADMExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(AADMActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		AADMActivator activator = AADMActivator.getInstance();
		return activator != null ? activator.getInjector(AADMActivator.ORG_SODALITE_DSL_AADM) : null;
	}

}