package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.viewers.StyledString;
import org.sodalite.ide.ui.views.model.Node;
import org.sodalite.ide.ui.views.model.TreeNode;

public class NodeValueLabelProvider extends BlueprintLabelProvider {

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<Node> node = (TreeNode<Node>) element;
		String value = node.getData().getValue();
		if (value == null)
			value = "-";
		return new StyledString(value);
	}

}
