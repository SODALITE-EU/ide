/**
 * generated by Xtext 2.22.0
 */
package org.sodalite.sdl.ansible.ansibleDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sodalite.sdl.ansible.ansibleDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnsibleDslFactoryImpl extends EFactoryImpl implements AnsibleDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AnsibleDslFactory init()
  {
    try
    {
      AnsibleDslFactory theAnsibleDslFactory = (AnsibleDslFactory)EPackage.Registry.INSTANCE.getEFactory(AnsibleDslPackage.eNS_URI);
      if (theAnsibleDslFactory != null)
      {
        return theAnsibleDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AnsibleDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnsibleDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AnsibleDslPackage.MODEL: return createModel();
      case AnsibleDslPackage.EPLAYBOOK: return createEPlaybook();
      case AnsibleDslPackage.EUSED_BY_BODY: return createEUsedByBody();
      case AnsibleDslPackage.EBASE: return createEBase();
      case AnsibleDslPackage.EEXECUTION: return createEExecution();
      case AnsibleDslPackage.EBLOCK_TASK: return createEBlockTask();
      case AnsibleDslPackage.ETASK_HANDLER: return createETaskHandler();
      case AnsibleDslPackage.EPLAY: return createEPlay();
      case AnsibleDslPackage.EBLOCK: return createEBlock();
      case AnsibleDslPackage.ETASK: return createETask();
      case AnsibleDslPackage.EHANDLER: return createEHandler();
      case AnsibleDslPackage.EMODULE_CALL: return createEModuleCall();
      case AnsibleDslPackage.EPARAMETER: return createEParameter();
      case AnsibleDslPackage.EROLE_INCLUSION: return createERoleInclusion();
      case AnsibleDslPackage.EROLE_INCLUSIONS: return createERoleInclusions();
      case AnsibleDslPackage.EEXTERNAL_FILE_INCLUSION: return createEExternalFileInclusion();
      case AnsibleDslPackage.ELOOP: return createELoop();
      case AnsibleDslPackage.ELOOP_OVER_LIST: return createELoopOverList();
      case AnsibleDslPackage.ELOOP_CONTROL: return createELoopControl();
      case AnsibleDslPackage.EWITH_LOOKUP: return createEWithLookup();
      case AnsibleDslPackage.EUNTIL: return createEUntil();
      case AnsibleDslPackage.EPRIVILEGE_ESCALATION: return createEPrivilegeEscalation();
      case AnsibleDslPackage.EVALIDATION_MODE: return createEValidationMode();
      case AnsibleDslPackage.ECONNECTION: return createEConnection();
      case AnsibleDslPackage.EEXE_SETTINGS: return createEExeSettings();
      case AnsibleDslPackage.EPLAY_EXE_SETTINGS: return createEPlayExeSettings();
      case AnsibleDslPackage.EEXECUTION_EXE_SETTINGS: return createEExecutionExeSettings();
      case AnsibleDslPackage.EERROR_HANDLING: return createEErrorHandling();
      case AnsibleDslPackage.EBLOCK_AND_ROLE_ERROR_HANDLING: return createEBlockAndRoleErrorHandling();
      case AnsibleDslPackage.EPLAY_ERROR_HANDLING: return createEPlayErrorHandling();
      case AnsibleDslPackage.ETASK_HANDLER_ERROR_HANDLING: return createETaskHandlerErrorHandling();
      case AnsibleDslPackage.EFACTS_SETTINGS: return createEFactsSettings();
      case AnsibleDslPackage.EDELEGATION: return createEDelegation();
      case AnsibleDslPackage.EASYNCHRONOUS_SETTINGS: return createEAsynchronousSettings();
      case AnsibleDslPackage.ENOTIFIABLE: return createENotifiable();
      case AnsibleDslPackage.ENOTIFIED_HANDLER: return createENotifiedHandler();
      case AnsibleDslPackage.ENOTIFIED_TOPIC: return createENotifiedTopic();
      case AnsibleDslPackage.EJINJA_OR_STRING: return createEJinjaOrString();
      case AnsibleDslPackage.EJINJA_AND_STRING: return createEJinjaAndString();
      case AnsibleDslPackage.EMULTI_LINE_EXPRESSION: return createEMultiLineExpression();
      case AnsibleDslPackage.ESTRING_PASSED: return createEStringPassed();
      case AnsibleDslPackage.EVALUE_PASSED: return createEValuePassed();
      case AnsibleDslPackage.EVALUE_PASSED_TO_JINJA_EXPRESSION: return createEValuePassedToJinjaExpression();
      case AnsibleDslPackage.ECOMPOSED_VALUE: return createEComposedValue();
      case AnsibleDslPackage.ECOMPOSED_VALUE_JINJA: return createEComposedValueJinja();
      case AnsibleDslPackage.EVALUE_JINJA: return createEValueJinja();
      case AnsibleDslPackage.EVALUE_WITHOUT_STRING: return createEValueWithoutString();
      case AnsibleDslPackage.ESIMPLE_VALUE_WITHOUT_STRING: return createESimpleValueWithoutString();
      case AnsibleDslPackage.ESIMPLE_VALUE_JINJA: return createESimpleValueJinja();
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION: return createEJinjaExpressionEvaluation();
      case AnsibleDslPackage.EJINJA_EXPRESSION_EVALUATION_WITHOUT_BRACKETS: return createEJinjaExpressionEvaluationWithoutBrackets();
      case AnsibleDslPackage.EFUNCTION_CALL_OR_VARIABLE: return createEFunctionCallOrVariable();
      case AnsibleDslPackage.EFUNCTION_INPUT: return createEFunctionInput();
      case AnsibleDslPackage.EIF_BLOCK: return createEIfBlock();
      case AnsibleDslPackage.EFILTERED_EXPRESSION: return createEFilteredExpression();
      case AnsibleDslPackage.EOR_EXPRESSION: return createEOrExpression();
      case AnsibleDslPackage.EAND_EXPRESSION: return createEAndExpression();
      case AnsibleDslPackage.ETRUTH_EXPRESSION: return createETruthExpression();
      case AnsibleDslPackage.EOPERATION: return createEOperation();
      case AnsibleDslPackage.EIS_EXPRESSION: return createEIsExpression();
      case AnsibleDslPackage.EPARENTHESISED_EXPRESSION: return createEParenthesisedExpression();
      case AnsibleDslPackage.EJINJA_STATEMENT: return createEJinjaStatement();
      case AnsibleDslPackage.EIF_STATEMENT: return createEIfStatement();
      case AnsibleDslPackage.EELIF_BLOCK: return createEElifBlock();
      case AnsibleDslPackage.EFOR_STATEMENT: return createEForStatement();
      case AnsibleDslPackage.EVARIABLE_DECLARATION_VARIABLE_REFERENCE: return createEVariableDeclarationVariableReference();
      case AnsibleDslPackage.EREGISTER_VARIABLE_REFERENCE: return createERegisterVariableReference();
      case AnsibleDslPackage.EVARIABLE_DECLARATION: return createEVariableDeclaration();
      case AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE: return createEIndexOrLoopVariable();
      case AnsibleDslPackage.EINDEX_OR_LOOP_VARIABLE_REFERENCE: return createEIndexOrLoopVariableReference();
      case AnsibleDslPackage.EREGISTER_VARIABLE: return createERegisterVariable();
      case AnsibleDslPackage.EINPUT_OPERATION_VARIABLE_REFERENCE: return createEInputOperationVariableReference();
      case AnsibleDslPackage.EINPUT_INTERFACE_VARIABLE_REFERENCE: return createEInputInterfaceVariableReference();
      case AnsibleDslPackage.ESET_FACT_VARIABLE_REFERENCE: return createESetFactVariableReference();
      case AnsibleDslPackage.EVARIABLE_REFERENCE: return createEVariableReference();
      case AnsibleDslPackage.ESPECIAL_VARIABLE: return createESpecialVariable();
      case AnsibleDslPackage.ETAIL_ELEMENT: return createETailElement();
      case AnsibleDslPackage.ESQUARE_BRACKET_ELEMENT: return createESquareBracketElement();
      case AnsibleDslPackage.ESLICE_NOTATION: return createESliceNotation();
      case AnsibleDslPackage.EDICTIONARY: return createEDictionary();
      case AnsibleDslPackage.EDICTIONARY_IN_LINE: return createEDictionaryInLine();
      case AnsibleDslPackage.EDICTIONARY_INDENTED: return createEDictionaryIndented();
      case AnsibleDslPackage.EDICTIONARY_PAIR: return createEDictionaryPair();
      case AnsibleDslPackage.EDICTIONARY_JINJA: return createEDictionaryJinja();
      case AnsibleDslPackage.EDICTIONARY_PAIR_JINJA: return createEDictionaryPairJinja();
      case AnsibleDslPackage.ELIST: return createEList();
      case AnsibleDslPackage.ELIST_IN_LINE: return createEListInLine();
      case AnsibleDslPackage.ELIST_INDENTED: return createEListIndented();
      case AnsibleDslPackage.EDICTIONARY_OF_LIST_INDENTED: return createEDictionaryOfListIndented();
      case AnsibleDslPackage.EELEMENT_OF_LIST_INDENTED: return createEElementOfListIndented();
      case AnsibleDslPackage.ELIST_JINJA: return createEListJinja();
      case AnsibleDslPackage.ECONDITION: return createECondition();
      case AnsibleDslPackage.ELIST_OF_CONDITIONS: return createEListOfConditions();
      case AnsibleDslPackage.EDICTIONARY_PASSED: return createEDictionaryPassed();
      case AnsibleDslPackage.ELIST_PASSED: return createEListPassed();
      case AnsibleDslPackage.ENUMBER_PASSED: return createENumberPassed();
      case AnsibleDslPackage.EBOOLEAN_PASSED: return createEBooleanPassed();
      case AnsibleDslPackage.EBOOLEAN_ANSIBLE: return createEBooleanAnsible();
      case AnsibleDslPackage.ENUMBER: return createENumber();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPlaybook createEPlaybook()
  {
    EPlaybookImpl ePlaybook = new EPlaybookImpl();
    return ePlaybook;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EUsedByBody createEUsedByBody()
  {
    EUsedByBodyImpl eUsedByBody = new EUsedByBodyImpl();
    return eUsedByBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBase createEBase()
  {
    EBaseImpl eBase = new EBaseImpl();
    return eBase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EExecution createEExecution()
  {
    EExecutionImpl eExecution = new EExecutionImpl();
    return eExecution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBlockTask createEBlockTask()
  {
    EBlockTaskImpl eBlockTask = new EBlockTaskImpl();
    return eBlockTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETaskHandler createETaskHandler()
  {
    ETaskHandlerImpl eTaskHandler = new ETaskHandlerImpl();
    return eTaskHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPlay createEPlay()
  {
    EPlayImpl ePlay = new EPlayImpl();
    return ePlay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBlock createEBlock()
  {
    EBlockImpl eBlock = new EBlockImpl();
    return eBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETask createETask()
  {
    ETaskImpl eTask = new ETaskImpl();
    return eTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EHandler createEHandler()
  {
    EHandlerImpl eHandler = new EHandlerImpl();
    return eHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EModuleCall createEModuleCall()
  {
    EModuleCallImpl eModuleCall = new EModuleCallImpl();
    return eModuleCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EParameter createEParameter()
  {
    EParameterImpl eParameter = new EParameterImpl();
    return eParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERoleInclusion createERoleInclusion()
  {
    ERoleInclusionImpl eRoleInclusion = new ERoleInclusionImpl();
    return eRoleInclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERoleInclusions createERoleInclusions()
  {
    ERoleInclusionsImpl eRoleInclusions = new ERoleInclusionsImpl();
    return eRoleInclusions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EExternalFileInclusion createEExternalFileInclusion()
  {
    EExternalFileInclusionImpl eExternalFileInclusion = new EExternalFileInclusionImpl();
    return eExternalFileInclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELoop createELoop()
  {
    ELoopImpl eLoop = new ELoopImpl();
    return eLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELoopOverList createELoopOverList()
  {
    ELoopOverListImpl eLoopOverList = new ELoopOverListImpl();
    return eLoopOverList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELoopControl createELoopControl()
  {
    ELoopControlImpl eLoopControl = new ELoopControlImpl();
    return eLoopControl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EWithLookup createEWithLookup()
  {
    EWithLookupImpl eWithLookup = new EWithLookupImpl();
    return eWithLookup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EUntil createEUntil()
  {
    EUntilImpl eUntil = new EUntilImpl();
    return eUntil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPrivilegeEscalation createEPrivilegeEscalation()
  {
    EPrivilegeEscalationImpl ePrivilegeEscalation = new EPrivilegeEscalationImpl();
    return ePrivilegeEscalation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValidationMode createEValidationMode()
  {
    EValidationModeImpl eValidationMode = new EValidationModeImpl();
    return eValidationMode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EConnection createEConnection()
  {
    EConnectionImpl eConnection = new EConnectionImpl();
    return eConnection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EExeSettings createEExeSettings()
  {
    EExeSettingsImpl eExeSettings = new EExeSettingsImpl();
    return eExeSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPlayExeSettings createEPlayExeSettings()
  {
    EPlayExeSettingsImpl ePlayExeSettings = new EPlayExeSettingsImpl();
    return ePlayExeSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EExecutionExeSettings createEExecutionExeSettings()
  {
    EExecutionExeSettingsImpl eExecutionExeSettings = new EExecutionExeSettingsImpl();
    return eExecutionExeSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EErrorHandling createEErrorHandling()
  {
    EErrorHandlingImpl eErrorHandling = new EErrorHandlingImpl();
    return eErrorHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBlockAndRoleErrorHandling createEBlockAndRoleErrorHandling()
  {
    EBlockAndRoleErrorHandlingImpl eBlockAndRoleErrorHandling = new EBlockAndRoleErrorHandlingImpl();
    return eBlockAndRoleErrorHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPlayErrorHandling createEPlayErrorHandling()
  {
    EPlayErrorHandlingImpl ePlayErrorHandling = new EPlayErrorHandlingImpl();
    return ePlayErrorHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETaskHandlerErrorHandling createETaskHandlerErrorHandling()
  {
    ETaskHandlerErrorHandlingImpl eTaskHandlerErrorHandling = new ETaskHandlerErrorHandlingImpl();
    return eTaskHandlerErrorHandling;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFactsSettings createEFactsSettings()
  {
    EFactsSettingsImpl eFactsSettings = new EFactsSettingsImpl();
    return eFactsSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDelegation createEDelegation()
  {
    EDelegationImpl eDelegation = new EDelegationImpl();
    return eDelegation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAsynchronousSettings createEAsynchronousSettings()
  {
    EAsynchronousSettingsImpl eAsynchronousSettings = new EAsynchronousSettingsImpl();
    return eAsynchronousSettings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENotifiable createENotifiable()
  {
    ENotifiableImpl eNotifiable = new ENotifiableImpl();
    return eNotifiable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENotifiedHandler createENotifiedHandler()
  {
    ENotifiedHandlerImpl eNotifiedHandler = new ENotifiedHandlerImpl();
    return eNotifiedHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENotifiedTopic createENotifiedTopic()
  {
    ENotifiedTopicImpl eNotifiedTopic = new ENotifiedTopicImpl();
    return eNotifiedTopic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EJinjaOrString createEJinjaOrString()
  {
    EJinjaOrStringImpl eJinjaOrString = new EJinjaOrStringImpl();
    return eJinjaOrString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EJinjaAndString createEJinjaAndString()
  {
    EJinjaAndStringImpl eJinjaAndString = new EJinjaAndStringImpl();
    return eJinjaAndString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EMultiLineExpression createEMultiLineExpression()
  {
    EMultiLineExpressionImpl eMultiLineExpression = new EMultiLineExpressionImpl();
    return eMultiLineExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EStringPassed createEStringPassed()
  {
    EStringPassedImpl eStringPassed = new EStringPassedImpl();
    return eStringPassed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValuePassed createEValuePassed()
  {
    EValuePassedImpl eValuePassed = new EValuePassedImpl();
    return eValuePassed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValuePassedToJinjaExpression createEValuePassedToJinjaExpression()
  {
    EValuePassedToJinjaExpressionImpl eValuePassedToJinjaExpression = new EValuePassedToJinjaExpressionImpl();
    return eValuePassedToJinjaExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EComposedValue createEComposedValue()
  {
    EComposedValueImpl eComposedValue = new EComposedValueImpl();
    return eComposedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EComposedValueJinja createEComposedValueJinja()
  {
    EComposedValueJinjaImpl eComposedValueJinja = new EComposedValueJinjaImpl();
    return eComposedValueJinja;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValueJinja createEValueJinja()
  {
    EValueJinjaImpl eValueJinja = new EValueJinjaImpl();
    return eValueJinja;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValueWithoutString createEValueWithoutString()
  {
    EValueWithoutStringImpl eValueWithoutString = new EValueWithoutStringImpl();
    return eValueWithoutString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ESimpleValueWithoutString createESimpleValueWithoutString()
  {
    ESimpleValueWithoutStringImpl eSimpleValueWithoutString = new ESimpleValueWithoutStringImpl();
    return eSimpleValueWithoutString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ESimpleValueJinja createESimpleValueJinja()
  {
    ESimpleValueJinjaImpl eSimpleValueJinja = new ESimpleValueJinjaImpl();
    return eSimpleValueJinja;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EJinjaExpressionEvaluation createEJinjaExpressionEvaluation()
  {
    EJinjaExpressionEvaluationImpl eJinjaExpressionEvaluation = new EJinjaExpressionEvaluationImpl();
    return eJinjaExpressionEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EJinjaExpressionEvaluationWithoutBrackets createEJinjaExpressionEvaluationWithoutBrackets()
  {
    EJinjaExpressionEvaluationWithoutBracketsImpl eJinjaExpressionEvaluationWithoutBrackets = new EJinjaExpressionEvaluationWithoutBracketsImpl();
    return eJinjaExpressionEvaluationWithoutBrackets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFunctionCallOrVariable createEFunctionCallOrVariable()
  {
    EFunctionCallOrVariableImpl eFunctionCallOrVariable = new EFunctionCallOrVariableImpl();
    return eFunctionCallOrVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFunctionInput createEFunctionInput()
  {
    EFunctionInputImpl eFunctionInput = new EFunctionInputImpl();
    return eFunctionInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EIfBlock createEIfBlock()
  {
    EIfBlockImpl eIfBlock = new EIfBlockImpl();
    return eIfBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFilteredExpression createEFilteredExpression()
  {
    EFilteredExpressionImpl eFilteredExpression = new EFilteredExpressionImpl();
    return eFilteredExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOrExpression createEOrExpression()
  {
    EOrExpressionImpl eOrExpression = new EOrExpressionImpl();
    return eOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAndExpression createEAndExpression()
  {
    EAndExpressionImpl eAndExpression = new EAndExpressionImpl();
    return eAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETruthExpression createETruthExpression()
  {
    ETruthExpressionImpl eTruthExpression = new ETruthExpressionImpl();
    return eTruthExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOperation createEOperation()
  {
    EOperationImpl eOperation = new EOperationImpl();
    return eOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EIsExpression createEIsExpression()
  {
    EIsExpressionImpl eIsExpression = new EIsExpressionImpl();
    return eIsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EParenthesisedExpression createEParenthesisedExpression()
  {
    EParenthesisedExpressionImpl eParenthesisedExpression = new EParenthesisedExpressionImpl();
    return eParenthesisedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EJinjaStatement createEJinjaStatement()
  {
    EJinjaStatementImpl eJinjaStatement = new EJinjaStatementImpl();
    return eJinjaStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EIfStatement createEIfStatement()
  {
    EIfStatementImpl eIfStatement = new EIfStatementImpl();
    return eIfStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EElifBlock createEElifBlock()
  {
    EElifBlockImpl eElifBlock = new EElifBlockImpl();
    return eElifBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EForStatement createEForStatement()
  {
    EForStatementImpl eForStatement = new EForStatementImpl();
    return eForStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EVariableDeclarationVariableReference createEVariableDeclarationVariableReference()
  {
    EVariableDeclarationVariableReferenceImpl eVariableDeclarationVariableReference = new EVariableDeclarationVariableReferenceImpl();
    return eVariableDeclarationVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERegisterVariableReference createERegisterVariableReference()
  {
    ERegisterVariableReferenceImpl eRegisterVariableReference = new ERegisterVariableReferenceImpl();
    return eRegisterVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EVariableDeclaration createEVariableDeclaration()
  {
    EVariableDeclarationImpl eVariableDeclaration = new EVariableDeclarationImpl();
    return eVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EIndexOrLoopVariable createEIndexOrLoopVariable()
  {
    EIndexOrLoopVariableImpl eIndexOrLoopVariable = new EIndexOrLoopVariableImpl();
    return eIndexOrLoopVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EIndexOrLoopVariableReference createEIndexOrLoopVariableReference()
  {
    EIndexOrLoopVariableReferenceImpl eIndexOrLoopVariableReference = new EIndexOrLoopVariableReferenceImpl();
    return eIndexOrLoopVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERegisterVariable createERegisterVariable()
  {
    ERegisterVariableImpl eRegisterVariable = new ERegisterVariableImpl();
    return eRegisterVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInputOperationVariableReference createEInputOperationVariableReference()
  {
    EInputOperationVariableReferenceImpl eInputOperationVariableReference = new EInputOperationVariableReferenceImpl();
    return eInputOperationVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInputInterfaceVariableReference createEInputInterfaceVariableReference()
  {
    EInputInterfaceVariableReferenceImpl eInputInterfaceVariableReference = new EInputInterfaceVariableReferenceImpl();
    return eInputInterfaceVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ESetFactVariableReference createESetFactVariableReference()
  {
    ESetFactVariableReferenceImpl eSetFactVariableReference = new ESetFactVariableReferenceImpl();
    return eSetFactVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EVariableReference createEVariableReference()
  {
    EVariableReferenceImpl eVariableReference = new EVariableReferenceImpl();
    return eVariableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ESpecialVariable createESpecialVariable()
  {
    ESpecialVariableImpl eSpecialVariable = new ESpecialVariableImpl();
    return eSpecialVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETailElement createETailElement()
  {
    ETailElementImpl eTailElement = new ETailElementImpl();
    return eTailElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ESquareBracketElement createESquareBracketElement()
  {
    ESquareBracketElementImpl eSquareBracketElement = new ESquareBracketElementImpl();
    return eSquareBracketElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ESliceNotation createESliceNotation()
  {
    ESliceNotationImpl eSliceNotation = new ESliceNotationImpl();
    return eSliceNotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionary createEDictionary()
  {
    EDictionaryImpl eDictionary = new EDictionaryImpl();
    return eDictionary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionaryInLine createEDictionaryInLine()
  {
    EDictionaryInLineImpl eDictionaryInLine = new EDictionaryInLineImpl();
    return eDictionaryInLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionaryIndented createEDictionaryIndented()
  {
    EDictionaryIndentedImpl eDictionaryIndented = new EDictionaryIndentedImpl();
    return eDictionaryIndented;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionaryPair createEDictionaryPair()
  {
    EDictionaryPairImpl eDictionaryPair = new EDictionaryPairImpl();
    return eDictionaryPair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionaryJinja createEDictionaryJinja()
  {
    EDictionaryJinjaImpl eDictionaryJinja = new EDictionaryJinjaImpl();
    return eDictionaryJinja;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionaryPairJinja createEDictionaryPairJinja()
  {
    EDictionaryPairJinjaImpl eDictionaryPairJinja = new EDictionaryPairJinjaImpl();
    return eDictionaryPairJinja;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList createEList()
  {
    EListImpl eList = new EListImpl();
    return eList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EListInLine createEListInLine()
  {
    EListInLineImpl eListInLine = new EListInLineImpl();
    return eListInLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EListIndented createEListIndented()
  {
    EListIndentedImpl eListIndented = new EListIndentedImpl();
    return eListIndented;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionaryOfListIndented createEDictionaryOfListIndented()
  {
    EDictionaryOfListIndentedImpl eDictionaryOfListIndented = new EDictionaryOfListIndentedImpl();
    return eDictionaryOfListIndented;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EElementOfListIndented createEElementOfListIndented()
  {
    EElementOfListIndentedImpl eElementOfListIndented = new EElementOfListIndentedImpl();
    return eElementOfListIndented;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EListJinja createEListJinja()
  {
    EListJinjaImpl eListJinja = new EListJinjaImpl();
    return eListJinja;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ECondition createECondition()
  {
    EConditionImpl eCondition = new EConditionImpl();
    return eCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EListOfConditions createEListOfConditions()
  {
    EListOfConditionsImpl eListOfConditions = new EListOfConditionsImpl();
    return eListOfConditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDictionaryPassed createEDictionaryPassed()
  {
    EDictionaryPassedImpl eDictionaryPassed = new EDictionaryPassedImpl();
    return eDictionaryPassed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EListPassed createEListPassed()
  {
    EListPassedImpl eListPassed = new EListPassedImpl();
    return eListPassed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENumberPassed createENumberPassed()
  {
    ENumberPassedImpl eNumberPassed = new ENumberPassedImpl();
    return eNumberPassed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBooleanPassed createEBooleanPassed()
  {
    EBooleanPassedImpl eBooleanPassed = new EBooleanPassedImpl();
    return eBooleanPassed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EBooleanAnsible createEBooleanAnsible()
  {
    EBooleanAnsibleImpl eBooleanAnsible = new EBooleanAnsibleImpl();
    return eBooleanAnsible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENumber createENumber()
  {
    ENumberImpl eNumber = new ENumberImpl();
    return eNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnsibleDslPackage getAnsibleDslPackage()
  {
    return (AnsibleDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AnsibleDslPackage getPackage()
  {
    return AnsibleDslPackage.eINSTANCE;
  }

} //AnsibleDslFactoryImpl
