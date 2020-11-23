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

import org.sodalite.dsl.kb_reasoner_client.types.InterfaceAssignment;
import org.sodalite.dsl.kb_reasoner_client.types.SuperType;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class InterfaceAssignmentJsonDeserializer extends JsonDeserializer<InterfaceAssignment> {
	private static final ObjectMapper mapper = new ObjectMapper();
	protected JavaType nodeType;

	@Override
	public InterfaceAssignment deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		JsonNode jsonnode = mapper.readTree(jsonParser);

		if (!(jsonnode instanceof ObjectNode))
			return null;

		ObjectNode objectNode = (ObjectNode) jsonnode;
		InterfaceAssignment inter = new InterfaceAssignment();

		JavaType javaType = TypeFactory.defaultInstance().constructType(SuperType.class);
		if (objectNode.get("value") != null) {
			JsonNode value = objectNode.get("value");

			if (value.get("label") != null) {
				inter.setId(value.get("label").asText());
			}
		}
		return inter;
	}
}
