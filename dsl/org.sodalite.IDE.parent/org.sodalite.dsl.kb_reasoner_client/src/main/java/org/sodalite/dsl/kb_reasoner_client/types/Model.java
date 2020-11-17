package org.sodalite.dsl.kb_reasoner_client.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Model extends KBEntity {
	String namespace;
	String name;
	String createdBy;
	String createdAt;
	String dsl;

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getName() {
		return name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getDsl() {
		return dsl;
	}
}
