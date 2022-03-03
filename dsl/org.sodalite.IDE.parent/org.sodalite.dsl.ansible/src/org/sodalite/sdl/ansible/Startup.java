package org.sodalite.sdl.ansible;


import org.eclipse.ui.IStartup;
import org.sodalite.ide.ui.backend.SodaliteBackendProxy;


public class Startup implements IStartup {

	@Override
	public void earlyStartup() {
		
		SodaliteBackendProxy.createMongoClient();
			
	}
}
