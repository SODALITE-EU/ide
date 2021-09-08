package org.sodalite.dsl.ui.preferences.hpc_secrets;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.TableColumn;
import org.sodalite.dsl.kb_reasoner_client.types.HPCSecretData;

public class HPCSecretsLabelProvider extends BaseLabelProvider implements ITableLabelProvider {

	public HPCSecretsLabelProvider() {
		super();
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element == null) {
			return null;
		}
		HPCSecretData data = (HPCSecretData) element;
		switch (columnIndex) {
		case 0:
			return null;
		case 1:
			return data.getName();
		case 2:
			return data.getSecrets().toString();
		default:
			return null;
		}
	}

	public void createColumns(TableViewer viewer) {
		String[] titles = { "", "HPC Name", "Secrets" };
		for (String title : titles) {
			TableColumn column = new TableViewerColumn(viewer, SWT.NONE).getColumn();
			column.setText(title);
			column.setResizable(true);
		}
	}

}
