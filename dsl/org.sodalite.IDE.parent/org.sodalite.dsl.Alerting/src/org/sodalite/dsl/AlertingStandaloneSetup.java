/*
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AlertingStandaloneSetup extends AlertingStandaloneSetupGenerated {

	public static void doSetup() {
		new AlertingStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
