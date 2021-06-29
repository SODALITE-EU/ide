package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class IdLabelProvider extends BlueprintLabelProvider {

	private ImageDescriptor blueprintImage;
	private ImageDescriptor deploymentImage;

	public IdLabelProvider() {
		blueprintImage = createImageDescriptor("blueprint");
		deploymentImage = createImageDescriptor("deployment");
	}

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;
		StyledString styledString = new StyledString("-");
		if (node.getData().isDeployment() && node.getData().getDeployment().getDeployment_id() != null) {
			styledString = new StyledString(node.getData().getDeployment().getDeployment_id());
		} else if (node.getData().isBlueprint() && node.getData().getBlueprint().getBlueprint_id() != null) {
			styledString = new StyledString(node.getData().getBlueprint().getBlueprint_id(),
					StyledString.QUALIFIER_STYLER);
		}
		return styledString;
	}

	@Override
	public Image getImage(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;
		if (node.getData().isBlueprint()) {
			return getResourceManager().createImage(blueprintImage);
		} else if (node.getData().isDeployment()) {
			return getResourceManager().createImage(deploymentImage);
		} else {
			return null;
		}
	}
}
