package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.HashMap;

public class OperationData {
	
	String operation_name;
	HashMap<String, String> inputs;
	ImplementationData implementationData;
	
	public ImplementationData getImplementationData() {
		return implementationData;
	}
	public void setImplementationData(ImplementationData implementationData) {
		this.implementationData = implementationData;
	}
	public String getOperation_name() {
		return operation_name;
	}
	public void setOperation_name(String operation_name) {
		this.operation_name = operation_name;
	}
	public HashMap<String, String> getInputs() {
		return inputs;
	}
	public void setInputs(HashMap<String, String> inputs) {
		this.inputs = inputs;
	} 

}
