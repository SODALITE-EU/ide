package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.viewers.StyledString;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class ProjectDomainLabelProvider extends BlueprintLabelProvider {

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;
		StyledString styledString = new StyledString("-");
		if (node.getData().isBlueprint() && node.getData().getBlueprint().getProject_domain() != null) {
			styledString = new StyledString(node.getData().getBlueprint().getProject_domain());
		}
		return styledString;
	}

}
