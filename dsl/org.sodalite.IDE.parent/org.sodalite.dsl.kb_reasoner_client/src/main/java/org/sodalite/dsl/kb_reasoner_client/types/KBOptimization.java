package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.ArrayList;
import java.util.List;

public class KBOptimization {
	String node_template;
	List<KBIssue> issues = new ArrayList<>();
	
	public String getNodeTemplate() {
		return node_template;
	}
	public void setNodeTemplate(String node_template) {
		this.node_template = node_template;
	}
	
	public List<KBIssue> getIssues() {
		return issues;
	}
	
	public void setIssues(List<KBIssue> issues) {
		this.issues = issues;
	}
	
	public class KBIssue{
		String path;
		String value;
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return "{\"path\": " + this.path + ", \"value\":" + this.value + "}";
		}
	}
}