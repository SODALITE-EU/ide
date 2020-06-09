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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Reinforncement_learning", "Distributed_training", "Image_classification", "Scaling_efficiency", "Core_subscription", "Enable_autotuning", "Number_of_threads", "Enable_opt_build", "Object_detection", "Parallelisation", "Number_of_acc", "Recommendation", "Ai_framework", "Message_size", "AI_Inference", "Ai_training", "Optimization", "AI_Training", "FPGAXilinx", "NVIDIAV100", "Autotuning", "Parameters", "Tensorflow", "Translation", "TensorFlow", "Opt_build", "Acc_type", "Affinity", "App_type", "Basedata", "Compiler", "Cpu_type", "Location", "Prefetch", "AMDM100", "AUTOTUNE", "Imagenet", "Intelx86", "Backend", "Library", "Openacc", "Pytorch", "Version", "BigData", "OPENACC", "PyTorch", "RESTART", "Config", "Layers", "Opencl", "Openmp", "CREATA", "OPENCL", "OPENMP", "Cache", "Count", "Input", "Keras_1", "Medium", "Mvapch", "Opnmpi", "Simple", "Tuner", "CIFAR", "IMAGE", "Keras", "MNIST", "MXNet", "Power", "Block", "Data", "Glow", "Large", "Size", "Small", "Type", "CNTK", "Cray", "Etl", "Hpc", "Mpi", "Xla", "AMD", "ARM", "HPC", "MPI", "Pgi", "Comma", "FullStop", "Colon", "RULE_BT", "RULE_LT", "RULE_BET", "RULE_LET", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_OR", "RULE_AND", "RULE_BEGIN", "RULE_END", "RULE_BOOLEAN", "RULE_INT", "RULE_EXT_INT", "RULE_ID", "RULE_QUALIFIED_NAME", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Tensorflow=26;
    public static final int CREATA=55;
    public static final int CIFAR=67;
    public static final int RULE_LET=97;
    public static final int Size=77;
    public static final int Mpi=84;
    public static final int MPI=89;
    public static final int Enable_autotuning=9;
    public static final int Count=59;
    public static final int Mvapch=63;
    public static final int PyTorch=49;
    public static final int IMAGE=68;
    public static final int Autotuning=24;
    public static final int RULE_NOT_EQUAL=99;
    public static final int Imagenet=40;
    public static final int RULE_OR=100;
    public static final int Prefetch=37;
    public static final int RULE_QUALIFIED_NAME=108;
    public static final int Translation=27;
    public static final int Parameters=25;
    public static final int Small=78;
    public static final int RULE_EQUAL=98;
    public static final int RULE_ID=107;
    public static final int Cray=81;
    public static final int Number_of_acc=14;
    public static final int Recommendation=15;
    public static final int Pgi=90;
    public static final int Enable_opt_build=11;
    public static final int RULE_INT=105;
    public static final int FPGAXilinx=22;
    public static final int RULE_ML_COMMENT=110;
    public static final int Openacc=44;
    public static final int Keras=69;
    public static final int Hpc=83;
    public static final int HPC=88;
    public static final int OPENMP=57;
    public static final int ARM=87;
    public static final int CNTK=80;
    public static final int Core_subscription=8;
    public static final int Large=76;
    public static final int MNIST=70;
    public static final int Simple=65;
    public static final int Cpu_type=35;
    public static final int Comma=91;
    public static final int AUTOTUNE=39;
    public static final int Opnmpi=64;
    public static final int Ai_training=19;
    public static final int OPENACC=48;
    public static final int Layers=52;
    public static final int Basedata=33;
    public static final int TensorFlow=28;
    public static final int FullStop=92;
    public static final int AI_Training=21;
    public static final int OPENCL=56;
    public static final int Opt_build=29;
    public static final int RULE_BT=94;
    public static final int Ai_framework=16;
    public static final int Pytorch=45;
    public static final int Type=79;
    public static final int Image_classification=6;
    public static final int Message_size=17;
    public static final int Opencl=53;
    public static final int Etl=82;
    public static final int Power=72;
    public static final int Number_of_threads=10;
    public static final int RULE_BEGIN=102;
    public static final int RULE_BOOLEAN=104;
    public static final int Tuner=66;
    public static final int Glow=75;
    public static final int Input=60;
    public static final int MXNet=71;
    public static final int RULE_BET=96;
    public static final int Version=46;
    public static final int AMD=86;
    public static final int NVIDIAV100=23;
    public static final int Object_detection=12;
    public static final int AMDM100=38;
    public static final int Compiler=34;
    public static final int Openmp=54;
    public static final int RULE_LT=95;
    public static final int Medium=62;
    public static final int Affinity=31;
    public static final int Block=73;
    public static final int Library=43;
    public static final int Cache=58;
    public static final int AI_Inference=18;
    public static final int RULE_END=103;
    public static final int Reinforncement_learning=4;
    public static final int Config=51;
    public static final int RULE_STRING=109;
    public static final int Xla=85;
    public static final int Optimization=20;
    public static final int Acc_type=30;
    public static final int App_type=32;
    public static final int RULE_AND=101;
    public static final int RULE_SL_COMMENT=111;
    public static final int Intelx86=41;
    public static final int RESTART=50;
    public static final int Colon=93;
    public static final int EOF=-1;
    public static final int Keras_1=61;
    public static final int RULE_WS=112;
    public static final int RULE_EXT_INT=106;
    public static final int Data=74;
    public static final int RULE_ANY_OTHER=113;
    public static final int Distributed_training=5;
    public static final int Backend=42;
    public static final int Parallelisation=13;
    public static final int BigData=47;
    public static final int Scaling_efficiency=7;
    public static final int Location=36;

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
    // InternalOptimizationParser.g:491:1: ruleEOptBuild returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEOptBuild() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_cpu_type_2_0 = null;

        AntlrDatatypeRuleToken lv_acc_type_4_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:497:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:498:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:498:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:499:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:499:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:500:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOptBuildAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:503:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:504:5: ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:504:5: ( ({...}? => ( ({...}? => (otherlv_1= Cpu_type ( (lv_cpu_type_2_0= ruleECPUType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) ) )+
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
            	    // InternalOptimizationParser.g:539:3: ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:539:3: ({...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) ) )
            	    // InternalOptimizationParser.g:540:4: {...}? => ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOptBuild", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:540:103: ( ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) ) )
            	    // InternalOptimizationParser.g:541:5: ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOptBuildAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:544:8: ({...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) ) )
            	    // InternalOptimizationParser.g:544:9: {...}? => (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOptBuild", "true");
            	    }
            	    // InternalOptimizationParser.g:544:18: (otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) ) )
            	    // InternalOptimizationParser.g:544:19: otherlv_3= Acc_type ( (lv_acc_type_4_0= ruleEACCType ) )
            	    {
            	    otherlv_3=(Token)match(input,Acc_type,FOLLOW_19); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOptBuildAccess().getAcc_typeKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:548:8: ( (lv_acc_type_4_0= ruleEACCType ) )
            	    // InternalOptimizationParser.g:549:9: (lv_acc_type_4_0= ruleEACCType )
            	    {
            	    // InternalOptimizationParser.g:549:9: (lv_acc_type_4_0= ruleEACCType )
            	    // InternalOptimizationParser.g:550:10: lv_acc_type_4_0= ruleEACCType
            	    {

            	    										newCompositeNode(grammarAccess.getEOptBuildAccess().getAcc_typeEACCTypeParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_18);
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
    // InternalOptimizationParser.g:584:1: entryRuleECPUType returns [String current=null] : iv_ruleECPUType= ruleECPUType EOF ;
    public final String entryRuleECPUType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleECPUType = null;


        try {
            // InternalOptimizationParser.g:584:48: (iv_ruleECPUType= ruleECPUType EOF )
            // InternalOptimizationParser.g:585:2: iv_ruleECPUType= ruleECPUType EOF
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
    // InternalOptimizationParser.g:591:1: ruleECPUType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power ) ;
    public final AntlrDatatypeRuleToken ruleECPUType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:597:2: ( (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power ) )
            // InternalOptimizationParser.g:598:2: (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power )
            {
            // InternalOptimizationParser.g:598:2: (kw= Intelx86 | kw= ARM | kw= AMD | kw= Power )
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
                    // InternalOptimizationParser.g:599:3: kw= Intelx86
                    {
                    kw=(Token)match(input,Intelx86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECPUTypeAccess().getIntelx86Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:605:3: kw= ARM
                    {
                    kw=(Token)match(input,ARM,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECPUTypeAccess().getARMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:611:3: kw= AMD
                    {
                    kw=(Token)match(input,AMD,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECPUTypeAccess().getAMDKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:617:3: kw= Power
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
    // InternalOptimizationParser.g:626:1: entryRuleEACCType returns [String current=null] : iv_ruleEACCType= ruleEACCType EOF ;
    public final String entryRuleEACCType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEACCType = null;


        try {
            // InternalOptimizationParser.g:626:48: (iv_ruleEACCType= ruleEACCType EOF )
            // InternalOptimizationParser.g:627:2: iv_ruleEACCType= ruleEACCType EOF
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
    // InternalOptimizationParser.g:633:1: ruleEACCType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx ) ;
    public final AntlrDatatypeRuleToken ruleEACCType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:639:2: ( (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx ) )
            // InternalOptimizationParser.g:640:2: (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx )
            {
            // InternalOptimizationParser.g:640:2: (kw= NVIDIAV100 | kw= AMDM100 | kw= FPGAXilinx )
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
                    // InternalOptimizationParser.g:641:3: kw= NVIDIAV100
                    {
                    kw=(Token)match(input,NVIDIAV100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEACCTypeAccess().getNVIDIAV100Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:647:3: kw= AMDM100
                    {
                    kw=(Token)match(input,AMDM100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEACCTypeAccess().getAMDM100Keyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:653:3: kw= FPGAXilinx
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
    // InternalOptimizationParser.g:662:1: entryRuleEAutotuning returns [EObject current=null] : iv_ruleEAutotuning= ruleEAutotuning EOF ;
    public final EObject entryRuleEAutotuning() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAutotuning = null;


        try {
            // InternalOptimizationParser.g:662:52: (iv_ruleEAutotuning= ruleEAutotuning EOF )
            // InternalOptimizationParser.g:663:2: iv_ruleEAutotuning= ruleEAutotuning EOF
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
    // InternalOptimizationParser.g:669:1: ruleEAutotuning returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAutotuning() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_input_4_0=null;
        AntlrDatatypeRuleToken lv_tuner_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:675:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:676:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:676:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:677:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:677:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:678:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAutotuningAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:681:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:682:5: ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:682:5: ( ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) ) )+
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
            	    // InternalOptimizationParser.g:683:3: ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:683:3: ({...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) ) )
            	    // InternalOptimizationParser.g:684:4: {...}? => ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:684:105: ( ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) ) )
            	    // InternalOptimizationParser.g:685:5: ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:688:8: ({...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) ) )
            	    // InternalOptimizationParser.g:688:9: {...}? => (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "true");
            	    }
            	    // InternalOptimizationParser.g:688:18: (otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) ) )
            	    // InternalOptimizationParser.g:688:19: otherlv_1= Tuner ( (lv_tuner_2_0= ruleETuner ) )
            	    {
            	    otherlv_1=(Token)match(input,Tuner,FOLLOW_20); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAutotuningAccess().getTunerKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:692:8: ( (lv_tuner_2_0= ruleETuner ) )
            	    // InternalOptimizationParser.g:693:9: (lv_tuner_2_0= ruleETuner )
            	    {
            	    // InternalOptimizationParser.g:693:9: (lv_tuner_2_0= ruleETuner )
            	    // InternalOptimizationParser.g:694:10: lv_tuner_2_0= ruleETuner
            	    {

            	    										newCompositeNode(grammarAccess.getEAutotuningAccess().getTunerETunerParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_21);
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
            	    // InternalOptimizationParser.g:717:3: ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:717:3: ({...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:718:4: {...}? => ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:718:105: ( ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:719:5: ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAutotuningAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:722:8: ({...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:722:9: {...}? => (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAutotuning", "true");
            	    }
            	    // InternalOptimizationParser.g:722:18: (otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:722:19: otherlv_3= Input ( (lv_input_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Input,FOLLOW_22); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAutotuningAccess().getInputKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:726:8: ( (lv_input_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:727:9: (lv_input_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:727:9: (lv_input_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:728:10: lv_input_4_0= RULE_STRING
            	    {
            	    lv_input_4_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

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


    // $ANTLR start "entryRuleETuner"
    // InternalOptimizationParser.g:761:1: entryRuleETuner returns [String current=null] : iv_ruleETuner= ruleETuner EOF ;
    public final String entryRuleETuner() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleETuner = null;


        try {
            // InternalOptimizationParser.g:761:46: (iv_ruleETuner= ruleETuner EOF )
            // InternalOptimizationParser.g:762:2: iv_ruleETuner= ruleETuner EOF
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
    // InternalOptimizationParser.g:768:1: ruleETuner returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= CREATA | kw= AUTOTUNE ) ;
    public final AntlrDatatypeRuleToken ruleETuner() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:774:2: ( (kw= CREATA | kw= AUTOTUNE ) )
            // InternalOptimizationParser.g:775:2: (kw= CREATA | kw= AUTOTUNE )
            {
            // InternalOptimizationParser.g:775:2: (kw= CREATA | kw= AUTOTUNE )
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
                    // InternalOptimizationParser.g:776:3: kw= CREATA
                    {
                    kw=(Token)match(input,CREATA,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getETunerAccess().getCREATAKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:782:3: kw= AUTOTUNE
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
    // InternalOptimizationParser.g:791:1: entryRuleEAITraining returns [EObject current=null] : iv_ruleEAITraining= ruleEAITraining EOF ;
    public final EObject entryRuleEAITraining() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITraining = null;


        try {
            // InternalOptimizationParser.g:791:52: (iv_ruleEAITraining= ruleEAITraining EOF )
            // InternalOptimizationParser.g:792:2: iv_ruleEAITraining= ruleEAITraining EOF
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
    // InternalOptimizationParser.g:798:1: ruleEAITraining returns [EObject current=null] : ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) ) ;
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
            // InternalOptimizationParser.g:804:2: ( ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) ) )
            // InternalOptimizationParser.g:805:2: ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) )
            {
            // InternalOptimizationParser.g:805:2: ( (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) ) )
            // InternalOptimizationParser.g:806:3: (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END ) (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END ) ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) )
            {
            // InternalOptimizationParser.g:806:3: (otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:807:4: otherlv_0= Config this_BEGIN_1= RULE_BEGIN ( (lv_config_2_0= ruleEAITrainingConfig ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Config,FOLLOW_5); 

            				newLeafNode(otherlv_0, grammarAccess.getEAITrainingAccess().getConfigKeyword_0_0());
            			
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            				newLeafNode(this_BEGIN_1, grammarAccess.getEAITrainingAccess().getBEGINTerminalRuleCall_0_1());
            			
            // InternalOptimizationParser.g:815:4: ( (lv_config_2_0= ruleEAITrainingConfig ) )
            // InternalOptimizationParser.g:816:5: (lv_config_2_0= ruleEAITrainingConfig )
            {
            // InternalOptimizationParser.g:816:5: (lv_config_2_0= ruleEAITrainingConfig )
            // InternalOptimizationParser.g:817:6: lv_config_2_0= ruleEAITrainingConfig
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

            this_END_3=(Token)match(input,RULE_END,FOLLOW_24); 

            				newLeafNode(this_END_3, grammarAccess.getEAITrainingAccess().getENDTerminalRuleCall_0_3());
            			

            }

            // InternalOptimizationParser.g:839:3: (otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END )
            // InternalOptimizationParser.g:840:4: otherlv_4= Data this_BEGIN_5= RULE_BEGIN ( (lv_data_6_0= ruleEAITrainingData ) ) this_END_7= RULE_END
            {
            otherlv_4=(Token)match(input,Data,FOLLOW_5); 

            				newLeafNode(otherlv_4, grammarAccess.getEAITrainingAccess().getDataKeyword_1_0());
            			
            this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

            				newLeafNode(this_BEGIN_5, grammarAccess.getEAITrainingAccess().getBEGINTerminalRuleCall_1_1());
            			
            // InternalOptimizationParser.g:848:4: ( (lv_data_6_0= ruleEAITrainingData ) )
            // InternalOptimizationParser.g:849:5: (lv_data_6_0= ruleEAITrainingData )
            {
            // InternalOptimizationParser.g:849:5: (lv_data_6_0= ruleEAITrainingData )
            // InternalOptimizationParser.g:850:6: lv_data_6_0= ruleEAITrainingData
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

            this_END_7=(Token)match(input,RULE_END,FOLLOW_26); 

            				newLeafNode(this_END_7, grammarAccess.getEAITrainingAccess().getENDTerminalRuleCall_1_3());
            			

            }

            // InternalOptimizationParser.g:872:3: ( (lv_aitrainingcase_8_0= ruleEAITrainingCases ) )
            // InternalOptimizationParser.g:873:4: (lv_aitrainingcase_8_0= ruleEAITrainingCases )
            {
            // InternalOptimizationParser.g:873:4: (lv_aitrainingcase_8_0= ruleEAITrainingCases )
            // InternalOptimizationParser.g:874:5: lv_aitrainingcase_8_0= ruleEAITrainingCases
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
    // InternalOptimizationParser.g:895:1: entryRuleEAITrainingCases returns [EObject current=null] : iv_ruleEAITrainingCases= ruleEAITrainingCases EOF ;
    public final EObject entryRuleEAITrainingCases() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingCases = null;


        try {
            // InternalOptimizationParser.g:895:57: (iv_ruleEAITrainingCases= ruleEAITrainingCases EOF )
            // InternalOptimizationParser.g:896:2: iv_ruleEAITrainingCases= ruleEAITrainingCases EOF
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
    // InternalOptimizationParser.g:902:1: ruleEAITrainingCases returns [EObject current=null] : (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase ) ;
    public final EObject ruleEAITrainingCases() throws RecognitionException {
        EObject current = null;

        EObject this_EKerasCase_0 = null;

        EObject this_ETensorFlowCase_1 = null;

        EObject this_EPyTorchCase_2 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:908:2: ( (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase ) )
            // InternalOptimizationParser.g:909:2: (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase )
            {
            // InternalOptimizationParser.g:909:2: (this_EKerasCase_0= ruleEKerasCase | this_ETensorFlowCase_1= ruleETensorFlowCase | this_EPyTorchCase_2= ruleEPyTorchCase )
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
            case Pytorch:
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
                    // InternalOptimizationParser.g:910:3: this_EKerasCase_0= ruleEKerasCase
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
                    // InternalOptimizationParser.g:919:3: this_ETensorFlowCase_1= ruleETensorFlowCase
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
                    // InternalOptimizationParser.g:928:3: this_EPyTorchCase_2= ruleEPyTorchCase
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
    // InternalOptimizationParser.g:940:1: entryRuleEPyTorchCase returns [EObject current=null] : iv_ruleEPyTorchCase= ruleEPyTorchCase EOF ;
    public final EObject entryRuleEPyTorchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPyTorchCase = null;


        try {
            // InternalOptimizationParser.g:940:53: (iv_ruleEPyTorchCase= ruleEPyTorchCase EOF )
            // InternalOptimizationParser.g:941:2: iv_ruleEPyTorchCase= ruleEPyTorchCase EOF
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
    // InternalOptimizationParser.g:947:1: ruleEPyTorchCase returns [EObject current=null] : (otherlv_0= Pytorch this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEPyTorchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_pytorch_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:953:2: ( (otherlv_0= Pytorch this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:954:2: (otherlv_0= Pytorch this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:954:2: (otherlv_0= Pytorch this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:955:3: otherlv_0= Pytorch this_BEGIN_1= RULE_BEGIN ( (lv_pytorch_2_0= ruleEPyTorch ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Pytorch,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEPyTorchCaseAccess().getPytorchKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_27); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEPyTorchCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:963:3: ( (lv_pytorch_2_0= ruleEPyTorch ) )
            // InternalOptimizationParser.g:964:4: (lv_pytorch_2_0= ruleEPyTorch )
            {
            // InternalOptimizationParser.g:964:4: (lv_pytorch_2_0= ruleEPyTorch )
            // InternalOptimizationParser.g:965:5: lv_pytorch_2_0= ruleEPyTorch
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
    // InternalOptimizationParser.g:990:1: entryRuleETensorFlowCase returns [EObject current=null] : iv_ruleETensorFlowCase= ruleETensorFlowCase EOF ;
    public final EObject entryRuleETensorFlowCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETensorFlowCase = null;


        try {
            // InternalOptimizationParser.g:990:56: (iv_ruleETensorFlowCase= ruleETensorFlowCase EOF )
            // InternalOptimizationParser.g:991:2: iv_ruleETensorFlowCase= ruleETensorFlowCase EOF
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
    // InternalOptimizationParser.g:997:1: ruleETensorFlowCase returns [EObject current=null] : (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END ) ;
    public final EObject ruleETensorFlowCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_tensorflow_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1003:2: ( (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:1004:2: (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:1004:2: (otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:1005:3: otherlv_0= Tensorflow this_BEGIN_1= RULE_BEGIN ( (lv_tensorflow_2_0= ruleETensorFlow ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Tensorflow,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getETensorFlowCaseAccess().getTensorflowKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getETensorFlowCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:1013:3: ( (lv_tensorflow_2_0= ruleETensorFlow ) )
            // InternalOptimizationParser.g:1014:4: (lv_tensorflow_2_0= ruleETensorFlow )
            {
            // InternalOptimizationParser.g:1014:4: (lv_tensorflow_2_0= ruleETensorFlow )
            // InternalOptimizationParser.g:1015:5: lv_tensorflow_2_0= ruleETensorFlow
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
    // InternalOptimizationParser.g:1040:1: entryRuleEKerasCase returns [EObject current=null] : iv_ruleEKerasCase= ruleEKerasCase EOF ;
    public final EObject entryRuleEKerasCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEKerasCase = null;


        try {
            // InternalOptimizationParser.g:1040:51: (iv_ruleEKerasCase= ruleEKerasCase EOF )
            // InternalOptimizationParser.g:1041:2: iv_ruleEKerasCase= ruleEKerasCase EOF
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
    // InternalOptimizationParser.g:1047:1: ruleEKerasCase returns [EObject current=null] : (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEKerasCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_keras_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1053:2: ( (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:1054:2: (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:1054:2: (otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:1055:3: otherlv_0= Keras_1 this_BEGIN_1= RULE_BEGIN ( (lv_keras_2_0= ruleEKeras ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Keras_1,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEKerasCaseAccess().getKerasKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEKerasCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:1063:3: ( (lv_keras_2_0= ruleEKeras ) )
            // InternalOptimizationParser.g:1064:4: (lv_keras_2_0= ruleEKeras )
            {
            // InternalOptimizationParser.g:1064:4: (lv_keras_2_0= ruleEKeras )
            // InternalOptimizationParser.g:1065:5: lv_keras_2_0= ruleEKeras
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
    // InternalOptimizationParser.g:1090:1: entryRuleEAITrainingConfig returns [EObject current=null] : iv_ruleEAITrainingConfig= ruleEAITrainingConfig EOF ;
    public final EObject entryRuleEAITrainingConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingConfig = null;


        try {
            // InternalOptimizationParser.g:1090:58: (iv_ruleEAITrainingConfig= ruleEAITrainingConfig EOF )
            // InternalOptimizationParser.g:1091:2: iv_ruleEAITrainingConfig= ruleEAITrainingConfig EOF
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
    // InternalOptimizationParser.g:1097:1: ruleEAITrainingConfig returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalOptimizationParser.g:1103:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:1104:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:1104:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:1105:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:1105:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:1106:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1109:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:1110:5: ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:1110:5: ( ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) ) )+
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
            	    // InternalOptimizationParser.g:1111:3: ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1111:3: ({...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1112:4: {...}? => ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1112:111: ( ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) ) )
            	    // InternalOptimizationParser.g:1113:5: ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1116:8: ({...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) ) )
            	    // InternalOptimizationParser.g:1116:9: {...}? => (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1116:18: (otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) ) )
            	    // InternalOptimizationParser.g:1116:19: otherlv_1= Ai_framework ( (lv_ai_framework_2_0= ruleEAIFramework ) )
            	    {
            	    otherlv_1=(Token)match(input,Ai_framework,FOLLOW_30); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAITrainingConfigAccess().getAi_frameworkKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1120:8: ( (lv_ai_framework_2_0= ruleEAIFramework ) )
            	    // InternalOptimizationParser.g:1121:9: (lv_ai_framework_2_0= ruleEAIFramework )
            	    {
            	    // InternalOptimizationParser.g:1121:9: (lv_ai_framework_2_0= ruleEAIFramework )
            	    // InternalOptimizationParser.g:1122:10: lv_ai_framework_2_0= ruleEAIFramework
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingConfigAccess().getAi_frameworkEAIFrameworkParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_31);
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
            	    // InternalOptimizationParser.g:1145:3: ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1145:3: ({...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1146:4: {...}? => ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1146:111: ( ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) ) )
            	    // InternalOptimizationParser.g:1147:5: ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1150:8: ({...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) ) )
            	    // InternalOptimizationParser.g:1150:9: {...}? => (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1150:18: (otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) ) )
            	    // InternalOptimizationParser.g:1150:19: otherlv_3= Type ( (lv_type_4_0= ruleEAITrainingType ) )
            	    {
            	    otherlv_3=(Token)match(input,Type,FOLLOW_32); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAITrainingConfigAccess().getTypeKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1154:8: ( (lv_type_4_0= ruleEAITrainingType ) )
            	    // InternalOptimizationParser.g:1155:9: (lv_type_4_0= ruleEAITrainingType )
            	    {
            	    // InternalOptimizationParser.g:1155:9: (lv_type_4_0= ruleEAITrainingType )
            	    // InternalOptimizationParser.g:1156:10: lv_type_4_0= ruleEAITrainingType
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingConfigAccess().getTypeEAITrainingTypeParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_31);
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
            	    // InternalOptimizationParser.g:1179:3: ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1179:3: ({...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1180:4: {...}? => ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:1180:111: ( ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:1181:5: ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:1184:8: ({...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:1184:9: {...}? => (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1184:18: (otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:1184:19: otherlv_5= Distributed_training ( (lv_distributed_training_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,Distributed_training,FOLLOW_8); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAITrainingConfigAccess().getDistributed_trainingKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:1188:8: ( (lv_distributed_training_6_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:1189:9: (lv_distributed_training_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:1189:9: (lv_distributed_training_6_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:1190:10: lv_distributed_training_6_0= RULE_BOOLEAN
            	    {
            	    lv_distributed_training_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_31); 

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
            	    // InternalOptimizationParser.g:1212:3: ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1212:3: ({...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1213:4: {...}? => ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:1213:111: ( ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1214:5: ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:1217:8: ({...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1217:9: {...}? => (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1217:18: (otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1217:19: otherlv_7= Layers ( (lv_layers_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Layers,FOLLOW_33); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEAITrainingConfigAccess().getLayersKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:1221:8: ( (lv_layers_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1222:9: (lv_layers_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1222:9: (lv_layers_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:1223:10: lv_layers_8_0= RULE_INT
            	    {
            	    lv_layers_8_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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
            	    // InternalOptimizationParser.g:1245:3: ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1245:3: ({...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1246:4: {...}? => ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:1246:111: ( ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1247:5: ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingConfigAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:1250:8: ({...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1250:9: {...}? => (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingConfig", "true");
            	    }
            	    // InternalOptimizationParser.g:1250:18: (otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1250:19: otherlv_9= Parameters ( (lv_parameters_10_0= RULE_INT ) )
            	    {
            	    otherlv_9=(Token)match(input,Parameters,FOLLOW_33); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEAITrainingConfigAccess().getParametersKeyword_4_0());
            	    							
            	    // InternalOptimizationParser.g:1254:8: ( (lv_parameters_10_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1255:9: (lv_parameters_10_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1255:9: (lv_parameters_10_0= RULE_INT )
            	    // InternalOptimizationParser.g:1256:10: lv_parameters_10_0= RULE_INT
            	    {
            	    lv_parameters_10_0=(Token)match(input,RULE_INT,FOLLOW_31); 

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
    // InternalOptimizationParser.g:1289:1: entryRuleEAIFramework returns [String current=null] : iv_ruleEAIFramework= ruleEAIFramework EOF ;
    public final String entryRuleEAIFramework() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEAIFramework = null;


        try {
            // InternalOptimizationParser.g:1289:52: (iv_ruleEAIFramework= ruleEAIFramework EOF )
            // InternalOptimizationParser.g:1290:2: iv_ruleEAIFramework= ruleEAIFramework EOF
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
    // InternalOptimizationParser.g:1296:1: ruleEAIFramework returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) ;
    public final AntlrDatatypeRuleToken ruleEAIFramework() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1302:2: ( (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) )
            // InternalOptimizationParser.g:1303:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
            {
            // InternalOptimizationParser.g:1303:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
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
                    // InternalOptimizationParser.g:1304:3: kw= TensorFlow
                    {
                    kw=(Token)match(input,TensorFlow,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getTensorFlowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1310:3: kw= PyTorch
                    {
                    kw=(Token)match(input,PyTorch,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getPyTorchKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1316:3: kw= Keras
                    {
                    kw=(Token)match(input,Keras,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getKerasKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:1322:3: kw= CNTK
                    {
                    kw=(Token)match(input,CNTK,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAIFrameworkAccess().getCNTKKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOptimizationParser.g:1328:3: kw= MXNet
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
    // InternalOptimizationParser.g:1337:1: entryRuleEAITrainingType returns [String current=null] : iv_ruleEAITrainingType= ruleEAITrainingType EOF ;
    public final String entryRuleEAITrainingType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEAITrainingType = null;


        try {
            // InternalOptimizationParser.g:1337:55: (iv_ruleEAITrainingType= ruleEAITrainingType EOF )
            // InternalOptimizationParser.g:1338:2: iv_ruleEAITrainingType= ruleEAITrainingType EOF
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
    // InternalOptimizationParser.g:1344:1: ruleEAITrainingType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning ) ;
    public final AntlrDatatypeRuleToken ruleEAITrainingType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1350:2: ( (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning ) )
            // InternalOptimizationParser.g:1351:2: (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning )
            {
            // InternalOptimizationParser.g:1351:2: (kw= Image_classification | kw= Object_detection | kw= Translation | kw= Recommendation | kw= Reinforncement_learning )
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
                    // InternalOptimizationParser.g:1352:3: kw= Image_classification
                    {
                    kw=(Token)match(input,Image_classification,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getImage_classificationKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1358:3: kw= Object_detection
                    {
                    kw=(Token)match(input,Object_detection,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getObject_detectionKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1364:3: kw= Translation
                    {
                    kw=(Token)match(input,Translation,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getTranslationKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:1370:3: kw= Recommendation
                    {
                    kw=(Token)match(input,Recommendation,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEAITrainingTypeAccess().getRecommendationKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOptimizationParser.g:1376:3: kw= Reinforncement_learning
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
    // InternalOptimizationParser.g:1385:1: entryRuleEAITrainingData returns [EObject current=null] : iv_ruleEAITrainingData= ruleEAITrainingData EOF ;
    public final EObject entryRuleEAITrainingData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingData = null;


        try {
            // InternalOptimizationParser.g:1385:56: (iv_ruleEAITrainingData= ruleEAITrainingData EOF )
            // InternalOptimizationParser.g:1386:2: iv_ruleEAITrainingData= ruleEAITrainingData EOF
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
    // InternalOptimizationParser.g:1392:1: ruleEAITrainingData returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) ) ;
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
            // InternalOptimizationParser.g:1398:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1399:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1399:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1400:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1400:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1401:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1404:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )* )
            // InternalOptimizationParser.g:1405:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1405:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) ) )*
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
            	    // InternalOptimizationParser.g:1406:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1406:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1407:4: {...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1407:109: ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:1408:5: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1411:8: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:1411:9: {...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1411:18: (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:1411:19: otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Location,FOLLOW_22); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAITrainingDataAccess().getLocationKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1415:8: ( (lv_location_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:1416:9: (lv_location_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:1416:9: (lv_location_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:1417:10: lv_location_2_0= RULE_STRING
            	    {
            	    lv_location_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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
            	    // InternalOptimizationParser.g:1439:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1439:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1440:4: {...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1440:109: ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) ) )
            	    // InternalOptimizationParser.g:1441:5: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1444:8: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) ) )
            	    // InternalOptimizationParser.g:1444:9: {...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1444:18: (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) ) )
            	    // InternalOptimizationParser.g:1444:19: otherlv_3= Basedata ( (lv_basedata_4_0= ruleEBasedata ) )
            	    {
            	    otherlv_3=(Token)match(input,Basedata,FOLLOW_35); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAITrainingDataAccess().getBasedataKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1448:8: ( (lv_basedata_4_0= ruleEBasedata ) )
            	    // InternalOptimizationParser.g:1449:9: (lv_basedata_4_0= ruleEBasedata )
            	    {
            	    // InternalOptimizationParser.g:1449:9: (lv_basedata_4_0= ruleEBasedata )
            	    // InternalOptimizationParser.g:1450:10: lv_basedata_4_0= ruleEBasedata
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingDataAccess().getBasedataEBasedataParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_34);
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
            	    // InternalOptimizationParser.g:1473:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1473:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1474:4: {...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:1474:109: ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1475:5: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:1478:8: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1478:9: {...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1478:18: (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1478:19: otherlv_5= Size ( (lv_size_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Size,FOLLOW_33); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAITrainingDataAccess().getSizeKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:1482:8: ( (lv_size_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1483:9: (lv_size_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1483:9: (lv_size_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:1484:10: lv_size_6_0= RULE_INT
            	    {
            	    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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
            	    // InternalOptimizationParser.g:1506:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1506:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1507:4: {...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:1507:109: ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1508:5: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:1511:8: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1511:9: {...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1511:18: (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1511:19: otherlv_7= Count ( (lv_count_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Count,FOLLOW_33); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEAITrainingDataAccess().getCountKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:1515:8: ( (lv_count_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1516:9: (lv_count_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1516:9: (lv_count_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:1517:10: lv_count_8_0= RULE_INT
            	    {
            	    lv_count_8_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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
            	    // InternalOptimizationParser.g:1539:3: ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1539:3: ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalOptimizationParser.g:1540:4: {...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:1540:109: ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) ) )
            	    // InternalOptimizationParser.g:1541:5: ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingDataAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:1544:8: ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END ) )
            	    // InternalOptimizationParser.g:1544:9: {...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingData", "true");
            	    }
            	    // InternalOptimizationParser.g:1544:18: (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END )
            	    // InternalOptimizationParser.g:1544:19: otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEAITrainingETL ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Etl,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEAITrainingDataAccess().getEtlKeyword_4_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getEAITrainingDataAccess().getBEGINTerminalRuleCall_4_1());
            	    							
            	    // InternalOptimizationParser.g:1552:8: ( (lv_etl_11_0= ruleEAITrainingETL ) )
            	    // InternalOptimizationParser.g:1553:9: (lv_etl_11_0= ruleEAITrainingETL )
            	    {
            	    // InternalOptimizationParser.g:1553:9: (lv_etl_11_0= ruleEAITrainingETL )
            	    // InternalOptimizationParser.g:1554:10: lv_etl_11_0= ruleEAITrainingETL
            	    {

            	    										newCompositeNode(grammarAccess.getEAITrainingDataAccess().getEtlEAITrainingETLParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
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

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_34); 

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
    // InternalOptimizationParser.g:1591:1: entryRuleEBasedata returns [String current=null] : iv_ruleEBasedata= ruleEBasedata EOF ;
    public final String entryRuleEBasedata() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBasedata = null;


        try {
            // InternalOptimizationParser.g:1591:49: (iv_ruleEBasedata= ruleEBasedata EOF )
            // InternalOptimizationParser.g:1592:2: iv_ruleEBasedata= ruleEBasedata EOF
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
    // InternalOptimizationParser.g:1598:1: ruleEBasedata returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Imagenet | kw= CIFAR | kw= MNIST ) ;
    public final AntlrDatatypeRuleToken ruleEBasedata() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1604:2: ( (kw= Imagenet | kw= CIFAR | kw= MNIST ) )
            // InternalOptimizationParser.g:1605:2: (kw= Imagenet | kw= CIFAR | kw= MNIST )
            {
            // InternalOptimizationParser.g:1605:2: (kw= Imagenet | kw= CIFAR | kw= MNIST )
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
                    // InternalOptimizationParser.g:1606:3: kw= Imagenet
                    {
                    kw=(Token)match(input,Imagenet,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBasedataAccess().getImagenetKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1612:3: kw= CIFAR
                    {
                    kw=(Token)match(input,CIFAR,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBasedataAccess().getCIFARKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1618:3: kw= MNIST
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
    // InternalOptimizationParser.g:1627:1: entryRuleEAITrainingETL returns [EObject current=null] : iv_ruleEAITrainingETL= ruleEAITrainingETL EOF ;
    public final EObject entryRuleEAITrainingETL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAITrainingETL = null;


        try {
            // InternalOptimizationParser.g:1627:55: (iv_ruleEAITrainingETL= ruleEAITrainingETL EOF )
            // InternalOptimizationParser.g:1628:2: iv_ruleEAITrainingETL= ruleEAITrainingETL EOF
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
    // InternalOptimizationParser.g:1634:1: ruleEAITrainingETL returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEAITrainingETL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefetch_2_0=null;
        Token otherlv_3=null;
        Token lv_cache_4_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1640:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1641:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1641:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1642:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1642:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1643:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1646:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:1647:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1647:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) ) )*
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
            	    // InternalOptimizationParser.g:1648:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1648:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1649:4: {...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1649:108: ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1650:5: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1653:8: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1653:9: {...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "true");
            	    }
            	    // InternalOptimizationParser.g:1653:18: (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1653:19: otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,Prefetch,FOLLOW_33); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAITrainingETLAccess().getPrefetchKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1657:8: ( (lv_prefetch_2_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1658:9: (lv_prefetch_2_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1658:9: (lv_prefetch_2_0= RULE_INT )
            	    // InternalOptimizationParser.g:1659:10: lv_prefetch_2_0= RULE_INT
            	    {
            	    lv_prefetch_2_0=(Token)match(input,RULE_INT,FOLLOW_37); 

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
            	    // InternalOptimizationParser.g:1681:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1681:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1682:4: {...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1682:108: ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:1683:5: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAITrainingETLAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1686:8: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:1686:9: {...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAITrainingETL", "true");
            	    }
            	    // InternalOptimizationParser.g:1686:18: (otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:1686:19: otherlv_3= Cache ( (lv_cache_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,Cache,FOLLOW_33); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAITrainingETLAccess().getCacheKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1690:8: ( (lv_cache_4_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:1691:9: (lv_cache_4_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:1691:9: (lv_cache_4_0= RULE_INT )
            	    // InternalOptimizationParser.g:1692:10: lv_cache_4_0= RULE_INT
            	    {
            	    lv_cache_4_0=(Token)match(input,RULE_INT,FOLLOW_37); 

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
    // InternalOptimizationParser.g:1724:1: entryRuleEKeras returns [EObject current=null] : iv_ruleEKeras= ruleEKeras EOF ;
    public final EObject entryRuleEKeras() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEKeras = null;


        try {
            // InternalOptimizationParser.g:1724:47: (iv_ruleEKeras= ruleEKeras EOF )
            // InternalOptimizationParser.g:1725:2: iv_ruleEKeras= ruleEKeras EOF
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
    // InternalOptimizationParser.g:1731:1: ruleEKeras returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEKeras() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_backend_4_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:1737:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1738:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1738:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1739:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1739:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1740:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEKerasAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1743:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:1744:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1744:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) ) )*
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
            	    // InternalOptimizationParser.g:1745:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1745:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1746:4: {...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1746:100: ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:1747:5: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEKerasAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1750:8: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:1750:9: {...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "true");
            	    }
            	    // InternalOptimizationParser.g:1750:18: (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:1750:19: otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Version,FOLLOW_22); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEKerasAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1754:8: ( (lv_version_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:1755:9: (lv_version_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:1755:9: (lv_version_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:1756:10: lv_version_2_0= RULE_STRING
            	    {
            	    lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

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
            	    // InternalOptimizationParser.g:1778:3: ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1778:3: ({...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1779:4: {...}? => ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "getUnorderedGroupHelper().canSelect(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1779:100: ( ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) ) )
            	    // InternalOptimizationParser.g:1780:5: ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEKerasAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1783:8: ({...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) ) )
            	    // InternalOptimizationParser.g:1783:9: {...}? => (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEKeras", "true");
            	    }
            	    // InternalOptimizationParser.g:1783:18: (otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) ) )
            	    // InternalOptimizationParser.g:1783:19: otherlv_3= Backend ( (lv_backend_4_0= ruleEBackend ) )
            	    {
            	    otherlv_3=(Token)match(input,Backend,FOLLOW_30); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEKerasAccess().getBackendKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1787:8: ( (lv_backend_4_0= ruleEBackend ) )
            	    // InternalOptimizationParser.g:1788:9: (lv_backend_4_0= ruleEBackend )
            	    {
            	    // InternalOptimizationParser.g:1788:9: (lv_backend_4_0= ruleEBackend )
            	    // InternalOptimizationParser.g:1789:10: lv_backend_4_0= ruleEBackend
            	    {

            	    										newCompositeNode(grammarAccess.getEKerasAccess().getBackendEBackendParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_38);
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
    // InternalOptimizationParser.g:1822:1: entryRuleEBackend returns [String current=null] : iv_ruleEBackend= ruleEBackend EOF ;
    public final String entryRuleEBackend() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBackend = null;


        try {
            // InternalOptimizationParser.g:1822:48: (iv_ruleEBackend= ruleEBackend EOF )
            // InternalOptimizationParser.g:1823:2: iv_ruleEBackend= ruleEBackend EOF
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
    // InternalOptimizationParser.g:1829:1: ruleEBackend returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) ;
    public final AntlrDatatypeRuleToken ruleEBackend() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1835:2: ( (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet ) )
            // InternalOptimizationParser.g:1836:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
            {
            // InternalOptimizationParser.g:1836:2: (kw= TensorFlow | kw= PyTorch | kw= Keras | kw= CNTK | kw= MXNet )
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
                    // InternalOptimizationParser.g:1837:3: kw= TensorFlow
                    {
                    kw=(Token)match(input,TensorFlow,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getTensorFlowKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:1843:3: kw= PyTorch
                    {
                    kw=(Token)match(input,PyTorch,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getPyTorchKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:1849:3: kw= Keras
                    {
                    kw=(Token)match(input,Keras,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getKerasKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:1855:3: kw= CNTK
                    {
                    kw=(Token)match(input,CNTK,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBackendAccess().getCNTKKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalOptimizationParser.g:1861:3: kw= MXNet
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
    // InternalOptimizationParser.g:1870:1: entryRuleETensorFlow returns [EObject current=null] : iv_ruleETensorFlow= ruleETensorFlow EOF ;
    public final EObject entryRuleETensorFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETensorFlow = null;


        try {
            // InternalOptimizationParser.g:1870:52: (iv_ruleETensorFlow= ruleETensorFlow EOF )
            // InternalOptimizationParser.g:1871:2: iv_ruleETensorFlow= ruleETensorFlow EOF
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
    // InternalOptimizationParser.g:1877:1: ruleETensorFlow returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleETensorFlow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token lv_xla_4_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1883:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1884:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1884:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1885:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1885:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1886:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getETensorFlowAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1889:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:1890:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1890:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
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
            	    // InternalOptimizationParser.g:1891:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1891:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1892:4: {...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1892:105: ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:1893:5: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1896:8: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:1896:9: {...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "true");
            	    }
            	    // InternalOptimizationParser.g:1896:18: (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:1896:19: otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Version,FOLLOW_22); 

            	    								newLeafNode(otherlv_1, grammarAccess.getETensorFlowAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1900:8: ( (lv_version_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:1901:9: (lv_version_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:1901:9: (lv_version_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:1902:10: lv_version_2_0= RULE_STRING
            	    {
            	    lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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
            	    // InternalOptimizationParser.g:1924:3: ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1924:3: ({...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1925:4: {...}? => ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "getUnorderedGroupHelper().canSelect(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:1925:105: ( ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:1926:5: ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETensorFlowAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:1929:8: ({...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:1929:9: {...}? => (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETensorFlow", "true");
            	    }
            	    // InternalOptimizationParser.g:1929:18: (otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:1929:19: otherlv_3= Xla ( (lv_xla_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,Xla,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getETensorFlowAccess().getXlaKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:1933:8: ( (lv_xla_4_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:1934:9: (lv_xla_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:1934:9: (lv_xla_4_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:1935:10: lv_xla_4_0= RULE_BOOLEAN
            	    {
            	    lv_xla_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_39); 

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
    // InternalOptimizationParser.g:1967:1: entryRuleEPyTorch returns [EObject current=null] : iv_ruleEPyTorch= ruleEPyTorch EOF ;
    public final EObject entryRuleEPyTorch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPyTorch = null;


        try {
            // InternalOptimizationParser.g:1967:49: (iv_ruleEPyTorch= ruleEPyTorch EOF )
            // InternalOptimizationParser.g:1968:2: iv_ruleEPyTorch= ruleEPyTorch EOF
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
    // InternalOptimizationParser.g:1974:1: ruleEPyTorch returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEPyTorch() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_version_2_0=null;
        Token otherlv_3=null;
        Token lv_glow_4_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:1980:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:1981:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:1981:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:1982:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:1982:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:1983:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPyTorchAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:1986:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:1987:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:1987:5: ( ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
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
            	    // InternalOptimizationParser.g:1988:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:1988:3: ({...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:1989:4: {...}? => ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:1989:102: ( ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:1990:5: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:1993:8: ({...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:1993:9: {...}? => (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "true");
            	    }
            	    // InternalOptimizationParser.g:1993:18: (otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:1993:19: otherlv_1= Version ( (lv_version_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Version,FOLLOW_22); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPyTorchAccess().getVersionKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:1997:8: ( (lv_version_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:1998:9: (lv_version_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:1998:9: (lv_version_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:1999:10: lv_version_2_0= RULE_STRING
            	    {
            	    lv_version_2_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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
            	    // InternalOptimizationParser.g:2021:3: ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2021:3: ({...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2022:4: {...}? => ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2022:102: ( ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:2023:5: ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPyTorchAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2026:8: ({...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:2026:9: {...}? => (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPyTorch", "true");
            	    }
            	    // InternalOptimizationParser.g:2026:18: (otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:2026:19: otherlv_3= Glow ( (lv_glow_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,Glow,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPyTorchAccess().getGlowKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:2030:8: ( (lv_glow_4_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:2031:9: (lv_glow_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:2031:9: (lv_glow_4_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:2032:10: lv_glow_4_0= RULE_BOOLEAN
            	    {
            	    lv_glow_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_40); 

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
    // InternalOptimizationParser.g:2064:1: entryRuleEHPC returns [EObject current=null] : iv_ruleEHPC= ruleEHPC EOF ;
    public final EObject entryRuleEHPC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPC = null;


        try {
            // InternalOptimizationParser.g:2064:45: (iv_ruleEHPC= ruleEHPC EOF )
            // InternalOptimizationParser.g:2065:2: iv_ruleEHPC= ruleEHPC EOF
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
    // InternalOptimizationParser.g:2071:1: ruleEHPC returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalOptimizationParser.g:2077:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:2078:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:2078:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:2079:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:2079:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:2080:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEHPCAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2083:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:2084:5: ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:2084:5: ( ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=5;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == Config && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == Openmp && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 == Openacc && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 == Opencl && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 3) ) {
                    alt22=4;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalOptimizationParser.g:2085:3: ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2085:3: ({...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) ) )
            	    // InternalOptimizationParser.g:2086:4: {...}? => ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2086:98: ( ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) ) )
            	    // InternalOptimizationParser.g:2087:5: ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2090:8: ({...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? ) )
            	    // InternalOptimizationParser.g:2090:9: {...}? => ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "true");
            	    }
            	    // InternalOptimizationParser.g:2090:18: ( (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )? )
            	    // InternalOptimizationParser.g:2090:19: (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END ) (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END ) ( (lv_mpi_9_0= ruleEMPICase ) )?
            	    {
            	    // InternalOptimizationParser.g:2090:19: (otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END )
            	    // InternalOptimizationParser.g:2091:9: otherlv_1= Config this_BEGIN_2= RULE_BEGIN ( (lv_config_3_0= ruleEHPCConfig ) ) this_END_4= RULE_END
            	    {
            	    otherlv_1=(Token)match(input,Config,FOLLOW_5); 

            	    									newLeafNode(otherlv_1, grammarAccess.getEHPCAccess().getConfigKeyword_0_0_0());
            	    								
            	    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

            	    									newLeafNode(this_BEGIN_2, grammarAccess.getEHPCAccess().getBEGINTerminalRuleCall_0_0_1());
            	    								
            	    // InternalOptimizationParser.g:2099:9: ( (lv_config_3_0= ruleEHPCConfig ) )
            	    // InternalOptimizationParser.g:2100:10: (lv_config_3_0= ruleEHPCConfig )
            	    {
            	    // InternalOptimizationParser.g:2100:10: (lv_config_3_0= ruleEHPCConfig )
            	    // InternalOptimizationParser.g:2101:11: lv_config_3_0= ruleEHPCConfig
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

            	    this_END_4=(Token)match(input,RULE_END,FOLLOW_24); 

            	    									newLeafNode(this_END_4, grammarAccess.getEHPCAccess().getENDTerminalRuleCall_0_0_3());
            	    								

            	    }

            	    // InternalOptimizationParser.g:2123:8: (otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END )
            	    // InternalOptimizationParser.g:2124:9: otherlv_5= Data this_BEGIN_6= RULE_BEGIN ( (lv_data_7_0= ruleEHPCData ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Data,FOLLOW_5); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEHPCAccess().getDataKeyword_0_1_0());
            	    								
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

            	    									newLeafNode(this_BEGIN_6, grammarAccess.getEHPCAccess().getBEGINTerminalRuleCall_0_1_1());
            	    								
            	    // InternalOptimizationParser.g:2132:9: ( (lv_data_7_0= ruleEHPCData ) )
            	    // InternalOptimizationParser.g:2133:10: (lv_data_7_0= ruleEHPCData )
            	    {
            	    // InternalOptimizationParser.g:2133:10: (lv_data_7_0= ruleEHPCData )
            	    // InternalOptimizationParser.g:2134:11: lv_data_7_0= ruleEHPCData
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

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_42); 

            	    									newLeafNode(this_END_8, grammarAccess.getEHPCAccess().getENDTerminalRuleCall_0_1_3());
            	    								

            	    }

            	    // InternalOptimizationParser.g:2156:8: ( (lv_mpi_9_0= ruleEMPICase ) )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==Mpi) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalOptimizationParser.g:2157:9: (lv_mpi_9_0= ruleEMPICase )
            	            {
            	            // InternalOptimizationParser.g:2157:9: (lv_mpi_9_0= ruleEMPICase )
            	            // InternalOptimizationParser.g:2158:10: lv_mpi_9_0= ruleEMPICase
            	            {

            	            										newCompositeNode(grammarAccess.getEHPCAccess().getMpiEMPICaseParserRuleCall_0_2_0());
            	            									
            	            pushFollow(FOLLOW_43);
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
            	    // InternalOptimizationParser.g:2181:3: ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2181:3: ({...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) ) )
            	    // InternalOptimizationParser.g:2182:4: {...}? => ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2182:98: ( ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) ) )
            	    // InternalOptimizationParser.g:2183:5: ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2186:8: ({...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) ) )
            	    // InternalOptimizationParser.g:2186:9: {...}? => ( (lv_openmp_10_0= ruleEOPENMPCase ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "true");
            	    }
            	    // InternalOptimizationParser.g:2186:18: ( (lv_openmp_10_0= ruleEOPENMPCase ) )
            	    // InternalOptimizationParser.g:2186:19: (lv_openmp_10_0= ruleEOPENMPCase )
            	    {
            	    // InternalOptimizationParser.g:2186:19: (lv_openmp_10_0= ruleEOPENMPCase )
            	    // InternalOptimizationParser.g:2187:9: lv_openmp_10_0= ruleEOPENMPCase
            	    {

            	    									newCompositeNode(grammarAccess.getEHPCAccess().getOpenmpEOPENMPCaseParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_43);
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
            	    // InternalOptimizationParser.g:2209:3: ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2209:3: ({...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) ) )
            	    // InternalOptimizationParser.g:2210:4: {...}? => ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:2210:98: ( ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) ) )
            	    // InternalOptimizationParser.g:2211:5: ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:2214:8: ({...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) ) )
            	    // InternalOptimizationParser.g:2214:9: {...}? => ( (lv_openacc_11_0= ruleEOPENACCCase ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "true");
            	    }
            	    // InternalOptimizationParser.g:2214:18: ( (lv_openacc_11_0= ruleEOPENACCCase ) )
            	    // InternalOptimizationParser.g:2214:19: (lv_openacc_11_0= ruleEOPENACCCase )
            	    {
            	    // InternalOptimizationParser.g:2214:19: (lv_openacc_11_0= ruleEOPENACCCase )
            	    // InternalOptimizationParser.g:2215:9: lv_openacc_11_0= ruleEOPENACCCase
            	    {

            	    									newCompositeNode(grammarAccess.getEHPCAccess().getOpenaccEOPENACCCaseParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_43);
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
            	    // InternalOptimizationParser.g:2237:3: ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2237:3: ({...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) ) )
            	    // InternalOptimizationParser.g:2238:4: {...}? => ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:2238:98: ( ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) ) )
            	    // InternalOptimizationParser.g:2239:5: ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:2242:8: ({...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) ) )
            	    // InternalOptimizationParser.g:2242:9: {...}? => ( (lv_opencl_12_0= ruleEOPENCLCase ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPC", "true");
            	    }
            	    // InternalOptimizationParser.g:2242:18: ( (lv_opencl_12_0= ruleEOPENCLCase ) )
            	    // InternalOptimizationParser.g:2242:19: (lv_opencl_12_0= ruleEOPENCLCase )
            	    {
            	    // InternalOptimizationParser.g:2242:19: (lv_opencl_12_0= ruleEOPENCLCase )
            	    // InternalOptimizationParser.g:2243:9: lv_opencl_12_0= ruleEOPENCLCase
            	    {

            	    									newCompositeNode(grammarAccess.getEHPCAccess().getOpenclEOPENCLCaseParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_43);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalOptimizationParser.g:2276:1: entryRuleEOPENCLCase returns [EObject current=null] : iv_ruleEOPENCLCase= ruleEOPENCLCase EOF ;
    public final EObject entryRuleEOPENCLCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENCLCase = null;


        try {
            // InternalOptimizationParser.g:2276:52: (iv_ruleEOPENCLCase= ruleEOPENCLCase EOF )
            // InternalOptimizationParser.g:2277:2: iv_ruleEOPENCLCase= ruleEOPENCLCase EOF
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
    // InternalOptimizationParser.g:2283:1: ruleEOPENCLCase returns [EObject current=null] : (otherlv_0= Opencl this_BEGIN_1= RULE_BEGIN ( (lv_opencl_2_0= ruleEOPENCL ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEOPENCLCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_opencl_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2289:2: ( (otherlv_0= Opencl this_BEGIN_1= RULE_BEGIN ( (lv_opencl_2_0= ruleEOPENCL ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:2290:2: (otherlv_0= Opencl this_BEGIN_1= RULE_BEGIN ( (lv_opencl_2_0= ruleEOPENCL ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:2290:2: (otherlv_0= Opencl this_BEGIN_1= RULE_BEGIN ( (lv_opencl_2_0= ruleEOPENCL ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2291:3: otherlv_0= Opencl this_BEGIN_1= RULE_BEGIN ( (lv_opencl_2_0= ruleEOPENCL ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Opencl,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEOPENCLCaseAccess().getOpenclKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEOPENCLCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:2299:3: ( (lv_opencl_2_0= ruleEOPENCL ) )
            // InternalOptimizationParser.g:2300:4: (lv_opencl_2_0= ruleEOPENCL )
            {
            // InternalOptimizationParser.g:2300:4: (lv_opencl_2_0= ruleEOPENCL )
            // InternalOptimizationParser.g:2301:5: lv_opencl_2_0= ruleEOPENCL
            {

            					newCompositeNode(grammarAccess.getEOPENCLCaseAccess().getOpenclEOPENCLParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalOptimizationParser.g:2326:1: entryRuleEOPENACCCase returns [EObject current=null] : iv_ruleEOPENACCCase= ruleEOPENACCCase EOF ;
    public final EObject entryRuleEOPENACCCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENACCCase = null;


        try {
            // InternalOptimizationParser.g:2326:53: (iv_ruleEOPENACCCase= ruleEOPENACCCase EOF )
            // InternalOptimizationParser.g:2327:2: iv_ruleEOPENACCCase= ruleEOPENACCCase EOF
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
    // InternalOptimizationParser.g:2333:1: ruleEOPENACCCase returns [EObject current=null] : (otherlv_0= Openacc this_BEGIN_1= RULE_BEGIN ( (lv_openacc_2_0= ruleEOPENACC ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEOPENACCCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_openacc_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2339:2: ( (otherlv_0= Openacc this_BEGIN_1= RULE_BEGIN ( (lv_openacc_2_0= ruleEOPENACC ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:2340:2: (otherlv_0= Openacc this_BEGIN_1= RULE_BEGIN ( (lv_openacc_2_0= ruleEOPENACC ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:2340:2: (otherlv_0= Openacc this_BEGIN_1= RULE_BEGIN ( (lv_openacc_2_0= ruleEOPENACC ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2341:3: otherlv_0= Openacc this_BEGIN_1= RULE_BEGIN ( (lv_openacc_2_0= ruleEOPENACC ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Openacc,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEOPENACCCaseAccess().getOpenaccKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEOPENACCCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:2349:3: ( (lv_openacc_2_0= ruleEOPENACC ) )
            // InternalOptimizationParser.g:2350:4: (lv_openacc_2_0= ruleEOPENACC )
            {
            // InternalOptimizationParser.g:2350:4: (lv_openacc_2_0= ruleEOPENACC )
            // InternalOptimizationParser.g:2351:5: lv_openacc_2_0= ruleEOPENACC
            {

            					newCompositeNode(grammarAccess.getEOPENACCCaseAccess().getOpenaccEOPENACCParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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
    // InternalOptimizationParser.g:2376:1: entryRuleEOPENMPCase returns [EObject current=null] : iv_ruleEOPENMPCase= ruleEOPENMPCase EOF ;
    public final EObject entryRuleEOPENMPCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENMPCase = null;


        try {
            // InternalOptimizationParser.g:2376:52: (iv_ruleEOPENMPCase= ruleEOPENMPCase EOF )
            // InternalOptimizationParser.g:2377:2: iv_ruleEOPENMPCase= ruleEOPENMPCase EOF
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
    // InternalOptimizationParser.g:2383:1: ruleEOPENMPCase returns [EObject current=null] : (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEOPENMPCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_openmp_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2389:2: ( (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:2390:2: (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:2390:2: (otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2391:3: otherlv_0= Openmp this_BEGIN_1= RULE_BEGIN ( (lv_openmp_2_0= ruleEOPENMP ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Openmp,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEOPENMPCaseAccess().getOpenmpKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_45); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEOPENMPCaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:2399:3: ( (lv_openmp_2_0= ruleEOPENMP ) )
            // InternalOptimizationParser.g:2400:4: (lv_openmp_2_0= ruleEOPENMP )
            {
            // InternalOptimizationParser.g:2400:4: (lv_openmp_2_0= ruleEOPENMP )
            // InternalOptimizationParser.g:2401:5: lv_openmp_2_0= ruleEOPENMP
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
    // InternalOptimizationParser.g:2426:1: entryRuleEMPICase returns [EObject current=null] : iv_ruleEMPICase= ruleEMPICase EOF ;
    public final EObject entryRuleEMPICase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMPICase = null;


        try {
            // InternalOptimizationParser.g:2426:49: (iv_ruleEMPICase= ruleEMPICase EOF )
            // InternalOptimizationParser.g:2427:2: iv_ruleEMPICase= ruleEMPICase EOF
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
    // InternalOptimizationParser.g:2433:1: ruleEMPICase returns [EObject current=null] : (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEMPICase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_mpi_2_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2439:2: ( (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END ) )
            // InternalOptimizationParser.g:2440:2: (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END )
            {
            // InternalOptimizationParser.g:2440:2: (otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END )
            // InternalOptimizationParser.g:2441:3: otherlv_0= Mpi this_BEGIN_1= RULE_BEGIN ( (lv_mpi_2_0= ruleEMPI ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Mpi,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEMPICaseAccess().getMpiKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_46); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEMPICaseAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalOptimizationParser.g:2449:3: ( (lv_mpi_2_0= ruleEMPI ) )
            // InternalOptimizationParser.g:2450:4: (lv_mpi_2_0= ruleEMPI )
            {
            // InternalOptimizationParser.g:2450:4: (lv_mpi_2_0= ruleEMPI )
            // InternalOptimizationParser.g:2451:5: lv_mpi_2_0= ruleEMPI
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
    // InternalOptimizationParser.g:2476:1: entryRuleEHPCConfig returns [EObject current=null] : iv_ruleEHPCConfig= ruleEHPCConfig EOF ;
    public final EObject entryRuleEHPCConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCConfig = null;


        try {
            // InternalOptimizationParser.g:2476:51: (iv_ruleEHPCConfig= ruleEHPCConfig EOF )
            // InternalOptimizationParser.g:2477:2: iv_ruleEHPCConfig= ruleEHPCConfig EOF
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
    // InternalOptimizationParser.g:2483:1: ruleEHPCConfig returns [EObject current=null] : (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )* ) ;
    public final EObject ruleEHPCConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_parallelisation_1_0 = null;

        AntlrDatatypeRuleToken lv_parallelisation_3_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:2489:2: ( (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )* ) )
            // InternalOptimizationParser.g:2490:2: (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )* )
            {
            // InternalOptimizationParser.g:2490:2: (otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )* )
            // InternalOptimizationParser.g:2491:3: otherlv_0= Parallelisation ( (lv_parallelisation_1_0= ruleEParallelisation ) ) (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )*
            {
            otherlv_0=(Token)match(input,Parallelisation,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getEHPCConfigAccess().getParallelisationKeyword_0());
            		
            // InternalOptimizationParser.g:2495:3: ( (lv_parallelisation_1_0= ruleEParallelisation ) )
            // InternalOptimizationParser.g:2496:4: (lv_parallelisation_1_0= ruleEParallelisation )
            {
            // InternalOptimizationParser.g:2496:4: (lv_parallelisation_1_0= ruleEParallelisation )
            // InternalOptimizationParser.g:2497:5: lv_parallelisation_1_0= ruleEParallelisation
            {

            					newCompositeNode(grammarAccess.getEHPCConfigAccess().getParallelisationEParallelisationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalOptimizationParser.g:2514:3: (otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Comma) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalOptimizationParser.g:2515:4: otherlv_2= Comma ( (lv_parallelisation_3_0= ruleEParallelisation ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_47); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEHPCConfigAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalOptimizationParser.g:2519:4: ( (lv_parallelisation_3_0= ruleEParallelisation ) )
            	    // InternalOptimizationParser.g:2520:5: (lv_parallelisation_3_0= ruleEParallelisation )
            	    {
            	    // InternalOptimizationParser.g:2520:5: (lv_parallelisation_3_0= ruleEParallelisation )
            	    // InternalOptimizationParser.g:2521:6: lv_parallelisation_3_0= ruleEParallelisation
            	    {

            	    						newCompositeNode(grammarAccess.getEHPCConfigAccess().getParallelisationEParallelisationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
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
            	    break loop23;
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
    // InternalOptimizationParser.g:2543:1: entryRuleEParallelisation returns [String current=null] : iv_ruleEParallelisation= ruleEParallelisation EOF ;
    public final String entryRuleEParallelisation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEParallelisation = null;


        try {
            // InternalOptimizationParser.g:2543:56: (iv_ruleEParallelisation= ruleEParallelisation EOF )
            // InternalOptimizationParser.g:2544:2: iv_ruleEParallelisation= ruleEParallelisation EOF
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
    // InternalOptimizationParser.g:2550:1: ruleEParallelisation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL ) ;
    public final AntlrDatatypeRuleToken ruleEParallelisation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:2556:2: ( (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL ) )
            // InternalOptimizationParser.g:2557:2: (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL )
            {
            // InternalOptimizationParser.g:2557:2: (kw= MPI | kw= OPENMP | kw= OPENACC | kw= OPENCL )
            int alt24=4;
            switch ( input.LA(1) ) {
            case MPI:
                {
                alt24=1;
                }
                break;
            case OPENMP:
                {
                alt24=2;
                }
                break;
            case OPENACC:
                {
                alt24=3;
                }
                break;
            case OPENCL:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalOptimizationParser.g:2558:3: kw= MPI
                    {
                    kw=(Token)match(input,MPI,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEParallelisationAccess().getMPIKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:2564:3: kw= OPENMP
                    {
                    kw=(Token)match(input,OPENMP,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEParallelisationAccess().getOPENMPKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:2570:3: kw= OPENACC
                    {
                    kw=(Token)match(input,OPENACC,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEParallelisationAccess().getOPENACCKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalOptimizationParser.g:2576:3: kw= OPENCL
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
    // InternalOptimizationParser.g:2585:1: entryRuleEHPCData returns [EObject current=null] : iv_ruleEHPCData= ruleEHPCData EOF ;
    public final EObject entryRuleEHPCData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCData = null;


        try {
            // InternalOptimizationParser.g:2585:49: (iv_ruleEHPCData= ruleEHPCData EOF )
            // InternalOptimizationParser.g:2586:2: iv_ruleEHPCData= ruleEHPCData EOF
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
    // InternalOptimizationParser.g:2592:1: ruleEHPCData returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) ) ;
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
            // InternalOptimizationParser.g:2598:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:2599:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:2599:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:2600:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:2600:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* ) )
            // InternalOptimizationParser.g:2601:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2604:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )* )
            // InternalOptimizationParser.g:2605:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )*
            {
            // InternalOptimizationParser.g:2605:5: ( ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) ) )*
            loop25:
            do {
                int alt25=6;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == Location && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == Basedata && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 == Size && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 == Count && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3) ) {
                    alt25=4;
                }
                else if ( LA25_0 == Etl && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4) ) {
                    alt25=5;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOptimizationParser.g:2606:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2606:3: ({...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2607:4: {...}? => ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2607:102: ( ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:2608:5: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2611:8: ({...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:2611:9: {...}? => (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2611:18: (otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:2611:19: otherlv_1= Location ( (lv_location_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Location,FOLLOW_22); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEHPCDataAccess().getLocationKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:2615:8: ( (lv_location_2_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:2616:9: (lv_location_2_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:2616:9: (lv_location_2_0= RULE_STRING )
            	    // InternalOptimizationParser.g:2617:10: lv_location_2_0= RULE_STRING
            	    {
            	    lv_location_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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
            	    // InternalOptimizationParser.g:2639:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2639:3: ({...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2640:4: {...}? => ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2640:102: ( ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) ) )
            	    // InternalOptimizationParser.g:2641:5: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2644:8: ({...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) ) )
            	    // InternalOptimizationParser.g:2644:9: {...}? => (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2644:18: (otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) ) )
            	    // InternalOptimizationParser.g:2644:19: otherlv_3= Basedata ( (lv_basedata_4_0= ruleEHPCBasedata ) )
            	    {
            	    otherlv_3=(Token)match(input,Basedata,FOLLOW_49); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEHPCDataAccess().getBasedataKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:2648:8: ( (lv_basedata_4_0= ruleEHPCBasedata ) )
            	    // InternalOptimizationParser.g:2649:9: (lv_basedata_4_0= ruleEHPCBasedata )
            	    {
            	    // InternalOptimizationParser.g:2649:9: (lv_basedata_4_0= ruleEHPCBasedata )
            	    // InternalOptimizationParser.g:2650:10: lv_basedata_4_0= ruleEHPCBasedata
            	    {

            	    										newCompositeNode(grammarAccess.getEHPCDataAccess().getBasedataEHPCBasedataParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_34);
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
            	    // InternalOptimizationParser.g:2673:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2673:3: ({...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2674:4: {...}? => ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:2674:102: ( ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:2675:5: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:2678:8: ({...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:2678:9: {...}? => (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2678:18: (otherlv_5= Size ( (lv_size_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:2678:19: otherlv_5= Size ( (lv_size_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Size,FOLLOW_33); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEHPCDataAccess().getSizeKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:2682:8: ( (lv_size_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:2683:9: (lv_size_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:2683:9: (lv_size_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:2684:10: lv_size_6_0= RULE_INT
            	    {
            	    lv_size_6_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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
            	    // InternalOptimizationParser.g:2706:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2706:3: ({...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2707:4: {...}? => ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:2707:102: ( ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:2708:5: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:2711:8: ({...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:2711:9: {...}? => (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2711:18: (otherlv_7= Count ( (lv_count_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:2711:19: otherlv_7= Count ( (lv_count_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Count,FOLLOW_33); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEHPCDataAccess().getCountKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:2715:8: ( (lv_count_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:2716:9: (lv_count_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:2716:9: (lv_count_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:2717:10: lv_count_8_0= RULE_INT
            	    {
            	    lv_count_8_0=(Token)match(input,RULE_INT,FOLLOW_34); 

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
            	    // InternalOptimizationParser.g:2739:3: ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2739:3: ({...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalOptimizationParser.g:2740:4: {...}? => ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:2740:102: ( ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) ) )
            	    // InternalOptimizationParser.g:2741:5: ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCDataAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:2744:8: ({...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END ) )
            	    // InternalOptimizationParser.g:2744:9: {...}? => (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCData", "true");
            	    }
            	    // InternalOptimizationParser.g:2744:18: (otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END )
            	    // InternalOptimizationParser.g:2744:19: otherlv_9= Etl this_BEGIN_10= RULE_BEGIN ( (lv_etl_11_0= ruleEHPCETL ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Etl,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEHPCDataAccess().getEtlKeyword_4_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getEHPCDataAccess().getBEGINTerminalRuleCall_4_1());
            	    							
            	    // InternalOptimizationParser.g:2752:8: ( (lv_etl_11_0= ruleEHPCETL ) )
            	    // InternalOptimizationParser.g:2753:9: (lv_etl_11_0= ruleEHPCETL )
            	    {
            	    // InternalOptimizationParser.g:2753:9: (lv_etl_11_0= ruleEHPCETL )
            	    // InternalOptimizationParser.g:2754:10: lv_etl_11_0= ruleEHPCETL
            	    {

            	    										newCompositeNode(grammarAccess.getEHPCDataAccess().getEtlEHPCETLParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_7);
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

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_34); 

            	    								newLeafNode(this_END_12, grammarAccess.getEHPCDataAccess().getENDTerminalRuleCall_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEHPCDataAccess().getUnorderedGroup());
            	    				

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
    // InternalOptimizationParser.g:2791:1: entryRuleEHPCETL returns [EObject current=null] : iv_ruleEHPCETL= ruleEHPCETL EOF ;
    public final EObject entryRuleEHPCETL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHPCETL = null;


        try {
            // InternalOptimizationParser.g:2791:48: (iv_ruleEHPCETL= ruleEHPCETL EOF )
            // InternalOptimizationParser.g:2792:2: iv_ruleEHPCETL= ruleEHPCETL EOF
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
    // InternalOptimizationParser.g:2798:1: ruleEHPCETL returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEHPCETL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_prefetch_2_0=null;
        Token otherlv_3=null;
        Token lv_cache_4_0=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:2804:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalOptimizationParser.g:2805:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalOptimizationParser.g:2805:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalOptimizationParser.g:2806:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalOptimizationParser.g:2806:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalOptimizationParser.g:2807:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEHPCETLAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2810:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalOptimizationParser.g:2811:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalOptimizationParser.g:2811:5: ( ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == Prefetch && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == Cache && getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalOptimizationParser.g:2812:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2812:3: ({...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2813:4: {...}? => ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2813:101: ( ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:2814:5: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2817:8: ({...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:2817:9: {...}? => (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "true");
            	    }
            	    // InternalOptimizationParser.g:2817:18: (otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:2817:19: otherlv_1= Prefetch ( (lv_prefetch_2_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_1=(Token)match(input,Prefetch,FOLLOW_8); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEHPCETLAccess().getPrefetchKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:2821:8: ( (lv_prefetch_2_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:2822:9: (lv_prefetch_2_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:2822:9: (lv_prefetch_2_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:2823:10: lv_prefetch_2_0= RULE_BOOLEAN
            	    {
            	    lv_prefetch_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_37); 

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
            	    // InternalOptimizationParser.g:2845:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2845:3: ({...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2846:4: {...}? => ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2846:101: ( ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalOptimizationParser.g:2847:5: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEHPCETLAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2850:8: ({...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalOptimizationParser.g:2850:9: {...}? => (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEHPCETL", "true");
            	    }
            	    // InternalOptimizationParser.g:2850:18: (otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) ) )
            	    // InternalOptimizationParser.g:2850:19: otherlv_3= Cache ( (lv_cache_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,Cache,FOLLOW_8); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEHPCETLAccess().getCacheKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:2854:8: ( (lv_cache_4_0= RULE_BOOLEAN ) )
            	    // InternalOptimizationParser.g:2855:9: (lv_cache_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalOptimizationParser.g:2855:9: (lv_cache_4_0= RULE_BOOLEAN )
            	    // InternalOptimizationParser.g:2856:10: lv_cache_4_0= RULE_BOOLEAN
            	    {
            	    lv_cache_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_37); 

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
            	    break loop26;
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
    // InternalOptimizationParser.g:2888:1: entryRuleEHPCBasedata returns [String current=null] : iv_ruleEHPCBasedata= ruleEHPCBasedata EOF ;
    public final String entryRuleEHPCBasedata() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEHPCBasedata = null;


        try {
            // InternalOptimizationParser.g:2888:52: (iv_ruleEHPCBasedata= ruleEHPCBasedata EOF )
            // InternalOptimizationParser.g:2889:2: iv_ruleEHPCBasedata= ruleEHPCBasedata EOF
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
    // InternalOptimizationParser.g:2895:1: ruleEHPCBasedata returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= IMAGE | kw= RESTART ) ;
    public final AntlrDatatypeRuleToken ruleEHPCBasedata() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:2901:2: ( (kw= IMAGE | kw= RESTART ) )
            // InternalOptimizationParser.g:2902:2: (kw= IMAGE | kw= RESTART )
            {
            // InternalOptimizationParser.g:2902:2: (kw= IMAGE | kw= RESTART )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IMAGE) ) {
                alt27=1;
            }
            else if ( (LA27_0==RESTART) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalOptimizationParser.g:2903:3: kw= IMAGE
                    {
                    kw=(Token)match(input,IMAGE,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEHPCBasedataAccess().getIMAGEKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:2909:3: kw= RESTART
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
    // InternalOptimizationParser.g:2918:1: entryRuleEMPI returns [EObject current=null] : iv_ruleEMPI= ruleEMPI EOF ;
    public final EObject entryRuleEMPI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMPI = null;


        try {
            // InternalOptimizationParser.g:2918:45: (iv_ruleEMPI= ruleEMPI EOF )
            // InternalOptimizationParser.g:2919:2: iv_ruleEMPI= ruleEMPI EOF
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
    // InternalOptimizationParser.g:2925:1: ruleEMPI returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalOptimizationParser.g:2931:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:2932:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:2932:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:2933:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:2933:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:2934:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEMPIAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:2937:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:2938:5: ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:2938:5: ( ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=6;
                int LA28_0 = input.LA(1);

                if ( LA28_0 == Library && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1) ) {
                    alt28=2;
                }
                else if ( LA28_0 == Scaling_efficiency && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2) ) {
                    alt28=3;
                }
                else if ( LA28_0 == Core_subscription && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3) ) {
                    alt28=4;
                }
                else if ( LA28_0 == Message_size && getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4) ) {
                    alt28=5;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOptimizationParser.g:2939:3: ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2939:3: ({...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2940:4: {...}? => ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:2940:98: ( ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) ) )
            	    // InternalOptimizationParser.g:2941:5: ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:2944:8: ({...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) ) )
            	    // InternalOptimizationParser.g:2944:9: {...}? => (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:2944:18: (otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) ) )
            	    // InternalOptimizationParser.g:2944:19: otherlv_1= Library ( (lv_library_2_0= ruleEMPILibrary ) )
            	    {
            	    otherlv_1=(Token)match(input,Library,FOLLOW_50); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEMPIAccess().getLibraryKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:2948:8: ( (lv_library_2_0= ruleEMPILibrary ) )
            	    // InternalOptimizationParser.g:2949:9: (lv_library_2_0= ruleEMPILibrary )
            	    {
            	    // InternalOptimizationParser.g:2949:9: (lv_library_2_0= ruleEMPILibrary )
            	    // InternalOptimizationParser.g:2950:10: lv_library_2_0= ruleEMPILibrary
            	    {

            	    										newCompositeNode(grammarAccess.getEMPIAccess().getLibraryEMPILibraryParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_51);
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
            	    // InternalOptimizationParser.g:2973:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:2973:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:2974:4: {...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:2974:98: ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:2975:5: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:2978:8: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:2978:9: {...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:2978:18: (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:2978:19: otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Version,FOLLOW_22); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEMPIAccess().getVersionKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:2982:8: ( (lv_version_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:2983:9: (lv_version_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:2983:9: (lv_version_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:2984:10: lv_version_4_0= RULE_STRING
            	    {
            	    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

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
            	    // InternalOptimizationParser.g:3006:3: ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3006:3: ({...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3007:4: {...}? => ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3007:98: ( ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) ) )
            	    // InternalOptimizationParser.g:3008:5: ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3011:8: ({...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) ) )
            	    // InternalOptimizationParser.g:3011:9: {...}? => (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3011:18: (otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) ) )
            	    // InternalOptimizationParser.g:3011:19: otherlv_5= Scaling_efficiency ( (lv_scaling_efficiency_6_0= ruleRealValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Scaling_efficiency,FOLLOW_52); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEMPIAccess().getScaling_efficiencyKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3015:8: ( (lv_scaling_efficiency_6_0= ruleRealValue ) )
            	    // InternalOptimizationParser.g:3016:9: (lv_scaling_efficiency_6_0= ruleRealValue )
            	    {
            	    // InternalOptimizationParser.g:3016:9: (lv_scaling_efficiency_6_0= ruleRealValue )
            	    // InternalOptimizationParser.g:3017:10: lv_scaling_efficiency_6_0= ruleRealValue
            	    {

            	    										newCompositeNode(grammarAccess.getEMPIAccess().getScaling_efficiencyRealValueParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_51);
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
            	    // InternalOptimizationParser.g:3040:3: ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3040:3: ({...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3041:4: {...}? => ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalOptimizationParser.g:3041:98: ( ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3042:5: ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalOptimizationParser.g:3045:8: ({...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3045:9: {...}? => (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3045:18: (otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3045:19: otherlv_7= Core_subscription ( (lv_core_subscription_8_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,Core_subscription,FOLLOW_33); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEMPIAccess().getCore_subscriptionKeyword_3_0());
            	    							
            	    // InternalOptimizationParser.g:3049:8: ( (lv_core_subscription_8_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3050:9: (lv_core_subscription_8_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3050:9: (lv_core_subscription_8_0= RULE_INT )
            	    // InternalOptimizationParser.g:3051:10: lv_core_subscription_8_0= RULE_INT
            	    {
            	    lv_core_subscription_8_0=(Token)match(input,RULE_INT,FOLLOW_51); 

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
            	    // InternalOptimizationParser.g:3073:3: ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3073:3: ({...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3074:4: {...}? => ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalOptimizationParser.g:3074:98: ( ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) ) )
            	    // InternalOptimizationParser.g:3075:5: ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEMPIAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalOptimizationParser.g:3078:8: ({...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) ) )
            	    // InternalOptimizationParser.g:3078:9: {...}? => (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEMPI", "true");
            	    }
            	    // InternalOptimizationParser.g:3078:18: (otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) ) )
            	    // InternalOptimizationParser.g:3078:19: otherlv_9= Message_size ( (lv_message_size_10_0= ruleEMPIMessageSize ) )
            	    {
            	    otherlv_9=(Token)match(input,Message_size,FOLLOW_53); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEMPIAccess().getMessage_sizeKeyword_4_0());
            	    							
            	    // InternalOptimizationParser.g:3082:8: ( (lv_message_size_10_0= ruleEMPIMessageSize ) )
            	    // InternalOptimizationParser.g:3083:9: (lv_message_size_10_0= ruleEMPIMessageSize )
            	    {
            	    // InternalOptimizationParser.g:3083:9: (lv_message_size_10_0= ruleEMPIMessageSize )
            	    // InternalOptimizationParser.g:3084:10: lv_message_size_10_0= ruleEMPIMessageSize
            	    {

            	    										newCompositeNode(grammarAccess.getEMPIAccess().getMessage_sizeEMPIMessageSizeParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_51);
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
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // InternalOptimizationParser.g:3118:1: entryRuleEMPILibrary returns [String current=null] : iv_ruleEMPILibrary= ruleEMPILibrary EOF ;
    public final String entryRuleEMPILibrary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMPILibrary = null;


        try {
            // InternalOptimizationParser.g:3118:51: (iv_ruleEMPILibrary= ruleEMPILibrary EOF )
            // InternalOptimizationParser.g:3119:2: iv_ruleEMPILibrary= ruleEMPILibrary EOF
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
    // InternalOptimizationParser.g:3125:1: ruleEMPILibrary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Mvapch | kw= Opnmpi ) ;
    public final AntlrDatatypeRuleToken ruleEMPILibrary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3131:2: ( (kw= Mvapch | kw= Opnmpi ) )
            // InternalOptimizationParser.g:3132:2: (kw= Mvapch | kw= Opnmpi )
            {
            // InternalOptimizationParser.g:3132:2: (kw= Mvapch | kw= Opnmpi )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Mvapch) ) {
                alt29=1;
            }
            else if ( (LA29_0==Opnmpi) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalOptimizationParser.g:3133:3: kw= Mvapch
                    {
                    kw=(Token)match(input,Mvapch,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPILibraryAccess().getMvapchKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3139:3: kw= Opnmpi
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
    // InternalOptimizationParser.g:3148:1: entryRuleEMPIMessageSize returns [String current=null] : iv_ruleEMPIMessageSize= ruleEMPIMessageSize EOF ;
    public final String entryRuleEMPIMessageSize() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEMPIMessageSize = null;


        try {
            // InternalOptimizationParser.g:3148:55: (iv_ruleEMPIMessageSize= ruleEMPIMessageSize EOF )
            // InternalOptimizationParser.g:3149:2: iv_ruleEMPIMessageSize= ruleEMPIMessageSize EOF
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
    // InternalOptimizationParser.g:3155:1: ruleEMPIMessageSize returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Small | kw= Medium | kw= Large ) ;
    public final AntlrDatatypeRuleToken ruleEMPIMessageSize() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3161:2: ( (kw= Small | kw= Medium | kw= Large ) )
            // InternalOptimizationParser.g:3162:2: (kw= Small | kw= Medium | kw= Large )
            {
            // InternalOptimizationParser.g:3162:2: (kw= Small | kw= Medium | kw= Large )
            int alt30=3;
            switch ( input.LA(1) ) {
            case Small:
                {
                alt30=1;
                }
                break;
            case Medium:
                {
                alt30=2;
                }
                break;
            case Large:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalOptimizationParser.g:3163:3: kw= Small
                    {
                    kw=(Token)match(input,Small,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPIMessageSizeAccess().getSmallKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3169:3: kw= Medium
                    {
                    kw=(Token)match(input,Medium,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEMPIMessageSizeAccess().getMediumKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalOptimizationParser.g:3175:3: kw= Large
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
    // InternalOptimizationParser.g:3184:1: entryRuleEOPENMP returns [EObject current=null] : iv_ruleEOPENMP= ruleEOPENMP EOF ;
    public final EObject entryRuleEOPENMP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENMP = null;


        try {
            // InternalOptimizationParser.g:3184:48: (iv_ruleEOPENMP= ruleEOPENMP EOF )
            // InternalOptimizationParser.g:3185:2: iv_ruleEOPENMP= ruleEOPENMP EOF
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
    // InternalOptimizationParser.g:3191:1: ruleEOPENMP returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalOptimizationParser.g:3197:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3198:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3198:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3199:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3199:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3200:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOPENMPAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3203:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3204:5: ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3204:5: ( ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=4;
                int LA31_0 = input.LA(1);

                if ( LA31_0 == Number_of_threads && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 == Scaling_efficiency && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1) ) {
                    alt31=2;
                }
                else if ( LA31_0 == Affinity && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2) ) {
                    alt31=3;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalOptimizationParser.g:3205:3: ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3205:3: ({...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3206:4: {...}? => ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3206:101: ( ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3207:5: ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3210:8: ({...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3210:9: {...}? => (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "true");
            	    }
            	    // InternalOptimizationParser.g:3210:18: (otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3210:19: otherlv_1= Number_of_threads ( (lv_number_of_threads_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,Number_of_threads,FOLLOW_33); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOPENMPAccess().getNumber_of_threadsKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3214:8: ( (lv_number_of_threads_2_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3215:9: (lv_number_of_threads_2_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3215:9: (lv_number_of_threads_2_0= RULE_INT )
            	    // InternalOptimizationParser.g:3216:10: lv_number_of_threads_2_0= RULE_INT
            	    {
            	    lv_number_of_threads_2_0=(Token)match(input,RULE_INT,FOLLOW_54); 

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
            	    // InternalOptimizationParser.g:3238:3: ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3238:3: ({...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3239:4: {...}? => ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3239:101: ( ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) ) )
            	    // InternalOptimizationParser.g:3240:5: ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3243:8: ({...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) ) )
            	    // InternalOptimizationParser.g:3243:9: {...}? => (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "true");
            	    }
            	    // InternalOptimizationParser.g:3243:18: (otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) ) )
            	    // InternalOptimizationParser.g:3243:19: otherlv_3= Scaling_efficiency ( (lv_scaling_efficiency_4_0= ruleRealValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Scaling_efficiency,FOLLOW_52); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOPENMPAccess().getScaling_efficiencyKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3247:8: ( (lv_scaling_efficiency_4_0= ruleRealValue ) )
            	    // InternalOptimizationParser.g:3248:9: (lv_scaling_efficiency_4_0= ruleRealValue )
            	    {
            	    // InternalOptimizationParser.g:3248:9: (lv_scaling_efficiency_4_0= ruleRealValue )
            	    // InternalOptimizationParser.g:3249:10: lv_scaling_efficiency_4_0= ruleRealValue
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENMPAccess().getScaling_efficiencyRealValueParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_54);
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
            	    // InternalOptimizationParser.g:3272:3: ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3272:3: ({...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3273:4: {...}? => ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3273:101: ( ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) ) )
            	    // InternalOptimizationParser.g:3274:5: ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENMPAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3277:8: ({...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) ) )
            	    // InternalOptimizationParser.g:3277:9: {...}? => (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENMP", "true");
            	    }
            	    // InternalOptimizationParser.g:3277:18: (otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) ) )
            	    // InternalOptimizationParser.g:3277:19: otherlv_5= Affinity ( (lv_affinity_6_0= ruleEOPENAffinity ) )
            	    {
            	    otherlv_5=(Token)match(input,Affinity,FOLLOW_55); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEOPENMPAccess().getAffinityKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3281:8: ( (lv_affinity_6_0= ruleEOPENAffinity ) )
            	    // InternalOptimizationParser.g:3282:9: (lv_affinity_6_0= ruleEOPENAffinity )
            	    {
            	    // InternalOptimizationParser.g:3282:9: (lv_affinity_6_0= ruleEOPENAffinity )
            	    // InternalOptimizationParser.g:3283:10: lv_affinity_6_0= ruleEOPENAffinity
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENMPAccess().getAffinityEOPENAffinityParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_54);
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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // InternalOptimizationParser.g:3317:1: entryRuleEOPENAffinity returns [String current=null] : iv_ruleEOPENAffinity= ruleEOPENAffinity EOF ;
    public final String entryRuleEOPENAffinity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOPENAffinity = null;


        try {
            // InternalOptimizationParser.g:3317:53: (iv_ruleEOPENAffinity= ruleEOPENAffinity EOF )
            // InternalOptimizationParser.g:3318:2: iv_ruleEOPENAffinity= ruleEOPENAffinity EOF
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
    // InternalOptimizationParser.g:3324:1: ruleEOPENAffinity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Block | kw= Simple ) ;
    public final AntlrDatatypeRuleToken ruleEOPENAffinity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3330:2: ( (kw= Block | kw= Simple ) )
            // InternalOptimizationParser.g:3331:2: (kw= Block | kw= Simple )
            {
            // InternalOptimizationParser.g:3331:2: (kw= Block | kw= Simple )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Block) ) {
                alt32=1;
            }
            else if ( (LA32_0==Simple) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalOptimizationParser.g:3332:3: kw= Block
                    {
                    kw=(Token)match(input,Block,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEOPENAffinityAccess().getBlockKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3338:3: kw= Simple
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
    // InternalOptimizationParser.g:3347:1: entryRuleEOPENACC returns [EObject current=null] : iv_ruleEOPENACC= ruleEOPENACC EOF ;
    public final EObject entryRuleEOPENACC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENACC = null;


        try {
            // InternalOptimizationParser.g:3347:49: (iv_ruleEOPENACC= ruleEOPENACC EOF )
            // InternalOptimizationParser.g:3348:2: iv_ruleEOPENACC= ruleEOPENACC EOF
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
    // InternalOptimizationParser.g:3354:1: ruleEOPENACC returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalOptimizationParser.g:3360:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3361:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3361:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3362:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3362:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3363:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOPENACCAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3366:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3367:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3367:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=4;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == Compiler && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 == Number_of_acc && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2) ) {
                    alt33=3;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalOptimizationParser.g:3368:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3368:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3369:4: {...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3369:102: ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    // InternalOptimizationParser.g:3370:5: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3373:8: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    // InternalOptimizationParser.g:3373:9: {...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "true");
            	    }
            	    // InternalOptimizationParser.g:3373:18: (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    // InternalOptimizationParser.g:3373:19: otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) )
            	    {
            	    otherlv_1=(Token)match(input,Compiler,FOLLOW_56); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOPENACCAccess().getCompilerKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3377:8: ( (lv_compiler_2_0= ruleECompiler ) )
            	    // InternalOptimizationParser.g:3378:9: (lv_compiler_2_0= ruleECompiler )
            	    {
            	    // InternalOptimizationParser.g:3378:9: (lv_compiler_2_0= ruleECompiler )
            	    // InternalOptimizationParser.g:3379:10: lv_compiler_2_0= ruleECompiler
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENACCAccess().getCompilerECompilerParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_57);
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
            	    // InternalOptimizationParser.g:3402:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3402:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3403:4: {...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3403:102: ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:3404:5: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3407:8: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:3407:9: {...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "true");
            	    }
            	    // InternalOptimizationParser.g:3407:18: (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:3407:19: otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Version,FOLLOW_22); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOPENACCAccess().getVersionKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3411:8: ( (lv_version_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:3412:9: (lv_version_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:3412:9: (lv_version_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:3413:10: lv_version_4_0= RULE_STRING
            	    {
            	    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

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
            	    // InternalOptimizationParser.g:3435:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3435:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3436:4: {...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3436:102: ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3437:5: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENACCAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3440:8: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3440:9: {...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENACC", "true");
            	    }
            	    // InternalOptimizationParser.g:3440:18: (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3440:19: otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Number_of_acc,FOLLOW_33); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEOPENACCAccess().getNumber_of_accKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3444:8: ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3445:9: (lv_number_of_acc_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3445:9: (lv_number_of_acc_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:3446:10: lv_number_of_acc_6_0= RULE_INT
            	    {
            	    lv_number_of_acc_6_0=(Token)match(input,RULE_INT,FOLLOW_57); 

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
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
    // InternalOptimizationParser.g:3479:1: entryRuleEOPENCL returns [EObject current=null] : iv_ruleEOPENCL= ruleEOPENCL EOF ;
    public final EObject entryRuleEOPENCL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOPENCL = null;


        try {
            // InternalOptimizationParser.g:3479:48: (iv_ruleEOPENCL= ruleEOPENCL EOF )
            // InternalOptimizationParser.g:3480:2: iv_ruleEOPENCL= ruleEOPENCL EOF
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
    // InternalOptimizationParser.g:3486:1: ruleEOPENCL returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalOptimizationParser.g:3492:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalOptimizationParser.g:3493:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalOptimizationParser.g:3493:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalOptimizationParser.g:3494:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalOptimizationParser.g:3494:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalOptimizationParser.g:3495:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEOPENCLAccess().getUnorderedGroup());
            			
            // InternalOptimizationParser.g:3498:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalOptimizationParser.g:3499:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalOptimizationParser.g:3499:5: ( ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=4;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == Compiler && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == Version && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1) ) {
                    alt34=2;
                }
                else if ( LA34_0 == Number_of_acc && getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2) ) {
                    alt34=3;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalOptimizationParser.g:3500:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3500:3: ({...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3501:4: {...}? => ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalOptimizationParser.g:3501:101: ( ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) ) )
            	    // InternalOptimizationParser.g:3502:5: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalOptimizationParser.g:3505:8: ({...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) ) )
            	    // InternalOptimizationParser.g:3505:9: {...}? => (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "true");
            	    }
            	    // InternalOptimizationParser.g:3505:18: (otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) ) )
            	    // InternalOptimizationParser.g:3505:19: otherlv_1= Compiler ( (lv_compiler_2_0= ruleECompiler ) )
            	    {
            	    otherlv_1=(Token)match(input,Compiler,FOLLOW_56); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEOPENCLAccess().getCompilerKeyword_0_0());
            	    							
            	    // InternalOptimizationParser.g:3509:8: ( (lv_compiler_2_0= ruleECompiler ) )
            	    // InternalOptimizationParser.g:3510:9: (lv_compiler_2_0= ruleECompiler )
            	    {
            	    // InternalOptimizationParser.g:3510:9: (lv_compiler_2_0= ruleECompiler )
            	    // InternalOptimizationParser.g:3511:10: lv_compiler_2_0= ruleECompiler
            	    {

            	    										newCompositeNode(grammarAccess.getEOPENCLAccess().getCompilerECompilerParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_57);
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
            	    // InternalOptimizationParser.g:3534:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3534:3: ({...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3535:4: {...}? => ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalOptimizationParser.g:3535:101: ( ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) ) )
            	    // InternalOptimizationParser.g:3536:5: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalOptimizationParser.g:3539:8: ({...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) ) )
            	    // InternalOptimizationParser.g:3539:9: {...}? => (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "true");
            	    }
            	    // InternalOptimizationParser.g:3539:18: (otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) ) )
            	    // InternalOptimizationParser.g:3539:19: otherlv_3= Version ( (lv_version_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Version,FOLLOW_22); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEOPENCLAccess().getVersionKeyword_1_0());
            	    							
            	    // InternalOptimizationParser.g:3543:8: ( (lv_version_4_0= RULE_STRING ) )
            	    // InternalOptimizationParser.g:3544:9: (lv_version_4_0= RULE_STRING )
            	    {
            	    // InternalOptimizationParser.g:3544:9: (lv_version_4_0= RULE_STRING )
            	    // InternalOptimizationParser.g:3545:10: lv_version_4_0= RULE_STRING
            	    {
            	    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

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
            	    // InternalOptimizationParser.g:3567:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalOptimizationParser.g:3567:3: ({...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalOptimizationParser.g:3568:4: {...}? => ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalOptimizationParser.g:3568:101: ( ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) ) )
            	    // InternalOptimizationParser.g:3569:5: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEOPENCLAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalOptimizationParser.g:3572:8: ({...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) ) )
            	    // InternalOptimizationParser.g:3572:9: {...}? => (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOPENCL", "true");
            	    }
            	    // InternalOptimizationParser.g:3572:18: (otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) ) )
            	    // InternalOptimizationParser.g:3572:19: otherlv_5= Number_of_acc ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,Number_of_acc,FOLLOW_33); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEOPENCLAccess().getNumber_of_accKeyword_2_0());
            	    							
            	    // InternalOptimizationParser.g:3576:8: ( (lv_number_of_acc_6_0= RULE_INT ) )
            	    // InternalOptimizationParser.g:3577:9: (lv_number_of_acc_6_0= RULE_INT )
            	    {
            	    // InternalOptimizationParser.g:3577:9: (lv_number_of_acc_6_0= RULE_INT )
            	    // InternalOptimizationParser.g:3578:10: lv_number_of_acc_6_0= RULE_INT
            	    {
            	    lv_number_of_acc_6_0=(Token)match(input,RULE_INT,FOLLOW_57); 

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
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
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
    // InternalOptimizationParser.g:3611:1: entryRuleECompiler returns [String current=null] : iv_ruleECompiler= ruleECompiler EOF ;
    public final String entryRuleECompiler() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleECompiler = null;


        try {
            // InternalOptimizationParser.g:3611:49: (iv_ruleECompiler= ruleECompiler EOF )
            // InternalOptimizationParser.g:3612:2: iv_ruleECompiler= ruleECompiler EOF
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
    // InternalOptimizationParser.g:3618:1: ruleECompiler returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Pgi | kw= Cray ) ;
    public final AntlrDatatypeRuleToken ruleECompiler() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalOptimizationParser.g:3624:2: ( (kw= Pgi | kw= Cray ) )
            // InternalOptimizationParser.g:3625:2: (kw= Pgi | kw= Cray )
            {
            // InternalOptimizationParser.g:3625:2: (kw= Pgi | kw= Cray )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Pgi) ) {
                alt35=1;
            }
            else if ( (LA35_0==Cray) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalOptimizationParser.g:3626:3: kw= Pgi
                    {
                    kw=(Token)match(input,Pgi,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getECompilerAccess().getPgiKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3632:3: kw= Cray
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
    // InternalOptimizationParser.g:3641:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalOptimizationParser.g:3643:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalOptimizationParser.g:3644:2: iv_ruleREAL= ruleREAL EOF
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
    // InternalOptimizationParser.g:3653:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_EXT_INT_2=null;
        Token this_INT_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalOptimizationParser.g:3660:2: ( ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) ) )
            // InternalOptimizationParser.g:3661:2: ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )
            {
            // InternalOptimizationParser.g:3661:2: ( (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )
            // InternalOptimizationParser.g:3662:3: (this_INT_0= RULE_INT )? kw= FullStop (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
            {
            // InternalOptimizationParser.g:3662:3: (this_INT_0= RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalOptimizationParser.g:3663:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_58); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,FullStop,FOLLOW_59); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            // InternalOptimizationParser.g:3676:3: (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_EXT_INT) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_INT) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalOptimizationParser.g:3677:4: this_EXT_INT_2= RULE_EXT_INT
                    {
                    this_EXT_INT_2=(Token)match(input,RULE_EXT_INT,FOLLOW_2); 

                    				current.merge(this_EXT_INT_2);
                    			

                    				newLeafNode(this_EXT_INT_2, grammarAccess.getREALAccess().getEXT_INTTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalOptimizationParser.g:3685:4: this_INT_3= RULE_INT
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
    // InternalOptimizationParser.g:3700:1: entryRuleRealValue returns [String current=null] : iv_ruleRealValue= ruleRealValue EOF ;
    public final String entryRuleRealValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRealValue = null;


        try {
            // InternalOptimizationParser.g:3700:49: (iv_ruleRealValue= ruleRealValue EOF )
            // InternalOptimizationParser.g:3701:2: iv_ruleRealValue= ruleRealValue EOF
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
    // InternalOptimizationParser.g:3707:1: ruleRealValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_REAL_0= ruleREAL ;
    public final AntlrDatatypeRuleToken ruleRealValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_REAL_0 = null;



        	enterRule();

        try {
            // InternalOptimizationParser.g:3713:2: (this_REAL_0= ruleREAL )
            // InternalOptimizationParser.g:3714:2: this_REAL_0= ruleREAL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000240000L,0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000021080000L,0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0068100000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000020000000000L,0x0000000000C00100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000840000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0080008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000002010020L,0x0000000000008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0800001200000000L,0x0000008000042000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x2000200004000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000000L,0x0000008000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000400000000000L,0x0000008000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000440000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000010000000L,0x00000000000100A0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0010000002010022L,0x0000000000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000008009050L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0800001200000002L,0x0000000000042000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400002000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400002000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000440000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0068100000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0068100000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400400004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000080000480L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000480000020180L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0301000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000480000020182L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000020010000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4000000000000000L,0x0000000000005000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000080000482L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000202L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000004020000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000400400004002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});

}
