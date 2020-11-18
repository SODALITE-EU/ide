package org.sodalite.ide.ui.views.parts;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.sodalite.ide.ui.views.model.TreeNode;

public class KBContentProvider implements ITreeContentProvider {

	@Override
	public boolean hasChildren(Object element) {
		TreeNode<String> node = (TreeNode<String>) element;
		return !node.getChildren().isEmpty();
	}

	@Override
	public Object getParent(Object element) {
		TreeNode<String> node = (TreeNode<String>) element;
		return node.getParent();
	}

	@Override
	public Object[] getElements(Object inputElement) {
		TreeNode<String> root = (TreeNode<String>) inputElement;
		return root.getChildren().toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		TreeNode<String> node = (TreeNode<String>) parentElement;
		return node.getChildren().toArray();
	}
}
