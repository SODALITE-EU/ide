package org.sodalite.ide.ui.views.model;

import org.sodalite.dsl.kb_reasoner_client.types.Model;

public class Node {
	private String label;
	private String module;
	private Model model;

	public Node(String label) {
		this(label, null, null);
	}

	public Node(String label, String module) {
		this(label, module, null);
	}

	public Node(String label, String module, Model model) {
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
}
