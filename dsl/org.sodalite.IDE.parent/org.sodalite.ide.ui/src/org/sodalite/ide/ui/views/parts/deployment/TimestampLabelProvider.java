package org.sodalite.ide.ui.views.parts.deployment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.eclipse.jface.viewers.StyledString;
import org.sodalite.ide.ui.views.model.DeploymentNode;
import org.sodalite.ide.ui.views.model.TreeNode;

public class TimestampLabelProvider extends BlueprintLabelProvider {

	public TimestampLabelProvider() {
	}

	@Override
	public StyledString getStyledText(Object element) {
		TreeNode<DeploymentNode> node = (TreeNode<DeploymentNode>) element;
		StyledString styledString = new StyledString("-");
		if (node.getData().isDeployment() && node.getData().getDeployment().getTimestamp() != null) {
			styledString = new StyledString(convertFormat(node.getData().getDeployment().getTimestamp()));
		} else if (node.getData().isBlueprint() && node.getData().getBlueprint().getTimestamp() != null) {
			styledString = new StyledString(convertFormat(node.getData().getBlueprint().getTimestamp()));
		}
		return styledString;
	}

	private String convertFormat(String timestamp) {
		DateTimeFormatter formatterIn = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.n'Z'");
		DateTimeFormatter formatterOut = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime parsedDate = LocalDateTime.parse(timestamp, formatterIn);
		String convertedFormat = parsedDate.format(formatterOut);
		return convertedFormat;
	}
}
