package org.sodalite.ide.ui.views.parts.deployment;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.widgets.WidgetFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class ShowTextContentDialog extends Dialog {
	String title = null;
	String content = null;

	public ShowTextContentDialog(Shell parentShell, String title, String content) {
		super(parentShell);
		setShellStyle(SWT.CLOSE | SWT.MODELESS | SWT.BORDER | SWT.TITLE | SWT.RESIZE);
		setBlockOnOpen(false);
		this.title = title;
		this.content = content;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		final ScrolledComposite sc = new ScrolledComposite(container, SWT.V_SCROLL | SWT.H_SCROLL);
		sc.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);

		Label contentLabel = new Label(sc, SWT.NONE);
		GridData contentLabelGridData = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
		contentLabel.setLayoutData(contentLabelGridData);
		contentLabel.setText(shrinkLines(content.trim()));

		sc.setContent(contentLabel);
		sc.setMinSize(contentLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		return container;
	}

	private String shrinkLines(String text) {
		// Takes the last lines in text that fits into a Label
		String[] lines = text.split("\r\n|\r|\n");
		int nLines = lines.length;
		// Showing last 1500 lines (SWT Label cannot shown a unlimited number of lines)
		int maxLines = 1500;
		String header = "";
		if (nLines > maxLines)
			header = "Dropping previous lines ...\n\n";
		StringBuffer sb = new StringBuffer(header);
		for (int i = nLines - maxLines; i < nLines; i++) {
			sb.append(lines[i]).append("\n");
		}
		return sb.toString();
	}

	// overriding this methods allows you to set the
	// title of the custom dialog
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(title);
	}

	@Override
	protected Point getInitialSize() {
		return new Point(800, 500);
	}

	@Override
	protected Control createButtonBar(Composite parent) {
		// code taken from Dialog class
		GridLayout layout = new GridLayout();
		layout.numColumns = 0; // this is incremented by createButton
		layout.makeColumnsEqualWidth = true;
		layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
		GridData data = new GridData(GridData.HORIZONTAL_ALIGN_CENTER | GridData.VERTICAL_ALIGN_CENTER);

		Composite composite = WidgetFactory.composite(SWT.NONE).layout(layout).layoutData(data).font(parent.getFont())
				.create(parent);
		createButton(composite, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		return composite;

	}

}