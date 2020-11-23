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

import org.sodalite.dsl.kb_reasoner_client.json.RequirementDefinitionJsonDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = RequirementDefinitionJsonDeserializer.class)
public class RequirementDefinition extends KBEntity{
	SuperType node;
	SuperType relationship; 
	SuperType capability;
	Occurrences occurrences;
	
	public SuperType getNode() {
		return node;
	}
	public void setNode(SuperType node) {
		this.node = node;
	}
	public SuperType getRelationship() {
		return relationship;
	}
	public void setRelationship(SuperType relationship) {
		this.relationship = relationship;
	}
	public SuperType getCapability() {
		return capability;
	}
	public void setCapability(SuperType capability) {
		this.capability = capability;
	}
	public Occurrences getOccurrences() {
		return occurrences;
	}
	public void setOccurrences(Occurrences occurrences) {
		this.occurrences = occurrences;
	}
}
