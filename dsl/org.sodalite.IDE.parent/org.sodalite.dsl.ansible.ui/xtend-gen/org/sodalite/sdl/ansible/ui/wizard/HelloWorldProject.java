/**
 * generated by Xtext 2.23.0
 */
package org.sodalite.sdl.ansible.ui.wizard;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.eclipse.xtext.ui.wizard.template.AbstractProjectTemplate;
import org.eclipse.xtext.ui.wizard.template.BooleanTemplateVariable;
import org.eclipse.xtext.ui.wizard.template.GroupTemplateVariable;
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator;
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate;
import org.eclipse.xtext.ui.wizard.template.StringTemplateVariable;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@ProjectTemplate(label = "Hello World", icon = "project_template.png", description = "<p><b>Hello World</b></p>\n<p>This is a hello world for AnsibleDsl.</p>")
@SuppressWarnings("all")
public final class HelloWorldProject extends AbstractProjectTemplate {
  private final BooleanTemplateVariable advanced = this.check("Advanced:", false);
  
  private final GroupTemplateVariable advancedGroup = this.group("Properties");
  
  private final StringTemplateVariable path = this.text("Package:", "mydsl", "The package path to place the files in", this.advancedGroup);
  
  @Override
  protected void updateVariables() {
    this.path.setEnabled(this.advanced.getValue());
    boolean _value = this.advanced.getValue();
    boolean _not = (!_value);
    if (_not) {
      this.path.setValue("ans");
    }
  }
  
  @Override
  protected IStatus validate() {
    Status _xifexpression = null;
    boolean _matches = this.path.getValue().matches("[a-z][a-z0-9_]*(/[a-z][a-z0-9_]*)*");
    if (_matches) {
      _xifexpression = null;
    } else {
      _xifexpression = new Status(IStatus.ERROR, "Wizard", (("\'" + this.path) + "\' is not a valid package name"));
    }
    return _xifexpression;
  }
  
  @Override
  public void generateProjects(final IProjectGenerator generator) {
    PluginProjectFactory _pluginProjectFactory = new PluginProjectFactory();
    final Procedure1<PluginProjectFactory> _function = (PluginProjectFactory it) -> {
      it.setProjectName(this.getProjectInfo().getProjectName());
      it.setLocation(this.getProjectInfo().getLocationPath());
      List<String> _projectNatures = it.getProjectNatures();
      Iterables.<String>addAll(_projectNatures, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID)));
      List<String> _builderIds = it.getBuilderIds();
      Iterables.<String>addAll(_builderIds, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID)));
      List<String> _folders = it.getFolders();
      _folders.add("src");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("src/");
      _builder.append(this.path);
      _builder.append("/Model.ans");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("/*");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("* This is an example model");
      _builder_1.newLine();
      _builder_1.append(" ");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.append("playbook_name: \"hello world playbook\"");
      _builder_1.newLine();
      _builder_1.append("plays:");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("play:");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("play_name: \"hello world play\"");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("hosts: \"all\"");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("tasks_list:");
      _builder_1.newLine();
      _builder_1.append("\t\t\t");
      _builder_1.append("task_to_execute:");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("task_name: \"hello world task\"");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("module: \"debug\"");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t");
      _builder_1.append("parameters:");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t\t\t");
      _builder_1.append("msg: \"Hello world!\"");
      _builder_1.newLine();
      this.addFile(it, _builder, _builder_1);
    };
    PluginProjectFactory _doubleArrow = ObjectExtensions.<PluginProjectFactory>operator_doubleArrow(_pluginProjectFactory, _function);
    generator.generate(_doubleArrow);
  }
}
