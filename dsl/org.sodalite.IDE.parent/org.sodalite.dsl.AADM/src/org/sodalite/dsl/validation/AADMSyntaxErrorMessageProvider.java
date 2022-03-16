package org.sodalite.dsl.validation;

import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;

public class AADMSyntaxErrorMessageProvider implements ISyntaxErrorMessageProvider {

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
		String msg = "AADM model is wrong, please check syntax and indentation";
		return new SyntaxErrorMessage(msg, "Wrong AADM entity");
	}

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IValueConverterErrorContext context) {
		String msg = "AADM model is wrong, please value types compliance";
		return new SyntaxErrorMessage(msg, "Wrong AADM entity");
	}

}
