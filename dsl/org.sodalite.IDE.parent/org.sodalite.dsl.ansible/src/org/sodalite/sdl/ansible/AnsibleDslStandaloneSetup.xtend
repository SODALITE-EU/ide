/*
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class AnsibleDslStandaloneSetup extends AnsibleDslStandaloneSetupGenerated {

	def static void doSetup() {
		new AnsibleDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}