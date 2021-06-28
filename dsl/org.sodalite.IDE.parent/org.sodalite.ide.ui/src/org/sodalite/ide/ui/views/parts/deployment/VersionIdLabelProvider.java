package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class VersionIdLabelProvider extends LabelProvider implements IStyledLabelProvider {

	public VersionIdLabelProvider() {
	}

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;
		StyledString styledString = new StyledString("-");
		if (node.getData().isDeployment() && node.getData().getDeployment().getVersion_id() != null) {
			styledString = new StyledString(node.getData().getDeployment().getVersion_id());
		} else if (node.getData().isBlueprint() && node.getData().getBlueprint().getVersion_id() != null) {
			styledString = new StyledString(node.getData().getBlueprint().getVersion_id());
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
