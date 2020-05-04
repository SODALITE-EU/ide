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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_START_BLOCK", "RULE_END_BLOCK", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_PRIMITIVE_DATA_TYPE", "RULE_ID", "RULE_BOOLEAN", "RULE_ENTITY", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'data_types'", "'artifact_types'", "'capability_types'", "'interface_types'", "'relationship_types'", "'node_types'", "'policy_types'", "'derived_from:'", "'description:'", "'constraints'", "'properties'", "'mime_type:'", "'file_ext:'", "'attributes'", "'inputs'", "'operations'", "'interfaces'", "'capabilities'", "'requirements'", "'valid_target_types:['", "']'", "','", "'type:'", "'required:'", "'default:'", "'status:'", "'entry_schema:'", "'implementation:'", "'value:'", "'get_input:'", "'get_attribute'", "'attribute:'", "'entity:'", "'req_cap:'", "'get_property'", "'property:'", "'valid_source_types:['", "'occurrences:['", "'capability:'", "'node:'", "'relationship:'", "'max_length:'", "'min_length:'", "'length:'", "'valid_values:'", "'['", "'in_range:['", "'less_or_equal:'", "'less_than:'", "'greater_or_equal:'", "'greater_than:'", "'equal:'", "':'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=10;
    public static final int T__19=19;
    public static final int T__59=59;
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
    public static final int RULE_QUALIFIED_NAME=7;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_END_BLOCK=5;
    public static final int RULE_ID=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=12;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_START_BLOCK=4;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_ENTITY=11;
    public static final int RULE_PRIMITIVE_DATA_TYPE=8;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=14;
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
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
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
    // InternalRM.g:71:1: ruleRM_Model returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) ) )* ) ) ) ;
    public final EObject ruleRM_Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_START_BLOCK_2=null;
        Token this_END_BLOCK_4=null;
        Token otherlv_5=null;
        Token this_START_BLOCK_6=null;
        Token this_END_BLOCK_8=null;
        Token otherlv_9=null;
        Token this_START_BLOCK_10=null;
        Token this_END_BLOCK_12=null;
        Token otherlv_13=null;
        Token this_START_BLOCK_14=null;
        Token this_END_BLOCK_16=null;
        Token otherlv_17=null;
        Token this_START_BLOCK_18=null;
        Token this_END_BLOCK_20=null;
        Token otherlv_21=null;
        Token this_START_BLOCK_22=null;
        Token this_END_BLOCK_24=null;
        Token otherlv_25=null;
        Token this_START_BLOCK_26=null;
        Token this_END_BLOCK_28=null;
        EObject lv_dataTypes_3_0 = null;

        EObject lv_artifactTypes_7_0 = null;

        EObject lv_capabilityTypes_11_0 = null;

        EObject lv_interfaceTypes_15_0 = null;

        EObject lv_relationshipTypes_19_0 = null;

        EObject lv_nodeTypes_23_0 = null;

        EObject lv_policyTypes_27_0 = null;



        	enterRule();

        try {
            // InternalRM.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) ) )* ) ) ) )
            // InternalRM.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) ) )* ) ) )
            {
            // InternalRM.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) ) )* ) ) )
            // InternalRM.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) ) )* ) )
            {
            // InternalRM.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) ) )* ) )
            // InternalRM.g:80:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            			
            // InternalRM.g:83:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) ) )* )
            // InternalRM.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) ) )*
            {
            // InternalRM.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) ) )*
            loop1:
            do {
                int alt1=8;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3) ) {
                    alt1=4;
                }
                else if ( LA1_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4) ) {
                    alt1=5;
                }
                else if ( LA1_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5) ) {
                    alt1=6;
                }
                else if ( LA1_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6) ) {
                    alt1=7;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRM.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:86:4: {...}? => ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:86:102: ( ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:87:5: ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:90:8: ({...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK ) )
            	    // InternalRM.g:90:9: {...}? => (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:90:18: (otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK )
            	    // InternalRM.g:90:19: otherlv_1= 'data_types' this_START_BLOCK_2= RULE_START_BLOCK ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_BLOCK_4= RULE_END_BLOCK
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getRM_ModelAccess().getData_typesKeyword_0_0());
            	    							
            	    this_START_BLOCK_2=(Token)match(input,RULE_START_BLOCK,FOLLOW_4); 

            	    								newLeafNode(this_START_BLOCK_2, grammarAccess.getRM_ModelAccess().getSTART_BLOCKTerminalRuleCall_0_1());
            	    							
            	    // InternalRM.g:98:8: ( (lv_dataTypes_3_0= ruleEDataTypes ) )
            	    // InternalRM.g:99:9: (lv_dataTypes_3_0= ruleEDataTypes )
            	    {
            	    // InternalRM.g:99:9: (lv_dataTypes_3_0= ruleEDataTypes )
            	    // InternalRM.g:100:10: lv_dataTypes_3_0= ruleEDataTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getDataTypesEDataTypesParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_dataTypes_3_0=ruleEDataTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dataTypes",
            	    											lv_dataTypes_3_0,
            	    											"org.sodalite.dsl.RM.EDataTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_4=(Token)match(input,RULE_END_BLOCK,FOLLOW_6); 

            	    								newLeafNode(this_END_BLOCK_4, grammarAccess.getRM_ModelAccess().getEND_BLOCKTerminalRuleCall_0_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRM.g:127:3: ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:127:3: ({...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:128:4: {...}? => ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:128:102: ( ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:129:5: ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:132:8: ({...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK ) )
            	    // InternalRM.g:132:9: {...}? => (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:132:18: (otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK )
            	    // InternalRM.g:132:19: otherlv_5= 'artifact_types' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_BLOCK_8= RULE_END_BLOCK
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_3); 

            	    								newLeafNode(otherlv_5, grammarAccess.getRM_ModelAccess().getArtifact_typesKeyword_1_0());
            	    							
            	    this_START_BLOCK_6=(Token)match(input,RULE_START_BLOCK,FOLLOW_7); 

            	    								newLeafNode(this_START_BLOCK_6, grammarAccess.getRM_ModelAccess().getSTART_BLOCKTerminalRuleCall_1_1());
            	    							
            	    // InternalRM.g:140:8: ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) )
            	    // InternalRM.g:141:9: (lv_artifactTypes_7_0= ruleEArtifactTypes )
            	    {
            	    // InternalRM.g:141:9: (lv_artifactTypes_7_0= ruleEArtifactTypes )
            	    // InternalRM.g:142:10: lv_artifactTypes_7_0= ruleEArtifactTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getArtifactTypesEArtifactTypesParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_artifactTypes_7_0=ruleEArtifactTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"artifactTypes",
            	    											lv_artifactTypes_7_0,
            	    											"org.sodalite.dsl.RM.EArtifactTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_8=(Token)match(input,RULE_END_BLOCK,FOLLOW_6); 

            	    								newLeafNode(this_END_BLOCK_8, grammarAccess.getRM_ModelAccess().getEND_BLOCKTerminalRuleCall_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:169:3: ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:169:3: ({...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:170:4: {...}? => ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:170:102: ( ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:171:5: ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:174:8: ({...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) )
            	    // InternalRM.g:174:9: {...}? => (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:174:18: (otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK )
            	    // InternalRM.g:174:19: otherlv_9= 'capability_types' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_BLOCK_12= RULE_END_BLOCK
            	    {
            	    otherlv_9=(Token)match(input,19,FOLLOW_3); 

            	    								newLeafNode(otherlv_9, grammarAccess.getRM_ModelAccess().getCapability_typesKeyword_2_0());
            	    							
            	    this_START_BLOCK_10=(Token)match(input,RULE_START_BLOCK,FOLLOW_7); 

            	    								newLeafNode(this_START_BLOCK_10, grammarAccess.getRM_ModelAccess().getSTART_BLOCKTerminalRuleCall_2_1());
            	    							
            	    // InternalRM.g:182:8: ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) )
            	    // InternalRM.g:183:9: (lv_capabilityTypes_11_0= ruleECapabilityTypes )
            	    {
            	    // InternalRM.g:183:9: (lv_capabilityTypes_11_0= ruleECapabilityTypes )
            	    // InternalRM.g:184:10: lv_capabilityTypes_11_0= ruleECapabilityTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getCapabilityTypesECapabilityTypesParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_capabilityTypes_11_0=ruleECapabilityTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"capabilityTypes",
            	    											lv_capabilityTypes_11_0,
            	    											"org.sodalite.dsl.RM.ECapabilityTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_12=(Token)match(input,RULE_END_BLOCK,FOLLOW_6); 

            	    								newLeafNode(this_END_BLOCK_12, grammarAccess.getRM_ModelAccess().getEND_BLOCKTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:211:3: ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:211:3: ({...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:212:4: {...}? => ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRM.g:212:102: ( ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:213:5: ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRM.g:216:8: ({...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK ) )
            	    // InternalRM.g:216:9: {...}? => (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:216:18: (otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK )
            	    // InternalRM.g:216:19: otherlv_13= 'interface_types' this_START_BLOCK_14= RULE_START_BLOCK ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_BLOCK_16= RULE_END_BLOCK
            	    {
            	    otherlv_13=(Token)match(input,20,FOLLOW_3); 

            	    								newLeafNode(otherlv_13, grammarAccess.getRM_ModelAccess().getInterface_typesKeyword_3_0());
            	    							
            	    this_START_BLOCK_14=(Token)match(input,RULE_START_BLOCK,FOLLOW_7); 

            	    								newLeafNode(this_START_BLOCK_14, grammarAccess.getRM_ModelAccess().getSTART_BLOCKTerminalRuleCall_3_1());
            	    							
            	    // InternalRM.g:224:8: ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) )
            	    // InternalRM.g:225:9: (lv_interfaceTypes_15_0= ruleEInterfaceTypes )
            	    {
            	    // InternalRM.g:225:9: (lv_interfaceTypes_15_0= ruleEInterfaceTypes )
            	    // InternalRM.g:226:10: lv_interfaceTypes_15_0= ruleEInterfaceTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getInterfaceTypesEInterfaceTypesParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_interfaceTypes_15_0=ruleEInterfaceTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"interfaceTypes",
            	    											lv_interfaceTypes_15_0,
            	    											"org.sodalite.dsl.RM.EInterfaceTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_16=(Token)match(input,RULE_END_BLOCK,FOLLOW_6); 

            	    								newLeafNode(this_END_BLOCK_16, grammarAccess.getRM_ModelAccess().getEND_BLOCKTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRM.g:253:3: ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:253:3: ({...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:254:4: {...}? => ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRM.g:254:102: ( ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:255:5: ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRM.g:258:8: ({...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK ) )
            	    // InternalRM.g:258:9: {...}? => (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:258:18: (otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK )
            	    // InternalRM.g:258:19: otherlv_17= 'relationship_types' this_START_BLOCK_18= RULE_START_BLOCK ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_BLOCK_20= RULE_END_BLOCK
            	    {
            	    otherlv_17=(Token)match(input,21,FOLLOW_3); 

            	    								newLeafNode(otherlv_17, grammarAccess.getRM_ModelAccess().getRelationship_typesKeyword_4_0());
            	    							
            	    this_START_BLOCK_18=(Token)match(input,RULE_START_BLOCK,FOLLOW_7); 

            	    								newLeafNode(this_START_BLOCK_18, grammarAccess.getRM_ModelAccess().getSTART_BLOCKTerminalRuleCall_4_1());
            	    							
            	    // InternalRM.g:266:8: ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) )
            	    // InternalRM.g:267:9: (lv_relationshipTypes_19_0= ruleERelationshipTypes )
            	    {
            	    // InternalRM.g:267:9: (lv_relationshipTypes_19_0= ruleERelationshipTypes )
            	    // InternalRM.g:268:10: lv_relationshipTypes_19_0= ruleERelationshipTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getRelationshipTypesERelationshipTypesParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_relationshipTypes_19_0=ruleERelationshipTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"relationshipTypes",
            	    											lv_relationshipTypes_19_0,
            	    											"org.sodalite.dsl.RM.ERelationshipTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_20=(Token)match(input,RULE_END_BLOCK,FOLLOW_6); 

            	    								newLeafNode(this_END_BLOCK_20, grammarAccess.getRM_ModelAccess().getEND_BLOCKTerminalRuleCall_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRM.g:295:3: ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:295:3: ({...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:296:4: {...}? => ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRM.g:296:102: ( ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:297:5: ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRM.g:300:8: ({...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK ) )
            	    // InternalRM.g:300:9: {...}? => (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:300:18: (otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK )
            	    // InternalRM.g:300:19: otherlv_21= 'node_types' this_START_BLOCK_22= RULE_START_BLOCK ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_BLOCK_24= RULE_END_BLOCK
            	    {
            	    otherlv_21=(Token)match(input,22,FOLLOW_3); 

            	    								newLeafNode(otherlv_21, grammarAccess.getRM_ModelAccess().getNode_typesKeyword_5_0());
            	    							
            	    this_START_BLOCK_22=(Token)match(input,RULE_START_BLOCK,FOLLOW_7); 

            	    								newLeafNode(this_START_BLOCK_22, grammarAccess.getRM_ModelAccess().getSTART_BLOCKTerminalRuleCall_5_1());
            	    							
            	    // InternalRM.g:308:8: ( (lv_nodeTypes_23_0= ruleENodeTypes ) )
            	    // InternalRM.g:309:9: (lv_nodeTypes_23_0= ruleENodeTypes )
            	    {
            	    // InternalRM.g:309:9: (lv_nodeTypes_23_0= ruleENodeTypes )
            	    // InternalRM.g:310:10: lv_nodeTypes_23_0= ruleENodeTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getNodeTypesENodeTypesParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_nodeTypes_23_0=ruleENodeTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nodeTypes",
            	    											lv_nodeTypes_23_0,
            	    											"org.sodalite.dsl.RM.ENodeTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_24=(Token)match(input,RULE_END_BLOCK,FOLLOW_6); 

            	    								newLeafNode(this_END_BLOCK_24, grammarAccess.getRM_ModelAccess().getEND_BLOCKTerminalRuleCall_5_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRM.g:337:3: ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:337:3: ({...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:338:4: {...}? => ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRM.g:338:102: ( ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:339:5: ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRM.g:342:8: ({...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK ) )
            	    // InternalRM.g:342:9: {...}? => (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRM.g:342:18: (otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK )
            	    // InternalRM.g:342:19: otherlv_25= 'policy_types' this_START_BLOCK_26= RULE_START_BLOCK ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_BLOCK_28= RULE_END_BLOCK
            	    {
            	    otherlv_25=(Token)match(input,23,FOLLOW_3); 

            	    								newLeafNode(otherlv_25, grammarAccess.getRM_ModelAccess().getPolicy_typesKeyword_6_0());
            	    							
            	    this_START_BLOCK_26=(Token)match(input,RULE_START_BLOCK,FOLLOW_7); 

            	    								newLeafNode(this_START_BLOCK_26, grammarAccess.getRM_ModelAccess().getSTART_BLOCKTerminalRuleCall_6_1());
            	    							
            	    // InternalRM.g:350:8: ( (lv_policyTypes_27_0= ruleEPolicyTypes ) )
            	    // InternalRM.g:351:9: (lv_policyTypes_27_0= ruleEPolicyTypes )
            	    {
            	    // InternalRM.g:351:9: (lv_policyTypes_27_0= ruleEPolicyTypes )
            	    // InternalRM.g:352:10: lv_policyTypes_27_0= ruleEPolicyTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getPolicyTypesEPolicyTypesParserRuleCall_6_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_policyTypes_27_0=ruleEPolicyTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"policyTypes",
            	    											lv_policyTypes_27_0,
            	    											"org.sodalite.dsl.RM.EPolicyTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_28=(Token)match(input,RULE_END_BLOCK,FOLLOW_6); 

            	    								newLeafNode(this_END_BLOCK_28, grammarAccess.getRM_ModelAccess().getEND_BLOCKTerminalRuleCall_6_3());
            	    							

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
    // InternalRM.g:389:1: entryRuleEDataTypes returns [EObject current=null] : iv_ruleEDataTypes= ruleEDataTypes EOF ;
    public final EObject entryRuleEDataTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypes = null;


        try {
            // InternalRM.g:389:51: (iv_ruleEDataTypes= ruleEDataTypes EOF )
            // InternalRM.g:390:2: iv_ruleEDataTypes= ruleEDataTypes EOF
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
    // InternalRM.g:396:1: ruleEDataTypes returns [EObject current=null] : ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ ) ;
    public final EObject ruleEDataTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_dataTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:402:2: ( ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ ) )
            // InternalRM.g:403:2: ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ )
            {
            // InternalRM.g:403:2: ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ )
            // InternalRM.g:404:3: () ( (lv_dataTypes_1_0= ruleEDataType ) )+
            {
            // InternalRM.g:404:3: ()
            // InternalRM.g:405:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataTypesAccess().getEDataTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:411:3: ( (lv_dataTypes_1_0= ruleEDataType ) )+
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
            	    // InternalRM.g:412:4: (lv_dataTypes_1_0= ruleEDataType )
            	    {
            	    // InternalRM.g:412:4: (lv_dataTypes_1_0= ruleEDataType )
            	    // InternalRM.g:413:5: lv_dataTypes_1_0= ruleEDataType
            	    {

            	    					newCompositeNode(grammarAccess.getEDataTypesAccess().getDataTypesEDataTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
    // InternalRM.g:434:1: entryRuleEDataType returns [EObject current=null] : iv_ruleEDataType= ruleEDataType EOF ;
    public final EObject entryRuleEDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType = null;


        try {
            // InternalRM.g:434:50: (iv_ruleEDataType= ruleEDataType EOF )
            // InternalRM.g:435:2: iv_ruleEDataType= ruleEDataType EOF
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
    // InternalRM.g:441:1: ruleEDataType returns [EObject current=null] : ( ( (lv_name_0_0= ruleEDataTypeName ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_data_2_0= ruleEDataTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleEDataType() throws RecognitionException {
        EObject current = null;

        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_data_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:447:2: ( ( ( (lv_name_0_0= ruleEDataTypeName ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_data_2_0= ruleEDataTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:448:2: ( ( (lv_name_0_0= ruleEDataTypeName ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_data_2_0= ruleEDataTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:448:2: ( ( (lv_name_0_0= ruleEDataTypeName ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_data_2_0= ruleEDataTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:449:3: ( (lv_name_0_0= ruleEDataTypeName ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_data_2_0= ruleEDataTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:449:3: ( (lv_name_0_0= ruleEDataTypeName ) )
            // InternalRM.g:450:4: (lv_name_0_0= ruleEDataTypeName )
            {
            // InternalRM.g:450:4: (lv_name_0_0= ruleEDataTypeName )
            // InternalRM.g:451:5: lv_name_0_0= ruleEDataTypeName
            {

            					newCompositeNode(grammarAccess.getEDataTypeAccess().getNameEDataTypeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_9); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getEDataTypeAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:472:3: ( (lv_data_2_0= ruleEDataTypeBody ) )
            // InternalRM.g:473:4: (lv_data_2_0= ruleEDataTypeBody )
            {
            // InternalRM.g:473:4: (lv_data_2_0= ruleEDataTypeBody )
            // InternalRM.g:474:5: lv_data_2_0= ruleEDataTypeBody
            {

            					newCompositeNode(grammarAccess.getEDataTypeAccess().getDataEDataTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getEDataTypeAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:499:1: entryRuleEDataTypeBody returns [EObject current=null] : iv_ruleEDataTypeBody= ruleEDataTypeBody EOF ;
    public final EObject entryRuleEDataTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypeBody = null;


        try {
            // InternalRM.g:499:54: (iv_ruleEDataTypeBody= ruleEDataTypeBody EOF )
            // InternalRM.g:500:2: iv_ruleEDataTypeBody= ruleEDataTypeBody EOF
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
    // InternalRM.g:506:1: ruleEDataTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEDataTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_START_BLOCK_7=null;
        Token this_END_BLOCK_9=null;
        Token otherlv_10=null;
        Token this_START_BLOCK_11=null;
        Token this_END_BLOCK_13=null;
        EObject lv_constraints_8_0 = null;

        EObject lv_properties_12_0 = null;



        	enterRule();

        try {
            // InternalRM.g:512:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:513:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:513:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) )
            // InternalRM.g:514:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) )
            {
            // InternalRM.g:514:3: ()
            // InternalRM.g:515:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataTypeBodyAccess().getEDataTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:521:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) )
            // InternalRM.g:522:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) )
            {
            // InternalRM.g:522:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) )
            // InternalRM.g:523:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:526:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* )
            // InternalRM.g:527:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )*
            {
            // InternalRM.g:527:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )*
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
            	    // InternalRM.g:528:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:528:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:529:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:529:110: ( ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:530:6: ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:533:9: ({...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:533:10: {...}? => (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRM.g:533:19: (otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:533:20: otherlv_2= 'derived_from:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEDataTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:537:9: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:538:10: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:538:10: ( ruleEDataTypeName )
            	    // InternalRM.g:539:11: ruleEDataTypeName
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
            	    // InternalRM.g:559:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:559:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:560:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:560:110: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:561:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:564:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:564:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRM.g:564:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:564:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEDataTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:568:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:569:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:569:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:570:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRM.g:592:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:592:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:593:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:593:110: ( ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:594:6: ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:597:9: ({...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            	    // InternalRM.g:597:10: {...}? => (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRM.g:597:19: (otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            	    // InternalRM.g:597:20: otherlv_6= 'constraints' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	    {
            	    otherlv_6=(Token)match(input,26,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEDataTypeBodyAccess().getConstraintsKeyword_1_2_0());
            	    								
            	    this_START_BLOCK_7=(Token)match(input,RULE_START_BLOCK,FOLLOW_12); 

            	    									newLeafNode(this_START_BLOCK_7, grammarAccess.getEDataTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRM.g:605:9: ( (lv_constraints_8_0= ruleEConstraints ) )
            	    // InternalRM.g:606:10: (lv_constraints_8_0= ruleEConstraints )
            	    {
            	    // InternalRM.g:606:10: (lv_constraints_8_0= ruleEConstraints )
            	    // InternalRM.g:607:11: lv_constraints_8_0= ruleEConstraints
            	    {

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getConstraintsEConstraintsParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_constraints_8_0=ruleEConstraints();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"constraints",
            	    												lv_constraints_8_0,
            	    												"org.sodalite.dsl.RM.EConstraints");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_10); 

            	    									newLeafNode(this_END_BLOCK_9, grammarAccess.getEDataTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:634:4: ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:634:4: ({...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:635:5: {...}? => ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:635:110: ( ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:636:6: ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:639:9: ({...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK ) )
            	    // InternalRM.g:639:10: {...}? => (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRM.g:639:19: (otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK )
            	    // InternalRM.g:639:20: otherlv_10= 'properties' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_properties_12_0= ruleEProperties ) ) this_END_BLOCK_13= RULE_END_BLOCK
            	    {
            	    otherlv_10=(Token)match(input,27,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEDataTypeBodyAccess().getPropertiesKeyword_1_3_0());
            	    								
            	    this_START_BLOCK_11=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_11, grammarAccess.getEDataTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRM.g:647:9: ( (lv_properties_12_0= ruleEProperties ) )
            	    // InternalRM.g:648:10: (lv_properties_12_0= ruleEProperties )
            	    {
            	    // InternalRM.g:648:10: (lv_properties_12_0= ruleEProperties )
            	    // InternalRM.g:649:11: lv_properties_12_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_properties_12_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_12_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_13=(Token)match(input,RULE_END_BLOCK,FOLLOW_10); 

            	    									newLeafNode(this_END_BLOCK_13, grammarAccess.getEDataTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_3_3());
            	    								

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
    // InternalRM.g:687:1: entryRuleEDataTypeName returns [String current=null] : iv_ruleEDataTypeName= ruleEDataTypeName EOF ;
    public final String entryRuleEDataTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDataTypeName = null;


        try {
            // InternalRM.g:687:53: (iv_ruleEDataTypeName= ruleEDataTypeName EOF )
            // InternalRM.g:688:2: iv_ruleEDataTypeName= ruleEDataTypeName EOF
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
    // InternalRM.g:694:1: ruleEDataTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleEDataTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUALIFIED_NAME_0=null;
        Token this_PRIMITIVE_DATA_TYPE_1=null;


        	enterRule();

        try {
            // InternalRM.g:700:2: ( (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) )
            // InternalRM.g:701:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
            {
            // InternalRM.g:701:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
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
                    // InternalRM.g:702:3: this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME
                    {
                    this_QUALIFIED_NAME_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_NAME_0);
                    		

                    			newLeafNode(this_QUALIFIED_NAME_0, grammarAccess.getEDataTypeNameAccess().getQUALIFIED_NAMETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRM.g:710:3: this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE
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
    // InternalRM.g:721:1: entryRuleEArtifactTypes returns [EObject current=null] : iv_ruleEArtifactTypes= ruleEArtifactTypes EOF ;
    public final EObject entryRuleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypes = null;


        try {
            // InternalRM.g:721:55: (iv_ruleEArtifactTypes= ruleEArtifactTypes EOF )
            // InternalRM.g:722:2: iv_ruleEArtifactTypes= ruleEArtifactTypes EOF
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
    // InternalRM.g:728:1: ruleEArtifactTypes returns [EObject current=null] : ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) ;
    public final EObject ruleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_artifactTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:734:2: ( ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) )
            // InternalRM.g:735:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            {
            // InternalRM.g:735:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            // InternalRM.g:736:3: () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            {
            // InternalRM.g:736:3: ()
            // InternalRM.g:737:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypesAccess().getEArtifactTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:743:3: ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
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
            	    // InternalRM.g:744:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    {
            	    // InternalRM.g:744:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    // InternalRM.g:745:5: lv_artifactTypes_1_0= ruleEArtifactType
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
    // InternalRM.g:766:1: entryRuleEArtifactType returns [EObject current=null] : iv_ruleEArtifactType= ruleEArtifactType EOF ;
    public final EObject entryRuleEArtifactType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactType = null;


        try {
            // InternalRM.g:766:54: (iv_ruleEArtifactType= ruleEArtifactType EOF )
            // InternalRM.g:767:2: iv_ruleEArtifactType= ruleEArtifactType EOF
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
    // InternalRM.g:773:1: ruleEArtifactType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_artifact_2_0= ruleEArtifactTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleEArtifactType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_artifact_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:779:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_artifact_2_0= ruleEArtifactTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:780:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_artifact_2_0= ruleEArtifactTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:780:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_artifact_2_0= ruleEArtifactTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:781:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_artifact_2_0= ruleEArtifactTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:781:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:782:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:782:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:783:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_15); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getEArtifactTypeAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:803:3: ( (lv_artifact_2_0= ruleEArtifactTypeBody ) )
            // InternalRM.g:804:4: (lv_artifact_2_0= ruleEArtifactTypeBody )
            {
            // InternalRM.g:804:4: (lv_artifact_2_0= ruleEArtifactTypeBody )
            // InternalRM.g:805:5: lv_artifact_2_0= ruleEArtifactTypeBody
            {

            					newCompositeNode(grammarAccess.getEArtifactTypeAccess().getArtifactEArtifactTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getEArtifactTypeAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:830:1: entryRuleEArtifactTypeBody returns [EObject current=null] : iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF ;
    public final EObject entryRuleEArtifactTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypeBody = null;


        try {
            // InternalRM.g:830:58: (iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF )
            // InternalRM.g:831:2: iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF
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
    // InternalRM.g:837:1: ruleEArtifactTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
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
            // InternalRM.g:843:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:844:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:844:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRM.g:845:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRM.g:845:3: ()
            // InternalRM.g:846:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypeBodyAccess().getEArtifactTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:852:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRM.g:853:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRM.g:853:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRM.g:854:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:857:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRM.g:858:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRM.g:858:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
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
            	    // InternalRM.g:859:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:859:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:860:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:860:114: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:861:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:864:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:864:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRM.g:864:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:864:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEArtifactTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:868:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:869:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:869:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:870:11: otherlv_3= RULE_QUALIFIED_NAME
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
            	    // InternalRM.g:887:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:887:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:888:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:888:114: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:889:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:892:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:892:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRM.g:892:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:892:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEArtifactTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:896:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:897:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:897:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:898:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRM.g:920:4: ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:920:4: ({...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:921:5: {...}? => ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:921:114: ( ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:922:6: ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:925:9: ({...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:925:10: {...}? => (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRM.g:925:19: (otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    // InternalRM.g:925:20: otherlv_6= 'mime_type:' ( (lv_mime_type_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEArtifactTypeBodyAccess().getMime_typeKeyword_1_2_0());
            	    								
            	    // InternalRM.g:929:9: ( (lv_mime_type_7_0= RULE_STRING ) )
            	    // InternalRM.g:930:10: (lv_mime_type_7_0= RULE_STRING )
            	    {
            	    // InternalRM.g:930:10: (lv_mime_type_7_0= RULE_STRING )
            	    // InternalRM.g:931:11: lv_mime_type_7_0= RULE_STRING
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
            	    // InternalRM.g:953:4: ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:953:4: ({...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:954:5: {...}? => ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:954:114: ( ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:955:6: ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:958:9: ({...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:958:10: {...}? => ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRM.g:958:19: ( (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    // InternalRM.g:958:20: (otherlv_8= 'file_ext:' )+ ( (lv_file_ext_9_0= RULE_STRING ) )
            	    {
            	    // InternalRM.g:958:20: (otherlv_8= 'file_ext:' )+
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
            	    	    // InternalRM.g:959:10: otherlv_8= 'file_ext:'
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

            	    // InternalRM.g:964:9: ( (lv_file_ext_9_0= RULE_STRING ) )
            	    // InternalRM.g:965:10: (lv_file_ext_9_0= RULE_STRING )
            	    {
            	    // InternalRM.g:965:10: (lv_file_ext_9_0= RULE_STRING )
            	    // InternalRM.g:966:11: lv_file_ext_9_0= RULE_STRING
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
    // InternalRM.g:999:1: entryRuleECapabilityTypes returns [EObject current=null] : iv_ruleECapabilityTypes= ruleECapabilityTypes EOF ;
    public final EObject entryRuleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypes = null;


        try {
            // InternalRM.g:999:57: (iv_ruleECapabilityTypes= ruleECapabilityTypes EOF )
            // InternalRM.g:1000:2: iv_ruleECapabilityTypes= ruleECapabilityTypes EOF
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
    // InternalRM.g:1006:1: ruleECapabilityTypes returns [EObject current=null] : ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) ;
    public final EObject ruleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilityTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1012:2: ( ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) )
            // InternalRM.g:1013:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            {
            // InternalRM.g:1013:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            // InternalRM.g:1014:3: () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            {
            // InternalRM.g:1014:3: ()
            // InternalRM.g:1015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypesAccess().getECapabilityTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1021:3: ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
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
            	    // InternalRM.g:1022:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    {
            	    // InternalRM.g:1022:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    // InternalRM.g:1023:5: lv_capabilityTypes_1_0= ruleECapabilityType
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
    // InternalRM.g:1044:1: entryRuleECapabilityType returns [EObject current=null] : iv_ruleECapabilityType= ruleECapabilityType EOF ;
    public final EObject entryRuleECapabilityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityType = null;


        try {
            // InternalRM.g:1044:56: (iv_ruleECapabilityType= ruleECapabilityType EOF )
            // InternalRM.g:1045:2: iv_ruleECapabilityType= ruleECapabilityType EOF
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
    // InternalRM.g:1051:1: ruleECapabilityType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_capability_2_0= ruleECapabilityTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleECapabilityType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_capability_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1057:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_capability_2_0= ruleECapabilityTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:1058:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_capability_2_0= ruleECapabilityTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:1058:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_capability_2_0= ruleECapabilityTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:1059:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_capability_2_0= ruleECapabilityTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:1059:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1060:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1060:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1061:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_18); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getECapabilityTypeAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:1081:3: ( (lv_capability_2_0= ruleECapabilityTypeBody ) )
            // InternalRM.g:1082:4: (lv_capability_2_0= ruleECapabilityTypeBody )
            {
            // InternalRM.g:1082:4: (lv_capability_2_0= ruleECapabilityTypeBody )
            // InternalRM.g:1083:5: lv_capability_2_0= ruleECapabilityTypeBody
            {

            					newCompositeNode(grammarAccess.getECapabilityTypeAccess().getCapabilityECapabilityTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getECapabilityTypeAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:1108:1: entryRuleECapabilityTypeBody returns [EObject current=null] : iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF ;
    public final EObject entryRuleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeBody = null;


        try {
            // InternalRM.g:1108:60: (iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF )
            // InternalRM.g:1109:2: iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF
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
    // InternalRM.g:1115:1: ruleECapabilityTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_START_BLOCK_7=null;
        Token this_END_BLOCK_9=null;
        Token otherlv_10=null;
        Token this_START_BLOCK_11=null;
        Token this_END_BLOCK_13=null;
        EObject lv_properties_8_0 = null;

        EObject lv_atributes_12_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1121:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:1122:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:1122:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) )
            // InternalRM.g:1123:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) )
            {
            // InternalRM.g:1123:3: ()
            // InternalRM.g:1124:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypeBodyAccess().getECapabilityTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:1130:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) )
            // InternalRM.g:1131:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) )
            {
            // InternalRM.g:1131:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) )
            // InternalRM.g:1132:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:1135:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* )
            // InternalRM.g:1136:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )*
            {
            // InternalRM.g:1136:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )*
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
            	    // InternalRM.g:1137:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1137:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:1138:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:1138:116: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:1139:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:1142:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:1142:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRM.g:1142:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:1142:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getECapabilityTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:1146:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:1147:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:1147:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:1148:11: otherlv_3= RULE_QUALIFIED_NAME
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
            	    // InternalRM.g:1165:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1165:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:1166:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:1166:116: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:1167:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:1170:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:1170:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRM.g:1170:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:1170:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getECapabilityTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:1174:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:1175:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:1175:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:1176:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRM.g:1198:4: ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:1198:4: ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:1199:5: {...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:1199:116: ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:1200:6: ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:1203:9: ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            	    // InternalRM.g:1203:10: {...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRM.g:1203:19: (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            	    // InternalRM.g:1203:20: otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getECapabilityTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_START_BLOCK_7=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_7, grammarAccess.getECapabilityTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRM.g:1211:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRM.g:1212:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRM.g:1212:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRM.g:1213:11: lv_properties_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getECapabilityTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_properties_8_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_8_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_19); 

            	    									newLeafNode(this_END_BLOCK_9, grammarAccess.getECapabilityTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:1240:4: ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:1240:4: ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:1241:5: {...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:1241:116: ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:1242:6: ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:1245:9: ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) )
            	    // InternalRM.g:1245:10: {...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRM.g:1245:19: (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK )
            	    // InternalRM.g:1245:20: otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK
            	    {
            	    otherlv_10=(Token)match(input,30,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getECapabilityTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_START_BLOCK_11=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_11, grammarAccess.getECapabilityTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRM.g:1253:9: ( (lv_atributes_12_0= ruleEAttributes ) )
            	    // InternalRM.g:1254:10: (lv_atributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRM.g:1254:10: (lv_atributes_12_0= ruleEAttributes )
            	    // InternalRM.g:1255:11: lv_atributes_12_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getECapabilityTypeBodyAccess().getAtributesEAttributesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_atributes_12_0=ruleEAttributes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"atributes",
            	    												lv_atributes_12_0,
            	    												"org.sodalite.dsl.RM.EAttributes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_13=(Token)match(input,RULE_END_BLOCK,FOLLOW_19); 

            	    									newLeafNode(this_END_BLOCK_13, grammarAccess.getECapabilityTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_3_3());
            	    								

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
    // InternalRM.g:1293:1: entryRuleEInterfaceTypes returns [EObject current=null] : iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF ;
    public final EObject entryRuleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypes = null;


        try {
            // InternalRM.g:1293:56: (iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF )
            // InternalRM.g:1294:2: iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF
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
    // InternalRM.g:1300:1: ruleEInterfaceTypes returns [EObject current=null] : ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) ;
    public final EObject ruleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaceTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1306:2: ( ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) )
            // InternalRM.g:1307:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            {
            // InternalRM.g:1307:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            // InternalRM.g:1308:3: () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            {
            // InternalRM.g:1308:3: ()
            // InternalRM.g:1309:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypesAccess().getEInterfaceTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1315:3: ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
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
            	    // InternalRM.g:1316:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    {
            	    // InternalRM.g:1316:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    // InternalRM.g:1317:5: lv_interfaceTypes_1_0= ruleEInterfaceType
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
    // InternalRM.g:1338:1: entryRuleEInterfaceType returns [EObject current=null] : iv_ruleEInterfaceType= ruleEInterfaceType EOF ;
    public final EObject entryRuleEInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceType = null;


        try {
            // InternalRM.g:1338:55: (iv_ruleEInterfaceType= ruleEInterfaceType EOF )
            // InternalRM.g:1339:2: iv_ruleEInterfaceType= ruleEInterfaceType EOF
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
    // InternalRM.g:1345:1: ruleEInterfaceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_interface_2_0= ruleEInterfaceTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleEInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_interface_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1351:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_interface_2_0= ruleEInterfaceTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:1352:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_interface_2_0= ruleEInterfaceTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:1352:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_interface_2_0= ruleEInterfaceTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:1353:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_interface_2_0= ruleEInterfaceTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:1353:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1354:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1354:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1355:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_20); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getEInterfaceTypeAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:1375:3: ( (lv_interface_2_0= ruleEInterfaceTypeBody ) )
            // InternalRM.g:1376:4: (lv_interface_2_0= ruleEInterfaceTypeBody )
            {
            // InternalRM.g:1376:4: (lv_interface_2_0= ruleEInterfaceTypeBody )
            // InternalRM.g:1377:5: lv_interface_2_0= ruleEInterfaceTypeBody
            {

            					newCompositeNode(grammarAccess.getEInterfaceTypeAccess().getInterfaceEInterfaceTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getEInterfaceTypeAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:1402:1: entryRuleEInterfaceTypeBody returns [EObject current=null] : iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF ;
    public final EObject entryRuleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypeBody = null;


        try {
            // InternalRM.g:1402:59: (iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF )
            // InternalRM.g:1403:2: iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF
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
    // InternalRM.g:1409:1: ruleEInterfaceTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_START_BLOCK_7=null;
        Token this_END_BLOCK_9=null;
        Token otherlv_10=null;
        Token this_START_BLOCK_11=null;
        Token this_END_BLOCK_13=null;
        EObject lv_inputs_8_0 = null;

        EObject lv_operations_12_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1415:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:1416:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:1416:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) ) )
            // InternalRM.g:1417:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) )
            {
            // InternalRM.g:1417:3: ()
            // InternalRM.g:1418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypeBodyAccess().getEInterfaceTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:1424:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) ) )
            // InternalRM.g:1425:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) )
            {
            // InternalRM.g:1425:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* ) )
            // InternalRM.g:1426:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:1429:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )* )
            // InternalRM.g:1430:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )*
            {
            // InternalRM.g:1430:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) )*
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
            	    // InternalRM.g:1431:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1431:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:1432:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:1432:115: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:1433:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:1436:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:1436:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRM.g:1436:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:1436:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEInterfaceTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:1440:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:1441:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:1441:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:1442:11: otherlv_3= RULE_QUALIFIED_NAME
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
            	    // InternalRM.g:1459:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1459:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:1460:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:1460:115: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:1461:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:1464:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:1464:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRM.g:1464:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:1464:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEInterfaceTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:1468:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:1469:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:1469:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:1470:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRM.g:1492:4: ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:1492:4: ({...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:1493:5: {...}? => ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:1493:115: ( ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:1494:6: ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:1497:9: ({...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            	    // InternalRM.g:1497:10: {...}? => (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRM.g:1497:19: (otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            	    // InternalRM.g:1497:20: otherlv_6= 'inputs' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_inputs_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	    {
            	    otherlv_6=(Token)match(input,31,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEInterfaceTypeBodyAccess().getInputsKeyword_1_2_0());
            	    								
            	    this_START_BLOCK_7=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_7, grammarAccess.getEInterfaceTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRM.g:1505:9: ( (lv_inputs_8_0= ruleEProperties ) )
            	    // InternalRM.g:1506:10: (lv_inputs_8_0= ruleEProperties )
            	    {
            	    // InternalRM.g:1506:10: (lv_inputs_8_0= ruleEProperties )
            	    // InternalRM.g:1507:11: lv_inputs_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getEInterfaceTypeBodyAccess().getInputsEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_inputs_8_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inputs",
            	    												lv_inputs_8_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_21); 

            	    									newLeafNode(this_END_BLOCK_9, grammarAccess.getEInterfaceTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:1534:4: ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:1534:4: ({...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:1535:5: {...}? => ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:1535:115: ( ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:1536:6: ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:1539:9: ({...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK ) )
            	    // InternalRM.g:1539:10: {...}? => (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRM.g:1539:19: (otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK )
            	    // InternalRM.g:1539:20: otherlv_10= 'operations' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_operations_12_0= ruleEOperations ) ) this_END_BLOCK_13= RULE_END_BLOCK
            	    {
            	    otherlv_10=(Token)match(input,32,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEInterfaceTypeBodyAccess().getOperationsKeyword_1_3_0());
            	    								
            	    this_START_BLOCK_11=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_11, grammarAccess.getEInterfaceTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRM.g:1547:9: ( (lv_operations_12_0= ruleEOperations ) )
            	    // InternalRM.g:1548:10: (lv_operations_12_0= ruleEOperations )
            	    {
            	    // InternalRM.g:1548:10: (lv_operations_12_0= ruleEOperations )
            	    // InternalRM.g:1549:11: lv_operations_12_0= ruleEOperations
            	    {

            	    											newCompositeNode(grammarAccess.getEInterfaceTypeBodyAccess().getOperationsEOperationsParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_operations_12_0=ruleEOperations();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"operations",
            	    												lv_operations_12_0,
            	    												"org.sodalite.dsl.RM.EOperations");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_13=(Token)match(input,RULE_END_BLOCK,FOLLOW_21); 

            	    									newLeafNode(this_END_BLOCK_13, grammarAccess.getEInterfaceTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_3_3());
            	    								

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
    // InternalRM.g:1587:1: entryRuleEPolicyTypes returns [EObject current=null] : iv_ruleEPolicyTypes= ruleEPolicyTypes EOF ;
    public final EObject entryRuleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypes = null;


        try {
            // InternalRM.g:1587:53: (iv_ruleEPolicyTypes= ruleEPolicyTypes EOF )
            // InternalRM.g:1588:2: iv_ruleEPolicyTypes= ruleEPolicyTypes EOF
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
    // InternalRM.g:1594:1: ruleEPolicyTypes returns [EObject current=null] : ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) ;
    public final EObject ruleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_policyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1600:2: ( ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) )
            // InternalRM.g:1601:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            {
            // InternalRM.g:1601:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            // InternalRM.g:1602:3: () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            {
            // InternalRM.g:1602:3: ()
            // InternalRM.g:1603:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypesAccess().getEPolicyTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1609:3: ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
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
            	    // InternalRM.g:1610:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    {
            	    // InternalRM.g:1610:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    // InternalRM.g:1611:5: lv_policyTypes_1_0= ruleEPolicyType
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
    // InternalRM.g:1632:1: entryRuleEPolicyType returns [EObject current=null] : iv_ruleEPolicyType= ruleEPolicyType EOF ;
    public final EObject entryRuleEPolicyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyType = null;


        try {
            // InternalRM.g:1632:52: (iv_ruleEPolicyType= ruleEPolicyType EOF )
            // InternalRM.g:1633:2: iv_ruleEPolicyType= ruleEPolicyType EOF
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
    // InternalRM.g:1639:1: ruleEPolicyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_policy_2_0= ruleEPolicyTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleEPolicyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_policy_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1645:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_policy_2_0= ruleEPolicyTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:1646:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_policy_2_0= ruleEPolicyTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:1646:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_policy_2_0= ruleEPolicyTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:1647:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_policy_2_0= ruleEPolicyTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:1647:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1648:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1648:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1649:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_22); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getEPolicyTypeAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:1669:3: ( (lv_policy_2_0= ruleEPolicyTypeBody ) )
            // InternalRM.g:1670:4: (lv_policy_2_0= ruleEPolicyTypeBody )
            {
            // InternalRM.g:1670:4: (lv_policy_2_0= ruleEPolicyTypeBody )
            // InternalRM.g:1671:5: lv_policy_2_0= ruleEPolicyTypeBody
            {

            					newCompositeNode(grammarAccess.getEPolicyTypeAccess().getPolicyEPolicyTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getEPolicyTypeAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:1696:1: entryRuleEPolicyTypeBody returns [EObject current=null] : iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF ;
    public final EObject entryRuleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypeBody = null;


        try {
            // InternalRM.g:1696:56: (iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF )
            // InternalRM.g:1697:2: iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF
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
    // InternalRM.g:1703:1: ruleEPolicyTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;


        	enterRule();

        try {
            // InternalRM.g:1709:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:1710:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:1710:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRM.g:1711:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRM.g:1711:3: ()
            // InternalRM.g:1712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypeBodyAccess().getEPolicyTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:1718:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRM.g:1719:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRM.g:1719:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRM.g:1720:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:1723:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRM.g:1724:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRM.g:1724:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
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
            	    // InternalRM.g:1725:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1725:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:1726:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:1726:112: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:1727:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:1730:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:1730:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRM.g:1730:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:1730:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEPolicyTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:1734:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:1735:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:1735:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:1736:11: otherlv_3= RULE_QUALIFIED_NAME
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
            	    // InternalRM.g:1753:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1753:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:1754:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:1754:112: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:1755:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:1758:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:1758:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRM.g:1758:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:1758:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEPolicyTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:1762:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:1763:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:1763:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:1764:11: lv_description_5_0= RULE_STRING
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
    // InternalRM.g:1797:1: entryRuleENodeTypes returns [EObject current=null] : iv_ruleENodeTypes= ruleENodeTypes EOF ;
    public final EObject entryRuleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypes = null;


        try {
            // InternalRM.g:1797:51: (iv_ruleENodeTypes= ruleENodeTypes EOF )
            // InternalRM.g:1798:2: iv_ruleENodeTypes= ruleENodeTypes EOF
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
    // InternalRM.g:1804:1: ruleENodeTypes returns [EObject current=null] : ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) ;
    public final EObject ruleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1810:2: ( ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) )
            // InternalRM.g:1811:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            {
            // InternalRM.g:1811:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            // InternalRM.g:1812:3: () ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            {
            // InternalRM.g:1812:3: ()
            // InternalRM.g:1813:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypesAccess().getENodeTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:1819:3: ( (lv_nodeTypes_1_0= ruleENodeType ) )+
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
            	    // InternalRM.g:1820:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    {
            	    // InternalRM.g:1820:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    // InternalRM.g:1821:5: lv_nodeTypes_1_0= ruleENodeType
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
    // InternalRM.g:1842:1: entryRuleENodeType returns [EObject current=null] : iv_ruleENodeType= ruleENodeType EOF ;
    public final EObject entryRuleENodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeType = null;


        try {
            // InternalRM.g:1842:50: (iv_ruleENodeType= ruleENodeType EOF )
            // InternalRM.g:1843:2: iv_ruleENodeType= ruleENodeType EOF
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
    // InternalRM.g:1849:1: ruleENodeType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_node_2_0= ruleENodeTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleENodeType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_node_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1855:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_node_2_0= ruleENodeTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:1856:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_node_2_0= ruleENodeTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:1856:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_node_2_0= ruleENodeTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:1857:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_node_2_0= ruleENodeTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:1857:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:1858:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:1858:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:1859:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_24); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getENodeTypeAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:1879:3: ( (lv_node_2_0= ruleENodeTypeBody ) )
            // InternalRM.g:1880:4: (lv_node_2_0= ruleENodeTypeBody )
            {
            // InternalRM.g:1880:4: (lv_node_2_0= ruleENodeTypeBody )
            // InternalRM.g:1881:5: lv_node_2_0= ruleENodeTypeBody
            {

            					newCompositeNode(grammarAccess.getENodeTypeAccess().getNodeENodeTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getENodeTypeAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:1906:1: entryRuleENodeTypeBody returns [EObject current=null] : iv_ruleENodeTypeBody= ruleENodeTypeBody EOF ;
    public final EObject entryRuleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypeBody = null;


        try {
            // InternalRM.g:1906:54: (iv_ruleENodeTypeBody= ruleENodeTypeBody EOF )
            // InternalRM.g:1907:2: iv_ruleENodeTypeBody= ruleENodeTypeBody EOF
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
    // InternalRM.g:1913:1: ruleENodeTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_START_BLOCK_7=null;
        Token this_END_BLOCK_9=null;
        Token otherlv_10=null;
        Token this_START_BLOCK_11=null;
        Token this_END_BLOCK_13=null;
        Token otherlv_14=null;
        Token this_START_BLOCK_15=null;
        Token this_END_BLOCK_17=null;
        Token otherlv_18=null;
        Token this_START_BLOCK_19=null;
        Token this_END_BLOCK_21=null;
        Token otherlv_22=null;
        Token this_START_BLOCK_23=null;
        Token this_END_BLOCK_25=null;
        EObject lv_properties_8_0 = null;

        EObject lv_attributes_12_0 = null;

        EObject lv_interfaces_16_0 = null;

        EObject lv_capabilities_20_0 = null;

        EObject lv_requirements_24_0 = null;



        	enterRule();

        try {
            // InternalRM.g:1919:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:1920:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:1920:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )* ) ) ) )
            // InternalRM.g:1921:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )* ) ) )
            {
            // InternalRM.g:1921:3: ()
            // InternalRM.g:1922:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypeBodyAccess().getENodeTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:1928:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )* ) ) )
            // InternalRM.g:1929:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )* ) )
            {
            // InternalRM.g:1929:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )* ) )
            // InternalRM.g:1930:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:1933:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )* )
            // InternalRM.g:1934:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )*
            {
            // InternalRM.g:1934:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) ) )*
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
            	    // InternalRM.g:1935:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1935:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:1936:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:1936:110: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:1937:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:1940:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:1940:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:1940:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:1940:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getENodeTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:1944:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:1945:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:1945:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:1946:11: otherlv_3= RULE_QUALIFIED_NAME
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
            	    // InternalRM.g:1963:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:1963:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:1964:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:1964:110: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:1965:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:1968:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:1968:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:1968:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:1968:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getENodeTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:1972:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:1973:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:1973:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:1974:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRM.g:1996:4: ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:1996:4: ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:1997:5: {...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:1997:110: ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:1998:6: ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:2001:9: ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            	    // InternalRM.g:2001:10: {...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:2001:19: (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            	    // InternalRM.g:2001:20: otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getENodeTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_START_BLOCK_7=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_7, grammarAccess.getENodeTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRM.g:2009:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRM.g:2010:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRM.g:2010:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRM.g:2011:11: lv_properties_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_properties_8_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_8_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	    									newLeafNode(this_END_BLOCK_9, grammarAccess.getENodeTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:2038:4: ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:2038:4: ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:2039:5: {...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:2039:110: ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:2040:6: ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:2043:9: ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) )
            	    // InternalRM.g:2043:10: {...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:2043:19: (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK )
            	    // InternalRM.g:2043:20: otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK
            	    {
            	    otherlv_10=(Token)match(input,30,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getENodeTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_START_BLOCK_11=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_11, grammarAccess.getENodeTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRM.g:2051:9: ( (lv_attributes_12_0= ruleEAttributes ) )
            	    // InternalRM.g:2052:10: (lv_attributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRM.g:2052:10: (lv_attributes_12_0= ruleEAttributes )
            	    // InternalRM.g:2053:11: lv_attributes_12_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getAttributesEAttributesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_attributes_12_0=ruleEAttributes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"attributes",
            	    												lv_attributes_12_0,
            	    												"org.sodalite.dsl.RM.EAttributes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_13=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	    									newLeafNode(this_END_BLOCK_13, grammarAccess.getENodeTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRM.g:2080:4: ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:2080:4: ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:2081:5: {...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRM.g:2081:110: ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:2082:6: ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRM.g:2085:9: ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) )
            	    // InternalRM.g:2085:10: {...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:2085:19: (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK )
            	    // InternalRM.g:2085:20: otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK
            	    {
            	    otherlv_14=(Token)match(input,33,FOLLOW_3); 

            	    									newLeafNode(otherlv_14, grammarAccess.getENodeTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    this_START_BLOCK_15=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_15, grammarAccess.getENodeTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_4_1());
            	    								
            	    // InternalRM.g:2093:9: ( (lv_interfaces_16_0= ruleEInterfaces ) )
            	    // InternalRM.g:2094:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    {
            	    // InternalRM.g:2094:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    // InternalRM.g:2095:11: lv_interfaces_16_0= ruleEInterfaces
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getInterfacesEInterfacesParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_interfaces_16_0=ruleEInterfaces();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"interfaces",
            	    												lv_interfaces_16_0,
            	    												"org.sodalite.dsl.RM.EInterfaces");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	    									newLeafNode(this_END_BLOCK_17, grammarAccess.getENodeTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_4_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRM.g:2122:4: ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:2122:4: ({...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:2123:5: {...}? => ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRM.g:2123:110: ( ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:2124:6: ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRM.g:2127:9: ({...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK ) )
            	    // InternalRM.g:2127:10: {...}? => (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:2127:19: (otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK )
            	    // InternalRM.g:2127:20: otherlv_18= 'capabilities' this_START_BLOCK_19= RULE_START_BLOCK ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_BLOCK_21= RULE_END_BLOCK
            	    {
            	    otherlv_18=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_18, grammarAccess.getENodeTypeBodyAccess().getCapabilitiesKeyword_1_5_0());
            	    								
            	    this_START_BLOCK_19=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_19, grammarAccess.getENodeTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_5_1());
            	    								
            	    // InternalRM.g:2135:9: ( (lv_capabilities_20_0= ruleECapabilities ) )
            	    // InternalRM.g:2136:10: (lv_capabilities_20_0= ruleECapabilities )
            	    {
            	    // InternalRM.g:2136:10: (lv_capabilities_20_0= ruleECapabilities )
            	    // InternalRM.g:2137:11: lv_capabilities_20_0= ruleECapabilities
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getCapabilitiesECapabilitiesParserRuleCall_1_5_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_capabilities_20_0=ruleECapabilities();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"capabilities",
            	    												lv_capabilities_20_0,
            	    												"org.sodalite.dsl.RM.ECapabilities");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_21=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	    									newLeafNode(this_END_BLOCK_21, grammarAccess.getENodeTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRM.g:2164:4: ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:2164:4: ({...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:2165:5: {...}? => ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalRM.g:2165:110: ( ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:2166:6: ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalRM.g:2169:9: ({...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK ) )
            	    // InternalRM.g:2169:10: {...}? => (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRM.g:2169:19: (otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK )
            	    // InternalRM.g:2169:20: otherlv_22= 'requirements' this_START_BLOCK_23= RULE_START_BLOCK ( (lv_requirements_24_0= ruleERequirements ) ) this_END_BLOCK_25= RULE_END_BLOCK
            	    {
            	    otherlv_22=(Token)match(input,35,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getENodeTypeBodyAccess().getRequirementsKeyword_1_6_0());
            	    								
            	    this_START_BLOCK_23=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_23, grammarAccess.getENodeTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_6_1());
            	    								
            	    // InternalRM.g:2177:9: ( (lv_requirements_24_0= ruleERequirements ) )
            	    // InternalRM.g:2178:10: (lv_requirements_24_0= ruleERequirements )
            	    {
            	    // InternalRM.g:2178:10: (lv_requirements_24_0= ruleERequirements )
            	    // InternalRM.g:2179:11: lv_requirements_24_0= ruleERequirements
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getRequirementsERequirementsParserRuleCall_1_6_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_requirements_24_0=ruleERequirements();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"requirements",
            	    												lv_requirements_24_0,
            	    												"org.sodalite.dsl.RM.ERequirements");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_25=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	    									newLeafNode(this_END_BLOCK_25, grammarAccess.getENodeTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_6_3());
            	    								

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
    // InternalRM.g:2217:1: entryRuleERelationshipTypes returns [EObject current=null] : iv_ruleERelationshipTypes= ruleERelationshipTypes EOF ;
    public final EObject entryRuleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypes = null;


        try {
            // InternalRM.g:2217:59: (iv_ruleERelationshipTypes= ruleERelationshipTypes EOF )
            // InternalRM.g:2218:2: iv_ruleERelationshipTypes= ruleERelationshipTypes EOF
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
    // InternalRM.g:2224:1: ruleERelationshipTypes returns [EObject current=null] : ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) ;
    public final EObject ruleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_relationshipTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2230:2: ( ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) )
            // InternalRM.g:2231:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            {
            // InternalRM.g:2231:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            // InternalRM.g:2232:3: () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            {
            // InternalRM.g:2232:3: ()
            // InternalRM.g:2233:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypesAccess().getERelationshipTypesAction_0(),
            					current);
            			

            }

            // InternalRM.g:2239:3: ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
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
            	    // InternalRM.g:2240:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    {
            	    // InternalRM.g:2240:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    // InternalRM.g:2241:5: lv_relationshipTypes_1_0= ruleERelationshipType
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
    // InternalRM.g:2262:1: entryRuleERelationshipType returns [EObject current=null] : iv_ruleERelationshipType= ruleERelationshipType EOF ;
    public final EObject entryRuleERelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipType = null;


        try {
            // InternalRM.g:2262:58: (iv_ruleERelationshipType= ruleERelationshipType EOF )
            // InternalRM.g:2263:2: iv_ruleERelationshipType= ruleERelationshipType EOF
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
    // InternalRM.g:2269:1: ruleERelationshipType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_relationship_2_0= ruleERelationshipTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleERelationshipType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_relationship_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2275:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_relationship_2_0= ruleERelationshipTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:2276:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_relationship_2_0= ruleERelationshipTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:2276:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_relationship_2_0= ruleERelationshipTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:2277:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_relationship_2_0= ruleERelationshipTypeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:2277:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:2278:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:2278:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:2279:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_26); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getERelationshipTypeAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:2299:3: ( (lv_relationship_2_0= ruleERelationshipTypeBody ) )
            // InternalRM.g:2300:4: (lv_relationship_2_0= ruleERelationshipTypeBody )
            {
            // InternalRM.g:2300:4: (lv_relationship_2_0= ruleERelationshipTypeBody )
            // InternalRM.g:2301:5: lv_relationship_2_0= ruleERelationshipTypeBody
            {

            					newCompositeNode(grammarAccess.getERelationshipTypeAccess().getRelationshipERelationshipTypeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getERelationshipTypeAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:2326:1: entryRuleERelationshipTypeBody returns [EObject current=null] : iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF ;
    public final EObject entryRuleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypeBody = null;


        try {
            // InternalRM.g:2326:62: (iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF )
            // InternalRM.g:2327:2: iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF
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
    // InternalRM.g:2333:1: ruleERelationshipTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_START_BLOCK_7=null;
        Token this_END_BLOCK_9=null;
        Token otherlv_10=null;
        Token this_START_BLOCK_11=null;
        Token this_END_BLOCK_13=null;
        Token otherlv_14=null;
        Token this_START_BLOCK_15=null;
        Token this_END_BLOCK_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        EObject lv_properties_8_0 = null;

        EObject lv_atributes_12_0 = null;

        EObject lv_interfaces_16_0 = null;

        EObject lv_valid_target_types_19_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2339:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:2340:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:2340:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )* ) ) ) )
            // InternalRM.g:2341:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )* ) ) )
            {
            // InternalRM.g:2341:3: ()
            // InternalRM.g:2342:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypeBodyAccess().getERelationshipTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:2348:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )* ) ) )
            // InternalRM.g:2349:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )* ) )
            {
            // InternalRM.g:2349:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )* ) )
            // InternalRM.g:2350:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:2353:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )* )
            // InternalRM.g:2354:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )*
            {
            // InternalRM.g:2354:6: ( ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) ) )*
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
            	    // InternalRM.g:2355:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2355:4: ({...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:2356:5: {...}? => ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:2356:118: ( ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:2357:6: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:2360:9: ({...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:2360:10: {...}? => (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2360:19: (otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:2360:20: otherlv_2= 'derived_from:' ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getERelationshipTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRM.g:2364:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:2365:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:2365:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:2366:11: otherlv_3= RULE_QUALIFIED_NAME
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
            	    // InternalRM.g:2383:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2383:4: ({...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:2384:5: {...}? => ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:2384:118: ( ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:2385:6: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:2388:9: ({...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:2388:10: {...}? => (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2388:19: (otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRM.g:2388:20: otherlv_4= 'description:' ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_4, grammarAccess.getERelationshipTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRM.g:2392:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRM.g:2393:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRM.g:2393:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRM.g:2394:11: lv_description_5_0= RULE_STRING
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
            	    // InternalRM.g:2416:4: ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:2416:4: ({...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:2417:5: {...}? => ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:2417:118: ( ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:2418:6: ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:2421:9: ({...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            	    // InternalRM.g:2421:10: {...}? => (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2421:19: (otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            	    // InternalRM.g:2421:20: otherlv_6= 'properties' this_START_BLOCK_7= RULE_START_BLOCK ( (lv_properties_8_0= ruleEProperties ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getERelationshipTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_START_BLOCK_7=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_7, grammarAccess.getERelationshipTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRM.g:2429:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRM.g:2430:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRM.g:2430:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRM.g:2431:11: lv_properties_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_properties_8_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_8_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

            	    									newLeafNode(this_END_BLOCK_9, grammarAccess.getERelationshipTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:2458:4: ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:2458:4: ({...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:2459:5: {...}? => ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRM.g:2459:118: ( ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:2460:6: ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRM.g:2463:9: ({...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK ) )
            	    // InternalRM.g:2463:10: {...}? => (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2463:19: (otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK )
            	    // InternalRM.g:2463:20: otherlv_10= 'attributes' this_START_BLOCK_11= RULE_START_BLOCK ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_BLOCK_13= RULE_END_BLOCK
            	    {
            	    otherlv_10=(Token)match(input,30,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getERelationshipTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_START_BLOCK_11=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_11, grammarAccess.getERelationshipTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRM.g:2471:9: ( (lv_atributes_12_0= ruleEAttributes ) )
            	    // InternalRM.g:2472:10: (lv_atributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRM.g:2472:10: (lv_atributes_12_0= ruleEAttributes )
            	    // InternalRM.g:2473:11: lv_atributes_12_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getAtributesEAttributesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_atributes_12_0=ruleEAttributes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"atributes",
            	    												lv_atributes_12_0,
            	    												"org.sodalite.dsl.RM.EAttributes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_13=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

            	    									newLeafNode(this_END_BLOCK_13, grammarAccess.getERelationshipTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRM.g:2500:4: ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:2500:4: ({...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:2501:5: {...}? => ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRM.g:2501:118: ( ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:2502:6: ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRM.g:2505:9: ({...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK ) )
            	    // InternalRM.g:2505:10: {...}? => (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2505:19: (otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK )
            	    // InternalRM.g:2505:20: otherlv_14= 'interfaces' this_START_BLOCK_15= RULE_START_BLOCK ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_BLOCK_17= RULE_END_BLOCK
            	    {
            	    otherlv_14=(Token)match(input,33,FOLLOW_3); 

            	    									newLeafNode(otherlv_14, grammarAccess.getERelationshipTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    this_START_BLOCK_15=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_15, grammarAccess.getERelationshipTypeBodyAccess().getSTART_BLOCKTerminalRuleCall_1_4_1());
            	    								
            	    // InternalRM.g:2513:9: ( (lv_interfaces_16_0= ruleEInterfaces ) )
            	    // InternalRM.g:2514:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    {
            	    // InternalRM.g:2514:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    // InternalRM.g:2515:11: lv_interfaces_16_0= ruleEInterfaces
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getInterfacesEInterfacesParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_interfaces_16_0=ruleEInterfaces();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"interfaces",
            	    												lv_interfaces_16_0,
            	    												"org.sodalite.dsl.RM.EInterfaces");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

            	    									newLeafNode(this_END_BLOCK_17, grammarAccess.getERelationshipTypeBodyAccess().getEND_BLOCKTerminalRuleCall_1_4_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRM.g:2542:4: ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) )
            	    {
            	    // InternalRM.g:2542:4: ({...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) ) )
            	    // InternalRM.g:2543:5: {...}? => ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRM.g:2543:118: ( ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) ) )
            	    // InternalRM.g:2544:6: ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRM.g:2547:9: ({...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' ) )
            	    // InternalRM.g:2547:10: {...}? => (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRM.g:2547:19: (otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']' )
            	    // InternalRM.g:2547:20: otherlv_18= 'valid_target_types:[' ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) ) otherlv_20= ']'
            	    {
            	    otherlv_18=(Token)match(input,36,FOLLOW_7); 

            	    									newLeafNode(otherlv_18, grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesKeyword_1_5_0());
            	    								
            	    // InternalRM.g:2551:9: ( (lv_valid_target_types_19_0= ruleEValidTargetTypes ) )
            	    // InternalRM.g:2552:10: (lv_valid_target_types_19_0= ruleEValidTargetTypes )
            	    {
            	    // InternalRM.g:2552:10: (lv_valid_target_types_19_0= ruleEValidTargetTypes )
            	    // InternalRM.g:2553:11: lv_valid_target_types_19_0= ruleEValidTargetTypes
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesEValidTargetTypesParserRuleCall_1_5_1_0());
            	    										
            	    pushFollow(FOLLOW_28);
            	    lv_valid_target_types_19_0=ruleEValidTargetTypes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"valid_target_types",
            	    												lv_valid_target_types_19_0,
            	    												"org.sodalite.dsl.RM.EValidTargetTypes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_20=(Token)match(input,37,FOLLOW_27); 

            	    									newLeafNode(otherlv_20, grammarAccess.getERelationshipTypeBodyAccess().getRightSquareBracketKeyword_1_5_2());
            	    								

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


    // $ANTLR start "entryRuleEValidTargetTypes"
    // InternalRM.g:2591:1: entryRuleEValidTargetTypes returns [EObject current=null] : iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF ;
    public final EObject entryRuleEValidTargetTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidTargetTypes = null;


        try {
            // InternalRM.g:2591:58: (iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF )
            // InternalRM.g:2592:2: iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF
            {
             newCompositeNode(grammarAccess.getEValidTargetTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValidTargetTypes=ruleEValidTargetTypes();

            state._fsp--;

             current =iv_ruleEValidTargetTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEValidTargetTypes"


    // $ANTLR start "ruleEValidTargetTypes"
    // InternalRM.g:2598:1: ruleEValidTargetTypes returns [EObject current=null] : ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* ) ;
    public final EObject ruleEValidTargetTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_targetTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2604:2: ( ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* ) )
            // InternalRM.g:2605:2: ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* )
            {
            // InternalRM.g:2605:2: ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* )
            // InternalRM.g:2606:3: ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )*
            {
            // InternalRM.g:2606:3: ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) )
            // InternalRM.g:2607:4: (lv_targetTypes_0_0= ruleECapabilityTypeRef )
            {
            // InternalRM.g:2607:4: (lv_targetTypes_0_0= ruleECapabilityTypeRef )
            // InternalRM.g:2608:5: lv_targetTypes_0_0= ruleECapabilityTypeRef
            {

            					newCompositeNode(grammarAccess.getEValidTargetTypesAccess().getTargetTypesECapabilityTypeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_targetTypes_0_0=ruleECapabilityTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEValidTargetTypesRule());
            					}
            					add(
            						current,
            						"targetTypes",
            						lv_targetTypes_0_0,
            						"org.sodalite.dsl.RM.ECapabilityTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRM.g:2625:3: (otherlv_1= ',' ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRM.g:2626:4: otherlv_1= ',' ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidTargetTypesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRM.g:2630:4: ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) )
            	    // InternalRM.g:2631:5: (lv_sourceType_2_0= ruleECapabilityTypeRef )
            	    {
            	    // InternalRM.g:2631:5: (lv_sourceType_2_0= ruleECapabilityTypeRef )
            	    // InternalRM.g:2632:6: lv_sourceType_2_0= ruleECapabilityTypeRef
            	    {

            	    						newCompositeNode(grammarAccess.getEValidTargetTypesAccess().getSourceTypeECapabilityTypeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_sourceType_2_0=ruleECapabilityTypeRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEValidTargetTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sourceType",
            	    							lv_sourceType_2_0,
            	    							"org.sodalite.dsl.RM.ECapabilityTypeRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleEValidTargetTypes"


    // $ANTLR start "entryRuleECapabilityTypeRef"
    // InternalRM.g:2654:1: entryRuleECapabilityTypeRef returns [EObject current=null] : iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF ;
    public final EObject entryRuleECapabilityTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeRef = null;


        try {
            // InternalRM.g:2654:59: (iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF )
            // InternalRM.g:2655:2: iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF
            {
             newCompositeNode(grammarAccess.getECapabilityTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityTypeRef=ruleECapabilityTypeRef();

            state._fsp--;

             current =iv_ruleECapabilityTypeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityTypeRef"


    // $ANTLR start "ruleECapabilityTypeRef"
    // InternalRM.g:2661:1: ruleECapabilityTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_QUALIFIED_NAME ) ) ;
    public final EObject ruleECapabilityTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRM.g:2667:2: ( ( (otherlv_0= RULE_QUALIFIED_NAME ) ) )
            // InternalRM.g:2668:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalRM.g:2668:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:2669:3: (otherlv_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:2669:3: (otherlv_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:2670:4: otherlv_0= RULE_QUALIFIED_NAME
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getECapabilityTypeRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getECapabilityTypeRefAccess().getNameECapabilityTypeCrossReference_0());
            			

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
    // $ANTLR end "ruleECapabilityTypeRef"


    // $ANTLR start "entryRuleEProperties"
    // InternalRM.g:2684:1: entryRuleEProperties returns [EObject current=null] : iv_ruleEProperties= ruleEProperties EOF ;
    public final EObject entryRuleEProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProperties = null;


        try {
            // InternalRM.g:2684:52: (iv_ruleEProperties= ruleEProperties EOF )
            // InternalRM.g:2685:2: iv_ruleEProperties= ruleEProperties EOF
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
    // InternalRM.g:2691:1: ruleEProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) ;
    public final EObject ruleEProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2697:2: ( ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) )
            // InternalRM.g:2698:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            {
            // InternalRM.g:2698:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            // InternalRM.g:2699:3: () ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            {
            // InternalRM.g:2699:3: ()
            // InternalRM.g:2700:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPropertiesAccess().getEPropertiesAction_0(),
            					current);
            			

            }

            // InternalRM.g:2706:3: ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRM.g:2707:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    {
            	    // InternalRM.g:2707:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    // InternalRM.g:2708:5: lv_properties_1_0= ruleEPropertyDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEPropertiesAccess().getPropertiesEPropertyDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop19;
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
    // InternalRM.g:2729:1: entryRuleEPropertyDefinition returns [EObject current=null] : iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF ;
    public final EObject entryRuleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinition = null;


        try {
            // InternalRM.g:2729:60: (iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF )
            // InternalRM.g:2730:2: iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF
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
    // InternalRM.g:2736:1: ruleEPropertyDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_property_2_0= ruleEPropertyDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_property_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2742:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_property_2_0= ruleEPropertyDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:2743:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_property_2_0= ruleEPropertyDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:2743:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_property_2_0= ruleEPropertyDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:2744:3: ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_property_2_0= ruleEPropertyDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:2744:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:2745:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:2745:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:2746:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_31); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getEPropertyDefinitionAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:2766:3: ( (lv_property_2_0= ruleEPropertyDefinitionBody ) )
            // InternalRM.g:2767:4: (lv_property_2_0= ruleEPropertyDefinitionBody )
            {
            // InternalRM.g:2767:4: (lv_property_2_0= ruleEPropertyDefinitionBody )
            // InternalRM.g:2768:5: lv_property_2_0= ruleEPropertyDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEPropertyDefinitionAccess().getPropertyEPropertyDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getEPropertyDefinitionAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:2793:1: entryRuleEPropertyDefinitionBody returns [EObject current=null] : iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF ;
    public final EObject entryRuleEPropertyDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinitionBody = null;


        try {
            // InternalRM.g:2793:64: (iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF )
            // InternalRM.g:2794:2: iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF
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
    // InternalRM.g:2800:1: ruleEPropertyDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
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
        Token this_START_BLOCK_12=null;
        Token this_END_BLOCK_14=null;
        Token otherlv_15=null;
        EObject lv_default_8_0 = null;

        EObject lv_constraints_13_0 = null;



        	enterRule();

        try {
            // InternalRM.g:2806:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:2807:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:2807:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:2808:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:2808:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRM.g:2809:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:2812:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRM.g:2813:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRM.g:2813:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=8;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt20=3;
                }
                else if ( LA20_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt20=4;
                }
                else if ( LA20_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt20=5;
                }
                else if ( LA20_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
                    alt20=6;
                }
                else if ( LA20_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
                    alt20=7;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRM.g:2814:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2814:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:2815:4: {...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:2815:117: ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:2816:5: ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:2819:8: ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:2819:9: {...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2819:18: (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:2819:19: otherlv_1= 'type:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPropertyDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRM.g:2823:8: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:2824:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:2824:9: ( ruleEDataTypeName )
            	    // InternalRM.g:2825:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getTypeEDataTypeCrossReference_0_1_0());
            	    									
            	    pushFollow(FOLLOW_32);
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
            	    // InternalRM.g:2845:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2845:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:2846:4: {...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:2846:117: ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:2847:5: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:2850:8: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:2850:9: {...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2850:18: (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRM.g:2850:19: otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_11); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPropertyDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRM.g:2854:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRM.g:2855:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRM.g:2855:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRM.g:2856:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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
            	    // InternalRM.g:2878:3: ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2878:3: ({...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalRM.g:2879:4: {...}? => ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:2879:117: ( ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalRM.g:2880:5: ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:2883:8: ({...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalRM.g:2883:9: {...}? => (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2883:18: (otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    // InternalRM.g:2883:19: otherlv_5= 'required:' ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,40,FOLLOW_33); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPropertyDefinitionBodyAccess().getRequiredKeyword_2_0());
            	    							
            	    // InternalRM.g:2887:8: ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    // InternalRM.g:2888:9: (lv_required_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalRM.g:2888:9: (lv_required_6_0= RULE_BOOLEAN )
            	    // InternalRM.g:2889:10: lv_required_6_0= RULE_BOOLEAN
            	    {
            	    lv_required_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_32); 

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
            	    // InternalRM.g:2911:3: ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2911:3: ({...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRM.g:2912:4: {...}? => ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRM.g:2912:117: ( ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRM.g:2913:5: ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRM.g:2916:8: ({...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    // InternalRM.g:2916:9: {...}? => (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2916:18: (otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    // InternalRM.g:2916:19: otherlv_7= 'default:' ( (lv_default_8_0= ruleEValueExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,41,FOLLOW_34); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultKeyword_3_0());
            	    							
            	    // InternalRM.g:2920:8: ( (lv_default_8_0= ruleEValueExpression ) )
            	    // InternalRM.g:2921:9: (lv_default_8_0= ruleEValueExpression )
            	    {
            	    // InternalRM.g:2921:9: (lv_default_8_0= ruleEValueExpression )
            	    // InternalRM.g:2922:10: lv_default_8_0= ruleEValueExpression
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_32);
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
            	    // InternalRM.g:2945:3: ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:2945:3: ({...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:2946:4: {...}? => ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRM.g:2946:117: ( ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:2947:5: ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRM.g:2950:8: ({...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:2950:9: {...}? => (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2950:18: (otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) ) )
            	    // InternalRM.g:2950:19: otherlv_9= 'status:' ( (lv_status_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,42,FOLLOW_11); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPropertyDefinitionBodyAccess().getStatusKeyword_4_0());
            	    							
            	    // InternalRM.g:2954:8: ( (lv_status_10_0= RULE_STRING ) )
            	    // InternalRM.g:2955:9: (lv_status_10_0= RULE_STRING )
            	    {
            	    // InternalRM.g:2955:9: (lv_status_10_0= RULE_STRING )
            	    // InternalRM.g:2956:10: lv_status_10_0= RULE_STRING
            	    {
            	    lv_status_10_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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
            	    // InternalRM.g:2978:3: ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:2978:3: ({...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:2979:4: {...}? => ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRM.g:2979:117: ( ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:2980:5: ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRM.g:2983:8: ({...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK ) )
            	    // InternalRM.g:2983:9: {...}? => (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:2983:18: (otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK )
            	    // InternalRM.g:2983:19: otherlv_11= 'constraints' this_START_BLOCK_12= RULE_START_BLOCK ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_BLOCK_14= RULE_END_BLOCK
            	    {
            	    otherlv_11=(Token)match(input,26,FOLLOW_3); 

            	    								newLeafNode(otherlv_11, grammarAccess.getEPropertyDefinitionBodyAccess().getConstraintsKeyword_5_0());
            	    							
            	    this_START_BLOCK_12=(Token)match(input,RULE_START_BLOCK,FOLLOW_12); 

            	    								newLeafNode(this_START_BLOCK_12, grammarAccess.getEPropertyDefinitionBodyAccess().getSTART_BLOCKTerminalRuleCall_5_1());
            	    							
            	    // InternalRM.g:2991:8: ( (lv_constraints_13_0= ruleEConstraints ) )
            	    // InternalRM.g:2992:9: (lv_constraints_13_0= ruleEConstraints )
            	    {
            	    // InternalRM.g:2992:9: (lv_constraints_13_0= ruleEConstraints )
            	    // InternalRM.g:2993:10: lv_constraints_13_0= ruleEConstraints
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getConstraintsEConstraintsParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_constraints_13_0=ruleEConstraints();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"constraints",
            	    											lv_constraints_13_0,
            	    											"org.sodalite.dsl.RM.EConstraints");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_14=(Token)match(input,RULE_END_BLOCK,FOLLOW_32); 

            	    								newLeafNode(this_END_BLOCK_14, grammarAccess.getEPropertyDefinitionBodyAccess().getEND_BLOCKTerminalRuleCall_5_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRM.g:3020:3: ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3020:3: ({...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:3021:4: {...}? => ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRM.g:3021:117: ( ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:3022:5: ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRM.g:3025:8: ({...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:3025:9: {...}? => (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3025:18: (otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:3025:19: otherlv_15= 'entry_schema:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_15=(Token)match(input,43,FOLLOW_4); 

            	    								newLeafNode(otherlv_15, grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaKeyword_6_0());
            	    							
            	    // InternalRM.g:3029:8: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:3030:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:3030:9: ( ruleEDataTypeName )
            	    // InternalRM.g:3031:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaEDataTypeCrossReference_6_1_0());
            	    									
            	    pushFollow(FOLLOW_32);
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // InternalRM.g:3062:1: entryRuleEAttributes returns [EObject current=null] : iv_ruleEAttributes= ruleEAttributes EOF ;
    public final EObject entryRuleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributes = null;


        try {
            // InternalRM.g:3062:52: (iv_ruleEAttributes= ruleEAttributes EOF )
            // InternalRM.g:3063:2: iv_ruleEAttributes= ruleEAttributes EOF
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
    // InternalRM.g:3069:1: ruleEAttributes returns [EObject current=null] : ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) ;
    public final EObject ruleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3075:2: ( ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) )
            // InternalRM.g:3076:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            {
            // InternalRM.g:3076:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            // InternalRM.g:3077:3: () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            {
            // InternalRM.g:3077:3: ()
            // InternalRM.g:3078:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributesAccess().getEAttributesAction_0(),
            					current);
            			

            }

            // InternalRM.g:3084:3: ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRM.g:3085:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    {
            	    // InternalRM.g:3085:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    // InternalRM.g:3086:5: lv_attributes_1_0= ruleEAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEAttributesAccess().getAttributesEAttributeDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop21;
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
    // InternalRM.g:3107:1: entryRuleEAttributeDefinition returns [EObject current=null] : iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF ;
    public final EObject entryRuleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinition = null;


        try {
            // InternalRM.g:3107:61: (iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF )
            // InternalRM.g:3108:2: iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF
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
    // InternalRM.g:3114:1: ruleEAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3120:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:3121:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:3121:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:3122:3: ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:3122:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:3123:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:3123:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:3124:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_35); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getEAttributeDefinitionAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:3144:3: ( (lv_attribute_2_0= ruleEAttributeDefinitionBody ) )
            // InternalRM.g:3145:4: (lv_attribute_2_0= ruleEAttributeDefinitionBody )
            {
            // InternalRM.g:3145:4: (lv_attribute_2_0= ruleEAttributeDefinitionBody )
            // InternalRM.g:3146:5: lv_attribute_2_0= ruleEAttributeDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEAttributeDefinitionAccess().getAttributeEAttributeDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getEAttributeDefinitionAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:3171:1: entryRuleEAttributeDefinitionBody returns [EObject current=null] : iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF ;
    public final EObject entryRuleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinitionBody = null;


        try {
            // InternalRM.g:3171:65: (iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF )
            // InternalRM.g:3172:2: iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF
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
    // InternalRM.g:3178:1: ruleEAttributeDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRM.g:3184:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:3185:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:3185:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:3186:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:3186:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRM.g:3187:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:3190:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRM.g:3191:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRM.g:3191:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=4;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt22=3;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRM.g:3192:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3192:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:3193:4: {...}? => ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:3193:118: ( ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:3194:5: ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:3197:8: ({...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:3197:9: {...}? => (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3197:18: (otherlv_1= 'type:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:3197:19: otherlv_1= 'type:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAttributeDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRM.g:3201:8: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:3202:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:3202:9: ( ruleEDataTypeName )
            	    // InternalRM.g:3203:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getTypeEDataTypeCrossReference_0_1_0());
            	    									
            	    pushFollow(FOLLOW_36);
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
            	    // InternalRM.g:3223:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3223:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:3224:4: {...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:3224:118: ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:3225:5: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:3228:8: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:3228:9: {...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3228:18: (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRM.g:3228:19: otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_11); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAttributeDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRM.g:3232:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRM.g:3233:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRM.g:3233:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRM.g:3234:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

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
            	    // InternalRM.g:3256:3: ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3256:3: ({...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:3257:4: {...}? => ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:3257:118: ( ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:3258:5: ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:3261:8: ({...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:3261:9: {...}? => (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3261:18: (otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:3261:19: otherlv_5= 'entry_schema:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_5=(Token)match(input,43,FOLLOW_4); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaKeyword_2_0());
            	    							
            	    // InternalRM.g:3265:8: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:3266:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:3266:9: ( ruleEDataTypeName )
            	    // InternalRM.g:3267:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaEDataTypeCrossReference_2_1_0());
            	    									
            	    pushFollow(FOLLOW_36);
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
    // InternalRM.g:3298:1: entryRuleEInterfaces returns [EObject current=null] : iv_ruleEInterfaces= ruleEInterfaces EOF ;
    public final EObject entryRuleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaces = null;


        try {
            // InternalRM.g:3298:52: (iv_ruleEInterfaces= ruleEInterfaces EOF )
            // InternalRM.g:3299:2: iv_ruleEInterfaces= ruleEInterfaces EOF
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
    // InternalRM.g:3305:1: ruleEInterfaces returns [EObject current=null] : ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) ;
    public final EObject ruleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaces_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3311:2: ( ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) )
            // InternalRM.g:3312:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            {
            // InternalRM.g:3312:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            // InternalRM.g:3313:3: () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            {
            // InternalRM.g:3313:3: ()
            // InternalRM.g:3314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfacesAccess().getEInterfacesAction_0(),
            					current);
            			

            }

            // InternalRM.g:3320:3: ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRM.g:3321:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    {
            	    // InternalRM.g:3321:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    // InternalRM.g:3322:5: lv_interfaces_1_0= ruleEInterfaceDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInterfacesAccess().getInterfacesEInterfaceDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop23;
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
    // InternalRM.g:3343:1: entryRuleEInterfaceDefinition returns [EObject current=null] : iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF ;
    public final EObject entryRuleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinition = null;


        try {
            // InternalRM.g:3343:61: (iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF )
            // InternalRM.g:3344:2: iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF
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
    // InternalRM.g:3350:1: ruleEInterfaceDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_interface_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3356:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:3357:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:3357:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:3358:3: ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:3358:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:3359:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:3359:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:3360:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_37); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getEInterfaceDefinitionAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:3380:3: ( (lv_interface_2_0= ruleEInterfaceDefinitionBody ) )
            // InternalRM.g:3381:4: (lv_interface_2_0= ruleEInterfaceDefinitionBody )
            {
            // InternalRM.g:3381:4: (lv_interface_2_0= ruleEInterfaceDefinitionBody )
            // InternalRM.g:3382:5: lv_interface_2_0= ruleEInterfaceDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEInterfaceDefinitionAccess().getInterfaceEInterfaceDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getEInterfaceDefinitionAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:3407:1: entryRuleEInterfaceDefinitionBody returns [EObject current=null] : iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF ;
    public final EObject entryRuleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinitionBody = null;


        try {
            // InternalRM.g:3407:65: (iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF )
            // InternalRM.g:3408:2: iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF
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
    // InternalRM.g:3414:1: ruleEInterfaceDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_START_BLOCK_4=null;
        Token this_END_BLOCK_6=null;
        Token otherlv_7=null;
        Token this_START_BLOCK_8=null;
        Token this_END_BLOCK_10=null;
        EObject lv_inputs_5_0 = null;

        EObject lv_operations_9_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3420:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:3421:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:3421:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:3422:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:3422:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) ) )+ {...}?) )
            // InternalRM.g:3423:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:3426:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) ) )+ {...}?)
            // InternalRM.g:3427:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) ) )+ {...}?
            {
            // InternalRM.g:3427:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=4;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt24=3;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRM.g:3428:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3428:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:3429:4: {...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:3429:118: ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:3430:5: ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:3433:8: ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:3433:9: {...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3433:18: (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:3433:19: otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEInterfaceDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRM.g:3437:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:3438:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:3438:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:3439:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_38); 

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
            	    // InternalRM.g:3456:3: ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:3456:3: ({...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:3457:4: {...}? => ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:3457:118: ( ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:3458:5: ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:3461:8: ({...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK ) )
            	    // InternalRM.g:3461:9: {...}? => (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3461:18: (otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK )
            	    // InternalRM.g:3461:19: otherlv_3= 'inputs' this_START_BLOCK_4= RULE_START_BLOCK ( (lv_inputs_5_0= ruleEProperties ) ) this_END_BLOCK_6= RULE_END_BLOCK
            	    {
            	    otherlv_3=(Token)match(input,31,FOLLOW_3); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEInterfaceDefinitionBodyAccess().getInputsKeyword_1_0());
            	    							
            	    this_START_BLOCK_4=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    								newLeafNode(this_START_BLOCK_4, grammarAccess.getEInterfaceDefinitionBodyAccess().getSTART_BLOCKTerminalRuleCall_1_1());
            	    							
            	    // InternalRM.g:3469:8: ( (lv_inputs_5_0= ruleEProperties ) )
            	    // InternalRM.g:3470:9: (lv_inputs_5_0= ruleEProperties )
            	    {
            	    // InternalRM.g:3470:9: (lv_inputs_5_0= ruleEProperties )
            	    // InternalRM.g:3471:10: lv_inputs_5_0= ruleEProperties
            	    {

            	    										newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyAccess().getInputsEPropertiesParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_inputs_5_0=ruleEProperties();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"inputs",
            	    											lv_inputs_5_0,
            	    											"org.sodalite.dsl.RM.EProperties");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_6=(Token)match(input,RULE_END_BLOCK,FOLLOW_38); 

            	    								newLeafNode(this_END_BLOCK_6, grammarAccess.getEInterfaceDefinitionBodyAccess().getEND_BLOCKTerminalRuleCall_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:3498:3: ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:3498:3: ({...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:3499:4: {...}? => ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:3499:118: ( ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:3500:5: ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:3503:8: ({...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK ) )
            	    // InternalRM.g:3503:9: {...}? => (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3503:18: (otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK )
            	    // InternalRM.g:3503:19: otherlv_7= 'operations' this_START_BLOCK_8= RULE_START_BLOCK ( (lv_operations_9_0= ruleEOperations ) ) this_END_BLOCK_10= RULE_END_BLOCK
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_3); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEInterfaceDefinitionBodyAccess().getOperationsKeyword_2_0());
            	    							
            	    this_START_BLOCK_8=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    								newLeafNode(this_START_BLOCK_8, grammarAccess.getEInterfaceDefinitionBodyAccess().getSTART_BLOCKTerminalRuleCall_2_1());
            	    							
            	    // InternalRM.g:3511:8: ( (lv_operations_9_0= ruleEOperations ) )
            	    // InternalRM.g:3512:9: (lv_operations_9_0= ruleEOperations )
            	    {
            	    // InternalRM.g:3512:9: (lv_operations_9_0= ruleEOperations )
            	    // InternalRM.g:3513:10: lv_operations_9_0= ruleEOperations
            	    {

            	    										newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyAccess().getOperationsEOperationsParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_operations_9_0=ruleEOperations();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"operations",
            	    											lv_operations_9_0,
            	    											"org.sodalite.dsl.RM.EOperations");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_38); 

            	    								newLeafNode(this_END_BLOCK_10, grammarAccess.getEInterfaceDefinitionBodyAccess().getEND_BLOCKTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

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
    // InternalRM.g:3551:1: entryRuleEOperations returns [EObject current=null] : iv_ruleEOperations= ruleEOperations EOF ;
    public final EObject entryRuleEOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperations = null;


        try {
            // InternalRM.g:3551:52: (iv_ruleEOperations= ruleEOperations EOF )
            // InternalRM.g:3552:2: iv_ruleEOperations= ruleEOperations EOF
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
    // InternalRM.g:3558:1: ruleEOperations returns [EObject current=null] : ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) ;
    public final EObject ruleEOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3564:2: ( ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) )
            // InternalRM.g:3565:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            {
            // InternalRM.g:3565:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            // InternalRM.g:3566:3: () ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            {
            // InternalRM.g:3566:3: ()
            // InternalRM.g:3567:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationsAccess().getEOperationsAction_0(),
            					current);
            			

            }

            // InternalRM.g:3573:3: ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRM.g:3574:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    {
            	    // InternalRM.g:3574:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    // InternalRM.g:3575:5: lv_operations_1_0= ruleEOperationDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEOperationsAccess().getOperationsEOperationDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop25;
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
    // InternalRM.g:3596:1: entryRuleEOperationDefinition returns [EObject current=null] : iv_ruleEOperationDefinition= ruleEOperationDefinition EOF ;
    public final EObject entryRuleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinition = null;


        try {
            // InternalRM.g:3596:61: (iv_ruleEOperationDefinition= ruleEOperationDefinition EOF )
            // InternalRM.g:3597:2: iv_ruleEOperationDefinition= ruleEOperationDefinition EOF
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
    // InternalRM.g:3603:1: ruleEOperationDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_operation_2_0= ruleEOperationDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_operation_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3609:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_operation_2_0= ruleEOperationDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:3610:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_operation_2_0= ruleEOperationDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:3610:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_operation_2_0= ruleEOperationDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:3611:3: ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_operation_2_0= ruleEOperationDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:3611:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:3612:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:3612:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:3613:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_39); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getEOperationDefinitionAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:3633:3: ( (lv_operation_2_0= ruleEOperationDefinitionBody ) )
            // InternalRM.g:3634:4: (lv_operation_2_0= ruleEOperationDefinitionBody )
            {
            // InternalRM.g:3634:4: (lv_operation_2_0= ruleEOperationDefinitionBody )
            // InternalRM.g:3635:5: lv_operation_2_0= ruleEOperationDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEOperationDefinitionAccess().getOperationEOperationDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getEOperationDefinitionAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:3660:1: entryRuleEOperationDefinitionBody returns [EObject current=null] : iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF ;
    public final EObject entryRuleEOperationDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinitionBody = null;


        try {
            // InternalRM.g:3660:65: (iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF )
            // InternalRM.g:3661:2: iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF
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
    // InternalRM.g:3667:1: ruleEOperationDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEOperationDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token this_START_BLOCK_5=null;
        Token this_END_BLOCK_7=null;
        Token otherlv_8=null;
        Token lv_implementation_9_0=null;
        EObject lv_inputs_6_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3673:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:3674:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:3674:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRM.g:3675:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRM.g:3675:3: ()
            // InternalRM.g:3676:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationDefinitionBodyAccess().getEOperationDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:3682:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRM.g:3683:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRM.g:3683:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRM.g:3684:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:3687:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRM.g:3688:6: ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRM.g:3688:6: ( ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) ) )*
            loop26:
            do {
                int alt26=4;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt26=2;
                }
                else if ( LA26_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt26=3;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRM.g:3689:4: ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3689:4: ({...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:3690:5: {...}? => ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:3690:121: ( ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:3691:6: ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:3694:9: ({...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:3694:10: {...}? => (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3694:19: (otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) ) )
            	    // InternalRM.g:3694:20: otherlv_2= 'description:' ( (lv_description_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_11); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEOperationDefinitionBodyAccess().getDescriptionKeyword_1_0_0());
            	    								
            	    // InternalRM.g:3698:9: ( (lv_description_3_0= RULE_STRING ) )
            	    // InternalRM.g:3699:10: (lv_description_3_0= RULE_STRING )
            	    {
            	    // InternalRM.g:3699:10: (lv_description_3_0= RULE_STRING )
            	    // InternalRM.g:3700:11: lv_description_3_0= RULE_STRING
            	    {
            	    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

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
            	    // InternalRM.g:3722:4: ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:3722:4: ({...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:3723:5: {...}? => ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:3723:121: ( ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:3724:6: ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:3727:9: ({...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK ) )
            	    // InternalRM.g:3727:10: {...}? => (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3727:19: (otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK )
            	    // InternalRM.g:3727:20: otherlv_4= 'inputs' this_START_BLOCK_5= RULE_START_BLOCK ( (lv_inputs_6_0= ruleEInputs ) ) this_END_BLOCK_7= RULE_END_BLOCK
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEOperationDefinitionBodyAccess().getInputsKeyword_1_1_0());
            	    								
            	    this_START_BLOCK_5=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_START_BLOCK_5, grammarAccess.getEOperationDefinitionBodyAccess().getSTART_BLOCKTerminalRuleCall_1_1_1());
            	    								
            	    // InternalRM.g:3735:9: ( (lv_inputs_6_0= ruleEInputs ) )
            	    // InternalRM.g:3736:10: (lv_inputs_6_0= ruleEInputs )
            	    {
            	    // InternalRM.g:3736:10: (lv_inputs_6_0= ruleEInputs )
            	    // InternalRM.g:3737:11: lv_inputs_6_0= ruleEInputs
            	    {

            	    											newCompositeNode(grammarAccess.getEOperationDefinitionBodyAccess().getInputsEInputsParserRuleCall_1_1_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_inputs_6_0=ruleEInputs();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEOperationDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inputs",
            	    												lv_inputs_6_0,
            	    												"org.sodalite.dsl.RM.EInputs");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_BLOCK_7=(Token)match(input,RULE_END_BLOCK,FOLLOW_40); 

            	    									newLeafNode(this_END_BLOCK_7, grammarAccess.getEOperationDefinitionBodyAccess().getEND_BLOCKTerminalRuleCall_1_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRM.g:3764:4: ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3764:4: ({...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:3765:5: {...}? => ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:3765:121: ( ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:3766:6: ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:3769:9: ({...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:3769:10: {...}? => (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3769:19: (otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) ) )
            	    // InternalRM.g:3769:20: otherlv_8= 'implementation:' ( (lv_implementation_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,44,FOLLOW_11); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEOperationDefinitionBodyAccess().getImplementationKeyword_1_2_0());
            	    								
            	    // InternalRM.g:3773:9: ( (lv_implementation_9_0= RULE_STRING ) )
            	    // InternalRM.g:3774:10: (lv_implementation_9_0= RULE_STRING )
            	    {
            	    // InternalRM.g:3774:10: (lv_implementation_9_0= RULE_STRING )
            	    // InternalRM.g:3775:11: lv_implementation_9_0= RULE_STRING
            	    {
            	    lv_implementation_9_0=(Token)match(input,RULE_STRING,FOLLOW_40); 

            	    											newLeafNode(lv_implementation_9_0, grammarAccess.getEOperationDefinitionBodyAccess().getImplementationSTRINGTerminalRuleCall_1_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEOperationDefinitionBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"implementation",
            	    												lv_implementation_9_0,
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
            	    break loop26;
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
    // InternalRM.g:3808:1: entryRuleEInputs returns [EObject current=null] : iv_ruleEInputs= ruleEInputs EOF ;
    public final EObject entryRuleEInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputs = null;


        try {
            // InternalRM.g:3808:48: (iv_ruleEInputs= ruleEInputs EOF )
            // InternalRM.g:3809:2: iv_ruleEInputs= ruleEInputs EOF
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
    // InternalRM.g:3815:1: ruleEInputs returns [EObject current=null] : ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) ;
    public final EObject ruleEInputs() throws RecognitionException {
        EObject current = null;

        EObject lv_inputs_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3821:2: ( ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) )
            // InternalRM.g:3822:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            {
            // InternalRM.g:3822:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            // InternalRM.g:3823:3: () ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            {
            // InternalRM.g:3823:3: ()
            // InternalRM.g:3824:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInputsAccess().getEInputsAction_0(),
            					current);
            			

            }

            // InternalRM.g:3830:3: ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRM.g:3831:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    {
            	    // InternalRM.g:3831:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    // InternalRM.g:3832:5: lv_inputs_1_0= ruleEParameterDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInputsAccess().getInputsEParameterDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop27;
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
    // InternalRM.g:3853:1: entryRuleEParameterDefinition returns [EObject current=null] : iv_ruleEParameterDefinition= ruleEParameterDefinition EOF ;
    public final EObject entryRuleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinition = null;


        try {
            // InternalRM.g:3853:61: (iv_ruleEParameterDefinition= ruleEParameterDefinition EOF )
            // InternalRM.g:3854:2: iv_ruleEParameterDefinition= ruleEParameterDefinition EOF
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
    // InternalRM.g:3860:1: ruleEParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_parameter_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3866:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:3867:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:3867:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:3868:3: ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:3868:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:3869:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:3869:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:3870:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_41); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getEParameterDefinitionAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:3890:3: ( (lv_parameter_2_0= ruleEParameterDefinitionBody ) )
            // InternalRM.g:3891:4: (lv_parameter_2_0= ruleEParameterDefinitionBody )
            {
            // InternalRM.g:3891:4: (lv_parameter_2_0= ruleEParameterDefinitionBody )
            // InternalRM.g:3892:5: lv_parameter_2_0= ruleEParameterDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEParameterDefinitionAccess().getParameterEParameterDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getEParameterDefinitionAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:3917:1: entryRuleEParameterDefinitionBody returns [EObject current=null] : iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF ;
    public final EObject entryRuleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinitionBody = null;


        try {
            // InternalRM.g:3917:65: (iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF )
            // InternalRM.g:3918:2: iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF
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
    // InternalRM.g:3924:1: ruleEParameterDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;

        EObject lv_default_7_0 = null;



        	enterRule();

        try {
            // InternalRM.g:3930:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRM.g:3931:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRM.g:3931:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            // InternalRM.g:3932:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            {
            // InternalRM.g:3932:3: ()
            // InternalRM.g:3933:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterDefinitionBodyAccess().getEParameterDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRM.g:3939:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            // InternalRM.g:3940:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            {
            // InternalRM.g:3940:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            // InternalRM.g:3941:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRM.g:3944:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* )
            // InternalRM.g:3945:6: ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )*
            {
            // InternalRM.g:3945:6: ( ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )*
            loop28:
            do {
                int alt28=4;
                int LA28_0 = input.LA(1);

                if ( LA28_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt28=2;
                }
                else if ( LA28_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt28=3;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRM.g:3946:4: ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3946:4: ({...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRM.g:3947:5: {...}? => ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRM.g:3947:121: ( ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRM.g:3948:6: ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRM.g:3951:9: ({...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRM.g:3951:10: {...}? => (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3951:19: (otherlv_2= 'type:' ( ( ruleEDataTypeName ) ) )
            	    // InternalRM.g:3951:20: otherlv_2= 'type:' ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEParameterDefinitionBodyAccess().getTypeKeyword_1_0_0());
            	    								
            	    // InternalRM.g:3955:9: ( ( ruleEDataTypeName ) )
            	    // InternalRM.g:3956:10: ( ruleEDataTypeName )
            	    {
            	    // InternalRM.g:3956:10: ( ruleEDataTypeName )
            	    // InternalRM.g:3957:11: ruleEDataTypeName
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getTypeEDataTypeCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_42);
            	    ruleEDataTypeName();

            	    state._fsp--;


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
            	    // InternalRM.g:3977:4: ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRM.g:3977:4: ({...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRM.g:3978:5: {...}? => ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRM.g:3978:121: ( ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRM.g:3979:6: ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRM.g:3982:9: ({...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) ) )
            	    // InternalRM.g:3982:10: {...}? => (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRM.g:3982:19: (otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) ) )
            	    // InternalRM.g:3982:20: otherlv_4= 'value:' ( (lv_value_5_0= ruleEValueExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,45,FOLLOW_34); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEParameterDefinitionBodyAccess().getValueKeyword_1_1_0());
            	    								
            	    // InternalRM.g:3986:9: ( (lv_value_5_0= ruleEValueExpression ) )
            	    // InternalRM.g:3987:10: (lv_value_5_0= ruleEValueExpression )
            	    {
            	    // InternalRM.g:3987:10: (lv_value_5_0= ruleEValueExpression )
            	    // InternalRM.g:3988:11: lv_value_5_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getValueEValueExpressionParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_42);
            	    lv_value_5_0=ruleEValueExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"value",
            	    												lv_value_5_0,
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
            	case 3 :
            	    // InternalRM.g:4011:4: ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4011:4: ({...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRM.g:4012:5: {...}? => ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRM.g:4012:121: ( ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRM.g:4013:6: ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRM.g:4016:9: ({...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) ) )
            	    // InternalRM.g:4016:10: {...}? => (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4016:19: (otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) ) )
            	    // InternalRM.g:4016:20: otherlv_6= 'default:' ( (lv_default_7_0= ruleEValueExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,41,FOLLOW_34); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEParameterDefinitionBodyAccess().getDefaultKeyword_1_2_0());
            	    								
            	    // InternalRM.g:4020:9: ( (lv_default_7_0= ruleEValueExpression ) )
            	    // InternalRM.g:4021:10: (lv_default_7_0= ruleEValueExpression )
            	    {
            	    // InternalRM.g:4021:10: (lv_default_7_0= ruleEValueExpression )
            	    // InternalRM.g:4022:11: lv_default_7_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_42);
            	    lv_default_7_0=ruleEValueExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"default",
            	    												lv_default_7_0,
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
            	    break loop28;
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
    // InternalRM.g:4056:1: entryRuleEValueExpression returns [EObject current=null] : iv_ruleEValueExpression= ruleEValueExpression EOF ;
    public final EObject entryRuleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueExpression = null;


        try {
            // InternalRM.g:4056:57: (iv_ruleEValueExpression= ruleEValueExpression EOF )
            // InternalRM.g:4057:2: iv_ruleEValueExpression= ruleEValueExpression EOF
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
    // InternalRM.g:4063:1: ruleEValueExpression returns [EObject current=null] : ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction ) ;
    public final EObject ruleEValueExpression() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;
        EObject this_EFunction_2 = null;



        	enterRule();

        try {
            // InternalRM.g:4069:2: ( ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction ) )
            // InternalRM.g:4070:2: ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction )
            {
            // InternalRM.g:4070:2: ( ( () this_STRING_1= RULE_STRING ) | this_EFunction_2= ruleEFunction )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( ((LA29_0>=46 && LA29_0<=47)||LA29_0==51) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalRM.g:4071:3: ( () this_STRING_1= RULE_STRING )
                    {
                    // InternalRM.g:4071:3: ( () this_STRING_1= RULE_STRING )
                    // InternalRM.g:4072:4: () this_STRING_1= RULE_STRING
                    {
                    // InternalRM.g:4072:4: ()
                    // InternalRM.g:4073:5: 
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
                    // InternalRM.g:4085:3: this_EFunction_2= ruleEFunction
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
    // InternalRM.g:4097:1: entryRuleEFunction returns [EObject current=null] : iv_ruleEFunction= ruleEFunction EOF ;
    public final EObject entryRuleEFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunction = null;


        try {
            // InternalRM.g:4097:50: (iv_ruleEFunction= ruleEFunction EOF )
            // InternalRM.g:4098:2: iv_ruleEFunction= ruleEFunction EOF
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
    // InternalRM.g:4104:1: ruleEFunction returns [EObject current=null] : (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) ;
    public final EObject ruleEFunction() throws RecognitionException {
        EObject current = null;

        EObject this_GetProperty_0 = null;

        EObject this_GetAttribute_1 = null;

        EObject this_GetInput_2 = null;



        	enterRule();

        try {
            // InternalRM.g:4110:2: ( (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) )
            // InternalRM.g:4111:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            {
            // InternalRM.g:4111:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt30=1;
                }
                break;
            case 47:
                {
                alt30=2;
                }
                break;
            case 46:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalRM.g:4112:3: this_GetProperty_0= ruleGetProperty
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
                    // InternalRM.g:4121:3: this_GetAttribute_1= ruleGetAttribute
                    {

                    			newCompositeNode(grammarAccess.getEFunctionAccess().getGetAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetAttribute_1=ruleGetAttribute();

                    state._fsp--;


                    			current = this_GetAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRM.g:4130:3: this_GetInput_2= ruleGetInput
                    {

                    			newCompositeNode(grammarAccess.getEFunctionAccess().getGetInputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetInput_2=ruleGetInput();

                    state._fsp--;


                    			current = this_GetInput_2;
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


    // $ANTLR start "entryRuleGetInput"
    // InternalRM.g:4142:1: entryRuleGetInput returns [EObject current=null] : iv_ruleGetInput= ruleGetInput EOF ;
    public final EObject entryRuleGetInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInput = null;


        try {
            // InternalRM.g:4142:49: (iv_ruleGetInput= ruleGetInput EOF )
            // InternalRM.g:4143:2: iv_ruleGetInput= ruleGetInput EOF
            {
             newCompositeNode(grammarAccess.getGetInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetInput=ruleGetInput();

            state._fsp--;

             current =iv_ruleGetInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetInput"


    // $ANTLR start "ruleGetInput"
    // InternalRM.g:4149:1: ruleGetInput returns [EObject current=null] : (otherlv_0= 'get_input:' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleGetInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRM.g:4155:2: ( (otherlv_0= 'get_input:' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRM.g:4156:2: (otherlv_0= 'get_input:' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRM.g:4156:2: (otherlv_0= 'get_input:' ( (otherlv_1= RULE_ID ) ) )
            // InternalRM.g:4157:3: otherlv_0= 'get_input:' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getGetInputAccess().getGet_inputKeyword_0());
            		
            // InternalRM.g:4161:3: ( (otherlv_1= RULE_ID ) )
            // InternalRM.g:4162:4: (otherlv_1= RULE_ID )
            {
            // InternalRM.g:4162:4: (otherlv_1= RULE_ID )
            // InternalRM.g:4163:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetInputRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getGetInputAccess().getInputEParameterDefinitionCrossReference_1_0());
            				

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
    // $ANTLR end "ruleGetInput"


    // $ANTLR start "entryRuleGetAttribute"
    // InternalRM.g:4178:1: entryRuleGetAttribute returns [EObject current=null] : iv_ruleGetAttribute= ruleGetAttribute EOF ;
    public final EObject entryRuleGetAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttribute = null;


        try {
            // InternalRM.g:4178:53: (iv_ruleGetAttribute= ruleGetAttribute EOF )
            // InternalRM.g:4179:2: iv_ruleGetAttribute= ruleGetAttribute EOF
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
    // InternalRM.g:4185:1: ruleGetAttribute returns [EObject current=null] : (otherlv_0= 'get_attribute' this_START_BLOCK_1= RULE_START_BLOCK ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleGetAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4191:2: ( (otherlv_0= 'get_attribute' this_START_BLOCK_1= RULE_START_BLOCK ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:4192:2: (otherlv_0= 'get_attribute' this_START_BLOCK_1= RULE_START_BLOCK ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:4192:2: (otherlv_0= 'get_attribute' this_START_BLOCK_1= RULE_START_BLOCK ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:4193:3: otherlv_0= 'get_attribute' this_START_BLOCK_1= RULE_START_BLOCK ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGetAttributeAccess().getGet_attributeKeyword_0());
            		
            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_44); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getGetAttributeAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:4201:3: ( (lv_attribute_2_0= ruleGetAttributeBody ) )
            // InternalRM.g:4202:4: (lv_attribute_2_0= ruleGetAttributeBody )
            {
            // InternalRM.g:4202:4: (lv_attribute_2_0= ruleGetAttributeBody )
            // InternalRM.g:4203:5: lv_attribute_2_0= ruleGetAttributeBody
            {

            					newCompositeNode(grammarAccess.getGetAttributeAccess().getAttributeGetAttributeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_attribute_2_0=ruleGetAttributeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetAttributeRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"org.sodalite.dsl.RM.GetAttributeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getGetAttributeAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:4228:1: entryRuleGetAttributeBody returns [EObject current=null] : iv_ruleGetAttributeBody= ruleGetAttributeBody EOF ;
    public final EObject entryRuleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttributeBody = null;


        try {
            // InternalRM.g:4228:57: (iv_ruleGetAttributeBody= ruleGetAttributeBody EOF )
            // InternalRM.g:4229:2: iv_ruleGetAttributeBody= ruleGetAttributeBody EOF
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
    // InternalRM.g:4235:1: ruleGetAttributeBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalRM.g:4241:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:4242:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:4242:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:4243:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:4243:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            // InternalRM.g:4244:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:4247:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            // InternalRM.g:4248:5: ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?
            {
            // InternalRM.g:4248:5: ( ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=4;
                int LA31_0 = input.LA(1);

                if ( LA31_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
                    alt31=2;
                }
                else if ( LA31_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
                    alt31=3;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRM.g:4249:3: ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4249:3: ({...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4250:4: {...}? => ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:4250:110: ( ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4251:5: ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:4254:8: ({...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4254:9: {...}? => (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRM.g:4254:18: (otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4254:19: otherlv_1= 'attribute:' ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,48,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetAttributeBodyAccess().getAttributeKeyword_0_0());
            	    							
            	    // InternalRM.g:4258:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4259:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4259:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4260:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_45); 

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
            	    // InternalRM.g:4277:3: ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4277:3: ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    // InternalRM.g:4278:4: {...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:4278:110: ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    // InternalRM.g:4279:5: ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:4282:8: ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    // InternalRM.g:4282:9: {...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRM.g:4282:18: (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    // InternalRM.g:4282:19: otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) )
            	    {
            	    otherlv_3=(Token)match(input,49,FOLLOW_46); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetAttributeBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRM.g:4286:8: ( (lv_entity_4_0= RULE_ENTITY ) )
            	    // InternalRM.g:4287:9: (lv_entity_4_0= RULE_ENTITY )
            	    {
            	    // InternalRM.g:4287:9: (lv_entity_4_0= RULE_ENTITY )
            	    // InternalRM.g:4288:10: lv_entity_4_0= RULE_ENTITY
            	    {
            	    lv_entity_4_0=(Token)match(input,RULE_ENTITY,FOLLOW_45); 

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
            	    // InternalRM.g:4310:3: ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4310:3: ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4311:4: {...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:4311:110: ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4312:5: ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:4315:8: ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4315:9: {...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRM.g:4315:18: (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4315:19: otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,50,FOLLOW_7); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetAttributeBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRM.g:4319:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4320:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4320:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4321:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_45); 

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
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
    // InternalRM.g:4349:1: entryRuleGetProperty returns [EObject current=null] : iv_ruleGetProperty= ruleGetProperty EOF ;
    public final EObject entryRuleGetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetProperty = null;


        try {
            // InternalRM.g:4349:52: (iv_ruleGetProperty= ruleGetProperty EOF )
            // InternalRM.g:4350:2: iv_ruleGetProperty= ruleGetProperty EOF
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
    // InternalRM.g:4356:1: ruleGetProperty returns [EObject current=null] : (otherlv_0= 'get_property' this_START_BLOCK_1= RULE_START_BLOCK ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleGetProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_property_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4362:2: ( (otherlv_0= 'get_property' this_START_BLOCK_1= RULE_START_BLOCK ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:4363:2: (otherlv_0= 'get_property' this_START_BLOCK_1= RULE_START_BLOCK ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:4363:2: (otherlv_0= 'get_property' this_START_BLOCK_1= RULE_START_BLOCK ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:4364:3: otherlv_0= 'get_property' this_START_BLOCK_1= RULE_START_BLOCK ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGetPropertyAccess().getGet_propertyKeyword_0());
            		
            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_47); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getGetPropertyAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:4372:3: ( (lv_property_2_0= ruleGetPropertyBody ) )
            // InternalRM.g:4373:4: (lv_property_2_0= ruleGetPropertyBody )
            {
            // InternalRM.g:4373:4: (lv_property_2_0= ruleGetPropertyBody )
            // InternalRM.g:4374:5: lv_property_2_0= ruleGetPropertyBody
            {

            					newCompositeNode(grammarAccess.getGetPropertyAccess().getPropertyGetPropertyBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_property_2_0=ruleGetPropertyBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetPropertyRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_2_0,
            						"org.sodalite.dsl.RM.GetPropertyBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getGetPropertyAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:4399:1: entryRuleGetPropertyBody returns [EObject current=null] : iv_ruleGetPropertyBody= ruleGetPropertyBody EOF ;
    public final EObject entryRuleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetPropertyBody = null;


        try {
            // InternalRM.g:4399:56: (iv_ruleGetPropertyBody= ruleGetPropertyBody EOF )
            // InternalRM.g:4400:2: iv_ruleGetPropertyBody= ruleGetPropertyBody EOF
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
    // InternalRM.g:4406:1: ruleGetPropertyBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) ;
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
            // InternalRM.g:4412:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:4413:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:4413:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:4414:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:4414:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            // InternalRM.g:4415:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:4418:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            // InternalRM.g:4419:5: ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?
            {
            // InternalRM.g:4419:5: ( ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( LA32_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRM.g:4420:3: ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4420:3: ({...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4421:4: {...}? => ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:4421:109: ( ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4422:5: ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:4425:8: ({...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4425:9: {...}? => (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRM.g:4425:18: (otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4425:19: otherlv_1= 'property:' ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetPropertyBodyAccess().getPropertyKeyword_0_0());
            	    							
            	    // InternalRM.g:4429:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4430:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4430:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4431:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_48); 

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
            	    // InternalRM.g:4448:3: ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4448:3: ({...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    // InternalRM.g:4449:4: {...}? => ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:4449:109: ( ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    // InternalRM.g:4450:5: ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:4453:8: ({...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    // InternalRM.g:4453:9: {...}? => (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRM.g:4453:18: (otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    // InternalRM.g:4453:19: otherlv_3= 'entity:' ( (lv_entity_4_0= RULE_ENTITY ) )
            	    {
            	    otherlv_3=(Token)match(input,49,FOLLOW_46); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetPropertyBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRM.g:4457:8: ( (lv_entity_4_0= RULE_ENTITY ) )
            	    // InternalRM.g:4458:9: (lv_entity_4_0= RULE_ENTITY )
            	    {
            	    // InternalRM.g:4458:9: (lv_entity_4_0= RULE_ENTITY )
            	    // InternalRM.g:4459:10: lv_entity_4_0= RULE_ENTITY
            	    {
            	    lv_entity_4_0=(Token)match(input,RULE_ENTITY,FOLLOW_48); 

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
            	    // InternalRM.g:4481:3: ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4481:3: ({...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4482:4: {...}? => ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:4482:109: ( ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4483:5: ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:4486:8: ({...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4486:9: {...}? => (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRM.g:4486:18: (otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4486:19: otherlv_5= 'req_cap:' ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,50,FOLLOW_7); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetPropertyBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRM.g:4490:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4491:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4491:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4492:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_48); 

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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // InternalRM.g:4520:1: entryRuleECapabilities returns [EObject current=null] : iv_ruleECapabilities= ruleECapabilities EOF ;
    public final EObject entryRuleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilities = null;


        try {
            // InternalRM.g:4520:54: (iv_ruleECapabilities= ruleECapabilities EOF )
            // InternalRM.g:4521:2: iv_ruleECapabilities= ruleECapabilities EOF
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
    // InternalRM.g:4527:1: ruleECapabilities returns [EObject current=null] : ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) ;
    public final EObject ruleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilities_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4533:2: ( ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) )
            // InternalRM.g:4534:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            {
            // InternalRM.g:4534:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            // InternalRM.g:4535:3: () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            {
            // InternalRM.g:4535:3: ()
            // InternalRM.g:4536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilitiesAccess().getECapabilitiesAction_0(),
            					current);
            			

            }

            // InternalRM.g:4542:3: ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRM.g:4543:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    {
            	    // InternalRM.g:4543:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    // InternalRM.g:4544:5: lv_capabilities_1_0= ruleECapabilityDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilitiesAccess().getCapabilitiesECapabilityDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop33;
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
    // InternalRM.g:4565:1: entryRuleECapabilityDefinition returns [EObject current=null] : iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF ;
    public final EObject entryRuleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinition = null;


        try {
            // InternalRM.g:4565:62: (iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF )
            // InternalRM.g:4566:2: iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF
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
    // InternalRM.g:4572:1: ruleECapabilityDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_capability_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4578:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:4579:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:4579:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:4580:3: ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:4580:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:4581:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:4581:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:4582:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_49); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getECapabilityDefinitionAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:4602:3: ( (lv_capability_2_0= ruleECapabilityDefinitionBody ) )
            // InternalRM.g:4603:4: (lv_capability_2_0= ruleECapabilityDefinitionBody )
            {
            // InternalRM.g:4603:4: (lv_capability_2_0= ruleECapabilityDefinitionBody )
            // InternalRM.g:4604:5: lv_capability_2_0= ruleECapabilityDefinitionBody
            {

            					newCompositeNode(grammarAccess.getECapabilityDefinitionAccess().getCapabilityECapabilityDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getECapabilityDefinitionAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:4629:1: entryRuleECapabilityDefinitionBody returns [EObject current=null] : iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF ;
    public final EObject entryRuleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinitionBody = null;


        try {
            // InternalRM.g:4629:66: (iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF )
            // InternalRM.g:4630:2: iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF
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
    // InternalRM.g:4636:1: ruleECapabilityDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token this_START_BLOCK_6=null;
        Token this_END_BLOCK_8=null;
        Token otherlv_9=null;
        Token this_START_BLOCK_10=null;
        Token this_END_BLOCK_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_start_17_0=null;
        Token otherlv_18=null;
        Token lv_end_19_0=null;
        Token otherlv_20=null;
        EObject lv_properties_7_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_valid_source_types_14_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4642:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:4643:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:4643:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:4644:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:4644:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) ) )+ {...}?) )
            // InternalRM.g:4645:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:4648:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) ) )+ {...}?)
            // InternalRM.g:4649:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) ) )+ {...}?
            {
            // InternalRM.g:4649:5: ( ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=7;
                int LA35_0 = input.LA(1);

                if ( LA35_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt35=1;
                }
                else if ( LA35_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt35=2;
                }
                else if ( LA35_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt35=3;
                }
                else if ( LA35_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt35=4;
                }
                else if ( LA35_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt35=5;
                }
                else if ( LA35_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
                    alt35=6;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRM.g:4650:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4650:3: ({...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:4651:4: {...}? => ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:4651:119: ( ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:4652:5: ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:4655:8: ({...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:4655:9: {...}? => (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4655:18: (otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:4655:19: otherlv_1= 'type:' ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getECapabilityDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRM.g:4659:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:4660:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:4660:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:4661:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_50); 

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
            	    // InternalRM.g:4678:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRM.g:4678:3: ({...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRM.g:4679:4: {...}? => ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:4679:119: ( ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRM.g:4680:5: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:4683:8: ({...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRM.g:4683:9: {...}? => (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4683:18: (otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRM.g:4683:19: otherlv_3= 'description:' ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_11); 

            	    								newLeafNode(otherlv_3, grammarAccess.getECapabilityDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRM.g:4687:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRM.g:4688:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRM.g:4688:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRM.g:4689:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_50); 

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
            	    // InternalRM.g:4711:3: ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:4711:3: ({...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:4712:4: {...}? => ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:4712:119: ( ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:4713:5: ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:4716:8: ({...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK ) )
            	    // InternalRM.g:4716:9: {...}? => (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4716:18: (otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK )
            	    // InternalRM.g:4716:19: otherlv_5= 'properties' this_START_BLOCK_6= RULE_START_BLOCK ( (lv_properties_7_0= ruleEProperties ) ) this_END_BLOCK_8= RULE_END_BLOCK
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_3); 

            	    								newLeafNode(otherlv_5, grammarAccess.getECapabilityDefinitionBodyAccess().getPropertiesKeyword_2_0());
            	    							
            	    this_START_BLOCK_6=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    								newLeafNode(this_START_BLOCK_6, grammarAccess.getECapabilityDefinitionBodyAccess().getSTART_BLOCKTerminalRuleCall_2_1());
            	    							
            	    // InternalRM.g:4724:8: ( (lv_properties_7_0= ruleEProperties ) )
            	    // InternalRM.g:4725:9: (lv_properties_7_0= ruleEProperties )
            	    {
            	    // InternalRM.g:4725:9: (lv_properties_7_0= ruleEProperties )
            	    // InternalRM.g:4726:10: lv_properties_7_0= ruleEProperties
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getPropertiesEPropertiesParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_properties_7_0=ruleEProperties();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"properties",
            	    											lv_properties_7_0,
            	    											"org.sodalite.dsl.RM.EProperties");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_8=(Token)match(input,RULE_END_BLOCK,FOLLOW_50); 

            	    								newLeafNode(this_END_BLOCK_8, grammarAccess.getECapabilityDefinitionBodyAccess().getEND_BLOCKTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRM.g:4753:3: ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalRM.g:4753:3: ({...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) ) )
            	    // InternalRM.g:4754:4: {...}? => ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRM.g:4754:119: ( ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) ) )
            	    // InternalRM.g:4755:5: ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRM.g:4758:8: ({...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK ) )
            	    // InternalRM.g:4758:9: {...}? => (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4758:18: (otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK )
            	    // InternalRM.g:4758:19: otherlv_9= 'attributes' this_START_BLOCK_10= RULE_START_BLOCK ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_BLOCK_12= RULE_END_BLOCK
            	    {
            	    otherlv_9=(Token)match(input,30,FOLLOW_3); 

            	    								newLeafNode(otherlv_9, grammarAccess.getECapabilityDefinitionBodyAccess().getAttributesKeyword_3_0());
            	    							
            	    this_START_BLOCK_10=(Token)match(input,RULE_START_BLOCK,FOLLOW_13); 

            	    								newLeafNode(this_START_BLOCK_10, grammarAccess.getECapabilityDefinitionBodyAccess().getSTART_BLOCKTerminalRuleCall_3_1());
            	    							
            	    // InternalRM.g:4766:8: ( (lv_attributes_11_0= ruleEAttributes ) )
            	    // InternalRM.g:4767:9: (lv_attributes_11_0= ruleEAttributes )
            	    {
            	    // InternalRM.g:4767:9: (lv_attributes_11_0= ruleEAttributes )
            	    // InternalRM.g:4768:10: lv_attributes_11_0= ruleEAttributes
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getAttributesEAttributesParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_attributes_11_0=ruleEAttributes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"attributes",
            	    											lv_attributes_11_0,
            	    											"org.sodalite.dsl.RM.EAttributes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_BLOCK_12=(Token)match(input,RULE_END_BLOCK,FOLLOW_50); 

            	    								newLeafNode(this_END_BLOCK_12, grammarAccess.getECapabilityDefinitionBodyAccess().getEND_BLOCKTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRM.g:4795:3: ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) )
            	    {
            	    // InternalRM.g:4795:3: ({...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) ) )
            	    // InternalRM.g:4796:4: {...}? => ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRM.g:4796:119: ( ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) ) )
            	    // InternalRM.g:4797:5: ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRM.g:4800:8: ({...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' ) )
            	    // InternalRM.g:4800:9: {...}? => (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4800:18: (otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']' )
            	    // InternalRM.g:4800:19: otherlv_13= 'valid_source_types:[' ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )? otherlv_15= ']'
            	    {
            	    otherlv_13=(Token)match(input,53,FOLLOW_51); 

            	    								newLeafNode(otherlv_13, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_4_0());
            	    							
            	    // InternalRM.g:4804:8: ( (lv_valid_source_types_14_0= ruleEValidSourceType ) )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==RULE_QUALIFIED_NAME) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalRM.g:4805:9: (lv_valid_source_types_14_0= ruleEValidSourceType )
            	            {
            	            // InternalRM.g:4805:9: (lv_valid_source_types_14_0= ruleEValidSourceType )
            	            // InternalRM.g:4806:10: lv_valid_source_types_14_0= ruleEValidSourceType
            	            {

            	            										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesEValidSourceTypeParserRuleCall_4_1_0());
            	            									
            	            pushFollow(FOLLOW_28);
            	            lv_valid_source_types_14_0=ruleEValidSourceType();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	            										}
            	            										add(
            	            											current,
            	            											"valid_source_types",
            	            											lv_valid_source_types_14_0,
            	            											"org.sodalite.dsl.RM.EValidSourceType");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_15=(Token)match(input,37,FOLLOW_50); 

            	    								newLeafNode(otherlv_15, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_4_2());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRM.g:4833:3: ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) )
            	    {
            	    // InternalRM.g:4833:3: ({...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) ) )
            	    // InternalRM.g:4834:4: {...}? => ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRM.g:4834:119: ( ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) ) )
            	    // InternalRM.g:4835:5: ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRM.g:4838:8: ({...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' ) )
            	    // InternalRM.g:4838:9: {...}? => (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRM.g:4838:18: (otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']' )
            	    // InternalRM.g:4838:19: otherlv_16= 'occurrences:[' ( (lv_start_17_0= RULE_STRING ) ) otherlv_18= ',' ( (lv_end_19_0= RULE_STRING ) ) otherlv_20= ']'
            	    {
            	    otherlv_16=(Token)match(input,54,FOLLOW_11); 

            	    								newLeafNode(otherlv_16, grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrencesKeyword_5_0());
            	    							
            	    // InternalRM.g:4842:8: ( (lv_start_17_0= RULE_STRING ) )
            	    // InternalRM.g:4843:9: (lv_start_17_0= RULE_STRING )
            	    {
            	    // InternalRM.g:4843:9: (lv_start_17_0= RULE_STRING )
            	    // InternalRM.g:4844:10: lv_start_17_0= RULE_STRING
            	    {
            	    lv_start_17_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

            	    										newLeafNode(lv_start_17_0, grammarAccess.getECapabilityDefinitionBodyAccess().getStartSTRINGTerminalRuleCall_5_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"start",
            	    											lv_start_17_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_18=(Token)match(input,38,FOLLOW_11); 

            	    								newLeafNode(otherlv_18, grammarAccess.getECapabilityDefinitionBodyAccess().getCommaKeyword_5_2());
            	    							
            	    // InternalRM.g:4864:8: ( (lv_end_19_0= RULE_STRING ) )
            	    // InternalRM.g:4865:9: (lv_end_19_0= RULE_STRING )
            	    {
            	    // InternalRM.g:4865:9: (lv_end_19_0= RULE_STRING )
            	    // InternalRM.g:4866:10: lv_end_19_0= RULE_STRING
            	    {
            	    lv_end_19_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	    										newLeafNode(lv_end_19_0, grammarAccess.getECapabilityDefinitionBodyAccess().getEndSTRINGTerminalRuleCall_5_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"end",
            	    											lv_end_19_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_20=(Token)match(input,37,FOLLOW_50); 

            	    								newLeafNode(otherlv_20, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_5_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // InternalRM.g:4903:1: entryRuleEValidSourceType returns [EObject current=null] : iv_ruleEValidSourceType= ruleEValidSourceType EOF ;
    public final EObject entryRuleEValidSourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidSourceType = null;


        try {
            // InternalRM.g:4903:57: (iv_ruleEValidSourceType= ruleEValidSourceType EOF )
            // InternalRM.g:4904:2: iv_ruleEValidSourceType= ruleEValidSourceType EOF
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
    // InternalRM.g:4910:1: ruleEValidSourceType returns [EObject current=null] : ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* ) ;
    public final EObject ruleEValidSourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sourceTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:4916:2: ( ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* ) )
            // InternalRM.g:4917:2: ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* )
            {
            // InternalRM.g:4917:2: ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* )
            // InternalRM.g:4918:3: ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= ',' ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )*
            {
            // InternalRM.g:4918:3: ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) )
            // InternalRM.g:4919:4: (lv_sourceTypes_0_0= ruleENodeTypeRef )
            {
            // InternalRM.g:4919:4: (lv_sourceTypes_0_0= ruleENodeTypeRef )
            // InternalRM.g:4920:5: lv_sourceTypes_0_0= ruleENodeTypeRef
            {

            					newCompositeNode(grammarAccess.getEValidSourceTypeAccess().getSourceTypesENodeTypeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_sourceTypes_0_0=ruleENodeTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEValidSourceTypeRule());
            					}
            					add(
            						current,
            						"sourceTypes",
            						lv_sourceTypes_0_0,
            						"org.sodalite.dsl.RM.ENodeTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRM.g:4937:3: (otherlv_1= ',' ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==38) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRM.g:4938:4: otherlv_1= ',' ( (lv_sourceType_2_0= ruleENodeTypeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidSourceTypeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRM.g:4942:4: ( (lv_sourceType_2_0= ruleENodeTypeRef ) )
            	    // InternalRM.g:4943:5: (lv_sourceType_2_0= ruleENodeTypeRef )
            	    {
            	    // InternalRM.g:4943:5: (lv_sourceType_2_0= ruleENodeTypeRef )
            	    // InternalRM.g:4944:6: lv_sourceType_2_0= ruleENodeTypeRef
            	    {

            	    						newCompositeNode(grammarAccess.getEValidSourceTypeAccess().getSourceTypeENodeTypeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_sourceType_2_0=ruleENodeTypeRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEValidSourceTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sourceType",
            	    							lv_sourceType_2_0,
            	    							"org.sodalite.dsl.RM.ENodeTypeRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


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
    // $ANTLR end "ruleEValidSourceType"


    // $ANTLR start "entryRuleENodeTypeRef"
    // InternalRM.g:4966:1: entryRuleENodeTypeRef returns [EObject current=null] : iv_ruleENodeTypeRef= ruleENodeTypeRef EOF ;
    public final EObject entryRuleENodeTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypeRef = null;


        try {
            // InternalRM.g:4966:53: (iv_ruleENodeTypeRef= ruleENodeTypeRef EOF )
            // InternalRM.g:4967:2: iv_ruleENodeTypeRef= ruleENodeTypeRef EOF
            {
             newCompositeNode(grammarAccess.getENodeTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeTypeRef=ruleENodeTypeRef();

            state._fsp--;

             current =iv_ruleENodeTypeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeTypeRef"


    // $ANTLR start "ruleENodeTypeRef"
    // InternalRM.g:4973:1: ruleENodeTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_QUALIFIED_NAME ) ) ;
    public final EObject ruleENodeTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRM.g:4979:2: ( ( (otherlv_0= RULE_QUALIFIED_NAME ) ) )
            // InternalRM.g:4980:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalRM.g:4980:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            // InternalRM.g:4981:3: (otherlv_0= RULE_QUALIFIED_NAME )
            {
            // InternalRM.g:4981:3: (otherlv_0= RULE_QUALIFIED_NAME )
            // InternalRM.g:4982:4: otherlv_0= RULE_QUALIFIED_NAME
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getENodeTypeRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getENodeTypeRefAccess().getNameENodeTypeCrossReference_0());
            			

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
    // $ANTLR end "ruleENodeTypeRef"


    // $ANTLR start "entryRuleERequirements"
    // InternalRM.g:4996:1: entryRuleERequirements returns [EObject current=null] : iv_ruleERequirements= ruleERequirements EOF ;
    public final EObject entryRuleERequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirements = null;


        try {
            // InternalRM.g:4996:54: (iv_ruleERequirements= ruleERequirements EOF )
            // InternalRM.g:4997:2: iv_ruleERequirements= ruleERequirements EOF
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
    // InternalRM.g:5003:1: ruleERequirements returns [EObject current=null] : ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) ;
    public final EObject ruleERequirements() throws RecognitionException {
        EObject current = null;

        EObject lv_requirements_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:5009:2: ( ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) )
            // InternalRM.g:5010:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            {
            // InternalRM.g:5010:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            // InternalRM.g:5011:3: () ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            {
            // InternalRM.g:5011:3: ()
            // InternalRM.g:5012:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequirementsAccess().getERequirementsAction_0(),
            					current);
            			

            }

            // InternalRM.g:5018:3: ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRM.g:5019:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    {
            	    // InternalRM.g:5019:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    // InternalRM.g:5020:5: lv_requirements_1_0= ruleERequirementDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getERequirementsAccess().getRequirementsERequirementDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
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
            	    break loop37;
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
    // InternalRM.g:5041:1: entryRuleERequirementDefinition returns [EObject current=null] : iv_ruleERequirementDefinition= ruleERequirementDefinition EOF ;
    public final EObject entryRuleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinition = null;


        try {
            // InternalRM.g:5041:63: (iv_ruleERequirementDefinition= ruleERequirementDefinition EOF )
            // InternalRM.g:5042:2: iv_ruleERequirementDefinition= ruleERequirementDefinition EOF
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
    // InternalRM.g:5048:1: ruleERequirementDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_START_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_requirement_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:5054:2: ( ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalRM.g:5055:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalRM.g:5055:2: ( ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalRM.g:5056:3: ( (lv_name_0_0= RULE_ID ) ) this_START_BLOCK_1= RULE_START_BLOCK ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalRM.g:5056:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRM.g:5057:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRM.g:5057:4: (lv_name_0_0= RULE_ID )
            // InternalRM.g:5058:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

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

            this_START_BLOCK_1=(Token)match(input,RULE_START_BLOCK,FOLLOW_53); 

            			newLeafNode(this_START_BLOCK_1, grammarAccess.getERequirementDefinitionAccess().getSTART_BLOCKTerminalRuleCall_1());
            		
            // InternalRM.g:5078:3: ( (lv_requirement_2_0= ruleERequirementDefinitionBody ) )
            // InternalRM.g:5079:4: (lv_requirement_2_0= ruleERequirementDefinitionBody )
            {
            // InternalRM.g:5079:4: (lv_requirement_2_0= ruleERequirementDefinitionBody )
            // InternalRM.g:5080:5: lv_requirement_2_0= ruleERequirementDefinitionBody
            {

            					newCompositeNode(grammarAccess.getERequirementDefinitionAccess().getRequirementERequirementDefinitionBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getERequirementDefinitionAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:5105:1: entryRuleERequirementDefinitionBody returns [EObject current=null] : iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF ;
    public final EObject entryRuleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinitionBody = null;


        try {
            // InternalRM.g:5105:67: (iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF )
            // InternalRM.g:5106:2: iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF
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
    // InternalRM.g:5112:1: ruleERequirementDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_start_8_0=null;
        Token otherlv_9=null;
        Token lv_end_10_0=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalRM.g:5118:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) ) )+ {...}?) ) ) )
            // InternalRM.g:5119:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) ) )+ {...}?) ) )
            {
            // InternalRM.g:5119:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) ) )+ {...}?) ) )
            // InternalRM.g:5120:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) ) )+ {...}?) )
            {
            // InternalRM.g:5120:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) ) )+ {...}?) )
            // InternalRM.g:5121:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRM.g:5124:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) ) )+ {...}?)
            // InternalRM.g:5125:5: ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) ) )+ {...}?
            {
            // InternalRM.g:5125:5: ( ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=5;
                int LA38_0 = input.LA(1);

                if ( LA38_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt38=3;
                }
                else if ( LA38_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt38=4;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRM.g:5126:3: ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:5126:3: ({...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:5127:4: {...}? => ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRM.g:5127:120: ( ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:5128:5: ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRM.g:5131:8: ({...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:5131:9: {...}? => (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRM.g:5131:18: (otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:5131:19: otherlv_1= 'capability:' ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,55,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getERequirementDefinitionBodyAccess().getCapabilityKeyword_0_0());
            	    							
            	    // InternalRM.g:5135:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:5136:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:5136:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:5137:10: otherlv_2= RULE_QUALIFIED_NAME
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
            	    // InternalRM.g:5154:3: ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:5154:3: ({...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:5155:4: {...}? => ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRM.g:5155:120: ( ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:5156:5: ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRM.g:5159:8: ({...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:5159:9: {...}? => (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRM.g:5159:18: (otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:5159:19: otherlv_3= 'node:' ( (otherlv_4= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_3=(Token)match(input,56,FOLLOW_7); 

            	    								newLeafNode(otherlv_3, grammarAccess.getERequirementDefinitionBodyAccess().getNodeKeyword_1_0());
            	    							
            	    // InternalRM.g:5163:8: ( (otherlv_4= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:5164:9: (otherlv_4= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:5164:9: (otherlv_4= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:5165:10: otherlv_4= RULE_QUALIFIED_NAME
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
            	    // InternalRM.g:5182:3: ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRM.g:5182:3: ({...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRM.g:5183:4: {...}? => ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRM.g:5183:120: ( ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRM.g:5184:5: ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRM.g:5187:8: ({...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRM.g:5187:9: {...}? => (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRM.g:5187:18: (otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRM.g:5187:19: otherlv_5= 'relationship:' ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,57,FOLLOW_7); 

            	    								newLeafNode(otherlv_5, grammarAccess.getERequirementDefinitionBodyAccess().getRelationshipKeyword_2_0());
            	    							
            	    // InternalRM.g:5191:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRM.g:5192:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRM.g:5192:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRM.g:5193:10: otherlv_6= RULE_QUALIFIED_NAME
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
            	    // InternalRM.g:5210:3: ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) )
            	    {
            	    // InternalRM.g:5210:3: ({...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) ) )
            	    // InternalRM.g:5211:4: {...}? => ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRM.g:5211:120: ( ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) ) )
            	    // InternalRM.g:5212:5: ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRM.g:5215:8: ({...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' ) )
            	    // InternalRM.g:5215:9: {...}? => (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRM.g:5215:18: (otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']' )
            	    // InternalRM.g:5215:19: otherlv_7= 'occurrences:[' ( (lv_start_8_0= RULE_STRING ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_STRING ) ) otherlv_11= ']'
            	    {
            	    otherlv_7=(Token)match(input,54,FOLLOW_11); 

            	    								newLeafNode(otherlv_7, grammarAccess.getERequirementDefinitionBodyAccess().getOccurrencesKeyword_3_0());
            	    							
            	    // InternalRM.g:5219:8: ( (lv_start_8_0= RULE_STRING ) )
            	    // InternalRM.g:5220:9: (lv_start_8_0= RULE_STRING )
            	    {
            	    // InternalRM.g:5220:9: (lv_start_8_0= RULE_STRING )
            	    // InternalRM.g:5221:10: lv_start_8_0= RULE_STRING
            	    {
            	    lv_start_8_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

            	    										newLeafNode(lv_start_8_0, grammarAccess.getERequirementDefinitionBodyAccess().getStartSTRINGTerminalRuleCall_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"start",
            	    											lv_start_8_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_9=(Token)match(input,38,FOLLOW_11); 

            	    								newLeafNode(otherlv_9, grammarAccess.getERequirementDefinitionBodyAccess().getCommaKeyword_3_2());
            	    							
            	    // InternalRM.g:5241:8: ( (lv_end_10_0= RULE_STRING ) )
            	    // InternalRM.g:5242:9: (lv_end_10_0= RULE_STRING )
            	    {
            	    // InternalRM.g:5242:9: (lv_end_10_0= RULE_STRING )
            	    // InternalRM.g:5243:10: lv_end_10_0= RULE_STRING
            	    {
            	    lv_end_10_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	    										newLeafNode(lv_end_10_0, grammarAccess.getERequirementDefinitionBodyAccess().getEndSTRINGTerminalRuleCall_3_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"end",
            	    											lv_end_10_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_11=(Token)match(input,37,FOLLOW_54); 

            	    								newLeafNode(otherlv_11, grammarAccess.getERequirementDefinitionBodyAccess().getRightSquareBracketKeyword_3_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
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
    // InternalRM.g:5280:1: entryRuleEConstraints returns [EObject current=null] : iv_ruleEConstraints= ruleEConstraints EOF ;
    public final EObject entryRuleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraints = null;


        try {
            // InternalRM.g:5280:53: (iv_ruleEConstraints= ruleEConstraints EOF )
            // InternalRM.g:5281:2: iv_ruleEConstraints= ruleEConstraints EOF
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
    // InternalRM.g:5287:1: ruleEConstraints returns [EObject current=null] : ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) ;
    public final EObject ruleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:5293:2: ( ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) )
            // InternalRM.g:5294:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            {
            // InternalRM.g:5294:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            // InternalRM.g:5295:3: () ( (lv_constraints_1_0= ruleEConstraint ) )*
            {
            // InternalRM.g:5295:3: ()
            // InternalRM.g:5296:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConstraintsAccess().getEConstraintsAction_0(),
            					current);
            			

            }

            // InternalRM.g:5302:3: ( (lv_constraints_1_0= ruleEConstraint ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=58 && LA39_0<=61)||(LA39_0>=63 && LA39_0<=68)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalRM.g:5303:4: (lv_constraints_1_0= ruleEConstraint )
            	    {
            	    // InternalRM.g:5303:4: (lv_constraints_1_0= ruleEConstraint )
            	    // InternalRM.g:5304:5: lv_constraints_1_0= ruleEConstraint
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
            	    break loop39;
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
    // InternalRM.g:5325:1: entryRuleEConstraint returns [EObject current=null] : iv_ruleEConstraint= ruleEConstraint EOF ;
    public final EObject entryRuleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraint = null;


        try {
            // InternalRM.g:5325:52: (iv_ruleEConstraint= ruleEConstraint EOF )
            // InternalRM.g:5326:2: iv_ruleEConstraint= ruleEConstraint EOF
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
    // InternalRM.g:5332:1: ruleEConstraint returns [EObject current=null] : (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) ;
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
            // InternalRM.g:5338:2: ( (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) )
            // InternalRM.g:5339:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            {
            // InternalRM.g:5339:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            int alt40=10;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt40=1;
                }
                break;
            case 67:
                {
                alt40=2;
                }
                break;
            case 66:
                {
                alt40=3;
                }
                break;
            case 65:
                {
                alt40=4;
                }
                break;
            case 64:
                {
                alt40=5;
                }
                break;
            case 63:
                {
                alt40=6;
                }
                break;
            case 61:
                {
                alt40=7;
                }
                break;
            case 60:
                {
                alt40=8;
                }
                break;
            case 59:
                {
                alt40=9;
                }
                break;
            case 58:
                {
                alt40=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalRM.g:5340:3: this_EEqual_0= ruleEEqual
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
                    // InternalRM.g:5349:3: this_EGreaterThan_1= ruleEGreaterThan
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
                    // InternalRM.g:5358:3: this_EGreaterOrEqual_2= ruleEGreaterOrEqual
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
                    // InternalRM.g:5367:3: this_ELessThan_3= ruleELessThan
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
                    // InternalRM.g:5376:3: this_ELessOrEqual_4= ruleELessOrEqual
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
                    // InternalRM.g:5385:3: this_EInRange_5= ruleEInRange
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
                    // InternalRM.g:5394:3: this_EValid_Values_6= ruleEValid_Values
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
                    // InternalRM.g:5403:3: this_ELength_7= ruleELength
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
                    // InternalRM.g:5412:3: this_EMinLength_8= ruleEMinLength
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
                    // InternalRM.g:5421:3: this_EMaxLength_9= ruleEMaxLength
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
    // InternalRM.g:5433:1: entryRuleEMaxLength returns [EObject current=null] : iv_ruleEMaxLength= ruleEMaxLength EOF ;
    public final EObject entryRuleEMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMaxLength = null;


        try {
            // InternalRM.g:5433:51: (iv_ruleEMaxLength= ruleEMaxLength EOF )
            // InternalRM.g:5434:2: iv_ruleEMaxLength= ruleEMaxLength EOF
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
    // InternalRM.g:5440:1: ruleEMaxLength returns [EObject current=null] : (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5446:2: ( (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5447:2: (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5447:2: (otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5448:3: otherlv_0= 'max_length:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEMaxLengthAccess().getMax_lengthKeyword_0());
            		
            // InternalRM.g:5452:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5453:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5453:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5454:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5474:1: entryRuleEMinLength returns [EObject current=null] : iv_ruleEMinLength= ruleEMinLength EOF ;
    public final EObject entryRuleEMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMinLength = null;


        try {
            // InternalRM.g:5474:51: (iv_ruleEMinLength= ruleEMinLength EOF )
            // InternalRM.g:5475:2: iv_ruleEMinLength= ruleEMinLength EOF
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
    // InternalRM.g:5481:1: ruleEMinLength returns [EObject current=null] : (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5487:2: ( (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5488:2: (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5488:2: (otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5489:3: otherlv_0= 'min_length:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEMinLengthAccess().getMin_lengthKeyword_0());
            		
            // InternalRM.g:5493:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5494:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5494:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5495:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5515:1: entryRuleELength returns [EObject current=null] : iv_ruleELength= ruleELength EOF ;
    public final EObject entryRuleELength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELength = null;


        try {
            // InternalRM.g:5515:48: (iv_ruleELength= ruleELength EOF )
            // InternalRM.g:5516:2: iv_ruleELength= ruleELength EOF
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
    // InternalRM.g:5522:1: ruleELength returns [EObject current=null] : (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5528:2: ( (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5529:2: (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5529:2: (otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5530:3: otherlv_0= 'length:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getELengthAccess().getLengthKeyword_0());
            		
            // InternalRM.g:5534:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5535:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5535:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5536:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5556:1: entryRuleEValid_Values returns [EObject current=null] : iv_ruleEValid_Values= ruleEValid_Values EOF ;
    public final EObject entryRuleEValid_Values() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValid_Values = null;


        try {
            // InternalRM.g:5556:54: (iv_ruleEValid_Values= ruleEValid_Values EOF )
            // InternalRM.g:5557:2: iv_ruleEValid_Values= ruleEValid_Values EOF
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
    // InternalRM.g:5563:1: ruleEValid_Values returns [EObject current=null] : (otherlv_0= 'valid_values:' ( (lv_val_1_0= ruleELIST ) ) ) ;
    public final EObject ruleEValid_Values() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:5569:2: ( (otherlv_0= 'valid_values:' ( (lv_val_1_0= ruleELIST ) ) ) )
            // InternalRM.g:5570:2: (otherlv_0= 'valid_values:' ( (lv_val_1_0= ruleELIST ) ) )
            {
            // InternalRM.g:5570:2: (otherlv_0= 'valid_values:' ( (lv_val_1_0= ruleELIST ) ) )
            // InternalRM.g:5571:3: otherlv_0= 'valid_values:' ( (lv_val_1_0= ruleELIST ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_56); 

            			newLeafNode(otherlv_0, grammarAccess.getEValid_ValuesAccess().getValid_valuesKeyword_0());
            		
            // InternalRM.g:5575:3: ( (lv_val_1_0= ruleELIST ) )
            // InternalRM.g:5576:4: (lv_val_1_0= ruleELIST )
            {
            // InternalRM.g:5576:4: (lv_val_1_0= ruleELIST )
            // InternalRM.g:5577:5: lv_val_1_0= ruleELIST
            {

            					newCompositeNode(grammarAccess.getEValid_ValuesAccess().getValELISTParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleELIST();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEValid_ValuesRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.RM.ELIST");
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
    // $ANTLR end "ruleEValid_Values"


    // $ANTLR start "entryRuleELIST"
    // InternalRM.g:5598:1: entryRuleELIST returns [EObject current=null] : iv_ruleELIST= ruleELIST EOF ;
    public final EObject entryRuleELIST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELIST = null;


        try {
            // InternalRM.g:5598:46: (iv_ruleELIST= ruleELIST EOF )
            // InternalRM.g:5599:2: iv_ruleELIST= ruleELIST EOF
            {
             newCompositeNode(grammarAccess.getELISTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELIST=ruleELIST();

            state._fsp--;

             current =iv_ruleELIST; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELIST"


    // $ANTLR start "ruleELIST"
    // InternalRM.g:5605:1: ruleELIST returns [EObject current=null] : (otherlv_0= '[' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleELIST() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRM.g:5611:2: ( (otherlv_0= '[' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ']' ) )
            // InternalRM.g:5612:2: (otherlv_0= '[' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            {
            // InternalRM.g:5612:2: (otherlv_0= '[' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ']' )
            // InternalRM.g:5613:3: otherlv_0= '[' ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getELISTAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalRM.g:5617:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalRM.g:5618:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalRM.g:5618:4: (lv_list_1_0= RULE_STRING )
            // InternalRM.g:5619:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

            					newLeafNode(lv_list_1_0, grammarAccess.getELISTAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getELISTRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRM.g:5635:3: (otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==38) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRM.g:5636:4: otherlv_2= ',' ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getELISTAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRM.g:5640:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalRM.g:5641:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalRM.g:5641:5: (lv_list_3_0= RULE_STRING )
            	    // InternalRM.g:5642:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getELISTAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getELISTRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"list",
            	    							lv_list_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getELISTAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELIST"


    // $ANTLR start "entryRuleEInRange"
    // InternalRM.g:5667:1: entryRuleEInRange returns [EObject current=null] : iv_ruleEInRange= ruleEInRange EOF ;
    public final EObject entryRuleEInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInRange = null;


        try {
            // InternalRM.g:5667:49: (iv_ruleEInRange= ruleEInRange EOF )
            // InternalRM.g:5668:2: iv_ruleEInRange= ruleEInRange EOF
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
    // InternalRM.g:5674:1: ruleEInRange returns [EObject current=null] : (otherlv_0= 'in_range:[' ( (lv_start_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_end_3_0= RULE_STRING ) ) otherlv_4= ']' ) ;
    public final EObject ruleEInRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_start_1_0=null;
        Token otherlv_2=null;
        Token lv_end_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRM.g:5680:2: ( (otherlv_0= 'in_range:[' ( (lv_start_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_end_3_0= RULE_STRING ) ) otherlv_4= ']' ) )
            // InternalRM.g:5681:2: (otherlv_0= 'in_range:[' ( (lv_start_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_end_3_0= RULE_STRING ) ) otherlv_4= ']' )
            {
            // InternalRM.g:5681:2: (otherlv_0= 'in_range:[' ( (lv_start_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_end_3_0= RULE_STRING ) ) otherlv_4= ']' )
            // InternalRM.g:5682:3: otherlv_0= 'in_range:[' ( (lv_start_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_end_3_0= RULE_STRING ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEInRangeAccess().getIn_rangeKeyword_0());
            		
            // InternalRM.g:5686:3: ( (lv_start_1_0= RULE_STRING ) )
            // InternalRM.g:5687:4: (lv_start_1_0= RULE_STRING )
            {
            // InternalRM.g:5687:4: (lv_start_1_0= RULE_STRING )
            // InternalRM.g:5688:5: lv_start_1_0= RULE_STRING
            {
            lv_start_1_0=(Token)match(input,RULE_STRING,FOLLOW_52); 

            					newLeafNode(lv_start_1_0, grammarAccess.getEInRangeAccess().getStartSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEInRangeAccess().getCommaKeyword_2());
            		
            // InternalRM.g:5708:3: ( (lv_end_3_0= RULE_STRING ) )
            // InternalRM.g:5709:4: (lv_end_3_0= RULE_STRING )
            {
            // InternalRM.g:5709:4: (lv_end_3_0= RULE_STRING )
            // InternalRM.g:5710:5: lv_end_3_0= RULE_STRING
            {
            lv_end_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_end_3_0, grammarAccess.getEInRangeAccess().getEndSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEInRangeAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRM.g:5734:1: entryRuleELessOrEqual returns [EObject current=null] : iv_ruleELessOrEqual= ruleELessOrEqual EOF ;
    public final EObject entryRuleELessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessOrEqual = null;


        try {
            // InternalRM.g:5734:53: (iv_ruleELessOrEqual= ruleELessOrEqual EOF )
            // InternalRM.g:5735:2: iv_ruleELessOrEqual= ruleELessOrEqual EOF
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
    // InternalRM.g:5741:1: ruleELessOrEqual returns [EObject current=null] : (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5747:2: ( (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5748:2: (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5748:2: (otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5749:3: otherlv_0= 'less_or_equal:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getELessOrEqualAccess().getLess_or_equalKeyword_0());
            		
            // InternalRM.g:5753:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5754:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5754:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5755:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5775:1: entryRuleELessThan returns [EObject current=null] : iv_ruleELessThan= ruleELessThan EOF ;
    public final EObject entryRuleELessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessThan = null;


        try {
            // InternalRM.g:5775:50: (iv_ruleELessThan= ruleELessThan EOF )
            // InternalRM.g:5776:2: iv_ruleELessThan= ruleELessThan EOF
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
    // InternalRM.g:5782:1: ruleELessThan returns [EObject current=null] : (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5788:2: ( (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5789:2: (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5789:2: (otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5790:3: otherlv_0= 'less_than:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getELessThanAccess().getLess_thanKeyword_0());
            		
            // InternalRM.g:5794:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5795:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5795:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5796:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5816:1: entryRuleEGreaterOrEqual returns [EObject current=null] : iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF ;
    public final EObject entryRuleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterOrEqual = null;


        try {
            // InternalRM.g:5816:56: (iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF )
            // InternalRM.g:5817:2: iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF
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
    // InternalRM.g:5823:1: ruleEGreaterOrEqual returns [EObject current=null] : (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5829:2: ( (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5830:2: (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5830:2: (otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5831:3: otherlv_0= 'greater_or_equal:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterOrEqualAccess().getGreater_or_equalKeyword_0());
            		
            // InternalRM.g:5835:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5836:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5836:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5837:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5857:1: entryRuleEGreaterThan returns [EObject current=null] : iv_ruleEGreaterThan= ruleEGreaterThan EOF ;
    public final EObject entryRuleEGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterThan = null;


        try {
            // InternalRM.g:5857:53: (iv_ruleEGreaterThan= ruleEGreaterThan EOF )
            // InternalRM.g:5858:2: iv_ruleEGreaterThan= ruleEGreaterThan EOF
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
    // InternalRM.g:5864:1: ruleEGreaterThan returns [EObject current=null] : (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5870:2: ( (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5871:2: (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5871:2: (otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5872:3: otherlv_0= 'greater_than:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterThanAccess().getGreater_thanKeyword_0());
            		
            // InternalRM.g:5876:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5877:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5877:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5878:5: lv_val_1_0= RULE_STRING
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
    // InternalRM.g:5898:1: entryRuleEEqual returns [EObject current=null] : iv_ruleEEqual= ruleEEqual EOF ;
    public final EObject entryRuleEEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEqual = null;


        try {
            // InternalRM.g:5898:47: (iv_ruleEEqual= ruleEEqual EOF )
            // InternalRM.g:5899:2: iv_ruleEEqual= ruleEEqual EOF
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
    // InternalRM.g:5905:1: ruleEEqual returns [EObject current=null] : (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRM.g:5911:2: ( (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRM.g:5912:2: (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRM.g:5912:2: (otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRM.g:5913:3: otherlv_0= 'equal:' ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEEqualAccess().getEqualKeyword_0());
            		
            // InternalRM.g:5917:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRM.g:5918:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRM.g:5918:4: (lv_val_1_0= RULE_STRING )
            // InternalRM.g:5919:5: lv_val_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleEPropertyAssignmentValue"
    // InternalRM.g:5939:1: entryRuleEPropertyAssignmentValue returns [EObject current=null] : iv_ruleEPropertyAssignmentValue= ruleEPropertyAssignmentValue EOF ;
    public final EObject entryRuleEPropertyAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyAssignmentValue = null;


        try {
            // InternalRM.g:5939:65: (iv_ruleEPropertyAssignmentValue= ruleEPropertyAssignmentValue EOF )
            // InternalRM.g:5940:2: iv_ruleEPropertyAssignmentValue= ruleEPropertyAssignmentValue EOF
            {
             newCompositeNode(grammarAccess.getEPropertyAssignmentValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPropertyAssignmentValue=ruleEPropertyAssignmentValue();

            state._fsp--;

             current =iv_ruleEPropertyAssignmentValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPropertyAssignmentValue"


    // $ANTLR start "ruleEPropertyAssignmentValue"
    // InternalRM.g:5946:1: ruleEPropertyAssignmentValue returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) ;
    public final EObject ruleEPropertyAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_ELIST_1 = null;

        EObject this_EMAP_2 = null;

        EObject this_EFunction_3 = null;



        	enterRule();

        try {
            // InternalRM.g:5952:2: ( (this_ESTRING_0= ruleESTRING | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) )
            // InternalRM.g:5953:2: (this_ESTRING_0= ruleESTRING | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            {
            // InternalRM.g:5953:2: (this_ESTRING_0= ruleESTRING | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            int alt42=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt42=1;
                }
                break;
            case 62:
                {
                alt42=2;
                }
                break;
            case RULE_START_BLOCK:
                {
                alt42=3;
                }
                break;
            case 46:
            case 47:
            case 51:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalRM.g:5954:3: this_ESTRING_0= ruleESTRING
                    {

                    			newCompositeNode(grammarAccess.getEPropertyAssignmentValueAccess().getESTRINGParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESTRING_0=ruleESTRING();

                    state._fsp--;


                    			current = this_ESTRING_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRM.g:5963:3: this_ELIST_1= ruleELIST
                    {

                    			newCompositeNode(grammarAccess.getEPropertyAssignmentValueAccess().getELISTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELIST_1=ruleELIST();

                    state._fsp--;


                    			current = this_ELIST_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRM.g:5972:3: this_EMAP_2= ruleEMAP
                    {

                    			newCompositeNode(grammarAccess.getEPropertyAssignmentValueAccess().getEMAPParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EMAP_2=ruleEMAP();

                    state._fsp--;


                    			current = this_EMAP_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRM.g:5981:3: this_EFunction_3= ruleEFunction
                    {

                    			newCompositeNode(grammarAccess.getEPropertyAssignmentValueAccess().getEFunctionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFunction_3=ruleEFunction();

                    state._fsp--;


                    			current = this_EFunction_3;
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
    // $ANTLR end "ruleEPropertyAssignmentValue"


    // $ANTLR start "entryRuleESTRING"
    // InternalRM.g:5993:1: entryRuleESTRING returns [EObject current=null] : iv_ruleESTRING= ruleESTRING EOF ;
    public final EObject entryRuleESTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESTRING = null;


        try {
            // InternalRM.g:5993:48: (iv_ruleESTRING= ruleESTRING EOF )
            // InternalRM.g:5994:2: iv_ruleESTRING= ruleESTRING EOF
            {
             newCompositeNode(grammarAccess.getESTRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESTRING=ruleESTRING();

            state._fsp--;

             current =iv_ruleESTRING; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleESTRING"


    // $ANTLR start "ruleESTRING"
    // InternalRM.g:6000:1: ruleESTRING returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleESTRING() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalRM.g:6006:2: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // InternalRM.g:6007:2: ( (lv_string_0_0= RULE_STRING ) )
            {
            // InternalRM.g:6007:2: ( (lv_string_0_0= RULE_STRING ) )
            // InternalRM.g:6008:3: (lv_string_0_0= RULE_STRING )
            {
            // InternalRM.g:6008:3: (lv_string_0_0= RULE_STRING )
            // InternalRM.g:6009:4: lv_string_0_0= RULE_STRING
            {
            lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_string_0_0, grammarAccess.getESTRINGAccess().getStringSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getESTRINGRule());
            				}
            				setWithLastConsumed(
            					current,
            					"string",
            					lv_string_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleESTRING"


    // $ANTLR start "entryRuleEMAP"
    // InternalRM.g:6028:1: entryRuleEMAP returns [EObject current=null] : iv_ruleEMAP= ruleEMAP EOF ;
    public final EObject entryRuleEMAP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMAP = null;


        try {
            // InternalRM.g:6028:45: (iv_ruleEMAP= ruleEMAP EOF )
            // InternalRM.g:6029:2: iv_ruleEMAP= ruleEMAP EOF
            {
             newCompositeNode(grammarAccess.getEMAPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMAP=ruleEMAP();

            state._fsp--;

             current =iv_ruleEMAP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMAP"


    // $ANTLR start "ruleEMAP"
    // InternalRM.g:6035:1: ruleEMAP returns [EObject current=null] : (this_START_BLOCK_0= RULE_START_BLOCK ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_BLOCK_2= RULE_END_BLOCK ) ;
    public final EObject ruleEMAP() throws RecognitionException {
        EObject current = null;

        Token this_START_BLOCK_0=null;
        Token this_END_BLOCK_2=null;
        EObject lv_map_1_0 = null;



        	enterRule();

        try {
            // InternalRM.g:6041:2: ( (this_START_BLOCK_0= RULE_START_BLOCK ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_BLOCK_2= RULE_END_BLOCK ) )
            // InternalRM.g:6042:2: (this_START_BLOCK_0= RULE_START_BLOCK ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_BLOCK_2= RULE_END_BLOCK )
            {
            // InternalRM.g:6042:2: (this_START_BLOCK_0= RULE_START_BLOCK ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_BLOCK_2= RULE_END_BLOCK )
            // InternalRM.g:6043:3: this_START_BLOCK_0= RULE_START_BLOCK ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_BLOCK_2= RULE_END_BLOCK
            {
            this_START_BLOCK_0=(Token)match(input,RULE_START_BLOCK,FOLLOW_43); 

            			newLeafNode(this_START_BLOCK_0, grammarAccess.getEMAPAccess().getSTART_BLOCKTerminalRuleCall_0());
            		
            // InternalRM.g:6047:3: ( (lv_map_1_0= ruleEMapEntry ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRM.g:6048:4: (lv_map_1_0= ruleEMapEntry )
            	    {
            	    // InternalRM.g:6048:4: (lv_map_1_0= ruleEMapEntry )
            	    // InternalRM.g:6049:5: lv_map_1_0= ruleEMapEntry
            	    {

            	    					newCompositeNode(grammarAccess.getEMAPAccess().getMapEMapEntryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_map_1_0=ruleEMapEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEMAPRule());
            	    					}
            	    					add(
            	    						current,
            	    						"map",
            	    						lv_map_1_0,
            	    						"org.sodalite.dsl.RM.EMapEntry");
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

            this_END_BLOCK_2=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_2, grammarAccess.getEMAPAccess().getEND_BLOCKTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMAP"


    // $ANTLR start "entryRuleEMapEntry"
    // InternalRM.g:6074:1: entryRuleEMapEntry returns [EObject current=null] : iv_ruleEMapEntry= ruleEMapEntry EOF ;
    public final EObject entryRuleEMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMapEntry = null;


        try {
            // InternalRM.g:6074:50: (iv_ruleEMapEntry= ruleEMapEntry EOF )
            // InternalRM.g:6075:2: iv_ruleEMapEntry= ruleEMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEMapEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMapEntry=ruleEMapEntry();

            state._fsp--;

             current =iv_ruleEMapEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMapEntry"


    // $ANTLR start "ruleEMapEntry"
    // InternalRM.g:6081:1: ruleEMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEPropertyAssignmentValue ) ) ) ;
    public final EObject ruleEMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalRM.g:6087:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEPropertyAssignmentValue ) ) ) )
            // InternalRM.g:6088:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEPropertyAssignmentValue ) ) )
            {
            // InternalRM.g:6088:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEPropertyAssignmentValue ) ) )
            // InternalRM.g:6089:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEPropertyAssignmentValue ) )
            {
            // InternalRM.g:6089:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalRM.g:6090:4: (lv_key_0_0= RULE_ID )
            {
            // InternalRM.g:6090:4: (lv_key_0_0= RULE_ID )
            // InternalRM.g:6091:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_58); 

            					newLeafNode(lv_key_0_0, grammarAccess.getEMapEntryAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEMapEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getEMapEntryAccess().getColonKeyword_1());
            		
            // InternalRM.g:6111:3: ( (lv_value_2_0= ruleEPropertyAssignmentValue ) )
            // InternalRM.g:6112:4: (lv_value_2_0= ruleEPropertyAssignmentValue )
            {
            // InternalRM.g:6112:4: (lv_value_2_0= ruleEPropertyAssignmentValue )
            // InternalRM.g:6113:5: lv_value_2_0= ruleEPropertyAssignmentValue
            {

            					newCompositeNode(grammarAccess.getEMapEntryAccess().getValueEPropertyAssignmentValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEPropertyAssignmentValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEMapEntryRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.sodalite.dsl.RM.EPropertyAssignmentValue");
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
    // $ANTLR end "ruleEMapEntry"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000FE0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000F000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000F000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xBC00000000000020L,0x000000000000001FL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000033000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000033000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000004B000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000004B000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000183000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000183000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000003000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000E4B000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000E4B000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000124B000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000124B000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000F8006000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000F8006000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008C00000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000088002000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000088002000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008180000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008180000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100082000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100082000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000228000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000228000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0007000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0007000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0016000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0016000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x006000804A000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x006000804A000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xBC00000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x4008C00000000050L});

}
