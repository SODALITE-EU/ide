package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.SortedSet;
import java.util.TreeSet;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class KBError {
	String type;
	String entity_name;
	String context;
	String description;
	SortedSet<String> suggestions = new TreeSet<>();

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

	public void setContext(String context) {
		this.context = context;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SortedSet<String> getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(SortedSet<String> suggestions) {
		this.suggestions = suggestions;
	}

	@JsonProperty("info")
	private void unpackNameFromNestedObject(JsonNode info) {
		entity_name = info.get("name").asText();
		context = info.get("context").asText();
		description = info.get("description").asText();
		if (info.has("suggestions")) {
			JsonNode suggestionsJson = info.get("suggestions");
			suggestionsJson.forEach(suggestion -> {
				suggestions.add(suggestion.asText());

			});
		}
	}
}
