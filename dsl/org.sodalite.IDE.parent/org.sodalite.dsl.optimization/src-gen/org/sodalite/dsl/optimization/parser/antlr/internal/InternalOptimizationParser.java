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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Reinforncement_learning", "Distributed_training", "Image_classification", "Scaling_efficiency", "Core_subscription", "Enable_autotuning", "Number_of_threads", "Enable_opt_build", "Object_detection", "Parallelisation", "Number_of_acc", "Recommendation", "Ai_framework", "Message_size", "AI_Inference", "Ai_training", "Optimization", "AI_Training", "Constraint", "FPGAXilinx", "NVIDIAV100", "Autotuning", "Parameters", "Tensorflow", "Translation", "TensorFlow", "Opt_build", "Acc_type", "Affinity", "App_type", "Basedata", "Compiler", "Cpu_type", "Location", "Prefetch", "AMDM100", "AUTOTUNE", "Imagenet", "Intelx86", "Backend", "Library", "Openacc", "PyTorch_1", "Version", "BigData", "OPENACC", "PyTorch", "RESTART", "Config", "Layers", "Opencl", "Openmp", "CREATA", "OPENCL", "OPENMP", "Cache", "Count", "Input", "Keras_1", "Medium", "Mvapch", "Opnmpi", "Simple", "Tuner", "CIFAR", "IMAGE", "Keras", "MNIST", "MXNet", "Power", "Block", "Data", "Glow", "Large", "Size", "Small", "Type", "CNTK", "Cray", "Etl", "Hpc", "Mpi", "Xla", "AMD", "ARM", "HPC", "MPI", "Pgi", "LeftParenthesis", "RightParenthesis", "Comma", "FullStop", "Colon", "RULE_BT", "RULE_LT", "RULE_BET", "RULE_LET", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_OR", "RULE_AND", "RULE_BEGIN", "RULE_END", "RULE_BOOLEAN", "RULE_INT", "RULE_EXT_INT", "RULE_ID", "RULE_QUALIFIED_NAME", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Tensorflow=27;
    public static final int CREATA=56;
    public static final int CIFAR=68;
    public static final int RULE_LET=100;
    public static final int Size=78;
    public static final int Mpi=85;
    public static final int MPI=90;
    public static final int Enable_autotuning=9;
    public static final int Count=60;
    public static final int Mvapch=64;
    public static final int PyTorch=50;
    public static final int IMAGE=69;
    public static final int LeftParenthesis=92;
    public static final int Autotuning=25;
    public static final int RULE_NOT_EQUAL=102;
    public static final int Imagenet=41;
    public static final int RULE_OR=103;
    public static final int Prefetch=38;
    public static final int RULE_QUALIFIED_NAME=111;
    public static final int Translation=28;
    public static final int Parameters=26;
    public static final int Small=79;
    public static final int RULE_EQUAL=101;
    public static final int RULE_ID=110;
    public static final int Cray=82;
    public static final int Number_of_acc=14;
    public static final int Recommendation=15;
    public static final int Pgi=91;
    public static final int Enable_opt_build=11;
    public static final int RULE_INT=108;
    public static final int FPGAXilinx=23;
    public static final int RULE_ML_COMMENT=113;
    public static final int Openacc=45;
    public static final int Keras=70;
    public static final int Hpc=84;
    public static final int HPC=89;
    public static final int OPENMP=58;
    public static final int ARM=88;
    public static final int CNTK=81;
    public static final int Core_subscription=8;
    public static final int Large=77;
    public static final int MNIST=71;
    public static final int Simple=66;
    public static final int Cpu_type=36;
    public static final int Comma=94;
    public static final int AUTOTUNE=40;
    public static final int Opnmpi=65;
    public static final int Ai_training=19;
    public static final int OPENACC=49;
    public static final int Layers=53;
    public static final int Basedata=34;
    public static final int TensorFlow=29;
    public static final int FullStop=95;
    public static final int AI_Training=21;
    public static final int OPENCL=57;
    public static final int Opt_build=30;
    public static final int RULE_BT=97;
    public static final int Ai_framework=16;
    public static final int Type=80;
    public static final int Image_classification=6;
    public static final int Message_size=17;
    public static final int Opencl=54;
    public static final int Etl=83;
    public static final int PyTorch_1=46;
    public static final int Power=73;
    public static final int Number_of_threads=10;
    public static final int RULE_BEGIN=105;
    public static final int Constraint=22;
    public static final int RULE_BOOLEAN=107;
    public static final int Tuner=67;
    public static final int Glow=76;
    public static final int Input=61;
    public static final int MXNet=72;
    public static final int RULE_BET=99;
    public static final int Version=47;
    public static final int AMD=87;
    public static final int NVIDIAV100=24;
    public static final int Object_detection=12;
    public static final int AMDM100=39;
    public static final int Compiler=35;
    public static final int Openmp=55;
    public static final int RightParenthesis=93;
    public static final int RULE_LT=98;
    public static final int Medium=63;
    public static final int Affinity=32;
    public static final int Block=74;
    public static final int Library=44;
    public static final int Cache=59;
    public static final int AI_Inference=18;
    public static final int RULE_END=106;
    public static final int Reinforncement_learning=4;
    public static final int Config=52;
    public static final int RULE_STRING=112;
    public static final int Xla=86;
    public static final int Optimization=20;
    public static final int Acc_type=31;
    public static final int App_type=33;
    public static final int RULE_AND=104;
    public static final int RULE_SL_COMMENT=114;
    public static final int Intelx86=42;
    public static final int RESTART=51;
    public static final int Colon=96;
    public static final int EOF=-1;
    public static final int Keras_1=62;
    public static final int RULE_WS=115;
    public static final int RULE_EXT_INT=109;
    public static final int Data=75;
    public static final int RULE_ANY_OTHER=116;
    public static final int Distributed_training=5;
    public static final int Backend=43;
    public static final int Parallelisation=13;
    public static final int BigData=48;
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
    // InternalOptimizationParser.g:64:1: ruleOptimization_Model returns [EObject current=null] : (otherlv_0= Optimization ( (lv_name_1_0= RULE_QUALIFIED_NAME ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_optimization_4_0= ruleEOptimization ) ) this_END_5= RULE_END ) ;
    public final EObject ruleOptimization_Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        EObject lv_optimization_4_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:70:2: ( (otherlv_0= Optimization ( (lv_name_1_0= RULE_QUALIFIED_NAME ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_optimization_4_0= ruleEOptimization ) ) this_END_5= RULE_END ) )
            // InternalOptimizationParser.g:71:2: (otherlv_0= Optimization ( (lv_name_1_0= RULE_QUALIFIED_NAME ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_optimization_4_0= ruleEOptimization ) ) this_END_5= RULE_END )
            {
            // InternalOptimizationParser.g:71:2: (otherlv_0= Optimization ( (lv_name_1_0= RULE_QUALIFIED_NAME ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_optimization_4_0= ruleEOptimization ) ) this_END_5= RULE_END )
            // InternalOptimizationParser.g:72:3: otherlv_0= Optimization ( (lv_name_1_0= RULE_QUALIFIED_NAME ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_optimization_4_0= ruleEOptimization ) ) this_END_5= RULE_END
            {
            otherlv_0=(Token)match(input,Optimization,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getOptimization_ModelAccess().getOptimizationKeyword_0());
            		
            // InternalOptimizationParser.g:76:3: ( (lv_name_1_0= RULE_QUALIFIED_NAME ) )
            // InternalOptimizationParser.g:77:4: (lv_name_1_0= RULE_QUALIFIED_NAME )
            {
            // InternalOptimizationParser.g:77:4: (lv_name_1_0= RULE_QUALIFIED_NAME )
            // InternalOptimizationParser.g:78:5: lv_name_1_0= RULE_QUALIFIED_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOptimization_ModelAccess().getNameQUALIFIED_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOptimization_ModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.sodalite.dsl.optimization.Optimization.QUALIFIED_NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOptimization_ModelAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getOptimization_ModelAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalOptimizationParser.g:102:3: ( (lv_optimization_4_0= ruleEOptimization ) )
            // InternalOptimizationParser.g:103:4: (lv_optimization_4_0= ruleEOptimization )
            {
            // InternalOptimizationParser.g:103:4: (lv_optimization_4_0= ruleEOptimization )
            // InternalOptimizationParser.g:104:5: lv_optimization_4_0= ruleEOptimization
            {

            					newCompositeNode(grammarAccess.getOptimization_ModelAccess().getOptimizationEOptimizationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_optimization_4_0=ruleEOptimization();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptimization_ModelRule());
            					}
            					set(
            						current,
            						"optimization",
            						lv_optimization_4_0,
            						"org.sodalite.dsl.optimization.Optimization.EOptimization");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getOptimization_ModelAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalOptimizationParser.g:129:1: entryRuleEOptimization returns [EObject current=null] : iv_ruleEOptimization= ruleEOptimization EOF ;
    public final EObject entryRuleEOptimization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOptimization = null;


        try {
            // InternalOptimizationParser.g:129:54: (iv_ruleEOptimization= ruleEOptimization EOF )
            // InternalOptimizationParser.g:130:2: iv_ruleEOptimization= ruleEOptimization EOF
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
    // InternalOptimizationParser.g:136:1: ruleEOptimization returns [EObject current=null] : ( (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) ) (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) ) (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) ) (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )? (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )? ( (lv_app_optimization_14_0= ruleEOptimizationCases ) ) ) ;
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
            // InternalOptimizationParser.g:142:2: ( ( (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) ) (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) ) (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) ) (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )? (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )? ( (lv_app_optimization_14_0= ruleEOptimizationCases ) ) ) )
            // InternalOptimizationParser.g:143:2: ( (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) ) (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) ) (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) ) (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )? (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )? ( (lv_app_optimization_14_0= ruleEOptimizationCases ) ) )
            {
            // InternalOptimizationParser.g:143:2: ( (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) ) (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) ) (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) ) (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )? (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )? ( (lv_app_optimization_14_0= ruleEOptimizationCases ) ) )
            // InternalOptimizationParser.g:144:3: (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) ) (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) ) (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) ) (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )? (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )? ( (lv_app_optimization_14_0= ruleEOptimizationCases ) )
            {
            // InternalOptimizationParser.g:144:3: (otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) ) )
            // InternalOptimizationParser.g:145:4: otherlv_0= Enable_opt_build ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) )
            {
            otherlv_0=(Token)match(input,Enable_opt_build,FOLLOW_8); 

            				newLeafNode(otherlv_0, grammarAccess.getEOptimizationAccess().getEnable_opt_buildKeyword_0_0());
            			
            // InternalOptimizationParser.g:149:4: ( (lv_enable_opt_build_1_0= RULE_BOOLEAN ) )
            // InternalOptimizationParser.g:150:5: (lv_enable_opt_build_1_0= RULE_BOOLEAN )
            {
            // InternalOptimizationParser.g:150:5: (lv_enable_opt_build_1_0= RULE_BOOLEAN )
            // InternalOptimizationParser.g:151:6: lv_enable_opt_build_1_0= RULE_BOOLEAN
            {
            lv_enable_opt_build_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_9); 

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

            // InternalOptimizationParser.g:168:3: (otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) ) )
            // InternalOptimizationParser.g:169:4: otherlv_2= Enable_autotuning ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) )
            {
            otherlv_2=(Token)match(input,Enable_autotuning,FOLLOW_8); 

            				newLeafNode(otherlv_2, grammarAccess.getEOptimizationAccess().getEnable_autotuningKeyword_1_0());
            			
            // InternalOptimizationParser.g:173:4: ( (lv_enable_autotuning_3_0= RULE_BOOLEAN ) )
            // InternalOptimizationParser.g:174:5: (lv_enable_autotuning_3_0= RULE_BOOLEAN )
            {
            // InternalOptimizationParser.g:174:5: (lv_enable_autotuning_3_0= RULE_BOOLEAN )
            // InternalOptimizationParser.g:175:6: lv_enable_autotuning_3_0= RULE_BOOLEAN
            {
            lv_enable_autotuning_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_10); 

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

            // InternalOptimizationParser.g:192:3: (otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) ) )
            // InternalOptimizationParser.g:193:4: otherlv_4= App_type ( (lv_app_type_5_0= ruleEAppType ) )
            {
            otherlv_4=(Token)match(input,App_type,FOLLOW_11); 

            				newLeafNode(otherlv_4, grammarAccess.getEOptimizationAccess().getApp_typeKeyword_2_0());
            			
            // InternalOptimizationParser.g:197:4: ( (lv_app_type_5_0= ruleEAppType ) )
            // InternalOptimizationParser.g:198:5: (lv_app_type_5_0= ruleEAppType )
            {
            // InternalOptimizationParser.g:198:5: (lv_app_type_5_0= ruleEAppType )
            // InternalOptimizationParser.g:199:6: lv_app_type_5_0= ruleEAppType
            {

            						newCompositeNode(grammarAccess.getEOptimizationAccess().getApp_typeEAppTypeParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_12);
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

            // InternalOptimizationParser.g:217:3: (otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Opt_build) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalOptimizationParser.g:218:4: otherlv_6= Opt_build this_BEGIN_7= RULE_BEGIN ( (lv_opt_build_8_0= ruleEOptBuild ) ) this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Opt_build,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOptimizationAccess().getOpt_buildKeyword_3_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getEOptimizationAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalOptimizationParser.g:226:4: ( (lv_opt_build_8_0= ruleEOptBuild ) )
                    // InternalOptimizationParser.g:227:5: (lv_opt_build_8_0= ruleEOptBuild )
                    {
                    // InternalOptimizationParser.g:227:5: (lv_opt_build_8_0= ruleEOptBuild )
                    // InternalOptimizationParser.g:228:6: lv_opt_build_8_0= ruleEOptBuild
                    {

                    						newCompositeNode(grammarAccess.getEOptimizationAccess().getOpt_buildEOptBuildParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_12); 

                    				newLeafNode(this_END_9, grammarAccess.getEOptimizationAccess().getENDTerminalRuleCall_3_3());
                    			

                    }
                    break;

            }

            // InternalOptimizationParser.g:250:3: (otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Autotuning) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOptimizationParser.g:251:4: otherlv_10= Autotuning this_BEGIN_11= RULE_BEGIN ( (lv_autotuning_12_0= ruleEAutotuning ) ) this_END_13= RULE_END
                    {
                    otherlv_10=(Token)match(input,Autotuning,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getEOptimizationAccess().getAutotuningKeyword_4_0());
                    			
                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

                    				newLeafNode(this_BEGIN_11, grammarAccess.getEOptimizationAccess().getBEGINTerminalRuleCall_4_1());
                    			
                    // InternalOptimizationParser.g:259:4: ( (lv_autotuning_12_0= ruleEAutotuning ) )
                    // InternalOptimizationParser.g:260:5: (lv_autotuning_12_0= ruleEAutotuning )
                    {
                    // InternalOptimizationParser.g:260:5: (lv_autotuning_12_0= ruleEAutotuning )
                    // InternalOptimizationParser.g:261:6: lv_autotuning_12_0= ruleEAutotuning
                    {

                    						newCompositeNode(grammarAccess.getEOptimizationAccess().getAutotuningEAutotuningParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
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

                    this_END_13=(Token)match(input,RULE_END,FOLLOW_12); 

                    				newLeafNode(this_END_13, grammarAccess.getEOptimizationAccess().getENDTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }

            // InternalOptimizationParser.g:283:3: ( (lv_app_optimization_14_0= ruleEOptimizationCases ) )
            // InternalOptimizationParser.g:284:4: (lv_app_optimization_14_0= ruleEOptimizationCases )
            {
            // InternalOptimizationParser.g:284:4: (lv_app_optimization_14_0= ruleEOptimizationCases )
            // InternalOptimizationParser.g:285:5: lv_app_optimization_14_0= ruleEOptimizationCases
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
    // InternalOptimizationParser.g:306:1: entryRuleEOptimizationCases returns [EObject current=null] : iv_ruleEOptimizationCases= ruleEOptimizationCases EOF ;
    public final EObject entryRuleEOptimizationCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOptimizationCases = null;


        try {
            // InternalOptimizationParser.g:306:59: (iv_ruleEOptimizationCases= ruleEOptimizationCases EOF )
            // InternalOptimizationParser.g:307:2: iv_ruleEOptimizationCases= ruleEOptimizationCases EOF
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
    // InternalOptimizationParser.g:313:1: ruleEOptimizationCases returns [EObject current=null] : (this_EAITrainingCase_0= ruleEAITrainingCase | this_EHPCCase_1= ruleEHPCCase ) ;
    public final EObject ruleEOptimizationCases() throws RecognitionException {
        EObject current = null;

        EObject this_EAITrainingCase_0 = null;

        EObject this_EHPCCase_1 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:319:2: ( (this_EAITrainingCase_0= ruleEAITrainingCase | this_EHPCCase_1= ruleEHPCCase ) )
            // InternalOptimizationParser.g:320:2: (this_EAITrainingCase_0= ruleEAITrainingCase | this_EHPCCase_1= ruleEHPCCase )
            {
            // InternalOptimizationParser.g:320:2: (this_EAITrainingCase_0= ruleEAITrainingCase | this_EHPCCase_1= ruleEHPCCase )
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
                    // InternalOptimizationParser.g:321:3: this_EAITrainingCase_0= ruleEAITrainingCase
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
                    // InternalOptimizationParser.g:330:3: this_EHPCCase_1= ruleEHPCCase
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
    // InternalOptimizationParser.g:342:1: entryRuleEAITrainingCase returns [EObject current=null] : iv_ruleEAITrainingCase= ruleEAITrainingCase EOF ;
    public final EObject entryRuleEAITrainingCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingCase = null;


        try {
            // InternalOptimizationParser.g:342:56: (iv_ruleEAITrainingCase= ruleEAITrainingCase EOF )
            // InternalOptimizationParser.g:343:2: iv_ruleEAITrainingCase= ruleEAITrainingCase EOF
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
    // InternalOptimizationParser.g:349:1: ruleEAITrainingCase returns [EObject current=null] : (otherlv_0= Ai_training this_BEGIN_1= RULE_BEGIN ( (lv_ai_training_2_0= ruleEAITraining ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEAITrainingCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_ai_training_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:355:2: ( (otherlv_0= Ai_training this_BEGIN_1= RULE_BEGIN ( (lv_ai_training_2_0= ruleEAITraining ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:356:2: (otherlv_0= Ai_training this_BEGIN_1= RULE_BEGIN ( (lv_ai_training_2_0= ruleEAITraining ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:356:2: (otherlv_0= Ai_training this_BEGIN_1= RULE_BEGIN ( (lv_ai_training_2_0= ruleEAITraining ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:357:3: otherlv_0= Ai_training this_BEGIN_1= RULE_BEGIN ( (lv_ai_training_2_0= ruleEAITraining ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Ai_training,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEAITrainingCaseAccess().getAi_trainingKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEAITrainingCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:365:3: ( (lv_ai_training_2_0= ruleEAITraining ) )
            // InternalOptimizationParser.g:366:4: (lv_ai_training_2_0= ruleEAITraining )
            {
            // InternalOptimizationParser.g:366:4: (lv_ai_training_2_0= ruleEAITraining )
            // InternalOptimizationParser.g:367:5: lv_ai_training_2_0= ruleEAITraining
            {

            					newCompositeNode(grammarAccess.getEAITrainingCaseAccess().getAi_trainingEAITrainingParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalOptimizationParser.g:392:1: entryRuleEHPCCase returns [EObject current=null] : iv_ruleEHPCCase= ruleEHPCCase EOF ;
    public final EObject entryRuleEHPCCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCCase = null;


        try {
            // InternalOptimizationParser.g:392:49: (iv_ruleEHPCCase= ruleEHPCCase EOF )
            // InternalOptimizationParser.g:393:2: iv_ruleEHPCCase= ruleEHPCCase EOF
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
    // InternalOptimizationParser.g:399:1: ruleEHPCCase returns [EObject current=null] : (otherlv_0= Hpc this_BEGIN_1= RULE_BEGIN ( (lv_hpc_2_0= ruleEHPC ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEHPCCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_hpc_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:405:2: ( (otherlv_0= Hpc this_BEGIN_1= RULE_BEGIN ( (lv_hpc_2_0= ruleEHPC ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:406:2: (otherlv_0= Hpc this_BEGIN_1= RULE_BEGIN ( (lv_hpc_2_0= ruleEHPC ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:406:2: (otherlv_0= Hpc this_BEGIN_1= RULE_BEGIN ( (lv_hpc_2_0= ruleEHPC ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:407:3: otherlv_0= Hpc this_BEGIN_1= RULE_BEGIN ( (lv_hpc_2_0= ruleEHPC ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Hpc,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEHPCCaseAccess().getHpcKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEHPCCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:415:3: ( (lv_hpc_2_0= ruleEHPC ) )
            // InternalOptimizationParser.g:416:4: (lv_hpc_2_0= ruleEHPC )
            {
            // InternalOptimizationParser.g:416:4: (lv_hpc_2_0= ruleEHPC )
            // InternalOptimizationParser.g:417:5: lv_hpc_2_0= ruleEHPC
            {

            					newCompositeNode(grammarAccess.getEHPCCaseAccess().getHpcEHPCParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalOptimizationParser.g:442:1: entryRuleEAppType returns [String current=null] : iv_ruleEAppType= ruleEAppType EOF ;
    public final String entryRuleEAppType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEAppType = null;


        try {
            // InternalOptimizationParser.g:442:48: (iv_ruleEAppType= ruleEAppType EOF )
            // InternalOptimizationParser.g:443:2: iv_ruleEAppType= ruleEAppType EOF
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
    // InternalOptimizationParser.g:449:1: ruleEAppType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= AI_Training | kw= HPC | kw= BigData | kw= AI_Inference ) ;
    public final AntlrDatatypeRuleToken ruleEAppType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:455:2: ( (kw= AI_Training | kw= HPC | kw= BigData | kw= AI_Inference ) )
            // InternalOptimizationParser.g:456:2: (kw= AI_Training | kw= HPC | kw= BigData | kw= AI_Inference )
            {
            // InternalOptimizationParser.g:456:2: (kw= AI_Training | kw= HPC | kw= BigData | kw= AI_Inference )
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
                    // InternalOptimizationParser.g:457:3: kw= AI_Training
                    {
                    kw=(Token)match(input,AI_Training,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAppTypeAccess().getAI_TrainingKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:463:3: kw= HPC
                    {
                    kw=(Token)match(input,HPC,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAppTypeAccess().getHPCKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:469:3: kw= BigData
                    {
                    kw=(Token)match(input,BigData,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAppTypeAccess().getBigDataKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:475:3: kw= AI_Inference
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
    // InternalOptimizationParser.g:484:1: entryRuleEOptBuild returns [EObject current=null] : iv_ruleEOptBuild= ruleEOptBuild EOF ;
    public final EObject entryRuleEOptBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOptBuild = null;


        try {
            // InternalOptimizationParser.g:484:50: (iv_ruleEOptBuild= ruleEOptBuild EOF )
            // InternalOptimizationParser.g:485:2: iv_ruleEOptBuild= ruleEOptBuild EOF
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
    // InternalOptimizationParser.g:491:1: ruleEOptBuild returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEOptBuild() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_cpu_type_2_0 = null;

        AntlrDatatypeRuleToken lv_acc_type_4_0 = null;

        EObject lv_constraint_5_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:497:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:498:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:498:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:499:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:499:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:500:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOptBuildAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:503:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:504:5: ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:504:5: ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == Cpu_type && getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == Acc_type && getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOptimizationParser.g:505:3: ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:505:3: ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) )
            	    // InternalOptimizationParser.g:506:4: {...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOptBuild", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:506:103: ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) )
            	    // InternalOptimizationParser.g:507:5: ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:510:8: ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) )
            	    // InternalOptimizationParser.g:510:9: {...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOptBuild", "true");
            	    }
            	    // InternalOptimizationParser.g:510:18: (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) )
            	    // InternalOptimizationParser.g:510:19: otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) )
            	    {
            	    otherlv_1=(Token)match(input,Cpu_type,FOLLOW_17); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOptBuildAccess().getCpu_typeKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:514:8: ( (lv_cpu_type_2_0= ruleECPUType ) )
            	    // InternalOptimizationParser.g:515:9: (lv_cpu_type_2_0= ruleECPUType )
            	    {
            	    // InternalOptimizationParser.g:515:9: (lv_cpu_type_2_0= ruleECPUType )
            	    // InternalOptimizationParser.g:516:10: lv_cpu_type_2_0= ruleECPUType
            	    {

            	    										newCompositeNode(grammarAccess.getEOptBuildAccess().getCpu_typeECPUTypeParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_18);
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
            	    // InternalOptimizationParser.g:539:3: ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:539:3: ({...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) )
            	    // InternalOptimizationParser.g:540:4: {...}? => ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOptBuild", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:540:103: ( ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) )
            	    // InternalOptimizationParser.g:541:5: ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:544:8: ({...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) )
            	    // InternalOptimizationParser.g:544:9: {...}? => ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOptBuild", "true");
            	    }
            	    // InternalOptimizationParser.g:544:18: ( (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? )
            	    // InternalOptimizationParser.g:544:19: (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )?
            	    {
            	    // InternalOptimizationParser.g:544:19: (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) )
            	    // InternalOptimizationParser.g:545:9: otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) )
            	    {
            	    otherlv_3=(Token)match(input,Acc_type,FOLLOW_19); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEOptBuildAccess().getAcc_typeKeyword_1_0_0());
            	    								
            	    // InternalOptimizationParser.g:549:9: ( (lv_acc_type_4_0= ruleEACCType ) )
            	    // InternalOptimizationParser.g:550:10: (lv_acc_type_4_0= ruleEACCType )
            	    {
            	    // InternalOptimizationParser.g:550:10: (lv_acc_type_4_0= ruleEACCType )
            	    // InternalOptimizationParser.g:551:11: lv_acc_type_4_0= ruleEACCType
            	    {

            	    											newCompositeNode(grammarAccess.getEOptBuildAccess().getAcc_typeEACCTypeParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_20);
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

            	    // InternalOptimizationParser.g:569:8: ( (lv_constraint_5_0= ruleEConstraint ) )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==LeftParenthesis) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalOptimizationParser.g:570:9: (lv_constraint_5_0= ruleEConstraint )
            	            {
            	            // InternalOptimizationParser.g:570:9: (lv_constraint_5_0= ruleEConstraint )
            	            // InternalOptimizationParser.g:571:10: lv_constraint_5_0= ruleEConstraint
            	            {

            	            										newCompositeNode(grammarAccess.getEOptBuildAccess().getConstraintEConstraintParserRuleCall_1_1_0());
            	            									
            	            pushFollow(FOLLOW_18);
            	            lv_constraint_5_0=ruleEConstraint();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getEOptBuildRule());
            	            										}
            	            										set(
            	            											current,
            	            											"constraint",
            	            											lv_constraint_5_0,
            	            											"org.sodalite.dsl.optimization.Optimization.EConstraint");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOptBuildAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // InternalOptimizationParser.g:605:1: entryRuleECPUType returns [String current=null] : iv_ruleECPUType= ruleECPUType EOF ;
    public final String entryRuleECPUType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleECPUType = null;


        try {
            // InternalOptimizationParser.g:605:48: (iv_ruleECPUType= ruleECPUType EOF )
            // InternalOptimizationParser.g:606:2: iv_ruleECPUType= ruleECPUType EOF
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
    // InternalOptimizationParser.g:612:1: ruleECPUType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power ) ;
    public final AntlrDatatypeRuleToken ruleECPUType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:618:2: ( (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power ) )
            // InternalOptimizationParser.g:619:2: (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power )
            {
            // InternalOptimizationParser.g:619:2: (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power )
            int alt7=4;
            switch ( input.LA(1) ) {
            case Intelx86:
                {
                alt7=1;
                }
                break;
            case ARM:
                {
                alt7=2;
                }
                break;
            case AMD:
                {
                alt7=3;
                }
                break;
            case Power:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalOptimizationParser.g:620:3: kw= Intelx86
                    {
                    kw=(Token)match(input,Intelx86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECPUTypeAccess().getIntelx86Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:626:3: kw= ARM
                    {
                    kw=(Token)match(input,ARM,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECPUTypeAccess().getARMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:632:3: kw= AMD
                    {
                    kw=(Token)match(input,AMD,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECPUTypeAccess().getAMDKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:638:3: kw= Power
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
    // InternalOptimizationParser.g:647:1: entryRuleEACCType returns [String current=null] : iv_ruleEACCType= ruleEACCType EOF ;
    public final String entryRuleEACCType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEACCType = null;


        try {
            // InternalOptimizationParser.g:647:48: (iv_ruleEACCType= ruleEACCType EOF )
            // InternalOptimizationParser.g:648:2: iv_ruleEACCType= ruleEACCType EOF
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
    // InternalOptimizationParser.g:654:1: ruleEACCType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx ) ;
    public final AntlrDatatypeRuleToken ruleEACCType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:660:2: ( (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx ) )
            // InternalOptimizationParser.g:661:2: (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx )
            {
            // InternalOptimizationParser.g:661:2: (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx )
            int alt8=3;
            switch ( input.LA(1) ) {
            case NVIDIAV100:
                {
                alt8=1;
                }
                break;
            case AMDM100:
                {
                alt8=2;
                }
                break;
            case FPGAXilinx:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalOptimizationParser.g:662:3: kw= NVIDIAV100
                    {
                    kw=(Token)match(input,NVIDIAV100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEACCTypeAccess().getNVIDIAV100Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:668:3: kw= AMDM100
                    {
                    kw=(Token)match(input,AMDM100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEACCTypeAccess().getAMDM100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:674:3: kw= FPGAXilinx
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
    // InternalOptimizationParser.g:683:1: entryRuleEAutotuning returns [EObject current=null] : iv_ruleEAutotuning= ruleEAutotuning EOF ;
    public final EObject entryRuleEAutotuning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAutotuning = null;


        try {
            // InternalOptimizationParser.g:683:52: (iv_ruleEAutotuning= ruleEAutotuning EOF )
            // InternalOptimizationParser.g:684:2: iv_ruleEAutotuning= ruleEAutotuning EOF
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
    // InternalOptimizationParser.g:690:1: ruleEAutotuning returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAutotuning() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_input_4_0=null;
        AntlrDatatypeRuleToken lv_tuner_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:696:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:697:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:697:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:698:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:698:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:699:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAutotuningAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:702:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:703:5: ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:703:5: ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == Tuner && getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == Input && getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOptimizationParser.g:704:3: ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:704:3: ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) )
            	    // InternalOptimizationParser.g:705:4: {...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:705:105: ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) )
            	    // InternalOptimizationParser.g:706:5: ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:709:8: ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) )
            	    // InternalOptimizationParser.g:709:9: {...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "true");
            	    }
            	    // InternalOptimizationParser.g:709:18: (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) )
            	    // InternalOptimizationParser.g:709:19: otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) )
            	    {
            	    otherlv_1=(Token)match(input,Tuner,FOLLOW_21); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAutotuningAccess().getTunerKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:713:8: ( (lv_tuner_2_0= ruleETuner ) )
            	    // InternalOptimizationParser.g:714:9: (lv_tuner_2_0= ruleETuner )
            	    {
            	    // InternalOptimizationParser.g:714:9: (lv_tuner_2_0= ruleETuner )
            	    // InternalOptimizationParser.g:715:10: lv_tuner_2_0= ruleETuner
            	    {

            	    										newCompositeNode(grammarAccess.getEAutotuningAccess().getTunerETunerParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_22);
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
            	    // InternalOptimizationParser.g:738:3: ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:738:3: ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:739:4: {...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:739:105: ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:740:5: ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:743:8: ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:743:9: {...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "true");
            	    }
            	    // InternalOptimizationParser.g:743:18: (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:743:19: otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Input,FOLLOW_23); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAutotuningAccess().getInputKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:747:8: ( (lv_input_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:748:9: (lv_input_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:748:9: (lv_input_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:749:10: lv_input_4_0= RULE_STRING
            	    {
            	    lv_input_4_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	    										newLeafNode(lv_input_4_0, grammarAccess.getEAutotuningAccess().getInputSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAutotuningRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"input",
            	    											lv_input_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAutotuningAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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


    // $ANTLR start "entryRuleETuner"
    // InternalOptimizationParser.g:782:1: entryRuleETuner returns [String current=null] : iv_ruleETuner= ruleETuner EOF ;
    public final String entryRuleETuner() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleETuner = null;


        try {
            // InternalOptimizationParser.g:782:46: (iv_ruleETuner= ruleETuner EOF )
            // InternalOptimizationParser.g:783:2: iv_ruleETuner= ruleETuner EOF
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
    // InternalOptimizationParser.g:789:1: ruleETuner returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= CREATA | kw= AUTOTUNE ) ;
    public final AntlrDatatypeRuleToken ruleETuner() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:795:2: ( (kw= CREATA | kw= AUTOTUNE ) )
            // InternalOptimizationParser.g:796:2: (kw= CREATA | kw= AUTOTUNE )
            {
            // InternalOptimizationParser.g:796:2: (kw= CREATA | kw= AUTOTUNE )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==CREATA) ) {
                alt10=1;
            }
            else if ( (LA10_0==AUTOTUNE) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOptimizationParser.g:797:3: kw= CREATA
                    {
                    kw=(Token)match(input,CREATA,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getETunerAccess().getCREATAKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:803:3: kw= AUTOTUNE
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
    // InternalOptimizationParser.g:812:1: entryRuleEAITraining returns [EObject current=null] : iv_ruleEAITraining= ruleEAITraining EOF ;
    public final EObject entryRuleEAITraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITraining = null;


        try {
            // InternalOptimizationParser.g:812:52: (iv_ruleEAITraining= ruleEAITraining EOF )
            // InternalOptimizationParser.g:813:2: iv_ruleEAITraining= ruleEAITraining EOF
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
    // InternalOptimizationParser.g:819:1: ruleEAITraining returns [EObject current=null] : ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) ) ;
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
            // InternalOptimizationParser.g:825:2: ( ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) ) )
            // InternalOptimizationParser.g:826:2: ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) )
            {
            // InternalOptimizationParser.g:826:2: ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) )
            // InternalOptimizationParser.g:827:3: (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) )
            {
            // InternalOptimizationParser.g:827:3: (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:828:4: otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Config,FOLLOW_5); 

            				newLeafNode(otherlv_0, grammarAccess.getEAITrainingAccess().getConfigKeyword_0_0());
            			
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_24); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEAITrainingAccess().getBEGINTerminalRuleCall_0_1());
            			
            // InternalOptimizationParser.g:836:4: ( (lv_config_2_0= ruleEAITrainingConfig ) )
            // InternalOptimizationParser.g:837:5: (lv_config_2_0= ruleEAITrainingConfig )
            {
            // InternalOptimizationParser.g:837:5: (lv_config_2_0= ruleEAITrainingConfig )
            // InternalOptimizationParser.g:838:6: lv_config_2_0= ruleEAITrainingConfig
            {

            						newCompositeNode(grammarAccess.getEAITrainingAccess().getConfigEAITrainingConfigParserRuleCall_0_2_0());
            					
            pushFollow(FOLLOW_7);
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

            this_END_3=(Token)match(input,RULE_END,FOLLOW_25); 

            				newLeafNode(this_END_3, grammarAccess.getEAITrainingAccess().getENDTerminalRuleCall_0_3());
            			

            }

            // InternalOptimizationParser.g:860:3: (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END )
            // InternalOptimizationParser.g:861:4: otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END
            {
            otherlv_4=(Token)match(input,Data,FOLLOW_5); 

            				newLeafNode(otherlv_4, grammarAccess.getEAITrainingAccess().getDataKeyword_1_0());
            			
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            				newLeafNode(this_BEGIN_5, grammarAccess.getEAITrainingAccess().getBEGINTerminalRuleCall_1_1());
            			
            // InternalOptimizationParser.g:869:4: ( (lv_data_6_0= ruleEAITrainingData ) )
            // InternalOptimizationParser.g:870:5: (lv_data_6_0= ruleEAITrainingData )
            {
            // InternalOptimizationParser.g:870:5: (lv_data_6_0= ruleEAITrainingData )
            // InternalOptimizationParser.g:871:6: lv_data_6_0= ruleEAITrainingData
            {

            						newCompositeNode(grammarAccess.getEAITrainingAccess().getDataEAITrainingDataParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_7);
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

            this_END_7=(Token)match(input,RULE_END,FOLLOW_27); 

            				newLeafNode(this_END_7, grammarAccess.getEAITrainingAccess().getENDTerminalRuleCall_1_3());
            			

            }

            // InternalOptimizationParser.g:893:3: ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) )
            // InternalOptimizationParser.g:894:4: (lv_aitrainingcase_8_0= ruleEAITrainingCases )
            {
            // InternalOptimizationParser.g:894:4: (lv_aitrainingcase_8_0= ruleEAITrainingCases )
            // InternalOptimizationParser.g:895:5: lv_aitrainingcase_8_0= ruleEAITrainingCases
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
    // InternalOptimizationParser.g:916:1: entryRuleEAITrainingCases returns [EObject current=null] : iv_ruleEAITrainingCases= ruleEAITrainingCases EOF ;
    public final EObject entryRuleEAITrainingCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingCases = null;


        try {
            // InternalOptimizationParser.g:916:57: (iv_ruleEAITrainingCases= ruleEAITrainingCases EOF )
            // InternalOptimizationParser.g:917:2: iv_ruleEAITrainingCases= ruleEAITrainingCases EOF
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
    // InternalOptimizationParser.g:923:1: ruleEAITrainingCases returns [EObject current=null] : (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase ) ;
    public final EObject ruleEAITrainingCases() throws RecognitionException {
        EObject current = null;

        EObject this_EKerasCase_0 = null;

        EObject this_ETensorFlowCase_1 = null;

        EObject this_EPyTorchCase_2 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:929:2: ( (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase ) )
            // InternalOptimizationParser.g:930:2: (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase )
            {
            // InternalOptimizationParser.g:930:2: (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase )
            int alt11=3;
            switch ( input.LA(1) ) {
            case Keras_1:
                {
                alt11=1;
                }
                break;
            case Tensorflow:
                {
                alt11=2;
                }
                break;
            case PyTorch_1:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalOptimizationParser.g:931:3: this_EKerasCase_0= ruleEKerasCase
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
                    // InternalOptimizationParser.g:940:3: this_ETensorFlowCase_1= ruleETensorFlowCase
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
                    // InternalOptimizationParser.g:949:3: this_EPyTorchCase_2= ruleEPyTorchCase
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
    // InternalOptimizationParser.g:961:1: entryRuleEPyTorchCase returns [EObject current=null] : iv_ruleEPyTorchCase= ruleEPyTorchCase EOF ;
    public final EObject entryRuleEPyTorchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPyTorchCase = null;


        try {
            // InternalOptimizationParser.g:961:53: (iv_ruleEPyTorchCase= ruleEPyTorchCase EOF )
            // InternalOptimizationParser.g:962:2: iv_ruleEPyTorchCase= ruleEPyTorchCase EOF
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
    // InternalOptimizationParser.g:968:1: ruleEPyTorchCase returns [EObject current=null] : (otherlv_0= PyTorch_1 this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEPyTorchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_pytorch_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:974:2: ( (otherlv_0= PyTorch_1 this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:975:2: (otherlv_0= PyTorch_1 this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:975:2: (otherlv_0= PyTorch_1 this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:976:3: otherlv_0= PyTorch_1 this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,PyTorch_1,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEPyTorchCaseAccess().getPyTorchKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEPyTorchCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:984:3: ( (lv_pytorch_2_0= ruleEPyTorch ) )
            // InternalOptimizationParser.g:985:4: (lv_pytorch_2_0= ruleEPyTorch )
            {
            // InternalOptimizationParser.g:985:4: (lv_pytorch_2_0= ruleEPyTorch )
            // InternalOptimizationParser.g:986:5: lv_pytorch_2_0= ruleEPyTorch
            {

            					newCompositeNode(grammarAccess.getEPyTorchCaseAccess().getPytorchEPyTorchParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalOptimizationParser.g:1011:1: entryRuleETensorFlowCase returns [EObject current=null] : iv_ruleETensorFlowCase= ruleETensorFlowCase EOF ;
    public final EObject entryRuleETensorFlowCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETensorFlowCase = null;


        try {
            // InternalOptimizationParser.g:1011:56: (iv_ruleETensorFlowCase= ruleETensorFlowCase EOF )
            // InternalOptimizationParser.g:1012:2: iv_ruleETensorFlowCase= ruleETensorFlowCase EOF
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
    // InternalOptimizationParser.g:1018:1: ruleETensorFlowCase returns [EObject current=null] : (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END ) ;
    public final EObject ruleETensorFlowCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_tensorflow_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1024:2: ( (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:1025:2: (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:1025:2: (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:1026:3: otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Tensorflow,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getETensorFlowCaseAccess().getTensorflowKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getETensorFlowCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:1034:3: ( (lv_tensorflow_2_0= ruleETensorFlow ) )
            // InternalOptimizationParser.g:1035:4: (lv_tensorflow_2_0= ruleETensorFlow )
            {
            // InternalOptimizationParser.g:1035:4: (lv_tensorflow_2_0= ruleETensorFlow )
            // InternalOptimizationParser.g:1036:5: lv_tensorflow_2_0= ruleETensorFlow
            {

            					newCompositeNode(grammarAccess.getETensorFlowCaseAccess().getTensorflowETensorFlowParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalOptimizationParser.g:1061:1: entryRuleEKerasCase returns [EObject current=null] : iv_ruleEKerasCase= ruleEKerasCase EOF ;
    public final EObject entryRuleEKerasCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEKerasCase = null;


        try {
            // InternalOptimizationParser.g:1061:51: (iv_ruleEKerasCase= ruleEKerasCase EOF )
            // InternalOptimizationParser.g:1062:2: iv_ruleEKerasCase= ruleEKerasCase EOF
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
    // InternalOptimizationParser.g:1068:1: ruleEKerasCase returns [EObject current=null] : (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEKerasCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_keras_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1074:2: ( (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:1075:2: (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:1075:2: (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:1076:3: otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Keras_1,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEKerasCaseAccess().getKerasKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEKerasCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:1084:3: ( (lv_keras_2_0= ruleEKeras ) )
            // InternalOptimizationParser.g:1085:4: (lv_keras_2_0= ruleEKeras )
            {
            // InternalOptimizationParser.g:1085:4: (lv_keras_2_0= ruleEKeras )
            // InternalOptimizationParser.g:1086:5: lv_keras_2_0= ruleEKeras
            {

            					newCompositeNode(grammarAccess.getEKerasCaseAccess().getKerasEKerasParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalOptimizationParser.g:1111:1: entryRuleEAITrainingConfig returns [EObject current=null] : iv_ruleEAITrainingConfig= ruleEAITrainingConfig EOF ;
    public final EObject entryRuleEAITrainingConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingConfig = null;


        try {
            // InternalOptimizationParser.g:1111:58: (iv_ruleEAITrainingConfig= ruleEAITrainingConfig EOF )
            // InternalOptimizationParser.g:1112:2: iv_ruleEAITrainingConfig= ruleEAITrainingConfig EOF
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
    // InternalOptimizationParser.g:1118:1: ruleEAITrainingConfig returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAITrainingConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_distributed_training_6_0=null;
        Token otherlv_8=null;
        Token lv_layers_9_0=null;
        Token otherlv_10=null;
        Token lv_parameters_11_0=null;
        AntlrDatatypeRuleToken lv_ai_framework_2_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;

        EObject lv_constraint_7_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1124:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:1125:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:1125:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:1126:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:1126:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:1127:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1130:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:1131:5: ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:1131:5: ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=6;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == Ai_framework && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 == Distributed_training && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 == Layers && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 == Parameters && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4) ) {
                    alt13=5;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOptimizationParser.g:1132:3: ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1132:3: ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1133:4: {...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1133:111: ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) )
            	    // InternalOptimizationParser.g:1134:5: ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1137:8: ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) )
            	    // InternalOptimizationParser.g:1137:9: {...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1137:18: (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) )
            	    // InternalOptimizationParser.g:1137:19: otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) )
            	    {
            	    otherlv_1=(Token)match(input,Ai_framework,FOLLOW_31); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAITrainingConfigAccess().getAi_frameworkKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1141:8: ( (lv_ai_framework_2_0= ruleEAIFramework ) )
            	    // InternalOptimizationParser.g:1142:9: (lv_ai_framework_2_0= ruleEAIFramework )
            	    {
            	    // InternalOptimizationParser.g:1142:9: (lv_ai_framework_2_0= ruleEAIFramework )
            	    // InternalOptimizationParser.g:1143:10: lv_ai_framework_2_0= ruleEAIFramework
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingConfigAccess().getAi_frameworkEAIFrameworkParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_32);
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
            	    // InternalOptimizationParser.g:1166:3: ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1166:3: ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1167:4: {...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1167:111: ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) )
            	    // InternalOptimizationParser.g:1168:5: ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1171:8: ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) )
            	    // InternalOptimizationParser.g:1171:9: {...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1171:18: (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) )
            	    // InternalOptimizationParser.g:1171:19: otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) )
            	    {
            	    otherlv_3=(Token)match(input,Type,FOLLOW_33); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAITrainingConfigAccess().getTypeKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1175:8: ( (lv_type_4_0= ruleEAITrainingType ) )
            	    // InternalOptimizationParser.g:1176:9: (lv_type_4_0= ruleEAITrainingType )
            	    {
            	    // InternalOptimizationParser.g:1176:9: (lv_type_4_0= ruleEAITrainingType )
            	    // InternalOptimizationParser.g:1177:10: lv_type_4_0= ruleEAITrainingType
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingConfigAccess().getTypeEAITrainingTypeParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_32);
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
            	    // InternalOptimizationParser.g:1200:3: ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1200:3: ({...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) ) )
            	    // InternalOptimizationParser.g:1201:4: {...}? => ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:1201:111: ( ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) ) )
            	    // InternalOptimizationParser.g:1202:5: ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:1205:8: ({...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? ) )
            	    // InternalOptimizationParser.g:1205:9: {...}? => ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1205:18: ( (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )? )
            	    // InternalOptimizationParser.g:1205:19: (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_7_0= ruleEConstraint ) )?
            	    {
            	    // InternalOptimizationParser.g:1205:19: (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:1206:9: otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,Distributed_training,FOLLOW_8); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEAITrainingConfigAccess().getDistributed_trainingKeyword_2_0_0());
            	    								
            	    // InternalOptimizationParser.g:1210:9: ( (lv_distributed_training_6_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:1211:10: (lv_distributed_training_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:1211:10: (lv_distributed_training_6_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:1212:11: lv_distributed_training_6_0= RULE_BOOLEAN
            	    {
            	    lv_distributed_training_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_34); 

            	    											newLeafNode(lv_distributed_training_6_0, grammarAccess.getEAITrainingConfigAccess().getDistributed_trainingBOOLEANTerminalRuleCall_2_0_1_0());
            	    										

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

            	    // InternalOptimizationParser.g:1229:8: ( (lv_constraint_7_0= ruleEConstraint ) )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==LeftParenthesis) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalOptimizationParser.g:1230:9: (lv_constraint_7_0= ruleEConstraint )
            	            {
            	            // InternalOptimizationParser.g:1230:9: (lv_constraint_7_0= ruleEConstraint )
            	            // InternalOptimizationParser.g:1231:10: lv_constraint_7_0= ruleEConstraint
            	            {

            	            										newCompositeNode(grammarAccess.getEAITrainingConfigAccess().getConstraintEConstraintParserRuleCall_2_1_0());
            	            									
            	            pushFollow(FOLLOW_32);
            	            lv_constraint_7_0=ruleEConstraint();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getEAITrainingConfigRule());
            	            										}
            	            										set(
            	            											current,
            	            											"constraint",
            	            											lv_constraint_7_0,
            	            											"org.sodalite.dsl.optimization.Optimization.EConstraint");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOptimizationParser.g:1254:3: ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1254:3: ({...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1255:4: {...}? => ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:1255:111: ( ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1256:5: ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:1259:8: ({...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1259:9: {...}? => (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1259:18: (otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1259:19: otherlv_8= Layers ( (lv_layers_9_0= RULE_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,Layers,FOLLOW_35); 

            	    								newLeafNode(otherlv_8, grammarAccess.getEAITrainingConfigAccess().getLayersKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:1263:8: ( (lv_layers_9_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1264:9: (lv_layers_9_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1264:9: (lv_layers_9_0= RULE_INT )
            	    // InternalOptimizationParser.g:1265:10: lv_layers_9_0= RULE_INT
            	    {
            	    lv_layers_9_0=(Token)match(input,RULE_INT,FOLLOW_32); 

            	    										newLeafNode(lv_layers_9_0, grammarAccess.getEAITrainingConfigAccess().getLayersINTTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAITrainingConfigRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"layers",
            	    											lv_layers_9_0,
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
            	    // InternalOptimizationParser.g:1287:3: ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1287:3: ({...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1288:4: {...}? => ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:1288:111: ( ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1289:5: ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:1292:8: ({...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1292:9: {...}? => (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1292:18: (otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1292:19: otherlv_10= Parameters ( (lv_parameters_11_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,Parameters,FOLLOW_35); 

            	    								newLeafNode(otherlv_10, grammarAccess.getEAITrainingConfigAccess().getParametersKeyword_4_0());
            	    							
            	    // InternalOptimizationParser.g:1296:8: ( (lv_parameters_11_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1297:9: (lv_parameters_11_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1297:9: (lv_parameters_11_0= RULE_INT )
            	    // InternalOptimizationParser.g:1298:10: lv_parameters_11_0= RULE_INT
            	    {
            	    lv_parameters_11_0=(Token)match(input,RULE_INT,FOLLOW_32); 

            	    										newLeafNode(lv_parameters_11_0, grammarAccess.getEAITrainingConfigAccess().getParametersINTTerminalRuleCall_4_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAITrainingConfigRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"parameters",
            	    											lv_parameters_11_0,
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // InternalOptimizationParser.g:1331:1: entryRuleEAIFramework returns [String current=null] : iv_ruleEAIFramework= ruleEAIFramework EOF ;
    public final String entryRuleEAIFramework() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEAIFramework = null;


        try {
            // InternalOptimizationParser.g:1331:52: (iv_ruleEAIFramework= ruleEAIFramework EOF )
            // InternalOptimizationParser.g:1332:2: iv_ruleEAIFramework= ruleEAIFramework EOF
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
    // InternalOptimizationParser.g:1338:1: ruleEAIFramework returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) ;
    public final AntlrDatatypeRuleToken ruleEAIFramework() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1344:2: ( (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) )
            // InternalOptimizationParser.g:1345:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
            {
            // InternalOptimizationParser.g:1345:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
            int alt14=5;
            switch ( input.LA(1) ) {
            case TensorFlow:
                {
                alt14=1;
                }
                break;
            case PyTorch:
                {
                alt14=2;
                }
                break;
            case Keras:
                {
                alt14=3;
                }
                break;
            case CNTK:
                {
                alt14=4;
                }
                break;
            case MXNet:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalOptimizationParser.g:1346:3: kw= TensorFlow
                    {
                    kw=(Token)match(input,TensorFlow,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getTensorFlowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1352:3: kw= PyTorch
                    {
                    kw=(Token)match(input,PyTorch,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getPyTorchKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1358:3: kw= Keras
                    {
                    kw=(Token)match(input,Keras,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getKerasKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:1364:3: kw= CNTK
                    {
                    kw=(Token)match(input,CNTK,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getCNTKKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOptimizationParser.g:1370:3: kw= MXNet
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
    // InternalOptimizationParser.g:1379:1: entryRuleEAITrainingType returns [String current=null] : iv_ruleEAITrainingType= ruleEAITrainingType EOF ;
    public final String entryRuleEAITrainingType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEAITrainingType = null;


        try {
            // InternalOptimizationParser.g:1379:55: (iv_ruleEAITrainingType= ruleEAITrainingType EOF )
            // InternalOptimizationParser.g:1380:2: iv_ruleEAITrainingType= ruleEAITrainingType EOF
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
    // InternalOptimizationParser.g:1386:1: ruleEAITrainingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning ) ;
    public final AntlrDatatypeRuleToken ruleEAITrainingType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1392:2: ( (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning ) )
            // InternalOptimizationParser.g:1393:2: (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning )
            {
            // InternalOptimizationParser.g:1393:2: (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning )
            int alt15=5;
            switch ( input.LA(1) ) {
            case Image_classification:
                {
                alt15=1;
                }
                break;
            case Object_detection:
                {
                alt15=2;
                }
                break;
            case Translation:
                {
                alt15=3;
                }
                break;
            case Recommendation:
                {
                alt15=4;
                }
                break;
            case Reinforncement_learning:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalOptimizationParser.g:1394:3: kw= Image_classification
                    {
                    kw=(Token)match(input,Image_classification,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getImage_classificationKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1400:3: kw= Object_detection
                    {
                    kw=(Token)match(input,Object_detection,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getObject_detectionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1406:3: kw= Translation
                    {
                    kw=(Token)match(input,Translation,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getTranslationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:1412:3: kw= Recommendation
                    {
                    kw=(Token)match(input,Recommendation,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getRecommendationKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOptimizationParser.g:1418:3: kw= Reinforncement_learning
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
    // InternalOptimizationParser.g:1427:1: entryRuleEAITrainingData returns [EObject current=null] : iv_ruleEAITrainingData= ruleEAITrainingData EOF ;
    public final EObject entryRuleEAITrainingData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingData = null;


        try {
            // InternalOptimizationParser.g:1427:56: (iv_ruleEAITrainingData= ruleEAITrainingData EOF )
            // InternalOptimizationParser.g:1428:2: iv_ruleEAITrainingData= ruleEAITrainingData EOF
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
    // InternalOptimizationParser.g:1434:1: ruleEAITrainingData returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ;
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
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_basedata_4_0 = null;

        EObject lv_constraint_10_0 = null;

        EObject lv_etl_12_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1440:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1441:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1441:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1442:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1442:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1443:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1446:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalOptimizationParser.g:1447:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1447:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) ) )*
            loop17:
            do {
                int alt17=6;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == Location && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == Basedata && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 == Count && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3) ) {
                    alt17=4;
                }
                else if ( LA17_0 == Etl && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4) ) {
                    alt17=5;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalOptimizationParser.g:1448:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1448:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1449:4: {...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1449:109: ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:1450:5: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1453:8: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:1453:9: {...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1453:18: (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:1453:19: otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Location,FOLLOW_23); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAITrainingDataAccess().getLocationKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1457:8: ( (lv_location_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:1458:9: (lv_location_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:1458:9: (lv_location_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:1459:10: lv_location_2_0= RULE_STRING
            	    {
            	    lv_location_2_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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
            	    // InternalOptimizationParser.g:1481:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1481:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1482:4: {...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1482:109: ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) )
            	    // InternalOptimizationParser.g:1483:5: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1486:8: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) )
            	    // InternalOptimizationParser.g:1486:9: {...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1486:18: (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) )
            	    // InternalOptimizationParser.g:1486:19: otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) )
            	    {
            	    otherlv_3=(Token)match(input,Basedata,FOLLOW_37); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAITrainingDataAccess().getBasedataKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1490:8: ( (lv_basedata_4_0= ruleEBasedata ) )
            	    // InternalOptimizationParser.g:1491:9: (lv_basedata_4_0= ruleEBasedata )
            	    {
            	    // InternalOptimizationParser.g:1491:9: (lv_basedata_4_0= ruleEBasedata )
            	    // InternalOptimizationParser.g:1492:10: lv_basedata_4_0= ruleEBasedata
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingDataAccess().getBasedataEBasedataParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_36);
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
            	    // InternalOptimizationParser.g:1515:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1515:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1516:4: {...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:1516:109: ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1517:5: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:1520:8: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1520:9: {...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1520:18: (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1520:19: otherlv_5= Size ( (lv_size_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Size,FOLLOW_35); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAITrainingDataAccess().getSizeKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:1524:8: ( (lv_size_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1525:9: (lv_size_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1525:9: (lv_size_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:1526:10: lv_size_6_0= RULE_INT
            	    {
            	    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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
            	    // InternalOptimizationParser.g:1548:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1548:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1549:4: {...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:1549:109: ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1550:5: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:1553:8: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1553:9: {...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1553:18: (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1553:19: otherlv_7= Count ( (lv_count_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Count,FOLLOW_35); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEAITrainingDataAccess().getCountKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:1557:8: ( (lv_count_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1558:9: (lv_count_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1558:9: (lv_count_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:1559:10: lv_count_8_0= RULE_INT
            	    {
            	    lv_count_8_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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
            	    // InternalOptimizationParser.g:1581:3: ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1581:3: ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalOptimizationParser.g:1582:4: {...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:1582:109: ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) ) )
            	    // InternalOptimizationParser.g:1583:5: ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:1586:8: ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END ) )
            	    // InternalOptimizationParser.g:1586:9: {...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1586:18: (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END )
            	    // InternalOptimizationParser.g:1586:19: otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEAITrainingETL ) ) this_END_13= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Etl,FOLLOW_38); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEAITrainingDataAccess().getEtlKeyword_4_0());
            	    							
            	    // InternalOptimizationParser.g:1590:8: ( (lv_constraint_10_0= ruleEConstraint ) )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==LeftParenthesis) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalOptimizationParser.g:1591:9: (lv_constraint_10_0= ruleEConstraint )
            	            {
            	            // InternalOptimizationParser.g:1591:9: (lv_constraint_10_0= ruleEConstraint )
            	            // InternalOptimizationParser.g:1592:10: lv_constraint_10_0= ruleEConstraint
            	            {

            	            										newCompositeNode(grammarAccess.getEAITrainingDataAccess().getConstraintEConstraintParserRuleCall_4_1_0());
            	            									
            	            pushFollow(FOLLOW_5);
            	            lv_constraint_10_0=ruleEConstraint();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getEAITrainingDataRule());
            	            										}
            	            										set(
            	            											current,
            	            											"constraint",
            	            											lv_constraint_10_0,
            	            											"org.sodalite.dsl.optimization.Optimization.EConstraint");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }

            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

            	    								newLeafNode(this_BEGIN_11, grammarAccess.getEAITrainingDataAccess().getBEGINTerminalRuleCall_4_2());
            	    							
            	    // InternalOptimizationParser.g:1613:8: ( (lv_etl_12_0= ruleEAITrainingETL ) )
            	    // InternalOptimizationParser.g:1614:9: (lv_etl_12_0= ruleEAITrainingETL )
            	    {
            	    // InternalOptimizationParser.g:1614:9: (lv_etl_12_0= ruleEAITrainingETL )
            	    // InternalOptimizationParser.g:1615:10: lv_etl_12_0= ruleEAITrainingETL
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingDataAccess().getEtlEAITrainingETLParserRuleCall_4_3_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_etl_12_0=ruleEAITrainingETL();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAITrainingDataRule());
            	    										}
            	    										set(
            	    											current,
            	    											"etl",
            	    											lv_etl_12_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EAITrainingETL");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_36); 

            	    								newLeafNode(this_END_13, grammarAccess.getEAITrainingDataAccess().getENDTerminalRuleCall_4_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup());
            	    				

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
    // InternalOptimizationParser.g:1652:1: entryRuleEBasedata returns [String current=null] : iv_ruleEBasedata= ruleEBasedata EOF ;
    public final String entryRuleEBasedata() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBasedata = null;


        try {
            // InternalOptimizationParser.g:1652:49: (iv_ruleEBasedata= ruleEBasedata EOF )
            // InternalOptimizationParser.g:1653:2: iv_ruleEBasedata= ruleEBasedata EOF
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
    // InternalOptimizationParser.g:1659:1: ruleEBasedata returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Imagenet | kw= CIFAR | kw= MNIST ) ;
    public final AntlrDatatypeRuleToken ruleEBasedata() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1665:2: ( (kw= Imagenet | kw= CIFAR | kw= MNIST ) )
            // InternalOptimizationParser.g:1666:2: (kw= Imagenet | kw= CIFAR | kw= MNIST )
            {
            // InternalOptimizationParser.g:1666:2: (kw= Imagenet | kw= CIFAR | kw= MNIST )
            int alt18=3;
            switch ( input.LA(1) ) {
            case Imagenet:
                {
                alt18=1;
                }
                break;
            case CIFAR:
                {
                alt18=2;
                }
                break;
            case MNIST:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalOptimizationParser.g:1667:3: kw= Imagenet
                    {
                    kw=(Token)match(input,Imagenet,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBasedataAccess().getImagenetKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1673:3: kw= CIFAR
                    {
                    kw=(Token)match(input,CIFAR,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBasedataAccess().getCIFARKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1679:3: kw= MNIST
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
    // InternalOptimizationParser.g:1688:1: entryRuleEAITrainingETL returns [EObject current=null] : iv_ruleEAITrainingETL= ruleEAITrainingETL EOF ;
    public final EObject entryRuleEAITrainingETL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingETL = null;


        try {
            // InternalOptimizationParser.g:1688:55: (iv_ruleEAITrainingETL= ruleEAITrainingETL EOF )
            // InternalOptimizationParser.g:1689:2: iv_ruleEAITrainingETL= ruleEAITrainingETL EOF
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
    // InternalOptimizationParser.g:1695:1: ruleEAITrainingETL returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEAITrainingETL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefetch_2_0=null;
        Token otherlv_3=null;
        Token lv_cache_4_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1701:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1702:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1702:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1703:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1703:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1704:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1707:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:1708:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1708:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( LA19_0 == Prefetch && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == Cache && getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalOptimizationParser.g:1709:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1709:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1710:4: {...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1710:108: ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1711:5: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1714:8: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1714:9: {...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "true");
            	    }
            	    // InternalOptimizationParser.g:1714:18: (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1714:19: otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,Prefetch,FOLLOW_35); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAITrainingETLAccess().getPrefetchKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1718:8: ( (lv_prefetch_2_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1719:9: (lv_prefetch_2_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1719:9: (lv_prefetch_2_0= RULE_INT )
            	    // InternalOptimizationParser.g:1720:10: lv_prefetch_2_0= RULE_INT
            	    {
            	    lv_prefetch_2_0=(Token)match(input,RULE_INT,FOLLOW_40); 

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
            	    // InternalOptimizationParser.g:1742:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1742:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1743:4: {...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1743:108: ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1744:5: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1747:8: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1747:9: {...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "true");
            	    }
            	    // InternalOptimizationParser.g:1747:18: (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1747:19: otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,Cache,FOLLOW_35); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAITrainingETLAccess().getCacheKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1751:8: ( (lv_cache_4_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1752:9: (lv_cache_4_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1752:9: (lv_cache_4_0= RULE_INT )
            	    // InternalOptimizationParser.g:1753:10: lv_cache_4_0= RULE_INT
            	    {
            	    lv_cache_4_0=(Token)match(input,RULE_INT,FOLLOW_40); 

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
            	    break loop19;
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
    // InternalOptimizationParser.g:1785:1: entryRuleEKeras returns [EObject current=null] : iv_ruleEKeras= ruleEKeras EOF ;
    public final EObject entryRuleEKeras() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEKeras = null;


        try {
            // InternalOptimizationParser.g:1785:47: (iv_ruleEKeras= ruleEKeras EOF )
            // InternalOptimizationParser.g:1786:2: iv_ruleEKeras= ruleEKeras EOF
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
    // InternalOptimizationParser.g:1792:1: ruleEKeras returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEKeras() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_backend_4_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1798:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1799:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1799:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1800:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1800:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1801:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEKerasAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1804:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:1805:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1805:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == Backend && getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalOptimizationParser.g:1806:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1806:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1807:4: {...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1807:100: ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:1808:5: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1811:8: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:1811:9: {...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "true");
            	    }
            	    // InternalOptimizationParser.g:1811:18: (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:1811:19: otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Version,FOLLOW_23); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEKerasAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1815:8: ( (lv_version_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:1816:9: (lv_version_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:1816:9: (lv_version_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:1817:10: lv_version_2_0= RULE_STRING
            	    {
            	    lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

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
            	    // InternalOptimizationParser.g:1839:3: ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1839:3: ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1840:4: {...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1840:100: ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) )
            	    // InternalOptimizationParser.g:1841:5: ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1844:8: ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) )
            	    // InternalOptimizationParser.g:1844:9: {...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "true");
            	    }
            	    // InternalOptimizationParser.g:1844:18: (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) )
            	    // InternalOptimizationParser.g:1844:19: otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) )
            	    {
            	    otherlv_3=(Token)match(input,Backend,FOLLOW_31); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEKerasAccess().getBackendKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1848:8: ( (lv_backend_4_0= ruleEBackend ) )
            	    // InternalOptimizationParser.g:1849:9: (lv_backend_4_0= ruleEBackend )
            	    {
            	    // InternalOptimizationParser.g:1849:9: (lv_backend_4_0= ruleEBackend )
            	    // InternalOptimizationParser.g:1850:10: lv_backend_4_0= ruleEBackend
            	    {

            	    										newCompositeNode(grammarAccess.getEKerasAccess().getBackendEBackendParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_41);
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
            	    break loop20;
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
    // InternalOptimizationParser.g:1883:1: entryRuleEBackend returns [String current=null] : iv_ruleEBackend= ruleEBackend EOF ;
    public final String entryRuleEBackend() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBackend = null;


        try {
            // InternalOptimizationParser.g:1883:48: (iv_ruleEBackend= ruleEBackend EOF )
            // InternalOptimizationParser.g:1884:2: iv_ruleEBackend= ruleEBackend EOF
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
    // InternalOptimizationParser.g:1890:1: ruleEBackend returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) ;
    public final AntlrDatatypeRuleToken ruleEBackend() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1896:2: ( (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) )
            // InternalOptimizationParser.g:1897:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
            {
            // InternalOptimizationParser.g:1897:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
            int alt21=5;
            switch ( input.LA(1) ) {
            case TensorFlow:
                {
                alt21=1;
                }
                break;
            case PyTorch:
                {
                alt21=2;
                }
                break;
            case Keras:
                {
                alt21=3;
                }
                break;
            case CNTK:
                {
                alt21=4;
                }
                break;
            case MXNet:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalOptimizationParser.g:1898:3: kw= TensorFlow
                    {
                    kw=(Token)match(input,TensorFlow,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getTensorFlowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1904:3: kw= PyTorch
                    {
                    kw=(Token)match(input,PyTorch,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getPyTorchKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1910:3: kw= Keras
                    {
                    kw=(Token)match(input,Keras,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getKerasKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:1916:3: kw= CNTK
                    {
                    kw=(Token)match(input,CNTK,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getCNTKKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOptimizationParser.g:1922:3: kw= MXNet
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
    // InternalOptimizationParser.g:1931:1: entryRuleETensorFlow returns [EObject current=null] : iv_ruleETensorFlow= ruleETensorFlow EOF ;
    public final EObject entryRuleETensorFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETensorFlow = null;


        try {
            // InternalOptimizationParser.g:1931:52: (iv_ruleETensorFlow= ruleETensorFlow EOF )
            // InternalOptimizationParser.g:1932:2: iv_ruleETensorFlow= ruleETensorFlow EOF
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
    // InternalOptimizationParser.g:1938:1: ruleETensorFlow returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) ) ) ;
    public final EObject ruleETensorFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token lv_xla_4_0=null;
        EObject lv_constraint_5_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1944:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1945:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1945:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1946:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1946:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1947:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getETensorFlowAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1950:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* )
            // InternalOptimizationParser.g:1951:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1951:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == Xla && getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOptimizationParser.g:1952:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1952:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1953:4: {...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1953:105: ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:1954:5: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1957:8: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:1957:9: {...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "true");
            	    }
            	    // InternalOptimizationParser.g:1957:18: (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:1957:19: otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Version,FOLLOW_23); 

            	    								newLeafNode(otherlv_1, grammarAccess.getETensorFlowAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1961:8: ( (lv_version_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:1962:9: (lv_version_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:1962:9: (lv_version_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:1963:10: lv_version_2_0= RULE_STRING
            	    {
            	    lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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
            	    // InternalOptimizationParser.g:1985:3: ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1985:3: ({...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) )
            	    // InternalOptimizationParser.g:1986:4: {...}? => ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1986:105: ( ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) )
            	    // InternalOptimizationParser.g:1987:5: ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1990:8: ({...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) )
            	    // InternalOptimizationParser.g:1990:9: {...}? => ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "true");
            	    }
            	    // InternalOptimizationParser.g:1990:18: ( (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? )
            	    // InternalOptimizationParser.g:1990:19: (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )?
            	    {
            	    // InternalOptimizationParser.g:1990:19: (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:1991:9: otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,Xla,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getETensorFlowAccess().getXlaKeyword_1_0_0());
            	    								
            	    // InternalOptimizationParser.g:1995:9: ( (lv_xla_4_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:1996:10: (lv_xla_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:1996:10: (lv_xla_4_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:1997:11: lv_xla_4_0= RULE_BOOLEAN
            	    {
            	    lv_xla_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_43); 

            	    											newLeafNode(lv_xla_4_0, grammarAccess.getETensorFlowAccess().getXlaBOOLEANTerminalRuleCall_1_0_1_0());
            	    										

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

            	    // InternalOptimizationParser.g:2014:8: ( (lv_constraint_5_0= ruleEConstraint ) )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==LeftParenthesis) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalOptimizationParser.g:2015:9: (lv_constraint_5_0= ruleEConstraint )
            	            {
            	            // InternalOptimizationParser.g:2015:9: (lv_constraint_5_0= ruleEConstraint )
            	            // InternalOptimizationParser.g:2016:10: lv_constraint_5_0= ruleEConstraint
            	            {

            	            										newCompositeNode(grammarAccess.getETensorFlowAccess().getConstraintEConstraintParserRuleCall_1_1_0());
            	            									
            	            pushFollow(FOLLOW_42);
            	            lv_constraint_5_0=ruleEConstraint();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getETensorFlowRule());
            	            										}
            	            										set(
            	            											current,
            	            											"constraint",
            	            											lv_constraint_5_0,
            	            											"org.sodalite.dsl.optimization.Optimization.EConstraint");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETensorFlowAccess().getUnorderedGroup());
            	    				

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
    // InternalOptimizationParser.g:2049:1: entryRuleEPyTorch returns [EObject current=null] : iv_ruleEPyTorch= ruleEPyTorch EOF ;
    public final EObject entryRuleEPyTorch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPyTorch = null;


        try {
            // InternalOptimizationParser.g:2049:49: (iv_ruleEPyTorch= ruleEPyTorch EOF )
            // InternalOptimizationParser.g:2050:2: iv_ruleEPyTorch= ruleEPyTorch EOF
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
    // InternalOptimizationParser.g:2056:1: ruleEPyTorch returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) ) ) ;
    public final EObject ruleEPyTorch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token lv_glow_4_0=null;
        EObject lv_constraint_5_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2062:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:2063:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:2063:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:2064:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:2064:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* ) )
            // InternalOptimizationParser.g:2065:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPyTorchAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2068:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )* )
            // InternalOptimizationParser.g:2069:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )*
            {
            // InternalOptimizationParser.g:2069:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == Glow && getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOptimizationParser.g:2070:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2070:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2071:4: {...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2071:102: ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:2072:5: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2075:8: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:2075:9: {...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "true");
            	    }
            	    // InternalOptimizationParser.g:2075:18: (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:2075:19: otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Version,FOLLOW_23); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPyTorchAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:2079:8: ( (lv_version_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:2080:9: (lv_version_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:2080:9: (lv_version_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:2081:10: lv_version_2_0= RULE_STRING
            	    {
            	    lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

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
            	    // InternalOptimizationParser.g:2103:3: ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2103:3: ({...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) ) )
            	    // InternalOptimizationParser.g:2104:4: {...}? => ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2104:102: ( ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) ) )
            	    // InternalOptimizationParser.g:2105:5: ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2108:8: ({...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? ) )
            	    // InternalOptimizationParser.g:2108:9: {...}? => ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "true");
            	    }
            	    // InternalOptimizationParser.g:2108:18: ( (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )? )
            	    // InternalOptimizationParser.g:2108:19: (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ( (lv_constraint_5_0= ruleEConstraint ) )?
            	    {
            	    // InternalOptimizationParser.g:2108:19: (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:2109:9: otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,Glow,FOLLOW_8); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEPyTorchAccess().getGlowKeyword_1_0_0());
            	    								
            	    // InternalOptimizationParser.g:2113:9: ( (lv_glow_4_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:2114:10: (lv_glow_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:2114:10: (lv_glow_4_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:2115:11: lv_glow_4_0= RULE_BOOLEAN
            	    {
            	    lv_glow_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_45); 

            	    											newLeafNode(lv_glow_4_0, grammarAccess.getEPyTorchAccess().getGlowBOOLEANTerminalRuleCall_1_0_1_0());
            	    										

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

            	    // InternalOptimizationParser.g:2132:8: ( (lv_constraint_5_0= ruleEConstraint ) )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==LeftParenthesis) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalOptimizationParser.g:2133:9: (lv_constraint_5_0= ruleEConstraint )
            	            {
            	            // InternalOptimizationParser.g:2133:9: (lv_constraint_5_0= ruleEConstraint )
            	            // InternalOptimizationParser.g:2134:10: lv_constraint_5_0= ruleEConstraint
            	            {

            	            										newCompositeNode(grammarAccess.getEPyTorchAccess().getConstraintEConstraintParserRuleCall_1_1_0());
            	            									
            	            pushFollow(FOLLOW_44);
            	            lv_constraint_5_0=ruleEConstraint();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getEPyTorchRule());
            	            										}
            	            										set(
            	            											current,
            	            											"constraint",
            	            											lv_constraint_5_0,
            	            											"org.sodalite.dsl.optimization.Optimization.EConstraint");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPyTorchAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalOptimizationParser.g:2167:1: entryRuleEHPC returns [EObject current=null] : iv_ruleEHPC= ruleEHPC EOF ;
    public final EObject entryRuleEHPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPC = null;


        try {
            // InternalOptimizationParser.g:2167:45: (iv_ruleEHPC= ruleEHPC EOF )
            // InternalOptimizationParser.g:2168:2: iv_ruleEHPC= ruleEHPC EOF
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
    // InternalOptimizationParser.g:2174:1: ruleEHPC returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEHPC() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        EObject lv_config_3_0 = null;

        EObject lv_data_7_0 = null;

        EObject lv_mpi_9_0 = null;

        EObject lv_openmp_10_0 = null;

        EObject lv_openacc_11_0 = null;

        EObject lv_opencl_12_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2180:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:2181:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:2181:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:2182:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:2182:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:2183:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEHPCAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2186:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:2187:5: ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:2187:5: ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=5;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == Config && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 == Openmp && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 1) ) {
                    alt27=2;
                }
                else if ( LA27_0 == Openacc && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 2) ) {
                    alt27=3;
                }
                else if ( LA27_0 == Opencl && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 3) ) {
                    alt27=4;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalOptimizationParser.g:2188:3: ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2188:3: ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) )
            	    // InternalOptimizationParser.g:2189:4: {...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2189:98: ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) )
            	    // InternalOptimizationParser.g:2190:5: ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2193:8: ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) )
            	    // InternalOptimizationParser.g:2193:9: {...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "true");
            	    }
            	    // InternalOptimizationParser.g:2193:18: ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? )
            	    // InternalOptimizationParser.g:2193:19: (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )?
            	    {
            	    // InternalOptimizationParser.g:2193:19: (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END )
            	    // InternalOptimizationParser.g:2194:9: otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END
            	    {
            	    otherlv_1=(Token)match(input,Config,FOLLOW_5); 

            	    									newLeafNode(otherlv_1, grammarAccess.getEHPCAccess().getConfigKeyword_0_0_0());
            	    								
            	    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_46); 

            	    									newLeafNode(this_BEGIN_2, grammarAccess.getEHPCAccess().getBEGINTerminalRuleCall_0_0_1());
            	    								
            	    // InternalOptimizationParser.g:2202:9: ( (lv_config_3_0= ruleEHPCConfig ) )
            	    // InternalOptimizationParser.g:2203:10: (lv_config_3_0= ruleEHPCConfig )
            	    {
            	    // InternalOptimizationParser.g:2203:10: (lv_config_3_0= ruleEHPCConfig )
            	    // InternalOptimizationParser.g:2204:11: lv_config_3_0= ruleEHPCConfig
            	    {

            	    											newCompositeNode(grammarAccess.getEHPCAccess().getConfigEHPCConfigParserRuleCall_0_0_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_config_3_0=ruleEHPCConfig();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEHPCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"config",
            	    												lv_config_3_0,
            	    												"org.sodalite.dsl.optimization.Optimization.EHPCConfig");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_4=(Token)match(input,RULE_END,FOLLOW_25); 

            	    									newLeafNode(this_END_4, grammarAccess.getEHPCAccess().getENDTerminalRuleCall_0_0_3());
            	    								

            	    }

            	    // InternalOptimizationParser.g:2226:8: (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END )
            	    // InternalOptimizationParser.g:2227:9: otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Data,FOLLOW_5); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEHPCAccess().getDataKeyword_0_1_0());
            	    								
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            	    									newLeafNode(this_BEGIN_6, grammarAccess.getEHPCAccess().getBEGINTerminalRuleCall_0_1_1());
            	    								
            	    // InternalOptimizationParser.g:2235:9: ( (lv_data_7_0= ruleEHPCData ) )
            	    // InternalOptimizationParser.g:2236:10: (lv_data_7_0= ruleEHPCData )
            	    {
            	    // InternalOptimizationParser.g:2236:10: (lv_data_7_0= ruleEHPCData )
            	    // InternalOptimizationParser.g:2237:11: lv_data_7_0= ruleEHPCData
            	    {

            	    											newCompositeNode(grammarAccess.getEHPCAccess().getDataEHPCDataParserRuleCall_0_1_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_data_7_0=ruleEHPCData();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEHPCRule());
            	    											}
            	    											set(
            	    												current,
            	    												"data",
            	    												lv_data_7_0,
            	    												"org.sodalite.dsl.optimization.Optimization.EHPCData");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_47); 

            	    									newLeafNode(this_END_8, grammarAccess.getEHPCAccess().getENDTerminalRuleCall_0_1_3());
            	    								

            	    }

            	    // InternalOptimizationParser.g:2259:8: ( (lv_mpi_9_0= ruleEMPICase ) )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==Mpi) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalOptimizationParser.g:2260:9: (lv_mpi_9_0= ruleEMPICase )
            	            {
            	            // InternalOptimizationParser.g:2260:9: (lv_mpi_9_0= ruleEMPICase )
            	            // InternalOptimizationParser.g:2261:10: lv_mpi_9_0= ruleEMPICase
            	            {

            	            										newCompositeNode(grammarAccess.getEHPCAccess().getMpiEMPICaseParserRuleCall_0_2_0());
            	            									
            	            pushFollow(FOLLOW_48);
            	            lv_mpi_9_0=ruleEMPICase();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getEHPCRule());
            	            										}
            	            										set(
            	            											current,
            	            											"mpi",
            	            											lv_mpi_9_0,
            	            											"org.sodalite.dsl.optimization.Optimization.EMPICase");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalOptimizationParser.g:2284:3: ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2284:3: ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) )
            	    // InternalOptimizationParser.g:2285:4: {...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2285:98: ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) )
            	    // InternalOptimizationParser.g:2286:5: ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2289:8: ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) )
            	    // InternalOptimizationParser.g:2289:9: {...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "true");
            	    }
            	    // InternalOptimizationParser.g:2289:18: ( (lv_openmp_10_0= ruleEOPENMPCase ) )
            	    // InternalOptimizationParser.g:2289:19: (lv_openmp_10_0= ruleEOPENMPCase )
            	    {
            	    // InternalOptimizationParser.g:2289:19: (lv_openmp_10_0= ruleEOPENMPCase )
            	    // InternalOptimizationParser.g:2290:9: lv_openmp_10_0= ruleEOPENMPCase
            	    {

            	    									newCompositeNode(grammarAccess.getEHPCAccess().getOpenmpEOPENMPCaseParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_48);
            	    lv_openmp_10_0=ruleEOPENMPCase();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getEHPCRule());
            	    									}
            	    									set(
            	    										current,
            	    										"openmp",
            	    										lv_openmp_10_0,
            	    										"org.sodalite.dsl.optimization.Optimization.EOPENMPCase");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalOptimizationParser.g:2312:3: ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2312:3: ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) )
            	    // InternalOptimizationParser.g:2313:4: {...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:2313:98: ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) )
            	    // InternalOptimizationParser.g:2314:5: ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:2317:8: ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) )
            	    // InternalOptimizationParser.g:2317:9: {...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "true");
            	    }
            	    // InternalOptimizationParser.g:2317:18: ( (lv_openacc_11_0= ruleEOPENACCCase ) )
            	    // InternalOptimizationParser.g:2317:19: (lv_openacc_11_0= ruleEOPENACCCase )
            	    {
            	    // InternalOptimizationParser.g:2317:19: (lv_openacc_11_0= ruleEOPENACCCase )
            	    // InternalOptimizationParser.g:2318:9: lv_openacc_11_0= ruleEOPENACCCase
            	    {

            	    									newCompositeNode(grammarAccess.getEHPCAccess().getOpenaccEOPENACCCaseParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_48);
            	    lv_openacc_11_0=ruleEOPENACCCase();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getEHPCRule());
            	    									}
            	    									set(
            	    										current,
            	    										"openacc",
            	    										lv_openacc_11_0,
            	    										"org.sodalite.dsl.optimization.Optimization.EOPENACCCase");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalOptimizationParser.g:2340:3: ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2340:3: ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) )
            	    // InternalOptimizationParser.g:2341:4: {...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:2341:98: ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) )
            	    // InternalOptimizationParser.g:2342:5: ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:2345:8: ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) )
            	    // InternalOptimizationParser.g:2345:9: {...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "true");
            	    }
            	    // InternalOptimizationParser.g:2345:18: ( (lv_opencl_12_0= ruleEOPENCLCase ) )
            	    // InternalOptimizationParser.g:2345:19: (lv_opencl_12_0= ruleEOPENCLCase )
            	    {
            	    // InternalOptimizationParser.g:2345:19: (lv_opencl_12_0= ruleEOPENCLCase )
            	    // InternalOptimizationParser.g:2346:9: lv_opencl_12_0= ruleEOPENCLCase
            	    {

            	    									newCompositeNode(grammarAccess.getEHPCAccess().getOpenclEOPENCLCaseParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_48);
            	    lv_opencl_12_0=ruleEOPENCLCase();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getEHPCRule());
            	    									}
            	    									set(
            	    										current,
            	    										"opencl",
            	    										lv_opencl_12_0,
            	    										"org.sodalite.dsl.optimization.Optimization.EOPENCLCase");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEHPCAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEHPC", "getUnorderedGroupHelper().canLeave(grammarAccess.getEHPCAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEHPCAccess().getUnorderedGroup());
            			

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


    // $ANTLR start "entryRuleEOPENCLCase"
    // InternalOptimizationParser.g:2379:1: entryRuleEOPENCLCase returns [EObject current=null] : iv_ruleEOPENCLCase= ruleEOPENCLCase EOF ;
    public final EObject entryRuleEOPENCLCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENCLCase = null;


        try {
            // InternalOptimizationParser.g:2379:52: (iv_ruleEOPENCLCase= ruleEOPENCLCase EOF )
            // InternalOptimizationParser.g:2380:2: iv_ruleEOPENCLCase= ruleEOPENCLCase EOF
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
    // InternalOptimizationParser.g:2386:1: ruleEOPENCLCase returns [EObject current=null] : (otherlv_0= Opencl ( (lv_constraint_1_0= ruleEConstraint ) )? this_BEGIN_2= RULE_BEGIN ( (lv_opencl_3_0= ruleEOPENCL ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEOPENCLCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_constraint_1_0 = null;

        EObject lv_opencl_3_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2392:2: ( (otherlv_0= Opencl ( (lv_constraint_1_0= ruleEConstraint ) )? this_BEGIN_2= RULE_BEGIN ( (lv_opencl_3_0= ruleEOPENCL ) ) this_END_4= RULE_END ) )
            // InternalOptimizationParser.g:2393:2: (otherlv_0= Opencl ( (lv_constraint_1_0= ruleEConstraint ) )? this_BEGIN_2= RULE_BEGIN ( (lv_opencl_3_0= ruleEOPENCL ) ) this_END_4= RULE_END )
            {
            // InternalOptimizationParser.g:2393:2: (otherlv_0= Opencl ( (lv_constraint_1_0= ruleEConstraint ) )? this_BEGIN_2= RULE_BEGIN ( (lv_opencl_3_0= ruleEOPENCL ) ) this_END_4= RULE_END )
            // InternalOptimizationParser.g:2394:3: otherlv_0= Opencl ( (lv_constraint_1_0= ruleEConstraint ) )? this_BEGIN_2= RULE_BEGIN ( (lv_opencl_3_0= ruleEOPENCL ) ) this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Opencl,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getEOPENCLCaseAccess().getOpenclKeyword_0());
            		
            // InternalOptimizationParser.g:2398:3: ( (lv_constraint_1_0= ruleEConstraint ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LeftParenthesis) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalOptimizationParser.g:2399:4: (lv_constraint_1_0= ruleEConstraint )
                    {
                    // InternalOptimizationParser.g:2399:4: (lv_constraint_1_0= ruleEConstraint )
                    // InternalOptimizationParser.g:2400:5: lv_constraint_1_0= ruleEConstraint
                    {

                    					newCompositeNode(grammarAccess.getEOPENCLCaseAccess().getConstraintEConstraintParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_constraint_1_0=ruleEConstraint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEOPENCLCaseRule());
                    					}
                    					set(
                    						current,
                    						"constraint",
                    						lv_constraint_1_0,
                    						"org.sodalite.dsl.optimization.Optimization.EConstraint");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEOPENCLCaseAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalOptimizationParser.g:2421:3: ( (lv_opencl_3_0= ruleEOPENCL ) )
            // InternalOptimizationParser.g:2422:4: (lv_opencl_3_0= ruleEOPENCL )
            {
            // InternalOptimizationParser.g:2422:4: (lv_opencl_3_0= ruleEOPENCL )
            // InternalOptimizationParser.g:2423:5: lv_opencl_3_0= ruleEOPENCL
            {

            					newCompositeNode(grammarAccess.getEOPENCLCaseAccess().getOpenclEOPENCLParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_opencl_3_0=ruleEOPENCL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOPENCLCaseRule());
            					}
            					set(
            						current,
            						"opencl",
            						lv_opencl_3_0,
            						"org.sodalite.dsl.optimization.Optimization.EOPENCL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEOPENCLCaseAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalOptimizationParser.g:2448:1: entryRuleEOPENACCCase returns [EObject current=null] : iv_ruleEOPENACCCase= ruleEOPENACCCase EOF ;
    public final EObject entryRuleEOPENACCCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENACCCase = null;


        try {
            // InternalOptimizationParser.g:2448:53: (iv_ruleEOPENACCCase= ruleEOPENACCCase EOF )
            // InternalOptimizationParser.g:2449:2: iv_ruleEOPENACCCase= ruleEOPENACCCase EOF
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
    // InternalOptimizationParser.g:2455:1: ruleEOPENACCCase returns [EObject current=null] : (otherlv_0= Openacc ( (lv_constraint_1_0= ruleEConstraint ) )? this_BEGIN_2= RULE_BEGIN ( (lv_openacc_3_0= ruleEOPENACC ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEOPENACCCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_constraint_1_0 = null;

        EObject lv_openacc_3_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2461:2: ( (otherlv_0= Openacc ( (lv_constraint_1_0= ruleEConstraint ) )? this_BEGIN_2= RULE_BEGIN ( (lv_openacc_3_0= ruleEOPENACC ) ) this_END_4= RULE_END ) )
            // InternalOptimizationParser.g:2462:2: (otherlv_0= Openacc ( (lv_constraint_1_0= ruleEConstraint ) )? this_BEGIN_2= RULE_BEGIN ( (lv_openacc_3_0= ruleEOPENACC ) ) this_END_4= RULE_END )
            {
            // InternalOptimizationParser.g:2462:2: (otherlv_0= Openacc ( (lv_constraint_1_0= ruleEConstraint ) )? this_BEGIN_2= RULE_BEGIN ( (lv_openacc_3_0= ruleEOPENACC ) ) this_END_4= RULE_END )
            // InternalOptimizationParser.g:2463:3: otherlv_0= Openacc ( (lv_constraint_1_0= ruleEConstraint ) )? this_BEGIN_2= RULE_BEGIN ( (lv_openacc_3_0= ruleEOPENACC ) ) this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Openacc,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getEOPENACCCaseAccess().getOpenaccKeyword_0());
            		
            // InternalOptimizationParser.g:2467:3: ( (lv_constraint_1_0= ruleEConstraint ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==LeftParenthesis) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalOptimizationParser.g:2468:4: (lv_constraint_1_0= ruleEConstraint )
                    {
                    // InternalOptimizationParser.g:2468:4: (lv_constraint_1_0= ruleEConstraint )
                    // InternalOptimizationParser.g:2469:5: lv_constraint_1_0= ruleEConstraint
                    {

                    					newCompositeNode(grammarAccess.getEOPENACCCaseAccess().getConstraintEConstraintParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_constraint_1_0=ruleEConstraint();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEOPENACCCaseRule());
                    					}
                    					set(
                    						current,
                    						"constraint",
                    						lv_constraint_1_0,
                    						"org.sodalite.dsl.optimization.Optimization.EConstraint");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_49); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEOPENACCCaseAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalOptimizationParser.g:2490:3: ( (lv_openacc_3_0= ruleEOPENACC ) )
            // InternalOptimizationParser.g:2491:4: (lv_openacc_3_0= ruleEOPENACC )
            {
            // InternalOptimizationParser.g:2491:4: (lv_openacc_3_0= ruleEOPENACC )
            // InternalOptimizationParser.g:2492:5: lv_openacc_3_0= ruleEOPENACC
            {

            					newCompositeNode(grammarAccess.getEOPENACCCaseAccess().getOpenaccEOPENACCParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_openacc_3_0=ruleEOPENACC();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOPENACCCaseRule());
            					}
            					set(
            						current,
            						"openacc",
            						lv_openacc_3_0,
            						"org.sodalite.dsl.optimization.Optimization.EOPENACC");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEOPENACCCaseAccess().getENDTerminalRuleCall_4());
            		

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
    // InternalOptimizationParser.g:2517:1: entryRuleEOPENMPCase returns [EObject current=null] : iv_ruleEOPENMPCase= ruleEOPENMPCase EOF ;
    public final EObject entryRuleEOPENMPCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENMPCase = null;


        try {
            // InternalOptimizationParser.g:2517:52: (iv_ruleEOPENMPCase= ruleEOPENMPCase EOF )
            // InternalOptimizationParser.g:2518:2: iv_ruleEOPENMPCase= ruleEOPENMPCase EOF
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
    // InternalOptimizationParser.g:2524:1: ruleEOPENMPCase returns [EObject current=null] : (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEOPENMPCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_openmp_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2530:2: ( (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:2531:2: (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:2531:2: (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2532:3: otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Openmp,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEOPENMPCaseAccess().getOpenmpKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEOPENMPCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:2540:3: ( (lv_openmp_2_0= ruleEOPENMP ) )
            // InternalOptimizationParser.g:2541:4: (lv_openmp_2_0= ruleEOPENMP )
            {
            // InternalOptimizationParser.g:2541:4: (lv_openmp_2_0= ruleEOPENMP )
            // InternalOptimizationParser.g:2542:5: lv_openmp_2_0= ruleEOPENMP
            {

            					newCompositeNode(grammarAccess.getEOPENMPCaseAccess().getOpenmpEOPENMPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalOptimizationParser.g:2567:1: entryRuleEMPICase returns [EObject current=null] : iv_ruleEMPICase= ruleEMPICase EOF ;
    public final EObject entryRuleEMPICase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMPICase = null;


        try {
            // InternalOptimizationParser.g:2567:49: (iv_ruleEMPICase= ruleEMPICase EOF )
            // InternalOptimizationParser.g:2568:2: iv_ruleEMPICase= ruleEMPICase EOF
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
    // InternalOptimizationParser.g:2574:1: ruleEMPICase returns [EObject current=null] : (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEMPICase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_mpi_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2580:2: ( (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:2581:2: (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:2581:2: (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2582:3: otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Mpi,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEMPICaseAccess().getMpiKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEMPICaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:2590:3: ( (lv_mpi_2_0= ruleEMPI ) )
            // InternalOptimizationParser.g:2591:4: (lv_mpi_2_0= ruleEMPI )
            {
            // InternalOptimizationParser.g:2591:4: (lv_mpi_2_0= ruleEMPI )
            // InternalOptimizationParser.g:2592:5: lv_mpi_2_0= ruleEMPI
            {

            					newCompositeNode(grammarAccess.getEMPICaseAccess().getMpiEMPIParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalOptimizationParser.g:2617:1: entryRuleEHPCConfig returns [EObject current=null] : iv_ruleEHPCConfig= ruleEHPCConfig EOF ;
    public final EObject entryRuleEHPCConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCConfig = null;


        try {
            // InternalOptimizationParser.g:2617:51: (iv_ruleEHPCConfig= ruleEHPCConfig EOF )
            // InternalOptimizationParser.g:2618:2: iv_ruleEHPCConfig= ruleEHPCConfig EOF
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
    // InternalOptimizationParser.g:2624:1: ruleEHPCConfig returns [EObject current=null] : (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )* ) ;
    public final EObject ruleEHPCConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_parallelisation_1_0 = null;

        AntlrDatatypeRuleToken lv_parallelisation_3_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2630:2: ( (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )* ) )
            // InternalOptimizationParser.g:2631:2: (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )* )
            {
            // InternalOptimizationParser.g:2631:2: (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )* )
            // InternalOptimizationParser.g:2632:3: otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )*
            {
            otherlv_0=(Token)match(input,Parallelisation,FOLLOW_52); 

            			newLeafNode(otherlv_0, grammarAccess.getEHPCConfigAccess().getParallelisationKeyword_0());
            		
            // InternalOptimizationParser.g:2636:3: ( (lv_parallelisation_1_0= ruleEParallelisation ) )
            // InternalOptimizationParser.g:2637:4: (lv_parallelisation_1_0= ruleEParallelisation )
            {
            // InternalOptimizationParser.g:2637:4: (lv_parallelisation_1_0= ruleEParallelisation )
            // InternalOptimizationParser.g:2638:5: lv_parallelisation_1_0= ruleEParallelisation
            {

            					newCompositeNode(grammarAccess.getEHPCConfigAccess().getParallelisationEParallelisationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_53);
            lv_parallelisation_1_0=ruleEParallelisation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEHPCConfigRule());
            					}
            					add(
            						current,
            						"parallelisation",
            						lv_parallelisation_1_0,
            						"org.sodalite.dsl.optimization.Optimization.EParallelisation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOptimizationParser.g:2655:3: (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalOptimizationParser.g:2656:4: otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_52); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEHPCConfigAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOptimizationParser.g:2660:4: ( (lv_parallelisation_3_0= ruleEParallelisation ) )
            	    // InternalOptimizationParser.g:2661:5: (lv_parallelisation_3_0= ruleEParallelisation )
            	    {
            	    // InternalOptimizationParser.g:2661:5: (lv_parallelisation_3_0= ruleEParallelisation )
            	    // InternalOptimizationParser.g:2662:6: lv_parallelisation_3_0= ruleEParallelisation
            	    {

            	    						newCompositeNode(grammarAccess.getEHPCConfigAccess().getParallelisationEParallelisationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_53);
            	    lv_parallelisation_3_0=ruleEParallelisation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEHPCConfigRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parallelisation",
            	    							lv_parallelisation_3_0,
            	    							"org.sodalite.dsl.optimization.Optimization.EParallelisation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


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
    // InternalOptimizationParser.g:2684:1: entryRuleEParallelisation returns [String current=null] : iv_ruleEParallelisation= ruleEParallelisation EOF ;
    public final String entryRuleEParallelisation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEParallelisation = null;


        try {
            // InternalOptimizationParser.g:2684:56: (iv_ruleEParallelisation= ruleEParallelisation EOF )
            // InternalOptimizationParser.g:2685:2: iv_ruleEParallelisation= ruleEParallelisation EOF
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
    // InternalOptimizationParser.g:2691:1: ruleEParallelisation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL ) ;
    public final AntlrDatatypeRuleToken ruleEParallelisation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:2697:2: ( (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL ) )
            // InternalOptimizationParser.g:2698:2: (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL )
            {
            // InternalOptimizationParser.g:2698:2: (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL )
            int alt31=4;
            switch ( input.LA(1) ) {
            case MPI:
                {
                alt31=1;
                }
                break;
            case OPENMP:
                {
                alt31=2;
                }
                break;
            case OPENACC:
                {
                alt31=3;
                }
                break;
            case OPENCL:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalOptimizationParser.g:2699:3: kw= MPI
                    {
                    kw=(Token)match(input,MPI,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEParallelisationAccess().getMPIKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:2705:3: kw= OPENMP
                    {
                    kw=(Token)match(input,OPENMP,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEParallelisationAccess().getOPENMPKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:2711:3: kw= OPENACC
                    {
                    kw=(Token)match(input,OPENACC,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEParallelisationAccess().getOPENACCKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:2717:3: kw= OPENCL
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
    // InternalOptimizationParser.g:2726:1: entryRuleEHPCData returns [EObject current=null] : iv_ruleEHPCData= ruleEHPCData EOF ;
    public final EObject entryRuleEHPCData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCData = null;


        try {
            // InternalOptimizationParser.g:2726:49: (iv_ruleEHPCData= ruleEHPCData EOF )
            // InternalOptimizationParser.g:2727:2: iv_ruleEHPCData= ruleEHPCData EOF
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
    // InternalOptimizationParser.g:2733:1: ruleEHPCData returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ;
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
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        AntlrDatatypeRuleToken lv_basedata_4_0 = null;

        EObject lv_constraint_10_0 = null;

        EObject lv_etl_12_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2739:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:2740:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:2740:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:2741:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:2741:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalOptimizationParser.g:2742:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2745:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalOptimizationParser.g:2746:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalOptimizationParser.g:2746:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) ) )*
            loop33:
            do {
                int alt33=6;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == Location && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == Basedata && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2) ) {
                    alt33=3;
                }
                else if ( LA33_0 == Count && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3) ) {
                    alt33=4;
                }
                else if ( LA33_0 == Etl && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4) ) {
                    alt33=5;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOptimizationParser.g:2747:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2747:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2748:4: {...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2748:102: ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:2749:5: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2752:8: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:2752:9: {...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2752:18: (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:2752:19: otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Location,FOLLOW_23); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEHPCDataAccess().getLocationKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:2756:8: ( (lv_location_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:2757:9: (lv_location_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:2757:9: (lv_location_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:2758:10: lv_location_2_0= RULE_STRING
            	    {
            	    lv_location_2_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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
            	    // InternalOptimizationParser.g:2780:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2780:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2781:4: {...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2781:102: ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) )
            	    // InternalOptimizationParser.g:2782:5: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2785:8: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) )
            	    // InternalOptimizationParser.g:2785:9: {...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2785:18: (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) )
            	    // InternalOptimizationParser.g:2785:19: otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) )
            	    {
            	    otherlv_3=(Token)match(input,Basedata,FOLLOW_54); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEHPCDataAccess().getBasedataKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:2789:8: ( (lv_basedata_4_0= ruleEHPCBasedata ) )
            	    // InternalOptimizationParser.g:2790:9: (lv_basedata_4_0= ruleEHPCBasedata )
            	    {
            	    // InternalOptimizationParser.g:2790:9: (lv_basedata_4_0= ruleEHPCBasedata )
            	    // InternalOptimizationParser.g:2791:10: lv_basedata_4_0= ruleEHPCBasedata
            	    {

            	    										newCompositeNode(grammarAccess.getEHPCDataAccess().getBasedataEHPCBasedataParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_36);
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
            	    // InternalOptimizationParser.g:2814:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2814:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2815:4: {...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:2815:102: ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:2816:5: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:2819:8: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:2819:9: {...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2819:18: (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:2819:19: otherlv_5= Size ( (lv_size_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Size,FOLLOW_35); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEHPCDataAccess().getSizeKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:2823:8: ( (lv_size_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:2824:9: (lv_size_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:2824:9: (lv_size_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:2825:10: lv_size_6_0= RULE_INT
            	    {
            	    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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
            	    // InternalOptimizationParser.g:2847:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2847:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2848:4: {...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:2848:102: ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:2849:5: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:2852:8: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:2852:9: {...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2852:18: (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:2852:19: otherlv_7= Count ( (lv_count_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Count,FOLLOW_35); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEHPCDataAccess().getCountKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:2856:8: ( (lv_count_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:2857:9: (lv_count_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:2857:9: (lv_count_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:2858:10: lv_count_8_0= RULE_INT
            	    {
            	    lv_count_8_0=(Token)match(input,RULE_INT,FOLLOW_36); 

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
            	    // InternalOptimizationParser.g:2880:3: ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2880:3: ({...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalOptimizationParser.g:2881:4: {...}? => ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:2881:102: ( ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) ) )
            	    // InternalOptimizationParser.g:2882:5: ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:2885:8: ({...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END ) )
            	    // InternalOptimizationParser.g:2885:9: {...}? => (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2885:18: (otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END )
            	    // InternalOptimizationParser.g:2885:19: otherlv_9= Etl ( (lv_constraint_10_0= ruleEConstraint ) )? this_BEGIN_11= RULE_BEGIN ( (lv_etl_12_0= ruleEHPCETL ) ) this_END_13= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Etl,FOLLOW_38); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEHPCDataAccess().getEtlKeyword_4_0());
            	    							
            	    // InternalOptimizationParser.g:2889:8: ( (lv_constraint_10_0= ruleEConstraint ) )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==LeftParenthesis) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalOptimizationParser.g:2890:9: (lv_constraint_10_0= ruleEConstraint )
            	            {
            	            // InternalOptimizationParser.g:2890:9: (lv_constraint_10_0= ruleEConstraint )
            	            // InternalOptimizationParser.g:2891:10: lv_constraint_10_0= ruleEConstraint
            	            {

            	            										newCompositeNode(grammarAccess.getEHPCDataAccess().getConstraintEConstraintParserRuleCall_4_1_0());
            	            									
            	            pushFollow(FOLLOW_5);
            	            lv_constraint_10_0=ruleEConstraint();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getEHPCDataRule());
            	            										}
            	            										set(
            	            											current,
            	            											"constraint",
            	            											lv_constraint_10_0,
            	            											"org.sodalite.dsl.optimization.Optimization.EConstraint");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }

            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

            	    								newLeafNode(this_BEGIN_11, grammarAccess.getEHPCDataAccess().getBEGINTerminalRuleCall_4_2());
            	    							
            	    // InternalOptimizationParser.g:2912:8: ( (lv_etl_12_0= ruleEHPCETL ) )
            	    // InternalOptimizationParser.g:2913:9: (lv_etl_12_0= ruleEHPCETL )
            	    {
            	    // InternalOptimizationParser.g:2913:9: (lv_etl_12_0= ruleEHPCETL )
            	    // InternalOptimizationParser.g:2914:10: lv_etl_12_0= ruleEHPCETL
            	    {

            	    										newCompositeNode(grammarAccess.getEHPCDataAccess().getEtlEHPCETLParserRuleCall_4_3_0());
            	    									
            	    pushFollow(FOLLOW_7);
            	    lv_etl_12_0=ruleEHPCETL();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEHPCDataRule());
            	    										}
            	    										set(
            	    											current,
            	    											"etl",
            	    											lv_etl_12_0,
            	    											"org.sodalite.dsl.optimization.Optimization.EHPCETL");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_36); 

            	    								newLeafNode(this_END_13, grammarAccess.getEHPCDataAccess().getENDTerminalRuleCall_4_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalOptimizationParser.g:2951:1: entryRuleEHPCETL returns [EObject current=null] : iv_ruleEHPCETL= ruleEHPCETL EOF ;
    public final EObject entryRuleEHPCETL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCETL = null;


        try {
            // InternalOptimizationParser.g:2951:48: (iv_ruleEHPCETL= ruleEHPCETL EOF )
            // InternalOptimizationParser.g:2952:2: iv_ruleEHPCETL= ruleEHPCETL EOF
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
    // InternalOptimizationParser.g:2958:1: ruleEHPCETL returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEHPCETL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefetch_2_0=null;
        Token otherlv_3=null;
        Token lv_cache_4_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:2964:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:2965:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:2965:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:2966:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:2966:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:2967:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEHPCETLAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2970:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:2971:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:2971:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == Prefetch && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == Cache && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1) ) {
                    alt34=2;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOptimizationParser.g:2972:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2972:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2973:4: {...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2973:101: ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:2974:5: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2977:8: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:2977:9: {...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "true");
            	    }
            	    // InternalOptimizationParser.g:2977:18: (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:2977:19: otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_1=(Token)match(input,Prefetch,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEHPCETLAccess().getPrefetchKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:2981:8: ( (lv_prefetch_2_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:2982:9: (lv_prefetch_2_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:2982:9: (lv_prefetch_2_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:2983:10: lv_prefetch_2_0= RULE_BOOLEAN
            	    {
            	    lv_prefetch_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_40); 

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
            	    // InternalOptimizationParser.g:3005:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3005:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3006:4: {...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3006:101: ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:3007:5: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3010:8: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:3010:9: {...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "true");
            	    }
            	    // InternalOptimizationParser.g:3010:18: (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:3010:19: otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,Cache,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEHPCETLAccess().getCacheKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3014:8: ( (lv_cache_4_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:3015:9: (lv_cache_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:3015:9: (lv_cache_4_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:3016:10: lv_cache_4_0= RULE_BOOLEAN
            	    {
            	    lv_cache_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_40); 

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
            	    break loop34;
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
    // InternalOptimizationParser.g:3048:1: entryRuleEHPCBasedata returns [String current=null] : iv_ruleEHPCBasedata= ruleEHPCBasedata EOF ;
    public final String entryRuleEHPCBasedata() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEHPCBasedata = null;


        try {
            // InternalOptimizationParser.g:3048:52: (iv_ruleEHPCBasedata= ruleEHPCBasedata EOF )
            // InternalOptimizationParser.g:3049:2: iv_ruleEHPCBasedata= ruleEHPCBasedata EOF
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
    // InternalOptimizationParser.g:3055:1: ruleEHPCBasedata returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= IMAGE | kw= RESTART ) ;
    public final AntlrDatatypeRuleToken ruleEHPCBasedata() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3061:2: ( (kw= IMAGE | kw= RESTART ) )
            // InternalOptimizationParser.g:3062:2: (kw= IMAGE | kw= RESTART )
            {
            // InternalOptimizationParser.g:3062:2: (kw= IMAGE | kw= RESTART )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==IMAGE) ) {
                alt35=1;
            }
            else if ( (LA35_0==RESTART) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalOptimizationParser.g:3063:3: kw= IMAGE
                    {
                    kw=(Token)match(input,IMAGE,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEHPCBasedataAccess().getIMAGEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3069:3: kw= RESTART
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
    // InternalOptimizationParser.g:3078:1: entryRuleEMPI returns [EObject current=null] : iv_ruleEMPI= ruleEMPI EOF ;
    public final EObject entryRuleEMPI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMPI = null;


        try {
            // InternalOptimizationParser.g:3078:45: (iv_ruleEMPI= ruleEMPI EOF )
            // InternalOptimizationParser.g:3079:2: iv_ruleEMPI= ruleEMPI EOF
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
    // InternalOptimizationParser.g:3085:1: ruleEMPI returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalOptimizationParser.g:3091:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3092:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3092:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3093:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3093:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3094:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEMPIAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3097:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3098:5: ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3098:5: ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=6;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == Library && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1) ) {
                    alt36=2;
                }
                else if ( LA36_0 == Scaling_efficiency && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2) ) {
                    alt36=3;
                }
                else if ( LA36_0 == Core_subscription && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3) ) {
                    alt36=4;
                }
                else if ( LA36_0 == Message_size && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4) ) {
                    alt36=5;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalOptimizationParser.g:3099:3: ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3099:3: ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3100:4: {...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3100:98: ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) )
            	    // InternalOptimizationParser.g:3101:5: ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3104:8: ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) )
            	    // InternalOptimizationParser.g:3104:9: {...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3104:18: (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) )
            	    // InternalOptimizationParser.g:3104:19: otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) )
            	    {
            	    otherlv_1=(Token)match(input,Library,FOLLOW_55); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEMPIAccess().getLibraryKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3108:8: ( (lv_library_2_0= ruleEMPILibrary ) )
            	    // InternalOptimizationParser.g:3109:9: (lv_library_2_0= ruleEMPILibrary )
            	    {
            	    // InternalOptimizationParser.g:3109:9: (lv_library_2_0= ruleEMPILibrary )
            	    // InternalOptimizationParser.g:3110:10: lv_library_2_0= ruleEMPILibrary
            	    {

            	    										newCompositeNode(grammarAccess.getEMPIAccess().getLibraryEMPILibraryParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_56);
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
            	    // InternalOptimizationParser.g:3133:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3133:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3134:4: {...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3134:98: ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:3135:5: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3138:8: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:3138:9: {...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3138:18: (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:3138:19: otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Version,FOLLOW_23); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEMPIAccess().getVersionKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3142:8: ( (lv_version_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:3143:9: (lv_version_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:3143:9: (lv_version_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:3144:10: lv_version_4_0= RULE_STRING
            	    {
            	    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

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
            	    // InternalOptimizationParser.g:3166:3: ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3166:3: ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3167:4: {...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3167:98: ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) )
            	    // InternalOptimizationParser.g:3168:5: ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3171:8: ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) )
            	    // InternalOptimizationParser.g:3171:9: {...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3171:18: (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) )
            	    // InternalOptimizationParser.g:3171:19: otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Scaling_efficiency,FOLLOW_57); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEMPIAccess().getScaling_efficiencyKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3175:8: ( (lv_scaling_efficiency_6_0= ruleRealValue ) )
            	    // InternalOptimizationParser.g:3176:9: (lv_scaling_efficiency_6_0= ruleRealValue )
            	    {
            	    // InternalOptimizationParser.g:3176:9: (lv_scaling_efficiency_6_0= ruleRealValue )
            	    // InternalOptimizationParser.g:3177:10: lv_scaling_efficiency_6_0= ruleRealValue
            	    {

            	    										newCompositeNode(grammarAccess.getEMPIAccess().getScaling_efficiencyRealValueParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_56);
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
            	    // InternalOptimizationParser.g:3200:3: ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3200:3: ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3201:4: {...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:3201:98: ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3202:5: ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:3205:8: ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3205:9: {...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3205:18: (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3205:19: otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Core_subscription,FOLLOW_35); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEMPIAccess().getCore_subscriptionKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:3209:8: ( (lv_core_subscription_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3210:9: (lv_core_subscription_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3210:9: (lv_core_subscription_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:3211:10: lv_core_subscription_8_0= RULE_INT
            	    {
            	    lv_core_subscription_8_0=(Token)match(input,RULE_INT,FOLLOW_56); 

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
            	    // InternalOptimizationParser.g:3233:3: ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3233:3: ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3234:4: {...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:3234:98: ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) )
            	    // InternalOptimizationParser.g:3235:5: ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:3238:8: ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) )
            	    // InternalOptimizationParser.g:3238:9: {...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3238:18: (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) )
            	    // InternalOptimizationParser.g:3238:19: otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) )
            	    {
            	    otherlv_9=(Token)match(input,Message_size,FOLLOW_58); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEMPIAccess().getMessage_sizeKeyword_4_0());
            	    							
            	    // InternalOptimizationParser.g:3242:8: ( (lv_message_size_10_0= ruleEMPIMessageSize ) )
            	    // InternalOptimizationParser.g:3243:9: (lv_message_size_10_0= ruleEMPIMessageSize )
            	    {
            	    // InternalOptimizationParser.g:3243:9: (lv_message_size_10_0= ruleEMPIMessageSize )
            	    // InternalOptimizationParser.g:3244:10: lv_message_size_10_0= ruleEMPIMessageSize
            	    {

            	    										newCompositeNode(grammarAccess.getEMPIAccess().getMessage_sizeEMPIMessageSizeParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_56);
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
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // InternalOptimizationParser.g:3278:1: entryRuleEMPILibrary returns [String current=null] : iv_ruleEMPILibrary= ruleEMPILibrary EOF ;
    public final String entryRuleEMPILibrary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMPILibrary = null;


        try {
            // InternalOptimizationParser.g:3278:51: (iv_ruleEMPILibrary= ruleEMPILibrary EOF )
            // InternalOptimizationParser.g:3279:2: iv_ruleEMPILibrary= ruleEMPILibrary EOF
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
    // InternalOptimizationParser.g:3285:1: ruleEMPILibrary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Mvapch | kw= Opnmpi ) ;
    public final AntlrDatatypeRuleToken ruleEMPILibrary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3291:2: ( (kw= Mvapch | kw= Opnmpi ) )
            // InternalOptimizationParser.g:3292:2: (kw= Mvapch | kw= Opnmpi )
            {
            // InternalOptimizationParser.g:3292:2: (kw= Mvapch | kw= Opnmpi )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Mvapch) ) {
                alt37=1;
            }
            else if ( (LA37_0==Opnmpi) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalOptimizationParser.g:3293:3: kw= Mvapch
                    {
                    kw=(Token)match(input,Mvapch,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPILibraryAccess().getMvapchKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3299:3: kw= Opnmpi
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
    // InternalOptimizationParser.g:3308:1: entryRuleEMPIMessageSize returns [String current=null] : iv_ruleEMPIMessageSize= ruleEMPIMessageSize EOF ;
    public final String entryRuleEMPIMessageSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMPIMessageSize = null;


        try {
            // InternalOptimizationParser.g:3308:55: (iv_ruleEMPIMessageSize= ruleEMPIMessageSize EOF )
            // InternalOptimizationParser.g:3309:2: iv_ruleEMPIMessageSize= ruleEMPIMessageSize EOF
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
    // InternalOptimizationParser.g:3315:1: ruleEMPIMessageSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Small | kw= Medium | kw= Large ) ;
    public final AntlrDatatypeRuleToken ruleEMPIMessageSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3321:2: ( (kw= Small | kw= Medium | kw= Large ) )
            // InternalOptimizationParser.g:3322:2: (kw= Small | kw= Medium | kw= Large )
            {
            // InternalOptimizationParser.g:3322:2: (kw= Small | kw= Medium | kw= Large )
            int alt38=3;
            switch ( input.LA(1) ) {
            case Small:
                {
                alt38=1;
                }
                break;
            case Medium:
                {
                alt38=2;
                }
                break;
            case Large:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalOptimizationParser.g:3323:3: kw= Small
                    {
                    kw=(Token)match(input,Small,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPIMessageSizeAccess().getSmallKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3329:3: kw= Medium
                    {
                    kw=(Token)match(input,Medium,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPIMessageSizeAccess().getMediumKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:3335:3: kw= Large
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
    // InternalOptimizationParser.g:3344:1: entryRuleEOPENMP returns [EObject current=null] : iv_ruleEOPENMP= ruleEOPENMP EOF ;
    public final EObject entryRuleEOPENMP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENMP = null;


        try {
            // InternalOptimizationParser.g:3344:48: (iv_ruleEOPENMP= ruleEOPENMP EOF )
            // InternalOptimizationParser.g:3345:2: iv_ruleEOPENMP= ruleEOPENMP EOF
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
    // InternalOptimizationParser.g:3351:1: ruleEOPENMP returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalOptimizationParser.g:3357:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3358:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3358:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3359:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3359:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3360:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOPENMPAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3363:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3364:5: ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3364:5: ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=4;
                int LA39_0 = input.LA(1);

                if ( LA39_0 == Number_of_threads && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 == Scaling_efficiency && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1) ) {
                    alt39=2;
                }
                else if ( LA39_0 == Affinity && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2) ) {
                    alt39=3;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalOptimizationParser.g:3365:3: ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3365:3: ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3366:4: {...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3366:101: ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3367:5: ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3370:8: ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3370:9: {...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "true");
            	    }
            	    // InternalOptimizationParser.g:3370:18: (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3370:19: otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,Number_of_threads,FOLLOW_35); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOPENMPAccess().getNumber_of_threadsKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3374:8: ( (lv_number_of_threads_2_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3375:9: (lv_number_of_threads_2_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3375:9: (lv_number_of_threads_2_0= RULE_INT )
            	    // InternalOptimizationParser.g:3376:10: lv_number_of_threads_2_0= RULE_INT
            	    {
            	    lv_number_of_threads_2_0=(Token)match(input,RULE_INT,FOLLOW_59); 

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
            	    // InternalOptimizationParser.g:3398:3: ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3398:3: ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3399:4: {...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3399:101: ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) )
            	    // InternalOptimizationParser.g:3400:5: ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3403:8: ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) )
            	    // InternalOptimizationParser.g:3403:9: {...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "true");
            	    }
            	    // InternalOptimizationParser.g:3403:18: (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) )
            	    // InternalOptimizationParser.g:3403:19: otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Scaling_efficiency,FOLLOW_57); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOPENMPAccess().getScaling_efficiencyKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3407:8: ( (lv_scaling_efficiency_4_0= ruleRealValue ) )
            	    // InternalOptimizationParser.g:3408:9: (lv_scaling_efficiency_4_0= ruleRealValue )
            	    {
            	    // InternalOptimizationParser.g:3408:9: (lv_scaling_efficiency_4_0= ruleRealValue )
            	    // InternalOptimizationParser.g:3409:10: lv_scaling_efficiency_4_0= ruleRealValue
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENMPAccess().getScaling_efficiencyRealValueParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_59);
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
            	    // InternalOptimizationParser.g:3432:3: ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3432:3: ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3433:4: {...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3433:101: ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) )
            	    // InternalOptimizationParser.g:3434:5: ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3437:8: ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) )
            	    // InternalOptimizationParser.g:3437:9: {...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "true");
            	    }
            	    // InternalOptimizationParser.g:3437:18: (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) )
            	    // InternalOptimizationParser.g:3437:19: otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) )
            	    {
            	    otherlv_5=(Token)match(input,Affinity,FOLLOW_60); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEOPENMPAccess().getAffinityKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3441:8: ( (lv_affinity_6_0= ruleEOPENAffinity ) )
            	    // InternalOptimizationParser.g:3442:9: (lv_affinity_6_0= ruleEOPENAffinity )
            	    {
            	    // InternalOptimizationParser.g:3442:9: (lv_affinity_6_0= ruleEOPENAffinity )
            	    // InternalOptimizationParser.g:3443:10: lv_affinity_6_0= ruleEOPENAffinity
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENMPAccess().getAffinityEOPENAffinityParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_59);
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
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
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
    // InternalOptimizationParser.g:3477:1: entryRuleEOPENAffinity returns [String current=null] : iv_ruleEOPENAffinity= ruleEOPENAffinity EOF ;
    public final String entryRuleEOPENAffinity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOPENAffinity = null;


        try {
            // InternalOptimizationParser.g:3477:53: (iv_ruleEOPENAffinity= ruleEOPENAffinity EOF )
            // InternalOptimizationParser.g:3478:2: iv_ruleEOPENAffinity= ruleEOPENAffinity EOF
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
    // InternalOptimizationParser.g:3484:1: ruleEOPENAffinity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Block | kw= Simple ) ;
    public final AntlrDatatypeRuleToken ruleEOPENAffinity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3490:2: ( (kw= Block | kw= Simple ) )
            // InternalOptimizationParser.g:3491:2: (kw= Block | kw= Simple )
            {
            // InternalOptimizationParser.g:3491:2: (kw= Block | kw= Simple )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Block) ) {
                alt40=1;
            }
            else if ( (LA40_0==Simple) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalOptimizationParser.g:3492:3: kw= Block
                    {
                    kw=(Token)match(input,Block,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEOPENAffinityAccess().getBlockKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3498:3: kw= Simple
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
    // InternalOptimizationParser.g:3507:1: entryRuleEOPENACC returns [EObject current=null] : iv_ruleEOPENACC= ruleEOPENACC EOF ;
    public final EObject entryRuleEOPENACC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENACC = null;


        try {
            // InternalOptimizationParser.g:3507:49: (iv_ruleEOPENACC= ruleEOPENACC EOF )
            // InternalOptimizationParser.g:3508:2: iv_ruleEOPENACC= ruleEOPENACC EOF
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
    // InternalOptimizationParser.g:3514:1: ruleEOPENACC returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalOptimizationParser.g:3520:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3521:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3521:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3522:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3522:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3523:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOPENACCAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3526:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3527:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3527:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=4;
                int LA41_0 = input.LA(1);

                if ( LA41_0 == Compiler && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0) ) {
                    alt41=1;
                }
                else if ( LA41_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1) ) {
                    alt41=2;
                }
                else if ( LA41_0 == Number_of_acc && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2) ) {
                    alt41=3;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalOptimizationParser.g:3528:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3528:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3529:4: {...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3529:102: ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    // InternalOptimizationParser.g:3530:5: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3533:8: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    // InternalOptimizationParser.g:3533:9: {...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "true");
            	    }
            	    // InternalOptimizationParser.g:3533:18: (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    // InternalOptimizationParser.g:3533:19: otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) )
            	    {
            	    otherlv_1=(Token)match(input,Compiler,FOLLOW_61); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOPENACCAccess().getCompilerKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3537:8: ( (lv_compiler_2_0= ruleECompiler ) )
            	    // InternalOptimizationParser.g:3538:9: (lv_compiler_2_0= ruleECompiler )
            	    {
            	    // InternalOptimizationParser.g:3538:9: (lv_compiler_2_0= ruleECompiler )
            	    // InternalOptimizationParser.g:3539:10: lv_compiler_2_0= ruleECompiler
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENACCAccess().getCompilerECompilerParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_62);
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
            	    // InternalOptimizationParser.g:3562:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3562:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3563:4: {...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3563:102: ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:3564:5: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3567:8: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:3567:9: {...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "true");
            	    }
            	    // InternalOptimizationParser.g:3567:18: (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:3567:19: otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Version,FOLLOW_23); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOPENACCAccess().getVersionKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3571:8: ( (lv_version_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:3572:9: (lv_version_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:3572:9: (lv_version_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:3573:10: lv_version_4_0= RULE_STRING
            	    {
            	    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

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
            	    // InternalOptimizationParser.g:3595:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3595:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3596:4: {...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3596:102: ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3597:5: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3600:8: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3600:9: {...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "true");
            	    }
            	    // InternalOptimizationParser.g:3600:18: (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3600:19: otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Number_of_acc,FOLLOW_35); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEOPENACCAccess().getNumber_of_accKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3604:8: ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3605:9: (lv_number_of_acc_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3605:9: (lv_number_of_acc_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:3606:10: lv_number_of_acc_6_0= RULE_INT
            	    {
            	    lv_number_of_acc_6_0=(Token)match(input,RULE_INT,FOLLOW_62); 

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
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
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
    // InternalOptimizationParser.g:3639:1: entryRuleEOPENCL returns [EObject current=null] : iv_ruleEOPENCL= ruleEOPENCL EOF ;
    public final EObject entryRuleEOPENCL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENCL = null;


        try {
            // InternalOptimizationParser.g:3639:48: (iv_ruleEOPENCL= ruleEOPENCL EOF )
            // InternalOptimizationParser.g:3640:2: iv_ruleEOPENCL= ruleEOPENCL EOF
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
    // InternalOptimizationParser.g:3646:1: ruleEOPENCL returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalOptimizationParser.g:3652:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3653:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3653:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3654:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3654:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3655:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOPENCLAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3658:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3659:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3659:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=4;
                int LA42_0 = input.LA(1);

                if ( LA42_0 == Compiler && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1) ) {
                    alt42=2;
                }
                else if ( LA42_0 == Number_of_acc && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2) ) {
                    alt42=3;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalOptimizationParser.g:3660:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3660:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3661:4: {...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3661:101: ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    // InternalOptimizationParser.g:3662:5: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3665:8: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    // InternalOptimizationParser.g:3665:9: {...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "true");
            	    }
            	    // InternalOptimizationParser.g:3665:18: (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    // InternalOptimizationParser.g:3665:19: otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) )
            	    {
            	    otherlv_1=(Token)match(input,Compiler,FOLLOW_61); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOPENCLAccess().getCompilerKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3669:8: ( (lv_compiler_2_0= ruleECompiler ) )
            	    // InternalOptimizationParser.g:3670:9: (lv_compiler_2_0= ruleECompiler )
            	    {
            	    // InternalOptimizationParser.g:3670:9: (lv_compiler_2_0= ruleECompiler )
            	    // InternalOptimizationParser.g:3671:10: lv_compiler_2_0= ruleECompiler
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENCLAccess().getCompilerECompilerParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_62);
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
            	    // InternalOptimizationParser.g:3694:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3694:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3695:4: {...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3695:101: ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:3696:5: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3699:8: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:3699:9: {...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "true");
            	    }
            	    // InternalOptimizationParser.g:3699:18: (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:3699:19: otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Version,FOLLOW_23); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOPENCLAccess().getVersionKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3703:8: ( (lv_version_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:3704:9: (lv_version_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:3704:9: (lv_version_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:3705:10: lv_version_4_0= RULE_STRING
            	    {
            	    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

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
            	    // InternalOptimizationParser.g:3727:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3727:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3728:4: {...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3728:101: ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3729:5: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3732:8: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3732:9: {...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "true");
            	    }
            	    // InternalOptimizationParser.g:3732:18: (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3732:19: otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Number_of_acc,FOLLOW_35); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEOPENCLAccess().getNumber_of_accKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3736:8: ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3737:9: (lv_number_of_acc_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3737:9: (lv_number_of_acc_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:3738:10: lv_number_of_acc_6_0= RULE_INT
            	    {
            	    lv_number_of_acc_6_0=(Token)match(input,RULE_INT,FOLLOW_62); 

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
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
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
    // InternalOptimizationParser.g:3771:1: entryRuleECompiler returns [String current=null] : iv_ruleECompiler= ruleECompiler EOF ;
    public final String entryRuleECompiler() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleECompiler = null;


        try {
            // InternalOptimizationParser.g:3771:49: (iv_ruleECompiler= ruleECompiler EOF )
            // InternalOptimizationParser.g:3772:2: iv_ruleECompiler= ruleECompiler EOF
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
    // InternalOptimizationParser.g:3778:1: ruleECompiler returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Pgi | kw= Cray ) ;
    public final AntlrDatatypeRuleToken ruleECompiler() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3784:2: ( (kw= Pgi | kw= Cray ) )
            // InternalOptimizationParser.g:3785:2: (kw= Pgi | kw= Cray )
            {
            // InternalOptimizationParser.g:3785:2: (kw= Pgi | kw= Cray )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Pgi) ) {
                alt43=1;
            }
            else if ( (LA43_0==Cray) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalOptimizationParser.g:3786:3: kw= Pgi
                    {
                    kw=(Token)match(input,Pgi,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECompilerAccess().getPgiKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3792:3: kw= Cray
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


    // $ANTLR start "entryRuleEConstraint"
    // InternalOptimizationParser.g:3801:1: entryRuleEConstraint returns [EObject current=null] : iv_ruleEConstraint= ruleEConstraint EOF ;
    public final EObject entryRuleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraint = null;


        try {
            // InternalOptimizationParser.g:3801:52: (iv_ruleEConstraint= ruleEConstraint EOF )
            // InternalOptimizationParser.g:3802:2: iv_ruleEConstraint= ruleEConstraint EOF
            {
             newCompositeNode(grammarAccess.getEConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConstraint=ruleEConstraint();

            state._fsp--;

             current =iv_ruleEConstraint; 
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
    // $ANTLR end "entryRuleEConstraint"


    // $ANTLR start "ruleEConstraint"
    // InternalOptimizationParser.g:3808:1: ruleEConstraint returns [EObject current=null] : ( () (otherlv_1= LeftParenthesis )+ otherlv_2= Constraint ( (lv_statements_3_0= ruleEStatement ) ) ( ( (lv_logicOpers_4_0= ruleELogicOper ) ) ( (lv_statements_5_0= ruleEStatement ) ) )* otherlv_6= RightParenthesis ) ;
    public final EObject ruleEConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_statements_3_0 = null;

        AntlrDatatypeRuleToken lv_logicOpers_4_0 = null;

        EObject lv_statements_5_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:3814:2: ( ( () (otherlv_1= LeftParenthesis )+ otherlv_2= Constraint ( (lv_statements_3_0= ruleEStatement ) ) ( ( (lv_logicOpers_4_0= ruleELogicOper ) ) ( (lv_statements_5_0= ruleEStatement ) ) )* otherlv_6= RightParenthesis ) )
            // InternalOptimizationParser.g:3815:2: ( () (otherlv_1= LeftParenthesis )+ otherlv_2= Constraint ( (lv_statements_3_0= ruleEStatement ) ) ( ( (lv_logicOpers_4_0= ruleELogicOper ) ) ( (lv_statements_5_0= ruleEStatement ) ) )* otherlv_6= RightParenthesis )
            {
            // InternalOptimizationParser.g:3815:2: ( () (otherlv_1= LeftParenthesis )+ otherlv_2= Constraint ( (lv_statements_3_0= ruleEStatement ) ) ( ( (lv_logicOpers_4_0= ruleELogicOper ) ) ( (lv_statements_5_0= ruleEStatement ) ) )* otherlv_6= RightParenthesis )
            // InternalOptimizationParser.g:3816:3: () (otherlv_1= LeftParenthesis )+ otherlv_2= Constraint ( (lv_statements_3_0= ruleEStatement ) ) ( ( (lv_logicOpers_4_0= ruleELogicOper ) ) ( (lv_statements_5_0= ruleEStatement ) ) )* otherlv_6= RightParenthesis
            {
            // InternalOptimizationParser.g:3816:3: ()
            // InternalOptimizationParser.g:3817:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConstraintAccess().getEConstraintAction_0(),
            					current);
            			

            }

            // InternalOptimizationParser.g:3823:3: (otherlv_1= LeftParenthesis )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==LeftParenthesis) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalOptimizationParser.g:3824:4: otherlv_1= LeftParenthesis
            	    {
            	    otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_63); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEConstraintAccess().getLeftParenthesisKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            otherlv_2=(Token)match(input,Constraint,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getEConstraintAccess().getConstraintKeyword_2());
            		
            // InternalOptimizationParser.g:3833:3: ( (lv_statements_3_0= ruleEStatement ) )
            // InternalOptimizationParser.g:3834:4: (lv_statements_3_0= ruleEStatement )
            {
            // InternalOptimizationParser.g:3834:4: (lv_statements_3_0= ruleEStatement )
            // InternalOptimizationParser.g:3835:5: lv_statements_3_0= ruleEStatement
            {

            					newCompositeNode(grammarAccess.getEConstraintAccess().getStatementsEStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_64);
            lv_statements_3_0=ruleEStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEConstraintRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_3_0,
            						"org.sodalite.dsl.optimization.Optimization.EStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOptimizationParser.g:3852:3: ( ( (lv_logicOpers_4_0= ruleELogicOper ) ) ( (lv_statements_5_0= ruleEStatement ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=RULE_OR && LA45_0<=RULE_AND)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalOptimizationParser.g:3853:4: ( (lv_logicOpers_4_0= ruleELogicOper ) ) ( (lv_statements_5_0= ruleEStatement ) )
            	    {
            	    // InternalOptimizationParser.g:3853:4: ( (lv_logicOpers_4_0= ruleELogicOper ) )
            	    // InternalOptimizationParser.g:3854:5: (lv_logicOpers_4_0= ruleELogicOper )
            	    {
            	    // InternalOptimizationParser.g:3854:5: (lv_logicOpers_4_0= ruleELogicOper )
            	    // InternalOptimizationParser.g:3855:6: lv_logicOpers_4_0= ruleELogicOper
            	    {

            	    						newCompositeNode(grammarAccess.getEConstraintAccess().getLogicOpersELogicOperParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_logicOpers_4_0=ruleELogicOper();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEConstraintRule());
            	    						}
            	    						add(
            	    							current,
            	    							"logicOpers",
            	    							lv_logicOpers_4_0,
            	    							"org.sodalite.dsl.optimization.Optimization.ELogicOper");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalOptimizationParser.g:3872:4: ( (lv_statements_5_0= ruleEStatement ) )
            	    // InternalOptimizationParser.g:3873:5: (lv_statements_5_0= ruleEStatement )
            	    {
            	    // InternalOptimizationParser.g:3873:5: (lv_statements_5_0= ruleEStatement )
            	    // InternalOptimizationParser.g:3874:6: lv_statements_5_0= ruleEStatement
            	    {

            	    						newCompositeNode(grammarAccess.getEConstraintAccess().getStatementsEStatementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_64);
            	    lv_statements_5_0=ruleEStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEConstraintRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_5_0,
            	    							"org.sodalite.dsl.optimization.Optimization.EStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEConstraintAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleEConstraint"


    // $ANTLR start "entryRuleELogicOper"
    // InternalOptimizationParser.g:3900:1: entryRuleELogicOper returns [String current=null] : iv_ruleELogicOper= ruleELogicOper EOF ;
    public final String entryRuleELogicOper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELogicOper = null;


        try {
            // InternalOptimizationParser.g:3900:50: (iv_ruleELogicOper= ruleELogicOper EOF )
            // InternalOptimizationParser.g:3901:2: iv_ruleELogicOper= ruleELogicOper EOF
            {
             newCompositeNode(grammarAccess.getELogicOperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELogicOper=ruleELogicOper();

            state._fsp--;

             current =iv_ruleELogicOper.getText(); 
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
    // $ANTLR end "entryRuleELogicOper"


    // $ANTLR start "ruleELogicOper"
    // InternalOptimizationParser.g:3907:1: ruleELogicOper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_OR_0= RULE_OR | this_AND_1= RULE_AND ) ;
    public final AntlrDatatypeRuleToken ruleELogicOper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_OR_0=null;
        Token this_AND_1=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3913:2: ( (this_OR_0= RULE_OR | this_AND_1= RULE_AND ) )
            // InternalOptimizationParser.g:3914:2: (this_OR_0= RULE_OR | this_AND_1= RULE_AND )
            {
            // InternalOptimizationParser.g:3914:2: (this_OR_0= RULE_OR | this_AND_1= RULE_AND )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_OR) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_AND) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalOptimizationParser.g:3915:3: this_OR_0= RULE_OR
                    {
                    this_OR_0=(Token)match(input,RULE_OR,FOLLOW_2); 

                    			current.merge(this_OR_0);
                    		

                    			newLeafNode(this_OR_0, grammarAccess.getELogicOperAccess().getORTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3923:3: this_AND_1= RULE_AND
                    {
                    this_AND_1=(Token)match(input,RULE_AND,FOLLOW_2); 

                    			current.merge(this_AND_1);
                    		

                    			newLeafNode(this_AND_1, grammarAccess.getELogicOperAccess().getANDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleELogicOper"


    // $ANTLR start "entryRuleEStatement"
    // InternalOptimizationParser.g:3934:1: entryRuleEStatement returns [EObject current=null] : iv_ruleEStatement= ruleEStatement EOF ;
    public final EObject entryRuleEStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStatement = null;


        try {
            // InternalOptimizationParser.g:3934:51: (iv_ruleEStatement= ruleEStatement EOF )
            // InternalOptimizationParser.g:3935:2: iv_ruleEStatement= ruleEStatement EOF
            {
             newCompositeNode(grammarAccess.getEStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEStatement=ruleEStatement();

            state._fsp--;

             current =iv_ruleEStatement; 
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
    // $ANTLR end "entryRuleEStatement"


    // $ANTLR start "ruleEStatement"
    // InternalOptimizationParser.g:3941:1: ruleEStatement returns [EObject current=null] : ( ( (lv_property_0_0= RULE_STRING ) ) ( (lv_operator_1_0= ruleEComparisonOperator ) ) ( (lv_value_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEStatement() throws RecognitionException {
        EObject current = null;

        Token lv_property_0_0=null;
        AntlrDatatypeRuleToken lv_operator_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:3947:2: ( ( ( (lv_property_0_0= RULE_STRING ) ) ( (lv_operator_1_0= ruleEComparisonOperator ) ) ( (lv_value_2_0= ruleEValue ) ) ) )
            // InternalOptimizationParser.g:3948:2: ( ( (lv_property_0_0= RULE_STRING ) ) ( (lv_operator_1_0= ruleEComparisonOperator ) ) ( (lv_value_2_0= ruleEValue ) ) )
            {
            // InternalOptimizationParser.g:3948:2: ( ( (lv_property_0_0= RULE_STRING ) ) ( (lv_operator_1_0= ruleEComparisonOperator ) ) ( (lv_value_2_0= ruleEValue ) ) )
            // InternalOptimizationParser.g:3949:3: ( (lv_property_0_0= RULE_STRING ) ) ( (lv_operator_1_0= ruleEComparisonOperator ) ) ( (lv_value_2_0= ruleEValue ) )
            {
            // InternalOptimizationParser.g:3949:3: ( (lv_property_0_0= RULE_STRING ) )
            // InternalOptimizationParser.g:3950:4: (lv_property_0_0= RULE_STRING )
            {
            // InternalOptimizationParser.g:3950:4: (lv_property_0_0= RULE_STRING )
            // InternalOptimizationParser.g:3951:5: lv_property_0_0= RULE_STRING
            {
            lv_property_0_0=(Token)match(input,RULE_STRING,FOLLOW_65); 

            					newLeafNode(lv_property_0_0, grammarAccess.getEStatementAccess().getPropertySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"property",
            						lv_property_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalOptimizationParser.g:3967:3: ( (lv_operator_1_0= ruleEComparisonOperator ) )
            // InternalOptimizationParser.g:3968:4: (lv_operator_1_0= ruleEComparisonOperator )
            {
            // InternalOptimizationParser.g:3968:4: (lv_operator_1_0= ruleEComparisonOperator )
            // InternalOptimizationParser.g:3969:5: lv_operator_1_0= ruleEComparisonOperator
            {

            					newCompositeNode(grammarAccess.getEStatementAccess().getOperatorEComparisonOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_57);
            lv_operator_1_0=ruleEComparisonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEStatementRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.sodalite.dsl.optimization.Optimization.EComparisonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalOptimizationParser.g:3986:3: ( (lv_value_2_0= ruleEValue ) )
            // InternalOptimizationParser.g:3987:4: (lv_value_2_0= ruleEValue )
            {
            // InternalOptimizationParser.g:3987:4: (lv_value_2_0= ruleEValue )
            // InternalOptimizationParser.g:3988:5: lv_value_2_0= ruleEValue
            {

            					newCompositeNode(grammarAccess.getEStatementAccess().getValueEValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.sodalite.dsl.optimization.Optimization.EValue");
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
    // $ANTLR end "ruleEStatement"


    // $ANTLR start "entryRuleEValue"
    // InternalOptimizationParser.g:4009:1: entryRuleEValue returns [String current=null] : iv_ruleEValue= ruleEValue EOF ;
    public final String entryRuleEValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEValue = null;


        try {
            // InternalOptimizationParser.g:4009:46: (iv_ruleEValue= ruleEValue EOF )
            // InternalOptimizationParser.g:4010:2: iv_ruleEValue= ruleEValue EOF
            {
             newCompositeNode(grammarAccess.getEValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValue=ruleEValue();

            state._fsp--;

             current =iv_ruleEValue.getText(); 
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
    // $ANTLR end "entryRuleEValue"


    // $ANTLR start "ruleEValue"
    // InternalOptimizationParser.g:4016:1: ruleEValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_RealValue_1= ruleRealValue ) ;
    public final AntlrDatatypeRuleToken ruleEValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        AntlrDatatypeRuleToken this_RealValue_1 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:4022:2: ( (this_INT_0= RULE_INT | this_RealValue_1= ruleRealValue ) )
            // InternalOptimizationParser.g:4023:2: (this_INT_0= RULE_INT | this_RealValue_1= ruleRealValue )
            {
            // InternalOptimizationParser.g:4023:2: (this_INT_0= RULE_INT | this_RealValue_1= ruleRealValue )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==EOF||LA47_1==RightParenthesis||(LA47_1>=RULE_OR && LA47_1<=RULE_AND)) ) {
                    alt47=1;
                }
                else if ( (LA47_1==FullStop) ) {
                    alt47=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA47_0==FullStop) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalOptimizationParser.g:4024:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getEValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:4032:3: this_RealValue_1= ruleRealValue
                    {

                    			newCompositeNode(grammarAccess.getEValueAccess().getRealValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealValue_1=ruleRealValue();

                    state._fsp--;


                    			current.merge(this_RealValue_1);
                    		

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
    // $ANTLR end "ruleEValue"


    // $ANTLR start "entryRuleEComparisonOperator"
    // InternalOptimizationParser.g:4046:1: entryRuleEComparisonOperator returns [String current=null] : iv_ruleEComparisonOperator= ruleEComparisonOperator EOF ;
    public final String entryRuleEComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEComparisonOperator = null;


        try {
            // InternalOptimizationParser.g:4046:59: (iv_ruleEComparisonOperator= ruleEComparisonOperator EOF )
            // InternalOptimizationParser.g:4047:2: iv_ruleEComparisonOperator= ruleEComparisonOperator EOF
            {
             newCompositeNode(grammarAccess.getEComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEComparisonOperator=ruleEComparisonOperator();

            state._fsp--;

             current =iv_ruleEComparisonOperator.getText(); 
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
    // $ANTLR end "entryRuleEComparisonOperator"


    // $ANTLR start "ruleEComparisonOperator"
    // InternalOptimizationParser.g:4053:1: ruleEComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BT_0= RULE_BT | this_LT_1= RULE_LT | this_BET_2= RULE_BET | this_LET_3= RULE_LET | this_EQUAL_4= RULE_EQUAL | this_NOT_EQUAL_5= RULE_NOT_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleEComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BT_0=null;
        Token this_LT_1=null;
        Token this_BET_2=null;
        Token this_LET_3=null;
        Token this_EQUAL_4=null;
        Token this_NOT_EQUAL_5=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:4059:2: ( (this_BT_0= RULE_BT | this_LT_1= RULE_LT | this_BET_2= RULE_BET | this_LET_3= RULE_LET | this_EQUAL_4= RULE_EQUAL | this_NOT_EQUAL_5= RULE_NOT_EQUAL ) )
            // InternalOptimizationParser.g:4060:2: (this_BT_0= RULE_BT | this_LT_1= RULE_LT | this_BET_2= RULE_BET | this_LET_3= RULE_LET | this_EQUAL_4= RULE_EQUAL | this_NOT_EQUAL_5= RULE_NOT_EQUAL )
            {
            // InternalOptimizationParser.g:4060:2: (this_BT_0= RULE_BT | this_LT_1= RULE_LT | this_BET_2= RULE_BET | this_LET_3= RULE_LET | this_EQUAL_4= RULE_EQUAL | this_NOT_EQUAL_5= RULE_NOT_EQUAL )
            int alt48=6;
            switch ( input.LA(1) ) {
            case RULE_BT:
                {
                alt48=1;
                }
                break;
            case RULE_LT:
                {
                alt48=2;
                }
                break;
            case RULE_BET:
                {
                alt48=3;
                }
                break;
            case RULE_LET:
                {
                alt48=4;
                }
                break;
            case RULE_EQUAL:
                {
                alt48=5;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt48=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalOptimizationParser.g:4061:3: this_BT_0= RULE_BT
                    {
                    this_BT_0=(Token)match(input,RULE_BT,FOLLOW_2); 

                    			current.merge(this_BT_0);
                    		

                    			newLeafNode(this_BT_0, grammarAccess.getEComparisonOperatorAccess().getBTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:4069:3: this_LT_1= RULE_LT
                    {
                    this_LT_1=(Token)match(input,RULE_LT,FOLLOW_2); 

                    			current.merge(this_LT_1);
                    		

                    			newLeafNode(this_LT_1, grammarAccess.getEComparisonOperatorAccess().getLTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:4077:3: this_BET_2= RULE_BET
                    {
                    this_BET_2=(Token)match(input,RULE_BET,FOLLOW_2); 

                    			current.merge(this_BET_2);
                    		

                    			newLeafNode(this_BET_2, grammarAccess.getEComparisonOperatorAccess().getBETTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:4085:3: this_LET_3= RULE_LET
                    {
                    this_LET_3=(Token)match(input,RULE_LET,FOLLOW_2); 

                    			current.merge(this_LET_3);
                    		

                    			newLeafNode(this_LET_3, grammarAccess.getEComparisonOperatorAccess().getLETTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOptimizationParser.g:4093:3: this_EQUAL_4= RULE_EQUAL
                    {
                    this_EQUAL_4=(Token)match(input,RULE_EQUAL,FOLLOW_2); 

                    			current.merge(this_EQUAL_4);
                    		

                    			newLeafNode(this_EQUAL_4, grammarAccess.getEComparisonOperatorAccess().getEQUALTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalOptimizationParser.g:4101:3: this_NOT_EQUAL_5= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_5=(Token)match(input,RULE_NOT_EQUAL,FOLLOW_2); 

                    			current.merge(this_NOT_EQUAL_5);
                    		

                    			newLeafNode(this_NOT_EQUAL_5, grammarAccess.getEComparisonOperatorAccess().getNOT_EQUALTerminalRuleCall_5());
                    		

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
    // $ANTLR end "ruleEComparisonOperator"


    // $ANTLR start "entryRuleREAL"
    // InternalOptimizationParser.g:4112:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalOptimizationParser.g:4114:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalOptimizationParser.g:4115:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalOptimizationParser.g:4124:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_EXT_INT_2=null;
        Token this_INT_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalOptimizationParser.g:4131:2: ( ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) ) )
            // InternalOptimizationParser.g:4132:2: ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )
            {
            // InternalOptimizationParser.g:4132:2: ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )
            // InternalOptimizationParser.g:4133:3: (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
            {
            // InternalOptimizationParser.g:4133:3: (this_INT_0= RULE_INT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalOptimizationParser.g:4134:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_66); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,FullStop,FOLLOW_67); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            // InternalOptimizationParser.g:4147:3: (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_EXT_INT) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_INT) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalOptimizationParser.g:4148:4: this_EXT_INT_2= RULE_EXT_INT
                    {
                    this_EXT_INT_2=(Token)match(input,RULE_EXT_INT,FOLLOW_2); 

                    				current.merge(this_EXT_INT_2);
                    			

                    				newLeafNode(this_EXT_INT_2, grammarAccess.getREALAccess().getEXT_INTTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:4156:4: this_INT_3= RULE_INT
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
    // InternalOptimizationParser.g:4171:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalOptimizationParser.g:4171:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalOptimizationParser.g:4172:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalOptimizationParser.g:4178:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_REAL_0= ruleREAL ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_REAL_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:4184:2: (this_REAL_0= ruleREAL )
            // InternalOptimizationParser.g:4185:2: this_REAL_0= ruleREAL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000000240000L,0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000042080000L,0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00D0200000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040000000000L,0x0000000001800200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001080000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008001800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001080000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0100010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000004010020L,0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x1000002400000000L,0x0000040000084000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x4000400008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L,0x0000040000001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L,0x0000040000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000880000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004000020000000L,0x0000000000020140L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000004010022L,0x0000000000010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010009050L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000004010022L,0x0000000010010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000002400000002L,0x0000000000084000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0800004000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800004000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000880000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000800000000002L,0x0000000010400000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000002L,0x0000000010001000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00D0200000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00D0200000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800800004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000100000480L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000900000020180L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0602000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000900000020182L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000100080000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x8000000000000000L,0x000000000000A000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000100000482L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000404L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000008040000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000800800004002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000400000L,0x0000000010000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000018020000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000007E00000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});

}
