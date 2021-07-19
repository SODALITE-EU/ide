package org.sodalite.ide.ui.commands;

import org.eclipse.e4.core.di.annotations.Execute;
import org.sodalite.ide.ui.views.parts.kb.KBView;

public class KBRefresh {
	@Execute
	public void execute() throws Exception {
		KBView.getView().refreshKB();
	}
}