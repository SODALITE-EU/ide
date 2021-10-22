/*
 * generated by Xtext 2.25.0
 */
package org.sodalite.sdl.ansible.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.sodalite.dsl.ansible.ui.internal.AnsibleActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AnsibleDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(AnsibleActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		AnsibleActivator activator = AnsibleActivator.getInstance();
		return activator != null ? activator.getInjector(AnsibleActivator.ORG_SODALITE_SDL_ANSIBLE_ANSIBLEDSL) : null;
	}

}