package org.sodalite.dsl.ui.contentassist;

public enum Entity {
	SELF ("A TOSCA orchestrator will interpret this keyword\n as the Node or Relationship Template instance\n that contains the function at the time the function is evaluated."), 
	SOURCE("A TOSCA orchestrator will interpret this keyword\n as the Node Template instance that is at the source\n end of the relationship that contains the referencing function."), 
	TARGET("A TOSCA orchestratorwill interpret this keyword\n as the Node Template instance that is at the target\n end of the relationship that contains the referencing function."), 
	HOST("A TOSCA orchestrator will interpret this keyword\n to refer to the all nodes that “host”the node using\n this reference (i.e., as identified by its HostedOn relationship). ");
	
	private String description;
	Entity(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return this.description;
	}
}
