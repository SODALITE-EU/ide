package org.sodalite.dsl.ui.preferences.hpc_secrets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
import org.sodalite.dsl.kb_reasoner_client.exceptions.SodaliteException;
import org.sodalite.dsl.kb_reasoner_client.types.HPCSecretData;
import org.sodalite.ide.ui.backend.SodaliteBackendProxy;

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
	private ArrayList<HPCSecretData> hpcsToAdd = new ArrayList<>();
	private ArrayList<HPCSecretData> hpcsToRemove = new ArrayList<>();

	HPCSecretsComposite(Composite parent, int style) throws SodaliteException, Exception {
		super(parent, style);
		createWidgets();
	}

	protected void createWidgets() throws SodaliteException, Exception {
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

		secretsViewer.addSelectionChangedListener(event -> {
			IStructuredSelection selection = event.getStructuredSelection();
			if (selection.isEmpty()) {
				editButton.setEnabled(false);
				removeButton.setEnabled(false);
				return;
			}
		});

		initializeValues();
	}

	public void initializeValues() throws SodaliteException, Exception {
		// Read user's secrets from Vault
		hpcs.clear();
		List<String> hpcInfras = SodaliteBackendProxy.getKBReasoner().listHPCInfrastructures();
		for (String hpcInfra : hpcInfras) {
			HPCSecretData secrets = SodaliteBackendProxy.getKBReasoner().getHPCInfrastructure(hpcInfra);
			hpcs.add(secrets);
		}

		secretsViewer.setInput(hpcs);
	}

	protected void addSecret() {
		HPCSecretDialog dialog = new HPCSecretDialog(getShell(), null);
		if (dialog.open() != Window.CANCEL) {
			hpcs.add(dialog.getSecret());
			hpcsToAdd.add(dialog.getSecret());
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
			hpcsToAdd.add(hpc);
		}
		secretsViewer.refresh();
	}

	protected void removeSecret() {
		IStructuredSelection selection = secretsViewer.getStructuredSelection();
		Iterator<?> it = selection.iterator();
		while (it.hasNext()) {
			HPCSecretData data = (HPCSecretData) it.next();
			hpcs.remove(data);
			if (hpcsToAdd.contains(data))
				hpcsToAdd.remove(data);
			else
				hpcsToRemove.add(data);
		}
		secretsViewer.refresh();
	}

	private Button createButton(String message) {
		Button button = new Button(this, SWT.PUSH);
		button.setText(message);
		button.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		return button;
	}

	public ArrayList<HPCSecretData> getHpcsToRemove() {
		return hpcsToRemove;
	}

	public ArrayList<HPCSecretData> getHpcsToAdd() {
		return hpcsToAdd;
	}

	public void resetHpcs() {
		for (HPCSecretData hpcToRemove : hpcsToAdd)
			if (hpcs.contains(hpcToRemove))
				hpcs.remove(hpcToRemove);
		secretsViewer.refresh();
		hpcsToAdd = new ArrayList<>();
		hpcsToRemove = new ArrayList<>();
	}

}
