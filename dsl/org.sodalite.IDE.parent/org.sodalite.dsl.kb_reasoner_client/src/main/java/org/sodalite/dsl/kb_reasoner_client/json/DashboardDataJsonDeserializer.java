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
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.sodalite.dsl.kb_reasoner_client.types.DashboardData;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DashboardDataJsonDeserializer extends JsonDeserializer<DashboardData> {
	private static final ObjectMapper mapper = new ObjectMapper();
	protected DashboardData dd = new DashboardData();

	@Override
	public DashboardData deserialize(JsonParser jsonParser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		ObjectNode node = mapper.readTree(jsonParser);
		if (node instanceof ObjectNode) {
			ObjectNode objectNode = (ObjectNode) node;
			Iterator<Entry<String, JsonNode>> iter = objectNode.fields();
			while (iter.hasNext()) {
				Map.Entry<String, JsonNode> entry = iter.next();
				dd.getDashboard().put(entry.getKey(), entry.getValue().asText());
			}
		}
		return dd;
	}
}
