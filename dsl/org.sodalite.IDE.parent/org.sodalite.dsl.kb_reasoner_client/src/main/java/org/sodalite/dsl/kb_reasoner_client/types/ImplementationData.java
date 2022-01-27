package org.sodalite.dsl.kb_reasoner_client.types;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImplementationData {
	
	String AnsibleModel;
	String AnsibleScript;
	String path;
	String relative_path;
	
	public String getAnsibleModel() {
		return AnsibleModel;
	}
	public void setAnsibleModel(String ansibleModel) {
		AnsibleModel = ansibleModel;
	}
	public String getAnsibleScript() {
		return AnsibleScript;
	}
	public void setAnsibleScript(String ansibleScript) {
		AnsibleScript = ansibleScript;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getRelative_path() {
		return relative_path;
	}
	public void setRelative_path(String relative_path) {
		this.relative_path = relative_path;
	}
	
	
	
	

}
