package org.sodalite.dsl.kb_reasoner_client.types;

public enum TypeKind {
	DATATYPE("data"), NODETYPE("node"), CAPABILITY_TYPE("capability"), RELATIONSHIP_TYPE("relationship"),
	INTERFACE_TYPE("interface");

	private String label;

	TypeKind(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
