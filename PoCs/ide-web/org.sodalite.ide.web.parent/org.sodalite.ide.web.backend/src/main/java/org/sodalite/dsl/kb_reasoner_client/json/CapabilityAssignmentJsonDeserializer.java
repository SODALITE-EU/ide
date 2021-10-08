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
import java.util.StringTokenizer;

import org.sodalite.dsl.kb_reasoner_client.types.CapabilityAssignment;
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

public class CapabilityAssignmentJsonDeserializer extends JsonDeserializer<CapabilityAssignment> {
	private static final ObjectMapper mapper = new ObjectMapper();
	protected JavaType nodeType;

	@Override
	public CapabilityAssignment deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		JsonNode jsonNode = mapper.readTree(jsonParser);

		if (!(jsonNode instanceof ObjectNode))
			return null;

		ObjectNode objectNode = (ObjectNode) jsonNode;
		CapabilityAssignment capability = new CapabilityAssignment();

		JavaType javaType = TypeFactory.defaultInstance().constructType(SuperType.class);

		if (objectNode.get("value") != null) {
			JsonNode value = objectNode.get("value");

			if (value.get("label") != null) {
				capability.setId(value.get("label").asText());
			}
		}
		return capability;
	}

	private List<String> getList(String valid_source_types_string) {
		List<String> l = new ArrayList<String>();
		if (valid_source_types_string.isEmpty())
			return l;
		StringTokenizer st = new StringTokenizer(
				valid_source_types_string.substring(1, valid_source_types_string.length() - 1), ",");
		while (st.hasMoreElements())
			l.add(st.nextToken());
		return l;
	}

}
