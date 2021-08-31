package org.sodalite.dsl.ui.preferences.secrets;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;

/**
 * Code snippets taken from org.eclipse.ui.internal.net.NonProxyHostsComposite
 * 
 * @author yosu
 *
 */
public class SecretsComposite extends Composite {
	CheckboxTableViewer secretsViewer;
	Button addButton;
	Button editButton;
	Button removeButton;
	private ArrayList<SecretData> secrets = new ArrayList<>();

	SecretsComposite(Composite parent, int style) {
		super(parent, style);
		createWidgets();
	}

	protected void createWidgets() {
		setLayout(new GridLayout(2, false));

		Label secretsLabel = new Label(this, SWT.NONE);
		secretsLabel.setText("User's secrets:");
		secretsLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 2, 1));

		Table secretsTable = new Table(this,
				SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI | SWT.FULL_SELECTION | SWT.CHECK);
		secretsTable.setHeaderVisible(true);
		secretsTable.setLinesVisible(true);
		secretsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));

		secretsViewer = new CheckboxTableViewer(secretsTable);
		SecretsLabelProvider labelProvider = new SecretsLabelProvider();
		SecretsContentProvider contentProvider = new SecretsContentProvider();
		labelProvider.createColumns(secretsViewer);
		secretsViewer.setContentProvider(contentProvider);
		secretsViewer.setLabelProvider(labelProvider);

		TableLayout tableLayout = new TableLayout();
		tableLayout.addColumnData(new ColumnPixelData(24));
		tableLayout.addColumnData(new ColumnWeightData(50, 50, true));
		tableLayout.addColumnData(new ColumnWeightData(50, 50, true));
		secretsTable.setLayout(tableLayout);

		addButton = createButton("Add secret ...");
		editButton = createButton("Edit secret ...");
		removeButton = createButton("Delete secret");

		addButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addSecret();
			}
		});
		editButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				editSecret();
			}
		});
		removeButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeSecret();
			}
		});

		initializeValues();
	}

	public void initializeValues() {
		// TODO Read user's secrets from Value
		secrets.add(new SecretData("hpc", "sodalite-fe.hlrs.de"));
		secrets.add(new SecretData("ssh_user", "yosu"));
		secrets.add(new SecretData("ssh_password", "my_password"));
		secrets.add(new SecretData("ssh_pkey", "my key"));

		secretsViewer.setInput(secrets);
	}

	protected void addSecret() {
		SecretDialog dialog = new SecretDialog(getShell(), null);
		if (dialog.open() != Window.CANCEL) {
			secrets.add(dialog.getSecret());
		}
		secretsViewer.refresh();
	}

	protected void editSecret() {
		IStructuredSelection selection = secretsViewer.getStructuredSelection();
		@SuppressWarnings("unchecked")
		SecretData secret = (SecretData) selection.iterator().next();

		SecretDialog dialog = new SecretDialog(getShell(), secret);
		if (dialog.open() != Window.CANCEL) {
			secret.setKey(dialog.getSecret().getKey());
			secret.setValue(dialog.getSecret().getValue());
		}
		secretsViewer.refresh();
	}

	protected void removeSecret() {
		IStructuredSelection selection = secretsViewer.getStructuredSelection();
		Iterator<?> it = selection.iterator();
		while (it.hasNext()) {
			SecretData data = (SecretData) it.next();
			secrets.remove(data);
		}
		secretsViewer.refresh();
	}

	private Button createButton(String message) {
		Button button = new Button(this, SWT.PUSH);
		button.setText(message);
		button.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		return button;
	}

}
