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

import org.sodalite.dsl.kb_reasoner_client.types.ModuleData;
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class StringDataJsonDeserializer extends JsonDeserializer<ReasonerData<String>> {
	private static final String DATA = "data";
	private static final ObjectMapper mapper = new ObjectMapper();
	protected JavaType nodeType;
	protected ReasonerData<String> rd;

	public StringDataJsonDeserializer() {
		this.nodeType = TypeFactory.defaultInstance().constructType(String.class);
		this.rd = new ModuleData();
	}

	@Override
	public ReasonerData<String> deserialize(JsonParser jsonParser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		ObjectNode objectNode = mapper.readTree(jsonParser);
		JsonNode nodeData = objectNode.get(DATA);

		if (null == nodeData // if no data node could be found
				|| !nodeData.isArray() // or data node is not an array
				|| !nodeData.elements().hasNext()) // or data node doesn't contain any entry
			return null;

		List<String> nodes = new ArrayList<>();
		nodeData.forEach(node -> {
			nodes.add(node.asText());
		});
		rd.setElements(nodes);
		return rd;
	}
}
