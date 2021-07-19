package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.viewers.StyledString;
import org.sodalite.ide.ui.views.model.Node;
import org.sodalite.ide.ui.views.model.TreeNode;

public class NodeKeyLabelProvider extends BlueprintLabelProvider {

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<Node> node = (TreeNode<Node>) element;
		return new StyledString(node.getData().getKey());
	}

}
