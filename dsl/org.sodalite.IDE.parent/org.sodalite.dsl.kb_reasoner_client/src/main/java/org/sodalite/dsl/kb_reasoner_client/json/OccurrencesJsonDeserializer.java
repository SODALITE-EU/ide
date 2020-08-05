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

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OccurrencesJsonDeserializer extends JsonDeserializer<Occurrences> {
    private static final ObjectMapper mapper = new ObjectMapper();
    protected JavaType nodeType;

	@Override
	public Occurrences deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
			throws IOException, JsonProcessingException {
        JsonNode jsonNode = mapper.readTree(jsonParser);
        
        if (null == jsonNode                     // if no data node could be found
                || !jsonNode.isArray()           // or data node is not an array
                || !jsonNode.elements().hasNext())   // or data node doesn't contain any entry
            return null;
    	
        Occurrences occurrences = new Occurrences();
        
        if (jsonNode.get(0).isTextual())
        	occurrences.setMin(jsonNode.get(0).asText());
        if (jsonNode.get(1).isTextual())
        	occurrences.setMax(jsonNode.get(1).asText());
        return occurrences;
	}

}
