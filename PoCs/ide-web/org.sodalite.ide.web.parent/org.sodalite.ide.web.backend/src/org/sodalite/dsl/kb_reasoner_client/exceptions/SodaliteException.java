package org.sodalite.dsl.kb_reasoner_client.exceptions;

public class SodaliteException extends Exception {

	public SodaliteException(Exception ex) {
		super(ex);
	}

	public SodaliteException(String message) {
		super(message);
	}
}
