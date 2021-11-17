package org.sodalite.dsl.ui.preferences.hpc_secrets;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.sodalite.dsl.kb_reasoner_client.types.HPCSecretData;

public class HPCSecretDialog extends Dialog {
	protected HPCSecretData secret;
	protected boolean isEdit = false;
	protected Text hpcTextfield;
	protected Text ssh_userTextfield;
	protected Text ssh_passwordTextfield;
	protected Text ssh_pkeyTextfield;
	private Button okButton;

	interface StringModifyListener {
		public void valueChanged(String s);
	}

	protected HPCSecretDialog(Shell shell, HPCSecretData secret) {
		super(shell);
		setShellStyle(getShellStyle() | SWT.RESIZE);
		if (secret != null) {
			this.secret = new HPCSecretData(secret.getSecrets());
			isEdit = true;
		} else {
			this.secret = new HPCSecretData();
		}
	}

	public HPCSecretData getSecret() {
		return secret;
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);

		if (isEdit)
			shell.setText("Edit HPC infrastructure's secrets");
		else
			shell.setText("Add HPC infrastructure's secrets");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Font font = parent.getFont();
		Composite composite = (Composite) super.createDialogArea(parent);
		((GridLayout) composite.getLayout()).numColumns = 2;
		composite.setFont(font);

		HPCSecretDialog.createLabel(composite, "host:").setFont(font);
		hpcTextfield = createText(composite, secret.getSecrets().get("ssh_host"), s -> {
			secret.getSecrets().put("ssh_host", s);
			validateFields();
		}, false);
		hpcTextfield.setFont(font);

		HPCSecretDialog.createLabel(composite, "user:").setFont(font);
		ssh_userTextfield = createText(composite, secret.getSecrets().get("ssh_user"), s -> {
			secret.getSecrets().put("ssh_user", s);
			validateFields();
		}, false);
		ssh_userTextfield.setFont(font);

		HPCSecretDialog.createLabel(composite, "password:").setFont(font);
		ssh_passwordTextfield = createText(composite, secret.getSecrets().get("ssh_password"), s -> {
			secret.getSecrets().put("ssh_password", s);
			validateFields();
		}, false);
		ssh_passwordTextfield.setFont(font);

		HPCSecretDialog.createLabel(composite, "private key:").setFont(font);
		ssh_pkeyTextfield = createText(composite, secret.getSecrets().get("ssh_pkey"), s -> {
			secret.getSecrets().put("ssh_pkey", s);
			validateFields();
		}, false);
		ssh_pkeyTextfield.setFont(font);

		return composite;
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		Control buttonControl = super.createButtonBar(parent);
		validateFields();
		return buttonControl;
	}

	protected void validateFields() {
		boolean valid = true;

		String hpc = hpcTextfield.getText();
		if (hpc == null || hpc.trim().length() < 1)
			valid = false;

		String ssh_user = ssh_userTextfield.getText();
		if (ssh_user == null || ssh_user.trim().length() < 1)
			valid = false;

		setOKButtonEnabled(valid);
	}

	private void setOKButtonEnabled(boolean curIsEnabled) {
		if (okButton == null)
			okButton = getButton(IDialogConstants.OK_ID);

		if (okButton != null)
			okButton.setEnabled(curIsEnabled);
	}

	public static Label createLabel(Composite comp, String text) {
		Label label = new Label(comp, SWT.NONE);
		label.setText(text);
		label.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING));
		return label;
	}

	protected Text createText(Composite comp, String txt, final StringModifyListener listener, boolean multiLine) {
		int style = SWT.BORDER;
		if (multiLine) {
			style = SWT.BORDER | SWT.V_SCROLL | SWT.MULTI | SWT.WRAP;
		}
		final Text text = new Text(comp, style);
		if (multiLine) {
			text.addTraverseListener(event -> {
				switch (event.detail) {
				case SWT.TRAVERSE_RETURN:
				case SWT.TRAVERSE_TAB_NEXT:
				case SWT.TRAVERSE_TAB_PREVIOUS:
					event.doit = true;
					break;
				}
			});
		}
		// final Text text = SWTUtil.createMultilineText(comp, style);
		if (txt != null)
			text.setText(txt);

		GridData data = new GridData(SWT.FILL, SWT.CENTER, true, false);
		data.widthHint = 450;

		if (multiLine) { // then expand this control as the dialog resizes
			data.verticalAlignment = SWT.FILL;
			data.grabExcessVerticalSpace = true;
			data.heightHint = convertHeightInCharsToPixels(4);
		}

		text.setLayoutData(data);
		if (listener != null)
			text.addModifyListener(e -> listener.valueChanged(text.getText()));
		return text;
	}

}
