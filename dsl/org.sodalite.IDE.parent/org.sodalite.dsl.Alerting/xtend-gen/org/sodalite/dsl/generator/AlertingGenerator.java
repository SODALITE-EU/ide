/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.dsl.generator;

import com.google.common.collect.Iterables;
import java.text.DecimalFormat;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.sodalite.dsl.alerting.EAggregationExpr;
import org.sodalite.dsl.alerting.EBinaryExpr;
import org.sodalite.dsl.alerting.EBinaryStatement;
import org.sodalite.dsl.alerting.EExpression;
import org.sodalite.dsl.alerting.EFunctionExpr;
import org.sodalite.dsl.alerting.EGroup;
import org.sodalite.dsl.alerting.ELabel;
import org.sodalite.dsl.alerting.ELabelList;
import org.sodalite.dsl.alerting.EMetricExpr;
import org.sodalite.dsl.alerting.ENUMBER;
import org.sodalite.dsl.alerting.EPeriod;
import org.sodalite.dsl.alerting.EPeriodSegment;
import org.sodalite.dsl.alerting.ERule;
import org.sodalite.dsl.alerting.ESingleLabel;
import org.sodalite.dsl.alerting.EStatement;
import org.sodalite.dsl.alerting.ETag;
import org.sodalite.dsl.alerting.EVectorExpr;
import org.sodalite.dsl.alerting.EVectorMatching;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class AlertingGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final String filename = this.getFilename(resource.getURI());
    fsa.generateFile(filename, this.compileAlerting(resource));
  }
  
  public CharSequence compileAlerting(final Resource r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("groups:");
    _builder.newLine();
    {
      Iterable<EGroup> _filter = Iterables.<EGroup>filter(IteratorExtensions.<EObject>toIterable(r.getAllContents()), EGroup.class);
      for(final EGroup g : _filter) {
        CharSequence _compile = this.compile(g);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final EGroup g) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- name: ");
    String _name = g.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("rules:");
    _builder.newLine();
    {
      EList<ERule> _rules = g.getRules();
      for(final ERule r : _rules) {
        _builder.append("  ");
        CharSequence _compile = this.compile(r);
        _builder.append(_compile, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ERule r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- alert: ");
    String _alert = r.getAlert();
    _builder.append(_alert);
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("expr: ");
    CharSequence _compile = this.compile(r.getExpr());
    _builder.append(_compile, "  ");
    _builder.newLineIfNotEmpty();
    {
      String _duration = r.getDuration();
      boolean _tripleNotEquals = (_duration != null);
      if (_tripleNotEquals) {
        _builder.append("  ");
        _builder.append("for: ");
        String _duration_1 = r.getDuration();
        _builder.append(_duration_1, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<ELabel> _labels = r.getLabels();
      boolean _tripleNotEquals_1 = (_labels != null);
      if (_tripleNotEquals_1) {
        _builder.append("  ");
        _builder.append("labels:");
        _builder.newLine();
        {
          EList<ELabel> _labels_1 = r.getLabels();
          for(final ELabel l : _labels_1) {
            _builder.append("  ");
            _builder.append("  ");
            CharSequence _compile_1 = this.compile(l);
            _builder.append(_compile_1, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      EList<ELabel> _annotations = r.getAnnotations();
      boolean _tripleNotEquals_2 = (_annotations != null);
      if (_tripleNotEquals_2) {
        _builder.append("  ");
        _builder.append("annotations:");
        _builder.newLine();
        {
          EList<ELabel> _annotations_1 = r.getAnnotations();
          for(final ELabel a : _annotations_1) {
            _builder.append("  ");
            _builder.append("  ");
            CharSequence _compile_2 = this.compile(a);
            _builder.append(_compile_2, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("  ");
        _builder.append("  ");
        _builder.append("monitoring_id: \'monitoring_id_value\'");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("  ");
        _builder.append("instance: \'{{ $labels.instance }}\'");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("  ");
        _builder.append("hpc: \'{{ $labels.hpc }}\'");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final EExpression e) {
    StringConcatenation _builder = new StringConcatenation();
    String _trim = this.trim(this.compile(e.getExpr()).toString());
    _builder.append(_trim);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final EBinaryStatement bs) {
    StringConcatenation _builder = new StringConcatenation();
    String _trim = this.trim(this.compile(bs.getLexpr()).toString());
    _builder.append(_trim);
    _builder.append(" ");
    String _type = bs.getOper().getType();
    _builder.append(_type);
    _builder.append(" ");
    String _trim_1 = this.trim(this.compile(bs.getRexpr()).toString());
    _builder.append(_trim_1);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final EStatement s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((s instanceof EVectorMatching)) {
        CharSequence _compile = this.compile(((EVectorMatching) s));
        _builder.append(_compile);
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      } else {
        if ((s instanceof EVectorExpr)) {
          CharSequence _compile_1 = this.compile(((EVectorExpr) s));
          _builder.append(_compile_1);
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final EVectorExpr ve) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((ve instanceof ENUMBER)) {
        CharSequence _compile = this.compile(((ENUMBER) ve));
        _builder.append(_compile);
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
      } else {
        if ((ve instanceof EFunctionExpr)) {
          CharSequence _compile_1 = this.compile(((EFunctionExpr) ve));
          _builder.append(_compile_1);
          _builder.newLineIfNotEmpty();
        } else {
          if ((ve instanceof EMetricExpr)) {
            CharSequence _compile_2 = this.compile(((EMetricExpr) ve));
            _builder.append(_compile_2);
            _builder.newLineIfNotEmpty();
          } else {
            if ((ve instanceof EBinaryExpr)) {
              CharSequence _compile_3 = this.compile(((EBinaryExpr) ve));
              _builder.append(_compile_3);
              _builder.newLineIfNotEmpty();
            } else {
              if ((ve instanceof EAggregationExpr)) {
                CharSequence _compile_4 = this.compile(((EAggregationExpr) ve));
                _builder.append(_compile_4);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final ENUMBER n) {
    StringConcatenation _builder = new StringConcatenation();
    String _formatNumber = this.formatNumber(n.getValue());
    _builder.append(_formatNumber);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String formatNumber(final float f) {
    final DecimalFormat df = new DecimalFormat("#.##");
    return df.format(f);
  }
  
  public CharSequence compile(final EFunctionExpr fe) {
    StringConcatenation _builder = new StringConcatenation();
    String _function = fe.getFunction();
    _builder.append(_function);
    _builder.append("(");
    Object _compile = this.compile(fe.getExpr());
    _builder.append(_compile);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final EMetricExpr me) {
    StringConcatenation _builder = new StringConcatenation();
    String _type = me.getType().getType();
    _builder.append(_type);
    _builder.append("{");
    String _processTagList = this.processTagList(me.getTags());
    _builder.append(_processTagList);
    _builder.append("}");
    {
      EPeriod _period = me.getPeriod();
      boolean _tripleNotEquals = (_period != null);
      if (_tripleNotEquals) {
        _builder.append("[");
        {
          EList<EPeriodSegment> _segments = me.getPeriod().getSegments();
          for(final EPeriodSegment seg : _segments) {
            int _value = seg.getValue();
            _builder.append(_value);
            String _unit = seg.getUnit();
            _builder.append(_unit);
          }
        }
        _builder.append("]");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final EBinaryExpr ae) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Object _compile = this.compile(ae.getLexpr());
    _builder.append(_compile);
    _builder.append(" ");
    String _type = ae.getOper().getType();
    _builder.append(_type);
    _builder.append(" ");
    Object _compile_1 = this.compile(ae.getRexpr());
    _builder.append(_compile_1);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final EVectorMatching vm) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compile = this.compile(vm.getLexpr());
    _builder.append(_compile);
    _builder.append(" ");
    String _type = vm.getOper().getType();
    _builder.append(_type);
    _builder.append(" ");
    String _type_1 = vm.getType();
    _builder.append(_type_1);
    _builder.append("(");
    CharSequence _compile_1 = this.compile(vm.getLabels());
    _builder.append(_compile_1);
    _builder.append(") ");
    CharSequence _compile_2 = this.compile(vm.getRexpr());
    _builder.append(_compile_2);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final ELabelList ll) {
    StringConcatenation _builder = new StringConcatenation();
    String _processLabelList = this.processLabelList(ll.getList());
    _builder.append(_processLabelList);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final EAggregationExpr ae) {
    StringConcatenation _builder = new StringConcatenation();
    String _oper = ae.getOper();
    _builder.append(_oper);
    _builder.append(" ");
    {
      String _modifier = ae.getModifier();
      boolean _tripleNotEquals = (_modifier != null);
      if (_tripleNotEquals) {
        String _modifier_1 = ae.getModifier();
        _builder.append(_modifier_1);
        _builder.append("(");
        CharSequence _compile = this.compile(ae.getLabels());
        _builder.append(_compile);
        _builder.append(")");
      }
    }
    _builder.append("(");
    Object _compile_1 = this.compile(ae.getExpr());
    _builder.append(_compile_1);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final ELabel l) {
    StringConcatenation _builder = new StringConcatenation();
    String _key = l.getKey();
    _builder.append(_key);
    _builder.append(": ");
    String _processString = this.processString(l.getValue());
    _builder.append(_processString);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String processLabelList(final EList<ESingleLabel> list) {
    final StringBuffer st = new StringBuffer();
    boolean comma = false;
    for (final ESingleLabel l : list) {
      {
        if (comma) {
          st.append(", ");
        } else {
          comma = true;
        }
        st.append(l.getLabel());
      }
    }
    return st.toString();
  }
  
  public String processTagList(final EList<ETag> list) {
    final StringBuffer st = new StringBuffer();
    boolean comma = false;
    for (final ETag t : list) {
      {
        if (comma) {
          st.append(", ");
        } else {
          comma = true;
        }
        boolean _equals = t.getKey().equals("monitoring_id");
        if (_equals) {
          String _key = t.getKey();
          String _type = t.getOper().getType();
          String _plus = (_key + _type);
          String _plus_1 = (_plus + "\"");
          String _plus_2 = (_plus_1 + "monitoring_id_value");
          String _plus_3 = (_plus_2 + "\"");
          st.append(_plus_3);
        } else {
          String _key_1 = t.getKey();
          String _type_1 = t.getOper().getType();
          String _plus_4 = (_key_1 + _type_1);
          String _plus_5 = (_plus_4 + "\"");
          String _value = t.getValue();
          String _plus_6 = (_plus_5 + _value);
          String _plus_7 = (_plus_6 + "\"");
          st.append(_plus_7);
        }
      }
    }
    boolean _containsMonitoringId = this.containsMonitoringId(list);
    boolean _not = (!_containsMonitoringId);
    if (_not) {
      if (comma) {
        st.append(", ");
      }
    }
    st.append((((("monitoring_id" + "=") + "\"") + "monitoring_id_value") + "\""));
    return st.toString();
  }
  
  public boolean containsMonitoringId(final EList<ETag> list) {
    for (final ETag t : list) {
      boolean _equals = t.getKey().equals("monitoring_id");
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public String getFilename(final URI uri) {
    String filename = uri.toString();
    filename = filename.replace("platform:/resource", "");
    int _indexOf = filename.indexOf("/", 1);
    int _plus = (_indexOf + 1);
    String _replaceFirst = filename.substring(_plus).replaceFirst("/", ".");
    String _plus_1 = (_replaceFirst + ".rules");
    filename = _plus_1;
    return filename;
  }
  
  public String processString(final String _string) {
    return _string.replaceAll("[\\n\\r]+", "\\\\n");
  }
  
  public String trim(final CharSequence value) {
    return value.toString().trim().replaceAll("[\n\r]", "");
  }
}