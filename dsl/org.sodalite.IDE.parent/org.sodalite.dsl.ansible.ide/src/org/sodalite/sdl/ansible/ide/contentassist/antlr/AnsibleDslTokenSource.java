/*
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ide.contentassist.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;
import org.sodalite.sdl.ansible.ide.contentassist.antlr.internal.InternalAnsibleDslParser;

public class AnsibleDslTokenSource extends AbstractIndentationTokenSource {

	public AnsibleDslTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalAnsibleDslParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalAnsibleDslParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalAnsibleDslParser.RULE_END;
	}

	@Override
	protected boolean shouldEmitPendingEndTokens() {
		return false;
	}
}
