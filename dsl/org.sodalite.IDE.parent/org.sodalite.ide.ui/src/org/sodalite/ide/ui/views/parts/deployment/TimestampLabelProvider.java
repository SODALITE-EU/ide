package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class TimestampLabelProvider extends LabelProvider implements IStyledLabelProvider {

	public TimestampLabelProvider() {
	}

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;
		StyledString styledString = new StyledString("-");
		if (node.getData().isDeployment() && node.getData().getDeployment().getTimestamp() != null) {
			styledString = new StyledString(node.getData().getDeployment().getTimestamp());
		} else if (node.getData().isBlueprint() && node.getData().getBlueprint().getTimestamp() != null) {
			styledString = new StyledString(node.getData().getBlueprint().getTimestamp());
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
