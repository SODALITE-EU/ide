/*
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl

import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider
import org.sodalite.dsl.validation.AADMSyntaxErrorMessageProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class AADMRuntimeModule extends AbstractAADMRuntimeModule {
	def Class<? extends ISyntaxErrorMessageProvider> bindISyntaxErrorMessageProvider() {
        return AADMSyntaxErrorMessageProvider;
    }
}
