package org.sodalite.ide.ui.views.parts.kb;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.sodalite.ide.ui.views.model.ModelNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class ModelDescriptionProvider extends LabelProvider implements IStyledLabelProvider {

	public ModelDescriptionProvider() {
	}

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<ModelNode> node = (TreeNode<ModelNode>) element;
		String description = "";
		if (node.getData().getModel() != null && node.getData().getModel().getDescription() != null)
			description = node.getData().getModel().getDescription();
		return new StyledString(description);
	}

}
