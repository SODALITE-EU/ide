package org.sodalite.dsl.kb_reasoner_client.types;

import java.util.List;

public class KBOptimizationReportData {
	String URI;
	List<? extends KBError> errors;
	List<KBWarning> warnings;
	List<KBOptimization> optimizations;
	
	public String getURI() {
		return URI;
	}
	public void setURI(String uRI) {
		URI = uRI;
	}
	
	public boolean hasErrors() {
		return this.errors!= null && !this.errors.isEmpty();
	}
	public List<? extends KBError> getErrors(){
		return this.errors;
	}
	public void setErrors (List<? extends KBError> errors) {
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
	
	public boolean hasOptimizations() {
		return this.optimizations!= null && !this.optimizations.isEmpty();
	}
	public List<KBOptimization> getOptimizations(){
		return this.optimizations;
	}
	public void setOptimizations (List<KBOptimization> optimizations) {
		this.optimizations = optimizations;
	}
	
}
