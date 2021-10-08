package org.sodalite.dsl.kb_reasoner_client.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Blueprint {
	String aadm_id;
	String blueprint_id;
	String blueprint_name;
	String project_domain;
	String timestamp;
	String username;
	String commit_sha;
	String url;
	String version_id;

	public String getAadm_id() {
		return aadm_id;
	}

	public void setAadm_id(String aadm_id) {
		this.aadm_id = aadm_id;
	}

	public String getBlueprint_id() {
		return blueprint_id;
	}

	public void setBlueprint_id(String blueprint_id) {
		this.blueprint_id = blueprint_id;
	}

	public String getBlueprint_name() {
		return blueprint_name;
	}

	public void setBlueprint_name(String blueprint_name) {
		this.blueprint_name = blueprint_name;
	}

	public String getProject_domain() {
		return project_domain;
	}

	public void setProject_domain(String project_domain) {
		this.project_domain = project_domain;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCommit_sha() {
		return commit_sha;
	}

	public void setCommit_sha(String commit_sha) {
		this.commit_sha = commit_sha;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getVersion_id() {
		return version_id;
	}

	public void setVersion_id(String version_id) {
		this.version_id = version_id;
	}

}
