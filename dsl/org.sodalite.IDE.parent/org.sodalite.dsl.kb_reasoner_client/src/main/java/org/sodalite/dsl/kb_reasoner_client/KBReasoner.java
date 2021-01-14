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

import org.sodalite.dsl.kb_reasoner_client.types.AttributeAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatus;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.ModelData;
import org.sodalite.dsl.kb_reasoner_client.types.ModuleData;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.TypeData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;

public interface KBReasoner {

	TypeData getNodeTypes(List<String> modules) throws Exception;

	TypeData getDataTypes(List<String> modules) throws Exception;

	TypeData getCapabilityTypes(List<String> modules) throws Exception;

	TypeData getRelationshipTypes(List<String> modules) throws Exception;

	TypeData getInterfaceTypes(List<String> modules) throws Exception;

	ModuleData getModules() throws Exception;

	AttributeDefinitionData getTypeAttributes(String resourceId) throws Exception;

	CapabilityDefinitionData getTypeCapabilities(String resourceId) throws Exception;

	InterfaceDefinitionData getTypeInterfaces(String resourceId) throws Exception;

	PropertyDefinitionData getTypeProperties(String resourceId) throws Exception;

	RequirementDefinitionData getTypeRequirements(String resourceId) throws Exception;

	AttributeAssignmentData getTemplateAttributes(String resourceId) throws Exception;

	CapabilityAssignmentData getTemplateCapabilities(String resourceId) throws Exception;

	InterfaceAssignmentData getTemplateInterfaces(String resourceId) throws Exception;

	PropertyAssignmentData getTemplateProperties(String resourceId) throws Exception;

	RequirementAssignmentData getTemplateRequirements(String resourceId) throws Exception;

	ValidRequirementNodeData getValidRequirementNodes(String requirementId, String nodeType, List<String> modules)
			throws Exception;

	TypeData getTypeOfValidRequirementNodes(String requirementId, String nodeType, List<String> modules)
			throws Exception;

	Boolean isSubClassOf(String subclass, String superclass) throws Exception;

	List<String> getSubClassesOf(List<String> subclasses, String superclass) throws Exception;

	KBSaveReportData saveAADM(String aadmTTL, String aadmURI, String name, String namespace, String aadmDSL,
			boolean complete) throws Exception;

	KBSaveReportData saveRM(String rmTTL, String rmURI, String name, String namespace, String rmDSL) throws Exception;

	KBOptimizationReportData optimizeAADM(String aadmTTL, String aadmURI) throws Exception;

	String getAADM(String aadmIRI) throws Exception;

	IaCBuilderAADMRegistrationReport askIaCBuilderToRegisterAADM(String model_name, String aadm_json) throws Exception;

	DeploymentReport deployAADM(Path inputs_yaml_path, String blueprint_token) throws Exception;

	DeploymentStatus getAADMDeploymentStatus(String session_token) throws Exception;

	ModelData getModelForResource(String resource, String module) throws Exception;

	ModelData getModel(String modelId) throws Exception;

	ModelData getAADMsInModule(String module) throws Exception;

	ModelData getRMsInModule(String module) throws Exception;

	void deleteModel(String modelId) throws Exception;

	String getSecurityToken() throws Exception;

	Boolean isValidToken(String token) throws Exception;

	void setUserAccount(String user, String password, String client_id, String user_secret) throws Exception;

}
