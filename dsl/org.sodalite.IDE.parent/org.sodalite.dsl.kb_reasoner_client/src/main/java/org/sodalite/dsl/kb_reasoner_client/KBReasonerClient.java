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

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeData;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityData;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentReport;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentStatus;
import org.sodalite.dsl.kb_reasoner_client.types.IaCBuilderAADMRegistrationReport;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceData;
import org.sodalite.dsl.kb_reasoner_client.types.KBError;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimization;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationError;
import org.sodalite.dsl.kb_reasoner_client.types.KBOptimizationReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.KBSuggestion;
import org.sodalite.dsl.kb_reasoner_client.types.KBWarning;
import org.sodalite.dsl.kb_reasoner_client.types.ModuleData;
import org.sodalite.dsl.kb_reasoner_client.types.NodeData;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementData;
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
	private String xoperaUri;

	public KBReasonerClient(String kbReasonerUri, String iacUri, String xoperaUri) {
		this.kbReasonerUri = kbReasonerUri;
		this.iacUri = iacUri;
		this.xoperaUri = xoperaUri;
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
			sslRestTemplate = new RestTemplate(requestFactory);
		}
		return sslRestTemplate;
	}

	private RestTemplate getRestTemplate() {
		if (restTemplate == null) {
			restTemplate = new RestTemplate();
		}
		return restTemplate;
	}

	public NodeData getNodes(List<String> modules) throws Exception {
		Assert.notNull(modules, "Pass a not null modules");
		String url = kbReasonerUri + "nodes";
		for (String module : modules)
			url += ";imports=" + module;
		return getJSONObjectForType(NodeData.class, new URI(url), HttpStatus.OK);
	}

	public ModuleData getModules() throws Exception {
		String url = kbReasonerUri + "namespaces";
		return getJSONObjectForType(ModuleData.class, new URI(url), HttpStatus.OK);
	}

	public AttributeData getAttributes(String resourceId) throws Exception {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "attributes?resource=" + resourceId;
		return getJSONObjectForType(AttributeData.class, new URI(url), HttpStatus.OK);
	}

	public CapabilityData getCapabilities(String resourceId) throws Exception {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "capabilities?resource=" + resourceId;
		return getJSONObjectForType(CapabilityData.class, new URI(url), HttpStatus.OK);
	}

	public InterfaceData getInterfaces(String resourceId) throws Exception {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "interfaces?resource=" + resourceId;
		return getJSONObjectForType(InterfaceData.class, new URI(url), HttpStatus.OK);
	}

	public PropertyData getProperties(String resourceId) throws Exception {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "properties?resource=" + resourceId;
		return getJSONObjectForType(PropertyData.class, new URI(url), HttpStatus.OK);
	}

	public RequirementData getRequirements(String resourceId) throws Exception {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = kbReasonerUri + "requirements?resource=" + resourceId;
		return getJSONObjectForType(RequirementData.class, new URI(url), HttpStatus.OK);
	}

	public ValidRequirementNodeData getValidRequirementNodes(String requirementId, String nodeType) throws Exception {
		Assert.notNull(requirementId, "Pass a not null requirementId");
		Assert.notNull(nodeType, "Pass a not null nodeType");
		String url = kbReasonerUri + "valid-requirement-nodes?requirement=" + requirementId + "&nodeType=" + nodeType;
		return getJSONObjectForType(ValidRequirementNodeData.class, new URI(url), HttpStatus.OK);
	}

	@Override
	public KBSaveReportData saveAADM(String aadmTTL, String aadmURI, String namespace, String aadmDSL, boolean complete)
			throws Exception {
		Assert.isTrue(!aadmTTL.isEmpty(), "Turtle content for AADM can neither be null nor empty");
		Assert.isTrue(!aadmDSL.isEmpty(), "AADM DSL content can neither be null nor empty");
		String url = kbReasonerUri + "saveAADM";

		MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

		map.add("aadmTTL", aadmTTL);
		map.add("aadmURI", aadmURI);
		map.add("complete", complete);
		map.add("namespace", namespace);
		map.add("aadmDSL", aadmDSL);

		KBSaveReportData report = new KBSaveReportData();
		try {
			// Send multipart-form message
			String result = sendFormURLEncodedMessage(new URI(url), String.class, map, HttpMethod.POST);
			JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
			report.setURI(jsonObject.get("aadmuri").getAsString());
			JsonArray warningsJson = jsonObject.getAsJsonArray("warnings");
			if (warningsJson != null) {
				report.setWarnings(processWarnings(warningsJson.toString()));
			}
			JsonArray suggestionsJson = jsonObject.getAsJsonArray("suggestions");
			if (suggestionsJson != null) {
				report.setSuggestions(processSuggestions(suggestionsJson));
			}
		} catch (Exception ex) {
			if (ex instanceof HttpClientErrorException) {
				HttpClientErrorException hcee = (HttpClientErrorException) ex;
				if (((HttpClientErrorException) ex).getStatusCode() == HttpStatus.BAD_REQUEST) {
					String result = hcee.getResponseBodyAsString();
					String json = result.substring(result.indexOf(":") + 1);
					report.setErrors(processErrors(json));
				} else {
					throw ex;
				}
			} else {
				throw ex;
			}
		}

		return report;
	}

	@Override
	public KBSaveReportData saveRM(String rmTTL, String rmURI, String namespace, String rmDSL) throws Exception {
		Assert.isTrue(!rmTTL.isEmpty(), "Turtle content for RM can neither be null nor empty");
		String url = kbReasonerUri + "saveRM";

		MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

		map.add("rmTTL", rmTTL);
		map.add("rmURI", rmURI);
		map.add("namespace", namespace);
		map.add("rmDSL", rmDSL);

		KBSaveReportData report = new KBSaveReportData();
		try {
			// Send multipart-form message
			String result = sendFormURLEncodedMessage(new URI(url), String.class, map, HttpMethod.POST);
			JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
			report.setURI(jsonObject.get("rmuri").getAsString());
			JsonArray warningsJson = jsonObject.getAsJsonArray("warnings");
			if (warningsJson != null) {
				report.setWarnings(processWarnings(warningsJson.toString()));
			}
		} catch (Exception ex) {
			if (ex instanceof HttpClientErrorException) {
				HttpClientErrorException hcee = (HttpClientErrorException) ex;
				if (((HttpClientErrorException) ex).getStatusCode() == HttpStatus.BAD_REQUEST) {
					String result = hcee.getResponseBodyAsString();
					String json = result.substring(result.indexOf(":") + 1);
					report.setErrors(processErrors(json));
				} else {
					throw ex;
				}
			} else {
				throw ex;
			}
		}

		return report;
	}

	@Override
	public KBOptimizationReportData optimizeAADM(String aadmTTL, String aadmURI) throws Exception {
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
		} catch (Exception ex) {
			if (ex instanceof HttpClientErrorException) {
				HttpClientErrorException hcee = (HttpClientErrorException) ex;
				if (((HttpClientErrorException) ex).getStatusCode() == HttpStatus.BAD_REQUEST) {
					String result = hcee.getResponseBodyAsString();
					JsonObject jsonObject = new Gson().fromJson(result, JsonObject.class);
					JsonElement errors = jsonObject.get("errors");
					if (errors.isJsonArray()) { // There are validation errors
						report.setErrors(processErrors(errors.getAsJsonArray().toString()));
					} else { // There are optimization errors
						JsonElement optimization_errors = errors.getAsJsonObject().get("templates_optimizations");
						if (optimization_errors != null) {
							report.setErrors(processOptimizationErrors(optimization_errors.toString()));
						}
					}
				} else {
					throw ex;
				}
			} else {
				throw ex;
			}
		}

		return report;
	}

	@Override
	public String getAADM(String aadmURI) throws Exception {
		Assert.notNull(aadmURI, "Pass a not null aadmURI");
		String url = kbReasonerUri + "aadm?aadmIRI=" + aadmURI;
		return getJSONObjectForType(String.class, new URI(url), HttpStatus.OK);
	}

	@Override
	public IaCBuilderAADMRegistrationReport askIaCBuilderToRegisterAADM(String model_name, String aadm_json)
			throws Exception {
		Assert.notNull(aadm_json, "Pass a not null aadm_json");
		String url = iacUri + "parse";
		// FIXME create Json content
		String jsonContent = "{\n" + "\"name\" : \"" + model_name + "\",\n" + "\"data\" : " + aadm_json + "\n}";
		return postObjectAndReturnAnotherType(jsonContent, IaCBuilderAADMRegistrationReport.class, new URI(url),
				HttpStatus.OK);
	}

	@Override
	public DeploymentReport deployAADM(Path inputs_yaml_path, String blueprint_token) throws Exception {
		Assert.notNull(inputs_yaml_path, "Pass a not null inputs_yaml_path");
		Assert.notNull(blueprint_token, "Pass a not null blueprint_token");
		String url = xoperaUri + "deploy/" + blueprint_token;
		LinkedMultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();

		Resource inputs_yaml = new ByteArrayResource(Files.readAllBytes(inputs_yaml_path)) {
			@Override
			public String getFilename() {
				return inputs_yaml_path.getFileName().toString();
			}
		};

		HttpHeaders xmlHeaders = new HttpHeaders();
		xmlHeaders.setContentType(MediaType.TEXT_PLAIN);
		HttpEntity<Resource> fileEntity = new HttpEntity<Resource>(inputs_yaml, xmlHeaders);

		parts.add("inputs_file", fileEntity);

		return sendMultipartFormDataMessage(new URI(url), DeploymentReport.class, parts, HttpMethod.POST,
				HttpStatus.ACCEPTED);
	}

	@Override
	public DeploymentStatus getAADMDeploymentStatus(String session_token) throws Exception {
		DeploymentStatus deploymentStatus = DeploymentStatus.FAILED;
		Assert.notNull(session_token, "Pass a not null session_token");
		String url = xoperaUri + "info/status?token=" + session_token;
		try {
			HttpStatus status = getStatusOfURI(new URI(url));
			if (status == HttpStatus.CREATED) {
				deploymentStatus = DeploymentStatus.DONE;
			} else if (status == HttpStatus.ACCEPTED) {
				deploymentStatus = DeploymentStatus.IN_PROGRESS;
			}
		} catch (Exception e) {
			// Ignored
		}

		return deploymentStatus;
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

	// FIXME Some suggestions are not read and lost
	private List<KBSuggestion> processSuggestions(JsonArray jsonArray)
			throws JsonMappingException, JsonProcessingException {
		List<KBSuggestion> result = new ArrayList<>();
		for (JsonElement json : jsonArray) {
			JsonObject jsonObj = (JsonObject) json;
			KBSuggestion opt = new KBSuggestion();
			String node = getSuggestionNode(jsonObj);
			if (node != null && !node.equals("description")) {
				KBSuggestion suggestion = new KBSuggestion();
				suggestion.getHierarchyPath().add(node);
				JsonObject obj = (JsonObject) jsonObj.get(node);
				JsonArray array = null;
				boolean done = false;
				while (!done) {
					String key = obj.keySet().iterator().next();
					suggestion.getHierarchyPath().add(key);
					try {
						obj = (JsonObject) obj.get(key);
					} catch (Exception ex) {
						array = obj.getAsJsonArray(key);
						done = true;
					}
				}
				SortedSet<String> suggestions = new Gson().fromJson(array, TreeSet.class);
				suggestion.setSuggestions(suggestions);

				result.add(suggestion);
			}
		}
		return result;
	}

	private String getSuggestionNode(JsonObject jsonObj) {
		String node = null;
		Iterator<String> iter = jsonObj.keySet().iterator();
		while (iter.hasNext()) {
			String candidate = iter.next();
			if (!candidate.equals("description")) {
				node = candidate;
				break;
			}
		}
		return node;
	}

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
		RequestEntity<T> request = (RequestEntity<T>) RequestEntity.get(uri).accept(MediaType.APPLICATION_JSON).build();
		if (uri.getScheme().equals("https"))
			return getSslRestTemplate().exchange(request, clazz);
		else
			return getRestTemplate().exchange(request, clazz);
	}

	private <T> T getJSONObjectForType(Class<T> type, URI uri, HttpStatus expectedStatus) throws Exception {
		try {
			Assert.notNull(uri, "Provide a valid uri");
			ResponseEntity<T> response = getJSONMessage(uri, type);
			T object = response.getBody();
			if (response.getStatusCode().equals(expectedStatus)) {
				log.info("Located " + type + " JSON object: " + object);
			} else {
				log.info("There was a problem getting JSON object in uri: " + uri);
			}
			return object;
		} catch (Exception e) {
			log.info("There was a problem getting JSON object(s) in uri: " + uri);
			log.error(e.getMessage(), e);
			throw e;
		}
	}

	public <T> List<T> getJSONObjectsListForType(Class<T[]> type, URI uri, HttpStatus expectedStatus) throws Exception {
		try {
			Assert.notNull(uri, "Provide a valid uri");
			ResponseEntity<T[]> response = getJSONMessage(uri, type);
			T[] objects = response.getBody();
			if (response.getStatusCode().equals(expectedStatus)) {
				log.info("Located " + objects.length + " JSON object(s) for type " + type);
			} else {
				log.info("There was a problem getting JSON object(s) in uri: " + uri);
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
		} catch (Exception e) {
			log.info("There was a problem getting JSON object(s) in uri: " + uri);
			log.error(e.getMessage(), e);
			throw e;
		}
	}

	private <T, S> S postObjectAndReturnAnotherType(T object, Class<S> returnedType, URI uri, HttpStatus expectedStatus)
			throws Exception {
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
				log.info("There was a problem inserting JSON object " + object + " in URI: " + uri);
				result = null;
			}
			return result;
		} catch (Exception e) {
			log.info("There was a problem inserting JSON object " + object + " in URI: " + uri);
			log.error(e.getMessage(), e);
			throw e;
		}
	}

	private <T> T sendFormURLEncodedMessage(URI uri, Class<T> returnType, MultiValueMap<String, Object> parts,
			HttpMethod method) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(parts, headers);
		ResponseEntity<T> response = exchange(uri, method, entity, returnType);

		return response.getBody();
	}

	public <T> T sendMultipartFormDataMessage(URI uri, Class<T> returnType, MultiValueMap<String, Object> parts,
			HttpMethod method, HttpStatus expectedStatus) throws Exception {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

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

	public <T, S> ResponseEntity<T> postJsonMessage(S object, URI uri, Class clazz) throws Exception {
		RequestEntity<S> request = RequestEntity.post(uri).contentType(MediaType.APPLICATION_JSON).body(object);
		if (uri.getScheme().equals("https"))
			return (ResponseEntity<T>) getSslRestTemplate().exchange(request, clazz);
		else
			return (ResponseEntity<T>) getRestTemplate().exchange(request, clazz);
	}

}
