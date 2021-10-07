package org.sodalite.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.sodalite.dsl.services.AADMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAADMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Greater_or_equal", "Call_operation", "Node_templates", "Get_attribute", "Less_or_equal", "Target_filter", "Capabilities", "Get_property", "Greater_than", "Requirements", "Valid_values", "Description", "Evaluations", "Requirement", "Attributes", "Capability", "Constraint", "Max_length", "Min_length", "Properties", "Start_time", "Attribute", "Condition", "Get_input", "Less_than", "Operation", "End_time", "In_range", "Policies", "Property", "Schedule", "Triggers", "Default", "Outputs", "Req_cap", "Targets", "Action", "Entity", "Import", "Inputs", "Length", "Method", "Module", "Period", "Equal", "Event", "Value", "Node", "Type", "And", "Not", "Or", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "CommercialAt", "LeftSquareBracket", "RightSquareBracket", "RULE_ID", "RULE_QUALIFIED_NAME", "RULE_BOOLEAN", "RULE_ENTITY", "RULE_VERSION", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Entity=41;
    public static final int Policies=32;
    public static final int Import=42;
    public static final int Or=55;
    public static final int RULE_BEGIN=69;
    public static final int Constraint=20;
    public static final int Node=51;
    public static final int Attributes=18;
    public static final int RULE_BOOLEAN=66;
    public static final int Requirements=13;
    public static final int RULE_VERSION=68;
    public static final int Equal=48;
    public static final int Call_operation=5;
    public static final int RightSquareBracket=63;
    public static final int RULE_QUALIFIED_NAME=65;
    public static final int Capability=19;
    public static final int RULE_ID=64;
    public static final int Less_than=28;
    public static final int Start_time=24;
    public static final int Evaluations=16;
    public static final int Period=47;
    public static final int Triggers=35;
    public static final int Method=45;
    public static final int Greater_or_equal=4;
    public static final int Requirement=17;
    public static final int Not=54;
    public static final int And=53;
    public static final int RULE_INT=71;
    public static final int Outputs=37;
    public static final int Value=50;
    public static final int RULE_ML_COMMENT=73;
    public static final int LeftSquareBracket=62;
    public static final int Less_or_equal=8;
    public static final int Module=46;
    public static final int Greater_than=12;
    public static final int Get_input=27;
    public static final int Node_templates=6;
    public static final int RULE_ENTITY=67;
    public static final int Action=40;
    public static final int RULE_END=70;
    public static final int Description=15;
    public static final int Get_attribute=7;
    public static final int Attribute=25;
    public static final int Get_property=11;
    public static final int Valid_values=14;
    public static final int RULE_STRING=72;
    public static final int Operation=29;
    public static final int Properties=23;
    public static final int RULE_SL_COMMENT=74;
    public static final int Max_length=21;
    public static final int Comma=56;
    public static final int HyphenMinus=57;
    public static final int Solidus=59;
    public static final int Colon=60;
    public static final int EOF=-1;
    public static final int Property=33;
    public static final int Inputs=43;
    public static final int Condition=26;
    public static final int FullStop=58;
    public static final int End_time=30;
    public static final int RULE_WS=75;
    public static final int Targets=39;
    public static final int RULE_ANY_OTHER=76;
    public static final int Req_cap=38;
    public static final int Default=36;
    public static final int CommercialAt=61;
    public static final int In_range=31;
    public static final int Type=52;
    public static final int Target_filter=9;
    public static final int Length=44;
    public static final int Capabilities=10;
    public static final int Schedule=34;
    public static final int Event=49;
    public static final int Min_length=22;

    // delegates
    // delegators


        public InternalAADMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAADMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAADMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAADMParser.g"; }



     	private AADMGrammarAccess grammarAccess;

        public InternalAADMParser(TokenStream input, AADMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AADM_Model";
       	}

       	@Override
       	protected AADMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAADM_Model"
    // InternalAADMParser.g:57:1: entryRuleAADM_Model returns [EObject current=null] : iv_ruleAADM_Model= ruleAADM_Model EOF ;
    public final EObject entryRuleAADM_Model() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAADM_Model = null;


        try {
            // InternalAADMParser.g:57:51: (iv_ruleAADM_Model= ruleAADM_Model EOF )
            // InternalAADMParser.g:58:2: iv_ruleAADM_Model= ruleAADM_Model EOF
            {
             newCompositeNode(grammarAccess.getAADM_ModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAADM_Model=ruleAADM_Model();

            state._fsp--;

             current =iv_ruleAADM_Model; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAADM_Model"


    // $ANTLR start "ruleAADM_Model"
    // InternalAADMParser.g:64:1: ruleAADM_Model returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleAADM_Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_module_4_0=null;
        Token otherlv_5=null;
        Token lv_imports_6_0=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token this_END_14=null;
        Token otherlv_15=null;
        Token this_BEGIN_16=null;
        Token this_END_18=null;
        Token otherlv_19=null;
        Token this_BEGIN_20=null;
        Token this_END_22=null;
        EObject lv_inputs_9_0 = null;

        EObject lv_nodeTemplates_13_0 = null;

        EObject lv_policies_17_0 = null;

        EObject lv_outputs_21_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:70:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalAADMParser.g:71:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalAADMParser.g:71:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalAADMParser.g:72:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalAADMParser.g:72:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) ) )+ {...}?) )
            // InternalAADMParser.g:73:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getAADM_ModelAccess().getUnorderedGroup());
            			
            // InternalAADMParser.g:76:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) ) )+ {...}?)
            // InternalAADMParser.g:77:5: ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalAADMParser.g:77:5: ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=8;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == Module && getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 == Import && getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 == Inputs && getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 3) ) {
                    alt2=4;
                }
                else if ( LA2_0 == Node_templates && getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 4) ) {
                    alt2=5;
                }
                else if ( LA2_0 == Policies && getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 5) ) {
                    alt2=6;
                }
                else if ( LA2_0 == Outputs && getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 6) ) {
                    alt2=7;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAADMParser.g:78:3: ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:78:3: ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAADMParser.g:79:4: {...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAADMParser.g:79:104: ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) )
            	    // InternalAADMParser.g:80:5: ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAADMParser.g:83:8: ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) )
            	    // InternalAADMParser.g:83:9: {...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "true");
            	    }
            	    // InternalAADMParser.g:83:18: (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) )
            	    // InternalAADMParser.g:83:19: otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Description,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getAADM_ModelAccess().getDescriptionKeyword_0_0());
            	    							
            	    // InternalAADMParser.g:87:8: ( (lv_description_2_0= RULE_STRING ) )
            	    // InternalAADMParser.g:88:9: (lv_description_2_0= RULE_STRING )
            	    {
            	    // InternalAADMParser.g:88:9: (lv_description_2_0= RULE_STRING )
            	    // InternalAADMParser.g:89:10: lv_description_2_0= RULE_STRING
            	    {
            	    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    										newLeafNode(lv_description_2_0, grammarAccess.getAADM_ModelAccess().getDescriptionSTRINGTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getAADM_ModelRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_2_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAADM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAADMParser.g:111:3: ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:111:3: ({...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) ) )
            	    // InternalAADMParser.g:112:4: {...}? => ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAADMParser.g:112:104: ( ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) ) )
            	    // InternalAADMParser.g:113:5: ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAADMParser.g:116:8: ({...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) ) )
            	    // InternalAADMParser.g:116:9: {...}? => (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "true");
            	    }
            	    // InternalAADMParser.g:116:18: (otherlv_3= Module ( (lv_module_4_0= RULE_ID ) ) )
            	    // InternalAADMParser.g:116:19: otherlv_3= Module ( (lv_module_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,Module,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getAADM_ModelAccess().getModuleKeyword_1_0());
            	    							
            	    // InternalAADMParser.g:120:8: ( (lv_module_4_0= RULE_ID ) )
            	    // InternalAADMParser.g:121:9: (lv_module_4_0= RULE_ID )
            	    {
            	    // InternalAADMParser.g:121:9: (lv_module_4_0= RULE_ID )
            	    // InternalAADMParser.g:122:10: lv_module_4_0= RULE_ID
            	    {
            	    lv_module_4_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    										newLeafNode(lv_module_4_0, grammarAccess.getAADM_ModelAccess().getModuleIDTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getAADM_ModelRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"module",
            	    											lv_module_4_0,
            	    											"org.sodalite.dsl.AADM.ID");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAADM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAADMParser.g:144:3: ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) )
            	    {
            	    // InternalAADMParser.g:144:3: ({...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ ) )
            	    // InternalAADMParser.g:145:4: {...}? => ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAADMParser.g:145:104: ( ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+ )
            	    // InternalAADMParser.g:146:5: ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAADMParser.g:149:8: ({...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==Import) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalAADMParser.g:149:9: {...}? => (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleAADM_Model", "true");
            	    	    }
            	    	    // InternalAADMParser.g:149:18: (otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) ) )
            	    	    // InternalAADMParser.g:149:19: otherlv_5= Import ( (lv_imports_6_0= RULE_ID ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,Import,FOLLOW_5); 

            	    	    								newLeafNode(otherlv_5, grammarAccess.getAADM_ModelAccess().getImportKeyword_2_0());
            	    	    							
            	    	    // InternalAADMParser.g:153:8: ( (lv_imports_6_0= RULE_ID ) )
            	    	    // InternalAADMParser.g:154:9: (lv_imports_6_0= RULE_ID )
            	    	    {
            	    	    // InternalAADMParser.g:154:9: (lv_imports_6_0= RULE_ID )
            	    	    // InternalAADMParser.g:155:10: lv_imports_6_0= RULE_ID
            	    	    {
            	    	    lv_imports_6_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    	    										newLeafNode(lv_imports_6_0, grammarAccess.getAADM_ModelAccess().getImportsIDTerminalRuleCall_2_1_0());
            	    	    									

            	    	    										if (current==null) {
            	    	    											current = createModelElement(grammarAccess.getAADM_ModelRule());
            	    	    										}
            	    	    										addWithLastConsumed(
            	    	    											current,
            	    	    											"imports",
            	    	    											lv_imports_6_0,
            	    	    											"org.sodalite.dsl.AADM.ID");
            	    	    									

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAADM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAADMParser.g:177:3: ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:177:3: ({...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) ) )
            	    // InternalAADMParser.g:178:4: {...}? => ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAADMParser.g:178:104: ( ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) ) )
            	    // InternalAADMParser.g:179:5: ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAADMParser.g:182:8: ({...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END ) )
            	    // InternalAADMParser.g:182:9: {...}? => (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "true");
            	    }
            	    // InternalAADMParser.g:182:18: (otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END )
            	    // InternalAADMParser.g:182:19: otherlv_7= Inputs this_BEGIN_8= RULE_BEGIN ( (lv_inputs_9_0= ruleEInputs ) ) this_END_10= RULE_END
            	    {
            	    otherlv_7=(Token)match(input,Inputs,FOLLOW_6); 

            	    								newLeafNode(otherlv_7, grammarAccess.getAADM_ModelAccess().getInputsKeyword_3_0());
            	    							
            	    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_8, grammarAccess.getAADM_ModelAccess().getBEGINTerminalRuleCall_3_1());
            	    							
            	    // InternalAADMParser.g:190:8: ( (lv_inputs_9_0= ruleEInputs ) )
            	    // InternalAADMParser.g:191:9: (lv_inputs_9_0= ruleEInputs )
            	    {
            	    // InternalAADMParser.g:191:9: (lv_inputs_9_0= ruleEInputs )
            	    // InternalAADMParser.g:192:10: lv_inputs_9_0= ruleEInputs
            	    {

            	    										newCompositeNode(grammarAccess.getAADM_ModelAccess().getInputsEInputsParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_inputs_9_0=ruleEInputs();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAADM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"inputs",
            	    											lv_inputs_9_0,
            	    											"org.sodalite.dsl.AADM.EInputs");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_10=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_10, grammarAccess.getAADM_ModelAccess().getENDTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAADM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAADMParser.g:219:3: ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:219:3: ({...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) ) )
            	    // InternalAADMParser.g:220:4: {...}? => ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAADMParser.g:220:104: ( ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) ) )
            	    // InternalAADMParser.g:221:5: ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAADMParser.g:224:8: ({...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END ) )
            	    // InternalAADMParser.g:224:9: {...}? => (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "true");
            	    }
            	    // InternalAADMParser.g:224:18: (otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END )
            	    // InternalAADMParser.g:224:19: otherlv_11= Node_templates this_BEGIN_12= RULE_BEGIN ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) ) this_END_14= RULE_END
            	    {
            	    otherlv_11=(Token)match(input,Node_templates,FOLLOW_6); 

            	    								newLeafNode(otherlv_11, grammarAccess.getAADM_ModelAccess().getNode_templatesKeyword_4_0());
            	    							
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_12, grammarAccess.getAADM_ModelAccess().getBEGINTerminalRuleCall_4_1());
            	    							
            	    // InternalAADMParser.g:232:8: ( (lv_nodeTemplates_13_0= ruleENodeTemplates ) )
            	    // InternalAADMParser.g:233:9: (lv_nodeTemplates_13_0= ruleENodeTemplates )
            	    {
            	    // InternalAADMParser.g:233:9: (lv_nodeTemplates_13_0= ruleENodeTemplates )
            	    // InternalAADMParser.g:234:10: lv_nodeTemplates_13_0= ruleENodeTemplates
            	    {

            	    										newCompositeNode(grammarAccess.getAADM_ModelAccess().getNodeTemplatesENodeTemplatesParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_nodeTemplates_13_0=ruleENodeTemplates();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAADM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nodeTemplates",
            	    											lv_nodeTemplates_13_0,
            	    											"org.sodalite.dsl.AADM.ENodeTemplates");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_14=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_14, grammarAccess.getAADM_ModelAccess().getENDTerminalRuleCall_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAADM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAADMParser.g:261:3: ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:261:3: ({...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) ) )
            	    // InternalAADMParser.g:262:4: {...}? => ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAADMParser.g:262:104: ( ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) ) )
            	    // InternalAADMParser.g:263:5: ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAADMParser.g:266:8: ({...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END ) )
            	    // InternalAADMParser.g:266:9: {...}? => (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "true");
            	    }
            	    // InternalAADMParser.g:266:18: (otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END )
            	    // InternalAADMParser.g:266:19: otherlv_15= Policies this_BEGIN_16= RULE_BEGIN ( (lv_policies_17_0= ruleEPolicies ) ) this_END_18= RULE_END
            	    {
            	    otherlv_15=(Token)match(input,Policies,FOLLOW_6); 

            	    								newLeafNode(otherlv_15, grammarAccess.getAADM_ModelAccess().getPoliciesKeyword_5_0());
            	    							
            	    this_BEGIN_16=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_16, grammarAccess.getAADM_ModelAccess().getBEGINTerminalRuleCall_5_1());
            	    							
            	    // InternalAADMParser.g:274:8: ( (lv_policies_17_0= ruleEPolicies ) )
            	    // InternalAADMParser.g:275:9: (lv_policies_17_0= ruleEPolicies )
            	    {
            	    // InternalAADMParser.g:275:9: (lv_policies_17_0= ruleEPolicies )
            	    // InternalAADMParser.g:276:10: lv_policies_17_0= ruleEPolicies
            	    {

            	    										newCompositeNode(grammarAccess.getAADM_ModelAccess().getPoliciesEPoliciesParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_policies_17_0=ruleEPolicies();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAADM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"policies",
            	    											lv_policies_17_0,
            	    											"org.sodalite.dsl.AADM.EPolicies");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_18=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_18, grammarAccess.getAADM_ModelAccess().getENDTerminalRuleCall_5_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAADM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAADMParser.g:303:3: ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:303:3: ({...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) ) )
            	    // InternalAADMParser.g:304:4: {...}? => ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAADMParser.g:304:104: ( ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) ) )
            	    // InternalAADMParser.g:305:5: ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getAADM_ModelAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAADMParser.g:308:8: ({...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END ) )
            	    // InternalAADMParser.g:308:9: {...}? => (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAADM_Model", "true");
            	    }
            	    // InternalAADMParser.g:308:18: (otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END )
            	    // InternalAADMParser.g:308:19: otherlv_19= Outputs this_BEGIN_20= RULE_BEGIN ( (lv_outputs_21_0= ruleEOutputs ) ) this_END_22= RULE_END
            	    {
            	    otherlv_19=(Token)match(input,Outputs,FOLLOW_6); 

            	    								newLeafNode(otherlv_19, grammarAccess.getAADM_ModelAccess().getOutputsKeyword_6_0());
            	    							
            	    this_BEGIN_20=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_20, grammarAccess.getAADM_ModelAccess().getBEGINTerminalRuleCall_6_1());
            	    							
            	    // InternalAADMParser.g:316:8: ( (lv_outputs_21_0= ruleEOutputs ) )
            	    // InternalAADMParser.g:317:9: (lv_outputs_21_0= ruleEOutputs )
            	    {
            	    // InternalAADMParser.g:317:9: (lv_outputs_21_0= ruleEOutputs )
            	    // InternalAADMParser.g:318:10: lv_outputs_21_0= ruleEOutputs
            	    {

            	    										newCompositeNode(grammarAccess.getAADM_ModelAccess().getOutputsEOutputsParserRuleCall_6_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_outputs_21_0=ruleEOutputs();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAADM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"outputs",
            	    											lv_outputs_21_0,
            	    											"org.sodalite.dsl.AADM.EOutputs");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_22=(Token)match(input,RULE_END,FOLLOW_4); 

            	    								newLeafNode(this_END_22, grammarAccess.getAADM_ModelAccess().getENDTerminalRuleCall_6_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAADM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAADM_ModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleAADM_Model", "getUnorderedGroupHelper().canLeave(grammarAccess.getAADM_ModelAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getAADM_ModelAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAADM_Model"


    // $ANTLR start "entryRuleEOutputs"
    // InternalAADMParser.g:356:1: entryRuleEOutputs returns [EObject current=null] : iv_ruleEOutputs= ruleEOutputs EOF ;
    public final EObject entryRuleEOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOutputs = null;


        try {
            // InternalAADMParser.g:356:49: (iv_ruleEOutputs= ruleEOutputs EOF )
            // InternalAADMParser.g:357:2: iv_ruleEOutputs= ruleEOutputs EOF
            {
             newCompositeNode(grammarAccess.getEOutputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOutputs=ruleEOutputs();

            state._fsp--;

             current =iv_ruleEOutputs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOutputs"


    // $ANTLR start "ruleEOutputs"
    // InternalAADMParser.g:363:1: ruleEOutputs returns [EObject current=null] : ( () ( (lv_parameters_1_0= ruleEParameterDefinition ) )* ) ;
    public final EObject ruleEOutputs() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:369:2: ( ( () ( (lv_parameters_1_0= ruleEParameterDefinition ) )* ) )
            // InternalAADMParser.g:370:2: ( () ( (lv_parameters_1_0= ruleEParameterDefinition ) )* )
            {
            // InternalAADMParser.g:370:2: ( () ( (lv_parameters_1_0= ruleEParameterDefinition ) )* )
            // InternalAADMParser.g:371:3: () ( (lv_parameters_1_0= ruleEParameterDefinition ) )*
            {
            // InternalAADMParser.g:371:3: ()
            // InternalAADMParser.g:372:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOutputsAccess().getEOutputsAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:378:3: ( (lv_parameters_1_0= ruleEParameterDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAADMParser.g:379:4: (lv_parameters_1_0= ruleEParameterDefinition )
            	    {
            	    // InternalAADMParser.g:379:4: (lv_parameters_1_0= ruleEParameterDefinition )
            	    // InternalAADMParser.g:380:5: lv_parameters_1_0= ruleEParameterDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEOutputsAccess().getParametersEParameterDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_parameters_1_0=ruleEParameterDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEOutputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_1_0,
            	    						"org.sodalite.dsl.AADM.EParameterDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOutputs"


    // $ANTLR start "entryRuleEPolicies"
    // InternalAADMParser.g:401:1: entryRuleEPolicies returns [EObject current=null] : iv_ruleEPolicies= ruleEPolicies EOF ;
    public final EObject entryRuleEPolicies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicies = null;


        try {
            // InternalAADMParser.g:401:50: (iv_ruleEPolicies= ruleEPolicies EOF )
            // InternalAADMParser.g:402:2: iv_ruleEPolicies= ruleEPolicies EOF
            {
             newCompositeNode(grammarAccess.getEPoliciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPolicies=ruleEPolicies();

            state._fsp--;

             current =iv_ruleEPolicies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPolicies"


    // $ANTLR start "ruleEPolicies"
    // InternalAADMParser.g:408:1: ruleEPolicies returns [EObject current=null] : ( () ( (lv_policies_1_0= ruleEPolicyDefinition ) )* ) ;
    public final EObject ruleEPolicies() throws RecognitionException {
        EObject current = null;

        EObject lv_policies_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:414:2: ( ( () ( (lv_policies_1_0= ruleEPolicyDefinition ) )* ) )
            // InternalAADMParser.g:415:2: ( () ( (lv_policies_1_0= ruleEPolicyDefinition ) )* )
            {
            // InternalAADMParser.g:415:2: ( () ( (lv_policies_1_0= ruleEPolicyDefinition ) )* )
            // InternalAADMParser.g:416:3: () ( (lv_policies_1_0= ruleEPolicyDefinition ) )*
            {
            // InternalAADMParser.g:416:3: ()
            // InternalAADMParser.g:417:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPoliciesAccess().getEPoliciesAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:423:3: ( (lv_policies_1_0= ruleEPolicyDefinition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAADMParser.g:424:4: (lv_policies_1_0= ruleEPolicyDefinition )
            	    {
            	    // InternalAADMParser.g:424:4: (lv_policies_1_0= ruleEPolicyDefinition )
            	    // InternalAADMParser.g:425:5: lv_policies_1_0= ruleEPolicyDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEPoliciesAccess().getPoliciesEPolicyDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_policies_1_0=ruleEPolicyDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEPoliciesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"policies",
            	    						lv_policies_1_0,
            	    						"org.sodalite.dsl.AADM.EPolicyDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPolicies"


    // $ANTLR start "entryRuleEPolicyDefinition"
    // InternalAADMParser.g:446:1: entryRuleEPolicyDefinition returns [EObject current=null] : iv_ruleEPolicyDefinition= ruleEPolicyDefinition EOF ;
    public final EObject entryRuleEPolicyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyDefinition = null;


        try {
            // InternalAADMParser.g:446:58: (iv_ruleEPolicyDefinition= ruleEPolicyDefinition EOF )
            // InternalAADMParser.g:447:2: iv_ruleEPolicyDefinition= ruleEPolicyDefinition EOF
            {
             newCompositeNode(grammarAccess.getEPolicyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPolicyDefinition=ruleEPolicyDefinition();

            state._fsp--;

             current =iv_ruleEPolicyDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPolicyDefinition"


    // $ANTLR start "ruleEPolicyDefinition"
    // InternalAADMParser.g:453:1: ruleEPolicyDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEPolicyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_policy_3_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:459:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalAADMParser.g:460:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalAADMParser.g:460:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyDefinitionBody ) ) this_END_4= RULE_END )
            // InternalAADMParser.g:461:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalAADMParser.g:461:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAADMParser.g:462:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAADMParser.g:462:4: (lv_name_0_0= RULE_ID )
            // InternalAADMParser.g:463:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEPolicyDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPolicyDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.AADM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEPolicyDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_11); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEPolicyDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalAADMParser.g:487:3: ( (lv_policy_3_0= ruleEPolicyDefinitionBody ) )
            // InternalAADMParser.g:488:4: (lv_policy_3_0= ruleEPolicyDefinitionBody )
            {
            // InternalAADMParser.g:488:4: (lv_policy_3_0= ruleEPolicyDefinitionBody )
            // InternalAADMParser.g:489:5: lv_policy_3_0= ruleEPolicyDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEPolicyDefinitionAccess().getPolicyEPolicyDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_policy_3_0=ruleEPolicyDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPolicyDefinitionRule());
            					}
            					set(
            						current,
            						"policy",
            						lv_policy_3_0,
            						"org.sodalite.dsl.AADM.EPolicyDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEPolicyDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPolicyDefinition"


    // $ANTLR start "entryRuleEPolicyDefinitionBody"
    // InternalAADMParser.g:514:1: entryRuleEPolicyDefinitionBody returns [EObject current=null] : iv_ruleEPolicyDefinitionBody= ruleEPolicyDefinitionBody EOF ;
    public final EObject entryRuleEPolicyDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyDefinitionBody = null;


        try {
            // InternalAADMParser.g:514:62: (iv_ruleEPolicyDefinitionBody= ruleEPolicyDefinitionBody EOF )
            // InternalAADMParser.g:515:2: iv_ruleEPolicyDefinitionBody= ruleEPolicyDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEPolicyDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPolicyDefinitionBody=ruleEPolicyDefinitionBody();

            state._fsp--;

             current =iv_ruleEPolicyDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPolicyDefinitionBody"


    // $ANTLR start "ruleEPolicyDefinitionBody"
    // InternalAADMParser.g:521:1: ruleEPolicyDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEPolicyDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token this_BEGIN_14=null;
        Token this_END_16=null;
        EObject lv_type_2_0 = null;

        EObject lv_properties_7_0 = null;

        EObject lv_targets_11_0 = null;

        EObject lv_triggers_15_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:527:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalAADMParser.g:528:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalAADMParser.g:528:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalAADMParser.g:529:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalAADMParser.g:529:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) ) )+ {...}?) )
            // InternalAADMParser.g:530:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalAADMParser.g:533:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) ) )+ {...}?)
            // InternalAADMParser.g:534:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalAADMParser.g:534:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=6;
                int LA5_0 = input.LA(1);

                if ( LA5_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt5=3;
                }
                else if ( LA5_0 == Targets && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt5=4;
                }
                else if ( LA5_0 == Triggers && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt5=5;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAADMParser.g:535:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:535:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalAADMParser.g:536:4: {...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAADMParser.g:536:115: ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalAADMParser.g:537:5: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAADMParser.g:540:8: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalAADMParser.g:540:9: {...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:540:18: (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalAADMParser.g:540:19: otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_12); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPolicyDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalAADMParser.g:544:8: ( (lv_type_2_0= ruleEPREFIX_TYPE ) )
            	    // InternalAADMParser.g:545:9: (lv_type_2_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalAADMParser.g:545:9: (lv_type_2_0= ruleEPREFIX_TYPE )
            	    // InternalAADMParser.g:546:10: lv_type_2_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getEPolicyDefinitionBodyAccess().getTypeEPREFIX_TYPEParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_13);
            	    lv_type_2_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPolicyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_2_0,
            	    											"org.sodalite.dsl.AADM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAADMParser.g:569:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:569:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAADMParser.g:570:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAADMParser.g:570:115: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalAADMParser.g:571:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAADMParser.g:574:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalAADMParser.g:574:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:574:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalAADMParser.g:574:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_3); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPolicyDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalAADMParser.g:578:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalAADMParser.g:579:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalAADMParser.g:579:9: (lv_description_4_0= RULE_STRING )
            	    // InternalAADMParser.g:580:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

            	    										newLeafNode(lv_description_4_0, grammarAccess.getEPolicyDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPolicyDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAADMParser.g:602:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:602:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) )
            	    // InternalAADMParser.g:603:4: {...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAADMParser.g:603:115: ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) )
            	    // InternalAADMParser.g:604:5: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAADMParser.g:607:8: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) )
            	    // InternalAADMParser.g:607:9: {...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:607:18: (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END )
            	    // InternalAADMParser.g:607:19: otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Properties,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPolicyDefinitionBodyAccess().getPropertiesKeyword_2_0());
            	    							
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_6, grammarAccess.getEPolicyDefinitionBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalAADMParser.g:615:8: ( (lv_properties_7_0= ruleEPropertyAssignments ) )
            	    // InternalAADMParser.g:616:9: (lv_properties_7_0= ruleEPropertyAssignments )
            	    {
            	    // InternalAADMParser.g:616:9: (lv_properties_7_0= ruleEPropertyAssignments )
            	    // InternalAADMParser.g:617:10: lv_properties_7_0= ruleEPropertyAssignments
            	    {

            	    										newCompositeNode(grammarAccess.getEPolicyDefinitionBodyAccess().getPropertiesEPropertyAssignmentsParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_properties_7_0=ruleEPropertyAssignments();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPolicyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"properties",
            	    											lv_properties_7_0,
            	    											"org.sodalite.dsl.AADM.EPropertyAssignments");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_13); 

            	    								newLeafNode(this_END_8, grammarAccess.getEPolicyDefinitionBodyAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAADMParser.g:644:3: ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) )
            	    {
            	    // InternalAADMParser.g:644:3: ({...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) ) )
            	    // InternalAADMParser.g:645:4: {...}? => ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAADMParser.g:645:115: ( ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) ) )
            	    // InternalAADMParser.g:646:5: ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAADMParser.g:649:8: ({...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket ) )
            	    // InternalAADMParser.g:649:9: {...}? => (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:649:18: (otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket )
            	    // InternalAADMParser.g:649:19: otherlv_9= Targets otherlv_10= LeftSquareBracket ( (lv_targets_11_0= ruleETarget ) ) otherlv_12= RightSquareBracket
            	    {
            	    otherlv_9=(Token)match(input,Targets,FOLLOW_14); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPolicyDefinitionBodyAccess().getTargetsKeyword_3_0());
            	    							
            	    otherlv_10=(Token)match(input,LeftSquareBracket,FOLLOW_5); 

            	    								newLeafNode(otherlv_10, grammarAccess.getEPolicyDefinitionBodyAccess().getLeftSquareBracketKeyword_3_1());
            	    							
            	    // InternalAADMParser.g:657:8: ( (lv_targets_11_0= ruleETarget ) )
            	    // InternalAADMParser.g:658:9: (lv_targets_11_0= ruleETarget )
            	    {
            	    // InternalAADMParser.g:658:9: (lv_targets_11_0= ruleETarget )
            	    // InternalAADMParser.g:659:10: lv_targets_11_0= ruleETarget
            	    {

            	    										newCompositeNode(grammarAccess.getEPolicyDefinitionBodyAccess().getTargetsETargetParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_15);
            	    lv_targets_11_0=ruleETarget();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPolicyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"targets",
            	    											lv_targets_11_0,
            	    											"org.sodalite.dsl.AADM.ETarget");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,RightSquareBracket,FOLLOW_13); 

            	    								newLeafNode(otherlv_12, grammarAccess.getEPolicyDefinitionBodyAccess().getRightSquareBracketKeyword_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAADMParser.g:686:3: ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:686:3: ({...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) ) )
            	    // InternalAADMParser.g:687:4: {...}? => ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAADMParser.g:687:115: ( ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) ) )
            	    // InternalAADMParser.g:688:5: ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAADMParser.g:691:8: ({...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END ) )
            	    // InternalAADMParser.g:691:9: {...}? => (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:691:18: (otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END )
            	    // InternalAADMParser.g:691:19: otherlv_13= Triggers this_BEGIN_14= RULE_BEGIN ( (lv_triggers_15_0= ruleETriggerDefinitions ) ) this_END_16= RULE_END
            	    {
            	    otherlv_13=(Token)match(input,Triggers,FOLLOW_6); 

            	    								newLeafNode(otherlv_13, grammarAccess.getEPolicyDefinitionBodyAccess().getTriggersKeyword_4_0());
            	    							
            	    this_BEGIN_14=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            	    								newLeafNode(this_BEGIN_14, grammarAccess.getEPolicyDefinitionBodyAccess().getBEGINTerminalRuleCall_4_1());
            	    							
            	    // InternalAADMParser.g:699:8: ( (lv_triggers_15_0= ruleETriggerDefinitions ) )
            	    // InternalAADMParser.g:700:9: (lv_triggers_15_0= ruleETriggerDefinitions )
            	    {
            	    // InternalAADMParser.g:700:9: (lv_triggers_15_0= ruleETriggerDefinitions )
            	    // InternalAADMParser.g:701:10: lv_triggers_15_0= ruleETriggerDefinitions
            	    {

            	    										newCompositeNode(grammarAccess.getEPolicyDefinitionBodyAccess().getTriggersETriggerDefinitionsParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_triggers_15_0=ruleETriggerDefinitions();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPolicyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"triggers",
            	    											lv_triggers_15_0,
            	    											"org.sodalite.dsl.AADM.ETriggerDefinitions");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_16=(Token)match(input,RULE_END,FOLLOW_13); 

            	    								newLeafNode(this_END_16, grammarAccess.getEPolicyDefinitionBodyAccess().getENDTerminalRuleCall_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEPolicyDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEPolicyDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPolicyDefinitionBody"


    // $ANTLR start "entryRuleETriggerDefinitions"
    // InternalAADMParser.g:739:1: entryRuleETriggerDefinitions returns [EObject current=null] : iv_ruleETriggerDefinitions= ruleETriggerDefinitions EOF ;
    public final EObject entryRuleETriggerDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETriggerDefinitions = null;


        try {
            // InternalAADMParser.g:739:60: (iv_ruleETriggerDefinitions= ruleETriggerDefinitions EOF )
            // InternalAADMParser.g:740:2: iv_ruleETriggerDefinitions= ruleETriggerDefinitions EOF
            {
             newCompositeNode(grammarAccess.getETriggerDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETriggerDefinitions=ruleETriggerDefinitions();

            state._fsp--;

             current =iv_ruleETriggerDefinitions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETriggerDefinitions"


    // $ANTLR start "ruleETriggerDefinitions"
    // InternalAADMParser.g:746:1: ruleETriggerDefinitions returns [EObject current=null] : ( () ( (lv_triggers_1_0= ruleETriggerDefinition ) )* ) ;
    public final EObject ruleETriggerDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_triggers_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:752:2: ( ( () ( (lv_triggers_1_0= ruleETriggerDefinition ) )* ) )
            // InternalAADMParser.g:753:2: ( () ( (lv_triggers_1_0= ruleETriggerDefinition ) )* )
            {
            // InternalAADMParser.g:753:2: ( () ( (lv_triggers_1_0= ruleETriggerDefinition ) )* )
            // InternalAADMParser.g:754:3: () ( (lv_triggers_1_0= ruleETriggerDefinition ) )*
            {
            // InternalAADMParser.g:754:3: ()
            // InternalAADMParser.g:755:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETriggerDefinitionsAccess().getETriggerDefinitionsAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:761:3: ( (lv_triggers_1_0= ruleETriggerDefinition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_QUALIFIED_NAME) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAADMParser.g:762:4: (lv_triggers_1_0= ruleETriggerDefinition )
            	    {
            	    // InternalAADMParser.g:762:4: (lv_triggers_1_0= ruleETriggerDefinition )
            	    // InternalAADMParser.g:763:5: lv_triggers_1_0= ruleETriggerDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getETriggerDefinitionsAccess().getTriggersETriggerDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_triggers_1_0=ruleETriggerDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getETriggerDefinitionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"triggers",
            	    						lv_triggers_1_0,
            	    						"org.sodalite.dsl.AADM.ETriggerDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleETriggerDefinitions"


    // $ANTLR start "entryRuleETriggerDefinition"
    // InternalAADMParser.g:784:1: entryRuleETriggerDefinition returns [EObject current=null] : iv_ruleETriggerDefinition= ruleETriggerDefinition EOF ;
    public final EObject entryRuleETriggerDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETriggerDefinition = null;


        try {
            // InternalAADMParser.g:784:59: (iv_ruleETriggerDefinition= ruleETriggerDefinition EOF )
            // InternalAADMParser.g:785:2: iv_ruleETriggerDefinition= ruleETriggerDefinition EOF
            {
             newCompositeNode(grammarAccess.getETriggerDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETriggerDefinition=ruleETriggerDefinition();

            state._fsp--;

             current =iv_ruleETriggerDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETriggerDefinition"


    // $ANTLR start "ruleETriggerDefinition"
    // InternalAADMParser.g:791:1: ruleETriggerDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_trigger_3_0= ruleETriggerDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleETriggerDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_trigger_3_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:797:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_trigger_3_0= ruleETriggerDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalAADMParser.g:798:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_trigger_3_0= ruleETriggerDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalAADMParser.g:798:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_trigger_3_0= ruleETriggerDefinitionBody ) ) this_END_4= RULE_END )
            // InternalAADMParser.g:799:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_trigger_3_0= ruleETriggerDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalAADMParser.g:799:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalAADMParser.g:800:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalAADMParser.g:800:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalAADMParser.g:801:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getETriggerDefinitionAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getETriggerDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.AADM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getETriggerDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getETriggerDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalAADMParser.g:825:3: ( (lv_trigger_3_0= ruleETriggerDefinitionBody ) )
            // InternalAADMParser.g:826:4: (lv_trigger_3_0= ruleETriggerDefinitionBody )
            {
            // InternalAADMParser.g:826:4: (lv_trigger_3_0= ruleETriggerDefinitionBody )
            // InternalAADMParser.g:827:5: lv_trigger_3_0= ruleETriggerDefinitionBody
            {

            					newCompositeNode(grammarAccess.getETriggerDefinitionAccess().getTriggerETriggerDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_trigger_3_0=ruleETriggerDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETriggerDefinitionRule());
            					}
            					set(
            						current,
            						"trigger",
            						lv_trigger_3_0,
            						"org.sodalite.dsl.AADM.ETriggerDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getETriggerDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleETriggerDefinition"


    // $ANTLR start "entryRuleETriggerDefinitionBody"
    // InternalAADMParser.g:852:1: entryRuleETriggerDefinitionBody returns [EObject current=null] : iv_ruleETriggerDefinitionBody= ruleETriggerDefinitionBody EOF ;
    public final EObject entryRuleETriggerDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETriggerDefinitionBody = null;


        try {
            // InternalAADMParser.g:852:63: (iv_ruleETriggerDefinitionBody= ruleETriggerDefinitionBody EOF )
            // InternalAADMParser.g:853:2: iv_ruleETriggerDefinitionBody= ruleETriggerDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getETriggerDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETriggerDefinitionBody=ruleETriggerDefinitionBody();

            state._fsp--;

             current =iv_ruleETriggerDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETriggerDefinitionBody"


    // $ANTLR start "ruleETriggerDefinitionBody"
    // InternalAADMParser.g:859:1: ruleETriggerDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleETriggerDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;
        Token lv_event_4_0=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        Token otherlv_13=null;
        Token this_BEGIN_14=null;
        Token this_END_16=null;
        Token otherlv_17=null;
        Token this_BEGIN_18=null;
        Token this_END_20=null;
        EObject lv_schedule_7_0 = null;

        EObject lv_target_filter_11_0 = null;

        EObject lv_condition_15_0 = null;

        EObject lv_action_19_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:865:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalAADMParser.g:866:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalAADMParser.g:866:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalAADMParser.g:867:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalAADMParser.g:867:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) )
            // InternalAADMParser.g:868:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalAADMParser.g:871:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?)
            // InternalAADMParser.g:872:5: ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalAADMParser.g:872:5: ( ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=7;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == Event && getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == Schedule && getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 == Target_filter && getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt7=4;
                }
                else if ( LA7_0 == Condition && getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt7=5;
                }
                else if ( LA7_0 == Action && getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
                    alt7=6;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAADMParser.g:873:3: ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:873:3: ({...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAADMParser.g:874:4: {...}? => ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAADMParser.g:874:116: ( ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) ) )
            	    // InternalAADMParser.g:875:5: ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAADMParser.g:878:8: ({...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) ) )
            	    // InternalAADMParser.g:878:9: {...}? => (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:878:18: (otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) ) )
            	    // InternalAADMParser.g:878:19: otherlv_1= Description ( (lv_description_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Description,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getETriggerDefinitionBodyAccess().getDescriptionKeyword_0_0());
            	    							
            	    // InternalAADMParser.g:882:8: ( (lv_description_2_0= RULE_STRING ) )
            	    // InternalAADMParser.g:883:9: (lv_description_2_0= RULE_STRING )
            	    {
            	    // InternalAADMParser.g:883:9: (lv_description_2_0= RULE_STRING )
            	    // InternalAADMParser.g:884:10: lv_description_2_0= RULE_STRING
            	    {
            	    lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    										newLeafNode(lv_description_2_0, grammarAccess.getETriggerDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getETriggerDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_2_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAADMParser.g:906:3: ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:906:3: ({...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAADMParser.g:907:4: {...}? => ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAADMParser.g:907:116: ( ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) ) )
            	    // InternalAADMParser.g:908:5: ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAADMParser.g:911:8: ({...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) ) )
            	    // InternalAADMParser.g:911:9: {...}? => (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:911:18: (otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) ) )
            	    // InternalAADMParser.g:911:19: otherlv_3= Event ( (lv_event_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Event,FOLLOW_3); 

            	    								newLeafNode(otherlv_3, grammarAccess.getETriggerDefinitionBodyAccess().getEventKeyword_1_0());
            	    							
            	    // InternalAADMParser.g:915:8: ( (lv_event_4_0= RULE_STRING ) )
            	    // InternalAADMParser.g:916:9: (lv_event_4_0= RULE_STRING )
            	    {
            	    // InternalAADMParser.g:916:9: (lv_event_4_0= RULE_STRING )
            	    // InternalAADMParser.g:917:10: lv_event_4_0= RULE_STRING
            	    {
            	    lv_event_4_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    										newLeafNode(lv_event_4_0, grammarAccess.getETriggerDefinitionBodyAccess().getEventSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getETriggerDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"event",
            	    											lv_event_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAADMParser.g:939:3: ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:939:3: ({...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) ) )
            	    // InternalAADMParser.g:940:4: {...}? => ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAADMParser.g:940:116: ( ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) ) )
            	    // InternalAADMParser.g:941:5: ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAADMParser.g:944:8: ({...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END ) )
            	    // InternalAADMParser.g:944:9: {...}? => (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:944:18: (otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END )
            	    // InternalAADMParser.g:944:19: otherlv_5= Schedule this_BEGIN_6= RULE_BEGIN ( (lv_schedule_7_0= ruleETimeInterval ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Schedule,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getETriggerDefinitionBodyAccess().getScheduleKeyword_2_0());
            	    							
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            	    								newLeafNode(this_BEGIN_6, grammarAccess.getETriggerDefinitionBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalAADMParser.g:952:8: ( (lv_schedule_7_0= ruleETimeInterval ) )
            	    // InternalAADMParser.g:953:9: (lv_schedule_7_0= ruleETimeInterval )
            	    {
            	    // InternalAADMParser.g:953:9: (lv_schedule_7_0= ruleETimeInterval )
            	    // InternalAADMParser.g:954:10: lv_schedule_7_0= ruleETimeInterval
            	    {

            	    										newCompositeNode(grammarAccess.getETriggerDefinitionBodyAccess().getScheduleETimeIntervalParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_schedule_7_0=ruleETimeInterval();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETriggerDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"schedule",
            	    											lv_schedule_7_0,
            	    											"org.sodalite.dsl.AADM.ETimeInterval");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_19); 

            	    								newLeafNode(this_END_8, grammarAccess.getETriggerDefinitionBodyAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAADMParser.g:981:3: ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:981:3: ({...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalAADMParser.g:982:4: {...}? => ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAADMParser.g:982:116: ( ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) ) )
            	    // InternalAADMParser.g:983:5: ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAADMParser.g:986:8: ({...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END ) )
            	    // InternalAADMParser.g:986:9: {...}? => (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:986:18: (otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END )
            	    // InternalAADMParser.g:986:19: otherlv_9= Target_filter this_BEGIN_10= RULE_BEGIN ( (lv_target_filter_11_0= ruleEEvenFilter ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Target_filter,FOLLOW_6); 

            	    								newLeafNode(otherlv_9, grammarAccess.getETriggerDefinitionBodyAccess().getTarget_filterKeyword_3_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getETriggerDefinitionBodyAccess().getBEGINTerminalRuleCall_3_1());
            	    							
            	    // InternalAADMParser.g:994:8: ( (lv_target_filter_11_0= ruleEEvenFilter ) )
            	    // InternalAADMParser.g:995:9: (lv_target_filter_11_0= ruleEEvenFilter )
            	    {
            	    // InternalAADMParser.g:995:9: (lv_target_filter_11_0= ruleEEvenFilter )
            	    // InternalAADMParser.g:996:10: lv_target_filter_11_0= ruleEEvenFilter
            	    {

            	    										newCompositeNode(grammarAccess.getETriggerDefinitionBodyAccess().getTarget_filterEEvenFilterParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_target_filter_11_0=ruleEEvenFilter();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETriggerDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"target_filter",
            	    											lv_target_filter_11_0,
            	    											"org.sodalite.dsl.AADM.EEvenFilter");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_19); 

            	    								newLeafNode(this_END_12, grammarAccess.getETriggerDefinitionBodyAccess().getENDTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAADMParser.g:1023:3: ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:1023:3: ({...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) ) )
            	    // InternalAADMParser.g:1024:4: {...}? => ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAADMParser.g:1024:116: ( ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) ) )
            	    // InternalAADMParser.g:1025:5: ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAADMParser.g:1028:8: ({...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END ) )
            	    // InternalAADMParser.g:1028:9: {...}? => (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:1028:18: (otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END )
            	    // InternalAADMParser.g:1028:19: otherlv_13= Condition this_BEGIN_14= RULE_BEGIN ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) ) this_END_16= RULE_END
            	    {
            	    otherlv_13=(Token)match(input,Condition,FOLLOW_6); 

            	    								newLeafNode(otherlv_13, grammarAccess.getETriggerDefinitionBodyAccess().getConditionKeyword_4_0());
            	    							
            	    this_BEGIN_14=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

            	    								newLeafNode(this_BEGIN_14, grammarAccess.getETriggerDefinitionBodyAccess().getBEGINTerminalRuleCall_4_1());
            	    							
            	    // InternalAADMParser.g:1036:8: ( (lv_condition_15_0= ruleEExtendedTriggerCondition ) )
            	    // InternalAADMParser.g:1037:9: (lv_condition_15_0= ruleEExtendedTriggerCondition )
            	    {
            	    // InternalAADMParser.g:1037:9: (lv_condition_15_0= ruleEExtendedTriggerCondition )
            	    // InternalAADMParser.g:1038:10: lv_condition_15_0= ruleEExtendedTriggerCondition
            	    {

            	    										newCompositeNode(grammarAccess.getETriggerDefinitionBodyAccess().getConditionEExtendedTriggerConditionParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_condition_15_0=ruleEExtendedTriggerCondition();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETriggerDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"condition",
            	    											lv_condition_15_0,
            	    											"org.sodalite.dsl.AADM.EExtendedTriggerCondition");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_16=(Token)match(input,RULE_END,FOLLOW_19); 

            	    								newLeafNode(this_END_16, grammarAccess.getETriggerDefinitionBodyAccess().getENDTerminalRuleCall_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAADMParser.g:1065:3: ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:1065:3: ({...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) ) )
            	    // InternalAADMParser.g:1066:4: {...}? => ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAADMParser.g:1066:116: ( ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) ) )
            	    // InternalAADMParser.g:1067:5: ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAADMParser.g:1070:8: ({...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END ) )
            	    // InternalAADMParser.g:1070:9: {...}? => (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:1070:18: (otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END )
            	    // InternalAADMParser.g:1070:19: otherlv_17= Action this_BEGIN_18= RULE_BEGIN ( (lv_action_19_0= ruleEActivityDefinitions ) ) this_END_20= RULE_END
            	    {
            	    otherlv_17=(Token)match(input,Action,FOLLOW_6); 

            	    								newLeafNode(otherlv_17, grammarAccess.getETriggerDefinitionBodyAccess().getActionKeyword_5_0());
            	    							
            	    this_BEGIN_18=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            	    								newLeafNode(this_BEGIN_18, grammarAccess.getETriggerDefinitionBodyAccess().getBEGINTerminalRuleCall_5_1());
            	    							
            	    // InternalAADMParser.g:1078:8: ( (lv_action_19_0= ruleEActivityDefinitions ) )
            	    // InternalAADMParser.g:1079:9: (lv_action_19_0= ruleEActivityDefinitions )
            	    {
            	    // InternalAADMParser.g:1079:9: (lv_action_19_0= ruleEActivityDefinitions )
            	    // InternalAADMParser.g:1080:10: lv_action_19_0= ruleEActivityDefinitions
            	    {

            	    										newCompositeNode(grammarAccess.getETriggerDefinitionBodyAccess().getActionEActivityDefinitionsParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_action_19_0=ruleEActivityDefinitions();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETriggerDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"action",
            	    											lv_action_19_0,
            	    											"org.sodalite.dsl.AADM.EActivityDefinitions");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_20=(Token)match(input,RULE_END,FOLLOW_19); 

            	    								newLeafNode(this_END_20, grammarAccess.getETriggerDefinitionBodyAccess().getENDTerminalRuleCall_5_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleETriggerDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getETriggerDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleETriggerDefinitionBody"


    // $ANTLR start "entryRuleEActivityDefinitions"
    // InternalAADMParser.g:1118:1: entryRuleEActivityDefinitions returns [EObject current=null] : iv_ruleEActivityDefinitions= ruleEActivityDefinitions EOF ;
    public final EObject entryRuleEActivityDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEActivityDefinitions = null;


        try {
            // InternalAADMParser.g:1118:61: (iv_ruleEActivityDefinitions= ruleEActivityDefinitions EOF )
            // InternalAADMParser.g:1119:2: iv_ruleEActivityDefinitions= ruleEActivityDefinitions EOF
            {
             newCompositeNode(grammarAccess.getEActivityDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEActivityDefinitions=ruleEActivityDefinitions();

            state._fsp--;

             current =iv_ruleEActivityDefinitions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEActivityDefinitions"


    // $ANTLR start "ruleEActivityDefinitions"
    // InternalAADMParser.g:1125:1: ruleEActivityDefinitions returns [EObject current=null] : ( () ( (lv_list_1_0= ruleEActivityDefinition ) )* ) ;
    public final EObject ruleEActivityDefinitions() throws RecognitionException {
        EObject current = null;

        EObject lv_list_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1131:2: ( ( () ( (lv_list_1_0= ruleEActivityDefinition ) )* ) )
            // InternalAADMParser.g:1132:2: ( () ( (lv_list_1_0= ruleEActivityDefinition ) )* )
            {
            // InternalAADMParser.g:1132:2: ( () ( (lv_list_1_0= ruleEActivityDefinition ) )* )
            // InternalAADMParser.g:1133:3: () ( (lv_list_1_0= ruleEActivityDefinition ) )*
            {
            // InternalAADMParser.g:1133:3: ()
            // InternalAADMParser.g:1134:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEActivityDefinitionsAccess().getEActivityDefinitionsAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:1140:3: ( (lv_list_1_0= ruleEActivityDefinition ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Call_operation) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAADMParser.g:1141:4: (lv_list_1_0= ruleEActivityDefinition )
            	    {
            	    // InternalAADMParser.g:1141:4: (lv_list_1_0= ruleEActivityDefinition )
            	    // InternalAADMParser.g:1142:5: lv_list_1_0= ruleEActivityDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEActivityDefinitionsAccess().getListEActivityDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_list_1_0=ruleEActivityDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEActivityDefinitionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"list",
            	    						lv_list_1_0,
            	    						"org.sodalite.dsl.AADM.EActivityDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEActivityDefinitions"


    // $ANTLR start "entryRuleEActivityDefinition"
    // InternalAADMParser.g:1163:1: entryRuleEActivityDefinition returns [EObject current=null] : iv_ruleEActivityDefinition= ruleEActivityDefinition EOF ;
    public final EObject entryRuleEActivityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEActivityDefinition = null;


        try {
            // InternalAADMParser.g:1163:60: (iv_ruleEActivityDefinition= ruleEActivityDefinition EOF )
            // InternalAADMParser.g:1164:2: iv_ruleEActivityDefinition= ruleEActivityDefinition EOF
            {
             newCompositeNode(grammarAccess.getEActivityDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEActivityDefinition=ruleEActivityDefinition();

            state._fsp--;

             current =iv_ruleEActivityDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEActivityDefinition"


    // $ANTLR start "ruleEActivityDefinition"
    // InternalAADMParser.g:1170:1: ruleEActivityDefinition returns [EObject current=null] : this_ECallOperationActivityDefinition_0= ruleECallOperationActivityDefinition ;
    public final EObject ruleEActivityDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ECallOperationActivityDefinition_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1176:2: (this_ECallOperationActivityDefinition_0= ruleECallOperationActivityDefinition )
            // InternalAADMParser.g:1177:2: this_ECallOperationActivityDefinition_0= ruleECallOperationActivityDefinition
            {

            		newCompositeNode(grammarAccess.getEActivityDefinitionAccess().getECallOperationActivityDefinitionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ECallOperationActivityDefinition_0=ruleECallOperationActivityDefinition();

            state._fsp--;


            		current = this_ECallOperationActivityDefinition_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEActivityDefinition"


    // $ANTLR start "entryRuleECallOperationActivityDefinition"
    // InternalAADMParser.g:1188:1: entryRuleECallOperationActivityDefinition returns [EObject current=null] : iv_ruleECallOperationActivityDefinition= ruleECallOperationActivityDefinition EOF ;
    public final EObject entryRuleECallOperationActivityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECallOperationActivityDefinition = null;


        try {
            // InternalAADMParser.g:1188:73: (iv_ruleECallOperationActivityDefinition= ruleECallOperationActivityDefinition EOF )
            // InternalAADMParser.g:1189:2: iv_ruleECallOperationActivityDefinition= ruleECallOperationActivityDefinition EOF
            {
             newCompositeNode(grammarAccess.getECallOperationActivityDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECallOperationActivityDefinition=ruleECallOperationActivityDefinition();

            state._fsp--;

             current =iv_ruleECallOperationActivityDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECallOperationActivityDefinition"


    // $ANTLR start "ruleECallOperationActivityDefinition"
    // InternalAADMParser.g:1195:1: ruleECallOperationActivityDefinition returns [EObject current=null] : (otherlv_0= Call_operation this_BEGIN_1= RULE_BEGIN ( (lv_operation_2_0= ruleECallOperationActivityDefinitionBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleECallOperationActivityDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_operation_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1201:2: ( (otherlv_0= Call_operation this_BEGIN_1= RULE_BEGIN ( (lv_operation_2_0= ruleECallOperationActivityDefinitionBody ) ) this_END_3= RULE_END ) )
            // InternalAADMParser.g:1202:2: (otherlv_0= Call_operation this_BEGIN_1= RULE_BEGIN ( (lv_operation_2_0= ruleECallOperationActivityDefinitionBody ) ) this_END_3= RULE_END )
            {
            // InternalAADMParser.g:1202:2: (otherlv_0= Call_operation this_BEGIN_1= RULE_BEGIN ( (lv_operation_2_0= ruleECallOperationActivityDefinitionBody ) ) this_END_3= RULE_END )
            // InternalAADMParser.g:1203:3: otherlv_0= Call_operation this_BEGIN_1= RULE_BEGIN ( (lv_operation_2_0= ruleECallOperationActivityDefinitionBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Call_operation,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getECallOperationActivityDefinitionAccess().getCall_operationKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getECallOperationActivityDefinitionAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalAADMParser.g:1211:3: ( (lv_operation_2_0= ruleECallOperationActivityDefinitionBody ) )
            // InternalAADMParser.g:1212:4: (lv_operation_2_0= ruleECallOperationActivityDefinitionBody )
            {
            // InternalAADMParser.g:1212:4: (lv_operation_2_0= ruleECallOperationActivityDefinitionBody )
            // InternalAADMParser.g:1213:5: lv_operation_2_0= ruleECallOperationActivityDefinitionBody
            {

            					newCompositeNode(grammarAccess.getECallOperationActivityDefinitionAccess().getOperationECallOperationActivityDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_operation_2_0=ruleECallOperationActivityDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getECallOperationActivityDefinitionRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_2_0,
            						"org.sodalite.dsl.AADM.ECallOperationActivityDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getECallOperationActivityDefinitionAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECallOperationActivityDefinition"


    // $ANTLR start "entryRuleECallOperationActivityDefinitionBody"
    // InternalAADMParser.g:1238:1: entryRuleECallOperationActivityDefinitionBody returns [EObject current=null] : iv_ruleECallOperationActivityDefinitionBody= ruleECallOperationActivityDefinitionBody EOF ;
    public final EObject entryRuleECallOperationActivityDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECallOperationActivityDefinitionBody = null;


        try {
            // InternalAADMParser.g:1238:77: (iv_ruleECallOperationActivityDefinitionBody= ruleECallOperationActivityDefinitionBody EOF )
            // InternalAADMParser.g:1239:2: iv_ruleECallOperationActivityDefinitionBody= ruleECallOperationActivityDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getECallOperationActivityDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECallOperationActivityDefinitionBody=ruleECallOperationActivityDefinitionBody();

            state._fsp--;

             current =iv_ruleECallOperationActivityDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECallOperationActivityDefinitionBody"


    // $ANTLR start "ruleECallOperationActivityDefinitionBody"
    // InternalAADMParser.g:1245:1: ruleECallOperationActivityDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleECallOperationActivityDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        EObject lv_operation_2_0 = null;

        EObject lv_inputs_5_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1251:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalAADMParser.g:1252:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalAADMParser.g:1252:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalAADMParser.g:1253:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalAADMParser.g:1253:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?) )
            // InternalAADMParser.g:1254:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalAADMParser.g:1257:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?)
            // InternalAADMParser.g:1258:5: ( ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalAADMParser.g:1258:5: ( ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == Operation && getUnorderedGroupHelper().canSelect(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == Inputs && getUnorderedGroupHelper().canSelect(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAADMParser.g:1259:3: ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:1259:3: ({...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalAADMParser.g:1260:4: {...}? => ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECallOperationActivityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAADMParser.g:1260:130: ( ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalAADMParser.g:1261:5: ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAADMParser.g:1264:8: ({...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalAADMParser.g:1264:9: {...}? => (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECallOperationActivityDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:1264:18: (otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalAADMParser.g:1264:19: otherlv_1= Operation ( (lv_operation_2_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_1=(Token)match(input,Operation,FOLLOW_12); 

            	    								newLeafNode(otherlv_1, grammarAccess.getECallOperationActivityDefinitionBodyAccess().getOperationKeyword_0_0());
            	    							
            	    // InternalAADMParser.g:1268:8: ( (lv_operation_2_0= ruleEPREFIX_TYPE ) )
            	    // InternalAADMParser.g:1269:9: (lv_operation_2_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalAADMParser.g:1269:9: (lv_operation_2_0= ruleEPREFIX_TYPE )
            	    // InternalAADMParser.g:1270:10: lv_operation_2_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getOperationEPREFIX_TYPEParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_26);
            	    lv_operation_2_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getECallOperationActivityDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"operation",
            	    											lv_operation_2_0,
            	    											"org.sodalite.dsl.AADM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAADMParser.g:1293:3: ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:1293:3: ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) ) )
            	    // InternalAADMParser.g:1294:4: {...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECallOperationActivityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAADMParser.g:1294:130: ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) ) )
            	    // InternalAADMParser.g:1295:5: ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAADMParser.g:1298:8: ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END ) )
            	    // InternalAADMParser.g:1298:9: {...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECallOperationActivityDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:1298:18: (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END )
            	    // InternalAADMParser.g:1298:19: otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END
            	    {
            	    otherlv_3=(Token)match(input,Inputs,FOLLOW_6); 

            	    								newLeafNode(otherlv_3, grammarAccess.getECallOperationActivityDefinitionBodyAccess().getInputsKeyword_1_0());
            	    							
            	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_4, grammarAccess.getECallOperationActivityDefinitionBodyAccess().getBEGINTerminalRuleCall_1_1());
            	    							
            	    // InternalAADMParser.g:1306:8: ( (lv_inputs_5_0= ruleEPropertyAssignments ) )
            	    // InternalAADMParser.g:1307:9: (lv_inputs_5_0= ruleEPropertyAssignments )
            	    {
            	    // InternalAADMParser.g:1307:9: (lv_inputs_5_0= ruleEPropertyAssignments )
            	    // InternalAADMParser.g:1308:10: lv_inputs_5_0= ruleEPropertyAssignments
            	    {

            	    										newCompositeNode(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getInputsEPropertyAssignmentsParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_inputs_5_0=ruleEPropertyAssignments();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getECallOperationActivityDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"inputs",
            	    											lv_inputs_5_0,
            	    											"org.sodalite.dsl.AADM.EPropertyAssignments");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_6=(Token)match(input,RULE_END,FOLLOW_26); 

            	    								newLeafNode(this_END_6, grammarAccess.getECallOperationActivityDefinitionBodyAccess().getENDTerminalRuleCall_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleECallOperationActivityDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getECallOperationActivityDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECallOperationActivityDefinitionBody"


    // $ANTLR start "entryRuleETimeInterval"
    // InternalAADMParser.g:1346:1: entryRuleETimeInterval returns [EObject current=null] : iv_ruleETimeInterval= ruleETimeInterval EOF ;
    public final EObject entryRuleETimeInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETimeInterval = null;


        try {
            // InternalAADMParser.g:1346:54: (iv_ruleETimeInterval= ruleETimeInterval EOF )
            // InternalAADMParser.g:1347:2: iv_ruleETimeInterval= ruleETimeInterval EOF
            {
             newCompositeNode(grammarAccess.getETimeIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETimeInterval=ruleETimeInterval();

            state._fsp--;

             current =iv_ruleETimeInterval; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETimeInterval"


    // $ANTLR start "ruleETimeInterval"
    // InternalAADMParser.g:1353:1: ruleETimeInterval returns [EObject current=null] : ( (otherlv_0= Start_time ( (lv_start_time_1_0= RULE_STRING ) ) ) (otherlv_2= End_time ( (lv_end_time_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleETimeInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_start_time_1_0=null;
        Token otherlv_2=null;
        Token lv_end_time_3_0=null;


        	enterRule();

        try {
            // InternalAADMParser.g:1359:2: ( ( (otherlv_0= Start_time ( (lv_start_time_1_0= RULE_STRING ) ) ) (otherlv_2= End_time ( (lv_end_time_3_0= RULE_STRING ) ) ) ) )
            // InternalAADMParser.g:1360:2: ( (otherlv_0= Start_time ( (lv_start_time_1_0= RULE_STRING ) ) ) (otherlv_2= End_time ( (lv_end_time_3_0= RULE_STRING ) ) ) )
            {
            // InternalAADMParser.g:1360:2: ( (otherlv_0= Start_time ( (lv_start_time_1_0= RULE_STRING ) ) ) (otherlv_2= End_time ( (lv_end_time_3_0= RULE_STRING ) ) ) )
            // InternalAADMParser.g:1361:3: (otherlv_0= Start_time ( (lv_start_time_1_0= RULE_STRING ) ) ) (otherlv_2= End_time ( (lv_end_time_3_0= RULE_STRING ) ) )
            {
            // InternalAADMParser.g:1361:3: (otherlv_0= Start_time ( (lv_start_time_1_0= RULE_STRING ) ) )
            // InternalAADMParser.g:1362:4: otherlv_0= Start_time ( (lv_start_time_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Start_time,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getETimeIntervalAccess().getStart_timeKeyword_0_0());
            			
            // InternalAADMParser.g:1366:4: ( (lv_start_time_1_0= RULE_STRING ) )
            // InternalAADMParser.g:1367:5: (lv_start_time_1_0= RULE_STRING )
            {
            // InternalAADMParser.g:1367:5: (lv_start_time_1_0= RULE_STRING )
            // InternalAADMParser.g:1368:6: lv_start_time_1_0= RULE_STRING
            {
            lv_start_time_1_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            						newLeafNode(lv_start_time_1_0, grammarAccess.getETimeIntervalAccess().getStart_timeSTRINGTerminalRuleCall_0_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getETimeIntervalRule());
            						}
            						setWithLastConsumed(
            							current,
            							"start_time",
            							lv_start_time_1_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalAADMParser.g:1385:3: (otherlv_2= End_time ( (lv_end_time_3_0= RULE_STRING ) ) )
            // InternalAADMParser.g:1386:4: otherlv_2= End_time ( (lv_end_time_3_0= RULE_STRING ) )
            {
            otherlv_2=(Token)match(input,End_time,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getETimeIntervalAccess().getEnd_timeKeyword_1_0());
            			
            // InternalAADMParser.g:1390:4: ( (lv_end_time_3_0= RULE_STRING ) )
            // InternalAADMParser.g:1391:5: (lv_end_time_3_0= RULE_STRING )
            {
            // InternalAADMParser.g:1391:5: (lv_end_time_3_0= RULE_STRING )
            // InternalAADMParser.g:1392:6: lv_end_time_3_0= RULE_STRING
            {
            lv_end_time_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            						newLeafNode(lv_end_time_3_0, grammarAccess.getETimeIntervalAccess().getEnd_timeSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getETimeIntervalRule());
            						}
            						setWithLastConsumed(
            							current,
            							"end_time",
            							lv_end_time_3_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleETimeInterval"


    // $ANTLR start "entryRuleEEvenFilter"
    // InternalAADMParser.g:1413:1: entryRuleEEvenFilter returns [EObject current=null] : iv_ruleEEvenFilter= ruleEEvenFilter EOF ;
    public final EObject entryRuleEEvenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEvenFilter = null;


        try {
            // InternalAADMParser.g:1413:52: (iv_ruleEEvenFilter= ruleEEvenFilter EOF )
            // InternalAADMParser.g:1414:2: iv_ruleEEvenFilter= ruleEEvenFilter EOF
            {
             newCompositeNode(grammarAccess.getEEvenFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEvenFilter=ruleEEvenFilter();

            state._fsp--;

             current =iv_ruleEEvenFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEEvenFilter"


    // $ANTLR start "ruleEEvenFilter"
    // InternalAADMParser.g:1420:1: ruleEEvenFilter returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEEvenFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_node_2_0 = null;

        EObject lv_requirement_4_0 = null;

        EObject lv_capability_6_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1426:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAADMParser.g:1427:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAADMParser.g:1427:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAADMParser.g:1428:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAADMParser.g:1428:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) )
            // InternalAADMParser.g:1429:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEEvenFilterAccess().getUnorderedGroup());
            			
            // InternalAADMParser.g:1432:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?)
            // InternalAADMParser.g:1433:5: ( ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?
            {
            // InternalAADMParser.g:1433:5: ( ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=4;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == Node && getUnorderedGroupHelper().canSelect(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == Requirement && getUnorderedGroupHelper().canSelect(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 == Capability && getUnorderedGroupHelper().canSelect(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 2) ) {
                    alt10=3;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAADMParser.g:1434:3: ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:1434:3: ({...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    // InternalAADMParser.g:1435:4: {...}? => ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEEvenFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAADMParser.g:1435:105: ( ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) ) )
            	    // InternalAADMParser.g:1436:5: ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAADMParser.g:1439:8: ({...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) ) )
            	    // InternalAADMParser.g:1439:9: {...}? => (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEEvenFilter", "true");
            	    }
            	    // InternalAADMParser.g:1439:18: (otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) ) )
            	    // InternalAADMParser.g:1439:19: otherlv_1= Node ( (lv_node_2_0= ruleEPREFIX_REF ) )
            	    {
            	    otherlv_1=(Token)match(input,Node,FOLLOW_12); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEEvenFilterAccess().getNodeKeyword_0_0());
            	    							
            	    // InternalAADMParser.g:1443:8: ( (lv_node_2_0= ruleEPREFIX_REF ) )
            	    // InternalAADMParser.g:1444:9: (lv_node_2_0= ruleEPREFIX_REF )
            	    {
            	    // InternalAADMParser.g:1444:9: (lv_node_2_0= ruleEPREFIX_REF )
            	    // InternalAADMParser.g:1445:10: lv_node_2_0= ruleEPREFIX_REF
            	    {

            	    										newCompositeNode(grammarAccess.getEEvenFilterAccess().getNodeEPREFIX_REFParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_28);
            	    lv_node_2_0=ruleEPREFIX_REF();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEEvenFilterRule());
            	    										}
            	    										set(
            	    											current,
            	    											"node",
            	    											lv_node_2_0,
            	    											"org.sodalite.dsl.AADM.EPREFIX_REF");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEEvenFilterAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAADMParser.g:1468:3: ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:1468:3: ({...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    // InternalAADMParser.g:1469:4: {...}? => ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEEvenFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAADMParser.g:1469:105: ( ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) ) )
            	    // InternalAADMParser.g:1470:5: ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAADMParser.g:1473:8: ({...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) ) )
            	    // InternalAADMParser.g:1473:9: {...}? => (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEEvenFilter", "true");
            	    }
            	    // InternalAADMParser.g:1473:18: (otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) ) )
            	    // InternalAADMParser.g:1473:19: otherlv_3= Requirement ( (lv_requirement_4_0= ruleEPREFIX_REF ) )
            	    {
            	    otherlv_3=(Token)match(input,Requirement,FOLLOW_12); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEEvenFilterAccess().getRequirementKeyword_1_0());
            	    							
            	    // InternalAADMParser.g:1477:8: ( (lv_requirement_4_0= ruleEPREFIX_REF ) )
            	    // InternalAADMParser.g:1478:9: (lv_requirement_4_0= ruleEPREFIX_REF )
            	    {
            	    // InternalAADMParser.g:1478:9: (lv_requirement_4_0= ruleEPREFIX_REF )
            	    // InternalAADMParser.g:1479:10: lv_requirement_4_0= ruleEPREFIX_REF
            	    {

            	    										newCompositeNode(grammarAccess.getEEvenFilterAccess().getRequirementEPREFIX_REFParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_28);
            	    lv_requirement_4_0=ruleEPREFIX_REF();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEEvenFilterRule());
            	    										}
            	    										set(
            	    											current,
            	    											"requirement",
            	    											lv_requirement_4_0,
            	    											"org.sodalite.dsl.AADM.EPREFIX_REF");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEEvenFilterAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAADMParser.g:1502:3: ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:1502:3: ({...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    // InternalAADMParser.g:1503:4: {...}? => ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEEvenFilter", "getUnorderedGroupHelper().canSelect(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAADMParser.g:1503:105: ( ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) ) )
            	    // InternalAADMParser.g:1504:5: ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEEvenFilterAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAADMParser.g:1507:8: ({...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) ) )
            	    // InternalAADMParser.g:1507:9: {...}? => (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEEvenFilter", "true");
            	    }
            	    // InternalAADMParser.g:1507:18: (otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) ) )
            	    // InternalAADMParser.g:1507:19: otherlv_5= Capability ( (lv_capability_6_0= ruleEPREFIX_REF ) )
            	    {
            	    otherlv_5=(Token)match(input,Capability,FOLLOW_12); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEEvenFilterAccess().getCapabilityKeyword_2_0());
            	    							
            	    // InternalAADMParser.g:1511:8: ( (lv_capability_6_0= ruleEPREFIX_REF ) )
            	    // InternalAADMParser.g:1512:9: (lv_capability_6_0= ruleEPREFIX_REF )
            	    {
            	    // InternalAADMParser.g:1512:9: (lv_capability_6_0= ruleEPREFIX_REF )
            	    // InternalAADMParser.g:1513:10: lv_capability_6_0= ruleEPREFIX_REF
            	    {

            	    										newCompositeNode(grammarAccess.getEEvenFilterAccess().getCapabilityEPREFIX_REFParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_28);
            	    lv_capability_6_0=ruleEPREFIX_REF();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEEvenFilterRule());
            	    										}
            	    										set(
            	    											current,
            	    											"capability",
            	    											lv_capability_6_0,
            	    											"org.sodalite.dsl.AADM.EPREFIX_REF");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEEvenFilterAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEEvenFilterAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEEvenFilter", "getUnorderedGroupHelper().canLeave(grammarAccess.getEEvenFilterAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEEvenFilterAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEEvenFilter"


    // $ANTLR start "entryRuleEExtendedTriggerCondition"
    // InternalAADMParser.g:1547:1: entryRuleEExtendedTriggerCondition returns [EObject current=null] : iv_ruleEExtendedTriggerCondition= ruleEExtendedTriggerCondition EOF ;
    public final EObject entryRuleEExtendedTriggerCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExtendedTriggerCondition = null;


        try {
            // InternalAADMParser.g:1547:66: (iv_ruleEExtendedTriggerCondition= ruleEExtendedTriggerCondition EOF )
            // InternalAADMParser.g:1548:2: iv_ruleEExtendedTriggerCondition= ruleEExtendedTriggerCondition EOF
            {
             newCompositeNode(grammarAccess.getEExtendedTriggerConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEExtendedTriggerCondition=ruleEExtendedTriggerCondition();

            state._fsp--;

             current =iv_ruleEExtendedTriggerCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEExtendedTriggerCondition"


    // $ANTLR start "ruleEExtendedTriggerCondition"
    // InternalAADMParser.g:1554:1: ruleEExtendedTriggerCondition returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEExtendedTriggerCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        Token otherlv_5=null;
        Token lv_period_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_method_10_0=null;
        EObject lv_constraint_3_0 = null;

        EObject lv_evaluations_8_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1560:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalAADMParser.g:1561:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalAADMParser.g:1561:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalAADMParser.g:1562:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalAADMParser.g:1562:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalAADMParser.g:1563:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup());
            			
            // InternalAADMParser.g:1566:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalAADMParser.g:1567:5: ( ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalAADMParser.g:1567:5: ( ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) ) )*
            loop11:
            do {
                int alt11=5;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == Constraint && getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == Period && getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == Evaluations && getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == Method && getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 3) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAADMParser.g:1568:3: ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:1568:3: ({...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) ) )
            	    // InternalAADMParser.g:1569:4: {...}? => ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEExtendedTriggerCondition", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAADMParser.g:1569:119: ( ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) ) )
            	    // InternalAADMParser.g:1570:5: ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAADMParser.g:1573:8: ({...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END ) )
            	    // InternalAADMParser.g:1573:9: {...}? => (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExtendedTriggerCondition", "true");
            	    }
            	    // InternalAADMParser.g:1573:18: (otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END )
            	    // InternalAADMParser.g:1573:19: otherlv_1= Constraint this_BEGIN_2= RULE_BEGIN ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) ) this_END_4= RULE_END
            	    {
            	    otherlv_1=(Token)match(input,Constraint,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEExtendedTriggerConditionAccess().getConstraintKeyword_0_0());
            	    							
            	    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            	    								newLeafNode(this_BEGIN_2, grammarAccess.getEExtendedTriggerConditionAccess().getBEGINTerminalRuleCall_0_1());
            	    							
            	    // InternalAADMParser.g:1581:8: ( (lv_constraint_3_0= ruleEConditionClauseDefinition ) )
            	    // InternalAADMParser.g:1582:9: (lv_constraint_3_0= ruleEConditionClauseDefinition )
            	    {
            	    // InternalAADMParser.g:1582:9: (lv_constraint_3_0= ruleEConditionClauseDefinition )
            	    // InternalAADMParser.g:1583:10: lv_constraint_3_0= ruleEConditionClauseDefinition
            	    {

            	    										newCompositeNode(grammarAccess.getEExtendedTriggerConditionAccess().getConstraintEConditionClauseDefinitionParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_constraint_3_0=ruleEConditionClauseDefinition();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEExtendedTriggerConditionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"constraint",
            	    											lv_constraint_3_0,
            	    											"org.sodalite.dsl.AADM.EConditionClauseDefinition");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_4=(Token)match(input,RULE_END,FOLLOW_30); 

            	    								newLeafNode(this_END_4, grammarAccess.getEExtendedTriggerConditionAccess().getENDTerminalRuleCall_0_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAADMParser.g:1610:3: ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:1610:3: ({...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAADMParser.g:1611:4: {...}? => ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEExtendedTriggerCondition", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAADMParser.g:1611:119: ( ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) ) )
            	    // InternalAADMParser.g:1612:5: ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAADMParser.g:1615:8: ({...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) ) )
            	    // InternalAADMParser.g:1615:9: {...}? => (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExtendedTriggerCondition", "true");
            	    }
            	    // InternalAADMParser.g:1615:18: (otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) ) )
            	    // InternalAADMParser.g:1615:19: otherlv_5= Period ( (lv_period_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,Period,FOLLOW_3); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEExtendedTriggerConditionAccess().getPeriodKeyword_1_0());
            	    							
            	    // InternalAADMParser.g:1619:8: ( (lv_period_6_0= RULE_STRING ) )
            	    // InternalAADMParser.g:1620:9: (lv_period_6_0= RULE_STRING )
            	    {
            	    // InternalAADMParser.g:1620:9: (lv_period_6_0= RULE_STRING )
            	    // InternalAADMParser.g:1621:10: lv_period_6_0= RULE_STRING
            	    {
            	    lv_period_6_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            	    										newLeafNode(lv_period_6_0, grammarAccess.getEExtendedTriggerConditionAccess().getPeriodSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEExtendedTriggerConditionRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"period",
            	    											lv_period_6_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAADMParser.g:1643:3: ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:1643:3: ({...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) ) )
            	    // InternalAADMParser.g:1644:4: {...}? => ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEExtendedTriggerCondition", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAADMParser.g:1644:119: ( ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) ) )
            	    // InternalAADMParser.g:1645:5: ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAADMParser.g:1648:8: ({...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) ) )
            	    // InternalAADMParser.g:1648:9: {...}? => (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExtendedTriggerCondition", "true");
            	    }
            	    // InternalAADMParser.g:1648:18: (otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) ) )
            	    // InternalAADMParser.g:1648:19: otherlv_7= Evaluations ( (lv_evaluations_8_0= ruleESIGNEDINT ) )
            	    {
            	    otherlv_7=(Token)match(input,Evaluations,FOLLOW_31); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEExtendedTriggerConditionAccess().getEvaluationsKeyword_2_0());
            	    							
            	    // InternalAADMParser.g:1652:8: ( (lv_evaluations_8_0= ruleESIGNEDINT ) )
            	    // InternalAADMParser.g:1653:9: (lv_evaluations_8_0= ruleESIGNEDINT )
            	    {
            	    // InternalAADMParser.g:1653:9: (lv_evaluations_8_0= ruleESIGNEDINT )
            	    // InternalAADMParser.g:1654:10: lv_evaluations_8_0= ruleESIGNEDINT
            	    {

            	    										newCompositeNode(grammarAccess.getEExtendedTriggerConditionAccess().getEvaluationsESIGNEDINTParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    lv_evaluations_8_0=ruleESIGNEDINT();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEExtendedTriggerConditionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"evaluations",
            	    											lv_evaluations_8_0,
            	    											"org.sodalite.dsl.AADM.ESIGNEDINT");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAADMParser.g:1677:3: ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:1677:3: ({...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAADMParser.g:1678:4: {...}? => ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEExtendedTriggerCondition", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAADMParser.g:1678:119: ( ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) ) )
            	    // InternalAADMParser.g:1679:5: ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAADMParser.g:1682:8: ({...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) ) )
            	    // InternalAADMParser.g:1682:9: {...}? => (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExtendedTriggerCondition", "true");
            	    }
            	    // InternalAADMParser.g:1682:18: (otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) ) )
            	    // InternalAADMParser.g:1682:19: otherlv_9= Method ( (lv_method_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,Method,FOLLOW_3); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEExtendedTriggerConditionAccess().getMethodKeyword_3_0());
            	    							
            	    // InternalAADMParser.g:1686:8: ( (lv_method_10_0= RULE_STRING ) )
            	    // InternalAADMParser.g:1687:9: (lv_method_10_0= RULE_STRING )
            	    {
            	    // InternalAADMParser.g:1687:9: (lv_method_10_0= RULE_STRING )
            	    // InternalAADMParser.g:1688:10: lv_method_10_0= RULE_STRING
            	    {
            	    lv_method_10_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            	    										newLeafNode(lv_method_10_0, grammarAccess.getEExtendedTriggerConditionAccess().getMethodSTRINGTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEExtendedTriggerConditionRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"method",
            	    											lv_method_10_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEExtendedTriggerConditionAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEExtendedTriggerCondition"


    // $ANTLR start "entryRuleEConditionClauseDefinition"
    // InternalAADMParser.g:1720:1: entryRuleEConditionClauseDefinition returns [EObject current=null] : iv_ruleEConditionClauseDefinition= ruleEConditionClauseDefinition EOF ;
    public final EObject entryRuleEConditionClauseDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionClauseDefinition = null;


        try {
            // InternalAADMParser.g:1720:67: (iv_ruleEConditionClauseDefinition= ruleEConditionClauseDefinition EOF )
            // InternalAADMParser.g:1721:2: iv_ruleEConditionClauseDefinition= ruleEConditionClauseDefinition EOF
            {
             newCompositeNode(grammarAccess.getEConditionClauseDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConditionClauseDefinition=ruleEConditionClauseDefinition();

            state._fsp--;

             current =iv_ruleEConditionClauseDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEConditionClauseDefinition"


    // $ANTLR start "ruleEConditionClauseDefinition"
    // InternalAADMParser.g:1727:1: ruleEConditionClauseDefinition returns [EObject current=null] : (this_EConditionClauseDefinitionAND_0= ruleEConditionClauseDefinitionAND | this_EConditionClauseDefinitionOR_1= ruleEConditionClauseDefinitionOR | this_EConditionClauseDefinitionNOT_2= ruleEConditionClauseDefinitionNOT | this_EConditionClauseDefinitionAssert_3= ruleEConditionClauseDefinitionAssert ) ;
    public final EObject ruleEConditionClauseDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_EConditionClauseDefinitionAND_0 = null;

        EObject this_EConditionClauseDefinitionOR_1 = null;

        EObject this_EConditionClauseDefinitionNOT_2 = null;

        EObject this_EConditionClauseDefinitionAssert_3 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1733:2: ( (this_EConditionClauseDefinitionAND_0= ruleEConditionClauseDefinitionAND | this_EConditionClauseDefinitionOR_1= ruleEConditionClauseDefinitionOR | this_EConditionClauseDefinitionNOT_2= ruleEConditionClauseDefinitionNOT | this_EConditionClauseDefinitionAssert_3= ruleEConditionClauseDefinitionAssert ) )
            // InternalAADMParser.g:1734:2: (this_EConditionClauseDefinitionAND_0= ruleEConditionClauseDefinitionAND | this_EConditionClauseDefinitionOR_1= ruleEConditionClauseDefinitionOR | this_EConditionClauseDefinitionNOT_2= ruleEConditionClauseDefinitionNOT | this_EConditionClauseDefinitionAssert_3= ruleEConditionClauseDefinitionAssert )
            {
            // InternalAADMParser.g:1734:2: (this_EConditionClauseDefinitionAND_0= ruleEConditionClauseDefinitionAND | this_EConditionClauseDefinitionOR_1= ruleEConditionClauseDefinitionOR | this_EConditionClauseDefinitionNOT_2= ruleEConditionClauseDefinitionNOT | this_EConditionClauseDefinitionAssert_3= ruleEConditionClauseDefinitionAssert )
            int alt12=4;
            switch ( input.LA(1) ) {
            case And:
                {
                alt12=1;
                }
                break;
            case Or:
                {
                alt12=2;
                }
                break;
            case Not:
                {
                alt12=3;
                }
                break;
            case EOF:
            case RULE_ID:
            case RULE_END:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAADMParser.g:1735:3: this_EConditionClauseDefinitionAND_0= ruleEConditionClauseDefinitionAND
                    {

                    			newCompositeNode(grammarAccess.getEConditionClauseDefinitionAccess().getEConditionClauseDefinitionANDParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EConditionClauseDefinitionAND_0=ruleEConditionClauseDefinitionAND();

                    state._fsp--;


                    			current = this_EConditionClauseDefinitionAND_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAADMParser.g:1744:3: this_EConditionClauseDefinitionOR_1= ruleEConditionClauseDefinitionOR
                    {

                    			newCompositeNode(grammarAccess.getEConditionClauseDefinitionAccess().getEConditionClauseDefinitionORParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EConditionClauseDefinitionOR_1=ruleEConditionClauseDefinitionOR();

                    state._fsp--;


                    			current = this_EConditionClauseDefinitionOR_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAADMParser.g:1753:3: this_EConditionClauseDefinitionNOT_2= ruleEConditionClauseDefinitionNOT
                    {

                    			newCompositeNode(grammarAccess.getEConditionClauseDefinitionAccess().getEConditionClauseDefinitionNOTParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EConditionClauseDefinitionNOT_2=ruleEConditionClauseDefinitionNOT();

                    state._fsp--;


                    			current = this_EConditionClauseDefinitionNOT_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAADMParser.g:1762:3: this_EConditionClauseDefinitionAssert_3= ruleEConditionClauseDefinitionAssert
                    {

                    			newCompositeNode(grammarAccess.getEConditionClauseDefinitionAccess().getEConditionClauseDefinitionAssertParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EConditionClauseDefinitionAssert_3=ruleEConditionClauseDefinitionAssert();

                    state._fsp--;


                    			current = this_EConditionClauseDefinitionAssert_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEConditionClauseDefinition"


    // $ANTLR start "entryRuleEConditionClauseDefinitionAND"
    // InternalAADMParser.g:1774:1: entryRuleEConditionClauseDefinitionAND returns [EObject current=null] : iv_ruleEConditionClauseDefinitionAND= ruleEConditionClauseDefinitionAND EOF ;
    public final EObject entryRuleEConditionClauseDefinitionAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionClauseDefinitionAND = null;


        try {
            // InternalAADMParser.g:1774:70: (iv_ruleEConditionClauseDefinitionAND= ruleEConditionClauseDefinitionAND EOF )
            // InternalAADMParser.g:1775:2: iv_ruleEConditionClauseDefinitionAND= ruleEConditionClauseDefinitionAND EOF
            {
             newCompositeNode(grammarAccess.getEConditionClauseDefinitionANDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConditionClauseDefinitionAND=ruleEConditionClauseDefinitionAND();

            state._fsp--;

             current =iv_ruleEConditionClauseDefinitionAND; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEConditionClauseDefinitionAND"


    // $ANTLR start "ruleEConditionClauseDefinitionAND"
    // InternalAADMParser.g:1781:1: ruleEConditionClauseDefinitionAND returns [EObject current=null] : (otherlv_0= And this_BEGIN_1= RULE_BEGIN ( (lv_and_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEConditionClauseDefinitionAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_and_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1787:2: ( (otherlv_0= And this_BEGIN_1= RULE_BEGIN ( (lv_and_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END ) )
            // InternalAADMParser.g:1788:2: (otherlv_0= And this_BEGIN_1= RULE_BEGIN ( (lv_and_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END )
            {
            // InternalAADMParser.g:1788:2: (otherlv_0= And this_BEGIN_1= RULE_BEGIN ( (lv_and_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END )
            // InternalAADMParser.g:1789:3: otherlv_0= And this_BEGIN_1= RULE_BEGIN ( (lv_and_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,And,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEConditionClauseDefinitionANDAccess().getAndKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEConditionClauseDefinitionANDAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalAADMParser.g:1797:3: ( (lv_and_2_0= ruleEConditionClauseDefinition ) )
            // InternalAADMParser.g:1798:4: (lv_and_2_0= ruleEConditionClauseDefinition )
            {
            // InternalAADMParser.g:1798:4: (lv_and_2_0= ruleEConditionClauseDefinition )
            // InternalAADMParser.g:1799:5: lv_and_2_0= ruleEConditionClauseDefinition
            {

            					newCompositeNode(grammarAccess.getEConditionClauseDefinitionANDAccess().getAndEConditionClauseDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_and_2_0=ruleEConditionClauseDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEConditionClauseDefinitionANDRule());
            					}
            					set(
            						current,
            						"and",
            						lv_and_2_0,
            						"org.sodalite.dsl.AADM.EConditionClauseDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEConditionClauseDefinitionANDAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEConditionClauseDefinitionAND"


    // $ANTLR start "entryRuleEConditionClauseDefinitionOR"
    // InternalAADMParser.g:1824:1: entryRuleEConditionClauseDefinitionOR returns [EObject current=null] : iv_ruleEConditionClauseDefinitionOR= ruleEConditionClauseDefinitionOR EOF ;
    public final EObject entryRuleEConditionClauseDefinitionOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionClauseDefinitionOR = null;


        try {
            // InternalAADMParser.g:1824:69: (iv_ruleEConditionClauseDefinitionOR= ruleEConditionClauseDefinitionOR EOF )
            // InternalAADMParser.g:1825:2: iv_ruleEConditionClauseDefinitionOR= ruleEConditionClauseDefinitionOR EOF
            {
             newCompositeNode(grammarAccess.getEConditionClauseDefinitionORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConditionClauseDefinitionOR=ruleEConditionClauseDefinitionOR();

            state._fsp--;

             current =iv_ruleEConditionClauseDefinitionOR; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEConditionClauseDefinitionOR"


    // $ANTLR start "ruleEConditionClauseDefinitionOR"
    // InternalAADMParser.g:1831:1: ruleEConditionClauseDefinitionOR returns [EObject current=null] : (otherlv_0= Or this_BEGIN_1= RULE_BEGIN ( (lv_or_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEConditionClauseDefinitionOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_or_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1837:2: ( (otherlv_0= Or this_BEGIN_1= RULE_BEGIN ( (lv_or_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END ) )
            // InternalAADMParser.g:1838:2: (otherlv_0= Or this_BEGIN_1= RULE_BEGIN ( (lv_or_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END )
            {
            // InternalAADMParser.g:1838:2: (otherlv_0= Or this_BEGIN_1= RULE_BEGIN ( (lv_or_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END )
            // InternalAADMParser.g:1839:3: otherlv_0= Or this_BEGIN_1= RULE_BEGIN ( (lv_or_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Or,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEConditionClauseDefinitionORAccess().getOrKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEConditionClauseDefinitionORAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalAADMParser.g:1847:3: ( (lv_or_2_0= ruleEConditionClauseDefinition ) )
            // InternalAADMParser.g:1848:4: (lv_or_2_0= ruleEConditionClauseDefinition )
            {
            // InternalAADMParser.g:1848:4: (lv_or_2_0= ruleEConditionClauseDefinition )
            // InternalAADMParser.g:1849:5: lv_or_2_0= ruleEConditionClauseDefinition
            {

            					newCompositeNode(grammarAccess.getEConditionClauseDefinitionORAccess().getOrEConditionClauseDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_or_2_0=ruleEConditionClauseDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEConditionClauseDefinitionORRule());
            					}
            					set(
            						current,
            						"or",
            						lv_or_2_0,
            						"org.sodalite.dsl.AADM.EConditionClauseDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEConditionClauseDefinitionORAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEConditionClauseDefinitionOR"


    // $ANTLR start "entryRuleEConditionClauseDefinitionNOT"
    // InternalAADMParser.g:1874:1: entryRuleEConditionClauseDefinitionNOT returns [EObject current=null] : iv_ruleEConditionClauseDefinitionNOT= ruleEConditionClauseDefinitionNOT EOF ;
    public final EObject entryRuleEConditionClauseDefinitionNOT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionClauseDefinitionNOT = null;


        try {
            // InternalAADMParser.g:1874:70: (iv_ruleEConditionClauseDefinitionNOT= ruleEConditionClauseDefinitionNOT EOF )
            // InternalAADMParser.g:1875:2: iv_ruleEConditionClauseDefinitionNOT= ruleEConditionClauseDefinitionNOT EOF
            {
             newCompositeNode(grammarAccess.getEConditionClauseDefinitionNOTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConditionClauseDefinitionNOT=ruleEConditionClauseDefinitionNOT();

            state._fsp--;

             current =iv_ruleEConditionClauseDefinitionNOT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEConditionClauseDefinitionNOT"


    // $ANTLR start "ruleEConditionClauseDefinitionNOT"
    // InternalAADMParser.g:1881:1: ruleEConditionClauseDefinitionNOT returns [EObject current=null] : (otherlv_0= Not this_BEGIN_1= RULE_BEGIN ( (lv_not_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END ) ;
    public final EObject ruleEConditionClauseDefinitionNOT() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_not_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1887:2: ( (otherlv_0= Not this_BEGIN_1= RULE_BEGIN ( (lv_not_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END ) )
            // InternalAADMParser.g:1888:2: (otherlv_0= Not this_BEGIN_1= RULE_BEGIN ( (lv_not_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END )
            {
            // InternalAADMParser.g:1888:2: (otherlv_0= Not this_BEGIN_1= RULE_BEGIN ( (lv_not_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END )
            // InternalAADMParser.g:1889:3: otherlv_0= Not this_BEGIN_1= RULE_BEGIN ( (lv_not_2_0= ruleEConditionClauseDefinition ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Not,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEConditionClauseDefinitionNOTAccess().getNotKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_29); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getEConditionClauseDefinitionNOTAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalAADMParser.g:1897:3: ( (lv_not_2_0= ruleEConditionClauseDefinition ) )
            // InternalAADMParser.g:1898:4: (lv_not_2_0= ruleEConditionClauseDefinition )
            {
            // InternalAADMParser.g:1898:4: (lv_not_2_0= ruleEConditionClauseDefinition )
            // InternalAADMParser.g:1899:5: lv_not_2_0= ruleEConditionClauseDefinition
            {

            					newCompositeNode(grammarAccess.getEConditionClauseDefinitionNOTAccess().getNotEConditionClauseDefinitionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_not_2_0=ruleEConditionClauseDefinition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEConditionClauseDefinitionNOTRule());
            					}
            					set(
            						current,
            						"not",
            						lv_not_2_0,
            						"org.sodalite.dsl.AADM.EConditionClauseDefinition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getEConditionClauseDefinitionNOTAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEConditionClauseDefinitionNOT"


    // $ANTLR start "entryRuleEConditionClauseDefinitionAssert"
    // InternalAADMParser.g:1924:1: entryRuleEConditionClauseDefinitionAssert returns [EObject current=null] : iv_ruleEConditionClauseDefinitionAssert= ruleEConditionClauseDefinitionAssert EOF ;
    public final EObject entryRuleEConditionClauseDefinitionAssert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionClauseDefinitionAssert = null;


        try {
            // InternalAADMParser.g:1924:73: (iv_ruleEConditionClauseDefinitionAssert= ruleEConditionClauseDefinitionAssert EOF )
            // InternalAADMParser.g:1925:2: iv_ruleEConditionClauseDefinitionAssert= ruleEConditionClauseDefinitionAssert EOF
            {
             newCompositeNode(grammarAccess.getEConditionClauseDefinitionAssertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConditionClauseDefinitionAssert=ruleEConditionClauseDefinitionAssert();

            state._fsp--;

             current =iv_ruleEConditionClauseDefinitionAssert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEConditionClauseDefinitionAssert"


    // $ANTLR start "ruleEConditionClauseDefinitionAssert"
    // InternalAADMParser.g:1931:1: ruleEConditionClauseDefinitionAssert returns [EObject current=null] : ( () ( (lv_assertions_1_0= ruleEAssertionDefinition ) )* ) ;
    public final EObject ruleEConditionClauseDefinitionAssert() throws RecognitionException {
        EObject current = null;

        EObject lv_assertions_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1937:2: ( ( () ( (lv_assertions_1_0= ruleEAssertionDefinition ) )* ) )
            // InternalAADMParser.g:1938:2: ( () ( (lv_assertions_1_0= ruleEAssertionDefinition ) )* )
            {
            // InternalAADMParser.g:1938:2: ( () ( (lv_assertions_1_0= ruleEAssertionDefinition ) )* )
            // InternalAADMParser.g:1939:3: () ( (lv_assertions_1_0= ruleEAssertionDefinition ) )*
            {
            // InternalAADMParser.g:1939:3: ()
            // InternalAADMParser.g:1940:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConditionClauseDefinitionAssertAccess().getEConditionClauseDefinitionAssertAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:1946:3: ( (lv_assertions_1_0= ruleEAssertionDefinition ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAADMParser.g:1947:4: (lv_assertions_1_0= ruleEAssertionDefinition )
            	    {
            	    // InternalAADMParser.g:1947:4: (lv_assertions_1_0= ruleEAssertionDefinition )
            	    // InternalAADMParser.g:1948:5: lv_assertions_1_0= ruleEAssertionDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEConditionClauseDefinitionAssertAccess().getAssertionsEAssertionDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_assertions_1_0=ruleEAssertionDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEConditionClauseDefinitionAssertRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assertions",
            	    						lv_assertions_1_0,
            	    						"org.sodalite.dsl.AADM.EAssertionDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEConditionClauseDefinitionAssert"


    // $ANTLR start "entryRuleEAssertionDefinition"
    // InternalAADMParser.g:1969:1: entryRuleEAssertionDefinition returns [EObject current=null] : iv_ruleEAssertionDefinition= ruleEAssertionDefinition EOF ;
    public final EObject entryRuleEAssertionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssertionDefinition = null;


        try {
            // InternalAADMParser.g:1969:61: (iv_ruleEAssertionDefinition= ruleEAssertionDefinition EOF )
            // InternalAADMParser.g:1970:2: iv_ruleEAssertionDefinition= ruleEAssertionDefinition EOF
            {
             newCompositeNode(grammarAccess.getEAssertionDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAssertionDefinition=ruleEAssertionDefinition();

            state._fsp--;

             current =iv_ruleEAssertionDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAssertionDefinition"


    // $ANTLR start "ruleEAssertionDefinition"
    // InternalAADMParser.g:1976:1: ruleEAssertionDefinition returns [EObject current=null] : ( ( (lv_attribute_name_0_0= RULE_ID ) ) otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_constraints_3_0= ruleEConstraintList ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleEAssertionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_attribute_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:1982:2: ( ( ( (lv_attribute_name_0_0= RULE_ID ) ) otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_constraints_3_0= ruleEConstraintList ) ) otherlv_4= RightSquareBracket ) )
            // InternalAADMParser.g:1983:2: ( ( (lv_attribute_name_0_0= RULE_ID ) ) otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_constraints_3_0= ruleEConstraintList ) ) otherlv_4= RightSquareBracket )
            {
            // InternalAADMParser.g:1983:2: ( ( (lv_attribute_name_0_0= RULE_ID ) ) otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_constraints_3_0= ruleEConstraintList ) ) otherlv_4= RightSquareBracket )
            // InternalAADMParser.g:1984:3: ( (lv_attribute_name_0_0= RULE_ID ) ) otherlv_1= Colon otherlv_2= LeftSquareBracket ( (lv_constraints_3_0= ruleEConstraintList ) ) otherlv_4= RightSquareBracket
            {
            // InternalAADMParser.g:1984:3: ( (lv_attribute_name_0_0= RULE_ID ) )
            // InternalAADMParser.g:1985:4: (lv_attribute_name_0_0= RULE_ID )
            {
            // InternalAADMParser.g:1985:4: (lv_attribute_name_0_0= RULE_ID )
            // InternalAADMParser.g:1986:5: lv_attribute_name_0_0= RULE_ID
            {
            lv_attribute_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_attribute_name_0_0, grammarAccess.getEAssertionDefinitionAccess().getAttribute_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEAssertionDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"attribute_name",
            						lv_attribute_name_0_0,
            						"org.sodalite.dsl.AADM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEAssertionDefinitionAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getEAssertionDefinitionAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalAADMParser.g:2010:3: ( (lv_constraints_3_0= ruleEConstraintList ) )
            // InternalAADMParser.g:2011:4: (lv_constraints_3_0= ruleEConstraintList )
            {
            // InternalAADMParser.g:2011:4: (lv_constraints_3_0= ruleEConstraintList )
            // InternalAADMParser.g:2012:5: lv_constraints_3_0= ruleEConstraintList
            {

            					newCompositeNode(grammarAccess.getEAssertionDefinitionAccess().getConstraintsEConstraintListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_constraints_3_0=ruleEConstraintList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAssertionDefinitionRule());
            					}
            					set(
            						current,
            						"constraints",
            						lv_constraints_3_0,
            						"org.sodalite.dsl.AADM.EConstraintList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEAssertionDefinitionAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAssertionDefinition"


    // $ANTLR start "entryRuleEConstraintList"
    // InternalAADMParser.g:2037:1: entryRuleEConstraintList returns [EObject current=null] : iv_ruleEConstraintList= ruleEConstraintList EOF ;
    public final EObject entryRuleEConstraintList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraintList = null;


        try {
            // InternalAADMParser.g:2037:56: (iv_ruleEConstraintList= ruleEConstraintList EOF )
            // InternalAADMParser.g:2038:2: iv_ruleEConstraintList= ruleEConstraintList EOF
            {
             newCompositeNode(grammarAccess.getEConstraintListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConstraintList=ruleEConstraintList();

            state._fsp--;

             current =iv_ruleEConstraintList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEConstraintList"


    // $ANTLR start "ruleEConstraintList"
    // InternalAADMParser.g:2044:1: ruleEConstraintList returns [EObject current=null] : ( ( (lv_list_0_0= ruleEConstraint ) ) (otherlv_1= Comma ( (lv_list_2_0= ruleEConstraint ) ) )* ) ;
    public final EObject ruleEConstraintList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_list_0_0 = null;

        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2050:2: ( ( ( (lv_list_0_0= ruleEConstraint ) ) (otherlv_1= Comma ( (lv_list_2_0= ruleEConstraint ) ) )* ) )
            // InternalAADMParser.g:2051:2: ( ( (lv_list_0_0= ruleEConstraint ) ) (otherlv_1= Comma ( (lv_list_2_0= ruleEConstraint ) ) )* )
            {
            // InternalAADMParser.g:2051:2: ( ( (lv_list_0_0= ruleEConstraint ) ) (otherlv_1= Comma ( (lv_list_2_0= ruleEConstraint ) ) )* )
            // InternalAADMParser.g:2052:3: ( (lv_list_0_0= ruleEConstraint ) ) (otherlv_1= Comma ( (lv_list_2_0= ruleEConstraint ) ) )*
            {
            // InternalAADMParser.g:2052:3: ( (lv_list_0_0= ruleEConstraint ) )
            // InternalAADMParser.g:2053:4: (lv_list_0_0= ruleEConstraint )
            {
            // InternalAADMParser.g:2053:4: (lv_list_0_0= ruleEConstraint )
            // InternalAADMParser.g:2054:5: lv_list_0_0= ruleEConstraint
            {

            					newCompositeNode(grammarAccess.getEConstraintListAccess().getListEConstraintParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_list_0_0=ruleEConstraint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEConstraintListRule());
            					}
            					add(
            						current,
            						"list",
            						lv_list_0_0,
            						"org.sodalite.dsl.AADM.EConstraint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAADMParser.g:2071:3: (otherlv_1= Comma ( (lv_list_2_0= ruleEConstraint ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAADMParser.g:2072:4: otherlv_1= Comma ( (lv_list_2_0= ruleEConstraint ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_32); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEConstraintListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAADMParser.g:2076:4: ( (lv_list_2_0= ruleEConstraint ) )
            	    // InternalAADMParser.g:2077:5: (lv_list_2_0= ruleEConstraint )
            	    {
            	    // InternalAADMParser.g:2077:5: (lv_list_2_0= ruleEConstraint )
            	    // InternalAADMParser.g:2078:6: lv_list_2_0= ruleEConstraint
            	    {

            	    						newCompositeNode(grammarAccess.getEConstraintListAccess().getListEConstraintParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_list_2_0=ruleEConstraint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEConstraintListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_2_0,
            	    							"org.sodalite.dsl.AADM.EConstraint");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEConstraintList"


    // $ANTLR start "entryRuleEConstraint"
    // InternalAADMParser.g:2100:1: entryRuleEConstraint returns [EObject current=null] : iv_ruleEConstraint= ruleEConstraint EOF ;
    public final EObject entryRuleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraint = null;


        try {
            // InternalAADMParser.g:2100:52: (iv_ruleEConstraint= ruleEConstraint EOF )
            // InternalAADMParser.g:2101:2: iv_ruleEConstraint= ruleEConstraint EOF
            {
             newCompositeNode(grammarAccess.getEConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConstraint=ruleEConstraint();

            state._fsp--;

             current =iv_ruleEConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEConstraint"


    // $ANTLR start "ruleEConstraint"
    // InternalAADMParser.g:2107:1: ruleEConstraint returns [EObject current=null] : (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) ;
    public final EObject ruleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_EEqual_0 = null;

        EObject this_EGreaterThan_1 = null;

        EObject this_EGreaterOrEqual_2 = null;

        EObject this_ELessThan_3 = null;

        EObject this_ELessOrEqual_4 = null;

        EObject this_EInRange_5 = null;

        EObject this_EValid_Values_6 = null;

        EObject this_ELength_7 = null;

        EObject this_EMinLength_8 = null;

        EObject this_EMaxLength_9 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2113:2: ( (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) )
            // InternalAADMParser.g:2114:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            {
            // InternalAADMParser.g:2114:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            int alt15=10;
            switch ( input.LA(1) ) {
            case Equal:
                {
                alt15=1;
                }
                break;
            case Greater_than:
                {
                alt15=2;
                }
                break;
            case Greater_or_equal:
                {
                alt15=3;
                }
                break;
            case Less_than:
                {
                alt15=4;
                }
                break;
            case Less_or_equal:
                {
                alt15=5;
                }
                break;
            case In_range:
                {
                alt15=6;
                }
                break;
            case Valid_values:
                {
                alt15=7;
                }
                break;
            case Length:
                {
                alt15=8;
                }
                break;
            case Min_length:
                {
                alt15=9;
                }
                break;
            case Max_length:
                {
                alt15=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalAADMParser.g:2115:3: this_EEqual_0= ruleEEqual
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEEqualParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EEqual_0=ruleEEqual();

                    state._fsp--;


                    			current = this_EEqual_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAADMParser.g:2124:3: this_EGreaterThan_1= ruleEGreaterThan
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEGreaterThanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EGreaterThan_1=ruleEGreaterThan();

                    state._fsp--;


                    			current = this_EGreaterThan_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAADMParser.g:2133:3: this_EGreaterOrEqual_2= ruleEGreaterOrEqual
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEGreaterOrEqualParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EGreaterOrEqual_2=ruleEGreaterOrEqual();

                    state._fsp--;


                    			current = this_EGreaterOrEqual_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAADMParser.g:2142:3: this_ELessThan_3= ruleELessThan
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getELessThanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELessThan_3=ruleELessThan();

                    state._fsp--;


                    			current = this_ELessThan_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAADMParser.g:2151:3: this_ELessOrEqual_4= ruleELessOrEqual
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getELessOrEqualParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELessOrEqual_4=ruleELessOrEqual();

                    state._fsp--;


                    			current = this_ELessOrEqual_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalAADMParser.g:2160:3: this_EInRange_5= ruleEInRange
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEInRangeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EInRange_5=ruleEInRange();

                    state._fsp--;


                    			current = this_EInRange_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalAADMParser.g:2169:3: this_EValid_Values_6= ruleEValid_Values
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEValid_ValuesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EValid_Values_6=ruleEValid_Values();

                    state._fsp--;


                    			current = this_EValid_Values_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalAADMParser.g:2178:3: this_ELength_7= ruleELength
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getELengthParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELength_7=ruleELength();

                    state._fsp--;


                    			current = this_ELength_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalAADMParser.g:2187:3: this_EMinLength_8= ruleEMinLength
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEMinLengthParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EMinLength_8=ruleEMinLength();

                    state._fsp--;


                    			current = this_EMinLength_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalAADMParser.g:2196:3: this_EMaxLength_9= ruleEMaxLength
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEMaxLengthParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EMaxLength_9=ruleEMaxLength();

                    state._fsp--;


                    			current = this_EMaxLength_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEConstraint"


    // $ANTLR start "entryRuleEMaxLength"
    // InternalAADMParser.g:2208:1: entryRuleEMaxLength returns [EObject current=null] : iv_ruleEMaxLength= ruleEMaxLength EOF ;
    public final EObject entryRuleEMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMaxLength = null;


        try {
            // InternalAADMParser.g:2208:51: (iv_ruleEMaxLength= ruleEMaxLength EOF )
            // InternalAADMParser.g:2209:2: iv_ruleEMaxLength= ruleEMaxLength EOF
            {
             newCompositeNode(grammarAccess.getEMaxLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMaxLength=ruleEMaxLength();

            state._fsp--;

             current =iv_ruleEMaxLength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMaxLength"


    // $ANTLR start "ruleEMaxLength"
    // InternalAADMParser.g:2215:1: ruleEMaxLength returns [EObject current=null] : (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2221:2: ( (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalAADMParser.g:2222:2: (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalAADMParser.g:2222:2: (otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalAADMParser.g:2223:3: otherlv_0= Max_length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Max_length,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getEMaxLengthAccess().getMax_lengthKeyword_0());
            		
            // InternalAADMParser.g:2227:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalAADMParser.g:2228:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalAADMParser.g:2228:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalAADMParser.g:2229:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEMaxLengthAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEMaxLengthRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.AADM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMaxLength"


    // $ANTLR start "entryRuleEMinLength"
    // InternalAADMParser.g:2250:1: entryRuleEMinLength returns [EObject current=null] : iv_ruleEMinLength= ruleEMinLength EOF ;
    public final EObject entryRuleEMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMinLength = null;


        try {
            // InternalAADMParser.g:2250:51: (iv_ruleEMinLength= ruleEMinLength EOF )
            // InternalAADMParser.g:2251:2: iv_ruleEMinLength= ruleEMinLength EOF
            {
             newCompositeNode(grammarAccess.getEMinLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMinLength=ruleEMinLength();

            state._fsp--;

             current =iv_ruleEMinLength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMinLength"


    // $ANTLR start "ruleEMinLength"
    // InternalAADMParser.g:2257:1: ruleEMinLength returns [EObject current=null] : (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2263:2: ( (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalAADMParser.g:2264:2: (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalAADMParser.g:2264:2: (otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalAADMParser.g:2265:3: otherlv_0= Min_length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Min_length,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getEMinLengthAccess().getMin_lengthKeyword_0());
            		
            // InternalAADMParser.g:2269:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalAADMParser.g:2270:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalAADMParser.g:2270:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalAADMParser.g:2271:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEMinLengthAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEMinLengthRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.AADM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMinLength"


    // $ANTLR start "entryRuleELength"
    // InternalAADMParser.g:2292:1: entryRuleELength returns [EObject current=null] : iv_ruleELength= ruleELength EOF ;
    public final EObject entryRuleELength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELength = null;


        try {
            // InternalAADMParser.g:2292:48: (iv_ruleELength= ruleELength EOF )
            // InternalAADMParser.g:2293:2: iv_ruleELength= ruleELength EOF
            {
             newCompositeNode(grammarAccess.getELengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELength=ruleELength();

            state._fsp--;

             current =iv_ruleELength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELength"


    // $ANTLR start "ruleELength"
    // InternalAADMParser.g:2299:1: ruleELength returns [EObject current=null] : (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2305:2: ( (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalAADMParser.g:2306:2: (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalAADMParser.g:2306:2: (otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalAADMParser.g:2307:3: otherlv_0= Length ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Length,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getELengthAccess().getLengthKeyword_0());
            		
            // InternalAADMParser.g:2311:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalAADMParser.g:2312:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalAADMParser.g:2312:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalAADMParser.g:2313:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getELengthAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getELengthRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.AADM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELength"


    // $ANTLR start "entryRuleEValid_Values"
    // InternalAADMParser.g:2334:1: entryRuleEValid_Values returns [EObject current=null] : iv_ruleEValid_Values= ruleEValid_Values EOF ;
    public final EObject entryRuleEValid_Values() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValid_Values = null;


        try {
            // InternalAADMParser.g:2334:54: (iv_ruleEValid_Values= ruleEValid_Values EOF )
            // InternalAADMParser.g:2335:2: iv_ruleEValid_Values= ruleEValid_Values EOF
            {
             newCompositeNode(grammarAccess.getEValid_ValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValid_Values=ruleEValid_Values();

            state._fsp--;

             current =iv_ruleEValid_Values; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEValid_Values"


    // $ANTLR start "ruleEValid_Values"
    // InternalAADMParser.g:2341:1: ruleEValid_Values returns [EObject current=null] : (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) ) ;
    public final EObject ruleEValid_Values() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2347:2: ( (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) ) )
            // InternalAADMParser.g:2348:2: (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) )
            {
            // InternalAADMParser.g:2348:2: (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) )
            // InternalAADMParser.g:2349:3: otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) )
            {
            otherlv_0=(Token)match(input,Valid_values,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEValid_ValuesAccess().getValid_valuesKeyword_0());
            		
            // InternalAADMParser.g:2353:3: ( (lv_val_1_0= ruleELIST ) )
            // InternalAADMParser.g:2354:4: (lv_val_1_0= ruleELIST )
            {
            // InternalAADMParser.g:2354:4: (lv_val_1_0= ruleELIST )
            // InternalAADMParser.g:2355:5: lv_val_1_0= ruleELIST
            {

            					newCompositeNode(grammarAccess.getEValid_ValuesAccess().getValELISTParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleELIST();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEValid_ValuesRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.AADM.ELIST");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEValid_Values"


    // $ANTLR start "entryRuleEInRange"
    // InternalAADMParser.g:2376:1: entryRuleEInRange returns [EObject current=null] : iv_ruleEInRange= ruleEInRange EOF ;
    public final EObject entryRuleEInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInRange = null;


        try {
            // InternalAADMParser.g:2376:49: (iv_ruleEInRange= ruleEInRange EOF )
            // InternalAADMParser.g:2377:2: iv_ruleEInRange= ruleEInRange EOF
            {
             newCompositeNode(grammarAccess.getEInRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInRange=ruleEInRange();

            state._fsp--;

             current =iv_ruleEInRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInRange"


    // $ANTLR start "ruleEInRange"
    // InternalAADMParser.g:2383:1: ruleEInRange returns [EObject current=null] : (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket ) ;
    public final EObject ruleEInRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_start_2_0 = null;

        EObject lv_end_4_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2389:2: ( (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket ) )
            // InternalAADMParser.g:2390:2: (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket )
            {
            // InternalAADMParser.g:2390:2: (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket )
            // InternalAADMParser.g:2391:3: otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= ruleEAlphaNumericValue ) ) otherlv_3= Comma ( (lv_end_4_0= ruleEAlphaNumericValue ) ) otherlv_5= RightSquareBracket
            {
            otherlv_0=(Token)match(input,In_range,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEInRangeAccess().getIn_rangeKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getEInRangeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAADMParser.g:2399:3: ( (lv_start_2_0= ruleEAlphaNumericValue ) )
            // InternalAADMParser.g:2400:4: (lv_start_2_0= ruleEAlphaNumericValue )
            {
            // InternalAADMParser.g:2400:4: (lv_start_2_0= ruleEAlphaNumericValue )
            // InternalAADMParser.g:2401:5: lv_start_2_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEInRangeAccess().getStartEAlphaNumericValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_35);
            lv_start_2_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInRangeRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.sodalite.dsl.AADM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getEInRangeAccess().getCommaKeyword_3());
            		
            // InternalAADMParser.g:2422:3: ( (lv_end_4_0= ruleEAlphaNumericValue ) )
            // InternalAADMParser.g:2423:4: (lv_end_4_0= ruleEAlphaNumericValue )
            {
            // InternalAADMParser.g:2423:4: (lv_end_4_0= ruleEAlphaNumericValue )
            // InternalAADMParser.g:2424:5: lv_end_4_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEInRangeAccess().getEndEAlphaNumericValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_end_4_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInRangeRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.sodalite.dsl.AADM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEInRangeAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInRange"


    // $ANTLR start "entryRuleELessOrEqual"
    // InternalAADMParser.g:2449:1: entryRuleELessOrEqual returns [EObject current=null] : iv_ruleELessOrEqual= ruleELessOrEqual EOF ;
    public final EObject entryRuleELessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessOrEqual = null;


        try {
            // InternalAADMParser.g:2449:53: (iv_ruleELessOrEqual= ruleELessOrEqual EOF )
            // InternalAADMParser.g:2450:2: iv_ruleELessOrEqual= ruleELessOrEqual EOF
            {
             newCompositeNode(grammarAccess.getELessOrEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELessOrEqual=ruleELessOrEqual();

            state._fsp--;

             current =iv_ruleELessOrEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELessOrEqual"


    // $ANTLR start "ruleELessOrEqual"
    // InternalAADMParser.g:2456:1: ruleELessOrEqual returns [EObject current=null] : (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2462:2: ( (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalAADMParser.g:2463:2: (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalAADMParser.g:2463:2: (otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalAADMParser.g:2464:3: otherlv_0= Less_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Less_or_equal,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getELessOrEqualAccess().getLess_or_equalKeyword_0());
            		
            // InternalAADMParser.g:2468:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalAADMParser.g:2469:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalAADMParser.g:2469:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalAADMParser.g:2470:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getELessOrEqualAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getELessOrEqualRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.AADM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELessOrEqual"


    // $ANTLR start "entryRuleELessThan"
    // InternalAADMParser.g:2491:1: entryRuleELessThan returns [EObject current=null] : iv_ruleELessThan= ruleELessThan EOF ;
    public final EObject entryRuleELessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessThan = null;


        try {
            // InternalAADMParser.g:2491:50: (iv_ruleELessThan= ruleELessThan EOF )
            // InternalAADMParser.g:2492:2: iv_ruleELessThan= ruleELessThan EOF
            {
             newCompositeNode(grammarAccess.getELessThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELessThan=ruleELessThan();

            state._fsp--;

             current =iv_ruleELessThan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELessThan"


    // $ANTLR start "ruleELessThan"
    // InternalAADMParser.g:2498:1: ruleELessThan returns [EObject current=null] : (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleELessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2504:2: ( (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalAADMParser.g:2505:2: (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalAADMParser.g:2505:2: (otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalAADMParser.g:2506:3: otherlv_0= Less_than ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Less_than,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getELessThanAccess().getLess_thanKeyword_0());
            		
            // InternalAADMParser.g:2510:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalAADMParser.g:2511:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalAADMParser.g:2511:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalAADMParser.g:2512:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getELessThanAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getELessThanRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.AADM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELessThan"


    // $ANTLR start "entryRuleEGreaterOrEqual"
    // InternalAADMParser.g:2533:1: entryRuleEGreaterOrEqual returns [EObject current=null] : iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF ;
    public final EObject entryRuleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterOrEqual = null;


        try {
            // InternalAADMParser.g:2533:56: (iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF )
            // InternalAADMParser.g:2534:2: iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF
            {
             newCompositeNode(grammarAccess.getEGreaterOrEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEGreaterOrEqual=ruleEGreaterOrEqual();

            state._fsp--;

             current =iv_ruleEGreaterOrEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEGreaterOrEqual"


    // $ANTLR start "ruleEGreaterOrEqual"
    // InternalAADMParser.g:2540:1: ruleEGreaterOrEqual returns [EObject current=null] : (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2546:2: ( (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalAADMParser.g:2547:2: (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalAADMParser.g:2547:2: (otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalAADMParser.g:2548:3: otherlv_0= Greater_or_equal ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Greater_or_equal,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterOrEqualAccess().getGreater_or_equalKeyword_0());
            		
            // InternalAADMParser.g:2552:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalAADMParser.g:2553:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalAADMParser.g:2553:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalAADMParser.g:2554:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEGreaterOrEqualAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEGreaterOrEqualRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.AADM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEGreaterOrEqual"


    // $ANTLR start "entryRuleEGreaterThan"
    // InternalAADMParser.g:2575:1: entryRuleEGreaterThan returns [EObject current=null] : iv_ruleEGreaterThan= ruleEGreaterThan EOF ;
    public final EObject entryRuleEGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterThan = null;


        try {
            // InternalAADMParser.g:2575:53: (iv_ruleEGreaterThan= ruleEGreaterThan EOF )
            // InternalAADMParser.g:2576:2: iv_ruleEGreaterThan= ruleEGreaterThan EOF
            {
             newCompositeNode(grammarAccess.getEGreaterThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEGreaterThan=ruleEGreaterThan();

            state._fsp--;

             current =iv_ruleEGreaterThan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEGreaterThan"


    // $ANTLR start "ruleEGreaterThan"
    // InternalAADMParser.g:2582:1: ruleEGreaterThan returns [EObject current=null] : (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) ;
    public final EObject ruleEGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2588:2: ( (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) ) )
            // InternalAADMParser.g:2589:2: (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            {
            // InternalAADMParser.g:2589:2: (otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) ) )
            // InternalAADMParser.g:2590:3: otherlv_0= Greater_than ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            {
            otherlv_0=(Token)match(input,Greater_than,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterThanAccess().getGreater_thanKeyword_0());
            		
            // InternalAADMParser.g:2594:3: ( (lv_val_1_0= ruleEAlphaNumericValue ) )
            // InternalAADMParser.g:2595:4: (lv_val_1_0= ruleEAlphaNumericValue )
            {
            // InternalAADMParser.g:2595:4: (lv_val_1_0= ruleEAlphaNumericValue )
            // InternalAADMParser.g:2596:5: lv_val_1_0= ruleEAlphaNumericValue
            {

            					newCompositeNode(grammarAccess.getEGreaterThanAccess().getValEAlphaNumericValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleEAlphaNumericValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEGreaterThanRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.AADM.EAlphaNumericValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEGreaterThan"


    // $ANTLR start "entryRuleEEqual"
    // InternalAADMParser.g:2617:1: entryRuleEEqual returns [EObject current=null] : iv_ruleEEqual= ruleEEqual EOF ;
    public final EObject entryRuleEEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEqual = null;


        try {
            // InternalAADMParser.g:2617:47: (iv_ruleEEqual= ruleEEqual EOF )
            // InternalAADMParser.g:2618:2: iv_ruleEEqual= ruleEEqual EOF
            {
             newCompositeNode(grammarAccess.getEEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEqual=ruleEEqual();

            state._fsp--;

             current =iv_ruleEEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEEqual"


    // $ANTLR start "ruleEEqual"
    // InternalAADMParser.g:2624:1: ruleEEqual returns [EObject current=null] : (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) ) ;
    public final EObject ruleEEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2630:2: ( (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) ) )
            // InternalAADMParser.g:2631:2: (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) )
            {
            // InternalAADMParser.g:2631:2: (otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) ) )
            // InternalAADMParser.g:2632:3: otherlv_0= Equal ( (lv_val_1_0= ruleESingleValue ) )
            {
            otherlv_0=(Token)match(input,Equal,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getEEqualAccess().getEqualKeyword_0());
            		
            // InternalAADMParser.g:2636:3: ( (lv_val_1_0= ruleESingleValue ) )
            // InternalAADMParser.g:2637:4: (lv_val_1_0= ruleESingleValue )
            {
            // InternalAADMParser.g:2637:4: (lv_val_1_0= ruleESingleValue )
            // InternalAADMParser.g:2638:5: lv_val_1_0= ruleESingleValue
            {

            					newCompositeNode(grammarAccess.getEEqualAccess().getValESingleValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleESingleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEEqualRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.AADM.ESingleValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEEqual"


    // $ANTLR start "entryRuleETarget"
    // InternalAADMParser.g:2659:1: entryRuleETarget returns [EObject current=null] : iv_ruleETarget= ruleETarget EOF ;
    public final EObject entryRuleETarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETarget = null;


        try {
            // InternalAADMParser.g:2659:48: (iv_ruleETarget= ruleETarget EOF )
            // InternalAADMParser.g:2660:2: iv_ruleETarget= ruleETarget EOF
            {
             newCompositeNode(grammarAccess.getETargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETarget=ruleETarget();

            state._fsp--;

             current =iv_ruleETarget; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETarget"


    // $ANTLR start "ruleETarget"
    // InternalAADMParser.g:2666:1: ruleETarget returns [EObject current=null] : ( ( (lv_target_0_0= ruleEPREFIX_ID ) ) (otherlv_1= Comma ( (lv_target_2_0= ruleEPREFIX_ID ) ) )* ) ;
    public final EObject ruleETarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_target_0_0 = null;

        EObject lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2672:2: ( ( ( (lv_target_0_0= ruleEPREFIX_ID ) ) (otherlv_1= Comma ( (lv_target_2_0= ruleEPREFIX_ID ) ) )* ) )
            // InternalAADMParser.g:2673:2: ( ( (lv_target_0_0= ruleEPREFIX_ID ) ) (otherlv_1= Comma ( (lv_target_2_0= ruleEPREFIX_ID ) ) )* )
            {
            // InternalAADMParser.g:2673:2: ( ( (lv_target_0_0= ruleEPREFIX_ID ) ) (otherlv_1= Comma ( (lv_target_2_0= ruleEPREFIX_ID ) ) )* )
            // InternalAADMParser.g:2674:3: ( (lv_target_0_0= ruleEPREFIX_ID ) ) (otherlv_1= Comma ( (lv_target_2_0= ruleEPREFIX_ID ) ) )*
            {
            // InternalAADMParser.g:2674:3: ( (lv_target_0_0= ruleEPREFIX_ID ) )
            // InternalAADMParser.g:2675:4: (lv_target_0_0= ruleEPREFIX_ID )
            {
            // InternalAADMParser.g:2675:4: (lv_target_0_0= ruleEPREFIX_ID )
            // InternalAADMParser.g:2676:5: lv_target_0_0= ruleEPREFIX_ID
            {

            					newCompositeNode(grammarAccess.getETargetAccess().getTargetEPREFIX_IDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_target_0_0=ruleEPREFIX_ID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETargetRule());
            					}
            					add(
            						current,
            						"target",
            						lv_target_0_0,
            						"org.sodalite.dsl.AADM.EPREFIX_ID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAADMParser.g:2693:3: (otherlv_1= Comma ( (lv_target_2_0= ruleEPREFIX_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAADMParser.g:2694:4: otherlv_1= Comma ( (lv_target_2_0= ruleEPREFIX_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getETargetAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalAADMParser.g:2698:4: ( (lv_target_2_0= ruleEPREFIX_ID ) )
            	    // InternalAADMParser.g:2699:5: (lv_target_2_0= ruleEPREFIX_ID )
            	    {
            	    // InternalAADMParser.g:2699:5: (lv_target_2_0= ruleEPREFIX_ID )
            	    // InternalAADMParser.g:2700:6: lv_target_2_0= ruleEPREFIX_ID
            	    {

            	    						newCompositeNode(grammarAccess.getETargetAccess().getTargetEPREFIX_IDParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_target_2_0=ruleEPREFIX_ID();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getETargetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"target",
            	    							lv_target_2_0,
            	    							"org.sodalite.dsl.AADM.EPREFIX_ID");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleETarget"


    // $ANTLR start "entryRuleENodeTemplates"
    // InternalAADMParser.g:2722:1: entryRuleENodeTemplates returns [EObject current=null] : iv_ruleENodeTemplates= ruleENodeTemplates EOF ;
    public final EObject entryRuleENodeTemplates() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTemplates = null;


        try {
            // InternalAADMParser.g:2722:55: (iv_ruleENodeTemplates= ruleENodeTemplates EOF )
            // InternalAADMParser.g:2723:2: iv_ruleENodeTemplates= ruleENodeTemplates EOF
            {
             newCompositeNode(grammarAccess.getENodeTemplatesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeTemplates=ruleENodeTemplates();

            state._fsp--;

             current =iv_ruleENodeTemplates; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeTemplates"


    // $ANTLR start "ruleENodeTemplates"
    // InternalAADMParser.g:2729:1: ruleENodeTemplates returns [EObject current=null] : ( () ( (lv_nodeTemplates_1_0= ruleENodeTemplate ) )* ) ;
    public final EObject ruleENodeTemplates() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeTemplates_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2735:2: ( ( () ( (lv_nodeTemplates_1_0= ruleENodeTemplate ) )* ) )
            // InternalAADMParser.g:2736:2: ( () ( (lv_nodeTemplates_1_0= ruleENodeTemplate ) )* )
            {
            // InternalAADMParser.g:2736:2: ( () ( (lv_nodeTemplates_1_0= ruleENodeTemplate ) )* )
            // InternalAADMParser.g:2737:3: () ( (lv_nodeTemplates_1_0= ruleENodeTemplate ) )*
            {
            // InternalAADMParser.g:2737:3: ()
            // InternalAADMParser.g:2738:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTemplatesAccess().getENodeTemplatesAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:2744:3: ( (lv_nodeTemplates_1_0= ruleENodeTemplate ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAADMParser.g:2745:4: (lv_nodeTemplates_1_0= ruleENodeTemplate )
            	    {
            	    // InternalAADMParser.g:2745:4: (lv_nodeTemplates_1_0= ruleENodeTemplate )
            	    // InternalAADMParser.g:2746:5: lv_nodeTemplates_1_0= ruleENodeTemplate
            	    {

            	    					newCompositeNode(grammarAccess.getENodeTemplatesAccess().getNodeTemplatesENodeTemplateParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_nodeTemplates_1_0=ruleENodeTemplate();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getENodeTemplatesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodeTemplates",
            	    						lv_nodeTemplates_1_0,
            	    						"org.sodalite.dsl.AADM.ENodeTemplate");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENodeTemplates"


    // $ANTLR start "entryRuleENodeTemplate"
    // InternalAADMParser.g:2767:1: entryRuleENodeTemplate returns [EObject current=null] : iv_ruleENodeTemplate= ruleENodeTemplate EOF ;
    public final EObject entryRuleENodeTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTemplate = null;


        try {
            // InternalAADMParser.g:2767:54: (iv_ruleENodeTemplate= ruleENodeTemplate EOF )
            // InternalAADMParser.g:2768:2: iv_ruleENodeTemplate= ruleENodeTemplate EOF
            {
             newCompositeNode(grammarAccess.getENodeTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeTemplate=ruleENodeTemplate();

            state._fsp--;

             current =iv_ruleENodeTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeTemplate"


    // $ANTLR start "ruleENodeTemplate"
    // InternalAADMParser.g:2774:1: ruleENodeTemplate returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTemplateBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleENodeTemplate() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_node_3_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2780:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTemplateBody ) ) this_END_4= RULE_END ) )
            // InternalAADMParser.g:2781:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTemplateBody ) ) this_END_4= RULE_END )
            {
            // InternalAADMParser.g:2781:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTemplateBody ) ) this_END_4= RULE_END )
            // InternalAADMParser.g:2782:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTemplateBody ) ) this_END_4= RULE_END
            {
            // InternalAADMParser.g:2782:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAADMParser.g:2783:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAADMParser.g:2783:4: (lv_name_0_0= RULE_ID )
            // InternalAADMParser.g:2784:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getENodeTemplateAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getENodeTemplateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.AADM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getENodeTemplateAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getENodeTemplateAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalAADMParser.g:2808:3: ( (lv_node_3_0= ruleENodeTemplateBody ) )
            // InternalAADMParser.g:2809:4: (lv_node_3_0= ruleENodeTemplateBody )
            {
            // InternalAADMParser.g:2809:4: (lv_node_3_0= ruleENodeTemplateBody )
            // InternalAADMParser.g:2810:5: lv_node_3_0= ruleENodeTemplateBody
            {

            					newCompositeNode(grammarAccess.getENodeTemplateAccess().getNodeENodeTemplateBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_node_3_0=ruleENodeTemplateBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getENodeTemplateRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_3_0,
            						"org.sodalite.dsl.AADM.ENodeTemplateBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getENodeTemplateAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENodeTemplate"


    // $ANTLR start "entryRuleENodeTemplateBody"
    // InternalAADMParser.g:2835:1: entryRuleENodeTemplateBody returns [EObject current=null] : iv_ruleENodeTemplateBody= ruleENodeTemplateBody EOF ;
    public final EObject entryRuleENodeTemplateBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTemplateBody = null;


        try {
            // InternalAADMParser.g:2835:58: (iv_ruleENodeTemplateBody= ruleENodeTemplateBody EOF )
            // InternalAADMParser.g:2836:2: iv_ruleENodeTemplateBody= ruleENodeTemplateBody EOF
            {
             newCompositeNode(grammarAccess.getENodeTemplateBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeTemplateBody=ruleENodeTemplateBody();

            state._fsp--;

             current =iv_ruleENodeTemplateBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeTemplateBody"


    // $ANTLR start "ruleENodeTemplateBody"
    // InternalAADMParser.g:2842:1: ruleENodeTemplateBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleENodeTemplateBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        Token otherlv_13=null;
        Token this_BEGIN_14=null;
        Token this_END_16=null;
        Token otherlv_17=null;
        Token this_BEGIN_18=null;
        Token this_END_20=null;
        EObject lv_type_2_0 = null;

        EObject lv_properties_7_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_requirements_15_0 = null;

        EObject lv_capabilities_19_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:2848:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalAADMParser.g:2849:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalAADMParser.g:2849:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalAADMParser.g:2850:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalAADMParser.g:2850:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?) )
            // InternalAADMParser.g:2851:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
            			
            // InternalAADMParser.g:2854:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?)
            // InternalAADMParser.g:2855:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalAADMParser.g:2855:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=7;
                int LA18_0 = input.LA(1);

                if ( LA18_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 2) ) {
                    alt18=3;
                }
                else if ( LA18_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 3) ) {
                    alt18=4;
                }
                else if ( LA18_0 == Requirements && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 4) ) {
                    alt18=5;
                }
                else if ( LA18_0 == Capabilities && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 5) ) {
                    alt18=6;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAADMParser.g:2856:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:2856:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) ) )
            	    // InternalAADMParser.g:2857:4: {...}? => ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAADMParser.g:2857:111: ( ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) ) )
            	    // InternalAADMParser.g:2858:5: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAADMParser.g:2861:8: ({...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) ) )
            	    // InternalAADMParser.g:2861:9: {...}? => (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "true");
            	    }
            	    // InternalAADMParser.g:2861:18: (otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) ) )
            	    // InternalAADMParser.g:2861:19: otherlv_1= Type ( (lv_type_2_0= ruleEPREFIX_TYPE ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_12); 

            	    								newLeafNode(otherlv_1, grammarAccess.getENodeTemplateBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalAADMParser.g:2865:8: ( (lv_type_2_0= ruleEPREFIX_TYPE ) )
            	    // InternalAADMParser.g:2866:9: (lv_type_2_0= ruleEPREFIX_TYPE )
            	    {
            	    // InternalAADMParser.g:2866:9: (lv_type_2_0= ruleEPREFIX_TYPE )
            	    // InternalAADMParser.g:2867:10: lv_type_2_0= ruleEPREFIX_TYPE
            	    {

            	    										newCompositeNode(grammarAccess.getENodeTemplateBodyAccess().getTypeEPREFIX_TYPEParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_38);
            	    lv_type_2_0=ruleEPREFIX_TYPE();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getENodeTemplateBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"type",
            	    											lv_type_2_0,
            	    											"org.sodalite.dsl.AADM.EPREFIX_TYPE");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAADMParser.g:2890:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:2890:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAADMParser.g:2891:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAADMParser.g:2891:111: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalAADMParser.g:2892:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAADMParser.g:2895:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalAADMParser.g:2895:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "true");
            	    }
            	    // InternalAADMParser.g:2895:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalAADMParser.g:2895:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_3); 

            	    								newLeafNode(otherlv_3, grammarAccess.getENodeTemplateBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalAADMParser.g:2899:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalAADMParser.g:2900:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalAADMParser.g:2900:9: (lv_description_4_0= RULE_STRING )
            	    // InternalAADMParser.g:2901:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            	    										newLeafNode(lv_description_4_0, grammarAccess.getENodeTemplateBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getENodeTemplateBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAADMParser.g:2923:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:2923:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) ) )
            	    // InternalAADMParser.g:2924:4: {...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAADMParser.g:2924:111: ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) ) )
            	    // InternalAADMParser.g:2925:5: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAADMParser.g:2928:8: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END ) )
            	    // InternalAADMParser.g:2928:9: {...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "true");
            	    }
            	    // InternalAADMParser.g:2928:18: (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END )
            	    // InternalAADMParser.g:2928:19: otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEPropertyAssignments ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Properties,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getENodeTemplateBodyAccess().getPropertiesKeyword_2_0());
            	    							
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_6, grammarAccess.getENodeTemplateBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalAADMParser.g:2936:8: ( (lv_properties_7_0= ruleEPropertyAssignments ) )
            	    // InternalAADMParser.g:2937:9: (lv_properties_7_0= ruleEPropertyAssignments )
            	    {
            	    // InternalAADMParser.g:2937:9: (lv_properties_7_0= ruleEPropertyAssignments )
            	    // InternalAADMParser.g:2938:10: lv_properties_7_0= ruleEPropertyAssignments
            	    {

            	    										newCompositeNode(grammarAccess.getENodeTemplateBodyAccess().getPropertiesEPropertyAssignmentsParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_properties_7_0=ruleEPropertyAssignments();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getENodeTemplateBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"properties",
            	    											lv_properties_7_0,
            	    											"org.sodalite.dsl.AADM.EPropertyAssignments");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_38); 

            	    								newLeafNode(this_END_8, grammarAccess.getENodeTemplateBodyAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAADMParser.g:2965:3: ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:2965:3: ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalAADMParser.g:2966:4: {...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAADMParser.g:2966:111: ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) ) )
            	    // InternalAADMParser.g:2967:5: ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAADMParser.g:2970:8: ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END ) )
            	    // InternalAADMParser.g:2970:9: {...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "true");
            	    }
            	    // InternalAADMParser.g:2970:18: (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END )
            	    // InternalAADMParser.g:2970:19: otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributeAssignments ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Attributes,FOLLOW_6); 

            	    								newLeafNode(otherlv_9, grammarAccess.getENodeTemplateBodyAccess().getAttributesKeyword_3_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getENodeTemplateBodyAccess().getBEGINTerminalRuleCall_3_1());
            	    							
            	    // InternalAADMParser.g:2978:8: ( (lv_attributes_11_0= ruleEAttributeAssignments ) )
            	    // InternalAADMParser.g:2979:9: (lv_attributes_11_0= ruleEAttributeAssignments )
            	    {
            	    // InternalAADMParser.g:2979:9: (lv_attributes_11_0= ruleEAttributeAssignments )
            	    // InternalAADMParser.g:2980:10: lv_attributes_11_0= ruleEAttributeAssignments
            	    {

            	    										newCompositeNode(grammarAccess.getENodeTemplateBodyAccess().getAttributesEAttributeAssignmentsParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_11_0=ruleEAttributeAssignments();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getENodeTemplateBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"attributes",
            	    											lv_attributes_11_0,
            	    											"org.sodalite.dsl.AADM.EAttributeAssignments");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_38); 

            	    								newLeafNode(this_END_12, grammarAccess.getENodeTemplateBodyAccess().getENDTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAADMParser.g:3007:3: ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:3007:3: ({...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) ) )
            	    // InternalAADMParser.g:3008:4: {...}? => ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAADMParser.g:3008:111: ( ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) ) )
            	    // InternalAADMParser.g:3009:5: ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAADMParser.g:3012:8: ({...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END ) )
            	    // InternalAADMParser.g:3012:9: {...}? => (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "true");
            	    }
            	    // InternalAADMParser.g:3012:18: (otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END )
            	    // InternalAADMParser.g:3012:19: otherlv_13= Requirements this_BEGIN_14= RULE_BEGIN ( (lv_requirements_15_0= ruleERequirementAssignments ) ) this_END_16= RULE_END
            	    {
            	    otherlv_13=(Token)match(input,Requirements,FOLLOW_6); 

            	    								newLeafNode(otherlv_13, grammarAccess.getENodeTemplateBodyAccess().getRequirementsKeyword_4_0());
            	    							
            	    this_BEGIN_14=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_14, grammarAccess.getENodeTemplateBodyAccess().getBEGINTerminalRuleCall_4_1());
            	    							
            	    // InternalAADMParser.g:3020:8: ( (lv_requirements_15_0= ruleERequirementAssignments ) )
            	    // InternalAADMParser.g:3021:9: (lv_requirements_15_0= ruleERequirementAssignments )
            	    {
            	    // InternalAADMParser.g:3021:9: (lv_requirements_15_0= ruleERequirementAssignments )
            	    // InternalAADMParser.g:3022:10: lv_requirements_15_0= ruleERequirementAssignments
            	    {

            	    										newCompositeNode(grammarAccess.getENodeTemplateBodyAccess().getRequirementsERequirementAssignmentsParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_requirements_15_0=ruleERequirementAssignments();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getENodeTemplateBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"requirements",
            	    											lv_requirements_15_0,
            	    											"org.sodalite.dsl.AADM.ERequirementAssignments");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_16=(Token)match(input,RULE_END,FOLLOW_38); 

            	    								newLeafNode(this_END_16, grammarAccess.getENodeTemplateBodyAccess().getENDTerminalRuleCall_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAADMParser.g:3049:3: ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) )
            	    {
            	    // InternalAADMParser.g:3049:3: ({...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) ) )
            	    // InternalAADMParser.g:3050:4: {...}? => ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAADMParser.g:3050:111: ( ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) ) )
            	    // InternalAADMParser.g:3051:5: ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAADMParser.g:3054:8: ({...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END ) )
            	    // InternalAADMParser.g:3054:9: {...}? => (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTemplateBody", "true");
            	    }
            	    // InternalAADMParser.g:3054:18: (otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END )
            	    // InternalAADMParser.g:3054:19: otherlv_17= Capabilities this_BEGIN_18= RULE_BEGIN ( (lv_capabilities_19_0= ruleECapabilityAssignments ) ) this_END_20= RULE_END
            	    {
            	    otherlv_17=(Token)match(input,Capabilities,FOLLOW_6); 

            	    								newLeafNode(otherlv_17, grammarAccess.getENodeTemplateBodyAccess().getCapabilitiesKeyword_5_0());
            	    							
            	    this_BEGIN_18=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_18, grammarAccess.getENodeTemplateBodyAccess().getBEGINTerminalRuleCall_5_1());
            	    							
            	    // InternalAADMParser.g:3062:8: ( (lv_capabilities_19_0= ruleECapabilityAssignments ) )
            	    // InternalAADMParser.g:3063:9: (lv_capabilities_19_0= ruleECapabilityAssignments )
            	    {
            	    // InternalAADMParser.g:3063:9: (lv_capabilities_19_0= ruleECapabilityAssignments )
            	    // InternalAADMParser.g:3064:10: lv_capabilities_19_0= ruleECapabilityAssignments
            	    {

            	    										newCompositeNode(grammarAccess.getENodeTemplateBodyAccess().getCapabilitiesECapabilityAssignmentsParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_capabilities_19_0=ruleECapabilityAssignments();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getENodeTemplateBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"capabilities",
            	    											lv_capabilities_19_0,
            	    											"org.sodalite.dsl.AADM.ECapabilityAssignments");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_20=(Token)match(input,RULE_END,FOLLOW_38); 

            	    								newLeafNode(this_END_20, grammarAccess.getENodeTemplateBodyAccess().getENDTerminalRuleCall_5_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleENodeTemplateBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENodeTemplateBody"


    // $ANTLR start "entryRuleECapabilityAssignments"
    // InternalAADMParser.g:3102:1: entryRuleECapabilityAssignments returns [EObject current=null] : iv_ruleECapabilityAssignments= ruleECapabilityAssignments EOF ;
    public final EObject entryRuleECapabilityAssignments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityAssignments = null;


        try {
            // InternalAADMParser.g:3102:63: (iv_ruleECapabilityAssignments= ruleECapabilityAssignments EOF )
            // InternalAADMParser.g:3103:2: iv_ruleECapabilityAssignments= ruleECapabilityAssignments EOF
            {
             newCompositeNode(grammarAccess.getECapabilityAssignmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityAssignments=ruleECapabilityAssignments();

            state._fsp--;

             current =iv_ruleECapabilityAssignments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityAssignments"


    // $ANTLR start "ruleECapabilityAssignments"
    // InternalAADMParser.g:3109:1: ruleECapabilityAssignments returns [EObject current=null] : ( () ( (lv_capabilities_1_0= ruleECapabilityAssignment ) )* ) ;
    public final EObject ruleECapabilityAssignments() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilities_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3115:2: ( ( () ( (lv_capabilities_1_0= ruleECapabilityAssignment ) )* ) )
            // InternalAADMParser.g:3116:2: ( () ( (lv_capabilities_1_0= ruleECapabilityAssignment ) )* )
            {
            // InternalAADMParser.g:3116:2: ( () ( (lv_capabilities_1_0= ruleECapabilityAssignment ) )* )
            // InternalAADMParser.g:3117:3: () ( (lv_capabilities_1_0= ruleECapabilityAssignment ) )*
            {
            // InternalAADMParser.g:3117:3: ()
            // InternalAADMParser.g:3118:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityAssignmentsAccess().getECapabilityAssignmentsAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:3124:3: ( (lv_capabilities_1_0= ruleECapabilityAssignment ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAADMParser.g:3125:4: (lv_capabilities_1_0= ruleECapabilityAssignment )
            	    {
            	    // InternalAADMParser.g:3125:4: (lv_capabilities_1_0= ruleECapabilityAssignment )
            	    // InternalAADMParser.g:3126:5: lv_capabilities_1_0= ruleECapabilityAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilityAssignmentsAccess().getCapabilitiesECapabilityAssignmentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_capabilities_1_0=ruleECapabilityAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getECapabilityAssignmentsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"capabilities",
            	    						lv_capabilities_1_0,
            	    						"org.sodalite.dsl.AADM.ECapabilityAssignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityAssignments"


    // $ANTLR start "entryRuleECapabilityAssignment"
    // InternalAADMParser.g:3147:1: entryRuleECapabilityAssignment returns [EObject current=null] : iv_ruleECapabilityAssignment= ruleECapabilityAssignment EOF ;
    public final EObject entryRuleECapabilityAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityAssignment = null;


        try {
            // InternalAADMParser.g:3147:62: (iv_ruleECapabilityAssignment= ruleECapabilityAssignment EOF )
            // InternalAADMParser.g:3148:2: iv_ruleECapabilityAssignment= ruleECapabilityAssignment EOF
            {
             newCompositeNode(grammarAccess.getECapabilityAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityAssignment=ruleECapabilityAssignment();

            state._fsp--;

             current =iv_ruleECapabilityAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityAssignment"


    // $ANTLR start "ruleECapabilityAssignment"
    // InternalAADMParser.g:3154:1: ruleECapabilityAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= Properties this_BEGIN_4= RULE_BEGIN ( (lv_properties_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END )? this_END_7= RULE_END ) ;
    public final EObject ruleECapabilityAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token this_END_7=null;
        EObject lv_properties_5_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3160:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= Properties this_BEGIN_4= RULE_BEGIN ( (lv_properties_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END )? this_END_7= RULE_END ) )
            // InternalAADMParser.g:3161:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= Properties this_BEGIN_4= RULE_BEGIN ( (lv_properties_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END )? this_END_7= RULE_END )
            {
            // InternalAADMParser.g:3161:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= Properties this_BEGIN_4= RULE_BEGIN ( (lv_properties_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END )? this_END_7= RULE_END )
            // InternalAADMParser.g:3162:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= Properties this_BEGIN_4= RULE_BEGIN ( (lv_properties_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END )? this_END_7= RULE_END
            {
            // InternalAADMParser.g:3162:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAADMParser.g:3163:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAADMParser.g:3163:4: (lv_name_0_0= RULE_ID )
            // InternalAADMParser.g:3164:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getECapabilityAssignmentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getECapabilityAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.AADM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getECapabilityAssignmentAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getECapabilityAssignmentAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalAADMParser.g:3188:3: (otherlv_3= Properties this_BEGIN_4= RULE_BEGIN ( (lv_properties_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Properties) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAADMParser.g:3189:4: otherlv_3= Properties this_BEGIN_4= RULE_BEGIN ( (lv_properties_5_0= ruleEPropertyAssignments ) ) this_END_6= RULE_END
                    {
                    otherlv_3=(Token)match(input,Properties,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getECapabilityAssignmentAccess().getPropertiesKeyword_3_0());
                    			
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getECapabilityAssignmentAccess().getBEGINTerminalRuleCall_3_1());
                    			
                    // InternalAADMParser.g:3197:4: ( (lv_properties_5_0= ruleEPropertyAssignments ) )
                    // InternalAADMParser.g:3198:5: (lv_properties_5_0= ruleEPropertyAssignments )
                    {
                    // InternalAADMParser.g:3198:5: (lv_properties_5_0= ruleEPropertyAssignments )
                    // InternalAADMParser.g:3199:6: lv_properties_5_0= ruleEPropertyAssignments
                    {

                    						newCompositeNode(grammarAccess.getECapabilityAssignmentAccess().getPropertiesEPropertyAssignmentsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_properties_5_0=ruleEPropertyAssignments();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getECapabilityAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_5_0,
                    							"org.sodalite.dsl.AADM.EPropertyAssignments");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_8); 

                    				newLeafNode(this_END_6, grammarAccess.getECapabilityAssignmentAccess().getENDTerminalRuleCall_3_3());
                    			

                    }
                    break;

            }

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getECapabilityAssignmentAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityAssignment"


    // $ANTLR start "entryRuleERequirementAssignments"
    // InternalAADMParser.g:3229:1: entryRuleERequirementAssignments returns [EObject current=null] : iv_ruleERequirementAssignments= ruleERequirementAssignments EOF ;
    public final EObject entryRuleERequirementAssignments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementAssignments = null;


        try {
            // InternalAADMParser.g:3229:64: (iv_ruleERequirementAssignments= ruleERequirementAssignments EOF )
            // InternalAADMParser.g:3230:2: iv_ruleERequirementAssignments= ruleERequirementAssignments EOF
            {
             newCompositeNode(grammarAccess.getERequirementAssignmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERequirementAssignments=ruleERequirementAssignments();

            state._fsp--;

             current =iv_ruleERequirementAssignments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERequirementAssignments"


    // $ANTLR start "ruleERequirementAssignments"
    // InternalAADMParser.g:3236:1: ruleERequirementAssignments returns [EObject current=null] : ( () ( (lv_requirements_1_0= ruleERequirementAssignment ) )* ) ;
    public final EObject ruleERequirementAssignments() throws RecognitionException {
        EObject current = null;

        EObject lv_requirements_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3242:2: ( ( () ( (lv_requirements_1_0= ruleERequirementAssignment ) )* ) )
            // InternalAADMParser.g:3243:2: ( () ( (lv_requirements_1_0= ruleERequirementAssignment ) )* )
            {
            // InternalAADMParser.g:3243:2: ( () ( (lv_requirements_1_0= ruleERequirementAssignment ) )* )
            // InternalAADMParser.g:3244:3: () ( (lv_requirements_1_0= ruleERequirementAssignment ) )*
            {
            // InternalAADMParser.g:3244:3: ()
            // InternalAADMParser.g:3245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequirementAssignmentsAccess().getERequirementAssignmentsAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:3251:3: ( (lv_requirements_1_0= ruleERequirementAssignment ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAADMParser.g:3252:4: (lv_requirements_1_0= ruleERequirementAssignment )
            	    {
            	    // InternalAADMParser.g:3252:4: (lv_requirements_1_0= ruleERequirementAssignment )
            	    // InternalAADMParser.g:3253:5: lv_requirements_1_0= ruleERequirementAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getERequirementAssignmentsAccess().getRequirementsERequirementAssignmentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_requirements_1_0=ruleERequirementAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERequirementAssignmentsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"requirements",
            	    						lv_requirements_1_0,
            	    						"org.sodalite.dsl.AADM.ERequirementAssignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERequirementAssignments"


    // $ANTLR start "entryRuleERequirementAssignment"
    // InternalAADMParser.g:3274:1: entryRuleERequirementAssignment returns [EObject current=null] : iv_ruleERequirementAssignment= ruleERequirementAssignment EOF ;
    public final EObject entryRuleERequirementAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementAssignment = null;


        try {
            // InternalAADMParser.g:3274:63: (iv_ruleERequirementAssignment= ruleERequirementAssignment EOF )
            // InternalAADMParser.g:3275:2: iv_ruleERequirementAssignment= ruleERequirementAssignment EOF
            {
             newCompositeNode(grammarAccess.getERequirementAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERequirementAssignment=ruleERequirementAssignment();

            state._fsp--;

             current =iv_ruleERequirementAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERequirementAssignment"


    // $ANTLR start "ruleERequirementAssignment"
    // InternalAADMParser.g:3281:1: ruleERequirementAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_ID ) ) ) this_END_5= RULE_END ) ;
    public final EObject ruleERequirementAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        EObject lv_node_4_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3287:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_ID ) ) ) this_END_5= RULE_END ) )
            // InternalAADMParser.g:3288:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_ID ) ) ) this_END_5= RULE_END )
            {
            // InternalAADMParser.g:3288:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_ID ) ) ) this_END_5= RULE_END )
            // InternalAADMParser.g:3289:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_ID ) ) ) this_END_5= RULE_END
            {
            // InternalAADMParser.g:3289:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAADMParser.g:3290:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAADMParser.g:3290:4: (lv_name_0_0= RULE_ID )
            // InternalAADMParser.g:3291:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getERequirementAssignmentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERequirementAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.AADM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getERequirementAssignmentAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_40); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getERequirementAssignmentAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalAADMParser.g:3315:3: (otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_ID ) ) )
            // InternalAADMParser.g:3316:4: otherlv_3= Node ( (lv_node_4_0= ruleEPREFIX_ID ) )
            {
            otherlv_3=(Token)match(input,Node,FOLLOW_5); 

            				newLeafNode(otherlv_3, grammarAccess.getERequirementAssignmentAccess().getNodeKeyword_3_0());
            			
            // InternalAADMParser.g:3320:4: ( (lv_node_4_0= ruleEPREFIX_ID ) )
            // InternalAADMParser.g:3321:5: (lv_node_4_0= ruleEPREFIX_ID )
            {
            // InternalAADMParser.g:3321:5: (lv_node_4_0= ruleEPREFIX_ID )
            // InternalAADMParser.g:3322:6: lv_node_4_0= ruleEPREFIX_ID
            {

            						newCompositeNode(grammarAccess.getERequirementAssignmentAccess().getNodeEPREFIX_IDParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_8);
            lv_node_4_0=ruleEPREFIX_ID();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getERequirementAssignmentRule());
            						}
            						set(
            							current,
            							"node",
            							lv_node_4_0,
            							"org.sodalite.dsl.AADM.EPREFIX_ID");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getERequirementAssignmentAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERequirementAssignment"


    // $ANTLR start "entryRuleEAttributeAssignments"
    // InternalAADMParser.g:3348:1: entryRuleEAttributeAssignments returns [EObject current=null] : iv_ruleEAttributeAssignments= ruleEAttributeAssignments EOF ;
    public final EObject entryRuleEAttributeAssignments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeAssignments = null;


        try {
            // InternalAADMParser.g:3348:62: (iv_ruleEAttributeAssignments= ruleEAttributeAssignments EOF )
            // InternalAADMParser.g:3349:2: iv_ruleEAttributeAssignments= ruleEAttributeAssignments EOF
            {
             newCompositeNode(grammarAccess.getEAttributeAssignmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttributeAssignments=ruleEAttributeAssignments();

            state._fsp--;

             current =iv_ruleEAttributeAssignments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAttributeAssignments"


    // $ANTLR start "ruleEAttributeAssignments"
    // InternalAADMParser.g:3355:1: ruleEAttributeAssignments returns [EObject current=null] : ( () ( (lv_attributes_1_0= ruleEAttributeAssignment ) )* ) ;
    public final EObject ruleEAttributeAssignments() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3361:2: ( ( () ( (lv_attributes_1_0= ruleEAttributeAssignment ) )* ) )
            // InternalAADMParser.g:3362:2: ( () ( (lv_attributes_1_0= ruleEAttributeAssignment ) )* )
            {
            // InternalAADMParser.g:3362:2: ( () ( (lv_attributes_1_0= ruleEAttributeAssignment ) )* )
            // InternalAADMParser.g:3363:3: () ( (lv_attributes_1_0= ruleEAttributeAssignment ) )*
            {
            // InternalAADMParser.g:3363:3: ()
            // InternalAADMParser.g:3364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributeAssignmentsAccess().getEAttributeAssignmentsAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:3370:3: ( (lv_attributes_1_0= ruleEAttributeAssignment ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAADMParser.g:3371:4: (lv_attributes_1_0= ruleEAttributeAssignment )
            	    {
            	    // InternalAADMParser.g:3371:4: (lv_attributes_1_0= ruleEAttributeAssignment )
            	    // InternalAADMParser.g:3372:5: lv_attributes_1_0= ruleEAttributeAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getEAttributeAssignmentsAccess().getAttributesEAttributeAssignmentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_attributes_1_0=ruleEAttributeAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEAttributeAssignmentsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_1_0,
            	    						"org.sodalite.dsl.AADM.EAttributeAssignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAttributeAssignments"


    // $ANTLR start "entryRuleEAttributeAssignment"
    // InternalAADMParser.g:3393:1: entryRuleEAttributeAssignment returns [EObject current=null] : iv_ruleEAttributeAssignment= ruleEAttributeAssignment EOF ;
    public final EObject entryRuleEAttributeAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeAssignment = null;


        try {
            // InternalAADMParser.g:3393:61: (iv_ruleEAttributeAssignment= ruleEAttributeAssignment EOF )
            // InternalAADMParser.g:3394:2: iv_ruleEAttributeAssignment= ruleEAttributeAssignment EOF
            {
             newCompositeNode(grammarAccess.getEAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttributeAssignment=ruleEAttributeAssignment();

            state._fsp--;

             current =iv_ruleEAttributeAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAttributeAssignment"


    // $ANTLR start "ruleEAttributeAssignment"
    // InternalAADMParser.g:3400:1: ruleEAttributeAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) ;
    public final EObject ruleEAttributeAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3406:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) )
            // InternalAADMParser.g:3407:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            {
            // InternalAADMParser.g:3407:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            // InternalAADMParser.g:3408:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) )
            {
            // InternalAADMParser.g:3408:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAADMParser.g:3409:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAADMParser.g:3409:4: (lv_name_0_0= RULE_ID )
            // InternalAADMParser.g:3410:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEAttributeAssignmentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEAttributeAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.AADM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getEAttributeAssignmentAccess().getColonKeyword_1());
            		
            // InternalAADMParser.g:3430:3: ( (lv_value_2_0= ruleEAssignmentValue ) )
            // InternalAADMParser.g:3431:4: (lv_value_2_0= ruleEAssignmentValue )
            {
            // InternalAADMParser.g:3431:4: (lv_value_2_0= ruleEAssignmentValue )
            // InternalAADMParser.g:3432:5: lv_value_2_0= ruleEAssignmentValue
            {

            					newCompositeNode(grammarAccess.getEAttributeAssignmentAccess().getValueEAssignmentValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEAssignmentValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAttributeAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.sodalite.dsl.AADM.EAssignmentValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAttributeAssignment"


    // $ANTLR start "entryRuleEPropertyAssignments"
    // InternalAADMParser.g:3453:1: entryRuleEPropertyAssignments returns [EObject current=null] : iv_ruleEPropertyAssignments= ruleEPropertyAssignments EOF ;
    public final EObject entryRuleEPropertyAssignments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyAssignments = null;


        try {
            // InternalAADMParser.g:3453:61: (iv_ruleEPropertyAssignments= ruleEPropertyAssignments EOF )
            // InternalAADMParser.g:3454:2: iv_ruleEPropertyAssignments= ruleEPropertyAssignments EOF
            {
             newCompositeNode(grammarAccess.getEPropertyAssignmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPropertyAssignments=ruleEPropertyAssignments();

            state._fsp--;

             current =iv_ruleEPropertyAssignments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPropertyAssignments"


    // $ANTLR start "ruleEPropertyAssignments"
    // InternalAADMParser.g:3460:1: ruleEPropertyAssignments returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleEPropertyAssignment ) )* ) ;
    public final EObject ruleEPropertyAssignments() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3466:2: ( ( () ( (lv_properties_1_0= ruleEPropertyAssignment ) )* ) )
            // InternalAADMParser.g:3467:2: ( () ( (lv_properties_1_0= ruleEPropertyAssignment ) )* )
            {
            // InternalAADMParser.g:3467:2: ( () ( (lv_properties_1_0= ruleEPropertyAssignment ) )* )
            // InternalAADMParser.g:3468:3: () ( (lv_properties_1_0= ruleEPropertyAssignment ) )*
            {
            // InternalAADMParser.g:3468:3: ()
            // InternalAADMParser.g:3469:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPropertyAssignmentsAccess().getEPropertyAssignmentsAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:3475:3: ( (lv_properties_1_0= ruleEPropertyAssignment ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAADMParser.g:3476:4: (lv_properties_1_0= ruleEPropertyAssignment )
            	    {
            	    // InternalAADMParser.g:3476:4: (lv_properties_1_0= ruleEPropertyAssignment )
            	    // InternalAADMParser.g:3477:5: lv_properties_1_0= ruleEPropertyAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getEPropertyAssignmentsAccess().getPropertiesEPropertyAssignmentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_properties_1_0=ruleEPropertyAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEPropertyAssignmentsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_1_0,
            	    						"org.sodalite.dsl.AADM.EPropertyAssignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPropertyAssignments"


    // $ANTLR start "entryRuleEPropertyAssignment"
    // InternalAADMParser.g:3498:1: entryRuleEPropertyAssignment returns [EObject current=null] : iv_ruleEPropertyAssignment= ruleEPropertyAssignment EOF ;
    public final EObject entryRuleEPropertyAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyAssignment = null;


        try {
            // InternalAADMParser.g:3498:60: (iv_ruleEPropertyAssignment= ruleEPropertyAssignment EOF )
            // InternalAADMParser.g:3499:2: iv_ruleEPropertyAssignment= ruleEPropertyAssignment EOF
            {
             newCompositeNode(grammarAccess.getEPropertyAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPropertyAssignment=ruleEPropertyAssignment();

            state._fsp--;

             current =iv_ruleEPropertyAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPropertyAssignment"


    // $ANTLR start "ruleEPropertyAssignment"
    // InternalAADMParser.g:3505:1: ruleEPropertyAssignment returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) ;
    public final EObject ruleEPropertyAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3511:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) )
            // InternalAADMParser.g:3512:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            {
            // InternalAADMParser.g:3512:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            // InternalAADMParser.g:3513:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) )
            {
            // InternalAADMParser.g:3513:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAADMParser.g:3514:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAADMParser.g:3514:4: (lv_name_0_0= RULE_ID )
            // InternalAADMParser.g:3515:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEPropertyAssignmentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPropertyAssignmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.AADM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getEPropertyAssignmentAccess().getColonKeyword_1());
            		
            // InternalAADMParser.g:3535:3: ( (lv_value_2_0= ruleEAssignmentValue ) )
            // InternalAADMParser.g:3536:4: (lv_value_2_0= ruleEAssignmentValue )
            {
            // InternalAADMParser.g:3536:4: (lv_value_2_0= ruleEAssignmentValue )
            // InternalAADMParser.g:3537:5: lv_value_2_0= ruleEAssignmentValue
            {

            					newCompositeNode(grammarAccess.getEPropertyAssignmentAccess().getValueEAssignmentValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEAssignmentValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPropertyAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.sodalite.dsl.AADM.EAssignmentValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPropertyAssignment"


    // $ANTLR start "entryRuleEAssignmentValue"
    // InternalAADMParser.g:3558:1: entryRuleEAssignmentValue returns [EObject current=null] : iv_ruleEAssignmentValue= ruleEAssignmentValue EOF ;
    public final EObject entryRuleEAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAssignmentValue = null;


        try {
            // InternalAADMParser.g:3558:57: (iv_ruleEAssignmentValue= ruleEAssignmentValue EOF )
            // InternalAADMParser.g:3559:2: iv_ruleEAssignmentValue= ruleEAssignmentValue EOF
            {
             newCompositeNode(grammarAccess.getEAssignmentValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAssignmentValue=ruleEAssignmentValue();

            state._fsp--;

             current =iv_ruleEAssignmentValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAssignmentValue"


    // $ANTLR start "ruleEAssignmentValue"
    // InternalAADMParser.g:3565:1: ruleEAssignmentValue returns [EObject current=null] : (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) ;
    public final EObject ruleEAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESingleValue_0 = null;

        EObject this_ELIST_1 = null;

        EObject this_EMAP_2 = null;

        EObject this_EFunction_3 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3571:2: ( (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) )
            // InternalAADMParser.g:3572:2: (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            {
            // InternalAADMParser.g:3572:2: (this_ESingleValue_0= ruleESingleValue | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            int alt24=4;
            switch ( input.LA(1) ) {
            case HyphenMinus:
            case FullStop:
            case RULE_BOOLEAN:
            case RULE_INT:
            case RULE_STRING:
                {
                alt24=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt24=2;
                }
                break;
            case RULE_BEGIN:
                {
                alt24=3;
                }
                break;
            case Get_attribute:
            case Get_property:
            case Get_input:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalAADMParser.g:3573:3: this_ESingleValue_0= ruleESingleValue
                    {

                    			newCompositeNode(grammarAccess.getEAssignmentValueAccess().getESingleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESingleValue_0=ruleESingleValue();

                    state._fsp--;


                    			current = this_ESingleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAADMParser.g:3582:3: this_ELIST_1= ruleELIST
                    {

                    			newCompositeNode(grammarAccess.getEAssignmentValueAccess().getELISTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELIST_1=ruleELIST();

                    state._fsp--;


                    			current = this_ELIST_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAADMParser.g:3591:3: this_EMAP_2= ruleEMAP
                    {

                    			newCompositeNode(grammarAccess.getEAssignmentValueAccess().getEMAPParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EMAP_2=ruleEMAP();

                    state._fsp--;


                    			current = this_EMAP_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAADMParser.g:3600:3: this_EFunction_3= ruleEFunction
                    {

                    			newCompositeNode(grammarAccess.getEAssignmentValueAccess().getEFunctionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFunction_3=ruleEFunction();

                    state._fsp--;


                    			current = this_EFunction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAssignmentValue"


    // $ANTLR start "entryRuleEMAP"
    // InternalAADMParser.g:3612:1: entryRuleEMAP returns [EObject current=null] : iv_ruleEMAP= ruleEMAP EOF ;
    public final EObject entryRuleEMAP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMAP = null;


        try {
            // InternalAADMParser.g:3612:45: (iv_ruleEMAP= ruleEMAP EOF )
            // InternalAADMParser.g:3613:2: iv_ruleEMAP= ruleEMAP EOF
            {
             newCompositeNode(grammarAccess.getEMAPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMAP=ruleEMAP();

            state._fsp--;

             current =iv_ruleEMAP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMAP"


    // $ANTLR start "ruleEMAP"
    // InternalAADMParser.g:3619:1: ruleEMAP returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END ) ;
    public final EObject ruleEMAP() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token this_END_2=null;
        EObject lv_map_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3625:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END ) )
            // InternalAADMParser.g:3626:2: (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END )
            {
            // InternalAADMParser.g:3626:2: (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END )
            // InternalAADMParser.g:3627:3: this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_5); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getEMAPAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalAADMParser.g:3631:3: ( (lv_map_1_0= ruleEMapEntry ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAADMParser.g:3632:4: (lv_map_1_0= ruleEMapEntry )
            	    {
            	    // InternalAADMParser.g:3632:4: (lv_map_1_0= ruleEMapEntry )
            	    // InternalAADMParser.g:3633:5: lv_map_1_0= ruleEMapEntry
            	    {

            	    					newCompositeNode(grammarAccess.getEMAPAccess().getMapEMapEntryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_map_1_0=ruleEMapEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEMAPRule());
            	    					}
            	    					add(
            	    						current,
            	    						"map",
            	    						lv_map_1_0,
            	    						"org.sodalite.dsl.AADM.EMapEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            this_END_2=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_2, grammarAccess.getEMAPAccess().getENDTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMAP"


    // $ANTLR start "entryRuleEMapEntry"
    // InternalAADMParser.g:3658:1: entryRuleEMapEntry returns [EObject current=null] : iv_ruleEMapEntry= ruleEMapEntry EOF ;
    public final EObject entryRuleEMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMapEntry = null;


        try {
            // InternalAADMParser.g:3658:50: (iv_ruleEMapEntry= ruleEMapEntry EOF )
            // InternalAADMParser.g:3659:2: iv_ruleEMapEntry= ruleEMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEMapEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMapEntry=ruleEMapEntry();

            state._fsp--;

             current =iv_ruleEMapEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMapEntry"


    // $ANTLR start "ruleEMapEntry"
    // InternalAADMParser.g:3665:1: ruleEMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) ;
    public final EObject ruleEMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3671:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) ) )
            // InternalAADMParser.g:3672:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            {
            // InternalAADMParser.g:3672:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) ) )
            // InternalAADMParser.g:3673:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEAssignmentValue ) )
            {
            // InternalAADMParser.g:3673:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalAADMParser.g:3674:4: (lv_key_0_0= RULE_ID )
            {
            // InternalAADMParser.g:3674:4: (lv_key_0_0= RULE_ID )
            // InternalAADMParser.g:3675:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_key_0_0, grammarAccess.getEMapEntryAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEMapEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.sodalite.dsl.AADM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getEMapEntryAccess().getColonKeyword_1());
            		
            // InternalAADMParser.g:3695:3: ( (lv_value_2_0= ruleEAssignmentValue ) )
            // InternalAADMParser.g:3696:4: (lv_value_2_0= ruleEAssignmentValue )
            {
            // InternalAADMParser.g:3696:4: (lv_value_2_0= ruleEAssignmentValue )
            // InternalAADMParser.g:3697:5: lv_value_2_0= ruleEAssignmentValue
            {

            					newCompositeNode(grammarAccess.getEMapEntryAccess().getValueEAssignmentValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEAssignmentValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEMapEntryRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.sodalite.dsl.AADM.EAssignmentValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMapEntry"


    // $ANTLR start "entryRuleELIST"
    // InternalAADMParser.g:3718:1: entryRuleELIST returns [EObject current=null] : iv_ruleELIST= ruleELIST EOF ;
    public final EObject entryRuleELIST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELIST = null;


        try {
            // InternalAADMParser.g:3718:46: (iv_ruleELIST= ruleELIST EOF )
            // InternalAADMParser.g:3719:2: iv_ruleELIST= ruleELIST EOF
            {
             newCompositeNode(grammarAccess.getELISTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELIST=ruleELIST();

            state._fsp--;

             current =iv_ruleELIST; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELIST"


    // $ANTLR start "ruleELIST"
    // InternalAADMParser.g:3725:1: ruleELIST returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_list_2_0= ruleEAlphaNumericValue ) )? (otherlv_3= Comma ( (lv_list_4_0= ruleEAlphaNumericValue ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleELIST() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_list_2_0 = null;

        EObject lv_list_4_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3731:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_list_2_0= ruleEAlphaNumericValue ) )? (otherlv_3= Comma ( (lv_list_4_0= ruleEAlphaNumericValue ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalAADMParser.g:3732:2: ( () otherlv_1= LeftSquareBracket ( (lv_list_2_0= ruleEAlphaNumericValue ) )? (otherlv_3= Comma ( (lv_list_4_0= ruleEAlphaNumericValue ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalAADMParser.g:3732:2: ( () otherlv_1= LeftSquareBracket ( (lv_list_2_0= ruleEAlphaNumericValue ) )? (otherlv_3= Comma ( (lv_list_4_0= ruleEAlphaNumericValue ) ) )* otherlv_5= RightSquareBracket )
            // InternalAADMParser.g:3733:3: () otherlv_1= LeftSquareBracket ( (lv_list_2_0= ruleEAlphaNumericValue ) )? (otherlv_3= Comma ( (lv_list_4_0= ruleEAlphaNumericValue ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalAADMParser.g:3733:3: ()
            // InternalAADMParser.g:3734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getELISTAccess().getELISTAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getELISTAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalAADMParser.g:3744:3: ( (lv_list_2_0= ruleEAlphaNumericValue ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=HyphenMinus && LA26_0<=FullStop)||(LA26_0>=RULE_INT && LA26_0<=RULE_STRING)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAADMParser.g:3745:4: (lv_list_2_0= ruleEAlphaNumericValue )
                    {
                    // InternalAADMParser.g:3745:4: (lv_list_2_0= ruleEAlphaNumericValue )
                    // InternalAADMParser.g:3746:5: lv_list_2_0= ruleEAlphaNumericValue
                    {

                    					newCompositeNode(grammarAccess.getELISTAccess().getListEAlphaNumericValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_43);
                    lv_list_2_0=ruleEAlphaNumericValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getELISTRule());
                    					}
                    					add(
                    						current,
                    						"list",
                    						lv_list_2_0,
                    						"org.sodalite.dsl.AADM.EAlphaNumericValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAADMParser.g:3763:3: (otherlv_3= Comma ( (lv_list_4_0= ruleEAlphaNumericValue ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAADMParser.g:3764:4: otherlv_3= Comma ( (lv_list_4_0= ruleEAlphaNumericValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_34); 

            	    				newLeafNode(otherlv_3, grammarAccess.getELISTAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalAADMParser.g:3768:4: ( (lv_list_4_0= ruleEAlphaNumericValue ) )
            	    // InternalAADMParser.g:3769:5: (lv_list_4_0= ruleEAlphaNumericValue )
            	    {
            	    // InternalAADMParser.g:3769:5: (lv_list_4_0= ruleEAlphaNumericValue )
            	    // InternalAADMParser.g:3770:6: lv_list_4_0= ruleEAlphaNumericValue
            	    {

            	    						newCompositeNode(grammarAccess.getELISTAccess().getListEAlphaNumericValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_list_4_0=ruleEAlphaNumericValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getELISTRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_4_0,
            	    							"org.sodalite.dsl.AADM.EAlphaNumericValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getELISTAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELIST"


    // $ANTLR start "entryRuleEAlphaNumericValue"
    // InternalAADMParser.g:3796:1: entryRuleEAlphaNumericValue returns [EObject current=null] : iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF ;
    public final EObject entryRuleEAlphaNumericValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAlphaNumericValue = null;


        try {
            // InternalAADMParser.g:3796:59: (iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF )
            // InternalAADMParser.g:3797:2: iv_ruleEAlphaNumericValue= ruleEAlphaNumericValue EOF
            {
             newCompositeNode(grammarAccess.getEAlphaNumericValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAlphaNumericValue=ruleEAlphaNumericValue();

            state._fsp--;

             current =iv_ruleEAlphaNumericValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAlphaNumericValue"


    // $ANTLR start "ruleEAlphaNumericValue"
    // InternalAADMParser.g:3803:1: ruleEAlphaNumericValue returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT ) ;
    public final EObject ruleEAlphaNumericValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_EFLOAT_1 = null;

        EObject this_ESIGNEDINT_2 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3809:2: ( (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT ) )
            // InternalAADMParser.g:3810:2: (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT )
            {
            // InternalAADMParser.g:3810:2: (this_ESTRING_0= ruleESTRING | this_EFLOAT_1= ruleEFLOAT | this_ESIGNEDINT_2= ruleESIGNEDINT )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt28=1;
                }
                break;
            case RULE_INT:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==EOF||LA28_2==Comma||LA28_2==RightSquareBracket) ) {
                    alt28=3;
                }
                else if ( (LA28_2==FullStop) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case FullStop:
                {
                alt28=2;
                }
                break;
            case HyphenMinus:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalAADMParser.g:3811:3: this_ESTRING_0= ruleESTRING
                    {

                    			newCompositeNode(grammarAccess.getEAlphaNumericValueAccess().getESTRINGParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESTRING_0=ruleESTRING();

                    state._fsp--;


                    			current = this_ESTRING_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAADMParser.g:3820:3: this_EFLOAT_1= ruleEFLOAT
                    {

                    			newCompositeNode(grammarAccess.getEAlphaNumericValueAccess().getEFLOATParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFLOAT_1=ruleEFLOAT();

                    state._fsp--;


                    			current = this_EFLOAT_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAADMParser.g:3829:3: this_ESIGNEDINT_2= ruleESIGNEDINT
                    {

                    			newCompositeNode(grammarAccess.getEAlphaNumericValueAccess().getESIGNEDINTParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESIGNEDINT_2=ruleESIGNEDINT();

                    state._fsp--;


                    			current = this_ESIGNEDINT_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAlphaNumericValue"


    // $ANTLR start "entryRuleEInputs"
    // InternalAADMParser.g:3841:1: entryRuleEInputs returns [EObject current=null] : iv_ruleEInputs= ruleEInputs EOF ;
    public final EObject entryRuleEInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputs = null;


        try {
            // InternalAADMParser.g:3841:48: (iv_ruleEInputs= ruleEInputs EOF )
            // InternalAADMParser.g:3842:2: iv_ruleEInputs= ruleEInputs EOF
            {
             newCompositeNode(grammarAccess.getEInputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInputs=ruleEInputs();

            state._fsp--;

             current =iv_ruleEInputs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInputs"


    // $ANTLR start "ruleEInputs"
    // InternalAADMParser.g:3848:1: ruleEInputs returns [EObject current=null] : ( () ( (lv_parameters_1_0= ruleEParameterDefinition ) )* ) ;
    public final EObject ruleEInputs() throws RecognitionException {
        EObject current = null;

        EObject lv_parameters_1_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3854:2: ( ( () ( (lv_parameters_1_0= ruleEParameterDefinition ) )* ) )
            // InternalAADMParser.g:3855:2: ( () ( (lv_parameters_1_0= ruleEParameterDefinition ) )* )
            {
            // InternalAADMParser.g:3855:2: ( () ( (lv_parameters_1_0= ruleEParameterDefinition ) )* )
            // InternalAADMParser.g:3856:3: () ( (lv_parameters_1_0= ruleEParameterDefinition ) )*
            {
            // InternalAADMParser.g:3856:3: ()
            // InternalAADMParser.g:3857:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInputsAccess().getEInputsAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:3863:3: ( (lv_parameters_1_0= ruleEParameterDefinition ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAADMParser.g:3864:4: (lv_parameters_1_0= ruleEParameterDefinition )
            	    {
            	    // InternalAADMParser.g:3864:4: (lv_parameters_1_0= ruleEParameterDefinition )
            	    // InternalAADMParser.g:3865:5: lv_parameters_1_0= ruleEParameterDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInputsAccess().getParametersEParameterDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_parameters_1_0=ruleEParameterDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEInputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_1_0,
            	    						"org.sodalite.dsl.AADM.EParameterDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInputs"


    // $ANTLR start "entryRuleEParameterDefinition"
    // InternalAADMParser.g:3886:1: entryRuleEParameterDefinition returns [EObject current=null] : iv_ruleEParameterDefinition= ruleEParameterDefinition EOF ;
    public final EObject entryRuleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinition = null;


        try {
            // InternalAADMParser.g:3886:61: (iv_ruleEParameterDefinition= ruleEParameterDefinition EOF )
            // InternalAADMParser.g:3887:2: iv_ruleEParameterDefinition= ruleEParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getEParameterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameterDefinition=ruleEParameterDefinition();

            state._fsp--;

             current =iv_ruleEParameterDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEParameterDefinition"


    // $ANTLR start "ruleEParameterDefinition"
    // InternalAADMParser.g:3893:1: ruleEParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3899:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalAADMParser.g:3900:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalAADMParser.g:3900:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END )
            // InternalAADMParser.g:3901:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalAADMParser.g:3901:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAADMParser.g:3902:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAADMParser.g:3902:4: (lv_name_0_0= RULE_ID )
            // InternalAADMParser.g:3903:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEParameterDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEParameterDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.AADM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEParameterDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalAADMParser.g:3927:3: ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) )
            // InternalAADMParser.g:3928:4: (lv_parameter_3_0= ruleEParameterDefinitionBody )
            {
            // InternalAADMParser.g:3928:4: (lv_parameter_3_0= ruleEParameterDefinitionBody )
            // InternalAADMParser.g:3929:5: lv_parameter_3_0= ruleEParameterDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEParameterDefinitionAccess().getParameterEParameterDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_parameter_3_0=ruleEParameterDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterDefinitionRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_3_0,
            						"org.sodalite.dsl.AADM.EParameterDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEParameterDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEParameterDefinition"


    // $ANTLR start "entryRuleEParameterDefinitionBody"
    // InternalAADMParser.g:3954:1: entryRuleEParameterDefinitionBody returns [EObject current=null] : iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF ;
    public final EObject entryRuleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinitionBody = null;


        try {
            // InternalAADMParser.g:3954:65: (iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF )
            // InternalAADMParser.g:3955:2: iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEParameterDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameterDefinitionBody=ruleEParameterDefinitionBody();

            state._fsp--;

             current =iv_ruleEParameterDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEParameterDefinitionBody"


    // $ANTLR start "ruleEParameterDefinitionBody"
    // InternalAADMParser.g:3961:1: ruleEParameterDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_type_3_0 = null;

        EObject lv_value_7_0 = null;

        EObject lv_default_9_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:3967:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) )
            // InternalAADMParser.g:3968:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalAADMParser.g:3968:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            // InternalAADMParser.g:3969:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            {
            // InternalAADMParser.g:3969:3: ()
            // InternalAADMParser.g:3970:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterDefinitionBodyAccess().getEParameterDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalAADMParser.g:3976:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            // InternalAADMParser.g:3977:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            {
            // InternalAADMParser.g:3977:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            // InternalAADMParser.g:3978:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalAADMParser.g:3981:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )* )
            // InternalAADMParser.g:3982:6: ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )*
            {
            // InternalAADMParser.g:3982:6: ( ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) ) )*
            loop30:
            do {
                int alt30=5;
                int LA30_0 = input.LA(1);

                if ( LA30_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 == Value && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt30=3;
                }
                else if ( LA30_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt30=4;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAADMParser.g:3983:4: ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:3983:4: ({...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) ) )
            	    // InternalAADMParser.g:3984:5: {...}? => ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalAADMParser.g:3984:121: ( ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) ) )
            	    // InternalAADMParser.g:3985:6: ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalAADMParser.g:3988:9: ({...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) ) )
            	    // InternalAADMParser.g:3988:10: {...}? => (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:3988:19: (otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) ) )
            	    // InternalAADMParser.g:3988:20: otherlv_2= Type ( (lv_type_3_0= ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,Type,FOLLOW_12); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEParameterDefinitionBodyAccess().getTypeKeyword_1_0_0());
            	    								
            	    // InternalAADMParser.g:3992:9: ( (lv_type_3_0= ruleEDataTypeName ) )
            	    // InternalAADMParser.g:3993:10: (lv_type_3_0= ruleEDataTypeName )
            	    {
            	    // InternalAADMParser.g:3993:10: (lv_type_3_0= ruleEDataTypeName )
            	    // InternalAADMParser.g:3994:11: lv_type_3_0= ruleEDataTypeName
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getTypeEDataTypeNameParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_type_3_0=ruleEDataTypeName();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_3_0,
            	    												"org.sodalite.dsl.AADM.EDataTypeName");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAADMParser.g:4017:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:4017:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAADMParser.g:4018:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalAADMParser.g:4018:121: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalAADMParser.g:4019:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalAADMParser.g:4022:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalAADMParser.g:4022:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:4022:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalAADMParser.g:4022:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEParameterDefinitionBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalAADMParser.g:4026:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalAADMParser.g:4027:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalAADMParser.g:4027:10: (lv_description_5_0= RULE_STRING )
            	    // InternalAADMParser.g:4028:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getEParameterDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAADMParser.g:4050:4: ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:4050:4: ({...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalAADMParser.g:4051:5: {...}? => ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalAADMParser.g:4051:121: ( ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) ) )
            	    // InternalAADMParser.g:4052:6: ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalAADMParser.g:4055:9: ({...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) ) )
            	    // InternalAADMParser.g:4055:10: {...}? => (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:4055:19: (otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) ) )
            	    // InternalAADMParser.g:4055:20: otherlv_6= Value ( (lv_value_7_0= ruleEValueExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,Value,FOLLOW_41); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEParameterDefinitionBodyAccess().getValueKeyword_1_2_0());
            	    								
            	    // InternalAADMParser.g:4059:9: ( (lv_value_7_0= ruleEValueExpression ) )
            	    // InternalAADMParser.g:4060:10: (lv_value_7_0= ruleEValueExpression )
            	    {
            	    // InternalAADMParser.g:4060:10: (lv_value_7_0= ruleEValueExpression )
            	    // InternalAADMParser.g:4061:11: lv_value_7_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getValueEValueExpressionParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_value_7_0=ruleEValueExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"value",
            	    												lv_value_7_0,
            	    												"org.sodalite.dsl.AADM.EValueExpression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAADMParser.g:4084:4: ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:4084:4: ({...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalAADMParser.g:4085:5: {...}? => ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalAADMParser.g:4085:121: ( ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) ) )
            	    // InternalAADMParser.g:4086:6: ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalAADMParser.g:4089:9: ({...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) ) )
            	    // InternalAADMParser.g:4089:10: {...}? => (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalAADMParser.g:4089:19: (otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) ) )
            	    // InternalAADMParser.g:4089:20: otherlv_8= Default ( (lv_default_9_0= ruleEValueExpression ) )
            	    {
            	    otherlv_8=(Token)match(input,Default,FOLLOW_41); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEParameterDefinitionBodyAccess().getDefaultKeyword_1_3_0());
            	    								
            	    // InternalAADMParser.g:4093:9: ( (lv_default_9_0= ruleEValueExpression ) )
            	    // InternalAADMParser.g:4094:10: (lv_default_9_0= ruleEValueExpression )
            	    {
            	    // InternalAADMParser.g:4094:10: (lv_default_9_0= ruleEValueExpression )
            	    // InternalAADMParser.g:4095:11: lv_default_9_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_default_9_0=ruleEValueExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"default",
            	    												lv_default_9_0,
            	    												"org.sodalite.dsl.AADM.EValueExpression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEParameterDefinitionBody"


    // $ANTLR start "entryRuleEValueExpression"
    // InternalAADMParser.g:4129:1: entryRuleEValueExpression returns [EObject current=null] : iv_ruleEValueExpression= ruleEValueExpression EOF ;
    public final EObject entryRuleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueExpression = null;


        try {
            // InternalAADMParser.g:4129:57: (iv_ruleEValueExpression= ruleEValueExpression EOF )
            // InternalAADMParser.g:4130:2: iv_ruleEValueExpression= ruleEValueExpression EOF
            {
             newCompositeNode(grammarAccess.getEValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValueExpression=ruleEValueExpression();

            state._fsp--;

             current =iv_ruleEValueExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEValueExpression"


    // $ANTLR start "ruleEValueExpression"
    // InternalAADMParser.g:4136:1: ruleEValueExpression returns [EObject current=null] : (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction ) ;
    public final EObject ruleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ESingleValue_0 = null;

        EObject this_EFunction_1 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4142:2: ( (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction ) )
            // InternalAADMParser.g:4143:2: (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction )
            {
            // InternalAADMParser.g:4143:2: (this_ESingleValue_0= ruleESingleValue | this_EFunction_1= ruleEFunction )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=HyphenMinus && LA31_0<=FullStop)||LA31_0==RULE_BOOLEAN||(LA31_0>=RULE_INT && LA31_0<=RULE_STRING)) ) {
                alt31=1;
            }
            else if ( (LA31_0==Get_attribute||LA31_0==Get_property||LA31_0==Get_input) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalAADMParser.g:4144:3: this_ESingleValue_0= ruleESingleValue
                    {

                    			newCompositeNode(grammarAccess.getEValueExpressionAccess().getESingleValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESingleValue_0=ruleESingleValue();

                    state._fsp--;


                    			current = this_ESingleValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAADMParser.g:4153:3: this_EFunction_1= ruleEFunction
                    {

                    			newCompositeNode(grammarAccess.getEValueExpressionAccess().getEFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFunction_1=ruleEFunction();

                    state._fsp--;


                    			current = this_EFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEValueExpression"


    // $ANTLR start "entryRuleEFunction"
    // InternalAADMParser.g:4165:1: entryRuleEFunction returns [EObject current=null] : iv_ruleEFunction= ruleEFunction EOF ;
    public final EObject entryRuleEFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunction = null;


        try {
            // InternalAADMParser.g:4165:50: (iv_ruleEFunction= ruleEFunction EOF )
            // InternalAADMParser.g:4166:2: iv_ruleEFunction= ruleEFunction EOF
            {
             newCompositeNode(grammarAccess.getEFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFunction=ruleEFunction();

            state._fsp--;

             current =iv_ruleEFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFunction"


    // $ANTLR start "ruleEFunction"
    // InternalAADMParser.g:4172:1: ruleEFunction returns [EObject current=null] : (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) ;
    public final EObject ruleEFunction() throws RecognitionException {
        EObject current = null;

        EObject this_GetProperty_0 = null;

        EObject this_GetAttribute_1 = null;

        EObject this_GetInput_2 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4178:2: ( (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) )
            // InternalAADMParser.g:4179:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            {
            // InternalAADMParser.g:4179:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            int alt32=3;
            switch ( input.LA(1) ) {
            case Get_property:
                {
                alt32=1;
                }
                break;
            case Get_attribute:
                {
                alt32=2;
                }
                break;
            case Get_input:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalAADMParser.g:4180:3: this_GetProperty_0= ruleGetProperty
                    {

                    			newCompositeNode(grammarAccess.getEFunctionAccess().getGetPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetProperty_0=ruleGetProperty();

                    state._fsp--;


                    			current = this_GetProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAADMParser.g:4189:3: this_GetAttribute_1= ruleGetAttribute
                    {

                    			newCompositeNode(grammarAccess.getEFunctionAccess().getGetAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetAttribute_1=ruleGetAttribute();

                    state._fsp--;


                    			current = this_GetAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAADMParser.g:4198:3: this_GetInput_2= ruleGetInput
                    {

                    			newCompositeNode(grammarAccess.getEFunctionAccess().getGetInputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetInput_2=ruleGetInput();

                    state._fsp--;


                    			current = this_GetInput_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFunction"


    // $ANTLR start "entryRuleGetAttribute"
    // InternalAADMParser.g:4210:1: entryRuleGetAttribute returns [EObject current=null] : iv_ruleGetAttribute= ruleGetAttribute EOF ;
    public final EObject entryRuleGetAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttribute = null;


        try {
            // InternalAADMParser.g:4210:53: (iv_ruleGetAttribute= ruleGetAttribute EOF )
            // InternalAADMParser.g:4211:2: iv_ruleGetAttribute= ruleGetAttribute EOF
            {
             newCompositeNode(grammarAccess.getGetAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetAttribute=ruleGetAttribute();

            state._fsp--;

             current =iv_ruleGetAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetAttribute"


    // $ANTLR start "ruleGetAttribute"
    // InternalAADMParser.g:4217:1: ruleGetAttribute returns [EObject current=null] : (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleGetAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4223:2: ( (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END ) )
            // InternalAADMParser.g:4224:2: (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END )
            {
            // InternalAADMParser.g:4224:2: (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END )
            // InternalAADMParser.g:4225:3: otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Get_attribute,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGetAttributeAccess().getGet_attributeKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_46); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGetAttributeAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalAADMParser.g:4233:3: ( (lv_attribute_2_0= ruleGetAttributeBody ) )
            // InternalAADMParser.g:4234:4: (lv_attribute_2_0= ruleGetAttributeBody )
            {
            // InternalAADMParser.g:4234:4: (lv_attribute_2_0= ruleGetAttributeBody )
            // InternalAADMParser.g:4235:5: lv_attribute_2_0= ruleGetAttributeBody
            {

            					newCompositeNode(grammarAccess.getGetAttributeAccess().getAttributeGetAttributeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_attribute_2_0=ruleGetAttributeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetAttributeRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"org.sodalite.dsl.AADM.GetAttributeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getGetAttributeAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetAttribute"


    // $ANTLR start "entryRuleGetAttributeBody"
    // InternalAADMParser.g:4260:1: entryRuleGetAttributeBody returns [EObject current=null] : iv_ruleGetAttributeBody= ruleGetAttributeBody EOF ;
    public final EObject entryRuleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttributeBody = null;


        try {
            // InternalAADMParser.g:4260:57: (iv_ruleGetAttributeBody= ruleGetAttributeBody EOF )
            // InternalAADMParser.g:4261:2: iv_ruleGetAttributeBody= ruleGetAttributeBody EOF
            {
             newCompositeNode(grammarAccess.getGetAttributeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetAttributeBody=ruleGetAttributeBody();

            state._fsp--;

             current =iv_ruleGetAttributeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetAttributeBody"


    // $ANTLR start "ruleGetAttributeBody"
    // InternalAADMParser.g:4267:1: ruleGetAttributeBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_attribute_2_0 = null;

        EObject lv_entity_4_0 = null;

        EObject lv_req_cap_6_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4273:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAADMParser.g:4274:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAADMParser.g:4274:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAADMParser.g:4275:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAADMParser.g:4275:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) )
            // InternalAADMParser.g:4276:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            			
            // InternalAADMParser.g:4279:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?)
            // InternalAADMParser.g:4280:5: ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?
            {
            // InternalAADMParser.g:4280:5: ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=4;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == Attribute && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == Entity && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 == Req_cap && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
                    alt33=3;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAADMParser.g:4281:3: ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:4281:3: ({...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    // InternalAADMParser.g:4282:4: {...}? => ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAADMParser.g:4282:110: ( ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) ) )
            	    // InternalAADMParser.g:4283:5: ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAADMParser.g:4286:8: ({...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) ) )
            	    // InternalAADMParser.g:4286:9: {...}? => (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalAADMParser.g:4286:18: (otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) ) )
            	    // InternalAADMParser.g:4286:19: otherlv_1= Attribute ( (lv_attribute_2_0= ruleEPREFIX_REF ) )
            	    {
            	    otherlv_1=(Token)match(input,Attribute,FOLLOW_12); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetAttributeBodyAccess().getAttributeKeyword_0_0());
            	    							
            	    // InternalAADMParser.g:4290:8: ( (lv_attribute_2_0= ruleEPREFIX_REF ) )
            	    // InternalAADMParser.g:4291:9: (lv_attribute_2_0= ruleEPREFIX_REF )
            	    {
            	    // InternalAADMParser.g:4291:9: (lv_attribute_2_0= ruleEPREFIX_REF )
            	    // InternalAADMParser.g:4292:10: lv_attribute_2_0= ruleEPREFIX_REF
            	    {

            	    										newCompositeNode(grammarAccess.getGetAttributeBodyAccess().getAttributeEPREFIX_REFParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_47);
            	    lv_attribute_2_0=ruleEPREFIX_REF();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"attribute",
            	    											lv_attribute_2_0,
            	    											"org.sodalite.dsl.AADM.EPREFIX_REF");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAADMParser.g:4315:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:4315:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) )
            	    // InternalAADMParser.g:4316:4: {...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAADMParser.g:4316:110: ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) )
            	    // InternalAADMParser.g:4317:5: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAADMParser.g:4320:8: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) )
            	    // InternalAADMParser.g:4320:9: {...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalAADMParser.g:4320:18: (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) )
            	    // InternalAADMParser.g:4320:19: otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) )
            	    {
            	    otherlv_3=(Token)match(input,Entity,FOLLOW_48); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetAttributeBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalAADMParser.g:4324:8: ( (lv_entity_4_0= ruleEEntityReference ) )
            	    // InternalAADMParser.g:4325:9: (lv_entity_4_0= ruleEEntityReference )
            	    {
            	    // InternalAADMParser.g:4325:9: (lv_entity_4_0= ruleEEntityReference )
            	    // InternalAADMParser.g:4326:10: lv_entity_4_0= ruleEEntityReference
            	    {

            	    										newCompositeNode(grammarAccess.getGetAttributeBodyAccess().getEntityEEntityReferenceParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_47);
            	    lv_entity_4_0=ruleEEntityReference();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"entity",
            	    											lv_entity_4_0,
            	    											"org.sodalite.dsl.AADM.EEntityReference");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAADMParser.g:4349:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:4349:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    // InternalAADMParser.g:4350:4: {...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAADMParser.g:4350:110: ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) )
            	    // InternalAADMParser.g:4351:5: ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAADMParser.g:4354:8: ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) )
            	    // InternalAADMParser.g:4354:9: {...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalAADMParser.g:4354:18: (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) )
            	    // InternalAADMParser.g:4354:19: otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) )
            	    {
            	    otherlv_5=(Token)match(input,Req_cap,FOLLOW_12); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetAttributeBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalAADMParser.g:4358:8: ( (lv_req_cap_6_0= ruleEPREFIX_REF ) )
            	    // InternalAADMParser.g:4359:9: (lv_req_cap_6_0= ruleEPREFIX_REF )
            	    {
            	    // InternalAADMParser.g:4359:9: (lv_req_cap_6_0= ruleEPREFIX_REF )
            	    // InternalAADMParser.g:4360:10: lv_req_cap_6_0= ruleEPREFIX_REF
            	    {

            	    										newCompositeNode(grammarAccess.getGetAttributeBodyAccess().getReq_capEPREFIX_REFParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_47);
            	    lv_req_cap_6_0=ruleEPREFIX_REF();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"req_cap",
            	    											lv_req_cap_6_0,
            	    											"org.sodalite.dsl.AADM.EPREFIX_REF");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetAttributeBody"


    // $ANTLR start "entryRuleEEntityReference"
    // InternalAADMParser.g:4394:1: entryRuleEEntityReference returns [EObject current=null] : iv_ruleEEntityReference= ruleEEntityReference EOF ;
    public final EObject entryRuleEEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEntityReference = null;


        try {
            // InternalAADMParser.g:4394:57: (iv_ruleEEntityReference= ruleEEntityReference EOF )
            // InternalAADMParser.g:4395:2: iv_ruleEEntityReference= ruleEEntityReference EOF
            {
             newCompositeNode(grammarAccess.getEEntityReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEntityReference=ruleEEntityReference();

            state._fsp--;

             current =iv_ruleEEntityReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEEntityReference"


    // $ANTLR start "ruleEEntityReference"
    // InternalAADMParser.g:4401:1: ruleEEntityReference returns [EObject current=null] : (this_EEntity_0= ruleEEntity | this_EPREFIX_TYPE_1= ruleEPREFIX_TYPE | this_EPREFIX_ID_2= ruleEPREFIX_ID ) ;
    public final EObject ruleEEntityReference() throws RecognitionException {
        EObject current = null;

        EObject this_EEntity_0 = null;

        EObject this_EPREFIX_TYPE_1 = null;

        EObject this_EPREFIX_ID_2 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4407:2: ( (this_EEntity_0= ruleEEntity | this_EPREFIX_TYPE_1= ruleEPREFIX_TYPE | this_EPREFIX_ID_2= ruleEPREFIX_ID ) )
            // InternalAADMParser.g:4408:2: (this_EEntity_0= ruleEEntity | this_EPREFIX_TYPE_1= ruleEPREFIX_TYPE | this_EPREFIX_ID_2= ruleEPREFIX_ID )
            {
            // InternalAADMParser.g:4408:2: (this_EEntity_0= ruleEEntity | this_EPREFIX_TYPE_1= ruleEPREFIX_TYPE | this_EPREFIX_ID_2= ruleEPREFIX_ID )
            int alt34=3;
            switch ( input.LA(1) ) {
            case RULE_ENTITY:
                {
                alt34=1;
                }
                break;
            case RULE_ID:
                {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==EOF||LA34_2==Attribute||LA34_2==Property||LA34_2==Req_cap||LA34_2==Entity||LA34_2==CommercialAt||LA34_2==RULE_END) ) {
                    alt34=3;
                }
                else if ( (LA34_2==Solidus) ) {
                    int LA34_5 = input.LA(3);

                    if ( (LA34_5==RULE_QUALIFIED_NAME) ) {
                        alt34=2;
                    }
                    else if ( (LA34_5==RULE_ID) ) {
                        alt34=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_QUALIFIED_NAME:
                {
                alt34=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalAADMParser.g:4409:3: this_EEntity_0= ruleEEntity
                    {

                    			newCompositeNode(grammarAccess.getEEntityReferenceAccess().getEEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EEntity_0=ruleEEntity();

                    state._fsp--;


                    			current = this_EEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAADMParser.g:4418:3: this_EPREFIX_TYPE_1= ruleEPREFIX_TYPE
                    {

                    			newCompositeNode(grammarAccess.getEEntityReferenceAccess().getEPREFIX_TYPEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPREFIX_TYPE_1=ruleEPREFIX_TYPE();

                    state._fsp--;


                    			current = this_EPREFIX_TYPE_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAADMParser.g:4427:3: this_EPREFIX_ID_2= ruleEPREFIX_ID
                    {

                    			newCompositeNode(grammarAccess.getEEntityReferenceAccess().getEPREFIX_IDParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPREFIX_ID_2=ruleEPREFIX_ID();

                    state._fsp--;


                    			current = this_EPREFIX_ID_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEEntityReference"


    // $ANTLR start "entryRuleEPREFIX_REF"
    // InternalAADMParser.g:4439:1: entryRuleEPREFIX_REF returns [EObject current=null] : iv_ruleEPREFIX_REF= ruleEPREFIX_REF EOF ;
    public final EObject entryRuleEPREFIX_REF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPREFIX_REF = null;


        try {
            // InternalAADMParser.g:4439:52: (iv_ruleEPREFIX_REF= ruleEPREFIX_REF EOF )
            // InternalAADMParser.g:4440:2: iv_ruleEPREFIX_REF= ruleEPREFIX_REF EOF
            {
             newCompositeNode(grammarAccess.getEPREFIX_REFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPREFIX_REF=ruleEPREFIX_REF();

            state._fsp--;

             current =iv_ruleEPREFIX_REF; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPREFIX_REF"


    // $ANTLR start "ruleEPREFIX_REF"
    // InternalAADMParser.g:4446:1: ruleEPREFIX_REF returns [EObject current=null] : (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPREFIX_ID_1= ruleEPREFIX_ID ) ;
    public final EObject ruleEPREFIX_REF() throws RecognitionException {
        EObject current = null;

        EObject this_EPREFIX_TYPE_0 = null;

        EObject this_EPREFIX_ID_1 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4452:2: ( (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPREFIX_ID_1= ruleEPREFIX_ID ) )
            // InternalAADMParser.g:4453:2: (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPREFIX_ID_1= ruleEPREFIX_ID )
            {
            // InternalAADMParser.g:4453:2: (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPREFIX_ID_1= ruleEPREFIX_ID )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==Solidus) ) {
                    int LA35_3 = input.LA(3);

                    if ( (LA35_3==RULE_QUALIFIED_NAME) ) {
                        alt35=1;
                    }
                    else if ( (LA35_3==RULE_ID) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA35_1==EOF||LA35_1==Requirement||LA35_1==Capability||LA35_1==Attribute||LA35_1==Property||LA35_1==Req_cap||LA35_1==Entity||LA35_1==Node||LA35_1==CommercialAt||LA35_1==RULE_END) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA35_0==RULE_QUALIFIED_NAME) ) {
                alt35=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalAADMParser.g:4454:3: this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE
                    {

                    			newCompositeNode(grammarAccess.getEPREFIX_REFAccess().getEPREFIX_TYPEParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPREFIX_TYPE_0=ruleEPREFIX_TYPE();

                    state._fsp--;


                    			current = this_EPREFIX_TYPE_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAADMParser.g:4463:3: this_EPREFIX_ID_1= ruleEPREFIX_ID
                    {

                    			newCompositeNode(grammarAccess.getEPREFIX_REFAccess().getEPREFIX_IDParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPREFIX_ID_1=ruleEPREFIX_ID();

                    state._fsp--;


                    			current = this_EPREFIX_ID_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPREFIX_REF"


    // $ANTLR start "entryRuleEPREFIX_ID"
    // InternalAADMParser.g:4475:1: entryRuleEPREFIX_ID returns [EObject current=null] : iv_ruleEPREFIX_ID= ruleEPREFIX_ID EOF ;
    public final EObject entryRuleEPREFIX_ID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPREFIX_ID = null;


        try {
            // InternalAADMParser.g:4475:51: (iv_ruleEPREFIX_ID= ruleEPREFIX_ID EOF )
            // InternalAADMParser.g:4476:2: iv_ruleEPREFIX_ID= ruleEPREFIX_ID EOF
            {
             newCompositeNode(grammarAccess.getEPREFIX_IDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPREFIX_ID=ruleEPREFIX_ID();

            state._fsp--;

             current =iv_ruleEPREFIX_ID; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPREFIX_ID"


    // $ANTLR start "ruleEPREFIX_ID"
    // InternalAADMParser.g:4482:1: ruleEPREFIX_ID returns [EObject current=null] : ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= CommercialAt ( (lv_version_4_0= RULE_VERSION ) ) )? ) ;
    public final EObject ruleEPREFIX_ID() throws RecognitionException {
        EObject current = null;

        Token lv_module_0_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;


        	enterRule();

        try {
            // InternalAADMParser.g:4488:2: ( ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= CommercialAt ( (lv_version_4_0= RULE_VERSION ) ) )? ) )
            // InternalAADMParser.g:4489:2: ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= CommercialAt ( (lv_version_4_0= RULE_VERSION ) ) )? )
            {
            // InternalAADMParser.g:4489:2: ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= CommercialAt ( (lv_version_4_0= RULE_VERSION ) ) )? )
            // InternalAADMParser.g:4490:3: ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= CommercialAt ( (lv_version_4_0= RULE_VERSION ) ) )?
            {
            // InternalAADMParser.g:4490:3: ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==Solidus) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalAADMParser.g:4491:4: ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus
                    {
                    // InternalAADMParser.g:4491:4: ( (lv_module_0_0= RULE_ID ) )
                    // InternalAADMParser.g:4492:5: (lv_module_0_0= RULE_ID )
                    {
                    // InternalAADMParser.g:4492:5: (lv_module_0_0= RULE_ID )
                    // InternalAADMParser.g:4493:6: lv_module_0_0= RULE_ID
                    {
                    lv_module_0_0=(Token)match(input,RULE_ID,FOLLOW_49); 

                    						newLeafNode(lv_module_0_0, grammarAccess.getEPREFIX_IDAccess().getModuleIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPREFIX_IDRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"module",
                    							lv_module_0_0,
                    							"org.sodalite.dsl.AADM.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,Solidus,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPREFIX_IDAccess().getSolidusKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalAADMParser.g:4514:3: ( (lv_id_2_0= RULE_ID ) )
            // InternalAADMParser.g:4515:4: (lv_id_2_0= RULE_ID )
            {
            // InternalAADMParser.g:4515:4: (lv_id_2_0= RULE_ID )
            // InternalAADMParser.g:4516:5: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(lv_id_2_0, grammarAccess.getEPREFIX_IDAccess().getIdIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPREFIX_IDRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_2_0,
            						"org.sodalite.dsl.AADM.ID");
            				

            }


            }

            // InternalAADMParser.g:4532:3: (otherlv_3= CommercialAt ( (lv_version_4_0= RULE_VERSION ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==CommercialAt) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAADMParser.g:4533:4: otherlv_3= CommercialAt ( (lv_version_4_0= RULE_VERSION ) )
                    {
                    otherlv_3=(Token)match(input,CommercialAt,FOLLOW_51); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPREFIX_IDAccess().getCommercialAtKeyword_2_0());
                    			
                    // InternalAADMParser.g:4537:4: ( (lv_version_4_0= RULE_VERSION ) )
                    // InternalAADMParser.g:4538:5: (lv_version_4_0= RULE_VERSION )
                    {
                    // InternalAADMParser.g:4538:5: (lv_version_4_0= RULE_VERSION )
                    // InternalAADMParser.g:4539:6: lv_version_4_0= RULE_VERSION
                    {
                    lv_version_4_0=(Token)match(input,RULE_VERSION,FOLLOW_2); 

                    						newLeafNode(lv_version_4_0, grammarAccess.getEPREFIX_IDAccess().getVersionVERSIONTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPREFIX_IDRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"version",
                    							lv_version_4_0,
                    							"org.sodalite.dsl.AADM.VERSION");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPREFIX_ID"


    // $ANTLR start "entryRuleEEntity"
    // InternalAADMParser.g:4560:1: entryRuleEEntity returns [EObject current=null] : iv_ruleEEntity= ruleEEntity EOF ;
    public final EObject entryRuleEEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEntity = null;


        try {
            // InternalAADMParser.g:4560:48: (iv_ruleEEntity= ruleEEntity EOF )
            // InternalAADMParser.g:4561:2: iv_ruleEEntity= ruleEEntity EOF
            {
             newCompositeNode(grammarAccess.getEEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEntity=ruleEEntity();

            state._fsp--;

             current =iv_ruleEEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEEntity"


    // $ANTLR start "ruleEEntity"
    // InternalAADMParser.g:4567:1: ruleEEntity returns [EObject current=null] : ( (lv_entity_0_0= RULE_ENTITY ) ) ;
    public final EObject ruleEEntity() throws RecognitionException {
        EObject current = null;

        Token lv_entity_0_0=null;


        	enterRule();

        try {
            // InternalAADMParser.g:4573:2: ( ( (lv_entity_0_0= RULE_ENTITY ) ) )
            // InternalAADMParser.g:4574:2: ( (lv_entity_0_0= RULE_ENTITY ) )
            {
            // InternalAADMParser.g:4574:2: ( (lv_entity_0_0= RULE_ENTITY ) )
            // InternalAADMParser.g:4575:3: (lv_entity_0_0= RULE_ENTITY )
            {
            // InternalAADMParser.g:4575:3: (lv_entity_0_0= RULE_ENTITY )
            // InternalAADMParser.g:4576:4: lv_entity_0_0= RULE_ENTITY
            {
            lv_entity_0_0=(Token)match(input,RULE_ENTITY,FOLLOW_2); 

            				newLeafNode(lv_entity_0_0, grammarAccess.getEEntityAccess().getEntityENTITYTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEEntityRule());
            				}
            				setWithLastConsumed(
            					current,
            					"entity",
            					lv_entity_0_0,
            					"org.sodalite.dsl.AADM.ENTITY");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEEntity"


    // $ANTLR start "entryRuleGetProperty"
    // InternalAADMParser.g:4595:1: entryRuleGetProperty returns [EObject current=null] : iv_ruleGetProperty= ruleGetProperty EOF ;
    public final EObject entryRuleGetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetProperty = null;


        try {
            // InternalAADMParser.g:4595:52: (iv_ruleGetProperty= ruleGetProperty EOF )
            // InternalAADMParser.g:4596:2: iv_ruleGetProperty= ruleGetProperty EOF
            {
             newCompositeNode(grammarAccess.getGetPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetProperty=ruleGetProperty();

            state._fsp--;

             current =iv_ruleGetProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetProperty"


    // $ANTLR start "ruleGetProperty"
    // InternalAADMParser.g:4602:1: ruleGetProperty returns [EObject current=null] : (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleGetProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_property_2_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4608:2: ( (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END ) )
            // InternalAADMParser.g:4609:2: (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END )
            {
            // InternalAADMParser.g:4609:2: (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END )
            // InternalAADMParser.g:4610:3: otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Get_property,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGetPropertyAccess().getGet_propertyKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_52); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGetPropertyAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalAADMParser.g:4618:3: ( (lv_property_2_0= ruleGetPropertyBody ) )
            // InternalAADMParser.g:4619:4: (lv_property_2_0= ruleGetPropertyBody )
            {
            // InternalAADMParser.g:4619:4: (lv_property_2_0= ruleGetPropertyBody )
            // InternalAADMParser.g:4620:5: lv_property_2_0= ruleGetPropertyBody
            {

            					newCompositeNode(grammarAccess.getGetPropertyAccess().getPropertyGetPropertyBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_property_2_0=ruleGetPropertyBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetPropertyRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_2_0,
            						"org.sodalite.dsl.AADM.GetPropertyBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getGetPropertyAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetProperty"


    // $ANTLR start "entryRuleGetPropertyBody"
    // InternalAADMParser.g:4645:1: entryRuleGetPropertyBody returns [EObject current=null] : iv_ruleGetPropertyBody= ruleGetPropertyBody EOF ;
    public final EObject entryRuleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetPropertyBody = null;


        try {
            // InternalAADMParser.g:4645:56: (iv_ruleGetPropertyBody= ruleGetPropertyBody EOF )
            // InternalAADMParser.g:4646:2: iv_ruleGetPropertyBody= ruleGetPropertyBody EOF
            {
             newCompositeNode(grammarAccess.getGetPropertyBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetPropertyBody=ruleGetPropertyBody();

            state._fsp--;

             current =iv_ruleGetPropertyBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetPropertyBody"


    // $ANTLR start "ruleGetPropertyBody"
    // InternalAADMParser.g:4652:1: ruleGetPropertyBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_property_2_0 = null;

        EObject lv_entity_4_0 = null;

        EObject lv_req_cap_6_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4658:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAADMParser.g:4659:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAADMParser.g:4659:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAADMParser.g:4660:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAADMParser.g:4660:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?) )
            // InternalAADMParser.g:4661:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            			
            // InternalAADMParser.g:4664:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?)
            // InternalAADMParser.g:4665:5: ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+ {...}?
            {
            // InternalAADMParser.g:4665:5: ( ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=4;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == Property && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == Entity && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 == Req_cap && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
                    alt38=3;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAADMParser.g:4666:3: ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:4666:3: ({...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    // InternalAADMParser.g:4667:4: {...}? => ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAADMParser.g:4667:109: ( ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) ) )
            	    // InternalAADMParser.g:4668:5: ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAADMParser.g:4671:8: ({...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) ) )
            	    // InternalAADMParser.g:4671:9: {...}? => (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalAADMParser.g:4671:18: (otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) ) )
            	    // InternalAADMParser.g:4671:19: otherlv_1= Property ( (lv_property_2_0= ruleEPREFIX_REF ) )
            	    {
            	    otherlv_1=(Token)match(input,Property,FOLLOW_12); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetPropertyBodyAccess().getPropertyKeyword_0_0());
            	    							
            	    // InternalAADMParser.g:4675:8: ( (lv_property_2_0= ruleEPREFIX_REF ) )
            	    // InternalAADMParser.g:4676:9: (lv_property_2_0= ruleEPREFIX_REF )
            	    {
            	    // InternalAADMParser.g:4676:9: (lv_property_2_0= ruleEPREFIX_REF )
            	    // InternalAADMParser.g:4677:10: lv_property_2_0= ruleEPREFIX_REF
            	    {

            	    										newCompositeNode(grammarAccess.getGetPropertyBodyAccess().getPropertyEPREFIX_REFParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_53);
            	    lv_property_2_0=ruleEPREFIX_REF();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"property",
            	    											lv_property_2_0,
            	    											"org.sodalite.dsl.AADM.EPREFIX_REF");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAADMParser.g:4700:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:4700:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) ) )
            	    // InternalAADMParser.g:4701:4: {...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAADMParser.g:4701:109: ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) ) )
            	    // InternalAADMParser.g:4702:5: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAADMParser.g:4705:8: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) ) )
            	    // InternalAADMParser.g:4705:9: {...}? => (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalAADMParser.g:4705:18: (otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) ) )
            	    // InternalAADMParser.g:4705:19: otherlv_3= Entity ( (lv_entity_4_0= ruleEEntityReference ) )
            	    {
            	    otherlv_3=(Token)match(input,Entity,FOLLOW_48); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetPropertyBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalAADMParser.g:4709:8: ( (lv_entity_4_0= ruleEEntityReference ) )
            	    // InternalAADMParser.g:4710:9: (lv_entity_4_0= ruleEEntityReference )
            	    {
            	    // InternalAADMParser.g:4710:9: (lv_entity_4_0= ruleEEntityReference )
            	    // InternalAADMParser.g:4711:10: lv_entity_4_0= ruleEEntityReference
            	    {

            	    										newCompositeNode(grammarAccess.getGetPropertyBodyAccess().getEntityEEntityReferenceParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_53);
            	    lv_entity_4_0=ruleEEntityReference();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"entity",
            	    											lv_entity_4_0,
            	    											"org.sodalite.dsl.AADM.EEntityReference");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAADMParser.g:4734:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    {
            	    // InternalAADMParser.g:4734:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) ) )
            	    // InternalAADMParser.g:4735:4: {...}? => ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAADMParser.g:4735:109: ( ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) ) )
            	    // InternalAADMParser.g:4736:5: ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAADMParser.g:4739:8: ({...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) ) )
            	    // InternalAADMParser.g:4739:9: {...}? => (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalAADMParser.g:4739:18: (otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) ) )
            	    // InternalAADMParser.g:4739:19: otherlv_5= Req_cap ( (lv_req_cap_6_0= ruleEPREFIX_REF ) )
            	    {
            	    otherlv_5=(Token)match(input,Req_cap,FOLLOW_12); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetPropertyBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalAADMParser.g:4743:8: ( (lv_req_cap_6_0= ruleEPREFIX_REF ) )
            	    // InternalAADMParser.g:4744:9: (lv_req_cap_6_0= ruleEPREFIX_REF )
            	    {
            	    // InternalAADMParser.g:4744:9: (lv_req_cap_6_0= ruleEPREFIX_REF )
            	    // InternalAADMParser.g:4745:10: lv_req_cap_6_0= ruleEPREFIX_REF
            	    {

            	    										newCompositeNode(grammarAccess.getGetPropertyBodyAccess().getReq_capEPREFIX_REFParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_53);
            	    lv_req_cap_6_0=ruleEPREFIX_REF();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"req_cap",
            	    											lv_req_cap_6_0,
            	    											"org.sodalite.dsl.AADM.EPREFIX_REF");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetPropertyBody"


    // $ANTLR start "entryRuleGetInput"
    // InternalAADMParser.g:4779:1: entryRuleGetInput returns [EObject current=null] : iv_ruleGetInput= ruleGetInput EOF ;
    public final EObject entryRuleGetInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInput = null;


        try {
            // InternalAADMParser.g:4779:49: (iv_ruleGetInput= ruleGetInput EOF )
            // InternalAADMParser.g:4780:2: iv_ruleGetInput= ruleGetInput EOF
            {
             newCompositeNode(grammarAccess.getGetInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetInput=ruleGetInput();

            state._fsp--;

             current =iv_ruleGetInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetInput"


    // $ANTLR start "ruleGetInput"
    // InternalAADMParser.g:4786:1: ruleGetInput returns [EObject current=null] : (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleGetInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAADMParser.g:4792:2: ( (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAADMParser.g:4793:2: (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAADMParser.g:4793:2: (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) )
            // InternalAADMParser.g:4794:3: otherlv_0= Get_input ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Get_input,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGetInputAccess().getGet_inputKeyword_0());
            		
            // InternalAADMParser.g:4798:3: ( (otherlv_1= RULE_ID ) )
            // InternalAADMParser.g:4799:4: (otherlv_1= RULE_ID )
            {
            // InternalAADMParser.g:4799:4: (otherlv_1= RULE_ID )
            // InternalAADMParser.g:4800:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetInputRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getGetInputAccess().getInputEParameterDefinitionCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetInput"


    // $ANTLR start "entryRuleESingleValue"
    // InternalAADMParser.g:4815:1: entryRuleESingleValue returns [EObject current=null] : iv_ruleESingleValue= ruleESingleValue EOF ;
    public final EObject entryRuleESingleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESingleValue = null;


        try {
            // InternalAADMParser.g:4815:53: (iv_ruleESingleValue= ruleESingleValue EOF )
            // InternalAADMParser.g:4816:2: iv_ruleESingleValue= ruleESingleValue EOF
            {
             newCompositeNode(grammarAccess.getESingleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESingleValue=ruleESingleValue();

            state._fsp--;

             current =iv_ruleESingleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleESingleValue"


    // $ANTLR start "ruleESingleValue"
    // InternalAADMParser.g:4822:1: ruleESingleValue returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT ) ;
    public final EObject ruleESingleValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_EBOOLEAN_1 = null;

        EObject this_EFLOAT_2 = null;

        EObject this_ESIGNEDINT_3 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4828:2: ( (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT ) )
            // InternalAADMParser.g:4829:2: (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT )
            {
            // InternalAADMParser.g:4829:2: (this_ESTRING_0= ruleESTRING | this_EBOOLEAN_1= ruleEBOOLEAN | this_EFLOAT_2= ruleEFLOAT | this_ESIGNEDINT_3= ruleESIGNEDINT )
            int alt39=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt39=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt39=2;
                }
                break;
            case RULE_INT:
                {
                int LA39_3 = input.LA(2);

                if ( (LA39_3==EOF||LA39_3==Description||LA39_3==Default||LA39_3==Value||LA39_3==Type||LA39_3==Comma||(LA39_3>=RightSquareBracket && LA39_3<=RULE_ID)||LA39_3==RULE_END) ) {
                    alt39=4;
                }
                else if ( (LA39_3==FullStop) ) {
                    alt39=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 3, input);

                    throw nvae;
                }
                }
                break;
            case FullStop:
                {
                alt39=3;
                }
                break;
            case HyphenMinus:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalAADMParser.g:4830:3: this_ESTRING_0= ruleESTRING
                    {

                    			newCompositeNode(grammarAccess.getESingleValueAccess().getESTRINGParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESTRING_0=ruleESTRING();

                    state._fsp--;


                    			current = this_ESTRING_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAADMParser.g:4839:3: this_EBOOLEAN_1= ruleEBOOLEAN
                    {

                    			newCompositeNode(grammarAccess.getESingleValueAccess().getEBOOLEANParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EBOOLEAN_1=ruleEBOOLEAN();

                    state._fsp--;


                    			current = this_EBOOLEAN_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAADMParser.g:4848:3: this_EFLOAT_2= ruleEFLOAT
                    {

                    			newCompositeNode(grammarAccess.getESingleValueAccess().getEFLOATParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFLOAT_2=ruleEFLOAT();

                    state._fsp--;


                    			current = this_EFLOAT_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAADMParser.g:4857:3: this_ESIGNEDINT_3= ruleESIGNEDINT
                    {

                    			newCompositeNode(grammarAccess.getESingleValueAccess().getESIGNEDINTParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESIGNEDINT_3=ruleESIGNEDINT();

                    state._fsp--;


                    			current = this_ESIGNEDINT_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleESingleValue"


    // $ANTLR start "entryRuleESTRING"
    // InternalAADMParser.g:4869:1: entryRuleESTRING returns [EObject current=null] : iv_ruleESTRING= ruleESTRING EOF ;
    public final EObject entryRuleESTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESTRING = null;


        try {
            // InternalAADMParser.g:4869:48: (iv_ruleESTRING= ruleESTRING EOF )
            // InternalAADMParser.g:4870:2: iv_ruleESTRING= ruleESTRING EOF
            {
             newCompositeNode(grammarAccess.getESTRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESTRING=ruleESTRING();

            state._fsp--;

             current =iv_ruleESTRING; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleESTRING"


    // $ANTLR start "ruleESTRING"
    // InternalAADMParser.g:4876:1: ruleESTRING returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleESTRING() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAADMParser.g:4882:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalAADMParser.g:4883:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalAADMParser.g:4883:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalAADMParser.g:4884:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalAADMParser.g:4884:3: (lv_value_0_0= RULE_STRING )
            // InternalAADMParser.g:4885:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getESTRINGAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getESTRINGRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleESTRING"


    // $ANTLR start "entryRuleEBOOLEAN"
    // InternalAADMParser.g:4904:1: entryRuleEBOOLEAN returns [EObject current=null] : iv_ruleEBOOLEAN= ruleEBOOLEAN EOF ;
    public final EObject entryRuleEBOOLEAN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBOOLEAN = null;


        try {
            // InternalAADMParser.g:4904:49: (iv_ruleEBOOLEAN= ruleEBOOLEAN EOF )
            // InternalAADMParser.g:4905:2: iv_ruleEBOOLEAN= ruleEBOOLEAN EOF
            {
             newCompositeNode(grammarAccess.getEBOOLEANRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBOOLEAN=ruleEBOOLEAN();

            state._fsp--;

             current =iv_ruleEBOOLEAN; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBOOLEAN"


    // $ANTLR start "ruleEBOOLEAN"
    // InternalAADMParser.g:4911:1: ruleEBOOLEAN returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleEBOOLEAN() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalAADMParser.g:4917:2: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // InternalAADMParser.g:4918:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // InternalAADMParser.g:4918:2: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // InternalAADMParser.g:4919:3: (lv_value_0_0= RULE_BOOLEAN )
            {
            // InternalAADMParser.g:4919:3: (lv_value_0_0= RULE_BOOLEAN )
            // InternalAADMParser.g:4920:4: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getEBOOLEANAccess().getValueBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEBOOLEANRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.sodalite.dsl.AADM.BOOLEAN");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBOOLEAN"


    // $ANTLR start "entryRuleEFLOAT"
    // InternalAADMParser.g:4939:1: entryRuleEFLOAT returns [EObject current=null] : iv_ruleEFLOAT= ruleEFLOAT EOF ;
    public final EObject entryRuleEFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFLOAT = null;


        try {
            // InternalAADMParser.g:4939:47: (iv_ruleEFLOAT= ruleEFLOAT EOF )
            // InternalAADMParser.g:4940:2: iv_ruleEFLOAT= ruleEFLOAT EOF
            {
             newCompositeNode(grammarAccess.getEFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFLOAT=ruleEFLOAT();

            state._fsp--;

             current =iv_ruleEFLOAT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFLOAT"


    // $ANTLR start "ruleEFLOAT"
    // InternalAADMParser.g:4946:1: ruleEFLOAT returns [EObject current=null] : ( (lv_value_0_0= ruleFLOAT ) ) ;
    public final EObject ruleEFLOAT() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4952:2: ( ( (lv_value_0_0= ruleFLOAT ) ) )
            // InternalAADMParser.g:4953:2: ( (lv_value_0_0= ruleFLOAT ) )
            {
            // InternalAADMParser.g:4953:2: ( (lv_value_0_0= ruleFLOAT ) )
            // InternalAADMParser.g:4954:3: (lv_value_0_0= ruleFLOAT )
            {
            // InternalAADMParser.g:4954:3: (lv_value_0_0= ruleFLOAT )
            // InternalAADMParser.g:4955:4: lv_value_0_0= ruleFLOAT
            {

            				newCompositeNode(grammarAccess.getEFLOATAccess().getValueFLOATParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleFLOAT();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEFLOATRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.sodalite.dsl.AADM.FLOAT");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFLOAT"


    // $ANTLR start "entryRuleESIGNEDINT"
    // InternalAADMParser.g:4975:1: entryRuleESIGNEDINT returns [EObject current=null] : iv_ruleESIGNEDINT= ruleESIGNEDINT EOF ;
    public final EObject entryRuleESIGNEDINT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESIGNEDINT = null;


        try {
            // InternalAADMParser.g:4975:51: (iv_ruleESIGNEDINT= ruleESIGNEDINT EOF )
            // InternalAADMParser.g:4976:2: iv_ruleESIGNEDINT= ruleESIGNEDINT EOF
            {
             newCompositeNode(grammarAccess.getESIGNEDINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESIGNEDINT=ruleESIGNEDINT();

            state._fsp--;

             current =iv_ruleESIGNEDINT; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleESIGNEDINT"


    // $ANTLR start "ruleESIGNEDINT"
    // InternalAADMParser.g:4982:1: ruleESIGNEDINT returns [EObject current=null] : ( (lv_value_0_0= ruleSIGNEDINT ) ) ;
    public final EObject ruleESIGNEDINT() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:4988:2: ( ( (lv_value_0_0= ruleSIGNEDINT ) ) )
            // InternalAADMParser.g:4989:2: ( (lv_value_0_0= ruleSIGNEDINT ) )
            {
            // InternalAADMParser.g:4989:2: ( (lv_value_0_0= ruleSIGNEDINT ) )
            // InternalAADMParser.g:4990:3: (lv_value_0_0= ruleSIGNEDINT )
            {
            // InternalAADMParser.g:4990:3: (lv_value_0_0= ruleSIGNEDINT )
            // InternalAADMParser.g:4991:4: lv_value_0_0= ruleSIGNEDINT
            {

            				newCompositeNode(grammarAccess.getESIGNEDINTAccess().getValueSIGNEDINTParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleSIGNEDINT();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getESIGNEDINTRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.sodalite.dsl.AADM.SIGNEDINT");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleESIGNEDINT"


    // $ANTLR start "entryRuleEDataTypeName"
    // InternalAADMParser.g:5011:1: entryRuleEDataTypeName returns [EObject current=null] : iv_ruleEDataTypeName= ruleEDataTypeName EOF ;
    public final EObject entryRuleEDataTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypeName = null;


        try {
            // InternalAADMParser.g:5011:54: (iv_ruleEDataTypeName= ruleEDataTypeName EOF )
            // InternalAADMParser.g:5012:2: iv_ruleEDataTypeName= ruleEDataTypeName EOF
            {
             newCompositeNode(grammarAccess.getEDataTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataTypeName=ruleEDataTypeName();

            state._fsp--;

             current =iv_ruleEDataTypeName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDataTypeName"


    // $ANTLR start "ruleEDataTypeName"
    // InternalAADMParser.g:5018:1: ruleEDataTypeName returns [EObject current=null] : (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPRIMITIVE_TYPE_1= ruleEPRIMITIVE_TYPE ) ;
    public final EObject ruleEDataTypeName() throws RecognitionException {
        EObject current = null;

        EObject this_EPREFIX_TYPE_0 = null;

        EObject this_EPRIMITIVE_TYPE_1 = null;



        	enterRule();

        try {
            // InternalAADMParser.g:5024:2: ( (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPRIMITIVE_TYPE_1= ruleEPRIMITIVE_TYPE ) )
            // InternalAADMParser.g:5025:2: (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPRIMITIVE_TYPE_1= ruleEPRIMITIVE_TYPE )
            {
            // InternalAADMParser.g:5025:2: (this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE | this_EPRIMITIVE_TYPE_1= ruleEPRIMITIVE_TYPE )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==EOF||LA40_1==Description||LA40_1==Default||LA40_1==Value||LA40_1==Type||LA40_1==RULE_END) ) {
                    alt40=2;
                }
                else if ( (LA40_1==Solidus) ) {
                    alt40=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==RULE_QUALIFIED_NAME) ) {
                alt40=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalAADMParser.g:5026:3: this_EPREFIX_TYPE_0= ruleEPREFIX_TYPE
                    {

                    			newCompositeNode(grammarAccess.getEDataTypeNameAccess().getEPREFIX_TYPEParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPREFIX_TYPE_0=ruleEPREFIX_TYPE();

                    state._fsp--;


                    			current = this_EPREFIX_TYPE_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAADMParser.g:5035:3: this_EPRIMITIVE_TYPE_1= ruleEPRIMITIVE_TYPE
                    {

                    			newCompositeNode(grammarAccess.getEDataTypeNameAccess().getEPRIMITIVE_TYPEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPRIMITIVE_TYPE_1=ruleEPRIMITIVE_TYPE();

                    state._fsp--;


                    			current = this_EPRIMITIVE_TYPE_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDataTypeName"


    // $ANTLR start "entryRuleEPREFIX_TYPE"
    // InternalAADMParser.g:5047:1: entryRuleEPREFIX_TYPE returns [EObject current=null] : iv_ruleEPREFIX_TYPE= ruleEPREFIX_TYPE EOF ;
    public final EObject entryRuleEPREFIX_TYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPREFIX_TYPE = null;


        try {
            // InternalAADMParser.g:5047:53: (iv_ruleEPREFIX_TYPE= ruleEPREFIX_TYPE EOF )
            // InternalAADMParser.g:5048:2: iv_ruleEPREFIX_TYPE= ruleEPREFIX_TYPE EOF
            {
             newCompositeNode(grammarAccess.getEPREFIX_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPREFIX_TYPE=ruleEPREFIX_TYPE();

            state._fsp--;

             current =iv_ruleEPREFIX_TYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPREFIX_TYPE"


    // $ANTLR start "ruleEPREFIX_TYPE"
    // InternalAADMParser.g:5054:1: ruleEPREFIX_TYPE returns [EObject current=null] : ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) ;
    public final EObject ruleEPREFIX_TYPE() throws RecognitionException {
        EObject current = null;

        Token lv_module_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;


        	enterRule();

        try {
            // InternalAADMParser.g:5060:2: ( ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) ) )
            // InternalAADMParser.g:5061:2: ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) )
            {
            // InternalAADMParser.g:5061:2: ( ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_type_2_0= RULE_QUALIFIED_NAME ) ) )
            // InternalAADMParser.g:5062:3: ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )? ( (lv_type_2_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalAADMParser.g:5062:3: ( ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAADMParser.g:5063:4: ( (lv_module_0_0= RULE_ID ) ) otherlv_1= Solidus
                    {
                    // InternalAADMParser.g:5063:4: ( (lv_module_0_0= RULE_ID ) )
                    // InternalAADMParser.g:5064:5: (lv_module_0_0= RULE_ID )
                    {
                    // InternalAADMParser.g:5064:5: (lv_module_0_0= RULE_ID )
                    // InternalAADMParser.g:5065:6: lv_module_0_0= RULE_ID
                    {
                    lv_module_0_0=(Token)match(input,RULE_ID,FOLLOW_49); 

                    						newLeafNode(lv_module_0_0, grammarAccess.getEPREFIX_TYPEAccess().getModuleIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPREFIX_TYPERule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"module",
                    							lv_module_0_0,
                    							"org.sodalite.dsl.AADM.ID");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,Solidus,FOLLOW_54); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPREFIX_TYPEAccess().getSolidusKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalAADMParser.g:5086:3: ( (lv_type_2_0= RULE_QUALIFIED_NAME ) )
            // InternalAADMParser.g:5087:4: (lv_type_2_0= RULE_QUALIFIED_NAME )
            {
            // InternalAADMParser.g:5087:4: (lv_type_2_0= RULE_QUALIFIED_NAME )
            // InternalAADMParser.g:5088:5: lv_type_2_0= RULE_QUALIFIED_NAME
            {
            lv_type_2_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

            					newLeafNode(lv_type_2_0, grammarAccess.getEPREFIX_TYPEAccess().getTypeQUALIFIED_NAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPREFIX_TYPERule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.sodalite.dsl.AADM.QUALIFIED_NAME");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPREFIX_TYPE"


    // $ANTLR start "entryRuleEPRIMITIVE_TYPE"
    // InternalAADMParser.g:5108:1: entryRuleEPRIMITIVE_TYPE returns [EObject current=null] : iv_ruleEPRIMITIVE_TYPE= ruleEPRIMITIVE_TYPE EOF ;
    public final EObject entryRuleEPRIMITIVE_TYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPRIMITIVE_TYPE = null;


        try {
            // InternalAADMParser.g:5108:56: (iv_ruleEPRIMITIVE_TYPE= ruleEPRIMITIVE_TYPE EOF )
            // InternalAADMParser.g:5109:2: iv_ruleEPRIMITIVE_TYPE= ruleEPRIMITIVE_TYPE EOF
            {
             newCompositeNode(grammarAccess.getEPRIMITIVE_TYPERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPRIMITIVE_TYPE=ruleEPRIMITIVE_TYPE();

            state._fsp--;

             current =iv_ruleEPRIMITIVE_TYPE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPRIMITIVE_TYPE"


    // $ANTLR start "ruleEPRIMITIVE_TYPE"
    // InternalAADMParser.g:5115:1: ruleEPRIMITIVE_TYPE returns [EObject current=null] : ( (lv_type_0_0= RULE_ID ) ) ;
    public final EObject ruleEPRIMITIVE_TYPE() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;


        	enterRule();

        try {
            // InternalAADMParser.g:5121:2: ( ( (lv_type_0_0= RULE_ID ) ) )
            // InternalAADMParser.g:5122:2: ( (lv_type_0_0= RULE_ID ) )
            {
            // InternalAADMParser.g:5122:2: ( (lv_type_0_0= RULE_ID ) )
            // InternalAADMParser.g:5123:3: (lv_type_0_0= RULE_ID )
            {
            // InternalAADMParser.g:5123:3: (lv_type_0_0= RULE_ID )
            // InternalAADMParser.g:5124:4: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_type_0_0, grammarAccess.getEPRIMITIVE_TYPEAccess().getTypeIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEPRIMITIVE_TYPERule());
            				}
            				setWithLastConsumed(
            					current,
            					"type",
            					lv_type_0_0,
            					"org.sodalite.dsl.AADM.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPRIMITIVE_TYPE"


    // $ANTLR start "entryRuleSIGNEDINT"
    // InternalAADMParser.g:5143:1: entryRuleSIGNEDINT returns [String current=null] : iv_ruleSIGNEDINT= ruleSIGNEDINT EOF ;
    public final String entryRuleSIGNEDINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSIGNEDINT = null;


        try {
            // InternalAADMParser.g:5143:49: (iv_ruleSIGNEDINT= ruleSIGNEDINT EOF )
            // InternalAADMParser.g:5144:2: iv_ruleSIGNEDINT= ruleSIGNEDINT EOF
            {
             newCompositeNode(grammarAccess.getSIGNEDINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSIGNEDINT=ruleSIGNEDINT();

            state._fsp--;

             current =iv_ruleSIGNEDINT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSIGNEDINT"


    // $ANTLR start "ruleSIGNEDINT"
    // InternalAADMParser.g:5150:1: ruleSIGNEDINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleSIGNEDINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAADMParser.g:5156:2: ( ( (kw= HyphenMinus )? this_INT_1= RULE_INT ) )
            // InternalAADMParser.g:5157:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            {
            // InternalAADMParser.g:5157:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT )
            // InternalAADMParser.g:5158:3: (kw= HyphenMinus )? this_INT_1= RULE_INT
            {
            // InternalAADMParser.g:5158:3: (kw= HyphenMinus )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==HyphenMinus) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAADMParser.g:5159:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_55); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSIGNEDINTAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getSIGNEDINTAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNEDINT"


    // $ANTLR start "entryRuleFLOAT"
    // InternalAADMParser.g:5176:1: entryRuleFLOAT returns [String current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final String entryRuleFLOAT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFLOAT = null;


        try {
            // InternalAADMParser.g:5176:45: (iv_ruleFLOAT= ruleFLOAT EOF )
            // InternalAADMParser.g:5177:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
             newCompositeNode(grammarAccess.getFLOATRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFLOAT=ruleFLOAT();

            state._fsp--;

             current =iv_ruleFLOAT.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFLOAT"


    // $ANTLR start "ruleFLOAT"
    // InternalAADMParser.g:5183:1: ruleFLOAT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFLOAT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalAADMParser.g:5189:2: ( ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT ) )
            // InternalAADMParser.g:5190:2: ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT )
            {
            // InternalAADMParser.g:5190:2: ( (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT )
            // InternalAADMParser.g:5191:3: (this_INT_0= RULE_INT )? kw= FullStop this_INT_2= RULE_INT
            {
            // InternalAADMParser.g:5191:3: (this_INT_0= RULE_INT )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_INT) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAADMParser.g:5192:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_56); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,FullStop,FOLLOW_55); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFLOATAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFLOATAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFLOAT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00004C2100008042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0010008800808000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0010008800808002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002010404008200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002010404008202L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00080000000A0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000A00000110000L,0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080020000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00080000000A0002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00E0000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000A00000110002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001100090605110L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0600000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0600000000000000L,0x0000000000000184L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x001000000084A400L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x001000000084A402L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x4600000008000880L,0x00000000000001A4L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8700000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8100000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0014001000008000L,0x0000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0014001000008002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000024002000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000024002000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000BL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000024200000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000024200000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0400000000000000L});

}
