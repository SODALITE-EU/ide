package org.sodalite.dsl.ui.validation;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

public class AADMDiagnostic implements Diagnostic {

	private String message;
	private String location;
	private int line;
	private int column;

	public AADMDiagnostic(String message, String location, int line, int column) {
		this.message = message;
		this.location = location;
		this.line = line;
		this.column = column;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public int getLine() {
		return line;
	}

	@Override
	public int getColumn() {
		return column;
	}

	@Override
	public boolean equals (Object o) {
		AADMDiagnostic diag = (AADMDiagnostic)o;
		return (this.getLine() == diag.getLine()) &&
				(this.getColumn() == diag.getColumn()) &&
				(this.getMessage() == diag.getMessage());
	}
	
}