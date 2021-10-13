package org.sodalite.dsl.kb_reasoner_client.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Model extends KBEntity {
	String name;
	String description;
	String createdBy;
	String createdAt;
	String dsl;

	public String getName() {
		return name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getDsl() {
		return dsl;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public void setDsl(String dsl) {
		this.dsl = dsl;
	}
}
