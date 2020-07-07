/*
 * generated by Xtext 2.17.1
 */
lexer grammar InternalAADMLexer;

@header {
package org.sodalite.dsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

Valid_source_types : 'valid_source_types:[';

Valid_target_types : 'valid_target_types:[';

Relationship_types : 'relationship_types:';

Capability_types : 'capability_types:';

Greater_or_equal : 'greater_or_equal:';

Interface_types : 'interface_types:';

Artifact_types : 'artifact_types:';

Implementation : 'implementation:';

Node_templates : 'node_templates:';

Get_attribute : 'get_attribute:';

Less_or_equal : 'less_or_equal:';

Capabilities : 'capabilities:';

Derived_from : 'derived_from:';

Entry_schema : 'entry_schema:';

Get_property : 'get_property:';

Greater_than : 'greater_than:';

Occurrences : 'occurrences:[';

Optimization : 'optimization:';

Policy_types : 'policy_types:';

Relationship : 'relationship:';

Requirements : 'requirements:';

Valid_values : 'valid_values:';

Constraints : 'constraints:';

Description : 'description:';

Attributes : 'attributes:';

Capability : 'capability:';

Data_types : 'data_types:';

Interfaces : 'interfaces:';

Max_length : 'max_length:';

Min_length : 'min_length:';

Node_types : 'node_types:';

Operations : 'operations:';

Properties : 'properties:';

Attribute : 'attribute:';

Get_input : 'get_input:';

In_range : 'in_range:[';

Less_than : 'less_than:';

Mime_type : 'mime_type:';

File_ext : 'file_ext:';

Property : 'property:';

Required : 'required:';

Default : 'default:';

Req_cap : 'req_cap:';

Entity : 'entity:';

Inputs : 'inputs:';

Length : 'length:';

Status : 'status:';

Equal : 'equal:';

Value : 'value:';

Node : 'node:';

Type : 'type:';

Comma : ',';

Colon : ':';

LeftSquareBracket : '[';

RightSquareBracket : ']';

RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)+;

RULE_BOOLEAN : ('true'|'false');

RULE_ENTITY : ('SELF'|'SOURCE'|'TARGET'|'HOST');

RULE_PRIMITIVE_DATA_TYPE : ('string'|'integer'|'boolean'|'map'|'list'|'range'|'timestamp'|'scalar-unit.frequency'|'scalar-unit.size'|'version-type');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')*;

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
