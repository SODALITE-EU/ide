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
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map.Entry;

import org.sodalite.dsl.kb_reasoner_client.types.SuperType;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class SuperTypeJsonDeserializer extends JsonDeserializer<SuperType> {
	private static final ObjectMapper mapper = new ObjectMapper();
	protected JavaType nodeType;
	protected SuperType type;

	@Override
	public SuperType deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		JsonNode node = mapper.readTree(jsonParser);

		if (!(node instanceof ObjectNode))
			return null;

		ObjectNode objectNode = (ObjectNode) node;
		SuperType type = null;
		try {
			type = new SuperType();
			if (objectNode.fields().hasNext()) {
				Entry<String, JsonNode> entry = objectNode.fields().next();
				if (entry.getKey() != null) {
					type.setUri(new URI(entry.getKey()));
				}
				if (entry.getValue() != null && entry.getValue().get("label") != null) {
					type.setLabel(entry.getValue().get("label").asText());
				}
				if (entry.getValue() != null && entry.getValue().get("namespace") != null)
					type.setModule(entry.getValue().get("namespace").asText());
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		return type;
	}

}
