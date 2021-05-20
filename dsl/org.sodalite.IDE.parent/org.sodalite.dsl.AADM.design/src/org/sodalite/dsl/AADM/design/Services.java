package org.sodalite.dsl.AADM.design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.sodalite.dsl.aADM.AADMFactory;
import org.sodalite.dsl.aADM.AADM_Model;
import org.sodalite.dsl.aADM.EAttributeAssignment;
import org.sodalite.dsl.aADM.ECapabilityAssignment;
import org.sodalite.dsl.aADM.ENodeTemplate;
import org.sodalite.dsl.aADM.ENodeTemplateBody;
import org.sodalite.dsl.aADM.ENodeTemplates;
import org.sodalite.dsl.aADM.EPolicyDefinition;
import org.sodalite.dsl.aADM.EPolicyDefinitionBody;
import org.sodalite.dsl.aADM.ERequirementAssignment;
import org.sodalite.dsl.aADM.ETriggerDefinitions;
import org.sodalite.dsl.optimization.optimization.Optimization_Model;
import org.sodalite.dsl.rM.EActivityDefinition;
import org.sodalite.dsl.rM.EActivityDefinitions;
import org.sodalite.dsl.rM.EAlphaNumericValue;
import org.sodalite.dsl.rM.EAssertionDefinition;
import org.sodalite.dsl.rM.EAssignmentValue;
import org.sodalite.dsl.rM.EBOOLEAN;
import org.sodalite.dsl.rM.ECallOperationActivityDefinition;
import org.sodalite.dsl.rM.ECallOperationActivityDefinitionBody;
import org.sodalite.dsl.rM.EConditionClauseDefinition;
import org.sodalite.dsl.rM.EConditionClauseDefinitionAND;
import org.sodalite.dsl.rM.EConditionClauseDefinitionAssert;
import org.sodalite.dsl.rM.EConditionClauseDefinitionNOT;
import org.sodalite.dsl.rM.EConditionClauseDefinitionOR;
import org.sodalite.dsl.rM.EConstraint;
import org.sodalite.dsl.rM.EConstraintList;
import org.sodalite.dsl.rM.EDataTypeName;
import org.sodalite.dsl.rM.EEntity;
import org.sodalite.dsl.rM.EEntityReference;
import org.sodalite.dsl.rM.EEqual;
import org.sodalite.dsl.rM.EEvenFilter;
import org.sodalite.dsl.rM.EExtendedTriggerCondition;
import org.sodalite.dsl.rM.EFLOAT;
import org.sodalite.dsl.rM.EGreaterOrEqual;
import org.sodalite.dsl.rM.EGreaterThan;
import org.sodalite.dsl.rM.EInRange;
import org.sodalite.dsl.rM.ELIST;
import org.sodalite.dsl.rM.ELength;
import org.sodalite.dsl.rM.ELessOrEqual;
import org.sodalite.dsl.rM.ELessThan;
import org.sodalite.dsl.rM.EMAP;
import org.sodalite.dsl.rM.EMapEntry;
import org.sodalite.dsl.rM.EMaxLength;
import org.sodalite.dsl.rM.EMinLength;
import org.sodalite.dsl.rM.EPREFIX_ID;
import org.sodalite.dsl.rM.EPREFIX_REF;
import org.sodalite.dsl.rM.EPREFIX_TYPE;
import org.sodalite.dsl.rM.EParameterDefinition;
import org.sodalite.dsl.rM.EParameterDefinitionBody;
import org.sodalite.dsl.rM.EPropertyAssignment;
import org.sodalite.dsl.rM.ESIGNEDINT;
import org.sodalite.dsl.rM.ESTRING;
import org.sodalite.dsl.rM.ESingleValue;
import org.sodalite.dsl.rM.ETimeInterval;
import org.sodalite.dsl.rM.ETriggerDefinition;
import org.sodalite.dsl.rM.ETriggerDefinitionBody;
import org.sodalite.dsl.rM.EValid_Values;
import org.sodalite.dsl.rM.GetInput;
import org.sodalite.dsl.rM.GetProperty;
import org.sodalite.dsl.rM.GetPropertyBody;
import org.sodalite.dsl.rM.RMFactory;
import org.sodalite.dsl.scoping.AADMScopeProvider;
import org.sodalite.dsl.ui.helper.AADMHelper;

/**
 * The services class used by VSM.
 */
public class Services {

	private static Session session;

	public static SortedSet<String> valueTypes = new TreeSet<String>();
	public static SortedSet<String> clauseTypes = new TreeSet<String>();
	public static int ID = 0;
	static {
		// Value types
		valueTypes.add("Single Value");
		valueTypes.add("List");
		valueTypes.add("Nested Value");
		valueTypes.add("Get Input");
		valueTypes.add("Get Property");

		// Clause types
		clauseTypes.add("And");
		clauseTypes.add("Or");
		clauseTypes.add("Not");
		clauseTypes.add("Assertion");
	}

	public void registerAADMModelChangeTrigger(EObject object) {
		EObject semanticRootElement = EcoreUtil.getRootContainer(object);
		if (session == null) {
			Services.session = SessionManager.INSTANCE.getSession(semanticRootElement);
			Services.session.getEventBroker().addLocalTrigger(AADMModelChangeTrigger.PROPERTY_REMOVED_FILTER,
					new AADMModelChangeTrigger(Services.session.getTransactionalEditingDomain()));
			Services.session.getEventBroker().addLocalTrigger(AADMModelChangeTrigger.INPUT_REMOVED_FILTER,
					new AADMModelChangeTrigger(Services.session.getTransactionalEditingDomain()));
			Services.session.getEventBroker().addLocalTrigger(AADMModelChangeTrigger.ATTRIBUTE_REMOVED_FILTER,
					new AADMModelChangeTrigger(Services.session.getTransactionalEditingDomain()));
			Services.session.getEventBroker().addLocalTrigger(AADMModelChangeTrigger.CAPABILITY_REMOVED_FILTER,
					new AADMModelChangeTrigger(Services.session.getTransactionalEditingDomain()));
			Services.session.getEventBroker().addLocalTrigger(AADMModelChangeTrigger.NODE_REMOVED_FILTER,
					new AADMModelChangeTrigger(Services.session.getTransactionalEditingDomain()));
			Services.session.getEventBroker().addLocalTrigger(AADMModelChangeTrigger.POLICY_REMOVED_FILTER,
					new AADMModelChangeTrigger(Services.session.getTransactionalEditingDomain()));
			Services.session.getEventBroker().addLocalTrigger(AADMModelChangeTrigger.REQUIREMENT_REMOVED_FILTER,
					new AADMModelChangeTrigger(Services.session.getTransactionalEditingDomain()));
			Services.session.getEventBroker().addLocalTrigger(AADMModelChangeTrigger.TRIGGER_REMOVED_FILTER,
					new AADMModelChangeTrigger(Services.session.getTransactionalEditingDomain()));
		}
	}

	public void setConstraint(ETriggerDefinition trigger, String constraint) {
		// TODO
	}

	public void setPeriod(ETriggerDefinition trigger, String period) {
		if (trigger.getTrigger().getCondition() == null) {
			EExtendedTriggerCondition condition = RMFactory.eINSTANCE.createEExtendedTriggerCondition();
			trigger.getTrigger().setCondition(condition);
		}
		trigger.getTrigger().getCondition().setPeriod(period);
	}

	public void setEvaluations(ETriggerDefinition trigger, String evaluations) {
		if (trigger.getTrigger().getCondition() == null) {
			EExtendedTriggerCondition condition = RMFactory.eINSTANCE.createEExtendedTriggerCondition();
			trigger.getTrigger().setCondition(condition);
		}
		if (trigger.getTrigger().getCondition().getEvaluations() == null) {
			ESIGNEDINT evaluationsObj = RMFactory.eINSTANCE.createESIGNEDINT();
			trigger.getTrigger().getCondition().setEvaluations(evaluationsObj);
			;
		}
		trigger.getTrigger().getCondition().getEvaluations().setValue(Integer.parseInt(evaluations));
	}

	public void setMethod(ETriggerDefinition trigger, String method) {
		trigger.getTrigger().getCondition().setMethod(method);
	}

	public void setScheduleStartTime(ETriggerDefinition trigger, String start_time) {
		if (trigger.getTrigger().getSchedule() == null) {
			ETimeInterval schedule = RMFactory.eINSTANCE.createETimeInterval();
			trigger.getTrigger().setSchedule(schedule);
		}
		trigger.getTrigger().getSchedule().setStart_time(start_time);
	}

	public void setScheduleEndTime(ETriggerDefinition trigger, String end_time) {
		trigger.getTrigger().getSchedule().setEnd_time(end_time);
	}

	public String getNodeLabel(EObject node) {
		return "node: " + parse(node);
	}

	public String getNodeBorderedLabel(EObject node) {
		ENodeTemplate nodeTemplate = findNode((EPREFIX_REF) node);
		if (nodeTemplate == null)
			return "node: " + parse(node);
		else
			return "";
	}

	public String getCapabilityLabel(EObject node) {
		return "cap: " + parse(node);
	}

	public String getRequirementBorderedLabel(EObject object) {
		String label = "";
		if (object instanceof EPREFIX_TYPE) {
			ERequirementAssignment req = findRequirement((EPREFIX_TYPE) object);
			if (req == null)
				label = "req: " + parse(object);
		}
		if (object instanceof ERequirementAssignment) {
			ERequirementAssignment requirement = (ERequirementAssignment) object;
			if (requirement.getNode() != null) {
				ENodeTemplate nodeTemplate = findNode(requirement.getNode());
				if (nodeTemplate == null)
					label = "req:" + requirement.getName();
			} else {
				label = "req:" + requirement.getName();
			}
		}
		return label;
	}

	public String getActivityLabel(ETriggerDefinition trigger, Integer index) {
		EActivityDefinition activity = trigger.getTrigger().getAction().getList().get(index - 1);
		ECallOperationActivityDefinition callOperationActivity = (ECallOperationActivityDefinition) activity;
		return parse(callOperationActivity.getOperation().getOperation());
	}

//	public String getAddedActivityLabel(ETriggerDefinition trigger, Integer index) {
//		if (index < trigger.getTrigger().getAction().getList().size()) {
//			EActivityDefinition activity = trigger.getTrigger().getAction().getList().get(index);
//			ECallOperationActivityDefinition callOperationActivity = (ECallOperationActivityDefinition) activity;
//			return parse(callOperationActivity.getOperation().getOperation());
//		}
//		return null;
//	}

	public String getActivityLabel(ETriggerDefinition trigger, ECallOperationActivityDefinition callOperationActivity) {
		return "call operation: " + parse(callOperationActivity.getOperation().getOperation());
	}

	public String getActivityLabel(EActivityDefinition activity) {
		String label = null;
		if (activity instanceof ECallOperationActivityDefinition) {
			ECallOperationActivityDefinition callOperationActivity = (ECallOperationActivityDefinition) activity;
			label = "call operation: " + parse(callOperationActivity.getOperation().getOperation());
		}

		return label;
	}

	private String parse(EPREFIX_TYPE type) {
		return type.getModule() != null ? type.getModule() + "/" + type.getType() : type.getType();
	}

	private String parse(EPREFIX_ID type) {
		return type.getModule() != null ? type.getModule() + "/" + type.getId() : type.getId();
	}

	private String parse(EObject type) {
		if (type instanceof EPREFIX_TYPE)
			return parse((EPREFIX_TYPE) type);
		else if (type instanceof EPREFIX_ID)
			return parse((EPREFIX_ID) type);
		else
			return null;
	}

	public String getConstraintLabel(ETriggerDefinition trigger) {
		return getConstraintLabel(trigger.getTrigger().getCondition());
	}

	public String getConstraintLabel(EExtendedTriggerCondition condition) {
		return "constraint: " + parseConditionClause(condition.getConstraint(), null);
	}

	public String parseConditionClause(ETriggerDefinition trigger) {
		if (trigger.getTrigger().getCondition() != null)
			return parseConditionClause(trigger.getTrigger().getCondition().getConstraint(), null);
		return "";
	}

	private String parseConditionClause(EConditionClauseDefinition constraint, String delimiter) {
		String label = "";
		if (constraint instanceof EConditionClauseDefinitionNOT) {
			EConditionClauseDefinitionNOT notConstraint = (EConditionClauseDefinitionNOT) constraint;
			label = " not (" + parseConditionClause(notConstraint.getNot(), null) + ") ";
		} else if (constraint instanceof EConditionClauseDefinitionAND) {
			EConditionClauseDefinitionAND andConstraint = (EConditionClauseDefinitionAND) constraint;
			if (andConstraint.getAnd() instanceof EConditionClauseDefinitionAssert) {
				EConditionClauseDefinitionAssert assertConstraints = (EConditionClauseDefinitionAssert) andConstraint
						.getAnd();
				label = parseConditionClause(assertConstraints, " and ");
			} else {
				label = " and (" + parseConditionClause(andConstraint.getAnd(), null) + ") ";
			}
		} else if (constraint instanceof EConditionClauseDefinitionOR) {
			EConditionClauseDefinitionOR orConstraint = (EConditionClauseDefinitionOR) constraint;
			if (orConstraint.getOr() instanceof EConditionClauseDefinitionAssert) {
				EConditionClauseDefinitionAssert assertConstraints = (EConditionClauseDefinitionAssert) orConstraint
						.getOr();
				label = parseConditionClause(assertConstraints, " or ");
			} else {
				label = " or (" + parseConditionClause(orConstraint.getOr(), null) + ")";
			}
		} else if (constraint instanceof EConditionClauseDefinitionAssert) {
			EConditionClauseDefinitionAssert assertsConstraint = (EConditionClauseDefinitionAssert) constraint;
			int index = assertsConstraint.getAssertions().size() - 1;
			for (EAssertionDefinition assertion : assertsConstraint.getAssertions()) {
				boolean placeDelimiter = delimiter != null & index-- > 0;
				label += assertion.getAttribute_name() + parseConstraint(assertion.getConstraints())
						+ (placeDelimiter ? delimiter : "");
			}
		} else {
			label = "";
		}

		return label;
	}

	private String parseConstraint(EConstraintList constraints) {
		String label = "";
		if (constraints.getList().size() == 1) {
			EConstraint constraint = constraints.getList().get(0);
			if (constraint instanceof EEqual)
				label = " = " + parse(((EEqual) constraint).getVal());
			else if (constraint instanceof EGreaterThan)
				label = " > " + parse(((EGreaterThan) constraint).getVal());
			else if (constraint instanceof EGreaterOrEqual)
				label = " >= " + parse(((EGreaterOrEqual) constraint).getVal());
			else if (constraint instanceof ELessThan)
				label = " < " + parse(((ELessThan) constraint).getVal());
			else if (constraint instanceof ELessOrEqual)
				label = " <= " + parse(((ELessOrEqual) constraint).getVal());
		}
		return label;
	}

	private String parse(EAlphaNumericValue val) {
		String label = null;
		if (val instanceof ESTRING)
			label = ((ESTRING) val).getValue();
		else if (val instanceof EFLOAT)
			label = Float.toString(((EFLOAT) val).getValue());
		else if (val instanceof ESIGNEDINT)
			label = Integer.toString(((ESIGNEDINT) val).getValue());
		return label;
	}

	private String parse(ESingleValue val) {
		String label = null;
		if (val instanceof ESTRING)
			label = ((ESTRING) val).getValue();
		else if (val instanceof EBOOLEAN)
			label = Boolean.toString(((EBOOLEAN) val).isValue());
		else if (val instanceof EFLOAT)
			label = Float.toString(((EFLOAT) val).getValue());
		else if (val instanceof ESIGNEDINT)
			label = Integer.toString(((ESIGNEDINT) val).getValue());
		return label;
	}

	public SortedSet<String> getPolicies(AADM_Model model) {
		SortedSet<String> policies = new TreeSet<String>();
		for (EPolicyDefinition policy : model.getPolicies().getPolicies()) {
			policies.add(policy.getName());
		}
		return policies;
	}

	public String getScheduleStartTime(ETriggerDefinitionBody trigger) {
		if (trigger.getSchedule() != null)
			return "start_time: " + trigger.getSchedule().getStart_time();
		return null;
	}

	public String getScheduleEndTime(ETriggerDefinitionBody trigger) {
		if (trigger.getSchedule() != null)
			return "end_time: " + trigger.getSchedule().getEnd_time();
		return null;
	}

	public String getTriggerLabel(ETriggerDefinition trigger) {
		return "trigger: " + trigger.getName();
	}

	public EList<ETriggerDefinition> getTriggerDefinitions(AADM_Model model) {
		EList<ETriggerDefinition> result = new BasicEList<>();
		if (model.getPolicies() != null) {
			for (EPolicyDefinition policy : model.getPolicies().getPolicies()) {
				if (policy.getPolicy().getTriggers() != null)
					result.addAll(policy.getPolicy().getTriggers().getTriggers());
			}
		}
		return result;
	}

	public String getPropertyLabel(EPropertyAssignment property) {
		String result = property.getName();
		return processValue(result, property.getValue());
	}

	public String getTargetBorderedLabel(EPREFIX_ID target) {
		ENodeTemplate nodeTemplate = findNode(target);
		if (nodeTemplate == null)
			return "target: "
					+ (target.getModule() != null ? target.getModule() + '/' + target.getId() : target.getId());
		else
			return "";
	}

	public String getTargetLabel(EPREFIX_ID target) {
		return "target: " + (target.getModule() != null ? target.getModule() + '/' + target.getId() : target.getId());
	}

	public String getTargetsLabel(EPolicyDefinitionBody policy) {
		String label = "targets: [";
		boolean comma = false;
		if (policy.getTargets() != null) {
			for (EPREFIX_ID target : policy.getTargets().getTarget()) {
				label += comma ? ", " + target.getId() : target.getId();
				comma = true;
			}
		}
		label += "]";
		return label;
	}

	private String processValue(String result, EAssignmentValue assignmentValue) {
		if (assignmentValue instanceof ESTRING) {
			ESTRING value = (ESTRING) assignmentValue;
			result += ": " + value.getValue();
		} else if (assignmentValue instanceof GetInput) {
			GetInput gInput = (GetInput) assignmentValue;
			String input = gInput.getInput() != null ? gInput.getInput().getName() : "";
			result += ": getInput(" + input + ")";
		} else if (assignmentValue instanceof GetProperty) {
			GetProperty gProperty = (GetProperty) assignmentValue;
			String property = gProperty.getProperty() != null ? gProperty.getProperty().getProperty().getType() : "";
			result += ": getProperty(" + property + ")";
		} else if (assignmentValue instanceof ELIST) {
			ELIST value = (ELIST) assignmentValue;
			EList list = value.getList();
			result += ": [";
			for (int i = 0; i < list.size(); i++)
				result += i > 0 ? ", " : "" + renderValue(list.get(i));
			result += "]";
		} else if (assignmentValue instanceof EMAP) {
			result += ": ...";
		} else if (assignmentValue instanceof ESIGNEDINT) {
			ESIGNEDINT value = (ESIGNEDINT) assignmentValue;
			result += ": " + value.getValue();
		}

		return result;
	}

	private String renderValue(Object eanValue) {
		String value = null;
		if (eanValue instanceof ESTRING)
			value = "\"" + ((ESTRING) eanValue).getValue() + "\"";
		else if (eanValue instanceof EFLOAT)
			value = String.valueOf(((EFLOAT) eanValue).getValue());
		else if (eanValue instanceof ESIGNEDINT)
			value = String.valueOf(((ESIGNEDINT) eanValue).getValue());
		return value;
	}

	private String editableRenderValue(Object eanValue) {
		String value = null;
		if (eanValue instanceof ESTRING)
			value = ((ESTRING) eanValue).getValue();
		else if (eanValue instanceof EFLOAT)
			value = String.valueOf(((EFLOAT) eanValue).getValue());
		else if (eanValue instanceof ESIGNEDINT)
			value = String.valueOf(((ESIGNEDINT) eanValue).getValue());
		return value;
	}

	public String getAttributeLabel(EAttributeAssignment attribute) {
		String result = attribute.getName();
		return processValue(result, attribute.getValue());
	}

	public String getRequirementNodeLabel(ERequirementAssignment requirement) {
		return requirement.getName() + ": [ node: " + requirement.getNode() + "]";
	}

	public String getRequirementLabel(EObject object) {
		if (object instanceof ERequirementAssignment) {
			ERequirementAssignment requirement = (ERequirementAssignment) object;
			return "req:" + requirement.getName();
		} else if (object instanceof EPREFIX_TYPE) {
			EPREFIX_TYPE prefixType = (EPREFIX_TYPE) object;
			return "req:" + getLastSegment(prefixType.getType(), ".");
		} else
			return null;
	}

	public String getTypeLabel(ENodeTemplateBody node) {
		registerAADMModelChangeTrigger(node);
		String type = (node.getType().getModule() != null ? node.getType().getModule() + "/" : "")
				+ node.getType().getType();
		return type.substring(type.lastIndexOf('.') + 1);
	}

	public String getPolicyTypeLabel(EPolicyDefinitionBody policy) {
		registerAADMModelChangeTrigger(policy);
		String type = (policy.getType().getModule() != null ? policy.getType().getModule() + "/" : "")
				+ policy.getType().getType();
		return type.substring(type.lastIndexOf('.') + 1);
	}

	public String getTypeDescription(ENodeTemplateBody node) {
		return "description: " + node.getDescription();
	}

	public int getTypeSize(ENodeTemplateBody node) {
		String type = (node.getType().getModule() != null ? node.getType().getModule() + "/" : "")
				+ node.getType().getType();
		int size = type.substring(type.lastIndexOf('.') + 1).length();
		return size;
	}

	public void addCallAction(ETriggerDefinition trigger, String operation) {
		ECallOperationActivityDefinition callOperationActivity = createCallOperationActivityDefinition(operation);
		trigger.getTrigger().getAction().getList().add(callOperationActivity);
	}

	public void cancelAddAction(ETriggerDefinition trigger, Integer size) {
		if (trigger.getTrigger().getAction().getList().size() != size)
			trigger.getTrigger().getAction().getList().remove(size);
	}

	public void createTrigger(AADM_Model model, String policyName) {
		EPolicyDefinition policy = AADMHelper.findPolicy(model, policyName);
		if (policy.getPolicy().getTriggers() == null) {
			policy.getPolicy().setTriggers(createETriggerDefinitions());
		}
		policy.getPolicy().getTriggers().getTriggers().add(createETriggerDefinition());
	}

	public void editCallOperation(ETriggerDefinition trigger, Integer index,
			ECallOperationActivityDefinition callOperation, String newOperation) {
		callOperation.getOperation().getOperation().setModule(getTrailingSegment(newOperation, "/"));
		callOperation.getOperation().getOperation().setType(getLastSegment(newOperation, "/"));
	}

	public void removeCallOperation(ECallOperationActivityDefinition callOperation) {
		ETriggerDefinitionBody trigger = (ETriggerDefinitionBody) callOperation.eContainer().eContainer();
		trigger.getAction().getList().remove(callOperation);
	}

	public void addStringToPropertyValueList(EPropertyAssignment prop) {
		System.out.println("Requested to add string to property list value. Property: " + prop.getName());
	}

	public void addImport(AADM_Model model, String _import) {
		model.getImports().add(_import);
	}

	public void cancelAddImport(AADM_Model model, Integer size) {
		// Nothing to do
	}

	public void editImport(AADM_Model model, Integer index, String oldValue, String newValue) {
		model.getImports().set(index - 1, newValue);
	}

	public void removeImport(AADM_Model model, Integer index) {
		model.getImports().remove(index - 1);
	}

	public void addItemToPropertyValueList(ELIST list, String item) {
		System.out.println("Requested to add item to property list value. List: " + list + ". Item: " + item);
		EAlphaNumericValue value = (EAlphaNumericValue) createValue(item);
		list.getList().add(value);
	}

	public void cancelAddItemToPropertyValueList(ELIST list, Integer size) {
		System.out.println("Requested to cancel the addition of item to property list value. List: " + list
				+ ". Default size: " + size);
		if (list.getList().size() != size)
			list.getList().remove(size);
	}

	public void removeItemFromPropertyValueList(EObject item) {
		System.out.println("Requested to remove item: " + item);
		ELIST list = (ELIST) item.eContainer();
		list.getList().remove(item);
	}

	public void removeItemFromPropertyValueMap(EPropertyAssignment property,
			ArrayList<Map<EMapEntry, Integer>> selections) {
		for (Map<EMapEntry, Integer> selection : selections) {
			EMapEntry entry = selection.keySet().iterator().next();
			((EMAP) entry.eContainer()).getMap().remove(entry);
		}
	}

	public void removeConstraintClause(ETriggerDefinition trigger, ArrayList<Map<EObject, Integer>> clauses) {
		for (Map<EObject, Integer> selection : clauses) {
			EObject entry = selection.keySet().iterator().next();
			if (entry instanceof EAssertionDefinition) {
				EAssertionDefinition assertion = (EAssertionDefinition) entry;
				((EConditionClauseDefinitionAssert) assertion.eContainer()).getAssertions().remove(assertion);
			} else if (entry instanceof EConditionClauseDefinition) {
				EObject parent = entry.eContainer();
				if (parent instanceof EConditionClauseDefinitionAND) {
					((EConditionClauseDefinitionAND) parent).setAnd(null);
				} else if (parent instanceof EConditionClauseDefinitionOR) {
					((EConditionClauseDefinitionOR) parent).setOr(null);
				} else if (parent instanceof EConditionClauseDefinitionNOT) {
					((EConditionClauseDefinitionNOT) parent).setNot(null);
				} else if (parent instanceof EExtendedTriggerCondition) {
					((EExtendedTriggerCondition) parent).setConstraint(null);
				}
			}
		}
	}

	public String renderEMapEntryKey(EPropertyAssignment property, Map<EMapEntry, Integer> selection) {
		return selection.keySet().iterator().next().getKey();
	}

	public String renderEMapEntryValue(EPropertyAssignment property, Map<EMapEntry, Integer> selection) {
		return editableRenderValue(selection.keySet().iterator().next().getValue());
	}

	public boolean isValueEditable(EPropertyAssignment property, Map<EMapEntry, Integer> selection) {
		return !(selection.keySet().iterator().next().getValue() instanceof EMAP);
	}

	public void editEMapEntryKey(EPropertyAssignment property, Map<EMapEntry, Integer> oldValue, String newValue) {
		oldValue.keySet().iterator().next().setKey(newValue);
	}

	public void editEMapEntryValue(EPropertyAssignment property, Map<EMapEntry, Integer> oldValue, String newValue) {
		oldValue.keySet().iterator().next().setValue((EAssignmentValue) createValue(newValue));
	}

	public void editItemInPropertyValueList(ELIST list, Integer index, EAlphaNumericValue oldValue, String newValue) {
		System.out.println("Requested to edit an item in a property list value. List: " + list + ". Index: " + index
				+ ". NewValue: " + newValue + ". OldValue: " + oldValue);
		EAlphaNumericValue value = (EAlphaNumericValue) createValue(newValue);
		list.getList().set(index - 1, value);
	}

	public SortedSet<String> getNodes(ERequirementAssignment req) {
		ENodeTemplates container = (ENodeTemplates) req.eContainer().eContainer().eContainer().eContainer();
		Set<String> nodes = container.getNodeTemplates().stream().map(ENodeTemplate::getName)
				.collect(Collectors.toSet());
		return new TreeSet<String>(nodes);
	}

	public SortedSet<String> getInputs(EPropertyAssignment prop) {
		SortedSet<String> result = new TreeSet<String>();
		AADM_Model model = AADM_Helper.findModel(prop);
		for (EParameterDefinition input : model.getInputs().getInputs()) {
			result.add(input.getName());
		}
		return result;
	}

	public void setInput(GetInput gInput, String input) {
		AADM_Model model = AADM_Helper.findModel(gInput);
		for (EParameterDefinition pd : model.getInputs().getInputs()) {
			if (input.equals(pd.getName())) {
				gInput.setInput(pd);
				break;
			}
		}
	}

	public Set<String> getOptimizations(ENodeTemplate node) {
		return AADMScopeProvider.getOptimizationModels();
	}

	public Optimization_Model findOptimizationModel(String optimizationName) {
		return AADMScopeProvider.findOptimizationModel(optimizationName);
	}

	public String getOptimization(ENodeTemplate node) {
		if (node.getNode().getOptimization() != null)
			return node.getNode().getOptimization().getName();
		else
			return "";
	}

	public ENodeTemplate findNode(ERequirementAssignment req) {
		System.out.println("Invoked findNode with req: " + req);
		return AADM_Helper.findNode(req, req.getNode().getId());
	}

	public ENodeTemplate findNode(EPREFIX_REF prefix_ref) {
		String id = null;
		if (prefix_ref instanceof EPREFIX_TYPE)
			id = ((EPREFIX_TYPE) prefix_ref).getType();
		else if (prefix_ref instanceof EPREFIX_ID)
			id = ((EPREFIX_ID) prefix_ref).getId();
		return AADM_Helper.findNode(prefix_ref, id);
	}

	public ERequirementAssignment findRequirement(EPREFIX_TYPE prefix_type) {
		ERequirementAssignment req = null;
		String module = AADM_Helper.getModule(prefix_type);
		String req_module = prefix_type.getModule();
		if ((module == null && req_module == null) || (module != null && (module.equals(req_module)))
				|| (req_module != null && (req_module.equals(module)))) {
			String reqName = getLastSegment(prefix_type.getType(), ".");
			String nodeName = getTrailingSegment(prefix_type.getType(), ".");
			ENodeTemplate template = AADM_Helper.findNode(prefix_type, nodeName);
			return AADM_Helper.findRequirementInTemplate(reqName, template);
		}
		return req;
	}

	private String getLastSegment(String string, String delimiter) {
		String newString = string;
		if (string.endsWith(delimiter))
			newString = string.substring(0, string.length() - delimiter.length());
		return newString.substring(newString.lastIndexOf(delimiter) + 1);
	}

	private String getTrailingSegment(String string, String delimiter) {
		String newString = string;
		if (string.endsWith(delimiter))
			newString = string.substring(0, string.length() - delimiter.length());
		return newString.substring(0, newString.lastIndexOf(delimiter));
	}

	public String renderRequirement(EPREFIX_TYPE req) throws Exception {
		return AADM_Helper.renderType(req);
	}

	public String renderCapability(EPREFIX_TYPE cap) throws Exception {
		return AADM_Helper.renderType(cap);
	}

	public String renderRequirementNode(ERequirementAssignment req) throws Exception {
		return AADM_Helper.renderPrefixId(req.getNode());
	}

	public String renderNodeType(ENodeTemplate node) throws Exception {
		return AADM_Helper.renderType(node.getNode().getType());
	}

	public String renderNodeTemplate(EPREFIX_ID template) throws Exception {
		return AADM_Helper.renderPrefixId(template);
	}

	public String renderPolicyType(EPolicyDefinition policy) throws Exception {
		return AADM_Helper.renderType(policy.getPolicy().getType());
	}

	public String renderParameterType(EParameterDefinition par) throws Exception {
		registerAADMModelChangeTrigger(par);
		return AADM_Helper.renderType(par.getParameter().getType());
	}

	public String renderListItem(EObject object, EObject item) throws Exception {
		if (item instanceof ESTRING)
			return ((ESTRING) item).getValue();
		else if (item instanceof ESIGNEDINT)
			return String.valueOf(((ESIGNEDINT) item).getValue());
		else
			return "UNRENDERED_VALUE";
	}

	public List<Map<EObject, Integer>> getNestedList(EPropertyAssignment object) throws Exception {
		if (object.getValue() instanceof EMAP) {
			List<Map<EObject, Integer>> nestedList = new ArrayList<>();
			EMAP map = (EMAP) object.getValue();
			addNestedElements(nestedList, map.getMap(), 0);
			return nestedList;
		}
		return null;
	}

	public List<Map<EObject, Integer>> getConstraintList(ETriggerDefinition trigger) throws Exception {
		List<Map<EObject, Integer>> constraintList = new ArrayList<>();
		EConditionClauseDefinition condition = trigger.getTrigger().getCondition().getConstraint();
		if (condition != null) {
			addNestedConstraint(constraintList, condition, 0);
		}
		return constraintList;
	}

	private void addNestedConstraint(List<Map<EObject, Integer>> constraintList, EObject condition, int depth) {
		if (!(condition instanceof EConditionClauseDefinitionAssert)) {
			Map<EObject, Integer> entry = new HashMap<>();
			entry.put(condition, depth);
			constraintList.add(entry);
		}

		if (condition instanceof EConditionClauseDefinitionAND) {
			addNestedConstraint(constraintList, ((EConditionClauseDefinitionAND) condition).getAnd(), depth + 1);
		} else if (condition instanceof EConditionClauseDefinitionOR) {
			addNestedConstraint(constraintList, ((EConditionClauseDefinitionOR) condition).getOr(), depth + 1);
		} else if (condition instanceof EConditionClauseDefinitionNOT) {
			addNestedConstraint(constraintList, ((EConditionClauseDefinitionNOT) condition).getNot(), depth + 1);
		} else if (condition instanceof EConditionClauseDefinitionAssert) {
			for (EAssertionDefinition _assert : ((EConditionClauseDefinitionAssert) condition).getAssertions())
				addNestedConstraint(constraintList, _assert, depth + 1);
		}
	}

	private void addNestedElements(List<Map<EObject, Integer>> nestedList, EList<EMapEntry> elementsToAdd, int depth) {
		for (EMapEntry element : elementsToAdd) {
			Map<EObject, Integer> entry = new HashMap<>();
			entry.put(element, depth);
			nestedList.add(entry);
			if (element.getValue() instanceof EMAP) {
				addNestedElements(nestedList, ((EMAP) element.getValue()).getMap(), depth + 1);
			}
		}
	}

	public String renderNestedItem(EPropertyAssignment property, Map<EObject, Integer> item) throws Exception {
		EMapEntry entry = (EMapEntry) item.keySet().iterator().next();
		if (entry.getValue() instanceof EMAP) {
			return getIndentation(item.get(entry)) + entry.getKey() + ":";
		} else {
			return getIndentation(item.get(entry)) + entry.getKey() + ": " + renderValue(entry.getValue());
		}
	}

	public String renderConstraintItem(EObject constraint, Map<EObject, Integer> item) throws Exception {
		EObject condition = item.keySet().iterator().next();
		String render = null;
		if (condition instanceof EConditionClauseDefinitionAND) {
			render = getIndentation(item.get(condition)) + "and:";
		} else if (condition instanceof EConditionClauseDefinitionOR) {
			render = getIndentation(item.get(condition)) + "or:";
		} else if (condition instanceof EConditionClauseDefinitionNOT) {
			render = getIndentation(item.get(condition)) + "not:";
		} else if (condition instanceof EAssertionDefinition) {
			render = getIndentation(item.get(condition))
					+ renderEConditionClauseDefinitionAssert((EAssertionDefinition) condition);
		}
		return render;
	}

	private String renderEConditionClauseDefinitionAssert(EAssertionDefinition assertion) {
		return assertion.getAttribute_name() + ": [" + renderEConstraintList(assertion.getConstraints()) + "]";
	}

	private String renderEConstraintList(EConstraintList constraints) {
		if (constraints.getList().isEmpty())
			return "";
		StringBuffer sb = new StringBuffer(renderEConstraint(constraints.getList().get(0)));
		for (int i = 1; i < constraints.getList().size(); i++)
			sb.append(',' + renderEConstraint(constraints.getList().get(i)));
		return sb.toString();
	}

	private String renderEConstraint(EConstraint constraint) {
		String render = null;
		if (constraint instanceof EEqual) {
			render = "equal: " + renderESingleValue(((EEqual) constraint).getVal());
		} else if (constraint instanceof EGreaterThan) {
			render = "greater_than: " + renderEAlphaNumericValue(((EGreaterThan) constraint).getVal());
		} else if (constraint instanceof EGreaterOrEqual) {
			render = "greater_or_equal: " + renderEAlphaNumericValue(((EGreaterOrEqual) constraint).getVal());
		} else if (constraint instanceof ELessThan) {
			render = "less_than: " + renderEAlphaNumericValue(((ELessThan) constraint).getVal());
		} else if (constraint instanceof ELessOrEqual) {
			render = "less_or_equal: " + renderEAlphaNumericValue(((ELessOrEqual) constraint).getVal());
		} else if (constraint instanceof EInRange) {
			render = "in_range: [" + renderEAlphaNumericValue(((EInRange) constraint).getStart()) + ", "
					+ renderEAlphaNumericValue(((EInRange) constraint).getEnd()) + "]";
		} else if (constraint instanceof EValid_Values) {
			render = "valid_values: " + renderEList(((EValid_Values) constraint).getVal());
		} else if (constraint instanceof ELength) {
			render = "length: " + renderEAlphaNumericValue(((ELength) constraint).getVal());
		} else if (constraint instanceof EMinLength) {
			render = "min_length: " + renderEAlphaNumericValue(((EMinLength) constraint).getVal());
		} else if (constraint instanceof EMaxLength) {
			render = "max_length: " + renderEAlphaNumericValue(((EMaxLength) constraint).getVal());
		}
		return render;
	}

	private String renderEList(ELIST val) {
		StringBuffer sb = new StringBuffer('[');
		boolean firstValue = true;
		for (EAlphaNumericValue value : val.getList()) {
			sb.append(firstValue ? "" : "," + renderEAlphaNumericValue(value));
			firstValue = false;
		}
		sb.append(']');
		return sb.toString();
	}

	private String renderESingleValue(ESingleValue value) {
		String render = null;
		if (value instanceof ESTRING) {
			render = ((ESTRING) value).getValue();
		} else if (value instanceof EFLOAT) {
			render = Float.toString(((EFLOAT) value).getValue());
		} else if (value instanceof ESIGNEDINT) {
			render = Integer.toString(((ESIGNEDINT) value).getValue());
		} else if (value instanceof EBOOLEAN) {
			render = Boolean.toString(((EBOOLEAN) value).isValue());
		}
		return render;
	}

	private String renderEAlphaNumericValue(EAlphaNumericValue value) {
		String render = null;
		if (value instanceof ESTRING) {
			render = ((ESTRING) value).getValue();
		} else if (value instanceof EFLOAT) {
			render = Float.toString(((EFLOAT) value).getValue());
		} else if (value instanceof ESIGNEDINT) {
			render = Integer.toString(((ESIGNEDINT) value).getValue());
		}
		return render;
	}

	private String getIndentation(Integer depth) {
		String indentation = "";
		String ind = "    ";
		int i = 0;
		while (i++ < depth)
			indentation += ind;
		return indentation;
	}

	public SortedSet<String> getPropertyEntities(EPropertyAssignment property) {
		return new TreeSet<String>(Arrays.asList(new String[] { "SELF", "SOURCE", "TARGET", "HOST" }));
	}

	public String renderGetPropertyReq_Cap(EPropertyAssignment property) {
		EPREFIX_TYPE req_cap = ((GetProperty) property.getValue()).getProperty().getReq_cap();
		if (req_cap != null)
			return AADM_Helper.renderType(req_cap);
		else
			return "";
	}

	public String renderGetPropertyProperty(EPropertyAssignment property) {
		EPREFIX_TYPE prop = ((GetProperty) property.getValue()).getProperty().getProperty();
		return AADM_Helper.renderType(prop);
	}

	public String renderParameterType(EParameterDefinitionBody parameter) {
		EDataTypeName type = parameter.getType();
		return "type: " + AADM_Helper.renderType(type);
	}

	public SortedSet<String> getPropertyReq_Cap(EPropertyAssignment property) {
		SortedSet<String> proposals = new TreeSet<String>();
		String module = AADM_Helper.getModule(property);
		// Get entity in this GetProperty body. If null, return
		ENodeTemplate node = getEntity(property);

		if (node == null)
			return proposals;

		// Find requirements and capability assignments defined within the entity
		if (node.getNode().getRequirements() != null)
			for (ERequirementAssignment req : node.getNode().getRequirements().getRequirements()) {
				proposals.add(module + '/' + node.getName() + '.' + req.getName());
			}

		if (node.getNode().getCapabilities() != null)
			for (ECapabilityAssignment cap : node.getNode().getCapabilities().getCapabilities()) {
				proposals.add(module + '/' + node.getName() + '.' + cap.getName());
			}

		return proposals;
	}

	public SortedSet<String> getPropertyProperty(EPropertyAssignment property) {
		SortedSet<String> proposals = new TreeSet<String>();
		String module = AADM_Helper.getModule(property);
		// Get entity in this GetProperty body. If null, return
		ENodeTemplate node = getEntity(property);
		if (node == null)
			return proposals;
		GetPropertyBody body = ((GetProperty) property.getValue()).getProperty();
		// Get the properties defined within the selected node requirements or
		// capabilities
		if (body.getReq_cap() != null) {
			String req_cap_name = AADM_Helper.getLastSegment(body.getReq_cap().getType(), ".");
			ENodeTemplate req_node = AADM_Helper.findRequirementNodeInTemplate(req_cap_name, node);
			if (req_node != null)
				for (EPropertyAssignment prop : req_node.getNode().getProperties().getProperties())
					proposals.add(module + '/' + req_node.getName() + "." + prop.getName());
			// else
			// TODO Find requirement node in KB
			ECapabilityAssignment cap = AADM_Helper.findCapabilityInTemplate(req_cap_name, node);
			if (cap != null)
				for (EPropertyAssignment prop : cap.getProperties().getProperties())
					proposals.add(prop.getName());
		} else {
			// Get the properties defined within the entity
			for (EPropertyAssignment prop : node.getNode().getProperties().getProperties())
				proposals.add(prop.getName());
		}

		return proposals;
	}

	private ENodeTemplate getEntity(EPropertyAssignment property) {
		GetPropertyBody body = ((GetProperty) property.getValue()).getProperty();
		EEntityReference eEntityReference = body.getEntity();
		ENodeTemplate entity = null;
		if (eEntityReference instanceof EEntity) {
			EEntity eEntity = (EEntity) eEntityReference;
			if (eEntity.getEntity().equals("SELF")) {
				entity = (ENodeTemplate) AADM_Helper.getNodeTemplate(property);
			}
		} else {
			// TODO Support other entities: TARGET, HOST, SOURCE and concrete entity
		}
		return entity;
	}

	public void setValue(EPropertyAssignment prop, String value) {
		EAssignmentValue newValue = (EAssignmentValue) createValue(value);
		prop.setValue(newValue);
	}

	public void setValueType(EPropertyAssignment prop, String valueType) {
		AADM_Model model = AADM_Helper.findModel(prop);
		EAssignmentValue newValue = (EAssignmentValue) createValueType(valueType, model);
		prop.setValue(newValue);
	}

	public void setValue(EAttributeAssignment attr, String value) {
		EAssignmentValue newValue = (EAssignmentValue) createValue(value);
		attr.setValue(newValue);
	}

	private EObject createValueType(String type, AADM_Model model) {
		if (type.equals("Single Value"))
			return createStringValue();
		else if (type.equals("List"))
			return createListValue();
		else if (type.equals("Nested Value"))
			return createMapValue();
		else if (type.equals("Get Property"))
			return createGetPropertyValue();
		else if (type.equals("Get Input"))
			return createGetInputValue(model);
		else
			return null;
	}

	private EObject createValue(String value) {
		// Try boolean value
		if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) {
			return createBooleanValue(value);
		}

		// Try integer or float
		try {
			ESIGNEDINT eInt = createIntegerValue(value);
			return eInt;
		} catch (NumberFormatException ex1) {
			try {
				EFLOAT eFloat = createFloatValue(value);
				return eFloat;
			} catch (NumberFormatException ex2) {
				// String value
				ESTRING eString = createStringValue(value);
				return eString;
			}
		}
	}

	private EBOOLEAN createBooleanValue(String value) {
		EBOOLEAN eBoolean = RMFactory.eINSTANCE.createEBOOLEAN();
		eBoolean.setValue(Boolean.valueOf(value));
		return eBoolean;
	}

	private ESTRING createStringValue() {
		return createStringValue("value");
	}

	private ESTRING createStringValue(String value) {
		ESTRING eString = RMFactory.eINSTANCE.createESTRING();
		eString.setValue(value);
		return eString;
	}

	private ESIGNEDINT createIntegerValue(String value) {
		ESIGNEDINT eInt = RMFactory.eINSTANCE.createESIGNEDINT();
		eInt.setValue(Integer.valueOf(value));
		return eInt;
	}

	private ELIST createListValue() {
		return RMFactory.eINSTANCE.createELIST();
	}

	private EMAP createMapValue() {
		EMAP map = RMFactory.eINSTANCE.createEMAP();
		EMapEntry entry = RMFactory.eINSTANCE.createEMapEntry();
		ESTRING value = RMFactory.eINSTANCE.createESTRING();
		value.setValue("value");
		entry.setKey("key");
		entry.setValue(value);
		map.getMap().add(entry);
		return map;
	}

	private GetProperty createGetPropertyValue() {
		GetProperty getProperty = RMFactory.eINSTANCE.createGetProperty();
		GetPropertyBody body = RMFactory.eINSTANCE.createGetPropertyBody();
		EEntity entity = RMFactory.eINSTANCE.createEEntity();
		entity.setEntity("SELF");
		body.setEntity(entity);
		EPREFIX_TYPE property = RMFactory.eINSTANCE.createEPREFIX_TYPE();
		property.setType("");
		body.setProperty(property);
		getProperty.setProperty(body);
		return getProperty;
	}

	private GetInput createGetInputValue(AADM_Model model) {
		GetInput getInput = RMFactory.eINSTANCE.createGetInput();
		List<EParameterDefinition> inputs = AADM_Helper.findInputs(model);
		if (!inputs.isEmpty()) {
			getInput.setInput(inputs.get(0));
		} else {
			// TODO Create input
		}
		return getInput;
	}

	private ETriggerDefinitions createETriggerDefinitions() {
		return AADMFactory.eINSTANCE.createETriggerDefinitions();
	}

	private ENodeTemplates createENodeTemplates() {
		return AADMFactory.eINSTANCE.createENodeTemplates();
	}

	private ETriggerDefinition createETriggerDefinition() {
		ETriggerDefinition trigger = RMFactory.eINSTANCE.createETriggerDefinition();
		ETriggerDefinitionBody body = RMFactory.eINSTANCE.createETriggerDefinitionBody();
		EActivityDefinitions actions = RMFactory.eINSTANCE.createEActivityDefinitions();
		ECallOperationActivityDefinition action = RMFactory.eINSTANCE.createECallOperationActivityDefinition();
		ECallOperationActivityDefinitionBody actionBody = RMFactory.eINSTANCE
				.createECallOperationActivityDefinitionBody();
		EPREFIX_TYPE operation = RMFactory.eINSTANCE.createEPREFIX_TYPE();
		operation.setModule("tosca");
		operation.setType("tosca.interfaces.node.lifecycle.Standard.create");
		actionBody.setOperation(operation);
		action.setOperation(actionBody);
		actions.getList().add(action);
		body.setEvent("event_name");
		body.setAction(actions);
		trigger.setName("new.trigger.definition");
		trigger.setTrigger(body);
		return trigger;
	}

	private EFLOAT createFloatValue(String value) {
		EFLOAT eInt = RMFactory.eINSTANCE.createEFLOAT();
		eInt.setValue(Float.valueOf(value));
		return eInt;
	}

	private EPREFIX_ID createNodeRef(String value) {
		EPREFIX_ID nodeRed = RMFactory.eINSTANCE.createEPREFIX_ID();
		nodeRed.setModule(parseModule(value));
		nodeRed.setId(parseType(value));
		return nodeRed;
	}

	private ECallOperationActivityDefinition createCallOperationActivityDefinition(String operation) {
		ECallOperationActivityDefinition callOperationActivityDefinition = RMFactory.eINSTANCE
				.createECallOperationActivityDefinition();
		ECallOperationActivityDefinitionBody body = RMFactory.eINSTANCE.createECallOperationActivityDefinitionBody();
		EPREFIX_TYPE type = RMFactory.eINSTANCE.createEPREFIX_TYPE();
		type.setModule(getTrailingSegment(operation, "/"));
		type.setType(getLastSegment(operation, "/"));
		body.setOperation(type);
		callOperationActivityDefinition.setOperation(body);
		return callOperationActivityDefinition;
	}

	public void setNodeType(ENodeTemplate node, String value) {
		String module = parseModule(value);
		String type = parseType(value);
		node.getNode().getType().setModule(module);
		node.getNode().getType().setType(type);
	}

	public void setParameterType(EParameterDefinition par, String value) {
		String module = parseModule(value);
		String type = parseType(value);
		par.getParameter().getType().setType(value);
	}

	public void setPolicyType(EPolicyDefinition policy, String newType) {
		String module = parseModule(newType);
		String type = parseType(newType);
		policy.getPolicy().getType().setModule(module);
		policy.getPolicy().getType().setType(type);
	}

	public void setOptimization(ENodeTemplate node, String optimization) {
		Optimization_Model optimization_model = findOptimizationModel(optimization);
		node.getNode().setOptimization(optimization_model);
	}

	public void setRequirementNode(ERequirementAssignment req, String node) {
		req.setNode(createNodeRef(node));
	}

	public void setRequirementNode(ERequirementAssignment req, ENodeTemplate node) {
		String module = AADM_Helper.getModule(node);
		String nodeRef = module != null ? module + node.getName() : node.getName();
		req.setNode(createNodeRef(nodeRef));
	}

	public void setPolicyTarget(EPREFIX_ID target, ENodeTemplate node) {
		String module = AADM_Helper.getModule(node);
		target.setModule(module);
		target.setId(node.getName());
	}

	public void setEventFilterNode(EPREFIX_ID target, ENodeTemplate node) {
		String module = AADM_Helper.getModule(node);
		target.setModule(module);
		target.setId(node.getName());
	}

	public void setEventFilterRequirement(EPREFIX_TYPE target, ERequirementAssignment req) {
		String module = AADM_Helper.getModule(req);
		String node = ((ENodeTemplate) req.eContainer().eContainer().eContainer()).getName();
		target.setModule(module);
		target.setType(node + "." + req.getName());
	}

	public void setPolicyTarget(EPREFIX_ID object, String target) {
		object.setModule(getTrailingSegment(target, "/"));
		object.setId(getLastSegment(target, "/"));
	}

	public void setTargetFilterNode(EPREFIX_ID object, String node) {
		EEvenFilter filter = (EEvenFilter) object.eContainer();
		EPREFIX_ID prefix = (EPREFIX_ID) filter.getNode();
		if (node.contains("/")) {
			prefix.setModule(getTrailingSegment(node, "/"));
			prefix.setId(getLastSegment(node, "/"));
		} else {
			prefix.setId(node);
		}
	}

	public void setTargetFilterRequirement(EPREFIX_TYPE object, String req) {
		EEvenFilter filter = (EEvenFilter) object.eContainer();
		EPREFIX_TYPE prefix = (EPREFIX_TYPE) filter.getRequirement();
		if (req.contains("/")) {
			prefix.setModule(getTrailingSegment(req, "/"));
			prefix.setType(getLastSegment(req, "/"));
		} else {
			prefix.setType(req);
		}
	}

	public void setTargetFilterCapability(EPREFIX_TYPE object, String cap) {
		EEvenFilter filter = (EEvenFilter) object.eContainer();
		EPREFIX_TYPE prefix = (EPREFIX_TYPE) filter.getCapability();
		if (cap.contains("/")) {
			prefix.setModule(getTrailingSegment(cap, "/"));
			prefix.setType(getLastSegment(cap, "/"));
		} else {
			prefix.setType(cap);
		}
	}

	private String parseModule(String value) {
		String[] split = value.split("/");
		if (split.length > 1)
			return split[0];
		else
			return null;
	}

	private String parseType(String value) {
		String[] split = value.split("/");
		if (split.length > 1)
			return split[1];
		else
			return split[0];
	}

	public SortedSet<String> getPropertyValueTypes(EObject ignored) {
		return Services.valueTypes;
	}

	public SortedSet<String> getClauseTypes(EObject ignored) {
		return Services.clauseTypes;
	}

	public String getValueType(EPropertyAssignment property, String newEntry) {
		// Find new created nested property by name: newNestedProperty, and return
		// is value type
		if (property.getValue() instanceof EMAP) {
			EList map = ((EMAP) property.getValue()).getMap();
			return findPropertyByNameInMap(newEntry, map);
		}
		return null;
	}

	private String findPropertyByNameInMap(String target, EList<EMapEntry> map) {
		if (target != null)
			for (EMapEntry entry : map) {
				if (entry.getKey().equals(target)) {
					return renderPropertyValueType(entry);
				}
				if (entry.getValue() instanceof EMAP) {
					String found = findPropertyByNameInMap(target, ((EMAP) entry.getValue()).getMap());
					if (found != null)
						return found;
				}
			}
		return null;
	}

	public String addNewNestedProperty(EPropertyAssignment property, ArrayList<Map<EObject, Integer>> selection,
			String newType) {
		EMapEntry newEntry = createEMapEntry(newType, AADM_Helper.findModel(property));
		if (selection.isEmpty()) {
			// Add new nested property of given type to root property
			if (property.getValue() instanceof EMAP) {
				((EMAP) property.getValue()).getMap().add(newEntry);
			}
		} else if (selection.size() == 1) { // Only one selection allowed
			// Add new nested property of given type to selected property
			EMapEntry selectedEntry = (EMapEntry) selection.get(0).keySet().iterator().next();
			if (selectedEntry.getValue() instanceof EMAP) {
				((EMAP) selectedEntry.getValue()).getMap().add(newEntry);
			}
		}
		return newEntry.getKey();
	}

	public boolean canAddClause(ETriggerDefinition trigger, ArrayList<Map<EObject, Integer>> selection) {
		return (trigger.getTrigger().getCondition().getConstraint() == null)
				|| (trigger.getTrigger().getCondition().getConstraint() != null && selection.size() == 1);
	}

	public boolean canNotAddClause(ETriggerDefinition trigger, ArrayList<Map<EObject, Integer>> selection) {
		return !canAddClause(trigger, selection);
	}

	public String addClause(ETriggerDefinition trigger, ArrayList<Map<EObject, Integer>> selection, String newType) {
		if (selection.isEmpty()) {
			EConditionClauseDefinition root = trigger.getTrigger().getCondition().getConstraint();
			if (root == null) { // Insert new clause at root level if no condition available
				insertEConditionClauseDefinition(newType, trigger.getTrigger().getCondition());
			}
		} else { // Insert clause in selection
			EConditionClauseDefinition parent = (EConditionClauseDefinition) selection.get(0).keySet().iterator()
					.next();
			insertEConditionClauseDefinition(newType, parent);
		}
		return newType;
	}

	private void insertEConditionClauseDefinition(String newType, EObject parent) {
		EObject clause = null;
		if ("Not".equals(newType)) {
			clause = createEConditionClauseDefinitionNOT();
		} else if ("And".equals(newType)) {
			clause = createEConditionClauseDefinitionAND();
		} else if ("Or".equals(newType)) {
			clause = createEConditionClauseDefinitionOR();
		} else if ("Assertion".equals(newType)) {
			clause = createEAssertionDefinition();
		}
		if (clause != null)
			insertClause(clause, parent);
	}

	private void insertClause(EObject clause, EObject parent) {
		if (clause instanceof EAssertionDefinition) {
			if (!(parent instanceof EConditionClauseDefinitionAssert)) {
				EConditionClauseDefinitionAssert ccda = getEConditionClauseDefinitionAssert(
						(EConditionClauseDefinition) parent);
				if (ccda == null) {
					ccda = createEConditionClauseDefinitionAssertion();
					insertClause(ccda, parent);
				}
				ccda.getAssertions().add((EAssertionDefinition) clause);
			} else {
				((EConditionClauseDefinitionAssert) parent).getAssertions().add((EAssertionDefinition) clause);
			}
		} else if (clause instanceof EConditionClauseDefinition) {
			if (parent instanceof EConditionClauseDefinitionAND) {
				((EConditionClauseDefinitionAND) parent).setAnd((EConditionClauseDefinition) clause);
			} else if (parent instanceof EConditionClauseDefinitionOR) {
				((EConditionClauseDefinitionOR) parent).setOr((EConditionClauseDefinition) clause);
			} else if (parent instanceof EConditionClauseDefinitionNOT) {
				((EConditionClauseDefinitionNOT) parent).setNot((EConditionClauseDefinition) clause);
			} else if (parent instanceof EExtendedTriggerCondition) {
				((EExtendedTriggerCondition) parent).setConstraint((EConditionClauseDefinition) clause);
			}
		}
	}

	private EConditionClauseDefinitionAssert getEConditionClauseDefinitionAssert(EConditionClauseDefinition parent) {
		EConditionClauseDefinitionAssert ccda = null;
		EObject candidate = null;
		if (parent instanceof EConditionClauseDefinitionAND) {
			candidate = ((EConditionClauseDefinitionAND) parent).getAnd();
		} else if (parent instanceof EConditionClauseDefinitionOR) {
			candidate = ((EConditionClauseDefinitionOR) parent).getOr();
		} else if (parent instanceof EConditionClauseDefinitionNOT) {
			candidate = ((EConditionClauseDefinitionNOT) parent).getNot();
		}
		ccda = (candidate instanceof EConditionClauseDefinitionAssert) ? (EConditionClauseDefinitionAssert) candidate
				: null;
		return ccda;
	}

	private EConditionClauseDefinitionNOT createEConditionClauseDefinitionNOT() {
		return RMFactory.eINSTANCE.createEConditionClauseDefinitionNOT();
	}

	private EConditionClauseDefinitionAND createEConditionClauseDefinitionAND() {
		return RMFactory.eINSTANCE.createEConditionClauseDefinitionAND();
	}

	private EConditionClauseDefinitionOR createEConditionClauseDefinitionOR() {
		return RMFactory.eINSTANCE.createEConditionClauseDefinitionOR();
	}

	private EConditionClauseDefinitionAssert createEConditionClauseDefinitionAssertion() {
		return RMFactory.eINSTANCE.createEConditionClauseDefinitionAssert();
	}

	private EAssertionDefinition createEAssertionDefinition() {
		EAssertionDefinition assertion = RMFactory.eINSTANCE.createEAssertionDefinition();
		assertion.setAttribute_name("attribute_name_" + ID++);
		assertion.setConstraints(createEConstraintList());
		return assertion;
	}

	private EConstraintList createEConstraintList() {
		return RMFactory.eINSTANCE.createEConstraintList();
	}

	public void removeNewNestedProperty(EPropertyAssignment property, ArrayList<Map<EObject, Integer>> selection,
			String newEntry) {
		if (selection.isEmpty()) {
			// Remove new nested property from root property
			if (property.getValue() instanceof EMAP) {
				removeEntryByNameInMap(newEntry, ((EMAP) property.getValue()).getMap());
			}
		} else if (selection.size() == 1) { // Only one selection allowed
			// Remove new nested property from selected property
			EMapEntry selectedEntry = (EMapEntry) selection.get(0).keySet().iterator().next();
			if (selectedEntry.getValue() instanceof EMAP) {
				removeEntryByNameInMap(newEntry, ((EMAP) selectedEntry.getValue()).getMap());
			}
		}
	}

	private void removeEntryByNameInMap(String key, EList<EMapEntry> map) {
		for (EMapEntry entry : map) {
			if (entry.getKey().equals(key)) {
				map.remove(entry);
				break;
			}
		}
	}

	private EMapEntry createEMapEntry(String newType, AADM_Model model) {
		EMapEntry newEntry = RMFactory.eINSTANCE.createEMapEntry();
		newEntry.setKey("newNestedProperty" + ID++);
		newEntry.setValue((EAssignmentValue) createValueType(newType, model));
		return newEntry;
	}

	public String renderPropertyValueType(EPropertyAssignment property) {
		if (property.getValue() instanceof ESingleValue)
			return "Single Value";
		else if (property.getValue() instanceof ELIST)
			return "List";
		else if (property.getValue() instanceof EMAP)
			return "Nested Value";
		else if (property.getValue() instanceof GetProperty)
			return "Get Property";
		else if (property.getValue() instanceof GetInput)
			return "Get Input";
		else
			return "";
	}

	public String renderPropertyValueType(EMapEntry entry) {
		if (entry.getValue() instanceof ESingleValue)
			return "Single Value";
		else if (entry.getValue() instanceof ELIST)
			return "List";
		else if (entry.getValue() instanceof EMAP)
			return "Nested Value";
		else if (entry.getValue() instanceof GetProperty)
			return "Get Property";
		else if (entry.getValue() instanceof GetInput)
			return "Get Input";
		else
			return "";
	}
}
