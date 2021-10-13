package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.SortedSet;
import java.util.TreeSet;

public class KBSuggestion {
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

	public void setEntity_name(String entity_name) {
		this.entity_name = entity_name;
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
}
