package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deployment {
	String blueprint_id;
	String deployment_id;
	Map<String, String> instance_state;
	String operation;
	String state;
	String stderr;
	String stdout;
	String timestamp;
	String timestamp_end;
	String timestamp_start;
	String timestamp_submission;
	String version_id;
	String workers;

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

	public Map<String, String> getInstance_state() {
		return instance_state;
	}

	public void setInstance_state(Map<String, String> instance_state) {
		this.instance_state = instance_state;
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

	public String getStderr() {
		return stderr;
	}

	public void setStderr(String stderr) {
		this.stderr = stderr;
	}

	public String getStdout() {
		return stdout;
	}

	public void setStdout(String stdout) {
		this.stdout = stdout;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTimestamp_end() {
		return timestamp_end;
	}

	public void setTimestamp_end(String timestamp_end) {
		this.timestamp_end = timestamp_end;
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

	public String getVersion_id() {
		return version_id;
	}

	public void setVersion_id(String version_id) {
		this.version_id = version_id;
	}

	public String getWorkers() {
		return workers;
	}

	public void setWorkers(String workers) {
		this.workers = workers;
	}
}
