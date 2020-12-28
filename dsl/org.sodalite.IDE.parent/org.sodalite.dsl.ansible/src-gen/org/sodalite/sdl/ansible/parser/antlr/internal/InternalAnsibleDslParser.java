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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_BOOLEAN", "RULE_NULL", "RULE_NUMBER", "RULE_NONE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'playbook{'", "'playbook_name:'", "'used_by{'", "'node_type:'", "'operation:'", "'}'", "'plays{'", "'play{'", "'privilage_escalation{'", "'validation_mode{'", "'connection_info{'", "'no_log:'", "'debugger:'", "'always'", "'never'", "'on_failed'", "'on_unreachable'", "'on_skipped'", "'module_defaults:'", "'environment:'", "'collections:'", "'tags:'", "'vars{'", "'exe_settings{'", "'delegation{'", "'when:'", "'error_handling{'", "'action:'", "'asynchronous_settings{'", "'args:'", "'module_call{'", "'notify:'", "'loop{'", "'play_name:'", "'base_attributes{'", "'play_exe_settings{'", "'facts_settings{'", "'vars_files:'", "'vars_prompt:'", "'force_handlers:'", "'pre_tasks{'", "'tasks_list{'", "'post_tasks{'", "'handlers{'", "'block{'", "'block_name:'", "'execution_attributes{'", "'tasks{'", "'rescue_tasks{'", "'always_tasks{'", "'task{'", "'task_name:'", "'task_handler_attributes{'", "'handler{'", "'handler_name:'", "'listen:'", "'module_name:'", "'direct_parameter:'", "'parameters{'", "':'", "'role{'", "'role_name:'", "'roles_inclusions{'", "'loop_over:'", "'loop_control{'", "'label:'", "'pause:'", "'index_var:'", "'loop_var:'", "'extended:'", "'until:'", "'retries:'", "'delay:'", "'become:'", "'become_exe:'", "'become_flags:'", "'become_method:'", "'become_user:'", "'check_mode:'", "'diff:'", "'connection:'", "'port:'", "'remote_user:'", "'strategy:'", "'serial:'", "'order:'", "'throttle:'", "'run_once:'", "'any_errors_fatal:'", "'ignore_errors:'", "'ignore_unreachable:'", "'max_fail_percentage:'", "'changed_when:'", "'failed_when:'", "'gather_facts:'", "'gather_subset:'", "'gather_timeout:'", "'fact_path:'", "'delegate_to:'", "'delegate_facts:'", "'async:'", "'poll:'", "'topic:'", "'item'", "'{{'", "'}}'", "'('", "','", "')'", "'()'", "'|'", "'or'", "'and'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'/'", "'//'", "'%'", "'*'", "'**'", "'is'", "'not'", "'in'", "'['", "']'", "'.'", "'return'", "'if'", "'else'", "'declared_variable:'", "'registered_variable:'", "'index_or_loop_var:'", "'register:'", "'operation_input:'", "'interface_input:'", "'special_variable:'", "'{'"
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
    public static final int RULE_ID=5;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=10;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
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
    public static final int T__155=155;
    public static final int T__154=154;
    public static final int T__157=157;
    public static final int T__156=156;
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
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
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
    public static final int RULE_NONE=9;
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
    public static final int RULE_NULL=7;
    public static final int RULE_SL_COMMENT=12;
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
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_NUMBER=8;
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
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEPlaybookAccess().getPlaybookKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

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

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAnsibleDsl.g:131:4: otherlv_3= 'used_by{' otherlv_4= 'node_type:' ( (otherlv_5= RULE_STRING ) ) otherlv_6= 'operation:' ( (otherlv_7= RULE_STRING ) ) otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPlaybookAccess().getUsed_byKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_4); 

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

                    otherlv_6=(Token)match(input,19,FOLLOW_4); 

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

                    otherlv_8=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_3_5());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getEPlaybookAccess().getPlaysKeyword_4());
            		
            // InternalAnsibleDsl.g:178:3: (otherlv_10= 'play{' ( (lv_plays_11_0= ruleEPlay ) ) otherlv_12= '}' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAnsibleDsl.g:179:4: otherlv_10= 'play{' ( (lv_plays_11_0= ruleEPlay ) ) otherlv_12= '}'
            	    {
            	    otherlv_10=(Token)match(input,22,FOLLOW_11); 

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

            	    otherlv_12=(Token)match(input,20,FOLLOW_12); 

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

            otherlv_13=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_13, grammarAccess.getEPlaybookAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_14=(Token)match(input,20,FOLLOW_2); 

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
            case 59:
                {
                alt3=1;
                }
                break;
            case 65:
            case 68:
                {
                alt3=2;
                }
                break;
            case 75:
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

            if ( (LA4_0==59) ) {
                alt4=1;
            }
            else if ( (LA4_0==65) ) {
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

            if ( (LA5_0==65) ) {
                alt5=1;
            }
            else if ( (LA5_0==68) ) {
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
    // InternalAnsibleDsl.g:343:1: ruleEBaseAttributes returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) ) ) ;
    public final EObject ruleEBaseAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
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

        EObject lv_no_log_11_0 = null;

        EObject lv_module_defaults_15_0 = null;

        EObject lv_environment_17_0 = null;

        EObject lv_collections_19_0 = null;

        EObject lv_tags_21_0 = null;

        EObject lv_variable_declarations_23_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:349:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:350:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:350:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:351:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:351:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:352:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:355:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )* )
            // InternalAnsibleDsl.g:356:5: ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:356:5: ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )*
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
            	    otherlv_1=(Token)match(input,23,FOLLOW_13); 

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

            	    otherlv_3=(Token)match(input,20,FOLLOW_14); 

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
            	    otherlv_4=(Token)match(input,24,FOLLOW_15); 

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

            	    otherlv_6=(Token)match(input,20,FOLLOW_14); 

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
            	    otherlv_7=(Token)match(input,25,FOLLOW_16); 

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

            	    otherlv_9=(Token)match(input,20,FOLLOW_14); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEBaseAttributesAccess().getRightCurlyBracketKeyword_2_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:471:3: ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:471:3: ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:472:4: {...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:472:109: ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:473:5: ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:476:8: ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:476:9: {...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:476:18: (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:476:19: otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_10=(Token)match(input,26,FOLLOW_17); 

            	    								newLeafNode(otherlv_10, grammarAccess.getEBaseAttributesAccess().getNo_logKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:480:8: ( (lv_no_log_11_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:481:9: (lv_no_log_11_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:481:9: (lv_no_log_11_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:482:10: lv_no_log_11_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getNo_logEBooleanPassedParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_no_log_11_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"no_log",
            	    											lv_no_log_11_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
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
            	case 5 :
            	    // InternalAnsibleDsl.g:505:3: ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:505:3: ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:506:4: {...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:506:109: ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:507:5: ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:510:8: ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) )
            	    // InternalAnsibleDsl.g:510:9: {...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:510:18: (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) )
            	    // InternalAnsibleDsl.g:510:19: otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) )
            	    {
            	    otherlv_12=(Token)match(input,27,FOLLOW_18); 

            	    								newLeafNode(otherlv_12, grammarAccess.getEBaseAttributesAccess().getDebuggerKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:514:8: ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) )
            	    // InternalAnsibleDsl.g:515:9: ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) )
            	    {
            	    // InternalAnsibleDsl.g:515:9: ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) )
            	    // InternalAnsibleDsl.g:516:10: (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' )
            	    {
            	    // InternalAnsibleDsl.g:516:10: (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' )
            	    int alt6=5;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    case 32:
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
            	            // InternalAnsibleDsl.g:517:11: lv_debugger_13_1= 'always'
            	            {
            	            lv_debugger_13_1=(Token)match(input,28,FOLLOW_14); 

            	            											newLeafNode(lv_debugger_13_1, grammarAccess.getEBaseAttributesAccess().getDebuggerAlwaysKeyword_4_1_0_0());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getEBaseAttributesRule());
            	            											}
            	            											setWithLastConsumed(current, "debugger", lv_debugger_13_1, null);
            	            										

            	            }
            	            break;
            	        case 2 :
            	            // InternalAnsibleDsl.g:528:11: lv_debugger_13_2= 'never'
            	            {
            	            lv_debugger_13_2=(Token)match(input,29,FOLLOW_14); 

            	            											newLeafNode(lv_debugger_13_2, grammarAccess.getEBaseAttributesAccess().getDebuggerNeverKeyword_4_1_0_1());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getEBaseAttributesRule());
            	            											}
            	            											setWithLastConsumed(current, "debugger", lv_debugger_13_2, null);
            	            										

            	            }
            	            break;
            	        case 3 :
            	            // InternalAnsibleDsl.g:539:11: lv_debugger_13_3= 'on_failed'
            	            {
            	            lv_debugger_13_3=(Token)match(input,30,FOLLOW_14); 

            	            											newLeafNode(lv_debugger_13_3, grammarAccess.getEBaseAttributesAccess().getDebuggerOn_failedKeyword_4_1_0_2());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getEBaseAttributesRule());
            	            											}
            	            											setWithLastConsumed(current, "debugger", lv_debugger_13_3, null);
            	            										

            	            }
            	            break;
            	        case 4 :
            	            // InternalAnsibleDsl.g:550:11: lv_debugger_13_4= 'on_unreachable'
            	            {
            	            lv_debugger_13_4=(Token)match(input,31,FOLLOW_14); 

            	            											newLeafNode(lv_debugger_13_4, grammarAccess.getEBaseAttributesAccess().getDebuggerOn_unreachableKeyword_4_1_0_3());
            	            										

            	            											if (current==null) {
            	            												current = createModelElement(grammarAccess.getEBaseAttributesRule());
            	            											}
            	            											setWithLastConsumed(current, "debugger", lv_debugger_13_4, null);
            	            										

            	            }
            	            break;
            	        case 5 :
            	            // InternalAnsibleDsl.g:561:11: lv_debugger_13_5= 'on_skipped'
            	            {
            	            lv_debugger_13_5=(Token)match(input,32,FOLLOW_14); 

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
            	    // InternalAnsibleDsl.g:580:3: ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:580:3: ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:581:4: {...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:581:109: ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:582:5: ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:585:8: ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) )
            	    // InternalAnsibleDsl.g:585:9: {...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:585:18: (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) )
            	    // InternalAnsibleDsl.g:585:19: otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) )
            	    {
            	    otherlv_14=(Token)match(input,33,FOLLOW_19); 

            	    								newLeafNode(otherlv_14, grammarAccess.getEBaseAttributesAccess().getModule_defaultsKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:589:8: ( (lv_module_defaults_15_0= ruleEListPassed ) )
            	    // InternalAnsibleDsl.g:590:9: (lv_module_defaults_15_0= ruleEListPassed )
            	    {
            	    // InternalAnsibleDsl.g:590:9: (lv_module_defaults_15_0= ruleEListPassed )
            	    // InternalAnsibleDsl.g:591:10: lv_module_defaults_15_0= ruleEListPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getModule_defaultsEListPassedParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_module_defaults_15_0=ruleEListPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"module_defaults",
            	    											lv_module_defaults_15_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EListPassed");
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
            	    // InternalAnsibleDsl.g:614:3: ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:614:3: ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:615:4: {...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:615:109: ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:616:5: ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:619:8: ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) )
            	    // InternalAnsibleDsl.g:619:9: {...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:619:18: (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) )
            	    // InternalAnsibleDsl.g:619:19: otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) )
            	    {
            	    otherlv_16=(Token)match(input,34,FOLLOW_19); 

            	    								newLeafNode(otherlv_16, grammarAccess.getEBaseAttributesAccess().getEnvironmentKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:623:8: ( (lv_environment_17_0= ruleEListPassed ) )
            	    // InternalAnsibleDsl.g:624:9: (lv_environment_17_0= ruleEListPassed )
            	    {
            	    // InternalAnsibleDsl.g:624:9: (lv_environment_17_0= ruleEListPassed )
            	    // InternalAnsibleDsl.g:625:10: lv_environment_17_0= ruleEListPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getEnvironmentEListPassedParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_environment_17_0=ruleEListPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"environment",
            	    											lv_environment_17_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EListPassed");
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
            	    // InternalAnsibleDsl.g:648:3: ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:648:3: ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:649:4: {...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:649:109: ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:650:5: ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:653:8: ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) )
            	    // InternalAnsibleDsl.g:653:9: {...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:653:18: (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) )
            	    // InternalAnsibleDsl.g:653:19: otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) )
            	    {
            	    otherlv_18=(Token)match(input,35,FOLLOW_19); 

            	    								newLeafNode(otherlv_18, grammarAccess.getEBaseAttributesAccess().getCollectionsKeyword_7_0());
            	    							
            	    // InternalAnsibleDsl.g:657:8: ( (lv_collections_19_0= ruleEListPassed ) )
            	    // InternalAnsibleDsl.g:658:9: (lv_collections_19_0= ruleEListPassed )
            	    {
            	    // InternalAnsibleDsl.g:658:9: (lv_collections_19_0= ruleEListPassed )
            	    // InternalAnsibleDsl.g:659:10: lv_collections_19_0= ruleEListPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getCollectionsEListPassedParserRuleCall_7_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_collections_19_0=ruleEListPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"collections",
            	    											lv_collections_19_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EListPassed");
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
            	    // InternalAnsibleDsl.g:682:3: ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:682:3: ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:683:4: {...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAnsibleDsl.g:683:109: ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:684:5: ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAnsibleDsl.g:687:8: ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) )
            	    // InternalAnsibleDsl.g:687:9: {...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:687:18: (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) )
            	    // InternalAnsibleDsl.g:687:19: otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) )
            	    {
            	    otherlv_20=(Token)match(input,36,FOLLOW_19); 

            	    								newLeafNode(otherlv_20, grammarAccess.getEBaseAttributesAccess().getTagsKeyword_8_0());
            	    							
            	    // InternalAnsibleDsl.g:691:8: ( (lv_tags_21_0= ruleEListPassed ) )
            	    // InternalAnsibleDsl.g:692:9: (lv_tags_21_0= ruleEListPassed )
            	    {
            	    // InternalAnsibleDsl.g:692:9: (lv_tags_21_0= ruleEListPassed )
            	    // InternalAnsibleDsl.g:693:10: lv_tags_21_0= ruleEListPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEBaseAttributesAccess().getTagsEListPassedParserRuleCall_8_1_0());
            	    									
            	    pushFollow(FOLLOW_14);
            	    lv_tags_21_0=ruleEListPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBaseAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"tags",
            	    											lv_tags_21_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EListPassed");
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
            	    // InternalAnsibleDsl.g:716:3: ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:716:3: ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:717:4: {...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalAnsibleDsl.g:717:109: ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) )
            	    // InternalAnsibleDsl.g:718:5: ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalAnsibleDsl.g:721:8: ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) )
            	    // InternalAnsibleDsl.g:721:9: {...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBaseAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:721:18: (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' )
            	    // InternalAnsibleDsl.g:721:19: otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}'
            	    {
            	    otherlv_22=(Token)match(input,37,FOLLOW_20); 

            	    								newLeafNode(otherlv_22, grammarAccess.getEBaseAttributesAccess().getVarsKeyword_9_0());
            	    							
            	    // InternalAnsibleDsl.g:725:8: ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+
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
            	    	    // InternalAnsibleDsl.g:726:9: (lv_variable_declarations_23_0= ruleEVariableDeclaration )
            	    	    {
            	    	    // InternalAnsibleDsl.g:726:9: (lv_variable_declarations_23_0= ruleEVariableDeclaration )
            	    	    // InternalAnsibleDsl.g:727:10: lv_variable_declarations_23_0= ruleEVariableDeclaration
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

            	    otherlv_24=(Token)match(input,20,FOLLOW_14); 

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
    // InternalAnsibleDsl.g:764:1: entryRuleEExecutionAttributes returns [EObject current=null] : iv_ruleEExecutionAttributes= ruleEExecutionAttributes EOF ;
    public final EObject entryRuleEExecutionAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionAttributes = null;


        try {
            // InternalAnsibleDsl.g:764:61: (iv_ruleEExecutionAttributes= ruleEExecutionAttributes EOF )
            // InternalAnsibleDsl.g:765:2: iv_ruleEExecutionAttributes= ruleEExecutionAttributes EOF
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
    // InternalAnsibleDsl.g:771:1: ruleEExecutionAttributes returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) ) ) ;
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
            // InternalAnsibleDsl.g:777:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:778:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:778:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:779:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:779:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:780:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:783:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:784:5: ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:784:5: ( ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) )*
            loop9:
            do {
                int alt9=4;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 2) ) {
                    alt9=3;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAnsibleDsl.g:785:3: ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:785:3: ({...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:786:4: {...}? => ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:786:114: ( ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) ) )
            	    // InternalAnsibleDsl.g:787:5: ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:790:8: ({...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' ) )
            	    // InternalAnsibleDsl.g:790:9: {...}? => (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:790:18: (otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}' )
            	    // InternalAnsibleDsl.g:790:19: otherlv_1= 'exe_settings{' ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) ) otherlv_3= '}'
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_22); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEExecutionAttributesAccess().getExe_settingsKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:794:8: ( (lv_exe_settings_2_0= ruleEExecutionExeSettings ) )
            	    // InternalAnsibleDsl.g:795:9: (lv_exe_settings_2_0= ruleEExecutionExeSettings )
            	    {
            	    // InternalAnsibleDsl.g:795:9: (lv_exe_settings_2_0= ruleEExecutionExeSettings )
            	    // InternalAnsibleDsl.g:796:10: lv_exe_settings_2_0= ruleEExecutionExeSettings
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

            	    otherlv_3=(Token)match(input,20,FOLLOW_23); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEExecutionAttributesAccess().getRightCurlyBracketKeyword_0_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:823:3: ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:823:3: ({...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:824:4: {...}? => ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:824:114: ( ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) ) )
            	    // InternalAnsibleDsl.g:825:5: ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:828:8: ({...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' ) )
            	    // InternalAnsibleDsl.g:828:9: {...}? => (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:828:18: (otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}' )
            	    // InternalAnsibleDsl.g:828:19: otherlv_4= 'delegation{' ( (lv_delegation_5_0= ruleEDelegation ) ) otherlv_6= '}'
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_24); 

            	    								newLeafNode(otherlv_4, grammarAccess.getEExecutionAttributesAccess().getDelegationKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:832:8: ( (lv_delegation_5_0= ruleEDelegation ) )
            	    // InternalAnsibleDsl.g:833:9: (lv_delegation_5_0= ruleEDelegation )
            	    {
            	    // InternalAnsibleDsl.g:833:9: (lv_delegation_5_0= ruleEDelegation )
            	    // InternalAnsibleDsl.g:834:10: lv_delegation_5_0= ruleEDelegation
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

            	    otherlv_6=(Token)match(input,20,FOLLOW_23); 

            	    								newLeafNode(otherlv_6, grammarAccess.getEExecutionAttributesAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:861:3: ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:861:3: ({...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:862:4: {...}? => ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:862:114: ( ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    // InternalAnsibleDsl.g:863:5: ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExecutionAttributesAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:866:8: ({...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    // InternalAnsibleDsl.g:866:9: {...}? => (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:866:18: (otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    // InternalAnsibleDsl.g:866:19: otherlv_7= 'when:' ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    {
            	    otherlv_7=(Token)match(input,40,FOLLOW_25); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEExecutionAttributesAccess().getWhenKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:870:8: ( (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    // InternalAnsibleDsl.g:871:9: (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    {
            	    // InternalAnsibleDsl.g:871:9: (lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    // InternalAnsibleDsl.g:872:10: lv_when_expression_8_0= ruleEJinjaExpressionEvaluationWithoutBrackets
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
    // InternalAnsibleDsl.g:905:1: entryRuleETaskHandlerAttributes returns [EObject current=null] : iv_ruleETaskHandlerAttributes= ruleETaskHandlerAttributes EOF ;
    public final EObject entryRuleETaskHandlerAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerAttributes = null;


        try {
            // InternalAnsibleDsl.g:905:63: (iv_ruleETaskHandlerAttributes= ruleETaskHandlerAttributes EOF )
            // InternalAnsibleDsl.g:906:2: iv_ruleETaskHandlerAttributes= ruleETaskHandlerAttributes EOF
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
    // InternalAnsibleDsl.g:912:1: ruleETaskHandlerAttributes returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleETaskHandlerAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_error_handling_2_0 = null;

        EObject lv_action_5_0 = null;

        EObject lv_asynchronous_settings_7_0 = null;

        EObject lv_args_10_0 = null;

        EObject lv_module_12_0 = null;

        EObject lv_notifiables_15_0 = null;

        EObject lv_loop_17_0 = null;

        EObject lv_register_19_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:918:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:919:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:919:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:920:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:920:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:921:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:924:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:925:5: ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:925:5: ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=9;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // InternalAnsibleDsl.g:926:3: ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:926:3: ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:927:4: {...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:927:116: ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) )
            	    // InternalAnsibleDsl.g:928:5: ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:931:8: ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) )
            	    // InternalAnsibleDsl.g:931:9: {...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:931:18: (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' )
            	    // InternalAnsibleDsl.g:931:19: otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}'
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_26); 

            	    								newLeafNode(otherlv_1, grammarAccess.getETaskHandlerAttributesAccess().getError_handlingKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:935:8: ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) )
            	    // InternalAnsibleDsl.g:936:9: (lv_error_handling_2_0= ruleETaskHandlerErrorHandling )
            	    {
            	    // InternalAnsibleDsl.g:936:9: (lv_error_handling_2_0= ruleETaskHandlerErrorHandling )
            	    // InternalAnsibleDsl.g:937:10: lv_error_handling_2_0= ruleETaskHandlerErrorHandling
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

            	    otherlv_3=(Token)match(input,20,FOLLOW_27); 

            	    								newLeafNode(otherlv_3, grammarAccess.getETaskHandlerAttributesAccess().getRightCurlyBracketKeyword_0_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:964:3: ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:964:3: ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:965:4: {...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:965:116: ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:966:5: ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:969:8: ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:969:9: {...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:969:18: (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:969:19: otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_4=(Token)match(input,42,FOLLOW_28); 

            	    								newLeafNode(otherlv_4, grammarAccess.getETaskHandlerAttributesAccess().getActionKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:973:8: ( (lv_action_5_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:974:9: (lv_action_5_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:974:9: (lv_action_5_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:975:10: lv_action_5_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerAttributesAccess().getActionEJinjaExpressionAndStringParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_27);
            	    lv_action_5_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETaskHandlerAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"action",
            	    											lv_action_5_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
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
            	case 3 :
            	    // InternalAnsibleDsl.g:998:3: ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:998:3: ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:999:4: {...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:999:116: ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) )
            	    // InternalAnsibleDsl.g:1000:5: ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:1003:8: ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) )
            	    // InternalAnsibleDsl.g:1003:9: {...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1003:18: (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' )
            	    // InternalAnsibleDsl.g:1003:19: otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,43,FOLLOW_29); 

            	    								newLeafNode(otherlv_6, grammarAccess.getETaskHandlerAttributesAccess().getAsynchronous_settingsKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:1007:8: ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) )
            	    // InternalAnsibleDsl.g:1008:9: (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings )
            	    {
            	    // InternalAnsibleDsl.g:1008:9: (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings )
            	    // InternalAnsibleDsl.g:1009:10: lv_asynchronous_settings_7_0= ruleEAsynchronousSettings
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

            	    otherlv_8=(Token)match(input,20,FOLLOW_27); 

            	    								newLeafNode(otherlv_8, grammarAccess.getETaskHandlerAttributesAccess().getRightCurlyBracketKeyword_2_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:1036:3: ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1036:3: ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:1037:4: {...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:1037:116: ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:1038:5: ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:1041:8: ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) )
            	    // InternalAnsibleDsl.g:1041:9: {...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1041:18: (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) )
            	    // InternalAnsibleDsl.g:1041:19: otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) )
            	    {
            	    otherlv_9=(Token)match(input,44,FOLLOW_30); 

            	    								newLeafNode(otherlv_9, grammarAccess.getETaskHandlerAttributesAccess().getArgsKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:1045:8: ( (lv_args_10_0= ruleEDictionaryPassed ) )
            	    // InternalAnsibleDsl.g:1046:9: (lv_args_10_0= ruleEDictionaryPassed )
            	    {
            	    // InternalAnsibleDsl.g:1046:9: (lv_args_10_0= ruleEDictionaryPassed )
            	    // InternalAnsibleDsl.g:1047:10: lv_args_10_0= ruleEDictionaryPassed
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerAttributesAccess().getArgsEDictionaryPassedParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_27);
            	    lv_args_10_0=ruleEDictionaryPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETaskHandlerAttributesRule());
            	    										}
            	    										set(
            	    											current,
            	    											"args",
            	    											lv_args_10_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EDictionaryPassed");
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
            	    // InternalAnsibleDsl.g:1070:3: ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1070:3: ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1071:4: {...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:1071:116: ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) )
            	    // InternalAnsibleDsl.g:1072:5: ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:1075:8: ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) )
            	    // InternalAnsibleDsl.g:1075:9: {...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1075:18: (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' )
            	    // InternalAnsibleDsl.g:1075:19: otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}'
            	    {
            	    otherlv_11=(Token)match(input,45,FOLLOW_31); 

            	    								newLeafNode(otherlv_11, grammarAccess.getETaskHandlerAttributesAccess().getModule_callKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:1079:8: ( (lv_module_12_0= ruleEModuleCall ) )
            	    // InternalAnsibleDsl.g:1080:9: (lv_module_12_0= ruleEModuleCall )
            	    {
            	    // InternalAnsibleDsl.g:1080:9: (lv_module_12_0= ruleEModuleCall )
            	    // InternalAnsibleDsl.g:1081:10: lv_module_12_0= ruleEModuleCall
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

            	    otherlv_13=(Token)match(input,20,FOLLOW_27); 

            	    								newLeafNode(otherlv_13, grammarAccess.getETaskHandlerAttributesAccess().getRightCurlyBracketKeyword_4_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAnsibleDsl.g:1108:3: ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1108:3: ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) )
            	    // InternalAnsibleDsl.g:1109:4: {...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:1109:116: ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) )
            	    // InternalAnsibleDsl.g:1110:5: ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:1113:8: ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) )
            	    // InternalAnsibleDsl.g:1113:9: {...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1113:18: (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ )
            	    // InternalAnsibleDsl.g:1113:19: otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+
            	    {
            	    otherlv_14=(Token)match(input,46,FOLLOW_32); 

            	    								newLeafNode(otherlv_14, grammarAccess.getETaskHandlerAttributesAccess().getNotifyKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:1117:8: ( (lv_notifiables_15_0= ruleENotifiable ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==RULE_STRING||LA10_0==117) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:1118:9: (lv_notifiables_15_0= ruleENotifiable )
            	    	    {
            	    	    // InternalAnsibleDsl.g:1118:9: (lv_notifiables_15_0= ruleENotifiable )
            	    	    // InternalAnsibleDsl.g:1119:10: lv_notifiables_15_0= ruleENotifiable
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getETaskHandlerAttributesAccess().getNotifiablesENotifiableParserRuleCall_5_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_33);
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
            	    // InternalAnsibleDsl.g:1142:3: ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1142:3: ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1143:4: {...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:1143:116: ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) )
            	    // InternalAnsibleDsl.g:1144:5: ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:1147:8: ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) )
            	    // InternalAnsibleDsl.g:1147:9: {...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1147:18: (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' )
            	    // InternalAnsibleDsl.g:1147:19: otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}'
            	    {
            	    otherlv_16=(Token)match(input,47,FOLLOW_34); 

            	    								newLeafNode(otherlv_16, grammarAccess.getETaskHandlerAttributesAccess().getLoopKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:1151:8: ( (lv_loop_17_0= ruleELoop ) )
            	    // InternalAnsibleDsl.g:1152:9: (lv_loop_17_0= ruleELoop )
            	    {
            	    // InternalAnsibleDsl.g:1152:9: (lv_loop_17_0= ruleELoop )
            	    // InternalAnsibleDsl.g:1153:10: lv_loop_17_0= ruleELoop
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

            	    otherlv_18=(Token)match(input,20,FOLLOW_27); 

            	    								newLeafNode(otherlv_18, grammarAccess.getETaskHandlerAttributesAccess().getRightCurlyBracketKeyword_6_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAnsibleDsl.g:1180:3: ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1180:3: ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) )
            	    // InternalAnsibleDsl.g:1181:4: {...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:1181:116: ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) )
            	    // InternalAnsibleDsl.g:1182:5: ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:1185:8: ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) )
            	    // InternalAnsibleDsl.g:1185:9: {...}? => ( (lv_register_19_0= ruleERegisterVariable ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerAttributes", "true");
            	    }
            	    // InternalAnsibleDsl.g:1185:18: ( (lv_register_19_0= ruleERegisterVariable ) )
            	    // InternalAnsibleDsl.g:1185:19: (lv_register_19_0= ruleERegisterVariable )
            	    {
            	    // InternalAnsibleDsl.g:1185:19: (lv_register_19_0= ruleERegisterVariable )
            	    // InternalAnsibleDsl.g:1186:9: lv_register_19_0= ruleERegisterVariable
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
    // InternalAnsibleDsl.g:1219:1: entryRuleEPlay returns [EObject current=null] : iv_ruleEPlay= ruleEPlay EOF ;
    public final EObject entryRuleEPlay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlay = null;


        try {
            // InternalAnsibleDsl.g:1219:46: (iv_ruleEPlay= ruleEPlay EOF )
            // InternalAnsibleDsl.g:1220:2: iv_ruleEPlay= ruleEPlay EOF
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
    // InternalAnsibleDsl.g:1226:1: ruleEPlay returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) ) ) ;
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

        EObject lv_force_handlers_20_0 = null;

        EObject lv_pre_tasks_list_22_0 = null;

        EObject lv_roles_inclusions_24_0 = null;

        EObject lv_tasks_list_26_0 = null;

        EObject lv_post_tasks_list_29_0 = null;

        EObject lv_handlers_32_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:1232:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalAnsibleDsl.g:1233:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalAnsibleDsl.g:1233:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) ) )
            // InternalAnsibleDsl.g:1234:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalAnsibleDsl.g:1234:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?) )
            // InternalAnsibleDsl.g:1235:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:1238:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?)
            // InternalAnsibleDsl.g:1239:5: ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+ {...}?
            {
            // InternalAnsibleDsl.g:1239:5: ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=12;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalAnsibleDsl.g:1240:3: ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1240:3: ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) )
            	    // InternalAnsibleDsl.g:1241:4: {...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:1241:99: ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) )
            	    // InternalAnsibleDsl.g:1242:5: ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:1245:8: ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) )
            	    // InternalAnsibleDsl.g:1245:9: {...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1245:18: (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? )
            	    // InternalAnsibleDsl.g:1245:19: otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )?
            	    {
            	    otherlv_1=(Token)match(input,48,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPlayAccess().getPlay_nameKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:1249:8: ( (lv_name_2_0= RULE_STRING ) )
            	    // InternalAnsibleDsl.g:1250:9: (lv_name_2_0= RULE_STRING )
            	    {
            	    // InternalAnsibleDsl.g:1250:9: (lv_name_2_0= RULE_STRING )
            	    // InternalAnsibleDsl.g:1251:10: lv_name_2_0= RULE_STRING
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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

            	    // InternalAnsibleDsl.g:1267:8: (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==49) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:1268:9: otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}'
            	            {
            	            otherlv_3=(Token)match(input,49,FOLLOW_36); 

            	            									newLeafNode(otherlv_3, grammarAccess.getEPlayAccess().getBase_attributesKeyword_0_2_0());
            	            								
            	            // InternalAnsibleDsl.g:1272:9: ( (lv_base_attributes_4_0= ruleEBaseAttributes ) )
            	            // InternalAnsibleDsl.g:1273:10: (lv_base_attributes_4_0= ruleEBaseAttributes )
            	            {
            	            // InternalAnsibleDsl.g:1273:10: (lv_base_attributes_4_0= ruleEBaseAttributes )
            	            // InternalAnsibleDsl.g:1274:11: lv_base_attributes_4_0= ruleEBaseAttributes
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

            	            otherlv_5=(Token)match(input,20,FOLLOW_37); 

            	            									newLeafNode(otherlv_5, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_0_2_2());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalAnsibleDsl.g:1296:8: (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==50) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAnsibleDsl.g:1297:9: otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}'
            	            {
            	            otherlv_6=(Token)match(input,50,FOLLOW_38); 

            	            									newLeafNode(otherlv_6, grammarAccess.getEPlayAccess().getPlay_exe_settingsKeyword_0_3_0());
            	            								
            	            // InternalAnsibleDsl.g:1301:9: ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) )
            	            // InternalAnsibleDsl.g:1302:10: (lv_play_exe_settings_7_0= ruleEPlayExeSettings )
            	            {
            	            // InternalAnsibleDsl.g:1302:10: (lv_play_exe_settings_7_0= ruleEPlayExeSettings )
            	            // InternalAnsibleDsl.g:1303:11: lv_play_exe_settings_7_0= ruleEPlayExeSettings
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

            	            otherlv_8=(Token)match(input,20,FOLLOW_39); 

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
            	    // InternalAnsibleDsl.g:1331:3: ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1331:3: ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1332:4: {...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:1332:99: ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) )
            	    // InternalAnsibleDsl.g:1333:5: ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:1336:8: ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) )
            	    // InternalAnsibleDsl.g:1336:9: {...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1336:18: (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' )
            	    // InternalAnsibleDsl.g:1336:19: otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,41,FOLLOW_40); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPlayAccess().getError_handlingKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:1340:8: ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) )
            	    // InternalAnsibleDsl.g:1341:9: (lv_error_handling_10_0= ruleEPlayErrorHandling )
            	    {
            	    // InternalAnsibleDsl.g:1341:9: (lv_error_handling_10_0= ruleEPlayErrorHandling )
            	    // InternalAnsibleDsl.g:1342:10: lv_error_handling_10_0= ruleEPlayErrorHandling
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

            	    otherlv_11=(Token)match(input,20,FOLLOW_39); 

            	    								newLeafNode(otherlv_11, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAnsibleDsl.g:1369:3: ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1369:3: ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1370:4: {...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:1370:99: ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) )
            	    // InternalAnsibleDsl.g:1371:5: ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:1374:8: ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) )
            	    // InternalAnsibleDsl.g:1374:9: {...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1374:18: (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' )
            	    // InternalAnsibleDsl.g:1374:19: otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}'
            	    {
            	    otherlv_12=(Token)match(input,51,FOLLOW_41); 

            	    								newLeafNode(otherlv_12, grammarAccess.getEPlayAccess().getFacts_settingsKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:1378:8: ( (lv_facts_settings_13_0= ruleEFactsSettings ) )
            	    // InternalAnsibleDsl.g:1379:9: (lv_facts_settings_13_0= ruleEFactsSettings )
            	    {
            	    // InternalAnsibleDsl.g:1379:9: (lv_facts_settings_13_0= ruleEFactsSettings )
            	    // InternalAnsibleDsl.g:1380:10: lv_facts_settings_13_0= ruleEFactsSettings
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

            	    otherlv_14=(Token)match(input,20,FOLLOW_39); 

            	    								newLeafNode(otherlv_14, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_2_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAnsibleDsl.g:1407:3: ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1407:3: ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:1408:4: {...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:1408:99: ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:1409:5: ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:1412:8: ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) )
            	    // InternalAnsibleDsl.g:1412:9: {...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1412:18: (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) )
            	    // InternalAnsibleDsl.g:1412:19: otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) )
            	    {
            	    otherlv_15=(Token)match(input,52,FOLLOW_19); 

            	    								newLeafNode(otherlv_15, grammarAccess.getEPlayAccess().getVars_filesKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:1416:8: ( (lv_vars_files_16_0= ruleEListPassed ) )
            	    // InternalAnsibleDsl.g:1417:9: (lv_vars_files_16_0= ruleEListPassed )
            	    {
            	    // InternalAnsibleDsl.g:1417:9: (lv_vars_files_16_0= ruleEListPassed )
            	    // InternalAnsibleDsl.g:1418:10: lv_vars_files_16_0= ruleEListPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_filesEListPassedParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_39);
            	    lv_vars_files_16_0=ruleEListPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"vars_files",
            	    											lv_vars_files_16_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EListPassed");
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
            	    // InternalAnsibleDsl.g:1441:3: ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1441:3: ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:1442:4: {...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:1442:99: ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:1443:5: ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:1446:8: ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) )
            	    // InternalAnsibleDsl.g:1446:9: {...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1446:18: (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) )
            	    // InternalAnsibleDsl.g:1446:19: otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) )
            	    {
            	    otherlv_17=(Token)match(input,53,FOLLOW_19); 

            	    								newLeafNode(otherlv_17, grammarAccess.getEPlayAccess().getVars_promptKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:1450:8: ( (lv_vars_prompt_18_0= ruleEListPassed ) )
            	    // InternalAnsibleDsl.g:1451:9: (lv_vars_prompt_18_0= ruleEListPassed )
            	    {
            	    // InternalAnsibleDsl.g:1451:9: (lv_vars_prompt_18_0= ruleEListPassed )
            	    // InternalAnsibleDsl.g:1452:10: lv_vars_prompt_18_0= ruleEListPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getVars_promptEListPassedParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_39);
            	    lv_vars_prompt_18_0=ruleEListPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"vars_prompt",
            	    											lv_vars_prompt_18_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EListPassed");
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
            	    // InternalAnsibleDsl.g:1475:3: ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1475:3: ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:1476:4: {...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalAnsibleDsl.g:1476:99: ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:1477:5: ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalAnsibleDsl.g:1480:8: ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:1480:9: {...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1480:18: (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:1480:19: otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_19=(Token)match(input,54,FOLLOW_17); 

            	    								newLeafNode(otherlv_19, grammarAccess.getEPlayAccess().getForce_handlersKeyword_5_0());
            	    							
            	    // InternalAnsibleDsl.g:1484:8: ( (lv_force_handlers_20_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:1485:9: (lv_force_handlers_20_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:1485:9: (lv_force_handlers_20_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:1486:10: lv_force_handlers_20_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayAccess().getForce_handlersEBooleanPassedParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_39);
            	    lv_force_handlers_20_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayRule());
            	    										}
            	    										set(
            	    											current,
            	    											"force_handlers",
            	    											lv_force_handlers_20_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
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
            	case 7 :
            	    // InternalAnsibleDsl.g:1509:3: ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1509:3: ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1510:4: {...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalAnsibleDsl.g:1510:99: ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) )
            	    // InternalAnsibleDsl.g:1511:5: ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalAnsibleDsl.g:1514:8: ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) )
            	    // InternalAnsibleDsl.g:1514:9: {...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1514:18: (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' )
            	    // InternalAnsibleDsl.g:1514:19: otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}'
            	    {
            	    otherlv_21=(Token)match(input,55,FOLLOW_42); 

            	    								newLeafNode(otherlv_21, grammarAccess.getEPlayAccess().getPre_tasksKeyword_6_0());
            	    							
            	    // InternalAnsibleDsl.g:1518:8: ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==59||LA14_0==65) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:1519:9: (lv_pre_tasks_list_22_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:1519:9: (lv_pre_tasks_list_22_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:1520:10: lv_pre_tasks_list_22_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getPre_tasks_listEBlockTaskParserRuleCall_6_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_43);
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

            	    otherlv_23=(Token)match(input,20,FOLLOW_39); 

            	    								newLeafNode(otherlv_23, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_6_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAnsibleDsl.g:1547:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1547:3: ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) )
            	    // InternalAnsibleDsl.g:1548:4: {...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7)");
            	    }
            	    // InternalAnsibleDsl.g:1548:99: ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) )
            	    // InternalAnsibleDsl.g:1549:5: ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7);
            	    				
            	    // InternalAnsibleDsl.g:1552:8: ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) )
            	    // InternalAnsibleDsl.g:1552:9: {...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1552:18: ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) )
            	    // InternalAnsibleDsl.g:1552:19: (lv_roles_inclusions_24_0= ruleERoleInclusions )
            	    {
            	    // InternalAnsibleDsl.g:1552:19: (lv_roles_inclusions_24_0= ruleERoleInclusions )
            	    // InternalAnsibleDsl.g:1553:9: lv_roles_inclusions_24_0= ruleERoleInclusions
            	    {

            	    									newCompositeNode(grammarAccess.getEPlayAccess().getRoles_inclusionsERoleInclusionsParserRuleCall_7_0());
            	    								
            	    pushFollow(FOLLOW_39);
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
            	    // InternalAnsibleDsl.g:1575:3: ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1575:3: ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1576:4: {...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8)");
            	    }
            	    // InternalAnsibleDsl.g:1576:99: ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) )
            	    // InternalAnsibleDsl.g:1577:5: ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8);
            	    				
            	    // InternalAnsibleDsl.g:1580:8: ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) )
            	    // InternalAnsibleDsl.g:1580:9: {...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1580:18: (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' )
            	    // InternalAnsibleDsl.g:1580:19: otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}'
            	    {
            	    otherlv_25=(Token)match(input,56,FOLLOW_42); 

            	    								newLeafNode(otherlv_25, grammarAccess.getEPlayAccess().getTasks_listKeyword_8_0());
            	    							
            	    // InternalAnsibleDsl.g:1584:8: ( (lv_tasks_list_26_0= ruleEBlockTask ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==59||LA15_0==65) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:1585:9: (lv_tasks_list_26_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:1585:9: (lv_tasks_list_26_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:1586:10: lv_tasks_list_26_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getTasks_listEBlockTaskParserRuleCall_8_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_43);
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

            	    otherlv_27=(Token)match(input,20,FOLLOW_39); 

            	    								newLeafNode(otherlv_27, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_8_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalAnsibleDsl.g:1613:3: ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1613:3: ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1614:4: {...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 9)");
            	    }
            	    // InternalAnsibleDsl.g:1614:99: ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) )
            	    // InternalAnsibleDsl.g:1615:5: ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 9);
            	    				
            	    // InternalAnsibleDsl.g:1618:8: ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) )
            	    // InternalAnsibleDsl.g:1618:9: {...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1618:18: (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' )
            	    // InternalAnsibleDsl.g:1618:19: otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}'
            	    {
            	    otherlv_28=(Token)match(input,57,FOLLOW_42); 

            	    								newLeafNode(otherlv_28, grammarAccess.getEPlayAccess().getPost_tasksKeyword_9_0());
            	    							
            	    // InternalAnsibleDsl.g:1622:8: ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==59||LA16_0==65) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:1623:9: (lv_post_tasks_list_29_0= ruleEBlockTask )
            	    	    {
            	    	    // InternalAnsibleDsl.g:1623:9: (lv_post_tasks_list_29_0= ruleEBlockTask )
            	    	    // InternalAnsibleDsl.g:1624:10: lv_post_tasks_list_29_0= ruleEBlockTask
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getPost_tasks_listEBlockTaskParserRuleCall_9_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_43);
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

            	    otherlv_30=(Token)match(input,20,FOLLOW_39); 

            	    								newLeafNode(otherlv_30, grammarAccess.getEPlayAccess().getRightCurlyBracketKeyword_9_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPlayAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalAnsibleDsl.g:1651:3: ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:1651:3: ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) )
            	    // InternalAnsibleDsl.g:1652:4: {...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 10)");
            	    }
            	    // InternalAnsibleDsl.g:1652:100: ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) )
            	    // InternalAnsibleDsl.g:1653:5: ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayAccess().getUnorderedGroup(), 10);
            	    				
            	    // InternalAnsibleDsl.g:1656:8: ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) )
            	    // InternalAnsibleDsl.g:1656:9: {...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlay", "true");
            	    }
            	    // InternalAnsibleDsl.g:1656:18: (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' )
            	    // InternalAnsibleDsl.g:1656:19: otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}'
            	    {
            	    otherlv_31=(Token)match(input,58,FOLLOW_44); 

            	    								newLeafNode(otherlv_31, grammarAccess.getEPlayAccess().getHandlersKeyword_10_0());
            	    							
            	    // InternalAnsibleDsl.g:1660:8: ( (lv_handlers_32_0= ruleEHandler ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==68) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalAnsibleDsl.g:1661:9: (lv_handlers_32_0= ruleEHandler )
            	    	    {
            	    	    // InternalAnsibleDsl.g:1661:9: (lv_handlers_32_0= ruleEHandler )
            	    	    // InternalAnsibleDsl.g:1662:10: lv_handlers_32_0= ruleEHandler
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getEPlayAccess().getHandlersEHandlerParserRuleCall_10_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_45);
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

            	    otherlv_33=(Token)match(input,20,FOLLOW_39); 

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
    // InternalAnsibleDsl.g:1700:1: entryRuleEBlock returns [EObject current=null] : iv_ruleEBlock= ruleEBlock EOF ;
    public final EObject entryRuleEBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlock = null;


        try {
            // InternalAnsibleDsl.g:1700:47: (iv_ruleEBlock= ruleEBlock EOF )
            // InternalAnsibleDsl.g:1701:2: iv_ruleEBlock= ruleEBlock EOF
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
    // InternalAnsibleDsl.g:1707:1: ruleEBlock returns [EObject current=null] : (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' ) ;
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
            // InternalAnsibleDsl.g:1713:2: ( (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalAnsibleDsl.g:1714:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalAnsibleDsl.g:1714:2: (otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}' )
            // InternalAnsibleDsl.g:1715:3: otherlv_0= 'block{' (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )? (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )? otherlv_12= 'tasks{' ( (lv_tasks_13_0= ruleETask ) )+ otherlv_14= '}' (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )? (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getEBlockAccess().getBlockKeyword_0());
            		
            // InternalAnsibleDsl.g:1719:3: (otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==60) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAnsibleDsl.g:1720:4: otherlv_1= 'block_name:' ( (lv_name_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEBlockAccess().getBlock_nameKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:1724:4: ( (lv_name_2_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:1725:5: (lv_name_2_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:1725:5: (lv_name_2_0= RULE_STRING )
                    // InternalAnsibleDsl.g:1726:6: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

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

            // InternalAnsibleDsl.g:1743:3: (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAnsibleDsl.g:1744:4: otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getEBlockAccess().getBase_attributesKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:1748:4: ( (lv_base_attributes_4_0= ruleEBaseAttributes ) )
                    // InternalAnsibleDsl.g:1749:5: (lv_base_attributes_4_0= ruleEBaseAttributes )
                    {
                    // InternalAnsibleDsl.g:1749:5: (lv_base_attributes_4_0= ruleEBaseAttributes )
                    // InternalAnsibleDsl.g:1750:6: lv_base_attributes_4_0= ruleEBaseAttributes
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

                    otherlv_5=(Token)match(input,20,FOLLOW_48); 

                    				newLeafNode(otherlv_5, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1772:3: (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==61) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAnsibleDsl.g:1773:4: otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_49); 

                    				newLeafNode(otherlv_6, grammarAccess.getEBlockAccess().getExecution_attributesKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:1777:4: ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) )
                    // InternalAnsibleDsl.g:1778:5: (lv_execution_attributes_7_0= ruleEExecutionAttributes )
                    {
                    // InternalAnsibleDsl.g:1778:5: (lv_execution_attributes_7_0= ruleEExecutionAttributes )
                    // InternalAnsibleDsl.g:1779:6: lv_execution_attributes_7_0= ruleEExecutionAttributes
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

                    otherlv_8=(Token)match(input,20,FOLLOW_50); 

                    				newLeafNode(otherlv_8, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1801:3: (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAnsibleDsl.g:1802:4: otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,41,FOLLOW_51); 

                    				newLeafNode(otherlv_9, grammarAccess.getEBlockAccess().getError_handlingKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:1806:4: ( (lv_error_handling_10_0= ruleEBlockErrorHandling ) )
                    // InternalAnsibleDsl.g:1807:5: (lv_error_handling_10_0= ruleEBlockErrorHandling )
                    {
                    // InternalAnsibleDsl.g:1807:5: (lv_error_handling_10_0= ruleEBlockErrorHandling )
                    // InternalAnsibleDsl.g:1808:6: lv_error_handling_10_0= ruleEBlockErrorHandling
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

                    otherlv_11=(Token)match(input,20,FOLLOW_52); 

                    				newLeafNode(otherlv_11, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,62,FOLLOW_42); 

            			newLeafNode(otherlv_12, grammarAccess.getEBlockAccess().getTasksKeyword_5());
            		
            // InternalAnsibleDsl.g:1834:3: ( (lv_tasks_13_0= ruleETask ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==65) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAnsibleDsl.g:1835:4: (lv_tasks_13_0= ruleETask )
            	    {
            	    // InternalAnsibleDsl.g:1835:4: (lv_tasks_13_0= ruleETask )
            	    // InternalAnsibleDsl.g:1836:5: lv_tasks_13_0= ruleETask
            	    {

            	    					newCompositeNode(grammarAccess.getEBlockAccess().getTasksETaskParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_43);
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

            otherlv_14=(Token)match(input,20,FOLLOW_53); 

            			newLeafNode(otherlv_14, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalAnsibleDsl.g:1857:3: (otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==63) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAnsibleDsl.g:1858:4: otherlv_15= 'rescue_tasks{' ( (lv_rescue_tasks_16_0= ruleETask ) )+ otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,63,FOLLOW_42); 

                    				newLeafNode(otherlv_15, grammarAccess.getEBlockAccess().getRescue_tasksKeyword_8_0());
                    			
                    // InternalAnsibleDsl.g:1862:4: ( (lv_rescue_tasks_16_0= ruleETask ) )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==65) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1863:5: (lv_rescue_tasks_16_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:1863:5: (lv_rescue_tasks_16_0= ruleETask )
                    	    // InternalAnsibleDsl.g:1864:6: lv_rescue_tasks_16_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getRescue_tasksETaskParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_43);
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

                    otherlv_17=(Token)match(input,20,FOLLOW_54); 

                    				newLeafNode(otherlv_17, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_8_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:1886:3: (otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==64) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAnsibleDsl.g:1887:4: otherlv_18= 'always_tasks{' ( (lv_always_tasks_19_0= ruleETask ) )+ otherlv_20= '}'
                    {
                    otherlv_18=(Token)match(input,64,FOLLOW_42); 

                    				newLeafNode(otherlv_18, grammarAccess.getEBlockAccess().getAlways_tasksKeyword_9_0());
                    			
                    // InternalAnsibleDsl.g:1891:4: ( (lv_always_tasks_19_0= ruleETask ) )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==65) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:1892:5: (lv_always_tasks_19_0= ruleETask )
                    	    {
                    	    // InternalAnsibleDsl.g:1892:5: (lv_always_tasks_19_0= ruleETask )
                    	    // InternalAnsibleDsl.g:1893:6: lv_always_tasks_19_0= ruleETask
                    	    {

                    	    						newCompositeNode(grammarAccess.getEBlockAccess().getAlways_tasksETaskParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_43);
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

                    otherlv_20=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_20, grammarAccess.getEBlockAccess().getRightCurlyBracketKeyword_9_2());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:1923:1: entryRuleETask returns [EObject current=null] : iv_ruleETask= ruleETask EOF ;
    public final EObject entryRuleETask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETask = null;


        try {
            // InternalAnsibleDsl.g:1923:46: (iv_ruleETask= ruleETask EOF )
            // InternalAnsibleDsl.g:1924:2: iv_ruleETask= ruleETask EOF
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
    // InternalAnsibleDsl.g:1930:1: ruleETask returns [EObject current=null] : ( () otherlv_1= 'task{' (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? otherlv_13= '}' ) ;
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
            // InternalAnsibleDsl.g:1936:2: ( ( () otherlv_1= 'task{' (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalAnsibleDsl.g:1937:2: ( () otherlv_1= 'task{' (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalAnsibleDsl.g:1937:2: ( () otherlv_1= 'task{' (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? otherlv_13= '}' )
            // InternalAnsibleDsl.g:1938:3: () otherlv_1= 'task{' (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalAnsibleDsl.g:1938:3: ()
            // InternalAnsibleDsl.g:1939:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getETaskAccess().getETaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getETaskAccess().getTaskKeyword_1());
            		
            // InternalAnsibleDsl.g:1949:3: (otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==66) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAnsibleDsl.g:1950:4: otherlv_2= 'task_name:' ( (lv_name_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getETaskAccess().getTask_nameKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:1954:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:1955:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:1955:5: (lv_name_3_0= RULE_STRING )
                    // InternalAnsibleDsl.g:1956:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_56); 

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

            // InternalAnsibleDsl.g:1973:3: (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAnsibleDsl.g:1974:4: otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getETaskAccess().getBase_attributesKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:1978:4: ( (lv_base_attributes_5_0= ruleEBaseAttributes ) )
                    // InternalAnsibleDsl.g:1979:5: (lv_base_attributes_5_0= ruleEBaseAttributes )
                    {
                    // InternalAnsibleDsl.g:1979:5: (lv_base_attributes_5_0= ruleEBaseAttributes )
                    // InternalAnsibleDsl.g:1980:6: lv_base_attributes_5_0= ruleEBaseAttributes
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

                    otherlv_6=(Token)match(input,20,FOLLOW_57); 

                    				newLeafNode(otherlv_6, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2002:3: (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==61) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAnsibleDsl.g:2003:4: otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_49); 

                    				newLeafNode(otherlv_7, grammarAccess.getETaskAccess().getExecution_attributesKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2007:4: ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) )
                    // InternalAnsibleDsl.g:2008:5: (lv_execution_attributes_8_0= ruleEExecutionAttributes )
                    {
                    // InternalAnsibleDsl.g:2008:5: (lv_execution_attributes_8_0= ruleEExecutionAttributes )
                    // InternalAnsibleDsl.g:2009:6: lv_execution_attributes_8_0= ruleEExecutionAttributes
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

                    otherlv_9=(Token)match(input,20,FOLLOW_58); 

                    				newLeafNode(otherlv_9, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2031:3: (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==67) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAnsibleDsl.g:2032:4: otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,67,FOLLOW_59); 

                    				newLeafNode(otherlv_10, grammarAccess.getETaskAccess().getTask_handler_attributesKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:2036:4: ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) )
                    // InternalAnsibleDsl.g:2037:5: (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes )
                    {
                    // InternalAnsibleDsl.g:2037:5: (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes )
                    // InternalAnsibleDsl.g:2038:6: lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes
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

                    otherlv_12=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getETaskAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:2068:1: entryRuleEHandler returns [EObject current=null] : iv_ruleEHandler= ruleEHandler EOF ;
    public final EObject entryRuleEHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEHandler = null;


        try {
            // InternalAnsibleDsl.g:2068:49: (iv_ruleEHandler= ruleEHandler EOF )
            // InternalAnsibleDsl.g:2069:2: iv_ruleEHandler= ruleEHandler EOF
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
    // InternalAnsibleDsl.g:2075:1: ruleEHandler returns [EObject current=null] : ( () otherlv_1= 'handler{' (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )? otherlv_15= '}' ) ;
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
            // InternalAnsibleDsl.g:2081:2: ( ( () otherlv_1= 'handler{' (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )? otherlv_15= '}' ) )
            // InternalAnsibleDsl.g:2082:2: ( () otherlv_1= 'handler{' (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )? otherlv_15= '}' )
            {
            // InternalAnsibleDsl.g:2082:2: ( () otherlv_1= 'handler{' (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )? otherlv_15= '}' )
            // InternalAnsibleDsl.g:2083:3: () otherlv_1= 'handler{' (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )? (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )? (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )? (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )? (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )? otherlv_15= '}'
            {
            // InternalAnsibleDsl.g:2083:3: ()
            // InternalAnsibleDsl.g:2084:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEHandlerAccess().getEHandlerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_60); 

            			newLeafNode(otherlv_1, grammarAccess.getEHandlerAccess().getHandlerKeyword_1());
            		
            // InternalAnsibleDsl.g:2094:3: (otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==69) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAnsibleDsl.g:2095:4: otherlv_2= 'handler_name:' ( (lv_name_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getEHandlerAccess().getHandler_nameKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2099:4: ( (lv_name_3_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:2100:5: (lv_name_3_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:2100:5: (lv_name_3_0= RULE_STRING )
                    // InternalAnsibleDsl.g:2101:6: lv_name_3_0= RULE_STRING
                    {
                    lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_61); 

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

            // InternalAnsibleDsl.g:2118:3: (otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAnsibleDsl.g:2119:4: otherlv_4= 'base_attributes{' ( (lv_base_attributes_5_0= ruleEBaseAttributes ) ) otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_36); 

                    				newLeafNode(otherlv_4, grammarAccess.getEHandlerAccess().getBase_attributesKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2123:4: ( (lv_base_attributes_5_0= ruleEBaseAttributes ) )
                    // InternalAnsibleDsl.g:2124:5: (lv_base_attributes_5_0= ruleEBaseAttributes )
                    {
                    // InternalAnsibleDsl.g:2124:5: (lv_base_attributes_5_0= ruleEBaseAttributes )
                    // InternalAnsibleDsl.g:2125:6: lv_base_attributes_5_0= ruleEBaseAttributes
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

                    otherlv_6=(Token)match(input,20,FOLLOW_62); 

                    				newLeafNode(otherlv_6, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2147:3: (otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==61) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAnsibleDsl.g:2148:4: otherlv_7= 'execution_attributes{' ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) ) otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,61,FOLLOW_49); 

                    				newLeafNode(otherlv_7, grammarAccess.getEHandlerAccess().getExecution_attributesKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2152:4: ( (lv_execution_attributes_8_0= ruleEExecutionAttributes ) )
                    // InternalAnsibleDsl.g:2153:5: (lv_execution_attributes_8_0= ruleEExecutionAttributes )
                    {
                    // InternalAnsibleDsl.g:2153:5: (lv_execution_attributes_8_0= ruleEExecutionAttributes )
                    // InternalAnsibleDsl.g:2154:6: lv_execution_attributes_8_0= ruleEExecutionAttributes
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

                    otherlv_9=(Token)match(input,20,FOLLOW_63); 

                    				newLeafNode(otherlv_9, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2176:3: (otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==67) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAnsibleDsl.g:2177:4: otherlv_10= 'task_handler_attributes{' ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) ) otherlv_12= '}'
                    {
                    otherlv_10=(Token)match(input,67,FOLLOW_59); 

                    				newLeafNode(otherlv_10, grammarAccess.getEHandlerAccess().getTask_handler_attributesKeyword_5_0());
                    			
                    // InternalAnsibleDsl.g:2181:4: ( (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes ) )
                    // InternalAnsibleDsl.g:2182:5: (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes )
                    {
                    // InternalAnsibleDsl.g:2182:5: (lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes )
                    // InternalAnsibleDsl.g:2183:6: lv_task_handler_attributes_11_0= ruleETaskHandlerAttributes
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

                    otherlv_12=(Token)match(input,20,FOLLOW_64); 

                    				newLeafNode(otherlv_12, grammarAccess.getEHandlerAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2205:3: (otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+ )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==70) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAnsibleDsl.g:2206:4: otherlv_13= 'listen:' ( (otherlv_14= RULE_STRING ) )+
                    {
                    otherlv_13=(Token)match(input,70,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getEHandlerAccess().getListenKeyword_6_0());
                    			
                    // InternalAnsibleDsl.g:2210:4: ( (otherlv_14= RULE_STRING ) )+
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
                    	    // InternalAnsibleDsl.g:2211:5: (otherlv_14= RULE_STRING )
                    	    {
                    	    // InternalAnsibleDsl.g:2211:5: (otherlv_14= RULE_STRING )
                    	    // InternalAnsibleDsl.g:2212:6: otherlv_14= RULE_STRING
                    	    {

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getEHandlerRule());
                    	    						}
                    	    					
                    	    otherlv_14=(Token)match(input,RULE_STRING,FOLLOW_65); 

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

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:2232:1: entryRuleEModuleCall returns [EObject current=null] : iv_ruleEModuleCall= ruleEModuleCall EOF ;
    public final EObject entryRuleEModuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEModuleCall = null;


        try {
            // InternalAnsibleDsl.g:2232:52: (iv_ruleEModuleCall= ruleEModuleCall EOF )
            // InternalAnsibleDsl.g:2233:2: iv_ruleEModuleCall= ruleEModuleCall EOF
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
    // InternalAnsibleDsl.g:2239:1: ruleEModuleCall returns [EObject current=null] : (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direct_parameter:' ( (lv_direct_parameter_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'parameters{' ( (lv_parameters_5_0= ruleEParameter ) )+ otherlv_6= '}' )? ) ;
    public final EObject ruleEModuleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_direct_parameter_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2245:2: ( (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direct_parameter:' ( (lv_direct_parameter_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'parameters{' ( (lv_parameters_5_0= ruleEParameter ) )+ otherlv_6= '}' )? ) )
            // InternalAnsibleDsl.g:2246:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direct_parameter:' ( (lv_direct_parameter_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'parameters{' ( (lv_parameters_5_0= ruleEParameter ) )+ otherlv_6= '}' )? )
            {
            // InternalAnsibleDsl.g:2246:2: (otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direct_parameter:' ( (lv_direct_parameter_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'parameters{' ( (lv_parameters_5_0= ruleEParameter ) )+ otherlv_6= '}' )? )
            // InternalAnsibleDsl.g:2247:3: otherlv_0= 'module_name:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'direct_parameter:' ( (lv_direct_parameter_3_0= ruleEValuePassed ) ) )? (otherlv_4= 'parameters{' ( (lv_parameters_5_0= ruleEParameter ) )+ otherlv_6= '}' )?
            {
            otherlv_0=(Token)match(input,71,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEModuleCallAccess().getModule_nameKeyword_0());
            		
            // InternalAnsibleDsl.g:2251:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:2252:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:2252:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:2253:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_66); 

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

            // InternalAnsibleDsl.g:2269:3: (otherlv_2= 'direct_parameter:' ( (lv_direct_parameter_3_0= ruleEValuePassed ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==72) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAnsibleDsl.g:2270:4: otherlv_2= 'direct_parameter:' ( (lv_direct_parameter_3_0= ruleEValuePassed ) )
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_67); 

                    				newLeafNode(otherlv_2, grammarAccess.getEModuleCallAccess().getDirect_parameterKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2274:4: ( (lv_direct_parameter_3_0= ruleEValuePassed ) )
                    // InternalAnsibleDsl.g:2275:5: (lv_direct_parameter_3_0= ruleEValuePassed )
                    {
                    // InternalAnsibleDsl.g:2275:5: (lv_direct_parameter_3_0= ruleEValuePassed )
                    // InternalAnsibleDsl.g:2276:6: lv_direct_parameter_3_0= ruleEValuePassed
                    {

                    						newCompositeNode(grammarAccess.getEModuleCallAccess().getDirect_parameterEValuePassedParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_68);
                    lv_direct_parameter_3_0=ruleEValuePassed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEModuleCallRule());
                    						}
                    						set(
                    							current,
                    							"direct_parameter",
                    							lv_direct_parameter_3_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassed");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:2294:3: (otherlv_4= 'parameters{' ( (lv_parameters_5_0= ruleEParameter ) )+ otherlv_6= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==73) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAnsibleDsl.g:2295:4: otherlv_4= 'parameters{' ( (lv_parameters_5_0= ruleEParameter ) )+ otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,73,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEModuleCallAccess().getParametersKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2299:4: ( (lv_parameters_5_0= ruleEParameter ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:2300:5: (lv_parameters_5_0= ruleEParameter )
                    	    {
                    	    // InternalAnsibleDsl.g:2300:5: (lv_parameters_5_0= ruleEParameter )
                    	    // InternalAnsibleDsl.g:2301:6: lv_parameters_5_0= ruleEParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getEModuleCallAccess().getParametersEParameterParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_parameters_5_0=ruleEParameter();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEModuleCallRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_5_0,
                    	    							"org.sodalite.sdl.ansible.AnsibleDsl.EParameter");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt39 >= 1 ) break loop39;
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
                    } while (true);

                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getEModuleCallAccess().getRightCurlyBracketKeyword_3_2());
                    			

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
    // $ANTLR end "ruleEModuleCall"


    // $ANTLR start "entryRuleEParameter"
    // InternalAnsibleDsl.g:2327:1: entryRuleEParameter returns [EObject current=null] : iv_ruleEParameter= ruleEParameter EOF ;
    public final EObject entryRuleEParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameter = null;


        try {
            // InternalAnsibleDsl.g:2327:51: (iv_ruleEParameter= ruleEParameter EOF )
            // InternalAnsibleDsl.g:2328:2: iv_ruleEParameter= ruleEParameter EOF
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
    // InternalAnsibleDsl.g:2334:1: ruleEParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) ;
    public final EObject ruleEParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2340:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) )
            // InternalAnsibleDsl.g:2341:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            {
            // InternalAnsibleDsl.g:2341:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            // InternalAnsibleDsl.g:2342:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) )
            {
            // InternalAnsibleDsl.g:2342:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:2343:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:2343:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:2344:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_69); 

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

            otherlv_1=(Token)match(input,74,FOLLOW_67); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:2364:3: ( (lv_value_passed_2_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:2365:4: (lv_value_passed_2_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:2365:4: (lv_value_passed_2_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:2366:5: lv_value_passed_2_0= ruleEValuePassed
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
    // InternalAnsibleDsl.g:2387:1: entryRuleERoleInclusion returns [EObject current=null] : iv_ruleERoleInclusion= ruleERoleInclusion EOF ;
    public final EObject entryRuleERoleInclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusion = null;


        try {
            // InternalAnsibleDsl.g:2387:55: (iv_ruleERoleInclusion= ruleERoleInclusion EOF )
            // InternalAnsibleDsl.g:2388:2: iv_ruleERoleInclusion= ruleERoleInclusion EOF
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
    // InternalAnsibleDsl.g:2394:1: ruleERoleInclusion returns [EObject current=null] : (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalAnsibleDsl.g:2400:2: ( (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalAnsibleDsl.g:2401:2: (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalAnsibleDsl.g:2401:2: (otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? otherlv_9= '}' )
            // InternalAnsibleDsl.g:2402:3: otherlv_0= 'role{' otherlv_1= 'role_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_70); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionAccess().getRoleKeyword_0());
            		
            otherlv_1=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getERoleInclusionAccess().getRole_nameKeyword_1());
            		
            // InternalAnsibleDsl.g:2410:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:2411:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:2411:4: (lv_name_2_0= RULE_STRING )
            // InternalAnsibleDsl.g:2412:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_71); 

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

            // InternalAnsibleDsl.g:2428:3: (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAnsibleDsl.g:2429:4: otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_36); 

                    				newLeafNode(otherlv_3, grammarAccess.getERoleInclusionAccess().getBase_attributesKeyword_3_0());
                    			
                    // InternalAnsibleDsl.g:2433:4: ( (lv_base_attributes_4_0= ruleEBaseAttributes ) )
                    // InternalAnsibleDsl.g:2434:5: (lv_base_attributes_4_0= ruleEBaseAttributes )
                    {
                    // InternalAnsibleDsl.g:2434:5: (lv_base_attributes_4_0= ruleEBaseAttributes )
                    // InternalAnsibleDsl.g:2435:6: lv_base_attributes_4_0= ruleEBaseAttributes
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

                    otherlv_5=(Token)match(input,20,FOLLOW_72); 

                    				newLeafNode(otherlv_5, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:2457:3: (otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==61) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAnsibleDsl.g:2458:4: otherlv_6= 'execution_attributes{' ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_49); 

                    				newLeafNode(otherlv_6, grammarAccess.getERoleInclusionAccess().getExecution_attributesKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:2462:4: ( (lv_execution_attributes_7_0= ruleEExecutionAttributes ) )
                    // InternalAnsibleDsl.g:2463:5: (lv_execution_attributes_7_0= ruleEExecutionAttributes )
                    {
                    // InternalAnsibleDsl.g:2463:5: (lv_execution_attributes_7_0= ruleEExecutionAttributes )
                    // InternalAnsibleDsl.g:2464:6: lv_execution_attributes_7_0= ruleEExecutionAttributes
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

                    otherlv_8=(Token)match(input,20,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getERoleInclusionAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:2494:1: entryRuleERoleInclusions returns [EObject current=null] : iv_ruleERoleInclusions= ruleERoleInclusions EOF ;
    public final EObject entryRuleERoleInclusions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERoleInclusions = null;


        try {
            // InternalAnsibleDsl.g:2494:56: (iv_ruleERoleInclusions= ruleERoleInclusions EOF )
            // InternalAnsibleDsl.g:2495:2: iv_ruleERoleInclusions= ruleERoleInclusions EOF
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
    // InternalAnsibleDsl.g:2501:1: ruleERoleInclusions returns [EObject current=null] : (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) )+ otherlv_2= '}' ) ;
    public final EObject ruleERoleInclusions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_roles_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2507:2: ( (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) )+ otherlv_2= '}' ) )
            // InternalAnsibleDsl.g:2508:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) )+ otherlv_2= '}' )
            {
            // InternalAnsibleDsl.g:2508:2: (otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) )+ otherlv_2= '}' )
            // InternalAnsibleDsl.g:2509:3: otherlv_0= 'roles_inclusions{' ( (lv_roles_1_0= ruleERoleInclusion ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getERoleInclusionsAccess().getRoles_inclusionsKeyword_0());
            		
            // InternalAnsibleDsl.g:2513:3: ( (lv_roles_1_0= ruleERoleInclusion ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==75) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2514:4: (lv_roles_1_0= ruleERoleInclusion )
            	    {
            	    // InternalAnsibleDsl.g:2514:4: (lv_roles_1_0= ruleERoleInclusion )
            	    // InternalAnsibleDsl.g:2515:5: lv_roles_1_0= ruleERoleInclusion
            	    {

            	    					newCompositeNode(grammarAccess.getERoleInclusionsAccess().getRolesERoleInclusionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_74);
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
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:2540:1: entryRuleELoop returns [EObject current=null] : iv_ruleELoop= ruleELoop EOF ;
    public final EObject entryRuleELoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoop = null;


        try {
            // InternalAnsibleDsl.g:2540:46: (iv_ruleELoop= ruleELoop EOF )
            // InternalAnsibleDsl.g:2541:2: iv_ruleELoop= ruleELoop EOF
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
    // InternalAnsibleDsl.g:2547:1: ruleELoop returns [EObject current=null] : (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) ;
    public final EObject ruleELoop() throws RecognitionException {
        EObject current = null;

        EObject this_ELoopOverList_0 = null;

        EObject this_EUntil_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2553:2: ( (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil ) )
            // InternalAnsibleDsl.g:2554:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            {
            // InternalAnsibleDsl.g:2554:2: (this_ELoopOverList_0= ruleELoopOverList | this_EUntil_1= ruleEUntil )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==78) ) {
                alt44=1;
            }
            else if ( (LA44_0==85) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalAnsibleDsl.g:2555:3: this_ELoopOverList_0= ruleELoopOverList
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
                    // InternalAnsibleDsl.g:2564:3: this_EUntil_1= ruleEUntil
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
    // InternalAnsibleDsl.g:2576:1: entryRuleELoopOverList returns [EObject current=null] : iv_ruleELoopOverList= ruleELoopOverList EOF ;
    public final EObject entryRuleELoopOverList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopOverList = null;


        try {
            // InternalAnsibleDsl.g:2576:54: (iv_ruleELoopOverList= ruleELoopOverList EOF )
            // InternalAnsibleDsl.g:2577:2: iv_ruleELoopOverList= ruleELoopOverList EOF
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
    // InternalAnsibleDsl.g:2583:1: ruleELoopOverList returns [EObject current=null] : (otherlv_0= 'loop_over:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )? ) ;
    public final EObject ruleELoopOverList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_loop_list_1_0 = null;

        EObject lv_loop_control_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2589:2: ( (otherlv_0= 'loop_over:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )? ) )
            // InternalAnsibleDsl.g:2590:2: (otherlv_0= 'loop_over:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )? )
            {
            // InternalAnsibleDsl.g:2590:2: (otherlv_0= 'loop_over:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )? )
            // InternalAnsibleDsl.g:2591:3: otherlv_0= 'loop_over:' ( (lv_loop_list_1_0= ruleEValuePassed ) ) (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,78,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getELoopOverListAccess().getLoop_overKeyword_0());
            		
            // InternalAnsibleDsl.g:2595:3: ( (lv_loop_list_1_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:2596:4: (lv_loop_list_1_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:2596:4: (lv_loop_list_1_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:2597:5: lv_loop_list_1_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getELoopOverListAccess().getLoop_listEValuePassedParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_75);
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

            // InternalAnsibleDsl.g:2614:3: (otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==79) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAnsibleDsl.g:2615:4: otherlv_2= 'loop_control{' ( (lv_loop_control_3_0= ruleELoopControl ) ) otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,79,FOLLOW_76); 

                    				newLeafNode(otherlv_2, grammarAccess.getELoopOverListAccess().getLoop_controlKeyword_2_0());
                    			
                    // InternalAnsibleDsl.g:2619:4: ( (lv_loop_control_3_0= ruleELoopControl ) )
                    // InternalAnsibleDsl.g:2620:5: (lv_loop_control_3_0= ruleELoopControl )
                    {
                    // InternalAnsibleDsl.g:2620:5: (lv_loop_control_3_0= ruleELoopControl )
                    // InternalAnsibleDsl.g:2621:6: lv_loop_control_3_0= ruleELoopControl
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

                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:2647:1: entryRuleELoopControl returns [EObject current=null] : iv_ruleELoopControl= ruleELoopControl EOF ;
    public final EObject entryRuleELoopControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELoopControl = null;


        try {
            // InternalAnsibleDsl.g:2647:53: (iv_ruleELoopControl= ruleELoopControl EOF )
            // InternalAnsibleDsl.g:2648:2: iv_ruleELoopControl= ruleELoopControl EOF
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
    // InternalAnsibleDsl.g:2654:1: ruleELoopControl returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleELoopControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_label_2_0 = null;

        EObject lv_pause_4_0 = null;

        EObject lv_index_var_6_0 = null;

        EObject lv_loop_var_8_0 = null;

        EObject lv_extended_10_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2660:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:2661:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:2661:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:2662:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:2662:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:2663:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getELoopControlAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:2666:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:2667:5: ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:2667:5: ( ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            loop46:
            do {
                int alt46=6;
                int LA46_0 = input.LA(1);

                if ( LA46_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 2) ) {
                    alt46=3;
                }
                else if ( LA46_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 3) ) {
                    alt46=4;
                }
                else if ( LA46_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 4) ) {
                    alt46=5;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2668:3: ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2668:3: ({...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2669:4: {...}? => ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:2669:106: ( ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:2670:5: ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:2673:8: ({...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) ) )
            	    // InternalAnsibleDsl.g:2673:9: {...}? => (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "true");
            	    }
            	    // InternalAnsibleDsl.g:2673:18: (otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) ) )
            	    // InternalAnsibleDsl.g:2673:19: otherlv_1= 'label:' ( (lv_label_2_0= ruleEValuePassed ) )
            	    {
            	    otherlv_1=(Token)match(input,80,FOLLOW_67); 

            	    								newLeafNode(otherlv_1, grammarAccess.getELoopControlAccess().getLabelKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:2677:8: ( (lv_label_2_0= ruleEValuePassed ) )
            	    // InternalAnsibleDsl.g:2678:9: (lv_label_2_0= ruleEValuePassed )
            	    {
            	    // InternalAnsibleDsl.g:2678:9: (lv_label_2_0= ruleEValuePassed )
            	    // InternalAnsibleDsl.g:2679:10: lv_label_2_0= ruleEValuePassed
            	    {

            	    										newCompositeNode(grammarAccess.getELoopControlAccess().getLabelEValuePassedParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_77);
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
            	    // InternalAnsibleDsl.g:2702:3: ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2702:3: ({...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2703:4: {...}? => ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:2703:106: ( ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:2704:5: ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:2707:8: ({...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) ) )
            	    // InternalAnsibleDsl.g:2707:9: {...}? => (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "true");
            	    }
            	    // InternalAnsibleDsl.g:2707:18: (otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) ) )
            	    // InternalAnsibleDsl.g:2707:19: otherlv_3= 'pause:' ( (lv_pause_4_0= ruleENumberPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,81,FOLLOW_78); 

            	    								newLeafNode(otherlv_3, grammarAccess.getELoopControlAccess().getPauseKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:2711:8: ( (lv_pause_4_0= ruleENumberPassed ) )
            	    // InternalAnsibleDsl.g:2712:9: (lv_pause_4_0= ruleENumberPassed )
            	    {
            	    // InternalAnsibleDsl.g:2712:9: (lv_pause_4_0= ruleENumberPassed )
            	    // InternalAnsibleDsl.g:2713:10: lv_pause_4_0= ruleENumberPassed
            	    {

            	    										newCompositeNode(grammarAccess.getELoopControlAccess().getPauseENumberPassedParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_77);
            	    lv_pause_4_0=ruleENumberPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getELoopControlRule());
            	    										}
            	    										set(
            	    											current,
            	    											"pause",
            	    											lv_pause_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.ENumberPassed");
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
            	case 3 :
            	    // InternalAnsibleDsl.g:2736:3: ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2736:3: ({...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2737:4: {...}? => ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:2737:106: ( ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) ) )
            	    // InternalAnsibleDsl.g:2738:5: ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:2741:8: ({...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) ) )
            	    // InternalAnsibleDsl.g:2741:9: {...}? => (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "true");
            	    }
            	    // InternalAnsibleDsl.g:2741:18: (otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) ) )
            	    // InternalAnsibleDsl.g:2741:19: otherlv_5= 'index_var:' ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) )
            	    {
            	    otherlv_5=(Token)match(input,82,FOLLOW_20); 

            	    								newLeafNode(otherlv_5, grammarAccess.getELoopControlAccess().getIndex_varKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:2745:8: ( (lv_index_var_6_0= ruleEIndexOrLoopVariable ) )
            	    // InternalAnsibleDsl.g:2746:9: (lv_index_var_6_0= ruleEIndexOrLoopVariable )
            	    {
            	    // InternalAnsibleDsl.g:2746:9: (lv_index_var_6_0= ruleEIndexOrLoopVariable )
            	    // InternalAnsibleDsl.g:2747:10: lv_index_var_6_0= ruleEIndexOrLoopVariable
            	    {

            	    										newCompositeNode(grammarAccess.getELoopControlAccess().getIndex_varEIndexOrLoopVariableParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_77);
            	    lv_index_var_6_0=ruleEIndexOrLoopVariable();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getELoopControlRule());
            	    										}
            	    										set(
            	    											current,
            	    											"index_var",
            	    											lv_index_var_6_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EIndexOrLoopVariable");
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
            	case 4 :
            	    // InternalAnsibleDsl.g:2770:3: ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2770:3: ({...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2771:4: {...}? => ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:2771:106: ( ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) ) )
            	    // InternalAnsibleDsl.g:2772:5: ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:2775:8: ({...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) ) )
            	    // InternalAnsibleDsl.g:2775:9: {...}? => (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "true");
            	    }
            	    // InternalAnsibleDsl.g:2775:18: (otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) ) )
            	    // InternalAnsibleDsl.g:2775:19: otherlv_7= 'loop_var:' ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) )
            	    {
            	    otherlv_7=(Token)match(input,83,FOLLOW_20); 

            	    								newLeafNode(otherlv_7, grammarAccess.getELoopControlAccess().getLoop_varKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:2779:8: ( (lv_loop_var_8_0= ruleEIndexOrLoopVariable ) )
            	    // InternalAnsibleDsl.g:2780:9: (lv_loop_var_8_0= ruleEIndexOrLoopVariable )
            	    {
            	    // InternalAnsibleDsl.g:2780:9: (lv_loop_var_8_0= ruleEIndexOrLoopVariable )
            	    // InternalAnsibleDsl.g:2781:10: lv_loop_var_8_0= ruleEIndexOrLoopVariable
            	    {

            	    										newCompositeNode(grammarAccess.getELoopControlAccess().getLoop_varEIndexOrLoopVariableParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_77);
            	    lv_loop_var_8_0=ruleEIndexOrLoopVariable();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getELoopControlRule());
            	    										}
            	    										set(
            	    											current,
            	    											"loop_var",
            	    											lv_loop_var_8_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EIndexOrLoopVariable");
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
            	case 5 :
            	    // InternalAnsibleDsl.g:2804:3: ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2804:3: ({...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2805:4: {...}? => ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "getUnorderedGroupHelper().canSelect(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:2805:106: ( ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:2806:5: ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getELoopControlAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:2809:8: ({...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:2809:9: {...}? => (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleELoopControl", "true");
            	    }
            	    // InternalAnsibleDsl.g:2809:18: (otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:2809:19: otherlv_9= 'extended:' ( (lv_extended_10_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_9=(Token)match(input,84,FOLLOW_17); 

            	    								newLeafNode(otherlv_9, grammarAccess.getELoopControlAccess().getExtendedKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:2813:8: ( (lv_extended_10_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:2814:9: (lv_extended_10_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:2814:9: (lv_extended_10_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:2815:10: lv_extended_10_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getELoopControlAccess().getExtendedEBooleanPassedParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_77);
            	    lv_extended_10_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getELoopControlRule());
            	    										}
            	    										set(
            	    											current,
            	    											"extended",
            	    											lv_extended_10_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
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

            	default :
            	    break loop46;
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
    // InternalAnsibleDsl.g:2848:1: entryRuleEUntil returns [EObject current=null] : iv_ruleEUntil= ruleEUntil EOF ;
    public final EObject entryRuleEUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEUntil = null;


        try {
            // InternalAnsibleDsl.g:2848:47: (iv_ruleEUntil= ruleEUntil EOF )
            // InternalAnsibleDsl.g:2849:2: iv_ruleEUntil= ruleEUntil EOF
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
    // InternalAnsibleDsl.g:2855:1: ruleEUntil returns [EObject current=null] : (otherlv_0= 'until:' ( (lv_until_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEUntil() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_until_1_0 = null;

        EObject lv_retries_4_0 = null;

        EObject lv_delay_6_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2861:2: ( (otherlv_0= 'until:' ( (lv_until_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )* ) ) ) ) )
            // InternalAnsibleDsl.g:2862:2: (otherlv_0= 'until:' ( (lv_until_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalAnsibleDsl.g:2862:2: (otherlv_0= 'until:' ( (lv_until_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:2863:3: otherlv_0= 'until:' ( (lv_until_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,85,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getEUntilAccess().getUntilKeyword_0());
            		
            // InternalAnsibleDsl.g:2867:3: ( (lv_until_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            // InternalAnsibleDsl.g:2868:4: (lv_until_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            {
            // InternalAnsibleDsl.g:2868:4: (lv_until_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            // InternalAnsibleDsl.g:2869:5: lv_until_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            {

            					newCompositeNode(grammarAccess.getEUntilAccess().getUntilEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_79);
            lv_until_1_0=ruleEJinjaExpressionEvaluationWithoutBrackets();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEUntilRule());
            					}
            					set(
            						current,
            						"until",
            						lv_until_1_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionEvaluationWithoutBrackets");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:2886:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:2887:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:2887:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:2888:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEUntilAccess().getUnorderedGroup_2());
            				
            // InternalAnsibleDsl.g:2891:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:2892:6: ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:2892:6: ( ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) ) )*
            loop47:
            do {
                int alt47=3;
                int LA47_0 = input.LA(1);

                if ( LA47_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup_2(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup_2(), 1) ) {
                    alt47=2;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2893:4: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2893:4: ({...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2894:5: {...}? => ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:2894:103: ( ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:2895:6: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAnsibleDsl.g:2898:9: ({...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) ) )
            	    // InternalAnsibleDsl.g:2898:10: {...}? => (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:2898:19: (otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) ) )
            	    // InternalAnsibleDsl.g:2898:20: otherlv_3= 'retries:' ( (lv_retries_4_0= ruleENumberPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,86,FOLLOW_78); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEUntilAccess().getRetriesKeyword_2_0_0());
            	    								
            	    // InternalAnsibleDsl.g:2902:9: ( (lv_retries_4_0= ruleENumberPassed ) )
            	    // InternalAnsibleDsl.g:2903:10: (lv_retries_4_0= ruleENumberPassed )
            	    {
            	    // InternalAnsibleDsl.g:2903:10: (lv_retries_4_0= ruleENumberPassed )
            	    // InternalAnsibleDsl.g:2904:11: lv_retries_4_0= ruleENumberPassed
            	    {

            	    											newCompositeNode(grammarAccess.getEUntilAccess().getRetriesENumberPassedParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_79);
            	    lv_retries_4_0=ruleENumberPassed();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEUntilRule());
            	    											}
            	    											set(
            	    												current,
            	    												"retries",
            	    												lv_retries_4_0,
            	    												"org.sodalite.sdl.ansible.AnsibleDsl.ENumberPassed");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEUntilAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAnsibleDsl.g:2927:4: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2927:4: ({...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2928:5: {...}? => ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "getUnorderedGroupHelper().canSelect(grammarAccess.getEUntilAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:2928:103: ( ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:2929:6: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEUntilAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAnsibleDsl.g:2932:9: ({...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) ) )
            	    // InternalAnsibleDsl.g:2932:10: {...}? => (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEUntil", "true");
            	    }
            	    // InternalAnsibleDsl.g:2932:19: (otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) ) )
            	    // InternalAnsibleDsl.g:2932:20: otherlv_5= 'delay:' ( (lv_delay_6_0= ruleENumberPassed ) )
            	    {
            	    otherlv_5=(Token)match(input,87,FOLLOW_78); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEUntilAccess().getDelayKeyword_2_1_0());
            	    								
            	    // InternalAnsibleDsl.g:2936:9: ( (lv_delay_6_0= ruleENumberPassed ) )
            	    // InternalAnsibleDsl.g:2937:10: (lv_delay_6_0= ruleENumberPassed )
            	    {
            	    // InternalAnsibleDsl.g:2937:10: (lv_delay_6_0= ruleENumberPassed )
            	    // InternalAnsibleDsl.g:2938:11: lv_delay_6_0= ruleENumberPassed
            	    {

            	    											newCompositeNode(grammarAccess.getEUntilAccess().getDelayENumberPassedParserRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_79);
            	    lv_delay_6_0=ruleENumberPassed();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEUntilRule());
            	    											}
            	    											set(
            	    												current,
            	    												"delay",
            	    												lv_delay_6_0,
            	    												"org.sodalite.sdl.ansible.AnsibleDsl.ENumberPassed");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEUntilAccess().getUnorderedGroup_2());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEUntilAccess().getUnorderedGroup_2());
            				

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
    // $ANTLR end "ruleEUntil"


    // $ANTLR start "entryRuleEPrivilageEscalation"
    // InternalAnsibleDsl.g:2972:1: entryRuleEPrivilageEscalation returns [EObject current=null] : iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF ;
    public final EObject entryRuleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrivilageEscalation = null;


        try {
            // InternalAnsibleDsl.g:2972:61: (iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF )
            // InternalAnsibleDsl.g:2973:2: iv_ruleEPrivilageEscalation= ruleEPrivilageEscalation EOF
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
    // InternalAnsibleDsl.g:2979:1: ruleEPrivilageEscalation returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEPrivilageEscalation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_become_2_0 = null;

        EObject lv_become_exe_4_0 = null;

        EObject lv_become_flags_6_0 = null;

        EObject lv_become_method_8_0 = null;

        EObject lv_become_user_10_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:2985:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:2986:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:2986:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:2987:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:2987:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:2988:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:2991:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:2992:5: ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:2992:5: ( ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )*
            loop48:
            do {
                int alt48=6;
                int LA48_0 = input.LA(1);

                if ( LA48_0 == 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 0) ) {
                    alt48=1;
                }
                else if ( LA48_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 1) ) {
                    alt48=2;
                }
                else if ( LA48_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 2) ) {
                    alt48=3;
                }
                else if ( LA48_0 == 91 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 3) ) {
                    alt48=4;
                }
                else if ( LA48_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 4) ) {
                    alt48=5;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAnsibleDsl.g:2993:3: ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:2993:3: ({...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:2994:4: {...}? => ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:2994:114: ( ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:2995:5: ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:2998:8: ({...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:2998:9: {...}? => (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "true");
            	    }
            	    // InternalAnsibleDsl.g:2998:18: (otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:2998:19: otherlv_1= 'become:' ( (lv_become_2_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_1=(Token)match(input,88,FOLLOW_17); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPrivilageEscalationAccess().getBecomeKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3002:8: ( (lv_become_2_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3003:9: (lv_become_2_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3003:9: (lv_become_2_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3004:10: lv_become_2_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPrivilageEscalationAccess().getBecomeEBooleanPassedParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_80);
            	    lv_become_2_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPrivilageEscalationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"become",
            	    											lv_become_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3027:3: ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3027:3: ({...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3028:4: {...}? => ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3028:114: ( ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:3029:5: ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3032:8: ({...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:3032:9: {...}? => (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "true");
            	    }
            	    // InternalAnsibleDsl.g:3032:18: (otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:3032:19: otherlv_3= 'become_exe:' ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_3=(Token)match(input,89,FOLLOW_28); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPrivilageEscalationAccess().getBecome_exeKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3036:8: ( (lv_become_exe_4_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:3037:9: (lv_become_exe_4_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:3037:9: (lv_become_exe_4_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:3038:10: lv_become_exe_4_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getEPrivilageEscalationAccess().getBecome_exeEJinjaExpressionAndStringParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_80);
            	    lv_become_exe_4_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPrivilageEscalationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"become_exe",
            	    											lv_become_exe_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3061:3: ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3061:3: ({...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3062:4: {...}? => ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3062:114: ( ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:3063:5: ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3066:8: ({...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:3066:9: {...}? => (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "true");
            	    }
            	    // InternalAnsibleDsl.g:3066:18: (otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:3066:19: otherlv_5= 'become_flags:' ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_5=(Token)match(input,90,FOLLOW_28); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3070:8: ( (lv_become_flags_6_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:3071:9: (lv_become_flags_6_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:3071:9: (lv_become_flags_6_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:3072:10: lv_become_flags_6_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getEPrivilageEscalationAccess().getBecome_flagsEJinjaExpressionAndStringParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_80);
            	    lv_become_flags_6_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPrivilageEscalationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"become_flags",
            	    											lv_become_flags_6_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3095:3: ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3095:3: ({...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3096:4: {...}? => ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:3096:114: ( ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:3097:5: ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:3100:8: ({...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:3100:9: {...}? => (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "true");
            	    }
            	    // InternalAnsibleDsl.g:3100:18: (otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:3100:19: otherlv_7= 'become_method:' ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_7=(Token)match(input,91,FOLLOW_28); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPrivilageEscalationAccess().getBecome_methodKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:3104:8: ( (lv_become_method_8_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:3105:9: (lv_become_method_8_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:3105:9: (lv_become_method_8_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:3106:10: lv_become_method_8_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getEPrivilageEscalationAccess().getBecome_methodEJinjaExpressionAndStringParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_80);
            	    lv_become_method_8_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPrivilageEscalationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"become_method",
            	    											lv_become_method_8_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3129:3: ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3129:3: ({...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3130:4: {...}? => ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:3130:114: ( ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:3131:5: ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPrivilageEscalationAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:3134:8: ({...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:3134:9: {...}? => (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPrivilageEscalation", "true");
            	    }
            	    // InternalAnsibleDsl.g:3134:18: (otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:3134:19: otherlv_9= 'become_user:' ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_9=(Token)match(input,92,FOLLOW_28); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPrivilageEscalationAccess().getBecome_userKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:3138:8: ( (lv_become_user_10_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:3139:9: (lv_become_user_10_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:3139:9: (lv_become_user_10_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:3140:10: lv_become_user_10_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getEPrivilageEscalationAccess().getBecome_userEJinjaExpressionAndStringParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_80);
            	    lv_become_user_10_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPrivilageEscalationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"become_user",
            	    											lv_become_user_10_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    break loop48;
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
    // InternalAnsibleDsl.g:3173:1: entryRuleEValidationMode returns [EObject current=null] : iv_ruleEValidationMode= ruleEValidationMode EOF ;
    public final EObject entryRuleEValidationMode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidationMode = null;


        try {
            // InternalAnsibleDsl.g:3173:56: (iv_ruleEValidationMode= ruleEValidationMode EOF )
            // InternalAnsibleDsl.g:3174:2: iv_ruleEValidationMode= ruleEValidationMode EOF
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
    // InternalAnsibleDsl.g:3180:1: ruleEValidationMode returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEValidationMode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_check_mode_2_0 = null;

        EObject lv_diff_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3186:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3187:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3187:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3188:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3188:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3189:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEValidationModeAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3192:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3193:5: ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3193:5: ( ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            loop49:
            do {
                int alt49=3;
                int LA49_0 = input.LA(1);

                if ( LA49_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 1) ) {
                    alt49=2;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3194:3: ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3194:3: ({...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3195:4: {...}? => ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEValidationMode", "getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3195:109: ( ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3196:5: ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3199:8: ({...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3199:9: {...}? => (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEValidationMode", "true");
            	    }
            	    // InternalAnsibleDsl.g:3199:18: (otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:3199:19: otherlv_1= 'check_mode:' ( (lv_check_mode_2_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_1=(Token)match(input,93,FOLLOW_17); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEValidationModeAccess().getCheck_modeKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3203:8: ( (lv_check_mode_2_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3204:9: (lv_check_mode_2_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3204:9: (lv_check_mode_2_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3205:10: lv_check_mode_2_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEValidationModeAccess().getCheck_modeEBooleanPassedParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_81);
            	    lv_check_mode_2_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEValidationModeRule());
            	    										}
            	    										set(
            	    											current,
            	    											"check_mode",
            	    											lv_check_mode_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3228:3: ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3228:3: ({...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3229:4: {...}? => ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEValidationMode", "getUnorderedGroupHelper().canSelect(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3229:109: ( ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3230:5: ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEValidationModeAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3233:8: ({...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3233:9: {...}? => (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEValidationMode", "true");
            	    }
            	    // InternalAnsibleDsl.g:3233:18: (otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:3233:19: otherlv_3= 'diff:' ( (lv_diff_4_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,94,FOLLOW_17); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEValidationModeAccess().getDiffKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3237:8: ( (lv_diff_4_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3238:9: (lv_diff_4_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3238:9: (lv_diff_4_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3239:10: lv_diff_4_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEValidationModeAccess().getDiffEBooleanPassedParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_81);
            	    lv_diff_4_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEValidationModeRule());
            	    										}
            	    										set(
            	    											current,
            	    											"diff",
            	    											lv_diff_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    break loop49;
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
    // InternalAnsibleDsl.g:3272:1: entryRuleEConnection returns [EObject current=null] : iv_ruleEConnection= ruleEConnection EOF ;
    public final EObject entryRuleEConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConnection = null;


        try {
            // InternalAnsibleDsl.g:3272:52: (iv_ruleEConnection= ruleEConnection EOF )
            // InternalAnsibleDsl.g:3273:2: iv_ruleEConnection= ruleEConnection EOF
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
    // InternalAnsibleDsl.g:3279:1: ruleEConnection returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_connection_2_0 = null;

        EObject lv_port_4_0 = null;

        EObject lv_remote_user_6_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3285:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3286:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3286:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3287:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3287:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3288:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEConnectionAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3291:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3292:5: ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3292:5: ( ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )*
            loop50:
            do {
                int alt50=4;
                int LA50_0 = input.LA(1);

                if ( LA50_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 0) ) {
                    alt50=1;
                }
                else if ( LA50_0 == 96 && getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 1) ) {
                    alt50=2;
                }
                else if ( LA50_0 == 97 && getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 2) ) {
                    alt50=3;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3293:3: ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3293:3: ({...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3294:4: {...}? => ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3294:105: ( ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:3295:5: ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3298:8: ({...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:3298:9: {...}? => (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "true");
            	    }
            	    // InternalAnsibleDsl.g:3298:18: (otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:3298:19: otherlv_1= 'connection:' ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_1=(Token)match(input,95,FOLLOW_28); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEConnectionAccess().getConnectionKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3302:8: ( (lv_connection_2_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:3303:9: (lv_connection_2_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:3303:9: (lv_connection_2_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:3304:10: lv_connection_2_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getEConnectionAccess().getConnectionEJinjaExpressionAndStringParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_82);
            	    lv_connection_2_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEConnectionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"connection",
            	    											lv_connection_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3327:3: ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3327:3: ({...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3328:4: {...}? => ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3328:105: ( ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3329:5: ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3332:8: ({...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3332:9: {...}? => (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "true");
            	    }
            	    // InternalAnsibleDsl.g:3332:18: (otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) ) )
            	    // InternalAnsibleDsl.g:3332:19: otherlv_3= 'port:' ( (lv_port_4_0= ruleENumberPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,96,FOLLOW_78); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEConnectionAccess().getPortKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3336:8: ( (lv_port_4_0= ruleENumberPassed ) )
            	    // InternalAnsibleDsl.g:3337:9: (lv_port_4_0= ruleENumberPassed )
            	    {
            	    // InternalAnsibleDsl.g:3337:9: (lv_port_4_0= ruleENumberPassed )
            	    // InternalAnsibleDsl.g:3338:10: lv_port_4_0= ruleENumberPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEConnectionAccess().getPortENumberPassedParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_82);
            	    lv_port_4_0=ruleENumberPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEConnectionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"port",
            	    											lv_port_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.ENumberPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3361:3: ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3361:3: ({...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3362:4: {...}? => ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "getUnorderedGroupHelper().canSelect(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3362:105: ( ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:3363:5: ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEConnectionAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3366:8: ({...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:3366:9: {...}? => (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEConnection", "true");
            	    }
            	    // InternalAnsibleDsl.g:3366:18: (otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:3366:19: otherlv_5= 'remote_user:' ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_5=(Token)match(input,97,FOLLOW_28); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEConnectionAccess().getRemote_userKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3370:8: ( (lv_remote_user_6_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:3371:9: (lv_remote_user_6_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:3371:9: (lv_remote_user_6_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:3372:10: lv_remote_user_6_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getEConnectionAccess().getRemote_userEJinjaExpressionAndStringParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_82);
            	    lv_remote_user_6_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEConnectionRule());
            	    										}
            	    										set(
            	    											current,
            	    											"remote_user",
            	    											lv_remote_user_6_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    break loop50;
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
    // InternalAnsibleDsl.g:3405:1: entryRuleEPlayExeSettings returns [EObject current=null] : iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF ;
    public final EObject entryRuleEPlayExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayExeSettings = null;


        try {
            // InternalAnsibleDsl.g:3405:57: (iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF )
            // InternalAnsibleDsl.g:3406:2: iv_ruleEPlayExeSettings= ruleEPlayExeSettings EOF
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
    // InternalAnsibleDsl.g:3412:1: ruleEPlayExeSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEPlayExeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_strategy_2_0 = null;

        EObject lv_serial_list_4_0 = null;

        EObject lv_order_6_0 = null;

        EObject lv_throttle_8_0 = null;

        EObject lv_run_once_10_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3418:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3419:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3419:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3420:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3420:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3421:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3424:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3425:5: ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3425:5: ( ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            loop51:
            do {
                int alt51=6;
                int LA51_0 = input.LA(1);

                if ( LA51_0 == 98 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt51=1;
                }
                else if ( LA51_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt51=2;
                }
                else if ( LA51_0 == 100 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 2) ) {
                    alt51=3;
                }
                else if ( LA51_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 3) ) {
                    alt51=4;
                }
                else if ( LA51_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 4) ) {
                    alt51=5;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3426:3: ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3426:3: ({...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3427:4: {...}? => ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3427:110: ( ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:3428:5: ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3431:8: ({...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:3431:9: {...}? => (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3431:18: (otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:3431:19: otherlv_1= 'strategy:' ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_1=(Token)match(input,98,FOLLOW_28); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPlayExeSettingsAccess().getStrategyKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3435:8: ( (lv_strategy_2_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:3436:9: (lv_strategy_2_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:3436:9: (lv_strategy_2_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:3437:10: lv_strategy_2_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getStrategyEJinjaExpressionAndStringParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_83);
            	    lv_strategy_2_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayExeSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"strategy",
            	    											lv_strategy_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
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
            	case 2 :
            	    // InternalAnsibleDsl.g:3460:3: ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3460:3: ({...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3461:4: {...}? => ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3461:110: ( ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3462:5: ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3465:8: ({...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3465:9: {...}? => (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3465:18: (otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) ) )
            	    // InternalAnsibleDsl.g:3465:19: otherlv_3= 'serial:' ( (lv_serial_list_4_0= ruleEListPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,99,FOLLOW_19); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPlayExeSettingsAccess().getSerialKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3469:8: ( (lv_serial_list_4_0= ruleEListPassed ) )
            	    // InternalAnsibleDsl.g:3470:9: (lv_serial_list_4_0= ruleEListPassed )
            	    {
            	    // InternalAnsibleDsl.g:3470:9: (lv_serial_list_4_0= ruleEListPassed )
            	    // InternalAnsibleDsl.g:3471:10: lv_serial_list_4_0= ruleEListPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getSerial_listEListPassedParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_83);
            	    lv_serial_list_4_0=ruleEListPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayExeSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"serial_list",
            	    											lv_serial_list_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EListPassed");
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
            	    // InternalAnsibleDsl.g:3494:3: ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3494:3: ({...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3495:4: {...}? => ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3495:110: ( ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:3496:5: ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3499:8: ({...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:3499:9: {...}? => (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3499:18: (otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:3499:19: otherlv_5= 'order:' ( (lv_order_6_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_5=(Token)match(input,100,FOLLOW_28); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPlayExeSettingsAccess().getOrderKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3503:8: ( (lv_order_6_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:3504:9: (lv_order_6_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:3504:9: (lv_order_6_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:3505:10: lv_order_6_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getOrderEJinjaExpressionAndStringParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_83);
            	    lv_order_6_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayExeSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"order",
            	    											lv_order_6_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
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
            	case 4 :
            	    // InternalAnsibleDsl.g:3528:3: ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3528:3: ({...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3529:4: {...}? => ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:3529:110: ( ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3530:5: ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:3533:8: ({...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3533:9: {...}? => (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3533:18: (otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) ) )
            	    // InternalAnsibleDsl.g:3533:19: otherlv_7= 'throttle:' ( (lv_throttle_8_0= ruleENumberPassed ) )
            	    {
            	    otherlv_7=(Token)match(input,101,FOLLOW_78); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPlayExeSettingsAccess().getThrottleKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:3537:8: ( (lv_throttle_8_0= ruleENumberPassed ) )
            	    // InternalAnsibleDsl.g:3538:9: (lv_throttle_8_0= ruleENumberPassed )
            	    {
            	    // InternalAnsibleDsl.g:3538:9: (lv_throttle_8_0= ruleENumberPassed )
            	    // InternalAnsibleDsl.g:3539:10: lv_throttle_8_0= ruleENumberPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getThrottleENumberPassedParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_83);
            	    lv_throttle_8_0=ruleENumberPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayExeSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"throttle",
            	    											lv_throttle_8_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.ENumberPassed");
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
            	case 5 :
            	    // InternalAnsibleDsl.g:3562:3: ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3562:3: ({...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3563:4: {...}? => ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:3563:110: ( ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3564:5: ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayExeSettingsAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:3567:8: ({...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3567:9: {...}? => (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3567:18: (otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:3567:19: otherlv_9= 'run_once:' ( (lv_run_once_10_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_9=(Token)match(input,102,FOLLOW_17); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPlayExeSettingsAccess().getRun_onceKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:3571:8: ( (lv_run_once_10_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3572:9: (lv_run_once_10_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3572:9: (lv_run_once_10_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3573:10: lv_run_once_10_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayExeSettingsAccess().getRun_onceEBooleanPassedParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_83);
            	    lv_run_once_10_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayExeSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"run_once",
            	    											lv_run_once_10_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
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

            	default :
            	    break loop51;
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
    // InternalAnsibleDsl.g:3606:1: entryRuleEExecutionExeSettings returns [EObject current=null] : iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF ;
    public final EObject entryRuleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEExecutionExeSettings = null;


        try {
            // InternalAnsibleDsl.g:3606:62: (iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF )
            // InternalAnsibleDsl.g:3607:2: iv_ruleEExecutionExeSettings= ruleEExecutionExeSettings EOF
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
    // InternalAnsibleDsl.g:3613:1: ruleEExecutionExeSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEExecutionExeSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_throttle_2_0 = null;

        EObject lv_run_once_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3619:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3620:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3620:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3621:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3621:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3622:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3625:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3626:5: ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3626:5: ( ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            loop52:
            do {
                int alt52=3;
                int LA52_0 = input.LA(1);

                if ( LA52_0 == 101 && getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt52=1;
                }
                else if ( LA52_0 == 102 && getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt52=2;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3627:3: ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3627:3: ({...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3628:4: {...}? => ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3628:115: ( ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3629:5: ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3632:8: ({...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3632:9: {...}? => (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3632:18: (otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) ) )
            	    // InternalAnsibleDsl.g:3632:19: otherlv_1= 'throttle:' ( (lv_throttle_2_0= ruleENumberPassed ) )
            	    {
            	    otherlv_1=(Token)match(input,101,FOLLOW_78); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEExecutionExeSettingsAccess().getThrottleKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3636:8: ( (lv_throttle_2_0= ruleENumberPassed ) )
            	    // InternalAnsibleDsl.g:3637:9: (lv_throttle_2_0= ruleENumberPassed )
            	    {
            	    // InternalAnsibleDsl.g:3637:9: (lv_throttle_2_0= ruleENumberPassed )
            	    // InternalAnsibleDsl.g:3638:10: lv_throttle_2_0= ruleENumberPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEExecutionExeSettingsAccess().getThrottleENumberPassedParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_84);
            	    lv_throttle_2_0=ruleENumberPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEExecutionExeSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"throttle",
            	    											lv_throttle_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.ENumberPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3661:3: ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3661:3: ({...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3662:4: {...}? => ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionExeSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3662:115: ( ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3663:5: ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEExecutionExeSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3666:8: ({...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3666:9: {...}? => (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEExecutionExeSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:3666:18: (otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:3666:19: otherlv_3= 'run_once:' ( (lv_run_once_4_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,102,FOLLOW_17); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEExecutionExeSettingsAccess().getRun_onceKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3670:8: ( (lv_run_once_4_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3671:9: (lv_run_once_4_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3671:9: (lv_run_once_4_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3672:10: lv_run_once_4_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEExecutionExeSettingsAccess().getRun_onceEBooleanPassedParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_84);
            	    lv_run_once_4_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEExecutionExeSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"run_once",
            	    											lv_run_once_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    break loop52;
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
    // InternalAnsibleDsl.g:3705:1: entryRuleEBlockErrorHandling returns [EObject current=null] : iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF ;
    public final EObject entryRuleEBlockErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBlockErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:3705:60: (iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF )
            // InternalAnsibleDsl.g:3706:2: iv_ruleEBlockErrorHandling= ruleEBlockErrorHandling EOF
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
    // InternalAnsibleDsl.g:3712:1: ruleEBlockErrorHandling returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEBlockErrorHandling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_any_errors_fatal_2_0 = null;

        EObject lv_ignore_errors_4_0 = null;

        EObject lv_ignore_unreachable_6_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3718:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3719:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3719:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3720:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3720:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3721:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3724:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3725:5: ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3725:5: ( ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            loop53:
            do {
                int alt53=4;
                int LA53_0 = input.LA(1);

                if ( LA53_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 1) ) {
                    alt53=2;
                }
                else if ( LA53_0 == 105 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 2) ) {
                    alt53=3;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3726:3: ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3726:3: ({...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3727:4: {...}? => ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3727:113: ( ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3728:5: ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3731:8: ({...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3731:9: {...}? => (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3731:18: (otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:3731:19: otherlv_1= 'any_errors_fatal:' ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_1=(Token)match(input,103,FOLLOW_17); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3735:8: ( (lv_any_errors_fatal_2_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3736:9: (lv_any_errors_fatal_2_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3736:9: (lv_any_errors_fatal_2_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3737:10: lv_any_errors_fatal_2_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEBlockErrorHandlingAccess().getAny_errors_fatalEBooleanPassedParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_85);
            	    lv_any_errors_fatal_2_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBlockErrorHandlingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"any_errors_fatal",
            	    											lv_any_errors_fatal_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3760:3: ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3760:3: ({...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3761:4: {...}? => ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3761:113: ( ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3762:5: ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3765:8: ({...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3765:9: {...}? => (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3765:18: (otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:3765:19: otherlv_3= 'ignore_errors:' ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,104,FOLLOW_17); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3769:8: ( (lv_ignore_errors_4_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3770:9: (lv_ignore_errors_4_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3770:9: (lv_ignore_errors_4_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3771:10: lv_ignore_errors_4_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEBlockErrorHandlingAccess().getIgnore_errorsEBooleanPassedParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_85);
            	    lv_ignore_errors_4_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBlockErrorHandlingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"ignore_errors",
            	    											lv_ignore_errors_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3794:3: ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3794:3: ({...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3795:4: {...}? => ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3795:113: ( ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3796:5: ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEBlockErrorHandlingAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3799:8: ({...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3799:9: {...}? => (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEBlockErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3799:18: (otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:3799:19: otherlv_5= 'ignore_unreachable:' ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_5=(Token)match(input,105,FOLLOW_17); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3803:8: ( (lv_ignore_unreachable_6_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3804:9: (lv_ignore_unreachable_6_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3804:9: (lv_ignore_unreachable_6_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3805:10: lv_ignore_unreachable_6_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEBlockErrorHandlingAccess().getIgnore_unreachableEBooleanPassedParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_85);
            	    lv_ignore_unreachable_6_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEBlockErrorHandlingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"ignore_unreachable",
            	    											lv_ignore_unreachable_6_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    break loop53;
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
    // InternalAnsibleDsl.g:3838:1: entryRuleEPlayErrorHandling returns [EObject current=null] : iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF ;
    public final EObject entryRuleEPlayErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPlayErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:3838:59: (iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF )
            // InternalAnsibleDsl.g:3839:2: iv_ruleEPlayErrorHandling= ruleEPlayErrorHandling EOF
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
    // InternalAnsibleDsl.g:3845:1: ruleEPlayErrorHandling returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEPlayErrorHandling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_max_fail_percentage_2_0 = null;

        EObject lv_any_errors_fatal_4_0 = null;

        EObject lv_ignore_errors_6_0 = null;

        EObject lv_ignore_unreachable_8_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:3851:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:3852:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:3852:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:3853:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:3853:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:3854:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:3857:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:3858:5: ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:3858:5: ( ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            loop54:
            do {
                int alt54=5;
                int LA54_0 = input.LA(1);

                if ( LA54_0 == 106 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 0) ) {
                    alt54=1;
                }
                else if ( LA54_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 1) ) {
                    alt54=2;
                }
                else if ( LA54_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 2) ) {
                    alt54=3;
                }
                else if ( LA54_0 == 105 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 3) ) {
                    alt54=4;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalAnsibleDsl.g:3859:3: ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3859:3: ({...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3860:4: {...}? => ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:3860:112: ( ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3861:5: ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:3864:8: ({...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3864:9: {...}? => (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3864:18: (otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) ) )
            	    // InternalAnsibleDsl.g:3864:19: otherlv_1= 'max_fail_percentage:' ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) )
            	    {
            	    otherlv_1=(Token)match(input,106,FOLLOW_78); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:3868:8: ( (lv_max_fail_percentage_2_0= ruleENumberPassed ) )
            	    // InternalAnsibleDsl.g:3869:9: (lv_max_fail_percentage_2_0= ruleENumberPassed )
            	    {
            	    // InternalAnsibleDsl.g:3869:9: (lv_max_fail_percentage_2_0= ruleENumberPassed )
            	    // InternalAnsibleDsl.g:3870:10: lv_max_fail_percentage_2_0= ruleENumberPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayErrorHandlingAccess().getMax_fail_percentageENumberPassedParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_86);
            	    lv_max_fail_percentage_2_0=ruleENumberPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayErrorHandlingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"max_fail_percentage",
            	    											lv_max_fail_percentage_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.ENumberPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3893:3: ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3893:3: ({...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3894:4: {...}? => ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:3894:112: ( ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3895:5: ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:3898:8: ({...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3898:9: {...}? => (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3898:18: (otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:3898:19: otherlv_3= 'any_errors_fatal:' ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,103,FOLLOW_17); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:3902:8: ( (lv_any_errors_fatal_4_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3903:9: (lv_any_errors_fatal_4_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3903:9: (lv_any_errors_fatal_4_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3904:10: lv_any_errors_fatal_4_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayErrorHandlingAccess().getAny_errors_fatalEBooleanPassedParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_86);
            	    lv_any_errors_fatal_4_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayErrorHandlingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"any_errors_fatal",
            	    											lv_any_errors_fatal_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3927:3: ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3927:3: ({...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3928:4: {...}? => ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:3928:112: ( ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3929:5: ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:3932:8: ({...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3932:9: {...}? => (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3932:18: (otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:3932:19: otherlv_5= 'ignore_errors:' ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_5=(Token)match(input,104,FOLLOW_17); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:3936:8: ( (lv_ignore_errors_6_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3937:9: (lv_ignore_errors_6_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3937:9: (lv_ignore_errors_6_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3938:10: lv_ignore_errors_6_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayErrorHandlingAccess().getIgnore_errorsEBooleanPassedParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_86);
            	    lv_ignore_errors_6_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayErrorHandlingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"ignore_errors",
            	    											lv_ignore_errors_6_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:3961:3: ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:3961:3: ({...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:3962:4: {...}? => ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:3962:112: ( ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:3963:5: ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPlayErrorHandlingAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:3966:8: ({...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:3966:9: {...}? => (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPlayErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:3966:18: (otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:3966:19: otherlv_7= 'ignore_unreachable:' ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_7=(Token)match(input,105,FOLLOW_17); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:3970:8: ( (lv_ignore_unreachable_8_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:3971:9: (lv_ignore_unreachable_8_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:3971:9: (lv_ignore_unreachable_8_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:3972:10: lv_ignore_unreachable_8_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEPlayErrorHandlingAccess().getIgnore_unreachableEBooleanPassedParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_86);
            	    lv_ignore_unreachable_8_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPlayErrorHandlingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"ignore_unreachable",
            	    											lv_ignore_unreachable_8_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    break loop54;
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
    // InternalAnsibleDsl.g:4005:1: entryRuleETaskHandlerErrorHandling returns [EObject current=null] : iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF ;
    public final EObject entryRuleETaskHandlerErrorHandling() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETaskHandlerErrorHandling = null;


        try {
            // InternalAnsibleDsl.g:4005:66: (iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF )
            // InternalAnsibleDsl.g:4006:2: iv_ruleETaskHandlerErrorHandling= ruleETaskHandlerErrorHandling EOF
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
    // InternalAnsibleDsl.g:4012:1: ruleETaskHandlerErrorHandling returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleETaskHandlerErrorHandling() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_changed_when_2_0 = null;

        EObject lv_failed_when_4_0 = null;

        EObject lv_any_errors_fatal_6_0 = null;

        EObject lv_ignore_errors_8_0 = null;

        EObject lv_ignore_unreachable_10_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4018:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:4019:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:4019:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:4020:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:4020:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:4021:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4024:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:4025:5: ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:4025:5: ( ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            loop55:
            do {
                int alt55=6;
                int LA55_0 = input.LA(1);

                if ( LA55_0 == 107 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 0) ) {
                    alt55=1;
                }
                else if ( LA55_0 == 108 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 1) ) {
                    alt55=2;
                }
                else if ( LA55_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 2) ) {
                    alt55=3;
                }
                else if ( LA55_0 == 104 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 3) ) {
                    alt55=4;
                }
                else if ( LA55_0 == 105 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 4) ) {
                    alt55=5;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4026:3: ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4026:3: ({...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4027:4: {...}? => ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4027:119: ( ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    // InternalAnsibleDsl.g:4028:5: ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4031:8: ({...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    // InternalAnsibleDsl.g:4031:9: {...}? => (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:4031:18: (otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    // InternalAnsibleDsl.g:4031:19: otherlv_1= 'changed_when:' ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    {
            	    otherlv_1=(Token)match(input,107,FOLLOW_25); 

            	    								newLeafNode(otherlv_1, grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4035:8: ( (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    // InternalAnsibleDsl.g:4036:9: (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    {
            	    // InternalAnsibleDsl.g:4036:9: (lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    // InternalAnsibleDsl.g:4037:10: lv_changed_when_2_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getChanged_whenEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_87);
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
            	    // InternalAnsibleDsl.g:4060:3: ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4060:3: ({...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4061:4: {...}? => ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4061:119: ( ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) ) )
            	    // InternalAnsibleDsl.g:4062:5: ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4065:8: ({...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) ) )
            	    // InternalAnsibleDsl.g:4065:9: {...}? => (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:4065:18: (otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) )
            	    // InternalAnsibleDsl.g:4065:19: otherlv_3= 'failed_when:' ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    {
            	    otherlv_3=(Token)match(input,108,FOLLOW_25); 

            	    								newLeafNode(otherlv_3, grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4069:8: ( (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            	    // InternalAnsibleDsl.g:4070:9: (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    {
            	    // InternalAnsibleDsl.g:4070:9: (lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            	    // InternalAnsibleDsl.g:4071:10: lv_failed_when_4_0= ruleEJinjaExpressionEvaluationWithoutBrackets
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getFailed_whenEJinjaExpressionEvaluationWithoutBracketsParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_87);
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
            	    // InternalAnsibleDsl.g:4094:3: ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4094:3: ({...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4095:4: {...}? => ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:4095:119: ( ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:4096:5: ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:4099:8: ({...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:4099:9: {...}? => (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:4099:18: (otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:4099:19: otherlv_5= 'any_errors_fatal:' ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_5=(Token)match(input,103,FOLLOW_17); 

            	    								newLeafNode(otherlv_5, grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:4103:8: ( (lv_any_errors_fatal_6_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:4104:9: (lv_any_errors_fatal_6_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:4104:9: (lv_any_errors_fatal_6_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:4105:10: lv_any_errors_fatal_6_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getAny_errors_fatalEBooleanPassedParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_87);
            	    lv_any_errors_fatal_6_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETaskHandlerErrorHandlingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"any_errors_fatal",
            	    											lv_any_errors_fatal_6_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
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
            	case 4 :
            	    // InternalAnsibleDsl.g:4128:3: ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4128:3: ({...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4129:4: {...}? => ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:4129:119: ( ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:4130:5: ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:4133:8: ({...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:4133:9: {...}? => (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:4133:18: (otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:4133:19: otherlv_7= 'ignore_errors:' ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_7=(Token)match(input,104,FOLLOW_17); 

            	    								newLeafNode(otherlv_7, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:4137:8: ( (lv_ignore_errors_8_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:4138:9: (lv_ignore_errors_8_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:4138:9: (lv_ignore_errors_8_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:4139:10: lv_ignore_errors_8_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_errorsEBooleanPassedParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_87);
            	    lv_ignore_errors_8_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETaskHandlerErrorHandlingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"ignore_errors",
            	    											lv_ignore_errors_8_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
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
            	case 5 :
            	    // InternalAnsibleDsl.g:4162:3: ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4162:3: ({...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4163:4: {...}? => ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalAnsibleDsl.g:4163:119: ( ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:4164:5: ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getETaskHandlerErrorHandlingAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalAnsibleDsl.g:4167:8: ({...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:4167:9: {...}? => (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleETaskHandlerErrorHandling", "true");
            	    }
            	    // InternalAnsibleDsl.g:4167:18: (otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:4167:19: otherlv_9= 'ignore_unreachable:' ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_9=(Token)match(input,105,FOLLOW_17); 

            	    								newLeafNode(otherlv_9, grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableKeyword_4_0());
            	    							
            	    // InternalAnsibleDsl.g:4171:8: ( (lv_ignore_unreachable_10_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:4172:9: (lv_ignore_unreachable_10_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:4172:9: (lv_ignore_unreachable_10_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:4173:10: lv_ignore_unreachable_10_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getETaskHandlerErrorHandlingAccess().getIgnore_unreachableEBooleanPassedParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_87);
            	    lv_ignore_unreachable_10_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getETaskHandlerErrorHandlingRule());
            	    										}
            	    										set(
            	    											current,
            	    											"ignore_unreachable",
            	    											lv_ignore_unreachable_10_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
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

            	default :
            	    break loop55;
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
    // InternalAnsibleDsl.g:4206:1: entryRuleEFactsSettings returns [EObject current=null] : iv_ruleEFactsSettings= ruleEFactsSettings EOF ;
    public final EObject entryRuleEFactsSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFactsSettings = null;


        try {
            // InternalAnsibleDsl.g:4206:55: (iv_ruleEFactsSettings= ruleEFactsSettings EOF )
            // InternalAnsibleDsl.g:4207:2: iv_ruleEFactsSettings= ruleEFactsSettings EOF
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
    // InternalAnsibleDsl.g:4213:1: ruleEFactsSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEFactsSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_gather_facts_2_0 = null;

        EObject lv_gather_subset_4_0 = null;

        EObject lv_gather_timeout_6_0 = null;

        EObject lv_fact_path_8_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4219:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:4220:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:4220:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:4221:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:4221:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:4222:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4225:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:4226:5: ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:4226:5: ( ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) )*
            loop56:
            do {
                int alt56=5;
                int LA56_0 = input.LA(1);

                if ( LA56_0 == 109 && getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt56=1;
                }
                else if ( LA56_0 == 110 && getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt56=2;
                }
                else if ( LA56_0 == 111 && getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 2) ) {
                    alt56=3;
                }
                else if ( LA56_0 == 112 && getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 3) ) {
                    alt56=4;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4227:3: ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4227:3: ({...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4228:4: {...}? => ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4228:108: ( ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:4229:5: ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4232:8: ({...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:4232:9: {...}? => (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4232:18: (otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:4232:19: otherlv_1= 'gather_facts:' ( (lv_gather_facts_2_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_1=(Token)match(input,109,FOLLOW_17); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEFactsSettingsAccess().getGather_factsKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4236:8: ( (lv_gather_facts_2_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:4237:9: (lv_gather_facts_2_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:4237:9: (lv_gather_facts_2_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:4238:10: lv_gather_facts_2_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEFactsSettingsAccess().getGather_factsEBooleanPassedParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_88);
            	    lv_gather_facts_2_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEFactsSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"gather_facts",
            	    											lv_gather_facts_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
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
            	case 2 :
            	    // InternalAnsibleDsl.g:4261:3: ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4261:3: ({...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4262:4: {...}? => ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4262:108: ( ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:4263:5: ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4266:8: ({...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) ) )
            	    // InternalAnsibleDsl.g:4266:9: {...}? => (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4266:18: (otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) ) )
            	    // InternalAnsibleDsl.g:4266:19: otherlv_3= 'gather_subset:' ( (lv_gather_subset_4_0= ruleEListPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,110,FOLLOW_19); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEFactsSettingsAccess().getGather_subsetKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4270:8: ( (lv_gather_subset_4_0= ruleEListPassed ) )
            	    // InternalAnsibleDsl.g:4271:9: (lv_gather_subset_4_0= ruleEListPassed )
            	    {
            	    // InternalAnsibleDsl.g:4271:9: (lv_gather_subset_4_0= ruleEListPassed )
            	    // InternalAnsibleDsl.g:4272:10: lv_gather_subset_4_0= ruleEListPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEFactsSettingsAccess().getGather_subsetEListPassedParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_88);
            	    lv_gather_subset_4_0=ruleEListPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEFactsSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"gather_subset",
            	    											lv_gather_subset_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EListPassed");
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
            	    // InternalAnsibleDsl.g:4295:3: ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4295:3: ({...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4296:4: {...}? => ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalAnsibleDsl.g:4296:108: ( ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:4297:5: ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalAnsibleDsl.g:4300:8: ({...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) ) )
            	    // InternalAnsibleDsl.g:4300:9: {...}? => (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4300:18: (otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) ) )
            	    // InternalAnsibleDsl.g:4300:19: otherlv_5= 'gather_timeout:' ( (lv_gather_timeout_6_0= ruleENumberPassed ) )
            	    {
            	    otherlv_5=(Token)match(input,111,FOLLOW_78); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEFactsSettingsAccess().getGather_timeoutKeyword_2_0());
            	    							
            	    // InternalAnsibleDsl.g:4304:8: ( (lv_gather_timeout_6_0= ruleENumberPassed ) )
            	    // InternalAnsibleDsl.g:4305:9: (lv_gather_timeout_6_0= ruleENumberPassed )
            	    {
            	    // InternalAnsibleDsl.g:4305:9: (lv_gather_timeout_6_0= ruleENumberPassed )
            	    // InternalAnsibleDsl.g:4306:10: lv_gather_timeout_6_0= ruleENumberPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEFactsSettingsAccess().getGather_timeoutENumberPassedParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_88);
            	    lv_gather_timeout_6_0=ruleENumberPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEFactsSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"gather_timeout",
            	    											lv_gather_timeout_6_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.ENumberPassed");
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
            	case 4 :
            	    // InternalAnsibleDsl.g:4329:3: ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4329:3: ({...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4330:4: {...}? => ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalAnsibleDsl.g:4330:108: ( ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:4331:5: ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEFactsSettingsAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalAnsibleDsl.g:4334:8: ({...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:4334:9: {...}? => (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEFactsSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4334:18: (otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:4334:19: otherlv_7= 'fact_path:' ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_7=(Token)match(input,112,FOLLOW_28); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEFactsSettingsAccess().getFact_pathKeyword_3_0());
            	    							
            	    // InternalAnsibleDsl.g:4338:8: ( (lv_fact_path_8_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:4339:9: (lv_fact_path_8_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:4339:9: (lv_fact_path_8_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:4340:10: lv_fact_path_8_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getEFactsSettingsAccess().getFact_pathEJinjaExpressionAndStringParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_88);
            	    lv_fact_path_8_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEFactsSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"fact_path",
            	    											lv_fact_path_8_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
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

            	default :
            	    break loop56;
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
    // InternalAnsibleDsl.g:4373:1: entryRuleEDelegation returns [EObject current=null] : iv_ruleEDelegation= ruleEDelegation EOF ;
    public final EObject entryRuleEDelegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDelegation = null;


        try {
            // InternalAnsibleDsl.g:4373:52: (iv_ruleEDelegation= ruleEDelegation EOF )
            // InternalAnsibleDsl.g:4374:2: iv_ruleEDelegation= ruleEDelegation EOF
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
    // InternalAnsibleDsl.g:4380:1: ruleEDelegation returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEDelegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_delegate_to_2_0 = null;

        EObject lv_delegate_facts_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4386:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:4387:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:4387:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:4388:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:4388:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:4389:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEDelegationAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4392:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:4393:5: ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:4393:5: ( ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) ) )*
            loop57:
            do {
                int alt57=3;
                int LA57_0 = input.LA(1);

                if ( LA57_0 == 113 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 0) ) {
                    alt57=1;
                }
                else if ( LA57_0 == 114 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 1) ) {
                    alt57=2;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4394:3: ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4394:3: ({...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4395:4: {...}? => ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEDelegation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4395:105: ( ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) ) )
            	    // InternalAnsibleDsl.g:4396:5: ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4399:8: ({...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) ) )
            	    // InternalAnsibleDsl.g:4399:9: {...}? => (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDelegation", "true");
            	    }
            	    // InternalAnsibleDsl.g:4399:18: (otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) ) )
            	    // InternalAnsibleDsl.g:4399:19: otherlv_1= 'delegate_to:' ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) )
            	    {
            	    otherlv_1=(Token)match(input,113,FOLLOW_28); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEDelegationAccess().getDelegate_toKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4403:8: ( (lv_delegate_to_2_0= ruleEJinjaExpressionAndString ) )
            	    // InternalAnsibleDsl.g:4404:9: (lv_delegate_to_2_0= ruleEJinjaExpressionAndString )
            	    {
            	    // InternalAnsibleDsl.g:4404:9: (lv_delegate_to_2_0= ruleEJinjaExpressionAndString )
            	    // InternalAnsibleDsl.g:4405:10: lv_delegate_to_2_0= ruleEJinjaExpressionAndString
            	    {

            	    										newCompositeNode(grammarAccess.getEDelegationAccess().getDelegate_toEJinjaExpressionAndStringParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_89);
            	    lv_delegate_to_2_0=ruleEJinjaExpressionAndString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEDelegationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"delegate_to",
            	    											lv_delegate_to_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EJinjaExpressionAndString");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:4428:3: ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4428:3: ({...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4429:4: {...}? => ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEDelegation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4429:105: ( ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:4430:5: ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEDelegationAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4433:8: ({...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) ) )
            	    // InternalAnsibleDsl.g:4433:9: {...}? => (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDelegation", "true");
            	    }
            	    // InternalAnsibleDsl.g:4433:18: (otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) ) )
            	    // InternalAnsibleDsl.g:4433:19: otherlv_3= 'delegate_facts:' ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,114,FOLLOW_17); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEDelegationAccess().getDelegate_factsKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4437:8: ( (lv_delegate_facts_4_0= ruleEBooleanPassed ) )
            	    // InternalAnsibleDsl.g:4438:9: (lv_delegate_facts_4_0= ruleEBooleanPassed )
            	    {
            	    // InternalAnsibleDsl.g:4438:9: (lv_delegate_facts_4_0= ruleEBooleanPassed )
            	    // InternalAnsibleDsl.g:4439:10: lv_delegate_facts_4_0= ruleEBooleanPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEDelegationAccess().getDelegate_factsEBooleanPassedParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_89);
            	    lv_delegate_facts_4_0=ruleEBooleanPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEDelegationRule());
            	    										}
            	    										set(
            	    											current,
            	    											"delegate_facts",
            	    											lv_delegate_facts_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.EBooleanPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    break loop57;
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
    // InternalAnsibleDsl.g:4472:1: entryRuleEAsynchronousSettings returns [EObject current=null] : iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF ;
    public final EObject entryRuleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAsynchronousSettings = null;


        try {
            // InternalAnsibleDsl.g:4472:62: (iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF )
            // InternalAnsibleDsl.g:4473:2: iv_ruleEAsynchronousSettings= ruleEAsynchronousSettings EOF
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
    // InternalAnsibleDsl.g:4479:1: ruleEAsynchronousSettings returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleEAsynchronousSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_async_2_0 = null;

        EObject lv_poll_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4485:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) ) )* ) ) ) )
            // InternalAnsibleDsl.g:4486:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) ) )* ) ) )
            {
            // InternalAnsibleDsl.g:4486:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) ) )* ) ) )
            // InternalAnsibleDsl.g:4487:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) ) )* ) )
            {
            // InternalAnsibleDsl.g:4487:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) ) )* ) )
            // InternalAnsibleDsl.g:4488:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup());
            			
            // InternalAnsibleDsl.g:4491:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) ) )* )
            // InternalAnsibleDsl.g:4492:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) ) )*
            {
            // InternalAnsibleDsl.g:4492:5: ( ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) ) )*
            loop58:
            do {
                int alt58=3;
                int LA58_0 = input.LA(1);

                if ( LA58_0 == 115 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
                    alt58=1;
                }
                else if ( LA58_0 == 116 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
                    alt58=2;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4493:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4493:3: ({...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4494:4: {...}? => ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalAnsibleDsl.g:4494:115: ( ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:4495:5: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalAnsibleDsl.g:4498:8: ({...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) ) )
            	    // InternalAnsibleDsl.g:4498:9: {...}? => (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4498:18: (otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) ) )
            	    // InternalAnsibleDsl.g:4498:19: otherlv_1= 'async:' ( (lv_async_2_0= ruleENumberPassed ) )
            	    {
            	    otherlv_1=(Token)match(input,115,FOLLOW_78); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAsynchronousSettingsAccess().getAsyncKeyword_0_0());
            	    							
            	    // InternalAnsibleDsl.g:4502:8: ( (lv_async_2_0= ruleENumberPassed ) )
            	    // InternalAnsibleDsl.g:4503:9: (lv_async_2_0= ruleENumberPassed )
            	    {
            	    // InternalAnsibleDsl.g:4503:9: (lv_async_2_0= ruleENumberPassed )
            	    // InternalAnsibleDsl.g:4504:10: lv_async_2_0= ruleENumberPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEAsynchronousSettingsAccess().getAsyncENumberPassedParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_90);
            	    lv_async_2_0=ruleENumberPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAsynchronousSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"async",
            	    											lv_async_2_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.ENumberPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    // InternalAnsibleDsl.g:4527:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) )
            	    {
            	    // InternalAnsibleDsl.g:4527:3: ({...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) ) )
            	    // InternalAnsibleDsl.g:4528:4: {...}? => ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalAnsibleDsl.g:4528:115: ( ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) ) )
            	    // InternalAnsibleDsl.g:4529:5: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAsynchronousSettingsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalAnsibleDsl.g:4532:8: ({...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) ) )
            	    // InternalAnsibleDsl.g:4532:9: {...}? => (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAsynchronousSettings", "true");
            	    }
            	    // InternalAnsibleDsl.g:4532:18: (otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) ) )
            	    // InternalAnsibleDsl.g:4532:19: otherlv_3= 'poll:' ( (lv_poll_4_0= ruleENumberPassed ) )
            	    {
            	    otherlv_3=(Token)match(input,116,FOLLOW_78); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAsynchronousSettingsAccess().getPollKeyword_1_0());
            	    							
            	    // InternalAnsibleDsl.g:4536:8: ( (lv_poll_4_0= ruleENumberPassed ) )
            	    // InternalAnsibleDsl.g:4537:9: (lv_poll_4_0= ruleENumberPassed )
            	    {
            	    // InternalAnsibleDsl.g:4537:9: (lv_poll_4_0= ruleENumberPassed )
            	    // InternalAnsibleDsl.g:4538:10: lv_poll_4_0= ruleENumberPassed
            	    {

            	    										newCompositeNode(grammarAccess.getEAsynchronousSettingsAccess().getPollENumberPassedParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_90);
            	    lv_poll_4_0=ruleENumberPassed();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEAsynchronousSettingsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"poll",
            	    											lv_poll_4_0,
            	    											"org.sodalite.sdl.ansible.AnsibleDsl.ENumberPassed");
            	    										afterParserOrEnumRuleCall();
            	    									

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
            	    break loop58;
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
    // InternalAnsibleDsl.g:4571:1: entryRuleENotifiable returns [EObject current=null] : iv_ruleENotifiable= ruleENotifiable EOF ;
    public final EObject entryRuleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiable = null;


        try {
            // InternalAnsibleDsl.g:4571:52: (iv_ruleENotifiable= ruleENotifiable EOF )
            // InternalAnsibleDsl.g:4572:2: iv_ruleENotifiable= ruleENotifiable EOF
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
    // InternalAnsibleDsl.g:4578:1: ruleENotifiable returns [EObject current=null] : (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) ;
    public final EObject ruleENotifiable() throws RecognitionException {
        EObject current = null;

        EObject this_ENotifiedHandler_0 = null;

        EObject this_ENotifiedTopic_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4584:2: ( (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic ) )
            // InternalAnsibleDsl.g:4585:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            {
            // InternalAnsibleDsl.g:4585:2: (this_ENotifiedHandler_0= ruleENotifiedHandler | this_ENotifiedTopic_1= ruleENotifiedTopic )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING) ) {
                alt59=1;
            }
            else if ( (LA59_0==117) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalAnsibleDsl.g:4586:3: this_ENotifiedHandler_0= ruleENotifiedHandler
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
                    // InternalAnsibleDsl.g:4595:3: this_ENotifiedTopic_1= ruleENotifiedTopic
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
    // InternalAnsibleDsl.g:4607:1: entryRuleENotifiedHandler returns [EObject current=null] : iv_ruleENotifiedHandler= ruleENotifiedHandler EOF ;
    public final EObject entryRuleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedHandler = null;


        try {
            // InternalAnsibleDsl.g:4607:57: (iv_ruleENotifiedHandler= ruleENotifiedHandler EOF )
            // InternalAnsibleDsl.g:4608:2: iv_ruleENotifiedHandler= ruleENotifiedHandler EOF
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
    // InternalAnsibleDsl.g:4614:1: ruleENotifiedHandler returns [EObject current=null] : ( (otherlv_0= RULE_STRING ) ) ;
    public final EObject ruleENotifiedHandler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4620:2: ( ( (otherlv_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4621:2: ( (otherlv_0= RULE_STRING ) )
            {
            // InternalAnsibleDsl.g:4621:2: ( (otherlv_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4622:3: (otherlv_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4622:3: (otherlv_0= RULE_STRING )
            // InternalAnsibleDsl.g:4623:4: otherlv_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4637:1: entryRuleENotifiedTopic returns [EObject current=null] : iv_ruleENotifiedTopic= ruleENotifiedTopic EOF ;
    public final EObject entryRuleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENotifiedTopic = null;


        try {
            // InternalAnsibleDsl.g:4637:55: (iv_ruleENotifiedTopic= ruleENotifiedTopic EOF )
            // InternalAnsibleDsl.g:4638:2: iv_ruleENotifiedTopic= ruleENotifiedTopic EOF
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
    // InternalAnsibleDsl.g:4644:1: ruleENotifiedTopic returns [EObject current=null] : (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleENotifiedTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4650:2: ( (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:4651:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:4651:2: (otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:4652:3: otherlv_0= 'topic:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,117,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getENotifiedTopicAccess().getTopicKeyword_0());
            		
            // InternalAnsibleDsl.g:4656:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalAnsibleDsl.g:4657:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalAnsibleDsl.g:4657:4: (lv_name_1_0= RULE_STRING )
            // InternalAnsibleDsl.g:4658:5: lv_name_1_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4678:1: entryRuleEJinjaExpressionOrString returns [EObject current=null] : iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF ;
    public final EObject entryRuleEJinjaExpressionOrString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionOrString = null;


        try {
            // InternalAnsibleDsl.g:4678:65: (iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF )
            // InternalAnsibleDsl.g:4679:2: iv_ruleEJinjaExpressionOrString= ruleEJinjaExpressionOrString EOF
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
    // InternalAnsibleDsl.g:4685:1: ruleEJinjaExpressionOrString returns [EObject current=null] : (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEJinjaExpressionOrString() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject this_EJinjaExpressionEvaluation_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4691:2: ( (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:4692:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:4692:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_string_1_0= RULE_STRING ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==119) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_STRING) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalAnsibleDsl.g:4693:3: this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation
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
                    // InternalAnsibleDsl.g:4702:3: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:4702:3: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:4703:4: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:4703:4: (lv_string_1_0= RULE_STRING )
                    // InternalAnsibleDsl.g:4704:5: lv_string_1_0= RULE_STRING
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
    // InternalAnsibleDsl.g:4724:1: entryRuleEJinjaExpressionAndString returns [EObject current=null] : iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF ;
    public final EObject entryRuleEJinjaExpressionAndString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionAndString = null;


        try {
            // InternalAnsibleDsl.g:4724:66: (iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF )
            // InternalAnsibleDsl.g:4725:2: iv_ruleEJinjaExpressionAndString= ruleEJinjaExpressionAndString EOF
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
    // InternalAnsibleDsl.g:4731:1: ruleEJinjaExpressionAndString returns [EObject current=null] : ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+ ;
    public final EObject ruleEJinjaExpressionAndString() throws RecognitionException {
        EObject current = null;

        EObject lv_jinja_expression_and_string_0_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4737:2: ( ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+ )
            // InternalAnsibleDsl.g:4738:2: ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+
            {
            // InternalAnsibleDsl.g:4738:2: ( (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_STRING||LA61_0==119) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalAnsibleDsl.g:4739:3: (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString )
            	    {
            	    // InternalAnsibleDsl.g:4739:3: (lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString )
            	    // InternalAnsibleDsl.g:4740:4: lv_jinja_expression_and_string_0_0= ruleEJinjaExpressionOrString
            	    {

            	    				newCompositeNode(grammarAccess.getEJinjaExpressionAndStringAccess().getJinja_expression_and_stringEJinjaExpressionOrStringParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_91);
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
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
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
    // InternalAnsibleDsl.g:4760:1: entryRuleEValuePassed returns [EObject current=null] : iv_ruleEValuePassed= ruleEValuePassed EOF ;
    public final EObject entryRuleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassed = null;


        try {
            // InternalAnsibleDsl.g:4760:53: (iv_ruleEValuePassed= ruleEValuePassed EOF )
            // InternalAnsibleDsl.g:4761:2: iv_ruleEValuePassed= ruleEValuePassed EOF
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
    // InternalAnsibleDsl.g:4767:1: ruleEValuePassed returns [EObject current=null] : (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString ) ;
    public final EObject ruleEValuePassed() throws RecognitionException {
        EObject current = null;

        EObject this_EJinjaExpressionAndString_0 = null;

        EObject this_EValueWithoutString_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4773:2: ( (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString ) )
            // InternalAnsibleDsl.g:4774:2: (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString )
            {
            // InternalAnsibleDsl.g:4774:2: (this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString | this_EValueWithoutString_1= ruleEValueWithoutString )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_STRING||LA62_0==119) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=RULE_BOOLEAN && LA62_0<=RULE_NONE)||LA62_0==144||LA62_0==157) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalAnsibleDsl.g:4775:3: this_EJinjaExpressionAndString_0= ruleEJinjaExpressionAndString
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
                    // InternalAnsibleDsl.g:4784:3: this_EValueWithoutString_1= ruleEValueWithoutString
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
    // InternalAnsibleDsl.g:4796:1: entryRuleEValuePassedToJinjaExpression returns [EObject current=null] : iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF ;
    public final EObject entryRuleEValuePassedToJinjaExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValuePassedToJinjaExpression = null;


        try {
            // InternalAnsibleDsl.g:4796:70: (iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF )
            // InternalAnsibleDsl.g:4797:2: iv_ruleEValuePassedToJinjaExpression= ruleEValuePassedToJinjaExpression EOF
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
    // InternalAnsibleDsl.g:4803:1: ruleEValuePassedToJinjaExpression returns [EObject current=null] : (this_EValue_0= ruleEValue | this_ESpecialVariable_1= ruleESpecialVariable | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall ) ;
    public final EObject ruleEValuePassedToJinjaExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EValue_0 = null;

        EObject this_ESpecialVariable_1 = null;

        EObject this_EItem_2 = null;

        EObject this_EVariableReference_3 = null;

        EObject this_EFunctionCall_4 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4809:2: ( (this_EValue_0= ruleEValue | this_ESpecialVariable_1= ruleESpecialVariable | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall ) )
            // InternalAnsibleDsl.g:4810:2: (this_EValue_0= ruleEValue | this_ESpecialVariable_1= ruleESpecialVariable | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall )
            {
            // InternalAnsibleDsl.g:4810:2: (this_EValue_0= ruleEValue | this_ESpecialVariable_1= ruleESpecialVariable | this_EItem_2= ruleEItem | this_EVariableReference_3= ruleEVariableReference | this_EFunctionCall_4= ruleEFunctionCall )
            int alt63=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_BOOLEAN:
            case RULE_NULL:
            case RULE_NUMBER:
            case RULE_NONE:
            case 144:
            case 157:
                {
                alt63=1;
                }
                break;
            case 156:
                {
                alt63=2;
                }
                break;
            case 118:
                {
                alt63=3;
                }
                break;
            case 150:
            case 151:
            case 152:
            case 154:
            case 155:
                {
                alt63=4;
                }
                break;
            case RULE_ID:
                {
                alt63=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalAnsibleDsl.g:4811:3: this_EValue_0= ruleEValue
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
                    // InternalAnsibleDsl.g:4820:3: this_ESpecialVariable_1= ruleESpecialVariable
                    {

                    			newCompositeNode(grammarAccess.getEValuePassedToJinjaExpressionAccess().getESpecialVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESpecialVariable_1=ruleESpecialVariable();

                    state._fsp--;


                    			current = this_ESpecialVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:4829:3: this_EItem_2= ruleEItem
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
                    // InternalAnsibleDsl.g:4838:3: this_EVariableReference_3= ruleEVariableReference
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
                    // InternalAnsibleDsl.g:4847:3: this_EFunctionCall_4= ruleEFunctionCall
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
    // InternalAnsibleDsl.g:4859:1: entryRuleEComposedValue returns [EObject current=null] : iv_ruleEComposedValue= ruleEComposedValue EOF ;
    public final EObject entryRuleEComposedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEComposedValue = null;


        try {
            // InternalAnsibleDsl.g:4859:55: (iv_ruleEComposedValue= ruleEComposedValue EOF )
            // InternalAnsibleDsl.g:4860:2: iv_ruleEComposedValue= ruleEComposedValue EOF
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
    // InternalAnsibleDsl.g:4866:1: ruleEComposedValue returns [EObject current=null] : (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList ) ;
    public final EObject ruleEComposedValue() throws RecognitionException {
        EObject current = null;

        EObject this_EDictionary_0 = null;

        EObject this_EList_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4872:2: ( (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList ) )
            // InternalAnsibleDsl.g:4873:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList )
            {
            // InternalAnsibleDsl.g:4873:2: (this_EDictionary_0= ruleEDictionary | this_EList_1= ruleEList )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==157) ) {
                alt64=1;
            }
            else if ( (LA64_0==144) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalAnsibleDsl.g:4874:3: this_EDictionary_0= ruleEDictionary
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
                    // InternalAnsibleDsl.g:4883:3: this_EList_1= ruleEList
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
    // InternalAnsibleDsl.g:4895:1: entryRuleEValue returns [EObject current=null] : iv_ruleEValue= ruleEValue EOF ;
    public final EObject entryRuleEValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValue = null;


        try {
            // InternalAnsibleDsl.g:4895:47: (iv_ruleEValue= ruleEValue EOF )
            // InternalAnsibleDsl.g:4896:2: iv_ruleEValue= ruleEValue EOF
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
    // InternalAnsibleDsl.g:4902:1: ruleEValue returns [EObject current=null] : (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue ) ;
    public final EObject ruleEValue() throws RecognitionException {
        EObject current = null;

        EObject this_EComposedValue_0 = null;

        EObject this_ESimpleValue_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4908:2: ( (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue ) )
            // InternalAnsibleDsl.g:4909:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue )
            {
            // InternalAnsibleDsl.g:4909:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValue_1= ruleESimpleValue )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==144||LA65_0==157) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_STRING||(LA65_0>=RULE_BOOLEAN && LA65_0<=RULE_NONE)) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalAnsibleDsl.g:4910:3: this_EComposedValue_0= ruleEComposedValue
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
                    // InternalAnsibleDsl.g:4919:3: this_ESimpleValue_1= ruleESimpleValue
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
    // InternalAnsibleDsl.g:4931:1: entryRuleEValueWithoutString returns [EObject current=null] : iv_ruleEValueWithoutString= ruleEValueWithoutString EOF ;
    public final EObject entryRuleEValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueWithoutString = null;


        try {
            // InternalAnsibleDsl.g:4931:60: (iv_ruleEValueWithoutString= ruleEValueWithoutString EOF )
            // InternalAnsibleDsl.g:4932:2: iv_ruleEValueWithoutString= ruleEValueWithoutString EOF
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
    // InternalAnsibleDsl.g:4938:1: ruleEValueWithoutString returns [EObject current=null] : (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString ) ;
    public final EObject ruleEValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject this_EComposedValue_0 = null;

        EObject this_ESimpleValueWithoutString_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:4944:2: ( (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString ) )
            // InternalAnsibleDsl.g:4945:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString )
            {
            // InternalAnsibleDsl.g:4945:2: (this_EComposedValue_0= ruleEComposedValue | this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==144||LA66_0==157) ) {
                alt66=1;
            }
            else if ( ((LA66_0>=RULE_BOOLEAN && LA66_0<=RULE_NONE)) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalAnsibleDsl.g:4946:3: this_EComposedValue_0= ruleEComposedValue
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
                    // InternalAnsibleDsl.g:4955:3: this_ESimpleValueWithoutString_1= ruleESimpleValueWithoutString
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
    // InternalAnsibleDsl.g:4967:1: entryRuleESimpleValueWithoutString returns [EObject current=null] : iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF ;
    public final EObject entryRuleESimpleValueWithoutString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESimpleValueWithoutString = null;


        try {
            // InternalAnsibleDsl.g:4967:66: (iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF )
            // InternalAnsibleDsl.g:4968:2: iv_ruleESimpleValueWithoutString= ruleESimpleValueWithoutString EOF
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
    // InternalAnsibleDsl.g:4974:1: ruleESimpleValueWithoutString returns [EObject current=null] : ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) | ( (lv_simple_value_3_0= RULE_NONE ) ) ) ;
    public final EObject ruleESimpleValueWithoutString() throws RecognitionException {
        EObject current = null;

        Token lv_simple_value_0_0=null;
        Token lv_simple_value_1_0=null;
        Token lv_simple_value_2_0=null;
        Token lv_simple_value_3_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:4980:2: ( ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) | ( (lv_simple_value_3_0= RULE_NONE ) ) ) )
            // InternalAnsibleDsl.g:4981:2: ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) | ( (lv_simple_value_3_0= RULE_NONE ) ) )
            {
            // InternalAnsibleDsl.g:4981:2: ( ( (lv_simple_value_0_0= RULE_BOOLEAN ) ) | ( (lv_simple_value_1_0= RULE_NULL ) ) | ( (lv_simple_value_2_0= RULE_NUMBER ) ) | ( (lv_simple_value_3_0= RULE_NONE ) ) )
            int alt67=4;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
                {
                alt67=1;
                }
                break;
            case RULE_NULL:
                {
                alt67=2;
                }
                break;
            case RULE_NUMBER:
                {
                alt67=3;
                }
                break;
            case RULE_NONE:
                {
                alt67=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalAnsibleDsl.g:4982:3: ( (lv_simple_value_0_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:4982:3: ( (lv_simple_value_0_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:4983:4: (lv_simple_value_0_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:4983:4: (lv_simple_value_0_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:4984:5: lv_simple_value_0_0= RULE_BOOLEAN
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
                    // InternalAnsibleDsl.g:5001:3: ( (lv_simple_value_1_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:5001:3: ( (lv_simple_value_1_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:5002:4: (lv_simple_value_1_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:5002:4: (lv_simple_value_1_0= RULE_NULL )
                    // InternalAnsibleDsl.g:5003:5: lv_simple_value_1_0= RULE_NULL
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
                    // InternalAnsibleDsl.g:5020:3: ( (lv_simple_value_2_0= RULE_NUMBER ) )
                    {
                    // InternalAnsibleDsl.g:5020:3: ( (lv_simple_value_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:5021:4: (lv_simple_value_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:5021:4: (lv_simple_value_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:5022:5: lv_simple_value_2_0= RULE_NUMBER
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
                case 4 :
                    // InternalAnsibleDsl.g:5039:3: ( (lv_simple_value_3_0= RULE_NONE ) )
                    {
                    // InternalAnsibleDsl.g:5039:3: ( (lv_simple_value_3_0= RULE_NONE ) )
                    // InternalAnsibleDsl.g:5040:4: (lv_simple_value_3_0= RULE_NONE )
                    {
                    // InternalAnsibleDsl.g:5040:4: (lv_simple_value_3_0= RULE_NONE )
                    // InternalAnsibleDsl.g:5041:5: lv_simple_value_3_0= RULE_NONE
                    {
                    lv_simple_value_3_0=(Token)match(input,RULE_NONE,FOLLOW_2); 

                    					newLeafNode(lv_simple_value_3_0, grammarAccess.getESimpleValueWithoutStringAccess().getSimple_valueNONETerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getESimpleValueWithoutStringRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"simple_value",
                    						lv_simple_value_3_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NONE");
                    				

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
    // InternalAnsibleDsl.g:5061:1: entryRuleESimpleValue returns [EObject current=null] : iv_ruleESimpleValue= ruleESimpleValue EOF ;
    public final EObject entryRuleESimpleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESimpleValue = null;


        try {
            // InternalAnsibleDsl.g:5061:53: (iv_ruleESimpleValue= ruleESimpleValue EOF )
            // InternalAnsibleDsl.g:5062:2: iv_ruleESimpleValue= ruleESimpleValue EOF
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
    // InternalAnsibleDsl.g:5068:1: ruleESimpleValue returns [EObject current=null] : ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) ) ;
    public final EObject ruleESimpleValue() throws RecognitionException {
        EObject current = null;

        Token lv_simple_value_string_0_0=null;
        EObject lv_simple_value_without_string_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5074:2: ( ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) ) )
            // InternalAnsibleDsl.g:5075:2: ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) )
            {
            // InternalAnsibleDsl.g:5075:2: ( ( (lv_simple_value_string_0_0= RULE_STRING ) ) | ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING) ) {
                alt68=1;
            }
            else if ( ((LA68_0>=RULE_BOOLEAN && LA68_0<=RULE_NONE)) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalAnsibleDsl.g:5076:3: ( (lv_simple_value_string_0_0= RULE_STRING ) )
                    {
                    // InternalAnsibleDsl.g:5076:3: ( (lv_simple_value_string_0_0= RULE_STRING ) )
                    // InternalAnsibleDsl.g:5077:4: (lv_simple_value_string_0_0= RULE_STRING )
                    {
                    // InternalAnsibleDsl.g:5077:4: (lv_simple_value_string_0_0= RULE_STRING )
                    // InternalAnsibleDsl.g:5078:5: lv_simple_value_string_0_0= RULE_STRING
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
                    // InternalAnsibleDsl.g:5095:3: ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) )
                    {
                    // InternalAnsibleDsl.g:5095:3: ( (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString ) )
                    // InternalAnsibleDsl.g:5096:4: (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString )
                    {
                    // InternalAnsibleDsl.g:5096:4: (lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString )
                    // InternalAnsibleDsl.g:5097:5: lv_simple_value_without_string_1_0= ruleESimpleValueWithoutString
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
    // InternalAnsibleDsl.g:5118:1: entryRuleEItem returns [EObject current=null] : iv_ruleEItem= ruleEItem EOF ;
    public final EObject entryRuleEItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEItem = null;


        try {
            // InternalAnsibleDsl.g:5118:46: (iv_ruleEItem= ruleEItem EOF )
            // InternalAnsibleDsl.g:5119:2: iv_ruleEItem= ruleEItem EOF
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
    // InternalAnsibleDsl.g:5125:1: ruleEItem returns [EObject current=null] : ( () otherlv_1= 'item' ) ;
    public final EObject ruleEItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:5131:2: ( ( () otherlv_1= 'item' ) )
            // InternalAnsibleDsl.g:5132:2: ( () otherlv_1= 'item' )
            {
            // InternalAnsibleDsl.g:5132:2: ( () otherlv_1= 'item' )
            // InternalAnsibleDsl.g:5133:3: () otherlv_1= 'item'
            {
            // InternalAnsibleDsl.g:5133:3: ()
            // InternalAnsibleDsl.g:5134:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEItemAccess().getEItemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,118,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getEItemAccess().getItemKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalAnsibleDsl.g:5148:1: entryRuleEJinjaExpressionEvaluation returns [EObject current=null] : iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF ;
    public final EObject entryRuleEJinjaExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionEvaluation = null;


        try {
            // InternalAnsibleDsl.g:5148:67: (iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF )
            // InternalAnsibleDsl.g:5149:2: iv_ruleEJinjaExpressionEvaluation= ruleEJinjaExpressionEvaluation EOF
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
    // InternalAnsibleDsl.g:5155:1: ruleEJinjaExpressionEvaluation returns [EObject current=null] : (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' ) ;
    public final EObject ruleEJinjaExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_jinja_expression_1_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5161:2: ( (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' ) )
            // InternalAnsibleDsl.g:5162:2: (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' )
            {
            // InternalAnsibleDsl.g:5162:2: (otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}' )
            // InternalAnsibleDsl.g:5163:3: otherlv_0= '{{' ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) ) otherlv_2= '}}'
            {
            otherlv_0=(Token)match(input,119,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getEJinjaExpressionEvaluationAccess().getLeftCurlyBracketLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:5167:3: ( (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets ) )
            // InternalAnsibleDsl.g:5168:4: (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            {
            // InternalAnsibleDsl.g:5168:4: (lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets )
            // InternalAnsibleDsl.g:5169:5: lv_jinja_expression_1_0= ruleEJinjaExpressionEvaluationWithoutBrackets
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

            otherlv_2=(Token)match(input,120,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:5194:1: entryRuleEJinjaExpressionEvaluationWithoutBrackets returns [EObject current=null] : iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF ;
    public final EObject entryRuleEJinjaExpressionEvaluationWithoutBrackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEJinjaExpressionEvaluationWithoutBrackets = null;


        try {
            // InternalAnsibleDsl.g:5194:82: (iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF )
            // InternalAnsibleDsl.g:5195:2: iv_ruleEJinjaExpressionEvaluationWithoutBrackets= ruleEJinjaExpressionEvaluationWithoutBrackets EOF
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
    // InternalAnsibleDsl.g:5201:1: ruleEJinjaExpressionEvaluationWithoutBrackets returns [EObject current=null] : (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression ) ;
    public final EObject ruleEJinjaExpressionEvaluationWithoutBrackets() throws RecognitionException {
        EObject current = null;

        EObject this_EFilteredExpression_0 = null;

        EObject this_EIfExpression_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5207:2: ( (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression ) )
            // InternalAnsibleDsl.g:5208:2: (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression )
            {
            // InternalAnsibleDsl.g:5208:2: (this_EFilteredExpression_0= ruleEFilteredExpression | this_EIfExpression_1= ruleEIfExpression )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_NONE)||LA69_0==118||LA69_0==121||LA69_0==144||(LA69_0>=150 && LA69_0<=152)||(LA69_0>=154 && LA69_0<=157)) ) {
                alt69=1;
            }
            else if ( (LA69_0==147) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalAnsibleDsl.g:5209:3: this_EFilteredExpression_0= ruleEFilteredExpression
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
                    // InternalAnsibleDsl.g:5218:3: this_EIfExpression_1= ruleEIfExpression
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
    // InternalAnsibleDsl.g:5230:1: entryRuleEFunctionCall returns [EObject current=null] : iv_ruleEFunctionCall= ruleEFunctionCall EOF ;
    public final EObject entryRuleEFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunctionCall = null;


        try {
            // InternalAnsibleDsl.g:5230:54: (iv_ruleEFunctionCall= ruleEFunctionCall EOF )
            // InternalAnsibleDsl.g:5231:2: iv_ruleEFunctionCall= ruleEFunctionCall EOF
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
    // InternalAnsibleDsl.g:5237:1: ruleEFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | ( (lv_empty_brackets_6_0= '()' ) ) )? ) ;
    public final EObject ruleEFunctionCall() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_empty_brackets_6_0=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5243:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | ( (lv_empty_brackets_6_0= '()' ) ) )? ) )
            // InternalAnsibleDsl.g:5244:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | ( (lv_empty_brackets_6_0= '()' ) ) )? )
            {
            // InternalAnsibleDsl.g:5244:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | ( (lv_empty_brackets_6_0= '()' ) ) )? )
            // InternalAnsibleDsl.g:5245:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | ( (lv_empty_brackets_6_0= '()' ) ) )?
            {
            // InternalAnsibleDsl.g:5245:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:5246:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:5246:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:5247:5: lv_name_0_0= RULE_ID
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

            // InternalAnsibleDsl.g:5263:3: ( (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' ) | ( (lv_empty_brackets_6_0= '()' ) ) )?
            int alt71=3;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==121) ) {
                alt71=1;
            }
            else if ( (LA71_0==124) ) {
                alt71=2;
            }
            switch (alt71) {
                case 1 :
                    // InternalAnsibleDsl.g:5264:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' )
                    {
                    // InternalAnsibleDsl.g:5264:4: (otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')' )
                    // InternalAnsibleDsl.g:5265:5: otherlv_1= '(' ( (lv_parameters_2_0= ruleEFilteredExpression ) ) (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,121,FOLLOW_94); 

                    					newLeafNode(otherlv_1, grammarAccess.getEFunctionCallAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalAnsibleDsl.g:5269:5: ( (lv_parameters_2_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:5270:6: (lv_parameters_2_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:5270:6: (lv_parameters_2_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:5271:7: lv_parameters_2_0= ruleEFilteredExpression
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

                    // InternalAnsibleDsl.g:5288:5: (otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==122) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalAnsibleDsl.g:5289:6: otherlv_3= ',' ( (lv_parameters_4_0= ruleEFilteredExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,122,FOLLOW_94); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getEFunctionCallAccess().getCommaKeyword_1_0_2_0());
                    	    					
                    	    // InternalAnsibleDsl.g:5293:6: ( (lv_parameters_4_0= ruleEFilteredExpression ) )
                    	    // InternalAnsibleDsl.g:5294:7: (lv_parameters_4_0= ruleEFilteredExpression )
                    	    {
                    	    // InternalAnsibleDsl.g:5294:7: (lv_parameters_4_0= ruleEFilteredExpression )
                    	    // InternalAnsibleDsl.g:5295:8: lv_parameters_4_0= ruleEFilteredExpression
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

                    otherlv_5=(Token)match(input,123,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getEFunctionCallAccess().getRightParenthesisKeyword_1_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:5319:4: ( (lv_empty_brackets_6_0= '()' ) )
                    {
                    // InternalAnsibleDsl.g:5319:4: ( (lv_empty_brackets_6_0= '()' ) )
                    // InternalAnsibleDsl.g:5320:5: (lv_empty_brackets_6_0= '()' )
                    {
                    // InternalAnsibleDsl.g:5320:5: (lv_empty_brackets_6_0= '()' )
                    // InternalAnsibleDsl.g:5321:6: lv_empty_brackets_6_0= '()'
                    {
                    lv_empty_brackets_6_0=(Token)match(input,124,FOLLOW_2); 

                    						newLeafNode(lv_empty_brackets_6_0, grammarAccess.getEFunctionCallAccess().getEmpty_bracketsLeftParenthesisRightParenthesisKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEFunctionCallRule());
                    						}
                    						setWithLastConsumed(current, "empty_brackets", lv_empty_brackets_6_0, "()");
                    					

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
    // $ANTLR end "ruleEFunctionCall"


    // $ANTLR start "entryRuleEFilteredExpression"
    // InternalAnsibleDsl.g:5338:1: entryRuleEFilteredExpression returns [EObject current=null] : iv_ruleEFilteredExpression= ruleEFilteredExpression EOF ;
    public final EObject entryRuleEFilteredExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFilteredExpression = null;


        try {
            // InternalAnsibleDsl.g:5338:60: (iv_ruleEFilteredExpression= ruleEFilteredExpression EOF )
            // InternalAnsibleDsl.g:5339:2: iv_ruleEFilteredExpression= ruleEFilteredExpression EOF
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
    // InternalAnsibleDsl.g:5345:1: ruleEFilteredExpression returns [EObject current=null] : ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '|' ( (lv_filter_2_0= ruleEFilteredExpression ) ) )? ) ;
    public final EObject ruleEFilteredExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_to_filter_0_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5351:2: ( ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '|' ( (lv_filter_2_0= ruleEFilteredExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5352:2: ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '|' ( (lv_filter_2_0= ruleEFilteredExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5352:2: ( ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '|' ( (lv_filter_2_0= ruleEFilteredExpression ) ) )? )
            // InternalAnsibleDsl.g:5353:3: ( (lv_to_filter_0_0= ruleEOrExpression ) ) (otherlv_1= '|' ( (lv_filter_2_0= ruleEFilteredExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5353:3: ( (lv_to_filter_0_0= ruleEOrExpression ) )
            // InternalAnsibleDsl.g:5354:4: (lv_to_filter_0_0= ruleEOrExpression )
            {
            // InternalAnsibleDsl.g:5354:4: (lv_to_filter_0_0= ruleEOrExpression )
            // InternalAnsibleDsl.g:5355:5: lv_to_filter_0_0= ruleEOrExpression
            {

            					newCompositeNode(grammarAccess.getEFilteredExpressionAccess().getTo_filterEOrExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_96);
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

            // InternalAnsibleDsl.g:5372:3: (otherlv_1= '|' ( (lv_filter_2_0= ruleEFilteredExpression ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==125) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalAnsibleDsl.g:5373:4: otherlv_1= '|' ( (lv_filter_2_0= ruleEFilteredExpression ) )
                    {
                    otherlv_1=(Token)match(input,125,FOLLOW_94); 

                    				newLeafNode(otherlv_1, grammarAccess.getEFilteredExpressionAccess().getVerticalLineKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5377:4: ( (lv_filter_2_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:5378:5: (lv_filter_2_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:5378:5: (lv_filter_2_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:5379:6: lv_filter_2_0= ruleEFilteredExpression
                    {

                    						newCompositeNode(grammarAccess.getEFilteredExpressionAccess().getFilterEFilteredExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_filter_2_0=ruleEFilteredExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEFilteredExpressionRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_2_0,
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
    // InternalAnsibleDsl.g:5401:1: entryRuleEOrExpression returns [EObject current=null] : iv_ruleEOrExpression= ruleEOrExpression EOF ;
    public final EObject entryRuleEOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOrExpression = null;


        try {
            // InternalAnsibleDsl.g:5401:54: (iv_ruleEOrExpression= ruleEOrExpression EOF )
            // InternalAnsibleDsl.g:5402:2: iv_ruleEOrExpression= ruleEOrExpression EOF
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
    // InternalAnsibleDsl.g:5408:1: ruleEOrExpression returns [EObject current=null] : ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? ) ;
    public final EObject ruleEOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_or_0_0 = null;

        EObject lv_right_or_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5414:2: ( ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5415:2: ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5415:2: ( ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )? )
            // InternalAnsibleDsl.g:5416:3: ( (lv_left_or_0_0= ruleEAndExpression ) ) (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5416:3: ( (lv_left_or_0_0= ruleEAndExpression ) )
            // InternalAnsibleDsl.g:5417:4: (lv_left_or_0_0= ruleEAndExpression )
            {
            // InternalAnsibleDsl.g:5417:4: (lv_left_or_0_0= ruleEAndExpression )
            // InternalAnsibleDsl.g:5418:5: lv_left_or_0_0= ruleEAndExpression
            {

            					newCompositeNode(grammarAccess.getEOrExpressionAccess().getLeft_orEAndExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_97);
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

            // InternalAnsibleDsl.g:5435:3: (otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==126) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalAnsibleDsl.g:5436:4: otherlv_1= 'or' ( (lv_right_or_2_0= ruleEOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,126,FOLLOW_94); 

                    				newLeafNode(otherlv_1, grammarAccess.getEOrExpressionAccess().getOrKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5440:4: ( (lv_right_or_2_0= ruleEOrExpression ) )
                    // InternalAnsibleDsl.g:5441:5: (lv_right_or_2_0= ruleEOrExpression )
                    {
                    // InternalAnsibleDsl.g:5441:5: (lv_right_or_2_0= ruleEOrExpression )
                    // InternalAnsibleDsl.g:5442:6: lv_right_or_2_0= ruleEOrExpression
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
    // InternalAnsibleDsl.g:5464:1: entryRuleEAndExpression returns [EObject current=null] : iv_ruleEAndExpression= ruleEAndExpression EOF ;
    public final EObject entryRuleEAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAndExpression = null;


        try {
            // InternalAnsibleDsl.g:5464:55: (iv_ruleEAndExpression= ruleEAndExpression EOF )
            // InternalAnsibleDsl.g:5465:2: iv_ruleEAndExpression= ruleEAndExpression EOF
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
    // InternalAnsibleDsl.g:5471:1: ruleEAndExpression returns [EObject current=null] : ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? ) ;
    public final EObject ruleEAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_and_0_0 = null;

        EObject lv_right_and_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5477:2: ( ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5478:2: ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5478:2: ( ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )? )
            // InternalAnsibleDsl.g:5479:3: ( (lv_left_and_0_0= ruleETruthExpression ) ) (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5479:3: ( (lv_left_and_0_0= ruleETruthExpression ) )
            // InternalAnsibleDsl.g:5480:4: (lv_left_and_0_0= ruleETruthExpression )
            {
            // InternalAnsibleDsl.g:5480:4: (lv_left_and_0_0= ruleETruthExpression )
            // InternalAnsibleDsl.g:5481:5: lv_left_and_0_0= ruleETruthExpression
            {

            					newCompositeNode(grammarAccess.getEAndExpressionAccess().getLeft_andETruthExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_98);
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

            // InternalAnsibleDsl.g:5498:3: (otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==127) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalAnsibleDsl.g:5499:4: otherlv_1= 'and' ( (lv_right_and_2_0= ruleEAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,127,FOLLOW_94); 

                    				newLeafNode(otherlv_1, grammarAccess.getEAndExpressionAccess().getAndKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5503:4: ( (lv_right_and_2_0= ruleEAndExpression ) )
                    // InternalAnsibleDsl.g:5504:5: (lv_right_and_2_0= ruleEAndExpression )
                    {
                    // InternalAnsibleDsl.g:5504:5: (lv_right_and_2_0= ruleEAndExpression )
                    // InternalAnsibleDsl.g:5505:6: lv_right_and_2_0= ruleEAndExpression
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
    // InternalAnsibleDsl.g:5527:1: entryRuleETruthExpression returns [EObject current=null] : iv_ruleETruthExpression= ruleETruthExpression EOF ;
    public final EObject entryRuleETruthExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETruthExpression = null;


        try {
            // InternalAnsibleDsl.g:5527:57: (iv_ruleETruthExpression= ruleETruthExpression EOF )
            // InternalAnsibleDsl.g:5528:2: iv_ruleETruthExpression= ruleETruthExpression EOF
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
    // InternalAnsibleDsl.g:5534:1: ruleETruthExpression returns [EObject current=null] : ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? ) ;
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
            // InternalAnsibleDsl.g:5540:2: ( ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? ) )
            // InternalAnsibleDsl.g:5541:2: ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:5541:2: ( ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )? )
            // InternalAnsibleDsl.g:5542:3: ( (lv_left_value_0_0= ruleEOperation ) ) ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )?
            {
            // InternalAnsibleDsl.g:5542:3: ( (lv_left_value_0_0= ruleEOperation ) )
            // InternalAnsibleDsl.g:5543:4: (lv_left_value_0_0= ruleEOperation )
            {
            // InternalAnsibleDsl.g:5543:4: (lv_left_value_0_0= ruleEOperation )
            // InternalAnsibleDsl.g:5544:5: lv_left_value_0_0= ruleEOperation
            {

            					newCompositeNode(grammarAccess.getETruthExpressionAccess().getLeft_valueEOperationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_99);
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

            // InternalAnsibleDsl.g:5561:3: ( ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=128 && LA76_0<=133)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalAnsibleDsl.g:5562:4: ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) ) ( (lv_right_value_2_0= ruleETruthExpression ) )
                    {
                    // InternalAnsibleDsl.g:5562:4: ( ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) ) )
                    // InternalAnsibleDsl.g:5563:5: ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) )
                    {
                    // InternalAnsibleDsl.g:5563:5: ( (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' ) )
                    // InternalAnsibleDsl.g:5564:6: (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' )
                    {
                    // InternalAnsibleDsl.g:5564:6: (lv_equality_sign_1_1= '==' | lv_equality_sign_1_2= '!=' | lv_equality_sign_1_3= '<' | lv_equality_sign_1_4= '>' | lv_equality_sign_1_5= '<=' | lv_equality_sign_1_6= '>=' )
                    int alt75=6;
                    switch ( input.LA(1) ) {
                    case 128:
                        {
                        alt75=1;
                        }
                        break;
                    case 129:
                        {
                        alt75=2;
                        }
                        break;
                    case 130:
                        {
                        alt75=3;
                        }
                        break;
                    case 131:
                        {
                        alt75=4;
                        }
                        break;
                    case 132:
                        {
                        alt75=5;
                        }
                        break;
                    case 133:
                        {
                        alt75=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }

                    switch (alt75) {
                        case 1 :
                            // InternalAnsibleDsl.g:5565:7: lv_equality_sign_1_1= '=='
                            {
                            lv_equality_sign_1_1=(Token)match(input,128,FOLLOW_94); 

                            							newLeafNode(lv_equality_sign_1_1, grammarAccess.getETruthExpressionAccess().getEquality_signEqualsSignEqualsSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:5576:7: lv_equality_sign_1_2= '!='
                            {
                            lv_equality_sign_1_2=(Token)match(input,129,FOLLOW_94); 

                            							newLeafNode(lv_equality_sign_1_2, grammarAccess.getETruthExpressionAccess().getEquality_signExclamationMarkEqualsSignKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:5587:7: lv_equality_sign_1_3= '<'
                            {
                            lv_equality_sign_1_3=(Token)match(input,130,FOLLOW_94); 

                            							newLeafNode(lv_equality_sign_1_3, grammarAccess.getETruthExpressionAccess().getEquality_signLessThanSignKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:5598:7: lv_equality_sign_1_4= '>'
                            {
                            lv_equality_sign_1_4=(Token)match(input,131,FOLLOW_94); 

                            							newLeafNode(lv_equality_sign_1_4, grammarAccess.getETruthExpressionAccess().getEquality_signGreaterThanSignKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:5609:7: lv_equality_sign_1_5= '<='
                            {
                            lv_equality_sign_1_5=(Token)match(input,132,FOLLOW_94); 

                            							newLeafNode(lv_equality_sign_1_5, grammarAccess.getETruthExpressionAccess().getEquality_signLessThanSignEqualsSignKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getETruthExpressionRule());
                            							}
                            							setWithLastConsumed(current, "equality_sign", lv_equality_sign_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalAnsibleDsl.g:5620:7: lv_equality_sign_1_6= '>='
                            {
                            lv_equality_sign_1_6=(Token)match(input,133,FOLLOW_94); 

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

                    // InternalAnsibleDsl.g:5633:4: ( (lv_right_value_2_0= ruleETruthExpression ) )
                    // InternalAnsibleDsl.g:5634:5: (lv_right_value_2_0= ruleETruthExpression )
                    {
                    // InternalAnsibleDsl.g:5634:5: (lv_right_value_2_0= ruleETruthExpression )
                    // InternalAnsibleDsl.g:5635:6: lv_right_value_2_0= ruleETruthExpression
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
    // InternalAnsibleDsl.g:5657:1: entryRuleEOperation returns [EObject current=null] : iv_ruleEOperation= ruleEOperation EOF ;
    public final EObject entryRuleEOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperation = null;


        try {
            // InternalAnsibleDsl.g:5657:51: (iv_ruleEOperation= ruleEOperation EOF )
            // InternalAnsibleDsl.g:5658:2: iv_ruleEOperation= ruleEOperation EOF
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
    // InternalAnsibleDsl.g:5664:1: ruleEOperation returns [EObject current=null] : ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? ) ;
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
            // InternalAnsibleDsl.g:5670:2: ( ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? ) )
            // InternalAnsibleDsl.g:5671:2: ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? )
            {
            // InternalAnsibleDsl.g:5671:2: ( ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )? )
            // InternalAnsibleDsl.g:5672:3: ( (lv_left_operand_0_0= ruleEIsExpression ) ) ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )?
            {
            // InternalAnsibleDsl.g:5672:3: ( (lv_left_operand_0_0= ruleEIsExpression ) )
            // InternalAnsibleDsl.g:5673:4: (lv_left_operand_0_0= ruleEIsExpression )
            {
            // InternalAnsibleDsl.g:5673:4: (lv_left_operand_0_0= ruleEIsExpression )
            // InternalAnsibleDsl.g:5674:5: lv_left_operand_0_0= ruleEIsExpression
            {

            					newCompositeNode(grammarAccess.getEOperationAccess().getLeft_operandEIsExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_100);
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

            // InternalAnsibleDsl.g:5691:3: ( ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=134 && LA78_0<=140)) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalAnsibleDsl.g:5692:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) ) ( (lv_right_operand_2_0= ruleEOperation ) )
                    {
                    // InternalAnsibleDsl.g:5692:4: ( ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) ) )
                    // InternalAnsibleDsl.g:5693:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) )
                    {
                    // InternalAnsibleDsl.g:5693:5: ( (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' ) )
                    // InternalAnsibleDsl.g:5694:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' )
                    {
                    // InternalAnsibleDsl.g:5694:6: (lv_operator_1_1= '+' | lv_operator_1_2= '-' | lv_operator_1_3= '/' | lv_operator_1_4= '//' | lv_operator_1_5= '%' | lv_operator_1_6= '*' | lv_operator_1_7= '**' )
                    int alt77=7;
                    switch ( input.LA(1) ) {
                    case 134:
                        {
                        alt77=1;
                        }
                        break;
                    case 135:
                        {
                        alt77=2;
                        }
                        break;
                    case 136:
                        {
                        alt77=3;
                        }
                        break;
                    case 137:
                        {
                        alt77=4;
                        }
                        break;
                    case 138:
                        {
                        alt77=5;
                        }
                        break;
                    case 139:
                        {
                        alt77=6;
                        }
                        break;
                    case 140:
                        {
                        alt77=7;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }

                    switch (alt77) {
                        case 1 :
                            // InternalAnsibleDsl.g:5695:7: lv_operator_1_1= '+'
                            {
                            lv_operator_1_1=(Token)match(input,134,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_1, grammarAccess.getEOperationAccess().getOperatorPlusSignKeyword_1_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalAnsibleDsl.g:5706:7: lv_operator_1_2= '-'
                            {
                            lv_operator_1_2=(Token)match(input,135,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_2, grammarAccess.getEOperationAccess().getOperatorHyphenMinusKeyword_1_0_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalAnsibleDsl.g:5717:7: lv_operator_1_3= '/'
                            {
                            lv_operator_1_3=(Token)match(input,136,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_3, grammarAccess.getEOperationAccess().getOperatorSolidusKeyword_1_0_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalAnsibleDsl.g:5728:7: lv_operator_1_4= '//'
                            {
                            lv_operator_1_4=(Token)match(input,137,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_4, grammarAccess.getEOperationAccess().getOperatorSolidusSolidusKeyword_1_0_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_4, null);
                            						

                            }
                            break;
                        case 5 :
                            // InternalAnsibleDsl.g:5739:7: lv_operator_1_5= '%'
                            {
                            lv_operator_1_5=(Token)match(input,138,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_5, grammarAccess.getEOperationAccess().getOperatorPercentSignKeyword_1_0_0_4());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_5, null);
                            						

                            }
                            break;
                        case 6 :
                            // InternalAnsibleDsl.g:5750:7: lv_operator_1_6= '*'
                            {
                            lv_operator_1_6=(Token)match(input,139,FOLLOW_94); 

                            							newLeafNode(lv_operator_1_6, grammarAccess.getEOperationAccess().getOperatorAsteriskKeyword_1_0_0_5());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEOperationRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_1_6, null);
                            						

                            }
                            break;
                        case 7 :
                            // InternalAnsibleDsl.g:5761:7: lv_operator_1_7= '**'
                            {
                            lv_operator_1_7=(Token)match(input,140,FOLLOW_94); 

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

                    // InternalAnsibleDsl.g:5774:4: ( (lv_right_operand_2_0= ruleEOperation ) )
                    // InternalAnsibleDsl.g:5775:5: (lv_right_operand_2_0= ruleEOperation )
                    {
                    // InternalAnsibleDsl.g:5775:5: (lv_right_operand_2_0= ruleEOperation )
                    // InternalAnsibleDsl.g:5776:6: lv_right_operand_2_0= ruleEOperation
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
    // InternalAnsibleDsl.g:5798:1: entryRuleEIsExpression returns [EObject current=null] : iv_ruleEIsExpression= ruleEIsExpression EOF ;
    public final EObject entryRuleEIsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIsExpression = null;


        try {
            // InternalAnsibleDsl.g:5798:54: (iv_ruleEIsExpression= ruleEIsExpression EOF )
            // InternalAnsibleDsl.g:5799:2: iv_ruleEIsExpression= ruleEIsExpression EOF
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
    // InternalAnsibleDsl.g:5805:1: ruleEIsExpression returns [EObject current=null] : ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? ) ;
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
            // InternalAnsibleDsl.g:5811:2: ( ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? ) )
            // InternalAnsibleDsl.g:5812:2: ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? )
            {
            // InternalAnsibleDsl.g:5812:2: ( ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )? )
            // InternalAnsibleDsl.g:5813:3: ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) ) ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )?
            {
            // InternalAnsibleDsl.g:5813:3: ( (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression ) )
            // InternalAnsibleDsl.g:5814:4: (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression )
            {
            // InternalAnsibleDsl.g:5814:4: (lv_parenthesised_expression_0_0= ruleEParenthesisedExpression )
            // InternalAnsibleDsl.g:5815:5: lv_parenthesised_expression_0_0= ruleEParenthesisedExpression
            {

            					newCompositeNode(grammarAccess.getEIsExpressionAccess().getParenthesised_expressionEParenthesisedExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_101);
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

            // InternalAnsibleDsl.g:5832:3: ( (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) ) | ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) ) )?
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==141) ) {
                alt81=1;
            }
            else if ( ((LA81_0>=142 && LA81_0<=143)) ) {
                alt81=2;
            }
            switch (alt81) {
                case 1 :
                    // InternalAnsibleDsl.g:5833:4: (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) )
                    {
                    // InternalAnsibleDsl.g:5833:4: (otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) ) )
                    // InternalAnsibleDsl.g:5834:5: otherlv_1= 'is' ( (lv_is_not_2_0= 'not' ) )? ( (lv_status_3_0= ruleEIsExpression ) )
                    {
                    otherlv_1=(Token)match(input,141,FOLLOW_102); 

                    					newLeafNode(otherlv_1, grammarAccess.getEIsExpressionAccess().getIsKeyword_1_0_0());
                    				
                    // InternalAnsibleDsl.g:5838:5: ( (lv_is_not_2_0= 'not' ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==142) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalAnsibleDsl.g:5839:6: (lv_is_not_2_0= 'not' )
                            {
                            // InternalAnsibleDsl.g:5839:6: (lv_is_not_2_0= 'not' )
                            // InternalAnsibleDsl.g:5840:7: lv_is_not_2_0= 'not'
                            {
                            lv_is_not_2_0=(Token)match(input,142,FOLLOW_94); 

                            							newLeafNode(lv_is_not_2_0, grammarAccess.getEIsExpressionAccess().getIs_notNotKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEIsExpressionRule());
                            							}
                            							setWithLastConsumed(current, "is_not", lv_is_not_2_0, "not");
                            						

                            }


                            }
                            break;

                    }

                    // InternalAnsibleDsl.g:5852:5: ( (lv_status_3_0= ruleEIsExpression ) )
                    // InternalAnsibleDsl.g:5853:6: (lv_status_3_0= ruleEIsExpression )
                    {
                    // InternalAnsibleDsl.g:5853:6: (lv_status_3_0= ruleEIsExpression )
                    // InternalAnsibleDsl.g:5854:7: lv_status_3_0= ruleEIsExpression
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
                    // InternalAnsibleDsl.g:5873:4: ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) )
                    {
                    // InternalAnsibleDsl.g:5873:4: ( ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) ) )
                    // InternalAnsibleDsl.g:5874:5: ( (lv_is_not_4_0= 'not' ) )? otherlv_5= 'in' ( (lv_container_expression_6_0= ruleEIsExpression ) )
                    {
                    // InternalAnsibleDsl.g:5874:5: ( (lv_is_not_4_0= 'not' ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==142) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalAnsibleDsl.g:5875:6: (lv_is_not_4_0= 'not' )
                            {
                            // InternalAnsibleDsl.g:5875:6: (lv_is_not_4_0= 'not' )
                            // InternalAnsibleDsl.g:5876:7: lv_is_not_4_0= 'not'
                            {
                            lv_is_not_4_0=(Token)match(input,142,FOLLOW_103); 

                            							newLeafNode(lv_is_not_4_0, grammarAccess.getEIsExpressionAccess().getIs_notNotKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEIsExpressionRule());
                            							}
                            							setWithLastConsumed(current, "is_not", lv_is_not_4_0, "not");
                            						

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,143,FOLLOW_94); 

                    					newLeafNode(otherlv_5, grammarAccess.getEIsExpressionAccess().getInKeyword_1_1_1());
                    				
                    // InternalAnsibleDsl.g:5892:5: ( (lv_container_expression_6_0= ruleEIsExpression ) )
                    // InternalAnsibleDsl.g:5893:6: (lv_container_expression_6_0= ruleEIsExpression )
                    {
                    // InternalAnsibleDsl.g:5893:6: (lv_container_expression_6_0= ruleEIsExpression )
                    // InternalAnsibleDsl.g:5894:7: lv_container_expression_6_0= ruleEIsExpression
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
    // InternalAnsibleDsl.g:5917:1: entryRuleEParenthesisedExpression returns [EObject current=null] : iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF ;
    public final EObject entryRuleEParenthesisedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParenthesisedExpression = null;


        try {
            // InternalAnsibleDsl.g:5917:65: (iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF )
            // InternalAnsibleDsl.g:5918:2: iv_ruleEParenthesisedExpression= ruleEParenthesisedExpression EOF
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
    // InternalAnsibleDsl.g:5924:1: ruleEParenthesisedExpression returns [EObject current=null] : ( ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEFilteredExpression ) ) otherlv_3= ')' ) ) (otherlv_4= '[' ( (lv_index_5_0= RULE_NUMBER ) ) otherlv_6= ']' )? (otherlv_7= '.' ( (lv_tail_8_0= ruleETailElement ) ) )* ) ;
    public final EObject ruleEParenthesisedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_index_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_basic_value_0_0 = null;

        EObject lv_parenthesised_term_2_0 = null;

        EObject lv_tail_8_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:5930:2: ( ( ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEFilteredExpression ) ) otherlv_3= ')' ) ) (otherlv_4= '[' ( (lv_index_5_0= RULE_NUMBER ) ) otherlv_6= ']' )? (otherlv_7= '.' ( (lv_tail_8_0= ruleETailElement ) ) )* ) )
            // InternalAnsibleDsl.g:5931:2: ( ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEFilteredExpression ) ) otherlv_3= ')' ) ) (otherlv_4= '[' ( (lv_index_5_0= RULE_NUMBER ) ) otherlv_6= ']' )? (otherlv_7= '.' ( (lv_tail_8_0= ruleETailElement ) ) )* )
            {
            // InternalAnsibleDsl.g:5931:2: ( ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEFilteredExpression ) ) otherlv_3= ')' ) ) (otherlv_4= '[' ( (lv_index_5_0= RULE_NUMBER ) ) otherlv_6= ']' )? (otherlv_7= '.' ( (lv_tail_8_0= ruleETailElement ) ) )* )
            // InternalAnsibleDsl.g:5932:3: ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEFilteredExpression ) ) otherlv_3= ')' ) ) (otherlv_4= '[' ( (lv_index_5_0= RULE_NUMBER ) ) otherlv_6= ']' )? (otherlv_7= '.' ( (lv_tail_8_0= ruleETailElement ) ) )*
            {
            // InternalAnsibleDsl.g:5932:3: ( ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) ) | (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEFilteredExpression ) ) otherlv_3= ')' ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=RULE_STRING && LA82_0<=RULE_NONE)||LA82_0==118||LA82_0==144||(LA82_0>=150 && LA82_0<=152)||(LA82_0>=154 && LA82_0<=157)) ) {
                alt82=1;
            }
            else if ( (LA82_0==121) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // InternalAnsibleDsl.g:5933:4: ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) )
                    {
                    // InternalAnsibleDsl.g:5933:4: ( (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression ) )
                    // InternalAnsibleDsl.g:5934:5: (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression )
                    {
                    // InternalAnsibleDsl.g:5934:5: (lv_basic_value_0_0= ruleEValuePassedToJinjaExpression )
                    // InternalAnsibleDsl.g:5935:6: lv_basic_value_0_0= ruleEValuePassedToJinjaExpression
                    {

                    						newCompositeNode(grammarAccess.getEParenthesisedExpressionAccess().getBasic_valueEValuePassedToJinjaExpressionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_104);
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
                    // InternalAnsibleDsl.g:5953:4: (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEFilteredExpression ) ) otherlv_3= ')' )
                    {
                    // InternalAnsibleDsl.g:5953:4: (otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEFilteredExpression ) ) otherlv_3= ')' )
                    // InternalAnsibleDsl.g:5954:5: otherlv_1= '(' ( (lv_parenthesised_term_2_0= ruleEFilteredExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,121,FOLLOW_94); 

                    					newLeafNode(otherlv_1, grammarAccess.getEParenthesisedExpressionAccess().getLeftParenthesisKeyword_0_1_0());
                    				
                    // InternalAnsibleDsl.g:5958:5: ( (lv_parenthesised_term_2_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:5959:6: (lv_parenthesised_term_2_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:5959:6: (lv_parenthesised_term_2_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:5960:7: lv_parenthesised_term_2_0= ruleEFilteredExpression
                    {

                    							newCompositeNode(grammarAccess.getEParenthesisedExpressionAccess().getParenthesised_termEFilteredExpressionParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_105);
                    lv_parenthesised_term_2_0=ruleEFilteredExpression();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEParenthesisedExpressionRule());
                    							}
                    							set(
                    								current,
                    								"parenthesised_term",
                    								lv_parenthesised_term_2_0,
                    								"org.sodalite.sdl.ansible.AnsibleDsl.EFilteredExpression");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,123,FOLLOW_104); 

                    					newLeafNode(otherlv_3, grammarAccess.getEParenthesisedExpressionAccess().getRightParenthesisKeyword_0_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalAnsibleDsl.g:5983:3: (otherlv_4= '[' ( (lv_index_5_0= RULE_NUMBER ) ) otherlv_6= ']' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==144) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalAnsibleDsl.g:5984:4: otherlv_4= '[' ( (lv_index_5_0= RULE_NUMBER ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,144,FOLLOW_106); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParenthesisedExpressionAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:5988:4: ( (lv_index_5_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:5989:5: (lv_index_5_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:5989:5: (lv_index_5_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:5990:6: lv_index_5_0= RULE_NUMBER
                    {
                    lv_index_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_107); 

                    						newLeafNode(lv_index_5_0, grammarAccess.getEParenthesisedExpressionAccess().getIndexNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEParenthesisedExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index",
                    							lv_index_5_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,145,FOLLOW_108); 

                    				newLeafNode(otherlv_6, grammarAccess.getEParenthesisedExpressionAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalAnsibleDsl.g:6011:3: (otherlv_7= '.' ( (lv_tail_8_0= ruleETailElement ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==146) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6012:4: otherlv_7= '.' ( (lv_tail_8_0= ruleETailElement ) )
            	    {
            	    otherlv_7=(Token)match(input,146,FOLLOW_109); 

            	    				newLeafNode(otherlv_7, grammarAccess.getEParenthesisedExpressionAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6016:4: ( (lv_tail_8_0= ruleETailElement ) )
            	    // InternalAnsibleDsl.g:6017:5: (lv_tail_8_0= ruleETailElement )
            	    {
            	    // InternalAnsibleDsl.g:6017:5: (lv_tail_8_0= ruleETailElement )
            	    // InternalAnsibleDsl.g:6018:6: lv_tail_8_0= ruleETailElement
            	    {

            	    						newCompositeNode(grammarAccess.getEParenthesisedExpressionAccess().getTailETailElementParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_108);
            	    lv_tail_8_0=ruleETailElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEParenthesisedExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tail",
            	    							lv_tail_8_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.ETailElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
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
    // $ANTLR end "ruleEParenthesisedExpression"


    // $ANTLR start "entryRuleEIfExpression"
    // InternalAnsibleDsl.g:6040:1: entryRuleEIfExpression returns [EObject current=null] : iv_ruleEIfExpression= ruleEIfExpression EOF ;
    public final EObject entryRuleEIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIfExpression = null;


        try {
            // InternalAnsibleDsl.g:6040:54: (iv_ruleEIfExpression= ruleEIfExpression EOF )
            // InternalAnsibleDsl.g:6041:2: iv_ruleEIfExpression= ruleEIfExpression EOF
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
    // InternalAnsibleDsl.g:6047:1: ruleEIfExpression returns [EObject current=null] : (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? ) ;
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
            // InternalAnsibleDsl.g:6053:2: ( (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? ) )
            // InternalAnsibleDsl.g:6054:2: (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? )
            {
            // InternalAnsibleDsl.g:6054:2: (otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )? )
            // InternalAnsibleDsl.g:6055:3: otherlv_0= 'return' ( (lv_if_expression_1_0= ruleEFilteredExpression ) ) otherlv_2= 'if' ( (lv_if_condition_3_0= ruleEFilteredExpression ) ) (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )?
            {
            otherlv_0=(Token)match(input,147,FOLLOW_94); 

            			newLeafNode(otherlv_0, grammarAccess.getEIfExpressionAccess().getReturnKeyword_0());
            		
            // InternalAnsibleDsl.g:6059:3: ( (lv_if_expression_1_0= ruleEFilteredExpression ) )
            // InternalAnsibleDsl.g:6060:4: (lv_if_expression_1_0= ruleEFilteredExpression )
            {
            // InternalAnsibleDsl.g:6060:4: (lv_if_expression_1_0= ruleEFilteredExpression )
            // InternalAnsibleDsl.g:6061:5: lv_if_expression_1_0= ruleEFilteredExpression
            {

            					newCompositeNode(grammarAccess.getEIfExpressionAccess().getIf_expressionEFilteredExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_110);
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

            otherlv_2=(Token)match(input,148,FOLLOW_94); 

            			newLeafNode(otherlv_2, grammarAccess.getEIfExpressionAccess().getIfKeyword_2());
            		
            // InternalAnsibleDsl.g:6082:3: ( (lv_if_condition_3_0= ruleEFilteredExpression ) )
            // InternalAnsibleDsl.g:6083:4: (lv_if_condition_3_0= ruleEFilteredExpression )
            {
            // InternalAnsibleDsl.g:6083:4: (lv_if_condition_3_0= ruleEFilteredExpression )
            // InternalAnsibleDsl.g:6084:5: lv_if_condition_3_0= ruleEFilteredExpression
            {

            					newCompositeNode(grammarAccess.getEIfExpressionAccess().getIf_conditionEFilteredExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_111);
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

            // InternalAnsibleDsl.g:6101:3: (otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==149) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalAnsibleDsl.g:6102:4: otherlv_4= 'else' ( (lv_else_expression_5_0= ruleEFilteredExpression ) )
                    {
                    otherlv_4=(Token)match(input,149,FOLLOW_94); 

                    				newLeafNode(otherlv_4, grammarAccess.getEIfExpressionAccess().getElseKeyword_4_0());
                    			
                    // InternalAnsibleDsl.g:6106:4: ( (lv_else_expression_5_0= ruleEFilteredExpression ) )
                    // InternalAnsibleDsl.g:6107:5: (lv_else_expression_5_0= ruleEFilteredExpression )
                    {
                    // InternalAnsibleDsl.g:6107:5: (lv_else_expression_5_0= ruleEFilteredExpression )
                    // InternalAnsibleDsl.g:6108:6: lv_else_expression_5_0= ruleEFilteredExpression
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


    // $ANTLR start "entryRuleEVariableDeclarationVariableReference"
    // InternalAnsibleDsl.g:6130:1: entryRuleEVariableDeclarationVariableReference returns [EObject current=null] : iv_ruleEVariableDeclarationVariableReference= ruleEVariableDeclarationVariableReference EOF ;
    public final EObject entryRuleEVariableDeclarationVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclarationVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6130:78: (iv_ruleEVariableDeclarationVariableReference= ruleEVariableDeclarationVariableReference EOF )
            // InternalAnsibleDsl.g:6131:2: iv_ruleEVariableDeclarationVariableReference= ruleEVariableDeclarationVariableReference EOF
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
    // InternalAnsibleDsl.g:6137:1: ruleEVariableDeclarationVariableReference returns [EObject current=null] : (otherlv_0= 'declared_variable:' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEVariableDeclarationVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6143:2: ( (otherlv_0= 'declared_variable:' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:6144:2: (otherlv_0= 'declared_variable:' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:6144:2: (otherlv_0= 'declared_variable:' ( (otherlv_1= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6145:3: otherlv_0= 'declared_variable:' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,150,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getDeclared_variableKeyword_0());
            		
            // InternalAnsibleDsl.g:6149:3: ( (otherlv_1= RULE_ID ) )
            // InternalAnsibleDsl.g:6150:4: (otherlv_1= RULE_ID )
            {
            // InternalAnsibleDsl.g:6150:4: (otherlv_1= RULE_ID )
            // InternalAnsibleDsl.g:6151:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEVariableDeclarationVariableReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationVariableReferenceAccess().getVariable_declaration_variable_referenceEVariableDeclarationCrossReference_1_0());
            				

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
    // $ANTLR end "ruleEVariableDeclarationVariableReference"


    // $ANTLR start "entryRuleERegisterVariableReference"
    // InternalAnsibleDsl.g:6166:1: entryRuleERegisterVariableReference returns [EObject current=null] : iv_ruleERegisterVariableReference= ruleERegisterVariableReference EOF ;
    public final EObject entryRuleERegisterVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6166:67: (iv_ruleERegisterVariableReference= ruleERegisterVariableReference EOF )
            // InternalAnsibleDsl.g:6167:2: iv_ruleERegisterVariableReference= ruleERegisterVariableReference EOF
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
    // InternalAnsibleDsl.g:6173:1: ruleERegisterVariableReference returns [EObject current=null] : (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleERegisterVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6179:2: ( (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:6180:2: (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:6180:2: (otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6181:3: otherlv_0= 'registered_variable:' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,151,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableReferenceAccess().getRegistered_variableKeyword_0());
            		
            // InternalAnsibleDsl.g:6185:3: ( (otherlv_1= RULE_ID ) )
            // InternalAnsibleDsl.g:6186:4: (otherlv_1= RULE_ID )
            {
            // InternalAnsibleDsl.g:6186:4: (otherlv_1= RULE_ID )
            // InternalAnsibleDsl.g:6187:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERegisterVariableReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getERegisterVariableReferenceAccess().getRegister_variable_referenceERegisterVariableCrossReference_1_0());
            				

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
    // $ANTLR end "ruleERegisterVariableReference"


    // $ANTLR start "entryRuleEVariableDeclaration"
    // InternalAnsibleDsl.g:6202:1: entryRuleEVariableDeclaration returns [EObject current=null] : iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF ;
    public final EObject entryRuleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableDeclaration = null;


        try {
            // InternalAnsibleDsl.g:6202:61: (iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF )
            // InternalAnsibleDsl.g:6203:2: iv_ruleEVariableDeclaration= ruleEVariableDeclaration EOF
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
    // InternalAnsibleDsl.g:6209:1: ruleEVariableDeclaration returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) ;
    public final EObject ruleEVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_passed_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6215:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) ) )
            // InternalAnsibleDsl.g:6216:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            {
            // InternalAnsibleDsl.g:6216:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) ) )
            // InternalAnsibleDsl.g:6217:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_passed_2_0= ruleEValuePassed ) )
            {
            // InternalAnsibleDsl.g:6217:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6218:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6218:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6219:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_69); 

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

            otherlv_1=(Token)match(input,74,FOLLOW_67); 

            			newLeafNode(otherlv_1, grammarAccess.getEVariableDeclarationAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:6239:3: ( (lv_value_passed_2_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:6240:4: (lv_value_passed_2_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:6240:4: (lv_value_passed_2_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:6241:5: lv_value_passed_2_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getEVariableDeclarationAccess().getValue_passedEValuePassedParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_passed_2_0=ruleEValuePassed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEVariableDeclarationRule());
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
    // $ANTLR end "ruleEVariableDeclaration"


    // $ANTLR start "entryRuleEIndexOrLoopVariable"
    // InternalAnsibleDsl.g:6262:1: entryRuleEIndexOrLoopVariable returns [EObject current=null] : iv_ruleEIndexOrLoopVariable= ruleEIndexOrLoopVariable EOF ;
    public final EObject entryRuleEIndexOrLoopVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIndexOrLoopVariable = null;


        try {
            // InternalAnsibleDsl.g:6262:61: (iv_ruleEIndexOrLoopVariable= ruleEIndexOrLoopVariable EOF )
            // InternalAnsibleDsl.g:6263:2: iv_ruleEIndexOrLoopVariable= ruleEIndexOrLoopVariable EOF
            {
             newCompositeNode(grammarAccess.getEIndexOrLoopVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIndexOrLoopVariable=ruleEIndexOrLoopVariable();

            state._fsp--;

             current =iv_ruleEIndexOrLoopVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIndexOrLoopVariable"


    // $ANTLR start "ruleEIndexOrLoopVariable"
    // InternalAnsibleDsl.g:6269:1: ruleEIndexOrLoopVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEIndexOrLoopVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6275:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6276:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalAnsibleDsl.g:6276:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6277:3: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6277:3: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6278:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEIndexOrLoopVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEIndexOrLoopVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleEIndexOrLoopVariable"


    // $ANTLR start "entryRuleEIndexOrLoopVariableReference"
    // InternalAnsibleDsl.g:6297:1: entryRuleEIndexOrLoopVariableReference returns [EObject current=null] : iv_ruleEIndexOrLoopVariableReference= ruleEIndexOrLoopVariableReference EOF ;
    public final EObject entryRuleEIndexOrLoopVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEIndexOrLoopVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6297:70: (iv_ruleEIndexOrLoopVariableReference= ruleEIndexOrLoopVariableReference EOF )
            // InternalAnsibleDsl.g:6298:2: iv_ruleEIndexOrLoopVariableReference= ruleEIndexOrLoopVariableReference EOF
            {
             newCompositeNode(grammarAccess.getEIndexOrLoopVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEIndexOrLoopVariableReference=ruleEIndexOrLoopVariableReference();

            state._fsp--;

             current =iv_ruleEIndexOrLoopVariableReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEIndexOrLoopVariableReference"


    // $ANTLR start "ruleEIndexOrLoopVariableReference"
    // InternalAnsibleDsl.g:6304:1: ruleEIndexOrLoopVariableReference returns [EObject current=null] : (otherlv_0= 'index_or_loop_var:' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEIndexOrLoopVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6310:2: ( (otherlv_0= 'index_or_loop_var:' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:6311:2: (otherlv_0= 'index_or_loop_var:' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:6311:2: (otherlv_0= 'index_or_loop_var:' ( (otherlv_1= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6312:3: otherlv_0= 'index_or_loop_var:' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,152,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEIndexOrLoopVariableReferenceAccess().getIndex_or_loop_varKeyword_0());
            		
            // InternalAnsibleDsl.g:6316:3: ( (otherlv_1= RULE_ID ) )
            // InternalAnsibleDsl.g:6317:4: (otherlv_1= RULE_ID )
            {
            // InternalAnsibleDsl.g:6317:4: (otherlv_1= RULE_ID )
            // InternalAnsibleDsl.g:6318:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEIndexOrLoopVariableReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getEIndexOrLoopVariableReferenceAccess().getNameEIndexOrLoopVariableCrossReference_1_0());
            				

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
    // $ANTLR end "ruleEIndexOrLoopVariableReference"


    // $ANTLR start "entryRuleERegisterVariable"
    // InternalAnsibleDsl.g:6333:1: entryRuleERegisterVariable returns [EObject current=null] : iv_ruleERegisterVariable= ruleERegisterVariable EOF ;
    public final EObject entryRuleERegisterVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERegisterVariable = null;


        try {
            // InternalAnsibleDsl.g:6333:58: (iv_ruleERegisterVariable= ruleERegisterVariable EOF )
            // InternalAnsibleDsl.g:6334:2: iv_ruleERegisterVariable= ruleERegisterVariable EOF
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
    // InternalAnsibleDsl.g:6340:1: ruleERegisterVariable returns [EObject current=null] : (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleERegisterVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6346:2: ( (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:6347:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:6347:2: (otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6348:3: otherlv_0= 'register:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,153,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getERegisterVariableAccess().getRegisterKeyword_0());
            		
            // InternalAnsibleDsl.g:6352:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6353:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6353:4: (lv_name_1_0= RULE_ID )
            // InternalAnsibleDsl.g:6354:5: lv_name_1_0= RULE_ID
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


    // $ANTLR start "entryRuleEInputOperationVariableReference"
    // InternalAnsibleDsl.g:6374:1: entryRuleEInputOperationVariableReference returns [EObject current=null] : iv_ruleEInputOperationVariableReference= ruleEInputOperationVariableReference EOF ;
    public final EObject entryRuleEInputOperationVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputOperationVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6374:73: (iv_ruleEInputOperationVariableReference= ruleEInputOperationVariableReference EOF )
            // InternalAnsibleDsl.g:6375:2: iv_ruleEInputOperationVariableReference= ruleEInputOperationVariableReference EOF
            {
             newCompositeNode(grammarAccess.getEInputOperationVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInputOperationVariableReference=ruleEInputOperationVariableReference();

            state._fsp--;

             current =iv_ruleEInputOperationVariableReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInputOperationVariableReference"


    // $ANTLR start "ruleEInputOperationVariableReference"
    // InternalAnsibleDsl.g:6381:1: ruleEInputOperationVariableReference returns [EObject current=null] : (otherlv_0= 'operation_input:' ( (otherlv_1= RULE_STRING ) ) ) ;
    public final EObject ruleEInputOperationVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6387:2: ( (otherlv_0= 'operation_input:' ( (otherlv_1= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:6388:2: (otherlv_0= 'operation_input:' ( (otherlv_1= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:6388:2: (otherlv_0= 'operation_input:' ( (otherlv_1= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:6389:3: otherlv_0= 'operation_input:' ( (otherlv_1= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,154,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEInputOperationVariableReferenceAccess().getOperation_inputKeyword_0());
            		
            // InternalAnsibleDsl.g:6393:3: ( (otherlv_1= RULE_STRING ) )
            // InternalAnsibleDsl.g:6394:4: (otherlv_1= RULE_STRING )
            {
            // InternalAnsibleDsl.g:6394:4: (otherlv_1= RULE_STRING )
            // InternalAnsibleDsl.g:6395:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInputOperationVariableReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getEInputOperationVariableReferenceAccess().getNameEParameterDefinitionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleEInputOperationVariableReference"


    // $ANTLR start "entryRuleEInputInterfaceVariableReference"
    // InternalAnsibleDsl.g:6410:1: entryRuleEInputInterfaceVariableReference returns [EObject current=null] : iv_ruleEInputInterfaceVariableReference= ruleEInputInterfaceVariableReference EOF ;
    public final EObject entryRuleEInputInterfaceVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputInterfaceVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6410:73: (iv_ruleEInputInterfaceVariableReference= ruleEInputInterfaceVariableReference EOF )
            // InternalAnsibleDsl.g:6411:2: iv_ruleEInputInterfaceVariableReference= ruleEInputInterfaceVariableReference EOF
            {
             newCompositeNode(grammarAccess.getEInputInterfaceVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInputInterfaceVariableReference=ruleEInputInterfaceVariableReference();

            state._fsp--;

             current =iv_ruleEInputInterfaceVariableReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInputInterfaceVariableReference"


    // $ANTLR start "ruleEInputInterfaceVariableReference"
    // InternalAnsibleDsl.g:6417:1: ruleEInputInterfaceVariableReference returns [EObject current=null] : (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) ) ;
    public final EObject ruleEInputInterfaceVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6423:2: ( (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) ) )
            // InternalAnsibleDsl.g:6424:2: (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) )
            {
            // InternalAnsibleDsl.g:6424:2: (otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) ) )
            // InternalAnsibleDsl.g:6425:3: otherlv_0= 'interface_input:' ( (otherlv_1= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,155,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEInputInterfaceVariableReferenceAccess().getInterface_inputKeyword_0());
            		
            // InternalAnsibleDsl.g:6429:3: ( (otherlv_1= RULE_STRING ) )
            // InternalAnsibleDsl.g:6430:4: (otherlv_1= RULE_STRING )
            {
            // InternalAnsibleDsl.g:6430:4: (otherlv_1= RULE_STRING )
            // InternalAnsibleDsl.g:6431:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInputInterfaceVariableReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getEInputInterfaceVariableReferenceAccess().getNameEPropertyDefinitionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleEInputInterfaceVariableReference"


    // $ANTLR start "entryRuleEVariableReference"
    // InternalAnsibleDsl.g:6446:1: entryRuleEVariableReference returns [EObject current=null] : iv_ruleEVariableReference= ruleEVariableReference EOF ;
    public final EObject entryRuleEVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEVariableReference = null;


        try {
            // InternalAnsibleDsl.g:6446:59: (iv_ruleEVariableReference= ruleEVariableReference EOF )
            // InternalAnsibleDsl.g:6447:2: iv_ruleEVariableReference= ruleEVariableReference EOF
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
    // InternalAnsibleDsl.g:6453:1: ruleEVariableReference returns [EObject current=null] : (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputOperationVariableReference_2= ruleEInputOperationVariableReference | this_EInputInterfaceVariableReference_3= ruleEInputInterfaceVariableReference | this_EIndexOrLoopVariableReference_4= ruleEIndexOrLoopVariableReference ) ;
    public final EObject ruleEVariableReference() throws RecognitionException {
        EObject current = null;

        EObject this_EVariableDeclarationVariableReference_0 = null;

        EObject this_ERegisterVariableReference_1 = null;

        EObject this_EInputOperationVariableReference_2 = null;

        EObject this_EInputInterfaceVariableReference_3 = null;

        EObject this_EIndexOrLoopVariableReference_4 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6459:2: ( (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputOperationVariableReference_2= ruleEInputOperationVariableReference | this_EInputInterfaceVariableReference_3= ruleEInputInterfaceVariableReference | this_EIndexOrLoopVariableReference_4= ruleEIndexOrLoopVariableReference ) )
            // InternalAnsibleDsl.g:6460:2: (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputOperationVariableReference_2= ruleEInputOperationVariableReference | this_EInputInterfaceVariableReference_3= ruleEInputInterfaceVariableReference | this_EIndexOrLoopVariableReference_4= ruleEIndexOrLoopVariableReference )
            {
            // InternalAnsibleDsl.g:6460:2: (this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference | this_ERegisterVariableReference_1= ruleERegisterVariableReference | this_EInputOperationVariableReference_2= ruleEInputOperationVariableReference | this_EInputInterfaceVariableReference_3= ruleEInputInterfaceVariableReference | this_EIndexOrLoopVariableReference_4= ruleEIndexOrLoopVariableReference )
            int alt86=5;
            switch ( input.LA(1) ) {
            case 150:
                {
                alt86=1;
                }
                break;
            case 151:
                {
                alt86=2;
                }
                break;
            case 154:
                {
                alt86=3;
                }
                break;
            case 155:
                {
                alt86=4;
                }
                break;
            case 152:
                {
                alt86=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalAnsibleDsl.g:6461:3: this_EVariableDeclarationVariableReference_0= ruleEVariableDeclarationVariableReference
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
                    // InternalAnsibleDsl.g:6470:3: this_ERegisterVariableReference_1= ruleERegisterVariableReference
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
                    // InternalAnsibleDsl.g:6479:3: this_EInputOperationVariableReference_2= ruleEInputOperationVariableReference
                    {

                    			newCompositeNode(grammarAccess.getEVariableReferenceAccess().getEInputOperationVariableReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EInputOperationVariableReference_2=ruleEInputOperationVariableReference();

                    state._fsp--;


                    			current = this_EInputOperationVariableReference_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAnsibleDsl.g:6488:3: this_EInputInterfaceVariableReference_3= ruleEInputInterfaceVariableReference
                    {

                    			newCompositeNode(grammarAccess.getEVariableReferenceAccess().getEInputInterfaceVariableReferenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EInputInterfaceVariableReference_3=ruleEInputInterfaceVariableReference();

                    state._fsp--;


                    			current = this_EInputInterfaceVariableReference_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalAnsibleDsl.g:6497:3: this_EIndexOrLoopVariableReference_4= ruleEIndexOrLoopVariableReference
                    {

                    			newCompositeNode(grammarAccess.getEVariableReferenceAccess().getEIndexOrLoopVariableReferenceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_EIndexOrLoopVariableReference_4=ruleEIndexOrLoopVariableReference();

                    state._fsp--;


                    			current = this_EIndexOrLoopVariableReference_4;
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


    // $ANTLR start "entryRuleESpecialVariable"
    // InternalAnsibleDsl.g:6509:1: entryRuleESpecialVariable returns [EObject current=null] : iv_ruleESpecialVariable= ruleESpecialVariable EOF ;
    public final EObject entryRuleESpecialVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESpecialVariable = null;


        try {
            // InternalAnsibleDsl.g:6509:57: (iv_ruleESpecialVariable= ruleESpecialVariable EOF )
            // InternalAnsibleDsl.g:6510:2: iv_ruleESpecialVariable= ruleESpecialVariable EOF
            {
             newCompositeNode(grammarAccess.getESpecialVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESpecialVariable=ruleESpecialVariable();

            state._fsp--;

             current =iv_ruleESpecialVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleESpecialVariable"


    // $ANTLR start "ruleESpecialVariable"
    // InternalAnsibleDsl.g:6516:1: ruleESpecialVariable returns [EObject current=null] : ( () otherlv_1= 'special_variable:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleESpecialVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalAnsibleDsl.g:6522:2: ( ( () otherlv_1= 'special_variable:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalAnsibleDsl.g:6523:2: ( () otherlv_1= 'special_variable:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalAnsibleDsl.g:6523:2: ( () otherlv_1= 'special_variable:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalAnsibleDsl.g:6524:3: () otherlv_1= 'special_variable:' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalAnsibleDsl.g:6524:3: ()
            // InternalAnsibleDsl.g:6525:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getESpecialVariableAccess().getESpecialVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,156,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getESpecialVariableAccess().getSpecial_variableKeyword_1());
            		
            // InternalAnsibleDsl.g:6535:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6536:4: (lv_name_2_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6536:4: (lv_name_2_0= RULE_ID )
            // InternalAnsibleDsl.g:6537:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getESpecialVariableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getESpecialVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
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
    // $ANTLR end "ruleESpecialVariable"


    // $ANTLR start "entryRuleETailElement"
    // InternalAnsibleDsl.g:6557:1: entryRuleETailElement returns [EObject current=null] : iv_ruleETailElement= ruleETailElement EOF ;
    public final EObject entryRuleETailElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETailElement = null;


        try {
            // InternalAnsibleDsl.g:6557:53: (iv_ruleETailElement= ruleETailElement EOF )
            // InternalAnsibleDsl.g:6558:2: iv_ruleETailElement= ruleETailElement EOF
            {
             newCompositeNode(grammarAccess.getETailElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETailElement=ruleETailElement();

            state._fsp--;

             current =iv_ruleETailElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETailElement"


    // $ANTLR start "ruleETailElement"
    // InternalAnsibleDsl.g:6564:1: ruleETailElement returns [EObject current=null] : ( ( (lv_function_call_0_0= ruleEFunctionCall ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleETailElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_index_2_0=null;
        Token otherlv_3=null;
        EObject lv_function_call_0_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6570:2: ( ( ( (lv_function_call_0_0= ruleEFunctionCall ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? ) )
            // InternalAnsibleDsl.g:6571:2: ( ( (lv_function_call_0_0= ruleEFunctionCall ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? )
            {
            // InternalAnsibleDsl.g:6571:2: ( ( (lv_function_call_0_0= ruleEFunctionCall ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )? )
            // InternalAnsibleDsl.g:6572:3: ( (lv_function_call_0_0= ruleEFunctionCall ) ) (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            {
            // InternalAnsibleDsl.g:6572:3: ( (lv_function_call_0_0= ruleEFunctionCall ) )
            // InternalAnsibleDsl.g:6573:4: (lv_function_call_0_0= ruleEFunctionCall )
            {
            // InternalAnsibleDsl.g:6573:4: (lv_function_call_0_0= ruleEFunctionCall )
            // InternalAnsibleDsl.g:6574:5: lv_function_call_0_0= ruleEFunctionCall
            {

            					newCompositeNode(grammarAccess.getETailElementAccess().getFunction_callEFunctionCallParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_112);
            lv_function_call_0_0=ruleEFunctionCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getETailElementRule());
            					}
            					set(
            						current,
            						"function_call",
            						lv_function_call_0_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EFunctionCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:6591:3: (otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==144) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalAnsibleDsl.g:6592:4: otherlv_1= '[' ( (lv_index_2_0= RULE_NUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,144,FOLLOW_106); 

                    				newLeafNode(otherlv_1, grammarAccess.getETailElementAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalAnsibleDsl.g:6596:4: ( (lv_index_2_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6597:5: (lv_index_2_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6597:5: (lv_index_2_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6598:6: lv_index_2_0= RULE_NUMBER
                    {
                    lv_index_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_107); 

                    						newLeafNode(lv_index_2_0, grammarAccess.getETailElementAccess().getIndexNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getETailElementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"index",
                    							lv_index_2_0,
                    							"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,145,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getETailElementAccess().getRightSquareBracketKeyword_1_2());
                    			

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
    // $ANTLR end "ruleETailElement"


    // $ANTLR start "entryRuleEDictionary"
    // InternalAnsibleDsl.g:6623:1: entryRuleEDictionary returns [EObject current=null] : iv_ruleEDictionary= ruleEDictionary EOF ;
    public final EObject entryRuleEDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionary = null;


        try {
            // InternalAnsibleDsl.g:6623:52: (iv_ruleEDictionary= ruleEDictionary EOF )
            // InternalAnsibleDsl.g:6624:2: iv_ruleEDictionary= ruleEDictionary EOF
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
    // InternalAnsibleDsl.g:6630:1: ruleEDictionary returns [EObject current=null] : (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleEDictionary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dictionary_pairs_1_0 = null;

        EObject lv_dictionary_pairs_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6636:2: ( (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' ) )
            // InternalAnsibleDsl.g:6637:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            {
            // InternalAnsibleDsl.g:6637:2: (otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}' )
            // InternalAnsibleDsl.g:6638:3: otherlv_0= '{' ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) ) (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,157,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getEDictionaryAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:6642:3: ( (lv_dictionary_pairs_1_0= ruleEDictionaryPair ) )
            // InternalAnsibleDsl.g:6643:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            {
            // InternalAnsibleDsl.g:6643:4: (lv_dictionary_pairs_1_0= ruleEDictionaryPair )
            // InternalAnsibleDsl.g:6644:5: lv_dictionary_pairs_1_0= ruleEDictionaryPair
            {

            					newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_113);
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

            // InternalAnsibleDsl.g:6661:3: (otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==122) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6662:4: otherlv_2= ',' ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    {
            	    otherlv_2=(Token)match(input,122,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEDictionaryAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6666:4: ( (lv_dictionary_pairs_3_0= ruleEDictionaryPair ) )
            	    // InternalAnsibleDsl.g:6667:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    {
            	    // InternalAnsibleDsl.g:6667:5: (lv_dictionary_pairs_3_0= ruleEDictionaryPair )
            	    // InternalAnsibleDsl.g:6668:6: lv_dictionary_pairs_3_0= ruleEDictionaryPair
            	    {

            	    						newCompositeNode(grammarAccess.getEDictionaryAccess().getDictionary_pairsEDictionaryPairParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_113);
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
            	    break loop88;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalAnsibleDsl.g:6694:1: entryRuleEDictionaryPair returns [EObject current=null] : iv_ruleEDictionaryPair= ruleEDictionaryPair EOF ;
    public final EObject entryRuleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPair = null;


        try {
            // InternalAnsibleDsl.g:6694:56: (iv_ruleEDictionaryPair= ruleEDictionaryPair EOF )
            // InternalAnsibleDsl.g:6695:2: iv_ruleEDictionaryPair= ruleEDictionaryPair EOF
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
    // InternalAnsibleDsl.g:6701:1: ruleEDictionaryPair returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValuePassed ) ) ) ;
    public final EObject ruleEDictionaryPair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6707:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValuePassed ) ) ) )
            // InternalAnsibleDsl.g:6708:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValuePassed ) ) )
            {
            // InternalAnsibleDsl.g:6708:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValuePassed ) ) )
            // InternalAnsibleDsl.g:6709:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEValuePassed ) )
            {
            // InternalAnsibleDsl.g:6709:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAnsibleDsl.g:6710:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAnsibleDsl.g:6710:4: (lv_name_0_0= RULE_ID )
            // InternalAnsibleDsl.g:6711:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_69); 

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

            otherlv_1=(Token)match(input,74,FOLLOW_67); 

            			newLeafNode(otherlv_1, grammarAccess.getEDictionaryPairAccess().getColonKeyword_1());
            		
            // InternalAnsibleDsl.g:6731:3: ( (lv_value_2_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:6732:4: (lv_value_2_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:6732:4: (lv_value_2_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:6733:5: lv_value_2_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getEDictionaryPairAccess().getValueEValuePassedParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEValuePassed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDictionaryPairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
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
    // $ANTLR end "ruleEDictionaryPair"


    // $ANTLR start "entryRuleEList"
    // InternalAnsibleDsl.g:6754:1: entryRuleEList returns [EObject current=null] : iv_ruleEList= ruleEList EOF ;
    public final EObject entryRuleEList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEList = null;


        try {
            // InternalAnsibleDsl.g:6754:46: (iv_ruleEList= ruleEList EOF )
            // InternalAnsibleDsl.g:6755:2: iv_ruleEList= ruleEList EOF
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
    // InternalAnsibleDsl.g:6761:1: ruleEList returns [EObject current=null] : (otherlv_0= '[' ( (lv_elements_1_0= ruleEValuePassed ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValuePassed ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleEList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6767:2: ( (otherlv_0= '[' ( (lv_elements_1_0= ruleEValuePassed ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValuePassed ) ) )* otherlv_4= ']' ) )
            // InternalAnsibleDsl.g:6768:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValuePassed ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValuePassed ) ) )* otherlv_4= ']' )
            {
            // InternalAnsibleDsl.g:6768:2: (otherlv_0= '[' ( (lv_elements_1_0= ruleEValuePassed ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValuePassed ) ) )* otherlv_4= ']' )
            // InternalAnsibleDsl.g:6769:3: otherlv_0= '[' ( (lv_elements_1_0= ruleEValuePassed ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleEValuePassed ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,144,FOLLOW_67); 

            			newLeafNode(otherlv_0, grammarAccess.getEListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAnsibleDsl.g:6773:3: ( (lv_elements_1_0= ruleEValuePassed ) )
            // InternalAnsibleDsl.g:6774:4: (lv_elements_1_0= ruleEValuePassed )
            {
            // InternalAnsibleDsl.g:6774:4: (lv_elements_1_0= ruleEValuePassed )
            // InternalAnsibleDsl.g:6775:5: lv_elements_1_0= ruleEValuePassed
            {

            					newCompositeNode(grammarAccess.getEListAccess().getElementsEValuePassedParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_114);
            lv_elements_1_0=ruleEValuePassed();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEListRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassed");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnsibleDsl.g:6792:3: (otherlv_2= ',' ( (lv_elements_3_0= ruleEValuePassed ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==122) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalAnsibleDsl.g:6793:4: otherlv_2= ',' ( (lv_elements_3_0= ruleEValuePassed ) )
            	    {
            	    otherlv_2=(Token)match(input,122,FOLLOW_67); 

            	    				newLeafNode(otherlv_2, grammarAccess.getEListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalAnsibleDsl.g:6797:4: ( (lv_elements_3_0= ruleEValuePassed ) )
            	    // InternalAnsibleDsl.g:6798:5: (lv_elements_3_0= ruleEValuePassed )
            	    {
            	    // InternalAnsibleDsl.g:6798:5: (lv_elements_3_0= ruleEValuePassed )
            	    // InternalAnsibleDsl.g:6799:6: lv_elements_3_0= ruleEValuePassed
            	    {

            	    						newCompositeNode(grammarAccess.getEListAccess().getElementsEValuePassedParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_114);
            	    lv_elements_3_0=ruleEValuePassed();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_3_0,
            	    							"org.sodalite.sdl.ansible.AnsibleDsl.EValuePassed");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_4=(Token)match(input,145,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEDictionaryPassed"
    // InternalAnsibleDsl.g:6825:1: entryRuleEDictionaryPassed returns [EObject current=null] : iv_ruleEDictionaryPassed= ruleEDictionaryPassed EOF ;
    public final EObject entryRuleEDictionaryPassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDictionaryPassed = null;


        try {
            // InternalAnsibleDsl.g:6825:58: (iv_ruleEDictionaryPassed= ruleEDictionaryPassed EOF )
            // InternalAnsibleDsl.g:6826:2: iv_ruleEDictionaryPassed= ruleEDictionaryPassed EOF
            {
             newCompositeNode(grammarAccess.getEDictionaryPassedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDictionaryPassed=ruleEDictionaryPassed();

            state._fsp--;

             current =iv_ruleEDictionaryPassed; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDictionaryPassed"


    // $ANTLR start "ruleEDictionaryPassed"
    // InternalAnsibleDsl.g:6832:1: ruleEDictionaryPassed returns [EObject current=null] : (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | this_EDictionary_1= ruleEDictionary ) ;
    public final EObject ruleEDictionaryPassed() throws RecognitionException {
        EObject current = null;

        EObject this_EJinjaExpressionEvaluation_0 = null;

        EObject this_EDictionary_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6838:2: ( (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | this_EDictionary_1= ruleEDictionary ) )
            // InternalAnsibleDsl.g:6839:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | this_EDictionary_1= ruleEDictionary )
            {
            // InternalAnsibleDsl.g:6839:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | this_EDictionary_1= ruleEDictionary )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==119) ) {
                alt90=1;
            }
            else if ( (LA90_0==157) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // InternalAnsibleDsl.g:6840:3: this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation
                    {

                    			newCompositeNode(grammarAccess.getEDictionaryPassedAccess().getEJinjaExpressionEvaluationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EJinjaExpressionEvaluation_0=ruleEJinjaExpressionEvaluation();

                    state._fsp--;


                    			current = this_EJinjaExpressionEvaluation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:6849:3: this_EDictionary_1= ruleEDictionary
                    {

                    			newCompositeNode(grammarAccess.getEDictionaryPassedAccess().getEDictionaryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EDictionary_1=ruleEDictionary();

                    state._fsp--;


                    			current = this_EDictionary_1;
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
    // $ANTLR end "ruleEDictionaryPassed"


    // $ANTLR start "entryRuleEListPassed"
    // InternalAnsibleDsl.g:6861:1: entryRuleEListPassed returns [EObject current=null] : iv_ruleEListPassed= ruleEListPassed EOF ;
    public final EObject entryRuleEListPassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEListPassed = null;


        try {
            // InternalAnsibleDsl.g:6861:52: (iv_ruleEListPassed= ruleEListPassed EOF )
            // InternalAnsibleDsl.g:6862:2: iv_ruleEListPassed= ruleEListPassed EOF
            {
             newCompositeNode(grammarAccess.getEListPassedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEListPassed=ruleEListPassed();

            state._fsp--;

             current =iv_ruleEListPassed; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEListPassed"


    // $ANTLR start "ruleEListPassed"
    // InternalAnsibleDsl.g:6868:1: ruleEListPassed returns [EObject current=null] : (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | this_EList_1= ruleEList ) ;
    public final EObject ruleEListPassed() throws RecognitionException {
        EObject current = null;

        EObject this_EJinjaExpressionEvaluation_0 = null;

        EObject this_EList_1 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6874:2: ( (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | this_EList_1= ruleEList ) )
            // InternalAnsibleDsl.g:6875:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | this_EList_1= ruleEList )
            {
            // InternalAnsibleDsl.g:6875:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | this_EList_1= ruleEList )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==119) ) {
                alt91=1;
            }
            else if ( (LA91_0==144) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalAnsibleDsl.g:6876:3: this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation
                    {

                    			newCompositeNode(grammarAccess.getEListPassedAccess().getEJinjaExpressionEvaluationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EJinjaExpressionEvaluation_0=ruleEJinjaExpressionEvaluation();

                    state._fsp--;


                    			current = this_EJinjaExpressionEvaluation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:6885:3: this_EList_1= ruleEList
                    {

                    			newCompositeNode(grammarAccess.getEListPassedAccess().getEListParserRuleCall_1());
                    		
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
    // $ANTLR end "ruleEListPassed"


    // $ANTLR start "entryRuleENumberPassed"
    // InternalAnsibleDsl.g:6897:1: entryRuleENumberPassed returns [EObject current=null] : iv_ruleENumberPassed= ruleENumberPassed EOF ;
    public final EObject entryRuleENumberPassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENumberPassed = null;


        try {
            // InternalAnsibleDsl.g:6897:54: (iv_ruleENumberPassed= ruleENumberPassed EOF )
            // InternalAnsibleDsl.g:6898:2: iv_ruleENumberPassed= ruleENumberPassed EOF
            {
             newCompositeNode(grammarAccess.getENumberPassedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENumberPassed=ruleENumberPassed();

            state._fsp--;

             current =iv_ruleENumberPassed; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENumberPassed"


    // $ANTLR start "ruleENumberPassed"
    // InternalAnsibleDsl.g:6904:1: ruleENumberPassed returns [EObject current=null] : (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_number_passed_1_0= RULE_NUMBER ) ) | ( (lv_number_passed_2_0= RULE_NULL ) ) ) ;
    public final EObject ruleENumberPassed() throws RecognitionException {
        EObject current = null;

        Token lv_number_passed_1_0=null;
        Token lv_number_passed_2_0=null;
        EObject this_EJinjaExpressionEvaluation_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6910:2: ( (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_number_passed_1_0= RULE_NUMBER ) ) | ( (lv_number_passed_2_0= RULE_NULL ) ) ) )
            // InternalAnsibleDsl.g:6911:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_number_passed_1_0= RULE_NUMBER ) ) | ( (lv_number_passed_2_0= RULE_NULL ) ) )
            {
            // InternalAnsibleDsl.g:6911:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_number_passed_1_0= RULE_NUMBER ) ) | ( (lv_number_passed_2_0= RULE_NULL ) ) )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt92=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt92=2;
                }
                break;
            case RULE_NULL:
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
                    // InternalAnsibleDsl.g:6912:3: this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation
                    {

                    			newCompositeNode(grammarAccess.getENumberPassedAccess().getEJinjaExpressionEvaluationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EJinjaExpressionEvaluation_0=ruleEJinjaExpressionEvaluation();

                    state._fsp--;


                    			current = this_EJinjaExpressionEvaluation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:6921:3: ( (lv_number_passed_1_0= RULE_NUMBER ) )
                    {
                    // InternalAnsibleDsl.g:6921:3: ( (lv_number_passed_1_0= RULE_NUMBER ) )
                    // InternalAnsibleDsl.g:6922:4: (lv_number_passed_1_0= RULE_NUMBER )
                    {
                    // InternalAnsibleDsl.g:6922:4: (lv_number_passed_1_0= RULE_NUMBER )
                    // InternalAnsibleDsl.g:6923:5: lv_number_passed_1_0= RULE_NUMBER
                    {
                    lv_number_passed_1_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    					newLeafNode(lv_number_passed_1_0, grammarAccess.getENumberPassedAccess().getNumber_passedNUMBERTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getENumberPassedRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number_passed",
                    						lv_number_passed_1_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NUMBER");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:6940:3: ( (lv_number_passed_2_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:6940:3: ( (lv_number_passed_2_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:6941:4: (lv_number_passed_2_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:6941:4: (lv_number_passed_2_0= RULE_NULL )
                    // InternalAnsibleDsl.g:6942:5: lv_number_passed_2_0= RULE_NULL
                    {
                    lv_number_passed_2_0=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    					newLeafNode(lv_number_passed_2_0, grammarAccess.getENumberPassedAccess().getNumber_passedNULLTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getENumberPassedRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number_passed",
                    						lv_number_passed_2_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NULL");
                    				

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
    // $ANTLR end "ruleENumberPassed"


    // $ANTLR start "entryRuleEBooleanPassed"
    // InternalAnsibleDsl.g:6962:1: entryRuleEBooleanPassed returns [EObject current=null] : iv_ruleEBooleanPassed= ruleEBooleanPassed EOF ;
    public final EObject entryRuleEBooleanPassed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEBooleanPassed = null;


        try {
            // InternalAnsibleDsl.g:6962:55: (iv_ruleEBooleanPassed= ruleEBooleanPassed EOF )
            // InternalAnsibleDsl.g:6963:2: iv_ruleEBooleanPassed= ruleEBooleanPassed EOF
            {
             newCompositeNode(grammarAccess.getEBooleanPassedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBooleanPassed=ruleEBooleanPassed();

            state._fsp--;

             current =iv_ruleEBooleanPassed; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBooleanPassed"


    // $ANTLR start "ruleEBooleanPassed"
    // InternalAnsibleDsl.g:6969:1: ruleEBooleanPassed returns [EObject current=null] : (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_boolean_passed_1_0= RULE_BOOLEAN ) ) | ( (lv_boolean_passed_2_0= RULE_NULL ) ) ) ;
    public final EObject ruleEBooleanPassed() throws RecognitionException {
        EObject current = null;

        Token lv_boolean_passed_1_0=null;
        Token lv_boolean_passed_2_0=null;
        EObject this_EJinjaExpressionEvaluation_0 = null;



        	enterRule();

        try {
            // InternalAnsibleDsl.g:6975:2: ( (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_boolean_passed_1_0= RULE_BOOLEAN ) ) | ( (lv_boolean_passed_2_0= RULE_NULL ) ) ) )
            // InternalAnsibleDsl.g:6976:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_boolean_passed_1_0= RULE_BOOLEAN ) ) | ( (lv_boolean_passed_2_0= RULE_NULL ) ) )
            {
            // InternalAnsibleDsl.g:6976:2: (this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation | ( (lv_boolean_passed_1_0= RULE_BOOLEAN ) ) | ( (lv_boolean_passed_2_0= RULE_NULL ) ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt93=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt93=2;
                }
                break;
            case RULE_NULL:
                {
                alt93=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalAnsibleDsl.g:6977:3: this_EJinjaExpressionEvaluation_0= ruleEJinjaExpressionEvaluation
                    {

                    			newCompositeNode(grammarAccess.getEBooleanPassedAccess().getEJinjaExpressionEvaluationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EJinjaExpressionEvaluation_0=ruleEJinjaExpressionEvaluation();

                    state._fsp--;


                    			current = this_EJinjaExpressionEvaluation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnsibleDsl.g:6986:3: ( (lv_boolean_passed_1_0= RULE_BOOLEAN ) )
                    {
                    // InternalAnsibleDsl.g:6986:3: ( (lv_boolean_passed_1_0= RULE_BOOLEAN ) )
                    // InternalAnsibleDsl.g:6987:4: (lv_boolean_passed_1_0= RULE_BOOLEAN )
                    {
                    // InternalAnsibleDsl.g:6987:4: (lv_boolean_passed_1_0= RULE_BOOLEAN )
                    // InternalAnsibleDsl.g:6988:5: lv_boolean_passed_1_0= RULE_BOOLEAN
                    {
                    lv_boolean_passed_1_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    					newLeafNode(lv_boolean_passed_1_0, grammarAccess.getEBooleanPassedAccess().getBoolean_passedBOOLEANTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEBooleanPassedRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"boolean_passed",
                    						lv_boolean_passed_1_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.BOOLEAN");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAnsibleDsl.g:7005:3: ( (lv_boolean_passed_2_0= RULE_NULL ) )
                    {
                    // InternalAnsibleDsl.g:7005:3: ( (lv_boolean_passed_2_0= RULE_NULL ) )
                    // InternalAnsibleDsl.g:7006:4: (lv_boolean_passed_2_0= RULE_NULL )
                    {
                    // InternalAnsibleDsl.g:7006:4: (lv_boolean_passed_2_0= RULE_NULL )
                    // InternalAnsibleDsl.g:7007:5: lv_boolean_passed_2_0= RULE_NULL
                    {
                    lv_boolean_passed_2_0=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    					newLeafNode(lv_boolean_passed_2_0, grammarAccess.getEBooleanPassedAccess().getBoolean_passedNULLTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEBooleanPassedRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"boolean_passed",
                    						lv_boolean_passed_2_0,
                    						"org.sodalite.sdl.ansible.AnsibleDsl.NULL");
                    				

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
    // $ANTLR end "ruleEBooleanPassed"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\24\13\uffff";
    static final String dfa_4s = "\1\45\13\uffff";
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
            return "()* loopback of 356:5: ( ({...}? => ( ({...}? => (otherlv_1= 'privilage_escalation{' ( (lv_privilage_escalation_2_0= ruleEPrivilageEscalation ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'validation_mode{' ( (lv_validation_mode_5_0= ruleEValidationMode ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'connection_info{' ( (lv_connection_8_0= ruleEConnection ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'no_log:' ( (lv_no_log_11_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'debugger:' ( ( (lv_debugger_13_1= 'always' | lv_debugger_13_2= 'never' | lv_debugger_13_3= 'on_failed' | lv_debugger_13_4= 'on_unreachable' | lv_debugger_13_5= 'on_skipped' ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'module_defaults:' ( (lv_module_defaults_15_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'environment:' ( (lv_environment_17_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'collections:' ( (lv_collections_19_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'tags:' ( (lv_tags_21_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'vars{' ( (lv_variable_declarations_23_0= ruleEVariableDeclaration ) )+ otherlv_24= '}' ) ) ) ) )*";
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
                        if ( (LA8_0==EOF||LA8_0==20) ) {s = 1;}

                        else if ( LA8_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA8_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA8_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA8_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA8_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA8_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA8_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA8_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA8_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA8_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEBaseAttributesAccess().getUnorderedGroup(), 9) ) {s = 11;}

                         
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
    static final String dfa_10s = "\1\24\11\uffff";
    static final String dfa_11s = "\1\u0099\11\uffff";
    static final String dfa_12s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_13s = "\1\0\11\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\24\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\151\uffff\1\11",
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
            return "()+ loopback of 925:5: ( ({...}? => ( ({...}? => (otherlv_1= 'error_handling{' ( (lv_error_handling_2_0= ruleETaskHandlerErrorHandling ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'action:' ( (lv_action_5_0= ruleEJinjaExpressionAndString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'asynchronous_settings{' ( (lv_asynchronous_settings_7_0= ruleEAsynchronousSettings ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'args:' ( (lv_args_10_0= ruleEDictionaryPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'module_call{' ( (lv_module_12_0= ruleEModuleCall ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'notify:' ( (lv_notifiables_15_0= ruleENotifiable ) )+ ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'loop{' ( (lv_loop_17_0= ruleELoop ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_register_19_0= ruleERegisterVariable ) ) ) ) ) )+";
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
                        if ( (LA11_0==EOF||LA11_0==20) ) {s = 1;}

                        else if ( LA11_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA11_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA11_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA11_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA11_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA11_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA11_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA11_0 == 153 && getUnorderedGroupHelper().canSelect(grammarAccess.getETaskHandlerAttributesAccess().getUnorderedGroup(), 7) ) {s = 9;}

                         
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
    static final String dfa_17s = "\1\24\14\uffff";
    static final String dfa_18s = "\1\115\14\uffff";
    static final String dfa_19s = "\1\uffff\1\14\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String dfa_20s = "\1\0\14\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\24\uffff\1\3\6\uffff\1\2\2\uffff\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14\22\uffff\1\11",
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
            return "()+ loopback of 1239:5: ( ({...}? => ( ({...}? => (otherlv_1= 'play_name:' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'base_attributes{' ( (lv_base_attributes_4_0= ruleEBaseAttributes ) ) otherlv_5= '}' )? (otherlv_6= 'play_exe_settings{' ( (lv_play_exe_settings_7_0= ruleEPlayExeSettings ) ) otherlv_8= '}' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'error_handling{' ( (lv_error_handling_10_0= ruleEPlayErrorHandling ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'facts_settings{' ( (lv_facts_settings_13_0= ruleEFactsSettings ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'vars_files:' ( (lv_vars_files_16_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'vars_prompt:' ( (lv_vars_prompt_18_0= ruleEListPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'force_handlers:' ( (lv_force_handlers_20_0= ruleEBooleanPassed ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'pre_tasks{' ( (lv_pre_tasks_list_22_0= ruleEBlockTask ) )+ otherlv_23= '}' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_roles_inclusions_24_0= ruleERoleInclusions ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'tasks_list{' ( (lv_tasks_list_26_0= ruleEBlockTask ) )+ otherlv_27= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'post_tasks{' ( (lv_post_tasks_list_29_0= ruleEBlockTask ) )+ otherlv_30= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'handlers{' ( (lv_handlers_32_0= ruleEHandler ) )+ otherlv_33= '}' ) ) ) ) )+";
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
                        if ( (LA18_0==EOF||LA18_0==20) ) {s = 1;}

                        else if ( LA18_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 0) ) {s = 2;}

                        else if ( LA18_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 1) ) {s = 3;}

                        else if ( LA18_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 2) ) {s = 4;}

                        else if ( LA18_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 3) ) {s = 5;}

                        else if ( LA18_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 4) ) {s = 6;}

                        else if ( LA18_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 5) ) {s = 7;}

                        else if ( LA18_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 6) ) {s = 8;}

                        else if ( LA18_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA18_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 8) ) {s = 10;}

                        else if ( LA18_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 9) ) {s = 11;}

                        else if ( LA18_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPlayAccess().getUnorderedGroup(), 10) ) {s = 12;}

                         
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x07F9020000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L,0x000000001F000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000003E0F800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L,0x0000000060000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L,0x0000000380000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000000C0L,0x0080000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000100000L,0x0000006000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100000L,0x0006000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000003F0L,0x02C0000000000000L,0x000000003DC90000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L,0x00001B8000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000FE0000000002L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000010L,0x0080000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000100000L,0x0018000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000010L,0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000FE0000000012L,0x0020000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000204000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x07FF020000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000003E0F900000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x07FD020000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000100000L,0x0000007C00000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x07F9020000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000100000L,0x0000078000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000100000L,0x0001E00000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x7002020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x6002020000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x6000020000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000001C000100000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000020000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000100000L,0x0000038000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8000000000100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2002000000100000L,0x000000000000000CL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2002000000100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x2000000000100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000008L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000FE0000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2002000000100000L,0x0000000000000068L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2002000000100000L,0x0000000000000048L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2000000000100000L,0x0000000000000048L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000048L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000040L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x00000000000003D0L,0x0080000000000000L,0x0000000020010000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2002000000100000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x2000000000100000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000100000L,0x00000000001F0000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x00000000001F0000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000180L,0x0080000000000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000002L,0x0000000000C00000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x000000001F000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000380000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000007C00000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000002L,0x0000006000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000002L,0x0000038000000000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000002L,0x0000078000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000002L,0x00001B8000000000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000002L,0x0001E00000000000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000002L,0x0006000000000000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000002L,0x0018000000000000L});
    public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000000000000012L,0x0080000000000000L});
    public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000002L,0x1200000000000000L});
    public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x00000000000003F0L,0x02C0000000000000L,0x000000003DC10000L});
    public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001FC0L});
    public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000E000L});
    public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x00000000000003F0L,0x02C0000000000000L,0x000000003DC14000L});
    public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000050000L});
    public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x00000000000003F0L,0x00C0000000000000L,0x000000003DC10000L});
    public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000100000L,0x0400000000000000L});
    public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L,0x0000000000020000L});

}
