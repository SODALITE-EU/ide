package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KBWarning {
	String type;
	String entity_name;
	String context;
	String description;
	String element_type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEntity_name() {
		return entity_name;
	}

	public String getContext() {
		return context;
	}

	public String getDescription() {
		return description;
	}

	public String getElementType() {
		return element_type;
	}

	@JsonProperty("info")
	private void unpackNameFromNestedObject(Map<String, String> info) {
		entity_name = info.get("name");
		context = info.get("context");
		description = info.get("description");
		element_type = info.get("element_type");
		// Process full context
		context = "node_templates/" + context + "/" + getEntity(element_type) + "/" + entity_name;
	}

	private String getEntity(String element_type) {
		if (element_type.equals("Property")) {
			return "properties";
		} else {
			return null;
		}
	}

}
