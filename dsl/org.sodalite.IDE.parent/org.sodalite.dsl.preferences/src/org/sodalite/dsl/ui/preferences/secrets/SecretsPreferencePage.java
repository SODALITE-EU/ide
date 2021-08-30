package org.sodalite.dsl.ui.preferences.secrets;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;

public class SecretsPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
	StringFieldEditor vaultURLEditor;
	SecretsComposite secretsComposite;

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Sodalite Secrets");
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		composite.setLayout(layout);

		createVaultComposite(composite);
		createSecretsComposite(composite);

		return composite;
	}

	private void createVaultComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		vaultURLEditor = new StringFieldEditor(PreferenceConstants.VAULT_URI, "VAULT URL:", composite);
		vaultURLEditor.setPreferenceStore(getPreferenceStore());
		vaultURLEditor.load();
		vaultURLEditor.setPropertyChangeListener(event -> {
			if (event.getProperty().equals(FieldEditor.IS_VALID)) {
				setValid(vaultURLEditor.isValid());
			}
		});
	}

	private void createSecretsComposite(Composite parent) {
		secretsComposite = new SecretsComposite(parent, SWT.NONE);
		secretsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}

}