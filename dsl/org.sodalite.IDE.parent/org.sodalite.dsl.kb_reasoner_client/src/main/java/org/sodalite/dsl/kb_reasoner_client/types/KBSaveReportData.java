package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.List;

public class KBSaveReportData {

	String IRI;
	List<KBError> errors;
	
	public String getIRI() {
		return IRI;
	}
	public void setIRI(String iRI) {
		IRI = iRI;
	}
	
	public boolean hasErrors() {
		return this.errors!= null && !this.errors.isEmpty();
	}
	public List<KBError> getErrors(){
		return this.errors;
	}
	public void setErrors (List<KBError> errors) {
		this.errors = errors;
	}
	
}
