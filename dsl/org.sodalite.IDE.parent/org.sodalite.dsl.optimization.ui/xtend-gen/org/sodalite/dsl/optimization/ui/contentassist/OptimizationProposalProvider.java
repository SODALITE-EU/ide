/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.ui.contentassist;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.impl.KeywordImpl;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.sodalite.dsl.optimization.ui.contentassist.AbstractOptimizationProposalProvider;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class OptimizationProposalProvider extends AbstractOptimizationProposalProvider {
  @Override
  public void completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    String _value = keyword.getValue();
    String _plus = ("keyword: " + _value);
    System.out.println(_plus);
    this._completeKeyword(keyword, contentAssistContext, acceptor);
  }
  
  public void _completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    final ICompletionProposal proposal = this.createCompletionProposal(keyword.getValue(), 
      this.getKeywordDisplayString(keyword), this.getImage(keyword), contentAssistContext);
    this.setAdditionalProposalInfo(proposal, this.getAdditionalProposalInfo(keyword));
    this.getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
    acceptor.accept(proposal);
  }
  
  public void setAdditionalProposalInfo(final ICompletionProposal proposal, final String info) {
    if ((proposal instanceof ConfigurableCompletionProposal)) {
      final ConfigurableCompletionProposal configurable = ((ConfigurableCompletionProposal) proposal);
      configurable.setAdditionalProposalInfo(info);
    }
  }
  
  public String getAdditionalProposalInfo(final Keyword keyword) {
    if ((keyword instanceof KeywordImpl)) {
      final KeywordImpl keywordImpl = ((KeywordImpl) keyword);
      final ParserRule rule = this.findParserRule(keywordImpl);
      if ((Objects.equal(rule.getName(), "EOptimization") && Objects.equal(((KeywordImpl)keyword).getValue(), "enable_opt_build:"))) {
        return "Enable target specific optimised build container";
      } else {
        if ((Objects.equal(rule.getName(), "EOptimization") && Objects.equal(((KeywordImpl)keyword).getValue(), "enable_autotuning:"))) {
          return "Enable autotuning node if this is true";
        } else {
          if ((Objects.equal(rule.getName(), "EOptimization") && Objects.equal(((KeywordImpl)keyword).getValue(), "app_type:"))) {
            return "Specify the type of application; Enable application node based on the application type";
          } else {
            if ((Objects.equal(rule.getName(), "EOptBuild") && Objects.equal(((KeywordImpl)keyword).getValue(), "cpu_type:"))) {
              return "Specify the CPU architecture";
            } else {
              if ((Objects.equal(rule.getName(), "EOptBuild") && Objects.equal(((KeywordImpl)keyword).getValue(), "acc_type:"))) {
                return "Specify the accelerator architecture";
              } else {
                if ((Objects.equal(rule.getName(), "EAutotuning") && Objects.equal(((KeywordImpl)keyword).getValue(), "tuner:"))) {
                  return "Specify the autotuning tool to be used";
                } else {
                  if ((Objects.equal(rule.getName(), "EAutotuning") && Objects.equal(((KeywordImpl)keyword).getValue(), "input:"))) {
                    return "DSL or input text for the autotuning tool";
                  } else {
                    if ((Objects.equal(rule.getName(), "EAITrainingConfig") && Objects.equal(((KeywordImpl)keyword).getValue(), "ai_framework:"))) {
                      return "Specify the AI framework to support";
                    } else {
                      if ((Objects.equal(rule.getName(), "EAITrainingConfig") && Objects.equal(((KeywordImpl)keyword).getValue(), "type:"))) {
                        return "Specify the type of AI training network";
                      } else {
                        if ((Objects.equal(rule.getName(), "EAITrainingConfig") && Objects.equal(((KeywordImpl)keyword).getValue(), "distributed_training:"))) {
                          return "Enable distributed training";
                        } else {
                          if ((Objects.equal(rule.getName(), "EAITrainingConfig") && Objects.equal(((KeywordImpl)keyword).getValue(), "layers:"))) {
                            return "specify the number of layers";
                          } else {
                            if ((Objects.equal(rule.getName(), "EAITrainingConfig") && Objects.equal(((KeywordImpl)keyword).getValue(), "parameters:"))) {
                              return "Specify the numer of model parameters";
                            } else {
                              if ((Objects.equal(rule.getName(), "EAITrainingData") && Objects.equal(((KeywordImpl)keyword).getValue(), "location:"))) {
                                return "Specify the data location";
                              } else {
                                if ((Objects.equal(rule.getName(), "EAITrainingData") && Objects.equal(((KeywordImpl)keyword).getValue(), "basedata:"))) {
                                  return "Specify the type of data";
                                } else {
                                  if ((Objects.equal(rule.getName(), "EAITrainingData") && Objects.equal(((KeywordImpl)keyword).getValue(), "size:"))) {
                                    return "Size of single data element";
                                  } else {
                                    if ((Objects.equal(rule.getName(), "EAITrainingData") && Objects.equal(((KeywordImpl)keyword).getValue(), "count:"))) {
                                      return "Number of data elements";
                                    } else {
                                      if ((Objects.equal(rule.getName(), "EAITrainingETL") && Objects.equal(((KeywordImpl)keyword).getValue(), "prefetch:"))) {
                                        return "Prefetch size to use";
                                      } else {
                                        if ((Objects.equal(rule.getName(), "EAITrainingETL") && Objects.equal(((KeywordImpl)keyword).getValue(), "cache:"))) {
                                          return "Caching size to use";
                                        } else {
                                          if ((Objects.equal(rule.getName(), "EKeras") && Objects.equal(((KeywordImpl)keyword).getValue(), "version:"))) {
                                            return "Version of Keras";
                                          } else {
                                            if ((Objects.equal(rule.getName(), "EKeras") && Objects.equal(((KeywordImpl)keyword).getValue(), "backend:"))) {
                                              return "Keras backend to use";
                                            } else {
                                              if ((Objects.equal(rule.getName(), "ETensorFlow") && Objects.equal(((KeywordImpl)keyword).getValue(), "version:"))) {
                                                return "Specify the TensorFlow version to use, default version will be used if not specified";
                                              } else {
                                                if ((Objects.equal(rule.getName(), "ETensorFlow") && Objects.equal(((KeywordImpl)keyword).getValue(), "xla:"))) {
                                                  return "Enable XLA compiler for optimisation";
                                                } else {
                                                  if ((Objects.equal(rule.getName(), "EPyTorch") && Objects.equal(((KeywordImpl)keyword).getValue(), "version:"))) {
                                                    return "Specify the EPyTorch version to use, default version will be used if not specified";
                                                  } else {
                                                    if ((Objects.equal(rule.getName(), "EPyTorch") && Objects.equal(((KeywordImpl)keyword).getValue(), "glow:"))) {
                                                      return "Enable GLOW compiler for optimisation";
                                                    } else {
                                                      if ((Objects.equal(rule.getName(), "EHPCConfig") && Objects.equal(((KeywordImpl)keyword).getValue(), "parallelisation:"))) {
                                                        return "Select the application parallelisation strategy. Multiple selections possible";
                                                      } else {
                                                        if ((Objects.equal(rule.getName(), "EHPCData") && Objects.equal(((KeywordImpl)keyword).getValue(), "location:"))) {
                                                          return "Specify the data location";
                                                        } else {
                                                          if ((Objects.equal(rule.getName(), "EHPCData") && Objects.equal(((KeywordImpl)keyword).getValue(), "basedata:"))) {
                                                            return "Specify the type of data";
                                                          } else {
                                                            if ((Objects.equal(rule.getName(), "EHPCData") && Objects.equal(((KeywordImpl)keyword).getValue(), "size:"))) {
                                                              return "Size of single data element";
                                                            } else {
                                                              if ((Objects.equal(rule.getName(), "EHPCData") && Objects.equal(((KeywordImpl)keyword).getValue(), "count:"))) {
                                                                return "Number of data elements";
                                                              } else {
                                                                if ((Objects.equal(rule.getName(), "EMPI") && Objects.equal(((KeywordImpl)keyword).getValue(), "library:"))) {
                                                                  return "Specify the MPI library to use";
                                                                } else {
                                                                  if ((Objects.equal(rule.getName(), "EMPI") && Objects.equal(((KeywordImpl)keyword).getValue(), "version:"))) {
                                                                    return "Specify the MPI version to use, default used if not specified";
                                                                  } else {
                                                                    if ((Objects.equal(rule.getName(), "EMPI") && Objects.equal(((KeywordImpl)keyword).getValue(), "scaling_efficiency:"))) {
                                                                      return "Specify the scaling_efficiency to use, default used if not specified";
                                                                    } else {
                                                                      if ((Objects.equal(rule.getName(), "EMPI") && Objects.equal(((KeywordImpl)keyword).getValue(), "core_subscription:"))) {
                                                                        return "Specify the core subscription to use, default used if not specified";
                                                                      } else {
                                                                        if ((Objects.equal(rule.getName(), "EMPI") && Objects.equal(((KeywordImpl)keyword).getValue(), "message_size:"))) {
                                                                          return "MPI message size, default used if not specified";
                                                                        } else {
                                                                          if ((Objects.equal(rule.getName(), "EOPENMP") && Objects.equal(((KeywordImpl)keyword).getValue(), "number_of_threads:"))) {
                                                                            return "Specify the number of threads to use";
                                                                          } else {
                                                                            if ((Objects.equal(rule.getName(), "EOPENMP") && Objects.equal(((KeywordImpl)keyword).getValue(), "affinity:"))) {
                                                                              return "Specify the thread affinity to use, default used if not specified";
                                                                            } else {
                                                                              if ((Objects.equal(rule.getName(), "EOPENMP") && Objects.equal(((KeywordImpl)keyword).getValue(), "scaling_efficiency:"))) {
                                                                                return "Specify the scaling_efficiency to use, default used if not specified";
                                                                              } else {
                                                                                if ((Objects.equal(rule.getName(), "EOPENACC") && Objects.equal(((KeywordImpl)keyword).getValue(), "version:"))) {
                                                                                  return "Specify the OPENACC version to use, default used if not specified";
                                                                                } else {
                                                                                  if ((Objects.equal(rule.getName(), "EOPENACC") && Objects.equal(((KeywordImpl)keyword).getValue(), "compiler:"))) {
                                                                                    return "Specify the compiler to use";
                                                                                  } else {
                                                                                    if ((Objects.equal(rule.getName(), "EOPENACC") && Objects.equal(((KeywordImpl)keyword).getValue(), "number_of_acc:"))) {
                                                                                      return "Specify the number of accelerators to be used, default used if not specified";
                                                                                    } else {
                                                                                      if ((Objects.equal(rule.getName(), "EOPENACC") && Objects.equal(((KeywordImpl)keyword).getValue(), "version:"))) {
                                                                                        return "Specify the OPENACC version to use, default used if not specified";
                                                                                      } else {
                                                                                        if ((Objects.equal(rule.getName(), "EOPENACC") && Objects.equal(((KeywordImpl)keyword).getValue(), "compiler:"))) {
                                                                                          return "Specify the compiler to use";
                                                                                        } else {
                                                                                          if ((Objects.equal(rule.getName(), "EOPENACC") && Objects.equal(((KeywordImpl)keyword).getValue(), "number_of_acc:"))) {
                                                                                            return "Specify the number of accelerators to be used, default used if not specified";
                                                                                          } else {
                                                                                            return "";
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return null;
  }
  
  public ParserRule findParserRule(final EObject obj) {
    if ((obj == null)) {
      return null;
    } else {
      if ((obj instanceof ParserRule)) {
        return ((ParserRule) obj);
      } else {
        return this.findParserRule(obj.eContainer());
      }
    }
  }
  
  @Override
  public void completeEOptimization_Enable_opt_build(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createBooleanCompletionProposal(context, acceptor);
  }
  
  @Override
  public void completeEOptimization_Enable_autotuning(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createBooleanCompletionProposal(context, acceptor);
  }
  
  @Override
  public void completeEAITrainingConfig_Distributed_training(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createBooleanCompletionProposal(context, acceptor);
  }
  
  @Override
  public void completeETensorFlow_Xla(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createBooleanCompletionProposal(context, acceptor);
  }
  
  @Override
  public void completeEPyTorch_Glow(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createBooleanCompletionProposal(context, acceptor);
  }
  
  @Override
  public void completeEOptimization_App_type(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("ai_training", "ai_training", context, "", acceptor);
    this.createNonEditableCompletionProposal("hpc", "hpc", context, "", acceptor);
    this.createNonEditableCompletionProposal("big_data", "big_data", context, "BigData not supported in this version", acceptor);
    this.createNonEditableCompletionProposal("ai_inference", "ai_inference", context, "AI_Inference not supported in this version", acceptor);
  }
  
  @Override
  public void completeEOptBuild_Cpu_type(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("x86", "x86", context, "", acceptor);
    this.createNonEditableCompletionProposal("arm", "arm", context, "", acceptor);
    this.createNonEditableCompletionProposal("amd", "amd", context, "", acceptor);
    this.createNonEditableCompletionProposal("power", "power", context, "", acceptor);
  }
  
  @Override
  public void completeEOptBuild_Acc_type(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("nvidia", "nvidia", context, "", acceptor);
    this.createNonEditableCompletionProposal("amd", "amd", context, "", acceptor);
    this.createNonEditableCompletionProposal("fpga", "fpga", context, "", acceptor);
    this.createNonEditableCompletionProposal("none", "none", context, "", acceptor);
  }
  
  @Override
  public void completeEAutotuning_Tuner(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("cresta", "cresta", context, "", acceptor);
    this.createNonEditableCompletionProposal("autotune", "autotune", context, "", acceptor);
  }
  
  @Override
  public void completeEAITrainingConfig_Ai_framework(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("tensorflow", "tensorflow", context, "", acceptor);
    this.createNonEditableCompletionProposal("pytorch", "pytorch", context, "", acceptor);
    this.createNonEditableCompletionProposal("keras", "keras", context, "", acceptor);
    this.createNonEditableCompletionProposal("cntk", "cntk", context, "CNTK not supported in this version", acceptor);
    this.createNonEditableCompletionProposal("mxnet", "mxnet", context, "MXNet not supported in this version", acceptor);
  }
  
  @Override
  public void completeEAITrainingConfig_Type(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("image_classification", "image_classification", context, "", acceptor);
    this.createNonEditableCompletionProposal("object_detection", "object_detection", context, "", acceptor);
    this.createNonEditableCompletionProposal("translation", "translation", context, "", acceptor);
    this.createNonEditableCompletionProposal("recommendation", "recommendation", context, "", acceptor);
    this.createNonEditableCompletionProposal("reinforncement_learning", "reinforncement_learning", context, "", acceptor);
  }
  
  @Override
  public void completeEAITrainingData_Basedata(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("imagenet", "imagenet", context, "", acceptor);
    this.createNonEditableCompletionProposal("cifar", "cifar", context, "", acceptor);
    this.createNonEditableCompletionProposal("mnist", "mnist", context, "", acceptor);
  }
  
  @Override
  public void completeEKeras_Backend(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("tensorflow", "tensorflow", context, "", acceptor);
    this.createNonEditableCompletionProposal("pytorch", "pytorch", context, "", acceptor);
    this.createNonEditableCompletionProposal("keras", "keras", context, "", acceptor);
    this.createNonEditableCompletionProposal("cntk", "cntk", context, "CNTK not supported in this version", acceptor);
    this.createNonEditableCompletionProposal("mxnet", "mxnet", context, "MXNet not supported in this version", acceptor);
  }
  
  @Override
  public void completeEHPCConfig_Parallelisation(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("mpi", "mpi", context, "", acceptor);
    this.createNonEditableCompletionProposal("openmp", "openmp", context, "", acceptor);
    this.createNonEditableCompletionProposal("openacc", "openacc", context, "", acceptor);
    this.createNonEditableCompletionProposal("opencl", "opencl", context, "", acceptor);
  }
  
  @Override
  public void completeEHPCData_Basedata(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("image", "image", context, "", acceptor);
    this.createNonEditableCompletionProposal("restart", "restart", context, "", acceptor);
  }
  
  @Override
  public void completeEMPI_Library(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("mvapch", "mvapch", context, "", acceptor);
    this.createNonEditableCompletionProposal("openmpi", "openmpi", context, "", acceptor);
    this.createNonEditableCompletionProposal("mpich", "mpich", context, "", acceptor);
  }
  
  @Override
  public void completeEMPI_Message_size(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("small", "small", context, "", acceptor);
    this.createNonEditableCompletionProposal("medium", "medium", context, "", acceptor);
    this.createNonEditableCompletionProposal("large", "large", context, "", acceptor);
  }
  
  @Override
  public void completeEOPENMP_Affinity(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("block", "block", context, "", acceptor);
    this.createNonEditableCompletionProposal("simple", "simple", context, "", acceptor);
  }
  
  @Override
  public void completeEOPENCL_Compiler(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("pgi", "pgi", context, "", acceptor);
    this.createNonEditableCompletionProposal("cray", "cray", context, "", acceptor);
  }
  
  @Override
  public void completeEOPENACC_Compiler(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("pgi", "pgi", context, "", acceptor);
    this.createNonEditableCompletionProposal("cray", "cray", context, "", acceptor);
  }
  
  @Override
  public void completeEAutotuning_Input(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
    FileDialog fileDialog = new FileDialog(shell);
    fileDialog.setText("Select Autotuning file");
    String selected = fileDialog.open();
    System.out.println(("Selected autotuning file: " + selected));
    final String input = (("\"" + selected) + "\"");
    this.createEditableCompletionProposal(input, input, context, "", acceptor);
  }
  
  protected void createBooleanCompletionProposal(final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.createNonEditableCompletionProposal("true", "true", context, "", acceptor);
    this.createNonEditableCompletionProposal("false", "false", context, "", acceptor);
  }
  
  protected void createNonEditableCompletionProposal(final String proposalText, final String displayText, final ContentAssistContext context, final String additionalProposalInfo, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal proposal = this.createCompletionProposal(proposalText, displayText, null, context);
    if ((proposal instanceof ConfigurableCompletionProposal)) {
      final ConfigurableCompletionProposal configurable = ((ConfigurableCompletionProposal) proposal);
      configurable.setAdditionalProposalInfo(additionalProposalInfo);
      configurable.setAutoInsertable(false);
    }
    acceptor.accept(proposal);
  }
  
  protected void createEditableCompletionProposal(final String proposalText, final String displayText, final ContentAssistContext context, final String additionalProposalInfo, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal proposal = this.createCompletionProposal(proposalText, displayText, null, context);
    if ((proposal instanceof ConfigurableCompletionProposal)) {
      final ConfigurableCompletionProposal configurable = ((ConfigurableCompletionProposal) proposal);
      configurable.setSelectionStart(configurable.getReplacementOffset());
      configurable.setSelectionLength(proposalText.length());
      configurable.setAutoInsertable(false);
      configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
      configurable.setAdditionalProposalInfo(additionalProposalInfo);
    }
    acceptor.accept(proposal);
  }
}
