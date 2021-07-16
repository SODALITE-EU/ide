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
		String key = node.getData().getKey();
		String value = node.getData().getValue();
		if (key.equals("stdout") || key.equals("stderr")) {
			int index = value.indexOf('\n');
			if (index > 0)
				value = value.substring(0, index) + " ...";
		}
		if (value == null)
			value = "-";
		TreeNode<Node> parent = node.getParent();
		String parentKey = parent.getData().getKey();
		if (parentKey.equals("monitoring_dashboards")) {
			return new StyledString(value, StyledString.COUNTER_STYLER);
		}
		return new StyledString(value);

	}

	@Override
	public Image getImage(Object element) {
		TreeNode<Node> node = (TreeNode<Node>) element;
		TreeNode<Node> parent = node.getParent();
		String parentKey = parent.getData().getKey();
		if (parentKey.equals("instance_state") || node.getData().getKey().equals("state")) {
			String value = node.getData().getValue();
			ImageDescriptor stateImage = createImageDescriptor(value);
			return getResourceManager().createImage(stateImage);
		} else {
			return null;
		}
	}

}
