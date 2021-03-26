package org.sodalite.dsl.ui;

import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.ui.editor.model.edit.DefaultTextEditComposer;

public class AADMTextEditComposer extends DefaultTextEditComposer {
	@Override
	protected SaveOptions getSaveOptions() {
		return SaveOptions.newBuilder().format().getOptions();
	}
}
