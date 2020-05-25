/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.sodalite.dsl.optimization.optimization.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage
 * @generated
 */
public class OptimizationAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OptimizationPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptimizationAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OptimizationPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptimizationSwitch<Adapter> modelSwitch =
    new OptimizationSwitch<Adapter>()
    {
      @Override
      public Adapter caseOptimization_Model(Optimization_Model object)
      {
        return createOptimization_ModelAdapter();
      }
      @Override
      public Adapter caseEOptimization(EOptimization object)
      {
        return createEOptimizationAdapter();
      }
      @Override
      public Adapter caseEOptimizationCases(EOptimizationCases object)
      {
        return createEOptimizationCasesAdapter();
      }
      @Override
      public Adapter caseEAITrainingCase(EAITrainingCase object)
      {
        return createEAITrainingCaseAdapter();
      }
      @Override
      public Adapter caseEAutotuningCase(EAutotuningCase object)
      {
        return createEAutotuningCaseAdapter();
      }
      @Override
      public Adapter caseEOptBuild(EOptBuild object)
      {
        return createEOptBuildAdapter();
      }
      @Override
      public Adapter caseEAutotuning(EAutotuning object)
      {
        return createEAutotuningAdapter();
      }
      @Override
      public Adapter caseEAutotuingDSL(EAutotuingDSL object)
      {
        return createEAutotuingDSLAdapter();
      }
      @Override
      public Adapter caseERun(ERun object)
      {
        return createERunAdapter();
      }
      @Override
      public Adapter caseEBuild(EBuild object)
      {
        return createEBuildAdapter();
      }
      @Override
      public Adapter caseEParameters(EParameters object)
      {
        return createEParametersAdapter();
      }
      @Override
      public Adapter caseEAITraining(EAITraining object)
      {
        return createEAITrainingAdapter();
      }
      @Override
      public Adapter caseEAITrainingCases(EAITrainingCases object)
      {
        return createEAITrainingCasesAdapter();
      }
      @Override
      public Adapter caseEPyTorchCase(EPyTorchCase object)
      {
        return createEPyTorchCaseAdapter();
      }
      @Override
      public Adapter caseETensorFlowCase(ETensorFlowCase object)
      {
        return createETensorFlowCaseAdapter();
      }
      @Override
      public Adapter caseEKerasCase(EKerasCase object)
      {
        return createEKerasCaseAdapter();
      }
      @Override
      public Adapter caseEAITrainingConfig(EAITrainingConfig object)
      {
        return createEAITrainingConfigAdapter();
      }
      @Override
      public Adapter caseEAITrainingData(EAITrainingData object)
      {
        return createEAITrainingDataAdapter();
      }
      @Override
      public Adapter caseEAITrainingETL(EAITrainingETL object)
      {
        return createEAITrainingETLAdapter();
      }
      @Override
      public Adapter caseEKeras(EKeras object)
      {
        return createEKerasAdapter();
      }
      @Override
      public Adapter caseETensorFlow(ETensorFlow object)
      {
        return createETensorFlowAdapter();
      }
      @Override
      public Adapter caseEPyTorch(EPyTorch object)
      {
        return createEPyTorchAdapter();
      }
      @Override
      public Adapter caseEHPC(EHPC object)
      {
        return createEHPCAdapter();
      }
      @Override
      public Adapter caseEHPCCases(EHPCCases object)
      {
        return createEHPCCasesAdapter();
      }
      @Override
      public Adapter caseEOPENCLCase(EOPENCLCase object)
      {
        return createEOPENCLCaseAdapter();
      }
      @Override
      public Adapter caseEOPENACCCase(EOPENACCCase object)
      {
        return createEOPENACCCaseAdapter();
      }
      @Override
      public Adapter caseEOPENMPCase(EOPENMPCase object)
      {
        return createEOPENMPCaseAdapter();
      }
      @Override
      public Adapter caseEMPICase(EMPICase object)
      {
        return createEMPICaseAdapter();
      }
      @Override
      public Adapter caseEHPCConfig(EHPCConfig object)
      {
        return createEHPCConfigAdapter();
      }
      @Override
      public Adapter caseEHPCData(EHPCData object)
      {
        return createEHPCDataAdapter();
      }
      @Override
      public Adapter caseEHPCETL(EHPCETL object)
      {
        return createEHPCETLAdapter();
      }
      @Override
      public Adapter caseEMPI(EMPI object)
      {
        return createEMPIAdapter();
      }
      @Override
      public Adapter caseEOPENMP(EOPENMP object)
      {
        return createEOPENMPAdapter();
      }
      @Override
      public Adapter caseEOPENACC(EOPENACC object)
      {
        return createEOPENACCAdapter();
      }
      @Override
      public Adapter caseEOPENCL(EOPENCL object)
      {
        return createEOPENCLAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.Optimization_Model <em>Optimization Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.Optimization_Model
   * @generated
   */
  public Adapter createOptimization_ModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EOptimization <em>EOptimization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EOptimization
   * @generated
   */
  public Adapter createEOptimizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EOptimizationCases <em>EOptimization Cases</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EOptimizationCases
   * @generated
   */
  public Adapter createEOptimizationCasesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EAITrainingCase <em>EAI Training Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EAITrainingCase
   * @generated
   */
  public Adapter createEAITrainingCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EAutotuningCase <em>EAutotuning Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EAutotuningCase
   * @generated
   */
  public Adapter createEAutotuningCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EOptBuild <em>EOpt Build</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EOptBuild
   * @generated
   */
  public Adapter createEOptBuildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EAutotuning <em>EAutotuning</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EAutotuning
   * @generated
   */
  public Adapter createEAutotuningAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EAutotuingDSL <em>EAutotuing DSL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EAutotuingDSL
   * @generated
   */
  public Adapter createEAutotuingDSLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.ERun <em>ERun</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.ERun
   * @generated
   */
  public Adapter createERunAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EBuild <em>EBuild</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EBuild
   * @generated
   */
  public Adapter createEBuildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EParameters <em>EParameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EParameters
   * @generated
   */
  public Adapter createEParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EAITraining <em>EAI Training</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EAITraining
   * @generated
   */
  public Adapter createEAITrainingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EAITrainingCases <em>EAI Training Cases</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EAITrainingCases
   * @generated
   */
  public Adapter createEAITrainingCasesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EPyTorchCase <em>EPy Torch Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EPyTorchCase
   * @generated
   */
  public Adapter createEPyTorchCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.ETensorFlowCase <em>ETensor Flow Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.ETensorFlowCase
   * @generated
   */
  public Adapter createETensorFlowCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EKerasCase <em>EKeras Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EKerasCase
   * @generated
   */
  public Adapter createEKerasCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EAITrainingConfig <em>EAI Training Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EAITrainingConfig
   * @generated
   */
  public Adapter createEAITrainingConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EAITrainingData <em>EAI Training Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EAITrainingData
   * @generated
   */
  public Adapter createEAITrainingDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EAITrainingETL <em>EAI Training ETL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EAITrainingETL
   * @generated
   */
  public Adapter createEAITrainingETLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EKeras <em>EKeras</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EKeras
   * @generated
   */
  public Adapter createEKerasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.ETensorFlow <em>ETensor Flow</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.ETensorFlow
   * @generated
   */
  public Adapter createETensorFlowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EPyTorch <em>EPy Torch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EPyTorch
   * @generated
   */
  public Adapter createEPyTorchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EHPC <em>EHPC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EHPC
   * @generated
   */
  public Adapter createEHPCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EHPCCases <em>EHPC Cases</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EHPCCases
   * @generated
   */
  public Adapter createEHPCCasesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EOPENCLCase <em>EOPENCL Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EOPENCLCase
   * @generated
   */
  public Adapter createEOPENCLCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EOPENACCCase <em>EOPENACC Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EOPENACCCase
   * @generated
   */
  public Adapter createEOPENACCCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EOPENMPCase <em>EOPENMP Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EOPENMPCase
   * @generated
   */
  public Adapter createEOPENMPCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EMPICase <em>EMPI Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EMPICase
   * @generated
   */
  public Adapter createEMPICaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EHPCConfig <em>EHPC Config</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EHPCConfig
   * @generated
   */
  public Adapter createEHPCConfigAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EHPCData <em>EHPC Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EHPCData
   * @generated
   */
  public Adapter createEHPCDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EHPCETL <em>EHPCETL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EHPCETL
   * @generated
   */
  public Adapter createEHPCETLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EMPI <em>EMPI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EMPI
   * @generated
   */
  public Adapter createEMPIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EOPENMP <em>EOPENMP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EOPENMP
   * @generated
   */
  public Adapter createEOPENMPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EOPENACC <em>EOPENACC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EOPENACC
   * @generated
   */
  public Adapter createEOPENACCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.optimization.optimization.EOPENCL <em>EOPENCL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.optimization.optimization.EOPENCL
   * @generated
   */
  public Adapter createEOPENCLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //OptimizationAdapterFactory
