package org.sodalite.dsl.optimization.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOptimizationLexer extends Lexer {
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
    public static final int Type=79;
    public static final int Image_classification=6;
    public static final int Message_size=17;
    public static final int Opencl=53;
    public static final int Etl=82;
    public static final int PyTorch_1=45;
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

    // $ANTLR start "FPGAXilinx"
    public final void mFPGAXilinx() throws RecognitionException {
        try {
            int _type = FPGAXilinx;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:50:12: ( 'FPGA-Xilinx' )
            // InternalOptimizationLexer.g:50:14: 'FPGA-Xilinx'
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
            // InternalOptimizationLexer.g:52:12: ( 'NVIDIA-V100' )
            // InternalOptimizationLexer.g:52:14: 'NVIDIA-V100'
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
            // InternalOptimizationLexer.g:54:12: ( 'autotuning:' )
            // InternalOptimizationLexer.g:54:14: 'autotuning:'
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
            // InternalOptimizationLexer.g:56:12: ( 'parameters:' )
            // InternalOptimizationLexer.g:56:14: 'parameters:'
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
            // InternalOptimizationLexer.g:58:12: ( 'tensorflow:' )
            // InternalOptimizationLexer.g:58:14: 'tensorflow:'
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
            // InternalOptimizationLexer.g:60:13: ( 'translation' )
            // InternalOptimizationLexer.g:60:15: 'translation'
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
            // InternalOptimizationLexer.g:62:12: ( 'TensorFlow' )
            // InternalOptimizationLexer.g:62:14: 'TensorFlow'
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
            // InternalOptimizationLexer.g:64:11: ( 'opt_build:' )
            // InternalOptimizationLexer.g:64:13: 'opt_build:'
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
            // InternalOptimizationLexer.g:66:10: ( 'acc_type:' )
            // InternalOptimizationLexer.g:66:12: 'acc_type:'
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
            // InternalOptimizationLexer.g:68:10: ( 'affinity:' )
            // InternalOptimizationLexer.g:68:12: 'affinity:'
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
            // InternalOptimizationLexer.g:70:10: ( 'app_type:' )
            // InternalOptimizationLexer.g:70:12: 'app_type:'
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
            // InternalOptimizationLexer.g:72:10: ( 'basedata:' )
            // InternalOptimizationLexer.g:72:12: 'basedata:'
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
            // InternalOptimizationLexer.g:74:10: ( 'compiler:' )
            // InternalOptimizationLexer.g:74:12: 'compiler:'
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
            // InternalOptimizationLexer.g:76:10: ( 'cpu_type:' )
            // InternalOptimizationLexer.g:76:12: 'cpu_type:'
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
            // InternalOptimizationLexer.g:78:10: ( 'location:' )
            // InternalOptimizationLexer.g:78:12: 'location:'
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
            // InternalOptimizationLexer.g:80:10: ( 'prefetch:' )
            // InternalOptimizationLexer.g:80:12: 'prefetch:'
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
            // InternalOptimizationLexer.g:82:9: ( 'AMD-M100' )
            // InternalOptimizationLexer.g:82:11: 'AMD-M100'
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
            // InternalOptimizationLexer.g:84:10: ( 'AUTOTUNE' )
            // InternalOptimizationLexer.g:84:12: 'AUTOTUNE'
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
            // InternalOptimizationLexer.g:86:10: ( 'Imagenet' )
            // InternalOptimizationLexer.g:86:12: 'Imagenet'
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
            // InternalOptimizationLexer.g:88:10: ( 'Intelx86' )
            // InternalOptimizationLexer.g:88:12: 'Intelx86'
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
            // InternalOptimizationLexer.g:90:9: ( 'backend:' )
            // InternalOptimizationLexer.g:90:11: 'backend:'
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
            // InternalOptimizationLexer.g:92:9: ( 'library:' )
            // InternalOptimizationLexer.g:92:11: 'library:'
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
            // InternalOptimizationLexer.g:94:9: ( 'openacc:' )
            // InternalOptimizationLexer.g:94:11: 'openacc:'
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
            // InternalOptimizationLexer.g:96:11: ( 'pyTorch:' )
            // InternalOptimizationLexer.g:96:13: 'pyTorch:'
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
            // InternalOptimizationLexer.g:98:9: ( 'version:' )
            // InternalOptimizationLexer.g:98:11: 'version:'
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
            // InternalOptimizationLexer.g:100:9: ( 'BigData' )
            // InternalOptimizationLexer.g:100:11: 'BigData'
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
            // InternalOptimizationLexer.g:102:9: ( 'OPENACC' )
            // InternalOptimizationLexer.g:102:11: 'OPENACC'
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
            // InternalOptimizationLexer.g:104:9: ( 'PyTorch' )
            // InternalOptimizationLexer.g:104:11: 'PyTorch'
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
            // InternalOptimizationLexer.g:106:9: ( 'RESTART' )
            // InternalOptimizationLexer.g:106:11: 'RESTART'
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
            // InternalOptimizationLexer.g:108:8: ( 'config:' )
            // InternalOptimizationLexer.g:108:10: 'config:'
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
            // InternalOptimizationLexer.g:110:8: ( 'layers:' )
            // InternalOptimizationLexer.g:110:10: 'layers:'
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
            // InternalOptimizationLexer.g:112:8: ( 'opencl:' )
            // InternalOptimizationLexer.g:112:10: 'opencl:'
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
            // InternalOptimizationLexer.g:114:8: ( 'openmp:' )
            // InternalOptimizationLexer.g:114:10: 'openmp:'
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
            // InternalOptimizationLexer.g:116:8: ( 'CREATA' )
            // InternalOptimizationLexer.g:116:10: 'CREATA'
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
            // InternalOptimizationLexer.g:118:8: ( 'OPENCL' )
            // InternalOptimizationLexer.g:118:10: 'OPENCL'
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
            // InternalOptimizationLexer.g:120:8: ( 'OPENMP' )
            // InternalOptimizationLexer.g:120:10: 'OPENMP'
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
            // InternalOptimizationLexer.g:122:7: ( 'cache:' )
            // InternalOptimizationLexer.g:122:9: 'cache:'
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
            // InternalOptimizationLexer.g:124:7: ( 'count:' )
            // InternalOptimizationLexer.g:124:9: 'count:'
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
            // InternalOptimizationLexer.g:126:7: ( 'input:' )
            // InternalOptimizationLexer.g:126:9: 'input:'
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
            // InternalOptimizationLexer.g:128:9: ( 'keras:' )
            // InternalOptimizationLexer.g:128:11: 'keras:'
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
            // InternalOptimizationLexer.g:130:8: ( 'medium' )
            // InternalOptimizationLexer.g:130:10: 'medium'
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
            // InternalOptimizationLexer.g:132:8: ( 'mvapch' )
            // InternalOptimizationLexer.g:132:10: 'mvapch'
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
            // InternalOptimizationLexer.g:134:8: ( 'opnmpi' )
            // InternalOptimizationLexer.g:134:10: 'opnmpi'
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
            // InternalOptimizationLexer.g:136:8: ( 'simple' )
            // InternalOptimizationLexer.g:136:10: 'simple'
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
            // InternalOptimizationLexer.g:138:7: ( 'tuner:' )
            // InternalOptimizationLexer.g:138:9: 'tuner:'
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
            // InternalOptimizationLexer.g:140:7: ( 'CIFAR' )
            // InternalOptimizationLexer.g:140:9: 'CIFAR'
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
            // InternalOptimizationLexer.g:142:7: ( 'IMAGE' )
            // InternalOptimizationLexer.g:142:9: 'IMAGE'
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
            // InternalOptimizationLexer.g:144:7: ( 'Keras' )
            // InternalOptimizationLexer.g:144:9: 'Keras'
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
            // InternalOptimizationLexer.g:146:7: ( 'MNIST' )
            // InternalOptimizationLexer.g:146:9: 'MNIST'
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
            // InternalOptimizationLexer.g:148:7: ( 'MXNet' )
            // InternalOptimizationLexer.g:148:9: 'MXNet'
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
            // InternalOptimizationLexer.g:150:7: ( 'Power' )
            // InternalOptimizationLexer.g:150:9: 'Power'
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
            // InternalOptimizationLexer.g:152:7: ( 'block' )
            // InternalOptimizationLexer.g:152:9: 'block'
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
            // InternalOptimizationLexer.g:154:6: ( 'data:' )
            // InternalOptimizationLexer.g:154:8: 'data:'
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
            // InternalOptimizationLexer.g:156:6: ( 'glow:' )
            // InternalOptimizationLexer.g:156:8: 'glow:'
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
            // InternalOptimizationLexer.g:158:7: ( 'large' )
            // InternalOptimizationLexer.g:158:9: 'large'
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
            // InternalOptimizationLexer.g:160:6: ( 'size:' )
            // InternalOptimizationLexer.g:160:8: 'size:'
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
            // InternalOptimizationLexer.g:162:7: ( 'small' )
            // InternalOptimizationLexer.g:162:9: 'small'
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
            // InternalOptimizationLexer.g:164:6: ( 'type:' )
            // InternalOptimizationLexer.g:164:8: 'type:'
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
            // InternalOptimizationLexer.g:166:6: ( 'CNTK' )
            // InternalOptimizationLexer.g:166:8: 'CNTK'
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
            // InternalOptimizationLexer.g:168:6: ( 'cray' )
            // InternalOptimizationLexer.g:168:8: 'cray'
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
            // InternalOptimizationLexer.g:170:5: ( 'etl:' )
            // InternalOptimizationLexer.g:170:7: 'etl:'
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
            // InternalOptimizationLexer.g:172:5: ( 'hpc:' )
            // InternalOptimizationLexer.g:172:7: 'hpc:'
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
            // InternalOptimizationLexer.g:174:5: ( 'mpi:' )
            // InternalOptimizationLexer.g:174:7: 'mpi:'
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
            // InternalOptimizationLexer.g:176:5: ( 'xla:' )
            // InternalOptimizationLexer.g:176:7: 'xla:'
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
            // InternalOptimizationLexer.g:178:5: ( 'AMD' )
            // InternalOptimizationLexer.g:178:7: 'AMD'
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
            // InternalOptimizationLexer.g:180:5: ( 'ARM' )
            // InternalOptimizationLexer.g:180:7: 'ARM'
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
            // InternalOptimizationLexer.g:182:5: ( 'HPC' )
            // InternalOptimizationLexer.g:182:7: 'HPC'
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
            // InternalOptimizationLexer.g:184:5: ( 'MPI' )
            // InternalOptimizationLexer.g:184:7: 'MPI'
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
            // InternalOptimizationLexer.g:186:5: ( 'pgi' )
            // InternalOptimizationLexer.g:186:7: 'pgi'
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

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:188:7: ( ',' )
            // InternalOptimizationLexer.g:188:9: ','
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
            // InternalOptimizationLexer.g:190:10: ( '.' )
            // InternalOptimizationLexer.g:190:12: '.'
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
            // InternalOptimizationLexer.g:192:7: ( ':' )
            // InternalOptimizationLexer.g:192:9: ':'
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
            // InternalOptimizationLexer.g:194:9: ( '>' )
            // InternalOptimizationLexer.g:194:11: '>'
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
            // InternalOptimizationLexer.g:196:9: ( '<' )
            // InternalOptimizationLexer.g:196:11: '<'
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
            // InternalOptimizationLexer.g:198:10: ( '>=' )
            // InternalOptimizationLexer.g:198:12: '>='
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
            // InternalOptimizationLexer.g:200:10: ( '<=' )
            // InternalOptimizationLexer.g:200:12: '<='
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
            // InternalOptimizationLexer.g:202:12: ( '==' )
            // InternalOptimizationLexer.g:202:14: '=='
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
            // InternalOptimizationLexer.g:204:16: ( '!=' )
            // InternalOptimizationLexer.g:204:18: '!='
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
            // InternalOptimizationLexer.g:206:9: ( 'OR' )
            // InternalOptimizationLexer.g:206:11: 'OR'
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
            // InternalOptimizationLexer.g:208:10: ( 'AND' )
            // InternalOptimizationLexer.g:208:12: 'AND'
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
            // InternalOptimizationLexer.g:210:21: ()
            // InternalOptimizationLexer.g:210:23: 
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
            // InternalOptimizationLexer.g:212:19: ()
            // InternalOptimizationLexer.g:212:21: 
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
            // InternalOptimizationLexer.g:214:14: ( ( 'true' | 'false' ) )
            // InternalOptimizationLexer.g:214:16: ( 'true' | 'false' )
            {
            // InternalOptimizationLexer.g:214:16: ( 'true' | 'false' )
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
                    // InternalOptimizationLexer.g:214:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalOptimizationLexer.g:214:24: 'false'
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
            // InternalOptimizationLexer.g:216:14: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )
            // InternalOptimizationLexer.g:216:16: RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT
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
            // InternalOptimizationLexer.g:218:21: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalOptimizationLexer.g:218:23: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalOptimizationLexer.g:218:31: ( '.' RULE_ID )+
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
            	    // InternalOptimizationLexer.g:218:32: '.' RULE_ID
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
            // InternalOptimizationLexer.g:220:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOptimizationLexer.g:220:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOptimizationLexer.g:220:20: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOptimizationLexer.g:220:20: '^'
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

            // InternalOptimizationLexer.g:220:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalOptimizationLexer.g:222:10: ( ( '0' .. '9' )+ )
            // InternalOptimizationLexer.g:222:12: ( '0' .. '9' )+
            {
            // InternalOptimizationLexer.g:222:12: ( '0' .. '9' )+
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
            	    // InternalOptimizationLexer.g:222:13: '0' .. '9'
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
            // InternalOptimizationLexer.g:224:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOptimizationLexer.g:224:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOptimizationLexer.g:224:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalOptimizationLexer.g:224:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOptimizationLexer.g:224:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalOptimizationLexer.g:224:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOptimizationLexer.g:224:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalOptimizationLexer.g:224:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOptimizationLexer.g:224:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalOptimizationLexer.g:224:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOptimizationLexer.g:224:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalOptimizationLexer.g:226:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOptimizationLexer.g:226:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOptimizationLexer.g:226:24: ( options {greedy=false; } : . )*
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
            	    // InternalOptimizationLexer.g:226:52: .
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
            // InternalOptimizationLexer.g:228:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOptimizationLexer.g:228:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOptimizationLexer.g:228:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOptimizationLexer.g:228:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalOptimizationLexer.g:228:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOptimizationLexer.g:228:41: ( '\\r' )? '\\n'
                    {
                    // InternalOptimizationLexer.g:228:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalOptimizationLexer.g:228:41: '\\r'
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
            // InternalOptimizationLexer.g:230:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOptimizationLexer.g:230:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOptimizationLexer.g:230:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalOptimizationLexer.g:232:16: ( . )
            // InternalOptimizationLexer.g:232:18: .
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
        // InternalOptimizationLexer.g:1:8: ( Reinforncement_learning | Distributed_training | Image_classification | Scaling_efficiency | Core_subscription | Enable_autotuning | Number_of_threads | Enable_opt_build | Object_detection | Parallelisation | Number_of_acc | Recommendation | Ai_framework | Message_size | AI_Inference | Ai_training | Optimization | AI_Training | FPGAXilinx | NVIDIAV100 | Autotuning | Parameters | Tensorflow | Translation | TensorFlow | Opt_build | Acc_type | Affinity | App_type | Basedata | Compiler | Cpu_type | Location | Prefetch | AMDM100 | AUTOTUNE | Imagenet | Intelx86 | Backend | Library | Openacc | PyTorch_1 | Version | BigData | OPENACC | PyTorch | RESTART | Config | Layers | Opencl | Openmp | CREATA | OPENCL | OPENMP | Cache | Count | Input | Keras_1 | Medium | Mvapch | Opnmpi | Simple | Tuner | CIFAR | IMAGE | Keras | MNIST | MXNet | Power | Block | Data | Glow | Large | Size | Small | Type | CNTK | Cray | Etl | Hpc | Mpi | Xla | AMD | ARM | HPC | MPI | Pgi | Comma | FullStop | Colon | RULE_BT | RULE_LT | RULE_BET | RULE_LET | RULE_EQUAL | RULE_NOT_EQUAL | RULE_OR | RULE_AND | RULE_BOOLEAN | RULE_EXT_INT | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=107;
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
                // InternalOptimizationLexer.g:1:304: FPGAXilinx
                {
                mFPGAXilinx(); 

                }
                break;
            case 20 :
                // InternalOptimizationLexer.g:1:315: NVIDIAV100
                {
                mNVIDIAV100(); 

                }
                break;
            case 21 :
                // InternalOptimizationLexer.g:1:326: Autotuning
                {
                mAutotuning(); 

                }
                break;
            case 22 :
                // InternalOptimizationLexer.g:1:337: Parameters
                {
                mParameters(); 

                }
                break;
            case 23 :
                // InternalOptimizationLexer.g:1:348: Tensorflow
                {
                mTensorflow(); 

                }
                break;
            case 24 :
                // InternalOptimizationLexer.g:1:359: Translation
                {
                mTranslation(); 

                }
                break;
            case 25 :
                // InternalOptimizationLexer.g:1:371: TensorFlow
                {
                mTensorFlow(); 

                }
                break;
            case 26 :
                // InternalOptimizationLexer.g:1:382: Opt_build
                {
                mOpt_build(); 

                }
                break;
            case 27 :
                // InternalOptimizationLexer.g:1:392: Acc_type
                {
                mAcc_type(); 

                }
                break;
            case 28 :
                // InternalOptimizationLexer.g:1:401: Affinity
                {
                mAffinity(); 

                }
                break;
            case 29 :
                // InternalOptimizationLexer.g:1:410: App_type
                {
                mApp_type(); 

                }
                break;
            case 30 :
                // InternalOptimizationLexer.g:1:419: Basedata
                {
                mBasedata(); 

                }
                break;
            case 31 :
                // InternalOptimizationLexer.g:1:428: Compiler
                {
                mCompiler(); 

                }
                break;
            case 32 :
                // InternalOptimizationLexer.g:1:437: Cpu_type
                {
                mCpu_type(); 

                }
                break;
            case 33 :
                // InternalOptimizationLexer.g:1:446: Location
                {
                mLocation(); 

                }
                break;
            case 34 :
                // InternalOptimizationLexer.g:1:455: Prefetch
                {
                mPrefetch(); 

                }
                break;
            case 35 :
                // InternalOptimizationLexer.g:1:464: AMDM100
                {
                mAMDM100(); 

                }
                break;
            case 36 :
                // InternalOptimizationLexer.g:1:472: AUTOTUNE
                {
                mAUTOTUNE(); 

                }
                break;
            case 37 :
                // InternalOptimizationLexer.g:1:481: Imagenet
                {
                mImagenet(); 

                }
                break;
            case 38 :
                // InternalOptimizationLexer.g:1:490: Intelx86
                {
                mIntelx86(); 

                }
                break;
            case 39 :
                // InternalOptimizationLexer.g:1:499: Backend
                {
                mBackend(); 

                }
                break;
            case 40 :
                // InternalOptimizationLexer.g:1:507: Library
                {
                mLibrary(); 

                }
                break;
            case 41 :
                // InternalOptimizationLexer.g:1:515: Openacc
                {
                mOpenacc(); 

                }
                break;
            case 42 :
                // InternalOptimizationLexer.g:1:523: PyTorch_1
                {
                mPyTorch_1(); 

                }
                break;
            case 43 :
                // InternalOptimizationLexer.g:1:533: Version
                {
                mVersion(); 

                }
                break;
            case 44 :
                // InternalOptimizationLexer.g:1:541: BigData
                {
                mBigData(); 

                }
                break;
            case 45 :
                // InternalOptimizationLexer.g:1:549: OPENACC
                {
                mOPENACC(); 

                }
                break;
            case 46 :
                // InternalOptimizationLexer.g:1:557: PyTorch
                {
                mPyTorch(); 

                }
                break;
            case 47 :
                // InternalOptimizationLexer.g:1:565: RESTART
                {
                mRESTART(); 

                }
                break;
            case 48 :
                // InternalOptimizationLexer.g:1:573: Config
                {
                mConfig(); 

                }
                break;
            case 49 :
                // InternalOptimizationLexer.g:1:580: Layers
                {
                mLayers(); 

                }
                break;
            case 50 :
                // InternalOptimizationLexer.g:1:587: Opencl
                {
                mOpencl(); 

                }
                break;
            case 51 :
                // InternalOptimizationLexer.g:1:594: Openmp
                {
                mOpenmp(); 

                }
                break;
            case 52 :
                // InternalOptimizationLexer.g:1:601: CREATA
                {
                mCREATA(); 

                }
                break;
            case 53 :
                // InternalOptimizationLexer.g:1:608: OPENCL
                {
                mOPENCL(); 

                }
                break;
            case 54 :
                // InternalOptimizationLexer.g:1:615: OPENMP
                {
                mOPENMP(); 

                }
                break;
            case 55 :
                // InternalOptimizationLexer.g:1:622: Cache
                {
                mCache(); 

                }
                break;
            case 56 :
                // InternalOptimizationLexer.g:1:628: Count
                {
                mCount(); 

                }
                break;
            case 57 :
                // InternalOptimizationLexer.g:1:634: Input
                {
                mInput(); 

                }
                break;
            case 58 :
                // InternalOptimizationLexer.g:1:640: Keras_1
                {
                mKeras_1(); 

                }
                break;
            case 59 :
                // InternalOptimizationLexer.g:1:648: Medium
                {
                mMedium(); 

                }
                break;
            case 60 :
                // InternalOptimizationLexer.g:1:655: Mvapch
                {
                mMvapch(); 

                }
                break;
            case 61 :
                // InternalOptimizationLexer.g:1:662: Opnmpi
                {
                mOpnmpi(); 

                }
                break;
            case 62 :
                // InternalOptimizationLexer.g:1:669: Simple
                {
                mSimple(); 

                }
                break;
            case 63 :
                // InternalOptimizationLexer.g:1:676: Tuner
                {
                mTuner(); 

                }
                break;
            case 64 :
                // InternalOptimizationLexer.g:1:682: CIFAR
                {
                mCIFAR(); 

                }
                break;
            case 65 :
                // InternalOptimizationLexer.g:1:688: IMAGE
                {
                mIMAGE(); 

                }
                break;
            case 66 :
                // InternalOptimizationLexer.g:1:694: Keras
                {
                mKeras(); 

                }
                break;
            case 67 :
                // InternalOptimizationLexer.g:1:700: MNIST
                {
                mMNIST(); 

                }
                break;
            case 68 :
                // InternalOptimizationLexer.g:1:706: MXNet
                {
                mMXNet(); 

                }
                break;
            case 69 :
                // InternalOptimizationLexer.g:1:712: Power
                {
                mPower(); 

                }
                break;
            case 70 :
                // InternalOptimizationLexer.g:1:718: Block
                {
                mBlock(); 

                }
                break;
            case 71 :
                // InternalOptimizationLexer.g:1:724: Data
                {
                mData(); 

                }
                break;
            case 72 :
                // InternalOptimizationLexer.g:1:729: Glow
                {
                mGlow(); 

                }
                break;
            case 73 :
                // InternalOptimizationLexer.g:1:734: Large
                {
                mLarge(); 

                }
                break;
            case 74 :
                // InternalOptimizationLexer.g:1:740: Size
                {
                mSize(); 

                }
                break;
            case 75 :
                // InternalOptimizationLexer.g:1:745: Small
                {
                mSmall(); 

                }
                break;
            case 76 :
                // InternalOptimizationLexer.g:1:751: Type
                {
                mType(); 

                }
                break;
            case 77 :
                // InternalOptimizationLexer.g:1:756: CNTK
                {
                mCNTK(); 

                }
                break;
            case 78 :
                // InternalOptimizationLexer.g:1:761: Cray
                {
                mCray(); 

                }
                break;
            case 79 :
                // InternalOptimizationLexer.g:1:766: Etl
                {
                mEtl(); 

                }
                break;
            case 80 :
                // InternalOptimizationLexer.g:1:770: Hpc
                {
                mHpc(); 

                }
                break;
            case 81 :
                // InternalOptimizationLexer.g:1:774: Mpi
                {
                mMpi(); 

                }
                break;
            case 82 :
                // InternalOptimizationLexer.g:1:778: Xla
                {
                mXla(); 

                }
                break;
            case 83 :
                // InternalOptimizationLexer.g:1:782: AMD
                {
                mAMD(); 

                }
                break;
            case 84 :
                // InternalOptimizationLexer.g:1:786: ARM
                {
                mARM(); 

                }
                break;
            case 85 :
                // InternalOptimizationLexer.g:1:790: HPC
                {
                mHPC(); 

                }
                break;
            case 86 :
                // InternalOptimizationLexer.g:1:794: MPI
                {
                mMPI(); 

                }
                break;
            case 87 :
                // InternalOptimizationLexer.g:1:798: Pgi
                {
                mPgi(); 

                }
                break;
            case 88 :
                // InternalOptimizationLexer.g:1:802: Comma
                {
                mComma(); 

                }
                break;
            case 89 :
                // InternalOptimizationLexer.g:1:808: FullStop
                {
                mFullStop(); 

                }
                break;
            case 90 :
                // InternalOptimizationLexer.g:1:817: Colon
                {
                mColon(); 

                }
                break;
            case 91 :
                // InternalOptimizationLexer.g:1:823: RULE_BT
                {
                mRULE_BT(); 

                }
                break;
            case 92 :
                // InternalOptimizationLexer.g:1:831: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 93 :
                // InternalOptimizationLexer.g:1:839: RULE_BET
                {
                mRULE_BET(); 

                }
                break;
            case 94 :
                // InternalOptimizationLexer.g:1:848: RULE_LET
                {
                mRULE_LET(); 

                }
                break;
            case 95 :
                // InternalOptimizationLexer.g:1:857: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 96 :
                // InternalOptimizationLexer.g:1:868: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 97 :
                // InternalOptimizationLexer.g:1:883: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 98 :
                // InternalOptimizationLexer.g:1:891: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 99 :
                // InternalOptimizationLexer.g:1:900: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 100 :
                // InternalOptimizationLexer.g:1:913: RULE_EXT_INT
                {
                mRULE_EXT_INT(); 

                }
                break;
            case 101 :
                // InternalOptimizationLexer.g:1:926: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 102 :
                // InternalOptimizationLexer.g:1:946: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 103 :
                // InternalOptimizationLexer.g:1:955: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 104 :
                // InternalOptimizationLexer.g:1:967: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 105 :
                // InternalOptimizationLexer.g:1:983: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 106 :
                // InternalOptimizationLexer.g:1:999: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 107 :
                // InternalOptimizationLexer.g:1:1007: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\40\60\3\uffff\1\171\1\173\3\60\1\177\5\60\65\uffff\1\u00c3\34\uffff\1\177\40\uffff\1\u00f2\12\uffff\1\u0100\1\uffff\1\u0102\1\u0103\36\uffff\1\u0121\3\uffff\1\u0125\22\uffff\1\u0138\41\uffff\1\u0156\22\uffff\1\u016b\21\uffff\1\u0179\3\uffff\1\u017c\52\uffff\1\u01a3\3\uffff\1\u01a7\6\uffff\1\u01ae\2\uffff\1\u01b1\3\uffff\1\u01b4\1\u01b5\1\u01b6\1\uffff\1\u0156\10\uffff\1\u01be\17\uffff\1\u01cb\13\uffff\1\u01d7\1\u01d8\22\uffff\1\u01e8\1\u01e9\3\uffff\1\u01ec\65\uffff\1\u0214\1\u0215\2\uffff\1\u0216\1\u0217\5\uffff\1\u021c\1\u021d\30\uffff\1\u0234\104\uffff\1\u0267\23\uffff\1\u0279\1\uffff\1\u027a\14\uffff\1\u0286\4\uffff\1\u028a\23\uffff\1\u0298\35\uffff\1\u02b4\27\uffff\1\u02c5\4\uffff\1\u02c8\1\uffff";
    static final String DFA14_eofS =
        "\u02c9\uffff";
    static final String DFA14_minS =
        "\1\0\40\56\3\uffff\4\75\1\56\1\60\1\101\1\56\2\0\1\52\2\uffff\1\56\1\uffff\102\56\11\uffff\1\56\2\uffff\1\60\4\uffff\47\56\1\55\25\56\1\uffff\44\56\1\uffff\11\56\1\uffff\11\56\1\uffff\2\56\2\uffff\1\56\2\uffff\1\55\34\56\1\uffff\1\56\3\uffff\4\56\1\uffff\5\56\1\uffff\7\56\1\uffff\31\56\1\uffff\3\56\1\uffff\1\56\1\uffff\22\56\1\uffff\5\56\1\uffff\7\56\1\uffff\2\56\1\uffff\3\56\1\uffff\1\56\1\uffff\31\56\1\55\2\56\1\uffff\3\56\1\uffff\3\56\1\uffff\6\56\1\uffff\2\56\6\uffff\7\56\1\uffff\2\56\1\uffff\7\56\3\uffff\13\56\2\uffff\3\56\1\uffff\7\56\1\uffff\3\56\2\uffff\2\56\1\uffff\20\56\1\uffff\3\56\1\uffff\16\56\1\uffff\1\56\6\uffff\4\56\2\uffff\2\56\2\uffff\10\56\1\uffff\3\56\3\uffff\3\56\1\uffff\3\56\2\uffff\13\56\1\uffff\30\56\1\uffff\2\56\1\uffff\3\56\1\uffff\1\56\1\uffff\16\56\1\uffff\2\56\2\uffff\13\56\1\uffff\1\56\3\uffff\11\56\1\uffff\3\56\1\uffff\22\56\1\uffff\6\56\1\uffff\1\56\1\uffff\4\56\3\uffff\3\56\1\uffff\4\56\2\uffff\2\56\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\40\172\3\uffff\4\75\1\172\1\145\2\172\2\uffff\1\57\2\uffff\1\172\1\uffff\102\172\11\uffff\1\172\2\uffff\1\145\4\uffff\75\172\1\uffff\44\172\1\uffff\11\172\1\uffff\11\172\1\uffff\2\172\2\uffff\1\172\2\uffff\35\172\1\uffff\1\172\3\uffff\4\172\1\uffff\5\172\1\uffff\7\172\1\uffff\31\172\1\uffff\3\172\1\uffff\1\172\1\uffff\22\172\1\uffff\5\172\1\uffff\7\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1\uffff\34\172\1\uffff\3\172\1\uffff\3\172\1\uffff\6\172\1\uffff\2\172\6\uffff\7\172\1\uffff\2\172\1\uffff\7\172\3\uffff\13\172\2\uffff\3\172\1\uffff\7\172\1\uffff\3\172\2\uffff\2\172\1\uffff\20\172\1\uffff\3\172\1\uffff\16\172\1\uffff\1\172\6\uffff\4\172\2\uffff\2\172\2\uffff\10\172\1\uffff\3\172\3\uffff\3\172\1\uffff\3\172\2\uffff\13\172\1\uffff\30\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1\uffff\16\172\1\uffff\2\172\2\uffff\13\172\1\uffff\1\172\3\uffff\11\172\1\uffff\3\172\1\uffff\22\172\1\uffff\6\172\1\uffff\1\172\1\uffff\4\172\3\uffff\3\172\1\uffff\4\172\2\uffff\2\172\1\uffff";
    static final String DFA14_acceptS =
        "\41\uffff\1\130\1\131\1\132\13\uffff\1\152\1\153\1\uffff\1\145\102\uffff\1\130\1\131\1\132\1\135\1\133\1\136\1\134\1\137\1\140\1\uffff\1\146\1\144\1\uffff\1\147\1\150\1\151\1\152\75\uffff\1\141\44\uffff\1\117\11\uffff\1\127\11\uffff\1\121\2\uffff\1\43\1\123\1\uffff\1\124\1\142\35\uffff\1\126\1\uffff\1\120\1\122\1\125\4\uffff\1\107\5\uffff\1\112\7\uffff\1\116\31\uffff\1\23\3\uffff\1\143\1\uffff\1\114\22\uffff\1\115\5\uffff\1\110\7\uffff\1\101\2\uffff\1\113\3\uffff\1\70\1\uffff\1\67\34\uffff\1\77\3\uffff\1\106\3\uffff\1\111\6\uffff\1\105\2\uffff\1\100\1\71\1\72\1\102\1\103\1\104\7\uffff\1\76\2\uffff\1\60\7\uffff\1\62\1\63\1\75\13\uffff\1\73\1\74\3\uffff\1\24\7\uffff\1\61\3\uffff\1\65\1\66\2\uffff\1\64\20\uffff\1\51\3\uffff\1\52\16\uffff\1\47\1\uffff\1\50\1\53\1\54\1\55\1\56\1\57\4\uffff\1\45\1\46\2\uffff\1\37\1\40\10\uffff\1\42\3\uffff\1\33\1\34\1\35\3\uffff\1\44\3\uffff\1\36\1\41\13\uffff\1\32\30\uffff\1\26\2\uffff\1\25\3\uffff\1\27\1\uffff\1\31\16\uffff\1\20\2\uffff\1\22\1\30\13\uffff\1\21\1\uffff\1\15\1\16\1\17\11\uffff\1\13\3\uffff\1\14\22\uffff\1\12\6\uffff\1\10\1\uffff\1\11\4\uffff\1\5\1\6\1\7\3\uffff\1\4\4\uffff\1\2\1\3\2\uffff\1\1";
    static final String DFA14_specialS =
        "\1\2\53\uffff\1\1\1\0\u029b\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\47\1\54\4\60\1\55\4\60\1\41\1\60\1\42\1\56\12\51\1\43\1\60\1\45\1\46\1\44\2\60\1\14\1\24\1\30\2\53\1\15\1\53\1\40\1\3\1\53\1\33\1\53\1\34\1\16\1\25\1\26\1\53\1\27\1\53\1\20\6\53\3\60\1\52\1\53\1\60\1\12\1\21\1\5\1\2\1\6\1\50\1\35\1\36\1\31\1\53\1\32\1\22\1\13\1\7\1\10\1\11\1\53\1\1\1\4\1\17\1\53\1\23\1\53\1\37\2\53\uff85\60",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\61\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\64\7\62\1\63\21\62",
            "\1\62\1\uffff\12\62\7\uffff\14\62\1\67\15\62\4\uffff\1\62\1\uffff\14\62\1\65\1\66\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\70\5\62\1\71\3\62\1\72\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\75\15\62\1\73\1\74\1\62\1\76\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\77\5\62\1\100\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\101\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\102\15\62\1\103\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\104\5\62\1\107\12\62\1\105\6\62\1\106\1\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\112\2\62\1\113\2\62\1\110\6\62\1\114\4\62\1\111\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\115\12\62\1\117\5\62\1\116\4\62",
            "\1\62\1\uffff\12\62\7\uffff\10\62\1\120\3\62\1\121\1\124\3\62\1\123\2\62\1\122\5\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\17\62\1\125\12\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\25\62\1\126\4\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\127\14\62\1\130\2\62\1\131\3\62\1\132\1\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\133\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\134\12\62\1\135\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\140\7\62\1\137\5\62\1\136\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\141\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\142\21\62",
            "\1\62\1\uffff\12\62\7\uffff\17\62\1\143\1\62\1\144\10\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\146\11\62\1\145\1\62",
            "\1\62\1\uffff\12\62\7\uffff\4\62\1\147\25\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\10\62\1\151\4\62\1\152\3\62\1\150\10\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\153\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\154\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\155\25\62",
            "\1\62\1\uffff\12\62\7\uffff\15\62\1\156\1\62\1\160\7\62\1\157\2\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\161\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\162\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\163\16\62",
            "\1\62\1\uffff\12\62\7\uffff\17\62\1\164\12\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\170",
            "\1\172",
            "\1\174",
            "\1\175",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\176\31\62",
            "\12\u0081\13\uffff\1\u0080\37\uffff\1\u0080",
            "\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\0\u0082",
            "\0\u0082",
            "\1\u0083\4\uffff\1\u0084",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0087\5\62\1\u0086\21\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0088\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0089\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u008a\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u008b\6\62",
            "\1\62\1\uffff\12\62\7\uffff\1\u008c\31\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u008d\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u008e\14\62\1\u008f",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0090\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u0092\1\u0093\3\62\1\u0091\2\62\1\u0094\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0095\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0096\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0097\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0098\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0099\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u009a\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\11\62\1\u009b\20\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u009d\10\62\1\u009e\5\62\1\u009c\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u009f\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00a0\25\62",
            "\1\62\1\uffff\12\62\7\uffff\23\62\1\u00a1\6\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00a2\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u00a3\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00a4\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00a5\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u00a6\24\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00a7\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u00a9\16\62\1\u00a8\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u00aa\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00ab\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u00ac\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\3\62\1\u00ad\26\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\23\62\1\u00ae\6\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\14\62\1\u00af\15\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\3\62\1\u00b0\26\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\6\62\1\u00b1\23\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\10\62\1\u00b2\21\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00b3\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u00b4\23\62\1\u00b5\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00b6\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00b7\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00b8\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00ba\17\62\1\u00b9\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00bb\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00bc\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u00bd\30\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00bf\6\62\1\u00be\1\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00c0\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u00c1\23\62",
            "\1\62\1\uffff\12\62\7\uffff\4\62\1\u00c2\25\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\23\62\1\u00c4\6\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\26\62\1\u00c5\3\62",
            "\1\62\1\uffff\12\62\7\uffff\22\62\1\u00c6\7\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\4\62\1\u00c7\25\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\5\62\1\u00c8\24\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\23\62\1\u00c9\6\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00ca\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00cb\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u00cc\10\62",
            "\1\62\1\uffff\12\62\7\uffff\10\62\1\u00cd\21\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\15\62\1\u00ce\14\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\10\62\1\u00cf\21\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00d0\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u00d1\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u00d2\31\62",
            "\1\62\1\uffff\12\62\7\uffff\2\62\1\u00d3\27\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00d4\16\62",
            "",
            "",
            "\12\u0081\13\uffff\1\u0080\37\uffff\1\u0080",
            "",
            "",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00d5\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00d6\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u00d7\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u00d8\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u00d9\23\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00da\25\62",
            "\1\62\1\uffff\12\62\7\uffff\6\62\1\u00db\23\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00dc\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00dd\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00de\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u00df\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00e0\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00e1\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u00e2\24\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00e3\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u00e4\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u00e5\22\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u00e6\1\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u00e7\30\62",
            "\1\62\1\uffff\12\62\1\u00e8\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u00e9\30\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u00ea\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u00ec\1\uffff\10\62\1\u00eb\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u00ed\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u00ee\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u00ef\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u00f0\24\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00f1\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u00f3\15\62\1\u00f4\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u00f5\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u00f6\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00f7\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u00f8\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u00f9\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00fa\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u00fb\12\62",
            "\1\62\1\uffff\12\62\1\u00fc\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\10\62\1\u00fd\12\62\1\u00fe\6\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00ff\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\16\62\1\u0101\13\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\1\u0104\31\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\3\62\1\u0105\26\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0106\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0107\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0108\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0109\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u010a\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u010b\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u010c\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\12\62\1\u010d\17\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u010e\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u010f\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0110\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0111\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0112\23\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0113\7\62",
            "\1\62\1\uffff\12\62\7\uffff\3\62\1\u0114\26\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\15\62\1\u0115\14\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0116\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0117\25\62",
            "\1\62\1\uffff\12\62\7\uffff\23\62\1\u0118\6\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\1\u0119\31\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\1\u011a\31\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\12\62\1\u011b\17\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u011c\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u011d\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u011e\31\62",
            "\1\62\1\uffff\12\62\7\uffff\22\62\1\u011f\7\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0120\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\26\62\1\u0122\3\62",
            "\1\62\1\uffff\12\62\1\u0123\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\1\u0124\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0126\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u0127\24\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u0128\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0129\10\62",
            "\1\62\1\uffff\12\62\1\u012a\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u012b\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u012c\16\62",
            "\1\62\1\uffff\12\62\7\uffff\4\62\1\u012d\25\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u012e\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u012f\16\62",
            "\1\62\1\uffff\12\62\1\u0130\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0131\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u0132\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0133\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0134\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0135\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0136\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0137\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0139\16\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u013a\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u013b\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u013c\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u013d\30\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u013e\1\62\1\u013f\11\62\1\u0140\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u0141\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0142\1\u0143\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0144\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0145\10\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0146\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0147\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0148\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0149\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u014a\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u014b\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u014c\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u014d\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u014e\27\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u014f\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0150\10\62",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\23\62\1\u0151\6\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\u0152\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\10\62\1\u0153\21\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0154\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0155\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0157\10\62",
            "\1\62\1\uffff\12\62\1\u0158\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0159\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u015a\26\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u015b\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\12\62\1\u015c\17\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u015d\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u015e\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u015f\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0160\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0161\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0162\31\62",
            "\1\62\1\uffff\12\62\7\uffff\1\u0163\1\62\1\u0164\11\62\1\u0165\15\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0166\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0167\10\62",
            "\1\62\1\uffff\12\62\7\uffff\1\u0168\31\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\23\62\1\u0169\6\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\21\62\1\u016a\10\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u016c\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u016d\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u016e\7\62",
            "\1\62\1\uffff\12\62\7\uffff\23\62\1\u016f\6\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0170\6\62",
            "",
            "\1\62\1\uffff\12\62\1\u0171\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0172\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0173\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u0174\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0175\21\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u0176\1\uffff\15\62\1\u0177\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\27\62\1\u0178\2\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u017a\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u017b\25\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u017d\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u017e\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u017f\23\62",
            "\1\62\1\uffff\12\62\1\u0180\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u0181\1\62",
            "\1\62\1\uffff\12\62\1\u0182\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0183\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0184\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0185\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0186\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0187\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0188\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u0189\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u018a\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u018b\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u018c\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u018d\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u018e\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u018f\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0190\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0191\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0192\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u0193\1\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0194\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u0195\1\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0196\23\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u0197\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u0198\22\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u0199\24\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u019a\31\62",
            "\1\62\1\uffff\12\62\7\uffff\24\62\1\u019b\5\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\1\u019c\31\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u019d\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u019e\16\62",
            "",
            "\1\62\1\uffff\12\62\1\u019f\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01a0\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u01a1\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01a2\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01a4\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01a5\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u01a6\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01a8\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01a9\6\62",
            "\1\62\1\uffff\12\62\7\uffff\2\62\1\u01aa\27\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\13\62\1\u01ab\16\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\17\62\1\u01ac\12\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01ad\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\21\62\1\u01af\10\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\1\u01b0\31\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\1\u01b2\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\1\u01b3\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01b7\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01b8\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u01b9\30\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01ba\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01bb\25\62",
            "\1\62\1\uffff\10\62\1\u01bc\1\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u01bd\23\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u01bf\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01c0\25\62",
            "\1\62\1\uffff\12\62\1\u01c1\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01c2\12\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u01c3\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u01c4\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u01c5\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\31\62\1\u01c6",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01c7\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01c8\27\62",
            "\1\62\1\uffff\12\62\1\u01c9\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\1\u01ca\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01cc\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01cd\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u01ce\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u01cf\22\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u01d0\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01d1\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01d2\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01d3\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01d4\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u01d5\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01d6\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01d9\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u01da\21\62",
            "\1\62\1\uffff\12\62\7\uffff\15\62\1\u01db\14\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u01dc\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u01dd\24\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u01de\31\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\5\62\1\u01df\24\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01e0\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u01e1\26\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01e2\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u01e3\1\62",
            "\1\62\1\uffff\12\62\1\u01e4\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01e5\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u01e6\31\62",
            "\1\62\1\uffff\12\62\7\uffff\2\62\1\u01e7\27\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u01ea\22\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\23\62\1\u01eb\6\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01ed\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u01ee\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u01ef\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u01f0\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u01f1\6\62",
            "\1\62\1\uffff\6\62\1\u01f2\3\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u01f3\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u01f4\30\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u01f5\10\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01f6\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u01f7\15\62\1\u01f8\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u01f9\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u01fa\26\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u01fb\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u01fc\16\62",
            "\1\62\1\uffff\12\62\1\u01fd\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u01fe\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u01ff\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u0200\22\62",
            "\1\62\1\uffff\12\62\1\u0201\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0202\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0203\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0204\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0205\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u0206\1\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0207\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u0208\1\uffff\32\62",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0209\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u020a\14\62",
            "\1\62\1\uffff\12\62\7\uffff\4\62\1\u020b\25\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u020c\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u020d\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u020e\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u020f\31\62",
            "\1\62\1\uffff\12\62\1\u0210\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0211\14\62",
            "\1\62\1\uffff\12\62\1\u0212\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\1\u0213\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0218\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0219\26\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u021a\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u021b\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u021e\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u021f\7\62",
            "\1\62\1\uffff\12\62\1\u0220\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\1\u0221\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0222\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u0223\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u0224\24\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0225\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0226\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0227\26\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0228\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0229\10\62",
            "\1\62\1\uffff\12\62\1\u022a\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\26\62\1\u022b\3\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u022c\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u022d\14\62",
            "\1\62\1\uffff\12\62\1\u022e\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\1\u022f\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\1\u0230\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0231\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0232\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0233\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0235\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0236\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0237\13\62",
            "\1\62\1\uffff\12\62\1\u0238\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\1\u0239\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u023a\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u023b\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u023c\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u023d\7\62",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u023e\24\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u023f\27\62",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0240\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0241\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u0242\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0243\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0244\21\62",
            "\1\62\1\uffff\12\62\1\u0245\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0246\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0247\7\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0248\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0249\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u024a\23\62",
            "",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u024b\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u024c\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u024d\14\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\26\62\1\u024e\3\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u024f\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\26\62\1\u0250\3\62",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\14\62\1\u0251\15\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0252\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u0253\26\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u0254\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u0255\24\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0256\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0257\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u0258\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u025a\22\62\1\u0259\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u025b\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u025c\13\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u025d\31\62",
            "\1\62\1\uffff\12\62\1\u025e\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u025f\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0260\23\62",
            "\1\62\1\uffff\12\62\1\u0261\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\31\62\1\u0262",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0263\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u0264\23\62",
            "\1\62\1\uffff\12\62\1\u0265\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0266\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0268\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0269\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u026a\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u026b\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u026c\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u026d\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u026e\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\62\1\u026f\30\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\7\62\1\u0270\22\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0271\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0272\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0273\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0274\6\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\12\62\1\u0275\17\62",
            "\1\62\1\uffff\12\62\1\u0276\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0277\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0278\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u027b\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u027c\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u027d\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\5\62\1\u027e\24\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u027f\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\17\62\1\u0280\12\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0281\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\24\62\1\u0282\5\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u0283\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u0284\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0285\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0287\21\62",
            "\1\62\1\uffff\12\62\1\u0288\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\1\u0289\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u028b\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u028c\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u028d\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u028e\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u028f\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u0290\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u0291\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0292\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u0293\25\62",
            "\1\62\1\uffff\12\62\1\u0294\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u0295\21\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u0296\13\62",
            "",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\u0297\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u0299\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u029a\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u029b\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u029c\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u029d\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u029e\16\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u029f\31\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u02a0\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u02a1\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\13\62\1\u02a2\16\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u02a3\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u02a4\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u02a5\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u02a6\13\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u02a7\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u02a8\26\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\3\62\1\u02a9\26\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u02aa\14\62",
            "\1\62\1\uffff\12\62\1\u02ab\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\4\62\1\u02ac\25\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u02ad\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\23\62\1\u02ae\6\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\2\62\1\u02af\27\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u02b0\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u02b1\23\62",
            "\1\62\1\uffff\12\62\1\u02b2\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\22\62\1\u02b3\7\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\1\u02b5\31\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u02b6\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u02b7\21\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\30\62\1\u02b8\1\62",
            "\1\62\1\uffff\12\62\1\u02b9\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\1\u02ba\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\1\u02bb\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\21\62\1\u02bc\10\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u02bd\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\16\62\1\u02be\13\62",
            "\1\62\1\uffff\12\62\1\u02bf\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u02c0\14\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u02c1\23\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u02c2\14\62",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u02c3\21\62",
            "\1\62\1\uffff\12\62\1\u02c4\6\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\15\62\1\u02c6\14\62",
            "",
            "",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\6\62\1\u02c7\23\62",
            "\1\62\1\uffff\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
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
            return "1:1: Tokens : ( Reinforncement_learning | Distributed_training | Image_classification | Scaling_efficiency | Core_subscription | Enable_autotuning | Number_of_threads | Enable_opt_build | Object_detection | Parallelisation | Number_of_acc | Recommendation | Ai_framework | Message_size | AI_Inference | Ai_training | Optimization | AI_Training | FPGAXilinx | NVIDIAV100 | Autotuning | Parameters | Tensorflow | Translation | TensorFlow | Opt_build | Acc_type | Affinity | App_type | Basedata | Compiler | Cpu_type | Location | Prefetch | AMDM100 | AUTOTUNE | Imagenet | Intelx86 | Backend | Library | Openacc | PyTorch_1 | Version | BigData | OPENACC | PyTorch | RESTART | Config | Layers | Opencl | Openmp | CREATA | OPENCL | OPENMP | Cache | Count | Input | Keras_1 | Medium | Mvapch | Opnmpi | Simple | Tuner | CIFAR | IMAGE | Keras | MNIST | MXNet | Power | Block | Data | Glow | Large | Size | Small | Type | CNTK | Cray | Etl | Hpc | Mpi | Xla | AMD | ARM | HPC | MPI | Pgi | Comma | FullStop | Colon | RULE_BT | RULE_LT | RULE_BET | RULE_LET | RULE_EQUAL | RULE_NOT_EQUAL | RULE_OR | RULE_AND | RULE_BOOLEAN | RULE_EXT_INT | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_45 = input.LA(1);

                        s = -1;
                        if ( ((LA14_45>='\u0000' && LA14_45<='\uFFFF')) ) {s = 130;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_44 = input.LA(1);

                        s = -1;
                        if ( ((LA14_44>='\u0000' && LA14_44<='\uFFFF')) ) {s = 130;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
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

                        else if ( (LA14_0=='F') ) {s = 13;}

                        else if ( (LA14_0=='N') ) {s = 14;}

                        else if ( (LA14_0=='t') ) {s = 15;}

                        else if ( (LA14_0=='T') ) {s = 16;}

                        else if ( (LA14_0=='b') ) {s = 17;}

                        else if ( (LA14_0=='l') ) {s = 18;}

                        else if ( (LA14_0=='v') ) {s = 19;}

                        else if ( (LA14_0=='B') ) {s = 20;}

                        else if ( (LA14_0=='O') ) {s = 21;}

                        else if ( (LA14_0=='P') ) {s = 22;}

                        else if ( (LA14_0=='R') ) {s = 23;}

                        else if ( (LA14_0=='C') ) {s = 24;}

                        else if ( (LA14_0=='i') ) {s = 25;}

                        else if ( (LA14_0=='k') ) {s = 26;}

                        else if ( (LA14_0=='K') ) {s = 27;}

                        else if ( (LA14_0=='M') ) {s = 28;}

                        else if ( (LA14_0=='g') ) {s = 29;}

                        else if ( (LA14_0=='h') ) {s = 30;}

                        else if ( (LA14_0=='x') ) {s = 31;}

                        else if ( (LA14_0=='H') ) {s = 32;}

                        else if ( (LA14_0==',') ) {s = 33;}

                        else if ( (LA14_0=='.') ) {s = 34;}

                        else if ( (LA14_0==':') ) {s = 35;}

                        else if ( (LA14_0=='>') ) {s = 36;}

                        else if ( (LA14_0=='<') ) {s = 37;}

                        else if ( (LA14_0=='=') ) {s = 38;}

                        else if ( (LA14_0=='!') ) {s = 39;}

                        else if ( (LA14_0=='f') ) {s = 40;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 41;}

                        else if ( (LA14_0=='^') ) {s = 42;}

                        else if ( ((LA14_0>='D' && LA14_0<='E')||LA14_0=='G'||LA14_0=='J'||LA14_0=='L'||LA14_0=='Q'||LA14_0=='S'||(LA14_0>='U' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='j'||LA14_0=='q'||LA14_0=='u'||LA14_0=='w'||(LA14_0>='y' && LA14_0<='z')) ) {s = 43;}

                        else if ( (LA14_0=='\"') ) {s = 44;}

                        else if ( (LA14_0=='\'') ) {s = 45;}

                        else if ( (LA14_0=='/') ) {s = 46;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 47;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||LA14_0=='-'||LA14_0==';'||(LA14_0>='?' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 48;}

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