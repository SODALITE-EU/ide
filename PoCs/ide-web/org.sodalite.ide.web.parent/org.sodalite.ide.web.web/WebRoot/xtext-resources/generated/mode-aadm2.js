define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "lparen", regex: "[\\[]"},
				{token: "rparen", regex: "[\\]]"},
				{token: "keyword", regex: "(get_input:)"},
				{token: "keyword", regex: "(description:)"},
				{token: "keyword", regex: "(module:)"},
				{token: "keyword", regex: "(import:)"},
				{token: "keyword", regex: "(node_templates:)"},
				{token: "keyword", regex: "(type:)"},
				{token: "keyword", regex: "(properties:)"},
				{token: "keyword", regex: "(requirements:)"},
				{token: "keyword", regex: "(node:)"},
				{token: "keyword", regex: "(policies:)"},
				{token: "keyword", regex: "(outputs:)"},
				{token: "keyword", regex: "(targets:)"},
				{token: "keyword", regex: "(triggers:)"},
				{token: "keyword", regex: "(event:)"},
				{token: "keyword", regex: "(schedule:)"},
				{token: "keyword", regex: "(target_filter:)"},
				{token: "keyword", regex: "(condition:)"},
				{token: "keyword", regex: "(action:)"},
				{token: "keyword", regex: "(call_operation:)"},
				{token: "keyword", regex: "(operation:)"},
				{token: "keyword", regex: "(start_time:)"},
				{token: "keyword", regex: "(end_time:)"},
				{token: "keyword", regex: "(requirement:)"},
				{token: "keyword", regex: "(capability:)"},
				{token: "keyword", regex: "(constraint:)"},
				{token: "keyword", regex: "(period:)"},
				{token: "keyword", regex: "(evaluations:)"},
				{token: "keyword", regex: "(method:)"},
				{token: "keyword", regex: "(and:)"},
				{token: "keyword", regex: "(or:)"},
				{token: "keyword", regex: "(not:)"},
				{token: "keyword", regex: "(max_length:)"},
				{token: "keyword", regex: "(min_length:)"},
				{token: "keyword", regex: "(length:)"},
				{token: "keyword", regex: "(valid_values:)"},
				{token: "keyword", regex: "(in_range:)"},
				{token: "keyword", regex: "(less_or_equal:)"},
				{token: "keyword", regex: "(less_than:)"},
				{token: "keyword", regex: "(greater_or_equal:)"},
				{token: "keyword", regex: "(greater_than:)"},
				{token: "keyword", regex: "(equal:)"},
				{token: "keyword", regex: "(attributes:)"},
				{token: "keyword", regex: "(capabilities:)"},
				{token: "keyword", regex: "(value:)"},
				{token: "keyword", regex: "(default:)"},
				{token: "keyword", regex: "(get_attribute:)"},
				{token: "keyword", regex: "(attribute:)"},
				{token: "keyword", regex: "(entity:)"},
				{token: "keyword", regex: "(req_cap:)"},
				{token: "keyword", regex: "(get_property:)"},
				{token: "keyword", regex: "(property:)"},
				{token: "keyword", regex: "(inputs:)"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/aadm";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
