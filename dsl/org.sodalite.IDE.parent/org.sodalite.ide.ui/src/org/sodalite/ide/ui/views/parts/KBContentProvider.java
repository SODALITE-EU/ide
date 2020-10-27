package org.sodalite.ide.ui.views.parts;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.sodalite.ide.ui.views.model.Node;

public class KBContentProvider implements ITreeContentProvider {

	@Override
	public boolean hasChildren(Object element) {
		Node<String> node = (Node<String>) element;
		return !node.getChildren().isEmpty();
	}

	@Override
	public Object getParent(Object element) {
		Node<String> node = (Node<String>) element;
		return node.getParent();
	}

	@Override
	public Object[] getElements(Object inputElement) {
		Node<String> root = (Node<String>) inputElement;
		return root.getChildren().toArray();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		Node<String> node = (Node<String>) parentElement;
		return node.getChildren().toArray();
	}
}
