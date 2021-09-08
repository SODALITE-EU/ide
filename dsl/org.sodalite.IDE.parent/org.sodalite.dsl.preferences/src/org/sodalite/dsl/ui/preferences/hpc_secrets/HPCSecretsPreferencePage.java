package org.sodalite.dsl.ui.preferences.hpc_secrets;

import java.util.ArrayList;

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
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.kb_reasoner_client.types.HPCSecretData;
import org.sodalite.dsl.ui.preferences.Activator;
import org.sodalite.dsl.ui.preferences.PreferenceConstants;
import org.sodalite.ide.ui.backend.SodaliteBackendProxy;
import org.sodalite.ide.ui.logger.SodaliteLogger;

public class HPCSecretsPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
	StringFieldEditor vaultURLEditor;
	HPCSecretsComposite secretsComposite;

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Sodalite HPC Infrastructures' secrets");
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		composite.setLayout(layout);

		createVaultComposite(composite);
		try {
			createSecretsComposite(composite);
		} catch (Exception e) {
			SodaliteLogger.log(e);
		}

		return composite;
	}

	private void createVaultComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		vaultURLEditor = new StringFieldEditor(PreferenceConstants.VAULT_SECRET_UPLOADER_URI,
				"VAULT Secret Uploader URL:", composite);
		vaultURLEditor.setPreferenceStore(getPreferenceStore());
		vaultURLEditor.load();
		vaultURLEditor.setPropertyChangeListener(event -> {
			if (event.getProperty().equals(FieldEditor.IS_VALID)) {
				setValid(vaultURLEditor.isValid());
			}
		});
	}

	private void createSecretsComposite(Composite parent) throws SodaliteException, Exception {
		secretsComposite = new HPCSecretsComposite(parent, SWT.NONE);
		secretsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}

	@Override
	public boolean performCancel() {
		// Reset list of HPCs
		secretsComposite.resetHpcs();
		return super.performCancel();
	}

	@Override
	protected void performDefaults() {
		try {
			secretsComposite.initializeValues();
		} catch (Exception e) {
			SodaliteLogger.log(e);
		}
		super.performDefaults();
	}

	@Override
	public boolean performOk() {
		// Add HPCS to create
		ArrayList<HPCSecretData> hpcsToAdd = secretsComposite.getHpcsToAdd();
		for (HPCSecretData hpc : hpcsToAdd) {
			try {
				SodaliteBackendProxy.getKBReasoner().addHPCSecrets(hpc);
			} catch (Exception e) {
				SodaliteLogger.log(e);
			}
		}
		hpcsToAdd.clear();
		// Delete HPCS to remove
		ArrayList<HPCSecretData> hpcsToRemove = secretsComposite.getHpcsToRemove();
		for (HPCSecretData hpc : hpcsToRemove) {
			try {
				SodaliteBackendProxy.getKBReasoner().deleteHPCInfrastructure(hpc.getName());
			} catch (Exception e) {
				SodaliteLogger.log(e);
			}
		}
		hpcsToRemove.clear();
		return super.performOk();
	}

}