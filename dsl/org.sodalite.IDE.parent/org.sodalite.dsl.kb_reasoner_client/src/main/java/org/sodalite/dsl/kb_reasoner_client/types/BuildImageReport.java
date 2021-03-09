package org.sodalite.dsl.kb_reasoner_client.types;

public class BuildImageReport {

	String status;
	String message;
	String session_token;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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
}
