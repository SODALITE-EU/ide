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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'playbook{'", "'playbook_name:'", "'plays{'", "'play{'", "'}'", "'play_name:'", "'no_log:'", "'debugger:'", "'always'", "'never'", "'on_failed'", "'on_unreachable'", "'on_skipped'", "'module_defaults:'", "'environment:'", "'collections:'", "'tags:'", "'vars{'", "','", "'play_exe_settings{'", "'error_handling{'", "'vars_files:'", "'vars_prompt:'", "'force_handlers:'", "'pre_tasks{'", "'tasks_list{'", "'post_tasks{'", "'handlers{'", "'block{'", "'block_name:'", "'exe_settings{'", "'when:'", "'tasks{'", "'rescue_tasks{'", "'always_tasks{'", "'task{'", "'task_name:'", "'action:'", "'asynchronous_settings{'", "'args:'", "'module_call{'", "'notify:'", "'handler{'", "'handler_name:'", "'listen:'", "'module_name:'", "'parameters{'", "':'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'is'", "'not'", "'skipped'", "'failed'", "'succeeded'", "'fail'", "'success'", "'defined'", "'undefined'", "'('", "')'", "'and'", "'or'", "'role{'", "'role_name:'", "'roles_inclusions{'", "'loop:'", "'loop_control{'", "'label:'", "'pause:'", "'index_var:'", "'loop_var:'", "'extended:'", "'until:'", "'retries:'", "'delay:'", "'privilage_escalation{'", "'become:'", "'become_exe:'", "'become_flags:'", "'become_method:'", "'become_user:'", "'validation_mode{'", "'check_mode:'", "'diff:'", "'connection_info{'", "'connection:'", "'port:'", "'remote_user:'", "'strategy:'", "'serial:'", "'order:'", "'throttle:'", "'run_once:'", "'any_errors_fatal:'", "'ignore_errors:'", "'ignore_unreachable:'", "'max_fail_percentage:'", "'changed_when:'", "'failed_when:'", "'facts_setttings{'", "'gather_facts:'", "'gather_subset:'", "'gather_timeout:'", "'fact_path:'", "'delegation{'", "'delegate_to:'", "'delegate_facts:'", "'async:'", "'poll:'", "'topic:'", "'{{'", "'item'", "'.'", "'|'", "'}}'", "'['", "']'", "'register:'", "'ansible_facts'", "'{'"
    };
    public static final int T__50=50;
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
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=6;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
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
    public static final int T__13=13;
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
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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
    // InternalAnsibleDsl.g:96:1: ruleEPlaybook returns [EObject current=null] : (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'plays{' (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+ otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleEPlaybook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_plays_5_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:102:2: ( (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'plays{' (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+ otherlv_7= '}' otherlv_8= '}' ) )
            // InternalAnsibleDsl.g:103:2: (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'plays{' (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+ otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalAnsibleDsl.g:103:2: (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'plays{' (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+ otherlv_7= '}' otherlv_8= '}' )
            // InternalAnsibleDsl.g:104:3: otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'plays{' (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+ otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEPlaybookAccess().getPlaybookKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

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

            otherlv_3=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEPlaybookAccess().getPlaysKeyword_3());
            		
            // InternalAnsibleDsl.g:134:3: (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnsibleDsl.g:135:4: otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}'
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEPlaybookAccess().getPlayKeyword_4_0());
            	    			
            	    // InternalAnsibleDsl.g:139:4: ( (lv_plays_5_0= ruleEPlay ) )
            	    // InternalAnsibleDsl.g:140:5: (lv_plays_5_0= ruleEPlay )
            	    {
            	    // InternalAnsibleDsl.g:140:5: (lv_plays_5_0= ruleEPlay )
            	    // InternalAnsibleDsl.g:141:6: lv_plays_5_0= ruleEPlay
            	    {

            	    						newCompositeNode(grammarAccess.getEPlaybookAccess().getPlaysEPlayParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_plays_5_0=ruleEPlay();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEPlaybookRule());
            	    						}
            	    						add(
            	    							current,
            	    							"plays",
            	    							lv_plays_5_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.EPlay");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_4_2());
            	    			

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

            otherlv_7=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalAnsibleDsl.g:175:1: entryRuleEExecution returns [EObject current=null] : iv_ruleEExecution= ruleEExecution EOF ;
    public final EObject entryRuleEExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecution = null;


        try {
            // InternalAnsibleDsl.g:175:51: (iv_ruleEExecution= ruleEExecution EOF )
            // InternalAnsibleDsl.g:176:2: iv_ruleEExecution= ruleEExecution EOF
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
    // InternalAnsibleDsl.g:182:1: ruleEExecution returns [EObject current=null] : (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion ) ;
    public final EObject ruleEExecution() throws RecognitionException {
        EObject current = null;

        EObject this_EBlock_0 = null;

        EObject this_ETaskHandler_1 = null;

        EObject this_ERoleInclusion_2 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:188:2: ( (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion ) )
            // InternalAnsibleDsl.g:189:2: (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion )
            {
            // InternalAnsibleDsl.g:189:2: (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt2=1;
                }
                break;
            case 48:
            case 55:
                {
                alt2=2;
                }
                break;
            case 80:
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
                    // InternalAnsibleDsl.g:190:3: this_EBlock_0= ruleEBlock
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
                    // InternalAnsibleDsl.g:199:3: this_ETaskHandler_1= ruleETaskHandler
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
                    // InternalAnsibleDsl.g:208:3: this_ERoleInclusion_2= ruleERoleInclusion
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
    // InternalAnsibleDsl.g:220:1: entryRuleEBlockTask returns [EObject current=null] : iv_ruleEBlockTask= ruleEBlockTask EOF ;
    public final EObject entryRuleEBlockTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockTask = null;


        try {
            // InternalAnsibleDsl.g:220:51: (iv_ruleEBlockTask= ruleEBlockTask EOF )
            // InternalAnsibleDsl.g:221:2: iv_ruleEBlockTask= ruleEBlockTask EOF
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
    // InternalAnsibleDsl.g:227:1: ruleEBlockTask returns [EObject current=null] : (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask ) ;
    public final EObject ruleEBlockTask() throws RecognitionException {
        EObject current = null;

        EObject this_EBlock_0 = null;

        EObject this_ETask_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:233:2: ( (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask ) )
            // InternalAnsibleDsl.g:234:2: (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask )
            {
            // InternalAnsibleDsl.g:234:2: (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==41) ) {
                alt3=1;
            }
            else if ( (LA3_0==48) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAnsibleDsl.g:235:3: this_EBlock_0= ruleEBlock
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
                    // InternalAnsibleDsl.g:244:3: this_ETask_1= ruleETask
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
    // InternalAnsibleDsl.g:256:1: entryRuleETaskHandler returns [EObject current=null] : iv_ruleETaskHandler= ruleETaskHandler EOF ;
    public final EObject entryRuleETaskHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandler = null;


        try {
            // InternalAnsibleDsl.g:256:53: (iv_ruleETaskHandler= ruleETaskHandler EOF )
            // InternalAnsibleDsl.g:257:2: iv_ruleETaskHandler= ruleETaskHandler EOF
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
    // InternalAnsibleDsl.g:263:1: ruleETaskHandler returns [EObject current=null] : (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler ) ;
    public final EObject ruleETaskHandler() throws RecognitionException {
        EObject current = null;

        EObject this_ETask_0 = null;

        EObject this_EHandler_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:269:2: ( (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler ) )
            // InternalAnsibleDsl.g:270:2: (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler )
            {
            // InternalAnsibleDsl.g:270:2: (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==48) ) {
                alt4=1;
            }
            else if ( (LA4_0==55) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAnsibleDsl.g:271:3: this_ETask_0= ruleETask
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
                    // InternalAnsibleDsl.g:280:3: this_EHandler_1= ruleEHandler
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
    // InternalAnsibleDsl.g:292:1: entryRuleEPlay returns [EObject current=null] : iv_ruleEPlay= ruleEPlay EOF ;
    public final EObject entryRuleEPlay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlay = null;


        try {
            // InternalAnsibleDsl.g:292:46: (iv_ruleEPlay= ruleEPlay EOF )
            // InternalAnsibleDsl.g:293:2: iv_ruleEPlay= ruleEPlay EOF
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
    // InternalAnsibleDsl.g:299:1: ruleEPlay returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalAnsibleDsl.g:305:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:306:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:306:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:307:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:307:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:308:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:311:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:312:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:312:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=10;
                alt24 = dfa24.predict(input);
                switch (alt24) {
            	case 1 :
            	    // InternalAnsibleDsl.g:313:3: ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:313:3: ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:314:4: {...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:314:99: ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:315:5: ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:318:8: ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) )
            	    // InternalAnsibleDsl.g:318:9: {...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:318:18: ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? )
            	    // InternalAnsibleDsl.g:318:19: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )?
            	    {
            	    // InternalAnsibleDsl.g:318:19: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:319:9: otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_4); 

            	    									newLeafNode(otherlv_1, grammarAccess.getEPlayAccess().getPlay_nameKeyword_0_0_0());
            	    								
            	    // InternalAnsibleDsl.g:323:9: ( (lv_name_2_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:324:10: (lv_name_2_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:324:10: (lv_name_2_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:325:11: lv_name_2_0= RULE_STRING
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            	    // InternalAnsibleDsl.g:342:8: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==93) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:343:9: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
            	            {
            	            // InternalAnsibleDsl.g:343:9: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
            	            // InternalAnsibleDsl.g:344:10: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
            	            {

            	            										newCompositeNode(grammarAccess.getEPlayAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_0_1_0());
            	            									
            	            pushFollow(FOLLOW_11);
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

            	    // InternalAnsibleDsl.g:361:8: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==99) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:362:9: (lv_validation_mode_4_0= ruleEValidationMode )
            	            {
            	            // InternalAnsibleDsl.g:362:9: (lv_validation_mode_4_0= ruleEValidationMode )
            	            // InternalAnsibleDsl.g:363:10: lv_validation_mode_4_0= ruleEValidationMode
            	            {

            	            										newCompositeNode(grammarAccess.getEPlayAccess().getValidation_modeEValidationModeParserRuleCall_0_2_0());
            	            									
            	            pushFollow(FOLLOW_12);
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

            	    // InternalAnsibleDsl.g:380:8: ( (lv_connection_5_0= ruleEConnection ) )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==102) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:381:9: (lv_connection_5_0= ruleEConnection )
            	            {
            	            // InternalAnsibleDsl.g:381:9: (lv_connection_5_0= ruleEConnection )
            	            // InternalAnsibleDsl.g:382:10: lv_connection_5_0= ruleEConnection
            	            {

            	            										newCompositeNode(grammarAccess.getEPlayAccess().getConnectionEConnectionParserRuleCall_0_3_0());
            	            									
            	            pushFollow(FOLLOW_13);
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

            	    // InternalAnsibleDsl.g:399:8: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==19) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:400:9: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
            	            {
            	            otherlv_6=(Token)match(input,19,FOLLOW_14); 

            	            									newLeafNode(otherlv_6, grammarAccess.getEPlayAccess().getNo_logKeyword_0_4_0());
            	            								
            	            // InternalAnsibleDsl.g:404:9: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
            	            // InternalAnsibleDsl.g:405:10: (lv_no_log_7_0= RULE_BOOLEAN )
            	            {
            	            // InternalAnsibleDsl.g:405:10: (lv_no_log_7_0= RULE_BOOLEAN )
            	            // InternalAnsibleDsl.g:406:11: lv_no_log_7_0= RULE_BOOLEAN
            	            {
            	            lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_15); 

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

            	    // InternalAnsibleDsl.g:423:8: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==20) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:424:9: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
            	            {
            	            otherlv_8=(Token)match(input,20,FOLLOW_16); 

            	            									newLeafNode(otherlv_8, grammarAccess.getEPlayAccess().getDebuggerKeyword_0_5_0());
            	            								
            	            // InternalAnsibleDsl.g:428:9: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
            	            // InternalAnsibleDsl.g:429:10: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
            	            {
            	            // InternalAnsibleDsl.g:429:10: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
            	            // InternalAnsibleDsl.g:430:11: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
            	            {
            	            // InternalAnsibleDsl.g:430:11: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
            	            int alt9=5;
            	            switch ( input.LA(1) ) {
            	            case 21:
            	                {
            	                alt9=1;
            	                }
            	                break;
            	            case 22:
            	                {
            	                alt9=2;
            	                }
            	                break;
            	            case 23:
            	                {
            	                alt9=3;
            	                }
            	                break;
            	            case 24:
            	                {
            	                alt9=4;
            	                }
            	                break;
            	            case 25:
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
            	                    // InternalAnsibleDsl.g:431:12: lv_debugger_9_1= 'always'
            	                    {
            	                    lv_debugger_9_1=(Token)match(input,21,FOLLOW_17); 

            	                    												newLeafNode(lv_debugger_9_1, grammarAccess.getEPlayAccess().getDebuggerAlwaysKeyword_0_5_1_0_0());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
            	                    											

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalAnsibleDsl.g:442:12: lv_debugger_9_2= 'never'
            	                    {
            	                    lv_debugger_9_2=(Token)match(input,22,FOLLOW_17); 

            	                    												newLeafNode(lv_debugger_9_2, grammarAccess.getEPlayAccess().getDebuggerNeverKeyword_0_5_1_0_1());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
            	                    											

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalAnsibleDsl.g:453:12: lv_debugger_9_3= 'on_failed'
            	                    {
            	                    lv_debugger_9_3=(Token)match(input,23,FOLLOW_17); 

            	                    												newLeafNode(lv_debugger_9_3, grammarAccess.getEPlayAccess().getDebuggerOn_failedKeyword_0_5_1_0_2());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
            	                    											

            	                    }
            	                    break;
            	                case 4 :
            	                    // InternalAnsibleDsl.g:464:12: lv_debugger_9_4= 'on_unreachable'
            	                    {
            	                    lv_debugger_9_4=(Token)match(input,24,FOLLOW_17); 

            	                    												newLeafNode(lv_debugger_9_4, grammarAccess.getEPlayAccess().getDebuggerOn_unreachableKeyword_0_5_1_0_3());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
            	                    											

            	                    }
            	                    break;
            	                case 5 :
            	                    // InternalAnsibleDsl.g:475:12: lv_debugger_9_5= 'on_skipped'
            	                    {
            	                    lv_debugger_9_5=(Token)match(input,25,FOLLOW_17); 

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

            	    // InternalAnsibleDsl.g:489:8: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==26) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:490:9: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
            	            {
            	            otherlv_10=(Token)match(input,26,FOLLOW_18); 

            	            									newLeafNode(otherlv_10, grammarAccess.getEPlayAccess().getModule_defaultsKeyword_0_6_0());
            	            								
            	            // InternalAnsibleDsl.g:494:9: ( (lv_module_defaults_11_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:495:10: (lv_module_defaults_11_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:495:10: (lv_module_defaults_11_0= ruleEList )
            	            // InternalAnsibleDsl.g:496:11: lv_module_defaults_11_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getModule_defaultsEListParserRuleCall_0_6_1_0());
            	            										
            	            pushFollow(FOLLOW_19);
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

            	    // InternalAnsibleDsl.g:514:8: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==27) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:515:9: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
            	            {
            	            otherlv_12=(Token)match(input,27,FOLLOW_18); 

            	            									newLeafNode(otherlv_12, grammarAccess.getEPlayAccess().getEnvironmentKeyword_0_7_0());
            	            								
            	            // InternalAnsibleDsl.g:519:9: ( (lv_environment_13_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:520:10: (lv_environment_13_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:520:10: (lv_environment_13_0= ruleEList )
            	            // InternalAnsibleDsl.g:521:11: lv_environment_13_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getEnvironmentEListParserRuleCall_0_7_1_0());
            	            										
            	            pushFollow(FOLLOW_20);
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

            	    // InternalAnsibleDsl.g:539:8: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==28) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:540:9: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
            	            {
            	            otherlv_14=(Token)match(input,28,FOLLOW_18); 

            	            									newLeafNode(otherlv_14, grammarAccess.getEPlayAccess().getCollectionsKeyword_0_8_0());
            	            								
            	            // InternalAnsibleDsl.g:544:9: ( (lv_collections_15_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:545:10: (lv_collections_15_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:545:10: (lv_collections_15_0= ruleEList )
            	            // InternalAnsibleDsl.g:546:11: lv_collections_15_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getCollectionsEListParserRuleCall_0_8_1_0());
            	            										
            	            pushFollow(FOLLOW_21);
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

            	    // InternalAnsibleDsl.g:564:8: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==29) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:565:9: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
            	            {
            	            otherlv_16=(Token)match(input,29,FOLLOW_18); 

            	            									newLeafNode(otherlv_16, grammarAccess.getEPlayAccess().getTagsKeyword_0_9_0());
            	            								
            	            // InternalAnsibleDsl.g:569:9: ( (lv_tags_17_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:570:10: (lv_tags_17_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:570:10: (lv_tags_17_0= ruleEList )
            	            // InternalAnsibleDsl.g:571:11: lv_tags_17_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getTagsEListParserRuleCall_0_9_1_0());
            	            										
            	            pushFollow(FOLLOW_22);
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

            	    // InternalAnsibleDsl.g:589:8: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==30) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:590:9: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
            	            {
            	            otherlv_18=(Token)match(input,30,FOLLOW_23); 

            	            									newLeafNode(otherlv_18, grammarAccess.getEPlayAccess().getVarsKeyword_0_10_0());
            	            								
            	            // InternalAnsibleDsl.g:594:9: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
            	            // InternalAnsibleDsl.g:595:10: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
            	            {
            	            // InternalAnsibleDsl.g:595:10: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
            	            // InternalAnsibleDsl.g:596:11: lv_variable_declarations_19_0= ruleEVariableDeclaration
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_0_10_1_0());
            	            										
            	            pushFollow(FOLLOW_24);
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

            	            // InternalAnsibleDsl.g:613:9: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
            	            loop15:
            	            do {
            	                int alt15=2;
            	                int LA15_0 = input.LA(1);

            	                if ( (LA15_0==31) ) {
            	                    alt15=1;
            	                }


            	                switch (alt15) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:614:10: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
            	            	    {
            	            	    otherlv_20=(Token)match(input,31,FOLLOW_23); 

            	            	    										newLeafNode(otherlv_20, grammarAccess.getEPlayAccess().getCommaKeyword_0_10_2_0());
            	            	    									
            	            	    // InternalAnsibleDsl.g:618:10: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
            	            	    // InternalAnsibleDsl.g:619:11: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
            	            	    {
            	            	    // InternalAnsibleDsl.g:619:11: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
            	            	    // InternalAnsibleDsl.g:620:12: lv_variable_declarations_21_0= ruleEVariableDeclaration
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getEPlayAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_0_10_2_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_24);
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

            	            otherlv_22=(Token)match(input,17,FOLLOW_25); 

            	            									newLeafNode(otherlv_22, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_0_10_3());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:643:8: (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==32) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:644:9: otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}'
            	            {
            	            otherlv_23=(Token)match(input,32,FOLLOW_26); 

            	            									newLeafNode(otherlv_23, grammarAccess.getEPlayAccess().getPlay_exe_settingsKeyword_0_11_0());
            	            								
            	            // InternalAnsibleDsl.g:648:9: ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) )
            	            // InternalAnsibleDsl.g:649:10: (lv_play_exe_settings_24_0= ruleEPlayExeSettings )
            	            {
            	            // InternalAnsibleDsl.g:649:10: (lv_play_exe_settings_24_0= ruleEPlayExeSettings )
            	            // InternalAnsibleDsl.g:650:11: lv_play_exe_settings_24_0= ruleEPlayExeSettings
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getPlay_exe_settingsEPlayExeSettingsParserRuleCall_0_11_1_0());
            	            										
            	            pushFollow(FOLLOW_8);
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

            	            otherlv_25=(Token)match(input,17,FOLLOW_27); 

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
            	    // InternalAnsibleDsl.g:678:3: ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:678:3: ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:679:4: {...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:679:99: ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) )
            	    // InternalAnsibleDsl.g:680:5: ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:683:8: ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) )
            	    // InternalAnsibleDsl.g:683:9: {...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:683:18: (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' )
            	    // InternalAnsibleDsl.g:683:19: otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}'
            	    {
            	    otherlv_26=(Token)match(input,33,FOLLOW_28); 

            	    								newLeafNode(otherlv_26, grammarAccess.getEPlayAccess().getError_handlingKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:687:8: ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) )
            	    // InternalAnsibleDsl.g:688:9: (lv_error_handling_27_0= ruleEPlayErrorHandling )
            	    {
            	    // InternalAnsibleDsl.g:688:9: (lv_error_handling_27_0= ruleEPlayErrorHandling )
            	    // InternalAnsibleDsl.g:689:10: lv_error_handling_27_0= ruleEPlayErrorHandling
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getError_handlingEPlayErrorHandlingParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
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

            	    otherlv_28=(Token)match(input,17,FOLLOW_27); 

            	    								newLeafNode(otherlv_28, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:716:3: ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:716:3: ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) )
            	    // InternalAnsibleDsl.g:717:4: {...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:717:99: ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) )
            	    // InternalAnsibleDsl.g:718:5: ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:721:8: ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) )
            	    // InternalAnsibleDsl.g:721:9: {...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:721:18: ( (lv_facts_settings_29_0= ruleEFactsSettings ) )
            	    // InternalAnsibleDsl.g:721:19: (lv_facts_settings_29_0= ruleEFactsSettings )
            	    {
            	    // InternalAnsibleDsl.g:721:19: (lv_facts_settings_29_0= ruleEFactsSettings )
            	    // InternalAnsibleDsl.g:722:9: lv_facts_settings_29_0= ruleEFactsSettings
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getFacts_settingsEFactsSettingsParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_27);
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
            	    // InternalAnsibleDsl.g:744:3: ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:744:3: ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:745:4: {...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:745:99: ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:746:5: ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:749:8: ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:749:9: {...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:749:18: (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:749:19: otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) )
            	    {
            	    otherlv_30=(Token)match(input,34,FOLLOW_18); 

            	    								newLeafNode(otherlv_30, grammarAccess.getEPlayAccess().getVars_filesKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:753:8: ( (lv_vars_files_31_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:754:9: (lv_vars_files_31_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:754:9: (lv_vars_files_31_0= ruleEList )
            	    // InternalAnsibleDsl.g:755:10: lv_vars_files_31_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_filesEListParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_27);
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
            	    // InternalAnsibleDsl.g:778:3: ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:778:3: ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:779:4: {...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:779:99: ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:780:5: ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:783:8: ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:783:9: {...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:783:18: (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:783:19: otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) )
            	    {
            	    otherlv_32=(Token)match(input,35,FOLLOW_18); 

            	    								newLeafNode(otherlv_32, grammarAccess.getEPlayAccess().getVars_promptKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:787:8: ( (lv_vars_prompt_33_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:788:9: (lv_vars_prompt_33_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:788:9: (lv_vars_prompt_33_0= ruleEList )
            	    // InternalAnsibleDsl.g:789:10: lv_vars_prompt_33_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_promptEListParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_27);
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
            	    // InternalAnsibleDsl.g:812:3: ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:812:3: ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:813:4: {...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:813:99: ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:814:5: ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:817:8: ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:817:9: {...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:817:18: (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:817:19: otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_34=(Token)match(input,36,FOLLOW_14); 

            	    								newLeafNode(otherlv_34, grammarAccess.getEPlayAccess().getForce_handlersKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:821:8: ( (lv_force_handlers_35_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:822:9: (lv_force_handlers_35_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:822:9: (lv_force_handlers_35_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:823:10: lv_force_handlers_35_0= RULE_BOOLEAN
            	    {
            	    lv_force_handlers_35_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_27); 

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
            	    // InternalAnsibleDsl.g:845:3: ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:845:3: ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:846:4: {...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:846:99: ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) )
            	    // InternalAnsibleDsl.g:847:5: ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:850:8: ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) )
            	    // InternalAnsibleDsl.g:850:9: {...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:850:18: (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' )
            	    // InternalAnsibleDsl.g:850:19: otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}'
            	    {
            	    otherlv_36=(Token)match(input,37,FOLLOW_29); 

            	    								newLeafNode(otherlv_36, grammarAccess.getEPlayAccess().getPre_tasksKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:854:8: ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==41||LA18_0==48) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:855:9: (lv_pre_tasks_list_37_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:855:9: (lv_pre_tasks_list_37_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:856:10: lv_pre_tasks_list_37_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getPre_tasks_listEBlockTaskParserRuleCall_6_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_30);
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

            	    otherlv_38=(Token)match(input,17,FOLLOW_27); 

            	    								newLeafNode(otherlv_38, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_6_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAnsibleDsl.g:883:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:883:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) )
            	    // InternalAnsibleDsl.g:884:4: {...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:884:99: ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) )
            	    // InternalAnsibleDsl.g:885:5: ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:888:8: ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) )
            	    // InternalAnsibleDsl.g:888:9: {...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:888:18: ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) )
            	    // InternalAnsibleDsl.g:888:19: (lv_roles_inclusions_39_0= ruleERoleInclusions )
            	    {
            	    // InternalAnsibleDsl.g:888:19: (lv_roles_inclusions_39_0= ruleERoleInclusions )
            	    // InternalAnsibleDsl.g:889:9: lv_roles_inclusions_39_0= ruleERoleInclusions
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getRoles_inclusionsERoleInclusionsParserRuleCall_7_0());
            	    								
            	    pushFollow(FOLLOW_27);
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
            	    // InternalAnsibleDsl.g:911:3: ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:911:3: ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:912:4: {...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAnsibleDsl.g:912:99: ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:913:5: ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAnsibleDsl.g:916:8: ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) )
            	    // InternalAnsibleDsl.g:916:9: {...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:916:18: (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? )
            	    // InternalAnsibleDsl.g:916:19: otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )?
            	    {
            	    otherlv_40=(Token)match(input,38,FOLLOW_29); 

            	    								newLeafNode(otherlv_40, grammarAccess.getEPlayAccess().getTasks_listKeyword_8_0());
            	    							
            	    // InternalAnsibleDsl.g:920:8: ( (lv_tasks_list_41_0= ruleEBlockTask ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==41||LA19_0==48) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:921:9: (lv_tasks_list_41_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:921:9: (lv_tasks_list_41_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:922:10: lv_tasks_list_41_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getTasks_listEBlockTaskParserRuleCall_8_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_30);
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

            	    otherlv_42=(Token)match(input,17,FOLLOW_31); 

            	    								newLeafNode(otherlv_42, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_2());
            	    							
            	    // InternalAnsibleDsl.g:943:8: (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==39) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:944:9: otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}'
            	            {
            	            otherlv_43=(Token)match(input,39,FOLLOW_29); 

            	            									newLeafNode(otherlv_43, grammarAccess.getEPlayAccess().getPost_tasksKeyword_8_3_0());
            	            								
            	            // InternalAnsibleDsl.g:948:9: ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+
            	            int cnt20=0;
            	            loop20:
            	            do {
            	                int alt20=2;
            	                int LA20_0 = input.LA(1);

            	                if ( (LA20_0==41||LA20_0==48) ) {
            	                    alt20=1;
            	                }


            	                switch (alt20) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:949:10: (lv_post_tasks_list_44_0= ruleEBlockTask )
            	            	    {
            	            	    // InternalAnsibleDsl.g:949:10: (lv_post_tasks_list_44_0= ruleEBlockTask )
            	            	    // InternalAnsibleDsl.g:950:11: lv_post_tasks_list_44_0= ruleEBlockTask
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getEPlayAccess().getPost_tasks_listEBlockTaskParserRuleCall_8_3_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_30);
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

            	            otherlv_45=(Token)match(input,17,FOLLOW_32); 

            	            									newLeafNode(otherlv_45, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_3_2());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:972:8: (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==40) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:973:9: otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}'
            	            {
            	            otherlv_46=(Token)match(input,40,FOLLOW_33); 

            	            									newLeafNode(otherlv_46, grammarAccess.getEPlayAccess().getHandlersKeyword_8_4_0());
            	            								
            	            // InternalAnsibleDsl.g:977:9: ( (lv_handlers_47_0= ruleEHandler ) )+
            	            int cnt22=0;
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==55) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:978:10: (lv_handlers_47_0= ruleEHandler )
            	            	    {
            	            	    // InternalAnsibleDsl.g:978:10: (lv_handlers_47_0= ruleEHandler )
            	            	    // InternalAnsibleDsl.g:979:11: lv_handlers_47_0= ruleEHandler
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getEPlayAccess().getHandlersEHandlerParserRuleCall_8_4_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_34);
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

            	            otherlv_48=(Token)match(input,17,FOLLOW_27); 

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
    // InternalAnsibleDsl.g:1018:1: entryRuleEBlock returns [EObject current=null] : iv_ruleEBlock= ruleEBlock EOF ;
    public final EObject entryRuleEBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlock = null;


        try {
            // InternalAnsibleDsl.g:1018:47: (iv_ruleEBlock= ruleEBlock EOF )
            // InternalAnsibleDsl.g:1019:2: iv_ruleEBlock= ruleEBlock EOF
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
    // InternalAnsibleDsl.g:1025:1: ruleEBlock returns [EObject current=null] : (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' ) ;
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
            // InternalAnsibleDsl.g:1031:2: ( (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' ) )
            // InternalAnsibleDsl.g:1032:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' )
            {
            // InternalAnsibleDsl.g:1032:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' )
            // InternalAnsibleDsl.g:1033:3: otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getEBlockAccess().getBlockKeyword_0());
            		
            // InternalAnsibleDsl.g:1037:3: (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:1038:4: otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,42,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEBlockAccess().getBlock_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:1042:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:1043:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:1043:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:1044:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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

            // InternalAnsibleDsl.g:1061:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==93) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAnsibleDsl.g:1062:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:1062:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:1063:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_37);
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

            // InternalAnsibleDsl.g:1080:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==99) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAnsibleDsl.g:1081:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:1081:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:1082:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_38);
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

            // InternalAnsibleDsl.g:1099:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==102) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAnsibleDsl.g:1100:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:1100:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:1101:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_39);
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

            // InternalAnsibleDsl.g:1118:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAnsibleDsl.g:1119:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getEBlockAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:1123:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:1124:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:1124:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:1125:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_40); 

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

            // InternalAnsibleDsl.g:1142:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnsibleDsl.g:1143:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getEBlockAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:1147:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:1148:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:1148:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:1149:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:1149:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt29=5;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt29=1;
                        }
                        break;
                    case 22:
                        {
                        alt29=2;
                        }
                        break;
                    case 23:
                        {
                        alt29=3;
                        }
                        break;
                    case 24:
                        {
                        alt29=4;
                        }
                        break;
                    case 25:
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
                            // InternalAnsibleDsl.g:1150:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,21,FOLLOW_41); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getEBlockAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:1161:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,22,FOLLOW_41); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getEBlockAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:1172:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,23,FOLLOW_41); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getEBlockAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:1183:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,24,FOLLOW_41); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getEBlockAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:1194:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,25,FOLLOW_41); 

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

            // InternalAnsibleDsl.g:1208:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnsibleDsl.g:1209:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getEBlockAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:1213:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1214:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1214:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:1215:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_42);
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

            // InternalAnsibleDsl.g:1233:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnsibleDsl.g:1234:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getEBlockAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:1238:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1239:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1239:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:1240:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_43);
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

            // InternalAnsibleDsl.g:1258:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnsibleDsl.g:1259:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getEBlockAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:1263:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1264:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1264:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:1265:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalAnsibleDsl.g:1283:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAnsibleDsl.g:1284:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getEBlockAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:1288:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1289:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1289:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:1290:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalAnsibleDsl.g:1308:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAnsibleDsl.g:1309:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getEBlockAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:1313:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:1314:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:1314:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:1315:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    // InternalAnsibleDsl.g:1332:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==31) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1333:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,31,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEBlockAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:1337:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:1338:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:1338:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:1339:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBlockAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
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

                    otherlv_22=(Token)match(input,17,FOLLOW_46); 

                    				newLeafNode(otherlv_22, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1362:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAnsibleDsl.g:1363:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,43,FOLLOW_47); 

                    				newLeafNode(otherlv_23, grammarAccess.getEBlockAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:1367:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:1368:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:1368:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:1369:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getExe_settingsEExecutionExeSettingsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    otherlv_25=(Token)match(input,17,FOLLOW_48); 

                    				newLeafNode(otherlv_25, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1391:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==122) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAnsibleDsl.g:1392:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:1392:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:1393:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_49);
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

            // InternalAnsibleDsl.g:1410:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAnsibleDsl.g:1411:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) )
                    {
                    otherlv_27=(Token)match(input,44,FOLLOW_50); 

                    				newLeafNode(otherlv_27, grammarAccess.getEBlockAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:1415:4: ( (lv_when_expression_28_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:1416:5: (lv_when_expression_28_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:1416:5: (lv_when_expression_28_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:1417:6: lv_when_expression_28_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getWhen_expressionEConditionalExpressionParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_when_expression_28_0=ruleEConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"when_expression",
                    							lv_when_expression_28_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1435:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==33) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAnsibleDsl.g:1436:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,33,FOLLOW_52); 

                    				newLeafNode(otherlv_29, grammarAccess.getEBlockAccess().getError_handlingKeyword_15_0());
                    			
                    // InternalAnsibleDsl.g:1440:4: ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) )
                    // InternalAnsibleDsl.g:1441:5: (lv_error_handling_30_0= ruleEBlockErrorHandling )
                    {
                    // InternalAnsibleDsl.g:1441:5: (lv_error_handling_30_0= ruleEBlockErrorHandling )
                    // InternalAnsibleDsl.g:1442:6: lv_error_handling_30_0= ruleEBlockErrorHandling
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getError_handlingEBlockErrorHandlingParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    otherlv_31=(Token)match(input,17,FOLLOW_53); 

                    				newLeafNode(otherlv_31, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            otherlv_32=(Token)match(input,45,FOLLOW_29); 

            			newLeafNode(otherlv_32, grammarAccess.getEBlockAccess().getTasksKeyword_16());
            		
            // InternalAnsibleDsl.g:1468:3: ( (lv_tasks_33_0= ruleETask ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==48) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAnsibleDsl.g:1469:4: (lv_tasks_33_0= ruleETask )
            	    {
            	    // InternalAnsibleDsl.g:1469:4: (lv_tasks_33_0= ruleETask )
            	    // InternalAnsibleDsl.g:1470:5: lv_tasks_33_0= ruleETask
            	    {

            	    					newCompositeNode(grammarAccess.getEBlockAccess().getTasksETaskParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_30);
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

            otherlv_34=(Token)match(input,17,FOLLOW_54); 

            			newLeafNode(otherlv_34, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_18());
            		
            // InternalAnsibleDsl.g:1491:3: (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAnsibleDsl.g:1492:4: otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}'
                    {
                    otherlv_35=(Token)match(input,46,FOLLOW_29); 

                    				newLeafNode(otherlv_35, grammarAccess.getEBlockAccess().getRescue_tasksKeyword_19_0());
                    			
                    // InternalAnsibleDsl.g:1496:4: ( (lv_rescue_tasks_36_0= ruleETask ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==48) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1497:5: (lv_rescue_tasks_36_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:1497:5: (lv_rescue_tasks_36_0= ruleETask )
                    	    // InternalAnsibleDsl.g:1498:6: lv_rescue_tasks_36_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getRescue_tasksETaskParserRuleCall_19_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
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

                    otherlv_37=(Token)match(input,17,FOLLOW_55); 

                    				newLeafNode(otherlv_37, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_19_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1520:3: (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==47) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAnsibleDsl.g:1521:4: otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}'
                    {
                    otherlv_38=(Token)match(input,47,FOLLOW_29); 

                    				newLeafNode(otherlv_38, grammarAccess.getEBlockAccess().getAlways_tasksKeyword_20_0());
                    			
                    // InternalAnsibleDsl.g:1525:4: ( (lv_always_tasks_39_0= ruleETask ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==48) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1526:5: (lv_always_tasks_39_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:1526:5: (lv_always_tasks_39_0= ruleETask )
                    	    // InternalAnsibleDsl.g:1527:6: lv_always_tasks_39_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getAlways_tasksETaskParserRuleCall_20_1_0());
                    	    					
                    	    pushFollow(FOLLOW_30);
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

                    otherlv_40=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_40, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_20_2());
                    			

                    }
                    break;

            }

            otherlv_41=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:1557:1: entryRuleETask returns [EObject current=null] : iv_ruleETask= ruleETask EOF ;
    public final EObject entryRuleETask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETask = null;


        try {
            // InternalAnsibleDsl.g:1557:46: (iv_ruleETask= ruleETask EOF )
            // InternalAnsibleDsl.g:1558:2: iv_ruleETask= ruleETask EOF
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
    // InternalAnsibleDsl.g:1564:1: ruleETask returns [EObject current=null] : (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' ) ;
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
            // InternalAnsibleDsl.g:1570:2: ( (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' ) )
            // InternalAnsibleDsl.g:1571:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' )
            {
            // InternalAnsibleDsl.g:1571:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' )
            // InternalAnsibleDsl.g:1572:3: otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getETaskAccess().getTaskKeyword_0());
            		
            // InternalAnsibleDsl.g:1576:3: (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:1577:4: otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,49,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getETaskAccess().getTask_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:1581:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:1582:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:1582:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:1583:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

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

            // InternalAnsibleDsl.g:1600:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==93) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAnsibleDsl.g:1601:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:1601:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:1602:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_58);
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

            // InternalAnsibleDsl.g:1619:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==99) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAnsibleDsl.g:1620:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:1620:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:1621:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_59);
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

            // InternalAnsibleDsl.g:1638:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==102) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAnsibleDsl.g:1639:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:1639:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:1640:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_60);
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

            // InternalAnsibleDsl.g:1657:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==19) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAnsibleDsl.g:1658:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getETaskAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:1662:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:1663:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:1663:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:1664:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_61); 

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

            // InternalAnsibleDsl.g:1681:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==20) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAnsibleDsl.g:1682:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getETaskAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:1686:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:1687:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:1687:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:1688:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:1688:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt50=5;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt50=1;
                        }
                        break;
                    case 22:
                        {
                        alt50=2;
                        }
                        break;
                    case 23:
                        {
                        alt50=3;
                        }
                        break;
                    case 24:
                        {
                        alt50=4;
                        }
                        break;
                    case 25:
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
                            // InternalAnsibleDsl.g:1689:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,21,FOLLOW_62); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getETaskAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:1700:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,22,FOLLOW_62); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getETaskAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:1711:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,23,FOLLOW_62); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getETaskAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:1722:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,24,FOLLOW_62); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getETaskAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:1733:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,25,FOLLOW_62); 

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

            // InternalAnsibleDsl.g:1747:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAnsibleDsl.g:1748:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getETaskAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:1752:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1753:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1753:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:1754:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            // InternalAnsibleDsl.g:1772:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==27) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAnsibleDsl.g:1773:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getETaskAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:1777:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1778:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1778:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:1779:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            // InternalAnsibleDsl.g:1797:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==28) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAnsibleDsl.g:1798:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getETaskAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:1802:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1803:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1803:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:1804:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_65);
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

            // InternalAnsibleDsl.g:1822:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==29) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAnsibleDsl.g:1823:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getETaskAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:1827:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1828:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1828:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:1829:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_66);
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

            // InternalAnsibleDsl.g:1847:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==30) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAnsibleDsl.g:1848:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getETaskAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:1852:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:1853:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:1853:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:1854:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    // InternalAnsibleDsl.g:1871:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==31) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1872:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,31,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getETaskAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:1876:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:1877:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:1877:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:1878:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getETaskAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
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

                    otherlv_22=(Token)match(input,17,FOLLOW_67); 

                    				newLeafNode(otherlv_22, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1901:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==43) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAnsibleDsl.g:1902:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,43,FOLLOW_47); 

                    				newLeafNode(otherlv_23, grammarAccess.getETaskAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:1906:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:1907:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:1907:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:1908:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getExe_settingsEExecutionExeSettingsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    otherlv_25=(Token)match(input,17,FOLLOW_68); 

                    				newLeafNode(otherlv_25, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1930:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==122) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAnsibleDsl.g:1931:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:1931:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:1932:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_69);
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

            // InternalAnsibleDsl.g:1949:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAnsibleDsl.g:1950:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) )
                    {
                    otherlv_27=(Token)match(input,44,FOLLOW_50); 

                    				newLeafNode(otherlv_27, grammarAccess.getETaskAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:1954:4: ( (lv_when_expression_28_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:1955:5: (lv_when_expression_28_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:1955:5: (lv_when_expression_28_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:1956:6: lv_when_expression_28_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getWhen_expressionEConditionalExpressionParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_when_expression_28_0=ruleEConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"when_expression",
                    							lv_when_expression_28_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1974:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==33) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAnsibleDsl.g:1975:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,33,FOLLOW_71); 

                    				newLeafNode(otherlv_29, grammarAccess.getETaskAccess().getError_handlingKeyword_15_0());
                    			
                    // InternalAnsibleDsl.g:1979:4: ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) )
                    // InternalAnsibleDsl.g:1980:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    {
                    // InternalAnsibleDsl.g:1980:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    // InternalAnsibleDsl.g:1981:6: lv_error_handling_30_0= ruleETaskHandlerErrorHandling
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getError_handlingETaskHandlerErrorHandlingParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    otherlv_31=(Token)match(input,17,FOLLOW_72); 

                    				newLeafNode(otherlv_31, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2003:3: (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==50) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAnsibleDsl.g:2004:4: otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) )
                    {
                    otherlv_32=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_32, grammarAccess.getETaskAccess().getActionKeyword_16_0());
                    			
                    // InternalAnsibleDsl.g:2008:4: ( (lv_action_33_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2009:5: (lv_action_33_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2009:5: (lv_action_33_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2010:6: lv_action_33_0= RULE_STRING
                    {
                    lv_action_33_0=(Token)match(input,RULE_STRING,FOLLOW_73); 

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

            // InternalAnsibleDsl.g:2027:3: (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==51) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAnsibleDsl.g:2028:4: otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}'
                    {
                    otherlv_34=(Token)match(input,51,FOLLOW_74); 

                    				newLeafNode(otherlv_34, grammarAccess.getETaskAccess().getAsynchronous_settingsKeyword_17_0());
                    			
                    // InternalAnsibleDsl.g:2032:4: ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) )
                    // InternalAnsibleDsl.g:2033:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    {
                    // InternalAnsibleDsl.g:2033:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    // InternalAnsibleDsl.g:2034:6: lv_asynchronous_settings_35_0= ruleEAsynchronousSettings
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getAsynchronous_settingsEAsynchronousSettingsParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    otherlv_36=(Token)match(input,17,FOLLOW_75); 

                    				newLeafNode(otherlv_36, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_17_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2056:3: (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==52) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAnsibleDsl.g:2057:4: otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) )
                    {
                    otherlv_37=(Token)match(input,52,FOLLOW_76); 

                    				newLeafNode(otherlv_37, grammarAccess.getETaskAccess().getArgsKeyword_18_0());
                    			
                    // InternalAnsibleDsl.g:2061:4: ( (lv_args_38_0= ruleEDictionary ) )
                    // InternalAnsibleDsl.g:2062:5: (lv_args_38_0= ruleEDictionary )
                    {
                    // InternalAnsibleDsl.g:2062:5: (lv_args_38_0= ruleEDictionary )
                    // InternalAnsibleDsl.g:2063:6: lv_args_38_0= ruleEDictionary
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getArgsEDictionaryParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_77);
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

            otherlv_39=(Token)match(input,53,FOLLOW_78); 

            			newLeafNode(otherlv_39, grammarAccess.getETaskAccess().getModule_callKeyword_19());
            		
            // InternalAnsibleDsl.g:2085:3: ( (lv_module_40_0= ruleEModuleCall ) )
            // InternalAnsibleDsl.g:2086:4: (lv_module_40_0= ruleEModuleCall )
            {
            // InternalAnsibleDsl.g:2086:4: (lv_module_40_0= ruleEModuleCall )
            // InternalAnsibleDsl.g:2087:5: lv_module_40_0= ruleEModuleCall
            {

            					newCompositeNode(grammarAccess.getETaskAccess().getModuleEModuleCallParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_41=(Token)match(input,17,FOLLOW_79); 

            			newLeafNode(otherlv_41, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_21());
            		
            // InternalAnsibleDsl.g:2108:3: (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==54) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAnsibleDsl.g:2109:4: otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    {
                    otherlv_42=(Token)match(input,54,FOLLOW_80); 

                    				newLeafNode(otherlv_42, grammarAccess.getETaskAccess().getNotifyKeyword_22_0());
                    			
                    // InternalAnsibleDsl.g:2113:4: ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_STRING||LA65_0==127) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2114:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    {
                    	    // InternalAnsibleDsl.g:2114:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    // InternalAnsibleDsl.g:2115:6: lv_notifiables_43_0= ruleENotifiable
                    	    {

                    	    						newCompositeNode(grammarAccess.getETaskAccess().getNotifiablesENotifiableParserRuleCall_22_1_0());
                    	    					
                    	    pushFollow(FOLLOW_81);
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

            // InternalAnsibleDsl.g:2133:3: ( (lv_loop_44_0= ruleELoop ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==83||(LA67_0>=90 && LA67_0<=92)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAnsibleDsl.g:2134:4: (lv_loop_44_0= ruleELoop )
                    {
                    // InternalAnsibleDsl.g:2134:4: (lv_loop_44_0= ruleELoop )
                    // InternalAnsibleDsl.g:2135:5: lv_loop_44_0= ruleELoop
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getLoopELoopParserRuleCall_23_0());
                    				
                    pushFollow(FOLLOW_82);
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

            // InternalAnsibleDsl.g:2152:3: ( (lv_register_45_0= ruleERegisterVariable ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==135) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAnsibleDsl.g:2153:4: (lv_register_45_0= ruleERegisterVariable )
                    {
                    // InternalAnsibleDsl.g:2153:4: (lv_register_45_0= ruleERegisterVariable )
                    // InternalAnsibleDsl.g:2154:5: lv_register_45_0= ruleERegisterVariable
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getRegisterERegisterVariableParserRuleCall_24_0());
                    				
                    pushFollow(FOLLOW_8);
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

            otherlv_46=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:2179:1: entryRuleEHandler returns [EObject current=null] : iv_ruleEHandler= ruleEHandler EOF ;
    public final EObject entryRuleEHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHandler = null;


        try {
            // InternalAnsibleDsl.g:2179:49: (iv_ruleEHandler= ruleEHandler EOF )
            // InternalAnsibleDsl.g:2180:2: iv_ruleEHandler= ruleEHandler EOF
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
    // InternalAnsibleDsl.g:2186:1: ruleEHandler returns [EObject current=null] : (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' ) ;
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
            // InternalAnsibleDsl.g:2192:2: ( (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' ) )
            // InternalAnsibleDsl.g:2193:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' )
            {
            // InternalAnsibleDsl.g:2193:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' )
            // InternalAnsibleDsl.g:2194:3: otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_83); 

            			newLeafNode(otherlv_0, grammarAccess.getEHandlerAccess().getHandlerKeyword_0());
            		
            // InternalAnsibleDsl.g:2198:3: (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:2199:4: otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,56,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEHandlerAccess().getHandler_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:2203:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2204:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2204:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:2205:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

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

            // InternalAnsibleDsl.g:2222:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==93) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAnsibleDsl.g:2223:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:2223:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:2224:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_58);
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

            // InternalAnsibleDsl.g:2241:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==99) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAnsibleDsl.g:2242:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:2242:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:2243:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_59);
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

            // InternalAnsibleDsl.g:2260:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==102) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAnsibleDsl.g:2261:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:2261:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:2262:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_60);
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

            // InternalAnsibleDsl.g:2279:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==19) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAnsibleDsl.g:2280:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getEHandlerAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:2284:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:2285:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:2285:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:2286:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_61); 

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

            // InternalAnsibleDsl.g:2303:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==20) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAnsibleDsl.g:2304:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getEHandlerAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:2308:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:2309:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:2309:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:2310:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:2310:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt73=5;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt73=1;
                        }
                        break;
                    case 22:
                        {
                        alt73=2;
                        }
                        break;
                    case 23:
                        {
                        alt73=3;
                        }
                        break;
                    case 24:
                        {
                        alt73=4;
                        }
                        break;
                    case 25:
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
                            // InternalAnsibleDsl.g:2311:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,21,FOLLOW_62); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getEHandlerAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:2322:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,22,FOLLOW_62); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getEHandlerAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:2333:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,23,FOLLOW_62); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getEHandlerAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:2344:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,24,FOLLOW_62); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getEHandlerAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:2355:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,25,FOLLOW_62); 

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

            // InternalAnsibleDsl.g:2369:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==26) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAnsibleDsl.g:2370:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getEHandlerAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:2374:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2375:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2375:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:2376:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            // InternalAnsibleDsl.g:2394:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==27) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAnsibleDsl.g:2395:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getEHandlerAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:2399:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2400:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2400:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:2401:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            // InternalAnsibleDsl.g:2419:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==28) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAnsibleDsl.g:2420:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getEHandlerAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:2424:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2425:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2425:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:2426:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_65);
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

            // InternalAnsibleDsl.g:2444:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==29) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAnsibleDsl.g:2445:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getEHandlerAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:2449:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2450:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2450:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:2451:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_66);
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

            // InternalAnsibleDsl.g:2469:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==30) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAnsibleDsl.g:2470:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getEHandlerAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:2474:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:2475:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:2475:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:2476:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    // InternalAnsibleDsl.g:2493:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==31) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2494:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,31,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEHandlerAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:2498:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:2499:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:2499:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:2500:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getEHandlerAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
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

                    otherlv_22=(Token)match(input,17,FOLLOW_67); 

                    				newLeafNode(otherlv_22, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2523:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==43) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalAnsibleDsl.g:2524:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,43,FOLLOW_47); 

                    				newLeafNode(otherlv_23, grammarAccess.getEHandlerAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:2528:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:2529:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:2529:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:2530:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getExe_settingsEExecutionExeSettingsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    otherlv_25=(Token)match(input,17,FOLLOW_68); 

                    				newLeafNode(otherlv_25, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2552:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==122) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAnsibleDsl.g:2553:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:2553:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:2554:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_69);
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

            // InternalAnsibleDsl.g:2571:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==44) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAnsibleDsl.g:2572:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) )
                    {
                    otherlv_27=(Token)match(input,44,FOLLOW_50); 

                    				newLeafNode(otherlv_27, grammarAccess.getEHandlerAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:2576:4: ( (lv_when_expression_28_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:2577:5: (lv_when_expression_28_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:2577:5: (lv_when_expression_28_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:2578:6: lv_when_expression_28_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getWhen_expressionEConditionalExpressionParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_70);
                    lv_when_expression_28_0=ruleEConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"when_expression",
                    							lv_when_expression_28_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2596:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==33) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalAnsibleDsl.g:2597:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,33,FOLLOW_71); 

                    				newLeafNode(otherlv_29, grammarAccess.getEHandlerAccess().getError_handlingKeyword_15_0());
                    			
                    // InternalAnsibleDsl.g:2601:4: ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) )
                    // InternalAnsibleDsl.g:2602:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    {
                    // InternalAnsibleDsl.g:2602:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    // InternalAnsibleDsl.g:2603:6: lv_error_handling_30_0= ruleETaskHandlerErrorHandling
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getError_handlingETaskHandlerErrorHandlingParserRuleCall_15_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    otherlv_31=(Token)match(input,17,FOLLOW_72); 

                    				newLeafNode(otherlv_31, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2625:3: (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==50) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAnsibleDsl.g:2626:4: otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) )
                    {
                    otherlv_32=(Token)match(input,50,FOLLOW_4); 

                    				newLeafNode(otherlv_32, grammarAccess.getEHandlerAccess().getActionKeyword_16_0());
                    			
                    // InternalAnsibleDsl.g:2630:4: ( (lv_action_33_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2631:5: (lv_action_33_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2631:5: (lv_action_33_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2632:6: lv_action_33_0= RULE_STRING
                    {
                    lv_action_33_0=(Token)match(input,RULE_STRING,FOLLOW_73); 

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

            // InternalAnsibleDsl.g:2649:3: (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==51) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAnsibleDsl.g:2650:4: otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}'
                    {
                    otherlv_34=(Token)match(input,51,FOLLOW_74); 

                    				newLeafNode(otherlv_34, grammarAccess.getEHandlerAccess().getAsynchronous_settingsKeyword_17_0());
                    			
                    // InternalAnsibleDsl.g:2654:4: ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) )
                    // InternalAnsibleDsl.g:2655:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    {
                    // InternalAnsibleDsl.g:2655:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    // InternalAnsibleDsl.g:2656:6: lv_asynchronous_settings_35_0= ruleEAsynchronousSettings
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getAsynchronous_settingsEAsynchronousSettingsParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    otherlv_36=(Token)match(input,17,FOLLOW_75); 

                    				newLeafNode(otherlv_36, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_17_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2678:3: (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==52) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAnsibleDsl.g:2679:4: otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) )
                    {
                    otherlv_37=(Token)match(input,52,FOLLOW_76); 

                    				newLeafNode(otherlv_37, grammarAccess.getEHandlerAccess().getArgsKeyword_18_0());
                    			
                    // InternalAnsibleDsl.g:2683:4: ( (lv_args_38_0= ruleEDictionary ) )
                    // InternalAnsibleDsl.g:2684:5: (lv_args_38_0= ruleEDictionary )
                    {
                    // InternalAnsibleDsl.g:2684:5: (lv_args_38_0= ruleEDictionary )
                    // InternalAnsibleDsl.g:2685:6: lv_args_38_0= ruleEDictionary
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getArgsEDictionaryParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_77);
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

            otherlv_39=(Token)match(input,53,FOLLOW_78); 

            			newLeafNode(otherlv_39, grammarAccess.getEHandlerAccess().getModule_callKeyword_19());
            		
            // InternalAnsibleDsl.g:2707:3: ( (lv_module_40_0= ruleEModuleCall ) )
            // InternalAnsibleDsl.g:2708:4: (lv_module_40_0= ruleEModuleCall )
            {
            // InternalAnsibleDsl.g:2708:4: (lv_module_40_0= ruleEModuleCall )
            // InternalAnsibleDsl.g:2709:5: lv_module_40_0= ruleEModuleCall
            {

            					newCompositeNode(grammarAccess.getEHandlerAccess().getModuleEModuleCallParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_41=(Token)match(input,17,FOLLOW_84); 

            			newLeafNode(otherlv_41, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_21());
            		
            // InternalAnsibleDsl.g:2730:3: (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==54) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAnsibleDsl.g:2731:4: otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    {
                    otherlv_42=(Token)match(input,54,FOLLOW_80); 

                    				newLeafNode(otherlv_42, grammarAccess.getEHandlerAccess().getNotifyKeyword_22_0());
                    			
                    // InternalAnsibleDsl.g:2735:4: ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    int cnt88=0;
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==RULE_STRING||LA88_0==127) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2736:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    {
                    	    // InternalAnsibleDsl.g:2736:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    // InternalAnsibleDsl.g:2737:6: lv_notifiables_43_0= ruleENotifiable
                    	    {

                    	    						newCompositeNode(grammarAccess.getEHandlerAccess().getNotifiablesENotifiableParserRuleCall_22_1_0());
                    	    					
                    	    pushFollow(FOLLOW_85);
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

            // InternalAnsibleDsl.g:2755:3: ( (lv_loop_44_0= ruleELoop ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==83||(LA90_0>=90 && LA90_0<=92)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAnsibleDsl.g:2756:4: (lv_loop_44_0= ruleELoop )
                    {
                    // InternalAnsibleDsl.g:2756:4: (lv_loop_44_0= ruleELoop )
                    // InternalAnsibleDsl.g:2757:5: lv_loop_44_0= ruleELoop
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getLoopELoopParserRuleCall_23_0());
                    				
                    pushFollow(FOLLOW_86);
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

            // InternalAnsibleDsl.g:2774:3: ( (lv_register_45_0= ruleERegisterVariable ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==135) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalAnsibleDsl.g:2775:4: (lv_register_45_0= ruleERegisterVariable )
                    {
                    // InternalAnsibleDsl.g:2775:4: (lv_register_45_0= ruleERegisterVariable )
                    // InternalAnsibleDsl.g:2776:5: lv_register_45_0= ruleERegisterVariable
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getRegisterERegisterVariableParserRuleCall_24_0());
                    				
                    pushFollow(FOLLOW_87);
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

            // InternalAnsibleDsl.g:2793:3: (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==57) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalAnsibleDsl.g:2794:4: otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+
                    {
                    otherlv_46=(Token)match(input,57,FOLLOW_4); 

                    				newLeafNode(otherlv_46, grammarAccess.getEHandlerAccess().getListenKeyword_25_0());
                    			
                    // InternalAnsibleDsl.g:2798:4: ( (otherlv_47= RULE_STRING ) )+
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
                    	    // InternalAnsibleDsl.g:2799:5: (otherlv_47= RULE_STRING )
                    	    {
                    	    // InternalAnsibleDsl.g:2799:5: (otherlv_47= RULE_STRING )
                    	    // InternalAnsibleDsl.g:2800:6: otherlv_47= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEHandlerRule());
                    	    						}
                    	    					
                    	    otherlv_47=(Token)match(input,RULE_STRING,FOLLOW_88); 

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

            otherlv_48=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:2820:1: entryRuleEModuleCall returns [EObject current=null] : iv_ruleEModuleCall= ruleEModuleCall EOF ;
    public final EObject entryRuleEModuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModuleCall = null;


        try {
            // InternalAnsibleDsl.g:2820:52: (iv_ruleEModuleCall= ruleEModuleCall EOF )
            // InternalAnsibleDsl.g:2821:2: iv_ruleEModuleCall= ruleEModuleCall EOF
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
    // InternalAnsibleDsl.g:2827:1: ruleEModuleCall returns [EObject current=null] : (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) ;
    public final EObject ruleEModuleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2833:2: ( (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:2834:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:2834:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:2835:3: otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getEModuleCallAccess().getModule_nameKeyword_0());
            		
            // InternalAnsibleDsl.g:2839:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:2840:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:2840:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:2841:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_89); 

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

            otherlv_2=(Token)match(input,59,FOLLOW_90); 

            			newLeafNode(otherlv_2, grammarAccess.getEModuleCallAccess().getParametersKeyword_2());
            		
            // InternalAnsibleDsl.g:2861:3: ( (lv_parameters_3_0= ruleEParameter ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_ID) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2862:4: (lv_parameters_3_0= ruleEParameter )
            	    {
            	    // InternalAnsibleDsl.g:2862:4: (lv_parameters_3_0= ruleEParameter )
            	    // InternalAnsibleDsl.g:2863:5: lv_parameters_3_0= ruleEParameter
            	    {

            	    					newCompositeNode(grammarAccess.getEModuleCallAccess().getParametersEParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_90);
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

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:2888:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalAnsibleDsl.g:2888:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalAnsibleDsl.g:2889:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalAnsibleDsl.g:2895:1: ruleEParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2901:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) )
            // InternalAnsibleDsl.g:2902:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            {
            // InternalAnsibleDsl.g:2902:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            // InternalAnsibleDsl.g:2903:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) )
            {
            // InternalAnsibleDsl.g:2903:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:2904:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:2904:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:2905:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_91); 

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

            otherlv_1=(Token)match(input,60,FOLLOW_92); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:2925:3: ( (lv_value_passed_2_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:2926:4: (lv_value_passed_2_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:2926:4: (lv_value_passed_2_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:2927:5: lv_value_passed_2_0= ruleEValuePassed
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


    // $ANTLR start "entryRuleEConditionalExpression"
    // InternalAnsibleDsl.g:2948:1: entryRuleEConditionalExpression returns [EObject current=null] : iv_ruleEConditionalExpression= ruleEConditionalExpression EOF ;
    public final EObject entryRuleEConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionalExpression = null;


        try {
            // InternalAnsibleDsl.g:2948:63: (iv_ruleEConditionalExpression= ruleEConditionalExpression EOF )
            // InternalAnsibleDsl.g:2949:2: iv_ruleEConditionalExpression= ruleEConditionalExpression EOF
            {
             newCompositeNode(grammarAccess.getEConditionalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConditionalExpression=ruleEConditionalExpression();

            state._fsp--;

             current =iv_ruleEConditionalExpression; 
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
    // $ANTLR end "entryRuleEConditionalExpression"


    // $ANTLR start "ruleEConditionalExpression"
    // InternalAnsibleDsl.g:2955:1: ruleEConditionalExpression returns [EObject current=null] : ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleEConditionalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_equality_term_1_1=null;
        Token lv_equality_term_1_2=null;
        Token lv_equality_term_1_3=null;
        Token lv_equality_term_1_4=null;
        Token lv_equality_term_1_5=null;
        Token lv_equality_term_1_6=null;
        Token otherlv_3=null;
        Token lv_is_not_4_0=null;
        Token lv_status_5_1=null;
        Token lv_status_5_2=null;
        Token lv_status_5_3=null;
        Token lv_status_5_4=null;
        Token lv_status_5_5=null;
        Token lv_status_5_6=null;
        Token lv_status_5_7=null;
        Token lv_is_true_7_0=null;
        EObject lv_left_term_0_0 = null;

        EObject lv_right_term_2_0 = null;

        EObject lv_formula_6_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2961:2: ( ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) ) )
            // InternalAnsibleDsl.g:2962:2: ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) )
            {
            // InternalAnsibleDsl.g:2962:2: ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) )
            int alt99=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_NULL:
            case 128:
            case 133:
            case 136:
            case 137:
                {
                alt99=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA99_2 = input.LA(2);

                if ( (LA99_2==EOF||LA99_2==17||LA99_2==33||LA99_2==45||(LA99_2>=50 && LA99_2<=53)||LA99_2==57||LA99_2==77||(LA99_2>=90 && LA99_2<=92)||(LA99_2>=111 && LA99_2<=113)||LA99_2==116||LA99_2==135) ) {
                    alt99=3;
                }
                else if ( ((LA99_2>=61 && LA99_2<=67)) ) {
                    alt99=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 2, input);

                    throw nvae;
                }
                }
                break;
            case 68:
            case 76:
                {
                alt99=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalAnsibleDsl.g:2963:3: ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) )
                    {
                    // InternalAnsibleDsl.g:2963:3: ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) )
                    // InternalAnsibleDsl.g:2964:4: ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) )
                    {
                    // InternalAnsibleDsl.g:2964:4: ( (lv_left_term_0_0= ruleEValuePassed ) )
                    // InternalAnsibleDsl.g:2965:5: (lv_left_term_0_0= ruleEValuePassed )
                    {
                    // InternalAnsibleDsl.g:2965:5: (lv_left_term_0_0= ruleEValuePassed )
                    // InternalAnsibleDsl.g:2966:6: lv_left_term_0_0= ruleEValuePassed
                    {

                    						newCompositeNode(grammarAccess.getEConditionalExpressionAccess().getLeft_termEValuePassedParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_93);
                    lv_left_term_0_0=ruleEValuePassed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEConditionalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"left_term",
                    							lv_left_term_0_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassed");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnsibleDsl.g:2983:4: ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) )
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( ((LA98_0>=61 && LA98_0<=66)) ) {
                        alt98=1;
                    }
                    else if ( (LA98_0==67) ) {
                        alt98=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 98, 0, input);

                        throw nvae;
                    }
                    switch (alt98) {
                        case 1 :
                            // InternalAnsibleDsl.g:2984:5: ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) )
                            {
                            // InternalAnsibleDsl.g:2984:5: ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) )
                            // InternalAnsibleDsl.g:2985:6: ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) )
                            {
                            // InternalAnsibleDsl.g:2985:6: ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) )
                            // InternalAnsibleDsl.g:2986:7: ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) )
                            {
                            // InternalAnsibleDsl.g:2986:7: ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) )
                            // InternalAnsibleDsl.g:2987:8: (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' )
                            {
                            // InternalAnsibleDsl.g:2987:8: (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' )
                            int alt95=6;
                            switch ( input.LA(1) ) {
                            case 61:
                                {
                                alt95=1;
                                }
                                break;
                            case 62:
                                {
                                alt95=2;
                                }
                                break;
                            case 63:
                                {
                                alt95=3;
                                }
                                break;
                            case 64:
                                {
                                alt95=4;
                                }
                                break;
                            case 65:
                                {
                                alt95=5;
                                }
                                break;
                            case 66:
                                {
                                alt95=6;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 95, 0, input);

                                throw nvae;
                            }

                            switch (alt95) {
                                case 1 :
                                    // InternalAnsibleDsl.g:2988:9: lv_equality_term_1_1= '=='
                                    {
                                    lv_equality_term_1_1=(Token)match(input,61,FOLLOW_92); 

                                    									newLeafNode(lv_equality_term_1_1, grammarAccess.getEConditionalExpressionAccess().getEquality_termEqualsSignEqualsSignKeyword_0_1_0_0_0_0());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_1, null);
                                    								

                                    }
                                    break;
                                case 2 :
                                    // InternalAnsibleDsl.g:2999:9: lv_equality_term_1_2= '!='
                                    {
                                    lv_equality_term_1_2=(Token)match(input,62,FOLLOW_92); 

                                    									newLeafNode(lv_equality_term_1_2, grammarAccess.getEConditionalExpressionAccess().getEquality_termExclamationMarkEqualsSignKeyword_0_1_0_0_0_1());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_2, null);
                                    								

                                    }
                                    break;
                                case 3 :
                                    // InternalAnsibleDsl.g:3010:9: lv_equality_term_1_3= '<'
                                    {
                                    lv_equality_term_1_3=(Token)match(input,63,FOLLOW_92); 

                                    									newLeafNode(lv_equality_term_1_3, grammarAccess.getEConditionalExpressionAccess().getEquality_termLessThanSignKeyword_0_1_0_0_0_2());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_3, null);
                                    								

                                    }
                                    break;
                                case 4 :
                                    // InternalAnsibleDsl.g:3021:9: lv_equality_term_1_4= '>'
                                    {
                                    lv_equality_term_1_4=(Token)match(input,64,FOLLOW_92); 

                                    									newLeafNode(lv_equality_term_1_4, grammarAccess.getEConditionalExpressionAccess().getEquality_termGreaterThanSignKeyword_0_1_0_0_0_3());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_4, null);
                                    								

                                    }
                                    break;
                                case 5 :
                                    // InternalAnsibleDsl.g:3032:9: lv_equality_term_1_5= '<='
                                    {
                                    lv_equality_term_1_5=(Token)match(input,65,FOLLOW_92); 

                                    									newLeafNode(lv_equality_term_1_5, grammarAccess.getEConditionalExpressionAccess().getEquality_termLessThanSignEqualsSignKeyword_0_1_0_0_0_4());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_5, null);
                                    								

                                    }
                                    break;
                                case 6 :
                                    // InternalAnsibleDsl.g:3043:9: lv_equality_term_1_6= '>='
                                    {
                                    lv_equality_term_1_6=(Token)match(input,66,FOLLOW_92); 

                                    									newLeafNode(lv_equality_term_1_6, grammarAccess.getEConditionalExpressionAccess().getEquality_termGreaterThanSignEqualsSignKeyword_0_1_0_0_0_5());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_6, null);
                                    								

                                    }
                                    break;

                            }


                            }


                            }

                            // InternalAnsibleDsl.g:3056:6: ( (lv_right_term_2_0= ruleEValuePassed ) )
                            // InternalAnsibleDsl.g:3057:7: (lv_right_term_2_0= ruleEValuePassed )
                            {
                            // InternalAnsibleDsl.g:3057:7: (lv_right_term_2_0= ruleEValuePassed )
                            // InternalAnsibleDsl.g:3058:8: lv_right_term_2_0= ruleEValuePassed
                            {

                            								newCompositeNode(grammarAccess.getEConditionalExpressionAccess().getRight_termEValuePassedParserRuleCall_0_1_0_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_right_term_2_0=ruleEValuePassed();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getEConditionalExpressionRule());
                            								}
                            								set(
                            									current,
                            									"right_term",
                            									lv_right_term_2_0,
                            									"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassed");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:3077:5: (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) )
                            {
                            // InternalAnsibleDsl.g:3077:5: (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) )
                            // InternalAnsibleDsl.g:3078:6: otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) )
                            {
                            otherlv_3=(Token)match(input,67,FOLLOW_94); 

                            						newLeafNode(otherlv_3, grammarAccess.getEConditionalExpressionAccess().getIsKeyword_0_1_1_0());
                            					
                            // InternalAnsibleDsl.g:3082:6: ( (lv_is_not_4_0= 'not' ) )?
                            int alt96=2;
                            int LA96_0 = input.LA(1);

                            if ( (LA96_0==68) ) {
                                alt96=1;
                            }
                            switch (alt96) {
                                case 1 :
                                    // InternalAnsibleDsl.g:3083:7: (lv_is_not_4_0= 'not' )
                                    {
                                    // InternalAnsibleDsl.g:3083:7: (lv_is_not_4_0= 'not' )
                                    // InternalAnsibleDsl.g:3084:8: lv_is_not_4_0= 'not'
                                    {
                                    lv_is_not_4_0=(Token)match(input,68,FOLLOW_95); 

                                    								newLeafNode(lv_is_not_4_0, grammarAccess.getEConditionalExpressionAccess().getIs_notNotKeyword_0_1_1_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    								}
                                    								setWithLastConsumed(current, "is_not", lv_is_not_4_0, "not");
                                    							

                                    }


                                    }
                                    break;

                            }

                            // InternalAnsibleDsl.g:3096:6: ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) )
                            // InternalAnsibleDsl.g:3097:7: ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) )
                            {
                            // InternalAnsibleDsl.g:3097:7: ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) )
                            // InternalAnsibleDsl.g:3098:8: (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' )
                            {
                            // InternalAnsibleDsl.g:3098:8: (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' )
                            int alt97=7;
                            switch ( input.LA(1) ) {
                            case 69:
                                {
                                alt97=1;
                                }
                                break;
                            case 70:
                                {
                                alt97=2;
                                }
                                break;
                            case 71:
                                {
                                alt97=3;
                                }
                                break;
                            case 72:
                                {
                                alt97=4;
                                }
                                break;
                            case 73:
                                {
                                alt97=5;
                                }
                                break;
                            case 74:
                                {
                                alt97=6;
                                }
                                break;
                            case 75:
                                {
                                alt97=7;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 97, 0, input);

                                throw nvae;
                            }

                            switch (alt97) {
                                case 1 :
                                    // InternalAnsibleDsl.g:3099:9: lv_status_5_1= 'skipped'
                                    {
                                    lv_status_5_1=(Token)match(input,69,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_1, grammarAccess.getEConditionalExpressionAccess().getStatusSkippedKeyword_0_1_1_2_0_0());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_1, null);
                                    								

                                    }
                                    break;
                                case 2 :
                                    // InternalAnsibleDsl.g:3110:9: lv_status_5_2= 'failed'
                                    {
                                    lv_status_5_2=(Token)match(input,70,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_2, grammarAccess.getEConditionalExpressionAccess().getStatusFailedKeyword_0_1_1_2_0_1());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_2, null);
                                    								

                                    }
                                    break;
                                case 3 :
                                    // InternalAnsibleDsl.g:3121:9: lv_status_5_3= 'succeeded'
                                    {
                                    lv_status_5_3=(Token)match(input,71,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_3, grammarAccess.getEConditionalExpressionAccess().getStatusSucceededKeyword_0_1_1_2_0_2());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_3, null);
                                    								

                                    }
                                    break;
                                case 4 :
                                    // InternalAnsibleDsl.g:3132:9: lv_status_5_4= 'fail'
                                    {
                                    lv_status_5_4=(Token)match(input,72,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_4, grammarAccess.getEConditionalExpressionAccess().getStatusFailKeyword_0_1_1_2_0_3());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_4, null);
                                    								

                                    }
                                    break;
                                case 5 :
                                    // InternalAnsibleDsl.g:3143:9: lv_status_5_5= 'success'
                                    {
                                    lv_status_5_5=(Token)match(input,73,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_5, grammarAccess.getEConditionalExpressionAccess().getStatusSuccessKeyword_0_1_1_2_0_4());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_5, null);
                                    								

                                    }
                                    break;
                                case 6 :
                                    // InternalAnsibleDsl.g:3154:9: lv_status_5_6= 'defined'
                                    {
                                    lv_status_5_6=(Token)match(input,74,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_6, grammarAccess.getEConditionalExpressionAccess().getStatusDefinedKeyword_0_1_1_2_0_5());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_6, null);
                                    								

                                    }
                                    break;
                                case 7 :
                                    // InternalAnsibleDsl.g:3165:9: lv_status_5_7= 'undefined'
                                    {
                                    lv_status_5_7=(Token)match(input,75,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_7, grammarAccess.getEConditionalExpressionAccess().getStatusUndefinedKeyword_0_1_1_2_0_6());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_7, null);
                                    								

                                    }
                                    break;

                            }


                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:3182:3: ( (lv_formula_6_0= ruleEConditionalFormula ) )
                    {
                    // InternalAnsibleDsl.g:3182:3: ( (lv_formula_6_0= ruleEConditionalFormula ) )
                    // InternalAnsibleDsl.g:3183:4: (lv_formula_6_0= ruleEConditionalFormula )
                    {
                    // InternalAnsibleDsl.g:3183:4: (lv_formula_6_0= ruleEConditionalFormula )
                    // InternalAnsibleDsl.g:3184:5: lv_formula_6_0= ruleEConditionalFormula
                    {

                    					newCompositeNode(grammarAccess.getEConditionalExpressionAccess().getFormulaEConditionalFormulaParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_formula_6_0=ruleEConditionalFormula();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEConditionalExpressionRule());
                    					}
                    					set(
                    						current,
                    						"formula",
                    						lv_formula_6_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalFormula");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:3202:3: ( (lv_is_true_7_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:3202:3: ( (lv_is_true_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3203:4: (lv_is_true_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3203:4: (lv_is_true_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3204:5: lv_is_true_7_0= RULE_BOOLEAN
                    {
                    lv_is_true_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_is_true_7_0, grammarAccess.getEConditionalExpressionAccess().getIs_trueBOOLEANTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"is_true",
                    						lv_is_true_7_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    				

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
    // $ANTLR end "ruleEConditionalExpression"


    // $ANTLR start "entryRuleEConditionalFormula"
    // InternalAnsibleDsl.g:3224:1: entryRuleEConditionalFormula returns [EObject current=null] : iv_ruleEConditionalFormula= ruleEConditionalFormula EOF ;
    public final EObject entryRuleEConditionalFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionalFormula = null;


        try {
            // InternalAnsibleDsl.g:3224:60: (iv_ruleEConditionalFormula= ruleEConditionalFormula EOF )
            // InternalAnsibleDsl.g:3225:2: iv_ruleEConditionalFormula= ruleEConditionalFormula EOF
            {
             newCompositeNode(grammarAccess.getEConditionalFormulaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConditionalFormula=ruleEConditionalFormula();

            state._fsp--;

             current =iv_ruleEConditionalFormula; 
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
    // $ANTLR end "entryRuleEConditionalFormula"


    // $ANTLR start "ruleEConditionalFormula"
    // InternalAnsibleDsl.g:3231:1: ruleEConditionalFormula returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) ) ;
    public final EObject ruleEConditionalFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_and_or_3_1=null;
        Token lv_and_or_3_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_left_expression_1_0 = null;

        EObject lv_right_expression_5_0 = null;

        EObject lv_negated_expression_9_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3237:2: ( ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) ) )
            // InternalAnsibleDsl.g:3238:2: ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) )
            {
            // InternalAnsibleDsl.g:3238:2: ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==76) ) {
                alt101=1;
            }
            else if ( (LA101_0==68) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalAnsibleDsl.g:3239:3: (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' )
                    {
                    // InternalAnsibleDsl.g:3239:3: (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' )
                    // InternalAnsibleDsl.g:3240:4: otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,76,FOLLOW_50); 

                    				newLeafNode(otherlv_0, grammarAccess.getEConditionalFormulaAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalAnsibleDsl.g:3244:4: ( (lv_left_expression_1_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:3245:5: (lv_left_expression_1_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:3245:5: (lv_left_expression_1_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:3246:6: lv_left_expression_1_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getEConditionalFormulaAccess().getLeft_expressionEConditionalExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_left_expression_1_0=ruleEConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEConditionalFormulaRule());
                    						}
                    						set(
                    							current,
                    							"left_expression",
                    							lv_left_expression_1_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,77,FOLLOW_97); 

                    				newLeafNode(otherlv_2, grammarAccess.getEConditionalFormulaAccess().getRightParenthesisKeyword_0_2());
                    			
                    // InternalAnsibleDsl.g:3267:4: ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) )
                    // InternalAnsibleDsl.g:3268:5: ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) )
                    {
                    // InternalAnsibleDsl.g:3268:5: ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) )
                    // InternalAnsibleDsl.g:3269:6: (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' )
                    {
                    // InternalAnsibleDsl.g:3269:6: (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==78) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==79) ) {
                        alt100=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // InternalAnsibleDsl.g:3270:7: lv_and_or_3_1= 'and'
                            {
                            lv_and_or_3_1=(Token)match(input,78,FOLLOW_98); 

                            							newLeafNode(lv_and_or_3_1, grammarAccess.getEConditionalFormulaAccess().getAnd_orAndKeyword_0_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEConditionalFormulaRule());
                            							}
                            							setWithLastConsumed(current, "and_or", lv_and_or_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:3281:7: lv_and_or_3_2= 'or'
                            {
                            lv_and_or_3_2=(Token)match(input,79,FOLLOW_98); 

                            							newLeafNode(lv_and_or_3_2, grammarAccess.getEConditionalFormulaAccess().getAnd_orOrKeyword_0_3_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEConditionalFormulaRule());
                            							}
                            							setWithLastConsumed(current, "and_or", lv_and_or_3_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_4=(Token)match(input,76,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getEConditionalFormulaAccess().getLeftParenthesisKeyword_0_4());
                    			
                    // InternalAnsibleDsl.g:3298:4: ( (lv_right_expression_5_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:3299:5: (lv_right_expression_5_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:3299:5: (lv_right_expression_5_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:3300:6: lv_right_expression_5_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getEConditionalFormulaAccess().getRight_expressionEConditionalExpressionParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_right_expression_5_0=ruleEConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEConditionalFormulaRule());
                    						}
                    						set(
                    							current,
                    							"right_expression",
                    							lv_right_expression_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,77,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEConditionalFormulaAccess().getRightParenthesisKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:3323:3: (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' )
                    {
                    // InternalAnsibleDsl.g:3323:3: (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' )
                    // InternalAnsibleDsl.g:3324:4: otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,68,FOLLOW_98); 

                    				newLeafNode(otherlv_7, grammarAccess.getEConditionalFormulaAccess().getNotKeyword_1_0());
                    			
                    otherlv_8=(Token)match(input,76,FOLLOW_50); 

                    				newLeafNode(otherlv_8, grammarAccess.getEConditionalFormulaAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalAnsibleDsl.g:3332:4: ( (lv_negated_expression_9_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:3333:5: (lv_negated_expression_9_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:3333:5: (lv_negated_expression_9_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:3334:6: lv_negated_expression_9_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getEConditionalFormulaAccess().getNegated_expressionEConditionalExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_96);
                    lv_negated_expression_9_0=ruleEConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEConditionalFormulaRule());
                    						}
                    						set(
                    							current,
                    							"negated_expression",
                    							lv_negated_expression_9_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,77,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getEConditionalFormulaAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleEConditionalFormula"


    // $ANTLR start "entryRuleERoleInclusion"
    // InternalAnsibleDsl.g:3360:1: entryRuleERoleInclusion returns [EObject current=null] : iv_ruleERoleInclusion= ruleERoleInclusion EOF ;
    public final EObject entryRuleERoleInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusion = null;


        try {
            // InternalAnsibleDsl.g:3360:55: (iv_ruleERoleInclusion= ruleERoleInclusion EOF )
            // InternalAnsibleDsl.g:3361:2: iv_ruleERoleInclusion= ruleERoleInclusion EOF
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
    // InternalAnsibleDsl.g:3367:1: ruleERoleInclusion returns [EObject current=null] : (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? otherlv_29= '}' ) ;
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
            // InternalAnsibleDsl.g:3373:2: ( (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? otherlv_29= '}' ) )
            // InternalAnsibleDsl.g:3374:2: (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? otherlv_29= '}' )
            {
            // InternalAnsibleDsl.g:3374:2: (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? otherlv_29= '}' )
            // InternalAnsibleDsl.g:3375:3: otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_99); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionAccess().getRoleKeyword_0());
            		
            // InternalAnsibleDsl.g:3379:3: (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:3380:4: otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,81,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getERoleInclusionAccess().getRole_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:3384:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:3385:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:3385:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:3386:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_100); 

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

            // InternalAnsibleDsl.g:3403:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==93) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalAnsibleDsl.g:3404:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:3404:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:3405:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_101);
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

            // InternalAnsibleDsl.g:3422:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==99) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalAnsibleDsl.g:3423:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:3423:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:3424:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_102);
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

            // InternalAnsibleDsl.g:3441:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==102) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalAnsibleDsl.g:3442:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:3442:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:3443:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_103);
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

            // InternalAnsibleDsl.g:3460:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==19) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalAnsibleDsl.g:3461:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getERoleInclusionAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3465:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3466:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3466:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3467:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_104); 

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

            // InternalAnsibleDsl.g:3484:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==20) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalAnsibleDsl.g:3485:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getERoleInclusionAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3489:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:3490:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:3490:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:3491:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:3491:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt106=5;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt106=1;
                        }
                        break;
                    case 22:
                        {
                        alt106=2;
                        }
                        break;
                    case 23:
                        {
                        alt106=3;
                        }
                        break;
                    case 24:
                        {
                        alt106=4;
                        }
                        break;
                    case 25:
                        {
                        alt106=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 106, 0, input);

                        throw nvae;
                    }

                    switch (alt106) {
                        case 1 :
                            // InternalAnsibleDsl.g:3492:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,21,FOLLOW_105); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getERoleInclusionAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:3503:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,22,FOLLOW_105); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getERoleInclusionAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:3514:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,23,FOLLOW_105); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getERoleInclusionAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:3525:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,24,FOLLOW_105); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getERoleInclusionAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:3536:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,25,FOLLOW_105); 

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

            // InternalAnsibleDsl.g:3550:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==26) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalAnsibleDsl.g:3551:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getERoleInclusionAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:3555:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3556:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3556:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:3557:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_106);
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

            // InternalAnsibleDsl.g:3575:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==27) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalAnsibleDsl.g:3576:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getERoleInclusionAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:3580:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3581:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3581:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:3582:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_107);
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

            // InternalAnsibleDsl.g:3600:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==28) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalAnsibleDsl.g:3601:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getERoleInclusionAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:3605:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3606:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3606:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:3607:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_108);
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

            // InternalAnsibleDsl.g:3625:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==29) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalAnsibleDsl.g:3626:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getERoleInclusionAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:3630:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3631:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3631:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:3632:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_109);
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

            // InternalAnsibleDsl.g:3650:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==30) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalAnsibleDsl.g:3651:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getERoleInclusionAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:3655:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:3656:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:3656:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:3657:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    // InternalAnsibleDsl.g:3674:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==31) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:3675:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,31,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getERoleInclusionAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:3679:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:3680:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:3680:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:3681:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getERoleInclusionAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
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
                    	    break loop112;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,17,FOLLOW_110); 

                    				newLeafNode(otherlv_22, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:3704:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==43) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalAnsibleDsl.g:3705:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,43,FOLLOW_47); 

                    				newLeafNode(otherlv_23, grammarAccess.getERoleInclusionAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:3709:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:3710:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:3710:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:3711:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getExe_settingsEExecutionExeSettingsParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    otherlv_25=(Token)match(input,17,FOLLOW_111); 

                    				newLeafNode(otherlv_25, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:3733:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==122) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalAnsibleDsl.g:3734:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:3734:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:3735:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_112);
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

            // InternalAnsibleDsl.g:3752:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==44) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalAnsibleDsl.g:3753:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEConditionalExpression ) )
                    {
                    otherlv_27=(Token)match(input,44,FOLLOW_50); 

                    				newLeafNode(otherlv_27, grammarAccess.getERoleInclusionAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:3757:4: ( (lv_when_expression_28_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:3758:5: (lv_when_expression_28_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:3758:5: (lv_when_expression_28_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:3759:6: lv_when_expression_28_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getWhen_expressionEConditionalExpressionParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_when_expression_28_0=ruleEConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    						}
                    						set(
                    							current,
                    							"when_expression",
                    							lv_when_expression_28_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_29=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:3785:1: entryRuleERoleInclusions returns [EObject current=null] : iv_ruleERoleInclusions= ruleERoleInclusions EOF ;
    public final EObject entryRuleERoleInclusions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusions = null;


        try {
            // InternalAnsibleDsl.g:3785:56: (iv_ruleERoleInclusions= ruleERoleInclusions EOF )
            // InternalAnsibleDsl.g:3786:2: iv_ruleERoleInclusions= ruleERoleInclusions EOF
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
    // InternalAnsibleDsl.g:3792:1: ruleERoleInclusions returns [EObject current=null] : (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' ) ;
    public final EObject ruleERoleInclusions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_roles_1_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3798:2: ( (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' ) )
            // InternalAnsibleDsl.g:3799:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' )
            {
            // InternalAnsibleDsl.g:3799:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' )
            // InternalAnsibleDsl.g:3800:3: otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_113); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionsAccess().getRoles_inclusionsKeyword_0());
            		
            // InternalAnsibleDsl.g:3804:3: ( (lv_roles_1_0= ruleERoleInclusion ) )
            // InternalAnsibleDsl.g:3805:4: (lv_roles_1_0= ruleERoleInclusion )
            {
            // InternalAnsibleDsl.g:3805:4: (lv_roles_1_0= ruleERoleInclusion )
            // InternalAnsibleDsl.g:3806:5: lv_roles_1_0= ruleERoleInclusion
            {

            					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_114);
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

            // InternalAnsibleDsl.g:3823:3: ( (lv_roles_2_0= ruleERoleInclusion ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==80) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3824:4: (lv_roles_2_0= ruleERoleInclusion )
            	    {
            	    // InternalAnsibleDsl.g:3824:4: (lv_roles_2_0= ruleERoleInclusion )
            	    // InternalAnsibleDsl.g:3825:5: lv_roles_2_0= ruleERoleInclusion
            	    {

            	    					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_114);
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
            	    break loop117;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:3850:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalAnsibleDsl.g:3850:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalAnsibleDsl.g:3851:2: iv_ruleELoop= ruleELoop EOF
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
    // InternalAnsibleDsl.g:3857:1: ruleELoop returns [EObject current=null] : (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        EObject this_ELoopOverList_0 = null;

        EObject this_EUntil_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3863:2: ( (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) )
            // InternalAnsibleDsl.g:3864:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            {
            // InternalAnsibleDsl.g:3864:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==83) ) {
                alt118=1;
            }
            else if ( ((LA118_0>=90 && LA118_0<=92)) ) {
                alt118=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }
            switch (alt118) {
                case 1 :
                    // InternalAnsibleDsl.g:3865:3: this_ELoopOverList_0= ruleELoopOverList
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
                    // InternalAnsibleDsl.g:3874:3: this_EUntil_1= ruleEUntil
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
    // InternalAnsibleDsl.g:3886:1: entryRuleELoopOverList returns [EObject current=null] : iv_ruleELoopOverList= ruleELoopOverList EOF ;
    public final EObject entryRuleELoopOverList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopOverList = null;


        try {
            // InternalAnsibleDsl.g:3886:54: (iv_ruleELoopOverList= ruleELoopOverList EOF )
            // InternalAnsibleDsl.g:3887:2: iv_ruleELoopOverList= ruleELoopOverList EOF
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
    // InternalAnsibleDsl.g:3893:1: ruleELoopOverList returns [EObject current=null] : (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) ;
    public final EObject ruleELoopOverList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loop_list_1_0 = null;

        EObject lv_loop_control_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3899:2: ( (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) )
            // InternalAnsibleDsl.g:3900:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            {
            // InternalAnsibleDsl.g:3900:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            // InternalAnsibleDsl.g:3901:3: otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )?
            {
            otherlv_0=(Token)match(input,83,FOLLOW_92); 

            			newLeafNode(otherlv_0, grammarAccess.getELoopOverListAccess().getLoopKeyword_0());
            		
            // InternalAnsibleDsl.g:3905:3: ( (lv_loop_list_1_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:3906:4: (lv_loop_list_1_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:3906:4: (lv_loop_list_1_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:3907:5: lv_loop_list_1_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getELoopOverListAccess().getLoop_listEValuePassedParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_115);
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

            // InternalAnsibleDsl.g:3924:3: ( (lv_loop_control_2_0= ruleELoopControl ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==84) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalAnsibleDsl.g:3925:4: (lv_loop_control_2_0= ruleELoopControl )
                    {
                    // InternalAnsibleDsl.g:3925:4: (lv_loop_control_2_0= ruleELoopControl )
                    // InternalAnsibleDsl.g:3926:5: lv_loop_control_2_0= ruleELoopControl
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
    // InternalAnsibleDsl.g:3947:1: entryRuleELoopControl returns [EObject current=null] : iv_ruleELoopControl= ruleELoopControl EOF ;
    public final EObject entryRuleELoopControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopControl = null;


        try {
            // InternalAnsibleDsl.g:3947:53: (iv_ruleELoopControl= ruleELoopControl EOF )
            // InternalAnsibleDsl.g:3948:2: iv_ruleELoopControl= ruleELoopControl EOF
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
    // InternalAnsibleDsl.g:3954:1: ruleELoopControl returns [EObject current=null] : ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:3960:2: ( ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:3961:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:3961:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:3962:3: () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:3962:3: ()
            // InternalAnsibleDsl.g:3963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getELoopControlAccess().getELoopControlAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_116); 

            			newLeafNode(otherlv_1, grammarAccess.getELoopControlAccess().getLoop_controlKeyword_1());
            		
            // InternalAnsibleDsl.g:3973:3: (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==85) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalAnsibleDsl.g:3974:4: otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) )
                    {
                    otherlv_2=(Token)match(input,85,FOLLOW_92); 

                    				newLeafNode(otherlv_2, grammarAccess.getELoopControlAccess().getLabelKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3978:4: ( (lv_label_3_0= ruleEValuePassed ) )
                    // InternalAnsibleDsl.g:3979:5: (lv_label_3_0= ruleEValuePassed )
                    {
                    // InternalAnsibleDsl.g:3979:5: (lv_label_3_0= ruleEValuePassed )
                    // InternalAnsibleDsl.g:3980:6: lv_label_3_0= ruleEValuePassed
                    {

                    						newCompositeNode(grammarAccess.getELoopControlAccess().getLabelEValuePassedParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_117);
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

            // InternalAnsibleDsl.g:3998:3: (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==86) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalAnsibleDsl.g:3999:4: otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,86,FOLLOW_118); 

                    				newLeafNode(otherlv_4, grammarAccess.getELoopControlAccess().getPauseKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4003:4: ( (lv_pause_5_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:4004:5: (lv_pause_5_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:4004:5: (lv_pause_5_0= RULE_INT )
                    // InternalAnsibleDsl.g:4005:6: lv_pause_5_0= RULE_INT
                    {
                    lv_pause_5_0=(Token)match(input,RULE_INT,FOLLOW_119); 

                    						newLeafNode(lv_pause_5_0, grammarAccess.getELoopControlAccess().getPauseINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getELoopControlRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pause",
                    							lv_pause_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4022:3: (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==87) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalAnsibleDsl.g:4023:4: otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,87,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getELoopControlAccess().getIndex_varKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4027:4: ( (lv_index_var_7_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:4028:5: (lv_index_var_7_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:4028:5: (lv_index_var_7_0= RULE_ID )
                    // InternalAnsibleDsl.g:4029:6: lv_index_var_7_0= RULE_ID
                    {
                    lv_index_var_7_0=(Token)match(input,RULE_ID,FOLLOW_120); 

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

            // InternalAnsibleDsl.g:4046:3: (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==88) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalAnsibleDsl.g:4047:4: otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,88,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getELoopControlAccess().getLoop_varKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4051:4: ( (lv_loop_var_9_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:4052:5: (lv_loop_var_9_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:4052:5: (lv_loop_var_9_0= RULE_ID )
                    // InternalAnsibleDsl.g:4053:6: lv_loop_var_9_0= RULE_ID
                    {
                    lv_loop_var_9_0=(Token)match(input,RULE_ID,FOLLOW_121); 

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

            // InternalAnsibleDsl.g:4070:3: (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==89) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalAnsibleDsl.g:4071:4: otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    {
                    otherlv_10=(Token)match(input,89,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getELoopControlAccess().getExtendedKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:4075:4: ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4076:5: (lv_extended_11_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4076:5: (lv_extended_11_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4077:6: lv_extended_11_0= RULE_BOOLEAN
                    {
                    lv_extended_11_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_8); 

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

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:4102:1: entryRuleEUntil returns [EObject current=null] : iv_ruleEUntil= ruleEUntil EOF ;
    public final EObject entryRuleEUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUntil = null;


        try {
            // InternalAnsibleDsl.g:4102:47: (iv_ruleEUntil= ruleEUntil EOF )
            // InternalAnsibleDsl.g:4103:2: iv_ruleEUntil= ruleEUntil EOF
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
    // InternalAnsibleDsl.g:4109:1: ruleEUntil returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalAnsibleDsl.g:4115:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:4116:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:4116:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:4117:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:4117:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:4118:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEUntilAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4121:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:4122:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:4122:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+
            int cnt125=0;
            loop125:
            do {
                int alt125=4;
                int LA125_0 = input.LA(1);

                if ( LA125_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
                    alt125=1;
                }
                else if ( LA125_0 == 91 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
                    alt125=2;
                }
                else if ( LA125_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
                    alt125=3;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4123:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4123:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4124:4: {...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4124:100: ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) )
            	    // InternalAnsibleDsl.g:4125:5: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4128:8: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) )
            	    // InternalAnsibleDsl.g:4128:9: {...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:4128:18: (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) )
            	    // InternalAnsibleDsl.g:4128:19: otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,90,FOLLOW_50); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEUntilAccess().getUntilKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4132:8: ( (lv_until_2_0= ruleEConditionalExpression ) )
            	    // InternalAnsibleDsl.g:4133:9: (lv_until_2_0= ruleEConditionalExpression )
            	    {
            	    // InternalAnsibleDsl.g:4133:9: (lv_until_2_0= ruleEConditionalExpression )
            	    // InternalAnsibleDsl.g:4134:10: lv_until_2_0= ruleEConditionalExpression
            	    {

            	    										newCompositeNode(grammarAccess.getEUntilAccess().getUntilEConditionalExpressionParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_122);
            	    lv_until_2_0=ruleEConditionalExpression();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEUntilRule());
            	    										}
            	    										set(
            	    											current,
            	    											"until",
            	    											lv_until_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
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
            	    // InternalAnsibleDsl.g:4157:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4157:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4158:4: {...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4158:100: ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:4159:5: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4162:8: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:4162:9: {...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:4162:18: (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:4162:19: otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,91,FOLLOW_118); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEUntilAccess().getRetriesKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4166:8: ( (lv_retries_4_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:4167:9: (lv_retries_4_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:4167:9: (lv_retries_4_0= RULE_INT )
            	    // InternalAnsibleDsl.g:4168:10: lv_retries_4_0= RULE_INT
            	    {
            	    lv_retries_4_0=(Token)match(input,RULE_INT,FOLLOW_122); 

            	    										newLeafNode(lv_retries_4_0, grammarAccess.getEUntilAccess().getRetriesINTTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEUntilRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"retries",
            	    											lv_retries_4_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

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
            	    // InternalAnsibleDsl.g:4190:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4190:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4191:4: {...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:4191:100: ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:4192:5: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:4195:8: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:4195:9: {...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:4195:18: (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:4195:19: otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,92,FOLLOW_118); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEUntilAccess().getDelayKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:4199:8: ( (lv_delay_6_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:4200:9: (lv_delay_6_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:4200:9: (lv_delay_6_0= RULE_INT )
            	    // InternalAnsibleDsl.g:4201:10: lv_delay_6_0= RULE_INT
            	    {
            	    lv_delay_6_0=(Token)match(input,RULE_INT,FOLLOW_122); 

            	    										newLeafNode(lv_delay_6_0, grammarAccess.getEUntilAccess().getDelayINTTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEUntilRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"delay",
            	    											lv_delay_6_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

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
            	    if ( cnt125 >= 1 ) break loop125;
                        EarlyExitException eee =
                            new EarlyExitException(125, input);
                        throw eee;
                }
                cnt125++;
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
    // InternalAnsibleDsl.g:4234:1: entryRuleEPrivilageEscalation returns [EObject current=null] : iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF ;
    public final EObject entryRuleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrivilageEscalation = null;


        try {
            // InternalAnsibleDsl.g:4234:61: (iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF )
            // InternalAnsibleDsl.g:4235:2: iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF
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
    // InternalAnsibleDsl.g:4241:1: ruleEPrivilageEscalation returns [EObject current=null] : ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:4247:2: ( ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:4248:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:4248:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:4249:3: () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:4249:3: ()
            // InternalAnsibleDsl.g:4250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPrivilageEscalationAccess().getEPrivilageEscalationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_123); 

            			newLeafNode(otherlv_1, grammarAccess.getEPrivilageEscalationAccess().getPrivilage_escalationKeyword_1());
            		
            // InternalAnsibleDsl.g:4260:3: (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==94) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalAnsibleDsl.g:4261:4: otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,94,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getEPrivilageEscalationAccess().getBecomeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4265:4: ( (lv_become_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4266:5: (lv_become_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4266:5: (lv_become_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4267:6: lv_become_3_0= RULE_BOOLEAN
                    {
                    lv_become_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_124); 

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

            // InternalAnsibleDsl.g:4284:3: (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==95) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalAnsibleDsl.g:4285:4: otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,95,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPrivilageEscalationAccess().getBecome_exeKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4289:4: ( (lv_become_exe_5_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4290:5: (lv_become_exe_5_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4290:5: (lv_become_exe_5_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4291:6: lv_become_exe_5_0= RULE_STRING
                    {
                    lv_become_exe_5_0=(Token)match(input,RULE_STRING,FOLLOW_125); 

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

            // InternalAnsibleDsl.g:4308:3: (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==96) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalAnsibleDsl.g:4309:4: otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,96,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4313:4: ( (lv_become_flags_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4314:5: (lv_become_flags_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4314:5: (lv_become_flags_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4315:6: lv_become_flags_7_0= RULE_STRING
                    {
                    lv_become_flags_7_0=(Token)match(input,RULE_STRING,FOLLOW_126); 

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

            // InternalAnsibleDsl.g:4332:3: (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==97) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalAnsibleDsl.g:4333:4: otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,97,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPrivilageEscalationAccess().getBecome_methodKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4337:4: ( (lv_become_method_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4338:5: (lv_become_method_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4338:5: (lv_become_method_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4339:6: lv_become_method_9_0= RULE_STRING
                    {
                    lv_become_method_9_0=(Token)match(input,RULE_STRING,FOLLOW_127); 

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

            // InternalAnsibleDsl.g:4356:3: (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==98) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalAnsibleDsl.g:4357:4: otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,98,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEPrivilageEscalationAccess().getBecome_userKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:4361:4: ( (lv_become_user_11_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4362:5: (lv_become_user_11_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4362:5: (lv_become_user_11_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4363:6: lv_become_user_11_0= RULE_STRING
                    {
                    lv_become_user_11_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            otherlv_12=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:4388:1: entryRuleEValidationMode returns [EObject current=null] : iv_ruleEValidationMode= ruleEValidationMode EOF ;
    public final EObject entryRuleEValidationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidationMode = null;


        try {
            // InternalAnsibleDsl.g:4388:56: (iv_ruleEValidationMode= ruleEValidationMode EOF )
            // InternalAnsibleDsl.g:4389:2: iv_ruleEValidationMode= ruleEValidationMode EOF
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
    // InternalAnsibleDsl.g:4395:1: ruleEValidationMode returns [EObject current=null] : ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) ;
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
            // InternalAnsibleDsl.g:4401:2: ( ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) )
            // InternalAnsibleDsl.g:4402:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            {
            // InternalAnsibleDsl.g:4402:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            // InternalAnsibleDsl.g:4403:3: () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}'
            {
            // InternalAnsibleDsl.g:4403:3: ()
            // InternalAnsibleDsl.g:4404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEValidationModeAccess().getEValidationModeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_128); 

            			newLeafNode(otherlv_1, grammarAccess.getEValidationModeAccess().getValidation_modeKeyword_1());
            		
            // InternalAnsibleDsl.g:4414:3: (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==100) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalAnsibleDsl.g:4415:4: otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,100,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getEValidationModeAccess().getCheck_modeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4419:4: ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4420:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4420:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4421:6: lv_check_mode_3_0= RULE_BOOLEAN
                    {
                    lv_check_mode_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_129); 

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

            // InternalAnsibleDsl.g:4438:3: (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==101) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalAnsibleDsl.g:4439:4: otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    {
                    otherlv_4=(Token)match(input,101,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getEValidationModeAccess().getDiffKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4443:4: ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4444:5: (lv_diff_5_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4444:5: (lv_diff_5_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4445:6: lv_diff_5_0= RULE_BOOLEAN
                    {
                    lv_diff_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_8); 

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

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:4470:1: entryRuleEConnection returns [EObject current=null] : iv_ruleEConnection= ruleEConnection EOF ;
    public final EObject entryRuleEConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConnection = null;


        try {
            // InternalAnsibleDsl.g:4470:52: (iv_ruleEConnection= ruleEConnection EOF )
            // InternalAnsibleDsl.g:4471:2: iv_ruleEConnection= ruleEConnection EOF
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
    // InternalAnsibleDsl.g:4477:1: ruleEConnection returns [EObject current=null] : ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) ;
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
            // InternalAnsibleDsl.g:4483:2: ( ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) )
            // InternalAnsibleDsl.g:4484:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            {
            // InternalAnsibleDsl.g:4484:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            // InternalAnsibleDsl.g:4485:3: () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}'
            {
            // InternalAnsibleDsl.g:4485:3: ()
            // InternalAnsibleDsl.g:4486:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConnectionAccess().getEConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_130); 

            			newLeafNode(otherlv_1, grammarAccess.getEConnectionAccess().getConnection_infoKeyword_1());
            		
            // InternalAnsibleDsl.g:4496:3: (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==103) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalAnsibleDsl.g:4497:4: otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,103,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEConnectionAccess().getConnectionKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4501:4: ( (lv_connection_3_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4502:5: (lv_connection_3_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4502:5: (lv_connection_3_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4503:6: lv_connection_3_0= RULE_STRING
                    {
                    lv_connection_3_0=(Token)match(input,RULE_STRING,FOLLOW_131); 

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

            // InternalAnsibleDsl.g:4520:3: (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==104) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalAnsibleDsl.g:4521:4: otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,104,FOLLOW_118); 

                    				newLeafNode(otherlv_4, grammarAccess.getEConnectionAccess().getPortKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4525:4: ( (lv_port_5_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:4526:5: (lv_port_5_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:4526:5: (lv_port_5_0= RULE_INT )
                    // InternalAnsibleDsl.g:4527:6: lv_port_5_0= RULE_INT
                    {
                    lv_port_5_0=(Token)match(input,RULE_INT,FOLLOW_132); 

                    						newLeafNode(lv_port_5_0, grammarAccess.getEConnectionAccess().getPortINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEConnectionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"port",
                    							lv_port_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4544:3: (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==105) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalAnsibleDsl.g:4545:4: otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,105,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEConnectionAccess().getRemote_userKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4549:4: ( (lv_remote_user_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4550:5: (lv_remote_user_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4550:5: (lv_remote_user_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4551:6: lv_remote_user_7_0= RULE_STRING
                    {
                    lv_remote_user_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:4576:1: entryRuleEPlayExeSettings returns [EObject current=null] : iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF ;
    public final EObject entryRuleEPlayExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayExeSettings = null;


        try {
            // InternalAnsibleDsl.g:4576:57: (iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF )
            // InternalAnsibleDsl.g:4577:2: iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF
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
    // InternalAnsibleDsl.g:4583:1: ruleEPlayExeSettings returns [EObject current=null] : ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4589:2: ( ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4590:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4590:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4591:3: () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4591:3: ()
            // InternalAnsibleDsl.g:4592:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayExeSettingsAccess().getEPlayExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4598:3: (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==106) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalAnsibleDsl.g:4599:4: otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,106,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayExeSettingsAccess().getStrategyKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4603:4: ( (lv_strategy_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4604:5: (lv_strategy_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4604:5: (lv_strategy_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4605:6: lv_strategy_2_0= RULE_STRING
                    {
                    lv_strategy_2_0=(Token)match(input,RULE_STRING,FOLLOW_133); 

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

            // InternalAnsibleDsl.g:4622:3: (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==107) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalAnsibleDsl.g:4623:4: otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) )
                    {
                    otherlv_3=(Token)match(input,107,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayExeSettingsAccess().getSerialKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4627:4: ( (lv_serial_list_4_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4628:5: (lv_serial_list_4_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4628:5: (lv_serial_list_4_0= ruleEList )
                    // InternalAnsibleDsl.g:4629:6: lv_serial_list_4_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getSerial_listEListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_134);
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

            // InternalAnsibleDsl.g:4647:3: (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==108) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalAnsibleDsl.g:4648:4: otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,108,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayExeSettingsAccess().getOrderKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4652:4: ( (lv_order_6_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4653:5: (lv_order_6_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4653:5: (lv_order_6_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4654:6: lv_order_6_0= RULE_STRING
                    {
                    lv_order_6_0=(Token)match(input,RULE_STRING,FOLLOW_135); 

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

            // InternalAnsibleDsl.g:4671:3: (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==109) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalAnsibleDsl.g:4672:4: otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,109,FOLLOW_118); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayExeSettingsAccess().getThrottleKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4676:4: ( (lv_throttle_8_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:4677:5: (lv_throttle_8_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:4677:5: (lv_throttle_8_0= RULE_INT )
                    // InternalAnsibleDsl.g:4678:6: lv_throttle_8_0= RULE_INT
                    {
                    lv_throttle_8_0=(Token)match(input,RULE_INT,FOLLOW_136); 

                    						newLeafNode(lv_throttle_8_0, grammarAccess.getEPlayExeSettingsAccess().getThrottleINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlayExeSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"throttle",
                    							lv_throttle_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4695:3: (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==110) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalAnsibleDsl.g:4696:4: otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,110,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getEPlayExeSettingsAccess().getRun_onceKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4700:4: ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4701:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4701:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4702:6: lv_run_once_10_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4723:1: entryRuleEExecutionExeSettings returns [EObject current=null] : iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF ;
    public final EObject entryRuleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionExeSettings = null;


        try {
            // InternalAnsibleDsl.g:4723:62: (iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF )
            // InternalAnsibleDsl.g:4724:2: iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF
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
    // InternalAnsibleDsl.g:4730:1: ruleEExecutionExeSettings returns [EObject current=null] : ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_throttle_2_0=null;
        Token otherlv_3=null;
        Token lv_run_once_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4736:2: ( ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4737:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4737:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4738:3: () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4738:3: ()
            // InternalAnsibleDsl.g:4739:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEExecutionExeSettingsAccess().getEExecutionExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4745:3: (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==109) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalAnsibleDsl.g:4746:4: otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,109,FOLLOW_118); 

                    				newLeafNode(otherlv_1, grammarAccess.getEExecutionExeSettingsAccess().getThrottleKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4750:4: ( (lv_throttle_2_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:4751:5: (lv_throttle_2_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:4751:5: (lv_throttle_2_0= RULE_INT )
                    // InternalAnsibleDsl.g:4752:6: lv_throttle_2_0= RULE_INT
                    {
                    lv_throttle_2_0=(Token)match(input,RULE_INT,FOLLOW_136); 

                    						newLeafNode(lv_throttle_2_0, grammarAccess.getEExecutionExeSettingsAccess().getThrottleINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEExecutionExeSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"throttle",
                    							lv_throttle_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4769:3: (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==110) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalAnsibleDsl.g:4770:4: otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,110,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getEExecutionExeSettingsAccess().getRun_onceKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4774:4: ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4775:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4775:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4776:6: lv_run_once_4_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4797:1: entryRuleEBlockErrorHandling returns [EObject current=null] : iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF ;
    public final EObject entryRuleEBlockErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4797:60: (iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF )
            // InternalAnsibleDsl.g:4798:2: iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF
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
    // InternalAnsibleDsl.g:4804:1: ruleEBlockErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4810:2: ( ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4811:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4811:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4812:3: () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4812:3: ()
            // InternalAnsibleDsl.g:4813:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBlockErrorHandlingAccess().getEBlockErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4819:3: (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==111) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalAnsibleDsl.g:4820:4: otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    {
                    otherlv_1=(Token)match(input,111,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4824:4: ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4825:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4825:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4826:6: lv_any_errors_fatal_2_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_137); 

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

            // InternalAnsibleDsl.g:4843:3: (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==112) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalAnsibleDsl.g:4844:4: otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,112,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4848:4: ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4849:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4849:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4850:6: lv_ignore_errors_4_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_138); 

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

            // InternalAnsibleDsl.g:4867:3: (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==113) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalAnsibleDsl.g:4868:4: otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,113,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4872:4: ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4873:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4873:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4874:6: lv_ignore_unreachable_6_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4895:1: entryRuleEPlayErrorHandling returns [EObject current=null] : iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF ;
    public final EObject entryRuleEPlayErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4895:59: (iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF )
            // InternalAnsibleDsl.g:4896:2: iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF
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
    // InternalAnsibleDsl.g:4902:1: ruleEPlayErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4908:2: ( ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4909:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4909:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4910:3: () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4910:3: ()
            // InternalAnsibleDsl.g:4911:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayErrorHandlingAccess().getEPlayErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4917:3: (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==114) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalAnsibleDsl.g:4918:4: otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,114,FOLLOW_118); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4922:4: ( (lv_max_fail_percentage_2_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:4923:5: (lv_max_fail_percentage_2_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:4923:5: (lv_max_fail_percentage_2_0= RULE_INT )
                    // InternalAnsibleDsl.g:4924:6: lv_max_fail_percentage_2_0= RULE_INT
                    {
                    lv_max_fail_percentage_2_0=(Token)match(input,RULE_INT,FOLLOW_139); 

                    						newLeafNode(lv_max_fail_percentage_2_0, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlayErrorHandlingRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max_fail_percentage",
                    							lv_max_fail_percentage_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:4941:3: (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==111) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalAnsibleDsl.g:4942:4: otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,111,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4946:4: ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4947:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4947:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4948:6: lv_any_errors_fatal_4_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_137); 

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

            // InternalAnsibleDsl.g:4965:3: (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==112) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalAnsibleDsl.g:4966:4: otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,112,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4970:4: ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4971:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4971:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4972:6: lv_ignore_errors_6_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_138); 

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

            // InternalAnsibleDsl.g:4989:3: (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==113) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalAnsibleDsl.g:4990:4: otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,113,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4994:4: ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4995:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4995:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4996:6: lv_ignore_unreachable_8_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:5017:1: entryRuleETaskHandlerErrorHandling returns [EObject current=null] : iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF ;
    public final EObject entryRuleETaskHandlerErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:5017:66: (iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF )
            // InternalAnsibleDsl.g:5018:2: iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF
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
    // InternalAnsibleDsl.g:5024:1: ruleETaskHandlerErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:5030:2: ( ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:5031:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:5031:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:5032:3: () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:5032:3: ()
            // InternalAnsibleDsl.g:5033:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETaskHandlerErrorHandlingAccess().getETaskHandlerErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:5039:3: (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==115) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalAnsibleDsl.g:5040:4: otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) )
                    {
                    otherlv_1=(Token)match(input,115,FOLLOW_50); 

                    				newLeafNode(otherlv_1, grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5044:4: ( (lv_changed_when_2_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:5045:5: (lv_changed_when_2_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:5045:5: (lv_changed_when_2_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:5046:6: lv_changed_when_2_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenEConditionalExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_140);
                    lv_changed_when_2_0=ruleEConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskHandlerErrorHandlingRule());
                    						}
                    						set(
                    							current,
                    							"changed_when",
                    							lv_changed_when_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:5064:3: (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==116) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalAnsibleDsl.g:5065:4: otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) )
                    {
                    otherlv_3=(Token)match(input,116,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:5069:4: ( (lv_failed_when_4_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:5070:5: (lv_failed_when_4_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:5070:5: (lv_failed_when_4_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:5071:6: lv_failed_when_4_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenEConditionalExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_139);
                    lv_failed_when_4_0=ruleEConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskHandlerErrorHandlingRule());
                    						}
                    						set(
                    							current,
                    							"failed_when",
                    							lv_failed_when_4_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:5089:3: (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==111) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalAnsibleDsl.g:5090:4: otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,111,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:5094:4: ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:5095:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:5095:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:5096:6: lv_any_errors_fatal_6_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_137); 

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

            // InternalAnsibleDsl.g:5113:3: (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==112) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalAnsibleDsl.g:5114:4: otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,112,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:5118:4: ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:5119:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:5119:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:5120:6: lv_ignore_errors_8_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_138); 

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

            // InternalAnsibleDsl.g:5137:3: (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==113) ) {
                alt154=1;
            }
            switch (alt154) {
                case 1 :
                    // InternalAnsibleDsl.g:5138:4: otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,113,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:5142:4: ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:5143:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:5143:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:5144:6: lv_ignore_unreachable_10_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:5165:1: entryRuleEFactsSettings returns [EObject current=null] : iv_ruleEFactsSettings= ruleEFactsSettings EOF ;
    public final EObject entryRuleEFactsSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactsSettings = null;


        try {
            // InternalAnsibleDsl.g:5165:55: (iv_ruleEFactsSettings= ruleEFactsSettings EOF )
            // InternalAnsibleDsl.g:5166:2: iv_ruleEFactsSettings= ruleEFactsSettings EOF
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
    // InternalAnsibleDsl.g:5172:1: ruleEFactsSettings returns [EObject current=null] : ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // InternalAnsibleDsl.g:5178:2: ( ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalAnsibleDsl.g:5179:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalAnsibleDsl.g:5179:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalAnsibleDsl.g:5180:3: () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // InternalAnsibleDsl.g:5180:3: ()
            // InternalAnsibleDsl.g:5181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactsSettingsAccess().getEFactsSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,117,FOLLOW_141); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactsSettingsAccess().getFacts_setttingsKeyword_1());
            		
            // InternalAnsibleDsl.g:5191:3: (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )?
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==118) ) {
                alt155=1;
            }
            switch (alt155) {
                case 1 :
                    // InternalAnsibleDsl.g:5192:4: otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,118,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getEFactsSettingsAccess().getGather_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:5196:4: ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:5197:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:5197:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:5198:6: lv_gather_facts_3_0= RULE_BOOLEAN
                    {
                    lv_gather_facts_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_142); 

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

            // InternalAnsibleDsl.g:5215:3: (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==119) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // InternalAnsibleDsl.g:5216:4: otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) )
                    {
                    otherlv_4=(Token)match(input,119,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getEFactsSettingsAccess().getGather_subsetKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:5220:4: ( (lv_gather_subset_5_0= ruleEList ) )
                    // InternalAnsibleDsl.g:5221:5: (lv_gather_subset_5_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:5221:5: (lv_gather_subset_5_0= ruleEList )
                    // InternalAnsibleDsl.g:5222:6: lv_gather_subset_5_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEFactsSettingsAccess().getGather_subsetEListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_143);
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

            // InternalAnsibleDsl.g:5240:3: (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==120) ) {
                alt157=1;
            }
            switch (alt157) {
                case 1 :
                    // InternalAnsibleDsl.g:5241:4: otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,120,FOLLOW_118); 

                    				newLeafNode(otherlv_6, grammarAccess.getEFactsSettingsAccess().getGather_timeoutKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:5245:4: ( (lv_gather_timeout_7_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:5246:5: (lv_gather_timeout_7_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:5246:5: (lv_gather_timeout_7_0= RULE_INT )
                    // InternalAnsibleDsl.g:5247:6: lv_gather_timeout_7_0= RULE_INT
                    {
                    lv_gather_timeout_7_0=(Token)match(input,RULE_INT,FOLLOW_144); 

                    						newLeafNode(lv_gather_timeout_7_0, grammarAccess.getEFactsSettingsAccess().getGather_timeoutINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEFactsSettingsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"gather_timeout",
                    							lv_gather_timeout_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:5264:3: (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )?
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==121) ) {
                alt158=1;
            }
            switch (alt158) {
                case 1 :
                    // InternalAnsibleDsl.g:5265:4: otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,121,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEFactsSettingsAccess().getFact_pathKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:5269:4: ( (lv_fact_path_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:5270:5: (lv_fact_path_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:5270:5: (lv_fact_path_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:5271:6: lv_fact_path_9_0= RULE_STRING
                    {
                    lv_fact_path_9_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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

            otherlv_10=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:5296:1: entryRuleEDelegation returns [EObject current=null] : iv_ruleEDelegation= ruleEDelegation EOF ;
    public final EObject entryRuleEDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDelegation = null;


        try {
            // InternalAnsibleDsl.g:5296:52: (iv_ruleEDelegation= ruleEDelegation EOF )
            // InternalAnsibleDsl.g:5297:2: iv_ruleEDelegation= ruleEDelegation EOF
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
    // InternalAnsibleDsl.g:5303:1: ruleEDelegation returns [EObject current=null] : (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) ;
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
            // InternalAnsibleDsl.g:5309:2: ( (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) )
            // InternalAnsibleDsl.g:5310:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            {
            // InternalAnsibleDsl.g:5310:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            // InternalAnsibleDsl.g:5311:3: otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,122,FOLLOW_145); 

            			newLeafNode(otherlv_0, grammarAccess.getEDelegationAccess().getDelegationKeyword_0());
            		
            // InternalAnsibleDsl.g:5315:3: (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:5316:4: otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,123,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEDelegationAccess().getDelegate_toKeyword_1_0());
            			
            // InternalAnsibleDsl.g:5320:4: ( (lv_delegate_to_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:5321:5: (lv_delegate_to_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:5321:5: (lv_delegate_to_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:5322:6: lv_delegate_to_2_0= RULE_STRING
            {
            lv_delegate_to_2_0=(Token)match(input,RULE_STRING,FOLLOW_146); 

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

            // InternalAnsibleDsl.g:5339:3: (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==124) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // InternalAnsibleDsl.g:5340:4: otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,124,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getEDelegationAccess().getDelegate_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:5344:4: ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:5345:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:5345:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:5346:6: lv_delegate_facts_4_0= RULE_BOOLEAN
                    {
                    lv_delegate_facts_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_8); 

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

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:5371:1: entryRuleEAsynchronousSettings returns [EObject current=null] : iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF ;
    public final EObject entryRuleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAsynchronousSettings = null;


        try {
            // InternalAnsibleDsl.g:5371:62: (iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF )
            // InternalAnsibleDsl.g:5372:2: iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF
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
    // InternalAnsibleDsl.g:5378:1: ruleEAsynchronousSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_async_2_0=null;
        Token otherlv_3=null;
        Token lv_poll_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5384:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:5385:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:5385:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:5386:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:5386:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:5387:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:5390:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:5391:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:5391:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+
            int cnt160=0;
            loop160:
            do {
                int alt160=3;
                int LA160_0 = input.LA(1);

                if ( LA160_0 == 125 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt160=1;
                }
                else if ( LA160_0 == 126 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt160=2;
                }


                switch (alt160) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5392:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:5392:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:5393:4: {...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:5393:115: ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:5394:5: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:5397:8: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:5397:9: {...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:5397:18: (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:5397:19: otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,125,FOLLOW_118); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAsynchronousSettingsAccess().getAsyncKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:5401:8: ( (lv_async_2_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:5402:9: (lv_async_2_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:5402:9: (lv_async_2_0= RULE_INT )
            	    // InternalAnsibleDsl.g:5403:10: lv_async_2_0= RULE_INT
            	    {
            	    lv_async_2_0=(Token)match(input,RULE_INT,FOLLOW_147); 

            	    										newLeafNode(lv_async_2_0, grammarAccess.getEAsynchronousSettingsAccess().getAsyncINTTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAsynchronousSettingsRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"async",
            	    											lv_async_2_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

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
            	    // InternalAnsibleDsl.g:5425:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:5425:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:5426:4: {...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:5426:115: ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:5427:5: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:5430:8: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:5430:9: {...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:5430:18: (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:5430:19: otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,126,FOLLOW_118); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAsynchronousSettingsAccess().getPollKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:5434:8: ( (lv_poll_4_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:5435:9: (lv_poll_4_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:5435:9: (lv_poll_4_0= RULE_INT )
            	    // InternalAnsibleDsl.g:5436:10: lv_poll_4_0= RULE_INT
            	    {
            	    lv_poll_4_0=(Token)match(input,RULE_INT,FOLLOW_147); 

            	    										newLeafNode(lv_poll_4_0, grammarAccess.getEAsynchronousSettingsAccess().getPollINTTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAsynchronousSettingsRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"poll",
            	    											lv_poll_4_0,
            	    											"org.eclipse.xtext.common.Terminals.INT");
            	    									

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
            	    if ( cnt160 >= 1 ) break loop160;
                        EarlyExitException eee =
                            new EarlyExitException(160, input);
                        throw eee;
                }
                cnt160++;
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
    // InternalAnsibleDsl.g:5469:1: entryRuleENotifiable returns [EObject current=null] : iv_ruleENotifiable= ruleENotifiable EOF ;
    public final EObject entryRuleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiable = null;


        try {
            // InternalAnsibleDsl.g:5469:52: (iv_ruleENotifiable= ruleENotifiable EOF )
            // InternalAnsibleDsl.g:5470:2: iv_ruleENotifiable= ruleENotifiable EOF
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
    // InternalAnsibleDsl.g:5476:1: ruleENotifiable returns [EObject current=null] : (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) ;
    public final EObject ruleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject this_ENotifiedHandler_0 = null;

        EObject this_ENotifiedTopic_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5482:2: ( (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) )
            // InternalAnsibleDsl.g:5483:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            {
            // InternalAnsibleDsl.g:5483:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==RULE_STRING) ) {
                alt161=1;
            }
            else if ( (LA161_0==127) ) {
                alt161=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // InternalAnsibleDsl.g:5484:3: this_ENotifiedHandler_0= ruleENotifiedHandler
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
                    // InternalAnsibleDsl.g:5493:3: this_ENotifiedTopic_1= ruleENotifiedTopic
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
    // InternalAnsibleDsl.g:5505:1: entryRuleENotifiedHandler returns [EObject current=null] : iv_ruleENotifiedHandler= ruleENotifiedHandler EOF ;
    public final EObject entryRuleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedHandler = null;


        try {
            // InternalAnsibleDsl.g:5505:57: (iv_ruleENotifiedHandler= ruleENotifiedHandler EOF )
            // InternalAnsibleDsl.g:5506:2: iv_ruleENotifiedHandler= ruleENotifiedHandler EOF
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
    // InternalAnsibleDsl.g:5512:1: ruleENotifiedHandler returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5518:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:5519:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalAnsibleDsl.g:5519:2: ( (otherlv_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:5520:3: (otherlv_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:5520:3: (otherlv_0= RULE_STRING )
            // InternalAnsibleDsl.g:5521:4: otherlv_0= RULE_STRING
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
    // InternalAnsibleDsl.g:5535:1: entryRuleENotifiedTopic returns [EObject current=null] : iv_ruleENotifiedTopic= ruleENotifiedTopic EOF ;
    public final EObject entryRuleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedTopic = null;


        try {
            // InternalAnsibleDsl.g:5535:55: (iv_ruleENotifiedTopic= ruleENotifiedTopic EOF )
            // InternalAnsibleDsl.g:5536:2: iv_ruleENotifiedTopic= ruleENotifiedTopic EOF
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
    // InternalAnsibleDsl.g:5542:1: ruleENotifiedTopic returns [EObject current=null] : (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5548:2: ( (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:5549:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:5549:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:5550:3: otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,127,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getENotifiedTopicAccess().getTopicKeyword_0());
            		
            // InternalAnsibleDsl.g:5554:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:5555:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:5555:4: (lv_name_1_0= RULE_STRING )
            // InternalAnsibleDsl.g:5556:5: lv_name_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleEValuePassed"
    // InternalAnsibleDsl.g:5576:1: entryRuleEValuePassed returns [EObject current=null] : iv_ruleEValuePassed= ruleEValuePassed EOF ;
    public final EObject entryRuleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassed = null;


        try {
            // InternalAnsibleDsl.g:5576:53: (iv_ruleEValuePassed= ruleEValuePassed EOF )
            // InternalAnsibleDsl.g:5577:2: iv_ruleEValuePassed= ruleEValuePassed EOF
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
    // InternalAnsibleDsl.g:5583:1: ruleEValuePassed returns [EObject current=null] : (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem ) ;
    public final EObject ruleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject this_EValue_0 = null;

        EObject this_EFactGathered_1 = null;

        EObject this_EItem_2 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5589:2: ( (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem ) )
            // InternalAnsibleDsl.g:5590:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem )
            {
            // InternalAnsibleDsl.g:5590:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem )
            int alt162=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_BOOLEAN:
            case RULE_INT:
            case RULE_NULL:
            case 133:
            case 137:
                {
                alt162=1;
                }
                break;
            case 128:
                {
                int LA162_2 = input.LA(2);

                if ( (LA162_2==129) ) {
                    alt162=3;
                }
                else if ( (LA162_2==RULE_STRING||LA162_2==RULE_ID) ) {
                    alt162=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 162, 2, input);

                    throw nvae;
                }
                }
                break;
            case 136:
                {
                alt162=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;
            }

            switch (alt162) {
                case 1 :
                    // InternalAnsibleDsl.g:5591:3: this_EValue_0= ruleEValue
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedAccess().getEValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EValue_0=ruleEValue();

                    state._fsp--;


                    			current = this_EValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5600:3: this_EFactGathered_1= ruleEFactGathered
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedAccess().getEFactGatheredParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFactGathered_1=ruleEFactGathered();

                    state._fsp--;


                    			current = this_EFactGathered_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:5609:3: this_EItem_2= ruleEItem
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedAccess().getEItemParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EItem_2=ruleEItem();

                    state._fsp--;


                    			current = this_EItem_2;
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


    // $ANTLR start "entryRuleEValue"
    // InternalAnsibleDsl.g:5621:1: entryRuleEValue returns [EObject current=null] : iv_ruleEValue= ruleEValue EOF ;
    public final EObject entryRuleEValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValue = null;


        try {
            // InternalAnsibleDsl.g:5621:47: (iv_ruleEValue= ruleEValue EOF )
            // InternalAnsibleDsl.g:5622:2: iv_ruleEValue= ruleEValue EOF
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
    // InternalAnsibleDsl.g:5628:1: ruleEValue returns [EObject current=null] : (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_EFilteredVariablesAndString_2= ruleEFilteredVariablesAndString | this_ESimpleValue_3= ruleESimpleValue ) ;
    public final EObject ruleEValue() throws RecognitionException {
        EObject current = null;

        EObject this_EDictionary_0 = null;

        EObject this_EList_1 = null;

        EObject this_EFilteredVariablesAndString_2 = null;

        EObject this_ESimpleValue_3 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5634:2: ( (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_EFilteredVariablesAndString_2= ruleEFilteredVariablesAndString | this_ESimpleValue_3= ruleESimpleValue ) )
            // InternalAnsibleDsl.g:5635:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_EFilteredVariablesAndString_2= ruleEFilteredVariablesAndString | this_ESimpleValue_3= ruleESimpleValue )
            {
            // InternalAnsibleDsl.g:5635:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_EFilteredVariablesAndString_2= ruleEFilteredVariablesAndString | this_ESimpleValue_3= ruleESimpleValue )
            int alt163=4;
            switch ( input.LA(1) ) {
            case 137:
                {
                alt163=1;
                }
                break;
            case 133:
                {
                alt163=2;
                }
                break;
            case RULE_STRING:
            case 128:
                {
                alt163=3;
                }
                break;
            case RULE_BOOLEAN:
            case RULE_INT:
            case RULE_NULL:
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
                    // InternalAnsibleDsl.g:5636:3: this_EDictionary_0= ruleEDictionary
                    {

                    			newCompositeNode(grammarAccess.getEValueAccess().getEDictionaryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EDictionary_0=ruleEDictionary();

                    state._fsp--;


                    			current = this_EDictionary_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5645:3: this_EList_1= ruleEList
                    {

                    			newCompositeNode(grammarAccess.getEValueAccess().getEListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EList_1=ruleEList();

                    state._fsp--;


                    			current = this_EList_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:5654:3: this_EFilteredVariablesAndString_2= ruleEFilteredVariablesAndString
                    {

                    			newCompositeNode(grammarAccess.getEValueAccess().getEFilteredVariablesAndStringParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFilteredVariablesAndString_2=ruleEFilteredVariablesAndString();

                    state._fsp--;


                    			current = this_EFilteredVariablesAndString_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAnsibleDsl.g:5663:3: this_ESimpleValue_3= ruleESimpleValue
                    {

                    			newCompositeNode(grammarAccess.getEValueAccess().getESimpleValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESimpleValue_3=ruleESimpleValue();

                    state._fsp--;


                    			current = this_ESimpleValue_3;
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


    // $ANTLR start "entryRuleESimpleValue"
    // InternalAnsibleDsl.g:5675:1: entryRuleESimpleValue returns [EObject current=null] : iv_ruleESimpleValue= ruleESimpleValue EOF ;
    public final EObject entryRuleESimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESimpleValue = null;


        try {
            // InternalAnsibleDsl.g:5675:53: (iv_ruleESimpleValue= ruleESimpleValue EOF )
            // InternalAnsibleDsl.g:5676:2: iv_ruleESimpleValue= ruleESimpleValue EOF
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
    // InternalAnsibleDsl.g:5682:1: ruleESimpleValue returns [EObject current=null] : ( ( (lv_value_string_0_0= RULE_BOOLEAN ) ) | ( (lv_value_string_1_0= RULE_NULL ) ) | ( (lv_value_int_2_0= RULE_INT ) ) ) ;
    public final EObject ruleESimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_string_0_0=null;
        Token lv_value_string_1_0=null;
        Token lv_value_int_2_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5688:2: ( ( ( (lv_value_string_0_0= RULE_BOOLEAN ) ) | ( (lv_value_string_1_0= RULE_NULL ) ) | ( (lv_value_int_2_0= RULE_INT ) ) ) )
            // InternalAnsibleDsl.g:5689:2: ( ( (lv_value_string_0_0= RULE_BOOLEAN ) ) | ( (lv_value_string_1_0= RULE_NULL ) ) | ( (lv_value_int_2_0= RULE_INT ) ) )
            {
            // InternalAnsibleDsl.g:5689:2: ( ( (lv_value_string_0_0= RULE_BOOLEAN ) ) | ( (lv_value_string_1_0= RULE_NULL ) ) | ( (lv_value_int_2_0= RULE_INT ) ) )
            int alt164=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt164=1;
                }
                break;
            case RULE_NULL:
                {
                alt164=2;
                }
                break;
            case RULE_INT:
                {
                alt164=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }

            switch (alt164) {
                case 1 :
                    // InternalAnsibleDsl.g:5690:3: ( (lv_value_string_0_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:5690:3: ( (lv_value_string_0_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:5691:4: (lv_value_string_0_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:5691:4: (lv_value_string_0_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:5692:5: lv_value_string_0_0= RULE_BOOLEAN
                    {
                    lv_value_string_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_value_string_0_0, grammarAccess.getESimpleValueAccess().getValue_stringBOOLEANTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_string",
                    						lv_value_string_0_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5709:3: ( (lv_value_string_1_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:5709:3: ( (lv_value_string_1_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:5710:4: (lv_value_string_1_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:5710:4: (lv_value_string_1_0= RULE_NULL )
                    // InternalAnsibleDsl.g:5711:5: lv_value_string_1_0= RULE_NULL
                    {
                    lv_value_string_1_0=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    					newLeafNode(lv_value_string_1_0, grammarAccess.getESimpleValueAccess().getValue_stringNULLTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_string",
                    						lv_value_string_1_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NULL");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:5728:3: ( (lv_value_int_2_0= RULE_INT ) )
                    {
                    // InternalAnsibleDsl.g:5728:3: ( (lv_value_int_2_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:5729:4: (lv_value_int_2_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:5729:4: (lv_value_int_2_0= RULE_INT )
                    // InternalAnsibleDsl.g:5730:5: lv_value_int_2_0= RULE_INT
                    {
                    lv_value_int_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_int_2_0, grammarAccess.getESimpleValueAccess().getValue_intINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_int",
                    						lv_value_int_2_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

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
    // InternalAnsibleDsl.g:5750:1: entryRuleEItem returns [EObject current=null] : iv_ruleEItem= ruleEItem EOF ;
    public final EObject entryRuleEItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEItem = null;


        try {
            // InternalAnsibleDsl.g:5750:46: (iv_ruleEItem= ruleEItem EOF )
            // InternalAnsibleDsl.g:5751:2: iv_ruleEItem= ruleEItem EOF
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
    // InternalAnsibleDsl.g:5757:1: ruleEItem returns [EObject current=null] : ( () otherlv_1= '{{' otherlv_2= 'item' (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )* (otherlv_5= '|' ( (lv_filter_commands_6_0= RULE_STRING ) ) )* otherlv_7= '}}' ) ;
    public final EObject ruleEItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_tail_4_0=null;
        Token otherlv_5=null;
        Token lv_filter_commands_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5763:2: ( ( () otherlv_1= '{{' otherlv_2= 'item' (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )* (otherlv_5= '|' ( (lv_filter_commands_6_0= RULE_STRING ) ) )* otherlv_7= '}}' ) )
            // InternalAnsibleDsl.g:5764:2: ( () otherlv_1= '{{' otherlv_2= 'item' (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )* (otherlv_5= '|' ( (lv_filter_commands_6_0= RULE_STRING ) ) )* otherlv_7= '}}' )
            {
            // InternalAnsibleDsl.g:5764:2: ( () otherlv_1= '{{' otherlv_2= 'item' (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )* (otherlv_5= '|' ( (lv_filter_commands_6_0= RULE_STRING ) ) )* otherlv_7= '}}' )
            // InternalAnsibleDsl.g:5765:3: () otherlv_1= '{{' otherlv_2= 'item' (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )* (otherlv_5= '|' ( (lv_filter_commands_6_0= RULE_STRING ) ) )* otherlv_7= '}}'
            {
            // InternalAnsibleDsl.g:5765:3: ()
            // InternalAnsibleDsl.g:5766:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEItemAccess().getEItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,128,FOLLOW_148); 

            			newLeafNode(otherlv_1, grammarAccess.getEItemAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,129,FOLLOW_149); 

            			newLeafNode(otherlv_2, grammarAccess.getEItemAccess().getItemKeyword_2());
            		
            // InternalAnsibleDsl.g:5780:3: (otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) ) )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==130) ) {
                    alt165=1;
                }


                switch (alt165) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5781:4: otherlv_3= '.' ( (lv_tail_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,130,FOLLOW_23); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEItemAccess().getFullStopKeyword_3_0());
            	    			
            	    // InternalAnsibleDsl.g:5785:4: ( (lv_tail_4_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:5786:5: (lv_tail_4_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:5786:5: (lv_tail_4_0= RULE_ID )
            	    // InternalAnsibleDsl.g:5787:6: lv_tail_4_0= RULE_ID
            	    {
            	    lv_tail_4_0=(Token)match(input,RULE_ID,FOLLOW_149); 

            	    						newLeafNode(lv_tail_4_0, grammarAccess.getEItemAccess().getTailIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEItemRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"tail",
            	    							lv_tail_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop165;
                }
            } while (true);

            // InternalAnsibleDsl.g:5804:3: (otherlv_5= '|' ( (lv_filter_commands_6_0= RULE_STRING ) ) )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==131) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5805:4: otherlv_5= '|' ( (lv_filter_commands_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,131,FOLLOW_4); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEItemAccess().getVerticalLineKeyword_4_0());
            	    			
            	    // InternalAnsibleDsl.g:5809:4: ( (lv_filter_commands_6_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:5810:5: (lv_filter_commands_6_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:5810:5: (lv_filter_commands_6_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:5811:6: lv_filter_commands_6_0= RULE_STRING
            	    {
            	    lv_filter_commands_6_0=(Token)match(input,RULE_STRING,FOLLOW_150); 

            	    						newLeafNode(lv_filter_commands_6_0, grammarAccess.getEItemAccess().getFilter_commandsSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEItemRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"filter_commands",
            	    							lv_filter_commands_6_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop166;
                }
            } while (true);

            otherlv_7=(Token)match(input,132,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEItemAccess().getRightCurlyBracketRightCurlyBracketKeyword_5());
            		

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
    // InternalAnsibleDsl.g:5836:1: entryRuleEDeclaredVariableReference returns [EObject current=null] : iv_ruleEDeclaredVariableReference= ruleEDeclaredVariableReference EOF ;
    public final EObject entryRuleEDeclaredVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDeclaredVariableReference = null;


        try {
            // InternalAnsibleDsl.g:5836:67: (iv_ruleEDeclaredVariableReference= ruleEDeclaredVariableReference EOF )
            // InternalAnsibleDsl.g:5837:2: iv_ruleEDeclaredVariableReference= ruleEDeclaredVariableReference EOF
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
    // InternalAnsibleDsl.g:5843:1: ruleEDeclaredVariableReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* ) ;
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
            // InternalAnsibleDsl.g:5849:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* ) )
            // InternalAnsibleDsl.g:5850:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* )
            {
            // InternalAnsibleDsl.g:5850:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* )
            // InternalAnsibleDsl.g:5851:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )*
            {
            // InternalAnsibleDsl.g:5851:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5852:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5852:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:5853:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDeclaredVariableReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_151); 

            					newLeafNode(otherlv_0, grammarAccess.getEDeclaredVariableReferenceAccess().getVariableEDeclaredVariableCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:5864:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==133) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalAnsibleDsl.g:5865:4: otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,133,FOLLOW_118); 

                    				newLeafNode(otherlv_1, grammarAccess.getEDeclaredVariableReferenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5869:4: ( (lv_index_2_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:5870:5: (lv_index_2_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:5870:5: (lv_index_2_0= RULE_INT )
                    // InternalAnsibleDsl.g:5871:6: lv_index_2_0= RULE_INT
                    {
                    lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_152); 

                    						newLeafNode(lv_index_2_0, grammarAccess.getEDeclaredVariableReferenceAccess().getIndexINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEDeclaredVariableReferenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index",
                    							lv_index_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,134,FOLLOW_153); 

                    				newLeafNode(otherlv_3, grammarAccess.getEDeclaredVariableReferenceAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:5892:3: (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )*
            loop168:
            do {
                int alt168=2;
                int LA168_0 = input.LA(1);

                if ( (LA168_0==130) ) {
                    alt168=1;
                }


                switch (alt168) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5893:4: otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) )
            	    {
            	    otherlv_4=(Token)match(input,130,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEDeclaredVariableReferenceAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5897:4: ( (lv_tail_5_0= ruleEDictionaryPairReference ) )
            	    // InternalAnsibleDsl.g:5898:5: (lv_tail_5_0= ruleEDictionaryPairReference )
            	    {
            	    // InternalAnsibleDsl.g:5898:5: (lv_tail_5_0= ruleEDictionaryPairReference )
            	    // InternalAnsibleDsl.g:5899:6: lv_tail_5_0= ruleEDictionaryPairReference
            	    {

            	    						newCompositeNode(grammarAccess.getEDeclaredVariableReferenceAccess().getTailEDictionaryPairReferenceParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_153);
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
            	    break loop168;
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


    // $ANTLR start "entryRuleEDeclaredVariableReferenceOrString"
    // InternalAnsibleDsl.g:5921:1: entryRuleEDeclaredVariableReferenceOrString returns [EObject current=null] : iv_ruleEDeclaredVariableReferenceOrString= ruleEDeclaredVariableReferenceOrString EOF ;
    public final EObject entryRuleEDeclaredVariableReferenceOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDeclaredVariableReferenceOrString = null;


        try {
            // InternalAnsibleDsl.g:5921:75: (iv_ruleEDeclaredVariableReferenceOrString= ruleEDeclaredVariableReferenceOrString EOF )
            // InternalAnsibleDsl.g:5922:2: iv_ruleEDeclaredVariableReferenceOrString= ruleEDeclaredVariableReferenceOrString EOF
            {
             newCompositeNode(grammarAccess.getEDeclaredVariableReferenceOrStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDeclaredVariableReferenceOrString=ruleEDeclaredVariableReferenceOrString();

            state._fsp--;

             current =iv_ruleEDeclaredVariableReferenceOrString; 
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
    // $ANTLR end "entryRuleEDeclaredVariableReferenceOrString"


    // $ANTLR start "ruleEDeclaredVariableReferenceOrString"
    // InternalAnsibleDsl.g:5928:1: ruleEDeclaredVariableReferenceOrString returns [EObject current=null] : (this_EDeclaredVariableReference_0= ruleEDeclaredVariableReference | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEDeclaredVariableReferenceOrString() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject this_EDeclaredVariableReference_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5934:2: ( (this_EDeclaredVariableReference_0= ruleEDeclaredVariableReference | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:5935:2: (this_EDeclaredVariableReference_0= ruleEDeclaredVariableReference | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:5935:2: (this_EDeclaredVariableReference_0= ruleEDeclaredVariableReference | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==RULE_ID) ) {
                alt169=1;
            }
            else if ( (LA169_0==RULE_STRING) ) {
                alt169=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;
            }
            switch (alt169) {
                case 1 :
                    // InternalAnsibleDsl.g:5936:3: this_EDeclaredVariableReference_0= ruleEDeclaredVariableReference
                    {

                    			newCompositeNode(grammarAccess.getEDeclaredVariableReferenceOrStringAccess().getEDeclaredVariableReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EDeclaredVariableReference_0=ruleEDeclaredVariableReference();

                    state._fsp--;


                    			current = this_EDeclaredVariableReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5945:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:5945:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:5946:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:5946:4: (lv_string_1_0= RULE_STRING )
                    // InternalAnsibleDsl.g:5947:5: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_1_0, grammarAccess.getEDeclaredVariableReferenceOrStringAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEDeclaredVariableReferenceOrStringRule());
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
    // $ANTLR end "ruleEDeclaredVariableReferenceOrString"


    // $ANTLR start "entryRuleEFilteredVariable"
    // InternalAnsibleDsl.g:5967:1: entryRuleEFilteredVariable returns [EObject current=null] : iv_ruleEFilteredVariable= ruleEFilteredVariable EOF ;
    public final EObject entryRuleEFilteredVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredVariable = null;


        try {
            // InternalAnsibleDsl.g:5967:58: (iv_ruleEFilteredVariable= ruleEFilteredVariable EOF )
            // InternalAnsibleDsl.g:5968:2: iv_ruleEFilteredVariable= ruleEFilteredVariable EOF
            {
             newCompositeNode(grammarAccess.getEFilteredVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFilteredVariable=ruleEFilteredVariable();

            state._fsp--;

             current =iv_ruleEFilteredVariable; 
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
    // $ANTLR end "entryRuleEFilteredVariable"


    // $ANTLR start "ruleEFilteredVariable"
    // InternalAnsibleDsl.g:5974:1: ruleEFilteredVariable returns [EObject current=null] : (otherlv_0= '{{' ( (lv_variable_reference_or_string_1_0= ruleEDeclaredVariableReferenceOrString ) )+ otherlv_2= '}}' ) ;
    public final EObject ruleEFilteredVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_variable_reference_or_string_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5980:2: ( (otherlv_0= '{{' ( (lv_variable_reference_or_string_1_0= ruleEDeclaredVariableReferenceOrString ) )+ otherlv_2= '}}' ) )
            // InternalAnsibleDsl.g:5981:2: (otherlv_0= '{{' ( (lv_variable_reference_or_string_1_0= ruleEDeclaredVariableReferenceOrString ) )+ otherlv_2= '}}' )
            {
            // InternalAnsibleDsl.g:5981:2: (otherlv_0= '{{' ( (lv_variable_reference_or_string_1_0= ruleEDeclaredVariableReferenceOrString ) )+ otherlv_2= '}}' )
            // InternalAnsibleDsl.g:5982:3: otherlv_0= '{{' ( (lv_variable_reference_or_string_1_0= ruleEDeclaredVariableReferenceOrString ) )+ otherlv_2= '}}'
            {
            otherlv_0=(Token)match(input,128,FOLLOW_154); 

            			newLeafNode(otherlv_0, grammarAccess.getEFilteredVariableAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:5986:3: ( (lv_variable_reference_or_string_1_0= ruleEDeclaredVariableReferenceOrString ) )+
            int cnt170=0;
            loop170:
            do {
                int alt170=2;
                int LA170_0 = input.LA(1);

                if ( (LA170_0==RULE_STRING||LA170_0==RULE_ID) ) {
                    alt170=1;
                }


                switch (alt170) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5987:4: (lv_variable_reference_or_string_1_0= ruleEDeclaredVariableReferenceOrString )
            	    {
            	    // InternalAnsibleDsl.g:5987:4: (lv_variable_reference_or_string_1_0= ruleEDeclaredVariableReferenceOrString )
            	    // InternalAnsibleDsl.g:5988:5: lv_variable_reference_or_string_1_0= ruleEDeclaredVariableReferenceOrString
            	    {

            	    					newCompositeNode(grammarAccess.getEFilteredVariableAccess().getVariable_reference_or_stringEDeclaredVariableReferenceOrStringParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_155);
            	    lv_variable_reference_or_string_1_0=ruleEDeclaredVariableReferenceOrString();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEFilteredVariableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variable_reference_or_string",
            	    						lv_variable_reference_or_string_1_0,
            	    						"org.sodalite.sdl.ansible.AnsibleDsl.EDeclaredVariableReferenceOrString");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt170 >= 1 ) break loop170;
                        EarlyExitException eee =
                            new EarlyExitException(170, input);
                        throw eee;
                }
                cnt170++;
            } while (true);

            otherlv_2=(Token)match(input,132,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEFilteredVariableAccess().getRightCurlyBracketRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleEFilteredVariable"


    // $ANTLR start "entryRuleEFilteredVariableOrString"
    // InternalAnsibleDsl.g:6013:1: entryRuleEFilteredVariableOrString returns [EObject current=null] : iv_ruleEFilteredVariableOrString= ruleEFilteredVariableOrString EOF ;
    public final EObject entryRuleEFilteredVariableOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredVariableOrString = null;


        try {
            // InternalAnsibleDsl.g:6013:66: (iv_ruleEFilteredVariableOrString= ruleEFilteredVariableOrString EOF )
            // InternalAnsibleDsl.g:6014:2: iv_ruleEFilteredVariableOrString= ruleEFilteredVariableOrString EOF
            {
             newCompositeNode(grammarAccess.getEFilteredVariableOrStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFilteredVariableOrString=ruleEFilteredVariableOrString();

            state._fsp--;

             current =iv_ruleEFilteredVariableOrString; 
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
    // $ANTLR end "entryRuleEFilteredVariableOrString"


    // $ANTLR start "ruleEFilteredVariableOrString"
    // InternalAnsibleDsl.g:6020:1: ruleEFilteredVariableOrString returns [EObject current=null] : (this_EFilteredVariable_0= ruleEFilteredVariable | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEFilteredVariableOrString() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject this_EFilteredVariable_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6026:2: ( (this_EFilteredVariable_0= ruleEFilteredVariable | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:6027:2: (this_EFilteredVariable_0= ruleEFilteredVariable | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:6027:2: (this_EFilteredVariable_0= ruleEFilteredVariable | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==128) ) {
                alt171=1;
            }
            else if ( (LA171_0==RULE_STRING) ) {
                alt171=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 171, 0, input);

                throw nvae;
            }
            switch (alt171) {
                case 1 :
                    // InternalAnsibleDsl.g:6028:3: this_EFilteredVariable_0= ruleEFilteredVariable
                    {

                    			newCompositeNode(grammarAccess.getEFilteredVariableOrStringAccess().getEFilteredVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFilteredVariable_0=ruleEFilteredVariable();

                    state._fsp--;


                    			current = this_EFilteredVariable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:6037:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:6037:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:6038:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:6038:4: (lv_string_1_0= RULE_STRING )
                    // InternalAnsibleDsl.g:6039:5: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_1_0, grammarAccess.getEFilteredVariableOrStringAccess().getStringSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEFilteredVariableOrStringRule());
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
    // $ANTLR end "ruleEFilteredVariableOrString"


    // $ANTLR start "entryRuleEFilteredVariablesAndString"
    // InternalAnsibleDsl.g:6059:1: entryRuleEFilteredVariablesAndString returns [EObject current=null] : iv_ruleEFilteredVariablesAndString= ruleEFilteredVariablesAndString EOF ;
    public final EObject entryRuleEFilteredVariablesAndString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredVariablesAndString = null;


        try {
            // InternalAnsibleDsl.g:6059:68: (iv_ruleEFilteredVariablesAndString= ruleEFilteredVariablesAndString EOF )
            // InternalAnsibleDsl.g:6060:2: iv_ruleEFilteredVariablesAndString= ruleEFilteredVariablesAndString EOF
            {
             newCompositeNode(grammarAccess.getEFilteredVariablesAndStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFilteredVariablesAndString=ruleEFilteredVariablesAndString();

            state._fsp--;

             current =iv_ruleEFilteredVariablesAndString; 
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
    // $ANTLR end "entryRuleEFilteredVariablesAndString"


    // $ANTLR start "ruleEFilteredVariablesAndString"
    // InternalAnsibleDsl.g:6066:1: ruleEFilteredVariablesAndString returns [EObject current=null] : ( ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) ) ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )* ) ;
    public final EObject ruleEFilteredVariablesAndString() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_and_string_0_0 = null;

        EObject lv_variable_and_string_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6072:2: ( ( ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) ) ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )* ) )
            // InternalAnsibleDsl.g:6073:2: ( ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) ) ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )* )
            {
            // InternalAnsibleDsl.g:6073:2: ( ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) ) ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )* )
            // InternalAnsibleDsl.g:6074:3: ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) ) ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )*
            {
            // InternalAnsibleDsl.g:6074:3: ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) )
            // InternalAnsibleDsl.g:6075:4: (lv_variable_and_string_0_0= ruleEFilteredVariableOrString )
            {
            // InternalAnsibleDsl.g:6075:4: (lv_variable_and_string_0_0= ruleEFilteredVariableOrString )
            // InternalAnsibleDsl.g:6076:5: lv_variable_and_string_0_0= ruleEFilteredVariableOrString
            {

            					newCompositeNode(grammarAccess.getEFilteredVariablesAndStringAccess().getVariable_and_stringEFilteredVariableOrStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_156);
            lv_variable_and_string_0_0=ruleEFilteredVariableOrString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEFilteredVariablesAndStringRule());
            					}
            					add(
            						current,
            						"variable_and_string",
            						lv_variable_and_string_0_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EFilteredVariableOrString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:6093:3: ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )*
            loop172:
            do {
                int alt172=2;
                int LA172_0 = input.LA(1);

                if ( (LA172_0==RULE_STRING||LA172_0==128) ) {
                    alt172=1;
                }


                switch (alt172) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6094:4: (lv_variable_and_string_1_0= ruleEFilteredVariableOrString )
            	    {
            	    // InternalAnsibleDsl.g:6094:4: (lv_variable_and_string_1_0= ruleEFilteredVariableOrString )
            	    // InternalAnsibleDsl.g:6095:5: lv_variable_and_string_1_0= ruleEFilteredVariableOrString
            	    {

            	    					newCompositeNode(grammarAccess.getEFilteredVariablesAndStringAccess().getVariable_and_stringEFilteredVariableOrStringParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_156);
            	    lv_variable_and_string_1_0=ruleEFilteredVariableOrString();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEFilteredVariablesAndStringRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variable_and_string",
            	    						lv_variable_and_string_1_0,
            	    						"org.sodalite.sdl.ansible.AnsibleDsl.EFilteredVariableOrString");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop172;
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
    // $ANTLR end "ruleEFilteredVariablesAndString"


    // $ANTLR start "entryRuleEDictionaryPairReference"
    // InternalAnsibleDsl.g:6116:1: entryRuleEDictionaryPairReference returns [EObject current=null] : iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF ;
    public final EObject entryRuleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPairReference = null;


        try {
            // InternalAnsibleDsl.g:6116:65: (iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF )
            // InternalAnsibleDsl.g:6117:2: iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF
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
    // InternalAnsibleDsl.g:6123:1: ruleEDictionaryPairReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6129:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )? ) )
            // InternalAnsibleDsl.g:6130:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )? )
            {
            // InternalAnsibleDsl.g:6130:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )? )
            // InternalAnsibleDsl.g:6131:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )?
            {
            // InternalAnsibleDsl.g:6131:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6132:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6132:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:6133:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDictionaryPairReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_157); 

            					newLeafNode(otherlv_0, grammarAccess.getEDictionaryPairReferenceAccess().getNameEDictionaryPairCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6144:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']' )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( (LA173_0==133) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalAnsibleDsl.g:6145:4: otherlv_1= '[' ( (lv_index_2_0= RULE_INT ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,133,FOLLOW_118); 

                    				newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairReferenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6149:4: ( (lv_index_2_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:6150:5: (lv_index_2_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:6150:5: (lv_index_2_0= RULE_INT )
                    // InternalAnsibleDsl.g:6151:6: lv_index_2_0= RULE_INT
                    {
                    lv_index_2_0=(Token)match(input,RULE_INT,FOLLOW_152); 

                    						newLeafNode(lv_index_2_0, grammarAccess.getEDictionaryPairReferenceAccess().getIndexINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEDictionaryPairReferenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index",
                    							lv_index_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,134,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:6176:1: entryRuleEVariableDeclaration returns [EObject current=null] : iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF ;
    public final EObject entryRuleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclaration = null;


        try {
            // InternalAnsibleDsl.g:6176:61: (iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF )
            // InternalAnsibleDsl.g:6177:2: iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF
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
    // InternalAnsibleDsl.g:6183:1: ruleEVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6189:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:6190:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:6190:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:6191:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:6191:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6192:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6192:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6193:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_91); 

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

            otherlv_1=(Token)match(input,60,FOLLOW_158); 

            			newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:6213:3: ( (lv_value_passed_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6214:4: (lv_value_passed_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6214:4: (lv_value_passed_2_0= ruleEValue )
            // InternalAnsibleDsl.g:6215:5: lv_value_passed_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:6236:1: entryRuleERegisterVariable returns [EObject current=null] : iv_ruleERegisterVariable= ruleERegisterVariable EOF ;
    public final EObject entryRuleERegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariable = null;


        try {
            // InternalAnsibleDsl.g:6236:58: (iv_ruleERegisterVariable= ruleERegisterVariable EOF )
            // InternalAnsibleDsl.g:6237:2: iv_ruleERegisterVariable= ruleERegisterVariable EOF
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
    // InternalAnsibleDsl.g:6243:1: ruleERegisterVariable returns [EObject current=null] : (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleERegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6249:2: ( (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:6250:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:6250:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6251:3: otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,135,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableAccess().getRegisterKeyword_0());
            		
            // InternalAnsibleDsl.g:6255:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6256:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6256:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:6257:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleEFactGathered"
    // InternalAnsibleDsl.g:6277:1: entryRuleEFactGathered returns [EObject current=null] : iv_ruleEFactGathered= ruleEFactGathered EOF ;
    public final EObject entryRuleEFactGathered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactGathered = null;


        try {
            // InternalAnsibleDsl.g:6277:54: (iv_ruleEFactGathered= ruleEFactGathered EOF )
            // InternalAnsibleDsl.g:6278:2: iv_ruleEFactGathered= ruleEFactGathered EOF
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
    // InternalAnsibleDsl.g:6284:1: ruleEFactGathered returns [EObject current=null] : ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEFactGathered() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tail_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6290:2: ( ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:6291:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:6291:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:6292:3: () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            {
            // InternalAnsibleDsl.g:6292:3: ()
            // InternalAnsibleDsl.g:6293:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactGatheredAccess().getEFactGatheredAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,136,FOLLOW_153); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactGatheredAccess().getAnsible_factsKeyword_1());
            		
            // InternalAnsibleDsl.g:6303:3: (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            loop174:
            do {
                int alt174=2;
                int LA174_0 = input.LA(1);

                if ( (LA174_0==130) ) {
                    alt174=1;
                }


                switch (alt174) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6304:4: otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,130,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEFactGatheredAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6308:4: ( (lv_tail_3_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:6309:5: (lv_tail_3_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:6309:5: (lv_tail_3_0= RULE_ID )
            	    // InternalAnsibleDsl.g:6310:6: lv_tail_3_0= RULE_ID
            	    {
            	    lv_tail_3_0=(Token)match(input,RULE_ID,FOLLOW_153); 

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
            	    break loop174;
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
    // InternalAnsibleDsl.g:6331:1: entryRuleEDictionary returns [EObject current=null] : iv_ruleEDictionary= ruleEDictionary EOF ;
    public final EObject entryRuleEDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionary = null;


        try {
            // InternalAnsibleDsl.g:6331:52: (iv_ruleEDictionary= ruleEDictionary EOF )
            // InternalAnsibleDsl.g:6332:2: iv_ruleEDictionary= ruleEDictionary EOF
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
    // InternalAnsibleDsl.g:6338:1: ruleEDictionary returns [EObject current=null] : (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dictionary_pairs_1_0 = null;

        EObject lv_dictionary_pairs_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6344:2: ( (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:6345:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:6345:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:6346:3: otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,137,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getEDictionaryAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:6350:3: ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) )
            // InternalAnsibleDsl.g:6351:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            {
            // InternalAnsibleDsl.g:6351:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            // InternalAnsibleDsl.g:6352:5: lv_dictionary_pairs_1_0= ruleEDictionaryPair
            {

            					newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalAnsibleDsl.g:6369:3: (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )*
            loop175:
            do {
                int alt175=2;
                int LA175_0 = input.LA(1);

                if ( (LA175_0==31) ) {
                    alt175=1;
                }


                switch (alt175) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6370:4: otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEDictionaryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6374:4: ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    // InternalAnsibleDsl.g:6375:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    {
            	    // InternalAnsibleDsl.g:6375:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    // InternalAnsibleDsl.g:6376:6: lv_dictionary_pairs_3_0= ruleEDictionaryPair
            	    {

            	    						newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop175;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:6402:1: entryRuleEDictionaryPair returns [EObject current=null] : iv_ruleEDictionaryPair= ruleEDictionaryPair EOF ;
    public final EObject entryRuleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPair = null;


        try {
            // InternalAnsibleDsl.g:6402:56: (iv_ruleEDictionaryPair= ruleEDictionaryPair EOF )
            // InternalAnsibleDsl.g:6403:2: iv_ruleEDictionaryPair= ruleEDictionaryPair EOF
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
    // InternalAnsibleDsl.g:6409:1: ruleEDictionaryPair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6415:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:6416:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:6416:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:6417:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:6417:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6418:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6418:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6419:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_91); 

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

            otherlv_1=(Token)match(input,60,FOLLOW_158); 

            			newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:6439:3: ( (lv_value_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6440:4: (lv_value_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6440:4: (lv_value_2_0= ruleEValue )
            // InternalAnsibleDsl.g:6441:5: lv_value_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:6462:1: entryRuleEList returns [EObject current=null] : iv_ruleEList= ruleEList EOF ;
    public final EObject entryRuleEList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEList = null;


        try {
            // InternalAnsibleDsl.g:6462:46: (iv_ruleEList= ruleEList EOF )
            // InternalAnsibleDsl.g:6463:2: iv_ruleEList= ruleEList EOF
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
    // InternalAnsibleDsl.g:6469:1: ruleEList returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6475:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) )
            // InternalAnsibleDsl.g:6476:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            {
            // InternalAnsibleDsl.g:6476:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            // InternalAnsibleDsl.g:6477:3: otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,133,FOLLOW_158); 

            			newLeafNode(otherlv_0, grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:6481:3: ( (lv_elements_1_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6482:4: (lv_elements_1_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6482:4: (lv_elements_1_0= ruleEValue )
            // InternalAnsibleDsl.g:6483:5: lv_elements_1_0= ruleEValue
            {

            					newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_159);
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

            // InternalAnsibleDsl.g:6500:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )*
            loop176:
            do {
                int alt176=2;
                int LA176_0 = input.LA(1);

                if ( (LA176_0==31) ) {
                    alt176=1;
                }


                switch (alt176) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6501:4: otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) )
            	    {
            	    otherlv_2=(Token)match(input,31,FOLLOW_158); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6505:4: ( (lv_elements_3_0= ruleEValue ) )
            	    // InternalAnsibleDsl.g:6506:5: (lv_elements_3_0= ruleEValue )
            	    {
            	    // InternalAnsibleDsl.g:6506:5: (lv_elements_3_0= ruleEValue )
            	    // InternalAnsibleDsl.g:6507:6: lv_elements_3_0= ruleEValue
            	    {

            	    						newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_159);
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
            	    break loop176;
                }
            } while (true);

            otherlv_4=(Token)match(input,134,FOLLOW_2); 

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
    static final String dfa_3s = "\1\21\12\uffff";
    static final String dfa_4s = "\1\165\12\uffff";
    static final String dfa_5s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\1\0\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\16\uffff\1\3\1\5\1\6\1\7\1\10\1\12\53\uffff\1\11\42\uffff\1\4",
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
            return "()+ loopback of 312:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+";
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
                        if ( (LA24_0==EOF||LA24_0==17) ) {s = 1;}

                        else if ( LA24_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA24_0 == 117 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA24_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA24_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA24_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA24_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA24_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {s = 10;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000007E00040000L,0x0020000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000007F7C1C0002L,0x0020004820040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000007F7C1C0002L,0x0020004800040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007F7C1C0002L,0x0020004000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007F7C1C0002L,0x0020000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000007F7C140002L,0x0020000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007F7C040002L,0x0020000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000007F78040002L,0x0020000000040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000007F70040002L,0x0020000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000007F60040002L,0x0020000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007F40040002L,0x0020000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000007F00040002L,0x0020000000040000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000020000L,0x00007C0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000007E00040002L,0x0020000000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L,0x0007800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001020000020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000001FE00040002L,0x0020000000040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000017E00040002L,0x0020000000040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0080000000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000038027C180000L,0x0400004820000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000038027C180000L,0x0400004800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000038027C180000L,0x0400004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000038027C180000L,0x0400000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000038027C100000L,0x0400000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000038027C000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000380278000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000380270000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000380260000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000380240000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000380200000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000020000L,0x0000600000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000300200000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000300200000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000000001B0L,0x0000000000001010L,0x0000000000000321L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000200200000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000020000L,0x0003800000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000C00000020000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000800000020000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x003C18027C180000L,0x0400004820000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x003C18027C180000L,0x0400004800000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x003C18027C180000L,0x0400004000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x003C18027C180000L,0x0400000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x003C18027C100000L,0x0400000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x003C18027C000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x003C180278000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x003C180270000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x003C180260000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x003C180240000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x003C180200000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x003C100200000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x003C100200000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x003C000200000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000020000L,0x001B800000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0040000000020000L,0x000000001C080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000010L,0x8000000000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000020010L,0x800000001C080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0240000000020000L,0x000000001C080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0200000000020010L,0x800000001C080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0200000000020000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0200000000020000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x00000000000001B0L,0x0000000000000000L,0x0000000000000321L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FE0L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x000018007C1A0000L,0x0400004820000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x000018007C1A0000L,0x0400004800000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x000018007C1A0000L,0x0400004000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x000018007C1A0000L,0x0400000000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x000018007C120000L,0x0400000000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x000018007C020000L,0x0400000000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000180078020000L,0x0400000000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000180070020000L,0x0400000000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000180060020000L,0x0400000000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000180040020000L,0x0400000000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000180000020000L,0x0400000000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000100000020000L,0x0400000000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000100000020000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000020000L,0x0000000003E00000L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000020000L,0x0000000003C00000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000020000L,0x0000000003800000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000020000L,0x0000000003000000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000020000L,0x0000000002000000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000002L,0x000000001C000000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000020000L,0x00000007C0000000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000020000L,0x0000000780000000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000020000L,0x0000000700000000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000020000L,0x0000000600000000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000020000L,0x0000003000000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000020000L,0x0000002000000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000020000L,0x0000038000000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000020000L,0x0000030000000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000020000L,0x0000020000000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000002L,0x0000780000000000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000002L,0x0000700000000000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000002L,0x0000600000000000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000000002L,0x0003000000000000L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000000002L,0x0003800000000000L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000000002L,0x0013800000000000L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000000020000L,0x03C0000000000000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000020000L,0x0380000000000000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000020000L,0x0300000000000000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000020000L,0x0200000000000000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000020000L,0x1000000000000000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000000002L,0x6000000000000000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x0000000000000050L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_156 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x00000000000001B0L,0x0000000000000000L,0x0000000000000221L});
    public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000040L});

}
