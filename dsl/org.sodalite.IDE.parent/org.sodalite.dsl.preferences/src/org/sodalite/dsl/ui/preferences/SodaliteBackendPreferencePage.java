package org.sodalite.dsl.ui.preferences;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.*;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.ui.IWorkbench;

/**
 * This class represents a preference page that
 * is contributed to the Preferences dialog. By 
 * subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows
 * us to create a page that is small and knows how to 
 * save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They
 * are stored in the preference store that belongs to
 * the main plug-in class. That way, preferences can
 * be accessed directly via the preference store.
 */

public class SodaliteBackendPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {

	public SodaliteBackendPreferencePage() {
		super(GRID);
	}
	
	
	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 * of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {
		addField(
			new StringFieldEditor(PreferenceConstants.KB_REASONER_URI, "KB Reasoner URI:", getFieldEditorParent()));
		addField(
				new StringFieldEditor(PreferenceConstants.IaC_URI, "IaC URI:", getFieldEditorParent()));
		addField(
				new StringFieldEditor(PreferenceConstants.xOPERA_URI, "xOPERA URI:", getFieldEditorParent()));
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		setPreferenceStore(new ScopedPreferenceStore(
				InstanceScope.INSTANCE, "org.sodalite.dsl.AADM.ui"));
		setDescription("Sodalite Backend configuration");
	}
	
}