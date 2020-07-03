package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class KBSuggestion {
	List<String> hierarchyPath = new ArrayList<>();
	SortedSet<String> suggestions = new TreeSet<>();
	
	public List<String> getHierarchyPath() {
		return hierarchyPath;
	}
	public void setHierarchyPath(List<String> hierarchyPath) {
		this.hierarchyPath = hierarchyPath;
	}
	public SortedSet<String> getSuggestions() {
		return suggestions;
	}
	public void setSuggestions(SortedSet<String> suggestions) {
		this.suggestions = suggestions;
	}
}
