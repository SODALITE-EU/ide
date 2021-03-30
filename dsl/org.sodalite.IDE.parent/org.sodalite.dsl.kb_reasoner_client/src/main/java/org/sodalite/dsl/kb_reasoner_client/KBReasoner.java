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

import java.nio.file.Path;
import java.util.List;

import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageReport;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageStatusReport;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatusReport;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.ModelData;
import org.sodalite.dsl.kb_reasoner_client.types.ModuleData;
import org.sodalite.dsl.kb_reasoner_client.types.OperationDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.PDSUpdateReport;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.TemplateData;
import org.sodalite.dsl.kb_reasoner_client.types.TypeData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;

public interface KBReasoner {

	TypeData getNodeTypes(List<String> modules) throws SodaliteException;

	TypeData getDataTypes(List<String> modules) throws SodaliteException;

	TypeData getCapabilityTypes(List<String> modules) throws SodaliteException;

	TypeData getRelationshipTypes(List<String> modules) throws SodaliteException;

	TypeData getInterfaceTypes(List<String> modules) throws SodaliteException;

	TypeData getPolicyTypes(List<String> modules) throws SodaliteException;

	TemplateData getTemplates(List<String> modules) throws SodaliteException;

	ModuleData getModules() throws SodaliteException;

	AttributeDefinitionData getTypeAttributes(String resourceId) throws SodaliteException;

	CapabilityDefinitionData getTypeCapabilities(String resourceId) throws SodaliteException;

	InterfaceDefinitionData getTypeInterfaces(String resourceId) throws SodaliteException;

	PropertyDefinitionData getTypeProperties(String resourceId) throws SodaliteException;

	RequirementDefinitionData getTypeRequirements(String resourceId) throws SodaliteException;

	AttributeAssignmentData getTemplateAttributes(String resourceId) throws SodaliteException;

	CapabilityAssignmentData getTemplateCapabilities(String resourceId) throws SodaliteException;

	InterfaceAssignmentData getTemplateInterfaces(String resourceId) throws SodaliteException;

	PropertyAssignmentData getTemplateProperties(String resourceId) throws SodaliteException;

	RequirementAssignmentData getTemplateRequirements(String resourceId) throws SodaliteException;

	ValidRequirementNodeData getValidRequirementNodes(String requirementId, String nodeType, List<String> modules)
			throws SodaliteException;

	TypeData getTypeOfValidRequirementNodes(String requirementId, String nodeType, List<String> modules)
			throws SodaliteException;

	Boolean isSubClassOf(String subclass, String superclass) throws SodaliteException;

	List<String> getSubClassesOf(List<String> subclasses, String superclass) throws SodaliteException;

	KBSaveReportData saveAADM(String aadmTTL, String aadmURI, String name, String namespace, String aadmDSL,
			boolean complete) throws SodaliteException;

	KBSaveReportData saveRM(String rmTTL, String rmURI, String name, String namespace, String rmDSL)
			throws SodaliteException;

	KBOptimizationReportData optimizeAADM(String aadmTTL, String aadmURI) throws SodaliteException;

	String getAADM(String aadmIRI) throws SodaliteException;

	IaCBuilderAADMRegistrationReport askIaCBuilderToRegisterAADM(String model_name, String aadm_json)
			throws SodaliteException;

	DeploymentReport deployAADM(Path inputs_yaml_path, String blueprint_id, String version_id, int workers)
			throws SodaliteException;

	DeploymentStatusReport getAADMDeploymentStatus(String deployment_id) throws SodaliteException;

	ModelData getModelForResource(String resource, String module) throws SodaliteException;

	ModelData getModel(String modelId) throws SodaliteException;

	ModelData getAADMsInModule(String module) throws SodaliteException;

	ModelData getRMsInModule(String module) throws SodaliteException;

	void deleteModel(String modelId) throws SodaliteException;

	String setUserAccount(String user, String password, String client_id, String user_secret) throws SodaliteException;

	CapabilityDefinitionData getCapabilitiesDeclaredInTargetNodeForNodeTypeRequirement(String nodeType,
			String requirementName) throws SodaliteException;

	CapabilityAssignmentData getCapabilitiesDeclaredInTargetNodeForNodeTemplateRequirement(String nodeTemplate,
			String requirementName) throws SodaliteException;

	OperationDefinitionData getOperationsInInterface(String interfaceType) throws SodaliteException;

	OperationDefinitionData getOperations(List<String> modules) throws SodaliteException;

	BuildImageReport buildImage(String image_build_conf) throws SodaliteException;

	BuildImageStatusReport checkBuildImageStatus(String innvocation_id) throws SodaliteException;

	PDSUpdateReport pdsUpdate(String inputs, String namespace, String platformType) throws SodaliteException;
}
