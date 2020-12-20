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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_NUMBER", "RULE_NULL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'playbook{'", "'playbook_name:'", "'used_by{'", "'node_type:'", "'operation:'", "'}'", "'plays{'", "'play{'", "'play_name:'", "'no_log:'", "'debugger:'", "'always'", "'never'", "'on_failed'", "'on_unreachable'", "'on_skipped'", "'module_defaults:'", "'environment:'", "'collections:'", "'tags:'", "'vars{'", "','", "'play_exe_settings{'", "'error_handling{'", "'vars_files:'", "'vars_prompt:'", "'force_handlers:'", "'pre_tasks{'", "'tasks_list{'", "'post_tasks{'", "'handlers{'", "'block{'", "'block_name:'", "'exe_settings{'", "'when:'", "'tasks{'", "'rescue_tasks{'", "'always_tasks{'", "'task{'", "'task_name:'", "'action:'", "'asynchronous_settings{'", "'args:'", "'module_call{'", "'notify:'", "'handler{'", "'handler_name:'", "'listen:'", "'module_name:'", "'parameters{'", "':'", "'role{'", "'role_name:'", "'roles_inclusions{'", "'loop:'", "'loop_control{'", "'label:'", "'pause:'", "'index_var:'", "'loop_var:'", "'extended:'", "'until:'", "'retries:'", "'delay:'", "'privilage_escalation{'", "'become:'", "'become_exe:'", "'become_flags:'", "'become_method:'", "'become_user:'", "'validation_mode{'", "'check_mode:'", "'diff:'", "'connection_info{'", "'connection:'", "'port:'", "'remote_user:'", "'strategy:'", "'serial:'", "'order:'", "'throttle:'", "'run_once:'", "'any_errors_fatal:'", "'ignore_errors:'", "'ignore_unreachable:'", "'max_fail_percentage:'", "'changed_when:'", "'failed_when:'", "'facts_setttings{'", "'gather_facts:'", "'gather_subset:'", "'gather_timeout:'", "'fact_path:'", "'delegation{'", "'delegate_to:'", "'delegate_facts:'", "'async:'", "'poll:'", "'topic:'", "'item'", "'.'", "'{{'", "'}}'", "'('", "')'", "'|'", "'or'", "'and'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'/'", "'//'", "'%'", "'*'", "'**'", "'is'", "'not'", "'in'", "'return'", "'if'", "'else'", "'['", "']'", "'registered_variable:'", "'register:'", "'interface_input:'", "'ansible_facts'", "'{'"
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
    public static final int T__147=147;
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
    // InternalAnsibleDsl.g:96:1: ruleEPlaybook returns [EObject current=null] : (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'used_by{' otherlv_4= 'node_type:' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'operation:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '}' )? otherlv_9= 'plays{' (otherlv_10= 'play{' ( (lv_plays_11_0= ruleEPlay ) ) otherlv_12= '}' )+ otherlv_13= '}' otherlv_14= '}' ) ;
    public final EObject ruleEPlaybook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_plays_11_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:102:2: ( (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'used_by{' otherlv_4= 'node_type:' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'operation:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '}' )? otherlv_9= 'plays{' (otherlv_10= 'play{' ( (lv_plays_11_0= ruleEPlay ) ) otherlv_12= '}' )+ otherlv_13= '}' otherlv_14= '}' ) )
            // InternalAnsibleDsl.g:103:2: (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'used_by{' otherlv_4= 'node_type:' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'operation:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '}' )? otherlv_9= 'plays{' (otherlv_10= 'play{' ( (lv_plays_11_0= ruleEPlay ) ) otherlv_12= '}' )+ otherlv_13= '}' otherlv_14= '}' )
            {
            // InternalAnsibleDsl.g:103:2: (otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'used_by{' otherlv_4= 'node_type:' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'operation:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '}' )? otherlv_9= 'plays{' (otherlv_10= 'play{' ( (lv_plays_11_0= ruleEPlay ) ) otherlv_12= '}' )+ otherlv_13= '}' otherlv_14= '}' )
            // InternalAnsibleDsl.g:104:3: otherlv_0= 'playbook{' otherlv_1= 'playbook_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'used_by{' otherlv_4= 'node_type:' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'operation:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '}' )? otherlv_9= 'plays{' (otherlv_10= 'play{' ( (lv_plays_11_0= ruleEPlay ) ) otherlv_12= '}' )+ otherlv_13= '}' otherlv_14= '}'
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

            // InternalAnsibleDsl.g:130:3: (otherlv_3= 'used_by{' otherlv_4= 'node_type:' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'operation:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '}' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAnsibleDsl.g:131:4: otherlv_3= 'used_by{' otherlv_4= 'node_type:' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'operation:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlaybookAccess().getUsed_byKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPlaybookAccess().getNode_typeKeyword_3_1());
                    			
                    // InternalAnsibleDsl.g:139:4: ( (otherlv_5= RULE_STRING ) )
                    // InternalAnsibleDsl.g:140:5: (otherlv_5= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:140:5: (otherlv_5= RULE_STRING )
                    // InternalAnsibleDsl.g:141:6: otherlv_5= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlaybookRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    						newLeafNode(otherlv_5, grammarAccess.getEPlaybookAccess().getNode_typeENodeTypeCrossReference_3_2_0());
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPlaybookAccess().getOperationKeyword_3_3());
                    			
                    // InternalAnsibleDsl.g:156:4: ( (otherlv_7= RULE_STRING ) )
                    // InternalAnsibleDsl.g:157:5: (otherlv_7= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:157:5: (otherlv_7= RULE_STRING )
                    // InternalAnsibleDsl.g:158:6: otherlv_7= RULE_STRING
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPlaybookRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(otherlv_7, grammarAccess.getEPlaybookAccess().getOperationEOperationDefinitionCrossReference_3_4_0());
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_3_5());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getEPlaybookAccess().getPlaysKeyword_4());
            		
            // InternalAnsibleDsl.g:178:3: (otherlv_10= 'play{' ( (lv_plays_11_0= ruleEPlay ) ) otherlv_12= '}' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAnsibleDsl.g:179:4: otherlv_10= 'play{' ( (lv_plays_11_0= ruleEPlay ) ) otherlv_12= '}'
            	    {
            	    otherlv_10=(Token)match(input,21,FOLLOW_11); 

            	    				newLeafNode(otherlv_10, grammarAccess.getEPlaybookAccess().getPlayKeyword_5_0());
            	    			
            	    // InternalAnsibleDsl.g:183:4: ( (lv_plays_11_0= ruleEPlay ) )
            	    // InternalAnsibleDsl.g:184:5: (lv_plays_11_0= ruleEPlay )
            	    {
            	    // InternalAnsibleDsl.g:184:5: (lv_plays_11_0= ruleEPlay )
            	    // InternalAnsibleDsl.g:185:6: lv_plays_11_0= ruleEPlay
            	    {

            	    						newCompositeNode(grammarAccess.getEPlaybookAccess().getPlaysEPlayParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_plays_11_0=ruleEPlay();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEPlaybookRule());
            	    						}
            	    						add(
            	    							current,
            	    							"plays",
            	    							lv_plays_11_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.EPlay");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_12=(Token)match(input,19,FOLLOW_12); 

            	    				newLeafNode(otherlv_12, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_5_2());
            	    			

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

            otherlv_13=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_13, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_14=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:219:1: entryRuleEExecution returns [EObject current=null] : iv_ruleEExecution= ruleEExecution EOF ;
    public final EObject entryRuleEExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecution = null;


        try {
            // InternalAnsibleDsl.g:219:51: (iv_ruleEExecution= ruleEExecution EOF )
            // InternalAnsibleDsl.g:220:2: iv_ruleEExecution= ruleEExecution EOF
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
    // InternalAnsibleDsl.g:226:1: ruleEExecution returns [EObject current=null] : (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion ) ;
    public final EObject ruleEExecution() throws RecognitionException {
        EObject current = null;

        EObject this_EBlock_0 = null;

        EObject this_ETaskHandler_1 = null;

        EObject this_ERoleInclusion_2 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:232:2: ( (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion ) )
            // InternalAnsibleDsl.g:233:2: (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion )
            {
            // InternalAnsibleDsl.g:233:2: (this_EBlock_0= ruleEBlock | this_ETaskHandler_1= ruleETaskHandler | this_ERoleInclusion_2= ruleERoleInclusion )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt3=1;
                }
                break;
            case 52:
            case 59:
                {
                alt3=2;
                }
                break;
            case 65:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAnsibleDsl.g:234:3: this_EBlock_0= ruleEBlock
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
                    // InternalAnsibleDsl.g:243:3: this_ETaskHandler_1= ruleETaskHandler
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
                    // InternalAnsibleDsl.g:252:3: this_ERoleInclusion_2= ruleERoleInclusion
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
    // InternalAnsibleDsl.g:264:1: entryRuleEBlockTask returns [EObject current=null] : iv_ruleEBlockTask= ruleEBlockTask EOF ;
    public final EObject entryRuleEBlockTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockTask = null;


        try {
            // InternalAnsibleDsl.g:264:51: (iv_ruleEBlockTask= ruleEBlockTask EOF )
            // InternalAnsibleDsl.g:265:2: iv_ruleEBlockTask= ruleEBlockTask EOF
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
    // InternalAnsibleDsl.g:271:1: ruleEBlockTask returns [EObject current=null] : (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask ) ;
    public final EObject ruleEBlockTask() throws RecognitionException {
        EObject current = null;

        EObject this_EBlock_0 = null;

        EObject this_ETask_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:277:2: ( (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask ) )
            // InternalAnsibleDsl.g:278:2: (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask )
            {
            // InternalAnsibleDsl.g:278:2: (this_EBlock_0= ruleEBlock | this_ETask_1= ruleETask )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==45) ) {
                alt4=1;
            }
            else if ( (LA4_0==52) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAnsibleDsl.g:279:3: this_EBlock_0= ruleEBlock
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
                    // InternalAnsibleDsl.g:288:3: this_ETask_1= ruleETask
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
    // InternalAnsibleDsl.g:300:1: entryRuleETaskHandler returns [EObject current=null] : iv_ruleETaskHandler= ruleETaskHandler EOF ;
    public final EObject entryRuleETaskHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandler = null;


        try {
            // InternalAnsibleDsl.g:300:53: (iv_ruleETaskHandler= ruleETaskHandler EOF )
            // InternalAnsibleDsl.g:301:2: iv_ruleETaskHandler= ruleETaskHandler EOF
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
    // InternalAnsibleDsl.g:307:1: ruleETaskHandler returns [EObject current=null] : (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler ) ;
    public final EObject ruleETaskHandler() throws RecognitionException {
        EObject current = null;

        EObject this_ETask_0 = null;

        EObject this_EHandler_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:313:2: ( (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler ) )
            // InternalAnsibleDsl.g:314:2: (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler )
            {
            // InternalAnsibleDsl.g:314:2: (this_ETask_0= ruleETask | this_EHandler_1= ruleEHandler )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52) ) {
                alt5=1;
            }
            else if ( (LA5_0==59) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAnsibleDsl.g:315:3: this_ETask_0= ruleETask
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
                    // InternalAnsibleDsl.g:324:3: this_EHandler_1= ruleEHandler
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
    // InternalAnsibleDsl.g:336:1: entryRuleEPlay returns [EObject current=null] : iv_ruleEPlay= ruleEPlay EOF ;
    public final EObject entryRuleEPlay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlay = null;


        try {
            // InternalAnsibleDsl.g:336:46: (iv_ruleEPlay= ruleEPlay EOF )
            // InternalAnsibleDsl.g:337:2: iv_ruleEPlay= ruleEPlay EOF
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
    // InternalAnsibleDsl.g:343:1: ruleEPlay returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalAnsibleDsl.g:349:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:350:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:350:2: ( ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:351:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:351:3: ( ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:352:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:355:4: ( ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:356:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:356:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=10;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // InternalAnsibleDsl.g:357:3: ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:357:3: ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:358:4: {...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:358:99: ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:359:5: ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:362:8: ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) )
            	    // InternalAnsibleDsl.g:362:9: {...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:362:18: ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? )
            	    // InternalAnsibleDsl.g:362:19: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )?
            	    {
            	    // InternalAnsibleDsl.g:362:19: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:363:9: otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_4); 

            	    									newLeafNode(otherlv_1, grammarAccess.getEPlayAccess().getPlay_nameKeyword_0_0_0());
            	    								
            	    // InternalAnsibleDsl.g:367:9: ( (lv_name_2_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:368:10: (lv_name_2_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:368:10: (lv_name_2_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:369:11: lv_name_2_0= RULE_STRING
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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

            	    // InternalAnsibleDsl.g:386:8: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==78) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:387:9: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
            	            {
            	            // InternalAnsibleDsl.g:387:9: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
            	            // InternalAnsibleDsl.g:388:10: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
            	            {

            	            										newCompositeNode(grammarAccess.getEPlayAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_0_1_0());
            	            									
            	            pushFollow(FOLLOW_14);
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

            	    // InternalAnsibleDsl.g:405:8: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==84) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:406:9: (lv_validation_mode_4_0= ruleEValidationMode )
            	            {
            	            // InternalAnsibleDsl.g:406:9: (lv_validation_mode_4_0= ruleEValidationMode )
            	            // InternalAnsibleDsl.g:407:10: lv_validation_mode_4_0= ruleEValidationMode
            	            {

            	            										newCompositeNode(grammarAccess.getEPlayAccess().getValidation_modeEValidationModeParserRuleCall_0_2_0());
            	            									
            	            pushFollow(FOLLOW_15);
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

            	    // InternalAnsibleDsl.g:424:8: ( (lv_connection_5_0= ruleEConnection ) )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==87) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:425:9: (lv_connection_5_0= ruleEConnection )
            	            {
            	            // InternalAnsibleDsl.g:425:9: (lv_connection_5_0= ruleEConnection )
            	            // InternalAnsibleDsl.g:426:10: lv_connection_5_0= ruleEConnection
            	            {

            	            										newCompositeNode(grammarAccess.getEPlayAccess().getConnectionEConnectionParserRuleCall_0_3_0());
            	            									
            	            pushFollow(FOLLOW_16);
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

            	    // InternalAnsibleDsl.g:443:8: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==23) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:444:9: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
            	            {
            	            otherlv_6=(Token)match(input,23,FOLLOW_17); 

            	            									newLeafNode(otherlv_6, grammarAccess.getEPlayAccess().getNo_logKeyword_0_4_0());
            	            								
            	            // InternalAnsibleDsl.g:448:9: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
            	            // InternalAnsibleDsl.g:449:10: (lv_no_log_7_0= RULE_BOOLEAN )
            	            {
            	            // InternalAnsibleDsl.g:449:10: (lv_no_log_7_0= RULE_BOOLEAN )
            	            // InternalAnsibleDsl.g:450:11: lv_no_log_7_0= RULE_BOOLEAN
            	            {
            	            lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_18); 

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

            	    // InternalAnsibleDsl.g:467:8: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==24) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:468:9: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
            	            {
            	            otherlv_8=(Token)match(input,24,FOLLOW_19); 

            	            									newLeafNode(otherlv_8, grammarAccess.getEPlayAccess().getDebuggerKeyword_0_5_0());
            	            								
            	            // InternalAnsibleDsl.g:472:9: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
            	            // InternalAnsibleDsl.g:473:10: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
            	            {
            	            // InternalAnsibleDsl.g:473:10: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
            	            // InternalAnsibleDsl.g:474:11: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
            	            {
            	            // InternalAnsibleDsl.g:474:11: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
            	            int alt10=5;
            	            switch ( input.LA(1) ) {
            	            case 25:
            	                {
            	                alt10=1;
            	                }
            	                break;
            	            case 26:
            	                {
            	                alt10=2;
            	                }
            	                break;
            	            case 27:
            	                {
            	                alt10=3;
            	                }
            	                break;
            	            case 28:
            	                {
            	                alt10=4;
            	                }
            	                break;
            	            case 29:
            	                {
            	                alt10=5;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 10, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt10) {
            	                case 1 :
            	                    // InternalAnsibleDsl.g:475:12: lv_debugger_9_1= 'always'
            	                    {
            	                    lv_debugger_9_1=(Token)match(input,25,FOLLOW_20); 

            	                    												newLeafNode(lv_debugger_9_1, grammarAccess.getEPlayAccess().getDebuggerAlwaysKeyword_0_5_1_0_0());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
            	                    											

            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalAnsibleDsl.g:486:12: lv_debugger_9_2= 'never'
            	                    {
            	                    lv_debugger_9_2=(Token)match(input,26,FOLLOW_20); 

            	                    												newLeafNode(lv_debugger_9_2, grammarAccess.getEPlayAccess().getDebuggerNeverKeyword_0_5_1_0_1());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
            	                    											

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalAnsibleDsl.g:497:12: lv_debugger_9_3= 'on_failed'
            	                    {
            	                    lv_debugger_9_3=(Token)match(input,27,FOLLOW_20); 

            	                    												newLeafNode(lv_debugger_9_3, grammarAccess.getEPlayAccess().getDebuggerOn_failedKeyword_0_5_1_0_2());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
            	                    											

            	                    }
            	                    break;
            	                case 4 :
            	                    // InternalAnsibleDsl.g:508:12: lv_debugger_9_4= 'on_unreachable'
            	                    {
            	                    lv_debugger_9_4=(Token)match(input,28,FOLLOW_20); 

            	                    												newLeafNode(lv_debugger_9_4, grammarAccess.getEPlayAccess().getDebuggerOn_unreachableKeyword_0_5_1_0_3());
            	                    											

            	                    												if (current==null) {
            	                    													current = createModelElement(grammarAccess.getEPlayRule());
            	                    												}
            	                    												setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
            	                    											

            	                    }
            	                    break;
            	                case 5 :
            	                    // InternalAnsibleDsl.g:519:12: lv_debugger_9_5= 'on_skipped'
            	                    {
            	                    lv_debugger_9_5=(Token)match(input,29,FOLLOW_20); 

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

            	    // InternalAnsibleDsl.g:533:8: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==30) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:534:9: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
            	            {
            	            otherlv_10=(Token)match(input,30,FOLLOW_21); 

            	            									newLeafNode(otherlv_10, grammarAccess.getEPlayAccess().getModule_defaultsKeyword_0_6_0());
            	            								
            	            // InternalAnsibleDsl.g:538:9: ( (lv_module_defaults_11_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:539:10: (lv_module_defaults_11_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:539:10: (lv_module_defaults_11_0= ruleEList )
            	            // InternalAnsibleDsl.g:540:11: lv_module_defaults_11_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getModule_defaultsEListParserRuleCall_0_6_1_0());
            	            										
            	            pushFollow(FOLLOW_22);
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

            	    // InternalAnsibleDsl.g:558:8: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==31) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:559:9: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
            	            {
            	            otherlv_12=(Token)match(input,31,FOLLOW_21); 

            	            									newLeafNode(otherlv_12, grammarAccess.getEPlayAccess().getEnvironmentKeyword_0_7_0());
            	            								
            	            // InternalAnsibleDsl.g:563:9: ( (lv_environment_13_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:564:10: (lv_environment_13_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:564:10: (lv_environment_13_0= ruleEList )
            	            // InternalAnsibleDsl.g:565:11: lv_environment_13_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getEnvironmentEListParserRuleCall_0_7_1_0());
            	            										
            	            pushFollow(FOLLOW_23);
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

            	    // InternalAnsibleDsl.g:583:8: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==32) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:584:9: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
            	            {
            	            otherlv_14=(Token)match(input,32,FOLLOW_21); 

            	            									newLeafNode(otherlv_14, grammarAccess.getEPlayAccess().getCollectionsKeyword_0_8_0());
            	            								
            	            // InternalAnsibleDsl.g:588:9: ( (lv_collections_15_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:589:10: (lv_collections_15_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:589:10: (lv_collections_15_0= ruleEList )
            	            // InternalAnsibleDsl.g:590:11: lv_collections_15_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getCollectionsEListParserRuleCall_0_8_1_0());
            	            										
            	            pushFollow(FOLLOW_24);
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

            	    // InternalAnsibleDsl.g:608:8: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==33) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:609:9: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
            	            {
            	            otherlv_16=(Token)match(input,33,FOLLOW_21); 

            	            									newLeafNode(otherlv_16, grammarAccess.getEPlayAccess().getTagsKeyword_0_9_0());
            	            								
            	            // InternalAnsibleDsl.g:613:9: ( (lv_tags_17_0= ruleEList ) )
            	            // InternalAnsibleDsl.g:614:10: (lv_tags_17_0= ruleEList )
            	            {
            	            // InternalAnsibleDsl.g:614:10: (lv_tags_17_0= ruleEList )
            	            // InternalAnsibleDsl.g:615:11: lv_tags_17_0= ruleEList
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getTagsEListParserRuleCall_0_9_1_0());
            	            										
            	            pushFollow(FOLLOW_25);
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

            	    // InternalAnsibleDsl.g:633:8: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==34) ) {
            	        alt17=1;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:634:9: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
            	            {
            	            otherlv_18=(Token)match(input,34,FOLLOW_26); 

            	            									newLeafNode(otherlv_18, grammarAccess.getEPlayAccess().getVarsKeyword_0_10_0());
            	            								
            	            // InternalAnsibleDsl.g:638:9: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
            	            // InternalAnsibleDsl.g:639:10: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
            	            {
            	            // InternalAnsibleDsl.g:639:10: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
            	            // InternalAnsibleDsl.g:640:11: lv_variable_declarations_19_0= ruleEVariableDeclaration
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_0_10_1_0());
            	            										
            	            pushFollow(FOLLOW_27);
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

            	            // InternalAnsibleDsl.g:657:9: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
            	            loop16:
            	            do {
            	                int alt16=2;
            	                int LA16_0 = input.LA(1);

            	                if ( (LA16_0==35) ) {
            	                    alt16=1;
            	                }


            	                switch (alt16) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:658:10: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
            	            	    {
            	            	    otherlv_20=(Token)match(input,35,FOLLOW_26); 

            	            	    										newLeafNode(otherlv_20, grammarAccess.getEPlayAccess().getCommaKeyword_0_10_2_0());
            	            	    									
            	            	    // InternalAnsibleDsl.g:662:10: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
            	            	    // InternalAnsibleDsl.g:663:11: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
            	            	    {
            	            	    // InternalAnsibleDsl.g:663:11: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
            	            	    // InternalAnsibleDsl.g:664:12: lv_variable_declarations_21_0= ruleEVariableDeclaration
            	            	    {

            	            	    												newCompositeNode(grammarAccess.getEPlayAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_0_10_2_1_0());
            	            	    											
            	            	    pushFollow(FOLLOW_27);
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
            	            	    break loop16;
            	                }
            	            } while (true);

            	            otherlv_22=(Token)match(input,19,FOLLOW_28); 

            	            									newLeafNode(otherlv_22, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_0_10_3());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:687:8: (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==36) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:688:9: otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}'
            	            {
            	            otherlv_23=(Token)match(input,36,FOLLOW_29); 

            	            									newLeafNode(otherlv_23, grammarAccess.getEPlayAccess().getPlay_exe_settingsKeyword_0_11_0());
            	            								
            	            // InternalAnsibleDsl.g:692:9: ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) )
            	            // InternalAnsibleDsl.g:693:10: (lv_play_exe_settings_24_0= ruleEPlayExeSettings )
            	            {
            	            // InternalAnsibleDsl.g:693:10: (lv_play_exe_settings_24_0= ruleEPlayExeSettings )
            	            // InternalAnsibleDsl.g:694:11: lv_play_exe_settings_24_0= ruleEPlayExeSettings
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

            	            otherlv_25=(Token)match(input,19,FOLLOW_30); 

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
            	    // InternalAnsibleDsl.g:722:3: ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:722:3: ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:723:4: {...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:723:99: ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) )
            	    // InternalAnsibleDsl.g:724:5: ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:727:8: ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) )
            	    // InternalAnsibleDsl.g:727:9: {...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:727:18: (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' )
            	    // InternalAnsibleDsl.g:727:19: otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}'
            	    {
            	    otherlv_26=(Token)match(input,37,FOLLOW_31); 

            	    								newLeafNode(otherlv_26, grammarAccess.getEPlayAccess().getError_handlingKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:731:8: ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) )
            	    // InternalAnsibleDsl.g:732:9: (lv_error_handling_27_0= ruleEPlayErrorHandling )
            	    {
            	    // InternalAnsibleDsl.g:732:9: (lv_error_handling_27_0= ruleEPlayErrorHandling )
            	    // InternalAnsibleDsl.g:733:10: lv_error_handling_27_0= ruleEPlayErrorHandling
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

            	    otherlv_28=(Token)match(input,19,FOLLOW_30); 

            	    								newLeafNode(otherlv_28, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:760:3: ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:760:3: ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) )
            	    // InternalAnsibleDsl.g:761:4: {...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:761:99: ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) )
            	    // InternalAnsibleDsl.g:762:5: ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:765:8: ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) )
            	    // InternalAnsibleDsl.g:765:9: {...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:765:18: ( (lv_facts_settings_29_0= ruleEFactsSettings ) )
            	    // InternalAnsibleDsl.g:765:19: (lv_facts_settings_29_0= ruleEFactsSettings )
            	    {
            	    // InternalAnsibleDsl.g:765:19: (lv_facts_settings_29_0= ruleEFactsSettings )
            	    // InternalAnsibleDsl.g:766:9: lv_facts_settings_29_0= ruleEFactsSettings
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getFacts_settingsEFactsSettingsParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_30);
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
            	    // InternalAnsibleDsl.g:788:3: ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:788:3: ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:789:4: {...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:789:99: ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:790:5: ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:793:8: ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:793:9: {...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:793:18: (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:793:19: otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) )
            	    {
            	    otherlv_30=(Token)match(input,38,FOLLOW_21); 

            	    								newLeafNode(otherlv_30, grammarAccess.getEPlayAccess().getVars_filesKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:797:8: ( (lv_vars_files_31_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:798:9: (lv_vars_files_31_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:798:9: (lv_vars_files_31_0= ruleEList )
            	    // InternalAnsibleDsl.g:799:10: lv_vars_files_31_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_filesEListParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_30);
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
            	    // InternalAnsibleDsl.g:822:3: ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:822:3: ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:823:4: {...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:823:99: ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:824:5: ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:827:8: ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:827:9: {...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:827:18: (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:827:19: otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) )
            	    {
            	    otherlv_32=(Token)match(input,39,FOLLOW_21); 

            	    								newLeafNode(otherlv_32, grammarAccess.getEPlayAccess().getVars_promptKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:831:8: ( (lv_vars_prompt_33_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:832:9: (lv_vars_prompt_33_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:832:9: (lv_vars_prompt_33_0= ruleEList )
            	    // InternalAnsibleDsl.g:833:10: lv_vars_prompt_33_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_promptEListParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_30);
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
            	    // InternalAnsibleDsl.g:856:3: ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:856:3: ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:857:4: {...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:857:99: ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:858:5: ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:861:8: ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:861:9: {...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:861:18: (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:861:19: otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_34=(Token)match(input,40,FOLLOW_17); 

            	    								newLeafNode(otherlv_34, grammarAccess.getEPlayAccess().getForce_handlersKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:865:8: ( (lv_force_handlers_35_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:866:9: (lv_force_handlers_35_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:866:9: (lv_force_handlers_35_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:867:10: lv_force_handlers_35_0= RULE_BOOLEAN
            	    {
            	    lv_force_handlers_35_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_30); 

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
            	    // InternalAnsibleDsl.g:889:3: ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:889:3: ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:890:4: {...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:890:99: ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) )
            	    // InternalAnsibleDsl.g:891:5: ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:894:8: ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) )
            	    // InternalAnsibleDsl.g:894:9: {...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:894:18: (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' )
            	    // InternalAnsibleDsl.g:894:19: otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}'
            	    {
            	    otherlv_36=(Token)match(input,41,FOLLOW_32); 

            	    								newLeafNode(otherlv_36, grammarAccess.getEPlayAccess().getPre_tasksKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:898:8: ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==45||LA19_0==52) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:899:9: (lv_pre_tasks_list_37_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:899:9: (lv_pre_tasks_list_37_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:900:10: lv_pre_tasks_list_37_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getPre_tasks_listEBlockTaskParserRuleCall_6_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_33);
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
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	    otherlv_38=(Token)match(input,19,FOLLOW_30); 

            	    								newLeafNode(otherlv_38, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_6_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAnsibleDsl.g:927:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:927:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) )
            	    // InternalAnsibleDsl.g:928:4: {...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:928:99: ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) )
            	    // InternalAnsibleDsl.g:929:5: ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:932:8: ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) )
            	    // InternalAnsibleDsl.g:932:9: {...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:932:18: ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) )
            	    // InternalAnsibleDsl.g:932:19: (lv_roles_inclusions_39_0= ruleERoleInclusions )
            	    {
            	    // InternalAnsibleDsl.g:932:19: (lv_roles_inclusions_39_0= ruleERoleInclusions )
            	    // InternalAnsibleDsl.g:933:9: lv_roles_inclusions_39_0= ruleERoleInclusions
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getRoles_inclusionsERoleInclusionsParserRuleCall_7_0());
            	    								
            	    pushFollow(FOLLOW_30);
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
            	    // InternalAnsibleDsl.g:955:3: ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:955:3: ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:956:4: {...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAnsibleDsl.g:956:99: ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:957:5: ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAnsibleDsl.g:960:8: ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) )
            	    // InternalAnsibleDsl.g:960:9: {...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:960:18: (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? )
            	    // InternalAnsibleDsl.g:960:19: otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )?
            	    {
            	    otherlv_40=(Token)match(input,42,FOLLOW_32); 

            	    								newLeafNode(otherlv_40, grammarAccess.getEPlayAccess().getTasks_listKeyword_8_0());
            	    							
            	    // InternalAnsibleDsl.g:964:8: ( (lv_tasks_list_41_0= ruleEBlockTask ) )+
            	    int cnt20=0;
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==45||LA20_0==52) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:965:9: (lv_tasks_list_41_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:965:9: (lv_tasks_list_41_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:966:10: lv_tasks_list_41_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getTasks_listEBlockTaskParserRuleCall_8_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_33);
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
            	    	    if ( cnt20 >= 1 ) break loop20;
            	                EarlyExitException eee =
            	                    new EarlyExitException(20, input);
            	                throw eee;
            	        }
            	        cnt20++;
            	    } while (true);

            	    otherlv_42=(Token)match(input,19,FOLLOW_34); 

            	    								newLeafNode(otherlv_42, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_2());
            	    							
            	    // InternalAnsibleDsl.g:987:8: (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==43) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:988:9: otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}'
            	            {
            	            otherlv_43=(Token)match(input,43,FOLLOW_32); 

            	            									newLeafNode(otherlv_43, grammarAccess.getEPlayAccess().getPost_tasksKeyword_8_3_0());
            	            								
            	            // InternalAnsibleDsl.g:992:9: ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+
            	            int cnt21=0;
            	            loop21:
            	            do {
            	                int alt21=2;
            	                int LA21_0 = input.LA(1);

            	                if ( (LA21_0==45||LA21_0==52) ) {
            	                    alt21=1;
            	                }


            	                switch (alt21) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:993:10: (lv_post_tasks_list_44_0= ruleEBlockTask )
            	            	    {
            	            	    // InternalAnsibleDsl.g:993:10: (lv_post_tasks_list_44_0= ruleEBlockTask )
            	            	    // InternalAnsibleDsl.g:994:11: lv_post_tasks_list_44_0= ruleEBlockTask
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getEPlayAccess().getPost_tasks_listEBlockTaskParserRuleCall_8_3_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_33);
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
            	            	    if ( cnt21 >= 1 ) break loop21;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(21, input);
            	                        throw eee;
            	                }
            	                cnt21++;
            	            } while (true);

            	            otherlv_45=(Token)match(input,19,FOLLOW_35); 

            	            									newLeafNode(otherlv_45, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_3_2());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:1016:8: (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==44) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:1017:9: otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}'
            	            {
            	            otherlv_46=(Token)match(input,44,FOLLOW_36); 

            	            									newLeafNode(otherlv_46, grammarAccess.getEPlayAccess().getHandlersKeyword_8_4_0());
            	            								
            	            // InternalAnsibleDsl.g:1021:9: ( (lv_handlers_47_0= ruleEHandler ) )+
            	            int cnt23=0;
            	            loop23:
            	            do {
            	                int alt23=2;
            	                int LA23_0 = input.LA(1);

            	                if ( (LA23_0==59) ) {
            	                    alt23=1;
            	                }


            	                switch (alt23) {
            	            	case 1 :
            	            	    // InternalAnsibleDsl.g:1022:10: (lv_handlers_47_0= ruleEHandler )
            	            	    {
            	            	    // InternalAnsibleDsl.g:1022:10: (lv_handlers_47_0= ruleEHandler )
            	            	    // InternalAnsibleDsl.g:1023:11: lv_handlers_47_0= ruleEHandler
            	            	    {

            	            	    											newCompositeNode(grammarAccess.getEPlayAccess().getHandlersEHandlerParserRuleCall_8_4_1_0());
            	            	    										
            	            	    pushFollow(FOLLOW_37);
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
            	            	    if ( cnt23 >= 1 ) break loop23;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(23, input);
            	                        throw eee;
            	                }
            	                cnt23++;
            	            } while (true);

            	            otherlv_48=(Token)match(input,19,FOLLOW_30); 

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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
    // InternalAnsibleDsl.g:1062:1: entryRuleEBlock returns [EObject current=null] : iv_ruleEBlock= ruleEBlock EOF ;
    public final EObject entryRuleEBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlock = null;


        try {
            // InternalAnsibleDsl.g:1062:47: (iv_ruleEBlock= ruleEBlock EOF )
            // InternalAnsibleDsl.g:1063:2: iv_ruleEBlock= ruleEBlock EOF
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
    // InternalAnsibleDsl.g:1069:1: ruleEBlock returns [EObject current=null] : (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' ) ;
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
            // InternalAnsibleDsl.g:1075:2: ( (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' ) )
            // InternalAnsibleDsl.g:1076:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' )
            {
            // InternalAnsibleDsl.g:1076:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}' )
            // InternalAnsibleDsl.g:1077:3: otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )? otherlv_32= 'tasks{' ( (lv_tasks_33_0= ruleETask ) )+ otherlv_34= '}' (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )? (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )? otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getEBlockAccess().getBlockKeyword_0());
            		
            // InternalAnsibleDsl.g:1081:3: (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:1082:4: otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,46,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEBlockAccess().getBlock_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:1086:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:1087:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:1087:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:1088:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

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

            // InternalAnsibleDsl.g:1105:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==78) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAnsibleDsl.g:1106:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:1106:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:1107:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_40);
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

            // InternalAnsibleDsl.g:1124:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==84) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAnsibleDsl.g:1125:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:1125:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:1126:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_41);
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

            // InternalAnsibleDsl.g:1143:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==87) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAnsibleDsl.g:1144:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:1144:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:1145:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_42);
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

            // InternalAnsibleDsl.g:1162:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAnsibleDsl.g:1163:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getEBlockAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:1167:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:1168:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:1168:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:1169:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_43); 

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

            // InternalAnsibleDsl.g:1186:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnsibleDsl.g:1187:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getEBlockAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:1191:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:1192:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:1192:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:1193:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:1193:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt30=5;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt30=1;
                        }
                        break;
                    case 26:
                        {
                        alt30=2;
                        }
                        break;
                    case 27:
                        {
                        alt30=3;
                        }
                        break;
                    case 28:
                        {
                        alt30=4;
                        }
                        break;
                    case 29:
                        {
                        alt30=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }

                    switch (alt30) {
                        case 1 :
                            // InternalAnsibleDsl.g:1194:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,25,FOLLOW_44); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getEBlockAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:1205:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,26,FOLLOW_44); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getEBlockAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:1216:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,27,FOLLOW_44); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getEBlockAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:1227:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,28,FOLLOW_44); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getEBlockAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEBlockRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:1238:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,29,FOLLOW_44); 

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

            // InternalAnsibleDsl.g:1252:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==30) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnsibleDsl.g:1253:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getEBlockAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:1257:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1258:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1258:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:1259:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_45);
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

            // InternalAnsibleDsl.g:1277:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==31) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnsibleDsl.g:1278:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getEBlockAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:1282:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1283:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1283:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:1284:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_46);
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

            // InternalAnsibleDsl.g:1302:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==32) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAnsibleDsl.g:1303:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getEBlockAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:1307:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1308:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1308:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:1309:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

            // InternalAnsibleDsl.g:1327:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAnsibleDsl.g:1328:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getEBlockAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:1332:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1333:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1333:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:1334:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_48);
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

            // InternalAnsibleDsl.g:1352:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAnsibleDsl.g:1353:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_18, grammarAccess.getEBlockAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:1357:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:1358:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:1358:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:1359:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    // InternalAnsibleDsl.g:1376:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==35) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1377:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,35,FOLLOW_26); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEBlockAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:1381:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:1382:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:1382:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:1383:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getEBlockAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_49); 

                    				newLeafNode(otherlv_22, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1406:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAnsibleDsl.g:1407:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,47,FOLLOW_50); 

                    				newLeafNode(otherlv_23, grammarAccess.getEBlockAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:1411:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:1412:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:1412:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:1413:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
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

                    otherlv_25=(Token)match(input,19,FOLLOW_51); 

                    				newLeafNode(otherlv_25, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1435:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==107) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAnsibleDsl.g:1436:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:1436:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:1437:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getEBlockAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_52);
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

            // InternalAnsibleDsl.g:1454:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAnsibleDsl.g:1455:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,48,FOLLOW_53); 

                    				newLeafNode(otherlv_27, grammarAccess.getEBlockAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:1459:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:1460:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:1460:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:1461:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_54);
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

            // InternalAnsibleDsl.g:1479:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAnsibleDsl.g:1480:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,37,FOLLOW_55); 

                    				newLeafNode(otherlv_29, grammarAccess.getEBlockAccess().getError_handlingKeyword_15_0());
                    			
                    // InternalAnsibleDsl.g:1484:4: ( (lv_error_handling_30_0= ruleEBlockErrorHandling ) )
                    // InternalAnsibleDsl.g:1485:5: (lv_error_handling_30_0= ruleEBlockErrorHandling )
                    {
                    // InternalAnsibleDsl.g:1485:5: (lv_error_handling_30_0= ruleEBlockErrorHandling )
                    // InternalAnsibleDsl.g:1486:6: lv_error_handling_30_0= ruleEBlockErrorHandling
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

                    otherlv_31=(Token)match(input,19,FOLLOW_56); 

                    				newLeafNode(otherlv_31, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            otherlv_32=(Token)match(input,49,FOLLOW_32); 

            			newLeafNode(otherlv_32, grammarAccess.getEBlockAccess().getTasksKeyword_16());
            		
            // InternalAnsibleDsl.g:1512:3: ( (lv_tasks_33_0= ruleETask ) )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==52) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAnsibleDsl.g:1513:4: (lv_tasks_33_0= ruleETask )
            	    {
            	    // InternalAnsibleDsl.g:1513:4: (lv_tasks_33_0= ruleETask )
            	    // InternalAnsibleDsl.g:1514:5: lv_tasks_33_0= ruleETask
            	    {

            	    					newCompositeNode(grammarAccess.getEBlockAccess().getTasksETaskParserRuleCall_17_0());
            	    				
            	    pushFollow(FOLLOW_33);
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
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);

            otherlv_34=(Token)match(input,19,FOLLOW_57); 

            			newLeafNode(otherlv_34, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_18());
            		
            // InternalAnsibleDsl.g:1535:3: (otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAnsibleDsl.g:1536:4: otherlv_35= 'rescue_tasks{' ( (lv_rescue_tasks_36_0= ruleETask ) )+ otherlv_37= '}'
                    {
                    otherlv_35=(Token)match(input,50,FOLLOW_32); 

                    				newLeafNode(otherlv_35, grammarAccess.getEBlockAccess().getRescue_tasksKeyword_19_0());
                    			
                    // InternalAnsibleDsl.g:1540:4: ( (lv_rescue_tasks_36_0= ruleETask ) )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==52) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1541:5: (lv_rescue_tasks_36_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:1541:5: (lv_rescue_tasks_36_0= ruleETask )
                    	    // InternalAnsibleDsl.g:1542:6: lv_rescue_tasks_36_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getRescue_tasksETaskParserRuleCall_19_1_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
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
                    	    if ( cnt43 >= 1 ) break loop43;
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);

                    otherlv_37=(Token)match(input,19,FOLLOW_58); 

                    				newLeafNode(otherlv_37, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_19_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1564:3: (otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAnsibleDsl.g:1565:4: otherlv_38= 'always_tasks{' ( (lv_always_tasks_39_0= ruleETask ) )+ otherlv_40= '}'
                    {
                    otherlv_38=(Token)match(input,51,FOLLOW_32); 

                    				newLeafNode(otherlv_38, grammarAccess.getEBlockAccess().getAlways_tasksKeyword_20_0());
                    			
                    // InternalAnsibleDsl.g:1569:4: ( (lv_always_tasks_39_0= ruleETask ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==52) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1570:5: (lv_always_tasks_39_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:1570:5: (lv_always_tasks_39_0= ruleETask )
                    	    // InternalAnsibleDsl.g:1571:6: lv_always_tasks_39_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getAlways_tasksETaskParserRuleCall_20_1_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
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
                    	    if ( cnt45 >= 1 ) break loop45;
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);

                    otherlv_40=(Token)match(input,19,FOLLOW_8); 

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
    // InternalAnsibleDsl.g:1601:1: entryRuleETask returns [EObject current=null] : iv_ruleETask= ruleETask EOF ;
    public final EObject entryRuleETask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETask = null;


        try {
            // InternalAnsibleDsl.g:1601:46: (iv_ruleETask= ruleETask EOF )
            // InternalAnsibleDsl.g:1602:2: iv_ruleETask= ruleETask EOF
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
    // InternalAnsibleDsl.g:1608:1: ruleETask returns [EObject current=null] : (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' ) ;
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
            // InternalAnsibleDsl.g:1614:2: ( (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' ) )
            // InternalAnsibleDsl.g:1615:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' )
            {
            // InternalAnsibleDsl.g:1615:2: (otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}' )
            // InternalAnsibleDsl.g:1616:3: otherlv_0= 'task{' (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? otherlv_46= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getETaskAccess().getTaskKeyword_0());
            		
            // InternalAnsibleDsl.g:1620:3: (otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:1621:4: otherlv_1= 'task_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,53,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getETaskAccess().getTask_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:1625:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:1626:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:1626:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:1627:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

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

            // InternalAnsibleDsl.g:1644:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==78) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAnsibleDsl.g:1645:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:1645:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:1646:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_61);
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

            // InternalAnsibleDsl.g:1663:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==84) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAnsibleDsl.g:1664:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:1664:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:1665:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_62);
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

            // InternalAnsibleDsl.g:1682:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==87) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAnsibleDsl.g:1683:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:1683:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:1684:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_63);
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

            // InternalAnsibleDsl.g:1701:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==23) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAnsibleDsl.g:1702:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getETaskAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:1706:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:1707:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:1707:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:1708:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_64); 

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

            // InternalAnsibleDsl.g:1725:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==24) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalAnsibleDsl.g:1726:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getETaskAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:1730:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:1731:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:1731:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:1732:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:1732:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt51=5;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt51=1;
                        }
                        break;
                    case 26:
                        {
                        alt51=2;
                        }
                        break;
                    case 27:
                        {
                        alt51=3;
                        }
                        break;
                    case 28:
                        {
                        alt51=4;
                        }
                        break;
                    case 29:
                        {
                        alt51=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }

                    switch (alt51) {
                        case 1 :
                            // InternalAnsibleDsl.g:1733:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,25,FOLLOW_65); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getETaskAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:1744:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,26,FOLLOW_65); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getETaskAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:1755:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,27,FOLLOW_65); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getETaskAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:1766:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,28,FOLLOW_65); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getETaskAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETaskRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:1777:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,29,FOLLOW_65); 

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

            // InternalAnsibleDsl.g:1791:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==30) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalAnsibleDsl.g:1792:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getETaskAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:1796:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1797:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1797:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:1798:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_66);
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

            // InternalAnsibleDsl.g:1816:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalAnsibleDsl.g:1817:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getETaskAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:1821:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1822:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1822:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:1823:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_67);
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

            // InternalAnsibleDsl.g:1841:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==32) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalAnsibleDsl.g:1842:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getETaskAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:1846:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1847:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1847:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:1848:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            // InternalAnsibleDsl.g:1866:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==33) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalAnsibleDsl.g:1867:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getETaskAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:1871:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:1872:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:1872:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:1873:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_69);
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

            // InternalAnsibleDsl.g:1891:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==34) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalAnsibleDsl.g:1892:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_18, grammarAccess.getETaskAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:1896:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:1897:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:1897:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:1898:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    // InternalAnsibleDsl.g:1915:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==35) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1916:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,35,FOLLOW_26); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getETaskAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:1920:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:1921:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:1921:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:1922:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getETaskAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_70); 

                    				newLeafNode(otherlv_22, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1945:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalAnsibleDsl.g:1946:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,47,FOLLOW_50); 

                    				newLeafNode(otherlv_23, grammarAccess.getETaskAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:1950:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:1951:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:1951:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:1952:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
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

                    otherlv_25=(Token)match(input,19,FOLLOW_71); 

                    				newLeafNode(otherlv_25, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1974:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==107) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalAnsibleDsl.g:1975:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:1975:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:1976:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_72);
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

            // InternalAnsibleDsl.g:1993:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==48) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalAnsibleDsl.g:1994:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,48,FOLLOW_53); 

                    				newLeafNode(otherlv_27, grammarAccess.getETaskAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:1998:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:1999:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:1999:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:2000:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_73);
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

            // InternalAnsibleDsl.g:2018:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==37) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalAnsibleDsl.g:2019:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,37,FOLLOW_74); 

                    				newLeafNode(otherlv_29, grammarAccess.getETaskAccess().getError_handlingKeyword_15_0());
                    			
                    // InternalAnsibleDsl.g:2023:4: ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) )
                    // InternalAnsibleDsl.g:2024:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    {
                    // InternalAnsibleDsl.g:2024:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    // InternalAnsibleDsl.g:2025:6: lv_error_handling_30_0= ruleETaskHandlerErrorHandling
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

                    otherlv_31=(Token)match(input,19,FOLLOW_75); 

                    				newLeafNode(otherlv_31, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2047:3: (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==54) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalAnsibleDsl.g:2048:4: otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) )
                    {
                    otherlv_32=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_32, grammarAccess.getETaskAccess().getActionKeyword_16_0());
                    			
                    // InternalAnsibleDsl.g:2052:4: ( (lv_action_33_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2053:5: (lv_action_33_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2053:5: (lv_action_33_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2054:6: lv_action_33_0= RULE_STRING
                    {
                    lv_action_33_0=(Token)match(input,RULE_STRING,FOLLOW_76); 

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

            // InternalAnsibleDsl.g:2071:3: (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==55) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalAnsibleDsl.g:2072:4: otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}'
                    {
                    otherlv_34=(Token)match(input,55,FOLLOW_77); 

                    				newLeafNode(otherlv_34, grammarAccess.getETaskAccess().getAsynchronous_settingsKeyword_17_0());
                    			
                    // InternalAnsibleDsl.g:2076:4: ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) )
                    // InternalAnsibleDsl.g:2077:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    {
                    // InternalAnsibleDsl.g:2077:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    // InternalAnsibleDsl.g:2078:6: lv_asynchronous_settings_35_0= ruleEAsynchronousSettings
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

                    otherlv_36=(Token)match(input,19,FOLLOW_78); 

                    				newLeafNode(otherlv_36, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_17_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2100:3: (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==56) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalAnsibleDsl.g:2101:4: otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) )
                    {
                    otherlv_37=(Token)match(input,56,FOLLOW_79); 

                    				newLeafNode(otherlv_37, grammarAccess.getETaskAccess().getArgsKeyword_18_0());
                    			
                    // InternalAnsibleDsl.g:2105:4: ( (lv_args_38_0= ruleEDictionary ) )
                    // InternalAnsibleDsl.g:2106:5: (lv_args_38_0= ruleEDictionary )
                    {
                    // InternalAnsibleDsl.g:2106:5: (lv_args_38_0= ruleEDictionary )
                    // InternalAnsibleDsl.g:2107:6: lv_args_38_0= ruleEDictionary
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getArgsEDictionaryParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_80);
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

            otherlv_39=(Token)match(input,57,FOLLOW_81); 

            			newLeafNode(otherlv_39, grammarAccess.getETaskAccess().getModule_callKeyword_19());
            		
            // InternalAnsibleDsl.g:2129:3: ( (lv_module_40_0= ruleEModuleCall ) )
            // InternalAnsibleDsl.g:2130:4: (lv_module_40_0= ruleEModuleCall )
            {
            // InternalAnsibleDsl.g:2130:4: (lv_module_40_0= ruleEModuleCall )
            // InternalAnsibleDsl.g:2131:5: lv_module_40_0= ruleEModuleCall
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

            otherlv_41=(Token)match(input,19,FOLLOW_82); 

            			newLeafNode(otherlv_41, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_21());
            		
            // InternalAnsibleDsl.g:2152:3: (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==58) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalAnsibleDsl.g:2153:4: otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    {
                    otherlv_42=(Token)match(input,58,FOLLOW_83); 

                    				newLeafNode(otherlv_42, grammarAccess.getETaskAccess().getNotifyKeyword_22_0());
                    			
                    // InternalAnsibleDsl.g:2157:4: ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    int cnt66=0;
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==RULE_STRING||LA66_0==112) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2158:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    {
                    	    // InternalAnsibleDsl.g:2158:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    // InternalAnsibleDsl.g:2159:6: lv_notifiables_43_0= ruleENotifiable
                    	    {

                    	    						newCompositeNode(grammarAccess.getETaskAccess().getNotifiablesENotifiableParserRuleCall_22_1_0());
                    	    					
                    	    pushFollow(FOLLOW_84);
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
                    	    if ( cnt66 >= 1 ) break loop66;
                                EarlyExitException eee =
                                    new EarlyExitException(66, input);
                                throw eee;
                        }
                        cnt66++;
                    } while (true);


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2177:3: ( (lv_loop_44_0= ruleELoop ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==68||(LA68_0>=75 && LA68_0<=77)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalAnsibleDsl.g:2178:4: (lv_loop_44_0= ruleELoop )
                    {
                    // InternalAnsibleDsl.g:2178:4: (lv_loop_44_0= ruleELoop )
                    // InternalAnsibleDsl.g:2179:5: lv_loop_44_0= ruleELoop
                    {

                    					newCompositeNode(grammarAccess.getETaskAccess().getLoopELoopParserRuleCall_23_0());
                    				
                    pushFollow(FOLLOW_85);
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

            // InternalAnsibleDsl.g:2196:3: ( (lv_register_45_0= ruleERegisterVariable ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==144) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalAnsibleDsl.g:2197:4: (lv_register_45_0= ruleERegisterVariable )
                    {
                    // InternalAnsibleDsl.g:2197:4: (lv_register_45_0= ruleERegisterVariable )
                    // InternalAnsibleDsl.g:2198:5: lv_register_45_0= ruleERegisterVariable
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
    // InternalAnsibleDsl.g:2223:1: entryRuleEHandler returns [EObject current=null] : iv_ruleEHandler= ruleEHandler EOF ;
    public final EObject entryRuleEHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHandler = null;


        try {
            // InternalAnsibleDsl.g:2223:49: (iv_ruleEHandler= ruleEHandler EOF )
            // InternalAnsibleDsl.g:2224:2: iv_ruleEHandler= ruleEHandler EOF
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
    // InternalAnsibleDsl.g:2230:1: ruleEHandler returns [EObject current=null] : (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' ) ;
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
            // InternalAnsibleDsl.g:2236:2: ( (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' ) )
            // InternalAnsibleDsl.g:2237:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' )
            {
            // InternalAnsibleDsl.g:2237:2: (otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}' )
            // InternalAnsibleDsl.g:2238:3: otherlv_0= 'handler{' (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )? (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )? (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )? (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )? otherlv_39= 'module_call{' ( (lv_module_40_0= ruleEModuleCall ) ) otherlv_41= '}' (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )? ( (lv_loop_44_0= ruleELoop ) )? ( (lv_register_45_0= ruleERegisterVariable ) )? (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )? otherlv_48= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_86); 

            			newLeafNode(otherlv_0, grammarAccess.getEHandlerAccess().getHandlerKeyword_0());
            		
            // InternalAnsibleDsl.g:2242:3: (otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:2243:4: otherlv_1= 'handler_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,60,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEHandlerAccess().getHandler_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:2247:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2248:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2248:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:2249:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

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

            // InternalAnsibleDsl.g:2266:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==78) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalAnsibleDsl.g:2267:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:2267:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:2268:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_61);
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

            // InternalAnsibleDsl.g:2285:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==84) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalAnsibleDsl.g:2286:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:2286:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:2287:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_62);
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

            // InternalAnsibleDsl.g:2304:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==87) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAnsibleDsl.g:2305:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:2305:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:2306:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_63);
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

            // InternalAnsibleDsl.g:2323:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==23) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAnsibleDsl.g:2324:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getEHandlerAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:2328:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:2329:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:2329:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:2330:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_64); 

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

            // InternalAnsibleDsl.g:2347:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==24) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAnsibleDsl.g:2348:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getEHandlerAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:2352:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:2353:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:2353:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:2354:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:2354:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt74=5;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt74=1;
                        }
                        break;
                    case 26:
                        {
                        alt74=2;
                        }
                        break;
                    case 27:
                        {
                        alt74=3;
                        }
                        break;
                    case 28:
                        {
                        alt74=4;
                        }
                        break;
                    case 29:
                        {
                        alt74=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }

                    switch (alt74) {
                        case 1 :
                            // InternalAnsibleDsl.g:2355:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,25,FOLLOW_65); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getEHandlerAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:2366:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,26,FOLLOW_65); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getEHandlerAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:2377:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,27,FOLLOW_65); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getEHandlerAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:2388:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,28,FOLLOW_65); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getEHandlerAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEHandlerRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:2399:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,29,FOLLOW_65); 

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

            // InternalAnsibleDsl.g:2413:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==30) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAnsibleDsl.g:2414:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getEHandlerAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:2418:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2419:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2419:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:2420:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_66);
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

            // InternalAnsibleDsl.g:2438:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==31) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAnsibleDsl.g:2439:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getEHandlerAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:2443:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2444:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2444:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:2445:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_67);
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

            // InternalAnsibleDsl.g:2463:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==32) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAnsibleDsl.g:2464:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getEHandlerAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:2468:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2469:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2469:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:2470:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_68);
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

            // InternalAnsibleDsl.g:2488:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==33) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalAnsibleDsl.g:2489:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getEHandlerAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:2493:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:2494:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:2494:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:2495:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_69);
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

            // InternalAnsibleDsl.g:2513:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==34) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalAnsibleDsl.g:2514:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_18, grammarAccess.getEHandlerAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:2518:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:2519:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:2519:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:2520:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    // InternalAnsibleDsl.g:2537:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==35) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2538:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,35,FOLLOW_26); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getEHandlerAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:2542:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:2543:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:2543:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:2544:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getEHandlerAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_70); 

                    				newLeafNode(otherlv_22, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2567:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==47) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalAnsibleDsl.g:2568:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,47,FOLLOW_50); 

                    				newLeafNode(otherlv_23, grammarAccess.getEHandlerAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:2572:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:2573:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:2573:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:2574:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
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

                    otherlv_25=(Token)match(input,19,FOLLOW_71); 

                    				newLeafNode(otherlv_25, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2596:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==107) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAnsibleDsl.g:2597:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:2597:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:2598:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_72);
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

            // InternalAnsibleDsl.g:2615:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==48) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalAnsibleDsl.g:2616:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,48,FOLLOW_53); 

                    				newLeafNode(otherlv_27, grammarAccess.getEHandlerAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:2620:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:2621:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:2621:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:2622:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_14_1_0());
                    					
                    pushFollow(FOLLOW_73);
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

            // InternalAnsibleDsl.g:2640:3: (otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==37) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAnsibleDsl.g:2641:4: otherlv_29= 'error_handling{' ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) ) otherlv_31= '}'
                    {
                    otherlv_29=(Token)match(input,37,FOLLOW_74); 

                    				newLeafNode(otherlv_29, grammarAccess.getEHandlerAccess().getError_handlingKeyword_15_0());
                    			
                    // InternalAnsibleDsl.g:2645:4: ( (lv_error_handling_30_0= ruleETaskHandlerErrorHandling ) )
                    // InternalAnsibleDsl.g:2646:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    {
                    // InternalAnsibleDsl.g:2646:5: (lv_error_handling_30_0= ruleETaskHandlerErrorHandling )
                    // InternalAnsibleDsl.g:2647:6: lv_error_handling_30_0= ruleETaskHandlerErrorHandling
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

                    otherlv_31=(Token)match(input,19,FOLLOW_75); 

                    				newLeafNode(otherlv_31, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_15_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2669:3: (otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==54) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAnsibleDsl.g:2670:4: otherlv_32= 'action:' ( (lv_action_33_0= RULE_STRING ) )
                    {
                    otherlv_32=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_32, grammarAccess.getEHandlerAccess().getActionKeyword_16_0());
                    			
                    // InternalAnsibleDsl.g:2674:4: ( (lv_action_33_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2675:5: (lv_action_33_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2675:5: (lv_action_33_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2676:6: lv_action_33_0= RULE_STRING
                    {
                    lv_action_33_0=(Token)match(input,RULE_STRING,FOLLOW_76); 

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

            // InternalAnsibleDsl.g:2693:3: (otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==55) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAnsibleDsl.g:2694:4: otherlv_34= 'asynchronous_settings{' ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) ) otherlv_36= '}'
                    {
                    otherlv_34=(Token)match(input,55,FOLLOW_77); 

                    				newLeafNode(otherlv_34, grammarAccess.getEHandlerAccess().getAsynchronous_settingsKeyword_17_0());
                    			
                    // InternalAnsibleDsl.g:2698:4: ( (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings ) )
                    // InternalAnsibleDsl.g:2699:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    {
                    // InternalAnsibleDsl.g:2699:5: (lv_asynchronous_settings_35_0= ruleEAsynchronousSettings )
                    // InternalAnsibleDsl.g:2700:6: lv_asynchronous_settings_35_0= ruleEAsynchronousSettings
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

                    otherlv_36=(Token)match(input,19,FOLLOW_78); 

                    				newLeafNode(otherlv_36, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_17_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2722:3: (otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) ) )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==56) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalAnsibleDsl.g:2723:4: otherlv_37= 'args:' ( (lv_args_38_0= ruleEDictionary ) )
                    {
                    otherlv_37=(Token)match(input,56,FOLLOW_79); 

                    				newLeafNode(otherlv_37, grammarAccess.getEHandlerAccess().getArgsKeyword_18_0());
                    			
                    // InternalAnsibleDsl.g:2727:4: ( (lv_args_38_0= ruleEDictionary ) )
                    // InternalAnsibleDsl.g:2728:5: (lv_args_38_0= ruleEDictionary )
                    {
                    // InternalAnsibleDsl.g:2728:5: (lv_args_38_0= ruleEDictionary )
                    // InternalAnsibleDsl.g:2729:6: lv_args_38_0= ruleEDictionary
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getArgsEDictionaryParserRuleCall_18_1_0());
                    					
                    pushFollow(FOLLOW_80);
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

            otherlv_39=(Token)match(input,57,FOLLOW_81); 

            			newLeafNode(otherlv_39, grammarAccess.getEHandlerAccess().getModule_callKeyword_19());
            		
            // InternalAnsibleDsl.g:2751:3: ( (lv_module_40_0= ruleEModuleCall ) )
            // InternalAnsibleDsl.g:2752:4: (lv_module_40_0= ruleEModuleCall )
            {
            // InternalAnsibleDsl.g:2752:4: (lv_module_40_0= ruleEModuleCall )
            // InternalAnsibleDsl.g:2753:5: lv_module_40_0= ruleEModuleCall
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

            otherlv_41=(Token)match(input,19,FOLLOW_87); 

            			newLeafNode(otherlv_41, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_21());
            		
            // InternalAnsibleDsl.g:2774:3: (otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+ )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==58) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAnsibleDsl.g:2775:4: otherlv_42= 'notify:' ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    {
                    otherlv_42=(Token)match(input,58,FOLLOW_83); 

                    				newLeafNode(otherlv_42, grammarAccess.getEHandlerAccess().getNotifyKeyword_22_0());
                    			
                    // InternalAnsibleDsl.g:2779:4: ( (lv_notifiables_43_0= ruleENotifiable ) )+
                    int cnt89=0;
                    loop89:
                    do {
                        int alt89=2;
                        int LA89_0 = input.LA(1);

                        if ( (LA89_0==RULE_STRING||LA89_0==112) ) {
                            alt89=1;
                        }


                        switch (alt89) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2780:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    {
                    	    // InternalAnsibleDsl.g:2780:5: (lv_notifiables_43_0= ruleENotifiable )
                    	    // InternalAnsibleDsl.g:2781:6: lv_notifiables_43_0= ruleENotifiable
                    	    {

                    	    						newCompositeNode(grammarAccess.getEHandlerAccess().getNotifiablesENotifiableParserRuleCall_22_1_0());
                    	    					
                    	    pushFollow(FOLLOW_88);
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
                    	    if ( cnt89 >= 1 ) break loop89;
                                EarlyExitException eee =
                                    new EarlyExitException(89, input);
                                throw eee;
                        }
                        cnt89++;
                    } while (true);


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2799:3: ( (lv_loop_44_0= ruleELoop ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==68||(LA91_0>=75 && LA91_0<=77)) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalAnsibleDsl.g:2800:4: (lv_loop_44_0= ruleELoop )
                    {
                    // InternalAnsibleDsl.g:2800:4: (lv_loop_44_0= ruleELoop )
                    // InternalAnsibleDsl.g:2801:5: lv_loop_44_0= ruleELoop
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getLoopELoopParserRuleCall_23_0());
                    				
                    pushFollow(FOLLOW_89);
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

            // InternalAnsibleDsl.g:2818:3: ( (lv_register_45_0= ruleERegisterVariable ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==144) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalAnsibleDsl.g:2819:4: (lv_register_45_0= ruleERegisterVariable )
                    {
                    // InternalAnsibleDsl.g:2819:4: (lv_register_45_0= ruleERegisterVariable )
                    // InternalAnsibleDsl.g:2820:5: lv_register_45_0= ruleERegisterVariable
                    {

                    					newCompositeNode(grammarAccess.getEHandlerAccess().getRegisterERegisterVariableParserRuleCall_24_0());
                    				
                    pushFollow(FOLLOW_90);
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

            // InternalAnsibleDsl.g:2837:3: (otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+ )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==61) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalAnsibleDsl.g:2838:4: otherlv_46= 'listen:' ( (otherlv_47= RULE_STRING ) )+
                    {
                    otherlv_46=(Token)match(input,61,FOLLOW_4); 

                    				newLeafNode(otherlv_46, grammarAccess.getEHandlerAccess().getListenKeyword_25_0());
                    			
                    // InternalAnsibleDsl.g:2842:4: ( (otherlv_47= RULE_STRING ) )+
                    int cnt93=0;
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==RULE_STRING) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2843:5: (otherlv_47= RULE_STRING )
                    	    {
                    	    // InternalAnsibleDsl.g:2843:5: (otherlv_47= RULE_STRING )
                    	    // InternalAnsibleDsl.g:2844:6: otherlv_47= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEHandlerRule());
                    	    						}
                    	    					
                    	    otherlv_47=(Token)match(input,RULE_STRING,FOLLOW_91); 

                    	    						newLeafNode(otherlv_47, grammarAccess.getEHandlerAccess().getListen_toENotifiedTopicCrossReference_25_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt93 >= 1 ) break loop93;
                                EarlyExitException eee =
                                    new EarlyExitException(93, input);
                                throw eee;
                        }
                        cnt93++;
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
    // InternalAnsibleDsl.g:2864:1: entryRuleEModuleCall returns [EObject current=null] : iv_ruleEModuleCall= ruleEModuleCall EOF ;
    public final EObject entryRuleEModuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModuleCall = null;


        try {
            // InternalAnsibleDsl.g:2864:52: (iv_ruleEModuleCall= ruleEModuleCall EOF )
            // InternalAnsibleDsl.g:2865:2: iv_ruleEModuleCall= ruleEModuleCall EOF
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
    // InternalAnsibleDsl.g:2871:1: ruleEModuleCall returns [EObject current=null] : (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) ;
    public final EObject ruleEModuleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2877:2: ( (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:2878:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:2878:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:2879:3: otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getEModuleCallAccess().getModule_nameKeyword_0());
            		
            // InternalAnsibleDsl.g:2883:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:2884:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:2884:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:2885:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_92); 

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

            otherlv_2=(Token)match(input,63,FOLLOW_93); 

            			newLeafNode(otherlv_2, grammarAccess.getEModuleCallAccess().getParametersKeyword_2());
            		
            // InternalAnsibleDsl.g:2905:3: ( (lv_parameters_3_0= ruleEParameter ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==RULE_ID) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2906:4: (lv_parameters_3_0= ruleEParameter )
            	    {
            	    // InternalAnsibleDsl.g:2906:4: (lv_parameters_3_0= ruleEParameter )
            	    // InternalAnsibleDsl.g:2907:5: lv_parameters_3_0= ruleEParameter
            	    {

            	    					newCompositeNode(grammarAccess.getEModuleCallAccess().getParametersEParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_93);
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
            	    break loop95;
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
    // InternalAnsibleDsl.g:2932:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalAnsibleDsl.g:2932:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalAnsibleDsl.g:2933:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalAnsibleDsl.g:2939:1: ruleEParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2945:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) )
            // InternalAnsibleDsl.g:2946:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            {
            // InternalAnsibleDsl.g:2946:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            // InternalAnsibleDsl.g:2947:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) )
            {
            // InternalAnsibleDsl.g:2947:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:2948:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:2948:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:2949:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_94); 

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

            otherlv_1=(Token)match(input,64,FOLLOW_95); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:2969:3: ( (lv_value_passed_2_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:2970:4: (lv_value_passed_2_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:2970:4: (lv_value_passed_2_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:2971:5: lv_value_passed_2_0= ruleEValuePassed
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
    // InternalAnsibleDsl.g:2992:1: entryRuleERoleInclusion returns [EObject current=null] : iv_ruleERoleInclusion= ruleERoleInclusion EOF ;
    public final EObject entryRuleERoleInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusion = null;


        try {
            // InternalAnsibleDsl.g:2992:55: (iv_ruleERoleInclusion= ruleERoleInclusion EOF )
            // InternalAnsibleDsl.g:2993:2: iv_ruleERoleInclusion= ruleERoleInclusion EOF
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
    // InternalAnsibleDsl.g:2999:1: ruleERoleInclusion returns [EObject current=null] : (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' ) ;
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
            // InternalAnsibleDsl.g:3005:2: ( (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' ) )
            // InternalAnsibleDsl.g:3006:2: (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' )
            {
            // InternalAnsibleDsl.g:3006:2: (otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}' )
            // InternalAnsibleDsl.g:3007:3: otherlv_0= 'role{' (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )? ( (lv_delegation_26_0= ruleEDelegation ) )? (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_96); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionAccess().getRoleKeyword_0());
            		
            // InternalAnsibleDsl.g:3011:3: (otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:3012:4: otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,66,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getERoleInclusionAccess().getRole_nameKeyword_1_0());
            			
            // InternalAnsibleDsl.g:3016:4: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:3017:5: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:3017:5: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:3018:6: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_97); 

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

            // InternalAnsibleDsl.g:3035:3: ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==78) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalAnsibleDsl.g:3036:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    {
                    // InternalAnsibleDsl.g:3036:4: (lv_privilage_escalation_3_0= ruleEPrivilageEscalation )
                    // InternalAnsibleDsl.g:3037:5: lv_privilage_escalation_3_0= ruleEPrivilageEscalation
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_98);
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

            // InternalAnsibleDsl.g:3054:3: ( (lv_validation_mode_4_0= ruleEValidationMode ) )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==84) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalAnsibleDsl.g:3055:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    {
                    // InternalAnsibleDsl.g:3055:4: (lv_validation_mode_4_0= ruleEValidationMode )
                    // InternalAnsibleDsl.g:3056:5: lv_validation_mode_4_0= ruleEValidationMode
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getValidation_modeEValidationModeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_99);
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

            // InternalAnsibleDsl.g:3073:3: ( (lv_connection_5_0= ruleEConnection ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==87) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalAnsibleDsl.g:3074:4: (lv_connection_5_0= ruleEConnection )
                    {
                    // InternalAnsibleDsl.g:3074:4: (lv_connection_5_0= ruleEConnection )
                    // InternalAnsibleDsl.g:3075:5: lv_connection_5_0= ruleEConnection
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getConnectionEConnectionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_100);
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

            // InternalAnsibleDsl.g:3092:3: (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==23) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalAnsibleDsl.g:3093:4: otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getERoleInclusionAccess().getNo_logKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3097:4: ( (lv_no_log_7_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3098:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3098:5: (lv_no_log_7_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3099:6: lv_no_log_7_0= RULE_BOOLEAN
                    {
                    lv_no_log_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_101); 

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

            // InternalAnsibleDsl.g:3116:3: (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==24) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalAnsibleDsl.g:3117:4: otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getERoleInclusionAccess().getDebuggerKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3121:4: ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) )
                    // InternalAnsibleDsl.g:3122:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    {
                    // InternalAnsibleDsl.g:3122:5: ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) )
                    // InternalAnsibleDsl.g:3123:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    {
                    // InternalAnsibleDsl.g:3123:6: (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' )
                    int alt100=5;
                    switch ( input.LA(1) ) {
                    case 25:
                        {
                        alt100=1;
                        }
                        break;
                    case 26:
                        {
                        alt100=2;
                        }
                        break;
                    case 27:
                        {
                        alt100=3;
                        }
                        break;
                    case 28:
                        {
                        alt100=4;
                        }
                        break;
                    case 29:
                        {
                        alt100=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }

                    switch (alt100) {
                        case 1 :
                            // InternalAnsibleDsl.g:3124:7: lv_debugger_9_1= 'always'
                            {
                            lv_debugger_9_1=(Token)match(input,25,FOLLOW_102); 

                            							newLeafNode(lv_debugger_9_1, grammarAccess.getERoleInclusionAccess().getDebuggerAlwaysKeyword_6_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:3135:7: lv_debugger_9_2= 'never'
                            {
                            lv_debugger_9_2=(Token)match(input,26,FOLLOW_102); 

                            							newLeafNode(lv_debugger_9_2, grammarAccess.getERoleInclusionAccess().getDebuggerNeverKeyword_6_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:3146:7: lv_debugger_9_3= 'on_failed'
                            {
                            lv_debugger_9_3=(Token)match(input,27,FOLLOW_102); 

                            							newLeafNode(lv_debugger_9_3, grammarAccess.getERoleInclusionAccess().getDebuggerOn_failedKeyword_6_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:3157:7: lv_debugger_9_4= 'on_unreachable'
                            {
                            lv_debugger_9_4=(Token)match(input,28,FOLLOW_102); 

                            							newLeafNode(lv_debugger_9_4, grammarAccess.getERoleInclusionAccess().getDebuggerOn_unreachableKeyword_6_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getERoleInclusionRule());
                            							}
                            							setWithLastConsumed(current, "debugger", lv_debugger_9_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:3168:7: lv_debugger_9_5= 'on_skipped'
                            {
                            lv_debugger_9_5=(Token)match(input,29,FOLLOW_102); 

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

            // InternalAnsibleDsl.g:3182:3: (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==30) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalAnsibleDsl.g:3183:4: otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) )
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getERoleInclusionAccess().getModule_defaultsKeyword_7_0());
                    			
                    // InternalAnsibleDsl.g:3187:4: ( (lv_module_defaults_11_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3188:5: (lv_module_defaults_11_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3188:5: (lv_module_defaults_11_0= ruleEList )
                    // InternalAnsibleDsl.g:3189:6: lv_module_defaults_11_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getModule_defaultsEListParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_103);
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

            // InternalAnsibleDsl.g:3207:3: (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==31) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalAnsibleDsl.g:3208:4: otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) )
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getERoleInclusionAccess().getEnvironmentKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:3212:4: ( (lv_environment_13_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3213:5: (lv_environment_13_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3213:5: (lv_environment_13_0= ruleEList )
                    // InternalAnsibleDsl.g:3214:6: lv_environment_13_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getEnvironmentEListParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_104);
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

            // InternalAnsibleDsl.g:3232:3: (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==32) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalAnsibleDsl.g:3233:4: otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) )
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_21); 

                    				newLeafNode(otherlv_14, grammarAccess.getERoleInclusionAccess().getCollectionsKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:3237:4: ( (lv_collections_15_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3238:5: (lv_collections_15_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3238:5: (lv_collections_15_0= ruleEList )
                    // InternalAnsibleDsl.g:3239:6: lv_collections_15_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getCollectionsEListParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_105);
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

            // InternalAnsibleDsl.g:3257:3: (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==33) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalAnsibleDsl.g:3258:4: otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) )
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getERoleInclusionAccess().getTagsKeyword_10_0());
                    			
                    // InternalAnsibleDsl.g:3262:4: ( (lv_tags_17_0= ruleEList ) )
                    // InternalAnsibleDsl.g:3263:5: (lv_tags_17_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:3263:5: (lv_tags_17_0= ruleEList )
                    // InternalAnsibleDsl.g:3264:6: lv_tags_17_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getTagsEListParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_106);
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

            // InternalAnsibleDsl.g:3282:3: (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==34) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalAnsibleDsl.g:3283:4: otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}'
                    {
                    otherlv_18=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_18, grammarAccess.getERoleInclusionAccess().getVarsKeyword_11_0());
                    			
                    // InternalAnsibleDsl.g:3287:4: ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) )
                    // InternalAnsibleDsl.g:3288:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    {
                    // InternalAnsibleDsl.g:3288:5: (lv_variable_declarations_19_0= ruleEVariableDeclaration )
                    // InternalAnsibleDsl.g:3289:6: lv_variable_declarations_19_0= ruleEVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    // InternalAnsibleDsl.g:3306:4: (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==35) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:3307:5: otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    {
                    	    otherlv_20=(Token)match(input,35,FOLLOW_26); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getERoleInclusionAccess().getCommaKeyword_11_2_0());
                    	    				
                    	    // InternalAnsibleDsl.g:3311:5: ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) )
                    	    // InternalAnsibleDsl.g:3312:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    {
                    	    // InternalAnsibleDsl.g:3312:6: (lv_variable_declarations_21_0= ruleEVariableDeclaration )
                    	    // InternalAnsibleDsl.g:3313:7: lv_variable_declarations_21_0= ruleEVariableDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getERoleInclusionAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_11_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop106;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,19,FOLLOW_107); 

                    				newLeafNode(otherlv_22, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_11_3());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:3336:3: (otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==47) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalAnsibleDsl.g:3337:4: otherlv_23= 'exe_settings{' ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) ) otherlv_25= '}'
                    {
                    otherlv_23=(Token)match(input,47,FOLLOW_50); 

                    				newLeafNode(otherlv_23, grammarAccess.getERoleInclusionAccess().getExe_settingsKeyword_12_0());
                    			
                    // InternalAnsibleDsl.g:3341:4: ( (lv_exe_settings_24_0= ruleEExecutionExeSettings ) )
                    // InternalAnsibleDsl.g:3342:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    {
                    // InternalAnsibleDsl.g:3342:5: (lv_exe_settings_24_0= ruleEExecutionExeSettings )
                    // InternalAnsibleDsl.g:3343:6: lv_exe_settings_24_0= ruleEExecutionExeSettings
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

                    otherlv_25=(Token)match(input,19,FOLLOW_108); 

                    				newLeafNode(otherlv_25, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_12_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:3365:3: ( (lv_delegation_26_0= ruleEDelegation ) )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==107) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalAnsibleDsl.g:3366:4: (lv_delegation_26_0= ruleEDelegation )
                    {
                    // InternalAnsibleDsl.g:3366:4: (lv_delegation_26_0= ruleEDelegation )
                    // InternalAnsibleDsl.g:3367:5: lv_delegation_26_0= ruleEDelegation
                    {

                    					newCompositeNode(grammarAccess.getERoleInclusionAccess().getDelegationEDelegationParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_109);
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

            // InternalAnsibleDsl.g:3384:3: (otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==48) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalAnsibleDsl.g:3385:4: otherlv_27= 'when:' ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_27=(Token)match(input,48,FOLLOW_53); 

                    				newLeafNode(otherlv_27, grammarAccess.getERoleInclusionAccess().getWhenKeyword_14_0());
                    			
                    // InternalAnsibleDsl.g:3389:4: ( (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:3390:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:3390:5: (lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:3391:6: lv_when_expression_28_0= ruleEJinjaExpressionEvaluationWithoutBrackets
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
    // InternalAnsibleDsl.g:3417:1: entryRuleERoleInclusions returns [EObject current=null] : iv_ruleERoleInclusions= ruleERoleInclusions EOF ;
    public final EObject entryRuleERoleInclusions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusions = null;


        try {
            // InternalAnsibleDsl.g:3417:56: (iv_ruleERoleInclusions= ruleERoleInclusions EOF )
            // InternalAnsibleDsl.g:3418:2: iv_ruleERoleInclusions= ruleERoleInclusions EOF
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
    // InternalAnsibleDsl.g:3424:1: ruleERoleInclusions returns [EObject current=null] : (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' ) ;
    public final EObject ruleERoleInclusions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_roles_1_0 = null;

        EObject lv_roles_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3430:2: ( (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' ) )
            // InternalAnsibleDsl.g:3431:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' )
            {
            // InternalAnsibleDsl.g:3431:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}' )
            // InternalAnsibleDsl.g:3432:3: otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) ) ( (lv_roles_2_0= ruleERoleInclusion ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_110); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionsAccess().getRoles_inclusionsKeyword_0());
            		
            // InternalAnsibleDsl.g:3436:3: ( (lv_roles_1_0= ruleERoleInclusion ) )
            // InternalAnsibleDsl.g:3437:4: (lv_roles_1_0= ruleERoleInclusion )
            {
            // InternalAnsibleDsl.g:3437:4: (lv_roles_1_0= ruleERoleInclusion )
            // InternalAnsibleDsl.g:3438:5: lv_roles_1_0= ruleERoleInclusion
            {

            					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_111);
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

            // InternalAnsibleDsl.g:3455:3: ( (lv_roles_2_0= ruleERoleInclusion ) )*
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==65) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3456:4: (lv_roles_2_0= ruleERoleInclusion )
            	    {
            	    // InternalAnsibleDsl.g:3456:4: (lv_roles_2_0= ruleERoleInclusion )
            	    // InternalAnsibleDsl.g:3457:5: lv_roles_2_0= ruleERoleInclusion
            	    {

            	    					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_111);
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
            	    break loop111;
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
    // InternalAnsibleDsl.g:3482:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalAnsibleDsl.g:3482:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalAnsibleDsl.g:3483:2: iv_ruleELoop= ruleELoop EOF
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
    // InternalAnsibleDsl.g:3489:1: ruleELoop returns [EObject current=null] : (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        EObject this_ELoopOverList_0 = null;

        EObject this_EUntil_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3495:2: ( (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) )
            // InternalAnsibleDsl.g:3496:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            {
            // InternalAnsibleDsl.g:3496:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==68) ) {
                alt112=1;
            }
            else if ( ((LA112_0>=75 && LA112_0<=77)) ) {
                alt112=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalAnsibleDsl.g:3497:3: this_ELoopOverList_0= ruleELoopOverList
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
                    // InternalAnsibleDsl.g:3506:3: this_EUntil_1= ruleEUntil
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
    // InternalAnsibleDsl.g:3518:1: entryRuleELoopOverList returns [EObject current=null] : iv_ruleELoopOverList= ruleELoopOverList EOF ;
    public final EObject entryRuleELoopOverList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopOverList = null;


        try {
            // InternalAnsibleDsl.g:3518:54: (iv_ruleELoopOverList= ruleELoopOverList EOF )
            // InternalAnsibleDsl.g:3519:2: iv_ruleELoopOverList= ruleELoopOverList EOF
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
    // InternalAnsibleDsl.g:3525:1: ruleELoopOverList returns [EObject current=null] : (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) ;
    public final EObject ruleELoopOverList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_loop_list_1_0 = null;

        EObject lv_loop_control_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3531:2: ( (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? ) )
            // InternalAnsibleDsl.g:3532:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            {
            // InternalAnsibleDsl.g:3532:2: (otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )? )
            // InternalAnsibleDsl.g:3533:3: otherlv_0= 'loop:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) ( (lv_loop_control_2_0= ruleELoopControl ) )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_95); 

            			newLeafNode(otherlv_0, grammarAccess.getELoopOverListAccess().getLoopKeyword_0());
            		
            // InternalAnsibleDsl.g:3537:3: ( (lv_loop_list_1_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:3538:4: (lv_loop_list_1_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:3538:4: (lv_loop_list_1_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:3539:5: lv_loop_list_1_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getELoopOverListAccess().getLoop_listEValuePassedParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_112);
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

            // InternalAnsibleDsl.g:3556:3: ( (lv_loop_control_2_0= ruleELoopControl ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==69) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // InternalAnsibleDsl.g:3557:4: (lv_loop_control_2_0= ruleELoopControl )
                    {
                    // InternalAnsibleDsl.g:3557:4: (lv_loop_control_2_0= ruleELoopControl )
                    // InternalAnsibleDsl.g:3558:5: lv_loop_control_2_0= ruleELoopControl
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
    // InternalAnsibleDsl.g:3579:1: entryRuleELoopControl returns [EObject current=null] : iv_ruleELoopControl= ruleELoopControl EOF ;
    public final EObject entryRuleELoopControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopControl = null;


        try {
            // InternalAnsibleDsl.g:3579:53: (iv_ruleELoopControl= ruleELoopControl EOF )
            // InternalAnsibleDsl.g:3580:2: iv_ruleELoopControl= ruleELoopControl EOF
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
    // InternalAnsibleDsl.g:3586:1: ruleELoopControl returns [EObject current=null] : ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:3592:2: ( ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:3593:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:3593:2: ( () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:3594:3: () otherlv_1= 'loop_control{' (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )? (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )? (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:3594:3: ()
            // InternalAnsibleDsl.g:3595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getELoopControlAccess().getELoopControlAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_113); 

            			newLeafNode(otherlv_1, grammarAccess.getELoopControlAccess().getLoop_controlKeyword_1());
            		
            // InternalAnsibleDsl.g:3605:3: (otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) ) )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==70) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalAnsibleDsl.g:3606:4: otherlv_2= 'label:' ( (lv_label_3_0= ruleEValuePassed ) )
                    {
                    otherlv_2=(Token)match(input,70,FOLLOW_95); 

                    				newLeafNode(otherlv_2, grammarAccess.getELoopControlAccess().getLabelKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3610:4: ( (lv_label_3_0= ruleEValuePassed ) )
                    // InternalAnsibleDsl.g:3611:5: (lv_label_3_0= ruleEValuePassed )
                    {
                    // InternalAnsibleDsl.g:3611:5: (lv_label_3_0= ruleEValuePassed )
                    // InternalAnsibleDsl.g:3612:6: lv_label_3_0= ruleEValuePassed
                    {

                    						newCompositeNode(grammarAccess.getELoopControlAccess().getLabelEValuePassedParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_114);
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

            // InternalAnsibleDsl.g:3630:3: (otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==71) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalAnsibleDsl.g:3631:4: otherlv_4= 'pause:' ( (lv_pause_5_0= RULE_NUMBER ) )
                    {
                    otherlv_4=(Token)match(input,71,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getELoopControlAccess().getPauseKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3635:4: ( (lv_pause_5_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:3636:5: (lv_pause_5_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:3636:5: (lv_pause_5_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:3637:6: lv_pause_5_0= RULE_NUMBER
                    {
                    lv_pause_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_116); 

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

            // InternalAnsibleDsl.g:3654:3: (otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==72) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // InternalAnsibleDsl.g:3655:4: otherlv_6= 'index_var:' ( (lv_index_var_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,72,FOLLOW_26); 

                    				newLeafNode(otherlv_6, grammarAccess.getELoopControlAccess().getIndex_varKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3659:4: ( (lv_index_var_7_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:3660:5: (lv_index_var_7_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:3660:5: (lv_index_var_7_0= RULE_ID )
                    // InternalAnsibleDsl.g:3661:6: lv_index_var_7_0= RULE_ID
                    {
                    lv_index_var_7_0=(Token)match(input,RULE_ID,FOLLOW_117); 

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

            // InternalAnsibleDsl.g:3678:3: (otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==73) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalAnsibleDsl.g:3679:4: otherlv_8= 'loop_var:' ( (lv_loop_var_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,73,FOLLOW_26); 

                    				newLeafNode(otherlv_8, grammarAccess.getELoopControlAccess().getLoop_varKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3683:4: ( (lv_loop_var_9_0= RULE_ID ) )
                    // InternalAnsibleDsl.g:3684:5: (lv_loop_var_9_0= RULE_ID )
                    {
                    // InternalAnsibleDsl.g:3684:5: (lv_loop_var_9_0= RULE_ID )
                    // InternalAnsibleDsl.g:3685:6: lv_loop_var_9_0= RULE_ID
                    {
                    lv_loop_var_9_0=(Token)match(input,RULE_ID,FOLLOW_118); 

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

            // InternalAnsibleDsl.g:3702:3: (otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) ) )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==74) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalAnsibleDsl.g:3703:4: otherlv_10= 'extended:' ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    {
                    otherlv_10=(Token)match(input,74,FOLLOW_17); 

                    				newLeafNode(otherlv_10, grammarAccess.getELoopControlAccess().getExtendedKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3707:4: ( (lv_extended_11_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3708:5: (lv_extended_11_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3708:5: (lv_extended_11_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3709:6: lv_extended_11_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:3734:1: entryRuleEUntil returns [EObject current=null] : iv_ruleEUntil= ruleEUntil EOF ;
    public final EObject entryRuleEUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUntil = null;


        try {
            // InternalAnsibleDsl.g:3734:47: (iv_ruleEUntil= ruleEUntil EOF )
            // InternalAnsibleDsl.g:3735:2: iv_ruleEUntil= ruleEUntil EOF
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
    // InternalAnsibleDsl.g:3741:1: ruleEUntil returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalAnsibleDsl.g:3747:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:3748:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:3748:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:3749:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:3749:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:3750:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEUntilAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3753:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:3754:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:3754:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+
            int cnt119=0;
            loop119:
            do {
                int alt119=4;
                int LA119_0 = input.LA(1);

                if ( LA119_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
                    alt119=1;
                }
                else if ( LA119_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
                    alt119=2;
                }
                else if ( LA119_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
                    alt119=3;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3755:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3755:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3756:4: {...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3756:100: ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    // InternalAnsibleDsl.g:3757:5: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3760:8: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    // InternalAnsibleDsl.g:3760:9: {...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3760:18: (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    // InternalAnsibleDsl.g:3760:19: otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    {
            	    otherlv_1=(Token)match(input,75,FOLLOW_53); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEUntilAccess().getUntilKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3764:8: ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    // InternalAnsibleDsl.g:3765:9: (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    {
            	    // InternalAnsibleDsl.g:3765:9: (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    // InternalAnsibleDsl.g:3766:10: lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            	    {

            	    										newCompositeNode(grammarAccess.getEUntilAccess().getUntilEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_119);
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
            	    // InternalAnsibleDsl.g:3789:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3789:3: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3790:4: {...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3790:100: ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:3791:5: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3794:8: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:3794:9: {...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3794:18: (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:3794:19: otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) )
            	    {
            	    otherlv_3=(Token)match(input,76,FOLLOW_115); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEUntilAccess().getRetriesKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3798:8: ( (lv_retries_4_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:3799:9: (lv_retries_4_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:3799:9: (lv_retries_4_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:3800:10: lv_retries_4_0= RULE_NUMBER
            	    {
            	    lv_retries_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_119); 

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
            	    // InternalAnsibleDsl.g:3822:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3822:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3823:4: {...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3823:100: ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:3824:5: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3827:8: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:3827:9: {...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:3827:18: (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:3827:19: otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) )
            	    {
            	    otherlv_5=(Token)match(input,77,FOLLOW_115); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEUntilAccess().getDelayKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3831:8: ( (lv_delay_6_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:3832:9: (lv_delay_6_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:3832:9: (lv_delay_6_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:3833:10: lv_delay_6_0= RULE_NUMBER
            	    {
            	    lv_delay_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_119); 

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
            	    if ( cnt119 >= 1 ) break loop119;
                        EarlyExitException eee =
                            new EarlyExitException(119, input);
                        throw eee;
                }
                cnt119++;
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
    // InternalAnsibleDsl.g:3866:1: entryRuleEPrivilageEscalation returns [EObject current=null] : iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF ;
    public final EObject entryRuleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrivilageEscalation = null;


        try {
            // InternalAnsibleDsl.g:3866:61: (iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF )
            // InternalAnsibleDsl.g:3867:2: iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF
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
    // InternalAnsibleDsl.g:3873:1: ruleEPrivilageEscalation returns [EObject current=null] : ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) ;
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
            // InternalAnsibleDsl.g:3879:2: ( ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' ) )
            // InternalAnsibleDsl.g:3880:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            {
            // InternalAnsibleDsl.g:3880:2: ( () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}' )
            // InternalAnsibleDsl.g:3881:3: () otherlv_1= 'privilage_escalation{' (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )? (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )? (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )? (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )? otherlv_12= '}'
            {
            // InternalAnsibleDsl.g:3881:3: ()
            // InternalAnsibleDsl.g:3882:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPrivilageEscalationAccess().getEPrivilageEscalationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_120); 

            			newLeafNode(otherlv_1, grammarAccess.getEPrivilageEscalationAccess().getPrivilage_escalationKeyword_1());
            		
            // InternalAnsibleDsl.g:3892:3: (otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) ) )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==79) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalAnsibleDsl.g:3893:4: otherlv_2= 'become:' ( (lv_become_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,79,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getEPrivilageEscalationAccess().getBecomeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:3897:4: ( (lv_become_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:3898:5: (lv_become_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:3898:5: (lv_become_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:3899:6: lv_become_3_0= RULE_BOOLEAN
                    {
                    lv_become_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_121); 

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

            // InternalAnsibleDsl.g:3916:3: (otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==80) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalAnsibleDsl.g:3917:4: otherlv_4= 'become_exe:' ( (lv_become_exe_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,80,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPrivilageEscalationAccess().getBecome_exeKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:3921:4: ( (lv_become_exe_5_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3922:5: (lv_become_exe_5_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3922:5: (lv_become_exe_5_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3923:6: lv_become_exe_5_0= RULE_STRING
                    {
                    lv_become_exe_5_0=(Token)match(input,RULE_STRING,FOLLOW_122); 

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

            // InternalAnsibleDsl.g:3940:3: (otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) ) )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==81) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // InternalAnsibleDsl.g:3941:4: otherlv_6= 'become_flags:' ( (lv_become_flags_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,81,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:3945:4: ( (lv_become_flags_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3946:5: (lv_become_flags_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3946:5: (lv_become_flags_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3947:6: lv_become_flags_7_0= RULE_STRING
                    {
                    lv_become_flags_7_0=(Token)match(input,RULE_STRING,FOLLOW_123); 

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

            // InternalAnsibleDsl.g:3964:3: (otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) ) )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==82) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // InternalAnsibleDsl.g:3965:4: otherlv_8= 'become_method:' ( (lv_become_method_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,82,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPrivilageEscalationAccess().getBecome_methodKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:3969:4: ( (lv_become_method_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3970:5: (lv_become_method_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3970:5: (lv_become_method_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3971:6: lv_become_method_9_0= RULE_STRING
                    {
                    lv_become_method_9_0=(Token)match(input,RULE_STRING,FOLLOW_124); 

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

            // InternalAnsibleDsl.g:3988:3: (otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==83) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // InternalAnsibleDsl.g:3989:4: otherlv_10= 'become_user:' ( (lv_become_user_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,83,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEPrivilageEscalationAccess().getBecome_userKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:3993:4: ( (lv_become_user_11_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:3994:5: (lv_become_user_11_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:3994:5: (lv_become_user_11_0= RULE_STRING )
                    // InternalAnsibleDsl.g:3995:6: lv_become_user_11_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4020:1: entryRuleEValidationMode returns [EObject current=null] : iv_ruleEValidationMode= ruleEValidationMode EOF ;
    public final EObject entryRuleEValidationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidationMode = null;


        try {
            // InternalAnsibleDsl.g:4020:56: (iv_ruleEValidationMode= ruleEValidationMode EOF )
            // InternalAnsibleDsl.g:4021:2: iv_ruleEValidationMode= ruleEValidationMode EOF
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
    // InternalAnsibleDsl.g:4027:1: ruleEValidationMode returns [EObject current=null] : ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) ;
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
            // InternalAnsibleDsl.g:4033:2: ( ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' ) )
            // InternalAnsibleDsl.g:4034:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            {
            // InternalAnsibleDsl.g:4034:2: ( () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}' )
            // InternalAnsibleDsl.g:4035:3: () otherlv_1= 'validation_mode{' (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )? otherlv_6= '}'
            {
            // InternalAnsibleDsl.g:4035:3: ()
            // InternalAnsibleDsl.g:4036:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEValidationModeAccess().getEValidationModeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_125); 

            			newLeafNode(otherlv_1, grammarAccess.getEValidationModeAccess().getValidation_modeKeyword_1());
            		
            // InternalAnsibleDsl.g:4046:3: (otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==85) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalAnsibleDsl.g:4047:4: otherlv_2= 'check_mode:' ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,85,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getEValidationModeAccess().getCheck_modeKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4051:4: ( (lv_check_mode_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4052:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4052:5: (lv_check_mode_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4053:6: lv_check_mode_3_0= RULE_BOOLEAN
                    {
                    lv_check_mode_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_126); 

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

            // InternalAnsibleDsl.g:4070:3: (otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==86) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalAnsibleDsl.g:4071:4: otherlv_4= 'diff:' ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    {
                    otherlv_4=(Token)match(input,86,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getEValidationModeAccess().getDiffKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4075:4: ( (lv_diff_5_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4076:5: (lv_diff_5_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4076:5: (lv_diff_5_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4077:6: lv_diff_5_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4102:1: entryRuleEConnection returns [EObject current=null] : iv_ruleEConnection= ruleEConnection EOF ;
    public final EObject entryRuleEConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConnection = null;


        try {
            // InternalAnsibleDsl.g:4102:52: (iv_ruleEConnection= ruleEConnection EOF )
            // InternalAnsibleDsl.g:4103:2: iv_ruleEConnection= ruleEConnection EOF
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
    // InternalAnsibleDsl.g:4109:1: ruleEConnection returns [EObject current=null] : ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) ;
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
            // InternalAnsibleDsl.g:4115:2: ( ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' ) )
            // InternalAnsibleDsl.g:4116:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            {
            // InternalAnsibleDsl.g:4116:2: ( () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}' )
            // InternalAnsibleDsl.g:4117:3: () otherlv_1= 'connection_info{' (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )? (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )? (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )? otherlv_8= '}'
            {
            // InternalAnsibleDsl.g:4117:3: ()
            // InternalAnsibleDsl.g:4118:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConnectionAccess().getEConnectionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,87,FOLLOW_127); 

            			newLeafNode(otherlv_1, grammarAccess.getEConnectionAccess().getConnection_infoKeyword_1());
            		
            // InternalAnsibleDsl.g:4128:3: (otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) ) )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==88) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalAnsibleDsl.g:4129:4: otherlv_2= 'connection:' ( (lv_connection_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,88,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEConnectionAccess().getConnectionKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4133:4: ( (lv_connection_3_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4134:5: (lv_connection_3_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4134:5: (lv_connection_3_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4135:6: lv_connection_3_0= RULE_STRING
                    {
                    lv_connection_3_0=(Token)match(input,RULE_STRING,FOLLOW_128); 

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

            // InternalAnsibleDsl.g:4152:3: (otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) ) )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==89) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalAnsibleDsl.g:4153:4: otherlv_4= 'port:' ( (lv_port_5_0= RULE_NUMBER ) )
                    {
                    otherlv_4=(Token)match(input,89,FOLLOW_115); 

                    				newLeafNode(otherlv_4, grammarAccess.getEConnectionAccess().getPortKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4157:4: ( (lv_port_5_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4158:5: (lv_port_5_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4158:5: (lv_port_5_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4159:6: lv_port_5_0= RULE_NUMBER
                    {
                    lv_port_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_129); 

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

            // InternalAnsibleDsl.g:4176:3: (otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) ) )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==90) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalAnsibleDsl.g:4177:4: otherlv_6= 'remote_user:' ( (lv_remote_user_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,90,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getEConnectionAccess().getRemote_userKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4181:4: ( (lv_remote_user_7_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4182:5: (lv_remote_user_7_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4182:5: (lv_remote_user_7_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4183:6: lv_remote_user_7_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4208:1: entryRuleEPlayExeSettings returns [EObject current=null] : iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF ;
    public final EObject entryRuleEPlayExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayExeSettings = null;


        try {
            // InternalAnsibleDsl.g:4208:57: (iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF )
            // InternalAnsibleDsl.g:4209:2: iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF
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
    // InternalAnsibleDsl.g:4215:1: ruleEPlayExeSettings returns [EObject current=null] : ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4221:2: ( ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4222:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4222:2: ( () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4223:3: () (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )? (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )? (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )? (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )? (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4223:3: ()
            // InternalAnsibleDsl.g:4224:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayExeSettingsAccess().getEPlayExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4230:3: (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==91) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // InternalAnsibleDsl.g:4231:4: otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,91,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayExeSettingsAccess().getStrategyKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4235:4: ( (lv_strategy_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4236:5: (lv_strategy_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4236:5: (lv_strategy_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4237:6: lv_strategy_2_0= RULE_STRING
                    {
                    lv_strategy_2_0=(Token)match(input,RULE_STRING,FOLLOW_130); 

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

            // InternalAnsibleDsl.g:4254:3: (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==92) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalAnsibleDsl.g:4255:4: otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) )
                    {
                    otherlv_3=(Token)match(input,92,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayExeSettingsAccess().getSerialKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4259:4: ( (lv_serial_list_4_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4260:5: (lv_serial_list_4_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4260:5: (lv_serial_list_4_0= ruleEList )
                    // InternalAnsibleDsl.g:4261:6: lv_serial_list_4_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getSerial_listEListParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_131);
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

            // InternalAnsibleDsl.g:4279:3: (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==93) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalAnsibleDsl.g:4280:4: otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,93,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayExeSettingsAccess().getOrderKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4284:4: ( (lv_order_6_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4285:5: (lv_order_6_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4285:5: (lv_order_6_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4286:6: lv_order_6_0= RULE_STRING
                    {
                    lv_order_6_0=(Token)match(input,RULE_STRING,FOLLOW_132); 

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

            // InternalAnsibleDsl.g:4303:3: (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==94) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalAnsibleDsl.g:4304:4: otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) )
                    {
                    otherlv_7=(Token)match(input,94,FOLLOW_115); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayExeSettingsAccess().getThrottleKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4308:4: ( (lv_throttle_8_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4309:5: (lv_throttle_8_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4309:5: (lv_throttle_8_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4310:6: lv_throttle_8_0= RULE_NUMBER
                    {
                    lv_throttle_8_0=(Token)match(input,RULE_NUMBER,FOLLOW_133); 

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

            // InternalAnsibleDsl.g:4327:3: (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==95) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalAnsibleDsl.g:4328:4: otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,95,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getEPlayExeSettingsAccess().getRun_onceKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4332:4: ( (lv_run_once_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4333:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4333:5: (lv_run_once_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4334:6: lv_run_once_10_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4355:1: entryRuleEExecutionExeSettings returns [EObject current=null] : iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF ;
    public final EObject entryRuleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionExeSettings = null;


        try {
            // InternalAnsibleDsl.g:4355:62: (iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF )
            // InternalAnsibleDsl.g:4356:2: iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF
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
    // InternalAnsibleDsl.g:4362:1: ruleEExecutionExeSettings returns [EObject current=null] : ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) ;
    public final EObject ruleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_throttle_2_0=null;
        Token otherlv_3=null;
        Token lv_run_once_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4368:2: ( ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4369:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4369:2: ( () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4370:3: () (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4370:3: ()
            // InternalAnsibleDsl.g:4371:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEExecutionExeSettingsAccess().getEExecutionExeSettingsAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4377:3: (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==94) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalAnsibleDsl.g:4378:4: otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) )
                    {
                    otherlv_1=(Token)match(input,94,FOLLOW_115); 

                    				newLeafNode(otherlv_1, grammarAccess.getEExecutionExeSettingsAccess().getThrottleKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4382:4: ( (lv_throttle_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4383:5: (lv_throttle_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4383:5: (lv_throttle_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4384:6: lv_throttle_2_0= RULE_NUMBER
                    {
                    lv_throttle_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_133); 

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

            // InternalAnsibleDsl.g:4401:3: (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==95) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalAnsibleDsl.g:4402:4: otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,95,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEExecutionExeSettingsAccess().getRun_onceKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4406:4: ( (lv_run_once_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4407:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4407:5: (lv_run_once_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4408:6: lv_run_once_4_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4429:1: entryRuleEBlockErrorHandling returns [EObject current=null] : iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF ;
    public final EObject entryRuleEBlockErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4429:60: (iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF )
            // InternalAnsibleDsl.g:4430:2: iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF
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
    // InternalAnsibleDsl.g:4436:1: ruleEBlockErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4442:2: ( ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4443:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4443:2: ( () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4444:3: () (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )? (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4444:3: ()
            // InternalAnsibleDsl.g:4445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEBlockErrorHandlingAccess().getEBlockErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4451:3: (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==96) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalAnsibleDsl.g:4452:4: otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    {
                    otherlv_1=(Token)match(input,96,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4456:4: ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4457:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4457:5: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4458:6: lv_any_errors_fatal_2_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_134); 

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

            // InternalAnsibleDsl.g:4475:3: (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==97) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalAnsibleDsl.g:4476:4: otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,97,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4480:4: ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4481:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4481:5: (lv_ignore_errors_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4482:6: lv_ignore_errors_4_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_135); 

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

            // InternalAnsibleDsl.g:4499:3: (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )?
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==98) ) {
                alt139=1;
            }
            switch (alt139) {
                case 1 :
                    // InternalAnsibleDsl.g:4500:4: otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,98,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4504:4: ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4505:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4505:5: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4506:6: lv_ignore_unreachable_6_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4527:1: entryRuleEPlayErrorHandling returns [EObject current=null] : iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF ;
    public final EObject entryRuleEPlayErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4527:59: (iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF )
            // InternalAnsibleDsl.g:4528:2: iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF
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
    // InternalAnsibleDsl.g:4534:1: ruleEPlayErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4540:2: ( ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4541:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4541:2: ( () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4542:3: () (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )? (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )? (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4542:3: ()
            // InternalAnsibleDsl.g:4543:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPlayErrorHandlingAccess().getEPlayErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4549:3: (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==99) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalAnsibleDsl.g:4550:4: otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) )
                    {
                    otherlv_1=(Token)match(input,99,FOLLOW_115); 

                    				newLeafNode(otherlv_1, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4554:4: ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4555:5: (lv_max_fail_percentage_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4555:5: (lv_max_fail_percentage_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4556:6: lv_max_fail_percentage_2_0= RULE_NUMBER
                    {
                    lv_max_fail_percentage_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_136); 

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

            // InternalAnsibleDsl.g:4573:3: (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==96) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // InternalAnsibleDsl.g:4574:4: otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,96,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4578:4: ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4579:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4579:5: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4580:6: lv_any_errors_fatal_4_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_134); 

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

            // InternalAnsibleDsl.g:4597:3: (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==97) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalAnsibleDsl.g:4598:4: otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,97,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4602:4: ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4603:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4603:5: (lv_ignore_errors_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4604:6: lv_ignore_errors_6_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_135); 

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

            // InternalAnsibleDsl.g:4621:3: (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==98) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // InternalAnsibleDsl.g:4622:4: otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,98,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4626:4: ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4627:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4627:5: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4628:6: lv_ignore_unreachable_8_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4649:1: entryRuleETaskHandlerErrorHandling returns [EObject current=null] : iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF ;
    public final EObject entryRuleETaskHandlerErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4649:66: (iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF )
            // InternalAnsibleDsl.g:4650:2: iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF
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
    // InternalAnsibleDsl.g:4656:1: ruleETaskHandlerErrorHandling returns [EObject current=null] : ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) ;
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
            // InternalAnsibleDsl.g:4662:2: ( ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? ) )
            // InternalAnsibleDsl.g:4663:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            {
            // InternalAnsibleDsl.g:4663:2: ( () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )? )
            // InternalAnsibleDsl.g:4664:3: () (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )? (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )? (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )? (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            {
            // InternalAnsibleDsl.g:4664:3: ()
            // InternalAnsibleDsl.g:4665:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETaskHandlerErrorHandlingAccess().getETaskHandlerErrorHandlingAction_0(),
            					current);
            			

            }

            // InternalAnsibleDsl.g:4671:3: (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==100) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalAnsibleDsl.g:4672:4: otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_1=(Token)match(input,100,FOLLOW_53); 

                    				newLeafNode(otherlv_1, grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:4676:4: ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:4677:5: (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:4677:5: (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:4678:6: lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_137);
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

            // InternalAnsibleDsl.g:4696:3: (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==101) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalAnsibleDsl.g:4697:4: otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    {
                    otherlv_3=(Token)match(input,101,FOLLOW_53); 

                    				newLeafNode(otherlv_3, grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4701:4: ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
                    // InternalAnsibleDsl.g:4702:5: (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    {
                    // InternalAnsibleDsl.g:4702:5: (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
                    // InternalAnsibleDsl.g:4703:6: lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets
                    {

                    						newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_136);
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

            // InternalAnsibleDsl.g:4721:3: (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==96) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalAnsibleDsl.g:4722:4: otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    {
                    otherlv_5=(Token)match(input,96,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4726:4: ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4727:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4727:5: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4728:6: lv_any_errors_fatal_6_0= RULE_BOOLEAN
                    {
                    lv_any_errors_fatal_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_134); 

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

            // InternalAnsibleDsl.g:4745:3: (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )?
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==97) ) {
                alt147=1;
            }
            switch (alt147) {
                case 1 :
                    // InternalAnsibleDsl.g:4746:4: otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    {
                    otherlv_7=(Token)match(input,97,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4750:4: ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4751:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4751:5: (lv_ignore_errors_8_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4752:6: lv_ignore_errors_8_0= RULE_BOOLEAN
                    {
                    lv_ignore_errors_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_135); 

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

            // InternalAnsibleDsl.g:4769:3: (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==98) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // InternalAnsibleDsl.g:4770:4: otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    {
                    otherlv_9=(Token)match(input,98,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4774:4: ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4775:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4775:5: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4776:6: lv_ignore_unreachable_10_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:4797:1: entryRuleEFactsSettings returns [EObject current=null] : iv_ruleEFactsSettings= ruleEFactsSettings EOF ;
    public final EObject entryRuleEFactsSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactsSettings = null;


        try {
            // InternalAnsibleDsl.g:4797:55: (iv_ruleEFactsSettings= ruleEFactsSettings EOF )
            // InternalAnsibleDsl.g:4798:2: iv_ruleEFactsSettings= ruleEFactsSettings EOF
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
    // InternalAnsibleDsl.g:4804:1: ruleEFactsSettings returns [EObject current=null] : ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
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
            // InternalAnsibleDsl.g:4810:2: ( ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalAnsibleDsl.g:4811:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalAnsibleDsl.g:4811:2: ( () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalAnsibleDsl.g:4812:3: () otherlv_1= 'facts_setttings{' (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )? (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )? (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )? (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // InternalAnsibleDsl.g:4812:3: ()
            // InternalAnsibleDsl.g:4813:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactsSettingsAccess().getEFactsSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_138); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactsSettingsAccess().getFacts_setttingsKeyword_1());
            		
            // InternalAnsibleDsl.g:4823:3: (otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) ) )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==103) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // InternalAnsibleDsl.g:4824:4: otherlv_2= 'gather_facts:' ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    {
                    otherlv_2=(Token)match(input,103,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getEFactsSettingsAccess().getGather_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4828:4: ( (lv_gather_facts_3_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4829:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4829:5: (lv_gather_facts_3_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4830:6: lv_gather_facts_3_0= RULE_BOOLEAN
                    {
                    lv_gather_facts_3_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_139); 

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

            // InternalAnsibleDsl.g:4847:3: (otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) ) )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==104) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // InternalAnsibleDsl.g:4848:4: otherlv_4= 'gather_subset:' ( (lv_gather_subset_5_0= ruleEList ) )
                    {
                    otherlv_4=(Token)match(input,104,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getEFactsSettingsAccess().getGather_subsetKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:4852:4: ( (lv_gather_subset_5_0= ruleEList ) )
                    // InternalAnsibleDsl.g:4853:5: (lv_gather_subset_5_0= ruleEList )
                    {
                    // InternalAnsibleDsl.g:4853:5: (lv_gather_subset_5_0= ruleEList )
                    // InternalAnsibleDsl.g:4854:6: lv_gather_subset_5_0= ruleEList
                    {

                    						newCompositeNode(grammarAccess.getEFactsSettingsAccess().getGather_subsetEListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_140);
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

            // InternalAnsibleDsl.g:4872:3: (otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) ) )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==105) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // InternalAnsibleDsl.g:4873:4: otherlv_6= 'gather_timeout:' ( (lv_gather_timeout_7_0= RULE_NUMBER ) )
                    {
                    otherlv_6=(Token)match(input,105,FOLLOW_115); 

                    				newLeafNode(otherlv_6, grammarAccess.getEFactsSettingsAccess().getGather_timeoutKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:4877:4: ( (lv_gather_timeout_7_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4878:5: (lv_gather_timeout_7_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4878:5: (lv_gather_timeout_7_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4879:6: lv_gather_timeout_7_0= RULE_NUMBER
                    {
                    lv_gather_timeout_7_0=(Token)match(input,RULE_NUMBER,FOLLOW_141); 

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

            // InternalAnsibleDsl.g:4896:3: (otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) ) )?
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==106) ) {
                alt152=1;
            }
            switch (alt152) {
                case 1 :
                    // InternalAnsibleDsl.g:4897:4: otherlv_8= 'fact_path:' ( (lv_fact_path_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,106,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getEFactsSettingsAccess().getFact_pathKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:4901:4: ( (lv_fact_path_9_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4902:5: (lv_fact_path_9_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4902:5: (lv_fact_path_9_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4903:6: lv_fact_path_9_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4928:1: entryRuleEDelegation returns [EObject current=null] : iv_ruleEDelegation= ruleEDelegation EOF ;
    public final EObject entryRuleEDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDelegation = null;


        try {
            // InternalAnsibleDsl.g:4928:52: (iv_ruleEDelegation= ruleEDelegation EOF )
            // InternalAnsibleDsl.g:4929:2: iv_ruleEDelegation= ruleEDelegation EOF
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
    // InternalAnsibleDsl.g:4935:1: ruleEDelegation returns [EObject current=null] : (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) ;
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
            // InternalAnsibleDsl.g:4941:2: ( (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' ) )
            // InternalAnsibleDsl.g:4942:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            {
            // InternalAnsibleDsl.g:4942:2: (otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}' )
            // InternalAnsibleDsl.g:4943:3: otherlv_0= 'delegation{' (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,107,FOLLOW_142); 

            			newLeafNode(otherlv_0, grammarAccess.getEDelegationAccess().getDelegationKeyword_0());
            		
            // InternalAnsibleDsl.g:4947:3: (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4948:4: otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,108,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getEDelegationAccess().getDelegate_toKeyword_1_0());
            			
            // InternalAnsibleDsl.g:4952:4: ( (lv_delegate_to_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4953:5: (lv_delegate_to_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4953:5: (lv_delegate_to_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:4954:6: lv_delegate_to_2_0= RULE_STRING
            {
            lv_delegate_to_2_0=(Token)match(input,RULE_STRING,FOLLOW_143); 

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

            // InternalAnsibleDsl.g:4971:3: (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==109) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // InternalAnsibleDsl.g:4972:4: otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    {
                    otherlv_3=(Token)match(input,109,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getEDelegationAccess().getDelegate_factsKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:4976:4: ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4977:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4977:5: (lv_delegate_facts_4_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4978:6: lv_delegate_facts_4_0= RULE_BOOLEAN
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
    // InternalAnsibleDsl.g:5003:1: entryRuleEAsynchronousSettings returns [EObject current=null] : iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF ;
    public final EObject entryRuleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAsynchronousSettings = null;


        try {
            // InternalAnsibleDsl.g:5003:62: (iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF )
            // InternalAnsibleDsl.g:5004:2: iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF
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
    // InternalAnsibleDsl.g:5010:1: ruleEAsynchronousSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_async_2_0=null;
        Token otherlv_3=null;
        Token lv_poll_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5016:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:5017:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:5017:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:5018:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:5018:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:5019:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:5022:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:5023:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:5023:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )+
            int cnt154=0;
            loop154:
            do {
                int alt154=3;
                int LA154_0 = input.LA(1);

                if ( LA154_0 == 110 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt154=1;
                }
                else if ( LA154_0 == 111 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt154=2;
                }


                switch (alt154) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5024:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:5024:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:5025:4: {...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:5025:115: ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:5026:5: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:5029:8: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:5029:9: {...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:5029:18: (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:5029:19: otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) )
            	    {
            	    otherlv_1=(Token)match(input,110,FOLLOW_115); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAsynchronousSettingsAccess().getAsyncKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:5033:8: ( (lv_async_2_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:5034:9: (lv_async_2_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:5034:9: (lv_async_2_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:5035:10: lv_async_2_0= RULE_NUMBER
            	    {
            	    lv_async_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_144); 

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
            	    // InternalAnsibleDsl.g:5057:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:5057:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:5058:4: {...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:5058:115: ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:5059:5: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:5062:8: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:5062:9: {...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:5062:18: (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:5062:19: otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) )
            	    {
            	    otherlv_3=(Token)match(input,111,FOLLOW_115); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAsynchronousSettingsAccess().getPollKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:5066:8: ( (lv_poll_4_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:5067:9: (lv_poll_4_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:5067:9: (lv_poll_4_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:5068:10: lv_poll_4_0= RULE_NUMBER
            	    {
            	    lv_poll_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_144); 

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
            	    if ( cnt154 >= 1 ) break loop154;
                        EarlyExitException eee =
                            new EarlyExitException(154, input);
                        throw eee;
                }
                cnt154++;
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
    // InternalAnsibleDsl.g:5101:1: entryRuleENotifiable returns [EObject current=null] : iv_ruleENotifiable= ruleENotifiable EOF ;
    public final EObject entryRuleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiable = null;


        try {
            // InternalAnsibleDsl.g:5101:52: (iv_ruleENotifiable= ruleENotifiable EOF )
            // InternalAnsibleDsl.g:5102:2: iv_ruleENotifiable= ruleENotifiable EOF
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
    // InternalAnsibleDsl.g:5108:1: ruleENotifiable returns [EObject current=null] : (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) ;
    public final EObject ruleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject this_ENotifiedHandler_0 = null;

        EObject this_ENotifiedTopic_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5114:2: ( (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) )
            // InternalAnsibleDsl.g:5115:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            {
            // InternalAnsibleDsl.g:5115:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            int alt155=2;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==RULE_STRING) ) {
                alt155=1;
            }
            else if ( (LA155_0==112) ) {
                alt155=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // InternalAnsibleDsl.g:5116:3: this_ENotifiedHandler_0= ruleENotifiedHandler
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
                    // InternalAnsibleDsl.g:5125:3: this_ENotifiedTopic_1= ruleENotifiedTopic
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
    // InternalAnsibleDsl.g:5137:1: entryRuleENotifiedHandler returns [EObject current=null] : iv_ruleENotifiedHandler= ruleENotifiedHandler EOF ;
    public final EObject entryRuleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedHandler = null;


        try {
            // InternalAnsibleDsl.g:5137:57: (iv_ruleENotifiedHandler= ruleENotifiedHandler EOF )
            // InternalAnsibleDsl.g:5138:2: iv_ruleENotifiedHandler= ruleENotifiedHandler EOF
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
    // InternalAnsibleDsl.g:5144:1: ruleENotifiedHandler returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5150:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:5151:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalAnsibleDsl.g:5151:2: ( (otherlv_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:5152:3: (otherlv_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:5152:3: (otherlv_0= RULE_STRING )
            // InternalAnsibleDsl.g:5153:4: otherlv_0= RULE_STRING
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
    // InternalAnsibleDsl.g:5167:1: entryRuleENotifiedTopic returns [EObject current=null] : iv_ruleENotifiedTopic= ruleENotifiedTopic EOF ;
    public final EObject entryRuleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedTopic = null;


        try {
            // InternalAnsibleDsl.g:5167:55: (iv_ruleENotifiedTopic= ruleENotifiedTopic EOF )
            // InternalAnsibleDsl.g:5168:2: iv_ruleENotifiedTopic= ruleENotifiedTopic EOF
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
    // InternalAnsibleDsl.g:5174:1: ruleENotifiedTopic returns [EObject current=null] : (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5180:2: ( (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:5181:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:5181:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:5182:3: otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,112,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getENotifiedTopicAccess().getTopicKeyword_0());
            		
            // InternalAnsibleDsl.g:5186:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:5187:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:5187:4: (lv_name_1_0= RULE_STRING )
            // InternalAnsibleDsl.g:5188:5: lv_name_1_0= RULE_STRING
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
    // InternalAnsibleDsl.g:5208:1: entryRuleEJinjaExpressionOrString returns [EObject current=null] : iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF ;
    public final EObject entryRuleEJinjaExpressionOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionOrString = null;


        try {
            // InternalAnsibleDsl.g:5208:65: (iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF )
            // InternalAnsibleDsl.g:5209:2: iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF
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
    // InternalAnsibleDsl.g:5215:1: ruleEJinjaExpressionOrString returns [EObject current=null] : (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEJinjaExpressionOrString() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject this_EJinjaExpressionEvaluation_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5221:2: ( (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:5222:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:5222:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==115) ) {
                alt156=1;
            }
            else if ( (LA156_0==RULE_STRING) ) {
                alt156=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }
            switch (alt156) {
                case 1 :
                    // InternalAnsibleDsl.g:5223:3: this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation
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
                    // InternalAnsibleDsl.g:5232:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:5232:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:5233:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:5233:4: (lv_string_1_0= RULE_STRING )
                    // InternalAnsibleDsl.g:5234:5: lv_string_1_0= RULE_STRING
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
    // InternalAnsibleDsl.g:5254:1: entryRuleEJinjaExpressionAndString returns [EObject current=null] : iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF ;
    public final EObject entryRuleEJinjaExpressionAndString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionAndString = null;


        try {
            // InternalAnsibleDsl.g:5254:66: (iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF )
            // InternalAnsibleDsl.g:5255:2: iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF
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
    // InternalAnsibleDsl.g:5261:1: ruleEJinjaExpressionAndString returns [EObject current=null] : ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+ ;
    public final EObject ruleEJinjaExpressionAndString() throws RecognitionException {
        EObject current = null;

        EObject lv_jinja_expression_and_string_0_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5267:2: ( ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+ )
            // InternalAnsibleDsl.g:5268:2: ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+
            {
            // InternalAnsibleDsl.g:5268:2: ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+
            int cnt157=0;
            loop157:
            do {
                int alt157=2;
                int LA157_0 = input.LA(1);

                if ( (LA157_0==RULE_STRING||LA157_0==115) ) {
                    alt157=1;
                }


                switch (alt157) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5269:3: (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString )
            	    {
            	    // InternalAnsibleDsl.g:5269:3: (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString )
            	    // InternalAnsibleDsl.g:5270:4: lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString
            	    {

            	    				newCompositeNode(grammarAccess.getEJinjaExpressionAndStringAccess().getJinja_expression_and_stringEJinjaExpressionOrStringParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_145);
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
            	    if ( cnt157 >= 1 ) break loop157;
                        EarlyExitException eee =
                            new EarlyExitException(157, input);
                        throw eee;
                }
                cnt157++;
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
    // InternalAnsibleDsl.g:5290:1: entryRuleEValuePassed returns [EObject current=null] : iv_ruleEValuePassed= ruleEValuePassed EOF ;
    public final EObject entryRuleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassed = null;


        try {
            // InternalAnsibleDsl.g:5290:53: (iv_ruleEValuePassed= ruleEValuePassed EOF )
            // InternalAnsibleDsl.g:5291:2: iv_ruleEValuePassed= ruleEValuePassed EOF
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
    // InternalAnsibleDsl.g:5297:1: ruleEValuePassed returns [EObject current=null] : (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString ) ;
    public final EObject ruleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject this_EJinjaExpressionAndString_0 = null;

        EObject this_EValueWithoutString_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5303:2: ( (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString ) )
            // InternalAnsibleDsl.g:5304:2: (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString )
            {
            // InternalAnsibleDsl.g:5304:2: (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString )
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==RULE_STRING||LA158_0==115) ) {
                alt158=1;
            }
            else if ( (LA158_0==RULE_BOOLEAN||(LA158_0>=RULE_NUMBER && LA158_0<=RULE_NULL)||LA158_0==141||LA158_0==147) ) {
                alt158=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }
            switch (alt158) {
                case 1 :
                    // InternalAnsibleDsl.g:5305:3: this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString
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
                    // InternalAnsibleDsl.g:5314:3: this_EValueWithoutString_1= ruleEValueWithoutString
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
    // InternalAnsibleDsl.g:5326:1: entryRuleEValuePassedToJinjaExpression returns [EObject current=null] : iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF ;
    public final EObject entryRuleEValuePassedToJinjaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassedToJinjaExpression = null;


        try {
            // InternalAnsibleDsl.g:5326:70: (iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF )
            // InternalAnsibleDsl.g:5327:2: iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF
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
    // InternalAnsibleDsl.g:5333:1: ruleEValuePassedToJinjaExpression returns [EObject current=null] : (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall ) ;
    public final EObject ruleEValuePassedToJinjaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EValue_0 = null;

        EObject this_EFactGathered_1 = null;

        EObject this_EItem_2 = null;

        EObject this_EVariableReference_3 = null;

        EObject this_EFunctionCall_4 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5339:2: ( (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall ) )
            // InternalAnsibleDsl.g:5340:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall )
            {
            // InternalAnsibleDsl.g:5340:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall )
            int alt159=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_BOOLEAN:
            case RULE_NUMBER:
            case RULE_NULL:
            case 141:
            case 147:
                {
                alt159=1;
                }
                break;
            case 146:
                {
                alt159=2;
                }
                break;
            case 113:
                {
                alt159=3;
                }
                break;
            case RULE_ID:
                {
                int LA159_4 = input.LA(2);

                if ( (LA159_4==EOF||LA159_4==19||LA159_4==35||LA159_4==37||LA159_4==49||(LA159_4>=54 && LA159_4<=57)||LA159_4==61||(LA159_4>=75 && LA159_4<=77)||(LA159_4>=96 && LA159_4<=98)||LA159_4==101||LA159_4==114||LA159_4==116||(LA159_4>=118 && LA159_4<=137)||(LA159_4>=139 && LA159_4<=141)||LA159_4==144) ) {
                    alt159=4;
                }
                else if ( (LA159_4==117) ) {
                    alt159=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 159, 4, input);

                    throw nvae;
                }
                }
                break;
            case 143:
            case 145:
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
                    // InternalAnsibleDsl.g:5341:3: this_EValue_0= ruleEValue
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
                    // InternalAnsibleDsl.g:5350:3: this_EFactGathered_1= ruleEFactGathered
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
                    // InternalAnsibleDsl.g:5359:3: this_EItem_2= ruleEItem
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
                    // InternalAnsibleDsl.g:5368:3: this_EVariableReference_3= ruleEVariableReference
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedToJinjaExpressionAccess().getEVariableReferenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EVariableReference_3=ruleEVariableReference();

                    state._fsp--;


                    			current = this_EVariableReference_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAnsibleDsl.g:5377:3: this_EFunctionCall_4= ruleEFunctionCall
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
    // InternalAnsibleDsl.g:5389:1: entryRuleEComposedValue returns [EObject current=null] : iv_ruleEComposedValue= ruleEComposedValue EOF ;
    public final EObject entryRuleEComposedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComposedValue = null;


        try {
            // InternalAnsibleDsl.g:5389:55: (iv_ruleEComposedValue= ruleEComposedValue EOF )
            // InternalAnsibleDsl.g:5390:2: iv_ruleEComposedValue= ruleEComposedValue EOF
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
    // InternalAnsibleDsl.g:5396:1: ruleEComposedValue returns [EObject current=null] : (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList ) ;
    public final EObject ruleEComposedValue() throws RecognitionException {
        EObject current = null;

        EObject this_EDictionary_0 = null;

        EObject this_EList_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5402:2: ( (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList ) )
            // InternalAnsibleDsl.g:5403:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList )
            {
            // InternalAnsibleDsl.g:5403:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList )
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==147) ) {
                alt160=1;
            }
            else if ( (LA160_0==141) ) {
                alt160=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 160, 0, input);

                throw nvae;
            }
            switch (alt160) {
                case 1 :
                    // InternalAnsibleDsl.g:5404:3: this_EDictionary_0= ruleEDictionary
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
                    // InternalAnsibleDsl.g:5413:3: this_EList_1= ruleEList
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
    // InternalAnsibleDsl.g:5425:1: entryRuleEValue returns [EObject current=null] : iv_ruleEValue= ruleEValue EOF ;
    public final EObject entryRuleEValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValue = null;


        try {
            // InternalAnsibleDsl.g:5425:47: (iv_ruleEValue= ruleEValue EOF )
            // InternalAnsibleDsl.g:5426:2: iv_ruleEValue= ruleEValue EOF
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
    // InternalAnsibleDsl.g:5432:1: ruleEValue returns [EObject current=null] : (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue ) ;
    public final EObject ruleEValue() throws RecognitionException {
        EObject current = null;

        EObject this_EComposedValue_0 = null;

        EObject this_ESimpleValue_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5438:2: ( (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue ) )
            // InternalAnsibleDsl.g:5439:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue )
            {
            // InternalAnsibleDsl.g:5439:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==141||LA161_0==147) ) {
                alt161=1;
            }
            else if ( ((LA161_0>=RULE_STRING && LA161_0<=RULE_BOOLEAN)||(LA161_0>=RULE_NUMBER && LA161_0<=RULE_NULL)) ) {
                alt161=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;
            }
            switch (alt161) {
                case 1 :
                    // InternalAnsibleDsl.g:5440:3: this_EComposedValue_0= ruleEComposedValue
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
                    // InternalAnsibleDsl.g:5449:3: this_ESimpleValue_1= ruleESimpleValue
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
    // InternalAnsibleDsl.g:5461:1: entryRuleEValueWithoutString returns [EObject current=null] : iv_ruleEValueWithoutString= ruleEValueWithoutString EOF ;
    public final EObject entryRuleEValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueWithoutString = null;


        try {
            // InternalAnsibleDsl.g:5461:60: (iv_ruleEValueWithoutString= ruleEValueWithoutString EOF )
            // InternalAnsibleDsl.g:5462:2: iv_ruleEValueWithoutString= ruleEValueWithoutString EOF
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
    // InternalAnsibleDsl.g:5468:1: ruleEValueWithoutString returns [EObject current=null] : (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString ) ;
    public final EObject ruleEValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject this_EComposedValue_0 = null;

        EObject this_ESimpleValueWithoutString_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5474:2: ( (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString ) )
            // InternalAnsibleDsl.g:5475:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString )
            {
            // InternalAnsibleDsl.g:5475:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString )
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==141||LA162_0==147) ) {
                alt162=1;
            }
            else if ( (LA162_0==RULE_BOOLEAN||(LA162_0>=RULE_NUMBER && LA162_0<=RULE_NULL)) ) {
                alt162=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 162, 0, input);

                throw nvae;
            }
            switch (alt162) {
                case 1 :
                    // InternalAnsibleDsl.g:5476:3: this_EComposedValue_0= ruleEComposedValue
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
                    // InternalAnsibleDsl.g:5485:3: this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString
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
    // InternalAnsibleDsl.g:5497:1: entryRuleESimpleValueWithoutString returns [EObject current=null] : iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF ;
    public final EObject entryRuleESimpleValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESimpleValueWithoutString = null;


        try {
            // InternalAnsibleDsl.g:5497:66: (iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF )
            // InternalAnsibleDsl.g:5498:2: iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF
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
    // InternalAnsibleDsl.g:5504:1: ruleESimpleValueWithoutString returns [EObject current=null] : ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleESimpleValueWithoutString() throws RecognitionException {
        EObject current = null;

        Token lv_simple_value_0_0=null;
        Token lv_simple_value_1_0=null;
        Token lv_simple_value_2_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5510:2: ( ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) ) )
            // InternalAnsibleDsl.g:5511:2: ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) )
            {
            // InternalAnsibleDsl.g:5511:2: ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) )
            int alt163=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt163=1;
                }
                break;
            case RULE_NULL:
                {
                alt163=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt163=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;
            }

            switch (alt163) {
                case 1 :
                    // InternalAnsibleDsl.g:5512:3: ( (lv_simple_value_0_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:5512:3: ( (lv_simple_value_0_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:5513:4: (lv_simple_value_0_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:5513:4: (lv_simple_value_0_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:5514:5: lv_simple_value_0_0= RULE_BOOLEAN
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
                    // InternalAnsibleDsl.g:5531:3: ( (lv_simple_value_1_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:5531:3: ( (lv_simple_value_1_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:5532:4: (lv_simple_value_1_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:5532:4: (lv_simple_value_1_0= RULE_NULL )
                    // InternalAnsibleDsl.g:5533:5: lv_simple_value_1_0= RULE_NULL
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
                    // InternalAnsibleDsl.g:5550:3: ( (lv_simple_value_2_0= RULE_NUMBER ) )
                    {
                    // InternalAnsibleDsl.g:5550:3: ( (lv_simple_value_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:5551:4: (lv_simple_value_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:5551:4: (lv_simple_value_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:5552:5: lv_simple_value_2_0= RULE_NUMBER
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
    // InternalAnsibleDsl.g:5572:1: entryRuleESimpleValue returns [EObject current=null] : iv_ruleESimpleValue= ruleESimpleValue EOF ;
    public final EObject entryRuleESimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESimpleValue = null;


        try {
            // InternalAnsibleDsl.g:5572:53: (iv_ruleESimpleValue= ruleESimpleValue EOF )
            // InternalAnsibleDsl.g:5573:2: iv_ruleESimpleValue= ruleESimpleValue EOF
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
    // InternalAnsibleDsl.g:5579:1: ruleESimpleValue returns [EObject current=null] : ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) ) ;
    public final EObject ruleESimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_simple_value_string_0_0=null;
        EObject lv_simple_value_without_string_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5585:2: ( ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) ) )
            // InternalAnsibleDsl.g:5586:2: ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) )
            {
            // InternalAnsibleDsl.g:5586:2: ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) )
            int alt164=2;
            int LA164_0 = input.LA(1);

            if ( (LA164_0==RULE_STRING) ) {
                alt164=1;
            }
            else if ( (LA164_0==RULE_BOOLEAN||(LA164_0>=RULE_NUMBER && LA164_0<=RULE_NULL)) ) {
                alt164=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 164, 0, input);

                throw nvae;
            }
            switch (alt164) {
                case 1 :
                    // InternalAnsibleDsl.g:5587:3: ( (lv_simple_value_string_0_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:5587:3: ( (lv_simple_value_string_0_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:5588:4: (lv_simple_value_string_0_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:5588:4: (lv_simple_value_string_0_0= RULE_STRING )
                    // InternalAnsibleDsl.g:5589:5: lv_simple_value_string_0_0= RULE_STRING
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
                    // InternalAnsibleDsl.g:5606:3: ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) )
                    {
                    // InternalAnsibleDsl.g:5606:3: ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) )
                    // InternalAnsibleDsl.g:5607:4: (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString )
                    {
                    // InternalAnsibleDsl.g:5607:4: (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString )
                    // InternalAnsibleDsl.g:5608:5: lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString
                    {

                    					newCompositeNode(grammarAccess.getESimpleValueAccess().getSimple_value_without_stringESimpleValueWithoutStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_simple_value_without_string_1_0=ruleESimpleValueWithoutString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getESimpleValueRule());
                    					}
                    					set(
                    						current,
                    						"simple_value_without_string",
                    						lv_simple_value_without_string_1_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.ESimpleValueWithoutString");
                    					afterParserOrEnumRuleCall();
                    				

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
    // InternalAnsibleDsl.g:5629:1: entryRuleEItem returns [EObject current=null] : iv_ruleEItem= ruleEItem EOF ;
    public final EObject entryRuleEItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEItem = null;


        try {
            // InternalAnsibleDsl.g:5629:46: (iv_ruleEItem= ruleEItem EOF )
            // InternalAnsibleDsl.g:5630:2: iv_ruleEItem= ruleEItem EOF
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
    // InternalAnsibleDsl.g:5636:1: ruleEItem returns [EObject current=null] : ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tail_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5642:2: ( ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:5643:2: ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:5643:2: ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:5644:3: () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            {
            // InternalAnsibleDsl.g:5644:3: ()
            // InternalAnsibleDsl.g:5645:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEItemAccess().getEItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,113,FOLLOW_146); 

            			newLeafNode(otherlv_1, grammarAccess.getEItemAccess().getItemKeyword_1());
            		
            // InternalAnsibleDsl.g:5655:3: (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            loop165:
            do {
                int alt165=2;
                int LA165_0 = input.LA(1);

                if ( (LA165_0==114) ) {
                    int LA165_2 = input.LA(2);

                    if ( (LA165_2==RULE_ID) ) {
                        int LA165_3 = input.LA(3);

                        if ( (LA165_3==EOF||LA165_3==19||LA165_3==35||LA165_3==37||LA165_3==49||(LA165_3>=54 && LA165_3<=57)||LA165_3==61||(LA165_3>=75 && LA165_3<=77)||(LA165_3>=96 && LA165_3<=98)||LA165_3==101||LA165_3==114||LA165_3==116||(LA165_3>=118 && LA165_3<=137)||(LA165_3>=139 && LA165_3<=140)||LA165_3==144) ) {
                            alt165=1;
                        }


                    }


                }


                switch (alt165) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5656:4: otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,114,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEItemAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5660:4: ( (lv_tail_3_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:5661:5: (lv_tail_3_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:5661:5: (lv_tail_3_0= RULE_ID )
            	    // InternalAnsibleDsl.g:5662:6: lv_tail_3_0= RULE_ID
            	    {
            	    lv_tail_3_0=(Token)match(input,RULE_ID,FOLLOW_146); 

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
            	    break loop165;
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


    // $ANTLR start "entryRuleEJinjaExpressionEvaluation"
    // InternalAnsibleDsl.g:5683:1: entryRuleEJinjaExpressionEvaluation returns [EObject current=null] : iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF ;
    public final EObject entryRuleEJinjaExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionEvaluation = null;


        try {
            // InternalAnsibleDsl.g:5683:67: (iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF )
            // InternalAnsibleDsl.g:5684:2: iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF
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
    // InternalAnsibleDsl.g:5690:1: ruleEJinjaExpressionEvaluation returns [EObject current=null] : (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' ) ;
    public final EObject ruleEJinjaExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_jinja_expression_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5696:2: ( (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' ) )
            // InternalAnsibleDsl.g:5697:2: (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' )
            {
            // InternalAnsibleDsl.g:5697:2: (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' )
            // InternalAnsibleDsl.g:5698:3: otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}'
            {
            otherlv_0=(Token)match(input,115,FOLLOW_53); 

            			newLeafNode(otherlv_0, grammarAccess.getEJinjaExpressionEvaluationAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:5702:3: ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            // InternalAnsibleDsl.g:5703:4: (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            {
            // InternalAnsibleDsl.g:5703:4: (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            // InternalAnsibleDsl.g:5704:5: lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets
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
    // InternalAnsibleDsl.g:5729:1: entryRuleEJinjaExpressionEvaluationWithoutBrackets returns [EObject current=null] : iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF ;
    public final EObject entryRuleEJinjaExpressionEvaluationWithoutBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionEvaluationWithoutBrackets = null;


        try {
            // InternalAnsibleDsl.g:5729:82: (iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF )
            // InternalAnsibleDsl.g:5730:2: iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF
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
    // InternalAnsibleDsl.g:5736:1: ruleEJinjaExpressionEvaluationWithoutBrackets returns [EObject current=null] : (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression ) ;
    public final EObject ruleEJinjaExpressionEvaluationWithoutBrackets() throws RecognitionException {
        EObject current = null;

        EObject this_EFilteredExpression_0 = null;

        EObject this_EIfExpression_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5742:2: ( (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression ) )
            // InternalAnsibleDsl.g:5743:2: (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression )
            {
            // InternalAnsibleDsl.g:5743:2: (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( ((LA166_0>=RULE_STRING && LA166_0<=RULE_NULL)||LA166_0==113||LA166_0==117||LA166_0==141||LA166_0==143||(LA166_0>=145 && LA166_0<=147)) ) {
                alt166=1;
            }
            else if ( (LA166_0==138) ) {
                alt166=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;
            }
            switch (alt166) {
                case 1 :
                    // InternalAnsibleDsl.g:5744:3: this_EFilteredExpression_0= ruleEFilteredExpression
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
                    // InternalAnsibleDsl.g:5753:3: this_EIfExpression_1= ruleEIfExpression
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
    // InternalAnsibleDsl.g:5765:1: entryRuleEFunctionCall returns [EObject current=null] : iv_ruleEFunctionCall= ruleEFunctionCall EOF ;
    public final EObject entryRuleEFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunctionCall = null;


        try {
            // InternalAnsibleDsl.g:5765:54: (iv_ruleEFunctionCall= ruleEFunctionCall EOF )
            // InternalAnsibleDsl.g:5766:2: iv_ruleEFunctionCall= ruleEFunctionCall EOF
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
    // InternalAnsibleDsl.g:5772:1: ruleEFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) ) ;
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
            // InternalAnsibleDsl.g:5778:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) ) )
            // InternalAnsibleDsl.g:5779:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) )
            {
            // InternalAnsibleDsl.g:5779:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) )
            // InternalAnsibleDsl.g:5780:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) )
            {
            // InternalAnsibleDsl.g:5780:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5781:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5781:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:5782:5: lv_name_0_0= RULE_ID
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

            // InternalAnsibleDsl.g:5798:3: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) )
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==117) ) {
                int LA168_1 = input.LA(2);

                if ( (LA168_1==118) ) {
                    alt168=2;
                }
                else if ( ((LA168_1>=RULE_STRING && LA168_1<=RULE_NULL)||LA168_1==113||LA168_1==117||LA168_1==141||LA168_1==143||(LA168_1>=145 && LA168_1<=147)) ) {
                    alt168=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 168, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 168, 0, input);

                throw nvae;
            }
            switch (alt168) {
                case 1 :
                    // InternalAnsibleDsl.g:5799:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' )
                    {
                    // InternalAnsibleDsl.g:5799:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' )
                    // InternalAnsibleDsl.g:5800:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,117,FOLLOW_149); 

                    					newLeafNode(otherlv_1, grammarAccess.getEFunctionCallAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalAnsibleDsl.g:5804:5: ( (lv_parameters_2_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:5805:6: (lv_parameters_2_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:5805:6: (lv_parameters_2_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:5806:7: lv_parameters_2_0= ruleEFilteredExpression
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

                    // InternalAnsibleDsl.g:5823:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )*
                    loop167:
                    do {
                        int alt167=2;
                        int LA167_0 = input.LA(1);

                        if ( (LA167_0==35) ) {
                            alt167=1;
                        }


                        switch (alt167) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:5824:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_149); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getEFunctionCallAccess().getCommaKeyword_1_0_2_0());
                    	    					
                    	    // InternalAnsibleDsl.g:5828:6: ( (lv_parameters_4_0= ruleEFilteredExpression ) )
                    	    // InternalAnsibleDsl.g:5829:7: (lv_parameters_4_0= ruleEFilteredExpression )
                    	    {
                    	    // InternalAnsibleDsl.g:5829:7: (lv_parameters_4_0= ruleEFilteredExpression )
                    	    // InternalAnsibleDsl.g:5830:8: lv_parameters_4_0= ruleEFilteredExpression
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
                    	    break loop167;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,118,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getEFunctionCallAccess().getRightParenthesisKeyword_1_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5854:4: (otherlv_6= '(' otherlv_7= ')' )
                    {
                    // InternalAnsibleDsl.g:5854:4: (otherlv_6= '(' otherlv_7= ')' )
                    // InternalAnsibleDsl.g:5855:5: otherlv_6= '(' otherlv_7= ')'
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
    // InternalAnsibleDsl.g:5869:1: entryRuleEFilteredExpression returns [EObject current=null] : iv_ruleEFilteredExpression= ruleEFilteredExpression EOF ;
    public final EObject entryRuleEFilteredExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredExpression = null;


        try {
            // InternalAnsibleDsl.g:5869:60: (iv_ruleEFilteredExpression= ruleEFilteredExpression EOF )
            // InternalAnsibleDsl.g:5870:2: iv_ruleEFilteredExpression= ruleEFilteredExpression EOF
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
    // InternalAnsibleDsl.g:5876:1: ruleEFilteredExpression returns [EObject current=null] : ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? ) ;
    public final EObject ruleEFilteredExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_to_filter_0_0 = null;

        EObject lv_tail_2_0 = null;

        EObject lv_filter_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5882:2: ( ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5883:2: ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5883:2: ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? )
            // InternalAnsibleDsl.g:5884:3: ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5884:3: ( (lv_to_filter_0_0= ruleEOrExpression ) )
            // InternalAnsibleDsl.g:5885:4: (lv_to_filter_0_0= ruleEOrExpression )
            {
            // InternalAnsibleDsl.g:5885:4: (lv_to_filter_0_0= ruleEOrExpression )
            // InternalAnsibleDsl.g:5886:5: lv_to_filter_0_0= ruleEOrExpression
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

            // InternalAnsibleDsl.g:5903:3: (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )*
            loop169:
            do {
                int alt169=2;
                int LA169_0 = input.LA(1);

                if ( (LA169_0==114) ) {
                    alt169=1;
                }


                switch (alt169) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5904:4: otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) )
            	    {
            	    otherlv_1=(Token)match(input,114,FOLLOW_153); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEFilteredExpressionAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalAnsibleDsl.g:5908:4: ( (lv_tail_2_0= ruleEFunctionCall ) )
            	    // InternalAnsibleDsl.g:5909:5: (lv_tail_2_0= ruleEFunctionCall )
            	    {
            	    // InternalAnsibleDsl.g:5909:5: (lv_tail_2_0= ruleEFunctionCall )
            	    // InternalAnsibleDsl.g:5910:6: lv_tail_2_0= ruleEFunctionCall
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
            	    break loop169;
                }
            } while (true);

            // InternalAnsibleDsl.g:5928:3: (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==119) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // InternalAnsibleDsl.g:5929:4: otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) )
                    {
                    otherlv_3=(Token)match(input,119,FOLLOW_149); 

                    				newLeafNode(otherlv_3, grammarAccess.getEFilteredExpressionAccess().getVerticalLineKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:5933:4: ( (lv_filter_4_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:5934:5: (lv_filter_4_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:5934:5: (lv_filter_4_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:5935:6: lv_filter_4_0= ruleEFilteredExpression
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
    // InternalAnsibleDsl.g:5957:1: entryRuleEOrExpression returns [EObject current=null] : iv_ruleEOrExpression= ruleEOrExpression EOF ;
    public final EObject entryRuleEOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOrExpression = null;


        try {
            // InternalAnsibleDsl.g:5957:54: (iv_ruleEOrExpression= ruleEOrExpression EOF )
            // InternalAnsibleDsl.g:5958:2: iv_ruleEOrExpression= ruleEOrExpression EOF
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
    // InternalAnsibleDsl.g:5964:1: ruleEOrExpression returns [EObject current=null] : ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? ) ;
    public final EObject ruleEOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_or_0_0 = null;

        EObject lv_right_or_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5970:2: ( ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5971:2: ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5971:2: ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? )
            // InternalAnsibleDsl.g:5972:3: ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5972:3: ( (lv_left_or_0_0= ruleEAndExpression ) )
            // InternalAnsibleDsl.g:5973:4: (lv_left_or_0_0= ruleEAndExpression )
            {
            // InternalAnsibleDsl.g:5973:4: (lv_left_or_0_0= ruleEAndExpression )
            // InternalAnsibleDsl.g:5974:5: lv_left_or_0_0= ruleEAndExpression
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

            // InternalAnsibleDsl.g:5991:3: (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )?
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==120) ) {
                alt171=1;
            }
            switch (alt171) {
                case 1 :
                    // InternalAnsibleDsl.g:5992:4: otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,120,FOLLOW_149); 

                    				newLeafNode(otherlv_1, grammarAccess.getEOrExpressionAccess().getOrKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5996:4: ( (lv_right_or_2_0= ruleEOrExpression ) )
                    // InternalAnsibleDsl.g:5997:5: (lv_right_or_2_0= ruleEOrExpression )
                    {
                    // InternalAnsibleDsl.g:5997:5: (lv_right_or_2_0= ruleEOrExpression )
                    // InternalAnsibleDsl.g:5998:6: lv_right_or_2_0= ruleEOrExpression
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
    // InternalAnsibleDsl.g:6020:1: entryRuleEAndExpression returns [EObject current=null] : iv_ruleEAndExpression= ruleEAndExpression EOF ;
    public final EObject entryRuleEAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAndExpression = null;


        try {
            // InternalAnsibleDsl.g:6020:55: (iv_ruleEAndExpression= ruleEAndExpression EOF )
            // InternalAnsibleDsl.g:6021:2: iv_ruleEAndExpression= ruleEAndExpression EOF
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
    // InternalAnsibleDsl.g:6027:1: ruleEAndExpression returns [EObject current=null] : ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? ) ;
    public final EObject ruleEAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_and_0_0 = null;

        EObject lv_right_and_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6033:2: ( ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? ) )
            // InternalAnsibleDsl.g:6034:2: ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:6034:2: ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? )
            // InternalAnsibleDsl.g:6035:3: ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )?
            {
            // InternalAnsibleDsl.g:6035:3: ( (lv_left_and_0_0= ruleETruthExpression ) )
            // InternalAnsibleDsl.g:6036:4: (lv_left_and_0_0= ruleETruthExpression )
            {
            // InternalAnsibleDsl.g:6036:4: (lv_left_and_0_0= ruleETruthExpression )
            // InternalAnsibleDsl.g:6037:5: lv_left_and_0_0= ruleETruthExpression
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

            // InternalAnsibleDsl.g:6054:3: (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==121) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // InternalAnsibleDsl.g:6055:4: otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,121,FOLLOW_149); 

                    				newLeafNode(otherlv_1, grammarAccess.getEAndExpressionAccess().getAndKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6059:4: ( (lv_right_and_2_0= ruleEAndExpression ) )
                    // InternalAnsibleDsl.g:6060:5: (lv_right_and_2_0= ruleEAndExpression )
                    {
                    // InternalAnsibleDsl.g:6060:5: (lv_right_and_2_0= ruleEAndExpression )
                    // InternalAnsibleDsl.g:6061:6: lv_right_and_2_0= ruleEAndExpression
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
    // InternalAnsibleDsl.g:6083:1: entryRuleETruthExpression returns [EObject current=null] : iv_ruleETruthExpression= ruleETruthExpression EOF ;
    public final EObject entryRuleETruthExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETruthExpression = null;


        try {
            // InternalAnsibleDsl.g:6083:57: (iv_ruleETruthExpression= ruleETruthExpression EOF )
            // InternalAnsibleDsl.g:6084:2: iv_ruleETruthExpression= ruleETruthExpression EOF
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
    // InternalAnsibleDsl.g:6090:1: ruleETruthExpression returns [EObject current=null] : ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? ) ;
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
            // InternalAnsibleDsl.g:6096:2: ( ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? ) )
            // InternalAnsibleDsl.g:6097:2: ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:6097:2: ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? )
            // InternalAnsibleDsl.g:6098:3: ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )?
            {
            // InternalAnsibleDsl.g:6098:3: ( (lv_left_value_0_0= ruleEOperation ) )
            // InternalAnsibleDsl.g:6099:4: (lv_left_value_0_0= ruleEOperation )
            {
            // InternalAnsibleDsl.g:6099:4: (lv_left_value_0_0= ruleEOperation )
            // InternalAnsibleDsl.g:6100:5: lv_left_value_0_0= ruleEOperation
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

            // InternalAnsibleDsl.g:6117:3: ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )?
            int alt174=2;
            int LA174_0 = input.LA(1);

            if ( ((LA174_0>=122 && LA174_0<=127)) ) {
                alt174=1;
            }
            switch (alt174) {
                case 1 :
                    // InternalAnsibleDsl.g:6118:4: ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) )
                    {
                    // InternalAnsibleDsl.g:6118:4: ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) )
                    // InternalAnsibleDsl.g:6119:5: ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) )
                    {
                    // InternalAnsibleDsl.g:6119:5: ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) )
                    // InternalAnsibleDsl.g:6120:6: (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' )
                    {
                    // InternalAnsibleDsl.g:6120:6: (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' )
                    int alt173=6;
                    switch ( input.LA(1) ) {
                    case 122:
                        {
                        alt173=1;
                        }
                        break;
                    case 123:
                        {
                        alt173=2;
                        }
                        break;
                    case 124:
                        {
                        alt173=3;
                        }
                        break;
                    case 125:
                        {
                        alt173=4;
                        }
                        break;
                    case 126:
                        {
                        alt173=5;
                        }
                        break;
                    case 127:
                        {
                        alt173=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 173, 0, input);

                        throw nvae;
                    }

                    switch (alt173) {
                        case 1 :
                            // InternalAnsibleDsl.g:6121:7: lv_equality_sign_1_1= '=='
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
                            // InternalAnsibleDsl.g:6132:7: lv_equality_sign_1_2= '!='
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
                            // InternalAnsibleDsl.g:6143:7: lv_equality_sign_1_3= '<'
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
                            // InternalAnsibleDsl.g:6154:7: lv_equality_sign_1_4= '>'
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
                            // InternalAnsibleDsl.g:6165:7: lv_equality_sign_1_5= '<='
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
                            // InternalAnsibleDsl.g:6176:7: lv_equality_sign_1_6= '>='
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

                    // InternalAnsibleDsl.g:6189:4: ( (lv_right_value_2_0= ruleETruthExpression ) )
                    // InternalAnsibleDsl.g:6190:5: (lv_right_value_2_0= ruleETruthExpression )
                    {
                    // InternalAnsibleDsl.g:6190:5: (lv_right_value_2_0= ruleETruthExpression )
                    // InternalAnsibleDsl.g:6191:6: lv_right_value_2_0= ruleETruthExpression
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
    // InternalAnsibleDsl.g:6213:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalAnsibleDsl.g:6213:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalAnsibleDsl.g:6214:2: iv_ruleEOperation= ruleEOperation EOF
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
    // InternalAnsibleDsl.g:6220:1: ruleEOperation returns [EObject current=null] : ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? ) ;
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
            // InternalAnsibleDsl.g:6226:2: ( ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? ) )
            // InternalAnsibleDsl.g:6227:2: ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? )
            {
            // InternalAnsibleDsl.g:6227:2: ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? )
            // InternalAnsibleDsl.g:6228:3: ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )?
            {
            // InternalAnsibleDsl.g:6228:3: ( (lv_left_operand_0_0= ruleEIsExpression ) )
            // InternalAnsibleDsl.g:6229:4: (lv_left_operand_0_0= ruleEIsExpression )
            {
            // InternalAnsibleDsl.g:6229:4: (lv_left_operand_0_0= ruleEIsExpression )
            // InternalAnsibleDsl.g:6230:5: lv_left_operand_0_0= ruleEIsExpression
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

            // InternalAnsibleDsl.g:6247:3: ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( ((LA176_0>=128 && LA176_0<=134)) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // InternalAnsibleDsl.g:6248:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) )
                    {
                    // InternalAnsibleDsl.g:6248:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) )
                    // InternalAnsibleDsl.g:6249:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) )
                    {
                    // InternalAnsibleDsl.g:6249:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) )
                    // InternalAnsibleDsl.g:6250:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' )
                    {
                    // InternalAnsibleDsl.g:6250:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' )
                    int alt175=7;
                    switch ( input.LA(1) ) {
                    case 128:
                        {
                        alt175=1;
                        }
                        break;
                    case 129:
                        {
                        alt175=2;
                        }
                        break;
                    case 130:
                        {
                        alt175=3;
                        }
                        break;
                    case 131:
                        {
                        alt175=4;
                        }
                        break;
                    case 132:
                        {
                        alt175=5;
                        }
                        break;
                    case 133:
                        {
                        alt175=6;
                        }
                        break;
                    case 134:
                        {
                        alt175=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 175, 0, input);

                        throw nvae;
                    }

                    switch (alt175) {
                        case 1 :
                            // InternalAnsibleDsl.g:6251:7: lv_operator_1_1= '+'
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
                            // InternalAnsibleDsl.g:6262:7: lv_operator_1_2= '-'
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
                            // InternalAnsibleDsl.g:6273:7: lv_operator_1_3= '/'
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
                            // InternalAnsibleDsl.g:6284:7: lv_operator_1_4= '//'
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
                            // InternalAnsibleDsl.g:6295:7: lv_operator_1_5= '%'
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
                            // InternalAnsibleDsl.g:6306:7: lv_operator_1_6= '*'
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
                            // InternalAnsibleDsl.g:6317:7: lv_operator_1_7= '**'
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

                    // InternalAnsibleDsl.g:6330:4: ( (lv_right_operand_2_0= ruleEOperation ) )
                    // InternalAnsibleDsl.g:6331:5: (lv_right_operand_2_0= ruleEOperation )
                    {
                    // InternalAnsibleDsl.g:6331:5: (lv_right_operand_2_0= ruleEOperation )
                    // InternalAnsibleDsl.g:6332:6: lv_right_operand_2_0= ruleEOperation
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
    // InternalAnsibleDsl.g:6354:1: entryRuleEIsExpression returns [EObject current=null] : iv_ruleEIsExpression= ruleEIsExpression EOF ;
    public final EObject entryRuleEIsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIsExpression = null;


        try {
            // InternalAnsibleDsl.g:6354:54: (iv_ruleEIsExpression= ruleEIsExpression EOF )
            // InternalAnsibleDsl.g:6355:2: iv_ruleEIsExpression= ruleEIsExpression EOF
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
    // InternalAnsibleDsl.g:6361:1: ruleEIsExpression returns [EObject current=null] : ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? ) ;
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
            // InternalAnsibleDsl.g:6367:2: ( ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? ) )
            // InternalAnsibleDsl.g:6368:2: ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? )
            {
            // InternalAnsibleDsl.g:6368:2: ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? )
            // InternalAnsibleDsl.g:6369:3: ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )?
            {
            // InternalAnsibleDsl.g:6369:3: ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) )
            // InternalAnsibleDsl.g:6370:4: (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression )
            {
            // InternalAnsibleDsl.g:6370:4: (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression )
            // InternalAnsibleDsl.g:6371:5: lv_parenthesised_expression_0_0= ruleEParenthesisedExpression
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

            // InternalAnsibleDsl.g:6388:3: ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )?
            int alt179=3;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==135) ) {
                alt179=1;
            }
            else if ( ((LA179_0>=136 && LA179_0<=137)) ) {
                alt179=2;
            }
            switch (alt179) {
                case 1 :
                    // InternalAnsibleDsl.g:6389:4: (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) )
                    {
                    // InternalAnsibleDsl.g:6389:4: (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) )
                    // InternalAnsibleDsl.g:6390:5: otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) )
                    {
                    otherlv_1=(Token)match(input,135,FOLLOW_159); 

                    					newLeafNode(otherlv_1, grammarAccess.getEIsExpressionAccess().getIsKeyword_1_0_0());
                    				
                    // InternalAnsibleDsl.g:6394:5: ( (lv_is_not_2_0= 'not' ) )?
                    int alt177=2;
                    int LA177_0 = input.LA(1);

                    if ( (LA177_0==136) ) {
                        alt177=1;
                    }
                    switch (alt177) {
                        case 1 :
                            // InternalAnsibleDsl.g:6395:6: (lv_is_not_2_0= 'not' )
                            {
                            // InternalAnsibleDsl.g:6395:6: (lv_is_not_2_0= 'not' )
                            // InternalAnsibleDsl.g:6396:7: lv_is_not_2_0= 'not'
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

                    // InternalAnsibleDsl.g:6408:5: ( (lv_status_3_0= ruleEIsExpression ) )
                    // InternalAnsibleDsl.g:6409:6: (lv_status_3_0= ruleEIsExpression )
                    {
                    // InternalAnsibleDsl.g:6409:6: (lv_status_3_0= ruleEIsExpression )
                    // InternalAnsibleDsl.g:6410:7: lv_status_3_0= ruleEIsExpression
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
                    // InternalAnsibleDsl.g:6429:4: ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) )
                    {
                    // InternalAnsibleDsl.g:6429:4: ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) )
                    // InternalAnsibleDsl.g:6430:5: ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) )
                    {
                    // InternalAnsibleDsl.g:6430:5: ( (lv_is_not_4_0= 'not' ) )?
                    int alt178=2;
                    int LA178_0 = input.LA(1);

                    if ( (LA178_0==136) ) {
                        alt178=1;
                    }
                    switch (alt178) {
                        case 1 :
                            // InternalAnsibleDsl.g:6431:6: (lv_is_not_4_0= 'not' )
                            {
                            // InternalAnsibleDsl.g:6431:6: (lv_is_not_4_0= 'not' )
                            // InternalAnsibleDsl.g:6432:7: lv_is_not_4_0= 'not'
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
                    				
                    // InternalAnsibleDsl.g:6448:5: ( (lv_container_expression_6_0= ruleEIsExpression ) )
                    // InternalAnsibleDsl.g:6449:6: (lv_container_expression_6_0= ruleEIsExpression )
                    {
                    // InternalAnsibleDsl.g:6449:6: (lv_container_expression_6_0= ruleEIsExpression )
                    // InternalAnsibleDsl.g:6450:7: lv_container_expression_6_0= ruleEIsExpression
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
    // InternalAnsibleDsl.g:6473:1: entryRuleEParenthesisedExpression returns [EObject current=null] : iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF ;
    public final EObject entryRuleEParenthesisedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParenthesisedExpression = null;


        try {
            // InternalAnsibleDsl.g:6473:65: (iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF )
            // InternalAnsibleDsl.g:6474:2: iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF
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
    // InternalAnsibleDsl.g:6480:1: ruleEParenthesisedExpression returns [EObject current=null] : ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleEParenthesisedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_basic_value_0_0 = null;

        EObject lv_parenthesised_term_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6486:2: ( ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) ) )
            // InternalAnsibleDsl.g:6487:2: ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) )
            {
            // InternalAnsibleDsl.g:6487:2: ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) )
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( ((LA180_0>=RULE_STRING && LA180_0<=RULE_NULL)||LA180_0==113||LA180_0==141||LA180_0==143||(LA180_0>=145 && LA180_0<=147)) ) {
                alt180=1;
            }
            else if ( (LA180_0==117) ) {
                alt180=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 180, 0, input);

                throw nvae;
            }
            switch (alt180) {
                case 1 :
                    // InternalAnsibleDsl.g:6488:3: ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) )
                    {
                    // InternalAnsibleDsl.g:6488:3: ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) )
                    // InternalAnsibleDsl.g:6489:4: (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression )
                    {
                    // InternalAnsibleDsl.g:6489:4: (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression )
                    // InternalAnsibleDsl.g:6490:5: lv_basic_value_0_0= ruleEValuePassedToJinjaExpression
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
                    // InternalAnsibleDsl.g:6508:3: (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' )
                    {
                    // InternalAnsibleDsl.g:6508:3: (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' )
                    // InternalAnsibleDsl.g:6509:4: otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,117,FOLLOW_149); 

                    				newLeafNode(otherlv_1, grammarAccess.getEParenthesisedExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6513:4: ( (lv_parenthesised_term_2_0= ruleEOrExpression ) )
                    // InternalAnsibleDsl.g:6514:5: (lv_parenthesised_term_2_0= ruleEOrExpression )
                    {
                    // InternalAnsibleDsl.g:6514:5: (lv_parenthesised_term_2_0= ruleEOrExpression )
                    // InternalAnsibleDsl.g:6515:6: lv_parenthesised_term_2_0= ruleEOrExpression
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
    // InternalAnsibleDsl.g:6541:1: entryRuleEIfExpression returns [EObject current=null] : iv_ruleEIfExpression= ruleEIfExpression EOF ;
    public final EObject entryRuleEIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIfExpression = null;


        try {
            // InternalAnsibleDsl.g:6541:54: (iv_ruleEIfExpression= ruleEIfExpression EOF )
            // InternalAnsibleDsl.g:6542:2: iv_ruleEIfExpression= ruleEIfExpression EOF
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
    // InternalAnsibleDsl.g:6548:1: ruleEIfExpression returns [EObject current=null] : (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? ) ;
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
            // InternalAnsibleDsl.g:6554:2: ( (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? ) )
            // InternalAnsibleDsl.g:6555:2: (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:6555:2: (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? )
            // InternalAnsibleDsl.g:6556:3: otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )?
            {
            otherlv_0=(Token)match(input,138,FOLLOW_149); 

            			newLeafNode(otherlv_0, grammarAccess.getEIfExpressionAccess().getReturnKeyword_0());
            		
            // InternalAnsibleDsl.g:6560:3: ( (lv_if_expression_1_0= ruleEFilteredExpression ) )
            // InternalAnsibleDsl.g:6561:4: (lv_if_expression_1_0= ruleEFilteredExpression )
            {
            // InternalAnsibleDsl.g:6561:4: (lv_if_expression_1_0= ruleEFilteredExpression )
            // InternalAnsibleDsl.g:6562:5: lv_if_expression_1_0= ruleEFilteredExpression
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
            		
            // InternalAnsibleDsl.g:6583:3: ( (lv_if_condition_3_0= ruleEFilteredExpression ) )
            // InternalAnsibleDsl.g:6584:4: (lv_if_condition_3_0= ruleEFilteredExpression )
            {
            // InternalAnsibleDsl.g:6584:4: (lv_if_condition_3_0= ruleEFilteredExpression )
            // InternalAnsibleDsl.g:6585:5: lv_if_condition_3_0= ruleEFilteredExpression
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

            // InternalAnsibleDsl.g:6602:3: (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )?
            int alt181=2;
            int LA181_0 = input.LA(1);

            if ( (LA181_0==140) ) {
                alt181=1;
            }
            switch (alt181) {
                case 1 :
                    // InternalAnsibleDsl.g:6603:4: otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) )
                    {
                    otherlv_4=(Token)match(input,140,FOLLOW_149); 

                    				newLeafNode(otherlv_4, grammarAccess.getEIfExpressionAccess().getElseKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:6607:4: ( (lv_else_expression_5_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:6608:5: (lv_else_expression_5_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:6608:5: (lv_else_expression_5_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:6609:6: lv_else_expression_5_0= ruleEFilteredExpression
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
    // InternalAnsibleDsl.g:6631:1: entryRuleEDictionaryPairReference returns [EObject current=null] : iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF ;
    public final EObject entryRuleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPairReference = null;


        try {
            // InternalAnsibleDsl.g:6631:65: (iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF )
            // InternalAnsibleDsl.g:6632:2: iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF
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
    // InternalAnsibleDsl.g:6638:1: ruleEDictionaryPairReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6644:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? ) )
            // InternalAnsibleDsl.g:6645:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? )
            {
            // InternalAnsibleDsl.g:6645:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? )
            // InternalAnsibleDsl.g:6646:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            {
            // InternalAnsibleDsl.g:6646:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6647:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6647:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:6648:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDictionaryPairReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_163); 

            					newLeafNode(otherlv_0, grammarAccess.getEDictionaryPairReferenceAccess().getNameEDictionaryPairCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6659:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==141) ) {
                alt182=1;
            }
            switch (alt182) {
                case 1 :
                    // InternalAnsibleDsl.g:6660:4: otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,141,FOLLOW_115); 

                    				newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairReferenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6664:4: ( (lv_index_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6665:5: (lv_index_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6665:5: (lv_index_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6666:6: lv_index_2_0= RULE_NUMBER
                    {
                    lv_index_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_164); 

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

                    otherlv_3=(Token)match(input,142,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEVariableDeclarationVariableReference"
    // InternalAnsibleDsl.g:6691:1: entryRuleEVariableDeclarationVariableReference returns [EObject current=null] : iv_ruleEVariableDeclarationVariableReference= ruleEVariableDeclarationVariableReference EOF ;
    public final EObject entryRuleEVariableDeclarationVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclarationVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6691:78: (iv_ruleEVariableDeclarationVariableReference= ruleEVariableDeclarationVariableReference EOF )
            // InternalAnsibleDsl.g:6692:2: iv_ruleEVariableDeclarationVariableReference= ruleEVariableDeclarationVariableReference EOF
            {
             newCompositeNode(grammarAccess.getEVariableDeclarationVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVariableDeclarationVariableReference=ruleEVariableDeclarationVariableReference();

            state._fsp--;

             current =iv_ruleEVariableDeclarationVariableReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEVariableDeclarationVariableReference"


    // $ANTLR start "ruleEVariableDeclarationVariableReference"
    // InternalAnsibleDsl.g:6698:1: ruleEVariableDeclarationVariableReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* ) ;
    public final EObject ruleEVariableDeclarationVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_tail_5_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6704:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* ) )
            // InternalAnsibleDsl.g:6705:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* )
            {
            // InternalAnsibleDsl.g:6705:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* )
            // InternalAnsibleDsl.g:6706:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )*
            {
            // InternalAnsibleDsl.g:6706:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6707:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6707:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:6708:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEVariableDeclarationVariableReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_165); 

            					newLeafNode(otherlv_0, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getVariable_declaration_variable_referenceEVariableDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6719:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==141) ) {
                alt183=1;
            }
            switch (alt183) {
                case 1 :
                    // InternalAnsibleDsl.g:6720:4: otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,141,FOLLOW_115); 

                    				newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6724:4: ( (lv_index_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6725:5: (lv_index_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6725:5: (lv_index_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6726:6: lv_index_2_0= RULE_NUMBER
                    {
                    lv_index_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_164); 

                    						newLeafNode(lv_index_2_0, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getIndexNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEVariableDeclarationVariableReferenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index",
                    							lv_index_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,142,FOLLOW_146); 

                    				newLeafNode(otherlv_3, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:6747:3: (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )*
            loop184:
            do {
                int alt184=2;
                int LA184_0 = input.LA(1);

                if ( (LA184_0==114) ) {
                    int LA184_2 = input.LA(2);

                    if ( (LA184_2==RULE_ID) ) {
                        int LA184_3 = input.LA(3);

                        if ( (LA184_3==EOF||LA184_3==19||LA184_3==35||LA184_3==37||LA184_3==49||(LA184_3>=54 && LA184_3<=57)||LA184_3==61||(LA184_3>=75 && LA184_3<=77)||(LA184_3>=96 && LA184_3<=98)||LA184_3==101||LA184_3==114||LA184_3==116||(LA184_3>=118 && LA184_3<=137)||(LA184_3>=139 && LA184_3<=141)||LA184_3==144) ) {
                            alt184=1;
                        }


                    }


                }


                switch (alt184) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6748:4: otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) )
            	    {
            	    otherlv_4=(Token)match(input,114,FOLLOW_26); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6752:4: ( (lv_tail_5_0= ruleEDictionaryPairReference ) )
            	    // InternalAnsibleDsl.g:6753:5: (lv_tail_5_0= ruleEDictionaryPairReference )
            	    {
            	    // InternalAnsibleDsl.g:6753:5: (lv_tail_5_0= ruleEDictionaryPairReference )
            	    // InternalAnsibleDsl.g:6754:6: lv_tail_5_0= ruleEDictionaryPairReference
            	    {

            	    						newCompositeNode(grammarAccess.getEVariableDeclarationVariableReferenceAccess().getTailEDictionaryPairReferenceParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_146);
            	    lv_tail_5_0=ruleEDictionaryPairReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEVariableDeclarationVariableReferenceRule());
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
    // $ANTLR end "ruleEVariableDeclarationVariableReference"


    // $ANTLR start "entryRuleERegisterVariableReference"
    // InternalAnsibleDsl.g:6776:1: entryRuleERegisterVariableReference returns [EObject current=null] : iv_ruleERegisterVariableReference= ruleERegisterVariableReference EOF ;
    public final EObject entryRuleERegisterVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6776:67: (iv_ruleERegisterVariableReference= ruleERegisterVariableReference EOF )
            // InternalAnsibleDsl.g:6777:2: iv_ruleERegisterVariableReference= ruleERegisterVariableReference EOF
            {
             newCompositeNode(grammarAccess.getERegisterVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERegisterVariableReference=ruleERegisterVariableReference();

            state._fsp--;

             current =iv_ruleERegisterVariableReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERegisterVariableReference"


    // $ANTLR start "ruleERegisterVariableReference"
    // InternalAnsibleDsl.g:6783:1: ruleERegisterVariableReference returns [EObject current=null] : (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* ) ;
    public final EObject ruleERegisterVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_index_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_tail_6_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6789:2: ( (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:6790:2: (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:6790:2: (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:6791:3: otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,143,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableReferenceAccess().getRegistered_variableKeyword_0());
            		
            // InternalAnsibleDsl.g:6795:3: ( (otherlv_1= RULE_ID ) )
            // InternalAnsibleDsl.g:6796:4: (otherlv_1= RULE_ID )
            {
            // InternalAnsibleDsl.g:6796:4: (otherlv_1= RULE_ID )
            // InternalAnsibleDsl.g:6797:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERegisterVariableReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_165); 

            					newLeafNode(otherlv_1, grammarAccess.getERegisterVariableReferenceAccess().getRegister_variable_referenceERegisterVariableCrossReference_1_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6808:3: (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )?
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==141) ) {
                alt185=1;
            }
            switch (alt185) {
                case 1 :
                    // InternalAnsibleDsl.g:6809:4: otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,141,FOLLOW_115); 

                    				newLeafNode(otherlv_2, grammarAccess.getERegisterVariableReferenceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:6813:4: ( (lv_index_3_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6814:5: (lv_index_3_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6814:5: (lv_index_3_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6815:6: lv_index_3_0= RULE_NUMBER
                    {
                    lv_index_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_164); 

                    						newLeafNode(lv_index_3_0, grammarAccess.getERegisterVariableReferenceAccess().getIndexNUMBERTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERegisterVariableReferenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index",
                    							lv_index_3_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,142,FOLLOW_146); 

                    				newLeafNode(otherlv_4, grammarAccess.getERegisterVariableReferenceAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:6836:3: (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )*
            loop186:
            do {
                int alt186=2;
                int LA186_0 = input.LA(1);

                if ( (LA186_0==114) ) {
                    int LA186_2 = input.LA(2);

                    if ( (LA186_2==RULE_ID) ) {
                        int LA186_3 = input.LA(3);

                        if ( (LA186_3==EOF||LA186_3==19||LA186_3==35||LA186_3==37||LA186_3==49||(LA186_3>=54 && LA186_3<=57)||LA186_3==61||(LA186_3>=75 && LA186_3<=77)||(LA186_3>=96 && LA186_3<=98)||LA186_3==101||LA186_3==114||LA186_3==116||(LA186_3>=118 && LA186_3<=137)||(LA186_3>=139 && LA186_3<=140)||LA186_3==144) ) {
                            alt186=1;
                        }


                    }


                }


                switch (alt186) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6837:4: otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,114,FOLLOW_26); 

            	    				newLeafNode(otherlv_5, grammarAccess.getERegisterVariableReferenceAccess().getFullStopKeyword_3_0());
            	    			
            	    // InternalAnsibleDsl.g:6841:4: ( (lv_tail_6_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:6842:5: (lv_tail_6_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:6842:5: (lv_tail_6_0= RULE_ID )
            	    // InternalAnsibleDsl.g:6843:6: lv_tail_6_0= RULE_ID
            	    {
            	    lv_tail_6_0=(Token)match(input,RULE_ID,FOLLOW_146); 

            	    						newLeafNode(lv_tail_6_0, grammarAccess.getERegisterVariableReferenceAccess().getTailIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getERegisterVariableReferenceRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"tail",
            	    							lv_tail_6_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop186;
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
    // $ANTLR end "ruleERegisterVariableReference"


    // $ANTLR start "entryRuleEVariableDeclaration"
    // InternalAnsibleDsl.g:6864:1: entryRuleEVariableDeclaration returns [EObject current=null] : iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF ;
    public final EObject entryRuleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclaration = null;


        try {
            // InternalAnsibleDsl.g:6864:61: (iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF )
            // InternalAnsibleDsl.g:6865:2: iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF
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
    // InternalAnsibleDsl.g:6871:1: ruleEVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6877:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:6878:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:6878:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:6879:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:6879:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6880:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6880:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6881:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_94); 

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

            otherlv_1=(Token)match(input,64,FOLLOW_166); 

            			newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:6901:3: ( (lv_value_passed_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6902:4: (lv_value_passed_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6902:4: (lv_value_passed_2_0= ruleEValue )
            // InternalAnsibleDsl.g:6903:5: lv_value_passed_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:6924:1: entryRuleERegisterVariable returns [EObject current=null] : iv_ruleERegisterVariable= ruleERegisterVariable EOF ;
    public final EObject entryRuleERegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariable = null;


        try {
            // InternalAnsibleDsl.g:6924:58: (iv_ruleERegisterVariable= ruleERegisterVariable EOF )
            // InternalAnsibleDsl.g:6925:2: iv_ruleERegisterVariable= ruleERegisterVariable EOF
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
    // InternalAnsibleDsl.g:6931:1: ruleERegisterVariable returns [EObject current=null] : (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleERegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6937:2: ( (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:6938:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:6938:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6939:3: otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,144,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableAccess().getRegisterKeyword_0());
            		
            // InternalAnsibleDsl.g:6943:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6944:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6944:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:6945:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleEInputVariableReference"
    // InternalAnsibleDsl.g:6965:1: entryRuleEInputVariableReference returns [EObject current=null] : iv_ruleEInputVariableReference= ruleEInputVariableReference EOF ;
    public final EObject entryRuleEInputVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6965:64: (iv_ruleEInputVariableReference= ruleEInputVariableReference EOF )
            // InternalAnsibleDsl.g:6966:2: iv_ruleEInputVariableReference= ruleEInputVariableReference EOF
            {
             newCompositeNode(grammarAccess.getEInputVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInputVariableReference=ruleEInputVariableReference();

            state._fsp--;

             current =iv_ruleEInputVariableReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInputVariableReference"


    // $ANTLR start "ruleEInputVariableReference"
    // InternalAnsibleDsl.g:6972:1: ruleEInputVariableReference returns [EObject current=null] : (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEInputVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_index_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_tail_6_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6978:2: ( (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:6979:2: (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:6979:2: (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:6980:3: otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,145,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEInputVariableReferenceAccess().getInterface_inputKeyword_0());
            		
            // InternalAnsibleDsl.g:6984:3: ( (otherlv_1= RULE_STRING ) )
            // InternalAnsibleDsl.g:6985:4: (otherlv_1= RULE_STRING )
            {
            // InternalAnsibleDsl.g:6985:4: (otherlv_1= RULE_STRING )
            // InternalAnsibleDsl.g:6986:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInputVariableReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_165); 

            					newLeafNode(otherlv_1, grammarAccess.getEInputVariableReferenceAccess().getNameEParameterDefinitionCrossReference_1_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6997:3: (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )?
            int alt187=2;
            int LA187_0 = input.LA(1);

            if ( (LA187_0==141) ) {
                alt187=1;
            }
            switch (alt187) {
                case 1 :
                    // InternalAnsibleDsl.g:6998:4: otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,141,FOLLOW_115); 

                    				newLeafNode(otherlv_2, grammarAccess.getEInputVariableReferenceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:7002:4: ( (lv_index_3_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:7003:5: (lv_index_3_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:7003:5: (lv_index_3_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:7004:6: lv_index_3_0= RULE_NUMBER
                    {
                    lv_index_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_164); 

                    						newLeafNode(lv_index_3_0, grammarAccess.getEInputVariableReferenceAccess().getIndexNUMBERTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInputVariableReferenceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index",
                    							lv_index_3_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,142,FOLLOW_146); 

                    				newLeafNode(otherlv_4, grammarAccess.getEInputVariableReferenceAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:7025:3: (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )*
            loop188:
            do {
                int alt188=2;
                int LA188_0 = input.LA(1);

                if ( (LA188_0==114) ) {
                    int LA188_2 = input.LA(2);

                    if ( (LA188_2==RULE_ID) ) {
                        int LA188_3 = input.LA(3);

                        if ( (LA188_3==EOF||LA188_3==19||LA188_3==35||LA188_3==37||LA188_3==49||(LA188_3>=54 && LA188_3<=57)||LA188_3==61||(LA188_3>=75 && LA188_3<=77)||(LA188_3>=96 && LA188_3<=98)||LA188_3==101||LA188_3==114||LA188_3==116||(LA188_3>=118 && LA188_3<=137)||(LA188_3>=139 && LA188_3<=140)||LA188_3==144) ) {
                            alt188=1;
                        }


                    }


                }


                switch (alt188) {
            	case 1 :
            	    // InternalAnsibleDsl.g:7026:4: otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,114,FOLLOW_26); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEInputVariableReferenceAccess().getFullStopKeyword_3_0());
            	    			
            	    // InternalAnsibleDsl.g:7030:4: ( (lv_tail_6_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:7031:5: (lv_tail_6_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:7031:5: (lv_tail_6_0= RULE_ID )
            	    // InternalAnsibleDsl.g:7032:6: lv_tail_6_0= RULE_ID
            	    {
            	    lv_tail_6_0=(Token)match(input,RULE_ID,FOLLOW_146); 

            	    						newLeafNode(lv_tail_6_0, grammarAccess.getEInputVariableReferenceAccess().getTailIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEInputVariableReferenceRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"tail",
            	    							lv_tail_6_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop188;
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
    // $ANTLR end "ruleEInputVariableReference"


    // $ANTLR start "entryRuleEVariableReference"
    // InternalAnsibleDsl.g:7053:1: entryRuleEVariableReference returns [EObject current=null] : iv_ruleEVariableReference= ruleEVariableReference EOF ;
    public final EObject entryRuleEVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableReference = null;


        try {
            // InternalAnsibleDsl.g:7053:59: (iv_ruleEVariableReference= ruleEVariableReference EOF )
            // InternalAnsibleDsl.g:7054:2: iv_ruleEVariableReference= ruleEVariableReference EOF
            {
             newCompositeNode(grammarAccess.getEVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEVariableReference=ruleEVariableReference();

            state._fsp--;

             current =iv_ruleEVariableReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEVariableReference"


    // $ANTLR start "ruleEVariableReference"
    // InternalAnsibleDsl.g:7060:1: ruleEVariableReference returns [EObject current=null] : (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputVariableReference_2= ruleEInputVariableReference ) ;
    public final EObject ruleEVariableReference() throws RecognitionException {
        EObject current = null;

        EObject this_EVariableDeclarationVariableReference_0 = null;

        EObject this_ERegisterVariableReference_1 = null;

        EObject this_EInputVariableReference_2 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:7066:2: ( (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputVariableReference_2= ruleEInputVariableReference ) )
            // InternalAnsibleDsl.g:7067:2: (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputVariableReference_2= ruleEInputVariableReference )
            {
            // InternalAnsibleDsl.g:7067:2: (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputVariableReference_2= ruleEInputVariableReference )
            int alt189=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt189=1;
                }
                break;
            case 143:
                {
                alt189=2;
                }
                break;
            case 145:
                {
                alt189=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 189, 0, input);

                throw nvae;
            }

            switch (alt189) {
                case 1 :
                    // InternalAnsibleDsl.g:7068:3: this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference
                    {

                    			newCompositeNode(grammarAccess.getEVariableReferenceAccess().getEVariableDeclarationVariableReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EVariableDeclarationVariableReference_0=ruleEVariableDeclarationVariableReference();

                    state._fsp--;


                    			current = this_EVariableDeclarationVariableReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:7077:3: this_ERegisterVariableReference_1= ruleERegisterVariableReference
                    {

                    			newCompositeNode(grammarAccess.getEVariableReferenceAccess().getERegisterVariableReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ERegisterVariableReference_1=ruleERegisterVariableReference();

                    state._fsp--;


                    			current = this_ERegisterVariableReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:7086:3: this_EInputVariableReference_2= ruleEInputVariableReference
                    {

                    			newCompositeNode(grammarAccess.getEVariableReferenceAccess().getEInputVariableReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EInputVariableReference_2=ruleEInputVariableReference();

                    state._fsp--;


                    			current = this_EInputVariableReference_2;
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
    // $ANTLR end "ruleEVariableReference"


    // $ANTLR start "entryRuleEFactGathered"
    // InternalAnsibleDsl.g:7098:1: entryRuleEFactGathered returns [EObject current=null] : iv_ruleEFactGathered= ruleEFactGathered EOF ;
    public final EObject entryRuleEFactGathered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactGathered = null;


        try {
            // InternalAnsibleDsl.g:7098:54: (iv_ruleEFactGathered= ruleEFactGathered EOF )
            // InternalAnsibleDsl.g:7099:2: iv_ruleEFactGathered= ruleEFactGathered EOF
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
    // InternalAnsibleDsl.g:7105:1: ruleEFactGathered returns [EObject current=null] : ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEFactGathered() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tail_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:7111:2: ( ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:7112:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:7112:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:7113:3: () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            {
            // InternalAnsibleDsl.g:7113:3: ()
            // InternalAnsibleDsl.g:7114:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactGatheredAccess().getEFactGatheredAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,146,FOLLOW_146); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactGatheredAccess().getAnsible_factsKeyword_1());
            		
            // InternalAnsibleDsl.g:7124:3: (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            loop190:
            do {
                int alt190=2;
                int LA190_0 = input.LA(1);

                if ( (LA190_0==114) ) {
                    int LA190_2 = input.LA(2);

                    if ( (LA190_2==RULE_ID) ) {
                        int LA190_3 = input.LA(3);

                        if ( (LA190_3==EOF||LA190_3==19||LA190_3==35||LA190_3==37||LA190_3==49||(LA190_3>=54 && LA190_3<=57)||LA190_3==61||(LA190_3>=75 && LA190_3<=77)||(LA190_3>=96 && LA190_3<=98)||LA190_3==101||LA190_3==114||LA190_3==116||(LA190_3>=118 && LA190_3<=137)||(LA190_3>=139 && LA190_3<=140)||LA190_3==144) ) {
                            alt190=1;
                        }


                    }


                }


                switch (alt190) {
            	case 1 :
            	    // InternalAnsibleDsl.g:7125:4: otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,114,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEFactGatheredAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:7129:4: ( (lv_tail_3_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:7130:5: (lv_tail_3_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:7130:5: (lv_tail_3_0= RULE_ID )
            	    // InternalAnsibleDsl.g:7131:6: lv_tail_3_0= RULE_ID
            	    {
            	    lv_tail_3_0=(Token)match(input,RULE_ID,FOLLOW_146); 

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
            	    break loop190;
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
    // InternalAnsibleDsl.g:7152:1: entryRuleEDictionary returns [EObject current=null] : iv_ruleEDictionary= ruleEDictionary EOF ;
    public final EObject entryRuleEDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionary = null;


        try {
            // InternalAnsibleDsl.g:7152:52: (iv_ruleEDictionary= ruleEDictionary EOF )
            // InternalAnsibleDsl.g:7153:2: iv_ruleEDictionary= ruleEDictionary EOF
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
    // InternalAnsibleDsl.g:7159:1: ruleEDictionary returns [EObject current=null] : (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dictionary_pairs_1_0 = null;

        EObject lv_dictionary_pairs_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:7165:2: ( (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:7166:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:7166:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:7167:3: otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,147,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getEDictionaryAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:7171:3: ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) )
            // InternalAnsibleDsl.g:7172:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            {
            // InternalAnsibleDsl.g:7172:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            // InternalAnsibleDsl.g:7173:5: lv_dictionary_pairs_1_0= ruleEDictionaryPair
            {

            					newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalAnsibleDsl.g:7190:3: (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )*
            loop191:
            do {
                int alt191=2;
                int LA191_0 = input.LA(1);

                if ( (LA191_0==35) ) {
                    alt191=1;
                }


                switch (alt191) {
            	case 1 :
            	    // InternalAnsibleDsl.g:7191:4: otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_26); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEDictionaryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:7195:4: ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    // InternalAnsibleDsl.g:7196:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    {
            	    // InternalAnsibleDsl.g:7196:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    // InternalAnsibleDsl.g:7197:6: lv_dictionary_pairs_3_0= ruleEDictionaryPair
            	    {

            	    						newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
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
            	    break loop191;
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
    // InternalAnsibleDsl.g:7223:1: entryRuleEDictionaryPair returns [EObject current=null] : iv_ruleEDictionaryPair= ruleEDictionaryPair EOF ;
    public final EObject entryRuleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPair = null;


        try {
            // InternalAnsibleDsl.g:7223:56: (iv_ruleEDictionaryPair= ruleEDictionaryPair EOF )
            // InternalAnsibleDsl.g:7224:2: iv_ruleEDictionaryPair= ruleEDictionaryPair EOF
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
    // InternalAnsibleDsl.g:7230:1: ruleEDictionaryPair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:7236:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:7237:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:7237:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:7238:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:7238:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:7239:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:7239:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:7240:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_94); 

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

            otherlv_1=(Token)match(input,64,FOLLOW_166); 

            			newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:7260:3: ( (lv_value_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:7261:4: (lv_value_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:7261:4: (lv_value_2_0= ruleEValue )
            // InternalAnsibleDsl.g:7262:5: lv_value_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:7283:1: entryRuleEList returns [EObject current=null] : iv_ruleEList= ruleEList EOF ;
    public final EObject entryRuleEList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEList = null;


        try {
            // InternalAnsibleDsl.g:7283:46: (iv_ruleEList= ruleEList EOF )
            // InternalAnsibleDsl.g:7284:2: iv_ruleEList= ruleEList EOF
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
    // InternalAnsibleDsl.g:7290:1: ruleEList returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:7296:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) )
            // InternalAnsibleDsl.g:7297:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            {
            // InternalAnsibleDsl.g:7297:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            // InternalAnsibleDsl.g:7298:3: otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,141,FOLLOW_166); 

            			newLeafNode(otherlv_0, grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:7302:3: ( (lv_elements_1_0= ruleEValue ) )
            // InternalAnsibleDsl.g:7303:4: (lv_elements_1_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:7303:4: (lv_elements_1_0= ruleEValue )
            // InternalAnsibleDsl.g:7304:5: lv_elements_1_0= ruleEValue
            {

            					newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_167);
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

            // InternalAnsibleDsl.g:7321:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )*
            loop192:
            do {
                int alt192=2;
                int LA192_0 = input.LA(1);

                if ( (LA192_0==35) ) {
                    alt192=1;
                }


                switch (alt192) {
            	case 1 :
            	    // InternalAnsibleDsl.g:7322:4: otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_166); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:7326:4: ( (lv_elements_3_0= ruleEValue ) )
            	    // InternalAnsibleDsl.g:7327:5: (lv_elements_3_0= ruleEValue )
            	    {
            	    // InternalAnsibleDsl.g:7327:5: (lv_elements_3_0= ruleEValue )
            	    // InternalAnsibleDsl.g:7328:6: lv_elements_3_0= ruleEValue
            	    {

            	    						newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_167);
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
            	    break loop192;
                }
            } while (true);

            otherlv_4=(Token)match(input,142,FOLLOW_2); 

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


    protected DFA25 dfa25 = new DFA25(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\1\12\uffff";
    static final String dfa_3s = "\1\23\12\uffff";
    static final String dfa_4s = "\1\146\12\uffff";
    static final String dfa_5s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_6s = "\1\0\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\1\2\16\uffff\1\3\1\5\1\6\1\7\1\10\1\12\30\uffff\1\11\42\uffff\1\4",
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

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 356:5: ( ({...}? => ( ({...}? => ( (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) ) ( (lv_privilage_escalation_3_0= ruleEPrivilageEscalation ) )? ( (lv_validation_mode_4_0= ruleEValidationMode ) )? ( (lv_connection_5_0= ruleEConnection ) )? (otherlv_6= 'no_log:' ( (lv_no_log_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'debugger:' ( ( (lv_debugger_9_1= 'always' | lv_debugger_9_2= 'never' | lv_debugger_9_3= 'on_failed' | lv_debugger_9_4= 'on_unreachable' | lv_debugger_9_5= 'on_skipped' ) ) ) )? (otherlv_10= 'module_defaults:' ( (lv_module_defaults_11_0= ruleEList ) ) )? (otherlv_12= 'environment:' ( (lv_environment_13_0= ruleEList ) ) )? (otherlv_14= 'collections:' ( (lv_collections_15_0= ruleEList ) ) )? (otherlv_16= 'tags:' ( (lv_tags_17_0= ruleEList ) ) )? (otherlv_18= 'vars{' ( (lv_variable_declarations_19_0= ruleEVariableDeclaration ) ) (otherlv_20= ',' ( (lv_variable_declarations_21_0= ruleEVariableDeclaration ) ) )* otherlv_22= '}' )? (otherlv_23= 'play_exe_settings{' ( (lv_play_exe_settings_24_0= ruleEPlayExeSettings ) ) otherlv_25= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'error_handling{' ( (lv_error_handling_27_0= ruleEPlayErrorHandling ) ) otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_facts_settings_29_0= ruleEFactsSettings ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'vars_files:' ( (lv_vars_files_31_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'vars_prompt:' ( (lv_vars_prompt_33_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'force_handlers:' ( (lv_force_handlers_35_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'pre_tasks{' ( (lv_pre_tasks_list_37_0= ruleEBlockTask ) )+ otherlv_38= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_39_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'tasks_list{' ( (lv_tasks_list_41_0= ruleEBlockTask ) )+ otherlv_42= '}' (otherlv_43= 'post_tasks{' ( (lv_post_tasks_list_44_0= ruleEBlockTask ) )+ otherlv_45= '}' )? (otherlv_46= 'handlers{' ( (lv_handlers_47_0= ruleEHandler ) )+ otherlv_48= '}' )? ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_0==EOF||LA25_0==19) ) {s = 1;}

                        else if ( LA25_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA25_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA25_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA25_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA25_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA25_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA25_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA25_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA25_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {s = 10;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000007E000400000L,0x0000004000000008L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000007F7C1C00002L,0x0000004000904008L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000007F7C1C00002L,0x0000004000900008L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000007F7C1C00002L,0x0000004000800008L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000007F7C1C00002L,0x0000004000000008L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000007F7C1400002L,0x0000004000000008L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000007F7C0400002L,0x0000004000000008L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000007F780400002L,0x0000004000000008L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000007F700400002L,0x0000004000000008L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000007F600400002L,0x0000004000000008L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000007F400400002L,0x0000004000000008L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000007F000400002L,0x0000004000000008L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000080000L,0x00000000F8000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000007E000400002L,0x0000004000000008L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000080000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010200000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00001FE000400002L,0x0000004000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000017E000400002L,0x0000004000000008L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0800000000080000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00038027C1800000L,0x0000080000904000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00038027C1800000L,0x0000080000900000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00038027C1800000L,0x0000080000800000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00038027C1800000L,0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00038027C1000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00038027C0000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0003802780000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0003802700000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0003802600000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0003802400000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0003802000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000080000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0003002000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0003002000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00000000000001F0L,0x0022000000000000L,0x00000000000EA400L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0002002000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000080000L,0x0000000700000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000C000000080000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0008000000080000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x03C18027C1800000L,0x0000080000904000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x03C18027C1800000L,0x0000080000900000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x03C18027C1800000L,0x0000080000800000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x03C18027C1800000L,0x0000080000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x03C18027C1000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x03C18027C0000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x03C1802780000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x03C1802700000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x03C1802600000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x03C1802400000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x03C1802000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x03C1002000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x03C1002000000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x03C0002000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000080000L,0x0000003700000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0400000000080000L,0x0000000000003810L,0x0000000000010000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000010L,0x0001000000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000080010L,0x0001000000003810L,0x0000000000010000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x2400000000080000L,0x0000000000003810L,0x0000000000010000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x2000000000080010L,0x0001000000003810L,0x0000000000010000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x2000000000080000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x2000000000080000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x00000000000001B0L,0x0008000000000000L,0x0000000000082000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x00018007C1880000L,0x0000080000904000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x00018007C1880000L,0x0000080000900000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x00018007C1880000L,0x0000080000800000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x00018007C1880000L,0x0000080000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x00018007C1080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x00018007C0080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0001800780080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0001800700080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0001800600080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0001800400080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0001800000080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0001000000080000L,0x0000080000000000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0001000000080000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000002L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000080000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000780L});
    public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000700L});
    public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000600L});
    public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000400L});
    public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003800L});
    public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000080000L,0x00000000000F8000L});
    public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000000000080000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000080000L,0x00000000000E0000L});
    public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000080000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000080000L,0x0000000000080000L});
    public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000080000L,0x0000000000600000L});
    public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000080000L,0x0000000000400000L});
    public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000080000L,0x0000000007000000L});
    public static final BitSet FOLLOW_128 = new BitSet(new long[]{0x0000000000080000L,0x0000000006000000L});
    public static final BitSet FOLLOW_129 = new BitSet(new long[]{0x0000000000080000L,0x0000000004000000L});
    public static final BitSet FOLLOW_130 = new BitSet(new long[]{0x0000000000000002L,0x00000000F0000000L});
    public static final BitSet FOLLOW_131 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_132 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_133 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_134 = new BitSet(new long[]{0x0000000000000002L,0x0000000600000000L});
    public static final BitSet FOLLOW_135 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_136 = new BitSet(new long[]{0x0000000000000002L,0x0000000700000000L});
    public static final BitSet FOLLOW_137 = new BitSet(new long[]{0x0000000000000002L,0x0000002700000000L});
    public static final BitSet FOLLOW_138 = new BitSet(new long[]{0x0000000000080000L,0x0000078000000000L});
    public static final BitSet FOLLOW_139 = new BitSet(new long[]{0x0000000000080000L,0x0000070000000000L});
    public static final BitSet FOLLOW_140 = new BitSet(new long[]{0x0000000000080000L,0x0000060000000000L});
    public static final BitSet FOLLOW_141 = new BitSet(new long[]{0x0000000000080000L,0x0000040000000000L});
    public static final BitSet FOLLOW_142 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_143 = new BitSet(new long[]{0x0000000000080000L,0x0000200000000000L});
    public static final BitSet FOLLOW_144 = new BitSet(new long[]{0x0000000000000002L,0x0000C00000000000L});
    public static final BitSet FOLLOW_145 = new BitSet(new long[]{0x0000000000000012L,0x0008000000000000L});
    public static final BitSet FOLLOW_146 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_147 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_148 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_149 = new BitSet(new long[]{0x00000000000001F0L,0x0022000000000000L,0x00000000000EA000L});
    public static final BitSet FOLLOW_150 = new BitSet(new long[]{0x0000000800000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_151 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_152 = new BitSet(new long[]{0x0000000000000002L,0x0084000000000000L});
    public static final BitSet FOLLOW_153 = new BitSet(new long[]{0x00000000000001F0L,0x0002000000000000L,0x00000000000EA000L});
    public static final BitSet FOLLOW_154 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_155 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_156 = new BitSet(new long[]{0x0000000000000002L,0xFC00000000000000L});
    public static final BitSet FOLLOW_157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_158 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_159 = new BitSet(new long[]{0x00000000000001F0L,0x0022000000000000L,0x00000000000EA100L});
    public static final BitSet FOLLOW_160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_162 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_163 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_165 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_166 = new BitSet(new long[]{0x00000000000001B0L,0x0000000000000000L,0x0000000000082000L});
    public static final BitSet FOLLOW_167 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000004000L});

}
