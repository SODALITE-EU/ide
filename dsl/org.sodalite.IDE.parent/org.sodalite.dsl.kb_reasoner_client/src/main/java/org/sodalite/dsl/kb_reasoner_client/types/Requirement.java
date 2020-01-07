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

import org.sodalite.dsl.kb_reasoner_client.json.RequirementJsonDeserializer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = RequirementJsonDeserializer.class)
public class Requirement extends KBEntity{
	Type node;
	Type relationship; 
	Type capability;
	Occurrences occurrences;
	
	public Type getNode() {
		return node;
	}
	public void setNode(Type node) {
		this.node = node;
	}
	public Type getRelationship() {
		return relationship;
	}
	public void setRelationship(Type relationship) {
		this.relationship = relationship;
	}
	public Type getCapability() {
		return capability;
	}
	public void setCapability(Type capability) {
		this.capability = capability;
	}
	public Occurrences getOccurrences() {
		return occurrences;
	}
	public void setOccurrences(Occurrences occurrences) {
		this.occurrences = occurrences;
	}
}
