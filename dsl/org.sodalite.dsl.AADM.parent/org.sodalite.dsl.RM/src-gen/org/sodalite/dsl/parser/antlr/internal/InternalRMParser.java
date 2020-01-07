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
import org.sodalite.dsl.services.RMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_PRIMITIVE_DATA_TYPE", "RULE_ID", "RULE_BOOLEAN", "RULE_ENTITY", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'data_types{'", "'}'", "'artifact_types{'", "'capability_types{'", "'interface_types{'", "'relationship_types{'", "'node_types{'", "'policy_types{'", "'{'", "'derived_from:'", "'description:'", "'constraints{'", "'properties{'", "'mime_type:'", "'file_ext:'", "'attributes{'", "'inputs{'", "'operations{'", "'interfaces{'", "'capabilities{'", "'requirements{'", "'valid_target_types:'", "'type:'", "'required:'", "'default:'", "'status:'", "'entry_schema:'", "'implementation:'", "'value:'", "'get_attribute{'", "'attribute:'", "'entity:'", "'req_cap:'", "'get_property{'", "'property:'", "'valid_source_types:'", "'occurrences:'", "'['", "','", "']'", "'capability:'", "'node:'", "'relationship:'", "'max_length:'", "'min_length:'", "'length:'", "'valid_values:'", "'in_range:'", "'less_or_equal:'", "'less_than:'", "'greater_or_equal:'", "'greater_than:'", "'equal:'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_QUALIFIED_NAME=5;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_ENTITY=9;
    public static final int RULE_PRIMITIVE_DATA_TYPE=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
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

    // delegates
    // delegators


        public InternalRMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRM.g"; }



     	private RMGrammarAccess grammarAccess;

        public InternalRMParser(TokenStream input, RMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RM_Model";
       	}

       	@Override
       	protected RMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRM_Model"
    // InternalRM.g:64:1: entryRuleRM_Model returns [EObject current=null] : iv_ruleRM_Model= ruleRM_Model EOF ;
    public final EObject entryRuleRM_Model() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRM_Model = null;


        try {
            // InternalRM.g:64:49: (iv_ruleRM_Model= ruleRM_Model EOF )
            // InternalRM.g:65:2: iv_ruleRM_Model= ruleRM_Model EOF
            {
             newCompositeNode(grammarAccess.getRM_ModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRM_Model=ruleRM_Model();

            state._fsp--;

             current =iv_ruleRM_Model; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRM_Model"


    // $ANTLR start "ruleRM_Model"
    // InternalRM.g:71:1: ruleRM_Model returns [EObject current=null] : ( (otherlv_0= 'data_types{' ( (lv_dataTypes_1_0= ruleEDataTypes ) ) otherlv_2= '}' )? (otherlv_3= 'artifact_types{' ( (lv_artifactTypes_4_0= ruleEArtifactTypes ) ) otherlv_5= '}' )? (otherlv_6= 'capability_types{' ( (lv_capabilityTypes_7_0= ruleECapabilityTypes ) ) otherlv_8= '}' )? (otherlv_9= 'interface_types{' ( (lv_interfaceTypes_10_0= ruleEInterfaceTypes ) ) otherlv_11= '}' )? (otherlv_12= 'relationship_types{' ( (lv_relationshipTypes_13_0= ruleERelationshipTypes ) ) otherlv_14= '}' )? (otherlv_15= 'node_types{' ( (lv_nodeTypes_16_0= ruleENodeTypes ) ) otherlv_17= '}' )? (otherlv_18= 'policy_types{' ( (lv_policyTypes_19_0= ruleEPolicyTypes ) ) otherlv_20= '}' )? ) ;
    public final EObject ruleRM_Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
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
        EObject lv_dataTypes_1_0 = null;

        EObject lv_artifactTypes_4_0 = null;

        EObject lv_capabilityTypes_7_0 = null;

        EObject lv_interfaceTypes_10_0 = null;

        EObject lv_relationshipTypes_13_0 = null;

        EObject lv_nodeTypes_16_0 = null;

        EObject lv_policyTypes_19_0 = null;



        	enterRule();

        try {
            // InternalRM.g:77:2: ( ( (otherlv_0= 'data_types{' ( (lv_dataTypes_1_0= ruleEDataTypes ) ) otherlv_2= '}' )? (otherlv_3= 'artifact_types{' ( (lv_artifactTypes_4_0= ruleEArtifactTypes ) ) otherlv_5= '}' )? (otherlv_6= 'capability_types{' ( (lv_capabilityTypes_7_0= ruleECapabilityTypes ) ) otherlv_8= '}' )? (otherlv_9= 'interface_types{' ( (lv_interfaceTypes_10_0= ruleEInterfaceTypes ) ) otherlv_11= '}' )? (otherlv_12= 'relationship_types{' ( (lv_relationshipTypes_13_0= ruleERelationshipTypes ) ) otherlv_14= '}' )? (otherlv_15= 'node_types{' ( (lv_nodeTypes_16_0= ruleENodeTypes ) ) otherlv_17= '}' )? (otherlv_18= 'policy_types{' ( (lv_policyTypes_19_0= ruleEPolicyTypes ) ) otherlv_20= '}' )? ) )
            // InternalRM.g:78:2: ( (otherlv_0= 'data_types{' ( (lv_dataTypes_1_0= ruleEDataTypes ) ) otherlv_2= '}' )? (otherlv_3= 'artifact_types{' ( (lv_artifactTypes_4_0= ruleEArtifactTypes ) ) otherlv_5= '}' )? (otherlv_6= 'capability_types{' ( (lv_capabilityTypes_7_0= ruleECapabilityTypes ) ) otherlv_8= '}' )? (otherlv_9= 'interface_types{' ( (lv_interfaceTypes_10_0= ruleEInterfaceTypes ) ) otherlv_11= '}' )? (otherlv_12= 'relationship_types{' ( (lv_relationshipTypes_13_0= ruleERelationshipTypes ) ) otherlv_14= '}' )? (otherlv_15= 'node_types{' ( (lv_nodeTypes_16_0= ruleENodeTypes ) ) otherlv_17= '}' )? (otherlv_18= 'policy_types{' ( (lv_policyTypes_19_0= ruleEPolicyTypes ) ) otherlv_20= '}' )? )
            {
            // InternalRM.g:78:2: ( (otherlv_0= 'data_types{' ( (lv_dataTypes_1_0= ruleEDataTypes ) ) otherlv_2= '}' )? (otherlv_3= 'artifact_types{' ( (lv_artifactTypes_4_0= ruleEArtifactTypes ) ) otherlv_5= '}' )? (otherlv_6= 'capability_types{' ( (lv_capabilityTypes_7_0= ruleECapabilityTypes ) ) otherlv_8= '}' )? (otherlv_9= 'interface_types{' ( (lv_interfaceTypes_10_0= ruleEInterfaceTypes ) ) otherlv_11= '}' )? (otherlv_12= 'relationship_types{' ( (lv_relationshipTypes_13_0= ruleERelationshipTypes ) ) otherlv_14= '}' )? (otherlv_15= 'node_types{' ( (lv_nodeTypes_16_0= ruleENodeTypes ) ) otherlv_17= '}' )? (otherlv_18= 'policy_types{' ( (lv_policyTypes_19_0= ruleEPolicyTypes ) ) otherlv_20= '}' )? )
            // InternalRM.g:79:3: (otherlv_0= 'data_types{' ( (lv_dataTypes_1_0= ruleEDataTypes ) ) otherlv_2= '}' )? (otherlv_3= 'artifact_types{' ( (lv_artifactTypes_4_0= ruleEArtifactTypes ) ) otherlv_5= '}' )? (otherlv_6= 'capability_types{' ( (lv_capabilityTypes_7_0= ruleECapabilityTypes ) ) otherlv_8= '}' )? (otherlv_9= 'interface_types{' ( (lv_interfaceTypes_10_0= ruleEInterfaceTypes ) ) otherlv_11= '}' )? (otherlv_12= 'relationship_types{' ( (lv_relationshipTypes_13_0= ruleERelationshipTypes ) ) otherlv_14= '}' )? (otherlv_15= 'node_types{' ( (lv_nodeTypes_16_0= ruleENodeTypes ) ) otherlv_17= '}' )? (otherlv_18= 'policy_types{' ( (lv_policyTypes_19_0= ruleEPolicyTypes ) ) otherlv_20= '}' )?
            {
            // InternalRM.g:79:3: (otherlv_0= 'data_types{' ( (lv_dataTypes_1_0= ruleEDataTypes ) ) otherlv_2= '}' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRM.g:80:4: otherlv_0= 'data_types{' ( (lv_dataTypes_1_0= ruleEDataTypes ) ) otherlv_2= '}'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getRM_ModelAccess().getData_typesKeyword_0_0());
                    			
                    // InternalRM.g:84:4: ( (lv_dataTypes_1_0= ruleEDataTypes ) )
                    // InternalRM.g:85:5: (lv_dataTypes_1_0= ruleEDataTypes )
                    {
                    // InternalRM.g:85:5: (lv_dataTypes_1_0= ruleEDataTypes )
                    // InternalRM.g:86:6: lv_dataTypes_1_0= ruleEDataTypes
                    {

                    						newCompositeNode(grammarAccess.getRM_ModelAccess().getDataTypesEDataTypesParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_dataTypes_1_0=ruleEDataTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRM_ModelRule());
                    						}
                    						set(
                    							current,
                    							"dataTypes",
                    							lv_dataTypes_1_0,
                    							"org.sodalite.dsl.RM.EDataTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:108:3: (otherlv_3= 'artifact_types{' ( (lv_artifactTypes_4_0= ruleEArtifactTypes ) ) otherlv_5= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRM.g:109:4: otherlv_3= 'artifact_types{' ( (lv_artifactTypes_4_0= ruleEArtifactTypes ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getRM_ModelAccess().getArtifact_typesKeyword_1_0());
                    			
                    // InternalRM.g:113:4: ( (lv_artifactTypes_4_0= ruleEArtifactTypes ) )
                    // InternalRM.g:114:5: (lv_artifactTypes_4_0= ruleEArtifactTypes )
                    {
                    // InternalRM.g:114:5: (lv_artifactTypes_4_0= ruleEArtifactTypes )
                    // InternalRM.g:115:6: lv_artifactTypes_4_0= ruleEArtifactTypes
                    {

                    						newCompositeNode(grammarAccess.getRM_ModelAccess().getArtifactTypesEArtifactTypesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_artifactTypes_4_0=ruleEArtifactTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRM_ModelRule());
                    						}
                    						set(
                    							current,
                    							"artifactTypes",
                    							lv_artifactTypes_4_0,
                    							"org.sodalite.dsl.RM.EArtifactTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:137:3: (otherlv_6= 'capability_types{' ( (lv_capabilityTypes_7_0= ruleECapabilityTypes ) ) otherlv_8= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRM.g:138:4: otherlv_6= 'capability_types{' ( (lv_capabilityTypes_7_0= ruleECapabilityTypes ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getRM_ModelAccess().getCapability_typesKeyword_2_0());
                    			
                    // InternalRM.g:142:4: ( (lv_capabilityTypes_7_0= ruleECapabilityTypes ) )
                    // InternalRM.g:143:5: (lv_capabilityTypes_7_0= ruleECapabilityTypes )
                    {
                    // InternalRM.g:143:5: (lv_capabilityTypes_7_0= ruleECapabilityTypes )
                    // InternalRM.g:144:6: lv_capabilityTypes_7_0= ruleECapabilityTypes
                    {

                    						newCompositeNode(grammarAccess.getRM_ModelAccess().getCapabilityTypesECapabilityTypesParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_capabilityTypes_7_0=ruleECapabilityTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRM_ModelRule());
                    						}
                    						set(
                    							current,
                    							"capabilityTypes",
                    							lv_capabilityTypes_7_0,
                    							"org.sodalite.dsl.RM.ECapabilityTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:166:3: (otherlv_9= 'interface_types{' ( (lv_interfaceTypes_10_0= ruleEInterfaceTypes ) ) otherlv_11= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRM.g:167:4: otherlv_9= 'interface_types{' ( (lv_interfaceTypes_10_0= ruleEInterfaceTypes ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getRM_ModelAccess().getInterface_typesKeyword_3_0());
                    			
                    // InternalRM.g:171:4: ( (lv_interfaceTypes_10_0= ruleEInterfaceTypes ) )
                    // InternalRM.g:172:5: (lv_interfaceTypes_10_0= ruleEInterfaceTypes )
                    {
                    // InternalRM.g:172:5: (lv_interfaceTypes_10_0= ruleEInterfaceTypes )
                    // InternalRM.g:173:6: lv_interfaceTypes_10_0= ruleEInterfaceTypes
                    {

                    						newCompositeNode(grammarAccess.getRM_ModelAccess().getInterfaceTypesEInterfaceTypesParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_interfaceTypes_10_0=ruleEInterfaceTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRM_ModelRule());
                    						}
                    						set(
                    							current,
                    							"interfaceTypes",
                    							lv_interfaceTypes_10_0,
                    							"org.sodalite.dsl.RM.EInterfaceTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:195:3: (otherlv_12= 'relationship_types{' ( (lv_relationshipTypes_13_0= ruleERelationshipTypes ) ) otherlv_14= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRM.g:196:4: otherlv_12= 'relationship_types{' ( (lv_relationshipTypes_13_0= ruleERelationshipTypes ) ) otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getRM_ModelAccess().getRelationship_typesKeyword_4_0());
                    			
                    // InternalRM.g:200:4: ( (lv_relationshipTypes_13_0= ruleERelationshipTypes ) )
                    // InternalRM.g:201:5: (lv_relationshipTypes_13_0= ruleERelationshipTypes )
                    {
                    // InternalRM.g:201:5: (lv_relationshipTypes_13_0= ruleERelationshipTypes )
                    // InternalRM.g:202:6: lv_relationshipTypes_13_0= ruleERelationshipTypes
                    {

                    						newCompositeNode(grammarAccess.getRM_ModelAccess().getRelationshipTypesERelationshipTypesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_relationshipTypes_13_0=ruleERelationshipTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRM_ModelRule());
                    						}
                    						set(
                    							current,
                    							"relationshipTypes",
                    							lv_relationshipTypes_13_0,
                    							"org.sodalite.dsl.RM.ERelationshipTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_14, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:224:3: (otherlv_15= 'node_types{' ( (lv_nodeTypes_16_0= ruleENodeTypes ) ) otherlv_17= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRM.g:225:4: otherlv_15= 'node_types{' ( (lv_nodeTypes_16_0= ruleENodeTypes ) ) otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_15, grammarAccess.getRM_ModelAccess().getNode_typesKeyword_5_0());
                    			
                    // InternalRM.g:229:4: ( (lv_nodeTypes_16_0= ruleENodeTypes ) )
                    // InternalRM.g:230:5: (lv_nodeTypes_16_0= ruleENodeTypes )
                    {
                    // InternalRM.g:230:5: (lv_nodeTypes_16_0= ruleENodeTypes )
                    // InternalRM.g:231:6: lv_nodeTypes_16_0= ruleENodeTypes
                    {

                    						newCompositeNode(grammarAccess.getRM_ModelAccess().getNodeTypesENodeTypesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_nodeTypes_16_0=ruleENodeTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRM_ModelRule());
                    						}
                    						set(
                    							current,
                    							"nodeTypes",
                    							lv_nodeTypes_16_0,
                    							"org.sodalite.dsl.RM.ENodeTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:253:3: (otherlv_18= 'policy_types{' ( (lv_policyTypes_19_0= ruleEPolicyTypes ) ) otherlv_20= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRM.g:254:4: otherlv_18= 'policy_types{' ( (lv_policyTypes_19_0= ruleEPolicyTypes ) ) otherlv_20= '}'
                    {
                    otherlv_18=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getRM_ModelAccess().getPolicy_typesKeyword_6_0());
                    			
                    // InternalRM.g:258:4: ( (lv_policyTypes_19_0= ruleEPolicyTypes ) )
                    // InternalRM.g:259:5: (lv_policyTypes_19_0= ruleEPolicyTypes )
                    {
                    // InternalRM.g:259:5: (lv_policyTypes_19_0= ruleEPolicyTypes )
                    // InternalRM.g:260:6: lv_policyTypes_19_0= ruleEPolicyTypes
                    {

                    						newCompositeNode(grammarAccess.getRM_ModelAccess().getPolicyTypesEPolicyTypesParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_policyTypes_19_0=ruleEPolicyTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRM_ModelRule());
                    						}
                    						set(
                    							current,
                    							"policyTypes",
                    							lv_policyTypes_19_0,
                    							"org.sodalite.dsl.RM.EPolicyTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_6_2());
                    			

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
    // $ANTLR end "ruleRM_Model"


    // $ANTLR start "entryRuleEDataTypes"
    // InternalRM.g:286:1: entryRuleEDataTypes returns [EObject current=null] : iv_ruleEDataTypes= ruleEDataTypes EOF ;
    public final EObject entryRuleEDataTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypes = null;


        try {
            // InternalRM.g:286:51: (iv_ruleEDataTypes= ruleEDataTypes EOF )
            // InternalRM.g:287:2: iv_ruleEDataTypes= ruleEDataTypes EOF
            {
             newCompositeNode(grammarAccess.getEDataTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataTypes=ruleEDataTypes();

            state._fsp--;

             current =iv_ruleEDataTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDataTypes"


    // $ANTLR start "ruleEDataTypes"
    // InternalRM.g:293:1: ruleEDataTypes returns [EObject current=null] : ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ ) ;
    public final EObject ruleEDataTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_dataTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:299:2: ( ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ ) )
            // InternalRM.g:300:2: ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ )
            {
            // InternalRM.g:300:2: ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ )
            // InternalRM.g:301:3: () ( (lv_dataTypes_1_0= ruleEDataType ) )+
            {
            // InternalRM.g:301:3: ()
            // InternalRM.g:302:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataTypesAccess().getEDataTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:308:3: ( (lv_dataTypes_1_0= ruleEDataType ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_QUALIFIED_NAME && LA8_0<=RULE_PRIMITIVE_DATA_TYPE)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRM.g:309:4: (lv_dataTypes_1_0= ruleEDataType )
            	    {
            	    // InternalRM.g:309:4: (lv_dataTypes_1_0= ruleEDataType )
            	    // InternalRM.g:310:5: lv_dataTypes_1_0= ruleEDataType
            	    {

            	    					newCompositeNode(grammarAccess.getEDataTypesAccess().getDataTypesEDataTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_dataTypes_1_0=ruleEDataType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEDataTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataTypes",
            	    						lv_dataTypes_1_0,
            	    						"org.sodalite.dsl.RM.EDataType");
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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDataTypes"


    // $ANTLR start "entryRuleEDataType"
    // InternalRM.g:331:1: entryRuleEDataType returns [EObject current=null] : iv_ruleEDataType= ruleEDataType EOF ;
    public final EObject entryRuleEDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType = null;


        try {
            // InternalRM.g:331:50: (iv_ruleEDataType= ruleEDataType EOF )
            // InternalRM.g:332:2: iv_ruleEDataType= ruleEDataType EOF
            {
             newCompositeNode(grammarAccess.getEDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataType=ruleEDataType();

            state._fsp--;

             current =iv_ruleEDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDataType"


    // $ANTLR start "ruleEDataType"
    // InternalRM.g:338:1: ruleEDataType returns [EObject current=null] : ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' )? (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleEDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_constraints_7_0 = null;

        EObject lv_properties_10_0 = null;



        	enterRule();

        try {
            // InternalRM.g:344:2: ( ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' )? (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalRM.g:345:2: ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' )? (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalRM.g:345:2: ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' )? (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' )? otherlv_12= '}' )
            // InternalRM.g:346:3: ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' )? (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalRM.g:346:3: ( (lv_name_0_0= ruleEDataTypeName ) )
            // InternalRM.g:347:4: (lv_name_0_0= ruleEDataTypeName )
            {
            // InternalRM.g:347:4: (lv_name_0_0= ruleEDataTypeName )
            // InternalRM.g:348:5: lv_name_0_0= ruleEDataTypeName
            {

            					newCompositeNode(grammarAccess.getEDataTypeAccess().getNameEDataTypeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_0_0=ruleEDataTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDataTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.EDataTypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:369:3: (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRM.g:370:4: otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getEDataTypeAccess().getDerived_fromKeyword_2_0());
                    			
                    // InternalRM.g:374:4: ( ( ruleEDataTypeName ) )
                    // InternalRM.g:375:5: ( ruleEDataTypeName )
                    {
                    // InternalRM.g:375:5: ( ruleEDataTypeName )
                    // InternalRM.g:376:6: ruleEDataTypeName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEDataTypeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEDataTypeAccess().getSuperTypeEDataTypeCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEDataTypeName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:391:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRM.g:392:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEDataTypeAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRM.g:396:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRM.g:397:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRM.g:397:5: (lv_description_5_0= RULE_STRING )
                    // InternalRM.g:398:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getEDataTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEDataTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:415:3: (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRM.g:416:4: otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getEDataTypeAccess().getConstraintsKeyword_4_0());
                    			
                    // InternalRM.g:420:4: ( (lv_constraints_7_0= ruleEConstraints ) )
                    // InternalRM.g:421:5: (lv_constraints_7_0= ruleEConstraints )
                    {
                    // InternalRM.g:421:5: (lv_constraints_7_0= ruleEConstraints )
                    // InternalRM.g:422:6: lv_constraints_7_0= ruleEConstraints
                    {

                    						newCompositeNode(grammarAccess.getEDataTypeAccess().getConstraintsEConstraintsParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_constraints_7_0=ruleEConstraints();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataTypeRule());
                    						}
                    						set(
                    							current,
                    							"constraints",
                    							lv_constraints_7_0,
                    							"org.sodalite.dsl.RM.EConstraints");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getEDataTypeAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:444:3: (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRM.g:445:4: otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getEDataTypeAccess().getPropertiesKeyword_5_0());
                    			
                    // InternalRM.g:449:4: ( (lv_properties_10_0= ruleEProperties ) )
                    // InternalRM.g:450:5: (lv_properties_10_0= ruleEProperties )
                    {
                    // InternalRM.g:450:5: (lv_properties_10_0= ruleEProperties )
                    // InternalRM.g:451:6: lv_properties_10_0= ruleEProperties
                    {

                    						newCompositeNode(grammarAccess.getEDataTypeAccess().getPropertiesEPropertiesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_properties_10_0=ruleEProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEDataTypeRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_10_0,
                    							"org.sodalite.dsl.RM.EProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEDataTypeAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEDataTypeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDataType"


    // $ANTLR start "entryRuleEDataTypeName"
    // InternalRM.g:481:1: entryRuleEDataTypeName returns [String current=null] : iv_ruleEDataTypeName= ruleEDataTypeName EOF ;
    public final String entryRuleEDataTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDataTypeName = null;


        try {
            // InternalRM.g:481:53: (iv_ruleEDataTypeName= ruleEDataTypeName EOF )
            // InternalRM.g:482:2: iv_ruleEDataTypeName= ruleEDataTypeName EOF
            {
             newCompositeNode(grammarAccess.getEDataTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataTypeName=ruleEDataTypeName();

            state._fsp--;

             current =iv_ruleEDataTypeName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalRM.g:488:1: ruleEDataTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleEDataTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUALIFIED_NAME_0=null;
        Token this_PRIMITIVE_DATA_TYPE_1=null;


        	enterRule();

        try {
            // InternalRM.g:494:2: ( (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) )
            // InternalRM.g:495:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
            {
            // InternalRM.g:495:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_QUALIFIED_NAME) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_PRIMITIVE_DATA_TYPE) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRM.g:496:3: this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME
                    {
                    this_QUALIFIED_NAME_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_NAME_0);
                    		

                    			newLeafNode(this_QUALIFIED_NAME_0, grammarAccess.getEDataTypeNameAccess().getQUALIFIED_NAMETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRM.g:504:3: this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE
                    {
                    this_PRIMITIVE_DATA_TYPE_1=(Token)match(input,RULE_PRIMITIVE_DATA_TYPE,FOLLOW_2); 

                    			current.merge(this_PRIMITIVE_DATA_TYPE_1);
                    		

                    			newLeafNode(this_PRIMITIVE_DATA_TYPE_1, grammarAccess.getEDataTypeNameAccess().getPRIMITIVE_DATA_TYPETerminalRuleCall_1());
                    		

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


    // $ANTLR start "entryRuleEArtifactTypes"
    // InternalRM.g:515:1: entryRuleEArtifactTypes returns [EObject current=null] : iv_ruleEArtifactTypes= ruleEArtifactTypes EOF ;
    public final EObject entryRuleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypes = null;


        try {
            // InternalRM.g:515:55: (iv_ruleEArtifactTypes= ruleEArtifactTypes EOF )
            // InternalRM.g:516:2: iv_ruleEArtifactTypes= ruleEArtifactTypes EOF
            {
             newCompositeNode(grammarAccess.getEArtifactTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEArtifactTypes=ruleEArtifactTypes();

            state._fsp--;

             current =iv_ruleEArtifactTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEArtifactTypes"


    // $ANTLR start "ruleEArtifactTypes"
    // InternalRM.g:522:1: ruleEArtifactTypes returns [EObject current=null] : ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) ;
    public final EObject ruleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_artifactTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:528:2: ( ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) )
            // InternalRM.g:529:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            {
            // InternalRM.g:529:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            // InternalRM.g:530:3: () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            {
            // InternalRM.g:530:3: ()
            // InternalRM.g:531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypesAccess().getEArtifactTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:537:3: ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_QUALIFIED_NAME) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRM.g:538:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    {
            	    // InternalRM.g:538:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    // InternalRM.g:539:5: lv_artifactTypes_1_0= ruleEArtifactType
            	    {

            	    					newCompositeNode(grammarAccess.getEArtifactTypesAccess().getArtifactTypesEArtifactTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_artifactTypes_1_0=ruleEArtifactType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEArtifactTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"artifactTypes",
            	    						lv_artifactTypes_1_0,
            	    						"org.sodalite.dsl.RM.EArtifactType");
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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEArtifactTypes"


    // $ANTLR start "entryRuleEArtifactType"
    // InternalRM.g:560:1: entryRuleEArtifactType returns [EObject current=null] : iv_ruleEArtifactType= ruleEArtifactType EOF ;
    public final EObject entryRuleEArtifactType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactType = null;


        try {
            // InternalRM.g:560:54: (iv_ruleEArtifactType= ruleEArtifactType EOF )
            // InternalRM.g:561:2: iv_ruleEArtifactType= ruleEArtifactType EOF
            {
             newCompositeNode(grammarAccess.getEArtifactTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEArtifactType=ruleEArtifactType();

            state._fsp--;

             current =iv_ruleEArtifactType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEArtifactType"


    // $ANTLR start "ruleEArtifactType"
    // InternalRM.g:567:1: ruleEArtifactType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleEArtifactType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_mime_type_7_0=null;
        Token otherlv_8=null;
        Token lv_file_ext_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalRM.g:573:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )? otherlv_10= '}' ) )
            // InternalRM.g:574:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            {
            // InternalRM.g:574:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )? otherlv_10= '}' )
            // InternalRM.g:575:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) )? ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )? otherlv_10= '}'
            {
            // InternalRM.g:575:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:576:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:576:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:577:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEArtifactTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEArtifactTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEArtifactTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:597:3: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRM.g:598:4: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getEArtifactTypeAccess().getDerived_fromKeyword_2_0());
                    			
                    // InternalRM.g:602:4: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    // InternalRM.g:603:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    {
                    // InternalRM.g:603:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    // InternalRM.g:604:6: otherlv_3= RULE_QUALIFIED_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEArtifactTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_23); 

                    						newLeafNode(otherlv_3, grammarAccess.getEArtifactTypeAccess().getSuperTypeEArtifactTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:616:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRM.g:617:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEArtifactTypeAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRM.g:621:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRM.g:622:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRM.g:622:5: (lv_description_5_0= RULE_STRING )
                    // InternalRM.g:623:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getEArtifactTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEArtifactTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:640:3: (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRM.g:641:4: otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getEArtifactTypeAccess().getMime_typeKeyword_4_0());
                    			
                    // InternalRM.g:645:4: ( (lv_mime_type_7_0= RULE_STRING ) )
                    // InternalRM.g:646:5: (lv_mime_type_7_0= RULE_STRING )
                    {
                    // InternalRM.g:646:5: (lv_mime_type_7_0= RULE_STRING )
                    // InternalRM.g:647:6: lv_mime_type_7_0= RULE_STRING
                    {
                    lv_mime_type_7_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    						newLeafNode(lv_mime_type_7_0, grammarAccess.getEArtifactTypeAccess().getMime_typeSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEArtifactTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"mime_type",
                    							lv_mime_type_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:664:3: ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRM.g:665:4: (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) )
                    {
                    // InternalRM.g:665:4: (otherlv_8= 'file_ext:' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==29) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRM.g:666:5: otherlv_8= 'file_ext:'
                    	    {
                    	    otherlv_8=(Token)match(input,29,FOLLOW_26); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getEArtifactTypeAccess().getFile_extKeyword_5_0());
                    	    				

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

                    // InternalRM.g:671:4: ( (lv_file_ext_9_0= RULE_STRING ) )
                    // InternalRM.g:672:5: (lv_file_ext_9_0= RULE_STRING )
                    {
                    // InternalRM.g:672:5: (lv_file_ext_9_0= RULE_STRING )
                    // InternalRM.g:673:6: lv_file_ext_9_0= RULE_STRING
                    {
                    lv_file_ext_9_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_file_ext_9_0, grammarAccess.getEArtifactTypeAccess().getFile_extSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEArtifactTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"file_ext",
                    							lv_file_ext_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEArtifactTypeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEArtifactType"


    // $ANTLR start "entryRuleECapabilityTypes"
    // InternalRM.g:698:1: entryRuleECapabilityTypes returns [EObject current=null] : iv_ruleECapabilityTypes= ruleECapabilityTypes EOF ;
    public final EObject entryRuleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypes = null;


        try {
            // InternalRM.g:698:57: (iv_ruleECapabilityTypes= ruleECapabilityTypes EOF )
            // InternalRM.g:699:2: iv_ruleECapabilityTypes= ruleECapabilityTypes EOF
            {
             newCompositeNode(grammarAccess.getECapabilityTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityTypes=ruleECapabilityTypes();

            state._fsp--;

             current =iv_ruleECapabilityTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityTypes"


    // $ANTLR start "ruleECapabilityTypes"
    // InternalRM.g:705:1: ruleECapabilityTypes returns [EObject current=null] : ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) ;
    public final EObject ruleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilityTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:711:2: ( ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) )
            // InternalRM.g:712:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            {
            // InternalRM.g:712:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            // InternalRM.g:713:3: () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            {
            // InternalRM.g:713:3: ()
            // InternalRM.g:714:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypesAccess().getECapabilityTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:720:3: ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_QUALIFIED_NAME) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRM.g:721:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    {
            	    // InternalRM.g:721:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    // InternalRM.g:722:5: lv_capabilityTypes_1_0= ruleECapabilityType
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilityTypesAccess().getCapabilityTypesECapabilityTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_capabilityTypes_1_0=ruleECapabilityType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getECapabilityTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"capabilityTypes",
            	    						lv_capabilityTypes_1_0,
            	    						"org.sodalite.dsl.RM.ECapabilityType");
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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityTypes"


    // $ANTLR start "entryRuleECapabilityType"
    // InternalRM.g:743:1: entryRuleECapabilityType returns [EObject current=null] : iv_ruleECapabilityType= ruleECapabilityType EOF ;
    public final EObject entryRuleECapabilityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityType = null;


        try {
            // InternalRM.g:743:56: (iv_ruleECapabilityType= ruleECapabilityType EOF )
            // InternalRM.g:744:2: iv_ruleECapabilityType= ruleECapabilityType EOF
            {
             newCompositeNode(grammarAccess.getECapabilityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityType=ruleECapabilityType();

            state._fsp--;

             current =iv_ruleECapabilityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityType"


    // $ANTLR start "ruleECapabilityType"
    // InternalRM.g:750:1: ruleECapabilityType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleECapabilityType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_properties_7_0 = null;

        EObject lv_atributes_10_0 = null;



        	enterRule();

        try {
            // InternalRM.g:756:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalRM.g:757:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalRM.g:757:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? otherlv_12= '}' )
            // InternalRM.g:758:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalRM.g:758:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:759:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:759:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:760:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getECapabilityTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getECapabilityTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getECapabilityTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:780:3: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRM.g:781:4: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getECapabilityTypeAccess().getDerived_fromKeyword_2_0());
                    			
                    // InternalRM.g:785:4: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    // InternalRM.g:786:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    {
                    // InternalRM.g:786:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    // InternalRM.g:787:6: otherlv_3= RULE_QUALIFIED_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECapabilityTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_28); 

                    						newLeafNode(otherlv_3, grammarAccess.getECapabilityTypeAccess().getSuperTypeECapabilityTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:799:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRM.g:800:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getECapabilityTypeAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRM.g:804:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRM.g:805:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRM.g:805:5: (lv_description_5_0= RULE_STRING )
                    // InternalRM.g:806:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getECapabilityTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECapabilityTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:823:3: (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRM.g:824:4: otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getECapabilityTypeAccess().getPropertiesKeyword_4_0());
                    			
                    // InternalRM.g:828:4: ( (lv_properties_7_0= ruleEProperties ) )
                    // InternalRM.g:829:5: (lv_properties_7_0= ruleEProperties )
                    {
                    // InternalRM.g:829:5: (lv_properties_7_0= ruleEProperties )
                    // InternalRM.g:830:6: lv_properties_7_0= ruleEProperties
                    {

                    						newCompositeNode(grammarAccess.getECapabilityTypeAccess().getPropertiesEPropertiesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_properties_7_0=ruleEProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getECapabilityTypeRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_7_0,
                    							"org.sodalite.dsl.RM.EProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getECapabilityTypeAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:852:3: (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRM.g:853:4: otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getECapabilityTypeAccess().getAttributesKeyword_5_0());
                    			
                    // InternalRM.g:857:4: ( (lv_atributes_10_0= ruleEAttributes ) )
                    // InternalRM.g:858:5: (lv_atributes_10_0= ruleEAttributes )
                    {
                    // InternalRM.g:858:5: (lv_atributes_10_0= ruleEAttributes )
                    // InternalRM.g:859:6: lv_atributes_10_0= ruleEAttributes
                    {

                    						newCompositeNode(grammarAccess.getECapabilityTypeAccess().getAtributesEAttributesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_atributes_10_0=ruleEAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getECapabilityTypeRule());
                    						}
                    						set(
                    							current,
                    							"atributes",
                    							lv_atributes_10_0,
                    							"org.sodalite.dsl.RM.EAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getECapabilityTypeAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getECapabilityTypeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityType"


    // $ANTLR start "entryRuleEInterfaceTypes"
    // InternalRM.g:889:1: entryRuleEInterfaceTypes returns [EObject current=null] : iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF ;
    public final EObject entryRuleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypes = null;


        try {
            // InternalRM.g:889:56: (iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF )
            // InternalRM.g:890:2: iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaceTypes=ruleEInterfaceTypes();

            state._fsp--;

             current =iv_ruleEInterfaceTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaceTypes"


    // $ANTLR start "ruleEInterfaceTypes"
    // InternalRM.g:896:1: ruleEInterfaceTypes returns [EObject current=null] : ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) ;
    public final EObject ruleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaceTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:902:2: ( ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) )
            // InternalRM.g:903:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            {
            // InternalRM.g:903:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            // InternalRM.g:904:3: () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            {
            // InternalRM.g:904:3: ()
            // InternalRM.g:905:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypesAccess().getEInterfaceTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:911:3: ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_QUALIFIED_NAME) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRM.g:912:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    {
            	    // InternalRM.g:912:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    // InternalRM.g:913:5: lv_interfaceTypes_1_0= ruleEInterfaceType
            	    {

            	    					newCompositeNode(grammarAccess.getEInterfaceTypesAccess().getInterfaceTypesEInterfaceTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_interfaceTypes_1_0=ruleEInterfaceType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEInterfaceTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interfaceTypes",
            	    						lv_interfaceTypes_1_0,
            	    						"org.sodalite.dsl.RM.EInterfaceType");
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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInterfaceTypes"


    // $ANTLR start "entryRuleEInterfaceType"
    // InternalRM.g:934:1: entryRuleEInterfaceType returns [EObject current=null] : iv_ruleEInterfaceType= ruleEInterfaceType EOF ;
    public final EObject entryRuleEInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceType = null;


        try {
            // InternalRM.g:934:55: (iv_ruleEInterfaceType= ruleEInterfaceType EOF )
            // InternalRM.g:935:2: iv_ruleEInterfaceType= ruleEInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaceType=ruleEInterfaceType();

            state._fsp--;

             current =iv_ruleEInterfaceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaceType"


    // $ANTLR start "ruleEInterfaceType"
    // InternalRM.g:941:1: ruleEInterfaceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleEInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_inputs_7_0 = null;

        EObject lv_operations_10_0 = null;



        	enterRule();

        try {
            // InternalRM.g:947:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalRM.g:948:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalRM.g:948:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' )? otherlv_12= '}' )
            // InternalRM.g:949:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalRM.g:949:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:950:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:950:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:951:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEInterfaceTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInterfaceTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getEInterfaceTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:971:3: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRM.g:972:4: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getEInterfaceTypeAccess().getDerived_fromKeyword_2_0());
                    			
                    // InternalRM.g:976:4: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    // InternalRM.g:977:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    {
                    // InternalRM.g:977:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    // InternalRM.g:978:6: otherlv_3= RULE_QUALIFIED_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_32); 

                    						newLeafNode(otherlv_3, grammarAccess.getEInterfaceTypeAccess().getSuperTypeEInterfaceTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:990:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRM.g:991:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEInterfaceTypeAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRM.g:995:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRM.g:996:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRM.g:996:5: (lv_description_5_0= RULE_STRING )
                    // InternalRM.g:997:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getEInterfaceTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEInterfaceTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:1014:3: (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRM.g:1015:4: otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getEInterfaceTypeAccess().getInputsKeyword_4_0());
                    			
                    // InternalRM.g:1019:4: ( (lv_inputs_7_0= ruleEProperties ) )
                    // InternalRM.g:1020:5: (lv_inputs_7_0= ruleEProperties )
                    {
                    // InternalRM.g:1020:5: (lv_inputs_7_0= ruleEProperties )
                    // InternalRM.g:1021:6: lv_inputs_7_0= ruleEProperties
                    {

                    						newCompositeNode(grammarAccess.getEInterfaceTypeAccess().getInputsEPropertiesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_inputs_7_0=ruleEProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEInterfaceTypeRule());
                    						}
                    						set(
                    							current,
                    							"inputs",
                    							lv_inputs_7_0,
                    							"org.sodalite.dsl.RM.EProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_8, grammarAccess.getEInterfaceTypeAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:1043:3: (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRM.g:1044:4: otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getEInterfaceTypeAccess().getOperationsKeyword_5_0());
                    			
                    // InternalRM.g:1048:4: ( (lv_operations_10_0= ruleEOperations ) )
                    // InternalRM.g:1049:5: (lv_operations_10_0= ruleEOperations )
                    {
                    // InternalRM.g:1049:5: (lv_operations_10_0= ruleEOperations )
                    // InternalRM.g:1050:6: lv_operations_10_0= ruleEOperations
                    {

                    						newCompositeNode(grammarAccess.getEInterfaceTypeAccess().getOperationsEOperationsParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_operations_10_0=ruleEOperations();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEInterfaceTypeRule());
                    						}
                    						set(
                    							current,
                    							"operations",
                    							lv_operations_10_0,
                    							"org.sodalite.dsl.RM.EOperations");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getEInterfaceTypeAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getEInterfaceTypeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInterfaceType"


    // $ANTLR start "entryRuleEPolicyTypes"
    // InternalRM.g:1080:1: entryRuleEPolicyTypes returns [EObject current=null] : iv_ruleEPolicyTypes= ruleEPolicyTypes EOF ;
    public final EObject entryRuleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypes = null;


        try {
            // InternalRM.g:1080:53: (iv_ruleEPolicyTypes= ruleEPolicyTypes EOF )
            // InternalRM.g:1081:2: iv_ruleEPolicyTypes= ruleEPolicyTypes EOF
            {
             newCompositeNode(grammarAccess.getEPolicyTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPolicyTypes=ruleEPolicyTypes();

            state._fsp--;

             current =iv_ruleEPolicyTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPolicyTypes"


    // $ANTLR start "ruleEPolicyTypes"
    // InternalRM.g:1087:1: ruleEPolicyTypes returns [EObject current=null] : ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) ;
    public final EObject ruleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_policyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1093:2: ( ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) )
            // InternalRM.g:1094:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            {
            // InternalRM.g:1094:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            // InternalRM.g:1095:3: () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            {
            // InternalRM.g:1095:3: ()
            // InternalRM.g:1096:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypesAccess().getEPolicyTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1102:3: ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_QUALIFIED_NAME) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRM.g:1103:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    {
            	    // InternalRM.g:1103:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    // InternalRM.g:1104:5: lv_policyTypes_1_0= ruleEPolicyType
            	    {

            	    					newCompositeNode(grammarAccess.getEPolicyTypesAccess().getPolicyTypesEPolicyTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_policyTypes_1_0=ruleEPolicyType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEPolicyTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"policyTypes",
            	    						lv_policyTypes_1_0,
            	    						"org.sodalite.dsl.RM.EPolicyType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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
    // $ANTLR end "ruleEPolicyTypes"


    // $ANTLR start "entryRuleEPolicyType"
    // InternalRM.g:1125:1: entryRuleEPolicyType returns [EObject current=null] : iv_ruleEPolicyType= ruleEPolicyType EOF ;
    public final EObject entryRuleEPolicyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyType = null;


        try {
            // InternalRM.g:1125:52: (iv_ruleEPolicyType= ruleEPolicyType EOF )
            // InternalRM.g:1126:2: iv_ruleEPolicyType= ruleEPolicyType EOF
            {
             newCompositeNode(grammarAccess.getEPolicyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPolicyType=ruleEPolicyType();

            state._fsp--;

             current =iv_ruleEPolicyType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPolicyType"


    // $ANTLR start "ruleEPolicyType"
    // InternalRM.g:1132:1: ruleEPolicyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleEPolicyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRM.g:1138:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' ) )
            // InternalRM.g:1139:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            {
            // InternalRM.g:1139:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}' )
            // InternalRM.g:1140:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? otherlv_6= '}'
            {
            // InternalRM.g:1140:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1141:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1141:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1142:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEPolicyTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPolicyTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getEPolicyTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:1162:3: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRM.g:1163:4: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getEPolicyTypeAccess().getDerived_fromKeyword_2_0());
                    			
                    // InternalRM.g:1167:4: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    // InternalRM.g:1168:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    {
                    // InternalRM.g:1168:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    // InternalRM.g:1169:6: otherlv_3= RULE_QUALIFIED_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPolicyTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_36); 

                    						newLeafNode(otherlv_3, grammarAccess.getEPolicyTypeAccess().getSuperTypeEPolicyTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:1181:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRM.g:1182:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPolicyTypeAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRM.g:1186:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRM.g:1187:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRM.g:1187:5: (lv_description_5_0= RULE_STRING )
                    // InternalRM.g:1188:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getEPolicyTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPolicyTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEPolicyTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPolicyType"


    // $ANTLR start "entryRuleENodeTypes"
    // InternalRM.g:1213:1: entryRuleENodeTypes returns [EObject current=null] : iv_ruleENodeTypes= ruleENodeTypes EOF ;
    public final EObject entryRuleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypes = null;


        try {
            // InternalRM.g:1213:51: (iv_ruleENodeTypes= ruleENodeTypes EOF )
            // InternalRM.g:1214:2: iv_ruleENodeTypes= ruleENodeTypes EOF
            {
             newCompositeNode(grammarAccess.getENodeTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeTypes=ruleENodeTypes();

            state._fsp--;

             current =iv_ruleENodeTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeTypes"


    // $ANTLR start "ruleENodeTypes"
    // InternalRM.g:1220:1: ruleENodeTypes returns [EObject current=null] : ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) ;
    public final EObject ruleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1226:2: ( ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) )
            // InternalRM.g:1227:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            {
            // InternalRM.g:1227:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            // InternalRM.g:1228:3: () ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            {
            // InternalRM.g:1228:3: ()
            // InternalRM.g:1229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypesAccess().getENodeTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1235:3: ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_QUALIFIED_NAME) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRM.g:1236:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    {
            	    // InternalRM.g:1236:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    // InternalRM.g:1237:5: lv_nodeTypes_1_0= ruleENodeType
            	    {

            	    					newCompositeNode(grammarAccess.getENodeTypesAccess().getNodeTypesENodeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_nodeTypes_1_0=ruleENodeType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getENodeTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodeTypes",
            	    						lv_nodeTypes_1_0,
            	    						"org.sodalite.dsl.RM.ENodeType");
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


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENodeTypes"


    // $ANTLR start "entryRuleENodeType"
    // InternalRM.g:1258:1: entryRuleENodeType returns [EObject current=null] : iv_ruleENodeType= ruleENodeType EOF ;
    public final EObject entryRuleENodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeType = null;


        try {
            // InternalRM.g:1258:50: (iv_ruleENodeType= ruleENodeType EOF )
            // InternalRM.g:1259:2: iv_ruleENodeType= ruleENodeType EOF
            {
             newCompositeNode(grammarAccess.getENodeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeType=ruleENodeType();

            state._fsp--;

             current =iv_ruleENodeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeType"


    // $ANTLR start "ruleENodeType"
    // InternalRM.g:1265:1: ruleENodeType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )? (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' )? (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleENodeType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
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
        EObject lv_properties_7_0 = null;

        EObject lv_atributes_10_0 = null;

        EObject lv_interfaces_13_0 = null;

        EObject lv_capabilities_16_0 = null;

        EObject lv_requirements_19_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1271:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )? (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' )? (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalRM.g:1272:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )? (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' )? (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalRM.g:1272:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )? (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' )? (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' )? otherlv_21= '}' )
            // InternalRM.g:1273:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )? (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' )? (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalRM.g:1273:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1274:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1274:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1275:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getENodeTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getENodeTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getENodeTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:1295:3: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==24) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRM.g:1296:4: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getENodeTypeAccess().getDerived_fromKeyword_2_0());
                    			
                    // InternalRM.g:1300:4: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    // InternalRM.g:1301:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    {
                    // InternalRM.g:1301:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    // InternalRM.g:1302:6: otherlv_3= RULE_QUALIFIED_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getENodeTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_38); 

                    						newLeafNode(otherlv_3, grammarAccess.getENodeTypeAccess().getSuperTypeENodeTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:1314:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==25) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRM.g:1315:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getENodeTypeAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRM.g:1319:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRM.g:1320:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRM.g:1320:5: (lv_description_5_0= RULE_STRING )
                    // InternalRM.g:1321:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getENodeTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getENodeTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:1338:3: (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==27) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRM.g:1339:4: otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getENodeTypeAccess().getPropertiesKeyword_4_0());
                    			
                    // InternalRM.g:1343:4: ( (lv_properties_7_0= ruleEProperties ) )
                    // InternalRM.g:1344:5: (lv_properties_7_0= ruleEProperties )
                    {
                    // InternalRM.g:1344:5: (lv_properties_7_0= ruleEProperties )
                    // InternalRM.g:1345:6: lv_properties_7_0= ruleEProperties
                    {

                    						newCompositeNode(grammarAccess.getENodeTypeAccess().getPropertiesEPropertiesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_properties_7_0=ruleEProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getENodeTypeRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_7_0,
                    							"org.sodalite.dsl.RM.EProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_40); 

                    				newLeafNode(otherlv_8, grammarAccess.getENodeTypeAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:1367:3: (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRM.g:1368:4: otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getENodeTypeAccess().getAttributesKeyword_5_0());
                    			
                    // InternalRM.g:1372:4: ( (lv_atributes_10_0= ruleEAttributes ) )
                    // InternalRM.g:1373:5: (lv_atributes_10_0= ruleEAttributes )
                    {
                    // InternalRM.g:1373:5: (lv_atributes_10_0= ruleEAttributes )
                    // InternalRM.g:1374:6: lv_atributes_10_0= ruleEAttributes
                    {

                    						newCompositeNode(grammarAccess.getENodeTypeAccess().getAtributesEAttributesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_atributes_10_0=ruleEAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getENodeTypeRule());
                    						}
                    						set(
                    							current,
                    							"atributes",
                    							lv_atributes_10_0,
                    							"org.sodalite.dsl.RM.EAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_41); 

                    				newLeafNode(otherlv_11, grammarAccess.getENodeTypeAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:1396:3: (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRM.g:1397:4: otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_12, grammarAccess.getENodeTypeAccess().getInterfacesKeyword_6_0());
                    			
                    // InternalRM.g:1401:4: ( (lv_interfaces_13_0= ruleEInterfaces ) )
                    // InternalRM.g:1402:5: (lv_interfaces_13_0= ruleEInterfaces )
                    {
                    // InternalRM.g:1402:5: (lv_interfaces_13_0= ruleEInterfaces )
                    // InternalRM.g:1403:6: lv_interfaces_13_0= ruleEInterfaces
                    {

                    						newCompositeNode(grammarAccess.getENodeTypeAccess().getInterfacesEInterfacesParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_interfaces_13_0=ruleEInterfaces();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getENodeTypeRule());
                    						}
                    						set(
                    							current,
                    							"interfaces",
                    							lv_interfaces_13_0,
                    							"org.sodalite.dsl.RM.EInterfaces");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,16,FOLLOW_42); 

                    				newLeafNode(otherlv_14, grammarAccess.getENodeTypeAccess().getRightCurlyBracketKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:1425:3: (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRM.g:1426:4: otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}'
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_20); 

                    				newLeafNode(otherlv_15, grammarAccess.getENodeTypeAccess().getCapabilitiesKeyword_7_0());
                    			
                    // InternalRM.g:1430:4: ( (lv_capabilities_16_0= ruleECapabilities ) )
                    // InternalRM.g:1431:5: (lv_capabilities_16_0= ruleECapabilities )
                    {
                    // InternalRM.g:1431:5: (lv_capabilities_16_0= ruleECapabilities )
                    // InternalRM.g:1432:6: lv_capabilities_16_0= ruleECapabilities
                    {

                    						newCompositeNode(grammarAccess.getENodeTypeAccess().getCapabilitiesECapabilitiesParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_capabilities_16_0=ruleECapabilities();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getENodeTypeRule());
                    						}
                    						set(
                    							current,
                    							"capabilities",
                    							lv_capabilities_16_0,
                    							"org.sodalite.dsl.RM.ECapabilities");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,16,FOLLOW_43); 

                    				newLeafNode(otherlv_17, grammarAccess.getENodeTypeAccess().getRightCurlyBracketKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:1454:3: (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==35) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRM.g:1455:4: otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}'
                    {
                    otherlv_18=(Token)match(input,35,FOLLOW_20); 

                    				newLeafNode(otherlv_18, grammarAccess.getENodeTypeAccess().getRequirementsKeyword_8_0());
                    			
                    // InternalRM.g:1459:4: ( (lv_requirements_19_0= ruleERequirements ) )
                    // InternalRM.g:1460:5: (lv_requirements_19_0= ruleERequirements )
                    {
                    // InternalRM.g:1460:5: (lv_requirements_19_0= ruleERequirements )
                    // InternalRM.g:1461:6: lv_requirements_19_0= ruleERequirements
                    {

                    						newCompositeNode(grammarAccess.getENodeTypeAccess().getRequirementsERequirementsParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_requirements_19_0=ruleERequirements();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getENodeTypeRule());
                    						}
                    						set(
                    							current,
                    							"requirements",
                    							lv_requirements_19_0,
                    							"org.sodalite.dsl.RM.ERequirements");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getENodeTypeAccess().getRightCurlyBracketKeyword_8_2());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getENodeTypeAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENodeType"


    // $ANTLR start "entryRuleERelationshipTypes"
    // InternalRM.g:1491:1: entryRuleERelationshipTypes returns [EObject current=null] : iv_ruleERelationshipTypes= ruleERelationshipTypes EOF ;
    public final EObject entryRuleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypes = null;


        try {
            // InternalRM.g:1491:59: (iv_ruleERelationshipTypes= ruleERelationshipTypes EOF )
            // InternalRM.g:1492:2: iv_ruleERelationshipTypes= ruleERelationshipTypes EOF
            {
             newCompositeNode(grammarAccess.getERelationshipTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERelationshipTypes=ruleERelationshipTypes();

            state._fsp--;

             current =iv_ruleERelationshipTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERelationshipTypes"


    // $ANTLR start "ruleERelationshipTypes"
    // InternalRM.g:1498:1: ruleERelationshipTypes returns [EObject current=null] : ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) ;
    public final EObject ruleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_relationshipTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1504:2: ( ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) )
            // InternalRM.g:1505:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            {
            // InternalRM.g:1505:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            // InternalRM.g:1506:3: () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            {
            // InternalRM.g:1506:3: ()
            // InternalRM.g:1507:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypesAccess().getERelationshipTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1513:3: ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_QUALIFIED_NAME) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRM.g:1514:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    {
            	    // InternalRM.g:1514:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    // InternalRM.g:1515:5: lv_relationshipTypes_1_0= ruleERelationshipType
            	    {

            	    					newCompositeNode(grammarAccess.getERelationshipTypesAccess().getRelationshipTypesERelationshipTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_relationshipTypes_1_0=ruleERelationshipType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERelationshipTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relationshipTypes",
            	    						lv_relationshipTypes_1_0,
            	    						"org.sodalite.dsl.RM.ERelationshipType");
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


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERelationshipTypes"


    // $ANTLR start "entryRuleERelationshipType"
    // InternalRM.g:1536:1: entryRuleERelationshipType returns [EObject current=null] : iv_ruleERelationshipType= ruleERelationshipType EOF ;
    public final EObject entryRuleERelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipType = null;


        try {
            // InternalRM.g:1536:58: (iv_ruleERelationshipType= ruleERelationshipType EOF )
            // InternalRM.g:1537:2: iv_ruleERelationshipType= ruleERelationshipType EOF
            {
             newCompositeNode(grammarAccess.getERelationshipTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERelationshipType=ruleERelationshipType();

            state._fsp--;

             current =iv_ruleERelationshipType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERelationshipType"


    // $ANTLR start "ruleERelationshipType"
    // InternalRM.g:1543:1: ruleERelationshipType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )? (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleERelationshipType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_valid_target_types_16_0=null;
        Token otherlv_17=null;
        EObject lv_properties_7_0 = null;

        EObject lv_atributes_10_0 = null;

        EObject lv_interfaces_13_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1549:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )? (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) )? otherlv_17= '}' ) )
            // InternalRM.g:1550:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )? (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) )? otherlv_17= '}' )
            {
            // InternalRM.g:1550:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )? (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) )? otherlv_17= '}' )
            // InternalRM.g:1551:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )? (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )? (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )? (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )? (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) )? otherlv_17= '}'
            {
            // InternalRM.g:1551:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1552:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1552:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1553:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getERelationshipTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERelationshipTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getERelationshipTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:1573:3: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==24) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRM.g:1574:4: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getERelationshipTypeAccess().getDerived_fromKeyword_2_0());
                    			
                    // InternalRM.g:1578:4: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
                    // InternalRM.g:1579:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    {
                    // InternalRM.g:1579:5: (otherlv_3= RULE_QUALIFIED_NAME )
                    // InternalRM.g:1580:6: otherlv_3= RULE_QUALIFIED_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERelationshipTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_45); 

                    						newLeafNode(otherlv_3, grammarAccess.getERelationshipTypeAccess().getSuperTypeERelationshipTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:1592:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==25) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRM.g:1593:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getERelationshipTypeAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRM.g:1597:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRM.g:1598:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRM.g:1598:5: (lv_description_5_0= RULE_STRING )
                    // InternalRM.g:1599:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_46); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getERelationshipTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERelationshipTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:1616:3: (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==27) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRM.g:1617:4: otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getERelationshipTypeAccess().getPropertiesKeyword_4_0());
                    			
                    // InternalRM.g:1621:4: ( (lv_properties_7_0= ruleEProperties ) )
                    // InternalRM.g:1622:5: (lv_properties_7_0= ruleEProperties )
                    {
                    // InternalRM.g:1622:5: (lv_properties_7_0= ruleEProperties )
                    // InternalRM.g:1623:6: lv_properties_7_0= ruleEProperties
                    {

                    						newCompositeNode(grammarAccess.getERelationshipTypeAccess().getPropertiesEPropertiesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_properties_7_0=ruleEProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERelationshipTypeRule());
                    						}
                    						set(
                    							current,
                    							"properties",
                    							lv_properties_7_0,
                    							"org.sodalite.dsl.RM.EProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_47); 

                    				newLeafNode(otherlv_8, grammarAccess.getERelationshipTypeAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:1645:3: (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==30) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRM.g:1646:4: otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getERelationshipTypeAccess().getAttributesKeyword_5_0());
                    			
                    // InternalRM.g:1650:4: ( (lv_atributes_10_0= ruleEAttributes ) )
                    // InternalRM.g:1651:5: (lv_atributes_10_0= ruleEAttributes )
                    {
                    // InternalRM.g:1651:5: (lv_atributes_10_0= ruleEAttributes )
                    // InternalRM.g:1652:6: lv_atributes_10_0= ruleEAttributes
                    {

                    						newCompositeNode(grammarAccess.getERelationshipTypeAccess().getAtributesEAttributesParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_atributes_10_0=ruleEAttributes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERelationshipTypeRule());
                    						}
                    						set(
                    							current,
                    							"atributes",
                    							lv_atributes_10_0,
                    							"org.sodalite.dsl.RM.EAttributes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_48); 

                    				newLeafNode(otherlv_11, grammarAccess.getERelationshipTypeAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:1674:3: (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==33) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRM.g:1675:4: otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_20); 

                    				newLeafNode(otherlv_12, grammarAccess.getERelationshipTypeAccess().getInterfacesKeyword_6_0());
                    			
                    // InternalRM.g:1679:4: ( (lv_interfaces_13_0= ruleEInterfaces ) )
                    // InternalRM.g:1680:5: (lv_interfaces_13_0= ruleEInterfaces )
                    {
                    // InternalRM.g:1680:5: (lv_interfaces_13_0= ruleEInterfaces )
                    // InternalRM.g:1681:6: lv_interfaces_13_0= ruleEInterfaces
                    {

                    						newCompositeNode(grammarAccess.getERelationshipTypeAccess().getInterfacesEInterfacesParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_interfaces_13_0=ruleEInterfaces();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getERelationshipTypeRule());
                    						}
                    						set(
                    							current,
                    							"interfaces",
                    							lv_interfaces_13_0,
                    							"org.sodalite.dsl.RM.EInterfaces");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,16,FOLLOW_49); 

                    				newLeafNode(otherlv_14, grammarAccess.getERelationshipTypeAccess().getRightCurlyBracketKeyword_6_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:1703:3: (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==36) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRM.g:1704:4: otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) )
                    {
                    otherlv_15=(Token)match(input,36,FOLLOW_16); 

                    				newLeafNode(otherlv_15, grammarAccess.getERelationshipTypeAccess().getValid_target_typesKeyword_7_0());
                    			
                    // InternalRM.g:1708:4: ( (lv_valid_target_types_16_0= RULE_STRING ) )
                    // InternalRM.g:1709:5: (lv_valid_target_types_16_0= RULE_STRING )
                    {
                    // InternalRM.g:1709:5: (lv_valid_target_types_16_0= RULE_STRING )
                    // InternalRM.g:1710:6: lv_valid_target_types_16_0= RULE_STRING
                    {
                    lv_valid_target_types_16_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_valid_target_types_16_0, grammarAccess.getERelationshipTypeAccess().getValid_target_typesSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERelationshipTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valid_target_types",
                    							lv_valid_target_types_16_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getERelationshipTypeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERelationshipType"


    // $ANTLR start "entryRuleEProperties"
    // InternalRM.g:1735:1: entryRuleEProperties returns [EObject current=null] : iv_ruleEProperties= ruleEProperties EOF ;
    public final EObject entryRuleEProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProperties = null;


        try {
            // InternalRM.g:1735:52: (iv_ruleEProperties= ruleEProperties EOF )
            // InternalRM.g:1736:2: iv_ruleEProperties= ruleEProperties EOF
            {
             newCompositeNode(grammarAccess.getEPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEProperties=ruleEProperties();

            state._fsp--;

             current =iv_ruleEProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEProperties"


    // $ANTLR start "ruleEProperties"
    // InternalRM.g:1742:1: ruleEProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) ;
    public final EObject ruleEProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1748:2: ( ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) )
            // InternalRM.g:1749:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            {
            // InternalRM.g:1749:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            // InternalRM.g:1750:3: () ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            {
            // InternalRM.g:1750:3: ()
            // InternalRM.g:1751:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPropertiesAccess().getEPropertiesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1757:3: ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalRM.g:1758:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    {
            	    // InternalRM.g:1758:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    // InternalRM.g:1759:5: lv_properties_1_0= ruleEPropertyDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEPropertiesAccess().getPropertiesEPropertyDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_properties_1_0=ruleEPropertyDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_1_0,
            	    						"org.sodalite.dsl.RM.EPropertyDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // $ANTLR end "ruleEProperties"


    // $ANTLR start "entryRuleEPropertyDefinition"
    // InternalRM.g:1780:1: entryRuleEPropertyDefinition returns [EObject current=null] : iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF ;
    public final EObject entryRuleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinition = null;


        try {
            // InternalRM.g:1780:60: (iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF )
            // InternalRM.g:1781:2: iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getEPropertyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPropertyDefinition=ruleEPropertyDefinition();

            state._fsp--;

             current =iv_ruleEPropertyDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPropertyDefinition"


    // $ANTLR start "ruleEPropertyDefinition"
    // InternalRM.g:1787:1: ruleEPropertyDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'required:' ( (lv_required_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'default:' ( (lv_default_9_0= ruleEValueExpression ) ) )? (otherlv_10= 'status:' ( (lv_status_11_0= RULE_STRING ) ) )? (otherlv_12= 'constraints{' ( (lv_constraints_13_0= ruleEConstraints ) ) otherlv_14= '}' )? (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_required_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_status_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_default_9_0 = null;

        EObject lv_constraints_13_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1793:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'required:' ( (lv_required_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'default:' ( (lv_default_9_0= ruleEValueExpression ) ) )? (otherlv_10= 'status:' ( (lv_status_11_0= RULE_STRING ) ) )? (otherlv_12= 'constraints{' ( (lv_constraints_13_0= ruleEConstraints ) ) otherlv_14= '}' )? (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) )? otherlv_17= '}' ) )
            // InternalRM.g:1794:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'required:' ( (lv_required_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'default:' ( (lv_default_9_0= ruleEValueExpression ) ) )? (otherlv_10= 'status:' ( (lv_status_11_0= RULE_STRING ) ) )? (otherlv_12= 'constraints{' ( (lv_constraints_13_0= ruleEConstraints ) ) otherlv_14= '}' )? (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) )? otherlv_17= '}' )
            {
            // InternalRM.g:1794:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'required:' ( (lv_required_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'default:' ( (lv_default_9_0= ruleEValueExpression ) ) )? (otherlv_10= 'status:' ( (lv_status_11_0= RULE_STRING ) ) )? (otherlv_12= 'constraints{' ( (lv_constraints_13_0= ruleEConstraints ) ) otherlv_14= '}' )? (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) )? otherlv_17= '}' )
            // InternalRM.g:1795:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'required:' ( (lv_required_7_0= RULE_BOOLEAN ) ) )? (otherlv_8= 'default:' ( (lv_default_9_0= ruleEValueExpression ) ) )? (otherlv_10= 'status:' ( (lv_status_11_0= RULE_STRING ) ) )? (otherlv_12= 'constraints{' ( (lv_constraints_13_0= ruleEConstraints ) ) otherlv_14= '}' )? (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) )? otherlv_17= '}'
            {
            // InternalRM.g:1795:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:1796:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:1796:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:1797:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEPropertyDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPropertyDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getEPropertyDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:1817:3: (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) )
            // InternalRM.g:1818:4: otherlv_2= 'type:' ( ( ruleEDataTypeName ) )
            {
            otherlv_2=(Token)match(input,37,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getEPropertyDefinitionAccess().getTypeKeyword_2_0());
            			
            // InternalRM.g:1822:4: ( ( ruleEDataTypeName ) )
            // InternalRM.g:1823:5: ( ruleEDataTypeName )
            {
            // InternalRM.g:1823:5: ( ruleEDataTypeName )
            // InternalRM.g:1824:6: ruleEDataTypeName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEPropertyDefinitionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getEPropertyDefinitionAccess().getTypeEDataTypeCrossReference_2_1_0());
            					
            pushFollow(FOLLOW_52);
            ruleEDataTypeName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalRM.g:1839:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==25) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRM.g:1840:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEPropertyDefinitionAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRM.g:1844:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRM.g:1845:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRM.g:1845:5: (lv_description_5_0= RULE_STRING )
                    // InternalRM.g:1846:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_53); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getEPropertyDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPropertyDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:1863:3: (otherlv_6= 'required:' ( (lv_required_7_0= RULE_BOOLEAN ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==38) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRM.g:1864:4: otherlv_6= 'required:' ( (lv_required_7_0= RULE_BOOLEAN ) )
                    {
                    otherlv_6=(Token)match(input,38,FOLLOW_54); 

                    				newLeafNode(otherlv_6, grammarAccess.getEPropertyDefinitionAccess().getRequiredKeyword_4_0());
                    			
                    // InternalRM.g:1868:4: ( (lv_required_7_0= RULE_BOOLEAN ) )
                    // InternalRM.g:1869:5: (lv_required_7_0= RULE_BOOLEAN )
                    {
                    // InternalRM.g:1869:5: (lv_required_7_0= RULE_BOOLEAN )
                    // InternalRM.g:1870:6: lv_required_7_0= RULE_BOOLEAN
                    {
                    lv_required_7_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_55); 

                    						newLeafNode(lv_required_7_0, grammarAccess.getEPropertyDefinitionAccess().getRequiredBOOLEANTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPropertyDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"required",
                    							lv_required_7_0,
                    							"org.sodalite.dsl.RM.BOOLEAN");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:1887:3: (otherlv_8= 'default:' ( (lv_default_9_0= ruleEValueExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRM.g:1888:4: otherlv_8= 'default:' ( (lv_default_9_0= ruleEValueExpression ) )
                    {
                    otherlv_8=(Token)match(input,39,FOLLOW_56); 

                    				newLeafNode(otherlv_8, grammarAccess.getEPropertyDefinitionAccess().getDefaultKeyword_5_0());
                    			
                    // InternalRM.g:1892:4: ( (lv_default_9_0= ruleEValueExpression ) )
                    // InternalRM.g:1893:5: (lv_default_9_0= ruleEValueExpression )
                    {
                    // InternalRM.g:1893:5: (lv_default_9_0= ruleEValueExpression )
                    // InternalRM.g:1894:6: lv_default_9_0= ruleEValueExpression
                    {

                    						newCompositeNode(grammarAccess.getEPropertyDefinitionAccess().getDefaultEValueExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_default_9_0=ruleEValueExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPropertyDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_9_0,
                    							"org.sodalite.dsl.RM.EValueExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:1912:3: (otherlv_10= 'status:' ( (lv_status_11_0= RULE_STRING ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==40) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRM.g:1913:4: otherlv_10= 'status:' ( (lv_status_11_0= RULE_STRING ) )
                    {
                    otherlv_10=(Token)match(input,40,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getEPropertyDefinitionAccess().getStatusKeyword_6_0());
                    			
                    // InternalRM.g:1917:4: ( (lv_status_11_0= RULE_STRING ) )
                    // InternalRM.g:1918:5: (lv_status_11_0= RULE_STRING )
                    {
                    // InternalRM.g:1918:5: (lv_status_11_0= RULE_STRING )
                    // InternalRM.g:1919:6: lv_status_11_0= RULE_STRING
                    {
                    lv_status_11_0=(Token)match(input,RULE_STRING,FOLLOW_58); 

                    						newLeafNode(lv_status_11_0, grammarAccess.getEPropertyDefinitionAccess().getStatusSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPropertyDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"status",
                    							lv_status_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:1936:3: (otherlv_12= 'constraints{' ( (lv_constraints_13_0= ruleEConstraints ) ) otherlv_14= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==26) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRM.g:1937:4: otherlv_12= 'constraints{' ( (lv_constraints_13_0= ruleEConstraints ) ) otherlv_14= '}'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_12, grammarAccess.getEPropertyDefinitionAccess().getConstraintsKeyword_7_0());
                    			
                    // InternalRM.g:1941:4: ( (lv_constraints_13_0= ruleEConstraints ) )
                    // InternalRM.g:1942:5: (lv_constraints_13_0= ruleEConstraints )
                    {
                    // InternalRM.g:1942:5: (lv_constraints_13_0= ruleEConstraints )
                    // InternalRM.g:1943:6: lv_constraints_13_0= ruleEConstraints
                    {

                    						newCompositeNode(grammarAccess.getEPropertyDefinitionAccess().getConstraintsEConstraintsParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_constraints_13_0=ruleEConstraints();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEPropertyDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"constraints",
                    							lv_constraints_13_0,
                    							"org.sodalite.dsl.RM.EConstraints");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,16,FOLLOW_59); 

                    				newLeafNode(otherlv_14, grammarAccess.getEPropertyDefinitionAccess().getRightCurlyBracketKeyword_7_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:1965:3: (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==41) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRM.g:1966:4: otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) )
                    {
                    otherlv_15=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getEPropertyDefinitionAccess().getEntry_schemaKeyword_8_0());
                    			
                    // InternalRM.g:1970:4: ( ( ruleEDataTypeName ) )
                    // InternalRM.g:1971:5: ( ruleEDataTypeName )
                    {
                    // InternalRM.g:1971:5: ( ruleEDataTypeName )
                    // InternalRM.g:1972:6: ruleEDataTypeName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPropertyDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEPropertyDefinitionAccess().getEntry_schemaEDataTypeCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleEDataTypeName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getEPropertyDefinitionAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPropertyDefinition"


    // $ANTLR start "entryRuleEAttributes"
    // InternalRM.g:1995:1: entryRuleEAttributes returns [EObject current=null] : iv_ruleEAttributes= ruleEAttributes EOF ;
    public final EObject entryRuleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributes = null;


        try {
            // InternalRM.g:1995:52: (iv_ruleEAttributes= ruleEAttributes EOF )
            // InternalRM.g:1996:2: iv_ruleEAttributes= ruleEAttributes EOF
            {
             newCompositeNode(grammarAccess.getEAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttributes=ruleEAttributes();

            state._fsp--;

             current =iv_ruleEAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAttributes"


    // $ANTLR start "ruleEAttributes"
    // InternalRM.g:2002:1: ruleEAttributes returns [EObject current=null] : ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) ;
    public final EObject ruleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2008:2: ( ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) )
            // InternalRM.g:2009:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            {
            // InternalRM.g:2009:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            // InternalRM.g:2010:3: () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            {
            // InternalRM.g:2010:3: ()
            // InternalRM.g:2011:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributesAccess().getEAttributesAction_0(),
            					current);
            			

            }

            // InternalRM.g:2017:3: ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==RULE_ID) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalRM.g:2018:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    {
            	    // InternalRM.g:2018:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    // InternalRM.g:2019:5: lv_attributes_1_0= ruleEAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEAttributesAccess().getAttributesEAttributeDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_attributes_1_0=ruleEAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEAttributesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_1_0,
            	    						"org.sodalite.dsl.RM.EAttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleEAttributes"


    // $ANTLR start "entryRuleEAttributeDefinition"
    // InternalRM.g:2040:1: entryRuleEAttributeDefinition returns [EObject current=null] : iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF ;
    public final EObject entryRuleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinition = null;


        try {
            // InternalRM.g:2040:61: (iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF )
            // InternalRM.g:2041:2: iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF
            {
             newCompositeNode(grammarAccess.getEAttributeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttributeDefinition=ruleEAttributeDefinition();

            state._fsp--;

             current =iv_ruleEAttributeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAttributeDefinition"


    // $ANTLR start "ruleEAttributeDefinition"
    // InternalRM.g:2047:1: ruleEAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'entry_schema:' ( ( ruleEDataTypeName ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalRM.g:2053:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'entry_schema:' ( ( ruleEDataTypeName ) ) )? otherlv_8= '}' ) )
            // InternalRM.g:2054:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'entry_schema:' ( ( ruleEDataTypeName ) ) )? otherlv_8= '}' )
            {
            // InternalRM.g:2054:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'entry_schema:' ( ( ruleEDataTypeName ) ) )? otherlv_8= '}' )
            // InternalRM.g:2055:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'entry_schema:' ( ( ruleEDataTypeName ) ) )? otherlv_8= '}'
            {
            // InternalRM.g:2055:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:2056:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:2056:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:2057:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEAttributeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getEAttributeDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:2077:3: (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) )
            // InternalRM.g:2078:4: otherlv_2= 'type:' ( ( ruleEDataTypeName ) )
            {
            otherlv_2=(Token)match(input,37,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getEAttributeDefinitionAccess().getTypeKeyword_2_0());
            			
            // InternalRM.g:2082:4: ( ( ruleEDataTypeName ) )
            // InternalRM.g:2083:5: ( ruleEDataTypeName )
            {
            // InternalRM.g:2083:5: ( ruleEDataTypeName )
            // InternalRM.g:2084:6: ruleEDataTypeName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEAttributeDefinitionRule());
            						}
            					

            						newCompositeNode(grammarAccess.getEAttributeDefinitionAccess().getTypeEDataTypeCrossReference_2_1_0());
            					
            pushFollow(FOLLOW_60);
            ruleEDataTypeName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalRM.g:2099:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==25) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRM.g:2100:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getEAttributeDefinitionAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRM.g:2104:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRM.g:2105:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRM.g:2105:5: (lv_description_5_0= RULE_STRING )
                    // InternalRM.g:2106:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getEAttributeDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:2123:3: (otherlv_6= 'entry_schema:' ( ( ruleEDataTypeName ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==41) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRM.g:2124:4: otherlv_6= 'entry_schema:' ( ( ruleEDataTypeName ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getEAttributeDefinitionAccess().getEntry_schemaKeyword_4_0());
                    			
                    // InternalRM.g:2128:4: ( ( ruleEDataTypeName ) )
                    // InternalRM.g:2129:5: ( ruleEDataTypeName )
                    {
                    // InternalRM.g:2129:5: ( ruleEDataTypeName )
                    // InternalRM.g:2130:6: ruleEDataTypeName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEAttributeDefinitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEAttributeDefinitionAccess().getEntry_schemaEDataTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleEDataTypeName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEAttributeDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAttributeDefinition"


    // $ANTLR start "entryRuleEInterfaces"
    // InternalRM.g:2153:1: entryRuleEInterfaces returns [EObject current=null] : iv_ruleEInterfaces= ruleEInterfaces EOF ;
    public final EObject entryRuleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaces = null;


        try {
            // InternalRM.g:2153:52: (iv_ruleEInterfaces= ruleEInterfaces EOF )
            // InternalRM.g:2154:2: iv_ruleEInterfaces= ruleEInterfaces EOF
            {
             newCompositeNode(grammarAccess.getEInterfacesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaces=ruleEInterfaces();

            state._fsp--;

             current =iv_ruleEInterfaces; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaces"


    // $ANTLR start "ruleEInterfaces"
    // InternalRM.g:2160:1: ruleEInterfaces returns [EObject current=null] : ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) ;
    public final EObject ruleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaces_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2166:2: ( ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) )
            // InternalRM.g:2167:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            {
            // InternalRM.g:2167:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            // InternalRM.g:2168:3: () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            {
            // InternalRM.g:2168:3: ()
            // InternalRM.g:2169:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfacesAccess().getEInterfacesAction_0(),
            					current);
            			

            }

            // InternalRM.g:2175:3: ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalRM.g:2176:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    {
            	    // InternalRM.g:2176:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    // InternalRM.g:2177:5: lv_interfaces_1_0= ruleEInterfaceDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInterfacesAccess().getInterfacesEInterfaceDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_interfaces_1_0=ruleEInterfaceDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEInterfacesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interfaces",
            	    						lv_interfaces_1_0,
            	    						"org.sodalite.dsl.RM.EInterfaceDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // $ANTLR end "ruleEInterfaces"


    // $ANTLR start "entryRuleEInterfaceDefinition"
    // InternalRM.g:2198:1: entryRuleEInterfaceDefinition returns [EObject current=null] : iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF ;
    public final EObject entryRuleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinition = null;


        try {
            // InternalRM.g:2198:61: (iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF )
            // InternalRM.g:2199:2: iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaceDefinition=ruleEInterfaceDefinition();

            state._fsp--;

             current =iv_ruleEInterfaceDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaceDefinition"


    // $ANTLR start "ruleEInterfaceDefinition"
    // InternalRM.g:2205:1: ruleEInterfaceDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEProperties ) ) otherlv_6= '}' )? (otherlv_7= 'operations{' ( (lv_operations_8_0= ruleEOperations ) ) otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_inputs_5_0 = null;

        EObject lv_operations_8_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2211:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEProperties ) ) otherlv_6= '}' )? (otherlv_7= 'operations{' ( (lv_operations_8_0= ruleEOperations ) ) otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRM.g:2212:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEProperties ) ) otherlv_6= '}' )? (otherlv_7= 'operations{' ( (lv_operations_8_0= ruleEOperations ) ) otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRM.g:2212:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEProperties ) ) otherlv_6= '}' )? (otherlv_7= 'operations{' ( (lv_operations_8_0= ruleEOperations ) ) otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRM.g:2213:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEProperties ) ) otherlv_6= '}' )? (otherlv_7= 'operations{' ( (lv_operations_8_0= ruleEOperations ) ) otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalRM.g:2213:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:2214:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:2214:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:2215:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEInterfaceDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInterfaceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getEInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEInterfaceDefinitionAccess().getTypeKeyword_2());
            		
            // InternalRM.g:2239:3: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:2240:4: (otherlv_3= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:2240:4: (otherlv_3= RULE_QUALIFIED_NAME )
            // InternalRM.g:2241:5: otherlv_3= RULE_QUALIFIED_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInterfaceDefinitionRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_33); 

            					newLeafNode(otherlv_3, grammarAccess.getEInterfaceDefinitionAccess().getTypeEInterfaceTypeCrossReference_3_0());
            				

            }


            }

            // InternalRM.g:2252:3: (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEProperties ) ) otherlv_6= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==31) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRM.g:2253:4: otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEProperties ) ) otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEInterfaceDefinitionAccess().getInputsKeyword_4_0());
                    			
                    // InternalRM.g:2257:4: ( (lv_inputs_5_0= ruleEProperties ) )
                    // InternalRM.g:2258:5: (lv_inputs_5_0= ruleEProperties )
                    {
                    // InternalRM.g:2258:5: (lv_inputs_5_0= ruleEProperties )
                    // InternalRM.g:2259:6: lv_inputs_5_0= ruleEProperties
                    {

                    						newCompositeNode(grammarAccess.getEInterfaceDefinitionAccess().getInputsEPropertiesParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_inputs_5_0=ruleEProperties();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"inputs",
                    							lv_inputs_5_0,
                    							"org.sodalite.dsl.RM.EProperties");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getEInterfaceDefinitionAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:2281:3: (otherlv_7= 'operations{' ( (lv_operations_8_0= ruleEOperations ) ) otherlv_9= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==32) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRM.g:2282:4: otherlv_7= 'operations{' ( (lv_operations_8_0= ruleEOperations ) ) otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getEInterfaceDefinitionAccess().getOperationsKeyword_5_0());
                    			
                    // InternalRM.g:2286:4: ( (lv_operations_8_0= ruleEOperations ) )
                    // InternalRM.g:2287:5: (lv_operations_8_0= ruleEOperations )
                    {
                    // InternalRM.g:2287:5: (lv_operations_8_0= ruleEOperations )
                    // InternalRM.g:2288:6: lv_operations_8_0= ruleEOperations
                    {

                    						newCompositeNode(grammarAccess.getEInterfaceDefinitionAccess().getOperationsEOperationsParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_operations_8_0=ruleEOperations();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"operations",
                    							lv_operations_8_0,
                    							"org.sodalite.dsl.RM.EOperations");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEInterfaceDefinitionAccess().getRightCurlyBracketKeyword_5_2());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEInterfaceDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInterfaceDefinition"


    // $ANTLR start "entryRuleEOperations"
    // InternalRM.g:2318:1: entryRuleEOperations returns [EObject current=null] : iv_ruleEOperations= ruleEOperations EOF ;
    public final EObject entryRuleEOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperations = null;


        try {
            // InternalRM.g:2318:52: (iv_ruleEOperations= ruleEOperations EOF )
            // InternalRM.g:2319:2: iv_ruleEOperations= ruleEOperations EOF
            {
             newCompositeNode(grammarAccess.getEOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperations=ruleEOperations();

            state._fsp--;

             current =iv_ruleEOperations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOperations"


    // $ANTLR start "ruleEOperations"
    // InternalRM.g:2325:1: ruleEOperations returns [EObject current=null] : ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) ;
    public final EObject ruleEOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2331:2: ( ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) )
            // InternalRM.g:2332:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            {
            // InternalRM.g:2332:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            // InternalRM.g:2333:3: () ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            {
            // InternalRM.g:2333:3: ()
            // InternalRM.g:2334:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationsAccess().getEOperationsAction_0(),
            					current);
            			

            }

            // InternalRM.g:2340:3: ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_ID) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalRM.g:2341:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    {
            	    // InternalRM.g:2341:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    // InternalRM.g:2342:5: lv_operations_1_0= ruleEOperationDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEOperationsAccess().getOperationsEOperationDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_operations_1_0=ruleEOperationDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEOperationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_1_0,
            	    						"org.sodalite.dsl.RM.EOperationDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // $ANTLR end "ruleEOperations"


    // $ANTLR start "entryRuleEOperationDefinition"
    // InternalRM.g:2363:1: entryRuleEOperationDefinition returns [EObject current=null] : iv_ruleEOperationDefinition= ruleEOperationDefinition EOF ;
    public final EObject entryRuleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinition = null;


        try {
            // InternalRM.g:2363:61: (iv_ruleEOperationDefinition= ruleEOperationDefinition EOF )
            // InternalRM.g:2364:2: iv_ruleEOperationDefinition= ruleEOperationDefinition EOF
            {
             newCompositeNode(grammarAccess.getEOperationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperationDefinition=ruleEOperationDefinition();

            state._fsp--;

             current =iv_ruleEOperationDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOperationDefinition"


    // $ANTLR start "ruleEOperationDefinition"
    // InternalRM.g:2370:1: ruleEOperationDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' )? (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_implementation_8_0=null;
        Token otherlv_9=null;
        EObject lv_inputs_5_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2376:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' )? (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= '}' ) )
            // InternalRM.g:2377:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' )? (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            {
            // InternalRM.g:2377:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' )? (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= '}' )
            // InternalRM.g:2378:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) )? (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' )? (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) )? otherlv_9= '}'
            {
            // InternalRM.g:2378:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:2379:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:2379:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:2380:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEOperationDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEOperationDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:2400:3: (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==25) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRM.g:2401:4: otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getEOperationDefinitionAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalRM.g:2405:4: ( (lv_description_3_0= RULE_STRING ) )
                    // InternalRM.g:2406:5: (lv_description_3_0= RULE_STRING )
                    {
                    // InternalRM.g:2406:5: (lv_description_3_0= RULE_STRING )
                    // InternalRM.g:2407:6: lv_description_3_0= RULE_STRING
                    {
                    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_62); 

                    						newLeafNode(lv_description_3_0, grammarAccess.getEOperationDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:2424:3: (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==31) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRM.g:2425:4: otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getEOperationDefinitionAccess().getInputsKeyword_3_0());
                    			
                    // InternalRM.g:2429:4: ( (lv_inputs_5_0= ruleEInputs ) )
                    // InternalRM.g:2430:5: (lv_inputs_5_0= ruleEInputs )
                    {
                    // InternalRM.g:2430:5: (lv_inputs_5_0= ruleEInputs )
                    // InternalRM.g:2431:6: lv_inputs_5_0= ruleEInputs
                    {

                    						newCompositeNode(grammarAccess.getEOperationDefinitionAccess().getInputsEInputsParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_inputs_5_0=ruleEInputs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEOperationDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"inputs",
                    							lv_inputs_5_0,
                    							"org.sodalite.dsl.RM.EInputs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_63); 

                    				newLeafNode(otherlv_6, grammarAccess.getEOperationDefinitionAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalRM.g:2453:3: (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==42) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalRM.g:2454:4: otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getEOperationDefinitionAccess().getImplementationKeyword_4_0());
                    			
                    // InternalRM.g:2458:4: ( (lv_implementation_8_0= RULE_STRING ) )
                    // InternalRM.g:2459:5: (lv_implementation_8_0= RULE_STRING )
                    {
                    // InternalRM.g:2459:5: (lv_implementation_8_0= RULE_STRING )
                    // InternalRM.g:2460:6: lv_implementation_8_0= RULE_STRING
                    {
                    lv_implementation_8_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_implementation_8_0, grammarAccess.getEOperationDefinitionAccess().getImplementationSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEOperationDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"implementation",
                    							lv_implementation_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEOperationDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOperationDefinition"


    // $ANTLR start "entryRuleEInputs"
    // InternalRM.g:2485:1: entryRuleEInputs returns [EObject current=null] : iv_ruleEInputs= ruleEInputs EOF ;
    public final EObject entryRuleEInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputs = null;


        try {
            // InternalRM.g:2485:48: (iv_ruleEInputs= ruleEInputs EOF )
            // InternalRM.g:2486:2: iv_ruleEInputs= ruleEInputs EOF
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
    // InternalRM.g:2492:1: ruleEInputs returns [EObject current=null] : ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) ;
    public final EObject ruleEInputs() throws RecognitionException {
        EObject current = null;

        EObject lv_inputs_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2498:2: ( ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) )
            // InternalRM.g:2499:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            {
            // InternalRM.g:2499:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            // InternalRM.g:2500:3: () ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            {
            // InternalRM.g:2500:3: ()
            // InternalRM.g:2501:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInputsAccess().getEInputsAction_0(),
            					current);
            			

            }

            // InternalRM.g:2507:3: ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ID) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalRM.g:2508:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    {
            	    // InternalRM.g:2508:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    // InternalRM.g:2509:5: lv_inputs_1_0= ruleEParameterDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInputsAccess().getInputsEParameterDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_inputs_1_0=ruleEParameterDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEInputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputs",
            	    						lv_inputs_1_0,
            	    						"org.sodalite.dsl.RM.EParameterDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
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
    // InternalRM.g:2530:1: entryRuleEParameterDefinition returns [EObject current=null] : iv_ruleEParameterDefinition= ruleEParameterDefinition EOF ;
    public final EObject entryRuleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinition = null;


        try {
            // InternalRM.g:2530:61: (iv_ruleEParameterDefinition= ruleEParameterDefinition EOF )
            // InternalRM.g:2531:2: iv_ruleEParameterDefinition= ruleEParameterDefinition EOF
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
    // InternalRM.g:2537:1: ruleEParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) )? (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_3_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2543:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) )? (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) )? otherlv_6= '}' ) )
            // InternalRM.g:2544:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) )? (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) )? otherlv_6= '}' )
            {
            // InternalRM.g:2544:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) )? (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) )? otherlv_6= '}' )
            // InternalRM.g:2545:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) )? (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) )? otherlv_6= '}'
            {
            // InternalRM.g:2545:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:2546:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:2546:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:2547:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEParameterDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEParameterDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:2567:3: (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==43) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalRM.g:2568:4: otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) )
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_56); 

                    				newLeafNode(otherlv_2, grammarAccess.getEParameterDefinitionAccess().getValueKeyword_2_0());
                    			
                    // InternalRM.g:2572:4: ( (lv_value_3_0= ruleEValueExpression ) )
                    // InternalRM.g:2573:5: (lv_value_3_0= ruleEValueExpression )
                    {
                    // InternalRM.g:2573:5: (lv_value_3_0= ruleEValueExpression )
                    // InternalRM.g:2574:6: lv_value_3_0= ruleEValueExpression
                    {

                    						newCompositeNode(grammarAccess.getEParameterDefinitionAccess().getValueEValueExpressionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_65);
                    lv_value_3_0=ruleEValueExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.sodalite.dsl.RM.EValueExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:2592:3: (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==39) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalRM.g:2593:4: otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getEParameterDefinitionAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRM.g:2597:4: ( (lv_default_5_0= ruleEValueExpression ) )
                    // InternalRM.g:2598:5: (lv_default_5_0= ruleEValueExpression )
                    {
                    // InternalRM.g:2598:5: (lv_default_5_0= ruleEValueExpression )
                    // InternalRM.g:2599:6: lv_default_5_0= ruleEValueExpression
                    {

                    						newCompositeNode(grammarAccess.getEParameterDefinitionAccess().getDefaultEValueExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_default_5_0=ruleEValueExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEParameterDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"org.sodalite.dsl.RM.EValueExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEParameterDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEValueExpression"
    // InternalRM.g:2625:1: entryRuleEValueExpression returns [EObject current=null] : iv_ruleEValueExpression= ruleEValueExpression EOF ;
    public final EObject entryRuleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueExpression = null;


        try {
            // InternalRM.g:2625:57: (iv_ruleEValueExpression= ruleEValueExpression EOF )
            // InternalRM.g:2626:2: iv_ruleEValueExpression= ruleEValueExpression EOF
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
    // InternalRM.g:2632:1: ruleEValueExpression returns [EObject current=null] : ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction ) ;
    public final EObject ruleEValueExpression() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        EObject this_EFunction_2 = null;



        	enterRule();

        try {
            // InternalRM.g:2638:2: ( ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction ) )
            // InternalRM.g:2639:2: ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction )
            {
            // InternalRM.g:2639:2: ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_STRING) ) {
                alt68=1;
            }
            else if ( (LA68_0==44||LA68_0==48) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalRM.g:2640:3: ( () this_STRING_1= RULE_STRING )
                    {
                    // InternalRM.g:2640:3: ( () this_STRING_1= RULE_STRING )
                    // InternalRM.g:2641:4: () this_STRING_1= RULE_STRING
                    {
                    // InternalRM.g:2641:4: ()
                    // InternalRM.g:2642:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEValueExpressionAccess().getEValueExpressionAction_0_0(),
                    						current);
                    				

                    }

                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_1, grammarAccess.getEValueExpressionAccess().getSTRINGTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRM.g:2654:3: this_EFunction_2= ruleEFunction
                    {

                    			newCompositeNode(grammarAccess.getEValueExpressionAccess().getEFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFunction_2=ruleEFunction();

                    state._fsp--;


                    			current = this_EFunction_2;
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
    // InternalRM.g:2666:1: entryRuleEFunction returns [EObject current=null] : iv_ruleEFunction= ruleEFunction EOF ;
    public final EObject entryRuleEFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunction = null;


        try {
            // InternalRM.g:2666:50: (iv_ruleEFunction= ruleEFunction EOF )
            // InternalRM.g:2667:2: iv_ruleEFunction= ruleEFunction EOF
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
    // InternalRM.g:2673:1: ruleEFunction returns [EObject current=null] : (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute ) ;
    public final EObject ruleEFunction() throws RecognitionException {
        EObject current = null;

        EObject this_GetProperty_0 = null;

        EObject this_GetAttribute_1 = null;



        	enterRule();

        try {
            // InternalRM.g:2679:2: ( (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute ) )
            // InternalRM.g:2680:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute )
            {
            // InternalRM.g:2680:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==48) ) {
                alt69=1;
            }
            else if ( (LA69_0==44) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalRM.g:2681:3: this_GetProperty_0= ruleGetProperty
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
                    // InternalRM.g:2690:3: this_GetAttribute_1= ruleGetAttribute
                    {

                    			newCompositeNode(grammarAccess.getEFunctionAccess().getGetAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetAttribute_1=ruleGetAttribute();

                    state._fsp--;


                    			current = this_GetAttribute_1;
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
    // InternalRM.g:2702:1: entryRuleGetAttribute returns [EObject current=null] : iv_ruleGetAttribute= ruleGetAttribute EOF ;
    public final EObject entryRuleGetAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttribute = null;


        try {
            // InternalRM.g:2702:53: (iv_ruleGetAttribute= ruleGetAttribute EOF )
            // InternalRM.g:2703:2: iv_ruleGetAttribute= ruleGetAttribute EOF
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
    // InternalRM.g:2709:1: ruleGetAttribute returns [EObject current=null] : (otherlv_0= 'get_attribute{' (otherlv_1= 'attribute:' ( (lv_attribute_2_0= RULE_STRING ) ) ) (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleGetAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attribute_2_0=null;
        Token otherlv_3=null;
        Token lv_entity_4_0=null;
        Token otherlv_5=null;
        Token lv_req_cap_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRM.g:2715:2: ( (otherlv_0= 'get_attribute{' (otherlv_1= 'attribute:' ( (lv_attribute_2_0= RULE_STRING ) ) ) (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // InternalRM.g:2716:2: (otherlv_0= 'get_attribute{' (otherlv_1= 'attribute:' ( (lv_attribute_2_0= RULE_STRING ) ) ) (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // InternalRM.g:2716:2: (otherlv_0= 'get_attribute{' (otherlv_1= 'attribute:' ( (lv_attribute_2_0= RULE_STRING ) ) ) (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // InternalRM.g:2717:3: otherlv_0= 'get_attribute{' (otherlv_1= 'attribute:' ( (lv_attribute_2_0= RULE_STRING ) ) ) (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_66); 

            			newLeafNode(otherlv_0, grammarAccess.getGetAttributeAccess().getGet_attributeKeyword_0());
            		
            // InternalRM.g:2721:3: (otherlv_1= 'attribute:' ( (lv_attribute_2_0= RULE_STRING ) ) )
            // InternalRM.g:2722:4: otherlv_1= 'attribute:' ( (lv_attribute_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,45,FOLLOW_16); 

            				newLeafNode(otherlv_1, grammarAccess.getGetAttributeAccess().getAttributeKeyword_1_0());
            			
            // InternalRM.g:2726:4: ( (lv_attribute_2_0= RULE_STRING ) )
            // InternalRM.g:2727:5: (lv_attribute_2_0= RULE_STRING )
            {
            // InternalRM.g:2727:5: (lv_attribute_2_0= RULE_STRING )
            // InternalRM.g:2728:6: lv_attribute_2_0= RULE_STRING
            {
            lv_attribute_2_0=(Token)match(input,RULE_STRING,FOLLOW_67); 

            						newLeafNode(lv_attribute_2_0, grammarAccess.getGetAttributeAccess().getAttributeSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGetAttributeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"attribute",
            							lv_attribute_2_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalRM.g:2745:3: (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) )
            // InternalRM.g:2746:4: otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) )
            {
            otherlv_3=(Token)match(input,46,FOLLOW_68); 

            				newLeafNode(otherlv_3, grammarAccess.getGetAttributeAccess().getEntityKeyword_2_0());
            			
            // InternalRM.g:2750:4: ( (lv_entity_4_0= RULE_ENTITY ) )
            // InternalRM.g:2751:5: (lv_entity_4_0= RULE_ENTITY )
            {
            // InternalRM.g:2751:5: (lv_entity_4_0= RULE_ENTITY )
            // InternalRM.g:2752:6: lv_entity_4_0= RULE_ENTITY
            {
            lv_entity_4_0=(Token)match(input,RULE_ENTITY,FOLLOW_69); 

            						newLeafNode(lv_entity_4_0, grammarAccess.getGetAttributeAccess().getEntityENTITYTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGetAttributeRule());
            						}
            						setWithLastConsumed(
            							current,
            							"entity",
            							lv_entity_4_0,
            							"org.sodalite.dsl.RM.ENTITY");
            					

            }


            }


            }

            // InternalRM.g:2769:3: (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==47) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalRM.g:2770:4: otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getGetAttributeAccess().getReq_capKeyword_3_0());
                    			
                    // InternalRM.g:2774:4: ( (lv_req_cap_6_0= RULE_STRING ) )
                    // InternalRM.g:2775:5: (lv_req_cap_6_0= RULE_STRING )
                    {
                    // InternalRM.g:2775:5: (lv_req_cap_6_0= RULE_STRING )
                    // InternalRM.g:2776:6: lv_req_cap_6_0= RULE_STRING
                    {
                    lv_req_cap_6_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_req_cap_6_0, grammarAccess.getGetAttributeAccess().getReq_capSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetAttributeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"req_cap",
                    							lv_req_cap_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGetAttributeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleGetProperty"
    // InternalRM.g:2801:1: entryRuleGetProperty returns [EObject current=null] : iv_ruleGetProperty= ruleGetProperty EOF ;
    public final EObject entryRuleGetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetProperty = null;


        try {
            // InternalRM.g:2801:52: (iv_ruleGetProperty= ruleGetProperty EOF )
            // InternalRM.g:2802:2: iv_ruleGetProperty= ruleGetProperty EOF
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
    // InternalRM.g:2808:1: ruleGetProperty returns [EObject current=null] : (otherlv_0= 'get_property{' (otherlv_1= 'property:' ( (lv_attribute_2_0= RULE_STRING ) ) ) (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleGetProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_attribute_2_0=null;
        Token otherlv_3=null;
        Token lv_entity_4_0=null;
        Token otherlv_5=null;
        Token lv_req_cap_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalRM.g:2814:2: ( (otherlv_0= 'get_property{' (otherlv_1= 'property:' ( (lv_attribute_2_0= RULE_STRING ) ) ) (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // InternalRM.g:2815:2: (otherlv_0= 'get_property{' (otherlv_1= 'property:' ( (lv_attribute_2_0= RULE_STRING ) ) ) (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // InternalRM.g:2815:2: (otherlv_0= 'get_property{' (otherlv_1= 'property:' ( (lv_attribute_2_0= RULE_STRING ) ) ) (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // InternalRM.g:2816:3: otherlv_0= 'get_property{' (otherlv_1= 'property:' ( (lv_attribute_2_0= RULE_STRING ) ) ) (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_70); 

            			newLeafNode(otherlv_0, grammarAccess.getGetPropertyAccess().getGet_propertyKeyword_0());
            		
            // InternalRM.g:2820:3: (otherlv_1= 'property:' ( (lv_attribute_2_0= RULE_STRING ) ) )
            // InternalRM.g:2821:4: otherlv_1= 'property:' ( (lv_attribute_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,49,FOLLOW_16); 

            				newLeafNode(otherlv_1, grammarAccess.getGetPropertyAccess().getPropertyKeyword_1_0());
            			
            // InternalRM.g:2825:4: ( (lv_attribute_2_0= RULE_STRING ) )
            // InternalRM.g:2826:5: (lv_attribute_2_0= RULE_STRING )
            {
            // InternalRM.g:2826:5: (lv_attribute_2_0= RULE_STRING )
            // InternalRM.g:2827:6: lv_attribute_2_0= RULE_STRING
            {
            lv_attribute_2_0=(Token)match(input,RULE_STRING,FOLLOW_67); 

            						newLeafNode(lv_attribute_2_0, grammarAccess.getGetPropertyAccess().getAttributeSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGetPropertyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"attribute",
            							lv_attribute_2_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalRM.g:2844:3: (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) )
            // InternalRM.g:2845:4: otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) )
            {
            otherlv_3=(Token)match(input,46,FOLLOW_68); 

            				newLeafNode(otherlv_3, grammarAccess.getGetPropertyAccess().getEntityKeyword_2_0());
            			
            // InternalRM.g:2849:4: ( (lv_entity_4_0= RULE_ENTITY ) )
            // InternalRM.g:2850:5: (lv_entity_4_0= RULE_ENTITY )
            {
            // InternalRM.g:2850:5: (lv_entity_4_0= RULE_ENTITY )
            // InternalRM.g:2851:6: lv_entity_4_0= RULE_ENTITY
            {
            lv_entity_4_0=(Token)match(input,RULE_ENTITY,FOLLOW_69); 

            						newLeafNode(lv_entity_4_0, grammarAccess.getGetPropertyAccess().getEntityENTITYTerminalRuleCall_2_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGetPropertyRule());
            						}
            						setWithLastConsumed(
            							current,
            							"entity",
            							lv_entity_4_0,
            							"org.sodalite.dsl.RM.ENTITY");
            					

            }


            }


            }

            // InternalRM.g:2868:3: (otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==47) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRM.g:2869:4: otherlv_5= 'req_cap:' ( (lv_req_cap_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getGetPropertyAccess().getReq_capKeyword_3_0());
                    			
                    // InternalRM.g:2873:4: ( (lv_req_cap_6_0= RULE_STRING ) )
                    // InternalRM.g:2874:5: (lv_req_cap_6_0= RULE_STRING )
                    {
                    // InternalRM.g:2874:5: (lv_req_cap_6_0= RULE_STRING )
                    // InternalRM.g:2875:6: lv_req_cap_6_0= RULE_STRING
                    {
                    lv_req_cap_6_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    						newLeafNode(lv_req_cap_6_0, grammarAccess.getGetPropertyAccess().getReq_capSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGetPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"req_cap",
                    							lv_req_cap_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGetPropertyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleECapabilities"
    // InternalRM.g:2900:1: entryRuleECapabilities returns [EObject current=null] : iv_ruleECapabilities= ruleECapabilities EOF ;
    public final EObject entryRuleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilities = null;


        try {
            // InternalRM.g:2900:54: (iv_ruleECapabilities= ruleECapabilities EOF )
            // InternalRM.g:2901:2: iv_ruleECapabilities= ruleECapabilities EOF
            {
             newCompositeNode(grammarAccess.getECapabilitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilities=ruleECapabilities();

            state._fsp--;

             current =iv_ruleECapabilities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilities"


    // $ANTLR start "ruleECapabilities"
    // InternalRM.g:2907:1: ruleECapabilities returns [EObject current=null] : ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) ;
    public final EObject ruleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilities_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2913:2: ( ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) )
            // InternalRM.g:2914:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            {
            // InternalRM.g:2914:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            // InternalRM.g:2915:3: () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            {
            // InternalRM.g:2915:3: ()
            // InternalRM.g:2916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilitiesAccess().getECapabilitiesAction_0(),
            					current);
            			

            }

            // InternalRM.g:2922:3: ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_ID) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalRM.g:2923:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    {
            	    // InternalRM.g:2923:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    // InternalRM.g:2924:5: lv_capabilities_1_0= ruleECapabilityDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilitiesAccess().getCapabilitiesECapabilityDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_capabilities_1_0=ruleECapabilityDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getECapabilitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"capabilities",
            	    						lv_capabilities_1_0,
            	    						"org.sodalite.dsl.RM.ECapabilityDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // $ANTLR end "ruleECapabilities"


    // $ANTLR start "entryRuleECapabilityDefinition"
    // InternalRM.g:2945:1: entryRuleECapabilityDefinition returns [EObject current=null] : iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF ;
    public final EObject entryRuleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinition = null;


        try {
            // InternalRM.g:2945:62: (iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF )
            // InternalRM.g:2946:2: iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF
            {
             newCompositeNode(grammarAccess.getECapabilityDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityDefinition=ruleECapabilityDefinition();

            state._fsp--;

             current =iv_ruleECapabilityDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityDefinition"


    // $ANTLR start "ruleECapabilityDefinition"
    // InternalRM.g:2952:1: ruleECapabilityDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'valid_source_types:' ( (lv_valid_source_types_7_0= RULE_STRING ) ) )? (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )? otherlv_14= '}' ) ;
    public final EObject ruleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_valid_source_types_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_start_10_0=null;
        Token otherlv_11=null;
        Token lv_end_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalRM.g:2958:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'valid_source_types:' ( (lv_valid_source_types_7_0= RULE_STRING ) ) )? (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )? otherlv_14= '}' ) )
            // InternalRM.g:2959:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'valid_source_types:' ( (lv_valid_source_types_7_0= RULE_STRING ) ) )? (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )? otherlv_14= '}' )
            {
            // InternalRM.g:2959:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'valid_source_types:' ( (lv_valid_source_types_7_0= RULE_STRING ) ) )? (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )? otherlv_14= '}' )
            // InternalRM.g:2960:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'valid_source_types:' ( (lv_valid_source_types_7_0= RULE_STRING ) ) )? (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )? otherlv_14= '}'
            {
            // InternalRM.g:2960:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:2961:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:2961:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:2962:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getECapabilityDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getECapabilityDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getECapabilityDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:2982:3: (otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            // InternalRM.g:2983:4: otherlv_2= 'type:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            {
            otherlv_2=(Token)match(input,37,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getECapabilityDefinitionAccess().getTypeKeyword_2_0());
            			
            // InternalRM.g:2987:4: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:2988:5: (otherlv_3= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:2988:5: (otherlv_3= RULE_QUALIFIED_NAME )
            // InternalRM.g:2989:6: otherlv_3= RULE_QUALIFIED_NAME
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getECapabilityDefinitionRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_71); 

            						newLeafNode(otherlv_3, grammarAccess.getECapabilityDefinitionAccess().getTypeECapabilityTypeCrossReference_2_1_0());
            					

            }


            }


            }

            // InternalRM.g:3001:3: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==25) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalRM.g:3002:4: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getECapabilityDefinitionAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRM.g:3006:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalRM.g:3007:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalRM.g:3007:5: (lv_description_5_0= RULE_STRING )
                    // InternalRM.g:3008:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_72); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getECapabilityDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECapabilityDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:3025:3: (otherlv_6= 'valid_source_types:' ( (lv_valid_source_types_7_0= RULE_STRING ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==50) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalRM.g:3026:4: otherlv_6= 'valid_source_types:' ( (lv_valid_source_types_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,50,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getECapabilityDefinitionAccess().getValid_source_typesKeyword_4_0());
                    			
                    // InternalRM.g:3030:4: ( (lv_valid_source_types_7_0= RULE_STRING ) )
                    // InternalRM.g:3031:5: (lv_valid_source_types_7_0= RULE_STRING )
                    {
                    // InternalRM.g:3031:5: (lv_valid_source_types_7_0= RULE_STRING )
                    // InternalRM.g:3032:6: lv_valid_source_types_7_0= RULE_STRING
                    {
                    lv_valid_source_types_7_0=(Token)match(input,RULE_STRING,FOLLOW_73); 

                    						newLeafNode(lv_valid_source_types_7_0, grammarAccess.getECapabilityDefinitionAccess().getValid_source_typesSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECapabilityDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valid_source_types",
                    							lv_valid_source_types_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:3049:3: (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==51) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalRM.g:3050:4: otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']'
                    {
                    otherlv_8=(Token)match(input,51,FOLLOW_74); 

                    				newLeafNode(otherlv_8, grammarAccess.getECapabilityDefinitionAccess().getOccurrencesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,52,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getECapabilityDefinitionAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalRM.g:3058:4: ( (lv_start_10_0= RULE_STRING ) )
                    // InternalRM.g:3059:5: (lv_start_10_0= RULE_STRING )
                    {
                    // InternalRM.g:3059:5: (lv_start_10_0= RULE_STRING )
                    // InternalRM.g:3060:6: lv_start_10_0= RULE_STRING
                    {
                    lv_start_10_0=(Token)match(input,RULE_STRING,FOLLOW_75); 

                    						newLeafNode(lv_start_10_0, grammarAccess.getECapabilityDefinitionAccess().getStartSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECapabilityDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"start",
                    							lv_start_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,53,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getECapabilityDefinitionAccess().getCommaKeyword_5_3());
                    			
                    // InternalRM.g:3080:4: ( (lv_end_12_0= RULE_STRING ) )
                    // InternalRM.g:3081:5: (lv_end_12_0= RULE_STRING )
                    {
                    // InternalRM.g:3081:5: (lv_end_12_0= RULE_STRING )
                    // InternalRM.g:3082:6: lv_end_12_0= RULE_STRING
                    {
                    lv_end_12_0=(Token)match(input,RULE_STRING,FOLLOW_76); 

                    						newLeafNode(lv_end_12_0, grammarAccess.getECapabilityDefinitionAccess().getEndSTRINGTerminalRuleCall_5_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getECapabilityDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end",
                    							lv_end_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getECapabilityDefinitionAccess().getRightSquareBracketKeyword_5_5());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getECapabilityDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityDefinition"


    // $ANTLR start "entryRuleERequirements"
    // InternalRM.g:3111:1: entryRuleERequirements returns [EObject current=null] : iv_ruleERequirements= ruleERequirements EOF ;
    public final EObject entryRuleERequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirements = null;


        try {
            // InternalRM.g:3111:54: (iv_ruleERequirements= ruleERequirements EOF )
            // InternalRM.g:3112:2: iv_ruleERequirements= ruleERequirements EOF
            {
             newCompositeNode(grammarAccess.getERequirementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERequirements=ruleERequirements();

            state._fsp--;

             current =iv_ruleERequirements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERequirements"


    // $ANTLR start "ruleERequirements"
    // InternalRM.g:3118:1: ruleERequirements returns [EObject current=null] : ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) ;
    public final EObject ruleERequirements() throws RecognitionException {
        EObject current = null;

        EObject lv_requirements_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3124:2: ( ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) )
            // InternalRM.g:3125:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            {
            // InternalRM.g:3125:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            // InternalRM.g:3126:3: () ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            {
            // InternalRM.g:3126:3: ()
            // InternalRM.g:3127:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequirementsAccess().getERequirementsAction_0(),
            					current);
            			

            }

            // InternalRM.g:3133:3: ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_ID) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalRM.g:3134:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    {
            	    // InternalRM.g:3134:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    // InternalRM.g:3135:5: lv_requirements_1_0= ruleERequirementDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getERequirementsAccess().getRequirementsERequirementDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_requirements_1_0=ruleERequirementDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERequirementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"requirements",
            	    						lv_requirements_1_0,
            	    						"org.sodalite.dsl.RM.ERequirementDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // $ANTLR end "ruleERequirements"


    // $ANTLR start "entryRuleERequirementDefinition"
    // InternalRM.g:3156:1: entryRuleERequirementDefinition returns [EObject current=null] : iv_ruleERequirementDefinition= ruleERequirementDefinition EOF ;
    public final EObject entryRuleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinition = null;


        try {
            // InternalRM.g:3156:63: (iv_ruleERequirementDefinition= ruleERequirementDefinition EOF )
            // InternalRM.g:3157:2: iv_ruleERequirementDefinition= ruleERequirementDefinition EOF
            {
             newCompositeNode(grammarAccess.getERequirementDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERequirementDefinition=ruleERequirementDefinition();

            state._fsp--;

             current =iv_ruleERequirementDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERequirementDefinition"


    // $ANTLR start "ruleERequirementDefinition"
    // InternalRM.g:3163:1: ruleERequirementDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'capability:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) (otherlv_4= 'node:' ( (otherlv_5= RULE_QUALIFIED_NAME ) ) )? (otherlv_6= 'relationship:' ( (otherlv_7= RULE_QUALIFIED_NAME ) ) )? (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )? otherlv_14= '}' ) ;
    public final EObject ruleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_start_10_0=null;
        Token otherlv_11=null;
        Token lv_end_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalRM.g:3169:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'capability:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) (otherlv_4= 'node:' ( (otherlv_5= RULE_QUALIFIED_NAME ) ) )? (otherlv_6= 'relationship:' ( (otherlv_7= RULE_QUALIFIED_NAME ) ) )? (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )? otherlv_14= '}' ) )
            // InternalRM.g:3170:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'capability:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) (otherlv_4= 'node:' ( (otherlv_5= RULE_QUALIFIED_NAME ) ) )? (otherlv_6= 'relationship:' ( (otherlv_7= RULE_QUALIFIED_NAME ) ) )? (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )? otherlv_14= '}' )
            {
            // InternalRM.g:3170:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'capability:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) (otherlv_4= 'node:' ( (otherlv_5= RULE_QUALIFIED_NAME ) ) )? (otherlv_6= 'relationship:' ( (otherlv_7= RULE_QUALIFIED_NAME ) ) )? (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )? otherlv_14= '}' )
            // InternalRM.g:3171:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'capability:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) (otherlv_4= 'node:' ( (otherlv_5= RULE_QUALIFIED_NAME ) ) )? (otherlv_6= 'relationship:' ( (otherlv_7= RULE_QUALIFIED_NAME ) ) )? (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )? otherlv_14= '}'
            {
            // InternalRM.g:3171:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:3172:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:3172:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:3173:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getERequirementDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERequirementDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_77); 

            			newLeafNode(otherlv_1, grammarAccess.getERequirementDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:3193:3: (otherlv_2= 'capability:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            // InternalRM.g:3194:4: otherlv_2= 'capability:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            {
            otherlv_2=(Token)match(input,55,FOLLOW_6); 

            				newLeafNode(otherlv_2, grammarAccess.getERequirementDefinitionAccess().getCapabilityKeyword_2_0());
            			
            // InternalRM.g:3198:4: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:3199:5: (otherlv_3= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:3199:5: (otherlv_3= RULE_QUALIFIED_NAME )
            // InternalRM.g:3200:6: otherlv_3= RULE_QUALIFIED_NAME
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getERequirementDefinitionRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_78); 

            						newLeafNode(otherlv_3, grammarAccess.getERequirementDefinitionAccess().getCapabilityECapabilityTypeCrossReference_2_1_0());
            					

            }


            }


            }

            // InternalRM.g:3212:3: (otherlv_4= 'node:' ( (otherlv_5= RULE_QUALIFIED_NAME ) ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==56) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalRM.g:3213:4: otherlv_4= 'node:' ( (otherlv_5= RULE_QUALIFIED_NAME ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getERequirementDefinitionAccess().getNodeKeyword_3_0());
                    			
                    // InternalRM.g:3217:4: ( (otherlv_5= RULE_QUALIFIED_NAME ) )
                    // InternalRM.g:3218:5: (otherlv_5= RULE_QUALIFIED_NAME )
                    {
                    // InternalRM.g:3218:5: (otherlv_5= RULE_QUALIFIED_NAME )
                    // InternalRM.g:3219:6: otherlv_5= RULE_QUALIFIED_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERequirementDefinitionRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_79); 

                    						newLeafNode(otherlv_5, grammarAccess.getERequirementDefinitionAccess().getNodeENodeTypeCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:3231:3: (otherlv_6= 'relationship:' ( (otherlv_7= RULE_QUALIFIED_NAME ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==57) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalRM.g:3232:4: otherlv_6= 'relationship:' ( (otherlv_7= RULE_QUALIFIED_NAME ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getERequirementDefinitionAccess().getRelationshipKeyword_4_0());
                    			
                    // InternalRM.g:3236:4: ( (otherlv_7= RULE_QUALIFIED_NAME ) )
                    // InternalRM.g:3237:5: (otherlv_7= RULE_QUALIFIED_NAME )
                    {
                    // InternalRM.g:3237:5: (otherlv_7= RULE_QUALIFIED_NAME )
                    // InternalRM.g:3238:6: otherlv_7= RULE_QUALIFIED_NAME
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERequirementDefinitionRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_73); 

                    						newLeafNode(otherlv_7, grammarAccess.getERequirementDefinitionAccess().getRelationshipERelationshipTypeCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRM.g:3250:3: (otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==51) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalRM.g:3251:4: otherlv_8= 'occurrences:' otherlv_9= '[' ( (lv_start_10_0= RULE_STRING ) ) otherlv_11= ',' ( (lv_end_12_0= RULE_STRING ) ) otherlv_13= ']'
                    {
                    otherlv_8=(Token)match(input,51,FOLLOW_74); 

                    				newLeafNode(otherlv_8, grammarAccess.getERequirementDefinitionAccess().getOccurrencesKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,52,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getERequirementDefinitionAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalRM.g:3259:4: ( (lv_start_10_0= RULE_STRING ) )
                    // InternalRM.g:3260:5: (lv_start_10_0= RULE_STRING )
                    {
                    // InternalRM.g:3260:5: (lv_start_10_0= RULE_STRING )
                    // InternalRM.g:3261:6: lv_start_10_0= RULE_STRING
                    {
                    lv_start_10_0=(Token)match(input,RULE_STRING,FOLLOW_75); 

                    						newLeafNode(lv_start_10_0, grammarAccess.getERequirementDefinitionAccess().getStartSTRINGTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERequirementDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"start",
                    							lv_start_10_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,53,FOLLOW_16); 

                    				newLeafNode(otherlv_11, grammarAccess.getERequirementDefinitionAccess().getCommaKeyword_5_3());
                    			
                    // InternalRM.g:3281:4: ( (lv_end_12_0= RULE_STRING ) )
                    // InternalRM.g:3282:5: (lv_end_12_0= RULE_STRING )
                    {
                    // InternalRM.g:3282:5: (lv_end_12_0= RULE_STRING )
                    // InternalRM.g:3283:6: lv_end_12_0= RULE_STRING
                    {
                    lv_end_12_0=(Token)match(input,RULE_STRING,FOLLOW_76); 

                    						newLeafNode(lv_end_12_0, grammarAccess.getERequirementDefinitionAccess().getEndSTRINGTerminalRuleCall_5_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getERequirementDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"end",
                    							lv_end_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getERequirementDefinitionAccess().getRightSquareBracketKeyword_5_5());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getERequirementDefinitionAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERequirementDefinition"


    // $ANTLR start "entryRuleEConstraints"
    // InternalRM.g:3312:1: entryRuleEConstraints returns [EObject current=null] : iv_ruleEConstraints= ruleEConstraints EOF ;
    public final EObject entryRuleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraints = null;


        try {
            // InternalRM.g:3312:53: (iv_ruleEConstraints= ruleEConstraints EOF )
            // InternalRM.g:3313:2: iv_ruleEConstraints= ruleEConstraints EOF
            {
             newCompositeNode(grammarAccess.getEConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConstraints=ruleEConstraints();

            state._fsp--;

             current =iv_ruleEConstraints; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEConstraints"


    // $ANTLR start "ruleEConstraints"
    // InternalRM.g:3319:1: ruleEConstraints returns [EObject current=null] : ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) ;
    public final EObject ruleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3325:2: ( ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) )
            // InternalRM.g:3326:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            {
            // InternalRM.g:3326:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            // InternalRM.g:3327:3: () ( (lv_constraints_1_0= ruleEConstraint ) )*
            {
            // InternalRM.g:3327:3: ()
            // InternalRM.g:3328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConstraintsAccess().getEConstraintsAction_0(),
            					current);
            			

            }

            // InternalRM.g:3334:3: ( (lv_constraints_1_0= ruleEConstraint ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=58 && LA80_0<=67)) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalRM.g:3335:4: (lv_constraints_1_0= ruleEConstraint )
            	    {
            	    // InternalRM.g:3335:4: (lv_constraints_1_0= ruleEConstraint )
            	    // InternalRM.g:3336:5: lv_constraints_1_0= ruleEConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getEConstraintsAccess().getConstraintsEConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_80);
            	    lv_constraints_1_0=ruleEConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_1_0,
            	    						"org.sodalite.dsl.RM.EConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
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
    // $ANTLR end "ruleEConstraints"


    // $ANTLR start "entryRuleEConstraint"
    // InternalRM.g:3357:1: entryRuleEConstraint returns [EObject current=null] : iv_ruleEConstraint= ruleEConstraint EOF ;
    public final EObject entryRuleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraint = null;


        try {
            // InternalRM.g:3357:52: (iv_ruleEConstraint= ruleEConstraint EOF )
            // InternalRM.g:3358:2: iv_ruleEConstraint= ruleEConstraint EOF
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
    // InternalRM.g:3364:1: ruleEConstraint returns [EObject current=null] : (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) ;
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
            // InternalRM.g:3370:2: ( (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) )
            // InternalRM.g:3371:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            {
            // InternalRM.g:3371:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            int alt81=10;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt81=1;
                }
                break;
            case 66:
                {
                alt81=2;
                }
                break;
            case 65:
                {
                alt81=3;
                }
                break;
            case 64:
                {
                alt81=4;
                }
                break;
            case 63:
                {
                alt81=5;
                }
                break;
            case 62:
                {
                alt81=6;
                }
                break;
            case 61:
                {
                alt81=7;
                }
                break;
            case 60:
                {
                alt81=8;
                }
                break;
            case 59:
                {
                alt81=9;
                }
                break;
            case 58:
                {
                alt81=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalRM.g:3372:3: this_EEqual_0= ruleEEqual
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
                    // InternalRM.g:3381:3: this_EGreaterThan_1= ruleEGreaterThan
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
                    // InternalRM.g:3390:3: this_EGreaterOrEqual_2= ruleEGreaterOrEqual
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
                    // InternalRM.g:3399:3: this_ELessThan_3= ruleELessThan
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
                    // InternalRM.g:3408:3: this_ELessOrEqual_4= ruleELessOrEqual
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
                    // InternalRM.g:3417:3: this_EInRange_5= ruleEInRange
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
                    // InternalRM.g:3426:3: this_EValid_Values_6= ruleEValid_Values
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
                    // InternalRM.g:3435:3: this_ELength_7= ruleELength
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
                    // InternalRM.g:3444:3: this_EMinLength_8= ruleEMinLength
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
                    // InternalRM.g:3453:3: this_EMaxLength_9= ruleEMaxLength
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
    // InternalRM.g:3465:1: entryRuleEMaxLength returns [EObject current=null] : iv_ruleEMaxLength= ruleEMaxLength EOF ;
    public final EObject entryRuleEMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMaxLength = null;


        try {
            // InternalRM.g:3465:51: (iv_ruleEMaxLength= ruleEMaxLength EOF )
            // InternalRM.g:3466:2: iv_ruleEMaxLength= ruleEMaxLength EOF
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
    // InternalRM.g:3472:1: ruleEMaxLength returns [EObject current=null] : (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:3478:2: ( (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:3479:2: (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:3479:2: (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:3480:3: otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEMaxLengthAccess().getMax_lengthKeyword_0());
            		
            // InternalRM.g:3484:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:3485:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:3485:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:3486:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEMaxLengthAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEMaxLengthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleEMaxLength"


    // $ANTLR start "entryRuleEMinLength"
    // InternalRM.g:3506:1: entryRuleEMinLength returns [EObject current=null] : iv_ruleEMinLength= ruleEMinLength EOF ;
    public final EObject entryRuleEMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMinLength = null;


        try {
            // InternalRM.g:3506:51: (iv_ruleEMinLength= ruleEMinLength EOF )
            // InternalRM.g:3507:2: iv_ruleEMinLength= ruleEMinLength EOF
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
    // InternalRM.g:3513:1: ruleEMinLength returns [EObject current=null] : (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:3519:2: ( (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:3520:2: (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:3520:2: (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:3521:3: otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEMinLengthAccess().getMin_lengthKeyword_0());
            		
            // InternalRM.g:3525:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:3526:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:3526:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:3527:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEMinLengthAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEMinLengthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleEMinLength"


    // $ANTLR start "entryRuleELength"
    // InternalRM.g:3547:1: entryRuleELength returns [EObject current=null] : iv_ruleELength= ruleELength EOF ;
    public final EObject entryRuleELength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELength = null;


        try {
            // InternalRM.g:3547:48: (iv_ruleELength= ruleELength EOF )
            // InternalRM.g:3548:2: iv_ruleELength= ruleELength EOF
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
    // InternalRM.g:3554:1: ruleELength returns [EObject current=null] : (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:3560:2: ( (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:3561:2: (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:3561:2: (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:3562:3: otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getELengthAccess().getLengthKeyword_0());
            		
            // InternalRM.g:3566:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:3567:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:3567:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:3568:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getELengthAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getELengthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleELength"


    // $ANTLR start "entryRuleEValid_Values"
    // InternalRM.g:3588:1: entryRuleEValid_Values returns [EObject current=null] : iv_ruleEValid_Values= ruleEValid_Values EOF ;
    public final EObject entryRuleEValid_Values() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValid_Values = null;


        try {
            // InternalRM.g:3588:54: (iv_ruleEValid_Values= ruleEValid_Values EOF )
            // InternalRM.g:3589:2: iv_ruleEValid_Values= ruleEValid_Values EOF
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
    // InternalRM.g:3595:1: ruleEValid_Values returns [EObject current=null] : (otherlv_0= 'valid_values:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEValid_Values() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:3601:2: ( (otherlv_0= 'valid_values:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:3602:2: (otherlv_0= 'valid_values:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:3602:2: (otherlv_0= 'valid_values:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:3603:3: otherlv_0= 'valid_values:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEValid_ValuesAccess().getValid_valuesKeyword_0());
            		
            // InternalRM.g:3607:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:3608:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:3608:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:3609:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEValid_ValuesAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEValid_ValuesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleEValid_Values"


    // $ANTLR start "entryRuleEInRange"
    // InternalRM.g:3629:1: entryRuleEInRange returns [EObject current=null] : iv_ruleEInRange= ruleEInRange EOF ;
    public final EObject entryRuleEInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInRange = null;


        try {
            // InternalRM.g:3629:49: (iv_ruleEInRange= ruleEInRange EOF )
            // InternalRM.g:3630:2: iv_ruleEInRange= ruleEInRange EOF
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
    // InternalRM.g:3636:1: ruleEInRange returns [EObject current=null] : (otherlv_0= 'in_range:' otherlv_1= '[' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ']' ) ;
    public final EObject ruleEInRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRM.g:3642:2: ( (otherlv_0= 'in_range:' otherlv_1= '[' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ']' ) )
            // InternalRM.g:3643:2: (otherlv_0= 'in_range:' otherlv_1= '[' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ']' )
            {
            // InternalRM.g:3643:2: (otherlv_0= 'in_range:' otherlv_1= '[' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ']' )
            // InternalRM.g:3644:3: otherlv_0= 'in_range:' otherlv_1= '[' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_74); 

            			newLeafNode(otherlv_0, grammarAccess.getEInRangeAccess().getIn_rangeKeyword_0());
            		
            otherlv_1=(Token)match(input,52,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getEInRangeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRM.g:3652:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalRM.g:3653:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalRM.g:3653:4: (lv_start_2_0= RULE_STRING )
            // InternalRM.g:3654:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_75); 

            					newLeafNode(lv_start_2_0, grammarAccess.getEInRangeAccess().getStartSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getEInRangeAccess().getCommaKeyword_3());
            		
            // InternalRM.g:3674:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalRM.g:3675:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalRM.g:3675:4: (lv_end_4_0= RULE_STRING )
            // InternalRM.g:3676:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_76); 

            					newLeafNode(lv_end_4_0, grammarAccess.getEInRangeAccess().getEndSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,54,FOLLOW_2); 

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
    // InternalRM.g:3700:1: entryRuleELessOrEqual returns [EObject current=null] : iv_ruleELessOrEqual= ruleELessOrEqual EOF ;
    public final EObject entryRuleELessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessOrEqual = null;


        try {
            // InternalRM.g:3700:53: (iv_ruleELessOrEqual= ruleELessOrEqual EOF )
            // InternalRM.g:3701:2: iv_ruleELessOrEqual= ruleELessOrEqual EOF
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
    // InternalRM.g:3707:1: ruleELessOrEqual returns [EObject current=null] : (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:3713:2: ( (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:3714:2: (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:3714:2: (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:3715:3: otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getELessOrEqualAccess().getLess_or_equalKeyword_0());
            		
            // InternalRM.g:3719:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:3720:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:3720:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:3721:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getELessOrEqualAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getELessOrEqualRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleELessOrEqual"


    // $ANTLR start "entryRuleELessThan"
    // InternalRM.g:3741:1: entryRuleELessThan returns [EObject current=null] : iv_ruleELessThan= ruleELessThan EOF ;
    public final EObject entryRuleELessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessThan = null;


        try {
            // InternalRM.g:3741:50: (iv_ruleELessThan= ruleELessThan EOF )
            // InternalRM.g:3742:2: iv_ruleELessThan= ruleELessThan EOF
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
    // InternalRM.g:3748:1: ruleELessThan returns [EObject current=null] : (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:3754:2: ( (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:3755:2: (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:3755:2: (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:3756:3: otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getELessThanAccess().getLess_thanKeyword_0());
            		
            // InternalRM.g:3760:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:3761:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:3761:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:3762:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getELessThanAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getELessThanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleELessThan"


    // $ANTLR start "entryRuleEGreaterOrEqual"
    // InternalRM.g:3782:1: entryRuleEGreaterOrEqual returns [EObject current=null] : iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF ;
    public final EObject entryRuleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterOrEqual = null;


        try {
            // InternalRM.g:3782:56: (iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF )
            // InternalRM.g:3783:2: iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF
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
    // InternalRM.g:3789:1: ruleEGreaterOrEqual returns [EObject current=null] : (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:3795:2: ( (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:3796:2: (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:3796:2: (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:3797:3: otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterOrEqualAccess().getGreater_or_equalKeyword_0());
            		
            // InternalRM.g:3801:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:3802:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:3802:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:3803:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEGreaterOrEqualAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEGreaterOrEqualRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleEGreaterOrEqual"


    // $ANTLR start "entryRuleEGreaterThan"
    // InternalRM.g:3823:1: entryRuleEGreaterThan returns [EObject current=null] : iv_ruleEGreaterThan= ruleEGreaterThan EOF ;
    public final EObject entryRuleEGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterThan = null;


        try {
            // InternalRM.g:3823:53: (iv_ruleEGreaterThan= ruleEGreaterThan EOF )
            // InternalRM.g:3824:2: iv_ruleEGreaterThan= ruleEGreaterThan EOF
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
    // InternalRM.g:3830:1: ruleEGreaterThan returns [EObject current=null] : (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:3836:2: ( (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:3837:2: (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:3837:2: (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:3838:3: otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterThanAccess().getGreater_thanKeyword_0());
            		
            // InternalRM.g:3842:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:3843:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:3843:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:3844:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEGreaterThanAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEGreaterThanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleEGreaterThan"


    // $ANTLR start "entryRuleEEqual"
    // InternalRM.g:3864:1: entryRuleEEqual returns [EObject current=null] : iv_ruleEEqual= ruleEEqual EOF ;
    public final EObject entryRuleEEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEqual = null;


        try {
            // InternalRM.g:3864:47: (iv_ruleEEqual= ruleEEqual EOF )
            // InternalRM.g:3865:2: iv_ruleEEqual= ruleEEqual EOF
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
    // InternalRM.g:3871:1: ruleEEqual returns [EObject current=null] : (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:3877:2: ( (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:3878:2: (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:3878:2: (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:3879:3: otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEEqualAccess().getEqualKeyword_0());
            		
            // InternalRM.g:3883:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:3884:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:3884:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:3885:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEEqualAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEEqualRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
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
    // $ANTLR end "ruleEEqual"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007C0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000F010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000E010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xFC00000000010000L,0x000000000000000FL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000033010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000032010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000004B010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000004A010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000048010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000183010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000182010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000180010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000E4B010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000E4A010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000E48010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000E40010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000E00010000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000C00010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000124B010000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000124A010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000001248010000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000001240010000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000001200010000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000003C006010000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x000003C004010000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000038004010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0001100000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000030004010000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000020004010000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000020002010000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000040082010000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000040080010000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000088000010000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x000C000002010000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x000C000000010000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0308000000010000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0208000000010000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0xFC00000000000002L,0x000000000000000FL});

}