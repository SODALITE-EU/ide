/*
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AlertingAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/sodalite/dsl/parser/antlr/internal/InternalAlertingParser.tokens");
	}
}