package org.sodalite.dsl.kb_reasoner_client.types;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BuildImageReport {

	String invocation_id;

	public String getInvocation_id() {
		return invocation_id;
	}

	public void setInvocation_id(String invocation_id) {
		this.invocation_id = invocation_id;
	}

}
