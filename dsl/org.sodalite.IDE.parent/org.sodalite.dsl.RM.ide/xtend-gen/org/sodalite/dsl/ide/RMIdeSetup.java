/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.sodalite.dsl.RMRuntimeModule;
import org.sodalite.dsl.RMStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class RMIdeSetup extends RMStandaloneSetup {
  public Injector createInjector() {
    RMRuntimeModule _rMRuntimeModule = new RMRuntimeModule();
    RMIdeModule _rMIdeModule = new RMIdeModule();
    return Guice.createInjector(Modules2.mixin(_rMRuntimeModule, _rMIdeModule));
  }
}