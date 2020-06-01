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
    public static final int RULE_LET=99;
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
    public static final int RULE_NOT_EQUAL=101;
    public static final int Imagenet=41;
    public static final int RULE_OR=102;
    public static final int Prefetch=38;
    public static final int Translation=28;
    public static final int Parameters=26;
    public static final int Small=79;
    public static final int RULE_EQUAL=100;
    public static final int RULE_ID=109;
    public static final int Cray=82;
    public static final int Number_of_acc=14;
    public static final int Recommendation=15;
    public static final int Pgi=91;
    public static final int Enable_opt_build=11;
    public static final int RULE_INT=107;
    public static final int FPGAXilinx=23;
    public static final int RULE_ML_COMMENT=111;
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
    public static final int Ai_training=20;
    public static final int OPENACC=49;
    public static final int Layers=53;
    public static final int Basedata=34;
    public static final int TensorFlow=29;
    public static final int FullStop=95;
    public static final int AI_Training=21;
    public static final int OPENCL=57;
    public static final int Opt_build=30;
    public static final int RULE_BT=96;
    public static final int Ai_framework=16;
    public static final int Type=80;
    public static final int Image_classification=6;
    public static final int Message_size=17;
    public static final int Opencl=54;
    public static final int Etl=83;
    public static final int PyTorch_1=46;
    public static final int Power=73;
    public static final int Number_of_threads=10;
    public static final int RULE_BEGIN=104;
    public static final int Constraint=22;
    public static final int RULE_BOOLEAN=106;
    public static final int Tuner=67;
    public static final int Glow=76;
    public static final int Input=61;
    public static final int MXNet=72;
    public static final int RULE_BET=98;
    public static final int Version=47;
    public static final int AMD=87;
    public static final int NVIDIAV100=24;
    public static final int Object_detection=12;
    public static final int AMDM100=39;
    public static final int Compiler=35;
    public static final int Openmp=55;
    public static final int RightParenthesis=93;
    public static final int RULE_LT=97;
    public static final int Medium=63;
    public static final int Affinity=32;
    public static final int Block=74;
    public static final int Library=44;
    public static final int Cache=59;
    public static final int AI_Inference=19;
    public static final int RULE_END=105;
    public static final int Reinforncement_learning=4;
    public static final int Config=52;
    public static final int RULE_STRING=110;
    public static final int Xla=86;
    public static final int Optimization=18;
    public static final int Acc_type=31;
    public static final int App_type=33;
    public static final int RULE_AND=103;
    public static final int RULE_SL_COMMENT=112;
    public static final int Intelx86=42;
    public static final int RESTART=51;
    public static final int EOF=-1;
    public static final int Keras_1=62;
    public static final int RULE_WS=113;
    public static final int RULE_EXT_INT=108;
    public static final int Data=75;
    public static final int RULE_ANY_OTHER=114;
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

    // $ANTLR start "Optimization"
    public final void mOptimization() throws RecognitionException {
        try {
            int _type = Optimization;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:42:14: ( 'optimization:' )
            // InternalOptimizationLexer.g:42:16: 'optimization:'
            {
            match("optimization:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Optimization"

    // $ANTLR start "AI_Inference"
    public final void mAI_Inference() throws RecognitionException {
        try {
            int _type = AI_Inference;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:44:14: ( 'AI_Inference' )
            // InternalOptimizationLexer.g:44:16: 'AI_Inference'
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
            // InternalOptimizationLexer.g:46:13: ( 'ai_training:' )
            // InternalOptimizationLexer.g:46:15: 'ai_training:'
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

    // $ANTLR start "RULE_BT"
    public final void mRULE_BT() throws RecognitionException {
        try {
            int _type = RULE_BT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:198:9: ( '>' )
            // InternalOptimizationLexer.g:198:11: '>'
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
            // InternalOptimizationLexer.g:200:9: ( '<' )
            // InternalOptimizationLexer.g:200:11: '<'
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
            // InternalOptimizationLexer.g:202:10: ( '>=' )
            // InternalOptimizationLexer.g:202:12: '>='
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
            // InternalOptimizationLexer.g:204:10: ( '<=' )
            // InternalOptimizationLexer.g:204:12: '<='
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
            // InternalOptimizationLexer.g:206:12: ( '==' )
            // InternalOptimizationLexer.g:206:14: '=='
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
            // InternalOptimizationLexer.g:208:16: ( '!=' )
            // InternalOptimizationLexer.g:208:18: '!='
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
            // InternalOptimizationLexer.g:210:9: ( 'OR' )
            // InternalOptimizationLexer.g:210:11: 'OR'
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
            // InternalOptimizationLexer.g:212:10: ( 'AND' )
            // InternalOptimizationLexer.g:212:12: 'AND'
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
            // InternalOptimizationLexer.g:214:21: ()
            // InternalOptimizationLexer.g:214:23: 
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
            // InternalOptimizationLexer.g:216:19: ()
            // InternalOptimizationLexer.g:216:21: 
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
            // InternalOptimizationLexer.g:218:14: ( ( 'true' | 'false' ) )
            // InternalOptimizationLexer.g:218:16: ( 'true' | 'false' )
            {
            // InternalOptimizationLexer.g:218:16: ( 'true' | 'false' )
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
                    // InternalOptimizationLexer.g:218:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalOptimizationLexer.g:218:24: 'false'
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
            // InternalOptimizationLexer.g:220:14: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )
            // InternalOptimizationLexer.g:220:16: RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:222:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOptimizationLexer.g:222:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOptimizationLexer.g:222:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOptimizationLexer.g:222:11: '^'
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

            // InternalOptimizationLexer.g:222:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
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
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
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
            // InternalOptimizationLexer.g:224:10: ( ( '0' .. '9' )+ )
            // InternalOptimizationLexer.g:224:12: ( '0' .. '9' )+
            {
            // InternalOptimizationLexer.g:224:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOptimizationLexer.g:224:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalOptimizationLexer.g:226:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOptimizationLexer.g:226:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOptimizationLexer.g:226:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOptimizationLexer.g:226:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOptimizationLexer.g:226:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalOptimizationLexer.g:226:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOptimizationLexer.g:226:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalOptimizationLexer.g:226:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOptimizationLexer.g:226:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOptimizationLexer.g:226:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOptimizationLexer.g:226:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalOptimizationLexer.g:228:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOptimizationLexer.g:228:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOptimizationLexer.g:228:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOptimizationLexer.g:228:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalOptimizationLexer.g:230:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOptimizationLexer.g:230:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOptimizationLexer.g:230:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOptimizationLexer.g:230:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalOptimizationLexer.g:230:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOptimizationLexer.g:230:41: ( '\\r' )? '\\n'
                    {
                    // InternalOptimizationLexer.g:230:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalOptimizationLexer.g:230:41: '\\r'
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
            // InternalOptimizationLexer.g:232:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOptimizationLexer.g:232:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOptimizationLexer.g:232:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalOptimizationLexer.g:234:16: ( . )
            // InternalOptimizationLexer.g:234:18: .
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
        // InternalOptimizationLexer.g:1:8: ( Reinforncement_learning | Distributed_training | Image_classification | Scaling_efficiency | Core_subscription | Enable_autotuning | Number_of_threads | Enable_opt_build | Object_detection | Parallelisation | Number_of_acc | Recommendation | Ai_framework | Message_size | Optimization | AI_Inference | Ai_training | AI_Training | Constraint | FPGAXilinx | NVIDIAV100 | Autotuning | Parameters | Tensorflow | Translation | TensorFlow | Opt_build | Acc_type | Affinity | App_type | Basedata | Compiler | Cpu_type | Location | Prefetch | AMDM100 | AUTOTUNE | Imagenet | Intelx86 | Backend | Library | Openacc | PyTorch_1 | Version | BigData | OPENACC | PyTorch | RESTART | Config | Layers | Opencl | Openmp | CREATA | OPENCL | OPENMP | Cache | Count | Input | Keras_1 | Medium | Mvapch | Opnmpi | Simple | Tuner | CIFAR | IMAGE | Keras | MNIST | MXNet | Power | Block | Data | Glow | Large | Size | Small | Type | CNTK | Cray | Etl | Hpc | Mpi | Xla | AMD | ARM | HPC | MPI | Pgi | LeftParenthesis | RightParenthesis | Comma | FullStop | RULE_BT | RULE_LT | RULE_BET | RULE_LET | RULE_EQUAL | RULE_NOT_EQUAL | RULE_OR | RULE_AND | RULE_BOOLEAN | RULE_EXT_INT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=109;
        alt13 = dfa13.predict(input);
        switch (alt13) {
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
                // InternalOptimizationLexer.g:1:254: Optimization
                {
                mOptimization(); 

                }
                break;
            case 16 :
                // InternalOptimizationLexer.g:1:267: AI_Inference
                {
                mAI_Inference(); 

                }
                break;
            case 17 :
                // InternalOptimizationLexer.g:1:280: Ai_training
                {
                mAi_training(); 

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
                // InternalOptimizationLexer.g:1:861: RULE_BT
                {
                mRULE_BT(); 

                }
                break;
            case 94 :
                // InternalOptimizationLexer.g:1:869: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 95 :
                // InternalOptimizationLexer.g:1:877: RULE_BET
                {
                mRULE_BET(); 

                }
                break;
            case 96 :
                // InternalOptimizationLexer.g:1:886: RULE_LET
                {
                mRULE_LET(); 

                }
                break;
            case 97 :
                // InternalOptimizationLexer.g:1:895: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 98 :
                // InternalOptimizationLexer.g:1:906: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 99 :
                // InternalOptimizationLexer.g:1:921: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 100 :
                // InternalOptimizationLexer.g:1:929: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 101 :
                // InternalOptimizationLexer.g:1:938: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 102 :
                // InternalOptimizationLexer.g:1:951: RULE_EXT_INT
                {
                mRULE_EXT_INT(); 

                }
                break;
            case 103 :
                // InternalOptimizationLexer.g:1:964: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 104 :
                // InternalOptimizationLexer.g:1:972: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 105 :
                // InternalOptimizationLexer.g:1:981: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 106 :
                // InternalOptimizationLexer.g:1:993: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 107 :
                // InternalOptimizationLexer.g:1:1009: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 108 :
                // InternalOptimizationLexer.g:1:1025: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 109 :
                // InternalOptimizationLexer.g:1:1033: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\40\63\4\uffff\1\174\1\176\2\61\1\63\1\u0082\1\61\1\uffff\3\61\2\uffff\1\63\1\uffff\65\63\1\u00ca\15\63\12\uffff\1\63\1\uffff\1\u0082\5\uffff\34\63\1\u00f6\12\63\1\u0104\1\63\1\u0106\1\u0107\26\63\1\uffff\10\63\1\u0126\3\63\1\u012a\22\63\1\u013d\1\63\1\uffff\11\63\1\uffff\11\63\1\uffff\2\63\2\uffff\1\63\2\uffff\3\63\1\u015a\4\63\1\u015f\25\63\1\uffff\1\63\3\uffff\4\63\1\uffff\2\63\1\u017f\2\63\1\uffff\1\u0182\6\63\1\uffff\33\63\1\u01a4\2\uffff\3\63\1\uffff\1\63\1\uffff\3\63\1\u01ac\3\63\1\u01b0\6\63\1\u01b7\3\63\1\u01bb\1\u01bc\1\u01bd\1\uffff\1\u015f\6\63\1\uffff\1\63\1\u01c5\1\uffff\3\63\1\uffff\1\63\1\uffff\10\63\1\u01d2\13\63\1\u01de\1\u01df\4\63\1\u01e4\1\uffff\3\63\1\uffff\3\63\1\uffff\3\63\1\uffff\3\63\1\u01f1\1\u01f2\1\63\1\uffff\1\63\5\uffff\7\63\1\uffff\2\63\1\uffff\7\63\3\uffff\13\63\2\uffff\4\63\2\uffff\7\63\1\uffff\1\63\1\u021d\1\u021e\2\uffff\1\u021f\1\u0220\4\63\1\u0225\1\u0226\12\63\1\uffff\3\63\1\uffff\11\63\1\u023d\5\63\1\uffff\1\63\6\uffff\4\63\2\uffff\2\63\2\uffff\10\63\1\uffff\3\63\3\uffff\3\63\1\uffff\4\63\2\uffff\13\63\1\uffff\13\63\1\u0273\15\63\1\uffff\2\63\1\uffff\2\63\1\u0285\2\uffff\1\u0286\1\uffff\16\63\1\uffff\1\63\1\u0296\2\uffff\13\63\1\uffff\1\63\3\uffff\1\63\1\u02a4\7\63\1\uffff\3\63\1\uffff\21\63\1\u02c0\1\uffff\6\63\1\uffff\1\63\1\uffff\4\63\3\uffff\3\63\1\uffff\2\63\1\u02d1\1\63\2\uffff\1\63\1\u02d4\1\uffff";
    static final String DFA13_eofS =
        "\u02d5\uffff";
    static final String DFA13_minS =
        "\1\0\1\145\1\141\1\115\1\143\1\141\1\156\1\165\1\142\1\141\1\143\1\145\2\111\1\120\1\126\2\145\2\141\1\145\1\151\1\120\1\157\1\105\1\156\2\145\1\116\1\154\1\160\1\154\1\120\4\uffff\4\75\1\141\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\143\1\uffff\1\163\1\164\1\141\1\164\1\101\1\141\1\155\1\141\1\155\1\165\1\143\2\141\1\154\1\155\1\152\1\145\1\162\1\145\1\124\1\151\1\137\1\164\1\143\1\146\1\160\1\144\1\141\1\151\1\137\1\104\1\124\1\115\1\104\1\156\1\105\1\106\1\124\1\107\1\111\1\156\1\141\1\156\1\160\1\156\1\143\1\157\1\143\1\142\2\162\1\147\1\105\1\60\1\124\1\167\1\123\1\160\2\162\1\111\1\116\1\111\1\157\1\143\1\141\1\103\12\uffff\1\154\1\uffff\1\60\5\uffff\1\156\1\157\1\164\1\141\1\147\1\145\1\107\1\154\1\160\1\145\1\154\1\145\1\160\1\146\1\156\1\137\1\150\1\171\1\142\1\72\1\142\1\145\1\137\1\156\1\155\1\141\1\146\1\157\1\60\1\146\1\157\1\137\1\151\1\137\1\163\1\151\1\160\1\72\1\111\1\55\1\117\2\60\1\163\2\101\1\113\1\101\1\104\1\163\1\156\3\145\1\163\1\145\1\153\1\143\1\141\1\162\1\145\1\147\1\163\1\104\1\116\1\uffff\1\157\1\145\1\124\1\165\2\141\1\123\1\145\1\60\1\167\2\72\1\60\1\163\1\146\1\155\1\162\1\72\1\145\1\154\1\105\1\151\1\154\1\72\1\154\1\137\2\151\2\164\1\145\1\60\1\154\1\uffff\1\145\1\143\1\155\1\142\1\141\1\160\1\154\1\145\1\162\1\uffff\2\162\2\164\1\156\1\164\1\141\1\165\1\143\1\uffff\1\156\1\162\2\uffff\1\124\2\uffff\1\164\1\124\1\122\1\60\1\55\1\111\1\157\1\163\1\60\1\162\1\72\1\157\1\144\1\145\1\153\1\164\1\141\1\162\1\145\1\151\1\141\1\101\2\162\1\101\1\164\2\163\1\124\1\164\1\uffff\1\72\3\uffff\1\145\1\157\1\155\1\151\1\uffff\1\137\1\170\1\60\1\156\1\145\1\uffff\1\60\1\163\1\154\1\147\1\72\1\171\1\72\1\uffff\1\145\1\162\1\164\1\151\1\165\1\143\1\154\1\160\1\151\1\154\1\145\1\164\1\143\2\141\1\165\1\171\1\151\1\171\1\147\1\155\1\150\1\146\1\141\1\125\1\162\1\101\1\60\2\uffff\1\101\1\162\1\154\1\uffff\1\72\1\uffff\1\162\1\141\1\156\1\60\1\151\1\162\1\163\1\60\1\157\1\164\1\103\1\114\1\120\1\143\1\60\1\122\2\72\3\60\1\uffff\1\60\1\162\1\145\1\142\1\143\1\145\1\70\1\uffff\1\147\1\60\1\uffff\1\165\1\145\1\72\1\uffff\1\160\1\uffff\3\137\1\172\1\151\1\143\2\72\1\60\1\145\1\164\1\143\1\150\1\155\1\151\1\156\1\160\1\164\1\160\1\145\2\60\1\145\1\151\1\116\1\141\1\60\1\uffff\1\55\1\146\1\141\1\uffff\1\106\1\164\1\144\1\uffff\1\157\1\171\1\72\1\uffff\1\156\1\141\1\103\2\60\1\150\1\uffff\1\124\5\uffff\2\156\1\165\1\154\1\164\1\66\1\137\1\uffff\1\142\1\162\1\uffff\1\145\1\141\1\157\1\144\1\141\1\154\1\72\3\uffff\1\154\1\145\1\150\1\72\1\145\1\156\1\151\1\145\1\171\1\145\1\137\2\uffff\1\162\1\156\1\105\1\151\2\uffff\1\154\1\164\1\154\1\141\1\72\1\156\1\72\1\uffff\1\72\2\60\2\uffff\2\60\1\143\1\144\1\164\1\141\2\60\1\145\1\163\2\72\1\165\1\160\1\146\1\145\1\164\1\144\1\uffff\1\151\1\162\1\72\1\uffff\1\167\1\151\1\156\3\72\1\163\1\145\1\151\1\60\1\156\1\157\1\151\1\157\1\72\1\uffff\1\72\6\uffff\1\145\1\141\1\145\1\163\2\uffff\1\146\1\143\2\uffff\2\164\1\137\1\164\1\151\1\72\2\163\1\uffff\1\157\1\156\1\147\3\uffff\1\151\2\156\1\uffff\1\164\1\167\1\157\1\167\2\uffff\1\155\1\164\1\144\1\163\1\146\1\162\1\157\1\137\1\141\1\145\1\157\1\uffff\1\141\1\72\1\162\1\147\1\72\1\172\1\143\1\147\2\72\1\156\1\60\1\145\1\151\1\137\3\151\1\164\1\142\1\150\2\143\1\156\1\164\1\uffff\1\153\1\72\1\uffff\2\145\1\60\2\uffff\1\60\1\uffff\1\156\1\157\1\164\1\146\1\143\1\160\2\165\1\162\1\143\1\164\1\72\1\151\1\72\1\uffff\1\72\1\60\2\uffff\1\164\1\156\1\162\2\151\1\164\1\156\1\151\1\145\1\72\1\151\1\uffff\1\157\3\uffff\1\137\1\60\1\141\1\143\1\145\2\151\1\154\1\141\1\uffff\1\157\1\156\1\154\1\uffff\1\151\1\141\1\156\1\157\1\156\2\144\1\156\1\72\1\145\1\156\1\164\1\143\1\156\1\147\1\72\1\163\1\60\1\uffff\1\141\2\151\1\171\2\72\1\uffff\1\72\1\uffff\1\162\1\156\1\157\1\72\3\uffff\1\156\1\147\1\156\1\uffff\1\151\1\72\1\60\1\156\2\uffff\1\147\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\145\1\151\1\156\1\155\1\162\1\164\1\165\1\160\1\171\1\165\1\166\1\125\1\157\1\120\1\126\1\171\1\145\1\154\1\157\1\145\1\151\1\122\1\171\1\105\1\156\2\145\1\130\1\154\1\160\1\154\1\120\4\uffff\4\75\1\141\1\145\1\172\1\uffff\2\uffff\1\57\2\uffff\1\151\1\uffff\1\163\1\164\1\141\1\164\1\101\1\141\1\172\1\141\2\165\1\143\2\141\1\154\1\155\1\152\1\164\1\162\1\145\1\124\1\151\1\137\1\164\1\143\1\146\1\160\1\163\1\141\1\151\1\137\1\104\1\124\1\115\1\104\1\156\1\105\1\106\1\124\1\107\1\111\1\156\1\165\1\156\1\160\1\156\1\163\1\157\1\143\1\142\1\171\1\162\1\147\1\105\1\172\1\124\1\167\1\123\1\160\2\162\1\111\1\116\1\111\1\157\1\143\1\141\1\103\12\uffff\1\154\1\uffff\1\145\5\uffff\1\156\1\157\1\164\1\141\1\147\1\145\1\107\1\154\1\160\1\145\1\154\1\145\1\160\1\146\1\156\1\137\1\150\1\171\1\142\1\72\1\142\1\145\1\151\1\156\1\155\1\141\1\146\1\157\1\172\1\164\1\157\1\137\1\151\1\137\1\163\1\151\1\160\1\72\1\124\1\172\1\117\2\172\1\163\2\101\1\113\1\101\1\104\1\163\1\156\3\145\1\163\1\145\1\153\1\143\1\141\1\162\1\145\1\147\1\163\1\104\1\116\1\uffff\1\157\1\145\1\124\1\165\2\141\1\123\1\145\1\172\1\167\2\72\1\172\1\163\1\146\1\155\1\162\1\72\1\145\1\154\1\105\1\151\1\154\1\72\1\154\1\137\2\151\2\164\1\145\1\172\1\154\1\uffff\1\145\1\143\1\155\1\142\1\155\1\160\1\155\1\145\1\162\1\uffff\2\162\2\164\1\156\1\164\1\141\1\165\1\143\1\uffff\1\156\1\162\2\uffff\1\124\2\uffff\1\164\1\124\1\122\1\172\1\55\1\111\1\157\1\163\1\172\1\162\1\72\1\157\1\144\1\145\1\153\1\164\1\141\1\162\1\145\1\151\1\141\1\115\2\162\1\101\1\164\2\163\1\124\1\164\1\uffff\1\72\3\uffff\1\145\1\157\1\155\1\151\1\uffff\1\156\1\170\1\172\1\156\1\145\1\uffff\1\172\1\163\1\154\1\147\1\72\1\171\1\72\1\uffff\1\145\1\162\1\164\1\151\1\165\1\143\1\154\1\160\1\151\1\154\1\145\1\164\1\143\2\141\1\165\1\171\1\151\1\171\1\147\1\155\1\150\1\146\1\141\1\125\1\162\1\101\1\172\2\uffff\1\101\1\162\1\154\1\uffff\1\72\1\uffff\1\162\1\141\1\156\1\172\1\151\1\162\1\163\1\172\1\157\1\164\1\103\1\114\1\120\1\143\1\172\1\122\2\72\3\172\1\uffff\1\172\1\162\1\145\1\142\1\143\1\145\1\70\1\uffff\1\147\1\172\1\uffff\1\165\1\145\1\72\1\uffff\1\160\1\uffff\3\137\1\172\1\151\1\143\2\72\1\172\1\145\1\164\1\143\1\150\1\155\1\151\1\156\1\160\1\164\1\160\1\145\2\172\1\145\1\151\1\116\1\141\1\172\1\uffff\1\55\1\146\1\141\1\uffff\1\106\1\164\1\144\1\uffff\1\157\1\171\1\72\1\uffff\1\156\1\141\1\103\2\172\1\150\1\uffff\1\124\5\uffff\2\156\1\165\1\154\1\164\1\66\1\137\1\uffff\1\142\1\162\1\uffff\1\145\2\157\1\144\1\141\1\154\1\72\3\uffff\1\154\1\145\1\150\1\72\1\145\1\156\1\151\1\145\1\171\1\145\1\137\2\uffff\1\162\1\156\1\105\1\151\2\uffff\1\154\1\164\1\154\1\141\1\72\1\156\1\72\1\uffff\1\72\2\172\2\uffff\2\172\1\143\1\144\1\164\1\141\2\172\1\145\1\163\2\72\1\165\1\160\1\146\1\145\1\164\1\144\1\uffff\1\151\1\162\1\72\1\uffff\1\167\1\151\1\156\3\72\1\163\1\145\1\151\1\172\1\156\1\157\1\151\1\157\1\72\1\uffff\1\72\6\uffff\1\145\1\141\1\145\1\163\2\uffff\1\146\1\143\2\uffff\2\164\1\137\1\164\1\151\1\72\2\163\1\uffff\1\157\1\156\1\147\3\uffff\1\151\2\156\1\uffff\1\164\1\167\1\157\1\167\2\uffff\1\155\1\164\1\144\1\163\1\146\1\162\1\157\1\137\1\164\1\145\1\157\1\uffff\1\141\1\72\1\162\1\147\1\72\1\172\1\143\1\147\2\72\1\156\1\172\1\145\1\151\1\137\3\151\1\164\1\142\1\150\2\143\1\156\1\164\1\uffff\1\153\1\72\1\uffff\2\145\1\172\2\uffff\1\172\1\uffff\1\156\1\157\1\164\1\146\1\143\1\160\2\165\1\162\1\143\1\164\1\72\1\151\1\72\1\uffff\1\72\1\172\2\uffff\1\164\1\156\1\162\2\151\1\164\1\156\1\151\1\145\1\72\1\151\1\uffff\1\157\3\uffff\1\137\1\172\1\141\1\143\1\145\2\151\1\154\1\141\1\uffff\1\157\1\156\1\154\1\uffff\1\151\1\141\1\156\1\157\1\156\2\144\1\156\1\72\1\145\1\156\1\164\1\143\1\156\1\147\1\72\1\163\1\172\1\uffff\1\141\2\151\1\171\2\72\1\uffff\1\72\1\uffff\1\162\1\156\1\157\1\72\3\uffff\1\156\1\147\1\156\1\uffff\1\151\1\72\1\172\1\156\2\uffff\1\147\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\41\uffff\1\131\1\132\1\133\1\134\7\uffff\1\147\3\uffff\1\154\1\155\1\uffff\1\147\103\uffff\1\131\1\132\1\133\1\134\1\137\1\135\1\140\1\136\1\141\1\142\1\uffff\1\150\1\uffff\1\146\1\151\1\152\1\153\1\154\101\uffff\1\143\41\uffff\1\120\11\uffff\1\130\11\uffff\1\122\2\uffff\1\44\1\124\1\uffff\1\125\1\144\36\uffff\1\127\1\uffff\1\121\1\123\1\126\4\uffff\1\110\5\uffff\1\113\7\uffff\1\117\34\uffff\1\116\1\24\3\uffff\1\145\1\uffff\1\115\25\uffff\1\111\7\uffff\1\102\2\uffff\1\114\3\uffff\1\71\1\uffff\1\70\33\uffff\1\101\3\uffff\1\100\3\uffff\1\107\3\uffff\1\112\6\uffff\1\106\1\uffff\1\72\1\73\1\103\1\104\1\105\7\uffff\1\77\2\uffff\1\61\7\uffff\1\63\1\64\1\76\13\uffff\1\74\1\75\4\uffff\1\65\1\25\7\uffff\1\62\3\uffff\1\66\1\67\22\uffff\1\52\3\uffff\1\53\17\uffff\1\50\1\uffff\1\51\1\54\1\55\1\56\1\57\1\60\4\uffff\1\46\1\47\2\uffff\1\40\1\41\10\uffff\1\43\3\uffff\1\34\1\35\1\36\3\uffff\1\45\4\uffff\1\37\1\42\13\uffff\1\33\31\uffff\1\27\2\uffff\1\26\3\uffff\1\23\1\30\1\uffff\1\32\16\uffff\1\21\2\uffff\1\22\1\31\13\uffff\1\17\1\uffff\1\15\1\16\1\20\11\uffff\1\13\3\uffff\1\14\22\uffff\1\12\6\uffff\1\10\1\uffff\1\11\4\uffff\1\5\1\6\1\7\3\uffff\1\4\4\uffff\1\2\1\3\2\uffff\1\1";
    static final String DFA13_specialS =
        "\1\2\54\uffff\1\0\1\1\u02a6\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\61\2\60\2\61\1\60\22\61\1\60\1\50\1\55\4\61\1\56\1\41\1\42\2\61\1\43\1\61\1\44\1\57\12\52\2\61\1\46\1\47\1\45\2\61\1\14\1\25\1\15\2\54\1\16\1\54\1\40\1\3\1\54\1\33\1\54\1\34\1\17\1\26\1\27\1\54\1\30\1\54\1\21\6\54\3\61\1\53\1\54\1\61\1\12\1\22\1\5\1\2\1\6\1\51\1\35\1\36\1\31\1\54\1\32\1\23\1\13\1\7\1\10\1\11\1\54\1\1\1\4\1\20\1\54\1\24\1\54\1\37\2\54\uff85\61",
            "\1\62",
            "\1\65\7\uffff\1\64",
            "\1\70\37\uffff\1\66\1\67",
            "\1\71\5\uffff\1\72\3\uffff\1\73",
            "\1\76\15\uffff\1\74\1\75\1\uffff\1\77",
            "\1\100\5\uffff\1\101",
            "\1\102",
            "\1\103\15\uffff\1\104",
            "\1\105\5\uffff\1\110\12\uffff\1\106\6\uffff\1\107",
            "\1\113\2\uffff\1\114\2\uffff\1\111\6\uffff\1\115\4\uffff\1\112",
            "\1\116\12\uffff\1\120\5\uffff\1\117",
            "\1\121\3\uffff\1\122\1\125\3\uffff\1\124\2\uffff\1\123",
            "\1\130\4\uffff\1\131\3\uffff\1\127\34\uffff\1\126",
            "\1\132",
            "\1\133",
            "\1\134\14\uffff\1\135\2\uffff\1\136\3\uffff\1\137",
            "\1\140",
            "\1\141\12\uffff\1\142",
            "\1\145\7\uffff\1\144\5\uffff\1\143",
            "\1\146",
            "\1\147",
            "\1\150\1\uffff\1\151",
            "\1\153\11\uffff\1\152",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160\1\uffff\1\162\7\uffff\1\161",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "",
            "",
            "",
            "\1\173",
            "\1\175",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\12\u0083\13\uffff\1\u0084\37\uffff\1\u0084",
            "\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\0\u0085",
            "\0\u0085",
            "\1\u0086\4\uffff\1\u0087",
            "",
            "",
            "\1\u008a\5\uffff\1\u0089",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\14\uffff\1\u0092",
            "\1\u0093",
            "\1\u0095\1\u0096\3\uffff\1\u0094\2\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u00a0\10\uffff\1\u00a1\5\uffff\1\u009f",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ac\16\uffff\1\u00ab",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb\23\uffff\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c1\17\uffff\1\u00c0",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c6\6\uffff\1\u00c5",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
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
            "\1\u00d8",
            "",
            "\12\u0083\13\uffff\1\u0084\37\uffff\1\u0084",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00f0\11\uffff\1\u00ef",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u00f7\15\uffff\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101\12\uffff\1\u0102",
            "\1\u0103\2\uffff\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0105",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143\1\uffff\1\u0144\11\uffff\1\u0145",
            "\1\u0146",
            "\1\u0147\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "\1\u0154",
            "\1\u0155",
            "",
            "",
            "\1\u0156",
            "",
            "",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c\1\uffff\1\u016d\11\uffff\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177",
            "",
            "",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\u017c\16\uffff\1\u017d",
            "\1\u017e",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0180",
            "\1\u0181",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "",
            "\1\u01c4",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "",
            "\1\u01c9",
            "",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u01f3",
            "",
            "\1\u01f4",
            "",
            "",
            "",
            "",
            "",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "",
            "\1\u01fc",
            "\1\u01fd",
            "",
            "\1\u01fe",
            "\1\u01ff\15\uffff\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "",
            "",
            "",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "",
            "",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "",
            "",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "",
            "\1\u021c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "",
            "\1\u0243",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "",
            "",
            "\1\u0248",
            "\1\u0249",
            "",
            "",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "",
            "",
            "",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "",
            "",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0265\22\uffff\1\u0264",
            "\1\u0266",
            "\1\u0267",
            "",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "",
            "\1\u0281",
            "\1\u0282",
            "",
            "\1\u0283",
            "\1\u0284",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "",
            "\1\u0295",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "",
            "\1\u02a2",
            "",
            "",
            "",
            "\1\u02a3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "",
            "\1\u02c7",
            "",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "",
            "",
            "",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "",
            "\1\u02cf",
            "\1\u02d0",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\1\u02d2",
            "",
            "",
            "\1\u02d3",
            "\12\63\7\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( Reinforncement_learning | Distributed_training | Image_classification | Scaling_efficiency | Core_subscription | Enable_autotuning | Number_of_threads | Enable_opt_build | Object_detection | Parallelisation | Number_of_acc | Recommendation | Ai_framework | Message_size | Optimization | AI_Inference | Ai_training | AI_Training | Constraint | FPGAXilinx | NVIDIAV100 | Autotuning | Parameters | Tensorflow | Translation | TensorFlow | Opt_build | Acc_type | Affinity | App_type | Basedata | Compiler | Cpu_type | Location | Prefetch | AMDM100 | AUTOTUNE | Imagenet | Intelx86 | Backend | Library | Openacc | PyTorch_1 | Version | BigData | OPENACC | PyTorch | RESTART | Config | Layers | Opencl | Openmp | CREATA | OPENCL | OPENMP | Cache | Count | Input | Keras_1 | Medium | Mvapch | Opnmpi | Simple | Tuner | CIFAR | IMAGE | Keras | MNIST | MXNet | Power | Block | Data | Glow | Large | Size | Small | Type | CNTK | Cray | Etl | Hpc | Mpi | Xla | AMD | ARM | HPC | MPI | Pgi | LeftParenthesis | RightParenthesis | Comma | FullStop | RULE_BT | RULE_LT | RULE_BET | RULE_LET | RULE_EQUAL | RULE_NOT_EQUAL | RULE_OR | RULE_AND | RULE_BOOLEAN | RULE_EXT_INT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_45 = input.LA(1);

                        s = -1;
                        if ( ((LA13_45>='\u0000' && LA13_45<='\uFFFF')) ) {s = 133;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_46 = input.LA(1);

                        s = -1;
                        if ( ((LA13_46>='\u0000' && LA13_46<='\uFFFF')) ) {s = 133;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='r') ) {s = 1;}

                        else if ( (LA13_0=='d') ) {s = 2;}

                        else if ( (LA13_0=='I') ) {s = 3;}

                        else if ( (LA13_0=='s') ) {s = 4;}

                        else if ( (LA13_0=='c') ) {s = 5;}

                        else if ( (LA13_0=='e') ) {s = 6;}

                        else if ( (LA13_0=='n') ) {s = 7;}

                        else if ( (LA13_0=='o') ) {s = 8;}

                        else if ( (LA13_0=='p') ) {s = 9;}

                        else if ( (LA13_0=='a') ) {s = 10;}

                        else if ( (LA13_0=='m') ) {s = 11;}

                        else if ( (LA13_0=='A') ) {s = 12;}

                        else if ( (LA13_0=='C') ) {s = 13;}

                        else if ( (LA13_0=='F') ) {s = 14;}

                        else if ( (LA13_0=='N') ) {s = 15;}

                        else if ( (LA13_0=='t') ) {s = 16;}

                        else if ( (LA13_0=='T') ) {s = 17;}

                        else if ( (LA13_0=='b') ) {s = 18;}

                        else if ( (LA13_0=='l') ) {s = 19;}

                        else if ( (LA13_0=='v') ) {s = 20;}

                        else if ( (LA13_0=='B') ) {s = 21;}

                        else if ( (LA13_0=='O') ) {s = 22;}

                        else if ( (LA13_0=='P') ) {s = 23;}

                        else if ( (LA13_0=='R') ) {s = 24;}

                        else if ( (LA13_0=='i') ) {s = 25;}

                        else if ( (LA13_0=='k') ) {s = 26;}

                        else if ( (LA13_0=='K') ) {s = 27;}

                        else if ( (LA13_0=='M') ) {s = 28;}

                        else if ( (LA13_0=='g') ) {s = 29;}

                        else if ( (LA13_0=='h') ) {s = 30;}

                        else if ( (LA13_0=='x') ) {s = 31;}

                        else if ( (LA13_0=='H') ) {s = 32;}

                        else if ( (LA13_0=='(') ) {s = 33;}

                        else if ( (LA13_0==')') ) {s = 34;}

                        else if ( (LA13_0==',') ) {s = 35;}

                        else if ( (LA13_0=='.') ) {s = 36;}

                        else if ( (LA13_0=='>') ) {s = 37;}

                        else if ( (LA13_0=='<') ) {s = 38;}

                        else if ( (LA13_0=='=') ) {s = 39;}

                        else if ( (LA13_0=='!') ) {s = 40;}

                        else if ( (LA13_0=='f') ) {s = 41;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 42;}

                        else if ( (LA13_0=='^') ) {s = 43;}

                        else if ( ((LA13_0>='D' && LA13_0<='E')||LA13_0=='G'||LA13_0=='J'||LA13_0=='L'||LA13_0=='Q'||LA13_0=='S'||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='j'||LA13_0=='q'||LA13_0=='u'||LA13_0=='w'||(LA13_0>='y' && LA13_0<='z')) ) {s = 44;}

                        else if ( (LA13_0=='\"') ) {s = 45;}

                        else if ( (LA13_0=='\'') ) {s = 46;}

                        else if ( (LA13_0=='/') ) {s = 47;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 48;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||LA13_0=='-'||(LA13_0>=':' && LA13_0<=';')||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 49;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}