/*
 * generated by Xtext 2.19.0
 */
lexer grammar InternalOptimizationLexer;

@header {
package org.sodalite.dsl.optimization.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

Reinforncement_learning : 'reinforncement_learning';

Distributed_training : 'distributed_training:';

Image_classification : 'Image_classification';

Scaling_efficiency : 'scaling_efficiency:';

Core_subscription : 'core_subscription:';

Enable_autotuning : 'enable_autotuning:';

Number_of_threads : 'number_of_threads:';

Enable_opt_build : 'enable_opt_build:';

Object_detection : 'object_detection';

Parallelisation : 'parallelisation:';

Number_of_acc : 'number_of_acc:';

Recommendation : 'recommendation';

Ai_framework : 'ai_framework:';

Message_size : 'message_size:';

Optimization : 'optimization:';

AI_Inference : 'AI_Inference';

Ai_training : 'ai_training:';

AI_Training : 'AI_Training';

Constraint : 'Constraint:';

FPGAXilinx : 'FPGA-Xilinx';

NVIDIAV100 : 'NVIDIA-V100';

Autotuning : 'autotuning:';

Parameters : 'parameters:';

Tensorflow : 'tensorflow:';

Translation : 'translation';

TensorFlow : 'TensorFlow';

Opt_build : 'opt_build:';

Acc_type : 'acc_type:';

Affinity : 'affinity:';

App_type : 'app_type:';

Basedata : 'basedata:';

Compiler : 'compiler:';

Cpu_type : 'cpu_type:';

Location : 'location:';

Prefetch : 'prefetch:';

AMDM100 : 'AMD-M100';

AUTOTUNE : 'AUTOTUNE';

Imagenet : 'Imagenet';

Intelx86 : 'Intelx86';

Backend : 'backend:';

Library : 'library:';

Openacc : 'openacc:';

PyTorch_1 : 'pyTorch:';

Version : 'version:';

BigData : 'BigData';

OPENACC : 'OPENACC';

PyTorch : 'PyTorch';

RESTART : 'RESTART';

Config : 'config:';

Layers : 'layers:';

Opencl : 'opencl:';

Openmp : 'openmp:';

CREATA : 'CREATA';

OPENCL : 'OPENCL';

OPENMP : 'OPENMP';

Cache : 'cache:';

Count : 'count:';

Input : 'input:';

Keras_1 : 'keras:';

Medium : 'medium';

Mvapch : 'mvapch';

Opnmpi : 'opnmpi';

Simple : 'simple';

Tuner : 'tuner:';

CIFAR : 'CIFAR';

IMAGE : 'IMAGE';

Keras : 'Keras';

MNIST : 'MNIST';

MXNet : 'MXNet';

Power : 'Power';

Block : 'block';

Data : 'data:';

Glow : 'glow:';

Large : 'large';

Size : 'size:';

Small : 'small';

Type : 'type:';

CNTK : 'CNTK';

Cray : 'cray';

Etl : 'etl:';

Hpc : 'hpc:';

Mpi : 'mpi:';

Xla : 'xla:';

AMD : 'AMD';

ARM : 'ARM';

HPC : 'HPC';

MPI : 'MPI';

Pgi : 'pgi';

LeftParenthesis : '(';

RightParenthesis : ')';

Comma : ',';

FullStop : '.';

RULE_BT : '>';

RULE_LT : '<';

RULE_BET : '>=';

RULE_LET : '<=';

RULE_EQUAL : '==';

RULE_NOT_EQUAL : '!=';

RULE_OR : 'OR';

RULE_AND : 'AND';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_BOOLEAN : ('true'|'false');

RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
