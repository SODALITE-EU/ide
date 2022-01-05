package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.Map;

import org.sodalite.dsl.kb_reasoner_client.json.DeploymentStatusReportJsonDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(value = { "inputs", "instance_state", "outputs", "node_error" })
@JsonDeserialize(using = DeploymentStatusReportJsonDeserializer.class)
public class DeploymentStatusReport {

	String blueprint_id;
	String version_id;
	String deployment_id;
	String state;
	String operation;
	String timestamp_start;
	String timestamp_submission;
	String timestamp_end;
	Map<String, String> inputs;
	Map<String, String> instance_state;
	Map<String, String> outputs;
	String exception;
	String stdout;
	String stderr;
	Integer workers;
	DeploymentNodeError node_error;

	public DeploymentNodeError getNode_error() {
		return node_error;
	}

	public void setNode_error(DeploymentNodeError node_error) {
		this.node_error = node_error;
	}

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

	public String getTimestamp_start() {
		return timestamp_start;
	}

	public void setTimestamp_start(String timestamp_start) {
		this.timestamp_start = timestamp_start;
	}

	public String getTimestamp_submission() {
		return timestamp_submission;
	}

	public void setTimestamp_submission(String timestamp_submission) {
		this.timestamp_submission = timestamp_submission;
	}

	public String getTimestamp_end() {
		return timestamp_end;
	}

	public void setTimestamp_end(String timestamp_end) {
		this.timestamp_end = timestamp_end;
	}

}
