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

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinition;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatusReport;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.ModelData;
import org.sodalite.dsl.kb_reasoner_client.types.ModuleData;
import org.sodalite.dsl.kb_reasoner_client.types.OperationDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.TemplateData;
import org.sodalite.dsl.kb_reasoner_client.types.Type;
import org.sodalite.dsl.kb_reasoner_client.types.TypeData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;

class KBReasonerTest {
	private KBReasoner kbclient;
	String resourceId = "tosca.nodes.Compute";
	String requirementId = "host";
	String nodeType = "tosca.nodes.SoftwareComponent";

	private final String KB_REASONER_URI = "http://160.40.52.200:8084/reasoner-api/v0.6/";
	private final String IaC_URI = "http://154.48.185.202:8080/";
	private final String image_builder__URI = ""; // FIXME set default value
	private final String xOPERA_URI = "http://154.48.185.209:5001/";
	private final String KEYCLOAK_URI = "http://192.168.2.179:8080/";

	private final String client_id = "sodalite-ide";
	private final String client_secret = "1a1083bc-c183-416a-9192-26076f605cc3";

	private String aadmURI = null;

	private boolean AIM_Enabled = false;

	@BeforeEach
	void setup() throws IOException, Exception {
		kbclient = new KBReasonerClient(KB_REASONER_URI, IaC_URI, image_builder__URI, xOPERA_URI, KEYCLOAK_URI);
		Properties credentials = readCredentials();
		if (AIM_Enabled)
			kbclient.setUserAccount(credentials.getProperty("user"), credentials.getProperty("password"), client_id,
					client_secret);
	}

	private Properties readCredentials() throws IOException {
		final Properties credentials = new Properties();
		Path credentials_path = FileSystems.getDefault().getPath("src/test/resources/credentials.properties");
		try (final InputStream stream = Files.newInputStream(credentials_path)) {
			credentials.load(stream);
		}
		return credentials;
	}

	@Test
	void testGetNodeTypes() throws Exception {
		List<String> modules = Arrays.asList("snow", "docker");
		ReasonerData<Type> nodeTypes = kbclient.getNodeTypes(modules);
		assertFalse(nodeTypes.getElements().isEmpty());
		nodeTypes.getElements().stream().forEach(type -> System.out
				.println("Node type: " + (type.getModule() != null ? type.getModule() : "") + type.getLabel()));
	}

	@Test
	void testGetDataTypes() throws Exception {
		List<String> modules = Arrays.asList("snow", "docker");
		ReasonerData<Type> dataTypes = kbclient.getDataTypes(modules);
		assertFalse(dataTypes.getElements().isEmpty());
		dataTypes.getElements().stream().forEach(type -> System.out
				.println("Data type: " + (type.getModule() != null ? type.getModule() : "") + type.getLabel()));
	}

	@Test
	void testGetCapabilityTypes() throws Exception {
		List<String> modules = Arrays.asList("snow", "docker");
		ReasonerData<Type> capabilityTypes = kbclient.getCapabilityTypes(modules);
		assertFalse(capabilityTypes.getElements().isEmpty());
		capabilityTypes.getElements().stream().forEach(type -> System.out
				.println("Capability type: " + (type.getModule() != null ? type.getModule() : "") + type.getLabel()));
	}

	@Test
	void testGetRelationshipTypes() throws Exception {
		List<String> modules = Arrays.asList("snow", "docker");
		ReasonerData<Type> relationshipTypes = kbclient.getRelationshipTypes(modules);
		assertFalse(relationshipTypes.getElements().isEmpty());
		relationshipTypes.getElements().stream().forEach(type -> System.out
				.println("Relationship type: " + (type.getModule() != null ? type.getModule() : "") + type.getLabel()));
	}

	@Test
	void testGetInteraceTypes() throws Exception {
		List<String> modules = Arrays.asList("snow", "docker");
		ReasonerData<Type> interaceTypes = kbclient.getInterfaceTypes(modules);
		assertFalse(interaceTypes.getElements().isEmpty());
		interaceTypes.getElements().stream().forEach(type -> System.out
				.println("Interface type: " + (type.getModule() != null ? type.getModule() : "") + type.getLabel()));
	}

	@Test
	void testGetPolicyTypes() throws Exception {
		List<String> modules = Arrays.asList("radon");
		ReasonerData<Type> policyTypes = kbclient.getPolicyTypes(modules);
		assertFalse(policyTypes.getElements().isEmpty());
		policyTypes.getElements().stream().forEach(type -> System.out
				.println("Policy type: " + (type.getModule() != null ? type.getModule() : "") + type.getLabel()));
	}

	@Test
	void testGetTemplates() throws Exception {
		List<String> modules = Arrays.asList("snow");
		TemplateData templates = kbclient.getTemplates(modules);
		assertFalse(templates.getElements().isEmpty());
		templates.getElements().stream().forEach(template -> System.out.println(
				"Template: " + (template.getModule() != null ? template.getModule() : "") + template.getLabel()));
	}

	@Test
	void testGetModules() throws Exception {
		ModuleData modules = kbclient.getModules();
		assertFalse(modules.getElements().isEmpty());
	}

	@Test
	void testGetTypeProperties() throws Exception {
		PropertyDefinitionData properties = kbclient.getTypeProperties(nodeType);
		assertFalse(properties.getElements().isEmpty());
		System.out.println("Properties for resource: " + nodeType);
		properties.getElements().stream().forEach(node -> System.out.println("Property: " + node.getUri()));
	}

	@Test
	void testGetTypeAttributes() throws Exception {
		ReasonerData<AttributeDefinition> attributes = kbclient.getTypeAttributes(resourceId);
		assertFalse(attributes.getElements().isEmpty());
		System.out.println("Attributes for resource: " + resourceId);
		attributes.getElements().stream().forEach(node -> System.out.println("Attribute: " + node));
	}

	@Test
	void testGetTypeInterfaces() throws Exception {
		String resourceId = "tosca.nodes.SoftwareComponent";
		InterfaceDefinitionData interfaces = kbclient.getTypeInterfaces(resourceId);
		assertFalse(interfaces.getElements().isEmpty());
		System.out.println("Interfaces for resource: " + resourceId);
		interfaces.getElements().stream().forEach(node -> System.out.println("Interface: " + node));
	}

	@Test
	void testGetTypeCapabilities() throws Exception {
		String resourceId = "tosca.nodes.SoftwareComponent";
		CapabilityDefinitionData capabilities = kbclient.getTypeCapabilities(resourceId);
		assertFalse(capabilities.getElements().isEmpty());
		System.out.println("Capabilities for resource: " + resourceId);
		capabilities.getElements().stream().forEach(cap -> System.out.println("Capability: " + cap));
	}

	@Test
	void testGetTypeRequirements() throws Exception {
		String resourceId = "tosca.nodes.SoftwareComponent";
		RequirementDefinitionData requirements = kbclient.getTypeRequirements(resourceId);
		assertFalse(requirements.getElements().isEmpty());
		System.out.println("Requirements for resource: " + resourceId);
		requirements.getElements().stream().forEach(req -> System.out.println("Requirement: " + req));
	}

	@Test
	void testGetTemplateRequirements() throws Exception {
		String resourceId = "clinical/probabilistic-mapping-modak-job";
		RequirementAssignmentData requirements = kbclient.getTemplateRequirements(resourceId);
		assertFalse(requirements.getElements().isEmpty());
		System.out.println("Requirements for resource: " + resourceId);
		requirements.getElements().stream().forEach(req -> System.out.println("Requirement: " + req));
	}

	@Test
	void testGetTemplateProperties() throws Exception {
		String resourceId = "clinical/probabilistic-mapping-modak-job";
		PropertyAssignmentData properties = kbclient.getTemplateProperties(resourceId);
		assertFalse(properties.getElements().isEmpty());
		System.out.println("Properties for resource: " + resourceId);
		properties.getElements().stream().forEach(prop -> System.out.println("Requirement: " + prop));
	}

	@Test
	void testGetTemplateAttributes() throws Exception {
		String resourceId = "clinical/hpc-wm-torque";
		AttributeAssignmentData attrs = kbclient.getTemplateAttributes(resourceId);
		assertFalse(attrs.getElements().isEmpty());
		System.out.println("Attributes for resource: " + resourceId);
		attrs.getElements().stream().forEach(attr -> System.out.println("Attributte: " + attr));
	}

	@Test
	void testGetValidRequirementNodes() throws Exception {
		String nodeType = "docker/sodalite.nodes.DockerizedComponent";
		List<String> modules = Arrays.asList("snow", "docker");
		ValidRequirementNodeData valid_requirement_nodes = kbclient.getValidRequirementNodes(requirementId, nodeType,
				modules);
		assertFalse(valid_requirement_nodes.getElements().isEmpty());
		System.out.println("ValidRequirementNodes for resource: " + resourceId);
		valid_requirement_nodes.getElements().stream().forEach(node -> System.out.println("Requirement: " + node));
	}

	@Test
	void testGetTypeOfValidRequirementNodes() throws Exception {
		String requirementId = "host";
		List<String> modules = Arrays.asList("openstack", "docker");
		String nodeType = "docker/sodalite.nodes.DockerizedComponent";
		TypeData typedata = kbclient.getTypeOfValidRequirementNodes(requirementId, nodeType, modules);
		assertFalse(typedata.getElements().isEmpty());
		System.out.println("TypeOfValidRequirementNodes for resource: " + resourceId + " is "
				+ typedata.getElements().get(0).getLabel());
	}

	@Test
	void testIsSubClassOf() throws Exception {
		String subclass = "openstack/sodalite.nodes.OpenStack.VM";
		String superclass = "tosca.nodes.Compute";
		Boolean result = kbclient.isSubClassOf(subclass, superclass);
		assertTrue(result);
	}

	@Test
	void testGetSubClassesOf() throws Exception {
		List<String> subclasses = Arrays.asList("openstack/sodalite.nodes.OpenStack.VM", "tosca.nodes.Compute");
		String superclass = "tosca.nodes.Compute";
		List<String> result = kbclient.getSubClassesOf(subclasses, superclass);
		assertFalse(result.isEmpty());
	}

	@Test
	void testSaveAADMWithErrors() throws Exception {
		String aadmURI = "";
		String name = "snow.aadm";
		String namespace = "snow";
		boolean complete = false;
		KBSaveReportData report = saveAADM(aadmURI, "src/test/resources/optimization.aadm.ttl",
				"src/test/resources/snow.aadm", name, namespace, complete);
		assertTrue(report.hasErrors());
	}

	@Test
	void testSaveAADM() throws Exception {
		String aadmURI = "";
		String name = "snow.aadm";
		String namespace = "snow";
		boolean complete = false;
		KBSaveReportData report = saveAADM(aadmURI, "src/test/resources/snow.v2.snow_v2.aadm.ttl",
				"src/test/resources/snow_v2.aadm", name, namespace, complete);
		assertFalse(report.hasErrors());
		assertNotNull(report.getURI());
	}

	@Test
	void testSaveRM() throws Exception {
		String rmURI = "";
		String name = "docker_registry.rm";
		String namespace = "docker";
		KBSaveReportData report = saveRM(rmURI, "src/test/resources/modules.docker_registry.rm.ttl",
				"src/test/resources/docker_registry.rm", name, namespace);
		assertFalse(report.hasErrors());
		assertNotNull(report.getURI());
	}

	private KBSaveReportData saveRM(String rmURI, String ttlPath, String dslPath, String name, String namespace)
			throws IOException, Exception {
		Path ttl_path = FileSystems.getDefault().getPath(ttlPath);
		String rmTTL = new String(Files.readAllBytes(ttl_path));
		Path dsl_path = FileSystems.getDefault().getPath(dslPath);
		String rmDSL = new String(Files.readAllBytes(dsl_path));
		KBSaveReportData report = kbclient.saveRM(rmTTL, rmURI, name, namespace, rmDSL);
		return report;
	}

	private KBSaveReportData saveAADM(String aadmURI, String ttlPath, String dslPath, String name, String namespace,
			boolean complete) throws IOException, Exception {
		Path ttl_path = FileSystems.getDefault().getPath(ttlPath);
		String aadmTTL = new String(Files.readAllBytes(ttl_path));
		Path dsl_path = FileSystems.getDefault().getPath(dslPath);
		String aadmDSL = new String(Files.readAllBytes(dsl_path));
		KBSaveReportData report = kbclient.saveAADM(aadmTTL, aadmURI, name, namespace, aadmDSL, complete);
		return report;
	}

	@Test
	void testGetRMsInModule() throws Exception {
		String module = "docker";
		ModelData models = kbclient.getRMsInModule(module);
		assertNotNull(models);
	}

	@Test
	void testGetAADMsInModule() throws Exception {
		String module = "snow";
		ModelData models = kbclient.getAADMsInModule(module);
		assertNotNull(models);
	}

	@Test
	void testGetModelForResource() throws Exception {
		String module = "docker";
		String resource = "sodalite.nodes.DockerNetwork";
		ModelData model = kbclient.getModelForResource(resource, module);
		assertNotNull(model);
	}

	@Test
	void testGetModel() throws Exception {
		String module = "docker";
		ModelData models = kbclient.getRMsInModule(module);
		assertNotNull(models);
		ModelData model = kbclient.getModel(models.getElements().get(0).getUri().toASCIIString());
		assertNotNull(model);
	}

	@Test
	void testOptimizeAADM() throws Exception {
		Path aadm_path = FileSystems.getDefault().getPath("src/test/resources/optimization.aadm.ttl");
		String aadmTTL = new String(Files.readAllBytes(aadm_path));
		KBOptimizationReportData report = kbclient.optimizeAADM(aadmTTL, null);
		assertFalse(report.hasErrors());
		assertTrue(report.hasOptimizationErrors());
		assertNotNull(report.getURI());
		assertTrue(report.hasOptimizations());
	}

	@Test
	void testGetAADM() throws Exception {
		String json = kbclient.getAADM(aadmURI);
		assertNotNull(json);
	}

	@Test
	@Ignore
	void testAskIaCBuilderToRegisterAADM() throws Exception {
		Path aadm_json_path = FileSystems.getDefault().getPath("src/test/resources/snow.json");
		String aadm_json = new String(Files.readAllBytes(aadm_json_path));
		IaCBuilderAADMRegistrationReport report = kbclient.askIaCBuilderToRegisterAADM("snow", aadm_json);
		assertNotNull(report.getToken());
	}

	@Test
	@Ignore
	void testDeployAADM() throws Exception {
		Path inputs_json_path = FileSystems.getDefault().getPath("src/test/resources/inputs.yaml");
		String blueprint_token = "070132fd-5e61-4c6c-87f9-74474b891efa";
		String version_id = "snow_deploy";
		int workers = 5;
		DeploymentReport report = kbclient.deployAADM(inputs_json_path, blueprint_token, version_id, workers);
		assertNotNull(report.getDeployment_id());
	}

	@Test
	@Ignore
	void testGetAADMDeploymentStatus() throws Exception {
		String session_token = "d892456a-5db1-4656-b896-ed2389c8639f";
		DeploymentStatusReport dsr = kbclient.getAADMDeploymentStatus(session_token);
		assertNotNull(dsr);
	}

	@Test
	void testGetCapabilitiesDeclaredInTargetNodeForNodeTemplateRequirement() throws Exception {
		String nodeTemplate = "radon/openstack_vm";
		String requirementName = "host";
		CapabilityAssignmentData capabilities = kbclient
				.getCapabilitiesDeclaredInTargetNodeForNodeTemplateRequirement(nodeTemplate, requirementName);
		assertNotNull(capabilities);
	}

	@Test
	void testGetCapabilitiesDeclaredInTargetNodeForNodeTypeRequirement() throws Exception {
		String nodeType = "docker/sodalite.nodes.DockerizedComponent";
		String requirementName = "network";
		CapabilityDefinitionData capabilities = kbclient
				.getCapabilitiesDeclaredInTargetNodeForNodeTypeRequirement(nodeType, requirementName);
		assertNotNull(capabilities);
	}

	@Test
	void testGetOperationsInInterface() throws Exception {
		String _interface = "tosca.interfaces.node.lifecycle.Standard";
		OperationDefinitionData operations = kbclient.getOperationsInInterface(_interface);
		assertNotNull(operations);
	}

	@Test
	void testGetOperations() throws Exception {
		List<String> modules = Arrays.asList("radon");
		OperationDefinitionData operations = kbclient.getOperations(modules);
		assertNotNull(operations);
	}
}
