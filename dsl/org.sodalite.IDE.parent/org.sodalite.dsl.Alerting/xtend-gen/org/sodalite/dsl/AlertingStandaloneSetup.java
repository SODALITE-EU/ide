/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl;

import org.sodalite.dsl.AlertingStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class AlertingStandaloneSetup extends AlertingStandaloneSetupGenerated {
  public static void doSetup() {
    new AlertingStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}