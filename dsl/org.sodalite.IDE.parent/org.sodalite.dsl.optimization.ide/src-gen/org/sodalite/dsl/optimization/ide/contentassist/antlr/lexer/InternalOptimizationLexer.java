package org.sodalite.dsl.optimization.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOptimizationLexer extends Lexer {
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

    public InternalOptimizationLexer() {;} 
    public InternalOptimizationLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOptimizationLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOptimizationLexer.g"; }

    // $ANTLR start "Reinforncement_learning"
    public final void mReinforncement_learning() throws RecognitionException {
        try {
            int _type = Reinforncement_learning;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:14:25: ( 'reinforncement_learning' )
            // InternalOptimizationLexer.g:14:27: 'reinforncement_learning'
            {
            match("reinforncement_learning"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reinforncement_learning"

    // $ANTLR start "Distributed_training"
    public final void mDistributed_training() throws RecognitionException {
        try {
            int _type = Distributed_training;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:16:22: ( 'distributed_training:' )
            // InternalOptimizationLexer.g:16:24: 'distributed_training:'
            {
            match("distributed_training:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Distributed_training"

    // $ANTLR start "Image_classification"
    public final void mImage_classification() throws RecognitionException {
        try {
            int _type = Image_classification;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:18:22: ( 'Image_classification' )
            // InternalOptimizationLexer.g:18:24: 'Image_classification'
            {
            match("Image_classification"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Image_classification"

    // $ANTLR start "Scaling_efficiency"
    public final void mScaling_efficiency() throws RecognitionException {
        try {
            int _type = Scaling_efficiency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:20:20: ( 'scaling_efficiency:' )
            // InternalOptimizationLexer.g:20:22: 'scaling_efficiency:'
            {
            match("scaling_efficiency:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Scaling_efficiency"

    // $ANTLR start "Core_subscription"
    public final void mCore_subscription() throws RecognitionException {
        try {
            int _type = Core_subscription;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:22:19: ( 'core_subscription:' )
            // InternalOptimizationLexer.g:22:21: 'core_subscription:'
            {
            match("core_subscription:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Core_subscription"

    // $ANTLR start "Enable_autotuning"
    public final void mEnable_autotuning() throws RecognitionException {
        try {
            int _type = Enable_autotuning;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:24:19: ( 'enable_autotuning:' )
            // InternalOptimizationLexer.g:24:21: 'enable_autotuning:'
            {
            match("enable_autotuning:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enable_autotuning"

    // $ANTLR start "Number_of_threads"
    public final void mNumber_of_threads() throws RecognitionException {
        try {
            int _type = Number_of_threads;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:26:19: ( 'number_of_threads:' )
            // InternalOptimizationLexer.g:26:21: 'number_of_threads:'
            {
            match("number_of_threads:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number_of_threads"

    // $ANTLR start "Enable_opt_build"
    public final void mEnable_opt_build() throws RecognitionException {
        try {
            int _type = Enable_opt_build;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:28:18: ( 'enable_opt_build:' )
            // InternalOptimizationLexer.g:28:20: 'enable_opt_build:'
            {
            match("enable_opt_build:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enable_opt_build"

    // $ANTLR start "Object_detection"
    public final void mObject_detection() throws RecognitionException {
        try {
            int _type = Object_detection;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:30:18: ( 'object_detection' )
            // InternalOptimizationLexer.g:30:20: 'object_detection'
            {
            match("object_detection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Object_detection"

    // $ANTLR start "Parallelisation"
    public final void mParallelisation() throws RecognitionException {
        try {
            int _type = Parallelisation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:32:17: ( 'parallelisation:' )
            // InternalOptimizationLexer.g:32:19: 'parallelisation:'
            {
            match("parallelisation:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parallelisation"

    // $ANTLR start "Number_of_acc"
    public final void mNumber_of_acc() throws RecognitionException {
        try {
            int _type = Number_of_acc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:34:15: ( 'number_of_acc:' )
            // InternalOptimizationLexer.g:34:17: 'number_of_acc:'
            {
            match("number_of_acc:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number_of_acc"

    // $ANTLR start "Recommendation"
    public final void mRecommendation() throws RecognitionException {
        try {
            int _type = Recommendation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:36:16: ( 'recommendation' )
            // InternalOptimizationLexer.g:36:18: 'recommendation'
            {
            match("recommendation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Recommendation"

    // $ANTLR start "Ai_framework"
    public final void mAi_framework() throws RecognitionException {
        try {
            int _type = Ai_framework;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:38:14: ( 'ai_framework:' )
            // InternalOptimizationLexer.g:38:16: 'ai_framework:'
            {
            match("ai_framework:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ai_framework"

    // $ANTLR start "Message_size"
    public final void mMessage_size() throws RecognitionException {
        try {
            int _type = Message_size;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:40:14: ( 'message_size:' )
            // InternalOptimizationLexer.g:40:16: 'message_size:'
            {
            match("message_size:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Message_size"

    // $ANTLR start "AI_Inference"
    public final void mAI_Inference() throws RecognitionException {
        try {
            int _type = AI_Inference;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:42:14: ( 'AI_Inference' )
            // InternalOptimizationLexer.g:42:16: 'AI_Inference'
            {
            match("AI_Inference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AI_Inference"

    // $ANTLR start "Ai_training"
    public final void mAi_training() throws RecognitionException {
        try {
            int _type = Ai_training;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:44:13: ( 'ai_training:' )
            // InternalOptimizationLexer.g:44:15: 'ai_training:'
            {
            match("ai_training:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ai_training"

    // $ANTLR start "Optimization"
    public final void mOptimization() throws RecognitionException {
        try {
            int _type = Optimization;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:46:14: ( 'optimization' )
            // InternalOptimizationLexer.g:46:16: 'optimization'
            {
            match("optimization"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Optimization"

    // $ANTLR start "AI_Training"
    public final void mAI_Training() throws RecognitionException {
        try {
            int _type = AI_Training;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:48:13: ( 'AI_Training' )
            // InternalOptimizationLexer.g:48:15: 'AI_Training'
            {
            match("AI_Training"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AI_Training"

    // $ANTLR start "Constraint"
    public final void mConstraint() throws RecognitionException {
        try {
            int _type = Constraint;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:50:12: ( 'Constraint:' )
            // InternalOptimizationLexer.g:50:14: 'Constraint:'
            {
            match("Constraint:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constraint"

    // $ANTLR start "FPGAXilinx"
    public final void mFPGAXilinx() throws RecognitionException {
        try {
            int _type = FPGAXilinx;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:52:12: ( 'FPGA-Xilinx' )
            // InternalOptimizationLexer.g:52:14: 'FPGA-Xilinx'
            {
            match("FPGA-Xilinx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FPGAXilinx"

    // $ANTLR start "NVIDIAV100"
    public final void mNVIDIAV100() throws RecognitionException {
        try {
            int _type = NVIDIAV100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:54:12: ( 'NVIDIA-V100' )
            // InternalOptimizationLexer.g:54:14: 'NVIDIA-V100'
            {
            match("NVIDIA-V100"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NVIDIAV100"

    // $ANTLR start "Autotuning"
    public final void mAutotuning() throws RecognitionException {
        try {
            int _type = Autotuning;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:56:12: ( 'autotuning:' )
            // InternalOptimizationLexer.g:56:14: 'autotuning:'
            {
            match("autotuning:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Autotuning"

    // $ANTLR start "Parameters"
    public final void mParameters() throws RecognitionException {
        try {
            int _type = Parameters;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:58:12: ( 'parameters:' )
            // InternalOptimizationLexer.g:58:14: 'parameters:'
            {
            match("parameters:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Parameters"

    // $ANTLR start "Tensorflow"
    public final void mTensorflow() throws RecognitionException {
        try {
            int _type = Tensorflow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:60:12: ( 'tensorflow:' )
            // InternalOptimizationLexer.g:60:14: 'tensorflow:'
            {
            match("tensorflow:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tensorflow"

    // $ANTLR start "Translation"
    public final void mTranslation() throws RecognitionException {
        try {
            int _type = Translation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:62:13: ( 'translation' )
            // InternalOptimizationLexer.g:62:15: 'translation'
            {
            match("translation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Translation"

    // $ANTLR start "TensorFlow"
    public final void mTensorFlow() throws RecognitionException {
        try {
            int _type = TensorFlow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:64:12: ( 'TensorFlow' )
            // InternalOptimizationLexer.g:64:14: 'TensorFlow'
            {
            match("TensorFlow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TensorFlow"

    // $ANTLR start "Opt_build"
    public final void mOpt_build() throws RecognitionException {
        try {
            int _type = Opt_build;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:66:11: ( 'opt_build:' )
            // InternalOptimizationLexer.g:66:13: 'opt_build:'
            {
            match("opt_build:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Opt_build"

    // $ANTLR start "Acc_type"
    public final void mAcc_type() throws RecognitionException {
        try {
            int _type = Acc_type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:68:10: ( 'acc_type:' )
            // InternalOptimizationLexer.g:68:12: 'acc_type:'
            {
            match("acc_type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Acc_type"

    // $ANTLR start "Affinity"
    public final void mAffinity() throws RecognitionException {
        try {
            int _type = Affinity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:70:10: ( 'affinity:' )
            // InternalOptimizationLexer.g:70:12: 'affinity:'
            {
            match("affinity:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Affinity"

    // $ANTLR start "App_type"
    public final void mApp_type() throws RecognitionException {
        try {
            int _type = App_type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:72:10: ( 'app_type:' )
            // InternalOptimizationLexer.g:72:12: 'app_type:'
            {
            match("app_type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "App_type"

    // $ANTLR start "Basedata"
    public final void mBasedata() throws RecognitionException {
        try {
            int _type = Basedata;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:74:10: ( 'basedata:' )
            // InternalOptimizationLexer.g:74:12: 'basedata:'
            {
            match("basedata:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Basedata"

    // $ANTLR start "Compiler"
    public final void mCompiler() throws RecognitionException {
        try {
            int _type = Compiler;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:76:10: ( 'compiler:' )
            // InternalOptimizationLexer.g:76:12: 'compiler:'
            {
            match("compiler:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Compiler"

    // $ANTLR start "Cpu_type"
    public final void mCpu_type() throws RecognitionException {
        try {
            int _type = Cpu_type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:78:10: ( 'cpu_type:' )
            // InternalOptimizationLexer.g:78:12: 'cpu_type:'
            {
            match("cpu_type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cpu_type"

    // $ANTLR start "Location"
    public final void mLocation() throws RecognitionException {
        try {
            int _type = Location;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:80:10: ( 'location:' )
            // InternalOptimizationLexer.g:80:12: 'location:'
            {
            match("location:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Location"

    // $ANTLR start "Prefetch"
    public final void mPrefetch() throws RecognitionException {
        try {
            int _type = Prefetch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:82:10: ( 'prefetch:' )
            // InternalOptimizationLexer.g:82:12: 'prefetch:'
            {
            match("prefetch:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Prefetch"

    // $ANTLR start "AMDM100"
    public final void mAMDM100() throws RecognitionException {
        try {
            int _type = AMDM100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:84:9: ( 'AMD-M100' )
            // InternalOptimizationLexer.g:84:11: 'AMD-M100'
            {
            match("AMD-M100"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMDM100"

    // $ANTLR start "AUTOTUNE"
    public final void mAUTOTUNE() throws RecognitionException {
        try {
            int _type = AUTOTUNE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:86:10: ( 'AUTOTUNE' )
            // InternalOptimizationLexer.g:86:12: 'AUTOTUNE'
            {
            match("AUTOTUNE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AUTOTUNE"

    // $ANTLR start "Imagenet"
    public final void mImagenet() throws RecognitionException {
        try {
            int _type = Imagenet;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:88:10: ( 'Imagenet' )
            // InternalOptimizationLexer.g:88:12: 'Imagenet'
            {
            match("Imagenet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Imagenet"

    // $ANTLR start "Intelx86"
    public final void mIntelx86() throws RecognitionException {
        try {
            int _type = Intelx86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:90:10: ( 'Intelx86' )
            // InternalOptimizationLexer.g:90:12: 'Intelx86'
            {
            match("Intelx86"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Intelx86"

    // $ANTLR start "Backend"
    public final void mBackend() throws RecognitionException {
        try {
            int _type = Backend;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:92:9: ( 'backend:' )
            // InternalOptimizationLexer.g:92:11: 'backend:'
            {
            match("backend:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Backend"

    // $ANTLR start "Library"
    public final void mLibrary() throws RecognitionException {
        try {
            int _type = Library;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:94:9: ( 'library:' )
            // InternalOptimizationLexer.g:94:11: 'library:'
            {
            match("library:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Library"

    // $ANTLR start "Openacc"
    public final void mOpenacc() throws RecognitionException {
        try {
            int _type = Openacc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:96:9: ( 'openacc:' )
            // InternalOptimizationLexer.g:96:11: 'openacc:'
            {
            match("openacc:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Openacc"

    // $ANTLR start "PyTorch_1"
    public final void mPyTorch_1() throws RecognitionException {
        try {
            int _type = PyTorch_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:98:11: ( 'pyTorch:' )
            // InternalOptimizationLexer.g:98:13: 'pyTorch:'
            {
            match("pyTorch:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PyTorch_1"

    // $ANTLR start "Version"
    public final void mVersion() throws RecognitionException {
        try {
            int _type = Version;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:100:9: ( 'version:' )
            // InternalOptimizationLexer.g:100:11: 'version:'
            {
            match("version:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Version"

    // $ANTLR start "BigData"
    public final void mBigData() throws RecognitionException {
        try {
            int _type = BigData;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:102:9: ( 'BigData' )
            // InternalOptimizationLexer.g:102:11: 'BigData'
            {
            match("BigData"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BigData"

    // $ANTLR start "OPENACC"
    public final void mOPENACC() throws RecognitionException {
        try {
            int _type = OPENACC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:104:9: ( 'OPENACC' )
            // InternalOptimizationLexer.g:104:11: 'OPENACC'
            {
            match("OPENACC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENACC"

    // $ANTLR start "PyTorch"
    public final void mPyTorch() throws RecognitionException {
        try {
            int _type = PyTorch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:106:9: ( 'PyTorch' )
            // InternalOptimizationLexer.g:106:11: 'PyTorch'
            {
            match("PyTorch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PyTorch"

    // $ANTLR start "RESTART"
    public final void mRESTART() throws RecognitionException {
        try {
            int _type = RESTART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:108:9: ( 'RESTART' )
            // InternalOptimizationLexer.g:108:11: 'RESTART'
            {
            match("RESTART"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RESTART"

    // $ANTLR start "Config"
    public final void mConfig() throws RecognitionException {
        try {
            int _type = Config;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:110:8: ( 'config:' )
            // InternalOptimizationLexer.g:110:10: 'config:'
            {
            match("config:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Config"

    // $ANTLR start "Layers"
    public final void mLayers() throws RecognitionException {
        try {
            int _type = Layers;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:112:8: ( 'layers:' )
            // InternalOptimizationLexer.g:112:10: 'layers:'
            {
            match("layers:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Layers"

    // $ANTLR start "Opencl"
    public final void mOpencl() throws RecognitionException {
        try {
            int _type = Opencl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:114:8: ( 'opencl:' )
            // InternalOptimizationLexer.g:114:10: 'opencl:'
            {
            match("opencl:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Opencl"

    // $ANTLR start "Openmp"
    public final void mOpenmp() throws RecognitionException {
        try {
            int _type = Openmp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:116:8: ( 'openmp:' )
            // InternalOptimizationLexer.g:116:10: 'openmp:'
            {
            match("openmp:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Openmp"

    // $ANTLR start "CREATA"
    public final void mCREATA() throws RecognitionException {
        try {
            int _type = CREATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:118:8: ( 'CREATA' )
            // InternalOptimizationLexer.g:118:10: 'CREATA'
            {
            match("CREATA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATA"

    // $ANTLR start "OPENCL"
    public final void mOPENCL() throws RecognitionException {
        try {
            int _type = OPENCL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:120:8: ( 'OPENCL' )
            // InternalOptimizationLexer.g:120:10: 'OPENCL'
            {
            match("OPENCL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENCL"

    // $ANTLR start "OPENMP"
    public final void mOPENMP() throws RecognitionException {
        try {
            int _type = OPENMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:122:8: ( 'OPENMP' )
            // InternalOptimizationLexer.g:122:10: 'OPENMP'
            {
            match("OPENMP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPENMP"

    // $ANTLR start "Cache"
    public final void mCache() throws RecognitionException {
        try {
            int _type = Cache;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:124:7: ( 'cache:' )
            // InternalOptimizationLexer.g:124:9: 'cache:'
            {
            match("cache:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cache"

    // $ANTLR start "Count"
    public final void mCount() throws RecognitionException {
        try {
            int _type = Count;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:126:7: ( 'count:' )
            // InternalOptimizationLexer.g:126:9: 'count:'
            {
            match("count:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Count"

    // $ANTLR start "Input"
    public final void mInput() throws RecognitionException {
        try {
            int _type = Input;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:128:7: ( 'input:' )
            // InternalOptimizationLexer.g:128:9: 'input:'
            {
            match("input:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Input"

    // $ANTLR start "Keras_1"
    public final void mKeras_1() throws RecognitionException {
        try {
            int _type = Keras_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:130:9: ( 'keras:' )
            // InternalOptimizationLexer.g:130:11: 'keras:'
            {
            match("keras:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Keras_1"

    // $ANTLR start "Medium"
    public final void mMedium() throws RecognitionException {
        try {
            int _type = Medium;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:132:8: ( 'medium' )
            // InternalOptimizationLexer.g:132:10: 'medium'
            {
            match("medium"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Medium"

    // $ANTLR start "Mvapch"
    public final void mMvapch() throws RecognitionException {
        try {
            int _type = Mvapch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:134:8: ( 'mvapch' )
            // InternalOptimizationLexer.g:134:10: 'mvapch'
            {
            match("mvapch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mvapch"

    // $ANTLR start "Opnmpi"
    public final void mOpnmpi() throws RecognitionException {
        try {
            int _type = Opnmpi;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:136:8: ( 'opnmpi' )
            // InternalOptimizationLexer.g:136:10: 'opnmpi'
            {
            match("opnmpi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Opnmpi"

    // $ANTLR start "Simple"
    public final void mSimple() throws RecognitionException {
        try {
            int _type = Simple;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:138:8: ( 'simple' )
            // InternalOptimizationLexer.g:138:10: 'simple'
            {
            match("simple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Simple"

    // $ANTLR start "Tuner"
    public final void mTuner() throws RecognitionException {
        try {
            int _type = Tuner;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:140:7: ( 'tuner:' )
            // InternalOptimizationLexer.g:140:9: 'tuner:'
            {
            match("tuner:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tuner"

    // $ANTLR start "CIFAR"
    public final void mCIFAR() throws RecognitionException {
        try {
            int _type = CIFAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:142:7: ( 'CIFAR' )
            // InternalOptimizationLexer.g:142:9: 'CIFAR'
            {
            match("CIFAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CIFAR"

    // $ANTLR start "IMAGE"
    public final void mIMAGE() throws RecognitionException {
        try {
            int _type = IMAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:144:7: ( 'IMAGE' )
            // InternalOptimizationLexer.g:144:9: 'IMAGE'
            {
            match("IMAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMAGE"

    // $ANTLR start "Keras"
    public final void mKeras() throws RecognitionException {
        try {
            int _type = Keras;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:146:7: ( 'Keras' )
            // InternalOptimizationLexer.g:146:9: 'Keras'
            {
            match("Keras"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Keras"

    // $ANTLR start "MNIST"
    public final void mMNIST() throws RecognitionException {
        try {
            int _type = MNIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:148:7: ( 'MNIST' )
            // InternalOptimizationLexer.g:148:9: 'MNIST'
            {
            match("MNIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MNIST"

    // $ANTLR start "MXNet"
    public final void mMXNet() throws RecognitionException {
        try {
            int _type = MXNet;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:150:7: ( 'MXNet' )
            // InternalOptimizationLexer.g:150:9: 'MXNet'
            {
            match("MXNet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MXNet"

    // $ANTLR start "Power"
    public final void mPower() throws RecognitionException {
        try {
            int _type = Power;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:152:7: ( 'Power' )
            // InternalOptimizationLexer.g:152:9: 'Power'
            {
            match("Power"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Power"

    // $ANTLR start "Block"
    public final void mBlock() throws RecognitionException {
        try {
            int _type = Block;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:154:7: ( 'block' )
            // InternalOptimizationLexer.g:154:9: 'block'
            {
            match("block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Block"

    // $ANTLR start "Data"
    public final void mData() throws RecognitionException {
        try {
            int _type = Data;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:156:6: ( 'data:' )
            // InternalOptimizationLexer.g:156:8: 'data:'
            {
            match("data:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Data"

    // $ANTLR start "Glow"
    public final void mGlow() throws RecognitionException {
        try {
            int _type = Glow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:158:6: ( 'glow:' )
            // InternalOptimizationLexer.g:158:8: 'glow:'
            {
            match("glow:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Glow"

    // $ANTLR start "Large"
    public final void mLarge() throws RecognitionException {
        try {
            int _type = Large;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:160:7: ( 'large' )
            // InternalOptimizationLexer.g:160:9: 'large'
            {
            match("large"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Large"

    // $ANTLR start "Size"
    public final void mSize() throws RecognitionException {
        try {
            int _type = Size;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:162:6: ( 'size:' )
            // InternalOptimizationLexer.g:162:8: 'size:'
            {
            match("size:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Size"

    // $ANTLR start "Small"
    public final void mSmall() throws RecognitionException {
        try {
            int _type = Small;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:164:7: ( 'small' )
            // InternalOptimizationLexer.g:164:9: 'small'
            {
            match("small"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Small"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:166:6: ( 'type:' )
            // InternalOptimizationLexer.g:166:8: 'type:'
            {
            match("type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "CNTK"
    public final void mCNTK() throws RecognitionException {
        try {
            int _type = CNTK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:168:6: ( 'CNTK' )
            // InternalOptimizationLexer.g:168:8: 'CNTK'
            {
            match("CNTK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CNTK"

    // $ANTLR start "Cray"
    public final void mCray() throws RecognitionException {
        try {
            int _type = Cray;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:170:6: ( 'cray' )
            // InternalOptimizationLexer.g:170:8: 'cray'
            {
            match("cray"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cray"

    // $ANTLR start "Etl"
    public final void mEtl() throws RecognitionException {
        try {
            int _type = Etl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:172:5: ( 'etl:' )
            // InternalOptimizationLexer.g:172:7: 'etl:'
            {
            match("etl:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Etl"

    // $ANTLR start "Hpc"
    public final void mHpc() throws RecognitionException {
        try {
            int _type = Hpc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:174:5: ( 'hpc:' )
            // InternalOptimizationLexer.g:174:7: 'hpc:'
            {
            match("hpc:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Hpc"

    // $ANTLR start "Mpi"
    public final void mMpi() throws RecognitionException {
        try {
            int _type = Mpi;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:176:5: ( 'mpi:' )
            // InternalOptimizationLexer.g:176:7: 'mpi:'
            {
            match("mpi:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mpi"

    // $ANTLR start "Xla"
    public final void mXla() throws RecognitionException {
        try {
            int _type = Xla;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:178:5: ( 'xla:' )
            // InternalOptimizationLexer.g:178:7: 'xla:'
            {
            match("xla:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Xla"

    // $ANTLR start "AMD"
    public final void mAMD() throws RecognitionException {
        try {
            int _type = AMD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:180:5: ( 'AMD' )
            // InternalOptimizationLexer.g:180:7: 'AMD'
            {
            match("AMD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMD"

    // $ANTLR start "ARM"
    public final void mARM() throws RecognitionException {
        try {
            int _type = ARM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:182:5: ( 'ARM' )
            // InternalOptimizationLexer.g:182:7: 'ARM'
            {
            match("ARM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARM"

    // $ANTLR start "HPC"
    public final void mHPC() throws RecognitionException {
        try {
            int _type = HPC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:184:5: ( 'HPC' )
            // InternalOptimizationLexer.g:184:7: 'HPC'
            {
            match("HPC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HPC"

    // $ANTLR start "MPI"
    public final void mMPI() throws RecognitionException {
        try {
            int _type = MPI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:186:5: ( 'MPI' )
            // InternalOptimizationLexer.g:186:7: 'MPI'
            {
            match("MPI"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MPI"

    // $ANTLR start "Pgi"
    public final void mPgi() throws RecognitionException {
        try {
            int _type = Pgi;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:188:5: ( 'pgi' )
            // InternalOptimizationLexer.g:188:7: 'pgi'
            {
            match("pgi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pgi"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:190:17: ( '(' )
            // InternalOptimizationLexer.g:190:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:192:18: ( ')' )
            // InternalOptimizationLexer.g:192:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:194:7: ( ',' )
            // InternalOptimizationLexer.g:194:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:196:10: ( '.' )
            // InternalOptimizationLexer.g:196:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:198:7: ( ':' )
            // InternalOptimizationLexer.g:198:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "RULE_BT"
    public final void mRULE_BT() throws RecognitionException {
        try {
            int _type = RULE_BT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:200:9: ( '>' )
            // InternalOptimizationLexer.g:200:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BT"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:202:9: ( '<' )
            // InternalOptimizationLexer.g:202:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_BET"
    public final void mRULE_BET() throws RecognitionException {
        try {
            int _type = RULE_BET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:204:10: ( '>=' )
            // InternalOptimizationLexer.g:204:12: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BET"

    // $ANTLR start "RULE_LET"
    public final void mRULE_LET() throws RecognitionException {
        try {
            int _type = RULE_LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:206:10: ( '<=' )
            // InternalOptimizationLexer.g:206:12: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LET"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:208:12: ( '==' )
            // InternalOptimizationLexer.g:208:14: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_NOT_EQUAL"
    public final void mRULE_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:210:16: ( '!=' )
            // InternalOptimizationLexer.g:210:18: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_EQUAL"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:212:9: ( 'OR' )
            // InternalOptimizationLexer.g:212:11: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:214:10: ( 'AND' )
            // InternalOptimizationLexer.g:214:12: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalOptimizationLexer.g:216:21: ()
            // InternalOptimizationLexer.g:216:23: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEGIN"

    // $ANTLR start "RULE_END"
    public final void mRULE_END() throws RecognitionException {
        try {
            // InternalOptimizationLexer.g:218:19: ()
            // InternalOptimizationLexer.g:218:21: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_END"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:220:14: ( ( 'true' | 'false' ) )
            // InternalOptimizationLexer.g:220:16: ( 'true' | 'false' )
            {
            // InternalOptimizationLexer.g:220:16: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOptimizationLexer.g:220:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalOptimizationLexer.g:220:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_EXT_INT"
    public final void mRULE_EXT_INT() throws RecognitionException {
        try {
            int _type = RULE_EXT_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:222:14: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )
            // InternalOptimizationLexer.g:222:16: RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT
            {
            mRULE_INT(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXT_INT"

    // $ANTLR start "RULE_QUALIFIED_NAME"
    public final void mRULE_QUALIFIED_NAME() throws RecognitionException {
        try {
            int _type = RULE_QUALIFIED_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:224:21: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalOptimizationLexer.g:224:23: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalOptimizationLexer.g:224:31: ( '.' RULE_ID )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='.') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOptimizationLexer.g:224:32: '.' RULE_ID
            	    {
            	    match('.'); 
            	    mRULE_ID(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUALIFIED_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            // InternalOptimizationLexer.g:226:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOptimizationLexer.g:226:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOptimizationLexer.g:226:20: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOptimizationLexer.g:226:20: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalOptimizationLexer.g:226:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOptimizationLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:228:10: ( ( '0' .. '9' )+ )
            // InternalOptimizationLexer.g:228:12: ( '0' .. '9' )+
            {
            // InternalOptimizationLexer.g:228:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOptimizationLexer.g:228:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:230:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOptimizationLexer.g:230:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOptimizationLexer.g:230:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalOptimizationLexer.g:230:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOptimizationLexer.g:230:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOptimizationLexer.g:230:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOptimizationLexer.g:230:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalOptimizationLexer.g:230:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOptimizationLexer.g:230:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalOptimizationLexer.g:230:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOptimizationLexer.g:230:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:232:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOptimizationLexer.g:232:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOptimizationLexer.g:232:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOptimizationLexer.g:232:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:234:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOptimizationLexer.g:234:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOptimizationLexer.g:234:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOptimizationLexer.g:234:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalOptimizationLexer.g:234:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOptimizationLexer.g:234:41: ( '\\r' )? '\\n'
                    {
                    // InternalOptimizationLexer.g:234:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalOptimizationLexer.g:234:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:236:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOptimizationLexer.g:236:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOptimizationLexer.g:236:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOptimizationLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:238:16: ( . )
            // InternalOptimizationLexer.g:238:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalOptimizationLexer.g:1:8: ( Reinforncement_learning | Distributed_training | Image_classification | Scaling_efficiency | Core_subscription | Enable_autotuning | Number_of_threads | Enable_opt_build | Object_detection | Parallelisation | Number_of_acc | Recommendation | Ai_framework | Message_size | AI_Inference | Ai_training | Optimization | AI_Training | Constraint | FPGAXilinx | NVIDIAV100 | Autotuning | Parameters | Tensorflow | Translation | TensorFlow | Opt_build | Acc_type | Affinity | App_type | Basedata | Compiler | Cpu_type | Location | Prefetch | AMDM100 | AUTOTUNE | Imagenet | Intelx86 | Backend | Library | Openacc | PyTorch_1 | Version | BigData | OPENACC | PyTorch | RESTART | Config | Layers | Opencl | Openmp | CREATA | OPENCL | OPENMP | Cache | Count | Input | Keras_1 | Medium | Mvapch | Opnmpi | Simple | Tuner | CIFAR | IMAGE | Keras | MNIST | MXNet | Power | Block | Data | Glow | Large | Size | Small | Type | CNTK | Cray | Etl | Hpc | Mpi | Xla | AMD | ARM | HPC | MPI | Pgi | LeftParenthesis | RightParenthesis | Comma | FullStop | Colon | RULE_BT | RULE_LT | RULE_BET | RULE_LET | RULE_EQUAL | RULE_NOT_EQUAL | RULE_OR | RULE_AND | RULE_BOOLEAN | RULE_EXT_INT | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=110;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalOptimizationLexer.g:1:10: Reinforncement_learning
                {
                mReinforncement_learning(); 

                }
                break;
            case 2 :
                // InternalOptimizationLexer.g:1:34: Distributed_training
                {
                mDistributed_training(); 

                }
                break;
            case 3 :
                // InternalOptimizationLexer.g:1:55: Image_classification
                {
                mImage_classification(); 

                }
                break;
            case 4 :
                // InternalOptimizationLexer.g:1:76: Scaling_efficiency
                {
                mScaling_efficiency(); 

                }
                break;
            case 5 :
                // InternalOptimizationLexer.g:1:95: Core_subscription
                {
                mCore_subscription(); 

                }
                break;
            case 6 :
                // InternalOptimizationLexer.g:1:113: Enable_autotuning
                {
                mEnable_autotuning(); 

                }
                break;
            case 7 :
                // InternalOptimizationLexer.g:1:131: Number_of_threads
                {
                mNumber_of_threads(); 

                }
                break;
            case 8 :
                // InternalOptimizationLexer.g:1:149: Enable_opt_build
                {
                mEnable_opt_build(); 

                }
                break;
            case 9 :
                // InternalOptimizationLexer.g:1:166: Object_detection
                {
                mObject_detection(); 

                }
                break;
            case 10 :
                // InternalOptimizationLexer.g:1:183: Parallelisation
                {
                mParallelisation(); 

                }
                break;
            case 11 :
                // InternalOptimizationLexer.g:1:199: Number_of_acc
                {
                mNumber_of_acc(); 

                }
                break;
            case 12 :
                // InternalOptimizationLexer.g:1:213: Recommendation
                {
                mRecommendation(); 

                }
                break;
            case 13 :
                // InternalOptimizationLexer.g:1:228: Ai_framework
                {
                mAi_framework(); 

                }
                break;
            case 14 :
                // InternalOptimizationLexer.g:1:241: Message_size
                {
                mMessage_size(); 

                }
                break;
            case 15 :
                // InternalOptimizationLexer.g:1:254: AI_Inference
                {
                mAI_Inference(); 

                }
                break;
            case 16 :
                // InternalOptimizationLexer.g:1:267: Ai_training
                {
                mAi_training(); 

                }
                break;
            case 17 :
                // InternalOptimizationLexer.g:1:279: Optimization
                {
                mOptimization(); 

                }
                break;
            case 18 :
                // InternalOptimizationLexer.g:1:292: AI_Training
                {
                mAI_Training(); 

                }
                break;
            case 19 :
                // InternalOptimizationLexer.g:1:304: Constraint
                {
                mConstraint(); 

                }
                break;
            case 20 :
                // InternalOptimizationLexer.g:1:315: FPGAXilinx
                {
                mFPGAXilinx(); 

                }
                break;
            case 21 :
                // InternalOptimizationLexer.g:1:326: NVIDIAV100
                {
                mNVIDIAV100(); 

                }
                break;
            case 22 :
                // InternalOptimizationLexer.g:1:337: Autotuning
                {
                mAutotuning(); 

                }
                break;
            case 23 :
                // InternalOptimizationLexer.g:1:348: Parameters
                {
                mParameters(); 

                }
                break;
            case 24 :
                // InternalOptimizationLexer.g:1:359: Tensorflow
                {
                mTensorflow(); 

                }
                break;
            case 25 :
                // InternalOptimizationLexer.g:1:370: Translation
                {
                mTranslation(); 

                }
                break;
            case 26 :
                // InternalOptimizationLexer.g:1:382: TensorFlow
                {
                mTensorFlow(); 

                }
                break;
            case 27 :
                // InternalOptimizationLexer.g:1:393: Opt_build
                {
                mOpt_build(); 

                }
                break;
            case 28 :
                // InternalOptimizationLexer.g:1:403: Acc_type
                {
                mAcc_type(); 

                }
                break;
            case 29 :
                // InternalOptimizationLexer.g:1:412: Affinity
                {
                mAffinity(); 

                }
                break;
            case 30 :
                // InternalOptimizationLexer.g:1:421: App_type
                {
                mApp_type(); 

                }
                break;
            case 31 :
                // InternalOptimizationLexer.g:1:430: Basedata
                {
                mBasedata(); 

                }
                break;
            case 32 :
                // InternalOptimizationLexer.g:1:439: Compiler
                {
                mCompiler(); 

                }
                break;
            case 33 :
                // InternalOptimizationLexer.g:1:448: Cpu_type
                {
                mCpu_type(); 

                }
                break;
            case 34 :
                // InternalOptimizationLexer.g:1:457: Location
                {
                mLocation(); 

                }
                break;
            case 35 :
                // InternalOptimizationLexer.g:1:466: Prefetch
                {
                mPrefetch(); 

                }
                break;
            case 36 :
                // InternalOptimizationLexer.g:1:475: AMDM100
                {
                mAMDM100(); 

                }
                break;
            case 37 :
                // InternalOptimizationLexer.g:1:483: AUTOTUNE
                {
                mAUTOTUNE(); 

                }
                break;
            case 38 :
                // InternalOptimizationLexer.g:1:492: Imagenet
                {
                mImagenet(); 

                }
                break;
            case 39 :
                // InternalOptimizationLexer.g:1:501: Intelx86
                {
                mIntelx86(); 

                }
                break;
            case 40 :
                // InternalOptimizationLexer.g:1:510: Backend
                {
                mBackend(); 

                }
                break;
            case 41 :
                // InternalOptimizationLexer.g:1:518: Library
                {
                mLibrary(); 

                }
                break;
            case 42 :
                // InternalOptimizationLexer.g:1:526: Openacc
                {
                mOpenacc(); 

                }
                break;
            case 43 :
                // InternalOptimizationLexer.g:1:534: PyTorch_1
                {
                mPyTorch_1(); 

                }
                break;
            case 44 :
                // InternalOptimizationLexer.g:1:544: Version
                {
                mVersion(); 

                }
                break;
            case 45 :
                // InternalOptimizationLexer.g:1:552: BigData
                {
                mBigData(); 

                }
                break;
            case 46 :
                // InternalOptimizationLexer.g:1:560: OPENACC
                {
                mOPENACC(); 

                }
                break;
            case 47 :
                // InternalOptimizationLexer.g:1:568: PyTorch
                {
                mPyTorch(); 

                }
                break;
            case 48 :
                // InternalOptimizationLexer.g:1:576: RESTART
                {
                mRESTART(); 

                }
                break;
            case 49 :
                // InternalOptimizationLexer.g:1:584: Config
                {
                mConfig(); 

                }
                break;
            case 50 :
                // InternalOptimizationLexer.g:1:591: Layers
                {
                mLayers(); 

                }
                break;
            case 51 :
                // InternalOptimizationLexer.g:1:598: Opencl
                {
                mOpencl(); 

                }
                break;
            case 52 :
                // InternalOptimizationLexer.g:1:605: Openmp
                {
                mOpenmp(); 

                }
                break;
            case 53 :
                // InternalOptimizationLexer.g:1:612: CREATA
                {
                mCREATA(); 

                }
                break;
            case 54 :
                // InternalOptimizationLexer.g:1:619: OPENCL
                {
                mOPENCL(); 

                }
                break;
            case 55 :
                // InternalOptimizationLexer.g:1:626: OPENMP
                {
                mOPENMP(); 

                }
                break;
            case 56 :
                // InternalOptimizationLexer.g:1:633: Cache
                {
                mCache(); 

                }
                break;
            case 57 :
                // InternalOptimizationLexer.g:1:639: Count
                {
                mCount(); 

                }
                break;
            case 58 :
                // InternalOptimizationLexer.g:1:645: Input
                {
                mInput(); 

                }
                break;
            case 59 :
                // InternalOptimizationLexer.g:1:651: Keras_1
                {
                mKeras_1(); 

                }
                break;
            case 60 :
                // InternalOptimizationLexer.g:1:659: Medium
                {
                mMedium(); 

                }
                break;
            case 61 :
                // InternalOptimizationLexer.g:1:666: Mvapch
                {
                mMvapch(); 

                }
                break;
            case 62 :
                // InternalOptimizationLexer.g:1:673: Opnmpi
                {
                mOpnmpi(); 

                }
                break;
            case 63 :
                // InternalOptimizationLexer.g:1:680: Simple
                {
                mSimple(); 

                }
                break;
            case 64 :
                // InternalOptimizationLexer.g:1:687: Tuner
                {
                mTuner(); 

                }
                break;
            case 65 :
                // InternalOptimizationLexer.g:1:693: CIFAR
                {
                mCIFAR(); 

                }
                break;
            case 66 :
                // InternalOptimizationLexer.g:1:699: IMAGE
                {
                mIMAGE(); 

                }
                break;
            case 67 :
                // InternalOptimizationLexer.g:1:705: Keras
                {
                mKeras(); 

                }
                break;
            case 68 :
                // InternalOptimizationLexer.g:1:711: MNIST
                {
                mMNIST(); 

                }
                break;
            case 69 :
                // InternalOptimizationLexer.g:1:717: MXNet
                {
                mMXNet(); 

                }
                break;
            case 70 :
                // InternalOptimizationLexer.g:1:723: Power
                {
                mPower(); 

                }
                break;
            case 71 :
                // InternalOptimizationLexer.g:1:729: Block
                {
                mBlock(); 

                }
                break;
            case 72 :
                // InternalOptimizationLexer.g:1:735: Data
                {
                mData(); 

                }
                break;
            case 73 :
                // InternalOptimizationLexer.g:1:740: Glow
                {
                mGlow(); 

                }
                break;
            case 74 :
                // InternalOptimizationLexer.g:1:745: Large
                {
                mLarge(); 

                }
                break;
            case 75 :
                // InternalOptimizationLexer.g:1:751: Size
                {
                mSize(); 

                }
                break;
            case 76 :
                // InternalOptimizationLexer.g:1:756: Small
                {
                mSmall(); 

                }
                break;
            case 77 :
                // InternalOptimizationLexer.g:1:762: Type
                {
                mType(); 

                }
                break;
            case 78 :
                // InternalOptimizationLexer.g:1:767: CNTK
                {
                mCNTK(); 

                }
                break;
            case 79 :
                // InternalOptimizationLexer.g:1:772: Cray
                {
                mCray(); 

                }
                break;
            case 80 :
                // InternalOptimizationLexer.g:1:777: Etl
                {
                mEtl(); 

                }
                break;
            case 81 :
                // InternalOptimizationLexer.g:1:781: Hpc
                {
                mHpc(); 

                }
                break;
            case 82 :
                // InternalOptimizationLexer.g:1:785: Mpi
                {
                mMpi(); 

                }
                break;
            case 83 :
                // InternalOptimizationLexer.g:1:789: Xla
                {
                mXla(); 

                }
                break;
            case 84 :
                // InternalOptimizationLexer.g:1:793: AMD
                {
                mAMD(); 

                }
                break;
            case 85 :
                // InternalOptimizationLexer.g:1:797: ARM
                {
                mARM(); 

                }
                break;
            case 86 :
                // InternalOptimizationLexer.g:1:801: HPC
                {
                mHPC(); 

                }
                break;
            case 87 :
                // InternalOptimizationLexer.g:1:805: MPI
                {
                mMPI(); 

                }
                break;
            case 88 :
                // InternalOptimizationLexer.g:1:809: Pgi
                {
                mPgi(); 

                }
                break;
            case 89 :
                // InternalOptimizationLexer.g:1:813: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 90 :
                // InternalOptimizationLexer.g:1:829: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 91 :
                // InternalOptimizationLexer.g:1:846: Comma
                {
                mComma(); 

                }
                break;
            case 92 :
                // InternalOptimizationLexer.g:1:852: FullStop
                {
                mFullStop(); 

                }
                break;
            case 93 :
                // InternalOptimizationLexer.g:1:861: Colon
                {
                mColon(); 

                }
                break;
            case 94 :
                // InternalOptimizationLexer.g:1:867: RULE_BT
                {
                mRULE_BT(); 

                }
                break;
            case 95 :
                // InternalOptimizationLexer.g:1:875: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 96 :
                // InternalOptimizationLexer.g:1:883: RULE_BET
                {
                mRULE_BET(); 

                }
                break;
            case 97 :
                // InternalOptimizationLexer.g:1:892: RULE_LET
                {
                mRULE_LET(); 

                }
                break;
            case 98 :
                // InternalOptimizationLexer.g:1:901: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 99 :
                // InternalOptimizationLexer.g:1:912: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 100 :
                // InternalOptimizationLexer.g:1:927: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 101 :
                // InternalOptimizationLexer.g:1:935: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 102 :
                // InternalOptimizationLexer.g:1:944: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 103 :
                // InternalOptimizationLexer.g:1:957: RULE_EXT_INT
                {
                mRULE_EXT_INT(); 

                }
                break;
            case 104 :
                // InternalOptimizationLexer.g:1:970: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 105 :
                // InternalOptimizationLexer.g:1:990: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 106 :
                // InternalOptimizationLexer.g:1:999: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 107 :
                // InternalOptimizationLexer.g:1:1011: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 108 :
                // InternalOptimizationLexer.g:1:1027: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 109 :
                // InternalOptimizationLexer.g:1:1043: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 110 :
                // InternalOptimizationLexer.g:1:1051: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\40\62\5\uffff\1\176\1\u0080\3\62\1\u0084\5\62\71\uffff\1\u00cc\33\uffff\1\u0084\40\uffff\1\u00f8\12\uffff\1\u0106\1\uffff\1\u0108\1\u0109\37\uffff\1\u0128\3\uffff\1\u012c\22\uffff\1\u013f\40\uffff\1\u015c\4\uffff\1\u0161\41\uffff\1\u0181\3\uffff\1\u0184\42\uffff\1\u01a6\13\uffff\1\u01ae\3\uffff\1\u01b2\6\uffff\1\u01b9\3\uffff\1\u01bd\1\u01be\1\u01bf\1\uffff\1\u0161\10\uffff\1\u01c7\17\uffff\1\u01d4\13\uffff\1\u01e0\1\u01e1\4\uffff\1\u01e6\20\uffff\1\u01f3\1\u01f4\71\uffff\1\u021f\1\u0220\2\uffff\1\u0221\1\u0222\4\uffff\1\u0227\1\u0228\30\uffff\1\u023f\107\uffff\1\u0275\23\uffff\1\u0287\2\uffff\1\u0288\14\uffff\1\u0294\4\uffff\1\u0298\23\uffff\1\u02a6\35\uffff\1\u02c2\27\uffff\1\u02d3\4\uffff\1\u02d6\1\uffff";
    static final String DFA14_eofS =
        "\u02d7\uffff";
    static final String DFA14_minS =
        "\1\0\40\56\5\uffff\4\75\1\56\1\60\1\101\1\56\2\0\1\52\2\uffff\1\56\1\uffff\103\56\13\uffff\1\56\2\uffff\1\60\4\uffff\47\56\1\55\31\56\1\uffff\41\56\1\uffff\11\56\1\uffff\11\56\1\uffff\2\56\2\uffff\1\56\2\uffff\4\56\1\55\31\56\1\uffff\1\56\3\uffff\4\56\1\uffff\5\56\1\uffff\7\56\1\uffff\34\56\2\uffff\3\56\1\uffff\1\56\1\uffff\25\56\1\uffff\7\56\1\uffff\2\56\1\uffff\3\56\1\uffff\1\56\1\uffff\33\56\1\uffff\1\55\2\56\1\uffff\3\56\1\uffff\3\56\1\uffff\6\56\1\uffff\1\56\5\uffff\7\56\1\uffff\2\56\1\uffff\7\56\3\uffff\13\56\2\uffff\4\56\2\uffff\7\56\1\uffff\3\56\2\uffff\22\56\1\uffff\3\56\1\uffff\17\56\1\uffff\1\56\6\uffff\4\56\2\uffff\2\56\2\uffff\10\56\1\uffff\3\56\3\uffff\3\56\1\uffff\4\56\2\uffff\13\56\1\uffff\31\56\1\uffff\2\56\1\uffff\3\56\2\uffff\1\56\1\uffff\16\56\1\uffff\2\56\2\uffff\13\56\1\uffff\1\56\3\uffff\11\56\1\uffff\3\56\1\uffff\22\56\1\uffff\6\56\1\uffff\1\56\1\uffff\4\56\3\uffff\3\56\1\uffff\4\56\2\uffff\2\56\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\40\172\5\uffff\4\75\1\172\1\145\2\172\2\uffff\1\57\2\uffff\1\172\1\uffff\103\172\13\uffff\1\172\2\uffff\1\145\4\uffff\101\172\1\uffff\41\172\1\uffff\11\172\1\uffff\11\172\1\uffff\2\172\2\uffff\1\172\2\uffff\36\172\1\uffff\1\172\3\uffff\4\172\1\uffff\5\172\1\uffff\7\172\1\uffff\34\172\2\uffff\3\172\1\uffff\1\172\1\uffff\25\172\1\uffff\7\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1\uffff\33\172\1\uffff\3\172\1\uffff\3\172\1\uffff\3\172\1\uffff\6\172\1\uffff\1\172\5\uffff\7\172\1\uffff\2\172\1\uffff\7\172\3\uffff\13\172\2\uffff\4\172\2\uffff\7\172\1\uffff\3\172\2\uffff\22\172\1\uffff\3\172\1\uffff\17\172\1\uffff\1\172\6\uffff\4\172\2\uffff\2\172\2\uffff\10\172\1\uffff\3\172\3\uffff\3\172\1\uffff\4\172\2\uffff\13\172\1\uffff\31\172\1\uffff\2\172\1\uffff\3\172\2\uffff\1\172\1\uffff\16\172\1\uffff\2\172\2\uffff\13\172\1\uffff\1\172\3\uffff\11\172\1\uffff\3\172\1\uffff\22\172\1\uffff\6\172\1\uffff\1\172\1\uffff\4\172\3\uffff\3\172\1\uffff\4\172\2\uffff\2\172\1\uffff";
    static final String DFA14_acceptS =
        "\41\uffff\1\131\1\132\1\133\1\134\1\135\13\uffff\1\155\1\156\1\uffff\1\150\103\uffff\1\131\1\132\1\133\1\134\1\135\1\140\1\136\1\141\1\137\1\142\1\143\1\uffff\1\151\1\147\1\uffff\1\152\1\153\1\154\1\155\101\uffff\1\144\41\uffff\1\120\11\uffff\1\130\11\uffff\1\122\2\uffff\1\44\1\124\1\uffff\1\125\1\145\36\uffff\1\127\1\uffff\1\121\1\123\1\126\4\uffff\1\110\5\uffff\1\113\7\uffff\1\117\34\uffff\1\116\1\24\3\uffff\1\146\1\uffff\1\115\25\uffff\1\111\7\uffff\1\102\2\uffff\1\114\3\uffff\1\71\1\uffff\1\70\33\uffff\1\101\3\uffff\1\100\3\uffff\1\107\3\uffff\1\112\6\uffff\1\106\1\uffff\1\72\1\73\1\103\1\104\1\105\7\uffff\1\77\2\uffff\1\61\7\uffff\1\63\1\64\1\76\13\uffff\1\74\1\75\4\uffff\1\65\1\25\7\uffff\1\62\3\uffff\1\66\1\67\22\uffff\1\52\3\uffff\1\53\17\uffff\1\50\1\uffff\1\51\1\54\1\55\1\56\1\57\1\60\4\uffff\1\46\1\47\2\uffff\1\40\1\41\10\uffff\1\43\3\uffff\1\34\1\35\1\36\3\uffff\1\45\4\uffff\1\37\1\42\13\uffff\1\33\31\uffff\1\27\2\uffff\1\26\3\uffff\1\23\1\30\1\uffff\1\32\16\uffff\1\20\2\uffff\1\22\1\31\13\uffff\1\21\1\uffff\1\15\1\16\1\17\11\uffff\1\13\3\uffff\1\14\22\uffff\1\12\6\uffff\1\10\1\uffff\1\11\4\uffff\1\5\1\6\1\7\3\uffff\1\4\4\uffff\1\2\1\3\2\uffff\1\1";
    static final String DFA14_specialS =
        "\1\0\55\uffff\1\1\1\2\u02a7\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\62\2\61\2\62\1\61\22\62\1\61\1\51\1\56\4\62\1\57\1\41\1\42\2\62\1\43\1\62\1\44\1\60\12\53\1\45\1\62\1\47\1\50\1\46\2\62\1\14\1\25\1\15\2\55\1\16\1\55\1\40\1\3\1\55\1\33\1\55\1\34\1\17\1\26\1\27\1\55\1\30\1\55\1\21\6\55\3\62\1\54\1\55\1\62\1\12\1\22\1\5\1\2\1\6\1\52\1\35\1\36\1\31\1\55\1\32\1\23\1\13\1\7\1\10\1\11\1\55\1\1\1\4\1\20\1\55\1\24\1\55\1\37\2\55\uff85\62",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\63\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\66\7\64\1\65\21\64",
            "\1\64\1\uffff\12\64\7\uffff\14\64\1\71\15\64\4\uffff\1\64\1\uffff\14\64\1\67\1\70\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\72\5\64\1\73\3\64\1\74\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\77\15\64\1\75\1\76\1\64\1\100\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\101\5\64\1\102\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\103\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\104\15\64\1\105\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\106\5\64\1\111\12\64\1\107\6\64\1\110\1\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\114\2\64\1\115\2\64\1\112\6\64\1\116\4\64\1\113\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\117\12\64\1\121\5\64\1\120\4\64",
            "\1\64\1\uffff\12\64\7\uffff\10\64\1\122\3\64\1\123\1\126\3\64\1\125\2\64\1\124\5\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\10\64\1\131\4\64\1\132\3\64\1\130\10\64\4\uffff\1\64\1\uffff\16\64\1\127\13\64",
            "\1\64\1\uffff\12\64\7\uffff\17\64\1\133\12\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\25\64\1\134\4\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\135\14\64\1\136\2\64\1\137\3\64\1\140\1\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\141\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\142\12\64\1\143\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\146\7\64\1\145\5\64\1\144\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\147\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\150\21\64",
            "\1\64\1\uffff\12\64\7\uffff\17\64\1\151\1\64\1\152\10\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\154\11\64\1\153\1\64",
            "\1\64\1\uffff\12\64\7\uffff\4\64\1\155\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\156\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\157\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\160\25\64",
            "\1\64\1\uffff\12\64\7\uffff\15\64\1\161\1\64\1\163\7\64\1\162\2\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\164\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\165\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\166\16\64",
            "\1\64\1\uffff\12\64\7\uffff\17\64\1\167\12\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "\1\175",
            "\1\177",
            "\1\u0081",
            "\1\u0082",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0083\31\64",
            "\12\u0086\13\uffff\1\u0085\37\uffff\1\u0085",
            "\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\0\u0087",
            "\0\u0087",
            "\1\u0088\4\uffff\1\u0089",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u008c\5\64\1\u008b\21\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u008d\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u008e\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u008f\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0090\6\64",
            "\1\64\1\uffff\12\64\7\uffff\1\u0091\31\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0092\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u0093\14\64\1\u0094",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0095\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u0097\1\u0098\3\64\1\u0096\2\64\1\u0099\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u009a\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u009b\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u009c\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u009d\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u009e\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u009f\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\11\64\1\u00a0\20\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00a2\10\64\1\u00a3\5\64\1\u00a1\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00a4\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00a5\25\64",
            "\1\64\1\uffff\12\64\7\uffff\23\64\1\u00a6\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00a7\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u00a8\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00a9\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00aa\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u00ab\24\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u00ac\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u00ae\16\64\1\u00ad\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00af\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00b0\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u00b1\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\3\64\1\u00b2\26\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\23\64\1\u00b3\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\14\64\1\u00b4\15\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\3\64\1\u00b5\26\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00b6\14\64",
            "\1\64\1\uffff\12\64\7\uffff\4\64\1\u00b7\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\5\64\1\u00b8\24\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\23\64\1\u00b9\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\6\64\1\u00ba\23\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\10\64\1\u00bb\21\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00bc\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00bd\23\64\1\u00be\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00bf\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u00c0\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00c1\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00c3\17\64\1\u00c2\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00c4\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00c5\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u00c6\30\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00c8\6\64\1\u00c7\1\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00c9\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u00ca\23\64",
            "\1\64\1\uffff\12\64\7\uffff\4\64\1\u00cb\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\23\64\1\u00cd\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\26\64\1\u00ce\3\64",
            "\1\64\1\uffff\12\64\7\uffff\22\64\1\u00cf\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u00d0\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00d1\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00d2\10\64",
            "\1\64\1\uffff\12\64\7\uffff\10\64\1\u00d3\21\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\15\64\1\u00d4\14\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\10\64\1\u00d5\21\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00d6\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u00d7\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00d8\31\64",
            "\1\64\1\uffff\12\64\7\uffff\2\64\1\u00d9\27\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00da\16\64",
            "",
            "",
            "\12\u0086\13\uffff\1\u0085\37\uffff\1\u0085",
            "",
            "",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00db\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00dc\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u00dd\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00de\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u00df\23\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00e0\25\64",
            "\1\64\1\uffff\12\64\7\uffff\6\64\1\u00e1\23\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00e2\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u00e3\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00e4\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u00e5\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00e6\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u00e7\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u00e8\24\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00e9\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u00ea\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u00eb\22\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30\64\1\u00ec\1\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u00ed\30\64",
            "\1\64\1\uffff\12\64\1\u00ee\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u00ef\30\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u00f0\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u00f2\1\uffff\10\64\1\u00f1\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u00f3\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u00f4\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u00f5\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u00f6\24\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00f7\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u00f9\15\64\1\u00fa\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u00fb\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u00fc\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u00fd\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u00fe\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u00ff\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0100\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u0101\12\64",
            "\1\64\1\uffff\12\64\1\u0102\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\10\64\1\u0103\12\64\1\u0104\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u0105\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\16\64\1\u0107\13\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u010a\7\64",
            "\1\64\1\uffff\12\64\7\uffff\1\u010b\31\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\1\u010c\31\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\12\64\1\u010d\17\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\1\u010e\31\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\3\64\1\u010f\26\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0110\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0111\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0112\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0113\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0114\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0115\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0116\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\12\64\1\u0117\17\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0118\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0119\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u011a\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u011b\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u011c\23\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u011d\7\64",
            "\1\64\1\uffff\12\64\7\uffff\3\64\1\u011e\26\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\15\64\1\u011f\14\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0120\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0121\25\64",
            "\1\64\1\uffff\12\64\7\uffff\23\64\1\u0122\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u0123\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0124\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0125\31\64",
            "\1\64\1\uffff\12\64\7\uffff\22\64\1\u0126\7\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0127\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\26\64\1\u0129\3\64",
            "\1\64\1\uffff\12\64\1\u012a\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\1\u012b\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u012d\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u012e\24\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u012f\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0130\10\64",
            "\1\64\1\uffff\12\64\1\u0131\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0132\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0133\16\64",
            "\1\64\1\uffff\12\64\7\uffff\4\64\1\u0134\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0135\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0136\16\64",
            "\1\64\1\uffff\12\64\1\u0137\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0138\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u0139\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u013a\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u013b\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u013c\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u013d\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u013e\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0140\16\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0141\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0142\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u0143\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u0144\30\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0145\1\64\1\u0146\11\64\1\u0147\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u0148\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0149\1\u014a\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u014b\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u014c\10\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u014d\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u014e\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u014f\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0150\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0151\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0152\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0153\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u0154\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0155\27\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0156\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0157\10\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\23\64\1\u0158\6\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0159\6\64",
            "\1\64\1\uffff\12\64\7\uffff\23\64\1\u015a\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\21\64\1\u015b\10\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\u015d\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\10\64\1\u015e\21\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u015f\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0160\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0162\10\64",
            "\1\64\1\uffff\12\64\1\u0163\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0164\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u0165\26\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0166\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\12\64\1\u0167\17\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0168\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0169\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u016a\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u016b\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u016c\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u016d\31\64",
            "\1\64\1\uffff\12\64\7\uffff\1\u016e\1\64\1\u016f\11\64\1\u0170\15\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0171\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0172\10\64",
            "\1\64\1\uffff\12\64\7\uffff\1\u0173\31\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0174\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0175\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0176\7\64",
            "\1\64\1\uffff\12\64\7\uffff\23\64\1\u0177\6\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0178\6\64",
            "",
            "\1\64\1\uffff\12\64\1\u0179\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u017a\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u017b\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u017c\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u017d\21\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u017e\1\uffff\15\64\1\u017f\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\27\64\1\u0180\2\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0182\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0183\25\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0185\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0186\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u0187\23\64",
            "\1\64\1\uffff\12\64\1\u0188\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30\64\1\u0189\1\64",
            "\1\64\1\uffff\12\64\1\u018a\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u018b\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u018c\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u018d\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u018e\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u018f\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0190\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0191\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u0192\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0193\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0194\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0195\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0196\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0197\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0198\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0199\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u019a\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30\64\1\u019b\1\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u019c\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30\64\1\u019d\1\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u019e\23\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u019f\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u01a0\22\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u01a1\24\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u01a2\31\64",
            "\1\64\1\uffff\12\64\7\uffff\24\64\1\u01a3\5\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u01a4\10\64",
            "\1\64\1\uffff\12\64\7\uffff\1\u01a5\31\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\1\u01a7\31\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u01a8\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u01a9\16\64",
            "",
            "\1\64\1\uffff\12\64\1\u01aa\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u01ab\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u01ac\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u01ad\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u01af\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u01b0\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u01b1\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u01b3\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u01b4\6\64",
            "\1\64\1\uffff\12\64\7\uffff\2\64\1\u01b5\27\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\13\64\1\u01b6\16\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\17\64\1\u01b7\12\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u01b8\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\21\64\1\u01ba\10\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\1\u01bb\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\1\u01bc\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u01c0\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u01c1\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u01c2\30\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u01c3\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u01c4\25\64",
            "\1\64\1\uffff\10\64\1\u01c5\1\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u01c6\23\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u01c8\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u01c9\25\64",
            "\1\64\1\uffff\12\64\1\u01ca\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u01cb\12\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u01cc\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u01cd\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u01ce\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\31\64\1\u01cf",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u01d0\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u01d1\27\64",
            "\1\64\1\uffff\12\64\1\u01d2\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\1\u01d3\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u01d5\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u01d6\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u01d7\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u01d8\22\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u01d9\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u01da\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u01db\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u01dc\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u01dd\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u01de\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u01df\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u01e2\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u01e3\21\64",
            "\1\64\1\uffff\12\64\7\uffff\15\64\1\u01e4\14\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u01e5\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\u01e7\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u01e8\24\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u01e9\31\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\5\64\1\u01ea\24\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u01eb\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u01ec\26\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u01ed\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30\64\1\u01ee\1\64",
            "\1\64\1\uffff\12\64\1\u01ef\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u01f0\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u01f1\31\64",
            "\1\64\1\uffff\12\64\7\uffff\2\64\1\u01f2\27\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u01f5\22\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\23\64\1\u01f6\6\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u01f7\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u01f8\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u01f9\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u01fa\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u01fb\6\64",
            "\1\64\1\uffff\6\64\1\u01fc\3\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u01fd\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u01fe\30\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u01ff\10\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0200\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0201\15\64\1\u0202\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0203\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u0204\26\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0205\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0206\16\64",
            "\1\64\1\uffff\12\64\1\u0207\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0208\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0209\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u020a\22\64",
            "\1\64\1\uffff\12\64\1\u020b\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u020c\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u020d\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u020e\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u020f\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30\64\1\u0210\1\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0211\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u0212\1\uffff\32\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0213\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0214\14\64",
            "\1\64\1\uffff\12\64\7\uffff\4\64\1\u0215\25\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0216\21\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0217\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0218\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u0219\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u021a\31\64",
            "\1\64\1\uffff\12\64\1\u021b\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u021c\14\64",
            "\1\64\1\uffff\12\64\1\u021d\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\1\u021e\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0223\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u0224\26\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0225\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0226\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0229\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u022a\7\64",
            "\1\64\1\uffff\12\64\1\u022b\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\1\u022c\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u022d\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u022e\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u022f\24\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0230\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0231\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u0232\26\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0233\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0234\10\64",
            "\1\64\1\uffff\12\64\1\u0235\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\26\64\1\u0236\3\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0237\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0238\14\64",
            "\1\64\1\uffff\12\64\1\u0239\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\1\u023a\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\1\u023b\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u023c\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u023d\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u023e\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0240\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0241\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0242\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0243\13\64",
            "\1\64\1\uffff\12\64\1\u0244\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\1\u0245\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0246\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0247\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0248\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0249\7\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u024a\24\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u024b\27\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u024c\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u024d\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u024e\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u024f\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0250\21\64",
            "\1\64\1\uffff\12\64\1\u0251\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0252\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0253\7\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0254\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0255\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u0256\23\64",
            "",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0257\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0258\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0259\14\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u025a\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\26\64\1\u025b\3\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u025c\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\26\64\1\u025d\3\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\14\64\1\u025e\15\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u025f\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u0260\26\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u0261\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u0262\24\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0263\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0264\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u0265\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u0267\22\64\1\u0266\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0268\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u0269\13\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u026a\31\64",
            "\1\64\1\uffff\12\64\1\u026b\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u026c\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u026d\23\64",
            "\1\64\1\uffff\12\64\1\u026e\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\31\64\1\u026f",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0270\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u0271\23\64",
            "\1\64\1\uffff\12\64\1\u0272\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\1\u0273\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0274\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0276\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0277\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u0278\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0279\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u027a\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u027b\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u027c\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\64\1\u027d\30\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\7\64\1\u027e\22\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u027f\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0280\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0281\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0282\6\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\12\64\1\u0283\17\64",
            "\1\64\1\uffff\12\64\1\u0284\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0285\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u0286\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u0289\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u028a\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u028b\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\5\64\1\u028c\24\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u028d\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\17\64\1\u028e\12\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u028f\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\24\64\1\u0290\5\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u0291\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u0292\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0293\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u0295\21\64",
            "\1\64\1\uffff\12\64\1\u0296\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\1\u0297\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u0299\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u029a\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u029b\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u029c\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u029d\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u029e\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u029f\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u02a0\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u02a1\25\64",
            "\1\64\1\uffff\12\64\1\u02a2\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u02a3\21\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u02a4\13\64",
            "",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\u02a5\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u02a7\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u02a8\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u02a9\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u02aa\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u02ab\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u02ac\16\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u02ad\31\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u02ae\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u02af\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\13\64\1\u02b0\16\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u02b1\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u02b2\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u02b3\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u02b4\13\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u02b5\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u02b6\26\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\3\64\1\u02b7\26\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u02b8\14\64",
            "\1\64\1\uffff\12\64\1\u02b9\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\4\64\1\u02ba\25\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u02bb\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\23\64\1\u02bc\6\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\2\64\1\u02bd\27\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u02be\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u02bf\23\64",
            "\1\64\1\uffff\12\64\1\u02c0\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\22\64\1\u02c1\7\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\1\u02c3\31\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u02c4\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u02c5\21\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\30\64\1\u02c6\1\64",
            "\1\64\1\uffff\12\64\1\u02c7\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\1\u02c8\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\1\u02c9\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u02ca\10\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u02cb\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\16\64\1\u02cc\13\64",
            "\1\64\1\uffff\12\64\1\u02cd\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u02ce\14\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u02cf\23\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u02d0\14\64",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\10\64\1\u02d1\21\64",
            "\1\64\1\uffff\12\64\1\u02d2\6\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\15\64\1\u02d4\14\64",
            "",
            "",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\6\64\1\u02d5\23\64",
            "\1\64\1\uffff\12\64\7\uffff\32\64\4\uffff\1\64\1\uffff\32\64",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Reinforncement_learning | Distributed_training | Image_classification | Scaling_efficiency | Core_subscription | Enable_autotuning | Number_of_threads | Enable_opt_build | Object_detection | Parallelisation | Number_of_acc | Recommendation | Ai_framework | Message_size | AI_Inference | Ai_training | Optimization | AI_Training | Constraint | FPGAXilinx | NVIDIAV100 | Autotuning | Parameters | Tensorflow | Translation | TensorFlow | Opt_build | Acc_type | Affinity | App_type | Basedata | Compiler | Cpu_type | Location | Prefetch | AMDM100 | AUTOTUNE | Imagenet | Intelx86 | Backend | Library | Openacc | PyTorch_1 | Version | BigData | OPENACC | PyTorch | RESTART | Config | Layers | Opencl | Openmp | CREATA | OPENCL | OPENMP | Cache | Count | Input | Keras_1 | Medium | Mvapch | Opnmpi | Simple | Tuner | CIFAR | IMAGE | Keras | MNIST | MXNet | Power | Block | Data | Glow | Large | Size | Small | Type | CNTK | Cray | Etl | Hpc | Mpi | Xla | AMD | ARM | HPC | MPI | Pgi | LeftParenthesis | RightParenthesis | Comma | FullStop | Colon | RULE_BT | RULE_LT | RULE_BET | RULE_LET | RULE_EQUAL | RULE_NOT_EQUAL | RULE_OR | RULE_AND | RULE_BOOLEAN | RULE_EXT_INT | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='r') ) {s = 1;}

                        else if ( (LA14_0=='d') ) {s = 2;}

                        else if ( (LA14_0=='I') ) {s = 3;}

                        else if ( (LA14_0=='s') ) {s = 4;}

                        else if ( (LA14_0=='c') ) {s = 5;}

                        else if ( (LA14_0=='e') ) {s = 6;}

                        else if ( (LA14_0=='n') ) {s = 7;}

                        else if ( (LA14_0=='o') ) {s = 8;}

                        else if ( (LA14_0=='p') ) {s = 9;}

                        else if ( (LA14_0=='a') ) {s = 10;}

                        else if ( (LA14_0=='m') ) {s = 11;}

                        else if ( (LA14_0=='A') ) {s = 12;}

                        else if ( (LA14_0=='C') ) {s = 13;}

                        else if ( (LA14_0=='F') ) {s = 14;}

                        else if ( (LA14_0=='N') ) {s = 15;}

                        else if ( (LA14_0=='t') ) {s = 16;}

                        else if ( (LA14_0=='T') ) {s = 17;}

                        else if ( (LA14_0=='b') ) {s = 18;}

                        else if ( (LA14_0=='l') ) {s = 19;}

                        else if ( (LA14_0=='v') ) {s = 20;}

                        else if ( (LA14_0=='B') ) {s = 21;}

                        else if ( (LA14_0=='O') ) {s = 22;}

                        else if ( (LA14_0=='P') ) {s = 23;}

                        else if ( (LA14_0=='R') ) {s = 24;}

                        else if ( (LA14_0=='i') ) {s = 25;}

                        else if ( (LA14_0=='k') ) {s = 26;}

                        else if ( (LA14_0=='K') ) {s = 27;}

                        else if ( (LA14_0=='M') ) {s = 28;}

                        else if ( (LA14_0=='g') ) {s = 29;}

                        else if ( (LA14_0=='h') ) {s = 30;}

                        else if ( (LA14_0=='x') ) {s = 31;}

                        else if ( (LA14_0=='H') ) {s = 32;}

                        else if ( (LA14_0=='(') ) {s = 33;}

                        else if ( (LA14_0==')') ) {s = 34;}

                        else if ( (LA14_0==',') ) {s = 35;}

                        else if ( (LA14_0=='.') ) {s = 36;}

                        else if ( (LA14_0==':') ) {s = 37;}

                        else if ( (LA14_0=='>') ) {s = 38;}

                        else if ( (LA14_0=='<') ) {s = 39;}

                        else if ( (LA14_0=='=') ) {s = 40;}

                        else if ( (LA14_0=='!') ) {s = 41;}

                        else if ( (LA14_0=='f') ) {s = 42;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 43;}

                        else if ( (LA14_0=='^') ) {s = 44;}

                        else if ( ((LA14_0>='D' && LA14_0<='E')||LA14_0=='G'||LA14_0=='J'||LA14_0=='L'||LA14_0=='Q'||LA14_0=='S'||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='j'||LA14_0=='q'||LA14_0=='u'||LA14_0=='w'||(LA14_0>='y' && LA14_0<='z')) ) {s = 45;}

                        else if ( (LA14_0=='\"') ) {s = 46;}

                        else if ( (LA14_0=='\'') ) {s = 47;}

                        else if ( (LA14_0=='/') ) {s = 48;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 49;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0=='-'||LA14_0==';'||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_46 = input.LA(1);

                        s = -1;
                        if ( ((LA14_46>='\u0000' && LA14_46<='\uFFFF')) ) {s = 135;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_47 = input.LA(1);

                        s = -1;
                        if ( ((LA14_47>='\u0000' && LA14_47<='\uFFFF')) ) {s = 135;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}