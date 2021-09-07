package org.sodalite.dsl.ui.preferences.hpc_secrets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
public class HPCSecretsComposite extends Composite {
	CheckboxTableViewer secretsViewer;
	Button addButton;
	Button editButton;
	Button removeButton;
	private ArrayList<HPCSecretData> hpcs = new ArrayList<>();

	HPCSecretsComposite(Composite parent, int style) {
		super(parent, style);
		createWidgets();
	}

	protected void createWidgets() {
		setLayout(new GridLayout(2, false));

		Label secretsLabel = new Label(this, SWT.NONE);
		secretsLabel.setText("HPC Infrastructures' secrets:");
		secretsLabel.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 2, 1));

		Table secretsTable = new Table(this,
				SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI | SWT.FULL_SELECTION | SWT.CHECK);
		secretsTable.setHeaderVisible(true);
		secretsTable.setLinesVisible(true);
		secretsTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));

		secretsViewer = new CheckboxTableViewer(secretsTable);
		HPCSecretsLabelProvider labelProvider = new HPCSecretsLabelProvider();
		HPCSecretsContentProvider contentProvider = new HPCSecretsContentProvider();
		labelProvider.createColumns(secretsViewer);
		secretsViewer.setContentProvider(contentProvider);
		secretsViewer.setLabelProvider(labelProvider);

		TableLayout tableLayout = new TableLayout();
		tableLayout.addColumnData(new ColumnPixelData(24));
		tableLayout.addColumnData(new ColumnWeightData(50, 50, true));
		tableLayout.addColumnData(new ColumnWeightData(50, 50, true));
		secretsTable.setLayout(tableLayout);

		addButton = createButton("Add HPC Infrastructure ...");
		editButton = createButton("Edit HPC Infrastructure ...");
		removeButton = createButton("Delete HPC Infrastructure");

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
		Map<String, String> secrets = new HashMap<>();
		secrets.put("hpc", "sodalite-fe.hlrs.de");
		secrets.put("ssh_user", "yosu");
		secrets.put("ssh_password", "my_password");
		secrets.put("ssh_pkey", "my key");
		hpcs.add(new HPCSecretData(secrets));

		secretsViewer.setInput(hpcs);
	}

	protected void addSecret() {
		HPCSecretDialog dialog = new HPCSecretDialog(getShell(), null);
		if (dialog.open() != Window.CANCEL) {
			hpcs.add(dialog.getSecret());
		}
		secretsViewer.refresh();
	}

	protected void editSecret() {
		IStructuredSelection selection = secretsViewer.getStructuredSelection();
		@SuppressWarnings("unchecked")
		HPCSecretData hpc = (HPCSecretData) selection.iterator().next();

		HPCSecretDialog dialog = new HPCSecretDialog(getShell(), hpc);
		if (dialog.open() != Window.CANCEL) {
			hpc.setSecrets(dialog.getSecret().getSecrets());
		}
		secretsViewer.refresh();
	}

	protected void removeSecret() {
		IStructuredSelection selection = secretsViewer.getStructuredSelection();
		Iterator<?> it = selection.iterator();
		while (it.hasNext()) {
			HPCSecretData data = (HPCSecretData) it.next();
			hpcs.remove(data);
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
