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

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotFoundException;
import org.sodalite.dsl.kb_reasoner_client.exceptions.NotRolePermissionException;
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.kb_reasoner_client.exceptions.TokenExpiredException;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.BlueprintData;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageReport;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageStatus;
import org.sodalite.dsl.kb_reasoner_client.types.BuildImageStatusReport;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.DashboardData;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentData;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatusReport;
import org.sodalite.dsl.kb_reasoner_client.types.HPCSecretData;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.KBError;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimization;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationError;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSuggestion;
import org.sodalite.dsl.kb_reasoner_client.types.KBWarning;
import org.sodalite.dsl.kb_reasoner_client.types.Model;
import org.sodalite.dsl.kb_reasoner_client.types.ModelData;
import org.sodalite.dsl.kb_reasoner_client.types.ModuleData;
import org.sodalite.dsl.kb_reasoner_client.types.OperationDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.PDSUpdateReport;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementAssignmentData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementDefinitionData;
import org.sodalite.dsl.kb_reasoner_client.types.StringData;
import org.sodalite.dsl.kb_reasoner_client.types.TemplateData;
import org.sodalite.dsl.kb_reasoner_client.types.TypeData;
import org.sodalite.dsl.kb_reasoner_client.types.TypeKind;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class KBReasonerClient implements KBReasoner {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private RestTemplate restTemplate;
	private RestTemplate sslRestTemplate;
	private String kbReasonerUri;
	private String iacUri;
	private String image_builder_uri;
	private String xoperaUri;
	private String keycloakUri;
	private String pdsUri;
	private String refactorerUri;
	private String grafanaUri;
	private String rulesServerUri;
	private String vaultSecretUploaderUri;
	private String keycloak_user;
	private String keycloak_password;
	private String keycloak_client_id;
	private String keycloak_client_secret;
	private String aai_token;
	private Boolean IAM_enabled = false;

	public KBReasonerClient(String kbReasonerUri, String iacUri, String image_builder_uri, String xoperaUri,
			String keycloakUri, String pdsUri, String refactorerUri, String grafanaUri, String rulesServerUri,
			String vaultSecretUploaderUri) {
		this.kbReasonerUri = kbReasonerUri;
		this.iacUri = iacUri;
		this.image_builder_uri = image_builder_uri;
		this.xoperaUri = xoperaUri;
		this.keycloakUri = keycloakUri;
		this.pdsUri = pdsUri;
		this.refactorerUri = refactorerUri;
		this.grafanaUri = grafanaUri;
		this.rulesServerUri = rulesServerUri;
		this.vaultSecretUploaderUri = vaultSecretUploaderUri;
	}

	@Override
	protected void finalize() throws Throwable {
		if (this.aai_token != null) {
			// Reseting restTemplate to force the creation of a new one for token revocation
			this.sslRestTemplate = null;
			this.restTemplate = null;
			this.revokeToken();
		}
		super.finalize();
	}

	public String setUserAccount(String user, String password, String client_id, String client_secret)
			throws SodaliteException {
		this.keycloak_user = user;
		this.keycloak_password = password;
		this.keycloak_client_id = client_id;
		this.keycloak_client_secret = client_secret;
		this.aai_token = getSecurityToken();
		Assert.notNull(aai_token, "Error retrieving a valid security token");
		this.IAM_enabled = true;
		return this.aai_token;
	}

	private RestTemplate getSslRestTemplate()
			throws KeyStoreException, NoSuchAlgorithmException, KeyManagementException {
		if (sslRestTemplate == null) {
//			CloseableHttpClient httpClient
//		      = HttpClients.custom()
//		        .setSSLHostnameVerifier(new NoopHostnameVerifier())
//		        .build();
			CloseableHttpClient httpClient = HttpClients.custom()
					.setSSLSocketFactory(new SSLConnectionSocketFactory(
							SSLContexts.custom().loadTrustMaterial(null, new TrustSelfSignedStrategy()).build()))
					.build();
			HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
			requestFactory.setHttpClient(httpClient);
			requestFactory.setConnectTimeout(30 * 1000); // FIXME set connection timeout by configuration
			requestFactory.setReadTimeout(0); // Unlimited
			sslRestTemplate = new RestTemplate(requestFactory);
			sslRestTemplate.setErrorHandler(new SodaliteRestClientErrorHandler());
		}
		return sslRestTemplate;
	}

	private RestTemplate getRestTemplate() {
		if (restTemplate == null) {
			HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
			requestFactory.setConnectTimeout(10 * 1000); // FIXME set connection timeout by configuration
			requestFactory.setReadTimeout(0); // Unlimited

			restTemplate = new RestTemplate(requestFactory);
			restTemplate.setErrorHandler(new SodaliteRestClientErrorHandler());
		}
		return restTemplate;
	}

	public TypeData getNodeTypes(List<String> modules) throws SodaliteException {
		return getTypes(modules, TypeKind.NODETYPE);
	}

	public TypeData getDataTypes(List<String> modules) throws SodaliteException {
		return getTypes(modules, TypeKind.DATATYPE);
	}

	public TypeData getCapabilityTypes(List<String> modules) throws SodaliteException {
		return getTypes(modules, TypeKind.CAPABILITY_TYPE);
	}

	public TypeData getRelationshipTypes(List<String> modules) throws SodaliteException {
		return getTypes(modules, TypeKind.RELATIONSHIP_TYPE);
	}

	public TypeData getInterfaceTypes(List<String> modules) throws SodaliteException {
		return getTypes(modules, TypeKind.INTERFACE_TYPE);
	}

	public TypeData getPolicyTypes(List<String> modules) throws SodaliteException {
		return getTypes(modules, TypeKind.POLICY_TYPE);
	}

	private TypeData getTypes(List<String> modules, TypeKind kind) throws SodaliteException {
		Assert.notNull(modules, "Pass a not null modules");
		Assert.notNull(kind, "Pass a not null type kind");
		String url = kbReasonerUri + "types";
		for (String module : modules)
			url += ";imports=" + module;
		url += ";type=" + kind.getLabel();
		if (IAM_enabled)
			url += ";token=" + this.aai_token;
		try {
			TypeData data = getJSONObjectForType(TypeData.class, new URI(url), HttpStatus.OK);
			if (data == null) {
				data = new TypeData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTypes(modules, kind);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public TemplateData getTemplates(List<String> modules) throws SodaliteException {
		Assert.notNull(modules, "Pass a not null modules");
		String url = kbReasonerUri + "templates";
		for (String module : modules)
			url += ";imports=" + module;
		if (IAM_enabled)
			url += ";token=" + this.aai_token;
		try {
			TemplateData data = getJSONObjectForType(TemplateData.class, new URI(url), HttpStatus.OK);
			if (data == null) {
				data = new TemplateData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTemplates(modules);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public ModuleData getModules() throws SodaliteException {
		String url = kbReasonerUri + "namespaces";
		if (IAM_enabled)
			url += "?token=" + this.aai_token;
		try {
			ModuleData data = getJSONObjectForType(ModuleData.class, new URI(url), HttpStatus.OK);
			if (data == null) {
				data = new ModuleData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getModules();
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	// Type entities

	public AttributeDefinitionData getTypeAttributes(String resourceId) throws SodaliteException {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "attributes?resource=" + resourceId;
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			AttributeDefinitionData data = getJSONObjectForType(AttributeDefinitionData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new AttributeDefinitionData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTypeAttributes(resourceId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public CapabilityDefinitionData getTypeCapabilities(String resourceId) throws SodaliteException {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "capabilities?resource=" + resourceId;
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			CapabilityDefinitionData data = getJSONObjectForType(CapabilityDefinitionData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new CapabilityDefinitionData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTypeCapabilities(resourceId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public InterfaceDefinitionData getTypeInterfaces(String resourceId) throws SodaliteException {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "interfaces?resource=" + resourceId;
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			InterfaceDefinitionData data = getJSONObjectForType(InterfaceDefinitionData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new InterfaceDefinitionData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTypeInterfaces(resourceId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public PropertyDefinitionData getTypeProperties(String resourceId) throws SodaliteException {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "properties?resource=" + resourceId;
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			PropertyDefinitionData data = getJSONObjectForType(PropertyDefinitionData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new PropertyDefinitionData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTypeProperties(resourceId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public RequirementDefinitionData getTypeRequirements(String resourceId) throws SodaliteException {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "requirements?resource=" + resourceId;
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			RequirementDefinitionData data = getJSONObjectForType(RequirementDefinitionData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new RequirementDefinitionData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTypeRequirements(resourceId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	// Template entities

	public AttributeAssignmentData getTemplateAttributes(String resourceId) throws SodaliteException {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "prop-attr-names?resource=" + resourceId + "&element=attr";
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			AttributeAssignmentData data = getJSONObjectForType(AttributeAssignmentData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new AttributeAssignmentData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTemplateAttributes(resourceId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public CapabilityAssignmentData getTemplateCapabilities(String resourceId) throws SodaliteException {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "capabilities?resource=" + resourceId + "&template=true";
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			CapabilityAssignmentData data = getJSONObjectForType(CapabilityAssignmentData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new CapabilityAssignmentData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTemplateCapabilities(resourceId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public InterfaceAssignmentData getTemplateInterfaces(String resourceId) throws SodaliteException {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "interfaces?resource=" + resourceId + "&template=true";
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			InterfaceAssignmentData data = getJSONObjectForType(InterfaceAssignmentData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new InterfaceAssignmentData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTemplateInterfaces(resourceId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public PropertyAssignmentData getTemplateProperties(String resourceId) throws SodaliteException {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "prop-attr-names?resource=" + resourceId + "&element=prop";
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			PropertyAssignmentData data = getJSONObjectForType(PropertyAssignmentData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new PropertyAssignmentData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTemplateProperties(resourceId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public RequirementAssignmentData getTemplateRequirements(String resourceId) throws SodaliteException {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "requirements?resource=" + resourceId + "&template=true";
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			RequirementAssignmentData data = getJSONObjectForType(RequirementAssignmentData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new RequirementAssignmentData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTemplateRequirements(resourceId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	public ValidRequirementNodeData getValidRequirementNodes(String requirementId, String nodeType,
			List<String> modules) throws SodaliteException {
		Assert.notNull(requirementId, "Pass a not null requirementId");
		Assert.notNull(nodeType, "Pass a not null nodeType");
		Assert.notNull(modules, "Pass a not null modules");
		String url = kbReasonerUri + "valid-requirement-nodes;requirement=" + requirementId + ";nodeType="
				+ encodeValue(nodeType);
		for (String module : modules)
			url += ";imports=" + module;
		URI uri;
		try {
			uri = new URI(url);
		} catch (URISyntaxException ex) {
			throw new SodaliteException(ex);
		}
		ValidRequirementNodeData data = getJSONObjectForType(ValidRequirementNodeData.class, uri, HttpStatus.OK);
		if (data == null) {
			data = new ValidRequirementNodeData();
			data.setElements(new ArrayList<>());
		}
		return data;
	}

	@Override
	public TypeData getTypeOfValidRequirementNodes(String requirementId, String nodeType, List<String> modules)
			throws SodaliteException {
		Assert.notNull(requirementId, "Pass a not null requirementId");
		Assert.notNull(nodeType, "Pass a not null nodeType");
		Assert.notNull(modules, "Pass a not null modules");
		String url = kbReasonerUri + "valid-requirement-nodes-type;requirement=" + requirementId + ";nodeType="
				+ encodeValue(nodeType);
		for (String module : modules)
			url += ";imports=" + module;
		if (IAM_enabled)
			url += ";token=" + this.aai_token;
		try {
			TypeData data = getJSONObjectForType(TypeData.class, new URI(url), HttpStatus.OK);
			if (data == null) {
				data = new TypeData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getTypeOfValidRequirementNodes(requirementId, nodeType, modules);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public Boolean isSubClassOf(String subclass, String superclass) throws SodaliteException {
		Assert.notNull(subclass, "Pass a not null subclass");
		Assert.notNull(superclass, "Pass a not null superclass");
		String url = kbReasonerUri + "is-subclass-of;nodeTypes=" + encodeValue(subclass) + ";superNodeType="
				+ encodeValue(superclass);
		if (IAM_enabled)
			url += ";token=" + this.aai_token;
		try {
			StringData data = getJSONObjectForType(StringData.class, new URI(url), HttpStatus.OK);
			return data.getElements().contains(subclass);
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return isSubClassOf(subclass, superclass);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public List<String> getSubClassesOf(List<String> subclasses, String superclass) throws SodaliteException {
		Assert.notNull(subclasses, "Pass a not null subclasses");
		Assert.notEmpty(subclasses, "Pass a not empty subclasses");
		Assert.notNull(superclass, "Pass a not null superclass");
		String url = kbReasonerUri + "is-subclass-of";
		for (String subclass : subclasses)
			url += ";nodeTypes=" + encodeValue(subclass);
		url += ";superNodeType=" + encodeValue(superclass);
		if (IAM_enabled)
			url += ";token=" + this.aai_token;
		try {
			StringData data = getJSONObjectForType(StringData.class, new URI(url), HttpStatus.OK);
			return data.getElements();
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getSubClassesOf(subclasses, superclass);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public KBSaveReportData saveAADM(String aadmTTL, String aadmURI, String name, String namespace, String aadmDSL,
			boolean complete, String version) throws SodaliteException {
		Assert.isTrue(!aadmTTL.isEmpty(), "Turtle content for AADM can neither be null nor empty");
		Assert.isTrue(!aadmDSL.isEmpty(), "AADM DSL content can neither be null nor empty");
		String url = kbReasonerUri + "saveAADM";

		MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

		map.add("aadmTTL", aadmTTL);
		map.add("aadmURI", aadmURI);
		map.add("complete", complete);
		map.add("name", name);
		map.add("namespace", namespace);
		map.add("aadmDSL", aadmDSL);
		map.add("version", version);
		if (IAM_enabled) {
//			String token = getSecurityToken();
//			Assert.notNull(token, "Error retrieving a valid security token");
			map.add("token", this.aai_token);
		}

		KBSaveReportData report = new KBSaveReportData();
		try {
			// Send multipart-form message
			String result = sendFormURLEncodedMessage(new URI(url), String.class, map, HttpMethod.POST);
			JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
			report.setURI(jsonObject.get("uri").getAsString());
			report.setVersion(jsonObject.get("version").getAsString());
			JsonArray warningsJson = jsonObject.getAsJsonArray("warnings");
			if (warningsJson != null) {
				report.setWarnings(processWarnings(warningsJson.toString()));
			}
			JsonArray suggestionsJson = jsonObject.getAsJsonArray("suggestions");
			if (suggestionsJson != null) {
				report.setSuggestions(processSuggestions(suggestionsJson));
			}
		} catch (HttpClientErrorException ex) {
			if (ex.getStatusCode() == HttpStatus.BAD_REQUEST) {
				String result = ex.getResponseBodyAsString();
				String json = result.substring(result.indexOf(":") + 1);
				try {
					report.setErrors(processErrors(json));
				} catch (Exception e) {
					throw new SodaliteException(e);
				}
			} else if (ex.getStatusCode() == HttpStatus.FORBIDDEN) {
				throw new NotRolePermissionException(ex.getMessage());
			} else if (ex.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				throw new TokenExpiredException(ex.getMessage());
			} else {
				throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
			}
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}

		return report;
	}

	@Override
	public KBSaveReportData saveRM(String rmTTL, String rmURI, String name, String namespace, String rmDSL)
			throws SodaliteException {
		Assert.isTrue(!rmTTL.isEmpty(), "Turtle content for RM can neither be null nor empty");
		String url = kbReasonerUri + "saveRM";

		MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

		map.add("rmTTL", rmTTL);
		map.add("rmURI", rmURI);
		map.add("namespace", namespace);
		map.add("name", name);
		map.add("rmDSL", rmDSL);
		if (IAM_enabled) {
//			String token = getSecurityToken();
//			Assert.notNull(token, "Error retrieving a valid security token");
			map.add("token", this.aai_token);
		}

		KBSaveReportData report = new KBSaveReportData();
		try {
			// Send multipart-form message
			String result = sendFormURLEncodedMessage(new URI(url), String.class, map, HttpMethod.POST);
			JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
			report.setURI(jsonObject.get("uri").getAsString());
			JsonArray warningsJson = jsonObject.getAsJsonArray("warnings");
			if (warningsJson != null) {
				report.setWarnings(processWarnings(warningsJson.toString()));
			}
		} catch (HttpClientErrorException ex) {
			if (((HttpClientErrorException) ex).getStatusCode() == HttpStatus.BAD_REQUEST) {
				String result = ex.getResponseBodyAsString();
				String json = result.substring(result.indexOf(":") + 1);
				try {
					report.setErrors(processErrors(json));
				} catch (Exception e) {
					throw new SodaliteException(e);
				}
			} else if (((HttpClientErrorException) ex).getStatusCode() == HttpStatus.FORBIDDEN) {
				throw new NotRolePermissionException(ex.getMessage());
			} else if (((HttpClientErrorException) ex).getStatusCode() == HttpStatus.UNAUTHORIZED) {
				throw new TokenExpiredException(ex.getMessage());
			} else {
				throw ex;
			}
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}

		return report;
	}

	@Override
	public KBOptimizationReportData optimizeAADM(String aadmTTL, String aadmURI) throws SodaliteException {
		Assert.isTrue(!aadmTTL.isEmpty(), "Turtle content for AADM can neither be null nor empty");
		String url = kbReasonerUri + "optimizations";

		MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

		// AADM TTL
		map.add("aadmTTL", aadmTTL);

		// AADM TTL
		map.add("aadmURI", aadmURI);

		KBOptimizationReportData report = new KBOptimizationReportData();
		try {
			// Send multipart-form message
			String result = sendFormURLEncodedMessage(new URI(url), String.class, map, HttpMethod.POST);
			JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
			report.setURI(jsonObject.get("aadmuri").getAsString());
			JsonArray warningsJson = jsonObject.getAsJsonArray("warnings");
			if (warningsJson != null) {
				report.setWarnings(processWarnings(warningsJson.toString()));
			}
			JsonArray optimizationsJson = jsonObject.getAsJsonArray("templates_optimizations");
			if (optimizationsJson == null) {
				throw new Exception("No optimizations have been returned from the KB");
			}
			processOptimizations(optimizationsJson, report);
		} catch (HttpClientErrorException ex) {
			if (((HttpClientErrorException) ex).getStatusCode() == HttpStatus.BAD_REQUEST) {
				String result = ex.getResponseBodyAsString();
				JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
				JsonElement errors = jsonObject.get("errors");
				if (errors.isJsonArray()) { // There are validation errors
					try {
						report.setErrors(processErrors(errors.getAsJsonArray().toString()));
					} catch (Exception e) {
						throw new SodaliteException(e);
					}
				} else { // There are optimization errors
					JsonElement optimization_errors = errors.getAsJsonObject().get("templates_optimizations");
					if (optimization_errors != null) {
						try {
							report.setErrors(processOptimizationErrors(optimization_errors.toString()));
						} catch (Exception e) {
							throw new SodaliteException(e);
						}
					}
				}
			} else {
				throw ex;
			}
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}

		return report;
	}

	@Override
	public String getAADM(String aadmURI, String version, boolean withoutReferences) throws SodaliteException {
		Assert.notNull(aadmURI, "Pass a not null aadmURI");
		String url = kbReasonerUri + "aadm?aadmIRI=" + aadmURI;
		if (withoutReferences) {
			url += "&refactorer=true";
		}
		if (version != null && !version.isEmpty())
			url += "&version=" + version;
//		if (IAM_enabled)
//			url += "&token=" + this.aai_token;
		try {
			return getJSONObjectForType(String.class, new URI(url), HttpStatus.OK);
		}
//		catch (TokenExpiredException ex) {
//			// Renew AAI token and try again
//			if (IAM_enabled)
//				this.aai_token = getSecurityToken();
//			if (this.aai_token != null)
//				return getAADM(aadmURI, version, withoutReferences);
//			else
//				throw ex;
//		} 
		catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public String getRM(String rmURI) throws SodaliteException {
		Assert.notNull(rmURI, "Pass a not null rmURI");
		String url = kbReasonerUri + "rm?rmIRI=" + rmURI;
//		if (IAM_enabled)
//			url += "&token=" + this.aai_token;
		try {
			return getJSONObjectForType(String.class, new URI(url), HttpStatus.OK);
		}
//		catch (TokenExpiredException ex) {
//			// Renew AAI token and try again
//			if (IAM_enabled)
//				this.aai_token = getSecurityToken();
//			if (this.aai_token != null)
//				return getRM(rmURI);
//			else
//				throw ex;
//		} 
		catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public IaCBuilderAADMRegistrationReport askIaCBuilderToRegisterAADM(String model_name, String blueprint_name,
			String username, String aadm_json) throws SodaliteException {
		Assert.notNull(aadm_json, "Pass a not null aadm_json");
		String url = iacUri + "parse";

		String jsonContent = "{\n" + "\"name\" : \"" + model_name + "\",\n" + "\"blueprint_name\" : \"" + blueprint_name
				+ "\",\n" + "\"username\" : \"" + username + "\",\n" + "\"data\" : " + aadm_json + "\n}";
		URI uri;
		try {
			uri = new URI(url);
		} catch (URISyntaxException ex) {
			throw new SodaliteException(ex);
		}
		return postObjectAndReturnAnotherType(jsonContent, IaCBuilderAADMRegistrationReport.class, uri,
				HttpStatus.CREATED);
	}

	@Override
	public BuildImageReport buildImage(String image_build_conf) throws SodaliteException {
		Assert.notNull(image_build_conf, "Pass a not null image_build_conf");
		String url = image_builder_uri + "build/";
		URI uri;
		try {
			uri = new URI(url);
		} catch (URISyntaxException ex) {
			throw new SodaliteException(ex);
		}
		return postObjectAndReturnAnotherType(image_build_conf, BuildImageReport.class, uri, HttpStatus.ACCEPTED);
	}

	@Override
	public BuildImageStatusReport checkBuildImageStatus(String invocation_id) throws SodaliteException {
		Assert.notNull(invocation_id, "Pass a not null invocation_id");
		String url = image_builder_uri + "status/" + invocation_id;
		BuildImageStatusReport buildStatus = null;
		try {
			ResponseEntity<BuildImageStatusReport> response = getJSONMessage(new URI(url),
					BuildImageStatusReport.class);
			HttpStatus status = response.getStatusCode();
			buildStatus = response.getBody();
			if (status == HttpStatus.OK && buildStatus.getState().equals("in_progress"))
				buildStatus.setStatus(BuildImageStatus.BUILDING);
			else if (status == HttpStatus.OK && buildStatus.getState().equals("success"))
				buildStatus.setStatus(BuildImageStatus.DONE);
			else if (status == HttpStatus.OK && buildStatus.getState().equals("failed"))
				buildStatus.setStatus(BuildImageStatus.FAILED);
			else if (status == HttpStatus.NOT_FOUND)
				buildStatus.setStatus(BuildImageStatus.NOT_FOUND);
			else if (status == HttpStatus.INTERNAL_SERVER_ERROR)
				buildStatus.setStatus(BuildImageStatus.FAILED);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
		return buildStatus;
	}

	@Override
	public DeploymentReport deployAADM(Path inputs_yaml_path, String blueprint_id, String version_id, int workers,
			String deployment_label) throws SodaliteException {
		try {
			Assert.notNull(inputs_yaml_path, "Pass a not null inputs_yaml_path");
			Assert.notNull(blueprint_id, "Pass a not null blueprint_id");
			String url = xoperaUri + "/deployment/deploy?blueprint_id=" + blueprint_id;

			if (version_id != null && !version_id.isEmpty())
				url += "&version_id=" + version_id;

			if (workers >= 0)
				url += "&workers=" + workers;

			if (deployment_label != null && !deployment_label.isEmpty())
				url += "&deployment_label=" + deployment_label;

			LinkedMultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();

			Resource inputs_yaml = new ByteArrayResource(Files.readAllBytes(inputs_yaml_path)) {
				@Override
				public String getFilename() {
					return inputs_yaml_path.getFileName().toString();
				}
			};

			HttpHeaders xmlHeaders = new HttpHeaders();
			xmlHeaders.setContentType(MediaType.TEXT_PLAIN);
			if (IAM_enabled) {
//				this.aai_token = getSecurityToken();
				xmlHeaders.setBearerAuth(this.aai_token);
			}
			HttpEntity<Resource> fileEntity = new HttpEntity<Resource>(inputs_yaml, xmlHeaders);

			parts.add("inputs_file", fileEntity);

			return sendMultipartFormDataMessage(new URI(url), DeploymentReport.class, parts, HttpMethod.POST,
					HttpStatus.ACCEPTED);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public DeploymentStatusReport getAADMDeploymentStatus(String deployment_id) throws SodaliteException {
		DeploymentStatusReport deploymentStatus = null;
		Assert.notNull(deployment_id, "Pass a not null deployment_id");
		String url = xoperaUri + "deployment/" + deployment_id + "/status";
		try {
			deploymentStatus = getJSONObjectForType(DeploymentStatusReport.class, new URI(url), HttpStatus.OK);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}

		return deploymentStatus;
	}

	@Override
	public BlueprintData getBlueprintsForUser(String username) throws SodaliteException {
		BlueprintData blueprintData = null;
		Assert.notNull(username, "Pass a not null username");
		String url = xoperaUri + "blueprint?username=" + username;
		try {
			blueprintData = getJSONObjectForType(BlueprintData.class, new URI(url), HttpStatus.OK);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}

		return blueprintData;
	}

	@Override
	public BlueprintData getBlueprintForId(String blueprintId) throws SodaliteException {
		BlueprintData blueprintData = null;
		Assert.notNull(blueprintId, "Pass a not null blueprintId");
		String url = xoperaUri + "blueprint/" + blueprintId + "/meta";
		try {
			blueprintData = getJSONObjectForType(BlueprintData.class, new URI(url), HttpStatus.OK);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}

		return blueprintData;
	}

	@Override
	public DeploymentData getDeploymentsForBlueprint(String blueprintId) throws SodaliteException {
		DeploymentData deploymentData = null;
		Assert.notNull(blueprintId, "Pass a not null blueprintId");
		String url = xoperaUri + "blueprint/" + blueprintId + "/deployments";
		try {
			deploymentData = getJSONObjectForType(DeploymentData.class, new URI(url), HttpStatus.OK);
		} catch (NotFoundException ex) {
			deploymentData = new DeploymentData();
			List<? extends Object> elements = new ArrayList<Object>();
			deploymentData.setElements(elements);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}

		return deploymentData;
	}

	@Override
	public DeploymentData getDeploymentForId(String deploymentId) throws SodaliteException {
		DeploymentData deploymentData = null;
		Assert.notNull(deploymentId, "Pass a not null deploymentId");
		String url = xoperaUri + "deployment/" + deploymentId + "/status";
		try {
			deploymentData = getJSONObjectForType(DeploymentData.class, new URI(url), HttpStatus.OK);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}

		return deploymentData;
	}

	@Override
	public void deleteBlueprintForId(String blueprintId) throws SodaliteException {
		Assert.notNull(blueprintId, "Pass a not null blueprintId");
		String url = xoperaUri + "blueprint/" + blueprintId + "?force=false";
		try {
			deleteUriResource(new URI(url), HttpStatus.OK);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public DeploymentReport deleteDeploymentForId(String deploymentId, Path inputs_yaml_path, int workers)
			throws SodaliteException {
		try {
			Assert.notNull(deploymentId, "Pass a not null deploymentId");
			Assert.notNull(inputs_yaml_path, "Pass a not null inputs_yaml_path");
			String url = xoperaUri + "deployment/" + deploymentId + "/undeploy";
			if (workers >= 0)
				url += "?workers=" + workers;

			LinkedMultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();

			Resource inputs_yaml = new ByteArrayResource(Files.readAllBytes(inputs_yaml_path)) {
				@Override
				public String getFilename() {
					return inputs_yaml_path.getFileName().toString();
				}
			};

			HttpHeaders xmlHeaders = new HttpHeaders();
			xmlHeaders.setContentType(MediaType.TEXT_PLAIN);
			if (IAM_enabled) {
//				this.aai_token = getSecurityToken();
				xmlHeaders.setBearerAuth(this.aai_token);
			}
			HttpEntity<Resource> fileEntity = new HttpEntity<Resource>(inputs_yaml, xmlHeaders);

			parts.add("inputs_file", fileEntity);

			return sendMultipartFormDataMessage(new URI(url), DeploymentReport.class, parts, HttpMethod.POST,
					HttpStatus.ACCEPTED);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public DeploymentReport resumeDeploymentForId(String deploymentId, Path inputs_yaml_path, boolean clean_state,
			int workers) throws SodaliteException {
		try {
			Assert.notNull(deploymentId, "Pass a not null deploymentId");
			Assert.notNull(inputs_yaml_path, "Pass a not null inputs_yaml_path");
			String url = xoperaUri + "deployment/" + deploymentId + "/deploy_continue&clean_state=" + clean_state;
			if (workers >= 0)
				url += "&workers=" + workers;

			LinkedMultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();

			Resource inputs_yaml = new ByteArrayResource(Files.readAllBytes(inputs_yaml_path)) {
				@Override
				public String getFilename() {
					return inputs_yaml_path.getFileName().toString();
				}
			};

			HttpHeaders xmlHeaders = new HttpHeaders();
			xmlHeaders.setContentType(MediaType.TEXT_PLAIN);
			if (IAM_enabled) {
//				this.aai_token = getSecurityToken();
				xmlHeaders.setBearerAuth(this.aai_token);
			}
			HttpEntity<Resource> fileEntity = new HttpEntity<Resource>(inputs_yaml, xmlHeaders);

			parts.add("inputs_file", fileEntity);

			return sendMultipartFormDataMessage(new URI(url), DeploymentReport.class, parts, HttpMethod.POST,
					HttpStatus.ACCEPTED);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public PDSUpdateReport pdsUpdate(String inputs, String namespace, String platformType) throws SodaliteException {
		Assert.notNull(inputs, "Pass a not null inputs");
		Assert.notNull(namespace, "Pass a not null namespace");
		Assert.notNull(platformType, "Pass a not null platformType");

		// Build JSON payload
		Gson gson = new Gson();
		JsonObject inputsJson = gson.fromJson(inputs, JsonObject.class);
		JsonObject jsonObject = new JsonObject();
		jsonObject.add("inputs", inputsJson);
		jsonObject.addProperty("namespace", namespace);
		jsonObject.addProperty("platform_type", platformType);

		String payload = jsonObject.toString();

		String url = pdsUri + "update";
		URI uri;
		try {
			uri = new URI(url);
		} catch (URISyntaxException ex) {
			throw new SodaliteException(ex);
		}
		return postObjectAndReturnAnotherType(payload, PDSUpdateReport.class, uri, HttpStatus.OK);
	}

	@Override
	public ModelData getModelForResource(String resource, String module) throws SodaliteException {
		Assert.notNull(resource, "Pass a not null resource");
		Assert.notNull(module, "Pass a not null module");
		String url = kbReasonerUri + "model?resource=" + resource
				+ "&namespace=https://www.sodalite.eu/ontologies/workspace/1/" + module + "/";
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			return getJSONObjectForType(ModelData.class, new URI(url), HttpStatus.OK);
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getModelForResource(resource, module);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public ModelData getModel(String modelId, String version) throws SodaliteException {
		Assert.notNull(modelId, "Pass a not null modelId");
		String url = kbReasonerUri + "model?uri=" + modelId;
		if (version != null && !version.isEmpty())
			url += "&version=" + version;
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			return getJSONObjectForType(ModelData.class, new URI(url), HttpStatus.OK);
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getModel(modelId, version);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public ModelData getModelVersions(String modelId) throws SodaliteException {
		Assert.notNull(modelId, "Pass a not null modelId");
		String url = kbReasonerUri + "model?uri=" + modelId;
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			return getJSONObjectForType(ModelData.class, new URI(url), HttpStatus.OK);
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getModelVersions(modelId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public ModelData getAADMsInModule(String module) throws SodaliteException {
		return getModelsInModule("AADM", module);
	}

	@Override
	public ModelData getRMsInModule(String module) throws SodaliteException {
		return getModelsInModule("RM", module);
	}

	@Override
	public CapabilityDefinitionData getCapabilitiesDeclaredInTargetNodeForNodeTypeRequirement(String nodeType,
			String requirementName) throws SodaliteException {
		Assert.notNull(nodeType, "Pass a not null nodeType");
		Assert.notNull(requirementName, "Pass a not null requirementName");
		String url = kbReasonerUri + "capability-from-requirement?resource=" + nodeType + "&requirement="
				+ requirementName + "&template=false";
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			CapabilityDefinitionData data = getJSONObjectForType(CapabilityDefinitionData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new CapabilityDefinitionData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getCapabilitiesDeclaredInTargetNodeForNodeTypeRequirement(nodeType, requirementName);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public CapabilityAssignmentData getCapabilitiesDeclaredInTargetNodeForNodeTemplateRequirement(String nodeTemplate,
			String requirementName) throws SodaliteException {
		Assert.notNull(nodeTemplate, "Pass a not null nodeTemplate");
		Assert.notNull(requirementName, "Pass a not null requirementName");
		String url = kbReasonerUri + "capability-from-requirement?resource=" + nodeTemplate + "&requirement="
				+ requirementName + "&template=true";
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			CapabilityAssignmentData data = getJSONObjectForType(CapabilityAssignmentData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new CapabilityAssignmentData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getCapabilitiesDeclaredInTargetNodeForNodeTemplateRequirement(nodeTemplate, requirementName);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public OperationDefinitionData getOperationsInInterface(String interfaceType) throws SodaliteException {
		Assert.notNull(interfaceType, "Pass a not null interfaceType");
		String url = kbReasonerUri + "operations?resource=" + interfaceType;
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			OperationDefinitionData data = getJSONObjectForType(OperationDefinitionData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new OperationDefinitionData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getOperationsInInterface(interfaceType);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public OperationDefinitionData getOperations(List<String> modules) throws SodaliteException {
		Assert.notNull(modules, "Pass a not null modules");
		String url = kbReasonerUri + "operationsFromNamespaces";
		for (String module : modules)
			url += ";imports=" + module;
		if (IAM_enabled)
			url += ";token=" + this.aai_token;
		try {
			OperationDefinitionData data = getJSONObjectForType(OperationDefinitionData.class, new URI(url),
					HttpStatus.OK);
			if (data == null) {
				data = new OperationDefinitionData();
				data.setElements(new ArrayList<>());
			}
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getOperations(modules);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public void addHPCSecrets(HPCSecretData hpcSecrets) throws SodaliteException {
		Assert.notNull(hpcSecrets, "Pass a not null hpcSecrets");
		try {
			String url = vaultSecretUploaderUri + "ssh";
			Gson gson = new Gson();
			JsonObject jsonObject = new JsonObject();
			for (String key : hpcSecrets.getSecrets().keySet())
				jsonObject.addProperty(key, hpcSecrets.getSecrets().get(key));

			String payload = jsonObject.toString();

			URI uri;
			try {
				uri = new URI(url);
			} catch (URISyntaxException ex) {
				throw new SodaliteException(ex);
			}

			postObjectAndReturnAnotherType(payload, String.class, uri, HttpStatus.OK);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public List<String> listHPCInfrastructures() throws SodaliteException {
		try {
			String url = vaultSecretUploaderUri + "ssh";
			URI uri;
			try {
				uri = new URI(url);
			} catch (URISyntaxException ex) {
				throw new SodaliteException(ex);
			}
			String data = getJSONObjectForType(String.class, new URI(url), HttpStatus.OK);
			JsonObject jsonObject = new Gson().fromJson(data, JsonObject.class);
			JsonArray jsonArray = jsonObject.get("list").getAsJsonArray();
			List<String> hpcInfras = new ArrayList<>();
			Iterator<JsonElement> iter = jsonArray.iterator();
			while (iter.hasNext())
				hpcInfras.add(iter.next().getAsString());
			return hpcInfras;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			if (ex instanceof NotFoundException)
				return new ArrayList<String>(); // No hpc infrastructures found
			throw new SodaliteException(ex);
		}
	}

	@Override
	public HPCSecretData getHPCInfrastructure(String hpcName) throws SodaliteException {
		Assert.notNull(hpcName, "Pass a not null hpcName");
		try {
			String url = vaultSecretUploaderUri + "ssh/" + hpcName;
			URI uri;
			try {
				uri = new URI(url);
			} catch (URISyntaxException ex) {
				throw new SodaliteException(ex);
			}
			String data = getJSONObjectForType(String.class, new URI(url), HttpStatus.OK);
			JsonObject jsonObject = new Gson().fromJson(data, JsonObject.class);
			Map<String, String> secrets = new HashMap<>();
			secrets.put("ssh_host", jsonObject.get("ssh_host").getAsString());
			if (jsonObject.has("ssh_user"))
				secrets.put("ssh_user", jsonObject.get("ssh_user").getAsString());
			if (jsonObject.has("ssh_password"))
				secrets.put("ssh_password", jsonObject.get("ssh_password").getAsString());
			if (jsonObject.has("ssh_pkey"))
				secrets.put("ssh_pkey", jsonObject.get("ssh_pkey").getAsString());
			return new HPCSecretData(secrets);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public void deleteHPCInfrastructure(String hpcName) throws SodaliteException {
		Assert.notNull(hpcName, "Pass a not null hpcName");
		try {
			String url = vaultSecretUploaderUri + "ssh/" + hpcName;
			URI uri;
			try {
				uri = new URI(url);
			} catch (URISyntaxException ex) {
				throw new SodaliteException(ex);
			}
			deleteJsonMessage(uri);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public void notifyDeploymentToRefactoring(String appName, String aadm_id, String aadm_version, String blueprint_id,
			String deployment_id, String monitoring_id, String inputs) throws SodaliteException {
		try {
			Assert.notNull(appName, "Pass a not null appName");
			Assert.notNull(aadm_id, "Pass a not null aadm_id");
			Assert.notNull(aadm_version, "Pass a not null aadm_version");
			Assert.notNull(blueprint_id, "Pass a not null blueprint_id");
			Assert.notNull(deployment_id, "Pass a not null deployment_id");
			Assert.notNull(monitoring_id, "Pass a not null monitoring_id");
			Assert.notNull(inputs, "Pass a not null inputs");
			String url = refactorerUri + "rule-based-refactorer/v0.1/api/" + appName + "/deployments/";

			Gson gson = new Gson();
			JsonObject jsonObject = new JsonObject();
			jsonObject.addProperty("inputs", inputs);
			if (aadm_version != null && !aadm_version.isEmpty())
				jsonObject.addProperty("version", aadm_version);
			jsonObject.addProperty("aadm_id", aadm_id);
			jsonObject.addProperty("blueprint_id", blueprint_id);
			jsonObject.addProperty("deployment_id", deployment_id);
			jsonObject.addProperty("monitoring_id", monitoring_id);
			String payload = jsonObject.toString();

			URI uri;
			try {
				uri = new URI(url);
			} catch (URISyntaxException ex) {
				throw new SodaliteException(ex);
			}

			postObjectAndReturnAnotherType(payload, String.class, uri, HttpStatus.OK);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	private ModelData getModelsInModule(String type, String module) throws SodaliteException {
		String url = kbReasonerUri + "models?type=" + type;
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		if (module != null && !module.isEmpty())
			url += "&namespace=https://www.sodalite.eu/ontologies/workspace/1/" + module + "/";
		try {
			ModelData data = getJSONObjectForType(ModelData.class, new URI(url), HttpStatus.OK);
			// Setting module
			if (data == null) { // No found models
				data = new ModelData();
				data.setElements(new ArrayList<Model>());
			}
			data.getElements().forEach(model -> model.setModule(module));
			return data;
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				return getModelsInModule(type, module);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public void deleteModel(String modelId, String version) throws SodaliteException {
		Assert.notNull(modelId, "Pass a not null modelId");
		String url = kbReasonerUri + "delete?uri=" + modelId;
		if (version != null && !version.isEmpty())
			url += "&version=" + version;
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			deleteUriResource(new URI(url), HttpStatus.OK);
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				deleteModel(modelId, version);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public void deleteModel(String modelId) throws SodaliteException {
		Assert.notNull(modelId, "Pass a not null modelId");
		String url = kbReasonerUri + "delete?uri=" + modelId + "?hard=true";
		if (IAM_enabled)
			url += "&token=" + this.aai_token;
		try {
			deleteUriResource(new URI(url), HttpStatus.OK);
		} catch (TokenExpiredException ex) {
			// Renew AAI token and try again
			if (IAM_enabled)
				this.aai_token = getSecurityToken();
			if (this.aai_token != null)
				deleteModel(modelId);
			else
				throw ex;
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public void createMonitoringDashboard(String monitoring_Id, String deployment_label) throws SodaliteException {
		Assert.notNull(monitoring_Id, "Pass a not null monitoring_Id");
		Assert.notNull(deployment_label, "Pass a not null deployment_label");

		// Build JSON payload
		Gson gson = new Gson();
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("monitoring_id", monitoring_Id);
		jsonObject.addProperty("deployment_label", deployment_label);

		String payload = jsonObject.toString();

		String url = grafanaUri + "dashboards";
		try {
			postObject(payload, new URI(url), HttpStatus.OK);
		} catch (URISyntaxException ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public void deleteMonitoringDashboard(String monitoring_Id, String deployment_label) throws SodaliteException {
		Assert.notNull(monitoring_Id, "Pass a not null monitoring_Id");
		Assert.notNull(deployment_label, "Pass a not null deployment_label");

		// Build JSON payload
		Gson gson = new Gson();
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("monitoring_id", monitoring_Id);
		jsonObject.addProperty("deployment_label", deployment_label);

		String payload = jsonObject.toString();

		String url = grafanaUri + "dashboards";
		try {
			deleteUriResource(new URI(url), payload, HttpStatus.OK);
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public DashboardData getMonitoringDashboards(String monitoring_Id) throws SodaliteException {
		DashboardData dashboardData = null;
		Assert.notNull(monitoring_Id, "Pass a not null monitoring_Id");
		String url = grafanaUri + "dashboards/deployment/" + monitoring_Id;
		try {
			dashboardData = getJSONObjectForType(DashboardData.class, new URI(url), HttpStatus.OK);
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}

		return dashboardData;
	}

	@Override
	public void registerAlertingRules(String monitoring_id, String rules) throws SodaliteException {
		Assert.notNull(monitoring_id, "Pass a not null monitoring_id");
		Assert.notNull(rules, "Pass a not null rules");

		String url = rulesServerUri + "rules/" + monitoring_id;
		try {
			postObject(rules, new URI(url), HttpStatus.OK);
		} catch (URISyntaxException ex) {
			throw new SodaliteException(ex);
		}
	}

	@Override
	public void deregisterAlertingRules(String monitoring_id) throws SodaliteException {
		Assert.notNull(monitoring_id, "Pass a not null monitoring_id");

		String url = rulesServerUri + "rules/" + monitoring_id;
		try {
			deleteUriResource(new URI(url), "", HttpStatus.OK);
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	private List<KBError> processErrors(String json) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		List<KBError> errors = mapper.readValue(json, new TypeReference<List<KBError>>() {
		});
		return errors;
	}

	private List<KBWarning> processWarnings(String json) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		List<KBWarning> warnings = mapper.readValue(json, new TypeReference<List<KBWarning>>() {
		});
		return warnings;
	}

	private void processOptimizations(JsonArray jsonArray, KBOptimizationReportData report)
			throws JsonMappingException, JsonProcessingException {
		List<KBOptimization> optimizations = new ArrayList<>();
		List<KBOptimizationError> errors = new ArrayList<>();
		for (JsonElement json : jsonArray) {
			JsonObject jsonObj = (JsonObject) json;
			KBOptimization opt = new KBOptimization();
			String type = jsonObj.get("type").getAsString();
			if (type != null) {
				if (type.equals("Optimization")) {
					KBOptimization optimization = new KBOptimization();
					JsonObject info = (JsonObject) jsonObj.get("info");
					if (info != null) {
						optimization.setNodeTemplate(info.get("context").getAsString());
						optimization.setDescription(info.get("description").getAsString());
						JsonArray optimizationsJson = info.getAsJsonArray("optimizations");
						List<KBOptimization.KBIssue> issues = new ArrayList<>();
						for (JsonElement optJson : optimizationsJson) {
							JsonObject optJsonObj = (JsonObject) optJson;
							KBOptimization.KBIssue issue = optimization.new KBIssue();
							issue.setPath(optJsonObj.get("path").getAsString());
							issue.setValue(optJsonObj.get("value").getAsString());
							issues.add(issue);
						}
						optimization.setIssues(issues);
						optimizations.add(optimization);
					}
				} else if (type.equals("OptimizationMismatch")) {
					KBOptimizationError error = new KBOptimizationError();
					error.setType(type);
					JsonObject info = (JsonObject) jsonObj.get("info");
					if (info != null) {
						error.setPath(info.get("path").getAsString());
						error.setContext(info.get("context").getAsString());
						error.setDescription(info.get("description").getAsString());
						error.setValue(info.get("value").getAsString());
					}
					errors.add(error);
				}
			}
		}
		report.setOptimizations(optimizations);
		report.setErrors(errors);
	}

	private List<KBOptimizationError> processOptimizationErrors(String json) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		List<KBOptimizationError> errors = mapper.readValue(json, new TypeReference<List<KBOptimizationError>>() {
		});
		return errors;
	}

	private List<KBSuggestion> processSuggestions(JsonArray jsonArray)
			throws JsonMappingException, JsonProcessingException {
		List<KBSuggestion> result = new ArrayList<>();
		for (JsonElement json : jsonArray) {
			JsonObject jsonObj = (JsonObject) json;
			KBSuggestion suggestion = new KBSuggestion();
			if (jsonObj.has("type"))
				suggestion.setType(jsonObj.get("type").getAsString());
			if (jsonObj.has("info")) {
				JsonObject info = (JsonObject) jsonObj.get("info");
				if (info.has("context"))
					suggestion.setContext(info.get("context").getAsString());
				if (info.has("description"))
					suggestion.setDescription(info.get("description").getAsString());
				if (info.has("name"))
					suggestion.setEntity_name(info.get("name").getAsString());
				if (info.has("suggestions")) {
					JsonArray array = (JsonArray) info.get("suggestions");
					SortedSet<String> suggestions = new Gson().fromJson(array, TreeSet.class);
					suggestion.setSuggestions(suggestions);
				}
			}
			result.add(suggestion);
		}
		return result;
	}

//	private String getSuggestionNode(JsonObject jsonObj) {
//		String node = null;
//		Iterator<String> iter = jsonObj.keySet().iterator();
//		while (iter.hasNext()) {
//			String candidate = iter.next();
//			if (!candidate.equals("description")) {
//				node = candidate;
//				break;
//			}
//		}
//		return node;
//	}

	/**
	 * Send GET message to uri, accepting an object of class clazz in JSON
	 * representation
	 * 
	 * @param uri   URI of GET message
	 * @param clazz Class representing returned object
	 * @throws NoSuchAlgorithmException
	 * @throws KeyStoreException
	 * @throws KeyManagementException
	 */
	private <T> ResponseEntity<T> getJSONMessage(URI uri, Class<T> clazz) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		if (IAM_enabled) {
//			this.aai_token = getSecurityToken();
			headers.setBearerAuth(this.aai_token);
		}
		RequestEntity<T> request = (RequestEntity<T>) RequestEntity.get(uri).headers(headers)
				.accept(MediaType.APPLICATION_JSON).build();
		if (uri.getScheme().equals("https"))
			return getSslRestTemplate().exchange(request, clazz);
		else
			return getRestTemplate().exchange(request, clazz);
	}

	private <T> T getJSONObjectForType(Class<T> type, URI uri, HttpStatus expectedStatus) throws SodaliteException {
		try {
			Assert.notNull(uri, "Provide a valid uri");
			ResponseEntity<T> response = getJSONMessage(uri, type);
			T object = response.getBody();
			if (response.getStatusCode().equals(expectedStatus)) {
				log.info("Located " + type + " JSON object: " + object);
			} else {
				throw new SodaliteException("There was a problem getting JSON object in uri: " + uri);
			}
			return object;
		} catch (HttpClientErrorException ex) {
			log.info("There was a problem getting JSON object(s) in uri: " + uri);
			log.error(ex.getMessage(), ex);

			if (ex.getStatusCode() == HttpStatus.UNAUTHORIZED) {
				throw new TokenExpiredException(ex.getMessage());
			} else if (ex.getStatusCode() == HttpStatus.FORBIDDEN) {
				throw new NotRolePermissionException(ex.getMessage());
			} else if (ex.getStatusCode() == HttpStatus.NOT_FOUND) {
				throw new NotFoundException(ex.getMessage());
			} else {
				throw ex;
			}
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	private <T> List<T> getJSONObjectsListForType(Class<T[]> type, URI uri, HttpStatus expectedStatus)
			throws Exception {
		try {
			Assert.notNull(uri, "Provide a valid uri");
			ResponseEntity<T[]> response = getJSONMessage(uri, type);
			T[] objects = response.getBody();
			if (response.getStatusCode().equals(expectedStatus)) {
				log.info("Located " + objects.length + " JSON object(s) for type " + type);
			} else {
				throw new Exception("There was a problem getting JSON object(s) in uri: " + uri);
			}
			return (List<T>) Arrays.asList(objects);
		} catch (Exception e) {
			log.info("There was a problem getting JSON object(s) in uri: " + uri);
			log.error(e.getMessage(), e);
			throw e;
		}
	}

	private HttpStatus getStatusOfURI(URI uri) throws Exception {
		try {
			Assert.notNull(uri, "Provide a valid uri");
			return getJSONMessage(uri, String.class).getStatusCode();
		} catch (HttpClientErrorException e) {
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}

	private <T, S> S postObjectAndReturnAnotherType(T object, Class<S> returnedType, URI uri, HttpStatus expectedStatus)
			throws SodaliteException {
		S result = null;
		try {
			Assert.notNull(object, "Provide a valid object of type " + object.getClass());
			Assert.notNull(uri, "Provide a valid uri");
			ResponseEntity<S> response = postJsonMessage(object, uri, returnedType);
			result = response.getBody();
			if (response.getStatusCode().equals(expectedStatus)) {
				log.info("Successfully inserted JSON object " + object);
				log.info("Result obtained: " + result);
			} else {
				throw new Exception("There was a problem inserting JSON object " + object + " in URI: " + uri);
			}
			return result;
		} catch (HttpClientErrorException e) {
			throw e;
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	private <T> void postObject(T object, URI uri, HttpStatus expectedStatus) throws SodaliteException {
		String result = null;
		try {
			Assert.notNull(object, "Provide a valid object of type " + object.getClass());
			Assert.notNull(uri, "Provide a valid uri");
			ResponseEntity<String> response = postJsonMessageWithoutResult(object, uri, object.getClass());
			result = response.getBody();
			if (response.getStatusCode().equals(expectedStatus)) {
				log.info("Successfully inserted JSON object " + object);
				log.info("Result obtained: " + result);
			} else {
				throw new Exception("There was a problem inserting JSON object " + object + " in URI: " + uri);
			}
		} catch (HttpClientErrorException e) {
			throw e;
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	private <T> T sendFormURLEncodedMessageWithCredentials(URI uri, Class<T> returnType,
			MultiValueMap<String, Object> parts, HttpMethod method, String username, String password) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.setBasicAuth(username, password);

		HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(parts, headers);
		ResponseEntity<T> response = exchange(uri, method, entity, returnType);

		return response.getBody();
	}

	private <T> T sendFormURLEncodedMessage(URI uri, Class<T> returnType, MultiValueMap<String, Object> parts,
			HttpMethod method) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(parts, headers);
		ResponseEntity<T> response = exchange(uri, method, entity, returnType);

		return response.getBody();
	}

	private <T> T sendMultipartFormDataMessage(URI uri, Class<T> returnType, MultiValueMap<String, Object> parts,
			HttpMethod method, HttpStatus expectedStatus) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		if (IAM_enabled) {
			// this.aai_token = getSecurityToken();
			headers.setBearerAuth(this.aai_token);
		}

		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<MultiValueMap<String, Object>>(parts,
				headers);

		ResponseEntity<T> response = exchange(uri, method, requestEntity, returnType);
		if (!response.getStatusCode().equals(expectedStatus)) {
			log.error("Expected status " + expectedStatus + " was not received");
			throw new HttpClientErrorException(response.getStatusCode());
		}
		return response.getBody();
	}

	private <T> ResponseEntity<T> exchange(URI uri, HttpMethod method,
			HttpEntity<MultiValueMap<String, Object>> requestEntity, Class<T> clazz) throws Exception {
		if (uri.getScheme().equals("https"))
			return getSslRestTemplate().exchange(uri, method, requestEntity, clazz);
		else
			return getRestTemplate().exchange(uri, method, requestEntity, clazz);
	}

	private <T, S> ResponseEntity<T> postJsonMessage(S object, URI uri, Class clazz) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		if (IAM_enabled) {
//			this.aai_token = getSecurityToken();
			headers.setBearerAuth(this.aai_token);
		}
		RequestEntity<S> request = RequestEntity.post(uri).headers(headers).contentType(MediaType.APPLICATION_JSON)
				.body(object);
		if (uri.getScheme().equals("https"))
			return (ResponseEntity<T>) getSslRestTemplate().exchange(request, clazz);
		else
			return (ResponseEntity<T>) getRestTemplate().exchange(request, clazz);
	}

	private <T> ResponseEntity<String> postJsonMessageWithoutResult(T object, URI uri, Class clazz) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		if (IAM_enabled) {
//			this.aai_token = getSecurityToken();
			headers.setBearerAuth(this.aai_token);
		}
		RequestEntity<T> request = RequestEntity.post(uri).headers(headers).contentType(MediaType.APPLICATION_JSON)
				.body(object);
		if (uri.getScheme().equals("https"))
			return (ResponseEntity<String>) getSslRestTemplate().exchange(request, clazz);
		else
			return (ResponseEntity<String>) getRestTemplate().exchange(request, clazz);
	}

	private static String encodeValue(String value) {
		try {
			return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
		} catch (UnsupportedEncodingException ex) {
			throw new RuntimeException(ex.getCause());
		}
	}

	private boolean deleteUriResource(URI uri, HttpStatus expectedStatus) throws Exception {
		boolean result = false;
		try {
			Assert.notNull(uri, "Provide a valid uri");
			ResponseEntity<String> response = deleteJsonMessage(uri);
			if (response.getStatusCode().equals(expectedStatus)) {
				log.info("Successfully delete in uri " + uri);
				result = true;
			} else {
				log.info("There was a problem deleting in URI: " + uri);
			}
			return result;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}
	}

	private boolean deleteUriResource(URI uri, String json, HttpStatus expectedStatus) throws Exception {
		boolean result = false;
		try {
			Assert.notNull(uri, "Provide a valid uri");
			ResponseEntity<String> response = deleteJsonMessage(json, uri);
			if (response.getStatusCode().equals(expectedStatus)) {
				log.info("Successfully delete in uri " + uri);
				result = true;
			} else {
				log.info("There was a problem deleting in URI: " + uri);
			}
			return result;
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return false;
		}
	}

	private ResponseEntity<String> getJsonMessage(URI uri) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "*/*");
		HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
		return getRestTemplate().exchange(uri, HttpMethod.GET, requestEntity, String.class);
	}

	private ResponseEntity<String> deleteJsonMessage(URI uri) throws SodaliteException {
		HttpHeaders headers = new HttpHeaders();
		if (IAM_enabled) {
//			this.aai_token = getSecurityToken();
			headers.setBearerAuth(this.aai_token);
		}
		headers.add("Content-Type", "application/json");
		headers.add("Accept", "*/*");
		HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
		return getRestTemplate().exchange(uri, HttpMethod.DELETE, requestEntity, String.class);
	}

	private ResponseEntity<String> deleteJsonMessage(String json, URI uri) throws SodaliteException {
		HttpHeaders headers = new HttpHeaders();
		if (IAM_enabled) {
//			this.aai_token = getSecurityToken();
			headers.setBearerAuth(this.aai_token);
		}

		headers.add("Content-Type", "application/json");
		headers.add("Accept", "*/*");
		HttpEntity<String> requestEntity = new HttpEntity<>(json, headers);
		return getRestTemplate().exchange(uri, HttpMethod.DELETE, requestEntity, String.class);
	}

	private String getSecurityToken() throws SodaliteException {
		try {
			String url = keycloakUri + "auth/realms/SODALITE/protocol/openid-connect/token";
			MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

			map.add("grant_type", "password");
			map.add("username", this.keycloak_user);
			map.add("password", this.keycloak_password);
			map.add("client_id", this.keycloak_client_id);
			map.add("client_secret", this.keycloak_client_secret);

			String result = sendFormURLEncodedMessage(new URI(url), String.class, map, HttpMethod.POST);
			JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
			return jsonObject.get("access_token").getAsString();
		} catch (HttpClientErrorException ex) {
			throw new org.sodalite.dsl.kb_reasoner_client.exceptions.HttpClientErrorException(ex.getMessage());
		} catch (Exception ex) {
			throw new SodaliteException(ex);
		}
	}

	private void revokeToken() {
		try {
			String url = keycloakUri + "auth/realms/SODALITE/protocol/openid-connect/revoke";
			MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

			map.add("token", this.aai_token);
			map.add("token_type_hint", "access_token");
			map.add("client_id", this.keycloak_client_id);
			map.add("client_secret", this.keycloak_client_secret);

			sendFormURLEncodedMessage(new URI(url), String.class, map, HttpMethod.POST);
		} catch (Exception ex) {
			// Ignored
		}
	}

	private Boolean isValidToken(String token) throws Exception {
		String url = keycloakUri + "auth/realms/SODALITE/protocol/openid-connect/token/introspect";
		MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

		map.add("token", token);

		String result = sendFormURLEncodedMessageWithCredentials(new URI(url), String.class, map, HttpMethod.POST,
				this.keycloak_client_id, this.keycloak_client_secret);
		JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
		return jsonObject.get("active").getAsBoolean();
	}

}
