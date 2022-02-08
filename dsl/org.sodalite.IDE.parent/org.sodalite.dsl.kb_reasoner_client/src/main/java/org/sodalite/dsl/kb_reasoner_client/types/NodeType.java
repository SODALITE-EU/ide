package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class NodeType {
	List<LinkedHashMap<String,InterfaceDefinition>> interfaces;

	public List<LinkedHashMap<String, InterfaceDefinition>> getInterfaces() {
		return interfaces;
	}

	public void setInterfaces(List<LinkedHashMap<String, InterfaceDefinition>> interfaces) {
		this.interfaces = interfaces;
	}

}
