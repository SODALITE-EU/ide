package org.sodalite.dsl.optimization.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.sodalite.dsl.optimization.services.OptimizationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOptimizationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Reinforncement_learning", "Distributed_training", "Image_classification", "Scaling_efficiency", "Core_subscription", "Enable_autotuning", "Number_of_threads", "Enable_opt_build", "Object_detection", "Parallelisation", "Number_of_acc", "Recommendation", "Ai_framework", "Message_size", "Optimization", "AI_Inference", "Ai_training", "Constraints", "AI_Training", "FPGAXilinx", "NVIDIAV100", "Autotuning", "Parameters", "Tensorflow", "Translation", "TensorFlow", "Opt_build", "Acc_type", "Affinity", "App_type", "Basedata", "Compiler", "Cpu_type", "Location", "Prefetch", "AMDM100", "AUTOTUNE", "Imagenet", "Intelx86", "Backend", "Command", "Library", "Openacc", "PyTorch_1", "Version", "BigData", "OPENACC", "PyTorch", "RESTART", "Config", "Layers", "Opencl", "Openmp", "Typing", "CREATA", "OPENCL", "OPENMP", "Build", "Cache", "Count", "Input", "Keras_1", "Medium", "Mvapch", "Opnmpi", "Range", "Simple", "Tuner", "CIFAR", "IMAGE", "Keras", "MNIST", "MXNet", "Power", "Block", "Data", "Glow", "Large", "Size", "Small", "Type", "CNTK", "Cray", "Etl", "Hpc", "Int", "Mpi", "Run", "Xla", "AMD", "ARM", "HPC", "MPI", "Pgi", "FullStop", "RULE_BEGIN", "RULE_END", "RULE_BOOLEAN", "RULE_INT", "RULE_EXT_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Tensorflow=27;
    public static final int CREATA=58;
    public static final int CIFAR=72;
    public static final int Size=82;
    public static final int Mpi=90;
    public static final int MPI=96;
    public static final int Enable_autotuning=9;
    public static final int Count=63;
    public static final int Mvapch=67;
    public static final int PyTorch=51;
    public static final int IMAGE=73;
    public static final int Autotuning=25;
    public static final int Imagenet=41;
    public static final int Prefetch=38;
    public static final int Translation=28;
    public static final int Parameters=26;
    public static final int Small=83;
    public static final int RULE_ID=104;
    public static final int Cray=86;
    public static final int Number_of_acc=14;
    public static final int Recommendation=15;
    public static final int Pgi=97;
    public static final int Enable_opt_build=11;
    public static final int RULE_INT=102;
    public static final int FPGAXilinx=23;
    public static final int RULE_ML_COMMENT=106;
    public static final int Openacc=46;
    public static final int Keras=74;
    public static final int Hpc=88;
    public static final int HPC=95;
    public static final int OPENMP=60;
    public static final int ARM=94;
    public static final int CNTK=85;
    public static final int Core_subscription=8;
    public static final int Large=81;
    public static final int MNIST=75;
    public static final int Simple=70;
    public static final int Cpu_type=36;
    public static final int AUTOTUNE=40;
    public static final int Opnmpi=68;
    public static final int Ai_training=20;
    public static final int OPENACC=50;
    public static final int Layers=54;
    public static final int Basedata=34;
    public static final int TensorFlow=29;
    public static final int FullStop=98;
    public static final int AI_Training=22;
    public static final int OPENCL=59;
    public static final int Run=91;
    public static final int Opt_build=30;
    public static final int Ai_framework=16;
    public static final int Type=84;
    public static final int Image_classification=6;
    public static final int Message_size=17;
    public static final int Opencl=55;
    public static final int Etl=87;
    public static final int PyTorch_1=47;
    public static final int Power=77;
    public static final int Number_of_threads=10;
    public static final int RULE_BEGIN=99;
    public static final int RULE_BOOLEAN=101;
    public static final int Tuner=71;
    public static final int Glow=80;
    public static final int Input=64;
    public static final int MXNet=76;
    public static final int Version=48;
    public static final int Build=61;
    public static final int AMD=93;
    public static final int NVIDIAV100=24;
    public static final int Object_detection=12;
    public static final int AMDM100=39;
    public static final int Compiler=35;
    public static final int Typing=57;
    public static final int Openmp=56;
    public static final int Range=69;
    public static final int Constraints=21;
    public static final int Medium=66;
    public static final int Affinity=32;
    public static final int Block=78;
    public static final int Library=45;
    public static final int Cache=62;
    public static final int AI_Inference=19;
    public static final int RULE_END=100;
    public static final int Reinforncement_learning=4;
    public static final int Config=53;
    public static final int RULE_STRING=105;
    public static final int Xla=92;
    public static final int Optimization=18;
    public static final int Acc_type=31;
    public static final int App_type=33;
    public static final int Int=89;
    public static final int RULE_SL_COMMENT=107;
    public static final int Intelx86=42;
    public static final int RESTART=52;
    public static final int EOF=-1;
    public static final int Keras_1=65;
    public static final int RULE_WS=108;
    public static final int RULE_EXT_INT=103;
    public static final int Data=79;
    public static final int RULE_ANY_OTHER=109;
    public static final int Distributed_training=5;
    public static final int Backend=43;
    public static final int Parallelisation=13;
    public static final int Command=44;
    public static final int BigData=49;
    public static final int Scaling_efficiency=7;
    public static final int Location=37;

    // delegates
    // delegators


        public InternalOptimizationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOptimizationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOptimizationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOptimizationParser.g"; }



     	private OptimizationGrammarAccess grammarAccess;

        public InternalOptimizationParser(TokenStream input, OptimizationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Optimization_Model";
       	}

       	@Override
       	protected OptimizationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleOptimization_Model"
    // InternalOptimizationParser.g:57:1: entryRuleOptimization_Model returns [EObject current=null] : iv_ruleOptimization_Model= ruleOptimization_Model EOF ;
    public final EObject entryRuleOptimization_Model() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptimization_Model = null;


        try {
            // InternalOptimizationParser.g:57:59: (iv_ruleOptimization_Model= ruleOptimization_Model EOF )
            // InternalOptimizationParser.g:58:2: iv_ruleOptimization_Model= ruleOptimization_Model EOF
            {
             newCompositeNode(grammarAccess.getOptimization_ModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptimization_Model=ruleOptimization_Model();

            state._fsp--;

             current =iv_ruleOptimization_Model; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptimization_Model"


    // $ANTLR start "ruleOptimization_Model"
    // InternalOptimizationParser.g:64:1: ruleOptimization_Model returns [EObject current=null] : (otherlv_0= Optimization this_BEGIN_1= RULE_BEGIN ( (lv_optimization_2_0= ruleEOptimization ) ) this_END_3= RULE_END ) ;
    public final EObject ruleOptimization_Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_optimization_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:70:2: ( (otherlv_0= Optimization this_BEGIN_1= RULE_BEGIN ( (lv_optimization_2_0= ruleEOptimization ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:71:2: (otherlv_0= Optimization this_BEGIN_1= RULE_BEGIN ( (lv_optimization_2_0= ruleEOptimization ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:71:2: (otherlv_0= Optimization this_BEGIN_1= RULE_BEGIN ( (lv_optimization_2_0= ruleEOptimization ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:72:3: otherlv_0= Optimization this_BEGIN_1= RULE_BEGIN ( (lv_optimization_2_0= ruleEOptimization ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Optimization,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOptimization_ModelAccess().getOptimizationKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getOptimization_ModelAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:80:3: ( (lv_optimization_2_0= ruleEOptimization ) )
            // InternalOptimizationParser.g:81:4: (lv_optimization_2_0= ruleEOptimization )
            {
            // InternalOptimizationParser.g:81:4: (lv_optimization_2_0= ruleEOptimization )
            // InternalOptimizationParser.g:82:5: lv_optimization_2_0= ruleEOptimization
            {

            					newCompositeNode(grammarAccess.getOptimization_ModelAccess().getOptimizationEOptimizationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_optimization_2_0=ruleEOptimization();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptimization_ModelRule());
            					}
            					set(
            						current,
            						"optimization",
            						lv_optimization_2_0,
            						"org.sodalite.dsl.optimization.Optimization.EOptimization");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getOptimization_ModelAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptimization_Model"


    // $ANTLR start "entryRuleEOptimization"
    // InternalOptimizationParser.g:107:1: entryRuleEOptimization returns [EObject current=null] : iv_ruleEOptimization= ruleEOptimization EOF ;
    public final EObject entryRuleEOptimization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOptimization = null;


        try {
            // InternalOptimizationParser.g:107:54: (iv_ruleEOptimization= ruleEOptimization EOF )
            // InternalOptimizationParser.g:108:2: iv_ruleEOptimization= ruleEOptimization EOF
            {
             newCompositeNode(grammarAccess.getEOptimizationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOptimization=ruleEOptimization();

            state._fsp--;

             current =iv_ruleEOptimization; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOptimization"


    // $ANTLR start "ruleEOptimization"
    // InternalOptimizationParser.g:114:1: ruleEOptimization returns [EObject current=null] : ( (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) ) (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) ) (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) ) (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )? (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )? ( (lv_app_optimization_14_0= ruleEOptimizationCases ) ) ) ;
    public final EObject ruleEOptimization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_enable_opt_build_1_0=null;
        Token otherlv_2=null;
        Token lv_enable_autotuning_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_app_type_5_0 = null;

        EObject lv_opt_build_8_0 = null;

        EObject lv_autotuning_12_0 = null;

        EObject lv_app_optimization_14_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:120:2: ( ( (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) ) (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) ) (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) ) (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )? (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )? ( (lv_app_optimization_14_0= ruleEOptimizationCases ) ) ) )
            // InternalOptimizationParser.g:121:2: ( (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) ) (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) ) (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) ) (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )? (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )? ( (lv_app_optimization_14_0= ruleEOptimizationCases ) ) )
            {
            // InternalOptimizationParser.g:121:2: ( (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) ) (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) ) (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) ) (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )? (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )? ( (lv_app_optimization_14_0= ruleEOptimizationCases ) ) )
            // InternalOptimizationParser.g:122:3: (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) ) (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) ) (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) ) (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )? (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )? ( (lv_app_optimization_14_0= ruleEOptimizationCases ) )
            {
            // InternalOptimizationParser.g:122:3: (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) )
            // InternalOptimizationParser.g:123:4: otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,Enable_opt_build,FOLLOW_6); 

            				newLeafNode(otherlv_0, grammarAccess.getEOptimizationAccess().getEnable_opt_buildKeyword_0_0());
            			
            // InternalOptimizationParser.g:127:4: ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) )
            // InternalOptimizationParser.g:128:5: (lv_enable_opt_build_1_0= RULE_BOOLEAN )
            {
            // InternalOptimizationParser.g:128:5: (lv_enable_opt_build_1_0= RULE_BOOLEAN )
            // InternalOptimizationParser.g:129:6: lv_enable_opt_build_1_0= RULE_BOOLEAN
            {
            lv_enable_opt_build_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_7); 

            						newLeafNode(lv_enable_opt_build_1_0, grammarAccess.getEOptimizationAccess().getEnable_opt_buildBOOLEANTerminalRuleCall_0_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEOptimizationRule());
            						}
            						setWithLastConsumed(
            							current,
            							"enable_opt_build",
            							lv_enable_opt_build_1_0,
            							"org.sodalite.dsl.optimization.Optimization.BOOLEAN");
            					

            }


            }


            }

            // InternalOptimizationParser.g:146:3: (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) )
            // InternalOptimizationParser.g:147:4: otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) )
            {
            otherlv_2=(Token)match(input,Enable_autotuning,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getEOptimizationAccess().getEnable_autotuningKeyword_1_0());
            			
            // InternalOptimizationParser.g:151:4: ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) )
            // InternalOptimizationParser.g:152:5: (lv_enable_autotuning_3_0= RULE_BOOLEAN )
            {
            // InternalOptimizationParser.g:152:5: (lv_enable_autotuning_3_0= RULE_BOOLEAN )
            // InternalOptimizationParser.g:153:6: lv_enable_autotuning_3_0= RULE_BOOLEAN
            {
            lv_enable_autotuning_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_8); 

            						newLeafNode(lv_enable_autotuning_3_0, grammarAccess.getEOptimizationAccess().getEnable_autotuningBOOLEANTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEOptimizationRule());
            						}
            						setWithLastConsumed(
            							current,
            							"enable_autotuning",
            							lv_enable_autotuning_3_0,
            							"org.sodalite.dsl.optimization.Optimization.BOOLEAN");
            					

            }


            }


            }

            // InternalOptimizationParser.g:170:3: (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) )
            // InternalOptimizationParser.g:171:4: otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) )
            {
            otherlv_4=(Token)match(input,App_type,FOLLOW_9); 

            				newLeafNode(otherlv_4, grammarAccess.getEOptimizationAccess().getApp_typeKeyword_2_0());
            			
            // InternalOptimizationParser.g:175:4: ( (lv_app_type_5_0= ruleEAppType ) )
            // InternalOptimizationParser.g:176:5: (lv_app_type_5_0= ruleEAppType )
            {
            // InternalOptimizationParser.g:176:5: (lv_app_type_5_0= ruleEAppType )
            // InternalOptimizationParser.g:177:6: lv_app_type_5_0= ruleEAppType
            {

            						newCompositeNode(grammarAccess.getEOptimizationAccess().getApp_typeEAppTypeParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_10);
            lv_app_type_5_0=ruleEAppType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEOptimizationRule());
            						}
            						set(
            							current,
            							"app_type",
            							lv_app_type_5_0,
            							"org.sodalite.dsl.optimization.Optimization.EAppType");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalOptimizationParser.g:195:3: (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Opt_build) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOptimizationParser.g:196:4: otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Opt_build,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOptimizationAccess().getOpt_buildKeyword_3_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getEOptimizationAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalOptimizationParser.g:204:4: ( (lv_opt_build_8_0= ruleEOptBuild ) )
                    // InternalOptimizationParser.g:205:5: (lv_opt_build_8_0= ruleEOptBuild )
                    {
                    // InternalOptimizationParser.g:205:5: (lv_opt_build_8_0= ruleEOptBuild )
                    // InternalOptimizationParser.g:206:6: lv_opt_build_8_0= ruleEOptBuild
                    {

                    						newCompositeNode(grammarAccess.getEOptimizationAccess().getOpt_buildEOptBuildParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_opt_build_8_0=ruleEOptBuild();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOptimizationRule());
                    						}
                    						set(
                    							current,
                    							"opt_build",
                    							lv_opt_build_8_0,
                    							"org.sodalite.dsl.optimization.Optimization.EOptBuild");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_10); 

                    				newLeafNode(this_END_9, grammarAccess.getEOptimizationAccess().getENDTerminalRuleCall_3_3());
                    			

                    }
                    break;

            }

            // InternalOptimizationParser.g:228:3: (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Autotuning) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOptimizationParser.g:229:4: otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END
                    {
                    otherlv_10=(Token)match(input,Autotuning,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOptimizationAccess().getAutotuningKeyword_4_0());
                    			
                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_12); 

                    				newLeafNode(this_BEGIN_11, grammarAccess.getEOptimizationAccess().getBEGINTerminalRuleCall_4_1());
                    			
                    // InternalOptimizationParser.g:237:4: ( (lv_autotuning_12_0= ruleEAutotuning ) )
                    // InternalOptimizationParser.g:238:5: (lv_autotuning_12_0= ruleEAutotuning )
                    {
                    // InternalOptimizationParser.g:238:5: (lv_autotuning_12_0= ruleEAutotuning )
                    // InternalOptimizationParser.g:239:6: lv_autotuning_12_0= ruleEAutotuning
                    {

                    						newCompositeNode(grammarAccess.getEOptimizationAccess().getAutotuningEAutotuningParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_autotuning_12_0=ruleEAutotuning();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOptimizationRule());
                    						}
                    						set(
                    							current,
                    							"autotuning",
                    							lv_autotuning_12_0,
                    							"org.sodalite.dsl.optimization.Optimization.EAutotuning");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_13=(Token)match(input,RULE_END,FOLLOW_10); 

                    				newLeafNode(this_END_13, grammarAccess.getEOptimizationAccess().getENDTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }

            // InternalOptimizationParser.g:261:3: ( (lv_app_optimization_14_0= ruleEOptimizationCases ) )
            // InternalOptimizationParser.g:262:4: (lv_app_optimization_14_0= ruleEOptimizationCases )
            {
            // InternalOptimizationParser.g:262:4: (lv_app_optimization_14_0= ruleEOptimizationCases )
            // InternalOptimizationParser.g:263:5: lv_app_optimization_14_0= ruleEOptimizationCases
            {

            					newCompositeNode(grammarAccess.getEOptimizationAccess().getApp_optimizationEOptimizationCasesParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_app_optimization_14_0=ruleEOptimizationCases();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOptimizationRule());
            					}
            					set(
            						current,
            						"app_optimization",
            						lv_app_optimization_14_0,
            						"org.sodalite.dsl.optimization.Optimization.EOptimizationCases");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOptimization"


    // $ANTLR start "entryRuleEOptimizationCases"
    // InternalOptimizationParser.g:284:1: entryRuleEOptimizationCases returns [EObject current=null] : iv_ruleEOptimizationCases= ruleEOptimizationCases EOF ;
    public final EObject entryRuleEOptimizationCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOptimizationCases = null;


        try {
            // InternalOptimizationParser.g:284:59: (iv_ruleEOptimizationCases= ruleEOptimizationCases EOF )
            // InternalOptimizationParser.g:285:2: iv_ruleEOptimizationCases= ruleEOptimizationCases EOF
            {
             newCompositeNode(grammarAccess.getEOptimizationCasesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOptimizationCases=ruleEOptimizationCases();

            state._fsp--;

             current =iv_ruleEOptimizationCases; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOptimizationCases"


    // $ANTLR start "ruleEOptimizationCases"
    // InternalOptimizationParser.g:291:1: ruleEOptimizationCases returns [EObject current=null] : (this_EAITrainingCase_0= ruleEAITrainingCase | this_EHPCCase_1= ruleEHPCCase ) ;
    public final EObject ruleEOptimizationCases() throws RecognitionException {
        EObject current = null;

        EObject this_EAITrainingCase_0 = null;

        EObject this_EHPCCase_1 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:297:2: ( (this_EAITrainingCase_0= ruleEAITrainingCase | this_EHPCCase_1= ruleEHPCCase ) )
            // InternalOptimizationParser.g:298:2: (this_EAITrainingCase_0= ruleEAITrainingCase | this_EHPCCase_1= ruleEHPCCase )
            {
            // InternalOptimizationParser.g:298:2: (this_EAITrainingCase_0= ruleEAITrainingCase | this_EHPCCase_1= ruleEHPCCase )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Ai_training) ) {
                alt3=1;
            }
            else if ( (LA3_0==Hpc) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalOptimizationParser.g:299:3: this_EAITrainingCase_0= ruleEAITrainingCase
                    {

                    			newCompositeNode(grammarAccess.getEOptimizationCasesAccess().getEAITrainingCaseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EAITrainingCase_0=ruleEAITrainingCase();

                    state._fsp--;


                    			current = this_EAITrainingCase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:308:3: this_EHPCCase_1= ruleEHPCCase
                    {

                    			newCompositeNode(grammarAccess.getEOptimizationCasesAccess().getEHPCCaseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EHPCCase_1=ruleEHPCCase();

                    state._fsp--;


                    			current = this_EHPCCase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOptimizationCases"


    // $ANTLR start "entryRuleEAITrainingCase"
    // InternalOptimizationParser.g:320:1: entryRuleEAITrainingCase returns [EObject current=null] : iv_ruleEAITrainingCase= ruleEAITrainingCase EOF ;
    public final EObject entryRuleEAITrainingCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingCase = null;


        try {
            // InternalOptimizationParser.g:320:56: (iv_ruleEAITrainingCase= ruleEAITrainingCase EOF )
            // InternalOptimizationParser.g:321:2: iv_ruleEAITrainingCase= ruleEAITrainingCase EOF
            {
             newCompositeNode(grammarAccess.getEAITrainingCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAITrainingCase=ruleEAITrainingCase();

            state._fsp--;

             current =iv_ruleEAITrainingCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAITrainingCase"


    // $ANTLR start "ruleEAITrainingCase"
    // InternalOptimizationParser.g:327:1: ruleEAITrainingCase returns [EObject current=null] : (otherlv_0= Ai_training this_BEGIN_1= RULE_BEGIN ( (lv_ai_training_2_0= ruleEAITraining ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEAITrainingCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_ai_training_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:333:2: ( (otherlv_0= Ai_training this_BEGIN_1= RULE_BEGIN ( (lv_ai_training_2_0= ruleEAITraining ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:334:2: (otherlv_0= Ai_training this_BEGIN_1= RULE_BEGIN ( (lv_ai_training_2_0= ruleEAITraining ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:334:2: (otherlv_0= Ai_training this_BEGIN_1= RULE_BEGIN ( (lv_ai_training_2_0= ruleEAITraining ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:335:3: otherlv_0= Ai_training this_BEGIN_1= RULE_BEGIN ( (lv_ai_training_2_0= ruleEAITraining ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Ai_training,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEAITrainingCaseAccess().getAi_trainingKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEAITrainingCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:343:3: ( (lv_ai_training_2_0= ruleEAITraining ) )
            // InternalOptimizationParser.g:344:4: (lv_ai_training_2_0= ruleEAITraining )
            {
            // InternalOptimizationParser.g:344:4: (lv_ai_training_2_0= ruleEAITraining )
            // InternalOptimizationParser.g:345:5: lv_ai_training_2_0= ruleEAITraining
            {

            					newCompositeNode(grammarAccess.getEAITrainingCaseAccess().getAi_trainingEAITrainingParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_ai_training_2_0=ruleEAITraining();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAITrainingCaseRule());
            					}
            					set(
            						current,
            						"ai_training",
            						lv_ai_training_2_0,
            						"org.sodalite.dsl.optimization.Optimization.EAITraining");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEAITrainingCaseAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAITrainingCase"


    // $ANTLR start "entryRuleEHPCCase"
    // InternalOptimizationParser.g:370:1: entryRuleEHPCCase returns [EObject current=null] : iv_ruleEHPCCase= ruleEHPCCase EOF ;
    public final EObject entryRuleEHPCCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCCase = null;


        try {
            // InternalOptimizationParser.g:370:49: (iv_ruleEHPCCase= ruleEHPCCase EOF )
            // InternalOptimizationParser.g:371:2: iv_ruleEHPCCase= ruleEHPCCase EOF
            {
             newCompositeNode(grammarAccess.getEHPCCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEHPCCase=ruleEHPCCase();

            state._fsp--;

             current =iv_ruleEHPCCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEHPCCase"


    // $ANTLR start "ruleEHPCCase"
    // InternalOptimizationParser.g:377:1: ruleEHPCCase returns [EObject current=null] : (otherlv_0= Hpc this_BEGIN_1= RULE_BEGIN ( (lv_hpc_2_0= ruleEHPC ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEHPCCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_hpc_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:383:2: ( (otherlv_0= Hpc this_BEGIN_1= RULE_BEGIN ( (lv_hpc_2_0= ruleEHPC ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:384:2: (otherlv_0= Hpc this_BEGIN_1= RULE_BEGIN ( (lv_hpc_2_0= ruleEHPC ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:384:2: (otherlv_0= Hpc this_BEGIN_1= RULE_BEGIN ( (lv_hpc_2_0= ruleEHPC ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:385:3: otherlv_0= Hpc this_BEGIN_1= RULE_BEGIN ( (lv_hpc_2_0= ruleEHPC ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Hpc,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEHPCCaseAccess().getHpcKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEHPCCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:393:3: ( (lv_hpc_2_0= ruleEHPC ) )
            // InternalOptimizationParser.g:394:4: (lv_hpc_2_0= ruleEHPC )
            {
            // InternalOptimizationParser.g:394:4: (lv_hpc_2_0= ruleEHPC )
            // InternalOptimizationParser.g:395:5: lv_hpc_2_0= ruleEHPC
            {

            					newCompositeNode(grammarAccess.getEHPCCaseAccess().getHpcEHPCParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_hpc_2_0=ruleEHPC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEHPCCaseRule());
            					}
            					set(
            						current,
            						"hpc",
            						lv_hpc_2_0,
            						"org.sodalite.dsl.optimization.Optimization.EHPC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEHPCCaseAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEHPCCase"


    // $ANTLR start "entryRuleEAppType"
    // InternalOptimizationParser.g:420:1: entryRuleEAppType returns [String current=null] : iv_ruleEAppType= ruleEAppType EOF ;
    public final String entryRuleEAppType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEAppType = null;


        try {
            // InternalOptimizationParser.g:420:48: (iv_ruleEAppType= ruleEAppType EOF )
            // InternalOptimizationParser.g:421:2: iv_ruleEAppType= ruleEAppType EOF
            {
             newCompositeNode(grammarAccess.getEAppTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAppType=ruleEAppType();

            state._fsp--;

             current =iv_ruleEAppType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAppType"


    // $ANTLR start "ruleEAppType"
    // InternalOptimizationParser.g:427:1: ruleEAppType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= AI_Training | kw= HPC | kw= BigData | kw= AI_Inference ) ;
    public final AntlrDatatypeRuleToken ruleEAppType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:433:2: ( (kw= AI_Training | kw= HPC | kw= BigData | kw= AI_Inference ) )
            // InternalOptimizationParser.g:434:2: (kw= AI_Training | kw= HPC | kw= BigData | kw= AI_Inference )
            {
            // InternalOptimizationParser.g:434:2: (kw= AI_Training | kw= HPC | kw= BigData | kw= AI_Inference )
            int alt4=4;
            switch ( input.LA(1) ) {
            case AI_Training:
                {
                alt4=1;
                }
                break;
            case HPC:
                {
                alt4=2;
                }
                break;
            case BigData:
                {
                alt4=3;
                }
                break;
            case AI_Inference:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOptimizationParser.g:435:3: kw= AI_Training
                    {
                    kw=(Token)match(input,AI_Training,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAppTypeAccess().getAI_TrainingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:441:3: kw= HPC
                    {
                    kw=(Token)match(input,HPC,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAppTypeAccess().getHPCKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:447:3: kw= BigData
                    {
                    kw=(Token)match(input,BigData,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAppTypeAccess().getBigDataKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:453:3: kw= AI_Inference
                    {
                    kw=(Token)match(input,AI_Inference,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAppTypeAccess().getAI_InferenceKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAppType"


    // $ANTLR start "entryRuleEOptBuild"
    // InternalOptimizationParser.g:462:1: entryRuleEOptBuild returns [EObject current=null] : iv_ruleEOptBuild= ruleEOptBuild EOF ;
    public final EObject entryRuleEOptBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOptBuild = null;


        try {
            // InternalOptimizationParser.g:462:50: (iv_ruleEOptBuild= ruleEOptBuild EOF )
            // InternalOptimizationParser.g:463:2: iv_ruleEOptBuild= ruleEOptBuild EOF
            {
             newCompositeNode(grammarAccess.getEOptBuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOptBuild=ruleEOptBuild();

            state._fsp--;

             current =iv_ruleEOptBuild; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOptBuild"


    // $ANTLR start "ruleEOptBuild"
    // InternalOptimizationParser.g:469:1: ruleEOptBuild returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEOptBuild() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_cpu_type_2_0 = null;

        AntlrDatatypeRuleToken lv_acc_type_4_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:475:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:476:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:476:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:477:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:477:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:478:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOptBuildAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:481:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:482:5: ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:482:5: ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( LA5_0 == Cpu_type && getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 == Acc_type && getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOptimizationParser.g:483:3: ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:483:3: ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) )
            	    // InternalOptimizationParser.g:484:4: {...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOptBuild", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:484:103: ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) )
            	    // InternalOptimizationParser.g:485:5: ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:488:8: ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) )
            	    // InternalOptimizationParser.g:488:9: {...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOptBuild", "true");
            	    }
            	    // InternalOptimizationParser.g:488:18: (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) )
            	    // InternalOptimizationParser.g:488:19: otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) )
            	    {
            	    otherlv_1=(Token)match(input,Cpu_type,FOLLOW_14); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOptBuildAccess().getCpu_typeKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:492:8: ( (lv_cpu_type_2_0= ruleECPUType ) )
            	    // InternalOptimizationParser.g:493:9: (lv_cpu_type_2_0= ruleECPUType )
            	    {
            	    // InternalOptimizationParser.g:493:9: (lv_cpu_type_2_0= ruleECPUType )
            	    // InternalOptimizationParser.g:494:10: lv_cpu_type_2_0= ruleECPUType
            	    {

            	    										newCompositeNode(grammarAccess.getEOptBuildAccess().getCpu_typeECPUTypeParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_cpu_type_2_0=ruleECPUType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEOptBuildRule());
            	    										}
            	    										set(
            	    											current,
            	    											"cpu_type",
            	    											lv_cpu_type_2_0,
            	    											"org.sodalite.dsl.optimization.Optimization.ECPUType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOptBuildAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:517:3: ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:517:3: ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) )
            	    // InternalOptimizationParser.g:518:4: {...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOptBuild", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:518:103: ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) )
            	    // InternalOptimizationParser.g:519:5: ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:522:8: ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) )
            	    // InternalOptimizationParser.g:522:9: {...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOptBuild", "true");
            	    }
            	    // InternalOptimizationParser.g:522:18: (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) )
            	    // InternalOptimizationParser.g:522:19: otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) )
            	    {
            	    otherlv_3=(Token)match(input,Acc_type,FOLLOW_16); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOptBuildAccess().getAcc_typeKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:526:8: ( (lv_acc_type_4_0= ruleEACCType ) )
            	    // InternalOptimizationParser.g:527:9: (lv_acc_type_4_0= ruleEACCType )
            	    {
            	    // InternalOptimizationParser.g:527:9: (lv_acc_type_4_0= ruleEACCType )
            	    // InternalOptimizationParser.g:528:10: lv_acc_type_4_0= ruleEACCType
            	    {

            	    										newCompositeNode(grammarAccess.getEOptBuildAccess().getAcc_typeEACCTypeParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_acc_type_4_0=ruleEACCType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEOptBuildRule());
            	    										}
            	    										set(
            	    											current,
            	    											"acc_type",
            	    											lv_acc_type_4_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EACCType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOptBuildAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEOptBuildAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEOptBuild", "getUnorderedGroupHelper().canLeave(grammarAccess.getEOptBuildAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEOptBuildAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOptBuild"


    // $ANTLR start "entryRuleECPUType"
    // InternalOptimizationParser.g:562:1: entryRuleECPUType returns [String current=null] : iv_ruleECPUType= ruleECPUType EOF ;
    public final String entryRuleECPUType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleECPUType = null;


        try {
            // InternalOptimizationParser.g:562:48: (iv_ruleECPUType= ruleECPUType EOF )
            // InternalOptimizationParser.g:563:2: iv_ruleECPUType= ruleECPUType EOF
            {
             newCompositeNode(grammarAccess.getECPUTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECPUType=ruleECPUType();

            state._fsp--;

             current =iv_ruleECPUType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECPUType"


    // $ANTLR start "ruleECPUType"
    // InternalOptimizationParser.g:569:1: ruleECPUType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power ) ;
    public final AntlrDatatypeRuleToken ruleECPUType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:575:2: ( (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power ) )
            // InternalOptimizationParser.g:576:2: (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power )
            {
            // InternalOptimizationParser.g:576:2: (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power )
            int alt6=4;
            switch ( input.LA(1) ) {
            case Intelx86:
                {
                alt6=1;
                }
                break;
            case ARM:
                {
                alt6=2;
                }
                break;
            case AMD:
                {
                alt6=3;
                }
                break;
            case Power:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalOptimizationParser.g:577:3: kw= Intelx86
                    {
                    kw=(Token)match(input,Intelx86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECPUTypeAccess().getIntelx86Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:583:3: kw= ARM
                    {
                    kw=(Token)match(input,ARM,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECPUTypeAccess().getARMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:589:3: kw= AMD
                    {
                    kw=(Token)match(input,AMD,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECPUTypeAccess().getAMDKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:595:3: kw= Power
                    {
                    kw=(Token)match(input,Power,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECPUTypeAccess().getPowerKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECPUType"


    // $ANTLR start "entryRuleEACCType"
    // InternalOptimizationParser.g:604:1: entryRuleEACCType returns [String current=null] : iv_ruleEACCType= ruleEACCType EOF ;
    public final String entryRuleEACCType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEACCType = null;


        try {
            // InternalOptimizationParser.g:604:48: (iv_ruleEACCType= ruleEACCType EOF )
            // InternalOptimizationParser.g:605:2: iv_ruleEACCType= ruleEACCType EOF
            {
             newCompositeNode(grammarAccess.getEACCTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEACCType=ruleEACCType();

            state._fsp--;

             current =iv_ruleEACCType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEACCType"


    // $ANTLR start "ruleEACCType"
    // InternalOptimizationParser.g:611:1: ruleEACCType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx ) ;
    public final AntlrDatatypeRuleToken ruleEACCType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:617:2: ( (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx ) )
            // InternalOptimizationParser.g:618:2: (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx )
            {
            // InternalOptimizationParser.g:618:2: (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx )
            int alt7=3;
            switch ( input.LA(1) ) {
            case NVIDIAV100:
                {
                alt7=1;
                }
                break;
            case AMDM100:
                {
                alt7=2;
                }
                break;
            case FPGAXilinx:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalOptimizationParser.g:619:3: kw= NVIDIAV100
                    {
                    kw=(Token)match(input,NVIDIAV100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEACCTypeAccess().getNVIDIAV100Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:625:3: kw= AMDM100
                    {
                    kw=(Token)match(input,AMDM100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEACCTypeAccess().getAMDM100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:631:3: kw= FPGAXilinx
                    {
                    kw=(Token)match(input,FPGAXilinx,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEACCTypeAccess().getFPGAXilinxKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEACCType"


    // $ANTLR start "entryRuleEAutotuning"
    // InternalOptimizationParser.g:640:1: entryRuleEAutotuning returns [EObject current=null] : iv_ruleEAutotuning= ruleEAutotuning EOF ;
    public final EObject entryRuleEAutotuning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAutotuning = null;


        try {
            // InternalOptimizationParser.g:640:52: (iv_ruleEAutotuning= ruleEAutotuning EOF )
            // InternalOptimizationParser.g:641:2: iv_ruleEAutotuning= ruleEAutotuning EOF
            {
             newCompositeNode(grammarAccess.getEAutotuningRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAutotuning=ruleEAutotuning();

            state._fsp--;

             current =iv_ruleEAutotuning; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAutotuning"


    // $ANTLR start "ruleEAutotuning"
    // InternalOptimizationParser.g:647:1: ruleEAutotuning returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAutotuning() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_tuner_2_0 = null;

        EObject lv_input_5_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:653:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:654:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:654:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:655:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:655:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:656:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAutotuningAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:659:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:660:5: ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:660:5: ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == Tuner && getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == Input && getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOptimizationParser.g:661:3: ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:661:3: ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) )
            	    // InternalOptimizationParser.g:662:4: {...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:662:105: ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) )
            	    // InternalOptimizationParser.g:663:5: ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:666:8: ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) )
            	    // InternalOptimizationParser.g:666:9: {...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "true");
            	    }
            	    // InternalOptimizationParser.g:666:18: (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) )
            	    // InternalOptimizationParser.g:666:19: otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) )
            	    {
            	    otherlv_1=(Token)match(input,Tuner,FOLLOW_17); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAutotuningAccess().getTunerKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:670:8: ( (lv_tuner_2_0= ruleETuner ) )
            	    // InternalOptimizationParser.g:671:9: (lv_tuner_2_0= ruleETuner )
            	    {
            	    // InternalOptimizationParser.g:671:9: (lv_tuner_2_0= ruleETuner )
            	    // InternalOptimizationParser.g:672:10: lv_tuner_2_0= ruleETuner
            	    {

            	    										newCompositeNode(grammarAccess.getEAutotuningAccess().getTunerETunerParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_18);
            	    lv_tuner_2_0=ruleETuner();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAutotuningRule());
            	    										}
            	    										set(
            	    											current,
            	    											"tuner",
            	    											lv_tuner_2_0,
            	    											"org.sodalite.dsl.optimization.Optimization.ETuner");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAutotuningAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:695:3: ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:695:3: ({...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) ) )
            	    // InternalOptimizationParser.g:696:4: {...}? => ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:696:105: ( ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) ) )
            	    // InternalOptimizationParser.g:697:5: ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:700:8: ({...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END ) )
            	    // InternalOptimizationParser.g:700:9: {...}? => (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "true");
            	    }
            	    // InternalOptimizationParser.g:700:18: (otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END )
            	    // InternalOptimizationParser.g:700:19: otherlv_3= Input this_BEGIN_4= RULE_BEGIN ( (lv_input_5_0= ruleEAutotuingDSL ) ) this_END_6= RULE_END
            	    {
            	    otherlv_3=(Token)match(input,Input,FOLLOW_3); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAutotuningAccess().getInputKeyword_1_0());
            	    							
            	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_19); 

            	    								newLeafNode(this_BEGIN_4, grammarAccess.getEAutotuningAccess().getBEGINTerminalRuleCall_1_1());
            	    							
            	    // InternalOptimizationParser.g:708:8: ( (lv_input_5_0= ruleEAutotuingDSL ) )
            	    // InternalOptimizationParser.g:709:9: (lv_input_5_0= ruleEAutotuingDSL )
            	    {
            	    // InternalOptimizationParser.g:709:9: (lv_input_5_0= ruleEAutotuingDSL )
            	    // InternalOptimizationParser.g:710:10: lv_input_5_0= ruleEAutotuingDSL
            	    {

            	    										newCompositeNode(grammarAccess.getEAutotuningAccess().getInputEAutotuingDSLParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_input_5_0=ruleEAutotuingDSL();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAutotuningRule());
            	    										}
            	    										set(
            	    											current,
            	    											"input",
            	    											lv_input_5_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EAutotuingDSL");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_6=(Token)match(input,RULE_END,FOLLOW_18); 

            	    								newLeafNode(this_END_6, grammarAccess.getEAutotuningAccess().getENDTerminalRuleCall_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAutotuningAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEAutotuningAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEAutotuning", "getUnorderedGroupHelper().canLeave(grammarAccess.getEAutotuningAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEAutotuningAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAutotuning"


    // $ANTLR start "entryRuleEAutotuingDSL"
    // InternalOptimizationParser.g:748:1: entryRuleEAutotuingDSL returns [EObject current=null] : iv_ruleEAutotuingDSL= ruleEAutotuingDSL EOF ;
    public final EObject entryRuleEAutotuingDSL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAutotuingDSL = null;


        try {
            // InternalOptimizationParser.g:748:54: (iv_ruleEAutotuingDSL= ruleEAutotuingDSL EOF )
            // InternalOptimizationParser.g:749:2: iv_ruleEAutotuingDSL= ruleEAutotuingDSL EOF
            {
             newCompositeNode(grammarAccess.getEAutotuingDSLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAutotuingDSL=ruleEAutotuingDSL();

            state._fsp--;

             current =iv_ruleEAutotuingDSL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAutotuingDSL"


    // $ANTLR start "ruleEAutotuingDSL"
    // InternalOptimizationParser.g:755:1: ruleEAutotuingDSL returns [EObject current=null] : ( (otherlv_0= Parameters this_BEGIN_1= RULE_BEGIN ( (lv_parameters_2_0= ruleEParameters ) ) this_END_3= RULE_END ) (otherlv_4= Build this_BEGIN_5= RULE_BEGIN ( (lv_parameters_6_0= ruleEBuild ) ) this_END_7= RULE_END ) (otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( (lv_parameters_10_0= ruleERun ) ) this_END_11= RULE_END ) ) ;
    public final EObject ruleEAutotuingDSL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_10_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:761:2: ( ( (otherlv_0= Parameters this_BEGIN_1= RULE_BEGIN ( (lv_parameters_2_0= ruleEParameters ) ) this_END_3= RULE_END ) (otherlv_4= Build this_BEGIN_5= RULE_BEGIN ( (lv_parameters_6_0= ruleEBuild ) ) this_END_7= RULE_END ) (otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( (lv_parameters_10_0= ruleERun ) ) this_END_11= RULE_END ) ) )
            // InternalOptimizationParser.g:762:2: ( (otherlv_0= Parameters this_BEGIN_1= RULE_BEGIN ( (lv_parameters_2_0= ruleEParameters ) ) this_END_3= RULE_END ) (otherlv_4= Build this_BEGIN_5= RULE_BEGIN ( (lv_parameters_6_0= ruleEBuild ) ) this_END_7= RULE_END ) (otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( (lv_parameters_10_0= ruleERun ) ) this_END_11= RULE_END ) )
            {
            // InternalOptimizationParser.g:762:2: ( (otherlv_0= Parameters this_BEGIN_1= RULE_BEGIN ( (lv_parameters_2_0= ruleEParameters ) ) this_END_3= RULE_END ) (otherlv_4= Build this_BEGIN_5= RULE_BEGIN ( (lv_parameters_6_0= ruleEBuild ) ) this_END_7= RULE_END ) (otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( (lv_parameters_10_0= ruleERun ) ) this_END_11= RULE_END ) )
            // InternalOptimizationParser.g:763:3: (otherlv_0= Parameters this_BEGIN_1= RULE_BEGIN ( (lv_parameters_2_0= ruleEParameters ) ) this_END_3= RULE_END ) (otherlv_4= Build this_BEGIN_5= RULE_BEGIN ( (lv_parameters_6_0= ruleEBuild ) ) this_END_7= RULE_END ) (otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( (lv_parameters_10_0= ruleERun ) ) this_END_11= RULE_END )
            {
            // InternalOptimizationParser.g:763:3: (otherlv_0= Parameters this_BEGIN_1= RULE_BEGIN ( (lv_parameters_2_0= ruleEParameters ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:764:4: otherlv_0= Parameters this_BEGIN_1= RULE_BEGIN ( (lv_parameters_2_0= ruleEParameters ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Parameters,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getEAutotuingDSLAccess().getParametersKeyword_0_0());
            			
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEAutotuingDSLAccess().getBEGINTerminalRuleCall_0_1());
            			
            // InternalOptimizationParser.g:772:4: ( (lv_parameters_2_0= ruleEParameters ) )
            // InternalOptimizationParser.g:773:5: (lv_parameters_2_0= ruleEParameters )
            {
            // InternalOptimizationParser.g:773:5: (lv_parameters_2_0= ruleEParameters )
            // InternalOptimizationParser.g:774:6: lv_parameters_2_0= ruleEParameters
            {

            						newCompositeNode(grammarAccess.getEAutotuingDSLAccess().getParametersEParametersParserRuleCall_0_2_0());
            					
            pushFollow(FOLLOW_5);
            lv_parameters_2_0=ruleEParameters();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEAutotuingDSLRule());
            						}
            						set(
            							current,
            							"parameters",
            							lv_parameters_2_0,
            							"org.sodalite.dsl.optimization.Optimization.EParameters");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_21); 

            				newLeafNode(this_END_3, grammarAccess.getEAutotuingDSLAccess().getENDTerminalRuleCall_0_3());
            			

            }

            // InternalOptimizationParser.g:796:3: (otherlv_4= Build this_BEGIN_5= RULE_BEGIN ( (lv_parameters_6_0= ruleEBuild ) ) this_END_7= RULE_END )
            // InternalOptimizationParser.g:797:4: otherlv_4= Build this_BEGIN_5= RULE_BEGIN ( (lv_parameters_6_0= ruleEBuild ) ) this_END_7= RULE_END
            {
            otherlv_4=(Token)match(input,Build,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getEAutotuingDSLAccess().getBuildKeyword_1_0());
            			
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

            				newLeafNode(this_BEGIN_5, grammarAccess.getEAutotuingDSLAccess().getBEGINTerminalRuleCall_1_1());
            			
            // InternalOptimizationParser.g:805:4: ( (lv_parameters_6_0= ruleEBuild ) )
            // InternalOptimizationParser.g:806:5: (lv_parameters_6_0= ruleEBuild )
            {
            // InternalOptimizationParser.g:806:5: (lv_parameters_6_0= ruleEBuild )
            // InternalOptimizationParser.g:807:6: lv_parameters_6_0= ruleEBuild
            {

            						newCompositeNode(grammarAccess.getEAutotuingDSLAccess().getParametersEBuildParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_5);
            lv_parameters_6_0=ruleEBuild();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEAutotuingDSLRule());
            						}
            						set(
            							current,
            							"parameters",
            							lv_parameters_6_0,
            							"org.sodalite.dsl.optimization.Optimization.EBuild");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_7=(Token)match(input,RULE_END,FOLLOW_23); 

            				newLeafNode(this_END_7, grammarAccess.getEAutotuingDSLAccess().getENDTerminalRuleCall_1_3());
            			

            }

            // InternalOptimizationParser.g:829:3: (otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( (lv_parameters_10_0= ruleERun ) ) this_END_11= RULE_END )
            // InternalOptimizationParser.g:830:4: otherlv_8= Run this_BEGIN_9= RULE_BEGIN ( (lv_parameters_10_0= ruleERun ) ) this_END_11= RULE_END
            {
            otherlv_8=(Token)match(input,Run,FOLLOW_3); 

            				newLeafNode(otherlv_8, grammarAccess.getEAutotuingDSLAccess().getRunKeyword_2_0());
            			
            this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

            				newLeafNode(this_BEGIN_9, grammarAccess.getEAutotuingDSLAccess().getBEGINTerminalRuleCall_2_1());
            			
            // InternalOptimizationParser.g:838:4: ( (lv_parameters_10_0= ruleERun ) )
            // InternalOptimizationParser.g:839:5: (lv_parameters_10_0= ruleERun )
            {
            // InternalOptimizationParser.g:839:5: (lv_parameters_10_0= ruleERun )
            // InternalOptimizationParser.g:840:6: lv_parameters_10_0= ruleERun
            {

            						newCompositeNode(grammarAccess.getEAutotuingDSLAccess().getParametersERunParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_5);
            lv_parameters_10_0=ruleERun();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEAutotuingDSLRule());
            						}
            						set(
            							current,
            							"parameters",
            							lv_parameters_10_0,
            							"org.sodalite.dsl.optimization.Optimization.ERun");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_11, grammarAccess.getEAutotuingDSLAccess().getENDTerminalRuleCall_2_3());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAutotuingDSL"


    // $ANTLR start "entryRuleERun"
    // InternalOptimizationParser.g:866:1: entryRuleERun returns [EObject current=null] : iv_ruleERun= ruleERun EOF ;
    public final EObject entryRuleERun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERun = null;


        try {
            // InternalOptimizationParser.g:866:45: (iv_ruleERun= ruleERun EOF )
            // InternalOptimizationParser.g:867:2: iv_ruleERun= ruleERun EOF
            {
             newCompositeNode(grammarAccess.getERunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERun=ruleERun();

            state._fsp--;

             current =iv_ruleERun; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERun"


    // $ANTLR start "ruleERun"
    // InternalOptimizationParser.g:873:1: ruleERun returns [EObject current=null] : (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleERun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:879:2: ( (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ) )
            // InternalOptimizationParser.g:880:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) )
            {
            // InternalOptimizationParser.g:880:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) )
            // InternalOptimizationParser.g:881:3: otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Command,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getERunAccess().getCommandKeyword_0());
            		
            // InternalOptimizationParser.g:885:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalOptimizationParser.g:886:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalOptimizationParser.g:886:4: (lv_command_1_0= RULE_STRING )
            // InternalOptimizationParser.g:887:5: lv_command_1_0= RULE_STRING
            {
            lv_command_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_command_1_0, grammarAccess.getERunAccess().getCommandSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERunRule());
            					}
            					setWithLastConsumed(
            						current,
            						"command",
            						lv_command_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERun"


    // $ANTLR start "entryRuleEBuild"
    // InternalOptimizationParser.g:907:1: entryRuleEBuild returns [EObject current=null] : iv_ruleEBuild= ruleEBuild EOF ;
    public final EObject entryRuleEBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBuild = null;


        try {
            // InternalOptimizationParser.g:907:47: (iv_ruleEBuild= ruleEBuild EOF )
            // InternalOptimizationParser.g:908:2: iv_ruleEBuild= ruleEBuild EOF
            {
             newCompositeNode(grammarAccess.getEBuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBuild=ruleEBuild();

            state._fsp--;

             current =iv_ruleEBuild; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBuild"


    // $ANTLR start "ruleEBuild"
    // InternalOptimizationParser.g:914:1: ruleEBuild returns [EObject current=null] : (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEBuild() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_command_1_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:920:2: ( (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) ) )
            // InternalOptimizationParser.g:921:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) )
            {
            // InternalOptimizationParser.g:921:2: (otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) ) )
            // InternalOptimizationParser.g:922:3: otherlv_0= Command ( (lv_command_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Command,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEBuildAccess().getCommandKeyword_0());
            		
            // InternalOptimizationParser.g:926:3: ( (lv_command_1_0= RULE_STRING ) )
            // InternalOptimizationParser.g:927:4: (lv_command_1_0= RULE_STRING )
            {
            // InternalOptimizationParser.g:927:4: (lv_command_1_0= RULE_STRING )
            // InternalOptimizationParser.g:928:5: lv_command_1_0= RULE_STRING
            {
            lv_command_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_command_1_0, grammarAccess.getEBuildAccess().getCommandSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEBuildRule());
            					}
            					setWithLastConsumed(
            						current,
            						"command",
            						lv_command_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBuild"


    // $ANTLR start "entryRuleEParameters"
    // InternalOptimizationParser.g:948:1: entryRuleEParameters returns [EObject current=null] : iv_ruleEParameters= ruleEParameters EOF ;
    public final EObject entryRuleEParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameters = null;


        try {
            // InternalOptimizationParser.g:948:52: (iv_ruleEParameters= ruleEParameters EOF )
            // InternalOptimizationParser.g:949:2: iv_ruleEParameters= ruleEParameters EOF
            {
             newCompositeNode(grammarAccess.getEParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameters=ruleEParameters();

            state._fsp--;

             current =iv_ruleEParameters; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEParameters"


    // $ANTLR start "ruleEParameters"
    // InternalOptimizationParser.g:955:1: ruleEParameters returns [EObject current=null] : ( (otherlv_0= Typing this_BEGIN_1= RULE_BEGIN otherlv_2= Int ( (lv_int_3_0= RULE_STRING ) ) this_END_4= RULE_END ) (otherlv_5= Constraints this_BEGIN_6= RULE_BEGIN otherlv_7= Range ( (lv_range_8_0= RULE_STRING ) ) this_END_9= RULE_END ) ) ;
    public final EObject ruleEParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token lv_int_3_0=null;
        Token this_END_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token otherlv_7=null;
        Token lv_range_8_0=null;
        Token this_END_9=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:961:2: ( ( (otherlv_0= Typing this_BEGIN_1= RULE_BEGIN otherlv_2= Int ( (lv_int_3_0= RULE_STRING ) ) this_END_4= RULE_END ) (otherlv_5= Constraints this_BEGIN_6= RULE_BEGIN otherlv_7= Range ( (lv_range_8_0= RULE_STRING ) ) this_END_9= RULE_END ) ) )
            // InternalOptimizationParser.g:962:2: ( (otherlv_0= Typing this_BEGIN_1= RULE_BEGIN otherlv_2= Int ( (lv_int_3_0= RULE_STRING ) ) this_END_4= RULE_END ) (otherlv_5= Constraints this_BEGIN_6= RULE_BEGIN otherlv_7= Range ( (lv_range_8_0= RULE_STRING ) ) this_END_9= RULE_END ) )
            {
            // InternalOptimizationParser.g:962:2: ( (otherlv_0= Typing this_BEGIN_1= RULE_BEGIN otherlv_2= Int ( (lv_int_3_0= RULE_STRING ) ) this_END_4= RULE_END ) (otherlv_5= Constraints this_BEGIN_6= RULE_BEGIN otherlv_7= Range ( (lv_range_8_0= RULE_STRING ) ) this_END_9= RULE_END ) )
            // InternalOptimizationParser.g:963:3: (otherlv_0= Typing this_BEGIN_1= RULE_BEGIN otherlv_2= Int ( (lv_int_3_0= RULE_STRING ) ) this_END_4= RULE_END ) (otherlv_5= Constraints this_BEGIN_6= RULE_BEGIN otherlv_7= Range ( (lv_range_8_0= RULE_STRING ) ) this_END_9= RULE_END )
            {
            // InternalOptimizationParser.g:963:3: (otherlv_0= Typing this_BEGIN_1= RULE_BEGIN otherlv_2= Int ( (lv_int_3_0= RULE_STRING ) ) this_END_4= RULE_END )
            // InternalOptimizationParser.g:964:4: otherlv_0= Typing this_BEGIN_1= RULE_BEGIN otherlv_2= Int ( (lv_int_3_0= RULE_STRING ) ) this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Typing,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getEParametersAccess().getTypingKeyword_0_0());
            			
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEParametersAccess().getBEGINTerminalRuleCall_0_1());
            			
            otherlv_2=(Token)match(input,Int,FOLLOW_24); 

            				newLeafNode(otherlv_2, grammarAccess.getEParametersAccess().getIntKeyword_0_2());
            			
            // InternalOptimizationParser.g:976:4: ( (lv_int_3_0= RULE_STRING ) )
            // InternalOptimizationParser.g:977:5: (lv_int_3_0= RULE_STRING )
            {
            // InternalOptimizationParser.g:977:5: (lv_int_3_0= RULE_STRING )
            // InternalOptimizationParser.g:978:6: lv_int_3_0= RULE_STRING
            {
            lv_int_3_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            						newLeafNode(lv_int_3_0, grammarAccess.getEParametersAccess().getIntSTRINGTerminalRuleCall_0_3_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEParametersRule());
            						}
            						setWithLastConsumed(
            							current,
            							"int",
            							lv_int_3_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_26); 

            				newLeafNode(this_END_4, grammarAccess.getEParametersAccess().getENDTerminalRuleCall_0_4());
            			

            }

            // InternalOptimizationParser.g:999:3: (otherlv_5= Constraints this_BEGIN_6= RULE_BEGIN otherlv_7= Range ( (lv_range_8_0= RULE_STRING ) ) this_END_9= RULE_END )
            // InternalOptimizationParser.g:1000:4: otherlv_5= Constraints this_BEGIN_6= RULE_BEGIN otherlv_7= Range ( (lv_range_8_0= RULE_STRING ) ) this_END_9= RULE_END
            {
            otherlv_5=(Token)match(input,Constraints,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getEParametersAccess().getConstraintsKeyword_1_0());
            			
            this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_27); 

            				newLeafNode(this_BEGIN_6, grammarAccess.getEParametersAccess().getBEGINTerminalRuleCall_1_1());
            			
            otherlv_7=(Token)match(input,Range,FOLLOW_24); 

            				newLeafNode(otherlv_7, grammarAccess.getEParametersAccess().getRangeKeyword_1_2());
            			
            // InternalOptimizationParser.g:1012:4: ( (lv_range_8_0= RULE_STRING ) )
            // InternalOptimizationParser.g:1013:5: (lv_range_8_0= RULE_STRING )
            {
            // InternalOptimizationParser.g:1013:5: (lv_range_8_0= RULE_STRING )
            // InternalOptimizationParser.g:1014:6: lv_range_8_0= RULE_STRING
            {
            lv_range_8_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            						newLeafNode(lv_range_8_0, grammarAccess.getEParametersAccess().getRangeSTRINGTerminalRuleCall_1_3_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEParametersRule());
            						}
            						setWithLastConsumed(
            							current,
            							"range",
            							lv_range_8_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }

            this_END_9=(Token)match(input,RULE_END,FOLLOW_2); 

            				newLeafNode(this_END_9, grammarAccess.getEParametersAccess().getENDTerminalRuleCall_1_4());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEParameters"


    // $ANTLR start "entryRuleETuner"
    // InternalOptimizationParser.g:1039:1: entryRuleETuner returns [String current=null] : iv_ruleETuner= ruleETuner EOF ;
    public final String entryRuleETuner() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleETuner = null;


        try {
            // InternalOptimizationParser.g:1039:46: (iv_ruleETuner= ruleETuner EOF )
            // InternalOptimizationParser.g:1040:2: iv_ruleETuner= ruleETuner EOF
            {
             newCompositeNode(grammarAccess.getETunerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETuner=ruleETuner();

            state._fsp--;

             current =iv_ruleETuner.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETuner"


    // $ANTLR start "ruleETuner"
    // InternalOptimizationParser.g:1046:1: ruleETuner returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= CREATA | kw= AUTOTUNE ) ;
    public final AntlrDatatypeRuleToken ruleETuner() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1052:2: ( (kw= CREATA | kw= AUTOTUNE ) )
            // InternalOptimizationParser.g:1053:2: (kw= CREATA | kw= AUTOTUNE )
            {
            // InternalOptimizationParser.g:1053:2: (kw= CREATA | kw= AUTOTUNE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CREATA) ) {
                alt9=1;
            }
            else if ( (LA9_0==AUTOTUNE) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalOptimizationParser.g:1054:3: kw= CREATA
                    {
                    kw=(Token)match(input,CREATA,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getETunerAccess().getCREATAKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1060:3: kw= AUTOTUNE
                    {
                    kw=(Token)match(input,AUTOTUNE,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getETunerAccess().getAUTOTUNEKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleETuner"


    // $ANTLR start "entryRuleEAITraining"
    // InternalOptimizationParser.g:1069:1: entryRuleEAITraining returns [EObject current=null] : iv_ruleEAITraining= ruleEAITraining EOF ;
    public final EObject entryRuleEAITraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITraining = null;


        try {
            // InternalOptimizationParser.g:1069:52: (iv_ruleEAITraining= ruleEAITraining EOF )
            // InternalOptimizationParser.g:1070:2: iv_ruleEAITraining= ruleEAITraining EOF
            {
             newCompositeNode(grammarAccess.getEAITrainingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAITraining=ruleEAITraining();

            state._fsp--;

             current =iv_ruleEAITraining; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAITraining"


    // $ANTLR start "ruleEAITraining"
    // InternalOptimizationParser.g:1076:1: ruleEAITraining returns [EObject current=null] : ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) ) ;
    public final EObject ruleEAITraining() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        EObject lv_config_2_0 = null;

        EObject lv_data_6_0 = null;

        EObject lv_aitrainingcase_8_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1082:2: ( ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) ) )
            // InternalOptimizationParser.g:1083:2: ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) )
            {
            // InternalOptimizationParser.g:1083:2: ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) )
            // InternalOptimizationParser.g:1084:3: (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) )
            {
            // InternalOptimizationParser.g:1084:3: (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:1085:4: otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Config,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getEAITrainingAccess().getConfigKeyword_0_0());
            			
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEAITrainingAccess().getBEGINTerminalRuleCall_0_1());
            			
            // InternalOptimizationParser.g:1093:4: ( (lv_config_2_0= ruleEAITrainingConfig ) )
            // InternalOptimizationParser.g:1094:5: (lv_config_2_0= ruleEAITrainingConfig )
            {
            // InternalOptimizationParser.g:1094:5: (lv_config_2_0= ruleEAITrainingConfig )
            // InternalOptimizationParser.g:1095:6: lv_config_2_0= ruleEAITrainingConfig
            {

            						newCompositeNode(grammarAccess.getEAITrainingAccess().getConfigEAITrainingConfigParserRuleCall_0_2_0());
            					
            pushFollow(FOLLOW_5);
            lv_config_2_0=ruleEAITrainingConfig();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEAITrainingRule());
            						}
            						set(
            							current,
            							"config",
            							lv_config_2_0,
            							"org.sodalite.dsl.optimization.Optimization.EAITrainingConfig");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_29); 

            				newLeafNode(this_END_3, grammarAccess.getEAITrainingAccess().getENDTerminalRuleCall_0_3());
            			

            }

            // InternalOptimizationParser.g:1117:3: (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END )
            // InternalOptimizationParser.g:1118:4: otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END
            {
            otherlv_4=(Token)match(input,Data,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getEAITrainingAccess().getDataKeyword_1_0());
            			
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            				newLeafNode(this_BEGIN_5, grammarAccess.getEAITrainingAccess().getBEGINTerminalRuleCall_1_1());
            			
            // InternalOptimizationParser.g:1126:4: ( (lv_data_6_0= ruleEAITrainingData ) )
            // InternalOptimizationParser.g:1127:5: (lv_data_6_0= ruleEAITrainingData )
            {
            // InternalOptimizationParser.g:1127:5: (lv_data_6_0= ruleEAITrainingData )
            // InternalOptimizationParser.g:1128:6: lv_data_6_0= ruleEAITrainingData
            {

            						newCompositeNode(grammarAccess.getEAITrainingAccess().getDataEAITrainingDataParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_5);
            lv_data_6_0=ruleEAITrainingData();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEAITrainingRule());
            						}
            						set(
            							current,
            							"data",
            							lv_data_6_0,
            							"org.sodalite.dsl.optimization.Optimization.EAITrainingData");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_7=(Token)match(input,RULE_END,FOLLOW_31); 

            				newLeafNode(this_END_7, grammarAccess.getEAITrainingAccess().getENDTerminalRuleCall_1_3());
            			

            }

            // InternalOptimizationParser.g:1150:3: ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) )
            // InternalOptimizationParser.g:1151:4: (lv_aitrainingcase_8_0= ruleEAITrainingCases )
            {
            // InternalOptimizationParser.g:1151:4: (lv_aitrainingcase_8_0= ruleEAITrainingCases )
            // InternalOptimizationParser.g:1152:5: lv_aitrainingcase_8_0= ruleEAITrainingCases
            {

            					newCompositeNode(grammarAccess.getEAITrainingAccess().getAitrainingcaseEAITrainingCasesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_aitrainingcase_8_0=ruleEAITrainingCases();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAITrainingRule());
            					}
            					set(
            						current,
            						"aitrainingcase",
            						lv_aitrainingcase_8_0,
            						"org.sodalite.dsl.optimization.Optimization.EAITrainingCases");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAITraining"


    // $ANTLR start "entryRuleEAITrainingCases"
    // InternalOptimizationParser.g:1173:1: entryRuleEAITrainingCases returns [EObject current=null] : iv_ruleEAITrainingCases= ruleEAITrainingCases EOF ;
    public final EObject entryRuleEAITrainingCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingCases = null;


        try {
            // InternalOptimizationParser.g:1173:57: (iv_ruleEAITrainingCases= ruleEAITrainingCases EOF )
            // InternalOptimizationParser.g:1174:2: iv_ruleEAITrainingCases= ruleEAITrainingCases EOF
            {
             newCompositeNode(grammarAccess.getEAITrainingCasesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAITrainingCases=ruleEAITrainingCases();

            state._fsp--;

             current =iv_ruleEAITrainingCases; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAITrainingCases"


    // $ANTLR start "ruleEAITrainingCases"
    // InternalOptimizationParser.g:1180:1: ruleEAITrainingCases returns [EObject current=null] : (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase ) ;
    public final EObject ruleEAITrainingCases() throws RecognitionException {
        EObject current = null;

        EObject this_EKerasCase_0 = null;

        EObject this_ETensorFlowCase_1 = null;

        EObject this_EPyTorchCase_2 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1186:2: ( (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase ) )
            // InternalOptimizationParser.g:1187:2: (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase )
            {
            // InternalOptimizationParser.g:1187:2: (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase )
            int alt10=3;
            switch ( input.LA(1) ) {
            case Keras_1:
                {
                alt10=1;
                }
                break;
            case Tensorflow:
                {
                alt10=2;
                }
                break;
            case PyTorch_1:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalOptimizationParser.g:1188:3: this_EKerasCase_0= ruleEKerasCase
                    {

                    			newCompositeNode(grammarAccess.getEAITrainingCasesAccess().getEKerasCaseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EKerasCase_0=ruleEKerasCase();

                    state._fsp--;


                    			current = this_EKerasCase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1197:3: this_ETensorFlowCase_1= ruleETensorFlowCase
                    {

                    			newCompositeNode(grammarAccess.getEAITrainingCasesAccess().getETensorFlowCaseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ETensorFlowCase_1=ruleETensorFlowCase();

                    state._fsp--;


                    			current = this_ETensorFlowCase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1206:3: this_EPyTorchCase_2= ruleEPyTorchCase
                    {

                    			newCompositeNode(grammarAccess.getEAITrainingCasesAccess().getEPyTorchCaseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPyTorchCase_2=ruleEPyTorchCase();

                    state._fsp--;


                    			current = this_EPyTorchCase_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAITrainingCases"


    // $ANTLR start "entryRuleEPyTorchCase"
    // InternalOptimizationParser.g:1218:1: entryRuleEPyTorchCase returns [EObject current=null] : iv_ruleEPyTorchCase= ruleEPyTorchCase EOF ;
    public final EObject entryRuleEPyTorchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPyTorchCase = null;


        try {
            // InternalOptimizationParser.g:1218:53: (iv_ruleEPyTorchCase= ruleEPyTorchCase EOF )
            // InternalOptimizationParser.g:1219:2: iv_ruleEPyTorchCase= ruleEPyTorchCase EOF
            {
             newCompositeNode(grammarAccess.getEPyTorchCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPyTorchCase=ruleEPyTorchCase();

            state._fsp--;

             current =iv_ruleEPyTorchCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPyTorchCase"


    // $ANTLR start "ruleEPyTorchCase"
    // InternalOptimizationParser.g:1225:1: ruleEPyTorchCase returns [EObject current=null] : (otherlv_0= PyTorch_1 this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEPyTorchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_pytorch_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1231:2: ( (otherlv_0= PyTorch_1 this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:1232:2: (otherlv_0= PyTorch_1 this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:1232:2: (otherlv_0= PyTorch_1 this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:1233:3: otherlv_0= PyTorch_1 this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,PyTorch_1,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEPyTorchCaseAccess().getPyTorchKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_32); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEPyTorchCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:1241:3: ( (lv_pytorch_2_0= ruleEPyTorch ) )
            // InternalOptimizationParser.g:1242:4: (lv_pytorch_2_0= ruleEPyTorch )
            {
            // InternalOptimizationParser.g:1242:4: (lv_pytorch_2_0= ruleEPyTorch )
            // InternalOptimizationParser.g:1243:5: lv_pytorch_2_0= ruleEPyTorch
            {

            					newCompositeNode(grammarAccess.getEPyTorchCaseAccess().getPytorchEPyTorchParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_pytorch_2_0=ruleEPyTorch();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPyTorchCaseRule());
            					}
            					set(
            						current,
            						"pytorch",
            						lv_pytorch_2_0,
            						"org.sodalite.dsl.optimization.Optimization.EPyTorch");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEPyTorchCaseAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPyTorchCase"


    // $ANTLR start "entryRuleETensorFlowCase"
    // InternalOptimizationParser.g:1268:1: entryRuleETensorFlowCase returns [EObject current=null] : iv_ruleETensorFlowCase= ruleETensorFlowCase EOF ;
    public final EObject entryRuleETensorFlowCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETensorFlowCase = null;


        try {
            // InternalOptimizationParser.g:1268:56: (iv_ruleETensorFlowCase= ruleETensorFlowCase EOF )
            // InternalOptimizationParser.g:1269:2: iv_ruleETensorFlowCase= ruleETensorFlowCase EOF
            {
             newCompositeNode(grammarAccess.getETensorFlowCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETensorFlowCase=ruleETensorFlowCase();

            state._fsp--;

             current =iv_ruleETensorFlowCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETensorFlowCase"


    // $ANTLR start "ruleETensorFlowCase"
    // InternalOptimizationParser.g:1275:1: ruleETensorFlowCase returns [EObject current=null] : (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END ) ;
    public final EObject ruleETensorFlowCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_tensorflow_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1281:2: ( (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:1282:2: (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:1282:2: (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:1283:3: otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Tensorflow,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getETensorFlowCaseAccess().getTensorflowKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_33); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getETensorFlowCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:1291:3: ( (lv_tensorflow_2_0= ruleETensorFlow ) )
            // InternalOptimizationParser.g:1292:4: (lv_tensorflow_2_0= ruleETensorFlow )
            {
            // InternalOptimizationParser.g:1292:4: (lv_tensorflow_2_0= ruleETensorFlow )
            // InternalOptimizationParser.g:1293:5: lv_tensorflow_2_0= ruleETensorFlow
            {

            					newCompositeNode(grammarAccess.getETensorFlowCaseAccess().getTensorflowETensorFlowParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_tensorflow_2_0=ruleETensorFlow();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETensorFlowCaseRule());
            					}
            					set(
            						current,
            						"tensorflow",
            						lv_tensorflow_2_0,
            						"org.sodalite.dsl.optimization.Optimization.ETensorFlow");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getETensorFlowCaseAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleETensorFlowCase"


    // $ANTLR start "entryRuleEKerasCase"
    // InternalOptimizationParser.g:1318:1: entryRuleEKerasCase returns [EObject current=null] : iv_ruleEKerasCase= ruleEKerasCase EOF ;
    public final EObject entryRuleEKerasCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEKerasCase = null;


        try {
            // InternalOptimizationParser.g:1318:51: (iv_ruleEKerasCase= ruleEKerasCase EOF )
            // InternalOptimizationParser.g:1319:2: iv_ruleEKerasCase= ruleEKerasCase EOF
            {
             newCompositeNode(grammarAccess.getEKerasCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEKerasCase=ruleEKerasCase();

            state._fsp--;

             current =iv_ruleEKerasCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEKerasCase"


    // $ANTLR start "ruleEKerasCase"
    // InternalOptimizationParser.g:1325:1: ruleEKerasCase returns [EObject current=null] : (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEKerasCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_keras_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1331:2: ( (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:1332:2: (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:1332:2: (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:1333:3: otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Keras_1,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEKerasCaseAccess().getKerasKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEKerasCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:1341:3: ( (lv_keras_2_0= ruleEKeras ) )
            // InternalOptimizationParser.g:1342:4: (lv_keras_2_0= ruleEKeras )
            {
            // InternalOptimizationParser.g:1342:4: (lv_keras_2_0= ruleEKeras )
            // InternalOptimizationParser.g:1343:5: lv_keras_2_0= ruleEKeras
            {

            					newCompositeNode(grammarAccess.getEKerasCaseAccess().getKerasEKerasParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_keras_2_0=ruleEKeras();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEKerasCaseRule());
            					}
            					set(
            						current,
            						"keras",
            						lv_keras_2_0,
            						"org.sodalite.dsl.optimization.Optimization.EKeras");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEKerasCaseAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEKerasCase"


    // $ANTLR start "entryRuleEAITrainingConfig"
    // InternalOptimizationParser.g:1368:1: entryRuleEAITrainingConfig returns [EObject current=null] : iv_ruleEAITrainingConfig= ruleEAITrainingConfig EOF ;
    public final EObject entryRuleEAITrainingConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingConfig = null;


        try {
            // InternalOptimizationParser.g:1368:58: (iv_ruleEAITrainingConfig= ruleEAITrainingConfig EOF )
            // InternalOptimizationParser.g:1369:2: iv_ruleEAITrainingConfig= ruleEAITrainingConfig EOF
            {
             newCompositeNode(grammarAccess.getEAITrainingConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAITrainingConfig=ruleEAITrainingConfig();

            state._fsp--;

             current =iv_ruleEAITrainingConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAITrainingConfig"


    // $ANTLR start "ruleEAITrainingConfig"
    // InternalOptimizationParser.g:1375:1: ruleEAITrainingConfig returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAITrainingConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_distributed_training_6_0=null;
        Token otherlv_7=null;
        Token lv_layers_8_0=null;
        Token otherlv_9=null;
        Token lv_parameters_10_0=null;
        AntlrDatatypeRuleToken lv_ai_framework_2_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1381:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:1382:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:1382:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:1383:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:1383:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:1384:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1387:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:1388:5: ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:1388:5: ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=6;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == Ai_framework && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == Distributed_training && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == Layers && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3) ) {
                    alt11=4;
                }
                else if ( LA11_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4) ) {
                    alt11=5;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOptimizationParser.g:1389:3: ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1389:3: ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1390:4: {...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1390:111: ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) )
            	    // InternalOptimizationParser.g:1391:5: ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1394:8: ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) )
            	    // InternalOptimizationParser.g:1394:9: {...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1394:18: (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) )
            	    // InternalOptimizationParser.g:1394:19: otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) )
            	    {
            	    otherlv_1=(Token)match(input,Ai_framework,FOLLOW_35); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAITrainingConfigAccess().getAi_frameworkKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1398:8: ( (lv_ai_framework_2_0= ruleEAIFramework ) )
            	    // InternalOptimizationParser.g:1399:9: (lv_ai_framework_2_0= ruleEAIFramework )
            	    {
            	    // InternalOptimizationParser.g:1399:9: (lv_ai_framework_2_0= ruleEAIFramework )
            	    // InternalOptimizationParser.g:1400:10: lv_ai_framework_2_0= ruleEAIFramework
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingConfigAccess().getAi_frameworkEAIFrameworkParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_36);
            	    lv_ai_framework_2_0=ruleEAIFramework();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAITrainingConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"ai_framework",
            	    											lv_ai_framework_2_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EAIFramework");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:1423:3: ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1423:3: ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1424:4: {...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1424:111: ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) )
            	    // InternalOptimizationParser.g:1425:5: ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1428:8: ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) )
            	    // InternalOptimizationParser.g:1428:9: {...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1428:18: (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) )
            	    // InternalOptimizationParser.g:1428:19: otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) )
            	    {
            	    otherlv_3=(Token)match(input,Type,FOLLOW_37); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAITrainingConfigAccess().getTypeKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1432:8: ( (lv_type_4_0= ruleEAITrainingType ) )
            	    // InternalOptimizationParser.g:1433:9: (lv_type_4_0= ruleEAITrainingType )
            	    {
            	    // InternalOptimizationParser.g:1433:9: (lv_type_4_0= ruleEAITrainingType )
            	    // InternalOptimizationParser.g:1434:10: lv_type_4_0= ruleEAITrainingType
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingConfigAccess().getTypeEAITrainingTypeParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_36);
            	    lv_type_4_0=ruleEAITrainingType();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAITrainingConfigRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_4_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EAITrainingType");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOptimizationParser.g:1457:3: ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1457:3: ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1458:4: {...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:1458:111: ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:1459:5: ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:1462:8: ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:1462:9: {...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1462:18: (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:1462:19: otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,Distributed_training,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAITrainingConfigAccess().getDistributed_trainingKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:1466:8: ( (lv_distributed_training_6_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:1467:9: (lv_distributed_training_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:1467:9: (lv_distributed_training_6_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:1468:10: lv_distributed_training_6_0= RULE_BOOLEAN
            	    {
            	    lv_distributed_training_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_36); 

            	    										newLeafNode(lv_distributed_training_6_0, grammarAccess.getEAITrainingConfigAccess().getDistributed_trainingBOOLEANTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAITrainingConfigRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"distributed_training",
            	    											lv_distributed_training_6_0,
            	    											"org.sodalite.dsl.optimization.Optimization.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOptimizationParser.g:1490:3: ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1490:3: ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1491:4: {...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:1491:111: ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1492:5: ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:1495:8: ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1495:9: {...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1495:18: (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1495:19: otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Layers,FOLLOW_38); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEAITrainingConfigAccess().getLayersKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:1499:8: ( (lv_layers_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1500:9: (lv_layers_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1500:9: (lv_layers_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:1501:10: lv_layers_8_0= RULE_INT
            	    {
            	    lv_layers_8_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    										newLeafNode(lv_layers_8_0, grammarAccess.getEAITrainingConfigAccess().getLayersINTTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAITrainingConfigRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"layers",
            	    											lv_layers_8_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalOptimizationParser.g:1523:3: ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1523:3: ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1524:4: {...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:1524:111: ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1525:5: ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:1528:8: ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1528:9: {...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1528:18: (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1528:19: otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) )
            	    {
            	    otherlv_9=(Token)match(input,Parameters,FOLLOW_38); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEAITrainingConfigAccess().getParametersKeyword_4_0());
            	    							
            	    // InternalOptimizationParser.g:1532:8: ( (lv_parameters_10_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1533:9: (lv_parameters_10_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1533:9: (lv_parameters_10_0= RULE_INT )
            	    // InternalOptimizationParser.g:1534:10: lv_parameters_10_0= RULE_INT
            	    {
            	    lv_parameters_10_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    										newLeafNode(lv_parameters_10_0, grammarAccess.getEAITrainingConfigAccess().getParametersINTTerminalRuleCall_4_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAITrainingConfigRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"parameters",
            	    											lv_parameters_10_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canLeave(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAITrainingConfig"


    // $ANTLR start "entryRuleEAIFramework"
    // InternalOptimizationParser.g:1567:1: entryRuleEAIFramework returns [String current=null] : iv_ruleEAIFramework= ruleEAIFramework EOF ;
    public final String entryRuleEAIFramework() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEAIFramework = null;


        try {
            // InternalOptimizationParser.g:1567:52: (iv_ruleEAIFramework= ruleEAIFramework EOF )
            // InternalOptimizationParser.g:1568:2: iv_ruleEAIFramework= ruleEAIFramework EOF
            {
             newCompositeNode(grammarAccess.getEAIFrameworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAIFramework=ruleEAIFramework();

            state._fsp--;

             current =iv_ruleEAIFramework.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAIFramework"


    // $ANTLR start "ruleEAIFramework"
    // InternalOptimizationParser.g:1574:1: ruleEAIFramework returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) ;
    public final AntlrDatatypeRuleToken ruleEAIFramework() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1580:2: ( (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) )
            // InternalOptimizationParser.g:1581:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
            {
            // InternalOptimizationParser.g:1581:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
            int alt12=5;
            switch ( input.LA(1) ) {
            case TensorFlow:
                {
                alt12=1;
                }
                break;
            case PyTorch:
                {
                alt12=2;
                }
                break;
            case Keras:
                {
                alt12=3;
                }
                break;
            case CNTK:
                {
                alt12=4;
                }
                break;
            case MXNet:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalOptimizationParser.g:1582:3: kw= TensorFlow
                    {
                    kw=(Token)match(input,TensorFlow,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getTensorFlowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1588:3: kw= PyTorch
                    {
                    kw=(Token)match(input,PyTorch,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getPyTorchKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1594:3: kw= Keras
                    {
                    kw=(Token)match(input,Keras,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getKerasKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:1600:3: kw= CNTK
                    {
                    kw=(Token)match(input,CNTK,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getCNTKKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOptimizationParser.g:1606:3: kw= MXNet
                    {
                    kw=(Token)match(input,MXNet,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getMXNetKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAIFramework"


    // $ANTLR start "entryRuleEAITrainingType"
    // InternalOptimizationParser.g:1615:1: entryRuleEAITrainingType returns [String current=null] : iv_ruleEAITrainingType= ruleEAITrainingType EOF ;
    public final String entryRuleEAITrainingType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEAITrainingType = null;


        try {
            // InternalOptimizationParser.g:1615:55: (iv_ruleEAITrainingType= ruleEAITrainingType EOF )
            // InternalOptimizationParser.g:1616:2: iv_ruleEAITrainingType= ruleEAITrainingType EOF
            {
             newCompositeNode(grammarAccess.getEAITrainingTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAITrainingType=ruleEAITrainingType();

            state._fsp--;

             current =iv_ruleEAITrainingType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAITrainingType"


    // $ANTLR start "ruleEAITrainingType"
    // InternalOptimizationParser.g:1622:1: ruleEAITrainingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning ) ;
    public final AntlrDatatypeRuleToken ruleEAITrainingType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1628:2: ( (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning ) )
            // InternalOptimizationParser.g:1629:2: (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning )
            {
            // InternalOptimizationParser.g:1629:2: (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning )
            int alt13=5;
            switch ( input.LA(1) ) {
            case Image_classification:
                {
                alt13=1;
                }
                break;
            case Object_detection:
                {
                alt13=2;
                }
                break;
            case Translation:
                {
                alt13=3;
                }
                break;
            case Recommendation:
                {
                alt13=4;
                }
                break;
            case Reinforncement_learning:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalOptimizationParser.g:1630:3: kw= Image_classification
                    {
                    kw=(Token)match(input,Image_classification,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getImage_classificationKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1636:3: kw= Object_detection
                    {
                    kw=(Token)match(input,Object_detection,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getObject_detectionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1642:3: kw= Translation
                    {
                    kw=(Token)match(input,Translation,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getTranslationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:1648:3: kw= Recommendation
                    {
                    kw=(Token)match(input,Recommendation,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getRecommendationKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOptimizationParser.g:1654:3: kw= Reinforncement_learning
                    {
                    kw=(Token)match(input,Reinforncement_learning,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getReinforncement_learningKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAITrainingType"


    // $ANTLR start "entryRuleEAITrainingData"
    // InternalOptimizationParser.g:1663:1: entryRuleEAITrainingData returns [EObject current=null] : iv_ruleEAITrainingData= ruleEAITrainingData EOF ;
    public final EObject entryRuleEAITrainingData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingData = null;


        try {
            // InternalOptimizationParser.g:1663:56: (iv_ruleEAITrainingData= ruleEAITrainingData EOF )
            // InternalOptimizationParser.g:1664:2: iv_ruleEAITrainingData= ruleEAITrainingData EOF
            {
             newCompositeNode(grammarAccess.getEAITrainingDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAITrainingData=ruleEAITrainingData();

            state._fsp--;

             current =iv_ruleEAITrainingData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAITrainingData"


    // $ANTLR start "ruleEAITrainingData"
    // InternalOptimizationParser.g:1670:1: ruleEAITrainingData returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) ) ;
    public final EObject ruleEAITrainingData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_location_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_size_6_0=null;
        Token otherlv_7=null;
        Token lv_count_8_0=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_basedata_4_0 = null;

        EObject lv_etl_11_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1676:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1677:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1677:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1678:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1678:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1679:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1682:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* )
            // InternalOptimizationParser.g:1683:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1683:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )*
            loop14:
            do {
                int alt14=6;
                int LA14_0 = input.LA(1);

                if ( LA14_0 == Location && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 == Basedata && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 == Count && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3) ) {
                    alt14=4;
                }
                else if ( LA14_0 == Etl && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4) ) {
                    alt14=5;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOptimizationParser.g:1684:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1684:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1685:4: {...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1685:109: ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:1686:5: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1689:8: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:1689:9: {...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1689:18: (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:1689:19: otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Location,FOLLOW_24); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAITrainingDataAccess().getLocationKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1693:8: ( (lv_location_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:1694:9: (lv_location_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:1694:9: (lv_location_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:1695:10: lv_location_2_0= RULE_STRING
            	    {
            	    lv_location_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            	    										newLeafNode(lv_location_2_0, grammarAccess.getEAITrainingDataAccess().getLocationSTRINGTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAITrainingDataRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"location",
            	    											lv_location_2_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:1717:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1717:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1718:4: {...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1718:109: ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) )
            	    // InternalOptimizationParser.g:1719:5: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1722:8: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) )
            	    // InternalOptimizationParser.g:1722:9: {...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1722:18: (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) )
            	    // InternalOptimizationParser.g:1722:19: otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) )
            	    {
            	    otherlv_3=(Token)match(input,Basedata,FOLLOW_40); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAITrainingDataAccess().getBasedataKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1726:8: ( (lv_basedata_4_0= ruleEBasedata ) )
            	    // InternalOptimizationParser.g:1727:9: (lv_basedata_4_0= ruleEBasedata )
            	    {
            	    // InternalOptimizationParser.g:1727:9: (lv_basedata_4_0= ruleEBasedata )
            	    // InternalOptimizationParser.g:1728:10: lv_basedata_4_0= ruleEBasedata
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingDataAccess().getBasedataEBasedataParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_39);
            	    lv_basedata_4_0=ruleEBasedata();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAITrainingDataRule());
            	    										}
            	    										set(
            	    											current,
            	    											"basedata",
            	    											lv_basedata_4_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EBasedata");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOptimizationParser.g:1751:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1751:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1752:4: {...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:1752:109: ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1753:5: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:1756:8: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1756:9: {...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1756:18: (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1756:19: otherlv_5= Size ( (lv_size_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Size,FOLLOW_38); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAITrainingDataAccess().getSizeKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:1760:8: ( (lv_size_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1761:9: (lv_size_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1761:9: (lv_size_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:1762:10: lv_size_6_0= RULE_INT
            	    {
            	    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            	    										newLeafNode(lv_size_6_0, grammarAccess.getEAITrainingDataAccess().getSizeINTTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAITrainingDataRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"size",
            	    											lv_size_6_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOptimizationParser.g:1784:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1784:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1785:4: {...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:1785:109: ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1786:5: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:1789:8: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1789:9: {...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1789:18: (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1789:19: otherlv_7= Count ( (lv_count_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Count,FOLLOW_38); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEAITrainingDataAccess().getCountKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:1793:8: ( (lv_count_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1794:9: (lv_count_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1794:9: (lv_count_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:1795:10: lv_count_8_0= RULE_INT
            	    {
            	    lv_count_8_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            	    										newLeafNode(lv_count_8_0, grammarAccess.getEAITrainingDataAccess().getCountINTTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAITrainingDataRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"count",
            	    											lv_count_8_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalOptimizationParser.g:1817:3: ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1817:3: ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalOptimizationParser.g:1818:4: {...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:1818:109: ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) )
            	    // InternalOptimizationParser.g:1819:5: ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:1822:8: ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) )
            	    // InternalOptimizationParser.g:1822:9: {...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1822:18: (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END )
            	    // InternalOptimizationParser.g:1822:19: otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Etl,FOLLOW_3); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEAITrainingDataAccess().getEtlKeyword_4_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getEAITrainingDataAccess().getBEGINTerminalRuleCall_4_1());
            	    							
            	    // InternalOptimizationParser.g:1830:8: ( (lv_etl_11_0= ruleEAITrainingETL ) )
            	    // InternalOptimizationParser.g:1831:9: (lv_etl_11_0= ruleEAITrainingETL )
            	    {
            	    // InternalOptimizationParser.g:1831:9: (lv_etl_11_0= ruleEAITrainingETL )
            	    // InternalOptimizationParser.g:1832:10: lv_etl_11_0= ruleEAITrainingETL
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingDataAccess().getEtlEAITrainingETLParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_etl_11_0=ruleEAITrainingETL();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAITrainingDataRule());
            	    										}
            	    										set(
            	    											current,
            	    											"etl",
            	    											lv_etl_11_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EAITrainingETL");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_39); 

            	    								newLeafNode(this_END_12, grammarAccess.getEAITrainingDataAccess().getENDTerminalRuleCall_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAITrainingData"


    // $ANTLR start "entryRuleEBasedata"
    // InternalOptimizationParser.g:1869:1: entryRuleEBasedata returns [String current=null] : iv_ruleEBasedata= ruleEBasedata EOF ;
    public final String entryRuleEBasedata() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBasedata = null;


        try {
            // InternalOptimizationParser.g:1869:49: (iv_ruleEBasedata= ruleEBasedata EOF )
            // InternalOptimizationParser.g:1870:2: iv_ruleEBasedata= ruleEBasedata EOF
            {
             newCompositeNode(grammarAccess.getEBasedataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBasedata=ruleEBasedata();

            state._fsp--;

             current =iv_ruleEBasedata.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBasedata"


    // $ANTLR start "ruleEBasedata"
    // InternalOptimizationParser.g:1876:1: ruleEBasedata returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Imagenet | kw= CIFAR | kw= MNIST ) ;
    public final AntlrDatatypeRuleToken ruleEBasedata() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1882:2: ( (kw= Imagenet | kw= CIFAR | kw= MNIST ) )
            // InternalOptimizationParser.g:1883:2: (kw= Imagenet | kw= CIFAR | kw= MNIST )
            {
            // InternalOptimizationParser.g:1883:2: (kw= Imagenet | kw= CIFAR | kw= MNIST )
            int alt15=3;
            switch ( input.LA(1) ) {
            case Imagenet:
                {
                alt15=1;
                }
                break;
            case CIFAR:
                {
                alt15=2;
                }
                break;
            case MNIST:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalOptimizationParser.g:1884:3: kw= Imagenet
                    {
                    kw=(Token)match(input,Imagenet,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBasedataAccess().getImagenetKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1890:3: kw= CIFAR
                    {
                    kw=(Token)match(input,CIFAR,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBasedataAccess().getCIFARKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1896:3: kw= MNIST
                    {
                    kw=(Token)match(input,MNIST,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBasedataAccess().getMNISTKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBasedata"


    // $ANTLR start "entryRuleEAITrainingETL"
    // InternalOptimizationParser.g:1905:1: entryRuleEAITrainingETL returns [EObject current=null] : iv_ruleEAITrainingETL= ruleEAITrainingETL EOF ;
    public final EObject entryRuleEAITrainingETL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingETL = null;


        try {
            // InternalOptimizationParser.g:1905:55: (iv_ruleEAITrainingETL= ruleEAITrainingETL EOF )
            // InternalOptimizationParser.g:1906:2: iv_ruleEAITrainingETL= ruleEAITrainingETL EOF
            {
             newCompositeNode(grammarAccess.getEAITrainingETLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAITrainingETL=ruleEAITrainingETL();

            state._fsp--;

             current =iv_ruleEAITrainingETL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAITrainingETL"


    // $ANTLR start "ruleEAITrainingETL"
    // InternalOptimizationParser.g:1912:1: ruleEAITrainingETL returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEAITrainingETL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefetch_2_0=null;
        Token otherlv_3=null;
        Token lv_cache_4_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1918:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1919:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1919:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1920:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1920:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1921:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1924:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:1925:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1925:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( LA16_0 == Prefetch && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0) ) {
                    alt16=1;
                }
                else if ( LA16_0 == Cache && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalOptimizationParser.g:1926:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1926:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1927:4: {...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1927:108: ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1928:5: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1931:8: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1931:9: {...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "true");
            	    }
            	    // InternalOptimizationParser.g:1931:18: (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1931:19: otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,Prefetch,FOLLOW_38); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAITrainingETLAccess().getPrefetchKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1935:8: ( (lv_prefetch_2_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1936:9: (lv_prefetch_2_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1936:9: (lv_prefetch_2_0= RULE_INT )
            	    // InternalOptimizationParser.g:1937:10: lv_prefetch_2_0= RULE_INT
            	    {
            	    lv_prefetch_2_0=(Token)match(input,RULE_INT,FOLLOW_42); 

            	    										newLeafNode(lv_prefetch_2_0, grammarAccess.getEAITrainingETLAccess().getPrefetchINTTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAITrainingETLRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"prefetch",
            	    											lv_prefetch_2_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:1959:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1959:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1960:4: {...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1960:108: ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1961:5: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1964:8: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1964:9: {...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "true");
            	    }
            	    // InternalOptimizationParser.g:1964:18: (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1964:19: otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,Cache,FOLLOW_38); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAITrainingETLAccess().getCacheKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1968:8: ( (lv_cache_4_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1969:9: (lv_cache_4_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1969:9: (lv_cache_4_0= RULE_INT )
            	    // InternalOptimizationParser.g:1970:10: lv_cache_4_0= RULE_INT
            	    {
            	    lv_cache_4_0=(Token)match(input,RULE_INT,FOLLOW_42); 

            	    										newLeafNode(lv_cache_4_0, grammarAccess.getEAITrainingETLAccess().getCacheINTTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAITrainingETLRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"cache",
            	    											lv_cache_4_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAITrainingETL"


    // $ANTLR start "entryRuleEKeras"
    // InternalOptimizationParser.g:2002:1: entryRuleEKeras returns [EObject current=null] : iv_ruleEKeras= ruleEKeras EOF ;
    public final EObject entryRuleEKeras() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEKeras = null;


        try {
            // InternalOptimizationParser.g:2002:47: (iv_ruleEKeras= ruleEKeras EOF )
            // InternalOptimizationParser.g:2003:2: iv_ruleEKeras= ruleEKeras EOF
            {
             newCompositeNode(grammarAccess.getEKerasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEKeras=ruleEKeras();

            state._fsp--;

             current =iv_ruleEKeras; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEKeras"


    // $ANTLR start "ruleEKeras"
    // InternalOptimizationParser.g:2009:1: ruleEKeras returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEKeras() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_backend_4_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2015:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:2016:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:2016:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:2017:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:2017:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:2018:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEKerasAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2021:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:2022:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:2022:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == Backend && getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOptimizationParser.g:2023:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2023:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2024:4: {...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2024:100: ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:2025:5: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2028:8: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:2028:9: {...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "true");
            	    }
            	    // InternalOptimizationParser.g:2028:18: (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:2028:19: otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Version,FOLLOW_24); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEKerasAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:2032:8: ( (lv_version_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:2033:9: (lv_version_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:2033:9: (lv_version_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:2034:10: lv_version_2_0= RULE_STRING
            	    {
            	    lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_43); 

            	    										newLeafNode(lv_version_2_0, grammarAccess.getEKerasAccess().getVersionSTRINGTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEKerasRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"version",
            	    											lv_version_2_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEKerasAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:2056:3: ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2056:3: ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2057:4: {...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2057:100: ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) )
            	    // InternalOptimizationParser.g:2058:5: ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2061:8: ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) )
            	    // InternalOptimizationParser.g:2061:9: {...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "true");
            	    }
            	    // InternalOptimizationParser.g:2061:18: (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) )
            	    // InternalOptimizationParser.g:2061:19: otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) )
            	    {
            	    otherlv_3=(Token)match(input,Backend,FOLLOW_35); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEKerasAccess().getBackendKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:2065:8: ( (lv_backend_4_0= ruleEBackend ) )
            	    // InternalOptimizationParser.g:2066:9: (lv_backend_4_0= ruleEBackend )
            	    {
            	    // InternalOptimizationParser.g:2066:9: (lv_backend_4_0= ruleEBackend )
            	    // InternalOptimizationParser.g:2067:10: lv_backend_4_0= ruleEBackend
            	    {

            	    										newCompositeNode(grammarAccess.getEKerasAccess().getBackendEBackendParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_43);
            	    lv_backend_4_0=ruleEBackend();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEKerasRule());
            	    										}
            	    										set(
            	    											current,
            	    											"backend",
            	    											lv_backend_4_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EBackend");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEKerasAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEKerasAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEKeras"


    // $ANTLR start "entryRuleEBackend"
    // InternalOptimizationParser.g:2100:1: entryRuleEBackend returns [String current=null] : iv_ruleEBackend= ruleEBackend EOF ;
    public final String entryRuleEBackend() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBackend = null;


        try {
            // InternalOptimizationParser.g:2100:48: (iv_ruleEBackend= ruleEBackend EOF )
            // InternalOptimizationParser.g:2101:2: iv_ruleEBackend= ruleEBackend EOF
            {
             newCompositeNode(grammarAccess.getEBackendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBackend=ruleEBackend();

            state._fsp--;

             current =iv_ruleEBackend.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBackend"


    // $ANTLR start "ruleEBackend"
    // InternalOptimizationParser.g:2107:1: ruleEBackend returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) ;
    public final AntlrDatatypeRuleToken ruleEBackend() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:2113:2: ( (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) )
            // InternalOptimizationParser.g:2114:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
            {
            // InternalOptimizationParser.g:2114:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
            int alt18=5;
            switch ( input.LA(1) ) {
            case TensorFlow:
                {
                alt18=1;
                }
                break;
            case PyTorch:
                {
                alt18=2;
                }
                break;
            case Keras:
                {
                alt18=3;
                }
                break;
            case CNTK:
                {
                alt18=4;
                }
                break;
            case MXNet:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalOptimizationParser.g:2115:3: kw= TensorFlow
                    {
                    kw=(Token)match(input,TensorFlow,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getTensorFlowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:2121:3: kw= PyTorch
                    {
                    kw=(Token)match(input,PyTorch,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getPyTorchKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:2127:3: kw= Keras
                    {
                    kw=(Token)match(input,Keras,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getKerasKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:2133:3: kw= CNTK
                    {
                    kw=(Token)match(input,CNTK,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getCNTKKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOptimizationParser.g:2139:3: kw= MXNet
                    {
                    kw=(Token)match(input,MXNet,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getMXNetKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBackend"


    // $ANTLR start "entryRuleETensorFlow"
    // InternalOptimizationParser.g:2148:1: entryRuleETensorFlow returns [EObject current=null] : iv_ruleETensorFlow= ruleETensorFlow EOF ;
    public final EObject entryRuleETensorFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETensorFlow = null;


        try {
            // InternalOptimizationParser.g:2148:52: (iv_ruleETensorFlow= ruleETensorFlow EOF )
            // InternalOptimizationParser.g:2149:2: iv_ruleETensorFlow= ruleETensorFlow EOF
            {
             newCompositeNode(grammarAccess.getETensorFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETensorFlow=ruleETensorFlow();

            state._fsp--;

             current =iv_ruleETensorFlow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETensorFlow"


    // $ANTLR start "ruleETensorFlow"
    // InternalOptimizationParser.g:2155:1: ruleETensorFlow returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleETensorFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token lv_xla_4_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:2161:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:2162:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:2162:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:2163:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:2163:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:2164:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getETensorFlowAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2167:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:2168:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:2168:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( LA19_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == Xla && getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOptimizationParser.g:2169:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2169:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2170:4: {...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2170:105: ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:2171:5: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2174:8: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:2174:9: {...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "true");
            	    }
            	    // InternalOptimizationParser.g:2174:18: (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:2174:19: otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Version,FOLLOW_24); 

            	    								newLeafNode(otherlv_1, grammarAccess.getETensorFlowAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:2178:8: ( (lv_version_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:2179:9: (lv_version_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:2179:9: (lv_version_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:2180:10: lv_version_2_0= RULE_STRING
            	    {
            	    lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

            	    										newLeafNode(lv_version_2_0, grammarAccess.getETensorFlowAccess().getVersionSTRINGTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getETensorFlowRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"version",
            	    											lv_version_2_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETensorFlowAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:2202:3: ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2202:3: ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2203:4: {...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2203:105: ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:2204:5: ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2207:8: ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:2207:9: {...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "true");
            	    }
            	    // InternalOptimizationParser.g:2207:18: (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:2207:19: otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,Xla,FOLLOW_6); 

            	    								newLeafNode(otherlv_3, grammarAccess.getETensorFlowAccess().getXlaKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:2211:8: ( (lv_xla_4_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:2212:9: (lv_xla_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:2212:9: (lv_xla_4_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:2213:10: lv_xla_4_0= RULE_BOOLEAN
            	    {
            	    lv_xla_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_44); 

            	    										newLeafNode(lv_xla_4_0, grammarAccess.getETensorFlowAccess().getXlaBOOLEANTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getETensorFlowRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"xla",
            	    											lv_xla_4_0,
            	    											"org.sodalite.dsl.optimization.Optimization.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETensorFlowAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getETensorFlowAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleETensorFlow"


    // $ANTLR start "entryRuleEPyTorch"
    // InternalOptimizationParser.g:2245:1: entryRuleEPyTorch returns [EObject current=null] : iv_ruleEPyTorch= ruleEPyTorch EOF ;
    public final EObject entryRuleEPyTorch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPyTorch = null;


        try {
            // InternalOptimizationParser.g:2245:49: (iv_ruleEPyTorch= ruleEPyTorch EOF )
            // InternalOptimizationParser.g:2246:2: iv_ruleEPyTorch= ruleEPyTorch EOF
            {
             newCompositeNode(grammarAccess.getEPyTorchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPyTorch=ruleEPyTorch();

            state._fsp--;

             current =iv_ruleEPyTorch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPyTorch"


    // $ANTLR start "ruleEPyTorch"
    // InternalOptimizationParser.g:2252:1: ruleEPyTorch returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEPyTorch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token lv_glow_4_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:2258:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:2259:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:2259:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:2260:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:2260:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:2261:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPyTorchAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2264:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:2265:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:2265:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == Glow && getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOptimizationParser.g:2266:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2266:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2267:4: {...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2267:102: ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:2268:5: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2271:8: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:2271:9: {...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "true");
            	    }
            	    // InternalOptimizationParser.g:2271:18: (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:2271:19: otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Version,FOLLOW_24); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPyTorchAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:2275:8: ( (lv_version_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:2276:9: (lv_version_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:2276:9: (lv_version_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:2277:10: lv_version_2_0= RULE_STRING
            	    {
            	    lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            	    										newLeafNode(lv_version_2_0, grammarAccess.getEPyTorchAccess().getVersionSTRINGTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPyTorchRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"version",
            	    											lv_version_2_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPyTorchAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:2299:3: ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2299:3: ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2300:4: {...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2300:102: ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:2301:5: ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2304:8: ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:2304:9: {...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "true");
            	    }
            	    // InternalOptimizationParser.g:2304:18: (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:2304:19: otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,Glow,FOLLOW_6); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPyTorchAccess().getGlowKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:2308:8: ( (lv_glow_4_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:2309:9: (lv_glow_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:2309:9: (lv_glow_4_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:2310:10: lv_glow_4_0= RULE_BOOLEAN
            	    {
            	    lv_glow_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_45); 

            	    										newLeafNode(lv_glow_4_0, grammarAccess.getEPyTorchAccess().getGlowBOOLEANTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPyTorchRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"glow",
            	    											lv_glow_4_0,
            	    											"org.sodalite.dsl.optimization.Optimization.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPyTorchAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEPyTorchAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPyTorch"


    // $ANTLR start "entryRuleEHPC"
    // InternalOptimizationParser.g:2342:1: entryRuleEHPC returns [EObject current=null] : iv_ruleEHPC= ruleEHPC EOF ;
    public final EObject entryRuleEHPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPC = null;


        try {
            // InternalOptimizationParser.g:2342:45: (iv_ruleEHPC= ruleEHPC EOF )
            // InternalOptimizationParser.g:2343:2: iv_ruleEHPC= ruleEHPC EOF
            {
             newCompositeNode(grammarAccess.getEHPCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEHPC=ruleEHPC();

            state._fsp--;

             current =iv_ruleEHPC; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEHPC"


    // $ANTLR start "ruleEHPC"
    // InternalOptimizationParser.g:2349:1: ruleEHPC returns [EObject current=null] : ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEHPCConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEHPCData ) ) this_END_7= RULE_END ) ( (lv_hpccase_8_0= ruleEHPCCases ) ) ) ;
    public final EObject ruleEHPC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        EObject lv_config_2_0 = null;

        EObject lv_data_6_0 = null;

        EObject lv_hpccase_8_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2355:2: ( ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEHPCConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEHPCData ) ) this_END_7= RULE_END ) ( (lv_hpccase_8_0= ruleEHPCCases ) ) ) )
            // InternalOptimizationParser.g:2356:2: ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEHPCConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEHPCData ) ) this_END_7= RULE_END ) ( (lv_hpccase_8_0= ruleEHPCCases ) ) )
            {
            // InternalOptimizationParser.g:2356:2: ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEHPCConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEHPCData ) ) this_END_7= RULE_END ) ( (lv_hpccase_8_0= ruleEHPCCases ) ) )
            // InternalOptimizationParser.g:2357:3: (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEHPCConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEHPCData ) ) this_END_7= RULE_END ) ( (lv_hpccase_8_0= ruleEHPCCases ) )
            {
            // InternalOptimizationParser.g:2357:3: (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEHPCConfig ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2358:4: otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEHPCConfig ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Config,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getEHPCAccess().getConfigKeyword_0_0());
            			
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_46); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEHPCAccess().getBEGINTerminalRuleCall_0_1());
            			
            // InternalOptimizationParser.g:2366:4: ( (lv_config_2_0= ruleEHPCConfig ) )
            // InternalOptimizationParser.g:2367:5: (lv_config_2_0= ruleEHPCConfig )
            {
            // InternalOptimizationParser.g:2367:5: (lv_config_2_0= ruleEHPCConfig )
            // InternalOptimizationParser.g:2368:6: lv_config_2_0= ruleEHPCConfig
            {

            						newCompositeNode(grammarAccess.getEHPCAccess().getConfigEHPCConfigParserRuleCall_0_2_0());
            					
            pushFollow(FOLLOW_5);
            lv_config_2_0=ruleEHPCConfig();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEHPCRule());
            						}
            						set(
            							current,
            							"config",
            							lv_config_2_0,
            							"org.sodalite.dsl.optimization.Optimization.EHPCConfig");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_29); 

            				newLeafNode(this_END_3, grammarAccess.getEHPCAccess().getENDTerminalRuleCall_0_3());
            			

            }

            // InternalOptimizationParser.g:2390:3: (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEHPCData ) ) this_END_7= RULE_END )
            // InternalOptimizationParser.g:2391:4: otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEHPCData ) ) this_END_7= RULE_END
            {
            otherlv_4=(Token)match(input,Data,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getEHPCAccess().getDataKeyword_1_0());
            			
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            				newLeafNode(this_BEGIN_5, grammarAccess.getEHPCAccess().getBEGINTerminalRuleCall_1_1());
            			
            // InternalOptimizationParser.g:2399:4: ( (lv_data_6_0= ruleEHPCData ) )
            // InternalOptimizationParser.g:2400:5: (lv_data_6_0= ruleEHPCData )
            {
            // InternalOptimizationParser.g:2400:5: (lv_data_6_0= ruleEHPCData )
            // InternalOptimizationParser.g:2401:6: lv_data_6_0= ruleEHPCData
            {

            						newCompositeNode(grammarAccess.getEHPCAccess().getDataEHPCDataParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_5);
            lv_data_6_0=ruleEHPCData();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEHPCRule());
            						}
            						set(
            							current,
            							"data",
            							lv_data_6_0,
            							"org.sodalite.dsl.optimization.Optimization.EHPCData");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            this_END_7=(Token)match(input,RULE_END,FOLLOW_47); 

            				newLeafNode(this_END_7, grammarAccess.getEHPCAccess().getENDTerminalRuleCall_1_3());
            			

            }

            // InternalOptimizationParser.g:2423:3: ( (lv_hpccase_8_0= ruleEHPCCases ) )
            // InternalOptimizationParser.g:2424:4: (lv_hpccase_8_0= ruleEHPCCases )
            {
            // InternalOptimizationParser.g:2424:4: (lv_hpccase_8_0= ruleEHPCCases )
            // InternalOptimizationParser.g:2425:5: lv_hpccase_8_0= ruleEHPCCases
            {

            					newCompositeNode(grammarAccess.getEHPCAccess().getHpccaseEHPCCasesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_hpccase_8_0=ruleEHPCCases();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEHPCRule());
            					}
            					set(
            						current,
            						"hpccase",
            						lv_hpccase_8_0,
            						"org.sodalite.dsl.optimization.Optimization.EHPCCases");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEHPC"


    // $ANTLR start "entryRuleEHPCCases"
    // InternalOptimizationParser.g:2446:1: entryRuleEHPCCases returns [EObject current=null] : iv_ruleEHPCCases= ruleEHPCCases EOF ;
    public final EObject entryRuleEHPCCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCCases = null;


        try {
            // InternalOptimizationParser.g:2446:50: (iv_ruleEHPCCases= ruleEHPCCases EOF )
            // InternalOptimizationParser.g:2447:2: iv_ruleEHPCCases= ruleEHPCCases EOF
            {
             newCompositeNode(grammarAccess.getEHPCCasesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEHPCCases=ruleEHPCCases();

            state._fsp--;

             current =iv_ruleEHPCCases; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEHPCCases"


    // $ANTLR start "ruleEHPCCases"
    // InternalOptimizationParser.g:2453:1: ruleEHPCCases returns [EObject current=null] : (this_EMPICase_0= ruleEMPICase | this_EOPENMPCase_1= ruleEOPENMPCase | this_EOPENACCCase_2= ruleEOPENACCCase | this_EOPENCLCase_3= ruleEOPENCLCase ) ;
    public final EObject ruleEHPCCases() throws RecognitionException {
        EObject current = null;

        EObject this_EMPICase_0 = null;

        EObject this_EOPENMPCase_1 = null;

        EObject this_EOPENACCCase_2 = null;

        EObject this_EOPENCLCase_3 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2459:2: ( (this_EMPICase_0= ruleEMPICase | this_EOPENMPCase_1= ruleEOPENMPCase | this_EOPENACCCase_2= ruleEOPENACCCase | this_EOPENCLCase_3= ruleEOPENCLCase ) )
            // InternalOptimizationParser.g:2460:2: (this_EMPICase_0= ruleEMPICase | this_EOPENMPCase_1= ruleEOPENMPCase | this_EOPENACCCase_2= ruleEOPENACCCase | this_EOPENCLCase_3= ruleEOPENCLCase )
            {
            // InternalOptimizationParser.g:2460:2: (this_EMPICase_0= ruleEMPICase | this_EOPENMPCase_1= ruleEOPENMPCase | this_EOPENACCCase_2= ruleEOPENACCCase | this_EOPENCLCase_3= ruleEOPENCLCase )
            int alt21=4;
            switch ( input.LA(1) ) {
            case Mpi:
                {
                alt21=1;
                }
                break;
            case Openmp:
                {
                alt21=2;
                }
                break;
            case Openacc:
                {
                alt21=3;
                }
                break;
            case Opencl:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalOptimizationParser.g:2461:3: this_EMPICase_0= ruleEMPICase
                    {

                    			newCompositeNode(grammarAccess.getEHPCCasesAccess().getEMPICaseParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EMPICase_0=ruleEMPICase();

                    state._fsp--;


                    			current = this_EMPICase_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:2470:3: this_EOPENMPCase_1= ruleEOPENMPCase
                    {

                    			newCompositeNode(grammarAccess.getEHPCCasesAccess().getEOPENMPCaseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EOPENMPCase_1=ruleEOPENMPCase();

                    state._fsp--;


                    			current = this_EOPENMPCase_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:2479:3: this_EOPENACCCase_2= ruleEOPENACCCase
                    {

                    			newCompositeNode(grammarAccess.getEHPCCasesAccess().getEOPENACCCaseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EOPENACCCase_2=ruleEOPENACCCase();

                    state._fsp--;


                    			current = this_EOPENACCCase_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:2488:3: this_EOPENCLCase_3= ruleEOPENCLCase
                    {

                    			newCompositeNode(grammarAccess.getEHPCCasesAccess().getEOPENCLCaseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EOPENCLCase_3=ruleEOPENCLCase();

                    state._fsp--;


                    			current = this_EOPENCLCase_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEHPCCases"


    // $ANTLR start "entryRuleEOPENCLCase"
    // InternalOptimizationParser.g:2500:1: entryRuleEOPENCLCase returns [EObject current=null] : iv_ruleEOPENCLCase= ruleEOPENCLCase EOF ;
    public final EObject entryRuleEOPENCLCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENCLCase = null;


        try {
            // InternalOptimizationParser.g:2500:52: (iv_ruleEOPENCLCase= ruleEOPENCLCase EOF )
            // InternalOptimizationParser.g:2501:2: iv_ruleEOPENCLCase= ruleEOPENCLCase EOF
            {
             newCompositeNode(grammarAccess.getEOPENCLCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOPENCLCase=ruleEOPENCLCase();

            state._fsp--;

             current =iv_ruleEOPENCLCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOPENCLCase"


    // $ANTLR start "ruleEOPENCLCase"
    // InternalOptimizationParser.g:2507:1: ruleEOPENCLCase returns [EObject current=null] : (otherlv_0= Opencl this_BEGIN_1= RULE_BEGIN ( (lv_opencl_2_0= ruleEOPENCL ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEOPENCLCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_opencl_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2513:2: ( (otherlv_0= Opencl this_BEGIN_1= RULE_BEGIN ( (lv_opencl_2_0= ruleEOPENCL ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:2514:2: (otherlv_0= Opencl this_BEGIN_1= RULE_BEGIN ( (lv_opencl_2_0= ruleEOPENCL ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:2514:2: (otherlv_0= Opencl this_BEGIN_1= RULE_BEGIN ( (lv_opencl_2_0= ruleEOPENCL ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2515:3: otherlv_0= Opencl this_BEGIN_1= RULE_BEGIN ( (lv_opencl_2_0= ruleEOPENCL ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Opencl,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEOPENCLCaseAccess().getOpenclKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_48); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEOPENCLCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:2523:3: ( (lv_opencl_2_0= ruleEOPENCL ) )
            // InternalOptimizationParser.g:2524:4: (lv_opencl_2_0= ruleEOPENCL )
            {
            // InternalOptimizationParser.g:2524:4: (lv_opencl_2_0= ruleEOPENCL )
            // InternalOptimizationParser.g:2525:5: lv_opencl_2_0= ruleEOPENCL
            {

            					newCompositeNode(grammarAccess.getEOPENCLCaseAccess().getOpenclEOPENCLParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_opencl_2_0=ruleEOPENCL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOPENCLCaseRule());
            					}
            					set(
            						current,
            						"opencl",
            						lv_opencl_2_0,
            						"org.sodalite.dsl.optimization.Optimization.EOPENCL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEOPENCLCaseAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOPENCLCase"


    // $ANTLR start "entryRuleEOPENACCCase"
    // InternalOptimizationParser.g:2550:1: entryRuleEOPENACCCase returns [EObject current=null] : iv_ruleEOPENACCCase= ruleEOPENACCCase EOF ;
    public final EObject entryRuleEOPENACCCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENACCCase = null;


        try {
            // InternalOptimizationParser.g:2550:53: (iv_ruleEOPENACCCase= ruleEOPENACCCase EOF )
            // InternalOptimizationParser.g:2551:2: iv_ruleEOPENACCCase= ruleEOPENACCCase EOF
            {
             newCompositeNode(grammarAccess.getEOPENACCCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOPENACCCase=ruleEOPENACCCase();

            state._fsp--;

             current =iv_ruleEOPENACCCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOPENACCCase"


    // $ANTLR start "ruleEOPENACCCase"
    // InternalOptimizationParser.g:2557:1: ruleEOPENACCCase returns [EObject current=null] : (otherlv_0= Openacc this_BEGIN_1= RULE_BEGIN ( (lv_openacc_2_0= ruleEOPENACC ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEOPENACCCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_openacc_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2563:2: ( (otherlv_0= Openacc this_BEGIN_1= RULE_BEGIN ( (lv_openacc_2_0= ruleEOPENACC ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:2564:2: (otherlv_0= Openacc this_BEGIN_1= RULE_BEGIN ( (lv_openacc_2_0= ruleEOPENACC ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:2564:2: (otherlv_0= Openacc this_BEGIN_1= RULE_BEGIN ( (lv_openacc_2_0= ruleEOPENACC ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2565:3: otherlv_0= Openacc this_BEGIN_1= RULE_BEGIN ( (lv_openacc_2_0= ruleEOPENACC ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Openacc,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEOPENACCCaseAccess().getOpenaccKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_48); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEOPENACCCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:2573:3: ( (lv_openacc_2_0= ruleEOPENACC ) )
            // InternalOptimizationParser.g:2574:4: (lv_openacc_2_0= ruleEOPENACC )
            {
            // InternalOptimizationParser.g:2574:4: (lv_openacc_2_0= ruleEOPENACC )
            // InternalOptimizationParser.g:2575:5: lv_openacc_2_0= ruleEOPENACC
            {

            					newCompositeNode(grammarAccess.getEOPENACCCaseAccess().getOpenaccEOPENACCParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_openacc_2_0=ruleEOPENACC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOPENACCCaseRule());
            					}
            					set(
            						current,
            						"openacc",
            						lv_openacc_2_0,
            						"org.sodalite.dsl.optimization.Optimization.EOPENACC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEOPENACCCaseAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOPENACCCase"


    // $ANTLR start "entryRuleEOPENMPCase"
    // InternalOptimizationParser.g:2600:1: entryRuleEOPENMPCase returns [EObject current=null] : iv_ruleEOPENMPCase= ruleEOPENMPCase EOF ;
    public final EObject entryRuleEOPENMPCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENMPCase = null;


        try {
            // InternalOptimizationParser.g:2600:52: (iv_ruleEOPENMPCase= ruleEOPENMPCase EOF )
            // InternalOptimizationParser.g:2601:2: iv_ruleEOPENMPCase= ruleEOPENMPCase EOF
            {
             newCompositeNode(grammarAccess.getEOPENMPCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOPENMPCase=ruleEOPENMPCase();

            state._fsp--;

             current =iv_ruleEOPENMPCase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOPENMPCase"


    // $ANTLR start "ruleEOPENMPCase"
    // InternalOptimizationParser.g:2607:1: ruleEOPENMPCase returns [EObject current=null] : (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEOPENMPCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_openmp_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2613:2: ( (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:2614:2: (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:2614:2: (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2615:3: otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Openmp,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEOPENMPCaseAccess().getOpenmpKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEOPENMPCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:2623:3: ( (lv_openmp_2_0= ruleEOPENMP ) )
            // InternalOptimizationParser.g:2624:4: (lv_openmp_2_0= ruleEOPENMP )
            {
            // InternalOptimizationParser.g:2624:4: (lv_openmp_2_0= ruleEOPENMP )
            // InternalOptimizationParser.g:2625:5: lv_openmp_2_0= ruleEOPENMP
            {

            					newCompositeNode(grammarAccess.getEOPENMPCaseAccess().getOpenmpEOPENMPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_openmp_2_0=ruleEOPENMP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOPENMPCaseRule());
            					}
            					set(
            						current,
            						"openmp",
            						lv_openmp_2_0,
            						"org.sodalite.dsl.optimization.Optimization.EOPENMP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEOPENMPCaseAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOPENMPCase"


    // $ANTLR start "entryRuleEMPICase"
    // InternalOptimizationParser.g:2650:1: entryRuleEMPICase returns [EObject current=null] : iv_ruleEMPICase= ruleEMPICase EOF ;
    public final EObject entryRuleEMPICase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMPICase = null;


        try {
            // InternalOptimizationParser.g:2650:49: (iv_ruleEMPICase= ruleEMPICase EOF )
            // InternalOptimizationParser.g:2651:2: iv_ruleEMPICase= ruleEMPICase EOF
            {
             newCompositeNode(grammarAccess.getEMPICaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMPICase=ruleEMPICase();

            state._fsp--;

             current =iv_ruleEMPICase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMPICase"


    // $ANTLR start "ruleEMPICase"
    // InternalOptimizationParser.g:2657:1: ruleEMPICase returns [EObject current=null] : (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEMPICase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_mpi_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2663:2: ( (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:2664:2: (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:2664:2: (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2665:3: otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Mpi,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEMPICaseAccess().getMpiKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEMPICaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:2673:3: ( (lv_mpi_2_0= ruleEMPI ) )
            // InternalOptimizationParser.g:2674:4: (lv_mpi_2_0= ruleEMPI )
            {
            // InternalOptimizationParser.g:2674:4: (lv_mpi_2_0= ruleEMPI )
            // InternalOptimizationParser.g:2675:5: lv_mpi_2_0= ruleEMPI
            {

            					newCompositeNode(grammarAccess.getEMPICaseAccess().getMpiEMPIParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_mpi_2_0=ruleEMPI();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEMPICaseRule());
            					}
            					set(
            						current,
            						"mpi",
            						lv_mpi_2_0,
            						"org.sodalite.dsl.optimization.Optimization.EMPI");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEMPICaseAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMPICase"


    // $ANTLR start "entryRuleEHPCConfig"
    // InternalOptimizationParser.g:2700:1: entryRuleEHPCConfig returns [EObject current=null] : iv_ruleEHPCConfig= ruleEHPCConfig EOF ;
    public final EObject entryRuleEHPCConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCConfig = null;


        try {
            // InternalOptimizationParser.g:2700:51: (iv_ruleEHPCConfig= ruleEHPCConfig EOF )
            // InternalOptimizationParser.g:2701:2: iv_ruleEHPCConfig= ruleEHPCConfig EOF
            {
             newCompositeNode(grammarAccess.getEHPCConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEHPCConfig=ruleEHPCConfig();

            state._fsp--;

             current =iv_ruleEHPCConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEHPCConfig"


    // $ANTLR start "ruleEHPCConfig"
    // InternalOptimizationParser.g:2707:1: ruleEHPCConfig returns [EObject current=null] : (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) ) ;
    public final EObject ruleEHPCConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_parallelisation_1_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2713:2: ( (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) ) )
            // InternalOptimizationParser.g:2714:2: (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) )
            {
            // InternalOptimizationParser.g:2714:2: (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) )
            // InternalOptimizationParser.g:2715:3: otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) )
            {
            otherlv_0=(Token)match(input,Parallelisation,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getEHPCConfigAccess().getParallelisationKeyword_0());
            		
            // InternalOptimizationParser.g:2719:3: ( (lv_parallelisation_1_0= ruleEParallelisation ) )
            // InternalOptimizationParser.g:2720:4: (lv_parallelisation_1_0= ruleEParallelisation )
            {
            // InternalOptimizationParser.g:2720:4: (lv_parallelisation_1_0= ruleEParallelisation )
            // InternalOptimizationParser.g:2721:5: lv_parallelisation_1_0= ruleEParallelisation
            {

            					newCompositeNode(grammarAccess.getEHPCConfigAccess().getParallelisationEParallelisationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_parallelisation_1_0=ruleEParallelisation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEHPCConfigRule());
            					}
            					set(
            						current,
            						"parallelisation",
            						lv_parallelisation_1_0,
            						"org.sodalite.dsl.optimization.Optimization.EParallelisation");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEHPCConfig"


    // $ANTLR start "entryRuleEParallelisation"
    // InternalOptimizationParser.g:2742:1: entryRuleEParallelisation returns [String current=null] : iv_ruleEParallelisation= ruleEParallelisation EOF ;
    public final String entryRuleEParallelisation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEParallelisation = null;


        try {
            // InternalOptimizationParser.g:2742:56: (iv_ruleEParallelisation= ruleEParallelisation EOF )
            // InternalOptimizationParser.g:2743:2: iv_ruleEParallelisation= ruleEParallelisation EOF
            {
             newCompositeNode(grammarAccess.getEParallelisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParallelisation=ruleEParallelisation();

            state._fsp--;

             current =iv_ruleEParallelisation.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEParallelisation"


    // $ANTLR start "ruleEParallelisation"
    // InternalOptimizationParser.g:2749:1: ruleEParallelisation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL ) ;
    public final AntlrDatatypeRuleToken ruleEParallelisation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:2755:2: ( (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL ) )
            // InternalOptimizationParser.g:2756:2: (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL )
            {
            // InternalOptimizationParser.g:2756:2: (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL )
            int alt22=4;
            switch ( input.LA(1) ) {
            case MPI:
                {
                alt22=1;
                }
                break;
            case OPENMP:
                {
                alt22=2;
                }
                break;
            case OPENACC:
                {
                alt22=3;
                }
                break;
            case OPENCL:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalOptimizationParser.g:2757:3: kw= MPI
                    {
                    kw=(Token)match(input,MPI,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEParallelisationAccess().getMPIKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:2763:3: kw= OPENMP
                    {
                    kw=(Token)match(input,OPENMP,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEParallelisationAccess().getOPENMPKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:2769:3: kw= OPENACC
                    {
                    kw=(Token)match(input,OPENACC,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEParallelisationAccess().getOPENACCKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:2775:3: kw= OPENCL
                    {
                    kw=(Token)match(input,OPENCL,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEParallelisationAccess().getOPENCLKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEParallelisation"


    // $ANTLR start "entryRuleEHPCData"
    // InternalOptimizationParser.g:2784:1: entryRuleEHPCData returns [EObject current=null] : iv_ruleEHPCData= ruleEHPCData EOF ;
    public final EObject entryRuleEHPCData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCData = null;


        try {
            // InternalOptimizationParser.g:2784:49: (iv_ruleEHPCData= ruleEHPCData EOF )
            // InternalOptimizationParser.g:2785:2: iv_ruleEHPCData= ruleEHPCData EOF
            {
             newCompositeNode(grammarAccess.getEHPCDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEHPCData=ruleEHPCData();

            state._fsp--;

             current =iv_ruleEHPCData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEHPCData"


    // $ANTLR start "ruleEHPCData"
    // InternalOptimizationParser.g:2791:1: ruleEHPCData returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) ) ;
    public final EObject ruleEHPCData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_location_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_size_6_0=null;
        Token otherlv_7=null;
        Token lv_count_8_0=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_basedata_4_0 = null;

        EObject lv_etl_11_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2797:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:2798:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:2798:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:2799:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:2799:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) )
            // InternalOptimizationParser.g:2800:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2803:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* )
            // InternalOptimizationParser.g:2804:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )*
            {
            // InternalOptimizationParser.g:2804:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )*
            loop23:
            do {
                int alt23=6;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == Location && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == Basedata && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2) ) {
                    alt23=3;
                }
                else if ( LA23_0 == Count && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3) ) {
                    alt23=4;
                }
                else if ( LA23_0 == Etl && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4) ) {
                    alt23=5;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOptimizationParser.g:2805:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2805:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2806:4: {...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2806:102: ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:2807:5: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2810:8: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:2810:9: {...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2810:18: (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:2810:19: otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Location,FOLLOW_24); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEHPCDataAccess().getLocationKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:2814:8: ( (lv_location_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:2815:9: (lv_location_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:2815:9: (lv_location_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:2816:10: lv_location_2_0= RULE_STRING
            	    {
            	    lv_location_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

            	    										newLeafNode(lv_location_2_0, grammarAccess.getEHPCDataAccess().getLocationSTRINGTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEHPCDataRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"location",
            	    											lv_location_2_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:2838:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2838:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2839:4: {...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2839:102: ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) )
            	    // InternalOptimizationParser.g:2840:5: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2843:8: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) )
            	    // InternalOptimizationParser.g:2843:9: {...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2843:18: (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) )
            	    // InternalOptimizationParser.g:2843:19: otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) )
            	    {
            	    otherlv_3=(Token)match(input,Basedata,FOLLOW_52); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEHPCDataAccess().getBasedataKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:2847:8: ( (lv_basedata_4_0= ruleEHPCBasedata ) )
            	    // InternalOptimizationParser.g:2848:9: (lv_basedata_4_0= ruleEHPCBasedata )
            	    {
            	    // InternalOptimizationParser.g:2848:9: (lv_basedata_4_0= ruleEHPCBasedata )
            	    // InternalOptimizationParser.g:2849:10: lv_basedata_4_0= ruleEHPCBasedata
            	    {

            	    										newCompositeNode(grammarAccess.getEHPCDataAccess().getBasedataEHPCBasedataParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_39);
            	    lv_basedata_4_0=ruleEHPCBasedata();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEHPCDataRule());
            	    										}
            	    										set(
            	    											current,
            	    											"basedata",
            	    											lv_basedata_4_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EHPCBasedata");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOptimizationParser.g:2872:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2872:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2873:4: {...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:2873:102: ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:2874:5: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:2877:8: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:2877:9: {...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2877:18: (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:2877:19: otherlv_5= Size ( (lv_size_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Size,FOLLOW_38); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEHPCDataAccess().getSizeKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:2881:8: ( (lv_size_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:2882:9: (lv_size_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:2882:9: (lv_size_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:2883:10: lv_size_6_0= RULE_INT
            	    {
            	    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            	    										newLeafNode(lv_size_6_0, grammarAccess.getEHPCDataAccess().getSizeINTTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEHPCDataRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"size",
            	    											lv_size_6_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOptimizationParser.g:2905:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2905:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2906:4: {...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:2906:102: ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:2907:5: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:2910:8: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:2910:9: {...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2910:18: (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:2910:19: otherlv_7= Count ( (lv_count_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Count,FOLLOW_38); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEHPCDataAccess().getCountKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:2914:8: ( (lv_count_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:2915:9: (lv_count_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:2915:9: (lv_count_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:2916:10: lv_count_8_0= RULE_INT
            	    {
            	    lv_count_8_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            	    										newLeafNode(lv_count_8_0, grammarAccess.getEHPCDataAccess().getCountINTTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEHPCDataRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"count",
            	    											lv_count_8_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalOptimizationParser.g:2938:3: ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2938:3: ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalOptimizationParser.g:2939:4: {...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:2939:102: ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) )
            	    // InternalOptimizationParser.g:2940:5: ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:2943:8: ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) )
            	    // InternalOptimizationParser.g:2943:9: {...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2943:18: (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END )
            	    // InternalOptimizationParser.g:2943:19: otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Etl,FOLLOW_3); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEHPCDataAccess().getEtlKeyword_4_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getEHPCDataAccess().getBEGINTerminalRuleCall_4_1());
            	    							
            	    // InternalOptimizationParser.g:2951:8: ( (lv_etl_11_0= ruleEHPCETL ) )
            	    // InternalOptimizationParser.g:2952:9: (lv_etl_11_0= ruleEHPCETL )
            	    {
            	    // InternalOptimizationParser.g:2952:9: (lv_etl_11_0= ruleEHPCETL )
            	    // InternalOptimizationParser.g:2953:10: lv_etl_11_0= ruleEHPCETL
            	    {

            	    										newCompositeNode(grammarAccess.getEHPCDataAccess().getEtlEHPCETLParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_etl_11_0=ruleEHPCETL();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEHPCDataRule());
            	    										}
            	    										set(
            	    											current,
            	    											"etl",
            	    											lv_etl_11_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EHPCETL");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_39); 

            	    								newLeafNode(this_END_12, grammarAccess.getEHPCDataAccess().getENDTerminalRuleCall_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEHPCData"


    // $ANTLR start "entryRuleEHPCETL"
    // InternalOptimizationParser.g:2990:1: entryRuleEHPCETL returns [EObject current=null] : iv_ruleEHPCETL= ruleEHPCETL EOF ;
    public final EObject entryRuleEHPCETL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCETL = null;


        try {
            // InternalOptimizationParser.g:2990:48: (iv_ruleEHPCETL= ruleEHPCETL EOF )
            // InternalOptimizationParser.g:2991:2: iv_ruleEHPCETL= ruleEHPCETL EOF
            {
             newCompositeNode(grammarAccess.getEHPCETLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEHPCETL=ruleEHPCETL();

            state._fsp--;

             current =iv_ruleEHPCETL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEHPCETL"


    // $ANTLR start "ruleEHPCETL"
    // InternalOptimizationParser.g:2997:1: ruleEHPCETL returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEHPCETL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefetch_2_0=null;
        Token otherlv_3=null;
        Token lv_cache_4_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3003:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:3004:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:3004:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:3005:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:3005:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:3006:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEHPCETLAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3009:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:3010:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:3010:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == Prefetch && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == Cache && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalOptimizationParser.g:3011:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3011:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3012:4: {...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3012:101: ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:3013:5: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3016:8: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:3016:9: {...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "true");
            	    }
            	    // InternalOptimizationParser.g:3016:18: (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:3016:19: otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_1=(Token)match(input,Prefetch,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEHPCETLAccess().getPrefetchKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3020:8: ( (lv_prefetch_2_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:3021:9: (lv_prefetch_2_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:3021:9: (lv_prefetch_2_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:3022:10: lv_prefetch_2_0= RULE_BOOLEAN
            	    {
            	    lv_prefetch_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_42); 

            	    										newLeafNode(lv_prefetch_2_0, grammarAccess.getEHPCETLAccess().getPrefetchBOOLEANTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEHPCETLRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"prefetch",
            	    											lv_prefetch_2_0,
            	    											"org.sodalite.dsl.optimization.Optimization.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCETLAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:3044:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3044:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3045:4: {...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3045:101: ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:3046:5: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3049:8: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:3049:9: {...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "true");
            	    }
            	    // InternalOptimizationParser.g:3049:18: (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:3049:19: otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,Cache,FOLLOW_6); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEHPCETLAccess().getCacheKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3053:8: ( (lv_cache_4_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:3054:9: (lv_cache_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:3054:9: (lv_cache_4_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:3055:10: lv_cache_4_0= RULE_BOOLEAN
            	    {
            	    lv_cache_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_42); 

            	    										newLeafNode(lv_cache_4_0, grammarAccess.getEHPCETLAccess().getCacheBOOLEANTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEHPCETLRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"cache",
            	    											lv_cache_4_0,
            	    											"org.sodalite.dsl.optimization.Optimization.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCETLAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEHPCETLAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEHPCETL"


    // $ANTLR start "entryRuleEHPCBasedata"
    // InternalOptimizationParser.g:3087:1: entryRuleEHPCBasedata returns [String current=null] : iv_ruleEHPCBasedata= ruleEHPCBasedata EOF ;
    public final String entryRuleEHPCBasedata() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEHPCBasedata = null;


        try {
            // InternalOptimizationParser.g:3087:52: (iv_ruleEHPCBasedata= ruleEHPCBasedata EOF )
            // InternalOptimizationParser.g:3088:2: iv_ruleEHPCBasedata= ruleEHPCBasedata EOF
            {
             newCompositeNode(grammarAccess.getEHPCBasedataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEHPCBasedata=ruleEHPCBasedata();

            state._fsp--;

             current =iv_ruleEHPCBasedata.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEHPCBasedata"


    // $ANTLR start "ruleEHPCBasedata"
    // InternalOptimizationParser.g:3094:1: ruleEHPCBasedata returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= IMAGE | kw= RESTART ) ;
    public final AntlrDatatypeRuleToken ruleEHPCBasedata() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3100:2: ( (kw= IMAGE | kw= RESTART ) )
            // InternalOptimizationParser.g:3101:2: (kw= IMAGE | kw= RESTART )
            {
            // InternalOptimizationParser.g:3101:2: (kw= IMAGE | kw= RESTART )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IMAGE) ) {
                alt25=1;
            }
            else if ( (LA25_0==RESTART) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalOptimizationParser.g:3102:3: kw= IMAGE
                    {
                    kw=(Token)match(input,IMAGE,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEHPCBasedataAccess().getIMAGEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3108:3: kw= RESTART
                    {
                    kw=(Token)match(input,RESTART,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEHPCBasedataAccess().getRESTARTKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEHPCBasedata"


    // $ANTLR start "entryRuleEMPI"
    // InternalOptimizationParser.g:3117:1: entryRuleEMPI returns [EObject current=null] : iv_ruleEMPI= ruleEMPI EOF ;
    public final EObject entryRuleEMPI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMPI = null;


        try {
            // InternalOptimizationParser.g:3117:45: (iv_ruleEMPI= ruleEMPI EOF )
            // InternalOptimizationParser.g:3118:2: iv_ruleEMPI= ruleEMPI EOF
            {
             newCompositeNode(grammarAccess.getEMPIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMPI=ruleEMPI();

            state._fsp--;

             current =iv_ruleEMPI; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMPI"


    // $ANTLR start "ruleEMPI"
    // InternalOptimizationParser.g:3124:1: ruleEMPI returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEMPI() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_core_subscription_8_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_library_2_0 = null;

        AntlrDatatypeRuleToken lv_scaling_efficiency_6_0 = null;

        AntlrDatatypeRuleToken lv_message_size_10_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:3130:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3131:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3131:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3132:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3132:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3133:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEMPIAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3136:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3137:5: ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3137:5: ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=6;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == Library && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1) ) {
                    alt26=2;
                }
                else if ( LA26_0 == Scaling_efficiency && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2) ) {
                    alt26=3;
                }
                else if ( LA26_0 == Core_subscription && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3) ) {
                    alt26=4;
                }
                else if ( LA26_0 == Message_size && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4) ) {
                    alt26=5;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalOptimizationParser.g:3138:3: ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3138:3: ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3139:4: {...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3139:98: ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) )
            	    // InternalOptimizationParser.g:3140:5: ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3143:8: ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) )
            	    // InternalOptimizationParser.g:3143:9: {...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3143:18: (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) )
            	    // InternalOptimizationParser.g:3143:19: otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) )
            	    {
            	    otherlv_1=(Token)match(input,Library,FOLLOW_53); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEMPIAccess().getLibraryKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3147:8: ( (lv_library_2_0= ruleEMPILibrary ) )
            	    // InternalOptimizationParser.g:3148:9: (lv_library_2_0= ruleEMPILibrary )
            	    {
            	    // InternalOptimizationParser.g:3148:9: (lv_library_2_0= ruleEMPILibrary )
            	    // InternalOptimizationParser.g:3149:10: lv_library_2_0= ruleEMPILibrary
            	    {

            	    										newCompositeNode(grammarAccess.getEMPIAccess().getLibraryEMPILibraryParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_54);
            	    lv_library_2_0=ruleEMPILibrary();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEMPIRule());
            	    										}
            	    										set(
            	    											current,
            	    											"library",
            	    											lv_library_2_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EMPILibrary");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMPIAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:3172:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3172:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3173:4: {...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3173:98: ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:3174:5: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3177:8: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:3177:9: {...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3177:18: (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:3177:19: otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Version,FOLLOW_24); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEMPIAccess().getVersionKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3181:8: ( (lv_version_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:3182:9: (lv_version_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:3182:9: (lv_version_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:3183:10: lv_version_4_0= RULE_STRING
            	    {
            	    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_54); 

            	    										newLeafNode(lv_version_4_0, grammarAccess.getEMPIAccess().getVersionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEMPIRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"version",
            	    											lv_version_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMPIAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOptimizationParser.g:3205:3: ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3205:3: ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3206:4: {...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3206:98: ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) )
            	    // InternalOptimizationParser.g:3207:5: ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3210:8: ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) )
            	    // InternalOptimizationParser.g:3210:9: {...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3210:18: (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) )
            	    // InternalOptimizationParser.g:3210:19: otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Scaling_efficiency,FOLLOW_55); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEMPIAccess().getScaling_efficiencyKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3214:8: ( (lv_scaling_efficiency_6_0= ruleRealValue ) )
            	    // InternalOptimizationParser.g:3215:9: (lv_scaling_efficiency_6_0= ruleRealValue )
            	    {
            	    // InternalOptimizationParser.g:3215:9: (lv_scaling_efficiency_6_0= ruleRealValue )
            	    // InternalOptimizationParser.g:3216:10: lv_scaling_efficiency_6_0= ruleRealValue
            	    {

            	    										newCompositeNode(grammarAccess.getEMPIAccess().getScaling_efficiencyRealValueParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_54);
            	    lv_scaling_efficiency_6_0=ruleRealValue();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEMPIRule());
            	    										}
            	    										set(
            	    											current,
            	    											"scaling_efficiency",
            	    											lv_scaling_efficiency_6_0,
            	    											"org.sodalite.dsl.optimization.Optimization.RealValue");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMPIAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOptimizationParser.g:3239:3: ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3239:3: ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3240:4: {...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:3240:98: ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3241:5: ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:3244:8: ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3244:9: {...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3244:18: (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3244:19: otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Core_subscription,FOLLOW_38); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEMPIAccess().getCore_subscriptionKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:3248:8: ( (lv_core_subscription_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3249:9: (lv_core_subscription_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3249:9: (lv_core_subscription_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:3250:10: lv_core_subscription_8_0= RULE_INT
            	    {
            	    lv_core_subscription_8_0=(Token)match(input,RULE_INT,FOLLOW_54); 

            	    										newLeafNode(lv_core_subscription_8_0, grammarAccess.getEMPIAccess().getCore_subscriptionINTTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEMPIRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"core_subscription",
            	    											lv_core_subscription_8_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMPIAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalOptimizationParser.g:3272:3: ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3272:3: ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3273:4: {...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:3273:98: ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) )
            	    // InternalOptimizationParser.g:3274:5: ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:3277:8: ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) )
            	    // InternalOptimizationParser.g:3277:9: {...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3277:18: (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) )
            	    // InternalOptimizationParser.g:3277:19: otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) )
            	    {
            	    otherlv_9=(Token)match(input,Message_size,FOLLOW_56); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEMPIAccess().getMessage_sizeKeyword_4_0());
            	    							
            	    // InternalOptimizationParser.g:3281:8: ( (lv_message_size_10_0= ruleEMPIMessageSize ) )
            	    // InternalOptimizationParser.g:3282:9: (lv_message_size_10_0= ruleEMPIMessageSize )
            	    {
            	    // InternalOptimizationParser.g:3282:9: (lv_message_size_10_0= ruleEMPIMessageSize )
            	    // InternalOptimizationParser.g:3283:10: lv_message_size_10_0= ruleEMPIMessageSize
            	    {

            	    										newCompositeNode(grammarAccess.getEMPIAccess().getMessage_sizeEMPIMessageSizeParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_54);
            	    lv_message_size_10_0=ruleEMPIMessageSize();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEMPIRule());
            	    										}
            	    										set(
            	    											current,
            	    											"message_size",
            	    											lv_message_size_10_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EMPIMessageSize");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEMPIAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEMPIAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canLeave(grammarAccess.getEMPIAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEMPIAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMPI"


    // $ANTLR start "entryRuleEMPILibrary"
    // InternalOptimizationParser.g:3317:1: entryRuleEMPILibrary returns [String current=null] : iv_ruleEMPILibrary= ruleEMPILibrary EOF ;
    public final String entryRuleEMPILibrary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMPILibrary = null;


        try {
            // InternalOptimizationParser.g:3317:51: (iv_ruleEMPILibrary= ruleEMPILibrary EOF )
            // InternalOptimizationParser.g:3318:2: iv_ruleEMPILibrary= ruleEMPILibrary EOF
            {
             newCompositeNode(grammarAccess.getEMPILibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMPILibrary=ruleEMPILibrary();

            state._fsp--;

             current =iv_ruleEMPILibrary.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMPILibrary"


    // $ANTLR start "ruleEMPILibrary"
    // InternalOptimizationParser.g:3324:1: ruleEMPILibrary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Mvapch | kw= Opnmpi ) ;
    public final AntlrDatatypeRuleToken ruleEMPILibrary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3330:2: ( (kw= Mvapch | kw= Opnmpi ) )
            // InternalOptimizationParser.g:3331:2: (kw= Mvapch | kw= Opnmpi )
            {
            // InternalOptimizationParser.g:3331:2: (kw= Mvapch | kw= Opnmpi )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Mvapch) ) {
                alt27=1;
            }
            else if ( (LA27_0==Opnmpi) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalOptimizationParser.g:3332:3: kw= Mvapch
                    {
                    kw=(Token)match(input,Mvapch,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPILibraryAccess().getMvapchKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3338:3: kw= Opnmpi
                    {
                    kw=(Token)match(input,Opnmpi,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPILibraryAccess().getOpnmpiKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMPILibrary"


    // $ANTLR start "entryRuleEMPIMessageSize"
    // InternalOptimizationParser.g:3347:1: entryRuleEMPIMessageSize returns [String current=null] : iv_ruleEMPIMessageSize= ruleEMPIMessageSize EOF ;
    public final String entryRuleEMPIMessageSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMPIMessageSize = null;


        try {
            // InternalOptimizationParser.g:3347:55: (iv_ruleEMPIMessageSize= ruleEMPIMessageSize EOF )
            // InternalOptimizationParser.g:3348:2: iv_ruleEMPIMessageSize= ruleEMPIMessageSize EOF
            {
             newCompositeNode(grammarAccess.getEMPIMessageSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMPIMessageSize=ruleEMPIMessageSize();

            state._fsp--;

             current =iv_ruleEMPIMessageSize.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMPIMessageSize"


    // $ANTLR start "ruleEMPIMessageSize"
    // InternalOptimizationParser.g:3354:1: ruleEMPIMessageSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Small | kw= Medium | kw= Large ) ;
    public final AntlrDatatypeRuleToken ruleEMPIMessageSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3360:2: ( (kw= Small | kw= Medium | kw= Large ) )
            // InternalOptimizationParser.g:3361:2: (kw= Small | kw= Medium | kw= Large )
            {
            // InternalOptimizationParser.g:3361:2: (kw= Small | kw= Medium | kw= Large )
            int alt28=3;
            switch ( input.LA(1) ) {
            case Small:
                {
                alt28=1;
                }
                break;
            case Medium:
                {
                alt28=2;
                }
                break;
            case Large:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalOptimizationParser.g:3362:3: kw= Small
                    {
                    kw=(Token)match(input,Small,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPIMessageSizeAccess().getSmallKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3368:3: kw= Medium
                    {
                    kw=(Token)match(input,Medium,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPIMessageSizeAccess().getMediumKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:3374:3: kw= Large
                    {
                    kw=(Token)match(input,Large,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPIMessageSizeAccess().getLargeKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMPIMessageSize"


    // $ANTLR start "entryRuleEOPENMP"
    // InternalOptimizationParser.g:3383:1: entryRuleEOPENMP returns [EObject current=null] : iv_ruleEOPENMP= ruleEOPENMP EOF ;
    public final EObject entryRuleEOPENMP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENMP = null;


        try {
            // InternalOptimizationParser.g:3383:48: (iv_ruleEOPENMP= ruleEOPENMP EOF )
            // InternalOptimizationParser.g:3384:2: iv_ruleEOPENMP= ruleEOPENMP EOF
            {
             newCompositeNode(grammarAccess.getEOPENMPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOPENMP=ruleEOPENMP();

            state._fsp--;

             current =iv_ruleEOPENMP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOPENMP"


    // $ANTLR start "ruleEOPENMP"
    // InternalOptimizationParser.g:3390:1: ruleEOPENMP returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEOPENMP() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_number_of_threads_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_scaling_efficiency_4_0 = null;

        AntlrDatatypeRuleToken lv_affinity_6_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:3396:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3397:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3397:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3398:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3398:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3399:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOPENMPAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3402:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3403:5: ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3403:5: ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=4;
                int LA29_0 = input.LA(1);

                if ( LA29_0 == Number_of_threads && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0) ) {
                    alt29=1;
                }
                else if ( LA29_0 == Scaling_efficiency && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1) ) {
                    alt29=2;
                }
                else if ( LA29_0 == Affinity && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2) ) {
                    alt29=3;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOptimizationParser.g:3404:3: ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3404:3: ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3405:4: {...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3405:101: ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3406:5: ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3409:8: ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3409:9: {...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "true");
            	    }
            	    // InternalOptimizationParser.g:3409:18: (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3409:19: otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,Number_of_threads,FOLLOW_38); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOPENMPAccess().getNumber_of_threadsKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3413:8: ( (lv_number_of_threads_2_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3414:9: (lv_number_of_threads_2_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3414:9: (lv_number_of_threads_2_0= RULE_INT )
            	    // InternalOptimizationParser.g:3415:10: lv_number_of_threads_2_0= RULE_INT
            	    {
            	    lv_number_of_threads_2_0=(Token)match(input,RULE_INT,FOLLOW_57); 

            	    										newLeafNode(lv_number_of_threads_2_0, grammarAccess.getEOPENMPAccess().getNumber_of_threadsINTTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEOPENMPRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"number_of_threads",
            	    											lv_number_of_threads_2_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOPENMPAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:3437:3: ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3437:3: ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3438:4: {...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3438:101: ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) )
            	    // InternalOptimizationParser.g:3439:5: ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3442:8: ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) )
            	    // InternalOptimizationParser.g:3442:9: {...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "true");
            	    }
            	    // InternalOptimizationParser.g:3442:18: (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) )
            	    // InternalOptimizationParser.g:3442:19: otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Scaling_efficiency,FOLLOW_55); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOPENMPAccess().getScaling_efficiencyKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3446:8: ( (lv_scaling_efficiency_4_0= ruleRealValue ) )
            	    // InternalOptimizationParser.g:3447:9: (lv_scaling_efficiency_4_0= ruleRealValue )
            	    {
            	    // InternalOptimizationParser.g:3447:9: (lv_scaling_efficiency_4_0= ruleRealValue )
            	    // InternalOptimizationParser.g:3448:10: lv_scaling_efficiency_4_0= ruleRealValue
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENMPAccess().getScaling_efficiencyRealValueParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_57);
            	    lv_scaling_efficiency_4_0=ruleRealValue();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEOPENMPRule());
            	    										}
            	    										set(
            	    											current,
            	    											"scaling_efficiency",
            	    											lv_scaling_efficiency_4_0,
            	    											"org.sodalite.dsl.optimization.Optimization.RealValue");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOPENMPAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOptimizationParser.g:3471:3: ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3471:3: ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3472:4: {...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3472:101: ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) )
            	    // InternalOptimizationParser.g:3473:5: ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3476:8: ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) )
            	    // InternalOptimizationParser.g:3476:9: {...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "true");
            	    }
            	    // InternalOptimizationParser.g:3476:18: (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) )
            	    // InternalOptimizationParser.g:3476:19: otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) )
            	    {
            	    otherlv_5=(Token)match(input,Affinity,FOLLOW_58); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEOPENMPAccess().getAffinityKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3480:8: ( (lv_affinity_6_0= ruleEOPENAffinity ) )
            	    // InternalOptimizationParser.g:3481:9: (lv_affinity_6_0= ruleEOPENAffinity )
            	    {
            	    // InternalOptimizationParser.g:3481:9: (lv_affinity_6_0= ruleEOPENAffinity )
            	    // InternalOptimizationParser.g:3482:10: lv_affinity_6_0= ruleEOPENAffinity
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENMPAccess().getAffinityEOPENAffinityParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_57);
            	    lv_affinity_6_0=ruleEOPENAffinity();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEOPENMPRule());
            	    										}
            	    										set(
            	    											current,
            	    											"affinity",
            	    											lv_affinity_6_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EOPENAffinity");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOPENMPAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEOPENMPAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEOPENMP", "getUnorderedGroupHelper().canLeave(grammarAccess.getEOPENMPAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEOPENMPAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOPENMP"


    // $ANTLR start "entryRuleEOPENAffinity"
    // InternalOptimizationParser.g:3516:1: entryRuleEOPENAffinity returns [String current=null] : iv_ruleEOPENAffinity= ruleEOPENAffinity EOF ;
    public final String entryRuleEOPENAffinity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOPENAffinity = null;


        try {
            // InternalOptimizationParser.g:3516:53: (iv_ruleEOPENAffinity= ruleEOPENAffinity EOF )
            // InternalOptimizationParser.g:3517:2: iv_ruleEOPENAffinity= ruleEOPENAffinity EOF
            {
             newCompositeNode(grammarAccess.getEOPENAffinityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOPENAffinity=ruleEOPENAffinity();

            state._fsp--;

             current =iv_ruleEOPENAffinity.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOPENAffinity"


    // $ANTLR start "ruleEOPENAffinity"
    // InternalOptimizationParser.g:3523:1: ruleEOPENAffinity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Block | kw= Simple ) ;
    public final AntlrDatatypeRuleToken ruleEOPENAffinity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3529:2: ( (kw= Block | kw= Simple ) )
            // InternalOptimizationParser.g:3530:2: (kw= Block | kw= Simple )
            {
            // InternalOptimizationParser.g:3530:2: (kw= Block | kw= Simple )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Block) ) {
                alt30=1;
            }
            else if ( (LA30_0==Simple) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalOptimizationParser.g:3531:3: kw= Block
                    {
                    kw=(Token)match(input,Block,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEOPENAffinityAccess().getBlockKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3537:3: kw= Simple
                    {
                    kw=(Token)match(input,Simple,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEOPENAffinityAccess().getSimpleKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOPENAffinity"


    // $ANTLR start "entryRuleEOPENACC"
    // InternalOptimizationParser.g:3546:1: entryRuleEOPENACC returns [EObject current=null] : iv_ruleEOPENACC= ruleEOPENACC EOF ;
    public final EObject entryRuleEOPENACC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENACC = null;


        try {
            // InternalOptimizationParser.g:3546:49: (iv_ruleEOPENACC= ruleEOPENACC EOF )
            // InternalOptimizationParser.g:3547:2: iv_ruleEOPENACC= ruleEOPENACC EOF
            {
             newCompositeNode(grammarAccess.getEOPENACCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOPENACC=ruleEOPENACC();

            state._fsp--;

             current =iv_ruleEOPENACC; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOPENACC"


    // $ANTLR start "ruleEOPENACC"
    // InternalOptimizationParser.g:3553:1: ruleEOPENACC returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEOPENACC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_5=null;
        Token lv_number_of_acc_6_0=null;
        AntlrDatatypeRuleToken lv_compiler_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:3559:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3560:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3560:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3561:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3561:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3562:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOPENACCAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3565:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3566:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3566:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=4;
                int LA31_0 = input.LA(1);

                if ( LA31_0 == Compiler && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1) ) {
                    alt31=2;
                }
                else if ( LA31_0 == Number_of_acc && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2) ) {
                    alt31=3;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOptimizationParser.g:3567:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3567:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3568:4: {...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3568:102: ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    // InternalOptimizationParser.g:3569:5: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3572:8: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    // InternalOptimizationParser.g:3572:9: {...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "true");
            	    }
            	    // InternalOptimizationParser.g:3572:18: (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    // InternalOptimizationParser.g:3572:19: otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) )
            	    {
            	    otherlv_1=(Token)match(input,Compiler,FOLLOW_59); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOPENACCAccess().getCompilerKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3576:8: ( (lv_compiler_2_0= ruleECompiler ) )
            	    // InternalOptimizationParser.g:3577:9: (lv_compiler_2_0= ruleECompiler )
            	    {
            	    // InternalOptimizationParser.g:3577:9: (lv_compiler_2_0= ruleECompiler )
            	    // InternalOptimizationParser.g:3578:10: lv_compiler_2_0= ruleECompiler
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENACCAccess().getCompilerECompilerParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_60);
            	    lv_compiler_2_0=ruleECompiler();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEOPENACCRule());
            	    										}
            	    										set(
            	    											current,
            	    											"compiler",
            	    											lv_compiler_2_0,
            	    											"org.sodalite.dsl.optimization.Optimization.ECompiler");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOPENACCAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:3601:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3601:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3602:4: {...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3602:102: ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:3603:5: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3606:8: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:3606:9: {...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "true");
            	    }
            	    // InternalOptimizationParser.g:3606:18: (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:3606:19: otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Version,FOLLOW_24); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOPENACCAccess().getVersionKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3610:8: ( (lv_version_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:3611:9: (lv_version_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:3611:9: (lv_version_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:3612:10: lv_version_4_0= RULE_STRING
            	    {
            	    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            	    										newLeafNode(lv_version_4_0, grammarAccess.getEOPENACCAccess().getVersionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEOPENACCRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"version",
            	    											lv_version_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOPENACCAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOptimizationParser.g:3634:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3634:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3635:4: {...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3635:102: ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3636:5: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3639:8: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3639:9: {...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "true");
            	    }
            	    // InternalOptimizationParser.g:3639:18: (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3639:19: otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Number_of_acc,FOLLOW_38); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEOPENACCAccess().getNumber_of_accKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3643:8: ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3644:9: (lv_number_of_acc_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3644:9: (lv_number_of_acc_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:3645:10: lv_number_of_acc_6_0= RULE_INT
            	    {
            	    lv_number_of_acc_6_0=(Token)match(input,RULE_INT,FOLLOW_60); 

            	    										newLeafNode(lv_number_of_acc_6_0, grammarAccess.getEOPENACCAccess().getNumber_of_accINTTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEOPENACCRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"number_of_acc",
            	    											lv_number_of_acc_6_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOPENACCAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEOPENACCAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEOPENACC", "getUnorderedGroupHelper().canLeave(grammarAccess.getEOPENACCAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEOPENACCAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOPENACC"


    // $ANTLR start "entryRuleEOPENCL"
    // InternalOptimizationParser.g:3678:1: entryRuleEOPENCL returns [EObject current=null] : iv_ruleEOPENCL= ruleEOPENCL EOF ;
    public final EObject entryRuleEOPENCL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENCL = null;


        try {
            // InternalOptimizationParser.g:3678:48: (iv_ruleEOPENCL= ruleEOPENCL EOF )
            // InternalOptimizationParser.g:3679:2: iv_ruleEOPENCL= ruleEOPENCL EOF
            {
             newCompositeNode(grammarAccess.getEOPENCLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOPENCL=ruleEOPENCL();

            state._fsp--;

             current =iv_ruleEOPENCL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOPENCL"


    // $ANTLR start "ruleEOPENCL"
    // InternalOptimizationParser.g:3685:1: ruleEOPENCL returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEOPENCL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_5=null;
        Token lv_number_of_acc_6_0=null;
        AntlrDatatypeRuleToken lv_compiler_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:3691:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3692:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3692:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3693:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3693:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3694:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOPENCLAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3697:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3698:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3698:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( LA32_0 == Compiler && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 == Number_of_acc && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOptimizationParser.g:3699:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3699:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3700:4: {...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3700:101: ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    // InternalOptimizationParser.g:3701:5: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3704:8: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    // InternalOptimizationParser.g:3704:9: {...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "true");
            	    }
            	    // InternalOptimizationParser.g:3704:18: (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    // InternalOptimizationParser.g:3704:19: otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) )
            	    {
            	    otherlv_1=(Token)match(input,Compiler,FOLLOW_59); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOPENCLAccess().getCompilerKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3708:8: ( (lv_compiler_2_0= ruleECompiler ) )
            	    // InternalOptimizationParser.g:3709:9: (lv_compiler_2_0= ruleECompiler )
            	    {
            	    // InternalOptimizationParser.g:3709:9: (lv_compiler_2_0= ruleECompiler )
            	    // InternalOptimizationParser.g:3710:10: lv_compiler_2_0= ruleECompiler
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENCLAccess().getCompilerECompilerParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_60);
            	    lv_compiler_2_0=ruleECompiler();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEOPENCLRule());
            	    										}
            	    										set(
            	    											current,
            	    											"compiler",
            	    											lv_compiler_2_0,
            	    											"org.sodalite.dsl.optimization.Optimization.ECompiler");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOPENCLAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:3733:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3733:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3734:4: {...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3734:101: ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:3735:5: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3738:8: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:3738:9: {...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "true");
            	    }
            	    // InternalOptimizationParser.g:3738:18: (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:3738:19: otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Version,FOLLOW_24); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOPENCLAccess().getVersionKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3742:8: ( (lv_version_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:3743:9: (lv_version_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:3743:9: (lv_version_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:3744:10: lv_version_4_0= RULE_STRING
            	    {
            	    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

            	    										newLeafNode(lv_version_4_0, grammarAccess.getEOPENCLAccess().getVersionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEOPENCLRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"version",
            	    											lv_version_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOPENCLAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOptimizationParser.g:3766:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3766:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3767:4: {...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3767:101: ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3768:5: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3771:8: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3771:9: {...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "true");
            	    }
            	    // InternalOptimizationParser.g:3771:18: (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3771:19: otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Number_of_acc,FOLLOW_38); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEOPENCLAccess().getNumber_of_accKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3775:8: ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3776:9: (lv_number_of_acc_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3776:9: (lv_number_of_acc_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:3777:10: lv_number_of_acc_6_0= RULE_INT
            	    {
            	    lv_number_of_acc_6_0=(Token)match(input,RULE_INT,FOLLOW_60); 

            	    										newLeafNode(lv_number_of_acc_6_0, grammarAccess.getEOPENCLAccess().getNumber_of_accINTTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEOPENCLRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"number_of_acc",
            	    											lv_number_of_acc_6_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOPENCLAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEOPENCLAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEOPENCL", "getUnorderedGroupHelper().canLeave(grammarAccess.getEOPENCLAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEOPENCLAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOPENCL"


    // $ANTLR start "entryRuleECompiler"
    // InternalOptimizationParser.g:3810:1: entryRuleECompiler returns [String current=null] : iv_ruleECompiler= ruleECompiler EOF ;
    public final String entryRuleECompiler() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleECompiler = null;


        try {
            // InternalOptimizationParser.g:3810:49: (iv_ruleECompiler= ruleECompiler EOF )
            // InternalOptimizationParser.g:3811:2: iv_ruleECompiler= ruleECompiler EOF
            {
             newCompositeNode(grammarAccess.getECompilerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECompiler=ruleECompiler();

            state._fsp--;

             current =iv_ruleECompiler.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECompiler"


    // $ANTLR start "ruleECompiler"
    // InternalOptimizationParser.g:3817:1: ruleECompiler returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Pgi | kw= Cray ) ;
    public final AntlrDatatypeRuleToken ruleECompiler() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3823:2: ( (kw= Pgi | kw= Cray ) )
            // InternalOptimizationParser.g:3824:2: (kw= Pgi | kw= Cray )
            {
            // InternalOptimizationParser.g:3824:2: (kw= Pgi | kw= Cray )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Pgi) ) {
                alt33=1;
            }
            else if ( (LA33_0==Cray) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalOptimizationParser.g:3825:3: kw= Pgi
                    {
                    kw=(Token)match(input,Pgi,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECompilerAccess().getPgiKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3831:3: kw= Cray
                    {
                    kw=(Token)match(input,Cray,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECompilerAccess().getCrayKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECompiler"


    // $ANTLR start "entryRuleREAL"
    // InternalOptimizationParser.g:3840:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalOptimizationParser.g:3842:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalOptimizationParser.g:3843:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalOptimizationParser.g:3852:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_EXT_INT_2=null;
        Token this_INT_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalOptimizationParser.g:3859:2: ( ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) ) )
            // InternalOptimizationParser.g:3860:2: ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )
            {
            // InternalOptimizationParser.g:3860:2: ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )
            // InternalOptimizationParser.g:3861:3: (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
            {
            // InternalOptimizationParser.g:3861:3: (this_INT_0= RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalOptimizationParser.g:3862:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_61); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,FullStop,FOLLOW_62); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            // InternalOptimizationParser.g:3875:3: (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_EXT_INT) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_INT) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalOptimizationParser.g:3876:4: this_EXT_INT_2= RULE_EXT_INT
                    {
                    this_EXT_INT_2=(Token)match(input,RULE_EXT_INT,FOLLOW_2); 

                    				current.merge(this_EXT_INT_2);
                    			

                    				newLeafNode(this_EXT_INT_2, grammarAccess.getREALAccess().getEXT_INTTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3884:4: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getREALAccess().getINTTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleRealValue"
    // InternalOptimizationParser.g:3899:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalOptimizationParser.g:3899:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalOptimizationParser.g:3900:2: iv_ruleRealValue= ruleRealValue EOF
            {
             newCompositeNode(grammarAccess.getRealValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealValue=ruleRealValue();

            state._fsp--;

             current =iv_ruleRealValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealValue"


    // $ANTLR start "ruleRealValue"
    // InternalOptimizationParser.g:3906:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_REAL_0= ruleREAL ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_REAL_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:3912:2: (this_REAL_0= ruleREAL )
            // InternalOptimizationParser.g:3913:2: this_REAL_0= ruleREAL
            {

            		newCompositeNode(grammarAccess.getRealValueAccess().getREALParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_REAL_0=ruleREAL();

            state._fsp--;


            		current.merge(this_REAL_0);
            	

            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealValue"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002000000480000L,0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000042100000L,0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000040000000000L,0x0000000060002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001080000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008001800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0400010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000081L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000004010020L,0x0000000000100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x8000002400000000L,0x0000001000840000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800008000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L,0x0000001000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L,0x0000001010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001080000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000020000000L,0x0000000000201400L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000004010022L,0x0000000000100000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000010009050L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000002400000002L,0x0000000000840000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4000004000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000004000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001080000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0180400000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000800004000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000100000480L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001200000020180L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1804000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001200000020182L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000004400000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A0004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000100000482L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004040L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000200400000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0001000800004002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x000000C000000000L});

}
