package org.sodalite.ide.ui.commands;

import org.eclipse.e4.core.di.annotations.Execute;
import org.sodalite.ide.ui.views.parts.deployment.BlueprintView;

public class BlueprintsRefresh {
	@Execute
	public void execute() throws Exception {
		BlueprintView.getView().refreshBlueprints();
	}
}