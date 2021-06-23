package org.sodalite.ide.ui.views.model;

import org.sodalite.dsl.kb_reasoner_client.types.Blueprint;
import org.sodalite.dsl.kb_reasoner_client.types.Deployment;

public class DeploymentNode {
	String label;
	Blueprint blueprint;
	Deployment deployment;

	public DeploymentNode(String label) {
		this.label = label;
	}

	public DeploymentNode(Blueprint blueprint) {
		this.blueprint = blueprint;
	}

	public DeploymentNode(Deployment deployment) {
		this.deployment = deployment;
	}

	public boolean isRoot() {
		return blueprint == null && deployment == null;
	}

	public boolean isBlueprint() {
		return blueprint != null && deployment == null;
	}

	public boolean isDeployment() {
		return blueprint == null && deployment != null;
	}
}
