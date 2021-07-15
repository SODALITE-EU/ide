package org.sodalite.ide.ui.commands;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;
import org.sodalite.ide.ui.views.parts.deployment.BlueprintView;

public class DeleteBlueprintOrDeployment {
	@Execute
	public void execute() throws Exception {
		// Get selected node
		ISelection selection = BlueprintView.getView().getSelection();
		if (!selection.isEmpty()) {
			TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) ((TreeSelection) selection).getFirstElement();
			BlueprintView.getView().delete(node);
		}
	}
}