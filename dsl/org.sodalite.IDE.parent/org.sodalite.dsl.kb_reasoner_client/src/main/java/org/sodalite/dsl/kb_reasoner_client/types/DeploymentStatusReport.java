package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "inputs", "instance_state", "outputs" })
public class DeploymentStatusReport {

	String blueprint_id;
	String version_id;
	String deployment_id;
	String state;
	String operation;
	String timestamp;
	Map<String, String> inputs;
	Map<String, String> instance_state;
	Map<String, String> outputs;
	String exception;
	String stdout;
	String stderr;
	Integer workers;

	public String getBlueprint_id() {
		return blueprint_id;
	}

	public void setBlueprint_id(String blueprint_id) {
		this.blueprint_id = blueprint_id;
	}

	public String getVersion_id() {
		return version_id;
	}

	public void setVersion_id(String version_id) {
		this.version_id = version_id;
	}

	public String getDeployment_id() {
		return deployment_id;
	}

	public void setDeployment_id(String deployment_id) {
		this.deployment_id = deployment_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Map<String, String> getInputs() {
		return inputs;
	}

	public void setInputs(Map<String, String> inputs) {
		this.inputs = inputs;
	}

	public Map<String, String> getInstance_state() {
		return instance_state;
	}

	public void setInstance_state(Map<String, String> instance_state) {
		this.instance_state = instance_state;
	}

	public Map<String, String> getOutputs() {
		return outputs;
	}

	public void setOutputs(Map<String, String> outputs) {
		this.outputs = outputs;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getStdout() {
		return stdout;
	}

	public void setStdout(String stdout) {
		this.stdout = stdout;
	}

	public String getStderr() {
		return stderr;
	}

	public void setStderr(String stderr) {
		this.stderr = stderr;
	}

	public Integer getWorkers() {
		return workers;
	}

	public void setWorkers(Integer workers) {
		this.workers = workers;
	}
}
