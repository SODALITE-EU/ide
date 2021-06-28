package org.sodalite.ide.ui.views.parts.deployment;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class IdLabelProvider extends LabelProvider implements IStyledLabelProvider {

	private ImageDescriptor blueprintImage;
	private ImageDescriptor deploymentImage;
	private ResourceManager resourceManager;

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

	@Override
	public void dispose() {
		if (resourceManager != null) {
			resourceManager.dispose();
			resourceManager = null;
		}
	}

	protected ResourceManager getResourceManager() {
		if (resourceManager == null) {
			resourceManager = new LocalResourceManager(JFaceResources.getResources());
		}
		return resourceManager;
	}

	private ImageDescriptor createImageDescriptor(String image) {
		Bundle bundle = FrameworkUtil.getBundle(IdLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path("icons/" + image + ".png"), null);
		return ImageDescriptor.createFromURL(url);
	}

}
