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

import org.sodalite.dsl.kb_reasoner_client.types.RequirementAssignment;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class RequirementAssignmentJsonDeserializer extends JsonDeserializer<RequirementAssignment> {
	private static final ObjectMapper mapper = new ObjectMapper();
	protected JavaType nodeType;

	@Override
	public RequirementAssignment deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		JsonNode jsonNode = mapper.readTree(jsonParser);

		if (!(jsonNode instanceof ObjectNode))
			return null;

		ObjectNode objectNode = (ObjectNode) jsonNode;
		RequirementAssignment requirement = new RequirementAssignment();

		if (objectNode.get("value") != null) {
			JsonNode value = objectNode.get("value");

			String key = ((ObjectNode) value).fields().next().getKey();
			JsonNode node = ((ObjectNode) value).get(key);
			if (node.get("label") != null) {
				requirement.setNode(node.get("label").asText());
			}

			if (value.get("label") != null) {
				requirement.setId(value.get("label").asText());
			}
		}

		return requirement;
	}

}
