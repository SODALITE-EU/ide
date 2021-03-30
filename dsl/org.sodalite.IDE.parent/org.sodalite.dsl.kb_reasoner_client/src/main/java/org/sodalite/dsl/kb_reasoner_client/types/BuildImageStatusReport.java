package org.sodalite.dsl.kb_reasoner_client.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuildImageStatusReport {

	BuildParams build_params;
	String invocation_id;
	String response;
	String state;
	String timestamp_start;
	String timestamp_submission;
	String timestamp_end;
	BuildImageStatus status;

	public BuildParams getBuild_params() {
		return build_params;
	}

	public void setBuild_params(BuildParams build_params) {
		this.build_params = build_params;
	}

	public String getInvocation_id() {
		return invocation_id;
	}

	public void setInvocation_id(String invocation_id) {
		this.invocation_id = invocation_id;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public BuildImageStatus getStatus() {
		return status;
	}

	public void setStatus(BuildImageStatus status) {
		this.status = status;
	}

}

class BuildParams {
	String source_type;
	String source_url;
	String target_image_name;
	String target_image_tag;

	public String getSource_type() {
		return source_type;
	}

	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}

	public String getSource_url() {
		return source_url;
	}

	public void setSource_url(String source_url) {
		this.source_url = source_url;
	}

	public String getTarget_image_name() {
		return target_image_name;
	}

	public void setTarget_image_name(String target_image_name) {
		this.target_image_name = target_image_name;
	}

	public String getTarget_image_tag() {
		return target_image_tag;
	}

	public void setTarget_image_tag(String target_image_tag) {
		this.target_image_tag = target_image_tag;
	}

}