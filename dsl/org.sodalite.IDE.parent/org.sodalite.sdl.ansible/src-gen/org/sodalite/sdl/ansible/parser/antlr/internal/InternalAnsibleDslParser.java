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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_INT", "RULE_NULL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'playbook{'", "'playbook_name:'", "'plays{'", "'play{'", "'}'", "'play_name:'", "'base_settings{'", "'play_exe_settings{'", "'error_handling{'", "'vars_files:'", "'vars_prompt:'", "'force_handlers:'", "'pre_tasks{'", "'tasks_list{'", "'post_tasks{'", "'handlers{'", "'block{'", "'block_name:'", "'execution_settings{'", "'tasks{'", "'rescue_tasks{'", "'always_tasks{'", "'task{'", "'task_name:'", "'task_settings{'", "'handler{'", "'handler_name:'", "'listen:'", "'exe_settings{'", "'when:'", "'action:'", "'asynchronous_settings{'", "'args:'", "'module_call{'", "'notify:'", "'module_name:'", "'parameters{'", "':'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'is'", "'not'", "'skipped'", "'failed'", "'succeeded'", "'fail'", "'success'", "'defined'", "'undefined'", "'('", "')'", "'and'", "'or'", "'roles{'", "','", "'role{'", "'role_name:'", "'vars{'", "'files_names:'", "'templates_names:'", "'metadata{'", "'allow_duplicates:'", "'dependencies:'", "'galaxy_info:'", "'galaxy_info{'", "'author:'", "'description:'", "'company:'", "'issue_tracker_url:'", "'license:'", "'min_ansible_version:'", "'min_ansible_container_version:'", "'github_branch:'", "'platforms:'", "'cloud_platforms:'", "'galaxy_tags:'", "'loop:'", "'loop_control{'", "'label:'", "'pause:'", "'index_var:'", "'loop_var:'", "'extended:'", "'until:'", "'retries:'", "'delay:'", "'privilage_escalation{'", "'become:'", "'become_exe:'", "'become_flags:'", "'become_method:'", "'become_user:'", "'validation_mode{'", "'check_mode:'", "'diff:'", "'connection_info{'", "'connection:'", "'port:'", "'remote_user:'", "'strategy:'", "'serial:'", "'order:'", "'throttle:'", "'run_once:'", "'any_errors_fatal:'", "'ignore_errors:'", "'ignore_unreachable:'", "'max_fail_percentage:'", "'changed_when:'", "'failed_when:'", "'no_log:'", "'debugger:'", "'always'", "'never'", "'on_failed'", "'on_unreachable'", "'on_skipped'", "'module_defaults:'", "'environment:'", "'collections:'", "'tags:'", "'facts_setttings{'", "'gather_facts:'", "'gather_subset:'", "'gather_timeout:'", "'fact_path:'", "'delegation{'", "'delegate_to:'", "'delegate_facts:'", "'async:'", "'poll:'", "'topic:'", "'.'", "'|'", "'register:'", "'{'", "'['", "']'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__146=146;
    public static final int T__50=50;
    public static final int T__145=145;
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
    public static final int T__154=154;
    public static final int T__151=151;
    public static final int T__150=150;
    public static final int T__153=153;
    public static final int T__152=152;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__148=148;
    public static final int T__41=41;
    public static final int T__147=147;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__149=149;
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
    // InternalAnsibleDsl.g:71:1: ruleModel returns [EObject current=null] : (this_EPlaybook_0= ruleEPlaybook | this_ERole_1= ruleERole ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject this_EPlaybook_0 = null;

        EObject this_ERole_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:77:2: ( (this_EPlaybook_0= ruleEPlaybook | this_ERole_1= ruleERole ) )
            // InternalAnsibleDsl.g:78:2: (this_EPlaybook_0= ruleEPlaybook | this_ERole_1= ruleERole )
            {
            // InternalAnsibleDsl.g:78:2: (this_EPlaybook_0= ruleEPlaybook | this_ERole_1= ruleERole )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==72) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAnsibleDsl.g:79:3: this_EPlaybook_0= ruleEPlaybook
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getEPlaybookParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EPlaybook_0=ruleEPlaybook();

                    state._fsp--;


                    			current = this_EPlaybook_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:88:3: this_ERole_1= ruleERole
                    {

                    			newCompositeNode(grammarAccess.getModelAccess().getERoleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ERole_1=ruleERole();

                    state._fsp--;


                    			current = this_ERole_1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEPlaybook"
    // InternalAnsibleDsl.g:100:1: entryRuleEPlaybook returns [EObject current=null] : iv_ruleEPlaybook= ruleEPlaybook EOF ;
    public final EObject entryRuleEPlaybook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlaybook = null;


        try {
            // InternalAnsibleDsl.g:100:50: (iv_ruleEPlaybook= ruleEPlaybook EOF )
            // InternalAnsibleDsl.g:101:2: iv_ruleEPlaybook= ruleEPlaybook EOF
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
    // InternalAnsibleDsl.g:107:1: ruleEPlaybook returns [EObject current=null] : (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'plays{' (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+ otherlv_7= '}' otherlv_8= '}' ) ;
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
            // InternalAnsibleDsl.g:113:2: ( (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'plays{' (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+ otherlv_7= '}' otherlv_8= '}' ) )
            // InternalAnsibleDsl.g:114:2: (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'plays{' (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+ otherlv_7= '}' otherlv_8= '}' )
            {
            // InternalAnsibleDsl.g:114:2: (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'plays{' (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+ otherlv_7= '}' otherlv_8= '}' )
            // InternalAnsibleDsl.g:115:3: otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'plays{' (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+ otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEPlaybookAccess().getPlaybookKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEPlaybookAccess().getPlaybook_nameKeyword_1());
            		
            // InternalAnsibleDsl.g:123:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:124:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:124:4: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:125:5: lv_name_2_0= RULE_STRING
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
            		
            // InternalAnsibleDsl.g:145:3: (otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAnsibleDsl.g:146:4: otherlv_4= 'play{' ( (lv_plays_5_0= ruleEPlay ) ) otherlv_6= '}'
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEPlaybookAccess().getPlayKeyword_4_0());
            	    			
            	    // InternalAnsibleDsl.g:150:4: ( (lv_plays_5_0= ruleEPlay ) )
            	    // InternalAnsibleDsl.g:151:5: (lv_plays_5_0= ruleEPlay )
            	    {
            	    // InternalAnsibleDsl.g:151:5: (lv_plays_5_0= ruleEPlay )
            	    // InternalAnsibleDsl.g:152:6: lv_plays_5_0= ruleEPlay
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalAnsibleDsl.g:186:1: entryRuleEExecution returns [EObject current=null] : iv_ruleEExecution= ruleEExecution EOF ;
    public final EObject entryRuleEExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecution = null;


        try {
            // InternalAnsibleDsl.g:186:51: (iv_ruleEExecution= ruleEExecution EOF )
            // InternalAnsibleDsl.g:187:2: iv_ruleEExecution= ruleEExecution EOF
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
    // InternalAnsibleDsl.g:193:1: ruleEExecution returns [EObject current=null] : (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler ) ;
    public final EObject ruleEExecution() throws RecognitionException {
        EObject current = null;

        EObject this_EBlock_0 = null;

        EObject this_ETaskHandler_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:199:2: ( (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler ) )
            // InternalAnsibleDsl.g:200:2: (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler )
            {
            // InternalAnsibleDsl.g:200:2: (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==35||LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAnsibleDsl.g:201:3: this_EBlock_0= ruleEBlock
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
                    // InternalAnsibleDsl.g:210:3: this_ETaskHandler_1= ruleETaskHandler
                    {

                    			newCompositeNode(grammarAccess.getEExecutionAccess().getETaskHandlerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ETaskHandler_1=ruleETaskHandler();

                    state._fsp--;


                    			current = this_ETaskHandler_1;
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
    // InternalAnsibleDsl.g:222:1: entryRuleEBlockTask returns [EObject current=null] : iv_ruleEBlockTask= ruleEBlockTask EOF ;
    public final EObject entryRuleEBlockTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockTask = null;


        try {
            // InternalAnsibleDsl.g:222:51: (iv_ruleEBlockTask= ruleEBlockTask EOF )
            // InternalAnsibleDsl.g:223:2: iv_ruleEBlockTask= ruleEBlockTask EOF
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
    // InternalAnsibleDsl.g:229:1: ruleEBlockTask returns [EObject current=null] : (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask ) ;
    public final EObject ruleEBlockTask() throws RecognitionException {
        EObject current = null;

        EObject this_EBlock_0 = null;

        EObject this_ETask_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:235:2: ( (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask ) )
            // InternalAnsibleDsl.g:236:2: (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask )
            {
            // InternalAnsibleDsl.g:236:2: (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAnsibleDsl.g:237:3: this_EBlock_0= ruleEBlock
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
                    // InternalAnsibleDsl.g:246:3: this_ETask_1= ruleETask
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
    // InternalAnsibleDsl.g:258:1: entryRuleETaskHandler returns [EObject current=null] : iv_ruleETaskHandler= ruleETaskHandler EOF ;
    public final EObject entryRuleETaskHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandler = null;


        try {
            // InternalAnsibleDsl.g:258:53: (iv_ruleETaskHandler= ruleETaskHandler EOF )
            // InternalAnsibleDsl.g:259:2: iv_ruleETaskHandler= ruleETaskHandler EOF
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
    // InternalAnsibleDsl.g:265:1: ruleETaskHandler returns [EObject current=null] : (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler ) ;
    public final EObject ruleETaskHandler() throws RecognitionException {
        EObject current = null;

        EObject this_ETask_0 = null;

        EObject this_EHandler_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:271:2: ( (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler ) )
            // InternalAnsibleDsl.g:272:2: (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler )
            {
            // InternalAnsibleDsl.g:272:2: (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==38) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAnsibleDsl.g:273:3: this_ETask_0= ruleETask
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
                    // InternalAnsibleDsl.g:282:3: this_EHandler_1= ruleEHandler
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
    // InternalAnsibleDsl.g:294:1: entryRuleEPlay returns [EObject current=null] : iv_ruleEPlay= ruleEPlay EOF ;
    public final EObject entryRuleEPlay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlay = null;


        try {
            // InternalAnsibleDsl.g:294:46: (iv_ruleEPlay= ruleEPlay EOF )
            // InternalAnsibleDsl.g:295:2: iv_ruleEPlay= ruleEPlay EOF
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
    // InternalAnsibleDsl.g:301:1: ruleEPlay returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) ) ) ;
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

        EObject lv_roles_22_0 = null;

        EObject lv_tasks_list_24_0 = null;

        EObject lv_post_tasks_list_27_0 = null;

        EObject lv_handlers_30_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:307:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:308:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:308:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:309:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:309:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:310:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:313:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:314:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:314:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=10;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalAnsibleDsl.g:315:3: ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:315:3: ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:316:4: {...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:316:99: ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:317:5: ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:320:8: ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) )
            	    // InternalAnsibleDsl.g:320:9: {...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:320:18: ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? )
            	    // InternalAnsibleDsl.g:320:19: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )?
            	    {
            	    // InternalAnsibleDsl.g:320:19: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==18) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:321:9: otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) )
            	            {
            	            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            	            									newLeafNode(otherlv_1, grammarAccess.getEPlayAccess().getPlay_nameKeyword_0_0_0());
            	            								
            	            // InternalAnsibleDsl.g:325:9: ( (lv_name_2_0= RULE_STRING ) )
            	            // InternalAnsibleDsl.g:326:10: (lv_name_2_0= RULE_STRING )
            	            {
            	            // InternalAnsibleDsl.g:326:10: (lv_name_2_0= RULE_STRING )
            	            // InternalAnsibleDsl.g:327:11: lv_name_2_0= RULE_STRING
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
            	    							
            	    // InternalAnsibleDsl.g:348:8: ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) )
            	    // InternalAnsibleDsl.g:349:9: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            	    {
            	    // InternalAnsibleDsl.g:349:9: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            	    // InternalAnsibleDsl.g:350:10: lv_base_common_keywords_4_0= ruleEBaseCommonKeywords
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
            	    							
            	    // InternalAnsibleDsl.g:371:8: (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==20) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:372:9: otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}'
            	            {
            	            otherlv_6=(Token)match(input,20,FOLLOW_13); 

            	            									newLeafNode(otherlv_6, grammarAccess.getEPlayAccess().getPlay_exe_settingsKeyword_0_4_0());
            	            								
            	            // InternalAnsibleDsl.g:376:9: ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) )
            	            // InternalAnsibleDsl.g:377:10: (lv_play_exe_settings_7_0= ruleEPlayExeSettings )
            	            {
            	            // InternalAnsibleDsl.g:377:10: (lv_play_exe_settings_7_0= ruleEPlayExeSettings )
            	            // InternalAnsibleDsl.g:378:11: lv_play_exe_settings_7_0= ruleEPlayExeSettings
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
            	    // InternalAnsibleDsl.g:406:3: ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:406:3: ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:407:4: {...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:407:99: ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) )
            	    // InternalAnsibleDsl.g:408:5: ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:411:8: ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) )
            	    // InternalAnsibleDsl.g:411:9: {...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:411:18: (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' )
            	    // InternalAnsibleDsl.g:411:19: otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_15); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPlayAccess().getError_handlingKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:415:8: ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) )
            	    // InternalAnsibleDsl.g:416:9: (lv_error_handling_10_0= ruleEPlayErrorHandling )
            	    {
            	    // InternalAnsibleDsl.g:416:9: (lv_error_handling_10_0= ruleEPlayErrorHandling )
            	    // InternalAnsibleDsl.g:417:10: lv_error_handling_10_0= ruleEPlayErrorHandling
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
            	    // InternalAnsibleDsl.g:444:3: ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:444:3: ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) )
            	    // InternalAnsibleDsl.g:445:4: {...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:445:99: ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) )
            	    // InternalAnsibleDsl.g:446:5: ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:449:8: ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) )
            	    // InternalAnsibleDsl.g:449:9: {...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:449:18: ( (lv_facts_settings_12_0= ruleEFactsSettings ) )
            	    // InternalAnsibleDsl.g:449:19: (lv_facts_settings_12_0= ruleEFactsSettings )
            	    {
            	    // InternalAnsibleDsl.g:449:19: (lv_facts_settings_12_0= ruleEFactsSettings )
            	    // InternalAnsibleDsl.g:450:9: lv_facts_settings_12_0= ruleEFactsSettings
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
            	    // InternalAnsibleDsl.g:472:3: ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:472:3: ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:473:4: {...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:473:99: ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:474:5: ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:477:8: ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:477:9: {...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:477:18: (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:477:19: otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) )
            	    {
            	    otherlv_13=(Token)match(input,22,FOLLOW_16); 

            	    								newLeafNode(otherlv_13, grammarAccess.getEPlayAccess().getVars_filesKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:481:8: ( (lv_vars_files_14_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:482:9: (lv_vars_files_14_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:482:9: (lv_vars_files_14_0= ruleEList )
            	    // InternalAnsibleDsl.g:483:10: lv_vars_files_14_0= ruleEList
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
            	    // InternalAnsibleDsl.g:506:3: ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:506:3: ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:507:4: {...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:507:99: ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:508:5: ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:511:8: ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:511:9: {...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:511:18: (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:511:19: otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) )
            	    {
            	    otherlv_15=(Token)match(input,23,FOLLOW_16); 

            	    								newLeafNode(otherlv_15, grammarAccess.getEPlayAccess().getVars_promptKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:515:8: ( (lv_vars_prompt_16_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:516:9: (lv_vars_prompt_16_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:516:9: (lv_vars_prompt_16_0= ruleEList )
            	    // InternalAnsibleDsl.g:517:10: lv_vars_prompt_16_0= ruleEList
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
            	    // InternalAnsibleDsl.g:540:3: ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:540:3: ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:541:4: {...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:541:99: ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:542:5: ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:545:8: ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:545:9: {...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:545:18: (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:545:19: otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_17=(Token)match(input,24,FOLLOW_17); 

            	    								newLeafNode(otherlv_17, grammarAccess.getEPlayAccess().getForce_handlersKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:549:8: ( (lv_force_handlers_18_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:550:9: (lv_force_handlers_18_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:550:9: (lv_force_handlers_18_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:551:10: lv_force_handlers_18_0= RULE_BOOLEAN
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
            	    // InternalAnsibleDsl.g:573:3: ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:573:3: ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:574:4: {...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:574:99: ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) )
            	    // InternalAnsibleDsl.g:575:5: ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:578:8: ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) )
            	    // InternalAnsibleDsl.g:578:9: {...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:578:18: (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' )
            	    // InternalAnsibleDsl.g:578:19: otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}'
            	    {
            	    otherlv_19=(Token)match(input,25,FOLLOW_18); 

            	    								newLeafNode(otherlv_19, grammarAccess.getEPlayAccess().getPre_tasksKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:582:8: ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+
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
            	    	    // InternalAnsibleDsl.g:583:9: (lv_pre_tasks_list_20_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:583:9: (lv_pre_tasks_list_20_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:584:10: lv_pre_tasks_list_20_0= ruleEBlockTask
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
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
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
            	    // InternalAnsibleDsl.g:611:3: ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:611:3: ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) )
            	    // InternalAnsibleDsl.g:612:4: {...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:612:99: ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) )
            	    // InternalAnsibleDsl.g:613:5: ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:616:8: ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) )
            	    // InternalAnsibleDsl.g:616:9: {...}? => ( (lv_roles_22_0= ruleERoleCalls ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:616:18: ( (lv_roles_22_0= ruleERoleCalls ) )
            	    // InternalAnsibleDsl.g:616:19: (lv_roles_22_0= ruleERoleCalls )
            	    {
            	    // InternalAnsibleDsl.g:616:19: (lv_roles_22_0= ruleERoleCalls )
            	    // InternalAnsibleDsl.g:617:9: lv_roles_22_0= ruleERoleCalls
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getRolesERoleCallsParserRuleCall_7_0());
            	    								
            	    pushFollow(FOLLOW_14);
            	    lv_roles_22_0=ruleERoleCalls();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    									}
            	    									set(
            	    										current,
            	    										"roles",
            	    										lv_roles_22_0,
            	    										"org.sodalite.sdl.ansible.AnsibleDsl.ERoleCalls");
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
            	    // InternalAnsibleDsl.g:639:3: ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:639:3: ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:640:4: {...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAnsibleDsl.g:640:99: ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:641:5: ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAnsibleDsl.g:644:8: ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) )
            	    // InternalAnsibleDsl.g:644:9: {...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:644:18: (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? )
            	    // InternalAnsibleDsl.g:644:19: otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )?
            	    {
            	    otherlv_23=(Token)match(input,26,FOLLOW_18); 

            	    								newLeafNode(otherlv_23, grammarAccess.getEPlayAccess().getTasks_listKeyword_8_0());
            	    							
            	    // InternalAnsibleDsl.g:648:8: ( (lv_tasks_list_24_0= ruleEBlockTask ) )+
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
            	    	    // InternalAnsibleDsl.g:649:9: (lv_tasks_list_24_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:649:9: (lv_tasks_list_24_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:650:10: lv_tasks_list_24_0= ruleEBlockTask
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
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);

            	    otherlv_25=(Token)match(input,17,FOLLOW_20); 

            	    								newLeafNode(otherlv_25, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_2());
            	    							
            	    // InternalAnsibleDsl.g:671:8: (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==27) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:672:9: otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}'
            	            {
            	            otherlv_26=(Token)match(input,27,FOLLOW_18); 

            	            									newLeafNode(otherlv_26, grammarAccess.getEPlayAccess().getPost_tasksKeyword_8_3_0());
            	            								
            	            // InternalAnsibleDsl.g:676:9: ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+
            	            int cnt10=0;
            	            loop10:
            	            do {
            	                int alt10=2;
            	                int LA10_0 = input.LA(1);

            	                if ( (LA10_0==29||LA10_0==35) ) {
            	                    alt10=1;
            	                }


            	                switch (alt10) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:677:10: (lv_post_tasks_list_27_0= ruleEBlockTask )
            	            	    {
            	            	    // InternalAnsibleDsl.g:677:10: (lv_post_tasks_list_27_0= ruleEBlockTask )
            	            	    // InternalAnsibleDsl.g:678:11: lv_post_tasks_list_27_0= ruleEBlockTask
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
            	            	    if ( cnt10 >= 1 ) break loop10;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(10, input);
            	                        throw eee;
            	                }
            	                cnt10++;
            	            } while (true);

            	            otherlv_28=(Token)match(input,17,FOLLOW_21); 

            	            									newLeafNode(otherlv_28, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_3_2());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:700:8: (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==28) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:701:9: otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}'
            	            {
            	            otherlv_29=(Token)match(input,28,FOLLOW_22); 

            	            									newLeafNode(otherlv_29, grammarAccess.getEPlayAccess().getHandlersKeyword_8_4_0());
            	            								
            	            // InternalAnsibleDsl.g:705:9: ( (lv_handlers_30_0= ruleEHandler ) )+
            	            int cnt12=0;
            	            loop12:
            	            do {
            	                int alt12=2;
            	                int LA12_0 = input.LA(1);

            	                if ( (LA12_0==38) ) {
            	                    alt12=1;
            	                }


            	                switch (alt12) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:706:10: (lv_handlers_30_0= ruleEHandler )
            	            	    {
            	            	    // InternalAnsibleDsl.g:706:10: (lv_handlers_30_0= ruleEHandler )
            	            	    // InternalAnsibleDsl.g:707:11: lv_handlers_30_0= ruleEHandler
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
            	            	    if ( cnt12 >= 1 ) break loop12;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(12, input);
            	                        throw eee;
            	                }
            	                cnt12++;
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // InternalAnsibleDsl.g:746:1: entryRuleEBlock returns [EObject current=null] : iv_ruleEBlock= ruleEBlock EOF ;
    public final EObject entryRuleEBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlock = null;


        try {
            // InternalAnsibleDsl.g:746:47: (iv_ruleEBlock= ruleEBlock EOF )
            // InternalAnsibleDsl.g:747:2: iv_ruleEBlock= ruleEBlock EOF
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
    // InternalAnsibleDsl.g:753:1: ruleEBlock returns [EObject current=null] : (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' ) ;
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
            // InternalAnsibleDsl.g:759:2: ( (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalAnsibleDsl.g:760:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalAnsibleDsl.g:760:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' )
            // InternalAnsibleDsl.g:761:3: otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getEBlockAccess().getBlockKeyword_0());
            		
            // InternalAnsibleDsl.g:765:3: (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAnsibleDsl.g:766:4: otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,30,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEBlockAccess().getBlock_nameKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:770:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:771:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:771:5: (lv_name_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:772:6: lv_name_2_0= RULE_STRING
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
            		
            // InternalAnsibleDsl.g:793:3: ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) )
            // InternalAnsibleDsl.g:794:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            {
            // InternalAnsibleDsl.g:794:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            // InternalAnsibleDsl.g:795:5: lv_base_common_keywords_4_0= ruleEBaseCommonKeywords
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
            		
            // InternalAnsibleDsl.g:820:3: ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) )
            // InternalAnsibleDsl.g:821:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            {
            // InternalAnsibleDsl.g:821:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            // InternalAnsibleDsl.g:822:5: lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords
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
            		
            // InternalAnsibleDsl.g:843:3: (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAnsibleDsl.g:844:4: otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getEBlockAccess().getError_handlingKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:848:4: ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) )
                    // InternalAnsibleDsl.g:849:5: (lv_error_handling_10_0= ruleEBlockErrorHandling )
                    {
                    // InternalAnsibleDsl.g:849:5: (lv_error_handling_10_0= ruleEBlockErrorHandling )
                    // InternalAnsibleDsl.g:850:6: lv_error_handling_10_0= ruleEBlockErrorHandling
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
            		
            // InternalAnsibleDsl.g:876:3: ( (lv_tasks_13_0= ruleETask ) )+
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
            	    // InternalAnsibleDsl.g:877:4: (lv_tasks_13_0= ruleETask )
            	    {
            	    // InternalAnsibleDsl.g:877:4: (lv_tasks_13_0= ruleETask )
            	    // InternalAnsibleDsl.g:878:5: lv_tasks_13_0= ruleETask
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_14=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalAnsibleDsl.g:899:3: (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAnsibleDsl.g:900:4: otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,33,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getEBlockAccess().getRescue_tasksKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:904:4: ( (lv_rescue_tasks_16_0= ruleETask ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==35) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:905:5: (lv_rescue_tasks_16_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:905:5: (lv_rescue_tasks_16_0= ruleETask )
                    	    // InternalAnsibleDsl.g:906:6: lv_rescue_tasks_16_0= ruleETask
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
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    otherlv_17=(Token)match(input,17,FOLLOW_31); 

                    				newLeafNode(otherlv_17, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:928:3: (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAnsibleDsl.g:929:4: otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}'
                    {
                    otherlv_18=(Token)match(input,34,FOLLOW_18); 

                    				newLeafNode(otherlv_18, grammarAccess.getEBlockAccess().getAlways_tasksKeyword_13_0());
                    			
                    // InternalAnsibleDsl.g:933:4: ( (lv_always_tasks_19_0= ruleETask ) )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==35) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:934:5: (lv_always_tasks_19_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:934:5: (lv_always_tasks_19_0= ruleETask )
                    	    // InternalAnsibleDsl.g:935:6: lv_always_tasks_19_0= ruleETask
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
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
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
    // InternalAnsibleDsl.g:965:1: entryRuleETask returns [EObject current=null] : iv_ruleETask= ruleETask EOF ;
    public final EObject entryRuleETask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETask = null;


        try {
            // InternalAnsibleDsl.g:965:46: (iv_ruleETask= ruleETask EOF )
            // InternalAnsibleDsl.g:966:2: iv_ruleETask= ruleETask EOF
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
    // InternalAnsibleDsl.g:972:1: ruleETask returns [EObject current=null] : (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:978:2: ( (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:979:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:979:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' otherlv_12= '}' )
            // InternalAnsibleDsl.g:980:3: otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getETaskAccess().getTaskKeyword_0());
            		
            // InternalAnsibleDsl.g:984:3: (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAnsibleDsl.g:985:4: otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getETaskAccess().getTask_nameKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:989:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:990:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:990:5: (lv_name_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:991:6: lv_name_2_0= RULE_STRING
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
            		
            // InternalAnsibleDsl.g:1012:3: ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) )
            // InternalAnsibleDsl.g:1013:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            {
            // InternalAnsibleDsl.g:1013:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            // InternalAnsibleDsl.g:1014:5: lv_base_common_keywords_4_0= ruleEBaseCommonKeywords
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
            		
            // InternalAnsibleDsl.g:1039:3: ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) )
            // InternalAnsibleDsl.g:1040:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            {
            // InternalAnsibleDsl.g:1040:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            // InternalAnsibleDsl.g:1041:5: lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords
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
            		
            // InternalAnsibleDsl.g:1066:3: ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) )
            // InternalAnsibleDsl.g:1067:4: (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords )
            {
            // InternalAnsibleDsl.g:1067:4: (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords )
            // InternalAnsibleDsl.g:1068:5: lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords
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
    // InternalAnsibleDsl.g:1097:1: entryRuleEHandler returns [EObject current=null] : iv_ruleEHandler= ruleEHandler EOF ;
    public final EObject entryRuleEHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHandler = null;


        try {
            // InternalAnsibleDsl.g:1097:49: (iv_ruleEHandler= ruleEHandler EOF )
            // InternalAnsibleDsl.g:1098:2: iv_ruleEHandler= ruleEHandler EOF
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
    // InternalAnsibleDsl.g:1104:1: ruleEHandler returns [EObject current=null] : (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )? otherlv_14= '}' ) ;
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
            // InternalAnsibleDsl.g:1110:2: ( (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )? otherlv_14= '}' ) )
            // InternalAnsibleDsl.g:1111:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )? otherlv_14= '}' )
            {
            // InternalAnsibleDsl.g:1111:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )? otherlv_14= '}' )
            // InternalAnsibleDsl.g:1112:3: otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' otherlv_6= 'execution_settings{' ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) ) otherlv_8= '}' otherlv_9= 'task_settings{' ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) ) otherlv_11= '}' (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getEHandlerAccess().getHandlerKeyword_0());
            		
            // InternalAnsibleDsl.g:1116:3: (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAnsibleDsl.g:1117:4: otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEHandlerAccess().getHandler_nameKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:1121:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:1122:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:1122:5: (lv_name_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:1123:6: lv_name_2_0= RULE_STRING
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
            		
            // InternalAnsibleDsl.g:1144:3: ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) )
            // InternalAnsibleDsl.g:1145:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            {
            // InternalAnsibleDsl.g:1145:4: (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords )
            // InternalAnsibleDsl.g:1146:5: lv_base_common_keywords_4_0= ruleEBaseCommonKeywords
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
            		
            // InternalAnsibleDsl.g:1171:3: ( (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords ) )
            // InternalAnsibleDsl.g:1172:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            {
            // InternalAnsibleDsl.g:1172:4: (lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords )
            // InternalAnsibleDsl.g:1173:5: lv_exe_common_keywords_7_0= ruleEExecutionCommonKeywords
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
            		
            // InternalAnsibleDsl.g:1198:3: ( (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords ) )
            // InternalAnsibleDsl.g:1199:4: (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords )
            {
            // InternalAnsibleDsl.g:1199:4: (lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords )
            // InternalAnsibleDsl.g:1200:5: lv_task_handler_common_keywords_10_0= ruleETaskHandlerCommonKeywords
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
            		
            // InternalAnsibleDsl.g:1221:3: (otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+ )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAnsibleDsl.g:1222:4: otherlv_12= 'listen:' ( (otherlv_13= RULE_STRING ) )+
                    {
                    otherlv_12=(Token)match(input,40,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getEHandlerAccess().getListenKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:1226:4: ( (otherlv_13= RULE_STRING ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_STRING) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1227:5: (otherlv_13= RULE_STRING )
                    	    {
                    	    // InternalAnsibleDsl.g:1227:5: (otherlv_13= RULE_STRING )
                    	    // InternalAnsibleDsl.g:1228:6: otherlv_13= RULE_STRING
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
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
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
    // InternalAnsibleDsl.g:1248:1: entryRuleEExecutionCommonKeywords returns [EObject current=null] : iv_ruleEExecutionCommonKeywords= ruleEExecutionCommonKeywords EOF ;
    public final EObject entryRuleEExecutionCommonKeywords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionCommonKeywords = null;


        try {
            // InternalAnsibleDsl.g:1248:65: (iv_ruleEExecutionCommonKeywords= ruleEExecutionCommonKeywords EOF )
            // InternalAnsibleDsl.g:1249:2: iv_ruleEExecutionCommonKeywords= ruleEExecutionCommonKeywords EOF
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
    // InternalAnsibleDsl.g:1255:1: ruleEExecutionCommonKeywords returns [EObject current=null] : ( () (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )? ( (lv_delegation_4_0= ruleEDelegation ) )? (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )? ) ;
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
            // InternalAnsibleDsl.g:1261:2: ( ( () (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )? ( (lv_delegation_4_0= ruleEDelegation ) )? (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )? ) )
            // InternalAnsibleDsl.g:1262:2: ( () (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )? ( (lv_delegation_4_0= ruleEDelegation ) )? (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:1262:2: ( () (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )? ( (lv_delegation_4_0= ruleEDelegation ) )? (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )? )
            // InternalAnsibleDsl.g:1263:3: () (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )? ( (lv_delegation_4_0= ruleEDelegation ) )? (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )?
            {
            // InternalAnsibleDsl.g:1263:3: ()
            // InternalAnsibleDsl.g:1264:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEExecutionCommonKeywordsAccess().getEExecutionCommonKeywordsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:1270:3: (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAnsibleDsl.g:1271:4: otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getEExecutionCommonKeywordsAccess().getExe_settingsKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:1275:4: ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:1276:5: (lv_exe_settings_2_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:1276:5: (lv_exe_settings_2_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:1277:6: lv_exe_settings_2_0= ruleEExecutionExeSettings
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

            // InternalAnsibleDsl.g:1299:3: ( (lv_delegation_4_0= ruleEDelegation ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==143) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAnsibleDsl.g:1300:4: (lv_delegation_4_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:1300:4: (lv_delegation_4_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:1301:5: lv_delegation_4_0= ruleEDelegation
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

            // InternalAnsibleDsl.g:1318:3: (otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAnsibleDsl.g:1319:4: otherlv_5= 'when:' ( (lv_when_expression_6_0= ruleEConditionalExpression ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getEExecutionCommonKeywordsAccess().getWhenKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:1323:4: ( (lv_when_expression_6_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:1324:5: (lv_when_expression_6_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:1324:5: (lv_when_expression_6_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:1325:6: lv_when_expression_6_0= ruleEConditionalExpression
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
    // InternalAnsibleDsl.g:1347:1: entryRuleETaskHandlerCommonKeywords returns [EObject current=null] : iv_ruleETaskHandlerCommonKeywords= ruleETaskHandlerCommonKeywords EOF ;
    public final EObject entryRuleETaskHandlerCommonKeywords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerCommonKeywords = null;


        try {
            // InternalAnsibleDsl.g:1347:67: (iv_ruleETaskHandlerCommonKeywords= ruleETaskHandlerCommonKeywords EOF )
            // InternalAnsibleDsl.g:1348:2: iv_ruleETaskHandlerCommonKeywords= ruleETaskHandlerCommonKeywords EOF
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
    // InternalAnsibleDsl.g:1354:1: ruleETaskHandlerCommonKeywords returns [EObject current=null] : ( () (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )? (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )? (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )? (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )? otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )? ( (lv_loop_16_0= ruleELoop ) )? ( (lv_register_17_0= ruleERegisterVariable ) )? ) ;
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
            // InternalAnsibleDsl.g:1360:2: ( ( () (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )? (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )? (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )? (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )? otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )? ( (lv_loop_16_0= ruleELoop ) )? ( (lv_register_17_0= ruleERegisterVariable ) )? ) )
            // InternalAnsibleDsl.g:1361:2: ( () (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )? (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )? (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )? (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )? otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )? ( (lv_loop_16_0= ruleELoop ) )? ( (lv_register_17_0= ruleERegisterVariable ) )? )
            {
            // InternalAnsibleDsl.g:1361:2: ( () (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )? (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )? (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )? (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )? otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )? ( (lv_loop_16_0= ruleELoop ) )? ( (lv_register_17_0= ruleERegisterVariable ) )? )
            // InternalAnsibleDsl.g:1362:3: () (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )? (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )? (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )? (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )? otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )? ( (lv_loop_16_0= ruleELoop ) )? ( (lv_register_17_0= ruleERegisterVariable ) )?
            {
            // InternalAnsibleDsl.g:1362:3: ()
            // InternalAnsibleDsl.g:1363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETaskHandlerCommonKeywordsAccess().getETaskHandlerCommonKeywordsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:1369:3: (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAnsibleDsl.g:1370:4: otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getETaskHandlerCommonKeywordsAccess().getError_handlingKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:1374:4: ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) )
                    // InternalAnsibleDsl.g:1375:5: (lv_error_handling_2_0= ruleETaskHandlerErrorHandling )
                    {
                    // InternalAnsibleDsl.g:1375:5: (lv_error_handling_2_0= ruleETaskHandlerErrorHandling )
                    // InternalAnsibleDsl.g:1376:6: lv_error_handling_2_0= ruleETaskHandlerErrorHandling
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

            // InternalAnsibleDsl.g:1398:3: (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==43) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnsibleDsl.g:1399:4: otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getETaskHandlerCommonKeywordsAccess().getActionKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:1403:4: ( (lv_action_5_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:1404:5: (lv_action_5_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:1404:5: (lv_action_5_0= RULE_STRING )
                    // InternalAnsibleDsl.g:1405:6: lv_action_5_0= RULE_STRING
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

            // InternalAnsibleDsl.g:1422:3: (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnsibleDsl.g:1423:4: otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_45); 

                    				newLeafNode(otherlv_6, grammarAccess.getETaskHandlerCommonKeywordsAccess().getAsynchronous_settingsKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:1427:4: ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) )
                    // InternalAnsibleDsl.g:1428:5: (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings )
                    {
                    // InternalAnsibleDsl.g:1428:5: (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings )
                    // InternalAnsibleDsl.g:1429:6: lv_asynchronous_settings_7_0= ruleEAsynchronousSettings
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

            // InternalAnsibleDsl.g:1451:3: (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnsibleDsl.g:1452:4: otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) )
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_47); 

                    				newLeafNode(otherlv_9, grammarAccess.getETaskHandlerCommonKeywordsAccess().getArgsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:1456:4: ( (lv_args_10_0= ruleEDictionary ) )
                    // InternalAnsibleDsl.g:1457:5: (lv_args_10_0= ruleEDictionary )
                    {
                    // InternalAnsibleDsl.g:1457:5: (lv_args_10_0= ruleEDictionary )
                    // InternalAnsibleDsl.g:1458:6: lv_args_10_0= ruleEDictionary
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
            		
            // InternalAnsibleDsl.g:1480:3: ( (lv_module_12_0= ruleEModuleCall ) )
            // InternalAnsibleDsl.g:1481:4: (lv_module_12_0= ruleEModuleCall )
            {
            // InternalAnsibleDsl.g:1481:4: (lv_module_12_0= ruleEModuleCall )
            // InternalAnsibleDsl.g:1482:5: lv_module_12_0= ruleEModuleCall
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
            		
            // InternalAnsibleDsl.g:1503:3: (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAnsibleDsl.g:1504:4: otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+
                    {
                    otherlv_14=(Token)match(input,47,FOLLOW_51); 

                    				newLeafNode(otherlv_14, grammarAccess.getETaskHandlerCommonKeywordsAccess().getNotifyKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:1508:4: ( (lv_notifiables_15_0= ruleENotifiable ) )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==RULE_STRING||LA33_0==148) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1509:5: (lv_notifiables_15_0= ruleENotifiable )
                    	    {
                    	    // InternalAnsibleDsl.g:1509:5: (lv_notifiables_15_0= ruleENotifiable )
                    	    // InternalAnsibleDsl.g:1510:6: lv_notifiables_15_0= ruleENotifiable
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
                    	    if ( cnt33 >= 1 ) break loop33;
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1528:3: ( (lv_loop_16_0= ruleELoop ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==93||(LA35_0>=100 && LA35_0<=102)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAnsibleDsl.g:1529:4: (lv_loop_16_0= ruleELoop )
                    {
                    // InternalAnsibleDsl.g:1529:4: (lv_loop_16_0= ruleELoop )
                    // InternalAnsibleDsl.g:1530:5: lv_loop_16_0= ruleELoop
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

            // InternalAnsibleDsl.g:1547:3: ( (lv_register_17_0= ruleERegisterVariable ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==151) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAnsibleDsl.g:1548:4: (lv_register_17_0= ruleERegisterVariable )
                    {
                    // InternalAnsibleDsl.g:1548:4: (lv_register_17_0= ruleERegisterVariable )
                    // InternalAnsibleDsl.g:1549:5: lv_register_17_0= ruleERegisterVariable
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
    // InternalAnsibleDsl.g:1570:1: entryRuleEModuleCall returns [EObject current=null] : iv_ruleEModuleCall= ruleEModuleCall EOF ;
    public final EObject entryRuleEModuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModuleCall = null;


        try {
            // InternalAnsibleDsl.g:1570:52: (iv_ruleEModuleCall= ruleEModuleCall EOF )
            // InternalAnsibleDsl.g:1571:2: iv_ruleEModuleCall= ruleEModuleCall EOF
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
    // InternalAnsibleDsl.g:1577:1: ruleEModuleCall returns [EObject current=null] : (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) ;
    public final EObject ruleEModuleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1583:2: ( (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:1584:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:1584:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:1585:3: otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getEModuleCallAccess().getModule_nameKeyword_0());
            		
            // InternalAnsibleDsl.g:1589:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:1590:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:1590:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:1591:5: lv_name_1_0= RULE_ID
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
            		
            // InternalAnsibleDsl.g:1611:3: ( (lv_parameters_3_0= ruleEParameter ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAnsibleDsl.g:1612:4: (lv_parameters_3_0= ruleEParameter )
            	    {
            	    // InternalAnsibleDsl.g:1612:4: (lv_parameters_3_0= ruleEParameter )
            	    // InternalAnsibleDsl.g:1613:5: lv_parameters_3_0= ruleEParameter
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
            	    break loop37;
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
    // InternalAnsibleDsl.g:1638:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalAnsibleDsl.g:1638:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalAnsibleDsl.g:1639:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalAnsibleDsl.g:1645:1: ruleEParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1651:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) )
            // InternalAnsibleDsl.g:1652:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            {
            // InternalAnsibleDsl.g:1652:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            // InternalAnsibleDsl.g:1653:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) )
            {
            // InternalAnsibleDsl.g:1653:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:1654:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:1654:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:1655:5: lv_name_0_0= RULE_ID
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
            		
            // InternalAnsibleDsl.g:1675:3: ( (lv_value_passed_2_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:1676:4: (lv_value_passed_2_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:1676:4: (lv_value_passed_2_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:1677:5: lv_value_passed_2_0= ruleEValuePassed
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
    // InternalAnsibleDsl.g:1698:1: entryRuleEConditionalExpression returns [EObject current=null] : iv_ruleEConditionalExpression= ruleEConditionalExpression EOF ;
    public final EObject entryRuleEConditionalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionalExpression = null;


        try {
            // InternalAnsibleDsl.g:1698:63: (iv_ruleEConditionalExpression= ruleEConditionalExpression EOF )
            // InternalAnsibleDsl.g:1699:2: iv_ruleEConditionalExpression= ruleEConditionalExpression EOF
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
    // InternalAnsibleDsl.g:1705:1: ruleEConditionalExpression returns [EObject current=null] : ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) ) ;
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
            // InternalAnsibleDsl.g:1711:2: ( ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) ) )
            // InternalAnsibleDsl.g:1712:2: ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) )
            {
            // InternalAnsibleDsl.g:1712:2: ( ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) ) | ( (lv_formula_6_0= ruleEConditionalFormula ) ) | ( (lv_is_true_7_0= RULE_BOOLEAN ) ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_NULL:
            case 152:
            case 153:
                {
                alt42=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA42_2 = input.LA(2);

                if ( ((LA42_2>=51 && LA42_2<=57)) ) {
                    alt42=1;
                }
                else if ( (LA42_2==EOF||LA42_2==17||LA42_2==67||(LA42_2>=100 && LA42_2<=102)||(LA42_2>=121 && LA42_2<=123)||LA42_2==126||LA42_2==151) ) {
                    alt42=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;
                }
                }
                break;
            case 58:
            case 66:
                {
                alt42=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalAnsibleDsl.g:1713:3: ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) )
                    {
                    // InternalAnsibleDsl.g:1713:3: ( ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) ) )
                    // InternalAnsibleDsl.g:1714:4: ( (lv_left_term_0_0= ruleEValuePassed ) ) ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) )
                    {
                    // InternalAnsibleDsl.g:1714:4: ( (lv_left_term_0_0= ruleEValuePassed ) )
                    // InternalAnsibleDsl.g:1715:5: (lv_left_term_0_0= ruleEValuePassed )
                    {
                    // InternalAnsibleDsl.g:1715:5: (lv_left_term_0_0= ruleEValuePassed )
                    // InternalAnsibleDsl.g:1716:6: lv_left_term_0_0= ruleEValuePassed
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

                    // InternalAnsibleDsl.g:1733:4: ( ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) ) | (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) ) )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=51 && LA41_0<=56)) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==57) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalAnsibleDsl.g:1734:5: ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) )
                            {
                            // InternalAnsibleDsl.g:1734:5: ( ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) ) )
                            // InternalAnsibleDsl.g:1735:6: ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) ) ( (lv_right_term_2_0= ruleEValuePassed ) )
                            {
                            // InternalAnsibleDsl.g:1735:6: ( ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) ) )
                            // InternalAnsibleDsl.g:1736:7: ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) )
                            {
                            // InternalAnsibleDsl.g:1736:7: ( (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' ) )
                            // InternalAnsibleDsl.g:1737:8: (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' )
                            {
                            // InternalAnsibleDsl.g:1737:8: (lv_equality_term_1_1= '==' | lv_equality_term_1_2= '!=' | lv_equality_term_1_3= '<' | lv_equality_term_1_4= '>' | lv_equality_term_1_5= '<=' | lv_equality_term_1_6= '>=' )
                            int alt38=6;
                            switch ( input.LA(1) ) {
                            case 51:
                                {
                                alt38=1;
                                }
                                break;
                            case 52:
                                {
                                alt38=2;
                                }
                                break;
                            case 53:
                                {
                                alt38=3;
                                }
                                break;
                            case 54:
                                {
                                alt38=4;
                                }
                                break;
                            case 55:
                                {
                                alt38=5;
                                }
                                break;
                            case 56:
                                {
                                alt38=6;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 38, 0, input);

                                throw nvae;
                            }

                            switch (alt38) {
                                case 1 :
                                    // InternalAnsibleDsl.g:1738:9: lv_equality_term_1_1= '=='
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
                                    // InternalAnsibleDsl.g:1749:9: lv_equality_term_1_2= '!='
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
                                    // InternalAnsibleDsl.g:1760:9: lv_equality_term_1_3= '<'
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
                                    // InternalAnsibleDsl.g:1771:9: lv_equality_term_1_4= '>'
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
                                    // InternalAnsibleDsl.g:1782:9: lv_equality_term_1_5= '<='
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
                                    // InternalAnsibleDsl.g:1793:9: lv_equality_term_1_6= '>='
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

                            // InternalAnsibleDsl.g:1806:6: ( (lv_right_term_2_0= ruleEValuePassed ) )
                            // InternalAnsibleDsl.g:1807:7: (lv_right_term_2_0= ruleEValuePassed )
                            {
                            // InternalAnsibleDsl.g:1807:7: (lv_right_term_2_0= ruleEValuePassed )
                            // InternalAnsibleDsl.g:1808:8: lv_right_term_2_0= ruleEValuePassed
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
                            // InternalAnsibleDsl.g:1827:5: (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) )
                            {
                            // InternalAnsibleDsl.g:1827:5: (otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) ) )
                            // InternalAnsibleDsl.g:1828:6: otherlv_3= 'is' ( (lv_is_not_4_0= 'not' ) )? ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) )
                            {
                            otherlv_3=(Token)match(input,57,FOLLOW_60); 

                            						newLeafNode(otherlv_3, grammarAccess.getEConditionalExpressionAccess().getIsKeyword_0_1_1_0());
                            					
                            // InternalAnsibleDsl.g:1832:6: ( (lv_is_not_4_0= 'not' ) )?
                            int alt39=2;
                            int LA39_0 = input.LA(1);

                            if ( (LA39_0==58) ) {
                                alt39=1;
                            }
                            switch (alt39) {
                                case 1 :
                                    // InternalAnsibleDsl.g:1833:7: (lv_is_not_4_0= 'not' )
                                    {
                                    // InternalAnsibleDsl.g:1833:7: (lv_is_not_4_0= 'not' )
                                    // InternalAnsibleDsl.g:1834:8: lv_is_not_4_0= 'not'
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

                            // InternalAnsibleDsl.g:1846:6: ( ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) ) )
                            // InternalAnsibleDsl.g:1847:7: ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) )
                            {
                            // InternalAnsibleDsl.g:1847:7: ( (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' ) )
                            // InternalAnsibleDsl.g:1848:8: (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' )
                            {
                            // InternalAnsibleDsl.g:1848:8: (lv_status_5_1= 'skipped' | lv_status_5_2= 'failed' | lv_status_5_3= 'succeeded' | lv_status_5_4= 'fail' | lv_status_5_5= 'success' | lv_status_5_6= 'defined' | lv_status_5_7= 'undefined' )
                            int alt40=7;
                            switch ( input.LA(1) ) {
                            case 59:
                                {
                                alt40=1;
                                }
                                break;
                            case 60:
                                {
                                alt40=2;
                                }
                                break;
                            case 61:
                                {
                                alt40=3;
                                }
                                break;
                            case 62:
                                {
                                alt40=4;
                                }
                                break;
                            case 63:
                                {
                                alt40=5;
                                }
                                break;
                            case 64:
                                {
                                alt40=6;
                                }
                                break;
                            case 65:
                                {
                                alt40=7;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 40, 0, input);

                                throw nvae;
                            }

                            switch (alt40) {
                                case 1 :
                                    // InternalAnsibleDsl.g:1849:9: lv_status_5_1= 'skipped'
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
                                    // InternalAnsibleDsl.g:1860:9: lv_status_5_2= 'failed'
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
                                    // InternalAnsibleDsl.g:1871:9: lv_status_5_3= 'succeeded'
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
                                    // InternalAnsibleDsl.g:1882:9: lv_status_5_4= 'fail'
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
                                    // InternalAnsibleDsl.g:1893:9: lv_status_5_5= 'success'
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
                                    // InternalAnsibleDsl.g:1904:9: lv_status_5_6= 'defined'
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
                                    // InternalAnsibleDsl.g:1915:9: lv_status_5_7= 'undefined'
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
                    // InternalAnsibleDsl.g:1932:3: ( (lv_formula_6_0= ruleEConditionalFormula ) )
                    {
                    // InternalAnsibleDsl.g:1932:3: ( (lv_formula_6_0= ruleEConditionalFormula ) )
                    // InternalAnsibleDsl.g:1933:4: (lv_formula_6_0= ruleEConditionalFormula )
                    {
                    // InternalAnsibleDsl.g:1933:4: (lv_formula_6_0= ruleEConditionalFormula )
                    // InternalAnsibleDsl.g:1934:5: lv_formula_6_0= ruleEConditionalFormula
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
                    // InternalAnsibleDsl.g:1952:3: ( (lv_is_true_7_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:1952:3: ( (lv_is_true_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:1953:4: (lv_is_true_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:1953:4: (lv_is_true_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:1954:5: lv_is_true_7_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:1974:1: entryRuleEConditionalFormula returns [EObject current=null] : iv_ruleEConditionalFormula= ruleEConditionalFormula EOF ;
    public final EObject entryRuleEConditionalFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConditionalFormula = null;


        try {
            // InternalAnsibleDsl.g:1974:60: (iv_ruleEConditionalFormula= ruleEConditionalFormula EOF )
            // InternalAnsibleDsl.g:1975:2: iv_ruleEConditionalFormula= ruleEConditionalFormula EOF
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
    // InternalAnsibleDsl.g:1981:1: ruleEConditionalFormula returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) ) ;
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
            // InternalAnsibleDsl.g:1987:2: ( ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) ) )
            // InternalAnsibleDsl.g:1988:2: ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) )
            {
            // InternalAnsibleDsl.g:1988:2: ( (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' ) | (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==66) ) {
                alt44=1;
            }
            else if ( (LA44_0==58) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalAnsibleDsl.g:1989:3: (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' )
                    {
                    // InternalAnsibleDsl.g:1989:3: (otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')' )
                    // InternalAnsibleDsl.g:1990:4: otherlv_0= '(' ( (lv_left_expression_1_0= ruleEConditionalExpression ) ) otherlv_2= ')' ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) ) otherlv_4= '(' ( (lv_right_expression_5_0= ruleEConditionalExpression ) ) otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,66,FOLLOW_41); 

                    				newLeafNode(otherlv_0, grammarAccess.getEConditionalFormulaAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalAnsibleDsl.g:1994:4: ( (lv_left_expression_1_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:1995:5: (lv_left_expression_1_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:1995:5: (lv_left_expression_1_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:1996:6: lv_left_expression_1_0= ruleEConditionalExpression
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
                    			
                    // InternalAnsibleDsl.g:2017:4: ( ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) ) )
                    // InternalAnsibleDsl.g:2018:5: ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) )
                    {
                    // InternalAnsibleDsl.g:2018:5: ( (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' ) )
                    // InternalAnsibleDsl.g:2019:6: (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' )
                    {
                    // InternalAnsibleDsl.g:2019:6: (lv_and_or_3_1= 'and' | lv_and_or_3_2= 'or' )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==68) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==69) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalAnsibleDsl.g:2020:7: lv_and_or_3_1= 'and'
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
                            // InternalAnsibleDsl.g:2031:7: lv_and_or_3_2= 'or'
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
                    			
                    // InternalAnsibleDsl.g:2048:4: ( (lv_right_expression_5_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:2049:5: (lv_right_expression_5_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:2049:5: (lv_right_expression_5_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:2050:6: lv_right_expression_5_0= ruleEConditionalExpression
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
                    // InternalAnsibleDsl.g:2073:3: (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' )
                    {
                    // InternalAnsibleDsl.g:2073:3: (otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')' )
                    // InternalAnsibleDsl.g:2074:4: otherlv_7= 'not' otherlv_8= '(' ( (lv_negated_expression_9_0= ruleEConditionalExpression ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,58,FOLLOW_64); 

                    				newLeafNode(otherlv_7, grammarAccess.getEConditionalFormulaAccess().getNotKeyword_1_0());
                    			
                    otherlv_8=(Token)match(input,66,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getEConditionalFormulaAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalAnsibleDsl.g:2082:4: ( (lv_negated_expression_9_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:2083:5: (lv_negated_expression_9_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:2083:5: (lv_negated_expression_9_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:2084:6: lv_negated_expression_9_0= ruleEConditionalExpression
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


    // $ANTLR start "entryRuleERoleCalls"
    // InternalAnsibleDsl.g:2110:1: entryRuleERoleCalls returns [EObject current=null] : iv_ruleERoleCalls= ruleERoleCalls EOF ;
    public final EObject entryRuleERoleCalls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleCalls = null;


        try {
            // InternalAnsibleDsl.g:2110:51: (iv_ruleERoleCalls= ruleERoleCalls EOF )
            // InternalAnsibleDsl.g:2111:2: iv_ruleERoleCalls= ruleERoleCalls EOF
            {
             newCompositeNode(grammarAccess.getERoleCallsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERoleCalls=ruleERoleCalls();

            state._fsp--;

             current =iv_ruleERoleCalls; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERoleCalls"


    // $ANTLR start "ruleERoleCalls"
    // InternalAnsibleDsl.g:2117:1: ruleERoleCalls returns [EObject current=null] : (otherlv_0= 'roles{' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= ',' ( (otherlv_3= RULE_STRING ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleERoleCalls() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:2123:2: ( (otherlv_0= 'roles{' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= ',' ( (otherlv_3= RULE_STRING ) ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:2124:2: (otherlv_0= 'roles{' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= ',' ( (otherlv_3= RULE_STRING ) ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:2124:2: (otherlv_0= 'roles{' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= ',' ( (otherlv_3= RULE_STRING ) ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:2125:3: otherlv_0= 'roles{' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= ',' ( (otherlv_3= RULE_STRING ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleCallsAccess().getRolesKeyword_0());
            		
            // InternalAnsibleDsl.g:2129:3: ( (otherlv_1= RULE_STRING ) )
            // InternalAnsibleDsl.g:2130:4: (otherlv_1= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2130:4: (otherlv_1= RULE_STRING )
            // InternalAnsibleDsl.g:2131:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERoleCallsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_65); 

            					newLeafNode(otherlv_1, grammarAccess.getERoleCallsAccess().getRolesERoleCrossReference_1_0());
            				

            }


            }

            // InternalAnsibleDsl.g:2142:3: (otherlv_2= ',' ( (otherlv_3= RULE_STRING ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==71) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2143:4: otherlv_2= ',' ( (otherlv_3= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,71,FOLLOW_4); 

            	    				newLeafNode(otherlv_2, grammarAccess.getERoleCallsAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:2147:4: ( (otherlv_3= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:2148:5: (otherlv_3= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:2148:5: (otherlv_3= RULE_STRING )
            	    // InternalAnsibleDsl.g:2149:6: otherlv_3= RULE_STRING
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getERoleCallsRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_STRING,FOLLOW_65); 

            	    						newLeafNode(otherlv_3, grammarAccess.getERoleCallsAccess().getRolesERoleCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getERoleCallsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERoleCalls"


    // $ANTLR start "entryRuleERole"
    // InternalAnsibleDsl.g:2169:1: entryRuleERole returns [EObject current=null] : iv_ruleERole= ruleERole EOF ;
    public final EObject entryRuleERole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERole = null;


        try {
            // InternalAnsibleDsl.g:2169:46: (iv_ruleERole= ruleERole EOF )
            // InternalAnsibleDsl.g:2170:2: iv_ruleERole= ruleERole EOF
            {
             newCompositeNode(grammarAccess.getERoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERole=ruleERole();

            state._fsp--;

             current =iv_ruleERole; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERole"


    // $ANTLR start "ruleERole"
    // InternalAnsibleDsl.g:2176:1: ruleERole returns [EObject current=null] : (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'tasks_list{' ( ( (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock ) ) )+ otherlv_5= '}' )? (otherlv_6= 'handlers{' ( (lv_handlers_7_0= ruleEHandler ) )+ otherlv_8= '}' )? (otherlv_9= 'vars{' ( (lv_variable_declarations_10_0= ruleEVariableDeclaration ) ) (otherlv_11= ',' ( (lv_variable_declarations_12_0= ruleEVariableDeclaration ) ) )* otherlv_13= '}' )? (otherlv_14= 'files_names:' ( (lv_files_names_list_15_0= ruleEList ) ) )? (otherlv_16= 'templates_names:' ( (lv_templates_names_list_17_0= ruleEList ) ) )? ( (lv_metadata_18_0= ruleERoleMetadata ) )? otherlv_19= '}' ) ;
    public final EObject ruleERole() throws RecognitionException {
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        EObject lv_tasks_list_4_1 = null;

        EObject lv_tasks_list_4_2 = null;

        EObject lv_handlers_7_0 = null;

        EObject lv_variable_declarations_10_0 = null;

        EObject lv_variable_declarations_12_0 = null;

        EObject lv_files_names_list_15_0 = null;

        EObject lv_templates_names_list_17_0 = null;

        EObject lv_metadata_18_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2182:2: ( (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'tasks_list{' ( ( (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock ) ) )+ otherlv_5= '}' )? (otherlv_6= 'handlers{' ( (lv_handlers_7_0= ruleEHandler ) )+ otherlv_8= '}' )? (otherlv_9= 'vars{' ( (lv_variable_declarations_10_0= ruleEVariableDeclaration ) ) (otherlv_11= ',' ( (lv_variable_declarations_12_0= ruleEVariableDeclaration ) ) )* otherlv_13= '}' )? (otherlv_14= 'files_names:' ( (lv_files_names_list_15_0= ruleEList ) ) )? (otherlv_16= 'templates_names:' ( (lv_templates_names_list_17_0= ruleEList ) ) )? ( (lv_metadata_18_0= ruleERoleMetadata ) )? otherlv_19= '}' ) )
            // InternalAnsibleDsl.g:2183:2: (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'tasks_list{' ( ( (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock ) ) )+ otherlv_5= '}' )? (otherlv_6= 'handlers{' ( (lv_handlers_7_0= ruleEHandler ) )+ otherlv_8= '}' )? (otherlv_9= 'vars{' ( (lv_variable_declarations_10_0= ruleEVariableDeclaration ) ) (otherlv_11= ',' ( (lv_variable_declarations_12_0= ruleEVariableDeclaration ) ) )* otherlv_13= '}' )? (otherlv_14= 'files_names:' ( (lv_files_names_list_15_0= ruleEList ) ) )? (otherlv_16= 'templates_names:' ( (lv_templates_names_list_17_0= ruleEList ) ) )? ( (lv_metadata_18_0= ruleERoleMetadata ) )? otherlv_19= '}' )
            {
            // InternalAnsibleDsl.g:2183:2: (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'tasks_list{' ( ( (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock ) ) )+ otherlv_5= '}' )? (otherlv_6= 'handlers{' ( (lv_handlers_7_0= ruleEHandler ) )+ otherlv_8= '}' )? (otherlv_9= 'vars{' ( (lv_variable_declarations_10_0= ruleEVariableDeclaration ) ) (otherlv_11= ',' ( (lv_variable_declarations_12_0= ruleEVariableDeclaration ) ) )* otherlv_13= '}' )? (otherlv_14= 'files_names:' ( (lv_files_names_list_15_0= ruleEList ) ) )? (otherlv_16= 'templates_names:' ( (lv_templates_names_list_17_0= ruleEList ) ) )? ( (lv_metadata_18_0= ruleERoleMetadata ) )? otherlv_19= '}' )
            // InternalAnsibleDsl.g:2184:3: otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'tasks_list{' ( ( (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock ) ) )+ otherlv_5= '}' )? (otherlv_6= 'handlers{' ( (lv_handlers_7_0= ruleEHandler ) )+ otherlv_8= '}' )? (otherlv_9= 'vars{' ( (lv_variable_declarations_10_0= ruleEVariableDeclaration ) ) (otherlv_11= ',' ( (lv_variable_declarations_12_0= ruleEVariableDeclaration ) ) )* otherlv_13= '}' )? (otherlv_14= 'files_names:' ( (lv_files_names_list_15_0= ruleEList ) ) )? (otherlv_16= 'templates_names:' ( (lv_templates_names_list_17_0= ruleEList ) ) )? ( (lv_metadata_18_0= ruleERoleMetadata ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_66); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleAccess().getRoleKeyword_0());
            		
            otherlv_1=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getERoleAccess().getRole_nameKeyword_1());
            		
            // InternalAnsibleDsl.g:2192:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2193:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2193:4: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:2194:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_67); 

            					newLeafNode(lv_name_2_0, grammarAccess.getERoleAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERoleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAnsibleDsl.g:2210:3: (otherlv_3= 'tasks_list{' ( ( (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock ) ) )+ otherlv_5= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==26) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAnsibleDsl.g:2211:4: otherlv_3= 'tasks_list{' ( ( (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock ) ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getERoleAccess().getTasks_listKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2215:4: ( ( (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock ) ) )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==29||LA47_0==35) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2216:5: ( (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock ) )
                    	    {
                    	    // InternalAnsibleDsl.g:2216:5: ( (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock ) )
                    	    // InternalAnsibleDsl.g:2217:6: (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock )
                    	    {
                    	    // InternalAnsibleDsl.g:2217:6: (lv_tasks_list_4_1= ruleETask | lv_tasks_list_4_2= ruleEBlock )
                    	    int alt46=2;
                    	    int LA46_0 = input.LA(1);

                    	    if ( (LA46_0==35) ) {
                    	        alt46=1;
                    	    }
                    	    else if ( (LA46_0==29) ) {
                    	        alt46=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 46, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt46) {
                    	        case 1 :
                    	            // InternalAnsibleDsl.g:2218:7: lv_tasks_list_4_1= ruleETask
                    	            {

                    	            							newCompositeNode(grammarAccess.getERoleAccess().getTasks_listETaskParserRuleCall_3_1_0_0());
                    	            						
                    	            pushFollow(FOLLOW_19);
                    	            lv_tasks_list_4_1=ruleETask();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getERoleRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"tasks_list",
                    	            								lv_tasks_list_4_1,
                    	            								"org.sodalite.sdl.ansible.AnsibleDsl.ETask");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalAnsibleDsl.g:2234:7: lv_tasks_list_4_2= ruleEBlock
                    	            {

                    	            							newCompositeNode(grammarAccess.getERoleAccess().getTasks_listEBlockParserRuleCall_3_1_0_1());
                    	            						
                    	            pushFollow(FOLLOW_19);
                    	            lv_tasks_list_4_2=ruleEBlock();

                    	            state._fsp--;


                    	            							if (current==null) {
                    	            								current = createModelElementForParent(grammarAccess.getERoleRule());
                    	            							}
                    	            							add(
                    	            								current,
                    	            								"tasks_list",
                    	            								lv_tasks_list_4_2,
                    	            								"org.sodalite.sdl.ansible.AnsibleDsl.EBlock");
                    	            							afterParserOrEnumRuleCall();
                    	            						

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_68); 

                    				newLeafNode(otherlv_5, grammarAccess.getERoleAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2257:3: (otherlv_6= 'handlers{' ( (lv_handlers_7_0= ruleEHandler ) )+ otherlv_8= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAnsibleDsl.g:2258:4: otherlv_6= 'handlers{' ( (lv_handlers_7_0= ruleEHandler ) )+ otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getERoleAccess().getHandlersKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2262:4: ( (lv_handlers_7_0= ruleEHandler ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==38) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2263:5: (lv_handlers_7_0= ruleEHandler )
                    	    {
                    	    // InternalAnsibleDsl.g:2263:5: (lv_handlers_7_0= ruleEHandler )
                    	    // InternalAnsibleDsl.g:2264:6: lv_handlers_7_0= ruleEHandler
                    	    {

                    	    						newCompositeNode(grammarAccess.getERoleAccess().getHandlersEHandlerParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_handlers_7_0=ruleEHandler();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getERoleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"handlers",
                    	    							lv_handlers_7_0,
                    	    							"org.sodalite.sdl.ansible.AnsibleDsl.EHandler");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_69); 

                    				newLeafNode(otherlv_8, grammarAccess.getERoleAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2286:3: (otherlv_9= 'vars{' ( (lv_variable_declarations_10_0= ruleEVariableDeclaration ) ) (otherlv_11= ',' ( (lv_variable_declarations_12_0= ruleEVariableDeclaration ) ) )* otherlv_13= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==74) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAnsibleDsl.g:2287:4: otherlv_9= 'vars{' ( (lv_variable_declarations_10_0= ruleEVariableDeclaration ) ) (otherlv_11= ',' ( (lv_variable_declarations_12_0= ruleEVariableDeclaration ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,74,FOLLOW_54); 

                    				newLeafNode(otherlv_9, grammarAccess.getERoleAccess().getVarsKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:2291:4: ( (lv_variable_declarations_10_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:2292:5: (lv_variable_declarations_10_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:2292:5: (lv_variable_declarations_10_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:2293:6: lv_variable_declarations_10_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getERoleAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_variable_declarations_10_0=ruleEVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleRule());
                    						}
                    						add(
                    							current,
                    							"variable_declarations",
                    							lv_variable_declarations_10_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnsibleDsl.g:2310:4: (otherlv_11= ',' ( (lv_variable_declarations_12_0= ruleEVariableDeclaration ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==71) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2311:5: otherlv_11= ',' ( (lv_variable_declarations_12_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_11=(Token)match(input,71,FOLLOW_54); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getERoleAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:2315:5: ( (lv_variable_declarations_12_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:2316:6: (lv_variable_declarations_12_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:2316:6: (lv_variable_declarations_12_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:2317:7: lv_variable_declarations_12_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getERoleAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_65);
                    	    lv_variable_declarations_12_0=ruleEVariableDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getERoleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable_declarations",
                    	    								lv_variable_declarations_12_0,
                    	    								"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,17,FOLLOW_70); 

                    				newLeafNode(otherlv_13, grammarAccess.getERoleAccess().getRightCurlyBracketKeyword_5_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2340:3: (otherlv_14= 'files_names:' ( (lv_files_names_list_15_0= ruleEList ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==75) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAnsibleDsl.g:2341:4: otherlv_14= 'files_names:' ( (lv_files_names_list_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,75,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getERoleAccess().getFiles_namesKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:2345:4: ( (lv_files_names_list_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2346:5: (lv_files_names_list_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2346:5: (lv_files_names_list_15_0= ruleEList )
                    // InternalAnsibleDsl.g:2347:6: lv_files_names_list_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleAccess().getFiles_names_listEListParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_71);
                    lv_files_names_list_15_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleRule());
                    						}
                    						set(
                    							current,
                    							"files_names_list",
                    							lv_files_names_list_15_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2365:3: (otherlv_16= 'templates_names:' ( (lv_templates_names_list_17_0= ruleEList ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==76) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAnsibleDsl.g:2366:4: otherlv_16= 'templates_names:' ( (lv_templates_names_list_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,76,FOLLOW_16); 

                    				newLeafNode(otherlv_16, grammarAccess.getERoleAccess().getTemplates_namesKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:2370:4: ( (lv_templates_names_list_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2371:5: (lv_templates_names_list_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2371:5: (lv_templates_names_list_17_0= ruleEList )
                    // InternalAnsibleDsl.g:2372:6: lv_templates_names_list_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleAccess().getTemplates_names_listEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_72);
                    lv_templates_names_list_17_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleRule());
                    						}
                    						set(
                    							current,
                    							"templates_names_list",
                    							lv_templates_names_list_17_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2390:3: ( (lv_metadata_18_0= ruleERoleMetadata ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==77) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAnsibleDsl.g:2391:4: (lv_metadata_18_0= ruleERoleMetadata )
                    {
                    // InternalAnsibleDsl.g:2391:4: (lv_metadata_18_0= ruleERoleMetadata )
                    // InternalAnsibleDsl.g:2392:5: lv_metadata_18_0= ruleERoleMetadata
                    {

                    					newCompositeNode(grammarAccess.getERoleAccess().getMetadataERoleMetadataParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_metadata_18_0=ruleERoleMetadata();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getERoleRule());
                    					}
                    					set(
                    						current,
                    						"metadata",
                    						lv_metadata_18_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.ERoleMetadata");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getERoleAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERole"


    // $ANTLR start "entryRuleERoleMetadata"
    // InternalAnsibleDsl.g:2417:1: entryRuleERoleMetadata returns [EObject current=null] : iv_ruleERoleMetadata= ruleERoleMetadata EOF ;
    public final EObject entryRuleERoleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleMetadata = null;


        try {
            // InternalAnsibleDsl.g:2417:54: (iv_ruleERoleMetadata= ruleERoleMetadata EOF )
            // InternalAnsibleDsl.g:2418:2: iv_ruleERoleMetadata= ruleERoleMetadata EOF
            {
             newCompositeNode(grammarAccess.getERoleMetadataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERoleMetadata=ruleERoleMetadata();

            state._fsp--;

             current =iv_ruleERoleMetadata; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERoleMetadata"


    // $ANTLR start "ruleERoleMetadata"
    // InternalAnsibleDsl.g:2424:1: ruleERoleMetadata returns [EObject current=null] : ( () otherlv_1= 'metadata{' (otherlv_2= 'allow_duplicates:' ( (lv_allow_duplicates_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'dependencies:' ( (lv_dependencies_5_0= ruleEList ) ) )? (otherlv_6= 'galaxy_info:' ( (lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleERoleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_allow_duplicates_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_dependencies_5_0 = null;

        EObject lv_galaxy_tags_7_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2430:2: ( ( () otherlv_1= 'metadata{' (otherlv_2= 'allow_duplicates:' ( (lv_allow_duplicates_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'dependencies:' ( (lv_dependencies_5_0= ruleEList ) ) )? (otherlv_6= 'galaxy_info:' ( (lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy ) ) )? otherlv_8= '}' ) )
            // InternalAnsibleDsl.g:2431:2: ( () otherlv_1= 'metadata{' (otherlv_2= 'allow_duplicates:' ( (lv_allow_duplicates_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'dependencies:' ( (lv_dependencies_5_0= ruleEList ) ) )? (otherlv_6= 'galaxy_info:' ( (lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy ) ) )? otherlv_8= '}' )
            {
            // InternalAnsibleDsl.g:2431:2: ( () otherlv_1= 'metadata{' (otherlv_2= 'allow_duplicates:' ( (lv_allow_duplicates_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'dependencies:' ( (lv_dependencies_5_0= ruleEList ) ) )? (otherlv_6= 'galaxy_info:' ( (lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy ) ) )? otherlv_8= '}' )
            // InternalAnsibleDsl.g:2432:3: () otherlv_1= 'metadata{' (otherlv_2= 'allow_duplicates:' ( (lv_allow_duplicates_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'dependencies:' ( (lv_dependencies_5_0= ruleEList ) ) )? (otherlv_6= 'galaxy_info:' ( (lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy ) ) )? otherlv_8= '}'
            {
            // InternalAnsibleDsl.g:2432:3: ()
            // InternalAnsibleDsl.g:2433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERoleMetadataAccess().getERoleMetadataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_73); 

            			newLeafNode(otherlv_1, grammarAccess.getERoleMetadataAccess().getMetadataKeyword_1());
            		
            // InternalAnsibleDsl.g:2443:3: (otherlv_2= 'allow_duplicates:' ( (lv_allow_duplicates_3_0= RULE_BOOLEAN ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==78) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAnsibleDsl.g:2444:4: otherlv_2= 'allow_duplicates:' ( (lv_allow_duplicates_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getERoleMetadataAccess().getAllow_duplicatesKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2448:4: ( (lv_allow_duplicates_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:2449:5: (lv_allow_duplicates_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:2449:5: (lv_allow_duplicates_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:2450:6: lv_allow_duplicates_3_0= RULE_BOOLEAN
                    {
                    lv_allow_duplicates_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_74); 

                    						newLeafNode(lv_allow_duplicates_3_0, grammarAccess.getERoleMetadataAccess().getAllow_duplicatesBOOLEANTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERoleMetadataRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"allow_duplicates",
                    							lv_allow_duplicates_3_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2467:3: (otherlv_4= 'dependencies:' ( (lv_dependencies_5_0= ruleEList ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==79) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalAnsibleDsl.g:2468:4: otherlv_4= 'dependencies:' ( (lv_dependencies_5_0= ruleEList ) )
                    {
                    otherlv_4=(Token)match(input,79,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getERoleMetadataAccess().getDependenciesKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2472:4: ( (lv_dependencies_5_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2473:5: (lv_dependencies_5_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2473:5: (lv_dependencies_5_0= ruleEList )
                    // InternalAnsibleDsl.g:2474:6: lv_dependencies_5_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleMetadataAccess().getDependenciesEListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_75);
                    lv_dependencies_5_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleMetadataRule());
                    						}
                    						set(
                    							current,
                    							"dependencies",
                    							lv_dependencies_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2492:3: (otherlv_6= 'galaxy_info:' ( (lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==80) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAnsibleDsl.g:2493:4: otherlv_6= 'galaxy_info:' ( (lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy ) )
                    {
                    otherlv_6=(Token)match(input,80,FOLLOW_76); 

                    				newLeafNode(otherlv_6, grammarAccess.getERoleMetadataAccess().getGalaxy_infoKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2497:4: ( (lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy ) )
                    // InternalAnsibleDsl.g:2498:5: (lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy )
                    {
                    // InternalAnsibleDsl.g:2498:5: (lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy )
                    // InternalAnsibleDsl.g:2499:6: lv_galaxy_tags_7_0= ruleERoleMetadataGalaxy
                    {

                    						newCompositeNode(grammarAccess.getERoleMetadataAccess().getGalaxy_tagsERoleMetadataGalaxyParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_galaxy_tags_7_0=ruleERoleMetadataGalaxy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleMetadataRule());
                    						}
                    						set(
                    							current,
                    							"galaxy_tags",
                    							lv_galaxy_tags_7_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.ERoleMetadataGalaxy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getERoleMetadataAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERoleMetadata"


    // $ANTLR start "entryRuleERoleMetadataGalaxy"
    // InternalAnsibleDsl.g:2525:1: entryRuleERoleMetadataGalaxy returns [EObject current=null] : iv_ruleERoleMetadataGalaxy= ruleERoleMetadataGalaxy EOF ;
    public final EObject entryRuleERoleMetadataGalaxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleMetadataGalaxy = null;


        try {
            // InternalAnsibleDsl.g:2525:60: (iv_ruleERoleMetadataGalaxy= ruleERoleMetadataGalaxy EOF )
            // InternalAnsibleDsl.g:2526:2: iv_ruleERoleMetadataGalaxy= ruleERoleMetadataGalaxy EOF
            {
             newCompositeNode(grammarAccess.getERoleMetadataGalaxyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERoleMetadataGalaxy=ruleERoleMetadataGalaxy();

            state._fsp--;

             current =iv_ruleERoleMetadataGalaxy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERoleMetadataGalaxy"


    // $ANTLR start "ruleERoleMetadataGalaxy"
    // InternalAnsibleDsl.g:2532:1: ruleERoleMetadataGalaxy returns [EObject current=null] : (otherlv_0= 'galaxy_info{' otherlv_1= 'author:' ( (lv_author_2_0= RULE_STRING ) ) otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'company:' ( (lv_company_6_0= RULE_STRING ) ) (otherlv_7= 'issue_tracker_url:' ( (lv_issue_tracker_url_8_0= RULE_STRING ) ) )? otherlv_9= 'license:' ( (lv_license_10_0= RULE_STRING ) ) otherlv_11= 'min_ansible_version:' ( (lv_min_ansible_version_12_0= RULE_STRING ) ) (otherlv_13= 'min_ansible_container_version:' ( (lv_min_ansible_container_version_14_0= RULE_STRING ) ) )? (otherlv_15= 'github_branch:' ( (lv_githhub_branch_16_0= RULE_STRING ) ) )? otherlv_17= 'platforms:' ( (lv_platforms_18_0= ruleEList ) ) (otherlv_19= 'cloud_platforms:' ( (lv_cloud_platforms_20_0= ruleEList ) ) )? (otherlv_21= 'galaxy_tags:' ( (lv_galaxy_tags_22_0= ruleEList ) ) )? otherlv_23= '}' ) ;
    public final EObject ruleERoleMetadataGalaxy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_author_2_0=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_company_6_0=null;
        Token otherlv_7=null;
        Token lv_issue_tracker_url_8_0=null;
        Token otherlv_9=null;
        Token lv_license_10_0=null;
        Token otherlv_11=null;
        Token lv_min_ansible_version_12_0=null;
        Token otherlv_13=null;
        Token lv_min_ansible_container_version_14_0=null;
        Token otherlv_15=null;
        Token lv_githhub_branch_16_0=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        EObject lv_platforms_18_0 = null;

        EObject lv_cloud_platforms_20_0 = null;

        EObject lv_galaxy_tags_22_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2538:2: ( (otherlv_0= 'galaxy_info{' otherlv_1= 'author:' ( (lv_author_2_0= RULE_STRING ) ) otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'company:' ( (lv_company_6_0= RULE_STRING ) ) (otherlv_7= 'issue_tracker_url:' ( (lv_issue_tracker_url_8_0= RULE_STRING ) ) )? otherlv_9= 'license:' ( (lv_license_10_0= RULE_STRING ) ) otherlv_11= 'min_ansible_version:' ( (lv_min_ansible_version_12_0= RULE_STRING ) ) (otherlv_13= 'min_ansible_container_version:' ( (lv_min_ansible_container_version_14_0= RULE_STRING ) ) )? (otherlv_15= 'github_branch:' ( (lv_githhub_branch_16_0= RULE_STRING ) ) )? otherlv_17= 'platforms:' ( (lv_platforms_18_0= ruleEList ) ) (otherlv_19= 'cloud_platforms:' ( (lv_cloud_platforms_20_0= ruleEList ) ) )? (otherlv_21= 'galaxy_tags:' ( (lv_galaxy_tags_22_0= ruleEList ) ) )? otherlv_23= '}' ) )
            // InternalAnsibleDsl.g:2539:2: (otherlv_0= 'galaxy_info{' otherlv_1= 'author:' ( (lv_author_2_0= RULE_STRING ) ) otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'company:' ( (lv_company_6_0= RULE_STRING ) ) (otherlv_7= 'issue_tracker_url:' ( (lv_issue_tracker_url_8_0= RULE_STRING ) ) )? otherlv_9= 'license:' ( (lv_license_10_0= RULE_STRING ) ) otherlv_11= 'min_ansible_version:' ( (lv_min_ansible_version_12_0= RULE_STRING ) ) (otherlv_13= 'min_ansible_container_version:' ( (lv_min_ansible_container_version_14_0= RULE_STRING ) ) )? (otherlv_15= 'github_branch:' ( (lv_githhub_branch_16_0= RULE_STRING ) ) )? otherlv_17= 'platforms:' ( (lv_platforms_18_0= ruleEList ) ) (otherlv_19= 'cloud_platforms:' ( (lv_cloud_platforms_20_0= ruleEList ) ) )? (otherlv_21= 'galaxy_tags:' ( (lv_galaxy_tags_22_0= ruleEList ) ) )? otherlv_23= '}' )
            {
            // InternalAnsibleDsl.g:2539:2: (otherlv_0= 'galaxy_info{' otherlv_1= 'author:' ( (lv_author_2_0= RULE_STRING ) ) otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'company:' ( (lv_company_6_0= RULE_STRING ) ) (otherlv_7= 'issue_tracker_url:' ( (lv_issue_tracker_url_8_0= RULE_STRING ) ) )? otherlv_9= 'license:' ( (lv_license_10_0= RULE_STRING ) ) otherlv_11= 'min_ansible_version:' ( (lv_min_ansible_version_12_0= RULE_STRING ) ) (otherlv_13= 'min_ansible_container_version:' ( (lv_min_ansible_container_version_14_0= RULE_STRING ) ) )? (otherlv_15= 'github_branch:' ( (lv_githhub_branch_16_0= RULE_STRING ) ) )? otherlv_17= 'platforms:' ( (lv_platforms_18_0= ruleEList ) ) (otherlv_19= 'cloud_platforms:' ( (lv_cloud_platforms_20_0= ruleEList ) ) )? (otherlv_21= 'galaxy_tags:' ( (lv_galaxy_tags_22_0= ruleEList ) ) )? otherlv_23= '}' )
            // InternalAnsibleDsl.g:2540:3: otherlv_0= 'galaxy_info{' otherlv_1= 'author:' ( (lv_author_2_0= RULE_STRING ) ) otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) otherlv_5= 'company:' ( (lv_company_6_0= RULE_STRING ) ) (otherlv_7= 'issue_tracker_url:' ( (lv_issue_tracker_url_8_0= RULE_STRING ) ) )? otherlv_9= 'license:' ( (lv_license_10_0= RULE_STRING ) ) otherlv_11= 'min_ansible_version:' ( (lv_min_ansible_version_12_0= RULE_STRING ) ) (otherlv_13= 'min_ansible_container_version:' ( (lv_min_ansible_container_version_14_0= RULE_STRING ) ) )? (otherlv_15= 'github_branch:' ( (lv_githhub_branch_16_0= RULE_STRING ) ) )? otherlv_17= 'platforms:' ( (lv_platforms_18_0= ruleEList ) ) (otherlv_19= 'cloud_platforms:' ( (lv_cloud_platforms_20_0= ruleEList ) ) )? (otherlv_21= 'galaxy_tags:' ( (lv_galaxy_tags_22_0= ruleEList ) ) )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,81,FOLLOW_77); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleMetadataGalaxyAccess().getGalaxy_infoKeyword_0());
            		
            otherlv_1=(Token)match(input,82,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getERoleMetadataGalaxyAccess().getAuthorKeyword_1());
            		
            // InternalAnsibleDsl.g:2548:3: ( (lv_author_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2549:4: (lv_author_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2549:4: (lv_author_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:2550:5: lv_author_2_0= RULE_STRING
            {
            lv_author_2_0=(Token)match(input,RULE_STRING,FOLLOW_78); 

            					newLeafNode(lv_author_2_0, grammarAccess.getERoleMetadataGalaxyAccess().getAuthorSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERoleMetadataGalaxyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"author",
            						lv_author_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,83,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getERoleMetadataGalaxyAccess().getDescriptionKeyword_3());
            		
            // InternalAnsibleDsl.g:2570:3: ( (lv_description_4_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2571:4: (lv_description_4_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2571:4: (lv_description_4_0= RULE_STRING )
            // InternalAnsibleDsl.g:2572:5: lv_description_4_0= RULE_STRING
            {
            lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

            					newLeafNode(lv_description_4_0, grammarAccess.getERoleMetadataGalaxyAccess().getDescriptionSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERoleMetadataGalaxyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,84,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getERoleMetadataGalaxyAccess().getCompanyKeyword_5());
            		
            // InternalAnsibleDsl.g:2592:3: ( (lv_company_6_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2593:4: (lv_company_6_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2593:4: (lv_company_6_0= RULE_STRING )
            // InternalAnsibleDsl.g:2594:5: lv_company_6_0= RULE_STRING
            {
            lv_company_6_0=(Token)match(input,RULE_STRING,FOLLOW_80); 

            					newLeafNode(lv_company_6_0, grammarAccess.getERoleMetadataGalaxyAccess().getCompanySTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERoleMetadataGalaxyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"company",
            						lv_company_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAnsibleDsl.g:2610:3: (otherlv_7= 'issue_tracker_url:' ( (lv_issue_tracker_url_8_0= RULE_STRING ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==85) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAnsibleDsl.g:2611:4: otherlv_7= 'issue_tracker_url:' ( (lv_issue_tracker_url_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,85,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getERoleMetadataGalaxyAccess().getIssue_tracker_urlKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:2615:4: ( (lv_issue_tracker_url_8_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2616:5: (lv_issue_tracker_url_8_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2616:5: (lv_issue_tracker_url_8_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2617:6: lv_issue_tracker_url_8_0= RULE_STRING
                    {
                    lv_issue_tracker_url_8_0=(Token)match(input,RULE_STRING,FOLLOW_81); 

                    						newLeafNode(lv_issue_tracker_url_8_0, grammarAccess.getERoleMetadataGalaxyAccess().getIssue_tracker_urlSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERoleMetadataGalaxyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"issue_tracker_url",
                    							lv_issue_tracker_url_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,86,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getERoleMetadataGalaxyAccess().getLicenseKeyword_8());
            		
            // InternalAnsibleDsl.g:2638:3: ( (lv_license_10_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2639:4: (lv_license_10_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2639:4: (lv_license_10_0= RULE_STRING )
            // InternalAnsibleDsl.g:2640:5: lv_license_10_0= RULE_STRING
            {
            lv_license_10_0=(Token)match(input,RULE_STRING,FOLLOW_82); 

            					newLeafNode(lv_license_10_0, grammarAccess.getERoleMetadataGalaxyAccess().getLicenseSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERoleMetadataGalaxyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"license",
            						lv_license_10_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_11=(Token)match(input,87,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getERoleMetadataGalaxyAccess().getMin_ansible_versionKeyword_10());
            		
            // InternalAnsibleDsl.g:2660:3: ( (lv_min_ansible_version_12_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2661:4: (lv_min_ansible_version_12_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2661:4: (lv_min_ansible_version_12_0= RULE_STRING )
            // InternalAnsibleDsl.g:2662:5: lv_min_ansible_version_12_0= RULE_STRING
            {
            lv_min_ansible_version_12_0=(Token)match(input,RULE_STRING,FOLLOW_83); 

            					newLeafNode(lv_min_ansible_version_12_0, grammarAccess.getERoleMetadataGalaxyAccess().getMin_ansible_versionSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERoleMetadataGalaxyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min_ansible_version",
            						lv_min_ansible_version_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalAnsibleDsl.g:2678:3: (otherlv_13= 'min_ansible_container_version:' ( (lv_min_ansible_container_version_14_0= RULE_STRING ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==88) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAnsibleDsl.g:2679:4: otherlv_13= 'min_ansible_container_version:' ( (lv_min_ansible_container_version_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,88,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getERoleMetadataGalaxyAccess().getMin_ansible_container_versionKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:2683:4: ( (lv_min_ansible_container_version_14_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2684:5: (lv_min_ansible_container_version_14_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2684:5: (lv_min_ansible_container_version_14_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2685:6: lv_min_ansible_container_version_14_0= RULE_STRING
                    {
                    lv_min_ansible_container_version_14_0=(Token)match(input,RULE_STRING,FOLLOW_84); 

                    						newLeafNode(lv_min_ansible_container_version_14_0, grammarAccess.getERoleMetadataGalaxyAccess().getMin_ansible_container_versionSTRINGTerminalRuleCall_12_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERoleMetadataGalaxyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"min_ansible_container_version",
                    							lv_min_ansible_container_version_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2702:3: (otherlv_15= 'github_branch:' ( (lv_githhub_branch_16_0= RULE_STRING ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==89) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAnsibleDsl.g:2703:4: otherlv_15= 'github_branch:' ( (lv_githhub_branch_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,89,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getERoleMetadataGalaxyAccess().getGithub_branchKeyword_13_0());
                    			
                    // InternalAnsibleDsl.g:2707:4: ( (lv_githhub_branch_16_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2708:5: (lv_githhub_branch_16_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2708:5: (lv_githhub_branch_16_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2709:6: lv_githhub_branch_16_0= RULE_STRING
                    {
                    lv_githhub_branch_16_0=(Token)match(input,RULE_STRING,FOLLOW_85); 

                    						newLeafNode(lv_githhub_branch_16_0, grammarAccess.getERoleMetadataGalaxyAccess().getGithhub_branchSTRINGTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERoleMetadataGalaxyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"githhub_branch",
                    							lv_githhub_branch_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,90,FOLLOW_16); 

            			newLeafNode(otherlv_17, grammarAccess.getERoleMetadataGalaxyAccess().getPlatformsKeyword_14());
            		
            // InternalAnsibleDsl.g:2730:3: ( (lv_platforms_18_0= ruleEList ) )
            // InternalAnsibleDsl.g:2731:4: (lv_platforms_18_0= ruleEList )
            {
            // InternalAnsibleDsl.g:2731:4: (lv_platforms_18_0= ruleEList )
            // InternalAnsibleDsl.g:2732:5: lv_platforms_18_0= ruleEList
            {

            					newCompositeNode(grammarAccess.getERoleMetadataGalaxyAccess().getPlatformsEListParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_86);
            lv_platforms_18_0=ruleEList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERoleMetadataGalaxyRule());
            					}
            					set(
            						current,
            						"platforms",
            						lv_platforms_18_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:2749:3: (otherlv_19= 'cloud_platforms:' ( (lv_cloud_platforms_20_0= ruleEList ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==91) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAnsibleDsl.g:2750:4: otherlv_19= 'cloud_platforms:' ( (lv_cloud_platforms_20_0= ruleEList ) )
                    {
                    otherlv_19=(Token)match(input,91,FOLLOW_16); 

                    				newLeafNode(otherlv_19, grammarAccess.getERoleMetadataGalaxyAccess().getCloud_platformsKeyword_16_0());
                    			
                    // InternalAnsibleDsl.g:2754:4: ( (lv_cloud_platforms_20_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2755:5: (lv_cloud_platforms_20_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2755:5: (lv_cloud_platforms_20_0= ruleEList )
                    // InternalAnsibleDsl.g:2756:6: lv_cloud_platforms_20_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleMetadataGalaxyAccess().getCloud_platformsEListParserRuleCall_16_1_0());
                    					
                    pushFollow(FOLLOW_87);
                    lv_cloud_platforms_20_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleMetadataGalaxyRule());
                    						}
                    						set(
                    							current,
                    							"cloud_platforms",
                    							lv_cloud_platforms_20_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2774:3: (otherlv_21= 'galaxy_tags:' ( (lv_galaxy_tags_22_0= ruleEList ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==92) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAnsibleDsl.g:2775:4: otherlv_21= 'galaxy_tags:' ( (lv_galaxy_tags_22_0= ruleEList ) )
                    {
                    otherlv_21=(Token)match(input,92,FOLLOW_16); 

                    				newLeafNode(otherlv_21, grammarAccess.getERoleMetadataGalaxyAccess().getGalaxy_tagsKeyword_17_0());
                    			
                    // InternalAnsibleDsl.g:2779:4: ( (lv_galaxy_tags_22_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2780:5: (lv_galaxy_tags_22_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2780:5: (lv_galaxy_tags_22_0= ruleEList )
                    // InternalAnsibleDsl.g:2781:6: lv_galaxy_tags_22_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleMetadataGalaxyAccess().getGalaxy_tagsEListParserRuleCall_17_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_galaxy_tags_22_0=ruleEList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleMetadataGalaxyRule());
                    						}
                    						set(
                    							current,
                    							"galaxy_tags",
                    							lv_galaxy_tags_22_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getERoleMetadataGalaxyAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERoleMetadataGalaxy"


    // $ANTLR start "entryRuleELoop"
    // InternalAnsibleDsl.g:2807:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalAnsibleDsl.g:2807:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalAnsibleDsl.g:2808:2: iv_ruleELoop= ruleELoop EOF
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
    // InternalAnsibleDsl.g:2814:1: ruleELoop returns [EObject current=null] : (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        EObject this_ELoopOverList_0 = null;

        EObject this_EUntil_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2820:2: ( (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) )
            // InternalAnsibleDsl.g:2821:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            {
            // InternalAnsibleDsl.g:2821:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==93) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=100 && LA64_0<=102)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalAnsibleDsl.g:2822:3: this_ELoopOverList_0= ruleELoopOverList
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
                    // InternalAnsibleDsl.g:2831:3: this_EUntil_1= ruleEUntil
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
    // InternalAnsibleDsl.g:2843:1: entryRuleELoopOverList returns [EObject current=null] : iv_ruleELoopOverList= ruleELoopOverList EOF ;
    public final EObject entryRuleELoopOverList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopOverList = null;


        try {
            // InternalAnsibleDsl.g:2843:54: (iv_ruleELoopOverList= ruleELoopOverList EOF )
            // InternalAnsibleDsl.g:2844:2: iv_ruleELoopOverList= ruleELoopOverList EOF
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
    // InternalAnsibleDsl.g:2850:1: ruleELoopOverList returns [EObject current=null] : (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleELoopList ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) ;
    public final EObject ruleELoopOverList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loop_list_1_0 = null;

        EObject lv_loop_control_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2856:2: ( (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleELoopList ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) )
            // InternalAnsibleDsl.g:2857:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleELoopList ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            {
            // InternalAnsibleDsl.g:2857:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleELoopList ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            // InternalAnsibleDsl.g:2858:3: otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleELoopList ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )?
            {
            otherlv_0=(Token)match(input,93,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getELoopOverListAccess().getLoopKeyword_0());
            		
            // InternalAnsibleDsl.g:2862:3: ( (lv_loop_list_1_0= ruleELoopList ) )
            // InternalAnsibleDsl.g:2863:4: (lv_loop_list_1_0= ruleELoopList )
            {
            // InternalAnsibleDsl.g:2863:4: (lv_loop_list_1_0= ruleELoopList )
            // InternalAnsibleDsl.g:2864:5: lv_loop_list_1_0= ruleELoopList
            {

            					newCompositeNode(grammarAccess.getELoopOverListAccess().getLoop_listELoopListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_88);
            lv_loop_list_1_0=ruleELoopList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getELoopOverListRule());
            					}
            					set(
            						current,
            						"loop_list",
            						lv_loop_list_1_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.ELoopList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:2881:3: ( (lv_loop_control_2_0= ruleELoopControl ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==94) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAnsibleDsl.g:2882:4: (lv_loop_control_2_0= ruleELoopControl )
                    {
                    // InternalAnsibleDsl.g:2882:4: (lv_loop_control_2_0= ruleELoopControl )
                    // InternalAnsibleDsl.g:2883:5: lv_loop_control_2_0= ruleELoopControl
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


    // $ANTLR start "entryRuleELoopList"
    // InternalAnsibleDsl.g:2904:1: entryRuleELoopList returns [EObject current=null] : iv_ruleELoopList= ruleELoopList EOF ;
    public final EObject entryRuleELoopList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopList = null;


        try {
            // InternalAnsibleDsl.g:2904:50: (iv_ruleELoopList= ruleELoopList EOF )
            // InternalAnsibleDsl.g:2905:2: iv_ruleELoopList= ruleELoopList EOF
            {
             newCompositeNode(grammarAccess.getELoopListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELoopList=ruleELoopList();

            state._fsp--;

             current =iv_ruleELoopList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELoopList"


    // $ANTLR start "ruleELoopList"
    // InternalAnsibleDsl.g:2911:1: ruleELoopList returns [EObject current=null] : (this_EList_0= ruleEList | this_EFilteredVariable_1= ruleEFilteredVariable ) ;
    public final EObject ruleELoopList() throws RecognitionException {
        EObject current = null;

        EObject this_EList_0 = null;

        EObject this_EFilteredVariable_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2917:2: ( (this_EList_0= ruleEList | this_EFilteredVariable_1= ruleEFilteredVariable ) )
            // InternalAnsibleDsl.g:2918:2: (this_EList_0= ruleEList | this_EFilteredVariable_1= ruleEFilteredVariable )
            {
            // InternalAnsibleDsl.g:2918:2: (this_EList_0= ruleEList | this_EFilteredVariable_1= ruleEFilteredVariable )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==153) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ID) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalAnsibleDsl.g:2919:3: this_EList_0= ruleEList
                    {

                    			newCompositeNode(grammarAccess.getELoopListAccess().getEListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EList_0=ruleEList();

                    state._fsp--;


                    			current = this_EList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:2928:3: this_EFilteredVariable_1= ruleEFilteredVariable
                    {

                    			newCompositeNode(grammarAccess.getELoopListAccess().getEFilteredVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFilteredVariable_1=ruleEFilteredVariable();

                    state._fsp--;


                    			current = this_EFilteredVariable_1;
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
    // $ANTLR end "ruleELoopList"


    // $ANTLR start "entryRuleELoopControl"
    // InternalAnsibleDsl.g:2940:1: entryRuleELoopControl returns [EObject current=null] : iv_ruleELoopControl= ruleELoopControl EOF ;
    public final EObject entryRuleELoopControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopControl = null;


        try {
            // InternalAnsibleDsl.g:2940:53: (iv_ruleELoopControl= ruleELoopControl EOF )
            // InternalAnsibleDsl.g:2941:2: iv_ruleELoopControl= ruleELoopControl EOF
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
    // InternalAnsibleDsl.g:2947:1: ruleELoopControl returns [EObject current=null] : ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:2953:2: ( ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:2954:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:2954:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:2955:3: () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:2955:3: ()
            // InternalAnsibleDsl.g:2956:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getELoopControlAccess().getELoopControlAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,94,FOLLOW_89); 

            			newLeafNode(otherlv_1, grammarAccess.getELoopControlAccess().getLoop_controlKeyword_1());
            		
            // InternalAnsibleDsl.g:2966:3: (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==95) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAnsibleDsl.g:2967:4: otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) )
                    {
                    otherlv_2=(Token)match(input,95,FOLLOW_58); 

                    				newLeafNode(otherlv_2, grammarAccess.getELoopControlAccess().getLabelKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2971:4: ( (lv_label_3_0= ruleEValuePassed ) )
                    // InternalAnsibleDsl.g:2972:5: (lv_label_3_0= ruleEValuePassed )
                    {
                    // InternalAnsibleDsl.g:2972:5: (lv_label_3_0= ruleEValuePassed )
                    // InternalAnsibleDsl.g:2973:6: lv_label_3_0= ruleEValuePassed
                    {

                    						newCompositeNode(grammarAccess.getELoopControlAccess().getLabelEValuePassedParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_90);
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

            // InternalAnsibleDsl.g:2991:3: (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==96) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAnsibleDsl.g:2992:4: otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,96,FOLLOW_91); 

                    				newLeafNode(otherlv_4, grammarAccess.getELoopControlAccess().getPauseKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2996:4: ( (lv_pause_5_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:2997:5: (lv_pause_5_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:2997:5: (lv_pause_5_0= RULE_INT )
                    // InternalAnsibleDsl.g:2998:6: lv_pause_5_0= RULE_INT
                    {
                    lv_pause_5_0=(Token)match(input,RULE_INT,FOLLOW_92); 

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

            // InternalAnsibleDsl.g:3015:3: (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==97) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAnsibleDsl.g:3016:4: otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,97,FOLLOW_54); 

                    				newLeafNode(otherlv_6, grammarAccess.getELoopControlAccess().getIndex_varKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3020:4: ( (lv_index_var_7_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:3021:5: (lv_index_var_7_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:3021:5: (lv_index_var_7_0= RULE_ID )
                    // InternalAnsibleDsl.g:3022:6: lv_index_var_7_0= RULE_ID
                    {
                    lv_index_var_7_0=(Token)match(input,RULE_ID,FOLLOW_93); 

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

            // InternalAnsibleDsl.g:3039:3: (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==98) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAnsibleDsl.g:3040:4: otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,98,FOLLOW_54); 

                    				newLeafNode(otherlv_8, grammarAccess.getELoopControlAccess().getLoop_varKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3044:4: ( (lv_loop_var_9_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:3045:5: (lv_loop_var_9_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:3045:5: (lv_loop_var_9_0= RULE_ID )
                    // InternalAnsibleDsl.g:3046:6: lv_loop_var_9_0= RULE_ID
                    {
                    lv_loop_var_9_0=(Token)match(input,RULE_ID,FOLLOW_94); 

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

            // InternalAnsibleDsl.g:3063:3: (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==99) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAnsibleDsl.g:3064:4: otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    {
                    otherlv_10=(Token)match(input,99,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getELoopControlAccess().getExtendedKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3068:4: ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3069:5: (lv_extended_11_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3069:5: (lv_extended_11_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3070:6: lv_extended_11_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:3095:1: entryRuleEUntil returns [EObject current=null] : iv_ruleEUntil= ruleEUntil EOF ;
    public final EObject entryRuleEUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUntil = null;


        try {
            // InternalAnsibleDsl.g:3095:47: (iv_ruleEUntil= ruleEUntil EOF )
            // InternalAnsibleDsl.g:3096:2: iv_ruleEUntil= ruleEUntil EOF
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
    // InternalAnsibleDsl.g:3102:1: ruleEUntil returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalAnsibleDsl.g:3108:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:3109:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:3109:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:3110:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:3110:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:3111:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEUntilAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3114:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:3115:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:3115:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) ) )+
            int cnt72=0;
            loop72:
            do {
                int alt72=4;
                int LA72_0 = input.LA(1);

                if ( LA72_0 == 100 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
                    alt72=1;
                }
                else if ( LA72_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
                    alt72=2;
                }
                else if ( LA72_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
                    alt72=3;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3116:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3116:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3117:4: {...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3117:100: ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) ) )
            	    // InternalAnsibleDsl.g:3118:5: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3121:8: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) ) )
            	    // InternalAnsibleDsl.g:3121:9: {...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3121:18: (otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) ) )
            	    // InternalAnsibleDsl.g:3121:19: otherlv_1= 'until:' ( (lv_until_2_0= ruleEConditionalExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,100,FOLLOW_41); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEUntilAccess().getUntilKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3125:8: ( (lv_until_2_0= ruleEConditionalExpression ) )
            	    // InternalAnsibleDsl.g:3126:9: (lv_until_2_0= ruleEConditionalExpression )
            	    {
            	    // InternalAnsibleDsl.g:3126:9: (lv_until_2_0= ruleEConditionalExpression )
            	    // InternalAnsibleDsl.g:3127:10: lv_until_2_0= ruleEConditionalExpression
            	    {

            	    										newCompositeNode(grammarAccess.getEUntilAccess().getUntilEConditionalExpressionParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_95);
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
            	    // InternalAnsibleDsl.g:3150:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3150:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3151:4: {...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3151:100: ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:3152:5: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3155:8: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:3155:9: {...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3155:18: (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:3155:19: otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,101,FOLLOW_91); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEUntilAccess().getRetriesKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3159:8: ( (lv_retries_4_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:3160:9: (lv_retries_4_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:3160:9: (lv_retries_4_0= RULE_INT )
            	    // InternalAnsibleDsl.g:3161:10: lv_retries_4_0= RULE_INT
            	    {
            	    lv_retries_4_0=(Token)match(input,RULE_INT,FOLLOW_95); 

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
            	    // InternalAnsibleDsl.g:3183:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3183:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3184:4: {...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3184:100: ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:3185:5: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3188:8: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:3188:9: {...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3188:18: (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:3188:19: otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,102,FOLLOW_91); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEUntilAccess().getDelayKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3192:8: ( (lv_delay_6_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:3193:9: (lv_delay_6_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:3193:9: (lv_delay_6_0= RULE_INT )
            	    // InternalAnsibleDsl.g:3194:10: lv_delay_6_0= RULE_INT
            	    {
            	    lv_delay_6_0=(Token)match(input,RULE_INT,FOLLOW_95); 

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
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
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
    // InternalAnsibleDsl.g:3227:1: entryRuleEPrivilageEscalation returns [EObject current=null] : iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF ;
    public final EObject entryRuleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrivilageEscalation = null;


        try {
            // InternalAnsibleDsl.g:3227:61: (iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF )
            // InternalAnsibleDsl.g:3228:2: iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF
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
    // InternalAnsibleDsl.g:3234:1: ruleEPrivilageEscalation returns [EObject current=null] : ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:3240:2: ( ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:3241:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:3241:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:3242:3: () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:3242:3: ()
            // InternalAnsibleDsl.g:3243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPrivilageEscalationAccess().getEPrivilageEscalationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_96); 

            			newLeafNode(otherlv_1, grammarAccess.getEPrivilageEscalationAccess().getPrivilage_escalationKeyword_1());
            		
            // InternalAnsibleDsl.g:3253:3: (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==104) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAnsibleDsl.g:3254:4: otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,104,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getEPrivilageEscalationAccess().getBecomeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3258:4: ( (lv_become_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3259:5: (lv_become_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3259:5: (lv_become_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3260:6: lv_become_3_0= RULE_BOOLEAN
                    {
                    lv_become_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_97); 

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

            // InternalAnsibleDsl.g:3277:3: (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==105) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAnsibleDsl.g:3278:4: otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,105,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPrivilageEscalationAccess().getBecome_exeKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3282:4: ( (lv_become_exe_5_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3283:5: (lv_become_exe_5_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3283:5: (lv_become_exe_5_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3284:6: lv_become_exe_5_0= RULE_STRING
                    {
                    lv_become_exe_5_0=(Token)match(input,RULE_STRING,FOLLOW_98); 

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

            // InternalAnsibleDsl.g:3301:3: (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==106) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAnsibleDsl.g:3302:4: otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,106,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3306:4: ( (lv_become_flags_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3307:5: (lv_become_flags_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3307:5: (lv_become_flags_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3308:6: lv_become_flags_7_0= RULE_STRING
                    {
                    lv_become_flags_7_0=(Token)match(input,RULE_STRING,FOLLOW_99); 

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

            // InternalAnsibleDsl.g:3325:3: (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==107) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAnsibleDsl.g:3326:4: otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,107,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPrivilageEscalationAccess().getBecome_methodKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3330:4: ( (lv_become_method_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3331:5: (lv_become_method_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3331:5: (lv_become_method_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3332:6: lv_become_method_9_0= RULE_STRING
                    {
                    lv_become_method_9_0=(Token)match(input,RULE_STRING,FOLLOW_100); 

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

            // InternalAnsibleDsl.g:3349:3: (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==108) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAnsibleDsl.g:3350:4: otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,108,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEPrivilageEscalationAccess().getBecome_userKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3354:4: ( (lv_become_user_11_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3355:5: (lv_become_user_11_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3355:5: (lv_become_user_11_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3356:6: lv_become_user_11_0= RULE_STRING
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
    // InternalAnsibleDsl.g:3381:1: entryRuleEValidationMode returns [EObject current=null] : iv_ruleEValidationMode= ruleEValidationMode EOF ;
    public final EObject entryRuleEValidationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidationMode = null;


        try {
            // InternalAnsibleDsl.g:3381:56: (iv_ruleEValidationMode= ruleEValidationMode EOF )
            // InternalAnsibleDsl.g:3382:2: iv_ruleEValidationMode= ruleEValidationMode EOF
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
    // InternalAnsibleDsl.g:3388:1: ruleEValidationMode returns [EObject current=null] : ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) ;
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
            // InternalAnsibleDsl.g:3394:2: ( ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) )
            // InternalAnsibleDsl.g:3395:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            {
            // InternalAnsibleDsl.g:3395:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            // InternalAnsibleDsl.g:3396:3: () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}'
            {
            // InternalAnsibleDsl.g:3396:3: ()
            // InternalAnsibleDsl.g:3397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEValidationModeAccess().getEValidationModeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,109,FOLLOW_101); 

            			newLeafNode(otherlv_1, grammarAccess.getEValidationModeAccess().getValidation_modeKeyword_1());
            		
            // InternalAnsibleDsl.g:3407:3: (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==110) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAnsibleDsl.g:3408:4: otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,110,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getEValidationModeAccess().getCheck_modeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3412:4: ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3413:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3413:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3414:6: lv_check_mode_3_0= RULE_BOOLEAN
                    {
                    lv_check_mode_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_102); 

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

            // InternalAnsibleDsl.g:3431:3: (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==111) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalAnsibleDsl.g:3432:4: otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    {
                    otherlv_4=(Token)match(input,111,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getEValidationModeAccess().getDiffKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3436:4: ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3437:5: (lv_diff_5_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3437:5: (lv_diff_5_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3438:6: lv_diff_5_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:3463:1: entryRuleEConnection returns [EObject current=null] : iv_ruleEConnection= ruleEConnection EOF ;
    public final EObject entryRuleEConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConnection = null;


        try {
            // InternalAnsibleDsl.g:3463:52: (iv_ruleEConnection= ruleEConnection EOF )
            // InternalAnsibleDsl.g:3464:2: iv_ruleEConnection= ruleEConnection EOF
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
    // InternalAnsibleDsl.g:3470:1: ruleEConnection returns [EObject current=null] : ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) ;
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
            // InternalAnsibleDsl.g:3476:2: ( ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) )
            // InternalAnsibleDsl.g:3477:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            {
            // InternalAnsibleDsl.g:3477:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            // InternalAnsibleDsl.g:3478:3: () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}'
            {
            // InternalAnsibleDsl.g:3478:3: ()
            // InternalAnsibleDsl.g:3479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConnectionAccess().getEConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,112,FOLLOW_103); 

            			newLeafNode(otherlv_1, grammarAccess.getEConnectionAccess().getConnection_infoKeyword_1());
            		
            // InternalAnsibleDsl.g:3489:3: (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==113) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalAnsibleDsl.g:3490:4: otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,113,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEConnectionAccess().getConnectionKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3494:4: ( (lv_connection_3_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3495:5: (lv_connection_3_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3495:5: (lv_connection_3_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3496:6: lv_connection_3_0= RULE_STRING
                    {
                    lv_connection_3_0=(Token)match(input,RULE_STRING,FOLLOW_104); 

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

            // InternalAnsibleDsl.g:3513:3: (otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==114) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalAnsibleDsl.g:3514:4: otherlv_4= 'port:' ( (lv_port_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,114,FOLLOW_91); 

                    				newLeafNode(otherlv_4, grammarAccess.getEConnectionAccess().getPortKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3518:4: ( (lv_port_5_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:3519:5: (lv_port_5_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:3519:5: (lv_port_5_0= RULE_INT )
                    // InternalAnsibleDsl.g:3520:6: lv_port_5_0= RULE_INT
                    {
                    lv_port_5_0=(Token)match(input,RULE_INT,FOLLOW_105); 

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

            // InternalAnsibleDsl.g:3537:3: (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==115) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAnsibleDsl.g:3538:4: otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,115,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEConnectionAccess().getRemote_userKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3542:4: ( (lv_remote_user_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3543:5: (lv_remote_user_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3543:5: (lv_remote_user_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3544:6: lv_remote_user_7_0= RULE_STRING
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
    // InternalAnsibleDsl.g:3569:1: entryRuleEPlayExeSettings returns [EObject current=null] : iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF ;
    public final EObject entryRuleEPlayExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayExeSettings = null;


        try {
            // InternalAnsibleDsl.g:3569:57: (iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF )
            // InternalAnsibleDsl.g:3570:2: iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF
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
    // InternalAnsibleDsl.g:3576:1: ruleEPlayExeSettings returns [EObject current=null] : ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:3582:2: ( ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:3583:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:3583:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:3584:3: () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:3584:3: ()
            // InternalAnsibleDsl.g:3585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayExeSettingsAccess().getEPlayExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:3591:3: (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==116) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAnsibleDsl.g:3592:4: otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,116,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayExeSettingsAccess().getStrategyKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:3596:4: ( (lv_strategy_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3597:5: (lv_strategy_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3597:5: (lv_strategy_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3598:6: lv_strategy_2_0= RULE_STRING
                    {
                    lv_strategy_2_0=(Token)match(input,RULE_STRING,FOLLOW_106); 

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

            // InternalAnsibleDsl.g:3615:3: (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==117) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalAnsibleDsl.g:3616:4: otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) )
                    {
                    otherlv_3=(Token)match(input,117,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayExeSettingsAccess().getSerialKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3620:4: ( (lv_serial_list_4_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3621:5: (lv_serial_list_4_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3621:5: (lv_serial_list_4_0= ruleEList )
                    // InternalAnsibleDsl.g:3622:6: lv_serial_list_4_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getSerial_listEListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_107);
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

            // InternalAnsibleDsl.g:3640:3: (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==118) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAnsibleDsl.g:3641:4: otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,118,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayExeSettingsAccess().getOrderKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3645:4: ( (lv_order_6_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3646:5: (lv_order_6_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3646:5: (lv_order_6_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3647:6: lv_order_6_0= RULE_STRING
                    {
                    lv_order_6_0=(Token)match(input,RULE_STRING,FOLLOW_108); 

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

            // InternalAnsibleDsl.g:3664:3: (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==119) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAnsibleDsl.g:3665:4: otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,119,FOLLOW_91); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayExeSettingsAccess().getThrottleKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3669:4: ( (lv_throttle_8_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:3670:5: (lv_throttle_8_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:3670:5: (lv_throttle_8_0= RULE_INT )
                    // InternalAnsibleDsl.g:3671:6: lv_throttle_8_0= RULE_INT
                    {
                    lv_throttle_8_0=(Token)match(input,RULE_INT,FOLLOW_109); 

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

            // InternalAnsibleDsl.g:3688:3: (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==120) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAnsibleDsl.g:3689:4: otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,120,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getEPlayExeSettingsAccess().getRun_onceKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3693:4: ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3694:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3694:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3695:6: lv_run_once_10_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:3716:1: entryRuleEExecutionExeSettings returns [EObject current=null] : iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF ;
    public final EObject entryRuleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionExeSettings = null;


        try {
            // InternalAnsibleDsl.g:3716:62: (iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF )
            // InternalAnsibleDsl.g:3717:2: iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF
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
    // InternalAnsibleDsl.g:3723:1: ruleEExecutionExeSettings returns [EObject current=null] : ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_throttle_2_0=null;
        Token otherlv_3=null;
        Token lv_run_once_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:3729:2: ( ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:3730:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:3730:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:3731:3: () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:3731:3: ()
            // InternalAnsibleDsl.g:3732:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEExecutionExeSettingsAccess().getEExecutionExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:3738:3: (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==119) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalAnsibleDsl.g:3739:4: otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,119,FOLLOW_91); 

                    				newLeafNode(otherlv_1, grammarAccess.getEExecutionExeSettingsAccess().getThrottleKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:3743:4: ( (lv_throttle_2_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:3744:5: (lv_throttle_2_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:3744:5: (lv_throttle_2_0= RULE_INT )
                    // InternalAnsibleDsl.g:3745:6: lv_throttle_2_0= RULE_INT
                    {
                    lv_throttle_2_0=(Token)match(input,RULE_INT,FOLLOW_109); 

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

            // InternalAnsibleDsl.g:3762:3: (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==120) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalAnsibleDsl.g:3763:4: otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,120,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEExecutionExeSettingsAccess().getRun_onceKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3767:4: ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3768:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3768:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3769:6: lv_run_once_4_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:3790:1: entryRuleEBlockErrorHandling returns [EObject current=null] : iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF ;
    public final EObject entryRuleEBlockErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:3790:60: (iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF )
            // InternalAnsibleDsl.g:3791:2: iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF
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
    // InternalAnsibleDsl.g:3797:1: ruleEBlockErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:3803:2: ( ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:3804:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:3804:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:3805:3: () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:3805:3: ()
            // InternalAnsibleDsl.g:3806:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBlockErrorHandlingAccess().getEBlockErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:3812:3: (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==121) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAnsibleDsl.g:3813:4: otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    {
                    otherlv_1=(Token)match(input,121,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:3817:4: ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3818:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3818:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3819:6: lv_any_errors_fatal_2_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_110); 

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

            // InternalAnsibleDsl.g:3836:3: (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==122) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalAnsibleDsl.g:3837:4: otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,122,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3841:4: ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3842:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3842:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3843:6: lv_ignore_errors_4_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_111); 

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

            // InternalAnsibleDsl.g:3860:3: (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==123) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalAnsibleDsl.g:3861:4: otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,123,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3865:4: ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3866:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3866:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3867:6: lv_ignore_unreachable_6_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:3888:1: entryRuleEPlayErrorHandling returns [EObject current=null] : iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF ;
    public final EObject entryRuleEPlayErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:3888:59: (iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF )
            // InternalAnsibleDsl.g:3889:2: iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF
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
    // InternalAnsibleDsl.g:3895:1: ruleEPlayErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:3901:2: ( ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:3902:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:3902:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:3903:3: () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:3903:3: ()
            // InternalAnsibleDsl.g:3904:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayErrorHandlingAccess().getEPlayErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:3910:3: (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==124) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalAnsibleDsl.g:3911:4: otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,124,FOLLOW_91); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:3915:4: ( (lv_max_fail_percentage_2_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:3916:5: (lv_max_fail_percentage_2_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:3916:5: (lv_max_fail_percentage_2_0= RULE_INT )
                    // InternalAnsibleDsl.g:3917:6: lv_max_fail_percentage_2_0= RULE_INT
                    {
                    lv_max_fail_percentage_2_0=(Token)match(input,RULE_INT,FOLLOW_112); 

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

            // InternalAnsibleDsl.g:3934:3: (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==121) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalAnsibleDsl.g:3935:4: otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,121,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3939:4: ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3940:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3940:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3941:6: lv_any_errors_fatal_4_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_110); 

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

            // InternalAnsibleDsl.g:3958:3: (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==122) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalAnsibleDsl.g:3959:4: otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,122,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3963:4: ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3964:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3964:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3965:6: lv_ignore_errors_6_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_111); 

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

            // InternalAnsibleDsl.g:3982:3: (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==123) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAnsibleDsl.g:3983:4: otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,123,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3987:4: ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3988:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3988:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3989:6: lv_ignore_unreachable_8_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4010:1: entryRuleETaskHandlerErrorHandling returns [EObject current=null] : iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF ;
    public final EObject entryRuleETaskHandlerErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4010:66: (iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF )
            // InternalAnsibleDsl.g:4011:2: iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF
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
    // InternalAnsibleDsl.g:4017:1: ruleETaskHandlerErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4023:2: ( ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4024:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4024:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4025:3: () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4025:3: ()
            // InternalAnsibleDsl.g:4026:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETaskHandlerErrorHandlingAccess().getETaskHandlerErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4032:3: (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==125) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalAnsibleDsl.g:4033:4: otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEConditionalExpression ) )
                    {
                    otherlv_1=(Token)match(input,125,FOLLOW_41); 

                    				newLeafNode(otherlv_1, grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4037:4: ( (lv_changed_when_2_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:4038:5: (lv_changed_when_2_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:4038:5: (lv_changed_when_2_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:4039:6: lv_changed_when_2_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenEConditionalExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_113);
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

            // InternalAnsibleDsl.g:4057:3: (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==126) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalAnsibleDsl.g:4058:4: otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEConditionalExpression ) )
                    {
                    otherlv_3=(Token)match(input,126,FOLLOW_41); 

                    				newLeafNode(otherlv_3, grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4062:4: ( (lv_failed_when_4_0= ruleEConditionalExpression ) )
                    // InternalAnsibleDsl.g:4063:5: (lv_failed_when_4_0= ruleEConditionalExpression )
                    {
                    // InternalAnsibleDsl.g:4063:5: (lv_failed_when_4_0= ruleEConditionalExpression )
                    // InternalAnsibleDsl.g:4064:6: lv_failed_when_4_0= ruleEConditionalExpression
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenEConditionalExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_112);
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

            // InternalAnsibleDsl.g:4082:3: (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==121) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalAnsibleDsl.g:4083:4: otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,121,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4087:4: ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4088:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4088:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4089:6: lv_any_errors_fatal_6_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_110); 

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

            // InternalAnsibleDsl.g:4106:3: (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==122) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalAnsibleDsl.g:4107:4: otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,122,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4111:4: ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4112:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4112:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4113:6: lv_ignore_errors_8_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_111); 

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

            // InternalAnsibleDsl.g:4130:3: (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==123) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalAnsibleDsl.g:4131:4: otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,123,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4135:4: ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4136:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4136:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4137:6: lv_ignore_unreachable_10_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4158:1: entryRuleEBaseCommonKeywords returns [EObject current=null] : iv_ruleEBaseCommonKeywords= ruleEBaseCommonKeywords EOF ;
    public final EObject entryRuleEBaseCommonKeywords() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBaseCommonKeywords = null;


        try {
            // InternalAnsibleDsl.g:4158:60: (iv_ruleEBaseCommonKeywords= ruleEBaseCommonKeywords EOF )
            // InternalAnsibleDsl.g:4159:2: iv_ruleEBaseCommonKeywords= ruleEBaseCommonKeywords EOF
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
    // InternalAnsibleDsl.g:4165:1: ruleEBaseCommonKeywords returns [EObject current=null] : ( () ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_2_0= ruleEValidationMode ) )? ( (lv_connection_3_0= ruleEConnection ) )? (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )? (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )? (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )? (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )? (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )? (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )? (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )? ) ;
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
            // InternalAnsibleDsl.g:4171:2: ( ( () ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_2_0= ruleEValidationMode ) )? ( (lv_connection_3_0= ruleEConnection ) )? (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )? (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )? (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )? (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )? (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )? (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )? (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )? ) )
            // InternalAnsibleDsl.g:4172:2: ( () ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_2_0= ruleEValidationMode ) )? ( (lv_connection_3_0= ruleEConnection ) )? (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )? (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )? (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )? (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )? (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )? (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )? (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )? )
            {
            // InternalAnsibleDsl.g:4172:2: ( () ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_2_0= ruleEValidationMode ) )? ( (lv_connection_3_0= ruleEConnection ) )? (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )? (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )? (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )? (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )? (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )? (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )? (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )? )
            // InternalAnsibleDsl.g:4173:3: () ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_2_0= ruleEValidationMode ) )? ( (lv_connection_3_0= ruleEConnection ) )? (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )? (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )? (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )? (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )? (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )? (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )? (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )?
            {
            // InternalAnsibleDsl.g:4173:3: ()
            // InternalAnsibleDsl.g:4174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBaseCommonKeywordsAccess().getEBaseCommonKeywordsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4180:3: ( (lv_privilage_escalation_1_0= ruleEPrivilageEscalation ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==103) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalAnsibleDsl.g:4181:4: (lv_privilage_escalation_1_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:4181:4: (lv_privilage_escalation_1_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:4182:5: lv_privilage_escalation_1_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_114);
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

            // InternalAnsibleDsl.g:4199:3: ( (lv_validation_mode_2_0= ruleEValidationMode ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==109) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalAnsibleDsl.g:4200:4: (lv_validation_mode_2_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:4200:4: (lv_validation_mode_2_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:4201:5: lv_validation_mode_2_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getValidation_modeEValidationModeParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_115);
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

            // InternalAnsibleDsl.g:4218:3: ( (lv_connection_3_0= ruleEConnection ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==112) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalAnsibleDsl.g:4219:4: (lv_connection_3_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:4219:4: (lv_connection_3_0= ruleEConnection )
                    // InternalAnsibleDsl.g:4220:5: lv_connection_3_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getConnectionEConnectionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_116);
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

            // InternalAnsibleDsl.g:4237:3: (otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==127) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalAnsibleDsl.g:4238:4: otherlv_4= 'no_log:' ( (lv_no_log_5_0= RULE_BOOLEAN ) )
                    {
                    otherlv_4=(Token)match(input,127,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getEBaseCommonKeywordsAccess().getNo_logKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4242:4: ( (lv_no_log_5_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4243:5: (lv_no_log_5_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4243:5: (lv_no_log_5_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4244:6: lv_no_log_5_0= RULE_BOOLEAN
                    {
                    lv_no_log_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_117); 

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

            // InternalAnsibleDsl.g:4261:3: (otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==128) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalAnsibleDsl.g:4262:4: otherlv_6= 'debugger:' ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) )
                    {
                    otherlv_6=(Token)match(input,128,FOLLOW_118); 

                    				newLeafNode(otherlv_6, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4266:4: ( ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:4267:5: ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:4267:5: ( (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:4268:6: (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:4268:6: (lv_debugger_7_1= 'always' | lv_debugger_7_2= 'never' | lv_debugger_7_3= 'on_failed' | lv_debugger_7_4= 'on_unreachable' | lv_debugger_7_5= 'on_skipped' )
                    int alt106=5;
                    switch ( input.LA(1) ) {
                    case 129:
                        {
                        alt106=1;
                        }
                        break;
                    case 130:
                        {
                        alt106=2;
                        }
                        break;
                    case 131:
                        {
                        alt106=3;
                        }
                        break;
                    case 132:
                        {
                        alt106=4;
                        }
                        break;
                    case 133:
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
                            // InternalAnsibleDsl.g:4269:7: lv_debugger_7_1= 'always'
                            {
                            lv_debugger_7_1=(Token)match(input,129,FOLLOW_119); 

                            							newLeafNode(lv_debugger_7_1, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerAlwaysKeyword_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBaseCommonKeywordsRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:4280:7: lv_debugger_7_2= 'never'
                            {
                            lv_debugger_7_2=(Token)match(input,130,FOLLOW_119); 

                            							newLeafNode(lv_debugger_7_2, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerNeverKeyword_5_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBaseCommonKeywordsRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_7_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:4291:7: lv_debugger_7_3= 'on_failed'
                            {
                            lv_debugger_7_3=(Token)match(input,131,FOLLOW_119); 

                            							newLeafNode(lv_debugger_7_3, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerOn_failedKeyword_5_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBaseCommonKeywordsRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_7_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:4302:7: lv_debugger_7_4= 'on_unreachable'
                            {
                            lv_debugger_7_4=(Token)match(input,132,FOLLOW_119); 

                            							newLeafNode(lv_debugger_7_4, grammarAccess.getEBaseCommonKeywordsAccess().getDebuggerOn_unreachableKeyword_5_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBaseCommonKeywordsRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_7_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:4313:7: lv_debugger_7_5= 'on_skipped'
                            {
                            lv_debugger_7_5=(Token)match(input,133,FOLLOW_119); 

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

            // InternalAnsibleDsl.g:4327:3: (otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==134) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalAnsibleDsl.g:4328:4: otherlv_8= 'module_defaults:' ( (lv_module_defaults_9_0= ruleEList ) )
                    {
                    otherlv_8=(Token)match(input,134,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getEBaseCommonKeywordsAccess().getModule_defaultsKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:4332:4: ( (lv_module_defaults_9_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4333:5: (lv_module_defaults_9_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4333:5: (lv_module_defaults_9_0= ruleEList )
                    // InternalAnsibleDsl.g:4334:6: lv_module_defaults_9_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getModule_defaultsEListParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_120);
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

            // InternalAnsibleDsl.g:4352:3: (otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==135) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalAnsibleDsl.g:4353:4: otherlv_10= 'environment:' ( (lv_environment_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,135,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getEBaseCommonKeywordsAccess().getEnvironmentKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:4357:4: ( (lv_environment_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4358:5: (lv_environment_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4358:5: (lv_environment_11_0= ruleEList )
                    // InternalAnsibleDsl.g:4359:6: lv_environment_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getEnvironmentEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_121);
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

            // InternalAnsibleDsl.g:4377:3: (otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==136) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalAnsibleDsl.g:4378:4: otherlv_12= 'collections:' ( (lv_collections_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,136,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getEBaseCommonKeywordsAccess().getCollectionsKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:4382:4: ( (lv_collections_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4383:5: (lv_collections_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4383:5: (lv_collections_13_0= ruleEList )
                    // InternalAnsibleDsl.g:4384:6: lv_collections_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getCollectionsEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_122);
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

            // InternalAnsibleDsl.g:4402:3: (otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) ) )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==137) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // InternalAnsibleDsl.g:4403:4: otherlv_14= 'tags:' ( (lv_tags_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,137,FOLLOW_16); 

                    				newLeafNode(otherlv_14, grammarAccess.getEBaseCommonKeywordsAccess().getTagsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:4407:4: ( (lv_tags_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4408:5: (lv_tags_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4408:5: (lv_tags_15_0= ruleEList )
                    // InternalAnsibleDsl.g:4409:6: lv_tags_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getTagsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_123);
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

            // InternalAnsibleDsl.g:4427:3: (otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}' )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==74) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalAnsibleDsl.g:4428:4: otherlv_16= 'vars{' ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) ) (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )* otherlv_20= '}'
                    {
                    otherlv_16=(Token)match(input,74,FOLLOW_54); 

                    				newLeafNode(otherlv_16, grammarAccess.getEBaseCommonKeywordsAccess().getVarsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:4432:4: ( (lv_variable_declarations_17_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:4433:5: (lv_variable_declarations_17_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:4433:5: (lv_variable_declarations_17_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:4434:6: lv_variable_declarations_17_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_65);
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

                    // InternalAnsibleDsl.g:4451:4: (otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==71) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:4452:5: otherlv_18= ',' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_18=(Token)match(input,71,FOLLOW_54); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getEBaseCommonKeywordsAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:4456:5: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:4457:6: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:4457:6: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:4458:7: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBaseCommonKeywordsAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_65);
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
                    	    break loop112;
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
    // InternalAnsibleDsl.g:4485:1: entryRuleEFactsSettings returns [EObject current=null] : iv_ruleEFactsSettings= ruleEFactsSettings EOF ;
    public final EObject entryRuleEFactsSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactsSettings = null;


        try {
            // InternalAnsibleDsl.g:4485:55: (iv_ruleEFactsSettings= ruleEFactsSettings EOF )
            // InternalAnsibleDsl.g:4486:2: iv_ruleEFactsSettings= ruleEFactsSettings EOF
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
    // InternalAnsibleDsl.g:4492:1: ruleEFactsSettings returns [EObject current=null] : ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // InternalAnsibleDsl.g:4498:2: ( ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalAnsibleDsl.g:4499:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalAnsibleDsl.g:4499:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalAnsibleDsl.g:4500:3: () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // InternalAnsibleDsl.g:4500:3: ()
            // InternalAnsibleDsl.g:4501:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactsSettingsAccess().getEFactsSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,138,FOLLOW_124); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactsSettingsAccess().getFacts_setttingsKeyword_1());
            		
            // InternalAnsibleDsl.g:4511:3: (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==139) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalAnsibleDsl.g:4512:4: otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,139,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getEFactsSettingsAccess().getGather_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4516:4: ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4517:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4517:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4518:6: lv_gather_facts_3_0= RULE_BOOLEAN
                    {
                    lv_gather_facts_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_125); 

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

            // InternalAnsibleDsl.g:4535:3: (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==140) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalAnsibleDsl.g:4536:4: otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) )
                    {
                    otherlv_4=(Token)match(input,140,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEFactsSettingsAccess().getGather_subsetKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4540:4: ( (lv_gather_subset_5_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4541:5: (lv_gather_subset_5_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4541:5: (lv_gather_subset_5_0= ruleEList )
                    // InternalAnsibleDsl.g:4542:6: lv_gather_subset_5_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEFactsSettingsAccess().getGather_subsetEListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_126);
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

            // InternalAnsibleDsl.g:4560:3: (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==141) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalAnsibleDsl.g:4561:4: otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,141,FOLLOW_91); 

                    				newLeafNode(otherlv_6, grammarAccess.getEFactsSettingsAccess().getGather_timeoutKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4565:4: ( (lv_gather_timeout_7_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:4566:5: (lv_gather_timeout_7_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:4566:5: (lv_gather_timeout_7_0= RULE_INT )
                    // InternalAnsibleDsl.g:4567:6: lv_gather_timeout_7_0= RULE_INT
                    {
                    lv_gather_timeout_7_0=(Token)match(input,RULE_INT,FOLLOW_127); 

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

            // InternalAnsibleDsl.g:4584:3: (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==142) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalAnsibleDsl.g:4585:4: otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,142,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEFactsSettingsAccess().getFact_pathKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4589:4: ( (lv_fact_path_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4590:5: (lv_fact_path_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4590:5: (lv_fact_path_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4591:6: lv_fact_path_9_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4616:1: entryRuleEDelegation returns [EObject current=null] : iv_ruleEDelegation= ruleEDelegation EOF ;
    public final EObject entryRuleEDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDelegation = null;


        try {
            // InternalAnsibleDsl.g:4616:52: (iv_ruleEDelegation= ruleEDelegation EOF )
            // InternalAnsibleDsl.g:4617:2: iv_ruleEDelegation= ruleEDelegation EOF
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
    // InternalAnsibleDsl.g:4623:1: ruleEDelegation returns [EObject current=null] : (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) ;
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
            // InternalAnsibleDsl.g:4629:2: ( (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) )
            // InternalAnsibleDsl.g:4630:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            {
            // InternalAnsibleDsl.g:4630:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            // InternalAnsibleDsl.g:4631:3: otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,143,FOLLOW_128); 

            			newLeafNode(otherlv_0, grammarAccess.getEDelegationAccess().getDelegationKeyword_0());
            		
            // InternalAnsibleDsl.g:4635:3: (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4636:4: otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,144,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEDelegationAccess().getDelegate_toKeyword_1_0());
            			
            // InternalAnsibleDsl.g:4640:4: ( (lv_delegate_to_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4641:5: (lv_delegate_to_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4641:5: (lv_delegate_to_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:4642:6: lv_delegate_to_2_0= RULE_STRING
            {
            lv_delegate_to_2_0=(Token)match(input,RULE_STRING,FOLLOW_129); 

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

            // InternalAnsibleDsl.g:4659:3: (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==145) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalAnsibleDsl.g:4660:4: otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,145,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEDelegationAccess().getDelegate_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4664:4: ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4665:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4665:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4666:6: lv_delegate_facts_4_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4691:1: entryRuleEAsynchronousSettings returns [EObject current=null] : iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF ;
    public final EObject entryRuleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAsynchronousSettings = null;


        try {
            // InternalAnsibleDsl.g:4691:62: (iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF )
            // InternalAnsibleDsl.g:4692:2: iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF
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
    // InternalAnsibleDsl.g:4698:1: ruleEAsynchronousSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_async_2_0=null;
        Token otherlv_3=null;
        Token lv_poll_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4704:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:4705:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:4705:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:4706:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:4706:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:4707:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4710:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:4711:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:4711:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) ) )+
            int cnt119=0;
            loop119:
            do {
                int alt119=3;
                int LA119_0 = input.LA(1);

                if ( LA119_0 == 146 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt119=1;
                }
                else if ( LA119_0 == 147 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt119=2;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4712:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4712:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4713:4: {...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4713:115: ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:4714:5: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4717:8: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:4717:9: {...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4717:18: (otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:4717:19: otherlv_1= 'async:' ( (lv_async_2_0= RULE_INT ) )
            	    {
            	    otherlv_1=(Token)match(input,146,FOLLOW_91); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAsynchronousSettingsAccess().getAsyncKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4721:8: ( (lv_async_2_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:4722:9: (lv_async_2_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:4722:9: (lv_async_2_0= RULE_INT )
            	    // InternalAnsibleDsl.g:4723:10: lv_async_2_0= RULE_INT
            	    {
            	    lv_async_2_0=(Token)match(input,RULE_INT,FOLLOW_130); 

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
            	    // InternalAnsibleDsl.g:4745:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4745:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4746:4: {...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4746:115: ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) ) )
            	    // InternalAnsibleDsl.g:4747:5: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4750:8: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) ) )
            	    // InternalAnsibleDsl.g:4750:9: {...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4750:18: (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) ) )
            	    // InternalAnsibleDsl.g:4750:19: otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,147,FOLLOW_91); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAsynchronousSettingsAccess().getPollKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4754:8: ( (lv_poll_4_0= RULE_INT ) )
            	    // InternalAnsibleDsl.g:4755:9: (lv_poll_4_0= RULE_INT )
            	    {
            	    // InternalAnsibleDsl.g:4755:9: (lv_poll_4_0= RULE_INT )
            	    // InternalAnsibleDsl.g:4756:10: lv_poll_4_0= RULE_INT
            	    {
            	    lv_poll_4_0=(Token)match(input,RULE_INT,FOLLOW_130); 

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
            	    if ( cnt119 >= 1 ) break loop119;
                        EarlyExitException eee =
                            new EarlyExitException(119, input);
                        throw eee;
                }
                cnt119++;
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
    // InternalAnsibleDsl.g:4789:1: entryRuleENotifiable returns [EObject current=null] : iv_ruleENotifiable= ruleENotifiable EOF ;
    public final EObject entryRuleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiable = null;


        try {
            // InternalAnsibleDsl.g:4789:52: (iv_ruleENotifiable= ruleENotifiable EOF )
            // InternalAnsibleDsl.g:4790:2: iv_ruleENotifiable= ruleENotifiable EOF
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
    // InternalAnsibleDsl.g:4796:1: ruleENotifiable returns [EObject current=null] : (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) ;
    public final EObject ruleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject this_ENotifiedHandler_0 = null;

        EObject this_ENotifiedTopic_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4802:2: ( (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) )
            // InternalAnsibleDsl.g:4803:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            {
            // InternalAnsibleDsl.g:4803:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_STRING) ) {
                alt120=1;
            }
            else if ( (LA120_0==148) ) {
                alt120=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalAnsibleDsl.g:4804:3: this_ENotifiedHandler_0= ruleENotifiedHandler
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
                    // InternalAnsibleDsl.g:4813:3: this_ENotifiedTopic_1= ruleENotifiedTopic
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
    // InternalAnsibleDsl.g:4825:1: entryRuleENotifiedHandler returns [EObject current=null] : iv_ruleENotifiedHandler= ruleENotifiedHandler EOF ;
    public final EObject entryRuleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedHandler = null;


        try {
            // InternalAnsibleDsl.g:4825:57: (iv_ruleENotifiedHandler= ruleENotifiedHandler EOF )
            // InternalAnsibleDsl.g:4826:2: iv_ruleENotifiedHandler= ruleENotifiedHandler EOF
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
    // InternalAnsibleDsl.g:4832:1: ruleENotifiedHandler returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4838:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4839:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalAnsibleDsl.g:4839:2: ( (otherlv_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4840:3: (otherlv_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4840:3: (otherlv_0= RULE_STRING )
            // InternalAnsibleDsl.g:4841:4: otherlv_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4855:1: entryRuleENotifiedTopic returns [EObject current=null] : iv_ruleENotifiedTopic= ruleENotifiedTopic EOF ;
    public final EObject entryRuleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedTopic = null;


        try {
            // InternalAnsibleDsl.g:4855:55: (iv_ruleENotifiedTopic= ruleENotifiedTopic EOF )
            // InternalAnsibleDsl.g:4856:2: iv_ruleENotifiedTopic= ruleENotifiedTopic EOF
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
    // InternalAnsibleDsl.g:4862:1: ruleENotifiedTopic returns [EObject current=null] : (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4868:2: ( (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:4869:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:4869:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4870:3: otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,148,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getENotifiedTopicAccess().getTopicKeyword_0());
            		
            // InternalAnsibleDsl.g:4874:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4875:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4875:4: (lv_name_1_0= RULE_STRING )
            // InternalAnsibleDsl.g:4876:5: lv_name_1_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4896:1: entryRuleEValuePassed returns [EObject current=null] : iv_ruleEValuePassed= ruleEValuePassed EOF ;
    public final EObject entryRuleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassed = null;


        try {
            // InternalAnsibleDsl.g:4896:53: (iv_ruleEValuePassed= ruleEValuePassed EOF )
            // InternalAnsibleDsl.g:4897:2: iv_ruleEValuePassed= ruleEValuePassed EOF
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
    // InternalAnsibleDsl.g:4903:1: ruleEValuePassed returns [EObject current=null] : (this_EValue_0= ruleEValue | this_EFilteredVariable_1= ruleEFilteredVariable ) ;
    public final EObject ruleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject this_EValue_0 = null;

        EObject this_EFilteredVariable_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4909:2: ( (this_EValue_0= ruleEValue | this_EFilteredVariable_1= ruleEFilteredVariable ) )
            // InternalAnsibleDsl.g:4910:2: (this_EValue_0= ruleEValue | this_EFilteredVariable_1= ruleEFilteredVariable )
            {
            // InternalAnsibleDsl.g:4910:2: (this_EValue_0= ruleEValue | this_EFilteredVariable_1= ruleEFilteredVariable )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=RULE_STRING && LA121_0<=RULE_BOOLEAN)||(LA121_0>=RULE_INT && LA121_0<=RULE_NULL)||(LA121_0>=152 && LA121_0<=153)) ) {
                alt121=1;
            }
            else if ( (LA121_0==RULE_ID) ) {
                alt121=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // InternalAnsibleDsl.g:4911:3: this_EValue_0= ruleEValue
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
                    // InternalAnsibleDsl.g:4920:3: this_EFilteredVariable_1= ruleEFilteredVariable
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedAccess().getEFilteredVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFilteredVariable_1=ruleEFilteredVariable();

                    state._fsp--;


                    			current = this_EFilteredVariable_1;
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
    // InternalAnsibleDsl.g:4932:1: entryRuleEValue returns [EObject current=null] : iv_ruleEValue= ruleEValue EOF ;
    public final EObject entryRuleEValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValue = null;


        try {
            // InternalAnsibleDsl.g:4932:47: (iv_ruleEValue= ruleEValue EOF )
            // InternalAnsibleDsl.g:4933:2: iv_ruleEValue= ruleEValue EOF
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
    // InternalAnsibleDsl.g:4939:1: ruleEValue returns [EObject current=null] : (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | ( (lv_value_string_2_0= RULE_STRING ) ) | ( (lv_value_string_3_0= RULE_BOOLEAN ) ) | ( (lv_value_string_4_0= RULE_NULL ) ) | ( (lv_value_int_5_0= RULE_INT ) ) ) ;
    public final EObject ruleEValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_string_2_0=null;
        Token lv_value_string_3_0=null;
        Token lv_value_string_4_0=null;
        Token lv_value_int_5_0=null;
        EObject this_EDictionary_0 = null;

        EObject this_EList_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4945:2: ( (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | ( (lv_value_string_2_0= RULE_STRING ) ) | ( (lv_value_string_3_0= RULE_BOOLEAN ) ) | ( (lv_value_string_4_0= RULE_NULL ) ) | ( (lv_value_int_5_0= RULE_INT ) ) ) )
            // InternalAnsibleDsl.g:4946:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | ( (lv_value_string_2_0= RULE_STRING ) ) | ( (lv_value_string_3_0= RULE_BOOLEAN ) ) | ( (lv_value_string_4_0= RULE_NULL ) ) | ( (lv_value_int_5_0= RULE_INT ) ) )
            {
            // InternalAnsibleDsl.g:4946:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList | ( (lv_value_string_2_0= RULE_STRING ) ) | ( (lv_value_string_3_0= RULE_BOOLEAN ) ) | ( (lv_value_string_4_0= RULE_NULL ) ) | ( (lv_value_int_5_0= RULE_INT ) ) )
            int alt122=6;
            switch ( input.LA(1) ) {
            case 152:
                {
                alt122=1;
                }
                break;
            case 153:
                {
                alt122=2;
                }
                break;
            case RULE_STRING:
                {
                alt122=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt122=4;
                }
                break;
            case RULE_NULL:
                {
                alt122=5;
                }
                break;
            case RULE_INT:
                {
                alt122=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // InternalAnsibleDsl.g:4947:3: this_EDictionary_0= ruleEDictionary
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
                    // InternalAnsibleDsl.g:4956:3: this_EList_1= ruleEList
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
                    // InternalAnsibleDsl.g:4965:3: ( (lv_value_string_2_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:4965:3: ( (lv_value_string_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4966:4: (lv_value_string_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4966:4: (lv_value_string_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4967:5: lv_value_string_2_0= RULE_STRING
                    {
                    lv_value_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_string_2_0, grammarAccess.getEValueAccess().getValue_stringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value_string",
                    						lv_value_string_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAnsibleDsl.g:4984:3: ( (lv_value_string_3_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:4984:3: ( (lv_value_string_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4985:4: (lv_value_string_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4985:4: (lv_value_string_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4986:5: lv_value_string_3_0= RULE_BOOLEAN
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
                    // InternalAnsibleDsl.g:5003:3: ( (lv_value_string_4_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:5003:3: ( (lv_value_string_4_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:5004:4: (lv_value_string_4_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:5004:4: (lv_value_string_4_0= RULE_NULL )
                    // InternalAnsibleDsl.g:5005:5: lv_value_string_4_0= RULE_NULL
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
                    // InternalAnsibleDsl.g:5022:3: ( (lv_value_int_5_0= RULE_INT ) )
                    {
                    // InternalAnsibleDsl.g:5022:3: ( (lv_value_int_5_0= RULE_INT ) )
                    // InternalAnsibleDsl.g:5023:4: (lv_value_int_5_0= RULE_INT )
                    {
                    // InternalAnsibleDsl.g:5023:4: (lv_value_int_5_0= RULE_INT )
                    // InternalAnsibleDsl.g:5024:5: lv_value_int_5_0= RULE_INT
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
    // InternalAnsibleDsl.g:5044:1: entryRuleEFilteredVariable returns [EObject current=null] : iv_ruleEFilteredVariable= ruleEFilteredVariable EOF ;
    public final EObject entryRuleEFilteredVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredVariable = null;


        try {
            // InternalAnsibleDsl.g:5044:58: (iv_ruleEFilteredVariable= ruleEFilteredVariable EOF )
            // InternalAnsibleDsl.g:5045:2: iv_ruleEFilteredVariable= ruleEFilteredVariable EOF
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
    // InternalAnsibleDsl.g:5051:1: ruleEFilteredVariable returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEDictionaryPairReference ) ) )* (otherlv_3= '|' ( (lv_filter_commands_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleEFilteredVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_filter_commands_4_0=null;
        EObject lv_tail_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5057:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEDictionaryPairReference ) ) )* (otherlv_3= '|' ( (lv_filter_commands_4_0= RULE_STRING ) ) )* ) )
            // InternalAnsibleDsl.g:5058:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEDictionaryPairReference ) ) )* (otherlv_3= '|' ( (lv_filter_commands_4_0= RULE_STRING ) ) )* )
            {
            // InternalAnsibleDsl.g:5058:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEDictionaryPairReference ) ) )* (otherlv_3= '|' ( (lv_filter_commands_4_0= RULE_STRING ) ) )* )
            // InternalAnsibleDsl.g:5059:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEDictionaryPairReference ) ) )* (otherlv_3= '|' ( (lv_filter_commands_4_0= RULE_STRING ) ) )*
            {
            // InternalAnsibleDsl.g:5059:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5060:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5060:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:5061:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEFilteredVariableRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_131); 

            					newLeafNode(otherlv_0, grammarAccess.getEFilteredVariableAccess().getVariableEDeclaredVariableCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:5072:3: (otherlv_1= '.' ( (lv_tail_2_0= ruleEDictionaryPairReference ) ) )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==149) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5073:4: otherlv_1= '.' ( (lv_tail_2_0= ruleEDictionaryPairReference ) )
            	    {
            	    otherlv_1=(Token)match(input,149,FOLLOW_54); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEFilteredVariableAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalAnsibleDsl.g:5077:4: ( (lv_tail_2_0= ruleEDictionaryPairReference ) )
            	    // InternalAnsibleDsl.g:5078:5: (lv_tail_2_0= ruleEDictionaryPairReference )
            	    {
            	    // InternalAnsibleDsl.g:5078:5: (lv_tail_2_0= ruleEDictionaryPairReference )
            	    // InternalAnsibleDsl.g:5079:6: lv_tail_2_0= ruleEDictionaryPairReference
            	    {

            	    						newCompositeNode(grammarAccess.getEFilteredVariableAccess().getTailEDictionaryPairReferenceParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_131);
            	    lv_tail_2_0=ruleEDictionaryPairReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEFilteredVariableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tail",
            	    							lv_tail_2_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.EDictionaryPairReference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop123;
                }
            } while (true);

            // InternalAnsibleDsl.g:5097:3: (otherlv_3= '|' ( (lv_filter_commands_4_0= RULE_STRING ) ) )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==150) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5098:4: otherlv_3= '|' ( (lv_filter_commands_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,150,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getEFilteredVariableAccess().getVerticalLineKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5102:4: ( (lv_filter_commands_4_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:5103:5: (lv_filter_commands_4_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:5103:5: (lv_filter_commands_4_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:5104:6: lv_filter_commands_4_0= RULE_STRING
            	    {
            	    lv_filter_commands_4_0=(Token)match(input,RULE_STRING,FOLLOW_132); 

            	    						newLeafNode(lv_filter_commands_4_0, grammarAccess.getEFilteredVariableAccess().getFilter_commandsSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEFilteredVariableRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"filter_commands",
            	    							lv_filter_commands_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
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
    // $ANTLR end "ruleEFilteredVariable"


    // $ANTLR start "entryRuleEDictionaryPairReference"
    // InternalAnsibleDsl.g:5125:1: entryRuleEDictionaryPairReference returns [EObject current=null] : iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF ;
    public final EObject entryRuleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPairReference = null;


        try {
            // InternalAnsibleDsl.g:5125:65: (iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF )
            // InternalAnsibleDsl.g:5126:2: iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF
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
    // InternalAnsibleDsl.g:5132:1: ruleEDictionaryPairReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5138:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:5139:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalAnsibleDsl.g:5139:2: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5140:3: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5140:3: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:5141:4: otherlv_0= RULE_ID
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
    // InternalAnsibleDsl.g:5155:1: entryRuleEVariableDeclaration returns [EObject current=null] : iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF ;
    public final EObject entryRuleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclaration = null;


        try {
            // InternalAnsibleDsl.g:5155:61: (iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF )
            // InternalAnsibleDsl.g:5156:2: iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF
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
    // InternalAnsibleDsl.g:5162:1: ruleEVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5168:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:5169:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:5169:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:5170:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:5170:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5171:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5171:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:5172:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,50,FOLLOW_133); 

            			newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:5192:3: ( (lv_value_passed_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:5193:4: (lv_value_passed_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:5193:4: (lv_value_passed_2_0= ruleEValue )
            // InternalAnsibleDsl.g:5194:5: lv_value_passed_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:5215:1: entryRuleERegisterVariable returns [EObject current=null] : iv_ruleERegisterVariable= ruleERegisterVariable EOF ;
    public final EObject entryRuleERegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariable = null;


        try {
            // InternalAnsibleDsl.g:5215:58: (iv_ruleERegisterVariable= ruleERegisterVariable EOF )
            // InternalAnsibleDsl.g:5216:2: iv_ruleERegisterVariable= ruleERegisterVariable EOF
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
    // InternalAnsibleDsl.g:5222:1: ruleERegisterVariable returns [EObject current=null] : (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleERegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5228:2: ( (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:5229:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:5229:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:5230:3: otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,151,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableAccess().getRegisterKeyword_0());
            		
            // InternalAnsibleDsl.g:5234:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5235:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5235:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:5236:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleEDictionary"
    // InternalAnsibleDsl.g:5256:1: entryRuleEDictionary returns [EObject current=null] : iv_ruleEDictionary= ruleEDictionary EOF ;
    public final EObject entryRuleEDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionary = null;


        try {
            // InternalAnsibleDsl.g:5256:52: (iv_ruleEDictionary= ruleEDictionary EOF )
            // InternalAnsibleDsl.g:5257:2: iv_ruleEDictionary= ruleEDictionary EOF
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
    // InternalAnsibleDsl.g:5263:1: ruleEDictionary returns [EObject current=null] : (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dictionary_pairs_1_0 = null;

        EObject lv_dictionary_pairs_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5269:2: ( (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:5270:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:5270:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:5271:3: otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,152,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getEDictionaryAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:5275:3: ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) )
            // InternalAnsibleDsl.g:5276:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            {
            // InternalAnsibleDsl.g:5276:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            // InternalAnsibleDsl.g:5277:5: lv_dictionary_pairs_1_0= ruleEDictionaryPair
            {

            					newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_65);
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

            // InternalAnsibleDsl.g:5294:3: (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )*
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( (LA125_0==71) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5295:4: otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    {
            	    otherlv_2=(Token)match(input,71,FOLLOW_54); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEDictionaryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5299:4: ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    // InternalAnsibleDsl.g:5300:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    {
            	    // InternalAnsibleDsl.g:5300:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    // InternalAnsibleDsl.g:5301:6: lv_dictionary_pairs_3_0= ruleEDictionaryPair
            	    {

            	    						newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_65);
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
            	    break loop125;
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
    // InternalAnsibleDsl.g:5327:1: entryRuleEDictionaryPair returns [EObject current=null] : iv_ruleEDictionaryPair= ruleEDictionaryPair EOF ;
    public final EObject entryRuleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPair = null;


        try {
            // InternalAnsibleDsl.g:5327:56: (iv_ruleEDictionaryPair= ruleEDictionaryPair EOF )
            // InternalAnsibleDsl.g:5328:2: iv_ruleEDictionaryPair= ruleEDictionaryPair EOF
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
    // InternalAnsibleDsl.g:5334:1: ruleEDictionaryPair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5340:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:5341:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:5341:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:5342:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:5342:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5343:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5343:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:5344:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,50,FOLLOW_133); 

            			newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:5364:3: ( (lv_value_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:5365:4: (lv_value_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:5365:4: (lv_value_2_0= ruleEValue )
            // InternalAnsibleDsl.g:5366:5: lv_value_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:5387:1: entryRuleEList returns [EObject current=null] : iv_ruleEList= ruleEList EOF ;
    public final EObject entryRuleEList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEList = null;


        try {
            // InternalAnsibleDsl.g:5387:46: (iv_ruleEList= ruleEList EOF )
            // InternalAnsibleDsl.g:5388:2: iv_ruleEList= ruleEList EOF
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
    // InternalAnsibleDsl.g:5394:1: ruleEList returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5400:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) )
            // InternalAnsibleDsl.g:5401:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            {
            // InternalAnsibleDsl.g:5401:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            // InternalAnsibleDsl.g:5402:3: otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,153,FOLLOW_133); 

            			newLeafNode(otherlv_0, grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:5406:3: ( (lv_elements_1_0= ruleEValue ) )
            // InternalAnsibleDsl.g:5407:4: (lv_elements_1_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:5407:4: (lv_elements_1_0= ruleEValue )
            // InternalAnsibleDsl.g:5408:5: lv_elements_1_0= ruleEValue
            {

            					newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_134);
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

            // InternalAnsibleDsl.g:5425:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==71) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5426:4: otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) )
            	    {
            	    otherlv_2=(Token)match(input,71,FOLLOW_133); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5430:4: ( (lv_elements_3_0= ruleEValue ) )
            	    // InternalAnsibleDsl.g:5431:5: (lv_elements_3_0= ruleEValue )
            	    {
            	    // InternalAnsibleDsl.g:5431:5: (lv_elements_3_0= ruleEValue )
            	    // InternalAnsibleDsl.g:5432:6: lv_elements_3_0= ruleEValue
            	    {

            	    						newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_134);
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
            	    break loop126;
                }
            } while (true);

            otherlv_4=(Token)match(input,154,FOLLOW_2); 

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


    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\21\12\uffff";
    static final String dfa_4s = "\1\u008a\12\uffff";
    static final String dfa_5s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\1\0\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\2\1\uffff\1\3\1\5\1\6\1\7\1\10\1\12\53\uffff\1\11\103\uffff\1\4",
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

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 314:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )? otherlv_3= 'base_settings{' ( (lv_base_common_keywords_4_0= ruleEBaseCommonKeywords ) ) otherlv_5= '}' (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_12_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'vars_files:' ( (lv_vars_files_14_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_prompt:' ( (lv_vars_prompt_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'force_handlers:' ( (lv_force_handlers_18_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'pre_tasks{' ( (lv_pre_tasks_list_20_0= ruleEBlockTask ) )+ otherlv_21= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_22_0= ruleERoleCalls ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'tasks_list{' ( (lv_tasks_list_24_0= ruleEBlockTask ) )+ otherlv_25= '}' (otherlv_26= 'post_tasks{' ( (lv_post_tasks_list_27_0= ruleEBlockTask ) )+ otherlv_28= '}' )? (otherlv_29= 'handlers{' ( (lv_handlers_30_0= ruleEHandler ) )+ otherlv_31= '}' )? ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                         
                        int index14_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_0==EOF||LA14_0==17) ) {s = 1;}

                        else if ( LA14_0 >= 18 && LA14_0 <= 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA14_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA14_0 == 138 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA14_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA14_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA14_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA14_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA14_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA14_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {s = 10;}

                         
                        input.seek(index14_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000007EC0000L,0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L,0x8001208000000400L,0x00000000000003C1L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007FC0002L,0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L,0x01F0000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000007EC0002L,0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L,0x1E00000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000820000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000820020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001FEC0002L,0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000017EC0002L,0x0000000000000040L,0x0000000000000400L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000060000020000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L,0x0E00000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000600020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000080000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000780000200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000020000L,0x0180000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x04000000000001F0L,0x0000000000000004L,0x0000000003000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000020000L,0x6E00000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000780000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000800000000002L,0x0000007020000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000012L,0x0000007020000000L,0x0000000000900000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00000000000001F0L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x03F8000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xFC00000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000014020000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000010020000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000020000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000020000L,0x0000000000003800L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000020000L,0x0000000000003000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000020000L,0x0000000000002000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000020000L,0x000000000001C000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000020000L,0x0000000000018000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000007000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000020000L,0x0000000018000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000020000L,0x0000000010000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000020000L,0x0000000F80000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000020000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000020000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000020000L,0x0000000C00000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000020000L,0x0000000800000000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000002L,0x0000007000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000020000L,0x00001F0000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000020000L,0x00001E0000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000020000L,0x00001C0000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000020000L,0x0000180000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000020000L,0x0000100000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000020000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000020000L,0x0000800000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000020000L,0x000E000000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000020000L,0x000C000000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000020000L,0x0008000000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000002L,0x01E0000000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000002L,0x01C0000000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000002L,0x0180000000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000002L,0x0C00000000000000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000002L,0x0E00000000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000002L,0x4E00000000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000002L,0x8001200000000400L,0x00000000000003C1L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000002L,0x8001000000000400L,0x00000000000003C1L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000400L,0x00000000000003C1L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x00000000000003C1L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x00000000000003C0L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x0000000000000380L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x0000000000000300L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L,0x0000000000000200L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000007000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000600000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x00000000000001B0L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L,0x0000000004000000L});

}
