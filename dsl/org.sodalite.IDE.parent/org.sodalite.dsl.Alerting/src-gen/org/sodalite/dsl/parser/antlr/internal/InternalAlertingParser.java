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
import org.sodalite.dsl.services.AlertingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAlertingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Annotations", "Labels", "Alert", "Group", "Unless", "Expr", "For", "And", "ExclamationMarkEqualsSign", "LessThanSignEqualsSign", "EqualsSignEqualsSign", "EqualsSignTilde", "GreaterThanSignEqualsSign", "Or", "PercentSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Solidus", "Colon", "LessThanSign", "EqualsSign", "GreaterThanSign", "LeftSquareBracket", "RightSquareBracket", "CircumflexAccent", "LeftCurlyBracket", "RightCurlyBracket", "Tilde", "RULE_EAGGREGATIONOPER", "RULE_EAGGREGATIONOPERMODIFIER", "RULE_EFUNCTIONTYPE", "RULE_EPERIODUNIT", "RULE_ENODEEXPORTER", "RULE_ESLURMEXPORTER", "RULE_EPBSEXPORTER", "RULE_EVECTORMATCHINGTYPE", "RULE_BEGIN", "RULE_END", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Or=17;
    public static final int RULE_BEGIN=45;
    public static final int RULE_BOOLEAN=47;
    public static final int LessThanSign=28;
    public static final int RULE_EAGGREGATIONOPER=37;
    public static final int PercentSign=18;
    public static final int Annotations=4;
    public static final int LeftParenthesis=19;
    public static final int RULE_ENODEEXPORTER=41;
    public static final int EqualsSignTilde=15;
    public static final int RULE_EFUNCTIONTYPE=39;
    public static final int Unless=8;
    public static final int RightSquareBracket=32;
    public static final int GreaterThanSign=30;
    public static final int RULE_ESLURMEXPORTER=42;
    public static final int RULE_ID=48;
    public static final int For=10;
    public static final int RightParenthesis=20;
    public static final int Labels=5;
    public static final int RULE_EPERIODUNIT=40;
    public static final int GreaterThanSignEqualsSign=16;
    public static final int EqualsSignEqualsSign=14;
    public static final int RULE_EPBSEXPORTER=43;
    public static final int Expr=9;
    public static final int And=11;
    public static final int PlusSign=22;
    public static final int RULE_INT=49;
    public static final int RULE_ML_COMMENT=51;
    public static final int LeftSquareBracket=31;
    public static final int Group=7;
    public static final int RULE_END=46;
    public static final int RULE_STRING=50;
    public static final int RULE_SL_COMMENT=52;
    public static final int Comma=23;
    public static final int EqualsSign=29;
    public static final int HyphenMinus=24;
    public static final int RULE_EVECTORMATCHINGTYPE=44;
    public static final int RULE_EAGGREGATIONOPERMODIFIER=38;
    public static final int LessThanSignEqualsSign=13;
    public static final int Solidus=26;
    public static final int Colon=27;
    public static final int RightCurlyBracket=35;
    public static final int EOF=-1;
    public static final int Asterisk=21;
    public static final int FullStop=25;
    public static final int RULE_WS=53;
    public static final int LeftCurlyBracket=34;
    public static final int Tilde=36;
    public static final int RULE_ANY_OTHER=54;
    public static final int CircumflexAccent=33;
    public static final int Alert=6;
    public static final int ExclamationMarkEqualsSign=12;

    // delegates
    // delegators


        public InternalAlertingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlertingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlertingParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlertingParser.g"; }



     	private AlertingGrammarAccess grammarAccess;

        public InternalAlertingParser(TokenStream input, AlertingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Alerting_Model";
       	}

       	@Override
       	protected AlertingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAlerting_Model"
    // InternalAlertingParser.g:57:1: entryRuleAlerting_Model returns [EObject current=null] : iv_ruleAlerting_Model= ruleAlerting_Model EOF ;
    public final EObject entryRuleAlerting_Model() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlerting_Model = null;


        try {
            // InternalAlertingParser.g:57:55: (iv_ruleAlerting_Model= ruleAlerting_Model EOF )
            // InternalAlertingParser.g:58:2: iv_ruleAlerting_Model= ruleAlerting_Model EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlerting_ModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAlerting_Model=ruleAlerting_Model();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlerting_Model; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAlerting_Model"


    // $ANTLR start "ruleAlerting_Model"
    // InternalAlertingParser.g:64:1: ruleAlerting_Model returns [EObject current=null] : ( (lv_groups_0_0= ruleEGroups ) )* ;
    public final EObject ruleAlerting_Model() throws RecognitionException {
        EObject current = null;

        EObject lv_groups_0_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:70:2: ( ( (lv_groups_0_0= ruleEGroups ) )* )
            // InternalAlertingParser.g:71:2: ( (lv_groups_0_0= ruleEGroups ) )*
            {
            // InternalAlertingParser.g:71:2: ( (lv_groups_0_0= ruleEGroups ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Group) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlertingParser.g:72:3: (lv_groups_0_0= ruleEGroups )
            	    {
            	    // InternalAlertingParser.g:72:3: (lv_groups_0_0= ruleEGroups )
            	    // InternalAlertingParser.g:73:4: lv_groups_0_0= ruleEGroups
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getAlerting_ModelAccess().getGroupsEGroupsParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_groups_0_0=ruleEGroups();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getAlerting_ModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"groups",
            	      					lv_groups_0_0,
            	      					"org.sodalite.dsl.Alerting.EGroups");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAlerting_Model"


    // $ANTLR start "entryRuleEGroups"
    // InternalAlertingParser.g:93:1: entryRuleEGroups returns [EObject current=null] : iv_ruleEGroups= ruleEGroups EOF ;
    public final EObject entryRuleEGroups() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGroups = null;


        try {
            // InternalAlertingParser.g:93:48: (iv_ruleEGroups= ruleEGroups EOF )
            // InternalAlertingParser.g:94:2: iv_ruleEGroups= ruleEGroups EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEGroupsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEGroups=ruleEGroups();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEGroups; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEGroups"


    // $ANTLR start "ruleEGroups"
    // InternalAlertingParser.g:100:1: ruleEGroups returns [EObject current=null] : ( (lv_groups_0_0= ruleEGroup ) ) ;
    public final EObject ruleEGroups() throws RecognitionException {
        EObject current = null;

        EObject lv_groups_0_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:106:2: ( ( (lv_groups_0_0= ruleEGroup ) ) )
            // InternalAlertingParser.g:107:2: ( (lv_groups_0_0= ruleEGroup ) )
            {
            // InternalAlertingParser.g:107:2: ( (lv_groups_0_0= ruleEGroup ) )
            // InternalAlertingParser.g:108:3: (lv_groups_0_0= ruleEGroup )
            {
            // InternalAlertingParser.g:108:3: (lv_groups_0_0= ruleEGroup )
            // InternalAlertingParser.g:109:4: lv_groups_0_0= ruleEGroup
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEGroupsAccess().getGroupsEGroupParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_groups_0_0=ruleEGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEGroupsRule());
              				}
              				add(
              					current,
              					"groups",
              					lv_groups_0_0,
              					"org.sodalite.dsl.Alerting.EGroup");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEGroups"


    // $ANTLR start "entryRuleEGroup"
    // InternalAlertingParser.g:129:1: entryRuleEGroup returns [EObject current=null] : iv_ruleEGroup= ruleEGroup EOF ;
    public final EObject entryRuleEGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGroup = null;


        try {
            // InternalAlertingParser.g:129:47: (iv_ruleEGroup= ruleEGroup EOF )
            // InternalAlertingParser.g:130:2: iv_ruleEGroup= ruleEGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEGroup=ruleEGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEGroup"


    // $ANTLR start "ruleEGroup"
    // InternalAlertingParser.g:136:1: ruleEGroup returns [EObject current=null] : (otherlv_0= Group ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_rules_3_0= ruleERule ) )* this_END_4= RULE_END ) ;
    public final EObject ruleEGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:142:2: ( (otherlv_0= Group ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_rules_3_0= ruleERule ) )* this_END_4= RULE_END ) )
            // InternalAlertingParser.g:143:2: (otherlv_0= Group ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_rules_3_0= ruleERule ) )* this_END_4= RULE_END )
            {
            // InternalAlertingParser.g:143:2: (otherlv_0= Group ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_rules_3_0= ruleERule ) )* this_END_4= RULE_END )
            // InternalAlertingParser.g:144:3: otherlv_0= Group ( (lv_name_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN ( (lv_rules_3_0= ruleERule ) )* this_END_4= RULE_END
            {
            otherlv_0=(Token)match(input,Group,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEGroupAccess().getGroupKeyword_0());
              		
            }
            // InternalAlertingParser.g:148:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAlertingParser.g:149:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAlertingParser.g:149:4: (lv_name_1_0= RULE_ID )
            // InternalAlertingParser.g:150:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEGroupAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEGroupRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getEGroupAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalAlertingParser.g:170:3: ( (lv_rules_3_0= ruleERule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Alert) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlertingParser.g:171:4: (lv_rules_3_0= ruleERule )
            	    {
            	    // InternalAlertingParser.g:171:4: (lv_rules_3_0= ruleERule )
            	    // InternalAlertingParser.g:172:5: lv_rules_3_0= ruleERule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEGroupAccess().getRulesERuleParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_rules_3_0=ruleERule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEGroupRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rules",
            	      						lv_rules_3_0,
            	      						"org.sodalite.dsl.Alerting.ERule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_4, grammarAccess.getEGroupAccess().getENDTerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEGroup"


    // $ANTLR start "entryRuleERule"
    // InternalAlertingParser.g:197:1: entryRuleERule returns [EObject current=null] : iv_ruleERule= ruleERule EOF ;
    public final EObject entryRuleERule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERule = null;


        try {
            // InternalAlertingParser.g:197:46: (iv_ruleERule= ruleERule EOF )
            // InternalAlertingParser.g:198:2: iv_ruleERule= ruleERule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getERuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleERule=ruleERule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleERule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleERule"


    // $ANTLR start "ruleERule"
    // InternalAlertingParser.g:204:1: ruleERule returns [EObject current=null] : (otherlv_0= Alert ( (lv_alert_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Expr ( (lv_expr_4_0= ruleEExpression ) ) (otherlv_5= For ( (lv_duration_6_0= RULE_STRING ) ) )? (otherlv_7= Labels this_BEGIN_8= RULE_BEGIN ( (lv_labels_9_0= ruleELabel ) )* this_END_10= RULE_END )? (otherlv_11= Annotations this_BEGIN_12= RULE_BEGIN ( (lv_annotations_13_0= ruleELabel ) )* this_END_14= RULE_END )? this_END_15= RULE_END ) ;
    public final EObject ruleERule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_alert_1_0=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_duration_6_0=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token this_END_14=null;
        Token this_END_15=null;
        EObject lv_expr_4_0 = null;

        EObject lv_labels_9_0 = null;

        EObject lv_annotations_13_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:210:2: ( (otherlv_0= Alert ( (lv_alert_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Expr ( (lv_expr_4_0= ruleEExpression ) ) (otherlv_5= For ( (lv_duration_6_0= RULE_STRING ) ) )? (otherlv_7= Labels this_BEGIN_8= RULE_BEGIN ( (lv_labels_9_0= ruleELabel ) )* this_END_10= RULE_END )? (otherlv_11= Annotations this_BEGIN_12= RULE_BEGIN ( (lv_annotations_13_0= ruleELabel ) )* this_END_14= RULE_END )? this_END_15= RULE_END ) )
            // InternalAlertingParser.g:211:2: (otherlv_0= Alert ( (lv_alert_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Expr ( (lv_expr_4_0= ruleEExpression ) ) (otherlv_5= For ( (lv_duration_6_0= RULE_STRING ) ) )? (otherlv_7= Labels this_BEGIN_8= RULE_BEGIN ( (lv_labels_9_0= ruleELabel ) )* this_END_10= RULE_END )? (otherlv_11= Annotations this_BEGIN_12= RULE_BEGIN ( (lv_annotations_13_0= ruleELabel ) )* this_END_14= RULE_END )? this_END_15= RULE_END )
            {
            // InternalAlertingParser.g:211:2: (otherlv_0= Alert ( (lv_alert_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Expr ( (lv_expr_4_0= ruleEExpression ) ) (otherlv_5= For ( (lv_duration_6_0= RULE_STRING ) ) )? (otherlv_7= Labels this_BEGIN_8= RULE_BEGIN ( (lv_labels_9_0= ruleELabel ) )* this_END_10= RULE_END )? (otherlv_11= Annotations this_BEGIN_12= RULE_BEGIN ( (lv_annotations_13_0= ruleELabel ) )* this_END_14= RULE_END )? this_END_15= RULE_END )
            // InternalAlertingParser.g:212:3: otherlv_0= Alert ( (lv_alert_1_0= RULE_ID ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Expr ( (lv_expr_4_0= ruleEExpression ) ) (otherlv_5= For ( (lv_duration_6_0= RULE_STRING ) ) )? (otherlv_7= Labels this_BEGIN_8= RULE_BEGIN ( (lv_labels_9_0= ruleELabel ) )* this_END_10= RULE_END )? (otherlv_11= Annotations this_BEGIN_12= RULE_BEGIN ( (lv_annotations_13_0= ruleELabel ) )* this_END_14= RULE_END )? this_END_15= RULE_END
            {
            otherlv_0=(Token)match(input,Alert,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getERuleAccess().getAlertKeyword_0());
              		
            }
            // InternalAlertingParser.g:216:3: ( (lv_alert_1_0= RULE_ID ) )
            // InternalAlertingParser.g:217:4: (lv_alert_1_0= RULE_ID )
            {
            // InternalAlertingParser.g:217:4: (lv_alert_1_0= RULE_ID )
            // InternalAlertingParser.g:218:5: lv_alert_1_0= RULE_ID
            {
            lv_alert_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_alert_1_0, grammarAccess.getERuleAccess().getAlertIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getERuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"alert",
              						lv_alert_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getERuleAccess().getBEGINTerminalRuleCall_2());
              		
            }
            otherlv_3=(Token)match(input,Expr,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getERuleAccess().getExprKeyword_3());
              		
            }
            // InternalAlertingParser.g:242:3: ( (lv_expr_4_0= ruleEExpression ) )
            // InternalAlertingParser.g:243:4: (lv_expr_4_0= ruleEExpression )
            {
            // InternalAlertingParser.g:243:4: (lv_expr_4_0= ruleEExpression )
            // InternalAlertingParser.g:244:5: lv_expr_4_0= ruleEExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getERuleAccess().getExprEExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_expr_4_0=ruleEExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getERuleRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_4_0,
              						"org.sodalite.dsl.Alerting.EExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlertingParser.g:261:3: (otherlv_5= For ( (lv_duration_6_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==For) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAlertingParser.g:262:4: otherlv_5= For ( (lv_duration_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,For,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getERuleAccess().getForKeyword_5_0());
                      			
                    }
                    // InternalAlertingParser.g:266:4: ( (lv_duration_6_0= RULE_STRING ) )
                    // InternalAlertingParser.g:267:5: (lv_duration_6_0= RULE_STRING )
                    {
                    // InternalAlertingParser.g:267:5: (lv_duration_6_0= RULE_STRING )
                    // InternalAlertingParser.g:268:6: lv_duration_6_0= RULE_STRING
                    {
                    lv_duration_6_0=(Token)match(input,RULE_STRING,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_duration_6_0, grammarAccess.getERuleAccess().getDurationSTRINGTerminalRuleCall_5_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getERuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"duration",
                      							lv_duration_6_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalAlertingParser.g:285:3: (otherlv_7= Labels this_BEGIN_8= RULE_BEGIN ( (lv_labels_9_0= ruleELabel ) )* this_END_10= RULE_END )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Labels) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlertingParser.g:286:4: otherlv_7= Labels this_BEGIN_8= RULE_BEGIN ( (lv_labels_9_0= ruleELabel ) )* this_END_10= RULE_END
                    {
                    otherlv_7=(Token)match(input,Labels,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getERuleAccess().getLabelsKeyword_6_0());
                      			
                    }
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_8, grammarAccess.getERuleAccess().getBEGINTerminalRuleCall_6_1());
                      			
                    }
                    // InternalAlertingParser.g:294:4: ( (lv_labels_9_0= ruleELabel ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalAlertingParser.g:295:5: (lv_labels_9_0= ruleELabel )
                    	    {
                    	    // InternalAlertingParser.g:295:5: (lv_labels_9_0= ruleELabel )
                    	    // InternalAlertingParser.g:296:6: lv_labels_9_0= ruleELabel
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getERuleAccess().getLabelsELabelParserRuleCall_6_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_labels_9_0=ruleELabel();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getERuleRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"labels",
                    	      							lv_labels_9_0,
                    	      							"org.sodalite.dsl.Alerting.ELabel");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    this_END_10=(Token)match(input,RULE_END,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_10, grammarAccess.getERuleAccess().getENDTerminalRuleCall_6_3());
                      			
                    }

                    }
                    break;

            }

            // InternalAlertingParser.g:318:3: (otherlv_11= Annotations this_BEGIN_12= RULE_BEGIN ( (lv_annotations_13_0= ruleELabel ) )* this_END_14= RULE_END )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Annotations) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlertingParser.g:319:4: otherlv_11= Annotations this_BEGIN_12= RULE_BEGIN ( (lv_annotations_13_0= ruleELabel ) )* this_END_14= RULE_END
                    {
                    otherlv_11=(Token)match(input,Annotations,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getERuleAccess().getAnnotationsKeyword_7_0());
                      			
                    }
                    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_12, grammarAccess.getERuleAccess().getBEGINTerminalRuleCall_7_1());
                      			
                    }
                    // InternalAlertingParser.g:327:4: ( (lv_annotations_13_0= ruleELabel ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalAlertingParser.g:328:5: (lv_annotations_13_0= ruleELabel )
                    	    {
                    	    // InternalAlertingParser.g:328:5: (lv_annotations_13_0= ruleELabel )
                    	    // InternalAlertingParser.g:329:6: lv_annotations_13_0= ruleELabel
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getERuleAccess().getAnnotationsELabelParserRuleCall_7_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_12);
                    	    lv_annotations_13_0=ruleELabel();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getERuleRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"annotations",
                    	      							lv_annotations_13_0,
                    	      							"org.sodalite.dsl.Alerting.ELabel");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    this_END_14=(Token)match(input,RULE_END,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_14, grammarAccess.getERuleAccess().getENDTerminalRuleCall_7_3());
                      			
                    }

                    }
                    break;

            }

            this_END_15=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_15, grammarAccess.getERuleAccess().getENDTerminalRuleCall_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleERule"


    // $ANTLR start "entryRuleELabel"
    // InternalAlertingParser.g:359:1: entryRuleELabel returns [EObject current=null] : iv_ruleELabel= ruleELabel EOF ;
    public final EObject entryRuleELabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELabel = null;


        try {
            // InternalAlertingParser.g:359:47: (iv_ruleELabel= ruleELabel EOF )
            // InternalAlertingParser.g:360:2: iv_ruleELabel= ruleELabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getELabelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleELabel=ruleELabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleELabel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleELabel"


    // $ANTLR start "ruleELabel"
    // InternalAlertingParser.g:366:1: ruleELabel returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleELabel() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalAlertingParser.g:372:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalAlertingParser.g:373:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalAlertingParser.g:373:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalAlertingParser.g:374:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalAlertingParser.g:374:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalAlertingParser.g:375:4: (lv_key_0_0= RULE_ID )
            {
            // InternalAlertingParser.g:375:4: (lv_key_0_0= RULE_ID )
            // InternalAlertingParser.g:376:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_0_0, grammarAccess.getELabelAccess().getKeyIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getELabelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getELabelAccess().getColonKeyword_1());
              		
            }
            // InternalAlertingParser.g:396:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalAlertingParser.g:397:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalAlertingParser.g:397:4: (lv_value_2_0= RULE_STRING )
            // InternalAlertingParser.g:398:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_2_0, grammarAccess.getELabelAccess().getValueSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getELabelRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleELabel"


    // $ANTLR start "entryRuleEExpression"
    // InternalAlertingParser.g:418:1: entryRuleEExpression returns [EObject current=null] : iv_ruleEExpression= ruleEExpression EOF ;
    public final EObject entryRuleEExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExpression = null;


        try {
            // InternalAlertingParser.g:418:52: (iv_ruleEExpression= ruleEExpression EOF )
            // InternalAlertingParser.g:419:2: iv_ruleEExpression= ruleEExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEExpression=ruleEExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEExpression"


    // $ANTLR start "ruleEExpression"
    // InternalAlertingParser.g:425:1: ruleEExpression returns [EObject current=null] : ( (lv_expr_0_0= ruleEBinaryStatement ) ) ;
    public final EObject ruleEExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:431:2: ( ( (lv_expr_0_0= ruleEBinaryStatement ) ) )
            // InternalAlertingParser.g:432:2: ( (lv_expr_0_0= ruleEBinaryStatement ) )
            {
            // InternalAlertingParser.g:432:2: ( (lv_expr_0_0= ruleEBinaryStatement ) )
            // InternalAlertingParser.g:433:3: (lv_expr_0_0= ruleEBinaryStatement )
            {
            // InternalAlertingParser.g:433:3: (lv_expr_0_0= ruleEBinaryStatement )
            // InternalAlertingParser.g:434:4: lv_expr_0_0= ruleEBinaryStatement
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEExpressionAccess().getExprEBinaryStatementParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_expr_0_0=ruleEBinaryStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEExpressionRule());
              				}
              				set(
              					current,
              					"expr",
              					lv_expr_0_0,
              					"org.sodalite.dsl.Alerting.EBinaryStatement");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEExpression"


    // $ANTLR start "entryRuleEBinaryStatement"
    // InternalAlertingParser.g:454:1: entryRuleEBinaryStatement returns [EObject current=null] : iv_ruleEBinaryStatement= ruleEBinaryStatement EOF ;
    public final EObject entryRuleEBinaryStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBinaryStatement = null;


        try {
            // InternalAlertingParser.g:454:57: (iv_ruleEBinaryStatement= ruleEBinaryStatement EOF )
            // InternalAlertingParser.g:455:2: iv_ruleEBinaryStatement= ruleEBinaryStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBinaryStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBinaryStatement=ruleEBinaryStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBinaryStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEBinaryStatement"


    // $ANTLR start "ruleEBinaryStatement"
    // InternalAlertingParser.g:461:1: ruleEBinaryStatement returns [EObject current=null] : ( ( (lv_lexpr_0_0= ruleEStatement ) ) ( (lv_oper_1_0= ruleEComparisonOperator ) ) ( (lv_rexpr_2_0= ruleENUMBER ) ) ) ;
    public final EObject ruleEBinaryStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_lexpr_0_0 = null;

        EObject lv_oper_1_0 = null;

        EObject lv_rexpr_2_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:467:2: ( ( ( (lv_lexpr_0_0= ruleEStatement ) ) ( (lv_oper_1_0= ruleEComparisonOperator ) ) ( (lv_rexpr_2_0= ruleENUMBER ) ) ) )
            // InternalAlertingParser.g:468:2: ( ( (lv_lexpr_0_0= ruleEStatement ) ) ( (lv_oper_1_0= ruleEComparisonOperator ) ) ( (lv_rexpr_2_0= ruleENUMBER ) ) )
            {
            // InternalAlertingParser.g:468:2: ( ( (lv_lexpr_0_0= ruleEStatement ) ) ( (lv_oper_1_0= ruleEComparisonOperator ) ) ( (lv_rexpr_2_0= ruleENUMBER ) ) )
            // InternalAlertingParser.g:469:3: ( (lv_lexpr_0_0= ruleEStatement ) ) ( (lv_oper_1_0= ruleEComparisonOperator ) ) ( (lv_rexpr_2_0= ruleENUMBER ) )
            {
            // InternalAlertingParser.g:469:3: ( (lv_lexpr_0_0= ruleEStatement ) )
            // InternalAlertingParser.g:470:4: (lv_lexpr_0_0= ruleEStatement )
            {
            // InternalAlertingParser.g:470:4: (lv_lexpr_0_0= ruleEStatement )
            // InternalAlertingParser.g:471:5: lv_lexpr_0_0= ruleEStatement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEBinaryStatementAccess().getLexprEStatementParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_lexpr_0_0=ruleEStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEBinaryStatementRule());
              					}
              					set(
              						current,
              						"lexpr",
              						lv_lexpr_0_0,
              						"org.sodalite.dsl.Alerting.EStatement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlertingParser.g:488:3: ( (lv_oper_1_0= ruleEComparisonOperator ) )
            // InternalAlertingParser.g:489:4: (lv_oper_1_0= ruleEComparisonOperator )
            {
            // InternalAlertingParser.g:489:4: (lv_oper_1_0= ruleEComparisonOperator )
            // InternalAlertingParser.g:490:5: lv_oper_1_0= ruleEComparisonOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEBinaryStatementAccess().getOperEComparisonOperatorParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_oper_1_0=ruleEComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEBinaryStatementRule());
              					}
              					set(
              						current,
              						"oper",
              						lv_oper_1_0,
              						"org.sodalite.dsl.Alerting.EComparisonOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlertingParser.g:507:3: ( (lv_rexpr_2_0= ruleENUMBER ) )
            // InternalAlertingParser.g:508:4: (lv_rexpr_2_0= ruleENUMBER )
            {
            // InternalAlertingParser.g:508:4: (lv_rexpr_2_0= ruleENUMBER )
            // InternalAlertingParser.g:509:5: lv_rexpr_2_0= ruleENUMBER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEBinaryStatementAccess().getRexprENUMBERParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_rexpr_2_0=ruleENUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEBinaryStatementRule());
              					}
              					set(
              						current,
              						"rexpr",
              						lv_rexpr_2_0,
              						"org.sodalite.dsl.Alerting.ENUMBER");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEBinaryStatement"


    // $ANTLR start "entryRuleEStatement"
    // InternalAlertingParser.g:530:1: entryRuleEStatement returns [EObject current=null] : iv_ruleEStatement= ruleEStatement EOF ;
    public final EObject entryRuleEStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEStatement = null;


        try {
            // InternalAlertingParser.g:530:51: (iv_ruleEStatement= ruleEStatement EOF )
            // InternalAlertingParser.g:531:2: iv_ruleEStatement= ruleEStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEStatement=ruleEStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEStatement"


    // $ANTLR start "ruleEStatement"
    // InternalAlertingParser.g:537:1: ruleEStatement returns [EObject current=null] : ( ( ( ruleEVectorMatching )=>this_EVectorMatching_0= ruleEVectorMatching ) | this_EVectorExpr_1= ruleEVectorExpr ) ;
    public final EObject ruleEStatement() throws RecognitionException {
        EObject current = null;

        EObject this_EVectorMatching_0 = null;

        EObject this_EVectorExpr_1 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:543:2: ( ( ( ( ruleEVectorMatching )=>this_EVectorMatching_0= ruleEVectorMatching ) | this_EVectorExpr_1= ruleEVectorExpr ) )
            // InternalAlertingParser.g:544:2: ( ( ( ruleEVectorMatching )=>this_EVectorMatching_0= ruleEVectorMatching ) | this_EVectorExpr_1= ruleEVectorExpr )
            {
            // InternalAlertingParser.g:544:2: ( ( ( ruleEVectorMatching )=>this_EVectorMatching_0= ruleEVectorMatching ) | this_EVectorExpr_1= ruleEVectorExpr )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalAlertingParser.g:545:3: ( ( ruleEVectorMatching )=>this_EVectorMatching_0= ruleEVectorMatching )
                    {
                    // InternalAlertingParser.g:545:3: ( ( ruleEVectorMatching )=>this_EVectorMatching_0= ruleEVectorMatching )
                    // InternalAlertingParser.g:546:4: ( ruleEVectorMatching )=>this_EVectorMatching_0= ruleEVectorMatching
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEStatementAccess().getEVectorMatchingParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_EVectorMatching_0=ruleEVectorMatching();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_EVectorMatching_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAlertingParser.g:557:3: this_EVectorExpr_1= ruleEVectorExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEStatementAccess().getEVectorExprParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EVectorExpr_1=ruleEVectorExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EVectorExpr_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEStatement"


    // $ANTLR start "entryRuleEVectorMatching"
    // InternalAlertingParser.g:569:1: entryRuleEVectorMatching returns [EObject current=null] : iv_ruleEVectorMatching= ruleEVectorMatching EOF ;
    public final EObject entryRuleEVectorMatching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVectorMatching = null;


        try {
            // InternalAlertingParser.g:569:56: (iv_ruleEVectorMatching= ruleEVectorMatching EOF )
            // InternalAlertingParser.g:570:2: iv_ruleEVectorMatching= ruleEVectorMatching EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEVectorMatchingRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEVectorMatching=ruleEVectorMatching();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEVectorMatching; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEVectorMatching"


    // $ANTLR start "ruleEVectorMatching"
    // InternalAlertingParser.g:576:1: ruleEVectorMatching returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_lexpr_1_0= ruleEVectorExpr ) ) ( (lv_oper_2_0= ruleEBinaryOperator ) ) ( (lv_type_3_0= RULE_EVECTORMATCHINGTYPE ) ) otherlv_4= LeftParenthesis ( (lv_labels_5_0= ruleELabelList ) ) otherlv_6= RightParenthesis ( (lv_rexpr_7_0= ruleEVectorExpr ) ) otherlv_8= RightParenthesis ) ;
    public final EObject ruleEVectorMatching() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_lexpr_1_0 = null;

        EObject lv_oper_2_0 = null;

        EObject lv_labels_5_0 = null;

        EObject lv_rexpr_7_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:582:2: ( (otherlv_0= LeftParenthesis ( (lv_lexpr_1_0= ruleEVectorExpr ) ) ( (lv_oper_2_0= ruleEBinaryOperator ) ) ( (lv_type_3_0= RULE_EVECTORMATCHINGTYPE ) ) otherlv_4= LeftParenthesis ( (lv_labels_5_0= ruleELabelList ) ) otherlv_6= RightParenthesis ( (lv_rexpr_7_0= ruleEVectorExpr ) ) otherlv_8= RightParenthesis ) )
            // InternalAlertingParser.g:583:2: (otherlv_0= LeftParenthesis ( (lv_lexpr_1_0= ruleEVectorExpr ) ) ( (lv_oper_2_0= ruleEBinaryOperator ) ) ( (lv_type_3_0= RULE_EVECTORMATCHINGTYPE ) ) otherlv_4= LeftParenthesis ( (lv_labels_5_0= ruleELabelList ) ) otherlv_6= RightParenthesis ( (lv_rexpr_7_0= ruleEVectorExpr ) ) otherlv_8= RightParenthesis )
            {
            // InternalAlertingParser.g:583:2: (otherlv_0= LeftParenthesis ( (lv_lexpr_1_0= ruleEVectorExpr ) ) ( (lv_oper_2_0= ruleEBinaryOperator ) ) ( (lv_type_3_0= RULE_EVECTORMATCHINGTYPE ) ) otherlv_4= LeftParenthesis ( (lv_labels_5_0= ruleELabelList ) ) otherlv_6= RightParenthesis ( (lv_rexpr_7_0= ruleEVectorExpr ) ) otherlv_8= RightParenthesis )
            // InternalAlertingParser.g:584:3: otherlv_0= LeftParenthesis ( (lv_lexpr_1_0= ruleEVectorExpr ) ) ( (lv_oper_2_0= ruleEBinaryOperator ) ) ( (lv_type_3_0= RULE_EVECTORMATCHINGTYPE ) ) otherlv_4= LeftParenthesis ( (lv_labels_5_0= ruleELabelList ) ) otherlv_6= RightParenthesis ( (lv_rexpr_7_0= ruleEVectorExpr ) ) otherlv_8= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEVectorMatchingAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAlertingParser.g:588:3: ( (lv_lexpr_1_0= ruleEVectorExpr ) )
            // InternalAlertingParser.g:589:4: (lv_lexpr_1_0= ruleEVectorExpr )
            {
            // InternalAlertingParser.g:589:4: (lv_lexpr_1_0= ruleEVectorExpr )
            // InternalAlertingParser.g:590:5: lv_lexpr_1_0= ruleEVectorExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEVectorMatchingAccess().getLexprEVectorExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_lexpr_1_0=ruleEVectorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEVectorMatchingRule());
              					}
              					set(
              						current,
              						"lexpr",
              						lv_lexpr_1_0,
              						"org.sodalite.dsl.Alerting.EVectorExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlertingParser.g:607:3: ( (lv_oper_2_0= ruleEBinaryOperator ) )
            // InternalAlertingParser.g:608:4: (lv_oper_2_0= ruleEBinaryOperator )
            {
            // InternalAlertingParser.g:608:4: (lv_oper_2_0= ruleEBinaryOperator )
            // InternalAlertingParser.g:609:5: lv_oper_2_0= ruleEBinaryOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEVectorMatchingAccess().getOperEBinaryOperatorParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_oper_2_0=ruleEBinaryOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEVectorMatchingRule());
              					}
              					set(
              						current,
              						"oper",
              						lv_oper_2_0,
              						"org.sodalite.dsl.Alerting.EBinaryOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlertingParser.g:626:3: ( (lv_type_3_0= RULE_EVECTORMATCHINGTYPE ) )
            // InternalAlertingParser.g:627:4: (lv_type_3_0= RULE_EVECTORMATCHINGTYPE )
            {
            // InternalAlertingParser.g:627:4: (lv_type_3_0= RULE_EVECTORMATCHINGTYPE )
            // InternalAlertingParser.g:628:5: lv_type_3_0= RULE_EVECTORMATCHINGTYPE
            {
            lv_type_3_0=(Token)match(input,RULE_EVECTORMATCHINGTYPE,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_type_3_0, grammarAccess.getEVectorMatchingAccess().getTypeEVECTORMATCHINGTYPETerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEVectorMatchingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"type",
              						lv_type_3_0,
              						"org.sodalite.dsl.Alerting.EVECTORMATCHINGTYPE");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,LeftParenthesis,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEVectorMatchingAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalAlertingParser.g:648:3: ( (lv_labels_5_0= ruleELabelList ) )
            // InternalAlertingParser.g:649:4: (lv_labels_5_0= ruleELabelList )
            {
            // InternalAlertingParser.g:649:4: (lv_labels_5_0= ruleELabelList )
            // InternalAlertingParser.g:650:5: lv_labels_5_0= ruleELabelList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEVectorMatchingAccess().getLabelsELabelListParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_labels_5_0=ruleELabelList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEVectorMatchingRule());
              					}
              					set(
              						current,
              						"labels",
              						lv_labels_5_0,
              						"org.sodalite.dsl.Alerting.ELabelList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEVectorMatchingAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalAlertingParser.g:671:3: ( (lv_rexpr_7_0= ruleEVectorExpr ) )
            // InternalAlertingParser.g:672:4: (lv_rexpr_7_0= ruleEVectorExpr )
            {
            // InternalAlertingParser.g:672:4: (lv_rexpr_7_0= ruleEVectorExpr )
            // InternalAlertingParser.g:673:5: lv_rexpr_7_0= ruleEVectorExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEVectorMatchingAccess().getRexprEVectorExprParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_rexpr_7_0=ruleEVectorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEVectorMatchingRule());
              					}
              					set(
              						current,
              						"rexpr",
              						lv_rexpr_7_0,
              						"org.sodalite.dsl.Alerting.EVectorExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getEVectorMatchingAccess().getRightParenthesisKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEVectorMatching"


    // $ANTLR start "entryRuleELabelList"
    // InternalAlertingParser.g:698:1: entryRuleELabelList returns [EObject current=null] : iv_ruleELabelList= ruleELabelList EOF ;
    public final EObject entryRuleELabelList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELabelList = null;


        try {
            // InternalAlertingParser.g:698:51: (iv_ruleELabelList= ruleELabelList EOF )
            // InternalAlertingParser.g:699:2: iv_ruleELabelList= ruleELabelList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getELabelListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleELabelList=ruleELabelList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleELabelList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleELabelList"


    // $ANTLR start "ruleELabelList"
    // InternalAlertingParser.g:705:1: ruleELabelList returns [EObject current=null] : ( () ( (lv_list_1_0= ruleESingleLabel ) )? (otherlv_2= Comma ( (lv_list_3_0= ruleESingleLabel ) ) )* ) ;
    public final EObject ruleELabelList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_list_1_0 = null;

        EObject lv_list_3_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:711:2: ( ( () ( (lv_list_1_0= ruleESingleLabel ) )? (otherlv_2= Comma ( (lv_list_3_0= ruleESingleLabel ) ) )* ) )
            // InternalAlertingParser.g:712:2: ( () ( (lv_list_1_0= ruleESingleLabel ) )? (otherlv_2= Comma ( (lv_list_3_0= ruleESingleLabel ) ) )* )
            {
            // InternalAlertingParser.g:712:2: ( () ( (lv_list_1_0= ruleESingleLabel ) )? (otherlv_2= Comma ( (lv_list_3_0= ruleESingleLabel ) ) )* )
            // InternalAlertingParser.g:713:3: () ( (lv_list_1_0= ruleESingleLabel ) )? (otherlv_2= Comma ( (lv_list_3_0= ruleESingleLabel ) ) )*
            {
            // InternalAlertingParser.g:713:3: ()
            // InternalAlertingParser.g:714:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getELabelListAccess().getELabelListAction_0(),
              					current);
              			
            }

            }

            // InternalAlertingParser.g:720:3: ( (lv_list_1_0= ruleESingleLabel ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlertingParser.g:721:4: (lv_list_1_0= ruleESingleLabel )
                    {
                    // InternalAlertingParser.g:721:4: (lv_list_1_0= ruleESingleLabel )
                    // InternalAlertingParser.g:722:5: lv_list_1_0= ruleESingleLabel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getELabelListAccess().getListESingleLabelParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_22);
                    lv_list_1_0=ruleESingleLabel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getELabelListRule());
                      					}
                      					add(
                      						current,
                      						"list",
                      						lv_list_1_0,
                      						"org.sodalite.dsl.Alerting.ESingleLabel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAlertingParser.g:739:3: (otherlv_2= Comma ( (lv_list_3_0= ruleESingleLabel ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAlertingParser.g:740:4: otherlv_2= Comma ( (lv_list_3_0= ruleESingleLabel ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getELabelListAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalAlertingParser.g:744:4: ( (lv_list_3_0= ruleESingleLabel ) )
            	    // InternalAlertingParser.g:745:5: (lv_list_3_0= ruleESingleLabel )
            	    {
            	    // InternalAlertingParser.g:745:5: (lv_list_3_0= ruleESingleLabel )
            	    // InternalAlertingParser.g:746:6: lv_list_3_0= ruleESingleLabel
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getELabelListAccess().getListESingleLabelParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_list_3_0=ruleESingleLabel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getELabelListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"list",
            	      							lv_list_3_0,
            	      							"org.sodalite.dsl.Alerting.ESingleLabel");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleELabelList"


    // $ANTLR start "entryRuleESingleLabel"
    // InternalAlertingParser.g:768:1: entryRuleESingleLabel returns [EObject current=null] : iv_ruleESingleLabel= ruleESingleLabel EOF ;
    public final EObject entryRuleESingleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESingleLabel = null;


        try {
            // InternalAlertingParser.g:768:53: (iv_ruleESingleLabel= ruleESingleLabel EOF )
            // InternalAlertingParser.g:769:2: iv_ruleESingleLabel= ruleESingleLabel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getESingleLabelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleESingleLabel=ruleESingleLabel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleESingleLabel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleESingleLabel"


    // $ANTLR start "ruleESingleLabel"
    // InternalAlertingParser.g:775:1: ruleESingleLabel returns [EObject current=null] : ( (lv_label_0_0= RULE_ID ) ) ;
    public final EObject ruleESingleLabel() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;


        	enterRule();

        try {
            // InternalAlertingParser.g:781:2: ( ( (lv_label_0_0= RULE_ID ) ) )
            // InternalAlertingParser.g:782:2: ( (lv_label_0_0= RULE_ID ) )
            {
            // InternalAlertingParser.g:782:2: ( (lv_label_0_0= RULE_ID ) )
            // InternalAlertingParser.g:783:3: (lv_label_0_0= RULE_ID )
            {
            // InternalAlertingParser.g:783:3: (lv_label_0_0= RULE_ID )
            // InternalAlertingParser.g:784:4: lv_label_0_0= RULE_ID
            {
            lv_label_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_label_0_0, grammarAccess.getESingleLabelAccess().getLabelIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getESingleLabelRule());
              				}
              				setWithLastConsumed(
              					current,
              					"label",
              					lv_label_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleESingleLabel"


    // $ANTLR start "entryRuleEAggregationExpr"
    // InternalAlertingParser.g:803:1: entryRuleEAggregationExpr returns [EObject current=null] : iv_ruleEAggregationExpr= ruleEAggregationExpr EOF ;
    public final EObject entryRuleEAggregationExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAggregationExpr = null;


        try {
            // InternalAlertingParser.g:803:57: (iv_ruleEAggregationExpr= ruleEAggregationExpr EOF )
            // InternalAlertingParser.g:804:2: iv_ruleEAggregationExpr= ruleEAggregationExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEAggregationExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEAggregationExpr=ruleEAggregationExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEAggregationExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEAggregationExpr"


    // $ANTLR start "ruleEAggregationExpr"
    // InternalAlertingParser.g:810:1: ruleEAggregationExpr returns [EObject current=null] : ( ( (lv_oper_0_0= RULE_EAGGREGATIONOPER ) ) ( ( (lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER ) ) otherlv_2= LeftParenthesis ( (lv_labels_3_0= ruleELabelList ) ) otherlv_4= RightParenthesis )? otherlv_5= LeftParenthesis ( (lv_expr_6_0= ruleEVectorExpr ) ) otherlv_7= RightParenthesis ) ;
    public final EObject ruleEAggregationExpr() throws RecognitionException {
        EObject current = null;

        Token lv_oper_0_0=null;
        Token lv_modifier_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_labels_3_0 = null;

        EObject lv_expr_6_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:816:2: ( ( ( (lv_oper_0_0= RULE_EAGGREGATIONOPER ) ) ( ( (lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER ) ) otherlv_2= LeftParenthesis ( (lv_labels_3_0= ruleELabelList ) ) otherlv_4= RightParenthesis )? otherlv_5= LeftParenthesis ( (lv_expr_6_0= ruleEVectorExpr ) ) otherlv_7= RightParenthesis ) )
            // InternalAlertingParser.g:817:2: ( ( (lv_oper_0_0= RULE_EAGGREGATIONOPER ) ) ( ( (lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER ) ) otherlv_2= LeftParenthesis ( (lv_labels_3_0= ruleELabelList ) ) otherlv_4= RightParenthesis )? otherlv_5= LeftParenthesis ( (lv_expr_6_0= ruleEVectorExpr ) ) otherlv_7= RightParenthesis )
            {
            // InternalAlertingParser.g:817:2: ( ( (lv_oper_0_0= RULE_EAGGREGATIONOPER ) ) ( ( (lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER ) ) otherlv_2= LeftParenthesis ( (lv_labels_3_0= ruleELabelList ) ) otherlv_4= RightParenthesis )? otherlv_5= LeftParenthesis ( (lv_expr_6_0= ruleEVectorExpr ) ) otherlv_7= RightParenthesis )
            // InternalAlertingParser.g:818:3: ( (lv_oper_0_0= RULE_EAGGREGATIONOPER ) ) ( ( (lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER ) ) otherlv_2= LeftParenthesis ( (lv_labels_3_0= ruleELabelList ) ) otherlv_4= RightParenthesis )? otherlv_5= LeftParenthesis ( (lv_expr_6_0= ruleEVectorExpr ) ) otherlv_7= RightParenthesis
            {
            // InternalAlertingParser.g:818:3: ( (lv_oper_0_0= RULE_EAGGREGATIONOPER ) )
            // InternalAlertingParser.g:819:4: (lv_oper_0_0= RULE_EAGGREGATIONOPER )
            {
            // InternalAlertingParser.g:819:4: (lv_oper_0_0= RULE_EAGGREGATIONOPER )
            // InternalAlertingParser.g:820:5: lv_oper_0_0= RULE_EAGGREGATIONOPER
            {
            lv_oper_0_0=(Token)match(input,RULE_EAGGREGATIONOPER,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_oper_0_0, grammarAccess.getEAggregationExprAccess().getOperEAGGREGATIONOPERTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEAggregationExprRule());
              					}
              					setWithLastConsumed(
              						current,
              						"oper",
              						lv_oper_0_0,
              						"org.sodalite.dsl.Alerting.EAGGREGATIONOPER");
              				
            }

            }


            }

            // InternalAlertingParser.g:836:3: ( ( (lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER ) ) otherlv_2= LeftParenthesis ( (lv_labels_3_0= ruleELabelList ) ) otherlv_4= RightParenthesis )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_EAGGREGATIONOPERMODIFIER) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlertingParser.g:837:4: ( (lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER ) ) otherlv_2= LeftParenthesis ( (lv_labels_3_0= ruleELabelList ) ) otherlv_4= RightParenthesis
                    {
                    // InternalAlertingParser.g:837:4: ( (lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER ) )
                    // InternalAlertingParser.g:838:5: (lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER )
                    {
                    // InternalAlertingParser.g:838:5: (lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER )
                    // InternalAlertingParser.g:839:6: lv_modifier_1_0= RULE_EAGGREGATIONOPERMODIFIER
                    {
                    lv_modifier_1_0=(Token)match(input,RULE_EAGGREGATIONOPERMODIFIER,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_modifier_1_0, grammarAccess.getEAggregationExprAccess().getModifierEAGGREGATIONOPERMODIFIERTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEAggregationExprRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"modifier",
                      							lv_modifier_1_0,
                      							"org.sodalite.dsl.Alerting.EAGGREGATIONOPERMODIFIER");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEAggregationExprAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalAlertingParser.g:859:4: ( (lv_labels_3_0= ruleELabelList ) )
                    // InternalAlertingParser.g:860:5: (lv_labels_3_0= ruleELabelList )
                    {
                    // InternalAlertingParser.g:860:5: (lv_labels_3_0= ruleELabelList )
                    // InternalAlertingParser.g:861:6: lv_labels_3_0= ruleELabelList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEAggregationExprAccess().getLabelsELabelListParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_labels_3_0=ruleELabelList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEAggregationExprRule());
                      						}
                      						set(
                      							current,
                      							"labels",
                      							lv_labels_3_0,
                      							"org.sodalite.dsl.Alerting.ELabelList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getEAggregationExprAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,LeftParenthesis,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEAggregationExprAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalAlertingParser.g:887:3: ( (lv_expr_6_0= ruleEVectorExpr ) )
            // InternalAlertingParser.g:888:4: (lv_expr_6_0= ruleEVectorExpr )
            {
            // InternalAlertingParser.g:888:4: (lv_expr_6_0= ruleEVectorExpr )
            // InternalAlertingParser.g:889:5: lv_expr_6_0= ruleEVectorExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEAggregationExprAccess().getExprEVectorExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_expr_6_0=ruleEVectorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEAggregationExprRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_6_0,
              						"org.sodalite.dsl.Alerting.EVectorExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEAggregationExprAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEAggregationExpr"


    // $ANTLR start "entryRuleEVectorExpr"
    // InternalAlertingParser.g:914:1: entryRuleEVectorExpr returns [EObject current=null] : iv_ruleEVectorExpr= ruleEVectorExpr EOF ;
    public final EObject entryRuleEVectorExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVectorExpr = null;


        try {
            // InternalAlertingParser.g:914:52: (iv_ruleEVectorExpr= ruleEVectorExpr EOF )
            // InternalAlertingParser.g:915:2: iv_ruleEVectorExpr= ruleEVectorExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEVectorExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEVectorExpr=ruleEVectorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEVectorExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEVectorExpr"


    // $ANTLR start "ruleEVectorExpr"
    // InternalAlertingParser.g:921:1: ruleEVectorExpr returns [EObject current=null] : (this_EBinaryExpr_0= ruleEBinaryExpr | this_EFunctionExpr_1= ruleEFunctionExpr | this_EAggregationExpr_2= ruleEAggregationExpr | this_EMetricExpr_3= ruleEMetricExpr | this_ENUMBER_4= ruleENUMBER ) ;
    public final EObject ruleEVectorExpr() throws RecognitionException {
        EObject current = null;

        EObject this_EBinaryExpr_0 = null;

        EObject this_EFunctionExpr_1 = null;

        EObject this_EAggregationExpr_2 = null;

        EObject this_EMetricExpr_3 = null;

        EObject this_ENUMBER_4 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:927:2: ( (this_EBinaryExpr_0= ruleEBinaryExpr | this_EFunctionExpr_1= ruleEFunctionExpr | this_EAggregationExpr_2= ruleEAggregationExpr | this_EMetricExpr_3= ruleEMetricExpr | this_ENUMBER_4= ruleENUMBER ) )
            // InternalAlertingParser.g:928:2: (this_EBinaryExpr_0= ruleEBinaryExpr | this_EFunctionExpr_1= ruleEFunctionExpr | this_EAggregationExpr_2= ruleEAggregationExpr | this_EMetricExpr_3= ruleEMetricExpr | this_ENUMBER_4= ruleENUMBER )
            {
            // InternalAlertingParser.g:928:2: (this_EBinaryExpr_0= ruleEBinaryExpr | this_EFunctionExpr_1= ruleEFunctionExpr | this_EAggregationExpr_2= ruleEAggregationExpr | this_EMetricExpr_3= ruleEMetricExpr | this_ENUMBER_4= ruleENUMBER )
            int alt12=5;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt12=1;
                }
                break;
            case RULE_EFUNCTIONTYPE:
                {
                alt12=2;
                }
                break;
            case RULE_EAGGREGATIONOPER:
                {
                alt12=3;
                }
                break;
            case RULE_ENODEEXPORTER:
            case RULE_ESLURMEXPORTER:
            case RULE_EPBSEXPORTER:
                {
                alt12=4;
                }
                break;
            case HyphenMinus:
            case RULE_INT:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAlertingParser.g:929:3: this_EBinaryExpr_0= ruleEBinaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEVectorExprAccess().getEBinaryExprParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EBinaryExpr_0=ruleEBinaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EBinaryExpr_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlertingParser.g:938:3: this_EFunctionExpr_1= ruleEFunctionExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEVectorExprAccess().getEFunctionExprParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EFunctionExpr_1=ruleEFunctionExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EFunctionExpr_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlertingParser.g:947:3: this_EAggregationExpr_2= ruleEAggregationExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEVectorExprAccess().getEAggregationExprParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EAggregationExpr_2=ruleEAggregationExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EAggregationExpr_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalAlertingParser.g:956:3: this_EMetricExpr_3= ruleEMetricExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEVectorExprAccess().getEMetricExprParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EMetricExpr_3=ruleEMetricExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EMetricExpr_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalAlertingParser.g:965:3: this_ENUMBER_4= ruleENUMBER
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEVectorExprAccess().getENUMBERParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ENUMBER_4=ruleENUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ENUMBER_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEVectorExpr"


    // $ANTLR start "entryRuleEBinaryExpr"
    // InternalAlertingParser.g:977:1: entryRuleEBinaryExpr returns [EObject current=null] : iv_ruleEBinaryExpr= ruleEBinaryExpr EOF ;
    public final EObject entryRuleEBinaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBinaryExpr = null;


        try {
            // InternalAlertingParser.g:977:52: (iv_ruleEBinaryExpr= ruleEBinaryExpr EOF )
            // InternalAlertingParser.g:978:2: iv_ruleEBinaryExpr= ruleEBinaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBinaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBinaryExpr=ruleEBinaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBinaryExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEBinaryExpr"


    // $ANTLR start "ruleEBinaryExpr"
    // InternalAlertingParser.g:984:1: ruleEBinaryExpr returns [EObject current=null] : (otherlv_0= LeftParenthesis ( (lv_lexpr_1_0= ruleEVectorExpr ) ) ( (lv_oper_2_0= ruleEBinaryOperator ) ) ( (lv_rexpr_3_0= ruleEVectorExpr ) ) otherlv_4= RightParenthesis ) ;
    public final EObject ruleEBinaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_lexpr_1_0 = null;

        EObject lv_oper_2_0 = null;

        EObject lv_rexpr_3_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:990:2: ( (otherlv_0= LeftParenthesis ( (lv_lexpr_1_0= ruleEVectorExpr ) ) ( (lv_oper_2_0= ruleEBinaryOperator ) ) ( (lv_rexpr_3_0= ruleEVectorExpr ) ) otherlv_4= RightParenthesis ) )
            // InternalAlertingParser.g:991:2: (otherlv_0= LeftParenthesis ( (lv_lexpr_1_0= ruleEVectorExpr ) ) ( (lv_oper_2_0= ruleEBinaryOperator ) ) ( (lv_rexpr_3_0= ruleEVectorExpr ) ) otherlv_4= RightParenthesis )
            {
            // InternalAlertingParser.g:991:2: (otherlv_0= LeftParenthesis ( (lv_lexpr_1_0= ruleEVectorExpr ) ) ( (lv_oper_2_0= ruleEBinaryOperator ) ) ( (lv_rexpr_3_0= ruleEVectorExpr ) ) otherlv_4= RightParenthesis )
            // InternalAlertingParser.g:992:3: otherlv_0= LeftParenthesis ( (lv_lexpr_1_0= ruleEVectorExpr ) ) ( (lv_oper_2_0= ruleEBinaryOperator ) ) ( (lv_rexpr_3_0= ruleEVectorExpr ) ) otherlv_4= RightParenthesis
            {
            otherlv_0=(Token)match(input,LeftParenthesis,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEBinaryExprAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalAlertingParser.g:996:3: ( (lv_lexpr_1_0= ruleEVectorExpr ) )
            // InternalAlertingParser.g:997:4: (lv_lexpr_1_0= ruleEVectorExpr )
            {
            // InternalAlertingParser.g:997:4: (lv_lexpr_1_0= ruleEVectorExpr )
            // InternalAlertingParser.g:998:5: lv_lexpr_1_0= ruleEVectorExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEBinaryExprAccess().getLexprEVectorExprParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_lexpr_1_0=ruleEVectorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEBinaryExprRule());
              					}
              					set(
              						current,
              						"lexpr",
              						lv_lexpr_1_0,
              						"org.sodalite.dsl.Alerting.EVectorExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlertingParser.g:1015:3: ( (lv_oper_2_0= ruleEBinaryOperator ) )
            // InternalAlertingParser.g:1016:4: (lv_oper_2_0= ruleEBinaryOperator )
            {
            // InternalAlertingParser.g:1016:4: (lv_oper_2_0= ruleEBinaryOperator )
            // InternalAlertingParser.g:1017:5: lv_oper_2_0= ruleEBinaryOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEBinaryExprAccess().getOperEBinaryOperatorParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_oper_2_0=ruleEBinaryOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEBinaryExprRule());
              					}
              					set(
              						current,
              						"oper",
              						lv_oper_2_0,
              						"org.sodalite.dsl.Alerting.EBinaryOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlertingParser.g:1034:3: ( (lv_rexpr_3_0= ruleEVectorExpr ) )
            // InternalAlertingParser.g:1035:4: (lv_rexpr_3_0= ruleEVectorExpr )
            {
            // InternalAlertingParser.g:1035:4: (lv_rexpr_3_0= ruleEVectorExpr )
            // InternalAlertingParser.g:1036:5: lv_rexpr_3_0= ruleEVectorExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEBinaryExprAccess().getRexprEVectorExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_rexpr_3_0=ruleEVectorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEBinaryExprRule());
              					}
              					set(
              						current,
              						"rexpr",
              						lv_rexpr_3_0,
              						"org.sodalite.dsl.Alerting.EVectorExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEBinaryExprAccess().getRightParenthesisKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEBinaryExpr"


    // $ANTLR start "entryRuleEFunctionExpr"
    // InternalAlertingParser.g:1061:1: entryRuleEFunctionExpr returns [EObject current=null] : iv_ruleEFunctionExpr= ruleEFunctionExpr EOF ;
    public final EObject entryRuleEFunctionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunctionExpr = null;


        try {
            // InternalAlertingParser.g:1061:54: (iv_ruleEFunctionExpr= ruleEFunctionExpr EOF )
            // InternalAlertingParser.g:1062:2: iv_ruleEFunctionExpr= ruleEFunctionExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFunctionExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFunctionExpr=ruleEFunctionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFunctionExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFunctionExpr"


    // $ANTLR start "ruleEFunctionExpr"
    // InternalAlertingParser.g:1068:1: ruleEFunctionExpr returns [EObject current=null] : ( ( (lv_function_0_0= RULE_EFUNCTIONTYPE ) ) otherlv_1= LeftParenthesis ( (lv_expr_2_0= ruleEVectorExpr ) )? otherlv_3= RightParenthesis ) ;
    public final EObject ruleEFunctionExpr() throws RecognitionException {
        EObject current = null;

        Token lv_function_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:1074:2: ( ( ( (lv_function_0_0= RULE_EFUNCTIONTYPE ) ) otherlv_1= LeftParenthesis ( (lv_expr_2_0= ruleEVectorExpr ) )? otherlv_3= RightParenthesis ) )
            // InternalAlertingParser.g:1075:2: ( ( (lv_function_0_0= RULE_EFUNCTIONTYPE ) ) otherlv_1= LeftParenthesis ( (lv_expr_2_0= ruleEVectorExpr ) )? otherlv_3= RightParenthesis )
            {
            // InternalAlertingParser.g:1075:2: ( ( (lv_function_0_0= RULE_EFUNCTIONTYPE ) ) otherlv_1= LeftParenthesis ( (lv_expr_2_0= ruleEVectorExpr ) )? otherlv_3= RightParenthesis )
            // InternalAlertingParser.g:1076:3: ( (lv_function_0_0= RULE_EFUNCTIONTYPE ) ) otherlv_1= LeftParenthesis ( (lv_expr_2_0= ruleEVectorExpr ) )? otherlv_3= RightParenthesis
            {
            // InternalAlertingParser.g:1076:3: ( (lv_function_0_0= RULE_EFUNCTIONTYPE ) )
            // InternalAlertingParser.g:1077:4: (lv_function_0_0= RULE_EFUNCTIONTYPE )
            {
            // InternalAlertingParser.g:1077:4: (lv_function_0_0= RULE_EFUNCTIONTYPE )
            // InternalAlertingParser.g:1078:5: lv_function_0_0= RULE_EFUNCTIONTYPE
            {
            lv_function_0_0=(Token)match(input,RULE_EFUNCTIONTYPE,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_function_0_0, grammarAccess.getEFunctionExprAccess().getFunctionEFUNCTIONTYPETerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEFunctionExprRule());
              					}
              					setWithLastConsumed(
              						current,
              						"function",
              						lv_function_0_0,
              						"org.sodalite.dsl.Alerting.EFUNCTIONTYPE");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEFunctionExprAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalAlertingParser.g:1098:3: ( (lv_expr_2_0= ruleEVectorExpr ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LeftParenthesis||LA13_0==HyphenMinus||LA13_0==RULE_EAGGREGATIONOPER||LA13_0==RULE_EFUNCTIONTYPE||(LA13_0>=RULE_ENODEEXPORTER && LA13_0<=RULE_EPBSEXPORTER)||LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlertingParser.g:1099:4: (lv_expr_2_0= ruleEVectorExpr )
                    {
                    // InternalAlertingParser.g:1099:4: (lv_expr_2_0= ruleEVectorExpr )
                    // InternalAlertingParser.g:1100:5: lv_expr_2_0= ruleEVectorExpr
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEFunctionExprAccess().getExprEVectorExprParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
                    lv_expr_2_0=ruleEVectorExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEFunctionExprRule());
                      					}
                      					set(
                      						current,
                      						"expr",
                      						lv_expr_2_0,
                      						"org.sodalite.dsl.Alerting.EVectorExpr");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEFunctionExprAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFunctionExpr"


    // $ANTLR start "entryRuleEMetricExpr"
    // InternalAlertingParser.g:1125:1: entryRuleEMetricExpr returns [EObject current=null] : iv_ruleEMetricExpr= ruleEMetricExpr EOF ;
    public final EObject entryRuleEMetricExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMetricExpr = null;


        try {
            // InternalAlertingParser.g:1125:52: (iv_ruleEMetricExpr= ruleEMetricExpr EOF )
            // InternalAlertingParser.g:1126:2: iv_ruleEMetricExpr= ruleEMetricExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMetricExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEMetricExpr=ruleEMetricExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMetricExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEMetricExpr"


    // $ANTLR start "ruleEMetricExpr"
    // InternalAlertingParser.g:1132:1: ruleEMetricExpr returns [EObject current=null] : ( ( (lv_type_0_0= ruleEMetricType ) ) otherlv_1= LeftCurlyBracket ( (lv_tags_2_0= ruleETag ) )? (otherlv_3= Comma ( (lv_tags_4_0= ruleETag ) ) )* otherlv_5= RightCurlyBracket (otherlv_6= LeftSquareBracket ( (lv_period_7_0= ruleEPeriod ) ) otherlv_8= RightSquareBracket )? ) ;
    public final EObject ruleEMetricExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_type_0_0 = null;

        EObject lv_tags_2_0 = null;

        EObject lv_tags_4_0 = null;

        EObject lv_period_7_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:1138:2: ( ( ( (lv_type_0_0= ruleEMetricType ) ) otherlv_1= LeftCurlyBracket ( (lv_tags_2_0= ruleETag ) )? (otherlv_3= Comma ( (lv_tags_4_0= ruleETag ) ) )* otherlv_5= RightCurlyBracket (otherlv_6= LeftSquareBracket ( (lv_period_7_0= ruleEPeriod ) ) otherlv_8= RightSquareBracket )? ) )
            // InternalAlertingParser.g:1139:2: ( ( (lv_type_0_0= ruleEMetricType ) ) otherlv_1= LeftCurlyBracket ( (lv_tags_2_0= ruleETag ) )? (otherlv_3= Comma ( (lv_tags_4_0= ruleETag ) ) )* otherlv_5= RightCurlyBracket (otherlv_6= LeftSquareBracket ( (lv_period_7_0= ruleEPeriod ) ) otherlv_8= RightSquareBracket )? )
            {
            // InternalAlertingParser.g:1139:2: ( ( (lv_type_0_0= ruleEMetricType ) ) otherlv_1= LeftCurlyBracket ( (lv_tags_2_0= ruleETag ) )? (otherlv_3= Comma ( (lv_tags_4_0= ruleETag ) ) )* otherlv_5= RightCurlyBracket (otherlv_6= LeftSquareBracket ( (lv_period_7_0= ruleEPeriod ) ) otherlv_8= RightSquareBracket )? )
            // InternalAlertingParser.g:1140:3: ( (lv_type_0_0= ruleEMetricType ) ) otherlv_1= LeftCurlyBracket ( (lv_tags_2_0= ruleETag ) )? (otherlv_3= Comma ( (lv_tags_4_0= ruleETag ) ) )* otherlv_5= RightCurlyBracket (otherlv_6= LeftSquareBracket ( (lv_period_7_0= ruleEPeriod ) ) otherlv_8= RightSquareBracket )?
            {
            // InternalAlertingParser.g:1140:3: ( (lv_type_0_0= ruleEMetricType ) )
            // InternalAlertingParser.g:1141:4: (lv_type_0_0= ruleEMetricType )
            {
            // InternalAlertingParser.g:1141:4: (lv_type_0_0= ruleEMetricType )
            // InternalAlertingParser.g:1142:5: lv_type_0_0= ruleEMetricType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEMetricExprAccess().getTypeEMetricTypeParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_type_0_0=ruleEMetricType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEMetricExprRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_0_0,
              						"org.sodalite.dsl.Alerting.EMetricType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,LeftCurlyBracket,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEMetricExprAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalAlertingParser.g:1163:3: ( (lv_tags_2_0= ruleETag ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlertingParser.g:1164:4: (lv_tags_2_0= ruleETag )
                    {
                    // InternalAlertingParser.g:1164:4: (lv_tags_2_0= ruleETag )
                    // InternalAlertingParser.g:1165:5: lv_tags_2_0= ruleETag
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEMetricExprAccess().getTagsETagParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_27);
                    lv_tags_2_0=ruleETag();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEMetricExprRule());
                      					}
                      					add(
                      						current,
                      						"tags",
                      						lv_tags_2_0,
                      						"org.sodalite.dsl.Alerting.ETag");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalAlertingParser.g:1182:3: (otherlv_3= Comma ( (lv_tags_4_0= ruleETag ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalAlertingParser.g:1183:4: otherlv_3= Comma ( (lv_tags_4_0= ruleETag ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getEMetricExprAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalAlertingParser.g:1187:4: ( (lv_tags_4_0= ruleETag ) )
            	    // InternalAlertingParser.g:1188:5: (lv_tags_4_0= ruleETag )
            	    {
            	    // InternalAlertingParser.g:1188:5: (lv_tags_4_0= ruleETag )
            	    // InternalAlertingParser.g:1189:6: lv_tags_4_0= ruleETag
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEMetricExprAccess().getTagsETagParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_tags_4_0=ruleETag();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEMetricExprRule());
            	      						}
            	      						add(
            	      							current,
            	      							"tags",
            	      							lv_tags_4_0,
            	      							"org.sodalite.dsl.Alerting.ETag");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEMetricExprAccess().getRightCurlyBracketKeyword_4());
              		
            }
            // InternalAlertingParser.g:1211:3: (otherlv_6= LeftSquareBracket ( (lv_period_7_0= ruleEPeriod ) ) otherlv_8= RightSquareBracket )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LeftSquareBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAlertingParser.g:1212:4: otherlv_6= LeftSquareBracket ( (lv_period_7_0= ruleEPeriod ) ) otherlv_8= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,LeftSquareBracket,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getEMetricExprAccess().getLeftSquareBracketKeyword_5_0());
                      			
                    }
                    // InternalAlertingParser.g:1216:4: ( (lv_period_7_0= ruleEPeriod ) )
                    // InternalAlertingParser.g:1217:5: (lv_period_7_0= ruleEPeriod )
                    {
                    // InternalAlertingParser.g:1217:5: (lv_period_7_0= ruleEPeriod )
                    // InternalAlertingParser.g:1218:6: lv_period_7_0= ruleEPeriod
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEMetricExprAccess().getPeriodEPeriodParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_period_7_0=ruleEPeriod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEMetricExprRule());
                      						}
                      						set(
                      							current,
                      							"period",
                      							lv_period_7_0,
                      							"org.sodalite.dsl.Alerting.EPeriod");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getEMetricExprAccess().getRightSquareBracketKeyword_5_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEMetricExpr"


    // $ANTLR start "entryRuleEPeriod"
    // InternalAlertingParser.g:1244:1: entryRuleEPeriod returns [EObject current=null] : iv_ruleEPeriod= ruleEPeriod EOF ;
    public final EObject entryRuleEPeriod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPeriod = null;


        try {
            // InternalAlertingParser.g:1244:48: (iv_ruleEPeriod= ruleEPeriod EOF )
            // InternalAlertingParser.g:1245:2: iv_ruleEPeriod= ruleEPeriod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPeriodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEPeriod=ruleEPeriod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPeriod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEPeriod"


    // $ANTLR start "ruleEPeriod"
    // InternalAlertingParser.g:1251:1: ruleEPeriod returns [EObject current=null] : ( ( (lv_segments_0_0= ruleEPeriodSegment ) ) ( (lv_segments_1_0= ruleEPeriodSegment ) )* ) ;
    public final EObject ruleEPeriod() throws RecognitionException {
        EObject current = null;

        EObject lv_segments_0_0 = null;

        EObject lv_segments_1_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:1257:2: ( ( ( (lv_segments_0_0= ruleEPeriodSegment ) ) ( (lv_segments_1_0= ruleEPeriodSegment ) )* ) )
            // InternalAlertingParser.g:1258:2: ( ( (lv_segments_0_0= ruleEPeriodSegment ) ) ( (lv_segments_1_0= ruleEPeriodSegment ) )* )
            {
            // InternalAlertingParser.g:1258:2: ( ( (lv_segments_0_0= ruleEPeriodSegment ) ) ( (lv_segments_1_0= ruleEPeriodSegment ) )* )
            // InternalAlertingParser.g:1259:3: ( (lv_segments_0_0= ruleEPeriodSegment ) ) ( (lv_segments_1_0= ruleEPeriodSegment ) )*
            {
            // InternalAlertingParser.g:1259:3: ( (lv_segments_0_0= ruleEPeriodSegment ) )
            // InternalAlertingParser.g:1260:4: (lv_segments_0_0= ruleEPeriodSegment )
            {
            // InternalAlertingParser.g:1260:4: (lv_segments_0_0= ruleEPeriodSegment )
            // InternalAlertingParser.g:1261:5: lv_segments_0_0= ruleEPeriodSegment
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEPeriodAccess().getSegmentsEPeriodSegmentParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_segments_0_0=ruleEPeriodSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEPeriodRule());
              					}
              					add(
              						current,
              						"segments",
              						lv_segments_0_0,
              						"org.sodalite.dsl.Alerting.EPeriodSegment");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlertingParser.g:1278:3: ( (lv_segments_1_0= ruleEPeriodSegment ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAlertingParser.g:1279:4: (lv_segments_1_0= ruleEPeriodSegment )
            	    {
            	    // InternalAlertingParser.g:1279:4: (lv_segments_1_0= ruleEPeriodSegment )
            	    // InternalAlertingParser.g:1280:5: lv_segments_1_0= ruleEPeriodSegment
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEPeriodAccess().getSegmentsEPeriodSegmentParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_segments_1_0=ruleEPeriodSegment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEPeriodRule());
            	      					}
            	      					add(
            	      						current,
            	      						"segments",
            	      						lv_segments_1_0,
            	      						"org.sodalite.dsl.Alerting.EPeriodSegment");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEPeriod"


    // $ANTLR start "entryRuleEPeriodSegment"
    // InternalAlertingParser.g:1301:1: entryRuleEPeriodSegment returns [EObject current=null] : iv_ruleEPeriodSegment= ruleEPeriodSegment EOF ;
    public final EObject entryRuleEPeriodSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPeriodSegment = null;


        try {
            // InternalAlertingParser.g:1301:55: (iv_ruleEPeriodSegment= ruleEPeriodSegment EOF )
            // InternalAlertingParser.g:1302:2: iv_ruleEPeriodSegment= ruleEPeriodSegment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEPeriodSegmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEPeriodSegment=ruleEPeriodSegment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEPeriodSegment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEPeriodSegment"


    // $ANTLR start "ruleEPeriodSegment"
    // InternalAlertingParser.g:1308:1: ruleEPeriodSegment returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_EPERIODUNIT ) ) ) ;
    public final EObject ruleEPeriodSegment() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_unit_1_0=null;


        	enterRule();

        try {
            // InternalAlertingParser.g:1314:2: ( ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_EPERIODUNIT ) ) ) )
            // InternalAlertingParser.g:1315:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_EPERIODUNIT ) ) )
            {
            // InternalAlertingParser.g:1315:2: ( ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_EPERIODUNIT ) ) )
            // InternalAlertingParser.g:1316:3: ( (lv_value_0_0= RULE_INT ) ) ( (lv_unit_1_0= RULE_EPERIODUNIT ) )
            {
            // InternalAlertingParser.g:1316:3: ( (lv_value_0_0= RULE_INT ) )
            // InternalAlertingParser.g:1317:4: (lv_value_0_0= RULE_INT )
            {
            // InternalAlertingParser.g:1317:4: (lv_value_0_0= RULE_INT )
            // InternalAlertingParser.g:1318:5: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_0_0, grammarAccess.getEPeriodSegmentAccess().getValueINTTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEPeriodSegmentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_0_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            // InternalAlertingParser.g:1334:3: ( (lv_unit_1_0= RULE_EPERIODUNIT ) )
            // InternalAlertingParser.g:1335:4: (lv_unit_1_0= RULE_EPERIODUNIT )
            {
            // InternalAlertingParser.g:1335:4: (lv_unit_1_0= RULE_EPERIODUNIT )
            // InternalAlertingParser.g:1336:5: lv_unit_1_0= RULE_EPERIODUNIT
            {
            lv_unit_1_0=(Token)match(input,RULE_EPERIODUNIT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_unit_1_0, grammarAccess.getEPeriodSegmentAccess().getUnitEPERIODUNITTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEPeriodSegmentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"unit",
              						lv_unit_1_0,
              						"org.sodalite.dsl.Alerting.EPERIODUNIT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEPeriodSegment"


    // $ANTLR start "entryRuleETag"
    // InternalAlertingParser.g:1356:1: entryRuleETag returns [EObject current=null] : iv_ruleETag= ruleETag EOF ;
    public final EObject entryRuleETag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETag = null;


        try {
            // InternalAlertingParser.g:1356:45: (iv_ruleETag= ruleETag EOF )
            // InternalAlertingParser.g:1357:2: iv_ruleETag= ruleETag EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getETagRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleETag=ruleETag();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleETag; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleETag"


    // $ANTLR start "ruleETag"
    // InternalAlertingParser.g:1363:1: ruleETag returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_oper_1_0= ruleEOperAssociation ) ) ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleETag() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_value_2_0=null;
        EObject lv_oper_1_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:1369:2: ( ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_oper_1_0= ruleEOperAssociation ) ) ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalAlertingParser.g:1370:2: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_oper_1_0= ruleEOperAssociation ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalAlertingParser.g:1370:2: ( ( (lv_key_0_0= RULE_ID ) ) ( (lv_oper_1_0= ruleEOperAssociation ) ) ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalAlertingParser.g:1371:3: ( (lv_key_0_0= RULE_ID ) ) ( (lv_oper_1_0= ruleEOperAssociation ) ) ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalAlertingParser.g:1371:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalAlertingParser.g:1372:4: (lv_key_0_0= RULE_ID )
            {
            // InternalAlertingParser.g:1372:4: (lv_key_0_0= RULE_ID )
            // InternalAlertingParser.g:1373:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_key_0_0, grammarAccess.getETagAccess().getKeyIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getETagRule());
              					}
              					setWithLastConsumed(
              						current,
              						"key",
              						lv_key_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalAlertingParser.g:1389:3: ( (lv_oper_1_0= ruleEOperAssociation ) )
            // InternalAlertingParser.g:1390:4: (lv_oper_1_0= ruleEOperAssociation )
            {
            // InternalAlertingParser.g:1390:4: (lv_oper_1_0= ruleEOperAssociation )
            // InternalAlertingParser.g:1391:5: lv_oper_1_0= ruleEOperAssociation
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getETagAccess().getOperEOperAssociationParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_oper_1_0=ruleEOperAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getETagRule());
              					}
              					set(
              						current,
              						"oper",
              						lv_oper_1_0,
              						"org.sodalite.dsl.Alerting.EOperAssociation");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalAlertingParser.g:1408:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalAlertingParser.g:1409:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalAlertingParser.g:1409:4: (lv_value_2_0= RULE_STRING )
            // InternalAlertingParser.g:1410:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_2_0, grammarAccess.getETagAccess().getValueSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getETagRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleETag"


    // $ANTLR start "entryRuleEOperAssociation"
    // InternalAlertingParser.g:1430:1: entryRuleEOperAssociation returns [EObject current=null] : iv_ruleEOperAssociation= ruleEOperAssociation EOF ;
    public final EObject entryRuleEOperAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperAssociation = null;


        try {
            // InternalAlertingParser.g:1430:57: (iv_ruleEOperAssociation= ruleEOperAssociation EOF )
            // InternalAlertingParser.g:1431:2: iv_ruleEOperAssociation= ruleEOperAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEOperAssociationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEOperAssociation=ruleEOperAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEOperAssociation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEOperAssociation"


    // $ANTLR start "ruleEOperAssociation"
    // InternalAlertingParser.g:1437:1: ruleEOperAssociation returns [EObject current=null] : ( ( (lv_type_0_1= EqualsSign | lv_type_0_2= EqualsSignTilde | lv_type_0_3= ExclamationMarkEqualsSign | lv_type_0_4= Tilde ) ) ) ;
    public final EObject ruleEOperAssociation() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;


        	enterRule();

        try {
            // InternalAlertingParser.g:1443:2: ( ( ( (lv_type_0_1= EqualsSign | lv_type_0_2= EqualsSignTilde | lv_type_0_3= ExclamationMarkEqualsSign | lv_type_0_4= Tilde ) ) ) )
            // InternalAlertingParser.g:1444:2: ( ( (lv_type_0_1= EqualsSign | lv_type_0_2= EqualsSignTilde | lv_type_0_3= ExclamationMarkEqualsSign | lv_type_0_4= Tilde ) ) )
            {
            // InternalAlertingParser.g:1444:2: ( ( (lv_type_0_1= EqualsSign | lv_type_0_2= EqualsSignTilde | lv_type_0_3= ExclamationMarkEqualsSign | lv_type_0_4= Tilde ) ) )
            // InternalAlertingParser.g:1445:3: ( (lv_type_0_1= EqualsSign | lv_type_0_2= EqualsSignTilde | lv_type_0_3= ExclamationMarkEqualsSign | lv_type_0_4= Tilde ) )
            {
            // InternalAlertingParser.g:1445:3: ( (lv_type_0_1= EqualsSign | lv_type_0_2= EqualsSignTilde | lv_type_0_3= ExclamationMarkEqualsSign | lv_type_0_4= Tilde ) )
            // InternalAlertingParser.g:1446:4: (lv_type_0_1= EqualsSign | lv_type_0_2= EqualsSignTilde | lv_type_0_3= ExclamationMarkEqualsSign | lv_type_0_4= Tilde )
            {
            // InternalAlertingParser.g:1446:4: (lv_type_0_1= EqualsSign | lv_type_0_2= EqualsSignTilde | lv_type_0_3= ExclamationMarkEqualsSign | lv_type_0_4= Tilde )
            int alt18=4;
            switch ( input.LA(1) ) {
            case EqualsSign:
                {
                alt18=1;
                }
                break;
            case EqualsSignTilde:
                {
                alt18=2;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt18=3;
                }
                break;
            case Tilde:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAlertingParser.g:1447:5: lv_type_0_1= EqualsSign
                    {
                    lv_type_0_1=(Token)match(input,EqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_1, grammarAccess.getEOperAssociationAccess().getTypeEqualsSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEOperAssociationRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalAlertingParser.g:1458:5: lv_type_0_2= EqualsSignTilde
                    {
                    lv_type_0_2=(Token)match(input,EqualsSignTilde,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_2, grammarAccess.getEOperAssociationAccess().getTypeEqualsSignTildeKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEOperAssociationRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalAlertingParser.g:1469:5: lv_type_0_3= ExclamationMarkEqualsSign
                    {
                    lv_type_0_3=(Token)match(input,ExclamationMarkEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_3, grammarAccess.getEOperAssociationAccess().getTypeExclamationMarkEqualsSignKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEOperAssociationRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalAlertingParser.g:1480:5: lv_type_0_4= Tilde
                    {
                    lv_type_0_4=(Token)match(input,Tilde,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_4, grammarAccess.getEOperAssociationAccess().getTypeTildeKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEOperAssociationRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_4, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEOperAssociation"


    // $ANTLR start "entryRuleEMetricType"
    // InternalAlertingParser.g:1496:1: entryRuleEMetricType returns [EObject current=null] : iv_ruleEMetricType= ruleEMetricType EOF ;
    public final EObject entryRuleEMetricType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMetricType = null;


        try {
            // InternalAlertingParser.g:1496:52: (iv_ruleEMetricType= ruleEMetricType EOF )
            // InternalAlertingParser.g:1497:2: iv_ruleEMetricType= ruleEMetricType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEMetricTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEMetricType=ruleEMetricType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEMetricType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEMetricType"


    // $ANTLR start "ruleEMetricType"
    // InternalAlertingParser.g:1503:1: ruleEMetricType returns [EObject current=null] : ( ( (lv_type_0_1= RULE_ESLURMEXPORTER | lv_type_0_2= RULE_EPBSEXPORTER | lv_type_0_3= RULE_ENODEEXPORTER ) ) ) ;
    public final EObject ruleEMetricType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;


        	enterRule();

        try {
            // InternalAlertingParser.g:1509:2: ( ( ( (lv_type_0_1= RULE_ESLURMEXPORTER | lv_type_0_2= RULE_EPBSEXPORTER | lv_type_0_3= RULE_ENODEEXPORTER ) ) ) )
            // InternalAlertingParser.g:1510:2: ( ( (lv_type_0_1= RULE_ESLURMEXPORTER | lv_type_0_2= RULE_EPBSEXPORTER | lv_type_0_3= RULE_ENODEEXPORTER ) ) )
            {
            // InternalAlertingParser.g:1510:2: ( ( (lv_type_0_1= RULE_ESLURMEXPORTER | lv_type_0_2= RULE_EPBSEXPORTER | lv_type_0_3= RULE_ENODEEXPORTER ) ) )
            // InternalAlertingParser.g:1511:3: ( (lv_type_0_1= RULE_ESLURMEXPORTER | lv_type_0_2= RULE_EPBSEXPORTER | lv_type_0_3= RULE_ENODEEXPORTER ) )
            {
            // InternalAlertingParser.g:1511:3: ( (lv_type_0_1= RULE_ESLURMEXPORTER | lv_type_0_2= RULE_EPBSEXPORTER | lv_type_0_3= RULE_ENODEEXPORTER ) )
            // InternalAlertingParser.g:1512:4: (lv_type_0_1= RULE_ESLURMEXPORTER | lv_type_0_2= RULE_EPBSEXPORTER | lv_type_0_3= RULE_ENODEEXPORTER )
            {
            // InternalAlertingParser.g:1512:4: (lv_type_0_1= RULE_ESLURMEXPORTER | lv_type_0_2= RULE_EPBSEXPORTER | lv_type_0_3= RULE_ENODEEXPORTER )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_ESLURMEXPORTER:
                {
                alt19=1;
                }
                break;
            case RULE_EPBSEXPORTER:
                {
                alt19=2;
                }
                break;
            case RULE_ENODEEXPORTER:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAlertingParser.g:1513:5: lv_type_0_1= RULE_ESLURMEXPORTER
                    {
                    lv_type_0_1=(Token)match(input,RULE_ESLURMEXPORTER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_1, grammarAccess.getEMetricTypeAccess().getTypeESLURMEXPORTERTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEMetricTypeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"type",
                      						lv_type_0_1,
                      						"org.sodalite.dsl.Alerting.ESLURMEXPORTER");
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalAlertingParser.g:1528:5: lv_type_0_2= RULE_EPBSEXPORTER
                    {
                    lv_type_0_2=(Token)match(input,RULE_EPBSEXPORTER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_2, grammarAccess.getEMetricTypeAccess().getTypeEPBSEXPORTERTerminalRuleCall_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEMetricTypeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"type",
                      						lv_type_0_2,
                      						"org.sodalite.dsl.Alerting.EPBSEXPORTER");
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalAlertingParser.g:1543:5: lv_type_0_3= RULE_ENODEEXPORTER
                    {
                    lv_type_0_3=(Token)match(input,RULE_ENODEEXPORTER,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_3, grammarAccess.getEMetricTypeAccess().getTypeENODEEXPORTERTerminalRuleCall_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEMetricTypeRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"type",
                      						lv_type_0_3,
                      						"org.sodalite.dsl.Alerting.ENODEEXPORTER");
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEMetricType"


    // $ANTLR start "entryRuleENUMBER"
    // InternalAlertingParser.g:1563:1: entryRuleENUMBER returns [EObject current=null] : iv_ruleENUMBER= ruleENUMBER EOF ;
    public final EObject entryRuleENUMBER() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENUMBER = null;


        try {
            // InternalAlertingParser.g:1563:48: (iv_ruleENUMBER= ruleENUMBER EOF )
            // InternalAlertingParser.g:1564:2: iv_ruleENUMBER= ruleENUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleENUMBER=ruleENUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleENUMBER; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleENUMBER"


    // $ANTLR start "ruleENUMBER"
    // InternalAlertingParser.g:1570:1: ruleENUMBER returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleENUMBER() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:1576:2: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // InternalAlertingParser.g:1577:2: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // InternalAlertingParser.g:1577:2: ( (lv_value_0_0= ruleNUMBER ) )
            // InternalAlertingParser.g:1578:3: (lv_value_0_0= ruleNUMBER )
            {
            // InternalAlertingParser.g:1578:3: (lv_value_0_0= ruleNUMBER )
            // InternalAlertingParser.g:1579:4: lv_value_0_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getENUMBERAccess().getValueNUMBERParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getENUMBERRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.sodalite.dsl.Alerting.NUMBER");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleENUMBER"


    // $ANTLR start "entryRuleEBinaryOperator"
    // InternalAlertingParser.g:1599:1: entryRuleEBinaryOperator returns [EObject current=null] : iv_ruleEBinaryOperator= ruleEBinaryOperator EOF ;
    public final EObject entryRuleEBinaryOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBinaryOperator = null;


        try {
            // InternalAlertingParser.g:1599:56: (iv_ruleEBinaryOperator= ruleEBinaryOperator EOF )
            // InternalAlertingParser.g:1600:2: iv_ruleEBinaryOperator= ruleEBinaryOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBinaryOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBinaryOperator=ruleEBinaryOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBinaryOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEBinaryOperator"


    // $ANTLR start "ruleEBinaryOperator"
    // InternalAlertingParser.g:1606:1: ruleEBinaryOperator returns [EObject current=null] : (this_EArithmeticOperator_0= ruleEArithmeticOperator | this_EComparisonOperator_1= ruleEComparisonOperator | this_EBinaryLogicOperator_2= ruleEBinaryLogicOperator ) ;
    public final EObject ruleEBinaryOperator() throws RecognitionException {
        EObject current = null;

        EObject this_EArithmeticOperator_0 = null;

        EObject this_EComparisonOperator_1 = null;

        EObject this_EBinaryLogicOperator_2 = null;



        	enterRule();

        try {
            // InternalAlertingParser.g:1612:2: ( (this_EArithmeticOperator_0= ruleEArithmeticOperator | this_EComparisonOperator_1= ruleEComparisonOperator | this_EBinaryLogicOperator_2= ruleEBinaryLogicOperator ) )
            // InternalAlertingParser.g:1613:2: (this_EArithmeticOperator_0= ruleEArithmeticOperator | this_EComparisonOperator_1= ruleEComparisonOperator | this_EBinaryLogicOperator_2= ruleEBinaryLogicOperator )
            {
            // InternalAlertingParser.g:1613:2: (this_EArithmeticOperator_0= ruleEArithmeticOperator | this_EComparisonOperator_1= ruleEComparisonOperator | this_EBinaryLogicOperator_2= ruleEBinaryLogicOperator )
            int alt20=3;
            switch ( input.LA(1) ) {
            case PercentSign:
            case Asterisk:
            case PlusSign:
            case HyphenMinus:
            case Solidus:
            case CircumflexAccent:
                {
                alt20=1;
                }
                break;
            case LessThanSignEqualsSign:
            case EqualsSignEqualsSign:
            case GreaterThanSignEqualsSign:
            case LessThanSign:
            case GreaterThanSign:
                {
                alt20=2;
                }
                break;
            case Unless:
            case And:
            case Or:
                {
                alt20=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalAlertingParser.g:1614:3: this_EArithmeticOperator_0= ruleEArithmeticOperator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEBinaryOperatorAccess().getEArithmeticOperatorParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EArithmeticOperator_0=ruleEArithmeticOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EArithmeticOperator_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalAlertingParser.g:1623:3: this_EComparisonOperator_1= ruleEComparisonOperator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEBinaryOperatorAccess().getEComparisonOperatorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EComparisonOperator_1=ruleEComparisonOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EComparisonOperator_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalAlertingParser.g:1632:3: this_EBinaryLogicOperator_2= ruleEBinaryLogicOperator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEBinaryOperatorAccess().getEBinaryLogicOperatorParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EBinaryLogicOperator_2=ruleEBinaryLogicOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EBinaryLogicOperator_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEBinaryOperator"


    // $ANTLR start "entryRuleEArithmeticOperator"
    // InternalAlertingParser.g:1644:1: entryRuleEArithmeticOperator returns [EObject current=null] : iv_ruleEArithmeticOperator= ruleEArithmeticOperator EOF ;
    public final EObject entryRuleEArithmeticOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArithmeticOperator = null;


        try {
            // InternalAlertingParser.g:1644:60: (iv_ruleEArithmeticOperator= ruleEArithmeticOperator EOF )
            // InternalAlertingParser.g:1645:2: iv_ruleEArithmeticOperator= ruleEArithmeticOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEArithmeticOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEArithmeticOperator=ruleEArithmeticOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEArithmeticOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEArithmeticOperator"


    // $ANTLR start "ruleEArithmeticOperator"
    // InternalAlertingParser.g:1651:1: ruleEArithmeticOperator returns [EObject current=null] : ( ( (lv_type_0_1= PlusSign | lv_type_0_2= HyphenMinus | lv_type_0_3= Asterisk | lv_type_0_4= Solidus | lv_type_0_5= PercentSign | lv_type_0_6= CircumflexAccent ) ) ) ;
    public final EObject ruleEArithmeticOperator() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;
        Token lv_type_0_6=null;


        	enterRule();

        try {
            // InternalAlertingParser.g:1657:2: ( ( ( (lv_type_0_1= PlusSign | lv_type_0_2= HyphenMinus | lv_type_0_3= Asterisk | lv_type_0_4= Solidus | lv_type_0_5= PercentSign | lv_type_0_6= CircumflexAccent ) ) ) )
            // InternalAlertingParser.g:1658:2: ( ( (lv_type_0_1= PlusSign | lv_type_0_2= HyphenMinus | lv_type_0_3= Asterisk | lv_type_0_4= Solidus | lv_type_0_5= PercentSign | lv_type_0_6= CircumflexAccent ) ) )
            {
            // InternalAlertingParser.g:1658:2: ( ( (lv_type_0_1= PlusSign | lv_type_0_2= HyphenMinus | lv_type_0_3= Asterisk | lv_type_0_4= Solidus | lv_type_0_5= PercentSign | lv_type_0_6= CircumflexAccent ) ) )
            // InternalAlertingParser.g:1659:3: ( (lv_type_0_1= PlusSign | lv_type_0_2= HyphenMinus | lv_type_0_3= Asterisk | lv_type_0_4= Solidus | lv_type_0_5= PercentSign | lv_type_0_6= CircumflexAccent ) )
            {
            // InternalAlertingParser.g:1659:3: ( (lv_type_0_1= PlusSign | lv_type_0_2= HyphenMinus | lv_type_0_3= Asterisk | lv_type_0_4= Solidus | lv_type_0_5= PercentSign | lv_type_0_6= CircumflexAccent ) )
            // InternalAlertingParser.g:1660:4: (lv_type_0_1= PlusSign | lv_type_0_2= HyphenMinus | lv_type_0_3= Asterisk | lv_type_0_4= Solidus | lv_type_0_5= PercentSign | lv_type_0_6= CircumflexAccent )
            {
            // InternalAlertingParser.g:1660:4: (lv_type_0_1= PlusSign | lv_type_0_2= HyphenMinus | lv_type_0_3= Asterisk | lv_type_0_4= Solidus | lv_type_0_5= PercentSign | lv_type_0_6= CircumflexAccent )
            int alt21=6;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                alt21=1;
                }
                break;
            case HyphenMinus:
                {
                alt21=2;
                }
                break;
            case Asterisk:
                {
                alt21=3;
                }
                break;
            case Solidus:
                {
                alt21=4;
                }
                break;
            case PercentSign:
                {
                alt21=5;
                }
                break;
            case CircumflexAccent:
                {
                alt21=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalAlertingParser.g:1661:5: lv_type_0_1= PlusSign
                    {
                    lv_type_0_1=(Token)match(input,PlusSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_1, grammarAccess.getEArithmeticOperatorAccess().getTypePlusSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEArithmeticOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalAlertingParser.g:1672:5: lv_type_0_2= HyphenMinus
                    {
                    lv_type_0_2=(Token)match(input,HyphenMinus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_2, grammarAccess.getEArithmeticOperatorAccess().getTypeHyphenMinusKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEArithmeticOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalAlertingParser.g:1683:5: lv_type_0_3= Asterisk
                    {
                    lv_type_0_3=(Token)match(input,Asterisk,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_3, grammarAccess.getEArithmeticOperatorAccess().getTypeAsteriskKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEArithmeticOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalAlertingParser.g:1694:5: lv_type_0_4= Solidus
                    {
                    lv_type_0_4=(Token)match(input,Solidus,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_4, grammarAccess.getEArithmeticOperatorAccess().getTypeSolidusKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEArithmeticOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_4, null);
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalAlertingParser.g:1705:5: lv_type_0_5= PercentSign
                    {
                    lv_type_0_5=(Token)match(input,PercentSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_5, grammarAccess.getEArithmeticOperatorAccess().getTypePercentSignKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEArithmeticOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_5, null);
                      				
                    }

                    }
                    break;
                case 6 :
                    // InternalAlertingParser.g:1716:5: lv_type_0_6= CircumflexAccent
                    {
                    lv_type_0_6=(Token)match(input,CircumflexAccent,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_6, grammarAccess.getEArithmeticOperatorAccess().getTypeCircumflexAccentKeyword_0_5());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEArithmeticOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_6, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEArithmeticOperator"


    // $ANTLR start "entryRuleEComparisonOperator"
    // InternalAlertingParser.g:1732:1: entryRuleEComparisonOperator returns [EObject current=null] : iv_ruleEComparisonOperator= ruleEComparisonOperator EOF ;
    public final EObject entryRuleEComparisonOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComparisonOperator = null;


        try {
            // InternalAlertingParser.g:1732:60: (iv_ruleEComparisonOperator= ruleEComparisonOperator EOF )
            // InternalAlertingParser.g:1733:2: iv_ruleEComparisonOperator= ruleEComparisonOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEComparisonOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEComparisonOperator=ruleEComparisonOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEComparisonOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEComparisonOperator"


    // $ANTLR start "ruleEComparisonOperator"
    // InternalAlertingParser.g:1739:1: ruleEComparisonOperator returns [EObject current=null] : ( ( (lv_type_0_1= LessThanSign | lv_type_0_2= GreaterThanSign | lv_type_0_3= LessThanSignEqualsSign | lv_type_0_4= GreaterThanSignEqualsSign | lv_type_0_5= EqualsSignEqualsSign ) ) ) ;
    public final EObject ruleEComparisonOperator() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_type_0_4=null;
        Token lv_type_0_5=null;


        	enterRule();

        try {
            // InternalAlertingParser.g:1745:2: ( ( ( (lv_type_0_1= LessThanSign | lv_type_0_2= GreaterThanSign | lv_type_0_3= LessThanSignEqualsSign | lv_type_0_4= GreaterThanSignEqualsSign | lv_type_0_5= EqualsSignEqualsSign ) ) ) )
            // InternalAlertingParser.g:1746:2: ( ( (lv_type_0_1= LessThanSign | lv_type_0_2= GreaterThanSign | lv_type_0_3= LessThanSignEqualsSign | lv_type_0_4= GreaterThanSignEqualsSign | lv_type_0_5= EqualsSignEqualsSign ) ) )
            {
            // InternalAlertingParser.g:1746:2: ( ( (lv_type_0_1= LessThanSign | lv_type_0_2= GreaterThanSign | lv_type_0_3= LessThanSignEqualsSign | lv_type_0_4= GreaterThanSignEqualsSign | lv_type_0_5= EqualsSignEqualsSign ) ) )
            // InternalAlertingParser.g:1747:3: ( (lv_type_0_1= LessThanSign | lv_type_0_2= GreaterThanSign | lv_type_0_3= LessThanSignEqualsSign | lv_type_0_4= GreaterThanSignEqualsSign | lv_type_0_5= EqualsSignEqualsSign ) )
            {
            // InternalAlertingParser.g:1747:3: ( (lv_type_0_1= LessThanSign | lv_type_0_2= GreaterThanSign | lv_type_0_3= LessThanSignEqualsSign | lv_type_0_4= GreaterThanSignEqualsSign | lv_type_0_5= EqualsSignEqualsSign ) )
            // InternalAlertingParser.g:1748:4: (lv_type_0_1= LessThanSign | lv_type_0_2= GreaterThanSign | lv_type_0_3= LessThanSignEqualsSign | lv_type_0_4= GreaterThanSignEqualsSign | lv_type_0_5= EqualsSignEqualsSign )
            {
            // InternalAlertingParser.g:1748:4: (lv_type_0_1= LessThanSign | lv_type_0_2= GreaterThanSign | lv_type_0_3= LessThanSignEqualsSign | lv_type_0_4= GreaterThanSignEqualsSign | lv_type_0_5= EqualsSignEqualsSign )
            int alt22=5;
            switch ( input.LA(1) ) {
            case LessThanSign:
                {
                alt22=1;
                }
                break;
            case GreaterThanSign:
                {
                alt22=2;
                }
                break;
            case LessThanSignEqualsSign:
                {
                alt22=3;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt22=4;
                }
                break;
            case EqualsSignEqualsSign:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAlertingParser.g:1749:5: lv_type_0_1= LessThanSign
                    {
                    lv_type_0_1=(Token)match(input,LessThanSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_1, grammarAccess.getEComparisonOperatorAccess().getTypeLessThanSignKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEComparisonOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalAlertingParser.g:1760:5: lv_type_0_2= GreaterThanSign
                    {
                    lv_type_0_2=(Token)match(input,GreaterThanSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_2, grammarAccess.getEComparisonOperatorAccess().getTypeGreaterThanSignKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEComparisonOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalAlertingParser.g:1771:5: lv_type_0_3= LessThanSignEqualsSign
                    {
                    lv_type_0_3=(Token)match(input,LessThanSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_3, grammarAccess.getEComparisonOperatorAccess().getTypeLessThanSignEqualsSignKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEComparisonOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_3, null);
                      				
                    }

                    }
                    break;
                case 4 :
                    // InternalAlertingParser.g:1782:5: lv_type_0_4= GreaterThanSignEqualsSign
                    {
                    lv_type_0_4=(Token)match(input,GreaterThanSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_4, grammarAccess.getEComparisonOperatorAccess().getTypeGreaterThanSignEqualsSignKeyword_0_3());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEComparisonOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_4, null);
                      				
                    }

                    }
                    break;
                case 5 :
                    // InternalAlertingParser.g:1793:5: lv_type_0_5= EqualsSignEqualsSign
                    {
                    lv_type_0_5=(Token)match(input,EqualsSignEqualsSign,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_5, grammarAccess.getEComparisonOperatorAccess().getTypeEqualsSignEqualsSignKeyword_0_4());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEComparisonOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_5, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEComparisonOperator"


    // $ANTLR start "entryRuleEBinaryLogicOperator"
    // InternalAlertingParser.g:1809:1: entryRuleEBinaryLogicOperator returns [EObject current=null] : iv_ruleEBinaryLogicOperator= ruleEBinaryLogicOperator EOF ;
    public final EObject entryRuleEBinaryLogicOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBinaryLogicOperator = null;


        try {
            // InternalAlertingParser.g:1809:61: (iv_ruleEBinaryLogicOperator= ruleEBinaryLogicOperator EOF )
            // InternalAlertingParser.g:1810:2: iv_ruleEBinaryLogicOperator= ruleEBinaryLogicOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEBinaryLogicOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEBinaryLogicOperator=ruleEBinaryLogicOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEBinaryLogicOperator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEBinaryLogicOperator"


    // $ANTLR start "ruleEBinaryLogicOperator"
    // InternalAlertingParser.g:1816:1: ruleEBinaryLogicOperator returns [EObject current=null] : ( ( (lv_type_0_1= And | lv_type_0_2= Or | lv_type_0_3= Unless ) ) ) ;
    public final EObject ruleEBinaryLogicOperator() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;


        	enterRule();

        try {
            // InternalAlertingParser.g:1822:2: ( ( ( (lv_type_0_1= And | lv_type_0_2= Or | lv_type_0_3= Unless ) ) ) )
            // InternalAlertingParser.g:1823:2: ( ( (lv_type_0_1= And | lv_type_0_2= Or | lv_type_0_3= Unless ) ) )
            {
            // InternalAlertingParser.g:1823:2: ( ( (lv_type_0_1= And | lv_type_0_2= Or | lv_type_0_3= Unless ) ) )
            // InternalAlertingParser.g:1824:3: ( (lv_type_0_1= And | lv_type_0_2= Or | lv_type_0_3= Unless ) )
            {
            // InternalAlertingParser.g:1824:3: ( (lv_type_0_1= And | lv_type_0_2= Or | lv_type_0_3= Unless ) )
            // InternalAlertingParser.g:1825:4: (lv_type_0_1= And | lv_type_0_2= Or | lv_type_0_3= Unless )
            {
            // InternalAlertingParser.g:1825:4: (lv_type_0_1= And | lv_type_0_2= Or | lv_type_0_3= Unless )
            int alt23=3;
            switch ( input.LA(1) ) {
            case And:
                {
                alt23=1;
                }
                break;
            case Or:
                {
                alt23=2;
                }
                break;
            case Unless:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAlertingParser.g:1826:5: lv_type_0_1= And
                    {
                    lv_type_0_1=(Token)match(input,And,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_1, grammarAccess.getEBinaryLogicOperatorAccess().getTypeAndKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEBinaryLogicOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalAlertingParser.g:1837:5: lv_type_0_2= Or
                    {
                    lv_type_0_2=(Token)match(input,Or,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_2, grammarAccess.getEBinaryLogicOperatorAccess().getTypeOrKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEBinaryLogicOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalAlertingParser.g:1848:5: lv_type_0_3= Unless
                    {
                    lv_type_0_3=(Token)match(input,Unless,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_type_0_3, grammarAccess.getEBinaryLogicOperatorAccess().getTypeUnlessKeyword_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEBinaryLogicOperatorRule());
                      					}
                      					setWithLastConsumed(current, "type", lv_type_0_3, null);
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEBinaryLogicOperator"


    // $ANTLR start "entryRuleNUMBER"
    // InternalAlertingParser.g:1864:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalAlertingParser.g:1864:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalAlertingParser.g:1865:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalAlertingParser.g:1871:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= HyphenMinus )? this_INT_1= RULE_INT (kw= FullStop this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalAlertingParser.g:1877:2: ( ( (kw= HyphenMinus )? this_INT_1= RULE_INT (kw= FullStop this_INT_3= RULE_INT )? ) )
            // InternalAlertingParser.g:1878:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT (kw= FullStop this_INT_3= RULE_INT )? )
            {
            // InternalAlertingParser.g:1878:2: ( (kw= HyphenMinus )? this_INT_1= RULE_INT (kw= FullStop this_INT_3= RULE_INT )? )
            // InternalAlertingParser.g:1879:3: (kw= HyphenMinus )? this_INT_1= RULE_INT (kw= FullStop this_INT_3= RULE_INT )?
            {
            // InternalAlertingParser.g:1879:3: (kw= HyphenMinus )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==HyphenMinus) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAlertingParser.g:1880:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1());
              		
            }
            // InternalAlertingParser.g:1893:3: (kw= FullStop this_INT_3= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==FullStop) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAlertingParser.g:1894:4: kw= FullStop this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0());
                      			
                    }
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNUMBER"

    // $ANTLR start synpred1_InternalAlertingParser
    public final void synpred1_InternalAlertingParser_fragment() throws RecognitionException {   
        // InternalAlertingParser.g:546:4: ( ruleEVectorMatching )
        // InternalAlertingParser.g:546:5: ruleEVectorMatching
        {
        pushFollow(FOLLOW_2);
        ruleEVectorMatching();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalAlertingParser

    // Delegated rules

    public final boolean synpred1_InternalAlertingParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAlertingParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\23\1\0\10\uffff";
    static final String dfa_3s = "\1\61\1\0\10\uffff";
    static final String dfa_4s = "\2\uffff\1\2\6\uffff\1\1";
    static final String dfa_5s = "\1\uffff\1\0\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\4\uffff\1\2\14\uffff\1\2\1\uffff\1\2\1\uffff\3\2\5\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "544:2: ( ( ( ruleEVectorMatching )=>this_EVectorMatching_0= ruleEVectorMatching ) | this_EVectorExpr_1= ruleEVectorExpr )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalAlertingParser()) ) {s = 9;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00020EA001080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000400000000430L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000050016000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000255676900L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000000900000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00020EA001180000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000800800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001020009000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002000002L});

}