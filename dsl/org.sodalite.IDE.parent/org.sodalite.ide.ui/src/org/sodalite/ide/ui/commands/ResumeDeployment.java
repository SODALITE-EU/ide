package org.sodalite.ide.ui.commands;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;
import org.sodalite.ide.ui.views.parts.deployment.BlueprintView;

public class ResumeDeployment {
	@Execute
	public void execute() throws Exception {
		// Get selected deployment
		ISelection selection = BlueprintView.getView().getSelection();
		if (!selection.isEmpty()) {
			TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) ((TreeSelection) selection).getFirstElement();
			if (node.getData().isDeployment())
				BlueprintView.getView().resumeDeployment(node.getData());
		}
	}
}