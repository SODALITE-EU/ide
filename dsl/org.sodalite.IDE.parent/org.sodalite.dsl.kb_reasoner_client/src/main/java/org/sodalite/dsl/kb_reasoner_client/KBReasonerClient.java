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
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeData;
import org.sodalite.dsl.kb_reasoner_client.types.CapabilityData;
import org.sodalite.dsl.kb_reasoner_client.types.InterfaceData;
import org.sodalite.dsl.kb_reasoner_client.types.KBError;
import org.sodalite.dsl.kb_reasoner_client.types.KBSaveReportData;
import org.sodalite.dsl.kb_reasoner_client.types.NodeData;
import org.sodalite.dsl.kb_reasoner_client.types.PropertyData;
import org.sodalite.dsl.kb_reasoner_client.types.RequirementData;
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class KBReasonerClient implements KBReasoner {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private RestTemplate restTemplate;
	private final String SERVER_URI = "http://160.40.52.200:8084/reasoner-api/v0.6/";

	public KBReasonerClient() {
		restTemplate = new RestTemplate();
	}

	public NodeData getNodes() throws Exception {
		String url = SERVER_URI + "nodes";
		return getJSONObjectForType(NodeData.class, new URI(url), HttpStatus.OK);
	}

	public AttributeData getAttributes(String resourceId) throws Exception {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = SERVER_URI + "attributes?resource=" + resourceId;
		return getJSONObjectForType(AttributeData.class, new URI(url), HttpStatus.OK);
	}

	public CapabilityData getCapabilities(String resourceId) throws Exception {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = SERVER_URI + "capabilities?resource=" + resourceId;
		return getJSONObjectForType(CapabilityData.class, new URI(url), HttpStatus.OK);
	}

	public InterfaceData getInterfaces(String resourceId) throws Exception {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = SERVER_URI + "interfaces?resource=" + resourceId;
		return getJSONObjectForType(InterfaceData.class, new URI(url), HttpStatus.OK);
	}

	public PropertyData getProperties(String resourceId) throws Exception {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = SERVER_URI + "properties?resource=" + resourceId;
		return getJSONObjectForType(PropertyData.class, new URI(url), HttpStatus.OK);
	}

	public RequirementData getRequirements(String resourceId) throws Exception {
		Assert.notNull(resourceId, "Pass a not null resourceId");
		String url = SERVER_URI + "requirements?resource=" + resourceId;
		return getJSONObjectForType(RequirementData.class, new URI(url), HttpStatus.OK);
	}

	public ValidRequirementNodeData getValidRequirementNodes(String requirementId, String nodeType) throws Exception {
		Assert.notNull(requirementId, "Pass a not null requirementId");
		Assert.notNull(nodeType, "Pass a not null nodeType");
		String url = SERVER_URI + "valid-requirement-nodes?requirement=" + requirementId + "&nodeType=" + nodeType;
		return getJSONObjectForType(ValidRequirementNodeData.class, new URI(url), HttpStatus.OK);
	}

	@Override
	public KBSaveReportData saveAADM(String aadmTTL, String submissionId) throws Exception{
		Assert.isTrue(!aadmTTL.isEmpty(), "Turtle content for AADM can neither be null nor empty");
		Assert.isTrue(!submissionId.isEmpty(), "SubmissionId can neither be null nor empty");
		String url = SERVER_URI + "saveAADM";

		MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();

		//AADM TTL
		map.add("aadmTTL", aadmTTL);
		
		//AADM TTL
		map.add("submissionId", submissionId);
		
		KBSaveReportData report = new KBSaveReportData();
		try {
			//Send multipart-form message
			String result = sendFormURLEncodedMessage(new URI(url), String.class, map, HttpMethod.POST);
			report.setIRI (result);
		}catch (Exception ex) {
			if (ex instanceof HttpClientErrorException) {
				HttpClientErrorException hcee = (HttpClientErrorException) ex;
				if (((HttpClientErrorException) ex).getStatusCode() == HttpStatus.BAD_REQUEST) {
					//TODO Process errors
					String result = hcee.getResponseBodyAsString();
					String json = result.substring(result.indexOf(":") + 1);
					report.setErrors(processErrors (json));
				}else {
					throw ex;
				}
			}
		}
		
		return report;
	}

	private List<KBError> processErrors(String json) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		List<KBError> errors = mapper.readValue(json, new TypeReference<List<KBError>>(){});
		return errors;
	}

	/**
	 * Send GET message to uri, accepting an object of class clazz in JSON
	 * representation
	 * 
	 * @param uri   URI of GET message
	 * @param clazz Class representing returned object
	 */
	private <T> ResponseEntity<T> getJSONMessage(URI uri, Class<T> clazz) throws RestClientException {
		RequestEntity<T> request = (RequestEntity<T>) RequestEntity.get(uri).accept(MediaType.APPLICATION_JSON).build();
		return restTemplate.exchange(request, clazz);

	}


	private <T> T getJSONObjectForType(Class<T> type, URI uri, HttpStatus expectedStatus) {
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
	
	private <T> T sendFormURLEncodedMessage(URI uri, Class<T> returnType, MultiValueMap<String, Object> parts, HttpMethod method) throws HttpStatusCodeException{
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
		HttpEntity<MultiValueMap<String, Object>> entity = new HttpEntity<>(parts, headers);
		ResponseEntity<T> response = exchange(uri, method, entity, returnType);

		return response.getBody();
	}

	private <T> ResponseEntity<T> exchange(URI uri, HttpMethod method,
			HttpEntity<MultiValueMap<String, Object>> requestEntity, Class<T> clazz) {
		return restTemplate.exchange(uri, method, requestEntity, clazz);
	}

}
