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
package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.List;

import org.sodalite.dsl.kb_reasoner_client.json.CapabilityJsonDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = CapabilityJsonDeserializer.class)
public class Capability extends KBEntity{
	SuperType type;
	List<String> valid_source_types;

	public SuperType getType() {
		return type;
	}
	public void setType(SuperType type) {
		this.type = type;
	}
	public List<String> getValid_source_types() {
		return valid_source_types;
	}
	public void setValid_source_types(List<String> valid_source_types) {
		this.valid_source_types = valid_source_types;
	} 
}
