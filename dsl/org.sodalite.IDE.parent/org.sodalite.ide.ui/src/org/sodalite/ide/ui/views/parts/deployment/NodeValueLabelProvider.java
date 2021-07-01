package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
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

	@Override
	public Image getImage(Object element) {
		TreeNode<Node> node = (TreeNode<Node>) element;
		TreeNode<Node> parent = node.getParent();
		String parentKey = parent.getData().getKey();
		if (parentKey.equals("instance_state")) {
			String value = node.getData().getValue();
			ImageDescriptor stateImage = createImageDescriptor(value);
			return getResourceManager().createImage(stateImage);
		} else {
			return null;
		}
	}

}
