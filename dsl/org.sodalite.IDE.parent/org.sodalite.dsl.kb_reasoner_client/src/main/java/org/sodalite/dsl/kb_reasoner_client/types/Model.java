package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.LinkedHashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Model extends KBEntity {
	String name;
	String description;
	String createdBy;
	String createdAt;
	String dsl;
	LinkedHashMap<String,NodeType> nodeTypes;

	public LinkedHashMap<String, NodeType> getNodeTypes() {
		return nodeTypes;
	}

	public void setNodeTypes(LinkedHashMap<String, NodeType> nodeTypes) {
		this.nodeTypes = nodeTypes;
	}

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
