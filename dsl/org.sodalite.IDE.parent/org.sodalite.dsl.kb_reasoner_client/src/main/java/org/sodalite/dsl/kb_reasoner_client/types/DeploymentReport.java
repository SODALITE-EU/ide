package org.sodalite.dsl.kb_reasoner_client.types;

public class DeploymentReport {
	String message;
	String session_token;
	String blueprint_id;
	String blueprint_token;
	String version_id;
	String timestamp;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSession_token() {
		return session_token;
	}
	public void setSession_token(String session_token) {
		this.session_token = session_token;
	}
	public String getBlueprint_id() {
		return blueprint_id;
	}
	public void setBlueprint_id(String blueprint_id) {
		this.blueprint_id = blueprint_id;
	}
	public String getBlueprint_token() {
		return blueprint_token;
	}
	public void setBlueprint_token(String blueprint_token) {
		this.blueprint_token = blueprint_token;
	}
	public String getVersion_id() {
		return version_id;
	}
	public void setVersion_id(String version_id) {
		this.version_id = version_id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
