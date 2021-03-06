/*
 * generated by Xtext 2.22.0
 */
lexer grammar InternalOptimizationLexer;

@header {
package org.sodalite.dsl.optimization.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

Ai_frameworkTensorflow : 'ai_framework-tensorflow:';

ParallelisationOpenacc : 'parallelisation-openacc:';

ParallelisationOpencl : 'parallelisation-opencl:';

ParallelisationOpenmp : 'parallelisation-openmp:';

Reinforncement_learning : 'reinforncement_learning';

Ai_frameworkPytorch : 'ai_framework-pytorch:';

App_typeAi_training : 'app_type-ai_training:';

Distributed_training : 'distributed_training:';

Image_classification : 'image_classification';

ParallelisationMpi : 'parallelisation-mpi:';

Ai_frameworkKeras : 'ai_framework-keras:';

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

App_typeHpc : 'app_type-hpc:';

Message_size : 'message_size:';

Ai_inference : 'ai_inference';

Optimization : 'optimization';

Ai_training : 'ai_training';

Autotuning : 'autotuning:';

Parameters : 'parameters:';

Translation : 'translation';

Opt_build : 'opt_build:';

Tensorflow : 'tensorflow';

Acc_type : 'acc_type:';

Affinity : 'affinity:';

App_type : 'app_type:';

Basedata : 'basedata:';

Compiler : 'compiler:';

Cpu_type : 'cpu_type:';

Location : 'location:';

Prefetch : 'prefetch:';

Autotune : 'autotune';

Backend : 'backend:';

Big_data : 'big_data';

Imagenet : 'imagenet';

Library : 'library:';

Version : 'version:';

Config : 'config:';

Layers : 'layers:';

Openacc : 'openacc';

Openmpi : 'openmpi';

Pytorch : 'pytorch';

Restart : 'restart';

Cache : 'cache:';

Count : 'count:';

Cresta : 'cresta';

Input : 'input:';

Medium : 'medium';

Mvapch : 'mvapch';

Nvidia : 'nvidia';

Opencl : 'opencl';

Openmp : 'openmp';

Simple : 'simple';

Tuner : 'tuner:';

Block : 'block';

Cifar : 'cifar';

Data : 'data:';

Glow : 'glow:';

Image : 'image';

Keras : 'keras';

Large : 'large';

Mnist : 'mnist';

Mpich : 'mpich';

Mxnet : 'mxnet';

Power : 'power';

Size : 'size:';

Small : 'small';

Type : 'type:';

Cntk : 'cntk';

Cray : 'cray';

Etl : 'etl:';

Fpga : 'fpga';

None : 'none';

Xla : 'xla:';

Amd : 'amd';

Arm : 'arm';

Hpc : 'hpc';

Mpi : 'mpi';

Pgi : 'pgi';

X86 : 'x86';

FullStop : '.';

Colon : ':';

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_BOOLEAN : ('true'|'false');

RULE_EXT_INT : RULE_INT ('e'|'E') ('-'|'+') RULE_INT;

RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)+;

fragment RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
