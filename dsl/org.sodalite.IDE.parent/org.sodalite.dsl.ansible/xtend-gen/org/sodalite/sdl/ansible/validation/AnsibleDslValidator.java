/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.validation;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.bson.Document;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.validation.Check;
import org.sodalite.dsl.ansible.helper.AnsibleHelper;
import org.sodalite.sdl.ansible.ansibleDsl.AnsibleDslPackage;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryInLine;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryIndented;
import org.sodalite.sdl.ansible.ansibleDsl.EDictionaryPair;
import org.sodalite.sdl.ansible.ansibleDsl.EJinjaAndString;
import org.sodalite.sdl.ansible.ansibleDsl.EModuleCall;
import org.sodalite.sdl.ansible.ansibleDsl.EParameter;
import org.sodalite.sdl.ansible.ansibleDsl.Model;
import org.sodalite.sdl.ansible.validation.AbstractAnsibleDslValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class AnsibleDslValidator extends AbstractAnsibleDslValidator {
  @Check
  public void checkCollectionNames(final /* ECollectionFQN */Object collection) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ECOLLECTION_FQN__NAMESPACE_OR_FQN is undefined for the type Class<Literals>"
      + "\nThe method or field EJinjaOrStringWithoutQuotes is undefined"
      + "\nThe method or field stringWithoutQuotes is undefined for the type EObject"
      + "\nThe method or field EJinjaOrStringWithoutQuotes is undefined"
      + "\nThe method or field ECOLLECTION_FQN__NAMESPACE_OR_FQN is undefined for the type Class<Literals>"
      + "\nnamespaceOrFqn cannot be resolved"
      + "\ncollectionName cannot be resolved"
      + "\n=== cannot be resolved"
      + "\nnamespaceOrFqn cannot be resolved"
      + "\nnamespaceOrFqn cannot be resolved"
      + "\nnamespaceOrFqn cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\ncollectionName cannot be resolved"
      + "\n=== cannot be resolved");
  }
  
  @Check
  public void checkModuleName(final EModuleCall module) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field firstPart is undefined for the type EModuleCall"
      + "\nThe method or field secondPart is undefined for the type EModuleCall"
      + "\nThe method or field firstPart is undefined for the type EModuleCall"
      + "\nThe method or field EMODULE_CALL__FIRST_PART is undefined for the type Class<Literals>"
      + "\nThe method or field secondPart is undefined for the type EModuleCall"
      + "\nThe method or field secondPart is undefined for the type EModuleCall"
      + "\nThe method or field EJinjaOrStringWithoutQuotes is undefined"
      + "\nThe method or field thirdPart is undefined for the type EModuleCall"
      + "\nThe method or field firstPart is undefined for the type EModuleCall"
      + "\nThe method or field secondPart is undefined for the type EModuleCall"
      + "\nThe method or field EMODULE_CALL__FIRST_PART is undefined for the type Class<Literals>"
      + "\n=== cannot be resolved"
      + "\n!== cannot be resolved"
      + "\n=== cannot be resolved");
  }
  
  @Check
  public void checkModuleRequiredParameters(final EModuleCall module) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field EMODULE_CALL__FIRST_PART is undefined for the type Class<Literals>");
  }
  
  @Check
  public void checkRequiredSubparameters(final EParameter parameter) {
    EModuleCall module = EcoreUtil2.<EModuleCall>getContainerOfType(parameter, EModuleCall.class);
    String fqn = AnsibleHelper.calculateModuleName(module);
    List<String> parameterPath = new ArrayList<String>();
    parameterPath.add(0, parameter.getName());
    Map<String, Map<String, Object>> subparameters = AnsibleHelper.findSubparameters(fqn, parameterPath);
    final Predicate<Map.Entry<String, Map<String, Object>>> _function = (Map.Entry<String, Map<String, Object>> map) -> {
      return map.getValue().containsKey("required");
    };
    final Function<Map.Entry<String, Map<String, Object>>, String> _function_1 = (Map.Entry<String, Map<String, Object>> p) -> {
      return p.getKey();
    };
    List<String> requiredSubparameters = subparameters.entrySet().stream().filter(_function).<String>map(_function_1).collect(Collectors.<String>toList());
    Set<String> insertedSubparameters = new HashSet<String>();
    EList<EObject> contents = parameter.eContents();
    for (final EObject content : contents) {
      {
        if ((content instanceof EDictionaryInLine)) {
          EList<EDictionaryPair> _dictionary_pairs = ((EDictionaryInLine) content).getDictionary_pairs();
          for (final EDictionaryPair dictionary_pair : _dictionary_pairs) {
            insertedSubparameters.add(dictionary_pair.getName());
          }
        }
        if ((content instanceof EDictionaryIndented)) {
          EList<EDictionaryPair> _dictionary_pairs_1 = ((EDictionaryIndented) content).getDictionary_pairs();
          for (final EDictionaryPair dictionary_pair_1 : _dictionary_pairs_1) {
            insertedSubparameters.add(dictionary_pair_1.getName());
          }
        }
      }
    }
    String errorMsg = "";
    for (final String subparam : requiredSubparameters) {
      boolean _contains = insertedSubparameters.contains(subparam);
      boolean _not = (!_contains);
      if (_not) {
        String _xifexpression = null;
        boolean _equals = Objects.equal(errorMsg, "");
        if (_equals) {
          _xifexpression = errorMsg.concat(subparam);
        } else {
          _xifexpression = errorMsg.concat(",").concat(subparam);
        }
        errorMsg = _xifexpression;
      }
    }
    if ((errorMsg != "")) {
      this.error("The following required subparameters are missing: ".concat(errorMsg), AnsibleDslPackage.Literals.EPARAMETER__NAME);
    }
  }
  
  @Check
  public void checkRequiredSuboptions(final EDictionaryPair subparameter) {
    EParameter _containerOfType = EcoreUtil2.<EParameter>getContainerOfType(subparameter, EParameter.class);
    boolean _tripleNotEquals = (_containerOfType != null);
    if (_tripleNotEquals) {
      EParameter parameter = EcoreUtil2.<EParameter>getContainerOfType(subparameter, EParameter.class);
      EModuleCall module = EcoreUtil2.<EModuleCall>getContainerOfType(parameter, EModuleCall.class);
      String fqn = AnsibleHelper.calculateModuleName(module);
      Iterator<EObject> containers = EcoreUtil2.getAllContainers(subparameter).iterator();
      List<String> parameterPath = new ArrayList<String>();
      if ((subparameter instanceof EJinjaAndString)) {
        containers.next();
      }
      parameterPath.add(0, subparameter.getName());
      while (containers.hasNext()) {
        {
          EObject container = containers.next();
          if ((container instanceof EDictionaryPair)) {
            parameterPath.add(0, ((EDictionaryPair) container).getName());
          }
        }
      }
      parameterPath.add(0, parameter.getName());
      Map<String, Map<String, Object>> subparameters = AnsibleHelper.findSubparameters(fqn, parameterPath);
      final Predicate<Map.Entry<String, Map<String, Object>>> _function = (Map.Entry<String, Map<String, Object>> map) -> {
        return map.getValue().containsKey("required");
      };
      final Function<Map.Entry<String, Map<String, Object>>, String> _function_1 = (Map.Entry<String, Map<String, Object>> p) -> {
        return p.getKey();
      };
      List<String> requiredSubparameters = subparameters.entrySet().stream().filter(_function).<String>map(_function_1).collect(Collectors.<String>toList());
      Set<String> insertedSubparameters = new HashSet<String>();
      EList<EObject> contents = subparameter.eContents();
      for (final EObject content : contents) {
        {
          if ((content instanceof EDictionaryInLine)) {
            EList<EDictionaryPair> _dictionary_pairs = ((EDictionaryInLine) content).getDictionary_pairs();
            for (final EDictionaryPair dictionary_pair : _dictionary_pairs) {
              insertedSubparameters.add(dictionary_pair.getName());
            }
          }
          if ((content instanceof EDictionaryIndented)) {
            EList<EDictionaryPair> _dictionary_pairs_1 = ((EDictionaryIndented) content).getDictionary_pairs();
            for (final EDictionaryPair dictionary_pair_1 : _dictionary_pairs_1) {
              insertedSubparameters.add(dictionary_pair_1.getName());
            }
          }
        }
      }
      String errorMsg = "";
      for (final String subparam : requiredSubparameters) {
        boolean _contains = insertedSubparameters.contains(subparam);
        boolean _not = (!_contains);
        if (_not) {
          String _xifexpression = null;
          boolean _equals = Objects.equal(errorMsg, "");
          if (_equals) {
            _xifexpression = errorMsg.concat(subparam);
          } else {
            _xifexpression = errorMsg.concat(",").concat(subparam);
          }
          errorMsg = _xifexpression;
        }
      }
      if ((errorMsg != "")) {
        this.error("The following required subparameters are missing: ".concat(errorMsg), AnsibleDslPackage.Literals.EDICTIONARY_PAIR__NAME);
      }
    }
  }
  
  @Check
  public void checkParameterValue(final EParameter parameter) {
    throw new Error("Unresolved compilation problems:"
      + "\nEJinjaAndStringWithoutQuotes cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotes cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotes cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotes cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotes cannot be resolved to a type."
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\njinja_expression_and_stringWithout cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\njinja_expression_and_stringWithout cannot be resolved"
      + "\nget cannot be resolved"
      + "\nstringWithoutQuotes cannot be resolved"
      + "\n!== cannot be resolved"
      + "\njinja_expression_and_stringWithout cannot be resolved"
      + "\nget cannot be resolved"
      + "\nstringWithoutQuotes cannot be resolved"
      + "\nequals cannot be resolved"
      + "\njinja_expression_and_stringWithout cannot be resolved"
      + "\nget cannot be resolved"
      + "\nstringWithoutQuotes cannot be resolved");
  }
  
  @Check
  public void checkParameterValueType(final EParameter parameter) {
    throw new Error("Unresolved compilation problems:"
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>"
      + "\nThe method or field value is undefined for the type EParameter"
      + "\nThe method or field EPARAMETER__VALUE is undefined for the type Class<Literals>");
  }
  
  @Check
  public void checkParameterName(final EParameter parameter) {
    EModuleCall module = EcoreUtil2.<EModuleCall>getContainerOfType(parameter, EModuleCall.class);
    String fqn = AnsibleHelper.calculateModuleName(module);
    String[] nameParts = fqn.split("\\.");
    int _length = nameParts.length;
    boolean _notEquals = (_length != 3);
    if (_notEquals) {
      return;
    }
    String _get = nameParts[0];
    String _plus = (_get + ".");
    String _get_1 = nameParts[1];
    String collectionName = (_plus + _get_1);
    Object _get_2 = AnsibleHelper.getCollectionData().get(collectionName).get("modules");
    Object _get_3 = ((Document) _get_2).get(nameParts[2]);
    Document moduleData = ((Document) _get_3);
    Object _get_4 = moduleData.get("parameters");
    Object _get_5 = ((Document) _get_4).get(parameter.getName());
    Document parameterData = ((Document) _get_5);
    if ((parameterData == null)) {
      String _name = parameter.getName();
      String _plus_1 = ("The parameter " + _name);
      String _plus_2 = (_plus_1 + " is not included in module ");
      String _plus_3 = (_plus_2 + fqn);
      this.error(_plus_3, AnsibleDslPackage.Literals.EPARAMETER__NAME);
    }
  }
  
  @Check
  public void checkSubparameterValue(final EDictionaryPair subparameter) {
    throw new Error("Unresolved compilation problems:"
      + "\nEJinjaAndStringWithoutQuotes cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotes cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotes cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotes cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotes cannot be resolved to a type."
      + "\njinja_expression_and_stringWithout cannot be resolved"
      + "\nlength cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\njinja_expression_and_stringWithout cannot be resolved"
      + "\nget cannot be resolved"
      + "\nstringWithoutQuotes cannot be resolved"
      + "\n!== cannot be resolved"
      + "\njinja_expression_and_stringWithout cannot be resolved"
      + "\nget cannot be resolved"
      + "\nstringWithoutQuotes cannot be resolved"
      + "\nequals cannot be resolved"
      + "\njinja_expression_and_stringWithout cannot be resolved"
      + "\nget cannot be resolved"
      + "\nstringWithoutQuotes cannot be resolved");
  }
  
  @Check
  public void checkSubparameterValueType(final EDictionaryPair subparameter) {
    throw new Error("Unresolved compilation problems:"
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nEJinjaAndStringWithoutQuotesImpl cannot be resolved to a type."
      + "\nThe method or field value is undefined for the type EParameter");
  }
  
  @Check
  public void checkSubparameterName(final EDictionaryPair subparameter) {
    EParameter _containerOfType = EcoreUtil2.<EParameter>getContainerOfType(subparameter, EParameter.class);
    boolean _tripleNotEquals = (_containerOfType != null);
    if (_tripleNotEquals) {
      EParameter parameter = EcoreUtil2.<EParameter>getContainerOfType(subparameter, EParameter.class);
      EModuleCall module = EcoreUtil2.<EModuleCall>getContainerOfType(parameter, EModuleCall.class);
      String fqn = AnsibleHelper.calculateModuleName(module);
      String[] nameParts = fqn.split("\\.");
      int _length = nameParts.length;
      boolean _notEquals = (_length != 3);
      if (_notEquals) {
        return;
      }
      String _get = nameParts[0];
      String _plus = (_get + ".");
      String _get_1 = nameParts[1];
      String collectionName = (_plus + _get_1);
      Object _get_2 = AnsibleHelper.getCollectionData().get(collectionName).get("modules");
      Object _get_3 = ((Document) _get_2).get(nameParts[2]);
      Document moduleData = ((Document) _get_3);
      Object _get_4 = moduleData.get("parameters");
      Object _get_5 = ((Document) _get_4).get(parameter.getName());
      Document parameterData = ((Document) _get_5);
      Iterator<EObject> containers = EcoreUtil2.getAllContainers(subparameter).iterator();
      List<String> parameterPath = new ArrayList<String>();
      if ((subparameter instanceof EJinjaAndString)) {
        containers.next();
      }
      parameterPath.add(0, subparameter.getName());
      while (containers.hasNext()) {
        {
          EObject container = containers.next();
          if ((container instanceof EDictionaryPair)) {
            parameterPath.add(0, ((EDictionaryPair) container).getName());
          }
        }
      }
      parameterPath.add(0, parameter.getName());
      Document subparameterData = new Document();
      for (int i = 1; (i < parameterPath.size()); i++) {
        if ((i == 1)) {
          Object _get_6 = parameterData.get("suboptions");
          Object _get_7 = ((Document) _get_6).get(parameterPath.get(i));
          subparameterData = ((Document) _get_7);
        } else {
          Object _get_8 = subparameterData.get("suboptions");
          Object _get_9 = ((Document) _get_8).get(parameterPath.get(i));
          subparameterData = ((Document) _get_9);
        }
      }
      if ((subparameterData == null)) {
        String _name = subparameter.getName();
        String _plus_1 = ("The subparameter " + _name);
        String _plus_2 = (_plus_1 + " is not included in parameter ");
        int _size = parameterPath.size();
        int _minus = (_size - 2);
        String _get_6 = parameterPath.get(_minus);
        String _plus_3 = (_plus_2 + _get_6);
        this.error(_plus_3, AnsibleDslPackage.Literals.EDICTIONARY_PAIR__NAME);
      }
    }
  }
  
  @Check
  public void checkCollectionSupport(final /* ECollectionFQN */Object collection) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method calculateCollectionName(ECollectionFQN) is undefined for the type Class<AnsibleHelper>"
      + "\nThe method or field ECOLLECTION_FQN__NAMESPACE_OR_FQN is undefined for the type Class<Literals>");
  }
  
  @Check
  public void checkRoleSupport(final /* ERoleName */Object role) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method calculateRoleName(ERoleName) is undefined for the type Class<AnsibleHelper>"
      + "\nThe method or field EROLE_NAME__FIRST_PART is undefined for the type Class<Literals>"
      + "\nThe method or field EROLE_NAME__FIRST_PART is undefined for the type Class<Literals>");
  }
  
  @Check
  public void chechCodeSmells(final Model o) {
    throw new Error("Unresolved compilation problems:"
      + "\nFileBody cannot be resolved to a type."
      + "\nMultipartEntityBuilder cannot be resolved to a type."
      + "\nFileBody cannot be resolved."
      + "\nThe method or field MultipartEntityBuilder is undefined"
      + "\ncreate cannot be resolved"
      + "\nboundary cannot be resolved"
      + "\naddPart cannot be resolved"
      + "\nbuild cannot be resolved");
  }
}
