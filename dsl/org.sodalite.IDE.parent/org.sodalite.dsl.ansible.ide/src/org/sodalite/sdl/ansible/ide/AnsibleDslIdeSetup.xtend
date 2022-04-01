/*
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.sodalite.sdl.ansible.AnsibleDslRuntimeModule
import org.sodalite.sdl.ansible.AnsibleDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class AnsibleDslIdeSetup extends AnsibleDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new AnsibleDslRuntimeModule, new AnsibleDslIdeModule))
	}
	
}