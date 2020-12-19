package org.sodalite.sdl.ansible.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.sodalite.sdl.ansible.services.AnsibleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnsibleDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_NUMBER", "RULE_NULL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'playbook{'", "'playbook_name:'", "'operation:'", "'plays{'", "'play{'", "'}'", "'play_name:'", "'no_log:'", "'debugger:'", "'always'", "'never'", "'on_failed'", "'on_unreachable'", "'on_skipped'", "'module_defaults:'", "'environment:'", "'collections:'", "'tags:'", "'vars{'", "','", "'play_exe_settings{'", "'error_handling{'", "'vars_files:'", "'vars_prompt:'", "'force_handlers:'", "'pre_tasks{'", "'tasks_list{'", "'post_tasks{'", "'handlers{'", "'block{'", "'block_name:'", "'exe_settings{'", "'when:'", "'tasks{'", "'rescue_tasks{'", "'always_tasks{'", "'task{'", "'task_name:'", "'action:'", "'asynchronous_settings{'", "'args:'", "'module_call{'", "'notify:'", "'handler{'", "'handler_name:'", "'listen:'", "'module_name:'", "'parameters{'", "':'", "'role{'", "'role_name:'", "'roles_inclusions{'", "'loop:'", "'loop_control{'", "'label:'", "'pause:'", "'index_var:'", "'loop_var:'", "'extended:'", "'until:'", "'retries:'", "'delay:'", "'privilage_escalation{'", "'become:'", "'become_exe:'", "'become_flags:'", "'become_method:'", "'become_user:'", "'validation_mode{'", "'check_mode:'", "'diff:'", "'connection_info{'", "'connection:'", "'port:'", "'remote_user:'", "'strategy:'", "'serial:'", "'order:'", "'throttle:'", "'run_once:'", "'any_errors_fatal:'", "'ignore_errors:'", "'ignore_unreachable:'", "'max_fail_percentage:'", "'changed_when:'", "'failed_when:'", "'facts_setttings{'", "'gather_facts:'", "'gather_subset:'", "'gather_timeout:'", "'fact_path:'", "'delegation{'", "'delegate_to:'", "'delegate_facts:'", "'async:'", "'poll:'", "'topic:'", "'item'", "'.'", "'['", "']'", "'{{'", "'}}'", "'('", "')'", "'|'", "'or'", "'and'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'/'", "'//'", "'%'", "'*'", "'**'", "'is'", "'not'", "'in'", "'return'", "'if'", "'else'", "'register:'", "'ansible_facts'", "'{'"
    };
    public static final int T__143=143;
    public static final int T__50=50;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=6;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=9;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_NULL=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=7;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalAnsibleDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnsibleDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnsibleDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAnsibleDsl.g"; }



     	private AnsibleDslGrammarAccess grammarAccess;

        public InternalAnsibleDslParser(TokenStream input, AnsibleDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected AnsibleDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalAnsibleDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAnsibleDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalAnsibleDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAnsibleDsl.g:71:1: ruleModel returns [EObject current=null] : this_EPlaybook_0= ruleEPlaybook ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_EPlaybook_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:77:2: (this_EPlaybook_0= ruleEPlaybook )
            // InternalAnsibleDsl.g:78:2: this_EPlaybook_0= ruleEPlaybook
            {

            		newCompositeNode(grammarAccess.getModelAccess().getEPlaybookParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_EPlaybook_0=ruleEPlaybook();

            state._fsp--;


            		current = this_EPlaybook_0;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEPlaybook"
    // InternalAnsibleDsl.g:89:1: entryRuleEPlaybook returns [EObject current=null] : iv_ruleEPlaybook= ruleEPlaybook EOF ;
    public final EObject entryRuleEPlaybook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlaybook = null;


        try {
            // InternalAnsibleDsl.g:89:50: (iv_ruleEPlaybook= ruleEPlaybook EOF )
            // InternalAnsibleDsl.g:90:2: iv_ruleEPlaybook= ruleEPlaybook EOF
            {
             newCompositeNode(grammarAccess.getEPlaybookRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPlaybook=ruleEPlaybook();

            state._fsp--;

             current =iv_ruleEPlaybook; 
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
    // $ANTLR end "entryRuleEPlaybook"


    // $ANTLR start "ruleEPlaybook"
    // InternalAnsibleDsl.g:96:1: ruleEPlaybook returns [EObject current=null] : (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'operation:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'plays{' (otherlv_6= 'play{' ( (lv_plays_7_0= ruleEPlay ) ) otherlv_8= '}' )+ otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleEPlaybook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_plays_7_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:102:2: ( (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'operation:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'plays{' (otherlv_6= 'play{' ( (lv_plays_7_0= ruleEPlay ) ) otherlv_8= '}' )+ otherlv_9= '}' otherlv_10= '}' ) )
            // InternalAnsibleDsl.g:103:2: (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'operation:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'plays{' (otherlv_6= 'play{' ( (lv_plays_7_0= ruleEPlay ) ) otherlv_8= '}' )+ otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalAnsibleDsl.g:103:2: (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'operation:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'plays{' (otherlv_6= 'play{' ( (lv_plays_7_0= ruleEPlay ) ) otherlv_8= '}' )+ otherlv_9= '}' otherlv_10= '}' )
            // InternalAnsibleDsl.g:104:3: otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'operation:' ( (otherlv_4= RULE_STRING ) ) otherlv_5= 'plays{' (otherlv_6= 'play{' ( (lv_plays_7_0= ruleEPlay ) ) otherlv_8= '}' )+ otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEPlaybookAccess().getPlaybookKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEPlaybookAccess().getPlaybook_nameKeyword_1());
            		
            // InternalAnsibleDsl.g:112:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:113:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:113:4: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:114:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEPlaybookAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPlaybookRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getEPlaybookAccess().getOperationKeyword_3());
            		
            // InternalAnsibleDsl.g:134:3: ( (otherlv_4= RULE_STRING ) )
            // InternalAnsibleDsl.g:135:4: (otherlv_4= RULE_STRING )
            {
            // InternalAnsibleDsl.g:135:4: (otherlv_4= RULE_STRING )
            // InternalAnsibleDsl.g:136:5: otherlv_4= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPlaybookRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(otherlv_4, grammarAccess.getEPlaybookAccess().getOperationEOperationDefinitionCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getEPlaybookAccess().getPlaysKeyword_5());
            		
            // InternalAnsibleDsl.g:151:3: (otherlv_6= 'play{' ( (lv_plays_7_0= ruleEPlay ) ) otherlv_8= '}' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnsibleDsl.g:152:4: otherlv_6= 'play{' ( (lv_plays_7_0= ruleEPlay ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEPlaybookAccess().getPlayKeyword_6_0());
            	    			
            	    // InternalAnsibleDsl.g:156:4: ( (lv_plays_7_0= ruleEPlay ) )
            	    // InternalAnsibleDsl.g:157:5: (lv_plays_7_0= ruleEPlay )
            	    {
            	    // InternalAnsibleDsl.g:157:5: (lv_plays_7_0= ruleEPlay )
            	    // InternalAnsibleDsl.g:158:6: lv_plays_7_0= ruleEPlay
            	    {

            	    						newCompositeNode(grammarAccess.getEPlaybookAccess().getPlaysEPlayParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_plays_7_0=ruleEPlay();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEPlaybookRule());
            	    						}
            	    						add(
            	    							current,
            	    							"plays",
            	    							lv_plays_7_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.EPlay");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,19,FOLLOW_10); 

            	    				newLeafNode(otherlv_8, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_6_2());
            	    			

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

            otherlv_9=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEPlaybook"


    // $ANTLR start "entryRuleEExecution"
    // InternalAnsibleDsl.g:192:1: entryRuleEExecution returns [EObject current=null] : iv_ruleEExecution= ruleEExecution EOF ;
    public final EObject entryRuleEExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecution = null;


        try {
            // InternalAnsibleDsl.g:192:51: (iv_ruleEExecution= ruleEExecution EOF )
            // InternalAnsibleDsl.g:193:2: iv_ruleEExecution= ruleEExecution EOF
            {
             newCompositeNode(grammarAccess.getEExecutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEExecution=ruleEExecution();

            state._fsp--;

             current =iv_ruleEExecution; 
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
    // $ANTLR end "entryRuleEExecution"


    // $ANTLR start "ruleEExecution"
    // InternalAnsibleDsl.g:199:1: ruleEExecution returns [EObject current=null] : (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion ) ;
    public final EObject ruleEExecution() throws RecognitionException {
        EObject current = null;

        EObject this_EBlock_0 = null;

        EObject this_ETaskHandler_1 = null;

        EObject this_ERoleInclusion_2 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:205:2: ( (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion ) )
            // InternalAnsibleDsl.g:206:2: (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion )
            {
            // InternalAnsibleDsl.g:206:2: (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt2=1;
                }
                break;
            case 50:
            case 57:
                {
                alt2=2;
                }
                break;
            case 63:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAnsibleDsl.g:207:3: this_EBlock_0= ruleEBlock
                    {

                    			newCompositeNode(grammarAccess.getEExecutionAccess().getEBlockParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EBlock_0=ruleEBlock();

                    state._fsp--;


                    			current = this_EBlock_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:216:3: this_ETaskHandler_1= ruleETaskHandler
                    {

                    			newCompositeNode(grammarAccess.getEExecutionAccess().getETaskHandlerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ETaskHandler_1=ruleETaskHandler();

                    state._fsp--;


                    			current = this_ETaskHandler_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:225:3: this_ERoleInclusion_2= ruleERoleInclusion
                    {

                    			newCompositeNode(grammarAccess.getEExecutionAccess().getERoleInclusionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ERoleInclusion_2=ruleERoleInclusion();

                    state._fsp--;


                    			current = this_ERoleInclusion_2;
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
    // $ANTLR end "ruleEExecution"


    // $ANTLR start "entryRuleEBlockTask"
    // InternalAnsibleDsl.g:237:1: entryRuleEBlockTask returns [EObject current=null] : iv_ruleEBlockTask= ruleEBlockTask EOF ;
    public final EObject entryRuleEBlockTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockTask = null;


        try {
            // InternalAnsibleDsl.g:237:51: (iv_ruleEBlockTask= ruleEBlockTask EOF )
            // InternalAnsibleDsl.g:238:2: iv_ruleEBlockTask= ruleEBlockTask EOF
            {
             newCompositeNode(grammarAccess.getEBlockTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBlockTask=ruleEBlockTask();

            state._fsp--;

             current =iv_ruleEBlockTask; 
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
    // $ANTLR end "entryRuleEBlockTask"


    // $ANTLR start "ruleEBlockTask"
    // InternalAnsibleDsl.g:244:1: ruleEBlockTask returns [EObject current=null] : (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask ) ;
    public final EObject ruleEBlockTask() throws RecognitionException {
        EObject current = null;

        EObject this_EBlock_0 = null;

        EObject this_ETask_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:250:2: ( (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask ) )
            // InternalAnsibleDsl.g:251:2: (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask )
            {
            // InternalAnsibleDsl.g:251:2: (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==43) ) {
                alt3=1;
            }
            else if ( (LA3_0==50) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAnsibleDsl.g:252:3: this_EBlock_0= ruleEBlock
                    {

                    			newCompositeNode(grammarAccess.getEBlockTaskAccess().getEBlockParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EBlock_0=ruleEBlock();

                    state._fsp--;


                    			current = this_EBlock_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:261:3: this_ETask_1= ruleETask
                    {

                    			newCompositeNode(grammarAccess.getEBlockTaskAccess().getETaskParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ETask_1=ruleETask();

                    state._fsp--;


                    			current = this_ETask_1;
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
    // $ANTLR end "ruleEBlockTask"


    // $ANTLR start "entryRuleETaskHandler"
    // InternalAnsibleDsl.g:273:1: entryRuleETaskHandler returns [EObject current=null] : iv_ruleETaskHandler= ruleETaskHandler EOF ;
    public final EObject entryRuleETaskHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandler = null;


        try {
            // InternalAnsibleDsl.g:273:53: (iv_ruleETaskHandler= ruleETaskHandler EOF )
            // InternalAnsibleDsl.g:274:2: iv_ruleETaskHandler= ruleETaskHandler EOF
            {
             newCompositeNode(grammarAccess.getETaskHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETaskHandler=ruleETaskHandler();

            state._fsp--;

             current =iv_ruleETaskHandler; 
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
    // $ANTLR end "entryRuleETaskHandler"


    // $ANTLR start "ruleETaskHandler"
    // InternalAnsibleDsl.g:280:1: ruleETaskHandler returns [EObject current=null] : (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler ) ;
    public final EObject ruleETaskHandler() throws RecognitionException {
        EObject current = null;

        EObject this_ETask_0 = null;

        EObject this_EHandler_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:286:2: ( (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler ) )
            // InternalAnsibleDsl.g:287:2: (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler )
            {
            // InternalAnsibleDsl.g:287:2: (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==50) ) {
                alt4=1;
            }
            else if ( (LA4_0==57) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAnsibleDsl.g:288:3: this_ETask_0= ruleETask
                    {

                    			newCompositeNode(grammarAccess.getETaskHandlerAccess().getETaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ETask_0=ruleETask();

                    state._fsp--;


                    			current = this_ETask_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:297:3: this_EHandler_1= ruleEHandler
                    {

                    			newCompositeNode(grammarAccess.getETaskHandlerAccess().getEHandlerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EHandler_1=ruleEHandler();

                    state._fsp--;


                    			current = this_EHandler_1;
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
    // $ANTLR end "ruleETaskHandler"


    // $ANTLR start "entryRuleEPlay"
    // InternalAnsibleDsl.g:309:1: entryRuleEPlay returns [EObject current=null] : iv_ruleEPlay= ruleEPlay EOF ;
    public final EObject entryRuleEPlay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlay = null;


        try {
            // InternalAnsibleDsl.g:309:46: (iv_ruleEPlay= ruleEPlay EOF )
            // InternalAnsibleDsl.g:310:2: iv_ruleEPlay= ruleEPlay EOF
            {
             newCompositeNode(grammarAccess.getEPlayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPlay=ruleEPlay();

            state._fsp--;

             current =iv_ruleEPlay; 
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
    // $ANTLR end "entryRuleEPlay"


    // $ANTLR start "ruleEPlay"
    // InternalAnsibleDsl.g:316:1: ruleEPlay returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEPlay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_6=null;
        Token lv_no_log_7_0=null;
        Token otherlv_8=null;
        Token lv_debugger_9_1=null;
        Token lv_debugger_9_2=null;
        Token lv_debugger_9_3=null;
        Token lv_debugger_9_4=null;
        Token lv_debugger_9_5=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token lv_force_handlers_35_0=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        EObject lv_privilage_escalation_3_0 = null;

        EObject lv_validation_mode_4_0 = null;

        EObject lv_connection_5_0 = null;

        EObject lv_module_defaults_11_0 = null;

        EObject lv_environment_13_0 = null;

        EObject lv_collections_15_0 = null;

        EObject lv_tags_17_0 = null;

        EObject lv_variable_declarations_19_0 = null;

        EObject lv_variable_declarations_21_0 = null;

        EObject lv_play_exe_settings_24_0 = null;

        EObject lv_error_handling_27_0 = null;

        EObject lv_facts_settings_29_0 = null;

        EObject lv_vars_files_31_0 = null;

        EObject lv_vars_prompt_33_0 = null;

        EObject lv_pre_tasks_list_37_0 = null;

        EObject lv_roles_inclusions_39_0 = null;

        EObject lv_tasks_list_41_0 = null;

        EObject lv_post_tasks_list_44_0 = null;

        EObject lv_handlers_47_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:322:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:323:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:323:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:324:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:324:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:325:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:328:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:329:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:329:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=10;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // InternalAnsibleDsl.g:330:3: ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:330:3: ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:331:4: {...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:331:99: ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:332:5: ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:335:8: ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) )
            	    // InternalAnsibleDsl.g:335:9: {...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:335:18: ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? )
            	    // InternalAnsibleDsl.g:335:19: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )?
            	    {
            	    // InternalAnsibleDsl.g:335:19: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:336:9: otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_1, grammarAccess.getEPlayAccess().getPlay_nameKeyword_0_0_0());
            	    								
            	    // InternalAnsibleDsl.g:340:9: ( (lv_name_2_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:341:10: (lv_name_2_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:341:10: (lv_name_2_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:342:11: lv_name_2_0= RULE_STRING
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    											newLeafNode(lv_name_2_0, grammarAccess.getEPlayAccess().getNameSTRINGTerminalRuleCall_0_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEPlayRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"name",
            	    												lv_name_2_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }

            	    // InternalAnsibleDsl.g:359:8: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==76) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:360:9: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
            	            {
            	            // InternalAnsibleDsl.g:360:9: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
            	            // InternalAnsibleDsl.g:361:10: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
            	            {

            	            										newCompositeNode(grammarAccess.getEPlayAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_0_1_0());
            	            									
            	            pushFollow(FOLLOW_12);
            	            lv_privilage_escalation_3_0=ruleEPrivilageEscalation();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            										}
            	            										set(
            	            											current,
            	            											"privilage_escalation",
            	            											lv_privilage_escalation_3_0,
            	            											"org.sodalite.sdl.ansible.AnsibleDsl.EPrivilageEscalation");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:378:8: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==82) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:379:9: (lv_validation_mode_4_0= ruleEValidationMode )
            	            {
            	            // InternalAnsibleDsl.g:379:9: (lv_validation_mode_4_0= ruleEValidationMode )
            	            // InternalAnsibleDsl.g:380:10: lv_validation_mode_4_0= ruleEValidationMode
            	            {

            	            										newCompositeNode(grammarAccess.getEPlayAccess().getValidation_modeEValidationModeParserRuleCall_0_2_0());
            	            									
            	            pushFollow(FOLLOW_13);
            	            lv_validation_mode_4_0=ruleEValidationMode();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            										}
            	            										set(
            	            											current,
            	            											"validation_mode",
            	            											lv_validation_mode_4_0,
            	            											"org.sodalite.sdl.ansible.AnsibleDsl.EValidationMode");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:397:8: ( (lv_connection_5_0= ruleEConnection ) )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==85) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:398:9: (lv_connection_5_0= ruleEConnection )
            	            {
            	            // InternalAnsibleDsl.g:398:9: (lv_connection_5_0= ruleEConnection )
            	            // InternalAnsibleDsl.g:399:10: lv_connection_5_0= ruleEConnection
            	            {

            	            										newCompositeNode(grammarAccess.getEPlayAccess().getConnectionEConnectionParserRuleCall_0_3_0());
            	            									
            	            pushFollow(FOLLOW_14);
            	            lv_connection_5_0=ruleEConnection();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            										}
            	            										set(
            	            											current,
            	            											"connection",
            	            											lv_connection_5_0,
            	            											"org.sodalite.sdl.ansible.AnsibleDsl.EConnection");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:416:8: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==21) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:417:9: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
            	            {
            	            otherlv_6=(Token)match(input,21,FOLLOW_15); 

            	            									newLeafNode(otherlv_6, grammarAccess.getEPlayAccess().getNo_logKeyword_0_4_0());
            	            								
            	            // InternalAnsibleDsl.g:421:9: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
            	            // InternalAnsibleDsl.g:422:10: (lv_no_log_7_0= RULE_BOOLEAN )
            	            {
            	            // InternalAnsibleDsl.g:422:10: (lv_no_log_7_0= RULE_BOOLEAN )
            	            // InternalAnsibleDsl.g:423:11: lv_no_log_7_0= RULE_BOOLEAN
            	            {
            	            lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_16); 

            	            											newLeafNode(lv_no_log_7_0, grammarAccess.getEPlayAccess().getNo_logBOOLEANTerminalRuleCall_0_4_1_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getEPlayRule());
            	            											}
            	            											setWithLastConsumed(
            	            												current,
            	            												"no_log",
            	            												lv_no_log_7_0,
            	            												"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:440:8: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==22) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:441:9: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
            	            {
            	            otherlv_8=(Token)match(input,22,FOLLOW_17); 

            	            									newLeafNode(otherlv_8, grammarAccess.getEPlayAccess().getDebuggerKeyword_0_5_0());
            	            								
            	            // InternalAnsibleDsl.g:445:9: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
            	            // InternalAnsibleDsl.g:446:10: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
            	            {
            	            // InternalAnsibleDsl.g:446:10: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
            	            // InternalAnsibleDsl.g:447:11: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
            	            {
            	            // InternalAnsibleDsl.g:447:11: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
            	            int alt9=5;
            	            switch ( input.LA(1) ) {
            	            case 23:
            	                {
            	                alt9=1;
            	                }
            	                break;
            	            case 24:
            	                {
            	                alt9=2;
            	                }
            	                break;
            	            case 25:
            	                {
            	                alt9=3;
            	                }
            	                break;
            	            case 26:
            	                {
            	                alt9=4;
            	                }
            	                break;
            	            case 27:
            	                {
            	                alt9=5;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 9, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt9) {
            	                case 1 :
            	                    // InternalAnsibleDsl.g:448:12: lv_debugger_9_1= 'always'
            	                    {
            	                    lv_debugger_9_1=(Token)match(input,23,FOLLOW_18); 

            	                    												newLeafNode(lv_debugger_9_1, grammarAccess.getEPlayAccess().getDebuggerAlwaysKeyword_0_5_1_0_0());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
            	                    											

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalAnsibleDsl.g:459:12: lv_debugger_9_2= 'never'
            	                    {
            	                    lv_debugger_9_2=(Token)match(input,24,FOLLOW_18); 

            	                    												newLeafNode(lv_debugger_9_2, grammarAccess.getEPlayAccess().getDebuggerNeverKeyword_0_5_1_0_1());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
            	                    											

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalAnsibleDsl.g:470:12: lv_debugger_9_3= 'on_failed'
            	                    {
            	                    lv_debugger_9_3=(Token)match(input,25,FOLLOW_18); 

            	                    												newLeafNode(lv_debugger_9_3, grammarAccess.getEPlayAccess().getDebuggerOn_failedKeyword_0_5_1_0_2());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
            	                    											

            	                    }
            	                    break;
            	                case 4 :
            	                    // InternalAnsibleDsl.g:481:12: lv_debugger_9_4= 'on_unreachable'
            	                    {
            	                    lv_debugger_9_4=(Token)match(input,26,FOLLOW_18); 

            	                    												newLeafNode(lv_debugger_9_4, grammarAccess.getEPlayAccess().getDebuggerOn_unreachableKeyword_0_5_1_0_3());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
            	                    											

            	                    }
            	                    break;
            	                case 5 :
            	                    // InternalAnsibleDsl.g:492:12: lv_debugger_9_5= 'on_skipped'
            	                    {
            	                    lv_debugger_9_5=(Token)match(input,27,FOLLOW_18); 

            	                    												newLeafNode(lv_debugger_9_5, grammarAccess.getEPlayAccess().getDebuggerOn_skippedKeyword_0_5_1_0_4());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_5, null);
            	                    											

            	                    }
            	                    break;

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:506:8: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==28) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:507:9: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
            	            {
            	            otherlv_10=(Token)match(input,28,FOLLOW_19); 

            	            									newLeafNode(otherlv_10, grammarAccess.getEPlayAccess().getModule_defaultsKeyword_0_6_0());
            	            								
            	            // InternalAnsibleDsl.g:511:9: ( (lv_module_defaults_11_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:512:10: (lv_module_defaults_11_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:512:10: (lv_module_defaults_11_0= ruleEList )
            	            // InternalAnsibleDsl.g:513:11: lv_module_defaults_11_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getModule_defaultsEListParserRuleCall_0_6_1_0());
            	            										
            	            pushFollow(FOLLOW_20);
            	            lv_module_defaults_11_0=ruleEList();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            											}
            	            											set(
            	            												current,
            	            												"module_defaults",
            	            												lv_module_defaults_11_0,
            	            												"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:531:8: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==29) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:532:9: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
            	            {
            	            otherlv_12=(Token)match(input,29,FOLLOW_19); 

            	            									newLeafNode(otherlv_12, grammarAccess.getEPlayAccess().getEnvironmentKeyword_0_7_0());
            	            								
            	            // InternalAnsibleDsl.g:536:9: ( (lv_environment_13_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:537:10: (lv_environment_13_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:537:10: (lv_environment_13_0= ruleEList )
            	            // InternalAnsibleDsl.g:538:11: lv_environment_13_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getEnvironmentEListParserRuleCall_0_7_1_0());
            	            										
            	            pushFollow(FOLLOW_21);
            	            lv_environment_13_0=ruleEList();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            											}
            	            											set(
            	            												current,
            	            												"environment",
            	            												lv_environment_13_0,
            	            												"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:556:8: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==30) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:557:9: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
            	            {
            	            otherlv_14=(Token)match(input,30,FOLLOW_19); 

            	            									newLeafNode(otherlv_14, grammarAccess.getEPlayAccess().getCollectionsKeyword_0_8_0());
            	            								
            	            // InternalAnsibleDsl.g:561:9: ( (lv_collections_15_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:562:10: (lv_collections_15_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:562:10: (lv_collections_15_0= ruleEList )
            	            // InternalAnsibleDsl.g:563:11: lv_collections_15_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getCollectionsEListParserRuleCall_0_8_1_0());
            	            										
            	            pushFollow(FOLLOW_22);
            	            lv_collections_15_0=ruleEList();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            											}
            	            											set(
            	            												current,
            	            												"collections",
            	            												lv_collections_15_0,
            	            												"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:581:8: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==31) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:582:9: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
            	            {
            	            otherlv_16=(Token)match(input,31,FOLLOW_19); 

            	            									newLeafNode(otherlv_16, grammarAccess.getEPlayAccess().getTagsKeyword_0_9_0());
            	            								
            	            // InternalAnsibleDsl.g:586:9: ( (lv_tags_17_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:587:10: (lv_tags_17_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:587:10: (lv_tags_17_0= ruleEList )
            	            // InternalAnsibleDsl.g:588:11: lv_tags_17_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getTagsEListParserRuleCall_0_9_1_0());
            	            										
            	            pushFollow(FOLLOW_23);
            	            lv_tags_17_0=ruleEList();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            											}
            	            											set(
            	            												current,
            	            												"tags",
            	            												lv_tags_17_0,
            	            												"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:606:8: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==32) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:607:9: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
            	            {
            	            otherlv_18=(Token)match(input,32,FOLLOW_24); 

            	            									newLeafNode(otherlv_18, grammarAccess.getEPlayAccess().getVarsKeyword_0_10_0());
            	            								
            	            // InternalAnsibleDsl.g:611:9: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
            	            // InternalAnsibleDsl.g:612:10: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
            	            {
            	            // InternalAnsibleDsl.g:612:10: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
            	            // InternalAnsibleDsl.g:613:11: lv_variable_declarations_19_0= ruleEVariableDeclaration
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_0_10_1_0());
            	            										
            	            pushFollow(FOLLOW_25);
            	            lv_variable_declarations_19_0=ruleEVariableDeclaration();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            											}
            	            											add(
            	            												current,
            	            												"variable_declarations",
            	            												lv_variable_declarations_19_0,
            	            												"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            // InternalAnsibleDsl.g:630:9: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
            	            loop15:
            	            do {
            	                int alt15=2;
            	                int LA15_0 = input.LA(1);

            	                if ( (LA15_0==33) ) {
            	                    alt15=1;
            	                }


            	                switch (alt15) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:631:10: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
            	            	    {
            	            	    otherlv_20=(Token)match(input,33,FOLLOW_24); 

            	            	    										newLeafNode(otherlv_20, grammarAccess.getEPlayAccess().getCommaKeyword_0_10_2_0());
            	            	    									
            	            	    // InternalAnsibleDsl.g:635:10: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
            	            	    // InternalAnsibleDsl.g:636:11: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
            	            	    {
            	            	    // InternalAnsibleDsl.g:636:11: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
            	            	    // InternalAnsibleDsl.g:637:12: lv_variable_declarations_21_0= ruleEVariableDeclaration
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getEPlayAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_0_10_2_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_25);
            	            	    lv_variable_declarations_21_0=ruleEVariableDeclaration();

            	            	    state._fsp--;


            	            	    												if (current==null) {
            	            	    													current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            	    												}
            	            	    												add(
            	            	    													current,
            	            	    													"variable_declarations",
            	            	    													lv_variable_declarations_21_0,
            	            	    													"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
            	            	    												afterParserOrEnumRuleCall();
            	            	    											

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop15;
            	                }
            	            } while (true);

            	            otherlv_22=(Token)match(input,19,FOLLOW_26); 

            	            									newLeafNode(otherlv_22, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_0_10_3());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:660:8: (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==34) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:661:9: otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}'
            	            {
            	            otherlv_23=(Token)match(input,34,FOLLOW_27); 

            	            									newLeafNode(otherlv_23, grammarAccess.getEPlayAccess().getPlay_exe_settingsKeyword_0_11_0());
            	            								
            	            // InternalAnsibleDsl.g:665:9: ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) )
            	            // InternalAnsibleDsl.g:666:10: (lv_play_exe_settings_24_0= ruleEPlayExeSettings )
            	            {
            	            // InternalAnsibleDsl.g:666:10: (lv_play_exe_settings_24_0= ruleEPlayExeSettings )
            	            // InternalAnsibleDsl.g:667:11: lv_play_exe_settings_24_0= ruleEPlayExeSettings
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getPlay_exe_settingsEPlayExeSettingsParserRuleCall_0_11_1_0());
            	            										
            	            pushFollow(FOLLOW_9);
            	            lv_play_exe_settings_24_0=ruleEPlayExeSettings();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            											}
            	            											set(
            	            												current,
            	            												"play_exe_settings",
            	            												lv_play_exe_settings_24_0,
            	            												"org.sodalite.sdl.ansible.AnsibleDsl.EPlayExeSettings");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            otherlv_25=(Token)match(input,19,FOLLOW_28); 

            	            									newLeafNode(otherlv_25, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_0_11_2());
            	            								

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:695:3: ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:695:3: ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:696:4: {...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:696:99: ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) )
            	    // InternalAnsibleDsl.g:697:5: ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:700:8: ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) )
            	    // InternalAnsibleDsl.g:700:9: {...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:700:18: (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' )
            	    // InternalAnsibleDsl.g:700:19: otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}'
            	    {
            	    otherlv_26=(Token)match(input,35,FOLLOW_29); 

            	    								newLeafNode(otherlv_26, grammarAccess.getEPlayAccess().getError_handlingKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:704:8: ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) )
            	    // InternalAnsibleDsl.g:705:9: (lv_error_handling_27_0= ruleEPlayErrorHandling )
            	    {
            	    // InternalAnsibleDsl.g:705:9: (lv_error_handling_27_0= ruleEPlayErrorHandling )
            	    // InternalAnsibleDsl.g:706:10: lv_error_handling_27_0= ruleEPlayErrorHandling
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getError_handlingEPlayErrorHandlingParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_error_handling_27_0=ruleEPlayErrorHandling();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"error_handling",
            	    											lv_error_handling_27_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EPlayErrorHandling");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_28=(Token)match(input,19,FOLLOW_28); 

            	    								newLeafNode(otherlv_28, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:733:3: ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:733:3: ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) )
            	    // InternalAnsibleDsl.g:734:4: {...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:734:99: ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) )
            	    // InternalAnsibleDsl.g:735:5: ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:738:8: ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) )
            	    // InternalAnsibleDsl.g:738:9: {...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:738:18: ( (lv_facts_settings_29_0= ruleEFactsSettings ) )
            	    // InternalAnsibleDsl.g:738:19: (lv_facts_settings_29_0= ruleEFactsSettings )
            	    {
            	    // InternalAnsibleDsl.g:738:19: (lv_facts_settings_29_0= ruleEFactsSettings )
            	    // InternalAnsibleDsl.g:739:9: lv_facts_settings_29_0= ruleEFactsSettings
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getFacts_settingsEFactsSettingsParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_28);
            	    lv_facts_settings_29_0=ruleEFactsSettings();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    									}
            	    									set(
            	    										current,
            	    										"facts_settings",
            	    										lv_facts_settings_29_0,
            	    										"org.sodalite.sdl.ansible.AnsibleDsl.EFactsSettings");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:761:3: ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:761:3: ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:762:4: {...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:762:99: ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:763:5: ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:766:8: ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:766:9: {...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:766:18: (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:766:19: otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) )
            	    {
            	    otherlv_30=(Token)match(input,36,FOLLOW_19); 

            	    								newLeafNode(otherlv_30, grammarAccess.getEPlayAccess().getVars_filesKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:770:8: ( (lv_vars_files_31_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:771:9: (lv_vars_files_31_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:771:9: (lv_vars_files_31_0= ruleEList )
            	    // InternalAnsibleDsl.g:772:10: lv_vars_files_31_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_filesEListParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_28);
            	    lv_vars_files_31_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"vars_files",
            	    											lv_vars_files_31_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAnsibleDsl.g:795:3: ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:795:3: ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:796:4: {...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:796:99: ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:797:5: ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:800:8: ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:800:9: {...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:800:18: (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:800:19: otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) )
            	    {
            	    otherlv_32=(Token)match(input,37,FOLLOW_19); 

            	    								newLeafNode(otherlv_32, grammarAccess.getEPlayAccess().getVars_promptKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:804:8: ( (lv_vars_prompt_33_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:805:9: (lv_vars_prompt_33_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:805:9: (lv_vars_prompt_33_0= ruleEList )
            	    // InternalAnsibleDsl.g:806:10: lv_vars_prompt_33_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_promptEListParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_28);
            	    lv_vars_prompt_33_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"vars_prompt",
            	    											lv_vars_prompt_33_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAnsibleDsl.g:829:3: ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:829:3: ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:830:4: {...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:830:99: ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:831:5: ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:834:8: ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:834:9: {...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:834:18: (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:834:19: otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_34=(Token)match(input,38,FOLLOW_15); 

            	    								newLeafNode(otherlv_34, grammarAccess.getEPlayAccess().getForce_handlersKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:838:8: ( (lv_force_handlers_35_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:839:9: (lv_force_handlers_35_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:839:9: (lv_force_handlers_35_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:840:10: lv_force_handlers_35_0= RULE_BOOLEAN
            	    {
            	    lv_force_handlers_35_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_28); 

            	    										newLeafNode(lv_force_handlers_35_0, grammarAccess.getEPlayAccess().getForce_handlersBOOLEANTerminalRuleCall_5_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPlayRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"force_handlers",
            	    											lv_force_handlers_35_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAnsibleDsl.g:862:3: ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:862:3: ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:863:4: {...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:863:99: ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) )
            	    // InternalAnsibleDsl.g:864:5: ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:867:8: ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) )
            	    // InternalAnsibleDsl.g:867:9: {...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:867:18: (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' )
            	    // InternalAnsibleDsl.g:867:19: otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}'
            	    {
            	    otherlv_36=(Token)match(input,39,FOLLOW_30); 

            	    								newLeafNode(otherlv_36, grammarAccess.getEPlayAccess().getPre_tasksKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:871:8: ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==43||LA18_0==50) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:872:9: (lv_pre_tasks_list_37_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:872:9: (lv_pre_tasks_list_37_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:873:10: lv_pre_tasks_list_37_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getPre_tasks_listEBlockTaskParserRuleCall_6_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_31);
            	    	    lv_pre_tasks_list_37_0=ruleEBlockTask();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"pre_tasks_list",
            	    	    											lv_pre_tasks_list_37_0,
            	    	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBlockTask");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

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

            	    otherlv_38=(Token)match(input,19,FOLLOW_28); 

            	    								newLeafNode(otherlv_38, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_6_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAnsibleDsl.g:900:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:900:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) )
            	    // InternalAnsibleDsl.g:901:4: {...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:901:99: ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) )
            	    // InternalAnsibleDsl.g:902:5: ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:905:8: ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) )
            	    // InternalAnsibleDsl.g:905:9: {...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:905:18: ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) )
            	    // InternalAnsibleDsl.g:905:19: (lv_roles_inclusions_39_0= ruleERoleInclusions )
            	    {
            	    // InternalAnsibleDsl.g:905:19: (lv_roles_inclusions_39_0= ruleERoleInclusions )
            	    // InternalAnsibleDsl.g:906:9: lv_roles_inclusions_39_0= ruleERoleInclusions
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getRoles_inclusionsERoleInclusionsParserRuleCall_7_0());
            	    								
            	    pushFollow(FOLLOW_28);
            	    lv_roles_inclusions_39_0=ruleERoleInclusions();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    									}
            	    									set(
            	    										current,
            	    										"roles_inclusions",
            	    										lv_roles_inclusions_39_0,
            	    										"org.sodalite.sdl.ansible.AnsibleDsl.ERoleInclusions");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalAnsibleDsl.g:928:3: ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:928:3: ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:929:4: {...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAnsibleDsl.g:929:99: ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:930:5: ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAnsibleDsl.g:933:8: ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) )
            	    // InternalAnsibleDsl.g:933:9: {...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:933:18: (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? )
            	    // InternalAnsibleDsl.g:933:19: otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )?
            	    {
            	    otherlv_40=(Token)match(input,40,FOLLOW_30); 

            	    								newLeafNode(otherlv_40, grammarAccess.getEPlayAccess().getTasks_listKeyword_8_0());
            	    							
            	    // InternalAnsibleDsl.g:937:8: ( (lv_tasks_list_41_0= ruleEBlockTask ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==43||LA19_0==50) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:938:9: (lv_tasks_list_41_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:938:9: (lv_tasks_list_41_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:939:10: lv_tasks_list_41_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getTasks_listEBlockTaskParserRuleCall_8_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_31);
            	    	    lv_tasks_list_41_0=ruleEBlockTask();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"tasks_list",
            	    	    											lv_tasks_list_41_0,
            	    	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBlockTask");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	    otherlv_42=(Token)match(input,19,FOLLOW_32); 

            	    								newLeafNode(otherlv_42, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_2());
            	    							
            	    // InternalAnsibleDsl.g:960:8: (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==41) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:961:9: otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}'
            	            {
            	            otherlv_43=(Token)match(input,41,FOLLOW_30); 

            	            									newLeafNode(otherlv_43, grammarAccess.getEPlayAccess().getPost_tasksKeyword_8_3_0());
            	            								
            	            // InternalAnsibleDsl.g:965:9: ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+
            	            int cnt20=0;
            	            loop20:
            	            do {
            	                int alt20=2;
            	                int LA20_0 = input.LA(1);

            	                if ( (LA20_0==43||LA20_0==50) ) {
            	                    alt20=1;
            	                }


            	                switch (alt20) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:966:10: (lv_post_tasks_list_44_0= ruleEBlockTask )
            	            	    {
            	            	    // InternalAnsibleDsl.g:966:10: (lv_post_tasks_list_44_0= ruleEBlockTask )
            	            	    // InternalAnsibleDsl.g:967:11: lv_post_tasks_list_44_0= ruleEBlockTask
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getEPlayAccess().getPost_tasks_listEBlockTaskParserRuleCall_8_3_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_31);
            	            	    lv_post_tasks_list_44_0=ruleEBlockTask();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"post_tasks_list",
            	            	    												lv_post_tasks_list_44_0,
            	            	    												"org.sodalite.sdl.ansible.AnsibleDsl.EBlockTask");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt20 >= 1 ) break loop20;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(20, input);
            	                        throw eee;
            	                }
            	                cnt20++;
            	            } while (true);

            	            otherlv_45=(Token)match(input,19,FOLLOW_33); 

            	            									newLeafNode(otherlv_45, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_3_2());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:989:8: (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==42) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:990:9: otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}'
            	            {
            	            otherlv_46=(Token)match(input,42,FOLLOW_34); 

            	            									newLeafNode(otherlv_46, grammarAccess.getEPlayAccess().getHandlersKeyword_8_4_0());
            	            								
            	            // InternalAnsibleDsl.g:994:9: ( (lv_handlers_47_0= ruleEHandler ) )+
            	            int cnt22=0;
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==57) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:995:10: (lv_handlers_47_0= ruleEHandler )
            	            	    {
            	            	    // InternalAnsibleDsl.g:995:10: (lv_handlers_47_0= ruleEHandler )
            	            	    // InternalAnsibleDsl.g:996:11: lv_handlers_47_0= ruleEHandler
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getEPlayAccess().getHandlersEHandlerParserRuleCall_8_4_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_35);
            	            	    lv_handlers_47_0=ruleEHandler();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"handlers",
            	            	    												lv_handlers_47_0,
            	            	    												"org.sodalite.sdl.ansible.AnsibleDsl.EHandler");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt22 >= 1 ) break loop22;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(22, input);
            	                        throw eee;
            	                }
            	                cnt22++;
            	            } while (true);

            	            otherlv_48=(Token)match(input,19,FOLLOW_28); 

            	            									newLeafNode(otherlv_48, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_4_2());
            	            								

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEPlayAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canLeave(grammarAccess.getEPlayAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEPlayAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleEPlay"


    // $ANTLR start "entryRuleEBlock"
    // InternalAnsibleDsl.g:1035:1: entryRuleEBlock returns [EObject current=null] : iv_ruleEBlock= ruleEBlock EOF ;
    public final EObject entryRuleEBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlock = null;


        try {
            // InternalAnsibleDsl.g:1035:47: (iv_ruleEBlock= ruleEBlock EOF )
            // InternalAnsibleDsl.g:1036:2: iv_ruleEBlock= ruleEBlock EOF
            {
             newCompositeNode(grammarAccess.getEBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBlock=ruleEBlock();

            state._fsp--;

             current =iv_ruleEBlock; 
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
    // $ANTLR end "entryRuleEBlock"


    // $ANTLR start "ruleEBlock"
    // InternalAnsibleDsl.g:1042:1: ruleEBlock returns [EObject current=null] : (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' ) ;
    public final EObject ruleEBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_6=null;
        Token lv_no_log_7_0=null;
        Token otherlv_8=null;
        Token lv_debugger_9_1=null;
        Token lv_debugger_9_2=null;
        Token lv_debugger_9_3=null;
        Token lv_debugger_9_4=null;
        Token lv_debugger_9_5=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        EObject lv_privilage_escalation_3_0 = null;

        EObject lv_validation_mode_4_0 = null;

        EObject lv_connection_5_0 = null;

        EObject lv_module_defaults_11_0 = null;

        EObject lv_environment_13_0 = null;

        EObject lv_collections_15_0 = null;

        EObject lv_tags_17_0 = null;

        EObject lv_variable_declarations_19_0 = null;

        EObject lv_variable_declarations_21_0 = null;

        EObject lv_exe_settings_24_0 = null;

        EObject lv_delegation_26_0 = null;

        EObject lv_when_expression_28_0 = null;

        EObject lv_error_handling_30_0 = null;

        EObject lv_tasks_33_0 = null;

        EObject lv_rescue_tasks_36_0 = null;

        EObject lv_always_tasks_39_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1048:2: ( (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' ) )
            // InternalAnsibleDsl.g:1049:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' )
            {
            // InternalAnsibleDsl.g:1049:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' )
            // InternalAnsibleDsl.g:1050:3: otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getEBlockAccess().getBlockKeyword_0());
            		
            // InternalAnsibleDsl.g:1054:3: (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:1055:4: otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,44,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEBlockAccess().getBlock_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:1059:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:1060:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:1060:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:1061:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            						newLeafNode(lv_name_2_0, grammarAccess.getEBlockAccess().getNameSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEBlockRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_2_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalAnsibleDsl.g:1078:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==76) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAnsibleDsl.g:1079:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:1079:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:1080:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_38);
                    lv_privilage_escalation_3_0=ruleEPrivilageEscalation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEBlockRule());
                    					}
                    					set(
                    						current,
                    						"privilage_escalation",
                    						lv_privilage_escalation_3_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EPrivilageEscalation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1097:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==82) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAnsibleDsl.g:1098:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:1098:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:1099:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_39);
                    lv_validation_mode_4_0=ruleEValidationMode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEBlockRule());
                    					}
                    					set(
                    						current,
                    						"validation_mode",
                    						lv_validation_mode_4_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EValidationMode");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1116:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==85) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAnsibleDsl.g:1117:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:1117:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:1118:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_connection_5_0=ruleEConnection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEBlockRule());
                    					}
                    					set(
                    						current,
                    						"connection",
                    						lv_connection_5_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EConnection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1135:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAnsibleDsl.g:1136:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getEBlockAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:1140:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:1141:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:1141:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:1142:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_41); 

                    						newLeafNode(lv_no_log_7_0, grammarAccess.getEBlockAccess().getNo_logBOOLEANTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEBlockRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"no_log",
                    							lv_no_log_7_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1159:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnsibleDsl.g:1160:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getEBlockAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:1164:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:1165:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:1165:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:1166:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:1166:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt29=5;
                    switch ( input.LA(1) ) {
                    case 23:
                        {
                        alt29=1;
                        }
                        break;
                    case 24:
                        {
                        alt29=2;
                        }
                        break;
                    case 25:
                        {
                        alt29=3;
                        }
                        break;
                    case 26:
                        {
                        alt29=4;
                        }
                        break;
                    case 27:
                        {
                        alt29=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }

                    switch (alt29) {
                        case 1 :
                            // InternalAnsibleDsl.g:1167:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,23,FOLLOW_42); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getEBlockAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:1178:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,24,FOLLOW_42); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getEBlockAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:1189:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,25,FOLLOW_42); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getEBlockAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:1200:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,26,FOLLOW_42); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getEBlockAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:1211:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,27,FOLLOW_42); 

                            							newLeafNode(lv_debugger_9_5, grammarAccess.getEBlockAccess().getDebuggerOn_skippedKeyword_6_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1225:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnsibleDsl.g:1226:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getEBlockAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:1230:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1231:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1231:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:1232:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_module_defaults_11_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"module_defaults",
                    							lv_module_defaults_11_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1250:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==29) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnsibleDsl.g:1251:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getEBlockAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:1255:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1256:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1256:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:1257:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_environment_13_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"environment",
                    							lv_environment_13_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1275:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==30) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnsibleDsl.g:1276:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getEBlockAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:1280:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1281:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1281:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:1282:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_collections_15_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"collections",
                    							lv_collections_15_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1300:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAnsibleDsl.g:1301:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getEBlockAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:1305:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1306:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1306:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:1307:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_tags_17_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"tags",
                    							lv_tags_17_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1325:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAnsibleDsl.g:1326:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_18, grammarAccess.getEBlockAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:1330:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:1331:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:1331:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:1332:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_variable_declarations_19_0=ruleEVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						add(
                    							current,
                    							"variable_declarations",
                    							lv_variable_declarations_19_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnsibleDsl.g:1349:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==33) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1350:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,33,FOLLOW_24); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEBlockAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:1354:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:1355:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:1355:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:1356:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBlockAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_variable_declarations_21_0=ruleEVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable_declarations",
                    	    								lv_variable_declarations_21_0,
                    	    								"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_47); 

                    				newLeafNode(otherlv_22, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1379:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAnsibleDsl.g:1380:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,45,FOLLOW_48); 

                    				newLeafNode(otherlv_23, grammarAccess.getEBlockAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:1384:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:1385:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:1385:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:1386:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getExe_settingsEExecutionExeSettingsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_exe_settings_24_0=ruleEExecutionExeSettings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"exe_settings",
                    							lv_exe_settings_24_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionExeSettings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,19,FOLLOW_49); 

                    				newLeafNode(otherlv_25, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1408:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==105) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAnsibleDsl.g:1409:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:1409:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:1410:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_50);
                    lv_delegation_26_0=ruleEDelegation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEBlockRule());
                    					}
                    					set(
                    						current,
                    						"delegation",
                    						lv_delegation_26_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EDelegation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1427:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==46) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAnsibleDsl.g:1428:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,46,FOLLOW_51); 

                    				newLeafNode(otherlv_27, grammarAccess.getEBlockAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:1432:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:1433:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:1433:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:1434:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_when_expression_28_0=ruleEJinjaExpressionEvaluationWithoutBrackets();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"when_expression",
                    							lv_when_expression_28_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionEvaluationWithoutBrackets");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1452:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAnsibleDsl.g:1453:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,35,FOLLOW_53); 

                    				newLeafNode(otherlv_29, grammarAccess.getEBlockAccess().getError_handlingKeyword_15_0());
                    			
                    // InternalAnsibleDsl.g:1457:4: ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) )
                    // InternalAnsibleDsl.g:1458:5: (lv_error_handling_30_0= ruleEBlockErrorHandling )
                    {
                    // InternalAnsibleDsl.g:1458:5: (lv_error_handling_30_0= ruleEBlockErrorHandling )
                    // InternalAnsibleDsl.g:1459:6: lv_error_handling_30_0= ruleEBlockErrorHandling
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getError_handlingEBlockErrorHandlingParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_error_handling_30_0=ruleEBlockErrorHandling();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"error_handling",
                    							lv_error_handling_30_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EBlockErrorHandling");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,19,FOLLOW_54); 

                    				newLeafNode(otherlv_31, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            otherlv_32=(Token)match(input,47,FOLLOW_30); 

            			newLeafNode(otherlv_32, grammarAccess.getEBlockAccess().getTasksKeyword_16());
            		
            // InternalAnsibleDsl.g:1485:3: ( (lv_tasks_33_0= ruleETask ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==50) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAnsibleDsl.g:1486:4: (lv_tasks_33_0= ruleETask )
            	    {
            	    // InternalAnsibleDsl.g:1486:4: (lv_tasks_33_0= ruleETask )
            	    // InternalAnsibleDsl.g:1487:5: lv_tasks_33_0= ruleETask
            	    {

            	    					newCompositeNode(grammarAccess.getEBlockAccess().getTasksETaskParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_31);
            	    lv_tasks_33_0=ruleETask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_33_0,
            	    						"org.sodalite.sdl.ansible.AnsibleDsl.ETask");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_34=(Token)match(input,19,FOLLOW_55); 

            			newLeafNode(otherlv_34, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_18());
            		
            // InternalAnsibleDsl.g:1508:3: (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==48) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAnsibleDsl.g:1509:4: otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}'
                    {
                    otherlv_35=(Token)match(input,48,FOLLOW_30); 

                    				newLeafNode(otherlv_35, grammarAccess.getEBlockAccess().getRescue_tasksKeyword_19_0());
                    			
                    // InternalAnsibleDsl.g:1513:4: ( (lv_rescue_tasks_36_0= ruleETask ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==50) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1514:5: (lv_rescue_tasks_36_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:1514:5: (lv_rescue_tasks_36_0= ruleETask )
                    	    // InternalAnsibleDsl.g:1515:6: lv_rescue_tasks_36_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getRescue_tasksETaskParserRuleCall_19_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_rescue_tasks_36_0=ruleETask();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rescue_tasks",
                    	    							lv_rescue_tasks_36_0,
                    	    							"org.sodalite.sdl.ansible.AnsibleDsl.ETask");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    otherlv_37=(Token)match(input,19,FOLLOW_56); 

                    				newLeafNode(otherlv_37, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_19_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1537:3: (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAnsibleDsl.g:1538:4: otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}'
                    {
                    otherlv_38=(Token)match(input,49,FOLLOW_30); 

                    				newLeafNode(otherlv_38, grammarAccess.getEBlockAccess().getAlways_tasksKeyword_20_0());
                    			
                    // InternalAnsibleDsl.g:1542:4: ( (lv_always_tasks_39_0= ruleETask ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==50) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1543:5: (lv_always_tasks_39_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:1543:5: (lv_always_tasks_39_0= ruleETask )
                    	    // InternalAnsibleDsl.g:1544:6: lv_always_tasks_39_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getAlways_tasksETaskParserRuleCall_20_1_0());
                    	    					
                    	    pushFollow(FOLLOW_31);
                    	    lv_always_tasks_39_0=ruleETask();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"always_tasks",
                    	    							lv_always_tasks_39_0,
                    	    							"org.sodalite.sdl.ansible.AnsibleDsl.ETask");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt44 >= 1 ) break loop44;
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);

                    otherlv_40=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_40, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_20_2());
                    			

                    }
                    break;

            }

            otherlv_41=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_21());
            		

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
    // $ANTLR end "ruleEBlock"


    // $ANTLR start "entryRuleETask"
    // InternalAnsibleDsl.g:1574:1: entryRuleETask returns [EObject current=null] : iv_ruleETask= ruleETask EOF ;
    public final EObject entryRuleETask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETask = null;


        try {
            // InternalAnsibleDsl.g:1574:46: (iv_ruleETask= ruleETask EOF )
            // InternalAnsibleDsl.g:1575:2: iv_ruleETask= ruleETask EOF
            {
             newCompositeNode(grammarAccess.getETaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETask=ruleETask();

            state._fsp--;

             current =iv_ruleETask; 
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
    // $ANTLR end "entryRuleETask"


    // $ANTLR start "ruleETask"
    // InternalAnsibleDsl.g:1581:1: ruleETask returns [EObject current=null] : (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' ) ;
    public final EObject ruleETask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_6=null;
        Token lv_no_log_7_0=null;
        Token otherlv_8=null;
        Token lv_debugger_9_1=null;
        Token lv_debugger_9_2=null;
        Token lv_debugger_9_3=null;
        Token lv_debugger_9_4=null;
        Token lv_debugger_9_5=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_action_33_0=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_46=null;
        EObject lv_privilage_escalation_3_0 = null;

        EObject lv_validation_mode_4_0 = null;

        EObject lv_connection_5_0 = null;

        EObject lv_module_defaults_11_0 = null;

        EObject lv_environment_13_0 = null;

        EObject lv_collections_15_0 = null;

        EObject lv_tags_17_0 = null;

        EObject lv_variable_declarations_19_0 = null;

        EObject lv_variable_declarations_21_0 = null;

        EObject lv_exe_settings_24_0 = null;

        EObject lv_delegation_26_0 = null;

        EObject lv_when_expression_28_0 = null;

        EObject lv_error_handling_30_0 = null;

        EObject lv_asynchronous_settings_35_0 = null;

        EObject lv_args_38_0 = null;

        EObject lv_module_40_0 = null;

        EObject lv_notifiables_43_0 = null;

        EObject lv_loop_44_0 = null;

        EObject lv_register_45_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1587:2: ( (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' ) )
            // InternalAnsibleDsl.g:1588:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' )
            {
            // InternalAnsibleDsl.g:1588:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' )
            // InternalAnsibleDsl.g:1589:3: otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getETaskAccess().getTaskKeyword_0());
            		
            // InternalAnsibleDsl.g:1593:3: (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:1594:4: otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getETaskAccess().getTask_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:1598:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:1599:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:1599:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:1600:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

            						newLeafNode(lv_name_2_0, grammarAccess.getETaskAccess().getNameSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getETaskRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_2_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalAnsibleDsl.g:1617:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==76) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAnsibleDsl.g:1618:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:1618:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:1619:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_59);
                    lv_privilage_escalation_3_0=ruleEPrivilageEscalation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getETaskRule());
                    					}
                    					set(
                    						current,
                    						"privilage_escalation",
                    						lv_privilage_escalation_3_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EPrivilageEscalation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1636:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==82) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAnsibleDsl.g:1637:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:1637:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:1638:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_60);
                    lv_validation_mode_4_0=ruleEValidationMode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getETaskRule());
                    					}
                    					set(
                    						current,
                    						"validation_mode",
                    						lv_validation_mode_4_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EValidationMode");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1655:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==85) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAnsibleDsl.g:1656:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:1656:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:1657:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_61);
                    lv_connection_5_0=ruleEConnection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getETaskRule());
                    					}
                    					set(
                    						current,
                    						"connection",
                    						lv_connection_5_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EConnection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1674:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==21) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAnsibleDsl.g:1675:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getETaskAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:1679:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:1680:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:1680:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:1681:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_62); 

                    						newLeafNode(lv_no_log_7_0, grammarAccess.getETaskAccess().getNo_logBOOLEANTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getETaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"no_log",
                    							lv_no_log_7_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1698:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==22) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAnsibleDsl.g:1699:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getETaskAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:1703:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:1704:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:1704:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:1705:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:1705:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt50=5;
                    switch ( input.LA(1) ) {
                    case 23:
                        {
                        alt50=1;
                        }
                        break;
                    case 24:
                        {
                        alt50=2;
                        }
                        break;
                    case 25:
                        {
                        alt50=3;
                        }
                        break;
                    case 26:
                        {
                        alt50=4;
                        }
                        break;
                    case 27:
                        {
                        alt50=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }

                    switch (alt50) {
                        case 1 :
                            // InternalAnsibleDsl.g:1706:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,23,FOLLOW_63); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getETaskAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:1717:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,24,FOLLOW_63); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getETaskAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:1728:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,25,FOLLOW_63); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getETaskAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:1739:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,26,FOLLOW_63); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getETaskAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:1750:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,27,FOLLOW_63); 

                            							newLeafNode(lv_debugger_9_5, grammarAccess.getETaskAccess().getDebuggerOn_skippedKeyword_6_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1764:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==28) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAnsibleDsl.g:1765:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getETaskAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:1769:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1770:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1770:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:1771:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_module_defaults_11_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"module_defaults",
                    							lv_module_defaults_11_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1789:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==29) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAnsibleDsl.g:1790:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getETaskAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:1794:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1795:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1795:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:1796:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_environment_13_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"environment",
                    							lv_environment_13_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1814:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==30) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAnsibleDsl.g:1815:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getETaskAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:1819:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1820:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1820:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:1821:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_collections_15_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"collections",
                    							lv_collections_15_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1839:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==31) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAnsibleDsl.g:1840:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getETaskAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:1844:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1845:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1845:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:1846:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_tags_17_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"tags",
                    							lv_tags_17_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1864:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==32) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAnsibleDsl.g:1865:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_18, grammarAccess.getETaskAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:1869:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:1870:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:1870:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:1871:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_variable_declarations_19_0=ruleEVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						add(
                    							current,
                    							"variable_declarations",
                    							lv_variable_declarations_19_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnsibleDsl.g:1888:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==33) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1889:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,33,FOLLOW_24); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getETaskAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:1893:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:1894:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:1894:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:1895:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getETaskAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_variable_declarations_21_0=ruleEVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getETaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable_declarations",
                    	    								lv_variable_declarations_21_0,
                    	    								"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_68); 

                    				newLeafNode(otherlv_22, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1918:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==45) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAnsibleDsl.g:1919:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,45,FOLLOW_48); 

                    				newLeafNode(otherlv_23, grammarAccess.getETaskAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:1923:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:1924:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:1924:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:1925:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getExe_settingsEExecutionExeSettingsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_exe_settings_24_0=ruleEExecutionExeSettings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"exe_settings",
                    							lv_exe_settings_24_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionExeSettings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,19,FOLLOW_69); 

                    				newLeafNode(otherlv_25, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1947:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==105) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAnsibleDsl.g:1948:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:1948:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:1949:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_70);
                    lv_delegation_26_0=ruleEDelegation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getETaskRule());
                    					}
                    					set(
                    						current,
                    						"delegation",
                    						lv_delegation_26_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EDelegation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1966:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==46) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAnsibleDsl.g:1967:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,46,FOLLOW_51); 

                    				newLeafNode(otherlv_27, grammarAccess.getETaskAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:1971:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:1972:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:1972:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:1973:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_when_expression_28_0=ruleEJinjaExpressionEvaluationWithoutBrackets();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"when_expression",
                    							lv_when_expression_28_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionEvaluationWithoutBrackets");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1991:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==35) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAnsibleDsl.g:1992:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,35,FOLLOW_72); 

                    				newLeafNode(otherlv_29, grammarAccess.getETaskAccess().getError_handlingKeyword_15_0());
                    			
                    // InternalAnsibleDsl.g:1996:4: ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) )
                    // InternalAnsibleDsl.g:1997:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    {
                    // InternalAnsibleDsl.g:1997:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    // InternalAnsibleDsl.g:1998:6: lv_error_handling_30_0= ruleETaskHandlerErrorHandling
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getError_handlingETaskHandlerErrorHandlingParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_error_handling_30_0=ruleETaskHandlerErrorHandling();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"error_handling",
                    							lv_error_handling_30_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.ETaskHandlerErrorHandling");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,19,FOLLOW_73); 

                    				newLeafNode(otherlv_31, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2020:3: (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==52) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAnsibleDsl.g:2021:4: otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) )
                    {
                    otherlv_32=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_32, grammarAccess.getETaskAccess().getActionKeyword_16_0());
                    			
                    // InternalAnsibleDsl.g:2025:4: ( (lv_action_33_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2026:5: (lv_action_33_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2026:5: (lv_action_33_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2027:6: lv_action_33_0= RULE_STRING
                    {
                    lv_action_33_0=(Token)match(input,RULE_STRING,FOLLOW_74); 

                    						newLeafNode(lv_action_33_0, grammarAccess.getETaskAccess().getActionSTRINGTerminalRuleCall_16_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getETaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"action",
                    							lv_action_33_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2044:3: (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==53) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAnsibleDsl.g:2045:4: otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}'
                    {
                    otherlv_34=(Token)match(input,53,FOLLOW_75); 

                    				newLeafNode(otherlv_34, grammarAccess.getETaskAccess().getAsynchronous_settingsKeyword_17_0());
                    			
                    // InternalAnsibleDsl.g:2049:4: ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) )
                    // InternalAnsibleDsl.g:2050:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    {
                    // InternalAnsibleDsl.g:2050:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    // InternalAnsibleDsl.g:2051:6: lv_asynchronous_settings_35_0= ruleEAsynchronousSettings
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getAsynchronous_settingsEAsynchronousSettingsParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_asynchronous_settings_35_0=ruleEAsynchronousSettings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"asynchronous_settings",
                    							lv_asynchronous_settings_35_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EAsynchronousSettings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,19,FOLLOW_76); 

                    				newLeafNode(otherlv_36, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_17_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2073:3: (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==54) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAnsibleDsl.g:2074:4: otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) )
                    {
                    otherlv_37=(Token)match(input,54,FOLLOW_77); 

                    				newLeafNode(otherlv_37, grammarAccess.getETaskAccess().getArgsKeyword_18_0());
                    			
                    // InternalAnsibleDsl.g:2078:4: ( (lv_args_38_0= ruleEDictionary ) )
                    // InternalAnsibleDsl.g:2079:5: (lv_args_38_0= ruleEDictionary )
                    {
                    // InternalAnsibleDsl.g:2079:5: (lv_args_38_0= ruleEDictionary )
                    // InternalAnsibleDsl.g:2080:6: lv_args_38_0= ruleEDictionary
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getArgsEDictionaryParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_args_38_0=ruleEDictionary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"args",
                    							lv_args_38_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EDictionary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_39=(Token)match(input,55,FOLLOW_79); 

            			newLeafNode(otherlv_39, grammarAccess.getETaskAccess().getModule_callKeyword_19());
            		
            // InternalAnsibleDsl.g:2102:3: ( (lv_module_40_0= ruleEModuleCall ) )
            // InternalAnsibleDsl.g:2103:4: (lv_module_40_0= ruleEModuleCall )
            {
            // InternalAnsibleDsl.g:2103:4: (lv_module_40_0= ruleEModuleCall )
            // InternalAnsibleDsl.g:2104:5: lv_module_40_0= ruleEModuleCall
            {

            					newCompositeNode(grammarAccess.getETaskAccess().getModuleEModuleCallParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_9);
            lv_module_40_0=ruleEModuleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETaskRule());
            					}
            					set(
            						current,
            						"module",
            						lv_module_40_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EModuleCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_41=(Token)match(input,19,FOLLOW_80); 

            			newLeafNode(otherlv_41, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_21());
            		
            // InternalAnsibleDsl.g:2125:3: (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==56) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAnsibleDsl.g:2126:4: otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    {
                    otherlv_42=(Token)match(input,56,FOLLOW_81); 

                    				newLeafNode(otherlv_42, grammarAccess.getETaskAccess().getNotifyKeyword_22_0());
                    			
                    // InternalAnsibleDsl.g:2130:4: ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_STRING||LA65_0==110) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2131:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    {
                    	    // InternalAnsibleDsl.g:2131:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    // InternalAnsibleDsl.g:2132:6: lv_notifiables_43_0= ruleENotifiable
                    	    {

                    	    						newCompositeNode(grammarAccess.getETaskAccess().getNotifiablesENotifiableParserRuleCall_22_1_0());
                    	    					
                    	    pushFollow(FOLLOW_82);
                    	    lv_notifiables_43_0=ruleENotifiable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"notifiables",
                    	    							lv_notifiables_43_0,
                    	    							"org.sodalite.sdl.ansible.AnsibleDsl.ENotifiable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2150:3: ( (lv_loop_44_0= ruleELoop ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==66||(LA67_0>=73 && LA67_0<=75)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAnsibleDsl.g:2151:4: (lv_loop_44_0= ruleELoop )
                    {
                    // InternalAnsibleDsl.g:2151:4: (lv_loop_44_0= ruleELoop )
                    // InternalAnsibleDsl.g:2152:5: lv_loop_44_0= ruleELoop
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getLoopELoopParserRuleCall_23_0());
                    				
                    pushFollow(FOLLOW_83);
                    lv_loop_44_0=ruleELoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getETaskRule());
                    					}
                    					set(
                    						current,
                    						"loop",
                    						lv_loop_44_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.ELoop");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2169:3: ( (lv_register_45_0= ruleERegisterVariable ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==141) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAnsibleDsl.g:2170:4: (lv_register_45_0= ruleERegisterVariable )
                    {
                    // InternalAnsibleDsl.g:2170:4: (lv_register_45_0= ruleERegisterVariable )
                    // InternalAnsibleDsl.g:2171:5: lv_register_45_0= ruleERegisterVariable
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getRegisterERegisterVariableParserRuleCall_24_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_register_45_0=ruleERegisterVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getETaskRule());
                    					}
                    					set(
                    						current,
                    						"register",
                    						lv_register_45_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.ERegisterVariable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_46=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_25());
            		

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
    // $ANTLR end "ruleETask"


    // $ANTLR start "entryRuleEHandler"
    // InternalAnsibleDsl.g:2196:1: entryRuleEHandler returns [EObject current=null] : iv_ruleEHandler= ruleEHandler EOF ;
    public final EObject entryRuleEHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHandler = null;


        try {
            // InternalAnsibleDsl.g:2196:49: (iv_ruleEHandler= ruleEHandler EOF )
            // InternalAnsibleDsl.g:2197:2: iv_ruleEHandler= ruleEHandler EOF
            {
             newCompositeNode(grammarAccess.getEHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEHandler=ruleEHandler();

            state._fsp--;

             current =iv_ruleEHandler; 
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
    // $ANTLR end "entryRuleEHandler"


    // $ANTLR start "ruleEHandler"
    // InternalAnsibleDsl.g:2203:1: ruleEHandler returns [EObject current=null] : (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' ) ;
    public final EObject ruleEHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_6=null;
        Token lv_no_log_7_0=null;
        Token otherlv_8=null;
        Token lv_debugger_9_1=null;
        Token lv_debugger_9_2=null;
        Token lv_debugger_9_3=null;
        Token lv_debugger_9_4=null;
        Token lv_debugger_9_5=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_action_33_0=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        EObject lv_privilage_escalation_3_0 = null;

        EObject lv_validation_mode_4_0 = null;

        EObject lv_connection_5_0 = null;

        EObject lv_module_defaults_11_0 = null;

        EObject lv_environment_13_0 = null;

        EObject lv_collections_15_0 = null;

        EObject lv_tags_17_0 = null;

        EObject lv_variable_declarations_19_0 = null;

        EObject lv_variable_declarations_21_0 = null;

        EObject lv_exe_settings_24_0 = null;

        EObject lv_delegation_26_0 = null;

        EObject lv_when_expression_28_0 = null;

        EObject lv_error_handling_30_0 = null;

        EObject lv_asynchronous_settings_35_0 = null;

        EObject lv_args_38_0 = null;

        EObject lv_module_40_0 = null;

        EObject lv_notifiables_43_0 = null;

        EObject lv_loop_44_0 = null;

        EObject lv_register_45_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2209:2: ( (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' ) )
            // InternalAnsibleDsl.g:2210:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' )
            {
            // InternalAnsibleDsl.g:2210:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' )
            // InternalAnsibleDsl.g:2211:3: otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_84); 

            			newLeafNode(otherlv_0, grammarAccess.getEHandlerAccess().getHandlerKeyword_0());
            		
            // InternalAnsibleDsl.g:2215:3: (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:2216:4: otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,58,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEHandlerAccess().getHandler_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:2220:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2221:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2221:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:2222:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

            						newLeafNode(lv_name_2_0, grammarAccess.getEHandlerAccess().getNameSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEHandlerRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_2_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalAnsibleDsl.g:2239:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==76) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAnsibleDsl.g:2240:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:2240:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:2241:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_59);
                    lv_privilage_escalation_3_0=ruleEPrivilageEscalation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    					}
                    					set(
                    						current,
                    						"privilage_escalation",
                    						lv_privilage_escalation_3_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EPrivilageEscalation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2258:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==82) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAnsibleDsl.g:2259:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:2259:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:2260:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_60);
                    lv_validation_mode_4_0=ruleEValidationMode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    					}
                    					set(
                    						current,
                    						"validation_mode",
                    						lv_validation_mode_4_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EValidationMode");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2277:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==85) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAnsibleDsl.g:2278:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:2278:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:2279:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_61);
                    lv_connection_5_0=ruleEConnection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    					}
                    					set(
                    						current,
                    						"connection",
                    						lv_connection_5_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EConnection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2296:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==21) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAnsibleDsl.g:2297:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getEHandlerAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:2301:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:2302:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:2302:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:2303:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_62); 

                    						newLeafNode(lv_no_log_7_0, grammarAccess.getEHandlerAccess().getNo_logBOOLEANTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEHandlerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"no_log",
                    							lv_no_log_7_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2320:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==22) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAnsibleDsl.g:2321:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getEHandlerAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:2325:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:2326:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:2326:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:2327:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:2327:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt73=5;
                    switch ( input.LA(1) ) {
                    case 23:
                        {
                        alt73=1;
                        }
                        break;
                    case 24:
                        {
                        alt73=2;
                        }
                        break;
                    case 25:
                        {
                        alt73=3;
                        }
                        break;
                    case 26:
                        {
                        alt73=4;
                        }
                        break;
                    case 27:
                        {
                        alt73=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }

                    switch (alt73) {
                        case 1 :
                            // InternalAnsibleDsl.g:2328:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,23,FOLLOW_63); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getEHandlerAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:2339:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,24,FOLLOW_63); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getEHandlerAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:2350:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,25,FOLLOW_63); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getEHandlerAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:2361:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,26,FOLLOW_63); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getEHandlerAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:2372:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,27,FOLLOW_63); 

                            							newLeafNode(lv_debugger_9_5, grammarAccess.getEHandlerAccess().getDebuggerOn_skippedKeyword_6_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2386:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==28) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAnsibleDsl.g:2387:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getEHandlerAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:2391:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2392:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2392:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:2393:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_module_defaults_11_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"module_defaults",
                    							lv_module_defaults_11_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2411:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==29) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAnsibleDsl.g:2412:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getEHandlerAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:2416:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2417:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2417:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:2418:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_environment_13_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"environment",
                    							lv_environment_13_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2436:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==30) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAnsibleDsl.g:2437:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getEHandlerAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:2441:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2442:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2442:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:2443:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_66);
                    lv_collections_15_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"collections",
                    							lv_collections_15_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2461:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==31) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAnsibleDsl.g:2462:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getEHandlerAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:2466:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2467:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2467:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:2468:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_67);
                    lv_tags_17_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"tags",
                    							lv_tags_17_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2486:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==32) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAnsibleDsl.g:2487:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_18, grammarAccess.getEHandlerAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:2491:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:2492:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:2492:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:2493:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_variable_declarations_19_0=ruleEVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						add(
                    							current,
                    							"variable_declarations",
                    							lv_variable_declarations_19_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnsibleDsl.g:2510:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==33) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2511:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,33,FOLLOW_24); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEHandlerAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:2515:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:2516:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:2516:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:2517:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getEHandlerAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_variable_declarations_21_0=ruleEVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable_declarations",
                    	    								lv_variable_declarations_21_0,
                    	    								"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_68); 

                    				newLeafNode(otherlv_22, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2540:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==45) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalAnsibleDsl.g:2541:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,45,FOLLOW_48); 

                    				newLeafNode(otherlv_23, grammarAccess.getEHandlerAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:2545:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:2546:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:2546:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:2547:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getExe_settingsEExecutionExeSettingsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_exe_settings_24_0=ruleEExecutionExeSettings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"exe_settings",
                    							lv_exe_settings_24_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionExeSettings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,19,FOLLOW_69); 

                    				newLeafNode(otherlv_25, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2569:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==105) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAnsibleDsl.g:2570:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:2570:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:2571:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_70);
                    lv_delegation_26_0=ruleEDelegation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    					}
                    					set(
                    						current,
                    						"delegation",
                    						lv_delegation_26_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EDelegation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2588:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==46) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAnsibleDsl.g:2589:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,46,FOLLOW_51); 

                    				newLeafNode(otherlv_27, grammarAccess.getEHandlerAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:2593:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:2594:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:2594:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:2595:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_when_expression_28_0=ruleEJinjaExpressionEvaluationWithoutBrackets();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"when_expression",
                    							lv_when_expression_28_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionEvaluationWithoutBrackets");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2613:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==35) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalAnsibleDsl.g:2614:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,35,FOLLOW_72); 

                    				newLeafNode(otherlv_29, grammarAccess.getEHandlerAccess().getError_handlingKeyword_15_0());
                    			
                    // InternalAnsibleDsl.g:2618:4: ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) )
                    // InternalAnsibleDsl.g:2619:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    {
                    // InternalAnsibleDsl.g:2619:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    // InternalAnsibleDsl.g:2620:6: lv_error_handling_30_0= ruleETaskHandlerErrorHandling
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getError_handlingETaskHandlerErrorHandlingParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_error_handling_30_0=ruleETaskHandlerErrorHandling();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"error_handling",
                    							lv_error_handling_30_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.ETaskHandlerErrorHandling");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_31=(Token)match(input,19,FOLLOW_73); 

                    				newLeafNode(otherlv_31, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2642:3: (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==52) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAnsibleDsl.g:2643:4: otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) )
                    {
                    otherlv_32=(Token)match(input,52,FOLLOW_4); 

                    				newLeafNode(otherlv_32, grammarAccess.getEHandlerAccess().getActionKeyword_16_0());
                    			
                    // InternalAnsibleDsl.g:2647:4: ( (lv_action_33_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2648:5: (lv_action_33_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2648:5: (lv_action_33_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2649:6: lv_action_33_0= RULE_STRING
                    {
                    lv_action_33_0=(Token)match(input,RULE_STRING,FOLLOW_74); 

                    						newLeafNode(lv_action_33_0, grammarAccess.getEHandlerAccess().getActionSTRINGTerminalRuleCall_16_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEHandlerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"action",
                    							lv_action_33_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2666:3: (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==53) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAnsibleDsl.g:2667:4: otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}'
                    {
                    otherlv_34=(Token)match(input,53,FOLLOW_75); 

                    				newLeafNode(otherlv_34, grammarAccess.getEHandlerAccess().getAsynchronous_settingsKeyword_17_0());
                    			
                    // InternalAnsibleDsl.g:2671:4: ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) )
                    // InternalAnsibleDsl.g:2672:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    {
                    // InternalAnsibleDsl.g:2672:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    // InternalAnsibleDsl.g:2673:6: lv_asynchronous_settings_35_0= ruleEAsynchronousSettings
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getAsynchronous_settingsEAsynchronousSettingsParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_asynchronous_settings_35_0=ruleEAsynchronousSettings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"asynchronous_settings",
                    							lv_asynchronous_settings_35_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EAsynchronousSettings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_36=(Token)match(input,19,FOLLOW_76); 

                    				newLeafNode(otherlv_36, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_17_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2695:3: (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==54) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAnsibleDsl.g:2696:4: otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) )
                    {
                    otherlv_37=(Token)match(input,54,FOLLOW_77); 

                    				newLeafNode(otherlv_37, grammarAccess.getEHandlerAccess().getArgsKeyword_18_0());
                    			
                    // InternalAnsibleDsl.g:2700:4: ( (lv_args_38_0= ruleEDictionary ) )
                    // InternalAnsibleDsl.g:2701:5: (lv_args_38_0= ruleEDictionary )
                    {
                    // InternalAnsibleDsl.g:2701:5: (lv_args_38_0= ruleEDictionary )
                    // InternalAnsibleDsl.g:2702:6: lv_args_38_0= ruleEDictionary
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getArgsEDictionaryParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_78);
                    lv_args_38_0=ruleEDictionary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"args",
                    							lv_args_38_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EDictionary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_39=(Token)match(input,55,FOLLOW_79); 

            			newLeafNode(otherlv_39, grammarAccess.getEHandlerAccess().getModule_callKeyword_19());
            		
            // InternalAnsibleDsl.g:2724:3: ( (lv_module_40_0= ruleEModuleCall ) )
            // InternalAnsibleDsl.g:2725:4: (lv_module_40_0= ruleEModuleCall )
            {
            // InternalAnsibleDsl.g:2725:4: (lv_module_40_0= ruleEModuleCall )
            // InternalAnsibleDsl.g:2726:5: lv_module_40_0= ruleEModuleCall
            {

            					newCompositeNode(grammarAccess.getEHandlerAccess().getModuleEModuleCallParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_9);
            lv_module_40_0=ruleEModuleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEHandlerRule());
            					}
            					set(
            						current,
            						"module",
            						lv_module_40_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EModuleCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_41=(Token)match(input,19,FOLLOW_85); 

            			newLeafNode(otherlv_41, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_21());
            		
            // InternalAnsibleDsl.g:2747:3: (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==56) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAnsibleDsl.g:2748:4: otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    {
                    otherlv_42=(Token)match(input,56,FOLLOW_81); 

                    				newLeafNode(otherlv_42, grammarAccess.getEHandlerAccess().getNotifyKeyword_22_0());
                    			
                    // InternalAnsibleDsl.g:2752:4: ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    int cnt88=0;
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==RULE_STRING||LA88_0==110) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2753:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    {
                    	    // InternalAnsibleDsl.g:2753:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    // InternalAnsibleDsl.g:2754:6: lv_notifiables_43_0= ruleENotifiable
                    	    {

                    	    						newCompositeNode(grammarAccess.getEHandlerAccess().getNotifiablesENotifiableParserRuleCall_22_1_0());
                    	    					
                    	    pushFollow(FOLLOW_86);
                    	    lv_notifiables_43_0=ruleENotifiable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"notifiables",
                    	    							lv_notifiables_43_0,
                    	    							"org.sodalite.sdl.ansible.AnsibleDsl.ENotifiable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt88 >= 1 ) break loop88;
                                EarlyExitException eee =
                                    new EarlyExitException(88, input);
                                throw eee;
                        }
                        cnt88++;
                    } while (true);


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2772:3: ( (lv_loop_44_0= ruleELoop ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==66||(LA90_0>=73 && LA90_0<=75)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAnsibleDsl.g:2773:4: (lv_loop_44_0= ruleELoop )
                    {
                    // InternalAnsibleDsl.g:2773:4: (lv_loop_44_0= ruleELoop )
                    // InternalAnsibleDsl.g:2774:5: lv_loop_44_0= ruleELoop
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getLoopELoopParserRuleCall_23_0());
                    				
                    pushFollow(FOLLOW_87);
                    lv_loop_44_0=ruleELoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    					}
                    					set(
                    						current,
                    						"loop",
                    						lv_loop_44_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.ELoop");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2791:3: ( (lv_register_45_0= ruleERegisterVariable ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==141) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalAnsibleDsl.g:2792:4: (lv_register_45_0= ruleERegisterVariable )
                    {
                    // InternalAnsibleDsl.g:2792:4: (lv_register_45_0= ruleERegisterVariable )
                    // InternalAnsibleDsl.g:2793:5: lv_register_45_0= ruleERegisterVariable
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getRegisterERegisterVariableParserRuleCall_24_0());
                    				
                    pushFollow(FOLLOW_88);
                    lv_register_45_0=ruleERegisterVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    					}
                    					set(
                    						current,
                    						"register",
                    						lv_register_45_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.ERegisterVariable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2810:3: (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==59) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalAnsibleDsl.g:2811:4: otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+
                    {
                    otherlv_46=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_46, grammarAccess.getEHandlerAccess().getListenKeyword_25_0());
                    			
                    // InternalAnsibleDsl.g:2815:4: ( (otherlv_47= RULE_STRING ) )+
                    int cnt92=0;
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==RULE_STRING) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2816:5: (otherlv_47= RULE_STRING )
                    	    {
                    	    // InternalAnsibleDsl.g:2816:5: (otherlv_47= RULE_STRING )
                    	    // InternalAnsibleDsl.g:2817:6: otherlv_47= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEHandlerRule());
                    	    						}
                    	    					
                    	    otherlv_47=(Token)match(input,RULE_STRING,FOLLOW_89); 

                    	    						newLeafNode(otherlv_47, grammarAccess.getEHandlerAccess().getListen_toENotifiedTopicCrossReference_25_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt92 >= 1 ) break loop92;
                                EarlyExitException eee =
                                    new EarlyExitException(92, input);
                                throw eee;
                        }
                        cnt92++;
                    } while (true);


                    }
                    break;

            }

            otherlv_48=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_48, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_26());
            		

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
    // $ANTLR end "ruleEHandler"


    // $ANTLR start "entryRuleEModuleCall"
    // InternalAnsibleDsl.g:2837:1: entryRuleEModuleCall returns [EObject current=null] : iv_ruleEModuleCall= ruleEModuleCall EOF ;
    public final EObject entryRuleEModuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModuleCall = null;


        try {
            // InternalAnsibleDsl.g:2837:52: (iv_ruleEModuleCall= ruleEModuleCall EOF )
            // InternalAnsibleDsl.g:2838:2: iv_ruleEModuleCall= ruleEModuleCall EOF
            {
             newCompositeNode(grammarAccess.getEModuleCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEModuleCall=ruleEModuleCall();

            state._fsp--;

             current =iv_ruleEModuleCall; 
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
    // $ANTLR end "entryRuleEModuleCall"


    // $ANTLR start "ruleEModuleCall"
    // InternalAnsibleDsl.g:2844:1: ruleEModuleCall returns [EObject current=null] : (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) ;
    public final EObject ruleEModuleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2850:2: ( (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:2851:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:2851:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:2852:3: otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEModuleCallAccess().getModule_nameKeyword_0());
            		
            // InternalAnsibleDsl.g:2856:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:2857:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:2857:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:2858:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_90); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEModuleCallAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEModuleCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_91); 

            			newLeafNode(otherlv_2, grammarAccess.getEModuleCallAccess().getParametersKeyword_2());
            		
            // InternalAnsibleDsl.g:2878:3: ( (lv_parameters_3_0= ruleEParameter ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_ID) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2879:4: (lv_parameters_3_0= ruleEParameter )
            	    {
            	    // InternalAnsibleDsl.g:2879:4: (lv_parameters_3_0= ruleEParameter )
            	    // InternalAnsibleDsl.g:2880:5: lv_parameters_3_0= ruleEParameter
            	    {

            	    					newCompositeNode(grammarAccess.getEModuleCallAccess().getParametersEParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_91);
            	    lv_parameters_3_0=ruleEParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEModuleCallRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_3_0,
            	    						"org.sodalite.sdl.ansible.AnsibleDsl.EParameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEModuleCallAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEModuleCall"


    // $ANTLR start "entryRuleEParameter"
    // InternalAnsibleDsl.g:2905:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalAnsibleDsl.g:2905:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalAnsibleDsl.g:2906:2: iv_ruleEParameter= ruleEParameter EOF
            {
             newCompositeNode(grammarAccess.getEParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameter=ruleEParameter();

            state._fsp--;

             current =iv_ruleEParameter; 
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
    // $ANTLR end "entryRuleEParameter"


    // $ANTLR start "ruleEParameter"
    // InternalAnsibleDsl.g:2912:1: ruleEParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2918:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) )
            // InternalAnsibleDsl.g:2919:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            {
            // InternalAnsibleDsl.g:2919:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            // InternalAnsibleDsl.g:2920:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) )
            {
            // InternalAnsibleDsl.g:2920:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:2921:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:2921:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:2922:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_92); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_93); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:2942:3: ( (lv_value_passed_2_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:2943:4: (lv_value_passed_2_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:2943:4: (lv_value_passed_2_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:2944:5: lv_value_passed_2_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getEParameterAccess().getValue_passedEValuePassedParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_passed_2_0=ruleEValuePassed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterRule());
            					}
            					set(
            						current,
            						"value_passed",
            						lv_value_passed_2_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassed");
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
    // $ANTLR end "ruleEParameter"


    // $ANTLR start "entryRuleERoleInclusion"
    // InternalAnsibleDsl.g:2965:1: entryRuleERoleInclusion returns [EObject current=null] : iv_ruleERoleInclusion= ruleERoleInclusion EOF ;
    public final EObject entryRuleERoleInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusion = null;


        try {
            // InternalAnsibleDsl.g:2965:55: (iv_ruleERoleInclusion= ruleERoleInclusion EOF )
            // InternalAnsibleDsl.g:2966:2: iv_ruleERoleInclusion= ruleERoleInclusion EOF
            {
             newCompositeNode(grammarAccess.getERoleInclusionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERoleInclusion=ruleERoleInclusion();

            state._fsp--;

             current =iv_ruleERoleInclusion; 
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
    // $ANTLR end "entryRuleERoleInclusion"


    // $ANTLR start "ruleERoleInclusion"
    // InternalAnsibleDsl.g:2972:1: ruleERoleInclusion returns [EObject current=null] : (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' ) ;
    public final EObject ruleERoleInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_6=null;
        Token lv_no_log_7_0=null;
        Token otherlv_8=null;
        Token lv_debugger_9_1=null;
        Token lv_debugger_9_2=null;
        Token lv_debugger_9_3=null;
        Token lv_debugger_9_4=null;
        Token lv_debugger_9_5=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        EObject lv_privilage_escalation_3_0 = null;

        EObject lv_validation_mode_4_0 = null;

        EObject lv_connection_5_0 = null;

        EObject lv_module_defaults_11_0 = null;

        EObject lv_environment_13_0 = null;

        EObject lv_collections_15_0 = null;

        EObject lv_tags_17_0 = null;

        EObject lv_variable_declarations_19_0 = null;

        EObject lv_variable_declarations_21_0 = null;

        EObject lv_exe_settings_24_0 = null;

        EObject lv_delegation_26_0 = null;

        EObject lv_when_expression_28_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2978:2: ( (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' ) )
            // InternalAnsibleDsl.g:2979:2: (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' )
            {
            // InternalAnsibleDsl.g:2979:2: (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' )
            // InternalAnsibleDsl.g:2980:3: otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_94); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionAccess().getRoleKeyword_0());
            		
            // InternalAnsibleDsl.g:2984:3: (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:2985:4: otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,64,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getERoleInclusionAccess().getRole_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:2989:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2990:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2990:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:2991:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_95); 

            						newLeafNode(lv_name_2_0, grammarAccess.getERoleInclusionAccess().getNameSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getERoleInclusionRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_2_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalAnsibleDsl.g:3008:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==76) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalAnsibleDsl.g:3009:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:3009:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:3010:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_96);
                    lv_privilage_escalation_3_0=ruleEPrivilageEscalation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    					}
                    					set(
                    						current,
                    						"privilage_escalation",
                    						lv_privilage_escalation_3_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EPrivilageEscalation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3027:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==82) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAnsibleDsl.g:3028:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:3028:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:3029:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_97);
                    lv_validation_mode_4_0=ruleEValidationMode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    					}
                    					set(
                    						current,
                    						"validation_mode",
                    						lv_validation_mode_4_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EValidationMode");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3046:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==85) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalAnsibleDsl.g:3047:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:3047:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:3048:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_98);
                    lv_connection_5_0=ruleEConnection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    					}
                    					set(
                    						current,
                    						"connection",
                    						lv_connection_5_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EConnection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3065:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==21) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalAnsibleDsl.g:3066:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getERoleInclusionAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3070:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3071:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3071:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3072:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_99); 

                    						newLeafNode(lv_no_log_7_0, grammarAccess.getERoleInclusionAccess().getNo_logBOOLEANTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERoleInclusionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"no_log",
                    							lv_no_log_7_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3089:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==22) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalAnsibleDsl.g:3090:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getERoleInclusionAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3094:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:3095:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:3095:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:3096:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:3096:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt99=5;
                    switch ( input.LA(1) ) {
                    case 23:
                        {
                        alt99=1;
                        }
                        break;
                    case 24:
                        {
                        alt99=2;
                        }
                        break;
                    case 25:
                        {
                        alt99=3;
                        }
                        break;
                    case 26:
                        {
                        alt99=4;
                        }
                        break;
                    case 27:
                        {
                        alt99=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 99, 0, input);

                        throw nvae;
                    }

                    switch (alt99) {
                        case 1 :
                            // InternalAnsibleDsl.g:3097:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,23,FOLLOW_100); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getERoleInclusionAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:3108:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,24,FOLLOW_100); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getERoleInclusionAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:3119:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,25,FOLLOW_100); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getERoleInclusionAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:3130:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,26,FOLLOW_100); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getERoleInclusionAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:3141:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,27,FOLLOW_100); 

                            							newLeafNode(lv_debugger_9_5, grammarAccess.getERoleInclusionAccess().getDebuggerOn_skippedKeyword_6_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3155:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==28) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalAnsibleDsl.g:3156:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getERoleInclusionAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:3160:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3161:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3161:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:3162:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_module_defaults_11_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    						}
                    						set(
                    							current,
                    							"module_defaults",
                    							lv_module_defaults_11_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3180:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==29) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalAnsibleDsl.g:3181:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_19); 

                    				newLeafNode(otherlv_12, grammarAccess.getERoleInclusionAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:3185:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3186:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3186:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:3187:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_102);
                    lv_environment_13_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    						}
                    						set(
                    							current,
                    							"environment",
                    							lv_environment_13_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3205:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==30) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalAnsibleDsl.g:3206:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getERoleInclusionAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:3210:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3211:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3211:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:3212:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_103);
                    lv_collections_15_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    						}
                    						set(
                    							current,
                    							"collections",
                    							lv_collections_15_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3230:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==31) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalAnsibleDsl.g:3231:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getERoleInclusionAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:3235:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3236:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3236:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:3237:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_tags_17_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    						}
                    						set(
                    							current,
                    							"tags",
                    							lv_tags_17_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3255:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==32) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalAnsibleDsl.g:3256:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_18, grammarAccess.getERoleInclusionAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:3260:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:3261:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:3261:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:3262:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_variable_declarations_19_0=ruleEVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    						}
                    						add(
                    							current,
                    							"variable_declarations",
                    							lv_variable_declarations_19_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnsibleDsl.g:3279:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==33) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:3280:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,33,FOLLOW_24); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getERoleInclusionAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:3284:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:3285:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:3285:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:3286:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getERoleInclusionAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_variable_declarations_21_0=ruleEVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable_declarations",
                    	    								lv_variable_declarations_21_0,
                    	    								"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_105); 

                    				newLeafNode(otherlv_22, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:3309:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==45) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalAnsibleDsl.g:3310:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,45,FOLLOW_48); 

                    				newLeafNode(otherlv_23, grammarAccess.getERoleInclusionAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:3314:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:3315:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:3315:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:3316:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getExe_settingsEExecutionExeSettingsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_exe_settings_24_0=ruleEExecutionExeSettings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    						}
                    						set(
                    							current,
                    							"exe_settings",
                    							lv_exe_settings_24_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionExeSettings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,19,FOLLOW_106); 

                    				newLeafNode(otherlv_25, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:3338:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==105) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalAnsibleDsl.g:3339:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:3339:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:3340:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_107);
                    lv_delegation_26_0=ruleEDelegation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    					}
                    					set(
                    						current,
                    						"delegation",
                    						lv_delegation_26_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EDelegation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3357:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==46) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalAnsibleDsl.g:3358:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,46,FOLLOW_51); 

                    				newLeafNode(otherlv_27, grammarAccess.getERoleInclusionAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:3362:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:3363:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:3363:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:3364:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_when_expression_28_0=ruleEJinjaExpressionEvaluationWithoutBrackets();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    						}
                    						set(
                    							current,
                    							"when_expression",
                    							lv_when_expression_28_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionEvaluationWithoutBrackets");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleERoleInclusion"


    // $ANTLR start "entryRuleERoleInclusions"
    // InternalAnsibleDsl.g:3390:1: entryRuleERoleInclusions returns [EObject current=null] : iv_ruleERoleInclusions= ruleERoleInclusions EOF ;
    public final EObject entryRuleERoleInclusions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusions = null;


        try {
            // InternalAnsibleDsl.g:3390:56: (iv_ruleERoleInclusions= ruleERoleInclusions EOF )
            // InternalAnsibleDsl.g:3391:2: iv_ruleERoleInclusions= ruleERoleInclusions EOF
            {
             newCompositeNode(grammarAccess.getERoleInclusionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERoleInclusions=ruleERoleInclusions();

            state._fsp--;

             current =iv_ruleERoleInclusions; 
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
    // $ANTLR end "entryRuleERoleInclusions"


    // $ANTLR start "ruleERoleInclusions"
    // InternalAnsibleDsl.g:3397:1: ruleERoleInclusions returns [EObject current=null] : (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' ) ;
    public final EObject ruleERoleInclusions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_roles_1_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3403:2: ( (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' ) )
            // InternalAnsibleDsl.g:3404:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' )
            {
            // InternalAnsibleDsl.g:3404:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' )
            // InternalAnsibleDsl.g:3405:3: otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_108); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionsAccess().getRoles_inclusionsKeyword_0());
            		
            // InternalAnsibleDsl.g:3409:3: ( (lv_roles_1_0= ruleERoleInclusion ) )
            // InternalAnsibleDsl.g:3410:4: (lv_roles_1_0= ruleERoleInclusion )
            {
            // InternalAnsibleDsl.g:3410:4: (lv_roles_1_0= ruleERoleInclusion )
            // InternalAnsibleDsl.g:3411:5: lv_roles_1_0= ruleERoleInclusion
            {

            					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_109);
            lv_roles_1_0=ruleERoleInclusion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERoleInclusionsRule());
            					}
            					add(
            						current,
            						"roles",
            						lv_roles_1_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.ERoleInclusion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:3428:3: ( (lv_roles_2_0= ruleERoleInclusion ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==63) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3429:4: (lv_roles_2_0= ruleERoleInclusion )
            	    {
            	    // InternalAnsibleDsl.g:3429:4: (lv_roles_2_0= ruleERoleInclusion )
            	    // InternalAnsibleDsl.g:3430:5: lv_roles_2_0= ruleERoleInclusion
            	    {

            	    					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_109);
            	    lv_roles_2_0=ruleERoleInclusion();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERoleInclusionsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"roles",
            	    						lv_roles_2_0,
            	    						"org.sodalite.sdl.ansible.AnsibleDsl.ERoleInclusion");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getERoleInclusionsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleERoleInclusions"


    // $ANTLR start "entryRuleELoop"
    // InternalAnsibleDsl.g:3455:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalAnsibleDsl.g:3455:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalAnsibleDsl.g:3456:2: iv_ruleELoop= ruleELoop EOF
            {
             newCompositeNode(grammarAccess.getELoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELoop=ruleELoop();

            state._fsp--;

             current =iv_ruleELoop; 
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
    // $ANTLR end "entryRuleELoop"


    // $ANTLR start "ruleELoop"
    // InternalAnsibleDsl.g:3462:1: ruleELoop returns [EObject current=null] : (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        EObject this_ELoopOverList_0 = null;

        EObject this_EUntil_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3468:2: ( (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) )
            // InternalAnsibleDsl.g:3469:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            {
            // InternalAnsibleDsl.g:3469:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==66) ) {
                alt111=1;
            }
            else if ( ((LA111_0>=73 && LA111_0<=75)) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalAnsibleDsl.g:3470:3: this_ELoopOverList_0= ruleELoopOverList
                    {

                    			newCompositeNode(grammarAccess.getELoopAccess().getELoopOverListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELoopOverList_0=ruleELoopOverList();

                    state._fsp--;


                    			current = this_ELoopOverList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:3479:3: this_EUntil_1= ruleEUntil
                    {

                    			newCompositeNode(grammarAccess.getELoopAccess().getEUntilParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EUntil_1=ruleEUntil();

                    state._fsp--;


                    			current = this_EUntil_1;
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
    // $ANTLR end "ruleELoop"


    // $ANTLR start "entryRuleELoopOverList"
    // InternalAnsibleDsl.g:3491:1: entryRuleELoopOverList returns [EObject current=null] : iv_ruleELoopOverList= ruleELoopOverList EOF ;
    public final EObject entryRuleELoopOverList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopOverList = null;


        try {
            // InternalAnsibleDsl.g:3491:54: (iv_ruleELoopOverList= ruleELoopOverList EOF )
            // InternalAnsibleDsl.g:3492:2: iv_ruleELoopOverList= ruleELoopOverList EOF
            {
             newCompositeNode(grammarAccess.getELoopOverListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELoopOverList=ruleELoopOverList();

            state._fsp--;

             current =iv_ruleELoopOverList; 
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
    // $ANTLR end "entryRuleELoopOverList"


    // $ANTLR start "ruleELoopOverList"
    // InternalAnsibleDsl.g:3498:1: ruleELoopOverList returns [EObject current=null] : (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) ;
    public final EObject ruleELoopOverList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loop_list_1_0 = null;

        EObject lv_loop_control_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3504:2: ( (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) )
            // InternalAnsibleDsl.g:3505:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            {
            // InternalAnsibleDsl.g:3505:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            // InternalAnsibleDsl.g:3506:3: otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )?
            {
            otherlv_0=(Token)match(input,66,FOLLOW_93); 

            			newLeafNode(otherlv_0, grammarAccess.getELoopOverListAccess().getLoopKeyword_0());
            		
            // InternalAnsibleDsl.g:3510:3: ( (lv_loop_list_1_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:3511:4: (lv_loop_list_1_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:3511:4: (lv_loop_list_1_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:3512:5: lv_loop_list_1_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getELoopOverListAccess().getLoop_listEValuePassedParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_110);
            lv_loop_list_1_0=ruleEValuePassed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getELoopOverListRule());
            					}
            					set(
            						current,
            						"loop_list",
            						lv_loop_list_1_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassed");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:3529:3: ( (lv_loop_control_2_0= ruleELoopControl ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==67) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalAnsibleDsl.g:3530:4: (lv_loop_control_2_0= ruleELoopControl )
                    {
                    // InternalAnsibleDsl.g:3530:4: (lv_loop_control_2_0= ruleELoopControl )
                    // InternalAnsibleDsl.g:3531:5: lv_loop_control_2_0= ruleELoopControl
                    {

                    					newCompositeNode(grammarAccess.getELoopOverListAccess().getLoop_controlELoopControlParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_loop_control_2_0=ruleELoopControl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getELoopOverListRule());
                    					}
                    					set(
                    						current,
                    						"loop_control",
                    						lv_loop_control_2_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.ELoopControl");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleELoopOverList"


    // $ANTLR start "entryRuleELoopControl"
    // InternalAnsibleDsl.g:3552:1: entryRuleELoopControl returns [EObject current=null] : iv_ruleELoopControl= ruleELoopControl EOF ;
    public final EObject entryRuleELoopControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopControl = null;


        try {
            // InternalAnsibleDsl.g:3552:53: (iv_ruleELoopControl= ruleELoopControl EOF )
            // InternalAnsibleDsl.g:3553:2: iv_ruleELoopControl= ruleELoopControl EOF
            {
             newCompositeNode(grammarAccess.getELoopControlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELoopControl=ruleELoopControl();

            state._fsp--;

             current =iv_ruleELoopControl; 
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
    // $ANTLR end "entryRuleELoopControl"


    // $ANTLR start "ruleELoopControl"
    // InternalAnsibleDsl.g:3559:1: ruleELoopControl returns [EObject current=null] : ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleELoopControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_pause_5_0=null;
        Token otherlv_6=null;
        Token lv_index_var_7_0=null;
        Token otherlv_8=null;
        Token lv_loop_var_9_0=null;
        Token otherlv_10=null;
        Token lv_extended_11_0=null;
        Token otherlv_12=null;
        EObject lv_label_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3565:2: ( ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:3566:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:3566:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:3567:3: () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:3567:3: ()
            // InternalAnsibleDsl.g:3568:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getELoopControlAccess().getELoopControlAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_111); 

            			newLeafNode(otherlv_1, grammarAccess.getELoopControlAccess().getLoop_controlKeyword_1());
            		
            // InternalAnsibleDsl.g:3578:3: (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==68) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalAnsibleDsl.g:3579:4: otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) )
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_93); 

                    				newLeafNode(otherlv_2, grammarAccess.getELoopControlAccess().getLabelKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3583:4: ( (lv_label_3_0= ruleEValuePassed ) )
                    // InternalAnsibleDsl.g:3584:5: (lv_label_3_0= ruleEValuePassed )
                    {
                    // InternalAnsibleDsl.g:3584:5: (lv_label_3_0= ruleEValuePassed )
                    // InternalAnsibleDsl.g:3585:6: lv_label_3_0= ruleEValuePassed
                    {

                    						newCompositeNode(grammarAccess.getELoopControlAccess().getLabelEValuePassedParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_112);
                    lv_label_3_0=ruleEValuePassed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getELoopControlRule());
                    						}
                    						set(
                    							current,
                    							"label",
                    							lv_label_3_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassed");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3603:3: (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==69) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalAnsibleDsl.g:3604:4: otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) )
                    {
                    otherlv_4=(Token)match(input,69,FOLLOW_113); 

                    				newLeafNode(otherlv_4, grammarAccess.getELoopControlAccess().getPauseKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3608:4: ( (lv_pause_5_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:3609:5: (lv_pause_5_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:3609:5: (lv_pause_5_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:3610:6: lv_pause_5_0= RULE_NUMBER
                    {
                    lv_pause_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_114); 

                    						newLeafNode(lv_pause_5_0, grammarAccess.getELoopControlAccess().getPauseNUMBERTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELoopControlRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pause",
                    							lv_pause_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3627:3: (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==70) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalAnsibleDsl.g:3628:4: otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,70,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getELoopControlAccess().getIndex_varKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3632:4: ( (lv_index_var_7_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:3633:5: (lv_index_var_7_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:3633:5: (lv_index_var_7_0= RULE_ID )
                    // InternalAnsibleDsl.g:3634:6: lv_index_var_7_0= RULE_ID
                    {
                    lv_index_var_7_0=(Token)match(input,RULE_ID,FOLLOW_115); 

                    						newLeafNode(lv_index_var_7_0, grammarAccess.getELoopControlAccess().getIndex_varIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELoopControlRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index_var",
                    							lv_index_var_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3651:3: (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==71) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalAnsibleDsl.g:3652:4: otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,71,FOLLOW_24); 

                    				newLeafNode(otherlv_8, grammarAccess.getELoopControlAccess().getLoop_varKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3656:4: ( (lv_loop_var_9_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:3657:5: (lv_loop_var_9_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:3657:5: (lv_loop_var_9_0= RULE_ID )
                    // InternalAnsibleDsl.g:3658:6: lv_loop_var_9_0= RULE_ID
                    {
                    lv_loop_var_9_0=(Token)match(input,RULE_ID,FOLLOW_116); 

                    						newLeafNode(lv_loop_var_9_0, grammarAccess.getELoopControlAccess().getLoop_varIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELoopControlRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"loop_var",
                    							lv_loop_var_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3675:3: (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==72) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalAnsibleDsl.g:3676:4: otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    {
                    otherlv_10=(Token)match(input,72,FOLLOW_15); 

                    				newLeafNode(otherlv_10, grammarAccess.getELoopControlAccess().getExtendedKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3680:4: ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3681:5: (lv_extended_11_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3681:5: (lv_extended_11_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3682:6: lv_extended_11_0= RULE_BOOLEAN
                    {
                    lv_extended_11_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_9); 

                    						newLeafNode(lv_extended_11_0, grammarAccess.getELoopControlAccess().getExtendedBOOLEANTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELoopControlRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"extended",
                    							lv_extended_11_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getELoopControlAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleELoopControl"


    // $ANTLR start "entryRuleEUntil"
    // InternalAnsibleDsl.g:3707:1: entryRuleEUntil returns [EObject current=null] : iv_ruleEUntil= ruleEUntil EOF ;
    public final EObject entryRuleEUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUntil = null;


        try {
            // InternalAnsibleDsl.g:3707:47: (iv_ruleEUntil= ruleEUntil EOF )
            // InternalAnsibleDsl.g:3708:2: iv_ruleEUntil= ruleEUntil EOF
            {
             newCompositeNode(grammarAccess.getEUntilRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEUntil=ruleEUntil();

            state._fsp--;

             current =iv_ruleEUntil; 
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
    // $ANTLR end "entryRuleEUntil"


    // $ANTLR start "ruleEUntil"
    // InternalAnsibleDsl.g:3714:1: ruleEUntil returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEUntil() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_retries_4_0=null;
        Token otherlv_5=null;
        Token lv_delay_6_0=null;
        EObject lv_until_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3720:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:3721:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:3721:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:3722:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:3722:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:3723:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEUntilAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3726:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:3727:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:3727:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+
            int cnt118=0;
            loop118:
            do {
                int alt118=4;
                int LA118_0 = input.LA(1);

                if ( LA118_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
                    alt118=1;
                }
                else if ( LA118_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
                    alt118=2;
                }
                else if ( LA118_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
                    alt118=3;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3728:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3728:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3729:4: {...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3729:100: ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    // InternalAnsibleDsl.g:3730:5: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3733:8: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    // InternalAnsibleDsl.g:3733:9: {...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3733:18: (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    // InternalAnsibleDsl.g:3733:19: otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    {
            	    otherlv_1=(Token)match(input,73,FOLLOW_51); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEUntilAccess().getUntilKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3737:8: ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    // InternalAnsibleDsl.g:3738:9: (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    {
            	    // InternalAnsibleDsl.g:3738:9: (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    // InternalAnsibleDsl.g:3739:10: lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            	    {

            	    										newCompositeNode(grammarAccess.getEUntilAccess().getUntilEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_117);
            	    lv_until_2_0=ruleEJinjaExpressionEvaluationWithoutBrackets();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEUntilRule());
            	    										}
            	    										set(
            	    											current,
            	    											"until",
            	    											lv_until_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionEvaluationWithoutBrackets");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEUntilAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:3762:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3762:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3763:4: {...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3763:100: ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:3764:5: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3767:8: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:3767:9: {...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3767:18: (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:3767:19: otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) )
            	    {
            	    otherlv_3=(Token)match(input,74,FOLLOW_113); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEUntilAccess().getRetriesKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3771:8: ( (lv_retries_4_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:3772:9: (lv_retries_4_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:3772:9: (lv_retries_4_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:3773:10: lv_retries_4_0= RULE_NUMBER
            	    {
            	    lv_retries_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_117); 

            	    										newLeafNode(lv_retries_4_0, grammarAccess.getEUntilAccess().getRetriesNUMBERTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEUntilRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"retries",
            	    											lv_retries_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEUntilAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:3795:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3795:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3796:4: {...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3796:100: ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:3797:5: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3800:8: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:3800:9: {...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3800:18: (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:3800:19: otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) )
            	    {
            	    otherlv_5=(Token)match(input,75,FOLLOW_113); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEUntilAccess().getDelayKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3804:8: ( (lv_delay_6_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:3805:9: (lv_delay_6_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:3805:9: (lv_delay_6_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:3806:10: lv_delay_6_0= RULE_NUMBER
            	    {
            	    lv_delay_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_117); 

            	    										newLeafNode(lv_delay_6_0, grammarAccess.getEUntilAccess().getDelayNUMBERTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEUntilRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"delay",
            	    											lv_delay_6_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEUntilAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt118 >= 1 ) break loop118;
                        EarlyExitException eee =
                            new EarlyExitException(118, input);
                        throw eee;
                }
                cnt118++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEUntilAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canLeave(grammarAccess.getEUntilAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEUntilAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleEUntil"


    // $ANTLR start "entryRuleEPrivilageEscalation"
    // InternalAnsibleDsl.g:3839:1: entryRuleEPrivilageEscalation returns [EObject current=null] : iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF ;
    public final EObject entryRuleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrivilageEscalation = null;


        try {
            // InternalAnsibleDsl.g:3839:61: (iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF )
            // InternalAnsibleDsl.g:3840:2: iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF
            {
             newCompositeNode(grammarAccess.getEPrivilageEscalationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPrivilageEscalation=ruleEPrivilageEscalation();

            state._fsp--;

             current =iv_ruleEPrivilageEscalation; 
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
    // $ANTLR end "entryRuleEPrivilageEscalation"


    // $ANTLR start "ruleEPrivilageEscalation"
    // InternalAnsibleDsl.g:3846:1: ruleEPrivilageEscalation returns [EObject current=null] : ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_become_3_0=null;
        Token otherlv_4=null;
        Token lv_become_exe_5_0=null;
        Token otherlv_6=null;
        Token lv_become_flags_7_0=null;
        Token otherlv_8=null;
        Token lv_become_method_9_0=null;
        Token otherlv_10=null;
        Token lv_become_user_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:3852:2: ( ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:3853:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:3853:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:3854:3: () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:3854:3: ()
            // InternalAnsibleDsl.g:3855:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPrivilageEscalationAccess().getEPrivilageEscalationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,76,FOLLOW_118); 

            			newLeafNode(otherlv_1, grammarAccess.getEPrivilageEscalationAccess().getPrivilage_escalationKeyword_1());
            		
            // InternalAnsibleDsl.g:3865:3: (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==77) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalAnsibleDsl.g:3866:4: otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,77,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getEPrivilageEscalationAccess().getBecomeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3870:4: ( (lv_become_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3871:5: (lv_become_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3871:5: (lv_become_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3872:6: lv_become_3_0= RULE_BOOLEAN
                    {
                    lv_become_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_119); 

                    						newLeafNode(lv_become_3_0, grammarAccess.getEPrivilageEscalationAccess().getBecomeBOOLEANTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPrivilageEscalationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"become",
                    							lv_become_3_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3889:3: (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==78) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalAnsibleDsl.g:3890:4: otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,78,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPrivilageEscalationAccess().getBecome_exeKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3894:4: ( (lv_become_exe_5_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3895:5: (lv_become_exe_5_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3895:5: (lv_become_exe_5_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3896:6: lv_become_exe_5_0= RULE_STRING
                    {
                    lv_become_exe_5_0=(Token)match(input,RULE_STRING,FOLLOW_120); 

                    						newLeafNode(lv_become_exe_5_0, grammarAccess.getEPrivilageEscalationAccess().getBecome_exeSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPrivilageEscalationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"become_exe",
                    							lv_become_exe_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3913:3: (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==79) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalAnsibleDsl.g:3914:4: otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,79,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3918:4: ( (lv_become_flags_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3919:5: (lv_become_flags_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3919:5: (lv_become_flags_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3920:6: lv_become_flags_7_0= RULE_STRING
                    {
                    lv_become_flags_7_0=(Token)match(input,RULE_STRING,FOLLOW_121); 

                    						newLeafNode(lv_become_flags_7_0, grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPrivilageEscalationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"become_flags",
                    							lv_become_flags_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3937:3: (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==80) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalAnsibleDsl.g:3938:4: otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,80,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPrivilageEscalationAccess().getBecome_methodKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3942:4: ( (lv_become_method_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3943:5: (lv_become_method_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3943:5: (lv_become_method_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3944:6: lv_become_method_9_0= RULE_STRING
                    {
                    lv_become_method_9_0=(Token)match(input,RULE_STRING,FOLLOW_122); 

                    						newLeafNode(lv_become_method_9_0, grammarAccess.getEPrivilageEscalationAccess().getBecome_methodSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPrivilageEscalationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"become_method",
                    							lv_become_method_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3961:3: (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==81) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalAnsibleDsl.g:3962:4: otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,81,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEPrivilageEscalationAccess().getBecome_userKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3966:4: ( (lv_become_user_11_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3967:5: (lv_become_user_11_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3967:5: (lv_become_user_11_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3968:6: lv_become_user_11_0= RULE_STRING
                    {
                    lv_become_user_11_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_become_user_11_0, grammarAccess.getEPrivilageEscalationAccess().getBecome_userSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPrivilageEscalationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"become_user",
                    							lv_become_user_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEPrivilageEscalationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleEPrivilageEscalation"


    // $ANTLR start "entryRuleEValidationMode"
    // InternalAnsibleDsl.g:3993:1: entryRuleEValidationMode returns [EObject current=null] : iv_ruleEValidationMode= ruleEValidationMode EOF ;
    public final EObject entryRuleEValidationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidationMode = null;


        try {
            // InternalAnsibleDsl.g:3993:56: (iv_ruleEValidationMode= ruleEValidationMode EOF )
            // InternalAnsibleDsl.g:3994:2: iv_ruleEValidationMode= ruleEValidationMode EOF
            {
             newCompositeNode(grammarAccess.getEValidationModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValidationMode=ruleEValidationMode();

            state._fsp--;

             current =iv_ruleEValidationMode; 
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
    // $ANTLR end "entryRuleEValidationMode"


    // $ANTLR start "ruleEValidationMode"
    // InternalAnsibleDsl.g:4000:1: ruleEValidationMode returns [EObject current=null] : ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleEValidationMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_check_mode_3_0=null;
        Token otherlv_4=null;
        Token lv_diff_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4006:2: ( ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) )
            // InternalAnsibleDsl.g:4007:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            {
            // InternalAnsibleDsl.g:4007:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            // InternalAnsibleDsl.g:4008:3: () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}'
            {
            // InternalAnsibleDsl.g:4008:3: ()
            // InternalAnsibleDsl.g:4009:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEValidationModeAccess().getEValidationModeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,82,FOLLOW_123); 

            			newLeafNode(otherlv_1, grammarAccess.getEValidationModeAccess().getValidation_modeKeyword_1());
            		
            // InternalAnsibleDsl.g:4019:3: (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==83) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalAnsibleDsl.g:4020:4: otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,83,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getEValidationModeAccess().getCheck_modeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4024:4: ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4025:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4025:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4026:6: lv_check_mode_3_0= RULE_BOOLEAN
                    {
                    lv_check_mode_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_124); 

                    						newLeafNode(lv_check_mode_3_0, grammarAccess.getEValidationModeAccess().getCheck_modeBOOLEANTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEValidationModeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"check_mode",
                    							lv_check_mode_3_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4043:3: (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==84) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalAnsibleDsl.g:4044:4: otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    {
                    otherlv_4=(Token)match(input,84,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getEValidationModeAccess().getDiffKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4048:4: ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4049:5: (lv_diff_5_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4049:5: (lv_diff_5_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4050:6: lv_diff_5_0= RULE_BOOLEAN
                    {
                    lv_diff_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_9); 

                    						newLeafNode(lv_diff_5_0, grammarAccess.getEValidationModeAccess().getDiffBOOLEANTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEValidationModeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"diff",
                    							lv_diff_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEValidationModeAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleEValidationMode"


    // $ANTLR start "entryRuleEConnection"
    // InternalAnsibleDsl.g:4075:1: entryRuleEConnection returns [EObject current=null] : iv_ruleEConnection= ruleEConnection EOF ;
    public final EObject entryRuleEConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConnection = null;


        try {
            // InternalAnsibleDsl.g:4075:52: (iv_ruleEConnection= ruleEConnection EOF )
            // InternalAnsibleDsl.g:4076:2: iv_ruleEConnection= ruleEConnection EOF
            {
             newCompositeNode(grammarAccess.getEConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConnection=ruleEConnection();

            state._fsp--;

             current =iv_ruleEConnection; 
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
    // $ANTLR end "entryRuleEConnection"


    // $ANTLR start "ruleEConnection"
    // InternalAnsibleDsl.g:4082:1: ruleEConnection returns [EObject current=null] : ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleEConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_connection_3_0=null;
        Token otherlv_4=null;
        Token lv_port_5_0=null;
        Token otherlv_6=null;
        Token lv_remote_user_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4088:2: ( ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) )
            // InternalAnsibleDsl.g:4089:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            {
            // InternalAnsibleDsl.g:4089:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            // InternalAnsibleDsl.g:4090:3: () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}'
            {
            // InternalAnsibleDsl.g:4090:3: ()
            // InternalAnsibleDsl.g:4091:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConnectionAccess().getEConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_125); 

            			newLeafNode(otherlv_1, grammarAccess.getEConnectionAccess().getConnection_infoKeyword_1());
            		
            // InternalAnsibleDsl.g:4101:3: (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==86) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalAnsibleDsl.g:4102:4: otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,86,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEConnectionAccess().getConnectionKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4106:4: ( (lv_connection_3_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4107:5: (lv_connection_3_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4107:5: (lv_connection_3_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4108:6: lv_connection_3_0= RULE_STRING
                    {
                    lv_connection_3_0=(Token)match(input,RULE_STRING,FOLLOW_126); 

                    						newLeafNode(lv_connection_3_0, grammarAccess.getEConnectionAccess().getConnectionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEConnectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"connection",
                    							lv_connection_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4125:3: (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==87) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalAnsibleDsl.g:4126:4: otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) )
                    {
                    otherlv_4=(Token)match(input,87,FOLLOW_113); 

                    				newLeafNode(otherlv_4, grammarAccess.getEConnectionAccess().getPortKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4130:4: ( (lv_port_5_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4131:5: (lv_port_5_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4131:5: (lv_port_5_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4132:6: lv_port_5_0= RULE_NUMBER
                    {
                    lv_port_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_127); 

                    						newLeafNode(lv_port_5_0, grammarAccess.getEConnectionAccess().getPortNUMBERTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEConnectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"port",
                    							lv_port_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4149:3: (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==88) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalAnsibleDsl.g:4150:4: otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,88,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEConnectionAccess().getRemote_userKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4154:4: ( (lv_remote_user_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4155:5: (lv_remote_user_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4155:5: (lv_remote_user_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4156:6: lv_remote_user_7_0= RULE_STRING
                    {
                    lv_remote_user_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_remote_user_7_0, grammarAccess.getEConnectionAccess().getRemote_userSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEConnectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"remote_user",
                    							lv_remote_user_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEConnectionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEConnection"


    // $ANTLR start "entryRuleEPlayExeSettings"
    // InternalAnsibleDsl.g:4181:1: entryRuleEPlayExeSettings returns [EObject current=null] : iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF ;
    public final EObject entryRuleEPlayExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayExeSettings = null;


        try {
            // InternalAnsibleDsl.g:4181:57: (iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF )
            // InternalAnsibleDsl.g:4182:2: iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF
            {
             newCompositeNode(grammarAccess.getEPlayExeSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPlayExeSettings=ruleEPlayExeSettings();

            state._fsp--;

             current =iv_ruleEPlayExeSettings; 
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
    // $ANTLR end "entryRuleEPlayExeSettings"


    // $ANTLR start "ruleEPlayExeSettings"
    // InternalAnsibleDsl.g:4188:1: ruleEPlayExeSettings returns [EObject current=null] : ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleEPlayExeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_strategy_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_order_6_0=null;
        Token otherlv_7=null;
        Token lv_throttle_8_0=null;
        Token otherlv_9=null;
        Token lv_run_once_10_0=null;
        EObject lv_serial_list_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4194:2: ( ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4195:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4195:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4196:3: () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4196:3: ()
            // InternalAnsibleDsl.g:4197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayExeSettingsAccess().getEPlayExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4203:3: (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==89) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalAnsibleDsl.g:4204:4: otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,89,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayExeSettingsAccess().getStrategyKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4208:4: ( (lv_strategy_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4209:5: (lv_strategy_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4209:5: (lv_strategy_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4210:6: lv_strategy_2_0= RULE_STRING
                    {
                    lv_strategy_2_0=(Token)match(input,RULE_STRING,FOLLOW_128); 

                    						newLeafNode(lv_strategy_2_0, grammarAccess.getEPlayExeSettingsAccess().getStrategySTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlayExeSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"strategy",
                    							lv_strategy_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4227:3: (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==90) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalAnsibleDsl.g:4228:4: otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) )
                    {
                    otherlv_3=(Token)match(input,90,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayExeSettingsAccess().getSerialKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4232:4: ( (lv_serial_list_4_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4233:5: (lv_serial_list_4_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4233:5: (lv_serial_list_4_0= ruleEList )
                    // InternalAnsibleDsl.g:4234:6: lv_serial_list_4_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getSerial_listEListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_129);
                    lv_serial_list_4_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPlayExeSettingsRule());
                    						}
                    						set(
                    							current,
                    							"serial_list",
                    							lv_serial_list_4_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4252:3: (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==91) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalAnsibleDsl.g:4253:4: otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,91,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayExeSettingsAccess().getOrderKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4257:4: ( (lv_order_6_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4258:5: (lv_order_6_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4258:5: (lv_order_6_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4259:6: lv_order_6_0= RULE_STRING
                    {
                    lv_order_6_0=(Token)match(input,RULE_STRING,FOLLOW_130); 

                    						newLeafNode(lv_order_6_0, grammarAccess.getEPlayExeSettingsAccess().getOrderSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlayExeSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"order",
                    							lv_order_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4276:3: (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==92) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalAnsibleDsl.g:4277:4: otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) )
                    {
                    otherlv_7=(Token)match(input,92,FOLLOW_113); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayExeSettingsAccess().getThrottleKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4281:4: ( (lv_throttle_8_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4282:5: (lv_throttle_8_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4282:5: (lv_throttle_8_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4283:6: lv_throttle_8_0= RULE_NUMBER
                    {
                    lv_throttle_8_0=(Token)match(input,RULE_NUMBER,FOLLOW_131); 

                    						newLeafNode(lv_throttle_8_0, grammarAccess.getEPlayExeSettingsAccess().getThrottleNUMBERTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlayExeSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"throttle",
                    							lv_throttle_8_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4300:3: (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==93) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalAnsibleDsl.g:4301:4: otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,93,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getEPlayExeSettingsAccess().getRun_onceKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4305:4: ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4306:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4306:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4307:6: lv_run_once_10_0= RULE_BOOLEAN
                    {
                    lv_run_once_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_run_once_10_0, grammarAccess.getEPlayExeSettingsAccess().getRun_onceBOOLEANTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlayExeSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"run_once",
                    							lv_run_once_10_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

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
    // $ANTLR end "ruleEPlayExeSettings"


    // $ANTLR start "entryRuleEExecutionExeSettings"
    // InternalAnsibleDsl.g:4328:1: entryRuleEExecutionExeSettings returns [EObject current=null] : iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF ;
    public final EObject entryRuleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionExeSettings = null;


        try {
            // InternalAnsibleDsl.g:4328:62: (iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF )
            // InternalAnsibleDsl.g:4329:2: iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF
            {
             newCompositeNode(grammarAccess.getEExecutionExeSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEExecutionExeSettings=ruleEExecutionExeSettings();

            state._fsp--;

             current =iv_ruleEExecutionExeSettings; 
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
    // $ANTLR end "entryRuleEExecutionExeSettings"


    // $ANTLR start "ruleEExecutionExeSettings"
    // InternalAnsibleDsl.g:4335:1: ruleEExecutionExeSettings returns [EObject current=null] : ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_throttle_2_0=null;
        Token otherlv_3=null;
        Token lv_run_once_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4341:2: ( ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4342:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4342:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4343:3: () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4343:3: ()
            // InternalAnsibleDsl.g:4344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEExecutionExeSettingsAccess().getEExecutionExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4350:3: (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==92) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalAnsibleDsl.g:4351:4: otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) )
                    {
                    otherlv_1=(Token)match(input,92,FOLLOW_113); 

                    				newLeafNode(otherlv_1, grammarAccess.getEExecutionExeSettingsAccess().getThrottleKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4355:4: ( (lv_throttle_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4356:5: (lv_throttle_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4356:5: (lv_throttle_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4357:6: lv_throttle_2_0= RULE_NUMBER
                    {
                    lv_throttle_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_131); 

                    						newLeafNode(lv_throttle_2_0, grammarAccess.getEExecutionExeSettingsAccess().getThrottleNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEExecutionExeSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"throttle",
                    							lv_throttle_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4374:3: (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==93) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalAnsibleDsl.g:4375:4: otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,93,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getEExecutionExeSettingsAccess().getRun_onceKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4379:4: ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4380:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4380:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4381:6: lv_run_once_4_0= RULE_BOOLEAN
                    {
                    lv_run_once_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_run_once_4_0, grammarAccess.getEExecutionExeSettingsAccess().getRun_onceBOOLEANTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEExecutionExeSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"run_once",
                    							lv_run_once_4_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

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
    // $ANTLR end "ruleEExecutionExeSettings"


    // $ANTLR start "entryRuleEBlockErrorHandling"
    // InternalAnsibleDsl.g:4402:1: entryRuleEBlockErrorHandling returns [EObject current=null] : iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF ;
    public final EObject entryRuleEBlockErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4402:60: (iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF )
            // InternalAnsibleDsl.g:4403:2: iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF
            {
             newCompositeNode(grammarAccess.getEBlockErrorHandlingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBlockErrorHandling=ruleEBlockErrorHandling();

            state._fsp--;

             current =iv_ruleEBlockErrorHandling; 
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
    // $ANTLR end "entryRuleEBlockErrorHandling"


    // $ANTLR start "ruleEBlockErrorHandling"
    // InternalAnsibleDsl.g:4409:1: ruleEBlockErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleEBlockErrorHandling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_any_errors_fatal_2_0=null;
        Token otherlv_3=null;
        Token lv_ignore_errors_4_0=null;
        Token otherlv_5=null;
        Token lv_ignore_unreachable_6_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4415:2: ( ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4416:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4416:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4417:3: () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4417:3: ()
            // InternalAnsibleDsl.g:4418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBlockErrorHandlingAccess().getEBlockErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4424:3: (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==94) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalAnsibleDsl.g:4425:4: otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    {
                    otherlv_1=(Token)match(input,94,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4429:4: ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4430:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4430:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4431:6: lv_any_errors_fatal_2_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_132); 

                    						newLeafNode(lv_any_errors_fatal_2_0, grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalBOOLEANTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEBlockErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"any_errors_fatal",
                    							lv_any_errors_fatal_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4448:3: (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==95) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalAnsibleDsl.g:4449:4: otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,95,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4453:4: ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4454:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4454:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4455:6: lv_ignore_errors_4_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_133); 

                    						newLeafNode(lv_ignore_errors_4_0, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsBOOLEANTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEBlockErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ignore_errors",
                    							lv_ignore_errors_4_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4472:3: (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==96) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalAnsibleDsl.g:4473:4: otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,96,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4477:4: ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4478:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4478:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4479:6: lv_ignore_unreachable_6_0= RULE_BOOLEAN
                    {
                    lv_ignore_unreachable_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_ignore_unreachable_6_0, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableBOOLEANTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEBlockErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ignore_unreachable",
                    							lv_ignore_unreachable_6_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

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
    // $ANTLR end "ruleEBlockErrorHandling"


    // $ANTLR start "entryRuleEPlayErrorHandling"
    // InternalAnsibleDsl.g:4500:1: entryRuleEPlayErrorHandling returns [EObject current=null] : iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF ;
    public final EObject entryRuleEPlayErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4500:59: (iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF )
            // InternalAnsibleDsl.g:4501:2: iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF
            {
             newCompositeNode(grammarAccess.getEPlayErrorHandlingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPlayErrorHandling=ruleEPlayErrorHandling();

            state._fsp--;

             current =iv_ruleEPlayErrorHandling; 
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
    // $ANTLR end "entryRuleEPlayErrorHandling"


    // $ANTLR start "ruleEPlayErrorHandling"
    // InternalAnsibleDsl.g:4507:1: ruleEPlayErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleEPlayErrorHandling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_max_fail_percentage_2_0=null;
        Token otherlv_3=null;
        Token lv_any_errors_fatal_4_0=null;
        Token otherlv_5=null;
        Token lv_ignore_errors_6_0=null;
        Token otherlv_7=null;
        Token lv_ignore_unreachable_8_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4513:2: ( ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4514:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4514:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4515:3: () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4515:3: ()
            // InternalAnsibleDsl.g:4516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayErrorHandlingAccess().getEPlayErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4522:3: (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==97) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalAnsibleDsl.g:4523:4: otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) )
                    {
                    otherlv_1=(Token)match(input,97,FOLLOW_113); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4527:4: ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4528:5: (lv_max_fail_percentage_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4528:5: (lv_max_fail_percentage_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4529:6: lv_max_fail_percentage_2_0= RULE_NUMBER
                    {
                    lv_max_fail_percentage_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_134); 

                    						newLeafNode(lv_max_fail_percentage_2_0, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlayErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max_fail_percentage",
                    							lv_max_fail_percentage_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4546:3: (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==94) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalAnsibleDsl.g:4547:4: otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4551:4: ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4552:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4552:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4553:6: lv_any_errors_fatal_4_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_132); 

                    						newLeafNode(lv_any_errors_fatal_4_0, grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalBOOLEANTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlayErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"any_errors_fatal",
                    							lv_any_errors_fatal_4_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4570:3: (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==95) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalAnsibleDsl.g:4571:4: otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,95,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4575:4: ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4576:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4576:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4577:6: lv_ignore_errors_6_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_133); 

                    						newLeafNode(lv_ignore_errors_6_0, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsBOOLEANTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlayErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ignore_errors",
                    							lv_ignore_errors_6_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4594:3: (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==96) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalAnsibleDsl.g:4595:4: otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,96,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4599:4: ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4600:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4600:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4601:6: lv_ignore_unreachable_8_0= RULE_BOOLEAN
                    {
                    lv_ignore_unreachable_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_ignore_unreachable_8_0, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableBOOLEANTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlayErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ignore_unreachable",
                    							lv_ignore_unreachable_8_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

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
    // $ANTLR end "ruleEPlayErrorHandling"


    // $ANTLR start "entryRuleETaskHandlerErrorHandling"
    // InternalAnsibleDsl.g:4622:1: entryRuleETaskHandlerErrorHandling returns [EObject current=null] : iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF ;
    public final EObject entryRuleETaskHandlerErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4622:66: (iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF )
            // InternalAnsibleDsl.g:4623:2: iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF
            {
             newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETaskHandlerErrorHandling=ruleETaskHandlerErrorHandling();

            state._fsp--;

             current =iv_ruleETaskHandlerErrorHandling; 
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
    // $ANTLR end "entryRuleETaskHandlerErrorHandling"


    // $ANTLR start "ruleETaskHandlerErrorHandling"
    // InternalAnsibleDsl.g:4629:1: ruleETaskHandlerErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleETaskHandlerErrorHandling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_any_errors_fatal_6_0=null;
        Token otherlv_7=null;
        Token lv_ignore_errors_8_0=null;
        Token otherlv_9=null;
        Token lv_ignore_unreachable_10_0=null;
        EObject lv_changed_when_2_0 = null;

        EObject lv_failed_when_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4635:2: ( ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4636:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4636:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4637:3: () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4637:3: ()
            // InternalAnsibleDsl.g:4638:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETaskHandlerErrorHandlingAccess().getETaskHandlerErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4644:3: (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==98) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalAnsibleDsl.g:4645:4: otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_1=(Token)match(input,98,FOLLOW_51); 

                    				newLeafNode(otherlv_1, grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4649:4: ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:4650:5: (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:4650:5: (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:4651:6: lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_135);
                    lv_changed_when_2_0=ruleEJinjaExpressionEvaluationWithoutBrackets();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskHandlerErrorHandlingRule());
                    						}
                    						set(
                    							current,
                    							"changed_when",
                    							lv_changed_when_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionEvaluationWithoutBrackets");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4669:3: (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==99) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalAnsibleDsl.g:4670:4: otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_3=(Token)match(input,99,FOLLOW_51); 

                    				newLeafNode(otherlv_3, grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4674:4: ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:4675:5: (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:4675:5: (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:4676:6: lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_134);
                    lv_failed_when_4_0=ruleEJinjaExpressionEvaluationWithoutBrackets();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskHandlerErrorHandlingRule());
                    						}
                    						set(
                    							current,
                    							"failed_when",
                    							lv_failed_when_4_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionEvaluationWithoutBrackets");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4694:3: (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==94) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalAnsibleDsl.g:4695:4: otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,94,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4699:4: ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4700:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4700:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4701:6: lv_any_errors_fatal_6_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_132); 

                    						newLeafNode(lv_any_errors_fatal_6_0, grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalBOOLEANTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getETaskHandlerErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"any_errors_fatal",
                    							lv_any_errors_fatal_6_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4718:3: (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==95) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalAnsibleDsl.g:4719:4: otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,95,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4723:4: ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4724:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4724:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4725:6: lv_ignore_errors_8_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_133); 

                    						newLeafNode(lv_ignore_errors_8_0, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsBOOLEANTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getETaskHandlerErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ignore_errors",
                    							lv_ignore_errors_8_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4742:3: (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==96) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalAnsibleDsl.g:4743:4: otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,96,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4747:4: ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4748:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4748:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4749:6: lv_ignore_unreachable_10_0= RULE_BOOLEAN
                    {
                    lv_ignore_unreachable_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_ignore_unreachable_10_0, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableBOOLEANTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getETaskHandlerErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ignore_unreachable",
                    							lv_ignore_unreachable_10_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

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
    // $ANTLR end "ruleETaskHandlerErrorHandling"


    // $ANTLR start "entryRuleEFactsSettings"
    // InternalAnsibleDsl.g:4770:1: entryRuleEFactsSettings returns [EObject current=null] : iv_ruleEFactsSettings= ruleEFactsSettings EOF ;
    public final EObject entryRuleEFactsSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactsSettings = null;


        try {
            // InternalAnsibleDsl.g:4770:55: (iv_ruleEFactsSettings= ruleEFactsSettings EOF )
            // InternalAnsibleDsl.g:4771:2: iv_ruleEFactsSettings= ruleEFactsSettings EOF
            {
             newCompositeNode(grammarAccess.getEFactsSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFactsSettings=ruleEFactsSettings();

            state._fsp--;

             current =iv_ruleEFactsSettings; 
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
    // $ANTLR end "entryRuleEFactsSettings"


    // $ANTLR start "ruleEFactsSettings"
    // InternalAnsibleDsl.g:4777:1: ruleEFactsSettings returns [EObject current=null] : ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleEFactsSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_gather_facts_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_gather_timeout_7_0=null;
        Token otherlv_8=null;
        Token lv_fact_path_9_0=null;
        Token otherlv_10=null;
        EObject lv_gather_subset_5_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4783:2: ( ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalAnsibleDsl.g:4784:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalAnsibleDsl.g:4784:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalAnsibleDsl.g:4785:3: () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // InternalAnsibleDsl.g:4785:3: ()
            // InternalAnsibleDsl.g:4786:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactsSettingsAccess().getEFactsSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_136); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactsSettingsAccess().getFacts_setttingsKeyword_1());
            		
            // InternalAnsibleDsl.g:4796:3: (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==101) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalAnsibleDsl.g:4797:4: otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,101,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getEFactsSettingsAccess().getGather_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4801:4: ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4802:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4802:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4803:6: lv_gather_facts_3_0= RULE_BOOLEAN
                    {
                    lv_gather_facts_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_137); 

                    						newLeafNode(lv_gather_facts_3_0, grammarAccess.getEFactsSettingsAccess().getGather_factsBOOLEANTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEFactsSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"gather_facts",
                    							lv_gather_facts_3_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4820:3: (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==102) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalAnsibleDsl.g:4821:4: otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) )
                    {
                    otherlv_4=(Token)match(input,102,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getEFactsSettingsAccess().getGather_subsetKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4825:4: ( (lv_gather_subset_5_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4826:5: (lv_gather_subset_5_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4826:5: (lv_gather_subset_5_0= ruleEList )
                    // InternalAnsibleDsl.g:4827:6: lv_gather_subset_5_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEFactsSettingsAccess().getGather_subsetEListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_138);
                    lv_gather_subset_5_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEFactsSettingsRule());
                    						}
                    						set(
                    							current,
                    							"gather_subset",
                    							lv_gather_subset_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4845:3: (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==103) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalAnsibleDsl.g:4846:4: otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) )
                    {
                    otherlv_6=(Token)match(input,103,FOLLOW_113); 

                    				newLeafNode(otherlv_6, grammarAccess.getEFactsSettingsAccess().getGather_timeoutKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4850:4: ( (lv_gather_timeout_7_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4851:5: (lv_gather_timeout_7_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4851:5: (lv_gather_timeout_7_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4852:6: lv_gather_timeout_7_0= RULE_NUMBER
                    {
                    lv_gather_timeout_7_0=(Token)match(input,RULE_NUMBER,FOLLOW_139); 

                    						newLeafNode(lv_gather_timeout_7_0, grammarAccess.getEFactsSettingsAccess().getGather_timeoutNUMBERTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEFactsSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"gather_timeout",
                    							lv_gather_timeout_7_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4869:3: (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==104) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalAnsibleDsl.g:4870:4: otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,104,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEFactsSettingsAccess().getFact_pathKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4874:4: ( (lv_fact_path_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4875:5: (lv_fact_path_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4875:5: (lv_fact_path_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4876:6: lv_fact_path_9_0= RULE_STRING
                    {
                    lv_fact_path_9_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_fact_path_9_0, grammarAccess.getEFactsSettingsAccess().getFact_pathSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEFactsSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"fact_path",
                    							lv_fact_path_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEFactsSettingsAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleEFactsSettings"


    // $ANTLR start "entryRuleEDelegation"
    // InternalAnsibleDsl.g:4901:1: entryRuleEDelegation returns [EObject current=null] : iv_ruleEDelegation= ruleEDelegation EOF ;
    public final EObject entryRuleEDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDelegation = null;


        try {
            // InternalAnsibleDsl.g:4901:52: (iv_ruleEDelegation= ruleEDelegation EOF )
            // InternalAnsibleDsl.g:4902:2: iv_ruleEDelegation= ruleEDelegation EOF
            {
             newCompositeNode(grammarAccess.getEDelegationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDelegation=ruleEDelegation();

            state._fsp--;

             current =iv_ruleEDelegation; 
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
    // $ANTLR end "entryRuleEDelegation"


    // $ANTLR start "ruleEDelegation"
    // InternalAnsibleDsl.g:4908:1: ruleEDelegation returns [EObject current=null] : (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleEDelegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_delegate_to_2_0=null;
        Token otherlv_3=null;
        Token lv_delegate_facts_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4914:2: ( (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) )
            // InternalAnsibleDsl.g:4915:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            {
            // InternalAnsibleDsl.g:4915:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            // InternalAnsibleDsl.g:4916:3: otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,105,FOLLOW_140); 

            			newLeafNode(otherlv_0, grammarAccess.getEDelegationAccess().getDelegationKeyword_0());
            		
            // InternalAnsibleDsl.g:4920:3: (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4921:4: otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,106,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEDelegationAccess().getDelegate_toKeyword_1_0());
            			
            // InternalAnsibleDsl.g:4925:4: ( (lv_delegate_to_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4926:5: (lv_delegate_to_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4926:5: (lv_delegate_to_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:4927:6: lv_delegate_to_2_0= RULE_STRING
            {
            lv_delegate_to_2_0=(Token)match(input,RULE_STRING,FOLLOW_141); 

            						newLeafNode(lv_delegate_to_2_0, grammarAccess.getEDelegationAccess().getDelegate_toSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEDelegationRule());
            						}
            						setWithLastConsumed(
            							current,
            							"delegate_to",
            							lv_delegate_to_2_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalAnsibleDsl.g:4944:3: (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==107) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalAnsibleDsl.g:4945:4: otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,107,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getEDelegationAccess().getDelegate_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4949:4: ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4950:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4950:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4951:6: lv_delegate_facts_4_0= RULE_BOOLEAN
                    {
                    lv_delegate_facts_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_9); 

                    						newLeafNode(lv_delegate_facts_4_0, grammarAccess.getEDelegationAccess().getDelegate_factsBOOLEANTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEDelegationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"delegate_facts",
                    							lv_delegate_facts_4_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEDelegationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEDelegation"


    // $ANTLR start "entryRuleEAsynchronousSettings"
    // InternalAnsibleDsl.g:4976:1: entryRuleEAsynchronousSettings returns [EObject current=null] : iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF ;
    public final EObject entryRuleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAsynchronousSettings = null;


        try {
            // InternalAnsibleDsl.g:4976:62: (iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF )
            // InternalAnsibleDsl.g:4977:2: iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF
            {
             newCompositeNode(grammarAccess.getEAsynchronousSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAsynchronousSettings=ruleEAsynchronousSettings();

            state._fsp--;

             current =iv_ruleEAsynchronousSettings; 
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
    // $ANTLR end "entryRuleEAsynchronousSettings"


    // $ANTLR start "ruleEAsynchronousSettings"
    // InternalAnsibleDsl.g:4983:1: ruleEAsynchronousSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_async_2_0=null;
        Token otherlv_3=null;
        Token lv_poll_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4989:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:4990:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:4990:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:4991:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:4991:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:4992:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4995:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:4996:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:4996:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+
            int cnt153=0;
            loop153:
            do {
                int alt153=3;
                int LA153_0 = input.LA(1);

                if ( LA153_0 == 108 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt153=1;
                }
                else if ( LA153_0 == 109 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt153=2;
                }


                switch (alt153) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4997:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4997:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4998:4: {...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4998:115: ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:4999:5: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:5002:8: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:5002:9: {...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:5002:18: (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:5002:19: otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) )
            	    {
            	    otherlv_1=(Token)match(input,108,FOLLOW_113); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAsynchronousSettingsAccess().getAsyncKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:5006:8: ( (lv_async_2_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:5007:9: (lv_async_2_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:5007:9: (lv_async_2_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:5008:10: lv_async_2_0= RULE_NUMBER
            	    {
            	    lv_async_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_142); 

            	    										newLeafNode(lv_async_2_0, grammarAccess.getEAsynchronousSettingsAccess().getAsyncNUMBERTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAsynchronousSettingsRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"async",
            	    											lv_async_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:5030:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:5030:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:5031:4: {...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:5031:115: ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:5032:5: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:5035:8: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:5035:9: {...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:5035:18: (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:5035:19: otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) )
            	    {
            	    otherlv_3=(Token)match(input,109,FOLLOW_113); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAsynchronousSettingsAccess().getPollKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:5039:8: ( (lv_poll_4_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:5040:9: (lv_poll_4_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:5040:9: (lv_poll_4_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:5041:10: lv_poll_4_0= RULE_NUMBER
            	    {
            	    lv_poll_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_142); 

            	    										newLeafNode(lv_poll_4_0, grammarAccess.getEAsynchronousSettingsAccess().getPollNUMBERTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAsynchronousSettingsRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"poll",
            	    											lv_poll_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt153 >= 1 ) break loop153;
                        EarlyExitException eee =
                            new EarlyExitException(153, input);
                        throw eee;
                }
                cnt153++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canLeave(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleEAsynchronousSettings"


    // $ANTLR start "entryRuleENotifiable"
    // InternalAnsibleDsl.g:5074:1: entryRuleENotifiable returns [EObject current=null] : iv_ruleENotifiable= ruleENotifiable EOF ;
    public final EObject entryRuleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiable = null;


        try {
            // InternalAnsibleDsl.g:5074:52: (iv_ruleENotifiable= ruleENotifiable EOF )
            // InternalAnsibleDsl.g:5075:2: iv_ruleENotifiable= ruleENotifiable EOF
            {
             newCompositeNode(grammarAccess.getENotifiableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENotifiable=ruleENotifiable();

            state._fsp--;

             current =iv_ruleENotifiable; 
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
    // $ANTLR end "entryRuleENotifiable"


    // $ANTLR start "ruleENotifiable"
    // InternalAnsibleDsl.g:5081:1: ruleENotifiable returns [EObject current=null] : (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) ;
    public final EObject ruleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject this_ENotifiedHandler_0 = null;

        EObject this_ENotifiedTopic_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5087:2: ( (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) )
            // InternalAnsibleDsl.g:5088:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            {
            // InternalAnsibleDsl.g:5088:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==RULE_STRING) ) {
                alt154=1;
            }
            else if ( (LA154_0==110) ) {
                alt154=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }
            switch (alt154) {
                case 1 :
                    // InternalAnsibleDsl.g:5089:3: this_ENotifiedHandler_0= ruleENotifiedHandler
                    {

                    			newCompositeNode(grammarAccess.getENotifiableAccess().getENotifiedHandlerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ENotifiedHandler_0=ruleENotifiedHandler();

                    state._fsp--;


                    			current = this_ENotifiedHandler_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5098:3: this_ENotifiedTopic_1= ruleENotifiedTopic
                    {

                    			newCompositeNode(grammarAccess.getENotifiableAccess().getENotifiedTopicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ENotifiedTopic_1=ruleENotifiedTopic();

                    state._fsp--;


                    			current = this_ENotifiedTopic_1;
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
    // $ANTLR end "ruleENotifiable"


    // $ANTLR start "entryRuleENotifiedHandler"
    // InternalAnsibleDsl.g:5110:1: entryRuleENotifiedHandler returns [EObject current=null] : iv_ruleENotifiedHandler= ruleENotifiedHandler EOF ;
    public final EObject entryRuleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedHandler = null;


        try {
            // InternalAnsibleDsl.g:5110:57: (iv_ruleENotifiedHandler= ruleENotifiedHandler EOF )
            // InternalAnsibleDsl.g:5111:2: iv_ruleENotifiedHandler= ruleENotifiedHandler EOF
            {
             newCompositeNode(grammarAccess.getENotifiedHandlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENotifiedHandler=ruleENotifiedHandler();

            state._fsp--;

             current =iv_ruleENotifiedHandler; 
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
    // $ANTLR end "entryRuleENotifiedHandler"


    // $ANTLR start "ruleENotifiedHandler"
    // InternalAnsibleDsl.g:5117:1: ruleENotifiedHandler returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5123:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:5124:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalAnsibleDsl.g:5124:2: ( (otherlv_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:5125:3: (otherlv_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:5125:3: (otherlv_0= RULE_STRING )
            // InternalAnsibleDsl.g:5126:4: otherlv_0= RULE_STRING
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getENotifiedHandlerRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getENotifiedHandlerAccess().getNameEHandlerCrossReference_0());
            			

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
    // $ANTLR end "ruleENotifiedHandler"


    // $ANTLR start "entryRuleENotifiedTopic"
    // InternalAnsibleDsl.g:5140:1: entryRuleENotifiedTopic returns [EObject current=null] : iv_ruleENotifiedTopic= ruleENotifiedTopic EOF ;
    public final EObject entryRuleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedTopic = null;


        try {
            // InternalAnsibleDsl.g:5140:55: (iv_ruleENotifiedTopic= ruleENotifiedTopic EOF )
            // InternalAnsibleDsl.g:5141:2: iv_ruleENotifiedTopic= ruleENotifiedTopic EOF
            {
             newCompositeNode(grammarAccess.getENotifiedTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENotifiedTopic=ruleENotifiedTopic();

            state._fsp--;

             current =iv_ruleENotifiedTopic; 
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
    // $ANTLR end "entryRuleENotifiedTopic"


    // $ANTLR start "ruleENotifiedTopic"
    // InternalAnsibleDsl.g:5147:1: ruleENotifiedTopic returns [EObject current=null] : (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5153:2: ( (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:5154:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:5154:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:5155:3: otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,110,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getENotifiedTopicAccess().getTopicKeyword_0());
            		
            // InternalAnsibleDsl.g:5159:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:5160:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:5160:4: (lv_name_1_0= RULE_STRING )
            // InternalAnsibleDsl.g:5161:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getENotifiedTopicAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getENotifiedTopicRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleENotifiedTopic"


    // $ANTLR start "entryRuleEJinjaExpressionOrString"
    // InternalAnsibleDsl.g:5181:1: entryRuleEJinjaExpressionOrString returns [EObject current=null] : iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF ;
    public final EObject entryRuleEJinjaExpressionOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionOrString = null;


        try {
            // InternalAnsibleDsl.g:5181:65: (iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF )
            // InternalAnsibleDsl.g:5182:2: iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF
            {
             newCompositeNode(grammarAccess.getEJinjaExpressionOrStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEJinjaExpressionOrString=ruleEJinjaExpressionOrString();

            state._fsp--;

             current =iv_ruleEJinjaExpressionOrString; 
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
    // $ANTLR end "entryRuleEJinjaExpressionOrString"


    // $ANTLR start "ruleEJinjaExpressionOrString"
    // InternalAnsibleDsl.g:5188:1: ruleEJinjaExpressionOrString returns [EObject current=null] : (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEJinjaExpressionOrString() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject this_EJinjaExpressionEvaluation_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5194:2: ( (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:5195:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:5195:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==115) ) {
                alt155=1;
            }
            else if ( (LA155_0==RULE_STRING) ) {
                alt155=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // InternalAnsibleDsl.g:5196:3: this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation
                    {

                    			newCompositeNode(grammarAccess.getEJinjaExpressionOrStringAccess().getEJinjaExpressionEvaluationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EJinjaExpressionEvaluation_0=ruleEJinjaExpressionEvaluation();

                    state._fsp--;


                    			current = this_EJinjaExpressionEvaluation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5205:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:5205:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:5206:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:5206:4: (lv_string_1_0= RULE_STRING )
                    // InternalAnsibleDsl.g:5207:5: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_1_0, grammarAccess.getEJinjaExpressionOrStringAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEJinjaExpressionOrStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


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
    // $ANTLR end "ruleEJinjaExpressionOrString"


    // $ANTLR start "entryRuleEJinjaExpressionAndString"
    // InternalAnsibleDsl.g:5227:1: entryRuleEJinjaExpressionAndString returns [EObject current=null] : iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF ;
    public final EObject entryRuleEJinjaExpressionAndString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionAndString = null;


        try {
            // InternalAnsibleDsl.g:5227:66: (iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF )
            // InternalAnsibleDsl.g:5228:2: iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF
            {
             newCompositeNode(grammarAccess.getEJinjaExpressionAndStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEJinjaExpressionAndString=ruleEJinjaExpressionAndString();

            state._fsp--;

             current =iv_ruleEJinjaExpressionAndString; 
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
    // $ANTLR end "entryRuleEJinjaExpressionAndString"


    // $ANTLR start "ruleEJinjaExpressionAndString"
    // InternalAnsibleDsl.g:5234:1: ruleEJinjaExpressionAndString returns [EObject current=null] : ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+ ;
    public final EObject ruleEJinjaExpressionAndString() throws RecognitionException {
        EObject current = null;

        EObject lv_jinja_expression_and_string_0_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5240:2: ( ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+ )
            // InternalAnsibleDsl.g:5241:2: ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+
            {
            // InternalAnsibleDsl.g:5241:2: ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+
            int cnt156=0;
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==RULE_STRING||LA156_0==115) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5242:3: (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString )
            	    {
            	    // InternalAnsibleDsl.g:5242:3: (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString )
            	    // InternalAnsibleDsl.g:5243:4: lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString
            	    {

            	    				newCompositeNode(grammarAccess.getEJinjaExpressionAndStringAccess().getJinja_expression_and_stringEJinjaExpressionOrStringParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_143);
            	    lv_jinja_expression_and_string_0_0=ruleEJinjaExpressionOrString();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getEJinjaExpressionAndStringRule());
            	    				}
            	    				add(
            	    					current,
            	    					"jinja_expression_and_string",
            	    					lv_jinja_expression_and_string_0_0,
            	    					"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionOrString");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt156 >= 1 ) break loop156;
                        EarlyExitException eee =
                            new EarlyExitException(156, input);
                        throw eee;
                }
                cnt156++;
            } while (true);


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
    // $ANTLR end "ruleEJinjaExpressionAndString"


    // $ANTLR start "entryRuleEValuePassed"
    // InternalAnsibleDsl.g:5263:1: entryRuleEValuePassed returns [EObject current=null] : iv_ruleEValuePassed= ruleEValuePassed EOF ;
    public final EObject entryRuleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassed = null;


        try {
            // InternalAnsibleDsl.g:5263:53: (iv_ruleEValuePassed= ruleEValuePassed EOF )
            // InternalAnsibleDsl.g:5264:2: iv_ruleEValuePassed= ruleEValuePassed EOF
            {
             newCompositeNode(grammarAccess.getEValuePassedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValuePassed=ruleEValuePassed();

            state._fsp--;

             current =iv_ruleEValuePassed; 
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
    // $ANTLR end "entryRuleEValuePassed"


    // $ANTLR start "ruleEValuePassed"
    // InternalAnsibleDsl.g:5270:1: ruleEValuePassed returns [EObject current=null] : (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString ) ;
    public final EObject ruleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject this_EJinjaExpressionAndString_0 = null;

        EObject this_EValueWithoutString_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5276:2: ( (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString ) )
            // InternalAnsibleDsl.g:5277:2: (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString )
            {
            // InternalAnsibleDsl.g:5277:2: (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString )
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==RULE_STRING||LA157_0==115) ) {
                alt157=1;
            }
            else if ( (LA157_0==RULE_BOOLEAN||(LA157_0>=RULE_NUMBER && LA157_0<=RULE_NULL)||LA157_0==113||LA157_0==143) ) {
                alt157=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }
            switch (alt157) {
                case 1 :
                    // InternalAnsibleDsl.g:5278:3: this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedAccess().getEJinjaExpressionAndStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EJinjaExpressionAndString_0=ruleEJinjaExpressionAndString();

                    state._fsp--;


                    			current = this_EJinjaExpressionAndString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5287:3: this_EValueWithoutString_1= ruleEValueWithoutString
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedAccess().getEValueWithoutStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EValueWithoutString_1=ruleEValueWithoutString();

                    state._fsp--;


                    			current = this_EValueWithoutString_1;
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
    // $ANTLR end "ruleEValuePassed"


    // $ANTLR start "entryRuleEValuePassedToJinjaExpression"
    // InternalAnsibleDsl.g:5299:1: entryRuleEValuePassedToJinjaExpression returns [EObject current=null] : iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF ;
    public final EObject entryRuleEValuePassedToJinjaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassedToJinjaExpression = null;


        try {
            // InternalAnsibleDsl.g:5299:70: (iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF )
            // InternalAnsibleDsl.g:5300:2: iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF
            {
             newCompositeNode(grammarAccess.getEValuePassedToJinjaExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValuePassedToJinjaExpression=ruleEValuePassedToJinjaExpression();

            state._fsp--;

             current =iv_ruleEValuePassedToJinjaExpression; 
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
    // $ANTLR end "entryRuleEValuePassedToJinjaExpression"


    // $ANTLR start "ruleEValuePassedToJinjaExpression"
    // InternalAnsibleDsl.g:5306:1: ruleEValuePassedToJinjaExpression returns [EObject current=null] : (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EDeclaredVariableReference_3= ruleEDeclaredVariableReference | this_EFunctionCall_4= ruleEFunctionCall ) ;
    public final EObject ruleEValuePassedToJinjaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EValue_0 = null;

        EObject this_EFactGathered_1 = null;

        EObject this_EItem_2 = null;

        EObject this_EDeclaredVariableReference_3 = null;

        EObject this_EFunctionCall_4 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5312:2: ( (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EDeclaredVariableReference_3= ruleEDeclaredVariableReference | this_EFunctionCall_4= ruleEFunctionCall ) )
            // InternalAnsibleDsl.g:5313:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EDeclaredVariableReference_3= ruleEDeclaredVariableReference | this_EFunctionCall_4= ruleEFunctionCall )
            {
            // InternalAnsibleDsl.g:5313:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EDeclaredVariableReference_3= ruleEDeclaredVariableReference | this_EFunctionCall_4= ruleEFunctionCall )
            int alt158=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_BOOLEAN:
            case RULE_NUMBER:
            case RULE_NULL:
            case 113:
            case 143:
                {
                alt158=1;
                }
                break;
            case 142:
                {
                alt158=2;
                }
                break;
            case 111:
                {
                alt158=3;
                }
                break;
            case RULE_ID:
                {
                int LA158_4 = input.LA(2);

                if ( (LA158_4==EOF||LA158_4==19||LA158_4==33||LA158_4==35||LA158_4==47||(LA158_4>=52 && LA158_4<=55)||LA158_4==59||(LA158_4>=73 && LA158_4<=75)||(LA158_4>=94 && LA158_4<=96)||LA158_4==99||(LA158_4>=112 && LA158_4<=113)||LA158_4==116||(LA158_4>=118 && LA158_4<=137)||(LA158_4>=139 && LA158_4<=141)) ) {
                    alt158=4;
                }
                else if ( (LA158_4==117) ) {
                    alt158=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 158, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }

            switch (alt158) {
                case 1 :
                    // InternalAnsibleDsl.g:5314:3: this_EValue_0= ruleEValue
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedToJinjaExpressionAccess().getEValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EValue_0=ruleEValue();

                    state._fsp--;


                    			current = this_EValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5323:3: this_EFactGathered_1= ruleEFactGathered
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedToJinjaExpressionAccess().getEFactGatheredParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFactGathered_1=ruleEFactGathered();

                    state._fsp--;


                    			current = this_EFactGathered_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:5332:3: this_EItem_2= ruleEItem
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedToJinjaExpressionAccess().getEItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EItem_2=ruleEItem();

                    state._fsp--;


                    			current = this_EItem_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAnsibleDsl.g:5341:3: this_EDeclaredVariableReference_3= ruleEDeclaredVariableReference
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedToJinjaExpressionAccess().getEDeclaredVariableReferenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EDeclaredVariableReference_3=ruleEDeclaredVariableReference();

                    state._fsp--;


                    			current = this_EDeclaredVariableReference_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAnsibleDsl.g:5350:3: this_EFunctionCall_4= ruleEFunctionCall
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedToJinjaExpressionAccess().getEFunctionCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFunctionCall_4=ruleEFunctionCall();

                    state._fsp--;


                    			current = this_EFunctionCall_4;
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
    // $ANTLR end "ruleEValuePassedToJinjaExpression"


    // $ANTLR start "entryRuleEComposedValue"
    // InternalAnsibleDsl.g:5362:1: entryRuleEComposedValue returns [EObject current=null] : iv_ruleEComposedValue= ruleEComposedValue EOF ;
    public final EObject entryRuleEComposedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComposedValue = null;


        try {
            // InternalAnsibleDsl.g:5362:55: (iv_ruleEComposedValue= ruleEComposedValue EOF )
            // InternalAnsibleDsl.g:5363:2: iv_ruleEComposedValue= ruleEComposedValue EOF
            {
             newCompositeNode(grammarAccess.getEComposedValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEComposedValue=ruleEComposedValue();

            state._fsp--;

             current =iv_ruleEComposedValue; 
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
    // $ANTLR end "entryRuleEComposedValue"


    // $ANTLR start "ruleEComposedValue"
    // InternalAnsibleDsl.g:5369:1: ruleEComposedValue returns [EObject current=null] : (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList ) ;
    public final EObject ruleEComposedValue() throws RecognitionException {
        EObject current = null;

        EObject this_EDictionary_0 = null;

        EObject this_EList_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5375:2: ( (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList ) )
            // InternalAnsibleDsl.g:5376:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList )
            {
            // InternalAnsibleDsl.g:5376:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList )
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==143) ) {
                alt159=1;
            }
            else if ( (LA159_0==113) ) {
                alt159=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }
            switch (alt159) {
                case 1 :
                    // InternalAnsibleDsl.g:5377:3: this_EDictionary_0= ruleEDictionary
                    {

                    			newCompositeNode(grammarAccess.getEComposedValueAccess().getEDictionaryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EDictionary_0=ruleEDictionary();

                    state._fsp--;


                    			current = this_EDictionary_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5386:3: this_EList_1= ruleEList
                    {

                    			newCompositeNode(grammarAccess.getEComposedValueAccess().getEListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EList_1=ruleEList();

                    state._fsp--;


                    			current = this_EList_1;
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
    // $ANTLR end "ruleEComposedValue"


    // $ANTLR start "entryRuleEValue"
    // InternalAnsibleDsl.g:5398:1: entryRuleEValue returns [EObject current=null] : iv_ruleEValue= ruleEValue EOF ;
    public final EObject entryRuleEValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValue = null;


        try {
            // InternalAnsibleDsl.g:5398:47: (iv_ruleEValue= ruleEValue EOF )
            // InternalAnsibleDsl.g:5399:2: iv_ruleEValue= ruleEValue EOF
            {
             newCompositeNode(grammarAccess.getEValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValue=ruleEValue();

            state._fsp--;

             current =iv_ruleEValue; 
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
    // $ANTLR end "entryRuleEValue"


    // $ANTLR start "ruleEValue"
    // InternalAnsibleDsl.g:5405:1: ruleEValue returns [EObject current=null] : (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue ) ;
    public final EObject ruleEValue() throws RecognitionException {
        EObject current = null;

        EObject this_EComposedValue_0 = null;

        EObject this_ESimpleValue_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5411:2: ( (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue ) )
            // InternalAnsibleDsl.g:5412:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue )
            {
            // InternalAnsibleDsl.g:5412:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==113||LA160_0==143) ) {
                alt160=1;
            }
            else if ( ((LA160_0>=RULE_STRING && LA160_0<=RULE_BOOLEAN)||(LA160_0>=RULE_NUMBER && LA160_0<=RULE_NULL)) ) {
                alt160=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }
            switch (alt160) {
                case 1 :
                    // InternalAnsibleDsl.g:5413:3: this_EComposedValue_0= ruleEComposedValue
                    {

                    			newCompositeNode(grammarAccess.getEValueAccess().getEComposedValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EComposedValue_0=ruleEComposedValue();

                    state._fsp--;


                    			current = this_EComposedValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5422:3: this_ESimpleValue_1= ruleESimpleValue
                    {

                    			newCompositeNode(grammarAccess.getEValueAccess().getESimpleValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESimpleValue_1=ruleESimpleValue();

                    state._fsp--;


                    			current = this_ESimpleValue_1;
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
    // $ANTLR end "ruleEValue"


    // $ANTLR start "entryRuleEValueWithoutString"
    // InternalAnsibleDsl.g:5434:1: entryRuleEValueWithoutString returns [EObject current=null] : iv_ruleEValueWithoutString= ruleEValueWithoutString EOF ;
    public final EObject entryRuleEValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueWithoutString = null;


        try {
            // InternalAnsibleDsl.g:5434:60: (iv_ruleEValueWithoutString= ruleEValueWithoutString EOF )
            // InternalAnsibleDsl.g:5435:2: iv_ruleEValueWithoutString= ruleEValueWithoutString EOF
            {
             newCompositeNode(grammarAccess.getEValueWithoutStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValueWithoutString=ruleEValueWithoutString();

            state._fsp--;

             current =iv_ruleEValueWithoutString; 
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
    // $ANTLR end "entryRuleEValueWithoutString"


    // $ANTLR start "ruleEValueWithoutString"
    // InternalAnsibleDsl.g:5441:1: ruleEValueWithoutString returns [EObject current=null] : (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString ) ;
    public final EObject ruleEValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject this_EComposedValue_0 = null;

        EObject this_ESimpleValueWithoutString_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5447:2: ( (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString ) )
            // InternalAnsibleDsl.g:5448:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString )
            {
            // InternalAnsibleDsl.g:5448:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==113||LA161_0==143) ) {
                alt161=1;
            }
            else if ( (LA161_0==RULE_BOOLEAN||(LA161_0>=RULE_NUMBER && LA161_0<=RULE_NULL)) ) {
                alt161=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // InternalAnsibleDsl.g:5449:3: this_EComposedValue_0= ruleEComposedValue
                    {

                    			newCompositeNode(grammarAccess.getEValueWithoutStringAccess().getEComposedValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EComposedValue_0=ruleEComposedValue();

                    state._fsp--;


                    			current = this_EComposedValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5458:3: this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString
                    {

                    			newCompositeNode(grammarAccess.getEValueWithoutStringAccess().getESimpleValueWithoutStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESimpleValueWithoutString_1=ruleESimpleValueWithoutString();

                    state._fsp--;


                    			current = this_ESimpleValueWithoutString_1;
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
    // $ANTLR end "ruleEValueWithoutString"


    // $ANTLR start "entryRuleESimpleValueWithoutString"
    // InternalAnsibleDsl.g:5470:1: entryRuleESimpleValueWithoutString returns [EObject current=null] : iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF ;
    public final EObject entryRuleESimpleValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESimpleValueWithoutString = null;


        try {
            // InternalAnsibleDsl.g:5470:66: (iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF )
            // InternalAnsibleDsl.g:5471:2: iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF
            {
             newCompositeNode(grammarAccess.getESimpleValueWithoutStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESimpleValueWithoutString=ruleESimpleValueWithoutString();

            state._fsp--;

             current =iv_ruleESimpleValueWithoutString; 
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
    // $ANTLR end "entryRuleESimpleValueWithoutString"


    // $ANTLR start "ruleESimpleValueWithoutString"
    // InternalAnsibleDsl.g:5477:1: ruleESimpleValueWithoutString returns [EObject current=null] : ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleESimpleValueWithoutString() throws RecognitionException {
        EObject current = null;

        Token lv_simple_value_0_0=null;
        Token lv_simple_value_1_0=null;
        Token lv_simple_value_2_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5483:2: ( ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) ) )
            // InternalAnsibleDsl.g:5484:2: ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) )
            {
            // InternalAnsibleDsl.g:5484:2: ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) )
            int alt162=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt162=1;
                }
                break;
            case RULE_NULL:
                {
                alt162=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt162=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;
            }

            switch (alt162) {
                case 1 :
                    // InternalAnsibleDsl.g:5485:3: ( (lv_simple_value_0_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:5485:3: ( (lv_simple_value_0_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:5486:4: (lv_simple_value_0_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:5486:4: (lv_simple_value_0_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:5487:5: lv_simple_value_0_0= RULE_BOOLEAN
                    {
                    lv_simple_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_simple_value_0_0, grammarAccess.getESimpleValueWithoutStringAccess().getSimple_valueBOOLEANTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueWithoutStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"simple_value",
                    						lv_simple_value_0_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5504:3: ( (lv_simple_value_1_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:5504:3: ( (lv_simple_value_1_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:5505:4: (lv_simple_value_1_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:5505:4: (lv_simple_value_1_0= RULE_NULL )
                    // InternalAnsibleDsl.g:5506:5: lv_simple_value_1_0= RULE_NULL
                    {
                    lv_simple_value_1_0=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    					newLeafNode(lv_simple_value_1_0, grammarAccess.getESimpleValueWithoutStringAccess().getSimple_valueNULLTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueWithoutStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"simple_value",
                    						lv_simple_value_1_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NULL");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:5523:3: ( (lv_simple_value_2_0= RULE_NUMBER ) )
                    {
                    // InternalAnsibleDsl.g:5523:3: ( (lv_simple_value_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:5524:4: (lv_simple_value_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:5524:4: (lv_simple_value_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:5525:5: lv_simple_value_2_0= RULE_NUMBER
                    {
                    lv_simple_value_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_simple_value_2_0, grammarAccess.getESimpleValueWithoutStringAccess().getSimple_valueNUMBERTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueWithoutStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"simple_value",
                    						lv_simple_value_2_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    				

                    }


                    }


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
    // $ANTLR end "ruleESimpleValueWithoutString"


    // $ANTLR start "entryRuleESimpleValue"
    // InternalAnsibleDsl.g:5545:1: entryRuleESimpleValue returns [EObject current=null] : iv_ruleESimpleValue= ruleESimpleValue EOF ;
    public final EObject entryRuleESimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESimpleValue = null;


        try {
            // InternalAnsibleDsl.g:5545:53: (iv_ruleESimpleValue= ruleESimpleValue EOF )
            // InternalAnsibleDsl.g:5546:2: iv_ruleESimpleValue= ruleESimpleValue EOF
            {
             newCompositeNode(grammarAccess.getESimpleValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESimpleValue=ruleESimpleValue();

            state._fsp--;

             current =iv_ruleESimpleValue; 
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
    // $ANTLR end "entryRuleESimpleValue"


    // $ANTLR start "ruleESimpleValue"
    // InternalAnsibleDsl.g:5552:1: ruleESimpleValue returns [EObject current=null] : ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_string_1_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_string_2_0= RULE_NULL ) ) | ( (lv_simple_value_string_3_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleESimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_simple_value_string_0_0=null;
        Token lv_simple_value_string_1_0=null;
        Token lv_simple_value_string_2_0=null;
        Token lv_simple_value_string_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5558:2: ( ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_string_1_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_string_2_0= RULE_NULL ) ) | ( (lv_simple_value_string_3_0= RULE_NUMBER ) ) ) )
            // InternalAnsibleDsl.g:5559:2: ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_string_1_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_string_2_0= RULE_NULL ) ) | ( (lv_simple_value_string_3_0= RULE_NUMBER ) ) )
            {
            // InternalAnsibleDsl.g:5559:2: ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_string_1_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_string_2_0= RULE_NULL ) ) | ( (lv_simple_value_string_3_0= RULE_NUMBER ) ) )
            int alt163=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt163=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt163=2;
                }
                break;
            case RULE_NULL:
                {
                alt163=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt163=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }

            switch (alt163) {
                case 1 :
                    // InternalAnsibleDsl.g:5560:3: ( (lv_simple_value_string_0_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:5560:3: ( (lv_simple_value_string_0_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:5561:4: (lv_simple_value_string_0_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:5561:4: (lv_simple_value_string_0_0= RULE_STRING )
                    // InternalAnsibleDsl.g:5562:5: lv_simple_value_string_0_0= RULE_STRING
                    {
                    lv_simple_value_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_simple_value_string_0_0, grammarAccess.getESimpleValueAccess().getSimple_value_stringSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"simple_value_string",
                    						lv_simple_value_string_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5579:3: ( (lv_simple_value_string_1_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:5579:3: ( (lv_simple_value_string_1_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:5580:4: (lv_simple_value_string_1_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:5580:4: (lv_simple_value_string_1_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:5581:5: lv_simple_value_string_1_0= RULE_BOOLEAN
                    {
                    lv_simple_value_string_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_simple_value_string_1_0, grammarAccess.getESimpleValueAccess().getSimple_value_stringBOOLEANTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"simple_value_string",
                    						lv_simple_value_string_1_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:5598:3: ( (lv_simple_value_string_2_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:5598:3: ( (lv_simple_value_string_2_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:5599:4: (lv_simple_value_string_2_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:5599:4: (lv_simple_value_string_2_0= RULE_NULL )
                    // InternalAnsibleDsl.g:5600:5: lv_simple_value_string_2_0= RULE_NULL
                    {
                    lv_simple_value_string_2_0=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    					newLeafNode(lv_simple_value_string_2_0, grammarAccess.getESimpleValueAccess().getSimple_value_stringNULLTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"simple_value_string",
                    						lv_simple_value_string_2_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NULL");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAnsibleDsl.g:5617:3: ( (lv_simple_value_string_3_0= RULE_NUMBER ) )
                    {
                    // InternalAnsibleDsl.g:5617:3: ( (lv_simple_value_string_3_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:5618:4: (lv_simple_value_string_3_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:5618:4: (lv_simple_value_string_3_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:5619:5: lv_simple_value_string_3_0= RULE_NUMBER
                    {
                    lv_simple_value_string_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_simple_value_string_3_0, grammarAccess.getESimpleValueAccess().getSimple_value_stringNUMBERTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"simple_value_string",
                    						lv_simple_value_string_3_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    				

                    }


                    }


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
    // $ANTLR end "ruleESimpleValue"


    // $ANTLR start "entryRuleEItem"
    // InternalAnsibleDsl.g:5639:1: entryRuleEItem returns [EObject current=null] : iv_ruleEItem= ruleEItem EOF ;
    public final EObject entryRuleEItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEItem = null;


        try {
            // InternalAnsibleDsl.g:5639:46: (iv_ruleEItem= ruleEItem EOF )
            // InternalAnsibleDsl.g:5640:2: iv_ruleEItem= ruleEItem EOF
            {
             newCompositeNode(grammarAccess.getEItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEItem=ruleEItem();

            state._fsp--;

             current =iv_ruleEItem; 
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
    // $ANTLR end "entryRuleEItem"


    // $ANTLR start "ruleEItem"
    // InternalAnsibleDsl.g:5646:1: ruleEItem returns [EObject current=null] : ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tail_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5652:2: ( ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:5653:2: ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:5653:2: ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:5654:3: () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            {
            // InternalAnsibleDsl.g:5654:3: ()
            // InternalAnsibleDsl.g:5655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEItemAccess().getEItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,111,FOLLOW_144); 

            			newLeafNode(otherlv_1, grammarAccess.getEItemAccess().getItemKeyword_1());
            		
            // InternalAnsibleDsl.g:5665:3: (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            loop164:
            do {
                int alt164=2;
                int LA164_0 = input.LA(1);

                if ( (LA164_0==112) ) {
                    int LA164_2 = input.LA(2);

                    if ( (LA164_2==RULE_ID) ) {
                        int LA164_3 = input.LA(3);

                        if ( (LA164_3==EOF||LA164_3==19||LA164_3==33||LA164_3==35||LA164_3==47||(LA164_3>=52 && LA164_3<=55)||LA164_3==59||(LA164_3>=73 && LA164_3<=75)||(LA164_3>=94 && LA164_3<=96)||LA164_3==99||LA164_3==112||LA164_3==116||(LA164_3>=118 && LA164_3<=137)||(LA164_3>=139 && LA164_3<=141)) ) {
                            alt164=1;
                        }


                    }


                }


                switch (alt164) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5666:4: otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,112,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEItemAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5670:4: ( (lv_tail_3_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:5671:5: (lv_tail_3_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:5671:5: (lv_tail_3_0= RULE_ID )
            	    // InternalAnsibleDsl.g:5672:6: lv_tail_3_0= RULE_ID
            	    {
            	    lv_tail_3_0=(Token)match(input,RULE_ID,FOLLOW_144); 

            	    						newLeafNode(lv_tail_3_0, grammarAccess.getEItemAccess().getTailIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEItemRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"tail",
            	    							lv_tail_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop164;
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
    // $ANTLR end "ruleEItem"


    // $ANTLR start "entryRuleEDeclaredVariableReference"
    // InternalAnsibleDsl.g:5693:1: entryRuleEDeclaredVariableReference returns [EObject current=null] : iv_ruleEDeclaredVariableReference= ruleEDeclaredVariableReference EOF ;
    public final EObject entryRuleEDeclaredVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDeclaredVariableReference = null;


        try {
            // InternalAnsibleDsl.g:5693:67: (iv_ruleEDeclaredVariableReference= ruleEDeclaredVariableReference EOF )
            // InternalAnsibleDsl.g:5694:2: iv_ruleEDeclaredVariableReference= ruleEDeclaredVariableReference EOF
            {
             newCompositeNode(grammarAccess.getEDeclaredVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDeclaredVariableReference=ruleEDeclaredVariableReference();

            state._fsp--;

             current =iv_ruleEDeclaredVariableReference; 
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
    // $ANTLR end "entryRuleEDeclaredVariableReference"


    // $ANTLR start "ruleEDeclaredVariableReference"
    // InternalAnsibleDsl.g:5700:1: ruleEDeclaredVariableReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* ) ;
    public final EObject ruleEDeclaredVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_tail_5_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5706:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* ) )
            // InternalAnsibleDsl.g:5707:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* )
            {
            // InternalAnsibleDsl.g:5707:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* )
            // InternalAnsibleDsl.g:5708:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )*
            {
            // InternalAnsibleDsl.g:5708:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5709:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5709:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:5710:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDeclaredVariableReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_145); 

            					newLeafNode(otherlv_0, grammarAccess.getEDeclaredVariableReferenceAccess().getVariable_referenceEDeclaredVariableCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:5721:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==113) ) {
                alt165=1;
            }
            switch (alt165) {
                case 1 :
                    // InternalAnsibleDsl.g:5722:4: otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,113,FOLLOW_113); 

                    				newLeafNode(otherlv_1, grammarAccess.getEDeclaredVariableReferenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5726:4: ( (lv_index_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:5727:5: (lv_index_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:5727:5: (lv_index_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:5728:6: lv_index_2_0= RULE_NUMBER
                    {
                    lv_index_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_146); 

                    						newLeafNode(lv_index_2_0, grammarAccess.getEDeclaredVariableReferenceAccess().getIndexNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEDeclaredVariableReferenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index",
                    							lv_index_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,114,FOLLOW_144); 

                    				newLeafNode(otherlv_3, grammarAccess.getEDeclaredVariableReferenceAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:5749:3: (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==112) ) {
                    int LA166_2 = input.LA(2);

                    if ( (LA166_2==RULE_ID) ) {
                        int LA166_3 = input.LA(3);

                        if ( (LA166_3==EOF||LA166_3==19||LA166_3==33||LA166_3==35||LA166_3==47||(LA166_3>=52 && LA166_3<=55)||LA166_3==59||(LA166_3>=73 && LA166_3<=75)||(LA166_3>=94 && LA166_3<=96)||LA166_3==99||(LA166_3>=112 && LA166_3<=113)||LA166_3==116||(LA166_3>=118 && LA166_3<=137)||(LA166_3>=139 && LA166_3<=141)) ) {
                            alt166=1;
                        }


                    }


                }


                switch (alt166) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5750:4: otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) )
            	    {
            	    otherlv_4=(Token)match(input,112,FOLLOW_24); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEDeclaredVariableReferenceAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5754:4: ( (lv_tail_5_0= ruleEDictionaryPairReference ) )
            	    // InternalAnsibleDsl.g:5755:5: (lv_tail_5_0= ruleEDictionaryPairReference )
            	    {
            	    // InternalAnsibleDsl.g:5755:5: (lv_tail_5_0= ruleEDictionaryPairReference )
            	    // InternalAnsibleDsl.g:5756:6: lv_tail_5_0= ruleEDictionaryPairReference
            	    {

            	    						newCompositeNode(grammarAccess.getEDeclaredVariableReferenceAccess().getTailEDictionaryPairReferenceParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_144);
            	    lv_tail_5_0=ruleEDictionaryPairReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEDeclaredVariableReferenceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tail",
            	    							lv_tail_5_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.EDictionaryPairReference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop166;
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
    // $ANTLR end "ruleEDeclaredVariableReference"


    // $ANTLR start "entryRuleEJinjaExpressionEvaluation"
    // InternalAnsibleDsl.g:5778:1: entryRuleEJinjaExpressionEvaluation returns [EObject current=null] : iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF ;
    public final EObject entryRuleEJinjaExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionEvaluation = null;


        try {
            // InternalAnsibleDsl.g:5778:67: (iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF )
            // InternalAnsibleDsl.g:5779:2: iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEJinjaExpressionEvaluationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEJinjaExpressionEvaluation=ruleEJinjaExpressionEvaluation();

            state._fsp--;

             current =iv_ruleEJinjaExpressionEvaluation; 
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
    // $ANTLR end "entryRuleEJinjaExpressionEvaluation"


    // $ANTLR start "ruleEJinjaExpressionEvaluation"
    // InternalAnsibleDsl.g:5785:1: ruleEJinjaExpressionEvaluation returns [EObject current=null] : (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' ) ;
    public final EObject ruleEJinjaExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_jinja_expression_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5791:2: ( (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' ) )
            // InternalAnsibleDsl.g:5792:2: (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' )
            {
            // InternalAnsibleDsl.g:5792:2: (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' )
            // InternalAnsibleDsl.g:5793:3: otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getEJinjaExpressionEvaluationAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:5797:3: ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            // InternalAnsibleDsl.g:5798:4: (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            {
            // InternalAnsibleDsl.g:5798:4: (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            // InternalAnsibleDsl.g:5799:5: lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            {

            					newCompositeNode(grammarAccess.getEJinjaExpressionEvaluationAccess().getJinja_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_147);
            lv_jinja_expression_1_0=ruleEJinjaExpressionEvaluationWithoutBrackets();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEJinjaExpressionEvaluationRule());
            					}
            					set(
            						current,
            						"jinja_expression",
            						lv_jinja_expression_1_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionEvaluationWithoutBrackets");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,116,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEJinjaExpressionEvaluationAccess().getRightCurlyBracketRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleEJinjaExpressionEvaluation"


    // $ANTLR start "entryRuleEJinjaExpressionEvaluationWithoutBrackets"
    // InternalAnsibleDsl.g:5824:1: entryRuleEJinjaExpressionEvaluationWithoutBrackets returns [EObject current=null] : iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF ;
    public final EObject entryRuleEJinjaExpressionEvaluationWithoutBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionEvaluationWithoutBrackets = null;


        try {
            // InternalAnsibleDsl.g:5824:82: (iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF )
            // InternalAnsibleDsl.g:5825:2: iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF
            {
             newCompositeNode(grammarAccess.getEJinjaExpressionEvaluationWithoutBracketsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEJinjaExpressionEvaluationWithoutBrackets=ruleEJinjaExpressionEvaluationWithoutBrackets();

            state._fsp--;

             current =iv_ruleEJinjaExpressionEvaluationWithoutBrackets; 
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
    // $ANTLR end "entryRuleEJinjaExpressionEvaluationWithoutBrackets"


    // $ANTLR start "ruleEJinjaExpressionEvaluationWithoutBrackets"
    // InternalAnsibleDsl.g:5831:1: ruleEJinjaExpressionEvaluationWithoutBrackets returns [EObject current=null] : (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression ) ;
    public final EObject ruleEJinjaExpressionEvaluationWithoutBrackets() throws RecognitionException {
        EObject current = null;

        EObject this_EFilteredExpression_0 = null;

        EObject this_EIfExpression_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5837:2: ( (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression ) )
            // InternalAnsibleDsl.g:5838:2: (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression )
            {
            // InternalAnsibleDsl.g:5838:2: (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression )
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( ((LA167_0>=RULE_STRING && LA167_0<=RULE_NULL)||LA167_0==111||LA167_0==113||LA167_0==117||(LA167_0>=142 && LA167_0<=143)) ) {
                alt167=1;
            }
            else if ( (LA167_0==138) ) {
                alt167=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;
            }
            switch (alt167) {
                case 1 :
                    // InternalAnsibleDsl.g:5839:3: this_EFilteredExpression_0= ruleEFilteredExpression
                    {

                    			newCompositeNode(grammarAccess.getEJinjaExpressionEvaluationWithoutBracketsAccess().getEFilteredExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFilteredExpression_0=ruleEFilteredExpression();

                    state._fsp--;


                    			current = this_EFilteredExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5848:3: this_EIfExpression_1= ruleEIfExpression
                    {

                    			newCompositeNode(grammarAccess.getEJinjaExpressionEvaluationWithoutBracketsAccess().getEIfExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EIfExpression_1=ruleEIfExpression();

                    state._fsp--;


                    			current = this_EIfExpression_1;
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
    // $ANTLR end "ruleEJinjaExpressionEvaluationWithoutBrackets"


    // $ANTLR start "entryRuleEFunctionCall"
    // InternalAnsibleDsl.g:5860:1: entryRuleEFunctionCall returns [EObject current=null] : iv_ruleEFunctionCall= ruleEFunctionCall EOF ;
    public final EObject entryRuleEFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunctionCall = null;


        try {
            // InternalAnsibleDsl.g:5860:54: (iv_ruleEFunctionCall= ruleEFunctionCall EOF )
            // InternalAnsibleDsl.g:5861:2: iv_ruleEFunctionCall= ruleEFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getEFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFunctionCall=ruleEFunctionCall();

            state._fsp--;

             current =iv_ruleEFunctionCall; 
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
    // $ANTLR end "entryRuleEFunctionCall"


    // $ANTLR start "ruleEFunctionCall"
    // InternalAnsibleDsl.g:5867:1: ruleEFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) ) ;
    public final EObject ruleEFunctionCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5873:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) ) )
            // InternalAnsibleDsl.g:5874:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) )
            {
            // InternalAnsibleDsl.g:5874:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) )
            // InternalAnsibleDsl.g:5875:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) )
            {
            // InternalAnsibleDsl.g:5875:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5876:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5876:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:5877:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_148); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEFunctionCallAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEFunctionCallRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAnsibleDsl.g:5893:3: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) )
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==117) ) {
                int LA169_1 = input.LA(2);

                if ( ((LA169_1>=RULE_STRING && LA169_1<=RULE_NULL)||LA169_1==111||LA169_1==113||LA169_1==117||(LA169_1>=142 && LA169_1<=143)) ) {
                    alt169=1;
                }
                else if ( (LA169_1==118) ) {
                    alt169=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 169, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;
            }
            switch (alt169) {
                case 1 :
                    // InternalAnsibleDsl.g:5894:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' )
                    {
                    // InternalAnsibleDsl.g:5894:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' )
                    // InternalAnsibleDsl.g:5895:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,117,FOLLOW_149); 

                    					newLeafNode(otherlv_1, grammarAccess.getEFunctionCallAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalAnsibleDsl.g:5899:5: ( (lv_parameters_2_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:5900:6: (lv_parameters_2_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:5900:6: (lv_parameters_2_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:5901:7: lv_parameters_2_0= ruleEFilteredExpression
                    {

                    							newCompositeNode(grammarAccess.getEFunctionCallAccess().getParametersEFilteredExpressionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_150);
                    lv_parameters_2_0=ruleEFilteredExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEFunctionCallRule());
                    							}
                    							add(
                    								current,
                    								"parameters",
                    								lv_parameters_2_0,
                    								"org.sodalite.sdl.ansible.AnsibleDsl.EFilteredExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAnsibleDsl.g:5918:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )*
                    loop168:
                    do {
                        int alt168=2;
                        int LA168_0 = input.LA(1);

                        if ( (LA168_0==33) ) {
                            alt168=1;
                        }


                        switch (alt168) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:5919:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,33,FOLLOW_149); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getEFunctionCallAccess().getCommaKeyword_1_0_2_0());
                    	    					
                    	    // InternalAnsibleDsl.g:5923:6: ( (lv_parameters_4_0= ruleEFilteredExpression ) )
                    	    // InternalAnsibleDsl.g:5924:7: (lv_parameters_4_0= ruleEFilteredExpression )
                    	    {
                    	    // InternalAnsibleDsl.g:5924:7: (lv_parameters_4_0= ruleEFilteredExpression )
                    	    // InternalAnsibleDsl.g:5925:8: lv_parameters_4_0= ruleEFilteredExpression
                    	    {

                    	    								newCompositeNode(grammarAccess.getEFunctionCallAccess().getParametersEFilteredExpressionParserRuleCall_1_0_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_150);
                    	    lv_parameters_4_0=ruleEFilteredExpression();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getEFunctionCallRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parameters",
                    	    									lv_parameters_4_0,
                    	    									"org.sodalite.sdl.ansible.AnsibleDsl.EFilteredExpression");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop168;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,118,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getEFunctionCallAccess().getRightParenthesisKeyword_1_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5949:4: (otherlv_6= '(' otherlv_7= ')' )
                    {
                    // InternalAnsibleDsl.g:5949:4: (otherlv_6= '(' otherlv_7= ')' )
                    // InternalAnsibleDsl.g:5950:5: otherlv_6= '(' otherlv_7= ')'
                    {
                    otherlv_6=(Token)match(input,117,FOLLOW_151); 

                    					newLeafNode(otherlv_6, grammarAccess.getEFunctionCallAccess().getLeftParenthesisKeyword_1_1_0());
                    				
                    otherlv_7=(Token)match(input,118,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getEFunctionCallAccess().getRightParenthesisKeyword_1_1_1());
                    				

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
    // $ANTLR end "ruleEFunctionCall"


    // $ANTLR start "entryRuleEFilteredExpression"
    // InternalAnsibleDsl.g:5964:1: entryRuleEFilteredExpression returns [EObject current=null] : iv_ruleEFilteredExpression= ruleEFilteredExpression EOF ;
    public final EObject entryRuleEFilteredExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredExpression = null;


        try {
            // InternalAnsibleDsl.g:5964:60: (iv_ruleEFilteredExpression= ruleEFilteredExpression EOF )
            // InternalAnsibleDsl.g:5965:2: iv_ruleEFilteredExpression= ruleEFilteredExpression EOF
            {
             newCompositeNode(grammarAccess.getEFilteredExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFilteredExpression=ruleEFilteredExpression();

            state._fsp--;

             current =iv_ruleEFilteredExpression; 
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
    // $ANTLR end "entryRuleEFilteredExpression"


    // $ANTLR start "ruleEFilteredExpression"
    // InternalAnsibleDsl.g:5971:1: ruleEFilteredExpression returns [EObject current=null] : ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? ) ;
    public final EObject ruleEFilteredExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_to_filter_0_0 = null;

        EObject lv_tail_2_0 = null;

        EObject lv_filter_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5977:2: ( ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5978:2: ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5978:2: ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? )
            // InternalAnsibleDsl.g:5979:3: ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5979:3: ( (lv_to_filter_0_0= ruleEOrExpression ) )
            // InternalAnsibleDsl.g:5980:4: (lv_to_filter_0_0= ruleEOrExpression )
            {
            // InternalAnsibleDsl.g:5980:4: (lv_to_filter_0_0= ruleEOrExpression )
            // InternalAnsibleDsl.g:5981:5: lv_to_filter_0_0= ruleEOrExpression
            {

            					newCompositeNode(grammarAccess.getEFilteredExpressionAccess().getTo_filterEOrExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_152);
            lv_to_filter_0_0=ruleEOrExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEFilteredExpressionRule());
            					}
            					set(
            						current,
            						"to_filter",
            						lv_to_filter_0_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EOrExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:5998:3: (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )*
            loop170:
            do {
                int alt170=2;
                int LA170_0 = input.LA(1);

                if ( (LA170_0==112) ) {
                    alt170=1;
                }


                switch (alt170) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5999:4: otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) )
            	    {
            	    otherlv_1=(Token)match(input,112,FOLLOW_153); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEFilteredExpressionAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalAnsibleDsl.g:6003:4: ( (lv_tail_2_0= ruleEFunctionCall ) )
            	    // InternalAnsibleDsl.g:6004:5: (lv_tail_2_0= ruleEFunctionCall )
            	    {
            	    // InternalAnsibleDsl.g:6004:5: (lv_tail_2_0= ruleEFunctionCall )
            	    // InternalAnsibleDsl.g:6005:6: lv_tail_2_0= ruleEFunctionCall
            	    {

            	    						newCompositeNode(grammarAccess.getEFilteredExpressionAccess().getTailEFunctionCallParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_152);
            	    lv_tail_2_0=ruleEFunctionCall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEFilteredExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tail",
            	    							lv_tail_2_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.EFunctionCall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop170;
                }
            } while (true);

            // InternalAnsibleDsl.g:6023:3: (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==119) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // InternalAnsibleDsl.g:6024:4: otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) )
                    {
                    otherlv_3=(Token)match(input,119,FOLLOW_149); 

                    				newLeafNode(otherlv_3, grammarAccess.getEFilteredExpressionAccess().getVerticalLineKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:6028:4: ( (lv_filter_4_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:6029:5: (lv_filter_4_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:6029:5: (lv_filter_4_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:6030:6: lv_filter_4_0= ruleEFilteredExpression
                    {

                    						newCompositeNode(grammarAccess.getEFilteredExpressionAccess().getFilterEFilteredExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_filter_4_0=ruleEFilteredExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEFilteredExpressionRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_4_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EFilteredExpression");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleEFilteredExpression"


    // $ANTLR start "entryRuleEOrExpression"
    // InternalAnsibleDsl.g:6052:1: entryRuleEOrExpression returns [EObject current=null] : iv_ruleEOrExpression= ruleEOrExpression EOF ;
    public final EObject entryRuleEOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOrExpression = null;


        try {
            // InternalAnsibleDsl.g:6052:54: (iv_ruleEOrExpression= ruleEOrExpression EOF )
            // InternalAnsibleDsl.g:6053:2: iv_ruleEOrExpression= ruleEOrExpression EOF
            {
             newCompositeNode(grammarAccess.getEOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOrExpression=ruleEOrExpression();

            state._fsp--;

             current =iv_ruleEOrExpression; 
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
    // $ANTLR end "entryRuleEOrExpression"


    // $ANTLR start "ruleEOrExpression"
    // InternalAnsibleDsl.g:6059:1: ruleEOrExpression returns [EObject current=null] : ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? ) ;
    public final EObject ruleEOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_or_0_0 = null;

        EObject lv_right_or_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6065:2: ( ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? ) )
            // InternalAnsibleDsl.g:6066:2: ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:6066:2: ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? )
            // InternalAnsibleDsl.g:6067:3: ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )?
            {
            // InternalAnsibleDsl.g:6067:3: ( (lv_left_or_0_0= ruleEAndExpression ) )
            // InternalAnsibleDsl.g:6068:4: (lv_left_or_0_0= ruleEAndExpression )
            {
            // InternalAnsibleDsl.g:6068:4: (lv_left_or_0_0= ruleEAndExpression )
            // InternalAnsibleDsl.g:6069:5: lv_left_or_0_0= ruleEAndExpression
            {

            					newCompositeNode(grammarAccess.getEOrExpressionAccess().getLeft_orEAndExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_154);
            lv_left_or_0_0=ruleEAndExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOrExpressionRule());
            					}
            					set(
            						current,
            						"left_or",
            						lv_left_or_0_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EAndExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:6086:3: (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==120) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalAnsibleDsl.g:6087:4: otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,120,FOLLOW_149); 

                    				newLeafNode(otherlv_1, grammarAccess.getEOrExpressionAccess().getOrKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6091:4: ( (lv_right_or_2_0= ruleEOrExpression ) )
                    // InternalAnsibleDsl.g:6092:5: (lv_right_or_2_0= ruleEOrExpression )
                    {
                    // InternalAnsibleDsl.g:6092:5: (lv_right_or_2_0= ruleEOrExpression )
                    // InternalAnsibleDsl.g:6093:6: lv_right_or_2_0= ruleEOrExpression
                    {

                    						newCompositeNode(grammarAccess.getEOrExpressionAccess().getRight_orEOrExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_or_2_0=ruleEOrExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOrExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right_or",
                    							lv_right_or_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EOrExpression");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleEOrExpression"


    // $ANTLR start "entryRuleEAndExpression"
    // InternalAnsibleDsl.g:6115:1: entryRuleEAndExpression returns [EObject current=null] : iv_ruleEAndExpression= ruleEAndExpression EOF ;
    public final EObject entryRuleEAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAndExpression = null;


        try {
            // InternalAnsibleDsl.g:6115:55: (iv_ruleEAndExpression= ruleEAndExpression EOF )
            // InternalAnsibleDsl.g:6116:2: iv_ruleEAndExpression= ruleEAndExpression EOF
            {
             newCompositeNode(grammarAccess.getEAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAndExpression=ruleEAndExpression();

            state._fsp--;

             current =iv_ruleEAndExpression; 
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
    // $ANTLR end "entryRuleEAndExpression"


    // $ANTLR start "ruleEAndExpression"
    // InternalAnsibleDsl.g:6122:1: ruleEAndExpression returns [EObject current=null] : ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? ) ;
    public final EObject ruleEAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_and_0_0 = null;

        EObject lv_right_and_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6128:2: ( ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? ) )
            // InternalAnsibleDsl.g:6129:2: ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:6129:2: ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? )
            // InternalAnsibleDsl.g:6130:3: ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )?
            {
            // InternalAnsibleDsl.g:6130:3: ( (lv_left_and_0_0= ruleETruthExpression ) )
            // InternalAnsibleDsl.g:6131:4: (lv_left_and_0_0= ruleETruthExpression )
            {
            // InternalAnsibleDsl.g:6131:4: (lv_left_and_0_0= ruleETruthExpression )
            // InternalAnsibleDsl.g:6132:5: lv_left_and_0_0= ruleETruthExpression
            {

            					newCompositeNode(grammarAccess.getEAndExpressionAccess().getLeft_andETruthExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_155);
            lv_left_and_0_0=ruleETruthExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAndExpressionRule());
            					}
            					set(
            						current,
            						"left_and",
            						lv_left_and_0_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.ETruthExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:6149:3: (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==121) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalAnsibleDsl.g:6150:4: otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,121,FOLLOW_149); 

                    				newLeafNode(otherlv_1, grammarAccess.getEAndExpressionAccess().getAndKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6154:4: ( (lv_right_and_2_0= ruleEAndExpression ) )
                    // InternalAnsibleDsl.g:6155:5: (lv_right_and_2_0= ruleEAndExpression )
                    {
                    // InternalAnsibleDsl.g:6155:5: (lv_right_and_2_0= ruleEAndExpression )
                    // InternalAnsibleDsl.g:6156:6: lv_right_and_2_0= ruleEAndExpression
                    {

                    						newCompositeNode(grammarAccess.getEAndExpressionAccess().getRight_andEAndExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_and_2_0=ruleEAndExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEAndExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right_and",
                    							lv_right_and_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EAndExpression");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleEAndExpression"


    // $ANTLR start "entryRuleETruthExpression"
    // InternalAnsibleDsl.g:6178:1: entryRuleETruthExpression returns [EObject current=null] : iv_ruleETruthExpression= ruleETruthExpression EOF ;
    public final EObject entryRuleETruthExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETruthExpression = null;


        try {
            // InternalAnsibleDsl.g:6178:57: (iv_ruleETruthExpression= ruleETruthExpression EOF )
            // InternalAnsibleDsl.g:6179:2: iv_ruleETruthExpression= ruleETruthExpression EOF
            {
             newCompositeNode(grammarAccess.getETruthExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETruthExpression=ruleETruthExpression();

            state._fsp--;

             current =iv_ruleETruthExpression; 
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
    // $ANTLR end "entryRuleETruthExpression"


    // $ANTLR start "ruleETruthExpression"
    // InternalAnsibleDsl.g:6185:1: ruleETruthExpression returns [EObject current=null] : ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? ) ;
    public final EObject ruleETruthExpression() throws RecognitionException {
        EObject current = null;

        Token lv_equality_sign_1_1=null;
        Token lv_equality_sign_1_2=null;
        Token lv_equality_sign_1_3=null;
        Token lv_equality_sign_1_4=null;
        Token lv_equality_sign_1_5=null;
        Token lv_equality_sign_1_6=null;
        EObject lv_left_value_0_0 = null;

        EObject lv_right_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6191:2: ( ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? ) )
            // InternalAnsibleDsl.g:6192:2: ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:6192:2: ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? )
            // InternalAnsibleDsl.g:6193:3: ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )?
            {
            // InternalAnsibleDsl.g:6193:3: ( (lv_left_value_0_0= ruleEOperation ) )
            // InternalAnsibleDsl.g:6194:4: (lv_left_value_0_0= ruleEOperation )
            {
            // InternalAnsibleDsl.g:6194:4: (lv_left_value_0_0= ruleEOperation )
            // InternalAnsibleDsl.g:6195:5: lv_left_value_0_0= ruleEOperation
            {

            					newCompositeNode(grammarAccess.getETruthExpressionAccess().getLeft_valueEOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_156);
            lv_left_value_0_0=ruleEOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETruthExpressionRule());
            					}
            					set(
            						current,
            						"left_value",
            						lv_left_value_0_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:6212:3: ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )?
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( ((LA175_0>=122 && LA175_0<=127)) ) {
                alt175=1;
            }
            switch (alt175) {
                case 1 :
                    // InternalAnsibleDsl.g:6213:4: ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) )
                    {
                    // InternalAnsibleDsl.g:6213:4: ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) )
                    // InternalAnsibleDsl.g:6214:5: ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) )
                    {
                    // InternalAnsibleDsl.g:6214:5: ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) )
                    // InternalAnsibleDsl.g:6215:6: (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' )
                    {
                    // InternalAnsibleDsl.g:6215:6: (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' )
                    int alt174=6;
                    switch ( input.LA(1) ) {
                    case 122:
                        {
                        alt174=1;
                        }
                        break;
                    case 123:
                        {
                        alt174=2;
                        }
                        break;
                    case 124:
                        {
                        alt174=3;
                        }
                        break;
                    case 125:
                        {
                        alt174=4;
                        }
                        break;
                    case 126:
                        {
                        alt174=5;
                        }
                        break;
                    case 127:
                        {
                        alt174=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 174, 0, input);

                        throw nvae;
                    }

                    switch (alt174) {
                        case 1 :
                            // InternalAnsibleDsl.g:6216:7: lv_equality_sign_1_1= '=='
                            {
                            lv_equality_sign_1_1=(Token)match(input,122,FOLLOW_149); 

                            							newLeafNode(lv_equality_sign_1_1, grammarAccess.getETruthExpressionAccess().getEquality_signEqualsSignEqualsSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:6227:7: lv_equality_sign_1_2= '!='
                            {
                            lv_equality_sign_1_2=(Token)match(input,123,FOLLOW_149); 

                            							newLeafNode(lv_equality_sign_1_2, grammarAccess.getETruthExpressionAccess().getEquality_signExclamationMarkEqualsSignKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:6238:7: lv_equality_sign_1_3= '<'
                            {
                            lv_equality_sign_1_3=(Token)match(input,124,FOLLOW_149); 

                            							newLeafNode(lv_equality_sign_1_3, grammarAccess.getETruthExpressionAccess().getEquality_signLessThanSignKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:6249:7: lv_equality_sign_1_4= '>'
                            {
                            lv_equality_sign_1_4=(Token)match(input,125,FOLLOW_149); 

                            							newLeafNode(lv_equality_sign_1_4, grammarAccess.getETruthExpressionAccess().getEquality_signGreaterThanSignKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:6260:7: lv_equality_sign_1_5= '<='
                            {
                            lv_equality_sign_1_5=(Token)match(input,126,FOLLOW_149); 

                            							newLeafNode(lv_equality_sign_1_5, grammarAccess.getETruthExpressionAccess().getEquality_signLessThanSignEqualsSignKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalAnsibleDsl.g:6271:7: lv_equality_sign_1_6= '>='
                            {
                            lv_equality_sign_1_6=(Token)match(input,127,FOLLOW_149); 

                            							newLeafNode(lv_equality_sign_1_6, grammarAccess.getETruthExpressionAccess().getEquality_signGreaterThanSignEqualsSignKeyword_1_0_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_6, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalAnsibleDsl.g:6284:4: ( (lv_right_value_2_0= ruleETruthExpression ) )
                    // InternalAnsibleDsl.g:6285:5: (lv_right_value_2_0= ruleETruthExpression )
                    {
                    // InternalAnsibleDsl.g:6285:5: (lv_right_value_2_0= ruleETruthExpression )
                    // InternalAnsibleDsl.g:6286:6: lv_right_value_2_0= ruleETruthExpression
                    {

                    						newCompositeNode(grammarAccess.getETruthExpressionAccess().getRight_valueETruthExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_value_2_0=ruleETruthExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETruthExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right_value",
                    							lv_right_value_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.ETruthExpression");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleETruthExpression"


    // $ANTLR start "entryRuleEOperation"
    // InternalAnsibleDsl.g:6308:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalAnsibleDsl.g:6308:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalAnsibleDsl.g:6309:2: iv_ruleEOperation= ruleEOperation EOF
            {
             newCompositeNode(grammarAccess.getEOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperation=ruleEOperation();

            state._fsp--;

             current =iv_ruleEOperation; 
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
    // $ANTLR end "entryRuleEOperation"


    // $ANTLR start "ruleEOperation"
    // InternalAnsibleDsl.g:6315:1: ruleEOperation returns [EObject current=null] : ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? ) ;
    public final EObject ruleEOperation() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        Token lv_operator_1_3=null;
        Token lv_operator_1_4=null;
        Token lv_operator_1_5=null;
        Token lv_operator_1_6=null;
        Token lv_operator_1_7=null;
        EObject lv_left_operand_0_0 = null;

        EObject lv_right_operand_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6321:2: ( ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? ) )
            // InternalAnsibleDsl.g:6322:2: ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? )
            {
            // InternalAnsibleDsl.g:6322:2: ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? )
            // InternalAnsibleDsl.g:6323:3: ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )?
            {
            // InternalAnsibleDsl.g:6323:3: ( (lv_left_operand_0_0= ruleEIsExpression ) )
            // InternalAnsibleDsl.g:6324:4: (lv_left_operand_0_0= ruleEIsExpression )
            {
            // InternalAnsibleDsl.g:6324:4: (lv_left_operand_0_0= ruleEIsExpression )
            // InternalAnsibleDsl.g:6325:5: lv_left_operand_0_0= ruleEIsExpression
            {

            					newCompositeNode(grammarAccess.getEOperationAccess().getLeft_operandEIsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_157);
            lv_left_operand_0_0=ruleEIsExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOperationRule());
            					}
            					set(
            						current,
            						"left_operand",
            						lv_left_operand_0_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EIsExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:6342:3: ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )?
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( ((LA177_0>=128 && LA177_0<=134)) ) {
                alt177=1;
            }
            switch (alt177) {
                case 1 :
                    // InternalAnsibleDsl.g:6343:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) )
                    {
                    // InternalAnsibleDsl.g:6343:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) )
                    // InternalAnsibleDsl.g:6344:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) )
                    {
                    // InternalAnsibleDsl.g:6344:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) )
                    // InternalAnsibleDsl.g:6345:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' )
                    {
                    // InternalAnsibleDsl.g:6345:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' )
                    int alt176=7;
                    switch ( input.LA(1) ) {
                    case 128:
                        {
                        alt176=1;
                        }
                        break;
                    case 129:
                        {
                        alt176=2;
                        }
                        break;
                    case 130:
                        {
                        alt176=3;
                        }
                        break;
                    case 131:
                        {
                        alt176=4;
                        }
                        break;
                    case 132:
                        {
                        alt176=5;
                        }
                        break;
                    case 133:
                        {
                        alt176=6;
                        }
                        break;
                    case 134:
                        {
                        alt176=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 176, 0, input);

                        throw nvae;
                    }

                    switch (alt176) {
                        case 1 :
                            // InternalAnsibleDsl.g:6346:7: lv_operator_1_1= '+'
                            {
                            lv_operator_1_1=(Token)match(input,128,FOLLOW_149); 

                            							newLeafNode(lv_operator_1_1, grammarAccess.getEOperationAccess().getOperatorPlusSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:6357:7: lv_operator_1_2= '-'
                            {
                            lv_operator_1_2=(Token)match(input,129,FOLLOW_149); 

                            							newLeafNode(lv_operator_1_2, grammarAccess.getEOperationAccess().getOperatorHyphenMinusKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:6368:7: lv_operator_1_3= '/'
                            {
                            lv_operator_1_3=(Token)match(input,130,FOLLOW_149); 

                            							newLeafNode(lv_operator_1_3, grammarAccess.getEOperationAccess().getOperatorSolidusKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:6379:7: lv_operator_1_4= '//'
                            {
                            lv_operator_1_4=(Token)match(input,131,FOLLOW_149); 

                            							newLeafNode(lv_operator_1_4, grammarAccess.getEOperationAccess().getOperatorSolidusSolidusKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:6390:7: lv_operator_1_5= '%'
                            {
                            lv_operator_1_5=(Token)match(input,132,FOLLOW_149); 

                            							newLeafNode(lv_operator_1_5, grammarAccess.getEOperationAccess().getOperatorPercentSignKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalAnsibleDsl.g:6401:7: lv_operator_1_6= '*'
                            {
                            lv_operator_1_6=(Token)match(input,133,FOLLOW_149); 

                            							newLeafNode(lv_operator_1_6, grammarAccess.getEOperationAccess().getOperatorAsteriskKeyword_1_0_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_6, null);
                            						

                            }
                            break;
                        case 7 :
                            // InternalAnsibleDsl.g:6412:7: lv_operator_1_7= '**'
                            {
                            lv_operator_1_7=(Token)match(input,134,FOLLOW_149); 

                            							newLeafNode(lv_operator_1_7, grammarAccess.getEOperationAccess().getOperatorAsteriskAsteriskKeyword_1_0_0_6());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_7, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalAnsibleDsl.g:6425:4: ( (lv_right_operand_2_0= ruleEOperation ) )
                    // InternalAnsibleDsl.g:6426:5: (lv_right_operand_2_0= ruleEOperation )
                    {
                    // InternalAnsibleDsl.g:6426:5: (lv_right_operand_2_0= ruleEOperation )
                    // InternalAnsibleDsl.g:6427:6: lv_right_operand_2_0= ruleEOperation
                    {

                    						newCompositeNode(grammarAccess.getEOperationAccess().getRight_operandEOperationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_operand_2_0=ruleEOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationRule());
                    						}
                    						set(
                    							current,
                    							"right_operand",
                    							lv_right_operand_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EOperation");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleEOperation"


    // $ANTLR start "entryRuleEIsExpression"
    // InternalAnsibleDsl.g:6449:1: entryRuleEIsExpression returns [EObject current=null] : iv_ruleEIsExpression= ruleEIsExpression EOF ;
    public final EObject entryRuleEIsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIsExpression = null;


        try {
            // InternalAnsibleDsl.g:6449:54: (iv_ruleEIsExpression= ruleEIsExpression EOF )
            // InternalAnsibleDsl.g:6450:2: iv_ruleEIsExpression= ruleEIsExpression EOF
            {
             newCompositeNode(grammarAccess.getEIsExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIsExpression=ruleEIsExpression();

            state._fsp--;

             current =iv_ruleEIsExpression; 
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
    // $ANTLR end "entryRuleEIsExpression"


    // $ANTLR start "ruleEIsExpression"
    // InternalAnsibleDsl.g:6456:1: ruleEIsExpression returns [EObject current=null] : ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? ) ;
    public final EObject ruleEIsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_is_not_2_0=null;
        Token lv_is_not_4_0=null;
        Token otherlv_5=null;
        EObject lv_parenthesised_expression_0_0 = null;

        EObject lv_status_3_0 = null;

        EObject lv_container_expression_6_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6462:2: ( ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? ) )
            // InternalAnsibleDsl.g:6463:2: ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? )
            {
            // InternalAnsibleDsl.g:6463:2: ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? )
            // InternalAnsibleDsl.g:6464:3: ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )?
            {
            // InternalAnsibleDsl.g:6464:3: ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) )
            // InternalAnsibleDsl.g:6465:4: (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression )
            {
            // InternalAnsibleDsl.g:6465:4: (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression )
            // InternalAnsibleDsl.g:6466:5: lv_parenthesised_expression_0_0= ruleEParenthesisedExpression
            {

            					newCompositeNode(grammarAccess.getEIsExpressionAccess().getParenthesised_expressionEParenthesisedExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_158);
            lv_parenthesised_expression_0_0=ruleEParenthesisedExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEIsExpressionRule());
            					}
            					set(
            						current,
            						"parenthesised_expression",
            						lv_parenthesised_expression_0_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EParenthesisedExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:6483:3: ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )?
            int alt180=3;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==135) ) {
                alt180=1;
            }
            else if ( ((LA180_0>=136 && LA180_0<=137)) ) {
                alt180=2;
            }
            switch (alt180) {
                case 1 :
                    // InternalAnsibleDsl.g:6484:4: (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) )
                    {
                    // InternalAnsibleDsl.g:6484:4: (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) )
                    // InternalAnsibleDsl.g:6485:5: otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) )
                    {
                    otherlv_1=(Token)match(input,135,FOLLOW_159); 

                    					newLeafNode(otherlv_1, grammarAccess.getEIsExpressionAccess().getIsKeyword_1_0_0());
                    				
                    // InternalAnsibleDsl.g:6489:5: ( (lv_is_not_2_0= 'not' ) )?
                    int alt178=2;
                    int LA178_0 = input.LA(1);

                    if ( (LA178_0==136) ) {
                        alt178=1;
                    }
                    switch (alt178) {
                        case 1 :
                            // InternalAnsibleDsl.g:6490:6: (lv_is_not_2_0= 'not' )
                            {
                            // InternalAnsibleDsl.g:6490:6: (lv_is_not_2_0= 'not' )
                            // InternalAnsibleDsl.g:6491:7: lv_is_not_2_0= 'not'
                            {
                            lv_is_not_2_0=(Token)match(input,136,FOLLOW_149); 

                            							newLeafNode(lv_is_not_2_0, grammarAccess.getEIsExpressionAccess().getIs_notNotKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEIsExpressionRule());
                            							}
                            							setWithLastConsumed(current, "is_not", lv_is_not_2_0, "not");
                            						

                            }


                            }
                            break;

                    }

                    // InternalAnsibleDsl.g:6503:5: ( (lv_status_3_0= ruleEIsExpression ) )
                    // InternalAnsibleDsl.g:6504:6: (lv_status_3_0= ruleEIsExpression )
                    {
                    // InternalAnsibleDsl.g:6504:6: (lv_status_3_0= ruleEIsExpression )
                    // InternalAnsibleDsl.g:6505:7: lv_status_3_0= ruleEIsExpression
                    {

                    							newCompositeNode(grammarAccess.getEIsExpressionAccess().getStatusEIsExpressionParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_status_3_0=ruleEIsExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEIsExpressionRule());
                    							}
                    							set(
                    								current,
                    								"status",
                    								lv_status_3_0,
                    								"org.sodalite.sdl.ansible.AnsibleDsl.EIsExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:6524:4: ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) )
                    {
                    // InternalAnsibleDsl.g:6524:4: ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) )
                    // InternalAnsibleDsl.g:6525:5: ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) )
                    {
                    // InternalAnsibleDsl.g:6525:5: ( (lv_is_not_4_0= 'not' ) )?
                    int alt179=2;
                    int LA179_0 = input.LA(1);

                    if ( (LA179_0==136) ) {
                        alt179=1;
                    }
                    switch (alt179) {
                        case 1 :
                            // InternalAnsibleDsl.g:6526:6: (lv_is_not_4_0= 'not' )
                            {
                            // InternalAnsibleDsl.g:6526:6: (lv_is_not_4_0= 'not' )
                            // InternalAnsibleDsl.g:6527:7: lv_is_not_4_0= 'not'
                            {
                            lv_is_not_4_0=(Token)match(input,136,FOLLOW_160); 

                            							newLeafNode(lv_is_not_4_0, grammarAccess.getEIsExpressionAccess().getIs_notNotKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEIsExpressionRule());
                            							}
                            							setWithLastConsumed(current, "is_not", lv_is_not_4_0, "not");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,137,FOLLOW_149); 

                    					newLeafNode(otherlv_5, grammarAccess.getEIsExpressionAccess().getInKeyword_1_1_1());
                    				
                    // InternalAnsibleDsl.g:6543:5: ( (lv_container_expression_6_0= ruleEIsExpression ) )
                    // InternalAnsibleDsl.g:6544:6: (lv_container_expression_6_0= ruleEIsExpression )
                    {
                    // InternalAnsibleDsl.g:6544:6: (lv_container_expression_6_0= ruleEIsExpression )
                    // InternalAnsibleDsl.g:6545:7: lv_container_expression_6_0= ruleEIsExpression
                    {

                    							newCompositeNode(grammarAccess.getEIsExpressionAccess().getContainer_expressionEIsExpressionParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_container_expression_6_0=ruleEIsExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEIsExpressionRule());
                    							}
                    							set(
                    								current,
                    								"container_expression",
                    								lv_container_expression_6_0,
                    								"org.sodalite.sdl.ansible.AnsibleDsl.EIsExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


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
    // $ANTLR end "ruleEIsExpression"


    // $ANTLR start "entryRuleEParenthesisedExpression"
    // InternalAnsibleDsl.g:6568:1: entryRuleEParenthesisedExpression returns [EObject current=null] : iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF ;
    public final EObject entryRuleEParenthesisedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParenthesisedExpression = null;


        try {
            // InternalAnsibleDsl.g:6568:65: (iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF )
            // InternalAnsibleDsl.g:6569:2: iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF
            {
             newCompositeNode(grammarAccess.getEParenthesisedExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParenthesisedExpression=ruleEParenthesisedExpression();

            state._fsp--;

             current =iv_ruleEParenthesisedExpression; 
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
    // $ANTLR end "entryRuleEParenthesisedExpression"


    // $ANTLR start "ruleEParenthesisedExpression"
    // InternalAnsibleDsl.g:6575:1: ruleEParenthesisedExpression returns [EObject current=null] : ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleEParenthesisedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_basic_value_0_0 = null;

        EObject lv_parenthesised_term_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6581:2: ( ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) ) )
            // InternalAnsibleDsl.g:6582:2: ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) )
            {
            // InternalAnsibleDsl.g:6582:2: ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) )
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( ((LA181_0>=RULE_STRING && LA181_0<=RULE_NULL)||LA181_0==111||LA181_0==113||(LA181_0>=142 && LA181_0<=143)) ) {
                alt181=1;
            }
            else if ( (LA181_0==117) ) {
                alt181=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 181, 0, input);

                throw nvae;
            }
            switch (alt181) {
                case 1 :
                    // InternalAnsibleDsl.g:6583:3: ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) )
                    {
                    // InternalAnsibleDsl.g:6583:3: ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) )
                    // InternalAnsibleDsl.g:6584:4: (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression )
                    {
                    // InternalAnsibleDsl.g:6584:4: (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression )
                    // InternalAnsibleDsl.g:6585:5: lv_basic_value_0_0= ruleEValuePassedToJinjaExpression
                    {

                    					newCompositeNode(grammarAccess.getEParenthesisedExpressionAccess().getBasic_valueEValuePassedToJinjaExpressionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_basic_value_0_0=ruleEValuePassedToJinjaExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEParenthesisedExpressionRule());
                    					}
                    					set(
                    						current,
                    						"basic_value",
                    						lv_basic_value_0_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassedToJinjaExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:6603:3: (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' )
                    {
                    // InternalAnsibleDsl.g:6603:3: (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' )
                    // InternalAnsibleDsl.g:6604:4: otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,117,FOLLOW_149); 

                    				newLeafNode(otherlv_1, grammarAccess.getEParenthesisedExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6608:4: ( (lv_parenthesised_term_2_0= ruleEOrExpression ) )
                    // InternalAnsibleDsl.g:6609:5: (lv_parenthesised_term_2_0= ruleEOrExpression )
                    {
                    // InternalAnsibleDsl.g:6609:5: (lv_parenthesised_term_2_0= ruleEOrExpression )
                    // InternalAnsibleDsl.g:6610:6: lv_parenthesised_term_2_0= ruleEOrExpression
                    {

                    						newCompositeNode(grammarAccess.getEParenthesisedExpressionAccess().getParenthesised_termEOrExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_151);
                    lv_parenthesised_term_2_0=ruleEOrExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParenthesisedExpressionRule());
                    						}
                    						set(
                    							current,
                    							"parenthesised_term",
                    							lv_parenthesised_term_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EOrExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,118,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEParenthesisedExpressionAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


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
    // $ANTLR end "ruleEParenthesisedExpression"


    // $ANTLR start "entryRuleEIfExpression"
    // InternalAnsibleDsl.g:6636:1: entryRuleEIfExpression returns [EObject current=null] : iv_ruleEIfExpression= ruleEIfExpression EOF ;
    public final EObject entryRuleEIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIfExpression = null;


        try {
            // InternalAnsibleDsl.g:6636:54: (iv_ruleEIfExpression= ruleEIfExpression EOF )
            // InternalAnsibleDsl.g:6637:2: iv_ruleEIfExpression= ruleEIfExpression EOF
            {
             newCompositeNode(grammarAccess.getEIfExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIfExpression=ruleEIfExpression();

            state._fsp--;

             current =iv_ruleEIfExpression; 
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
    // $ANTLR end "entryRuleEIfExpression"


    // $ANTLR start "ruleEIfExpression"
    // InternalAnsibleDsl.g:6643:1: ruleEIfExpression returns [EObject current=null] : (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? ) ;
    public final EObject ruleEIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_if_expression_1_0 = null;

        EObject lv_if_condition_3_0 = null;

        EObject lv_else_expression_5_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6649:2: ( (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? ) )
            // InternalAnsibleDsl.g:6650:2: (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:6650:2: (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? )
            // InternalAnsibleDsl.g:6651:3: otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )?
            {
            otherlv_0=(Token)match(input,138,FOLLOW_149); 

            			newLeafNode(otherlv_0, grammarAccess.getEIfExpressionAccess().getReturnKeyword_0());
            		
            // InternalAnsibleDsl.g:6655:3: ( (lv_if_expression_1_0= ruleEFilteredExpression ) )
            // InternalAnsibleDsl.g:6656:4: (lv_if_expression_1_0= ruleEFilteredExpression )
            {
            // InternalAnsibleDsl.g:6656:4: (lv_if_expression_1_0= ruleEFilteredExpression )
            // InternalAnsibleDsl.g:6657:5: lv_if_expression_1_0= ruleEFilteredExpression
            {

            					newCompositeNode(grammarAccess.getEIfExpressionAccess().getIf_expressionEFilteredExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_161);
            lv_if_expression_1_0=ruleEFilteredExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEIfExpressionRule());
            					}
            					set(
            						current,
            						"if_expression",
            						lv_if_expression_1_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EFilteredExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,139,FOLLOW_149); 

            			newLeafNode(otherlv_2, grammarAccess.getEIfExpressionAccess().getIfKeyword_2());
            		
            // InternalAnsibleDsl.g:6678:3: ( (lv_if_condition_3_0= ruleEFilteredExpression ) )
            // InternalAnsibleDsl.g:6679:4: (lv_if_condition_3_0= ruleEFilteredExpression )
            {
            // InternalAnsibleDsl.g:6679:4: (lv_if_condition_3_0= ruleEFilteredExpression )
            // InternalAnsibleDsl.g:6680:5: lv_if_condition_3_0= ruleEFilteredExpression
            {

            					newCompositeNode(grammarAccess.getEIfExpressionAccess().getIf_conditionEFilteredExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_162);
            lv_if_condition_3_0=ruleEFilteredExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEIfExpressionRule());
            					}
            					set(
            						current,
            						"if_condition",
            						lv_if_condition_3_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EFilteredExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:6697:3: (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==140) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalAnsibleDsl.g:6698:4: otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) )
                    {
                    otherlv_4=(Token)match(input,140,FOLLOW_149); 

                    				newLeafNode(otherlv_4, grammarAccess.getEIfExpressionAccess().getElseKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:6702:4: ( (lv_else_expression_5_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:6703:5: (lv_else_expression_5_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:6703:5: (lv_else_expression_5_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:6704:6: lv_else_expression_5_0= ruleEFilteredExpression
                    {

                    						newCompositeNode(grammarAccess.getEIfExpressionAccess().getElse_expressionEFilteredExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_else_expression_5_0=ruleEFilteredExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEIfExpressionRule());
                    						}
                    						set(
                    							current,
                    							"else_expression",
                    							lv_else_expression_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EFilteredExpression");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleEIfExpression"


    // $ANTLR start "entryRuleEDictionaryPairReference"
    // InternalAnsibleDsl.g:6726:1: entryRuleEDictionaryPairReference returns [EObject current=null] : iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF ;
    public final EObject entryRuleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPairReference = null;


        try {
            // InternalAnsibleDsl.g:6726:65: (iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF )
            // InternalAnsibleDsl.g:6727:2: iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF
            {
             newCompositeNode(grammarAccess.getEDictionaryPairReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDictionaryPairReference=ruleEDictionaryPairReference();

            state._fsp--;

             current =iv_ruleEDictionaryPairReference; 
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
    // $ANTLR end "entryRuleEDictionaryPairReference"


    // $ANTLR start "ruleEDictionaryPairReference"
    // InternalAnsibleDsl.g:6733:1: ruleEDictionaryPairReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6739:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? ) )
            // InternalAnsibleDsl.g:6740:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? )
            {
            // InternalAnsibleDsl.g:6740:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? )
            // InternalAnsibleDsl.g:6741:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            {
            // InternalAnsibleDsl.g:6741:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6742:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6742:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:6743:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDictionaryPairReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_163); 

            					newLeafNode(otherlv_0, grammarAccess.getEDictionaryPairReferenceAccess().getNameEDictionaryPairCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6754:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==113) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // InternalAnsibleDsl.g:6755:4: otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,113,FOLLOW_113); 

                    				newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairReferenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6759:4: ( (lv_index_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6760:5: (lv_index_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6760:5: (lv_index_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6761:6: lv_index_2_0= RULE_NUMBER
                    {
                    lv_index_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_146); 

                    						newLeafNode(lv_index_2_0, grammarAccess.getEDictionaryPairReferenceAccess().getIndexNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEDictionaryPairReferenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index",
                    							lv_index_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,114,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getEDictionaryPairReferenceAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleEDictionaryPairReference"


    // $ANTLR start "entryRuleEVariableDeclaration"
    // InternalAnsibleDsl.g:6786:1: entryRuleEVariableDeclaration returns [EObject current=null] : iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF ;
    public final EObject entryRuleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclaration = null;


        try {
            // InternalAnsibleDsl.g:6786:61: (iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF )
            // InternalAnsibleDsl.g:6787:2: iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getEVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVariableDeclaration=ruleEVariableDeclaration();

            state._fsp--;

             current =iv_ruleEVariableDeclaration; 
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
    // $ANTLR end "entryRuleEVariableDeclaration"


    // $ANTLR start "ruleEVariableDeclaration"
    // InternalAnsibleDsl.g:6793:1: ruleEVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6799:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:6800:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:6800:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:6801:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:6801:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6802:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6802:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6803:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_92); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEVariableDeclarationAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_164); 

            			newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:6823:3: ( (lv_value_passed_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6824:4: (lv_value_passed_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6824:4: (lv_value_passed_2_0= ruleEValue )
            // InternalAnsibleDsl.g:6825:5: lv_value_passed_2_0= ruleEValue
            {

            					newCompositeNode(grammarAccess.getEVariableDeclarationAccess().getValue_passedEValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_passed_2_0=ruleEValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEVariableDeclarationRule());
            					}
            					set(
            						current,
            						"value_passed",
            						lv_value_passed_2_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EValue");
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
    // $ANTLR end "ruleEVariableDeclaration"


    // $ANTLR start "entryRuleERegisterVariable"
    // InternalAnsibleDsl.g:6846:1: entryRuleERegisterVariable returns [EObject current=null] : iv_ruleERegisterVariable= ruleERegisterVariable EOF ;
    public final EObject entryRuleERegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariable = null;


        try {
            // InternalAnsibleDsl.g:6846:58: (iv_ruleERegisterVariable= ruleERegisterVariable EOF )
            // InternalAnsibleDsl.g:6847:2: iv_ruleERegisterVariable= ruleERegisterVariable EOF
            {
             newCompositeNode(grammarAccess.getERegisterVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERegisterVariable=ruleERegisterVariable();

            state._fsp--;

             current =iv_ruleERegisterVariable; 
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
    // $ANTLR end "entryRuleERegisterVariable"


    // $ANTLR start "ruleERegisterVariable"
    // InternalAnsibleDsl.g:6853:1: ruleERegisterVariable returns [EObject current=null] : (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleERegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6859:2: ( (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:6860:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:6860:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6861:3: otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,141,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableAccess().getRegisterKeyword_0());
            		
            // InternalAnsibleDsl.g:6865:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6866:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6866:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:6867:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getERegisterVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERegisterVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleERegisterVariable"


    // $ANTLR start "entryRuleEInputVariable"
    // InternalAnsibleDsl.g:6887:1: entryRuleEInputVariable returns [EObject current=null] : iv_ruleEInputVariable= ruleEInputVariable EOF ;
    public final EObject entryRuleEInputVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputVariable = null;


        try {
            // InternalAnsibleDsl.g:6887:55: (iv_ruleEInputVariable= ruleEInputVariable EOF )
            // InternalAnsibleDsl.g:6888:2: iv_ruleEInputVariable= ruleEInputVariable EOF
            {
             newCompositeNode(grammarAccess.getEInputVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInputVariable=ruleEInputVariable();

            state._fsp--;

             current =iv_ruleEInputVariable; 
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
    // $ANTLR end "entryRuleEInputVariable"


    // $ANTLR start "ruleEInputVariable"
    // InternalAnsibleDsl.g:6894:1: ruleEInputVariable returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleEInputVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6900:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:6901:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalAnsibleDsl.g:6901:2: ( (otherlv_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:6902:3: (otherlv_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:6902:3: (otherlv_0= RULE_STRING )
            // InternalAnsibleDsl.g:6903:4: otherlv_0= RULE_STRING
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEInputVariableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEInputVariableAccess().getNameEParameterDefinitionCrossReference_0());
            			

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
    // $ANTLR end "ruleEInputVariable"


    // $ANTLR start "entryRuleEFactGathered"
    // InternalAnsibleDsl.g:6917:1: entryRuleEFactGathered returns [EObject current=null] : iv_ruleEFactGathered= ruleEFactGathered EOF ;
    public final EObject entryRuleEFactGathered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactGathered = null;


        try {
            // InternalAnsibleDsl.g:6917:54: (iv_ruleEFactGathered= ruleEFactGathered EOF )
            // InternalAnsibleDsl.g:6918:2: iv_ruleEFactGathered= ruleEFactGathered EOF
            {
             newCompositeNode(grammarAccess.getEFactGatheredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFactGathered=ruleEFactGathered();

            state._fsp--;

             current =iv_ruleEFactGathered; 
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
    // $ANTLR end "entryRuleEFactGathered"


    // $ANTLR start "ruleEFactGathered"
    // InternalAnsibleDsl.g:6924:1: ruleEFactGathered returns [EObject current=null] : ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEFactGathered() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tail_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6930:2: ( ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:6931:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:6931:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:6932:3: () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            {
            // InternalAnsibleDsl.g:6932:3: ()
            // InternalAnsibleDsl.g:6933:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactGatheredAccess().getEFactGatheredAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,142,FOLLOW_144); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactGatheredAccess().getAnsible_factsKeyword_1());
            		
            // InternalAnsibleDsl.g:6943:3: (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            loop184:
            do {
                int alt184=2;
                int LA184_0 = input.LA(1);

                if ( (LA184_0==112) ) {
                    int LA184_2 = input.LA(2);

                    if ( (LA184_2==RULE_ID) ) {
                        int LA184_3 = input.LA(3);

                        if ( (LA184_3==EOF||LA184_3==19||LA184_3==33||LA184_3==35||LA184_3==47||(LA184_3>=52 && LA184_3<=55)||LA184_3==59||(LA184_3>=73 && LA184_3<=75)||(LA184_3>=94 && LA184_3<=96)||LA184_3==99||LA184_3==112||LA184_3==116||(LA184_3>=118 && LA184_3<=137)||(LA184_3>=139 && LA184_3<=141)) ) {
                            alt184=1;
                        }


                    }


                }


                switch (alt184) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6944:4: otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,112,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEFactGatheredAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6948:4: ( (lv_tail_3_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:6949:5: (lv_tail_3_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:6949:5: (lv_tail_3_0= RULE_ID )
            	    // InternalAnsibleDsl.g:6950:6: lv_tail_3_0= RULE_ID
            	    {
            	    lv_tail_3_0=(Token)match(input,RULE_ID,FOLLOW_144); 

            	    						newLeafNode(lv_tail_3_0, grammarAccess.getEFactGatheredAccess().getTailIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEFactGatheredRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"tail",
            	    							lv_tail_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop184;
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
    // $ANTLR end "ruleEFactGathered"


    // $ANTLR start "entryRuleEDictionary"
    // InternalAnsibleDsl.g:6971:1: entryRuleEDictionary returns [EObject current=null] : iv_ruleEDictionary= ruleEDictionary EOF ;
    public final EObject entryRuleEDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionary = null;


        try {
            // InternalAnsibleDsl.g:6971:52: (iv_ruleEDictionary= ruleEDictionary EOF )
            // InternalAnsibleDsl.g:6972:2: iv_ruleEDictionary= ruleEDictionary EOF
            {
             newCompositeNode(grammarAccess.getEDictionaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDictionary=ruleEDictionary();

            state._fsp--;

             current =iv_ruleEDictionary; 
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
    // $ANTLR end "entryRuleEDictionary"


    // $ANTLR start "ruleEDictionary"
    // InternalAnsibleDsl.g:6978:1: ruleEDictionary returns [EObject current=null] : (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dictionary_pairs_1_0 = null;

        EObject lv_dictionary_pairs_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6984:2: ( (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:6985:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:6985:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:6986:3: otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,143,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEDictionaryAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:6990:3: ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) )
            // InternalAnsibleDsl.g:6991:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            {
            // InternalAnsibleDsl.g:6991:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            // InternalAnsibleDsl.g:6992:5: lv_dictionary_pairs_1_0= ruleEDictionaryPair
            {

            					newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_dictionary_pairs_1_0=ruleEDictionaryPair();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDictionaryRule());
            					}
            					add(
            						current,
            						"dictionary_pairs",
            						lv_dictionary_pairs_1_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EDictionaryPair");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:7009:3: (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )*
            loop185:
            do {
                int alt185=2;
                int LA185_0 = input.LA(1);

                if ( (LA185_0==33) ) {
                    alt185=1;
                }


                switch (alt185) {
            	case 1 :
            	    // InternalAnsibleDsl.g:7010:4: otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEDictionaryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:7014:4: ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    // InternalAnsibleDsl.g:7015:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    {
            	    // InternalAnsibleDsl.g:7015:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    // InternalAnsibleDsl.g:7016:6: lv_dictionary_pairs_3_0= ruleEDictionaryPair
            	    {

            	    						newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_dictionary_pairs_3_0=ruleEDictionaryPair();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEDictionaryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dictionary_pairs",
            	    							lv_dictionary_pairs_3_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.EDictionaryPair");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop185;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEDictionaryAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEDictionary"


    // $ANTLR start "entryRuleEDictionaryPair"
    // InternalAnsibleDsl.g:7042:1: entryRuleEDictionaryPair returns [EObject current=null] : iv_ruleEDictionaryPair= ruleEDictionaryPair EOF ;
    public final EObject entryRuleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPair = null;


        try {
            // InternalAnsibleDsl.g:7042:56: (iv_ruleEDictionaryPair= ruleEDictionaryPair EOF )
            // InternalAnsibleDsl.g:7043:2: iv_ruleEDictionaryPair= ruleEDictionaryPair EOF
            {
             newCompositeNode(grammarAccess.getEDictionaryPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDictionaryPair=ruleEDictionaryPair();

            state._fsp--;

             current =iv_ruleEDictionaryPair; 
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
    // $ANTLR end "entryRuleEDictionaryPair"


    // $ANTLR start "ruleEDictionaryPair"
    // InternalAnsibleDsl.g:7049:1: ruleEDictionaryPair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:7055:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:7056:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:7056:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:7057:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:7057:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:7058:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:7058:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:7059:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_92); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEDictionaryPairAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDictionaryPairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,62,FOLLOW_164); 

            			newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:7079:3: ( (lv_value_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:7080:4: (lv_value_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:7080:4: (lv_value_2_0= ruleEValue )
            // InternalAnsibleDsl.g:7081:5: lv_value_2_0= ruleEValue
            {

            					newCompositeNode(grammarAccess.getEDictionaryPairAccess().getValueEValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDictionaryPairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EValue");
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
    // $ANTLR end "ruleEDictionaryPair"


    // $ANTLR start "entryRuleEList"
    // InternalAnsibleDsl.g:7102:1: entryRuleEList returns [EObject current=null] : iv_ruleEList= ruleEList EOF ;
    public final EObject entryRuleEList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEList = null;


        try {
            // InternalAnsibleDsl.g:7102:46: (iv_ruleEList= ruleEList EOF )
            // InternalAnsibleDsl.g:7103:2: iv_ruleEList= ruleEList EOF
            {
             newCompositeNode(grammarAccess.getEListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEList=ruleEList();

            state._fsp--;

             current =iv_ruleEList; 
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
    // $ANTLR end "entryRuleEList"


    // $ANTLR start "ruleEList"
    // InternalAnsibleDsl.g:7109:1: ruleEList returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:7115:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) )
            // InternalAnsibleDsl.g:7116:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            {
            // InternalAnsibleDsl.g:7116:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            // InternalAnsibleDsl.g:7117:3: otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,113,FOLLOW_164); 

            			newLeafNode(otherlv_0, grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:7121:3: ( (lv_elements_1_0= ruleEValue ) )
            // InternalAnsibleDsl.g:7122:4: (lv_elements_1_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:7122:4: (lv_elements_1_0= ruleEValue )
            // InternalAnsibleDsl.g:7123:5: lv_elements_1_0= ruleEValue
            {

            					newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_165);
            lv_elements_1_0=ruleEValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEListRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:7140:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )*
            loop186:
            do {
                int alt186=2;
                int LA186_0 = input.LA(1);

                if ( (LA186_0==33) ) {
                    alt186=1;
                }


                switch (alt186) {
            	case 1 :
            	    // InternalAnsibleDsl.g:7141:4: otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_164); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:7145:4: ( (lv_elements_3_0= ruleEValue ) )
            	    // InternalAnsibleDsl.g:7146:5: (lv_elements_3_0= ruleEValue )
            	    {
            	    // InternalAnsibleDsl.g:7146:5: (lv_elements_3_0= ruleEValue )
            	    // InternalAnsibleDsl.g:7147:6: lv_elements_3_0= ruleEValue
            	    {

            	    						newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_165);
            	    lv_elements_3_0=ruleEValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_3_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.EValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop186;
                }
            } while (true);

            otherlv_4=(Token)match(input,114,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEListAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEList"

    // Delegated rules


    protected DFA24 dfa24 = new DFA24(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\23\12\uffff";
    static final String dfa_4s = "\1\144\12\uffff";
    static final String dfa_5s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\1\0\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\16\uffff\1\3\1\5\1\6\1\7\1\10\1\12\30\uffff\1\11\42\uffff\1\4",
            "",
            "",
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
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 329:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_0 = input.LA(1);

                         
                        int index24_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA24_0==EOF||LA24_0==19) ) {s = 1;}

                        else if ( LA24_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA24_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA24_0 == 100 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA24_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA24_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA24_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA24_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA24_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {s = 10;}

                         
                        input.seek(index24_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000001F800100000L,0x0000001000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000001FDF0700002L,0x0000001000241002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000001FDF0700002L,0x0000001000240002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000001FDF0700002L,0x0000001000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000001FDF0700002L,0x0000001000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000001FDF0500002L,0x0000001000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000001FDF0100002L,0x0000001000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000001FDE0100002L,0x0000001000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000001FDC0100002L,0x0000001000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000001FD80100002L,0x0000001000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000001FD00100002L,0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000001FC00100002L,0x0000001000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000080000L,0x000000003E000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000001F800100002L,0x0000001000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000080000L,0x00000003C0000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0004080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004080000080000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000007F800100002L,0x0000001000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000005F800100002L,0x0000001000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000E009F0600000L,0x0000020000241000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000E009F0600000L,0x0000020000240000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000E009F0600000L,0x0000020000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000E009F0600000L,0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000E009F0400000L,0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000E009F0000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000E009E0000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000E009C0000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000E00980000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000E00900000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000E00800000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000080000L,0x0000000030000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000C00800000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000C00800000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00000000000001F0L,0x0022800000000000L,0x000000000000C400L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000080000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0003000000080000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000000080000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00F06009F0600000L,0x0000020000241000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00F06009F0600000L,0x0000020000240000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00F06009F0600000L,0x0000020000200000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00F06009F0600000L,0x0000020000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x00F06009F0400000L,0x0000020000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00F06009F0000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x00F06009E0000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x00F06009C0000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x00F0600980000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00F0600900000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x00F0600800000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x00F0400800000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x00F0400800000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x00F0000800000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000080000L,0x0000000DC0000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0100000000080000L,0x0000000000000E04L,0x0000000000002000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000010L,0x0000400000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000080010L,0x0000400000000E04L,0x0000000000002000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0900000000080000L,0x0000000000000E04L,0x0000000000002000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0800000000080010L,0x0000400000000E04L,0x0000000000002000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0800000000080000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0800000000080000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x00000000000001B0L,0x000A000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x00006001F0680000L,0x0000020000241000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x00006001F0680000L,0x0000020000240000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x00006001F0680000L,0x0000020000200000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x00006001F0680000L,0x0000020000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x00006001F0480000L,0x0000020000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x00006001F0080000L,0x0000020000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x00006001E0080000L,0x0000020000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x00006001C0080000L,0x0000020000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000600180080000L,0x0000020000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000600100080000L,0x0000020000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000600000080000L,0x0000020000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000400000080000L,0x0000020000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x8000000000080000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000080000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000080000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000080000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000180L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000E00L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000080000L,0x000000000003E000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000080000L,0x000000000003C000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000080000L,0x0000000000038000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000080000L,0x0000000000030000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000080000L,0x0000000000020000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000080000L,0x0000000000180000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000080000L,0x0000000000100000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000080000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000080000L,0x0000000001800000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000080000L,0x0000000001000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000002L,0x000000003C000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000002L,0x0000000038000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000002L,0x0000000030000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000002L,0x0000000180000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000002L,0x00000001C0000000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000002L,0x00000009C0000000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000080000L,0x000001E000000000L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000080000L,0x000001C000000000L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000080000L,0x0000018000000000L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000080000L,0x0000010000000000L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000000080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000000002L,0x0000300000000000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000000012L,0x0008000000000000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x00000000000001F0L,0x0022800000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x0000000200000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x0000000000000002L,0x0081000000000000L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x00000000000001F0L,0x0002800000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_156 = new BitSet(new long[]{0x0000000000000002L,0xFC00000000000000L});
    public static final BitSet FOLLOW_157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x00000000000001F0L,0x0022800000000000L,0x000000000000C100L});
    public static final BitSet FOLLOW_160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_162 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_163 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_164 = new BitSet(new long[]{0x00000000000001B0L,0x0002000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_165 = new BitSet(new long[]{0x0000000200000000L,0x0004000000000000L});

}
