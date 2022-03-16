package org.sodalite.dsl.ansible.exceptions;

import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;

public class MongoDBNotFound extends SodaliteException {

	public MongoDBNotFound(String message) {
		super(message);
	}
	
}
