/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.ui.quickfix;

import java.text.MessageFormat;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.sodalite.dsl.aADM.AADMFactory;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ENodeTemplateBody;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.aADM.ERequirementAssignments;
import org.sodalite.dsl.aADM.impl.ENodeTemplatesImpl;
import org.sodalite.dsl.rM.EPREFIX_ID;
import org.sodalite.dsl.rM.EPropertyAssignment;
import org.sodalite.dsl.rM.EPropertyAssignments;
import org.sodalite.dsl.rM.ESTRING;
import org.sodalite.dsl.rM.RMFactory;
import org.sodalite.dsl.ui.validation.ValidationIssue;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
@SuppressWarnings("all")
public class AADMQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(ValidationIssue.REQUIREMENT)
  public void fixRequirement(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    final String data = ((String[]) _data)[0];
    final String targetRequirement = this.getSubstring(data, "requirements\\/(.*?)\\/");
    final String[] matches = this.getSubstring(data, "\\[(.*?)\\]").split(Pattern.quote(","));
    final String prefix = "https://www.sodalite.eu/ontologies/workspace/1/";
    for (final String match : matches) {
      {
        final String qMatch = match.trim().substring(prefix.length());
        final String targetModule = qMatch.substring(0, qMatch.indexOf("/"));
        int _indexOf = qMatch.indexOf("/");
        int _plus = (_indexOf + 1);
        final String remaining = qMatch.substring(_plus);
        String tNode = null;
        boolean _contains = remaining.contains("/");
        if (_contains) {
          final String version = remaining.substring(0, remaining.indexOf("/"));
          int _indexOf_1 = remaining.indexOf("/");
          int _plus_1 = (_indexOf_1 + 1);
          final String node = remaining.substring(_plus_1);
          tNode = ((node + "@") + version);
        } else {
          tNode = remaining;
        }
        final String targetNode = tNode;
        final String message = MessageFormat.format("Create requirement \"{0}\" referencing node \"{1}\"", targetRequirement, targetNode);
        final String sub_message = message;
        final ISemanticModification _function = (EObject nodeTemplate, IModificationContext context) -> {
          ERequirementAssignment req = null;
          ENodeTemplate node_1 = ((ENodeTemplate) nodeTemplate);
          ERequirementAssignments _requirements = node_1.getNode().getRequirements();
          boolean _tripleEquals = (_requirements == null);
          if (_tripleEquals) {
            final ERequirementAssignments requirements = AADMFactory.eINSTANCE.createERequirementAssignments();
            ENodeTemplateBody _node = node_1.getNode();
            _node.setRequirements(requirements);
          }
          EList<ERequirementAssignment> _requirements_1 = node_1.getNode().getRequirements().getRequirements();
          for (final ERequirementAssignment requirement : _requirements_1) {
            boolean _equalsIgnoreCase = requirement.getName().equalsIgnoreCase(targetRequirement);
            if (_equalsIgnoreCase) {
              req = requirement;
            }
          }
          if ((req == null)) {
            req = AADMFactory.eINSTANCE.createERequirementAssignment();
            req.setName(targetRequirement);
            node_1.getNode().getRequirements().getRequirements().add(req);
          }
          System.out.println(("Applying targetNode: " + targetNode));
          EPREFIX_ID _node_1 = req.getNode();
          boolean _tripleEquals_1 = (_node_1 == null);
          if (_tripleEquals_1) {
            EPREFIX_ID req_node = RMFactory.eINSTANCE.createEPREFIX_ID();
            req.setNode(req_node);
          }
          EPREFIX_ID _node_2 = req.getNode();
          _node_2.setModule(targetModule);
          boolean _contains_1 = targetNode.contains("@");
          if (_contains_1) {
            EPREFIX_ID _node_3 = req.getNode();
            _node_3.setId(targetNode.substring(0, targetNode.indexOf("@")));
            EPREFIX_ID _node_4 = req.getNode();
            int _indexOf_2 = targetNode.indexOf("@");
            int _plus_2 = (_indexOf_2 + 1);
            _node_4.setVersion(targetNode.substring(_plus_2));
          } else {
            EPREFIX_ID _node_5 = req.getNode();
            _node_5.setId(targetNode);
          }
        };
        acceptor.accept(issue, message, sub_message, "", _function);
      }
    }
  }
  
  @Fix(ValidationIssue.PROPERTY)
  public void fixProperty(final Issue issue, final IssueResolutionAcceptor acceptor) {
    String[] _data = issue.getData();
    final String data = ((String[]) _data)[0];
    int _length = data.length();
    int _minus = (_length - 1);
    String _substring = data.substring(1, _minus);
    final StringTokenizer st = new StringTokenizer(_substring, ",");
    final String propertyName = st.nextToken().trim();
    final String nodeName = st.nextToken().trim();
    final String message = MessageFormat.format("Create property \"{0}\" in node \"{1}\"", propertyName, nodeName);
    final String sub_message = message;
    final ISemanticModification _function = (EObject nodeTemplate, IModificationContext context) -> {
      ENodeTemplate node = ((ENodeTemplate) nodeTemplate);
      EPropertyAssignments _properties = node.getNode().getProperties();
      boolean _tripleEquals = (_properties == null);
      if (_tripleEquals) {
        final EPropertyAssignments properties = RMFactory.eINSTANCE.createEPropertyAssignments();
        ENodeTemplateBody _node = node.getNode();
        _node.setProperties(properties);
      }
      EPropertyAssignment property = RMFactory.eINSTANCE.createEPropertyAssignment();
      property.setName(propertyName);
      ESTRING value = RMFactory.eINSTANCE.createESTRING();
      value.setValue("<set_value>");
      property.setValue(value);
      node.getNode().getProperties().getProperties().add(property);
    };
    acceptor.accept(issue, message, sub_message, "", _function);
  }
  
  public ENodeTemplate getNode(final ENodeTemplatesImpl templates, final String name) {
    ENodeTemplate node = null;
    EList<ENodeTemplate> _nodeTemplates = templates.getNodeTemplates();
    for (final ENodeTemplate n : _nodeTemplates) {
      boolean _equals = n.getName().equals(name);
      if (_equals) {
        node = n;
      }
    }
    return node;
  }
  
  public String getSubstring(final String data, final String sPattern) {
    final Pattern pattern = Pattern.compile(sPattern);
    final Matcher matcher = pattern.matcher(data);
    boolean _find = matcher.find();
    if (_find) {
      return matcher.group(1);
    }
    return null;
  }
}
