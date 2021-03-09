package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = { "users", })
public class IaCBuilderAADMRegistrationReport {
	String blueprint_id;
	String commit_sha;
	String timestamp;
	String url;
	List<String> users;
	String version_id;

	public String getBlueprint_id() {
		return blueprint_id;
	}

	public void setBlueprint_id(String blueprint_id) {
		this.blueprint_id = blueprint_id;
	}

	public String getCommit_sha() {
		return commit_sha;
	}

	public void setCommit_sha(String commit_sha) {
		this.commit_sha = commit_sha;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<String> getUsers() {
		return users;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}

	public String getVersion_id() {
		return version_id;
	}

	public void setVersion_id(String version_id) {
		this.version_id = version_id;
	}
}
