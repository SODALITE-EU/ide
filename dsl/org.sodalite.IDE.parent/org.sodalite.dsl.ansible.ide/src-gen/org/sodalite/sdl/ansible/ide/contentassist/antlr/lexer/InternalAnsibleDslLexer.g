/*
 * generated by Xtext 2.22.0
 */
lexer grammar InternalAnsibleDslLexer;

@header {
package org.sodalite.sdl.ansible.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

External_file_inclusion : 'external_file_inclusion:';

Asynchronous_settings : 'asynchronous_settings:';

Privilege_escalation : 'privilege_escalation:';

Max_fail_percentage : 'max_fail_percentage:';

Registered_variable : 'registered_variable:';

Ignore_unreachable : 'ignore_unreachable:';

Declared_variable : 'declared_variable:';

Index_or_loop_var : 'index_or_loop_var:';

Play_exe_settings : 'play_exe_settings:';

Any_errors_fatal : 'any_errors_fatal:';

Block_to_execute : 'block_to_execute:';

Direct_parameter : 'direct_parameter:';

Roles_inclusions : 'roles_inclusions:';

Special_variable : 'special_variable:';

Connection_info : 'connection_info:';

Delay_attribute : 'delay_attribute:';

Import_playbook : 'import_playbook:';

Interface_input : 'interface_input:';

Module_defaults : 'module_defaults:';

Operation_input : 'operation_input:';

Task_to_execute : 'task_to_execute:';

Until_condition : 'until_condition:';

Validation_mode : 'validation_mode:';

Delegate_facts : 'delegate_facts:';

Error_handling : 'error_handling:';

Facts_settings : 'facts_settings:';

Force_handlers : 'force_handlers:';

Gather_timeout : 'gather_timeout:';

Line_of_string : 'line_of_string:';

Port_attribute : 'port_attribute:';

Tags_attribute : 'tags_attribute:';

When_condition : 'when_condition:';

Become_method : 'become_method:';

Gather_subset : 'gather_subset:';

Ignore_errors : 'ignore_errors:';

Playbook_name : 'playbook_name:';

Always_tasks : 'always_tasks:';

Become_flags : 'become_flags:';

Changed_when : 'changed_when:';

Exe_settings : 'exe_settings:';

Gather_facts : 'gather_facts:';

Handler_name : 'handler_name:';

Loop_control : 'loop_control:';

Rescue_tasks : 'rescue_tasks:';

Become_user : 'become_user:';

Collections : 'collections:';

Delegate_to : 'delegate_to:';

Environment : 'environment:';

Failed_when : 'failed_when:';

Remote_user : 'remote_user:';

Vars_prompt : 'vars_prompt:';

Become_exe : 'become_exe:';

Block_name : 'block_name:';

Check_mode : 'check_mode:';

Connection : 'connection:';

Delegation : 'delegation:';

Parameters : 'parameters:';

Post_tasks : 'post_tasks:';

Tasks_list : 'tasks_list:';

Vars_files : 'vars_files:';

Fact_path : 'fact_path:';

Index_var : 'index_var:';

Loop_over : 'loop_over:';

Node_type : 'node_type:';

Operation : 'operation:';

Play_name : 'play_name:';

Pre_tasks : 'pre_tasks:';

Role_name : 'role_name:';

Task_name : 'task_name:';

Debugger : 'debugger:';

Extended : 'extended:';

Fact_set : 'fact_set:';

Handlers : 'handlers:';

Loop_var : 'loop_var:';

Register : 'register:';

Run_once : 'run_once:';

Strategy : 'strategy:';

Throttle : 'throttle:';

Handler : 'handler:';

Include : 'include:';

Retries : 'retries:';

Used_by : 'used_by:';

Action : 'action:';

Become : 'become:';

Listen : 'listen:';

Module : 'module:';

No_log : 'no_log:';

Notify : 'notify:';

Serial : 'serial:';

Async : 'async:';

Endfor : 'endfor';

Hosts : 'hosts:';

Label : 'label:';

Order : 'order:';

Pause : 'pause:';

Plays : 'plays:';

Tasks : 'tasks:';

Topic : 'topic:';

Until : 'until:';

Args : 'args:';

Diff : 'diff:';

Endif : 'endif';

Loop : 'loop:';

Play : 'play:';

Poll : 'poll:';

Role : 'role:';

Vars : 'vars:';

When : 'when:';

Elif : 'elif';

Else : 'else';

With : 'with';

And : 'and';

For : 'for';

Not : 'not';

ExclamationMarkEqualsSign : '!=';

PercentSignRightCurlyBracket : '%}';

LeftParenthesisRightParenthesis : '()';

AsteriskAsterisk : '**';

SolidusSolidus : '//';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

GreaterThanSignEqualsSign : '>=';

If : 'if';

In : 'in';

Is : 'is';

Or : 'or';

LeftCurlyBracketPercentSign : '{%';

LeftCurlyBracketLeftCurlyBracket : '{{';

RightCurlyBracketRightCurlyBracket : '}}';

PercentSign : '%';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

Colon : ':';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';

LeftCurlyBracket : '{';

VerticalLine : '|';

RightCurlyBracket : '}';

RULE_BOOLEAN : ('True'|'False'|'true'|'false');

RULE_BOOLEAN_ONLY_ANSIBLE : ('yes'|'no');

RULE_NULL : 'null';

RULE_NONE : 'None';

RULE_OCTAL_NUMBER : ('0o'|'0') ('1'..'7' ('0'..'7')*|'0');

RULE_HEXADECIMAL_NUMBER : '0x' (('1'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F')*|'0');

RULE_SIMPLE_NUMBER : ('+'|'-')? ('1'..'9' ('0'..'9')*|'0') ('.' ('0'..'9')+)?;

RULE_EXPONENTIAL_NUMBER : RULE_SIMPLE_NUMBER ('e'|'E') RULE_SIMPLE_NUMBER;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')*;

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
