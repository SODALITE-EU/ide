package org.sodalite.dsl.ui.preferences.secrets;

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

public class SecretDialog extends Dialog {
	protected SecretData secret;
	protected boolean isEdit = false;
	protected Text keyTextfield;
	protected Text valueTextfield;
	private Button okButton;

	interface StringModifyListener {
		public void valueChanged(String s);
	}

	protected SecretDialog(Shell shell, SecretData secret) {
		super(shell);
		setShellStyle(getShellStyle() | SWT.RESIZE);
		if (secret != null) {
			this.secret = new SecretData(secret.getKey(), secret.getValue());
			;
			isEdit = true;
		} else {
			this.secret = new SecretData(null, null);
		}
	}

	public SecretData getSecret() {
		return secret;
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);

		if (isEdit)
			shell.setText("Edit user's secret");
		else
			shell.setText("Add user's secret");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Font font = parent.getFont();
		Composite composite = (Composite) super.createDialogArea(parent);
		((GridLayout) composite.getLayout()).numColumns = 2;
		composite.setFont(font);

		SecretDialog.createLabel(composite, "Key:").setFont(font);
		keyTextfield = createText(composite, secret.getKey(), s -> {
			secret.setKey(s);
			validateFields();
		}, false);
		keyTextfield.setFont(font);

		SecretDialog.createLabel(composite, "Value:").setFont(font);
		valueTextfield = createText(composite, secret.getValue(), s -> {
			secret.setValue(s);
			validateFields();
		}, false);
		valueTextfield.setFont(font);

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

		String key = keyTextfield.getText();
		if (key == null || key.trim().length() < 1)
			valid = false;

		String value = valueTextfield.getText();
		if (value == null || value.trim().length() < 1)
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
