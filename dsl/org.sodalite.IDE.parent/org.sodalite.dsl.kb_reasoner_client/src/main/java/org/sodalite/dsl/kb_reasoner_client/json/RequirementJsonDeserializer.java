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

import org.sodalite.dsl.kb_reasoner_client.types.Occurrences;
import org.sodalite.dsl.kb_reasoner_client.types.Property;
import org.sodalite.dsl.kb_reasoner_client.types.Requirement;
import org.sodalite.dsl.kb_reasoner_client.types.Type;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class RequirementJsonDeserializer extends JsonDeserializer<Requirement> {
    private static final ObjectMapper mapper = new ObjectMapper();
    protected JavaType nodeType;

	@Override
	public Requirement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
        JsonNode jsonNode = mapper.readTree(jsonParser);
    	
    	if (! (jsonNode instanceof ObjectNode))
    		return null;
    	
        ObjectNode objectNode = (ObjectNode) jsonNode;
        Requirement requirement = new Requirement();
		
		JavaType typeType = TypeFactory.defaultInstance().constructType(Type.class);
		JavaType occurrencesType = TypeFactory.defaultInstance().constructType(Occurrences.class);
		
		if (objectNode.get("specification") != null) {
			JsonNode spec = objectNode.get("specification");
			if (spec.get("node")!=null) {
				Type node = mapper.readerFor(typeType).readValue(spec.get("node"));
				requirement.setNode(node);
			}
			if (spec.get("relationship")!=null) {
				Type relationship = mapper.readerFor(typeType).readValue(spec.get("relationship"));
				requirement.setRelationship(relationship);
			}
			if (spec.get("capability")!=null) {
				Type capability = mapper.readerFor(typeType).readValue(spec.get("capability"));
				requirement.setCapability(capability);
			}
			if (spec.get("occurrences")!=null) {
				Occurrences occurrences = mapper.readerFor(occurrencesType).readValue(spec.get("occurrences"));
				requirement.setOccurrences(occurrences);
			}
		}
        
        return requirement;
	}

}
