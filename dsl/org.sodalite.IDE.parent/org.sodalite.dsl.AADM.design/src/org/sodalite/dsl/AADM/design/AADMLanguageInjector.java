package org.sodalite.dsl.AADM.design;

import org.sodalite.dsl.AADM.ui.internal.AADMActivator;

import com.altran.general.integration.xtextsirius.runtime.IXtextLanguageInjector;
import com.google.inject.Injector;

public class AADMLanguageInjector implements IXtextLanguageInjector {
	
	@Override
	public Injector getInjector() {
		return AADMActivator.getInstance()
				.getInjector(AADMActivator.ORG_SODALITE_DSL_AADM);
	}

}