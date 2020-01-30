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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_PRIMITIVE_DATA_TYPE", "RULE_ID", "RULE_BOOLEAN", "RULE_ENTITY", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'data_types{'", "'}'", "'artifact_types{'", "'capability_types{'", "'interface_types{'", "'relationship_types{'", "'node_types{'", "'policy_types{'", "'{'", "'derived_from:'", "'description:'", "'constraints{'", "'properties{'", "'mime_type:'", "'file_ext:'", "'attributes{'", "'inputs{'", "'operations{'", "'interfaces{'", "'capabilities{'", "'requirements{'", "'valid_target_types:'", "'type:'", "'required:'", "'default:'", "'status:'", "'entry_schema:'", "'implementation:'", "'value:'", "'get_attribute{'", "'attribute:'", "'entity:'", "'req_cap:'", "'get_property{'", "'property:'", "'valid_source_types:'", "'['", "']'", "'occurrences:'", "','", "'capability:'", "'node:'", "'relationship:'", "'max_length:'", "'min_length:'", "'length:'", "'valid_values:'", "'in_range:'", "'less_or_equal:'", "'less_than:'", "'greater_or_equal:'", "'greater_than:'", "'equal:'"
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
    // InternalRM.g:71:1: ruleRM_Model returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) ) )* ) ) ) ;
    public final EObject ruleRM_Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_dataTypes_2_0 = null;

        EObject lv_artifactTypes_5_0 = null;

        EObject lv_capabilityTypes_8_0 = null;

        EObject lv_interfaceTypes_11_0 = null;

        EObject lv_relationshipTypes_14_0 = null;

        EObject lv_nodeTypes_17_0 = null;

        EObject lv_policyTypes_20_0 = null;



        	enterRule();

        try {
            // InternalRM.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) ) )* ) ) ) )
            // InternalRM.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) ) )* ) ) )
            {
            // InternalRM.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) ) )* ) ) )
            // InternalRM.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) ) )* ) )
            {
            // InternalRM.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) ) )* ) )
            // InternalRM.g:80:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            			
            // InternalRM.g:83:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) ) )* )
            // InternalRM.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) ) )*
            {
            // InternalRM.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) ) )*
            loop1:
            do {
                int alt1=8;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3) ) {
                    alt1=4;
                }
                else if ( LA1_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4) ) {
                    alt1=5;
                }
                else if ( LA1_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5) ) {
                    alt1=6;
                }
                else if ( LA1_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6) ) {
                    alt1=7;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRM.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) )
            	    {
            	    // InternalRM.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) ) )
            	    // InternalRM.g:86:4: {...}? => ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:86:102: ( ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) ) )
            	    // InternalRM.g:87:5: ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:90:8: ({...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' ) )
            	    // InternalRM.g:90:9: {...}? => (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:90:18: (otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}' )
            	    // InternalRM.g:90:19: otherlv_1= 'data_types{' ( (lv_dataTypes_2_0= ruleEDataTypes ) ) otherlv_3= '}'
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getRM_ModelAccess().getData_typesKeyword_0_0());
            	    							
            	    // InternalRM.g:94:8: ( (lv_dataTypes_2_0= ruleEDataTypes ) )
            	    // InternalRM.g:95:9: (lv_dataTypes_2_0= ruleEDataTypes )
            	    {
            	    // InternalRM.g:95:9: (lv_dataTypes_2_0= ruleEDataTypes )
            	    // InternalRM.g:96:10: lv_dataTypes_2_0= ruleEDataTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getDataTypesEDataTypesParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_dataTypes_2_0=ruleEDataTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dataTypes",
            	    											lv_dataTypes_2_0,
            	    											"org.sodalite.dsl.RM.EDataTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,16,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_0_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:123:3: ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) )
            	    {
            	    // InternalRM.g:123:3: ({...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) ) )
            	    // InternalRM.g:124:4: {...}? => ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:124:102: ( ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) ) )
            	    // InternalRM.g:125:5: ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:128:8: ({...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' ) )
            	    // InternalRM.g:128:9: {...}? => (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:128:18: (otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}' )
            	    // InternalRM.g:128:19: otherlv_4= 'artifact_types{' ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) ) otherlv_6= '}'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_6); 

            	    								newLeafNode(otherlv_4, grammarAccess.getRM_ModelAccess().getArtifact_typesKeyword_1_0());
            	    							
            	    // InternalRM.g:132:8: ( (lv_artifactTypes_5_0= ruleEArtifactTypes ) )
            	    // InternalRM.g:133:9: (lv_artifactTypes_5_0= ruleEArtifactTypes )
            	    {
            	    // InternalRM.g:133:9: (lv_artifactTypes_5_0= ruleEArtifactTypes )
            	    // InternalRM.g:134:10: lv_artifactTypes_5_0= ruleEArtifactTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getArtifactTypesEArtifactTypesParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_artifactTypes_5_0=ruleEArtifactTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"artifactTypes",
            	    											lv_artifactTypes_5_0,
            	    											"org.sodalite.dsl.RM.EArtifactTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_6=(Token)match(input,16,FOLLOW_5); 

            	    								newLeafNode(otherlv_6, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:161:3: ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) )
            	    {
            	    // InternalRM.g:161:3: ({...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) ) )
            	    // InternalRM.g:162:4: {...}? => ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:162:102: ( ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) ) )
            	    // InternalRM.g:163:5: ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:166:8: ({...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' ) )
            	    // InternalRM.g:166:9: {...}? => (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:166:18: (otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}' )
            	    // InternalRM.g:166:19: otherlv_7= 'capability_types{' ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) ) otherlv_9= '}'
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_6); 

            	    								newLeafNode(otherlv_7, grammarAccess.getRM_ModelAccess().getCapability_typesKeyword_2_0());
            	    							
            	    // InternalRM.g:170:8: ( (lv_capabilityTypes_8_0= ruleECapabilityTypes ) )
            	    // InternalRM.g:171:9: (lv_capabilityTypes_8_0= ruleECapabilityTypes )
            	    {
            	    // InternalRM.g:171:9: (lv_capabilityTypes_8_0= ruleECapabilityTypes )
            	    // InternalRM.g:172:10: lv_capabilityTypes_8_0= ruleECapabilityTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getCapabilityTypesECapabilityTypesParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_capabilityTypes_8_0=ruleECapabilityTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"capabilityTypes",
            	    											lv_capabilityTypes_8_0,
            	    											"org.sodalite.dsl.RM.ECapabilityTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_9=(Token)match(input,16,FOLLOW_5); 

            	    								newLeafNode(otherlv_9, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_2_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:199:3: ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) )
            	    {
            	    // InternalRM.g:199:3: ({...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) ) )
            	    // InternalRM.g:200:4: {...}? => ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRM.g:200:102: ( ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) ) )
            	    // InternalRM.g:201:5: ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRM.g:204:8: ({...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' ) )
            	    // InternalRM.g:204:9: {...}? => (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:204:18: (otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}' )
            	    // InternalRM.g:204:19: otherlv_10= 'interface_types{' ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) ) otherlv_12= '}'
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_6); 

            	    								newLeafNode(otherlv_10, grammarAccess.getRM_ModelAccess().getInterface_typesKeyword_3_0());
            	    							
            	    // InternalRM.g:208:8: ( (lv_interfaceTypes_11_0= ruleEInterfaceTypes ) )
            	    // InternalRM.g:209:9: (lv_interfaceTypes_11_0= ruleEInterfaceTypes )
            	    {
            	    // InternalRM.g:209:9: (lv_interfaceTypes_11_0= ruleEInterfaceTypes )
            	    // InternalRM.g:210:10: lv_interfaceTypes_11_0= ruleEInterfaceTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getInterfaceTypesEInterfaceTypesParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_interfaceTypes_11_0=ruleEInterfaceTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"interfaceTypes",
            	    											lv_interfaceTypes_11_0,
            	    											"org.sodalite.dsl.RM.EInterfaceTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,16,FOLLOW_5); 

            	    								newLeafNode(otherlv_12, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_3_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRM.g:237:3: ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) )
            	    {
            	    // InternalRM.g:237:3: ({...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) ) )
            	    // InternalRM.g:238:4: {...}? => ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRM.g:238:102: ( ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) ) )
            	    // InternalRM.g:239:5: ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRM.g:242:8: ({...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' ) )
            	    // InternalRM.g:242:9: {...}? => (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:242:18: (otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}' )
            	    // InternalRM.g:242:19: otherlv_13= 'relationship_types{' ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) ) otherlv_15= '}'
            	    {
            	    otherlv_13=(Token)match(input,20,FOLLOW_6); 

            	    								newLeafNode(otherlv_13, grammarAccess.getRM_ModelAccess().getRelationship_typesKeyword_4_0());
            	    							
            	    // InternalRM.g:246:8: ( (lv_relationshipTypes_14_0= ruleERelationshipTypes ) )
            	    // InternalRM.g:247:9: (lv_relationshipTypes_14_0= ruleERelationshipTypes )
            	    {
            	    // InternalRM.g:247:9: (lv_relationshipTypes_14_0= ruleERelationshipTypes )
            	    // InternalRM.g:248:10: lv_relationshipTypes_14_0= ruleERelationshipTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getRelationshipTypesERelationshipTypesParserRuleCall_4_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_relationshipTypes_14_0=ruleERelationshipTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"relationshipTypes",
            	    											lv_relationshipTypes_14_0,
            	    											"org.sodalite.dsl.RM.ERelationshipTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_15=(Token)match(input,16,FOLLOW_5); 

            	    								newLeafNode(otherlv_15, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_4_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRM.g:275:3: ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) )
            	    {
            	    // InternalRM.g:275:3: ({...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) ) )
            	    // InternalRM.g:276:4: {...}? => ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRM.g:276:102: ( ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) ) )
            	    // InternalRM.g:277:5: ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRM.g:280:8: ({...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' ) )
            	    // InternalRM.g:280:9: {...}? => (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:280:18: (otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}' )
            	    // InternalRM.g:280:19: otherlv_16= 'node_types{' ( (lv_nodeTypes_17_0= ruleENodeTypes ) ) otherlv_18= '}'
            	    {
            	    otherlv_16=(Token)match(input,21,FOLLOW_6); 

            	    								newLeafNode(otherlv_16, grammarAccess.getRM_ModelAccess().getNode_typesKeyword_5_0());
            	    							
            	    // InternalRM.g:284:8: ( (lv_nodeTypes_17_0= ruleENodeTypes ) )
            	    // InternalRM.g:285:9: (lv_nodeTypes_17_0= ruleENodeTypes )
            	    {
            	    // InternalRM.g:285:9: (lv_nodeTypes_17_0= ruleENodeTypes )
            	    // InternalRM.g:286:10: lv_nodeTypes_17_0= ruleENodeTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getNodeTypesENodeTypesParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_nodeTypes_17_0=ruleENodeTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nodeTypes",
            	    											lv_nodeTypes_17_0,
            	    											"org.sodalite.dsl.RM.ENodeTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_18=(Token)match(input,16,FOLLOW_5); 

            	    								newLeafNode(otherlv_18, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_5_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRM.g:313:3: ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) )
            	    {
            	    // InternalRM.g:313:3: ({...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) ) )
            	    // InternalRM.g:314:4: {...}? => ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRM.g:314:102: ( ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) ) )
            	    // InternalRM.g:315:5: ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRM.g:318:8: ({...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' ) )
            	    // InternalRM.g:318:9: {...}? => (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:318:18: (otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}' )
            	    // InternalRM.g:318:19: otherlv_19= 'policy_types{' ( (lv_policyTypes_20_0= ruleEPolicyTypes ) ) otherlv_21= '}'
            	    {
            	    otherlv_19=(Token)match(input,22,FOLLOW_6); 

            	    								newLeafNode(otherlv_19, grammarAccess.getRM_ModelAccess().getPolicy_typesKeyword_6_0());
            	    							
            	    // InternalRM.g:322:8: ( (lv_policyTypes_20_0= ruleEPolicyTypes ) )
            	    // InternalRM.g:323:9: (lv_policyTypes_20_0= ruleEPolicyTypes )
            	    {
            	    // InternalRM.g:323:9: (lv_policyTypes_20_0= ruleEPolicyTypes )
            	    // InternalRM.g:324:10: lv_policyTypes_20_0= ruleEPolicyTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getPolicyTypesEPolicyTypesParserRuleCall_6_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_policyTypes_20_0=ruleEPolicyTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"policyTypes",
            	    											lv_policyTypes_20_0,
            	    											"org.sodalite.dsl.RM.EPolicyTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_21=(Token)match(input,16,FOLLOW_5); 

            	    								newLeafNode(otherlv_21, grammarAccess.getRM_ModelAccess().getRightCurlyBracketKeyword_6_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

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
    // InternalRM.g:361:1: entryRuleEDataTypes returns [EObject current=null] : iv_ruleEDataTypes= ruleEDataTypes EOF ;
    public final EObject entryRuleEDataTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypes = null;


        try {
            // InternalRM.g:361:51: (iv_ruleEDataTypes= ruleEDataTypes EOF )
            // InternalRM.g:362:2: iv_ruleEDataTypes= ruleEDataTypes EOF
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
    // InternalRM.g:368:1: ruleEDataTypes returns [EObject current=null] : ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ ) ;
    public final EObject ruleEDataTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_dataTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:374:2: ( ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ ) )
            // InternalRM.g:375:2: ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ )
            {
            // InternalRM.g:375:2: ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ )
            // InternalRM.g:376:3: () ( (lv_dataTypes_1_0= ruleEDataType ) )+
            {
            // InternalRM.g:376:3: ()
            // InternalRM.g:377:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataTypesAccess().getEDataTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:383:3: ( (lv_dataTypes_1_0= ruleEDataType ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_QUALIFIED_NAME && LA2_0<=RULE_PRIMITIVE_DATA_TYPE)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRM.g:384:4: (lv_dataTypes_1_0= ruleEDataType )
            	    {
            	    // InternalRM.g:384:4: (lv_dataTypes_1_0= ruleEDataType )
            	    // InternalRM.g:385:5: lv_dataTypes_1_0= ruleEDataType
            	    {

            	    					newCompositeNode(grammarAccess.getEDataTypesAccess().getDataTypesEDataTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // InternalRM.g:406:1: entryRuleEDataType returns [EObject current=null] : iv_ruleEDataType= ruleEDataType EOF ;
    public final EObject entryRuleEDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType = null;


        try {
            // InternalRM.g:406:50: (iv_ruleEDataType= ruleEDataType EOF )
            // InternalRM.g:407:2: iv_ruleEDataType= ruleEDataType EOF
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
    // InternalRM.g:413:1: ruleEDataType returns [EObject current=null] : ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= '{' ( (lv_data_2_0= ruleEDataTypeBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleEDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_data_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:419:2: ( ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= '{' ( (lv_data_2_0= ruleEDataTypeBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:420:2: ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= '{' ( (lv_data_2_0= ruleEDataTypeBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:420:2: ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= '{' ( (lv_data_2_0= ruleEDataTypeBody ) ) otherlv_3= '}' )
            // InternalRM.g:421:3: ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= '{' ( (lv_data_2_0= ruleEDataTypeBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:421:3: ( (lv_name_0_0= ruleEDataTypeName ) )
            // InternalRM.g:422:4: (lv_name_0_0= ruleEDataTypeName )
            {
            // InternalRM.g:422:4: (lv_name_0_0= ruleEDataTypeName )
            // InternalRM.g:423:5: lv_name_0_0= ruleEDataTypeName
            {

            					newCompositeNode(grammarAccess.getEDataTypeAccess().getNameEDataTypeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_1=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:444:3: ( (lv_data_2_0= ruleEDataTypeBody ) )
            // InternalRM.g:445:4: (lv_data_2_0= ruleEDataTypeBody )
            {
            // InternalRM.g:445:4: (lv_data_2_0= ruleEDataTypeBody )
            // InternalRM.g:446:5: lv_data_2_0= ruleEDataTypeBody
            {

            					newCompositeNode(grammarAccess.getEDataTypeAccess().getDataEDataTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_data_2_0=ruleEDataTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDataTypeRule());
            					}
            					set(
            						current,
            						"data",
            						lv_data_2_0,
            						"org.sodalite.dsl.RM.EDataTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEDataTypeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEDataTypeBody"
    // InternalRM.g:471:1: entryRuleEDataTypeBody returns [EObject current=null] : iv_ruleEDataTypeBody= ruleEDataTypeBody EOF ;
    public final EObject entryRuleEDataTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypeBody = null;


        try {
            // InternalRM.g:471:54: (iv_ruleEDataTypeBody= ruleEDataTypeBody EOF )
            // InternalRM.g:472:2: iv_ruleEDataTypeBody= ruleEDataTypeBody EOF
            {
             newCompositeNode(grammarAccess.getEDataTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataTypeBody=ruleEDataTypeBody();

            state._fsp--;

             current =iv_ruleEDataTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDataTypeBody"


    // $ANTLR start "ruleEDataTypeBody"
    // InternalRM.g:478:1: ruleEDataTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEDataTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_constraints_7_0 = null;

        EObject lv_properties_10_0 = null;



        	enterRule();

        try {
            // InternalRM.g:484:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:485:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:485:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) )
            // InternalRM.g:486:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )* ) ) )
            {
            // InternalRM.g:486:3: ()
            // InternalRM.g:487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataTypeBodyAccess().getEDataTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:493:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )* ) ) )
            // InternalRM.g:494:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )* ) )
            {
            // InternalRM.g:494:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )* ) )
            // InternalRM.g:495:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:498:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )* )
            // InternalRM.g:499:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )*
            {
            // InternalRM.g:499:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) ) )*
            loop3:
            do {
                int alt3=5;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt3=4;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRM.g:500:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:500:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:501:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:501:110: ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:502:6: ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:505:9: ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:505:10: {...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRM.g:505:19: (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:505:20: otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_3); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEDataTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:509:9: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:510:10: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:510:10: ( ruleEDataTypeName )
            	    // InternalRM.g:511:11: ruleEDataTypeName
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getSuperTypeEDataTypeCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:531:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:531:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:532:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:532:110: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:533:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:536:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:536:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRM.g:536:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:536:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEDataTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:540:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:541:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:541:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:542:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getEDataTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:564:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalRM.g:564:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) ) )
            	    // InternalRM.g:565:5: {...}? => ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:565:110: ( ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) ) )
            	    // InternalRM.g:566:6: ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:569:9: ({...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' ) )
            	    // InternalRM.g:569:10: {...}? => (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRM.g:569:19: (otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}' )
            	    // InternalRM.g:569:20: otherlv_6= 'constraints{' ( (lv_constraints_7_0= ruleEConstraints ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,26,FOLLOW_12); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEDataTypeBodyAccess().getConstraintsKeyword_1_2_0());
            	    								
            	    // InternalRM.g:573:9: ( (lv_constraints_7_0= ruleEConstraints ) )
            	    // InternalRM.g:574:10: (lv_constraints_7_0= ruleEConstraints )
            	    {
            	    // InternalRM.g:574:10: (lv_constraints_7_0= ruleEConstraints )
            	    // InternalRM.g:575:11: lv_constraints_7_0= ruleEConstraints
            	    {

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getConstraintsEConstraintsParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_constraints_7_0=ruleEConstraints();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"constraints",
            	    												lv_constraints_7_0,
            	    												"org.sodalite.dsl.RM.EConstraints");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_8=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEDataTypeBodyAccess().getRightCurlyBracketKeyword_1_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:602:4: ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalRM.g:602:4: ({...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) ) )
            	    // InternalRM.g:603:5: {...}? => ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:603:110: ( ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) ) )
            	    // InternalRM.g:604:6: ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:607:9: ({...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' ) )
            	    // InternalRM.g:607:10: {...}? => (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRM.g:607:19: (otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}' )
            	    // InternalRM.g:607:20: otherlv_9= 'properties{' ( (lv_properties_10_0= ruleEProperties ) ) otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,27,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getEDataTypeBodyAccess().getPropertiesKeyword_1_3_0());
            	    								
            	    // InternalRM.g:611:9: ( (lv_properties_10_0= ruleEProperties ) )
            	    // InternalRM.g:612:10: (lv_properties_10_0= ruleEProperties )
            	    {
            	    // InternalRM.g:612:10: (lv_properties_10_0= ruleEProperties )
            	    // InternalRM.g:613:11: lv_properties_10_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_properties_10_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_10_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_11, grammarAccess.getEDataTypeBodyAccess().getRightCurlyBracketKeyword_1_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleEDataTypeBody"


    // $ANTLR start "entryRuleEDataTypeName"
    // InternalRM.g:651:1: entryRuleEDataTypeName returns [String current=null] : iv_ruleEDataTypeName= ruleEDataTypeName EOF ;
    public final String entryRuleEDataTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDataTypeName = null;


        try {
            // InternalRM.g:651:53: (iv_ruleEDataTypeName= ruleEDataTypeName EOF )
            // InternalRM.g:652:2: iv_ruleEDataTypeName= ruleEDataTypeName EOF
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
    // InternalRM.g:658:1: ruleEDataTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleEDataTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUALIFIED_NAME_0=null;
        Token this_PRIMITIVE_DATA_TYPE_1=null;


        	enterRule();

        try {
            // InternalRM.g:664:2: ( (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) )
            // InternalRM.g:665:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
            {
            // InternalRM.g:665:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_QUALIFIED_NAME) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_PRIMITIVE_DATA_TYPE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRM.g:666:3: this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME
                    {
                    this_QUALIFIED_NAME_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_NAME_0);
                    		

                    			newLeafNode(this_QUALIFIED_NAME_0, grammarAccess.getEDataTypeNameAccess().getQUALIFIED_NAMETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRM.g:674:3: this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE
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
    // InternalRM.g:685:1: entryRuleEArtifactTypes returns [EObject current=null] : iv_ruleEArtifactTypes= ruleEArtifactTypes EOF ;
    public final EObject entryRuleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypes = null;


        try {
            // InternalRM.g:685:55: (iv_ruleEArtifactTypes= ruleEArtifactTypes EOF )
            // InternalRM.g:686:2: iv_ruleEArtifactTypes= ruleEArtifactTypes EOF
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
    // InternalRM.g:692:1: ruleEArtifactTypes returns [EObject current=null] : ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) ;
    public final EObject ruleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_artifactTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:698:2: ( ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) )
            // InternalRM.g:699:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            {
            // InternalRM.g:699:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            // InternalRM.g:700:3: () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            {
            // InternalRM.g:700:3: ()
            // InternalRM.g:701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypesAccess().getEArtifactTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:707:3: ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_QUALIFIED_NAME) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRM.g:708:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    {
            	    // InternalRM.g:708:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    // InternalRM.g:709:5: lv_artifactTypes_1_0= ruleEArtifactType
            	    {

            	    					newCompositeNode(grammarAccess.getEArtifactTypesAccess().getArtifactTypesEArtifactTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalRM.g:730:1: entryRuleEArtifactType returns [EObject current=null] : iv_ruleEArtifactType= ruleEArtifactType EOF ;
    public final EObject entryRuleEArtifactType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactType = null;


        try {
            // InternalRM.g:730:54: (iv_ruleEArtifactType= ruleEArtifactType EOF )
            // InternalRM.g:731:2: iv_ruleEArtifactType= ruleEArtifactType EOF
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
    // InternalRM.g:737:1: ruleEArtifactType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_artifact_2_0= ruleEArtifactTypeBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleEArtifactType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_artifact_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:743:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_artifact_2_0= ruleEArtifactTypeBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:744:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_artifact_2_0= ruleEArtifactTypeBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:744:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_artifact_2_0= ruleEArtifactTypeBody ) ) otherlv_3= '}' )
            // InternalRM.g:745:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_artifact_2_0= ruleEArtifactTypeBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:745:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:746:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:746:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:747:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getEArtifactTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:767:3: ( (lv_artifact_2_0= ruleEArtifactTypeBody ) )
            // InternalRM.g:768:4: (lv_artifact_2_0= ruleEArtifactTypeBody )
            {
            // InternalRM.g:768:4: (lv_artifact_2_0= ruleEArtifactTypeBody )
            // InternalRM.g:769:5: lv_artifact_2_0= ruleEArtifactTypeBody
            {

            					newCompositeNode(grammarAccess.getEArtifactTypeAccess().getArtifactEArtifactTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_artifact_2_0=ruleEArtifactTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEArtifactTypeRule());
            					}
            					set(
            						current,
            						"artifact",
            						lv_artifact_2_0,
            						"org.sodalite.dsl.RM.EArtifactTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEArtifactTypeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEArtifactTypeBody"
    // InternalRM.g:794:1: entryRuleEArtifactTypeBody returns [EObject current=null] : iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF ;
    public final EObject entryRuleEArtifactTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypeBody = null;


        try {
            // InternalRM.g:794:58: (iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF )
            // InternalRM.g:795:2: iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF
            {
             newCompositeNode(grammarAccess.getEArtifactTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEArtifactTypeBody=ruleEArtifactTypeBody();

            state._fsp--;

             current =iv_ruleEArtifactTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEArtifactTypeBody"


    // $ANTLR start "ruleEArtifactTypeBody"
    // InternalRM.g:801:1: ruleEArtifactTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEArtifactTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_mime_type_7_0=null;
        Token otherlv_8=null;
        Token lv_file_ext_9_0=null;


        	enterRule();

        try {
            // InternalRM.g:807:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:808:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:808:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRM.g:809:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRM.g:809:3: ()
            // InternalRM.g:810:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypeBodyAccess().getEArtifactTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:816:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRM.g:817:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRM.g:817:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRM.g:818:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:821:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRM.g:822:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRM.g:822:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
            loop7:
            do {
                int alt7=5;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt7=4;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRM.g:823:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:823:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:824:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:824:114: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:825:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:828:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:828:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRM.g:828:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:828:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEArtifactTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:832:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:833:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:833:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:834:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_16); 

            	    											newLeafNode(otherlv_3, grammarAccess.getEArtifactTypeBodyAccess().getSuperTypeEArtifactTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:851:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:851:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:852:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:852:114: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:853:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:856:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:856:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRM.g:856:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:856:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEArtifactTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:860:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:861:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:861:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:862:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getEArtifactTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:884:4: ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:884:4: ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:885:5: {...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:885:114: ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:886:6: ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:889:9: ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:889:10: {...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRM.g:889:19: (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    // InternalRM.g:889:20: otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEArtifactTypeBodyAccess().getMime_typeKeyword_1_2_0());
            	    								
            	    // InternalRM.g:893:9: ( (lv_mime_type_7_0= RULE_STRING ) )
            	    // InternalRM.g:894:10: (lv_mime_type_7_0= RULE_STRING )
            	    {
            	    // InternalRM.g:894:10: (lv_mime_type_7_0= RULE_STRING )
            	    // InternalRM.g:895:11: lv_mime_type_7_0= RULE_STRING
            	    {
            	    lv_mime_type_7_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    											newLeafNode(lv_mime_type_7_0, grammarAccess.getEArtifactTypeBodyAccess().getMime_typeSTRINGTerminalRuleCall_1_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"mime_type",
            	    												lv_mime_type_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:917:4: ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:917:4: ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:918:5: {...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:918:114: ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:919:6: ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:922:9: ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:922:10: {...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRM.g:922:19: ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    // InternalRM.g:922:20: (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) )
            	    {
            	    // InternalRM.g:922:20: (otherlv_8= 'file_ext:' )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==29) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalRM.g:923:10: otherlv_8= 'file_ext:'
            	    	    {
            	    	    otherlv_8=(Token)match(input,29,FOLLOW_17); 

            	    	    										newLeafNode(otherlv_8, grammarAccess.getEArtifactTypeBodyAccess().getFile_extKeyword_1_3_0());
            	    	    									

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	    // InternalRM.g:928:9: ( (lv_file_ext_9_0= RULE_STRING ) )
            	    // InternalRM.g:929:10: (lv_file_ext_9_0= RULE_STRING )
            	    {
            	    // InternalRM.g:929:10: (lv_file_ext_9_0= RULE_STRING )
            	    // InternalRM.g:930:11: lv_file_ext_9_0= RULE_STRING
            	    {
            	    lv_file_ext_9_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    											newLeafNode(lv_file_ext_9_0, grammarAccess.getEArtifactTypeBodyAccess().getFile_extSTRINGTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"file_ext",
            	    												lv_file_ext_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleEArtifactTypeBody"


    // $ANTLR start "entryRuleECapabilityTypes"
    // InternalRM.g:963:1: entryRuleECapabilityTypes returns [EObject current=null] : iv_ruleECapabilityTypes= ruleECapabilityTypes EOF ;
    public final EObject entryRuleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypes = null;


        try {
            // InternalRM.g:963:57: (iv_ruleECapabilityTypes= ruleECapabilityTypes EOF )
            // InternalRM.g:964:2: iv_ruleECapabilityTypes= ruleECapabilityTypes EOF
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
    // InternalRM.g:970:1: ruleECapabilityTypes returns [EObject current=null] : ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) ;
    public final EObject ruleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilityTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:976:2: ( ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) )
            // InternalRM.g:977:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            {
            // InternalRM.g:977:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            // InternalRM.g:978:3: () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            {
            // InternalRM.g:978:3: ()
            // InternalRM.g:979:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypesAccess().getECapabilityTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:985:3: ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_QUALIFIED_NAME) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRM.g:986:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    {
            	    // InternalRM.g:986:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    // InternalRM.g:987:5: lv_capabilityTypes_1_0= ruleECapabilityType
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilityTypesAccess().getCapabilityTypesECapabilityTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
    // $ANTLR end "ruleECapabilityTypes"


    // $ANTLR start "entryRuleECapabilityType"
    // InternalRM.g:1008:1: entryRuleECapabilityType returns [EObject current=null] : iv_ruleECapabilityType= ruleECapabilityType EOF ;
    public final EObject entryRuleECapabilityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityType = null;


        try {
            // InternalRM.g:1008:56: (iv_ruleECapabilityType= ruleECapabilityType EOF )
            // InternalRM.g:1009:2: iv_ruleECapabilityType= ruleECapabilityType EOF
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
    // InternalRM.g:1015:1: ruleECapabilityType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_capability_2_0= ruleECapabilityTypeBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleECapabilityType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_capability_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1021:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_capability_2_0= ruleECapabilityTypeBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:1022:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_capability_2_0= ruleECapabilityTypeBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:1022:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_capability_2_0= ruleECapabilityTypeBody ) ) otherlv_3= '}' )
            // InternalRM.g:1023:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_capability_2_0= ruleECapabilityTypeBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:1023:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1024:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1024:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1025:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getECapabilityTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:1045:3: ( (lv_capability_2_0= ruleECapabilityTypeBody ) )
            // InternalRM.g:1046:4: (lv_capability_2_0= ruleECapabilityTypeBody )
            {
            // InternalRM.g:1046:4: (lv_capability_2_0= ruleECapabilityTypeBody )
            // InternalRM.g:1047:5: lv_capability_2_0= ruleECapabilityTypeBody
            {

            					newCompositeNode(grammarAccess.getECapabilityTypeAccess().getCapabilityECapabilityTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_capability_2_0=ruleECapabilityTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getECapabilityTypeRule());
            					}
            					set(
            						current,
            						"capability",
            						lv_capability_2_0,
            						"org.sodalite.dsl.RM.ECapabilityTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getECapabilityTypeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleECapabilityTypeBody"
    // InternalRM.g:1072:1: entryRuleECapabilityTypeBody returns [EObject current=null] : iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF ;
    public final EObject entryRuleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeBody = null;


        try {
            // InternalRM.g:1072:60: (iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF )
            // InternalRM.g:1073:2: iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF
            {
             newCompositeNode(grammarAccess.getECapabilityTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityTypeBody=ruleECapabilityTypeBody();

            state._fsp--;

             current =iv_ruleECapabilityTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityTypeBody"


    // $ANTLR start "ruleECapabilityTypeBody"
    // InternalRM.g:1079:1: ruleECapabilityTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_properties_7_0 = null;

        EObject lv_atributes_10_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1085:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:1086:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:1086:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) )
            // InternalRM.g:1087:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )* ) ) )
            {
            // InternalRM.g:1087:3: ()
            // InternalRM.g:1088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypeBodyAccess().getECapabilityTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:1094:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )* ) ) )
            // InternalRM.g:1095:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )* ) )
            {
            // InternalRM.g:1095:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )* ) )
            // InternalRM.g:1096:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:1099:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )* )
            // InternalRM.g:1100:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )*
            {
            // InternalRM.g:1100:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) )*
            loop9:
            do {
                int alt9=5;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt9=4;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRM.g:1101:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1101:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:1102:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:1102:116: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:1103:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:1106:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:1106:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRM.g:1106:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:1106:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getECapabilityTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:1110:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:1111:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:1111:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:1112:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_19); 

            	    											newLeafNode(otherlv_3, grammarAccess.getECapabilityTypeBodyAccess().getSuperTypeECapabilityTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:1129:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1129:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:1130:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:1130:116: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:1131:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:1134:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:1134:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRM.g:1134:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:1134:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getECapabilityTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:1138:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:1139:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:1139:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:1140:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getECapabilityTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:1162:4: ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalRM.g:1162:4: ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) )
            	    // InternalRM.g:1163:5: {...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:1163:116: ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) )
            	    // InternalRM.g:1164:6: ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:1167:9: ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) )
            	    // InternalRM.g:1167:10: {...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRM.g:1167:19: (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )
            	    // InternalRM.g:1167:20: otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getECapabilityTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    // InternalRM.g:1171:9: ( (lv_properties_7_0= ruleEProperties ) )
            	    // InternalRM.g:1172:10: (lv_properties_7_0= ruleEProperties )
            	    {
            	    // InternalRM.g:1172:10: (lv_properties_7_0= ruleEProperties )
            	    // InternalRM.g:1173:11: lv_properties_7_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getECapabilityTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_properties_7_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_7_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_8=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_8, grammarAccess.getECapabilityTypeBodyAccess().getRightCurlyBracketKeyword_1_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:1200:4: ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalRM.g:1200:4: ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) )
            	    // InternalRM.g:1201:5: {...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:1201:116: ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) )
            	    // InternalRM.g:1202:6: ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:1205:9: ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) )
            	    // InternalRM.g:1205:10: {...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRM.g:1205:19: (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )
            	    // InternalRM.g:1205:20: otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,30,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getECapabilityTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    // InternalRM.g:1209:9: ( (lv_atributes_10_0= ruleEAttributes ) )
            	    // InternalRM.g:1210:10: (lv_atributes_10_0= ruleEAttributes )
            	    {
            	    // InternalRM.g:1210:10: (lv_atributes_10_0= ruleEAttributes )
            	    // InternalRM.g:1211:11: lv_atributes_10_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getECapabilityTypeBodyAccess().getAtributesEAttributesParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_atributes_10_0=ruleEAttributes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"atributes",
            	    												lv_atributes_10_0,
            	    												"org.sodalite.dsl.RM.EAttributes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_11, grammarAccess.getECapabilityTypeBodyAccess().getRightCurlyBracketKeyword_1_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleECapabilityTypeBody"


    // $ANTLR start "entryRuleEInterfaceTypes"
    // InternalRM.g:1249:1: entryRuleEInterfaceTypes returns [EObject current=null] : iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF ;
    public final EObject entryRuleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypes = null;


        try {
            // InternalRM.g:1249:56: (iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF )
            // InternalRM.g:1250:2: iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF
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
    // InternalRM.g:1256:1: ruleEInterfaceTypes returns [EObject current=null] : ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) ;
    public final EObject ruleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaceTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1262:2: ( ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) )
            // InternalRM.g:1263:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            {
            // InternalRM.g:1263:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            // InternalRM.g:1264:3: () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            {
            // InternalRM.g:1264:3: ()
            // InternalRM.g:1265:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypesAccess().getEInterfaceTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1271:3: ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_QUALIFIED_NAME) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRM.g:1272:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    {
            	    // InternalRM.g:1272:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    // InternalRM.g:1273:5: lv_interfaceTypes_1_0= ruleEInterfaceType
            	    {

            	    					newCompositeNode(grammarAccess.getEInterfaceTypesAccess().getInterfaceTypesEInterfaceTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalRM.g:1294:1: entryRuleEInterfaceType returns [EObject current=null] : iv_ruleEInterfaceType= ruleEInterfaceType EOF ;
    public final EObject entryRuleEInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceType = null;


        try {
            // InternalRM.g:1294:55: (iv_ruleEInterfaceType= ruleEInterfaceType EOF )
            // InternalRM.g:1295:2: iv_ruleEInterfaceType= ruleEInterfaceType EOF
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
    // InternalRM.g:1301:1: ruleEInterfaceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_interface_2_0= ruleEInterfaceTypeBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleEInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_interface_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1307:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_interface_2_0= ruleEInterfaceTypeBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:1308:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_interface_2_0= ruleEInterfaceTypeBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:1308:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_interface_2_0= ruleEInterfaceTypeBody ) ) otherlv_3= '}' )
            // InternalRM.g:1309:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_interface_2_0= ruleEInterfaceTypeBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:1309:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1310:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1310:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1311:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getEInterfaceTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:1331:3: ( (lv_interface_2_0= ruleEInterfaceTypeBody ) )
            // InternalRM.g:1332:4: (lv_interface_2_0= ruleEInterfaceTypeBody )
            {
            // InternalRM.g:1332:4: (lv_interface_2_0= ruleEInterfaceTypeBody )
            // InternalRM.g:1333:5: lv_interface_2_0= ruleEInterfaceTypeBody
            {

            					newCompositeNode(grammarAccess.getEInterfaceTypeAccess().getInterfaceEInterfaceTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_interface_2_0=ruleEInterfaceTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInterfaceTypeRule());
            					}
            					set(
            						current,
            						"interface",
            						lv_interface_2_0,
            						"org.sodalite.dsl.RM.EInterfaceTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEInterfaceTypeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEInterfaceTypeBody"
    // InternalRM.g:1358:1: entryRuleEInterfaceTypeBody returns [EObject current=null] : iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF ;
    public final EObject entryRuleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypeBody = null;


        try {
            // InternalRM.g:1358:59: (iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF )
            // InternalRM.g:1359:2: iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaceTypeBody=ruleEInterfaceTypeBody();

            state._fsp--;

             current =iv_ruleEInterfaceTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaceTypeBody"


    // $ANTLR start "ruleEInterfaceTypeBody"
    // InternalRM.g:1365:1: ruleEInterfaceTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_inputs_7_0 = null;

        EObject lv_operations_10_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1371:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:1372:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:1372:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )* ) ) ) )
            // InternalRM.g:1373:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )* ) ) )
            {
            // InternalRM.g:1373:3: ()
            // InternalRM.g:1374:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypeBodyAccess().getEInterfaceTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:1380:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )* ) ) )
            // InternalRM.g:1381:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )* ) )
            {
            // InternalRM.g:1381:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )* ) )
            // InternalRM.g:1382:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:1385:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )* )
            // InternalRM.g:1386:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )*
            {
            // InternalRM.g:1386:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) ) )*
            loop11:
            do {
                int alt11=5;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRM.g:1387:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1387:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:1388:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:1388:115: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:1389:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:1392:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:1392:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRM.g:1392:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:1392:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEInterfaceTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:1396:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:1397:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:1397:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:1398:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_21); 

            	    											newLeafNode(otherlv_3, grammarAccess.getEInterfaceTypeBodyAccess().getSuperTypeEInterfaceTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:1415:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1415:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:1416:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:1416:115: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:1417:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:1420:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:1420:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRM.g:1420:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:1420:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEInterfaceTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:1424:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:1425:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:1425:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:1426:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getEInterfaceTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:1448:4: ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalRM.g:1448:4: ({...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) )
            	    // InternalRM.g:1449:5: {...}? => ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:1449:115: ( ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) )
            	    // InternalRM.g:1450:6: ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:1453:9: ({...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' ) )
            	    // InternalRM.g:1453:10: {...}? => (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRM.g:1453:19: (otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}' )
            	    // InternalRM.g:1453:20: otherlv_6= 'inputs{' ( (lv_inputs_7_0= ruleEProperties ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,31,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEInterfaceTypeBodyAccess().getInputsKeyword_1_2_0());
            	    								
            	    // InternalRM.g:1457:9: ( (lv_inputs_7_0= ruleEProperties ) )
            	    // InternalRM.g:1458:10: (lv_inputs_7_0= ruleEProperties )
            	    {
            	    // InternalRM.g:1458:10: (lv_inputs_7_0= ruleEProperties )
            	    // InternalRM.g:1459:11: lv_inputs_7_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getEInterfaceTypeBodyAccess().getInputsEPropertiesParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_inputs_7_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inputs",
            	    												lv_inputs_7_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_8=(Token)match(input,16,FOLLOW_21); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEInterfaceTypeBodyAccess().getRightCurlyBracketKeyword_1_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:1486:4: ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalRM.g:1486:4: ({...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) ) )
            	    // InternalRM.g:1487:5: {...}? => ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:1487:115: ( ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) ) )
            	    // InternalRM.g:1488:6: ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:1491:9: ({...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' ) )
            	    // InternalRM.g:1491:10: {...}? => (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRM.g:1491:19: (otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}' )
            	    // InternalRM.g:1491:20: otherlv_9= 'operations{' ( (lv_operations_10_0= ruleEOperations ) ) otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,32,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getEInterfaceTypeBodyAccess().getOperationsKeyword_1_3_0());
            	    								
            	    // InternalRM.g:1495:9: ( (lv_operations_10_0= ruleEOperations ) )
            	    // InternalRM.g:1496:10: (lv_operations_10_0= ruleEOperations )
            	    {
            	    // InternalRM.g:1496:10: (lv_operations_10_0= ruleEOperations )
            	    // InternalRM.g:1497:11: lv_operations_10_0= ruleEOperations
            	    {

            	    											newCompositeNode(grammarAccess.getEInterfaceTypeBodyAccess().getOperationsEOperationsParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_operations_10_0=ruleEOperations();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"operations",
            	    												lv_operations_10_0,
            	    												"org.sodalite.dsl.RM.EOperations");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,16,FOLLOW_21); 

            	    									newLeafNode(otherlv_11, grammarAccess.getEInterfaceTypeBodyAccess().getRightCurlyBracketKeyword_1_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleEInterfaceTypeBody"


    // $ANTLR start "entryRuleEPolicyTypes"
    // InternalRM.g:1535:1: entryRuleEPolicyTypes returns [EObject current=null] : iv_ruleEPolicyTypes= ruleEPolicyTypes EOF ;
    public final EObject entryRuleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypes = null;


        try {
            // InternalRM.g:1535:53: (iv_ruleEPolicyTypes= ruleEPolicyTypes EOF )
            // InternalRM.g:1536:2: iv_ruleEPolicyTypes= ruleEPolicyTypes EOF
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
    // InternalRM.g:1542:1: ruleEPolicyTypes returns [EObject current=null] : ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) ;
    public final EObject ruleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_policyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1548:2: ( ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) )
            // InternalRM.g:1549:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            {
            // InternalRM.g:1549:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            // InternalRM.g:1550:3: () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            {
            // InternalRM.g:1550:3: ()
            // InternalRM.g:1551:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypesAccess().getEPolicyTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1557:3: ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_QUALIFIED_NAME) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRM.g:1558:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    {
            	    // InternalRM.g:1558:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    // InternalRM.g:1559:5: lv_policyTypes_1_0= ruleEPolicyType
            	    {

            	    					newCompositeNode(grammarAccess.getEPolicyTypesAccess().getPolicyTypesEPolicyTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // InternalRM.g:1580:1: entryRuleEPolicyType returns [EObject current=null] : iv_ruleEPolicyType= ruleEPolicyType EOF ;
    public final EObject entryRuleEPolicyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyType = null;


        try {
            // InternalRM.g:1580:52: (iv_ruleEPolicyType= ruleEPolicyType EOF )
            // InternalRM.g:1581:2: iv_ruleEPolicyType= ruleEPolicyType EOF
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
    // InternalRM.g:1587:1: ruleEPolicyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_policy_2_0= ruleEPolicyTypeBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleEPolicyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_policy_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1593:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_policy_2_0= ruleEPolicyTypeBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:1594:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_policy_2_0= ruleEPolicyTypeBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:1594:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_policy_2_0= ruleEPolicyTypeBody ) ) otherlv_3= '}' )
            // InternalRM.g:1595:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_policy_2_0= ruleEPolicyTypeBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:1595:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1596:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1596:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1597:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getEPolicyTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:1617:3: ( (lv_policy_2_0= ruleEPolicyTypeBody ) )
            // InternalRM.g:1618:4: (lv_policy_2_0= ruleEPolicyTypeBody )
            {
            // InternalRM.g:1618:4: (lv_policy_2_0= ruleEPolicyTypeBody )
            // InternalRM.g:1619:5: lv_policy_2_0= ruleEPolicyTypeBody
            {

            					newCompositeNode(grammarAccess.getEPolicyTypeAccess().getPolicyEPolicyTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_policy_2_0=ruleEPolicyTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPolicyTypeRule());
            					}
            					set(
            						current,
            						"policy",
            						lv_policy_2_0,
            						"org.sodalite.dsl.RM.EPolicyTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEPolicyTypeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEPolicyTypeBody"
    // InternalRM.g:1644:1: entryRuleEPolicyTypeBody returns [EObject current=null] : iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF ;
    public final EObject entryRuleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypeBody = null;


        try {
            // InternalRM.g:1644:56: (iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF )
            // InternalRM.g:1645:2: iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF
            {
             newCompositeNode(grammarAccess.getEPolicyTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPolicyTypeBody=ruleEPolicyTypeBody();

            state._fsp--;

             current =iv_ruleEPolicyTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPolicyTypeBody"


    // $ANTLR start "ruleEPolicyTypeBody"
    // InternalRM.g:1651:1: ruleEPolicyTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;


        	enterRule();

        try {
            // InternalRM.g:1657:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:1658:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:1658:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRM.g:1659:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRM.g:1659:3: ()
            // InternalRM.g:1660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypeBodyAccess().getEPolicyTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:1666:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRM.g:1667:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRM.g:1667:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRM.g:1668:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:1671:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRM.g:1672:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRM.g:1672:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRM.g:1673:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1673:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:1674:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:1674:112: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:1675:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:1678:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:1678:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRM.g:1678:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:1678:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEPolicyTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:1682:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:1683:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:1683:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:1684:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEPolicyTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_23); 

            	    											newLeafNode(otherlv_3, grammarAccess.getEPolicyTypeBodyAccess().getSuperTypeEPolicyTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:1701:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1701:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:1702:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:1702:112: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:1703:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:1706:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:1706:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRM.g:1706:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:1706:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEPolicyTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:1710:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:1711:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:1711:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:1712:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getEPolicyTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEPolicyTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleEPolicyTypeBody"


    // $ANTLR start "entryRuleENodeTypes"
    // InternalRM.g:1745:1: entryRuleENodeTypes returns [EObject current=null] : iv_ruleENodeTypes= ruleENodeTypes EOF ;
    public final EObject entryRuleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypes = null;


        try {
            // InternalRM.g:1745:51: (iv_ruleENodeTypes= ruleENodeTypes EOF )
            // InternalRM.g:1746:2: iv_ruleENodeTypes= ruleENodeTypes EOF
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
    // InternalRM.g:1752:1: ruleENodeTypes returns [EObject current=null] : ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) ;
    public final EObject ruleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1758:2: ( ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) )
            // InternalRM.g:1759:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            {
            // InternalRM.g:1759:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            // InternalRM.g:1760:3: () ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            {
            // InternalRM.g:1760:3: ()
            // InternalRM.g:1761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypesAccess().getENodeTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1767:3: ( (lv_nodeTypes_1_0= ruleENodeType ) )+
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
            	    // InternalRM.g:1768:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    {
            	    // InternalRM.g:1768:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    // InternalRM.g:1769:5: lv_nodeTypes_1_0= ruleENodeType
            	    {

            	    					newCompositeNode(grammarAccess.getENodeTypesAccess().getNodeTypesENodeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
    // $ANTLR end "ruleENodeTypes"


    // $ANTLR start "entryRuleENodeType"
    // InternalRM.g:1790:1: entryRuleENodeType returns [EObject current=null] : iv_ruleENodeType= ruleENodeType EOF ;
    public final EObject entryRuleENodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeType = null;


        try {
            // InternalRM.g:1790:50: (iv_ruleENodeType= ruleENodeType EOF )
            // InternalRM.g:1791:2: iv_ruleENodeType= ruleENodeType EOF
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
    // InternalRM.g:1797:1: ruleENodeType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_node_2_0= ruleENodeTypeBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleENodeType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1803:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_node_2_0= ruleENodeTypeBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:1804:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_node_2_0= ruleENodeTypeBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:1804:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_node_2_0= ruleENodeTypeBody ) ) otherlv_3= '}' )
            // InternalRM.g:1805:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_node_2_0= ruleENodeTypeBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:1805:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1806:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1806:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1807:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getENodeTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:1827:3: ( (lv_node_2_0= ruleENodeTypeBody ) )
            // InternalRM.g:1828:4: (lv_node_2_0= ruleENodeTypeBody )
            {
            // InternalRM.g:1828:4: (lv_node_2_0= ruleENodeTypeBody )
            // InternalRM.g:1829:5: lv_node_2_0= ruleENodeTypeBody
            {

            					newCompositeNode(grammarAccess.getENodeTypeAccess().getNodeENodeTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_node_2_0=ruleENodeTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getENodeTypeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_2_0,
            						"org.sodalite.dsl.RM.ENodeTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getENodeTypeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleENodeTypeBody"
    // InternalRM.g:1854:1: entryRuleENodeTypeBody returns [EObject current=null] : iv_ruleENodeTypeBody= ruleENodeTypeBody EOF ;
    public final EObject entryRuleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypeBody = null;


        try {
            // InternalRM.g:1854:54: (iv_ruleENodeTypeBody= ruleENodeTypeBody EOF )
            // InternalRM.g:1855:2: iv_ruleENodeTypeBody= ruleENodeTypeBody EOF
            {
             newCompositeNode(grammarAccess.getENodeTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeTypeBody=ruleENodeTypeBody();

            state._fsp--;

             current =iv_ruleENodeTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeTypeBody"


    // $ANTLR start "ruleENodeTypeBody"
    // InternalRM.g:1861:1: ruleENodeTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleENodeTypeBody() throws RecognitionException {
        EObject current = null;

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
        EObject lv_properties_7_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_interfaces_13_0 = null;

        EObject lv_capabilities_16_0 = null;

        EObject lv_requirements_19_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1867:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:1868:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:1868:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )* ) ) ) )
            // InternalRM.g:1869:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )* ) ) )
            {
            // InternalRM.g:1869:3: ()
            // InternalRM.g:1870:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypeBodyAccess().getENodeTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:1876:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )* ) ) )
            // InternalRM.g:1877:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )* ) )
            {
            // InternalRM.g:1877:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )* ) )
            // InternalRM.g:1878:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:1881:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )* )
            // InternalRM.g:1882:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )*
            {
            // InternalRM.g:1882:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) ) )*
            loop15:
            do {
                int alt15=8;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt15=4;
                }
                else if ( LA15_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
                    alt15=5;
                }
                else if ( LA15_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
                    alt15=6;
                }
                else if ( LA15_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6) ) {
                    alt15=7;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRM.g:1883:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1883:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:1884:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:1884:110: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:1885:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:1888:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:1888:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:1888:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:1888:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getENodeTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:1892:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:1893:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:1893:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:1894:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_25); 

            	    											newLeafNode(otherlv_3, grammarAccess.getENodeTypeBodyAccess().getSuperTypeENodeTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:1911:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1911:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:1912:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:1912:110: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:1913:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:1916:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:1916:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:1916:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:1916:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getENodeTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:1920:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:1921:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:1921:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:1922:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getENodeTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:1944:4: ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalRM.g:1944:4: ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) )
            	    // InternalRM.g:1945:5: {...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:1945:110: ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) )
            	    // InternalRM.g:1946:6: ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:1949:9: ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) )
            	    // InternalRM.g:1949:10: {...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:1949:19: (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )
            	    // InternalRM.g:1949:20: otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getENodeTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    // InternalRM.g:1953:9: ( (lv_properties_7_0= ruleEProperties ) )
            	    // InternalRM.g:1954:10: (lv_properties_7_0= ruleEProperties )
            	    {
            	    // InternalRM.g:1954:10: (lv_properties_7_0= ruleEProperties )
            	    // InternalRM.g:1955:11: lv_properties_7_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_properties_7_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_7_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_8=(Token)match(input,16,FOLLOW_25); 

            	    									newLeafNode(otherlv_8, grammarAccess.getENodeTypeBodyAccess().getRightCurlyBracketKeyword_1_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:1982:4: ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalRM.g:1982:4: ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) )
            	    // InternalRM.g:1983:5: {...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:1983:110: ( ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) )
            	    // InternalRM.g:1984:6: ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:1987:9: ({...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) )
            	    // InternalRM.g:1987:10: {...}? => (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:1987:19: (otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )
            	    // InternalRM.g:1987:20: otherlv_9= 'attributes{' ( (lv_attributes_10_0= ruleEAttributes ) ) otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,30,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getENodeTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    // InternalRM.g:1991:9: ( (lv_attributes_10_0= ruleEAttributes ) )
            	    // InternalRM.g:1992:10: (lv_attributes_10_0= ruleEAttributes )
            	    {
            	    // InternalRM.g:1992:10: (lv_attributes_10_0= ruleEAttributes )
            	    // InternalRM.g:1993:11: lv_attributes_10_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getAttributesEAttributesParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_attributes_10_0=ruleEAttributes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"attributes",
            	    												lv_attributes_10_0,
            	    												"org.sodalite.dsl.RM.EAttributes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,16,FOLLOW_25); 

            	    									newLeafNode(otherlv_11, grammarAccess.getENodeTypeBodyAccess().getRightCurlyBracketKeyword_1_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRM.g:2020:4: ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalRM.g:2020:4: ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) )
            	    // InternalRM.g:2021:5: {...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRM.g:2021:110: ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) )
            	    // InternalRM.g:2022:6: ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRM.g:2025:9: ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) )
            	    // InternalRM.g:2025:10: {...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:2025:19: (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )
            	    // InternalRM.g:2025:20: otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}'
            	    {
            	    otherlv_12=(Token)match(input,33,FOLLOW_13); 

            	    									newLeafNode(otherlv_12, grammarAccess.getENodeTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    // InternalRM.g:2029:9: ( (lv_interfaces_13_0= ruleEInterfaces ) )
            	    // InternalRM.g:2030:10: (lv_interfaces_13_0= ruleEInterfaces )
            	    {
            	    // InternalRM.g:2030:10: (lv_interfaces_13_0= ruleEInterfaces )
            	    // InternalRM.g:2031:11: lv_interfaces_13_0= ruleEInterfaces
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getInterfacesEInterfacesParserRuleCall_1_4_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_interfaces_13_0=ruleEInterfaces();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"interfaces",
            	    												lv_interfaces_13_0,
            	    												"org.sodalite.dsl.RM.EInterfaces");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_14=(Token)match(input,16,FOLLOW_25); 

            	    									newLeafNode(otherlv_14, grammarAccess.getENodeTypeBodyAccess().getRightCurlyBracketKeyword_1_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRM.g:2058:4: ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) )
            	    {
            	    // InternalRM.g:2058:4: ({...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) ) )
            	    // InternalRM.g:2059:5: {...}? => ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRM.g:2059:110: ( ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) ) )
            	    // InternalRM.g:2060:6: ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRM.g:2063:9: ({...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' ) )
            	    // InternalRM.g:2063:10: {...}? => (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:2063:19: (otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}' )
            	    // InternalRM.g:2063:20: otherlv_15= 'capabilities{' ( (lv_capabilities_16_0= ruleECapabilities ) ) otherlv_17= '}'
            	    {
            	    otherlv_15=(Token)match(input,34,FOLLOW_13); 

            	    									newLeafNode(otherlv_15, grammarAccess.getENodeTypeBodyAccess().getCapabilitiesKeyword_1_5_0());
            	    								
            	    // InternalRM.g:2067:9: ( (lv_capabilities_16_0= ruleECapabilities ) )
            	    // InternalRM.g:2068:10: (lv_capabilities_16_0= ruleECapabilities )
            	    {
            	    // InternalRM.g:2068:10: (lv_capabilities_16_0= ruleECapabilities )
            	    // InternalRM.g:2069:11: lv_capabilities_16_0= ruleECapabilities
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getCapabilitiesECapabilitiesParserRuleCall_1_5_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_capabilities_16_0=ruleECapabilities();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"capabilities",
            	    												lv_capabilities_16_0,
            	    												"org.sodalite.dsl.RM.ECapabilities");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_17=(Token)match(input,16,FOLLOW_25); 

            	    									newLeafNode(otherlv_17, grammarAccess.getENodeTypeBodyAccess().getRightCurlyBracketKeyword_1_5_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRM.g:2096:4: ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) )
            	    {
            	    // InternalRM.g:2096:4: ({...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) ) )
            	    // InternalRM.g:2097:5: {...}? => ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalRM.g:2097:110: ( ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) ) )
            	    // InternalRM.g:2098:6: ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalRM.g:2101:9: ({...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' ) )
            	    // InternalRM.g:2101:10: {...}? => (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:2101:19: (otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}' )
            	    // InternalRM.g:2101:20: otherlv_18= 'requirements{' ( (lv_requirements_19_0= ruleERequirements ) ) otherlv_20= '}'
            	    {
            	    otherlv_18=(Token)match(input,35,FOLLOW_13); 

            	    									newLeafNode(otherlv_18, grammarAccess.getENodeTypeBodyAccess().getRequirementsKeyword_1_6_0());
            	    								
            	    // InternalRM.g:2105:9: ( (lv_requirements_19_0= ruleERequirements ) )
            	    // InternalRM.g:2106:10: (lv_requirements_19_0= ruleERequirements )
            	    {
            	    // InternalRM.g:2106:10: (lv_requirements_19_0= ruleERequirements )
            	    // InternalRM.g:2107:11: lv_requirements_19_0= ruleERequirements
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getRequirementsERequirementsParserRuleCall_1_6_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_requirements_19_0=ruleERequirements();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"requirements",
            	    												lv_requirements_19_0,
            	    												"org.sodalite.dsl.RM.ERequirements");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_20=(Token)match(input,16,FOLLOW_25); 

            	    									newLeafNode(otherlv_20, grammarAccess.getENodeTypeBodyAccess().getRightCurlyBracketKeyword_1_6_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleENodeTypeBody"


    // $ANTLR start "entryRuleERelationshipTypes"
    // InternalRM.g:2145:1: entryRuleERelationshipTypes returns [EObject current=null] : iv_ruleERelationshipTypes= ruleERelationshipTypes EOF ;
    public final EObject entryRuleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypes = null;


        try {
            // InternalRM.g:2145:59: (iv_ruleERelationshipTypes= ruleERelationshipTypes EOF )
            // InternalRM.g:2146:2: iv_ruleERelationshipTypes= ruleERelationshipTypes EOF
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
    // InternalRM.g:2152:1: ruleERelationshipTypes returns [EObject current=null] : ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) ;
    public final EObject ruleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_relationshipTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2158:2: ( ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) )
            // InternalRM.g:2159:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            {
            // InternalRM.g:2159:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            // InternalRM.g:2160:3: () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            {
            // InternalRM.g:2160:3: ()
            // InternalRM.g:2161:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypesAccess().getERelationshipTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:2167:3: ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_QUALIFIED_NAME) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRM.g:2168:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    {
            	    // InternalRM.g:2168:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    // InternalRM.g:2169:5: lv_relationshipTypes_1_0= ruleERelationshipType
            	    {

            	    					newCompositeNode(grammarAccess.getERelationshipTypesAccess().getRelationshipTypesERelationshipTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // InternalRM.g:2190:1: entryRuleERelationshipType returns [EObject current=null] : iv_ruleERelationshipType= ruleERelationshipType EOF ;
    public final EObject entryRuleERelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipType = null;


        try {
            // InternalRM.g:2190:58: (iv_ruleERelationshipType= ruleERelationshipType EOF )
            // InternalRM.g:2191:2: iv_ruleERelationshipType= ruleERelationshipType EOF
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
    // InternalRM.g:2197:1: ruleERelationshipType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_relationship_2_0= ruleERelationshipTypeBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleERelationshipType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_relationship_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2203:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_relationship_2_0= ruleERelationshipTypeBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:2204:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_relationship_2_0= ruleERelationshipTypeBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:2204:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_relationship_2_0= ruleERelationshipTypeBody ) ) otherlv_3= '}' )
            // InternalRM.g:2205:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= '{' ( (lv_relationship_2_0= ruleERelationshipTypeBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:2205:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:2206:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:2206:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:2207:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getERelationshipTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:2227:3: ( (lv_relationship_2_0= ruleERelationshipTypeBody ) )
            // InternalRM.g:2228:4: (lv_relationship_2_0= ruleERelationshipTypeBody )
            {
            // InternalRM.g:2228:4: (lv_relationship_2_0= ruleERelationshipTypeBody )
            // InternalRM.g:2229:5: lv_relationship_2_0= ruleERelationshipTypeBody
            {

            					newCompositeNode(grammarAccess.getERelationshipTypeAccess().getRelationshipERelationshipTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_relationship_2_0=ruleERelationshipTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERelationshipTypeRule());
            					}
            					set(
            						current,
            						"relationship",
            						lv_relationship_2_0,
            						"org.sodalite.dsl.RM.ERelationshipTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getERelationshipTypeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleERelationshipTypeBody"
    // InternalRM.g:2254:1: entryRuleERelationshipTypeBody returns [EObject current=null] : iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF ;
    public final EObject entryRuleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypeBody = null;


        try {
            // InternalRM.g:2254:62: (iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF )
            // InternalRM.g:2255:2: iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF
            {
             newCompositeNode(grammarAccess.getERelationshipTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERelationshipTypeBody=ruleERelationshipTypeBody();

            state._fsp--;

             current =iv_ruleERelationshipTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERelationshipTypeBody"


    // $ANTLR start "ruleERelationshipTypeBody"
    // InternalRM.g:2261:1: ruleERelationshipTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

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
        EObject lv_properties_7_0 = null;

        EObject lv_atributes_10_0 = null;

        EObject lv_interfaces_13_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2267:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:2268:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:2268:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRM.g:2269:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRM.g:2269:3: ()
            // InternalRM.g:2270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypeBodyAccess().getERelationshipTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:2276:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRM.g:2277:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRM.g:2277:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRM.g:2278:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:2281:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRM.g:2282:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRM.g:2282:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) ) )*
            loop17:
            do {
                int alt17=7;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt17=4;
                }
                else if ( LA17_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
                    alt17=5;
                }
                else if ( LA17_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
                    alt17=6;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRM.g:2283:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2283:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:2284:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:2284:118: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:2285:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:2288:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:2288:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2288:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:2288:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_6); 

            	    									newLeafNode(otherlv_2, grammarAccess.getERelationshipTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:2292:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:2293:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:2293:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:2294:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_27); 

            	    											newLeafNode(otherlv_3, grammarAccess.getERelationshipTypeBodyAccess().getSuperTypeERelationshipTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:2311:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2311:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:2312:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:2312:118: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:2313:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:2316:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:2316:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2316:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:2316:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getERelationshipTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:2320:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:2321:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:2321:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:2322:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getERelationshipTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:2344:4: ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalRM.g:2344:4: ({...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) ) )
            	    // InternalRM.g:2345:5: {...}? => ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:2345:118: ( ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) ) )
            	    // InternalRM.g:2346:6: ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:2349:9: ({...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' ) )
            	    // InternalRM.g:2349:10: {...}? => (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2349:19: (otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}' )
            	    // InternalRM.g:2349:20: otherlv_6= 'properties{' ( (lv_properties_7_0= ruleEProperties ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_13); 

            	    									newLeafNode(otherlv_6, grammarAccess.getERelationshipTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    // InternalRM.g:2353:9: ( (lv_properties_7_0= ruleEProperties ) )
            	    // InternalRM.g:2354:10: (lv_properties_7_0= ruleEProperties )
            	    {
            	    // InternalRM.g:2354:10: (lv_properties_7_0= ruleEProperties )
            	    // InternalRM.g:2355:11: lv_properties_7_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_properties_7_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_7_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_8=(Token)match(input,16,FOLLOW_27); 

            	    									newLeafNode(otherlv_8, grammarAccess.getERelationshipTypeBodyAccess().getRightCurlyBracketKeyword_1_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:2382:4: ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalRM.g:2382:4: ({...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) ) )
            	    // InternalRM.g:2383:5: {...}? => ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:2383:118: ( ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) ) )
            	    // InternalRM.g:2384:6: ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:2387:9: ({...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' ) )
            	    // InternalRM.g:2387:10: {...}? => (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2387:19: (otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}' )
            	    // InternalRM.g:2387:20: otherlv_9= 'attributes{' ( (lv_atributes_10_0= ruleEAttributes ) ) otherlv_11= '}'
            	    {
            	    otherlv_9=(Token)match(input,30,FOLLOW_13); 

            	    									newLeafNode(otherlv_9, grammarAccess.getERelationshipTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    // InternalRM.g:2391:9: ( (lv_atributes_10_0= ruleEAttributes ) )
            	    // InternalRM.g:2392:10: (lv_atributes_10_0= ruleEAttributes )
            	    {
            	    // InternalRM.g:2392:10: (lv_atributes_10_0= ruleEAttributes )
            	    // InternalRM.g:2393:11: lv_atributes_10_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getAtributesEAttributesParserRuleCall_1_3_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_atributes_10_0=ruleEAttributes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"atributes",
            	    												lv_atributes_10_0,
            	    												"org.sodalite.dsl.RM.EAttributes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_11=(Token)match(input,16,FOLLOW_27); 

            	    									newLeafNode(otherlv_11, grammarAccess.getERelationshipTypeBodyAccess().getRightCurlyBracketKeyword_1_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRM.g:2420:4: ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) )
            	    {
            	    // InternalRM.g:2420:4: ({...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) ) )
            	    // InternalRM.g:2421:5: {...}? => ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRM.g:2421:118: ( ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) ) )
            	    // InternalRM.g:2422:6: ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRM.g:2425:9: ({...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' ) )
            	    // InternalRM.g:2425:10: {...}? => (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2425:19: (otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}' )
            	    // InternalRM.g:2425:20: otherlv_12= 'interfaces{' ( (lv_interfaces_13_0= ruleEInterfaces ) ) otherlv_14= '}'
            	    {
            	    otherlv_12=(Token)match(input,33,FOLLOW_13); 

            	    									newLeafNode(otherlv_12, grammarAccess.getERelationshipTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    // InternalRM.g:2429:9: ( (lv_interfaces_13_0= ruleEInterfaces ) )
            	    // InternalRM.g:2430:10: (lv_interfaces_13_0= ruleEInterfaces )
            	    {
            	    // InternalRM.g:2430:10: (lv_interfaces_13_0= ruleEInterfaces )
            	    // InternalRM.g:2431:11: lv_interfaces_13_0= ruleEInterfaces
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getInterfacesEInterfacesParserRuleCall_1_4_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_interfaces_13_0=ruleEInterfaces();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"interfaces",
            	    												lv_interfaces_13_0,
            	    												"org.sodalite.dsl.RM.EInterfaces");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_14=(Token)match(input,16,FOLLOW_27); 

            	    									newLeafNode(otherlv_14, grammarAccess.getERelationshipTypeBodyAccess().getRightCurlyBracketKeyword_1_4_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRM.g:2458:4: ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2458:4: ({...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:2459:5: {...}? => ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRM.g:2459:118: ( ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:2460:6: ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRM.g:2463:9: ({...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:2463:10: {...}? => (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2463:19: (otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) ) )
            	    // InternalRM.g:2463:20: otherlv_15= 'valid_target_types:' ( (lv_valid_target_types_16_0= RULE_STRING ) )
            	    {
            	    otherlv_15=(Token)match(input,36,FOLLOW_11); 

            	    									newLeafNode(otherlv_15, grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesKeyword_1_5_0());
            	    								
            	    // InternalRM.g:2467:9: ( (lv_valid_target_types_16_0= RULE_STRING ) )
            	    // InternalRM.g:2468:10: (lv_valid_target_types_16_0= RULE_STRING )
            	    {
            	    // InternalRM.g:2468:10: (lv_valid_target_types_16_0= RULE_STRING )
            	    // InternalRM.g:2469:11: lv_valid_target_types_16_0= RULE_STRING
            	    {
            	    lv_valid_target_types_16_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            	    											newLeafNode(lv_valid_target_types_16_0, grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesSTRINGTerminalRuleCall_1_5_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"valid_target_types",
            	    												lv_valid_target_types_16_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleERelationshipTypeBody"


    // $ANTLR start "entryRuleEProperties"
    // InternalRM.g:2502:1: entryRuleEProperties returns [EObject current=null] : iv_ruleEProperties= ruleEProperties EOF ;
    public final EObject entryRuleEProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProperties = null;


        try {
            // InternalRM.g:2502:52: (iv_ruleEProperties= ruleEProperties EOF )
            // InternalRM.g:2503:2: iv_ruleEProperties= ruleEProperties EOF
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
    // InternalRM.g:2509:1: ruleEProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) ;
    public final EObject ruleEProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2515:2: ( ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) )
            // InternalRM.g:2516:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            {
            // InternalRM.g:2516:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            // InternalRM.g:2517:3: () ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            {
            // InternalRM.g:2517:3: ()
            // InternalRM.g:2518:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPropertiesAccess().getEPropertiesAction_0(),
            					current);
            			

            }

            // InternalRM.g:2524:3: ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRM.g:2525:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    {
            	    // InternalRM.g:2525:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    // InternalRM.g:2526:5: lv_properties_1_0= ruleEPropertyDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEPropertiesAccess().getPropertiesEPropertyDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop18;
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
    // InternalRM.g:2547:1: entryRuleEPropertyDefinition returns [EObject current=null] : iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF ;
    public final EObject entryRuleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinition = null;


        try {
            // InternalRM.g:2547:60: (iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF )
            // InternalRM.g:2548:2: iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF
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
    // InternalRM.g:2554:1: ruleEPropertyDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_property_2_0= ruleEPropertyDefinitionBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_property_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2560:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_property_2_0= ruleEPropertyDefinitionBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:2561:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_property_2_0= ruleEPropertyDefinitionBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:2561:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_property_2_0= ruleEPropertyDefinitionBody ) ) otherlv_3= '}' )
            // InternalRM.g:2562:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_property_2_0= ruleEPropertyDefinitionBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:2562:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:2563:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:2563:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:2564:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEPropertyDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPropertyDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getEPropertyDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:2584:3: ( (lv_property_2_0= ruleEPropertyDefinitionBody ) )
            // InternalRM.g:2585:4: (lv_property_2_0= ruleEPropertyDefinitionBody )
            {
            // InternalRM.g:2585:4: (lv_property_2_0= ruleEPropertyDefinitionBody )
            // InternalRM.g:2586:5: lv_property_2_0= ruleEPropertyDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEPropertyDefinitionAccess().getPropertyEPropertyDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_property_2_0=ruleEPropertyDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPropertyDefinitionRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_2_0,
            						"org.sodalite.dsl.RM.EPropertyDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEPropertyDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEPropertyDefinitionBody"
    // InternalRM.g:2611:1: entryRuleEPropertyDefinitionBody returns [EObject current=null] : iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF ;
    public final EObject entryRuleEPropertyDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinitionBody = null;


        try {
            // InternalRM.g:2611:64: (iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF )
            // InternalRM.g:2612:2: iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEPropertyDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPropertyDefinitionBody=ruleEPropertyDefinitionBody();

            state._fsp--;

             current =iv_ruleEPropertyDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPropertyDefinitionBody"


    // $ANTLR start "ruleEPropertyDefinitionBody"
    // InternalRM.g:2618:1: ruleEPropertyDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEPropertyDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_required_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_status_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_default_8_0 = null;

        EObject lv_constraints_12_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2624:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:2625:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:2625:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:2626:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:2626:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRM.g:2627:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:2630:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRM.g:2631:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRM.g:2631:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=8;
                int LA19_0 = input.LA(1);

                if ( LA19_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt19=1;
                }
                else if ( LA19_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt19=2;
                }
                else if ( LA19_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt19=3;
                }
                else if ( LA19_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt19=4;
                }
                else if ( LA19_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt19=5;
                }
                else if ( LA19_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
                    alt19=6;
                }
                else if ( LA19_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
                    alt19=7;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRM.g:2632:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2632:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:2633:4: {...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:2633:117: ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:2634:5: ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:2637:8: ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:2637:9: {...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2637:18: (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:2637:19: otherlv_1= 'type:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPropertyDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRM.g:2641:8: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:2642:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:2642:9: ( ruleEDataTypeName )
            	    // InternalRM.g:2643:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getTypeEDataTypeCrossReference_0_1_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:2663:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2663:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:2664:4: {...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:2664:117: ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:2665:5: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:2668:8: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:2668:9: {...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2668:18: (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRM.g:2668:19: otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_11); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPropertyDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRM.g:2672:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRM.g:2673:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRM.g:2673:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRM.g:2674:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            	    										newLeafNode(lv_description_4_0, grammarAccess.getEPropertyDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:2696:3: ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2696:3: ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalRM.g:2697:4: {...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:2697:117: ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalRM.g:2698:5: ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:2701:8: ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalRM.g:2701:9: {...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2701:18: (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    // InternalRM.g:2701:19: otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,38,FOLLOW_31); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPropertyDefinitionBodyAccess().getRequiredKeyword_2_0());
            	    							
            	    // InternalRM.g:2705:8: ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    // InternalRM.g:2706:9: (lv_required_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalRM.g:2706:9: (lv_required_6_0= RULE_BOOLEAN )
            	    // InternalRM.g:2707:10: lv_required_6_0= RULE_BOOLEAN
            	    {
            	    lv_required_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_30); 

            	    										newLeafNode(lv_required_6_0, grammarAccess.getEPropertyDefinitionBodyAccess().getRequiredBOOLEANTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"required",
            	    											lv_required_6_0,
            	    											"org.sodalite.dsl.RM.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:2729:3: ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2729:3: ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRM.g:2730:4: {...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRM.g:2730:117: ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRM.g:2731:5: ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRM.g:2734:8: ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    // InternalRM.g:2734:9: {...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2734:18: (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    // InternalRM.g:2734:19: otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,39,FOLLOW_32); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultKeyword_3_0());
            	    							
            	    // InternalRM.g:2738:8: ( (lv_default_8_0= ruleEValueExpression ) )
            	    // InternalRM.g:2739:9: (lv_default_8_0= ruleEValueExpression )
            	    {
            	    // InternalRM.g:2739:9: (lv_default_8_0= ruleEValueExpression )
            	    // InternalRM.g:2740:10: lv_default_8_0= ruleEValueExpression
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    lv_default_8_0=ruleEValueExpression();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"default",
            	    											lv_default_8_0,
            	    											"org.sodalite.dsl.RM.EValueExpression");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRM.g:2763:3: ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2763:3: ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:2764:4: {...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRM.g:2764:117: ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:2765:5: ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRM.g:2768:8: ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:2768:9: {...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2768:18: (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) )
            	    // InternalRM.g:2768:19: otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_11); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPropertyDefinitionBodyAccess().getStatusKeyword_4_0());
            	    							
            	    // InternalRM.g:2772:8: ( (lv_status_10_0= RULE_STRING ) )
            	    // InternalRM.g:2773:9: (lv_status_10_0= RULE_STRING )
            	    {
            	    // InternalRM.g:2773:9: (lv_status_10_0= RULE_STRING )
            	    // InternalRM.g:2774:10: lv_status_10_0= RULE_STRING
            	    {
            	    lv_status_10_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            	    										newLeafNode(lv_status_10_0, grammarAccess.getEPropertyDefinitionBodyAccess().getStatusSTRINGTerminalRuleCall_4_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"status",
            	    											lv_status_10_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRM.g:2796:3: ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) )
            	    {
            	    // InternalRM.g:2796:3: ({...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) ) )
            	    // InternalRM.g:2797:4: {...}? => ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRM.g:2797:117: ( ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) ) )
            	    // InternalRM.g:2798:5: ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRM.g:2801:8: ({...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' ) )
            	    // InternalRM.g:2801:9: {...}? => (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2801:18: (otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}' )
            	    // InternalRM.g:2801:19: otherlv_11= 'constraints{' ( (lv_constraints_12_0= ruleEConstraints ) ) otherlv_13= '}'
            	    {
            	    otherlv_11=(Token)match(input,26,FOLLOW_12); 

            	    								newLeafNode(otherlv_11, grammarAccess.getEPropertyDefinitionBodyAccess().getConstraintsKeyword_5_0());
            	    							
            	    // InternalRM.g:2805:8: ( (lv_constraints_12_0= ruleEConstraints ) )
            	    // InternalRM.g:2806:9: (lv_constraints_12_0= ruleEConstraints )
            	    {
            	    // InternalRM.g:2806:9: (lv_constraints_12_0= ruleEConstraints )
            	    // InternalRM.g:2807:10: lv_constraints_12_0= ruleEConstraints
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getConstraintsEConstraintsParserRuleCall_5_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_constraints_12_0=ruleEConstraints();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"constraints",
            	    											lv_constraints_12_0,
            	    											"org.sodalite.dsl.RM.EConstraints");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_13=(Token)match(input,16,FOLLOW_30); 

            	    								newLeafNode(otherlv_13, grammarAccess.getEPropertyDefinitionBodyAccess().getRightCurlyBracketKeyword_5_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRM.g:2834:3: ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2834:3: ({...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:2835:4: {...}? => ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRM.g:2835:117: ( ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:2836:5: ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRM.g:2839:8: ({...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:2839:9: {...}? => (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2839:18: (otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:2839:19: otherlv_14= 'entry_schema:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_14=(Token)match(input,41,FOLLOW_3); 

            	    								newLeafNode(otherlv_14, grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaKeyword_6_0());
            	    							
            	    // InternalRM.g:2843:8: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:2844:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:2844:9: ( ruleEDataTypeName )
            	    // InternalRM.g:2845:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaEDataTypeCrossReference_6_1_0());
            	    									
            	    pushFollow(FOLLOW_30);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPropertyDefinitionBody"


    // $ANTLR start "entryRuleEAttributes"
    // InternalRM.g:2876:1: entryRuleEAttributes returns [EObject current=null] : iv_ruleEAttributes= ruleEAttributes EOF ;
    public final EObject entryRuleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributes = null;


        try {
            // InternalRM.g:2876:52: (iv_ruleEAttributes= ruleEAttributes EOF )
            // InternalRM.g:2877:2: iv_ruleEAttributes= ruleEAttributes EOF
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
    // InternalRM.g:2883:1: ruleEAttributes returns [EObject current=null] : ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) ;
    public final EObject ruleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2889:2: ( ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) )
            // InternalRM.g:2890:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            {
            // InternalRM.g:2890:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            // InternalRM.g:2891:3: () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            {
            // InternalRM.g:2891:3: ()
            // InternalRM.g:2892:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributesAccess().getEAttributesAction_0(),
            					current);
            			

            }

            // InternalRM.g:2898:3: ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRM.g:2899:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    {
            	    // InternalRM.g:2899:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    // InternalRM.g:2900:5: lv_attributes_1_0= ruleEAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEAttributesAccess().getAttributesEAttributeDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop20;
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
    // InternalRM.g:2921:1: entryRuleEAttributeDefinition returns [EObject current=null] : iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF ;
    public final EObject entryRuleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinition = null;


        try {
            // InternalRM.g:2921:61: (iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF )
            // InternalRM.g:2922:2: iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF
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
    // InternalRM.g:2928:1: ruleEAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2934:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:2935:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:2935:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) ) otherlv_3= '}' )
            // InternalRM.g:2936:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:2936:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:2937:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:2937:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:2938:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEAttributeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getEAttributeDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:2958:3: ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) )
            // InternalRM.g:2959:4: (lv_attribute_2_0= ruleEAttributeDefinitionBody )
            {
            // InternalRM.g:2959:4: (lv_attribute_2_0= ruleEAttributeDefinitionBody )
            // InternalRM.g:2960:5: lv_attribute_2_0= ruleEAttributeDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEAttributeDefinitionAccess().getAttributeEAttributeDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_attribute_2_0=ruleEAttributeDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"org.sodalite.dsl.RM.EAttributeDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEAttributeDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEAttributeDefinitionBody"
    // InternalRM.g:2985:1: entryRuleEAttributeDefinitionBody returns [EObject current=null] : iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF ;
    public final EObject entryRuleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinitionBody = null;


        try {
            // InternalRM.g:2985:65: (iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF )
            // InternalRM.g:2986:2: iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEAttributeDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttributeDefinitionBody=ruleEAttributeDefinitionBody();

            state._fsp--;

             current =iv_ruleEAttributeDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAttributeDefinitionBody"


    // $ANTLR start "ruleEAttributeDefinitionBody"
    // InternalRM.g:2992:1: ruleEAttributeDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRM.g:2998:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:2999:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:2999:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:3000:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:3000:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRM.g:3001:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:3004:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRM.g:3005:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRM.g:3005:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=4;
                int LA21_0 = input.LA(1);

                if ( LA21_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt21=3;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRM.g:3006:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3006:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:3007:4: {...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:3007:118: ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:3008:5: ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:3011:8: ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:3011:9: {...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3011:18: (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:3011:19: otherlv_1= 'type:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAttributeDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRM.g:3015:8: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:3016:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:3016:9: ( ruleEDataTypeName )
            	    // InternalRM.g:3017:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getTypeEDataTypeCrossReference_0_1_0());
            	    									
            	    pushFollow(FOLLOW_34);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:3037:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3037:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:3038:4: {...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:3038:118: ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:3039:5: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:3042:8: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:3042:9: {...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3042:18: (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRM.g:3042:19: otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_11); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAttributeDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRM.g:3046:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRM.g:3047:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRM.g:3047:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRM.g:3048:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    										newLeafNode(lv_description_4_0, grammarAccess.getEAttributeDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:3070:3: ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3070:3: ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:3071:4: {...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:3071:118: ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:3072:5: ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:3075:8: ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:3075:9: {...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3075:18: (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:3075:19: otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_5=(Token)match(input,41,FOLLOW_3); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaKeyword_2_0());
            	    							
            	    // InternalRM.g:3079:8: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:3080:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:3080:9: ( ruleEDataTypeName )
            	    // InternalRM.g:3081:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaEDataTypeCrossReference_2_1_0());
            	    									
            	    pushFollow(FOLLOW_34);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAttributeDefinitionBody"


    // $ANTLR start "entryRuleEInterfaces"
    // InternalRM.g:3112:1: entryRuleEInterfaces returns [EObject current=null] : iv_ruleEInterfaces= ruleEInterfaces EOF ;
    public final EObject entryRuleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaces = null;


        try {
            // InternalRM.g:3112:52: (iv_ruleEInterfaces= ruleEInterfaces EOF )
            // InternalRM.g:3113:2: iv_ruleEInterfaces= ruleEInterfaces EOF
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
    // InternalRM.g:3119:1: ruleEInterfaces returns [EObject current=null] : ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) ;
    public final EObject ruleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaces_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3125:2: ( ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) )
            // InternalRM.g:3126:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            {
            // InternalRM.g:3126:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            // InternalRM.g:3127:3: () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            {
            // InternalRM.g:3127:3: ()
            // InternalRM.g:3128:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfacesAccess().getEInterfacesAction_0(),
            					current);
            			

            }

            // InternalRM.g:3134:3: ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRM.g:3135:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    {
            	    // InternalRM.g:3135:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    // InternalRM.g:3136:5: lv_interfaces_1_0= ruleEInterfaceDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInterfacesAccess().getInterfacesEInterfaceDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop22;
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
    // InternalRM.g:3157:1: entryRuleEInterfaceDefinition returns [EObject current=null] : iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF ;
    public final EObject entryRuleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinition = null;


        try {
            // InternalRM.g:3157:61: (iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF )
            // InternalRM.g:3158:2: iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF
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
    // InternalRM.g:3164:1: ruleEInterfaceDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_interface_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3170:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:3171:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:3171:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) ) otherlv_3= '}' )
            // InternalRM.g:3172:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:3172:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:3173:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:3173:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:3174:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEInterfaceDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInterfaceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getEInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:3194:3: ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) )
            // InternalRM.g:3195:4: (lv_interface_2_0= ruleEInterfaceDefinitionBody )
            {
            // InternalRM.g:3195:4: (lv_interface_2_0= ruleEInterfaceDefinitionBody )
            // InternalRM.g:3196:5: lv_interface_2_0= ruleEInterfaceDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEInterfaceDefinitionAccess().getInterfaceEInterfaceDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_interface_2_0=ruleEInterfaceDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionRule());
            					}
            					set(
            						current,
            						"interface",
            						lv_interface_2_0,
            						"org.sodalite.dsl.RM.EInterfaceDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEInterfaceDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEInterfaceDefinitionBody"
    // InternalRM.g:3221:1: entryRuleEInterfaceDefinitionBody returns [EObject current=null] : iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF ;
    public final EObject entryRuleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinitionBody = null;


        try {
            // InternalRM.g:3221:65: (iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF )
            // InternalRM.g:3222:2: iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaceDefinitionBody=ruleEInterfaceDefinitionBody();

            state._fsp--;

             current =iv_ruleEInterfaceDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaceDefinitionBody"


    // $ANTLR start "ruleEInterfaceDefinitionBody"
    // InternalRM.g:3228:1: ruleEInterfaceDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_inputs_4_0 = null;

        EObject lv_operations_7_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3234:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:3235:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:3235:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:3236:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:3236:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            // InternalRM.g:3237:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:3240:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            // InternalRM.g:3241:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) ) )+ {...}?
            {
            // InternalRM.g:3241:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=4;
                int LA23_0 = input.LA(1);

                if ( LA23_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt23=1;
                }
                else if ( LA23_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt23=2;
                }
                else if ( LA23_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt23=3;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRM.g:3242:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3242:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:3243:4: {...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:3243:118: ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:3244:5: ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:3247:8: ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:3247:9: {...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3247:18: (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:3247:19: otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEInterfaceDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRM.g:3251:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:3252:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:3252:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:3253:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_36); 

            	    										newLeafNode(otherlv_2, grammarAccess.getEInterfaceDefinitionBodyAccess().getTypeEInterfaceTypeCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:3270:3: ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) )
            	    {
            	    // InternalRM.g:3270:3: ({...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) ) )
            	    // InternalRM.g:3271:4: {...}? => ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:3271:118: ( ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) ) )
            	    // InternalRM.g:3272:5: ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:3275:8: ({...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' ) )
            	    // InternalRM.g:3275:9: {...}? => (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3275:18: (otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}' )
            	    // InternalRM.g:3275:19: otherlv_3= 'inputs{' ( (lv_inputs_4_0= ruleEProperties ) ) otherlv_5= '}'
            	    {
            	    otherlv_3=(Token)match(input,31,FOLLOW_13); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEInterfaceDefinitionBodyAccess().getInputsKeyword_1_0());
            	    							
            	    // InternalRM.g:3279:8: ( (lv_inputs_4_0= ruleEProperties ) )
            	    // InternalRM.g:3280:9: (lv_inputs_4_0= ruleEProperties )
            	    {
            	    // InternalRM.g:3280:9: (lv_inputs_4_0= ruleEProperties )
            	    // InternalRM.g:3281:10: lv_inputs_4_0= ruleEProperties
            	    {

            	    										newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyAccess().getInputsEPropertiesParserRuleCall_1_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_inputs_4_0=ruleEProperties();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"inputs",
            	    											lv_inputs_4_0,
            	    											"org.sodalite.dsl.RM.EProperties");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_5=(Token)match(input,16,FOLLOW_36); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEInterfaceDefinitionBodyAccess().getRightCurlyBracketKeyword_1_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:3308:3: ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalRM.g:3308:3: ({...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) ) )
            	    // InternalRM.g:3309:4: {...}? => ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:3309:118: ( ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) ) )
            	    // InternalRM.g:3310:5: ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:3313:8: ({...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' ) )
            	    // InternalRM.g:3313:9: {...}? => (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3313:18: (otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}' )
            	    // InternalRM.g:3313:19: otherlv_6= 'operations{' ( (lv_operations_7_0= ruleEOperations ) ) otherlv_8= '}'
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_13); 

            	    								newLeafNode(otherlv_6, grammarAccess.getEInterfaceDefinitionBodyAccess().getOperationsKeyword_2_0());
            	    							
            	    // InternalRM.g:3317:8: ( (lv_operations_7_0= ruleEOperations ) )
            	    // InternalRM.g:3318:9: (lv_operations_7_0= ruleEOperations )
            	    {
            	    // InternalRM.g:3318:9: (lv_operations_7_0= ruleEOperations )
            	    // InternalRM.g:3319:10: lv_operations_7_0= ruleEOperations
            	    {

            	    										newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyAccess().getOperationsEOperationsParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_operations_7_0=ruleEOperations();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"operations",
            	    											lv_operations_7_0,
            	    											"org.sodalite.dsl.RM.EOperations");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_8=(Token)match(input,16,FOLLOW_36); 

            	    								newLeafNode(otherlv_8, grammarAccess.getEInterfaceDefinitionBodyAccess().getRightCurlyBracketKeyword_2_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInterfaceDefinitionBody"


    // $ANTLR start "entryRuleEOperations"
    // InternalRM.g:3357:1: entryRuleEOperations returns [EObject current=null] : iv_ruleEOperations= ruleEOperations EOF ;
    public final EObject entryRuleEOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperations = null;


        try {
            // InternalRM.g:3357:52: (iv_ruleEOperations= ruleEOperations EOF )
            // InternalRM.g:3358:2: iv_ruleEOperations= ruleEOperations EOF
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
    // InternalRM.g:3364:1: ruleEOperations returns [EObject current=null] : ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) ;
    public final EObject ruleEOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3370:2: ( ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) )
            // InternalRM.g:3371:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            {
            // InternalRM.g:3371:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            // InternalRM.g:3372:3: () ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            {
            // InternalRM.g:3372:3: ()
            // InternalRM.g:3373:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationsAccess().getEOperationsAction_0(),
            					current);
            			

            }

            // InternalRM.g:3379:3: ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRM.g:3380:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    {
            	    // InternalRM.g:3380:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    // InternalRM.g:3381:5: lv_operations_1_0= ruleEOperationDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEOperationsAccess().getOperationsEOperationDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop24;
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
    // InternalRM.g:3402:1: entryRuleEOperationDefinition returns [EObject current=null] : iv_ruleEOperationDefinition= ruleEOperationDefinition EOF ;
    public final EObject entryRuleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinition = null;


        try {
            // InternalRM.g:3402:61: (iv_ruleEOperationDefinition= ruleEOperationDefinition EOF )
            // InternalRM.g:3403:2: iv_ruleEOperationDefinition= ruleEOperationDefinition EOF
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
    // InternalRM.g:3409:1: ruleEOperationDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operation_2_0= ruleEOperationDefinitionBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operation_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3415:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operation_2_0= ruleEOperationDefinitionBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:3416:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operation_2_0= ruleEOperationDefinitionBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:3416:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operation_2_0= ruleEOperationDefinitionBody ) ) otherlv_3= '}' )
            // InternalRM.g:3417:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_operation_2_0= ruleEOperationDefinitionBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:3417:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:3418:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:3418:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:3419:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEOperationDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEOperationDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:3439:3: ( (lv_operation_2_0= ruleEOperationDefinitionBody ) )
            // InternalRM.g:3440:4: (lv_operation_2_0= ruleEOperationDefinitionBody )
            {
            // InternalRM.g:3440:4: (lv_operation_2_0= ruleEOperationDefinitionBody )
            // InternalRM.g:3441:5: lv_operation_2_0= ruleEOperationDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEOperationDefinitionAccess().getOperationEOperationDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_operation_2_0=ruleEOperationDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOperationDefinitionRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_2_0,
            						"org.sodalite.dsl.RM.EOperationDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEOperationDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEOperationDefinitionBody"
    // InternalRM.g:3466:1: entryRuleEOperationDefinitionBody returns [EObject current=null] : iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF ;
    public final EObject entryRuleEOperationDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinitionBody = null;


        try {
            // InternalRM.g:3466:65: (iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF )
            // InternalRM.g:3467:2: iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEOperationDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperationDefinitionBody=ruleEOperationDefinitionBody();

            state._fsp--;

             current =iv_ruleEOperationDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOperationDefinitionBody"


    // $ANTLR start "ruleEOperationDefinitionBody"
    // InternalRM.g:3473:1: ruleEOperationDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEOperationDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_implementation_8_0=null;
        EObject lv_inputs_5_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3479:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:3480:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:3480:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRM.g:3481:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRM.g:3481:3: ()
            // InternalRM.g:3482:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationDefinitionBodyAccess().getEOperationDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:3488:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRM.g:3489:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRM.g:3489:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRM.g:3490:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:3493:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRM.g:3494:6: ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRM.g:3494:6: ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) ) )*
            loop25:
            do {
                int alt25=4;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt25=3;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRM.g:3495:4: ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3495:4: ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:3496:5: {...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:3496:121: ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:3497:6: ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:3500:9: ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:3500:10: {...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3500:19: (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) )
            	    // InternalRM.g:3500:20: otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEOperationDefinitionBodyAccess().getDescriptionKeyword_1_0_0());
            	    								
            	    // InternalRM.g:3504:9: ( (lv_description_3_0= RULE_STRING ) )
            	    // InternalRM.g:3505:10: (lv_description_3_0= RULE_STRING )
            	    {
            	    // InternalRM.g:3505:10: (lv_description_3_0= RULE_STRING )
            	    // InternalRM.g:3506:11: lv_description_3_0= RULE_STRING
            	    {
            	    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            	    											newLeafNode(lv_description_3_0, grammarAccess.getEOperationDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEOperationDefinitionBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_3_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:3528:4: ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) )
            	    {
            	    // InternalRM.g:3528:4: ({...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) ) )
            	    // InternalRM.g:3529:5: {...}? => ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:3529:121: ( ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) ) )
            	    // InternalRM.g:3530:6: ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:3533:9: ({...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' ) )
            	    // InternalRM.g:3533:10: {...}? => (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3533:19: (otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}' )
            	    // InternalRM.g:3533:20: otherlv_4= 'inputs{' ( (lv_inputs_5_0= ruleEInputs ) ) otherlv_6= '}'
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_13); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEOperationDefinitionBodyAccess().getInputsKeyword_1_1_0());
            	    								
            	    // InternalRM.g:3537:9: ( (lv_inputs_5_0= ruleEInputs ) )
            	    // InternalRM.g:3538:10: (lv_inputs_5_0= ruleEInputs )
            	    {
            	    // InternalRM.g:3538:10: (lv_inputs_5_0= ruleEInputs )
            	    // InternalRM.g:3539:11: lv_inputs_5_0= ruleEInputs
            	    {

            	    											newCompositeNode(grammarAccess.getEOperationDefinitionBodyAccess().getInputsEInputsParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_inputs_5_0=ruleEInputs();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEOperationDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inputs",
            	    												lv_inputs_5_0,
            	    												"org.sodalite.dsl.RM.EInputs");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_6=(Token)match(input,16,FOLLOW_38); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEOperationDefinitionBodyAccess().getRightCurlyBracketKeyword_1_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:3566:4: ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3566:4: ({...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:3567:5: {...}? => ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:3567:121: ( ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:3568:6: ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:3571:9: ({...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:3571:10: {...}? => (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3571:19: (otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) ) )
            	    // InternalRM.g:3571:20: otherlv_7= 'implementation:' ( (lv_implementation_8_0= RULE_STRING ) )
            	    {
            	    otherlv_7=(Token)match(input,42,FOLLOW_11); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEOperationDefinitionBodyAccess().getImplementationKeyword_1_2_0());
            	    								
            	    // InternalRM.g:3575:9: ( (lv_implementation_8_0= RULE_STRING ) )
            	    // InternalRM.g:3576:10: (lv_implementation_8_0= RULE_STRING )
            	    {
            	    // InternalRM.g:3576:10: (lv_implementation_8_0= RULE_STRING )
            	    // InternalRM.g:3577:11: lv_implementation_8_0= RULE_STRING
            	    {
            	    lv_implementation_8_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            	    											newLeafNode(lv_implementation_8_0, grammarAccess.getEOperationDefinitionBodyAccess().getImplementationSTRINGTerminalRuleCall_1_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEOperationDefinitionBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"implementation",
            	    												lv_implementation_8_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleEOperationDefinitionBody"


    // $ANTLR start "entryRuleEInputs"
    // InternalRM.g:3610:1: entryRuleEInputs returns [EObject current=null] : iv_ruleEInputs= ruleEInputs EOF ;
    public final EObject entryRuleEInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputs = null;


        try {
            // InternalRM.g:3610:48: (iv_ruleEInputs= ruleEInputs EOF )
            // InternalRM.g:3611:2: iv_ruleEInputs= ruleEInputs EOF
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
    // InternalRM.g:3617:1: ruleEInputs returns [EObject current=null] : ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) ;
    public final EObject ruleEInputs() throws RecognitionException {
        EObject current = null;

        EObject lv_inputs_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3623:2: ( ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) )
            // InternalRM.g:3624:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            {
            // InternalRM.g:3624:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            // InternalRM.g:3625:3: () ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            {
            // InternalRM.g:3625:3: ()
            // InternalRM.g:3626:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInputsAccess().getEInputsAction_0(),
            					current);
            			

            }

            // InternalRM.g:3632:3: ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRM.g:3633:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    {
            	    // InternalRM.g:3633:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    // InternalRM.g:3634:5: lv_inputs_1_0= ruleEParameterDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInputsAccess().getInputsEParameterDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop26;
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
    // InternalRM.g:3655:1: entryRuleEParameterDefinition returns [EObject current=null] : iv_ruleEParameterDefinition= ruleEParameterDefinition EOF ;
    public final EObject entryRuleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinition = null;


        try {
            // InternalRM.g:3655:61: (iv_ruleEParameterDefinition= ruleEParameterDefinition EOF )
            // InternalRM.g:3656:2: iv_ruleEParameterDefinition= ruleEParameterDefinition EOF
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
    // InternalRM.g:3662:1: ruleEParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameter_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3668:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:3669:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:3669:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) ) otherlv_3= '}' )
            // InternalRM.g:3670:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:3670:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:3671:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:3671:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:3672:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEParameterDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEParameterDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:3692:3: ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) )
            // InternalRM.g:3693:4: (lv_parameter_2_0= ruleEParameterDefinitionBody )
            {
            // InternalRM.g:3693:4: (lv_parameter_2_0= ruleEParameterDefinitionBody )
            // InternalRM.g:3694:5: lv_parameter_2_0= ruleEParameterDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEParameterDefinitionAccess().getParameterEParameterDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_parameter_2_0=ruleEParameterDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterDefinitionRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_2_0,
            						"org.sodalite.dsl.RM.EParameterDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEParameterDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEParameterDefinitionBody"
    // InternalRM.g:3719:1: entryRuleEParameterDefinitionBody returns [EObject current=null] : iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF ;
    public final EObject entryRuleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinitionBody = null;


        try {
            // InternalRM.g:3719:65: (iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF )
            // InternalRM.g:3720:2: iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEParameterDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameterDefinitionBody=ruleEParameterDefinitionBody();

            state._fsp--;

             current =iv_ruleEParameterDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEParameterDefinitionBody"


    // $ANTLR start "ruleEParameterDefinitionBody"
    // InternalRM.g:3726:1: ruleEParameterDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3732:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:3733:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:3733:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            // InternalRM.g:3734:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            {
            // InternalRM.g:3734:3: ()
            // InternalRM.g:3735:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterDefinitionBodyAccess().getEParameterDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:3741:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            // InternalRM.g:3742:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            {
            // InternalRM.g:3742:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            // InternalRM.g:3743:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:3746:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )* )
            // InternalRM.g:3747:6: ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )*
            {
            // InternalRM.g:3747:6: ( ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) ) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRM.g:3748:4: ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3748:4: ({...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRM.g:3749:5: {...}? => ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:3749:121: ( ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRM.g:3750:6: ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:3753:9: ({...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) ) )
            	    // InternalRM.g:3753:10: {...}? => (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3753:19: (otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) ) )
            	    // InternalRM.g:3753:20: otherlv_2= 'value:' ( (lv_value_3_0= ruleEValueExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,43,FOLLOW_32); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEParameterDefinitionBodyAccess().getValueKeyword_1_0_0());
            	    								
            	    // InternalRM.g:3757:9: ( (lv_value_3_0= ruleEValueExpression ) )
            	    // InternalRM.g:3758:10: (lv_value_3_0= ruleEValueExpression )
            	    {
            	    // InternalRM.g:3758:10: (lv_value_3_0= ruleEValueExpression )
            	    // InternalRM.g:3759:11: lv_value_3_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getValueEValueExpressionParserRuleCall_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_40);
            	    lv_value_3_0=ruleEValueExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEParameterDefinitionBodyRule());
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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:3782:4: ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3782:4: ({...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRM.g:3783:5: {...}? => ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:3783:121: ( ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRM.g:3784:6: ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:3787:9: ({...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) ) )
            	    // InternalRM.g:3787:10: {...}? => (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3787:19: (otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) ) )
            	    // InternalRM.g:3787:20: otherlv_4= 'default:' ( (lv_default_5_0= ruleEValueExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,39,FOLLOW_32); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEParameterDefinitionBodyAccess().getDefaultKeyword_1_1_0());
            	    								
            	    // InternalRM.g:3791:9: ( (lv_default_5_0= ruleEValueExpression ) )
            	    // InternalRM.g:3792:10: (lv_default_5_0= ruleEValueExpression )
            	    {
            	    // InternalRM.g:3792:10: (lv_default_5_0= ruleEValueExpression )
            	    // InternalRM.g:3793:11: lv_default_5_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_40);
            	    lv_default_5_0=ruleEValueExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEParameterDefinitionBodyRule());
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


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleEParameterDefinitionBody"


    // $ANTLR start "entryRuleEValueExpression"
    // InternalRM.g:3827:1: entryRuleEValueExpression returns [EObject current=null] : iv_ruleEValueExpression= ruleEValueExpression EOF ;
    public final EObject entryRuleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueExpression = null;


        try {
            // InternalRM.g:3827:57: (iv_ruleEValueExpression= ruleEValueExpression EOF )
            // InternalRM.g:3828:2: iv_ruleEValueExpression= ruleEValueExpression EOF
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
    // InternalRM.g:3834:1: ruleEValueExpression returns [EObject current=null] : ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction ) ;
    public final EObject ruleEValueExpression() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        EObject this_EFunction_2 = null;



        	enterRule();

        try {
            // InternalRM.g:3840:2: ( ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction ) )
            // InternalRM.g:3841:2: ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction )
            {
            // InternalRM.g:3841:2: ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            else if ( (LA28_0==44||LA28_0==48) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalRM.g:3842:3: ( () this_STRING_1= RULE_STRING )
                    {
                    // InternalRM.g:3842:3: ( () this_STRING_1= RULE_STRING )
                    // InternalRM.g:3843:4: () this_STRING_1= RULE_STRING
                    {
                    // InternalRM.g:3843:4: ()
                    // InternalRM.g:3844:5: 
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
                    // InternalRM.g:3856:3: this_EFunction_2= ruleEFunction
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
    // InternalRM.g:3868:1: entryRuleEFunction returns [EObject current=null] : iv_ruleEFunction= ruleEFunction EOF ;
    public final EObject entryRuleEFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunction = null;


        try {
            // InternalRM.g:3868:50: (iv_ruleEFunction= ruleEFunction EOF )
            // InternalRM.g:3869:2: iv_ruleEFunction= ruleEFunction EOF
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
    // InternalRM.g:3875:1: ruleEFunction returns [EObject current=null] : (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute ) ;
    public final EObject ruleEFunction() throws RecognitionException {
        EObject current = null;

        EObject this_GetProperty_0 = null;

        EObject this_GetAttribute_1 = null;



        	enterRule();

        try {
            // InternalRM.g:3881:2: ( (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute ) )
            // InternalRM.g:3882:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute )
            {
            // InternalRM.g:3882:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            else if ( (LA29_0==44) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalRM.g:3883:3: this_GetProperty_0= ruleGetProperty
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
                    // InternalRM.g:3892:3: this_GetAttribute_1= ruleGetAttribute
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
    // InternalRM.g:3904:1: entryRuleGetAttribute returns [EObject current=null] : iv_ruleGetAttribute= ruleGetAttribute EOF ;
    public final EObject entryRuleGetAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttribute = null;


        try {
            // InternalRM.g:3904:53: (iv_ruleGetAttribute= ruleGetAttribute EOF )
            // InternalRM.g:3905:2: iv_ruleGetAttribute= ruleGetAttribute EOF
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
    // InternalRM.g:3911:1: ruleGetAttribute returns [EObject current=null] : (otherlv_0= 'get_attribute{' ( (lv_attribute_1_0= ruleGetAttributeBody ) ) otherlv_2= '}' ) ;
    public final EObject ruleGetAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_attribute_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3917:2: ( (otherlv_0= 'get_attribute{' ( (lv_attribute_1_0= ruleGetAttributeBody ) ) otherlv_2= '}' ) )
            // InternalRM.g:3918:2: (otherlv_0= 'get_attribute{' ( (lv_attribute_1_0= ruleGetAttributeBody ) ) otherlv_2= '}' )
            {
            // InternalRM.g:3918:2: (otherlv_0= 'get_attribute{' ( (lv_attribute_1_0= ruleGetAttributeBody ) ) otherlv_2= '}' )
            // InternalRM.g:3919:3: otherlv_0= 'get_attribute{' ( (lv_attribute_1_0= ruleGetAttributeBody ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getGetAttributeAccess().getGet_attributeKeyword_0());
            		
            // InternalRM.g:3923:3: ( (lv_attribute_1_0= ruleGetAttributeBody ) )
            // InternalRM.g:3924:4: (lv_attribute_1_0= ruleGetAttributeBody )
            {
            // InternalRM.g:3924:4: (lv_attribute_1_0= ruleGetAttributeBody )
            // InternalRM.g:3925:5: lv_attribute_1_0= ruleGetAttributeBody
            {

            					newCompositeNode(grammarAccess.getGetAttributeAccess().getAttributeGetAttributeBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_attribute_1_0=ruleGetAttributeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetAttributeRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_1_0,
            						"org.sodalite.dsl.RM.GetAttributeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGetAttributeAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleGetAttributeBody"
    // InternalRM.g:3950:1: entryRuleGetAttributeBody returns [EObject current=null] : iv_ruleGetAttributeBody= ruleGetAttributeBody EOF ;
    public final EObject entryRuleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttributeBody = null;


        try {
            // InternalRM.g:3950:57: (iv_ruleGetAttributeBody= ruleGetAttributeBody EOF )
            // InternalRM.g:3951:2: iv_ruleGetAttributeBody= ruleGetAttributeBody EOF
            {
             newCompositeNode(grammarAccess.getGetAttributeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetAttributeBody=ruleGetAttributeBody();

            state._fsp--;

             current =iv_ruleGetAttributeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetAttributeBody"


    // $ANTLR start "ruleGetAttributeBody"
    // InternalRM.g:3957:1: ruleGetAttributeBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_entity_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRM.g:3963:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:3964:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:3964:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:3965:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:3965:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            // InternalRM.g:3966:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:3969:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            // InternalRM.g:3970:5: ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?
            {
            // InternalRM.g:3970:5: ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=4;
                int LA30_0 = input.LA(1);

                if ( LA30_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
                    alt30=3;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRM.g:3971:3: ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3971:3: ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:3972:4: {...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:3972:110: ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:3973:5: ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:3976:8: ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:3976:9: {...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRM.g:3976:18: (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:3976:19: otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,45,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetAttributeBodyAccess().getAttributeKeyword_0_0());
            	    							
            	    // InternalRM.g:3980:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:3981:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:3981:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:3982:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_42); 

            	    										newLeafNode(otherlv_2, grammarAccess.getGetAttributeBodyAccess().getAttributeEAttributeDefinitionCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:3999:3: ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3999:3: ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    // InternalRM.g:4000:4: {...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:4000:110: ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    // InternalRM.g:4001:5: ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:4004:8: ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    // InternalRM.g:4004:9: {...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRM.g:4004:18: (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    // InternalRM.g:4004:19: otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_43); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetAttributeBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRM.g:4008:8: ( (lv_entity_4_0= RULE_ENTITY ) )
            	    // InternalRM.g:4009:9: (lv_entity_4_0= RULE_ENTITY )
            	    {
            	    // InternalRM.g:4009:9: (lv_entity_4_0= RULE_ENTITY )
            	    // InternalRM.g:4010:10: lv_entity_4_0= RULE_ENTITY
            	    {
            	    lv_entity_4_0=(Token)match(input,RULE_ENTITY,FOLLOW_42); 

            	    										newLeafNode(lv_entity_4_0, grammarAccess.getGetAttributeBodyAccess().getEntityENTITYTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"entity",
            	    											lv_entity_4_0,
            	    											"org.sodalite.dsl.RM.ENTITY");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:4032:3: ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4032:3: ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4033:4: {...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:4033:110: ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4034:5: ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:4037:8: ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4037:9: {...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRM.g:4037:18: (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4037:19: otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,47,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetAttributeBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRM.g:4041:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4042:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4042:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4043:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_42); 

            	    										newLeafNode(otherlv_6, grammarAccess.getGetAttributeBodyAccess().getReq_capEReqOrCapCrossReference_2_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            	    				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetAttributeBody"


    // $ANTLR start "entryRuleGetProperty"
    // InternalRM.g:4071:1: entryRuleGetProperty returns [EObject current=null] : iv_ruleGetProperty= ruleGetProperty EOF ;
    public final EObject entryRuleGetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetProperty = null;


        try {
            // InternalRM.g:4071:52: (iv_ruleGetProperty= ruleGetProperty EOF )
            // InternalRM.g:4072:2: iv_ruleGetProperty= ruleGetProperty EOF
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
    // InternalRM.g:4078:1: ruleGetProperty returns [EObject current=null] : (otherlv_0= 'get_property{' ( (lv_property_1_0= ruleGetPropertyBody ) ) otherlv_2= '}' ) ;
    public final EObject ruleGetProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_property_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4084:2: ( (otherlv_0= 'get_property{' ( (lv_property_1_0= ruleGetPropertyBody ) ) otherlv_2= '}' ) )
            // InternalRM.g:4085:2: (otherlv_0= 'get_property{' ( (lv_property_1_0= ruleGetPropertyBody ) ) otherlv_2= '}' )
            {
            // InternalRM.g:4085:2: (otherlv_0= 'get_property{' ( (lv_property_1_0= ruleGetPropertyBody ) ) otherlv_2= '}' )
            // InternalRM.g:4086:3: otherlv_0= 'get_property{' ( (lv_property_1_0= ruleGetPropertyBody ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getGetPropertyAccess().getGet_propertyKeyword_0());
            		
            // InternalRM.g:4090:3: ( (lv_property_1_0= ruleGetPropertyBody ) )
            // InternalRM.g:4091:4: (lv_property_1_0= ruleGetPropertyBody )
            {
            // InternalRM.g:4091:4: (lv_property_1_0= ruleGetPropertyBody )
            // InternalRM.g:4092:5: lv_property_1_0= ruleGetPropertyBody
            {

            					newCompositeNode(grammarAccess.getGetPropertyAccess().getPropertyGetPropertyBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_property_1_0=ruleGetPropertyBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetPropertyRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_1_0,
            						"org.sodalite.dsl.RM.GetPropertyBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGetPropertyAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleGetPropertyBody"
    // InternalRM.g:4117:1: entryRuleGetPropertyBody returns [EObject current=null] : iv_ruleGetPropertyBody= ruleGetPropertyBody EOF ;
    public final EObject entryRuleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetPropertyBody = null;


        try {
            // InternalRM.g:4117:56: (iv_ruleGetPropertyBody= ruleGetPropertyBody EOF )
            // InternalRM.g:4118:2: iv_ruleGetPropertyBody= ruleGetPropertyBody EOF
            {
             newCompositeNode(grammarAccess.getGetPropertyBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetPropertyBody=ruleGetPropertyBody();

            state._fsp--;

             current =iv_ruleGetPropertyBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetPropertyBody"


    // $ANTLR start "ruleGetPropertyBody"
    // InternalRM.g:4124:1: ruleGetPropertyBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_entity_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRM.g:4130:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:4131:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:4131:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:4132:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:4132:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            // InternalRM.g:4133:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:4136:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            // InternalRM.g:4137:5: ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?
            {
            // InternalRM.g:4137:5: ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=4;
                int LA31_0 = input.LA(1);

                if ( LA31_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
                    alt31=2;
                }
                else if ( LA31_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
                    alt31=3;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRM.g:4138:3: ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4138:3: ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4139:4: {...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:4139:109: ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4140:5: ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:4143:8: ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4143:9: {...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRM.g:4143:18: (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4143:19: otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,49,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetPropertyBodyAccess().getPropertyKeyword_0_0());
            	    							
            	    // InternalRM.g:4147:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4148:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4148:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4149:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_45); 

            	    										newLeafNode(otherlv_2, grammarAccess.getGetPropertyBodyAccess().getPropertyEPropertyDefinitionCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:4166:3: ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4166:3: ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    // InternalRM.g:4167:4: {...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:4167:109: ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    // InternalRM.g:4168:5: ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:4171:8: ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    // InternalRM.g:4171:9: {...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRM.g:4171:18: (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    // InternalRM.g:4171:19: otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_43); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetPropertyBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRM.g:4175:8: ( (lv_entity_4_0= RULE_ENTITY ) )
            	    // InternalRM.g:4176:9: (lv_entity_4_0= RULE_ENTITY )
            	    {
            	    // InternalRM.g:4176:9: (lv_entity_4_0= RULE_ENTITY )
            	    // InternalRM.g:4177:10: lv_entity_4_0= RULE_ENTITY
            	    {
            	    lv_entity_4_0=(Token)match(input,RULE_ENTITY,FOLLOW_45); 

            	    										newLeafNode(lv_entity_4_0, grammarAccess.getGetPropertyBodyAccess().getEntityENTITYTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"entity",
            	    											lv_entity_4_0,
            	    											"org.sodalite.dsl.RM.ENTITY");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:4199:3: ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4199:3: ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4200:4: {...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:4200:109: ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4201:5: ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:4204:8: ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4204:9: {...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRM.g:4204:18: (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4204:19: otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,47,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetPropertyBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRM.g:4208:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4209:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4209:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4210:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_45); 

            	    										newLeafNode(otherlv_6, grammarAccess.getGetPropertyBodyAccess().getReq_capEReqOrCapCrossReference_2_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetPropertyBody"


    // $ANTLR start "entryRuleECapabilities"
    // InternalRM.g:4238:1: entryRuleECapabilities returns [EObject current=null] : iv_ruleECapabilities= ruleECapabilities EOF ;
    public final EObject entryRuleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilities = null;


        try {
            // InternalRM.g:4238:54: (iv_ruleECapabilities= ruleECapabilities EOF )
            // InternalRM.g:4239:2: iv_ruleECapabilities= ruleECapabilities EOF
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
    // InternalRM.g:4245:1: ruleECapabilities returns [EObject current=null] : ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) ;
    public final EObject ruleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilities_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4251:2: ( ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) )
            // InternalRM.g:4252:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            {
            // InternalRM.g:4252:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            // InternalRM.g:4253:3: () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            {
            // InternalRM.g:4253:3: ()
            // InternalRM.g:4254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilitiesAccess().getECapabilitiesAction_0(),
            					current);
            			

            }

            // InternalRM.g:4260:3: ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRM.g:4261:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    {
            	    // InternalRM.g:4261:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    // InternalRM.g:4262:5: lv_capabilities_1_0= ruleECapabilityDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilitiesAccess().getCapabilitiesECapabilityDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop32;
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
    // InternalRM.g:4283:1: entryRuleECapabilityDefinition returns [EObject current=null] : iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF ;
    public final EObject entryRuleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinition = null;


        try {
            // InternalRM.g:4283:62: (iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF )
            // InternalRM.g:4284:2: iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF
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
    // InternalRM.g:4290:1: ruleECapabilityDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_capability_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4296:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:4297:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:4297:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) ) otherlv_3= '}' )
            // InternalRM.g:4298:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:4298:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:4299:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:4299:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:4300:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getECapabilityDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getECapabilityDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getECapabilityDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:4320:3: ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) )
            // InternalRM.g:4321:4: (lv_capability_2_0= ruleECapabilityDefinitionBody )
            {
            // InternalRM.g:4321:4: (lv_capability_2_0= ruleECapabilityDefinitionBody )
            // InternalRM.g:4322:5: lv_capability_2_0= ruleECapabilityDefinitionBody
            {

            					newCompositeNode(grammarAccess.getECapabilityDefinitionAccess().getCapabilityECapabilityDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_capability_2_0=ruleECapabilityDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getECapabilityDefinitionRule());
            					}
            					set(
            						current,
            						"capability",
            						lv_capability_2_0,
            						"org.sodalite.dsl.RM.ECapabilityDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getECapabilityDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleECapabilityDefinitionBody"
    // InternalRM.g:4347:1: entryRuleECapabilityDefinitionBody returns [EObject current=null] : iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF ;
    public final EObject entryRuleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinitionBody = null;


        try {
            // InternalRM.g:4347:66: (iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF )
            // InternalRM.g:4348:2: iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getECapabilityDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityDefinitionBody=ruleECapabilityDefinitionBody();

            state._fsp--;

             current =iv_ruleECapabilityDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityDefinitionBody"


    // $ANTLR start "ruleECapabilityDefinitionBody"
    // InternalRM.g:4354:1: ruleECapabilityDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_start_11_0=null;
        Token otherlv_12=null;
        Token lv_end_13_0=null;
        Token otherlv_14=null;
        EObject lv_valid_source_types_7_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4360:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:4361:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:4361:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:4362:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:4362:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) ) )+ {...}?) )
            // InternalRM.g:4363:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:4366:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) ) )+ {...}?)
            // InternalRM.g:4367:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) ) )+ {...}?
            {
            // InternalRM.g:4367:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) ) )+
            int cnt34=0;
            loop34:
            do {
                int alt34=5;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt34=2;
                }
                else if ( LA34_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt34=3;
                }
                else if ( LA34_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt34=4;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalRM.g:4368:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4368:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4369:4: {...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:4369:119: ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4370:5: ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:4373:8: ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4373:9: {...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4373:18: (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4373:19: otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getECapabilityDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRM.g:4377:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4378:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4378:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4379:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_47); 

            	    										newLeafNode(otherlv_2, grammarAccess.getECapabilityDefinitionBodyAccess().getTypeECapabilityTypeCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:4396:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4396:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:4397:4: {...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:4397:119: ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:4398:5: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:4401:8: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:4401:9: {...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4401:18: (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRM.g:4401:19: otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_11); 

            	    								newLeafNode(otherlv_3, grammarAccess.getECapabilityDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRM.g:4405:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRM.g:4406:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRM.g:4406:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRM.g:4407:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_47); 

            	    										newLeafNode(lv_description_4_0, grammarAccess.getECapabilityDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:4429:3: ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) )
            	    {
            	    // InternalRM.g:4429:3: ({...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) ) )
            	    // InternalRM.g:4430:4: {...}? => ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:4430:119: ( ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) ) )
            	    // InternalRM.g:4431:5: ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:4434:8: ({...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' ) )
            	    // InternalRM.g:4434:9: {...}? => (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4434:18: (otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']' )
            	    // InternalRM.g:4434:19: otherlv_5= 'valid_source_types:' otherlv_6= '[' ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )? otherlv_8= ']'
            	    {
            	    otherlv_5=(Token)match(input,50,FOLLOW_48); 

            	    								newLeafNode(otherlv_5, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_2_0());
            	    							
            	    otherlv_6=(Token)match(input,51,FOLLOW_49); 

            	    								newLeafNode(otherlv_6, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_2_1());
            	    							
            	    // InternalRM.g:4442:8: ( (lv_valid_source_types_7_0= ruleEValidSourceType ) )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==RULE_QUALIFIED_NAME) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalRM.g:4443:9: (lv_valid_source_types_7_0= ruleEValidSourceType )
            	            {
            	            // InternalRM.g:4443:9: (lv_valid_source_types_7_0= ruleEValidSourceType )
            	            // InternalRM.g:4444:10: lv_valid_source_types_7_0= ruleEValidSourceType
            	            {

            	            										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesEValidSourceTypeParserRuleCall_2_2_0());
            	            									
            	            pushFollow(FOLLOW_50);
            	            lv_valid_source_types_7_0=ruleEValidSourceType();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	            										}
            	            										add(
            	            											current,
            	            											"valid_source_types",
            	            											lv_valid_source_types_7_0,
            	            											"org.sodalite.dsl.RM.EValidSourceType");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_8=(Token)match(input,52,FOLLOW_47); 

            	    								newLeafNode(otherlv_8, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:4471:3: ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) )
            	    {
            	    // InternalRM.g:4471:3: ({...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) ) )
            	    // InternalRM.g:4472:4: {...}? => ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRM.g:4472:119: ( ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) ) )
            	    // InternalRM.g:4473:5: ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRM.g:4476:8: ({...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' ) )
            	    // InternalRM.g:4476:9: {...}? => (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4476:18: (otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']' )
            	    // InternalRM.g:4476:19: otherlv_9= 'occurrences:' otherlv_10= '[' ( (lv_start_11_0= RULE_STRING ) ) otherlv_12= ',' ( (lv_end_13_0= RULE_STRING ) ) otherlv_14= ']'
            	    {
            	    otherlv_9=(Token)match(input,53,FOLLOW_48); 

            	    								newLeafNode(otherlv_9, grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrencesKeyword_3_0());
            	    							
            	    otherlv_10=(Token)match(input,51,FOLLOW_11); 

            	    								newLeafNode(otherlv_10, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_3_1());
            	    							
            	    // InternalRM.g:4484:8: ( (lv_start_11_0= RULE_STRING ) )
            	    // InternalRM.g:4485:9: (lv_start_11_0= RULE_STRING )
            	    {
            	    // InternalRM.g:4485:9: (lv_start_11_0= RULE_STRING )
            	    // InternalRM.g:4486:10: lv_start_11_0= RULE_STRING
            	    {
            	    lv_start_11_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

            	    										newLeafNode(lv_start_11_0, grammarAccess.getECapabilityDefinitionBodyAccess().getStartSTRINGTerminalRuleCall_3_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"start",
            	    											lv_start_11_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,54,FOLLOW_11); 

            	    								newLeafNode(otherlv_12, grammarAccess.getECapabilityDefinitionBodyAccess().getCommaKeyword_3_3());
            	    							
            	    // InternalRM.g:4506:8: ( (lv_end_13_0= RULE_STRING ) )
            	    // InternalRM.g:4507:9: (lv_end_13_0= RULE_STRING )
            	    {
            	    // InternalRM.g:4507:9: (lv_end_13_0= RULE_STRING )
            	    // InternalRM.g:4508:10: lv_end_13_0= RULE_STRING
            	    {
            	    lv_end_13_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

            	    										newLeafNode(lv_end_13_0, grammarAccess.getECapabilityDefinitionBodyAccess().getEndSTRINGTerminalRuleCall_3_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"end",
            	    											lv_end_13_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_14=(Token)match(input,52,FOLLOW_47); 

            	    								newLeafNode(otherlv_14, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_3_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt34 >= 1 ) break loop34;
                        EarlyExitException eee =
                            new EarlyExitException(34, input);
                        throw eee;
                }
                cnt34++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityDefinitionBody"


    // $ANTLR start "entryRuleEValidSourceType"
    // InternalRM.g:4545:1: entryRuleEValidSourceType returns [EObject current=null] : iv_ruleEValidSourceType= ruleEValidSourceType EOF ;
    public final EObject entryRuleEValidSourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidSourceType = null;


        try {
            // InternalRM.g:4545:57: (iv_ruleEValidSourceType= ruleEValidSourceType EOF )
            // InternalRM.g:4546:2: iv_ruleEValidSourceType= ruleEValidSourceType EOF
            {
             newCompositeNode(grammarAccess.getEValidSourceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValidSourceType=ruleEValidSourceType();

            state._fsp--;

             current =iv_ruleEValidSourceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEValidSourceType"


    // $ANTLR start "ruleEValidSourceType"
    // InternalRM.g:4552:1: ruleEValidSourceType returns [EObject current=null] : ( ( (lv_sourceTypes_0_0= ruleETypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleETypeRef ) ) )* ) ;
    public final EObject ruleEValidSourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sourceTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4558:2: ( ( ( (lv_sourceTypes_0_0= ruleETypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleETypeRef ) ) )* ) )
            // InternalRM.g:4559:2: ( ( (lv_sourceTypes_0_0= ruleETypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleETypeRef ) ) )* )
            {
            // InternalRM.g:4559:2: ( ( (lv_sourceTypes_0_0= ruleETypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleETypeRef ) ) )* )
            // InternalRM.g:4560:3: ( (lv_sourceTypes_0_0= ruleETypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleETypeRef ) ) )*
            {
            // InternalRM.g:4560:3: ( (lv_sourceTypes_0_0= ruleETypeRef ) )
            // InternalRM.g:4561:4: (lv_sourceTypes_0_0= ruleETypeRef )
            {
            // InternalRM.g:4561:4: (lv_sourceTypes_0_0= ruleETypeRef )
            // InternalRM.g:4562:5: lv_sourceTypes_0_0= ruleETypeRef
            {

            					newCompositeNode(grammarAccess.getEValidSourceTypeAccess().getSourceTypesETypeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_52);
            lv_sourceTypes_0_0=ruleETypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEValidSourceTypeRule());
            					}
            					add(
            						current,
            						"sourceTypes",
            						lv_sourceTypes_0_0,
            						"org.sodalite.dsl.RM.ETypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRM.g:4579:3: (otherlv_1= ',' ( (lv_sourceType_2_0= ruleETypeRef ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==54) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRM.g:4580:4: otherlv_1= ',' ( (lv_sourceType_2_0= ruleETypeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,54,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidSourceTypeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRM.g:4584:4: ( (lv_sourceType_2_0= ruleETypeRef ) )
            	    // InternalRM.g:4585:5: (lv_sourceType_2_0= ruleETypeRef )
            	    {
            	    // InternalRM.g:4585:5: (lv_sourceType_2_0= ruleETypeRef )
            	    // InternalRM.g:4586:6: lv_sourceType_2_0= ruleETypeRef
            	    {

            	    						newCompositeNode(grammarAccess.getEValidSourceTypeAccess().getSourceTypeETypeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_sourceType_2_0=ruleETypeRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEValidSourceTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sourceType",
            	    							lv_sourceType_2_0,
            	    							"org.sodalite.dsl.RM.ETypeRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleEValidSourceType"


    // $ANTLR start "entryRuleETypeRef"
    // InternalRM.g:4608:1: entryRuleETypeRef returns [EObject current=null] : iv_ruleETypeRef= ruleETypeRef EOF ;
    public final EObject entryRuleETypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETypeRef = null;


        try {
            // InternalRM.g:4608:49: (iv_ruleETypeRef= ruleETypeRef EOF )
            // InternalRM.g:4609:2: iv_ruleETypeRef= ruleETypeRef EOF
            {
             newCompositeNode(grammarAccess.getETypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleETypeRef=ruleETypeRef();

            state._fsp--;

             current =iv_ruleETypeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleETypeRef"


    // $ANTLR start "ruleETypeRef"
    // InternalRM.g:4615:1: ruleETypeRef returns [EObject current=null] : ( (otherlv_0= RULE_QUALIFIED_NAME ) ) ;
    public final EObject ruleETypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRM.g:4621:2: ( ( (otherlv_0= RULE_QUALIFIED_NAME ) ) )
            // InternalRM.g:4622:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalRM.g:4622:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:4623:3: (otherlv_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:4623:3: (otherlv_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:4624:4: otherlv_0= RULE_QUALIFIED_NAME
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getETypeRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getETypeRefAccess().getNameENodeTypeCrossReference_0());
            			

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
    // $ANTLR end "ruleETypeRef"


    // $ANTLR start "entryRuleERequirements"
    // InternalRM.g:4638:1: entryRuleERequirements returns [EObject current=null] : iv_ruleERequirements= ruleERequirements EOF ;
    public final EObject entryRuleERequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirements = null;


        try {
            // InternalRM.g:4638:54: (iv_ruleERequirements= ruleERequirements EOF )
            // InternalRM.g:4639:2: iv_ruleERequirements= ruleERequirements EOF
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
    // InternalRM.g:4645:1: ruleERequirements returns [EObject current=null] : ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) ;
    public final EObject ruleERequirements() throws RecognitionException {
        EObject current = null;

        EObject lv_requirements_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4651:2: ( ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) )
            // InternalRM.g:4652:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            {
            // InternalRM.g:4652:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            // InternalRM.g:4653:3: () ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            {
            // InternalRM.g:4653:3: ()
            // InternalRM.g:4654:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequirementsAccess().getERequirementsAction_0(),
            					current);
            			

            }

            // InternalRM.g:4660:3: ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRM.g:4661:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    {
            	    // InternalRM.g:4661:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    // InternalRM.g:4662:5: lv_requirements_1_0= ruleERequirementDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getERequirementsAccess().getRequirementsERequirementDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_28);
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
            	    break loop36;
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
    // InternalRM.g:4683:1: entryRuleERequirementDefinition returns [EObject current=null] : iv_ruleERequirementDefinition= ruleERequirementDefinition EOF ;
    public final EObject entryRuleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinition = null;


        try {
            // InternalRM.g:4683:63: (iv_ruleERequirementDefinition= ruleERequirementDefinition EOF )
            // InternalRM.g:4684:2: iv_ruleERequirementDefinition= ruleERequirementDefinition EOF
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
    // InternalRM.g:4690:1: ruleERequirementDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) ) otherlv_3= '}' ) ;
    public final EObject ruleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_requirement_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4696:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) ) otherlv_3= '}' ) )
            // InternalRM.g:4697:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) ) otherlv_3= '}' )
            {
            // InternalRM.g:4697:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) ) otherlv_3= '}' )
            // InternalRM.g:4698:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) ) otherlv_3= '}'
            {
            // InternalRM.g:4698:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:4699:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:4699:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:4700:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getERequirementDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERequirementDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getERequirementDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRM.g:4720:3: ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) )
            // InternalRM.g:4721:4: (lv_requirement_2_0= ruleERequirementDefinitionBody )
            {
            // InternalRM.g:4721:4: (lv_requirement_2_0= ruleERequirementDefinitionBody )
            // InternalRM.g:4722:5: lv_requirement_2_0= ruleERequirementDefinitionBody
            {

            					newCompositeNode(grammarAccess.getERequirementDefinitionAccess().getRequirementERequirementDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_requirement_2_0=ruleERequirementDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERequirementDefinitionRule());
            					}
            					set(
            						current,
            						"requirement",
            						lv_requirement_2_0,
            						"org.sodalite.dsl.RM.ERequirementDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getERequirementDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleERequirementDefinitionBody"
    // InternalRM.g:4747:1: entryRuleERequirementDefinitionBody returns [EObject current=null] : iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF ;
    public final EObject entryRuleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinitionBody = null;


        try {
            // InternalRM.g:4747:67: (iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF )
            // InternalRM.g:4748:2: iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getERequirementDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERequirementDefinitionBody=ruleERequirementDefinitionBody();

            state._fsp--;

             current =iv_ruleERequirementDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERequirementDefinitionBody"


    // $ANTLR start "ruleERequirementDefinitionBody"
    // InternalRM.g:4754:1: ruleERequirementDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_start_9_0=null;
        Token otherlv_10=null;
        Token lv_end_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalRM.g:4760:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:4761:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:4761:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:4762:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:4762:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) ) )+ {...}?) )
            // InternalRM.g:4763:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:4766:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) ) )+ {...}?)
            // InternalRM.g:4767:5: ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) ) )+ {...}?
            {
            // InternalRM.g:4767:5: ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=5;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt37=3;
                }
                else if ( LA37_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt37=4;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRM.g:4768:3: ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4768:3: ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4769:4: {...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:4769:120: ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4770:5: ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:4773:8: ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4773:9: {...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4773:18: (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4773:19: otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,55,FOLLOW_6); 

            	    								newLeafNode(otherlv_1, grammarAccess.getERequirementDefinitionBodyAccess().getCapabilityKeyword_0_0());
            	    							
            	    // InternalRM.g:4777:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4778:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4778:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4779:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_54); 

            	    										newLeafNode(otherlv_2, grammarAccess.getERequirementDefinitionBodyAccess().getCapabilityECapabilityTypeCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:4796:3: ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4796:3: ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4797:4: {...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:4797:120: ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4798:5: ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:4801:8: ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4801:9: {...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4801:18: (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4801:19: otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_3=(Token)match(input,56,FOLLOW_6); 

            	    								newLeafNode(otherlv_3, grammarAccess.getERequirementDefinitionBodyAccess().getNodeKeyword_1_0());
            	    							
            	    // InternalRM.g:4805:8: ( (otherlv_4= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4806:9: (otherlv_4= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4806:9: (otherlv_4= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4807:10: otherlv_4= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_4=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_54); 

            	    										newLeafNode(otherlv_4, grammarAccess.getERequirementDefinitionBodyAccess().getNodeENodeTypeCrossReference_1_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:4824:3: ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4824:3: ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4825:4: {...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:4825:120: ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4826:5: ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:4829:8: ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4829:9: {...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4829:18: (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4829:19: otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,57,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getERequirementDefinitionBodyAccess().getRelationshipKeyword_2_0());
            	    							
            	    // InternalRM.g:4833:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4834:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4834:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4835:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_54); 

            	    										newLeafNode(otherlv_6, grammarAccess.getERequirementDefinitionBodyAccess().getRelationshipERelationshipTypeCrossReference_2_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:4852:3: ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) )
            	    {
            	    // InternalRM.g:4852:3: ({...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) ) )
            	    // InternalRM.g:4853:4: {...}? => ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRM.g:4853:120: ( ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) ) )
            	    // InternalRM.g:4854:5: ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRM.g:4857:8: ({...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' ) )
            	    // InternalRM.g:4857:9: {...}? => (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4857:18: (otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']' )
            	    // InternalRM.g:4857:19: otherlv_7= 'occurrences:' otherlv_8= '[' ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= ',' ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= ']'
            	    {
            	    otherlv_7=(Token)match(input,53,FOLLOW_48); 

            	    								newLeafNode(otherlv_7, grammarAccess.getERequirementDefinitionBodyAccess().getOccurrencesKeyword_3_0());
            	    							
            	    otherlv_8=(Token)match(input,51,FOLLOW_11); 

            	    								newLeafNode(otherlv_8, grammarAccess.getERequirementDefinitionBodyAccess().getLeftSquareBracketKeyword_3_1());
            	    							
            	    // InternalRM.g:4865:8: ( (lv_start_9_0= RULE_STRING ) )
            	    // InternalRM.g:4866:9: (lv_start_9_0= RULE_STRING )
            	    {
            	    // InternalRM.g:4866:9: (lv_start_9_0= RULE_STRING )
            	    // InternalRM.g:4867:10: lv_start_9_0= RULE_STRING
            	    {
            	    lv_start_9_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

            	    										newLeafNode(lv_start_9_0, grammarAccess.getERequirementDefinitionBodyAccess().getStartSTRINGTerminalRuleCall_3_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"start",
            	    											lv_start_9_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_10=(Token)match(input,54,FOLLOW_11); 

            	    								newLeafNode(otherlv_10, grammarAccess.getERequirementDefinitionBodyAccess().getCommaKeyword_3_3());
            	    							
            	    // InternalRM.g:4887:8: ( (lv_end_11_0= RULE_STRING ) )
            	    // InternalRM.g:4888:9: (lv_end_11_0= RULE_STRING )
            	    {
            	    // InternalRM.g:4888:9: (lv_end_11_0= RULE_STRING )
            	    // InternalRM.g:4889:10: lv_end_11_0= RULE_STRING
            	    {
            	    lv_end_11_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

            	    										newLeafNode(lv_end_11_0, grammarAccess.getERequirementDefinitionBodyAccess().getEndSTRINGTerminalRuleCall_3_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"end",
            	    											lv_end_11_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,52,FOLLOW_54); 

            	    								newLeafNode(otherlv_12, grammarAccess.getERequirementDefinitionBodyAccess().getRightSquareBracketKeyword_3_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERequirementDefinitionBody"


    // $ANTLR start "entryRuleEConstraints"
    // InternalRM.g:4926:1: entryRuleEConstraints returns [EObject current=null] : iv_ruleEConstraints= ruleEConstraints EOF ;
    public final EObject entryRuleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraints = null;


        try {
            // InternalRM.g:4926:53: (iv_ruleEConstraints= ruleEConstraints EOF )
            // InternalRM.g:4927:2: iv_ruleEConstraints= ruleEConstraints EOF
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
    // InternalRM.g:4933:1: ruleEConstraints returns [EObject current=null] : ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) ;
    public final EObject ruleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4939:2: ( ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) )
            // InternalRM.g:4940:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            {
            // InternalRM.g:4940:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            // InternalRM.g:4941:3: () ( (lv_constraints_1_0= ruleEConstraint ) )*
            {
            // InternalRM.g:4941:3: ()
            // InternalRM.g:4942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConstraintsAccess().getEConstraintsAction_0(),
            					current);
            			

            }

            // InternalRM.g:4948:3: ( (lv_constraints_1_0= ruleEConstraint ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=58 && LA38_0<=67)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRM.g:4949:4: (lv_constraints_1_0= ruleEConstraint )
            	    {
            	    // InternalRM.g:4949:4: (lv_constraints_1_0= ruleEConstraint )
            	    // InternalRM.g:4950:5: lv_constraints_1_0= ruleEConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getEConstraintsAccess().getConstraintsEConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_55);
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
            	    break loop38;
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
    // InternalRM.g:4971:1: entryRuleEConstraint returns [EObject current=null] : iv_ruleEConstraint= ruleEConstraint EOF ;
    public final EObject entryRuleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraint = null;


        try {
            // InternalRM.g:4971:52: (iv_ruleEConstraint= ruleEConstraint EOF )
            // InternalRM.g:4972:2: iv_ruleEConstraint= ruleEConstraint EOF
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
    // InternalRM.g:4978:1: ruleEConstraint returns [EObject current=null] : (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) ;
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
            // InternalRM.g:4984:2: ( (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) )
            // InternalRM.g:4985:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            {
            // InternalRM.g:4985:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            int alt39=10;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt39=1;
                }
                break;
            case 66:
                {
                alt39=2;
                }
                break;
            case 65:
                {
                alt39=3;
                }
                break;
            case 64:
                {
                alt39=4;
                }
                break;
            case 63:
                {
                alt39=5;
                }
                break;
            case 62:
                {
                alt39=6;
                }
                break;
            case 61:
                {
                alt39=7;
                }
                break;
            case 60:
                {
                alt39=8;
                }
                break;
            case 59:
                {
                alt39=9;
                }
                break;
            case 58:
                {
                alt39=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalRM.g:4986:3: this_EEqual_0= ruleEEqual
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
                    // InternalRM.g:4995:3: this_EGreaterThan_1= ruleEGreaterThan
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
                    // InternalRM.g:5004:3: this_EGreaterOrEqual_2= ruleEGreaterOrEqual
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
                    // InternalRM.g:5013:3: this_ELessThan_3= ruleELessThan
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
                    // InternalRM.g:5022:3: this_ELessOrEqual_4= ruleELessOrEqual
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
                    // InternalRM.g:5031:3: this_EInRange_5= ruleEInRange
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
                    // InternalRM.g:5040:3: this_EValid_Values_6= ruleEValid_Values
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
                    // InternalRM.g:5049:3: this_ELength_7= ruleELength
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
                    // InternalRM.g:5058:3: this_EMinLength_8= ruleEMinLength
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
                    // InternalRM.g:5067:3: this_EMaxLength_9= ruleEMaxLength
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
    // InternalRM.g:5079:1: entryRuleEMaxLength returns [EObject current=null] : iv_ruleEMaxLength= ruleEMaxLength EOF ;
    public final EObject entryRuleEMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMaxLength = null;


        try {
            // InternalRM.g:5079:51: (iv_ruleEMaxLength= ruleEMaxLength EOF )
            // InternalRM.g:5080:2: iv_ruleEMaxLength= ruleEMaxLength EOF
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
    // InternalRM.g:5086:1: ruleEMaxLength returns [EObject current=null] : (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5092:2: ( (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5093:2: (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5093:2: (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5094:3: otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEMaxLengthAccess().getMax_lengthKeyword_0());
            		
            // InternalRM.g:5098:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5099:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5099:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5100:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5120:1: entryRuleEMinLength returns [EObject current=null] : iv_ruleEMinLength= ruleEMinLength EOF ;
    public final EObject entryRuleEMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMinLength = null;


        try {
            // InternalRM.g:5120:51: (iv_ruleEMinLength= ruleEMinLength EOF )
            // InternalRM.g:5121:2: iv_ruleEMinLength= ruleEMinLength EOF
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
    // InternalRM.g:5127:1: ruleEMinLength returns [EObject current=null] : (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5133:2: ( (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5134:2: (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5134:2: (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5135:3: otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEMinLengthAccess().getMin_lengthKeyword_0());
            		
            // InternalRM.g:5139:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5140:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5140:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5141:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5161:1: entryRuleELength returns [EObject current=null] : iv_ruleELength= ruleELength EOF ;
    public final EObject entryRuleELength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELength = null;


        try {
            // InternalRM.g:5161:48: (iv_ruleELength= ruleELength EOF )
            // InternalRM.g:5162:2: iv_ruleELength= ruleELength EOF
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
    // InternalRM.g:5168:1: ruleELength returns [EObject current=null] : (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5174:2: ( (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5175:2: (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5175:2: (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5176:3: otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getELengthAccess().getLengthKeyword_0());
            		
            // InternalRM.g:5180:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5181:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5181:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5182:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5202:1: entryRuleEValid_Values returns [EObject current=null] : iv_ruleEValid_Values= ruleEValid_Values EOF ;
    public final EObject entryRuleEValid_Values() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValid_Values = null;


        try {
            // InternalRM.g:5202:54: (iv_ruleEValid_Values= ruleEValid_Values EOF )
            // InternalRM.g:5203:2: iv_ruleEValid_Values= ruleEValid_Values EOF
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
    // InternalRM.g:5209:1: ruleEValid_Values returns [EObject current=null] : (otherlv_0= 'valid_values:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEValid_Values() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5215:2: ( (otherlv_0= 'valid_values:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5216:2: (otherlv_0= 'valid_values:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5216:2: (otherlv_0= 'valid_values:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5217:3: otherlv_0= 'valid_values:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEValid_ValuesAccess().getValid_valuesKeyword_0());
            		
            // InternalRM.g:5221:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5222:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5222:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5223:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5243:1: entryRuleEInRange returns [EObject current=null] : iv_ruleEInRange= ruleEInRange EOF ;
    public final EObject entryRuleEInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInRange = null;


        try {
            // InternalRM.g:5243:49: (iv_ruleEInRange= ruleEInRange EOF )
            // InternalRM.g:5244:2: iv_ruleEInRange= ruleEInRange EOF
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
    // InternalRM.g:5250:1: ruleEInRange returns [EObject current=null] : (otherlv_0= 'in_range:' otherlv_1= '[' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ']' ) ;
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
            // InternalRM.g:5256:2: ( (otherlv_0= 'in_range:' otherlv_1= '[' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ']' ) )
            // InternalRM.g:5257:2: (otherlv_0= 'in_range:' otherlv_1= '[' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ']' )
            {
            // InternalRM.g:5257:2: (otherlv_0= 'in_range:' otherlv_1= '[' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ']' )
            // InternalRM.g:5258:3: otherlv_0= 'in_range:' otherlv_1= '[' ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getEInRangeAccess().getIn_rangeKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEInRangeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRM.g:5266:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalRM.g:5267:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalRM.g:5267:4: (lv_start_2_0= RULE_STRING )
            // InternalRM.g:5268:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_51); 

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

            otherlv_3=(Token)match(input,54,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEInRangeAccess().getCommaKeyword_3());
            		
            // InternalRM.g:5288:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalRM.g:5289:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalRM.g:5289:4: (lv_end_4_0= RULE_STRING )
            // InternalRM.g:5290:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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

            otherlv_5=(Token)match(input,52,FOLLOW_2); 

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
    // InternalRM.g:5314:1: entryRuleELessOrEqual returns [EObject current=null] : iv_ruleELessOrEqual= ruleELessOrEqual EOF ;
    public final EObject entryRuleELessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessOrEqual = null;


        try {
            // InternalRM.g:5314:53: (iv_ruleELessOrEqual= ruleELessOrEqual EOF )
            // InternalRM.g:5315:2: iv_ruleELessOrEqual= ruleELessOrEqual EOF
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
    // InternalRM.g:5321:1: ruleELessOrEqual returns [EObject current=null] : (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5327:2: ( (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5328:2: (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5328:2: (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5329:3: otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getELessOrEqualAccess().getLess_or_equalKeyword_0());
            		
            // InternalRM.g:5333:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5334:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5334:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5335:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5355:1: entryRuleELessThan returns [EObject current=null] : iv_ruleELessThan= ruleELessThan EOF ;
    public final EObject entryRuleELessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessThan = null;


        try {
            // InternalRM.g:5355:50: (iv_ruleELessThan= ruleELessThan EOF )
            // InternalRM.g:5356:2: iv_ruleELessThan= ruleELessThan EOF
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
    // InternalRM.g:5362:1: ruleELessThan returns [EObject current=null] : (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5368:2: ( (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5369:2: (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5369:2: (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5370:3: otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getELessThanAccess().getLess_thanKeyword_0());
            		
            // InternalRM.g:5374:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5375:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5375:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5376:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5396:1: entryRuleEGreaterOrEqual returns [EObject current=null] : iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF ;
    public final EObject entryRuleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterOrEqual = null;


        try {
            // InternalRM.g:5396:56: (iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF )
            // InternalRM.g:5397:2: iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF
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
    // InternalRM.g:5403:1: ruleEGreaterOrEqual returns [EObject current=null] : (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5409:2: ( (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5410:2: (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5410:2: (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5411:3: otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterOrEqualAccess().getGreater_or_equalKeyword_0());
            		
            // InternalRM.g:5415:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5416:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5416:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5417:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5437:1: entryRuleEGreaterThan returns [EObject current=null] : iv_ruleEGreaterThan= ruleEGreaterThan EOF ;
    public final EObject entryRuleEGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterThan = null;


        try {
            // InternalRM.g:5437:53: (iv_ruleEGreaterThan= ruleEGreaterThan EOF )
            // InternalRM.g:5438:2: iv_ruleEGreaterThan= ruleEGreaterThan EOF
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
    // InternalRM.g:5444:1: ruleEGreaterThan returns [EObject current=null] : (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5450:2: ( (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5451:2: (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5451:2: (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5452:3: otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterThanAccess().getGreater_thanKeyword_0());
            		
            // InternalRM.g:5456:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5457:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5457:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5458:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5478:1: entryRuleEEqual returns [EObject current=null] : iv_ruleEEqual= ruleEEqual EOF ;
    public final EObject entryRuleEEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEqual = null;


        try {
            // InternalRM.g:5478:47: (iv_ruleEEqual= ruleEEqual EOF )
            // InternalRM.g:5479:2: iv_ruleEEqual= ruleEEqual EOF
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
    // InternalRM.g:5485:1: ruleEEqual returns [EObject current=null] : (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5491:2: ( (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5492:2: (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5492:2: (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5493:3: otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEEqualAccess().getEqualKeyword_0());
            		
            // InternalRM.g:5497:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5498:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5498:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5499:5: lv_val_1_0= RULE_STRING
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007E8002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000F010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xFC00000000010000L,0x000000000000000FL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000033010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000033000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000004B010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000004B000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000183010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000183000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000E4B010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000E4B000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000124B010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000124B000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003E006000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000003E006000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001100000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000022002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000022002000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002180000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002180000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040082010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040082000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000088000010000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000088000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002C00000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002C00000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0024002002000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0024002002000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x03A0000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x03A0000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xFC00000000000002L,0x000000000000000FL});

}
