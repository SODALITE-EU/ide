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
import java.util.ArrayList;
import java.util.List;

import org.sodalite.dsl.kb_reasoner_client.types.AttributeAssignment;
import org.sodalite.dsl.kb_reasoner_client.types.AttributeAssignmentData;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class AttributeAssignmentDataJsonDeserializer extends JsonDeserializer<AttributeAssignmentData> {
	private static final String DATA = "data";
	private static final ObjectMapper mapper = new ObjectMapper();

	@Override
	public AttributeAssignmentData deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
		ObjectNode objectNode = mapper.readTree(jsonParser);
		JsonNode nodeData = objectNode.get(DATA);

		AttributeAssignmentData aad = new AttributeAssignmentData();

		if (null == nodeData // if no data node could be found
				|| !nodeData.isArray() // or data node is not an array
				|| !nodeData.elements().hasNext()) // or data node doesn't contain any entry
			return null;

		List<AttributeAssignment> attrs = new ArrayList<>();
		nodeData.forEach(prop -> {
			try {
				AttributeAssignment attr = new AttributeAssignment();
				attr.setId(prop.asText());
				attr.setUri(new URI(attr.getId()));

				if (!attrs.contains(attr))
					attrs.add(attr);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
		});
		aad.setElements(attrs);
		return aad;
	}
}
