package org.sodalite.dsl.ui.preferences.secrets;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.TableColumn;

public class SecretsLabelProvider extends BaseLabelProvider implements ITableLabelProvider {

	public SecretsLabelProvider() {
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
		SecretData data = (SecretData) element;
		switch (columnIndex) {
		case 0:
			return null;
		case 1:
			return data.getKey();
		case 2:
			return data.getValue();
		default:
			return null;
		}
	}

	public void createColumns(TableViewer viewer) {
		String[] titles = { "", "key", "value" };
		for (String title : titles) {
			TableColumn column = new TableViewerColumn(viewer, SWT.NONE).getColumn();
			column.setText(title);
			column.setResizable(true);
		}
	}

}
