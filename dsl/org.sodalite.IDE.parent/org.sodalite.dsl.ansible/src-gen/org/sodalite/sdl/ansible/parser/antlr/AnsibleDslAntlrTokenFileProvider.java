/*
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AnsibleDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/sodalite/sdl/ansible/parser/antlr/internal/InternalAnsibleDslParser.tokens");
	}
}
