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
import org.sodalite.ide.ui.views.model.ModelNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class DeploymentLabelProvider extends LabelProvider implements IStyledLabelProvider {

	private ImageDescriptor kbImage;
	private ImageDescriptor moduleImage;
	private ImageDescriptor aadmImage;
	private ImageDescriptor rmImage;
	private ResourceManager resourceManager;

	public DeploymentLabelProvider() {
		kbImage = createImageDescriptor("kb");
		moduleImage = createImageDescriptor("module");
		aadmImage = createImageDescriptor("aadm_model");
		rmImage = createImageDescriptor("rm_model");
	}

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<ModelNode> node = (TreeNode<ModelNode>) element;
		StyledString styledString = new StyledString(node.getData().getLabel());
		if (node.getData().equals("RMs") || node.getData().equals("AADMs")) {
			styledString = new StyledString(node.getData().getLabel(), StyledString.QUALIFIER_STYLER);
		}
		return styledString;
	}

	@Override
	public Image getImage(Object element) {
		TreeNode<ModelNode> node = (TreeNode<ModelNode>) element;
		if (node.getData().equals("RMs")) {
			return getResourceManager().createImage(kbImage);
		} else if (node.getData().equals("AADMs")) {
			return getResourceManager().createImage(kbImage);
		} else if (node.getData().getLabel().contains(".rm")) {
			return getResourceManager().createImage(rmImage);
		} else if (node.getData().getLabel().contains(".aadm")) {
			return getResourceManager().createImage(aadmImage);
		} else {
			return getResourceManager().createImage(moduleImage);
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
		Bundle bundle = FrameworkUtil.getBundle(DeploymentLabelProvider.class);
		URL url = FileLocator.find(bundle, new Path("icons/" + image + ".png"), null);
		return ImageDescriptor.createFromURL(url);
	}

}
