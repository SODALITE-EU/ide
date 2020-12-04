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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'playbook{'", "'playbook_name:'", "'plays{'", "'play{'", "'}'", "'play_name:'", "'base_settings{'", "'play_exe_settings{'", "'error_handling{'", "'vars_files:'", "'vars_prompt:'", "'force_handlers:'", "'pre_tasks{'", "'tasks_list{'", "'post_tasks{'", "'handlers{'", "'block{'", "'block_name:'", "'execution_settings{'", "'tasks{'", "'rescue_tasks{'", "'always_tasks{'", "'task{'", "'task_name:'", "'task_settings{'", "'handler{'", "'handler_name:'", "'listen:'", "'exe_settings{'", "'when:'", "'action:'", "'asynchronous_settings{'", "'args:'", "'module_call{'", "'notify:'", "'module_name:'", "'parameters{'", "':'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'is'", "'not'", "'skipped'", "'failed'", "'succeeded'", "'fail'", "'success'", "'defined'", "'undefined'", "'('", "')'", "'and'", "'or'", "'role{'", "'role_name:'", "'roles_inclusions{'", "'loop:'", "'loop_control{'", "'label:'", "'pause:'", "'index_var:'", "'loop_var:'", "'extended:'", "'until:'", "'retries:'", "'delay:'", "'privilage_escalation{'", "'become:'", "'become_exe:'", "'become_flags:'", "'become_method:'", "'become_user:'", "'validation_mode{'", "'check_mode:'", "'diff:'", "'connection_info{'", "'connection:'", "'port:'", "'remote_user:'", "'strategy:'", "'serial:'", "'order:'", "'throttle:'", "'run_once:'", "'any_errors_fatal:'", "'ignore_errors:'", "'ignore_unreachable:'", "'max_fail_percentage:'", "'changed_when:'", "'failed_when:'", "'no_log:'", "'debugger:'", "'always'", "'never'", "'on_failed'", "'on_unreachable'", "'on_skipped'", "'module_defaults:'", "'environment:'", "'collections:'", "'tags:'", "'vars{'", "','", "'facts_setttings{'", "'gather_facts:'", "'gather_subset:'", "'gather_timeout:'", "'fact_path:'", "'delegation{'", "'delegate_to:'", "'delegate_facts:'", "'async:'", "'poll:'", "'topic:'", "'{{'", "'.'", "'|'", "'}}'", "'register:'", "'ansible_facts'", "'{'", "'['", "']'"
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
            case 29:
                {
                alt2=1;
                }
                break;
            case 35:
            case 38:
                {
                alt2=2;
                }
                break;
            case 70:
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

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==35) ) {
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

            if ( (LA4_0==35) ) {
                alt4=1;
            }
            else if ( (LA4_0==38) ) {
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
    // InternalAnsibleDsl.g:299:1: ruleEPlay returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEPlay() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_force_handlers_18_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject lv_base_common_keywords_4_0 = null;

        EObject lv_play_exe_settings_7_0 = null;

        EObject lv_error_handling_10_0 = null;

        EObject lv_facts_settings_12_0 = null;

        EObject lv_vars_files_14_0 = null;

        EObject lv_vars_prompt_16_0 = null;

        EObject lv_pre_tasks_list_20_0 = null;

        EObject lv_roles_inclusions_22_0 = null;

        EObject lv_tasks_list_24_0 = null;

        EObject lv_post_tasks_list_27_0 = null;

        EObject lv_handlers_30_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:305:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:306:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:306:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:307:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:307:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:308:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:311:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:312:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:312:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=10;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // InternalAnsibleDsl.g:313:3: ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:313:3: ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:314:4: {...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:314:99: ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:315:5: ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:318:8: ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) )
            	    // InternalAnsibleDsl.g:318:9: {...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:318:18: ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? )
            	    // InternalAnsibleDsl.g:318:19: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )?
            	    {
            	    // InternalAnsibleDsl.g:318:19: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==18) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
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
            	            break;

            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_11); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPlayAccess().getBase_settingsKeyword_0_1());
            	    							
            	    // InternalAnsibleDsl.g:346:8: ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) )
            	    // InternalAnsibleDsl.g:347:9: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            	    {
            	    // InternalAnsibleDsl.g:347:9: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            	    // InternalAnsibleDsl.g:348:10: lv_base_common_keywords_4_0= ruleEBaseCommonKeywords
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getBase_common_keywordsEBaseCommonKeywordsParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_base_common_keywords_4_0=ruleEBaseCommonKeywords();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"base_common_keywords",
            	    											lv_base_common_keywords_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBaseCommonKeywords");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_5=(Token)match(input,17,FOLLOW_12); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_0_3());
            	    							
            	    // InternalAnsibleDsl.g:369:8: (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==20) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:370:9: otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}'
            	            {
            	            otherlv_6=(Token)match(input,20,FOLLOW_13); 

            	            									newLeafNode(otherlv_6, grammarAccess.getEPlayAccess().getPlay_exe_settingsKeyword_0_4_0());
            	            								
            	            // InternalAnsibleDsl.g:374:9: ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) )
            	            // InternalAnsibleDsl.g:375:10: (lv_play_exe_settings_7_0= ruleEPlayExeSettings )
            	            {
            	            // InternalAnsibleDsl.g:375:10: (lv_play_exe_settings_7_0= ruleEPlayExeSettings )
            	            // InternalAnsibleDsl.g:376:11: lv_play_exe_settings_7_0= ruleEPlayExeSettings
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getPlay_exe_settingsEPlayExeSettingsParserRuleCall_0_4_1_0());
            	            										
            	            pushFollow(FOLLOW_8);
            	            lv_play_exe_settings_7_0=ruleEPlayExeSettings();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            											}
            	            											set(
            	            												current,
            	            												"play_exe_settings",
            	            												lv_play_exe_settings_7_0,
            	            												"org.sodalite.sdl.ansible.AnsibleDsl.EPlayExeSettings");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            otherlv_8=(Token)match(input,17,FOLLOW_14); 

            	            									newLeafNode(otherlv_8, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_0_4_2());
            	            								

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
            	    // InternalAnsibleDsl.g:404:3: ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:404:3: ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:405:4: {...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:405:99: ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) )
            	    // InternalAnsibleDsl.g:406:5: ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:409:8: ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) )
            	    // InternalAnsibleDsl.g:409:9: {...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:409:18: (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' )
            	    // InternalAnsibleDsl.g:409:19: otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_15); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPlayAccess().getError_handlingKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:413:8: ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) )
            	    // InternalAnsibleDsl.g:414:9: (lv_error_handling_10_0= ruleEPlayErrorHandling )
            	    {
            	    // InternalAnsibleDsl.g:414:9: (lv_error_handling_10_0= ruleEPlayErrorHandling )
            	    // InternalAnsibleDsl.g:415:10: lv_error_handling_10_0= ruleEPlayErrorHandling
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getError_handlingEPlayErrorHandlingParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_error_handling_10_0=ruleEPlayErrorHandling();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"error_handling",
            	    											lv_error_handling_10_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EPlayErrorHandling");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_11=(Token)match(input,17,FOLLOW_14); 

            	    								newLeafNode(otherlv_11, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:442:3: ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:442:3: ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) )
            	    // InternalAnsibleDsl.g:443:4: {...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:443:99: ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) )
            	    // InternalAnsibleDsl.g:444:5: ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:447:8: ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) )
            	    // InternalAnsibleDsl.g:447:9: {...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:447:18: ( (lv_facts_settings_12_0= ruleEFactsSettings ) )
            	    // InternalAnsibleDsl.g:447:19: (lv_facts_settings_12_0= ruleEFactsSettings )
            	    {
            	    // InternalAnsibleDsl.g:447:19: (lv_facts_settings_12_0= ruleEFactsSettings )
            	    // InternalAnsibleDsl.g:448:9: lv_facts_settings_12_0= ruleEFactsSettings
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getFacts_settingsEFactsSettingsParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_14);
            	    lv_facts_settings_12_0=ruleEFactsSettings();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    									}
            	    									set(
            	    										current,
            	    										"facts_settings",
            	    										lv_facts_settings_12_0,
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
            	    // InternalAnsibleDsl.g:470:3: ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:470:3: ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:471:4: {...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:471:99: ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:472:5: ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:475:8: ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:475:9: {...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:475:18: (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:475:19: otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) )
            	    {
            	    otherlv_13=(Token)match(input,22,FOLLOW_16); 

            	    								newLeafNode(otherlv_13, grammarAccess.getEPlayAccess().getVars_filesKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:479:8: ( (lv_vars_files_14_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:480:9: (lv_vars_files_14_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:480:9: (lv_vars_files_14_0= ruleEList )
            	    // InternalAnsibleDsl.g:481:10: lv_vars_files_14_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_filesEListParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_vars_files_14_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"vars_files",
            	    											lv_vars_files_14_0,
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
            	    // InternalAnsibleDsl.g:504:3: ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:504:3: ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:505:4: {...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:505:99: ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:506:5: ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:509:8: ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:509:9: {...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:509:18: (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:509:19: otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) )
            	    {
            	    otherlv_15=(Token)match(input,23,FOLLOW_16); 

            	    								newLeafNode(otherlv_15, grammarAccess.getEPlayAccess().getVars_promptKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:513:8: ( (lv_vars_prompt_16_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:514:9: (lv_vars_prompt_16_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:514:9: (lv_vars_prompt_16_0= ruleEList )
            	    // InternalAnsibleDsl.g:515:10: lv_vars_prompt_16_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_promptEListParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_vars_prompt_16_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"vars_prompt",
            	    											lv_vars_prompt_16_0,
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
            	    // InternalAnsibleDsl.g:538:3: ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:538:3: ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:539:4: {...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:539:99: ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:540:5: ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:543:8: ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:543:9: {...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:543:18: (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:543:19: otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_17=(Token)match(input,24,FOLLOW_17); 

            	    								newLeafNode(otherlv_17, grammarAccess.getEPlayAccess().getForce_handlersKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:547:8: ( (lv_force_handlers_18_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:548:9: (lv_force_handlers_18_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:548:9: (lv_force_handlers_18_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:549:10: lv_force_handlers_18_0= RULE_BOOLEAN
            	    {
            	    lv_force_handlers_18_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_14); 

            	    										newLeafNode(lv_force_handlers_18_0, grammarAccess.getEPlayAccess().getForce_handlersBOOLEANTerminalRuleCall_5_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPlayRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"force_handlers",
            	    											lv_force_handlers_18_0,
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
            	    // InternalAnsibleDsl.g:571:3: ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:571:3: ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:572:4: {...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:572:99: ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) )
            	    // InternalAnsibleDsl.g:573:5: ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:576:8: ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) )
            	    // InternalAnsibleDsl.g:576:9: {...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:576:18: (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' )
            	    // InternalAnsibleDsl.g:576:19: otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}'
            	    {
            	    otherlv_19=(Token)match(input,25,FOLLOW_18); 

            	    								newLeafNode(otherlv_19, grammarAccess.getEPlayAccess().getPre_tasksKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:580:8: ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==29||LA7_0==35) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:581:9: (lv_pre_tasks_list_20_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:581:9: (lv_pre_tasks_list_20_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:582:10: lv_pre_tasks_list_20_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getPre_tasks_listEBlockTaskParserRuleCall_6_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_pre_tasks_list_20_0=ruleEBlockTask();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"pre_tasks_list",
            	    	    											lv_pre_tasks_list_20_0,
            	    	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBlockTask");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

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

            	    otherlv_21=(Token)match(input,17,FOLLOW_14); 

            	    								newLeafNode(otherlv_21, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_6_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAnsibleDsl.g:609:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:609:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) )
            	    // InternalAnsibleDsl.g:610:4: {...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:610:99: ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) )
            	    // InternalAnsibleDsl.g:611:5: ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:614:8: ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) )
            	    // InternalAnsibleDsl.g:614:9: {...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:614:18: ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) )
            	    // InternalAnsibleDsl.g:614:19: (lv_roles_inclusions_22_0= ruleERoleInclusions )
            	    {
            	    // InternalAnsibleDsl.g:614:19: (lv_roles_inclusions_22_0= ruleERoleInclusions )
            	    // InternalAnsibleDsl.g:615:9: lv_roles_inclusions_22_0= ruleERoleInclusions
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getRoles_inclusionsERoleInclusionsParserRuleCall_7_0());
            	    								
            	    pushFollow(FOLLOW_14);
            	    lv_roles_inclusions_22_0=ruleERoleInclusions();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    									}
            	    									set(
            	    										current,
            	    										"roles_inclusions",
            	    										lv_roles_inclusions_22_0,
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
            	    // InternalAnsibleDsl.g:637:3: ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:637:3: ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:638:4: {...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAnsibleDsl.g:638:99: ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:639:5: ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAnsibleDsl.g:642:8: ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) )
            	    // InternalAnsibleDsl.g:642:9: {...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:642:18: (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? )
            	    // InternalAnsibleDsl.g:642:19: otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )?
            	    {
            	    otherlv_23=(Token)match(input,26,FOLLOW_18); 

            	    								newLeafNode(otherlv_23, grammarAccess.getEPlayAccess().getTasks_listKeyword_8_0());
            	    							
            	    // InternalAnsibleDsl.g:646:8: ( (lv_tasks_list_24_0= ruleEBlockTask ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==29||LA8_0==35) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:647:9: (lv_tasks_list_24_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:647:9: (lv_tasks_list_24_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:648:10: lv_tasks_list_24_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getTasks_listEBlockTaskParserRuleCall_8_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_tasks_list_24_0=ruleEBlockTask();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"tasks_list",
            	    	    											lv_tasks_list_24_0,
            	    	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBlockTask");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	    otherlv_25=(Token)match(input,17,FOLLOW_20); 

            	    								newLeafNode(otherlv_25, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_2());
            	    							
            	    // InternalAnsibleDsl.g:669:8: (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==27) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:670:9: otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}'
            	            {
            	            otherlv_26=(Token)match(input,27,FOLLOW_18); 

            	            									newLeafNode(otherlv_26, grammarAccess.getEPlayAccess().getPost_tasksKeyword_8_3_0());
            	            								
            	            // InternalAnsibleDsl.g:674:9: ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+
            	            int cnt9=0;
            	            loop9:
            	            do {
            	                int alt9=2;
            	                int LA9_0 = input.LA(1);

            	                if ( (LA9_0==29||LA9_0==35) ) {
            	                    alt9=1;
            	                }


            	                switch (alt9) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:675:10: (lv_post_tasks_list_27_0= ruleEBlockTask )
            	            	    {
            	            	    // InternalAnsibleDsl.g:675:10: (lv_post_tasks_list_27_0= ruleEBlockTask )
            	            	    // InternalAnsibleDsl.g:676:11: lv_post_tasks_list_27_0= ruleEBlockTask
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getEPlayAccess().getPost_tasks_listEBlockTaskParserRuleCall_8_3_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_19);
            	            	    lv_post_tasks_list_27_0=ruleEBlockTask();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"post_tasks_list",
            	            	    												lv_post_tasks_list_27_0,
            	            	    												"org.sodalite.sdl.ansible.AnsibleDsl.EBlockTask");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

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

            	            otherlv_28=(Token)match(input,17,FOLLOW_21); 

            	            									newLeafNode(otherlv_28, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_3_2());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:698:8: (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==28) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:699:9: otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}'
            	            {
            	            otherlv_29=(Token)match(input,28,FOLLOW_22); 

            	            									newLeafNode(otherlv_29, grammarAccess.getEPlayAccess().getHandlersKeyword_8_4_0());
            	            								
            	            // InternalAnsibleDsl.g:703:9: ( (lv_handlers_30_0= ruleEHandler ) )+
            	            int cnt11=0;
            	            loop11:
            	            do {
            	                int alt11=2;
            	                int LA11_0 = input.LA(1);

            	                if ( (LA11_0==38) ) {
            	                    alt11=1;
            	                }


            	                switch (alt11) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:704:10: (lv_handlers_30_0= ruleEHandler )
            	            	    {
            	            	    // InternalAnsibleDsl.g:704:10: (lv_handlers_30_0= ruleEHandler )
            	            	    // InternalAnsibleDsl.g:705:11: lv_handlers_30_0= ruleEHandler
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getEPlayAccess().getHandlersEHandlerParserRuleCall_8_4_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_23);
            	            	    lv_handlers_30_0=ruleEHandler();

            	            	    state._fsp--;


            	            	    											if (current==null) {
            	            	    												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            	    											}
            	            	    											add(
            	            	    												current,
            	            	    												"handlers",
            	            	    												lv_handlers_30_0,
            	            	    												"org.sodalite.sdl.ansible.AnsibleDsl.EHandler");
            	            	    											afterParserOrEnumRuleCall();
            	            	    										

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt11 >= 1 ) break loop11;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(11, input);
            	                        throw eee;
            	                }
            	                cnt11++;
            	            } while (true);

            	            otherlv_31=(Token)match(input,17,FOLLOW_14); 

            	            									newLeafNode(otherlv_31, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_4_2());
            	            								

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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // InternalAnsibleDsl.g:744:1: entryRuleEBlock returns [EObject current=null] : iv_ruleEBlock= ruleEBlock EOF ;
    public final EObject entryRuleEBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlock = null;


        try {
            // InternalAnsibleDsl.g:744:47: (iv_ruleEBlock= ruleEBlock EOF )
            // InternalAnsibleDsl.g:745:2: iv_ruleEBlock= ruleEBlock EOF
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
    // InternalAnsibleDsl.g:751:1: ruleEBlock returns [EObject current=null] : (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleEBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_base_common_keywords_4_0 = null;

        EObject lv_exe_common_keywords_7_0 = null;

        EObject lv_error_handling_10_0 = null;

        EObject lv_tasks_13_0 = null;

        EObject lv_rescue_tasks_16_0 = null;

        EObject lv_always_tasks_19_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:757:2: ( (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalAnsibleDsl.g:758:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalAnsibleDsl.g:758:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' )
            // InternalAnsibleDsl.g:759:3: otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEBlockAccess().getBlockKeyword_0());
            		
            // InternalAnsibleDsl.g:763:3: (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAnsibleDsl.g:764:4: otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEBlockAccess().getBlock_nameKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:768:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:769:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:769:5: (lv_name_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:770:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEBlockAccess().getBase_settingsKeyword_2());
            		
            // InternalAnsibleDsl.g:791:3: ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) )
            // InternalAnsibleDsl.g:792:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            {
            // InternalAnsibleDsl.g:792:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            // InternalAnsibleDsl.g:793:5: lv_base_common_keywords_4_0= ruleEBaseCommonKeywords
            {

            					newCompositeNode(grammarAccess.getEBlockAccess().getBase_common_keywordsEBaseCommonKeywordsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_base_common_keywords_4_0=ruleEBaseCommonKeywords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEBlockRule());
            					}
            					set(
            						current,
            						"base_common_keywords",
            						lv_base_common_keywords_4_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EBaseCommonKeywords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getEBlockAccess().getExecution_settingsKeyword_5());
            		
            // InternalAnsibleDsl.g:818:3: ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) )
            // InternalAnsibleDsl.g:819:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            {
            // InternalAnsibleDsl.g:819:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            // InternalAnsibleDsl.g:820:5: lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords
            {

            					newCompositeNode(grammarAccess.getEBlockAccess().getExe_common_keywordsEExecutionCommonKeywordsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_exe_common_keywords_7_0=ruleEExecutionCommonKeywords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEBlockRule());
            					}
            					set(
            						current,
            						"exe_common_keywords",
            						lv_exe_common_keywords_7_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionCommonKeywords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalAnsibleDsl.g:841:3: (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnsibleDsl.g:842:4: otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getEBlockAccess().getError_handlingKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:846:4: ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) )
                    // InternalAnsibleDsl.g:847:5: (lv_error_handling_10_0= ruleEBlockErrorHandling )
                    {
                    // InternalAnsibleDsl.g:847:5: (lv_error_handling_10_0= ruleEBlockErrorHandling )
                    // InternalAnsibleDsl.g:848:6: lv_error_handling_10_0= ruleEBlockErrorHandling
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getError_handlingEBlockErrorHandlingParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_error_handling_10_0=ruleEBlockErrorHandling();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"error_handling",
                    							lv_error_handling_10_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EBlockErrorHandling");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_29); 

                    				newLeafNode(otherlv_11, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_8_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,32,FOLLOW_18); 

            			newLeafNode(otherlv_12, grammarAccess.getEBlockAccess().getTasksKeyword_9());
            		
            // InternalAnsibleDsl.g:874:3: ( (lv_tasks_13_0= ruleETask ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalAnsibleDsl.g:875:4: (lv_tasks_13_0= ruleETask )
            	    {
            	    // InternalAnsibleDsl.g:875:4: (lv_tasks_13_0= ruleETask )
            	    // InternalAnsibleDsl.g:876:5: lv_tasks_13_0= ruleETask
            	    {

            	    					newCompositeNode(grammarAccess.getEBlockAccess().getTasksETaskParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_tasks_13_0=ruleETask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_13_0,
            	    						"org.sodalite.sdl.ansible.AnsibleDsl.ETask");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_14=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalAnsibleDsl.g:897:3: (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAnsibleDsl.g:898:4: otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getEBlockAccess().getRescue_tasksKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:902:4: ( (lv_rescue_tasks_16_0= ruleETask ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==35) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:903:5: (lv_rescue_tasks_16_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:903:5: (lv_rescue_tasks_16_0= ruleETask )
                    	    // InternalAnsibleDsl.g:904:6: lv_rescue_tasks_16_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getRescue_tasksETaskParserRuleCall_12_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_rescue_tasks_16_0=ruleETask();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"rescue_tasks",
                    	    							lv_rescue_tasks_16_0,
                    	    							"org.sodalite.sdl.ansible.AnsibleDsl.ETask");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_31); 

                    				newLeafNode(otherlv_17, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:926:3: (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAnsibleDsl.g:927:4: otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}'
                    {
                    otherlv_18=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getEBlockAccess().getAlways_tasksKeyword_13_0());
                    			
                    // InternalAnsibleDsl.g:931:4: ( (lv_always_tasks_19_0= ruleETask ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==35) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:932:5: (lv_always_tasks_19_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:932:5: (lv_always_tasks_19_0= ruleETask )
                    	    // InternalAnsibleDsl.g:933:6: lv_always_tasks_19_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getAlways_tasksETaskParserRuleCall_13_1_0());
                    	    					
                    	    pushFollow(FOLLOW_19);
                    	    lv_always_tasks_19_0=ruleETask();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"always_tasks",
                    	    							lv_always_tasks_19_0,
                    	    							"org.sodalite.sdl.ansible.AnsibleDsl.ETask");
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

                    otherlv_20=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_20, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_13_2());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalAnsibleDsl.g:963:1: entryRuleETask returns [EObject current=null] : iv_ruleETask= ruleETask EOF ;
    public final EObject entryRuleETask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETask = null;


        try {
            // InternalAnsibleDsl.g:963:46: (iv_ruleETask= ruleETask EOF )
            // InternalAnsibleDsl.g:964:2: iv_ruleETask= ruleETask EOF
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
    // InternalAnsibleDsl.g:970:1: ruleETask returns [EObject current=null] : (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' otherlv_12= '}' ) ;
    public final EObject ruleETask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_base_common_keywords_4_0 = null;

        EObject lv_exe_common_keywords_7_0 = null;

        EObject lv_task_handler_common_keywords_10_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:976:2: ( (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:977:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:977:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' otherlv_12= '}' )
            // InternalAnsibleDsl.g:978:3: otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getETaskAccess().getTaskKeyword_0());
            		
            // InternalAnsibleDsl.g:982:3: (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAnsibleDsl.g:983:4: otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getETaskAccess().getTask_nameKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:987:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:988:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:988:5: (lv_name_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:989:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getETaskAccess().getBase_settingsKeyword_2());
            		
            // InternalAnsibleDsl.g:1010:3: ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) )
            // InternalAnsibleDsl.g:1011:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            {
            // InternalAnsibleDsl.g:1011:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            // InternalAnsibleDsl.g:1012:5: lv_base_common_keywords_4_0= ruleEBaseCommonKeywords
            {

            					newCompositeNode(grammarAccess.getETaskAccess().getBase_common_keywordsEBaseCommonKeywordsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_base_common_keywords_4_0=ruleEBaseCommonKeywords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETaskRule());
            					}
            					set(
            						current,
            						"base_common_keywords",
            						lv_base_common_keywords_4_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EBaseCommonKeywords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getETaskAccess().getExecution_settingsKeyword_5());
            		
            // InternalAnsibleDsl.g:1037:3: ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) )
            // InternalAnsibleDsl.g:1038:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            {
            // InternalAnsibleDsl.g:1038:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            // InternalAnsibleDsl.g:1039:5: lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords
            {

            					newCompositeNode(grammarAccess.getETaskAccess().getExe_common_keywordsEExecutionCommonKeywordsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_exe_common_keywords_7_0=ruleEExecutionCommonKeywords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETaskRule());
            					}
            					set(
            						current,
            						"exe_common_keywords",
            						lv_exe_common_keywords_7_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionCommonKeywords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_8, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,37,FOLLOW_34); 

            			newLeafNode(otherlv_9, grammarAccess.getETaskAccess().getTask_settingsKeyword_8());
            		
            // InternalAnsibleDsl.g:1064:3: ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) )
            // InternalAnsibleDsl.g:1065:4: (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords )
            {
            // InternalAnsibleDsl.g:1065:4: (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords )
            // InternalAnsibleDsl.g:1066:5: lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords
            {

            					newCompositeNode(grammarAccess.getETaskAccess().getTask_handler_common_keywordsETaskHandlerCommonKeywordsParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_task_handler_common_keywords_10_0=ruleETaskHandlerCommonKeywords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETaskRule());
            					}
            					set(
            						current,
            						"task_handler_common_keywords",
            						lv_task_handler_common_keywords_10_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.ETaskHandlerCommonKeywords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_12=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalAnsibleDsl.g:1095:1: entryRuleEHandler returns [EObject current=null] : iv_ruleEHandler= ruleEHandler EOF ;
    public final EObject entryRuleEHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHandler = null;


        try {
            // InternalAnsibleDsl.g:1095:49: (iv_ruleEHandler= ruleEHandler EOF )
            // InternalAnsibleDsl.g:1096:2: iv_ruleEHandler= ruleEHandler EOF
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
    // InternalAnsibleDsl.g:1102:1: ruleEHandler returns [EObject current=null] : (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )? otherlv_14= '}' ) ;
    public final EObject ruleEHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_base_common_keywords_4_0 = null;

        EObject lv_exe_common_keywords_7_0 = null;

        EObject lv_task_handler_common_keywords_10_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1108:2: ( (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )? otherlv_14= '}' ) )
            // InternalAnsibleDsl.g:1109:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )? otherlv_14= '}' )
            {
            // InternalAnsibleDsl.g:1109:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )? otherlv_14= '}' )
            // InternalAnsibleDsl.g:1110:3: otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getEHandlerAccess().getHandlerKeyword_0());
            		
            // InternalAnsibleDsl.g:1114:3: (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAnsibleDsl.g:1115:4: otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEHandlerAccess().getHandler_nameKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:1119:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:1120:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:1120:5: (lv_name_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:1121:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEHandlerAccess().getBase_settingsKeyword_2());
            		
            // InternalAnsibleDsl.g:1142:3: ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) )
            // InternalAnsibleDsl.g:1143:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            {
            // InternalAnsibleDsl.g:1143:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            // InternalAnsibleDsl.g:1144:5: lv_base_common_keywords_4_0= ruleEBaseCommonKeywords
            {

            					newCompositeNode(grammarAccess.getEHandlerAccess().getBase_common_keywordsEBaseCommonKeywordsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_base_common_keywords_4_0=ruleEBaseCommonKeywords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEHandlerRule());
            					}
            					set(
            						current,
            						"base_common_keywords",
            						lv_base_common_keywords_4_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EBaseCommonKeywords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getEHandlerAccess().getExecution_settingsKeyword_5());
            		
            // InternalAnsibleDsl.g:1169:3: ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) )
            // InternalAnsibleDsl.g:1170:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            {
            // InternalAnsibleDsl.g:1170:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            // InternalAnsibleDsl.g:1171:5: lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords
            {

            					newCompositeNode(grammarAccess.getEHandlerAccess().getExe_common_keywordsEExecutionCommonKeywordsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_exe_common_keywords_7_0=ruleEExecutionCommonKeywords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEHandlerRule());
            					}
            					set(
            						current,
            						"exe_common_keywords",
            						lv_exe_common_keywords_7_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionCommonKeywords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_33); 

            			newLeafNode(otherlv_8, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,37,FOLLOW_34); 

            			newLeafNode(otherlv_9, grammarAccess.getEHandlerAccess().getTask_settingsKeyword_8());
            		
            // InternalAnsibleDsl.g:1196:3: ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) )
            // InternalAnsibleDsl.g:1197:4: (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords )
            {
            // InternalAnsibleDsl.g:1197:4: (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords )
            // InternalAnsibleDsl.g:1198:5: lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords
            {

            					newCompositeNode(grammarAccess.getEHandlerAccess().getTask_handler_common_keywordsETaskHandlerCommonKeywordsParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_task_handler_common_keywords_10_0=ruleETaskHandlerCommonKeywords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEHandlerRule());
            					}
            					set(
            						current,
            						"task_handler_common_keywords",
            						lv_task_handler_common_keywords_10_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.ETaskHandlerCommonKeywords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_36); 

            			newLeafNode(otherlv_11, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_10());
            		
            // InternalAnsibleDsl.g:1219:3: (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAnsibleDsl.g:1220:4: otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getEHandlerAccess().getListenKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:1224:4: ( (otherlv_13= RULE_STRING ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_STRING) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1225:5: (otherlv_13= RULE_STRING )
                    	    {
                    	    // InternalAnsibleDsl.g:1225:5: (otherlv_13= RULE_STRING )
                    	    // InternalAnsibleDsl.g:1226:6: otherlv_13= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEHandlerRule());
                    	    						}
                    	    					
                    	    otherlv_13=(Token)match(input,RULE_STRING,FOLLOW_37); 

                    	    						newLeafNode(otherlv_13, grammarAccess.getEHandlerAccess().getListen_toENotifiedTopicCrossReference_11_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleEExecutionCommonKeywords"
    // InternalAnsibleDsl.g:1246:1: entryRuleEExecutionCommonKeywords returns [EObject current=null] : iv_ruleEExecutionCommonKeywords= ruleEExecutionCommonKeywords EOF ;
    public final EObject entryRuleEExecutionCommonKeywords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionCommonKeywords = null;


        try {
            // InternalAnsibleDsl.g:1246:65: (iv_ruleEExecutionCommonKeywords= ruleEExecutionCommonKeywords EOF )
            // InternalAnsibleDsl.g:1247:2: iv_ruleEExecutionCommonKeywords= ruleEExecutionCommonKeywords EOF
            {
             newCompositeNode(grammarAccess.getEExecutionCommonKeywordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEExecutionCommonKeywords=ruleEExecutionCommonKeywords();

            state._fsp--;

             current =iv_ruleEExecutionCommonKeywords; 
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
    // $ANTLR end "entryRuleEExecutionCommonKeywords"


    // $ANTLR start "ruleEExecutionCommonKeywords"
    // InternalAnsibleDsl.g:1253:1: ruleEExecutionCommonKeywords returns [EObject current=null] : ( () (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )? ( (lv_delegation_4_0= ruleEDelegation ) )? (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )? ) ;
    public final EObject ruleEExecutionCommonKeywords() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exe_settings_2_0 = null;

        EObject lv_delegation_4_0 = null;

        EObject lv_when_expression_6_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1259:2: ( ( () (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )? ( (lv_delegation_4_0= ruleEDelegation ) )? (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )? ) )
            // InternalAnsibleDsl.g:1260:2: ( () (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )? ( (lv_delegation_4_0= ruleEDelegation ) )? (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:1260:2: ( () (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )? ( (lv_delegation_4_0= ruleEDelegation ) )? (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )? )
            // InternalAnsibleDsl.g:1261:3: () (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )? ( (lv_delegation_4_0= ruleEDelegation ) )? (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )?
            {
            // InternalAnsibleDsl.g:1261:3: ()
            // InternalAnsibleDsl.g:1262:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEExecutionCommonKeywordsAccess().getEExecutionCommonKeywordsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:1268:3: (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAnsibleDsl.g:1269:4: otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getEExecutionCommonKeywordsAccess().getExe_settingsKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:1273:4: ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:1274:5: (lv_exe_settings_2_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:1274:5: (lv_exe_settings_2_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:1275:6: lv_exe_settings_2_0= ruleEExecutionExeSettings
                    {

                    						newCompositeNode(grammarAccess.getEExecutionCommonKeywordsAccess().getExe_settingsEExecutionExeSettingsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_exe_settings_2_0=ruleEExecutionExeSettings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEExecutionCommonKeywordsRule());
                    						}
                    						set(
                    							current,
                    							"exe_settings",
                    							lv_exe_settings_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionExeSettings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getEExecutionCommonKeywordsAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1297:3: ( (lv_delegation_4_0= ruleEDelegation ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==125) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAnsibleDsl.g:1298:4: (lv_delegation_4_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:1298:4: (lv_delegation_4_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:1299:5: lv_delegation_4_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getEExecutionCommonKeywordsAccess().getDelegationEDelegationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_delegation_4_0=ruleEDelegation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEExecutionCommonKeywordsRule());
                    					}
                    					set(
                    						current,
                    						"delegation",
                    						lv_delegation_4_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EDelegation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1316:3: (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAnsibleDsl.g:1317:4: otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getEExecutionCommonKeywordsAccess().getWhenKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:1321:4: ( (lv_when_expression_6_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:1322:5: (lv_when_expression_6_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:1322:5: (lv_when_expression_6_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:1323:6: lv_when_expression_6_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getEExecutionCommonKeywordsAccess().getWhen_expressionEConditionalExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_when_expression_6_0=ruleEConditionalExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEExecutionCommonKeywordsRule());
                    						}
                    						set(
                    							current,
                    							"when_expression",
                    							lv_when_expression_6_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EConditionalExpression");
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
    // $ANTLR end "ruleEExecutionCommonKeywords"


    // $ANTLR start "entryRuleETaskHandlerCommonKeywords"
    // InternalAnsibleDsl.g:1345:1: entryRuleETaskHandlerCommonKeywords returns [EObject current=null] : iv_ruleETaskHandlerCommonKeywords= ruleETaskHandlerCommonKeywords EOF ;
    public final EObject entryRuleETaskHandlerCommonKeywords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerCommonKeywords = null;


        try {
            // InternalAnsibleDsl.g:1345:67: (iv_ruleETaskHandlerCommonKeywords= ruleETaskHandlerCommonKeywords EOF )
            // InternalAnsibleDsl.g:1346:2: iv_ruleETaskHandlerCommonKeywords= ruleETaskHandlerCommonKeywords EOF
            {
             newCompositeNode(grammarAccess.getETaskHandlerCommonKeywordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETaskHandlerCommonKeywords=ruleETaskHandlerCommonKeywords();

            state._fsp--;

             current =iv_ruleETaskHandlerCommonKeywords; 
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
    // $ANTLR end "entryRuleETaskHandlerCommonKeywords"


    // $ANTLR start "ruleETaskHandlerCommonKeywords"
    // InternalAnsibleDsl.g:1352:1: ruleETaskHandlerCommonKeywords returns [EObject current=null] : ( () (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )? (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )? (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )? (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )? otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )? ( (lv_loop_16_0= ruleELoop ) )? ( (lv_register_17_0= ruleERegisterVariable ) )? ) ;
    public final EObject ruleETaskHandlerCommonKeywords() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_action_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_error_handling_2_0 = null;

        EObject lv_asynchronous_settings_7_0 = null;

        EObject lv_args_10_0 = null;

        EObject lv_module_12_0 = null;

        EObject lv_notifiables_15_0 = null;

        EObject lv_loop_16_0 = null;

        EObject lv_register_17_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1358:2: ( ( () (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )? (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )? (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )? (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )? otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )? ( (lv_loop_16_0= ruleELoop ) )? ( (lv_register_17_0= ruleERegisterVariable ) )? ) )
            // InternalAnsibleDsl.g:1359:2: ( () (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )? (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )? (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )? (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )? otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )? ( (lv_loop_16_0= ruleELoop ) )? ( (lv_register_17_0= ruleERegisterVariable ) )? )
            {
            // InternalAnsibleDsl.g:1359:2: ( () (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )? (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )? (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )? (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )? otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )? ( (lv_loop_16_0= ruleELoop ) )? ( (lv_register_17_0= ruleERegisterVariable ) )? )
            // InternalAnsibleDsl.g:1360:3: () (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )? (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )? (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )? (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )? otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )? ( (lv_loop_16_0= ruleELoop ) )? ( (lv_register_17_0= ruleERegisterVariable ) )?
            {
            // InternalAnsibleDsl.g:1360:3: ()
            // InternalAnsibleDsl.g:1361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETaskHandlerCommonKeywordsAccess().getETaskHandlerCommonKeywordsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:1367:3: (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAnsibleDsl.g:1368:4: otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getETaskHandlerCommonKeywordsAccess().getError_handlingKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:1372:4: ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) )
                    // InternalAnsibleDsl.g:1373:5: (lv_error_handling_2_0= ruleETaskHandlerErrorHandling )
                    {
                    // InternalAnsibleDsl.g:1373:5: (lv_error_handling_2_0= ruleETaskHandlerErrorHandling )
                    // InternalAnsibleDsl.g:1374:6: lv_error_handling_2_0= ruleETaskHandlerErrorHandling
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerCommonKeywordsAccess().getError_handlingETaskHandlerErrorHandlingParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_error_handling_2_0=ruleETaskHandlerErrorHandling();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskHandlerCommonKeywordsRule());
                    						}
                    						set(
                    							current,
                    							"error_handling",
                    							lv_error_handling_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.ETaskHandlerErrorHandling");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_43); 

                    				newLeafNode(otherlv_3, grammarAccess.getETaskHandlerCommonKeywordsAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1396:3: (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAnsibleDsl.g:1397:4: otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETaskHandlerCommonKeywordsAccess().getActionKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:1401:4: ( (lv_action_5_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:1402:5: (lv_action_5_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:1402:5: (lv_action_5_0= RULE_STRING )
                    // InternalAnsibleDsl.g:1403:6: lv_action_5_0= RULE_STRING
                    {
                    lv_action_5_0=(Token)match(input,RULE_STRING,FOLLOW_44); 

                    						newLeafNode(lv_action_5_0, grammarAccess.getETaskHandlerCommonKeywordsAccess().getActionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getETaskHandlerCommonKeywordsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"action",
                    							lv_action_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1420:3: (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnsibleDsl.g:1421:4: otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_45); 

                    				newLeafNode(otherlv_6, grammarAccess.getETaskHandlerCommonKeywordsAccess().getAsynchronous_settingsKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:1425:4: ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) )
                    // InternalAnsibleDsl.g:1426:5: (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings )
                    {
                    // InternalAnsibleDsl.g:1426:5: (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings )
                    // InternalAnsibleDsl.g:1427:6: lv_asynchronous_settings_7_0= ruleEAsynchronousSettings
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerCommonKeywordsAccess().getAsynchronous_settingsEAsynchronousSettingsParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_asynchronous_settings_7_0=ruleEAsynchronousSettings();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskHandlerCommonKeywordsRule());
                    						}
                    						set(
                    							current,
                    							"asynchronous_settings",
                    							lv_asynchronous_settings_7_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EAsynchronousSettings");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_46); 

                    				newLeafNode(otherlv_8, grammarAccess.getETaskHandlerCommonKeywordsAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1449:3: (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnsibleDsl.g:1450:4: otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) )
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_47); 

                    				newLeafNode(otherlv_9, grammarAccess.getETaskHandlerCommonKeywordsAccess().getArgsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:1454:4: ( (lv_args_10_0= ruleEDictionary ) )
                    // InternalAnsibleDsl.g:1455:5: (lv_args_10_0= ruleEDictionary )
                    {
                    // InternalAnsibleDsl.g:1455:5: (lv_args_10_0= ruleEDictionary )
                    // InternalAnsibleDsl.g:1456:6: lv_args_10_0= ruleEDictionary
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerCommonKeywordsAccess().getArgsEDictionaryParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_args_10_0=ruleEDictionary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskHandlerCommonKeywordsRule());
                    						}
                    						set(
                    							current,
                    							"args",
                    							lv_args_10_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EDictionary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,46,FOLLOW_49); 

            			newLeafNode(otherlv_11, grammarAccess.getETaskHandlerCommonKeywordsAccess().getModule_callKeyword_5());
            		
            // InternalAnsibleDsl.g:1478:3: ( (lv_module_12_0= ruleEModuleCall ) )
            // InternalAnsibleDsl.g:1479:4: (lv_module_12_0= ruleEModuleCall )
            {
            // InternalAnsibleDsl.g:1479:4: (lv_module_12_0= ruleEModuleCall )
            // InternalAnsibleDsl.g:1480:5: lv_module_12_0= ruleEModuleCall
            {

            					newCompositeNode(grammarAccess.getETaskHandlerCommonKeywordsAccess().getModuleEModuleCallParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_module_12_0=ruleEModuleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETaskHandlerCommonKeywordsRule());
            					}
            					set(
            						current,
            						"module",
            						lv_module_12_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EModuleCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_50); 

            			newLeafNode(otherlv_13, grammarAccess.getETaskHandlerCommonKeywordsAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalAnsibleDsl.g:1501:3: (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnsibleDsl.g:1502:4: otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+
                    {
                    otherlv_14=(Token)match(input,47,FOLLOW_51); 

                    				newLeafNode(otherlv_14, grammarAccess.getETaskHandlerCommonKeywordsAccess().getNotifyKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:1506:4: ( (lv_notifiables_15_0= ruleENotifiable ) )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==RULE_STRING||LA32_0==130) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1507:5: (lv_notifiables_15_0= ruleENotifiable )
                    	    {
                    	    // InternalAnsibleDsl.g:1507:5: (lv_notifiables_15_0= ruleENotifiable )
                    	    // InternalAnsibleDsl.g:1508:6: lv_notifiables_15_0= ruleENotifiable
                    	    {

                    	    						newCompositeNode(grammarAccess.getETaskHandlerCommonKeywordsAccess().getNotifiablesENotifiableParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_52);
                    	    lv_notifiables_15_0=ruleENotifiable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getETaskHandlerCommonKeywordsRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"notifiables",
                    	    							lv_notifiables_15_0,
                    	    							"org.sodalite.sdl.ansible.AnsibleDsl.ENotifiable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1526:3: ( (lv_loop_16_0= ruleELoop ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==73||(LA34_0>=80 && LA34_0<=82)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAnsibleDsl.g:1527:4: (lv_loop_16_0= ruleELoop )
                    {
                    // InternalAnsibleDsl.g:1527:4: (lv_loop_16_0= ruleELoop )
                    // InternalAnsibleDsl.g:1528:5: lv_loop_16_0= ruleELoop
                    {

                    					newCompositeNode(grammarAccess.getETaskHandlerCommonKeywordsAccess().getLoopELoopParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_53);
                    lv_loop_16_0=ruleELoop();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getETaskHandlerCommonKeywordsRule());
                    					}
                    					set(
                    						current,
                    						"loop",
                    						lv_loop_16_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.ELoop");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1545:3: ( (lv_register_17_0= ruleERegisterVariable ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==135) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAnsibleDsl.g:1546:4: (lv_register_17_0= ruleERegisterVariable )
                    {
                    // InternalAnsibleDsl.g:1546:4: (lv_register_17_0= ruleERegisterVariable )
                    // InternalAnsibleDsl.g:1547:5: lv_register_17_0= ruleERegisterVariable
                    {

                    					newCompositeNode(grammarAccess.getETaskHandlerCommonKeywordsAccess().getRegisterERegisterVariableParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_register_17_0=ruleERegisterVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getETaskHandlerCommonKeywordsRule());
                    					}
                    					set(
                    						current,
                    						"register",
                    						lv_register_17_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.ERegisterVariable");
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
    // $ANTLR end "ruleETaskHandlerCommonKeywords"


    // $ANTLR start "entryRuleEModuleCall"
    // InternalAnsibleDsl.g:1568:1: entryRuleEModuleCall returns [EObject current=null] : iv_ruleEModuleCall= ruleEModuleCall EOF ;
    public final EObject entryRuleEModuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModuleCall = null;


        try {
            // InternalAnsibleDsl.g:1568:52: (iv_ruleEModuleCall= ruleEModuleCall EOF )
            // InternalAnsibleDsl.g:1569:2: iv_ruleEModuleCall= ruleEModuleCall EOF
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
    // InternalAnsibleDsl.g:1575:1: ruleEModuleCall returns [EObject current=null] : (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) ;
    public final EObject ruleEModuleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1581:2: ( (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:1582:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:1582:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:1583:3: otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getEModuleCallAccess().getModule_nameKeyword_0());
            		
            // InternalAnsibleDsl.g:1587:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:1588:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:1588:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:1589:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_55); 

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

            otherlv_2=(Token)match(input,49,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getEModuleCallAccess().getParametersKeyword_2());
            		
            // InternalAnsibleDsl.g:1609:3: ( (lv_parameters_3_0= ruleEParameter ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAnsibleDsl.g:1610:4: (lv_parameters_3_0= ruleEParameter )
            	    {
            	    // InternalAnsibleDsl.g:1610:4: (lv_parameters_3_0= ruleEParameter )
            	    // InternalAnsibleDsl.g:1611:5: lv_parameters_3_0= ruleEParameter
            	    {

            	    					newCompositeNode(grammarAccess.getEModuleCallAccess().getParametersEParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_56);
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
            	    break loop36;
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
    // InternalAnsibleDsl.g:1636:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalAnsibleDsl.g:1636:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalAnsibleDsl.g:1637:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalAnsibleDsl.g:1643:1: ruleEParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1649:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) )
            // InternalAnsibleDsl.g:1650:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            {
            // InternalAnsibleDsl.g:1650:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            // InternalAnsibleDsl.g:1651:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) )
            {
            // InternalAnsibleDsl.g:1651:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:1652:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:1652:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:1653:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_57); 

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

            otherlv_1=(Token)match(input,50,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:1673:3: ( (lv_value_passed_2_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:1674:4: (lv_value_passed_2_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:1674:4: (lv_value_passed_2_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:1675:5: lv_value_passed_2_0= ruleEValuePassed
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
    // InternalAnsibleDsl.g:1696:1: entryRuleEConditionalExpression returns [EObject current=null] : iv_ruleEConditionalExpression= ruleEConditionalExpression EOF ;
    public final EObject entryRuleEConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionalExpression = null;


        try {
            // InternalAnsibleDsl.g:1696:63: (iv_ruleEConditionalExpression= ruleEConditionalExpression EOF )
            // InternalAnsibleDsl.g:1697:2: iv_ruleEConditionalExpression= ruleEConditionalExpression EOF
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
    // InternalAnsibleDsl.g:1703:1: ruleEConditionalExpression returns [EObject current=null] : ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) ) ;
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
            // InternalAnsibleDsl.g:1709:2: ( ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) ) )
            // InternalAnsibleDsl.g:1710:2: ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) )
            {
            // InternalAnsibleDsl.g:1710:2: ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_NULL:
            case 131:
            case 136:
            case 137:
            case 138:
                {
                alt41=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA41_2 = input.LA(2);

                if ( (LA41_2==EOF||LA41_2==17||LA41_2==67||(LA41_2>=80 && LA41_2<=82)||(LA41_2>=101 && LA41_2<=103)||LA41_2==106||LA41_2==135) ) {
                    alt41=3;
                }
                else if ( ((LA41_2>=51 && LA41_2<=57)) ) {
                    alt41=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 2, input);

                    throw nvae;
                }
                }
                break;
            case 58:
            case 66:
                {
                alt41=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalAnsibleDsl.g:1711:3: ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) )
                    {
                    // InternalAnsibleDsl.g:1711:3: ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) )
                    // InternalAnsibleDsl.g:1712:4: ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) )
                    {
                    // InternalAnsibleDsl.g:1712:4: ( (lv_left_term_0_0= ruleEValuePassed ) )
                    // InternalAnsibleDsl.g:1713:5: (lv_left_term_0_0= ruleEValuePassed )
                    {
                    // InternalAnsibleDsl.g:1713:5: (lv_left_term_0_0= ruleEValuePassed )
                    // InternalAnsibleDsl.g:1714:6: lv_left_term_0_0= ruleEValuePassed
                    {

                    						newCompositeNode(grammarAccess.getEConditionalExpressionAccess().getLeft_termEValuePassedParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_59);
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

                    // InternalAnsibleDsl.g:1731:4: ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=51 && LA40_0<=56)) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==57) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalAnsibleDsl.g:1732:5: ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) )
                            {
                            // InternalAnsibleDsl.g:1732:5: ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) )
                            // InternalAnsibleDsl.g:1733:6: ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) )
                            {
                            // InternalAnsibleDsl.g:1733:6: ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) )
                            // InternalAnsibleDsl.g:1734:7: ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) )
                            {
                            // InternalAnsibleDsl.g:1734:7: ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) )
                            // InternalAnsibleDsl.g:1735:8: (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' )
                            {
                            // InternalAnsibleDsl.g:1735:8: (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' )
                            int alt37=6;
                            switch ( input.LA(1) ) {
                            case 51:
                                {
                                alt37=1;
                                }
                                break;
                            case 52:
                                {
                                alt37=2;
                                }
                                break;
                            case 53:
                                {
                                alt37=3;
                                }
                                break;
                            case 54:
                                {
                                alt37=4;
                                }
                                break;
                            case 55:
                                {
                                alt37=5;
                                }
                                break;
                            case 56:
                                {
                                alt37=6;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 37, 0, input);

                                throw nvae;
                            }

                            switch (alt37) {
                                case 1 :
                                    // InternalAnsibleDsl.g:1736:9: lv_equality_term_1_1= '=='
                                    {
                                    lv_equality_term_1_1=(Token)match(input,51,FOLLOW_58); 

                                    									newLeafNode(lv_equality_term_1_1, grammarAccess.getEConditionalExpressionAccess().getEquality_termEqualsSignEqualsSignKeyword_0_1_0_0_0_0());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_1, null);
                                    								

                                    }
                                    break;
                                case 2 :
                                    // InternalAnsibleDsl.g:1747:9: lv_equality_term_1_2= '!='
                                    {
                                    lv_equality_term_1_2=(Token)match(input,52,FOLLOW_58); 

                                    									newLeafNode(lv_equality_term_1_2, grammarAccess.getEConditionalExpressionAccess().getEquality_termExclamationMarkEqualsSignKeyword_0_1_0_0_0_1());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_2, null);
                                    								

                                    }
                                    break;
                                case 3 :
                                    // InternalAnsibleDsl.g:1758:9: lv_equality_term_1_3= '<'
                                    {
                                    lv_equality_term_1_3=(Token)match(input,53,FOLLOW_58); 

                                    									newLeafNode(lv_equality_term_1_3, grammarAccess.getEConditionalExpressionAccess().getEquality_termLessThanSignKeyword_0_1_0_0_0_2());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_3, null);
                                    								

                                    }
                                    break;
                                case 4 :
                                    // InternalAnsibleDsl.g:1769:9: lv_equality_term_1_4= '>'
                                    {
                                    lv_equality_term_1_4=(Token)match(input,54,FOLLOW_58); 

                                    									newLeafNode(lv_equality_term_1_4, grammarAccess.getEConditionalExpressionAccess().getEquality_termGreaterThanSignKeyword_0_1_0_0_0_3());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_4, null);
                                    								

                                    }
                                    break;
                                case 5 :
                                    // InternalAnsibleDsl.g:1780:9: lv_equality_term_1_5= '<='
                                    {
                                    lv_equality_term_1_5=(Token)match(input,55,FOLLOW_58); 

                                    									newLeafNode(lv_equality_term_1_5, grammarAccess.getEConditionalExpressionAccess().getEquality_termLessThanSignEqualsSignKeyword_0_1_0_0_0_4());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "equality_term", lv_equality_term_1_5, null);
                                    								

                                    }
                                    break;
                                case 6 :
                                    // InternalAnsibleDsl.g:1791:9: lv_equality_term_1_6= '>='
                                    {
                                    lv_equality_term_1_6=(Token)match(input,56,FOLLOW_58); 

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

                            // InternalAnsibleDsl.g:1804:6: ( (lv_right_term_2_0= ruleEValuePassed ) )
                            // InternalAnsibleDsl.g:1805:7: (lv_right_term_2_0= ruleEValuePassed )
                            {
                            // InternalAnsibleDsl.g:1805:7: (lv_right_term_2_0= ruleEValuePassed )
                            // InternalAnsibleDsl.g:1806:8: lv_right_term_2_0= ruleEValuePassed
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
                            // InternalAnsibleDsl.g:1825:5: (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) )
                            {
                            // InternalAnsibleDsl.g:1825:5: (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) )
                            // InternalAnsibleDsl.g:1826:6: otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) )
                            {
                            otherlv_3=(Token)match(input,57,FOLLOW_60); 

                            						newLeafNode(otherlv_3, grammarAccess.getEConditionalExpressionAccess().getIsKeyword_0_1_1_0());
                            					
                            // InternalAnsibleDsl.g:1830:6: ( (lv_is_not_4_0= 'not' ) )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==58) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // InternalAnsibleDsl.g:1831:7: (lv_is_not_4_0= 'not' )
                                    {
                                    // InternalAnsibleDsl.g:1831:7: (lv_is_not_4_0= 'not' )
                                    // InternalAnsibleDsl.g:1832:8: lv_is_not_4_0= 'not'
                                    {
                                    lv_is_not_4_0=(Token)match(input,58,FOLLOW_61); 

                                    								newLeafNode(lv_is_not_4_0, grammarAccess.getEConditionalExpressionAccess().getIs_notNotKeyword_0_1_1_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    								}
                                    								setWithLastConsumed(current, "is_not", lv_is_not_4_0, "not");
                                    							

                                    }


                                    }
                                    break;

                            }

                            // InternalAnsibleDsl.g:1844:6: ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) )
                            // InternalAnsibleDsl.g:1845:7: ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) )
                            {
                            // InternalAnsibleDsl.g:1845:7: ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) )
                            // InternalAnsibleDsl.g:1846:8: (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' )
                            {
                            // InternalAnsibleDsl.g:1846:8: (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' )
                            int alt39=7;
                            switch ( input.LA(1) ) {
                            case 59:
                                {
                                alt39=1;
                                }
                                break;
                            case 60:
                                {
                                alt39=2;
                                }
                                break;
                            case 61:
                                {
                                alt39=3;
                                }
                                break;
                            case 62:
                                {
                                alt39=4;
                                }
                                break;
                            case 63:
                                {
                                alt39=5;
                                }
                                break;
                            case 64:
                                {
                                alt39=6;
                                }
                                break;
                            case 65:
                                {
                                alt39=7;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 39, 0, input);

                                throw nvae;
                            }

                            switch (alt39) {
                                case 1 :
                                    // InternalAnsibleDsl.g:1847:9: lv_status_5_1= 'skipped'
                                    {
                                    lv_status_5_1=(Token)match(input,59,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_1, grammarAccess.getEConditionalExpressionAccess().getStatusSkippedKeyword_0_1_1_2_0_0());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_1, null);
                                    								

                                    }
                                    break;
                                case 2 :
                                    // InternalAnsibleDsl.g:1858:9: lv_status_5_2= 'failed'
                                    {
                                    lv_status_5_2=(Token)match(input,60,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_2, grammarAccess.getEConditionalExpressionAccess().getStatusFailedKeyword_0_1_1_2_0_1());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_2, null);
                                    								

                                    }
                                    break;
                                case 3 :
                                    // InternalAnsibleDsl.g:1869:9: lv_status_5_3= 'succeeded'
                                    {
                                    lv_status_5_3=(Token)match(input,61,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_3, grammarAccess.getEConditionalExpressionAccess().getStatusSucceededKeyword_0_1_1_2_0_2());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_3, null);
                                    								

                                    }
                                    break;
                                case 4 :
                                    // InternalAnsibleDsl.g:1880:9: lv_status_5_4= 'fail'
                                    {
                                    lv_status_5_4=(Token)match(input,62,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_4, grammarAccess.getEConditionalExpressionAccess().getStatusFailKeyword_0_1_1_2_0_3());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_4, null);
                                    								

                                    }
                                    break;
                                case 5 :
                                    // InternalAnsibleDsl.g:1891:9: lv_status_5_5= 'success'
                                    {
                                    lv_status_5_5=(Token)match(input,63,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_5, grammarAccess.getEConditionalExpressionAccess().getStatusSuccessKeyword_0_1_1_2_0_4());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_5, null);
                                    								

                                    }
                                    break;
                                case 6 :
                                    // InternalAnsibleDsl.g:1902:9: lv_status_5_6= 'defined'
                                    {
                                    lv_status_5_6=(Token)match(input,64,FOLLOW_2); 

                                    									newLeafNode(lv_status_5_6, grammarAccess.getEConditionalExpressionAccess().getStatusDefinedKeyword_0_1_1_2_0_5());
                                    								

                                    									if (current==null) {
                                    										current = createModelElement(grammarAccess.getEConditionalExpressionRule());
                                    									}
                                    									setWithLastConsumed(current, "status", lv_status_5_6, null);
                                    								

                                    }
                                    break;
                                case 7 :
                                    // InternalAnsibleDsl.g:1913:9: lv_status_5_7= 'undefined'
                                    {
                                    lv_status_5_7=(Token)match(input,65,FOLLOW_2); 

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
                    // InternalAnsibleDsl.g:1930:3: ( (lv_formula_6_0= ruleEConditionalFormula ) )
                    {
                    // InternalAnsibleDsl.g:1930:3: ( (lv_formula_6_0= ruleEConditionalFormula ) )
                    // InternalAnsibleDsl.g:1931:4: (lv_formula_6_0= ruleEConditionalFormula )
                    {
                    // InternalAnsibleDsl.g:1931:4: (lv_formula_6_0= ruleEConditionalFormula )
                    // InternalAnsibleDsl.g:1932:5: lv_formula_6_0= ruleEConditionalFormula
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
                    // InternalAnsibleDsl.g:1950:3: ( (lv_is_true_7_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:1950:3: ( (lv_is_true_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:1951:4: (lv_is_true_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:1951:4: (lv_is_true_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:1952:5: lv_is_true_7_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:1972:1: entryRuleEConditionalFormula returns [EObject current=null] : iv_ruleEConditionalFormula= ruleEConditionalFormula EOF ;
    public final EObject entryRuleEConditionalFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionalFormula = null;


        try {
            // InternalAnsibleDsl.g:1972:60: (iv_ruleEConditionalFormula= ruleEConditionalFormula EOF )
            // InternalAnsibleDsl.g:1973:2: iv_ruleEConditionalFormula= ruleEConditionalFormula EOF
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
    // InternalAnsibleDsl.g:1979:1: ruleEConditionalFormula returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) ) ;
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
            // InternalAnsibleDsl.g:1985:2: ( ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) ) )
            // InternalAnsibleDsl.g:1986:2: ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) )
            {
            // InternalAnsibleDsl.g:1986:2: ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==66) ) {
                alt43=1;
            }
            else if ( (LA43_0==58) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalAnsibleDsl.g:1987:3: (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' )
                    {
                    // InternalAnsibleDsl.g:1987:3: (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' )
                    // InternalAnsibleDsl.g:1988:4: otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,66,FOLLOW_41); 

                    				newLeafNode(otherlv_0, grammarAccess.getEConditionalFormulaAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalAnsibleDsl.g:1992:4: ( (lv_left_expression_1_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:1993:5: (lv_left_expression_1_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:1993:5: (lv_left_expression_1_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:1994:6: lv_left_expression_1_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getEConditionalFormulaAccess().getLeft_expressionEConditionalExpressionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_62);
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

                    otherlv_2=(Token)match(input,67,FOLLOW_63); 

                    				newLeafNode(otherlv_2, grammarAccess.getEConditionalFormulaAccess().getRightParenthesisKeyword_0_2());
                    			
                    // InternalAnsibleDsl.g:2015:4: ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) )
                    // InternalAnsibleDsl.g:2016:5: ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) )
                    {
                    // InternalAnsibleDsl.g:2016:5: ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) )
                    // InternalAnsibleDsl.g:2017:6: (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' )
                    {
                    // InternalAnsibleDsl.g:2017:6: (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==68) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==69) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalAnsibleDsl.g:2018:7: lv_and_or_3_1= 'and'
                            {
                            lv_and_or_3_1=(Token)match(input,68,FOLLOW_64); 

                            							newLeafNode(lv_and_or_3_1, grammarAccess.getEConditionalFormulaAccess().getAnd_orAndKeyword_0_3_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEConditionalFormulaRule());
                            							}
                            							setWithLastConsumed(current, "and_or", lv_and_or_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:2029:7: lv_and_or_3_2= 'or'
                            {
                            lv_and_or_3_2=(Token)match(input,69,FOLLOW_64); 

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

                    otherlv_4=(Token)match(input,66,FOLLOW_41); 

                    				newLeafNode(otherlv_4, grammarAccess.getEConditionalFormulaAccess().getLeftParenthesisKeyword_0_4());
                    			
                    // InternalAnsibleDsl.g:2046:4: ( (lv_right_expression_5_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:2047:5: (lv_right_expression_5_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:2047:5: (lv_right_expression_5_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:2048:6: lv_right_expression_5_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getEConditionalFormulaAccess().getRight_expressionEConditionalExpressionParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_62);
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

                    otherlv_6=(Token)match(input,67,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEConditionalFormulaAccess().getRightParenthesisKeyword_0_6());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:2071:3: (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' )
                    {
                    // InternalAnsibleDsl.g:2071:3: (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' )
                    // InternalAnsibleDsl.g:2072:4: otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_64); 

                    				newLeafNode(otherlv_7, grammarAccess.getEConditionalFormulaAccess().getNotKeyword_1_0());
                    			
                    otherlv_8=(Token)match(input,66,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getEConditionalFormulaAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalAnsibleDsl.g:2080:4: ( (lv_negated_expression_9_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:2081:5: (lv_negated_expression_9_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:2081:5: (lv_negated_expression_9_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:2082:6: lv_negated_expression_9_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getEConditionalFormulaAccess().getNegated_expressionEConditionalExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_62);
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

                    otherlv_10=(Token)match(input,67,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:2108:1: entryRuleERoleInclusion returns [EObject current=null] : iv_ruleERoleInclusion= ruleERoleInclusion EOF ;
    public final EObject entryRuleERoleInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusion = null;


        try {
            // InternalAnsibleDsl.g:2108:55: (iv_ruleERoleInclusion= ruleERoleInclusion EOF )
            // InternalAnsibleDsl.g:2109:2: iv_ruleERoleInclusion= ruleERoleInclusion EOF
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
    // InternalAnsibleDsl.g:2115:1: ruleERoleInclusion returns [EObject current=null] : (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleERoleInclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_base_common_keywords_4_0 = null;

        EObject lv_exe_common_keywords_7_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2121:2: ( (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= '}' ) )
            // InternalAnsibleDsl.g:2122:2: (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalAnsibleDsl.g:2122:2: (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= '}' )
            // InternalAnsibleDsl.g:2123:3: otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_65); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionAccess().getRoleKeyword_0());
            		
            // InternalAnsibleDsl.g:2127:3: (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==71) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAnsibleDsl.g:2128:4: otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getERoleInclusionAccess().getRole_nameKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:2132:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2133:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2133:5: (lv_name_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2134:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getERoleInclusionAccess().getBase_settingsKeyword_2());
            		
            // InternalAnsibleDsl.g:2155:3: ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) )
            // InternalAnsibleDsl.g:2156:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            {
            // InternalAnsibleDsl.g:2156:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            // InternalAnsibleDsl.g:2157:5: lv_base_common_keywords_4_0= ruleEBaseCommonKeywords
            {

            					newCompositeNode(grammarAccess.getERoleInclusionAccess().getBase_common_keywordsEBaseCommonKeywordsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_base_common_keywords_4_0=ruleEBaseCommonKeywords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
            					}
            					set(
            						current,
            						"base_common_keywords",
            						lv_base_common_keywords_4_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EBaseCommonKeywords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getERoleInclusionAccess().getExecution_settingsKeyword_5());
            		
            // InternalAnsibleDsl.g:2182:3: ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) )
            // InternalAnsibleDsl.g:2183:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            {
            // InternalAnsibleDsl.g:2183:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            // InternalAnsibleDsl.g:2184:5: lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords
            {

            					newCompositeNode(grammarAccess.getERoleInclusionAccess().getExe_common_keywordsEExecutionCommonKeywordsParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_exe_common_keywords_7_0=ruleEExecutionCommonKeywords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
            					}
            					set(
            						current,
            						"exe_common_keywords",
            						lv_exe_common_keywords_7_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionCommonKeywords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_8, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalAnsibleDsl.g:2213:1: entryRuleERoleInclusions returns [EObject current=null] : iv_ruleERoleInclusions= ruleERoleInclusions EOF ;
    public final EObject entryRuleERoleInclusions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusions = null;


        try {
            // InternalAnsibleDsl.g:2213:56: (iv_ruleERoleInclusions= ruleERoleInclusions EOF )
            // InternalAnsibleDsl.g:2214:2: iv_ruleERoleInclusions= ruleERoleInclusions EOF
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
    // InternalAnsibleDsl.g:2220:1: ruleERoleInclusions returns [EObject current=null] : (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' ) ;
    public final EObject ruleERoleInclusions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_roles_1_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2226:2: ( (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' ) )
            // InternalAnsibleDsl.g:2227:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' )
            {
            // InternalAnsibleDsl.g:2227:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' )
            // InternalAnsibleDsl.g:2228:3: otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_66); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionsAccess().getRoles_inclusionsKeyword_0());
            		
            // InternalAnsibleDsl.g:2232:3: ( (lv_roles_1_0= ruleERoleInclusion ) )
            // InternalAnsibleDsl.g:2233:4: (lv_roles_1_0= ruleERoleInclusion )
            {
            // InternalAnsibleDsl.g:2233:4: (lv_roles_1_0= ruleERoleInclusion )
            // InternalAnsibleDsl.g:2234:5: lv_roles_1_0= ruleERoleInclusion
            {

            					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_67);
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

            // InternalAnsibleDsl.g:2251:3: ( (lv_roles_2_0= ruleERoleInclusion ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==70) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2252:4: (lv_roles_2_0= ruleERoleInclusion )
            	    {
            	    // InternalAnsibleDsl.g:2252:4: (lv_roles_2_0= ruleERoleInclusion )
            	    // InternalAnsibleDsl.g:2253:5: lv_roles_2_0= ruleERoleInclusion
            	    {

            	    					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_67);
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
            	    break loop45;
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
    // InternalAnsibleDsl.g:2278:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalAnsibleDsl.g:2278:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalAnsibleDsl.g:2279:2: iv_ruleELoop= ruleELoop EOF
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
    // InternalAnsibleDsl.g:2285:1: ruleELoop returns [EObject current=null] : (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        EObject this_ELoopOverList_0 = null;

        EObject this_EUntil_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2291:2: ( (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) )
            // InternalAnsibleDsl.g:2292:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            {
            // InternalAnsibleDsl.g:2292:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==73) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=80 && LA46_0<=82)) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalAnsibleDsl.g:2293:3: this_ELoopOverList_0= ruleELoopOverList
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
                    // InternalAnsibleDsl.g:2302:3: this_EUntil_1= ruleEUntil
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
    // InternalAnsibleDsl.g:2314:1: entryRuleELoopOverList returns [EObject current=null] : iv_ruleELoopOverList= ruleELoopOverList EOF ;
    public final EObject entryRuleELoopOverList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopOverList = null;


        try {
            // InternalAnsibleDsl.g:2314:54: (iv_ruleELoopOverList= ruleELoopOverList EOF )
            // InternalAnsibleDsl.g:2315:2: iv_ruleELoopOverList= ruleELoopOverList EOF
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
    // InternalAnsibleDsl.g:2321:1: ruleELoopOverList returns [EObject current=null] : (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) ;
    public final EObject ruleELoopOverList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loop_list_1_0 = null;

        EObject lv_loop_control_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2327:2: ( (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) )
            // InternalAnsibleDsl.g:2328:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            {
            // InternalAnsibleDsl.g:2328:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            // InternalAnsibleDsl.g:2329:3: otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )?
            {
            otherlv_0=(Token)match(input,73,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getELoopOverListAccess().getLoopKeyword_0());
            		
            // InternalAnsibleDsl.g:2333:3: ( (lv_loop_list_1_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:2334:4: (lv_loop_list_1_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:2334:4: (lv_loop_list_1_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:2335:5: lv_loop_list_1_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getELoopOverListAccess().getLoop_listEValuePassedParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_68);
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

            // InternalAnsibleDsl.g:2352:3: ( (lv_loop_control_2_0= ruleELoopControl ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==74) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAnsibleDsl.g:2353:4: (lv_loop_control_2_0= ruleELoopControl )
                    {
                    // InternalAnsibleDsl.g:2353:4: (lv_loop_control_2_0= ruleELoopControl )
                    // InternalAnsibleDsl.g:2354:5: lv_loop_control_2_0= ruleELoopControl
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
    // InternalAnsibleDsl.g:2375:1: entryRuleELoopControl returns [EObject current=null] : iv_ruleELoopControl= ruleELoopControl EOF ;
    public final EObject entryRuleELoopControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopControl = null;


        try {
            // InternalAnsibleDsl.g:2375:53: (iv_ruleELoopControl= ruleELoopControl EOF )
            // InternalAnsibleDsl.g:2376:2: iv_ruleELoopControl= ruleELoopControl EOF
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
    // InternalAnsibleDsl.g:2382:1: ruleELoopControl returns [EObject current=null] : ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:2388:2: ( ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:2389:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:2389:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:2390:3: () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:2390:3: ()
            // InternalAnsibleDsl.g:2391:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getELoopControlAccess().getELoopControlAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_69); 

            			newLeafNode(otherlv_1, grammarAccess.getELoopControlAccess().getLoop_controlKeyword_1());
            		
            // InternalAnsibleDsl.g:2401:3: (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==75) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAnsibleDsl.g:2402:4: otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) )
                    {
                    otherlv_2=(Token)match(input,75,FOLLOW_58); 

                    				newLeafNode(otherlv_2, grammarAccess.getELoopControlAccess().getLabelKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2406:4: ( (lv_label_3_0= ruleEValuePassed ) )
                    // InternalAnsibleDsl.g:2407:5: (lv_label_3_0= ruleEValuePassed )
                    {
                    // InternalAnsibleDsl.g:2407:5: (lv_label_3_0= ruleEValuePassed )
                    // InternalAnsibleDsl.g:2408:6: lv_label_3_0= ruleEValuePassed
                    {

                    						newCompositeNode(grammarAccess.getELoopControlAccess().getLabelEValuePassedParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_70);
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

            // InternalAnsibleDsl.g:2426:3: (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==76) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAnsibleDsl.g:2427:4: otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,76,FOLLOW_71); 

                    				newLeafNode(otherlv_4, grammarAccess.getELoopControlAccess().getPauseKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2431:4: ( (lv_pause_5_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:2432:5: (lv_pause_5_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:2432:5: (lv_pause_5_0= RULE_INT )
                    // InternalAnsibleDsl.g:2433:6: lv_pause_5_0= RULE_INT
                    {
                    lv_pause_5_0=(Token)match(input,RULE_INT,FOLLOW_72); 

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

            // InternalAnsibleDsl.g:2450:3: (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==77) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAnsibleDsl.g:2451:4: otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_54); 

                    				newLeafNode(otherlv_6, grammarAccess.getELoopControlAccess().getIndex_varKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2455:4: ( (lv_index_var_7_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:2456:5: (lv_index_var_7_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:2456:5: (lv_index_var_7_0= RULE_ID )
                    // InternalAnsibleDsl.g:2457:6: lv_index_var_7_0= RULE_ID
                    {
                    lv_index_var_7_0=(Token)match(input,RULE_ID,FOLLOW_73); 

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

            // InternalAnsibleDsl.g:2474:3: (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==78) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAnsibleDsl.g:2475:4: otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,78,FOLLOW_54); 

                    				newLeafNode(otherlv_8, grammarAccess.getELoopControlAccess().getLoop_varKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:2479:4: ( (lv_loop_var_9_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:2480:5: (lv_loop_var_9_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:2480:5: (lv_loop_var_9_0= RULE_ID )
                    // InternalAnsibleDsl.g:2481:6: lv_loop_var_9_0= RULE_ID
                    {
                    lv_loop_var_9_0=(Token)match(input,RULE_ID,FOLLOW_74); 

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

            // InternalAnsibleDsl.g:2498:3: (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==79) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAnsibleDsl.g:2499:4: otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    {
                    otherlv_10=(Token)match(input,79,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getELoopControlAccess().getExtendedKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:2503:4: ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:2504:5: (lv_extended_11_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:2504:5: (lv_extended_11_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:2505:6: lv_extended_11_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:2530:1: entryRuleEUntil returns [EObject current=null] : iv_ruleEUntil= ruleEUntil EOF ;
    public final EObject entryRuleEUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUntil = null;


        try {
            // InternalAnsibleDsl.g:2530:47: (iv_ruleEUntil= ruleEUntil EOF )
            // InternalAnsibleDsl.g:2531:2: iv_ruleEUntil= ruleEUntil EOF
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
    // InternalAnsibleDsl.g:2537:1: ruleEUntil returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalAnsibleDsl.g:2543:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:2544:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:2544:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:2545:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:2545:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:2546:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEUntilAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:2549:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:2550:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:2550:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=4;
                int LA53_0 = input.LA(1);

                if ( LA53_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
                    alt53=2;
                }
                else if ( LA53_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
                    alt53=3;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2551:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2551:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2552:4: {...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:2552:100: ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) )
            	    // InternalAnsibleDsl.g:2553:5: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:2556:8: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) )
            	    // InternalAnsibleDsl.g:2556:9: {...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:2556:18: (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) )
            	    // InternalAnsibleDsl.g:2556:19: otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,80,FOLLOW_41); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEUntilAccess().getUntilKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:2560:8: ( (lv_until_2_0= ruleEConditionalExpression ) )
            	    // InternalAnsibleDsl.g:2561:9: (lv_until_2_0= ruleEConditionalExpression )
            	    {
            	    // InternalAnsibleDsl.g:2561:9: (lv_until_2_0= ruleEConditionalExpression )
            	    // InternalAnsibleDsl.g:2562:10: lv_until_2_0= ruleEConditionalExpression
            	    {

            	    										newCompositeNode(grammarAccess.getEUntilAccess().getUntilEConditionalExpressionParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_75);
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
            	    // InternalAnsibleDsl.g:2585:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2585:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2586:4: {...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:2586:100: ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:2587:5: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:2590:8: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:2590:9: {...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:2590:18: (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:2590:19: otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,81,FOLLOW_71); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEUntilAccess().getRetriesKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:2594:8: ( (lv_retries_4_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:2595:9: (lv_retries_4_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:2595:9: (lv_retries_4_0= RULE_INT )
            	    // InternalAnsibleDsl.g:2596:10: lv_retries_4_0= RULE_INT
            	    {
            	    lv_retries_4_0=(Token)match(input,RULE_INT,FOLLOW_75); 

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
            	    // InternalAnsibleDsl.g:2618:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2618:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2619:4: {...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:2619:100: ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:2620:5: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:2623:8: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:2623:9: {...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:2623:18: (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:2623:19: otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,82,FOLLOW_71); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEUntilAccess().getDelayKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:2627:8: ( (lv_delay_6_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:2628:9: (lv_delay_6_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:2628:9: (lv_delay_6_0= RULE_INT )
            	    // InternalAnsibleDsl.g:2629:10: lv_delay_6_0= RULE_INT
            	    {
            	    lv_delay_6_0=(Token)match(input,RULE_INT,FOLLOW_75); 

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
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
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
    // InternalAnsibleDsl.g:2662:1: entryRuleEPrivilageEscalation returns [EObject current=null] : iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF ;
    public final EObject entryRuleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrivilageEscalation = null;


        try {
            // InternalAnsibleDsl.g:2662:61: (iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF )
            // InternalAnsibleDsl.g:2663:2: iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF
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
    // InternalAnsibleDsl.g:2669:1: ruleEPrivilageEscalation returns [EObject current=null] : ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:2675:2: ( ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:2676:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:2676:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:2677:3: () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:2677:3: ()
            // InternalAnsibleDsl.g:2678:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPrivilageEscalationAccess().getEPrivilageEscalationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,83,FOLLOW_76); 

            			newLeafNode(otherlv_1, grammarAccess.getEPrivilageEscalationAccess().getPrivilage_escalationKeyword_1());
            		
            // InternalAnsibleDsl.g:2688:3: (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==84) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAnsibleDsl.g:2689:4: otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,84,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getEPrivilageEscalationAccess().getBecomeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2693:4: ( (lv_become_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:2694:5: (lv_become_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:2694:5: (lv_become_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:2695:6: lv_become_3_0= RULE_BOOLEAN
                    {
                    lv_become_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_77); 

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

            // InternalAnsibleDsl.g:2712:3: (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==85) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAnsibleDsl.g:2713:4: otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,85,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPrivilageEscalationAccess().getBecome_exeKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2717:4: ( (lv_become_exe_5_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2718:5: (lv_become_exe_5_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2718:5: (lv_become_exe_5_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2719:6: lv_become_exe_5_0= RULE_STRING
                    {
                    lv_become_exe_5_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

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

            // InternalAnsibleDsl.g:2736:3: (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==86) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAnsibleDsl.g:2737:4: otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,86,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2741:4: ( (lv_become_flags_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2742:5: (lv_become_flags_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2742:5: (lv_become_flags_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2743:6: lv_become_flags_7_0= RULE_STRING
                    {
                    lv_become_flags_7_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

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

            // InternalAnsibleDsl.g:2760:3: (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==87) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAnsibleDsl.g:2761:4: otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,87,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPrivilageEscalationAccess().getBecome_methodKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:2765:4: ( (lv_become_method_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2766:5: (lv_become_method_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2766:5: (lv_become_method_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2767:6: lv_become_method_9_0= RULE_STRING
                    {
                    lv_become_method_9_0=(Token)match(input,RULE_STRING,FOLLOW_80); 

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

            // InternalAnsibleDsl.g:2784:3: (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==88) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAnsibleDsl.g:2785:4: otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,88,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEPrivilageEscalationAccess().getBecome_userKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:2789:4: ( (lv_become_user_11_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2790:5: (lv_become_user_11_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2790:5: (lv_become_user_11_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2791:6: lv_become_user_11_0= RULE_STRING
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
    // InternalAnsibleDsl.g:2816:1: entryRuleEValidationMode returns [EObject current=null] : iv_ruleEValidationMode= ruleEValidationMode EOF ;
    public final EObject entryRuleEValidationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidationMode = null;


        try {
            // InternalAnsibleDsl.g:2816:56: (iv_ruleEValidationMode= ruleEValidationMode EOF )
            // InternalAnsibleDsl.g:2817:2: iv_ruleEValidationMode= ruleEValidationMode EOF
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
    // InternalAnsibleDsl.g:2823:1: ruleEValidationMode returns [EObject current=null] : ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) ;
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
            // InternalAnsibleDsl.g:2829:2: ( ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) )
            // InternalAnsibleDsl.g:2830:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            {
            // InternalAnsibleDsl.g:2830:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            // InternalAnsibleDsl.g:2831:3: () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}'
            {
            // InternalAnsibleDsl.g:2831:3: ()
            // InternalAnsibleDsl.g:2832:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEValidationModeAccess().getEValidationModeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_81); 

            			newLeafNode(otherlv_1, grammarAccess.getEValidationModeAccess().getValidation_modeKeyword_1());
            		
            // InternalAnsibleDsl.g:2842:3: (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==90) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAnsibleDsl.g:2843:4: otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,90,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getEValidationModeAccess().getCheck_modeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2847:4: ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:2848:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:2848:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:2849:6: lv_check_mode_3_0= RULE_BOOLEAN
                    {
                    lv_check_mode_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_82); 

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

            // InternalAnsibleDsl.g:2866:3: (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==91) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAnsibleDsl.g:2867:4: otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    {
                    otherlv_4=(Token)match(input,91,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getEValidationModeAccess().getDiffKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2871:4: ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:2872:5: (lv_diff_5_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:2872:5: (lv_diff_5_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:2873:6: lv_diff_5_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:2898:1: entryRuleEConnection returns [EObject current=null] : iv_ruleEConnection= ruleEConnection EOF ;
    public final EObject entryRuleEConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConnection = null;


        try {
            // InternalAnsibleDsl.g:2898:52: (iv_ruleEConnection= ruleEConnection EOF )
            // InternalAnsibleDsl.g:2899:2: iv_ruleEConnection= ruleEConnection EOF
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
    // InternalAnsibleDsl.g:2905:1: ruleEConnection returns [EObject current=null] : ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) ;
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
            // InternalAnsibleDsl.g:2911:2: ( ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) )
            // InternalAnsibleDsl.g:2912:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            {
            // InternalAnsibleDsl.g:2912:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            // InternalAnsibleDsl.g:2913:3: () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}'
            {
            // InternalAnsibleDsl.g:2913:3: ()
            // InternalAnsibleDsl.g:2914:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConnectionAccess().getEConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,92,FOLLOW_83); 

            			newLeafNode(otherlv_1, grammarAccess.getEConnectionAccess().getConnection_infoKeyword_1());
            		
            // InternalAnsibleDsl.g:2924:3: (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==93) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAnsibleDsl.g:2925:4: otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,93,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEConnectionAccess().getConnectionKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2929:4: ( (lv_connection_3_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2930:5: (lv_connection_3_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2930:5: (lv_connection_3_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2931:6: lv_connection_3_0= RULE_STRING
                    {
                    lv_connection_3_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

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

            // InternalAnsibleDsl.g:2948:3: (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==94) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAnsibleDsl.g:2949:4: otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,94,FOLLOW_71); 

                    				newLeafNode(otherlv_4, grammarAccess.getEConnectionAccess().getPortKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2953:4: ( (lv_port_5_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:2954:5: (lv_port_5_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:2954:5: (lv_port_5_0= RULE_INT )
                    // InternalAnsibleDsl.g:2955:6: lv_port_5_0= RULE_INT
                    {
                    lv_port_5_0=(Token)match(input,RULE_INT,FOLLOW_85); 

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

            // InternalAnsibleDsl.g:2972:3: (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==95) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAnsibleDsl.g:2973:4: otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,95,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEConnectionAccess().getRemote_userKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2977:4: ( (lv_remote_user_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2978:5: (lv_remote_user_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2978:5: (lv_remote_user_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2979:6: lv_remote_user_7_0= RULE_STRING
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
    // InternalAnsibleDsl.g:3004:1: entryRuleEPlayExeSettings returns [EObject current=null] : iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF ;
    public final EObject entryRuleEPlayExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayExeSettings = null;


        try {
            // InternalAnsibleDsl.g:3004:57: (iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF )
            // InternalAnsibleDsl.g:3005:2: iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF
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
    // InternalAnsibleDsl.g:3011:1: ruleEPlayExeSettings returns [EObject current=null] : ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:3017:2: ( ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:3018:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:3018:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:3019:3: () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:3019:3: ()
            // InternalAnsibleDsl.g:3020:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayExeSettingsAccess().getEPlayExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:3026:3: (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==96) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAnsibleDsl.g:3027:4: otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,96,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayExeSettingsAccess().getStrategyKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:3031:4: ( (lv_strategy_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3032:5: (lv_strategy_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3032:5: (lv_strategy_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3033:6: lv_strategy_2_0= RULE_STRING
                    {
                    lv_strategy_2_0=(Token)match(input,RULE_STRING,FOLLOW_86); 

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

            // InternalAnsibleDsl.g:3050:3: (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==97) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAnsibleDsl.g:3051:4: otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) )
                    {
                    otherlv_3=(Token)match(input,97,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayExeSettingsAccess().getSerialKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3055:4: ( (lv_serial_list_4_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3056:5: (lv_serial_list_4_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3056:5: (lv_serial_list_4_0= ruleEList )
                    // InternalAnsibleDsl.g:3057:6: lv_serial_list_4_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getSerial_listEListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_87);
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

            // InternalAnsibleDsl.g:3075:3: (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==98) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAnsibleDsl.g:3076:4: otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,98,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayExeSettingsAccess().getOrderKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3080:4: ( (lv_order_6_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3081:5: (lv_order_6_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3081:5: (lv_order_6_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3082:6: lv_order_6_0= RULE_STRING
                    {
                    lv_order_6_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

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

            // InternalAnsibleDsl.g:3099:3: (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==99) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAnsibleDsl.g:3100:4: otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,99,FOLLOW_71); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayExeSettingsAccess().getThrottleKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3104:4: ( (lv_throttle_8_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:3105:5: (lv_throttle_8_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:3105:5: (lv_throttle_8_0= RULE_INT )
                    // InternalAnsibleDsl.g:3106:6: lv_throttle_8_0= RULE_INT
                    {
                    lv_throttle_8_0=(Token)match(input,RULE_INT,FOLLOW_89); 

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

            // InternalAnsibleDsl.g:3123:3: (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==100) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAnsibleDsl.g:3124:4: otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,100,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getEPlayExeSettingsAccess().getRun_onceKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3128:4: ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3129:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3129:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3130:6: lv_run_once_10_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:3151:1: entryRuleEExecutionExeSettings returns [EObject current=null] : iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF ;
    public final EObject entryRuleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionExeSettings = null;


        try {
            // InternalAnsibleDsl.g:3151:62: (iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF )
            // InternalAnsibleDsl.g:3152:2: iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF
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
    // InternalAnsibleDsl.g:3158:1: ruleEExecutionExeSettings returns [EObject current=null] : ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_throttle_2_0=null;
        Token otherlv_3=null;
        Token lv_run_once_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:3164:2: ( ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:3165:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:3165:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:3166:3: () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:3166:3: ()
            // InternalAnsibleDsl.g:3167:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEExecutionExeSettingsAccess().getEExecutionExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:3173:3: (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==99) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAnsibleDsl.g:3174:4: otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,99,FOLLOW_71); 

                    				newLeafNode(otherlv_1, grammarAccess.getEExecutionExeSettingsAccess().getThrottleKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:3178:4: ( (lv_throttle_2_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:3179:5: (lv_throttle_2_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:3179:5: (lv_throttle_2_0= RULE_INT )
                    // InternalAnsibleDsl.g:3180:6: lv_throttle_2_0= RULE_INT
                    {
                    lv_throttle_2_0=(Token)match(input,RULE_INT,FOLLOW_89); 

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

            // InternalAnsibleDsl.g:3197:3: (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==100) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAnsibleDsl.g:3198:4: otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,100,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEExecutionExeSettingsAccess().getRun_onceKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3202:4: ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3203:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3203:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3204:6: lv_run_once_4_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:3225:1: entryRuleEBlockErrorHandling returns [EObject current=null] : iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF ;
    public final EObject entryRuleEBlockErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:3225:60: (iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF )
            // InternalAnsibleDsl.g:3226:2: iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF
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
    // InternalAnsibleDsl.g:3232:1: ruleEBlockErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:3238:2: ( ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:3239:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:3239:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:3240:3: () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:3240:3: ()
            // InternalAnsibleDsl.g:3241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBlockErrorHandlingAccess().getEBlockErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:3247:3: (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==101) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAnsibleDsl.g:3248:4: otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    {
                    otherlv_1=(Token)match(input,101,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:3252:4: ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3253:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3253:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3254:6: lv_any_errors_fatal_2_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_90); 

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

            // InternalAnsibleDsl.g:3271:3: (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==102) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAnsibleDsl.g:3272:4: otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,102,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3276:4: ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3277:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3277:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3278:6: lv_ignore_errors_4_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_91); 

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

            // InternalAnsibleDsl.g:3295:3: (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==103) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAnsibleDsl.g:3296:4: otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,103,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3300:4: ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3301:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3301:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3302:6: lv_ignore_unreachable_6_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:3323:1: entryRuleEPlayErrorHandling returns [EObject current=null] : iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF ;
    public final EObject entryRuleEPlayErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:3323:59: (iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF )
            // InternalAnsibleDsl.g:3324:2: iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF
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
    // InternalAnsibleDsl.g:3330:1: ruleEPlayErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:3336:2: ( ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:3337:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:3337:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:3338:3: () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:3338:3: ()
            // InternalAnsibleDsl.g:3339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayErrorHandlingAccess().getEPlayErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:3345:3: (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==104) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAnsibleDsl.g:3346:4: otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,104,FOLLOW_71); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:3350:4: ( (lv_max_fail_percentage_2_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:3351:5: (lv_max_fail_percentage_2_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:3351:5: (lv_max_fail_percentage_2_0= RULE_INT )
                    // InternalAnsibleDsl.g:3352:6: lv_max_fail_percentage_2_0= RULE_INT
                    {
                    lv_max_fail_percentage_2_0=(Token)match(input,RULE_INT,FOLLOW_92); 

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

            // InternalAnsibleDsl.g:3369:3: (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==101) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAnsibleDsl.g:3370:4: otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,101,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3374:4: ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3375:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3375:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3376:6: lv_any_errors_fatal_4_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_90); 

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

            // InternalAnsibleDsl.g:3393:3: (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==102) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAnsibleDsl.g:3394:4: otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,102,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3398:4: ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3399:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3399:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3400:6: lv_ignore_errors_6_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_91); 

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

            // InternalAnsibleDsl.g:3417:3: (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==103) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAnsibleDsl.g:3418:4: otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,103,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3422:4: ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3423:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3423:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3424:6: lv_ignore_unreachable_8_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:3445:1: entryRuleETaskHandlerErrorHandling returns [EObject current=null] : iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF ;
    public final EObject entryRuleETaskHandlerErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:3445:66: (iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF )
            // InternalAnsibleDsl.g:3446:2: iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF
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
    // InternalAnsibleDsl.g:3452:1: ruleETaskHandlerErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:3458:2: ( ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:3459:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:3459:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:3460:3: () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:3460:3: ()
            // InternalAnsibleDsl.g:3461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETaskHandlerErrorHandlingAccess().getETaskHandlerErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:3467:3: (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==105) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAnsibleDsl.g:3468:4: otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) )
                    {
                    otherlv_1=(Token)match(input,105,FOLLOW_41); 

                    				newLeafNode(otherlv_1, grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:3472:4: ( (lv_changed_when_2_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:3473:5: (lv_changed_when_2_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:3473:5: (lv_changed_when_2_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:3474:6: lv_changed_when_2_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenEConditionalExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_93);
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

            // InternalAnsibleDsl.g:3492:3: (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==106) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalAnsibleDsl.g:3493:4: otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) )
                    {
                    otherlv_3=(Token)match(input,106,FOLLOW_41); 

                    				newLeafNode(otherlv_3, grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3497:4: ( (lv_failed_when_4_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:3498:5: (lv_failed_when_4_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:3498:5: (lv_failed_when_4_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:3499:6: lv_failed_when_4_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenEConditionalExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_92);
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

            // InternalAnsibleDsl.g:3517:3: (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==101) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAnsibleDsl.g:3518:4: otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,101,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3522:4: ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3523:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3523:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3524:6: lv_any_errors_fatal_6_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_90); 

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

            // InternalAnsibleDsl.g:3541:3: (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==102) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalAnsibleDsl.g:3542:4: otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,102,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3546:4: ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3547:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3547:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3548:6: lv_ignore_errors_8_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_91); 

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

            // InternalAnsibleDsl.g:3565:3: (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==103) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAnsibleDsl.g:3566:4: otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,103,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3570:4: ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3571:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3571:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3572:6: lv_ignore_unreachable_10_0= RULE_BOOLEAN
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


    // $ANTLR start "entryRuleEBaseCommonKeywords"
    // InternalAnsibleDsl.g:3593:1: entryRuleEBaseCommonKeywords returns [EObject current=null] : iv_ruleEBaseCommonKeywords= ruleEBaseCommonKeywords EOF ;
    public final EObject entryRuleEBaseCommonKeywords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBaseCommonKeywords = null;


        try {
            // InternalAnsibleDsl.g:3593:60: (iv_ruleEBaseCommonKeywords= ruleEBaseCommonKeywords EOF )
            // InternalAnsibleDsl.g:3594:2: iv_ruleEBaseCommonKeywords= ruleEBaseCommonKeywords EOF
            {
             newCompositeNode(grammarAccess.getEBaseCommonKeywordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBaseCommonKeywords=ruleEBaseCommonKeywords();

            state._fsp--;

             current =iv_ruleEBaseCommonKeywords; 
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
    // $ANTLR end "entryRuleEBaseCommonKeywords"


    // $ANTLR start "ruleEBaseCommonKeywords"
    // InternalAnsibleDsl.g:3600:1: ruleEBaseCommonKeywords returns [EObject current=null] : ( () ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_2_0= ruleEValidationMode ) )? ( (lv_connection_3_0= ruleEConnection ) )? (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )? (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )? (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )? (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )? (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )? (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )? (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )? ) ;
    public final EObject ruleEBaseCommonKeywords() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token lv_no_log_5_0=null;
        Token otherlv_6=null;
        Token lv_debugger_7_1=null;
        Token lv_debugger_7_2=null;
        Token lv_debugger_7_3=null;
        Token lv_debugger_7_4=null;
        Token lv_debugger_7_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_privilage_escalation_1_0 = null;

        EObject lv_validation_mode_2_0 = null;

        EObject lv_connection_3_0 = null;

        EObject lv_module_defaults_9_0 = null;

        EObject lv_environment_11_0 = null;

        EObject lv_collections_13_0 = null;

        EObject lv_tags_15_0 = null;

        EObject lv_variable_declarations_17_0 = null;

        EObject lv_variable_declarations_19_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3606:2: ( ( () ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_2_0= ruleEValidationMode ) )? ( (lv_connection_3_0= ruleEConnection ) )? (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )? (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )? (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )? (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )? (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )? (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )? (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )? ) )
            // InternalAnsibleDsl.g:3607:2: ( () ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_2_0= ruleEValidationMode ) )? ( (lv_connection_3_0= ruleEConnection ) )? (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )? (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )? (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )? (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )? (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )? (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )? (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )? )
            {
            // InternalAnsibleDsl.g:3607:2: ( () ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_2_0= ruleEValidationMode ) )? ( (lv_connection_3_0= ruleEConnection ) )? (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )? (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )? (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )? (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )? (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )? (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )? (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )? )
            // InternalAnsibleDsl.g:3608:3: () ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_2_0= ruleEValidationMode ) )? ( (lv_connection_3_0= ruleEConnection ) )? (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )? (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )? (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )? (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )? (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )? (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )? (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )?
            {
            // InternalAnsibleDsl.g:3608:3: ()
            // InternalAnsibleDsl.g:3609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBaseCommonKeywordsAccess().getEBaseCommonKeywordsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:3615:3: ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==83) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAnsibleDsl.g:3616:4: (lv_privilage_escalation_1_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:3616:4: (lv_privilage_escalation_1_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:3617:5: lv_privilage_escalation_1_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_94);
                    lv_privilage_escalation_1_0=ruleEPrivilageEscalation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEBaseCommonKeywordsRule());
                    					}
                    					set(
                    						current,
                    						"privilage_escalation",
                    						lv_privilage_escalation_1_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EPrivilageEscalation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3634:3: ( (lv_validation_mode_2_0= ruleEValidationMode ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==89) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalAnsibleDsl.g:3635:4: (lv_validation_mode_2_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:3635:4: (lv_validation_mode_2_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:3636:5: lv_validation_mode_2_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getValidation_modeEValidationModeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_95);
                    lv_validation_mode_2_0=ruleEValidationMode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEBaseCommonKeywordsRule());
                    					}
                    					set(
                    						current,
                    						"validation_mode",
                    						lv_validation_mode_2_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EValidationMode");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3653:3: ( (lv_connection_3_0= ruleEConnection ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==92) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAnsibleDsl.g:3654:4: (lv_connection_3_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:3654:4: (lv_connection_3_0= ruleEConnection )
                    // InternalAnsibleDsl.g:3655:5: lv_connection_3_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getConnectionEConnectionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_96);
                    lv_connection_3_0=ruleEConnection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEBaseCommonKeywordsRule());
                    					}
                    					set(
                    						current,
                    						"connection",
                    						lv_connection_3_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EConnection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3672:3: (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==107) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAnsibleDsl.g:3673:4: otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) )
                    {
                    otherlv_4=(Token)match(input,107,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getEBaseCommonKeywordsAccess().getNo_logKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3677:4: ( (lv_no_log_5_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3678:5: (lv_no_log_5_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3678:5: (lv_no_log_5_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3679:6: lv_no_log_5_0= RULE_BOOLEAN
                    {
                    lv_no_log_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_97); 

                    						newLeafNode(lv_no_log_5_0, grammarAccess.getEBaseCommonKeywordsAccess().getNo_logBOOLEANTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEBaseCommonKeywordsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"no_log",
                    							lv_no_log_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3696:3: (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==108) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalAnsibleDsl.g:3697:4: otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) )
                    {
                    otherlv_6=(Token)match(input,108,FOLLOW_98); 

                    				newLeafNode(otherlv_6, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3701:4: ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:3702:5: ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:3702:5: ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:3703:6: (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:3703:6: (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' )
                    int alt87=5;
                    switch ( input.LA(1) ) {
                    case 109:
                        {
                        alt87=1;
                        }
                        break;
                    case 110:
                        {
                        alt87=2;
                        }
                        break;
                    case 111:
                        {
                        alt87=3;
                        }
                        break;
                    case 112:
                        {
                        alt87=4;
                        }
                        break;
                    case 113:
                        {
                        alt87=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }

                    switch (alt87) {
                        case 1 :
                            // InternalAnsibleDsl.g:3704:7: lv_debugger_7_1= 'always'
                            {
                            lv_debugger_7_1=(Token)match(input,109,FOLLOW_99); 

                            							newLeafNode(lv_debugger_7_1, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerAlwaysKeyword_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBaseCommonKeywordsRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:3715:7: lv_debugger_7_2= 'never'
                            {
                            lv_debugger_7_2=(Token)match(input,110,FOLLOW_99); 

                            							newLeafNode(lv_debugger_7_2, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerNeverKeyword_5_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBaseCommonKeywordsRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_7_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:3726:7: lv_debugger_7_3= 'on_failed'
                            {
                            lv_debugger_7_3=(Token)match(input,111,FOLLOW_99); 

                            							newLeafNode(lv_debugger_7_3, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerOn_failedKeyword_5_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBaseCommonKeywordsRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_7_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:3737:7: lv_debugger_7_4= 'on_unreachable'
                            {
                            lv_debugger_7_4=(Token)match(input,112,FOLLOW_99); 

                            							newLeafNode(lv_debugger_7_4, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerOn_unreachableKeyword_5_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBaseCommonKeywordsRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_7_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:3748:7: lv_debugger_7_5= 'on_skipped'
                            {
                            lv_debugger_7_5=(Token)match(input,113,FOLLOW_99); 

                            							newLeafNode(lv_debugger_7_5, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerOn_skippedKeyword_5_1_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBaseCommonKeywordsRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_7_5, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3762:3: (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==114) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAnsibleDsl.g:3763:4: otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) )
                    {
                    otherlv_8=(Token)match(input,114,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getEBaseCommonKeywordsAccess().getModule_defaultsKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3767:4: ( (lv_module_defaults_9_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3768:5: (lv_module_defaults_9_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3768:5: (lv_module_defaults_9_0= ruleEList )
                    // InternalAnsibleDsl.g:3769:6: lv_module_defaults_9_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getModule_defaultsEListParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_100);
                    lv_module_defaults_9_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBaseCommonKeywordsRule());
                    						}
                    						set(
                    							current,
                    							"module_defaults",
                    							lv_module_defaults_9_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3787:3: (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==115) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAnsibleDsl.g:3788:4: otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,115,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getEBaseCommonKeywordsAccess().getEnvironmentKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:3792:4: ( (lv_environment_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3793:5: (lv_environment_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3793:5: (lv_environment_11_0= ruleEList )
                    // InternalAnsibleDsl.g:3794:6: lv_environment_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getEnvironmentEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_101);
                    lv_environment_11_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBaseCommonKeywordsRule());
                    						}
                    						set(
                    							current,
                    							"environment",
                    							lv_environment_11_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3812:3: (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==116) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalAnsibleDsl.g:3813:4: otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,116,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getEBaseCommonKeywordsAccess().getCollectionsKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:3817:4: ( (lv_collections_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3818:5: (lv_collections_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3818:5: (lv_collections_13_0= ruleEList )
                    // InternalAnsibleDsl.g:3819:6: lv_collections_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getCollectionsEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_102);
                    lv_collections_13_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBaseCommonKeywordsRule());
                    						}
                    						set(
                    							current,
                    							"collections",
                    							lv_collections_13_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3837:3: (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==117) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalAnsibleDsl.g:3838:4: otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,117,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getEBaseCommonKeywordsAccess().getTagsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:3842:4: ( (lv_tags_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3843:5: (lv_tags_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3843:5: (lv_tags_15_0= ruleEList )
                    // InternalAnsibleDsl.g:3844:6: lv_tags_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getTagsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_103);
                    lv_tags_15_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBaseCommonKeywordsRule());
                    						}
                    						set(
                    							current,
                    							"tags",
                    							lv_tags_15_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:3862:3: (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==118) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalAnsibleDsl.g:3863:4: otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}'
                    {
                    otherlv_16=(Token)match(input,118,FOLLOW_54); 

                    				newLeafNode(otherlv_16, grammarAccess.getEBaseCommonKeywordsAccess().getVarsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:3867:4: ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:3868:5: (lv_variable_declarations_17_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:3868:5: (lv_variable_declarations_17_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:3869:6: lv_variable_declarations_17_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_104);
                    lv_variable_declarations_17_0=ruleEVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBaseCommonKeywordsRule());
                    						}
                    						add(
                    							current,
                    							"variable_declarations",
                    							lv_variable_declarations_17_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnsibleDsl.g:3886:4: (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==119) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:3887:5: otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_18=(Token)match(input,119,FOLLOW_54); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getEBaseCommonKeywordsAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:3891:5: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:3892:6: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:3892:6: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:3893:7: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_104);
                    	    lv_variable_declarations_19_0=ruleEVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEBaseCommonKeywordsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable_declarations",
                    	    								lv_variable_declarations_19_0,
                    	    								"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getEBaseCommonKeywordsAccess().getRightCurlyBracketKeyword_10_3());
                    			

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
    // $ANTLR end "ruleEBaseCommonKeywords"


    // $ANTLR start "entryRuleEFactsSettings"
    // InternalAnsibleDsl.g:3920:1: entryRuleEFactsSettings returns [EObject current=null] : iv_ruleEFactsSettings= ruleEFactsSettings EOF ;
    public final EObject entryRuleEFactsSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactsSettings = null;


        try {
            // InternalAnsibleDsl.g:3920:55: (iv_ruleEFactsSettings= ruleEFactsSettings EOF )
            // InternalAnsibleDsl.g:3921:2: iv_ruleEFactsSettings= ruleEFactsSettings EOF
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
    // InternalAnsibleDsl.g:3927:1: ruleEFactsSettings returns [EObject current=null] : ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // InternalAnsibleDsl.g:3933:2: ( ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalAnsibleDsl.g:3934:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalAnsibleDsl.g:3934:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalAnsibleDsl.g:3935:3: () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // InternalAnsibleDsl.g:3935:3: ()
            // InternalAnsibleDsl.g:3936:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactsSettingsAccess().getEFactsSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,120,FOLLOW_105); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactsSettingsAccess().getFacts_setttingsKeyword_1());
            		
            // InternalAnsibleDsl.g:3946:3: (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==121) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalAnsibleDsl.g:3947:4: otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,121,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getEFactsSettingsAccess().getGather_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3951:4: ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3952:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3952:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3953:6: lv_gather_facts_3_0= RULE_BOOLEAN
                    {
                    lv_gather_facts_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_106); 

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

            // InternalAnsibleDsl.g:3970:3: (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==122) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAnsibleDsl.g:3971:4: otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) )
                    {
                    otherlv_4=(Token)match(input,122,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEFactsSettingsAccess().getGather_subsetKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3975:4: ( (lv_gather_subset_5_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3976:5: (lv_gather_subset_5_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3976:5: (lv_gather_subset_5_0= ruleEList )
                    // InternalAnsibleDsl.g:3977:6: lv_gather_subset_5_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEFactsSettingsAccess().getGather_subsetEListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_107);
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

            // InternalAnsibleDsl.g:3995:3: (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==123) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalAnsibleDsl.g:3996:4: otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,123,FOLLOW_71); 

                    				newLeafNode(otherlv_6, grammarAccess.getEFactsSettingsAccess().getGather_timeoutKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4000:4: ( (lv_gather_timeout_7_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:4001:5: (lv_gather_timeout_7_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:4001:5: (lv_gather_timeout_7_0= RULE_INT )
                    // InternalAnsibleDsl.g:4002:6: lv_gather_timeout_7_0= RULE_INT
                    {
                    lv_gather_timeout_7_0=(Token)match(input,RULE_INT,FOLLOW_108); 

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

            // InternalAnsibleDsl.g:4019:3: (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==124) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalAnsibleDsl.g:4020:4: otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,124,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEFactsSettingsAccess().getFact_pathKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4024:4: ( (lv_fact_path_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4025:5: (lv_fact_path_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4025:5: (lv_fact_path_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4026:6: lv_fact_path_9_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4051:1: entryRuleEDelegation returns [EObject current=null] : iv_ruleEDelegation= ruleEDelegation EOF ;
    public final EObject entryRuleEDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDelegation = null;


        try {
            // InternalAnsibleDsl.g:4051:52: (iv_ruleEDelegation= ruleEDelegation EOF )
            // InternalAnsibleDsl.g:4052:2: iv_ruleEDelegation= ruleEDelegation EOF
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
    // InternalAnsibleDsl.g:4058:1: ruleEDelegation returns [EObject current=null] : (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) ;
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
            // InternalAnsibleDsl.g:4064:2: ( (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) )
            // InternalAnsibleDsl.g:4065:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            {
            // InternalAnsibleDsl.g:4065:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            // InternalAnsibleDsl.g:4066:3: otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,125,FOLLOW_109); 

            			newLeafNode(otherlv_0, grammarAccess.getEDelegationAccess().getDelegationKeyword_0());
            		
            // InternalAnsibleDsl.g:4070:3: (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4071:4: otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,126,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEDelegationAccess().getDelegate_toKeyword_1_0());
            			
            // InternalAnsibleDsl.g:4075:4: ( (lv_delegate_to_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4076:5: (lv_delegate_to_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4076:5: (lv_delegate_to_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:4077:6: lv_delegate_to_2_0= RULE_STRING
            {
            lv_delegate_to_2_0=(Token)match(input,RULE_STRING,FOLLOW_110); 

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

            // InternalAnsibleDsl.g:4094:3: (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==127) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalAnsibleDsl.g:4095:4: otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,127,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEDelegationAccess().getDelegate_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4099:4: ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4100:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4100:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4101:6: lv_delegate_facts_4_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4126:1: entryRuleEAsynchronousSettings returns [EObject current=null] : iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF ;
    public final EObject entryRuleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAsynchronousSettings = null;


        try {
            // InternalAnsibleDsl.g:4126:62: (iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF )
            // InternalAnsibleDsl.g:4127:2: iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF
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
    // InternalAnsibleDsl.g:4133:1: ruleEAsynchronousSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_async_2_0=null;
        Token otherlv_3=null;
        Token lv_poll_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4139:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:4140:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:4140:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:4141:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:4141:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:4142:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4145:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:4146:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:4146:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+
            int cnt100=0;
            loop100:
            do {
                int alt100=3;
                int LA100_0 = input.LA(1);

                if ( LA100_0 == 128 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt100=1;
                }
                else if ( LA100_0 == 129 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt100=2;
                }


                switch (alt100) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4147:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4147:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4148:4: {...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4148:115: ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:4149:5: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4152:8: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:4152:9: {...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4152:18: (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:4152:19: otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,128,FOLLOW_71); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAsynchronousSettingsAccess().getAsyncKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4156:8: ( (lv_async_2_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:4157:9: (lv_async_2_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:4157:9: (lv_async_2_0= RULE_INT )
            	    // InternalAnsibleDsl.g:4158:10: lv_async_2_0= RULE_INT
            	    {
            	    lv_async_2_0=(Token)match(input,RULE_INT,FOLLOW_111); 

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
            	    // InternalAnsibleDsl.g:4180:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4180:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4181:4: {...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4181:115: ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:4182:5: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4185:8: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:4185:9: {...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4185:18: (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:4185:19: otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,129,FOLLOW_71); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAsynchronousSettingsAccess().getPollKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4189:8: ( (lv_poll_4_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:4190:9: (lv_poll_4_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:4190:9: (lv_poll_4_0= RULE_INT )
            	    // InternalAnsibleDsl.g:4191:10: lv_poll_4_0= RULE_INT
            	    {
            	    lv_poll_4_0=(Token)match(input,RULE_INT,FOLLOW_111); 

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
            	    if ( cnt100 >= 1 ) break loop100;
                        EarlyExitException eee =
                            new EarlyExitException(100, input);
                        throw eee;
                }
                cnt100++;
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
    // InternalAnsibleDsl.g:4224:1: entryRuleENotifiable returns [EObject current=null] : iv_ruleENotifiable= ruleENotifiable EOF ;
    public final EObject entryRuleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiable = null;


        try {
            // InternalAnsibleDsl.g:4224:52: (iv_ruleENotifiable= ruleENotifiable EOF )
            // InternalAnsibleDsl.g:4225:2: iv_ruleENotifiable= ruleENotifiable EOF
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
    // InternalAnsibleDsl.g:4231:1: ruleENotifiable returns [EObject current=null] : (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) ;
    public final EObject ruleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject this_ENotifiedHandler_0 = null;

        EObject this_ENotifiedTopic_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4237:2: ( (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) )
            // InternalAnsibleDsl.g:4238:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            {
            // InternalAnsibleDsl.g:4238:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_STRING) ) {
                alt101=1;
            }
            else if ( (LA101_0==130) ) {
                alt101=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalAnsibleDsl.g:4239:3: this_ENotifiedHandler_0= ruleENotifiedHandler
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
                    // InternalAnsibleDsl.g:4248:3: this_ENotifiedTopic_1= ruleENotifiedTopic
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
    // InternalAnsibleDsl.g:4260:1: entryRuleENotifiedHandler returns [EObject current=null] : iv_ruleENotifiedHandler= ruleENotifiedHandler EOF ;
    public final EObject entryRuleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedHandler = null;


        try {
            // InternalAnsibleDsl.g:4260:57: (iv_ruleENotifiedHandler= ruleENotifiedHandler EOF )
            // InternalAnsibleDsl.g:4261:2: iv_ruleENotifiedHandler= ruleENotifiedHandler EOF
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
    // InternalAnsibleDsl.g:4267:1: ruleENotifiedHandler returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4273:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4274:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalAnsibleDsl.g:4274:2: ( (otherlv_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4275:3: (otherlv_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4275:3: (otherlv_0= RULE_STRING )
            // InternalAnsibleDsl.g:4276:4: otherlv_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4290:1: entryRuleENotifiedTopic returns [EObject current=null] : iv_ruleENotifiedTopic= ruleENotifiedTopic EOF ;
    public final EObject entryRuleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedTopic = null;


        try {
            // InternalAnsibleDsl.g:4290:55: (iv_ruleENotifiedTopic= ruleENotifiedTopic EOF )
            // InternalAnsibleDsl.g:4291:2: iv_ruleENotifiedTopic= ruleENotifiedTopic EOF
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
    // InternalAnsibleDsl.g:4297:1: ruleENotifiedTopic returns [EObject current=null] : (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4303:2: ( (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:4304:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:4304:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4305:3: otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,130,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getENotifiedTopicAccess().getTopicKeyword_0());
            		
            // InternalAnsibleDsl.g:4309:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4310:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4310:4: (lv_name_1_0= RULE_STRING )
            // InternalAnsibleDsl.g:4311:5: lv_name_1_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4331:1: entryRuleEValuePassed returns [EObject current=null] : iv_ruleEValuePassed= ruleEValuePassed EOF ;
    public final EObject entryRuleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassed = null;


        try {
            // InternalAnsibleDsl.g:4331:53: (iv_ruleEValuePassed= ruleEValuePassed EOF )
            // InternalAnsibleDsl.g:4332:2: iv_ruleEValuePassed= ruleEValuePassed EOF
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
    // InternalAnsibleDsl.g:4338:1: ruleEValuePassed returns [EObject current=null] : (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered ) ;
    public final EObject ruleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject this_EValue_0 = null;

        EObject this_EFactGathered_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4344:2: ( (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered ) )
            // InternalAnsibleDsl.g:4345:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered )
            {
            // InternalAnsibleDsl.g:4345:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( ((LA102_0>=RULE_STRING && LA102_0<=RULE_BOOLEAN)||(LA102_0>=RULE_INT && LA102_0<=RULE_NULL)||LA102_0==131||(LA102_0>=137 && LA102_0<=138)) ) {
                alt102=1;
            }
            else if ( (LA102_0==136) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalAnsibleDsl.g:4346:3: this_EValue_0= ruleEValue
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
                    // InternalAnsibleDsl.g:4355:3: this_EFactGathered_1= ruleEFactGathered
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedAccess().getEFactGatheredParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFactGathered_1=ruleEFactGathered();

                    state._fsp--;


                    			current = this_EFactGathered_1;
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
    // InternalAnsibleDsl.g:4367:1: entryRuleEValue returns [EObject current=null] : iv_ruleEValue= ruleEValue EOF ;
    public final EObject entryRuleEValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValue = null;


        try {
            // InternalAnsibleDsl.g:4367:47: (iv_ruleEValue= ruleEValue EOF )
            // InternalAnsibleDsl.g:4368:2: iv_ruleEValue= ruleEValue EOF
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
    // InternalAnsibleDsl.g:4374:1: ruleEValue returns [EObject current=null] : (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_EFilteredVariablesAndString_2= ruleEFilteredVariablesAndString | ( (lv_value_string_3_0= RULE_BOOLEAN ) ) | ( (lv_value_string_4_0= RULE_NULL ) ) | ( (lv_value_int_5_0= RULE_INT ) ) ) ;
    public final EObject ruleEValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_string_3_0=null;
        Token lv_value_string_4_0=null;
        Token lv_value_int_5_0=null;
        EObject this_EDictionary_0 = null;

        EObject this_EList_1 = null;

        EObject this_EFilteredVariablesAndString_2 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4380:2: ( (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_EFilteredVariablesAndString_2= ruleEFilteredVariablesAndString | ( (lv_value_string_3_0= RULE_BOOLEAN ) ) | ( (lv_value_string_4_0= RULE_NULL ) ) | ( (lv_value_int_5_0= RULE_INT ) ) ) )
            // InternalAnsibleDsl.g:4381:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_EFilteredVariablesAndString_2= ruleEFilteredVariablesAndString | ( (lv_value_string_3_0= RULE_BOOLEAN ) ) | ( (lv_value_string_4_0= RULE_NULL ) ) | ( (lv_value_int_5_0= RULE_INT ) ) )
            {
            // InternalAnsibleDsl.g:4381:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_EFilteredVariablesAndString_2= ruleEFilteredVariablesAndString | ( (lv_value_string_3_0= RULE_BOOLEAN ) ) | ( (lv_value_string_4_0= RULE_NULL ) ) | ( (lv_value_int_5_0= RULE_INT ) ) )
            int alt103=6;
            switch ( input.LA(1) ) {
            case 137:
                {
                alt103=1;
                }
                break;
            case 138:
                {
                alt103=2;
                }
                break;
            case RULE_STRING:
            case 131:
                {
                alt103=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt103=4;
                }
                break;
            case RULE_NULL:
                {
                alt103=5;
                }
                break;
            case RULE_INT:
                {
                alt103=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalAnsibleDsl.g:4382:3: this_EDictionary_0= ruleEDictionary
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
                    // InternalAnsibleDsl.g:4391:3: this_EList_1= ruleEList
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
                    // InternalAnsibleDsl.g:4400:3: this_EFilteredVariablesAndString_2= ruleEFilteredVariablesAndString
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
                    // InternalAnsibleDsl.g:4409:3: ( (lv_value_string_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:4409:3: ( (lv_value_string_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4410:4: (lv_value_string_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4410:4: (lv_value_string_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4411:5: lv_value_string_3_0= RULE_BOOLEAN
                    {
                    lv_value_string_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_value_string_3_0, grammarAccess.getEValueAccess().getValue_stringBOOLEANTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_string",
                    						lv_value_string_3_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAnsibleDsl.g:4428:3: ( (lv_value_string_4_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:4428:3: ( (lv_value_string_4_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:4429:4: (lv_value_string_4_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:4429:4: (lv_value_string_4_0= RULE_NULL )
                    // InternalAnsibleDsl.g:4430:5: lv_value_string_4_0= RULE_NULL
                    {
                    lv_value_string_4_0=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    					newLeafNode(lv_value_string_4_0, grammarAccess.getEValueAccess().getValue_stringNULLTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_string",
                    						lv_value_string_4_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NULL");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAnsibleDsl.g:4447:3: ( (lv_value_int_5_0= RULE_INT ) )
                    {
                    // InternalAnsibleDsl.g:4447:3: ( (lv_value_int_5_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:4448:4: (lv_value_int_5_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:4448:4: (lv_value_int_5_0= RULE_INT )
                    // InternalAnsibleDsl.g:4449:5: lv_value_int_5_0= RULE_INT
                    {
                    lv_value_int_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_value_int_5_0, grammarAccess.getEValueAccess().getValue_intINTTerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_int",
                    						lv_value_int_5_0,
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
    // $ANTLR end "ruleEValue"


    // $ANTLR start "entryRuleEFilteredVariable"
    // InternalAnsibleDsl.g:4469:1: entryRuleEFilteredVariable returns [EObject current=null] : iv_ruleEFilteredVariable= ruleEFilteredVariable EOF ;
    public final EObject entryRuleEFilteredVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredVariable = null;


        try {
            // InternalAnsibleDsl.g:4469:58: (iv_ruleEFilteredVariable= ruleEFilteredVariable EOF )
            // InternalAnsibleDsl.g:4470:2: iv_ruleEFilteredVariable= ruleEFilteredVariable EOF
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
    // InternalAnsibleDsl.g:4476:1: ruleEFilteredVariable returns [EObject current=null] : (otherlv_0= '{{' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_tail_3_0= ruleEDictionaryPairReference ) ) )* (otherlv_4= '|' ( (lv_filter_commands_5_0= RULE_STRING ) ) )* otherlv_6= '}}' ) ;
    public final EObject ruleEFilteredVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_filter_commands_5_0=null;
        Token otherlv_6=null;
        EObject lv_tail_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4482:2: ( (otherlv_0= '{{' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_tail_3_0= ruleEDictionaryPairReference ) ) )* (otherlv_4= '|' ( (lv_filter_commands_5_0= RULE_STRING ) ) )* otherlv_6= '}}' ) )
            // InternalAnsibleDsl.g:4483:2: (otherlv_0= '{{' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_tail_3_0= ruleEDictionaryPairReference ) ) )* (otherlv_4= '|' ( (lv_filter_commands_5_0= RULE_STRING ) ) )* otherlv_6= '}}' )
            {
            // InternalAnsibleDsl.g:4483:2: (otherlv_0= '{{' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_tail_3_0= ruleEDictionaryPairReference ) ) )* (otherlv_4= '|' ( (lv_filter_commands_5_0= RULE_STRING ) ) )* otherlv_6= '}}' )
            // InternalAnsibleDsl.g:4484:3: otherlv_0= '{{' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '.' ( (lv_tail_3_0= ruleEDictionaryPairReference ) ) )* (otherlv_4= '|' ( (lv_filter_commands_5_0= RULE_STRING ) ) )* otherlv_6= '}}'
            {
            otherlv_0=(Token)match(input,131,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getEFilteredVariableAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:4488:3: ( (otherlv_1= RULE_ID ) )
            // InternalAnsibleDsl.g:4489:4: (otherlv_1= RULE_ID )
            {
            // InternalAnsibleDsl.g:4489:4: (otherlv_1= RULE_ID )
            // InternalAnsibleDsl.g:4490:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEFilteredVariableRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_112); 

            					newLeafNode(otherlv_1, grammarAccess.getEFilteredVariableAccess().getVariableEDeclaredVariableCrossReference_1_0());
            				

            }


            }

            // InternalAnsibleDsl.g:4501:3: (otherlv_2= '.' ( (lv_tail_3_0= ruleEDictionaryPairReference ) ) )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==132) ) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4502:4: otherlv_2= '.' ( (lv_tail_3_0= ruleEDictionaryPairReference ) )
            	    {
            	    otherlv_2=(Token)match(input,132,FOLLOW_54); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEFilteredVariableAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:4506:4: ( (lv_tail_3_0= ruleEDictionaryPairReference ) )
            	    // InternalAnsibleDsl.g:4507:5: (lv_tail_3_0= ruleEDictionaryPairReference )
            	    {
            	    // InternalAnsibleDsl.g:4507:5: (lv_tail_3_0= ruleEDictionaryPairReference )
            	    // InternalAnsibleDsl.g:4508:6: lv_tail_3_0= ruleEDictionaryPairReference
            	    {

            	    						newCompositeNode(grammarAccess.getEFilteredVariableAccess().getTailEDictionaryPairReferenceParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_112);
            	    lv_tail_3_0=ruleEDictionaryPairReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEFilteredVariableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tail",
            	    							lv_tail_3_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.EDictionaryPairReference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop104;
                }
            } while (true);

            // InternalAnsibleDsl.g:4526:3: (otherlv_4= '|' ( (lv_filter_commands_5_0= RULE_STRING ) ) )*
            loop105:
            do {
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==133) ) {
                    alt105=1;
                }


                switch (alt105) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4527:4: otherlv_4= '|' ( (lv_filter_commands_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,133,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEFilteredVariableAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalAnsibleDsl.g:4531:4: ( (lv_filter_commands_5_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:4532:5: (lv_filter_commands_5_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:4532:5: (lv_filter_commands_5_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:4533:6: lv_filter_commands_5_0= RULE_STRING
            	    {
            	    lv_filter_commands_5_0=(Token)match(input,RULE_STRING,FOLLOW_113); 

            	    						newLeafNode(lv_filter_commands_5_0, grammarAccess.getEFilteredVariableAccess().getFilter_commandsSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEFilteredVariableRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"filter_commands",
            	    							lv_filter_commands_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop105;
                }
            } while (true);

            otherlv_6=(Token)match(input,134,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEFilteredVariableAccess().getRightCurlyBracketRightCurlyBracketKeyword_4());
            		

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
    // InternalAnsibleDsl.g:4558:1: entryRuleEFilteredVariableOrString returns [EObject current=null] : iv_ruleEFilteredVariableOrString= ruleEFilteredVariableOrString EOF ;
    public final EObject entryRuleEFilteredVariableOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredVariableOrString = null;


        try {
            // InternalAnsibleDsl.g:4558:66: (iv_ruleEFilteredVariableOrString= ruleEFilteredVariableOrString EOF )
            // InternalAnsibleDsl.g:4559:2: iv_ruleEFilteredVariableOrString= ruleEFilteredVariableOrString EOF
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
    // InternalAnsibleDsl.g:4565:1: ruleEFilteredVariableOrString returns [EObject current=null] : (this_EFilteredVariable_0= ruleEFilteredVariable | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEFilteredVariableOrString() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject this_EFilteredVariable_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4571:2: ( (this_EFilteredVariable_0= ruleEFilteredVariable | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:4572:2: (this_EFilteredVariable_0= ruleEFilteredVariable | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:4572:2: (this_EFilteredVariable_0= ruleEFilteredVariable | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==131) ) {
                alt106=1;
            }
            else if ( (LA106_0==RULE_STRING) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalAnsibleDsl.g:4573:3: this_EFilteredVariable_0= ruleEFilteredVariable
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
                    // InternalAnsibleDsl.g:4582:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:4582:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4583:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4583:4: (lv_string_1_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4584:5: lv_string_1_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4604:1: entryRuleEFilteredVariablesAndString returns [EObject current=null] : iv_ruleEFilteredVariablesAndString= ruleEFilteredVariablesAndString EOF ;
    public final EObject entryRuleEFilteredVariablesAndString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredVariablesAndString = null;


        try {
            // InternalAnsibleDsl.g:4604:68: (iv_ruleEFilteredVariablesAndString= ruleEFilteredVariablesAndString EOF )
            // InternalAnsibleDsl.g:4605:2: iv_ruleEFilteredVariablesAndString= ruleEFilteredVariablesAndString EOF
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
    // InternalAnsibleDsl.g:4611:1: ruleEFilteredVariablesAndString returns [EObject current=null] : ( ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) ) ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )* ) ;
    public final EObject ruleEFilteredVariablesAndString() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_and_string_0_0 = null;

        EObject lv_variable_and_string_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4617:2: ( ( ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) ) ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )* ) )
            // InternalAnsibleDsl.g:4618:2: ( ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) ) ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )* )
            {
            // InternalAnsibleDsl.g:4618:2: ( ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) ) ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )* )
            // InternalAnsibleDsl.g:4619:3: ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) ) ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )*
            {
            // InternalAnsibleDsl.g:4619:3: ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) )
            // InternalAnsibleDsl.g:4620:4: (lv_variable_and_string_0_0= ruleEFilteredVariableOrString )
            {
            // InternalAnsibleDsl.g:4620:4: (lv_variable_and_string_0_0= ruleEFilteredVariableOrString )
            // InternalAnsibleDsl.g:4621:5: lv_variable_and_string_0_0= ruleEFilteredVariableOrString
            {

            					newCompositeNode(grammarAccess.getEFilteredVariablesAndStringAccess().getVariable_and_stringEFilteredVariableOrStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_114);
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

            // InternalAnsibleDsl.g:4638:3: ( (lv_variable_and_string_1_0= ruleEFilteredVariableOrString ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==RULE_STRING||LA107_0==131) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4639:4: (lv_variable_and_string_1_0= ruleEFilteredVariableOrString )
            	    {
            	    // InternalAnsibleDsl.g:4639:4: (lv_variable_and_string_1_0= ruleEFilteredVariableOrString )
            	    // InternalAnsibleDsl.g:4640:5: lv_variable_and_string_1_0= ruleEFilteredVariableOrString
            	    {

            	    					newCompositeNode(grammarAccess.getEFilteredVariablesAndStringAccess().getVariable_and_stringEFilteredVariableOrStringParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_114);
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
            	    break loop107;
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
    // InternalAnsibleDsl.g:4661:1: entryRuleEDictionaryPairReference returns [EObject current=null] : iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF ;
    public final EObject entryRuleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPairReference = null;


        try {
            // InternalAnsibleDsl.g:4661:65: (iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF )
            // InternalAnsibleDsl.g:4662:2: iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF
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
    // InternalAnsibleDsl.g:4668:1: ruleEDictionaryPairReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4674:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:4675:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAnsibleDsl.g:4675:2: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:4676:3: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:4676:3: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:4677:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEDictionaryPairReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEDictionaryPairReferenceAccess().getNameEDictionaryPairCrossReference_0());
            			

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
    // InternalAnsibleDsl.g:4691:1: entryRuleEVariableDeclaration returns [EObject current=null] : iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF ;
    public final EObject entryRuleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclaration = null;


        try {
            // InternalAnsibleDsl.g:4691:61: (iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF )
            // InternalAnsibleDsl.g:4692:2: iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF
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
    // InternalAnsibleDsl.g:4698:1: ruleEVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4704:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:4705:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:4705:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:4706:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:4706:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:4707:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:4707:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:4708:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_57); 

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

            otherlv_1=(Token)match(input,50,FOLLOW_115); 

            			newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:4728:3: ( (lv_value_passed_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:4729:4: (lv_value_passed_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:4729:4: (lv_value_passed_2_0= ruleEValue )
            // InternalAnsibleDsl.g:4730:5: lv_value_passed_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:4751:1: entryRuleERegisterVariable returns [EObject current=null] : iv_ruleERegisterVariable= ruleERegisterVariable EOF ;
    public final EObject entryRuleERegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariable = null;


        try {
            // InternalAnsibleDsl.g:4751:58: (iv_ruleERegisterVariable= ruleERegisterVariable EOF )
            // InternalAnsibleDsl.g:4752:2: iv_ruleERegisterVariable= ruleERegisterVariable EOF
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
    // InternalAnsibleDsl.g:4758:1: ruleERegisterVariable returns [EObject current=null] : (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleERegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4764:2: ( (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:4765:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:4765:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:4766:3: otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,135,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableAccess().getRegisterKeyword_0());
            		
            // InternalAnsibleDsl.g:4770:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:4771:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:4771:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:4772:5: lv_name_1_0= RULE_ID
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
    // InternalAnsibleDsl.g:4792:1: entryRuleEFactGathered returns [EObject current=null] : iv_ruleEFactGathered= ruleEFactGathered EOF ;
    public final EObject entryRuleEFactGathered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactGathered = null;


        try {
            // InternalAnsibleDsl.g:4792:54: (iv_ruleEFactGathered= ruleEFactGathered EOF )
            // InternalAnsibleDsl.g:4793:2: iv_ruleEFactGathered= ruleEFactGathered EOF
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
    // InternalAnsibleDsl.g:4799:1: ruleEFactGathered returns [EObject current=null] : ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEFactGathered() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tail_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4805:2: ( ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:4806:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:4806:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:4807:3: () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            {
            // InternalAnsibleDsl.g:4807:3: ()
            // InternalAnsibleDsl.g:4808:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactGatheredAccess().getEFactGatheredAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,136,FOLLOW_116); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactGatheredAccess().getAnsible_factsKeyword_1());
            		
            // InternalAnsibleDsl.g:4818:3: (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==132) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4819:4: otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,132,FOLLOW_54); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEFactGatheredAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:4823:4: ( (lv_tail_3_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:4824:5: (lv_tail_3_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:4824:5: (lv_tail_3_0= RULE_ID )
            	    // InternalAnsibleDsl.g:4825:6: lv_tail_3_0= RULE_ID
            	    {
            	    lv_tail_3_0=(Token)match(input,RULE_ID,FOLLOW_116); 

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
            	    break loop108;
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
    // InternalAnsibleDsl.g:4846:1: entryRuleEDictionary returns [EObject current=null] : iv_ruleEDictionary= ruleEDictionary EOF ;
    public final EObject entryRuleEDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionary = null;


        try {
            // InternalAnsibleDsl.g:4846:52: (iv_ruleEDictionary= ruleEDictionary EOF )
            // InternalAnsibleDsl.g:4847:2: iv_ruleEDictionary= ruleEDictionary EOF
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
    // InternalAnsibleDsl.g:4853:1: ruleEDictionary returns [EObject current=null] : (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dictionary_pairs_1_0 = null;

        EObject lv_dictionary_pairs_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4859:2: ( (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:4860:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:4860:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:4861:3: otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,137,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getEDictionaryAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:4865:3: ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) )
            // InternalAnsibleDsl.g:4866:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            {
            // InternalAnsibleDsl.g:4866:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            // InternalAnsibleDsl.g:4867:5: lv_dictionary_pairs_1_0= ruleEDictionaryPair
            {

            					newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_104);
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

            // InternalAnsibleDsl.g:4884:3: (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==119) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4885:4: otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    {
            	    otherlv_2=(Token)match(input,119,FOLLOW_54); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEDictionaryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:4889:4: ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    // InternalAnsibleDsl.g:4890:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    {
            	    // InternalAnsibleDsl.g:4890:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    // InternalAnsibleDsl.g:4891:6: lv_dictionary_pairs_3_0= ruleEDictionaryPair
            	    {

            	    						newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_104);
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
            	    break loop109;
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
    // InternalAnsibleDsl.g:4917:1: entryRuleEDictionaryPair returns [EObject current=null] : iv_ruleEDictionaryPair= ruleEDictionaryPair EOF ;
    public final EObject entryRuleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPair = null;


        try {
            // InternalAnsibleDsl.g:4917:56: (iv_ruleEDictionaryPair= ruleEDictionaryPair EOF )
            // InternalAnsibleDsl.g:4918:2: iv_ruleEDictionaryPair= ruleEDictionaryPair EOF
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
    // InternalAnsibleDsl.g:4924:1: ruleEDictionaryPair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4930:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:4931:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:4931:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:4932:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:4932:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:4933:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:4933:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:4934:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_57); 

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

            otherlv_1=(Token)match(input,50,FOLLOW_115); 

            			newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:4954:3: ( (lv_value_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:4955:4: (lv_value_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:4955:4: (lv_value_2_0= ruleEValue )
            // InternalAnsibleDsl.g:4956:5: lv_value_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:4977:1: entryRuleEList returns [EObject current=null] : iv_ruleEList= ruleEList EOF ;
    public final EObject entryRuleEList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEList = null;


        try {
            // InternalAnsibleDsl.g:4977:46: (iv_ruleEList= ruleEList EOF )
            // InternalAnsibleDsl.g:4978:2: iv_ruleEList= ruleEList EOF
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
    // InternalAnsibleDsl.g:4984:1: ruleEList returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4990:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) )
            // InternalAnsibleDsl.g:4991:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            {
            // InternalAnsibleDsl.g:4991:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            // InternalAnsibleDsl.g:4992:3: otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,138,FOLLOW_115); 

            			newLeafNode(otherlv_0, grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:4996:3: ( (lv_elements_1_0= ruleEValue ) )
            // InternalAnsibleDsl.g:4997:4: (lv_elements_1_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:4997:4: (lv_elements_1_0= ruleEValue )
            // InternalAnsibleDsl.g:4998:5: lv_elements_1_0= ruleEValue
            {

            					newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_117);
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

            // InternalAnsibleDsl.g:5015:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==119) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5016:4: otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) )
            	    {
            	    otherlv_2=(Token)match(input,119,FOLLOW_115); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5020:4: ( (lv_elements_3_0= ruleEValue ) )
            	    // InternalAnsibleDsl.g:5021:5: (lv_elements_3_0= ruleEValue )
            	    {
            	    // InternalAnsibleDsl.g:5021:5: (lv_elements_3_0= ruleEValue )
            	    // InternalAnsibleDsl.g:5022:6: lv_elements_3_0= ruleEValue
            	    {

            	    						newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_117);
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
            	    break loop110;
                }
            } while (true);

            otherlv_4=(Token)match(input,139,FOLLOW_2); 

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\21\12\uffff";
    static final String dfa_4s = "\1\170\12\uffff";
    static final String dfa_5s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\1\0\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\1\uffff\1\3\1\5\1\6\1\7\1\10\1\12\55\uffff\1\11\57\uffff\1\4",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 312:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_22_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                         
                        int index13_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_0==EOF||LA13_0==17) ) {s = 1;}

                        else if ( LA13_0 >= 18 && LA13_0 <= 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA13_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA13_0 == 120 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA13_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA13_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA13_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {s = 10;}

                         
                        input.seek(index13_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000007EC0000L,0x0100000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L,0x007C180012080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007FC0002L,0x0100000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L,0x0000001F00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007EC0002L,0x0100000000000100L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L,0x000001E000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000820020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001FEC0002L,0x0100000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000017EC0002L,0x0100000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000060000020000L,0x2000000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L,0x000000E000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000780000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000020000L,0x0000001800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x04000000000001B0L,0x0000000000000004L,0x0000000000000708L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000020000L,0x000006E000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000002L,0x0000000000070200L,0x0000000000000080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000012L,0x0000000000070200L,0x0000000000000084L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00000000000001B0L,0x0000000000000000L,0x0000000000000708L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x03F8000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xFC00000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000040L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000020000L,0x000000000000F800L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000020000L,0x000000000000F000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000020000L,0x000000000000E000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000020000L,0x000000000000C000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000020000L,0x0000000000008000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000070000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000020000L,0x0000000001F00000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000020000L,0x0000000001E00000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000020000L,0x0000000001C00000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000020000L,0x0000000001800000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000020000L,0x0000000001000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000020000L,0x000000000C000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000020000L,0x0000000008000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000020000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000020000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000020000L,0x0000000080000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000001E00000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000001C00000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000002L,0x000000E000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x000004E000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000002L,0x007C180012000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x007C180010000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x007C180000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x007C100000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0003E00000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000002L,0x007C000000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000002L,0x0078000000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000002L,0x0070000000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000002L,0x0060000000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000020000L,0x0080000000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000020000L,0x1E00000000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000020000L,0x1C00000000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000020000L,0x1800000000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000020000L,0x1000000000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000020000L,0x8000000000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x00000000000001B0L,0x0000000000000000L,0x0000000000000608L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000000800L});

}
