package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.viewers.StyledString;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class NameLabelProvider extends BlueprintLabelProvider {

	public NameLabelProvider() {
	}

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;
		StyledString styledString = new StyledString("-");
		if (node.getData().isBlueprint() && node.getData().getBlueprint().getBlueprint_name() != null) {
			styledString = new StyledString(node.getData().getBlueprint().getBlueprint_name());
		} else if (node.getData().isDeployment() && node.getData().getDeployment().getDeployment_label() != null) {
			styledString = new StyledString(node.getData().getDeployment().getDeployment_label());
		}
		return styledString;
	}

}
