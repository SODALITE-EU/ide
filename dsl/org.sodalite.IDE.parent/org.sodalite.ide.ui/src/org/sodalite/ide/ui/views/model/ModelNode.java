package org.sodalite.ide.ui.views.model;

import org.sodalite.dsl.kb_reasoner_client.types.Model;

public class ModelNode {
	private String label;
	private String module;
	private Model model;

	public ModelNode(String label) {
		this(label, null, null);
	}

	public ModelNode(String label, String module) {
		this(label, module, null);
	}

	public ModelNode(String label, String module, Model model) {
		this.label = label;
		this.module = module;
		this.model = model;
	}

	public String getModule() {
		return module;
	}

	public Model getModel() {
		return model;
	}

	public String getLabel() {
		return label;
	}

	public boolean isModule() {
		return module != null && model == null;
	}

	public boolean isModel() {
		return module != null && model != null;
	}

	// These methods are required for the TreeViewer to learn how to refresh the
	// view without collapsing it.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((toString() == null) ? 0 : toString().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModelNode other = (ModelNode) obj;
		if (toString() == null) {
			if (other.toString() != null)
				return false;
		} else if (!toString().equals(other.toString()))
			return false;
		return true;
	}
}
