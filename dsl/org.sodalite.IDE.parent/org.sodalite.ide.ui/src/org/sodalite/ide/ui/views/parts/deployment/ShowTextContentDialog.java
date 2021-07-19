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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ShowTextContentDialog extends Dialog {
	String title = null;
	String content = null;

	public ShowTextContentDialog(Shell parentShell, String title, String content) {
		super(parentShell);
		setShellStyle(SWT.CLOSE | SWT.MODELESS | SWT.BORDER | SWT.TITLE);
		setBlockOnOpen(false);
		this.title = title;
		this.content = content;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		final ScrolledComposite sc = new ScrolledComposite(container, SWT.BORDER | SWT.V_SCROLL);
		sc.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);

		sc.addListener(SWT.Resize, event -> {
			int width = sc.getClientArea().width;
			sc.setMinSize(parent.computeSize(width, SWT.DEFAULT));
		});

		Text contentText = new Text(sc, SWT.BORDER | SWT.MULTI);
		GridData contentTextGridData = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		contentText.setLayoutData(contentTextGridData);
		contentText.setText(content.trim());

		sc.setContent(contentText);
		sc.setMinSize(contentText.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		return container;
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
		return new Point(500, 300);
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