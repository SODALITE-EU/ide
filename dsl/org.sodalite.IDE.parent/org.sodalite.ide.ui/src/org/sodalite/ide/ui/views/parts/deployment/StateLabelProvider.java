package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class StateLabelProvider extends BlueprintLabelProvider {

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;
		StyledString styledString = new StyledString("-");
		if (node.getData().isDeployment() && node.getData().getDeployment().getState() != null) {
			styledString = new StyledString(node.getData().getDeployment().getState());
		}
		return styledString;
	}

	@Override
	public Image getImage(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;

		if (node.getData().isDeployment() && node.getData().getDeployment().getState() != null) {
			ImageDescriptor stateImage = createImageDescriptor(node.getData().getDeployment().getState());
			return getResourceManager().createImage(stateImage);
		} else {
			return null;
		}
	}

}
