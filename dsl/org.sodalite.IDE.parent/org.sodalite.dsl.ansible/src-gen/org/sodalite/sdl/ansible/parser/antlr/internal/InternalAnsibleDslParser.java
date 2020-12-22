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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_ID", "RULE_NUMBER", "RULE_NULL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'playbook{'", "'playbook_name:'", "'used_by{'", "'node_type:'", "'operation:'", "'}'", "'plays{'", "'play{'", "'privilage_escalation{'", "'validation_mode{'", "'connection_info{'", "'no_log:'", "'debugger:'", "'always'", "'never'", "'on_failed'", "'on_unreachable'", "'on_skipped'", "'module_defaults:'", "'environment:'", "'collections:'", "'tags:'", "'vars{'", "'exe_settings{'", "'delegation{'", "'when:'", "'error_handling{'", "'action:'", "'asynchronous_settings{'", "'args:'", "'module_call{'", "'notify:'", "'loop{'", "'play_name:'", "'base_attributes{'", "'play_exe_settings{'", "'facts_settings{'", "'vars_files:'", "'vars_prompt:'", "'force_handlers:'", "'pre_tasks{'", "'tasks_list{'", "'post_tasks{'", "'handlers{'", "'block{'", "'block_name:'", "'execution_attributes{'", "'tasks{'", "'rescue_tasks{'", "'always_tasks{'", "'task{'", "'task_name:'", "'task_handler_attributes{'", "'handler{'", "'handler_name:'", "'listen:'", "'module_name:'", "'parameters{'", "':'", "'role{'", "'role_name:'", "'roles_inclusions{'", "'loop_over:'", "'loop_control{'", "'label:'", "'pause:'", "'index_var:'", "'loop_var:'", "'extended:'", "'until:'", "'retries:'", "'delay:'", "'become:'", "'become_exe:'", "'become_flags:'", "'become_method:'", "'become_user:'", "'check_mode:'", "'diff:'", "'connection:'", "'port:'", "'remote_user:'", "'strategy:'", "'serial:'", "'order:'", "'throttle:'", "'run_once:'", "'any_errors_fatal:'", "'ignore_errors:'", "'ignore_unreachable:'", "'max_fail_percentage:'", "'changed_when:'", "'failed_when:'", "'gather_facts:'", "'gather_subset:'", "'gather_timeout:'", "'fact_path:'", "'delegate_to:'", "'delegate_facts:'", "'async:'", "'poll:'", "'topic:'", "'item'", "'.'", "'{{'", "'}}'", "'('", "','", "')'", "'|'", "'or'", "'and'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'/'", "'//'", "'%'", "'*'", "'**'", "'is'", "'not'", "'in'", "'return'", "'if'", "'else'", "'['", "']'", "'registered_variable:'", "'register:'", "'interface_input:'", "'ansible_facts'", "'{'"
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
    public static final int T__151=151;
    public static final int T__150=150;
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
            case 58:
                {
                alt3=1;
                }
                break;
            case 64:
            case 67:
                {
                alt3=2;
                }
                break;
            case 73:
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

            if ( (LA4_0==58) ) {
                alt4=1;
            }
            else if ( (LA4_0==64) ) {
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

            if ( (LA5_0==64) ) {
                alt5=1;
            }
            else if ( (LA5_0==67) ) {
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


    // $ANTLR start "entryRuleEBaseAttributes"
    // InternalAnsibleDsl.g:336:1: entryRuleEBaseAttributes returns [EObject current=null] : iv_ruleEBaseAttributes= ruleEBaseAttributes EOF ;
    public final EObject entryRuleEBaseAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBaseAttributes = null;


        try {
            // InternalAnsibleDsl.g:336:56: (iv_ruleEBaseAttributes= ruleEBaseAttributes EOF )
            // InternalAnsibleDsl.g:337:2: iv_ruleEBaseAttributes= ruleEBaseAttributes EOF
            {
             newCompositeNode(grammarAccess.getEBaseAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBaseAttributes=ruleEBaseAttributes();

            state._fsp--;

             current =iv_ruleEBaseAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBaseAttributes"


    // $ANTLR start "ruleEBaseAttributes"
    // InternalAnsibleDsl.g:343:1: ruleEBaseAttributes returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) ) ) ;
    public final EObject ruleEBaseAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_no_log_11_0=null;
        Token otherlv_12=null;
        Token lv_debugger_13_1=null;
        Token lv_debugger_13_2=null;
        Token lv_debugger_13_3=null;
        Token lv_debugger_13_4=null;
        Token lv_debugger_13_5=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_privilage_escalation_2_0 = null;

        EObject lv_validation_mode_5_0 = null;

        EObject lv_connection_8_0 = null;

        EObject lv_module_defaults_15_0 = null;

        EObject lv_environment_17_0 = null;

        EObject lv_collections_19_0 = null;

        EObject lv_tags_21_0 = null;

        EObject lv_variable_declarations_23_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:349:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:350:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:350:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:351:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:351:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:352:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:355:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* )
            // InternalAnsibleDsl.g:356:5: ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:356:5: ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )*
            loop8:
            do {
                int alt8=11;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalAnsibleDsl.g:357:3: ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:357:3: ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:358:4: {...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:358:109: ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) )
            	    // InternalAnsibleDsl.g:359:5: ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:362:8: ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) )
            	    // InternalAnsibleDsl.g:362:9: {...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:362:18: (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' )
            	    // InternalAnsibleDsl.g:362:19: otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}'
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_13); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEBaseAttributesAccess().getPrivilage_escalationKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:366:8: ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) )
            	    // InternalAnsibleDsl.g:367:9: (lv_privilage_escalation_2_0= ruleEPrivilageEscalation )
            	    {
            	    // InternalAnsibleDsl.g:367:9: (lv_privilage_escalation_2_0= ruleEPrivilageEscalation )
            	    // InternalAnsibleDsl.g:368:10: lv_privilage_escalation_2_0= ruleEPrivilageEscalation
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getPrivilage_escalationEPrivilageEscalationParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_privilage_escalation_2_0=ruleEPrivilageEscalation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"privilage_escalation",
            	    											lv_privilage_escalation_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EPrivilageEscalation");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_14); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEBaseAttributesAccess().getRightCurlyBracketKeyword_0_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:395:3: ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:395:3: ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:396:4: {...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:396:109: ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) )
            	    // InternalAnsibleDsl.g:397:5: ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:400:8: ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) )
            	    // InternalAnsibleDsl.g:400:9: {...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:400:18: (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' )
            	    // InternalAnsibleDsl.g:400:19: otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}'
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_15); 

            	    								newLeafNode(otherlv_4, grammarAccess.getEBaseAttributesAccess().getValidation_modeKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:404:8: ( (lv_validation_mode_5_0= ruleEValidationMode ) )
            	    // InternalAnsibleDsl.g:405:9: (lv_validation_mode_5_0= ruleEValidationMode )
            	    {
            	    // InternalAnsibleDsl.g:405:9: (lv_validation_mode_5_0= ruleEValidationMode )
            	    // InternalAnsibleDsl.g:406:10: lv_validation_mode_5_0= ruleEValidationMode
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getValidation_modeEValidationModeParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_validation_mode_5_0=ruleEValidationMode();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"validation_mode",
            	    											lv_validation_mode_5_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EValidationMode");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_6=(Token)match(input,19,FOLLOW_14); 

            	    								newLeafNode(otherlv_6, grammarAccess.getEBaseAttributesAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:433:3: ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:433:3: ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:434:4: {...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:434:109: ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) )
            	    // InternalAnsibleDsl.g:435:5: ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:438:8: ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) )
            	    // InternalAnsibleDsl.g:438:9: {...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:438:18: (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' )
            	    // InternalAnsibleDsl.g:438:19: otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}'
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_16); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEBaseAttributesAccess().getConnection_infoKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:442:8: ( (lv_connection_8_0= ruleEConnection ) )
            	    // InternalAnsibleDsl.g:443:9: (lv_connection_8_0= ruleEConnection )
            	    {
            	    // InternalAnsibleDsl.g:443:9: (lv_connection_8_0= ruleEConnection )
            	    // InternalAnsibleDsl.g:444:10: lv_connection_8_0= ruleEConnection
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getConnectionEConnectionParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_connection_8_0=ruleEConnection();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"connection",
            	    											lv_connection_8_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EConnection");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_9=(Token)match(input,19,FOLLOW_14); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEBaseAttributesAccess().getRightCurlyBracketKeyword_2_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:471:3: ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:471:3: ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:472:4: {...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:472:109: ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:473:5: ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:476:8: ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:476:9: {...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:476:18: (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:476:19: otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_10=(Token)match(input,25,FOLLOW_17); 

            	    								newLeafNode(otherlv_10, grammarAccess.getEBaseAttributesAccess().getNo_logKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:480:8: ( (lv_no_log_11_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:481:9: (lv_no_log_11_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:481:9: (lv_no_log_11_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:482:10: lv_no_log_11_0= RULE_BOOLEAN
            	    {
            	    lv_no_log_11_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_14); 

            	    										newLeafNode(lv_no_log_11_0, grammarAccess.getEBaseAttributesAccess().getNo_logBOOLEANTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"no_log",
            	    											lv_no_log_11_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAnsibleDsl.g:504:3: ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:504:3: ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:505:4: {...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:505:109: ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:506:5: ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:509:8: ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) )
            	    // InternalAnsibleDsl.g:509:9: {...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:509:18: (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) )
            	    // InternalAnsibleDsl.g:509:19: otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) )
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_18); 

            	    								newLeafNode(otherlv_12, grammarAccess.getEBaseAttributesAccess().getDebuggerKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:513:8: ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) )
            	    // InternalAnsibleDsl.g:514:9: ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) )
            	    {
            	    // InternalAnsibleDsl.g:514:9: ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) )
            	    // InternalAnsibleDsl.g:515:10: (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' )
            	    {
            	    // InternalAnsibleDsl.g:515:10: (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' )
            	    int alt6=5;
            	    switch ( input.LA(1) ) {
            	    case 27:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt6=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:516:11: lv_debugger_13_1= 'always'
            	            {
            	            lv_debugger_13_1=(Token)match(input,27,FOLLOW_14); 

            	            											newLeafNode(lv_debugger_13_1, grammarAccess.getEBaseAttributesAccess().getDebuggerAlwaysKeyword_4_1_0_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getEBaseAttributesRule());
            	            											}
            	            											setWithLastConsumed(current, "debugger", lv_debugger_13_1, null);
            	            										

            	            }
            	            break;
            	        case 2 :
            	            // InternalAnsibleDsl.g:527:11: lv_debugger_13_2= 'never'
            	            {
            	            lv_debugger_13_2=(Token)match(input,28,FOLLOW_14); 

            	            											newLeafNode(lv_debugger_13_2, grammarAccess.getEBaseAttributesAccess().getDebuggerNeverKeyword_4_1_0_1());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getEBaseAttributesRule());
            	            											}
            	            											setWithLastConsumed(current, "debugger", lv_debugger_13_2, null);
            	            										

            	            }
            	            break;
            	        case 3 :
            	            // InternalAnsibleDsl.g:538:11: lv_debugger_13_3= 'on_failed'
            	            {
            	            lv_debugger_13_3=(Token)match(input,29,FOLLOW_14); 

            	            											newLeafNode(lv_debugger_13_3, grammarAccess.getEBaseAttributesAccess().getDebuggerOn_failedKeyword_4_1_0_2());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getEBaseAttributesRule());
            	            											}
            	            											setWithLastConsumed(current, "debugger", lv_debugger_13_3, null);
            	            										

            	            }
            	            break;
            	        case 4 :
            	            // InternalAnsibleDsl.g:549:11: lv_debugger_13_4= 'on_unreachable'
            	            {
            	            lv_debugger_13_4=(Token)match(input,30,FOLLOW_14); 

            	            											newLeafNode(lv_debugger_13_4, grammarAccess.getEBaseAttributesAccess().getDebuggerOn_unreachableKeyword_4_1_0_3());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getEBaseAttributesRule());
            	            											}
            	            											setWithLastConsumed(current, "debugger", lv_debugger_13_4, null);
            	            										

            	            }
            	            break;
            	        case 5 :
            	            // InternalAnsibleDsl.g:560:11: lv_debugger_13_5= 'on_skipped'
            	            {
            	            lv_debugger_13_5=(Token)match(input,31,FOLLOW_14); 

            	            											newLeafNode(lv_debugger_13_5, grammarAccess.getEBaseAttributesAccess().getDebuggerOn_skippedKeyword_4_1_0_4());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getEBaseAttributesRule());
            	            											}
            	            											setWithLastConsumed(current, "debugger", lv_debugger_13_5, null);
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAnsibleDsl.g:579:3: ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:579:3: ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:580:4: {...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:580:109: ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:581:5: ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:584:8: ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:584:9: {...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:584:18: (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:584:19: otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) )
            	    {
            	    otherlv_14=(Token)match(input,32,FOLLOW_19); 

            	    								newLeafNode(otherlv_14, grammarAccess.getEBaseAttributesAccess().getModule_defaultsKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:588:8: ( (lv_module_defaults_15_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:589:9: (lv_module_defaults_15_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:589:9: (lv_module_defaults_15_0= ruleEList )
            	    // InternalAnsibleDsl.g:590:10: lv_module_defaults_15_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getModule_defaultsEListParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_module_defaults_15_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"module_defaults",
            	    											lv_module_defaults_15_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAnsibleDsl.g:613:3: ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:613:3: ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:614:4: {...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:614:109: ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:615:5: ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:618:8: ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:618:9: {...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:618:18: (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:618:19: otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) )
            	    {
            	    otherlv_16=(Token)match(input,33,FOLLOW_19); 

            	    								newLeafNode(otherlv_16, grammarAccess.getEBaseAttributesAccess().getEnvironmentKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:622:8: ( (lv_environment_17_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:623:9: (lv_environment_17_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:623:9: (lv_environment_17_0= ruleEList )
            	    // InternalAnsibleDsl.g:624:10: lv_environment_17_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getEnvironmentEListParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_environment_17_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"environment",
            	    											lv_environment_17_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAnsibleDsl.g:647:3: ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:647:3: ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:648:4: {...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:648:109: ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:649:5: ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:652:8: ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:652:9: {...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:652:18: (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:652:19: otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) )
            	    {
            	    otherlv_18=(Token)match(input,34,FOLLOW_19); 

            	    								newLeafNode(otherlv_18, grammarAccess.getEBaseAttributesAccess().getCollectionsKeyword_7_0());
            	    							
            	    // InternalAnsibleDsl.g:656:8: ( (lv_collections_19_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:657:9: (lv_collections_19_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:657:9: (lv_collections_19_0= ruleEList )
            	    // InternalAnsibleDsl.g:658:10: lv_collections_19_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getCollectionsEListParserRuleCall_7_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_collections_19_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"collections",
            	    											lv_collections_19_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalAnsibleDsl.g:681:3: ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:681:3: ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:682:4: {...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAnsibleDsl.g:682:109: ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:683:5: ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAnsibleDsl.g:686:8: ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:686:9: {...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:686:18: (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:686:19: otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) )
            	    {
            	    otherlv_20=(Token)match(input,35,FOLLOW_19); 

            	    								newLeafNode(otherlv_20, grammarAccess.getEBaseAttributesAccess().getTagsKeyword_8_0());
            	    							
            	    // InternalAnsibleDsl.g:690:8: ( (lv_tags_21_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:691:9: (lv_tags_21_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:691:9: (lv_tags_21_0= ruleEList )
            	    // InternalAnsibleDsl.g:692:10: lv_tags_21_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getTagsEListParserRuleCall_8_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_tags_21_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"tags",
            	    											lv_tags_21_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalAnsibleDsl.g:715:3: ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:715:3: ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:716:4: {...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalAnsibleDsl.g:716:109: ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) )
            	    // InternalAnsibleDsl.g:717:5: ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalAnsibleDsl.g:720:8: ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) )
            	    // InternalAnsibleDsl.g:720:9: {...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:720:18: (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' )
            	    // InternalAnsibleDsl.g:720:19: otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}'
            	    {
            	    otherlv_22=(Token)match(input,36,FOLLOW_20); 

            	    								newLeafNode(otherlv_22, grammarAccess.getEBaseAttributesAccess().getVarsKeyword_9_0());
            	    							
            	    // InternalAnsibleDsl.g:724:8: ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_ID) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:725:9: (lv_variable_declarations_23_0= ruleEVariableDeclaration )
            	    	    {
            	    	    // InternalAnsibleDsl.g:725:9: (lv_variable_declarations_23_0= ruleEVariableDeclaration )
            	    	    // InternalAnsibleDsl.g:726:10: lv_variable_declarations_23_0= ruleEVariableDeclaration
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getVariable_declarationsEVariableDeclarationParserRuleCall_9_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_21);
            	    	    lv_variable_declarations_23_0=ruleEVariableDeclaration();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"variable_declarations",
            	    	    											lv_variable_declarations_23_0,
            	    	    											"org.sodalite.sdl.ansible.AnsibleDsl.EVariableDeclaration");
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

            	    otherlv_24=(Token)match(input,19,FOLLOW_14); 

            	    								newLeafNode(otherlv_24, grammarAccess.getEBaseAttributesAccess().getRightCurlyBracketKeyword_9_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBaseAttributes"


    // $ANTLR start "entryRuleEExecutionAttributes"
    // InternalAnsibleDsl.g:763:1: entryRuleEExecutionAttributes returns [EObject current=null] : iv_ruleEExecutionAttributes= ruleEExecutionAttributes EOF ;
    public final EObject entryRuleEExecutionAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionAttributes = null;


        try {
            // InternalAnsibleDsl.g:763:61: (iv_ruleEExecutionAttributes= ruleEExecutionAttributes EOF )
            // InternalAnsibleDsl.g:764:2: iv_ruleEExecutionAttributes= ruleEExecutionAttributes EOF
            {
             newCompositeNode(grammarAccess.getEExecutionAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEExecutionAttributes=ruleEExecutionAttributes();

            state._fsp--;

             current =iv_ruleEExecutionAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEExecutionAttributes"


    // $ANTLR start "ruleEExecutionAttributes"
    // InternalAnsibleDsl.g:770:1: ruleEExecutionAttributes returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEExecutionAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_exe_settings_2_0 = null;

        EObject lv_delegation_5_0 = null;

        EObject lv_when_expression_8_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:776:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:777:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:777:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:778:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:778:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:779:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:782:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:783:5: ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:783:5: ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )*
            loop9:
            do {
                int alt9=4;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 2) ) {
                    alt9=3;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAnsibleDsl.g:784:3: ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:784:3: ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:785:4: {...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:785:114: ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) )
            	    // InternalAnsibleDsl.g:786:5: ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:789:8: ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) )
            	    // InternalAnsibleDsl.g:789:9: {...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:789:18: (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )
            	    // InternalAnsibleDsl.g:789:19: otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}'
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_22); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEExecutionAttributesAccess().getExe_settingsKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:793:8: ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) )
            	    // InternalAnsibleDsl.g:794:9: (lv_exe_settings_2_0= ruleEExecutionExeSettings )
            	    {
            	    // InternalAnsibleDsl.g:794:9: (lv_exe_settings_2_0= ruleEExecutionExeSettings )
            	    // InternalAnsibleDsl.g:795:10: lv_exe_settings_2_0= ruleEExecutionExeSettings
            	    {

            	    										newCompositeNode(grammarAccess.getEExecutionAttributesAccess().getExe_settingsEExecutionExeSettingsParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_exe_settings_2_0=ruleEExecutionExeSettings();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEExecutionAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"exe_settings",
            	    											lv_exe_settings_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionExeSettings");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_23); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEExecutionAttributesAccess().getRightCurlyBracketKeyword_0_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:822:3: ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:822:3: ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:823:4: {...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:823:114: ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) )
            	    // InternalAnsibleDsl.g:824:5: ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:827:8: ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) )
            	    // InternalAnsibleDsl.g:827:9: {...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:827:18: (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' )
            	    // InternalAnsibleDsl.g:827:19: otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}'
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_24); 

            	    								newLeafNode(otherlv_4, grammarAccess.getEExecutionAttributesAccess().getDelegationKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:831:8: ( (lv_delegation_5_0= ruleEDelegation ) )
            	    // InternalAnsibleDsl.g:832:9: (lv_delegation_5_0= ruleEDelegation )
            	    {
            	    // InternalAnsibleDsl.g:832:9: (lv_delegation_5_0= ruleEDelegation )
            	    // InternalAnsibleDsl.g:833:10: lv_delegation_5_0= ruleEDelegation
            	    {

            	    										newCompositeNode(grammarAccess.getEExecutionAttributesAccess().getDelegationEDelegationParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_delegation_5_0=ruleEDelegation();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEExecutionAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"delegation",
            	    											lv_delegation_5_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EDelegation");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_6=(Token)match(input,19,FOLLOW_23); 

            	    								newLeafNode(otherlv_6, grammarAccess.getEExecutionAttributesAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:860:3: ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:860:3: ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:861:4: {...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:861:114: ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    // InternalAnsibleDsl.g:862:5: ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:865:8: ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    // InternalAnsibleDsl.g:865:9: {...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:865:18: (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    // InternalAnsibleDsl.g:865:19: otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    {
            	    otherlv_7=(Token)match(input,39,FOLLOW_25); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEExecutionAttributesAccess().getWhenKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:869:8: ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    // InternalAnsibleDsl.g:870:9: (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    {
            	    // InternalAnsibleDsl.g:870:9: (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    // InternalAnsibleDsl.g:871:10: lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            	    {

            	    										newCompositeNode(grammarAccess.getEExecutionAttributesAccess().getWhen_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_23);
            	    lv_when_expression_8_0=ruleEJinjaExpressionEvaluationWithoutBrackets();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEExecutionAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"when_expression",
            	    											lv_when_expression_8_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionEvaluationWithoutBrackets");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEExecutionAttributes"


    // $ANTLR start "entryRuleETaskHandlerAttributes"
    // InternalAnsibleDsl.g:904:1: entryRuleETaskHandlerAttributes returns [EObject current=null] : iv_ruleETaskHandlerAttributes= ruleETaskHandlerAttributes EOF ;
    public final EObject entryRuleETaskHandlerAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerAttributes = null;


        try {
            // InternalAnsibleDsl.g:904:63: (iv_ruleETaskHandlerAttributes= ruleETaskHandlerAttributes EOF )
            // InternalAnsibleDsl.g:905:2: iv_ruleETaskHandlerAttributes= ruleETaskHandlerAttributes EOF
            {
             newCompositeNode(grammarAccess.getETaskHandlerAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETaskHandlerAttributes=ruleETaskHandlerAttributes();

            state._fsp--;

             current =iv_ruleETaskHandlerAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETaskHandlerAttributes"


    // $ANTLR start "ruleETaskHandlerAttributes"
    // InternalAnsibleDsl.g:911:1: ruleETaskHandlerAttributes returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleETaskHandlerAttributes() throws RecognitionException {
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
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_error_handling_2_0 = null;

        EObject lv_asynchronous_settings_7_0 = null;

        EObject lv_args_10_0 = null;

        EObject lv_module_12_0 = null;

        EObject lv_notifiables_15_0 = null;

        EObject lv_loop_17_0 = null;

        EObject lv_register_19_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:917:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:918:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:918:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:919:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:919:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:920:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:923:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:924:5: ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:924:5: ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=9;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalAnsibleDsl.g:925:3: ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:925:3: ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:926:4: {...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:926:116: ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) )
            	    // InternalAnsibleDsl.g:927:5: ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:930:8: ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) )
            	    // InternalAnsibleDsl.g:930:9: {...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:930:18: (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )
            	    // InternalAnsibleDsl.g:930:19: otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}'
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_26); 

            	    								newLeafNode(otherlv_1, grammarAccess.getETaskHandlerAttributesAccess().getError_handlingKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:934:8: ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) )
            	    // InternalAnsibleDsl.g:935:9: (lv_error_handling_2_0= ruleETaskHandlerErrorHandling )
            	    {
            	    // InternalAnsibleDsl.g:935:9: (lv_error_handling_2_0= ruleETaskHandlerErrorHandling )
            	    // InternalAnsibleDsl.g:936:10: lv_error_handling_2_0= ruleETaskHandlerErrorHandling
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerAttributesAccess().getError_handlingETaskHandlerErrorHandlingParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_error_handling_2_0=ruleETaskHandlerErrorHandling();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETaskHandlerAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"error_handling",
            	    											lv_error_handling_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.ETaskHandlerErrorHandling");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,19,FOLLOW_27); 

            	    								newLeafNode(otherlv_3, grammarAccess.getETaskHandlerAttributesAccess().getRightCurlyBracketKeyword_0_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:963:3: ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:963:3: ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:964:4: {...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:964:116: ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:965:5: ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:968:8: ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:968:9: {...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:968:18: (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:968:19: otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_4); 

            	    								newLeafNode(otherlv_4, grammarAccess.getETaskHandlerAttributesAccess().getActionKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:972:8: ( (lv_action_5_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:973:9: (lv_action_5_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:973:9: (lv_action_5_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:974:10: lv_action_5_0= RULE_STRING
            	    {
            	    lv_action_5_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    										newLeafNode(lv_action_5_0, grammarAccess.getETaskHandlerAttributesAccess().getActionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getETaskHandlerAttributesRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"action",
            	    											lv_action_5_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:996:3: ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:996:3: ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:997:4: {...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:997:116: ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) )
            	    // InternalAnsibleDsl.g:998:5: ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:1001:8: ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) )
            	    // InternalAnsibleDsl.g:1001:9: {...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1001:18: (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )
            	    // InternalAnsibleDsl.g:1001:19: otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,42,FOLLOW_28); 

            	    								newLeafNode(otherlv_6, grammarAccess.getETaskHandlerAttributesAccess().getAsynchronous_settingsKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:1005:8: ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) )
            	    // InternalAnsibleDsl.g:1006:9: (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings )
            	    {
            	    // InternalAnsibleDsl.g:1006:9: (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings )
            	    // InternalAnsibleDsl.g:1007:10: lv_asynchronous_settings_7_0= ruleEAsynchronousSettings
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerAttributesAccess().getAsynchronous_settingsEAsynchronousSettingsParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_asynchronous_settings_7_0=ruleEAsynchronousSettings();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETaskHandlerAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"asynchronous_settings",
            	    											lv_asynchronous_settings_7_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EAsynchronousSettings");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_8=(Token)match(input,19,FOLLOW_27); 

            	    								newLeafNode(otherlv_8, grammarAccess.getETaskHandlerAttributesAccess().getRightCurlyBracketKeyword_2_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:1034:3: ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1034:3: ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:1035:4: {...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:1035:116: ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) )
            	    // InternalAnsibleDsl.g:1036:5: ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:1039:8: ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) )
            	    // InternalAnsibleDsl.g:1039:9: {...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1039:18: (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) )
            	    // InternalAnsibleDsl.g:1039:19: otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) )
            	    {
            	    otherlv_9=(Token)match(input,43,FOLLOW_29); 

            	    								newLeafNode(otherlv_9, grammarAccess.getETaskHandlerAttributesAccess().getArgsKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:1043:8: ( (lv_args_10_0= ruleEDictionary ) )
            	    // InternalAnsibleDsl.g:1044:9: (lv_args_10_0= ruleEDictionary )
            	    {
            	    // InternalAnsibleDsl.g:1044:9: (lv_args_10_0= ruleEDictionary )
            	    // InternalAnsibleDsl.g:1045:10: lv_args_10_0= ruleEDictionary
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerAttributesAccess().getArgsEDictionaryParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_27);
            	    lv_args_10_0=ruleEDictionary();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETaskHandlerAttributesRule());
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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAnsibleDsl.g:1068:3: ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1068:3: ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1069:4: {...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:1069:116: ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) )
            	    // InternalAnsibleDsl.g:1070:5: ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:1073:8: ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) )
            	    // InternalAnsibleDsl.g:1073:9: {...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1073:18: (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' )
            	    // InternalAnsibleDsl.g:1073:19: otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}'
            	    {
            	    otherlv_11=(Token)match(input,44,FOLLOW_30); 

            	    								newLeafNode(otherlv_11, grammarAccess.getETaskHandlerAttributesAccess().getModule_callKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:1077:8: ( (lv_module_12_0= ruleEModuleCall ) )
            	    // InternalAnsibleDsl.g:1078:9: (lv_module_12_0= ruleEModuleCall )
            	    {
            	    // InternalAnsibleDsl.g:1078:9: (lv_module_12_0= ruleEModuleCall )
            	    // InternalAnsibleDsl.g:1079:10: lv_module_12_0= ruleEModuleCall
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerAttributesAccess().getModuleEModuleCallParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_module_12_0=ruleEModuleCall();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETaskHandlerAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"module",
            	    											lv_module_12_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EModuleCall");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_13=(Token)match(input,19,FOLLOW_27); 

            	    								newLeafNode(otherlv_13, grammarAccess.getETaskHandlerAttributesAccess().getRightCurlyBracketKeyword_4_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAnsibleDsl.g:1106:3: ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1106:3: ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) )
            	    // InternalAnsibleDsl.g:1107:4: {...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:1107:116: ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) )
            	    // InternalAnsibleDsl.g:1108:5: ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:1111:8: ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) )
            	    // InternalAnsibleDsl.g:1111:9: {...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1111:18: (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )
            	    // InternalAnsibleDsl.g:1111:19: otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+
            	    {
            	    otherlv_14=(Token)match(input,45,FOLLOW_31); 

            	    								newLeafNode(otherlv_14, grammarAccess.getETaskHandlerAttributesAccess().getNotifyKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:1115:8: ( (lv_notifiables_15_0= ruleENotifiable ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==RULE_STRING||LA10_0==115) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:1116:9: (lv_notifiables_15_0= ruleENotifiable )
            	    	    {
            	    	    // InternalAnsibleDsl.g:1116:9: (lv_notifiables_15_0= ruleENotifiable )
            	    	    // InternalAnsibleDsl.g:1117:10: lv_notifiables_15_0= ruleENotifiable
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getETaskHandlerAttributesAccess().getNotifiablesENotifiableParserRuleCall_5_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_32);
            	    	    lv_notifiables_15_0=ruleENotifiable();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getETaskHandlerAttributesRule());
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
            	    	    if ( cnt10 >= 1 ) break loop10;
            	                EarlyExitException eee =
            	                    new EarlyExitException(10, input);
            	                throw eee;
            	        }
            	        cnt10++;
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAnsibleDsl.g:1140:3: ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1140:3: ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1141:4: {...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:1141:116: ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) )
            	    // InternalAnsibleDsl.g:1142:5: ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:1145:8: ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) )
            	    // InternalAnsibleDsl.g:1145:9: {...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1145:18: (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' )
            	    // InternalAnsibleDsl.g:1145:19: otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}'
            	    {
            	    otherlv_16=(Token)match(input,46,FOLLOW_33); 

            	    								newLeafNode(otherlv_16, grammarAccess.getETaskHandlerAttributesAccess().getLoopKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:1149:8: ( (lv_loop_17_0= ruleELoop ) )
            	    // InternalAnsibleDsl.g:1150:9: (lv_loop_17_0= ruleELoop )
            	    {
            	    // InternalAnsibleDsl.g:1150:9: (lv_loop_17_0= ruleELoop )
            	    // InternalAnsibleDsl.g:1151:10: lv_loop_17_0= ruleELoop
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerAttributesAccess().getLoopELoopParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_loop_17_0=ruleELoop();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETaskHandlerAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"loop",
            	    											lv_loop_17_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.ELoop");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_18=(Token)match(input,19,FOLLOW_27); 

            	    								newLeafNode(otherlv_18, grammarAccess.getETaskHandlerAttributesAccess().getRightCurlyBracketKeyword_6_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAnsibleDsl.g:1178:3: ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1178:3: ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) )
            	    // InternalAnsibleDsl.g:1179:4: {...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:1179:116: ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) )
            	    // InternalAnsibleDsl.g:1180:5: ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:1183:8: ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) )
            	    // InternalAnsibleDsl.g:1183:9: {...}? => ( (lv_register_19_0= ruleERegisterVariable ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1183:18: ( (lv_register_19_0= ruleERegisterVariable ) )
            	    // InternalAnsibleDsl.g:1183:19: (lv_register_19_0= ruleERegisterVariable )
            	    {
            	    // InternalAnsibleDsl.g:1183:19: (lv_register_19_0= ruleERegisterVariable )
            	    // InternalAnsibleDsl.g:1184:9: lv_register_19_0= ruleERegisterVariable
            	    {

            	    									newCompositeNode(grammarAccess.getETaskHandlerAttributesAccess().getRegisterERegisterVariableParserRuleCall_7_0());
            	    								
            	    pushFollow(FOLLOW_27);
            	    lv_register_19_0=ruleERegisterVariable();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getETaskHandlerAttributesRule());
            	    									}
            	    									set(
            	    										current,
            	    										"register",
            	    										lv_register_19_0,
            	    										"org.sodalite.sdl.ansible.AnsibleDsl.ERegisterVariable");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canLeave(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleETaskHandlerAttributes"


    // $ANTLR start "entryRuleEPlay"
    // InternalAnsibleDsl.g:1217:1: entryRuleEPlay returns [EObject current=null] : iv_ruleEPlay= ruleEPlay EOF ;
    public final EObject entryRuleEPlay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlay = null;


        try {
            // InternalAnsibleDsl.g:1217:46: (iv_ruleEPlay= ruleEPlay EOF )
            // InternalAnsibleDsl.g:1218:2: iv_ruleEPlay= ruleEPlay EOF
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
    // InternalAnsibleDsl.g:1224:1: ruleEPlay returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) ) ) ;
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
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_force_handlers_20_0=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        EObject lv_base_attributes_4_0 = null;

        EObject lv_play_exe_settings_7_0 = null;

        EObject lv_error_handling_10_0 = null;

        EObject lv_facts_settings_13_0 = null;

        EObject lv_vars_files_16_0 = null;

        EObject lv_vars_prompt_18_0 = null;

        EObject lv_pre_tasks_list_22_0 = null;

        EObject lv_roles_inclusions_24_0 = null;

        EObject lv_tasks_list_26_0 = null;

        EObject lv_post_tasks_list_29_0 = null;

        EObject lv_handlers_32_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1230:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:1231:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:1231:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:1232:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:1232:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:1233:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:1236:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:1237:5: ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:1237:5: ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=12;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalAnsibleDsl.g:1238:3: ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1238:3: ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:1239:4: {...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:1239:99: ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:1240:5: ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:1243:8: ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) )
            	    // InternalAnsibleDsl.g:1243:9: {...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1243:18: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? )
            	    // InternalAnsibleDsl.g:1243:19: otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )?
            	    {
            	    otherlv_1=(Token)match(input,47,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPlayAccess().getPlay_nameKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:1247:8: ( (lv_name_2_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:1248:9: (lv_name_2_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:1248:9: (lv_name_2_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:1249:10: lv_name_2_0= RULE_STRING
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getEPlayAccess().getNameSTRINGTerminalRuleCall_0_1_0());
            	    									

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

            	    // InternalAnsibleDsl.g:1265:8: (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==48) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:1266:9: otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}'
            	            {
            	            otherlv_3=(Token)match(input,48,FOLLOW_35); 

            	            									newLeafNode(otherlv_3, grammarAccess.getEPlayAccess().getBase_attributesKeyword_0_2_0());
            	            								
            	            // InternalAnsibleDsl.g:1270:9: ( (lv_base_attributes_4_0= ruleEBaseAttributes ) )
            	            // InternalAnsibleDsl.g:1271:10: (lv_base_attributes_4_0= ruleEBaseAttributes )
            	            {
            	            // InternalAnsibleDsl.g:1271:10: (lv_base_attributes_4_0= ruleEBaseAttributes )
            	            // InternalAnsibleDsl.g:1272:11: lv_base_attributes_4_0= ruleEBaseAttributes
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getBase_attributesEBaseAttributesParserRuleCall_0_2_1_0());
            	            										
            	            pushFollow(FOLLOW_8);
            	            lv_base_attributes_4_0=ruleEBaseAttributes();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getEPlayRule());
            	            											}
            	            											set(
            	            												current,
            	            												"base_attributes",
            	            												lv_base_attributes_4_0,
            	            												"org.sodalite.sdl.ansible.AnsibleDsl.EBaseAttributes");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }

            	            otherlv_5=(Token)match(input,19,FOLLOW_36); 

            	            									newLeafNode(otherlv_5, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_0_2_2());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:1294:8: (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==49) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:1295:9: otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}'
            	            {
            	            otherlv_6=(Token)match(input,49,FOLLOW_37); 

            	            									newLeafNode(otherlv_6, grammarAccess.getEPlayAccess().getPlay_exe_settingsKeyword_0_3_0());
            	            								
            	            // InternalAnsibleDsl.g:1299:9: ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) )
            	            // InternalAnsibleDsl.g:1300:10: (lv_play_exe_settings_7_0= ruleEPlayExeSettings )
            	            {
            	            // InternalAnsibleDsl.g:1300:10: (lv_play_exe_settings_7_0= ruleEPlayExeSettings )
            	            // InternalAnsibleDsl.g:1301:11: lv_play_exe_settings_7_0= ruleEPlayExeSettings
            	            {

            	            											newCompositeNode(grammarAccess.getEPlayAccess().getPlay_exe_settingsEPlayExeSettingsParserRuleCall_0_3_1_0());
            	            										
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

            	            otherlv_8=(Token)match(input,19,FOLLOW_38); 

            	            									newLeafNode(otherlv_8, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_0_3_2());
            	            								

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
            	    // InternalAnsibleDsl.g:1329:3: ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1329:3: ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1330:4: {...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:1330:99: ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) )
            	    // InternalAnsibleDsl.g:1331:5: ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:1334:8: ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) )
            	    // InternalAnsibleDsl.g:1334:9: {...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1334:18: (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' )
            	    // InternalAnsibleDsl.g:1334:19: otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_39); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPlayAccess().getError_handlingKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:1338:8: ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) )
            	    // InternalAnsibleDsl.g:1339:9: (lv_error_handling_10_0= ruleEPlayErrorHandling )
            	    {
            	    // InternalAnsibleDsl.g:1339:9: (lv_error_handling_10_0= ruleEPlayErrorHandling )
            	    // InternalAnsibleDsl.g:1340:10: lv_error_handling_10_0= ruleEPlayErrorHandling
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

            	    otherlv_11=(Token)match(input,19,FOLLOW_38); 

            	    								newLeafNode(otherlv_11, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:1367:3: ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1367:3: ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1368:4: {...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:1368:99: ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) )
            	    // InternalAnsibleDsl.g:1369:5: ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:1372:8: ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) )
            	    // InternalAnsibleDsl.g:1372:9: {...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1372:18: (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' )
            	    // InternalAnsibleDsl.g:1372:19: otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}'
            	    {
            	    otherlv_12=(Token)match(input,50,FOLLOW_40); 

            	    								newLeafNode(otherlv_12, grammarAccess.getEPlayAccess().getFacts_settingsKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:1376:8: ( (lv_facts_settings_13_0= ruleEFactsSettings ) )
            	    // InternalAnsibleDsl.g:1377:9: (lv_facts_settings_13_0= ruleEFactsSettings )
            	    {
            	    // InternalAnsibleDsl.g:1377:9: (lv_facts_settings_13_0= ruleEFactsSettings )
            	    // InternalAnsibleDsl.g:1378:10: lv_facts_settings_13_0= ruleEFactsSettings
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getFacts_settingsEFactsSettingsParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_facts_settings_13_0=ruleEFactsSettings();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"facts_settings",
            	    											lv_facts_settings_13_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EFactsSettings");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_14=(Token)match(input,19,FOLLOW_38); 

            	    								newLeafNode(otherlv_14, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_2_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:1405:3: ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1405:3: ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:1406:4: {...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:1406:99: ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:1407:5: ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:1410:8: ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:1410:9: {...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1410:18: (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:1410:19: otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) )
            	    {
            	    otherlv_15=(Token)match(input,51,FOLLOW_19); 

            	    								newLeafNode(otherlv_15, grammarAccess.getEPlayAccess().getVars_filesKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:1414:8: ( (lv_vars_files_16_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:1415:9: (lv_vars_files_16_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:1415:9: (lv_vars_files_16_0= ruleEList )
            	    // InternalAnsibleDsl.g:1416:10: lv_vars_files_16_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_filesEListParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_38);
            	    lv_vars_files_16_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"vars_files",
            	    											lv_vars_files_16_0,
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
            	    // InternalAnsibleDsl.g:1439:3: ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1439:3: ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:1440:4: {...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:1440:99: ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:1441:5: ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:1444:8: ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:1444:9: {...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1444:18: (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:1444:19: otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) )
            	    {
            	    otherlv_17=(Token)match(input,52,FOLLOW_19); 

            	    								newLeafNode(otherlv_17, grammarAccess.getEPlayAccess().getVars_promptKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:1448:8: ( (lv_vars_prompt_18_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:1449:9: (lv_vars_prompt_18_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:1449:9: (lv_vars_prompt_18_0= ruleEList )
            	    // InternalAnsibleDsl.g:1450:10: lv_vars_prompt_18_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_promptEListParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_38);
            	    lv_vars_prompt_18_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"vars_prompt",
            	    											lv_vars_prompt_18_0,
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
            	    // InternalAnsibleDsl.g:1473:3: ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1473:3: ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:1474:4: {...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:1474:99: ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:1475:5: ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:1478:8: ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:1478:9: {...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1478:18: (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:1478:19: otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_19=(Token)match(input,53,FOLLOW_17); 

            	    								newLeafNode(otherlv_19, grammarAccess.getEPlayAccess().getForce_handlersKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:1482:8: ( (lv_force_handlers_20_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:1483:9: (lv_force_handlers_20_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:1483:9: (lv_force_handlers_20_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:1484:10: lv_force_handlers_20_0= RULE_BOOLEAN
            	    {
            	    lv_force_handlers_20_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_38); 

            	    										newLeafNode(lv_force_handlers_20_0, grammarAccess.getEPlayAccess().getForce_handlersBOOLEANTerminalRuleCall_5_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPlayRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"force_handlers",
            	    											lv_force_handlers_20_0,
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
            	    // InternalAnsibleDsl.g:1506:3: ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1506:3: ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1507:4: {...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:1507:99: ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) )
            	    // InternalAnsibleDsl.g:1508:5: ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:1511:8: ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) )
            	    // InternalAnsibleDsl.g:1511:9: {...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1511:18: (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' )
            	    // InternalAnsibleDsl.g:1511:19: otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}'
            	    {
            	    otherlv_21=(Token)match(input,54,FOLLOW_41); 

            	    								newLeafNode(otherlv_21, grammarAccess.getEPlayAccess().getPre_tasksKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:1515:8: ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==58||LA14_0==64) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:1516:9: (lv_pre_tasks_list_22_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:1516:9: (lv_pre_tasks_list_22_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:1517:10: lv_pre_tasks_list_22_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getPre_tasks_listEBlockTaskParserRuleCall_6_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_42);
            	    	    lv_pre_tasks_list_22_0=ruleEBlockTask();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"pre_tasks_list",
            	    	    											lv_pre_tasks_list_22_0,
            	    	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBlockTask");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

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

            	    otherlv_23=(Token)match(input,19,FOLLOW_38); 

            	    								newLeafNode(otherlv_23, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_6_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAnsibleDsl.g:1544:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1544:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) )
            	    // InternalAnsibleDsl.g:1545:4: {...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:1545:99: ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) )
            	    // InternalAnsibleDsl.g:1546:5: ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:1549:8: ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) )
            	    // InternalAnsibleDsl.g:1549:9: {...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1549:18: ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) )
            	    // InternalAnsibleDsl.g:1549:19: (lv_roles_inclusions_24_0= ruleERoleInclusions )
            	    {
            	    // InternalAnsibleDsl.g:1549:19: (lv_roles_inclusions_24_0= ruleERoleInclusions )
            	    // InternalAnsibleDsl.g:1550:9: lv_roles_inclusions_24_0= ruleERoleInclusions
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getRoles_inclusionsERoleInclusionsParserRuleCall_7_0());
            	    								
            	    pushFollow(FOLLOW_38);
            	    lv_roles_inclusions_24_0=ruleERoleInclusions();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    									}
            	    									set(
            	    										current,
            	    										"roles_inclusions",
            	    										lv_roles_inclusions_24_0,
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
            	    // InternalAnsibleDsl.g:1572:3: ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1572:3: ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1573:4: {...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAnsibleDsl.g:1573:99: ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) )
            	    // InternalAnsibleDsl.g:1574:5: ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAnsibleDsl.g:1577:8: ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) )
            	    // InternalAnsibleDsl.g:1577:9: {...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1577:18: (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' )
            	    // InternalAnsibleDsl.g:1577:19: otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}'
            	    {
            	    otherlv_25=(Token)match(input,55,FOLLOW_41); 

            	    								newLeafNode(otherlv_25, grammarAccess.getEPlayAccess().getTasks_listKeyword_8_0());
            	    							
            	    // InternalAnsibleDsl.g:1581:8: ( (lv_tasks_list_26_0= ruleEBlockTask ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==58||LA15_0==64) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:1582:9: (lv_tasks_list_26_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:1582:9: (lv_tasks_list_26_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:1583:10: lv_tasks_list_26_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getTasks_listEBlockTaskParserRuleCall_8_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_42);
            	    	    lv_tasks_list_26_0=ruleEBlockTask();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"tasks_list",
            	    	    											lv_tasks_list_26_0,
            	    	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBlockTask");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt15 >= 1 ) break loop15;
            	                EarlyExitException eee =
            	                    new EarlyExitException(15, input);
            	                throw eee;
            	        }
            	        cnt15++;
            	    } while (true);

            	    otherlv_27=(Token)match(input,19,FOLLOW_38); 

            	    								newLeafNode(otherlv_27, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalAnsibleDsl.g:1610:3: ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1610:3: ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1611:4: {...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalAnsibleDsl.g:1611:99: ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) )
            	    // InternalAnsibleDsl.g:1612:5: ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalAnsibleDsl.g:1615:8: ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) )
            	    // InternalAnsibleDsl.g:1615:9: {...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1615:18: (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' )
            	    // InternalAnsibleDsl.g:1615:19: otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}'
            	    {
            	    otherlv_28=(Token)match(input,56,FOLLOW_41); 

            	    								newLeafNode(otherlv_28, grammarAccess.getEPlayAccess().getPost_tasksKeyword_9_0());
            	    							
            	    // InternalAnsibleDsl.g:1619:8: ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==58||LA16_0==64) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:1620:9: (lv_post_tasks_list_29_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:1620:9: (lv_post_tasks_list_29_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:1621:10: lv_post_tasks_list_29_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getPost_tasks_listEBlockTaskParserRuleCall_9_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_42);
            	    	    lv_post_tasks_list_29_0=ruleEBlockTask();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"post_tasks_list",
            	    	    											lv_post_tasks_list_29_0,
            	    	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBlockTask");
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

            	    otherlv_30=(Token)match(input,19,FOLLOW_38); 

            	    								newLeafNode(otherlv_30, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_9_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalAnsibleDsl.g:1648:3: ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1648:3: ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1649:4: {...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalAnsibleDsl.g:1649:100: ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) )
            	    // InternalAnsibleDsl.g:1650:5: ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalAnsibleDsl.g:1653:8: ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) )
            	    // InternalAnsibleDsl.g:1653:9: {...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1653:18: (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' )
            	    // InternalAnsibleDsl.g:1653:19: otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}'
            	    {
            	    otherlv_31=(Token)match(input,57,FOLLOW_43); 

            	    								newLeafNode(otherlv_31, grammarAccess.getEPlayAccess().getHandlersKeyword_10_0());
            	    							
            	    // InternalAnsibleDsl.g:1657:8: ( (lv_handlers_32_0= ruleEHandler ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==67) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:1658:9: (lv_handlers_32_0= ruleEHandler )
            	    	    {
            	    	    // InternalAnsibleDsl.g:1658:9: (lv_handlers_32_0= ruleEHandler )
            	    	    // InternalAnsibleDsl.g:1659:10: lv_handlers_32_0= ruleEHandler
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getHandlersEHandlerParserRuleCall_10_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_44);
            	    	    lv_handlers_32_0=ruleEHandler();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"handlers",
            	    	    											lv_handlers_32_0,
            	    	    											"org.sodalite.sdl.ansible.AnsibleDsl.EHandler");
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

            	    otherlv_33=(Token)match(input,19,FOLLOW_38); 

            	    								newLeafNode(otherlv_33, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_10_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

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
    // InternalAnsibleDsl.g:1697:1: entryRuleEBlock returns [EObject current=null] : iv_ruleEBlock= ruleEBlock EOF ;
    public final EObject entryRuleEBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlock = null;


        try {
            // InternalAnsibleDsl.g:1697:47: (iv_ruleEBlock= ruleEBlock EOF )
            // InternalAnsibleDsl.g:1698:2: iv_ruleEBlock= ruleEBlock EOF
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
    // InternalAnsibleDsl.g:1704:1: ruleEBlock returns [EObject current=null] : (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' ) ;
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
        EObject lv_base_attributes_4_0 = null;

        EObject lv_execution_attributes_7_0 = null;

        EObject lv_error_handling_10_0 = null;

        EObject lv_tasks_13_0 = null;

        EObject lv_rescue_tasks_16_0 = null;

        EObject lv_always_tasks_19_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1710:2: ( (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalAnsibleDsl.g:1711:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalAnsibleDsl.g:1711:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' )
            // InternalAnsibleDsl.g:1712:3: otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getEBlockAccess().getBlockKeyword_0());
            		
            // InternalAnsibleDsl.g:1716:3: (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==59) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAnsibleDsl.g:1717:4: otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEBlockAccess().getBlock_nameKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:1721:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:1722:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:1722:5: (lv_name_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:1723:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

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

            // InternalAnsibleDsl.g:1740:3: (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==48) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAnsibleDsl.g:1741:4: otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getEBlockAccess().getBase_attributesKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:1745:4: ( (lv_base_attributes_4_0= ruleEBaseAttributes ) )
                    // InternalAnsibleDsl.g:1746:5: (lv_base_attributes_4_0= ruleEBaseAttributes )
                    {
                    // InternalAnsibleDsl.g:1746:5: (lv_base_attributes_4_0= ruleEBaseAttributes )
                    // InternalAnsibleDsl.g:1747:6: lv_base_attributes_4_0= ruleEBaseAttributes
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getBase_attributesEBaseAttributesParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_base_attributes_4_0=ruleEBaseAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"base_attributes",
                    							lv_base_attributes_4_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EBaseAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_47); 

                    				newLeafNode(otherlv_5, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1769:3: (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==60) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAnsibleDsl.g:1770:4: otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_48); 

                    				newLeafNode(otherlv_6, grammarAccess.getEBlockAccess().getExecution_attributesKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:1774:4: ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) )
                    // InternalAnsibleDsl.g:1775:5: (lv_execution_attributes_7_0= ruleEExecutionAttributes )
                    {
                    // InternalAnsibleDsl.g:1775:5: (lv_execution_attributes_7_0= ruleEExecutionAttributes )
                    // InternalAnsibleDsl.g:1776:6: lv_execution_attributes_7_0= ruleEExecutionAttributes
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getExecution_attributesEExecutionAttributesParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_execution_attributes_7_0=ruleEExecutionAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEBlockRule());
                    						}
                    						set(
                    							current,
                    							"execution_attributes",
                    							lv_execution_attributes_7_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_49); 

                    				newLeafNode(otherlv_8, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1798:3: (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAnsibleDsl.g:1799:4: otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_50); 

                    				newLeafNode(otherlv_9, grammarAccess.getEBlockAccess().getError_handlingKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:1803:4: ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) )
                    // InternalAnsibleDsl.g:1804:5: (lv_error_handling_10_0= ruleEBlockErrorHandling )
                    {
                    // InternalAnsibleDsl.g:1804:5: (lv_error_handling_10_0= ruleEBlockErrorHandling )
                    // InternalAnsibleDsl.g:1805:6: lv_error_handling_10_0= ruleEBlockErrorHandling
                    {

                    						newCompositeNode(grammarAccess.getEBlockAccess().getError_handlingEBlockErrorHandlingParserRuleCall_4_1_0());
                    					
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

                    otherlv_11=(Token)match(input,19,FOLLOW_51); 

                    				newLeafNode(otherlv_11, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,61,FOLLOW_41); 

            			newLeafNode(otherlv_12, grammarAccess.getEBlockAccess().getTasksKeyword_5());
            		
            // InternalAnsibleDsl.g:1831:3: ( (lv_tasks_13_0= ruleETask ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==64) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAnsibleDsl.g:1832:4: (lv_tasks_13_0= ruleETask )
            	    {
            	    // InternalAnsibleDsl.g:1832:4: (lv_tasks_13_0= ruleETask )
            	    // InternalAnsibleDsl.g:1833:5: lv_tasks_13_0= ruleETask
            	    {

            	    					newCompositeNode(grammarAccess.getEBlockAccess().getTasksETaskParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_42);
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
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_52); 

            			newLeafNode(otherlv_14, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalAnsibleDsl.g:1854:3: (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==62) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAnsibleDsl.g:1855:4: otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,62,FOLLOW_41); 

                    				newLeafNode(otherlv_15, grammarAccess.getEBlockAccess().getRescue_tasksKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:1859:4: ( (lv_rescue_tasks_16_0= ruleETask ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==64) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1860:5: (lv_rescue_tasks_16_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:1860:5: (lv_rescue_tasks_16_0= ruleETask )
                    	    // InternalAnsibleDsl.g:1861:6: lv_rescue_tasks_16_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getRescue_tasksETaskParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_42);
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
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    otherlv_17=(Token)match(input,19,FOLLOW_53); 

                    				newLeafNode(otherlv_17, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1883:3: (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==63) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAnsibleDsl.g:1884:4: otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}'
                    {
                    otherlv_18=(Token)match(input,63,FOLLOW_41); 

                    				newLeafNode(otherlv_18, grammarAccess.getEBlockAccess().getAlways_tasksKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:1888:4: ( (lv_always_tasks_19_0= ruleETask ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==64) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1889:5: (lv_always_tasks_19_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:1889:5: (lv_always_tasks_19_0= ruleETask )
                    	    // InternalAnsibleDsl.g:1890:6: lv_always_tasks_19_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getAlways_tasksETaskParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_42);
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
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    otherlv_20=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_20, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_9_2());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:1920:1: entryRuleETask returns [EObject current=null] : iv_ruleETask= ruleETask EOF ;
    public final EObject entryRuleETask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETask = null;


        try {
            // InternalAnsibleDsl.g:1920:46: (iv_ruleETask= ruleETask EOF )
            // InternalAnsibleDsl.g:1921:2: iv_ruleETask= ruleETask EOF
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
    // InternalAnsibleDsl.g:1927:1: ruleETask returns [EObject current=null] : ( () otherlv_1= 'task{' (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleETask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_base_attributes_5_0 = null;

        EObject lv_execution_attributes_8_0 = null;

        EObject lv_task_handler_attributes_11_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1933:2: ( ( () otherlv_1= 'task{' (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalAnsibleDsl.g:1934:2: ( () otherlv_1= 'task{' (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalAnsibleDsl.g:1934:2: ( () otherlv_1= 'task{' (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? otherlv_13= '}' )
            // InternalAnsibleDsl.g:1935:3: () otherlv_1= 'task{' (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalAnsibleDsl.g:1935:3: ()
            // InternalAnsibleDsl.g:1936:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETaskAccess().getETaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getETaskAccess().getTaskKeyword_1());
            		
            // InternalAnsibleDsl.g:1946:3: (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==65) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAnsibleDsl.g:1947:4: otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getETaskAccess().getTask_nameKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:1951:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:1952:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:1952:5: (lv_name_3_0= RULE_STRING )
                    // InternalAnsibleDsl.g:1953:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_55); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getETaskAccess().getNameSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getETaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:1970:3: (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAnsibleDsl.g:1971:4: otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getETaskAccess().getBase_attributesKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:1975:4: ( (lv_base_attributes_5_0= ruleEBaseAttributes ) )
                    // InternalAnsibleDsl.g:1976:5: (lv_base_attributes_5_0= ruleEBaseAttributes )
                    {
                    // InternalAnsibleDsl.g:1976:5: (lv_base_attributes_5_0= ruleEBaseAttributes )
                    // InternalAnsibleDsl.g:1977:6: lv_base_attributes_5_0= ruleEBaseAttributes
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getBase_attributesEBaseAttributesParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_base_attributes_5_0=ruleEBaseAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"base_attributes",
                    							lv_base_attributes_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EBaseAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_56); 

                    				newLeafNode(otherlv_6, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1999:3: (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==60) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnsibleDsl.g:2000:4: otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_48); 

                    				newLeafNode(otherlv_7, grammarAccess.getETaskAccess().getExecution_attributesKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2004:4: ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) )
                    // InternalAnsibleDsl.g:2005:5: (lv_execution_attributes_8_0= ruleEExecutionAttributes )
                    {
                    // InternalAnsibleDsl.g:2005:5: (lv_execution_attributes_8_0= ruleEExecutionAttributes )
                    // InternalAnsibleDsl.g:2006:6: lv_execution_attributes_8_0= ruleEExecutionAttributes
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getExecution_attributesEExecutionAttributesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_execution_attributes_8_0=ruleEExecutionAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"execution_attributes",
                    							lv_execution_attributes_8_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,19,FOLLOW_57); 

                    				newLeafNode(otherlv_9, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2028:3: (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==66) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnsibleDsl.g:2029:4: otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,66,FOLLOW_58); 

                    				newLeafNode(otherlv_10, grammarAccess.getETaskAccess().getTask_handler_attributesKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:2033:4: ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) )
                    // InternalAnsibleDsl.g:2034:5: (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes )
                    {
                    // InternalAnsibleDsl.g:2034:5: (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes )
                    // InternalAnsibleDsl.g:2035:6: lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes
                    {

                    						newCompositeNode(grammarAccess.getETaskAccess().getTask_handler_attributesETaskHandlerAttributesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_task_handler_attributes_11_0=ruleETaskHandlerAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getETaskRule());
                    						}
                    						set(
                    							current,
                    							"task_handler_attributes",
                    							lv_task_handler_attributes_11_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.ETaskHandlerAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:2065:1: entryRuleEHandler returns [EObject current=null] : iv_ruleEHandler= ruleEHandler EOF ;
    public final EObject entryRuleEHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHandler = null;


        try {
            // InternalAnsibleDsl.g:2065:49: (iv_ruleEHandler= ruleEHandler EOF )
            // InternalAnsibleDsl.g:2066:2: iv_ruleEHandler= ruleEHandler EOF
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
    // InternalAnsibleDsl.g:2072:1: ruleEHandler returns [EObject current=null] : ( () otherlv_1= 'handler{' (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )? otherlv_15= '}' ) ;
    public final EObject ruleEHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_base_attributes_5_0 = null;

        EObject lv_execution_attributes_8_0 = null;

        EObject lv_task_handler_attributes_11_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2078:2: ( ( () otherlv_1= 'handler{' (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )? otherlv_15= '}' ) )
            // InternalAnsibleDsl.g:2079:2: ( () otherlv_1= 'handler{' (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )? otherlv_15= '}' )
            {
            // InternalAnsibleDsl.g:2079:2: ( () otherlv_1= 'handler{' (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )? otherlv_15= '}' )
            // InternalAnsibleDsl.g:2080:3: () otherlv_1= 'handler{' (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )? otherlv_15= '}'
            {
            // InternalAnsibleDsl.g:2080:3: ()
            // InternalAnsibleDsl.g:2081:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEHandlerAccess().getEHandlerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getEHandlerAccess().getHandlerKeyword_1());
            		
            // InternalAnsibleDsl.g:2091:3: (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==68) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnsibleDsl.g:2092:4: otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEHandlerAccess().getHandler_nameKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2096:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2097:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2097:5: (lv_name_3_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2098:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_60); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getEHandlerAccess().getNameSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEHandlerRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2115:3: (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==48) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnsibleDsl.g:2116:4: otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,48,FOLLOW_35); 

                    				newLeafNode(otherlv_4, grammarAccess.getEHandlerAccess().getBase_attributesKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2120:4: ( (lv_base_attributes_5_0= ruleEBaseAttributes ) )
                    // InternalAnsibleDsl.g:2121:5: (lv_base_attributes_5_0= ruleEBaseAttributes )
                    {
                    // InternalAnsibleDsl.g:2121:5: (lv_base_attributes_5_0= ruleEBaseAttributes )
                    // InternalAnsibleDsl.g:2122:6: lv_base_attributes_5_0= ruleEBaseAttributes
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getBase_attributesEBaseAttributesParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_base_attributes_5_0=ruleEBaseAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"base_attributes",
                    							lv_base_attributes_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EBaseAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_61); 

                    				newLeafNode(otherlv_6, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2144:3: (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==60) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAnsibleDsl.g:2145:4: otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,60,FOLLOW_48); 

                    				newLeafNode(otherlv_7, grammarAccess.getEHandlerAccess().getExecution_attributesKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2149:4: ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) )
                    // InternalAnsibleDsl.g:2150:5: (lv_execution_attributes_8_0= ruleEExecutionAttributes )
                    {
                    // InternalAnsibleDsl.g:2150:5: (lv_execution_attributes_8_0= ruleEExecutionAttributes )
                    // InternalAnsibleDsl.g:2151:6: lv_execution_attributes_8_0= ruleEExecutionAttributes
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getExecution_attributesEExecutionAttributesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_execution_attributes_8_0=ruleEExecutionAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"execution_attributes",
                    							lv_execution_attributes_8_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,19,FOLLOW_62); 

                    				newLeafNode(otherlv_9, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2173:3: (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==66) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAnsibleDsl.g:2174:4: otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,66,FOLLOW_58); 

                    				newLeafNode(otherlv_10, grammarAccess.getEHandlerAccess().getTask_handler_attributesKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:2178:4: ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) )
                    // InternalAnsibleDsl.g:2179:5: (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes )
                    {
                    // InternalAnsibleDsl.g:2179:5: (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes )
                    // InternalAnsibleDsl.g:2180:6: lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes
                    {

                    						newCompositeNode(grammarAccess.getEHandlerAccess().getTask_handler_attributesETaskHandlerAttributesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_task_handler_attributes_11_0=ruleETaskHandlerAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEHandlerRule());
                    						}
                    						set(
                    							current,
                    							"task_handler_attributes",
                    							lv_task_handler_attributes_11_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.ETaskHandlerAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_63); 

                    				newLeafNode(otherlv_12, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2202:3: (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==69) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAnsibleDsl.g:2203:4: otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+
                    {
                    otherlv_13=(Token)match(input,69,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getEHandlerAccess().getListenKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:2207:4: ( (otherlv_14= RULE_STRING ) )+
                    int cnt36=0;
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_STRING) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2208:5: (otherlv_14= RULE_STRING )
                    	    {
                    	    // InternalAnsibleDsl.g:2208:5: (otherlv_14= RULE_STRING )
                    	    // InternalAnsibleDsl.g:2209:6: otherlv_14= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEHandlerRule());
                    	    						}
                    	    					
                    	    otherlv_14=(Token)match(input,RULE_STRING,FOLLOW_64); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getEHandlerAccess().getListen_toENotifiedTopicCrossReference_6_1_0());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt36 >= 1 ) break loop36;
                                EarlyExitException eee =
                                    new EarlyExitException(36, input);
                                throw eee;
                        }
                        cnt36++;
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:2229:1: entryRuleEModuleCall returns [EObject current=null] : iv_ruleEModuleCall= ruleEModuleCall EOF ;
    public final EObject entryRuleEModuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModuleCall = null;


        try {
            // InternalAnsibleDsl.g:2229:52: (iv_ruleEModuleCall= ruleEModuleCall EOF )
            // InternalAnsibleDsl.g:2230:2: iv_ruleEModuleCall= ruleEModuleCall EOF
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
    // InternalAnsibleDsl.g:2236:1: ruleEModuleCall returns [EObject current=null] : (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) ;
    public final EObject ruleEModuleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2242:2: ( (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:2243:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:2243:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:2244:3: otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'parameters{' ( (lv_parameters_3_0= ruleEParameter ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEModuleCallAccess().getModule_nameKeyword_0());
            		
            // InternalAnsibleDsl.g:2248:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:2249:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:2249:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:2250:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_65); 

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

            otherlv_2=(Token)match(input,71,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getEModuleCallAccess().getParametersKeyword_2());
            		
            // InternalAnsibleDsl.g:2270:3: ( (lv_parameters_3_0= ruleEParameter ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2271:4: (lv_parameters_3_0= ruleEParameter )
            	    {
            	    // InternalAnsibleDsl.g:2271:4: (lv_parameters_3_0= ruleEParameter )
            	    // InternalAnsibleDsl.g:2272:5: lv_parameters_3_0= ruleEParameter
            	    {

            	    					newCompositeNode(grammarAccess.getEModuleCallAccess().getParametersEParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    break loop38;
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
    // InternalAnsibleDsl.g:2297:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalAnsibleDsl.g:2297:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalAnsibleDsl.g:2298:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalAnsibleDsl.g:2304:1: ruleEParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2310:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) )
            // InternalAnsibleDsl.g:2311:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            {
            // InternalAnsibleDsl.g:2311:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            // InternalAnsibleDsl.g:2312:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) )
            {
            // InternalAnsibleDsl.g:2312:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:2313:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:2313:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:2314:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_66); 

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

            otherlv_1=(Token)match(input,72,FOLLOW_67); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:2334:3: ( (lv_value_passed_2_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:2335:4: (lv_value_passed_2_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:2335:4: (lv_value_passed_2_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:2336:5: lv_value_passed_2_0= ruleEValuePassed
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
    // InternalAnsibleDsl.g:2357:1: entryRuleERoleInclusion returns [EObject current=null] : iv_ruleERoleInclusion= ruleERoleInclusion EOF ;
    public final EObject entryRuleERoleInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusion = null;


        try {
            // InternalAnsibleDsl.g:2357:55: (iv_ruleERoleInclusion= ruleERoleInclusion EOF )
            // InternalAnsibleDsl.g:2358:2: iv_ruleERoleInclusion= ruleERoleInclusion EOF
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
    // InternalAnsibleDsl.g:2364:1: ruleERoleInclusion returns [EObject current=null] : (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? otherlv_9= '}' ) ;
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
        EObject lv_base_attributes_4_0 = null;

        EObject lv_execution_attributes_7_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2370:2: ( (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalAnsibleDsl.g:2371:2: (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalAnsibleDsl.g:2371:2: (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? otherlv_9= '}' )
            // InternalAnsibleDsl.g:2372:3: otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_68); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionAccess().getRoleKeyword_0());
            		
            otherlv_1=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getERoleInclusionAccess().getRole_nameKeyword_1());
            		
            // InternalAnsibleDsl.g:2380:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2381:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2381:4: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:2382:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_69); 

            					newLeafNode(lv_name_2_0, grammarAccess.getERoleInclusionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

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

            // InternalAnsibleDsl.g:2398:3: (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAnsibleDsl.g:2399:4: otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,48,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getERoleInclusionAccess().getBase_attributesKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2403:4: ( (lv_base_attributes_4_0= ruleEBaseAttributes ) )
                    // InternalAnsibleDsl.g:2404:5: (lv_base_attributes_4_0= ruleEBaseAttributes )
                    {
                    // InternalAnsibleDsl.g:2404:5: (lv_base_attributes_4_0= ruleEBaseAttributes )
                    // InternalAnsibleDsl.g:2405:6: lv_base_attributes_4_0= ruleEBaseAttributes
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getBase_attributesEBaseAttributesParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_base_attributes_4_0=ruleEBaseAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    						}
                    						set(
                    							current,
                    							"base_attributes",
                    							lv_base_attributes_4_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EBaseAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,19,FOLLOW_70); 

                    				newLeafNode(otherlv_5, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2427:3: (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==60) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAnsibleDsl.g:2428:4: otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,60,FOLLOW_48); 

                    				newLeafNode(otherlv_6, grammarAccess.getERoleInclusionAccess().getExecution_attributesKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2432:4: ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) )
                    // InternalAnsibleDsl.g:2433:5: (lv_execution_attributes_7_0= ruleEExecutionAttributes )
                    {
                    // InternalAnsibleDsl.g:2433:5: (lv_execution_attributes_7_0= ruleEExecutionAttributes )
                    // InternalAnsibleDsl.g:2434:6: lv_execution_attributes_7_0= ruleEExecutionAttributes
                    {

                    						newCompositeNode(grammarAccess.getERoleInclusionAccess().getExecution_attributesEExecutionAttributesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_execution_attributes_7_0=ruleEExecutionAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERoleInclusionRule());
                    						}
                    						set(
                    							current,
                    							"execution_attributes",
                    							lv_execution_attributes_7_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EExecutionAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:2464:1: entryRuleERoleInclusions returns [EObject current=null] : iv_ruleERoleInclusions= ruleERoleInclusions EOF ;
    public final EObject entryRuleERoleInclusions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusions = null;


        try {
            // InternalAnsibleDsl.g:2464:56: (iv_ruleERoleInclusions= ruleERoleInclusions EOF )
            // InternalAnsibleDsl.g:2465:2: iv_ruleERoleInclusions= ruleERoleInclusions EOF
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
    // InternalAnsibleDsl.g:2471:1: ruleERoleInclusions returns [EObject current=null] : (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) )+ otherlv_2= '}' ) ;
    public final EObject ruleERoleInclusions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_roles_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2477:2: ( (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) )+ otherlv_2= '}' ) )
            // InternalAnsibleDsl.g:2478:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) )+ otherlv_2= '}' )
            {
            // InternalAnsibleDsl.g:2478:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) )+ otherlv_2= '}' )
            // InternalAnsibleDsl.g:2479:3: otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_71); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionsAccess().getRoles_inclusionsKeyword_0());
            		
            // InternalAnsibleDsl.g:2483:3: ( (lv_roles_1_0= ruleERoleInclusion ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==73) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2484:4: (lv_roles_1_0= ruleERoleInclusion )
            	    {
            	    // InternalAnsibleDsl.g:2484:4: (lv_roles_1_0= ruleERoleInclusion )
            	    // InternalAnsibleDsl.g:2485:5: lv_roles_1_0= ruleERoleInclusion
            	    {

            	    					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_72);
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
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getERoleInclusionsAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:2510:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalAnsibleDsl.g:2510:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalAnsibleDsl.g:2511:2: iv_ruleELoop= ruleELoop EOF
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
    // InternalAnsibleDsl.g:2517:1: ruleELoop returns [EObject current=null] : (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        EObject this_ELoopOverList_0 = null;

        EObject this_EUntil_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2523:2: ( (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) )
            // InternalAnsibleDsl.g:2524:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            {
            // InternalAnsibleDsl.g:2524:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==76) ) {
                alt42=1;
            }
            else if ( (LA42_0==83||LA42_0==85) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalAnsibleDsl.g:2525:3: this_ELoopOverList_0= ruleELoopOverList
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
                    // InternalAnsibleDsl.g:2534:3: this_EUntil_1= ruleEUntil
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
    // InternalAnsibleDsl.g:2546:1: entryRuleELoopOverList returns [EObject current=null] : iv_ruleELoopOverList= ruleELoopOverList EOF ;
    public final EObject entryRuleELoopOverList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopOverList = null;


        try {
            // InternalAnsibleDsl.g:2546:54: (iv_ruleELoopOverList= ruleELoopOverList EOF )
            // InternalAnsibleDsl.g:2547:2: iv_ruleELoopOverList= ruleELoopOverList EOF
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
    // InternalAnsibleDsl.g:2553:1: ruleELoopOverList returns [EObject current=null] : (otherlv_0= 'loop_over:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleELoopOverList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_loop_list_1_0 = null;

        EObject lv_loop_control_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2559:2: ( (otherlv_0= 'loop_over:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )? ) )
            // InternalAnsibleDsl.g:2560:2: (otherlv_0= 'loop_over:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )? )
            {
            // InternalAnsibleDsl.g:2560:2: (otherlv_0= 'loop_over:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )? )
            // InternalAnsibleDsl.g:2561:3: otherlv_0= 'loop_over:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,76,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getELoopOverListAccess().getLoop_overKeyword_0());
            		
            // InternalAnsibleDsl.g:2565:3: ( (lv_loop_list_1_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:2566:4: (lv_loop_list_1_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:2566:4: (lv_loop_list_1_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:2567:5: lv_loop_list_1_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getELoopOverListAccess().getLoop_listEValuePassedParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_73);
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

            // InternalAnsibleDsl.g:2584:3: (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==77) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAnsibleDsl.g:2585:4: otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,77,FOLLOW_74); 

                    				newLeafNode(otherlv_2, grammarAccess.getELoopOverListAccess().getLoop_controlKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2589:4: ( (lv_loop_control_3_0= ruleELoopControl ) )
                    // InternalAnsibleDsl.g:2590:5: (lv_loop_control_3_0= ruleELoopControl )
                    {
                    // InternalAnsibleDsl.g:2590:5: (lv_loop_control_3_0= ruleELoopControl )
                    // InternalAnsibleDsl.g:2591:6: lv_loop_control_3_0= ruleELoopControl
                    {

                    						newCompositeNode(grammarAccess.getELoopOverListAccess().getLoop_controlELoopControlParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_loop_control_3_0=ruleELoopControl();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getELoopOverListRule());
                    						}
                    						set(
                    							current,
                    							"loop_control",
                    							lv_loop_control_3_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.ELoopControl");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getELoopOverListAccess().getRightCurlyBracketKeyword_2_2());
                    			

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
    // InternalAnsibleDsl.g:2617:1: entryRuleELoopControl returns [EObject current=null] : iv_ruleELoopControl= ruleELoopControl EOF ;
    public final EObject entryRuleELoopControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopControl = null;


        try {
            // InternalAnsibleDsl.g:2617:53: (iv_ruleELoopControl= ruleELoopControl EOF )
            // InternalAnsibleDsl.g:2618:2: iv_ruleELoopControl= ruleELoopControl EOF
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
    // InternalAnsibleDsl.g:2624:1: ruleELoopControl returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleELoopControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_pause_4_0=null;
        Token otherlv_5=null;
        Token lv_index_var_6_0=null;
        Token otherlv_7=null;
        Token lv_loop_var_8_0=null;
        Token otherlv_9=null;
        Token lv_extended_10_0=null;
        EObject lv_label_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2630:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:2631:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:2631:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:2632:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:2632:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:2633:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getELoopControlAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:2636:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:2637:5: ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:2637:5: ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop44:
            do {
                int alt44=6;
                int LA44_0 = input.LA(1);

                if ( LA44_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 0) ) {
                    alt44=1;
                }
                else if ( LA44_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 1) ) {
                    alt44=2;
                }
                else if ( LA44_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 2) ) {
                    alt44=3;
                }
                else if ( LA44_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 3) ) {
                    alt44=4;
                }
                else if ( LA44_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 4) ) {
                    alt44=5;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2638:3: ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2638:3: ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2639:4: {...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:2639:106: ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:2640:5: ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:2643:8: ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) )
            	    // InternalAnsibleDsl.g:2643:9: {...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "true");
            	    }
            	    // InternalAnsibleDsl.g:2643:18: (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) )
            	    // InternalAnsibleDsl.g:2643:19: otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) )
            	    {
            	    otherlv_1=(Token)match(input,78,FOLLOW_67); 

            	    								newLeafNode(otherlv_1, grammarAccess.getELoopControlAccess().getLabelKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:2647:8: ( (lv_label_2_0= ruleEValuePassed ) )
            	    // InternalAnsibleDsl.g:2648:9: (lv_label_2_0= ruleEValuePassed )
            	    {
            	    // InternalAnsibleDsl.g:2648:9: (lv_label_2_0= ruleEValuePassed )
            	    // InternalAnsibleDsl.g:2649:10: lv_label_2_0= ruleEValuePassed
            	    {

            	    										newCompositeNode(grammarAccess.getELoopControlAccess().getLabelEValuePassedParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_75);
            	    lv_label_2_0=ruleEValuePassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getELoopControlRule());
            	    										}
            	    										set(
            	    											current,
            	    											"label",
            	    											lv_label_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassed");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getELoopControlAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:2672:3: ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2672:3: ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2673:4: {...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:2673:106: ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:2674:5: ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:2677:8: ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:2677:9: {...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "true");
            	    }
            	    // InternalAnsibleDsl.g:2677:18: (otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:2677:19: otherlv_3= 'pause:' ( (lv_pause_4_0= RULE_NUMBER ) )
            	    {
            	    otherlv_3=(Token)match(input,79,FOLLOW_76); 

            	    								newLeafNode(otherlv_3, grammarAccess.getELoopControlAccess().getPauseKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:2681:8: ( (lv_pause_4_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:2682:9: (lv_pause_4_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:2682:9: (lv_pause_4_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:2683:10: lv_pause_4_0= RULE_NUMBER
            	    {
            	    lv_pause_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_75); 

            	    										newLeafNode(lv_pause_4_0, grammarAccess.getELoopControlAccess().getPauseNUMBERTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getELoopControlRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"pause",
            	    											lv_pause_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getELoopControlAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:2705:3: ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2705:3: ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2706:4: {...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:2706:106: ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) ) )
            	    // InternalAnsibleDsl.g:2707:5: ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:2710:8: ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) ) )
            	    // InternalAnsibleDsl.g:2710:9: {...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "true");
            	    }
            	    // InternalAnsibleDsl.g:2710:18: (otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) ) )
            	    // InternalAnsibleDsl.g:2710:19: otherlv_5= 'index_var:' ( (lv_index_var_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,80,FOLLOW_20); 

            	    								newLeafNode(otherlv_5, grammarAccess.getELoopControlAccess().getIndex_varKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:2714:8: ( (lv_index_var_6_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:2715:9: (lv_index_var_6_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:2715:9: (lv_index_var_6_0= RULE_ID )
            	    // InternalAnsibleDsl.g:2716:10: lv_index_var_6_0= RULE_ID
            	    {
            	    lv_index_var_6_0=(Token)match(input,RULE_ID,FOLLOW_75); 

            	    										newLeafNode(lv_index_var_6_0, grammarAccess.getELoopControlAccess().getIndex_varIDTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getELoopControlRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"index_var",
            	    											lv_index_var_6_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getELoopControlAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:2738:3: ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2738:3: ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2739:4: {...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:2739:106: ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) ) )
            	    // InternalAnsibleDsl.g:2740:5: ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:2743:8: ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) ) )
            	    // InternalAnsibleDsl.g:2743:9: {...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "true");
            	    }
            	    // InternalAnsibleDsl.g:2743:18: (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) ) )
            	    // InternalAnsibleDsl.g:2743:19: otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,81,FOLLOW_20); 

            	    								newLeafNode(otherlv_7, grammarAccess.getELoopControlAccess().getLoop_varKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:2747:8: ( (lv_loop_var_8_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:2748:9: (lv_loop_var_8_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:2748:9: (lv_loop_var_8_0= RULE_ID )
            	    // InternalAnsibleDsl.g:2749:10: lv_loop_var_8_0= RULE_ID
            	    {
            	    lv_loop_var_8_0=(Token)match(input,RULE_ID,FOLLOW_75); 

            	    										newLeafNode(lv_loop_var_8_0, grammarAccess.getELoopControlAccess().getLoop_varIDTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getELoopControlRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"loop_var",
            	    											lv_loop_var_8_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getELoopControlAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAnsibleDsl.g:2771:3: ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2771:3: ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2772:4: {...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:2772:106: ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:2773:5: ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:2776:8: ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:2776:9: {...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "true");
            	    }
            	    // InternalAnsibleDsl.g:2776:18: (otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:2776:19: otherlv_9= 'extended:' ( (lv_extended_10_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_9=(Token)match(input,82,FOLLOW_17); 

            	    								newLeafNode(otherlv_9, grammarAccess.getELoopControlAccess().getExtendedKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:2780:8: ( (lv_extended_10_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:2781:9: (lv_extended_10_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:2781:9: (lv_extended_10_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:2782:10: lv_extended_10_0= RULE_BOOLEAN
            	    {
            	    lv_extended_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_75); 

            	    										newLeafNode(lv_extended_10_0, grammarAccess.getELoopControlAccess().getExtendedBOOLEANTerminalRuleCall_4_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getELoopControlRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"extended",
            	    											lv_extended_10_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getELoopControlAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getELoopControlAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:2814:1: entryRuleEUntil returns [EObject current=null] : iv_ruleEUntil= ruleEUntil EOF ;
    public final EObject entryRuleEUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUntil = null;


        try {
            // InternalAnsibleDsl.g:2814:47: (iv_ruleEUntil= ruleEUntil EOF )
            // InternalAnsibleDsl.g:2815:2: iv_ruleEUntil= ruleEUntil EOF
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
    // InternalAnsibleDsl.g:2821:1: ruleEUntil returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalAnsibleDsl.g:2827:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:2828:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:2828:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:2829:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:2829:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:2830:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEUntilAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:2833:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:2834:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:2834:5: ( ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=3;
                int LA46_0 = input.LA(1);

                if ( LA46_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
                    alt46=2;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2835:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2835:3: ({...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) ) )
            	    // InternalAnsibleDsl.g:2836:4: {...}? => ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:2836:100: ( ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) ) )
            	    // InternalAnsibleDsl.g:2837:5: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:2840:8: ({...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? ) )
            	    // InternalAnsibleDsl.g:2840:9: {...}? => (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:2840:18: (otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )? )
            	    // InternalAnsibleDsl.g:2840:19: otherlv_1= 'until:' ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )?
            	    {
            	    otherlv_1=(Token)match(input,83,FOLLOW_25); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEUntilAccess().getUntilKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:2844:8: ( (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    // InternalAnsibleDsl.g:2845:9: (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    {
            	    // InternalAnsibleDsl.g:2845:9: (lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    // InternalAnsibleDsl.g:2846:10: lv_until_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            	    {

            	    										newCompositeNode(grammarAccess.getEUntilAccess().getUntilEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_77);
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

            	    // InternalAnsibleDsl.g:2863:8: (otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) ) )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==84) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:2864:9: otherlv_3= 'retries:' ( (lv_retries_4_0= RULE_NUMBER ) )
            	            {
            	            otherlv_3=(Token)match(input,84,FOLLOW_76); 

            	            									newLeafNode(otherlv_3, grammarAccess.getEUntilAccess().getRetriesKeyword_0_2_0());
            	            								
            	            // InternalAnsibleDsl.g:2868:9: ( (lv_retries_4_0= RULE_NUMBER ) )
            	            // InternalAnsibleDsl.g:2869:10: (lv_retries_4_0= RULE_NUMBER )
            	            {
            	            // InternalAnsibleDsl.g:2869:10: (lv_retries_4_0= RULE_NUMBER )
            	            // InternalAnsibleDsl.g:2870:11: lv_retries_4_0= RULE_NUMBER
            	            {
            	            lv_retries_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_78); 

            	            											newLeafNode(lv_retries_4_0, grammarAccess.getEUntilAccess().getRetriesNUMBERTerminalRuleCall_0_2_1_0());
            	            										

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
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEUntilAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:2893:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2893:3: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2894:4: {...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:2894:100: ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:2895:5: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:2898:8: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:2898:9: {...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:2898:18: (otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:2898:19: otherlv_5= 'delay:' ( (lv_delay_6_0= RULE_NUMBER ) )
            	    {
            	    otherlv_5=(Token)match(input,85,FOLLOW_76); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEUntilAccess().getDelayKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:2902:8: ( (lv_delay_6_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:2903:9: (lv_delay_6_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:2903:9: (lv_delay_6_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:2904:10: lv_delay_6_0= RULE_NUMBER
            	    {
            	    lv_delay_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_78); 

            	    										newLeafNode(lv_delay_6_0, grammarAccess.getEUntilAccess().getDelayNUMBERTerminalRuleCall_1_1_0());
            	    									

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
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
    // InternalAnsibleDsl.g:2937:1: entryRuleEPrivilageEscalation returns [EObject current=null] : iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF ;
    public final EObject entryRuleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrivilageEscalation = null;


        try {
            // InternalAnsibleDsl.g:2937:61: (iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF )
            // InternalAnsibleDsl.g:2938:2: iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF
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
    // InternalAnsibleDsl.g:2944:1: ruleEPrivilageEscalation returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_become_2_0=null;
        Token otherlv_3=null;
        Token lv_become_exe_4_0=null;
        Token otherlv_5=null;
        Token lv_become_flags_6_0=null;
        Token otherlv_7=null;
        Token lv_become_method_8_0=null;
        Token otherlv_9=null;
        Token lv_become_user_10_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:2950:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:2951:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:2951:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:2952:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:2952:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:2953:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:2956:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:2957:5: ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:2957:5: ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) ) )*
            loop47:
            do {
                int alt47=6;
                int LA47_0 = input.LA(1);

                if ( LA47_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 1) ) {
                    alt47=2;
                }
                else if ( LA47_0 == 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 2) ) {
                    alt47=3;
                }
                else if ( LA47_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 3) ) {
                    alt47=4;
                }
                else if ( LA47_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 4) ) {
                    alt47=5;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2958:3: ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2958:3: ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2959:4: {...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:2959:114: ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:2960:5: ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:2963:8: ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:2963:9: {...}? => (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "true");
            	    }
            	    // InternalAnsibleDsl.g:2963:18: (otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:2963:19: otherlv_1= 'become:' ( (lv_become_2_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_1=(Token)match(input,86,FOLLOW_17); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPrivilageEscalationAccess().getBecomeKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:2967:8: ( (lv_become_2_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:2968:9: (lv_become_2_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:2968:9: (lv_become_2_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:2969:10: lv_become_2_0= RULE_BOOLEAN
            	    {
            	    lv_become_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_79); 

            	    										newLeafNode(lv_become_2_0, grammarAccess.getEPrivilageEscalationAccess().getBecomeBOOLEANTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPrivilageEscalationRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"become",
            	    											lv_become_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:2991:3: ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2991:3: ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2992:4: {...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:2992:114: ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:2993:5: ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:2996:8: ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:2996:9: {...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "true");
            	    }
            	    // InternalAnsibleDsl.g:2996:18: (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:2996:19: otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,87,FOLLOW_4); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPrivilageEscalationAccess().getBecome_exeKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3000:8: ( (lv_become_exe_4_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:3001:9: (lv_become_exe_4_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:3001:9: (lv_become_exe_4_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:3002:10: lv_become_exe_4_0= RULE_STRING
            	    {
            	    lv_become_exe_4_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

            	    										newLeafNode(lv_become_exe_4_0, grammarAccess.getEPrivilageEscalationAccess().getBecome_exeSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPrivilageEscalationRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"become_exe",
            	    											lv_become_exe_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:3024:3: ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3024:3: ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3025:4: {...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3025:114: ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:3026:5: ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3029:8: ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:3029:9: {...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "true");
            	    }
            	    // InternalAnsibleDsl.g:3029:18: (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:3029:19: otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,88,FOLLOW_4); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3033:8: ( (lv_become_flags_6_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:3034:9: (lv_become_flags_6_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:3034:9: (lv_become_flags_6_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:3035:10: lv_become_flags_6_0= RULE_STRING
            	    {
            	    lv_become_flags_6_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

            	    										newLeafNode(lv_become_flags_6_0, grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsSTRINGTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPrivilageEscalationRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"become_flags",
            	    											lv_become_flags_6_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:3057:3: ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3057:3: ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3058:4: {...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:3058:114: ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:3059:5: ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:3062:8: ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:3062:9: {...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "true");
            	    }
            	    // InternalAnsibleDsl.g:3062:18: (otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:3062:19: otherlv_7= 'become_method:' ( (lv_become_method_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,89,FOLLOW_4); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPrivilageEscalationAccess().getBecome_methodKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:3066:8: ( (lv_become_method_8_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:3067:9: (lv_become_method_8_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:3067:9: (lv_become_method_8_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:3068:10: lv_become_method_8_0= RULE_STRING
            	    {
            	    lv_become_method_8_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

            	    										newLeafNode(lv_become_method_8_0, grammarAccess.getEPrivilageEscalationAccess().getBecome_methodSTRINGTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPrivilageEscalationRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"become_method",
            	    											lv_become_method_8_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAnsibleDsl.g:3090:3: ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3090:3: ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3091:4: {...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:3091:114: ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:3092:5: ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:3095:8: ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:3095:9: {...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "true");
            	    }
            	    // InternalAnsibleDsl.g:3095:18: (otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:3095:19: otherlv_9= 'become_user:' ( (lv_become_user_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,90,FOLLOW_4); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPrivilageEscalationAccess().getBecome_userKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:3099:8: ( (lv_become_user_10_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:3100:9: (lv_become_user_10_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:3100:9: (lv_become_user_10_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:3101:10: lv_become_user_10_0= RULE_STRING
            	    {
            	    lv_become_user_10_0=(Token)match(input,RULE_STRING,FOLLOW_79); 

            	    										newLeafNode(lv_become_user_10_0, grammarAccess.getEPrivilageEscalationAccess().getBecome_userSTRINGTerminalRuleCall_4_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPrivilageEscalationRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"become_user",
            	    											lv_become_user_10_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:3133:1: entryRuleEValidationMode returns [EObject current=null] : iv_ruleEValidationMode= ruleEValidationMode EOF ;
    public final EObject entryRuleEValidationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidationMode = null;


        try {
            // InternalAnsibleDsl.g:3133:56: (iv_ruleEValidationMode= ruleEValidationMode EOF )
            // InternalAnsibleDsl.g:3134:2: iv_ruleEValidationMode= ruleEValidationMode EOF
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
    // InternalAnsibleDsl.g:3140:1: ruleEValidationMode returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEValidationMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_check_mode_2_0=null;
        Token otherlv_3=null;
        Token lv_diff_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:3146:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3147:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3147:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3148:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3148:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3149:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEValidationModeAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3152:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3153:5: ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3153:5: ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop48:
            do {
                int alt48=3;
                int LA48_0 = input.LA(1);

                if ( LA48_0 == 91 && getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 0) ) {
                    alt48=1;
                }
                else if ( LA48_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 1) ) {
                    alt48=2;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3154:3: ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3154:3: ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3155:4: {...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEValidationMode", "getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3155:109: ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:3156:5: ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3159:8: ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:3159:9: {...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEValidationMode", "true");
            	    }
            	    // InternalAnsibleDsl.g:3159:18: (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:3159:19: otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_1=(Token)match(input,91,FOLLOW_17); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEValidationModeAccess().getCheck_modeKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3163:8: ( (lv_check_mode_2_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:3164:9: (lv_check_mode_2_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:3164:9: (lv_check_mode_2_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:3165:10: lv_check_mode_2_0= RULE_BOOLEAN
            	    {
            	    lv_check_mode_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_80); 

            	    										newLeafNode(lv_check_mode_2_0, grammarAccess.getEValidationModeAccess().getCheck_modeBOOLEANTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEValidationModeRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"check_mode",
            	    											lv_check_mode_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEValidationModeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:3187:3: ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3187:3: ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3188:4: {...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEValidationMode", "getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3188:109: ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:3189:5: ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3192:8: ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:3192:9: {...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEValidationMode", "true");
            	    }
            	    // InternalAnsibleDsl.g:3192:18: (otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:3192:19: otherlv_3= 'diff:' ( (lv_diff_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,92,FOLLOW_17); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEValidationModeAccess().getDiffKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3196:8: ( (lv_diff_4_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:3197:9: (lv_diff_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:3197:9: (lv_diff_4_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:3198:10: lv_diff_4_0= RULE_BOOLEAN
            	    {
            	    lv_diff_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_80); 

            	    										newLeafNode(lv_diff_4_0, grammarAccess.getEValidationModeAccess().getDiffBOOLEANTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEValidationModeRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"diff",
            	    											lv_diff_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEValidationModeAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEValidationModeAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:3230:1: entryRuleEConnection returns [EObject current=null] : iv_ruleEConnection= ruleEConnection EOF ;
    public final EObject entryRuleEConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConnection = null;


        try {
            // InternalAnsibleDsl.g:3230:52: (iv_ruleEConnection= ruleEConnection EOF )
            // InternalAnsibleDsl.g:3231:2: iv_ruleEConnection= ruleEConnection EOF
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
    // InternalAnsibleDsl.g:3237:1: ruleEConnection returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_connection_2_0=null;
        Token otherlv_3=null;
        Token lv_port_4_0=null;
        Token otherlv_5=null;
        Token lv_remote_user_6_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:3243:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3244:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3244:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3245:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3245:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3246:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEConnectionAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3249:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3250:5: ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3250:5: ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) ) )*
            loop49:
            do {
                int alt49=4;
                int LA49_0 = input.LA(1);

                if ( LA49_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 2) ) {
                    alt49=3;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3251:3: ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3251:3: ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3252:4: {...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3252:105: ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:3253:5: ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3256:8: ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:3256:9: {...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "true");
            	    }
            	    // InternalAnsibleDsl.g:3256:18: (otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:3256:19: otherlv_1= 'connection:' ( (lv_connection_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,93,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEConnectionAccess().getConnectionKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3260:8: ( (lv_connection_2_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:3261:9: (lv_connection_2_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:3261:9: (lv_connection_2_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:3262:10: lv_connection_2_0= RULE_STRING
            	    {
            	    lv_connection_2_0=(Token)match(input,RULE_STRING,FOLLOW_81); 

            	    										newLeafNode(lv_connection_2_0, grammarAccess.getEConnectionAccess().getConnectionSTRINGTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEConnectionRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"connection",
            	    											lv_connection_2_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEConnectionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:3284:3: ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3284:3: ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3285:4: {...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3285:105: ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:3286:5: ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3289:8: ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:3289:9: {...}? => (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "true");
            	    }
            	    // InternalAnsibleDsl.g:3289:18: (otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:3289:19: otherlv_3= 'port:' ( (lv_port_4_0= RULE_NUMBER ) )
            	    {
            	    otherlv_3=(Token)match(input,94,FOLLOW_76); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEConnectionAccess().getPortKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3293:8: ( (lv_port_4_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:3294:9: (lv_port_4_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:3294:9: (lv_port_4_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:3295:10: lv_port_4_0= RULE_NUMBER
            	    {
            	    lv_port_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_81); 

            	    										newLeafNode(lv_port_4_0, grammarAccess.getEConnectionAccess().getPortNUMBERTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEConnectionRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"port",
            	    											lv_port_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEConnectionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:3317:3: ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3317:3: ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3318:4: {...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3318:105: ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:3319:5: ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3322:8: ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:3322:9: {...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "true");
            	    }
            	    // InternalAnsibleDsl.g:3322:18: (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:3322:19: otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,95,FOLLOW_4); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEConnectionAccess().getRemote_userKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3326:8: ( (lv_remote_user_6_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:3327:9: (lv_remote_user_6_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:3327:9: (lv_remote_user_6_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:3328:10: lv_remote_user_6_0= RULE_STRING
            	    {
            	    lv_remote_user_6_0=(Token)match(input,RULE_STRING,FOLLOW_81); 

            	    										newLeafNode(lv_remote_user_6_0, grammarAccess.getEConnectionAccess().getRemote_userSTRINGTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEConnectionRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"remote_user",
            	    											lv_remote_user_6_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEConnectionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEConnectionAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:3360:1: entryRuleEPlayExeSettings returns [EObject current=null] : iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF ;
    public final EObject entryRuleEPlayExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayExeSettings = null;


        try {
            // InternalAnsibleDsl.g:3360:57: (iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF )
            // InternalAnsibleDsl.g:3361:2: iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF
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
    // InternalAnsibleDsl.g:3367:1: ruleEPlayExeSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
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
            // InternalAnsibleDsl.g:3373:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3374:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3374:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3375:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3375:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3376:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3379:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3380:5: ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3380:5: ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop50:
            do {
                int alt50=6;
                int LA50_0 = input.LA(1);

                if ( LA50_0 == 96 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt50=1;
                }
                else if ( LA50_0 == 97 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt50=2;
                }
                else if ( LA50_0 == 98 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 2) ) {
                    alt50=3;
                }
                else if ( LA50_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 3) ) {
                    alt50=4;
                }
                else if ( LA50_0 == 100 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 4) ) {
                    alt50=5;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3381:3: ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3381:3: ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3382:4: {...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3382:110: ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:3383:5: ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3386:8: ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:3386:9: {...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3386:18: (otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:3386:19: otherlv_1= 'strategy:' ( (lv_strategy_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,96,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPlayExeSettingsAccess().getStrategyKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3390:8: ( (lv_strategy_2_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:3391:9: (lv_strategy_2_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:3391:9: (lv_strategy_2_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:3392:10: lv_strategy_2_0= RULE_STRING
            	    {
            	    lv_strategy_2_0=(Token)match(input,RULE_STRING,FOLLOW_82); 

            	    										newLeafNode(lv_strategy_2_0, grammarAccess.getEPlayExeSettingsAccess().getStrategySTRINGTerminalRuleCall_0_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:3414:3: ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3414:3: ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3415:4: {...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3415:110: ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:3416:5: ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3419:8: ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:3419:9: {...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3419:18: (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:3419:19: otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEList ) )
            	    {
            	    otherlv_3=(Token)match(input,97,FOLLOW_19); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPlayExeSettingsAccess().getSerialKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3423:8: ( (lv_serial_list_4_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:3424:9: (lv_serial_list_4_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:3424:9: (lv_serial_list_4_0= ruleEList )
            	    // InternalAnsibleDsl.g:3425:10: lv_serial_list_4_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getSerial_listEListParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_82);
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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:3448:3: ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3448:3: ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3449:4: {...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3449:110: ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:3450:5: ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3453:8: ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:3453:9: {...}? => (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3453:18: (otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:3453:19: otherlv_5= 'order:' ( (lv_order_6_0= RULE_STRING ) )
            	    {
            	    otherlv_5=(Token)match(input,98,FOLLOW_4); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPlayExeSettingsAccess().getOrderKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3457:8: ( (lv_order_6_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:3458:9: (lv_order_6_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:3458:9: (lv_order_6_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:3459:10: lv_order_6_0= RULE_STRING
            	    {
            	    lv_order_6_0=(Token)match(input,RULE_STRING,FOLLOW_82); 

            	    										newLeafNode(lv_order_6_0, grammarAccess.getEPlayExeSettingsAccess().getOrderSTRINGTerminalRuleCall_2_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:3481:3: ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3481:3: ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3482:4: {...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:3482:110: ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:3483:5: ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:3486:8: ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:3486:9: {...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3486:18: (otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:3486:19: otherlv_7= 'throttle:' ( (lv_throttle_8_0= RULE_NUMBER ) )
            	    {
            	    otherlv_7=(Token)match(input,99,FOLLOW_76); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPlayExeSettingsAccess().getThrottleKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:3490:8: ( (lv_throttle_8_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:3491:9: (lv_throttle_8_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:3491:9: (lv_throttle_8_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:3492:10: lv_throttle_8_0= RULE_NUMBER
            	    {
            	    lv_throttle_8_0=(Token)match(input,RULE_NUMBER,FOLLOW_82); 

            	    										newLeafNode(lv_throttle_8_0, grammarAccess.getEPlayExeSettingsAccess().getThrottleNUMBERTerminalRuleCall_3_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAnsibleDsl.g:3514:3: ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3514:3: ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3515:4: {...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:3515:110: ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:3516:5: ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:3519:8: ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:3519:9: {...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3519:18: (otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:3519:19: otherlv_9= 'run_once:' ( (lv_run_once_10_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_9=(Token)match(input,100,FOLLOW_17); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPlayExeSettingsAccess().getRun_onceKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:3523:8: ( (lv_run_once_10_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:3524:9: (lv_run_once_10_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:3524:9: (lv_run_once_10_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:3525:10: lv_run_once_10_0= RULE_BOOLEAN
            	    {
            	    lv_run_once_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_82); 

            	    										newLeafNode(lv_run_once_10_0, grammarAccess.getEPlayExeSettingsAccess().getRun_onceBOOLEANTerminalRuleCall_4_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:3557:1: entryRuleEExecutionExeSettings returns [EObject current=null] : iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF ;
    public final EObject entryRuleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionExeSettings = null;


        try {
            // InternalAnsibleDsl.g:3557:62: (iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF )
            // InternalAnsibleDsl.g:3558:2: iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF
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
    // InternalAnsibleDsl.g:3564:1: ruleEExecutionExeSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_throttle_2_0=null;
        Token otherlv_3=null;
        Token lv_run_once_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:3570:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3571:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3571:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3572:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3572:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3573:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3576:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3577:5: ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3577:5: ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop51:
            do {
                int alt51=3;
                int LA51_0 = input.LA(1);

                if ( LA51_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt51=1;
                }
                else if ( LA51_0 == 100 && getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt51=2;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3578:3: ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3578:3: ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3579:4: {...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3579:115: ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:3580:5: ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3583:8: ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:3583:9: {...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3583:18: (otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:3583:19: otherlv_1= 'throttle:' ( (lv_throttle_2_0= RULE_NUMBER ) )
            	    {
            	    otherlv_1=(Token)match(input,99,FOLLOW_76); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEExecutionExeSettingsAccess().getThrottleKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3587:8: ( (lv_throttle_2_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:3588:9: (lv_throttle_2_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:3588:9: (lv_throttle_2_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:3589:10: lv_throttle_2_0= RULE_NUMBER
            	    {
            	    lv_throttle_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_83); 

            	    										newLeafNode(lv_throttle_2_0, grammarAccess.getEExecutionExeSettingsAccess().getThrottleNUMBERTerminalRuleCall_0_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:3611:3: ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3611:3: ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3612:4: {...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3612:115: ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:3613:5: ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3616:8: ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:3616:9: {...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3616:18: (otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:3616:19: otherlv_3= 'run_once:' ( (lv_run_once_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,100,FOLLOW_17); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEExecutionExeSettingsAccess().getRun_onceKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3620:8: ( (lv_run_once_4_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:3621:9: (lv_run_once_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:3621:9: (lv_run_once_4_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:3622:10: lv_run_once_4_0= RULE_BOOLEAN
            	    {
            	    lv_run_once_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_83); 

            	    										newLeafNode(lv_run_once_4_0, grammarAccess.getEExecutionExeSettingsAccess().getRun_onceBOOLEANTerminalRuleCall_1_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:3654:1: entryRuleEBlockErrorHandling returns [EObject current=null] : iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF ;
    public final EObject entryRuleEBlockErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:3654:60: (iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF )
            // InternalAnsibleDsl.g:3655:2: iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF
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
    // InternalAnsibleDsl.g:3661:1: ruleEBlockErrorHandling returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
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
            // InternalAnsibleDsl.g:3667:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3668:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3668:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3669:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3669:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3670:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3673:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3674:5: ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3674:5: ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop52:
            do {
                int alt52=4;
                int LA52_0 = input.LA(1);

                if ( LA52_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 0) ) {
                    alt52=1;
                }
                else if ( LA52_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 1) ) {
                    alt52=2;
                }
                else if ( LA52_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 2) ) {
                    alt52=3;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3675:3: ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3675:3: ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3676:4: {...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3676:113: ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:3677:5: ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3680:8: ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:3680:9: {...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3680:18: (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:3680:19: otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_1=(Token)match(input,101,FOLLOW_17); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3684:8: ( (lv_any_errors_fatal_2_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:3685:9: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:3685:9: (lv_any_errors_fatal_2_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:3686:10: lv_any_errors_fatal_2_0= RULE_BOOLEAN
            	    {
            	    lv_any_errors_fatal_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_84); 

            	    										newLeafNode(lv_any_errors_fatal_2_0, grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalBOOLEANTerminalRuleCall_0_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:3708:3: ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3708:3: ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3709:4: {...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3709:113: ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:3710:5: ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3713:8: ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:3713:9: {...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3713:18: (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:3713:19: otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,102,FOLLOW_17); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3717:8: ( (lv_ignore_errors_4_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:3718:9: (lv_ignore_errors_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:3718:9: (lv_ignore_errors_4_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:3719:10: lv_ignore_errors_4_0= RULE_BOOLEAN
            	    {
            	    lv_ignore_errors_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_84); 

            	    										newLeafNode(lv_ignore_errors_4_0, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsBOOLEANTerminalRuleCall_1_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:3741:3: ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3741:3: ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3742:4: {...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3742:113: ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:3743:5: ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3746:8: ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:3746:9: {...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3746:18: (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:3746:19: otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,103,FOLLOW_17); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3750:8: ( (lv_ignore_unreachable_6_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:3751:9: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:3751:9: (lv_ignore_unreachable_6_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:3752:10: lv_ignore_unreachable_6_0= RULE_BOOLEAN
            	    {
            	    lv_ignore_unreachable_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_84); 

            	    										newLeafNode(lv_ignore_unreachable_6_0, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableBOOLEANTerminalRuleCall_2_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:3784:1: entryRuleEPlayErrorHandling returns [EObject current=null] : iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF ;
    public final EObject entryRuleEPlayErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:3784:59: (iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF )
            // InternalAnsibleDsl.g:3785:2: iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF
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
    // InternalAnsibleDsl.g:3791:1: ruleEPlayErrorHandling returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
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
            // InternalAnsibleDsl.g:3797:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3798:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3798:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3799:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3799:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3800:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3803:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3804:5: ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3804:5: ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop53:
            do {
                int alt53=5;
                int LA53_0 = input.LA(1);

                if ( LA53_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 1) ) {
                    alt53=2;
                }
                else if ( LA53_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 2) ) {
                    alt53=3;
                }
                else if ( LA53_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 3) ) {
                    alt53=4;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3805:3: ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3805:3: ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3806:4: {...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3806:112: ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:3807:5: ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3810:8: ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:3810:9: {...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3810:18: (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:3810:19: otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) )
            	    {
            	    otherlv_1=(Token)match(input,104,FOLLOW_76); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3814:8: ( (lv_max_fail_percentage_2_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:3815:9: (lv_max_fail_percentage_2_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:3815:9: (lv_max_fail_percentage_2_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:3816:10: lv_max_fail_percentage_2_0= RULE_NUMBER
            	    {
            	    lv_max_fail_percentage_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_85); 

            	    										newLeafNode(lv_max_fail_percentage_2_0, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageNUMBERTerminalRuleCall_0_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:3838:3: ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3838:3: ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3839:4: {...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3839:112: ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:3840:5: ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3843:8: ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:3843:9: {...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3843:18: (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:3843:19: otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,101,FOLLOW_17); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3847:8: ( (lv_any_errors_fatal_4_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:3848:9: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:3848:9: (lv_any_errors_fatal_4_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:3849:10: lv_any_errors_fatal_4_0= RULE_BOOLEAN
            	    {
            	    lv_any_errors_fatal_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_85); 

            	    										newLeafNode(lv_any_errors_fatal_4_0, grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalBOOLEANTerminalRuleCall_1_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:3871:3: ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3871:3: ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3872:4: {...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3872:112: ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:3873:5: ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3876:8: ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:3876:9: {...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3876:18: (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:3876:19: otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,102,FOLLOW_17); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3880:8: ( (lv_ignore_errors_6_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:3881:9: (lv_ignore_errors_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:3881:9: (lv_ignore_errors_6_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:3882:10: lv_ignore_errors_6_0= RULE_BOOLEAN
            	    {
            	    lv_ignore_errors_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_85); 

            	    										newLeafNode(lv_ignore_errors_6_0, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsBOOLEANTerminalRuleCall_2_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:3904:3: ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3904:3: ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3905:4: {...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:3905:112: ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:3906:5: ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:3909:8: ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:3909:9: {...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3909:18: (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:3909:19: otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_7=(Token)match(input,103,FOLLOW_17); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:3913:8: ( (lv_ignore_unreachable_8_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:3914:9: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:3914:9: (lv_ignore_unreachable_8_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:3915:10: lv_ignore_unreachable_8_0= RULE_BOOLEAN
            	    {
            	    lv_ignore_unreachable_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_85); 

            	    										newLeafNode(lv_ignore_unreachable_8_0, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableBOOLEANTerminalRuleCall_3_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:3947:1: entryRuleETaskHandlerErrorHandling returns [EObject current=null] : iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF ;
    public final EObject entryRuleETaskHandlerErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:3947:66: (iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF )
            // InternalAnsibleDsl.g:3948:2: iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF
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
    // InternalAnsibleDsl.g:3954:1: ruleETaskHandlerErrorHandling returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
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
            // InternalAnsibleDsl.g:3960:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3961:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3961:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3962:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3962:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3963:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3966:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3967:5: ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3967:5: ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop54:
            do {
                int alt54=6;
                int LA54_0 = input.LA(1);

                if ( LA54_0 == 105 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 0) ) {
                    alt54=1;
                }
                else if ( LA54_0 == 106 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 1) ) {
                    alt54=2;
                }
                else if ( LA54_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 2) ) {
                    alt54=3;
                }
                else if ( LA54_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 3) ) {
                    alt54=4;
                }
                else if ( LA54_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 4) ) {
                    alt54=5;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3968:3: ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3968:3: ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3969:4: {...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3969:119: ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    // InternalAnsibleDsl.g:3970:5: ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3973:8: ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    // InternalAnsibleDsl.g:3973:9: {...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3973:18: (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    // InternalAnsibleDsl.g:3973:19: otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    {
            	    otherlv_1=(Token)match(input,105,FOLLOW_25); 

            	    								newLeafNode(otherlv_1, grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3977:8: ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    // InternalAnsibleDsl.g:3978:9: (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    {
            	    // InternalAnsibleDsl.g:3978:9: (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    // InternalAnsibleDsl.g:3979:10: lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_86);
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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:4002:3: ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4002:3: ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4003:4: {...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4003:119: ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    // InternalAnsibleDsl.g:4004:5: ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4007:8: ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    // InternalAnsibleDsl.g:4007:9: {...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:4007:18: (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    // InternalAnsibleDsl.g:4007:19: otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    {
            	    otherlv_3=(Token)match(input,106,FOLLOW_25); 

            	    								newLeafNode(otherlv_3, grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4011:8: ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    // InternalAnsibleDsl.g:4012:9: (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    {
            	    // InternalAnsibleDsl.g:4012:9: (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    // InternalAnsibleDsl.g:4013:10: lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_86);
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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:4036:3: ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4036:3: ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4037:4: {...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:4037:119: ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:4038:5: ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:4041:8: ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:4041:9: {...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:4041:18: (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:4041:19: otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,101,FOLLOW_17); 

            	    								newLeafNode(otherlv_5, grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:4045:8: ( (lv_any_errors_fatal_6_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:4046:9: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:4046:9: (lv_any_errors_fatal_6_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:4047:10: lv_any_errors_fatal_6_0= RULE_BOOLEAN
            	    {
            	    lv_any_errors_fatal_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_86); 

            	    										newLeafNode(lv_any_errors_fatal_6_0, grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalBOOLEANTerminalRuleCall_2_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:4069:3: ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4069:3: ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4070:4: {...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:4070:119: ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:4071:5: ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:4074:8: ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:4074:9: {...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:4074:18: (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:4074:19: otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_7=(Token)match(input,102,FOLLOW_17); 

            	    								newLeafNode(otherlv_7, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:4078:8: ( (lv_ignore_errors_8_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:4079:9: (lv_ignore_errors_8_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:4079:9: (lv_ignore_errors_8_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:4080:10: lv_ignore_errors_8_0= RULE_BOOLEAN
            	    {
            	    lv_ignore_errors_8_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_86); 

            	    										newLeafNode(lv_ignore_errors_8_0, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsBOOLEANTerminalRuleCall_3_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAnsibleDsl.g:4102:3: ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4102:3: ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4103:4: {...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:4103:119: ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:4104:5: ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:4107:8: ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:4107:9: {...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:4107:18: (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:4107:19: otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_9=(Token)match(input,103,FOLLOW_17); 

            	    								newLeafNode(otherlv_9, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:4111:8: ( (lv_ignore_unreachable_10_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:4112:9: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:4112:9: (lv_ignore_unreachable_10_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:4113:10: lv_ignore_unreachable_10_0= RULE_BOOLEAN
            	    {
            	    lv_ignore_unreachable_10_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_86); 

            	    										newLeafNode(lv_ignore_unreachable_10_0, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableBOOLEANTerminalRuleCall_4_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:4145:1: entryRuleEFactsSettings returns [EObject current=null] : iv_ruleEFactsSettings= ruleEFactsSettings EOF ;
    public final EObject entryRuleEFactsSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactsSettings = null;


        try {
            // InternalAnsibleDsl.g:4145:55: (iv_ruleEFactsSettings= ruleEFactsSettings EOF )
            // InternalAnsibleDsl.g:4146:2: iv_ruleEFactsSettings= ruleEFactsSettings EOF
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
    // InternalAnsibleDsl.g:4152:1: ruleEFactsSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEFactsSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_gather_facts_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_gather_timeout_6_0=null;
        Token otherlv_7=null;
        Token lv_fact_path_8_0=null;
        EObject lv_gather_subset_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4158:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:4159:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:4159:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:4160:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:4160:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:4161:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4164:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:4165:5: ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:4165:5: ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) ) )*
            loop55:
            do {
                int alt55=5;
                int LA55_0 = input.LA(1);

                if ( LA55_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt55=1;
                }
                else if ( LA55_0 == 108 && getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt55=2;
                }
                else if ( LA55_0 == 109 && getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 2) ) {
                    alt55=3;
                }
                else if ( LA55_0 == 110 && getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 3) ) {
                    alt55=4;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4166:3: ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4166:3: ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4167:4: {...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4167:108: ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:4168:5: ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4171:8: ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:4171:9: {...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4171:18: (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:4171:19: otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_1=(Token)match(input,107,FOLLOW_17); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEFactsSettingsAccess().getGather_factsKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4175:8: ( (lv_gather_facts_2_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:4176:9: (lv_gather_facts_2_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:4176:9: (lv_gather_facts_2_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:4177:10: lv_gather_facts_2_0= RULE_BOOLEAN
            	    {
            	    lv_gather_facts_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_87); 

            	    										newLeafNode(lv_gather_facts_2_0, grammarAccess.getEFactsSettingsAccess().getGather_factsBOOLEANTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEFactsSettingsRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"gather_facts",
            	    											lv_gather_facts_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:4199:3: ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4199:3: ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4200:4: {...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4200:108: ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) ) )
            	    // InternalAnsibleDsl.g:4201:5: ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4204:8: ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) ) )
            	    // InternalAnsibleDsl.g:4204:9: {...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4204:18: (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) ) )
            	    // InternalAnsibleDsl.g:4204:19: otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEList ) )
            	    {
            	    otherlv_3=(Token)match(input,108,FOLLOW_19); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEFactsSettingsAccess().getGather_subsetKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4208:8: ( (lv_gather_subset_4_0= ruleEList ) )
            	    // InternalAnsibleDsl.g:4209:9: (lv_gather_subset_4_0= ruleEList )
            	    {
            	    // InternalAnsibleDsl.g:4209:9: (lv_gather_subset_4_0= ruleEList )
            	    // InternalAnsibleDsl.g:4210:10: lv_gather_subset_4_0= ruleEList
            	    {

            	    										newCompositeNode(grammarAccess.getEFactsSettingsAccess().getGather_subsetEListParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_87);
            	    lv_gather_subset_4_0=ruleEList();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEFactsSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"gather_subset",
            	    											lv_gather_subset_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EList");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:4233:3: ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4233:3: ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4234:4: {...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:4234:108: ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:4235:5: ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:4238:8: ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:4238:9: {...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4238:18: (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:4238:19: otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= RULE_NUMBER ) )
            	    {
            	    otherlv_5=(Token)match(input,109,FOLLOW_76); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEFactsSettingsAccess().getGather_timeoutKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:4242:8: ( (lv_gather_timeout_6_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:4243:9: (lv_gather_timeout_6_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:4243:9: (lv_gather_timeout_6_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:4244:10: lv_gather_timeout_6_0= RULE_NUMBER
            	    {
            	    lv_gather_timeout_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_87); 

            	    										newLeafNode(lv_gather_timeout_6_0, grammarAccess.getEFactsSettingsAccess().getGather_timeoutNUMBERTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEFactsSettingsRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"gather_timeout",
            	    											lv_gather_timeout_6_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:4266:3: ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4266:3: ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4267:4: {...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:4267:108: ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:4268:5: ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:4271:8: ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:4271:9: {...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4271:18: (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:4271:19: otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,110,FOLLOW_4); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEFactsSettingsAccess().getFact_pathKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:4275:8: ( (lv_fact_path_8_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:4276:9: (lv_fact_path_8_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:4276:9: (lv_fact_path_8_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:4277:10: lv_fact_path_8_0= RULE_STRING
            	    {
            	    lv_fact_path_8_0=(Token)match(input,RULE_STRING,FOLLOW_87); 

            	    										newLeafNode(lv_fact_path_8_0, grammarAccess.getEFactsSettingsAccess().getFact_pathSTRINGTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEFactsSettingsRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"fact_path",
            	    											lv_fact_path_8_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:4309:1: entryRuleEDelegation returns [EObject current=null] : iv_ruleEDelegation= ruleEDelegation EOF ;
    public final EObject entryRuleEDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDelegation = null;


        try {
            // InternalAnsibleDsl.g:4309:52: (iv_ruleEDelegation= ruleEDelegation EOF )
            // InternalAnsibleDsl.g:4310:2: iv_ruleEDelegation= ruleEDelegation EOF
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
    // InternalAnsibleDsl.g:4316:1: ruleEDelegation returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEDelegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_delegate_to_2_0=null;
        Token otherlv_3=null;
        Token lv_delegate_facts_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4322:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:4323:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:4323:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:4324:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:4324:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:4325:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEDelegationAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4328:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:4329:5: ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:4329:5: ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) ) )*
            loop56:
            do {
                int alt56=3;
                int LA56_0 = input.LA(1);

                if ( LA56_0 == 111 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 0) ) {
                    alt56=1;
                }
                else if ( LA56_0 == 112 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 1) ) {
                    alt56=2;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4330:3: ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4330:3: ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4331:4: {...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEDelegation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4331:105: ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) ) )
            	    // InternalAnsibleDsl.g:4332:5: ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4335:8: ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) ) )
            	    // InternalAnsibleDsl.g:4335:9: {...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDelegation", "true");
            	    }
            	    // InternalAnsibleDsl.g:4335:18: (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) ) )
            	    // InternalAnsibleDsl.g:4335:19: otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,111,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEDelegationAccess().getDelegate_toKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4339:8: ( (lv_delegate_to_2_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:4340:9: (lv_delegate_to_2_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:4340:9: (lv_delegate_to_2_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:4341:10: lv_delegate_to_2_0= RULE_STRING
            	    {
            	    lv_delegate_to_2_0=(Token)match(input,RULE_STRING,FOLLOW_88); 

            	    										newLeafNode(lv_delegate_to_2_0, grammarAccess.getEDelegationAccess().getDelegate_toSTRINGTerminalRuleCall_0_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDelegationAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:4363:3: ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4363:3: ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4364:4: {...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEDelegation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4364:105: ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalAnsibleDsl.g:4365:5: ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4368:8: ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) ) )
            	    // InternalAnsibleDsl.g:4368:9: {...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDelegation", "true");
            	    }
            	    // InternalAnsibleDsl.g:4368:18: (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) ) )
            	    // InternalAnsibleDsl.g:4368:19: otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_3=(Token)match(input,112,FOLLOW_17); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEDelegationAccess().getDelegate_factsKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4372:8: ( (lv_delegate_facts_4_0= RULE_BOOLEAN ) )
            	    // InternalAnsibleDsl.g:4373:9: (lv_delegate_facts_4_0= RULE_BOOLEAN )
            	    {
            	    // InternalAnsibleDsl.g:4373:9: (lv_delegate_facts_4_0= RULE_BOOLEAN )
            	    // InternalAnsibleDsl.g:4374:10: lv_delegate_facts_4_0= RULE_BOOLEAN
            	    {
            	    lv_delegate_facts_4_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_88); 

            	    										newLeafNode(lv_delegate_facts_4_0, grammarAccess.getEDelegationAccess().getDelegate_factsBOOLEANTerminalRuleCall_1_1_0());
            	    									

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


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDelegationAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEDelegationAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:4406:1: entryRuleEAsynchronousSettings returns [EObject current=null] : iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF ;
    public final EObject entryRuleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAsynchronousSettings = null;


        try {
            // InternalAnsibleDsl.g:4406:62: (iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF )
            // InternalAnsibleDsl.g:4407:2: iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF
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
    // InternalAnsibleDsl.g:4413:1: ruleEAsynchronousSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_async_2_0=null;
        Token otherlv_3=null;
        Token lv_poll_4_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4419:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:4420:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:4420:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:4421:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:4421:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:4422:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4425:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:4426:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:4426:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) ) )*
            loop57:
            do {
                int alt57=3;
                int LA57_0 = input.LA(1);

                if ( LA57_0 == 113 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt57=1;
                }
                else if ( LA57_0 == 114 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt57=2;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4427:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4427:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4428:4: {...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4428:115: ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:4429:5: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4432:8: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:4432:9: {...}? => (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4432:18: (otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:4432:19: otherlv_1= 'async:' ( (lv_async_2_0= RULE_NUMBER ) )
            	    {
            	    otherlv_1=(Token)match(input,113,FOLLOW_76); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAsynchronousSettingsAccess().getAsyncKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4436:8: ( (lv_async_2_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:4437:9: (lv_async_2_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:4437:9: (lv_async_2_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:4438:10: lv_async_2_0= RULE_NUMBER
            	    {
            	    lv_async_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_89); 

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
            	    // InternalAnsibleDsl.g:4460:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4460:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4461:4: {...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4461:115: ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) ) )
            	    // InternalAnsibleDsl.g:4462:5: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4465:8: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) ) )
            	    // InternalAnsibleDsl.g:4465:9: {...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4465:18: (otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) ) )
            	    // InternalAnsibleDsl.g:4465:19: otherlv_3= 'poll:' ( (lv_poll_4_0= RULE_NUMBER ) )
            	    {
            	    otherlv_3=(Token)match(input,114,FOLLOW_76); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAsynchronousSettingsAccess().getPollKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4469:8: ( (lv_poll_4_0= RULE_NUMBER ) )
            	    // InternalAnsibleDsl.g:4470:9: (lv_poll_4_0= RULE_NUMBER )
            	    {
            	    // InternalAnsibleDsl.g:4470:9: (lv_poll_4_0= RULE_NUMBER )
            	    // InternalAnsibleDsl.g:4471:10: lv_poll_4_0= RULE_NUMBER
            	    {
            	    lv_poll_4_0=(Token)match(input,RULE_NUMBER,FOLLOW_89); 

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
            	    break loop57;
                }
            } while (true);


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
    // InternalAnsibleDsl.g:4503:1: entryRuleENotifiable returns [EObject current=null] : iv_ruleENotifiable= ruleENotifiable EOF ;
    public final EObject entryRuleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiable = null;


        try {
            // InternalAnsibleDsl.g:4503:52: (iv_ruleENotifiable= ruleENotifiable EOF )
            // InternalAnsibleDsl.g:4504:2: iv_ruleENotifiable= ruleENotifiable EOF
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
    // InternalAnsibleDsl.g:4510:1: ruleENotifiable returns [EObject current=null] : (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) ;
    public final EObject ruleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject this_ENotifiedHandler_0 = null;

        EObject this_ENotifiedTopic_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4516:2: ( (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) )
            // InternalAnsibleDsl.g:4517:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            {
            // InternalAnsibleDsl.g:4517:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            else if ( (LA58_0==115) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalAnsibleDsl.g:4518:3: this_ENotifiedHandler_0= ruleENotifiedHandler
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
                    // InternalAnsibleDsl.g:4527:3: this_ENotifiedTopic_1= ruleENotifiedTopic
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
    // InternalAnsibleDsl.g:4539:1: entryRuleENotifiedHandler returns [EObject current=null] : iv_ruleENotifiedHandler= ruleENotifiedHandler EOF ;
    public final EObject entryRuleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedHandler = null;


        try {
            // InternalAnsibleDsl.g:4539:57: (iv_ruleENotifiedHandler= ruleENotifiedHandler EOF )
            // InternalAnsibleDsl.g:4540:2: iv_ruleENotifiedHandler= ruleENotifiedHandler EOF
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
    // InternalAnsibleDsl.g:4546:1: ruleENotifiedHandler returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4552:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4553:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalAnsibleDsl.g:4553:2: ( (otherlv_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4554:3: (otherlv_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4554:3: (otherlv_0= RULE_STRING )
            // InternalAnsibleDsl.g:4555:4: otherlv_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4569:1: entryRuleENotifiedTopic returns [EObject current=null] : iv_ruleENotifiedTopic= ruleENotifiedTopic EOF ;
    public final EObject entryRuleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedTopic = null;


        try {
            // InternalAnsibleDsl.g:4569:55: (iv_ruleENotifiedTopic= ruleENotifiedTopic EOF )
            // InternalAnsibleDsl.g:4570:2: iv_ruleENotifiedTopic= ruleENotifiedTopic EOF
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
    // InternalAnsibleDsl.g:4576:1: ruleENotifiedTopic returns [EObject current=null] : (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4582:2: ( (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:4583:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:4583:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4584:3: otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,115,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getENotifiedTopicAccess().getTopicKeyword_0());
            		
            // InternalAnsibleDsl.g:4588:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4589:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4589:4: (lv_name_1_0= RULE_STRING )
            // InternalAnsibleDsl.g:4590:5: lv_name_1_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4610:1: entryRuleEJinjaExpressionOrString returns [EObject current=null] : iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF ;
    public final EObject entryRuleEJinjaExpressionOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionOrString = null;


        try {
            // InternalAnsibleDsl.g:4610:65: (iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF )
            // InternalAnsibleDsl.g:4611:2: iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF
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
    // InternalAnsibleDsl.g:4617:1: ruleEJinjaExpressionOrString returns [EObject current=null] : (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEJinjaExpressionOrString() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject this_EJinjaExpressionEvaluation_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4623:2: ( (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:4624:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:4624:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==118) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_STRING) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalAnsibleDsl.g:4625:3: this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation
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
                    // InternalAnsibleDsl.g:4634:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:4634:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4635:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4635:4: (lv_string_1_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4636:5: lv_string_1_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4656:1: entryRuleEJinjaExpressionAndString returns [EObject current=null] : iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF ;
    public final EObject entryRuleEJinjaExpressionAndString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionAndString = null;


        try {
            // InternalAnsibleDsl.g:4656:66: (iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF )
            // InternalAnsibleDsl.g:4657:2: iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF
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
    // InternalAnsibleDsl.g:4663:1: ruleEJinjaExpressionAndString returns [EObject current=null] : ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+ ;
    public final EObject ruleEJinjaExpressionAndString() throws RecognitionException {
        EObject current = null;

        EObject lv_jinja_expression_and_string_0_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4669:2: ( ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+ )
            // InternalAnsibleDsl.g:4670:2: ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+
            {
            // InternalAnsibleDsl.g:4670:2: ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_STRING||LA60_0==118) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4671:3: (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString )
            	    {
            	    // InternalAnsibleDsl.g:4671:3: (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString )
            	    // InternalAnsibleDsl.g:4672:4: lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString
            	    {

            	    				newCompositeNode(grammarAccess.getEJinjaExpressionAndStringAccess().getJinja_expression_and_stringEJinjaExpressionOrStringParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_90);
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
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
    // InternalAnsibleDsl.g:4692:1: entryRuleEValuePassed returns [EObject current=null] : iv_ruleEValuePassed= ruleEValuePassed EOF ;
    public final EObject entryRuleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassed = null;


        try {
            // InternalAnsibleDsl.g:4692:53: (iv_ruleEValuePassed= ruleEValuePassed EOF )
            // InternalAnsibleDsl.g:4693:2: iv_ruleEValuePassed= ruleEValuePassed EOF
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
    // InternalAnsibleDsl.g:4699:1: ruleEValuePassed returns [EObject current=null] : (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString ) ;
    public final EObject ruleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject this_EJinjaExpressionAndString_0 = null;

        EObject this_EValueWithoutString_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4705:2: ( (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString ) )
            // InternalAnsibleDsl.g:4706:2: (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString )
            {
            // InternalAnsibleDsl.g:4706:2: (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_STRING||LA61_0==118) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_BOOLEAN||(LA61_0>=RULE_NUMBER && LA61_0<=RULE_NULL)||LA61_0==145||LA61_0==151) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalAnsibleDsl.g:4707:3: this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString
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
                    // InternalAnsibleDsl.g:4716:3: this_EValueWithoutString_1= ruleEValueWithoutString
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
    // InternalAnsibleDsl.g:4728:1: entryRuleEValuePassedToJinjaExpression returns [EObject current=null] : iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF ;
    public final EObject entryRuleEValuePassedToJinjaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassedToJinjaExpression = null;


        try {
            // InternalAnsibleDsl.g:4728:70: (iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF )
            // InternalAnsibleDsl.g:4729:2: iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF
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
    // InternalAnsibleDsl.g:4735:1: ruleEValuePassedToJinjaExpression returns [EObject current=null] : (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall ) ;
    public final EObject ruleEValuePassedToJinjaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EValue_0 = null;

        EObject this_EFactGathered_1 = null;

        EObject this_EItem_2 = null;

        EObject this_EVariableReference_3 = null;

        EObject this_EFunctionCall_4 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4741:2: ( (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall ) )
            // InternalAnsibleDsl.g:4742:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall )
            {
            // InternalAnsibleDsl.g:4742:2: (this_EValue_0= ruleEValue | this_EFactGathered_1= ruleEFactGathered | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall )
            int alt62=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_BOOLEAN:
            case RULE_NUMBER:
            case RULE_NULL:
            case 145:
            case 151:
                {
                alt62=1;
                }
                break;
            case 150:
                {
                alt62=2;
                }
                break;
            case 116:
                {
                alt62=3;
                }
                break;
            case RULE_ID:
                {
                int LA62_4 = input.LA(2);

                if ( (LA62_4==EOF||LA62_4==19||(LA62_4>=37 && LA62_4<=39)||(LA62_4>=83 && LA62_4<=85)||(LA62_4>=101 && LA62_4<=103)||(LA62_4>=105 && LA62_4<=106)||LA62_4==117||LA62_4==119||(LA62_4>=121 && LA62_4<=141)||(LA62_4>=143 && LA62_4<=145)) ) {
                    alt62=4;
                }
                else if ( (LA62_4==120) ) {
                    alt62=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 4, input);

                    throw nvae;
                }
                }
                break;
            case 147:
            case 149:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalAnsibleDsl.g:4743:3: this_EValue_0= ruleEValue
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
                    // InternalAnsibleDsl.g:4752:3: this_EFactGathered_1= ruleEFactGathered
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
                    // InternalAnsibleDsl.g:4761:3: this_EItem_2= ruleEItem
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
                    // InternalAnsibleDsl.g:4770:3: this_EVariableReference_3= ruleEVariableReference
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
                    // InternalAnsibleDsl.g:4779:3: this_EFunctionCall_4= ruleEFunctionCall
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
    // InternalAnsibleDsl.g:4791:1: entryRuleEComposedValue returns [EObject current=null] : iv_ruleEComposedValue= ruleEComposedValue EOF ;
    public final EObject entryRuleEComposedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComposedValue = null;


        try {
            // InternalAnsibleDsl.g:4791:55: (iv_ruleEComposedValue= ruleEComposedValue EOF )
            // InternalAnsibleDsl.g:4792:2: iv_ruleEComposedValue= ruleEComposedValue EOF
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
    // InternalAnsibleDsl.g:4798:1: ruleEComposedValue returns [EObject current=null] : (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList ) ;
    public final EObject ruleEComposedValue() throws RecognitionException {
        EObject current = null;

        EObject this_EDictionary_0 = null;

        EObject this_EList_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4804:2: ( (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList ) )
            // InternalAnsibleDsl.g:4805:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList )
            {
            // InternalAnsibleDsl.g:4805:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==151) ) {
                alt63=1;
            }
            else if ( (LA63_0==145) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalAnsibleDsl.g:4806:3: this_EDictionary_0= ruleEDictionary
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
                    // InternalAnsibleDsl.g:4815:3: this_EList_1= ruleEList
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
    // InternalAnsibleDsl.g:4827:1: entryRuleEValue returns [EObject current=null] : iv_ruleEValue= ruleEValue EOF ;
    public final EObject entryRuleEValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValue = null;


        try {
            // InternalAnsibleDsl.g:4827:47: (iv_ruleEValue= ruleEValue EOF )
            // InternalAnsibleDsl.g:4828:2: iv_ruleEValue= ruleEValue EOF
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
    // InternalAnsibleDsl.g:4834:1: ruleEValue returns [EObject current=null] : (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue ) ;
    public final EObject ruleEValue() throws RecognitionException {
        EObject current = null;

        EObject this_EComposedValue_0 = null;

        EObject this_ESimpleValue_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4840:2: ( (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue ) )
            // InternalAnsibleDsl.g:4841:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue )
            {
            // InternalAnsibleDsl.g:4841:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==145||LA64_0==151) ) {
                alt64=1;
            }
            else if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_BOOLEAN)||(LA64_0>=RULE_NUMBER && LA64_0<=RULE_NULL)) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalAnsibleDsl.g:4842:3: this_EComposedValue_0= ruleEComposedValue
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
                    // InternalAnsibleDsl.g:4851:3: this_ESimpleValue_1= ruleESimpleValue
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
    // InternalAnsibleDsl.g:4863:1: entryRuleEValueWithoutString returns [EObject current=null] : iv_ruleEValueWithoutString= ruleEValueWithoutString EOF ;
    public final EObject entryRuleEValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueWithoutString = null;


        try {
            // InternalAnsibleDsl.g:4863:60: (iv_ruleEValueWithoutString= ruleEValueWithoutString EOF )
            // InternalAnsibleDsl.g:4864:2: iv_ruleEValueWithoutString= ruleEValueWithoutString EOF
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
    // InternalAnsibleDsl.g:4870:1: ruleEValueWithoutString returns [EObject current=null] : (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString ) ;
    public final EObject ruleEValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject this_EComposedValue_0 = null;

        EObject this_ESimpleValueWithoutString_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4876:2: ( (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString ) )
            // InternalAnsibleDsl.g:4877:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString )
            {
            // InternalAnsibleDsl.g:4877:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==145||LA65_0==151) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_BOOLEAN||(LA65_0>=RULE_NUMBER && LA65_0<=RULE_NULL)) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalAnsibleDsl.g:4878:3: this_EComposedValue_0= ruleEComposedValue
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
                    // InternalAnsibleDsl.g:4887:3: this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString
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
    // InternalAnsibleDsl.g:4899:1: entryRuleESimpleValueWithoutString returns [EObject current=null] : iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF ;
    public final EObject entryRuleESimpleValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESimpleValueWithoutString = null;


        try {
            // InternalAnsibleDsl.g:4899:66: (iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF )
            // InternalAnsibleDsl.g:4900:2: iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF
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
    // InternalAnsibleDsl.g:4906:1: ruleESimpleValueWithoutString returns [EObject current=null] : ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleESimpleValueWithoutString() throws RecognitionException {
        EObject current = null;

        Token lv_simple_value_0_0=null;
        Token lv_simple_value_1_0=null;
        Token lv_simple_value_2_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4912:2: ( ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) ) )
            // InternalAnsibleDsl.g:4913:2: ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) )
            {
            // InternalAnsibleDsl.g:4913:2: ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt66=1;
                }
                break;
            case RULE_NULL:
                {
                alt66=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalAnsibleDsl.g:4914:3: ( (lv_simple_value_0_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:4914:3: ( (lv_simple_value_0_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4915:4: (lv_simple_value_0_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4915:4: (lv_simple_value_0_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4916:5: lv_simple_value_0_0= RULE_BOOLEAN
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
                    // InternalAnsibleDsl.g:4933:3: ( (lv_simple_value_1_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:4933:3: ( (lv_simple_value_1_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:4934:4: (lv_simple_value_1_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:4934:4: (lv_simple_value_1_0= RULE_NULL )
                    // InternalAnsibleDsl.g:4935:5: lv_simple_value_1_0= RULE_NULL
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
                    // InternalAnsibleDsl.g:4952:3: ( (lv_simple_value_2_0= RULE_NUMBER ) )
                    {
                    // InternalAnsibleDsl.g:4952:3: ( (lv_simple_value_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:4953:4: (lv_simple_value_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:4953:4: (lv_simple_value_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:4954:5: lv_simple_value_2_0= RULE_NUMBER
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
    // InternalAnsibleDsl.g:4974:1: entryRuleESimpleValue returns [EObject current=null] : iv_ruleESimpleValue= ruleESimpleValue EOF ;
    public final EObject entryRuleESimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESimpleValue = null;


        try {
            // InternalAnsibleDsl.g:4974:53: (iv_ruleESimpleValue= ruleESimpleValue EOF )
            // InternalAnsibleDsl.g:4975:2: iv_ruleESimpleValue= ruleESimpleValue EOF
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
    // InternalAnsibleDsl.g:4981:1: ruleESimpleValue returns [EObject current=null] : ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) ) ;
    public final EObject ruleESimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_simple_value_string_0_0=null;
        EObject lv_simple_value_without_string_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4987:2: ( ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) ) )
            // InternalAnsibleDsl.g:4988:2: ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) )
            {
            // InternalAnsibleDsl.g:4988:2: ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_BOOLEAN||(LA67_0>=RULE_NUMBER && LA67_0<=RULE_NULL)) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalAnsibleDsl.g:4989:3: ( (lv_simple_value_string_0_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:4989:3: ( (lv_simple_value_string_0_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4990:4: (lv_simple_value_string_0_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4990:4: (lv_simple_value_string_0_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4991:5: lv_simple_value_string_0_0= RULE_STRING
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
                    // InternalAnsibleDsl.g:5008:3: ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) )
                    {
                    // InternalAnsibleDsl.g:5008:3: ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) )
                    // InternalAnsibleDsl.g:5009:4: (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString )
                    {
                    // InternalAnsibleDsl.g:5009:4: (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString )
                    // InternalAnsibleDsl.g:5010:5: lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString
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
    // InternalAnsibleDsl.g:5031:1: entryRuleEItem returns [EObject current=null] : iv_ruleEItem= ruleEItem EOF ;
    public final EObject entryRuleEItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEItem = null;


        try {
            // InternalAnsibleDsl.g:5031:46: (iv_ruleEItem= ruleEItem EOF )
            // InternalAnsibleDsl.g:5032:2: iv_ruleEItem= ruleEItem EOF
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
    // InternalAnsibleDsl.g:5038:1: ruleEItem returns [EObject current=null] : ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tail_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5044:2: ( ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:5045:2: ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:5045:2: ( () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:5046:3: () otherlv_1= 'item' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            {
            // InternalAnsibleDsl.g:5046:3: ()
            // InternalAnsibleDsl.g:5047:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEItemAccess().getEItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,116,FOLLOW_91); 

            			newLeafNode(otherlv_1, grammarAccess.getEItemAccess().getItemKeyword_1());
            		
            // InternalAnsibleDsl.g:5057:3: (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==117) ) {
                    int LA68_2 = input.LA(2);

                    if ( (LA68_2==RULE_ID) ) {
                        int LA68_3 = input.LA(3);

                        if ( (LA68_3==EOF||LA68_3==19||(LA68_3>=37 && LA68_3<=39)||(LA68_3>=83 && LA68_3<=85)||(LA68_3>=101 && LA68_3<=103)||(LA68_3>=105 && LA68_3<=106)||LA68_3==117||LA68_3==119||(LA68_3>=121 && LA68_3<=141)||(LA68_3>=143 && LA68_3<=144)) ) {
                            alt68=1;
                        }


                    }


                }


                switch (alt68) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5058:4: otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,117,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEItemAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:5062:4: ( (lv_tail_3_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:5063:5: (lv_tail_3_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:5063:5: (lv_tail_3_0= RULE_ID )
            	    // InternalAnsibleDsl.g:5064:6: lv_tail_3_0= RULE_ID
            	    {
            	    lv_tail_3_0=(Token)match(input,RULE_ID,FOLLOW_91); 

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
            	    break loop68;
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
    // InternalAnsibleDsl.g:5085:1: entryRuleEJinjaExpressionEvaluation returns [EObject current=null] : iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF ;
    public final EObject entryRuleEJinjaExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionEvaluation = null;


        try {
            // InternalAnsibleDsl.g:5085:67: (iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF )
            // InternalAnsibleDsl.g:5086:2: iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF
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
    // InternalAnsibleDsl.g:5092:1: ruleEJinjaExpressionEvaluation returns [EObject current=null] : (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' ) ;
    public final EObject ruleEJinjaExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_jinja_expression_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5098:2: ( (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' ) )
            // InternalAnsibleDsl.g:5099:2: (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' )
            {
            // InternalAnsibleDsl.g:5099:2: (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' )
            // InternalAnsibleDsl.g:5100:3: otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}'
            {
            otherlv_0=(Token)match(input,118,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getEJinjaExpressionEvaluationAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:5104:3: ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            // InternalAnsibleDsl.g:5105:4: (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            {
            // InternalAnsibleDsl.g:5105:4: (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            // InternalAnsibleDsl.g:5106:5: lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            {

            					newCompositeNode(grammarAccess.getEJinjaExpressionEvaluationAccess().getJinja_expressionEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_92);
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

            otherlv_2=(Token)match(input,119,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:5131:1: entryRuleEJinjaExpressionEvaluationWithoutBrackets returns [EObject current=null] : iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF ;
    public final EObject entryRuleEJinjaExpressionEvaluationWithoutBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionEvaluationWithoutBrackets = null;


        try {
            // InternalAnsibleDsl.g:5131:82: (iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF )
            // InternalAnsibleDsl.g:5132:2: iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF
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
    // InternalAnsibleDsl.g:5138:1: ruleEJinjaExpressionEvaluationWithoutBrackets returns [EObject current=null] : (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression ) ;
    public final EObject ruleEJinjaExpressionEvaluationWithoutBrackets() throws RecognitionException {
        EObject current = null;

        EObject this_EFilteredExpression_0 = null;

        EObject this_EIfExpression_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5144:2: ( (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression ) )
            // InternalAnsibleDsl.g:5145:2: (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression )
            {
            // InternalAnsibleDsl.g:5145:2: (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_NULL)||LA69_0==116||LA69_0==120||LA69_0==145||LA69_0==147||(LA69_0>=149 && LA69_0<=151)) ) {
                alt69=1;
            }
            else if ( (LA69_0==142) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalAnsibleDsl.g:5146:3: this_EFilteredExpression_0= ruleEFilteredExpression
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
                    // InternalAnsibleDsl.g:5155:3: this_EIfExpression_1= ruleEIfExpression
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
    // InternalAnsibleDsl.g:5167:1: entryRuleEFunctionCall returns [EObject current=null] : iv_ruleEFunctionCall= ruleEFunctionCall EOF ;
    public final EObject entryRuleEFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunctionCall = null;


        try {
            // InternalAnsibleDsl.g:5167:54: (iv_ruleEFunctionCall= ruleEFunctionCall EOF )
            // InternalAnsibleDsl.g:5168:2: iv_ruleEFunctionCall= ruleEFunctionCall EOF
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
    // InternalAnsibleDsl.g:5174:1: ruleEFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) ) ;
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
            // InternalAnsibleDsl.g:5180:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) ) )
            // InternalAnsibleDsl.g:5181:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) )
            {
            // InternalAnsibleDsl.g:5181:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) ) )
            // InternalAnsibleDsl.g:5182:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) )
            {
            // InternalAnsibleDsl.g:5182:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5183:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5183:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:5184:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_93); 

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

            // InternalAnsibleDsl.g:5200:3: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | (otherlv_6= '(' otherlv_7= ')' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==120) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==122) ) {
                    alt71=2;
                }
                else if ( ((LA71_1>=RULE_STRING && LA71_1<=RULE_NULL)||LA71_1==116||LA71_1==120||LA71_1==145||LA71_1==147||(LA71_1>=149 && LA71_1<=151)) ) {
                    alt71=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalAnsibleDsl.g:5201:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' )
                    {
                    // InternalAnsibleDsl.g:5201:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' )
                    // InternalAnsibleDsl.g:5202:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,120,FOLLOW_94); 

                    					newLeafNode(otherlv_1, grammarAccess.getEFunctionCallAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalAnsibleDsl.g:5206:5: ( (lv_parameters_2_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:5207:6: (lv_parameters_2_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:5207:6: (lv_parameters_2_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:5208:7: lv_parameters_2_0= ruleEFilteredExpression
                    {

                    							newCompositeNode(grammarAccess.getEFunctionCallAccess().getParametersEFilteredExpressionParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_95);
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

                    // InternalAnsibleDsl.g:5225:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==121) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:5226:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,121,FOLLOW_94); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getEFunctionCallAccess().getCommaKeyword_1_0_2_0());
                    	    					
                    	    // InternalAnsibleDsl.g:5230:6: ( (lv_parameters_4_0= ruleEFilteredExpression ) )
                    	    // InternalAnsibleDsl.g:5231:7: (lv_parameters_4_0= ruleEFilteredExpression )
                    	    {
                    	    // InternalAnsibleDsl.g:5231:7: (lv_parameters_4_0= ruleEFilteredExpression )
                    	    // InternalAnsibleDsl.g:5232:8: lv_parameters_4_0= ruleEFilteredExpression
                    	    {

                    	    								newCompositeNode(grammarAccess.getEFunctionCallAccess().getParametersEFilteredExpressionParserRuleCall_1_0_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_95);
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
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,122,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getEFunctionCallAccess().getRightParenthesisKeyword_1_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5256:4: (otherlv_6= '(' otherlv_7= ')' )
                    {
                    // InternalAnsibleDsl.g:5256:4: (otherlv_6= '(' otherlv_7= ')' )
                    // InternalAnsibleDsl.g:5257:5: otherlv_6= '(' otherlv_7= ')'
                    {
                    otherlv_6=(Token)match(input,120,FOLLOW_96); 

                    					newLeafNode(otherlv_6, grammarAccess.getEFunctionCallAccess().getLeftParenthesisKeyword_1_1_0());
                    				
                    otherlv_7=(Token)match(input,122,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:5271:1: entryRuleEFilteredExpression returns [EObject current=null] : iv_ruleEFilteredExpression= ruleEFilteredExpression EOF ;
    public final EObject entryRuleEFilteredExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredExpression = null;


        try {
            // InternalAnsibleDsl.g:5271:60: (iv_ruleEFilteredExpression= ruleEFilteredExpression EOF )
            // InternalAnsibleDsl.g:5272:2: iv_ruleEFilteredExpression= ruleEFilteredExpression EOF
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
    // InternalAnsibleDsl.g:5278:1: ruleEFilteredExpression returns [EObject current=null] : ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? ) ;
    public final EObject ruleEFilteredExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_to_filter_0_0 = null;

        EObject lv_tail_2_0 = null;

        EObject lv_filter_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5284:2: ( ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5285:2: ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5285:2: ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )? )
            // InternalAnsibleDsl.g:5286:3: ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )* (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5286:3: ( (lv_to_filter_0_0= ruleEOrExpression ) )
            // InternalAnsibleDsl.g:5287:4: (lv_to_filter_0_0= ruleEOrExpression )
            {
            // InternalAnsibleDsl.g:5287:4: (lv_to_filter_0_0= ruleEOrExpression )
            // InternalAnsibleDsl.g:5288:5: lv_to_filter_0_0= ruleEOrExpression
            {

            					newCompositeNode(grammarAccess.getEFilteredExpressionAccess().getTo_filterEOrExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_97);
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

            // InternalAnsibleDsl.g:5305:3: (otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==117) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalAnsibleDsl.g:5306:4: otherlv_1= '.' ( (lv_tail_2_0= ruleEFunctionCall ) )
            	    {
            	    otherlv_1=(Token)match(input,117,FOLLOW_98); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEFilteredExpressionAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalAnsibleDsl.g:5310:4: ( (lv_tail_2_0= ruleEFunctionCall ) )
            	    // InternalAnsibleDsl.g:5311:5: (lv_tail_2_0= ruleEFunctionCall )
            	    {
            	    // InternalAnsibleDsl.g:5311:5: (lv_tail_2_0= ruleEFunctionCall )
            	    // InternalAnsibleDsl.g:5312:6: lv_tail_2_0= ruleEFunctionCall
            	    {

            	    						newCompositeNode(grammarAccess.getEFilteredExpressionAccess().getTailEFunctionCallParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_97);
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
            	    break loop72;
                }
            } while (true);

            // InternalAnsibleDsl.g:5330:3: (otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==123) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAnsibleDsl.g:5331:4: otherlv_3= '|' ( (lv_filter_4_0= ruleEFilteredExpression ) )
                    {
                    otherlv_3=(Token)match(input,123,FOLLOW_94); 

                    				newLeafNode(otherlv_3, grammarAccess.getEFilteredExpressionAccess().getVerticalLineKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:5335:4: ( (lv_filter_4_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:5336:5: (lv_filter_4_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:5336:5: (lv_filter_4_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:5337:6: lv_filter_4_0= ruleEFilteredExpression
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
    // InternalAnsibleDsl.g:5359:1: entryRuleEOrExpression returns [EObject current=null] : iv_ruleEOrExpression= ruleEOrExpression EOF ;
    public final EObject entryRuleEOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOrExpression = null;


        try {
            // InternalAnsibleDsl.g:5359:54: (iv_ruleEOrExpression= ruleEOrExpression EOF )
            // InternalAnsibleDsl.g:5360:2: iv_ruleEOrExpression= ruleEOrExpression EOF
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
    // InternalAnsibleDsl.g:5366:1: ruleEOrExpression returns [EObject current=null] : ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? ) ;
    public final EObject ruleEOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_or_0_0 = null;

        EObject lv_right_or_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5372:2: ( ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5373:2: ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5373:2: ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? )
            // InternalAnsibleDsl.g:5374:3: ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5374:3: ( (lv_left_or_0_0= ruleEAndExpression ) )
            // InternalAnsibleDsl.g:5375:4: (lv_left_or_0_0= ruleEAndExpression )
            {
            // InternalAnsibleDsl.g:5375:4: (lv_left_or_0_0= ruleEAndExpression )
            // InternalAnsibleDsl.g:5376:5: lv_left_or_0_0= ruleEAndExpression
            {

            					newCompositeNode(grammarAccess.getEOrExpressionAccess().getLeft_orEAndExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_99);
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

            // InternalAnsibleDsl.g:5393:3: (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==124) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAnsibleDsl.g:5394:4: otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,124,FOLLOW_94); 

                    				newLeafNode(otherlv_1, grammarAccess.getEOrExpressionAccess().getOrKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5398:4: ( (lv_right_or_2_0= ruleEOrExpression ) )
                    // InternalAnsibleDsl.g:5399:5: (lv_right_or_2_0= ruleEOrExpression )
                    {
                    // InternalAnsibleDsl.g:5399:5: (lv_right_or_2_0= ruleEOrExpression )
                    // InternalAnsibleDsl.g:5400:6: lv_right_or_2_0= ruleEOrExpression
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
    // InternalAnsibleDsl.g:5422:1: entryRuleEAndExpression returns [EObject current=null] : iv_ruleEAndExpression= ruleEAndExpression EOF ;
    public final EObject entryRuleEAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAndExpression = null;


        try {
            // InternalAnsibleDsl.g:5422:55: (iv_ruleEAndExpression= ruleEAndExpression EOF )
            // InternalAnsibleDsl.g:5423:2: iv_ruleEAndExpression= ruleEAndExpression EOF
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
    // InternalAnsibleDsl.g:5429:1: ruleEAndExpression returns [EObject current=null] : ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? ) ;
    public final EObject ruleEAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_and_0_0 = null;

        EObject lv_right_and_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5435:2: ( ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5436:2: ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5436:2: ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? )
            // InternalAnsibleDsl.g:5437:3: ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5437:3: ( (lv_left_and_0_0= ruleETruthExpression ) )
            // InternalAnsibleDsl.g:5438:4: (lv_left_and_0_0= ruleETruthExpression )
            {
            // InternalAnsibleDsl.g:5438:4: (lv_left_and_0_0= ruleETruthExpression )
            // InternalAnsibleDsl.g:5439:5: lv_left_and_0_0= ruleETruthExpression
            {

            					newCompositeNode(grammarAccess.getEAndExpressionAccess().getLeft_andETruthExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_100);
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

            // InternalAnsibleDsl.g:5456:3: (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==125) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalAnsibleDsl.g:5457:4: otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,125,FOLLOW_94); 

                    				newLeafNode(otherlv_1, grammarAccess.getEAndExpressionAccess().getAndKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5461:4: ( (lv_right_and_2_0= ruleEAndExpression ) )
                    // InternalAnsibleDsl.g:5462:5: (lv_right_and_2_0= ruleEAndExpression )
                    {
                    // InternalAnsibleDsl.g:5462:5: (lv_right_and_2_0= ruleEAndExpression )
                    // InternalAnsibleDsl.g:5463:6: lv_right_and_2_0= ruleEAndExpression
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
    // InternalAnsibleDsl.g:5485:1: entryRuleETruthExpression returns [EObject current=null] : iv_ruleETruthExpression= ruleETruthExpression EOF ;
    public final EObject entryRuleETruthExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETruthExpression = null;


        try {
            // InternalAnsibleDsl.g:5485:57: (iv_ruleETruthExpression= ruleETruthExpression EOF )
            // InternalAnsibleDsl.g:5486:2: iv_ruleETruthExpression= ruleETruthExpression EOF
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
    // InternalAnsibleDsl.g:5492:1: ruleETruthExpression returns [EObject current=null] : ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? ) ;
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
            // InternalAnsibleDsl.g:5498:2: ( ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5499:2: ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5499:2: ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? )
            // InternalAnsibleDsl.g:5500:3: ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5500:3: ( (lv_left_value_0_0= ruleEOperation ) )
            // InternalAnsibleDsl.g:5501:4: (lv_left_value_0_0= ruleEOperation )
            {
            // InternalAnsibleDsl.g:5501:4: (lv_left_value_0_0= ruleEOperation )
            // InternalAnsibleDsl.g:5502:5: lv_left_value_0_0= ruleEOperation
            {

            					newCompositeNode(grammarAccess.getETruthExpressionAccess().getLeft_valueEOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_101);
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

            // InternalAnsibleDsl.g:5519:3: ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=126 && LA77_0<=131)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalAnsibleDsl.g:5520:4: ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) )
                    {
                    // InternalAnsibleDsl.g:5520:4: ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) )
                    // InternalAnsibleDsl.g:5521:5: ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) )
                    {
                    // InternalAnsibleDsl.g:5521:5: ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) )
                    // InternalAnsibleDsl.g:5522:6: (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' )
                    {
                    // InternalAnsibleDsl.g:5522:6: (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' )
                    int alt76=6;
                    switch ( input.LA(1) ) {
                    case 126:
                        {
                        alt76=1;
                        }
                        break;
                    case 127:
                        {
                        alt76=2;
                        }
                        break;
                    case 128:
                        {
                        alt76=3;
                        }
                        break;
                    case 129:
                        {
                        alt76=4;
                        }
                        break;
                    case 130:
                        {
                        alt76=5;
                        }
                        break;
                    case 131:
                        {
                        alt76=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }

                    switch (alt76) {
                        case 1 :
                            // InternalAnsibleDsl.g:5523:7: lv_equality_sign_1_1= '=='
                            {
                            lv_equality_sign_1_1=(Token)match(input,126,FOLLOW_94); 

                            							newLeafNode(lv_equality_sign_1_1, grammarAccess.getETruthExpressionAccess().getEquality_signEqualsSignEqualsSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:5534:7: lv_equality_sign_1_2= '!='
                            {
                            lv_equality_sign_1_2=(Token)match(input,127,FOLLOW_94); 

                            							newLeafNode(lv_equality_sign_1_2, grammarAccess.getETruthExpressionAccess().getEquality_signExclamationMarkEqualsSignKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:5545:7: lv_equality_sign_1_3= '<'
                            {
                            lv_equality_sign_1_3=(Token)match(input,128,FOLLOW_94); 

                            							newLeafNode(lv_equality_sign_1_3, grammarAccess.getETruthExpressionAccess().getEquality_signLessThanSignKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:5556:7: lv_equality_sign_1_4= '>'
                            {
                            lv_equality_sign_1_4=(Token)match(input,129,FOLLOW_94); 

                            							newLeafNode(lv_equality_sign_1_4, grammarAccess.getETruthExpressionAccess().getEquality_signGreaterThanSignKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:5567:7: lv_equality_sign_1_5= '<='
                            {
                            lv_equality_sign_1_5=(Token)match(input,130,FOLLOW_94); 

                            							newLeafNode(lv_equality_sign_1_5, grammarAccess.getETruthExpressionAccess().getEquality_signLessThanSignEqualsSignKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalAnsibleDsl.g:5578:7: lv_equality_sign_1_6= '>='
                            {
                            lv_equality_sign_1_6=(Token)match(input,131,FOLLOW_94); 

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

                    // InternalAnsibleDsl.g:5591:4: ( (lv_right_value_2_0= ruleETruthExpression ) )
                    // InternalAnsibleDsl.g:5592:5: (lv_right_value_2_0= ruleETruthExpression )
                    {
                    // InternalAnsibleDsl.g:5592:5: (lv_right_value_2_0= ruleETruthExpression )
                    // InternalAnsibleDsl.g:5593:6: lv_right_value_2_0= ruleETruthExpression
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
    // InternalAnsibleDsl.g:5615:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalAnsibleDsl.g:5615:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalAnsibleDsl.g:5616:2: iv_ruleEOperation= ruleEOperation EOF
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
    // InternalAnsibleDsl.g:5622:1: ruleEOperation returns [EObject current=null] : ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? ) ;
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
            // InternalAnsibleDsl.g:5628:2: ( ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? ) )
            // InternalAnsibleDsl.g:5629:2: ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? )
            {
            // InternalAnsibleDsl.g:5629:2: ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? )
            // InternalAnsibleDsl.g:5630:3: ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )?
            {
            // InternalAnsibleDsl.g:5630:3: ( (lv_left_operand_0_0= ruleEIsExpression ) )
            // InternalAnsibleDsl.g:5631:4: (lv_left_operand_0_0= ruleEIsExpression )
            {
            // InternalAnsibleDsl.g:5631:4: (lv_left_operand_0_0= ruleEIsExpression )
            // InternalAnsibleDsl.g:5632:5: lv_left_operand_0_0= ruleEIsExpression
            {

            					newCompositeNode(grammarAccess.getEOperationAccess().getLeft_operandEIsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_102);
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

            // InternalAnsibleDsl.g:5649:3: ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=132 && LA79_0<=138)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalAnsibleDsl.g:5650:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) )
                    {
                    // InternalAnsibleDsl.g:5650:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) )
                    // InternalAnsibleDsl.g:5651:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) )
                    {
                    // InternalAnsibleDsl.g:5651:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) )
                    // InternalAnsibleDsl.g:5652:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' )
                    {
                    // InternalAnsibleDsl.g:5652:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' )
                    int alt78=7;
                    switch ( input.LA(1) ) {
                    case 132:
                        {
                        alt78=1;
                        }
                        break;
                    case 133:
                        {
                        alt78=2;
                        }
                        break;
                    case 134:
                        {
                        alt78=3;
                        }
                        break;
                    case 135:
                        {
                        alt78=4;
                        }
                        break;
                    case 136:
                        {
                        alt78=5;
                        }
                        break;
                    case 137:
                        {
                        alt78=6;
                        }
                        break;
                    case 138:
                        {
                        alt78=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }

                    switch (alt78) {
                        case 1 :
                            // InternalAnsibleDsl.g:5653:7: lv_operator_1_1= '+'
                            {
                            lv_operator_1_1=(Token)match(input,132,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_1, grammarAccess.getEOperationAccess().getOperatorPlusSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:5664:7: lv_operator_1_2= '-'
                            {
                            lv_operator_1_2=(Token)match(input,133,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_2, grammarAccess.getEOperationAccess().getOperatorHyphenMinusKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:5675:7: lv_operator_1_3= '/'
                            {
                            lv_operator_1_3=(Token)match(input,134,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_3, grammarAccess.getEOperationAccess().getOperatorSolidusKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:5686:7: lv_operator_1_4= '//'
                            {
                            lv_operator_1_4=(Token)match(input,135,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_4, grammarAccess.getEOperationAccess().getOperatorSolidusSolidusKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:5697:7: lv_operator_1_5= '%'
                            {
                            lv_operator_1_5=(Token)match(input,136,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_5, grammarAccess.getEOperationAccess().getOperatorPercentSignKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalAnsibleDsl.g:5708:7: lv_operator_1_6= '*'
                            {
                            lv_operator_1_6=(Token)match(input,137,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_6, grammarAccess.getEOperationAccess().getOperatorAsteriskKeyword_1_0_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_6, null);
                            						

                            }
                            break;
                        case 7 :
                            // InternalAnsibleDsl.g:5719:7: lv_operator_1_7= '**'
                            {
                            lv_operator_1_7=(Token)match(input,138,FOLLOW_94); 

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

                    // InternalAnsibleDsl.g:5732:4: ( (lv_right_operand_2_0= ruleEOperation ) )
                    // InternalAnsibleDsl.g:5733:5: (lv_right_operand_2_0= ruleEOperation )
                    {
                    // InternalAnsibleDsl.g:5733:5: (lv_right_operand_2_0= ruleEOperation )
                    // InternalAnsibleDsl.g:5734:6: lv_right_operand_2_0= ruleEOperation
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
    // InternalAnsibleDsl.g:5756:1: entryRuleEIsExpression returns [EObject current=null] : iv_ruleEIsExpression= ruleEIsExpression EOF ;
    public final EObject entryRuleEIsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIsExpression = null;


        try {
            // InternalAnsibleDsl.g:5756:54: (iv_ruleEIsExpression= ruleEIsExpression EOF )
            // InternalAnsibleDsl.g:5757:2: iv_ruleEIsExpression= ruleEIsExpression EOF
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
    // InternalAnsibleDsl.g:5763:1: ruleEIsExpression returns [EObject current=null] : ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? ) ;
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
            // InternalAnsibleDsl.g:5769:2: ( ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? ) )
            // InternalAnsibleDsl.g:5770:2: ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? )
            {
            // InternalAnsibleDsl.g:5770:2: ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? )
            // InternalAnsibleDsl.g:5771:3: ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )?
            {
            // InternalAnsibleDsl.g:5771:3: ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) )
            // InternalAnsibleDsl.g:5772:4: (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression )
            {
            // InternalAnsibleDsl.g:5772:4: (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression )
            // InternalAnsibleDsl.g:5773:5: lv_parenthesised_expression_0_0= ruleEParenthesisedExpression
            {

            					newCompositeNode(grammarAccess.getEIsExpressionAccess().getParenthesised_expressionEParenthesisedExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_103);
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

            // InternalAnsibleDsl.g:5790:3: ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )?
            int alt82=3;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==139) ) {
                alt82=1;
            }
            else if ( ((LA82_0>=140 && LA82_0<=141)) ) {
                alt82=2;
            }
            switch (alt82) {
                case 1 :
                    // InternalAnsibleDsl.g:5791:4: (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) )
                    {
                    // InternalAnsibleDsl.g:5791:4: (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) )
                    // InternalAnsibleDsl.g:5792:5: otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) )
                    {
                    otherlv_1=(Token)match(input,139,FOLLOW_104); 

                    					newLeafNode(otherlv_1, grammarAccess.getEIsExpressionAccess().getIsKeyword_1_0_0());
                    				
                    // InternalAnsibleDsl.g:5796:5: ( (lv_is_not_2_0= 'not' ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==140) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalAnsibleDsl.g:5797:6: (lv_is_not_2_0= 'not' )
                            {
                            // InternalAnsibleDsl.g:5797:6: (lv_is_not_2_0= 'not' )
                            // InternalAnsibleDsl.g:5798:7: lv_is_not_2_0= 'not'
                            {
                            lv_is_not_2_0=(Token)match(input,140,FOLLOW_94); 

                            							newLeafNode(lv_is_not_2_0, grammarAccess.getEIsExpressionAccess().getIs_notNotKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEIsExpressionRule());
                            							}
                            							setWithLastConsumed(current, "is_not", lv_is_not_2_0, "not");
                            						

                            }


                            }
                            break;

                    }

                    // InternalAnsibleDsl.g:5810:5: ( (lv_status_3_0= ruleEIsExpression ) )
                    // InternalAnsibleDsl.g:5811:6: (lv_status_3_0= ruleEIsExpression )
                    {
                    // InternalAnsibleDsl.g:5811:6: (lv_status_3_0= ruleEIsExpression )
                    // InternalAnsibleDsl.g:5812:7: lv_status_3_0= ruleEIsExpression
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
                    // InternalAnsibleDsl.g:5831:4: ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) )
                    {
                    // InternalAnsibleDsl.g:5831:4: ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) )
                    // InternalAnsibleDsl.g:5832:5: ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) )
                    {
                    // InternalAnsibleDsl.g:5832:5: ( (lv_is_not_4_0= 'not' ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==140) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalAnsibleDsl.g:5833:6: (lv_is_not_4_0= 'not' )
                            {
                            // InternalAnsibleDsl.g:5833:6: (lv_is_not_4_0= 'not' )
                            // InternalAnsibleDsl.g:5834:7: lv_is_not_4_0= 'not'
                            {
                            lv_is_not_4_0=(Token)match(input,140,FOLLOW_105); 

                            							newLeafNode(lv_is_not_4_0, grammarAccess.getEIsExpressionAccess().getIs_notNotKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEIsExpressionRule());
                            							}
                            							setWithLastConsumed(current, "is_not", lv_is_not_4_0, "not");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,141,FOLLOW_94); 

                    					newLeafNode(otherlv_5, grammarAccess.getEIsExpressionAccess().getInKeyword_1_1_1());
                    				
                    // InternalAnsibleDsl.g:5850:5: ( (lv_container_expression_6_0= ruleEIsExpression ) )
                    // InternalAnsibleDsl.g:5851:6: (lv_container_expression_6_0= ruleEIsExpression )
                    {
                    // InternalAnsibleDsl.g:5851:6: (lv_container_expression_6_0= ruleEIsExpression )
                    // InternalAnsibleDsl.g:5852:7: lv_container_expression_6_0= ruleEIsExpression
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
    // InternalAnsibleDsl.g:5875:1: entryRuleEParenthesisedExpression returns [EObject current=null] : iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF ;
    public final EObject entryRuleEParenthesisedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParenthesisedExpression = null;


        try {
            // InternalAnsibleDsl.g:5875:65: (iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF )
            // InternalAnsibleDsl.g:5876:2: iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF
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
    // InternalAnsibleDsl.g:5882:1: ruleEParenthesisedExpression returns [EObject current=null] : ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) ) ;
    public final EObject ruleEParenthesisedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_basic_value_0_0 = null;

        EObject lv_parenthesised_term_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5888:2: ( ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) ) )
            // InternalAnsibleDsl.g:5889:2: ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) )
            {
            // InternalAnsibleDsl.g:5889:2: ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=RULE_STRING && LA83_0<=RULE_NULL)||LA83_0==116||LA83_0==145||LA83_0==147||(LA83_0>=149 && LA83_0<=151)) ) {
                alt83=1;
            }
            else if ( (LA83_0==120) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalAnsibleDsl.g:5890:3: ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) )
                    {
                    // InternalAnsibleDsl.g:5890:3: ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) )
                    // InternalAnsibleDsl.g:5891:4: (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression )
                    {
                    // InternalAnsibleDsl.g:5891:4: (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression )
                    // InternalAnsibleDsl.g:5892:5: lv_basic_value_0_0= ruleEValuePassedToJinjaExpression
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
                    // InternalAnsibleDsl.g:5910:3: (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' )
                    {
                    // InternalAnsibleDsl.g:5910:3: (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')' )
                    // InternalAnsibleDsl.g:5911:4: otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEOrExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,120,FOLLOW_94); 

                    				newLeafNode(otherlv_1, grammarAccess.getEParenthesisedExpressionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5915:4: ( (lv_parenthesised_term_2_0= ruleEOrExpression ) )
                    // InternalAnsibleDsl.g:5916:5: (lv_parenthesised_term_2_0= ruleEOrExpression )
                    {
                    // InternalAnsibleDsl.g:5916:5: (lv_parenthesised_term_2_0= ruleEOrExpression )
                    // InternalAnsibleDsl.g:5917:6: lv_parenthesised_term_2_0= ruleEOrExpression
                    {

                    						newCompositeNode(grammarAccess.getEParenthesisedExpressionAccess().getParenthesised_termEOrExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_96);
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

                    otherlv_3=(Token)match(input,122,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:5943:1: entryRuleEIfExpression returns [EObject current=null] : iv_ruleEIfExpression= ruleEIfExpression EOF ;
    public final EObject entryRuleEIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIfExpression = null;


        try {
            // InternalAnsibleDsl.g:5943:54: (iv_ruleEIfExpression= ruleEIfExpression EOF )
            // InternalAnsibleDsl.g:5944:2: iv_ruleEIfExpression= ruleEIfExpression EOF
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
    // InternalAnsibleDsl.g:5950:1: ruleEIfExpression returns [EObject current=null] : (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? ) ;
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
            // InternalAnsibleDsl.g:5956:2: ( (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5957:2: (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5957:2: (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? )
            // InternalAnsibleDsl.g:5958:3: otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )?
            {
            otherlv_0=(Token)match(input,142,FOLLOW_94); 

            			newLeafNode(otherlv_0, grammarAccess.getEIfExpressionAccess().getReturnKeyword_0());
            		
            // InternalAnsibleDsl.g:5962:3: ( (lv_if_expression_1_0= ruleEFilteredExpression ) )
            // InternalAnsibleDsl.g:5963:4: (lv_if_expression_1_0= ruleEFilteredExpression )
            {
            // InternalAnsibleDsl.g:5963:4: (lv_if_expression_1_0= ruleEFilteredExpression )
            // InternalAnsibleDsl.g:5964:5: lv_if_expression_1_0= ruleEFilteredExpression
            {

            					newCompositeNode(grammarAccess.getEIfExpressionAccess().getIf_expressionEFilteredExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_106);
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

            otherlv_2=(Token)match(input,143,FOLLOW_94); 

            			newLeafNode(otherlv_2, grammarAccess.getEIfExpressionAccess().getIfKeyword_2());
            		
            // InternalAnsibleDsl.g:5985:3: ( (lv_if_condition_3_0= ruleEFilteredExpression ) )
            // InternalAnsibleDsl.g:5986:4: (lv_if_condition_3_0= ruleEFilteredExpression )
            {
            // InternalAnsibleDsl.g:5986:4: (lv_if_condition_3_0= ruleEFilteredExpression )
            // InternalAnsibleDsl.g:5987:5: lv_if_condition_3_0= ruleEFilteredExpression
            {

            					newCompositeNode(grammarAccess.getEIfExpressionAccess().getIf_conditionEFilteredExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_107);
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

            // InternalAnsibleDsl.g:6004:3: (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==144) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalAnsibleDsl.g:6005:4: otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) )
                    {
                    otherlv_4=(Token)match(input,144,FOLLOW_94); 

                    				newLeafNode(otherlv_4, grammarAccess.getEIfExpressionAccess().getElseKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:6009:4: ( (lv_else_expression_5_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:6010:5: (lv_else_expression_5_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:6010:5: (lv_else_expression_5_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:6011:6: lv_else_expression_5_0= ruleEFilteredExpression
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
    // InternalAnsibleDsl.g:6033:1: entryRuleEDictionaryPairReference returns [EObject current=null] : iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF ;
    public final EObject entryRuleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPairReference = null;


        try {
            // InternalAnsibleDsl.g:6033:65: (iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF )
            // InternalAnsibleDsl.g:6034:2: iv_ruleEDictionaryPairReference= ruleEDictionaryPairReference EOF
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
    // InternalAnsibleDsl.g:6040:1: ruleEDictionaryPairReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleEDictionaryPairReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6046:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? ) )
            // InternalAnsibleDsl.g:6047:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? )
            {
            // InternalAnsibleDsl.g:6047:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? )
            // InternalAnsibleDsl.g:6048:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            {
            // InternalAnsibleDsl.g:6048:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6049:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6049:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:6050:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDictionaryPairReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_108); 

            					newLeafNode(otherlv_0, grammarAccess.getEDictionaryPairReferenceAccess().getNameEDictionaryPairCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6061:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==145) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAnsibleDsl.g:6062:4: otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,145,FOLLOW_76); 

                    				newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairReferenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6066:4: ( (lv_index_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6067:5: (lv_index_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6067:5: (lv_index_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6068:6: lv_index_2_0= RULE_NUMBER
                    {
                    lv_index_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_109); 

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

                    otherlv_3=(Token)match(input,146,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:6093:1: entryRuleEVariableDeclarationVariableReference returns [EObject current=null] : iv_ruleEVariableDeclarationVariableReference= ruleEVariableDeclarationVariableReference EOF ;
    public final EObject entryRuleEVariableDeclarationVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclarationVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6093:78: (iv_ruleEVariableDeclarationVariableReference= ruleEVariableDeclarationVariableReference EOF )
            // InternalAnsibleDsl.g:6094:2: iv_ruleEVariableDeclarationVariableReference= ruleEVariableDeclarationVariableReference EOF
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
    // InternalAnsibleDsl.g:6100:1: ruleEVariableDeclarationVariableReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* ) ;
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
            // InternalAnsibleDsl.g:6106:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* ) )
            // InternalAnsibleDsl.g:6107:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* )
            {
            // InternalAnsibleDsl.g:6107:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )* )
            // InternalAnsibleDsl.g:6108:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )*
            {
            // InternalAnsibleDsl.g:6108:3: ( (otherlv_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6109:4: (otherlv_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6109:4: (otherlv_0= RULE_ID )
            // InternalAnsibleDsl.g:6110:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEVariableDeclarationVariableReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_110); 

            					newLeafNode(otherlv_0, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getVariable_declaration_variable_referenceEVariableDeclarationCrossReference_0_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6121:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==145) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalAnsibleDsl.g:6122:4: otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,145,FOLLOW_76); 

                    				newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6126:4: ( (lv_index_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6127:5: (lv_index_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6127:5: (lv_index_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6128:6: lv_index_2_0= RULE_NUMBER
                    {
                    lv_index_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_109); 

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

                    otherlv_3=(Token)match(input,146,FOLLOW_91); 

                    				newLeafNode(otherlv_3, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:6149:3: (otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) ) )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==117) ) {
                    int LA87_2 = input.LA(2);

                    if ( (LA87_2==RULE_ID) ) {
                        int LA87_3 = input.LA(3);

                        if ( (LA87_3==EOF||LA87_3==19||(LA87_3>=37 && LA87_3<=39)||(LA87_3>=83 && LA87_3<=85)||(LA87_3>=101 && LA87_3<=103)||(LA87_3>=105 && LA87_3<=106)||LA87_3==117||LA87_3==119||(LA87_3>=121 && LA87_3<=141)||(LA87_3>=143 && LA87_3<=145)) ) {
                            alt87=1;
                        }


                    }


                }


                switch (alt87) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6150:4: otherlv_4= '.' ( (lv_tail_5_0= ruleEDictionaryPairReference ) )
            	    {
            	    otherlv_4=(Token)match(input,117,FOLLOW_20); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6154:4: ( (lv_tail_5_0= ruleEDictionaryPairReference ) )
            	    // InternalAnsibleDsl.g:6155:5: (lv_tail_5_0= ruleEDictionaryPairReference )
            	    {
            	    // InternalAnsibleDsl.g:6155:5: (lv_tail_5_0= ruleEDictionaryPairReference )
            	    // InternalAnsibleDsl.g:6156:6: lv_tail_5_0= ruleEDictionaryPairReference
            	    {

            	    						newCompositeNode(grammarAccess.getEVariableDeclarationVariableReferenceAccess().getTailEDictionaryPairReferenceParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_91);
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
            	    break loop87;
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
    // InternalAnsibleDsl.g:6178:1: entryRuleERegisterVariableReference returns [EObject current=null] : iv_ruleERegisterVariableReference= ruleERegisterVariableReference EOF ;
    public final EObject entryRuleERegisterVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6178:67: (iv_ruleERegisterVariableReference= ruleERegisterVariableReference EOF )
            // InternalAnsibleDsl.g:6179:2: iv_ruleERegisterVariableReference= ruleERegisterVariableReference EOF
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
    // InternalAnsibleDsl.g:6185:1: ruleERegisterVariableReference returns [EObject current=null] : (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* ) ;
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
            // InternalAnsibleDsl.g:6191:2: ( (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:6192:2: (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:6192:2: (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:6193:3: otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,147,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableReferenceAccess().getRegistered_variableKeyword_0());
            		
            // InternalAnsibleDsl.g:6197:3: ( (otherlv_1= RULE_ID ) )
            // InternalAnsibleDsl.g:6198:4: (otherlv_1= RULE_ID )
            {
            // InternalAnsibleDsl.g:6198:4: (otherlv_1= RULE_ID )
            // InternalAnsibleDsl.g:6199:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERegisterVariableReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_110); 

            					newLeafNode(otherlv_1, grammarAccess.getERegisterVariableReferenceAccess().getRegister_variable_referenceERegisterVariableCrossReference_1_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6210:3: (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==145) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // InternalAnsibleDsl.g:6211:4: otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,145,FOLLOW_76); 

                    				newLeafNode(otherlv_2, grammarAccess.getERegisterVariableReferenceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:6215:4: ( (lv_index_3_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6216:5: (lv_index_3_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6216:5: (lv_index_3_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6217:6: lv_index_3_0= RULE_NUMBER
                    {
                    lv_index_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_109); 

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

                    otherlv_4=(Token)match(input,146,FOLLOW_91); 

                    				newLeafNode(otherlv_4, grammarAccess.getERegisterVariableReferenceAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:6238:3: (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==117) ) {
                    int LA89_2 = input.LA(2);

                    if ( (LA89_2==RULE_ID) ) {
                        int LA89_3 = input.LA(3);

                        if ( (LA89_3==EOF||LA89_3==19||(LA89_3>=37 && LA89_3<=39)||(LA89_3>=83 && LA89_3<=85)||(LA89_3>=101 && LA89_3<=103)||(LA89_3>=105 && LA89_3<=106)||LA89_3==117||LA89_3==119||(LA89_3>=121 && LA89_3<=141)||(LA89_3>=143 && LA89_3<=144)) ) {
                            alt89=1;
                        }


                    }


                }


                switch (alt89) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6239:4: otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,117,FOLLOW_20); 

            	    				newLeafNode(otherlv_5, grammarAccess.getERegisterVariableReferenceAccess().getFullStopKeyword_3_0());
            	    			
            	    // InternalAnsibleDsl.g:6243:4: ( (lv_tail_6_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:6244:5: (lv_tail_6_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:6244:5: (lv_tail_6_0= RULE_ID )
            	    // InternalAnsibleDsl.g:6245:6: lv_tail_6_0= RULE_ID
            	    {
            	    lv_tail_6_0=(Token)match(input,RULE_ID,FOLLOW_91); 

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
            	    break loop89;
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
    // InternalAnsibleDsl.g:6266:1: entryRuleEVariableDeclaration returns [EObject current=null] : iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF ;
    public final EObject entryRuleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclaration = null;


        try {
            // InternalAnsibleDsl.g:6266:61: (iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF )
            // InternalAnsibleDsl.g:6267:2: iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF
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
    // InternalAnsibleDsl.g:6273:1: ruleEVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6279:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:6280:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:6280:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:6281:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:6281:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6282:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6282:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6283:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_66); 

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

            otherlv_1=(Token)match(input,72,FOLLOW_111); 

            			newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:6303:3: ( (lv_value_passed_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6304:4: (lv_value_passed_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6304:4: (lv_value_passed_2_0= ruleEValue )
            // InternalAnsibleDsl.g:6305:5: lv_value_passed_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:6326:1: entryRuleERegisterVariable returns [EObject current=null] : iv_ruleERegisterVariable= ruleERegisterVariable EOF ;
    public final EObject entryRuleERegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariable = null;


        try {
            // InternalAnsibleDsl.g:6326:58: (iv_ruleERegisterVariable= ruleERegisterVariable EOF )
            // InternalAnsibleDsl.g:6327:2: iv_ruleERegisterVariable= ruleERegisterVariable EOF
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
    // InternalAnsibleDsl.g:6333:1: ruleERegisterVariable returns [EObject current=null] : (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleERegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6339:2: ( (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:6340:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:6340:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6341:3: otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,148,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableAccess().getRegisterKeyword_0());
            		
            // InternalAnsibleDsl.g:6345:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6346:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6346:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:6347:5: lv_name_1_0= RULE_ID
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
    // InternalAnsibleDsl.g:6367:1: entryRuleEInputVariableReference returns [EObject current=null] : iv_ruleEInputVariableReference= ruleEInputVariableReference EOF ;
    public final EObject entryRuleEInputVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6367:64: (iv_ruleEInputVariableReference= ruleEInputVariableReference EOF )
            // InternalAnsibleDsl.g:6368:2: iv_ruleEInputVariableReference= ruleEInputVariableReference EOF
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
    // InternalAnsibleDsl.g:6374:1: ruleEInputVariableReference returns [EObject current=null] : (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* ) ;
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
            // InternalAnsibleDsl.g:6380:2: ( (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:6381:2: (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:6381:2: (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:6382:3: otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )? (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,149,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEInputVariableReferenceAccess().getInterface_inputKeyword_0());
            		
            // InternalAnsibleDsl.g:6386:3: ( (otherlv_1= RULE_STRING ) )
            // InternalAnsibleDsl.g:6387:4: (otherlv_1= RULE_STRING )
            {
            // InternalAnsibleDsl.g:6387:4: (otherlv_1= RULE_STRING )
            // InternalAnsibleDsl.g:6388:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInputVariableReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_110); 

            					newLeafNode(otherlv_1, grammarAccess.getEInputVariableReferenceAccess().getNameEParameterDefinitionCrossReference_1_0());
            				

            }


            }

            // InternalAnsibleDsl.g:6399:3: (otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==145) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalAnsibleDsl.g:6400:4: otherlv_2= '[' ( (lv_index_3_0= RULE_NUMBER ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,145,FOLLOW_76); 

                    				newLeafNode(otherlv_2, grammarAccess.getEInputVariableReferenceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:6404:4: ( (lv_index_3_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6405:5: (lv_index_3_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6405:5: (lv_index_3_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6406:6: lv_index_3_0= RULE_NUMBER
                    {
                    lv_index_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_109); 

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

                    otherlv_4=(Token)match(input,146,FOLLOW_91); 

                    				newLeafNode(otherlv_4, grammarAccess.getEInputVariableReferenceAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:6427:3: (otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==117) ) {
                    int LA91_2 = input.LA(2);

                    if ( (LA91_2==RULE_ID) ) {
                        int LA91_3 = input.LA(3);

                        if ( (LA91_3==EOF||LA91_3==19||(LA91_3>=37 && LA91_3<=39)||(LA91_3>=83 && LA91_3<=85)||(LA91_3>=101 && LA91_3<=103)||(LA91_3>=105 && LA91_3<=106)||LA91_3==117||LA91_3==119||(LA91_3>=121 && LA91_3<=141)||(LA91_3>=143 && LA91_3<=144)) ) {
                            alt91=1;
                        }


                    }


                }


                switch (alt91) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6428:4: otherlv_5= '.' ( (lv_tail_6_0= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,117,FOLLOW_20); 

            	    				newLeafNode(otherlv_5, grammarAccess.getEInputVariableReferenceAccess().getFullStopKeyword_3_0());
            	    			
            	    // InternalAnsibleDsl.g:6432:4: ( (lv_tail_6_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:6433:5: (lv_tail_6_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:6433:5: (lv_tail_6_0= RULE_ID )
            	    // InternalAnsibleDsl.g:6434:6: lv_tail_6_0= RULE_ID
            	    {
            	    lv_tail_6_0=(Token)match(input,RULE_ID,FOLLOW_91); 

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
            	    break loop91;
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
    // InternalAnsibleDsl.g:6455:1: entryRuleEVariableReference returns [EObject current=null] : iv_ruleEVariableReference= ruleEVariableReference EOF ;
    public final EObject entryRuleEVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6455:59: (iv_ruleEVariableReference= ruleEVariableReference EOF )
            // InternalAnsibleDsl.g:6456:2: iv_ruleEVariableReference= ruleEVariableReference EOF
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
    // InternalAnsibleDsl.g:6462:1: ruleEVariableReference returns [EObject current=null] : (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputVariableReference_2= ruleEInputVariableReference ) ;
    public final EObject ruleEVariableReference() throws RecognitionException {
        EObject current = null;

        EObject this_EVariableDeclarationVariableReference_0 = null;

        EObject this_ERegisterVariableReference_1 = null;

        EObject this_EInputVariableReference_2 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6468:2: ( (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputVariableReference_2= ruleEInputVariableReference ) )
            // InternalAnsibleDsl.g:6469:2: (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputVariableReference_2= ruleEInputVariableReference )
            {
            // InternalAnsibleDsl.g:6469:2: (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputVariableReference_2= ruleEInputVariableReference )
            int alt92=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt92=1;
                }
                break;
            case 147:
                {
                alt92=2;
                }
                break;
            case 149:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalAnsibleDsl.g:6470:3: this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference
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
                    // InternalAnsibleDsl.g:6479:3: this_ERegisterVariableReference_1= ruleERegisterVariableReference
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
                    // InternalAnsibleDsl.g:6488:3: this_EInputVariableReference_2= ruleEInputVariableReference
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
    // InternalAnsibleDsl.g:6500:1: entryRuleEFactGathered returns [EObject current=null] : iv_ruleEFactGathered= ruleEFactGathered EOF ;
    public final EObject entryRuleEFactGathered() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactGathered = null;


        try {
            // InternalAnsibleDsl.g:6500:54: (iv_ruleEFactGathered= ruleEFactGathered EOF )
            // InternalAnsibleDsl.g:6501:2: iv_ruleEFactGathered= ruleEFactGathered EOF
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
    // InternalAnsibleDsl.g:6507:1: ruleEFactGathered returns [EObject current=null] : ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleEFactGathered() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_tail_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6513:2: ( ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* ) )
            // InternalAnsibleDsl.g:6514:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            {
            // InternalAnsibleDsl.g:6514:2: ( () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )* )
            // InternalAnsibleDsl.g:6515:3: () otherlv_1= 'ansible_facts' (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            {
            // InternalAnsibleDsl.g:6515:3: ()
            // InternalAnsibleDsl.g:6516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEFactGatheredAccess().getEFactGatheredAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,150,FOLLOW_91); 

            			newLeafNode(otherlv_1, grammarAccess.getEFactGatheredAccess().getAnsible_factsKeyword_1());
            		
            // InternalAnsibleDsl.g:6526:3: (otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==117) ) {
                    int LA93_2 = input.LA(2);

                    if ( (LA93_2==RULE_ID) ) {
                        int LA93_3 = input.LA(3);

                        if ( (LA93_3==EOF||LA93_3==19||(LA93_3>=37 && LA93_3<=39)||(LA93_3>=83 && LA93_3<=85)||(LA93_3>=101 && LA93_3<=103)||(LA93_3>=105 && LA93_3<=106)||LA93_3==117||LA93_3==119||(LA93_3>=121 && LA93_3<=141)||(LA93_3>=143 && LA93_3<=144)) ) {
                            alt93=1;
                        }


                    }


                }


                switch (alt93) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6527:4: otherlv_2= '.' ( (lv_tail_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,117,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEFactGatheredAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6531:4: ( (lv_tail_3_0= RULE_ID ) )
            	    // InternalAnsibleDsl.g:6532:5: (lv_tail_3_0= RULE_ID )
            	    {
            	    // InternalAnsibleDsl.g:6532:5: (lv_tail_3_0= RULE_ID )
            	    // InternalAnsibleDsl.g:6533:6: lv_tail_3_0= RULE_ID
            	    {
            	    lv_tail_3_0=(Token)match(input,RULE_ID,FOLLOW_91); 

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
            	    break loop93;
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
    // InternalAnsibleDsl.g:6554:1: entryRuleEDictionary returns [EObject current=null] : iv_ruleEDictionary= ruleEDictionary EOF ;
    public final EObject entryRuleEDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionary = null;


        try {
            // InternalAnsibleDsl.g:6554:52: (iv_ruleEDictionary= ruleEDictionary EOF )
            // InternalAnsibleDsl.g:6555:2: iv_ruleEDictionary= ruleEDictionary EOF
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
    // InternalAnsibleDsl.g:6561:1: ruleEDictionary returns [EObject current=null] : (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dictionary_pairs_1_0 = null;

        EObject lv_dictionary_pairs_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6567:2: ( (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:6568:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:6568:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:6569:3: otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,151,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEDictionaryAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:6573:3: ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) )
            // InternalAnsibleDsl.g:6574:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            {
            // InternalAnsibleDsl.g:6574:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            // InternalAnsibleDsl.g:6575:5: lv_dictionary_pairs_1_0= ruleEDictionaryPair
            {

            					newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_112);
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

            // InternalAnsibleDsl.g:6592:3: (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==121) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6593:4: otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    {
            	    otherlv_2=(Token)match(input,121,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEDictionaryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6597:4: ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    // InternalAnsibleDsl.g:6598:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    {
            	    // InternalAnsibleDsl.g:6598:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    // InternalAnsibleDsl.g:6599:6: lv_dictionary_pairs_3_0= ruleEDictionaryPair
            	    {

            	    						newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_112);
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
            	    break loop94;
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
    // InternalAnsibleDsl.g:6625:1: entryRuleEDictionaryPair returns [EObject current=null] : iv_ruleEDictionaryPair= ruleEDictionaryPair EOF ;
    public final EObject entryRuleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPair = null;


        try {
            // InternalAnsibleDsl.g:6625:56: (iv_ruleEDictionaryPair= ruleEDictionaryPair EOF )
            // InternalAnsibleDsl.g:6626:2: iv_ruleEDictionaryPair= ruleEDictionaryPair EOF
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
    // InternalAnsibleDsl.g:6632:1: ruleEDictionaryPair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) ;
    public final EObject ruleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6638:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) ) )
            // InternalAnsibleDsl.g:6639:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            {
            // InternalAnsibleDsl.g:6639:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) ) )
            // InternalAnsibleDsl.g:6640:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValue ) )
            {
            // InternalAnsibleDsl.g:6640:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6641:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6641:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6642:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_66); 

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

            otherlv_1=(Token)match(input,72,FOLLOW_111); 

            			newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:6662:3: ( (lv_value_2_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6663:4: (lv_value_2_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6663:4: (lv_value_2_0= ruleEValue )
            // InternalAnsibleDsl.g:6664:5: lv_value_2_0= ruleEValue
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
    // InternalAnsibleDsl.g:6685:1: entryRuleEList returns [EObject current=null] : iv_ruleEList= ruleEList EOF ;
    public final EObject entryRuleEList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEList = null;


        try {
            // InternalAnsibleDsl.g:6685:46: (iv_ruleEList= ruleEList EOF )
            // InternalAnsibleDsl.g:6686:2: iv_ruleEList= ruleEList EOF
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
    // InternalAnsibleDsl.g:6692:1: ruleEList returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6698:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' ) )
            // InternalAnsibleDsl.g:6699:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            {
            // InternalAnsibleDsl.g:6699:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']' )
            // InternalAnsibleDsl.g:6700:3: otherlv_0= '[' ( (lv_elements_1_0= ruleEValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,145,FOLLOW_111); 

            			newLeafNode(otherlv_0, grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:6704:3: ( (lv_elements_1_0= ruleEValue ) )
            // InternalAnsibleDsl.g:6705:4: (lv_elements_1_0= ruleEValue )
            {
            // InternalAnsibleDsl.g:6705:4: (lv_elements_1_0= ruleEValue )
            // InternalAnsibleDsl.g:6706:5: lv_elements_1_0= ruleEValue
            {

            					newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_113);
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

            // InternalAnsibleDsl.g:6723:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==121) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6724:4: otherlv_2= ',' ( (lv_elements_3_0= ruleEValue ) )
            	    {
            	    otherlv_2=(Token)match(input,121,FOLLOW_111); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6728:4: ( (lv_elements_3_0= ruleEValue ) )
            	    // InternalAnsibleDsl.g:6729:5: (lv_elements_3_0= ruleEValue )
            	    {
            	    // InternalAnsibleDsl.g:6729:5: (lv_elements_3_0= ruleEValue )
            	    // InternalAnsibleDsl.g:6730:6: lv_elements_3_0= ruleEValue
            	    {

            	    						newCompositeNode(grammarAccess.getEListAccess().getElementsEValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_113);
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
            	    break loop95;
                }
            } while (true);

            otherlv_4=(Token)match(input,146,FOLLOW_2); 

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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\23\13\uffff";
    static final String dfa_4s = "\1\44\13\uffff";
    static final String dfa_5s = "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String dfa_6s = "\1\0\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\1\2\1\3\1\4\1\5\1\6\5\uffff\1\7\1\10\1\11\1\12\1\13",
            "",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 356:5: ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_0 = input.LA(1);

                         
                        int index8_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_0==EOF||LA8_0==19) ) {s = 1;}

                        else if ( LA8_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA8_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA8_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA8_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA8_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA8_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA8_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA8_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA8_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA8_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 9) ) {s = 11;}

                         
                        input.seek(index8_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\1\11\uffff";
    static final String dfa_10s = "\1\23\11\uffff";
    static final String dfa_11s = "\1\u0094\11\uffff";
    static final String dfa_12s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_13s = "\1\0\11\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\24\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\145\uffff\1\11",
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

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()+ loopback of 924:5: ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionary ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0==EOF||LA11_0==19) ) {s = 1;}

                        else if ( LA11_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA11_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA11_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA11_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA11_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA11_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA11_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA11_0 == 148 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 7) ) {s = 9;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_15s = "\15\uffff";
    static final String dfa_16s = "\1\1\14\uffff";
    static final String dfa_17s = "\1\23\14\uffff";
    static final String dfa_18s = "\1\113\14\uffff";
    static final String dfa_19s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_20s = "\1\0\14\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\24\uffff\1\3\6\uffff\1\2\2\uffff\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14\21\uffff\1\11",
            "",
            "",
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

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()+ loopback of 1237:5: ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEList ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_0==EOF||LA18_0==19) ) {s = 1;}

                        else if ( LA18_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA18_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA18_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA18_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA18_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA18_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA18_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA18_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA18_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA18_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA18_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 10) ) {s = 12;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x03FC810000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L,0x0000000007C00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001F07C00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L,0x0000000018000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000080000L,0x0000001800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L,0x0001800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000001F0L,0x0110000000000000L,0x0000000000EA4000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080000L,0x000006E000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00007F0000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000080000L,0x0006000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L,0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00007F0000000012L,0x0008000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000281000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x03FF810000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001F07C80000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x03FE810000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000080000L,0x0000001F00000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x03FC810000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000080000L,0x000001E000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000080000L,0x0000780000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000080000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000008L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x3801010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x3001010000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x3000010000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000000E000080000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x2000010000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000080000L,0x000000E000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xC000000000080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8000000000080000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1001000000080000L,0x0000000000000006L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1001000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000004L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00007F0000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x1001000000080000L,0x0000000000000034L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x1001000000080000L,0x0000000000000024L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1000000000080000L,0x0000000000000024L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000024L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000020L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00000000000001B0L,0x0040000000000000L,0x0000000000820000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x1001000000080000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x1000000000080000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000080000L,0x000000000007C000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x000000000007C000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000000380000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000002L,0x0000000000280000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000007C00000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x00000000E0000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000001F00000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000001800000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x000000E000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x000001E000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x000006E000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x0000780000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0001800000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0006000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000012L,0x0040000000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x00000000000001F0L,0x0110000000000000L,0x0000000000EA0000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x0820000000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x00000000000001F0L,0x0010000000000000L,0x0000000000EA0000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000002L,0xC000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000007F0L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x00000000000001F0L,0x0110000000000000L,0x0000000000EA1000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x00000000000001B0L,0x0000000000000000L,0x0000000000820000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000080000L,0x0200000000000000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L,0x0000000000040000L});

}
