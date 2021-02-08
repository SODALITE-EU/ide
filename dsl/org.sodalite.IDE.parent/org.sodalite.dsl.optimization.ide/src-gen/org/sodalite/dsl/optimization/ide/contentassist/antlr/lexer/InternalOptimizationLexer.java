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
    public static final int Tensorflow=34;
    public static final int Big_data=45;
    public static final int Size=77;
    public static final int Mpi=89;
    public static final int Enable_autotuning=17;
    public static final int Count=56;
    public static final int Mvapch=60;
    public static final int Image=70;
    public static final int Autotuning=30;
    public static final int Imagenet=46;
    public static final int Prefetch=42;
    public static final int RULE_QUALIFIED_NAME=101;
    public static final int Translation=32;
    public static final int Parameters=31;
    public static final int Small=78;
    public static final int RULE_ID=100;
    public static final int Cray=81;
    public static final int Number_of_acc=22;
    public static final int Recommendation=23;
    public static final int Cifar=67;
    public static final int Pgi=90;
    public static final int Enable_opt_build=19;
    public static final int RULE_INT=98;
    public static final int RULE_ML_COMMENT=103;
    public static final int Openacc=51;
    public static final int Keras=71;
    public static final int Hpc=88;
    public static final int Arm=87;
    public static final int Core_subscription=16;
    public static final int Large=72;
    public static final int Ai_frameworkTensorflow=4;
    public static final int Restart=54;
    public static final int ParallelisationOpenmp=7;
    public static final int Simple=64;
    public static final int Cpu_type=40;
    public static final int Comma=92;
    public static final int Ai_training=29;
    public static final int X86=91;
    public static final int Mnist=73;
    public static final int App_typeHpc=25;
    public static final int Layers=50;
    public static final int Basedata=38;
    public static final int Cresta=57;
    public static final int FullStop=93;
    public static final int Cntk=80;
    public static final int Ai_inference=27;
    public static final int Fpga=83;
    public static final int Ai_frameworkPytorch=9;
    public static final int Opt_build=33;
    public static final int Ai_framework=24;
    public static final int Pytorch=53;
    public static final int Type=79;
    public static final int Image_classification=12;
    public static final int Message_size=26;
    public static final int Opencl=62;
    public static final int Etl=82;
    public static final int None=84;
    public static final int Power=76;
    public static final int Number_of_threads=18;
    public static final int RULE_BEGIN=95;
    public static final int Mxnet=75;
    public static final int ParallelisationOpencl=6;
    public static final int RULE_BOOLEAN=97;
    public static final int Tuner=65;
    public static final int Glow=69;
    public static final int Openmpi=52;
    public static final int Nvidia=61;
    public static final int Input=58;
    public static final int Version=48;
    public static final int Amd=86;
    public static final int Mpich=74;
    public static final int Object_detection=20;
    public static final int Compiler=39;
    public static final int ParallelisationOpenacc=5;
    public static final int Ai_frameworkKeras=14;
    public static final int Openmp=63;
    public static final int Medium=59;
    public static final int Affinity=36;
    public static final int Block=66;
    public static final int Library=47;
    public static final int Cache=55;
    public static final int RULE_END=96;
    public static final int Reinforncement_learning=8;
    public static final int Config=49;
    public static final int RULE_STRING=102;
    public static final int Xla=85;
    public static final int Optimization=28;
    public static final int Acc_type=35;
    public static final int App_type=37;
    public static final int RULE_SL_COMMENT=104;
    public static final int Colon=94;
    public static final int EOF=-1;
    public static final int RULE_WS=105;
    public static final int RULE_EXT_INT=99;
    public static final int Data=68;
    public static final int RULE_ANY_OTHER=106;
    public static final int Distributed_training=11;
    public static final int Autotune=43;
    public static final int App_typeAi_training=10;
    public static final int ParallelisationMpi=13;
    public static final int Backend=44;
    public static final int Parallelisation=21;
    public static final int Scaling_efficiency=15;
    public static final int Location=41;

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

    // $ANTLR start "Ai_frameworkTensorflow"
    public final void mAi_frameworkTensorflow() throws RecognitionException {
        try {
            int _type = Ai_frameworkTensorflow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:14:24: ( 'ai_framework-tensorflow:' )
            // InternalOptimizationLexer.g:14:26: 'ai_framework-tensorflow:'
            {
            match("ai_framework-tensorflow:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ai_frameworkTensorflow"

    // $ANTLR start "ParallelisationOpenacc"
    public final void mParallelisationOpenacc() throws RecognitionException {
        try {
            int _type = ParallelisationOpenacc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:16:24: ( 'parallelisation-openacc:' )
            // InternalOptimizationLexer.g:16:26: 'parallelisation-openacc:'
            {
            match("parallelisation-openacc:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParallelisationOpenacc"

    // $ANTLR start "ParallelisationOpencl"
    public final void mParallelisationOpencl() throws RecognitionException {
        try {
            int _type = ParallelisationOpencl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:18:23: ( 'parallelisation-opencl:' )
            // InternalOptimizationLexer.g:18:25: 'parallelisation-opencl:'
            {
            match("parallelisation-opencl:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParallelisationOpencl"

    // $ANTLR start "ParallelisationOpenmp"
    public final void mParallelisationOpenmp() throws RecognitionException {
        try {
            int _type = ParallelisationOpenmp;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:20:23: ( 'parallelisation-openmp:' )
            // InternalOptimizationLexer.g:20:25: 'parallelisation-openmp:'
            {
            match("parallelisation-openmp:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParallelisationOpenmp"

    // $ANTLR start "Reinforncement_learning"
    public final void mReinforncement_learning() throws RecognitionException {
        try {
            int _type = Reinforncement_learning;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:22:25: ( 'reinforncement_learning' )
            // InternalOptimizationLexer.g:22:27: 'reinforncement_learning'
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

    // $ANTLR start "Ai_frameworkPytorch"
    public final void mAi_frameworkPytorch() throws RecognitionException {
        try {
            int _type = Ai_frameworkPytorch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:24:21: ( 'ai_framework-pytorch:' )
            // InternalOptimizationLexer.g:24:23: 'ai_framework-pytorch:'
            {
            match("ai_framework-pytorch:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ai_frameworkPytorch"

    // $ANTLR start "App_typeAi_training"
    public final void mApp_typeAi_training() throws RecognitionException {
        try {
            int _type = App_typeAi_training;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:26:21: ( 'app_type-ai_training:' )
            // InternalOptimizationLexer.g:26:23: 'app_type-ai_training:'
            {
            match("app_type-ai_training:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "App_typeAi_training"

    // $ANTLR start "Distributed_training"
    public final void mDistributed_training() throws RecognitionException {
        try {
            int _type = Distributed_training;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:28:22: ( 'distributed_training:' )
            // InternalOptimizationLexer.g:28:24: 'distributed_training:'
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
            // InternalOptimizationLexer.g:30:22: ( 'image_classification' )
            // InternalOptimizationLexer.g:30:24: 'image_classification'
            {
            match("image_classification"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Image_classification"

    // $ANTLR start "ParallelisationMpi"
    public final void mParallelisationMpi() throws RecognitionException {
        try {
            int _type = ParallelisationMpi;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:32:20: ( 'parallelisation-mpi:' )
            // InternalOptimizationLexer.g:32:22: 'parallelisation-mpi:'
            {
            match("parallelisation-mpi:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ParallelisationMpi"

    // $ANTLR start "Ai_frameworkKeras"
    public final void mAi_frameworkKeras() throws RecognitionException {
        try {
            int _type = Ai_frameworkKeras;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:34:19: ( 'ai_framework-keras:' )
            // InternalOptimizationLexer.g:34:21: 'ai_framework-keras:'
            {
            match("ai_framework-keras:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ai_frameworkKeras"

    // $ANTLR start "Scaling_efficiency"
    public final void mScaling_efficiency() throws RecognitionException {
        try {
            int _type = Scaling_efficiency;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:36:20: ( 'scaling_efficiency:' )
            // InternalOptimizationLexer.g:36:22: 'scaling_efficiency:'
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
            // InternalOptimizationLexer.g:38:19: ( 'core_subscription:' )
            // InternalOptimizationLexer.g:38:21: 'core_subscription:'
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
            // InternalOptimizationLexer.g:40:19: ( 'enable_autotuning:' )
            // InternalOptimizationLexer.g:40:21: 'enable_autotuning:'
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
            // InternalOptimizationLexer.g:42:19: ( 'number_of_threads:' )
            // InternalOptimizationLexer.g:42:21: 'number_of_threads:'
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
            // InternalOptimizationLexer.g:44:18: ( 'enable_opt_build:' )
            // InternalOptimizationLexer.g:44:20: 'enable_opt_build:'
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
            // InternalOptimizationLexer.g:46:18: ( 'object_detection' )
            // InternalOptimizationLexer.g:46:20: 'object_detection'
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
            // InternalOptimizationLexer.g:48:17: ( 'parallelisation:' )
            // InternalOptimizationLexer.g:48:19: 'parallelisation:'
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
            // InternalOptimizationLexer.g:50:15: ( 'number_of_acc:' )
            // InternalOptimizationLexer.g:50:17: 'number_of_acc:'
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
            // InternalOptimizationLexer.g:52:16: ( 'recommendation' )
            // InternalOptimizationLexer.g:52:18: 'recommendation'
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
            // InternalOptimizationLexer.g:54:14: ( 'ai_framework:' )
            // InternalOptimizationLexer.g:54:16: 'ai_framework:'
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

    // $ANTLR start "App_typeHpc"
    public final void mApp_typeHpc() throws RecognitionException {
        try {
            int _type = App_typeHpc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:56:13: ( 'app_type-hpc:' )
            // InternalOptimizationLexer.g:56:15: 'app_type-hpc:'
            {
            match("app_type-hpc:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "App_typeHpc"

    // $ANTLR start "Message_size"
    public final void mMessage_size() throws RecognitionException {
        try {
            int _type = Message_size;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:58:14: ( 'message_size:' )
            // InternalOptimizationLexer.g:58:16: 'message_size:'
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

    // $ANTLR start "Ai_inference"
    public final void mAi_inference() throws RecognitionException {
        try {
            int _type = Ai_inference;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:60:14: ( 'ai_inference' )
            // InternalOptimizationLexer.g:60:16: 'ai_inference'
            {
            match("ai_inference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ai_inference"

    // $ANTLR start "Optimization"
    public final void mOptimization() throws RecognitionException {
        try {
            int _type = Optimization;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:62:14: ( 'optimization' )
            // InternalOptimizationLexer.g:62:16: 'optimization'
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

    // $ANTLR start "Ai_training"
    public final void mAi_training() throws RecognitionException {
        try {
            int _type = Ai_training;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:64:13: ( 'ai_training' )
            // InternalOptimizationLexer.g:64:15: 'ai_training'
            {
            match("ai_training"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ai_training"

    // $ANTLR start "Autotuning"
    public final void mAutotuning() throws RecognitionException {
        try {
            int _type = Autotuning;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:66:12: ( 'autotuning:' )
            // InternalOptimizationLexer.g:66:14: 'autotuning:'
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
            // InternalOptimizationLexer.g:68:12: ( 'parameters:' )
            // InternalOptimizationLexer.g:68:14: 'parameters:'
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

    // $ANTLR start "Translation"
    public final void mTranslation() throws RecognitionException {
        try {
            int _type = Translation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:70:13: ( 'translation' )
            // InternalOptimizationLexer.g:70:15: 'translation'
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

    // $ANTLR start "Opt_build"
    public final void mOpt_build() throws RecognitionException {
        try {
            int _type = Opt_build;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:72:11: ( 'opt_build:' )
            // InternalOptimizationLexer.g:72:13: 'opt_build:'
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

    // $ANTLR start "Tensorflow"
    public final void mTensorflow() throws RecognitionException {
        try {
            int _type = Tensorflow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:74:12: ( 'tensorflow' )
            // InternalOptimizationLexer.g:74:14: 'tensorflow'
            {
            match("tensorflow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Tensorflow"

    // $ANTLR start "Acc_type"
    public final void mAcc_type() throws RecognitionException {
        try {
            int _type = Acc_type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:76:10: ( 'acc_type:' )
            // InternalOptimizationLexer.g:76:12: 'acc_type:'
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
            // InternalOptimizationLexer.g:78:10: ( 'affinity:' )
            // InternalOptimizationLexer.g:78:12: 'affinity:'
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
            // InternalOptimizationLexer.g:80:10: ( 'app_type:' )
            // InternalOptimizationLexer.g:80:12: 'app_type:'
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
            // InternalOptimizationLexer.g:82:10: ( 'basedata:' )
            // InternalOptimizationLexer.g:82:12: 'basedata:'
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
            // InternalOptimizationLexer.g:84:10: ( 'compiler:' )
            // InternalOptimizationLexer.g:84:12: 'compiler:'
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
            // InternalOptimizationLexer.g:86:10: ( 'cpu_type:' )
            // InternalOptimizationLexer.g:86:12: 'cpu_type:'
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
            // InternalOptimizationLexer.g:88:10: ( 'location:' )
            // InternalOptimizationLexer.g:88:12: 'location:'
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
            // InternalOptimizationLexer.g:90:10: ( 'prefetch:' )
            // InternalOptimizationLexer.g:90:12: 'prefetch:'
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

    // $ANTLR start "Autotune"
    public final void mAutotune() throws RecognitionException {
        try {
            int _type = Autotune;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:92:10: ( 'autotune' )
            // InternalOptimizationLexer.g:92:12: 'autotune'
            {
            match("autotune"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Autotune"

    // $ANTLR start "Backend"
    public final void mBackend() throws RecognitionException {
        try {
            int _type = Backend;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:94:9: ( 'backend:' )
            // InternalOptimizationLexer.g:94:11: 'backend:'
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

    // $ANTLR start "Big_data"
    public final void mBig_data() throws RecognitionException {
        try {
            int _type = Big_data;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:96:10: ( 'big_data' )
            // InternalOptimizationLexer.g:96:12: 'big_data'
            {
            match("big_data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Big_data"

    // $ANTLR start "Imagenet"
    public final void mImagenet() throws RecognitionException {
        try {
            int _type = Imagenet;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:98:10: ( 'imagenet' )
            // InternalOptimizationLexer.g:98:12: 'imagenet'
            {
            match("imagenet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Imagenet"

    // $ANTLR start "Library"
    public final void mLibrary() throws RecognitionException {
        try {
            int _type = Library;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:100:9: ( 'library:' )
            // InternalOptimizationLexer.g:100:11: 'library:'
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

    // $ANTLR start "Config"
    public final void mConfig() throws RecognitionException {
        try {
            int _type = Config;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:104:8: ( 'config:' )
            // InternalOptimizationLexer.g:104:10: 'config:'
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
            // InternalOptimizationLexer.g:106:8: ( 'layers:' )
            // InternalOptimizationLexer.g:106:10: 'layers:'
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

    // $ANTLR start "Openacc"
    public final void mOpenacc() throws RecognitionException {
        try {
            int _type = Openacc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:108:9: ( 'openacc' )
            // InternalOptimizationLexer.g:108:11: 'openacc'
            {
            match("openacc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Openacc"

    // $ANTLR start "Openmpi"
    public final void mOpenmpi() throws RecognitionException {
        try {
            int _type = Openmpi;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:110:9: ( 'openmpi' )
            // InternalOptimizationLexer.g:110:11: 'openmpi'
            {
            match("openmpi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Openmpi"

    // $ANTLR start "Pytorch"
    public final void mPytorch() throws RecognitionException {
        try {
            int _type = Pytorch;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:112:9: ( 'pytorch' )
            // InternalOptimizationLexer.g:112:11: 'pytorch'
            {
            match("pytorch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pytorch"

    // $ANTLR start "Restart"
    public final void mRestart() throws RecognitionException {
        try {
            int _type = Restart;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:114:9: ( 'restart' )
            // InternalOptimizationLexer.g:114:11: 'restart'
            {
            match("restart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Restart"

    // $ANTLR start "Cache"
    public final void mCache() throws RecognitionException {
        try {
            int _type = Cache;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:116:7: ( 'cache:' )
            // InternalOptimizationLexer.g:116:9: 'cache:'
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
            // InternalOptimizationLexer.g:118:7: ( 'count:' )
            // InternalOptimizationLexer.g:118:9: 'count:'
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

    // $ANTLR start "Cresta"
    public final void mCresta() throws RecognitionException {
        try {
            int _type = Cresta;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:120:8: ( 'cresta' )
            // InternalOptimizationLexer.g:120:10: 'cresta'
            {
            match("cresta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cresta"

    // $ANTLR start "Input"
    public final void mInput() throws RecognitionException {
        try {
            int _type = Input;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:122:7: ( 'input:' )
            // InternalOptimizationLexer.g:122:9: 'input:'
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

    // $ANTLR start "Medium"
    public final void mMedium() throws RecognitionException {
        try {
            int _type = Medium;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:124:8: ( 'medium' )
            // InternalOptimizationLexer.g:124:10: 'medium'
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
            // InternalOptimizationLexer.g:126:8: ( 'mvapch' )
            // InternalOptimizationLexer.g:126:10: 'mvapch'
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

    // $ANTLR start "Nvidia"
    public final void mNvidia() throws RecognitionException {
        try {
            int _type = Nvidia;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:128:8: ( 'nvidia' )
            // InternalOptimizationLexer.g:128:10: 'nvidia'
            {
            match("nvidia"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Nvidia"

    // $ANTLR start "Opencl"
    public final void mOpencl() throws RecognitionException {
        try {
            int _type = Opencl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:130:8: ( 'opencl' )
            // InternalOptimizationLexer.g:130:10: 'opencl'
            {
            match("opencl"); 


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
            // InternalOptimizationLexer.g:132:8: ( 'openmp' )
            // InternalOptimizationLexer.g:132:10: 'openmp'
            {
            match("openmp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Openmp"

    // $ANTLR start "Simple"
    public final void mSimple() throws RecognitionException {
        try {
            int _type = Simple;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:134:8: ( 'simple' )
            // InternalOptimizationLexer.g:134:10: 'simple'
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
            // InternalOptimizationLexer.g:136:7: ( 'tuner:' )
            // InternalOptimizationLexer.g:136:9: 'tuner:'
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

    // $ANTLR start "Block"
    public final void mBlock() throws RecognitionException {
        try {
            int _type = Block;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:138:7: ( 'block' )
            // InternalOptimizationLexer.g:138:9: 'block'
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

    // $ANTLR start "Cifar"
    public final void mCifar() throws RecognitionException {
        try {
            int _type = Cifar;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:140:7: ( 'cifar' )
            // InternalOptimizationLexer.g:140:9: 'cifar'
            {
            match("cifar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cifar"

    // $ANTLR start "Data"
    public final void mData() throws RecognitionException {
        try {
            int _type = Data;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:142:6: ( 'data:' )
            // InternalOptimizationLexer.g:142:8: 'data:'
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
            // InternalOptimizationLexer.g:144:6: ( 'glow:' )
            // InternalOptimizationLexer.g:144:8: 'glow:'
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

    // $ANTLR start "Image"
    public final void mImage() throws RecognitionException {
        try {
            int _type = Image;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:146:7: ( 'image' )
            // InternalOptimizationLexer.g:146:9: 'image'
            {
            match("image"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Image"

    // $ANTLR start "Keras"
    public final void mKeras() throws RecognitionException {
        try {
            int _type = Keras;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:148:7: ( 'keras' )
            // InternalOptimizationLexer.g:148:9: 'keras'
            {
            match("keras"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Keras"

    // $ANTLR start "Large"
    public final void mLarge() throws RecognitionException {
        try {
            int _type = Large;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:150:7: ( 'large' )
            // InternalOptimizationLexer.g:150:9: 'large'
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

    // $ANTLR start "Mnist"
    public final void mMnist() throws RecognitionException {
        try {
            int _type = Mnist;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:152:7: ( 'mnist' )
            // InternalOptimizationLexer.g:152:9: 'mnist'
            {
            match("mnist"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mnist"

    // $ANTLR start "Mpich"
    public final void mMpich() throws RecognitionException {
        try {
            int _type = Mpich;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:154:7: ( 'mpich' )
            // InternalOptimizationLexer.g:154:9: 'mpich'
            {
            match("mpich"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mpich"

    // $ANTLR start "Mxnet"
    public final void mMxnet() throws RecognitionException {
        try {
            int _type = Mxnet;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:156:7: ( 'mxnet' )
            // InternalOptimizationLexer.g:156:9: 'mxnet'
            {
            match("mxnet"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mxnet"

    // $ANTLR start "Power"
    public final void mPower() throws RecognitionException {
        try {
            int _type = Power;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:158:7: ( 'power' )
            // InternalOptimizationLexer.g:158:9: 'power'
            {
            match("power"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Power"

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

    // $ANTLR start "Cntk"
    public final void mCntk() throws RecognitionException {
        try {
            int _type = Cntk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:166:6: ( 'cntk' )
            // InternalOptimizationLexer.g:166:8: 'cntk'
            {
            match("cntk"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cntk"

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

    // $ANTLR start "Fpga"
    public final void mFpga() throws RecognitionException {
        try {
            int _type = Fpga;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:172:6: ( 'fpga' )
            // InternalOptimizationLexer.g:172:8: 'fpga'
            {
            match("fpga"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Fpga"

    // $ANTLR start "None"
    public final void mNone() throws RecognitionException {
        try {
            int _type = None;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:174:6: ( 'none' )
            // InternalOptimizationLexer.g:174:8: 'none'
            {
            match("none"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "None"

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

    // $ANTLR start "Amd"
    public final void mAmd() throws RecognitionException {
        try {
            int _type = Amd;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:178:5: ( 'amd' )
            // InternalOptimizationLexer.g:178:7: 'amd'
            {
            match("amd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Amd"

    // $ANTLR start "Arm"
    public final void mArm() throws RecognitionException {
        try {
            int _type = Arm;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:180:5: ( 'arm' )
            // InternalOptimizationLexer.g:180:7: 'arm'
            {
            match("arm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Arm"

    // $ANTLR start "Hpc"
    public final void mHpc() throws RecognitionException {
        try {
            int _type = Hpc;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:182:5: ( 'hpc' )
            // InternalOptimizationLexer.g:182:7: 'hpc'
            {
            match("hpc"); 


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
            // InternalOptimizationLexer.g:184:5: ( 'mpi' )
            // InternalOptimizationLexer.g:184:7: 'mpi'
            {
            match("mpi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Mpi"

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

    // $ANTLR start "X86"
    public final void mX86() throws RecognitionException {
        try {
            int _type = X86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:188:5: ( 'x86' )
            // InternalOptimizationLexer.g:188:7: 'x86'
            {
            match("x86"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "X86"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptimizationLexer.g:190:7: ( ',' )
            // InternalOptimizationLexer.g:190:9: ','
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
            // InternalOptimizationLexer.g:192:10: ( '.' )
            // InternalOptimizationLexer.g:192:12: '.'
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
            // InternalOptimizationLexer.g:194:7: ( ':' )
            // InternalOptimizationLexer.g:194:9: ':'
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

    // $ANTLR start "RULE_BEGIN"
    public final void mRULE_BEGIN() throws RecognitionException {
        try {
            // InternalOptimizationLexer.g:196:21: ()
            // InternalOptimizationLexer.g:196:23: 
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
            // InternalOptimizationLexer.g:198:19: ()
            // InternalOptimizationLexer.g:198:21: 
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
            // InternalOptimizationLexer.g:200:14: ( ( 'true' | 'false' ) )
            // InternalOptimizationLexer.g:200:16: ( 'true' | 'false' )
            {
            // InternalOptimizationLexer.g:200:16: ( 'true' | 'false' )
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
                    // InternalOptimizationLexer.g:200:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalOptimizationLexer.g:200:24: 'false'
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
            // InternalOptimizationLexer.g:202:14: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT )
            // InternalOptimizationLexer.g:202:16: RULE_INT ( 'e' | 'E' ) ( '-' | '+' ) RULE_INT
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
            // InternalOptimizationLexer.g:204:21: ( RULE_ID ( '.' RULE_ID )+ )
            // InternalOptimizationLexer.g:204:23: RULE_ID ( '.' RULE_ID )+
            {
            mRULE_ID(); 
            // InternalOptimizationLexer.g:204:31: ( '.' RULE_ID )+
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
            	    // InternalOptimizationLexer.g:204:32: '.' RULE_ID
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
            // InternalOptimizationLexer.g:206:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOptimizationLexer.g:206:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOptimizationLexer.g:206:20: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOptimizationLexer.g:206:20: '^'
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

            // InternalOptimizationLexer.g:206:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalOptimizationLexer.g:208:10: ( ( '0' .. '9' )+ )
            // InternalOptimizationLexer.g:208:12: ( '0' .. '9' )+
            {
            // InternalOptimizationLexer.g:208:12: ( '0' .. '9' )+
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
            	    // InternalOptimizationLexer.g:208:13: '0' .. '9'
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
            // InternalOptimizationLexer.g:210:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOptimizationLexer.g:210:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOptimizationLexer.g:210:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalOptimizationLexer.g:210:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOptimizationLexer.g:210:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalOptimizationLexer.g:210:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOptimizationLexer.g:210:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalOptimizationLexer.g:210:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOptimizationLexer.g:210:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalOptimizationLexer.g:210:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOptimizationLexer.g:210:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalOptimizationLexer.g:212:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOptimizationLexer.g:212:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOptimizationLexer.g:212:24: ( options {greedy=false; } : . )*
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
            	    // InternalOptimizationLexer.g:212:52: .
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
            // InternalOptimizationLexer.g:214:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOptimizationLexer.g:214:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOptimizationLexer.g:214:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalOptimizationLexer.g:214:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalOptimizationLexer.g:214:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalOptimizationLexer.g:214:41: ( '\\r' )? '\\n'
                    {
                    // InternalOptimizationLexer.g:214:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalOptimizationLexer.g:214:41: '\\r'
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
            // InternalOptimizationLexer.g:216:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOptimizationLexer.g:216:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOptimizationLexer.g:216:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalOptimizationLexer.g:218:16: ( . )
            // InternalOptimizationLexer.g:218:18: .
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
        // InternalOptimizationLexer.g:1:8: ( Ai_frameworkTensorflow | ParallelisationOpenacc | ParallelisationOpencl | ParallelisationOpenmp | Reinforncement_learning | Ai_frameworkPytorch | App_typeAi_training | Distributed_training | Image_classification | ParallelisationMpi | Ai_frameworkKeras | Scaling_efficiency | Core_subscription | Enable_autotuning | Number_of_threads | Enable_opt_build | Object_detection | Parallelisation | Number_of_acc | Recommendation | Ai_framework | App_typeHpc | Message_size | Ai_inference | Optimization | Ai_training | Autotuning | Parameters | Translation | Opt_build | Tensorflow | Acc_type | Affinity | App_type | Basedata | Compiler | Cpu_type | Location | Prefetch | Autotune | Backend | Big_data | Imagenet | Library | Version | Config | Layers | Openacc | Openmpi | Pytorch | Restart | Cache | Count | Cresta | Input | Medium | Mvapch | Nvidia | Opencl | Openmp | Simple | Tuner | Block | Cifar | Data | Glow | Image | Keras | Large | Mnist | Mpich | Mxnet | Power | Size | Small | Type | Cntk | Cray | Etl | Fpga | None | Xla | Amd | Arm | Hpc | Mpi | Pgi | X86 | Comma | FullStop | Colon | RULE_BOOLEAN | RULE_EXT_INT | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=100;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalOptimizationLexer.g:1:10: Ai_frameworkTensorflow
                {
                mAi_frameworkTensorflow(); 

                }
                break;
            case 2 :
                // InternalOptimizationLexer.g:1:33: ParallelisationOpenacc
                {
                mParallelisationOpenacc(); 

                }
                break;
            case 3 :
                // InternalOptimizationLexer.g:1:56: ParallelisationOpencl
                {
                mParallelisationOpencl(); 

                }
                break;
            case 4 :
                // InternalOptimizationLexer.g:1:78: ParallelisationOpenmp
                {
                mParallelisationOpenmp(); 

                }
                break;
            case 5 :
                // InternalOptimizationLexer.g:1:100: Reinforncement_learning
                {
                mReinforncement_learning(); 

                }
                break;
            case 6 :
                // InternalOptimizationLexer.g:1:124: Ai_frameworkPytorch
                {
                mAi_frameworkPytorch(); 

                }
                break;
            case 7 :
                // InternalOptimizationLexer.g:1:144: App_typeAi_training
                {
                mApp_typeAi_training(); 

                }
                break;
            case 8 :
                // InternalOptimizationLexer.g:1:164: Distributed_training
                {
                mDistributed_training(); 

                }
                break;
            case 9 :
                // InternalOptimizationLexer.g:1:185: Image_classification
                {
                mImage_classification(); 

                }
                break;
            case 10 :
                // InternalOptimizationLexer.g:1:206: ParallelisationMpi
                {
                mParallelisationMpi(); 

                }
                break;
            case 11 :
                // InternalOptimizationLexer.g:1:225: Ai_frameworkKeras
                {
                mAi_frameworkKeras(); 

                }
                break;
            case 12 :
                // InternalOptimizationLexer.g:1:243: Scaling_efficiency
                {
                mScaling_efficiency(); 

                }
                break;
            case 13 :
                // InternalOptimizationLexer.g:1:262: Core_subscription
                {
                mCore_subscription(); 

                }
                break;
            case 14 :
                // InternalOptimizationLexer.g:1:280: Enable_autotuning
                {
                mEnable_autotuning(); 

                }
                break;
            case 15 :
                // InternalOptimizationLexer.g:1:298: Number_of_threads
                {
                mNumber_of_threads(); 

                }
                break;
            case 16 :
                // InternalOptimizationLexer.g:1:316: Enable_opt_build
                {
                mEnable_opt_build(); 

                }
                break;
            case 17 :
                // InternalOptimizationLexer.g:1:333: Object_detection
                {
                mObject_detection(); 

                }
                break;
            case 18 :
                // InternalOptimizationLexer.g:1:350: Parallelisation
                {
                mParallelisation(); 

                }
                break;
            case 19 :
                // InternalOptimizationLexer.g:1:366: Number_of_acc
                {
                mNumber_of_acc(); 

                }
                break;
            case 20 :
                // InternalOptimizationLexer.g:1:380: Recommendation
                {
                mRecommendation(); 

                }
                break;
            case 21 :
                // InternalOptimizationLexer.g:1:395: Ai_framework
                {
                mAi_framework(); 

                }
                break;
            case 22 :
                // InternalOptimizationLexer.g:1:408: App_typeHpc
                {
                mApp_typeHpc(); 

                }
                break;
            case 23 :
                // InternalOptimizationLexer.g:1:420: Message_size
                {
                mMessage_size(); 

                }
                break;
            case 24 :
                // InternalOptimizationLexer.g:1:433: Ai_inference
                {
                mAi_inference(); 

                }
                break;
            case 25 :
                // InternalOptimizationLexer.g:1:446: Optimization
                {
                mOptimization(); 

                }
                break;
            case 26 :
                // InternalOptimizationLexer.g:1:459: Ai_training
                {
                mAi_training(); 

                }
                break;
            case 27 :
                // InternalOptimizationLexer.g:1:471: Autotuning
                {
                mAutotuning(); 

                }
                break;
            case 28 :
                // InternalOptimizationLexer.g:1:482: Parameters
                {
                mParameters(); 

                }
                break;
            case 29 :
                // InternalOptimizationLexer.g:1:493: Translation
                {
                mTranslation(); 

                }
                break;
            case 30 :
                // InternalOptimizationLexer.g:1:505: Opt_build
                {
                mOpt_build(); 

                }
                break;
            case 31 :
                // InternalOptimizationLexer.g:1:515: Tensorflow
                {
                mTensorflow(); 

                }
                break;
            case 32 :
                // InternalOptimizationLexer.g:1:526: Acc_type
                {
                mAcc_type(); 

                }
                break;
            case 33 :
                // InternalOptimizationLexer.g:1:535: Affinity
                {
                mAffinity(); 

                }
                break;
            case 34 :
                // InternalOptimizationLexer.g:1:544: App_type
                {
                mApp_type(); 

                }
                break;
            case 35 :
                // InternalOptimizationLexer.g:1:553: Basedata
                {
                mBasedata(); 

                }
                break;
            case 36 :
                // InternalOptimizationLexer.g:1:562: Compiler
                {
                mCompiler(); 

                }
                break;
            case 37 :
                // InternalOptimizationLexer.g:1:571: Cpu_type
                {
                mCpu_type(); 

                }
                break;
            case 38 :
                // InternalOptimizationLexer.g:1:580: Location
                {
                mLocation(); 

                }
                break;
            case 39 :
                // InternalOptimizationLexer.g:1:589: Prefetch
                {
                mPrefetch(); 

                }
                break;
            case 40 :
                // InternalOptimizationLexer.g:1:598: Autotune
                {
                mAutotune(); 

                }
                break;
            case 41 :
                // InternalOptimizationLexer.g:1:607: Backend
                {
                mBackend(); 

                }
                break;
            case 42 :
                // InternalOptimizationLexer.g:1:615: Big_data
                {
                mBig_data(); 

                }
                break;
            case 43 :
                // InternalOptimizationLexer.g:1:624: Imagenet
                {
                mImagenet(); 

                }
                break;
            case 44 :
                // InternalOptimizationLexer.g:1:633: Library
                {
                mLibrary(); 

                }
                break;
            case 45 :
                // InternalOptimizationLexer.g:1:641: Version
                {
                mVersion(); 

                }
                break;
            case 46 :
                // InternalOptimizationLexer.g:1:649: Config
                {
                mConfig(); 

                }
                break;
            case 47 :
                // InternalOptimizationLexer.g:1:656: Layers
                {
                mLayers(); 

                }
                break;
            case 48 :
                // InternalOptimizationLexer.g:1:663: Openacc
                {
                mOpenacc(); 

                }
                break;
            case 49 :
                // InternalOptimizationLexer.g:1:671: Openmpi
                {
                mOpenmpi(); 

                }
                break;
            case 50 :
                // InternalOptimizationLexer.g:1:679: Pytorch
                {
                mPytorch(); 

                }
                break;
            case 51 :
                // InternalOptimizationLexer.g:1:687: Restart
                {
                mRestart(); 

                }
                break;
            case 52 :
                // InternalOptimizationLexer.g:1:695: Cache
                {
                mCache(); 

                }
                break;
            case 53 :
                // InternalOptimizationLexer.g:1:701: Count
                {
                mCount(); 

                }
                break;
            case 54 :
                // InternalOptimizationLexer.g:1:707: Cresta
                {
                mCresta(); 

                }
                break;
            case 55 :
                // InternalOptimizationLexer.g:1:714: Input
                {
                mInput(); 

                }
                break;
            case 56 :
                // InternalOptimizationLexer.g:1:720: Medium
                {
                mMedium(); 

                }
                break;
            case 57 :
                // InternalOptimizationLexer.g:1:727: Mvapch
                {
                mMvapch(); 

                }
                break;
            case 58 :
                // InternalOptimizationLexer.g:1:734: Nvidia
                {
                mNvidia(); 

                }
                break;
            case 59 :
                // InternalOptimizationLexer.g:1:741: Opencl
                {
                mOpencl(); 

                }
                break;
            case 60 :
                // InternalOptimizationLexer.g:1:748: Openmp
                {
                mOpenmp(); 

                }
                break;
            case 61 :
                // InternalOptimizationLexer.g:1:755: Simple
                {
                mSimple(); 

                }
                break;
            case 62 :
                // InternalOptimizationLexer.g:1:762: Tuner
                {
                mTuner(); 

                }
                break;
            case 63 :
                // InternalOptimizationLexer.g:1:768: Block
                {
                mBlock(); 

                }
                break;
            case 64 :
                // InternalOptimizationLexer.g:1:774: Cifar
                {
                mCifar(); 

                }
                break;
            case 65 :
                // InternalOptimizationLexer.g:1:780: Data
                {
                mData(); 

                }
                break;
            case 66 :
                // InternalOptimizationLexer.g:1:785: Glow
                {
                mGlow(); 

                }
                break;
            case 67 :
                // InternalOptimizationLexer.g:1:790: Image
                {
                mImage(); 

                }
                break;
            case 68 :
                // InternalOptimizationLexer.g:1:796: Keras
                {
                mKeras(); 

                }
                break;
            case 69 :
                // InternalOptimizationLexer.g:1:802: Large
                {
                mLarge(); 

                }
                break;
            case 70 :
                // InternalOptimizationLexer.g:1:808: Mnist
                {
                mMnist(); 

                }
                break;
            case 71 :
                // InternalOptimizationLexer.g:1:814: Mpich
                {
                mMpich(); 

                }
                break;
            case 72 :
                // InternalOptimizationLexer.g:1:820: Mxnet
                {
                mMxnet(); 

                }
                break;
            case 73 :
                // InternalOptimizationLexer.g:1:826: Power
                {
                mPower(); 

                }
                break;
            case 74 :
                // InternalOptimizationLexer.g:1:832: Size
                {
                mSize(); 

                }
                break;
            case 75 :
                // InternalOptimizationLexer.g:1:837: Small
                {
                mSmall(); 

                }
                break;
            case 76 :
                // InternalOptimizationLexer.g:1:843: Type
                {
                mType(); 

                }
                break;
            case 77 :
                // InternalOptimizationLexer.g:1:848: Cntk
                {
                mCntk(); 

                }
                break;
            case 78 :
                // InternalOptimizationLexer.g:1:853: Cray
                {
                mCray(); 

                }
                break;
            case 79 :
                // InternalOptimizationLexer.g:1:858: Etl
                {
                mEtl(); 

                }
                break;
            case 80 :
                // InternalOptimizationLexer.g:1:862: Fpga
                {
                mFpga(); 

                }
                break;
            case 81 :
                // InternalOptimizationLexer.g:1:867: None
                {
                mNone(); 

                }
                break;
            case 82 :
                // InternalOptimizationLexer.g:1:872: Xla
                {
                mXla(); 

                }
                break;
            case 83 :
                // InternalOptimizationLexer.g:1:876: Amd
                {
                mAmd(); 

                }
                break;
            case 84 :
                // InternalOptimizationLexer.g:1:880: Arm
                {
                mArm(); 

                }
                break;
            case 85 :
                // InternalOptimizationLexer.g:1:884: Hpc
                {
                mHpc(); 

                }
                break;
            case 86 :
                // InternalOptimizationLexer.g:1:888: Mpi
                {
                mMpi(); 

                }
                break;
            case 87 :
                // InternalOptimizationLexer.g:1:892: Pgi
                {
                mPgi(); 

                }
                break;
            case 88 :
                // InternalOptimizationLexer.g:1:896: X86
                {
                mX86(); 

                }
                break;
            case 89 :
                // InternalOptimizationLexer.g:1:900: Comma
                {
                mComma(); 

                }
                break;
            case 90 :
                // InternalOptimizationLexer.g:1:906: FullStop
                {
                mFullStop(); 

                }
                break;
            case 91 :
                // InternalOptimizationLexer.g:1:915: Colon
                {
                mColon(); 

                }
                break;
            case 92 :
                // InternalOptimizationLexer.g:1:921: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 93 :
                // InternalOptimizationLexer.g:1:934: RULE_EXT_INT
                {
                mRULE_EXT_INT(); 

                }
                break;
            case 94 :
                // InternalOptimizationLexer.g:1:947: RULE_QUALIFIED_NAME
                {
                mRULE_QUALIFIED_NAME(); 

                }
                break;
            case 95 :
                // InternalOptimizationLexer.g:1:967: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 96 :
                // InternalOptimizationLexer.g:1:976: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 97 :
                // InternalOptimizationLexer.g:1:988: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 98 :
                // InternalOptimizationLexer.g:1:1004: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 99 :
                // InternalOptimizationLexer.g:1:1020: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 100 :
                // InternalOptimizationLexer.g:1:1028: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\24\37\3\uffff\1\134\5\37\100\uffff\1\134\11\uffff\1\u00ae\1\u00af\4\uffff\1\u00b4\41\uffff\1\u00d8\24\uffff\1\u00ed\1\u00ee\40\uffff\1\u010d\1\uffff\1\u010f\4\uffff\1\u0113\14\uffff\1\u0121\16\uffff\1\u0130\17\uffff\1\u013d\5\uffff\1\u0144\4\uffff\1\u0148\10\uffff\1\u0150\16\uffff\1\u015d\1\u015e\1\u015f\10\uffff\1\u0166\3\uffff\1\u016a\2\uffff\1\u016c\1\uffff\1\u0121\25\uffff\1\u017f\7\uffff\1\u0184\3\uffff\1\u0187\4\uffff\1\u018d\1\u018e\1\uffff\1\u0190\1\u0191\32\uffff\1\u01a6\2\uffff\1\u01a9\20\uffff\1\u01b7\1\u01b8\23\uffff\1\u01c8\13\uffff\1\u01d2\21\uffff\1\u01e1\72\uffff\1\u020e\2\uffff\1\u0211\20\uffff\1\u0220\2\uffff\1\u0223\15\uffff\1\u0230\30\uffff\1\u0243\36\uffff\1\u0261\33\uffff\1\u0278\7\uffff\1\u027b\1\uffff";
    static final String DFA14_eofS =
        "\u027c\uffff";
    static final String DFA14_minS =
        "\1\0\24\56\3\uffff\1\60\1\101\1\56\2\0\1\52\2\uffff\7\56\1\uffff\61\56\5\uffff\1\60\4\uffff\113\56\2\uffff\4\56\1\uffff\26\56\1\uffff\14\56\1\uffff\23\56\3\uffff\20\56\1\uffff\4\56\1\uffff\10\56\1\uffff\1\56\1\uffff\3\56\1\uffff\15\56\1\uffff\2\56\1\uffff\11\56\1\uffff\1\56\1\uffff\14\56\1\uffff\6\56\2\uffff\2\56\1\uffff\3\56\1\uffff\1\56\1\uffff\1\56\1\uffff\14\56\3\uffff\2\56\1\uffff\3\56\1\uffff\3\56\1\uffff\1\56\1\uffff\22\56\1\uffff\2\56\1\uffff\1\56\1\uffff\2\56\1\uffff\5\56\2\uffff\1\56\2\uffff\7\56\1\uffff\4\56\1\55\7\56\1\uffff\2\56\1\uffff\15\56\2\uffff\4\56\1\uffff\2\56\2\uffff\3\56\1\141\1\uffff\1\56\3\uffff\2\56\1\uffff\4\56\1\uffff\2\56\2\uffff\11\56\3\uffff\3\56\2\uffff\16\56\1\uffff\6\56\1\uffff\1\56\1\uffff\16\56\1\uffff\1\55\1\56\1\uffff\16\56\1\uffff\1\153\2\uffff\14\56\5\uffff\12\56\1\uffff\1\56\1\55\1\56\1\uffff\10\56\1\155\1\uffff\11\56\1\160\1\uffff\6\56\1\uffff\1\56\1\uffff\1\145\4\56\3\uffff\1\156\3\56\1\uffff\1\141\3\56\3\uffff\1\56\2\uffff\2\56\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\24\172\3\uffff\1\145\2\172\2\uffff\1\57\2\uffff\7\172\1\uffff\61\172\5\uffff\1\145\4\uffff\113\172\2\uffff\4\172\1\uffff\26\172\1\uffff\14\172\1\uffff\23\172\3\uffff\20\172\1\uffff\4\172\1\uffff\10\172\1\uffff\1\172\1\uffff\3\172\1\uffff\15\172\1\uffff\2\172\1\uffff\11\172\1\uffff\1\172\1\uffff\14\172\1\uffff\6\172\2\uffff\2\172\1\uffff\3\172\1\uffff\1\172\1\uffff\1\172\1\uffff\14\172\3\uffff\2\172\1\uffff\3\172\1\uffff\3\172\1\uffff\1\172\1\uffff\22\172\1\uffff\2\172\1\uffff\1\172\1\uffff\2\172\1\uffff\5\172\2\uffff\1\172\2\uffff\7\172\1\uffff\14\172\1\uffff\2\172\1\uffff\15\172\2\uffff\4\172\1\uffff\2\172\2\uffff\3\172\1\150\1\uffff\1\172\3\uffff\2\172\1\uffff\4\172\1\uffff\2\172\2\uffff\11\172\3\uffff\3\172\2\uffff\16\172\1\uffff\6\172\1\uffff\1\172\1\uffff\16\172\1\uffff\2\172\1\uffff\16\172\1\uffff\1\164\2\uffff\14\172\5\uffff\12\172\1\uffff\3\172\1\uffff\10\172\1\157\1\uffff\11\172\1\160\1\uffff\6\172\1\uffff\1\172\1\uffff\1\145\4\172\3\uffff\1\156\3\172\1\uffff\1\155\3\172\3\uffff\1\172\2\uffff\2\172\1\uffff";
    static final String DFA14_acceptS =
        "\25\uffff\1\131\1\132\1\133\6\uffff\1\143\1\144\7\uffff\1\136\61\uffff\1\131\1\132\1\133\1\137\1\135\1\uffff\1\140\1\141\1\142\1\143\113\uffff\1\123\1\124\4\uffff\1\127\26\uffff\1\117\14\uffff\1\126\23\uffff\1\122\1\130\1\125\20\uffff\1\101\4\uffff\1\112\10\uffff\1\116\1\uffff\1\115\3\uffff\1\121\15\uffff\1\134\2\uffff\1\114\11\uffff\1\102\1\uffff\1\120\14\uffff\1\111\6\uffff\1\103\1\67\2\uffff\1\113\3\uffff\1\65\1\uffff\1\64\1\uffff\1\100\14\uffff\1\106\1\107\1\110\2\uffff\1\76\3\uffff\1\77\3\uffff\1\105\1\uffff\1\104\22\uffff\1\75\2\uffff\1\56\1\uffff\1\66\2\uffff\1\72\5\uffff\1\74\1\73\1\uffff\1\70\1\71\7\uffff\1\57\14\uffff\1\62\2\uffff\1\63\15\uffff\1\60\1\61\4\uffff\1\51\2\uffff\1\54\1\55\4\uffff\1\42\1\uffff\1\50\1\40\1\41\2\uffff\1\47\4\uffff\1\53\2\uffff\1\44\1\45\11\uffff\1\43\1\52\1\46\3\uffff\1\7\1\26\16\uffff\1\36\6\uffff\1\33\1\uffff\1\34\16\uffff\1\37\2\uffff\1\32\16\uffff\1\35\1\uffff\1\25\1\30\14\uffff\1\31\1\27\1\1\1\6\1\13\12\uffff\1\23\3\uffff\1\24\11\uffff\1\22\12\uffff\1\12\6\uffff\1\20\1\uffff\1\21\5\uffff\1\15\1\16\1\17\4\uffff\1\14\4\uffff\1\2\1\3\1\4\1\uffff\1\10\1\11\2\uffff\1\5";
    static final String DFA14_specialS =
        "\1\1\32\uffff\1\0\1\2\u025f\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\4\37\1\25\1\37\1\26\1\35\12\30\1\27\6\37\32\32\3\37\1\31\1\32\1\37\1\1\1\15\1\7\1\4\1\10\1\22\1\20\1\24\1\5\1\32\1\21\1\16\1\13\1\11\1\12\1\2\1\32\1\3\1\6\1\14\1\32\1\17\1\32\1\23\2\32\uff85\37",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\43\2\47\1\44\2\47\1\40\3\47\1\45\2\47\1\41\1\47\1\46\2\47\1\42\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\50\5\47\1\54\7\47\1\53\2\47\1\51\6\47\1\52\1\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\55\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\57\7\47\1\56\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\60\1\61\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\62\5\47\1\63\3\47\1\64\15\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\67\7\47\1\71\4\47\1\72\1\65\1\66\1\47\1\70\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\73\5\47\1\74\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\77\5\47\1\75\1\76\4\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\100\15\47\1\101\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\102\10\47\1\104\1\47\1\105\5\47\1\103\1\47\1\106\2\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\110\14\47\1\107\2\47\1\111\3\47\1\112\1\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\113\7\47\1\114\2\47\1\115\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\120\7\47\1\117\5\47\1\116\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\121\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\122\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\123\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\125\16\47\1\124\12\47",
            "\1\47\1\uffff\10\47\1\127\1\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\126\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\130\12\47",
            "",
            "",
            "",
            "\12\136\13\uffff\1\135\37\uffff\1\135",
            "\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\0\137",
            "\0\137",
            "\1\140\4\uffff\1\141",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\143\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\144\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\145\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\146\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\147\24\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\150\26\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\151\15\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\152\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\153\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\154\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\155\3\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\156\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\160\5\47\1\157\11\47\1\161\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\162\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\163\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\164\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\165\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\166\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\167\14\47\1\170",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\171\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\173\1\174\3\47\1\172\2\47\1\175\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\176\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\177\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0081\3\47\1\u0080\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u0082\24\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0083\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0084\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0085\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u0086\15\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0087\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0088\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\11\47\1\u0089\20\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u008b\16\47\1\u008a\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u008d\16\47\1\u008c\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u008e\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u008f\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0090\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0091\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0092\23\47\1\u0093\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0094\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0095\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u0096\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0098\17\47\1\u0097\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u0099\23\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u009a\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u009b\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u009c\30\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u009e\6\47\1\u009d\1\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u009f\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00a0\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00a1\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u00a2\23\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00a3\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00a4\31\47",
            "\1\47\1\uffff\6\47\1\u00a5\3\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00a6\27\47",
            "",
            "",
            "",
            "",
            "",
            "\12\136\13\uffff\1\135\37\uffff\1\135",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u00a7\2\47\1\u00a8\12\47\1\u00a9\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u00aa\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00ab\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u00ac\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00ad\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00b0\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u00b1\24\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00b2\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00b3\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00b5\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00b6\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00b7\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00b8\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00b9\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u00ba\23\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u00bb\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00bc\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u00bd\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00be\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00bf\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00c0\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u00c1\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u00c2\24\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00c3\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u00c4\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u00c5\22\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00c6\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u00c7\1\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00c8\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12\47\1\u00c9\17\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u00ca\30\47",
            "\1\47\1\uffff\12\47\1\u00cb\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u00cc\30\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u00cd\26\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00ce\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00cf\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u00d1\1\uffff\10\47\1\u00d0\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00d2\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00d3\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00d4\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u00d5\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00d6\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00d7\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00d9\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00da\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00db\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00dc\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00dd\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00de\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00df\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12\47\1\u00e0\17\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u00e1\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00e2\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00e3\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00e4\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00e5\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u00e6\23\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00e7\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\u00e8\3\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00e9\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00ea\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00eb\7\47",
            "\1\47\1\uffff\12\47\1\u00ec\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00ef\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00f0\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00f1\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00f2\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00f3\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00f4\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00f5\14\47",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00f6\1\u00f7\15\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00f8\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00f9\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00fa\10\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u00fb\24\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u00fc\15\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00fd\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00fe\10\47",
            "\1\47\1\uffff\12\47\1\u00ff\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0100\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0101\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0102\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0103\16\47",
            "\1\47\1\uffff\12\47\1\u0104\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0105\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u0106\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0107\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0108\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0109\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u010a\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u010b\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u010c\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u010e\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0110\16\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0111\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0112\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0114\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u0115\15\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u0116\30\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0117\1\47\1\u0119\11\47\1\u0118\15\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u011a\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u011b\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u011c\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u011d\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u011e\22\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u011f\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0120\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0122\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0123\10\47",
            "\1\47\1\uffff\12\47\1\u0124\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0125\26\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0126\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0127\26\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12\47\1\u0128\17\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0129\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u012a\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u012b\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u012c\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u012d\21\47",
            "\1\47\1\uffff\12\47\1\u012e\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u012f\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0131\25\47",
            "",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0132\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u0133\24\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0134\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u0135\1\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u0136\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u0137\1\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0138\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0139\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u013a\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u013b\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u013c\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u013e\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u013f\15\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0140\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0141\21\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u0142\1\uffff\15\47\1\u0143\14\47",
            "\1\47\1\uffff\12\47\1\u0145\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0146\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0147\25\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0149\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u014a\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u014b\23\47",
            "\1\47\1\uffff\12\47\1\u014c\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u014d\1\47",
            "\1\47\1\uffff\12\47\1\u014e\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u014f\31\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0151\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0152\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0153\31\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0154\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0155\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u0156\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0157\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u0158\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0159\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u015a\23\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u015b\15\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u015c\22\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0160\16\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0161\10\47",
            "\1\47\1\uffff\12\47\1\u0162\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0163\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0164\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0165\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0167\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0168\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0169\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u016b\13\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u016d\15\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u016e\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u016f\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u0170\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0171\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u0172\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0173\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0174\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0175\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0176\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u0177\22\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0178\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0179\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u017a\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u017b\30\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u017c\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u017d\25\47",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u017e\23\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u0180\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0181\25\47",
            "\1\47\1\uffff\12\47\1\u0182\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u0183\12\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u0185\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u0186\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u0188\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\31\47\1\u0189",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u018a\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u018b\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u018c\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u018f\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0192\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u0193\24\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0194\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0195\26\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0196\6\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0197\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u0198\1\47",
            "\1\47\1\uffff\12\47\1\u0199\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u019a\14\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u019b\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u019c\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u019d\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u019e\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01a0\3\47\1\u019f\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01a1\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u01a2\1\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u01a3\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01a4\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u01a5\22\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01a7\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01a8\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u01aa\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u01ab\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01ac\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u01ad\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u01ae\30\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u01af\10\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01b0\25\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01b1\15\47\1\u01b2\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01b3\13\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u01b4\26\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01b5\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u01b6\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u01b9\1\uffff\32\47",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01ba\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u01bb\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01bc\31\47",
            "\1\47\1\uffff\12\47\1\u01bd\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01be\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01bf\14\47",
            "\1\47\1\uffff\12\47\1\u01c0\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\1\u01c1\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\u01c2\3\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01c3\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u01c4\21\47",
            "\1\u01c5\1\47\1\uffff\12\47\1\u01c6\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01c7\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\1\u01c9\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\1\u01ca\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u01cb\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u01cc\10\47",
            "\1\47\1\uffff\12\47\1\u01cd\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u01ce\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u01cf\26\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01d0\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01d1\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01d3\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01d4\7\47",
            "\1\47\1\uffff\12\47\1\u01d5\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\1\u01d6\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u01d7\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u01d8\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u01d9\24\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01da\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01db\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u01dc\26\47",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01dd\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u01de\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01df\13\47",
            "\1\47\1\uffff\12\47\1\u01e0\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\1\u01e2\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01e3\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01e4\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01e5\14\47",
            "\1\u01e6\6\uffff\1\u01e7",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u01e8\23\47",
            "",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01e9\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01ea\7\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01eb\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01ec\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01ed\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01ee\7\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u01ef\24\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u01f0\27\47",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01f1\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01f2\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u01f3\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01f4\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u01f5\21\47",
            "\1\47\1\uffff\12\47\1\u01f6\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u01f7\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01f8\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\u01f9\3\47",
            "",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u01fa\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u01fb\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u01fc\23\47",
            "",
            "",
            "\1\47\1\uffff\12\47\1\u01fd\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01fe\31\47",
            "\1\47\1\uffff\12\47\1\u01ff\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u0200\15\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0201\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0202\26\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0203\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u0204\24\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0205\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0206\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u0207\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0209\22\47\1\u0208\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u020a\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u020b\13\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\31\47\1\u020c",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u020d\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12\47\1\u020f\17\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0210\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0212\6\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0213\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0214\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u0215\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0216\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0217\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0218\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0219\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u021a\30\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u021b\22\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u021c\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u021d\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u021e\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u021f\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0221\1\47\1\uffff\12\47\1\u0222\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0224\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0225\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0226\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0227\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u0228\24\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0229\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u022a\12\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u022b\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u022c\5\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u022d\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u022e\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u022f\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\1\u0231\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u0234\4\uffff\1\u0233\3\uffff\1\u0232",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0235\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0236\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0237\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0238\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0239\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u023a\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u023b\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u023c\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u023d\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u023e\25\47",
            "\1\47\1\uffff\12\47\1\u023f\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0240\21\47",
            "",
            "",
            "",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0241\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\u0242\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0244\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0245\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0246\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0247\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0248\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0249\16\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u024a\31\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u024b\13\47",
            "\1\u024c\1\47\1\uffff\12\47\1\u024d\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u024e\16\47",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u024f\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0250\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0251\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0252\13\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0253\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0254\26\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0255\26\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0256\14\47",
            "\1\u0258\1\uffff\1\u0257",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0259\25\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u025a\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u025b\6\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u025c\27\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u025d\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u025e\23\47",
            "\1\47\1\uffff\12\47\1\u025f\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0260\7\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\u0262",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0263\31\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0264\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0265\21\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u0266\1\47",
            "\1\47\1\uffff\12\47\1\u0267\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\1\u0268\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\47\1\uffff\12\47\1\u0269\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "\1\u026a",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u026b\10\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u026c\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u026d\13\47",
            "\1\47\1\uffff\12\47\1\u026e\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\u026f",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0270\14\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u0271\23\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0272\14\47",
            "",
            "\1\u0273\1\uffff\1\u0274\11\uffff\1\u0275",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0276\21\47",
            "\1\47\1\uffff\12\47\1\u0277\6\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
            "",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0279\14\47",
            "",
            "",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u027a\23\47",
            "\1\47\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
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
            return "1:1: Tokens : ( Ai_frameworkTensorflow | ParallelisationOpenacc | ParallelisationOpencl | ParallelisationOpenmp | Reinforncement_learning | Ai_frameworkPytorch | App_typeAi_training | Distributed_training | Image_classification | ParallelisationMpi | Ai_frameworkKeras | Scaling_efficiency | Core_subscription | Enable_autotuning | Number_of_threads | Enable_opt_build | Object_detection | Parallelisation | Number_of_acc | Recommendation | Ai_framework | App_typeHpc | Message_size | Ai_inference | Optimization | Ai_training | Autotuning | Parameters | Translation | Opt_build | Tensorflow | Acc_type | Affinity | App_type | Basedata | Compiler | Cpu_type | Location | Prefetch | Autotune | Backend | Big_data | Imagenet | Library | Version | Config | Layers | Openacc | Openmpi | Pytorch | Restart | Cache | Count | Cresta | Input | Medium | Mvapch | Nvidia | Opencl | Openmp | Simple | Tuner | Block | Cifar | Data | Glow | Image | Keras | Large | Mnist | Mpich | Mxnet | Power | Size | Small | Type | Cntk | Cray | Etl | Fpga | None | Xla | Amd | Arm | Hpc | Mpi | Pgi | X86 | Comma | FullStop | Colon | RULE_BOOLEAN | RULE_EXT_INT | RULE_QUALIFIED_NAME | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFF')) ) {s = 95;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='a') ) {s = 1;}

                        else if ( (LA14_0=='p') ) {s = 2;}

                        else if ( (LA14_0=='r') ) {s = 3;}

                        else if ( (LA14_0=='d') ) {s = 4;}

                        else if ( (LA14_0=='i') ) {s = 5;}

                        else if ( (LA14_0=='s') ) {s = 6;}

                        else if ( (LA14_0=='c') ) {s = 7;}

                        else if ( (LA14_0=='e') ) {s = 8;}

                        else if ( (LA14_0=='n') ) {s = 9;}

                        else if ( (LA14_0=='o') ) {s = 10;}

                        else if ( (LA14_0=='m') ) {s = 11;}

                        else if ( (LA14_0=='t') ) {s = 12;}

                        else if ( (LA14_0=='b') ) {s = 13;}

                        else if ( (LA14_0=='l') ) {s = 14;}

                        else if ( (LA14_0=='v') ) {s = 15;}

                        else if ( (LA14_0=='g') ) {s = 16;}

                        else if ( (LA14_0=='k') ) {s = 17;}

                        else if ( (LA14_0=='f') ) {s = 18;}

                        else if ( (LA14_0=='x') ) {s = 19;}

                        else if ( (LA14_0=='h') ) {s = 20;}

                        else if ( (LA14_0==',') ) {s = 21;}

                        else if ( (LA14_0=='.') ) {s = 22;}

                        else if ( (LA14_0==':') ) {s = 23;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 24;}

                        else if ( (LA14_0=='^') ) {s = 25;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='j'||LA14_0=='q'||LA14_0=='u'||LA14_0=='w'||(LA14_0>='y' && LA14_0<='z')) ) {s = 26;}

                        else if ( (LA14_0=='\"') ) {s = 27;}

                        else if ( (LA14_0=='\'') ) {s = 28;}

                        else if ( (LA14_0=='/') ) {s = 29;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 30;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||LA14_0=='-'||(LA14_0>=';' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_28 = input.LA(1);

                        s = -1;
                        if ( ((LA14_28>='\u0000' && LA14_28<='\uFFFF')) ) {s = 95;}

                        else s = 31;

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