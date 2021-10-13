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

import org.sodalite.dsl.kb_reasoner_client.types.OperationDefinition;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class OperationDefinitionJsonDeserializer extends JsonDeserializer<OperationDefinition> {
	private static final ObjectMapper mapper = new ObjectMapper();
	protected JavaType nodeType;

	@Override
	public OperationDefinition deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		JsonNode node = mapper.readTree(jsonParser);

		if (!(node instanceof ObjectNode))
			return null;

		ObjectNode objectNode = (ObjectNode) node;
		OperationDefinition operation = new OperationDefinition();

		if (objectNode.get("description") != null) {
			String description = objectNode.get("description").asText();
			operation.setDescription(description);
		}

		if (objectNode.get("definedIn") != null)
			operation.setDefinedIn(objectNode.get("definedIn").asText());

		return operation;
	}
}
