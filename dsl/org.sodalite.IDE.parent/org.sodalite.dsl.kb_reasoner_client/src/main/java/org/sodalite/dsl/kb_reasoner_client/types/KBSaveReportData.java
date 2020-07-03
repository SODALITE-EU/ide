package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.List;

public class KBSaveReportData {

	String URI;
	List<KBError> errors;
	List<KBWarning> warnings;
	List<KBSuggestion> suggestions;
	
	public String getURI() {
		return URI;
	}
	public void setURI(String uRI) {
		URI = uRI;
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
	
	public boolean hasSuggestions() {
		return this.suggestions!= null && !this.suggestions.isEmpty();
	}
	public List<KBSuggestion> getSuggestions(){
		return this.suggestions;
	}
	public void setSuggestions (List<KBSuggestion> suggestions) {
		this.suggestions = suggestions;
	}
	
}
