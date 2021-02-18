package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "inputs", })
public class DeploymentReport {

	String blueprint_id;
	String deployment_id;
	Map<String, String> inputs;
	String operation;
	String state;
	String timestamp;
	String version_id;
	Integer workers;

	public String getBlueprint_id() {
		return blueprint_id;
	}

	public void setBlueprint_id(String blueprint_id) {
		this.blueprint_id = blueprint_id;
	}

	public String getDeployment_id() {
		return deployment_id;
	}

	public void setDeployment_id(String deployment_id) {
		this.deployment_id = deployment_id;
	}

	public Map<String, String> getInputs() {
		return inputs;
	}

	public void setInputs(Map<String, String> inputs) {
		this.inputs = inputs;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getVersion_id() {
		return version_id;
	}

	public void setVersion_id(String version_id) {
		this.version_id = version_id;
	}

	public Integer getWorkers() {
		return workers;
	}

	public void setWorkers(Integer workers) {
		this.workers = workers;
	}
}
