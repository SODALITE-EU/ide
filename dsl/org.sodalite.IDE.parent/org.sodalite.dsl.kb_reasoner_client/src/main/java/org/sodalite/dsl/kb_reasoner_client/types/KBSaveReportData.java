package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.List;

public class KBSaveReportData {

	String IRI;
	List<KBError> errors;
	List<KBWarning> warnings;
	
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
	
	public boolean hasWarnings() {
		return this.warnings!= null && !this.warnings.isEmpty();
	}
	public List<KBWarning> getWarnings(){
		return this.warnings;
	}
	public void setWarnings (List<KBWarning> warnings) {
		this.warnings = warnings;
	}
	
}
