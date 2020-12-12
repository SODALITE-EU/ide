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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_NUMBER", "RULE_NULL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'playbook{'", "'playbook_name:'", "'plays{'", "'play{'", "'}'", "'play_name:'", "'no_log:'", "'debugger:'", "'always'", "'never'", "'on_failed'", "'on_unreachable'", "'on_skipped'", "'module_defaults:'", "'environment:'", "'collections:'", "'tags:'", "'vars{'", "','", "'play_exe_settings{'", "'error_handling{'", "'vars_files:'", "'vars_prompt:'", "'force_handlers:'", "'pre_tasks{'", "'tasks_list{'", "'post_tasks{'", "'handlers{'", "'block{'", "'block_name:'", "'exe_settings{'", "'when:'", "'tasks{'", "'rescue_tasks{'", "'always_tasks{'", "'task{'", "'task_name:'", "'action:'", "'asynchronous_settings{'", "'args:'", "'module_call{'", "'notify:'", "'handler{'", "'handler_name:'", "'listen:'", "'module_name:'", "'parameters{'", "':'", "'role{'", "'role_name:'", "'roles_inclusions{'", "'loop:'", "'loop_control{'", "'label:'", "'pause:'", "'index_var:'", "'loop_var:'", "'extended:'", "'until:'", "'retries:'", "'delay:'", "'privilage_escalation{'", "'become:'", "'become_exe:'", "'become_flags:'", "'become_method:'", "'become_user:'", "'validation_mode{'", "'check_mode:'", "'diff:'", "'connection_info{'", "'connection:'", "'port:'", "'remote_user:'", "'strategy:'", "'serial:'", "'order:'", "'throttle:'", "'run_once:'", "'any_errors_fatal:'", "'ignore_errors:'", "'ignore_unreachable:'", "'max_fail_percentage:'", "'changed_when:'", "'failed_when:'", "'facts_setttings{'", "'gather_facts:'", "'gather_subset:'", "'gather_timeout:'", "'fact_path:'", "'delegation{'", "'delegate_to:'", "'delegate_facts:'", "'async:'", "'poll:'", "'topic:'", "'item'", "'.'", "'['", "']'", "'{{'", "'}}'", "'('", "')'", "'|'", "'or'", "'and'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'/'", "'//'", "'%'", "'*'", "'**'", "'is'", "'not'", "'in'", "'return'", "'if'", "'else'", "'register:'", "'ansible_facts'", "'{'"
    };
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

            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEPlaybookAccess().getPlaysKeyword_3());
            		
            // InternalAnsibleDsl.g:134:3: (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAnsibleDsl.g:135:4: otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_7); 

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

            	    otherlv_6=(Token)match(input,18,FOLLOW_9); 

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

            otherlv_7=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
            case 42:
                {
                alt2=1;
                }
                break;
            case 49:
            case 56:
                {
                alt2=2;
                }
                break;
            case 62:
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

            if ( (LA3_0==42) ) {
                alt3=1;
            }
            else if ( (LA3_0==49) ) {
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

            if ( (LA4_0==49) ) {
                alt4=1;
            }
            else if ( (LA4_0==56) ) {
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
            	    otherlv_1=(Token)match(input,19,FOLLOW_4); 

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

            	    if ( (LA5_0==75) ) {
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

            	    if ( (LA6_0==81) ) {
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

            	    if ( (LA7_0==84) ) {
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

            	    if ( (LA8_0==20) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:400:9: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
            	            {
            	            otherlv_6=(Token)match(input,20,FOLLOW_14); 

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

            	    if ( (LA10_0==21) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:424:9: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
            	            {
            	            otherlv_8=(Token)match(input,21,FOLLOW_16); 

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
            	            case 22:
            	                {
            	                alt9=1;
            	                }
            	                break;
            	            case 23:
            	                {
            	                alt9=2;
            	                }
            	                break;
            	            case 24:
            	                {
            	                alt9=3;
            	                }
            	                break;
            	            case 25:
            	                {
            	                alt9=4;
            	                }
            	                break;
            	            case 26:
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
            	                    lv_debugger_9_1=(Token)match(input,22,FOLLOW_17); 

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
            	                    lv_debugger_9_2=(Token)match(input,23,FOLLOW_17); 

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
            	                    lv_debugger_9_3=(Token)match(input,24,FOLLOW_17); 

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
            	                    lv_debugger_9_4=(Token)match(input,25,FOLLOW_17); 

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
            	                    lv_debugger_9_5=(Token)match(input,26,FOLLOW_17); 

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

            	    if ( (LA11_0==27) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:490:9: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
            	            {
            	            otherlv_10=(Token)match(input,27,FOLLOW_18); 

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

            	    if ( (LA12_0==28) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:515:9: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
            	            {
            	            otherlv_12=(Token)match(input,28,FOLLOW_18); 

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

            	    if ( (LA13_0==29) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:540:9: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
            	            {
            	            otherlv_14=(Token)match(input,29,FOLLOW_18); 

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

            	    if ( (LA14_0==30) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:565:9: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
            	            {
            	            otherlv_16=(Token)match(input,30,FOLLOW_18); 

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

            	    if ( (LA16_0==31) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:590:9: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
            	            {
            	            otherlv_18=(Token)match(input,31,FOLLOW_23); 

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

            	                if ( (LA15_0==32) ) {
            	                    alt15=1;
            	                }


            	                switch (alt15) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:614:10: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
            	            	    {
            	            	    otherlv_20=(Token)match(input,32,FOLLOW_23); 

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

            	            otherlv_22=(Token)match(input,18,FOLLOW_25); 

            	            									newLeafNode(otherlv_22, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_0_10_3());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:643:8: (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==33) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:644:9: otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}'
            	            {
            	            otherlv_23=(Token)match(input,33,FOLLOW_26); 

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

            	            otherlv_25=(Token)match(input,18,FOLLOW_27); 

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
            	    otherlv_26=(Token)match(input,34,FOLLOW_28); 

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

            	    otherlv_28=(Token)match(input,18,FOLLOW_27); 

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
            	    otherlv_30=(Token)match(input,35,FOLLOW_18); 

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
            	    otherlv_32=(Token)match(input,36,FOLLOW_18); 

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
            	    otherlv_34=(Token)match(input,37,FOLLOW_14); 

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
            	    otherlv_36=(Token)match(input,38,FOLLOW_29); 

            	    								newLeafNode(otherlv_36, grammarAccess.getEPlayAccess().getPre_tasksKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:854:8: ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==42||LA18_0==49) ) {
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

            	    otherlv_38=(Token)match(input,18,FOLLOW_27); 

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
            	    otherlv_40=(Token)match(input,39,FOLLOW_29); 

            	    								newLeafNode(otherlv_40, grammarAccess.getEPlayAccess().getTasks_listKeyword_8_0());
            	    							
            	    // InternalAnsibleDsl.g:920:8: ( (lv_tasks_list_41_0= ruleEBlockTask ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==42||LA19_0==49) ) {
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

            	    otherlv_42=(Token)match(input,18,FOLLOW_31); 

            	    								newLeafNode(otherlv_42, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_2());
            	    							
            	    // InternalAnsibleDsl.g:943:8: (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==40) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:944:9: otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}'
            	            {
            	            otherlv_43=(Token)match(input,40,FOLLOW_29); 

            	            									newLeafNode(otherlv_43, grammarAccess.getEPlayAccess().getPost_tasksKeyword_8_3_0());
            	            								
            	            // InternalAnsibleDsl.g:948:9: ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+
            	            int cnt20=0;
            	            loop20:
            	            do {
            	                int alt20=2;
            	                int LA20_0 = input.LA(1);

            	                if ( (LA20_0==42||LA20_0==49) ) {
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

            	            otherlv_45=(Token)match(input,18,FOLLOW_32); 

            	            									newLeafNode(otherlv_45, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_3_2());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:972:8: (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==41) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:973:9: otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}'
            	            {
            	            otherlv_46=(Token)match(input,41,FOLLOW_33); 

            	            									newLeafNode(otherlv_46, grammarAccess.getEPlayAccess().getHandlersKeyword_8_4_0());
            	            								
            	            // InternalAnsibleDsl.g:977:9: ( (lv_handlers_47_0= ruleEHandler ) )+
            	            int cnt22=0;
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==56) ) {
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

            	            otherlv_48=(Token)match(input,18,FOLLOW_27); 

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
    // InternalAnsibleDsl.g:1025:1: ruleEBlock returns [EObject current=null] : (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' ) ;
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
            // InternalAnsibleDsl.g:1031:2: ( (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' ) )
            // InternalAnsibleDsl.g:1032:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' )
            {
            // InternalAnsibleDsl.g:1032:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' )
            // InternalAnsibleDsl.g:1033:3: otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getEBlockAccess().getBlockKeyword_0());
            		
            // InternalAnsibleDsl.g:1037:3: (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:1038:4: otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,43,FOLLOW_4); 

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

            if ( (LA25_0==75) ) {
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

            if ( (LA26_0==81) ) {
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

            if ( (LA27_0==84) ) {
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

            if ( (LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAnsibleDsl.g:1119:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_14); 

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

            if ( (LA30_0==21) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnsibleDsl.g:1143:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_16); 

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
                    case 22:
                        {
                        alt29=1;
                        }
                        break;
                    case 23:
                        {
                        alt29=2;
                        }
                        break;
                    case 24:
                        {
                        alt29=3;
                        }
                        break;
                    case 25:
                        {
                        alt29=4;
                        }
                        break;
                    case 26:
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
                            lv_debugger_9_1=(Token)match(input,22,FOLLOW_41); 

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
                            lv_debugger_9_2=(Token)match(input,23,FOLLOW_41); 

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
                            lv_debugger_9_3=(Token)match(input,24,FOLLOW_41); 

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
                            lv_debugger_9_4=(Token)match(input,25,FOLLOW_41); 

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
                            lv_debugger_9_5=(Token)match(input,26,FOLLOW_41); 

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

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnsibleDsl.g:1209:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_18); 

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

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnsibleDsl.g:1234:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_18); 

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

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnsibleDsl.g:1259:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_18); 

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

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAnsibleDsl.g:1284:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_18); 

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

            if ( (LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAnsibleDsl.g:1309:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,31,FOLLOW_23); 

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

                        if ( (LA35_0==32) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1333:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,32,FOLLOW_23); 

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

                    otherlv_22=(Token)match(input,18,FOLLOW_46); 

                    				newLeafNode(otherlv_22, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1362:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAnsibleDsl.g:1363:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,44,FOLLOW_47); 

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

                    otherlv_25=(Token)match(input,18,FOLLOW_48); 

                    				newLeafNode(otherlv_25, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1391:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==104) ) {
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

            // InternalAnsibleDsl.g:1410:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAnsibleDsl.g:1411:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,45,FOLLOW_50); 

                    				newLeafNode(otherlv_27, grammarAccess.getEBlockAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:1415:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:1416:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:1416:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:1417:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            // InternalAnsibleDsl.g:1435:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==34) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAnsibleDsl.g:1436:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,34,FOLLOW_52); 

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

                    otherlv_31=(Token)match(input,18,FOLLOW_53); 

                    				newLeafNode(otherlv_31, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            otherlv_32=(Token)match(input,46,FOLLOW_29); 

            			newLeafNode(otherlv_32, grammarAccess.getEBlockAccess().getTasksKeyword_16());
            		
            // InternalAnsibleDsl.g:1468:3: ( (lv_tasks_33_0= ruleETask ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==49) ) {
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

            otherlv_34=(Token)match(input,18,FOLLOW_54); 

            			newLeafNode(otherlv_34, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_18());
            		
            // InternalAnsibleDsl.g:1491:3: (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAnsibleDsl.g:1492:4: otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}'
                    {
                    otherlv_35=(Token)match(input,47,FOLLOW_29); 

                    				newLeafNode(otherlv_35, grammarAccess.getEBlockAccess().getRescue_tasksKeyword_19_0());
                    			
                    // InternalAnsibleDsl.g:1496:4: ( (lv_rescue_tasks_36_0= ruleETask ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==49) ) {
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

                    otherlv_37=(Token)match(input,18,FOLLOW_55); 

                    				newLeafNode(otherlv_37, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_19_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1520:3: (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAnsibleDsl.g:1521:4: otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}'
                    {
                    otherlv_38=(Token)match(input,48,FOLLOW_29); 

                    				newLeafNode(otherlv_38, grammarAccess.getEBlockAccess().getAlways_tasksKeyword_20_0());
                    			
                    // InternalAnsibleDsl.g:1525:4: ( (lv_always_tasks_39_0= ruleETask ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==49) ) {
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

                    otherlv_40=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_40, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_20_2());
                    			

                    }
                    break;

            }

            otherlv_41=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:1564:1: ruleETask returns [EObject current=null] : (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' ) ;
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
            // InternalAnsibleDsl.g:1570:2: ( (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' ) )
            // InternalAnsibleDsl.g:1571:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' )
            {
            // InternalAnsibleDsl.g:1571:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' )
            // InternalAnsibleDsl.g:1572:3: otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getETaskAccess().getTaskKeyword_0());
            		
            // InternalAnsibleDsl.g:1576:3: (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:1577:4: otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,50,FOLLOW_4); 

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

            if ( (LA46_0==75) ) {
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

            if ( (LA47_0==81) ) {
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

            if ( (LA48_0==84) ) {
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

            if ( (LA49_0==20) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAnsibleDsl.g:1658:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_14); 

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

            if ( (LA51_0==21) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAnsibleDsl.g:1682:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_16); 

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
                    case 22:
                        {
                        alt50=1;
                        }
                        break;
                    case 23:
                        {
                        alt50=2;
                        }
                        break;
                    case 24:
                        {
                        alt50=3;
                        }
                        break;
                    case 25:
                        {
                        alt50=4;
                        }
                        break;
                    case 26:
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
                            lv_debugger_9_1=(Token)match(input,22,FOLLOW_62); 

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
                            lv_debugger_9_2=(Token)match(input,23,FOLLOW_62); 

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
                            lv_debugger_9_3=(Token)match(input,24,FOLLOW_62); 

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
                            lv_debugger_9_4=(Token)match(input,25,FOLLOW_62); 

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
                            lv_debugger_9_5=(Token)match(input,26,FOLLOW_62); 

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

            if ( (LA52_0==27) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAnsibleDsl.g:1748:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_18); 

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

            if ( (LA53_0==28) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAnsibleDsl.g:1773:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_18); 

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

            if ( (LA54_0==29) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAnsibleDsl.g:1798:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_18); 

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

            if ( (LA55_0==30) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAnsibleDsl.g:1823:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_18); 

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

            if ( (LA57_0==31) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAnsibleDsl.g:1848:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,31,FOLLOW_23); 

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

                        if ( (LA56_0==32) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1872:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,32,FOLLOW_23); 

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

                    otherlv_22=(Token)match(input,18,FOLLOW_67); 

                    				newLeafNode(otherlv_22, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1901:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==44) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAnsibleDsl.g:1902:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,44,FOLLOW_47); 

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

                    otherlv_25=(Token)match(input,18,FOLLOW_68); 

                    				newLeafNode(otherlv_25, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1930:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==104) ) {
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

            // InternalAnsibleDsl.g:1949:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==45) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAnsibleDsl.g:1950:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,45,FOLLOW_50); 

                    				newLeafNode(otherlv_27, grammarAccess.getETaskAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:1954:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:1955:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:1955:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:1956:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_70);
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

            // InternalAnsibleDsl.g:1974:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==34) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAnsibleDsl.g:1975:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,34,FOLLOW_71); 

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

                    otherlv_31=(Token)match(input,18,FOLLOW_72); 

                    				newLeafNode(otherlv_31, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2003:3: (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==51) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAnsibleDsl.g:2004:4: otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) )
                    {
                    otherlv_32=(Token)match(input,51,FOLLOW_4); 

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

            if ( (LA63_0==52) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAnsibleDsl.g:2028:4: otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}'
                    {
                    otherlv_34=(Token)match(input,52,FOLLOW_74); 

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

                    otherlv_36=(Token)match(input,18,FOLLOW_75); 

                    				newLeafNode(otherlv_36, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_17_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2056:3: (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==53) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAnsibleDsl.g:2057:4: otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) )
                    {
                    otherlv_37=(Token)match(input,53,FOLLOW_76); 

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

            otherlv_39=(Token)match(input,54,FOLLOW_78); 

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

            otherlv_41=(Token)match(input,18,FOLLOW_79); 

            			newLeafNode(otherlv_41, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_21());
            		
            // InternalAnsibleDsl.g:2108:3: (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==55) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalAnsibleDsl.g:2109:4: otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    {
                    otherlv_42=(Token)match(input,55,FOLLOW_80); 

                    				newLeafNode(otherlv_42, grammarAccess.getETaskAccess().getNotifyKeyword_22_0());
                    			
                    // InternalAnsibleDsl.g:2113:4: ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_STRING||LA65_0==109) ) {
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

            if ( (LA67_0==65||(LA67_0>=72 && LA67_0<=74)) ) {
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

            if ( (LA68_0==140) ) {
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

            otherlv_46=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:2186:1: ruleEHandler returns [EObject current=null] : (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' ) ;
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
            // InternalAnsibleDsl.g:2192:2: ( (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' ) )
            // InternalAnsibleDsl.g:2193:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' )
            {
            // InternalAnsibleDsl.g:2193:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' )
            // InternalAnsibleDsl.g:2194:3: otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_83); 

            			newLeafNode(otherlv_0, grammarAccess.getEHandlerAccess().getHandlerKeyword_0());
            		
            // InternalAnsibleDsl.g:2198:3: (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:2199:4: otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,57,FOLLOW_4); 

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

            if ( (LA69_0==75) ) {
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

            if ( (LA70_0==81) ) {
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

            if ( (LA71_0==84) ) {
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

            if ( (LA72_0==20) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAnsibleDsl.g:2280:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_14); 

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

            if ( (LA74_0==21) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAnsibleDsl.g:2304:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_16); 

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
                    case 22:
                        {
                        alt73=1;
                        }
                        break;
                    case 23:
                        {
                        alt73=2;
                        }
                        break;
                    case 24:
                        {
                        alt73=3;
                        }
                        break;
                    case 25:
                        {
                        alt73=4;
                        }
                        break;
                    case 26:
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
                            lv_debugger_9_1=(Token)match(input,22,FOLLOW_62); 

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
                            lv_debugger_9_2=(Token)match(input,23,FOLLOW_62); 

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
                            lv_debugger_9_3=(Token)match(input,24,FOLLOW_62); 

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
                            lv_debugger_9_4=(Token)match(input,25,FOLLOW_62); 

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
                            lv_debugger_9_5=(Token)match(input,26,FOLLOW_62); 

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

            if ( (LA75_0==27) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAnsibleDsl.g:2370:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_18); 

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

            if ( (LA76_0==28) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAnsibleDsl.g:2395:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_18); 

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

            if ( (LA77_0==29) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAnsibleDsl.g:2420:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_18); 

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

            if ( (LA78_0==30) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAnsibleDsl.g:2445:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_18); 

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

            if ( (LA80_0==31) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAnsibleDsl.g:2470:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,31,FOLLOW_23); 

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

                        if ( (LA79_0==32) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2494:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,32,FOLLOW_23); 

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

                    otherlv_22=(Token)match(input,18,FOLLOW_67); 

                    				newLeafNode(otherlv_22, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2523:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==44) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalAnsibleDsl.g:2524:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,44,FOLLOW_47); 

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

                    otherlv_25=(Token)match(input,18,FOLLOW_68); 

                    				newLeafNode(otherlv_25, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2552:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==104) ) {
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

            // InternalAnsibleDsl.g:2571:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==45) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAnsibleDsl.g:2572:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,45,FOLLOW_50); 

                    				newLeafNode(otherlv_27, grammarAccess.getEHandlerAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:2576:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:2577:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:2577:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:2578:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_70);
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

            // InternalAnsibleDsl.g:2596:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==34) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalAnsibleDsl.g:2597:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,34,FOLLOW_71); 

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

                    otherlv_31=(Token)match(input,18,FOLLOW_72); 

                    				newLeafNode(otherlv_31, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2625:3: (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==51) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAnsibleDsl.g:2626:4: otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) )
                    {
                    otherlv_32=(Token)match(input,51,FOLLOW_4); 

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

            if ( (LA86_0==52) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAnsibleDsl.g:2650:4: otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}'
                    {
                    otherlv_34=(Token)match(input,52,FOLLOW_74); 

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

                    otherlv_36=(Token)match(input,18,FOLLOW_75); 

                    				newLeafNode(otherlv_36, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_17_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2678:3: (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==53) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAnsibleDsl.g:2679:4: otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) )
                    {
                    otherlv_37=(Token)match(input,53,FOLLOW_76); 

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

            otherlv_39=(Token)match(input,54,FOLLOW_78); 

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

            otherlv_41=(Token)match(input,18,FOLLOW_84); 

            			newLeafNode(otherlv_41, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_21());
            		
            // InternalAnsibleDsl.g:2730:3: (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==55) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAnsibleDsl.g:2731:4: otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    {
                    otherlv_42=(Token)match(input,55,FOLLOW_80); 

                    				newLeafNode(otherlv_42, grammarAccess.getEHandlerAccess().getNotifyKeyword_22_0());
                    			
                    // InternalAnsibleDsl.g:2735:4: ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    int cnt88=0;
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==RULE_STRING||LA88_0==109) ) {
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

            if ( (LA90_0==65||(LA90_0>=72 && LA90_0<=74)) ) {
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

            if ( (LA91_0==140) ) {
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

            if ( (LA93_0==58) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalAnsibleDsl.g:2794:4: otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+
                    {
                    otherlv_46=(Token)match(input,58,FOLLOW_4); 

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

            otherlv_48=(Token)match(input,18,FOLLOW_2); 

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
            otherlv_0=(Token)match(input,59,FOLLOW_23); 

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

            otherlv_2=(Token)match(input,60,FOLLOW_90); 

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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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

            otherlv_1=(Token)match(input,61,FOLLOW_92); 

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


    // $ANTLR start "entryRuleERoleInclusion"
    // InternalAnsibleDsl.g:2948:1: entryRuleERoleInclusion returns [EObject current=null] : iv_ruleERoleInclusion= ruleERoleInclusion EOF ;
    public final EObject entryRuleERoleInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusion = null;


        try {
            // InternalAnsibleDsl.g:2948:55: (iv_ruleERoleInclusion= ruleERoleInclusion EOF )
            // InternalAnsibleDsl.g:2949:2: iv_ruleERoleInclusion= ruleERoleInclusion EOF
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
    // InternalAnsibleDsl.g:2955:1: ruleERoleInclusion returns [EObject current=null] : (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' ) ;
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
            // InternalAnsibleDsl.g:2961:2: ( (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' ) )
            // InternalAnsibleDsl.g:2962:2: (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' )
            {
            // InternalAnsibleDsl.g:2962:2: (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' )
            // InternalAnsibleDsl.g:2963:3: otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_93); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionAccess().getRoleKeyword_0());
            		
            // InternalAnsibleDsl.g:2967:3: (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:2968:4: otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,63,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getERoleInclusionAccess().getRole_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:2972:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2973:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2973:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:2974:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_94); 

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

            // InternalAnsibleDsl.g:2991:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==75) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalAnsibleDsl.g:2992:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:2992:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:2993:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_95);
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

            // InternalAnsibleDsl.g:3010:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==81) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAnsibleDsl.g:3011:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:3011:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:3012:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_96);
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

            // InternalAnsibleDsl.g:3029:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==84) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalAnsibleDsl.g:3030:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:3030:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:3031:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_97);
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

            // InternalAnsibleDsl.g:3048:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==20) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalAnsibleDsl.g:3049:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getERoleInclusionAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3053:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3054:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3054:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3055:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_98); 

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

            // InternalAnsibleDsl.g:3072:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==21) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalAnsibleDsl.g:3073:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getERoleInclusionAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3077:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:3078:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:3078:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:3079:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:3079:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt99=5;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt99=1;
                        }
                        break;
                    case 23:
                        {
                        alt99=2;
                        }
                        break;
                    case 24:
                        {
                        alt99=3;
                        }
                        break;
                    case 25:
                        {
                        alt99=4;
                        }
                        break;
                    case 26:
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
                            // InternalAnsibleDsl.g:3080:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,22,FOLLOW_99); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getERoleInclusionAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:3091:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,23,FOLLOW_99); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getERoleInclusionAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:3102:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,24,FOLLOW_99); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getERoleInclusionAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:3113:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,25,FOLLOW_99); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getERoleInclusionAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:3124:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,26,FOLLOW_99); 

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

            // InternalAnsibleDsl.g:3138:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==27) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalAnsibleDsl.g:3139:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_10, grammarAccess.getERoleInclusionAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:3143:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3144:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3144:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:3145:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_100);
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

            // InternalAnsibleDsl.g:3163:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==28) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalAnsibleDsl.g:3164:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getERoleInclusionAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:3168:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3169:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3169:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:3170:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_101);
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

            // InternalAnsibleDsl.g:3188:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==29) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalAnsibleDsl.g:3189:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getERoleInclusionAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:3193:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3194:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3194:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:3195:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_102);
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

            // InternalAnsibleDsl.g:3213:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==30) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalAnsibleDsl.g:3214:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getERoleInclusionAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:3218:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3219:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3219:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:3220:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_103);
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

            // InternalAnsibleDsl.g:3238:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==31) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalAnsibleDsl.g:3239:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getERoleInclusionAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:3243:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:3244:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:3244:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:3245:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
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

                    // InternalAnsibleDsl.g:3262:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==32) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:3263:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,32,FOLLOW_23); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getERoleInclusionAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:3267:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:3268:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:3268:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:3269:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
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
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,18,FOLLOW_104); 

                    				newLeafNode(otherlv_22, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:3292:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==44) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalAnsibleDsl.g:3293:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,44,FOLLOW_47); 

                    				newLeafNode(otherlv_23, grammarAccess.getERoleInclusionAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:3297:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:3298:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:3298:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:3299:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
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

                    otherlv_25=(Token)match(input,18,FOLLOW_105); 

                    				newLeafNode(otherlv_25, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:3321:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==104) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalAnsibleDsl.g:3322:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:3322:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:3323:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_106);
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

            // InternalAnsibleDsl.g:3340:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==45) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalAnsibleDsl.g:3341:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,45,FOLLOW_50); 

                    				newLeafNode(otherlv_27, grammarAccess.getERoleInclusionAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:3345:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:3346:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:3346:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:3347:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

            otherlv_29=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:3373:1: entryRuleERoleInclusions returns [EObject current=null] : iv_ruleERoleInclusions= ruleERoleInclusions EOF ;
    public final EObject entryRuleERoleInclusions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusions = null;


        try {
            // InternalAnsibleDsl.g:3373:56: (iv_ruleERoleInclusions= ruleERoleInclusions EOF )
            // InternalAnsibleDsl.g:3374:2: iv_ruleERoleInclusions= ruleERoleInclusions EOF
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
    // InternalAnsibleDsl.g:3380:1: ruleERoleInclusions returns [EObject current=null] : (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' ) ;
    public final EObject ruleERoleInclusions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_roles_1_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3386:2: ( (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' ) )
            // InternalAnsibleDsl.g:3387:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' )
            {
            // InternalAnsibleDsl.g:3387:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' )
            // InternalAnsibleDsl.g:3388:3: otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_107); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionsAccess().getRoles_inclusionsKeyword_0());
            		
            // InternalAnsibleDsl.g:3392:3: ( (lv_roles_1_0= ruleERoleInclusion ) )
            // InternalAnsibleDsl.g:3393:4: (lv_roles_1_0= ruleERoleInclusion )
            {
            // InternalAnsibleDsl.g:3393:4: (lv_roles_1_0= ruleERoleInclusion )
            // InternalAnsibleDsl.g:3394:5: lv_roles_1_0= ruleERoleInclusion
            {

            					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_108);
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

            // InternalAnsibleDsl.g:3411:3: ( (lv_roles_2_0= ruleERoleInclusion ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==62) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3412:4: (lv_roles_2_0= ruleERoleInclusion )
            	    {
            	    // InternalAnsibleDsl.g:3412:4: (lv_roles_2_0= ruleERoleInclusion )
            	    // InternalAnsibleDsl.g:3413:5: lv_roles_2_0= ruleERoleInclusion
            	    {

            	    					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_108);
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

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:3438:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalAnsibleDsl.g:3438:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalAnsibleDsl.g:3439:2: iv_ruleELoop= ruleELoop EOF
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
    // InternalAnsibleDsl.g:3445:1: ruleELoop returns [EObject current=null] : (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        EObject this_ELoopOverList_0 = null;

        EObject this_EUntil_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3451:2: ( (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) )
            // InternalAnsibleDsl.g:3452:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            {
            // InternalAnsibleDsl.g:3452:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==65) ) {
                alt111=1;
            }
            else if ( ((LA111_0>=72 && LA111_0<=74)) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalAnsibleDsl.g:3453:3: this_ELoopOverList_0= ruleELoopOverList
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
                    // InternalAnsibleDsl.g:3462:3: this_EUntil_1= ruleEUntil
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
    // InternalAnsibleDsl.g:3474:1: entryRuleELoopOverList returns [EObject current=null] : iv_ruleELoopOverList= ruleELoopOverList EOF ;
    public final EObject entryRuleELoopOverList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopOverList = null;


        try {
            // InternalAnsibleDsl.g:3474:54: (iv_ruleELoopOverList= ruleELoopOverList EOF )
            // InternalAnsibleDsl.g:3475:2: iv_ruleELoopOverList= ruleELoopOverList EOF
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
    // InternalAnsibleDsl.g:3481:1: ruleELoopOverList returns [EObject current=null] : (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) ;
    public final EObject ruleELoopOverList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loop_list_1_0 = null;

        EObject lv_loop_control_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3487:2: ( (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) )
            // InternalAnsibleDsl.g:3488:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            {
            // InternalAnsibleDsl.g:3488:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            // InternalAnsibleDsl.g:3489:3: otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )?
            {
            otherlv_0=(Token)match(input,65,FOLLOW_92); 

            			newLeafNode(otherlv_0, grammarAccess.getELoopOverListAccess().getLoopKeyword_0());
            		
            // InternalAnsibleDsl.g:3493:3: ( (lv_loop_list_1_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:3494:4: (lv_loop_list_1_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:3494:4: (lv_loop_list_1_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:3495:5: lv_loop_list_1_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getELoopOverListAccess().getLoop_listEValuePassedParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_109);
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

            // InternalAnsibleDsl.g:3512:3: ( (lv_loop_control_2_0= ruleELoopControl ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==66) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // InternalAnsibleDsl.g:3513:4: (lv_loop_control_2_0= ruleELoopControl )
                    {
                    // InternalAnsibleDsl.g:3513:4: (lv_loop_control_2_0= ruleELoopControl )
                    // InternalAnsibleDsl.g:3514:5: lv_loop_control_2_0= ruleELoopControl
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
    // InternalAnsibleDsl.g:3535:1: entryRuleELoopControl returns [EObject current=null] : iv_ruleELoopControl= ruleELoopControl EOF ;
    public final EObject entryRuleELoopControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopControl = null;


        try {
            // InternalAnsibleDsl.g:3535:53: (iv_ruleELoopControl= ruleELoopControl EOF )
            // InternalAnsibleDsl.g:3536:2: iv_ruleELoopControl= ruleELoopControl EOF
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
    // InternalAnsibleDsl.g:3542:1: ruleELoopControl returns [EObject current=null] : ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:3548:2: ( ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:3549:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:3549:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:3550:3: () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:3550:3: ()
            // InternalAnsibleDsl.g:3551:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getELoopControlAccess().getELoopControlAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_110); 

            			newLeafNode(otherlv_1, grammarAccess.getELoopControlAccess().getLoop_controlKeyword_1());
            		
            // InternalAnsibleDsl.g:3561:3: (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==67) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalAnsibleDsl.g:3562:4: otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_92); 

                    				newLeafNode(otherlv_2, grammarAccess.getELoopControlAccess().getLabelKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3566:4: ( (lv_label_3_0= ruleEValuePassed ) )
                    // InternalAnsibleDsl.g:3567:5: (lv_label_3_0= ruleEValuePassed )
                    {
                    // InternalAnsibleDsl.g:3567:5: (lv_label_3_0= ruleEValuePassed )
                    // InternalAnsibleDsl.g:3568:6: lv_label_3_0= ruleEValuePassed
                    {

                    						newCompositeNode(grammarAccess.getELoopControlAccess().getLabelEValuePassedParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_111);
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

            // InternalAnsibleDsl.g:3586:3: (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==68) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalAnsibleDsl.g:3587:4: otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) )
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getELoopControlAccess().getPauseKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3591:4: ( (lv_pause_5_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:3592:5: (lv_pause_5_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:3592:5: (lv_pause_5_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:3593:6: lv_pause_5_0= RULE_NUMBER
                    {
                    lv_pause_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_113); 

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

            // InternalAnsibleDsl.g:3610:3: (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==69) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalAnsibleDsl.g:3611:4: otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,69,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getELoopControlAccess().getIndex_varKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3615:4: ( (lv_index_var_7_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:3616:5: (lv_index_var_7_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:3616:5: (lv_index_var_7_0= RULE_ID )
                    // InternalAnsibleDsl.g:3617:6: lv_index_var_7_0= RULE_ID
                    {
                    lv_index_var_7_0=(Token)match(input,RULE_ID,FOLLOW_114); 

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

            // InternalAnsibleDsl.g:3634:3: (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==70) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalAnsibleDsl.g:3635:4: otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,70,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getELoopControlAccess().getLoop_varKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3639:4: ( (lv_loop_var_9_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:3640:5: (lv_loop_var_9_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:3640:5: (lv_loop_var_9_0= RULE_ID )
                    // InternalAnsibleDsl.g:3641:6: lv_loop_var_9_0= RULE_ID
                    {
                    lv_loop_var_9_0=(Token)match(input,RULE_ID,FOLLOW_115); 

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

            // InternalAnsibleDsl.g:3658:3: (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==71) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalAnsibleDsl.g:3659:4: otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    {
                    otherlv_10=(Token)match(input,71,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getELoopControlAccess().getExtendedKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3663:4: ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3664:5: (lv_extended_11_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3664:5: (lv_extended_11_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3665:6: lv_extended_11_0= RULE_BOOLEAN
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

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:3690:1: entryRuleEUntil returns [EObject current=null] : iv_ruleEUntil= ruleEUntil EOF ;
    public final EObject entryRuleEUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUntil = null;


        try {
            // InternalAnsibleDsl.g:3690:47: (iv_ruleEUntil= ruleEUntil EOF )
            // InternalAnsibleDsl.g:3691:2: iv_ruleEUntil= ruleEUntil EOF
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
    // InternalAnsibleDsl.g:3697:1: ruleEUntil returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalAnsibleDsl.g:3703:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:3704:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:3704:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:3705:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:3705:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:3706:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEUntilAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3709:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:3710:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:3710:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+
            int cnt118=0;
            loop118:
            do {
                int alt118=4;
                int LA118_0 = input.LA(1);

                if ( LA118_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
                    alt118=1;
                }
                else if ( LA118_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
                    alt118=2;
                }
                else if ( LA118_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
                    alt118=3;
                }


                switch (alt118) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3711:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3711:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3712:4: {...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3712:100: ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    // InternalAnsibleDsl.g:3713:5: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3716:8: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    // InternalAnsibleDsl.g:3716:9: {...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3716:18: (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    // InternalAnsibleDsl.g:3716:19: otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    {
            	    otherlv_1=(Token)match(input,72,FOLLOW_50); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEUntilAccess().getUntilKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3720:8: ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    // InternalAnsibleDsl.g:3721:9: (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    {
            	    // InternalAnsibleDsl.g:3721:9: (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    // InternalAnsibleDsl.g:3722:10: lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            	    {

            	    										newCompositeNode(grammarAccess.getEUntilAccess().getUntilEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_116);
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
            	    // InternalAnsibleDsl.g:3745:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3745:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3746:4: {...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3746:100: ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:3747:5: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3750:8: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:3750:9: {...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3750:18: (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:3750:19: otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) )
            	    {
            	    otherlv_3=(Token)match(input,73,FOLLOW_112); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEUntilAccess().getRetriesKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3754:8: ( (lv_retries_4_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:3755:9: (lv_retries_4_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:3755:9: (lv_retries_4_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:3756:10: lv_retries_4_0= RULE_NUMBER
            	    {
            	    lv_retries_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_116); 

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
            	    // InternalAnsibleDsl.g:3778:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3778:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3779:4: {...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3779:100: ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:3780:5: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3783:8: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:3783:9: {...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3783:18: (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:3783:19: otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) )
            	    {
            	    otherlv_5=(Token)match(input,74,FOLLOW_112); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEUntilAccess().getDelayKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3787:8: ( (lv_delay_6_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:3788:9: (lv_delay_6_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:3788:9: (lv_delay_6_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:3789:10: lv_delay_6_0= RULE_NUMBER
            	    {
            	    lv_delay_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_116); 

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
    // InternalAnsibleDsl.g:3822:1: entryRuleEPrivilageEscalation returns [EObject current=null] : iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF ;
    public final EObject entryRuleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrivilageEscalation = null;


        try {
            // InternalAnsibleDsl.g:3822:61: (iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF )
            // InternalAnsibleDsl.g:3823:2: iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF
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
    // InternalAnsibleDsl.g:3829:1: ruleEPrivilageEscalation returns [EObject current=null] : ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:3835:2: ( ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:3836:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:3836:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:3837:3: () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:3837:3: ()
            // InternalAnsibleDsl.g:3838:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPrivilageEscalationAccess().getEPrivilageEscalationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_117); 

            			newLeafNode(otherlv_1, grammarAccess.getEPrivilageEscalationAccess().getPrivilage_escalationKeyword_1());
            		
            // InternalAnsibleDsl.g:3848:3: (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==76) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // InternalAnsibleDsl.g:3849:4: otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,76,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getEPrivilageEscalationAccess().getBecomeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3853:4: ( (lv_become_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3854:5: (lv_become_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3854:5: (lv_become_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3855:6: lv_become_3_0= RULE_BOOLEAN
                    {
                    lv_become_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_118); 

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

            // InternalAnsibleDsl.g:3872:3: (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==77) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalAnsibleDsl.g:3873:4: otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,77,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPrivilageEscalationAccess().getBecome_exeKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3877:4: ( (lv_become_exe_5_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3878:5: (lv_become_exe_5_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3878:5: (lv_become_exe_5_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3879:6: lv_become_exe_5_0= RULE_STRING
                    {
                    lv_become_exe_5_0=(Token)match(input,RULE_STRING,FOLLOW_119); 

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

            // InternalAnsibleDsl.g:3896:3: (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==78) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalAnsibleDsl.g:3897:4: otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,78,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3901:4: ( (lv_become_flags_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3902:5: (lv_become_flags_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3902:5: (lv_become_flags_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3903:6: lv_become_flags_7_0= RULE_STRING
                    {
                    lv_become_flags_7_0=(Token)match(input,RULE_STRING,FOLLOW_120); 

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

            // InternalAnsibleDsl.g:3920:3: (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==79) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalAnsibleDsl.g:3921:4: otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,79,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPrivilageEscalationAccess().getBecome_methodKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3925:4: ( (lv_become_method_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3926:5: (lv_become_method_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3926:5: (lv_become_method_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3927:6: lv_become_method_9_0= RULE_STRING
                    {
                    lv_become_method_9_0=(Token)match(input,RULE_STRING,FOLLOW_121); 

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

            // InternalAnsibleDsl.g:3944:3: (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==80) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalAnsibleDsl.g:3945:4: otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,80,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEPrivilageEscalationAccess().getBecome_userKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3949:4: ( (lv_become_user_11_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3950:5: (lv_become_user_11_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3950:5: (lv_become_user_11_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3951:6: lv_become_user_11_0= RULE_STRING
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

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:3976:1: entryRuleEValidationMode returns [EObject current=null] : iv_ruleEValidationMode= ruleEValidationMode EOF ;
    public final EObject entryRuleEValidationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidationMode = null;


        try {
            // InternalAnsibleDsl.g:3976:56: (iv_ruleEValidationMode= ruleEValidationMode EOF )
            // InternalAnsibleDsl.g:3977:2: iv_ruleEValidationMode= ruleEValidationMode EOF
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
    // InternalAnsibleDsl.g:3983:1: ruleEValidationMode returns [EObject current=null] : ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) ;
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
            // InternalAnsibleDsl.g:3989:2: ( ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) )
            // InternalAnsibleDsl.g:3990:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            {
            // InternalAnsibleDsl.g:3990:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            // InternalAnsibleDsl.g:3991:3: () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}'
            {
            // InternalAnsibleDsl.g:3991:3: ()
            // InternalAnsibleDsl.g:3992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEValidationModeAccess().getEValidationModeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_122); 

            			newLeafNode(otherlv_1, grammarAccess.getEValidationModeAccess().getValidation_modeKeyword_1());
            		
            // InternalAnsibleDsl.g:4002:3: (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==82) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalAnsibleDsl.g:4003:4: otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,82,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getEValidationModeAccess().getCheck_modeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4007:4: ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4008:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4008:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4009:6: lv_check_mode_3_0= RULE_BOOLEAN
                    {
                    lv_check_mode_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_123); 

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

            // InternalAnsibleDsl.g:4026:3: (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==83) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalAnsibleDsl.g:4027:4: otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    {
                    otherlv_4=(Token)match(input,83,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getEValidationModeAccess().getDiffKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4031:4: ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4032:5: (lv_diff_5_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4032:5: (lv_diff_5_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4033:6: lv_diff_5_0= RULE_BOOLEAN
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

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:4058:1: entryRuleEConnection returns [EObject current=null] : iv_ruleEConnection= ruleEConnection EOF ;
    public final EObject entryRuleEConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConnection = null;


        try {
            // InternalAnsibleDsl.g:4058:52: (iv_ruleEConnection= ruleEConnection EOF )
            // InternalAnsibleDsl.g:4059:2: iv_ruleEConnection= ruleEConnection EOF
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
    // InternalAnsibleDsl.g:4065:1: ruleEConnection returns [EObject current=null] : ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) ;
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
            // InternalAnsibleDsl.g:4071:2: ( ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) )
            // InternalAnsibleDsl.g:4072:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            {
            // InternalAnsibleDsl.g:4072:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            // InternalAnsibleDsl.g:4073:3: () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}'
            {
            // InternalAnsibleDsl.g:4073:3: ()
            // InternalAnsibleDsl.g:4074:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConnectionAccess().getEConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_124); 

            			newLeafNode(otherlv_1, grammarAccess.getEConnectionAccess().getConnection_infoKeyword_1());
            		
            // InternalAnsibleDsl.g:4084:3: (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==85) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalAnsibleDsl.g:4085:4: otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,85,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEConnectionAccess().getConnectionKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4089:4: ( (lv_connection_3_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4090:5: (lv_connection_3_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4090:5: (lv_connection_3_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4091:6: lv_connection_3_0= RULE_STRING
                    {
                    lv_connection_3_0=(Token)match(input,RULE_STRING,FOLLOW_125); 

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

            // InternalAnsibleDsl.g:4108:3: (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==86) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalAnsibleDsl.g:4109:4: otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) )
                    {
                    otherlv_4=(Token)match(input,86,FOLLOW_112); 

                    				newLeafNode(otherlv_4, grammarAccess.getEConnectionAccess().getPortKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4113:4: ( (lv_port_5_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4114:5: (lv_port_5_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4114:5: (lv_port_5_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4115:6: lv_port_5_0= RULE_NUMBER
                    {
                    lv_port_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_126); 

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

            // InternalAnsibleDsl.g:4132:3: (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==87) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalAnsibleDsl.g:4133:4: otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,87,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEConnectionAccess().getRemote_userKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4137:4: ( (lv_remote_user_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4138:5: (lv_remote_user_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4138:5: (lv_remote_user_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4139:6: lv_remote_user_7_0= RULE_STRING
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

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:4164:1: entryRuleEPlayExeSettings returns [EObject current=null] : iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF ;
    public final EObject entryRuleEPlayExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayExeSettings = null;


        try {
            // InternalAnsibleDsl.g:4164:57: (iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF )
            // InternalAnsibleDsl.g:4165:2: iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF
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
    // InternalAnsibleDsl.g:4171:1: ruleEPlayExeSettings returns [EObject current=null] : ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4177:2: ( ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4178:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4178:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4179:3: () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4179:3: ()
            // InternalAnsibleDsl.g:4180:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayExeSettingsAccess().getEPlayExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4186:3: (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==88) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalAnsibleDsl.g:4187:4: otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,88,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayExeSettingsAccess().getStrategyKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4191:4: ( (lv_strategy_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4192:5: (lv_strategy_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4192:5: (lv_strategy_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4193:6: lv_strategy_2_0= RULE_STRING
                    {
                    lv_strategy_2_0=(Token)match(input,RULE_STRING,FOLLOW_127); 

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

            // InternalAnsibleDsl.g:4210:3: (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==89) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalAnsibleDsl.g:4211:4: otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) )
                    {
                    otherlv_3=(Token)match(input,89,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayExeSettingsAccess().getSerialKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4215:4: ( (lv_serial_list_4_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4216:5: (lv_serial_list_4_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4216:5: (lv_serial_list_4_0= ruleEList )
                    // InternalAnsibleDsl.g:4217:6: lv_serial_list_4_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getSerial_listEListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_128);
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

            // InternalAnsibleDsl.g:4235:3: (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==90) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalAnsibleDsl.g:4236:4: otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,90,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayExeSettingsAccess().getOrderKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4240:4: ( (lv_order_6_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4241:5: (lv_order_6_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4241:5: (lv_order_6_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4242:6: lv_order_6_0= RULE_STRING
                    {
                    lv_order_6_0=(Token)match(input,RULE_STRING,FOLLOW_129); 

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

            // InternalAnsibleDsl.g:4259:3: (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==91) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalAnsibleDsl.g:4260:4: otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) )
                    {
                    otherlv_7=(Token)match(input,91,FOLLOW_112); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayExeSettingsAccess().getThrottleKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4264:4: ( (lv_throttle_8_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4265:5: (lv_throttle_8_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4265:5: (lv_throttle_8_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4266:6: lv_throttle_8_0= RULE_NUMBER
                    {
                    lv_throttle_8_0=(Token)match(input,RULE_NUMBER,FOLLOW_130); 

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

            // InternalAnsibleDsl.g:4283:3: (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==92) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalAnsibleDsl.g:4284:4: otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,92,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getEPlayExeSettingsAccess().getRun_onceKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4288:4: ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4289:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4289:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4290:6: lv_run_once_10_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4311:1: entryRuleEExecutionExeSettings returns [EObject current=null] : iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF ;
    public final EObject entryRuleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionExeSettings = null;


        try {
            // InternalAnsibleDsl.g:4311:62: (iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF )
            // InternalAnsibleDsl.g:4312:2: iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF
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
    // InternalAnsibleDsl.g:4318:1: ruleEExecutionExeSettings returns [EObject current=null] : ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_throttle_2_0=null;
        Token otherlv_3=null;
        Token lv_run_once_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4324:2: ( ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4325:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4325:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4326:3: () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4326:3: ()
            // InternalAnsibleDsl.g:4327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEExecutionExeSettingsAccess().getEExecutionExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4333:3: (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==91) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalAnsibleDsl.g:4334:4: otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) )
                    {
                    otherlv_1=(Token)match(input,91,FOLLOW_112); 

                    				newLeafNode(otherlv_1, grammarAccess.getEExecutionExeSettingsAccess().getThrottleKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4338:4: ( (lv_throttle_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4339:5: (lv_throttle_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4339:5: (lv_throttle_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4340:6: lv_throttle_2_0= RULE_NUMBER
                    {
                    lv_throttle_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_130); 

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

            // InternalAnsibleDsl.g:4357:3: (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==92) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalAnsibleDsl.g:4358:4: otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,92,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getEExecutionExeSettingsAccess().getRun_onceKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4362:4: ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4363:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4363:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4364:6: lv_run_once_4_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4385:1: entryRuleEBlockErrorHandling returns [EObject current=null] : iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF ;
    public final EObject entryRuleEBlockErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4385:60: (iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF )
            // InternalAnsibleDsl.g:4386:2: iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF
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
    // InternalAnsibleDsl.g:4392:1: ruleEBlockErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4398:2: ( ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4399:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4399:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4400:3: () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4400:3: ()
            // InternalAnsibleDsl.g:4401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBlockErrorHandlingAccess().getEBlockErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4407:3: (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==93) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalAnsibleDsl.g:4408:4: otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    {
                    otherlv_1=(Token)match(input,93,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4412:4: ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4413:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4413:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4414:6: lv_any_errors_fatal_2_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_131); 

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

            // InternalAnsibleDsl.g:4431:3: (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==94) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalAnsibleDsl.g:4432:4: otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,94,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4436:4: ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4437:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4437:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4438:6: lv_ignore_errors_4_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_132); 

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

            // InternalAnsibleDsl.g:4455:3: (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==95) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalAnsibleDsl.g:4456:4: otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,95,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4460:4: ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4461:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4461:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4462:6: lv_ignore_unreachable_6_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4483:1: entryRuleEPlayErrorHandling returns [EObject current=null] : iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF ;
    public final EObject entryRuleEPlayErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4483:59: (iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF )
            // InternalAnsibleDsl.g:4484:2: iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF
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
    // InternalAnsibleDsl.g:4490:1: ruleEPlayErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4496:2: ( ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4497:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4497:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4498:3: () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4498:3: ()
            // InternalAnsibleDsl.g:4499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayErrorHandlingAccess().getEPlayErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4505:3: (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==96) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalAnsibleDsl.g:4506:4: otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) )
                    {
                    otherlv_1=(Token)match(input,96,FOLLOW_112); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4510:4: ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4511:5: (lv_max_fail_percentage_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4511:5: (lv_max_fail_percentage_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4512:6: lv_max_fail_percentage_2_0= RULE_NUMBER
                    {
                    lv_max_fail_percentage_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_133); 

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

            // InternalAnsibleDsl.g:4529:3: (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==93) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalAnsibleDsl.g:4530:4: otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,93,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4534:4: ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4535:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4535:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4536:6: lv_any_errors_fatal_4_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_131); 

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

            // InternalAnsibleDsl.g:4553:3: (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==94) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalAnsibleDsl.g:4554:4: otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,94,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4558:4: ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4559:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4559:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4560:6: lv_ignore_errors_6_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_132); 

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

            // InternalAnsibleDsl.g:4577:3: (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==95) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalAnsibleDsl.g:4578:4: otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,95,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4582:4: ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4583:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4583:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4584:6: lv_ignore_unreachable_8_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4605:1: entryRuleETaskHandlerErrorHandling returns [EObject current=null] : iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF ;
    public final EObject entryRuleETaskHandlerErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4605:66: (iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF )
            // InternalAnsibleDsl.g:4606:2: iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF
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
    // InternalAnsibleDsl.g:4612:1: ruleETaskHandlerErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4618:2: ( ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4619:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4619:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4620:3: () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4620:3: ()
            // InternalAnsibleDsl.g:4621:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETaskHandlerErrorHandlingAccess().getETaskHandlerErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4627:3: (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==97) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalAnsibleDsl.g:4628:4: otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_1=(Token)match(input,97,FOLLOW_50); 

                    				newLeafNode(otherlv_1, grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4632:4: ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:4633:5: (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:4633:5: (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:4634:6: lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_134);
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

            // InternalAnsibleDsl.g:4652:3: (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==98) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalAnsibleDsl.g:4653:4: otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_3=(Token)match(input,98,FOLLOW_50); 

                    				newLeafNode(otherlv_3, grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4657:4: ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:4658:5: (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:4658:5: (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:4659:6: lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_133);
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

            // InternalAnsibleDsl.g:4677:3: (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==93) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalAnsibleDsl.g:4678:4: otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,93,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4682:4: ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4683:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4683:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4684:6: lv_any_errors_fatal_6_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_131); 

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

            // InternalAnsibleDsl.g:4701:3: (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==94) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalAnsibleDsl.g:4702:4: otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,94,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4706:4: ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4707:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4707:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4708:6: lv_ignore_errors_8_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_132); 

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

            // InternalAnsibleDsl.g:4725:3: (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==95) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalAnsibleDsl.g:4726:4: otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,95,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4730:4: ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4731:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4731:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4732:6: lv_ignore_unreachable_10_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4753:1: entryRuleEFactsSettings returns [EObject current=null] : iv_ruleEFactsSettings= ruleEFactsSettings EOF ;
    public final EObject entryRuleEFactsSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactsSettings = null;


        try {
            // InternalAnsibleDsl.g:4753:55: (iv_ruleEFactsSettings= ruleEFactsSettings EOF )
            // InternalAnsibleDsl.g:4754:2: iv_ruleEFactsSettings= ruleEFactsSettings EOF
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
    // InternalAnsibleDsl.g:4760:1: ruleEFactsSettings returns [EObject current=null] : ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // InternalAnsibleDsl.g:4766:2: ( ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalAnsibleDsl.g:4767:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalAnsibleDsl.g:4767:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalAnsibleDsl.g:4768:3: () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // InternalAnsibleDsl.g:4768:3: ()
            // InternalAnsibleDsl.g:4769:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactsSettingsAccess().getEFactsSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_135); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactsSettingsAccess().getFacts_setttingsKeyword_1());
            		
            // InternalAnsibleDsl.g:4779:3: (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==100) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalAnsibleDsl.g:4780:4: otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,100,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getEFactsSettingsAccess().getGather_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4784:4: ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4785:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4785:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4786:6: lv_gather_facts_3_0= RULE_BOOLEAN
                    {
                    lv_gather_facts_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_136); 

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

            // InternalAnsibleDsl.g:4803:3: (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==101) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalAnsibleDsl.g:4804:4: otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) )
                    {
                    otherlv_4=(Token)match(input,101,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getEFactsSettingsAccess().getGather_subsetKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4808:4: ( (lv_gather_subset_5_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4809:5: (lv_gather_subset_5_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4809:5: (lv_gather_subset_5_0= ruleEList )
                    // InternalAnsibleDsl.g:4810:6: lv_gather_subset_5_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEFactsSettingsAccess().getGather_subsetEListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_137);
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

            // InternalAnsibleDsl.g:4828:3: (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==102) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalAnsibleDsl.g:4829:4: otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) )
                    {
                    otherlv_6=(Token)match(input,102,FOLLOW_112); 

                    				newLeafNode(otherlv_6, grammarAccess.getEFactsSettingsAccess().getGather_timeoutKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4833:4: ( (lv_gather_timeout_7_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4834:5: (lv_gather_timeout_7_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4834:5: (lv_gather_timeout_7_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4835:6: lv_gather_timeout_7_0= RULE_NUMBER
                    {
                    lv_gather_timeout_7_0=(Token)match(input,RULE_NUMBER,FOLLOW_138); 

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

            // InternalAnsibleDsl.g:4852:3: (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==103) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalAnsibleDsl.g:4853:4: otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,103,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEFactsSettingsAccess().getFact_pathKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4857:4: ( (lv_fact_path_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4858:5: (lv_fact_path_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4858:5: (lv_fact_path_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4859:6: lv_fact_path_9_0= RULE_STRING
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

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:4884:1: entryRuleEDelegation returns [EObject current=null] : iv_ruleEDelegation= ruleEDelegation EOF ;
    public final EObject entryRuleEDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDelegation = null;


        try {
            // InternalAnsibleDsl.g:4884:52: (iv_ruleEDelegation= ruleEDelegation EOF )
            // InternalAnsibleDsl.g:4885:2: iv_ruleEDelegation= ruleEDelegation EOF
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
    // InternalAnsibleDsl.g:4891:1: ruleEDelegation returns [EObject current=null] : (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) ;
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
            // InternalAnsibleDsl.g:4897:2: ( (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) )
            // InternalAnsibleDsl.g:4898:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            {
            // InternalAnsibleDsl.g:4898:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            // InternalAnsibleDsl.g:4899:3: otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,104,FOLLOW_139); 

            			newLeafNode(otherlv_0, grammarAccess.getEDelegationAccess().getDelegationKeyword_0());
            		
            // InternalAnsibleDsl.g:4903:3: (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4904:4: otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,105,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEDelegationAccess().getDelegate_toKeyword_1_0());
            			
            // InternalAnsibleDsl.g:4908:4: ( (lv_delegate_to_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4909:5: (lv_delegate_to_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4909:5: (lv_delegate_to_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:4910:6: lv_delegate_to_2_0= RULE_STRING
            {
            lv_delegate_to_2_0=(Token)match(input,RULE_STRING,FOLLOW_140); 

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

            // InternalAnsibleDsl.g:4927:3: (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==106) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalAnsibleDsl.g:4928:4: otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,106,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getEDelegationAccess().getDelegate_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4932:4: ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4933:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4933:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4934:6: lv_delegate_facts_4_0= RULE_BOOLEAN
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

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:4959:1: entryRuleEAsynchronousSettings returns [EObject current=null] : iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF ;
    public final EObject entryRuleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAsynchronousSettings = null;


        try {
            // InternalAnsibleDsl.g:4959:62: (iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF )
            // InternalAnsibleDsl.g:4960:2: iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF
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
    // InternalAnsibleDsl.g:4966:1: ruleEAsynchronousSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_async_2_0=null;
        Token otherlv_3=null;
        Token lv_poll_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4972:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:4973:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:4973:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:4974:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:4974:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:4975:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4978:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:4979:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:4979:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+
            int cnt153=0;
            loop153:
            do {
                int alt153=3;
                int LA153_0 = input.LA(1);

                if ( LA153_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt153=1;
                }
                else if ( LA153_0 == 108 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt153=2;
                }


                switch (alt153) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4980:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4980:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4981:4: {...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4981:115: ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:4982:5: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4985:8: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:4985:9: {...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4985:18: (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:4985:19: otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) )
            	    {
            	    otherlv_1=(Token)match(input,107,FOLLOW_112); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAsynchronousSettingsAccess().getAsyncKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4989:8: ( (lv_async_2_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:4990:9: (lv_async_2_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:4990:9: (lv_async_2_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:4991:10: lv_async_2_0= RULE_NUMBER
            	    {
            	    lv_async_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_141); 

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
            	    // InternalAnsibleDsl.g:5013:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:5013:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:5014:4: {...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:5014:115: ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:5015:5: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:5018:8: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:5018:9: {...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:5018:18: (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:5018:19: otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) )
            	    {
            	    otherlv_3=(Token)match(input,108,FOLLOW_112); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAsynchronousSettingsAccess().getPollKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:5022:8: ( (lv_poll_4_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:5023:9: (lv_poll_4_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:5023:9: (lv_poll_4_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:5024:10: lv_poll_4_0= RULE_NUMBER
            	    {
            	    lv_poll_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_141); 

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
    // InternalAnsibleDsl.g:5057:1: entryRuleENotifiable returns [EObject current=null] : iv_ruleENotifiable= ruleENotifiable EOF ;
    public final EObject entryRuleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiable = null;


        try {
            // InternalAnsibleDsl.g:5057:52: (iv_ruleENotifiable= ruleENotifiable EOF )
            // InternalAnsibleDsl.g:5058:2: iv_ruleENotifiable= ruleENotifiable EOF
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
    // InternalAnsibleDsl.g:5064:1: ruleENotifiable returns [EObject current=null] : (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) ;
    public final EObject ruleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject this_ENotifiedHandler_0 = null;

        EObject this_ENotifiedTopic_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5070:2: ( (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) )
            // InternalAnsibleDsl.g:5071:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            {
            // InternalAnsibleDsl.g:5071:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            int alt154=2;
            int LA154_0 = input.LA(1);

            if ( (LA154_0==RULE_STRING) ) {
                alt154=1;
            }
            else if ( (LA154_0==109) ) {
                alt154=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 154, 0, input);

                throw nvae;
            }
            switch (alt154) {
                case 1 :
                    // InternalAnsibleDsl.g:5072:3: this_ENotifiedHandler_0= ruleENotifiedHandler
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
                    // InternalAnsibleDsl.g:5081:3: this_ENotifiedTopic_1= ruleENotifiedTopic
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
    // InternalAnsibleDsl.g:5093:1: entryRuleENotifiedHandler returns [EObject current=null] : iv_ruleENotifiedHandler= ruleENotifiedHandler EOF ;
    public final EObject entryRuleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedHandler = null;


        try {
            // InternalAnsibleDsl.g:5093:57: (iv_ruleENotifiedHandler= ruleENotifiedHandler EOF )
            // InternalAnsibleDsl.g:5094:2: iv_ruleENotifiedHandler= ruleENotifiedHandler EOF
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
    // InternalAnsibleDsl.g:5100:1: ruleENotifiedHandler returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5106:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:5107:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalAnsibleDsl.g:5107:2: ( (otherlv_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:5108:3: (otherlv_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:5108:3: (otherlv_0= RULE_STRING )
            // InternalAnsibleDsl.g:5109:4: otherlv_0= RULE_STRING
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
    // InternalAnsibleDsl.g:5123:1: entryRuleENotifiedTopic returns [EObject current=null] : iv_ruleENotifiedTopic= ruleENotifiedTopic EOF ;
    public final EObject entryRuleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedTopic = null;


        try {
            // InternalAnsibleDsl.g:5123:55: (iv_ruleENotifiedTopic= ruleENotifiedTopic EOF )
            // InternalAnsibleDsl.g:5124:2: iv_ruleENotifiedTopic= ruleENotifiedTopic EOF
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
    // InternalAnsibleDsl.g:5130:1: ruleENotifiedTopic returns [EObject current=null] : (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5136:2: ( (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:5137:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:5137:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:5138:3: otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,109,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getENotifiedTopicAccess().getTopicKeyword_0());
            		
            // InternalAnsibleDsl.g:5142:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:5143:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:5143:4: (lv_name_1_0= RULE_STRING )
            // InternalAnsibleDsl.g:5144:5: lv_name_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleEFilteredVariableOrString"
    // InternalAnsibleDsl.g:5164:1: entryRuleEFilteredVariableOrString returns [EObject current=null] : iv_ruleEFilteredVariableOrString= ruleEFilteredVariableOrString EOF ;
    public final EObject entryRuleEFilteredVariableOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredVariableOrString = null;


        try {
            // InternalAnsibleDsl.g:5164:66: (iv_ruleEFilteredVariableOrString= ruleEFilteredVariableOrString EOF )
            // InternalAnsibleDsl.g:5165:2: iv_ruleEFilteredVariableOrString= ruleEFilteredVariableOrString EOF
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
    // InternalAnsibleDsl.g:5171:1: ruleEFilteredVariableOrString returns [EObject current=null] : (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEFilteredVariableOrString() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject this_EJinjaExpressionEvaluation_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5177:2: ( (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:5178:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:5178:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==114) ) {
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
                    // InternalAnsibleDsl.g:5179:3: this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation
                    {

                    			newCompositeNode(grammarAccess.getEFilteredVariableOrStringAccess().getEJinjaExpressionEvaluationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EJinjaExpressionEvaluation_0=ruleEJinjaExpressionEvaluation();

                    state._fsp--;


                    			current = this_EJinjaExpressionEvaluation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5188:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:5188:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:5189:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:5189:4: (lv_string_1_0= RULE_STRING )
                    // InternalAnsibleDsl.g:5190:5: lv_string_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleEValuePassed"
    // InternalAnsibleDsl.g:5210:1: entryRuleEValuePassed returns [EObject current=null] : iv_ruleEValuePassed= ruleEValuePassed EOF ;
    public final EObject entryRuleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassed = null;


        try {
            // InternalAnsibleDsl.g:5210:53: (iv_ruleEValuePassed= ruleEValuePassed EOF )
            // InternalAnsibleDsl.g:5211:2: iv_ruleEValuePassed= ruleEValuePassed EOF
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
    // InternalAnsibleDsl.g:5217:1: ruleEValuePassed returns [EObject current=null] : ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) )+ ;
    public final EObject ruleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject lv_variable_and_string_0_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5223:2: ( ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) )+ )
            // InternalAnsibleDsl.g:5224:2: ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) )+
            {
            // InternalAnsibleDsl.g:5224:2: ( (lv_variable_and_string_0_0= ruleEFilteredVariableOrString ) )+
            int cnt156=0;
            loop156:
            do {
                int alt156=2;
                int LA156_0 = input.LA(1);

                if ( (LA156_0==RULE_STRING||LA156_0==114) ) {
                    alt156=1;
                }


                switch (alt156) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5225:3: (lv_variable_and_string_0_0= ruleEFilteredVariableOrString )
            	    {
            	    // InternalAnsibleDsl.g:5225:3: (lv_variable_and_string_0_0= ruleEFilteredVariableOrString )
            	    // InternalAnsibleDsl.g:5226:4: lv_variable_and_string_0_0= ruleEFilteredVariableOrString
            	    {

            	    				newCompositeNode(grammarAccess.getEValuePassedAccess().getVariable_and_stringEFilteredVariableOrStringParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_142);
            	    lv_variable_and_string_0_0=ruleEFilteredVariableOrString();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getEValuePassedRule());
            	    				}
            	    				add(
            	    					current,
            	    					"variable_and_string",
            	    					lv_variable_and_string_0_0,
            	    					"org.sodalite.sdl.ansible.AnsibleDsl.EFilteredVariableOrString");
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
    // $ANTLR end "ruleEValuePassed"


    // $ANTLR start "entryRuleEValuePassedToJinjaExpression"
    // InternalAnsibleDsl.g:5246:1: entryRuleEValuePassedToJinjaExpression returns [EObject current=null] : iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF ;
    public final EObject entryRuleEValuePassedToJinjaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassedToJinjaExpression = null;


        try {
            // InternalAnsibleDsl.g:5246:70: (iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF )
            // InternalAnsibleDsl.g:5247:2: iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF
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
    // InternalAnsibleDsl.g:5253:1: ruleEValuePassedToJinjaExpression returns [EObject current=null] : (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EDeclaredVariableReference_3= ruleEDeclaredVariableReference | this_EFunctionCall_4= ruleEFunctionCall ) ;
    public final EObject ruleEValuePassedToJinjaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EValue_0 = null;

        EObject this_EFactGathered_1 = null;

        EObject this_EItem_2 = null;

        EObject this_EDeclaredVariableReference_3 = null;

        EObject this_EFunctionCall_4 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5259:2: ( (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EDeclaredVariableReference_3= ruleEDeclaredVariableReference | this_EFunctionCall_4= ruleEFunctionCall ) )
            // InternalAnsibleDsl.g:5260:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EDeclaredVariableReference_3= ruleEDeclaredVariableReference | this_EFunctionCall_4= ruleEFunctionCall )
            {
            // InternalAnsibleDsl.g:5260:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EDeclaredVariableReference_3= ruleEDeclaredVariableReference | this_EFunctionCall_4= ruleEFunctionCall )
            int alt157=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_BOOLEAN:
            case RULE_NUMBER:
            case RULE_NULL:
            case 112:
            case 142:
                {
                alt157=1;
                }
                break;
            case 141:
                {
                alt157=2;
                }
                break;
            case 110:
                {
                alt157=3;
                }
                break;
            case RULE_ID:
                {
                int LA157_4 = input.LA(2);

                if ( (LA157_4==EOF||LA157_4==18||LA157_4==32||LA157_4==34||LA157_4==46||(LA157_4>=51 && LA157_4<=54)||LA157_4==58||(LA157_4>=72 && LA157_4<=74)||(LA157_4>=93 && LA157_4<=95)||LA157_4==98||(LA157_4>=111 && LA157_4<=112)||LA157_4==115||(LA157_4>=117 && LA157_4<=136)||(LA157_4>=138 && LA157_4<=140)) ) {
                    alt157=4;
                }
                else if ( (LA157_4==116) ) {
                    alt157=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 157, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }

            switch (alt157) {
                case 1 :
                    // InternalAnsibleDsl.g:5261:3: this_EValue_0= ruleEValue
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
                    // InternalAnsibleDsl.g:5270:3: this_EFactGathered_1= ruleEFactGathered
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
                    // InternalAnsibleDsl.g:5279:3: this_EItem_2= ruleEItem
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
                    // InternalAnsibleDsl.g:5288:3: this_EDeclaredVariableReference_3= ruleEDeclaredVariableReference
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
                    // InternalAnsibleDsl.g:5297:3: this_EFunctionCall_4= ruleEFunctionCall
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


    // $ANTLR start "entryRuleEValue"
    // InternalAnsibleDsl.g:5309:1: entryRuleEValue returns [EObject current=null] : iv_ruleEValue= ruleEValue EOF ;
    public final EObject entryRuleEValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValue = null;


        try {
            // InternalAnsibleDsl.g:5309:47: (iv_ruleEValue= ruleEValue EOF )
            // InternalAnsibleDsl.g:5310:2: iv_ruleEValue= ruleEValue EOF
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
    // InternalAnsibleDsl.g:5316:1: ruleEValue returns [EObject current=null] : (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_ESimpleValue_2= ruleESimpleValue ) ;
    public final EObject ruleEValue() throws RecognitionException {
        EObject current = null;

        EObject this_EDictionary_0 = null;

        EObject this_EList_1 = null;

        EObject this_ESimpleValue_2 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5322:2: ( (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_ESimpleValue_2= ruleESimpleValue ) )
            // InternalAnsibleDsl.g:5323:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_ESimpleValue_2= ruleESimpleValue )
            {
            // InternalAnsibleDsl.g:5323:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | this_ESimpleValue_2= ruleESimpleValue )
            int alt158=3;
            switch ( input.LA(1) ) {
            case 142:
                {
                alt158=1;
                }
                break;
            case 112:
                {
                alt158=2;
                }
                break;
            case RULE_STRING:
            case RULE_BOOLEAN:
            case RULE_NUMBER:
            case RULE_NULL:
                {
                alt158=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }

            switch (alt158) {
                case 1 :
                    // InternalAnsibleDsl.g:5324:3: this_EDictionary_0= ruleEDictionary
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
                    // InternalAnsibleDsl.g:5333:3: this_EList_1= ruleEList
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
                    // InternalAnsibleDsl.g:5342:3: this_ESimpleValue_2= ruleESimpleValue
                    {

                    			newCompositeNode(grammarAccess.getEValueAccess().getESimpleValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESimpleValue_2=ruleESimpleValue();

                    state._fsp--;


                    			current = this_ESimpleValue_2;
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
    // InternalAnsibleDsl.g:5354:1: entryRuleESimpleValue returns [EObject current=null] : iv_ruleESimpleValue= ruleESimpleValue EOF ;
    public final EObject entryRuleESimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESimpleValue = null;


        try {
            // InternalAnsibleDsl.g:5354:53: (iv_ruleESimpleValue= ruleESimpleValue EOF )
            // InternalAnsibleDsl.g:5355:2: iv_ruleESimpleValue= ruleESimpleValue EOF
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
    // InternalAnsibleDsl.g:5361:1: ruleESimpleValue returns [EObject current=null] : ( ( (lv_value_string_0_0= RULE_STRING ) ) | ( (lv_value_string_1_0= RULE_BOOLEAN ) ) | ( (lv_value_string_2_0= RULE_NULL ) ) | ( (lv_value_number_3_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleESimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_string_0_0=null;
        Token lv_value_string_1_0=null;
        Token lv_value_string_2_0=null;
        Token lv_value_number_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5367:2: ( ( ( (lv_value_string_0_0= RULE_STRING ) ) | ( (lv_value_string_1_0= RULE_BOOLEAN ) ) | ( (lv_value_string_2_0= RULE_NULL ) ) | ( (lv_value_number_3_0= RULE_NUMBER ) ) ) )
            // InternalAnsibleDsl.g:5368:2: ( ( (lv_value_string_0_0= RULE_STRING ) ) | ( (lv_value_string_1_0= RULE_BOOLEAN ) ) | ( (lv_value_string_2_0= RULE_NULL ) ) | ( (lv_value_number_3_0= RULE_NUMBER ) ) )
            {
            // InternalAnsibleDsl.g:5368:2: ( ( (lv_value_string_0_0= RULE_STRING ) ) | ( (lv_value_string_1_0= RULE_BOOLEAN ) ) | ( (lv_value_string_2_0= RULE_NULL ) ) | ( (lv_value_number_3_0= RULE_NUMBER ) ) )
            int alt159=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt159=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt159=2;
                }
                break;
            case RULE_NULL:
                {
                alt159=3;
                }
                break;
            case RULE_NUMBER:
                {
                alt159=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 159, 0, input);

                throw nvae;
            }

            switch (alt159) {
                case 1 :
                    // InternalAnsibleDsl.g:5369:3: ( (lv_value_string_0_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:5369:3: ( (lv_value_string_0_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:5370:4: (lv_value_string_0_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:5370:4: (lv_value_string_0_0= RULE_STRING )
                    // InternalAnsibleDsl.g:5371:5: lv_value_string_0_0= RULE_STRING
                    {
                    lv_value_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_string_0_0, grammarAccess.getESimpleValueAccess().getValue_stringSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_string",
                    						lv_value_string_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5388:3: ( (lv_value_string_1_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:5388:3: ( (lv_value_string_1_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:5389:4: (lv_value_string_1_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:5389:4: (lv_value_string_1_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:5390:5: lv_value_string_1_0= RULE_BOOLEAN
                    {
                    lv_value_string_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_value_string_1_0, grammarAccess.getESimpleValueAccess().getValue_stringBOOLEANTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_string",
                    						lv_value_string_1_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:5407:3: ( (lv_value_string_2_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:5407:3: ( (lv_value_string_2_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:5408:4: (lv_value_string_2_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:5408:4: (lv_value_string_2_0= RULE_NULL )
                    // InternalAnsibleDsl.g:5409:5: lv_value_string_2_0= RULE_NULL
                    {
                    lv_value_string_2_0=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    					newLeafNode(lv_value_string_2_0, grammarAccess.getESimpleValueAccess().getValue_stringNULLTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_string",
                    						lv_value_string_2_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NULL");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAnsibleDsl.g:5426:3: ( (lv_value_number_3_0= RULE_NUMBER ) )
                    {
                    // InternalAnsibleDsl.g:5426:3: ( (lv_value_number_3_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:5427:4: (lv_value_number_3_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:5427:4: (lv_value_number_3_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:5428:5: lv_value_number_3_0= RULE_NUMBER
                    {
                    lv_value_number_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_value_number_3_0, grammarAccess.getESimpleValueAccess().getValue_numberNUMBERTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_number",
                    						lv_value_number_3_0,
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
    // InternalAnsibleDsl.g:5448:1: entryRuleEItem returns [EObject current=null] : iv_ruleEItem= ruleEItem EOF ;
    public final EObject entryRuleEItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEItem = null;


        try {
            // InternalAnsibleDsl.g:5448:46: (iv_ruleEItem= ruleEItem EOF )
            // InternalAnsibleDsl.g:5449:2: iv_ruleEItem= ruleEItem EOF
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
    // InternalAnsibleDsl.g:5455:1: ruleEItem returns [EObject current=null] : ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tail_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5461:2: ( ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:5462:2: ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:5462:2: ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:5463:3: () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            {
            // InternalAnsibleDsl.g:5463:3: ()
            // InternalAnsibleDsl.g:5464:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEItemAccess().getEItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,110,FOLLOW_143); 

            			newLeafNode(otherlv_1, grammarAccess.getEItemAccess().getItemKeyword_1());
            		
            // InternalAnsibleDsl.g:5474:3: (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            loop160:
            do {
                int alt160=2;
                int LA160_0 = input.LA(1);

                if ( (LA160_0==111) ) {
                    int LA160_2 = input.LA(2);

                    if ( (LA160_2==RULE_ID) ) {
                        int LA160_3 = input.LA(3);

                        if ( (LA160_3==EOF||LA160_3==18||LA160_3==32||LA160_3==34||LA160_3==46||(LA160_3>=51 && LA160_3<=54)||LA160_3==58||(LA160_3>=72 && LA160_3<=74)||(LA160_3>=93 && LA160_3<=95)||LA160_3==98||LA160_3==111||LA160_3==115||(LA160_3>=117 && LA160_3<=136)||(LA160_3>=138 && LA160_3<=140)) ) {
                            alt160=1;
                        }


                    }


                }


                switch (alt160) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5475:4: otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,111,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEItemAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5479:4: ( (lv_tail_3_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:5480:5: (lv_tail_3_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:5480:5: (lv_tail_3_0= RULE_ID )
            	    // InternalAnsibleDsl.g:5481:6: lv_tail_3_0= RULE_ID
            	    {
            	    lv_tail_3_0=(Token)match(input,RULE_ID,FOLLOW_143); 

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
            	    break loop160;
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
    // InternalAnsibleDsl.g:5502:1: entryRuleEDeclaredVariableReference returns [EObject current=null] : iv_ruleEDeclaredVariableReference= ruleEDeclaredVariableReference EOF ;
    public final EObject entryRuleEDeclaredVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDeclaredVariableReference = null;


        try {
            // InternalAnsibleDsl.g:5502:67: (iv_ruleEDeclaredVariableReference= ruleEDeclaredVariableReference EOF )
            // InternalAnsibleDsl.g:5503:2: iv_ruleEDeclaredVariableReference= ruleEDeclaredVariableReference EOF
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
    // InternalAnsibleDsl.g:5509:1: ruleEDeclaredVariableReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* ) ;
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
            // InternalAnsibleDsl.g:5515:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* ) )
            // InternalAnsibleDsl.g:5516:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* )
            {
            // InternalAnsibleDsl.g:5516:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* )
            // InternalAnsibleDsl.g:5517:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )*
            {
            // InternalAnsibleDsl.g:5517:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5518:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5518:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:5519:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDeclaredVariableReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_144); 

            					newLeafNode(otherlv_0, grammarAccess.getEDeclaredVariableReferenceAccess().getVariable_referenceEDeclaredVariableCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:5530:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==112) ) {
                alt161=1;
            }
            switch (alt161) {
                case 1 :
                    // InternalAnsibleDsl.g:5531:4: otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,112,FOLLOW_112); 

                    				newLeafNode(otherlv_1, grammarAccess.getEDeclaredVariableReferenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5535:4: ( (lv_index_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:5536:5: (lv_index_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:5536:5: (lv_index_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:5537:6: lv_index_2_0= RULE_NUMBER
                    {
                    lv_index_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_145); 

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

                    otherlv_3=(Token)match(input,113,FOLLOW_143); 

                    				newLeafNode(otherlv_3, grammarAccess.getEDeclaredVariableReferenceAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:5558:3: (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )*
            loop162:
            do {
                int alt162=2;
                int LA162_0 = input.LA(1);

                if ( (LA162_0==111) ) {
                    int LA162_2 = input.LA(2);

                    if ( (LA162_2==RULE_ID) ) {
                        int LA162_3 = input.LA(3);

                        if ( (LA162_3==EOF||LA162_3==18||LA162_3==32||LA162_3==34||LA162_3==46||(LA162_3>=51 && LA162_3<=54)||LA162_3==58||(LA162_3>=72 && LA162_3<=74)||(LA162_3>=93 && LA162_3<=95)||LA162_3==98||(LA162_3>=111 && LA162_3<=112)||LA162_3==115||(LA162_3>=117 && LA162_3<=136)||(LA162_3>=138 && LA162_3<=140)) ) {
                            alt162=1;
                        }


                    }


                }


                switch (alt162) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5559:4: otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) )
            	    {
            	    otherlv_4=(Token)match(input,111,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEDeclaredVariableReferenceAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5563:4: ( (lv_tail_5_0= ruleEDictionaryPairReference ) )
            	    // InternalAnsibleDsl.g:5564:5: (lv_tail_5_0= ruleEDictionaryPairReference )
            	    {
            	    // InternalAnsibleDsl.g:5564:5: (lv_tail_5_0= ruleEDictionaryPairReference )
            	    // InternalAnsibleDsl.g:5565:6: lv_tail_5_0= ruleEDictionaryPairReference
            	    {

            	    						newCompositeNode(grammarAccess.getEDeclaredVariableReferenceAccess().getTailEDictionaryPairReferenceParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_143);
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
            	    break loop162;
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
    // InternalAnsibleDsl.g:5587:1: entryRuleEJinjaExpressionEvaluation returns [EObject current=null] : iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF ;
    public final EObject entryRuleEJinjaExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionEvaluation = null;


        try {
            // InternalAnsibleDsl.g:5587:67: (iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF )
            // InternalAnsibleDsl.g:5588:2: iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF
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
    // InternalAnsibleDsl.g:5594:1: ruleEJinjaExpressionEvaluation returns [EObject current=null] : (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' ) ;
    public final EObject ruleEJinjaExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_jinja_expression_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5600:2: ( (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' ) )
            // InternalAnsibleDsl.g:5601:2: (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' )
            {
            // InternalAnsibleDsl.g:5601:2: (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' )
            // InternalAnsibleDsl.g:5602:3: otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}'
            {
            otherlv_0=(Token)match(input,114,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getEJinjaExpressionEvaluationAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:5606:3: ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            // InternalAnsibleDsl.g:5607:4: (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            {
            // InternalAnsibleDsl.g:5607:4: (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            // InternalAnsibleDsl.g:5608:5: lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            {

            					newCompositeNode(grammarAccess.getEJinjaExpressionEvaluationAccess().getJinja_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_146);
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

            otherlv_2=(Token)match(input,115,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:5633:1: entryRuleEJinjaExpressionEvaluationWithoutBrackets returns [EObject current=null] : iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF ;
    public final EObject entryRuleEJinjaExpressionEvaluationWithoutBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionEvaluationWithoutBrackets = null;


        try {
            // InternalAnsibleDsl.g:5633:82: (iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF )
            // InternalAnsibleDsl.g:5634:2: iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF
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
    // InternalAnsibleDsl.g:5640:1: ruleEJinjaExpressionEvaluationWithoutBrackets returns [EObject current=null] : (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression ) ;
    public final EObject ruleEJinjaExpressionEvaluationWithoutBrackets() throws RecognitionException {
        EObject current = null;

        EObject this_EFilteredExpression_0 = null;

        EObject this_EIfExpression_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5646:2: ( (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression ) )
            // InternalAnsibleDsl.g:5647:2: (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression )
            {
            // InternalAnsibleDsl.g:5647:2: (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( ((LA163_0>=RULE_STRING && LA163_0<=RULE_NULL)||LA163_0==110||LA163_0==112||LA163_0==116||(LA163_0>=141 && LA163_0<=142)) ) {
                alt163=1;
            }
            else if ( (LA163_0==137) ) {
                alt163=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }
            switch (alt163) {
                case 1 :
                    // InternalAnsibleDsl.g:5648:3: this_EFilteredExpression_0= ruleEFilteredExpression
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
                    // InternalAnsibleDsl.g:5657:3: this_EIfExpression_1= ruleEIfExpression
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
    // InternalAnsibleDsl.g:5669:1: entryRuleEFunctionCall returns [EObject current=null] : iv_ruleEFunctionCall= ruleEFunctionCall EOF ;
    public final EObject entryRuleEFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunctionCall = null;


        try {
            // InternalAnsibleDsl.g:5669:54: (iv_ruleEFunctionCall= ruleEFunctionCall EOF )
            // InternalAnsibleDsl.g:5670:2: iv_ruleEFunctionCall= ruleEFunctionCall EOF
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
    // InternalAnsibleDsl.g:5676:1: ruleEFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) ) ;
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
            // InternalAnsibleDsl.g:5682:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) ) )
            // InternalAnsibleDsl.g:5683:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) )
            {
            // InternalAnsibleDsl.g:5683:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) )
            // InternalAnsibleDsl.g:5684:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) )
            {
            // InternalAnsibleDsl.g:5684:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5685:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5685:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:5686:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_147); 

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

            // InternalAnsibleDsl.g:5702:3: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) )
            int alt165=2;
            int LA165_0 = input.LA(1);

            if ( (LA165_0==116) ) {
                int LA165_1 = input.LA(2);

                if ( ((LA165_1>=RULE_STRING && LA165_1<=RULE_NULL)||LA165_1==110||LA165_1==112||LA165_1==116||(LA165_1>=141 && LA165_1<=142)) ) {
                    alt165=1;
                }
                else if ( (LA165_1==117) ) {
                    alt165=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 165, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 165, 0, input);

                throw nvae;
            }
            switch (alt165) {
                case 1 :
                    // InternalAnsibleDsl.g:5703:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' )
                    {
                    // InternalAnsibleDsl.g:5703:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' )
                    // InternalAnsibleDsl.g:5704:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,116,FOLLOW_148); 

                    					newLeafNode(otherlv_1, grammarAccess.getEFunctionCallAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalAnsibleDsl.g:5708:5: ( (lv_parameters_2_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:5709:6: (lv_parameters_2_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:5709:6: (lv_parameters_2_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:5710:7: lv_parameters_2_0= ruleEFilteredExpression
                    {

                    							newCompositeNode(grammarAccess.getEFunctionCallAccess().getParametersEFilteredExpressionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_149);
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

                    // InternalAnsibleDsl.g:5727:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )*
                    loop164:
                    do {
                        int alt164=2;
                        int LA164_0 = input.LA(1);

                        if ( (LA164_0==32) ) {
                            alt164=1;
                        }


                        switch (alt164) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:5728:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,32,FOLLOW_148); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getEFunctionCallAccess().getCommaKeyword_1_0_2_0());
                    	    					
                    	    // InternalAnsibleDsl.g:5732:6: ( (lv_parameters_4_0= ruleEFilteredExpression ) )
                    	    // InternalAnsibleDsl.g:5733:7: (lv_parameters_4_0= ruleEFilteredExpression )
                    	    {
                    	    // InternalAnsibleDsl.g:5733:7: (lv_parameters_4_0= ruleEFilteredExpression )
                    	    // InternalAnsibleDsl.g:5734:8: lv_parameters_4_0= ruleEFilteredExpression
                    	    {

                    	    								newCompositeNode(grammarAccess.getEFunctionCallAccess().getParametersEFilteredExpressionParserRuleCall_1_0_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_149);
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
                    	    break loop164;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,117,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getEFunctionCallAccess().getRightParenthesisKeyword_1_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5758:4: (otherlv_6= '(' otherlv_7= ')' )
                    {
                    // InternalAnsibleDsl.g:5758:4: (otherlv_6= '(' otherlv_7= ')' )
                    // InternalAnsibleDsl.g:5759:5: otherlv_6= '(' otherlv_7= ')'
                    {
                    otherlv_6=(Token)match(input,116,FOLLOW_150); 

                    					newLeafNode(otherlv_6, grammarAccess.getEFunctionCallAccess().getLeftParenthesisKeyword_1_1_0());
                    				
                    otherlv_7=(Token)match(input,117,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:5773:1: entryRuleEFilteredExpression returns [EObject current=null] : iv_ruleEFilteredExpression= ruleEFilteredExpression EOF ;
    public final EObject entryRuleEFilteredExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredExpression = null;


        try {
            // InternalAnsibleDsl.g:5773:60: (iv_ruleEFilteredExpression= ruleEFilteredExpression EOF )
            // InternalAnsibleDsl.g:5774:2: iv_ruleEFilteredExpression= ruleEFilteredExpression EOF
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
    // InternalAnsibleDsl.g:5780:1: ruleEFilteredExpression returns [EObject current=null] : ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? ) ;
    public final EObject ruleEFilteredExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_to_filter_0_0 = null;

        EObject lv_tail_2_0 = null;

        EObject lv_filter_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5786:2: ( ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5787:2: ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5787:2: ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? )
            // InternalAnsibleDsl.g:5788:3: ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5788:3: ( (lv_to_filter_0_0= ruleEOrExpression ) )
            // InternalAnsibleDsl.g:5789:4: (lv_to_filter_0_0= ruleEOrExpression )
            {
            // InternalAnsibleDsl.g:5789:4: (lv_to_filter_0_0= ruleEOrExpression )
            // InternalAnsibleDsl.g:5790:5: lv_to_filter_0_0= ruleEOrExpression
            {

            					newCompositeNode(grammarAccess.getEFilteredExpressionAccess().getTo_filterEOrExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_151);
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

            // InternalAnsibleDsl.g:5807:3: (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )*
            loop166:
            do {
                int alt166=2;
                int LA166_0 = input.LA(1);

                if ( (LA166_0==111) ) {
                    alt166=1;
                }


                switch (alt166) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5808:4: otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) )
            	    {
            	    otherlv_1=(Token)match(input,111,FOLLOW_152); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEFilteredExpressionAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalAnsibleDsl.g:5812:4: ( (lv_tail_2_0= ruleEFunctionCall ) )
            	    // InternalAnsibleDsl.g:5813:5: (lv_tail_2_0= ruleEFunctionCall )
            	    {
            	    // InternalAnsibleDsl.g:5813:5: (lv_tail_2_0= ruleEFunctionCall )
            	    // InternalAnsibleDsl.g:5814:6: lv_tail_2_0= ruleEFunctionCall
            	    {

            	    						newCompositeNode(grammarAccess.getEFilteredExpressionAccess().getTailEFunctionCallParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_151);
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
            	    break loop166;
                }
            } while (true);

            // InternalAnsibleDsl.g:5832:3: (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )?
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==118) ) {
                alt167=1;
            }
            switch (alt167) {
                case 1 :
                    // InternalAnsibleDsl.g:5833:4: otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) )
                    {
                    otherlv_3=(Token)match(input,118,FOLLOW_148); 

                    				newLeafNode(otherlv_3, grammarAccess.getEFilteredExpressionAccess().getVerticalLineKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:5837:4: ( (lv_filter_4_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:5838:5: (lv_filter_4_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:5838:5: (lv_filter_4_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:5839:6: lv_filter_4_0= ruleEFilteredExpression
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
    // InternalAnsibleDsl.g:5861:1: entryRuleEOrExpression returns [EObject current=null] : iv_ruleEOrExpression= ruleEOrExpression EOF ;
    public final EObject entryRuleEOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOrExpression = null;


        try {
            // InternalAnsibleDsl.g:5861:54: (iv_ruleEOrExpression= ruleEOrExpression EOF )
            // InternalAnsibleDsl.g:5862:2: iv_ruleEOrExpression= ruleEOrExpression EOF
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
    // InternalAnsibleDsl.g:5868:1: ruleEOrExpression returns [EObject current=null] : ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? ) ;
    public final EObject ruleEOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_or_0_0 = null;

        EObject lv_right_or_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5874:2: ( ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5875:2: ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5875:2: ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? )
            // InternalAnsibleDsl.g:5876:3: ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5876:3: ( (lv_left_or_0_0= ruleEAndExpression ) )
            // InternalAnsibleDsl.g:5877:4: (lv_left_or_0_0= ruleEAndExpression )
            {
            // InternalAnsibleDsl.g:5877:4: (lv_left_or_0_0= ruleEAndExpression )
            // InternalAnsibleDsl.g:5878:5: lv_left_or_0_0= ruleEAndExpression
            {

            					newCompositeNode(grammarAccess.getEOrExpressionAccess().getLeft_orEAndExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_153);
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

            // InternalAnsibleDsl.g:5895:3: (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )?
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==119) ) {
                alt168=1;
            }
            switch (alt168) {
                case 1 :
                    // InternalAnsibleDsl.g:5896:4: otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,119,FOLLOW_148); 

                    				newLeafNode(otherlv_1, grammarAccess.getEOrExpressionAccess().getOrKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5900:4: ( (lv_right_or_2_0= ruleEOrExpression ) )
                    // InternalAnsibleDsl.g:5901:5: (lv_right_or_2_0= ruleEOrExpression )
                    {
                    // InternalAnsibleDsl.g:5901:5: (lv_right_or_2_0= ruleEOrExpression )
                    // InternalAnsibleDsl.g:5902:6: lv_right_or_2_0= ruleEOrExpression
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
    // InternalAnsibleDsl.g:5924:1: entryRuleEAndExpression returns [EObject current=null] : iv_ruleEAndExpression= ruleEAndExpression EOF ;
    public final EObject entryRuleEAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAndExpression = null;


        try {
            // InternalAnsibleDsl.g:5924:55: (iv_ruleEAndExpression= ruleEAndExpression EOF )
            // InternalAnsibleDsl.g:5925:2: iv_ruleEAndExpression= ruleEAndExpression EOF
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
    // InternalAnsibleDsl.g:5931:1: ruleEAndExpression returns [EObject current=null] : ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? ) ;
    public final EObject ruleEAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_and_0_0 = null;

        EObject lv_right_and_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5937:2: ( ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5938:2: ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5938:2: ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? )
            // InternalAnsibleDsl.g:5939:3: ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5939:3: ( (lv_left_and_0_0= ruleETruthExpression ) )
            // InternalAnsibleDsl.g:5940:4: (lv_left_and_0_0= ruleETruthExpression )
            {
            // InternalAnsibleDsl.g:5940:4: (lv_left_and_0_0= ruleETruthExpression )
            // InternalAnsibleDsl.g:5941:5: lv_left_and_0_0= ruleETruthExpression
            {

            					newCompositeNode(grammarAccess.getEAndExpressionAccess().getLeft_andETruthExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_154);
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

            // InternalAnsibleDsl.g:5958:3: (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )?
            int alt169=2;
            int LA169_0 = input.LA(1);

            if ( (LA169_0==120) ) {
                alt169=1;
            }
            switch (alt169) {
                case 1 :
                    // InternalAnsibleDsl.g:5959:4: otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,120,FOLLOW_148); 

                    				newLeafNode(otherlv_1, grammarAccess.getEAndExpressionAccess().getAndKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5963:4: ( (lv_right_and_2_0= ruleEAndExpression ) )
                    // InternalAnsibleDsl.g:5964:5: (lv_right_and_2_0= ruleEAndExpression )
                    {
                    // InternalAnsibleDsl.g:5964:5: (lv_right_and_2_0= ruleEAndExpression )
                    // InternalAnsibleDsl.g:5965:6: lv_right_and_2_0= ruleEAndExpression
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
    // InternalAnsibleDsl.g:5987:1: entryRuleETruthExpression returns [EObject current=null] : iv_ruleETruthExpression= ruleETruthExpression EOF ;
    public final EObject entryRuleETruthExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETruthExpression = null;


        try {
            // InternalAnsibleDsl.g:5987:57: (iv_ruleETruthExpression= ruleETruthExpression EOF )
            // InternalAnsibleDsl.g:5988:2: iv_ruleETruthExpression= ruleETruthExpression EOF
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
    // InternalAnsibleDsl.g:5994:1: ruleETruthExpression returns [EObject current=null] : ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? ) ;
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
            // InternalAnsibleDsl.g:6000:2: ( ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? ) )
            // InternalAnsibleDsl.g:6001:2: ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:6001:2: ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? )
            // InternalAnsibleDsl.g:6002:3: ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )?
            {
            // InternalAnsibleDsl.g:6002:3: ( (lv_left_value_0_0= ruleEOperation ) )
            // InternalAnsibleDsl.g:6003:4: (lv_left_value_0_0= ruleEOperation )
            {
            // InternalAnsibleDsl.g:6003:4: (lv_left_value_0_0= ruleEOperation )
            // InternalAnsibleDsl.g:6004:5: lv_left_value_0_0= ruleEOperation
            {

            					newCompositeNode(grammarAccess.getETruthExpressionAccess().getLeft_valueEOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_155);
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

            // InternalAnsibleDsl.g:6021:3: ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( ((LA171_0>=121 && LA171_0<=126)) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // InternalAnsibleDsl.g:6022:4: ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) )
                    {
                    // InternalAnsibleDsl.g:6022:4: ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) )
                    // InternalAnsibleDsl.g:6023:5: ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) )
                    {
                    // InternalAnsibleDsl.g:6023:5: ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) )
                    // InternalAnsibleDsl.g:6024:6: (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' )
                    {
                    // InternalAnsibleDsl.g:6024:6: (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' )
                    int alt170=6;
                    switch ( input.LA(1) ) {
                    case 121:
                        {
                        alt170=1;
                        }
                        break;
                    case 122:
                        {
                        alt170=2;
                        }
                        break;
                    case 123:
                        {
                        alt170=3;
                        }
                        break;
                    case 124:
                        {
                        alt170=4;
                        }
                        break;
                    case 125:
                        {
                        alt170=5;
                        }
                        break;
                    case 126:
                        {
                        alt170=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 170, 0, input);

                        throw nvae;
                    }

                    switch (alt170) {
                        case 1 :
                            // InternalAnsibleDsl.g:6025:7: lv_equality_sign_1_1= '=='
                            {
                            lv_equality_sign_1_1=(Token)match(input,121,FOLLOW_148); 

                            							newLeafNode(lv_equality_sign_1_1, grammarAccess.getETruthExpressionAccess().getEquality_signEqualsSignEqualsSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:6036:7: lv_equality_sign_1_2= '!='
                            {
                            lv_equality_sign_1_2=(Token)match(input,122,FOLLOW_148); 

                            							newLeafNode(lv_equality_sign_1_2, grammarAccess.getETruthExpressionAccess().getEquality_signExclamationMarkEqualsSignKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:6047:7: lv_equality_sign_1_3= '<'
                            {
                            lv_equality_sign_1_3=(Token)match(input,123,FOLLOW_148); 

                            							newLeafNode(lv_equality_sign_1_3, grammarAccess.getETruthExpressionAccess().getEquality_signLessThanSignKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:6058:7: lv_equality_sign_1_4= '>'
                            {
                            lv_equality_sign_1_4=(Token)match(input,124,FOLLOW_148); 

                            							newLeafNode(lv_equality_sign_1_4, grammarAccess.getETruthExpressionAccess().getEquality_signGreaterThanSignKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:6069:7: lv_equality_sign_1_5= '<='
                            {
                            lv_equality_sign_1_5=(Token)match(input,125,FOLLOW_148); 

                            							newLeafNode(lv_equality_sign_1_5, grammarAccess.getETruthExpressionAccess().getEquality_signLessThanSignEqualsSignKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalAnsibleDsl.g:6080:7: lv_equality_sign_1_6= '>='
                            {
                            lv_equality_sign_1_6=(Token)match(input,126,FOLLOW_148); 

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

                    // InternalAnsibleDsl.g:6093:4: ( (lv_right_value_2_0= ruleETruthExpression ) )
                    // InternalAnsibleDsl.g:6094:5: (lv_right_value_2_0= ruleETruthExpression )
                    {
                    // InternalAnsibleDsl.g:6094:5: (lv_right_value_2_0= ruleETruthExpression )
                    // InternalAnsibleDsl.g:6095:6: lv_right_value_2_0= ruleETruthExpression
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
    // InternalAnsibleDsl.g:6117:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalAnsibleDsl.g:6117:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalAnsibleDsl.g:6118:2: iv_ruleEOperation= ruleEOperation EOF
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
    // InternalAnsibleDsl.g:6124:1: ruleEOperation returns [EObject current=null] : ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? ) ;
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
            // InternalAnsibleDsl.g:6130:2: ( ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? ) )
            // InternalAnsibleDsl.g:6131:2: ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? )
            {
            // InternalAnsibleDsl.g:6131:2: ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? )
            // InternalAnsibleDsl.g:6132:3: ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )?
            {
            // InternalAnsibleDsl.g:6132:3: ( (lv_left_operand_0_0= ruleEIsExpression ) )
            // InternalAnsibleDsl.g:6133:4: (lv_left_operand_0_0= ruleEIsExpression )
            {
            // InternalAnsibleDsl.g:6133:4: (lv_left_operand_0_0= ruleEIsExpression )
            // InternalAnsibleDsl.g:6134:5: lv_left_operand_0_0= ruleEIsExpression
            {

            					newCompositeNode(grammarAccess.getEOperationAccess().getLeft_operandEIsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_156);
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

            // InternalAnsibleDsl.g:6151:3: ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )?
            int alt173=2;
            int LA173_0 = input.LA(1);

            if ( ((LA173_0>=127 && LA173_0<=133)) ) {
                alt173=1;
            }
            switch (alt173) {
                case 1 :
                    // InternalAnsibleDsl.g:6152:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) )
                    {
                    // InternalAnsibleDsl.g:6152:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) )
                    // InternalAnsibleDsl.g:6153:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) )
                    {
                    // InternalAnsibleDsl.g:6153:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) )
                    // InternalAnsibleDsl.g:6154:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' )
                    {
                    // InternalAnsibleDsl.g:6154:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' )
                    int alt172=7;
                    switch ( input.LA(1) ) {
                    case 127:
                        {
                        alt172=1;
                        }
                        break;
                    case 128:
                        {
                        alt172=2;
                        }
                        break;
                    case 129:
                        {
                        alt172=3;
                        }
                        break;
                    case 130:
                        {
                        alt172=4;
                        }
                        break;
                    case 131:
                        {
                        alt172=5;
                        }
                        break;
                    case 132:
                        {
                        alt172=6;
                        }
                        break;
                    case 133:
                        {
                        alt172=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 172, 0, input);

                        throw nvae;
                    }

                    switch (alt172) {
                        case 1 :
                            // InternalAnsibleDsl.g:6155:7: lv_operator_1_1= '+'
                            {
                            lv_operator_1_1=(Token)match(input,127,FOLLOW_148); 

                            							newLeafNode(lv_operator_1_1, grammarAccess.getEOperationAccess().getOperatorPlusSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:6166:7: lv_operator_1_2= '-'
                            {
                            lv_operator_1_2=(Token)match(input,128,FOLLOW_148); 

                            							newLeafNode(lv_operator_1_2, grammarAccess.getEOperationAccess().getOperatorHyphenMinusKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:6177:7: lv_operator_1_3= '/'
                            {
                            lv_operator_1_3=(Token)match(input,129,FOLLOW_148); 

                            							newLeafNode(lv_operator_1_3, grammarAccess.getEOperationAccess().getOperatorSolidusKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:6188:7: lv_operator_1_4= '//'
                            {
                            lv_operator_1_4=(Token)match(input,130,FOLLOW_148); 

                            							newLeafNode(lv_operator_1_4, grammarAccess.getEOperationAccess().getOperatorSolidusSolidusKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:6199:7: lv_operator_1_5= '%'
                            {
                            lv_operator_1_5=(Token)match(input,131,FOLLOW_148); 

                            							newLeafNode(lv_operator_1_5, grammarAccess.getEOperationAccess().getOperatorPercentSignKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalAnsibleDsl.g:6210:7: lv_operator_1_6= '*'
                            {
                            lv_operator_1_6=(Token)match(input,132,FOLLOW_148); 

                            							newLeafNode(lv_operator_1_6, grammarAccess.getEOperationAccess().getOperatorAsteriskKeyword_1_0_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_6, null);
                            						

                            }
                            break;
                        case 7 :
                            // InternalAnsibleDsl.g:6221:7: lv_operator_1_7= '**'
                            {
                            lv_operator_1_7=(Token)match(input,133,FOLLOW_148); 

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

                    // InternalAnsibleDsl.g:6234:4: ( (lv_right_operand_2_0= ruleEOperation ) )
                    // InternalAnsibleDsl.g:6235:5: (lv_right_operand_2_0= ruleEOperation )
                    {
                    // InternalAnsibleDsl.g:6235:5: (lv_right_operand_2_0= ruleEOperation )
                    // InternalAnsibleDsl.g:6236:6: lv_right_operand_2_0= ruleEOperation
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
    // InternalAnsibleDsl.g:6258:1: entryRuleEIsExpression returns [EObject current=null] : iv_ruleEIsExpression= ruleEIsExpression EOF ;
    public final EObject entryRuleEIsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIsExpression = null;


        try {
            // InternalAnsibleDsl.g:6258:54: (iv_ruleEIsExpression= ruleEIsExpression EOF )
            // InternalAnsibleDsl.g:6259:2: iv_ruleEIsExpression= ruleEIsExpression EOF
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
    // InternalAnsibleDsl.g:6265:1: ruleEIsExpression returns [EObject current=null] : ( ( (lv_filtered_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? ) ;
    public final EObject ruleEIsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_is_not_2_0=null;
        Token lv_is_not_4_0=null;
        Token otherlv_5=null;
        EObject lv_filtered_expression_0_0 = null;

        EObject lv_status_3_0 = null;

        EObject lv_container_expression_6_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6271:2: ( ( ( (lv_filtered_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? ) )
            // InternalAnsibleDsl.g:6272:2: ( ( (lv_filtered_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? )
            {
            // InternalAnsibleDsl.g:6272:2: ( ( (lv_filtered_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? )
            // InternalAnsibleDsl.g:6273:3: ( (lv_filtered_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )?
            {
            // InternalAnsibleDsl.g:6273:3: ( (lv_filtered_expression_0_0= ruleEParenthesisedExpression ) )
            // InternalAnsibleDsl.g:6274:4: (lv_filtered_expression_0_0= ruleEParenthesisedExpression )
            {
            // InternalAnsibleDsl.g:6274:4: (lv_filtered_expression_0_0= ruleEParenthesisedExpression )
            // InternalAnsibleDsl.g:6275:5: lv_filtered_expression_0_0= ruleEParenthesisedExpression
            {

            					newCompositeNode(grammarAccess.getEIsExpressionAccess().getFiltered_expressionEParenthesisedExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_157);
            lv_filtered_expression_0_0=ruleEParenthesisedExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEIsExpressionRule());
            					}
            					set(
            						current,
            						"filtered_expression",
            						lv_filtered_expression_0_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EParenthesisedExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:6292:3: ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )?
            int alt176=3;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==134) ) {
                alt176=1;
            }
            else if ( ((LA176_0>=135 && LA176_0<=136)) ) {
                alt176=2;
            }
            switch (alt176) {
                case 1 :
                    // InternalAnsibleDsl.g:6293:4: (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) )
                    {
                    // InternalAnsibleDsl.g:6293:4: (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) )
                    // InternalAnsibleDsl.g:6294:5: otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) )
                    {
                    otherlv_1=(Token)match(input,134,FOLLOW_158); 

                    					newLeafNode(otherlv_1, grammarAccess.getEIsExpressionAccess().getIsKeyword_1_0_0());
                    				
                    // InternalAnsibleDsl.g:6298:5: ( (lv_is_not_2_0= 'not' ) )?
                    int alt174=2;
                    int LA174_0 = input.LA(1);

                    if ( (LA174_0==135) ) {
                        alt174=1;
                    }
                    switch (alt174) {
                        case 1 :
                            // InternalAnsibleDsl.g:6299:6: (lv_is_not_2_0= 'not' )
                            {
                            // InternalAnsibleDsl.g:6299:6: (lv_is_not_2_0= 'not' )
                            // InternalAnsibleDsl.g:6300:7: lv_is_not_2_0= 'not'
                            {
                            lv_is_not_2_0=(Token)match(input,135,FOLLOW_148); 

                            							newLeafNode(lv_is_not_2_0, grammarAccess.getEIsExpressionAccess().getIs_notNotKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEIsExpressionRule());
                            							}
                            							setWithLastConsumed(current, "is_not", lv_is_not_2_0, "not");
                            						

                            }


                            }
                            break;

                    }

                    // InternalAnsibleDsl.g:6312:5: ( (lv_status_3_0= ruleEIsExpression ) )
                    // InternalAnsibleDsl.g:6313:6: (lv_status_3_0= ruleEIsExpression )
                    {
                    // InternalAnsibleDsl.g:6313:6: (lv_status_3_0= ruleEIsExpression )
                    // InternalAnsibleDsl.g:6314:7: lv_status_3_0= ruleEIsExpression
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
                    // InternalAnsibleDsl.g:6333:4: ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) )
                    {
                    // InternalAnsibleDsl.g:6333:4: ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) )
                    // InternalAnsibleDsl.g:6334:5: ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) )
                    {
                    // InternalAnsibleDsl.g:6334:5: ( (lv_is_not_4_0= 'not' ) )?
                    int alt175=2;
                    int LA175_0 = input.LA(1);

                    if ( (LA175_0==135) ) {
                        alt175=1;
                    }
                    switch (alt175) {
                        case 1 :
                            // InternalAnsibleDsl.g:6335:6: (lv_is_not_4_0= 'not' )
                            {
                            // InternalAnsibleDsl.g:6335:6: (lv_is_not_4_0= 'not' )
                            // InternalAnsibleDsl.g:6336:7: lv_is_not_4_0= 'not'
                            {
                            lv_is_not_4_0=(Token)match(input,135,FOLLOW_159); 

                            							newLeafNode(lv_is_not_4_0, grammarAccess.getEIsExpressionAccess().getIs_notNotKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEIsExpressionRule());
                            							}
                            							setWithLastConsumed(current, "is_not", lv_is_not_4_0, "not");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,136,FOLLOW_148); 

                    					newLeafNode(otherlv_5, grammarAccess.getEIsExpressionAccess().getInKeyword_1_1_1());
                    				
                    // InternalAnsibleDsl.g:6352:5: ( (lv_container_expression_6_0= ruleEIsExpression ) )
                    // InternalAnsibleDsl.g:6353:6: (lv_container_expression_6_0= ruleEIsExpression )
                    {
                    // InternalAnsibleDsl.g:6353:6: (lv_container_expression_6_0= ruleEIsExpression )
                    // InternalAnsibleDsl.g:6354:7: lv_container_expression_6_0= ruleEIsExpression
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
    // InternalAnsibleDsl.g:6377:1: entryRuleEParenthesisedExpression returns [EObject current=null] : iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF ;
    public final EObject entryRuleEParenthesisedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParenthesisedExpression = null;


        try {
            // InternalAnsibleDsl.g:6377:65: (iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF )
            // InternalAnsibleDsl.g:6378:2: iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF
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
    // InternalAnsibleDsl.g:6384:1: ruleEParenthesisedExpression returns [EObject current=null] : ( ( (lv_basic_Value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleEParenthesisedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_basic_Value_0_0 = null;

        EObject lv_parenthesised_term_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6390:2: ( ( ( (lv_basic_Value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) ) )
            // InternalAnsibleDsl.g:6391:2: ( ( (lv_basic_Value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) )
            {
            // InternalAnsibleDsl.g:6391:2: ( ( (lv_basic_Value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) )
            int alt177=2;
            int LA177_0 = input.LA(1);

            if ( ((LA177_0>=RULE_STRING && LA177_0<=RULE_NULL)||LA177_0==110||LA177_0==112||(LA177_0>=141 && LA177_0<=142)) ) {
                alt177=1;
            }
            else if ( (LA177_0==116) ) {
                alt177=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 177, 0, input);

                throw nvae;
            }
            switch (alt177) {
                case 1 :
                    // InternalAnsibleDsl.g:6392:3: ( (lv_basic_Value_0_0= ruleEValuePassedToJinjaExpression ) )
                    {
                    // InternalAnsibleDsl.g:6392:3: ( (lv_basic_Value_0_0= ruleEValuePassedToJinjaExpression ) )
                    // InternalAnsibleDsl.g:6393:4: (lv_basic_Value_0_0= ruleEValuePassedToJinjaExpression )
                    {
                    // InternalAnsibleDsl.g:6393:4: (lv_basic_Value_0_0= ruleEValuePassedToJinjaExpression )
                    // InternalAnsibleDsl.g:6394:5: lv_basic_Value_0_0= ruleEValuePassedToJinjaExpression
                    {

                    					newCompositeNode(grammarAccess.getEParenthesisedExpressionAccess().getBasic_ValueEValuePassedToJinjaExpressionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_basic_Value_0_0=ruleEValuePassedToJinjaExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEParenthesisedExpressionRule());
                    					}
                    					set(
                    						current,
                    						"basic_Value",
                    						lv_basic_Value_0_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassedToJinjaExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:6412:3: (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' )
                    {
                    // InternalAnsibleDsl.g:6412:3: (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' )
                    // InternalAnsibleDsl.g:6413:4: otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,116,FOLLOW_148); 

                    				newLeafNode(otherlv_1, grammarAccess.getEParenthesisedExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6417:4: ( (lv_parenthesised_term_2_0= ruleEOrExpression ) )
                    // InternalAnsibleDsl.g:6418:5: (lv_parenthesised_term_2_0= ruleEOrExpression )
                    {
                    // InternalAnsibleDsl.g:6418:5: (lv_parenthesised_term_2_0= ruleEOrExpression )
                    // InternalAnsibleDsl.g:6419:6: lv_parenthesised_term_2_0= ruleEOrExpression
                    {

                    						newCompositeNode(grammarAccess.getEParenthesisedExpressionAccess().getParenthesised_termEOrExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_150);
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

                    otherlv_3=(Token)match(input,117,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:6445:1: entryRuleEIfExpression returns [EObject current=null] : iv_ruleEIfExpression= ruleEIfExpression EOF ;
    public final EObject entryRuleEIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIfExpression = null;


        try {
            // InternalAnsibleDsl.g:6445:54: (iv_ruleEIfExpression= ruleEIfExpression EOF )
            // InternalAnsibleDsl.g:6446:2: iv_ruleEIfExpression= ruleEIfExpression EOF
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
    // InternalAnsibleDsl.g:6452:1: ruleEIfExpression returns [EObject current=null] : (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? ) ;
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
            // InternalAnsibleDsl.g:6458:2: ( (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? ) )
            // InternalAnsibleDsl.g:6459:2: (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:6459:2: (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? )
            // InternalAnsibleDsl.g:6460:3: otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )?
            {
            otherlv_0=(Token)match(input,137,FOLLOW_148); 

            			newLeafNode(otherlv_0, grammarAccess.getEIfExpressionAccess().getReturnKeyword_0());
            		
            // InternalAnsibleDsl.g:6464:3: ( (lv_if_expression_1_0= ruleEFilteredExpression ) )
            // InternalAnsibleDsl.g:6465:4: (lv_if_expression_1_0= ruleEFilteredExpression )
            {
            // InternalAnsibleDsl.g:6465:4: (lv_if_expression_1_0= ruleEFilteredExpression )
            // InternalAnsibleDsl.g:6466:5: lv_if_expression_1_0= ruleEFilteredExpression
            {

            					newCompositeNode(grammarAccess.getEIfExpressionAccess().getIf_expressionEFilteredExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_160);
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

            otherlv_2=(Token)match(input,138,FOLLOW_148); 

            			newLeafNode(otherlv_2, grammarAccess.getEIfExpressionAccess().getIfKeyword_2());
            		
            // InternalAnsibleDsl.g:6487:3: ( (lv_if_condition_3_0= ruleEFilteredExpression ) )
            // InternalAnsibleDsl.g:6488:4: (lv_if_condition_3_0= ruleEFilteredExpression )
            {
            // InternalAnsibleDsl.g:6488:4: (lv_if_condition_3_0= ruleEFilteredExpression )
            // InternalAnsibleDsl.g:6489:5: lv_if_condition_3_0= ruleEFilteredExpression
            {

            					newCompositeNode(grammarAccess.getEIfExpressionAccess().getIf_conditionEFilteredExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_161);
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

            // InternalAnsibleDsl.g:6506:3: (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )?
            int alt178=2;
            int LA178_0 = input.LA(1);

            if ( (LA178_0==139) ) {
                alt178=1;
            }
            switch (alt178) {
                case 1 :
                    // InternalAnsibleDsl.g:6507:4: otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) )
                    {
                    otherlv_4=(Token)match(input,139,FOLLOW_148); 

                    				newLeafNode(otherlv_4, grammarAccess.getEIfExpressionAccess().getElseKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:6511:4: ( (lv_else_expression_5_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:6512:5: (lv_else_expression_5_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:6512:5: (lv_else_expression_5_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:6513:6: lv_else_expression_5_0= ruleEFilteredExpression
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
    // InternalAnsibleDsl.g:6535:1: entryRuleEDictionaryPairReference returns [EObject current=null] : iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF ;
    public final EObject entryRuleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPairReference = null;


        try {
            // InternalAnsibleDsl.g:6535:65: (iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF )
            // InternalAnsibleDsl.g:6536:2: iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF
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
    // InternalAnsibleDsl.g:6542:1: ruleEDictionaryPairReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6548:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? ) )
            // InternalAnsibleDsl.g:6549:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? )
            {
            // InternalAnsibleDsl.g:6549:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? )
            // InternalAnsibleDsl.g:6550:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            {
            // InternalAnsibleDsl.g:6550:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6551:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6551:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:6552:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDictionaryPairReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_162); 

            					newLeafNode(otherlv_0, grammarAccess.getEDictionaryPairReferenceAccess().getNameEDictionaryPairCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6563:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==112) ) {
                alt179=1;
            }
            switch (alt179) {
                case 1 :
                    // InternalAnsibleDsl.g:6564:4: otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,112,FOLLOW_112); 

                    				newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairReferenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6568:4: ( (lv_index_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6569:5: (lv_index_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6569:5: (lv_index_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6570:6: lv_index_2_0= RULE_NUMBER
                    {
                    lv_index_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_145); 

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

                    otherlv_3=(Token)match(input,113,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:6595:1: entryRuleEVariableDeclaration returns [EObject current=null] : iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF ;
    public final EObject entryRuleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclaration = null;


        try {
            // InternalAnsibleDsl.g:6595:61: (iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF )
            // InternalAnsibleDsl.g:6596:2: iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF
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
    // InternalAnsibleDsl.g:6602:1: ruleEVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6608:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:6609:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:6609:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:6610:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:6610:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6611:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6611:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6612:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,61,FOLLOW_163); 

            			newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:6632:3: ( (lv_value_passed_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6633:4: (lv_value_passed_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6633:4: (lv_value_passed_2_0= ruleEValue )
            // InternalAnsibleDsl.g:6634:5: lv_value_passed_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:6655:1: entryRuleERegisterVariable returns [EObject current=null] : iv_ruleERegisterVariable= ruleERegisterVariable EOF ;
    public final EObject entryRuleERegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariable = null;


        try {
            // InternalAnsibleDsl.g:6655:58: (iv_ruleERegisterVariable= ruleERegisterVariable EOF )
            // InternalAnsibleDsl.g:6656:2: iv_ruleERegisterVariable= ruleERegisterVariable EOF
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
    // InternalAnsibleDsl.g:6662:1: ruleERegisterVariable returns [EObject current=null] : (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleERegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6668:2: ( (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:6669:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:6669:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6670:3: otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,140,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableAccess().getRegisterKeyword_0());
            		
            // InternalAnsibleDsl.g:6674:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6675:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6675:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:6676:5: lv_name_1_0= RULE_ID
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
    // InternalAnsibleDsl.g:6696:1: entryRuleEFactGathered returns [EObject current=null] : iv_ruleEFactGathered= ruleEFactGathered EOF ;
    public final EObject entryRuleEFactGathered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactGathered = null;


        try {
            // InternalAnsibleDsl.g:6696:54: (iv_ruleEFactGathered= ruleEFactGathered EOF )
            // InternalAnsibleDsl.g:6697:2: iv_ruleEFactGathered= ruleEFactGathered EOF
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
    // InternalAnsibleDsl.g:6703:1: ruleEFactGathered returns [EObject current=null] : ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEFactGathered() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tail_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6709:2: ( ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:6710:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:6710:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:6711:3: () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            {
            // InternalAnsibleDsl.g:6711:3: ()
            // InternalAnsibleDsl.g:6712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactGatheredAccess().getEFactGatheredAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,141,FOLLOW_143); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactGatheredAccess().getAnsible_factsKeyword_1());
            		
            // InternalAnsibleDsl.g:6722:3: (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            loop180:
            do {
                int alt180=2;
                int LA180_0 = input.LA(1);

                if ( (LA180_0==111) ) {
                    int LA180_2 = input.LA(2);

                    if ( (LA180_2==RULE_ID) ) {
                        int LA180_3 = input.LA(3);

                        if ( (LA180_3==EOF||LA180_3==18||LA180_3==32||LA180_3==34||LA180_3==46||(LA180_3>=51 && LA180_3<=54)||LA180_3==58||(LA180_3>=72 && LA180_3<=74)||(LA180_3>=93 && LA180_3<=95)||LA180_3==98||LA180_3==111||LA180_3==115||(LA180_3>=117 && LA180_3<=136)||(LA180_3>=138 && LA180_3<=140)) ) {
                            alt180=1;
                        }


                    }


                }


                switch (alt180) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6723:4: otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,111,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEFactGatheredAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6727:4: ( (lv_tail_3_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:6728:5: (lv_tail_3_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:6728:5: (lv_tail_3_0= RULE_ID )
            	    // InternalAnsibleDsl.g:6729:6: lv_tail_3_0= RULE_ID
            	    {
            	    lv_tail_3_0=(Token)match(input,RULE_ID,FOLLOW_143); 

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
            	    break loop180;
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
    // InternalAnsibleDsl.g:6750:1: entryRuleEDictionary returns [EObject current=null] : iv_ruleEDictionary= ruleEDictionary EOF ;
    public final EObject entryRuleEDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionary = null;


        try {
            // InternalAnsibleDsl.g:6750:52: (iv_ruleEDictionary= ruleEDictionary EOF )
            // InternalAnsibleDsl.g:6751:2: iv_ruleEDictionary= ruleEDictionary EOF
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
    // InternalAnsibleDsl.g:6757:1: ruleEDictionary returns [EObject current=null] : (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dictionary_pairs_1_0 = null;

        EObject lv_dictionary_pairs_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6763:2: ( (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:6764:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:6764:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:6765:3: otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,142,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getEDictionaryAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:6769:3: ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) )
            // InternalAnsibleDsl.g:6770:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            {
            // InternalAnsibleDsl.g:6770:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            // InternalAnsibleDsl.g:6771:5: lv_dictionary_pairs_1_0= ruleEDictionaryPair
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

            // InternalAnsibleDsl.g:6788:3: (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )*
            loop181:
            do {
                int alt181=2;
                int LA181_0 = input.LA(1);

                if ( (LA181_0==32) ) {
                    alt181=1;
                }


                switch (alt181) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6789:4: otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_23); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEDictionaryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6793:4: ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    // InternalAnsibleDsl.g:6794:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    {
            	    // InternalAnsibleDsl.g:6794:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    // InternalAnsibleDsl.g:6795:6: lv_dictionary_pairs_3_0= ruleEDictionaryPair
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
            	    break loop181;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:6821:1: entryRuleEDictionaryPair returns [EObject current=null] : iv_ruleEDictionaryPair= ruleEDictionaryPair EOF ;
    public final EObject entryRuleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPair = null;


        try {
            // InternalAnsibleDsl.g:6821:56: (iv_ruleEDictionaryPair= ruleEDictionaryPair EOF )
            // InternalAnsibleDsl.g:6822:2: iv_ruleEDictionaryPair= ruleEDictionaryPair EOF
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
    // InternalAnsibleDsl.g:6828:1: ruleEDictionaryPair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6834:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:6835:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:6835:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:6836:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:6836:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6837:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6837:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6838:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,61,FOLLOW_163); 

            			newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:6858:3: ( (lv_value_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6859:4: (lv_value_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6859:4: (lv_value_2_0= ruleEValue )
            // InternalAnsibleDsl.g:6860:5: lv_value_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:6881:1: entryRuleEList returns [EObject current=null] : iv_ruleEList= ruleEList EOF ;
    public final EObject entryRuleEList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEList = null;


        try {
            // InternalAnsibleDsl.g:6881:46: (iv_ruleEList= ruleEList EOF )
            // InternalAnsibleDsl.g:6882:2: iv_ruleEList= ruleEList EOF
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
    // InternalAnsibleDsl.g:6888:1: ruleEList returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6894:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) )
            // InternalAnsibleDsl.g:6895:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            {
            // InternalAnsibleDsl.g:6895:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            // InternalAnsibleDsl.g:6896:3: otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,112,FOLLOW_163); 

            			newLeafNode(otherlv_0, grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:6900:3: ( (lv_elements_1_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6901:4: (lv_elements_1_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6901:4: (lv_elements_1_0= ruleEValue )
            // InternalAnsibleDsl.g:6902:5: lv_elements_1_0= ruleEValue
            {

            					newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_164);
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

            // InternalAnsibleDsl.g:6919:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )*
            loop182:
            do {
                int alt182=2;
                int LA182_0 = input.LA(1);

                if ( (LA182_0==32) ) {
                    alt182=1;
                }


                switch (alt182) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6920:4: otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_163); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6924:4: ( (lv_elements_3_0= ruleEValue ) )
            	    // InternalAnsibleDsl.g:6925:5: (lv_elements_3_0= ruleEValue )
            	    {
            	    // InternalAnsibleDsl.g:6925:5: (lv_elements_3_0= ruleEValue )
            	    // InternalAnsibleDsl.g:6926:6: lv_elements_3_0= ruleEValue
            	    {

            	    						newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_164);
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
            	    break loop182;
                }
            } while (true);

            otherlv_4=(Token)match(input,113,FOLLOW_2); 

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
    static final String dfa_3s = "\1\22\12\uffff";
    static final String dfa_4s = "\1\143\12\uffff";
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
                        if ( (LA24_0==EOF||LA24_0==18) ) {s = 1;}

                        else if ( LA24_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA24_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA24_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA24_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA24_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA24_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA24_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA24_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {s = 10;}

                         
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000FC00080000L,0x0000000800000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000FEF8380002L,0x0000000800120801L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000FEF8380002L,0x0000000800120001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000FEF8380002L,0x0000000800100001L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000FEF8380002L,0x0000000800000001L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000FEF8280002L,0x0000000800000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000FEF8080002L,0x0000000800000001L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000FEF0080002L,0x0000000800000001L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000FEE0080002L,0x0000000800000001L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000FEC0080002L,0x0000000800000001L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000FE80080002L,0x0000000800000001L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000FE00080002L,0x0000000800000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L,0x000000001F000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000FC00080002L,0x0000000800000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000040000L,0x00000001E0000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002040000040000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000003FC00080002L,0x0000000800000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000002FC00080002L,0x0000000800000001L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00007004F8300000L,0x0000010000120800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00007004F8300000L,0x0000010000120000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00007004F8300000L,0x0000010000100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00007004F8300000L,0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00007004F8200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00007004F8000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00007004F0000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00007004E0000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00007004C0000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000700480000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000700400000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000040000L,0x0000000018000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000600400000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000600400000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000000001F0L,0x0011400000000000L,0x0000000000006200L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000400400000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000040000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001800000040000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000040000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00783004F8300000L,0x0000010000120800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00783004F8300000L,0x0000010000120000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00783004F8300000L,0x0000010000100000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00783004F8300000L,0x0000010000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00783004F8200000L,0x0000010000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x00783004F8000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00783004F0000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x00783004E0000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x00783004C0000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0078300480000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0078300400000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0078200400000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0078200400000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0078000400000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000040000L,0x00000006E0000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0080000000040000L,0x0000000000000702L,0x0000000000001000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000010L,0x0000200000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000040010L,0x0000200000000702L,0x0000000000001000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0480000000040000L,0x0000000000000702L,0x0000000000001000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0400000000040010L,0x0000200000000702L,0x0000000000001000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0400000000040000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0400000000040000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000010L,0x0004000000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x00003000F8340000L,0x0000010000120800L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x00003000F8340000L,0x0000010000120000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x00003000F8340000L,0x0000010000100000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x00003000F8340000L,0x0000010000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x00003000F8240000L,0x0000010000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x00003000F8040000L,0x0000010000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x00003000F0040000L,0x0000010000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x00003000E0040000L,0x0000010000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x00003000C0040000L,0x0000010000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000300080040000L,0x0000010000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000300000040000L,0x0000010000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000200000040000L,0x0000010000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000200000040000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x4000000000040000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000040000L,0x00000000000000F8L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000040000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000040000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000040000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000080L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000700L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000040000L,0x000000000001F000L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000040000L,0x000000000001E000L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000040000L,0x000000000001C000L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000040000L,0x0000000000018000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000040000L,0x0000000000010000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000040000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000040000L,0x0000000000080000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000040000L,0x0000000000E00000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000040000L,0x0000000000C00000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000040000L,0x0000000000800000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000002L,0x000000001E000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000002L,0x000000001C000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000002L,0x00000004E0000000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000040000L,0x000000F000000000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000040000L,0x000000E000000000L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000040000L,0x000000C000000000L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000040000L,0x0000008000000000L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000040000L,0x0000040000000000L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000000000002L,0x0000180000000000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000000012L,0x0004000000000000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000000002L,0x0001800000000000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x00000000000001F0L,0x0011400000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x0000000100000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x0000000000000002L,0x0040800000000000L});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x00000000000001F0L,0x0001400000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x0000000000000002L,0x7E00000000000000L});
    public static final BitSet FOLLOW_156 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x00000000000001F0L,0x0011400000000000L,0x0000000000006080L});
    public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_162 = new BitSet(new long[]{0x0000000000000002L,0x0001000000000000L});
    public static final BitSet FOLLOW_163 = new BitSet(new long[]{0x00000000000001B0L,0x0001000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_164 = new BitSet(new long[]{0x0000000100000000L,0x0002000000000000L});

}
