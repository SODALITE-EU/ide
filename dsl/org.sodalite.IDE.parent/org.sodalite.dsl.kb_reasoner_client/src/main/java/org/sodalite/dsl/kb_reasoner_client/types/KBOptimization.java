package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.ArrayList;
import java.util.List;

public class KBOptimization {
	String node_template;
	List<String> optimizations = new ArrayList<>();
	
	public String getNodeTemplate() {
		return node_template;
	}
	public void setNodeTemplate(String node_template) {
		this.node_template = node_template;
	}
	
	public List<String> getOptimizations() {
		return optimizations;
	}
	
	public void setOptimizations(List<String> optimizations) {
		this.optimizations = optimizations;
	}

}
