package org.sodalite.dsl.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class UserAccountPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public UserAccountPreferencePage() {
		super(GRID);
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common GUI
	 * blocks needed to manipulate various types of preferences. Each field editor
	 * knows how to save and restore itself.
	 */
	public void createFieldEditors() {
		addField(new BooleanFieldEditor(PreferenceConstants.KEYCLOAK_ENABLED, "Enable IAM", getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.KEYCLOAK_URI, "Keycloak URI:", getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.KEYCLOAK_USER, "User:", getFieldEditorParent()));
		StringFieldEditor passwordField = new StringFieldEditor(PreferenceConstants.KEYCLOAK_PASSWORD, "Password:",
				getFieldEditorParent());
		passwordField.getTextControl(getFieldEditorParent()).setEchoChar('*');
		addField(passwordField);
		addField(new StringFieldEditor(PreferenceConstants.KEYCLOAK_CLIENT_ID, "Client ID:", getFieldEditorParent()));
		StringFieldEditor secretField = new StringFieldEditor(PreferenceConstants.KEYCLOAK_CLIENT_SECRET,
				"Client Secret:", getFieldEditorParent());
		secretField.getTextControl(getFieldEditorParent()).setEchoChar('*');
		addField(secretField);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Sodalite User Account configuration");
	}

}