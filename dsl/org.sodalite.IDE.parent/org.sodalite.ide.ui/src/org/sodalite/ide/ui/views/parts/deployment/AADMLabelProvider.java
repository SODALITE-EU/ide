package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class AADMLabelProvider extends LabelProvider implements IStyledLabelProvider {

	public AADMLabelProvider() {
	}

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;
		StyledString styledString = null;
		if (node.getData().isDeployment()) {
			styledString = new StyledString("-");
		} else if (node.getData().isBlueprint()) {
			String aadm_id = node.getData().getBlueprint().getAadm_id();
			aadm_id = aadm_id.substring(aadm_id.indexOf("AADM"));
			styledString = new StyledString(aadm_id);
		}
		return styledString;
	}

	@Override
	public Image getImage(Object element) {
		return null;
	}

	@Override
	public void dispose() {
	}

}
