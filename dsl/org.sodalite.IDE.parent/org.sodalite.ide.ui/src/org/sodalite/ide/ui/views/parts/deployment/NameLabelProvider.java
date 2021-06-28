package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class NameLabelProvider extends LabelProvider implements IStyledLabelProvider {

	public NameLabelProvider() {
	}

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;
		StyledString styledString = new StyledString("-");
		if (node.getData().isBlueprint() && node.getData().getBlueprint().getBlueprint_name() != null) {
			styledString = new StyledString(node.getData().getBlueprint().getBlueprint_name());
		}
		return styledString;
	}

	@Override
	public Image getImage(Object element) {
		return null;
	}

	@Override
	public void dispose() {
	}

}
