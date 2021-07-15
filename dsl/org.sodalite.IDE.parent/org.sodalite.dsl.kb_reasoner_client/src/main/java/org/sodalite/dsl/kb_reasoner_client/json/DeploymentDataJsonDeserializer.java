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
package org.sodalite.dsl.kb_reasoner_client.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.sodalite.dsl.kb_reasoner_client.types.Deployment;
import org.sodalite.dsl.kb_reasoner_client.types.DeploymentData;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class DeploymentDataJsonDeserializer extends JsonDeserializer<ReasonerData<Deployment>> {
	private static final ObjectMapper mapper = new ObjectMapper();
	protected DeploymentData dd = new DeploymentData();
	protected JavaType deploymentType;

	@Override
	public DeploymentData deserialize(JsonParser jsonParser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		JsonNode arrayNode = mapper.readTree(jsonParser);
		List<Deployment> deployments = new ArrayList<>();
		this.deploymentType = TypeFactory.defaultInstance().constructType(Deployment.class);

		if (null == arrayNode // if no data node could be found
				|| !arrayNode.isArray() // or data node is not an array
				|| !arrayNode.elements().hasNext()) { // or data node doesn't contain any entry
			deployments.add(mapper.readerFor(deploymentType).readValue(arrayNode));
		} else {
			arrayNode.forEach(bp -> {
				try {
					Deployment deployment = mapper.readerFor(deploymentType).readValue(bp);
					if (!deployments.contains(deployment))
						deployments.add(deployment);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
		dd.setElements(deployments);
		return dd;
	}
}
