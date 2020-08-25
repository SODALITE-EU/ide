package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KBOptimizationError extends KBError{

	String path;
	String value;
	
	public void setPath(String path) {
		this.path = path;
	}
	public String getPath() {
		return path;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	@JsonProperty("info")
	private void unpackNameFromNestedObject(Map<String, String> info) {
		context = info.get("context");
		description = info.get("description");
		path = info.get("path");
		value = info.get("value");
	}
	
	@Override
	public String toString() {
		return "{\"path\": " + this.path + ", \"value\":" + this.value + "}";
	}

}
