/*******************************************************************************
 * Copyright (c) 2019 Atos Spain S.A.
 * This program and the accompanying materials
 * are made available under the terms of the Apache Public License 2.0 (APL2)
 * which accompanies this distribution, and is available at
 * https://apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Jesús Gorroñogoitia - Design and implementation
 *******************************************************************************/
package org.sodalite.dsl.kb_reasoner_client;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.sodalite.dsl.kb_reasoner_client.types.Attribute;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityData;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatus;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.Node;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyData;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;

class KBReasonerTest {
	private KBReasonerClient kbclient;
	String resourceId = "tosca.nodes.Compute";
	String requirementId = "host";
	String nodeType = "tosca.nodes.SoftwareComponent";
	
	private final String KB_REASONER_URI = "http://160.40.52.200:8084/reasoner-api/v0.6/";
	private final String IaC_URI = "http://154.48.185.202:8080/";
	private final String xOPERA_URI = "http://154.48.185.206:5000/";
	
	@BeforeEach
	void setup() {
		kbclient = new KBReasonerClient(KB_REASONER_URI, IaC_URI, xOPERA_URI);
	}
	
	@Test
	void testGetNodes() throws Exception {
		ReasonerData<Node> nodes = kbclient.getNodes();
		assertFalse(nodes.getElements().isEmpty());
		nodes.getElements().stream().forEach(node -> System.out.println("Node: " + node));
	}
	
	@Test
	void testGetProperties() throws Exception {
		PropertyData properties = kbclient.getProperties(nodeType);
		assertFalse(properties.getElements().isEmpty());
		System.out.println("Properties for resource: " + nodeType);
		properties.getElements().stream().forEach(node -> System.out.println("Property: " + node));
	}
	
	@Test
	void testGetAttributes() throws Exception {
		ReasonerData<Attribute> attributes = kbclient.getAttributes(resourceId);
		assertFalse(attributes.getElements().isEmpty());
		System.out.println("Attributes for resource: " + resourceId);
		attributes.getElements().stream().forEach(node -> System.out.println("Attribute: " + node));
	}
	
	@Test
	void testGetInterfaces() throws Exception {
		InterfaceData interfaces = kbclient.getInterfaces(resourceId);
		assertFalse(interfaces.getElements().isEmpty());
		System.out.println("Interfaces for resource: " + resourceId);
		interfaces.getElements().stream().forEach(node -> System.out.println("Interface: " + node));
	}
	
	@Test
	void testGetCapabilities() throws Exception {
		CapabilityData capabilities = kbclient.getCapabilities(resourceId);
		assertFalse(capabilities.getElements().isEmpty());
		System.out.println("Capabilities for resource: " + resourceId);
		capabilities.getElements().stream().forEach(node -> System.out.println("Capability: " + node));
	}
	
	@Test
	void testGetRequirements() throws Exception {
		RequirementData requirements = kbclient.getRequirements(resourceId);
		assertFalse(requirements.getElements().isEmpty());
		System.out.println("Requirements for resource: " + resourceId);
		requirements.getElements().stream().forEach(node -> System.out.println("Requirement: " + node));
	}
	
	@Disabled @Test
	void testGetValidRequirementNodes() throws Exception {
		ValidRequirementNodeData valid_requirement_nodes = kbclient.getValidRequirementNodes(requirementId, nodeType);
		assertFalse(valid_requirement_nodes.getElements().isEmpty());
		System.out.println("ValidRequirementNodes for resource: " + resourceId);
		valid_requirement_nodes.getElements().stream().forEach(node -> System.out.println("Requirement: " + node));
	}
	
	@Test
	void testSaveAADMWithErrors() throws Exception {
		Path aadm_path = FileSystems.getDefault().getPath("src/test/resources/snow_with_errors.ttl");
		String aadmTTL = new String(Files.readAllBytes (aadm_path));
		String submissionId = "snow";
		KBSaveReportData report = kbclient.saveAADM(aadmTTL, submissionId);
		assertTrue(report.hasErrors());
	}
	
	@Test
	void testSaveAADM() throws Exception {
		Path aadm_path = FileSystems.getDefault().getPath("src/test/resources/snow.ttl");
		String aadmTTL = new String(Files.readAllBytes (aadm_path));
		String submissionId = "snow";
		KBSaveReportData report = kbclient.saveAADM(aadmTTL, submissionId);
		assertFalse (report.hasErrors());
		assertNotNull (report.getIRI());
	}
	
	@Test
	void testGetAADM() throws Exception{
		String aadmIRI = "https://www.sodalite.eu/ontologies/workspace/1/snow/-AADM_untsf9kuv3hijfp2roqbri4quv";
		String json = kbclient.getAADM(aadmIRI);
		assertNotNull(json);
	}
	
	@Test
	void testAskIaCBuilderToRegisterAADM() throws Exception {
		Path aadm_json_path = FileSystems.getDefault().getPath("src/test/resources/snow.json");
		String aadm_json = new String(Files.readAllBytes (aadm_json_path));
		IaCBuilderAADMRegistrationReport report = kbclient.askIaCBuilderToRegisterAADM("snow", aadm_json);
		assertNotNull (report.getToken());
	}
	
	@Test
	void testDeployAADM() throws Exception {
		Path inputs_json_path = FileSystems.getDefault().getPath("src/test/resources/inputs.yaml");
		String blueprint_token = "070132fd-5e61-4c6c-87f9-74474b891efa";
		DeploymentReport report = kbclient.deployAADM(inputs_json_path, blueprint_token);
		assertNotNull (report.getSession_token());
	}
	
	@Test
	void testGetAADMDeploymentStatus() throws Exception {
		String session_token = "d892456a-5db1-4656-b896-ed2389c8639f";
		DeploymentStatus status = kbclient.getAADMDeploymentStatus(session_token);
		assertNotNull (status);
	}


}
