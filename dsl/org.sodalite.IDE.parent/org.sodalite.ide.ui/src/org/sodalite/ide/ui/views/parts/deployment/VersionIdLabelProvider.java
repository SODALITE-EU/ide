package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.viewers.StyledString;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class VersionIdLabelProvider extends BlueprintLabelProvider {

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

}
