package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deployment {
	String blueprint_id;
	String deployment_id;
	String deployment_label;
	Map<String, String> last_inputs;
	Map<String, String> inputs;
	Map<String, String> outputs;
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
	String label;

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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDeployment_label() {
		return deployment_label;
	}

	public void setDeployment_label(String deployment_label) {
		this.deployment_label = deployment_label;
	}

	public Map<String, String> getLast_inputs() {
		return last_inputs;
	}

	public void setLast_inputs(Map<String, String> last_inputs) {
		this.last_inputs = last_inputs;
	}

	public Map<String, String> getInputs() {
		return inputs;
	}

	public void setInputs(Map<String, String> inputs) {
		this.inputs = inputs;
	}

	public Map<String, String> getOutputs() {
		return outputs;
	}

	public void setOutputs(Map<String, String> outputs) {
		this.outputs = outputs;
	}

	public String getMonitoringId() {
		if (this.getInputs() != null && this.getInputs().keySet().contains("monitoring_id"))
			return this.getInputs().get("monitoring_id");
		else if (this.getLast_inputs() != null && this.getLast_inputs().keySet().contains("monitoring_id"))
			return this.getLast_inputs().get("monitoring_id");
		else
			return null;
	}
}
