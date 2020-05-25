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
    public static final int AUTOTUNE=40;
    public static final int Opnmpi=68;
    public static final int Ai_training=20;
    public static final int OPENACC=50;
    public static final int Layers=54;
    public static final int Basedata=35;
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
    public static final int Compiler=36;
    public static final int Typing=57;
    public static final int Openmp=56;
    public static final int Range=69;
    public static final int Constraints=21;
    public static final int Medium=66;
    public static final int Affinity=33;
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
    public static final int Acc_type=32;
    public static final int App_type=34;
    public static final int Int=89;
    public static final int CPU_type=31;
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

    // $ANTLR start "Constraints"
    public final void mConstraints() throws RecognitionException {
        try {
            int _type = Constraints;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:48:13: ( 'constraints:' )
            // InternalOptimizationLexer.g:48:15: 'constraints:'
            {
            match("constraints:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Constraints"

    // $ANTLR start "AI_Training"
    public final void mAI_Training() throws RecognitionException {
        try {
            int _type = AI_Training;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:50:13: ( 'AI_Training' )
            // InternalOptimizationLexer.g:50:15: 'AI_Training'
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

    // $ANTLR start "CPU_type"
    public final void mCPU_type() throws RecognitionException {
        try {
            int _type = CPU_type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:68:10: ( 'CPU_type:' )
            // InternalOptimizationLexer.g:68:12: 'CPU_type:'
            {
            match("CPU_type:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CPU_type"

    // $ANTLR start "Acc_type"
    public final void mAcc_type() throws RecognitionException {
        try {
            int _type = Acc_type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:70:10: ( 'acc_type:' )
            // InternalOptimizationLexer.g:70:12: 'acc_type:'
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
            // InternalOptimizationLexer.g:72:10: ( 'affinity:' )
            // InternalOptimizationLexer.g:72:12: 'affinity:'
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
            // InternalOptimizationLexer.g:74:10: ( 'app_type:' )
            // InternalOptimizationLexer.g:74:12: 'app_type:'
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
            // InternalOptimizationLexer.g:76:10: ( 'basedata:' )
            // InternalOptimizationLexer.g:76:12: 'basedata:'
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
            // InternalOptimizationLexer.g:78:10: ( 'compiler:' )
            // InternalOptimizationLexer.g:78:12: 'compiler:'
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

    // $ANTLR start "Command"
    public final void mCommand() throws RecognitionException {
        try {
            int _type = Command;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:94:9: ( 'command:' )
            // InternalOptimizationLexer.g:94:11: 'command:'
            {
            match("command:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Command"

    // $ANTLR start "Library"
    public final void mLibrary() throws RecognitionException {
        try {
            int _type = Library;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:96:9: ( 'library:' )
            // InternalOptimizationLexer.g:96:11: 'library:'
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
            // InternalOptimizationLexer.g:98:9: ( 'openacc:' )
            // InternalOptimizationLexer.g:98:11: 'openacc:'
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
            // InternalOptimizationLexer.g:100:11: ( 'pyTorch:' )
            // InternalOptimizationLexer.g:100:13: 'pyTorch:'
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
            // InternalOptimizationLexer.g:102:9: ( 'version:' )
            // InternalOptimizationLexer.g:102:11: 'version:'
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
            // InternalOptimizationLexer.g:104:9: ( 'BigData' )
            // InternalOptimizationLexer.g:104:11: 'BigData'
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
            // InternalOptimizationLexer.g:106:9: ( 'OPENACC' )
            // InternalOptimizationLexer.g:106:11: 'OPENACC'
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
            // InternalOptimizationLexer.g:108:9: ( 'PyTorch' )
            // InternalOptimizationLexer.g:108:11: 'PyTorch'
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
            // InternalOptimizationLexer.g:110:9: ( 'RESTART' )
            // InternalOptimizationLexer.g:110:11: 'RESTART'
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
            // InternalOptimizationLexer.g:112:8: ( 'config:' )
            // InternalOptimizationLexer.g:112:10: 'config:'
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
            // InternalOptimizationLexer.g:114:8: ( 'layers:' )
            // InternalOptimizationLexer.g:114:10: 'layers:'
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
            // InternalOptimizationLexer.g:116:8: ( 'opencl:' )
            // InternalOptimizationLexer.g:116:10: 'opencl:'
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
            // InternalOptimizationLexer.g:118:8: ( 'openmp:' )
            // InternalOptimizationLexer.g:118:10: 'openmp:'
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

    // $ANTLR start "Typing"
    public final void mTyping() throws RecognitionException {
        try {
            int _type = Typing;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:120:8: ( 'typing:' )
            // InternalOptimizationLexer.g:120:10: 'typing:'
            {
            match("typing:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Typing"

    // $ANTLR start "CREATA"
    public final void mCREATA() throws RecognitionException {
        try {
            int _type = CREATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:122:8: ( 'CREATA' )
            // InternalOptimizationLexer.g:122:10: 'CREATA'
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
            // InternalOptimizationLexer.g:124:8: ( 'OPENCL' )
            // InternalOptimizationLexer.g:124:10: 'OPENCL'
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
            // InternalOptimizationLexer.g:126:8: ( 'OPENMP' )
            // InternalOptimizationLexer.g:126:10: 'OPENMP'
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

    // $ANTLR start "Build"
    public final void mBuild() throws RecognitionException {
        try {
            int _type = Build;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:128:7: ( 'build:' )
            // InternalOptimizationLexer.g:128:9: 'build:'
            {
            match("build:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Build"

    // $ANTLR start "Cache"
    public final void mCache() throws RecognitionException {
        try {
            int _type = Cache;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:130:7: ( 'cache:' )
            // InternalOptimizationLexer.g:130:9: 'cache:'
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
            // InternalOptimizationLexer.g:132:7: ( 'count:' )
            // InternalOptimizationLexer.g:132:9: 'count:'
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
            // InternalOptimizationLexer.g:134:7: ( 'input:' )
            // InternalOptimizationLexer.g:134:9: 'input:'
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
            // InternalOptimizationLexer.g:136:9: ( 'keras:' )
            // InternalOptimizationLexer.g:136:11: 'keras:'
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
            // InternalOptimizationLexer.g:138:8: ( 'medium' )
            // InternalOptimizationLexer.g:138:10: 'medium'
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
            // InternalOptimizationLexer.g:140:8: ( 'mvapch' )
            // InternalOptimizationLexer.g:140:10: 'mvapch'
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
            // InternalOptimizationLexer.g:142:8: ( 'opnmpi' )
            // InternalOptimizationLexer.g:142:10: 'opnmpi'
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

    // $ANTLR start "Range"
    public final void mRange() throws RecognitionException {
        try {
            int _type = Range;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:144:7: ( 'range:' )
            // InternalOptimizationLexer.g:144:9: 'range:'
            {
            match("range:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Range"

    // $ANTLR start "Simple"
    public final void mSimple() throws RecognitionException {
        try {
            int _type = Simple;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:146:8: ( 'simple' )
            // InternalOptimizationLexer.g:146:10: 'simple'
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
            // InternalOptimizationLexer.g:148:7: ( 'tuner:' )
            // InternalOptimizationLexer.g:148:9: 'tuner:'
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
            // InternalOptimizationLexer.g:150:7: ( 'CIFAR' )
            // InternalOptimizationLexer.g:150:9: 'CIFAR'
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
            // InternalOptimizationLexer.g:152:7: ( 'IMAGE' )
            // InternalOptimizationLexer.g:152:9: 'IMAGE'
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
            // InternalOptimizationLexer.g:154:7: ( 'Keras' )
            // InternalOptimizationLexer.g:154:9: 'Keras'
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
            // InternalOptimizationLexer.g:156:7: ( 'MNIST' )
            // InternalOptimizationLexer.g:156:9: 'MNIST'
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
            // InternalOptimizationLexer.g:158:7: ( 'MXNet' )
            // InternalOptimizationLexer.g:158:9: 'MXNet'
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
            // InternalOptimizationLexer.g:160:7: ( 'Power' )
            // InternalOptimizationLexer.g:160:9: 'Power'
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
            // InternalOptimizationLexer.g:162:7: ( 'block' )
            // InternalOptimizationLexer.g:162:9: 'block'
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
            // InternalOptimizationLexer.g:164:6: ( 'data:' )
            // InternalOptimizationLexer.g:164:8: 'data:'
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
            // InternalOptimizationLexer.g:166:6: ( 'glow:' )
            // InternalOptimizationLexer.g:166:8: 'glow:'
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
            // InternalOptimizationLexer.g:168:7: ( 'large' )
            // InternalOptimizationLexer.g:168:9: 'large'
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
            // InternalOptimizationLexer.g:170:6: ( 'size:' )
            // InternalOptimizationLexer.g:170:8: 'size:'
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
            // InternalOptimizationLexer.g:172:7: ( 'small' )
            // InternalOptimizationLexer.g:172:9: 'small'
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
            // InternalOptimizationLexer.g:174:6: ( 'type:' )
            // InternalOptimizationLexer.g:174:8: 'type:'
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
            // InternalOptimizationLexer.g:176:6: ( 'CNTK' )
            // InternalOptimizationLexer.g:176:8: 'CNTK'
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
            // InternalOptimizationLexer.g:178:6: ( 'cray' )
            // InternalOptimizationLexer.g:178:8: 'cray'
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
            // InternalOptimizationLexer.g:180:5: ( 'etl:' )
            // InternalOptimizationLexer.g:180:7: 'etl:'
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
            // InternalOptimizationLexer.g:182:5: ( 'hpc:' )
            // InternalOptimizationLexer.g:182:7: 'hpc:'
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

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            int _type = Int;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:184:5: ( 'int:' )
            // InternalOptimizationLexer.g:184:7: 'int:'
            {
            match("int:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Mpi"
    public final void mMpi() throws RecognitionException {
        try {
            int _type = Mpi;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:186:5: ( 'mpi:' )
            // InternalOptimizationLexer.g:186:7: 'mpi:'
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

    // $ANTLR start "Run"
    public final void mRun() throws RecognitionException {
        try {
            int _type = Run;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:188:5: ( 'run:' )
            // InternalOptimizationLexer.g:188:7: 'run:'
            {
            match("run:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Run"

    // $ANTLR start "Xla"
    public final void mXla() throws RecognitionException {
        try {
            int _type = Xla;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:190:5: ( 'xla:' )
            // InternalOptimizationLexer.g:190:7: 'xla:'
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
            // InternalOptimizationLexer.g:192:5: ( 'AMD' )
            // InternalOptimizationLexer.g:192:7: 'AMD'
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
            // InternalOptimizationLexer.g:194:5: ( 'ARM' )
            // InternalOptimizationLexer.g:194:7: 'ARM'
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
            // InternalOptimizationLexer.g:196:5: ( 'HPC' )
            // InternalOptimizationLexer.g:196:7: 'HPC'
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
            // InternalOptimizationLexer.g:198:5: ( 'MPI' )
            // InternalOptimizationLexer.g:198:7: 'MPI'
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
            // InternalOptimizationLexer.g:200:5: ( 'pgi' )
            // InternalOptimizationLexer.g:200:7: 'pgi'
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

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:202:10: ( '.' )
            // InternalOptimizationLexer.g:202:12: '.'
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

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalOptimizationLexer.g:204:21: ()
            // InternalOptimizationLexer.g:204:23: 
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
            // InternalOptimizationLexer.g:206:19: ()
            // InternalOptimizationLexer.g:206:21: 
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
            // InternalOptimizationLexer.g:208:14: ( ( 'true' | 'false' ) )
            // InternalOptimizationLexer.g:208:16: ( 'true' | 'false' )
            {
            // InternalOptimizationLexer.g:208:16: ( 'true' | 'false' )
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
                    // InternalOptimizationLexer.g:208:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalOptimizationLexer.g:208:24: 'false'
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
            // InternalOptimizationLexer.g:210:14: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )
            // InternalOptimizationLexer.g:210:16: RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT
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
            // InternalOptimizationLexer.g:212:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOptimizationLexer.g:212:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOptimizationLexer.g:212:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOptimizationLexer.g:212:11: '^'
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

            // InternalOptimizationLexer.g:212:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalOptimizationLexer.g:214:10: ( ( '0' .. '9' )+ )
            // InternalOptimizationLexer.g:214:12: ( '0' .. '9' )+
            {
            // InternalOptimizationLexer.g:214:12: ( '0' .. '9' )+
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
            	    // InternalOptimizationLexer.g:214:13: '0' .. '9'
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
            // InternalOptimizationLexer.g:216:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOptimizationLexer.g:216:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOptimizationLexer.g:216:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalOptimizationLexer.g:216:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOptimizationLexer.g:216:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalOptimizationLexer.g:216:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOptimizationLexer.g:216:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalOptimizationLexer.g:216:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOptimizationLexer.g:216:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalOptimizationLexer.g:216:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOptimizationLexer.g:216:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalOptimizationLexer.g:218:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOptimizationLexer.g:218:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOptimizationLexer.g:218:24: ( options {greedy=false; } : . )*
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
            	    // InternalOptimizationLexer.g:218:52: .
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
            // InternalOptimizationLexer.g:220:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOptimizationLexer.g:220:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOptimizationLexer.g:220:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOptimizationLexer.g:220:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalOptimizationLexer.g:220:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOptimizationLexer.g:220:41: ( '\\r' )? '\\n'
                    {
                    // InternalOptimizationLexer.g:220:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalOptimizationLexer.g:220:41: '\\r'
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
            // InternalOptimizationLexer.g:222:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOptimizationLexer.g:222:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOptimizationLexer.g:222:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalOptimizationLexer.g:224:16: ( . )
            // InternalOptimizationLexer.g:224:18: .
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
        // InternalOptimizationLexer.g:1:8: ( Reinforncement_learning | Distributed_training | Image_classification | Scaling_efficiency | Core_subscription | Enable_autotuning | Number_of_threads | Enable_opt_build | Object_detection | Parallelisation | Number_of_acc | Recommendation | Ai_framework | Message_size | Optimization | AI_Inference | Ai_training | Constraints | AI_Training | FPGAXilinx | NVIDIAV100 | Autotuning | Parameters | Tensorflow | Translation | TensorFlow | Opt_build | CPU_type | Acc_type | Affinity | App_type | Basedata | Compiler | Location | Prefetch | AMDM100 | AUTOTUNE | Imagenet | Intelx86 | Backend | Command | Library | Openacc | PyTorch_1 | Version | BigData | OPENACC | PyTorch | RESTART | Config | Layers | Opencl | Openmp | Typing | CREATA | OPENCL | OPENMP | Build | Cache | Count | Input | Keras_1 | Medium | Mvapch | Opnmpi | Range | Simple | Tuner | CIFAR | IMAGE | Keras | MNIST | MXNet | Power | Block | Data | Glow | Large | Size | Small | Type | CNTK | Cray | Etl | Hpc | Int | Mpi | Run | Xla | AMD | ARM | HPC | MPI | Pgi | FullStop | RULE_BOOLEAN | RULE_EXT_INT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=104;
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
                // InternalOptimizationLexer.g:1:292: Constraints
                {
                mConstraints(); 

                }
                break;
            case 19 :
                // InternalOptimizationLexer.g:1:304: AI_Training
                {
                mAI_Training(); 

                }
                break;
            case 20 :
                // InternalOptimizationLexer.g:1:316: FPGAXilinx
                {
                mFPGAXilinx(); 

                }
                break;
            case 21 :
                // InternalOptimizationLexer.g:1:327: NVIDIAV100
                {
                mNVIDIAV100(); 

                }
                break;
            case 22 :
                // InternalOptimizationLexer.g:1:338: Autotuning
                {
                mAutotuning(); 

                }
                break;
            case 23 :
                // InternalOptimizationLexer.g:1:349: Parameters
                {
                mParameters(); 

                }
                break;
            case 24 :
                // InternalOptimizationLexer.g:1:360: Tensorflow
                {
                mTensorflow(); 

                }
                break;
            case 25 :
                // InternalOptimizationLexer.g:1:371: Translation
                {
                mTranslation(); 

                }
                break;
            case 26 :
                // InternalOptimizationLexer.g:1:383: TensorFlow
                {
                mTensorFlow(); 

                }
                break;
            case 27 :
                // InternalOptimizationLexer.g:1:394: Opt_build
                {
                mOpt_build(); 

                }
                break;
            case 28 :
                // InternalOptimizationLexer.g:1:404: CPU_type
                {
                mCPU_type(); 

                }
                break;
            case 29 :
                // InternalOptimizationLexer.g:1:413: Acc_type
                {
                mAcc_type(); 

                }
                break;
            case 30 :
                // InternalOptimizationLexer.g:1:422: Affinity
                {
                mAffinity(); 

                }
                break;
            case 31 :
                // InternalOptimizationLexer.g:1:431: App_type
                {
                mApp_type(); 

                }
                break;
            case 32 :
                // InternalOptimizationLexer.g:1:440: Basedata
                {
                mBasedata(); 

                }
                break;
            case 33 :
                // InternalOptimizationLexer.g:1:449: Compiler
                {
                mCompiler(); 

                }
                break;
            case 34 :
                // InternalOptimizationLexer.g:1:458: Location
                {
                mLocation(); 

                }
                break;
            case 35 :
                // InternalOptimizationLexer.g:1:467: Prefetch
                {
                mPrefetch(); 

                }
                break;
            case 36 :
                // InternalOptimizationLexer.g:1:476: AMDM100
                {
                mAMDM100(); 

                }
                break;
            case 37 :
                // InternalOptimizationLexer.g:1:484: AUTOTUNE
                {
                mAUTOTUNE(); 

                }
                break;
            case 38 :
                // InternalOptimizationLexer.g:1:493: Imagenet
                {
                mImagenet(); 

                }
                break;
            case 39 :
                // InternalOptimizationLexer.g:1:502: Intelx86
                {
                mIntelx86(); 

                }
                break;
            case 40 :
                // InternalOptimizationLexer.g:1:511: Backend
                {
                mBackend(); 

                }
                break;
            case 41 :
                // InternalOptimizationLexer.g:1:519: Command
                {
                mCommand(); 

                }
                break;
            case 42 :
                // InternalOptimizationLexer.g:1:527: Library
                {
                mLibrary(); 

                }
                break;
            case 43 :
                // InternalOptimizationLexer.g:1:535: Openacc
                {
                mOpenacc(); 

                }
                break;
            case 44 :
                // InternalOptimizationLexer.g:1:543: PyTorch_1
                {
                mPyTorch_1(); 

                }
                break;
            case 45 :
                // InternalOptimizationLexer.g:1:553: Version
                {
                mVersion(); 

                }
                break;
            case 46 :
                // InternalOptimizationLexer.g:1:561: BigData
                {
                mBigData(); 

                }
                break;
            case 47 :
                // InternalOptimizationLexer.g:1:569: OPENACC
                {
                mOPENACC(); 

                }
                break;
            case 48 :
                // InternalOptimizationLexer.g:1:577: PyTorch
                {
                mPyTorch(); 

                }
                break;
            case 49 :
                // InternalOptimizationLexer.g:1:585: RESTART
                {
                mRESTART(); 

                }
                break;
            case 50 :
                // InternalOptimizationLexer.g:1:593: Config
                {
                mConfig(); 

                }
                break;
            case 51 :
                // InternalOptimizationLexer.g:1:600: Layers
                {
                mLayers(); 

                }
                break;
            case 52 :
                // InternalOptimizationLexer.g:1:607: Opencl
                {
                mOpencl(); 

                }
                break;
            case 53 :
                // InternalOptimizationLexer.g:1:614: Openmp
                {
                mOpenmp(); 

                }
                break;
            case 54 :
                // InternalOptimizationLexer.g:1:621: Typing
                {
                mTyping(); 

                }
                break;
            case 55 :
                // InternalOptimizationLexer.g:1:628: CREATA
                {
                mCREATA(); 

                }
                break;
            case 56 :
                // InternalOptimizationLexer.g:1:635: OPENCL
                {
                mOPENCL(); 

                }
                break;
            case 57 :
                // InternalOptimizationLexer.g:1:642: OPENMP
                {
                mOPENMP(); 

                }
                break;
            case 58 :
                // InternalOptimizationLexer.g:1:649: Build
                {
                mBuild(); 

                }
                break;
            case 59 :
                // InternalOptimizationLexer.g:1:655: Cache
                {
                mCache(); 

                }
                break;
            case 60 :
                // InternalOptimizationLexer.g:1:661: Count
                {
                mCount(); 

                }
                break;
            case 61 :
                // InternalOptimizationLexer.g:1:667: Input
                {
                mInput(); 

                }
                break;
            case 62 :
                // InternalOptimizationLexer.g:1:673: Keras_1
                {
                mKeras_1(); 

                }
                break;
            case 63 :
                // InternalOptimizationLexer.g:1:681: Medium
                {
                mMedium(); 

                }
                break;
            case 64 :
                // InternalOptimizationLexer.g:1:688: Mvapch
                {
                mMvapch(); 

                }
                break;
            case 65 :
                // InternalOptimizationLexer.g:1:695: Opnmpi
                {
                mOpnmpi(); 

                }
                break;
            case 66 :
                // InternalOptimizationLexer.g:1:702: Range
                {
                mRange(); 

                }
                break;
            case 67 :
                // InternalOptimizationLexer.g:1:708: Simple
                {
                mSimple(); 

                }
                break;
            case 68 :
                // InternalOptimizationLexer.g:1:715: Tuner
                {
                mTuner(); 

                }
                break;
            case 69 :
                // InternalOptimizationLexer.g:1:721: CIFAR
                {
                mCIFAR(); 

                }
                break;
            case 70 :
                // InternalOptimizationLexer.g:1:727: IMAGE
                {
                mIMAGE(); 

                }
                break;
            case 71 :
                // InternalOptimizationLexer.g:1:733: Keras
                {
                mKeras(); 

                }
                break;
            case 72 :
                // InternalOptimizationLexer.g:1:739: MNIST
                {
                mMNIST(); 

                }
                break;
            case 73 :
                // InternalOptimizationLexer.g:1:745: MXNet
                {
                mMXNet(); 

                }
                break;
            case 74 :
                // InternalOptimizationLexer.g:1:751: Power
                {
                mPower(); 

                }
                break;
            case 75 :
                // InternalOptimizationLexer.g:1:757: Block
                {
                mBlock(); 

                }
                break;
            case 76 :
                // InternalOptimizationLexer.g:1:763: Data
                {
                mData(); 

                }
                break;
            case 77 :
                // InternalOptimizationLexer.g:1:768: Glow
                {
                mGlow(); 

                }
                break;
            case 78 :
                // InternalOptimizationLexer.g:1:773: Large
                {
                mLarge(); 

                }
                break;
            case 79 :
                // InternalOptimizationLexer.g:1:779: Size
                {
                mSize(); 

                }
                break;
            case 80 :
                // InternalOptimizationLexer.g:1:784: Small
                {
                mSmall(); 

                }
                break;
            case 81 :
                // InternalOptimizationLexer.g:1:790: Type
                {
                mType(); 

                }
                break;
            case 82 :
                // InternalOptimizationLexer.g:1:795: CNTK
                {
                mCNTK(); 

                }
                break;
            case 83 :
                // InternalOptimizationLexer.g:1:800: Cray
                {
                mCray(); 

                }
                break;
            case 84 :
                // InternalOptimizationLexer.g:1:805: Etl
                {
                mEtl(); 

                }
                break;
            case 85 :
                // InternalOptimizationLexer.g:1:809: Hpc
                {
                mHpc(); 

                }
                break;
            case 86 :
                // InternalOptimizationLexer.g:1:813: Int
                {
                mInt(); 

                }
                break;
            case 87 :
                // InternalOptimizationLexer.g:1:817: Mpi
                {
                mMpi(); 

                }
                break;
            case 88 :
                // InternalOptimizationLexer.g:1:821: Run
                {
                mRun(); 

                }
                break;
            case 89 :
                // InternalOptimizationLexer.g:1:825: Xla
                {
                mXla(); 

                }
                break;
            case 90 :
                // InternalOptimizationLexer.g:1:829: AMD
                {
                mAMD(); 

                }
                break;
            case 91 :
                // InternalOptimizationLexer.g:1:833: ARM
                {
                mARM(); 

                }
                break;
            case 92 :
                // InternalOptimizationLexer.g:1:837: HPC
                {
                mHPC(); 

                }
                break;
            case 93 :
                // InternalOptimizationLexer.g:1:841: MPI
                {
                mMPI(); 

                }
                break;
            case 94 :
                // InternalOptimizationLexer.g:1:845: Pgi
                {
                mPgi(); 

                }
                break;
            case 95 :
                // InternalOptimizationLexer.g:1:849: FullStop
                {
                mFullStop(); 

                }
                break;
            case 96 :
                // InternalOptimizationLexer.g:1:858: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 97 :
                // InternalOptimizationLexer.g:1:871: RULE_EXT_INT
                {
                mRULE_EXT_INT(); 

                }
                break;
            case 98 :
                // InternalOptimizationLexer.g:1:884: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 99 :
                // InternalOptimizationLexer.g:1:892: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 100 :
                // InternalOptimizationLexer.g:1:901: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 101 :
                // InternalOptimizationLexer.g:1:913: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 102 :
                // InternalOptimizationLexer.g:1:929: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 103 :
                // InternalOptimizationLexer.g:1:945: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 104 :
                // InternalOptimizationLexer.g:1:953: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\40\56\1\uffff\1\56\1\162\1\52\1\uffff\3\52\2\uffff\3\56\1\uffff\101\56\1\uffff\1\56\1\uffff\1\162\5\uffff\35\56\1\u00ea\12\56\1\u00f8\1\56\1\u00fa\40\56\1\u011c\3\56\1\u0120\4\56\1\uffff\20\56\1\u0135\1\56\1\uffff\11\56\1\uffff\11\56\1\uffff\2\56\2\uffff\1\56\1\uffff\4\56\1\u0153\7\56\1\u015b\17\56\1\uffff\4\56\1\uffff\1\56\3\uffff\5\56\1\uffff\2\56\1\u017a\2\56\1\uffff\1\u017d\7\56\1\uffff\31\56\1\uffff\3\56\1\uffff\1\56\1\uffff\4\56\1\u01a6\1\uffff\3\56\1\u01aa\3\56\1\u01ae\6\56\1\u01b5\3\56\1\u01b9\1\u01ba\1\u01bb\1\uffff\1\u0153\2\56\1\uffff\4\56\1\uffff\1\56\1\u01c3\1\uffff\5\56\2\uffff\10\56\1\u01d1\13\56\1\u01dd\1\u01de\7\56\1\uffff\2\56\1\u01e8\1\uffff\2\56\2\uffff\3\56\1\uffff\3\56\1\u01f1\1\u01f2\1\56\1\uffff\1\56\5\uffff\7\56\1\uffff\2\56\1\uffff\10\56\3\uffff\13\56\2\uffff\3\56\1\uffff\2\56\1\uffff\2\56\1\uffff\4\56\1\uffff\1\56\1\u021e\1\u021f\2\uffff\1\u0220\1\u0221\4\56\1\u0226\1\u0227\4\56\1\uffff\6\56\1\uffff\3\56\1\uffff\11\56\1\u023e\5\56\1\uffff\1\56\6\uffff\4\56\2\uffff\3\56\1\uffff\10\56\1\uffff\3\56\3\uffff\3\56\1\uffff\3\56\3\uffff\14\56\1\uffff\12\56\1\u0274\16\56\1\uffff\2\56\1\uffff\2\56\1\u0287\1\uffff\1\u0288\1\uffff\6\56\1\uffff\10\56\1\uffff\1\56\1\u0298\2\uffff\13\56\1\uffff\1\56\3\uffff\1\56\1\u02a6\7\56\1\uffff\3\56\1\uffff\21\56\1\u02c2\1\uffff\6\56\1\uffff\1\56\1\uffff\4\56\3\uffff\3\56\1\uffff\2\56\1\u02d3\1\56\2\uffff\1\56\1\u02d6\1\uffff";
    static final String DFA13_eofS =
        "\u02d7\uffff";
    static final String DFA13_minS =
        "\1\0\2\141\1\115\1\143\1\141\1\156\1\165\1\142\1\141\1\143\1\145\1\111\1\120\1\126\2\145\1\111\2\141\1\145\1\151\1\120\1\157\1\105\1\156\2\145\1\116\1\154\1\160\1\154\1\120\1\uffff\1\141\1\60\1\101\1\uffff\2\0\1\52\2\uffff\1\143\2\156\1\uffff\1\163\1\164\1\141\1\164\1\101\1\141\1\155\1\141\1\155\1\143\2\141\1\154\1\155\1\152\1\145\1\162\1\145\1\124\1\151\1\137\1\164\1\143\1\146\1\160\1\144\1\141\1\151\1\137\1\104\1\124\1\115\1\107\1\111\1\156\1\141\1\160\2\156\1\125\1\105\1\106\1\124\1\143\1\151\1\157\1\143\1\142\2\162\1\147\1\105\1\124\1\167\1\123\1\160\2\162\1\111\1\116\1\111\1\157\1\143\1\141\1\103\1\uffff\1\154\1\uffff\1\60\5\uffff\1\156\1\157\1\147\1\72\1\164\1\141\1\147\1\145\1\107\1\154\1\160\1\145\1\154\1\145\1\146\1\155\1\156\1\150\1\171\1\142\1\72\1\142\1\145\1\137\1\156\1\155\1\141\1\146\1\157\1\60\1\146\1\157\1\137\1\151\1\137\1\163\1\151\1\160\1\72\1\111\1\55\1\117\1\60\1\101\1\104\1\163\1\156\3\145\1\163\1\137\2\101\1\113\1\145\1\153\1\154\1\143\1\141\1\162\1\145\1\147\1\163\1\104\1\116\1\157\1\145\1\124\1\165\1\72\2\141\1\123\1\145\1\60\1\167\2\72\1\60\1\163\1\146\1\155\1\145\1\uffff\1\162\1\72\1\145\1\154\1\105\1\151\1\154\1\72\1\154\1\137\1\164\2\151\1\141\1\164\1\145\1\60\1\154\1\uffff\1\145\1\143\1\155\1\142\1\141\1\160\1\154\1\145\1\162\1\uffff\2\162\2\164\1\156\1\164\1\141\1\165\1\143\1\uffff\1\156\1\162\2\uffff\1\124\1\uffff\1\55\1\111\1\157\1\163\1\60\1\156\1\72\1\162\1\157\1\164\1\124\1\122\1\60\1\144\1\145\1\144\1\153\1\164\1\141\1\162\1\145\1\151\1\141\1\101\2\162\1\101\1\164\1\uffff\2\163\1\124\1\164\1\uffff\1\72\3\uffff\1\145\1\157\1\155\1\72\1\151\1\uffff\1\137\1\170\1\60\1\156\1\145\1\uffff\1\60\1\163\1\162\1\147\1\154\1\156\2\72\1\uffff\1\145\1\162\1\164\1\151\1\165\1\143\1\154\1\160\1\151\1\154\1\145\1\164\1\143\2\141\1\165\1\171\1\151\1\171\1\147\1\155\1\150\1\146\1\141\1\125\1\uffff\1\101\1\162\1\154\1\uffff\1\147\1\uffff\1\72\1\162\1\171\1\101\1\60\1\uffff\1\141\1\156\1\72\1\60\1\151\1\162\1\163\1\60\1\157\1\164\1\103\1\114\1\120\1\143\1\60\1\122\2\72\3\60\1\uffff\1\60\1\162\1\145\1\uffff\1\142\1\143\1\145\1\70\1\uffff\1\147\1\60\1\uffff\1\165\1\141\1\72\1\145\1\144\2\uffff\3\137\1\172\1\151\1\143\2\72\1\60\1\145\1\164\1\143\1\150\1\155\1\151\1\156\1\160\1\164\1\160\1\145\2\60\1\145\1\151\1\116\1\55\1\146\1\141\1\72\1\uffff\1\106\1\160\1\60\1\uffff\1\164\1\144\2\uffff\1\157\1\171\1\72\1\uffff\1\156\1\141\1\103\2\60\1\150\1\uffff\1\124\5\uffff\2\156\1\165\1\154\1\164\1\66\1\137\1\uffff\1\142\1\151\1\uffff\1\162\1\72\1\141\1\157\1\144\1\141\1\154\1\72\3\uffff\1\154\1\145\1\150\1\72\1\145\1\156\1\151\1\145\1\171\1\145\1\137\2\uffff\1\162\1\156\1\105\1\uffff\1\154\1\164\1\uffff\1\154\1\145\1\uffff\1\141\1\72\1\156\1\72\1\uffff\1\72\2\60\2\uffff\2\60\1\143\1\144\1\164\1\141\2\60\1\145\1\163\1\156\1\72\1\uffff\1\165\1\160\1\146\1\145\1\164\1\144\1\uffff\1\151\1\162\1\72\1\uffff\1\167\1\151\1\156\3\72\1\163\1\145\1\151\1\60\1\157\1\151\1\157\2\72\1\uffff\1\72\6\uffff\1\145\1\141\1\145\1\163\2\uffff\1\146\1\143\1\164\1\uffff\2\164\1\137\1\164\1\151\1\72\2\163\1\uffff\1\157\1\156\1\147\3\uffff\1\151\2\156\1\uffff\1\167\1\157\1\167\3\uffff\1\155\1\164\1\144\1\163\1\146\1\162\1\163\1\157\1\137\1\141\1\145\1\157\1\uffff\1\141\1\72\1\162\1\147\1\72\1\172\1\143\1\147\1\72\1\156\1\60\1\145\1\151\1\137\3\151\1\72\1\164\1\142\1\150\2\143\1\156\1\164\1\uffff\1\153\1\72\1\uffff\2\145\1\60\1\uffff\1\60\1\uffff\1\156\1\157\1\164\1\146\1\143\1\160\1\uffff\2\165\1\162\1\143\1\164\1\72\1\151\1\72\1\uffff\1\72\1\60\2\uffff\1\164\1\156\1\162\2\151\1\164\1\156\1\151\1\145\1\72\1\151\1\uffff\1\157\3\uffff\1\137\1\60\1\141\1\143\1\145\2\151\1\154\1\141\1\uffff\1\157\1\156\1\154\1\uffff\1\151\1\141\1\156\1\157\1\156\2\144\1\156\1\72\1\145\1\156\1\164\1\143\1\156\1\147\1\72\1\163\1\60\1\uffff\1\141\2\151\1\171\2\72\1\uffff\1\72\1\uffff\1\162\1\156\1\157\1\72\3\uffff\1\156\1\147\1\156\1\uffff\1\151\1\72\1\60\1\156\2\uffff\1\147\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\165\1\151\1\156\1\155\1\162\1\164\1\165\1\160\1\171\1\165\1\166\1\125\1\120\1\126\1\171\1\145\1\122\1\165\1\157\1\145\1\151\1\120\1\171\1\105\1\156\2\145\1\130\1\154\1\160\1\154\1\120\1\uffff\1\141\1\145\1\172\1\uffff\2\uffff\1\57\2\uffff\1\151\2\156\1\uffff\1\163\1\164\1\141\1\164\1\101\1\141\1\172\1\141\1\165\1\143\2\141\1\154\1\155\1\152\1\164\1\162\1\145\1\124\1\151\1\137\1\164\1\143\1\146\1\160\1\163\1\141\1\151\1\137\1\104\1\124\1\115\1\107\1\111\1\156\1\165\1\160\2\156\1\125\1\105\1\106\1\124\1\163\1\151\1\157\1\143\1\142\1\171\1\162\1\147\1\105\1\124\1\167\1\123\1\164\2\162\1\111\1\116\1\111\1\157\1\143\1\141\1\103\1\uffff\1\154\1\uffff\1\145\5\uffff\1\156\1\157\1\147\1\72\1\164\1\141\1\147\1\145\1\107\1\154\1\160\1\145\1\154\1\145\1\163\1\160\1\156\1\150\1\171\1\142\1\72\1\142\1\145\1\151\1\156\1\155\1\141\1\146\1\157\1\172\1\164\1\157\1\137\1\151\1\137\1\163\1\151\1\160\1\72\1\124\1\172\1\117\1\172\1\101\1\104\1\163\1\156\1\145\1\151\1\145\1\163\1\137\2\101\1\113\1\145\1\153\1\154\1\143\1\141\1\162\1\145\1\147\1\163\1\104\1\116\1\157\1\145\1\124\1\165\1\72\2\141\1\123\1\145\1\172\1\167\2\72\1\172\1\163\1\146\1\155\1\145\1\uffff\1\162\1\72\1\145\1\154\1\105\1\151\1\154\1\72\1\154\1\137\1\164\2\151\1\141\1\164\1\145\1\172\1\154\1\uffff\1\145\1\143\1\155\1\142\1\155\1\160\1\155\1\145\1\162\1\uffff\2\162\2\164\1\156\1\164\1\141\1\165\1\143\1\uffff\1\156\1\162\2\uffff\1\124\1\uffff\1\55\1\111\1\157\1\163\1\172\1\156\1\72\1\162\1\157\1\164\1\124\1\122\1\172\1\144\1\145\1\144\1\153\1\164\1\141\1\162\1\145\1\151\1\141\1\115\2\162\1\101\1\164\1\uffff\2\163\1\124\1\164\1\uffff\1\72\3\uffff\1\145\1\157\1\155\1\72\1\151\1\uffff\1\156\1\170\1\172\1\156\1\145\1\uffff\1\172\1\163\1\162\1\147\1\154\1\156\2\72\1\uffff\1\145\1\162\1\164\1\151\1\165\1\143\1\154\1\160\1\151\1\154\1\145\1\164\1\143\2\141\1\165\1\171\1\151\1\171\1\147\1\155\1\150\1\146\1\141\1\125\1\uffff\1\101\1\162\1\154\1\uffff\1\147\1\uffff\1\72\1\162\1\171\1\101\1\172\1\uffff\1\141\1\156\1\72\1\172\1\151\1\162\1\163\1\172\1\157\1\164\1\103\1\114\1\120\1\143\1\172\1\122\2\72\3\172\1\uffff\1\172\1\162\1\145\1\uffff\1\142\1\143\1\145\1\70\1\uffff\1\147\1\172\1\uffff\1\165\1\141\1\72\1\145\1\144\2\uffff\3\137\1\172\1\151\1\143\2\72\1\172\1\145\1\164\1\143\1\150\1\155\1\151\1\156\1\160\1\164\1\160\1\145\2\172\1\145\1\151\1\116\1\55\1\146\1\141\1\72\1\uffff\1\106\1\160\1\172\1\uffff\1\164\1\144\2\uffff\1\157\1\171\1\72\1\uffff\1\156\1\141\1\103\2\172\1\150\1\uffff\1\124\5\uffff\2\156\1\165\1\154\1\164\1\66\1\137\1\uffff\1\142\1\151\1\uffff\1\162\1\72\2\157\1\144\1\141\1\154\1\72\3\uffff\1\154\1\145\1\150\1\72\1\145\1\156\1\151\1\145\1\171\1\145\1\137\2\uffff\1\162\1\156\1\105\1\uffff\1\154\1\164\1\uffff\1\154\1\145\1\uffff\1\141\1\72\1\156\1\72\1\uffff\1\72\2\172\2\uffff\2\172\1\143\1\144\1\164\1\141\2\172\1\145\1\163\1\156\1\72\1\uffff\1\165\1\160\1\146\1\145\1\164\1\144\1\uffff\1\151\1\162\1\72\1\uffff\1\167\1\151\1\156\3\72\1\163\1\145\1\151\1\172\1\157\1\151\1\157\2\72\1\uffff\1\72\6\uffff\1\145\1\141\1\145\1\163\2\uffff\1\146\1\143\1\164\1\uffff\2\164\1\137\1\164\1\151\1\72\2\163\1\uffff\1\157\1\156\1\147\3\uffff\1\151\2\156\1\uffff\1\167\1\157\1\167\3\uffff\1\155\1\164\1\144\1\163\1\146\1\162\1\163\1\157\1\137\1\164\1\145\1\157\1\uffff\1\141\1\72\1\162\1\147\1\72\1\172\1\143\1\147\1\72\1\156\1\172\1\145\1\151\1\137\3\151\1\72\1\164\1\142\1\150\2\143\1\156\1\164\1\uffff\1\153\1\72\1\uffff\2\145\1\172\1\uffff\1\172\1\uffff\1\156\1\157\1\164\1\146\1\143\1\160\1\uffff\2\165\1\162\1\143\1\164\1\72\1\151\1\72\1\uffff\1\72\1\172\2\uffff\1\164\1\156\1\162\2\151\1\164\1\156\1\151\1\145\1\72\1\151\1\uffff\1\157\3\uffff\1\137\1\172\1\141\1\143\1\145\2\151\1\154\1\141\1\uffff\1\157\1\156\1\154\1\uffff\1\151\1\141\1\156\1\157\1\156\2\144\1\156\1\72\1\145\1\156\1\164\1\143\1\156\1\147\1\72\1\163\1\172\1\uffff\1\141\2\151\1\171\2\72\1\uffff\1\72\1\uffff\1\162\1\156\1\157\1\72\3\uffff\1\156\1\147\1\156\1\uffff\1\151\1\72\1\172\1\156\2\uffff\1\147\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\41\uffff\1\137\3\uffff\1\142\3\uffff\1\147\1\150\3\uffff\1\142\101\uffff\1\137\1\uffff\1\143\1\uffff\1\141\1\144\1\145\1\146\1\147\124\uffff\1\130\22\uffff\1\124\11\uffff\1\136\11\uffff\1\127\2\uffff\1\44\1\132\1\uffff\1\133\34\uffff\1\126\4\uffff\1\135\1\uffff\1\125\1\131\1\134\5\uffff\1\114\5\uffff\1\117\10\uffff\1\123\31\uffff\1\24\3\uffff\1\140\1\uffff\1\121\5\uffff\1\122\25\uffff\1\115\3\uffff\1\102\4\uffff\1\106\2\uffff\1\120\5\uffff\1\74\1\73\35\uffff\1\104\3\uffff\1\105\2\uffff\1\72\1\113\3\uffff\1\116\6\uffff\1\112\1\uffff\1\75\1\76\1\107\1\110\1\111\7\uffff\1\103\2\uffff\1\62\10\uffff\1\64\1\65\1\101\13\uffff\1\77\1\100\3\uffff\1\25\2\uffff\1\66\2\uffff\1\67\4\uffff\1\63\3\uffff\1\70\1\71\14\uffff\1\51\6\uffff\1\53\3\uffff\1\54\17\uffff\1\50\1\uffff\1\52\1\55\1\56\1\57\1\60\1\61\4\uffff\1\46\1\47\3\uffff\1\41\10\uffff\1\43\3\uffff\1\35\1\36\1\37\3\uffff\1\45\3\uffff\1\34\1\40\1\42\14\uffff\1\33\31\uffff\1\27\2\uffff\1\26\3\uffff\1\30\1\uffff\1\32\6\uffff\1\22\10\uffff\1\21\2\uffff\1\23\1\31\13\uffff\1\17\1\uffff\1\15\1\16\1\20\11\uffff\1\13\3\uffff\1\14\22\uffff\1\12\6\uffff\1\10\1\uffff\1\11\4\uffff\1\5\1\6\1\7\3\uffff\1\4\4\uffff\1\2\1\3\2\uffff\1\1";
    static final String DFA13_specialS =
        "\1\1\45\uffff\1\2\1\0\u02af\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\52\1\46\4\52\1\47\6\52\1\41\1\50\12\43\7\52\1\14\1\25\1\21\2\45\1\15\1\45\1\40\1\3\1\45\1\33\1\45\1\34\1\16\1\26\1\27\1\45\1\30\1\45\1\20\6\45\3\52\1\44\1\45\1\52\1\12\1\22\1\5\1\2\1\6\1\42\1\35\1\36\1\31\1\45\1\32\1\23\1\13\1\7\1\10\1\11\1\45\1\1\1\4\1\17\1\45\1\24\1\45\1\37\2\45\uff85\52",
            "\1\54\3\uffff\1\53\17\uffff\1\55",
            "\1\60\7\uffff\1\57",
            "\1\63\37\uffff\1\61\1\62",
            "\1\64\5\uffff\1\65\3\uffff\1\66",
            "\1\70\15\uffff\1\67\2\uffff\1\71",
            "\1\72\5\uffff\1\73",
            "\1\74",
            "\1\75\15\uffff\1\76",
            "\1\77\5\uffff\1\102\12\uffff\1\100\6\uffff\1\101",
            "\1\105\2\uffff\1\106\2\uffff\1\103\6\uffff\1\107\4\uffff\1\104",
            "\1\110\12\uffff\1\112\5\uffff\1\111",
            "\1\113\3\uffff\1\114\4\uffff\1\116\2\uffff\1\115",
            "\1\117",
            "\1\120",
            "\1\121\14\uffff\1\122\2\uffff\1\124\3\uffff\1\123",
            "\1\125",
            "\1\130\4\uffff\1\131\1\uffff\1\126\1\uffff\1\127",
            "\1\132\12\uffff\1\134\10\uffff\1\133",
            "\1\137\7\uffff\1\136\5\uffff\1\135",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\144\11\uffff\1\143",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151\1\uffff\1\153\7\uffff\1\152",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\1\161",
            "\12\163\13\uffff\1\164\37\uffff\1\164",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\0\165",
            "\0\165",
            "\1\166\4\uffff\1\167",
            "",
            "",
            "\1\172\5\uffff\1\171",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083\14\uffff\1\u0084",
            "\1\u0085",
            "\1\u0088\1\u0087\3\uffff\1\u0086\2\uffff\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0091\10\uffff\1\u0092\5\uffff\1\u0090",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009d\16\uffff\1\u009c",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7\23\uffff\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b1\17\uffff\1\u00b0",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b7\6\uffff\1\u00b6",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be\3\uffff\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "",
            "\12\163\13\uffff\1\164\37\uffff\1\164",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ca",
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
            "\1\u00d9\14\uffff\1\u00d8",
            "\1\u00db\2\uffff\1\u00da",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e4\11\uffff\1\u00e3",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00eb\15\uffff\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5\12\uffff\1\u00f6",
            "\1\u00f7\2\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00f9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0101\3\uffff\1\u0100",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
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
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
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
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0136",
            "",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b\1\uffff\1\u013c\11\uffff\1\u013d",
            "\1\u013e",
            "\1\u013f\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "\1\u014c",
            "\1\u014d",
            "",
            "",
            "\1\u014e",
            "",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166\1\uffff\1\u0167\11\uffff\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "",
            "\1\u0171",
            "",
            "",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "",
            "\1\u0177\16\uffff\1\u0178",
            "\1\u0179",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u017b",
            "\1\u017c",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
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
            "",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "",
            "\1\u01a1",
            "",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01bc",
            "\1\u01bd",
            "",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "",
            "\1\u01c2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "",
            "",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01d2",
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
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "",
            "\1\u01e6",
            "\1\u01e7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u01e9",
            "\1\u01ea",
            "",
            "",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            "\1\u01ff",
            "\1\u0200\15\uffff\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "",
            "",
            "",
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
            "\1\u0211",
            "",
            "",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "",
            "\1\u0215",
            "\1\u0216",
            "",
            "\1\u0217",
            "\1\u0218",
            "",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "",
            "\1\u021d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "",
            "\1\u0244",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "",
            "",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "",
            "",
            "",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "",
            "",
            "",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0267\22\uffff\1\u0266",
            "\1\u0268",
            "\1\u0269",
            "",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            "\1\u0281",
            "\1\u0282",
            "",
            "\1\u0283",
            "\1\u0284",
            "",
            "\1\u0285",
            "\1\u0286",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "",
            "\1\u0297",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "",
            "\1\u02a4",
            "",
            "",
            "",
            "\1\u02a5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "",
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
            "\1\u02c0",
            "\1\u02c1",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "",
            "\1\u02c9",
            "",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "",
            "",
            "",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "",
            "\1\u02d1",
            "\1\u02d2",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u02d4",
            "",
            "",
            "\1\u02d5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
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
            return "1:1: Tokens : ( Reinforncement_learning | Distributed_training | Image_classification | Scaling_efficiency | Core_subscription | Enable_autotuning | Number_of_threads | Enable_opt_build | Object_detection | Parallelisation | Number_of_acc | Recommendation | Ai_framework | Message_size | Optimization | AI_Inference | Ai_training | Constraints | AI_Training | FPGAXilinx | NVIDIAV100 | Autotuning | Parameters | Tensorflow | Translation | TensorFlow | Opt_build | CPU_type | Acc_type | Affinity | App_type | Basedata | Compiler | Location | Prefetch | AMDM100 | AUTOTUNE | Imagenet | Intelx86 | Backend | Command | Library | Openacc | PyTorch_1 | Version | BigData | OPENACC | PyTorch | RESTART | Config | Layers | Opencl | Openmp | Typing | CREATA | OPENCL | OPENMP | Build | Cache | Count | Input | Keras_1 | Medium | Mvapch | Opnmpi | Range | Simple | Tuner | CIFAR | IMAGE | Keras | MNIST | MXNet | Power | Block | Data | Glow | Large | Size | Small | Type | CNTK | Cray | Etl | Hpc | Int | Mpi | Run | Xla | AMD | ARM | HPC | MPI | Pgi | FullStop | RULE_BOOLEAN | RULE_EXT_INT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( ((LA13_39>='\u0000' && LA13_39<='\uFFFF')) ) {s = 117;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
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

                        else if ( (LA13_0=='F') ) {s = 13;}

                        else if ( (LA13_0=='N') ) {s = 14;}

                        else if ( (LA13_0=='t') ) {s = 15;}

                        else if ( (LA13_0=='T') ) {s = 16;}

                        else if ( (LA13_0=='C') ) {s = 17;}

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

                        else if ( (LA13_0=='.') ) {s = 33;}

                        else if ( (LA13_0=='f') ) {s = 34;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 35;}

                        else if ( (LA13_0=='^') ) {s = 36;}

                        else if ( ((LA13_0>='D' && LA13_0<='E')||LA13_0=='G'||LA13_0=='J'||LA13_0=='L'||LA13_0=='Q'||LA13_0=='S'||(LA13_0>='U' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='j'||LA13_0=='q'||LA13_0=='u'||LA13_0=='w'||(LA13_0>='y' && LA13_0<='z')) ) {s = 37;}

                        else if ( (LA13_0=='\"') ) {s = 38;}

                        else if ( (LA13_0=='\'') ) {s = 39;}

                        else if ( (LA13_0=='/') ) {s = 40;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 41;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='-')||(LA13_0>=':' && LA13_0<='@')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( ((LA13_38>='\u0000' && LA13_38<='\uFFFF')) ) {s = 117;}

                        else s = 42;

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